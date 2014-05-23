package net.hockeyapp.android.d;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class g
{
  public static String a(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.d.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
