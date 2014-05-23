package com.spotify.android.paste.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.graphics.a;

public final class g
{
  public static int a(Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    int i = localTypedArray.getColor(0, 0);
    localTypedArray.recycle();
    return i;
  }

  public static void a(Context paramContext, TextView paramTextView, int paramInt)
  {
    paramTextView.setTextAppearance(paramContext, paramInt);
    if (!paramTextView.isInEditMode())
    {
      Typeface localTypeface = com.spotify.android.paste.graphics.g.a(paramContext, paramInt);
      if (localTypeface != null)
        paramTextView.setTypeface(localTypeface);
      a.a(paramContext, paramTextView, paramInt);
    }
  }

  @TargetApi(16)
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.setBackground(paramDrawable);
      return;
    }
    paramView.setBackgroundDrawable(paramDrawable);
  }

  public static ColorStateList b(Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    ColorStateList localColorStateList = localTypedArray.getColorStateList(0);
    localTypedArray.recycle();
    return localColorStateList;
  }

  public static void b(Context paramContext, TextView paramTextView, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    int i = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    a(paramContext, paramTextView, i);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
