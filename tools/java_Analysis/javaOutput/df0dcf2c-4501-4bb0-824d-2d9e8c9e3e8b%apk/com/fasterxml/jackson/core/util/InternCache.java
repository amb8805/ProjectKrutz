package com.fasterxml.jackson.core.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class InternCache extends LinkedHashMap<String, String>
{
  public static final InternCache instance = new InternCache();

  private InternCache()
  {
    super(100, 0.8F, true);
  }

  public final String intern(String paramString)
  {
    try
    {
      String str = (String)get(paramString);
      if (str == null)
      {
        str = paramString.intern();
        put(str, str);
      }
      return str;
    }
    finally
    {
    }
  }

  protected final boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    return size() > 100;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.util.InternCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
