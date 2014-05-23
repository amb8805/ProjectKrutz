package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public abstract class PropertySerializerMap
{
  public PropertySerializerMap()
  {
  }

  public static PropertySerializerMap emptyMap()
  {
    return PropertySerializerMap.Empty.instance;
  }

  public final PropertySerializerMap.SerializerAndMapResult findAndAddSerializer(JavaType paramJavaType, SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = paramSerializerProvider.findValueSerializer(paramJavaType, paramBeanProperty);
    return new PropertySerializerMap.SerializerAndMapResult(localJsonSerializer, newWith(paramJavaType.getRawClass(), localJsonSerializer));
  }

  public final PropertySerializerMap.SerializerAndMapResult findAndAddSerializer(Class<?> paramClass, SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = paramSerializerProvider.findValueSerializer(paramClass, paramBeanProperty);
    return new PropertySerializerMap.SerializerAndMapResult(localJsonSerializer, newWith(paramClass, localJsonSerializer));
  }

  public abstract PropertySerializerMap newWith(Class<?> paramClass, JsonSerializer<Object> paramJsonSerializer);

  public abstract JsonSerializer<Object> serializerFor(Class<?> paramClass);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
