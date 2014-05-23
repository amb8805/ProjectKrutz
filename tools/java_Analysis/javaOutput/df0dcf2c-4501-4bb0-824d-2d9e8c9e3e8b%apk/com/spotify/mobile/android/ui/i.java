package com.spotify.mobile.android.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.l;
import android.view.View;
import java.lang.reflect.Field;

class i extends j
{
  protected Class<? extends Fragment> d;
  protected Fragment.SavedState e;
  protected Bundle f;

  public i(f paramf, Bundle paramBundle)
  {
    super(f.b(paramf), paramBundle);
    paramBundle.setClassLoader(f.b(paramf).getClassLoader());
    this.d = ((Class)paramBundle.getSerializable("class"));
    this.e = ((Fragment.SavedState)paramBundle.getParcelable("saved_state"));
    this.f = ((Bundle)paramBundle.getParcelable("arguments"));
    try
    {
      Field localField = Fragment.SavedState.class.getDeclaredField("a");
      localField.setAccessible(true);
      ((Bundle)localField.get(this.e)).setClassLoader(f.b(paramf).getClassLoader());
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localIllegalArgumentException.printStackTrace();
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localIllegalAccessException.printStackTrace();
    }
  }

  public i(f paramf, Fragment paramFragment, ActionBarTitle paramActionBarTitle)
  {
    super(paramActionBarTitle);
    this.d = paramFragment.getClass();
    this.e = f.c(paramf).a(paramFragment);
    this.f = paramFragment.g();
  }

  public i(l paraml, Fragment.SavedState paramSavedState, Bundle paramBundle, ActionBarTitle paramActionBarTitle)
  {
    super(localActionBarTitle);
    this.d = paramSavedState;
    this.e = paramBundle;
    this.f = paramActionBarTitle;
  }

  public int a()
  {
    return 0;
  }

  public i a(l paraml)
  {
    return this;
  }

  public View b()
  {
    return null;
  }

  public h b(l paraml)
  {
    return new h(this.g, this.d, this.e, this.f, f());
  }

  public g c(l paraml)
  {
    return new g(this.g, paraml, this.d, this.e, this.f, f());
  }

  public final Class<? extends Fragment> c()
  {
    return this.d;
  }

  public final Bundle e()
  {
    Bundle localBundle = super.e();
    localBundle.putSerializable("class", this.d);
    localBundle.putParcelable("saved_state", this.e);
    localBundle.putParcelable("arguments", this.f);
    return localBundle;
  }

  public String toString()
  {
    return "Inactive: " + this.d.getName();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
