package com.twitter.android.client;

import android.accounts.AccountManager;
import android.app.IntentService;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;
import com.twitter.android.provider.q;
import java.util.ArrayList;
import java.util.HashMap;

public class WidgetService extends IntentService
{
  private static final HashMap a;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("open", Integer.valueOf(1));
    a.put("close", Integer.valueOf(2));
    a.put("refresh", Integer.valueOf(3));
    a.put("clear_logged_out", Integer.valueOf(4));
    a.put("on_update", Integer.valueOf(5));
    a.put("on_delete", Integer.valueOf(6));
  }

  public WidgetService()
  {
    super("WidgetService");
  }

  private static h a(Context paramContext, Intent paramIntent)
  {
    return g.a(paramContext).k(paramIntent.getLongExtra("owner_id", 0L));
  }

  private static ArrayList a(Context paramContext, long paramLong1, int paramInt, long paramLong2)
  {
    String str = String.valueOf(paramLong1);
    Uri.Builder localBuilder;
    if (paramInt == 5)
      localBuilder = ContentUris.withAppendedId(az.g, paramLong1).buildUpon();
    Cursor localCursor;
    ArrayList localArrayList;
    while (true)
    {
      localBuilder.appendQueryParameter("limit", Integer.toString(20)).appendQueryParameter("ownerId", str);
      if (paramLong2 > 0L)
        localBuilder.appendQueryParameter("newer", Long.toString(paramLong2));
      localCursor = paramContext.getContentResolver().query(localBuilder.build(), ax.b, "author_id!=?", new String[] { str }, "updated_at DESC, _id ASC");
      localArrayList = new ArrayList();
      if (localCursor == null)
        break label169;
      try
      {
        if (!localCursor.moveToNext())
          break;
        localArrayList.add(new ax(localCursor));
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    label169: return localArrayList;
  }

  private static void a(Context paramContext, h paramh, long paramLong1, long paramLong2)
  {
    long l = paramh.b;
    paramh.a(0, paramLong1, a(paramContext, l, 0, paramLong1));
    paramh.a(5, paramLong2, a(paramContext, l, 5, paramLong2));
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    Integer localInteger = (Integer)a.get(str1);
    int i;
    if (localInteger == null)
      i = 0;
    switch (i)
    {
    default:
    case 1:
    case 2:
    case 3:
      Context localContext3;
      h localh1;
      do
      {
        Context localContext4;
        h localh2;
        do
        {
          Context localContext5;
          h localh3;
          do
          {
            return;
            i = localInteger.intValue();
            break;
            localContext5 = getApplicationContext();
            localh3 = a(localContext5, paramIntent);
          }
          while (localh3 == null);
          String str3 = localh3.a;
          if (AccountManager.get(localContext5).getAccountsByType("com.twitter.android.auth.login").length < 2)
            q.a(localContext5).a("", str3);
          localh3.a();
          localh3.d(2);
          a(localContext5, localh3, 0L, 0L);
          return;
          localContext4 = getApplicationContext();
          localh2 = a(localContext4, paramIntent);
        }
        while (localh2 == null);
        String str2 = localh2.a;
        q.a(localContext4).a(str2, "");
        int i1 = paramIntent.getIntExtra("widget_state", 1);
        localh2.a();
        localh2.d(i1);
        return;
        localContext3 = getApplicationContext();
        localh1 = a(localContext3, paramIntent);
      }
      while (localh1 == null);
      localh1.a();
      a(localContext3, localh1, paramIntent.getLongExtra("latest_time_tweets", 0L), paramIntent.getLongExtra("latest_time_mentions", 0L));
      return;
    case 4:
      Context localContext2 = getApplicationContext();
      int k = paramIntent.getIntExtra("widget_provider", 2131034114);
      int m;
      if (k == 2131034114)
        m = 2130903130;
      for (int n = 2130903127; ; n = 2130903128)
      {
        f localf = new f(k, m, n, "");
        localf.a(localContext2, localf.a(localContext2));
        h.a(localContext2, localf, 0, "", 0);
        return;
        m = 2130903133;
      }
    case 5:
      Context localContext1 = getApplicationContext();
      int j = paramIntent.getIntExtra("widget_provider", 2131034114);
      g.a(localContext1).b(j);
      return;
    case 6:
    }
    q.a(this).a(paramIntent.getIntArrayExtra("widget_ids"));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.WidgetService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
