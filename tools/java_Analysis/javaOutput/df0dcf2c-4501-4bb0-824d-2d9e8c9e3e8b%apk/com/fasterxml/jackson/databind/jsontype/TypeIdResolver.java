package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;

public abstract interface TypeIdResolver
{
  public abstract String idFromBaseType();

  public abstract String idFromValue(Object paramObject);

  public abstract String idFromValueAndType(Object paramObject, Class<?> paramClass);

  public abstract void init(JavaType paramJavaType);

  public abstract JavaType typeFromId(String paramString);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.TypeIdResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
