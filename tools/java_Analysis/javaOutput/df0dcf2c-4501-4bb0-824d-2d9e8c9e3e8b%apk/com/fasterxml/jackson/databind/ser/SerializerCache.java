package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import java.util.HashMap;

public final class SerializerCache
{
  private ReadOnlyClassToSerializerMap _readOnlyMap = null;
  private HashMap<SerializerCache.TypeKey, JsonSerializer<Object>> _sharedMap = new HashMap(64);

  public SerializerCache()
  {
  }

  public final void addAndResolveNonTypedSerializer(JavaType paramJavaType, JsonSerializer<Object> paramJsonSerializer, SerializerProvider paramSerializerProvider)
  {
    try
    {
      if (this._sharedMap.put(new SerializerCache.TypeKey(paramJavaType, false), paramJsonSerializer) == null)
        this._readOnlyMap = null;
      if ((paramJsonSerializer instanceof ResolvableSerializer))
        ((ResolvableSerializer)paramJsonSerializer).resolve(paramSerializerProvider);
      return;
    }
    finally
    {
    }
  }

  public final void addAndResolveNonTypedSerializer(Class<?> paramClass, JsonSerializer<Object> paramJsonSerializer, SerializerProvider paramSerializerProvider)
  {
    try
    {
      if (this._sharedMap.put(new SerializerCache.TypeKey(paramClass, false), paramJsonSerializer) == null)
        this._readOnlyMap = null;
      if ((paramJsonSerializer instanceof ResolvableSerializer))
        ((ResolvableSerializer)paramJsonSerializer).resolve(paramSerializerProvider);
      return;
    }
    finally
    {
    }
  }

  public final void addTypedSerializer(JavaType paramJavaType, JsonSerializer<Object> paramJsonSerializer)
  {
    try
    {
      if (this._sharedMap.put(new SerializerCache.TypeKey(paramJavaType, true), paramJsonSerializer) == null)
        this._readOnlyMap = null;
      return;
    }
    finally
    {
    }
  }

  public final void addTypedSerializer(Class<?> paramClass, JsonSerializer<Object> paramJsonSerializer)
  {
    try
    {
      if (this._sharedMap.put(new SerializerCache.TypeKey(paramClass, true), paramJsonSerializer) == null)
        this._readOnlyMap = null;
      return;
    }
    finally
    {
    }
  }

  public final ReadOnlyClassToSerializerMap getReadOnlyLookupMap()
  {
    try
    {
      ReadOnlyClassToSerializerMap localReadOnlyClassToSerializerMap = this._readOnlyMap;
      if (localReadOnlyClassToSerializerMap == null)
      {
        localReadOnlyClassToSerializerMap = ReadOnlyClassToSerializerMap.from(this._sharedMap);
        this._readOnlyMap = localReadOnlyClassToSerializerMap;
      }
      return localReadOnlyClassToSerializerMap.instance();
    }
    finally
    {
    }
  }

  public final JsonSerializer<Object> typedValueSerializer(JavaType paramJavaType)
  {
    try
    {
      JsonSerializer localJsonSerializer = (JsonSerializer)this._sharedMap.get(new SerializerCache.TypeKey(paramJavaType, true));
      return localJsonSerializer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final JsonSerializer<Object> typedValueSerializer(Class<?> paramClass)
  {
    try
    {
      JsonSerializer localJsonSerializer = (JsonSerializer)this._sharedMap.get(new SerializerCache.TypeKey(paramClass, true));
      return localJsonSerializer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final JsonSerializer<Object> untypedValueSerializer(JavaType paramJavaType)
  {
    try
    {
      JsonSerializer localJsonSerializer = (JsonSerializer)this._sharedMap.get(new SerializerCache.TypeKey(paramJavaType, false));
      return localJsonSerializer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final JsonSerializer<Object> untypedValueSerializer(Class<?> paramClass)
  {
    try
    {
      JsonSerializer localJsonSerializer = (JsonSerializer)this._sharedMap.get(new SerializerCache.TypeKey(paramClass, false));
      return localJsonSerializer;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.SerializerCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
