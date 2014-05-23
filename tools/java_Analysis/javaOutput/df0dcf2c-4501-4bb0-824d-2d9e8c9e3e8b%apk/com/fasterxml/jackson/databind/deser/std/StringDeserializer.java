package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class StringDeserializer extends StdScalarDeserializer<String>
{
  private static final long serialVersionUID = 1L;

  public StringDeserializer()
  {
    super(String.class);
  }

  public final String deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    String str = paramJsonParser.getValueAsString();
    if (str != null)
      return str;
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if (localJsonToken == JsonToken.VALUE_EMBEDDED_OBJECT)
    {
      Object localObject = paramJsonParser.getEmbeddedObject();
      if (localObject == null)
        return null;
      if ((localObject instanceof byte[]))
        return Base64Variants.getDefaultVariant().encode((byte[])localObject, false);
      return localObject.toString();
    }
    throw paramDeserializationContext.mappingException(this._valueClass, localJsonToken);
  }

  public final String deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return deserialize(paramJsonParser, paramDeserializationContext);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StringDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
