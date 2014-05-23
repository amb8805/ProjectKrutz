package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ah;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.b;
import com.spotify.android.paste.c;

public class HeaderView extends ViewGroup
{
  private final ViewPager a;
  private final ViewPagerIndicator b;
  private LinearLayout c;
  private ImageView d;
  private TextView e;
  private View f;
  private e g = new e(this, (byte)0);
  private ah h;
  private GestureDetector i;
  private boolean j;
  private TypedValue k = new TypedValue();
  private DataSetObserver l = new HeaderView.1(this);

  public HeaderView(Context paramContext)
  {
    this(paramContext, null);
  }

  public HeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.o);
  }

  public HeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    f.a(HeaderView.class, this);
    this.a = new HeaderView.2(this, paramContext);
    this.c = ((LinearLayout)LayoutInflater.from(paramContext).inflate(com.spotify.android.paste.d.c, this.a, false));
    this.d = ((ImageView)this.c.findViewById(c.f));
    this.e = ((TextView)this.c.findViewById(c.o));
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.spotify.android.paste.e.k, paramInt, 0);
    a(localTypedArray.getString(0));
    int m = localTypedArray.getResourceId(1, 0);
    if (m != 0)
      g.a(paramContext, this.e, m);
    if (!localTypedArray.getValue(2, this.k))
      this.k = null;
    localTypedArray.recycle();
    this.a.a(this.g);
    int n = com.spotify.android.paste.graphics.d.a(8.0F, paramContext.getResources());
    this.b = new ViewPagerIndicator(paramContext);
    this.b.setPadding(n, 0, n, n);
    this.b.a(this.a);
    addView(this.a);
    addView(this.b);
    this.i = new GestureDetector(paramContext, new HeaderView.3(this));
  }

  public final ImageView a()
  {
    return this.d;
  }

  public final void a(ah paramah)
  {
    if (this.h != null)
      this.h.b(this.l);
    this.h = paramah;
    if (this.h != null)
      this.h.a(this.l);
    this.g.c();
  }

  public final void a(View paramView)
  {
    if (this.f == paramView);
    do
    {
      return;
      if (this.f != null)
        this.c.removeView(this.f);
      this.f = paramView;
    }
    while (paramView == null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.topMargin = com.spotify.android.paste.graphics.d.b(10.0F, getResources());
    paramView.setLayoutParams(localLayoutParams);
    this.c.addView(paramView);
  }

  public final void a(String paramString)
  {
    this.e.setText(paramString);
    TextView localTextView = this.e;
    if (TextUtils.isEmpty(paramString));
    for (int m = 8; ; m = 0)
    {
      localTextView.setVisibility(m);
      return;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = paramInt3 - paramInt1;
    this.a.layout(0, 0, this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    int n = 0 + (m - this.b.getMeasuredWidth()) / 2;
    int i1 = 0 + this.a.getMeasuredHeight();
    this.b.layout(n, i1, n + this.b.getMeasuredWidth(), i1 + this.b.getMeasuredHeight());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt1);
    if (this.k != null);
    for (int n = (int)this.k.getFraction(m, m); ; n = m / 2)
    {
      this.d.getLayoutParams().width = n;
      this.d.getLayoutParams().height = n;
      this.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      if (View.MeasureSpec.getMode(paramInt2) != 0)
        paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2) - this.b.getMeasuredHeight(), 1073741824);
      this.c.measure(paramInt1, paramInt2);
      this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.getMeasuredHeight(), 1073741824));
      setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight() + this.b.getMeasuredHeight());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.HeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
