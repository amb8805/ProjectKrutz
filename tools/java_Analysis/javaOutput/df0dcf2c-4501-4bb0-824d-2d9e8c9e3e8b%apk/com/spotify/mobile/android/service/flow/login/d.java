package com.spotify.mobile.android.service.flow.login;

import com.spotify.mobile.android.service.flow.a;
import com.spotify.mobile.android.util.SpotifyError;

public abstract class d extends a
{
  public d()
  {
  }

  public void a(e parame)
  {
  }

  protected void a(SpotifyError paramSpotifyError)
  {
  }

  public void a(boolean paramBoolean, String paramString)
  {
  }

  public final void b(int paramInt)
  {
    SpotifyError localSpotifyError = SpotifyError.a(paramInt);
    if (!SpotifyError.V.equals(localSpotifyError))
      a(localSpotifyError);
  }

  public boolean b_()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
