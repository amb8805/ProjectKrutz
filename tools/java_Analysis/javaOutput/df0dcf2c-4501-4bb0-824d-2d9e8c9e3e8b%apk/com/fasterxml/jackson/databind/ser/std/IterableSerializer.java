package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Iterator;

@JacksonStdImpl
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>>
{
  public IterableSerializer(JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, BeanProperty paramBeanProperty)
  {
    super(Iterable.class, paramJavaType, paramBoolean, paramTypeSerializer, paramBeanProperty, null);
  }

  public IterableSerializer(IterableSerializer paramIterableSerializer, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramIterableSerializer, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }

  public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new IterableSerializer(this._elementType, this._staticTyping, paramTypeSerializer, this._property);
  }

  public boolean hasSingleElement(Iterable<?> paramIterable)
  {
    return false;
  }

  public boolean isEmpty(Iterable<?> paramIterable)
  {
    return (paramIterable == null) || (!paramIterable.iterator().hasNext());
  }

  public void serializeContents(Iterable<?> paramIterable, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject1 = null;
    Iterator localIterator = paramIterable.iterator();
    TypeSerializer localTypeSerializer;
    JsonSerializer localJsonSerializer1;
    if (localIterator.hasNext())
    {
      localTypeSerializer = this._valueTypeSerializer;
      localJsonSerializer1 = null;
    }
    while (true)
    {
      Object localObject2 = localIterator.next();
      if (localObject2 == null)
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      while (!localIterator.hasNext())
      {
        return;
        Class localClass = localObject2.getClass();
        if (localClass == localObject1);
        for (JsonSerializer localJsonSerializer2 = localJsonSerializer1; ; localJsonSerializer2 = localJsonSerializer1)
        {
          if (localTypeSerializer != null)
            break label118;
          localJsonSerializer2.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
          break;
          localJsonSerializer1 = paramSerializerProvider.findValueSerializer(localClass, this._property);
          localObject1 = localClass;
        }
        label118: localJsonSerializer2.serializeWithType(localObject2, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
      }
    }
  }

  public IterableSerializer withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    return new IterableSerializer(this, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.IterableSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
