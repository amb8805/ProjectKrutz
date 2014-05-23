package com.spotify.mobile.android.ui.fragments.logic;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.bp;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class m extends Fragment
{
  private static final LinkedHashSet<n> a = new LinkedHashSet();
  private static boolean b;
  private static boolean c;
  private static boolean d;
  private static boolean e;
  private static Date f;
  private static boolean g;
  private static boolean h;
  private boolean Y;
  private o<Cursor> Z = new m.1(this);
  private o<Cursor> aa = new m.2(this);
  private Runnable ab = new m.3(this);
  private Handler i;

  public m()
  {
  }

  private static void C()
  {
    boolean bool1;
    boolean bool2;
    if ((b) && ((!c) || ((d) && (!e))))
    {
      bool1 = true;
      if ((f == null) || (d))
        break label208;
      long l = f.getTime() - System.currentTimeMillis();
      if ((!b) || (!c) || (l >= 172800000L))
        break label202;
      bool2 = true;
    }
    while (true)
    {
      label73: if ((bool1 != g) || (bool2 != h))
      {
        Object[] arrayOfObject = new Object[7];
        arrayOfObject[0] = Boolean.valueOf(bool1);
        arrayOfObject[1] = Boolean.valueOf(bool2);
        arrayOfObject[2] = Boolean.valueOf(b);
        arrayOfObject[3] = Boolean.valueOf(c);
        arrayOfObject[4] = Boolean.valueOf(d);
        arrayOfObject[5] = Boolean.valueOf(e);
        arrayOfObject[6] = f;
        bp.a("show premium upsell? %s, show refill upsell? %s (logged in: %s, premium: %s, trial: %s, hide trial: %s, product-expiry: %s)", arrayOfObject);
        g = bool1;
        h = bool2;
        Iterator localIterator = a.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            ((n)localIterator.next()).F();
            continue;
            bool1 = false;
            break;
            label202: bool2 = false;
            break label73;
          }
      }
      return;
      label208: bool2 = false;
    }
  }

  public static void a(n paramn)
  {
    a.add(paramn);
  }

  public static void b(n paramn)
  {
    a.remove(paramn);
  }

  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
    default:
    case 2:
      do
        return false;
      while ((!g) && (!h));
      return true;
    case 3:
    }
    return g;
  }

  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    do
      return 2131690370;
    while (!h);
    return 2131690371;
  }

  public static String d(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    while ((g) && (d) && (!e))
    {
      return "trial";
      if (h)
        return "refill";
    }
    if ((g) && (!c))
      return "not-premium";
    return null;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (((ClientInfo)c.a(ClientInfo.class)).d())
    {
      android.support.v4.app.n localn = t();
      localn.a(2131362148, null, this.Z);
      localn.a(2131362147, null, this.aa);
      this.Y = true;
    }
  }

  public final void y()
  {
    super.y();
    if (this.Y)
    {
      android.support.v4.app.n localn = t();
      localn.a(2131362148);
      localn.a(2131362147);
      this.Y = false;
    }
    if (this.i != null)
      this.i.removeCallbacks(this.ab);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
