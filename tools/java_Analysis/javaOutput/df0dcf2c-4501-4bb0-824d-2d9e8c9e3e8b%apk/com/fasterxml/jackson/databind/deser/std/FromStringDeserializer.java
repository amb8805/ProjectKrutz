package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T>
{
  protected FromStringDeserializer(Class<?> paramClass)
  {
    super(paramClass);
  }

  protected abstract T _deserialize(String paramString, DeserializationContext paramDeserializationContext);

  protected T _deserializeEmbedded(Object paramObject, DeserializationContext paramDeserializationContext)
  {
    throw paramDeserializationContext.mappingException("Don't know how to convert embedded Object of type " + paramObject.getClass().getName() + " into " + this._valueClass.getName());
  }

  public final T deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    String str1 = paramJsonParser.getValueAsString();
    if (str1 != null)
    {
      int i = str1.length();
      localObject2 = null;
      if (i != 0)
      {
        str2 = str1.trim();
        int j = str2.length();
        localObject2 = null;
        if (j != 0)
          break label47;
      }
      while (true)
      {
        return localObject2;
        try
        {
          label47: Object localObject3 = _deserialize(str2, paramDeserializationContext);
          localObject2 = localObject3;
          if (localObject2 != null)
            continue;
          throw paramDeserializationContext.weirdStringException(str2, this._valueClass, "not a valid textual representation");
          if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT)
          {
            Object localObject1 = paramJsonParser.getEmbeddedObject();
            localObject2 = null;
            if (localObject1 == null)
              continue;
            if (this._valueClass.isAssignableFrom(localObject1.getClass()))
              return localObject1;
            return _deserializeEmbedded(localObject1, paramDeserializationContext);
          }
          throw paramDeserializationContext.mappingException(this._valueClass);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          break label65;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
