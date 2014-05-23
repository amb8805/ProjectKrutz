package com.spotify.mobile.android.devtools;

import android.annotation.SuppressLint;
import android.os.Debug;
import com.spotify.mobile.android.util.ao;
import java.io.PrintStream;
import java.util.Locale;

public final class a
{
  private static MethodTraceScope a = null;

  @SuppressLint({"SdCardPath"})
  public static void a(MethodTraceScope paramMethodTraceScope)
  {
    try
    {
      if (paramMethodTraceScope.a())
      {
        if (a != null)
        {
          System.err.println("Terminating trace " + a + ", starting " + paramMethodTraceScope);
          Debug.stopMethodTracing();
        }
        Debug.startMethodTracing("/sdcard/" + paramMethodTraceScope.name().toLowerCase(Locale.US) + "." + ao.b() + ".trace", 16777216);
        a = paramMethodTraceScope;
      }
      return;
    }
    finally
    {
    }
  }

  public static void b(MethodTraceScope paramMethodTraceScope)
  {
    try
    {
      if ((paramMethodTraceScope.a()) && (a == paramMethodTraceScope))
      {
        Debug.stopMethodTracing();
        a = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.devtools.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
