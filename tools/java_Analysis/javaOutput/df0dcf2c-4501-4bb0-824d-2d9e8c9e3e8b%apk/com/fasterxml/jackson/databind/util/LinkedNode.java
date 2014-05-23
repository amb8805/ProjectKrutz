package com.fasterxml.jackson.databind.util;

public final class LinkedNode<T>
{
  final LinkedNode<T> _next;
  final T _value;

  public final LinkedNode<T> next()
  {
    return this._next;
  }

  public final T value()
  {
    return this._value;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.LinkedNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
