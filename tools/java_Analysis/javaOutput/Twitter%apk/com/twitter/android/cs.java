package com.twitter.android;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.widget.CardRowView;

final class cs extends CursorAdapter
{
  public cs(DraftsFragment paramDraftsFragment, Context paramContext)
  {
    super(paramContext, null, 0);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    cv localcv = (cv)paramView.getTag();
    String str;
    if (paramCursor.isNull(4))
    {
      localcv.a.setVisibility(8);
      localcv.b.setTextSize(this.a.j.b);
      str = paramCursor.getString(3);
      if (!TextUtils.isEmpty(str))
        break label106;
      localcv.b.setText(2131427622);
    }
    while (true)
    {
      ((CardRowView)paramView).a(paramCursor.getPosition(), paramCursor.getCount());
      return;
      localcv.a.setVisibility(0);
      break;
      label106: localcv.b.setText(str);
    }
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    CardRowView localCardRowView = (CardRowView)LayoutInflater.from(paramContext).inflate(2130903058, paramViewGroup, false);
    cv localcv = new cv(this.a);
    localcv.a = ((ImageView)localCardRowView.findViewById(2131165254));
    localcv.b = ((TextView)localCardRowView.findViewById(2131165253));
    localCardRowView.setTag(localcv);
    return localCardRowView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
