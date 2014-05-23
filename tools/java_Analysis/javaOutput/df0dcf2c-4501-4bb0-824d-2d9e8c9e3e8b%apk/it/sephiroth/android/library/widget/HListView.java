package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View;;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.RemoteViews.RemoteView;
import java.util.ArrayList;

@RemoteViews.RemoteView
public class HListView extends AbsHListView
{
  private boolean aA;
  private boolean aB;
  private boolean aC;
  private boolean aD;
  private boolean aE = true;
  private boolean aF = false;
  private final Rect aG = new Rect();
  private Paint aH;
  private final t aI = new t((byte)0);
  private v aJ;
  Drawable at;
  int au;
  int av;
  Drawable aw;
  Drawable ax;
  private ArrayList<u> ay = new ArrayList();
  private ArrayList<u> az = new ArrayList();

  public HListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, paramContext.getResources().getIdentifier("sephiroth_listViewStyle", "attr", paramContext.getPackageName()));
  }

  public HListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = (int[])a(paramContext, "HListView");
    if (arrayOfInt != null);
    for (TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0); ; localTypedArray = null)
    {
      CharSequence[] arrayOfCharSequence;
      Drawable localDrawable1;
      Drawable localDrawable3;
      Drawable localDrawable2;
      int j;
      boolean bool1;
      boolean bool2;
      int i;
      if (localTypedArray != null)
      {
        arrayOfCharSequence = localTypedArray.getTextArray(0);
        Drawable localDrawable4 = localTypedArray.getDrawable(1);
        Drawable localDrawable5 = localTypedArray.getDrawable(5);
        Drawable localDrawable6 = localTypedArray.getDrawable(6);
        int k = localTypedArray.getDimensionPixelSize(2, 0);
        boolean bool4 = localTypedArray.getBoolean(3, true);
        boolean bool5 = localTypedArray.getBoolean(4, true);
        int m = localTypedArray.getInteger(7, -1);
        localTypedArray.recycle();
        localDrawable1 = localDrawable4;
        localDrawable3 = localDrawable5;
        localDrawable2 = localDrawable6;
        j = k;
        bool1 = bool4;
        bool2 = bool5;
        i = m;
      }
      while (true)
      {
        if (arrayOfCharSequence != null)
          a(new ArrayAdapter(paramContext, 17367043, arrayOfCharSequence));
        if (localDrawable1 != null)
        {
          Log.i("HListView", "setDivider: " + localDrawable1);
          if (localDrawable1 == null)
            break label395;
          this.au = localDrawable1.getIntrinsicWidth();
          this.at = localDrawable1;
          if ((localDrawable1 != null) && (localDrawable1.getOpacity() != -1))
            break label403;
        }
        label395: label403: for (boolean bool3 = true; ; bool3 = false)
        {
          this.aB = bool3;
          requestLayout();
          invalidate();
          if (localDrawable3 != null)
          {
            this.aw = localDrawable3;
            if (getScrollX() < 0)
              invalidate();
          }
          if (localDrawable2 != null)
          {
            this.ax = localDrawable2;
            invalidate();
          }
          if (j != 0)
          {
            Log.i("HListView", "setDividerWidth: " + j);
            this.au = j;
            requestLayout();
            invalidate();
          }
          this.aC = bool1;
          this.aD = bool2;
          this.av = i;
          return;
          this.au = 0;
          break;
        }
        bool1 = true;
        bool2 = true;
        i = -1;
        localDrawable1 = null;
        j = 0;
        localDrawable2 = null;
        localDrawable3 = null;
        arrayOfCharSequence = null;
      }
    }
  }

  private int A()
  {
    return (int)(0.33F * getRight() - getLeft());
  }

  private void B()
  {
    int i = getChildCount();
    int j;
    int k;
    if (i > 0)
    {
      if (this.K)
        break label64;
      j = getChildAt(0).getLeft() - this.u.left;
      if (this.V != 0)
        j -= this.au;
      k = 0;
      if (j >= 0)
        break label114;
    }
    while (true)
    {
      if (k != 0)
        b(-k);
      return;
      label64: j = getChildAt(i - 1).getRight() - (getWidth() - this.u.right);
      if (i + this.V < this.an)
        j += this.au;
      k = 0;
      if (j <= 0)
        label114: k = j;
    }
  }

  private int C()
  {
    return Math.max(2, getHorizontalFadingEdgeLength());
  }

  private View a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHorizontalFadingEdgeLength();
    int j = this.al;
    int k = c(paramInt2, i, j);
    int m = b(paramInt3, i, j);
    View localView = a(j, paramInt1, true, this.u.top, true);
    if (localView.getRight() > m)
      localView.offsetLeftAndRight(-Math.min(localView.getLeft() - k, localView.getRight() - m));
    while (true)
    {
      a(localView, j);
      if (this.K)
        break;
      k(getChildCount());
      return localView;
      if (localView.getLeft() < k)
        localView.offsetLeftAndRight(Math.min(k - localView.getLeft(), m - localView.getRight()));
    }
    l(getChildCount());
    return localView;
  }

  private View a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2)
  {
    if (!this.ai)
    {
      View localView2 = this.p.b(paramInt1);
      if (localView2 != null)
      {
        a(localView2, paramInt1, paramInt2, paramBoolean1, paramInt3, paramBoolean2, true);
        return localView2;
      }
    }
    View localView1 = a(paramInt1, this.P);
    a(localView1, paramInt1, paramInt2, paramBoolean1, paramInt3, paramBoolean2, this.P[0]);
    return localView1;
  }

  private View a(View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHorizontalFadingEdgeLength();
    int j = this.al;
    int k = c(paramInt2, i, j);
    int m = b(paramInt2, i, j);
    if (paramInt1 > 0)
    {
      View localView3 = a(j - 1, paramView1.getLeft(), true, this.u.top, false);
      int i4 = this.au;
      View localView4 = a(j, i4 + localView3.getRight(), true, this.u.top, true);
      if (localView4.getRight() > m)
      {
        int i5 = localView4.getLeft() - k;
        int i6 = localView4.getRight() - m;
        int i7 = (paramInt3 - paramInt2) / 2;
        int i8 = Math.min(Math.min(i5, i6), i7);
        localView3.offsetLeftAndRight(-i8);
        localView4.offsetLeftAndRight(-i8);
      }
      if (!this.K)
      {
        d(-2 + this.al, localView4.getLeft() - i4);
        B();
        c(1 + this.al, i4 + localView4.getRight());
        return localView4;
      }
      c(1 + this.al, i4 + localView4.getRight());
      B();
      d(-2 + this.al, localView4.getLeft() - i4);
      return localView4;
    }
    if (paramInt1 < 0)
    {
      if (paramView2 != null);
      for (View localView2 = a(j, paramView2.getLeft(), true, this.u.top, true); ; localView2 = a(j, paramView1.getLeft(), false, this.u.top, true))
      {
        if (localView2.getLeft() < k)
        {
          int i1 = k - localView2.getLeft();
          int i2 = m - localView2.getRight();
          int i3 = (paramInt3 - paramInt2) / 2;
          localView2.offsetLeftAndRight(Math.min(Math.min(i1, i2), i3));
        }
        a(localView2, j);
        return localView2;
      }
    }
    int n = paramView1.getLeft();
    View localView1 = a(j, n, true, this.u.top, true);
    if ((n < paramInt2) && (localView1.getRight() < paramInt2 + 20))
      localView1.offsetLeftAndRight(paramInt2 - localView1.getLeft());
    a(localView1, j);
    return localView1;
  }

  private void a(Canvas paramCanvas, Rect paramRect)
  {
    Drawable localDrawable = this.at;
    localDrawable.setBounds(paramRect);
    localDrawable.draw(paramCanvas);
  }

  private static void a(Canvas paramCanvas, Drawable paramDrawable, Rect paramRect)
  {
    int i = paramDrawable.getMinimumWidth();
    paramCanvas.save();
    paramCanvas.clipRect(paramRect);
    if (paramRect.right - paramRect.left < i)
      paramRect.left = (paramRect.right - i);
    paramDrawable.setBounds(paramRect);
    paramDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }

  private void a(View paramView, int paramInt)
  {
    int i = this.au;
    if (!this.K)
    {
      d(paramInt - 1, paramView.getLeft() - i);
      B();
      c(paramInt + 1, i + paramView.getRight());
      return;
    }
    c(paramInt + 1, i + paramView.getRight());
    B();
    d(paramInt - 1, paramView.getLeft() - i);
  }

  private void a(View paramView, int paramInt1, int paramInt2)
  {
    AbsHListView.LayoutParams localLayoutParams = (AbsHListView.LayoutParams)paramView.getLayoutParams();
    if (localLayoutParams == null)
    {
      localLayoutParams = (AbsHListView.LayoutParams)generateDefaultLayoutParams();
      paramView.setLayoutParams(localLayoutParams);
    }
    localLayoutParams.a = this.j.getItemViewType(paramInt1);
    localLayoutParams.c = true;
    int i = ViewGroup.getChildMeasureSpec(paramInt2, this.u.top + this.u.bottom, localLayoutParams.height);
    int j = localLayoutParams.width;
    if (j > 0);
    for (int k = View.MeasureSpec.makeMeasureSpec(j, 1073741824); ; k = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(k, i);
      return;
    }
  }

  @TargetApi(11)
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool1;
    int i;
    label27: boolean bool2;
    label55: int k;
    label67: int m;
    label87: AbsHListView.LayoutParams localLayoutParams1;
    if ((paramBoolean2) && (h()))
    {
      bool1 = true;
      if (bool1 == paramView.isSelected())
        break label396;
      i = 1;
      int j = this.F;
      if ((j <= 0) || (j >= 3) || (this.A != paramInt1))
        break label402;
      bool2 = true;
      if (bool2 == paramView.isPressed())
        break label408;
      k = 1;
      if ((paramBoolean3) && (i == 0) && (!paramView.isLayoutRequested()))
        break label414;
      m = 1;
      localLayoutParams1 = (AbsHListView.LayoutParams)paramView.getLayoutParams();
      if (localLayoutParams1 != null)
        break label549;
    }
    label164: label549: for (AbsHListView.LayoutParams localLayoutParams2 = (AbsHListView.LayoutParams)generateDefaultLayoutParams(); ; localLayoutParams2 = localLayoutParams1)
    {
      localLayoutParams2.a = this.j.getItemViewType(paramInt1);
      int i7;
      label233: int i6;
      label297: int i1;
      if (((paramBoolean3) && (!localLayoutParams2.c)) || ((localLayoutParams2.b) && (localLayoutParams2.a == -2)))
        if (paramBoolean1)
        {
          i7 = -1;
          attachViewToParent(paramView, i7, localLayoutParams2);
          if (i != 0)
            paramView.setSelected(bool1);
          if (k != 0)
            paramView.setPressed(bool2);
          if ((this.b != 0) && (this.f != null))
          {
            if (!(paramView instanceof Checkable))
              break label476;
            ((Checkable)paramView).setChecked(this.f.get(paramInt1));
          }
          if (m == 0)
            break label509;
          int i4 = ViewGroup.getChildMeasureSpec(this.v, this.u.top + this.u.bottom, localLayoutParams2.height);
          int i5 = localLayoutParams2.width;
          if (i5 <= 0)
            break label499;
          i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
          paramView.measure(i6, i4);
          i1 = paramView.getMeasuredWidth();
          int i2 = paramView.getMeasuredHeight();
          if (!paramBoolean1)
            break label517;
          label314: if (m == 0)
            break label525;
          int i3 = i2 + paramInt3;
          paramView.layout(paramInt2, paramInt3, i1 + paramInt2, i3);
        }
      while (true)
      {
        if ((this.y) && (!paramView.isDrawingCacheEnabled()))
          paramView.setDrawingCacheEnabled(true);
        if ((Build.VERSION.SDK_INT >= 11) && (paramBoolean3) && (((AbsHListView.LayoutParams)paramView.getLayoutParams()).d != paramInt1))
          paramView.jumpDrawablesToCurrentState();
        return;
        bool1 = false;
        break;
        i = 0;
        break label27;
        bool2 = false;
        break label55;
        k = 0;
        break label67;
        m = 0;
        break label87;
        i7 = 0;
        break label164;
        localLayoutParams2.c = false;
        if (localLayoutParams2.a == -2)
          localLayoutParams2.b = true;
        if (paramBoolean1);
        for (int n = -1; ; n = 0)
        {
          addViewInLayout(paramView, n, localLayoutParams2, true);
          break;
        }
        label476: if (Build.VERSION.SDK_INT < 11)
          break label233;
        paramView.setActivated(this.f.get(paramInt1));
        break label233;
        label499: i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label289;
        label509: cleanupLayoutState(paramView);
        break label297;
        paramInt2 -= i1;
        break label314;
        paramView.offsetLeftAndRight(paramInt2 - paramView.getLeft());
        paramView.offsetTopAndBottom(paramInt3 - paramView.getTop());
      }
    }
  }

  private static void a(ArrayList<u> paramArrayList)
  {
    if (paramArrayList != null)
    {
      int i = paramArrayList.size();
      for (int j = 0; j < i; j++)
      {
        AbsHListView.LayoutParams localLayoutParams = (AbsHListView.LayoutParams)((u)paramArrayList.get(j)).a.getLayoutParams();
        if (localLayoutParams != null)
          localLayoutParams.b = false;
      }
    }
  }

  @TargetApi(11)
  private boolean a(int paramInt1, int paramInt2, KeyEvent paramKeyEvent)
  {
    if ((this.j == null) || (!this.S));
    do
    {
      return false;
      if (this.ai)
        e();
    }
    while (Build.VERSION.SDK_INT < 11);
    int i = paramKeyEvent.getAction();
    if (i != 1);
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = false;
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 66:
    case 62:
    case 92:
    case 93:
    case 122:
    case 123:
    }
    while (true)
    {
      if (!bool)
        break label676;
      return true;
      if (paramKeyEvent.hasNoModifiers())
      {
        bool = n();
        if (!bool)
          for (int k = paramInt2; ; k = paramInt2)
          {
            paramInt2 = k - 1;
            if ((k <= 0) || (!p(33)))
              break;
            bool = true;
          }
      }
      else
      {
        if (!paramKeyEvent.hasModifiers(2))
          break;
        if ((n()) || (n(33)))
        {
          bool = true;
        }
        else
        {
          bool = false;
          continue;
          if (paramKeyEvent.hasNoModifiers())
          {
            bool = n();
            if (!bool)
              for (int j = paramInt2; ; j = paramInt2)
              {
                paramInt2 = j - 1;
                if ((j <= 0) || (!p(130)))
                  break;
                bool = true;
              }
          }
          else
          {
            if (!paramKeyEvent.hasModifiers(2))
              break;
            if ((n()) || (n(130)))
            {
              bool = true;
            }
            else
            {
              bool = false;
              continue;
              if (!paramKeyEvent.hasNoModifiers())
                break;
              bool = o(17);
              continue;
              if (!paramKeyEvent.hasNoModifiers())
                break;
              bool = o(66);
              continue;
              if (!paramKeyEvent.hasNoModifiers())
                break;
              bool = n();
              if ((!bool) && (paramKeyEvent.getRepeatCount() == 0) && (getChildCount() > 0))
              {
                i();
                bool = true;
                continue;
                if (paramKeyEvent.hasNoModifiers())
                  if (!n())
                    m(130);
                while (true)
                {
                  bool = true;
                  break;
                  if ((paramKeyEvent.hasModifiers(1)) && (!n()))
                    m(33);
                }
                if (paramKeyEvent.hasNoModifiers())
                {
                  if ((n()) || (m(33)))
                    bool = true;
                  else
                    bool = false;
                }
                else
                {
                  if (!paramKeyEvent.hasModifiers(2))
                    break;
                  if ((n()) || (n(33)))
                  {
                    bool = true;
                  }
                  else
                  {
                    bool = false;
                    continue;
                    if (paramKeyEvent.hasNoModifiers())
                    {
                      if ((n()) || (m(130)))
                        bool = true;
                      else
                        bool = false;
                    }
                    else
                    {
                      if (!paramKeyEvent.hasModifiers(2))
                        break;
                      if ((n()) || (n(130)))
                      {
                        bool = true;
                      }
                      else
                      {
                        bool = false;
                        continue;
                        if (!paramKeyEvent.hasNoModifiers())
                          break;
                        if ((n()) || (n(33)))
                        {
                          bool = true;
                        }
                        else
                        {
                          bool = false;
                          continue;
                          if (!paramKeyEvent.hasNoModifiers())
                            break;
                          if ((n()) || (n(130)))
                            bool = true;
                          else
                            bool = false;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    switch (i)
    {
    default:
      return false;
    case 0:
      return super.onKeyDown(paramInt1, paramKeyEvent);
    case 1:
      label676: return super.onKeyUp(paramInt1, paramKeyEvent);
    case 2:
    }
    return super.onKeyMultiple(paramInt1, paramInt2, paramKeyEvent);
  }

  private boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2)
      return true;
    ViewParent localViewParent = paramView1.getParent();
    return ((localViewParent instanceof ViewGroup)) && (a((View)localViewParent, paramView2));
  }

  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != -1 + this.an)
      paramInt1 -= paramInt2;
    return paramInt1;
  }

  private static void b(Canvas paramCanvas, Drawable paramDrawable, Rect paramRect)
  {
    int i = paramDrawable.getMinimumWidth();
    paramCanvas.save();
    paramCanvas.clipRect(paramRect);
    if (paramRect.right - paramRect.left < i)
      paramRect.right = (i + paramRect.left);
    paramDrawable.setBounds(paramRect);
    paramDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }

  private void b(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramView.getWidth();
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    int j = ViewGroup.getChildMeasureSpec(this.v, this.u.top + this.u.bottom, localLayoutParams.height);
    int k = localLayoutParams.width;
    if (k > 0);
    for (int m = View.MeasureSpec.makeMeasureSpec(k, 1073741824); ; m = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(m, j);
      if (paramView.getMeasuredWidth() == i)
        break;
      int n = paramView.getMeasuredWidth();
      int i1 = paramView.getMeasuredHeight();
      int i2 = this.u.top;
      int i3 = i1 + i2;
      int i4 = paramView.getLeft();
      paramView.layout(i4, i2, n + i4, i3);
      int i5 = paramView.getMeasuredWidth() - i;
      for (int i6 = paramInt1 + 1; i6 < paramInt2; i6++)
        getChildAt(i6).offsetLeftAndRight(i5);
    }
  }

  private boolean b(View paramView)
  {
    ArrayList localArrayList1 = this.ay;
    int i = localArrayList1.size();
    for (int j = 0; j < i; j++)
      if (paramView == ((u)localArrayList1.get(j)).a)
        return true;
    ArrayList localArrayList2 = this.az;
    int k = localArrayList2.size();
    for (int m = 0; m < k; m++)
      if (paramView == ((u)localArrayList2.get(m)).a)
        return true;
    return false;
  }

  private static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > 0)
      paramInt1 += paramInt2;
    return paramInt1;
  }

  private int c(View paramView)
  {
    paramView.getDrawingRect(this.aG);
    offsetDescendantRectToMyCoords(paramView, this.aG);
    int i = getRight() - getLeft() - this.u.right;
    int k;
    if (this.aG.right < this.u.left)
      k = this.u.left - this.aG.right;
    int j;
    do
    {
      return k;
      j = this.aG.left;
      k = 0;
    }
    while (j <= i);
    return this.aG.left - i;
  }

  private View c(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    int i = getRight() - getLeft();
    int j = paramInt2;
    int k = paramInt1;
    boolean bool;
    label47: Object localObject2;
    if ((j < i) && (k < this.an))
      if (k == this.al)
      {
        bool = true;
        localObject2 = a(k, j, true, this.u.top, bool);
        j = ((View)localObject2).getRight() + this.au;
        if (!bool)
          break label116;
      }
    while (true)
    {
      k++;
      localObject1 = localObject2;
      break;
      bool = false;
      break label47;
      getChildCount();
      return localObject1;
      label116: localObject2 = localObject1;
    }
  }

  private View d(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    int i = paramInt2;
    int j = paramInt1;
    boolean bool;
    label30: Object localObject2;
    if ((i > 0) && (j >= 0))
      if (j == this.al)
      {
        bool = true;
        localObject2 = a(j, i, false, this.u.top, bool);
        i = ((View)localObject2).getLeft() - this.au;
        if (!bool)
          break label107;
      }
    while (true)
    {
      j--;
      localObject1 = localObject2;
      break;
      bool = false;
      break label30;
      this.V = (j + 1);
      getChildCount();
      return localObject1;
      label107: localObject2 = localObject1;
    }
  }

  private int e(int paramInt1, int paramInt2)
  {
    Log.i("HListView", "measureWidthOfChildren, from 0 to -1");
    ListAdapter localListAdapter = this.j;
    if (localListAdapter == null)
    {
      paramInt2 = this.u.left + this.u.right;
      return paramInt2;
    }
    int i = this.u.left + this.u.right;
    int j;
    label75: j localj;
    int m;
    int n;
    label105: View localView;
    if ((this.au > 0) && (this.at != null))
    {
      j = this.au;
      int k = -1 + localListAdapter.getCount();
      localj = this.p;
      boolean[] arrayOfBoolean = this.P;
      m = 0;
      n = i;
      if (m > k)
        break label211;
      localView = a(m, arrayOfBoolean);
      a(localView, m, paramInt1);
      if (m <= 0)
        break label214;
    }
    label211: label214: for (int i1 = n + j; ; i1 = n)
    {
      if (((AbsHListView.LayoutParams)localView.getLayoutParams()).a >= 0);
      for (int i2 = 1; ; i2 = 0)
      {
        if (i2 != 0)
          localj.a(localView, -1);
        int i3 = i1 + localView.getMeasuredWidth();
        if (i3 >= paramInt2)
          break;
        m++;
        n = i3;
        break label105;
        j = 0;
        break label75;
      }
      return n;
    }
  }

  private View f(int paramInt1, int paramInt2)
  {
    boolean bool;
    View localView1;
    int i;
    View localView3;
    View localView2;
    if (paramInt1 == this.al)
    {
      bool = true;
      localView1 = a(paramInt1, paramInt2, true, this.u.top, bool);
      this.V = paramInt1;
      i = this.au;
      if (this.K)
        break label112;
      localView3 = d(paramInt1 - 1, localView1.getLeft() - i);
      B();
      localView2 = c(paramInt1 + 1, i + localView1.getRight());
      int k = getChildCount();
      if (k > 0)
        k(k);
    }
    while (true)
    {
      if (!bool)
        break label170;
      return localView1;
      bool = false;
      break;
      label112: localView2 = c(paramInt1 + 1, i + localView1.getRight());
      B();
      localView3 = d(paramInt1 - 1, localView1.getLeft() - i);
      int j = getChildCount();
      if (j > 0)
        l(j);
    }
    label170: if (localView3 != null)
      return localView3;
    return localView2;
  }

  private View j(int paramInt)
  {
    this.V = Math.min(this.V, this.al);
    this.V = Math.min(this.V, -1 + this.an);
    if (this.V < 0)
      this.V = 0;
    return c(this.V, paramInt);
  }

  private void k(int paramInt)
  {
    if ((-1 + (paramInt + this.V) == -1 + this.an) && (paramInt > 0))
    {
      int i = getChildAt(paramInt - 1).getRight();
      int j = getRight() - getLeft() - this.u.right - i;
      View localView = getChildAt(0);
      int k = localView.getLeft();
      if ((j > 0) && ((this.V > 0) || (k < this.u.top)))
      {
        if (this.V == 0)
          j = Math.min(j, this.u.top - k);
        b(j);
        if (this.V > 0)
        {
          d(-1 + this.V, localView.getLeft() - this.au);
          B();
        }
      }
    }
  }

  private void l(int paramInt)
  {
    int i1;
    if ((this.V == 0) && (paramInt > 0))
    {
      int i = getChildAt(0).getLeft();
      int j = this.u.left;
      int k = getRight() - getLeft() - this.u.right;
      int m = i - j;
      View localView = getChildAt(paramInt - 1);
      int n = localView.getRight();
      i1 = -1 + (paramInt + this.V);
      if (m > 0)
      {
        if ((i1 >= -1 + this.an) && (n <= k))
          break label166;
        if (i1 == -1 + this.an)
          m = Math.min(m, n - k);
        b(-m);
        if (i1 < -1 + this.an)
        {
          c(i1 + 1, localView.getRight() + this.au);
          B();
        }
      }
    }
    label166: 
    while (i1 != -1 + this.an)
      return;
    B();
  }

  private boolean m(int paramInt)
  {
    int i;
    boolean bool;
    if (paramInt == 33)
    {
      i = Math.max(0, -1 + (this.al - getChildCount()));
      bool = false;
    }
    while (true)
      if (i >= 0)
      {
        int j = a(i, bool);
        if (j >= 0)
        {
          this.h = 4;
          this.W = (getPaddingLeft() + getHorizontalFadingEdgeLength());
          if ((bool) && (j > this.an - getChildCount()))
            this.h = 3;
          if ((!bool) && (j < getChildCount()))
            this.h = 1;
          d(j);
          c();
          if (!awakenScrollBars())
            invalidate();
          return true;
          if (paramInt != 130)
            break label158;
          i = Math.min(-1 + this.an, -1 + (this.al + getChildCount()));
          bool = true;
        }
      }
      else
      {
        return false;
        label158: i = -1;
        bool = false;
      }
  }

  private boolean n(int paramInt)
  {
    int i = 1;
    if (paramInt == 33)
    {
      if (this.al == 0)
        break label121;
      int k = a(0, i);
      if (k >= 0)
      {
        this.h = i;
        d(k);
        c();
      }
    }
    while (true)
    {
      if ((i != 0) && (!awakenScrollBars()))
      {
        awakenScrollBars();
        invalidate();
      }
      return i;
      if ((paramInt == 130) && (this.al < -1 + this.an))
      {
        int j = a(-1 + this.an, i);
        if (j >= 0)
        {
          this.h = 3;
          d(j);
          c();
        }
      }
      else
      {
        label121: i = 0;
      }
    }
  }

  private boolean o(int paramInt)
  {
    if ((paramInt != 17) && (paramInt != 66))
      throw new IllegalArgumentException("direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT}");
    int i = getChildCount();
    if ((this.aF) && (i > 0) && (this.al != -1))
    {
      View localView1 = g();
      if ((localView1 != null) && (localView1.hasFocus()) && ((localView1 instanceof ViewGroup)))
      {
        View localView2 = localView1.findFocus();
        View localView3 = FocusFinder.getInstance().findNextFocus((ViewGroup)localView1, localView2, paramInt);
        if (localView3 != null)
        {
          localView2.getFocusedRect(this.aG);
          offsetDescendantRectToMyCoords(localView2, this.aG);
          offsetRectIntoDescendantCoords(localView3, this.aG);
          if (localView3.requestFocus(paramInt, this.aG))
            return true;
        }
        View localView4 = FocusFinder.getInstance().findNextFocus((ViewGroup)getRootView(), localView2, paramInt);
        if (localView4 != null)
          return a(localView4, this);
      }
    }
    return false;
  }

  private boolean p(int paramInt)
  {
    View localView1;
    int i;
    int j;
    int k;
    int m;
    int n;
    try
    {
      this.ae = true;
      if (getChildCount() <= 0)
        break label1354;
      localView1 = g();
      i = this.al;
      j = q(paramInt);
      k = getWidth() - this.u.right;
      m = this.u.left;
      n = getChildCount();
      if (paramInt == 130)
      {
        i33 = n - 1;
        if (j != -1)
          i33 = j - this.V;
        i34 = i33 + this.V;
        localView11 = getChildAt(i33);
        if (i34 >= -1 + this.an)
          break label1377;
        i35 = k - C();
        if (localView11.getRight() <= i35)
        {
          i4 = 0;
          if (!this.aF)
            break label1464;
          localView8 = g();
          if ((localView8 == null) || (!localView8.hasFocus()))
            break label549;
          localView10 = localView8.findFocus();
          localView9 = FocusFinder.getInstance().findNextFocus(this, localView10, paramInt);
          if (localView9 == null)
            break label1458;
          i18 = getChildCount();
          i19 = 0;
          if (i19 >= i18)
            break label736;
          if (!a(localView9, getChildAt(i19)))
            break label1452;
          i20 = i19 + this.V;
          if ((this.al == -1) || (i20 == this.al))
            break label747;
          i27 = q(paramInt);
          if (i27 == -1)
            break label747;
          if (paramInt != 130)
            break label1384;
          if (i27 < i20)
            break label1397;
          break label1384;
          if (localt == null)
            break label1403;
          j = localt.a();
          i4 = localt.b();
          break label1403;
          if (j != -1)
            break label977;
          throw new IllegalArgumentException("newSelectedPosition needs to be valid");
        }
      }
    }
    finally
    {
      this.ae = false;
    }
    int i35;
    int i4;
    int i19;
    int i20;
    int i27;
    label275: t localt;
    label297: int i3;
    label457: int i14;
    label549: label566: int i16;
    label586: int i28;
    label666: int i30;
    while (true)
    {
      int i33;
      int i34;
      View localView11;
      View localView8;
      View localView10;
      View localView9;
      int i18;
      if ((j != -1) && (i35 - localView11.getLeft() >= A()))
      {
        i4 = 0;
      }
      else
      {
        int i36 = localView11.getRight() - i35;
        if (n + this.V == this.an)
          i36 = Math.min(i36, getChildAt(n - 1).getRight() - k);
        i4 = Math.min(i36, A());
        continue;
        int i1 = 0;
        if (j != -1)
          i1 = j - this.V;
        int i2 = i1 + this.V;
        View localView2 = getChildAt(i1);
        if (i2 <= 0)
          break;
        i3 = m + C();
        if (localView2.getLeft() >= i3)
        {
          i4 = 0;
        }
        else if ((j != -1) && (localView2.getRight() - i3 >= A()))
        {
          i4 = 0;
        }
        else
        {
          int i32 = i3 - localView2.getLeft();
          if (this.V == 0)
            i32 = Math.min(i32, m - getChildAt(0).getLeft());
          i4 = Math.min(i32, A());
          continue;
          if (paramInt == 130)
          {
            if (this.V <= 0)
              break label1428;
            i14 = 1;
            int i15 = this.u.left;
            if (i14 == 0)
              break label1434;
            i16 = C();
            int i17 = i16 + i15;
            if ((localView8 != null) && (localView8.getLeft() > i17))
              i17 = localView8.getLeft();
            this.aG.set(i17, 0, i17, 0);
          }
          while (true)
          {
            localView9 = FocusFinder.getInstance().findNextFocusFromRect(this, this.aG, paramInt);
            break;
            if (-1 + (this.V + getChildCount()) >= this.an)
              break label1440;
            i28 = 1;
            int i29 = getWidth() - this.u.right;
            if (i28 == 0)
              break label1446;
            i30 = C();
            label691: int i31 = i29 - i30;
            if ((localView8 != null) && (localView8.getRight() < i31))
              i31 = localView8.getRight();
            this.aG.set(i31, 0, i31, 0);
          }
          label736: throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
          label747: localView9.getDrawingRect(this.aG);
          offsetDescendantRectToMyCoords(localView9, this.aG);
          int i23;
          if (paramInt == 33)
          {
            int i21 = this.aG.left;
            int i22 = this.u.left;
            i23 = 0;
            if (i21 < i22)
            {
              i23 = this.u.left - this.aG.left;
              if (i20 > 0)
                i23 += C();
            }
          }
          int i24;
          while (true)
          {
            i24 = A();
            if (i23 >= i24)
              break label939;
            localView9.requestFocus(paramInt);
            this.aI.a(i20, i23);
            localt = this.aI;
            break;
            int i25 = getWidth() - this.u.right;
            int i26 = this.aG.bottom;
            i23 = 0;
            if (i26 > i25)
            {
              i23 = this.aG.right - i25;
              if (i20 < -1 + this.an)
                i23 += C();
            }
          }
          label939: if (c(localView9) >= i24)
            break label1458;
          localView9.requestFocus(paramInt);
          this.aI.a(i20, i24);
          localt = this.aI;
        }
      }
    }
    label977: int i9 = this.al - this.V;
    int i10 = j - this.V;
    View localView5;
    Object localObject2;
    int i11;
    int i12;
    label1022: int i8;
    boolean bool3;
    label1046: label1066: boolean bool2;
    label1083: View localView3;
    int i5;
    int i6;
    if (paramInt == 33)
    {
      localView5 = getChildAt(i10);
      localObject2 = localView1;
      i11 = i9;
      i12 = 1;
      int i13 = getChildCount();
      if (localView5 == null)
        break label1482;
      if ((i8 != 0) || (i12 == 0))
        break label1334;
      bool3 = true;
      localView5.setSelected(bool3);
      b(localView5, i10, i13);
      break label1482;
      ((View)localObject2).setSelected(bool2);
      b((View)localObject2, i11, i13);
      h(j);
      i(j);
      localView3 = g();
      if ((this.aF) && (localt == null))
      {
        View localView6 = getFocusedChild();
        if (localView6 != null)
          localView6.clearFocus();
      }
      i5 = 1;
      x();
      i6 = j;
      break label1503;
    }
    while (true)
    {
      label1143: r(i7);
      i5 = 1;
      label1152: if ((this.aF) && (localt == null) && (localView3 != null) && (localView3.hasFocus()))
      {
        View localView4 = localView3.findFocus();
        if ((!a(localView4, this)) || (c(localView4) > 0))
          localView4.clearFocus();
      }
      if ((j == -1) && (localView3 != null) && (!a(localView3, this)))
      {
        localView3 = null;
        l();
        this.M = -1;
      }
      boolean bool1;
      if (i5 != 0)
      {
        if (localView3 != null)
        {
          a(i6, localView3);
          this.J = localView3.getLeft();
        }
        if (!awakenScrollBars())
          invalidate();
        c();
        bool1 = true;
        label1285: if (bool1)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        this.ae = false;
        return bool1;
        View localView7 = getChildAt(i10);
        localObject2 = localView7;
        localView5 = localView1;
        i11 = i10;
        i10 = i9;
        i12 = 0;
        break label1022;
        label1334: bool3 = false;
        break label1046;
        label1340: bool2 = false;
        break label1066;
      }
      label1354: label1377: label1384: label1397: label1403: 
      do
      {
        i7 = -i4;
        break label1143;
        bool1 = false;
        break label1285;
        while (true)
        {
          localView3 = localView1;
          i6 = i;
          break label1503;
          i3 = m;
          break label457;
          i35 = k;
          break;
          if ((paramInt != 33) || (i27 <= i20))
            break label747;
          localt = null;
          break label275;
          if (localt != null);
          for (i5 = 1; ; i5 = 0)
          {
            if (j == -1)
              break label1474;
            if (localt == null)
              break label1476;
            i8 = 1;
            break label297;
            i14 = 0;
            break label566;
            i16 = 0;
            break label586;
            i28 = 0;
            break label666;
            i30 = 0;
            break label691;
            i19++;
            break;
            localt = null;
            break label275;
            localt = null;
            break label275;
          }
        }
        i8 = 0;
        break label297;
        if (localObject2 == null)
          break label1083;
        if ((i8 != 0) || (i12 != 0))
          break label1340;
        bool2 = true;
        break label1066;
        if (i4 <= 0)
          break label1152;
      }
      while (paramInt != 33);
      label1428: label1434: label1440: label1446: label1452: label1458: label1464: label1474: label1476: label1482: label1503: int i7 = i4;
    }
  }

  private int q(int paramInt)
  {
    int i = this.V;
    if (paramInt == 130)
    {
      if (this.al != -1);
      for (j = 1 + this.al; j >= this.j.getCount(); j = i)
      {
        j = -1;
        return j;
      }
      if (j < i)
        j = i;
      int m = v();
      ListAdapter localListAdapter2 = this.j;
      while (true)
      {
        if (j > m)
          break label210;
        if ((localListAdapter2.isEnabled(j)) && (getChildAt(j - i).getVisibility() == 0))
          break;
        j++;
      }
    }
    int j = -1 + (i + getChildCount());
    if (this.al != -1);
    for (int k = -1 + this.al; (k < 0) || (k >= this.j.getCount()); k = -1 + (i + getChildCount()))
      return -1;
    if (k > j);
    while (true)
    {
      ListAdapter localListAdapter1 = this.j;
      while (true)
      {
        if (j < i)
          break label210;
        if ((localListAdapter1.isEnabled(j)) && (getChildAt(j - i).getVisibility() == 0))
          break;
        j--;
      }
      label210: return -1;
      j = k;
    }
  }

  private void r(int paramInt)
  {
    b(paramInt);
    int i = getWidth() - this.u.right;
    int j = this.u.left;
    j localj = this.p;
    if (paramInt < 0)
    {
      int i3 = getChildCount();
      View localView4 = getChildAt(i3 - 1);
      int i4 = i3;
      View localView6;
      for (Object localObject3 = localView4; ((View)localObject3).getRight() < i; localObject3 = localView6)
      {
        int i6 = -1 + (i4 + this.V);
        if (i6 >= -1 + this.an)
          break;
        int i7 = i6 + 1;
        localView6 = a(i7, this.P);
        a(localView6, i7, ((View)localObject3).getRight() + this.au, true, this.u.top, false, this.P[0]);
        i4++;
      }
      if (((View)localObject3).getBottom() < i)
        b(i - ((View)localObject3).getRight());
      Object localObject4 = getChildAt(0);
      if (((View)localObject4).getRight() < j)
      {
        int i5;
        if (((AbsHListView.LayoutParams)((View)localObject4).getLayoutParams()).a >= 0)
        {
          i5 = 1;
          label205: if (i5 == 0)
            break label257;
          detachViewFromParent((View)localObject4);
          localj.a((View)localObject4, this.V);
        }
        while (true)
        {
          View localView5 = getChildAt(0);
          this.V = (1 + this.V);
          localObject4 = localView5;
          break;
          i5 = 0;
          break label205;
          label257: removeViewInLayout((View)localObject4);
        }
      }
    }
    else
    {
      View localView3;
      for (Object localObject1 = getChildAt(0); (((View)localObject1).getLeft() > j) && (this.V > 0); localObject1 = localView3)
      {
        int i2 = -1 + this.V;
        localView3 = a(i2, this.P);
        a(localView3, i2, ((View)localObject1).getLeft() - this.au, false, this.u.top, false, this.P[0]);
        this.V = (-1 + this.V);
      }
      if (((View)localObject1).getLeft() > j)
        b(j - ((View)localObject1).getLeft());
      int k = -1 + getChildCount();
      View localView1 = getChildAt(k);
      int m = k;
      Object localObject2 = localView1;
      if (((View)localObject2).getLeft() > i)
      {
        int n;
        if (((AbsHListView.LayoutParams)((View)localObject2).getLayoutParams()).a >= 0)
        {
          n = 1;
          label429: if (n == 0)
            break label485;
          detachViewFromParent((View)localObject2);
          localj.a((View)localObject2, m + this.V);
        }
        while (true)
        {
          int i1 = m - 1;
          View localView2 = getChildAt(i1);
          m = i1;
          localObject2 = localView2;
          break;
          n = 0;
          break label429;
          label485: removeViewInLayout((View)localObject2);
        }
      }
    }
  }

  protected final int a(int paramInt, boolean paramBoolean)
  {
    ListAdapter localListAdapter = this.j;
    if ((localListAdapter == null) || (isInTouchMode()))
      paramInt = -1;
    int i;
    do
    {
      do
      {
        return paramInt;
        i = localListAdapter.getCount();
        if (this.aE)
          break;
        if (paramBoolean)
          for (paramInt = Math.max(0, paramInt); (paramInt < i) && (!localListAdapter.isEnabled(paramInt)); paramInt++);
        for (paramInt = Math.min(paramInt, i - 1); (paramInt >= 0) && (!localListAdapter.isEnabled(paramInt)); paramInt--);
      }
      while ((paramInt >= 0) && (paramInt < i));
      return -1;
    }
    while ((paramInt >= 0) && (paramInt < i));
    return -1;
  }

  public final void a(ListAdapter paramListAdapter)
  {
    if ((this.j != null) && (this.i != null))
      this.j.unregisterDataSetObserver(this.i);
    d();
    this.p.b();
    int i;
    if ((this.ay.size() > 0) || (this.az.size() > 0))
    {
      this.j = new w(this.ay, this.az, paramListAdapter);
      this.aq = -1;
      this.ar = -9223372036854775808L;
      super.a(paramListAdapter);
      if (this.j == null)
        break label244;
      this.aE = this.j.areAllItemsEnabled();
      this.ao = this.an;
      this.an = this.j.getCount();
      w();
      this.i = new a(this);
      this.j.registerDataSetObserver(this.i);
      this.p.a(this.j.getViewTypeCount());
      if (!this.K)
        break label234;
      i = a(-1 + this.an, false);
      label200: h(i);
      i(i);
      if (this.an == 0)
        x();
    }
    while (true)
    {
      requestLayout();
      return;
      this.j = paramListAdapter;
      break;
      label234: i = a(0, true);
      break label200;
      label244: this.aE = true;
      w();
      x();
    }
  }

  protected final void a(boolean paramBoolean)
  {
    int i = getChildCount();
    if (paramBoolean)
    {
      int j = 0;
      if (i > 0)
        j = getChildAt(i - 1).getRight() + this.au;
      c(i + this.V, j);
      k(getChildCount());
      return;
    }
    if (i > 0);
    for (int k = getChildAt(0).getLeft() - this.au; ; k = 0 + getWidth())
    {
      d(-1 + this.V, k);
      l(getChildCount());
      return;
    }
  }

  public final void b(int paramInt1, int paramInt2)
  {
    if (this.j == null);
    while (true)
    {
      return;
      if (!isInTouchMode())
      {
        paramInt1 = a(paramInt1, true);
        if (paramInt1 >= 0)
          i(paramInt1);
      }
      while (paramInt1 >= 0)
      {
        this.h = 4;
        this.W = (paramInt2 + this.u.left);
        if (this.ac)
        {
          this.Z = paramInt1;
          this.aa = this.j.getItemId(paramInt1);
        }
        if (this.I != null)
          this.I.a();
        requestLayout();
        return;
        this.M = paramInt1;
      }
    }
  }

  protected final int c(int paramInt)
  {
    int i = getChildCount();
    if (i > 0)
    {
      if (!this.K)
        for (int k = 0; k < i; k++)
          if (paramInt <= getChildAt(k).getRight())
            return k + this.V;
      for (int j = i - 1; j >= 0; j--)
        if (paramInt >= getChildAt(j).getLeft())
          return j + this.V;
    }
    return -1;
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.an > 0);
  }

  protected final void d()
  {
    a(this.ay);
    a(this.az);
    super.d();
    this.h = 0;
  }

  public final void d(int paramInt)
  {
    int i = 1;
    i(paramInt);
    int j = this.al;
    if (j >= 0)
      if (paramInt != j - 1);
    while (true)
    {
      if (this.I != null)
        this.I.a();
      e();
      if (i != 0)
        awakenScrollBars();
      return;
      if (paramInt != j + 1)
        i = 0;
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (this.y)
      this.z = true;
    int i = this.au;
    Drawable localDrawable1 = this.aw;
    Drawable localDrawable2 = this.ax;
    int j;
    int k;
    label43: int m;
    label57: Rect localRect;
    int n;
    int i1;
    int i2;
    int i3;
    boolean bool1;
    boolean bool2;
    int i4;
    boolean bool3;
    ListAdapter localListAdapter;
    int i5;
    label188: Paint localPaint;
    int i6;
    label301: int i12;
    int i13;
    if (localDrawable1 != null)
    {
      j = 1;
      if (localDrawable2 == null)
        break label462;
      k = 1;
      if ((i <= 0) || (this.at == null))
        break label468;
      m = 1;
      if ((m == 0) && (j == 0) && (k == 0))
        break label595;
      localRect = this.aG;
      localRect.top = getPaddingTop();
      localRect.bottom = (getBottom() - getTop() - getPaddingBottom());
      n = getChildCount();
      i1 = this.ay.size();
      i2 = this.an;
      i3 = -1 + (i2 - this.az.size());
      bool1 = this.aC;
      bool2 = this.aD;
      i4 = this.V;
      bool3 = this.aE;
      localListAdapter = this.j;
      if ((!isOpaque()) || (super.isOpaque()))
        break label474;
      i5 = 1;
      if ((i5 != 0) && (this.aH == null) && (this.aA))
      {
        this.aH = new Paint();
        this.aH.setColor(p());
      }
      localPaint = this.aH;
      i6 = 0 + (getRight() - getLeft()) + getScrollX();
      if (this.K)
        break label601;
      int i11 = getScrollX();
      if ((n > 0) && (i11 < 0))
      {
        if (j == 0)
          break label480;
        localRect.right = 0;
        localRect.left = i11;
        a(paramCanvas, localDrawable1, localRect);
      }
      i12 = 0;
      i13 = 0;
      label307: if (i13 >= n)
        break label540;
      if (((bool1) || (i4 + i13 >= i1)) && ((bool2) || (i4 + i13 < i3)))
      {
        i12 = getChildAt(i13).getRight();
        if ((m != 0) && (i12 < i6) && ((k == 0) || (i13 != n - 1)))
        {
          if ((!bool3) && ((!localListAdapter.isEnabled(i4 + i13)) || ((i13 != n - 1) && (!localListAdapter.isEnabled(1 + (i4 + i13))))))
            break label508;
          localRect.left = i12;
          localRect.right = (i12 + i);
          a(paramCanvas, localRect);
        }
      }
    }
    while (true)
    {
      i13++;
      break label307;
      j = 0;
      break;
      label462: k = 0;
      break label43;
      label468: m = 0;
      break label57;
      label474: i5 = 0;
      break label188;
      label480: if (m == 0)
        break label301;
      localRect.right = 0;
      localRect.left = (-i);
      a(paramCanvas, localRect);
      break label301;
      label508: if (i5 != 0)
      {
        localRect.left = i12;
        localRect.right = (i12 + i);
        paramCanvas.drawRect(localRect, localPaint);
      }
    }
    label540: int i14 = getRight() + getScrollX();
    if ((k != 0) && (i4 + n == i2) && (i14 > i12))
    {
      localRect.left = i12;
      localRect.right = i14;
      b(paramCanvas, localDrawable2, localRect);
    }
    while (true)
    {
      label595: super.dispatchDraw(paramCanvas);
      return;
      label601: int i7 = getScrollX();
      if ((n > 0) && (j != 0))
      {
        localRect.left = i7;
        localRect.right = getChildAt(0).getLeft();
        a(paramCanvas, localDrawable1, localRect);
      }
      int i8;
      int i10;
      if (j != 0)
      {
        i8 = 1;
        if (i8 >= n)
          break label818;
        if (((bool1) || (i4 + i8 >= i1)) && ((bool2) || (i4 + i8 < i3)))
        {
          i10 = getChildAt(i8).getLeft();
          if (i10 > 0)
          {
            if ((!bool3) && ((!localListAdapter.isEnabled(i4 + i8)) || ((i8 != n - 1) && (!localListAdapter.isEnabled(1 + (i4 + i8))))))
              break label786;
            localRect.left = (i10 - i);
            localRect.right = i10;
            a(paramCanvas, localRect);
          }
        }
      }
      while (true)
      {
        i8++;
        break;
        i8 = 0;
        break;
        label786: if (i5 != 0)
        {
          localRect.left = (i10 - i);
          localRect.right = i10;
          paramCanvas.drawRect(localRect, localPaint);
        }
      }
      label818: if ((n > 0) && (i7 > 0))
        if (k != 0)
        {
          int i9 = getRight();
          localRect.left = i9;
          localRect.right = (i9 + i7);
          b(paramCanvas, localDrawable2, localRect);
        }
        else if (m != 0)
        {
          localRect.left = i6;
          localRect.right = (i6 + i);
          a(paramCanvas, localRect);
        }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    if ((!bool) && (getFocusedChild() != null) && (paramKeyEvent.getAction() == 0))
      bool = onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent);
    return bool;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    if (this.z)
      this.z = false;
    return bool;
  }

  protected final void e()
  {
    boolean bool1 = this.as;
    if (!bool1)
    {
      this.as = true;
      try
      {
        super.e();
        invalidate();
        if (this.j == null)
        {
          d();
          c();
          return;
        }
        i = this.u.left;
        j = getRight() - getLeft() - this.u.right;
        k = getChildCount();
        View localView14;
        switch (this.h)
        {
        default:
          int i9 = this.al - this.V;
          localView1 = null;
          if (i9 >= 0)
          {
            localView1 = null;
            if (i9 < k)
              localView1 = getChildAt(i9);
          }
          localView14 = getChildAt(0);
          int i10 = this.aj;
          m = 0;
          if (i10 >= 0)
            m = this.aj - this.al;
          localView2 = getChildAt(i9 + m);
        case 2:
          for (localView3 = localView14; ; localView3 = null)
          {
            bool2 = this.ai;
            if (bool2)
              o();
            if (this.an != 0)
              break;
            d();
            c();
            return;
            int i8 = this.aj - this.V;
            if ((i8 < 0) || (i8 >= k))
              break label1257;
            localView2 = getChildAt(i8);
            localView1 = null;
            m = 0;
          }
          if (this.an != this.j.getCount())
            throw new IllegalStateException("The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView(" + getId() + ", " + getClass() + ") with Adapter(" + this.j.getClass() + ")]");
        case 1:
        case 3:
        case 4:
        case 5:
        }
      }
      finally
      {
        if (!bool1)
          this.as = false;
      }
    }
    int i;
    int j;
    int k;
    View localView1;
    int m;
    View localView2;
    View localView3;
    label204: boolean bool2;
    h(this.aj);
    int n = this.V;
    j localj = this.p;
    if (bool2)
      for (int i7 = 0; i7 < k; i7++)
        localj.a(getChildAt(i7), n + i7);
    localj.a(k, n);
    View localView4 = getFocusedChild();
    View localView12;
    label498: View localView5;
    View localView6;
    label511: Object localObject2;
    if (localView4 != null)
    {
      View localView13;
      if (bool2)
      {
        boolean bool3 = b(localView4);
        localView12 = null;
        localView13 = null;
        if (!bool3);
      }
      else
      {
        localView13 = findFocus();
        if (localView13 == null)
          break label1287;
        localView13.onStartTemporaryDetach();
        break label1287;
      }
      requestFocus();
      localView5 = localView12;
      localView6 = localView13;
      detachAllViewsFromParent();
      localj.d();
      switch (this.h)
      {
      default:
        if (k == 0)
          if (!this.K)
          {
            h(a(0, true));
            localObject2 = j(i);
            label593: localj.e();
            if (localObject2 == null)
              break label1167;
            if ((!this.aF) || (!hasFocus()) || (((View)localObject2).hasFocus()))
              break label1157;
            if ((localObject2 == localView5) && (localView6 != null) && (localView6.requestFocus()))
              break label1294;
            if (!((View)localObject2).requestFocus())
              break label1307;
          }
        break;
      case 2:
      case 5:
      case 3:
      case 1:
      case 4:
      case 6:
      }
    }
    while (true)
    {
      if (i1 == 0)
      {
        View localView7 = getFocusedChild();
        if (localView7 != null)
          localView7.clearFocus();
        a(-1, (View)localObject2);
        label684: this.J = ((View)localObject2).getLeft();
      }
      View localView11;
      label1157: label1167: label1246: 
      while (true)
      {
        if ((localView6 != null) && (localView6.getWindowToken() != null))
          localView6.onFinishTemporaryDetach();
        this.h = 0;
        this.ai = false;
        if (this.O != null)
        {
          post(this.O);
          this.O = null;
        }
        this.ac = false;
        i(this.al);
        f();
        if (this.an > 0)
          x();
        c();
        if (bool1)
          break;
        this.as = false;
        return;
        if (localView2 != null)
        {
          localObject2 = a(localView2.getLeft(), i, j);
          break label593;
        }
        int i2 = j - i;
        int i3 = m();
        localView11 = a(i3, i, true, this.u.top, true);
        this.V = i3;
        int i4 = localView11.getMeasuredWidth();
        if (i4 <= i2)
          localView11.offsetLeftAndRight((i2 - i4) / 2);
        a(localView11, i3);
        if (!this.K)
        {
          k(getChildCount());
          break label1300;
        }
        l(getChildCount());
        break label1300;
        localObject2 = f(this.Z, this.W);
        break label593;
        View localView10 = d(-1 + this.an, j);
        B();
        localObject2 = localView10;
        break label593;
        this.V = 0;
        View localView9 = j(i);
        B();
        localObject2 = localView9;
        break label593;
        localObject2 = f(m(), this.W);
        break label593;
        localObject2 = a(localView1, localView2, m, i, j);
        break label593;
        h(a(-1 + this.an, false));
        localObject2 = d(-1 + this.an, j);
        break label593;
        if ((this.al >= 0) && (this.al < this.an))
        {
          int i6 = this.al;
          if (localView1 == null);
          while (true)
          {
            localObject2 = f(i6, i);
            break;
            i = localView1.getLeft();
          }
        }
        if (this.V < this.an)
        {
          int i5 = this.V;
          if (localView3 == null);
          while (true)
          {
            localObject2 = f(i5, i);
            break;
            i = localView3.getLeft();
          }
        }
        localObject2 = f(0, i);
        break label593;
        ((View)localObject2).setSelected(false);
        this.o.setEmpty();
        break label684;
        a(-1, (View)localObject2);
        break label684;
        if ((this.F > 0) && (this.F < 3))
        {
          View localView8 = getChildAt(this.A - this.V);
          if (localView8 != null)
            a(this.A, localView8);
        }
        while (true)
        {
          if ((!hasFocus()) || (localView6 == null))
            break label1246;
          localView6.requestFocus();
          break;
          this.J = 0;
          this.o.setEmpty();
        }
      }
      localView5 = null;
      localView6 = null;
      break label511;
      label1257: localView1 = null;
      localView2 = null;
      m = 0;
      localView3 = null;
      break label204;
      localView1 = null;
      localView2 = null;
      m = 0;
      localView3 = null;
      break label204;
      label1287: localView12 = localView4;
      break label498;
      label1294: int i1 = 1;
      continue;
      label1300: localObject2 = localView11;
      break label593;
      label1307: i1 = 0;
    }
  }

  public final void e(int paramInt)
  {
    if (paramInt >>> 24 == 255);
    for (boolean bool = true; ; bool = false)
    {
      this.aA = bool;
      if (bool)
      {
        if (this.aH == null)
          this.aH = new Paint();
        this.aH.setColor(paramInt);
      }
      super.e(paramInt);
      return;
    }
  }

  public final void f(int paramInt)
  {
    b(paramInt, 0);
  }

  public boolean isOpaque()
  {
    boolean bool;
    if (((this.z) && (this.aA) && (this.aB)) || (super.isOpaque()))
    {
      bool = true;
      if (!bool)
        break label149;
      if (this.u == null)
        break label74;
    }
    label74: for (int i = this.u.left; ; i = getPaddingLeft())
    {
      View localView1 = getChildAt(0);
      if ((localView1 != null) && (localView1.getLeft() <= i))
        break label82;
      return false;
      bool = false;
      break;
    }
    label82: int j = getWidth();
    if (this.u != null);
    for (int k = this.u.right; ; k = getPaddingRight())
    {
      int m = j - k;
      View localView2 = getChildAt(-1 + getChildCount());
      if ((localView2 != null) && (localView2.getRight() >= m))
        break;
      return false;
    }
    label149: return bool;
  }

  public final int j()
  {
    return this.ay.size();
  }

  public final int k()
  {
    return this.az.size();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    int i = getChildCount();
    if (i > 0)
    {
      for (int j = 0; j < i; j++)
      {
        View localView = getChildAt(j);
        if ((this.j != null) && (!(this.j instanceof w)))
          throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
        u localu = new u();
        localu.a = localView;
        localu.b = null;
        localu.c = true;
        this.ay.add(localu);
        if ((this.j != null) && (this.i != null))
          this.i.onChanged();
      }
      removeAllViews();
    }
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    ListAdapter localListAdapter = this.j;
    int i = -1;
    int j = 0;
    Rect localRect;
    int k;
    int i1;
    int i5;
    int i6;
    int i7;
    int i8;
    label260: int i2;
    int i3;
    if (localListAdapter != null)
    {
      j = 0;
      if (paramBoolean)
      {
        j = 0;
        if (paramRect != null)
        {
          paramRect.offset(getScrollX(), getScrollY());
          if (localListAdapter.getCount() < getChildCount() + this.V)
          {
            this.h = 0;
            e();
          }
          localRect = this.aG;
          k = 2147483647;
          int m = getChildCount();
          int n = this.V;
          i1 = 0;
          if (i1 < m)
          {
            if (!localListAdapter.isEnabled(n + i1))
              break label538;
            View localView = getChildAt(i1);
            localView.getDrawingRect(localRect);
            offsetDescendantRectToMyCoords(localView, localRect);
            switch (paramInt)
            {
            default:
              throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
            case 66:
              i5 = paramRect.right;
              i6 = paramRect.top + paramRect.height() / 2;
              i7 = localRect.left;
              i8 = localRect.top + localRect.height() / 2;
              int i9 = i7 - i5;
              int i10 = i8 - i6;
              i2 = i10 * i10 + i9 * i9;
              if (i2 < k)
                i3 = localView.getLeft();
            case 130:
            case 17:
            case 33:
            case 1:
            case 2:
            }
          }
        }
      }
    }
    for (int i4 = i1; ; i4 = i)
    {
      i1++;
      i = i4;
      j = i3;
      k = i2;
      break;
      i5 = paramRect.left + paramRect.width() / 2;
      i6 = paramRect.bottom;
      i7 = localRect.left + localRect.width() / 2;
      i8 = localRect.top;
      break label260;
      i5 = paramRect.left;
      i6 = paramRect.top + paramRect.height() / 2;
      i7 = localRect.right;
      i8 = localRect.top + localRect.height() / 2;
      break label260;
      i5 = paramRect.left + paramRect.width() / 2;
      i6 = paramRect.top;
      i7 = localRect.left + localRect.width() / 2;
      i8 = localRect.bottom;
      break label260;
      i5 = paramRect.right + paramRect.width() / 2;
      i6 = paramRect.top + paramRect.height() / 2;
      i7 = localRect.left + localRect.width() / 2;
      i8 = localRect.top + localRect.height() / 2;
      break label260;
      if (i >= 0)
      {
        b(i + this.V, j);
        return;
      }
      requestLayout();
      return;
      label538: i2 = k;
      i3 = j;
    }
  }

  public void onGlobalLayout()
  {
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(HListView.class.getName());
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(HListView.class.getName());
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, 1, paramKeyEvent);
  }

  public boolean onKeyMultiple(int paramInt1, int paramInt2, KeyEvent paramKeyEvent)
  {
    return a(paramInt1, paramInt2, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, 1, paramKeyEvent);
  }

  @TargetApi(11)
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    int i2;
    int i21;
    label173: int i6;
    int i7;
    if (this.j == null)
    {
      n = 0;
      this.an = n;
      int i1 = this.an;
      i2 = 0;
      int i3 = 0;
      int i4 = 0;
      if (i1 > 0)
        if (i != 0)
        {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          if (j != 0);
        }
        else
        {
          Log.d("HListView", "let's measure a scrap child");
          View localView2 = a(0, this.P);
          a(localView2, 0, paramInt2);
          i4 = localView2.getMeasuredWidth();
          i3 = localView2.getMeasuredHeight();
          int i20 = Build.VERSION.SDK_INT;
          i2 = 0;
          if (i20 >= 11)
            i2 = combineMeasuredStates(0, localView2.getMeasuredState());
          if (((AbsHListView.LayoutParams)localView2.getLayoutParams()).a < 0)
            break label301;
          i21 = 1;
          if (i21 != 0)
            this.p.a(localView2, -1);
        }
      int i5 = i3;
      i6 = i4;
      if (j != 0)
        break label307;
      i7 = i5 + (this.u.top + this.u.bottom) + getHorizontalScrollbarHeight();
    }
    while (true)
    {
      label226: if (i == 0);
      for (int i8 = i6 + (this.u.left + this.u.right) + 2 * getHorizontalFadingEdgeLength(); ; i8 = k)
      {
        if (i == -2147483648)
          i8 = e(paramInt2, i8);
        setMeasuredDimension(i8, i7);
        this.v = paramInt2;
        return;
        n = this.j.getCount();
        break;
        label301: i21 = 0;
        break label173;
        label307: if ((j == -2147483648) && (this.an > 0) && (this.av >= 0))
        {
          int i9 = this.av;
          int i10 = this.av;
          Log.i("HListView", "measureWithLargeChildren, from " + i9 + " to " + i10);
          ListAdapter localListAdapter = this.j;
          int[] arrayOfInt;
          if (localListAdapter == null)
          {
            arrayOfInt = new int[2];
            arrayOfInt[0] = (this.u.left + this.u.right);
            arrayOfInt[1] = (this.u.top + this.u.bottom);
          }
          while (true)
          {
            i7 = arrayOfInt[1];
            break;
            int i11 = this.u.left + this.u.right;
            int i12 = this.u.top + this.u.bottom;
            int i13;
            int i14;
            int i15;
            int i16;
            j localj;
            View localView1;
            if ((this.au > 0) && (this.at != null))
            {
              i13 = this.au;
              i14 = 0;
              i15 = 0;
              if (i10 != -1)
                break label623;
              i16 = -1 + localListAdapter.getCount();
              localj = this.p;
              boolean[] arrayOfBoolean = this.P;
              if (i9 > i16)
                break label636;
              localView1 = a(i9, arrayOfBoolean);
              a(localView1, i9, paramInt2);
              if (((AbsHListView.LayoutParams)localView1.getLayoutParams()).a < 0)
                break label630;
            }
            label623: label630: for (int i19 = 1; ; i19 = 0)
            {
              if (i19 != 0)
                localj.a(localView1, -1);
              i14 = Math.max(i14, i13 + localView1.getMeasuredWidth());
              i15 = Math.max(i15, localView1.getMeasuredHeight());
              i9++;
              break label528;
              i13 = 0;
              break;
              i16 = i10;
              break label516;
            }
            label636: int i17 = i11 + i14;
            int i18 = i12 + i15;
            arrayOfInt = new int[2];
            arrayOfInt[0] = Math.min(i17, k);
            arrayOfInt[1] = Math.min(i18, m);
          }
        }
        label516: label528: if (Build.VERSION.SDK_INT < 11)
          break label709;
        i7 = m | 0xFF000000 & i2;
        break label226;
      }
      label709: i7 = m;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() > 0)
    {
      View localView = getFocusedChild();
      if (localView != null)
      {
        int i = this.V + indexOfChild(localView);
        int j = Math.max(0, localView.getRight() - (paramInt1 - getPaddingLeft()));
        int k = localView.getLeft() - j;
        if (this.aJ == null)
          this.aJ = new v(this, (byte)0);
        post(this.aJ.a(i, k));
      }
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i = paramRect.left;
    paramRect.offset(paramView.getLeft(), paramView.getTop());
    paramRect.offset(-paramView.getScrollX(), -paramView.getScrollY());
    int j = getWidth();
    int k = getScrollX();
    int m = k + j;
    int n = getHorizontalFadingEdgeLength();
    int i1 = getScrollX() + this.u.left;
    int i2;
    int i8;
    label205: int i11;
    label280: int i9;
    if ((this.V > 0) || (getChildAt(0).getLeft() > i1))
    {
      i2 = 1;
      if ((i2 != 0) && ((this.al > 0) || (i > n)))
        k += n;
      int i3 = getChildAt(-1 + getChildCount()).getRight();
      int i4 = getChildCount();
      int i5 = getChildAt(i4 - 1).getRight();
      int i6 = -1 + (i4 + this.V);
      int i7 = getScrollX() + getWidth() - this.u.right;
      if ((i6 >= -1 + this.an) && (i5 >= i7))
        break label339;
      i8 = 1;
      if ((i8 != 0) && ((this.al < -1 + this.an) || (paramRect.right < i3 - n)))
        m -= n;
      if ((paramRect.right <= m) || (paramRect.left <= k))
        break label359;
      if (paramRect.width() <= j)
        break label345;
      i11 = 0 + (paramRect.left - k);
      i9 = Math.min(i11, i3 - m);
    }
    while (true)
    {
      if (i9 != 0);
      for (boolean bool = true; ; bool = false)
      {
        if (bool)
        {
          r(-i9);
          a(-1, paramView);
          this.J = paramView.getTop();
          invalidate();
        }
        return bool;
        i2 = 0;
        break;
        label339: i8 = 0;
        break label205;
        label345: i11 = 0 + (paramRect.right - m);
        break label280;
        label359: if ((paramRect.left >= k) || (paramRect.right >= m))
          break label438;
        if (paramRect.width() > j);
        for (int i10 = 0 - (m - paramRect.right); ; i10 = 0 - (k - paramRect.left))
        {
          i9 = Math.max(i10, getChildAt(0).getLeft() - k);
          break;
        }
      }
      label438: i9 = 0;
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.HListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
