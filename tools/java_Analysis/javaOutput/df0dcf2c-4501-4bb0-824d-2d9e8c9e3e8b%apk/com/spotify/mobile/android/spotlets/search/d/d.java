package com.spotify.mobile.android.spotlets.search.d;

import android.util.SparseIntArray;
import com.google.common.base.i;
import java.util.Locale;

public final class d
{
  private final Locale a;
  private final boolean b;
  private final SparseIntArray c;

  public d(Locale paramLocale)
  {
    this.a = ((Locale)i.a(paramLocale));
    String str = paramLocale.getLanguage();
    if (("tr".equals(str)) || ("az".equals(str)) || ("tl".equals(str)));
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      if (!bool)
        break;
      this.c = new SparseIntArray(128);
      return;
    }
    this.c = null;
  }

  private static int a(int paramInt, Locale paramLocale)
  {
    if (paramLocale != null)
      return new String(Character.toChars(paramInt)).toLowerCase(paramLocale).codePointAt(0);
    if (paramInt == 304)
      return 105;
    if (paramInt == 931)
      return 962;
    return Character.toLowerCase(paramInt);
  }

  public final int a(int paramInt)
  {
    if ((paramInt < 65) || ((paramInt > 90) && (paramInt < 97)) || ((paramInt > 122) && (paramInt < 127)))
      return paramInt;
    if (this.b)
    {
      int i = this.c.indexOfKey(paramInt);
      if (i < 0);
      for (int j = a(paramInt, this.a); ; j = this.c.valueAt(i))
      {
        if (i < 0)
          this.c.put(paramInt, j);
        return j;
      }
    }
    return a(paramInt, null);
  }

  public final String a(String paramString)
  {
    return paramString.toLowerCase(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
