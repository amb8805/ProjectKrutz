package com.spotify.mobile.android.util;

import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.c;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class z
{
  private static final cy a = cy.a("device_activation_ident");
  private static final cy b = cy.a("device_activation_timestamp");
  private static final cy c = cy.a("connect_logged_in_devices");
  private static final cy d = cy.a("connnect_onboarding_visualization_timestamp");

  public static c a(cw paramcw)
  {
    try
    {
      cc.a(paramcw);
      String str = paramcw.a(a, null);
      long l = paramcw.a(b, -1L);
      c localc = null;
      if (str != null)
      {
        boolean bool = l < -1L;
        localc = null;
        if (bool)
          break label58;
      }
      while (true)
      {
        return localc;
        localc = new c(str, l);
      }
    }
    finally
    {
    }
  }

  public static ArrayList<ConnectDevice> a(cw paramcw, List<ConnectDevice> paramList)
  {
    ArrayList localArrayList;
    try
    {
      cc.a(paramcw);
      cc.a(paramList);
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ConnectDevice localConnectDevice = (ConnectDevice)localIterator.next();
        if (!b(paramcw, localConnectDevice))
          localArrayList.add(localConnectDevice);
      }
    }
    finally
    {
    }
    return localArrayList;
  }

  public static ArrayList<ConnectDevice> a(List<ConnectDevice> paramList)
  {
    ArrayList localArrayList;
    try
    {
      cc.a(paramList);
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ConnectDevice localConnectDevice = (ConnectDevice)localIterator.next();
        if (localConnectDevice.h())
          localArrayList.add(localConnectDevice);
      }
    }
    finally
    {
    }
    return localArrayList;
  }

  private static LinkedHashSet<String> a(JSONArray paramJSONArray)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(paramJSONArray.length());
    int i = 0;
    try
    {
      while (i < paramJSONArray.length())
      {
        localLinkedHashSet.add(paramJSONArray.getString(i));
        i++;
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return localLinkedHashSet;
  }

  private static JSONArray a(Set<String> paramSet)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
      localJSONArray.put(localIterator.next());
    return localJSONArray;
  }

  public static void a()
  {
  }

  public static void a(cw paramcw, ConnectDevice paramConnectDevice)
  {
    try
    {
      cc.a(paramcw);
      cc.a(paramConnectDevice);
      try
      {
        JSONArray localJSONArray3 = paramcw.a(c, new JSONArray());
        localJSONArray1 = localJSONArray3;
        LinkedHashSet localLinkedHashSet = a(localJSONArray1);
        localLinkedHashSet.add(paramConnectDevice.a());
        a(localLinkedHashSet);
        JSONArray localJSONArray2 = a(localLinkedHashSet);
        paramcw.a().a(c, localJSONArray2).a();
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          JSONArray localJSONArray1 = new JSONArray();
      }
    }
    finally
    {
    }
  }

  public static void a(cw paramcw, c paramc)
  {
    try
    {
      cc.a(paramcw);
      cc.a(paramc);
      paramcw.a().a(a, paramc.a()).a(b, paramc.b()).a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void a(LinkedHashSet<String> paramLinkedHashSet)
  {
    Iterator localIterator = paramLinkedHashSet.iterator();
    while ((paramLinkedHashSet.size() > 40) && (localIterator.hasNext()))
    {
      localIterator.next();
      localIterator.remove();
    }
  }

  public static long b(cw paramcw)
  {
    try
    {
      cc.a(paramcw);
      long l = System.currentTimeMillis();
      paramcw.a().a(d, l).a();
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private static boolean b(cw paramcw, ConnectDevice paramConnectDevice)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 38	com/spotify/mobile/android/util/cc:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: pop
    //   8: aload_1
    //   9: invokestatic 38	com/spotify/mobile/android/util/cc:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: pop
    //   13: aload_0
    //   14: getstatic 28	com/spotify/mobile/android/util/z:c	Lcom/spotify/mobile/android/util/cy;
    //   17: new 95	org/json/JSONArray
    //   20: dup
    //   21: invokespecial 109	org/json/JSONArray:<init>	()V
    //   24: invokevirtual 120	com/spotify/mobile/android/util/cw:a	(Lcom/spotify/mobile/android/util/cy;Lorg/json/JSONArray;)Lorg/json/JSONArray;
    //   27: astore 7
    //   29: iconst_0
    //   30: istore 8
    //   32: aload 7
    //   34: invokevirtual 99	org/json/JSONArray:length	()I
    //   37: istore 9
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 8
    //   44: iload 9
    //   46: if_icmpge +27 -> 73
    //   49: aload_1
    //   50: invokevirtual 125	com/spotify/mobile/android/service/ConnectDevice:a	()Ljava/lang/String;
    //   53: aload 7
    //   55: iload 8
    //   57: invokevirtual 168	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   60: invokevirtual 173	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   63: istore 10
    //   65: iload 10
    //   67: ifeq +12 -> 79
    //   70: iconst_1
    //   71: istore 6
    //   73: ldc 2
    //   75: monitorexit
    //   76: iload 6
    //   78: ireturn
    //   79: iinc 8 1
    //   82: goto -50 -> 32
    //   85: astore_2
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_2
    //   90: athrow
    //   91: astore 5
    //   93: iconst_0
    //   94: istore 6
    //   96: goto -23 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   3	13	85	finally
    //   13	29	85	finally
    //   32	39	85	finally
    //   49	65	85	finally
    //   13	29	91	org/json/JSONException
    //   32	39	91	org/json/JSONException
    //   49	65	91	org/json/JSONException
  }

  public static boolean c(cw paramcw)
  {
    try
    {
      int i = ((Integer)FeatureFragment.ab.e()).intValue();
      boolean bool;
      if (i <= 0)
        bool = false;
      while (true)
      {
        return bool;
        long l1 = f(paramcw);
        long l2 = System.currentTimeMillis();
        if (l2 - l1 > 86400000L * i)
          bool = true;
        else
          bool = false;
      }
    }
    finally
    {
    }
  }

  public static void d(cw paramcw)
  {
    try
    {
      paramcw.a().a(c).a();
      bp.b("Connect devices logins have been reset", new Object[0]);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void e(cw paramcw)
  {
    try
    {
      paramcw.a().a(d).a();
      bp.b("Connect onboarding popup expiration has been reset", new Object[0]);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static long f(cw paramcw)
  {
    try
    {
      cc.a(paramcw);
      long l = paramcw.a(d, 0L);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
