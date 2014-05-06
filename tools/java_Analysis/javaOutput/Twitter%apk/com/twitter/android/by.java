package com.twitter.android;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.twitter.android.client.g;
import com.twitter.android.client.j;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.TweetDetailView;

final class by extends BaseAdapter
{
  private by(TweetFragment paramTweetFragment)
  {
  }

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return this.a.b;
  }

  public final long getItemId(int paramInt)
  {
    return this.a.b.o;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    g localg = this.a.j;
    ax localax = this.a.b;
    TweetDetailView localTweetDetailView = this.a.e;
    localTweetDetailView.a(localax, localg, this.a.a.g(), this.a, localg.b(localax));
    return localTweetDetailView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.by
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
