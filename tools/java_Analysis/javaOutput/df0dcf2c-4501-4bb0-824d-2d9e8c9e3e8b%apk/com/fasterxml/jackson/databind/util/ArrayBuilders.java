package com.fasterxml.jackson.databind.util;

import java.util.HashSet;
import java.util.Set;

public final class ArrayBuilders
{
  ArrayBuilders.BooleanBuilder _booleanBuilder = null;
  ArrayBuilders.ByteBuilder _byteBuilder = null;
  ArrayBuilders.DoubleBuilder _doubleBuilder = null;
  ArrayBuilders.FloatBuilder _floatBuilder = null;
  ArrayBuilders.IntBuilder _intBuilder = null;
  ArrayBuilders.LongBuilder _longBuilder = null;
  ArrayBuilders.ShortBuilder _shortBuilder = null;

  public ArrayBuilders()
  {
  }

  public static <T> Iterable<T> arrayAsIterable(T[] paramArrayOfT)
  {
    return new ArrayBuilders.ArrayIterator(paramArrayOfT);
  }

  public static <T> HashSet<T> arrayToSet(T[] paramArrayOfT)
  {
    HashSet localHashSet = new HashSet();
    if (paramArrayOfT != null)
    {
      int i = paramArrayOfT.length;
      for (int j = 0; j < i; j++)
        localHashSet.add(paramArrayOfT[j]);
    }
    return localHashSet;
  }

  public static <T> HashSet<T> setAndArray(Set<T> paramSet, T[] paramArrayOfT)
  {
    HashSet localHashSet = new HashSet();
    if (paramSet != null)
      localHashSet.addAll(paramSet);
    if (paramArrayOfT != null)
    {
      int i = paramArrayOfT.length;
      for (int j = 0; j < i; j++)
        localHashSet.add(paramArrayOfT[j]);
    }
    return localHashSet;
  }

  public final ArrayBuilders.BooleanBuilder getBooleanBuilder()
  {
    if (this._booleanBuilder == null)
      this._booleanBuilder = new ArrayBuilders.BooleanBuilder();
    return this._booleanBuilder;
  }

  public final ArrayBuilders.ByteBuilder getByteBuilder()
  {
    if (this._byteBuilder == null)
      this._byteBuilder = new ArrayBuilders.ByteBuilder();
    return this._byteBuilder;
  }

  public final ArrayBuilders.DoubleBuilder getDoubleBuilder()
  {
    if (this._doubleBuilder == null)
      this._doubleBuilder = new ArrayBuilders.DoubleBuilder();
    return this._doubleBuilder;
  }

  public final ArrayBuilders.FloatBuilder getFloatBuilder()
  {
    if (this._floatBuilder == null)
      this._floatBuilder = new ArrayBuilders.FloatBuilder();
    return this._floatBuilder;
  }

  public final ArrayBuilders.IntBuilder getIntBuilder()
  {
    if (this._intBuilder == null)
      this._intBuilder = new ArrayBuilders.IntBuilder();
    return this._intBuilder;
  }

  public final ArrayBuilders.LongBuilder getLongBuilder()
  {
    if (this._longBuilder == null)
      this._longBuilder = new ArrayBuilders.LongBuilder();
    return this._longBuilder;
  }

  public final ArrayBuilders.ShortBuilder getShortBuilder()
  {
    if (this._shortBuilder == null)
      this._shortBuilder = new ArrayBuilders.ShortBuilder();
    return this._shortBuilder;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.ArrayBuilders
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
