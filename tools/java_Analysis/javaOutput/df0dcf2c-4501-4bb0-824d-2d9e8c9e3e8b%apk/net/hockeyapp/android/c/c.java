package net.hockeyapp.android.c;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import net.hockeyapp.android.objects.FeedbackResponse;

public final class c extends AsyncTask<Void, Void, FeedbackResponse>
{
  private Context a;
  private String b;
  private Handler c;

  public c(Context paramContext, String paramString, Handler paramHandler)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramHandler;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
