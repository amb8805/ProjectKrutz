package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;

public class EnumDeserializer extends StdScalarDeserializer<Enum<?>>
{
  private static final long serialVersionUID = -5893263645879532318L;
  protected final EnumResolver<?> _resolver;

  public EnumDeserializer(EnumResolver<?> paramEnumResolver)
  {
    super(Enum.class);
    this._resolver = paramEnumResolver;
  }

  public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig paramDeserializationConfig, Class<?> paramClass, AnnotatedMethod paramAnnotatedMethod)
  {
    Class localClass = paramAnnotatedMethod.getRawParameterType(0);
    Object localObject;
    if (localClass == String.class)
      localObject = null;
    while (true)
    {
      if (paramDeserializationConfig.canOverrideAccessModifiers())
        ClassUtil.checkAndFixAccess(paramAnnotatedMethod.getMember());
      return new EnumDeserializer.FactoryBasedDeserializer(paramClass, paramAnnotatedMethod, (Class)localObject);
      if ((localClass == Integer.TYPE) || (localClass == Integer.class))
      {
        localObject = Integer.class;
      }
      else
      {
        if ((localClass != Long.TYPE) && (localClass != Long.class))
          break;
        localObject = Long.class;
      }
    }
    throw new IllegalArgumentException("Parameter #0 type for factory method (" + paramAnnotatedMethod + ") not suitable, must be java.lang.String or int/Integer/long/Long");
  }

  public Enum<?> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    String str;
    Enum localEnum;
    if ((localJsonToken == JsonToken.VALUE_STRING) || (localJsonToken == JsonToken.FIELD_NAME))
    {
      str = paramJsonParser.getText();
      localEnum = this._resolver.findEnum(str);
      if (localEnum == null)
      {
        if ((!paramDeserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) || ((str.length() != 0) && (str.trim().length() != 0)))
          break label76;
        localEnum = null;
      }
    }
    label76: int i;
    do
    {
      do
        return localEnum;
      while (paramDeserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL));
      throw paramDeserializationContext.weirdStringException(str, this._resolver.getEnumClass(), "value not one of declared Enum instance names");
      if (localJsonToken != JsonToken.VALUE_NUMBER_INT)
        break;
      if (paramDeserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
        throw paramDeserializationContext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
      i = paramJsonParser.getIntValue();
      localEnum = this._resolver.getEnum(i);
    }
    while ((localEnum != null) || (paramDeserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)));
    throw paramDeserializationContext.weirdNumberException(Integer.valueOf(i), this._resolver.getEnumClass(), "index value outside legal index range [0.." + this._resolver.lastValidIndex() + "]");
    throw paramDeserializationContext.mappingException(this._resolver.getEnumClass());
  }

  public boolean isCachable()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.EnumDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
