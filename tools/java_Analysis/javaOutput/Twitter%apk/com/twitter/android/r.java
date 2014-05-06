package com.twitter.android;

import android.support.v4.app.LoaderManager;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class r extends i
{
  private r(TweetActivity paramTweetActivity)
  {
  }

  public final void d(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if (this.a.e(paramString1))
    {
      if (paramInt == 200)
        this.a.getSupportLoaderManager().restartLoader(0, null, this.a);
    }
    else
      return;
    Toast.makeText(this.a, 2131427389, 1).show();
    this.a.finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
