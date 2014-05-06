package com.twitter.android;

import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class fw extends i
{
  private fw(ListTabActivity paramListTabActivity)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    if (this.a.e(paramString1))
    {
      if (paramInt1 != 200)
        break label44;
      this.a.c = 1;
    }
    label44: for (int i = 2131427437; ; i = 2131427438)
    {
      Toast.makeText(this.a, i, 1).show();
      return;
    }
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, long paramLong1, long paramLong2)
  {
    if (this.a.e(paramString1))
    {
      this.a.a(false);
      if (paramInt == 200)
      {
        this.a.b = paramLong1;
        this.a.a = paramLong2;
      }
      this.a.d();
    }
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    if (this.a.e(paramString1))
    {
      if (paramInt1 != 200)
        break label44;
      this.a.c = 2;
    }
    label44: for (int i = 2131427439; ; i = 2131427440)
    {
      Toast.makeText(this.a, i, 1).show();
      return;
    }
  }

  public final void c(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    if ((this.a.a == paramLong1) && (paramLong2 == this.a.e.j()) && ((paramInt1 == 200) || (paramInt1 == 404)))
      this.a.c();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
