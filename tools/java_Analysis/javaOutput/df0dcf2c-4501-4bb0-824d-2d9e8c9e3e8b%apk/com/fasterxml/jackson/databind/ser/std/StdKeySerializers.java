package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Calendar;
import java.util.Date;

public class StdKeySerializers
{
  protected static final JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
  protected static final JsonSerializer<Object> DEFAULT_STRING_SERIALIZER = new StdKeySerializers.StringKeySerializer();

  public static JsonSerializer<Object> getStdKeySerializer(JavaType paramJavaType)
  {
    if (paramJavaType == null)
      return DEFAULT_KEY_SERIALIZER;
    Class localClass = paramJavaType.getRawClass();
    if (localClass == String.class)
      return DEFAULT_STRING_SERIALIZER;
    if (localClass == Object.class)
      return DEFAULT_KEY_SERIALIZER;
    if (Date.class.isAssignableFrom(localClass))
      return StdKeySerializers.DateKeySerializer.instance;
    if (Calendar.class.isAssignableFrom(localClass))
      return StdKeySerializers.CalendarKeySerializer.instance;
    return DEFAULT_KEY_SERIALIZER;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.StdKeySerializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
