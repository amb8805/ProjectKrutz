package com.spotify.mobile.android.service.managers;

import android.content.ContentResolver;
import com.spotify.mobile.android.orbit.OrbitProviderInterface;
import com.spotify.mobile.android.orbit.OrbitProviderObserver;
import com.spotify.mobile.android.service.ServiceShutdownReceiver;
import com.spotify.mobile.android.service.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b extends m
{
  private OrbitProviderInterface a;
  private ContentResolver b;
  private boolean c;
  private List<ServiceShutdownReceiver> d = new LinkedList();
  private OrbitProviderObserver e = new b.1(this);

  public b(OrbitProviderInterface paramOrbitProviderInterface, ContentResolver paramContentResolver)
  {
    this.b = paramContentResolver;
    this.a = paramOrbitProviderInterface;
    this.a.setObserver(this.e);
  }

  public final int a(String paramString)
  {
    return this.a.numberOfRows(paramString);
  }

  public final String a(String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    return this.a.query(paramString, paramArrayOfString, paramInt1, paramInt2);
  }

  public final String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    return this.a.acquirePath(paramString, paramArrayOfString1, paramArrayOfString2);
  }

  public final void a()
  {
    this.c = true;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((ServiceShutdownReceiver)localIterator.next()).a();
  }

  public final void a(ServiceShutdownReceiver paramServiceShutdownReceiver)
  {
    this.d.add(paramServiceShutdownReceiver);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.releasePath(paramString1, paramString2);
  }

  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4)
  {
    this.a.update(paramString, paramArrayOfString1, paramArrayOfString2, paramArrayOfString3, paramArrayOfString4);
  }

  public final void b(String paramString)
  {
    this.a.remove(paramString);
  }

  public final void b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.a.insert(paramString, paramArrayOfString1, paramArrayOfString2);
  }

  // ERROR //
  public final android.os.ParcelFileDescriptor c(String paramString)
  {
    // Byte code:
    //   0: invokestatic 108	android/os/ParcelFileDescriptor:createPipe	()[Landroid/os/ParcelFileDescriptor;
    //   3: astore_3
    //   4: aload_3
    //   5: iconst_0
    //   6: aaload
    //   7: astore 4
    //   9: aload_3
    //   10: iconst_1
    //   11: aaload
    //   12: astore 5
    //   14: aload_0
    //   15: getfield 36	com/spotify/mobile/android/service/managers/b:a	Lcom/spotify/mobile/android/orbit/OrbitProviderInterface;
    //   18: aload_1
    //   19: aload 5
    //   21: invokevirtual 112	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   24: invokeinterface 116 3 0
    //   29: ifne +15 -> 44
    //   32: aload 4
    //   34: invokevirtual 119	android/os/ParcelFileDescriptor:close	()V
    //   37: aload 5
    //   39: invokevirtual 119	android/os/ParcelFileDescriptor:close	()V
    //   42: aconst_null
    //   43: areturn
    //   44: aload 5
    //   46: invokevirtual 119	android/os/ParcelFileDescriptor:close	()V
    //   49: aload 4
    //   51: areturn
    //   52: astore_2
    //   53: aconst_null
    //   54: areturn
    //   55: astore 7
    //   57: goto -20 -> 37
    //   60: astore 8
    //   62: aconst_null
    //   63: areturn
    //   64: astore 6
    //   66: goto -17 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   0	4	52	java/io/IOException
    //   32	37	55	java/io/IOException
    //   37	42	60	java/io/IOException
    //   44	49	64	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.managers.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
