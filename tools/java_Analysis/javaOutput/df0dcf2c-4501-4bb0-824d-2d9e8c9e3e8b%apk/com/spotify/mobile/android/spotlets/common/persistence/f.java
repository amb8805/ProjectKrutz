package com.spotify.mobile.android.spotlets.common.persistence;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.common.base.i;
import com.spotify.mobile.android.spotlets.common.persistence.json.JsonBundleHelper;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.cc;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class f
  implements a
{
  private final ExecutorService a;
  private final Handler b;
  private final String c;
  private boolean d;
  private final e e;
  private File f;

  f(e parame, String paramString)
  {
    cc.b();
    this.a = Executors.newSingleThreadExecutor();
    this.c = a(paramString).intern();
    this.e = ((e)i.a(parame));
    this.b = new Handler();
    if (!c())
      parame.a(new f.1(this));
    parame.a(new f.2(this));
  }

  private static String a(String paramString)
  {
    int i = 0;
    boolean bool;
    if (!TextUtils.isEmpty(paramString))
    {
      bool = true;
      i.a(bool, "empty feature name");
    }
    while (true)
    {
      if (i >= paramString.length())
        break label128;
      char c1 = paramString.charAt(i);
      if (((c1 < 'a') || (c1 > 'z')) && ((c1 < 'A') || (c1 > 'Z')) && (c1 != '-') && (c1 != '_') && ((c1 < '0') || (c1 > '9')))
      {
        throw new IllegalArgumentException("Illegal character '" + c1 + "' in feature name '" + paramString + "'");
        bool = false;
        break;
      }
      i++;
    }
    label128: return paramString;
  }

  private void a(Runnable paramRunnable)
  {
    cc.b();
    f.5 local5 = new f.5(this, paramRunnable);
    if (!c())
    {
      this.e.a(new f.6(this, local5));
      return;
    }
    local5.run();
  }

  private File b()
  {
    if (this.f.exists())
      if ((!this.f.isDirectory()) && (!new File(this.f.getCanonicalPath()).isDirectory()))
        Assertion.a("features storage is not a directory!");
    while (!this.f.isDirectory())
    {
      throw new IOException("Features storage is not a directory!");
      if (!this.f.mkdirs())
        Assertion.a("could not create features storage folder");
    }
    return new File(this.f, this.c);
  }

  private boolean c()
  {
    bool1 = true;
    try
    {
      boolean bool2 = this.d;
      if (bool2);
      while (true)
      {
        return bool1;
        if (!this.e.n_())
        {
          bool1 = false;
        }
        else
        {
          File localFile = this.e.i().getFilesDir();
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(this.e.b().hashCode());
          this.f = new File(localFile, String.format("features/user-%d", arrayOfObject));
          this.d = true;
        }
      }
    }
    finally
    {
    }
  }

  final Bundle a()
  {
    Bundle localBundle;
    synchronized (this.c)
    {
      if (b().exists())
      {
        localBundle = JsonBundleHelper.a(b());
        break label48;
        return localBundle;
        label32: localBundle = new Bundle();
      }
    }
    while (true)
    {
      label48: if (localBundle == null)
        break label32;
      break;
      localBundle = null;
    }
  }

  final void a(Bundle paramBundle)
  {
    synchronized (this.c)
    {
      JsonBundleHelper.a(b(), paramBundle);
      return;
    }
  }

  public final void a(Bundle paramBundle, c paramc)
  {
    a(new f.3(this, paramBundle, (c)i.a(paramc, "listener must not be null")));
  }

  public final <T extends Fragment,  extends b> void a(T paramT)
  {
    b localb = (b)paramT;
    Fragment localFragment = (Fragment)i.a(paramT);
    i.a(localb, "listener must not be null");
    a(new f.4(this, localb, localFragment));
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof f)) && (this.c.equals(((f)paramObject).c)) && (this.e.b().equals(((f)paramObject).e.b()));
  }

  public final int hashCode()
  {
    int i = this.c.hashCode();
    char[] arrayOfChar = this.e.b().toCharArray();
    int j = arrayOfChar.length;
    for (int k = 0; k < j; k++)
      i = arrayOfChar[k] + i * 31;
    return i;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
