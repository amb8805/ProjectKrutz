package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.widget.CardRowView;
import dn;
import java.util.ArrayList;

final class aq extends CursorAdapter
{
  public aq(SULFragment paramSULFragment, Context paramContext, int paramInt)
  {
    super(paramContext, null, 2);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    ad localad = (ad)paramCursor;
    gc localgc = (gc)paramView.getTag();
    dn localdn = (dn)localad.b();
    localgc.a.setText(localdn.a);
    localgc.c = localdn.b;
    if (localdn.i != null)
    {
      int i = Math.min(localdn.i.size(), localgc.b.getChildCount());
      Resources localResources = paramContext.getResources();
      int j = 0;
      if (j < i)
      {
        ad localad1 = (ad)localdn.i.get(j);
        ImageView localImageView = (ImageView)localgc.b.getChildAt(j);
        Bitmap localBitmap = this.a.j.a(1, localad1.a, localad1.c);
        if (localBitmap != null)
          localImageView.setBackgroundDrawable(new BitmapDrawable(localResources, localBitmap));
        while (true)
        {
          localImageView.setVisibility(0);
          j++;
          break;
          localImageView.setBackgroundResource(2130837734);
        }
      }
    }
    ((CardRowView)paramView).a(paramCursor.getPosition(), paramCursor.getCount());
  }

  public final Object getItem(int paramInt)
  {
    Cursor localCursor = (Cursor)super.getItem(paramInt);
    return new Intent(this.a.getActivity(), ListTabActivity.class).putExtra("screen_name", this.a.getString(2131427329)).putExtra("list_name", localCursor.getString(1)).putExtra("slug", localCursor.getString(2)).putExtra("type", 6).putExtra("tab", "members").putExtra("follow", true).putExtra("onboarding", SULFragment.a(this.a));
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903108, null);
    localView.setTag(new gc(this.a, localView));
    return localView;
  }

  public final Cursor swapCursor(Cursor paramCursor)
  {
    if (paramCursor != null)
    {
      ad localad = new ad(paramCursor);
      localad.a();
      return super.swapCursor(localad);
    }
    return super.swapCursor(paramCursor);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.aq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
