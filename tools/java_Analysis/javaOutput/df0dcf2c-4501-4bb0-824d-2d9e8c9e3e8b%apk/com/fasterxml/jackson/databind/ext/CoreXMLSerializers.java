package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLSerializers
  implements Provider<Map.Entry<Class<?>, JsonSerializer<?>>>
{
  static final HashMap<Class<?>, JsonSerializer<?>> _serializers = new HashMap();

  static
  {
    ToStringSerializer localToStringSerializer = ToStringSerializer.instance;
    _serializers.put(Duration.class, localToStringSerializer);
    _serializers.put(XMLGregorianCalendar.class, new CoreXMLSerializers.XMLGregorianCalendarSerializer());
    _serializers.put(QName.class, localToStringSerializer);
  }

  public Collection<Map.Entry<Class<?>, JsonSerializer<?>>> provide()
  {
    return _serializers.entrySet();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ext.CoreXMLSerializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
