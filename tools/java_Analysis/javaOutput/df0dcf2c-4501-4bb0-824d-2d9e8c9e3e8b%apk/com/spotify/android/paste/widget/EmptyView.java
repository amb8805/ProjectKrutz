package com.spotify.android.paste.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.b;
import com.spotify.android.paste.widget.internal.a;

public class EmptyView extends LinearLayout
{
  private static final int[] a = { 16843161, 16843233, 16843087 };
  private final TextView b;
  private final TextView c;
  private final ImageView d;
  private a e;
  private int f;
  private float g;
  private boolean h;

  public EmptyView(Context paramContext)
  {
    this(paramContext, null);
  }

  public EmptyView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.n);
  }

  // ERROR //
  public EmptyView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial 42	android/widget/LinearLayout:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: ldc 2
    //   8: aload_0
    //   9: invokestatic 47	com/spotify/android/paste/widget/f:a	(Ljava/lang/Class;Ljava/lang/Object;)V
    //   12: aload_0
    //   13: iconst_1
    //   14: invokevirtual 51	com/spotify/android/paste/widget/EmptyView:setOrientation	(I)V
    //   17: aload_0
    //   18: bipush 17
    //   20: invokevirtual 54	com/spotify/android/paste/widget/EmptyView:setGravity	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: getstatic 26	com/spotify/android/paste/widget/EmptyView:a	[I
    //   28: iload_3
    //   29: iconst_0
    //   30: invokevirtual 60	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   33: astore 4
    //   35: aload 4
    //   37: iconst_0
    //   38: invokevirtual 66	android/content/res/TypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   41: astore 5
    //   43: aload 4
    //   45: iconst_1
    //   46: invokevirtual 70	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   49: astore 6
    //   51: aload 4
    //   53: iconst_2
    //   54: invokevirtual 70	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   57: astore 7
    //   59: aload 4
    //   61: invokevirtual 73	android/content/res/TypedArray:recycle	()V
    //   64: aload_1
    //   65: aload_2
    //   66: getstatic 78	com/spotify/android/paste/e:j	[I
    //   69: iload_3
    //   70: iconst_0
    //   71: invokevirtual 60	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   74: astore 8
    //   76: aload 8
    //   78: iconst_0
    //   79: iconst_0
    //   80: invokevirtual 82	android/content/res/TypedArray:getResourceId	(II)I
    //   83: istore 9
    //   85: aload 8
    //   87: iconst_1
    //   88: invokevirtual 86	android/content/res/TypedArray:getColorStateList	(I)Landroid/content/res/ColorStateList;
    //   91: astore 10
    //   93: aload 8
    //   95: iconst_2
    //   96: iconst_0
    //   97: invokevirtual 82	android/content/res/TypedArray:getResourceId	(II)I
    //   100: istore 11
    //   102: aload 8
    //   104: iconst_3
    //   105: invokevirtual 86	android/content/res/TypedArray:getColorStateList	(I)Landroid/content/res/ColorStateList;
    //   108: astore 12
    //   110: aload 8
    //   112: iconst_4
    //   113: iconst_0
    //   114: invokevirtual 89	android/content/res/TypedArray:getDimensionPixelOffset	(II)I
    //   117: istore 13
    //   119: aload 8
    //   121: iconst_5
    //   122: iconst_0
    //   123: invokevirtual 89	android/content/res/TypedArray:getDimensionPixelOffset	(II)I
    //   126: istore 14
    //   128: aload 8
    //   130: bipush 6
    //   132: iconst_0
    //   133: invokevirtual 89	android/content/res/TypedArray:getDimensionPixelOffset	(II)I
    //   136: istore 15
    //   138: aload_0
    //   139: aload 8
    //   141: bipush 7
    //   143: ldc 90
    //   145: aload_0
    //   146: invokevirtual 94	com/spotify/android/paste/widget/EmptyView:getResources	()Landroid/content/res/Resources;
    //   149: invokestatic 99	com/spotify/android/paste/graphics/d:b	(FLandroid/content/res/Resources;)I
    //   152: invokevirtual 102	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   155: putfield 104	com/spotify/android/paste/widget/EmptyView:f	I
    //   158: aload 8
    //   160: invokevirtual 73	android/content/res/TypedArray:recycle	()V
    //   163: aload_1
    //   164: aload_2
    //   165: iconst_1
    //   166: newarray int
    //   168: dup
    //   169: iconst_0
    //   170: ldc 105
    //   172: iastore
    //   173: iload_3
    //   174: iconst_0
    //   175: invokevirtual 60	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   178: astore 8
    //   180: aload 8
    //   182: iconst_0
    //   183: invokevirtual 66	android/content/res/TypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   186: astore 24
    //   188: aload 8
    //   190: invokevirtual 73	android/content/res/TypedArray:recycle	()V
    //   193: aload 24
    //   195: astore 18
    //   197: aload_1
    //   198: getstatic 109	com/spotify/android/paste/d:b	I
    //   201: aload_0
    //   202: invokestatic 113	com/spotify/android/paste/widget/EmptyView:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   205: pop
    //   206: aload_0
    //   207: aload_0
    //   208: getstatic 118	com/spotify/android/paste/c:o	I
    //   211: invokevirtual 122	com/spotify/android/paste/widget/EmptyView:findViewById	(I)Landroid/view/View;
    //   214: checkcast 124	android/widget/TextView
    //   217: putfield 126	com/spotify/android/paste/widget/EmptyView:b	Landroid/widget/TextView;
    //   220: aload_0
    //   221: aload_0
    //   222: getstatic 127	com/spotify/android/paste/c:n	I
    //   225: invokevirtual 122	com/spotify/android/paste/widget/EmptyView:findViewById	(I)Landroid/view/View;
    //   228: checkcast 124	android/widget/TextView
    //   231: putfield 129	com/spotify/android/paste/widget/EmptyView:c	Landroid/widget/TextView;
    //   234: aload_0
    //   235: aload_0
    //   236: getstatic 130	com/spotify/android/paste/c:f	I
    //   239: invokevirtual 122	com/spotify/android/paste/widget/EmptyView:findViewById	(I)Landroid/view/View;
    //   242: checkcast 132	android/widget/ImageView
    //   245: putfield 134	com/spotify/android/paste/widget/EmptyView:d	Landroid/widget/ImageView;
    //   248: new 136	com/spotify/android/paste/widget/internal/a
    //   251: dup
    //   252: aload_0
    //   253: getstatic 138	com/spotify/android/paste/c:a	I
    //   256: invokevirtual 122	com/spotify/android/paste/widget/EmptyView:findViewById	(I)Landroid/view/View;
    //   259: checkcast 140	android/view/ViewGroup
    //   262: invokespecial 143	com/spotify/android/paste/widget/internal/a:<init>	(Landroid/view/ViewGroup;)V
    //   265: astore 20
    //   267: aload_0
    //   268: aload 20
    //   270: putfield 145	com/spotify/android/paste/widget/EmptyView:e	Lcom/spotify/android/paste/widget/internal/a;
    //   273: aload_0
    //   274: aload 6
    //   276: invokevirtual 148	com/spotify/android/paste/widget/EmptyView:a	(Ljava/lang/CharSequence;)V
    //   279: aload_0
    //   280: aload 7
    //   282: invokevirtual 150	com/spotify/android/paste/widget/EmptyView:b	(Ljava/lang/CharSequence;)V
    //   285: aload_0
    //   286: aload 5
    //   288: invokevirtual 153	com/spotify/android/paste/widget/EmptyView:a	(Landroid/graphics/drawable/Drawable;)V
    //   291: aload_0
    //   292: aload 18
    //   294: invokestatic 158	com/spotify/android/paste/widget/g:a	(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    //   297: aload_1
    //   298: invokevirtual 159	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   301: invokevirtual 165	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   304: astore 21
    //   306: aload 21
    //   308: getfield 170	android/util/DisplayMetrics:widthPixels	I
    //   311: i2f
    //   312: aload 21
    //   314: getfield 173	android/util/DisplayMetrics:density	F
    //   317: fdiv
    //   318: ldc 174
    //   320: fcmpg
    //   321: ifge +182 -> 503
    //   324: ldc 175
    //   326: aload_0
    //   327: invokevirtual 94	com/spotify/android/paste/widget/EmptyView:getResources	()Landroid/content/res/Resources;
    //   330: invokestatic 177	com/spotify/android/paste/graphics/d:a	(FLandroid/content/res/Resources;)I
    //   333: istore 22
    //   335: ldc 178
    //   337: aload_0
    //   338: invokevirtual 94	com/spotify/android/paste/widget/EmptyView:getResources	()Landroid/content/res/Resources;
    //   341: invokestatic 177	com/spotify/android/paste/graphics/d:a	(FLandroid/content/res/Resources;)I
    //   344: istore 23
    //   346: aload_0
    //   347: iload 22
    //   349: iload 23
    //   351: iload 22
    //   353: iload 23
    //   355: invokevirtual 182	com/spotify/android/paste/widget/EmptyView:setPadding	(IIII)V
    //   358: iload 9
    //   360: ifeq +13 -> 373
    //   363: aload_1
    //   364: aload_0
    //   365: getfield 126	com/spotify/android/paste/widget/EmptyView:b	Landroid/widget/TextView;
    //   368: iload 9
    //   370: invokestatic 185	com/spotify/android/paste/widget/g:a	(Landroid/content/Context;Landroid/widget/TextView;I)V
    //   373: iload 11
    //   375: ifeq +13 -> 388
    //   378: aload_1
    //   379: aload_0
    //   380: getfield 129	com/spotify/android/paste/widget/EmptyView:c	Landroid/widget/TextView;
    //   383: iload 11
    //   385: invokestatic 185	com/spotify/android/paste/widget/g:a	(Landroid/content/Context;Landroid/widget/TextView;I)V
    //   388: aload 10
    //   390: ifnull +12 -> 402
    //   393: aload_0
    //   394: getfield 126	com/spotify/android/paste/widget/EmptyView:b	Landroid/widget/TextView;
    //   397: aload 10
    //   399: invokevirtual 189	android/widget/TextView:setTextColor	(Landroid/content/res/ColorStateList;)V
    //   402: aload 12
    //   404: ifnull +12 -> 416
    //   407: aload_0
    //   408: getfield 129	com/spotify/android/paste/widget/EmptyView:c	Landroid/widget/TextView;
    //   411: aload 12
    //   413: invokevirtual 189	android/widget/TextView:setTextColor	(Landroid/content/res/ColorStateList;)V
    //   416: iload 13
    //   418: ifle +18 -> 436
    //   421: aload_0
    //   422: getfield 134	com/spotify/android/paste/widget/EmptyView:d	Landroid/widget/ImageView;
    //   425: invokevirtual 193	android/widget/ImageView:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
    //   428: checkcast 195	android/widget/LinearLayout$LayoutParams
    //   431: iload 13
    //   433: putfield 198	android/widget/LinearLayout$LayoutParams:bottomMargin	I
    //   436: iload 14
    //   438: ifle +18 -> 456
    //   441: aload_0
    //   442: getfield 129	com/spotify/android/paste/widget/EmptyView:c	Landroid/widget/TextView;
    //   445: invokevirtual 199	android/widget/TextView:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
    //   448: checkcast 195	android/widget/LinearLayout$LayoutParams
    //   451: iload 14
    //   453: putfield 202	android/widget/LinearLayout$LayoutParams:topMargin	I
    //   456: iload 15
    //   458: ifle +21 -> 479
    //   461: aload_0
    //   462: getstatic 138	com/spotify/android/paste/c:a	I
    //   465: invokevirtual 122	com/spotify/android/paste/widget/EmptyView:findViewById	(I)Landroid/view/View;
    //   468: invokevirtual 205	android/view/View:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
    //   471: checkcast 195	android/widget/LinearLayout$LayoutParams
    //   474: iload 15
    //   476: putfield 202	android/widget/LinearLayout$LayoutParams:topMargin	I
    //   479: return
    //   480: astore 17
    //   482: aload 8
    //   484: invokevirtual 73	android/content/res/TypedArray:recycle	()V
    //   487: aconst_null
    //   488: astore 18
    //   490: goto -293 -> 197
    //   493: astore 16
    //   495: aload 8
    //   497: invokevirtual 73	android/content/res/TypedArray:recycle	()V
    //   500: aload 16
    //   502: athrow
    //   503: ldc 206
    //   505: aload_0
    //   506: invokevirtual 94	com/spotify/android/paste/widget/EmptyView:getResources	()Landroid/content/res/Resources;
    //   509: invokestatic 177	com/spotify/android/paste/graphics/d:a	(FLandroid/content/res/Resources;)I
    //   512: istore 22
    //   514: ldc 175
    //   516: aload_0
    //   517: invokevirtual 94	com/spotify/android/paste/widget/EmptyView:getResources	()Landroid/content/res/Resources;
    //   520: invokestatic 177	com/spotify/android/paste/graphics/d:a	(FLandroid/content/res/Resources;)I
    //   523: istore 23
    //   525: goto -179 -> 346
    //
    // Exception table:
    //   from	to	target	type
    //   163	188	480	android/content/res/Resources$NotFoundException
    //   163	188	493	finally
  }

  public final void a()
  {
    this.g = 1.0F;
    this.h = true;
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      this.d.setVisibility(0);
      this.d.setImageDrawable(paramDrawable);
      return;
    }
    this.d.setVisibility(8);
  }

  public final void a(View paramView)
  {
    this.e.a(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
  }

  public final TextView b()
  {
    return this.b;
  }

  public final void b(CharSequence paramCharSequence)
  {
    TextView localTextView = this.c;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i = 8; ; i = 0)
    {
      localTextView.setVisibility(i);
      this.c.setText(paramCharSequence);
      return;
    }
  }

  public final TextView c()
  {
    return this.c;
  }

  public final ImageView d()
  {
    return this.d;
  }

  public final View e()
  {
    return this.e.b();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.e.a();
    Drawable localDrawable = this.d.getDrawable();
    int i;
    if (localDrawable != null)
    {
      i = this.f;
      if (!this.h)
        break label80;
    }
    label80: for (float f1 = this.g; ; f1 = localDrawable.getIntrinsicWidth() / localDrawable.getIntrinsicHeight())
    {
      int j = Math.round(i / f1);
      this.d.getLayoutParams().width = i;
      this.d.getLayoutParams().height = j;
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.EmptyView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
