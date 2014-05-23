package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.a.c;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View;;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class ListPopupWindow
{
  private boolean A;
  int a = 2147483647;
  private Context b;
  private PopupWindow c;
  private ListAdapter d;
  private s e;
  private int f = -2;
  private int g = -2;
  private int h;
  private int i;
  private boolean j;
  private boolean k = false;
  private boolean l = false;
  private View m;
  private int n = 0;
  private DataSetObserver o;
  private View p;
  private Drawable q;
  private AdapterView.OnItemClickListener r;
  private AdapterView.OnItemSelectedListener s;
  private final x t = new x(this, (byte)0);
  private final w u = new w(this, (byte)0);
  private final v v = new v(this, (byte)0);
  private final t w = new t(this, (byte)0);
  private Runnable x;
  private Handler y = new Handler();
  private Rect z = new Rect();

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, c.j);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, c.j);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.b = paramContext;
    this.c = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.c.setInputMethodMode(1);
  }

  public final void a()
  {
    this.n = 0;
  }

  public final void a(int paramInt)
  {
    this.h = paramInt;
  }

  public final void a(Drawable paramDrawable)
  {
    this.c.setBackgroundDrawable(paramDrawable);
  }

  public final void a(View paramView)
  {
    this.p = paramView;
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.r = paramOnItemClickListener;
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (this.o == null)
      this.o = new u(this, (byte)0);
    while (true)
    {
      this.d = paramListAdapter;
      if (this.d != null)
        paramListAdapter.registerDataSetObserver(this.o);
      if (this.e != null)
        this.e.setAdapter(this.d);
      return;
      if (this.d != null)
        this.d.unregisterDataSetObserver(this.o);
    }
  }

  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.c.setOnDismissListener(paramOnDismissListener);
  }

  public final void b()
  {
    this.A = true;
    this.c.setFocusable(true);
  }

  public final void b(int paramInt)
  {
    this.i = paramInt;
    this.j = true;
  }

  public final Drawable c()
  {
    return this.c.getBackground();
  }

  public final void c(int paramInt)
  {
    Drawable localDrawable = this.c.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.z);
      this.g = (paramInt + (this.z.left + this.z.right));
      return;
    }
    this.g = paramInt;
  }

  public final View d()
  {
    return this.p;
  }

  public final void d(int paramInt)
  {
    s locals = this.e;
    if ((this.c.isShowing()) && (locals != null))
    {
      s.a(locals, false);
      locals.setSelection(paramInt);
      if (locals.getChoiceMode() != 0)
        locals.setItemChecked(paramInt, true);
    }
  }

  public void e()
  {
    int i1 = 1;
    int i2 = -1;
    s locals;
    View localView3;
    Object localObject;
    LinearLayout.LayoutParams localLayoutParams2;
    label255: LinearLayout.LayoutParams localLayoutParams3;
    if (this.e == null)
    {
      Context localContext = this.b;
      this.x = new ListPopupWindow.1(this);
      if (!this.A)
      {
        int i19 = i1;
        this.e = new s(localContext, i19);
        if (this.q != null)
          this.e.setSelector(this.q);
        this.e.setAdapter(this.d);
        this.e.setOnItemClickListener(this.r);
        this.e.setFocusable(i1);
        this.e.setFocusableInTouchMode(i1);
        this.e.setOnItemSelectedListener(new ListPopupWindow.2(this));
        this.e.setOnScrollListener(this.v);
        if (this.s != null)
          this.e.setOnItemSelectedListener(this.s);
        locals = this.e;
        localView3 = this.m;
        if (localView3 == null)
          break label1290;
        localObject = new LinearLayout(localContext);
        ((LinearLayout)localObject).setOrientation(i1);
        localLayoutParams2 = new LinearLayout.LayoutParams(i2, 0, 1.0F);
        switch (this.n)
        {
        default:
          Log.e("ListPopupWindow", "Invalid hint position " + this.n);
          localView3.measure(View.MeasureSpec.makeMeasureSpec(this.g, -2147483648), 0);
          localLayoutParams3 = (LinearLayout.LayoutParams)localView3.getLayoutParams();
        case 1:
        case 0:
        }
      }
    }
    label780: label1042: label1047: label1058: label1069: for (int i3 = localView3.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin; ; i3 = 0)
    {
      this.c.setContentView((View)localObject);
      label309: label579: label972: label1231: 
      while (true)
      {
        Drawable localDrawable = this.c.getBackground();
        int i4;
        label369: label383: View localView2;
        int i7;
        Rect localRect;
        int[] arrayOfInt;
        int i8;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.z);
          i4 = this.z.top + this.z.bottom;
          if (!this.j)
            this.i = (-this.z.top);
          if (this.c.getInputMethodMode() != 2)
            break label780;
          int i5 = i1;
          localView2 = this.p;
          i7 = this.i;
          localRect = new Rect();
          localView2.getWindowVisibleDisplayFrame(localRect);
          arrayOfInt = new int[2];
          localView2.getLocationOnScreen(arrayOfInt);
          i8 = localRect.bottom;
          if (i5 == 0)
            break label1277;
        }
        label596: label615: label622: label1017: label1277: for (int i9 = localView2.getContext().getResources().getDisplayMetrics().heightPixels; ; i9 = i8)
        {
          int i10 = Math.max(i9 - (arrayOfInt[i1] + localView2.getHeight()) - i7, i7 + (arrayOfInt[i1] - localRect.top));
          if (this.c.getBackground() != null)
          {
            this.c.getBackground().getPadding(this.z);
            i10 -= this.z.top + this.z.bottom;
          }
          int i11;
          int i14;
          int i15;
          PopupWindow localPopupWindow2;
          if ((this.k) || (this.f == i2))
          {
            i11 = i10 + i4;
            boolean bool2 = j();
            if (!this.c.isShowing())
              break label1047;
            if (this.g != i2)
              break label942;
            i14 = i2;
            if (this.f != i2)
              break label1017;
            if (!bool2)
              break label972;
            i15 = i11;
            if (!bool2)
              break label983;
            PopupWindow localPopupWindow4 = this.c;
            if (this.g != i2)
              break label978;
            localPopupWindow4.setWindowLayoutMode(i2, 0);
            localPopupWindow2 = this.c;
            if ((this.l) || (this.k))
              break label1042;
          }
          boolean bool1;
          while (true)
          {
            localPopupWindow2.setOutsideTouchable(i1);
            this.c.update(this.p, this.h, this.i, i14, i15);
            return;
            int i20 = 0;
            break;
            ((LinearLayout)localObject).addView(locals, localLayoutParams2);
            ((LinearLayout)localObject).addView(localView3);
            break label255;
            ((LinearLayout)localObject).addView(localView3);
            ((LinearLayout)localObject).addView(locals, localLayoutParams2);
            break label255;
            this.c.getContentView();
            View localView1 = this.m;
            if (localView1 == null)
              break label1284;
            LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
            i3 = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
            break label309;
            this.z.setEmpty();
            i4 = 0;
            break label369;
            int i6 = 0;
            break label383;
            int i17;
            switch (this.g)
            {
            default:
              i17 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              int i18 = this.e.a(i17, i10 - i3);
              if (i18 > 0)
                i3 += i4;
              i11 = i3 + i18;
              break;
              i17 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), -2147483648);
              continue;
              i17 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), 1073741824);
            }
            if (this.g == -2)
            {
              i14 = this.p.getWidth();
              break label579;
            }
            i14 = this.g;
            break label579;
            i15 = i2;
            break label596;
            i2 = 0;
            break label615;
            PopupWindow localPopupWindow3 = this.c;
            if (this.g == i2);
            for (int i16 = i2; ; i16 = 0)
            {
              localPopupWindow3.setWindowLayoutMode(i16, i2);
              break;
            }
            if (this.f == -2)
            {
              i15 = i11;
              break label622;
            }
            i15 = this.f;
            break label622;
            bool1 = false;
          }
          int i12;
          int i13;
          PopupWindow localPopupWindow1;
          if (this.g == i2)
          {
            i12 = i2;
            if (this.f != i2)
              break label1231;
            i13 = i2;
            this.c.setWindowLayoutMode(i12, i13);
            localPopupWindow1 = this.c;
            if ((this.l) || (this.k))
              break label1272;
          }
          while (true)
          {
            localPopupWindow1.setOutsideTouchable(bool1);
            this.c.setTouchInterceptor(this.u);
            this.c.showAsDropDown(this.p, this.h, this.i);
            this.e.setSelection(i2);
            if ((!this.A) || (this.e.isInTouchMode()))
              h();
            if (this.A)
              break;
            this.y.post(this.w);
            return;
            if (this.g == -2)
            {
              this.c.setWidth(this.p.getWidth());
              i12 = 0;
              break label1058;
            }
            this.c.setWidth(this.g);
            i12 = 0;
            break label1058;
            if (this.f == -2)
            {
              this.c.setHeight(i11);
              i13 = 0;
              break label1069;
            }
            this.c.setHeight(this.f);
            i13 = 0;
            break label1069;
            bool1 = false;
          }
        }
        label978: label983: label1272: i3 = 0;
      }
      label942: localObject = locals;
    }
  }

  public final void f()
  {
    this.c.dismiss();
    if (this.m != null)
    {
      ViewParent localViewParent = this.m.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.m);
    }
    this.c.setContentView(null);
    this.e = null;
    this.y.removeCallbacks(this.t);
  }

  public final void g()
  {
    this.c.setInputMethodMode(2);
  }

  public final void h()
  {
    s locals = this.e;
    if (locals != null)
    {
      s.a(locals, true);
      locals.requestLayout();
    }
  }

  public final boolean i()
  {
    return this.c.isShowing();
  }

  public final boolean j()
  {
    return this.c.getInputMethodMode() == 2;
  }

  public final ListView k()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ListPopupWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
