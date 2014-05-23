package com.fasterxml.jackson.databind.util;

import java.util.Collection;

public abstract interface Provider<T>
{
  public abstract Collection<T> provide();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.Provider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
