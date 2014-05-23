package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.spotify.mobile.android.ui.m;

public class CancellableSeekBar extends SeekBar
{
  private boolean a;
  private boolean b;
  private boolean c;
  private int d;
  private b e;
  private float f;

  public CancellableSeekBar(Context paramContext)
  {
    this(paramContext, null);
  }

  public CancellableSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842875);
  }

  public CancellableSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.l);
    this.f = localTypedArray.getDimension(0, 0.0F);
    localTypedArray.recycle();
  }

  private boolean b()
  {
    return (!this.c) && (this.b) && (!this.a);
  }

  public final void a()
  {
    try
    {
      if (b())
        this.d = (1 + this.d);
      while (true)
      {
        return;
        super.incrementProgressBy(1);
      }
    }
    finally
    {
    }
  }

  public final void a(a parama)
  {
    this.e = new b(parama);
    super.setOnSeekBarChangeListener(this.e);
  }

  // ERROR //
  public boolean onTouchEvent(android.view.MotionEvent paramMotionEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 51	com/spotify/mobile/android/ui/view/CancellableSeekBar:c	Z
    //   5: aload_1
    //   6: invokevirtual 82	android/view/MotionEvent:getAction	()I
    //   9: istore_3
    //   10: aload_0
    //   11: getfield 55	com/spotify/mobile/android/ui/view/CancellableSeekBar:a	Z
    //   14: ifeq +30 -> 44
    //   17: iload_3
    //   18: iconst_1
    //   19: if_icmpeq +8 -> 27
    //   22: iload_3
    //   23: iconst_3
    //   24: if_icmpne +13 -> 37
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield 55	com/spotify/mobile/android/ui/view/CancellableSeekBar:a	Z
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 53	com/spotify/mobile/android/ui/view/CancellableSeekBar:b	Z
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 51	com/spotify/mobile/android/ui/view/CancellableSeekBar:c	Z
    //   42: iconst_1
    //   43: ireturn
    //   44: iload_3
    //   45: ifne +20 -> 65
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield 53	com/spotify/mobile/android/ui/view/CancellableSeekBar:b	Z
    //   53: aload_0
    //   54: monitorenter
    //   55: aload_0
    //   56: aload_0
    //   57: invokevirtual 85	com/spotify/mobile/android/ui/view/CancellableSeekBar:getProgress	()I
    //   60: putfield 59	com/spotify/mobile/android/ui/view/CancellableSeekBar:d	I
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: invokevirtual 89	android/view/MotionEvent:getY	()F
    //   69: aload_0
    //   70: getfield 44	com/spotify/mobile/android/ui/view/CancellableSeekBar:f	F
    //   73: fneg
    //   74: fcmpg
    //   75: iflt +21 -> 96
    //   78: aload_1
    //   79: invokevirtual 89	android/view/MotionEvent:getY	()F
    //   82: aload_0
    //   83: invokevirtual 92	com/spotify/mobile/android/ui/view/CancellableSeekBar:getHeight	()I
    //   86: i2f
    //   87: aload_0
    //   88: getfield 44	com/spotify/mobile/android/ui/view/CancellableSeekBar:f	F
    //   91: fadd
    //   92: fcmpl
    //   93: ifle +91 -> 184
    //   96: aload_0
    //   97: iconst_1
    //   98: putfield 55	com/spotify/mobile/android/ui/view/CancellableSeekBar:a	Z
    //   101: aload_1
    //   102: iconst_3
    //   103: invokevirtual 95	android/view/MotionEvent:setAction	(I)V
    //   106: aload_0
    //   107: getfield 71	com/spotify/mobile/android/ui/view/CancellableSeekBar:e	Lcom/spotify/mobile/android/ui/view/b;
    //   110: ifnull +10 -> 120
    //   113: aload_0
    //   114: getfield 71	com/spotify/mobile/android/ui/view/CancellableSeekBar:e	Lcom/spotify/mobile/android/ui/view/b;
    //   117: invokevirtual 97	com/spotify/mobile/android/ui/view/b:a	()V
    //   120: aload_0
    //   121: aload_1
    //   122: invokespecial 99	android/widget/SeekBar:onTouchEvent	(Landroid/view/MotionEvent;)Z
    //   125: istore 4
    //   127: aload_0
    //   128: monitorenter
    //   129: aload_0
    //   130: aload_0
    //   131: getfield 59	com/spotify/mobile/android/ui/view/CancellableSeekBar:d	I
    //   134: invokevirtual 102	com/spotify/mobile/android/ui/view/CancellableSeekBar:setProgress	(I)V
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_0
    //   140: getfield 71	com/spotify/mobile/android/ui/view/CancellableSeekBar:e	Lcom/spotify/mobile/android/ui/view/b;
    //   143: ifnull +11 -> 154
    //   146: aload_0
    //   147: getfield 71	com/spotify/mobile/android/ui/view/CancellableSeekBar:e	Lcom/spotify/mobile/android/ui/view/b;
    //   150: aload_0
    //   151: invokevirtual 105	com/spotify/mobile/android/ui/view/b:a	(Landroid/widget/SeekBar;)V
    //   154: aload_0
    //   155: iconst_0
    //   156: putfield 51	com/spotify/mobile/android/ui/view/CancellableSeekBar:c	Z
    //   159: iload 4
    //   161: ireturn
    //   162: astore 7
    //   164: aload_0
    //   165: monitorexit
    //   166: aload 7
    //   168: athrow
    //   169: astore_2
    //   170: aload_0
    //   171: iconst_0
    //   172: putfield 51	com/spotify/mobile/android/ui/view/CancellableSeekBar:c	Z
    //   175: aload_2
    //   176: athrow
    //   177: astore 5
    //   179: aload_0
    //   180: monitorexit
    //   181: aload 5
    //   183: athrow
    //   184: iload_3
    //   185: iconst_1
    //   186: if_icmpne +8 -> 194
    //   189: aload_0
    //   190: iconst_0
    //   191: putfield 53	com/spotify/mobile/android/ui/view/CancellableSeekBar:b	Z
    //   194: aload_0
    //   195: aload_1
    //   196: invokespecial 99	android/widget/SeekBar:onTouchEvent	(Landroid/view/MotionEvent;)Z
    //   199: istore 6
    //   201: aload_0
    //   202: iconst_0
    //   203: putfield 51	com/spotify/mobile/android/ui/view/CancellableSeekBar:c	Z
    //   206: iload 6
    //   208: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   55	65	162	finally
    //   0	17	169	finally
    //   27	37	169	finally
    //   48	55	169	finally
    //   65	96	169	finally
    //   96	120	169	finally
    //   120	129	169	finally
    //   139	154	169	finally
    //   164	169	169	finally
    //   179	184	169	finally
    //   189	194	169	finally
    //   194	201	169	finally
    //   129	139	177	finally
  }

  public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener)
  {
    if (paramOnSeekBarChangeListener == null);
    for (this.e = null; ; this.e = new b(paramOnSeekBarChangeListener))
    {
      super.setOnSeekBarChangeListener(this.e);
      return;
    }
  }

  public void setProgress(int paramInt)
  {
    try
    {
      if (b())
        this.d = paramInt;
      while (true)
      {
        return;
        super.setProgress(paramInt);
      }
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.CancellableSeekBar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
