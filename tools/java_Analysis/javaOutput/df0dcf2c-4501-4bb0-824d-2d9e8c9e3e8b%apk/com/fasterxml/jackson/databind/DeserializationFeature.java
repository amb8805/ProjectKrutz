package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public enum DeserializationFeature
  implements ConfigFeature
{
  private final boolean _defaultState;

  static
  {
    READ_ENUMS_USING_TO_STRING = new DeserializationFeature("READ_ENUMS_USING_TO_STRING", 3, false);
    FAIL_ON_UNKNOWN_PROPERTIES = new DeserializationFeature("FAIL_ON_UNKNOWN_PROPERTIES", 4, true);
    FAIL_ON_NULL_FOR_PRIMITIVES = new DeserializationFeature("FAIL_ON_NULL_FOR_PRIMITIVES", 5, false);
    FAIL_ON_NUMBERS_FOR_ENUMS = new DeserializationFeature("FAIL_ON_NUMBERS_FOR_ENUMS", 6, false);
    WRAP_EXCEPTIONS = new DeserializationFeature("WRAP_EXCEPTIONS", 7, true);
    ACCEPT_SINGLE_VALUE_AS_ARRAY = new DeserializationFeature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 8, false);
    UNWRAP_ROOT_VALUE = new DeserializationFeature("UNWRAP_ROOT_VALUE", 9, false);
    ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 10, false);
    READ_UNKNOWN_ENUM_VALUES_AS_NULL = new DeserializationFeature("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 11, false);
    EAGER_DESERIALIZER_FETCH = new DeserializationFeature("EAGER_DESERIALIZER_FETCH", 12, true);
    DeserializationFeature[] arrayOfDeserializationFeature = new DeserializationFeature[13];
    arrayOfDeserializationFeature[0] = USE_BIG_DECIMAL_FOR_FLOATS;
    arrayOfDeserializationFeature[1] = USE_BIG_INTEGER_FOR_INTS;
    arrayOfDeserializationFeature[2] = USE_JAVA_ARRAY_FOR_JSON_ARRAY;
    arrayOfDeserializationFeature[3] = READ_ENUMS_USING_TO_STRING;
    arrayOfDeserializationFeature[4] = FAIL_ON_UNKNOWN_PROPERTIES;
    arrayOfDeserializationFeature[5] = FAIL_ON_NULL_FOR_PRIMITIVES;
    arrayOfDeserializationFeature[6] = FAIL_ON_NUMBERS_FOR_ENUMS;
    arrayOfDeserializationFeature[7] = WRAP_EXCEPTIONS;
    arrayOfDeserializationFeature[8] = ACCEPT_SINGLE_VALUE_AS_ARRAY;
    arrayOfDeserializationFeature[9] = UNWRAP_ROOT_VALUE;
    arrayOfDeserializationFeature[10] = ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
    arrayOfDeserializationFeature[11] = READ_UNKNOWN_ENUM_VALUES_AS_NULL;
    arrayOfDeserializationFeature[12] = EAGER_DESERIALIZER_FETCH;
  }

  private DeserializationFeature(boolean paramBoolean)
  {
    this._defaultState = paramBoolean;
  }

  public final boolean enabledByDefault()
  {
    return this._defaultState;
  }

  public final int getMask()
  {
    return 1 << ordinal();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.DeserializationFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
