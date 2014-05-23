package com.spotify.mobile.android.ui.page.a;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.page.j;

public abstract class f extends j
{
  public f(Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
  }

  protected abstract String c();

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    f localf;
    do
    {
      return true;
      if ((paramObject == null) || (paramObject.getClass() != getClass()))
        return false;
      localf = (f)paramObject;
      if (c() != null)
        break;
    }
    while (localf.c() == null);
    return false;
    return c().equals(localf.c());
  }

  public int hashCode()
  {
    return c().hashCode();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
