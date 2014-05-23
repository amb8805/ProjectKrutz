package com.twitter.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.TweetView;
import com.twitter.android.widget.c;

final class de extends ArrayAdapter
{
  private final Context a;
  private final c b;
  private final int c;
  private final boolean d;

  public de(TweetFragment paramTweetFragment, Context paramContext, c paramc, int paramInt, boolean paramBoolean)
  {
    super(paramContext, 0);
    this.a = paramContext;
    this.b = paramc;
    this.c = paramInt;
    this.d = paramBoolean;
  }

  public final long getItemId(int paramInt)
  {
    return ((ax)getItem(paramInt)).o;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ax localax = (ax)getItem(paramInt);
    View localView;
    h localh;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.a).inflate(this.c, paramViewGroup, false);
      localh = new h(localView);
      localView.setTag(localh);
      localh.a.a(this.b);
      localh.a.a(this.e.j.b);
      localh.a.a(localax);
      if ((!this.d) || (paramInt != 0))
        break label146;
      localh.a(this.a.getString(2131427694));
    }
    while (true)
    {
      ((CardRowView)localView).a(paramInt, getCount());
      return localView;
      localh = (h)paramView.getTag();
      localView = paramView;
      break;
      label146: if ((!this.d) && (paramInt == getCount() - 1))
      {
        Context localContext = this.a;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localax.f;
        localh.a(localContext.getString(2131427553, arrayOfObject));
      }
      else
      {
        localh.a(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.de
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
