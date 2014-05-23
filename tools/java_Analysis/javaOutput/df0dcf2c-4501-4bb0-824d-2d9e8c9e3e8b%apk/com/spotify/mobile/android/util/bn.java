package com.spotify.mobile.android.util;

import android.util.Log;
import java.text.DateFormat;
import java.util.Date;

final class bn
{
  private char a;
  private String b;
  private String c;
  private Throwable d;
  private long e;

  private bn()
  {
  }

  public final void a(char paramChar, String paramString1, String paramString2, Throwable paramThrowable, long paramLong)
  {
    this.a = paramChar;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramThrowable;
    this.e = paramLong;
  }

  public final void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(this.a);
    paramStringBuilder.append((char)'\t');
    bm.b().setTime(this.e);
    paramStringBuilder.append(bm.c().format(bm.b()));
    paramStringBuilder.append((char)'\t');
    paramStringBuilder.append(this.b);
    paramStringBuilder.append((char)'\t');
    paramStringBuilder.append(this.c);
    if (this.d != null)
    {
      paramStringBuilder.append((char)' ');
      paramStringBuilder.append(Log.getStackTraceString(this.d));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
