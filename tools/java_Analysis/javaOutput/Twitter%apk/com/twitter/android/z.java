package com.twitter.android;

import ad;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class z extends i
{
  private z(UserQueryActivity paramUserQueryActivity)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, ad paramad)
  {
    int i;
    if (this.a.e(paramString1))
    {
      this.a.c = false;
      if (paramad == null)
        break label122;
      if (paramInt != 200)
        break label93;
      this.a.b = paramad.g;
      this.a.a = paramad.a;
      this.a.a(paramad);
      i = 0;
    }
    while (true)
    {
      if (i > 0)
      {
        Toast.makeText(this.a, i, 1).show();
        this.a.finish();
      }
      return;
      label93: if ((paramInt == 403) && (paramad.h))
      {
        i = 2131427514;
      }
      else
      {
        i = 2131427403;
        continue;
        label122: if (paramInt == 404)
          i = 2131427576;
        else
          i = 2131427403;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
