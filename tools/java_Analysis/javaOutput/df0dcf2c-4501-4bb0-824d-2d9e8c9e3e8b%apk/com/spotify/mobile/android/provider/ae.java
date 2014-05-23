package com.spotify.mobile.android.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.c.f;
import com.spotify.mobile.android.service.connections.d;
import com.spotify.mobile.android.service.connections.e;
import com.spotify.mobile.android.service.l;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.soft.SoftObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class ae extends AbstractCursor
{
  private Bundle a = new Bundle();
  private boolean b;
  private String c;
  private Context d;
  private d e;
  private int f;
  private ArrayList<String> g = new ArrayList();
  private ArrayList<String> h = new ArrayList();
  private String i;
  private String[] j;
  private Map<String, Integer> k;
  private int l;
  private boolean m;
  private final Object n = new Object();
  private ContentObserver o = new ah(this);
  private final Object p = new Object();
  private HandlerThread q;
  private Handler r;
  private f<Integer, af> s = new ae.1(this);
  private boolean t;
  private e u = new ae.2(this);

  public ae(Context paramContext, d paramd, Uri paramUri, String[] paramArrayOfString, Bundle paramBundle)
  {
    this.d = paramContext;
    this.f = paramBundle.getInt("limit", 0);
    this.g.clear();
    this.h.clear();
    this.g.add("order");
    this.h.add(paramBundle.getString("order"));
    this.g.add("reverse");
    this.h.add(String.valueOf(paramBundle.getBoolean("reverse")));
    if (paramUri.getQuery() != null)
    {
      LinkedList localLinkedList = new LinkedList();
      URLEncodedUtils.parse(localLinkedList, new Scanner(paramUri.getEncodedQuery()), "utf-8");
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
        this.g.add(localNameValuePair.getName());
        this.h.add(localNameValuePair.getValue());
      }
    }
    this.q = new HandlerThread("MetadataCursorDataFetcher");
    this.q.start();
    this.r = new ag(this.q.getLooper(), this);
    this.e = paramd;
    this.e.a(this.u);
    this.a.putBoolean("data_loaded", false);
    this.i = paramUri.getEncodedPath().substring(1);
    this.j = ((String[])paramArrayOfString.clone());
    l locall = b();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = paramUri.toString();
    bp.b("Notification uri: %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = this.i;
    bp.b("mPath: %s", arrayOfObject2);
    setNotificationUri(paramContext.getContentResolver(), paramUri);
    this.c = a(locall, this.i);
    this.m = false;
    paramContext.getContentResolver().registerContentObserver(paramUri, false, this.o);
    if (this.c != null)
    {
      bool = true;
      while (true)
      {
        this.b = bool;
        i1 = 1;
        label474: 
        do
          if (i1 == 0)
            break;
        while (a());
        this.l = -1;
        try
        {
          this.l = locall.a(this.i);
          label506: if (a())
            break label474;
          if (this.l < 0)
          {
            this.l = 0;
            return;
            bool = false;
            continue;
          }
          a(0);
          if (a())
            break label474;
          i1 = 0;
          break label474;
          this.a.putBoolean("data_loaded", true);
          return;
        }
        catch (Exception localException)
        {
          break label506;
        }
      }
    }
  }

  private String a(l paraml, String paramString)
  {
    String[] arrayOfString1 = new String[this.g.size()];
    String[] arrayOfString2 = new String[this.h.size()];
    try
    {
      String str = paraml.a(paramString, (String[])this.g.toArray(arrayOfString1), (String[])this.h.toArray(arrayOfString2));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  private void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 222	com/spotify/mobile/android/provider/ae:b	()Lcom/spotify/mobile/android/service/l;
    //   4: invokestatic 289	com/spotify/mobile/android/util/cc:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: checkcast 265	com/spotify/mobile/android/service/l
    //   10: astore 8
    //   12: aload_0
    //   13: getfield 213	com/spotify/mobile/android/provider/ae:i	Ljava/lang/String;
    //   16: astore 9
    //   18: aload_0
    //   19: getfield 219	com/spotify/mobile/android/provider/ae:j	[Ljava/lang/String;
    //   22: astore 10
    //   24: iload_1
    //   25: bipush 30
    //   27: imul
    //   28: istore 11
    //   30: aload_0
    //   31: getfield 96	com/spotify/mobile/android/provider/ae:f	I
    //   34: ifeq +68 -> 102
    //   37: aload_0
    //   38: getfield 96	com/spotify/mobile/android/provider/ae:f	I
    //   41: istore 12
    //   43: new 291	com/spotify/mobile/android/provider/af
    //   46: dup
    //   47: iload_1
    //   48: aload 8
    //   50: aload 9
    //   52: aload 10
    //   54: iload 11
    //   56: iload 12
    //   58: invokeinterface 294 5 0
    //   63: invokespecial 297	com/spotify/mobile/android/provider/af:<init>	(ILjava/lang/String;)V
    //   66: astore 13
    //   68: aload_0
    //   69: getfield 81	com/spotify/mobile/android/provider/ae:s	Landroid/support/v4/c/f;
    //   72: iload_1
    //   73: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aload 13
    //   78: invokevirtual 307	android/support/v4/c/f:a	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   81: pop
    //   82: aload_0
    //   83: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   86: astore 15
    //   88: aload 15
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   95: invokevirtual 310	java/lang/Object:notifyAll	()V
    //   98: aload 15
    //   100: monitorexit
    //   101: return
    //   102: bipush 30
    //   104: istore 12
    //   106: goto -63 -> 43
    //   109: astore 16
    //   111: aload 15
    //   113: monitorexit
    //   114: aload 16
    //   116: athrow
    //   117: astore 5
    //   119: aload_0
    //   120: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   123: astore 6
    //   125: aload 6
    //   127: monitorenter
    //   128: aload_0
    //   129: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   132: invokevirtual 310	java/lang/Object:notifyAll	()V
    //   135: aload 6
    //   137: monitorexit
    //   138: return
    //   139: astore 7
    //   141: aload 6
    //   143: monitorexit
    //   144: aload 7
    //   146: athrow
    //   147: astore_2
    //   148: aload_0
    //   149: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   152: astore_3
    //   153: aload_3
    //   154: monitorenter
    //   155: aload_0
    //   156: getfield 76	com/spotify/mobile/android/provider/ae:p	Ljava/lang/Object;
    //   159: invokevirtual 310	java/lang/Object:notifyAll	()V
    //   162: aload_3
    //   163: monitorexit
    //   164: aload_2
    //   165: athrow
    //   166: astore 4
    //   168: aload_3
    //   169: monitorexit
    //   170: aload 4
    //   172: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   91	101	109	finally
    //   0	24	117	android/os/RemoteException
    //   30	43	117	android/os/RemoteException
    //   43	82	117	android/os/RemoteException
    //   128	138	139	finally
    //   0	24	147	finally
    //   30	43	147	finally
    //   43	82	147	finally
    //   155	164	166	finally
  }

  private boolean a()
  {
    synchronized (this.n)
    {
      if (this.m)
      {
        this.m = false;
        return true;
      }
      return false;
    }
  }

  public static boolean a(Cursor paramCursor)
  {
    Bundle localBundle = paramCursor.getExtras();
    Assertion.a(localBundle.containsKey("data_loaded"), "Cursor doesn't contain load state. Is it a MetadataCursor?");
    return localBundle.getBoolean("data_loaded");
  }

  private l b()
  {
    cc.a("Not allowed to call getMetadata() from main loop, you naughty boy!");
    int i1 = 0;
    l locall = null;
    while (true)
      if ((locall == null) && (i1 < 3))
        try
        {
          if (!this.e.c())
            this.e.a(true);
          locall = this.e.h();
          i1++;
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
            bp.b(localInterruptedException, "Interrupted while trying to connect to SpotifyService");
        }
    if (locall == null)
      throw new RuntimeException("Failed to connect to SpotifyService");
    return locall;
  }

  private void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.j.length))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = Integer.valueOf(this.j.length);
      throw new CursorIndexOutOfBoundsException(String.format("Requested column: %d, # of columns: %d", arrayOfObject));
    }
  }

  private SoftObject c()
  {
    if (this.mPos < 0)
      throw new CursorIndexOutOfBoundsException("Before first row.");
    if (this.mPos >= getCount())
      throw new CursorIndexOutOfBoundsException("After last row.");
    af localaf = (af)this.s.a(Integer.valueOf(this.mPos / 30));
    SoftObject localSoftObject;
    if (localaf == null)
      localSoftObject = null;
    do
    {
      return localSoftObject;
      localSoftObject = localaf.a(this.mPos % 30);
    }
    while (localSoftObject != null);
    return null;
  }

  public final void close()
  {
    l locall = this.e.h();
    this.e.b(this.u);
    if ((!this.b) || (locall != null))
      try
      {
        locall.a(this.i, this.c);
        while (true)
        {
          label44: if (this.q != null)
            this.q.quit();
          try
          {
            this.q.join();
            this.q = null;
            super.close();
            this.d.getContentResolver().unregisterContentObserver(this.o);
            this.s.a();
            return;
            bp.d("Leaked metadata: %s", new Object[] { this });
          }
          catch (InterruptedException localInterruptedException)
          {
            break label71;
          }
        }
      }
      catch (Exception localException)
      {
        break label44;
      }
  }

  public final int getColumnIndex(String paramString)
  {
    if (this.k == null)
    {
      this.k = new HashMap(this.j.length);
      int i1 = 0;
      int i2 = this.j.length;
      while (i1 < i2)
      {
        this.k.put(this.j[i1], Integer.valueOf(i1));
        i1++;
      }
    }
    Integer localInteger = (Integer)this.k.get(paramString);
    if (localInteger != null)
      return localInteger.intValue();
    return -1;
  }

  public final String[] getColumnNames()
  {
    return this.j;
  }

  public final int getCount()
  {
    if (this.f != 0)
      return Math.min(this.l, this.f);
    return this.l;
  }

  public final double getDouble(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return 0.0D;
    return localSoftObject.c(paramInt);
  }

  public final Bundle getExtras()
  {
    return this.a;
  }

  public final float getFloat(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return 0.0F;
    return (float)localSoftObject.c(paramInt);
  }

  public final int getInt(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return 0;
    return (int)localSoftObject.b(paramInt);
  }

  public final long getLong(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return 0L;
    return localSoftObject.b(paramInt);
  }

  public final short getShort(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return 0;
    return (short)(int)localSoftObject.b(paramInt);
  }

  public final String getString(int paramInt)
  {
    b(paramInt);
    SoftObject localSoftObject = c();
    if (localSoftObject == null)
      return null;
    return localSoftObject.d(paramInt);
  }

  public final boolean isNull(int paramInt)
  {
    return (c() == null) || (c().a(paramInt) == 64);
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    while (true)
    {
      int i1;
      synchronized (this.p)
      {
        i1 = paramInt2 / 30;
        Assertion.a(this.s, "mRangeCache in MetadataCursor is suddenly null, how?");
        if (this.s.a(Integer.valueOf(i1)) == null)
        {
          this.r.sendEmptyMessage(i1);
          try
          {
            if (!this.t)
              this.p.wait(1337L);
            if (this.s.a(Integer.valueOf(i1)) == null)
            {
              this.t = true;
              return super.onMove(paramInt1, paramInt2);
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            return false;
          }
        }
      }
      this.t = false;
    }
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    synchronized (this.n)
    {
      super.registerContentObserver(paramContentObserver);
      if (this.m)
        paramContentObserver.dispatchChange(false);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
