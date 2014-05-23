package com.spotify.mobile.android.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.view.View;

abstract class j
{
  private ActionBarTitle a;

  public j(Context paramContext, Bundle paramBundle)
  {
    String str = paramBundle.getString("title");
    float f = paramBundle.getFloat("title_alpha");
    this.a = new ActionBarTitle(paramContext, str);
    this.a.a(f);
  }

  public j(ActionBarTitle paramActionBarTitle)
  {
    this.a = paramActionBarTitle;
  }

  public abstract int a();

  public abstract i a(l paraml);

  public final void a(ActionBarTitle paramActionBarTitle)
  {
    this.a = paramActionBarTitle;
  }

  public abstract View b();

  public abstract h b(l paraml);

  public abstract g c(l paraml);

  public abstract Class<? extends Fragment> c();

  public void d(l paraml)
  {
  }

  public Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", this.a.toString());
    localBundle.putFloat("title_alpha", this.a.a());
    localBundle.putInt("type", a());
    return localBundle;
  }

  public final ActionBarTitle f()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
