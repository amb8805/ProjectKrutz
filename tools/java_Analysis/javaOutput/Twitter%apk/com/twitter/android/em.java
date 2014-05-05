package com.twitter.android;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;

public final class em extends CursorAdapter
{
  private final Filter a;
  private final g b;

  public em(Activity paramActivity, Uri paramUri, g paramg)
  {
    super(paramActivity, null, true);
    this.b = paramg;
    this.a = new ds(this, paramActivity, paramUri);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    fu localfu = (fu)paramView.getTag();
    String str = paramCursor.getString(3);
    if (str != null)
    {
      Bitmap localBitmap = this.b.b(paramCursor.getLong(1), str);
      if (localBitmap != null)
        localfu.a.setImageBitmap(localBitmap);
    }
    while (true)
    {
      localfu.b.setText(paramCursor.getString(2));
      return;
      localfu.a.setImageResource(2130837734);
      continue;
      localfu.a.setImageResource(2130837734);
    }
  }

  public final Filter getFilter()
  {
    return this.a;
  }

  public final Object getItem(int paramInt)
  {
    return ((Cursor)super.getItem(paramInt)).getString(2);
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903060, null);
    localView.setTag(new fu(localView));
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.em
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
