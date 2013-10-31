package org.obozek.totalserialization;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ondrej.Bozek
 */
public class ByteClassLoader extends URLClassLoader {

    private final Map<String, byte[]> extraClassDefs;

    public ByteClassLoader(ClassLoader parent, Map<String, byte[]> extraClassDefs) {
        this(null, parent, extraClassDefs);
    }

    public ByteClassLoader(URL[] urls, ClassLoader parent, Map<String, byte[]> extraClassDefs) {
        super(checkUrls(urls), parent);
        this.extraClassDefs = new HashMap<String, byte[]>(extraClassDefs);
    }

    private static URL[] checkUrls(URL[] urls) {
        if (urls == null) {
            urls = new URL[1];
            try {
                urls[0] = new URL("http://localhost:9000");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return urls;
    }

    @Override
    protected Class<?> findClass(final String name) throws ClassNotFoundException {

        byte[] classBytes = this.extraClassDefs.remove(name);
        if (classBytes != null) {
            return defineClass(name, classBytes, 0, classBytes.length);
        }
        return super.findClass(name);
    }
}
