package com.squareup.wire;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class j
{
  final int a;
  final String b;
  final Message.Datatype c;
  final Message.Label d;
  final Class<? extends Enum> e;
  final Class<? extends Message> f;
  private final Field g;
  private final Method h;

  private j(int paramInt, String paramString, Message.Datatype paramDatatype, Message.Label paramLabel, Class<?> paramClass, Field paramField, Method paramMethod)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramDatatype;
    this.d = paramLabel;
    if (paramDatatype == Message.Datatype.ENUM)
    {
      this.e = paramClass;
      this.f = null;
    }
    while (true)
    {
      this.g = paramField;
      this.h = paramMethod;
      return;
      if (paramDatatype == Message.Datatype.MESSAGE)
      {
        this.f = paramClass;
        this.e = null;
      }
      else
      {
        this.e = null;
        this.f = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
