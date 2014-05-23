package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.io.Serializable;

public abstract class StdKeyDeserializer extends KeyDeserializer
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected final Class<?> _keyClass;

  protected StdKeyDeserializer(Class<?> paramClass)
  {
    this._keyClass = paramClass;
  }

  protected abstract Object _parse(String paramString, DeserializationContext paramDeserializationContext);

  protected double _parseDouble(String paramString)
  {
    return NumberInput.parseDouble(paramString);
  }

  protected int _parseInt(String paramString)
  {
    return Integer.parseInt(paramString);
  }

  protected long _parseLong(String paramString)
  {
    return Long.parseLong(paramString);
  }

  public final Object deserializeKey(String paramString, DeserializationContext paramDeserializationContext)
  {
    if (paramString == null);
    do
    {
      return null;
      try
      {
        Object localObject = _parse(paramString, paramDeserializationContext);
        if (localObject != null)
          return localObject;
      }
      catch (Exception localException)
      {
        throw paramDeserializationContext.weirdKeyException(this._keyClass, paramString, "not a valid representation: " + localException.getMessage());
      }
    }
    while ((this._keyClass.isEnum()) && (paramDeserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)));
    throw paramDeserializationContext.weirdKeyException(this._keyClass, paramString, "not a valid representation");
  }

  public Class<?> getKeyClass()
  {
    return this._keyClass;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
