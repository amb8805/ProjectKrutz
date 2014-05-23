package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public enum MapperFeature
  implements ConfigFeature
{
  private final boolean _defaultState;

  static
  {
    AUTO_DETECT_CREATORS = new MapperFeature("AUTO_DETECT_CREATORS", 1, true);
    AUTO_DETECT_FIELDS = new MapperFeature("AUTO_DETECT_FIELDS", 2, true);
    AUTO_DETECT_GETTERS = new MapperFeature("AUTO_DETECT_GETTERS", 3, true);
    AUTO_DETECT_IS_GETTERS = new MapperFeature("AUTO_DETECT_IS_GETTERS", 4, true);
    AUTO_DETECT_SETTERS = new MapperFeature("AUTO_DETECT_SETTERS", 5, true);
    REQUIRE_SETTERS_FOR_GETTERS = new MapperFeature("REQUIRE_SETTERS_FOR_GETTERS", 6, false);
    USE_GETTERS_AS_SETTERS = new MapperFeature("USE_GETTERS_AS_SETTERS", 7, true);
    CAN_OVERRIDE_ACCESS_MODIFIERS = new MapperFeature("CAN_OVERRIDE_ACCESS_MODIFIERS", 8, true);
    USE_STATIC_TYPING = new MapperFeature("USE_STATIC_TYPING", 9, false);
    DEFAULT_VIEW_INCLUSION = new MapperFeature("DEFAULT_VIEW_INCLUSION", 10, true);
    SORT_PROPERTIES_ALPHABETICALLY = new MapperFeature("SORT_PROPERTIES_ALPHABETICALLY", 11, false);
    USE_WRAPPER_NAME_AS_PROPERTY_NAME = new MapperFeature("USE_WRAPPER_NAME_AS_PROPERTY_NAME", 12, false);
    MapperFeature[] arrayOfMapperFeature = new MapperFeature[13];
    arrayOfMapperFeature[0] = USE_ANNOTATIONS;
    arrayOfMapperFeature[1] = AUTO_DETECT_CREATORS;
    arrayOfMapperFeature[2] = AUTO_DETECT_FIELDS;
    arrayOfMapperFeature[3] = AUTO_DETECT_GETTERS;
    arrayOfMapperFeature[4] = AUTO_DETECT_IS_GETTERS;
    arrayOfMapperFeature[5] = AUTO_DETECT_SETTERS;
    arrayOfMapperFeature[6] = REQUIRE_SETTERS_FOR_GETTERS;
    arrayOfMapperFeature[7] = USE_GETTERS_AS_SETTERS;
    arrayOfMapperFeature[8] = CAN_OVERRIDE_ACCESS_MODIFIERS;
    arrayOfMapperFeature[9] = USE_STATIC_TYPING;
    arrayOfMapperFeature[10] = DEFAULT_VIEW_INCLUSION;
    arrayOfMapperFeature[11] = SORT_PROPERTIES_ALPHABETICALLY;
    arrayOfMapperFeature[12] = USE_WRAPPER_NAME_AS_PROPERTY_NAME;
  }

  private MapperFeature(boolean paramBoolean)
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
 * Qualified Name:     com.fasterxml.jackson.databind.MapperFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
