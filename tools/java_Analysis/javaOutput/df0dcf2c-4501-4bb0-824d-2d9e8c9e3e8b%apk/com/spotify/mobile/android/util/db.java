package com.spotify.mobile.android.util;

import android.content.Context;
import java.util.Map;
import net.hockeyapp.android.b;
import net.hockeyapp.android.d;

public class db
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final Context b;

  static
  {
    com.spotify.mobile.android.c.c.a(db.class, al.class, new al());
  }

  private db(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    this.a = paramUncaughtExceptionHandler;
    this.b = paramContext;
  }

  public static void a(Context paramContext, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    if ((!(localUncaughtExceptionHandler instanceof db)) && (!(localUncaughtExceptionHandler instanceof d)))
      Thread.setDefaultUncaughtExceptionHandler(new db(localUncaughtExceptionHandler, localContext));
    b.a(localContext, paramString, (net.hockeyapp.android.c)com.spotify.mobile.android.c.c.a(da.class));
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    al localal = (al)com.spotify.mobile.android.c.c.a(db.class, al.class);
    cw localcw = cw.a(this.b);
    Map localMap = ((aj)com.spotify.mobile.android.c.c.a(al.class, aj.class)).a(localcw, paramThrowable);
    ((m)com.spotify.mobile.android.c.c.a(al.class, m.class)).a("", localMap, new al.1(localal));
    if (this.a != null)
      this.a.uncaughtException(paramThread, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.db
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
