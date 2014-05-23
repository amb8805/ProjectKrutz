package com.twitter.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class TabIndicator extends RelativeLayout
{
  private ImageView a;
  private ImageView b;
  private TextView c;
  private boolean d;

  public TabIndicator(Context paramContext)
  {
    super(paramContext);
  }

  public TabIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TabIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static TabIndicator a(LayoutInflater paramLayoutInflater, int paramInt1, TabHost paramTabHost, int paramInt2, int paramInt3)
  {
    TabIndicator localTabIndicator = (TabIndicator)paramLayoutInflater.inflate(paramInt1, paramTabHost.getTabWidget(), false);
    localTabIndicator.b.setImageResource(paramInt2);
    if (paramInt3 > 0)
      localTabIndicator.c.setText(paramInt3);
    return localTabIndicator;
  }

  public static TabIndicator a(LayoutInflater paramLayoutInflater, TabHost paramTabHost, int paramInt)
  {
    return a(paramLayoutInflater, 2130903069, paramTabHost, paramInt, 0);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean == this.d)
      return;
    if (paramBoolean)
      this.a.setVisibility(0);
    while (true)
    {
      this.d = paramBoolean;
      return;
      this.a.setVisibility(8);
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    this.b.setImageState(getDrawableState(), true);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((ImageView)findViewById(2131165267));
    this.a = ((ImageView)findViewById(2131165268));
    this.c = ((TextView)findViewById(2131165215));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.TabIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
