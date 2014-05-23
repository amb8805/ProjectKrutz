package com.mixpanel.android.a;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class b
{
  public static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    while (true)
    {
      String str = localBufferedReader.readLine();
      if (str == null)
        break;
      localStringBuilder.append(str + "\n");
    }
    localBufferedReader.close();
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
