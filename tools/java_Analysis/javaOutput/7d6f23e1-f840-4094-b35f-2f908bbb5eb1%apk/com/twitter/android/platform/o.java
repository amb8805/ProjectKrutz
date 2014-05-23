package com.twitter.android.platform;

import aa;
import ac;
import ad;
import ae;
import ai;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import bq;
import cl;
import com.twitter.android.client.AppService;
import com.twitter.android.provider.ak;
import cq;
import do;
import ef;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.json.JSONException;
import p;

public final class o extends AbstractThreadedSyncAdapter
{
  private static final boolean a = Log.isLoggable("TwitterDataSync", 3);

  public o(Context paramContext)
  {
    super(paramContext, true);
  }

  private static Bundle a(Context paramContext, HttpClient paramHttpClient, ac paramac, ad paramad, SyncResult paramSyncResult)
  {
    ai localai = ai.a(paramContext);
    StringBuilder localStringBuilder = ai.a(localai.a, new Object[] { "i", "discovery" }).append(".json");
    Location localLocation = f.b((LocationManager)paramContext.getSystemService("location"));
    ak localak = ak.a(paramContext, paramad.a);
    if (localLocation != null)
    {
      double d1 = localLocation.getLatitude();
      double d2 = localLocation.getLongitude();
      if ((localLocation.getLatitude() != 0.0D) && (localLocation.getLongitude() != 0.0D))
      {
        ai.a(localStringBuilder, "lat", Double.toString(d1));
        ai.a(localStringBuilder, "long", Double.toString(d2));
      }
    }
    Locale localLocale = paramContext.getResources().getConfiguration().locale;
    if (localLocale != null)
    {
      String str2 = localLocale.getLanguage();
      if (!TextUtils.isEmpty(str2))
        ai.a(localStringBuilder, "lang", str2);
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      cl localcl = new cl(paramac);
      n localn = n.a(localai, paramHttpClient, localStringBuilder, localcl, true, localByteArrayOutputStream).a();
      if (localn.c == 200)
      {
        bq localbq = do.a.a(localByteArrayOutputStream.toByteArray());
        localbq.g();
        int i = localak.a(do.u(localbq), paramad.a, 3);
        if (i <= 0)
          break label425;
        localq = com.twitter.android.provider.q.a(paramContext);
        str1 = paramad.g;
        if (i > 0)
        {
          j = 1;
          localq.a(str1, "discover", j);
          localBundle = new Bundle();
          localBundle.putInt("unread", i);
          localBundle.putLong("owner_id", paramad.a);
          return localBundle;
        }
      }
      else if (localn.c == 401)
      {
        localSyncStats4 = paramSyncResult.stats;
        localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
      }
      else
      {
        localSyncStats3 = paramSyncResult.stats;
        localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
      }
    }
    catch (aa localaa)
    {
      localSyncStats2 = paramSyncResult.stats;
      localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
    }
    catch (IOException localIOException)
    {
      localSyncStats1 = paramSyncResult.stats;
      localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
    }
    while (true)
    {
      com.twitter.android.provider.q localq;
      String str1;
      Bundle localBundle;
      SyncStats localSyncStats4;
      SyncStats localSyncStats3;
      SyncStats localSyncStats2;
      SyncStats localSyncStats1;
      int j = 0;
    }
    label425: return null;
  }

  private static Bundle a(Context paramContext, HttpClient paramHttpClient, Account paramAccount, ac paramac, ad paramad, int paramInt, SyncResult paramSyncResult)
  {
    if (a)
      Log.d("TwitterDataSync", "=====> Sync statuses of type: " + 0);
    long l1 = paramad.a;
    ak localak = ak.a(paramContext, l1);
    long l2;
    int i;
    if (localak.a(3, 0, l1, 1) != null)
    {
      l2 = localak.b(l1, 0);
      i = 100;
      if (a)
        Log.d("TwitterDataSync", "syncStatuses newer than sinceId: " + l2);
      ai localai = ai.a(paramContext);
      StringBuilder localStringBuilder = localai.a(new Object[] { "statuses", "home_timeline" }).append(".json");
      ai.a(localStringBuilder, "include_entities", true);
      if (i > 0)
        ai.a(localStringBuilder, "count", 100);
      if (l2 > 0L)
        ai.a(localStringBuilder, "since_id", l2);
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        cl localcl = new cl(paramac);
        localn = n.a(localai, paramHttpClient, localStringBuilder, localcl, true, localByteArrayOutputStream).a();
        if (localn.c == 200)
        {
          bq localbq = do.a.a(localByteArrayOutputStream.toByteArray());
          localbq.g();
          localArrayList = do.c(localbq);
          if ((l2 != 0L) || (localArrayList.size() <= 0))
            break label723;
          str3 = Long.toString(((p)localArrayList.get(localArrayList.size() - 1)).a);
          str1 = str3;
          try
          {
            k.a(paramContext, paramAccount.name, localArrayList);
            j = localak.a(localArrayList, l1, 0, -1L, false, false, str1, true);
            if (localArrayList.size() >= 100)
              localak.a(l1, 0, -1L, ((p)localArrayList.get(localArrayList.size() - 1)).a);
            k = localak.d(l1, 0);
            localq = com.twitter.android.provider.q.a(paramContext);
            str2 = paramAccount.name;
            if (k > 0)
            {
              m = 1;
              localq.a(str2, "tweet", m);
              if (a)
                Log.d("TwitterDataSync", "====> Sync statuses of type " + 0 + ", got " + j);
              if (j > 0)
              {
                localp = (p)localArrayList.get(0);
                localBundle = new Bundle();
                localBundle.putInt("new", j);
                localBundle.putInt("unread", k);
                localBundle.putString("sample", localp.h);
                localBundle.putLong("status_id", localp.a);
                localBundle.putLong("owner_id", l1);
                if (localp.m == null)
                  break label711;
                localBundle.putLong("sender_id", localp.m.a);
                localBundle.putString("sender", localp.m.g);
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
              Log.w("TwitterDataSync", "Exception: " + localException);
          }
        }
      }
      catch (aa localaa)
      {
        n localn;
        ArrayList localArrayList;
        localSyncStats2 = paramSyncResult.stats;
        localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
        while (true)
        {
          return null;
          m = 0;
          break;
          if (localn.c != 401)
            break label689;
          localSyncStats4 = paramSyncResult.stats;
          localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          localSyncStats1 = paramSyncResult.stats;
          localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
          continue;
          localSyncStats3 = paramSyncResult.stats;
          localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
        }
      }
    }
    while (true)
    {
      String str3;
      int j;
      int k;
      com.twitter.android.provider.q localq;
      String str2;
      int m;
      p localp;
      Bundle localBundle;
      SyncStats localSyncStats2;
      SyncStats localSyncStats4;
      SyncStats localSyncStats1;
      label689: SyncStats localSyncStats3;
      label711: return localBundle;
      l2 = 0L;
      i = 0;
      break;
      label723: String str1 = null;
    }
  }

  private static q a(Context paramContext, HttpClient paramHttpClient, Account paramAccount, ac paramac, ad paramad, SyncResult paramSyncResult)
  {
    if (a)
      Log.d("TwitterDataSync", "=====> Sync about me activity");
    long l1 = paramad.a;
    ak localak = ak.a(paramContext, l1);
    ai localai = ai.a(paramContext);
    long l2 = localak.b(0);
    StringBuilder localStringBuilder = ai.a(localai.a, new Object[] { "i", "activity", "about_me" }).append(".json");
    ai.a(localStringBuilder, "include_entities", true);
    if (l2 > 0L)
      ai.a(localStringBuilder, "since_id", l2);
    ai.a(localStringBuilder, "count", 20);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      cl localcl = new cl(paramac);
      n localn = n.a(localai, paramHttpClient, localStringBuilder, localcl, true, localByteArrayOutputStream).a();
      if (localn.c == 200)
      {
        bq localbq = do.a.a(localByteArrayOutputStream.toByteArray());
        localbq.g();
        ArrayList localArrayList = localak.a(do.s(localbq), l1, 0, false, false);
        int i = localArrayList.size();
        if (a)
          Log.d("TwitterDataSync", "=====> Sync about me activity, got " + i);
        if (i <= 0)
          break label889;
        localIterator = localArrayList.iterator();
        localp = null;
        j = 0;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        while (localIterator.hasNext())
        {
          localae = (ae)localIterator.next();
          switch (localae.a)
          {
          case 3:
            i1++;
            if ((localp != null) || (localae.j.isEmpty()))
              break label776;
            localp = (p)localae.j.get(0);
            break;
          case 2:
            i1++;
            if ((localp != null) || (localae.m.isEmpty()))
              break label776;
            localp = (p)localae.m.get(0);
          default:
          case 1:
          case 5:
          case 4:
          case 6:
          }
        }
        if (a)
        {
          arrayOfObject = new Object[5];
          arrayOfObject[0] = Integer.valueOf(i1);
          arrayOfObject[1] = Integer.valueOf(k);
          arrayOfObject[2] = Integer.valueOf(m);
          arrayOfObject[3] = Integer.valueOf(n);
          arrayOfObject[4] = Integer.valueOf(j);
          Log.d("TwitterDataSync", String.format("=====> Sync about me activity, %d %d %d %d %d", arrayOfObject));
          break label826;
          com.twitter.android.provider.q.a(paramContext).a(paramAccount.name, i2);
          localq = new q(null);
          localBundle1 = new Bundle();
          localBundle1.putLong("owner_id", l1);
          localBundle1.putInt("new", i);
          localq.a = localBundle1;
          if (localp == null)
            break label886;
          localBundle2 = new Bundle();
          localBundle2.putInt("new", i1);
          localBundle2.putInt("unread", localak.d(l1, 5));
          localBundle2.putString("sample", localp.h);
          localBundle2.putLong("status_id", localp.a);
          localBundle2.putLong("owner_id", l1);
          if (localp.m != null)
          {
            localBundle2.putLong("sender_id", localp.m.a);
            localBundle2.putString("sender", localp.m.g);
          }
          localq.b = localBundle2;
          return localq;
        }
      }
      else if (localn.c == 401)
      {
        localSyncStats4 = paramSyncResult.stats;
        localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
      }
      else
      {
        localSyncStats3 = paramSyncResult.stats;
        localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
      }
    }
    catch (aa localaa)
    {
      localSyncStats2 = paramSyncResult.stats;
      localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
    }
    catch (IOException localIOException)
    {
      localSyncStats1 = paramSyncResult.stats;
      localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
    }
    q localq;
    while (true)
    {
      Iterator localIterator;
      p localp;
      int j;
      int k;
      int m;
      int n;
      int i1;
      ae localae;
      Object[] arrayOfObject;
      Bundle localBundle1;
      Bundle localBundle2;
      SyncStats localSyncStats4;
      SyncStats localSyncStats3;
      SyncStats localSyncStats2;
      SyncStats localSyncStats1;
      label776: int i3 = j;
      for (int i4 = i1; ; i4 = i1)
      {
        i1 = i4;
        j = i3;
        break;
        k++;
        break;
        m++;
        break;
        n++;
        break;
        i3 = j + 1;
      }
      label826: int i2 = 0;
      if (i1 > 0)
        i2 = 1;
      if (k > 0)
        i2 |= 2;
      if (m > 0)
        i2 |= 4;
      if (n > 0)
        i2 |= 8;
      if (j > 0)
        i2 |= 16;
    }
    label886: return localq;
    label889: return null;
  }

  public static void a(Context paramContext, Account paramAccount, int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    long l = 60000 * paramInt;
    PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, new Intent(paramContext, AppService.class).setAction("com.twitter.android.poll.alarm").addCategory(paramAccount.name).putExtra("account_name", paramAccount.name), 0);
    if (l > 0L)
    {
      localAlarmManager.set(0, l + System.currentTimeMillis(), localPendingIntent);
      return;
    }
    localAlarmManager.cancel(localPendingIntent);
  }

  private static Bundle b(Context paramContext, HttpClient paramHttpClient, Account paramAccount, ac paramac, ad paramad, int paramInt, SyncResult paramSyncResult)
  {
    if (a)
      Log.d("TwitterDataSync", "=====> Sync direct messages");
    long l1 = paramad.a;
    ak localak = ak.a(paramContext, l1);
    ai localai = ai.a(paramContext);
    long l2;
    int i;
    StringBuilder localStringBuilder;
    if (localak.a(4, paramInt, l1, 1) != null)
    {
      l2 = localak.a(paramInt);
      i = 100;
      while (true)
        if (paramInt == 0)
        {
          localStringBuilder = localai.a(new Object[] { "direct_messages", "sent" }).append(".json");
          label96: if (l2 > 0L)
            ai.a(localStringBuilder, "since_id", l2);
          if (i > 0)
            ai.a(localStringBuilder, "count", i);
          ai.a(localStringBuilder, "include_entities", true);
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            cl localcl = new cl(paramac);
            n localn = n.a(localai, paramHttpClient, localStringBuilder, localcl, true, localByteArrayOutputStream).a();
            if (localn.c == 200)
            {
              bq localbq = do.a.a(localByteArrayOutputStream.toByteArray());
              localbq.g();
              ArrayList localArrayList = do.e(localbq);
              String str1;
              int j;
              int k;
              com.twitter.android.provider.q localq;
              String str2;
              if ((l2 == 0L) && (localArrayList.size() > 0))
              {
                str1 = Long.toString(((cq)localArrayList.get(localArrayList.size() - 1)).a);
                j = localak.a(localArrayList, l1, paramInt, false, false, str1);
                if (a)
                  Log.d("TwitterDataSync", "====> Sync direct messages, got " + j);
                if (paramInt != 1)
                  break label614;
                k = localak.d();
                localq = com.twitter.android.provider.q.a(paramContext);
                str2 = paramAccount.name;
                if (k <= 0)
                  break label508;
              }
              for (int m = 1; ; m = 0)
              {
                localq.a(str2, "message", m);
                if (j <= 0)
                  break label614;
                cq localcq = (cq)localArrayList.get(0);
                Bundle localBundle = new Bundle();
                localBundle.putInt("new", j);
                localBundle.putInt("unread", k);
                localBundle.putString("sample", localcq.b);
                if (localcq.e != null)
                  localBundle.putLong("owner_id", localcq.e.a);
                if (localcq.d != null)
                {
                  localBundle.putLong("sender_id", localcq.d.a);
                  localBundle.putString("sender", localcq.d.g);
                }
                return localBundle;
                l2 = 0L;
                i = 0;
                break;
                localStringBuilder = localai.a(new Object[] { "direct_messages" }).append(".json");
                break label96;
                str1 = null;
                break label249;
              }
            }
            else if (localn.c == 401)
            {
              SyncStats localSyncStats4 = paramSyncResult.stats;
              localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
            }
            else
            {
              SyncStats localSyncStats3 = paramSyncResult.stats;
              localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
            }
          }
          catch (aa localaa)
          {
            SyncStats localSyncStats2 = paramSyncResult.stats;
            localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
          }
          catch (IOException localIOException)
          {
            SyncStats localSyncStats1 = paramSyncResult.stats;
            localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
          }
        }
    }
    label249: label508: return null;
  }

  public final void a(HttpClient paramHttpClient, Account paramAccount, Bundle paramBundle, SyncResult paramSyncResult)
  {
    if (paramAccount == null);
    Context localContext;
    AccountManager localAccountManager;
    String str1;
    while (true)
    {
      return;
      localContext = getContext();
      localAccountManager = AccountManager.get(localContext);
      str1 = localAccountManager.getUserData(paramAccount, "account_user_info");
      if (str1 == null)
      {
        SyncStats localSyncStats5 = paramSyncResult.stats;
        localSyncStats5.numAuthExceptions = (1L + localSyncStats5.numAuthExceptions);
        Log.e("TwitterDataSync", "ACCOUNT_USER_INFO_KEY content not found.");
        return;
      }
      try
      {
        str2 = localAccountManager.blockingGetAuthToken(paramAccount, "com.twitter.android.oauth.token", false);
        str3 = localAccountManager.blockingGetAuthToken(paramAccount, "com.twitter.android.oauth.token.secret", false);
        if ((str2 == null) || (str3 == null))
        {
          localSyncStats4 = paramSyncResult.stats;
          localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
          Log.e("TwitterDataSync", "Token not found.");
          return;
        }
      }
      catch (AuthenticatorException localAuthenticatorException)
      {
        String str2;
        String str3;
        localSyncStats3 = paramSyncResult.stats;
        localSyncStats3.numAuthExceptions = (1L + localSyncStats3.numAuthExceptions);
        return;
        localad = do.c(str1);
        localac = new ac(str2, str3);
        l1 = C2DMService.a(localContext);
        l2 = System.currentTimeMillis();
        if ((l1 == 0L) || (l1 + 86400000L < l2))
          C2DMService.b(localContext);
        localIntent1 = new Intent("com.twitter.android.poll.data");
        if (paramBundle != null)
        {
          bool1 = paramBundle.getBoolean("home", true);
          i = 0;
          if (!bool1);
        }
        else
        {
          localBundle3 = a(localContext, paramHttpClient, paramAccount, localac, localad, 0, paramSyncResult);
          i = 0;
          if (localBundle3 != null)
          {
            localIntent1.putExtra("com.twitter.android._data.home", localBundle3);
            i = 1;
          }
        }
        if ((paramBundle == null) || (paramBundle.getBoolean("messages", true)))
        {
          localBundle1 = b(localContext, paramHttpClient, paramAccount, localac, localad, 1, paramSyncResult);
          if ((!C2DMService.a) && (localBundle1 != null))
          {
            localIntent1.putExtra("com.twitter.android._data.dms", localBundle1);
            i = 1;
          }
          b(localContext, paramHttpClient, paramAccount, localac, localad, 0, paramSyncResult);
        }
        j = i;
        if ((paramBundle == null) || (paramBundle.getBoolean("activity", true)))
        {
          localq = a(localContext, paramHttpClient, paramAccount, localac, localad, paramSyncResult);
          if (localq != null)
          {
            if (localq.a != null)
              localIntent1.putExtra("com.twitter.android._data.activity", localq.a);
            if ((C2DMService.a) || (localq.b == null))
              break label887;
            localIntent1.putExtra("com.twitter.android._data.mentions", localq.b);
            break label887;
            if ((paramBundle == null) || (paramBundle.getBoolean("discover", true)))
            {
              localBundle2 = a(localContext, paramHttpClient, localac, localad, paramSyncResult);
              if (localBundle2 != null)
              {
                k = 1;
                localIntent1.putExtra("com.twitter.android._data.discover", localBundle2);
              }
            }
            localq1 = com.twitter.android.provider.q.a(localContext);
            if (k != 0)
            {
              localIntent2 = localIntent1.putExtra("unread_count_types", localq1.a(localad.g)).putExtra("account_name", localad.g).putExtra("owner_id", localad.a).putExtra("notif_id", localq1.b(localad.g));
              if (paramBundle == null)
                break label893;
              if (paramBundle.getBoolean("show_notif", true))
              {
                break label893;
                localIntent2.putExtra("show_notif", bool2);
                localContext.sendOrderedBroadcast(localIntent1, null);
              }
            }
            else
            {
              localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(localContext);
              l3 = localSharedPreferences.getLong("auto_clean", 0L);
              localEditor = localSharedPreferences.edit();
              if (l3 + 3600000L < l2)
              {
                ak.a(localContext, localad.a).e(localad.a);
                localEditor.putLong("auto_clean", l2);
              }
              localEditor.putLong("last_sync", l2);
              localEditor.commit();
              arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
              m = arrayOfAccount.length;
              n = 0;
              if (n >= m)
                continue;
              localAccount = arrayOfAccount[n];
              if (PendingIntent.getService(localContext, 0, new Intent(localContext, AppService.class).setAction("com.twitter.android.poll.alarm").addCategory(localAccount.name).putExtra("account_name", localAccount.name), 536870912) == null)
                break label812;
            }
            for (i1 = 1; ; i1 = 0)
            {
              if ((paramAccount.equals(localAccount)) || (i1 == 0))
                a(localContext, localAccount, localq1.e(localAccount.name));
              n++;
              break label703;
              bool2 = false;
              break;
            }
          }
        }
      }
      catch (OperationCanceledException localOperationCanceledException)
      {
        if (a)
        {
          Log.d("TwitterDataSync", "Sync canceled.");
          return;
        }
      }
      catch (IOException localIOException)
      {
        localSyncStats2 = paramSyncResult.stats;
        localSyncStats2.numIoExceptions = (1L + localSyncStats2.numIoExceptions);
        return;
      }
      catch (JSONException localJSONException)
      {
        localSyncStats1 = paramSyncResult.stats;
        localSyncStats1.numParseExceptions = (1L + localSyncStats1.numParseExceptions);
        return;
      }
    }
    while (true)
    {
      SyncStats localSyncStats4;
      SyncStats localSyncStats3;
      ad localad;
      ac localac;
      long l1;
      long l2;
      Intent localIntent1;
      boolean bool1;
      int i;
      Bundle localBundle3;
      Bundle localBundle1;
      int j;
      q localq;
      Bundle localBundle2;
      com.twitter.android.provider.q localq1;
      Intent localIntent2;
      SharedPreferences localSharedPreferences;
      long l3;
      SharedPreferences.Editor localEditor;
      Account[] arrayOfAccount;
      int m;
      int n;
      label703: Account localAccount;
      int i1;
      label812: SyncStats localSyncStats2;
      SyncStats localSyncStats1;
      int k = j;
      continue;
      label887: k = 1;
      continue;
      label893: boolean bool2 = true;
    }
  }

  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    SingleClientConnManager localSingleClientConnManager = new SingleClientConnManager(n.b, n.a);
    a(n.a(localSingleClientConnManager), paramAccount, paramBundle, paramSyncResult);
    localSingleClientConnManager.shutdown();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
