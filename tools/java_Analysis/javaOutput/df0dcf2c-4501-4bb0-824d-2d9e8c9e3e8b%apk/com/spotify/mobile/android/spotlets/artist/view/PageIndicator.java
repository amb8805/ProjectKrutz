package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ah;
import android.support.v4.view.br;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PageIndicator extends LinearLayout
  implements br
{
  private ViewPager a;
  private br b;
  private TextView c;
  private TextView d;

  public PageIndicator(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public PageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  private void a()
  {
    LayoutInflater.from(getContext()).inflate(2130903202, this);
    this.c = ((TextView)findViewById(2131362538));
    this.d = ((TextView)findViewById(2131362539));
  }

  private void b()
  {
    this.c.setText(String.valueOf(1 + this.a.b()));
    TextView localTextView = this.d;
    if (this.a.a() == null);
    for (int i = 0; ; i = this.a.a().b())
    {
      localTextView.setText(String.valueOf(i));
      return;
    }
  }

  public final void a(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
    b();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.b != null)
      this.b.a(paramInt1, paramFloat, paramInt2);
    b();
  }

  public final void a(ViewPager paramViewPager)
  {
    this.a = paramViewPager;
    this.a.a(null);
    this.a.a(this);
    b();
  }

  public final void b(int paramInt)
  {
    if (this.b != null)
      this.b.b(paramInt);
    b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.PageIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
