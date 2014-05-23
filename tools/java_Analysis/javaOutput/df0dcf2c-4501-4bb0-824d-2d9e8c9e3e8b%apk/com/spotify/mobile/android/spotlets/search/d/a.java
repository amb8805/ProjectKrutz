package com.spotify.mobile.android.spotlets.search.d;

import com.google.common.base.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class a
{
  private final d a;
  private String b;
  private int c;

  public a(Locale paramLocale)
  {
    this.a = new d((Locale)i.a(paramLocale));
  }

  private int[] a(String paramString, int paramInt)
  {
    int[] arrayOfInt = { -1, -1 };
    if (this.c == 0)
      return arrayOfInt;
    int i = paramString.length();
    int j = paramInt;
    while (true)
    {
      int k;
      if (j < i)
      {
        k = paramString.codePointAt(j);
        int m = this.b.codePointAt(0);
        int n = 0;
        int i1 = j;
        while (this.a.a(k) == m)
        {
          i1 += Character.charCount(k);
          n += Character.charCount(k);
          if ((i1 == i) || (n == this.c))
            break;
          k = paramString.codePointAt(i1);
          m = this.b.codePointAt(n);
        }
        if (n == this.c)
        {
          arrayOfInt[0] = j;
          arrayOfInt[1] = i1;
        }
      }
      else
      {
        return arrayOfInt;
      }
      j += Character.charCount(k);
    }
  }

  public final void a(String paramString)
  {
    this.b = this.a.a(paramString);
    this.c = this.b.length();
  }

  public final List<int[]> b(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt;
    for (int i = 0; ; i = arrayOfInt[1])
    {
      arrayOfInt = a(paramString, i);
      if (arrayOfInt[0] == -1)
        break;
      localArrayList.add(arrayOfInt);
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
