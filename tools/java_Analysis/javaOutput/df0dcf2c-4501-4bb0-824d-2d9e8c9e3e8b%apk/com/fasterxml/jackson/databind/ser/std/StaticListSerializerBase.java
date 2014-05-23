package com.fasterxml.jackson.databind.ser.std;

import java.util.Collection;

public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T>
{
  protected StaticListSerializerBase(Class<?> paramClass)
  {
    super(paramClass, false);
  }

  public boolean isEmpty(T paramT)
  {
    return (paramT == null) || (paramT.size() == 0);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
