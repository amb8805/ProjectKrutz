package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import com.spotify.mobile.android.util.cc;

public class PlayButton extends LinearLayout
{
  public static final m a = new PlayButton.4();
  private View b;
  private View c;
  private int d = 0;
  private m e = a;
  private View.OnClickListener f = new PlayButton.1(this);
  private final View.OnLongClickListener g = new PlayButton.2(this);
  private View.OnClickListener h = new PlayButton.3(this);

  public PlayButton(Context paramContext)
  {
    this(paramContext, null);
  }

  public PlayButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130903237, this, true);
    localTypedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, com.spotify.mobile.android.ui.m.B, 0, 0);
    try
    {
      this.d = localTypedArray.getDimensionPixelSize(0, 0);
      localTypedArray.recycle();
      this.b = findViewById(2131362473);
      this.c = findViewById(2131362474);
      this.b.setOnClickListener(this.f);
      this.b.setOnLongClickListener(this.g);
      this.c.setOnClickListener(this.h);
      this.b.setPadding(this.d, this.d, this.d, this.d);
      this.c.setPadding(this.d, this.d, this.d, this.d);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }

  public final void a(m paramm)
  {
    cc.a(paramm, "Don't call setPlayController with null controller");
    this.e = paramm;
  }

  public final void a(boolean paramBoolean)
  {
    int i = 8;
    View localView1 = this.b;
    int j;
    View localView2;
    if (paramBoolean)
    {
      j = i;
      localView1.setVisibility(j);
      localView2 = this.c;
      if (paramBoolean)
        break label44;
    }
    while (true)
    {
      localView2.setVisibility(i);
      return;
      j = 0;
      break;
      label44: i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.PlayButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
