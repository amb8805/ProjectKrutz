package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.c;
import com.spotify.android.paste.d;

public class DialogLayout extends LinearLayout
{
  private Button a;
  private Button b;
  private Button c;
  private Button d;
  private Button e;
  private Button f;
  private LinearLayout g;
  private TextView h;
  private TextView i;
  private ViewGroup j;
  private ImageView k;
  private View l;
  private View m;
  private CharSequence n;
  private CharSequence o;
  private View.OnClickListener p;
  private View.OnClickListener q;

  public DialogLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public DialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f.a(DialogLayout.class, this);
    inflate(paramContext, d.a, this);
    this.c = ((Button)findViewById(c.g));
    this.e = ((Button)findViewById(c.k));
    this.f = ((Button)findViewById(c.j));
    this.d = ((Button)findViewById(c.i));
    this.g = ((LinearLayout)findViewById(c.c));
    this.h = ((TextView)findViewById(c.o));
    this.i = ((TextView)findViewById(c.b));
    this.j = ((ViewGroup)findViewById(c.d));
    this.k = ((ImageView)findViewById(c.f));
    this.m = findViewById(c.p);
  }

  private void c()
  {
    if ((this.n == null) && (this.o == null))
    {
      this.g.setVisibility(8);
      this.b = null;
      this.a = null;
    }
    do
    {
      return;
      this.g.setVisibility(0);
      if ((this.n != null) && (this.o != null))
      {
        this.d.setVisibility(0);
        this.c.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 11)
        {
          this.c.setText(this.o);
          this.c.setOnClickListener(this.q);
          this.d.setText(this.n);
          this.d.setOnClickListener(this.p);
          this.a = this.d;
          this.b = this.c;
          return;
        }
        this.d.setText(this.o);
        this.d.setOnClickListener(this.q);
        this.c.setText(this.n);
        this.c.setOnClickListener(this.p);
        this.a = this.c;
        this.b = this.d;
        return;
      }
      this.d.setVisibility(8);
      this.c.setVisibility(8);
      if (this.n != null)
      {
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.e.setText(this.n);
        this.e.setOnClickListener(this.p);
        this.a = this.e;
        this.b = null;
      }
    }
    while (this.o == null);
    this.f.setVisibility(0);
    this.e.setVisibility(8);
    this.f.setText(this.o);
    this.f.setOnClickListener(this.q);
    this.b = this.f;
    this.a = null;
  }

  public final Button a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    a(getResources().getText(paramInt));
  }

  public final void a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    a(getResources().getText(paramInt), paramOnClickListener);
  }

  public final void a(View paramView)
  {
    if (this.l != null)
      this.j.removeView(this.l);
    if (paramView == null)
    {
      this.j.setVisibility(8);
      return;
    }
    this.l = paramView;
    this.j.addView(paramView, -1, -2);
    this.j.setVisibility(0);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.h.setText(paramCharSequence);
    this.m.setVisibility(0);
  }

  public final void a(CharSequence paramCharSequence, View.OnClickListener paramOnClickListener)
  {
    this.n = paramCharSequence;
    this.p = paramOnClickListener;
    c();
  }

  public final Button b()
  {
    return this.a;
  }

  public final void b(int paramInt)
  {
    this.k.setVisibility(0);
    this.k.setImageResource(paramInt);
  }

  public final void b(int paramInt, View.OnClickListener paramOnClickListener)
  {
    b(getResources().getText(paramInt), paramOnClickListener);
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.i.setText(paramCharSequence);
    this.i.setVisibility(0);
  }

  public final void b(CharSequence paramCharSequence, View.OnClickListener paramOnClickListener)
  {
    this.o = paramCharSequence;
    this.q = paramOnClickListener;
    c();
  }

  public final void c(int paramInt)
  {
    b(getResources().getText(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.DialogLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
