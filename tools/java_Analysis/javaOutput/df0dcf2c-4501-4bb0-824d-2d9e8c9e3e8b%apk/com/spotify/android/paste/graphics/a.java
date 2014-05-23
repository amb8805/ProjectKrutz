package com.spotify.android.paste.graphics;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.spotify.android.paste.e;

public final class a
{
  private static final int[] a = arrayOfInt;

  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16842804;
    arrayOfInt[1] = com.spotify.android.paste.b.A;
  }

  public static void a(Context paramContext, TextView paramTextView, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, e.v);
    boolean bool = localTypedArray.getBoolean(0, false);
    localTypedArray.recycle();
    a(paramTextView, bool);
  }

  public static void a(Context paramContext, TextView paramTextView, AttributeSet paramAttributeSet, int paramInt)
  {
    try
    {
      TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, a, paramInt, 0);
      int i = localTypedArray1.getResourceId(0, -1);
      boolean bool1 = false;
      if (i >= 0)
      {
        TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(i, e.v);
        bool1 = localTypedArray2.getBoolean(0, false);
        localTypedArray2.recycle();
      }
      boolean bool2 = localTypedArray1.getBoolean(1, bool1);
      localTypedArray1.recycle();
      a(paramTextView, bool2);
      return;
    }
    finally
    {
    }
  }

  private static void a(TextView paramTextView, boolean paramBoolean)
  {
    if (paramBoolean)
      paramTextView.setTransformationMethod(new b(paramTextView.getContext()));
    while (!(paramTextView.getTransformationMethod() instanceof b))
      return;
    paramTextView.setTransformationMethod(null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
