package com.twitter.android;

import android.text.Editable.Factory;
import android.text.SpannableStringBuilder;
import android.util.Log;
import java.util.ArrayList;

final class as extends SpannableStringBuilder
{
  static final Editable.Factory a = new n();
  private static final boolean b = Log.isLoggable("LockEditable", 3);
  private bx c;

  public as(CharSequence paramCharSequence)
  {
    super(paramCharSequence);
  }

  public final void a(int paramInt, String paramString)
  {
    if (b)
      Log.d("LockEditable", "replaceLockedText tag: " + paramInt + ", text: " + paramString);
    ff[] arrayOfff = (ff[])getSpans(0, length(), ff.class);
    int i = arrayOfff.length;
    for (int j = 0; ; j++)
    {
      if (j < i)
      {
        ff localff = arrayOfff[j];
        if (localff.a() != paramInt)
          continue;
        int k = getSpanStart(localff);
        int m = getSpanEnd(localff);
        removeSpan(localff);
        replace(k, m, paramString);
        if (paramString.length() > 0)
          setSpan(localff, k, k + paramString.length(), 33);
      }
      return;
    }
  }

  public final void a(bx parambx)
  {
    this.c = parambx;
  }

  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    if (b)
      Log.d("LockEditable", "replace: " + paramInt1 + " - " + paramInt2 + " -> " + paramInt3 + " - " + paramInt4 + " " + paramCharSequence);
    ff[] arrayOfff = (ff[])getSpans(paramInt1, paramInt2, ff.class);
    if (arrayOfff.length == 0)
      return super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    int i = arrayOfff.length;
    ArrayList localArrayList = null;
    int j = 0;
    if (j < i)
    {
      ff localff = arrayOfff[j];
      int k = getSpanStart(localff);
      int m = getSpanEnd(localff);
      if ((paramInt2 <= k) || (paramInt1 >= m))
        if (b)
          Log.d("LockEditable", "replace no overlap: " + paramInt1 + " - " + paramInt2 + " with span " + k + " - " + m);
      while (true)
      {
        j++;
        break;
        if (b)
          Log.d("LockEditable", "replace overlap: " + paramInt1 + " - " + paramInt2 + " with span " + k + " - " + m);
        if (localArrayList == null)
          localArrayList = new ArrayList();
        localArrayList.add(Integer.valueOf(localff.a()));
      }
    }
    if (localArrayList != null)
    {
      if (paramInt3 == paramInt4)
        this.c.a(localArrayList);
      return this;
    }
    return super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
