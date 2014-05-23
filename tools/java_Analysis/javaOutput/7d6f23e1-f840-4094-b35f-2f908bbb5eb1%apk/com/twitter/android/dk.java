package com.twitter.android;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;
import com.twitter.android.client.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m;

final class dk extends e
{
  public dk(SearchTweetsFragment paramSearchTweetsFragment, Context paramContext)
  {
    super(paramSearchTweetsFragment, paramContext);
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      this.b.b = 6;
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, double paramDouble1, double paramDouble2, String paramString3)
  {
    if (this.b.c(paramString1) != null)
    {
      this.b.c = paramString3;
      this.b.d(3);
    }
  }

  public final void a(HashMap paramHashMap)
  {
    if (this.b.d != null)
    {
      Iterator localIterator = paramHashMap.values().iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if ((localm != null) && (localm.a.startsWith("http://maps.google.com/")))
          this.b.d.setImageBitmap(localm.a());
      }
    }
    if (this.b.f != null)
      this.b.f.a(paramHashMap);
  }

  public final void b(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.b.c(paramString1) != null) && (paramInt != 200))
      this.b.b = 0;
  }

  public final void e(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      if (paramInt1 != 200)
        break label82;
      if (localdp.b != 3)
        break label67;
      this.b.e = String.valueOf(paramLong);
      this.b.f();
    }
    while (true)
    {
      if (paramInt2 > 0)
        this.b.a = (paramInt2 + 1);
      return;
      label67: this.b.c(localdp.b);
    }
    label82: Toast.makeText(this.a, 2131427463, 1).show();
    this.b.c(localdp.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
