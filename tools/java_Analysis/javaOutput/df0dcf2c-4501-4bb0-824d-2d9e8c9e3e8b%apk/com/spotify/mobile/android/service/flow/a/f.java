package com.spotify.mobile.android.service.flow.a;

import android.net.Uri;
import com.spotify.mobile.android.ui.fragments.aa;

public final class f extends aa
{
  public f()
  {
  }

  protected final void a(String paramString)
  {
    super.a(paramString);
    if (paramString.contains("/invite/"))
    {
      d locald = (d)m();
      if (locald != null)
        locald.C().a(paramString);
    }
  }

  protected final boolean a(Uri paramUri)
  {
    if ((paramUri == null) || (paramUri.getPath() == null));
    while (!paramUri.getPath().contains("/login/"))
      return false;
    ((d)m()).C().a();
    return true;
  }

  protected final void b()
  {
    b(((d)m()).D());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
