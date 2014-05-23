package com.facebook;

import android.content.Context;
import android.os.AsyncTask;
import com.facebook.internal.ad;

final class u extends AsyncTask<Void, Void, Void>
{
  private final String b;
  private final Context c;

  public u(Session paramSession, String paramString, Context paramContext)
  {
    this.b = paramString;
    this.c = paramContext.getApplicationContext();
  }

  private Void a()
  {
    try
    {
      aa.a(this.c, this.b);
      return null;
    }
    catch (Exception localException)
    {
      while (true)
        ad.a();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
