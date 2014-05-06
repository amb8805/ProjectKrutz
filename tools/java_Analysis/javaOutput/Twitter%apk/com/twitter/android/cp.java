package com.twitter.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class cp extends i
{
  private cp(SearchQueriesFragment paramSearchQueriesFragment)
  {
  }

  private void a(String paramString)
  {
    dp localdp = this.a.c(paramString);
    if (localdp != null)
    {
      SharedPreferences.Editor localEditor = this.a.a.edit();
      localEditor.putLong("last", System.currentTimeMillis());
      localEditor.commit();
      this.a.c(localdp.b);
    }
  }

  public final void c(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    a(paramString1);
  }

  public final void i(j paramj, String paramString1, int paramInt, String paramString2)
  {
    a(paramString1);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
