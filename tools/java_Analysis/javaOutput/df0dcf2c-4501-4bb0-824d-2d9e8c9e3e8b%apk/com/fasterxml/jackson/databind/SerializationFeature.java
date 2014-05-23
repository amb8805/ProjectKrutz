package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public enum SerializationFeature
  implements ConfigFeature
{
  private final boolean _defaultState;

  static
  {
    INDENT_OUTPUT = new SerializationFeature("INDENT_OUTPUT", 1, false);
    FAIL_ON_EMPTY_BEANS = new SerializationFeature("FAIL_ON_EMPTY_BEANS", 2, true);
    WRAP_EXCEPTIONS = new SerializationFeature("WRAP_EXCEPTIONS", 3, true);
    CLOSE_CLOSEABLE = new SerializationFeature("CLOSE_CLOSEABLE", 4, false);
    FLUSH_AFTER_WRITE_VALUE = new SerializationFeature("FLUSH_AFTER_WRITE_VALUE", 5, true);
    WRITE_DATES_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATES_AS_TIMESTAMPS", 6, true);
    WRITE_DATE_KEYS_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATE_KEYS_AS_TIMESTAMPS", 7, false);
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS = new SerializationFeature("WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", 8, false);
    WRITE_ENUMS_USING_TO_STRING = new SerializationFeature("WRITE_ENUMS_USING_TO_STRING", 9, false);
    WRITE_ENUMS_USING_INDEX = new SerializationFeature("WRITE_ENUMS_USING_INDEX", 10, false);
    WRITE_NULL_MAP_VALUES = new SerializationFeature("WRITE_NULL_MAP_VALUES", 11, true);
    WRITE_EMPTY_JSON_ARRAYS = new SerializationFeature("WRITE_EMPTY_JSON_ARRAYS", 12, true);
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new SerializationFeature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 13, false);
    ORDER_MAP_ENTRIES_BY_KEYS = new SerializationFeature("ORDER_MAP_ENTRIES_BY_KEYS", 14, false);
    EAGER_SERIALIZER_FETCH = new SerializationFeature("EAGER_SERIALIZER_FETCH", 15, true);
    SerializationFeature[] arrayOfSerializationFeature = new SerializationFeature[16];
    arrayOfSerializationFeature[0] = WRAP_ROOT_VALUE;
    arrayOfSerializationFeature[1] = INDENT_OUTPUT;
    arrayOfSerializationFeature[2] = FAIL_ON_EMPTY_BEANS;
    arrayOfSerializationFeature[3] = WRAP_EXCEPTIONS;
    arrayOfSerializationFeature[4] = CLOSE_CLOSEABLE;
    arrayOfSerializationFeature[5] = FLUSH_AFTER_WRITE_VALUE;
    arrayOfSerializationFeature[6] = WRITE_DATES_AS_TIMESTAMPS;
    arrayOfSerializationFeature[7] = WRITE_DATE_KEYS_AS_TIMESTAMPS;
    arrayOfSerializationFeature[8] = WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS;
    arrayOfSerializationFeature[9] = WRITE_ENUMS_USING_TO_STRING;
    arrayOfSerializationFeature[10] = WRITE_ENUMS_USING_INDEX;
    arrayOfSerializationFeature[11] = WRITE_NULL_MAP_VALUES;
    arrayOfSerializationFeature[12] = WRITE_EMPTY_JSON_ARRAYS;
    arrayOfSerializationFeature[13] = WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    arrayOfSerializationFeature[14] = ORDER_MAP_ENTRIES_BY_KEYS;
    arrayOfSerializationFeature[15] = EAGER_SERIALIZER_FETCH;
  }

  private SerializationFeature(boolean paramBoolean)
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
 * Qualified Name:     com.fasterxml.jackson.databind.SerializationFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
