package com.twitter.android;

import android.support.v4.app.LoaderManager;
import android.widget.ImageButton;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;
import com.twitter.android.widget.TweetDetailView;
import dh;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m;

final class da extends i
{
  private da(TweetFragment paramTweetFragment)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
    {
      this.a.b.l = false;
      this.a.e.i.setImageResource(2130837621);
      Toast.makeText(this.a.getActivity(), 2131427390, 1).show();
    }
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, dh paramdh)
  {
    if ((this.a.c(paramString1) != null) && (paramInt == 200))
    {
      this.a.c.a(this.a.getActivity(), paramdh);
      this.a.g_();
      this.a.f = paramdh;
    }
  }

  public final void a(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.values().iterator();
    while (localIterator.hasNext())
      if ((m)localIterator.next() != null)
        this.a.f_();
  }

  public final void b(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
    {
      this.a.b.l = true;
      this.a.e.i.setImageResource(2130837625);
      Toast.makeText(this.a.getActivity(), 2131427391, 1).show();
    }
  }

  public final void d(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    if (this.a.c(paramString1) != null)
      this.a.getLoaderManager().initLoader(1, null, this.a);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.da
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
