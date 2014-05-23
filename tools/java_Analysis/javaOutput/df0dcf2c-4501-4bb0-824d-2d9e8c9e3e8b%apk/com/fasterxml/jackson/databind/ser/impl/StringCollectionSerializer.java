package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.Collection;
import java.util.Iterator;

@JacksonStdImpl
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>>
  implements ContextualSerializer
{
  public static final StringCollectionSerializer instance = new StringCollectionSerializer();
  protected final JsonSerializer<String> _serializer;

  protected StringCollectionSerializer()
  {
    this(null);
  }

  protected StringCollectionSerializer(JsonSerializer<?> paramJsonSerializer)
  {
    super(Collection.class);
    this._serializer = paramJsonSerializer;
  }

  private final void serializeContents(Collection<String> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._serializer != null)
      serializeUsingCustom(paramCollection, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      return;
      Iterator localIterator = paramCollection.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str == null)
          try
          {
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
            break label85;
            paramJsonGenerator.writeString(str);
          }
          catch (Exception localException)
          {
            wrapAndThrow(paramSerializerProvider, localException, paramCollection, i);
          }
        else
          continue;
        label85: i++;
      }
    }
  }

  private void serializeUsingCustom(Collection<String> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    JsonSerializer localJsonSerializer = this._serializer;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str == null)
        try
        {
          paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        }
        catch (Exception localException)
        {
          wrapAndThrow(paramSerializerProvider, localException, paramCollection, 0);
        }
      else
        localJsonSerializer.serialize(str, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    AnnotatedMember localAnnotatedMember;
    Object localObject;
    if (paramBeanProperty != null)
    {
      localAnnotatedMember = paramBeanProperty.getMember();
      if (localAnnotatedMember != null)
      {
        localObject = paramSerializerProvider.getAnnotationIntrospector().findContentSerializer(localAnnotatedMember);
        if (localObject == null);
      }
    }
    for (JsonSerializer localJsonSerializer = paramSerializerProvider.serializerInstance(localAnnotatedMember, localObject); ; localJsonSerializer = null)
    {
      if (localJsonSerializer == null)
        localJsonSerializer = this._serializer;
      if (localJsonSerializer == null)
        localJsonSerializer = paramSerializerProvider.findValueSerializer(String.class, paramBeanProperty);
      while (true)
      {
        if (isDefaultSerializer(localJsonSerializer))
          localJsonSerializer = null;
        if (localJsonSerializer != this._serializer)
          break;
        return this;
        if ((localJsonSerializer instanceof ContextualSerializer))
          localJsonSerializer = ((ContextualSerializer)localJsonSerializer).createContextual(paramSerializerProvider, paramBeanProperty);
      }
      return new StringCollectionSerializer(localJsonSerializer);
    }
  }

  public void serialize(Collection<String> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartArray();
    if (this._serializer == null)
      serializeContents(paramCollection, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramJsonGenerator.writeEndArray();
      return;
      serializeUsingCustom(paramCollection, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public void serializeWithType(Collection<String> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForArray(paramCollection, paramJsonGenerator);
    if (this._serializer == null)
      serializeContents(paramCollection, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramTypeSerializer.writeTypeSuffixForArray(paramCollection, paramJsonGenerator);
      return;
      serializeUsingCustom(paramCollection, paramJsonGenerator, paramSerializerProvider);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
