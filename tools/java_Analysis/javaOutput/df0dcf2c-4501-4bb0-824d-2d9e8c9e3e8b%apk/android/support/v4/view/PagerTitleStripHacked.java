package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Locale;

public class PagerTitleStripHacked extends ViewGroup
  implements bn
{
  private static final String b = PagerTitleStripHacked.class.getSimpleName();
  private static final int[] l = { 16842804, 16842904, 16842901 };
  ViewPager a;
  private TextView c;
  private TextView d;
  private TextView e;
  private int f = -1;
  private float g = -1.0F;
  private int h;
  private boolean i;
  private boolean j;
  private final am k = new am(this, (byte)0);

  public PagerTitleStripHacked(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView1 = new TextView(paramContext);
    this.c = localTextView1;
    addView(localTextView1);
    TextView localTextView2 = new TextView(paramContext);
    this.d = localTextView2;
    addView(localTextView2);
    TextView localTextView3 = new TextView(paramContext);
    this.e = localTextView3;
    addView(localTextView3);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l);
    int m = localTypedArray.getResourceId(0, 0);
    if (m != 0)
    {
      this.c.setTextAppearance(paramContext, m);
      this.d.setTextAppearance(paramContext, m);
      this.e.setTextAppearance(paramContext, m);
    }
    if (localTypedArray.hasValue(1))
    {
      int i2 = localTypedArray.getColor(1, 0);
      this.c.setTextColor(i2);
      this.d.setTextColor(i2);
      this.e.setTextColor(i2);
    }
    int n = localTypedArray.getDimensionPixelSize(2, 0);
    if (n != 0)
    {
      this.c.setTextSize(0, n);
      this.d.setTextSize(0, n);
      this.e.setTextSize(0, n);
    }
    localTypedArray.recycle();
    int i1 = 0x99000000 | 0xFFFFFF & this.c.getTextColors().getDefaultColor();
    this.c.setTextColor(i1);
    this.e.setTextColor(i1);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    this.e.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setSingleLine();
    this.d.setSingleLine();
    this.e.setSingleLine();
    this.h = (int)(16.0F * paramContext.getResources().getDisplayMetrics().density);
  }

  final void a(int paramInt, float paramFloat)
  {
    if (paramInt != this.f)
      a(paramInt, this.a.a());
    this.j = true;
    int m = this.c.getMeasuredWidth();
    int n = this.d.getMeasuredWidth();
    int i1 = this.e.getMeasuredWidth();
    int i2 = n / 2;
    int i3 = getWidth();
    int i4 = getPaddingLeft();
    int i5 = getPaddingRight();
    int i6 = getPaddingTop();
    int i7 = i4 + i2;
    int i8 = i5 + i2;
    int i9 = i3 - i7 - i8;
    float f1 = 0.5F + paramFloat;
    if (f1 > 1.0F)
      f1 -= 1.0F;
    int i10 = i3 - i8 - (int)(f1 * i9) - i2;
    int i11 = n + i10;
    this.d.layout(i10, i6, i11, i6 + this.d.getMeasuredHeight());
    int i12 = Math.min(i4, i10 - this.h - m);
    this.c.layout(i12, i6, m + i12, i6 + this.c.getMeasuredHeight());
    int i13 = Math.max(i3 - i5 - i1, i11 + this.h);
    this.e.layout(i13, i6, i13 + i1, i6 + this.e.getMeasuredHeight());
    this.g = paramFloat;
    this.j = false;
  }

  final void a(int paramInt, ah paramah)
  {
    int m;
    if (paramah != null)
    {
      m = paramah.b();
      this.i = true;
      if ((paramInt <= 0) || (paramah == null))
        break label256;
    }
    label256: for (String str1 = paramah.b(paramInt - 1).toString().toUpperCase(Locale.getDefault()); ; str1 = null)
    {
      this.c.setText(str1);
      TextView localTextView = this.d;
      if (paramah != null);
      for (String str2 = paramah.b(paramInt).toString().toUpperCase(Locale.getDefault()); ; str2 = null)
      {
        localTextView.setText(str2);
        int n = paramInt + 1;
        String str3 = null;
        if (n < m)
        {
          str3 = null;
          if (paramah != null)
            str3 = paramah.b(paramInt + 1).toString().toUpperCase(Locale.getDefault());
        }
        this.e.setText(str3);
        int i1 = getWidth() - getPaddingLeft() - getPaddingRight();
        int i2 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i3 = View.MeasureSpec.makeMeasureSpec((int)(0.8F * i1), -2147483648);
        int i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.c.measure(i3, i4);
        this.d.measure(i3, i4);
        this.e.measure(i3, i4);
        this.f = paramInt;
        if (!this.j)
          a(paramInt, this.g);
        this.i = false;
        return;
        m = 0;
        break;
      }
    }
  }

  final void a(ah paramah1, ah paramah2)
  {
    if (paramah1 != null)
      paramah1.b(this.k);
    if (paramah2 != null)
      paramah2.a(this.k);
    if (this.a != null)
    {
      this.f = -1;
      this.g = -1.0F;
      a(this.a.b(), paramah2);
      requestLayout();
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if (!(localViewParent instanceof ViewPager))
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    ViewPager localViewPager = (ViewPager)localViewParent;
    ah localah = localViewPager.a();
    localViewPager.b(this.k);
    localViewPager.a(this.k);
    this.a = localViewPager;
    a(null, localah);
  }

  protected void onDetachedFromWindow()
  {
    a(this.a.a(), null);
    this.a.b(null);
    this.a.a(null);
    this.a = null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
      a(this.a.b(), 0.0F);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    if (m != 1073741824)
      throw new IllegalStateException("Must measure with an exact width");
    Drawable localDrawable = getBackground();
    int i3 = 0;
    if (localDrawable != null)
      i3 = localDrawable.getIntrinsicHeight();
    int i4 = getPaddingTop() + getPaddingBottom();
    int i5 = i2 - i4;
    int i6 = View.MeasureSpec.makeMeasureSpec((int)(0.8F * i1), -2147483648);
    int i7 = View.MeasureSpec.makeMeasureSpec(i5, n);
    this.c.measure(i6, i7);
    this.d.measure(i6, i7);
    this.e.measure(i6, i7);
    if (n == 1073741824)
    {
      setMeasuredDimension(i1, i2);
      return;
    }
    setMeasuredDimension(i1, Math.max(i3, i4 + this.d.getMeasuredHeight()));
  }

  public void requestLayout()
  {
    if (!this.i)
      super.requestLayout();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.PagerTitleStripHacked
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
