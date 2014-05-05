package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.android.client.g;
import com.twitter.android.provider.as;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.TweetView;

public final class dv extends CursorAdapter
{
  private final g a;
  private final Context b;

  public dv(Context paramContext, int paramInt, g paramg)
  {
    super(paramContext, null, 2);
    this.b = paramContext;
    this.a = paramg;
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    TweetView localTweetView = (TweetView)paramView.getTag();
    localTweetView.a(this.a.b);
    localTweetView.a(new as(this.a.j(), paramCursor));
    ((CardRowView)paramView).a(paramCursor.getPosition(), getCount());
  }

  public final Object getItem(int paramInt)
  {
    Cursor localCursor = (Cursor)super.getItem(paramInt);
    long l = this.a.j();
    as localas = new as(l, localCursor);
    Intent localIntent = new Intent(this.b, MessagesThreadActivity.class);
    localIntent.putExtra("user_id", localas.q);
    localIntent.putExtra("owner_id", l);
    localIntent.putExtra("user_name", localas.e);
    return localIntent;
  }

  public final long getItemId(int paramInt)
  {
    return ((Cursor)super.getItem(paramInt)).getLong(13);
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903080, null);
    TweetView localTweetView = (TweetView)localView.findViewById(2131165274);
    localTweetView.a(this.a);
    localView.setTag(localTweetView);
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
