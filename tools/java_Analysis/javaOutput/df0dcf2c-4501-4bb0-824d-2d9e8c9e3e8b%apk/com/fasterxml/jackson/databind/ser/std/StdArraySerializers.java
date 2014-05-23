package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;

public class StdArraySerializers
{
  protected static final HashMap<String, JsonSerializer<?>> _arraySerializers;

  static
  {
    HashMap localHashMap = new HashMap();
    _arraySerializers = localHashMap;
    localHashMap.put([Z.class.getName(), new StdArraySerializers.BooleanArraySerializer());
    _arraySerializers.put([B.class.getName(), new StdArraySerializers.ByteArraySerializer());
    _arraySerializers.put([C.class.getName(), new StdArraySerializers.CharArraySerializer());
    _arraySerializers.put([S.class.getName(), new StdArraySerializers.ShortArraySerializer());
    _arraySerializers.put([I.class.getName(), new StdArraySerializers.IntArraySerializer());
    _arraySerializers.put([J.class.getName(), new StdArraySerializers.LongArraySerializer());
    _arraySerializers.put([F.class.getName(), new StdArraySerializers.FloatArraySerializer());
    _arraySerializers.put([D.class.getName(), new StdArraySerializers.DoubleArraySerializer());
  }

  public static JsonSerializer<?> findStandardImpl(Class<?> paramClass)
  {
    return (JsonSerializer)_arraySerializers.get(paramClass.getName());
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.StdArraySerializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
