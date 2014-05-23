package com.spotify.mobile.android.service.connections;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.MetadataManagerProxy;
import com.spotify.mobile.android.service.ServiceShutdownReceiver;
import com.spotify.mobile.android.service.l;
import com.spotify.mobile.android.service.m;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends a
{
  private final Object b = new Object();
  private List<WeakReference<e>> c = Collections.synchronizedList(new LinkedList());
  private l d;
  private ServiceShutdownReceiver e = new MetadataConnection.1(this);

  public d(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(e parame)
  {
    synchronized (this.b)
    {
      this.c.add(new WeakReference(parame));
      return;
    }
  }

  public final void b(e parame)
  {
    while (true)
    {
      synchronized (this.b)
      {
        Iterator localIterator = this.c.iterator();
        if (localIterator.hasNext())
        {
          localWeakReference = (WeakReference)localIterator.next();
          if (localWeakReference.get() != parame)
            continue;
          if (localWeakReference != null)
            this.c.remove(localWeakReference);
          return;
        }
      }
      WeakReference localWeakReference = null;
    }
  }

  public final boolean c()
  {
    return this.d != null;
  }

  public final void d()
  {
    MetadataManagerProxy.a(this.a, this);
  }

  public final void e()
  {
    this.a.unbindService(this);
    this.d = null;
  }

  public final void f()
  {
    LinkedList localLinkedList2;
    while (true)
    {
      WeakReference localWeakReference2;
      synchronized (this.b)
      {
        LinkedList localLinkedList1 = new LinkedList();
        localLinkedList1.addAll(this.c);
        localLinkedList2 = new LinkedList();
        Iterator localIterator1 = localLinkedList1.iterator();
        if (!localIterator1.hasNext())
          break;
        localWeakReference2 = (WeakReference)localIterator1.next();
        e locale = (e)localWeakReference2.get();
        if (locale != null)
          locale.a();
      }
    }
    Iterator localIterator2 = localLinkedList2.iterator();
    while (localIterator2.hasNext())
    {
      WeakReference localWeakReference1 = (WeakReference)localIterator2.next();
      this.c.remove(localWeakReference1);
    }
  }

  public final void g()
  {
    LinkedList localLinkedList2;
    while (true)
    {
      WeakReference localWeakReference2;
      synchronized (this.b)
      {
        LinkedList localLinkedList1 = new LinkedList();
        localLinkedList1.addAll(this.c);
        localLinkedList2 = new LinkedList();
        Iterator localIterator1 = localLinkedList1.iterator();
        if (!localIterator1.hasNext())
          break;
        localWeakReference2 = (WeakReference)localIterator1.next();
        e locale = (e)localWeakReference2.get();
        if (locale != null)
          locale.b();
      }
    }
    Iterator localIterator2 = localLinkedList2.iterator();
    while (localIterator2.hasNext())
    {
      WeakReference localWeakReference1 = (WeakReference)localIterator2.next();
      this.c.remove(localWeakReference1);
    }
  }

  public final l h()
  {
    return this.d;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.d = m.a(paramIBinder);
    new Thread(new d.1(this)).start();
    super.onServiceConnected(paramComponentName, paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.connections.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
