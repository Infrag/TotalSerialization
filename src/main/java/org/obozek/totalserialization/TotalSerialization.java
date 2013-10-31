package org.obozek.totalserialization;

import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Ondrej.Bozek
 */
public interface TotalSerialization
{

    public boolean addIgnoredClass(Class<?> clazz);

    public boolean removeIgnoredClass(Class<?> clazz);

    public SerializedObjectWrapper serializeObjectWithClass(Object object)
            throws IllegalAccessException, IOException;

    public Collection<Object> deSerialize(Collection<SerializedObjectWrapper> objectWraper);
}
