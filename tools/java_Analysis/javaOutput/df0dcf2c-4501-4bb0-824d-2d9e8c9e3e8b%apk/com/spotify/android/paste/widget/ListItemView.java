package com.spotify.android.paste.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.c;
import com.spotify.android.paste.d;
import com.spotify.android.paste.e;
import com.spotify.android.paste.widget.internal.ListItemImageView;
import com.spotify.android.paste.widget.internal.a;

public class ListItemView extends LinearLayout
{
  private static final int[] q = { 16842914 };
  private static final int[] r = { 16842964 };
  private ImageView a;
  private TextView b;
  private TextView c;
  private a d;
  private a e;
  private a f;
  private int g;
  private ColorStateList h;
  private int i;
  private ColorStateList j;
  private boolean k;
  private boolean l;
  private com.spotify.android.paste.widget.internal.b m;
  private boolean n = true;
  private int o;
  private boolean p;

  public ListItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, com.spotify.android.paste.b.p);
  }

  public ListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    f.a(ListItemView.class, this);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, r, paramInt, 0);
    Drawable localDrawable = localTypedArray1.getDrawable(0);
    localTypedArray1.recycle();
    g.a(this, localDrawable);
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, e.m, paramInt, 0);
    int i1 = localTypedArray2.getResourceId(0, 0);
    ColorStateList localColorStateList = localTypedArray2.getColorStateList(1);
    this.g = localTypedArray2.getResourceId(2, 0);
    this.h = localTypedArray2.getColorStateList(3);
    this.i = localTypedArray2.getResourceId(4, 0);
    this.j = localTypedArray2.getColorStateList(5);
    int i2 = localTypedArray2.getDimensionPixelOffset(6, 0);
    int i3 = localTypedArray2.getDimensionPixelOffset(7, 0);
    int i4 = localTypedArray2.getDimensionPixelSize(8, 0);
    this.o = localTypedArray2.getDimensionPixelSize(9, 0);
    localTypedArray2.recycle();
    setPadding(i2, 0, i2, 0);
    setMinimumHeight(i3);
    setOrientation(0);
    setGravity(16);
    inflate(paramContext, d.d, this);
    this.b = ((TextView)findViewById(c.o));
    this.c = ((TextView)findViewById(c.l));
    if (i1 != 0)
      g.a(paramContext, this.b, i1);
    if (this.g != 0)
      g.a(paramContext, this.c, this.g);
    if (localColorStateList != null)
      this.b.setTextColor(localColorStateList);
    if (this.h != null)
      this.c.setTextColor(this.h);
    this.d = new a((ViewGroup)findViewById(c.h));
    this.e = new a((ViewGroup)findViewById(c.m));
    this.f = new a((ViewGroup)findViewById(c.a));
    this.a = new ListItemImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.a.setLayoutParams(new LinearLayout.LayoutParams(i4, i4));
    b(false);
    this.m = new com.spotify.android.paste.widget.internal.b(getContext());
    setWillNotDraw(false);
  }

  public final ImageView a()
  {
    if (this.d.b() != this.a)
      throw new IllegalStateException("This ListItemView has a prefix view set.");
    return this.a;
  }

  public final void a(View paramView)
  {
    this.d.a(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public final TextView b()
  {
    return this.b;
  }

  public final void b(View paramView)
  {
    this.f.a(paramView);
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (this.l)
    {
      this.l = false;
      g.a(getContext(), this.c, this.g);
      if (this.h != null)
        this.c.setTextColor(this.h);
    }
    TextView localTextView = this.c;
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    int i1 = 0;
    if (bool)
      i1 = 8;
    localTextView.setVisibility(i1);
    this.c.setText(paramCharSequence);
  }

  public final void b(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.d.a(this.a);
      this.f.c();
      this.e.c();
      this.n = true;
    }
    this.a.setImageResource(0);
    a("");
    b("");
    c(false);
    setActivated(false);
  }

  public final TextView c()
  {
    return this.c;
  }

  public final void c(View paramView)
  {
    this.e.a(paramView);
  }

  public final void c(CharSequence paramCharSequence)
  {
    if (!this.l)
    {
      this.l = true;
      g.a(getContext(), this.c, this.i);
      if (this.j != null)
        this.c.setTextColor(this.j);
    }
    TextView localTextView = this.c;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i1 = 8; ; i1 = 0)
    {
      localTextView.setVisibility(i1);
      this.c.setText(paramCharSequence);
      return;
    }
  }

  public final void c(boolean paramBoolean)
  {
    this.k = paramBoolean;
    refreshDrawableState();
  }

  public final void d()
  {
    b(false);
  }

  public final View e()
  {
    return this.d.b();
  }

  public final View f()
  {
    return this.f.b();
  }

  public final void g()
  {
    this.p = true;
    setTouchDelegate(null);
  }

  public final View h()
  {
    return this.e.b();
  }

  @TargetApi(11)
  public boolean isActivated()
  {
    if (Build.VERSION.SDK_INT >= 11)
      return super.isActivated();
    return false;
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.k)
      mergeDrawableStates(arrayOfInt, q);
    return arrayOfInt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.n)
      this.m.a(paramCanvas, getWidth(), getHeight());
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.p) && (this.f.b() != null) && (getTouchDelegate() == null))
    {
      ViewGroup localViewGroup = (ViewGroup)findViewById(c.a);
      Rect localRect = new Rect();
      localViewGroup.getHitRect(localRect);
      int i1 = this.o - (localRect.right - localRect.left);
      int i2 = this.o - (localRect.bottom - localRect.top);
      if ((i1 > 0) || (i2 > 0))
      {
        if (i1 > 0)
        {
          localRect.left -= i1 / 2;
          localRect.right += i1 / 2;
        }
        if (i2 > 0)
        {
          localRect.top -= i2 / 2;
          localRect.bottom += i2 / 2;
        }
        setTouchDelegate(new TouchDelegate(localRect, localViewGroup));
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.d.a();
    this.f.a();
    this.e.a();
    super.onMeasure(paramInt1, paramInt2);
  }

  @TargetApi(11)
  public void setActivated(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 11)
      super.setActivated(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.ListItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
