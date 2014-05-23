package com.spotify.mobile.android.spotlets.search.c;

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.search.d.d;
import com.spotify.mobile.android.spotlets.search.e.e;
import java.util.Locale;

final class a
  implements e
{
  private final b a;
  private final d b;
  private String c;

  a(b paramb)
  {
    this.a = paramb;
    this.b = new d(Locale.getDefault());
  }

  public final void a(String paramString)
  {
    int i = 1;
    String str = this.c;
    if (!TextUtils.isEmpty(paramString))
      if (!TextUtils.isEmpty(str));
    label121: 
    while (true)
    {
      if (i != 0)
        this.a.b();
      this.c = paramString;
      return;
      int j = str.codePointAt(0);
      int k = paramString.codePointAt(0);
      if (((j != k) && (this.b.a(j) != this.b.a(k))) || ((str.trim().length() != 2) && (paramString.trim().length() == i)));
      for (int m = i; ; m = 0)
      {
        if (m != 0)
          break label121;
        i = 0;
        break;
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
  }

  public final void b(String paramString)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
