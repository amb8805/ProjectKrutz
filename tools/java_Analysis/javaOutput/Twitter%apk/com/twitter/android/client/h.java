package com.twitter.android.client;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import android.widget.RemoteViews;;
import ar;
import be;
import bl;
import com.twitter.android.HomeTabActivity;
import com.twitter.android.PostActivity;
import com.twitter.android.StartActivity;
import com.twitter.android.TweetActivity;
import com.twitter.android.WidgetSettingsActivity;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;
import com.twitter.android.service.j;
import cr;
import dl;
import do;
import dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h
  implements ar
{
  private static TextAppearanceSpan c;
  private static int d = 1;
  public final String a;
  public final long b;
  private final a[] e;
  private final f f;
  private final f g;
  private final Context h;
  private AtomicBoolean i;
  private final dz j;

  public h(Context paramContext, dz paramdz, String paramString, long paramLong)
  {
    this.h = paramContext;
    this.j = paramdz;
    this.a = paramString;
    this.b = paramLong;
    a[] arrayOfa = new a[2];
    arrayOfa[0] = new a(null);
    arrayOfa[1] = new a(null);
    this.e = arrayOfa;
    this.f = new f(2131034114, 2130903130, 2130903127, paramString);
    this.g = new f(2131034115, 2130903133, 2130903128, paramString);
    this.i = new AtomicBoolean(false);
  }

  private static long a(a parama)
  {
    if (!parama.isEmpty())
      return ((ax)parama.get(0)).h;
    return 0L;
  }

  private static Intent a(Context paramContext, String paramString, int paramInt)
  {
    String str;
    int k;
    if (paramInt == 0)
    {
      str = "home";
      k = 0;
      if (!TextUtils.isEmpty(paramString))
        break label81;
    }
    label81: for (Intent localIntent = new Intent(paramContext, StartActivity.class); ; localIntent = new Intent(paramContext, HomeTabActivity.class).putExtra("account_name", paramString).putExtra("tab", str).putExtra("home_item", k))
    {
      localIntent.setAction("android.intent.action.VIEW" + c()).setFlags(67108864).putExtra("ref_event", j.W);
      return localIntent;
      str = "connect";
      k = 1;
      break;
    }
  }

  private static RemoteViews a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4)
  {
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), paramInt2);
    if (paramInt1 == 2131034114)
      if (paramInt4 != 5)
        break label206;
    label206: for (int k = 2130837712; ; k = 2130837802)
    {
      localRemoteViews.setImageViewResource(2131165385, k);
      localRemoteViews.setTextViewText(2131165386, paramString);
      PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, a(paramContext, paramString, paramInt4), 268435456);
      localRemoteViews.setOnClickPendingIntent(2131165385, localPendingIntent);
      localRemoteViews.setOnClickPendingIntent(2131165386, localPendingIntent);
      switch (paramInt3)
      {
      default:
        localRemoteViews.setViewVisibility(2131165387, 0);
        Intent localIntent1 = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").setFlags(268435456);
        Intent localIntent2 = new Intent(paramContext, PostActivity.class).setAction("com.twitter.android.post.status").setFlags(335544320).putExtra("account_name", paramString).putExtra("ref_event", j.W).putExtra("android.intent.extra.INTENT", localIntent1);
        localRemoteViews.setOnClickPendingIntent(2131165388, PendingIntent.getActivity(paramContext, c(), localIntent2, 268435456));
        return localRemoteViews;
      case 0:
      case 1:
      case 2:
      }
    }
    localRemoteViews.setViewVisibility(2131165387, 8);
    return localRemoteViews;
    localRemoteViews.setViewVisibility(2131165387, 8);
    localRemoteViews.setTextViewText(2131165386, paramContext.getResources().getString(2131427698));
    return localRemoteViews;
  }

  private void a(long paramLong, a parama)
  {
    Iterator localIterator = parama.iterator();
    while (localIterator.hasNext())
      if (((ax)localIterator.next()).s == paramLong)
        b(true);
  }

  public static void a(Context paramContext, int paramInt)
  {
    paramContext.startService(new Intent(paramContext, WidgetService.class).setAction("clear_logged_out").putExtra("widget_provider", paramInt));
  }

  public static void a(Context paramContext, f paramf, int paramInt1, String paramString, int paramInt2)
  {
    int[] arrayOfInt3;
    if (paramInt1 == 1)
    {
      arrayOfInt3 = paramf.a();
      if ((arrayOfInt3 != null) && (arrayOfInt3.length != 0));
    }
    int[] arrayOfInt2;
    do
    {
      while (true)
      {
        return;
        String str = paramContext.getString(2131427520);
        int k = arrayOfInt3.length;
        for (int m = 0; m < k; m++)
        {
          int n = arrayOfInt3[m];
          RemoteViews localRemoteViews3 = a(paramContext, paramf.a, paramf.c, paramInt1, "", 0);
          a(localRemoteViews3, null, str);
          localRemoteViews3.setOnClickPendingIntent(2131165383, PendingIntent.getActivity(paramContext, 0, new Intent(paramContext, WidgetSettingsActivity.class).setAction("android.intent.action.VIEW" + c()).putExtra("appWidgetId", n), 67108864));
          AppWidgetManager.getInstance(paramContext).updateAppWidget(n, localRemoteViews3);
        }
      }
      if (paramInt1 != 0)
        break;
      arrayOfInt2 = paramf.a(paramContext);
    }
    while ((arrayOfInt2 == null) || (arrayOfInt2.length == 0));
    RemoteViews localRemoteViews2 = a(paramContext, paramf.a, paramf.c, paramInt1, "", 0);
    a(localRemoteViews2, paramContext.getString(2131427518), paramContext.getString(2131427519));
    Object localObject1 = localRemoteViews2;
    Object localObject2 = arrayOfInt2;
    while (true)
    {
      ((RemoteViews)localObject1).setOnClickPendingIntent(2131165383, PendingIntent.getActivity(paramContext, 0, a(paramContext, paramString, paramInt2), 67108864));
      AppWidgetManager.getInstance(paramContext).updateAppWidget((int[])localObject2, (RemoteViews)localObject1);
      return;
      int[] arrayOfInt1 = a(paramf, paramInt2);
      if ((arrayOfInt1 == null) || (arrayOfInt1.length == 0))
        break;
      RemoteViews localRemoteViews1 = a(paramContext, paramf.a, paramf.c, paramInt1, paramString, paramInt2);
      switch (paramInt1)
      {
      default:
        a(localRemoteViews1, null, paramContext.getString(2131427405));
        localObject1 = localRemoteViews1;
        localObject2 = arrayOfInt1;
        break;
      case 2:
        a(localRemoteViews1, null, null);
        localObject1 = localRemoteViews1;
        localObject2 = arrayOfInt1;
      }
    }
  }

  private void a(RemoteViews paramRemoteViews, ax paramax, Bitmap paramBitmap)
  {
    Resources localResources = this.h.getResources();
    if (c == null)
      c = new TextAppearanceSpan(null, 1, (int)(14.0F * localResources.getDisplayMetrics().density), ColorStateList.valueOf(localResources.getColor(2131361799)), null);
    String str1 = paramax.p;
    String str2 = paramax.d;
    long l = paramax.h;
    String str3 = paramax.i;
    String str4;
    SpannableStringBuilder localSpannableStringBuilder;
    be localbe;
    label179: int k;
    label205: int m;
    int n;
    String str6;
    if (paramax.j > 0L)
    {
      str4 = do.b(str2);
      localSpannableStringBuilder = new SpannableStringBuilder();
      if (str1 != null)
      {
        localSpannableStringBuilder.append(str1);
        localSpannableStringBuilder.setSpan(c, 0, str1.length(), 33);
      }
      if (str2 != null)
        localSpannableStringBuilder.append((char)' ').append(str2);
      if (paramax.x == null)
        break label318;
      localbe = g.a(this.h).a(paramax.B, paramax.s, paramax.x);
      if ((localbe == null) || (localbe.a == null))
        break label324;
      k = 0;
      Iterator localIterator = localbe.a.iterator();
      if (!localIterator.hasNext())
        break label324;
      dl localdl = (dl)localIterator.next();
      m = localdl.a - k;
      n = localdl.b - k;
      if ((m < 0) || (n > localSpannableStringBuilder.length()))
        break label594;
      str6 = localdl.e;
      if (TextUtils.isEmpty(str6))
        break label594;
      localSpannableStringBuilder.replace(m, n, str6);
    }
    label318: label324: label581: label594: for (int i1 = k + (n - (m + str6.length())); ; i1 = k)
    {
      k = i1;
      break label205;
      str4 = null;
      break;
      localbe = null;
      break label179;
      paramRemoteViews.setTextViewText(2131165230, localSpannableStringBuilder);
      String str5 = cr.a(localResources, l, false);
      if ((str3 != null) && (str4 != null))
      {
        paramRemoteViews.setTextViewText(2131165226, localResources.getString(2131427401, new Object[] { str5, str3, str4 }));
        if (paramBitmap == null)
          break label581;
        paramRemoteViews.setImageViewBitmap(2131165197, paramBitmap);
      }
      while (true)
      {
        Intent localIntent = new Intent(this.h, TweetActivity.class).setAction("android.intent.action.VIEW" + c()).setData(aa.a(paramax.s, this.b)).setFlags(67108864).putExtra("account_name", this.a).putExtra("ref_event", j.W);
        paramRemoteViews.setOnClickPendingIntent(2131165389, PendingIntent.getActivity(this.h, 0, localIntent, 268435456));
        return;
        if (str3 != null)
        {
          paramRemoteViews.setTextViewText(2131165226, localResources.getString(2131427400, new Object[] { str5, str3 }));
          break;
        }
        if (str4 != null)
        {
          paramRemoteViews.setTextViewText(2131165226, localResources.getString(2131427402, new Object[] { str5, str4 }));
          break;
        }
        paramRemoteViews.setTextViewText(2131165226, str5);
        break;
        paramRemoteViews.setImageViewResource(2131165197, 2130837734);
      }
    }
  }

  private static void a(RemoteViews paramRemoteViews, String paramString1, String paramString2)
  {
    int k;
    int m;
    if (!TextUtils.isEmpty(paramString1))
    {
      k = 1;
      if (TextUtils.isEmpty(paramString2))
        break label92;
      m = 1;
      label19: if (k == 0)
        break label98;
      paramRemoteViews.setTextViewText(2131165382, paramString1);
      paramRemoteViews.setViewVisibility(2131165382, 0);
      label39: if (m == 0)
        break label110;
      paramRemoteViews.setTextViewText(2131165290, paramString2);
      paramRemoteViews.setViewVisibility(2131165290, 0);
    }
    while (true)
    {
      if ((k == 0) && (m == 0))
        break label122;
      paramRemoteViews.setViewVisibility(2131165384, 0);
      paramRemoteViews.setViewVisibility(2131165269, 8);
      return;
      k = 0;
      break;
      label92: m = 0;
      break label19;
      label98: paramRemoteViews.setViewVisibility(2131165382, 8);
      break label39;
      label110: paramRemoteViews.setViewVisibility(2131165290, 8);
    }
    label122: paramRemoteViews.setViewVisibility(2131165384, 8);
    paramRemoteViews.setViewVisibility(2131165269, 0);
  }

  private void a(ax paramax, Bitmap paramBitmap, f paramf, int paramInt)
  {
    RemoteViews localRemoteViews2;
    label89: Resources localResources;
    SpannableStringBuilder localSpannableStringBuilder;
    be localbe;
    label189: int i3;
    label215: int i4;
    int i5;
    String str;
    if (paramf.a == 2131034114)
    {
      int[] arrayOfInt2 = a(paramf, paramInt);
      if ((arrayOfInt2 == null) || (arrayOfInt2.length == 0));
      while (true)
      {
        a(this.h, paramf, 1, "", paramInt);
        return;
        localRemoteViews2 = a(this.h, paramf.a, paramf.b, 4, this.a, paramInt);
        if (paramax != null)
          break;
        localRemoteViews2.setViewVisibility(2131165390, 4);
        localRemoteViews2.setViewVisibility(2131165391, 4);
        AppWidgetManager.getInstance(this.h).updateAppWidget(arrayOfInt2, localRemoteViews2);
      }
      localRemoteViews2.setViewVisibility(2131165390, 0);
      localRemoteViews2.setViewVisibility(2131165391, 0);
      localResources = this.h.getResources();
      localRemoteViews2.setTextViewText(2131165225, paramax.p);
      localSpannableStringBuilder = new SpannableStringBuilder(paramax.d);
      if (paramax.x != null)
      {
        localbe = g.a(this.h).a(paramax.B, paramax.s, paramax.x);
        if ((localbe == null) || (localbe.a == null))
          break label328;
        Iterator localIterator = localbe.a.iterator();
        i3 = 0;
        if (!localIterator.hasNext())
          break label328;
        dl localdl = (dl)localIterator.next();
        i4 = localdl.a - i3;
        i5 = localdl.b - i3;
        if ((i4 < 0) || (i5 > localSpannableStringBuilder.length()))
          break label1045;
        str = localdl.e;
        if (TextUtils.isEmpty(str))
          break label1045;
        localSpannableStringBuilder.replace(i4, i5, str);
      }
    }
    label394: label1045: for (int i6 = i3 + (i5 - (i4 + str.length())); ; i6 = i3)
    {
      i3 = i6;
      break label215;
      localbe = null;
      break label189;
      label328: localRemoteViews2.setTextViewText(2131165230, localSpannableStringBuilder);
      localRemoteViews2.setTextViewText(2131165214, cr.a(localResources, paramax.h, true));
      int k;
      label368: int m;
      int n;
      label425: label448: label592: int i1;
      a locala2;
      int i2;
      if (paramax.j > 0L)
      {
        k = 0;
        localRemoteViews2.setViewVisibility(2131165227, k);
        if ((localbe == null) || (!localbe.b()))
          break label661;
        m = 0;
        localRemoteViews2.setViewVisibility(2131165228, m);
        if ((paramax.v == 0.0D) || (paramax.w == 0.0D))
          break label668;
        n = 0;
        localRemoteViews2.setViewVisibility(2131165229, n);
        if (paramBitmap == null)
          break label675;
        localRemoteViews2.setImageViewBitmap(2131165197, paramBitmap);
        Intent localIntent2 = new Intent(this.h, TweetActivity.class).setAction("android.intent.action.VIEW" + c()).setData(aa.a(paramax.s, this.b)).setFlags(67108864).putExtra("account_name", this.a).putExtra("ref_event", j.W);
        localRemoteViews2.setOnClickPendingIntent(2131165389, PendingIntent.getActivity(this.h, 0, localIntent2, 268435456));
        if (!paramax.r)
          break label689;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramax.e;
        localRemoteViews2.setTextViewText(2131165232, localResources.getString(2131427385, arrayOfObject));
        localRemoteViews2.setViewVisibility(2131165232, 0);
        i1 = c();
        locala2 = e(paramInt);
        i2 = locala2.a;
        if (i2 != 0)
          break label702;
        localRemoteViews2.setImageViewResource(2131165390, 2130837738);
      }
      while (true)
      {
        if (i2 != locala2.size() - 1)
          break label773;
        localRemoteViews2.setImageViewResource(2131165391, 2130837731);
        break;
        k = 8;
        break label368;
        label661: m = 8;
        break label394;
        label668: n = 8;
        break label425;
        label675: localRemoteViews2.setImageViewResource(2131165197, 2130837734);
        break label448;
        label689: localRemoteViews2.setViewVisibility(2131165232, 8);
        break label592;
        label702: localRemoteViews2.setImageViewResource(2131165390, 2130837831);
        Intent localIntent3 = new Intent("com.twitter.android.widget.button.prev");
        localIntent3.putExtra("owner_id", this.b);
        localIntent3.putExtra("status_type", paramInt);
        localRemoteViews2.setOnClickPendingIntent(2131165390, PendingIntent.getBroadcast(this.h, i1, localIntent3, 268435456));
      }
      localRemoteViews2.setImageViewResource(2131165391, 2130837830);
      Intent localIntent4 = new Intent("com.twitter.android.widget.button.next");
      localIntent4.putExtra("owner_id", this.b);
      localIntent4.putExtra("status_type", paramInt);
      localRemoteViews2.setOnClickPendingIntent(2131165391, PendingIntent.getBroadcast(this.h, i1, localIntent4, 268435456));
      break label89;
      int[] arrayOfInt1 = a(paramf, paramInt);
      if ((arrayOfInt1 == null) || (arrayOfInt1.length == 0))
        break;
      RemoteViews localRemoteViews1 = new RemoteViews(this.h.getPackageName(), 2130903133);
      a locala1 = e(paramInt);
      if (locala1.size() > 0)
      {
        ax localax = (ax)locala1.get(0);
        a(localRemoteViews1, localax, paramBitmap);
        if (localax.n != this.b)
        {
          localRemoteViews1.setViewVisibility(2131165393, 0);
          Intent localIntent1 = new Intent(this.h, PostActivity.class).setAction("com.twitter.android.post.reply").setData(ContentUris.withAppendedId(az.b, localax.o)).setFlags(335544320).putExtra("account_name", this.a).putExtra("ref_event", j.W);
          localRemoteViews1.setOnClickPendingIntent(2131165393, PendingIntent.getActivity(this.h, 0, localIntent1, 268435456));
        }
      }
      while (true)
      {
        AppWidgetManager.getInstance(this.h).updateAppWidget(arrayOfInt1, localRemoteViews1);
        break;
        localRemoteViews1.setViewVisibility(2131165393, 4);
      }
    }
  }

  private void a(HashMap paramHashMap, int paramInt)
  {
    a locala = e(paramInt);
    int k = locala.a;
    if (k < locala.size())
    {
      ax localax2 = (ax)locala.get(k);
      bl localbl2 = (bl)paramHashMap.get(Long.valueOf(localax2.n));
      if (localbl2 != null)
        a(localax2, localbl2.a(), this.f, paramInt);
    }
    if (locala.size() > 0)
    {
      ax localax1 = (ax)locala.get(0);
      bl localbl1 = (bl)paramHashMap.get(Long.valueOf(localax1.n));
      if (localbl1 != null)
        a(localax1, localbl1.a(), this.g, paramInt);
    }
  }

  private static int[] a(f paramf, int paramInt)
  {
    if (paramInt == 5)
      return paramf.c();
    return paramf.b();
  }

  private void b(f paramf, int paramInt)
  {
    if (!this.i.get())
      return;
    a locala = e(paramInt);
    if (paramf.a == 2131034114);
    for (int k = locala.a; locala.size() == 0; k = 0)
    {
      a(this.h, paramf, 3, this.a, paramInt);
      return;
    }
    ax localax = (ax)locala.get(k);
    if (localax.k != null);
    for (Bitmap localBitmap = this.j.a(this.b, localax.n, localax.k); ; localBitmap = null)
    {
      a(localax, localBitmap, paramf, paramInt);
      return;
    }
  }

  private static int c()
  {
    try
    {
      int k = 1 + d;
      d = k;
      return k;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private a e(int paramInt)
  {
    if (paramInt == 5)
      return this.e[1];
    return this.e[0];
  }

  final void a()
  {
    Context localContext = this.h;
    this.f.a(localContext, this.f.a(localContext));
    this.g.a(localContext, this.g.a(localContext));
  }

  public final void a(int paramInt)
  {
    if (!this.i.get());
    a locala;
    int k;
    int m;
    do
    {
      return;
      locala = e(paramInt);
      k = locala.size();
      m = locala.a;
    }
    while ((k == 0) || (m >= k - 1));
    locala.a = (1 + locala.a);
    b(this.f, paramInt);
  }

  final void a(int paramInt, long paramLong, ArrayList paramArrayList)
  {
    if (!this.i.get())
      return;
    a locala = e(paramInt);
    if (paramLong == 0L)
      locala.clear();
    if (locala.size() == 0);
    int m;
    for (int k = 1; ; k = 0)
    {
      locala.addAll(0, paramArrayList);
      m = locala.size();
      if (m != 0)
        break;
      a(this.h, this.f, 3, this.a, paramInt);
      a(this.h, this.g, 3, this.a, paramInt);
      return;
    }
    while (m > 20)
    {
      locala.remove(20);
      m = locala.size();
    }
    int n = locala.a;
    int i1 = paramArrayList.size();
    if ((k != 0) || (n <= i1) || (n + i1 >= 20))
    {
      locala.a = 0;
      b(this.f, paramInt);
    }
    b(this.g, paramInt);
  }

  public final void a(long paramLong)
  {
    if (this.i.get())
    {
      a(paramLong, e(0));
      a(paramLong, e(5));
    }
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if ((this.i.get()) && (paramHashMap != null))
    {
      a(paramHashMap, 0);
      a(paramHashMap, 5);
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (!this.i.get())
      return;
    this.i.set(false);
    this.j.b(this);
    Context localContext = this.h;
    Intent localIntent = new Intent(this.h, WidgetService.class).setAction("close").putExtra("owner_id", this.b);
    if (paramBoolean);
    for (int k = 0; ; k = 1)
    {
      localContext.startService(localIntent.putExtra("widget_state", k));
      return;
    }
  }

  public final void b()
  {
    if (this.i.get())
      return;
    this.j.a(this);
    this.i.set(true);
    this.h.startService(new Intent(this.h, WidgetService.class).setAction("open").putExtra("owner_id", this.b));
  }

  public final void b(int paramInt)
  {
    if (!this.i.get());
    a locala;
    int k;
    int m;
    do
    {
      return;
      locala = e(paramInt);
      k = locala.size();
      m = locala.a;
    }
    while ((k == 0) || (m <= 0));
    locala.a -= 1;
    b(this.f, paramInt);
  }

  public final void b(boolean paramBoolean)
  {
    Context localContext;
    long l1;
    Intent localIntent2;
    if (this.i.get())
    {
      localContext = this.h;
      Intent localIntent1 = new Intent(this.h, WidgetService.class).setAction("refresh").putExtra("owner_id", this.b);
      if (!paramBoolean)
        break label86;
      l1 = 0L;
      localIntent2 = localIntent1.putExtra("latest_time_tweets", l1);
      if (!paramBoolean)
        break label100;
    }
    label86: label100: for (long l2 = 0L; ; l2 = a(this.e[1]))
    {
      localContext.startService(localIntent2.putExtra("latest_time_mentions", l2));
      return;
      l1 = a(this.e[0]);
      break;
    }
  }

  public final void c(int paramInt)
  {
    if (!this.i.get())
      return;
    if (paramInt == 2131034114);
    for (f localf = this.f; ; localf = this.g)
    {
      b(localf, 0);
      b(localf, 5);
      return;
    }
  }

  public final void d(int paramInt)
  {
    if (paramInt == 4)
      return;
    Context localContext = this.h;
    a(localContext, this.f, paramInt, this.a, 0);
    a(localContext, this.f, paramInt, this.a, 5);
    a(localContext, this.g, paramInt, this.a, 0);
    a(localContext, this.g, paramInt, this.a, 5);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
