package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;

public class InvalidFormatException extends JsonMappingException
{
  private static final long serialVersionUID = 1L;
  protected final Class<?> _targetType;
  protected final Object _value;

  public InvalidFormatException(String paramString, JsonLocation paramJsonLocation, Object paramObject, Class<?> paramClass)
  {
    super(paramString, paramJsonLocation);
    this._value = paramObject;
    this._targetType = paramClass;
  }

  public static InvalidFormatException from(JsonParser paramJsonParser, String paramString, Object paramObject, Class<?> paramClass)
  {
    return new InvalidFormatException(paramString, paramJsonParser.getTokenLocation(), paramObject, paramClass);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.exc.InvalidFormatException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
