package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsExternalTypeSerializer extends TypeSerializerBase
{
  protected final String _typePropertyName;

  public AsExternalTypeSerializer(TypeIdResolver paramTypeIdResolver, BeanProperty paramBeanProperty, String paramString)
  {
    super(paramTypeIdResolver, paramBeanProperty);
    this._typePropertyName = paramString;
  }

  protected final void _writeArrayPrefix(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeStartArray();
  }

  protected final void _writeArraySuffix(Object paramObject, JsonGenerator paramJsonGenerator, String paramString)
  {
    paramJsonGenerator.writeEndArray();
    paramJsonGenerator.writeStringField(this._typePropertyName, paramString);
  }

  protected final void _writeObjectPrefix(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeStartObject();
  }

  protected final void _writeObjectSuffix(Object paramObject, JsonGenerator paramJsonGenerator, String paramString)
  {
    paramJsonGenerator.writeEndObject();
    paramJsonGenerator.writeStringField(this._typePropertyName, paramString);
  }

  protected final void _writeScalarPrefix(Object paramObject, JsonGenerator paramJsonGenerator)
  {
  }

  protected final void _writeScalarSuffix(Object paramObject, JsonGenerator paramJsonGenerator, String paramString)
  {
    paramJsonGenerator.writeStringField(this._typePropertyName, paramString);
  }

  public AsExternalTypeSerializer forProperty(BeanProperty paramBeanProperty)
  {
    if (this._property == paramBeanProperty)
      return this;
    return new AsExternalTypeSerializer(this._idResolver, paramBeanProperty, this._typePropertyName);
  }

  public void writeCustomTypePrefixForObject(Object paramObject, JsonGenerator paramJsonGenerator, String paramString)
  {
    _writeObjectPrefix(paramObject, paramJsonGenerator);
  }

  public void writeCustomTypeSuffixForObject(Object paramObject, JsonGenerator paramJsonGenerator, String paramString)
  {
    _writeObjectSuffix(paramObject, paramJsonGenerator, paramString);
  }

  public void writeTypePrefixForArray(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeArrayPrefix(paramObject, paramJsonGenerator);
  }

  public void writeTypePrefixForObject(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeObjectPrefix(paramObject, paramJsonGenerator);
  }

  public void writeTypePrefixForScalar(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeScalarPrefix(paramObject, paramJsonGenerator);
  }

  public void writeTypePrefixForScalar(Object paramObject, JsonGenerator paramJsonGenerator, Class<?> paramClass)
  {
    _writeScalarPrefix(paramObject, paramJsonGenerator);
  }

  public void writeTypeSuffixForArray(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeArraySuffix(paramObject, paramJsonGenerator, idFromValue(paramObject));
  }

  public void writeTypeSuffixForObject(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeObjectSuffix(paramObject, paramJsonGenerator, idFromValue(paramObject));
  }

  public void writeTypeSuffixForScalar(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    _writeScalarSuffix(paramObject, paramJsonGenerator, idFromValue(paramObject));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
