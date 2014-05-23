package com.spotify.cosmos.android.router;

import android.os.IInterface;
import com.spotify.cosmos.android.router.internal.DestroyCallbackReceiver;
import com.spotify.cosmos.android.router.internal.ResolveCallbackReceiver;
import java.util.Map;

public abstract interface IRemoteRouter extends IInterface
{
  public abstract void registerDestroyCallback(DestroyCallbackReceiver paramDestroyCallbackReceiver);

  public abstract int resolve(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver);

  public abstract int subscribe(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver);

  public abstract void unsubscribe(int paramInt);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.IRemoteRouter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
