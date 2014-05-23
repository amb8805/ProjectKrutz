package com.spotify.mobile.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.l;
import android.view.View;

final class g extends j
{
  protected Fragment a;

  public g(f paramf, Bundle paramBundle)
  {
    super(f.b(paramf), paramBundle);
    this.a = f.c(paramf).a(paramBundle, "fragment");
  }

  public g(f paramf, l paraml, Fragment paramFragment, ActionBarTitle paramActionBarTitle)
  {
    super(paramActionBarTitle);
    this.a = paramFragment;
    paraml.a(f.e(paramf), this.a);
  }

  public g(l paraml, Class<? extends Fragment> paramClass, Fragment.SavedState paramSavedState, Bundle paramBundle, ActionBarTitle paramActionBarTitle)
  {
    super(localActionBarTitle);
    try
    {
      this.a = ((Fragment)paramSavedState.newInstance());
      this.a.a(paramBundle);
      this.a.b_(paramActionBarTitle);
      paramClass.a(f.e(paraml), this.a);
      return;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }

  public final int a()
  {
    return 2;
  }

  public final i a(l paraml)
  {
    d(paraml);
    return new i(this.b, this.a, f());
  }

  public final View b()
  {
    return this.a.v();
  }

  public final h b(l paraml)
  {
    d(paraml);
    return new h(this.b, this.a, f());
  }

  public final g c(l paraml)
  {
    return this;
  }

  public final Class<? extends Fragment> c()
  {
    return this.a.getClass();
  }

  public final Fragment d()
  {
    return this.a;
  }

  public final void d(l paraml)
  {
    paraml.a(this.a);
  }

  public final Bundle e()
  {
    Bundle localBundle = super.e();
    f.c(this.b).a(localBundle, "fragment", this.a);
    return localBundle;
  }

  public final String toString()
  {
    return "Active: " + this.a.getClass().getName();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
