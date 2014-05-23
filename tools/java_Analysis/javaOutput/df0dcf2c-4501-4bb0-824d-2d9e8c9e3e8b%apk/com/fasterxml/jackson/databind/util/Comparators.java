package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

public class Comparators
{
  public static Object getArrayComparator(Object paramObject)
  {
    return new Comparators.1(paramObject, Array.getLength(paramObject));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.Comparators
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
