package com.spotify.cosmos.smash.util;

import com.spotify.cosmos.smash.Request;
import java.util.Map;

public class Requests
{
  public Requests()
  {
  }

  public static Request get(String paramString)
  {
    return new Request("GET", paramString);
  }

  public static Request get(String paramString, Map<String, String> paramMap)
  {
    return new Request("GET", paramString, paramMap, null);
  }

  public static Request post(String paramString, Map<String, String> paramMap)
  {
    return new Request("POST", paramString, paramMap, null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.Requests
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
