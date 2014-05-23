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
import java.io.Serializable;

public class AsArrayTypeDeserializer extends TypeDeserializerBase
  implements Serializable
{
  private static final long serialVersionUID = 5345570420394408290L;

  public AsArrayTypeDeserializer(JavaType paramJavaType, TypeIdResolver paramTypeIdResolver, String paramString, boolean paramBoolean, Class<?> paramClass)
  {
    super(paramJavaType, paramTypeIdResolver, paramString, paramBoolean, paramClass);
  }

  public AsArrayTypeDeserializer(AsArrayTypeDeserializer paramAsArrayTypeDeserializer, BeanProperty paramBeanProperty)
  {
    super(paramAsArrayTypeDeserializer, paramBeanProperty);
  }

  private final Object _deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    boolean bool = paramJsonParser.isExpectedStartArrayToken();
    String str = _locateTypeId(paramJsonParser, paramDeserializationContext);
    JsonDeserializer localJsonDeserializer = _findDeserializer(paramDeserializationContext, str);
    if ((this._typeIdVisible) && (paramJsonParser.getCurrentToken() == JsonToken.START_OBJECT))
    {
      TokenBuffer localTokenBuffer = new TokenBuffer(null);
      localTokenBuffer.writeStartObject();
      localTokenBuffer.writeFieldName(this._typePropertyName);
      localTokenBuffer.writeString(str);
      paramJsonParser = JsonParserSequence.createFlattened(localTokenBuffer.asParser(paramJsonParser), paramJsonParser);
      paramJsonParser.nextToken();
    }
    Object localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
    if ((bool) && (paramJsonParser.nextToken() != JsonToken.END_ARRAY))
      throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value");
    return localObject;
  }

  protected final String _locateTypeId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (!paramJsonParser.isExpectedStartArrayToken())
    {
      if (this._defaultImpl != null)
        return this._idResolver.idFromBaseType();
      throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName());
    }
    if (paramJsonParser.nextToken() == JsonToken.VALUE_STRING)
    {
      String str = paramJsonParser.getText();
      paramJsonParser.nextToken();
      return str;
    }
    if (this._defaultImpl != null)
      return this._idResolver.idFromBaseType();
    throw paramDeserializationContext.wrongTokenException(paramJsonParser, JsonToken.VALUE_STRING, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")");
  }

  public Object deserializeTypedFromAny(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    return _deserialize(paramJsonParser, paramDeserializationContext);
  }

  public Object deserializeTypedFromArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    return _deserialize(paramJsonParser, paramDeserializationContext);
  }

  public Object deserializeTypedFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    return _deserialize(paramJsonParser, paramDeserializationContext);
  }

  public Object deserializeTypedFromScalar(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    return _deserialize(paramJsonParser, paramDeserializationContext);
  }

  public TypeDeserializer forProperty(BeanProperty paramBeanProperty)
  {
    if (paramBeanProperty == this._property)
      return this;
    return new AsArrayTypeDeserializer(this, paramBeanProperty);
  }

  public JsonTypeInfo.As getTypeInclusion()
  {
    return JsonTypeInfo.As.WRAPPER_ARRAY;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
