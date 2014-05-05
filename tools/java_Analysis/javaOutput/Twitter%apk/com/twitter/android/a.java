package com.twitter.android;

import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class a extends i
{
  private a(SearchTweetsActivity paramSearchTweetsActivity)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.a.e(paramString1)) && (paramInt != 200))
    {
      Toast.makeText(this.a, 2131427619, 0).show();
      this.a.a = 6;
    }
  }

  public final void b(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.a.e(paramString1)) && (paramInt != 200))
    {
      Toast.makeText(this.a, 2131427620, 0).show();
      this.a.a = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
