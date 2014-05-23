package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.e;

public final class ae
{
  private static Context a;
  private static a b;

  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    a locala = a(paramContext);
    try
    {
      ac localac = locala.a(ai.a(paramContext), paramInt1, paramInt2);
      return (View)ai.a(localac);
    }
    catch (Exception localException)
    {
    }
    throw new ae.a("Could not get button with size " + paramInt1 + " and color " + paramInt2);
  }

  private static a a(Context paramContext)
  {
    f.a(paramContext);
    ClassLoader localClassLoader;
    if (b == null)
    {
      if (a == null)
      {
        Context localContext = e.b(paramContext);
        a = localContext;
        if (localContext == null)
          throw new ae.a("Could not get remote context.");
      }
      localClassLoader = a.getClassLoader();
    }
    try
    {
      b = b.a((IBinder)localClassLoader.loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
      return b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new ae.a("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new ae.a("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new ae.a("Could not access creator.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
