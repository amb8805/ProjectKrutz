package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.plus.b;

public final class bc extends cr
{
  public final void a(b paramb, int paramInt)
  {
    b();
    new Bundle().putInt("bounding_box", paramInt);
    bd localbd = new bd(this, paramb);
    try
    {
      c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localbd.a(8, null, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
