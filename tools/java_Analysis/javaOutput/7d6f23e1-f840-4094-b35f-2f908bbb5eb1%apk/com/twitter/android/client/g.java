package com.twitter.android.client;

import ac;
import ad;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent;;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import ao;
import ar;
import ay;
import bb;
import be;
import bk;
import cb;
import com.twitter.android.DraftsActivity;
import com.twitter.android.HomeTabActivity;
import com.twitter.android.MessagesActivity;
import com.twitter.android.MessagesThreadActivity;
import com.twitter.android.TweetActivity;
import com.twitter.android.UsersActivity;
import com.twitter.android.platform.C2DMService;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.av;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.f;
import com.twitter.android.provider.q;
import com.twitter.android.service.ScribeService;
import com.twitter.android.service.TwitterService;
import cr;
import dh;
import do;
import dt;
import dz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import k;
import org.json.JSONException;

public final class g
  implements com.twitter.android.widget.c, k
{
  private static final boolean c = Log.isLoggable("AC", 3);
  private static g d;
  boolean a;
  public float b;
  private bk e;
  private final SparseArray f;
  private final SparseArray g;
  private final ArrayList h;
  private final HashMap i;
  private final HashMap j;
  private final com.twitter.android.service.e k;
  private final float l;
  private dt m;
  private final HashMap n = new HashMap();
  private String o;
  private HashMap p = new HashMap();
  private boolean q;
  private Context r;
  private NotificationManager s;
  private final SharedPreferences.OnSharedPreferenceChangeListener t = new d(this);

  private g(Context paramContext)
  {
    this.r = paramContext;
    this.s = ((NotificationManager)paramContext.getSystemService("notification"));
    this.h = new ArrayList();
    this.i = new HashMap();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i1 = Math.max(localDisplay.getWidth(), localDisplay.getHeight());
    SparseArray localSparseArray1 = new SparseArray(3);
    this.f = localSparseArray1;
    localSparseArray1.put(1, new dz(paramContext, 1, i1));
    localSparseArray1.put(2, new dz(paramContext, 2, i1));
    this.e = new bk(this, i1);
    SparseArray localSparseArray2 = new SparseArray(2);
    this.g = localSparseArray2;
    localSparseArray2.put(1, new h(1));
    localSparseArray2.put(2, new h(2));
    this.j = new HashMap();
    this.k = new com.twitter.android.service.e(new c(this));
    this.l = paramContext.getResources().getDisplayMetrics().density;
    this.b = Float.parseFloat("14");
  }

  public static AlertDialog a(Activity paramActivity, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(paramActivity);
    AlertDialog.Builder localBuilder2 = localBuilder1.setTitle(2131427395).setIcon(17301659);
    int i1;
    AlertDialog.Builder localBuilder3;
    if (paramBoolean)
    {
      i1 = 2131427527;
      localBuilder3 = localBuilder2.setMessage(i1);
      if (!paramBoolean)
        break label80;
    }
    label80: for (int i2 = 2131427397; ; i2 = 2131427395)
    {
      localBuilder3.setPositiveButton(i2, paramOnClickListener).setNeutralButton(2131427525, paramOnClickListener).setNegativeButton(2131427504, null);
      return localBuilder1.create();
      i1 = 2131427526;
      break;
    }
  }

  private Notification a(int paramInt, PendingIntent paramPendingIntent)
  {
    Context localContext = this.r;
    String str = localContext.getString(paramInt);
    Notification localNotification = new Notification(2130837754, str, System.currentTimeMillis());
    localNotification.setLatestEventInfo(localContext, localContext.getString(2131427343), str, paramPendingIntent);
    return localNotification;
  }

  private Intent a(j paramj, String paramString)
  {
    return new Intent(this.r, TwitterService.class).setAction(paramString).putExtra("sid", paramj.c()).putExtra("soid", paramj.g()).putExtra("account_name", paramj.e()).putExtra("ibinder", this.k).putExtra("auth", paramj.h());
  }

  public static g a(Context paramContext)
  {
    try
    {
      if (d == null)
        d = new g(paramContext.getApplicationContext());
      g localg = d;
      return localg;
    }
    finally
    {
    }
  }

  private j a(Account paramAccount)
  {
    int i1 = 1;
    AccountManager localAccountManager = AccountManager.get(this.r);
    String str1 = localAccountManager.getUserData(paramAccount, "account_user_info");
    j localj = q();
    String str2;
    if (str1 != null)
    {
      str2 = paramAccount.name;
      try
      {
        String str3 = localAccountManager.getPassword(paramAccount);
        if (str3 != null)
          if (i1 != 0)
          {
            localj.a(str2);
            localj.a(true);
            a(localj, str2, str3);
          }
          else
          {
            localac = com.twitter.android.platform.d.a(localAccountManager, paramAccount);
            str4 = localAccountManager.getUserData(paramAccount, "account_settings");
            if (localac != null)
              a(localj, str2, localac, do.c(str1), cb.a(str4));
          }
      }
      catch (IOException localIOException)
      {
        if (c)
          Log.d("AC", "User info: " + str1, localIOException);
        return localj;
      }
      catch (JSONException localJSONException)
      {
        break label162;
      }
    }
    while (true)
    {
      ac localac;
      String str4;
      label162: return localj;
      i1 = 0;
    }
  }

  private j a(String paramString, Account paramAccount)
  {
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      synchronized (this.n)
      {
        Iterator localIterator = this.n.values().iterator();
        if (localIterator.hasNext())
        {
          j localj = (j)localIterator.next();
          if (!paramString.equals(localj.e()))
            continue;
          return localj;
        }
        if (paramAccount != null)
          break label109;
        localAccount = com.twitter.android.platform.d.a(this.r, paramString);
        if (localAccount == null)
          return q();
      }
      return a(localAccount);
      label109: Account localAccount = paramAccount;
    }
  }

  private String a(j paramj, Intent paramIntent, int paramInt)
  {
    if (paramInt == 200)
    {
      ac localac1 = (ac)paramIntent.getParcelableExtra("auth");
      ad localad = (ad)paramIntent.getParcelableExtra("user");
      a(paramj, localad.g, localac1, localad, null);
      String str1 = do.a(localad);
      String str2 = paramj.e();
      ac localac2 = paramj.h();
      if (paramj.i())
      {
        com.twitter.android.platform.d.a(this.r, str2, localac2, str1);
        paramj.a(false);
      }
      while (true)
      {
        return str1;
        com.twitter.android.platform.d.a(com.twitter.android.platform.d.a(this.r, str2, localac2, str1, true, false), "com.twitter.android.provider.TwitterProvider", true);
      }
    }
    paramj.a(e.a);
    return null;
  }

  private String a(j paramj, String paramString1, String paramString2)
  {
    paramj.a(e.b);
    Intent localIntent = a(paramj, "LOGIN");
    localIntent.putExtra("screen_name", paramString1);
    localIntent.putExtra("pass", paramString2);
    return e(localIntent);
  }

  private void a(j paramj, String paramString, ac paramac, ad paramad, cb paramcb)
  {
    Context localContext = this.r;
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(localContext);
    paramj.a(e.c);
    paramj.a(paramad);
    paramj.a(paramString);
    paramj.a(paramac);
    if (paramcb == null)
      d(paramj);
    while (true)
    {
      C2DMService.b(localContext);
      e(a(paramj, "CONFIG"));
      e(a(paramj, "DECIDER"));
      long l1 = paramj.g();
      if (l1 > 0L);
      synchronized (this.j)
      {
        h localh = (h)this.j.get(Long.valueOf(l1));
        if (localh == null)
        {
          localh = new h(localContext, (dz)this.f.get(1), paramj.e(), l1);
          this.j.put(Long.valueOf(l1), localh);
        }
        localh.b();
        this.a = localSharedPreferences.getBoolean("sound_effects", true);
        this.b = Float.parseFloat(localSharedPreferences.getString("font_size", "14"));
        localSharedPreferences.registerOnSharedPreferenceChangeListener(this.t);
        return;
        paramj.a(paramcb);
      }
    }
  }

  private void c(int paramInt)
  {
    String str = cr.a(6);
    j localj = f();
    Intent localIntent = new Intent(this.r, TwitterService.class).setAction("MARK_TWEETS").putExtra("rid", str).putExtra("sid", localj.c()).putExtra("soid", localj.g()).putExtra("account_name", localj.e()).putExtra("owner_id", f().g()).putExtra("i_type", paramInt);
    this.r.startService(localIntent);
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).a(localj, paramInt);
  }

  private String e(Intent paramIntent)
  {
    String str = cr.a(6);
    if (c)
      Log.d("AC", "Request Id: " + str);
    paramIntent.putExtra("rid", str);
    this.i.put(str, paramIntent);
    this.r.startService(paramIntent);
    return str;
  }

  private Intent j(String paramString)
  {
    return a(f(), paramString);
  }

  private int k(String paramString)
  {
    Integer localInteger = (Integer)this.p.get(paramString);
    if (localInteger == null)
      return 7;
    return localInteger.intValue();
  }

  private j q()
  {
    synchronized (this.n)
    {
      Iterator localIterator = this.n.values().iterator();
      while (localIterator.hasNext())
      {
        j localj2 = (j)localIterator.next();
        if ((localj2.b() == e.a) && (localj2.g() == 0L))
          return localj2;
      }
      j localj1 = new j();
      String str = localj1.c();
      this.n.put(str, localj1);
      return localj1;
    }
  }

  private int r()
  {
    return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(this.r).getString("photo_service", Integer.toString(2)));
  }

  public final int a(boolean paramBoolean)
  {
    if ((this.m != null) && (this.m.a > 0));
    for (int i1 = this.m.a; ; i1 = 20)
    {
      if (paramBoolean)
        i1++;
      return i1;
    }
  }

  public final Bitmap a(int paramInt, long paramLong)
  {
    return ((dz)this.f.get(paramInt)).a(paramLong);
  }

  public final Bitmap a(int paramInt, long paramLong, String paramString)
  {
    if ((paramString != null) && (this.l > 1.0F));
    for (String str = paramString.replace("_normal.", "_bigger."); ; str = paramString)
      return ((dz)this.f.get(paramInt)).a(f().g(), paramLong, str);
  }

  public final Bitmap a(ax paramax)
  {
    return a(paramax.t, paramax.n, paramax.k);
  }

  public final be a(int paramInt, long paramLong, byte[] paramArrayOfByte)
  {
    return ((h)this.g.get(paramInt)).a(Long.valueOf(paramLong), paramArrayOfByte);
  }

  public final String a(double paramDouble1, double paramDouble2, String paramString)
  {
    Intent localIntent = j("REVERSE_GEO");
    localIntent.putExtra("lat", paramDouble1);
    localIntent.putExtra("long", paramDouble2);
    localIntent.putExtra("accuracy", paramString);
    return e(localIntent);
  }

  public final String a(int paramInt)
  {
    Intent localIntent = j("GET_BLOCKING");
    localIntent.putExtra("page", paramInt);
    localIntent.putExtra("user_id", f().g());
    return e(localIntent);
  }

  public final String a(int paramInt, long paramLong1, long paramLong2)
  {
    Intent localIntent = j("ADD_LIST_USER");
    localIntent.putExtra("user_type", paramInt);
    localIntent.putExtra("list_id", paramLong1);
    localIntent.putExtra("user_id", paramLong2);
    localIntent.putExtra("owner_id", f().g());
    return e(localIntent);
  }

  public final String a(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    Intent localIntent = j("GET_LIST_USERS");
    localIntent.putExtra("user_type", paramInt1);
    localIntent.putExtra("user_id", paramLong1);
    localIntent.putExtra("list_id", paramLong2);
    localIntent.putExtra("page", paramInt2);
    return e(localIntent);
  }

  public final String a(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    Intent localIntent = j("IS_LIST_USER");
    localIntent.putExtra("user_type", 5);
    localIntent.putExtra("owner_id", paramLong1);
    localIntent.putExtra("list_id", paramLong2);
    localIntent.putExtra("user_id", paramLong3);
    return e(localIntent);
  }

  public final String a(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2)
  {
    return e(j("USER_TIMELINE").putExtra("status_type", paramInt1).putExtra("user_id", paramLong1).putExtra("since_id", paramLong2).putExtra("max_id", paramLong3).putExtra("count", paramInt2));
  }

  public final String a(long paramLong)
  {
    return e(j("GET_FRIENDSHIP").putExtra("owner_id", f().g()).putExtra("user_id", paramLong));
  }

  public final String a(long paramLong, int paramInt)
  {
    Intent localIntent = j("GET_FAVS");
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("page", paramInt);
    return e(localIntent);
  }

  public final String a(long paramLong, int paramInt1, int paramInt2)
  {
    Intent localIntent = j("GET_USERS");
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("page", paramInt1);
    localIntent.putExtra("user_type", paramInt2);
    return e(localIntent);
  }

  public final String a(long paramLong1, long paramLong2, int paramInt)
  {
    return e(j("HOME").putExtra("count", paramInt).putExtra("max_id", paramLong2).putExtra("since_id", paramLong1).putExtra("user", f().f()));
  }

  public final String a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt)
  {
    return e(j("GET_LIST_TWEETS").putExtra("user_id", paramLong1).putExtra("list_id", paramLong2).putExtra("since_id", paramLong3).putExtra("max_id", paramLong4).putExtra("count", paramInt));
  }

  public final String a(long paramLong, String paramString)
  {
    Intent localIntent = j("NEW_DM");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("android.intent.extra.TEXT", paramString);
    return e(localIntent);
  }

  public final String a(long paramLong, String paramString1, int paramInt, String paramString2)
  {
    return e(j("EDIT_LIST").putExtra("name", paramString1).putExtra("list_mode", paramInt).putExtra("desc", paramString2).putExtra("owner_id", f().g()).putExtra("list_id", paramLong));
  }

  public final String a(long paramLong, boolean paramBoolean)
  {
    Intent localIntent = j("FOLLOW");
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("device_follow", false);
    return e(localIntent);
  }

  public final String a(j paramj, long paramLong)
  {
    return e(a(paramj, "USER_TIMELINE").putExtra("status_type", 10).putExtra("user_id", paramj.g()).putExtra("status_id", paramLong));
  }

  public final String a(j paramj, long paramLong1, long paramLong2)
  {
    return e(a(paramj, "RELATED_RESULTS").putExtra("status_id", paramLong1).putExtra("q", paramLong2).putExtra("user_id", paramj.g()));
  }

  public final String a(j paramj, long paramLong1, long paramLong2, int paramInt, double paramDouble1, double paramDouble2, String paramString)
  {
    return e(a(paramj, "FETCH_STORIES").putExtra("since_id", 0L).putExtra("max_id", 0L).putExtra("count", 200).putExtra("lat", paramDouble1).putExtra("long", paramDouble2).putExtra("lang", paramString));
  }

  public final String a(j paramj, long paramLong, String paramString)
  {
    return e(a(paramj, "RETWEET").putExtra("status_id", paramLong).putExtra("impression_id", paramString));
  }

  public final String a(j paramj, String paramString1, long paramLong, double paramDouble1, double paramDouble2, String paramString2, be parambe)
  {
    Notification localNotification = a(2131427626, PendingIntent.getActivity(this.r, 0, new Intent(), 0));
    localNotification.flags = (0x22 | localNotification.flags);
    this.s.notify(1001, localNotification);
    return e(a(paramj, "TWEET").putExtra("status_id", paramLong).putExtra("lat", paramDouble1).putExtra("long", paramDouble2).putExtra("impression_id", paramString2).putExtra("android.intent.extra.TEXT", paramString1).putExtra("_data", parambe).putExtra("i_type", r()));
  }

  public final String a(String paramString, int paramInt1, int paramInt2)
  {
    Intent localIntent = j("SEARCH_USERS");
    localIntent.putExtra("q", paramString);
    localIntent.putExtra("page", paramInt1);
    localIntent.putExtra("count", 20);
    localIntent.putExtra("owner_id", f().g());
    return e(localIntent);
  }

  public final String a(String paramString1, int paramInt, String paramString2)
  {
    return e(j("CREATE_LIST").putExtra("name", paramString1).putExtra("list_mode", paramInt).putExtra("desc", paramString2).putExtra("owner_id", f().g()));
  }

  public final String a(String paramString, long paramLong)
  {
    if ((paramLong <= 0L) && (paramString == null))
      return null;
    Intent localIntent = j("GET_USER");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("screen_name", paramString);
    localIntent.putExtra("user_id", paramLong);
    return e(localIntent);
  }

  public final String a(String paramString1, String paramString2)
  {
    j localj = f();
    if (localj.d())
      return a(q(), paramString1, paramString2);
    return a(localj, paramString1, paramString2);
  }

  public final String a(String paramString1, String paramString2, long paramLong1, int paramInt1, long paramLong2, boolean paramBoolean, String paramString3, String paramString4, int paramInt2, String paramString5, String paramString6, int paramInt3)
  {
    Intent localIntent = j("SEARCH_TWEETS");
    localIntent.putExtra("q_name", paramString1);
    localIntent.putExtra("q", paramString2);
    localIntent.putExtra("since_id", paramLong1);
    localIntent.putExtra("count", 100);
    localIntent.putExtra("max_id", paramLong2);
    localIntent.putExtra("show_user", false);
    localIntent.putExtra("geo", paramString3);
    localIntent.putExtra("place", paramString4);
    localIntent.putExtra("page", paramInt2);
    localIntent.putExtra("lang", null);
    localIntent.putExtra("locale", null);
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("q_type", paramInt3);
    return e(localIntent);
  }

  public final String a(String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = j("USERNAME_AVAILABLE").putExtra("screen_name", paramString1).putExtra("name", paramString2).putExtra("email", paramString3);
    Locale localLocale = this.r.getResources().getConfiguration().locale;
    if (localLocale != null)
      localIntent.putExtra("lang", localLocale.getLanguage());
    return e(localIntent);
  }

  public final String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return e(j("UPDATE_PROFILE").putExtra("name", paramString1).putExtra("url", paramString2).putExtra("place", paramString3).putExtra("desc", paramString4));
  }

  public final String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Intent localIntent = j("SIGNUP");
    Locale localLocale = this.r.getResources().getConfiguration().locale;
    localIntent.putExtra("name", paramString1);
    localIntent.putExtra("screen_name", paramString2);
    localIntent.putExtra("email", paramString3);
    localIntent.putExtra("pass", paramString4);
    localIntent.putExtra("q_name", paramString5);
    localIntent.putExtra("q", paramString6);
    if ((localLocale != null) && (!TextUtils.isEmpty(localLocale.getLanguage())))
      localIntent.putExtra("lang", localLocale.getLanguage());
    return e(localIntent);
  }

  public final String a(boolean paramBoolean, int paramInt)
  {
    return e(j("GET_USER_RECOMMENDATIONS").putExtra("connections", true).putExtra("page", paramInt));
  }

  public final String a(boolean paramBoolean, int paramInt1, int paramInt2, long paramLong)
  {
    return e(j("GET_USER_RECOMMENDATIONS").putExtra("connections", false).putExtra("page", 0).putExtra("limit", 6).putExtra("user_id", paramLong).putExtra("user_type", 10));
  }

  public final String a(long[] paramArrayOfLong)
  {
    Intent localIntent = j("DELETE_DMS");
    localIntent.putExtra("message_id", paramArrayOfLong);
    return e(localIntent);
  }

  public final String a(String[] paramArrayOfString1, String[] paramArrayOfString2, long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    return e(j("LOOKUP").putExtra("user_id", paramArrayOfLong).putExtra("list_id", paramLong).putExtra("i_type", paramInt).putExtra("owner_id", f().g()).putExtra("email", paramArrayOfString1).putExtra("phone", paramArrayOfString2));
  }

  public final void a(int paramInt, ar paramar)
  {
    ((dz)this.f.get(paramInt)).a(paramar);
  }

  public final void a(long paramLong, com.twitter.android.service.j paramj)
  {
    ScribeService.a(this.r, new com.twitter.android.service.g(paramLong, paramj, null));
  }

  public final void a(long paramLong, com.twitter.android.service.j paramj, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramInt);
    for (int i1 = 0; i1 < paramInt; i1++)
      localArrayList.add(new com.twitter.android.service.g(paramLong, paramj, null));
    ScribeService.a(this.r, localArrayList);
  }

  public final void a(long paramLong, com.twitter.android.service.j paramj1, com.twitter.android.service.j paramj2)
  {
    ScribeService.a(this.r, new com.twitter.android.service.g(paramLong, paramj1, paramj2));
  }

  public final void a(ac paramac)
  {
    f().a(paramac);
  }

  public final void a(ad paramad)
  {
    f().a(paramad);
  }

  final void a(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("account_name");
    i[] arrayOfi = new i[this.h.size()];
    this.h.toArray(arrayOfi);
    Bundle localBundle1 = paramIntent.getBundleExtra("com.twitter.android._data.home");
    if (localBundle1 != null)
    {
      long l5 = localBundle1.getLong("owner_id", 0L);
      a(str1, l5, false);
      if (l5 == f().g())
      {
        int i31 = localBundle1.getInt("unread", 0);
        int i32 = localBundle1.getInt("new", 0);
        int i33 = arrayOfi.length;
        for (int i34 = 0; i34 < i33; i34++)
          arrayOfi[i34].a(null, null, 200, null, 0L, 0L, i32, i31);
      }
    }
    Bundle localBundle2 = paramIntent.getBundleExtra("com.twitter.android._data.activity");
    if ((localBundle2 != null) && (localBundle2.getLong("owner_id", 0L) == f().g()))
    {
      int i28 = localBundle2.getInt("new", 0);
      int i29 = arrayOfi.length;
      for (int i30 = 0; i30 < i29; i30++)
        arrayOfi[i30].a(null, null, 200, null, 0, 0L, 0L, i28);
    }
    Bundle localBundle3 = paramIntent.getBundleExtra("com.twitter.android._data.mentions");
    if (localBundle3 != null)
    {
      long l4 = localBundle3.getLong("owner_id", 0L);
      a(str1, l4, false);
      if (l4 == f().g())
      {
        int i24 = localBundle3.getInt("unread", 0);
        int i25 = localBundle3.getInt("new", 0);
        int i26 = arrayOfi.length;
        for (int i27 = 0; i27 < i26; i27++)
          arrayOfi[i27].b(null, null, 200, null, 0L, 0L, i25, i24);
      }
    }
    Bundle localBundle4 = paramIntent.getBundleExtra("com.twitter.android._data.dms");
    if ((localBundle4 != null) && (localBundle4.getLong("owner_id", 0L) == f().g()))
    {
      int i20 = localBundle4.getInt("unread", 0);
      int i21 = localBundle4.getInt("new", 0);
      int i22 = arrayOfi.length;
      for (int i23 = 0; i23 < i22; i23++)
        arrayOfi[i23].a(null, null, 200, null, i21, i20);
    }
    Bundle localBundle5 = paramIntent.getBundleExtra("com.twitter.android._data.discover");
    if ((localBundle5 != null) && (localBundle5.getLong("owner_id", 0L) == f().g()))
    {
      int i17 = localBundle5.getInt("unread", 0);
      int i18 = arrayOfi.length;
      for (int i19 = 0; i19 < i18; i19++)
        arrayOfi[i19].a(null, null, 200, null, i17, true);
    }
    Account localAccount = com.twitter.android.platform.d.a(this.r, str1);
    if (localAccount != null)
      if ((ContentResolver.getIsSyncable(localAccount, "com.twitter.android.provider.TwitterProvider") <= 0) || (!ContentResolver.getSyncAutomatically(localAccount, "com.twitter.android.provider.TwitterProvider")))
        break label619;
    int i2;
    String str2;
    int i3;
    label619: for (int i1 = 1; ; i1 = 0)
    {
      if ((i1 != 0) && (paramIntent.getBooleanExtra("show_notif", true)))
      {
        Account[] arrayOfAccount = AccountManager.get(this.r).getAccountsByType("com.twitter.android.auth.login");
        if ((arrayOfAccount != null) && (arrayOfAccount.length > 0))
        {
          i2 = arrayOfAccount.length;
          str2 = paramIntent.getStringExtra("account_name");
          i3 = paramIntent.getIntExtra("unread_count_types", 0);
          if ((!TextUtils.isEmpty(str2)) && (i3 != 0))
            break;
        }
      }
      return;
    }
    Context localContext = this.r;
    int i4 = k(str2);
    int i5;
    label656: int i6;
    label673: int i7;
    label690: int i8;
    Bundle localBundle8;
    Bundle localBundle6;
    int i9;
    if (((i4 & 0x1) != 0) && ((i3 & 0x1) != 0))
    {
      i5 = 1;
      if (((i4 & 0x2) == 0) || ((i3 & 0x2) == 0))
        break label1410;
      i6 = 1;
      if (((i4 & 0x4) == 0) || ((i3 & 0x4) == 0))
        break label1416;
      i7 = 1;
      i8 = 0;
      if (i5 != 0)
        i8 = 0 + 2;
      if (i6 == 0)
        break label1932;
      localBundle8 = paramIntent.getBundleExtra("com.twitter.android._data.mentions");
      if (localBundle8 == null)
        break label1422;
      int i16 = i8 + localBundle8.getInt("unread");
      localBundle6 = localBundle8;
      i9 = i16;
    }
    while (true)
    {
      label743: Bundle localBundle7 = null;
      label778: Resources localResources;
      String str3;
      label800: Intent localIntent1;
      label885: Object localObject1;
      label912: label953: Object localObject2;
      label1029: String str5;
      int i12;
      label1132: int i14;
      label1179: int i13;
      Object localObject4;
      label1191: Object localObject3;
      int i10;
      if (i7 != 0)
      {
        localBundle7 = paramIntent.getBundleExtra("com.twitter.android._data.dms");
        if (localBundle7 != null)
          i9 += localBundle7.getInt("unread");
      }
      else
      {
        if (i9 == 0)
          break label1443;
        localResources = localContext.getResources();
        if (i2 <= 1)
          break label1445;
        str3 = str2;
        if (i9 <= 1)
          break label1535;
        StringBuilder localStringBuilder = new StringBuilder();
        if (i7 == 0)
          break label1457;
        localStringBuilder.append(localResources.getString(2131427630));
        localIntent1 = new Intent(localContext, MessagesActivity.class).putExtra("owner_id", paramIntent.getLongExtra("owner_id", 0L)).putExtra("account_name", str2).putExtra("ref_event", com.twitter.android.service.j.T).setFlags(335544320);
        if (i6 != 0)
        {
          if (localStringBuilder.length() <= 0)
            break label1491;
          localStringBuilder.append(localResources.getString(2131427638));
          localStringBuilder.append(localResources.getString(2131427629));
        }
        if (i5 != 0)
        {
          if (localStringBuilder.length() <= 0)
            break label1513;
          localStringBuilder.append(localResources.getString(2131427638));
          localStringBuilder.append(localResources.getString(2131427628));
        }
        localIntent1.setAction("com.twitter.android.home." + str2);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localStringBuilder.toString();
        String str4 = localResources.getString(2131427627, arrayOfObject1);
        localObject1 = localIntent1;
        localObject2 = str4;
        Cursor localCursor = localContext.getContentResolver().query(Uri.withAppendedPath(av.a, str2), new String[] { "vibrate", "ringtone", "light" }, null, null, null);
        str5 = "";
        if (localCursor == null)
          break label1919;
        boolean bool1 = localCursor.moveToFirst();
        i12 = 0;
        if (!bool1)
          break label1901;
        boolean bool2 = localCursor.isNull(0);
        i12 = 0;
        if (!bool2)
        {
          if (localCursor.getInt(0) != 1)
            break label1889;
          i12 = 1;
        }
        if (!localCursor.isNull(1))
          str5 = localCursor.getString(1);
        if (localCursor.isNull(2))
          break label1901;
        if (localCursor.getInt(2) != 1)
          break label1895;
        i14 = 1;
        String str7 = str5;
        i13 = i12;
        localObject4 = str7;
        localCursor.close();
        localObject3 = localObject4;
        i10 = i14;
      }
      for (int i11 = i13; ; i11 = 0)
      {
        long l1 = System.currentTimeMillis();
        Notification localNotification = new Notification(2130837754, (java.lang.CharSequence)localObject2, l1);
        localNotification.number = 0;
        if (i11 != 0)
          localNotification.defaults = (0x2 | localNotification.defaults);
        if (i10 != 0)
        {
          localNotification.ledARGB = localResources.getColor(2131361806);
          localNotification.ledOnMS = 500;
          localNotification.ledOffMS = 2000;
          localNotification.flags = (0x1 | localNotification.flags);
        }
        localNotification.flags = (0x10 | localNotification.flags);
        localNotification.setLatestEventInfo(localContext, str3, (java.lang.CharSequence)localObject2, PendingIntent.getActivity(localContext, 0, (Intent)localObject1, 268435456));
        if ((((TelephonyManager)localContext.getSystemService("phone")).getCallState() == 0) && (localObject3 != null) && (((String)localObject3).length() > 0))
        {
          localNotification.audioStreamType = 5;
          localNotification.sound = Uri.parse((String)localObject3);
        }
        ((NotificationManager)localContext.getSystemService("notification")).notify(paramIntent.getIntExtra("notif_id", 0), localNotification);
        return;
        i5 = 0;
        break label656;
        label1410: i6 = 0;
        break label673;
        label1416: i7 = 0;
        break label690;
        label1422: int i15 = i8 + 1;
        localBundle6 = localBundle8;
        i9 = i15;
        break label743;
        i9++;
        break label778;
        label1443: break;
        label1445: str3 = localResources.getString(2131427343);
        break label800;
        label1457: localIntent1 = new Intent(localContext, HomeTabActivity.class).putExtra("account_name", str2).putExtra("ref_event", com.twitter.android.service.j.T);
        break label885;
        label1491: localIntent1.putExtra("tab", "connect").putExtra("home_item", 1);
        break label912;
        label1513: localIntent1.putExtra("tab", "home").putExtra("home_item", 0);
        break label953;
        label1535: if (localBundle6 != null)
        {
          String str10 = localBundle6.getString("sender");
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = str10;
          arrayOfObject3[1] = localBundle6.getString("sample");
          String str11 = localResources.getString(2131427606, arrayOfObject3);
          localObject1 = new Intent(localContext, TweetActivity.class).setData(aa.a(localBundle6.getLong("status_id"), localBundle6.getLong("owner_id"))).setAction("com.twitter.android.home.mentions." + str2).setFlags(335544320).putExtra("account_name", str2).putExtra("ref_event", com.twitter.android.service.j.T);
          localObject2 = str11;
          break label1029;
        }
        if (localBundle7 == null)
          break;
        long l2 = localBundle7.getLong("owner_id");
        long l3 = localBundle7.getLong("sender_id");
        String str8 = localBundle7.getString("sender");
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = str8;
        arrayOfObject2[1] = localBundle7.getString("sample");
        String str9 = localResources.getString(2131427607, arrayOfObject2);
        Intent localIntent3;
        if ((l2 > 0L) && (l3 > 0L))
          localIntent3 = new Intent(localContext, MessagesThreadActivity.class);
        for (Intent localIntent2 = localIntent3.putExtra("owner_id", l2).putExtra("user_id", l3).putExtra("user_name", str8); ; localIntent2 = new Intent(localContext, MessagesActivity.class).putExtra("owner_id", l2).putExtra("account_name", str2))
        {
          localIntent2.setAction("com.twitter.android.home.messages." + str2).setFlags(335544320).putExtra("ref_event", com.twitter.android.service.j.T);
          localObject2 = str9;
          localObject1 = localIntent2;
          break;
        }
        label1889: i12 = 0;
        break label1132;
        label1895: i14 = 0;
        break label1179;
        label1901: String str6 = str5;
        i13 = i12;
        localObject4 = str6;
        i14 = 0;
        break label1191;
        label1919: localObject3 = str5;
        i10 = 0;
      }
      label1932: i9 = i8;
      localBundle6 = null;
    }
  }

  public final void a(bb parambb, HashMap paramHashMap)
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).a(paramHashMap);
  }

  public final void a(i parami)
  {
    if (this.h.contains(parami))
      return;
    this.h.add(parami);
  }

  public final void a(j paramj)
  {
    this.o = paramj.c();
    f.a(this.r, paramj.e(), paramj.g());
    i[] arrayOfi = new i[this.h.size()];
    this.h.toArray(arrayOfi);
    int i1 = arrayOfi.length;
    for (int i2 = 0; i2 < i1; i2++)
      arrayOfi[i2].a(paramj);
  }

  public final void a(j paramj, String paramString, long paramLong1, long paramLong2, be parambe)
  {
    e(a(paramj, "SAVE_DRAFT").putExtra("android.intent.extra.TEXT", paramString).putExtra("android.intent.extra.UID", paramLong2).putExtra("status_id", paramLong1).putExtra("_data", parambe));
  }

  public final void a(com.twitter.android.service.g paramg)
  {
    ScribeService.a(this.r, paramg);
  }

  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      a(a(paramString, null));
  }

  public final void a(String paramString, int paramInt)
  {
    this.p.put(paramString, Integer.valueOf(0x7 | k(paramString)));
  }

  public final void a(String paramString, long paramLong, boolean paramBoolean)
  {
    if (paramLong > 0L)
      synchronized (this.j)
      {
        h localh1 = (h)this.j.get(Long.valueOf(paramLong));
        if (localh1 == null)
        {
          h localh2 = new h(this.r, (dz)this.f.get(1), paramString, paramLong);
          this.j.put(Long.valueOf(paramLong), localh2);
          localh2.b();
          return;
        }
        localh1.b(paramBoolean);
        return;
      }
  }

  public final boolean a()
  {
    return this.a;
  }

  public final ad b()
  {
    return f().f();
  }

  public final Bitmap b(long paramLong, String paramString)
  {
    return a(1, paramLong, paramString);
  }

  public final be b(ax paramax)
  {
    return a(paramax.B, paramax.s, paramax.x);
  }

  public final j b(String paramString)
  {
    return a(paramString, null);
  }

  public final String b(int paramInt, long paramLong1, long paramLong2)
  {
    Intent localIntent = j("REMOVE_LIST_USER");
    localIntent.putExtra("user_type", paramInt);
    localIntent.putExtra("list_id", paramLong1);
    localIntent.putExtra("user_id", paramLong2);
    localIntent.putExtra("owner_id", f().g());
    return e(localIntent);
  }

  public final String b(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    return e(j("ACTIVITY").putExtra("owner_id", f().g()).putExtra("i_type", paramInt1).putExtra("count", paramInt2).putExtra("max_id", paramLong2).putExtra("since_id", paramLong1));
  }

  public final String b(long paramLong)
  {
    Intent localIntent = j("DESTROY_DM");
    localIntent.putExtra("message_id", paramLong);
    return e(localIntent);
  }

  public final String b(long paramLong, int paramInt1, int paramInt2)
  {
    Intent localIntent = j("GET_LISTS");
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("list_type", paramInt1);
    localIntent.putExtra("page", paramInt2);
    return e(localIntent);
  }

  public final String b(long paramLong1, long paramLong2, int paramInt)
  {
    return e(j("GET_MESSAGES").putExtra("user_id", f().g()).putExtra("since_id", 0L).putExtra("max_id", 0L).putExtra("count", 0));
  }

  public final String b(j paramj)
  {
    if (paramj.b() != e.c)
      return null;
    paramj.a(e.d);
    return e(a(paramj, "LOGOUT"));
  }

  public final String b(j paramj, long paramLong)
  {
    return e(a(paramj, "DESTROY_STATUS").putExtra("status_id", paramLong));
  }

  public final String b(j paramj, long paramLong, String paramString)
  {
    return e(a(paramj, "CREATE_FAV").putExtra("status_id", paramLong).putExtra("impression_id", paramString));
  }

  public final String b(String paramString1, String paramString2)
  {
    Intent localIntent = j("NEW_DM");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("screen_name", paramString1);
    localIntent.putExtra("android.intent.extra.TEXT", paramString2);
    return e(localIntent);
  }

  public final String b(boolean paramBoolean)
  {
    Intent localIntent = j("UPDATE_SETTINGS");
    localIntent.putExtra("geo", true);
    return e(localIntent);
  }

  public final String b(long[] paramArrayOfLong)
  {
    return e(j("ACTION_MARK_STORIES").putExtra("q", paramArrayOfLong));
  }

  public final void b(int paramInt)
  {
    synchronized (this.j)
    {
      Iterator localIterator = this.j.values().iterator();
      if (localIterator.hasNext())
        ((h)localIterator.next()).c(paramInt);
    }
  }

  public final void b(int paramInt, ar paramar)
  {
    ((dz)this.f.get(paramInt)).b(paramar);
  }

  public final void b(Context paramContext)
  {
    AccountManager localAccountManager;
    Account[] arrayOfAccount;
    int i1;
    if (!this.q)
    {
      localAccountManager = AccountManager.get(paramContext);
      arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
      i1 = arrayOfAccount.length;
    }
    for (int i2 = 0; ; i2++)
      if (i2 < i1)
      {
        String str = localAccountManager.getUserData(arrayOfAccount[i2], "account_user_info");
        if (str == null)
          continue;
        try
        {
          ad localad = do.c(str);
          if (localad != null)
            synchronized (this.j)
            {
              if ((h)this.j.get(Long.valueOf(localad.a)) == null)
              {
                h localh = new h(this.r, (dz)this.f.get(1), localad.g, localad.a);
                this.j.put(Long.valueOf(localad.a), localh);
                localh.b();
              }
            }
        }
        catch (JSONException localJSONException)
        {
          continue;
          this.q = true;
          return;
        }
        catch (IOException localIOException)
        {
        }
      }
  }

  final void b(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("sid");
    j localj = (j)this.n.get(str1);
    if (localj == null)
    {
      Log.w("AC", "Expired session. Ignoring response");
      return;
    }
    String str2 = paramIntent.getStringExtra("rid");
    int i1 = paramIntent.getIntExtra("action_code", 0);
    int i2 = paramIntent.getIntExtra("resp_code", 0);
    Object localObject1 = paramIntent.getStringExtra("reason_phrase");
    i[] arrayOfi = new i[this.h.size()];
    this.h.toArray(arrayOfi);
    this.i.remove(str2);
    label399: int i5;
    switch (i1)
    {
    case 10:
    case 17:
    case 18:
    case 45:
    case 47:
    case 48:
    case 49:
    default:
      if (c)
        Log.d("AC", "Handling unknown action.");
      i5 = i2;
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 29:
    case 28:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 46:
    case 50:
    case 51:
    case 52:
    case 67:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    case 58:
    case 59:
    case 60:
    case 61:
    case 62:
    case 63:
    case 65:
    case 64:
    case 66:
    case 68:
    case 69:
    case 70:
    }
    while (true)
    {
      localj.a((ao)paramIntent.getParcelableExtra("rate_limit"));
      if (i5 != 401)
        break;
      switch (i1)
      {
      case 5:
      case 10:
      case 21:
      case 42:
      case 43:
      case 44:
      case 55:
      }
      e(j("VERIFY"));
      return;
      Context localContext3 = this.r;
      String str13 = localj.e();
      long l33 = localj.g();
      boolean bool;
      if (AccountManager.get(localContext3).getAccountsByType("com.twitter.android.auth.login").length == 0)
        bool = true;
      while (true)
      {
        if (str1.equals(this.o))
        {
          f.a(this.r, null, 0L);
          this.o = null;
        }
        i(str13);
        int i141;
        int i142;
        synchronized (this.j)
        {
          h localh2 = (h)this.j.get(Long.valueOf(l33));
          if (localh2 != null)
            localh2.a(bool);
          localj.a();
          if (!bool)
            break label879;
          this.i.clear();
          i141 = this.f.size();
          i142 = 0;
          while (i141 < 5)
          {
            ((dz)i142.valueAt(0L)).a();
            i142++;
            tmpTernaryOp = this.f;
            continue;
            bool = false;
            tmpTernaryOp = 0L;
          }
        }
      }
      this.e.a();
      AlarmManager localAlarmManager = (AlarmManager)localContext3.getSystemService("alarm");
      Intent localIntent1 = new Intent(localContext3, AppService.class);
      0.0F.setAction("com.twitter.android.cleanup");
      localContext3.cancel(PendingIntent.getService(0, localIntent1, 0.0F, 0));
      Intent localIntent2 = new Intent(localContext3, AppService.class);
      2.0F.setAction("com.twitter.android.poll.alarm");
      localContext3.cancel(PendingIntent.getService(0, localIntent2, 2.0F, 0));
      PreferenceManager.getDefaultSharedPreferences(localContext3).unregisterOnSharedPreferenceChangeListener(this.t);
      while (true)
      {
        int i139 = arrayOfi.length;
        int i140 = 0;
        while (true)
          if (i139 < 1)
          {
            i140[2].a(localj, str2, i2, (String)localObject1, bool);
            i140++;
            tmpTernaryOp = arrayOfi;
            continue;
            localHashMap2 = this.n;
            try
            {
              this.n.remove(str1);
              tmpTernaryOp = localHashMap2;
              break;
            }
            finally
            {
            }
          }
      }
      if (bool)
        this.h.clear();
      localContext4 = this.r;
      Handler tmp946_943 = new android/os/Handler;
      localContext4.<init>(3.getMainLooper());
      b tmp960_957 = new com/twitter/android/client/b;
      super(localContext4, 3, str13, l33);
      tmp960_957.postDelayed(tmp960_957, 300000L);
      i5 = i2;
      tmpTernaryOp = tmp946_943;
      continue;
      switch (paramIntent.getIntExtra("status_type", 0))
      {
      case 2:
      case 4:
      case 9:
      default:
        i5 = i2;
        tmpTernaryOp = tmp946_943;
        break;
      case 1:
        l32 = paramIntent.getLongExtra("user_id", 0L);
        i136 = paramIntent.getIntExtra("new_tweet", 0);
        i137 = arrayOfi.length;
        i138 = 0;
        arrayOfi[i138].a(localj, str2, i2, (String)localObject1, l32, i136);
        i5 = i2;
        tmpTernaryOp = 3;
        break;
      case 3:
        i134 = arrayOfi.length;
        i135 = 0;
        arrayOfi[i135].k(localj, str2, i2, (String)localObject1);
        i5 = i2;
        tmpTernaryOp = localObject3;
        break;
      case 5:
        i130 = paramIntent.getIntExtra("new_tweet", 0);
        i131 = paramIntent.getIntExtra("unread_mention", 0);
        l30 = paramIntent.getLongExtra("since_id", 0L);
        l31 = paramIntent.getLongExtra("max_id", 0L);
        i132 = arrayOfi.length;
        i133 = 0;
        arrayOfi[i133].b(localj, str2, i2, (String)localObject1, l30, l31, i130, i131);
        i5 = i2;
        tmpTernaryOp = localHashMap2;
        break;
      case 6:
        i128 = arrayOfi.length;
        i129 = 0;
        arrayOfi[i129].l(localj, str2, i2, (String)localObject1);
        i5 = i2;
        tmpTernaryOp = -1;
        break;
      case 7:
        i126 = arrayOfi.length;
        i127 = 0;
        arrayOfi[i127].m(localj, str2, i2, (String)localObject1);
        i5 = i2;
        tmpTernaryOp = localHashMap2;
        break;
      case 8:
        i123 = paramIntent.getIntExtra("new_tweet", 0);
        i124 = arrayOfi.length;
        i125 = 0;
        arrayOfi[i125].e(localj, str2, i2, (String)localObject1, i123);
        i5 = i2;
        tmpTernaryOp = null;
      case 10:
      }
      while (true)
      {
        Context localContext4;
        long l32;
        int i136;
        int i137;
        int i138;
        int i134;
        int i135;
        int i130;
        int i131;
        long l30;
        long l31;
        int i132;
        int i133;
        int i128;
        int i129;
        int i126;
        int i127;
        int i123;
        int i124;
        int i125;
        break;
        long l29 = paramIntent.getLongExtra("status_id", 0L);
        int i121 = arrayOfi.length;
        int i122 = 0;
        while (i122 < i121)
        {
          arrayOfi[i122].d(localj, str2, i2, (String)localObject1, l29);
          tmpTernaryOp = (???++);
        }
      }
      long l28 = paramIntent.getLongExtra("status_id", 0L);
      int i119 = arrayOfi.length;
      int i120 = 0;
      arrayOfi[i120].a(localj, str2, i2, (String)localObject1, l28);
      i5 = i2;
      tmpTernaryOp = 2;
      continue;
      long l27 = paramIntent.getLongExtra("status_id", 0L);
      int i117 = arrayOfi.length;
      int i118 = 0;
      arrayOfi[i118].b(localj, str2, i2, (String)localObject1, l27);
      i5 = i2;
      tmpTernaryOp = i140;
      HashMap localHashMap2;
      continue;
      long l26 = paramIntent.getLongExtra("user_id", 0L);
      int i115 = arrayOfi.length;
      int i116 = 0;
      arrayOfi[i116].i(localj, str2, i2, (String)localObject1, l26);
      i5 = i2;
      tmpTernaryOp = 2;
      continue;
      long l25 = paramIntent.getLongExtra("user_id", 0L);
      int i112 = paramIntent.getIntExtra("list_type", 0);
      int i113 = arrayOfi.length;
      int i114 = 0;
      arrayOfi[i114].b(localj, str2, i2, (String)localObject1, l25, i112);
      i5 = i2;
      tmpTernaryOp = 1;
      continue;
      long l24 = paramIntent.getLongExtra("user_id", 0L);
      int i108 = paramIntent.getIntExtra("user_type", 0);
      int i109 = paramIntent.getIntExtra("count", 0);
      int i110 = arrayOfi.length;
      int i111 = 0;
      arrayOfi[i111].b(localj, str2, i2, (String)localObject1, l24, i108, i109);
      i5 = i2;
      tmpTernaryOp = 1L;
      continue;
      int i105 = paramIntent.getIntExtra("count", 0);
      int i106 = arrayOfi.length;
      int i107 = 0;
      arrayOfi[i107].a(localj, str2, i2, (String)localObject1, i105);
      i5 = i2;
      tmpTernaryOp = localAlarmManager;
      continue;
      a(0L, 0L, -2);
      int i103 = arrayOfi.length;
      int i104 = 0;
      arrayOfi[i104].d(localj, str2, i2, (String)localObject1);
      i5 = i2;
      tmpTernaryOp = localIntent2;
      continue;
      int i101 = arrayOfi.length;
      int i102 = 0;
      arrayOfi[i102].e(localj, str2, i2, (String)localObject1);
      i5 = i2;
      tmpTernaryOp = 2.0F;
      label879: continue;
      int i97 = paramIntent.getIntExtra("new_dm", 0);
      int i98 = paramIntent.getIntExtra("unread_dm", 0);
      int i99 = arrayOfi.length;
      int i100 = 0;
      arrayOfi[i100].a(localj, str2, i2, (String)localObject1, i97, i98);
      i5 = i2;
      tmpTernaryOp = 1L;
      continue;
      ad localad3 = (ad)paramIntent.getParcelableExtra("user");
      int i95 = arrayOfi.length;
      int i96 = 0;
      arrayOfi[i96].b(localj, str2, i2, (String)localObject1, localad3);
      i5 = i2;
      tmpTernaryOp = localAlarmManager;
      continue;
      int i93 = arrayOfi.length;
      int i94 = 0;
      arrayOfi[i94].g(localj, str2, i2, (String)localObject1);
      i5 = i2;
      tmpTernaryOp = localIntent1;
      continue;
      paramIntent.getStringExtra("url");
      paramIntent.getStringExtra("short_url");
      i5 = i2;
      tmpTernaryOp = 0.0F;
      continue;
      long l23 = paramIntent.getLongExtra("user_id", 0L);
      int i91 = arrayOfi.length;
      int i92 = 0;
      arrayOfi[i92].e(localj, str2, i2, (String)localObject1, l23);
      i5 = i2;
      tmpTernaryOp = 1L;
      continue;
      ad localad2 = (ad)paramIntent.getParcelableExtra("user");
      int i89 = arrayOfi.length;
      int i90 = 0;
      arrayOfi[i90].a(localj, str2, i2, (String)localObject1, localad2);
      i5 = i2;
      tmpTernaryOp = i142;
      continue;
      a(localj.e(), localj.g(), false);
      this.s.cancel(1001);
      int i87 = arrayOfi.length;
      int i88 = 0;
      arrayOfi[i88].j(localj, str2, i2, (String)localObject1);
      Context localContext2 = this.r;
      Notification localNotification = a(2131427541, PendingIntent.getActivity(localContext2, 0, new Intent(localContext2, DraftsActivity.class).putExtra("account_name", localj.e()).putExtra("return_to_drafts", true), 0));
      localNotification.flags = (0x10 | localNotification.flags);
      this.s.notify(1002, localNotification);
      i5 = i2;
      tmpTernaryOp = 5;
      continue;
      if (i2 == 200)
        a(localj.e(), localj.g(), true);
      int i85 = arrayOfi.length;
      for (int i86 = 0; i86 < i85; i86++)
        arrayOfi[i86].c(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      long l22 = paramIntent.getLongExtra("status_id", 0L);
      if (i2 == 200)
      {
        h localh1 = k(localj.g());
        if (localh1 != null)
          localh1.a(l22);
      }
      int i83 = arrayOfi.length;
      for (int i84 = 0; i84 < i83; i84++)
        arrayOfi[i84].c(localj, str2, i2, (String)localObject1, l22);
      i5 = i2;
      continue;
      long l21 = paramIntent.getLongExtra("user_id", 0L);
      if (i2 != 200)
        Toast.makeText(this.r, 2131427416, 1).show();
      int i81 = arrayOfi.length;
      for (int i82 = 0; i82 < i81; i82++)
        arrayOfi[i82].g(localj, str2, i2, (String)localObject1, l21);
      i5 = i2;
      continue;
      long l20 = paramIntent.getLongExtra("user_id", 0L);
      int i79 = arrayOfi.length;
      for (int i80 = 0; i80 < i79; i80++)
        arrayOfi[i80].h(localj, str2, i2, (String)localObject1, l20);
      i5 = i2;
      continue;
      long l19 = paramIntent.getLongExtra("user_id", 0L);
      if (i2 != 200)
        Toast.makeText(this.r, 2131427418, 1).show();
      int i77 = arrayOfi.length;
      for (int i78 = 0; i78 < i77; i78++)
        arrayOfi[i78].f(localj, str2, i2, (String)localObject1, l19);
      i5 = i2;
      continue;
      if (i2 == 200)
        break label399;
      Toast.makeText(this.r, 2131427453, 1).show();
      i5 = i2;
      continue;
      if (i2 == 200)
        break label399;
      Toast.makeText(this.r, 2131427454, 1).show();
      i5 = i2;
      continue;
      if (i2 == 200)
        break label399;
      Toast.makeText(this.r, 2131427436, 1).show();
      i5 = i2;
      continue;
      long l18 = paramIntent.getLongExtra("list_id", 0L);
      int i75 = arrayOfi.length;
      for (int i76 = 0; i76 < i75; i76++)
        arrayOfi[i76].j(localj, str2, i2, (String)localObject1, l18);
      i5 = i2;
      continue;
      long l17 = paramIntent.getLongExtra("list_id", 0L);
      int i71 = paramIntent.getIntExtra("user_type", 0);
      int i72 = paramIntent.getIntExtra("count", 0);
      int i73 = arrayOfi.length;
      for (int i74 = 0; i74 < i73; i74++)
        arrayOfi[i74].c(localj, str2, i2, (String)localObject1, l17, i71, i72);
      i5 = i2;
      continue;
      long l15 = paramIntent.getLongExtra("list_id", 0L);
      int i68 = paramIntent.getIntExtra("user_type", 0);
      long l16 = paramIntent.getLongExtra("user_id", 0L);
      int i69 = arrayOfi.length;
      for (int i70 = 0; i70 < i69; i70++)
        arrayOfi[i70].a(localj, str2, i2, (String)localObject1, i68, l15, l16);
      i5 = i2;
      continue;
      long l13 = paramIntent.getLongExtra("list_id", 0L);
      int i65 = paramIntent.getIntExtra("user_type", 0);
      long l14 = paramIntent.getLongExtra("user_id", 0L);
      int i66 = arrayOfi.length;
      for (int i67 = 0; i67 < i66; i67++)
        arrayOfi[i67].b(localj, str2, i2, (String)localObject1, i65, l13, l14);
      i5 = i2;
      continue;
      long l11 = paramIntent.getLongExtra("list_id", 0L);
      int i62 = paramIntent.getIntExtra("user_type", 0);
      long l12 = paramIntent.getLongExtra("user_id", 0L);
      int i63 = arrayOfi.length;
      for (int i64 = 0; i64 < i63; i64++)
        arrayOfi[i64].c(localj, str2, i2, (String)localObject1, i62, l11, l12);
      i5 = i2;
      continue;
      int i59 = paramIntent.getIntExtra("q_type", 0);
      int i60 = arrayOfi.length;
      for (int i61 = 0; i61 < i60; i61++)
        arrayOfi[i61].c(localj, str2, i2, (String)localObject1, i59);
      i5 = i2;
      continue;
      long l10 = paramIntent.getLongExtra("search_id", 0L);
      int i56 = paramIntent.getIntExtra("page", 0);
      int i57 = arrayOfi.length;
      for (int i58 = 0; i58 < i57; i58++)
        arrayOfi[i58].e(localj, str2, i2, (String)localObject1, l10, i56);
      i5 = i2;
      continue;
      long l9 = paramIntent.getLongExtra("search_id", 0L);
      int i53 = paramIntent.getIntExtra("count", 0);
      int i54 = arrayOfi.length;
      for (int i55 = 0; i55 < i54; i55++)
        arrayOfi[i55].c(localj, str2, i2, (String)localObject1, l9, i53);
      i5 = i2;
      continue;
      ad localad1 = (ad)paramIntent.getParcelableExtra("user");
      int i51 = arrayOfi.length;
      for (int i52 = 0; i52 < i51; i52++)
        arrayOfi[i52].c(localj, str2, i2, (String)localObject1, localad1);
      i5 = i2;
      continue;
      double d1 = paramIntent.getDoubleExtra("lat", 0.0D);
      double d2 = paramIntent.getDoubleExtra("long", 0.0D);
      String str12 = paramIntent.getStringExtra("place");
      int i49 = arrayOfi.length;
      for (int i50 = 0; i50 < i49; i50++)
        arrayOfi[i50].a(localj, str2, i2, (String)localObject1, d1, d2, str12);
      i5 = i2;
      continue;
      if (i2 != 401)
        break label399;
      Log.i("AC", "Invalid credentials. The auth token has expired.");
      Context localContext1 = this.r;
      AccountManager localAccountManager = AccountManager.get(localContext1);
      Account localAccount = com.twitter.android.platform.d.a(localContext1, localj.e());
      if (localAccount == null)
        break;
      localAccountManager.setPassword(localAccount, null);
      localAccountManager.invalidateAuthToken("com.twitter.android.auth.login", null);
      localAccountManager.getAuthToken(localAccount, "com.twitter.android.oauth.token", true, null, null);
      i5 = i2;
      continue;
      try
      {
        String str11 = a(localj, paramIntent, i2);
        str10 = str11;
        int i47 = arrayOfi.length;
        for (int i48 = 0; i48 < i47; i48++)
          arrayOfi[i48].a(localj, str2, i2, (String)localObject1, str10);
      }
      catch (Exception localException2)
      {
        while (true)
        {
          String str9 = localException2.getMessage();
          i2 = 400;
          localObject1 = str9;
          String str10 = null;
        }
        i5 = i2;
      }
      continue;
      int i43 = paramIntent.getIntExtra("new_tweet", 0);
      int i44 = paramIntent.getIntExtra("unread_tweet", 0);
      long l7 = paramIntent.getLongExtra("since_id", 0L);
      long l8 = paramIntent.getLongExtra("max_id", 0L);
      if ((i2 == 200) && (l8 == 0L) && (i43 > 0))
        a(localj.e(), localj.g(), false);
      int i45 = arrayOfi.length;
      for (int i46 = 0; i46 < i45; i46++)
        arrayOfi[i46].a(localj, str2, i2, (String)localObject1, l7, l8, i43, i44);
      i5 = i2;
      continue;
      int i41 = arrayOfi.length;
      for (int i42 = 0; i42 < i41; i42++)
        arrayOfi[i42].i(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      int i38 = paramIntent.getIntExtra("count", 0);
      int i39 = arrayOfi.length;
      for (int i40 = 0; i40 < i39; i40++)
        arrayOfi[i40].d(localj, str2, i2, (String)localObject1, i38);
      i5 = i2;
      continue;
      paramIntent.getIntExtra("count", 0);
      i5 = i2;
      continue;
      long l6 = paramIntent.getLongExtra("user_id", 0L);
      int i34 = paramIntent.getIntExtra("user_type", 9);
      int i35 = paramIntent.getIntExtra("count", 0);
      int i36 = arrayOfi.length;
      for (int i37 = 0; i37 < i36; i37++)
        arrayOfi[i37].a(localj, str2, i2, (String)localObject1, l6, i34, i35);
      i5 = i2;
      continue;
      long l4 = paramIntent.getLongExtra("owner_id", 0L);
      long l5 = paramIntent.getLongExtra("list_id", 0L);
      int i32 = arrayOfi.length;
      for (int i33 = 0; i33 < i32; i33++)
        arrayOfi[i33].a(localj, str2, i2, (String)localObject1, l4, l5);
      i5 = i2;
      continue;
      int i29 = paramIntent.getIntExtra("count", 0);
      int i30 = arrayOfi.length;
      for (int i31 = 0; i31 < i30; i31++)
        arrayOfi[i31].b(localj, str2, i2, (String)localObject1, i29);
      i5 = i2;
      continue;
      String str3 = paramIntent.getStringExtra("name");
      String str4 = paramIntent.getStringExtra("screen_name");
      String str5 = paramIntent.getStringExtra("email");
      String str6 = paramIntent.getStringExtra("pass");
      String str7 = paramIntent.getStringExtra("q_name");
      String str8 = paramIntent.getStringExtra("q");
      try
      {
        a(localj, paramIntent, i2);
        int i27 = arrayOfi.length;
        for (int i28 = 0; i28 < i27; i28++)
          arrayOfi[i28].a(localj, str2, i2, str3, str4, str5, str6, str7, str8);
      }
      catch (Exception localException1)
      {
        while (true)
          i2 = 400;
        i5 = i2;
      }
      continue;
      a(0L, 0L, -2);
      int i25 = arrayOfi.length;
      for (int i26 = 0; i26 < i25; i26++)
        arrayOfi[i26].d(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      this.m = ((dt)paramIntent.getParcelableExtra("settings"));
      i5 = i2;
      continue;
      if (i2 != 200)
        break label399;
      cb localcb = (cb)paramIntent.getParcelableExtra("settings");
      localj.a(localcb);
      com.twitter.android.platform.d.a(this.r, localj.e(), null, localcb);
      i5 = i2;
      continue;
      int i23 = arrayOfi.length;
      for (int i24 = 0; i24 < i23; i24++)
        arrayOfi[i24].f(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      ay localay = (ay)paramIntent.getParcelableExtra("settings");
      if (localay == null)
        break label399;
      ScribeService.a(this.r, localay.a, localay.b);
      i5 = i2;
      continue;
      int i21 = arrayOfi.length;
      for (int i22 = 0; i22 < i21; i22++)
        arrayOfi[i22].a(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      int i19 = arrayOfi.length;
      for (int i20 = 0; i20 < i19; i20++)
        arrayOfi[i20].b(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      int i17 = arrayOfi.length;
      for (int i18 = 0; i18 < i17; i18++)
        arrayOfi[i18].a(localj, str2, i2, (String)localObject1, paramIntent.getIntExtra("unread_stories", 0), false);
      i5 = i2;
      continue;
      int i13 = paramIntent.getIntExtra("i_type", 0);
      long l2 = paramIntent.getLongExtra("since_id", 0L);
      long l3 = paramIntent.getLongExtra("max_id", 0L);
      int i14 = paramIntent.getIntExtra("count", 0);
      int i15 = arrayOfi.length;
      for (int i16 = 0; i16 < i15; i16++)
        arrayOfi[i16].a(localj, str2, i2, (String)localObject1, i13, l2, l3, i14);
      i5 = i2;
      continue;
      long l1 = paramIntent.getLongExtra("status_id", 0L);
      int i10 = paramIntent.getIntExtra("new_tweet", 0);
      int i11 = arrayOfi.length;
      for (int i12 = 0; i12 < i11; i12++)
        arrayOfi[i12].d(localj, str2, i2, (String)localObject1, l1, i10);
      i5 = i2;
      continue;
      int i8 = arrayOfi.length;
      for (int i9 = 0; i9 < i8; i9++)
        arrayOfi[i9].h(localj, str2, i2, (String)localObject1);
      i5 = i2;
      continue;
      ArrayList localArrayList = paramIntent.getStringArrayListExtra("stories");
      int i6 = arrayOfi.length;
      for (int i7 = 0; i7 < i6; i7++)
        arrayOfi[i7].a(localj, str2, i2, (String)localObject1, localArrayList);
      i5 = i2;
      continue;
      dh localdh = (dh)paramIntent.getParcelableExtra("q");
      int i3 = arrayOfi.length;
      for (int i4 = 0; i4 < i3; i4++)
        arrayOfi[i4].a(localj, str2, i2, (String)localObject1, localdh);
      i5 = i2;
    }
  }

  public final void b(i parami)
  {
    this.h.remove(parami);
  }

  public final void b(String paramString, int paramInt)
  {
    this.p.put(paramString, Integer.valueOf(k(paramString) & (paramInt ^ 0xFFFFFFFF)));
  }

  public final int c(String paramString)
  {
    return a(paramString.toLowerCase().startsWith("https")) - paramString.length();
  }

  public final ac c()
  {
    return f().h();
  }

  public final String c(long paramLong)
  {
    Intent localIntent = j("UNFOLLOW");
    localIntent.putExtra("user_id", paramLong);
    localIntent.putExtra("owner_id", f().g());
    return e(localIntent);
  }

  public final String c(long paramLong1, long paramLong2, int paramInt)
  {
    Intent localIntent = j("GET_SENT_MESSAGES");
    localIntent.putExtra("user_id", f().g());
    localIntent.putExtra("since_id", 0L);
    localIntent.putExtra("max_id", 0L);
    localIntent.putExtra("count", 0);
    return e(localIntent);
  }

  public final String c(j paramj, long paramLong, String paramString)
  {
    return e(a(paramj, "DESTROY_FAV").putExtra("status_id", paramLong).putExtra("impression_id", paramString));
  }

  public final String c(String paramString1, String paramString2)
  {
    Intent localIntent = j("GET_LIST");
    localIntent.putExtra("screen_name", paramString1);
    localIntent.putExtra("q", paramString2);
    return e(localIntent);
  }

  public final String c(long[] paramArrayOfLong)
  {
    Intent localIntent = j("FOLLOW_ALL");
    localIntent.putExtra("user_id", paramArrayOfLong);
    localIntent.putExtra("owner_id", f().g());
    return e(localIntent);
  }

  final void c(Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    h localh = k(l1);
    if (localh != null)
    {
      localh.a(paramIntent.getIntExtra("status_type", 0));
      a(l1, com.twitter.android.service.j.W);
    }
  }

  public final void c(j paramj)
  {
    e(a(paramj, "SEND_ALL_DRAFTS").putExtra("i_type", r()));
  }

  public final void c(j paramj, long paramLong)
  {
    e(a(paramj, "DEL_DRAFT").putExtra("status_id", paramLong));
  }

  public final Intent d(String paramString1, String paramString2)
  {
    ad localad = f().f();
    if (localad == null)
      return null;
    Context localContext = this.r;
    Intent localIntent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", localContext.getString(2131427408, new Object[] { paramString2, paramString1 }));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localad.a();
    arrayOfObject[1] = localad.g;
    return Intent.createChooser(localIntent.putExtra("android.intent.extra.SUBJECT", localContext.getString(2131427409, arrayOfObject)), localContext.getString(2131427398));
  }

  public final String d()
  {
    return f().e();
  }

  public final String d(long paramLong)
  {
    Intent localIntent = j("CREATE_BLOCK");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("user_id", paramLong);
    return e(localIntent);
  }

  public final String d(j paramj)
  {
    return e(a(paramj, "GET_SETTINGS"));
  }

  public final String d(String paramString)
  {
    Intent localIntent = j("SAVE_SEARCH");
    localIntent.putExtra("q", paramString);
    return e(localIntent);
  }

  final void d(Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    h localh = k(l1);
    if (localh != null)
    {
      localh.b(paramIntent.getIntExtra("status_type", 0));
      a(l1, com.twitter.android.service.j.W);
    }
  }

  public final long e()
  {
    return f().g();
  }

  public final String e(long paramLong)
  {
    Intent localIntent = j("DESTROY_BLOCK");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("user_id", paramLong);
    return e(localIntent);
  }

  public final String e(String paramString)
  {
    Intent localIntent = j("DELETE_SEARCH");
    localIntent.putExtra("q", paramString);
    return e(localIntent);
  }

  public final j f()
  {
    while (true)
    {
      int i2;
      synchronized (this.n)
      {
        j localj1 = (j)this.n.get(this.o);
        if (localj1 == null)
        {
          Account[] arrayOfAccount = AccountManager.get(this.r).getAccountsByType("com.twitter.android.auth.login");
          if (arrayOfAccount.length > 0)
          {
            String str = f.a(this.r);
            int i1 = arrayOfAccount.length;
            i2 = 0;
            if (i2 < i1)
            {
              Account localAccount = arrayOfAccount[i2];
              if ((str != null) && (!localAccount.name.equals(str)))
                break label139;
              j localj2 = a(localAccount.name, localAccount);
              a(localj2);
              return localj2;
            }
          }
          localj1 = q();
          a(localj1);
        }
        else
        {
          return localj1;
        }
      }
      label139: i2++;
    }
  }

  public final String f(long paramLong)
  {
    Intent localIntent = j("REPORT_SPAM");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("user_id", paramLong);
    return e(localIntent);
  }

  public final String f(String paramString)
  {
    Intent localIntent = j("EMAIL_AVAILABLE").putExtra("email", paramString);
    Locale localLocale = this.r.getResources().getConfiguration().locale;
    if (localLocale != null)
      localIntent.putExtra("lang", localLocale.getLanguage());
    return e(localIntent);
  }

  public final Bitmap g(String paramString)
  {
    return this.e.a(f().g(), paramString);
  }

  public final String g(long paramLong)
  {
    Intent localIntent = j("DELETE_LIST");
    localIntent.putExtra("owner_id", f().g());
    localIntent.putExtra("list_id", paramLong);
    return e(localIntent);
  }

  public final ArrayList g()
  {
    synchronized (this.n)
    {
      ArrayList localArrayList = new ArrayList(this.n.values());
      return localArrayList;
    }
  }

  public final String h(long paramLong)
  {
    return e(j("GET_TRENDS").putExtra("locale", paramLong));
  }

  public final boolean h()
  {
    return f().d();
  }

  public final boolean h(String paramString)
  {
    Iterator localIterator = this.i.values().iterator();
    while (localIterator.hasNext())
      if (((Intent)localIterator.next()).getStringExtra("rid").equals(paramString))
        return true;
    return false;
  }

  public final e i()
  {
    return f().b();
  }

  public final String i(long paramLong)
  {
    Locale localLocale = this.r.getResources().getConfiguration().locale;
    Intent localIntent = j("GET_SLUG");
    if (localLocale != null)
    {
      localIntent.putExtra("locale", localLocale.getCountry());
      localIntent.putExtra("lang", localLocale.getLanguage());
    }
    if (paramLong != 0L)
      localIntent.putExtra("owner_id", paramLong);
    return e(localIntent);
  }

  public final void i(String paramString)
  {
    Context localContext = this.r;
    ((NotificationManager)localContext.getSystemService("notification")).cancel(q.a(localContext).b(paramString));
  }

  public final long j()
  {
    return f().g();
  }

  public final String j(long paramLong)
  {
    return e(j("ACTIVITY_SUMMARY").putExtra("status_id", paramLong));
  }

  public final h k(long paramLong)
  {
    try
    {
      h localh = (h)this.j.get(Long.valueOf(paramLong));
      return localh;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String k()
  {
    return e(j("GET_SAVED_SEARCHES"));
  }

  public final void l()
  {
    c(0);
  }

  public final void m()
  {
    c(5);
  }

  public final void n()
  {
    String str = cr.a(6);
    j localj = f();
    Intent localIntent = new Intent(this.r, TwitterService.class).setAction("ACTION_MARK_STORIES").putExtra("rid", str).putExtra("sid", localj.c()).putExtra("account_name", localj.e()).putExtra("soid", localj.g());
    this.r.startService(localIntent);
  }

  public final void o()
  {
    String str = cr.a(6);
    j localj = f();
    Intent localIntent = new Intent(this.r, TwitterService.class).setAction("MARK_MESSAGES").putExtra("rid", str).putExtra("sid", localj.c()).putExtra("account_name", localj.e()).putExtra("soid", localj.g());
    this.r.startService(localIntent);
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).b(localj);
  }

  public final void p()
  {
    Context localContext = this.r;
    Intent localIntent = new Intent(localContext, UsersActivity.class).putExtra("type", 7).putExtra("follow_all_title", 2131427692).putExtra("follow_all_subtitle", 2131427693).setAction("com.twitter.android.intent.action.FOLLOW").setFlags(335544320);
    String str = localContext.getString(2131427580);
    Notification localNotification = new Notification(2130837754, str, System.currentTimeMillis());
    localNotification.flags = (0x10 | localNotification.flags);
    localNotification.setLatestEventInfo(localContext, str, localContext.getString(2131427581), PendingIntent.getActivity(localContext, 0, localIntent, 0));
    this.s.notify(1000, localNotification);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
