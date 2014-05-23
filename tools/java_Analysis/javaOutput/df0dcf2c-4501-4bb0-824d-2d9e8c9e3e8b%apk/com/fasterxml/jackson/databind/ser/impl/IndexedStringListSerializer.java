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
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>>
  implements ContextualSerializer
{
  public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
  protected final JsonSerializer<String> _serializer;

  protected IndexedStringListSerializer()
  {
    this(null);
  }

  public IndexedStringListSerializer(JsonSerializer<?> paramJsonSerializer)
  {
    super(List.class);
    this._serializer = paramJsonSerializer;
  }

  private final void serializeContents(List<String> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        int j = paramList.size();
        if (i < j)
        {
          String str = (String)paramList.get(i);
          if (str == null)
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
          else
            paramJsonGenerator.writeString(str);
        }
      }
      catch (Exception localException)
      {
        wrapAndThrow(paramSerializerProvider, localException, paramList, i);
      }
      return;
    }
  }

  private final void serializeUsingCustom(List<String> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        int j = paramList.size();
        JsonSerializer localJsonSerializer = this._serializer;
        if (i < j)
        {
          String str = (String)paramList.get(i);
          if (str == null)
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
          else
            localJsonSerializer.serialize(str, paramJsonGenerator, paramSerializerProvider);
        }
      }
      catch (Exception localException)
      {
        wrapAndThrow(paramSerializerProvider, localException, paramList, i);
      }
      return;
    }
  }

  public final JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
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
      return new IndexedStringListSerializer(localJsonSerializer);
    }
  }

  public final void serialize(List<String> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartArray();
    if (this._serializer == null)
      serializeContents(paramList, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramJsonGenerator.writeEndArray();
      return;
      serializeUsingCustom(paramList, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public final void serializeWithType(List<String> paramList, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForArray(paramList, paramJsonGenerator);
    if (this._serializer == null)
      serializeContents(paramList, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramTypeSerializer.writeTypeSuffixForArray(paramList, paramJsonGenerator);
      return;
      serializeUsingCustom(paramList, paramJsonGenerator, paramSerializerProvider);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
