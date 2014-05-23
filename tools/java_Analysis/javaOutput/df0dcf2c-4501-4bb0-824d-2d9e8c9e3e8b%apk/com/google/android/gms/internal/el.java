package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.plus.a;

public class el extends LinearLayout
  implements c, d
{
  private static final int l = Color.parseColor("#666666");
  protected boolean a;
  protected int b = 0;
  protected final LinearLayout c;
  protected final FrameLayout d;
  protected final CompoundButton e;
  protected final bi f;
  protected int g = 1;
  protected a h;
  protected ay i;
  protected final Resources j;
  protected final LayoutInflater k;
  private final ProgressBar m;
  private final aw[] n = new aw[4];
  private int o = 2;
  private int p = 3;
  private Uri[] q;
  private bg r = new bg(this);

  public el(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f.a(paramContext, "Context must not be null.");
    String str1;
    int i2;
    label98: String str2;
    int i3;
    if (e.a(paramContext) != 0)
    {
      this.j = null;
      this.k = null;
      str1 = h.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, "PlusOneButton");
      if (!"SMALL".equalsIgnoreCase(str1))
        break label263;
      i2 = 0;
      this.p = i2;
      str2 = h.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, "PlusOneButton");
      if (!"INLINE".equalsIgnoreCase(str2))
        break label309;
      i3 = 2;
    }
    Point localPoint;
    while (true)
    {
      this.o = i3;
      localPoint = new Point();
      a(localPoint);
      if (!isInEditMode())
        break label339;
      TextView localTextView = new TextView(paramContext);
      localTextView.setGravity(17);
      localTextView.setText("[ +1 ]");
      addView(localTextView, new LinearLayout.LayoutParams(localPoint.x, localPoint.y));
      this.f = null;
      this.m = null;
      this.e = null;
      this.d = null;
      this.c = null;
      return;
      Context localContext = c();
      this.j = localContext.getResources();
      this.k = ((LayoutInflater)localContext.getSystemService("layout_inflater"));
      break;
      label263: if ("MEDIUM".equalsIgnoreCase(str1))
      {
        i2 = 1;
        break label98;
      }
      if ("TALL".equalsIgnoreCase(str1))
      {
        i2 = 2;
        break label98;
      }
      "STANDARD".equalsIgnoreCase(str1);
      i2 = 3;
      break label98;
      label309: if ("NONE".equalsIgnoreCase(str2))
      {
        i3 = 0;
      }
      else
      {
        "BUBBLE".equalsIgnoreCase(str2);
        i3 = 1;
      }
    }
    label339: setFocusable(true);
    this.c = new LinearLayout(paramContext);
    this.c.setGravity(17);
    this.c.setOrientation(0);
    addView(this.c);
    this.e = new bh(this, paramContext);
    this.e.setBackgroundDrawable(null);
    bi localbi = new bi(paramContext);
    localbi.setFocusable(false);
    localbi.b();
    localbi.a();
    localbi.a(TypedValue.applyDimension(2, a(this.p, this.o), paramContext.getResources().getDisplayMetrics()));
    localbi.a(l);
    localbi.setVisibility(0);
    this.f = localbi;
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setFocusable(false);
    this.d = localFrameLayout;
    this.d.addView(this.e, new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
    b(localPoint);
    ProgressBar localProgressBar = new ProgressBar(paramContext, null, 16843400);
    localProgressBar.setFocusable(false);
    localProgressBar.setIndeterminate(true);
    this.m = localProgressBar;
    this.m.setVisibility(4);
    this.d.addView(this.m, new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
    int i4 = this.n.length;
    while (i1 < i4)
    {
      aw[] arrayOfaw = this.n;
      aw localaw = new aw(getContext());
      localaw.setVisibility(8);
      arrayOfaw[i1] = localaw;
      i1++;
    }
    a(1);
    this.m.setVisibility(4);
    e();
  }

  private static int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 1:
    default:
    case 2:
      do
        return 13;
      while (paramInt2 == 2);
      return 15;
    case 0:
    }
    return 11;
  }

  private void a(int paramInt)
  {
    int i1 = 0;
    int i2 = this.p;
    this.g = paramInt;
    this.p = i2;
    String str;
    label163: LinearLayout.LayoutParams localLayoutParams;
    label213: int i3;
    label224: int i4;
    label242: int i5;
    int i6;
    if (!isInEditMode())
    {
      this.c.removeAllViews();
      Point localPoint = new Point();
      a(localPoint);
      this.e.setLayoutParams(new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
      b(localPoint);
      this.m.setLayoutParams(new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
      if (this.o != 1)
        break label449;
      bi localbi3 = this.f;
      switch (this.p)
      {
      default:
        str = "global_count_bubble_standard";
        localbi3.a(g.a(str));
        f();
        bi localbi1 = this.f;
        switch (this.o)
        {
        default:
          localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
          if (this.p == 2)
          {
            i3 = 1;
            localLayoutParams.bottomMargin = i3;
            if (this.p != 2)
              break label497;
            i4 = 0;
            localLayoutParams.leftMargin = i4;
            localbi1.setLayoutParams(localLayoutParams);
            float f1 = TypedValue.applyDimension(2, a(this.p, this.o), getContext().getResources().getDisplayMetrics());
            this.f.a(f1);
            bi localbi2 = this.f;
            i5 = (int)TypedValue.applyDimension(1, 3.0F, getContext().getResources().getDisplayMetrics());
            i6 = (int)TypedValue.applyDimension(1, 5.0F, getContext().getResources().getDisplayMetrics());
            if (this.o != 2)
              break label503;
            label347: if ((this.p != 2) || (this.o != 1))
              break label509;
            label363: localbi2.setPadding(i6, 0, 0, i5);
            if ((this.p != 2) || (this.o != 1))
              break label515;
            this.c.setOrientation(1);
            this.c.addView(this.f);
            this.c.addView(this.d);
          }
        case 2:
        case 1:
        }
        break;
      case 1:
      case 0:
      case 2:
      }
    }
    while (true)
    {
      requestLayout();
      return;
      str = "global_count_bubble_medium";
      break;
      str = "global_count_bubble_small";
      break;
      str = "global_count_bubble_tall";
      break;
      label449: this.f.a(null);
      break label163;
      localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
      break label213;
      localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      break label213;
      i3 = 0;
      break label224;
      label497: i4 = 1;
      break label242;
      label503: i6 = 0;
      break label347;
      label509: i5 = 0;
      break label363;
      label515: this.c.setOrientation(0);
      this.c.addView(this.d);
      int i7 = this.n.length;
      while (i1 < i7)
      {
        this.c.addView(this.n[i1]);
        i1++;
      }
      this.c.addView(this.f);
    }
  }

  private void a(Point paramPoint)
  {
    int i1 = 24;
    int i2 = 20;
    switch (this.p)
    {
    default:
      int i3 = i1;
      i1 = 38;
      i2 = i3;
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      float f1 = TypedValue.applyDimension(1, i1, localDisplayMetrics);
      float f2 = TypedValue.applyDimension(1, i2, localDisplayMetrics);
      paramPoint.x = (int)(0.5D + f1);
      paramPoint.y = (int)(0.5D + f2);
      return;
      i1 = 32;
      continue;
      i2 = 14;
      continue;
      i1 = 50;
    }
  }

  private void b(Point paramPoint)
  {
    paramPoint.y = (int)(paramPoint.y - TypedValue.applyDimension(1, 6.0F, getResources().getDisplayMetrics()));
    paramPoint.x = paramPoint.y;
  }

  private Context c()
  {
    try
    {
      Context localContext = getContext().createPackageContext("com.google.android.gms", 4);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (Log.isLoggable("PlusOneButton", 5))
        Log.w("PlusOneButton", "Google Play services is not installed");
    }
    return null;
  }

  private void d()
  {
    int i1 = 1;
    int i2 = (int)TypedValue.applyDimension(i1, 5.0F, getContext().getResources().getDisplayMetrics());
    int i3 = (int)TypedValue.applyDimension(i1, 1.0F, getContext().getResources().getDisplayMetrics());
    int i4 = this.n.length;
    int i5 = 0;
    if (i5 < i4)
    {
      LinearLayout.LayoutParams localLayoutParams;
      if (this.n[i5].getVisibility() == 0)
      {
        localLayoutParams = new LinearLayout.LayoutParams(this.n[i5].getLayoutParams());
        if (i1 == 0)
          break label120;
        localLayoutParams.setMargins(i2, 0, i3, 0);
        i1 = 0;
      }
      while (true)
      {
        this.n[i5].setLayoutParams(localLayoutParams);
        i5++;
        break;
        label120: localLayoutParams.setMargins(i3, 0, i3, 0);
      }
    }
  }

  private void e()
  {
    CompoundButton localCompoundButton = this.e;
    Drawable localDrawable;
    if (this.j == null)
    {
      localDrawable = null;
      localCompoundButton.setButtonDrawable(localDrawable);
    }
    switch (this.g)
    {
    default:
      this.e.setEnabled(false);
      this.e.setChecked(false);
      return;
      Resources localResources1 = this.j;
      Resources localResources2 = this.j;
      String str;
      switch (this.p)
      {
      default:
        str = "ic_plusone_standard";
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        localDrawable = localResources1.getDrawable(localResources2.getIdentifier(str, "drawable", "com.google.android.gms"));
        break;
        str = "ic_plusone_small";
        continue;
        str = "ic_plusone_medium";
        continue;
        str = "ic_plusone_tall";
      }
    case 0:
      this.e.setEnabled(true);
      this.e.setChecked(true);
      return;
    case 1:
      this.e.setEnabled(true);
      this.e.setChecked(false);
      return;
    case 2:
    }
    this.e.setEnabled(false);
    this.e.setChecked(true);
  }

  private void f()
  {
    int i1 = 0;
    if ((this.q != null) && (this.o == 2))
    {
      Point localPoint = new Point();
      a(localPoint);
      localPoint.x = localPoint.y;
      int i3 = this.n.length;
      int i4 = this.q.length;
      int i5 = 0;
      if (i5 < i3)
      {
        Uri localUri;
        if (i5 < i4)
        {
          localUri = this.q[i5];
          label78: if (localUri != null)
            break label107;
          this.n[i5].setVisibility(8);
        }
        while (true)
        {
          i5++;
          break;
          localUri = null;
          break label78;
          label107: this.n[i5].setLayoutParams(new LinearLayout.LayoutParams(localPoint.x, localPoint.y));
          this.n[i5].a(localUri, localPoint.y);
          this.n[i5].setVisibility(0);
        }
      }
    }
    else
    {
      int i2 = this.n.length;
      while (i1 < i2)
      {
        this.n[i1].setVisibility(8);
        i1++;
      }
    }
    d();
  }

  public final void a()
  {
    setOnClickListener(new bf(this));
  }

  public final void b()
  {
    a(2);
    this.m.setVisibility(0);
    e();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.h != null)
    {
      if (!this.h.b(this))
        this.h.a(this);
      if (!this.h.b(this))
        this.h.a(this);
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.h != null)
    {
      if (this.h.b(this))
        this.h.c(this);
      if (this.h.b(this))
        this.h.c(this);
    }
  }

  public boolean performClick()
  {
    return this.e.performClick();
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.e.setOnClickListener(paramOnClickListener);
    this.f.setOnClickListener(paramOnClickListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.el
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
