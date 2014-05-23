package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.ClassUtil;

@JacksonStdImpl
public class ClassDeserializer extends StdScalarDeserializer<Class<?>>
{
  public ClassDeserializer()
  {
    super(Class.class);
  }

  public Class<?> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if (localJsonToken == JsonToken.VALUE_STRING)
    {
      String str = paramJsonParser.getText().trim();
      try
      {
        Class localClass = paramDeserializationContext.findClass(str);
        return localClass;
      }
      catch (Exception localException)
      {
        throw paramDeserializationContext.instantiationException(this._valueClass, ClassUtil.getRootCause(localException));
      }
    }
    throw paramDeserializationContext.mappingException(this._valueClass, localJsonToken);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.ClassDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
