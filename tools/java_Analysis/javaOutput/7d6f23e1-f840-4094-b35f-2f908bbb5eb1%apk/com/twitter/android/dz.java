package com.twitter.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.LoaderManager;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;
import java.util.HashMap;
import java.util.HashSet;

final class dz extends i
{
  private dz(DiscoverFragment paramDiscoverFragment)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    DiscoverFragment localDiscoverFragment;
    if ((this.a.c(paramString1) != null) && (!paramBoolean))
    {
      SharedPreferences.Editor localEditor = this.a.a.edit();
      localEditor.putLong("last_refresh", System.currentTimeMillis());
      localEditor.commit();
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427695, 1).show();
      localDiscoverFragment = this.a;
      if (paramInt2 <= 0)
        break label123;
    }
    label123: for (boolean bool = true; ; bool = false)
    {
      localDiscoverFragment.d = bool;
      this.a.b.clear();
      this.a.getLoaderManager().initLoader(0, null, this.a);
      return;
    }
  }

  public final void a(HashMap paramHashMap)
  {
    if (this.a.c != null)
      ((cz)this.a.c.c()).a(paramHashMap);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
