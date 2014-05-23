package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

@JacksonStdImpl
public class EnumMapSerializer extends ContainerSerializer<EnumMap<? extends Enum<?>, ?>>
  implements ContextualSerializer
{
  protected final EnumValues _keyEnums;
  protected final BeanProperty _property;
  protected final boolean _staticTyping;
  protected final JsonSerializer<Object> _valueSerializer;
  protected final JavaType _valueType;
  protected final TypeSerializer _valueTypeSerializer;

  public EnumMapSerializer(JavaType paramJavaType, boolean paramBoolean, EnumValues paramEnumValues, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer)
  {
    super(EnumMap.class, false);
    this._property = null;
    boolean bool1;
    if (!paramBoolean)
    {
      bool1 = false;
      if (paramJavaType != null)
      {
        boolean bool2 = paramJavaType.isFinal();
        bool1 = false;
        if (!bool2);
      }
    }
    else
    {
      bool1 = true;
    }
    this._staticTyping = bool1;
    this._valueType = paramJavaType;
    this._keyEnums = paramEnumValues;
    this._valueTypeSerializer = paramTypeSerializer;
    this._valueSerializer = paramJsonSerializer;
  }

  public EnumMapSerializer(EnumMapSerializer paramEnumMapSerializer, BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramEnumMapSerializer);
    this._property = paramBeanProperty;
    this._staticTyping = paramEnumMapSerializer._staticTyping;
    this._valueType = paramEnumMapSerializer._valueType;
    this._keyEnums = paramEnumMapSerializer._keyEnums;
    this._valueTypeSerializer = paramEnumMapSerializer._valueTypeSerializer;
    this._valueSerializer = paramJsonSerializer;
  }

  public EnumMapSerializer _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new EnumMapSerializer(this._valueType, this._staticTyping, this._keyEnums, paramTypeSerializer, this._valueSerializer);
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = null;
    if (paramBeanProperty != null)
    {
      AnnotatedMember localAnnotatedMember = paramBeanProperty.getMember();
      localJsonSerializer = null;
      if (localAnnotatedMember != null)
      {
        Object localObject = paramSerializerProvider.getAnnotationIntrospector().findContentSerializer(localAnnotatedMember);
        localJsonSerializer = null;
        if (localObject != null)
          localJsonSerializer = paramSerializerProvider.serializerInstance(localAnnotatedMember, localObject);
      }
    }
    if (localJsonSerializer == null)
      localJsonSerializer = this._valueSerializer;
    if (localJsonSerializer == null)
    {
      if (!this._staticTyping)
        break label107;
      this = withValueSerializer(paramBeanProperty, paramSerializerProvider.findValueSerializer(this._valueType, paramBeanProperty));
    }
    label107: 
    while (localJsonSerializer == this._valueSerializer)
    {
      return this;
      if ((this._valueSerializer instanceof ContextualSerializer))
        localJsonSerializer = ((ContextualSerializer)localJsonSerializer).createContextual(paramSerializerProvider, paramBeanProperty);
    }
    return withValueSerializer(paramBeanProperty, localJsonSerializer);
  }

  public boolean hasSingleElement(EnumMap<? extends Enum<?>, ?> paramEnumMap)
  {
    return paramEnumMap.size() == 1;
  }

  public boolean isEmpty(EnumMap<? extends Enum<?>, ?> paramEnumMap)
  {
    return (paramEnumMap == null) || (paramEnumMap.isEmpty());
  }

  public void serialize(EnumMap<? extends Enum<?>, ?> paramEnumMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartObject();
    if (!paramEnumMap.isEmpty())
      serializeContents(paramEnumMap, paramJsonGenerator, paramSerializerProvider);
    paramJsonGenerator.writeEndObject();
  }

  protected void serializeContents(EnumMap<? extends Enum<?>, ?> paramEnumMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._valueSerializer != null)
      serializeContentsUsing(paramEnumMap, paramJsonGenerator, paramSerializerProvider, this._valueSerializer);
    label297: 
    while (true)
    {
      return;
      EnumValues localEnumValues1 = this._keyEnums;
      int i;
      TypeSerializer localTypeSerializer;
      Iterator localIterator;
      Object localObject1;
      Object localObject2;
      EnumValues localEnumValues2;
      if (!paramSerializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
      {
        i = 1;
        localTypeSerializer = this._valueTypeSerializer;
        localIterator = paramEnumMap.entrySet().iterator();
        localObject1 = null;
        localObject2 = null;
        localEnumValues2 = localEnumValues1;
      }
      Map.Entry localEntry;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      label199: label243: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label297;
        localEntry = (Map.Entry)localIterator.next();
        localObject3 = localEntry.getValue();
        if ((i == 0) || (localObject3 != null))
        {
          Enum localEnum = (Enum)localEntry.getKey();
          if (localEnumValues2 == null)
            localEnumValues2 = ((EnumSerializer)paramSerializerProvider.findValueSerializer(localEnum.getDeclaringClass(), this._property)).getEnumValues();
          paramJsonGenerator.writeFieldName(localEnumValues2.serializedValueFor(localEnum));
          if (localObject3 == null)
          {
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
            continue;
            i = 0;
            break;
          }
          localObject4 = localObject3.getClass();
          if (localObject4 == localObject1)
          {
            localObject4 = localObject1;
            localObject5 = localObject2;
            if (localTypeSerializer != null)
              break label243;
            try
            {
              ((JsonSerializer)localObject2).serialize(localObject3, paramJsonGenerator, paramSerializerProvider);
              localObject2 = localObject5;
              localObject1 = localObject4;
              continue;
              localObject2 = paramSerializerProvider.findValueSerializer((java.lang.Class)localObject4, this._property);
              localObject5 = localObject2;
              break label199;
              ((JsonSerializer)localObject2).serializeWithType(localObject3, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
              localObject2 = localObject5;
              localObject1 = localObject4;
            }
            catch (Exception localException)
            {
              wrapAndThrow(paramSerializerProvider, localException, paramEnumMap, ((Enum)localEntry.getKey()).name());
              localObject2 = localObject5;
              localObject1 = localObject4;
            }
          }
        }
      }
    }
  }

  protected void serializeContentsUsing(EnumMap<? extends Enum<?>, ?> paramEnumMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    EnumValues localEnumValues1 = this._keyEnums;
    int i;
    TypeSerializer localTypeSerializer;
    Iterator localIterator;
    EnumValues localEnumValues2;
    if (!paramSerializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
    {
      i = 1;
      localTypeSerializer = this._valueTypeSerializer;
      localIterator = paramEnumMap.entrySet().iterator();
      localEnumValues2 = localEnumValues1;
    }
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = localEntry.getValue();
      if ((i == 0) || (localObject != null))
      {
        Enum localEnum = (Enum)localEntry.getKey();
        if (localEnumValues2 == null)
          localEnumValues2 = ((EnumSerializer)paramSerializerProvider.findValueSerializer(localEnum.getDeclaringClass(), this._property)).getEnumValues();
        paramJsonGenerator.writeFieldName(localEnumValues2.serializedValueFor(localEnum));
        if (localObject == null)
        {
          paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
          continue;
          i = 0;
          break;
        }
        if (localTypeSerializer == null)
          try
          {
            paramJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
          }
          catch (Exception localException)
          {
            wrapAndThrow(paramSerializerProvider, localException, paramEnumMap, ((Enum)localEntry.getKey()).name());
          }
        else
          paramJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
      }
    }
  }

  public void serializeWithType(EnumMap<? extends Enum<?>, ?> paramEnumMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForObject(paramEnumMap, paramJsonGenerator);
    if (!paramEnumMap.isEmpty())
      serializeContents(paramEnumMap, paramJsonGenerator, paramSerializerProvider);
    paramTypeSerializer.writeTypeSuffixForObject(paramEnumMap, paramJsonGenerator);
  }

  public EnumMapSerializer withValueSerializer(BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer)
  {
    if ((this._property == paramBeanProperty) && (paramJsonSerializer == this._valueSerializer))
      return this;
    return new EnumMapSerializer(this, paramBeanProperty, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.EnumMapSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
