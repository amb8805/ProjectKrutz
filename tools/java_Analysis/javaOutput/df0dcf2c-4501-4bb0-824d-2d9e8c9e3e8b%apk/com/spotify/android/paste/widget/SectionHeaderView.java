package com.spotify.android.paste.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.c;
import com.spotify.android.paste.d;
import com.spotify.android.paste.widget.internal.a;

public class SectionHeaderView extends LinearLayout
{
  private TextView a;
  private a b;
  private View c;

  public SectionHeaderView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SectionHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SectionHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    f.a(SectionHeaderView.class, this);
    setOrientation(1);
    inflate(paramContext, d.f, this);
    this.a = ((TextView)findViewById(c.o));
    this.c = findViewById(c.e);
    this.b = new a((ViewGroup)findViewById(c.a));
  }

  public final void a()
  {
    this.b.c();
    a("");
    a(true);
  }

  public final void a(View paramView)
  {
    this.b.a(paramView);
  }

  public final void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    View localView = this.c;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localView.setVisibility(i);
      return;
    }
  }

  public final TextView b()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.SectionHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
