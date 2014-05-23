package com.spotify.mobile.android.service.flow.a;

import android.os.Bundle;
import com.spotify.mobile.android.service.flow.b;
import com.spotify.mobile.android.ui.AnimationDirection;
import com.spotify.mobile.android.util.cc;

public final class i extends a
{
  public i()
  {
    a(b.class, new i.1(this));
  }

  public static i a(String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArray("licenses", paramArrayOfString);
    i locali = new i();
    locali.b_(localBundle);
    return locali;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    String[] arrayOfString;
    if (paramBundle == null)
    {
      arrayOfString = ((Bundle)cc.a(g(), "This fragment was instantiated without arguments, probably by calling the constructor directly.")).getStringArray("licenses");
      if (arrayOfString != null);
    }
    else
    {
      return;
    }
    b(b.a(this, arrayOfString), AnimationDirection.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
