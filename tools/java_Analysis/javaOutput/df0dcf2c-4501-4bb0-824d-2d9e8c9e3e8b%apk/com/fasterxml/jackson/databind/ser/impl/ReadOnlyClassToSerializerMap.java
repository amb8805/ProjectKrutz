package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import java.util.HashMap;

public final class ReadOnlyClassToSerializerMap
{
  protected SerializerCache.TypeKey _cacheKey = null;
  protected final JsonSerializerMap _map;

  private ReadOnlyClassToSerializerMap(JsonSerializerMap paramJsonSerializerMap)
  {
    this._map = paramJsonSerializerMap;
  }

  public static ReadOnlyClassToSerializerMap from(HashMap<SerializerCache.TypeKey, JsonSerializer<Object>> paramHashMap)
  {
    return new ReadOnlyClassToSerializerMap(new JsonSerializerMap(paramHashMap));
  }

  public final ReadOnlyClassToSerializerMap instance()
  {
    return new ReadOnlyClassToSerializerMap(this._map);
  }

  public final JsonSerializer<Object> typedValueSerializer(JavaType paramJavaType)
  {
    if (this._cacheKey == null)
      this._cacheKey = new SerializerCache.TypeKey(paramJavaType, true);
    while (true)
    {
      return this._map.find(this._cacheKey);
      this._cacheKey.resetTyped(paramJavaType);
    }
  }

  public final JsonSerializer<Object> typedValueSerializer(Class<?> paramClass)
  {
    if (this._cacheKey == null)
      this._cacheKey = new SerializerCache.TypeKey(paramClass, true);
    while (true)
    {
      return this._map.find(this._cacheKey);
      this._cacheKey.resetTyped(paramClass);
    }
  }

  public final JsonSerializer<Object> untypedValueSerializer(JavaType paramJavaType)
  {
    if (this._cacheKey == null)
      this._cacheKey = new SerializerCache.TypeKey(paramJavaType, false);
    while (true)
    {
      return this._map.find(this._cacheKey);
      this._cacheKey.resetUntyped(paramJavaType);
    }
  }

  public final JsonSerializer<Object> untypedValueSerializer(Class<?> paramClass)
  {
    if (this._cacheKey == null)
      this._cacheKey = new SerializerCache.TypeKey(paramClass, false);
    while (true)
    {
      return this._map.find(this._cacheKey);
      this._cacheKey.resetUntyped(paramClass);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
