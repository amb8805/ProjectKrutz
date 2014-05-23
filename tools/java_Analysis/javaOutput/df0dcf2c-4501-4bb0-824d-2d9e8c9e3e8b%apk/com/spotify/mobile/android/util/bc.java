package com.spotify.mobile.android.util;

import java.util.HashMap;
import java.util.Map;

public final class bc
{
  private static Map<String, String> a = new HashMap();
  private static Map<String, String> b = new HashMap();

  public static String a(String paramString)
  {
    Assertion.a(paramString.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
    String str = paramString.substring(14);
    if (a.containsKey(str))
      return (String)a.get(str);
    return "";
  }

  public static void a(String paramString1, String paramString2)
  {
    Assertion.a(paramString1.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
    String str = paramString1.substring(14);
    a.put(str, paramString2);
  }

  public static String b(String paramString)
  {
    Assertion.a(paramString.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
    String str = paramString.substring(14);
    if (b.containsKey(str))
      return (String)b.get(str);
    return "";
  }

  public static void b(String paramString1, String paramString2)
  {
    Assertion.a(paramString1.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
    String str = paramString1.substring(14);
    b.put(str, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
