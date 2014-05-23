package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;

@JacksonStdImpl
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>>
{
  public IndexedListSerializer(JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, BeanProperty paramBeanProperty, JsonSerializer<Object> paramJsonSerializer)
  {
    super(List.class, paramJavaType, paramBoolean, paramTypeSerializer, paramBeanProperty, paramJsonSerializer);
  }

  public IndexedListSerializer(IndexedListSerializer paramIndexedListSerializer, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramIndexedListSerializer, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }

  public final ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new IndexedListSerializer(this._elementType, this._staticTyping, paramTypeSerializer, this._property, this._elementSerializer);
  }

  public final boolean hasSingleElement(List<?> paramList)
  {
    return paramList.size() == 1;
  }

  public final boolean isEmpty(List<?> paramList)
  {
    return (paramList == null) || (paramList.isEmpty());
  }

  public final void serializeContents(List<?> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._elementSerializer != null)
      serializeContentsUsing(paramList, paramJsonGenerator, paramSerializerProvider, this._elementSerializer);
    int i;
    do
    {
      return;
      if (this._valueTypeSerializer != null)
      {
        serializeTypedContents(paramList, paramJsonGenerator, paramSerializerProvider);
        return;
      }
      i = paramList.size();
    }
    while (i == 0);
    for (int j = 0; ; j++)
    {
      Object localObject1;
      try
      {
        localObject1 = this._dynamicSerializers;
        if (j >= i)
          break;
        localObject2 = paramList.get(j);
        if (localObject2 == null)
        {
          paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        }
        else
        {
          localClass = localObject2.getClass();
          localObject3 = ((PropertySerializerMap)localObject1).serializerFor(localClass);
          if (localObject3 == null)
          {
            if (this._elementType.hasGenericTypes())
            {
              localObject4 = _findAndAddDynamic((PropertySerializerMap)localObject1, paramSerializerProvider.constructSpecializedType(this._elementType, localClass), paramSerializerProvider);
              localPropertySerializerMap = this._dynamicSerializers;
              localObject5 = localObject4;
              localObject1 = localPropertySerializerMap;
              localObject3 = localObject5;
            }
          }
          else
            ((JsonSerializer)localObject3).serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
        }
      }
      catch (Exception localException)
      {
        wrapAndThrow(paramSerializerProvider, localException, paramList, j);
        return;
      }
      while (true)
      {
        Object localObject2;
        Class localClass;
        Object localObject3;
        PropertySerializerMap localPropertySerializerMap;
        Object localObject5;
        JsonSerializer localJsonSerializer = _findAndAddDynamic((PropertySerializerMap)localObject1, localClass, paramSerializerProvider);
        Object localObject4 = localJsonSerializer;
      }
    }
  }

  public final void serializeContentsUsing(List<?> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    int i = paramList.size();
    if (i == 0);
    while (true)
    {
      return;
      TypeSerializer localTypeSerializer = this._valueTypeSerializer;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramList.get(j);
        if (localObject == null)
          try
          {
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
            continue;
            if (localTypeSerializer == null)
              paramJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
          }
          catch (Exception localException)
          {
            wrapAndThrow(paramSerializerProvider, localException, paramList, j);
          }
        paramJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
      }
    }
  }

  public final void serializeTypedContents(List<?> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    int i = paramList.size();
    if (i == 0)
      return;
    for (int j = 0; ; j++)
    {
      Object localObject1;
      try
      {
        TypeSerializer localTypeSerializer = this._valueTypeSerializer;
        localObject1 = this._dynamicSerializers;
        if (j >= i)
          break;
        localObject2 = paramList.get(j);
        if (localObject2 == null)
        {
          paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        }
        else
        {
          localClass = localObject2.getClass();
          localObject3 = ((PropertySerializerMap)localObject1).serializerFor(localClass);
          if (localObject3 == null)
          {
            if (this._elementType.hasGenericTypes())
            {
              localObject4 = _findAndAddDynamic((PropertySerializerMap)localObject1, paramSerializerProvider.constructSpecializedType(this._elementType, localClass), paramSerializerProvider);
              localPropertySerializerMap = this._dynamicSerializers;
              localObject5 = localObject4;
              localObject1 = localPropertySerializerMap;
              localObject3 = localObject5;
            }
          }
          else
            ((JsonSerializer)localObject3).serializeWithType(localObject2, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
        }
      }
      catch (Exception localException)
      {
        wrapAndThrow(paramSerializerProvider, localException, paramList, j);
        return;
      }
      while (true)
      {
        Object localObject2;
        Class localClass;
        Object localObject3;
        PropertySerializerMap localPropertySerializerMap;
        Object localObject5;
        JsonSerializer localJsonSerializer = _findAndAddDynamic((PropertySerializerMap)localObject1, localClass, paramSerializerProvider);
        Object localObject4 = localJsonSerializer;
      }
    }
  }

  public final IndexedListSerializer withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    return new IndexedListSerializer(this, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
