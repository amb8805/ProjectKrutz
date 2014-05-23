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
import java.util.Iterator;

@JacksonStdImpl
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>>
{
  public IteratorSerializer(JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, BeanProperty paramBeanProperty)
  {
    super(Iterator.class, paramJavaType, paramBoolean, paramTypeSerializer, paramBeanProperty, null);
  }

  public IteratorSerializer(IteratorSerializer paramIteratorSerializer, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramIteratorSerializer, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }

  public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new IteratorSerializer(this._elementType, this._staticTyping, paramTypeSerializer, this._property);
  }

  public boolean hasSingleElement(Iterator<?> paramIterator)
  {
    return false;
  }

  public boolean isEmpty(Iterator<?> paramIterator)
  {
    return (paramIterator == null) || (!paramIterator.hasNext());
  }

  public void serializeContents(Iterator<?> paramIterator, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject1 = null;
    TypeSerializer localTypeSerializer;
    JsonSerializer localJsonSerializer1;
    if (paramIterator.hasNext())
    {
      localTypeSerializer = this._valueTypeSerializer;
      localJsonSerializer1 = null;
    }
    while (true)
    {
      Object localObject2 = paramIterator.next();
      if (localObject2 == null)
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      while (!paramIterator.hasNext())
      {
        return;
        Class localClass = localObject2.getClass();
        if (localClass == localObject1);
        for (JsonSerializer localJsonSerializer2 = localJsonSerializer1; ; localJsonSerializer2 = localJsonSerializer1)
        {
          if (localTypeSerializer != null)
            break label107;
          localJsonSerializer2.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
          break;
          localJsonSerializer1 = paramSerializerProvider.findValueSerializer(localClass, this._property);
          localObject1 = localClass;
        }
        label107: localJsonSerializer2.serializeWithType(localObject2, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
      }
    }
  }

  public IteratorSerializer withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    return new IteratorSerializer(this, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
