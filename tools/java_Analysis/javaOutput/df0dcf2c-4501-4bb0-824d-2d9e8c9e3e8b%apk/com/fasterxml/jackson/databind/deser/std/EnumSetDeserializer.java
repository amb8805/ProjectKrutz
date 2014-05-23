package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumSet;

public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>>
  implements ContextualDeserializer
{
  protected final Class<Enum> _enumClass;
  protected JsonDeserializer<Enum<?>> _enumDeserializer;
  protected final JavaType _enumType;

  public EnumSetDeserializer(JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer)
  {
    super(EnumSet.class);
    this._enumType = paramJavaType;
    this._enumClass = paramJavaType.getRawClass();
    this._enumDeserializer = paramJsonDeserializer;
  }

  private EnumSet constructSet()
  {
    return EnumSet.noneOf(this._enumClass);
  }

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    JsonDeserializer localJsonDeserializer = this._enumDeserializer;
    if (localJsonDeserializer == null)
      localJsonDeserializer = paramDeserializationContext.findContextualValueDeserializer(this._enumType, paramBeanProperty);
    while (true)
    {
      return withDeserializer(localJsonDeserializer);
      if ((localJsonDeserializer instanceof ContextualDeserializer))
        localJsonDeserializer = ((ContextualDeserializer)localJsonDeserializer).createContextual(paramDeserializationContext, paramBeanProperty);
    }
  }

  public EnumSet<?> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (!paramJsonParser.isExpectedStartArrayToken())
      throw paramDeserializationContext.mappingException(EnumSet.class);
    EnumSet localEnumSet = constructSet();
    while (true)
    {
      JsonToken localJsonToken = paramJsonParser.nextToken();
      if (localJsonToken == JsonToken.END_ARRAY)
        break;
      if (localJsonToken == JsonToken.VALUE_NULL)
        throw paramDeserializationContext.mappingException(this._enumClass);
      Enum localEnum = (Enum)this._enumDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
      if (localEnum != null)
        localEnumSet.add(localEnum);
    }
    return localEnumSet;
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
  }

  public boolean isCachable()
  {
    return true;
  }

  public EnumSetDeserializer withDeserializer(JsonDeserializer<?> paramJsonDeserializer)
  {
    if (this._enumDeserializer == paramJsonDeserializer)
      return this;
    return new EnumSetDeserializer(this._enumType, paramJsonDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
