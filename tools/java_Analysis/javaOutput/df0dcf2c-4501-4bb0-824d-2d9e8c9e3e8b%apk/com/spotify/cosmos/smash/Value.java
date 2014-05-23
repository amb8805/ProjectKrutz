package com.spotify.cosmos.smash;

class Value<T>
{
  private T mValue;

  Value()
  {
  }

  public static <T> Value<T> create()
  {
    return new Value();
  }

  public T get()
  {
    return this.mValue;
  }

  public void set(T paramT)
  {
    this.mValue = paramT;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Value
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
