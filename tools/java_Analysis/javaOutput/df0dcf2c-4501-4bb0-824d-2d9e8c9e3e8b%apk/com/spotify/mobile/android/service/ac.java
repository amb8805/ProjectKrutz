package com.spotify.mobile.android.service;

import android.os.Handler;

final class ac extends p
{
  private ac(ServiceShutdownReceiver paramServiceShutdownReceiver)
  {
  }

  public final void a()
  {
    if (ServiceShutdownReceiver.a(this.a) != null)
    {
      ServiceShutdownReceiver.a(this.a).post(new ab(this.a, (byte)0));
      return;
    }
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
