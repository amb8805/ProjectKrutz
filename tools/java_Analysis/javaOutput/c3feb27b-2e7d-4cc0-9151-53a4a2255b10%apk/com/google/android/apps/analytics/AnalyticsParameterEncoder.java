package com.google.android.apps.analytics;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class AnalyticsParameterEncoder
{
  private AnalyticsParameterEncoder()
  {
  }

  public static String encode(String paramString)
  {
    return encode(paramString, "UTF-8");
  }

  static String encode(String paramString1, String paramString2)
  {
    try
    {
      String str = URLEncoder.encode(paramString1, paramString2).replace("+", "%20");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError("URL encoding failed for: " + paramString1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.apps.analytics.AnalyticsParameterEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
