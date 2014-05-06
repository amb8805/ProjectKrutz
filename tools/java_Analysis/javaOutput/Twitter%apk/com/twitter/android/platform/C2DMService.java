package com.twitter.android.platform;

import ac;
import ai;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import bu;
import cl;
import com.twitter.android.provider.ak;
import com.twitter.android.provider.av;
import com.twitter.android.provider.q;
import java.util.HashMap;
import n;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.conn.SingleClientConnManager;

public class C2DMService extends IntentService
{
  public static final boolean a;
  private static final boolean b = Log.isLoggable("C2DMService", 3);
  private static final HashMap c;
  private static final HashMap d;
  private static PowerManager.WakeLock e;
  private String f;
  private SingleClientConnManager g;
  private HttpClient h;
  private ai i;

  static
  {
    if (Build.VERSION.SDK_INT >= 8);
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      c = new HashMap();
      d = new HashMap();
      c.put("com.google.android.c2dm.intent.REGISTRATION", Integer.valueOf(1));
      c.put("com.google.android.c2dm.intent.RECEIVE", Integer.valueOf(2));
      c.put("com.google.android.c2dm.intent.RETRY", Integer.valueOf(3));
      c.put("com.twitter.android.action.c2dm.REFRESH", Integer.valueOf(4));
      c.put("com.twitter.android.action.c2dm.ENABLE", Integer.valueOf(5));
      d.put("tweet", Integer.valueOf(1));
      d.put("mention", Integer.valueOf(2));
      d.put("direct_message", Integer.valueOf(3));
      return;
    }
  }

  public C2DMService()
  {
    super("C2DMService");
  }

  public static long a(Context paramContext)
  {
    return paramContext.getSharedPreferences("c2dm", 0).getLong("last_refresh", 0L);
  }

  private void a()
  {
    a(20000L, 0);
  }

  private void a(long paramLong, int paramInt)
  {
    getSharedPreferences("c2dm", 0).edit().putLong("backoff", paramLong).putInt("backoff_ceil", paramInt).commit();
  }

  private static void a(Context paramContext, long paramLong)
  {
    paramContext.getSharedPreferences("c2dm", 0).edit().putLong("last_refresh", paramLong).commit();
  }

  static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (e == null)
        e = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "C2DMService");
      e.acquire();
      paramIntent.setClass(paramContext, C2DMService.class);
      paramContext.startService(paramIntent);
      return;
    }
    finally
    {
    }
  }

  private void a(String paramString)
  {
    SharedPreferences.Editor localEditor = getSharedPreferences("c2dm", 0).edit();
    if (paramString != null)
      localEditor.putString("reg_id", paramString);
    while (true)
    {
      localEditor.commit();
      return;
      localEditor.remove("reg_id");
    }
  }

  private boolean a(ac paramac, String paramString1, String paramString2, int paramInt)
  {
    StringBuilder localStringBuilder = this.i.a(new Object[] { "account", "push_destinations" }).append(".json");
    ai.a(localStringBuilder, "udid", paramString1);
    ai.a(localStringBuilder, "enabled_for", paramInt);
    if (paramString2 != null)
      ai.a(localStringBuilder, "token", paramString2);
    return a(localStringBuilder.toString(), paramac);
  }

  private boolean a(String paramString, ac paramac)
  {
    bu localbu = new bu(this.h, new HttpPost(paramString), new cl(paramac), null);
    this.i.a(localbu);
    return localbu.a().b();
  }

  private void b()
  {
    String str = c(this);
    if (str == null)
      label9: return;
    AccountManager localAccountManager = AccountManager.get(this);
    Account[] arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
    long l = System.currentTimeMillis();
    int j = arrayOfAccount.length;
    int k = 0;
    int m = 0;
    label37: Account localAccount;
    ac localac;
    Cursor localCursor;
    int i2;
    if (k < j)
    {
      localAccount = arrayOfAccount[k];
      localac = d.a(localAccountManager, localAccount);
      if (localac == null)
        break label291;
      if (TextUtils.isEmpty(localAccountManager.getUserData(localAccount, "registration_id")))
        break label304;
      localCursor = getContentResolver().query(Uri.withAppendedPath(av.a, localAccount.name), new String[] { "notif_mention", "notif_message" }, null, null, null);
      if (localCursor == null)
        break label304;
      if (!localCursor.moveToFirst())
        break label298;
      if (localCursor.isNull(0))
      {
        i2 = 4;
        if ((localCursor.isNull(1)) || (localCursor.getInt(1) == 1))
          i2 |= 1;
        label175: localCursor.close();
      }
    }
    label291: label298: label304: for (int i1 = i2; ; i1 = 5)
    {
      if (a(localac, this.f, str, i1))
        localAccountManager.setUserData(localAccount, "registration_id", str);
      for (int n = m + 1; ; n = m)
      {
        k++;
        m = n;
        break label37;
        switch (localCursor.getInt(0))
        {
        default:
          i2 = 0;
          break;
        case 1:
          i2 = 4;
          break;
        case 2:
          i2 = 8;
          break;
          if (m <= 0)
            break label9;
          a(this, l);
          return;
        }
      }
      i2 = 5;
      break label175;
    }
  }

  public static void b(Context paramContext)
  {
    if (!a)
      return;
    int n;
    if (ContentResolver.getMasterSyncAutomatically())
    {
      Account[] arrayOfAccount = AccountManager.get(paramContext).getAccountsByType("com.twitter.android.auth.login");
      int m = arrayOfAccount.length;
      n = 0;
      label32: if (n < m)
      {
        Account localAccount = arrayOfAccount[n];
        if ((ContentResolver.getIsSyncable(localAccount, "com.twitter.android.provider.TwitterProvider") <= 0) || (!ContentResolver.getSyncAutomatically(localAccount, "com.twitter.android.provider.TwitterProvider")));
      }
    }
    for (int j = 1; ; j = 0)
    {
      int k;
      if (!TextUtils.isEmpty(c(paramContext)))
        k = 1;
      while (true)
        if (j != k)
        {
          if (j != 0)
          {
            d(paramContext);
            return;
            n++;
            break label32;
            k = 0;
            continue;
          }
          if (!a)
            break;
          Intent localIntent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
          localIntent.putExtra("app", PendingIntent.getBroadcast(paramContext, 0, new Intent(), 0));
          paramContext.startService(localIntent);
          return;
        }
      if (j == 0)
        break;
      paramContext.startService(new Intent(paramContext, C2DMService.class).setAction("com.twitter.android.action.c2dm.REFRESH"));
      return;
    }
  }

  private static String c(Context paramContext)
  {
    return paramContext.getSharedPreferences("c2dm", 0).getString("reg_id", null);
  }

  private static void d(Context paramContext)
  {
    if (!a)
      return;
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.putExtra("app", PendingIntent.getBroadcast(paramContext, 0, new Intent(), 0));
    localIntent.putExtra("sender", "twittermobileclients@gmail.com");
    paramContext.startService(localIntent);
  }

  public void onCreate()
  {
    super.onCreate();
    this.f = Settings.Secure.getString(getContentResolver(), "android_id");
    this.g = new SingleClientConnManager(n.b, n.a);
    this.h = n.a(this.g);
    this.i = ai.a(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.g.shutdown();
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    Integer localInteger1 = (Integer)c.get(str1);
    int j;
    if (localInteger1 != null)
    {
      j = localInteger1.intValue();
      switch (j)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    ac localac1;
    int k;
    do
    {
      return;
      j = 0;
      break;
      switch (j)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        e.release();
        return;
        String str10;
        try
        {
          String str8 = paramIntent.getStringExtra("error");
          String str9 = paramIntent.getStringExtra("unregistered");
          str10 = paramIntent.getStringExtra("registration_id");
          if (str9 != null)
          {
            if (b)
              Log.d("C2DMService", "Unregistered -> " + str9);
            a(null);
            a();
            AccountManager localAccountManager = AccountManager.get(this);
            for (Account localAccount2 : localAccountManager.getAccountsByType("com.twitter.android.auth.login"))
            {
              ac localac2 = d.a(localAccountManager, localAccount2);
              if (localac2 != null)
              {
                String str11 = this.f;
                StringBuilder localStringBuilder = this.i.a(new Object[] { "account", "push_destinations", "destroy" }).append(".json");
                ai.a(localStringBuilder, "udid", str11);
                a(localStringBuilder.toString(), localac2);
              }
              localAccountManager.setUserData(localAccount2, "registration_id", null);
            }
          }
          if (str8 != null)
          {
            if (b)
              Log.d("C2DMService", "Registration error -> " + str8);
            a(null);
            if (!"SERVICE_NOT_AVAILABLE".equals(str8))
              continue;
            SharedPreferences localSharedPreferences = getSharedPreferences("c2dm", 0);
            long l2 = localSharedPreferences.getLong("backoff", 20000L);
            int i2 = localSharedPreferences.getInt("backoff_ceil", 0);
            Intent localIntent2 = new Intent("com.google.android.c2dm.intent.RETRY");
            ((AlarmManager)getSystemService("alarm")).set(3, l2, PendingIntent.getBroadcast(this, 0, localIntent2, 0));
            if (i2 >= 5L)
              continue;
            a(l2 * 2L, i2 + 1);
            continue;
          }
        }
        finally
        {
          e.release();
        }
        if (str10 != null)
        {
          if (b)
            Log.d("C2DMService", "Registered -> " + str10);
          a(str10);
          a(this, 0L);
          a();
          b();
          continue;
          if (b)
            Log.d("C2DMService", "Push received.");
          Bundle localBundle1 = paramIntent.getExtras();
          if (d.a(this, localBundle1.getString("recipient_name")) != null)
          {
            String str2 = localBundle1.getString("collapse_key");
            String str3 = localBundle1.getString("recipient_name");
            String str4 = localBundle1.getString("user_id");
            String str5 = localBundle1.getString("status_id");
            String str6 = localBundle1.getString("sender_name");
            String str7 = localBundle1.getString("text");
            Integer localInteger2 = (Integer)d.get(str2);
            long l1;
            q localq;
            ak localak;
            Intent localIntent1;
            Bundle localBundle2;
            if (localInteger2 != null)
            {
              l1 = Long.valueOf(str4).longValue();
              localq = q.a(this);
              localak = ak.a(this, l1);
              localIntent1 = new Intent("com.twitter.android.poll.data");
              localBundle2 = new Bundle();
              localBundle2.putInt("new", 1);
              localBundle2.putString("sample", str7);
              localBundle2.putString("sender", str6);
              localBundle2.putLong("owner_id", l1);
              int m = localInteger2.intValue();
              switch (m)
              {
              default:
                e.release();
                return;
              case 1:
                e.release();
                return;
              case 2:
                localq.a(str3, 1);
                localBundle2.putInt("unread", 1 + localak.d(l1, 5));
                localBundle2.putLong("status_id", Long.valueOf(str5).longValue());
                localIntent1.putExtra("com.twitter.android._data.mentions", localBundle2);
              case 3:
              }
            }
            while (true)
            {
              localIntent1.putExtra("account_name", str3);
              localIntent1.putExtra("owner_id", l1);
              localIntent1.putExtra("notif_id", localq.b(str3));
              localIntent1.putExtra("unread_count_types", localq.a(str3));
              sendOrderedBroadcast(localIntent1, null);
              if (!b)
                break;
              Log.d("C2DMService", "collapse_key: " + str2);
              Log.d("C2DMService", "sender_name: " + str6);
              Log.d("C2DMService", "recipient_name: " + str3);
              Log.d("C2DMService", "user_id: " + str4);
              Log.d("C2DMService", "status_id: " + str5);
              Log.d("C2DMService", "text: " + str7);
              break;
              localq.a(str3, "message", 1);
              localBundle2.putInt("unread", 1 + localak.d());
              localIntent1.putExtra("com.twitter.android._data.dms", localBundle2);
            }
            if (TextUtils.isEmpty(c(this)))
              d(this);
          }
        }
      }
      if (b)
        Log.d("C2DMService", "Refresh.");
      b();
      return;
      Account localAccount1 = (Account)paramIntent.getParcelableExtra("account");
      localac1 = d.a(AccountManager.get(this), localAccount1);
      k = paramIntent.getIntExtra("enabled_for", 0);
    }
    while ((localac1 == null) || (k <= 0));
    a(localac1, this.f, null, k);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.C2DMService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
