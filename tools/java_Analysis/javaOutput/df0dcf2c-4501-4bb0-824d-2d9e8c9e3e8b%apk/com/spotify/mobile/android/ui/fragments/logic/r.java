package com.spotify.mobile.android.ui.fragments.logic;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import java.util.LinkedHashSet;
import java.util.Set;

public final class r extends Fragment
{
  private Set<s> a = new LinkedHashSet();
  private String b;
  private o<Cursor> c = new r.1(this);

  public r()
  {
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.b = paramBundle.getString("current_user");
    t().a(2131362165, null, this.c);
  }

  public final void a(s params)
  {
    this.a.add(params);
  }

  public final String b()
  {
    return this.b;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("current_user", this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
