package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;

public final class dq extends CursorAdapter
{
  private final boolean a;
  private final boolean b;

  public dq(Context paramContext, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, null, 2);
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    ft localft = (ft)paramView.getTag();
    String str1 = paramCursor.getString(2);
    localft.a.setText(str1);
    int i;
    if (paramCursor.getInt(5) == 1)
    {
      i = 1;
      if (i == 0)
        break label104;
      localft.a.setCompoundDrawablesWithIntrinsicBounds(null, null, paramContext.getResources().getDrawable(2130837711), null);
    }
    while (true)
    {
      String str2 = paramCursor.getString(3);
      localft.b.setText(str2.substring(0, str2.indexOf('/')));
      return;
      i = 0;
      break;
      label104: localft.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
  }

  public final int getCount()
  {
    if (this.b)
      return 1 + super.getCount();
    return super.getCount();
  }

  public final Object getItem(int paramInt)
  {
    if ((this.b) && (paramInt == getCount() - 1))
      return null;
    if (this.a)
    {
      Cursor localCursor = (Cursor)super.getItem(paramInt);
      Intent localIntent = new Intent(this.mContext, ListTabActivity.class);
      localIntent.putExtra("owner_id", localCursor.getLong(8));
      localIntent.putExtra("creator_id", localCursor.getLong(6));
      localIntent.putExtra("list_id", localCursor.getLong(1));
      localIntent.putExtra("list_name", localCursor.getString(2));
      localIntent.putExtra("list_description", localCursor.getString(4));
      localIntent.putExtra("list_fullname", localCursor.getString(3));
      localIntent.putExtra("list_mode", localCursor.getInt(5));
      return localIntent;
    }
    return super.getItem(paramInt);
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt < getCount() - 1)
      return 0;
    return 1;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (this.b)
      if (paramInt == getCount() - 1)
      {
        if (paramView != null)
          break label77;
        localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903057, paramViewGroup, false);
      }
    while (true)
    {
      ((CardRowView)localView).a(paramInt, getCount());
      return localView;
      localView = super.getView(paramInt, paramView, paramViewGroup);
      continue;
      localView = super.getView(paramInt, paramView, paramViewGroup);
      continue;
      label77: localView = paramView;
    }
  }

  public final int getViewTypeCount()
  {
    if (this.b)
      return 2;
    return 1;
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903075, paramViewGroup, false);
    localView.setTag(new ft(localView));
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
