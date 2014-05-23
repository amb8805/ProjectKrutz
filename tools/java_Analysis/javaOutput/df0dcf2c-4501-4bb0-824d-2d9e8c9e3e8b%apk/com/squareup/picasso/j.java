package com.squareup.picasso;

import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

final class j
{
  final l a = new l();
  final Context b;
  final ExecutorService c;
  final Downloader d;
  final Map<String, d> e;
  final Handler f;
  final Handler g;
  final e h;
  final ag i;
  final List<d> j;
  final m k;
  NetworkInfo l;
  boolean m;

  j(Context paramContext, ExecutorService paramExecutorService, Handler paramHandler, Downloader paramDownloader, e parame, ag paramag)
  {
    this.a.start();
    this.b = paramContext;
    this.c = paramExecutorService;
    this.e = new LinkedHashMap();
    this.f = new k(this.a.getLooper(), this);
    this.d = paramDownloader;
    this.g = paramHandler;
    this.h = parame;
    this.i = paramag;
    this.j = new ArrayList(4);
    this.m = an.d(this.b);
    this.k = new m(this, this.b);
    m localm = this.k;
    if (((localm.a.c instanceof ab)) && (an.a(localm.a.b, "android.permission.ACCESS_NETWORK_STATE")));
    for (int n = 1; ; n = 0)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.AIRPLANE_MODE");
      if (n != 0)
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localm.a.b.registerReceiver(localm, localIntentFilter);
      return;
    }
  }

  private void e(d paramd)
  {
    if (paramd.b());
    do
    {
      return;
      this.j.add(paramd);
    }
    while (this.f.hasMessages(7));
    this.f.sendEmptyMessageDelayed(7, 200L);
  }

  final void a(d paramd)
  {
    this.f.sendMessage(this.f.obtainMessage(6, paramd));
  }

  final void b(d paramd)
  {
    if (paramd.b())
      return;
    if (this.c.isShutdown())
    {
      d(paramd);
      return;
    }
    if (paramd.a(this.l))
    {
      paramd.j = this.c.submit(paramd);
      return;
    }
    d(paramd);
  }

  final void c(d paramd)
  {
    if (!paramd.h)
      this.h.a(paramd.e, paramd.i);
    this.e.remove(paramd.e);
    e(paramd);
  }

  final void d(d paramd)
  {
    this.e.remove(paramd.e);
    e(paramd);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
