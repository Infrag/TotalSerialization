package org.obozek.totalserialization;

import java.util.Map;

/**
 *
 * @author Ondrej.bozek
 */
public class SerializedObjectWrapper {

    private byte[] serializedObject;
    private Map<String, byte[]> classes;

    public byte[] getSerializedObject() {
        return serializedObject;
    }

    public void setSerializedObject(byte[] serializedObject) {
        this.serializedObject = serializedObject;
    }

    public Map<String, byte[]> getClasses() {
        return classes;
    }

    public void setClasses(Map<String, byte[]> classes) {
        this.classes = classes;
    }

}
