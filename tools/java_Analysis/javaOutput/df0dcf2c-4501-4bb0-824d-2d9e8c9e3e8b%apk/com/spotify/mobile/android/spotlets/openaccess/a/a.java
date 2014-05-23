package com.spotify.mobile.android.spotlets.openaccess.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.ui.view.TopHitNumberView;

public final class a extends BaseAdapter
{
  private Context a;
  private b b;
  private Track[] c = new Track[0];

  public a(Context paramContext, b paramb)
  {
    this.a = paramContext;
    this.b = paramb;
  }

  public final void a(Track[] paramArrayOfTrack)
  {
    if (paramArrayOfTrack == null)
    {
      this.c = new Track[0];
      notifyDataSetInvalidated();
      return;
    }
    this.c = paramArrayOfTrack;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.c.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.c[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    if (localListItemView == null)
    {
      localListItemView = h.h(this.a, null);
      if (this.b.a())
      {
        ColorStateList localColorStateList = localListItemView.c().getTextColors();
        TopHitNumberView localTopHitNumberView = new TopHitNumberView(this.a);
        g.b(this.a, localTopHitNumberView, 2130772386);
        localTopHitNumberView.setTextColor(localColorStateList);
        TextPaint localTextPaint = localTopHitNumberView.getPaint();
        float f = 0.0F;
        float[] arrayOfFloat = new float["0123456789".length()];
        localTextPaint.getTextWidths("0123456789", arrayOfFloat);
        for (int i = 0; i < "0123456789".length(); i++)
          if (arrayOfFloat[i] > f)
            f = arrayOfFloat[i];
        localTopHitNumberView.setLayoutParams(new LinearLayout.LayoutParams((int)(0.5F + 2.0F * f), -2));
        localListItemView.a(localTopHitNumberView);
      }
    }
    Track localTrack = this.c[paramInt];
    localListItemView.a(localTrack.getName());
    if (this.b.a())
      ((TopHitNumberView)localListItemView.e()).a(paramInt + 1);
    if (this.b.b())
      localListItemView.b(localTrack.getArtistString());
    return localListItemView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
