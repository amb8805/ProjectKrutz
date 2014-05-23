package com.spotify.mobile.android.util;

import java.util.Collection;
import java.util.EnumSet;

 enum LogLevel
{
  private static final Collection<LogLevel> g = EnumSet.of(e);
  private static final Collection<LogLevel> h = EnumSet.of(c, d, e);

  static
  {
    LogLevel[] arrayOfLogLevel = new LogLevel[6];
    arrayOfLogLevel[0] = a;
    arrayOfLogLevel[1] = b;
    arrayOfLogLevel[2] = c;
    arrayOfLogLevel[3] = d;
    arrayOfLogLevel[4] = e;
    arrayOfLogLevel[5] = f;
    i = arrayOfLogLevel;
  }

  abstract void a(String paramString1, String paramString2);

  abstract void a(String paramString1, String paramString2, Throwable paramThrowable);

  protected final boolean a()
  {
    return (g.contains(this)) || (h.contains(this));
  }

  protected final boolean b()
  {
    return g.contains(this);
  }

  protected final boolean c()
  {
    return h.contains(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.LogLevel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
