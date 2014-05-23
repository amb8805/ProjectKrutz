package com.spotify.cosmos.android.router;

import android.app.Service;
import android.content.Context;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.MainLooperExecutor;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.RouterParams;
import com.spotify.cosmos.smash.Connection;
import com.spotify.cosmos.smash.Dispatcher;
import java.util.WeakHashMap;

public class Cosmos
{
  private static WeakHashMap<Context, CosmosTransport> sCosmosTransports = new WeakHashMap();
  private static Connection sInjectedConnection;
  private static Resolver sInjectedResolver;

  private Cosmos()
  {
  }

  @Deprecated
  public static void clearInjectedConnection()
  {
    sInjectedConnection = null;
  }

  public static void clearInjectedResolver()
  {
    sInjectedResolver = null;
  }

  @Deprecated
  public static Connection getConnection(Context paramContext, Class<? extends Service> paramClass)
  {
    return getConnection("Default", paramContext, paramClass);
  }

  @Deprecated
  public static Connection getConnection(String paramString, Context paramContext, Class<? extends Service> paramClass)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Cannot get connection with null context");
    if (paramClass == null)
      throw new IllegalArgumentException("Cannot get connection with null service");
    if (sInjectedConnection != null)
      return sInjectedConnection;
    if (sCosmosTransports.containsKey(paramContext))
    {
      localCosmosTransport = (CosmosTransport)sCosmosTransports.get(paramContext);
      if (localCosmosTransport.isConnected());
    }
    for (CosmosTransport localCosmosTransport = null; ; localCosmosTransport = null)
    {
      if (localCosmosTransport == null)
      {
        localCosmosTransport = new CosmosTransport(paramString, paramContext, paramClass);
        sCosmosTransports.put(paramContext, localCosmosTransport);
      }
      return new Connection(localCosmosTransport, new Dispatcher(localCosmosTransport.getTransportExecutor(), MainLooperExecutor.getInstance()));
    }
  }

  public static Resolver getResolver(RouterParams paramRouterParams, Context paramContext)
  {
    if (sInjectedResolver != null)
      return sInjectedResolver;
    return new DeferredResolver(paramRouterParams, paramContext);
  }

  public static Resolver getResolver(String paramString, Context paramContext)
  {
    if (sInjectedResolver != null)
      return sInjectedResolver;
    return new DeferredResolver(paramString, paramContext);
  }

  @Deprecated
  public static void injectConnection(Connection paramConnection)
  {
    sInjectedConnection = paramConnection;
  }

  public static void injectResolver(Resolver paramResolver)
  {
    sInjectedResolver = paramResolver;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.Cosmos
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
