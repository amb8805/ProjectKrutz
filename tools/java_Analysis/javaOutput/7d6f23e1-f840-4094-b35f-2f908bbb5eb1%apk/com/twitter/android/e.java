package com.twitter.android;

import android.content.Context;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

public class e extends i
{
  protected final Context a;

  public e(TweetListFragment paramTweetListFragment, Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a, 2131427390, 1).show();
  }

  public final void b(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a, 2131427391, 1).show();
  }

  public final void c(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a, 2131427396, 1).show();
  }

  public final void c(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a, 2131427394, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
