package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Parcelable;
import android.support.v7.a.d;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarView extends a
{
  private ProgressBarICS A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private boolean J;
  private boolean K;
  private n L;
  private ActionBarContextView M;
  private android.support.v7.internal.view.menu.a N;
  private android.support.v7.app.b O;
  private Runnable P;
  private c Q;
  private final p R;
  private final View.OnClickListener S;
  private final View.OnClickListener T;
  View g;
  Window.Callback h;
  private int i;
  private int j;
  private CharSequence k;
  private CharSequence l;
  private Drawable m;
  private Drawable n;
  private Context o;
  private ActionBarView.HomeView p;
  private ActionBarView.HomeView q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private View u;
  private ab v;
  private LinearLayout w;
  private ScrollingTabContainerView x;
  private View y;
  private ProgressBarICS z;

  // ERROR //
  public ActionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial 70	android/support/v7/internal/widget/a:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: iconst_m1
    //   8: putfield 72	android/support/v7/internal/widget/ActionBarView:j	I
    //   11: aload_0
    //   12: new 74	android/support/v7/internal/widget/ActionBarView$1
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 77	android/support/v7/internal/widget/ActionBarView$1:<init>	(Landroid/support/v7/internal/widget/ActionBarView;)V
    //   20: putfield 79	android/support/v7/internal/widget/ActionBarView:R	Landroid/support/v7/internal/widget/p;
    //   23: aload_0
    //   24: new 81	android/support/v7/internal/widget/ActionBarView$2
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 82	android/support/v7/internal/widget/ActionBarView$2:<init>	(Landroid/support/v7/internal/widget/ActionBarView;)V
    //   32: putfield 84	android/support/v7/internal/widget/ActionBarView:S	Landroid/view/View$OnClickListener;
    //   35: aload_0
    //   36: new 86	android/support/v7/internal/widget/ActionBarView$3
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 87	android/support/v7/internal/widget/ActionBarView$3:<init>	(Landroid/support/v7/internal/widget/ActionBarView;)V
    //   44: putfield 89	android/support/v7/internal/widget/ActionBarView:T	Landroid/view/View$OnClickListener;
    //   47: aload_0
    //   48: aload_1
    //   49: putfield 91	android/support/v7/internal/widget/ActionBarView:o	Landroid/content/Context;
    //   52: aload_0
    //   53: iconst_0
    //   54: invokevirtual 95	android/support/v7/internal/widget/ActionBarView:setBackgroundResource	(I)V
    //   57: aload_1
    //   58: aload_2
    //   59: getstatic 101	android/support/v7/a/k:a	[I
    //   62: getstatic 106	android/support/v7/a/c:b	I
    //   65: iconst_0
    //   66: invokevirtual 112	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   69: astore_3
    //   70: aload_1
    //   71: invokevirtual 116	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   74: astore 4
    //   76: aload_1
    //   77: invokevirtual 120	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   80: astore 5
    //   82: aload_0
    //   83: aload_3
    //   84: iconst_2
    //   85: iconst_0
    //   86: invokevirtual 126	android/content/res/TypedArray:getInt	(II)I
    //   89: putfield 128	android/support/v7/internal/widget/ActionBarView:i	I
    //   92: aload_0
    //   93: aload_3
    //   94: iconst_1
    //   95: invokevirtual 132	android/content/res/TypedArray:getText	(I)Ljava/lang/CharSequence;
    //   98: putfield 134	android/support/v7/internal/widget/ActionBarView:k	Ljava/lang/CharSequence;
    //   101: aload_0
    //   102: aload_3
    //   103: iconst_4
    //   104: invokevirtual 132	android/content/res/TypedArray:getText	(I)Ljava/lang/CharSequence;
    //   107: putfield 136	android/support/v7/internal/widget/ActionBarView:l	Ljava/lang/CharSequence;
    //   110: aload_0
    //   111: aload_3
    //   112: bipush 8
    //   114: invokevirtual 140	android/content/res/TypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   117: putfield 142	android/support/v7/internal/widget/ActionBarView:n	Landroid/graphics/drawable/Drawable;
    //   120: aload_0
    //   121: getfield 142	android/support/v7/internal/widget/ActionBarView:n	Landroid/graphics/drawable/Drawable;
    //   124: ifnonnull +52 -> 176
    //   127: getstatic 147	android/os/Build$VERSION:SDK_INT	I
    //   130: bipush 9
    //   132: if_icmplt +44 -> 176
    //   135: aload_1
    //   136: instanceof 149
    //   139: ifeq +19 -> 158
    //   142: aload_0
    //   143: aload 5
    //   145: aload_1
    //   146: checkcast 149	android/app/Activity
    //   149: invokevirtual 153	android/app/Activity:getComponentName	()Landroid/content/ComponentName;
    //   152: invokevirtual 159	android/content/pm/PackageManager:getActivityLogo	(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    //   155: putfield 142	android/support/v7/internal/widget/ActionBarView:n	Landroid/graphics/drawable/Drawable;
    //   158: aload_0
    //   159: getfield 142	android/support/v7/internal/widget/ActionBarView:n	Landroid/graphics/drawable/Drawable;
    //   162: ifnonnull +14 -> 176
    //   165: aload_0
    //   166: aload 4
    //   168: aload 5
    //   170: invokevirtual 165	android/content/pm/ApplicationInfo:loadLogo	(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
    //   173: putfield 142	android/support/v7/internal/widget/ActionBarView:n	Landroid/graphics/drawable/Drawable;
    //   176: aload_0
    //   177: aload_3
    //   178: bipush 7
    //   180: invokevirtual 140	android/content/res/TypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   183: putfield 167	android/support/v7/internal/widget/ActionBarView:m	Landroid/graphics/drawable/Drawable;
    //   186: aload_0
    //   187: getfield 167	android/support/v7/internal/widget/ActionBarView:m	Landroid/graphics/drawable/Drawable;
    //   190: ifnonnull +44 -> 234
    //   193: aload_1
    //   194: instanceof 149
    //   197: ifeq +19 -> 216
    //   200: aload_0
    //   201: aload 5
    //   203: aload_1
    //   204: checkcast 149	android/app/Activity
    //   207: invokevirtual 153	android/app/Activity:getComponentName	()Landroid/content/ComponentName;
    //   210: invokevirtual 170	android/content/pm/PackageManager:getActivityIcon	(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    //   213: putfield 167	android/support/v7/internal/widget/ActionBarView:m	Landroid/graphics/drawable/Drawable;
    //   216: aload_0
    //   217: getfield 167	android/support/v7/internal/widget/ActionBarView:m	Landroid/graphics/drawable/Drawable;
    //   220: ifnonnull +14 -> 234
    //   223: aload_0
    //   224: aload 4
    //   226: aload 5
    //   228: invokevirtual 173	android/content/pm/ApplicationInfo:loadIcon	(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
    //   231: putfield 167	android/support/v7/internal/widget/ActionBarView:m	Landroid/graphics/drawable/Drawable;
    //   234: aload_1
    //   235: invokestatic 179	android/view/LayoutInflater:from	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   238: astore 6
    //   240: aload_3
    //   241: bipush 14
    //   243: getstatic 184	android/support/v7/a/h:c	I
    //   246: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   249: istore 7
    //   251: aload_0
    //   252: aload 6
    //   254: iload 7
    //   256: aload_0
    //   257: iconst_0
    //   258: invokevirtual 191	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   261: checkcast 193	android/support/v7/internal/widget/ActionBarView$HomeView
    //   264: putfield 195	android/support/v7/internal/widget/ActionBarView:p	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   267: aload_0
    //   268: aload 6
    //   270: iload 7
    //   272: aload_0
    //   273: iconst_0
    //   274: invokevirtual 191	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   277: checkcast 193	android/support/v7/internal/widget/ActionBarView$HomeView
    //   280: putfield 197	android/support/v7/internal/widget/ActionBarView:q	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   283: aload_0
    //   284: getfield 197	android/support/v7/internal/widget/ActionBarView:q	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   287: iconst_1
    //   288: invokevirtual 200	android/support/v7/internal/widget/ActionBarView$HomeView:a	(Z)V
    //   291: aload_0
    //   292: getfield 197	android/support/v7/internal/widget/ActionBarView:q	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   295: aload_0
    //   296: getfield 84	android/support/v7/internal/widget/ActionBarView:S	Landroid/view/View$OnClickListener;
    //   299: invokevirtual 204	android/support/v7/internal/widget/ActionBarView$HomeView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   302: aload_0
    //   303: getfield 197	android/support/v7/internal/widget/ActionBarView:q	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   306: aload_0
    //   307: invokevirtual 208	android/support/v7/internal/widget/ActionBarView:getResources	()Landroid/content/res/Resources;
    //   310: getstatic 211	android/support/v7/a/i:b	I
    //   313: invokevirtual 214	android/content/res/Resources:getText	(I)Ljava/lang/CharSequence;
    //   316: invokevirtual 218	android/support/v7/internal/widget/ActionBarView$HomeView:setContentDescription	(Ljava/lang/CharSequence;)V
    //   319: aload_0
    //   320: aload_3
    //   321: iconst_5
    //   322: iconst_0
    //   323: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   326: putfield 220	android/support/v7/internal/widget/ActionBarView:D	I
    //   329: aload_0
    //   330: aload_3
    //   331: bipush 6
    //   333: iconst_0
    //   334: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   337: putfield 222	android/support/v7/internal/widget/ActionBarView:E	I
    //   340: aload_0
    //   341: aload_3
    //   342: bipush 15
    //   344: iconst_0
    //   345: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   348: putfield 224	android/support/v7/internal/widget/ActionBarView:F	I
    //   351: aload_0
    //   352: aload_3
    //   353: bipush 16
    //   355: iconst_0
    //   356: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   359: putfield 226	android/support/v7/internal/widget/ActionBarView:G	I
    //   362: aload_0
    //   363: aload_3
    //   364: bipush 17
    //   366: iconst_0
    //   367: invokevirtual 229	android/content/res/TypedArray:getDimensionPixelOffset	(II)I
    //   370: putfield 231	android/support/v7/internal/widget/ActionBarView:B	I
    //   373: aload_0
    //   374: aload_3
    //   375: bipush 18
    //   377: iconst_0
    //   378: invokevirtual 229	android/content/res/TypedArray:getDimensionPixelOffset	(II)I
    //   381: putfield 233	android/support/v7/internal/widget/ActionBarView:C	I
    //   384: aload_0
    //   385: aload_3
    //   386: iconst_3
    //   387: iconst_0
    //   388: invokevirtual 126	android/content/res/TypedArray:getInt	(II)I
    //   391: invokevirtual 235	android/support/v7/internal/widget/ActionBarView:b	(I)V
    //   394: aload_3
    //   395: bipush 13
    //   397: iconst_0
    //   398: invokevirtual 187	android/content/res/TypedArray:getResourceId	(II)I
    //   401: istore 8
    //   403: iload 8
    //   405: ifeq +32 -> 437
    //   408: aload_0
    //   409: aload 6
    //   411: iload 8
    //   413: aload_0
    //   414: iconst_0
    //   415: invokevirtual 191	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   418: putfield 237	android/support/v7/internal/widget/ActionBarView:y	Landroid/view/View;
    //   421: aload_0
    //   422: iconst_0
    //   423: putfield 128	android/support/v7/internal/widget/ActionBarView:i	I
    //   426: aload_0
    //   427: bipush 16
    //   429: aload_0
    //   430: getfield 72	android/support/v7/internal/widget/ActionBarView:j	I
    //   433: ior
    //   434: invokevirtual 235	android/support/v7/internal/widget/ActionBarView:b	(I)V
    //   437: aload_0
    //   438: aload_3
    //   439: iconst_0
    //   440: iconst_0
    //   441: invokevirtual 240	android/content/res/TypedArray:getLayoutDimension	(II)I
    //   444: putfield 243	android/support/v7/internal/widget/ActionBarView:f	I
    //   447: aload_3
    //   448: invokevirtual 247	android/content/res/TypedArray:recycle	()V
    //   451: aload_0
    //   452: new 249	android/support/v7/internal/view/menu/a
    //   455: dup
    //   456: aload_1
    //   457: aload_0
    //   458: getfield 134	android/support/v7/internal/widget/ActionBarView:k	Ljava/lang/CharSequence;
    //   461: invokespecial 252	android/support/v7/internal/view/menu/a:<init>	(Landroid/content/Context;Ljava/lang/CharSequence;)V
    //   464: putfield 254	android/support/v7/internal/widget/ActionBarView:N	Landroid/support/v7/internal/view/menu/a;
    //   467: aload_0
    //   468: getfield 195	android/support/v7/internal/widget/ActionBarView:p	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   471: aload_0
    //   472: getfield 89	android/support/v7/internal/widget/ActionBarView:T	Landroid/view/View$OnClickListener;
    //   475: invokevirtual 204	android/support/v7/internal/widget/ActionBarView$HomeView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   478: aload_0
    //   479: getfield 195	android/support/v7/internal/widget/ActionBarView:p	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   482: iconst_1
    //   483: invokevirtual 257	android/support/v7/internal/widget/ActionBarView$HomeView:setClickable	(Z)V
    //   486: aload_0
    //   487: getfield 195	android/support/v7/internal/widget/ActionBarView:p	Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    //   490: iconst_1
    //   491: invokevirtual 260	android/support/v7/internal/widget/ActionBarView$HomeView:setFocusable	(Z)V
    //   494: return
    //   495: astore 11
    //   497: ldc_w 262
    //   500: ldc_w 264
    //   503: aload 11
    //   505: invokestatic 270	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   508: pop
    //   509: goto -351 -> 158
    //   512: astore 9
    //   514: ldc_w 262
    //   517: ldc_w 264
    //   520: aload 9
    //   522: invokestatic 270	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   525: pop
    //   526: goto -310 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   142	158	495	android/content/pm/PackageManager$NameNotFoundException
    //   200	216	512	android/content/pm/PackageManager$NameNotFoundException
  }

  private void a(n paramn)
  {
    if (paramn != null)
    {
      paramn.a(this.b);
      paramn.a(this.Q);
    }
    while (true)
    {
      this.b.c(true);
      this.Q.c(true);
      return;
      this.b.a(this.o, null);
      this.Q.a(this.o, null);
    }
  }

  private void c(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
    int i1;
    LinearLayout localLinearLayout;
    int i2;
    if (this.s != null)
    {
      this.s.setText(paramCharSequence);
      if ((this.g != null) || ((0x8 & this.j) == 0) || ((TextUtils.isEmpty(this.k)) && (TextUtils.isEmpty(this.l))))
        break label96;
      i1 = 1;
      localLinearLayout = this.r;
      i2 = 0;
      if (i1 == 0)
        break label101;
    }
    while (true)
    {
      localLinearLayout.setVisibility(i2);
      if (this.N != null)
        this.N.setTitle(paramCharSequence);
      return;
      label96: i1 = 0;
      break;
      label101: i2 = 8;
    }
  }

  private void q()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label200: int i1;
    label217: LinearLayout localLinearLayout;
    if (this.r == null)
    {
      this.r = ((LinearLayout)LayoutInflater.from(getContext()).inflate(h.e, this, false));
      this.s = ((TextView)this.r.findViewById(f.g));
      this.t = ((TextView)this.r.findViewById(f.f));
      this.u = this.r.findViewById(f.G);
      this.r.setOnClickListener(this.T);
      if (this.D != 0)
        this.s.setTextAppearance(this.o, this.D);
      if (this.k != null)
        this.s.setText(this.k);
      if (this.E != 0)
        this.t.setTextAppearance(this.o, this.E);
      if (this.l != null)
      {
        this.t.setText(this.l);
        this.t.setVisibility(0);
      }
      if ((0x4 & this.j) == 0)
        break label289;
      bool2 = bool1;
      if ((0x2 & this.j) == 0)
        break label294;
      bool3 = bool1;
      View localView = this.u;
      if (bool3)
        break label305;
      if (!bool2)
        break label299;
      i1 = 0;
      localView.setVisibility(i1);
      localLinearLayout = this.r;
      if ((!bool2) || (bool3))
        break label312;
    }
    while (true)
    {
      localLinearLayout.setEnabled(bool1);
      addView(this.r);
      if ((this.g != null) || ((TextUtils.isEmpty(this.k)) && (TextUtils.isEmpty(this.l))))
        this.r.setVisibility(8);
      return;
      label289: bool2 = false;
      break;
      label294: bool3 = false;
      break label200;
      label299: i1 = 4;
      break label217;
      label305: i1 = 8;
      break label217;
      label312: bool1 = false;
    }
  }

  public final void a(Drawable paramDrawable)
  {
    this.m = paramDrawable;
    if ((paramDrawable != null) && (((0x1 & this.j) == 0) || (this.n == null)))
      this.p.a(paramDrawable);
    if (this.g != null)
      this.q.a(this.m.getConstantState().newDrawable(getResources()));
  }

  public final void a(android.support.v4.a.a.a parama, android.support.v7.internal.view.menu.ab paramab)
  {
    if (parama == this.L)
      return;
    if (this.L != null)
    {
      this.L.b(this.b);
      this.L.b(this.Q);
    }
    n localn = (n)parama;
    this.L = localn;
    if (this.a != null)
    {
      ViewGroup localViewGroup3 = (ViewGroup)this.a.getParent();
      if (localViewGroup3 != null)
        localViewGroup3.removeView(this.a);
    }
    if (this.b == null)
    {
      this.b = new ActionMenuPresenter(this.o);
      this.b.a(paramab);
      this.b.b(f.i);
      this.Q = new c(this, (byte)0);
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    ActionMenuView localActionMenuView;
    if (!this.d)
    {
      this.b.b(getResources().getBoolean(d.b));
      a(localn);
      localActionMenuView = (ActionMenuView)this.b.a(this);
      ViewGroup localViewGroup2 = (ViewGroup)localActionMenuView.getParent();
      if ((localViewGroup2 != null) && (localViewGroup2 != this))
        localViewGroup2.removeView(localActionMenuView);
      addView(localActionMenuView, localLayoutParams);
    }
    while (true)
    {
      this.a = localActionMenuView;
      return;
      this.b.b(false);
      this.b.a(getContext().getResources().getDisplayMetrics().widthPixels);
      this.b.b();
      localLayoutParams.width = -1;
      a(localn);
      localActionMenuView = (ActionMenuView)this.b.a(this);
      if (this.c != null)
      {
        ViewGroup localViewGroup1 = (ViewGroup)localActionMenuView.getParent();
        if ((localViewGroup1 != null) && (localViewGroup1 != this.c))
          localViewGroup1.removeView(localActionMenuView);
        localActionMenuView.setVisibility(super.a());
        this.c.addView(localActionMenuView, localLayoutParams);
      }
      else
      {
        localActionMenuView.setLayoutParams(localLayoutParams);
      }
    }
  }

  public final void a(ActionBarContextView paramActionBarContextView)
  {
    this.M = paramActionBarContextView;
  }

  public final void a(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.x != null)
      removeView(this.x);
    this.x = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null);
    for (boolean bool = true; ; bool = false)
    {
      this.I = bool;
      if ((this.I) && (this.i == 2))
      {
        addView(this.x);
        ViewGroup.LayoutParams localLayoutParams = this.x.getLayoutParams();
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
        paramScrollingTabContainerView.a(true);
      }
      return;
    }
  }

  public final void a(View paramView)
  {
    if ((0x10 & this.j) != 0);
    for (int i1 = 1; ; i1 = 0)
    {
      if ((this.y != null) && (i1 != 0))
        removeView(this.y);
      this.y = paramView;
      if ((this.y != null) && (i1 != 0))
        addView(this.y);
      return;
    }
  }

  public final void a(Window.Callback paramCallback)
  {
    this.h = paramCallback;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.H = true;
    c(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    int i1;
    if (this.d != paramBoolean)
    {
      if (this.a != null)
      {
        ViewGroup localViewGroup = (ViewGroup)this.a.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(this.a);
        if (!paramBoolean)
          break label138;
        if (this.c != null)
          this.c.addView(this.a);
        this.a.getLayoutParams().width = -1;
        this.a.requestLayout();
      }
      if (this.c != null)
      {
        ActionBarContainer localActionBarContainer = this.c;
        if (!paramBoolean)
          break label161;
        i1 = 0;
        label99: localActionBarContainer.setVisibility(i1);
      }
      if (this.b != null)
      {
        if (paramBoolean)
          break label167;
        this.b.b(getResources().getBoolean(d.b));
      }
    }
    while (true)
    {
      super.a(paramBoolean);
      return;
      label138: addView(this.a);
      this.a.getLayoutParams().width = -2;
      break;
      label161: i1 = 8;
      break label99;
      label167: this.b.b(false);
      this.b.a(getContext().getResources().getDisplayMetrics().widthPixels);
      this.b.b();
    }
  }

  public final void b(int paramInt)
  {
    int i1 = 8;
    int i2 = -1;
    boolean bool1 = true;
    boolean bool2;
    label38: int i3;
    label53: boolean bool5;
    label78: boolean bool4;
    label121: Drawable localDrawable;
    label138: label163: boolean bool3;
    if (this.j == i2)
    {
      this.j = paramInt;
      if ((i2 & 0x1F) == 0)
        break label371;
      if ((paramInt & 0x2) == 0)
        break label299;
      bool2 = bool1;
      if ((!bool2) || (this.g != null))
        break label305;
      i3 = 0;
      this.p.setVisibility(i3);
      if ((i2 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label311;
        bool5 = bool1;
        this.p.a(bool5);
        if (bool5)
          c(bool1);
      }
      if ((i2 & 0x1) != 0)
      {
        if ((this.n == null) || ((paramInt & 0x1) == 0))
          break label317;
        bool4 = bool1;
        ActionBarView.HomeView localHomeView = this.p;
        if (!bool4)
          break label323;
        localDrawable = this.n;
        localHomeView.a(localDrawable);
      }
      if ((i2 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label332;
        q();
      }
      if ((this.r != null) && ((i2 & 0x6) != 0))
      {
        if ((0x4 & this.j) == 0)
          break label343;
        bool3 = bool1;
        label190: View localView = this.u;
        if (!bool2)
        {
          if (!bool3)
            break label349;
          i1 = 0;
        }
        label208: localView.setVisibility(i1);
        LinearLayout localLinearLayout = this.r;
        if ((bool2) || (!bool3))
          break label354;
        label230: localLinearLayout.setEnabled(bool1);
      }
      if (((i2 & 0x10) != 0) && (this.y != null))
      {
        if ((paramInt & 0x10) == 0)
          break label360;
        addView(this.y);
      }
      label266: requestLayout();
    }
    while (true)
    {
      if (this.p.isEnabled())
        break label378;
      this.p.setContentDescription(null);
      return;
      i2 = paramInt ^ this.j;
      break;
      label299: bool2 = false;
      break label38;
      label305: i3 = i1;
      break label53;
      label311: bool5 = false;
      break label78;
      label317: bool4 = false;
      break label121;
      label323: localDrawable = this.m;
      break label138;
      label332: removeView(this.r);
      break label163;
      label343: bool3 = false;
      break label190;
      label349: i1 = 4;
      break label208;
      label354: bool1 = false;
      break label230;
      label360: removeView(this.y);
      break label266;
      label371: invalidate();
    }
    label378: if ((paramInt & 0x4) != 0)
    {
      this.p.setContentDescription(this.o.getResources().getText(i.b));
      return;
    }
    this.p.setContentDescription(this.o.getResources().getText(i.a));
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (!this.H)
      c(paramCharSequence);
  }

  public final void c(boolean paramBoolean)
  {
    this.p.setEnabled(paramBoolean);
    this.p.setFocusable(paramBoolean);
    if (!paramBoolean)
    {
      this.p.setContentDescription(null);
      return;
    }
    if ((0x4 & this.j) != 0)
    {
      this.p.setContentDescription(this.o.getResources().getText(i.b));
      return;
    }
    this.p.setContentDescription(this.o.getResources().getText(i.a));
  }

  public final void d(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }

  public final void g()
  {
    this.z = new ProgressBarICS(this.o, this.F);
    this.z.setId(f.s);
    this.z.a(10000);
    this.z.setVisibility(8);
    addView(this.z);
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ActionBar.LayoutParams((byte)0);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ActionBar.LayoutParams(getContext(), paramAttributeSet);
  }

  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = generateDefaultLayoutParams();
    return paramLayoutParams;
  }

  public final void h()
  {
    this.A = new ProgressBarICS(this.o, this.G);
    this.A.setId(f.r);
    this.A.setVisibility(8);
    addView(this.A);
  }

  public final boolean i()
  {
    return this.d;
  }

  public final boolean j()
  {
    return (this.Q != null) && (this.Q.b != null);
  }

  public final void k()
  {
    if (this.Q == null);
    for (r localr = null; ; localr = this.Q.b)
    {
      if (localr != null)
        localr.collapseActionView();
      return;
    }
  }

  public final void l()
  {
    a(this.o.getResources().getDrawable(2130838009));
  }

  public final View m()
  {
    return this.y;
  }

  public final int n()
  {
    return this.i;
  }

  public final int o()
  {
    return this.j;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.s = null;
    this.t = null;
    this.u = null;
    if ((this.r != null) && (this.r.getParent() == this))
      removeView(this.r);
    this.r = null;
    if ((0x8 & this.j) != 0)
      q();
    if ((this.x != null) && (this.I))
    {
      ViewGroup.LayoutParams localLayoutParams = this.x.getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
      }
      this.x.a(true);
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.P);
    if (this.b != null)
    {
      this.b.d();
      this.b.f();
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    addView(this.p);
    if ((this.y != null) && ((0x10 & this.j) != 0))
    {
      ViewParent localViewParent = this.y.getParent();
      if (localViewParent != this)
      {
        if ((localViewParent instanceof ViewGroup))
          ((ViewGroup)localViewParent).removeView(this.y);
        addView(this.y);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    if (i3 <= 0)
      return;
    ActionBarView.HomeView localHomeView;
    label47: int i26;
    if (this.g != null)
    {
      localHomeView = this.q;
      if (localHomeView.getVisibility() == 8)
        break label921;
      i26 = localHomeView.a();
    }
    label908: label921: for (int i4 = i1 + (i26 + a(localHomeView, i1 + i26, i2, i3)); ; i4 = i1)
    {
      int i25;
      if (this.g == null)
      {
        if ((this.r == null) || (this.r.getVisibility() == 8) || ((0x8 & this.j) == 0))
          break label616;
        i25 = 1;
        label125: if (i25 != 0)
          i4 += a(this.r, i4, i2, i3);
      }
      label180: int i5;
      label184: int i6;
      switch (this.i)
      {
      default:
        i5 = i4;
        i6 = paramInt3 - paramInt1 - getPaddingRight();
        if ((this.a != null) && (this.a.getParent() == this))
        {
          b(this.a, i6, i2, i3);
          i6 -= this.a.getMeasuredWidth();
        }
        if ((this.A != null) && (this.A.getVisibility() != 8))
          b(this.A, i6, i2, i3);
      case 0:
      case 1:
      case 2:
      }
      for (int i7 = i6 - this.A.getMeasuredWidth(); ; i7 = i6)
      {
        View localView;
        if (this.g != null)
          localView = this.g;
        while (true)
        {
          label297: ActionBar.LayoutParams localLayoutParams1;
          label324: int i9;
          label336: int i10;
          int i14;
          int i11;
          int i12;
          int i13;
          if (localView != null)
          {
            ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
            if (!(localLayoutParams instanceof ActionBar.LayoutParams))
              break label749;
            localLayoutParams1 = (ActionBar.LayoutParams)localLayoutParams;
            if (localLayoutParams1 == null)
              break label755;
            i9 = localLayoutParams1.a;
            i10 = localView.getMeasuredWidth();
            if (localLayoutParams1 == null)
              break label891;
            int i21 = i5 + localLayoutParams1.leftMargin;
            int i22 = i7 - localLayoutParams1.rightMargin;
            int i23 = localLayoutParams1.topMargin;
            int i24 = localLayoutParams1.bottomMargin;
            i14 = i23;
            i11 = i22;
            i12 = i21;
            i13 = i24;
          }
          while (true)
          {
            int i15 = i9 & 0x7;
            int i20;
            int i16;
            if (i15 == 1)
            {
              i20 = (getWidth() - i10) / 2;
              if (i20 < i12)
                i16 = 3;
            }
            while (true)
            {
              label432: label471: int i18;
              switch (i16)
              {
              case 2:
              case 4:
              default:
                i12 = 0;
              case 3:
                int i17 = i9 & 0x70;
                if (i9 == -1)
                  i17 = 16;
                i18 = 0;
                switch (i17)
                {
                default:
                case 16:
                case 48:
                case 80:
                }
                break;
              case 1:
              case 5:
              }
              while (true)
              {
                localView.layout(i12, i18, i12 + localView.getMeasuredWidth(), i18 + localView.getMeasuredHeight());
                if (this.z == null)
                  break;
                this.z.bringToFront();
                int i8 = this.z.getMeasuredHeight() / 2;
                this.z.layout(this.B, -i8, this.B + this.z.getMeasuredWidth(), i8);
                return;
                localHomeView = this.p;
                break label47;
                label616: i25 = 0;
                break label125;
                i5 = i4;
                break label184;
                if (this.w == null)
                  break label180;
                if (i25 != 0)
                  i4 += this.C;
                i5 = i4 + (a(this.w, i4, i2, i3) + this.C);
                break label184;
                if (this.x == null)
                  break label180;
                if (i25 != 0)
                  i4 += this.C;
                i5 = i4 + (a(this.x, i4, i2, i3) + this.C);
                break label184;
                if (((0x10 & this.j) == 0) || (this.y == null))
                  break label908;
                localView = this.y;
                break label297;
                label749: localLayoutParams1 = null;
                break label324;
                label755: i9 = 19;
                break label336;
                if (i20 + i10 > i11)
                  i15 = 5;
                i16 = i15;
                break label432;
                if (i9 != -1)
                  break label884;
                i16 = 3;
                break label432;
                i12 = (getWidth() - i10) / 2;
                break label471;
                i12 = i11 - i10;
                break label471;
                int i19 = getPaddingTop();
                i18 = (getHeight() - getPaddingBottom() - i19 - localView.getMeasuredHeight()) / 2;
                continue;
                i18 = i14 + getPaddingTop();
                continue;
                i18 = getHeight() - getPaddingBottom() - localView.getMeasuredHeight() - i13;
              }
              label884: i16 = i15;
            }
            label891: i11 = i7;
            i12 = i5;
            i13 = 0;
            i14 = 0;
          }
          localView = null;
        }
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (this.J)
    {
      int i40 = 0;
      for (int i41 = 0; i41 < i1; i41++)
      {
        View localView2 = getChildAt(i41);
        if ((localView2.getVisibility() != 8) && ((localView2 != this.a) || (this.a.getChildCount() != 0)))
          i40++;
      }
      if (i40 == 0)
      {
        setMeasuredDimension(0, 0);
        this.K = true;
        return;
      }
    }
    this.K = false;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"MATCH_PARENT\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) != -2147483648)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3;
    label199: int i4;
    int i7;
    int i8;
    int i9;
    int i10;
    ActionBarView.HomeView localHomeView;
    label268: ViewGroup.LayoutParams localLayoutParams2;
    int i38;
    label303: int i12;
    int i11;
    if (this.f > 0)
    {
      i3 = this.f;
      i4 = getPaddingTop() + getPaddingBottom();
      int i5 = getPaddingLeft();
      int i6 = getPaddingRight();
      i7 = i3 - i4;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      i9 = i2 - i5 - i6;
      i10 = i9 / 2;
      if (this.g == null)
        break label879;
      localHomeView = this.q;
      if (localHomeView.getVisibility() == 8)
        break label1305;
      localLayoutParams2 = localHomeView.getLayoutParams();
      if (localLayoutParams2.width >= 0)
        break label888;
      i38 = View.MeasureSpec.makeMeasureSpec(i9, -2147483648);
      localHomeView.measure(i38, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
      int i39 = localHomeView.getMeasuredWidth() + localHomeView.a();
      i12 = Math.max(0, i9 - i39);
      i11 = Math.max(0, i12 - i39);
    }
    while (true)
    {
      if ((this.a != null) && (this.a.getParent() == this))
      {
        i12 = a(this.a, i12, i8);
        i10 = Math.max(0, i10 - this.a.getMeasuredWidth());
      }
      if ((this.A != null) && (this.A.getVisibility() != 8))
      {
        i12 = a(this.A, i12, i8);
        i10 = Math.max(0, i10 - this.A.getMeasuredWidth());
      }
      int i13;
      label480: int i14;
      label512: int i15;
      View localView1;
      if ((this.r != null) && (this.r.getVisibility() != 8) && ((0x8 & this.j) != 0))
      {
        i13 = 1;
        if (this.g == null);
        switch (this.i)
        {
        default:
          i14 = i11;
          i15 = i12;
          if (this.g != null)
            localView1 = this.g;
        case 1:
        case 2:
        }
      }
      while (true)
      {
        label533: ActionBar.LayoutParams localLayoutParams;
        label564: int i20;
        int i21;
        label623: int i22;
        int i23;
        label669: int i24;
        label689: int i25;
        int i26;
        if (localView1 != null)
        {
          ViewGroup.LayoutParams localLayoutParams1 = generateLayoutParams(localView1.getLayoutParams());
          if (!(localLayoutParams1 instanceof ActionBar.LayoutParams))
            break label1160;
          localLayoutParams = (ActionBar.LayoutParams)localLayoutParams1;
          int i19 = 0;
          i20 = 0;
          if (localLayoutParams != null)
          {
            i20 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i19 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
          }
          if ((this.f <= 0) || (localLayoutParams1.height == -2))
            break label1166;
          i21 = 1073741824;
          if (localLayoutParams1.height >= 0)
            i7 = Math.min(localLayoutParams1.height, i7);
          i22 = Math.max(0, i7 - i19);
          if (localLayoutParams1.width == -2)
            break label1174;
          i23 = 1073741824;
          if (localLayoutParams1.width < 0)
            break label1182;
          i24 = Math.min(localLayoutParams1.width, i15);
          i25 = Math.max(0, i24 - i20);
          if (localLayoutParams == null)
            break label1189;
          i26 = localLayoutParams.a;
          label712: if (((i26 & 0x7) != 1) || (localLayoutParams1.width != -1))
            break label1292;
        }
        label1160: label1292: for (int i27 = 2 * Math.min(i14, i10); ; i27 = i25)
        {
          localView1.measure(View.MeasureSpec.makeMeasureSpec(i27, i23), View.MeasureSpec.makeMeasureSpec(i22, i21));
          i15 -= i20 + localView1.getMeasuredWidth();
          if ((this.g == null) && (i13 != 0))
          {
            a(this.r, i15, View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
            Math.max(0, i14 - this.r.getMeasuredWidth());
          }
          int i16;
          int i17;
          label833: int i18;
          if (this.f <= 0)
          {
            i16 = 0;
            i17 = 0;
            if (i17 < i1)
            {
              i18 = i4 + getChildAt(i17).getMeasuredHeight();
              if (i18 <= i16)
                break label1285;
            }
          }
          while (true)
          {
            i17++;
            i16 = i18;
            break label833;
            i3 = View.MeasureSpec.getSize(paramInt2);
            break label199;
            label879: localHomeView = this.p;
            break label268;
            label888: i38 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label303;
            i13 = 0;
            break label480;
            if (this.w == null)
              break label512;
            if (i13 != 0);
            for (int i33 = 2 * this.C; ; i33 = this.C)
            {
              int i34 = Math.max(0, i12 - i33);
              int i35 = Math.max(0, i11 - i33);
              this.w.measure(View.MeasureSpec.makeMeasureSpec(i34, -2147483648), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
              int i36 = this.w.getMeasuredWidth();
              int i37 = Math.max(0, i34 - i36);
              i14 = Math.max(0, i35 - i36);
              i15 = i37;
              break;
            }
            if (this.x == null)
              break label512;
            if (i13 != 0);
            for (int i28 = 2 * this.C; ; i28 = this.C)
            {
              int i29 = Math.max(0, i12 - i28);
              int i30 = Math.max(0, i11 - i28);
              this.x.measure(View.MeasureSpec.makeMeasureSpec(i29, -2147483648), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
              int i31 = this.x.getMeasuredWidth();
              int i32 = Math.max(0, i29 - i31);
              i14 = Math.max(0, i30 - i31);
              i15 = i32;
              break;
            }
            if (((0x10 & this.j) == 0) || (this.y == null))
              break label1299;
            localView1 = this.y;
            break label533;
            localLayoutParams = null;
            break label564;
            label1166: i21 = -2147483648;
            break label623;
            label1174: i23 = -2147483648;
            break label669;
            label1182: i24 = i15;
            break label689;
            label1189: i26 = 19;
            break label712;
            setMeasuredDimension(i2, i16);
            while (true)
            {
              if (this.M != null)
                this.M.a(getMeasuredHeight());
              if ((this.z == null) || (this.z.getVisibility() == 8))
                break;
              this.z.measure(View.MeasureSpec.makeMeasureSpec(i2 - 2 * this.B, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), -2147483648));
              return;
              setMeasuredDimension(i2, i3);
            }
            i18 = i16;
          }
        }
        label1285: label1299: localView1 = null;
      }
      label1305: i11 = i10;
      i12 = i9;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ActionBarView.SavedState localSavedState = (ActionBarView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if ((localSavedState.a != 0) && (this.Q != null) && (this.L != null))
    {
      android.support.v4.a.a.b localb = (android.support.v4.a.a.b)this.L.findItem(localSavedState.a);
      if (localb != null)
        localb.expandActionView();
    }
    if (localSavedState.b)
      super.c();
  }

  public Parcelable onSaveInstanceState()
  {
    ActionBarView.SavedState localSavedState = new ActionBarView.SavedState(super.onSaveInstanceState());
    if ((this.Q != null) && (this.Q.b != null))
      localSavedState.a = this.Q.b.getItemId();
    localSavedState.b = super.e();
    return localSavedState;
  }

  public final boolean p()
  {
    return this.K;
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ActionBarView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
