package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;

@JacksonStdImpl
public class StringArraySerializer extends ArraySerializerBase<String[]>
  implements ContextualSerializer
{
  private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
  public static final StringArraySerializer instance = new StringArraySerializer();
  protected final JsonSerializer<Object> _elementSerializer;

  protected StringArraySerializer()
  {
    super([Ljava.lang.String.class, null);
    this._elementSerializer = null;
  }

  public StringArraySerializer(StringArraySerializer paramStringArraySerializer, BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramStringArraySerializer, paramBeanProperty);
    this._elementSerializer = paramJsonSerializer;
  }

  private void serializeContentsSlow(String[] paramArrayOfString, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    int i = 0;
    int j = paramArrayOfString.length;
    if (i < j)
    {
      if (paramArrayOfString[i] == null)
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      while (true)
      {
        i++;
        break;
        paramJsonSerializer.serialize(paramArrayOfString[i], paramJsonGenerator, paramSerializerProvider);
      }
    }
  }

  public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return this;
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
        localJsonSerializer = this._elementSerializer;
      if (localJsonSerializer == null)
        localJsonSerializer = paramSerializerProvider.findValueSerializer(String.class, paramBeanProperty);
      while (true)
      {
        if (isDefaultSerializer(localJsonSerializer))
          localJsonSerializer = null;
        if (localJsonSerializer != this._elementSerializer)
          break;
        return this;
        if ((localJsonSerializer instanceof ContextualSerializer))
          localJsonSerializer = ((ContextualSerializer)localJsonSerializer).createContextual(paramSerializerProvider, paramBeanProperty);
      }
      return new StringArraySerializer(this, paramBeanProperty, localJsonSerializer);
    }
  }

  public boolean hasSingleElement(String[] paramArrayOfString)
  {
    return paramArrayOfString.length == 1;
  }

  public boolean isEmpty(String[] paramArrayOfString)
  {
    return (paramArrayOfString == null) || (paramArrayOfString.length == 0);
  }

  public void serializeContents(String[] paramArrayOfString, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    int i = paramArrayOfString.length;
    if (i == 0)
      return;
    if (this._elementSerializer != null)
    {
      serializeContentsSlow(paramArrayOfString, paramJsonGenerator, paramSerializerProvider, this._elementSerializer);
      return;
    }
    int j = 0;
    label32: if (j < i)
    {
      if (paramArrayOfString[j] != null)
        break label56;
      paramJsonGenerator.writeNull();
    }
    while (true)
    {
      j++;
      break label32;
      break;
      label56: paramJsonGenerator.writeString(paramArrayOfString[j]);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
