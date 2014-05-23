package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ds;

public class ArtistHeaderView extends RelativeLayout
{
  private TextView a;
  private TextView b;
  private PlayableImageHeaderView c;
  private String d;
  private a e = (a)c.a(a.class);
  private d f = (d)c.a(d.class);
  private ViewUri.Verified g;
  private n h = new ArtistHeaderView.1(this);

  public ArtistHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public ArtistHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ArtistHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(int paramInt)
  {
    this.c.a(paramInt);
  }

  protected void onFinishInflate()
  {
    this.a = ((TextView)findViewById(2131362314));
    this.b = ((TextView)findViewById(2131362455));
    this.c = ((PlayableImageHeaderView)findViewById(2131362454));
    this.c.b(2130837635);
    if (getResources().getConfiguration().orientation == 2)
    {
      a(2130838194);
      return;
    }
    a(2130837635);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (ds.b(getContext()))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = (int)getResources().getFraction(2131492864, i, i);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
    setMeasuredDimension(i, j);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof View.BaseSavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    super.onRestoreInstanceState(((View.BaseSavedState)paramParcelable).getSuperState());
    this.c.onRestoreInstanceState(paramParcelable);
  }

  protected Parcelable onSaveInstanceState()
  {
    super.onSaveInstanceState();
    return this.c.onSaveInstanceState();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.ArtistHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
