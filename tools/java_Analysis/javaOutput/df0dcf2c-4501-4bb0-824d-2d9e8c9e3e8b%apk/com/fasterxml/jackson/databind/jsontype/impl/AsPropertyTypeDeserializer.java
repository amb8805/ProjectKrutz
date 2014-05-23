package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
{
  private static final long serialVersionUID = 1L;

  public AsPropertyTypeDeserializer(JavaType paramJavaType, TypeIdResolver paramTypeIdResolver, String paramString, boolean paramBoolean, Class<?> paramClass)
  {
    super(paramJavaType, paramTypeIdResolver, paramString, paramBoolean, paramClass);
  }

  public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer paramAsPropertyTypeDeserializer, BeanProperty paramBeanProperty)
  {
    super(paramAsPropertyTypeDeserializer, paramBeanProperty);
  }

  protected Object _deserializeIfNatural(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    switch (AsPropertyTypeDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[paramJsonParser.getCurrentToken().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
              return null;
            while (!this._baseType.getRawClass().isAssignableFrom(String.class));
            return paramJsonParser.getText();
          }
          while (!this._baseType.getRawClass().isAssignableFrom(Integer.class));
          return Integer.valueOf(paramJsonParser.getIntValue());
        }
        while (!this._baseType.getRawClass().isAssignableFrom(Double.class));
        return Double.valueOf(paramJsonParser.getDoubleValue());
      }
      while (!this._baseType.getRawClass().isAssignableFrom(Boolean.class));
      return Boolean.TRUE;
    }
    while (!this._baseType.getRawClass().isAssignableFrom(Boolean.class));
    return Boolean.FALSE;
  }

  protected final Object _deserializeTypedForId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TokenBuffer paramTokenBuffer)
  {
    String str = paramJsonParser.getText();
    JsonDeserializer localJsonDeserializer = _findDeserializer(paramDeserializationContext, str);
    if (this._typeIdVisible)
    {
      if (paramTokenBuffer == null)
        paramTokenBuffer = new TokenBuffer(null);
      paramTokenBuffer.writeFieldName(paramJsonParser.getCurrentName());
      paramTokenBuffer.writeString(str);
    }
    if (paramTokenBuffer != null)
      paramJsonParser = JsonParserSequence.createFlattened(paramTokenBuffer.asParser(paramJsonParser), paramJsonParser);
    paramJsonParser.nextToken();
    return localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
  }

  protected Object _deserializeTypedUsingDefaultImpl(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TokenBuffer paramTokenBuffer)
  {
    Object localObject;
    if (this._defaultImpl != null)
    {
      JsonDeserializer localJsonDeserializer = _findDefaultImplDeserializer(paramDeserializationContext);
      if (paramTokenBuffer != null)
      {
        paramTokenBuffer.writeEndObject();
        paramJsonParser = paramTokenBuffer.asParser(paramJsonParser);
        paramJsonParser.nextToken();
      }
      localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
    }
    do
    {
      return localObject;
      localObject = _deserializeIfNatural(paramJsonParser, paramDeserializationContext);
    }
    while (localObject != null);
    if (paramJsonParser.getCurrentToken() == JsonToken.START_ARRAY)
      return super.deserializeTypedFromAny(paramJsonParser, paramDeserializationContext);
    throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.FIELD_NAME, "missing property '" + this._typePropertyName + "' that is to contain type id  (for class " + baseTypeName() + ")");
  }

  public Object deserializeTypedFromAny(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (paramJsonParser.getCurrentToken() == JsonToken.START_ARRAY)
      return super.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
    return deserializeTypedFromObject(paramJsonParser, paramDeserializationContext);
  }

  public Object deserializeTypedFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    JsonToken localJsonToken2;
    TokenBuffer localTokenBuffer;
    if (localJsonToken1 == JsonToken.START_OBJECT)
    {
      localJsonToken1 = paramJsonParser.nextToken();
      localJsonToken2 = localJsonToken1;
      localTokenBuffer = null;
    }
    while (true)
    {
      if (localJsonToken2 != JsonToken.FIELD_NAME)
        break label130;
      String str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      if (this._typePropertyName.equals(str))
      {
        return _deserializeTypedForId(paramJsonParser, paramDeserializationContext, localTokenBuffer);
        if (localJsonToken1 == JsonToken.START_ARRAY)
          return _deserializeTypedUsingDefaultImpl(paramJsonParser, paramDeserializationContext, null);
        if (localJsonToken1 == JsonToken.FIELD_NAME)
          break;
        return _deserializeTypedUsingDefaultImpl(paramJsonParser, paramDeserializationContext, null);
      }
      if (localTokenBuffer == null)
        localTokenBuffer = new TokenBuffer(null);
      localTokenBuffer.writeFieldName(str);
      localTokenBuffer.copyCurrentStructure(paramJsonParser);
      localJsonToken2 = paramJsonParser.nextToken();
    }
    label130: return _deserializeTypedUsingDefaultImpl(paramJsonParser, paramDeserializationContext, localTokenBuffer);
  }

  public TypeDeserializer forProperty(BeanProperty paramBeanProperty)
  {
    if (paramBeanProperty == this._property)
      return this;
    return new AsPropertyTypeDeserializer(this, paramBeanProperty);
  }

  public JsonTypeInfo.As getTypeInclusion()
  {
    return JsonTypeInfo.As.PROPERTY;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
