package com.spotify.cosmos.android.router.internal;

import android.os.IInterface;
import java.util.Map;

public abstract interface IResolveCallbackReceiver extends IInterface
{
  public abstract void onError(String paramString);

  public abstract void onResolved(int paramInt, String paramString, Map paramMap, byte[] paramArrayOfByte);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.internal.IResolveCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
