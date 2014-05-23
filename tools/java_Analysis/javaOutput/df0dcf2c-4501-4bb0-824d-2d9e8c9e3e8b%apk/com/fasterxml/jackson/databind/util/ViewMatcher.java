package com.fasterxml.jackson.databind.util;

public abstract class ViewMatcher
{
  public ViewMatcher()
  {
  }

  public static ViewMatcher construct(Class<?>[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null)
      return ViewMatcher.Empty.instance;
    switch (paramArrayOfClass.length)
    {
    default:
      return new ViewMatcher.Multi(paramArrayOfClass);
    case 0:
      return ViewMatcher.Empty.instance;
    case 1:
    }
    return new ViewMatcher.Single(paramArrayOfClass[0]);
  }

  public abstract boolean isVisibleForView(Class<?> paramClass);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.ViewMatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
