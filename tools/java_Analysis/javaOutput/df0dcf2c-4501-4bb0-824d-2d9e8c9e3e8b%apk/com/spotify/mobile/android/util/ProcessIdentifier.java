package com.spotify.mobile.android.util;

import com.spotify.mobile.android.c.c;
import java.io.Reader;

public class ProcessIdentifier
{
  static
  {
    c.a(ProcessIdentifier.class, ce.class, new ce());
  }

  public ProcessIdentifier()
  {
  }

  public static ProcessIdentifier.ProcessType a()
  {
    String str;
    try
    {
      str = b();
      if (str.contains("robolectric.ui"))
        return ProcessIdentifier.ProcessType.c;
    }
    catch (Exception localException)
    {
      throw new ProcessIdentifier.UnidentifiableProcessException(localException);
    }
    if (str.contains(".ui"))
      return ProcessIdentifier.ProcessType.a;
    if (str.contains(".service"))
      return ProcessIdentifier.ProcessType.b;
    if (str.contains(".gdbprocess"))
      return ProcessIdentifier.ProcessType.d;
    throw new ProcessIdentifier.UnidentifiableProcessException("We don't know what this process is: " + str);
  }

  private static String b()
  {
    Reader localReader = null;
    StringBuilder localStringBuilder;
    try
    {
      c.a(ProcessIdentifier.class, ce.class);
      localReader = ce.a();
      localStringBuilder = new StringBuilder(64);
      while (true)
      {
        int i = localReader.read();
        if (i <= 0)
          break;
        localStringBuilder.append((char)i);
      }
    }
    finally
    {
      if (localReader != null)
        localReader.close();
    }
    String str = localStringBuilder.toString();
    localReader.close();
    return str;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ProcessIdentifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
