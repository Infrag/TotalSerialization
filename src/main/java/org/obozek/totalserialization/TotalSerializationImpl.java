package org.obozek.totalserialization;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ondrej.Bozek
 */
public class TotalSerializationImpl implements TotalSerialization {

    private static final Set<Class<?>> IGNORED_CLASSES = new HashSet<Class<?>>();

    static {
        // primitive types
        IGNORED_CLASSES.add(Long.TYPE);
        IGNORED_CLASSES.add(Integer.TYPE);
        IGNORED_CLASSES.add(Character.TYPE);
        IGNORED_CLASSES.add(Short.TYPE);
        IGNORED_CLASSES.add(Byte.TYPE);
        IGNORED_CLASSES.add(Double.TYPE);
        IGNORED_CLASSES.add(Float.TYPE);

        // Object types
        IGNORED_CLASSES.add(Object.class);
        IGNORED_CLASSES.add(String.class);
        IGNORED_CLASSES.add(Date.class);
        IGNORED_CLASSES.add(Long.class);
        IGNORED_CLASSES.add(Integer.class);
        IGNORED_CLASSES.add(Character.class);
        IGNORED_CLASSES.add(Short.class);
        IGNORED_CLASSES.add(Byte.class);
        IGNORED_CLASSES.add(Double.class);
        IGNORED_CLASSES.add(Float.class);
        IGNORED_CLASSES.add(BigDecimal.class);
        IGNORED_CLASSES.add(BigInteger.class);
    }

    @Override
    public boolean addIgnoredClass(Class<?> clazz) {
        return IGNORED_CLASSES.add(clazz);
    }

    @Override
    public boolean removeIgnoredClass(Class<?> clazz) {
        return IGNORED_CLASSES.remove(clazz);
    }

    @Override
    public SerializedObjectWrapper serializeObjectWithClass(Object object)
            throws IllegalAccessException, IOException {
        SerializedObjectWrapper result = new SerializedObjectWrapper();
        result.setSerializedObject(serialize(object));
        if (object instanceof Iterable) {
            Iterable it = (Iterable) object;
            for (Object object1 : it) {
                result.getClasses().putAll(serializeClasses(object1));
            }
        } else {
            result.getClasses().putAll(serializeClasses(object));
        }
        return result;
    }

    private Map<String, byte[]> serializeClasses(Object object)
            throws IllegalAccessException, IOException {
        Map<String, byte[]> result = new HashMap<String, byte[]>();
        List<Class<?>> fields = new ArrayList<Class<?>>();
        fields = getInheritedPrivateFields(object, fields);
        for (Class<?> class1 : fields) {
            result.put(class1.getName(), getClassBytes(class1));
        }
        return result;
    }

    private static boolean notIgnored(Field field) {
        return !IGNORED_CLASSES.contains(field.getType());
    }

    private static List<Class<?>> getInheritedPrivateFields(Object object, List<Class<?>> classes) throws IllegalAccessException {
        Class<?> i = object.getClass();
        while (i != null && i != Object.class) {
            for (Field field : i.getDeclaredFields()) {
                if (!field.isSynthetic() && notIgnored(field)) {
                    field.setAccessible(true);
                    Object fieldValue = field.get(object);
                    if (fieldValue instanceof Iterable) {
                        for (Object obj : (Iterable) fieldValue) {
                            classes.add(obj.getClass());
                            getInheritedPrivateFields(obj, classes);
                        }
                    } else {
                        classes.add(fieldValue.getClass());
                        getInheritedPrivateFields(fieldValue, classes);
                    }
                }
            }
            i = i.getSuperclass();
        }
        return classes;
    }

    private byte[] serialize(Object object) {
        byte[] results = null;
        if (object != null) {
            Kryo kryo = new Kryo();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Output output = new Output(baos);
            kryo.writeClassAndObject(output, object);
            output.flush();
            results = baos.toByteArray();
            output.close();
        }
        return results;
    }

    private byte[] getClassBytes(Class<?> clazz) throws IOException {
        InputStream is = clazz.getResourceAsStream(clazz.getSimpleName() + ".class");
        int nRead;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] data = new byte[16384];

        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        byte[] byteClass = buffer.toByteArray();
        return byteClass;
    }

    @Override
    public Collection<Object> deSerialize(Collection<SerializedObjectWrapper> objectWraper) {
        List<Object> results = new ArrayList<Object>();
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        for (SerializedObjectWrapper serializedObjectWrapper : objectWraper) {
            classes.putAll(serializedObjectWrapper.getClasses());
        }
        if (!classes.isEmpty()) {
            Kryo kryo = new Kryo();
            ByteClassLoader bcl = new ByteClassLoader(this.getClass().getClassLoader(), classes);
            kryo.setClassLoader(bcl);
            for (SerializedObjectWrapper wrapper : objectWraper) {
                SerializedObjectWrapper objectParameterBean = wrapper;
                Input input = new Input(new ByteArrayInputStream(objectParameterBean.getSerializedObject()));
                Object object = kryo.readClassAndObject(input);
                input.close();
                results.add(object);
            }
        }
        return results;
    }
}
