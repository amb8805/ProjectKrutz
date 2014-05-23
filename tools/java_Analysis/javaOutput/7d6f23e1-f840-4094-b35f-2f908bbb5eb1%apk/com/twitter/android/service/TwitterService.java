package com.twitter.android.service;

import ac;
import ad;
import ai;
import an;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import ap;
import be;
import bq;
import cj;
import cl;
import com.twitter.android.platform.d;
import com.twitter.android.platform.k;
import com.twitter.android.provider.ak;
import com.twitter.android.provider.az;
import com.twitter.android.provider.q;
import cq;
import cv;
import dd;
import dn;
import do;
import dw;
import ef;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
import p;

public class TwitterService extends Service
{
  private static final boolean a = Log.isLoggable("TwitterService", 3);
  private static final String[] b = { "impression", "url_click", "profile_image_click", "screen_name_click", "hashtag_click", "user_mention_click", "view_details", "contributed_by_name_click", "click" };
  private static final HashMap c;
  private ExecutorService d;
  private LinkedHashMap e;
  private ThreadSafeClientConnManager f;
  private HttpClient g;
  private ai h;
  private Handler i = new h(this, Looper.getMainLooper());

  static
  {
    HashMap localHashMap = new HashMap(68);
    c = localHashMap;
    localHashMap.put("REFRESH", Integer.valueOf(1));
    c.put("MARK_TWEETS", Integer.valueOf(2));
    c.put("MARK_MESSAGES", Integer.valueOf(3));
    c.put("CLEAN", Integer.valueOf(4));
    c.put("LOGOUT", Integer.valueOf(5));
    c.put("USER_TIMELINE", Integer.valueOf(6));
    c.put("CREATE_FAV", Integer.valueOf(7));
    c.put("DESTROY_FAV", Integer.valueOf(8));
    c.put("GET_FAVS", Integer.valueOf(9));
    c.put("RATE_LIMIT", Integer.valueOf(10));
    c.put("GET_LISTS", Integer.valueOf(11));
    c.put("GET_USERS", Integer.valueOf(12));
    c.put("GET_BLOCKING", Integer.valueOf(13));
    c.put("FOLLOW", Integer.valueOf(14));
    c.put("UNFOLLOW", Integer.valueOf(15));
    c.put("GET_MESSAGES", Integer.valueOf(16));
    c.put("GET_SENT_MESSAGES", Integer.valueOf(17));
    c.put("GET_UNREAD", Integer.valueOf(18));
    c.put("NEW_DM", Integer.valueOf(19));
    c.put("DESTROY_DM", Integer.valueOf(20));
    c.put("SHORTEN_URL", Integer.valueOf(21));
    c.put("GET_FRIENDSHIP", Integer.valueOf(22));
    c.put("GET_USER", Integer.valueOf(23));
    c.put("TWEET", Integer.valueOf(24));
    c.put("RETWEET", Integer.valueOf(25));
    c.put("DESTROY_STATUS", Integer.valueOf(26));
    c.put("CREATE_BLOCK", Integer.valueOf(27));
    c.put("REPORT_SPAM", Integer.valueOf(28));
    c.put("DESTROY_BLOCK", Integer.valueOf(29));
    c.put("CREATE_LIST", Integer.valueOf(30));
    c.put("EDIT_LIST", Integer.valueOf(31));
    c.put("DELETE_LIST", Integer.valueOf(32));
    c.put("GET_LIST_TWEETS", Integer.valueOf(33));
    c.put("GET_LIST_USERS", Integer.valueOf(34));
    c.put("ADD_LIST_USER", Integer.valueOf(35));
    c.put("REMOVE_LIST_USER", Integer.valueOf(36));
    c.put("IS_LIST_USER", Integer.valueOf(37));
    c.put("GET_TRENDS", Integer.valueOf(38));
    c.put("SEARCH_TWEETS", Integer.valueOf(39));
    c.put("SEARCH_USERS", Integer.valueOf(40));
    c.put("UPDATE_PROFILE", Integer.valueOf(41));
    c.put("REVERSE_GEO", Integer.valueOf(42));
    c.put("VERIFY", Integer.valueOf(43));
    c.put("LOGIN", Integer.valueOf(44));
    c.put("LOG", Integer.valueOf(45));
    c.put("HOME", Integer.valueOf(46));
    c.put("SAVE_DRAFT", Integer.valueOf(47));
    c.put("DEL_DRAFT", Integer.valueOf(48));
    c.put("SEND_ALL_DRAFTS", Integer.valueOf(49));
    c.put("GET_SAVED_SEARCHES", Integer.valueOf(50));
    c.put("GET_SLUG", Integer.valueOf(51));
    c.put("GET_SLUG_USERS", Integer.valueOf(52));
    c.put("GET_LIST", Integer.valueOf(53));
    c.put("LOOKUP", Integer.valueOf(54));
    c.put("SIGNUP", Integer.valueOf(55));
    c.put("FOLLOW_ALL", Integer.valueOf(56));
    c.put("CONFIG", Integer.valueOf(57));
    c.put("UPDATE_SETTINGS", Integer.valueOf(58));
    c.put("GET_SETTINGS", Integer.valueOf(59));
    c.put("DELETE_DMS", Integer.valueOf(60));
    c.put("DECIDER", Integer.valueOf(61));
    c.put("SAVE_SEARCH", Integer.valueOf(62));
    c.put("DELETE_SEARCH", Integer.valueOf(63));
    c.put("ACTIVITY", Integer.valueOf(64));
    c.put("FETCH_STORIES", Integer.valueOf(65));
    c.put("RELATED_RESULTS", Integer.valueOf(66));
    c.put("GET_USER_RECOMMENDATIONS", Integer.valueOf(67));
    c.put("EMAIL_AVAILABLE", Integer.valueOf(68));
    c.put("USERNAME_AVAILABLE", Integer.valueOf(69));
    c.put("ACTIVITY_SUMMARY", Integer.valueOf(70));
    c.put("ACTION_MARK_STORIES", Integer.valueOf(71));
  }

  public TwitterService()
  {
  }

  private static ac a(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    TreeMap localTreeMap = cl.a(new String(paramByteArrayOutputStream.toByteArray()), true);
    return new ac((String)localTreeMap.get("oauth_token"), (String)localTreeMap.get("oauth_token_secret"));
  }

  private ArrayList a(cl paramcl, String paramString)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "promoted_tweets", "search" }).append(".json");
    ai.a(localStringBuilder, "q", paramString);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    ArrayList localArrayList;
    if (n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a().b())
      try
      {
        localArrayList = do.l(b(localByteArrayOutputStream));
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          be localbe = ((p)localIterator.next()).n;
          if ((localbe != null) && (localbe.c != null) && (localbe.c.a != null))
            a(paramcl, 0, localbe.c.a, 0L);
        }
      }
      catch (IOException localIOException)
      {
        if (a)
          Log.d("TwitterService", "queryPromoted", localIOException);
      }
    else
      return null;
    return localArrayList;
  }

  private n a(long paramLong, ak paramak, cl paramcl, Intent paramIntent)
  {
    long l = paramIntent.getLongExtra("status_id", 0L);
    String str = paramIntent.getStringExtra("impression_id");
    paramak.a(paramLong, l, true);
    ai localai = this.h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "favorites";
    arrayOfObject[1] = "create";
    arrayOfObject[2] = Long.valueOf(l);
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    ArrayList localArrayList1 = new ArrayList();
    if (str != null)
      localArrayList1.add(new BasicNameValuePair("impression_id", str));
    localArrayList1.add(new BasicNameValuePair("include_entities", "true"));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder.toString(), paramcl, localArrayList1, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        p localp = do.d(b(localByteArrayOutputStream));
        localp.l = true;
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(localp);
        paramak.a(localArrayList2, paramLong, 2, -1L, true, false, null, false);
        return localn;
      }
      catch (IOException localIOException)
      {
        while (!a);
        Log.d("TwitterService", "Problem processing response.", localIOException);
        return localn;
      }
    paramak.a(paramLong, l, false);
    return localn;
  }

  private n a(cl paramcl, Intent paramIntent)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "account", "rate_limit_status" }).append(".json");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      paramIntent.putExtra("rate_limit", do.h(b(localByteArrayOutputStream)));
      return localn;
    }
    catch (IOException localIOException)
    {
      localn.c = 0;
    }
    return localn;
  }

  private n a(cl paramcl, String paramString, long paramLong, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "users", "show" }).append(".json");
    if (paramLong == 0L)
      ai.a(localStringBuilder, "screen_name", paramString);
    while (true)
    {
      return n.a(this.h, this.g, localStringBuilder, paramcl, false, paramByteArrayOutputStream).a();
      ai.a(localStringBuilder, "user_id", paramLong);
    }
  }

  private n a(ak paramak, int paramInt1, cl paramcl, long paramLong1, long paramLong2, long paramLong3, int paramInt2, Intent paramIntent)
  {
    long l;
    int j;
    label66: StringBuilder localStringBuilder;
    label90: n localn;
    if (paramLong2 != 0L)
    {
      if (paramak.a(4, paramInt1, paramLong1, 1) != null)
        break label452;
      l = 0L;
      while (true)
        if (l > 0L)
        {
          if (a)
            Log.d("TwitterService", "getMessages: newer than sinceId: " + l);
          j = 100;
          if (paramInt1 == 1)
          {
            localStringBuilder = this.h.a(new Object[] { "direct_messages" });
            localStringBuilder.append(".json");
            if (l > 0L)
              ai.a(localStringBuilder, "since_id", l);
            if (paramLong3 > 0L)
              ai.a(localStringBuilder, "max_id", paramLong3);
            if (j > 0)
              ai.a(localStringBuilder, "count", j);
            ai.a(localStringBuilder, "include_entities", true);
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
            if (localn.b())
              try
              {
                ArrayList localArrayList = do.e(b(localByteArrayOutputStream));
                if ((paramLong3 > 0L) && (localArrayList.size() > 0))
                {
                  str1 = Long.toString(((cq)localArrayList.get(localArrayList.size() - 1)).a);
                  break label459;
                  if ((paramLong3 <= 0L) || (localArrayList.size() >= j))
                    break label415;
                  bool2 = true;
                  k = paramak.a(localArrayList, paramLong1, paramInt1, bool1, bool2, str1);
                  if (paramInt1 == 1)
                  {
                    m = paramak.d();
                    localq = q.a(this);
                    str2 = paramIntent.getStringExtra("account_name");
                    if (m <= 0)
                      break label421;
                  }
                }
                for (n = 1; ; n = 0)
                {
                  localq.a(str2, "message", n);
                  paramIntent.putExtra("new_dm", k);
                  paramIntent.putExtra("unread_dm", m);
                  return localn;
                  l = paramak.a(paramInt1);
                  break;
                  localStringBuilder = this.h.a(new Object[] { "direct_messages", "sent" });
                  break label90;
                  str1 = null;
                  break label459;
                  bool1 = false;
                  break label253;
                  bool2 = false;
                  break label275;
                }
              }
              catch (IOException localIOException)
              {
                localn.c = 0;
                localn.e = localIOException;
                return localn;
              }
          }
        }
    }
    while (true)
    {
      String str1;
      label253: boolean bool2;
      label275: boolean bool1;
      int k;
      int m;
      q localq;
      String str2;
      int n;
      label415: label421: j = paramInt2;
      break label66;
      label452: l = paramLong2;
      break;
      label459: if (paramLong3 != 0L)
        bool1 = true;
    }
  }

  private n a(ak paramak, long paramLong1, long paramLong2)
  {
    n localn;
    if ((paramLong1 == 0L) || (paramLong2 == 0L))
      localn = null;
    do
    {
      ByteArrayOutputStream localByteArrayOutputStream;
      do
      {
        return localn;
        StringBuilder localStringBuilder = this.h.a(new Object[] { "friendships", "show" }).append(".json");
        ai.a(localStringBuilder, "source_id", paramLong1);
        ai.a(localStringBuilder, "target_id", paramLong2);
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder, localByteArrayOutputStream).a();
      }
      while (!localn.b());
      try
      {
        paramak.a(paramLong2, do.j(b(localByteArrayOutputStream)));
        return localn;
      }
      catch (IOException localIOException)
      {
      }
    }
    while (!a);
    Log.d("TwitterService", "Problem processing response.", localIOException);
    return localn;
  }

  private n a(ak paramak, ad paramad, cl paramcl, long paramLong1, long paramLong2, int paramInt, Intent paramIntent)
  {
    if (paramad == null)
      return null;
    String str1 = paramIntent.getStringExtra("account_name");
    if (paramInt == -2);
    long l1;
    int k;
    long l14;
    long l15;
    for (int j = 1; ; j = 0)
    {
      l1 = paramad.a;
      if (j == 0)
        break label776;
      k = 100;
      l14 = paramak.c(l1, 0);
      l15 = paramak.b(l1, 0);
      if (a)
        Log.d("TwitterService", "[Refresh] sinceId: " + l14 + ", maxId: " + l15);
      if ((l14 != 0L) && (l15 != 0L) && (l15 != l14))
        break;
      return null;
    }
    long l2 = l15;
    long l3 = l14;
    StringBuilder localStringBuilder = this.h.a(new Object[] { "statuses", "home_timeline" }).append(".json");
    if (k > 0)
      ai.a(localStringBuilder, "count", k);
    if (l2 > 0L)
      ai.a(localStringBuilder, "max_id", l2);
    if (l3 > 0L)
      ai.a(localStringBuilder, "since_id", l3);
    ai.a(localStringBuilder, "include_entities", true);
    ai.a(localStringBuilder, "include_my_retweet", true);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        localArrayList = do.a(b(localByteArrayOutputStream), paramad);
        m = localArrayList.size();
        if ((m > 0) && (j == 0))
          if ((l2 > 0L) && (paramak.c(l1, l2) > 0))
          {
            localp2 = (p)localArrayList.get(m - 1);
            if ((localp2 == null) || (paramak.a(l1, 0, localp2.a().a)))
              break label762;
            l13 = localp2.a;
            l12 = localp2.d;
            i6 = 1;
            l11 = l13;
            break label791;
            while (true)
              if ((l2 > 0L) && (m > 0))
              {
                str2 = Long.toString(((p)localArrayList.get(m - 1)).a);
                break label806;
                i1 = paramak.a(localArrayList, l1, 0, -1L, bool1, bool2, str2, false);
                if (n != 0)
                  paramak.a(l1, localObject1, localObject2, 0);
                getContentResolver().notifyChange(az.a, null);
                i2 = paramak.d(l1, 0);
                localq = q.a(this);
                if (i2 <= 0)
                  break label861;
                i3 = 1;
                localq.a(str1, "tweet", i3);
                bool3 = d.a(this, str1, "com.android.contacts");
                if (bool3);
                try
                {
                  k.a(this, str1, localArrayList);
                  paramIntent.putExtra("new_tweet", i1);
                  paramIntent.putExtra("unread_tweet", i2);
                  break label834;
                  if (l3 > 0L)
                  {
                    l6 = paramak.b(l1, 0);
                    if (l6 > 0L)
                    {
                      i4 = m - 1;
                      l7 = 9223372036854775807L;
                      i5 = i4;
                      l8 = 0L;
                      if (i5 >= 0)
                      {
                        localp1 = (p)localArrayList.get(i5);
                        if (l6 == localp1.a().a)
                        {
                          l4 = l8;
                          l5 = l7;
                          n = 0;
                          continue;
                        }
                        if (l7 <= localp1.d)
                          break label837;
                        l9 = localp1.d;
                        l10 = localp1.a;
                        l7 = l9;
                        l8 = l10;
                      }
                    }
                  }
                }
                catch (Exception localException)
                {
                  throw new IOException("Exception: " + localException.getMessage());
                }
              }
          }
      }
      catch (IOException localIOException)
      {
        ArrayList localArrayList;
        int m;
        if (!a);
      }
    while (true)
    {
      p localp2;
      long l13;
      String str2;
      int i1;
      Object localObject1;
      Object localObject2;
      int i2;
      q localq;
      boolean bool3;
      long l6;
      int i4;
      long l7;
      int i5;
      long l8;
      label597: p localp1;
      long l9;
      long l10;
      Log.d("TwitterService", "Problem processing response.", localIOException);
      break label834;
      long l4 = l8;
      long l5 = l7;
      int n = 1;
      continue;
      l4 = 0L;
      l5 = 9223372036854775807L;
      n = 0;
      continue;
      label762: long l11 = 0L;
      long l12 = 9223372036854775807L;
      int i6 = 0;
      break label791;
      label776: k = paramInt;
      l2 = paramLong2;
      l3 = paramLong1;
      break;
      label791: l4 = l11;
      l5 = l12;
      n = i6;
      continue;
      label806: if (l2 != 0L);
      for (boolean bool1 = true; ; bool1 = false)
      {
        if ((l2 <= 0L) || (n != 0))
          break label855;
        bool2 = true;
        break;
        label834: return localn;
        label837: i5--;
        break label597;
        str2 = null;
        break label806;
      }
      label855: boolean bool2 = false;
      continue;
      label861: int i3 = 0;
    }
  }

  private n a(ak paramak, cl paramcl, long paramLong)
  {
    ai localai = this.h;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "trends";
    arrayOfObject[1] = Long.valueOf(paramLong);
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    if (paramcl.c != null)
      ai.a(localStringBuilder, "pc", 1);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        ArrayList localArrayList = do.g(b(localByteArrayOutputStream));
        paramak.a(localArrayList, 1);
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          dn localdn = (dn)localIterator.next();
          if (localdn.g > 0L)
            a(paramcl, 0, null, localdn.g);
        }
      }
      catch (IOException localIOException)
      {
        localn.c = 0;
        localn.e = localIOException;
      }
    return localn;
  }

  private n a(ak paramak, cl paramcl, long paramLong1, int paramInt1, long paramLong2, long paramLong3, long paramLong4, int paramInt2, boolean paramBoolean, Intent paramIntent)
  {
    StringBuilder localStringBuilder1;
    n localn;
    switch (paramInt1)
    {
    case 2:
    case 4:
    case 9:
    default:
      throw new IllegalArgumentException("Invalid type: " + paramInt1);
    case 1:
      StringBuilder localStringBuilder2 = this.h.a(new Object[] { "statuses", "user_timeline" }).append(".json");
      ai.a(localStringBuilder2, "user_id", paramLong1);
      ai.a(localStringBuilder2, "include_rts", true);
      localStringBuilder1 = localStringBuilder2;
      while (true)
      {
        ai.a(localStringBuilder1, "include_entities", true);
        if (paramInt2 > 0)
          ai.a(localStringBuilder1, "count", paramInt2);
        if ((paramLong3 == 0L) && (paramLong4 == 0L) && (paramLong2 > 0L))
          ai.a(localStringBuilder1, "since_id", paramLong2);
        if (paramLong4 > 0L)
          ai.a(localStringBuilder1, "max_id", paramLong4);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
        localn = n.a(this.h, this.g, localStringBuilder1, paramcl, false, localByteArrayOutputStream).a();
        if (localn.b())
          try
          {
            bq localbq = b(localByteArrayOutputStream);
            if (paramLong3 == 0L)
            {
              localArrayList = do.c(localbq);
              if ((paramLong4 > 0L) && (localArrayList.size() > 0))
              {
                str1 = Long.toString(((p)localArrayList.get(localArrayList.size() - 1)).a);
                break label710;
              }
            }
            while (true)
            {
              paramIntent.putExtra("new_tweet", paramak.a((java.util.Collection)localObject, paramLong1, paramInt1, -1L, bool3, bool2, str2, paramBoolean));
              if (((ArrayList)localObject).size() >= 100)
                paramak.a(paramLong1, paramInt1, -1L, ((p)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1)).a);
              if (paramInt1 == 5)
              {
                j = paramak.d(paramLong1, 5);
                if (j > 0)
                  q.a(this).a(paramIntent.getStringExtra("account_name"), 1);
                paramIntent.putExtra("unread_mention", j);
              }
              return localn;
              localStringBuilder1 = this.h.a(new Object[] { "statuses", "mentions" }).append(".json");
              break;
              localStringBuilder1 = this.h.a(new Object[] { "statuses", "retweeted_by_me" }).append(".json");
              break;
              localStringBuilder1 = this.h.a(new Object[] { "statuses", "retweeted_to_me" }).append(".json");
              break;
              localStringBuilder1 = this.h.a(new Object[] { "statuses", "retweets_of_me" }).append(".json");
              break;
              localai = this.h;
              arrayOfObject = new Object[3];
              arrayOfObject[0] = "statuses";
              arrayOfObject[1] = "show";
              arrayOfObject[2] = Long.valueOf(paramLong3);
              localStringBuilder1 = localai.a(arrayOfObject).append(".json");
              break;
              str1 = null;
              break label710;
              bool1 = false;
              break label720;
              localp = do.d(localbq);
              paramIntent.putExtra("status_id", localp.a().a);
              localObject = new ArrayList();
              ((ArrayList)localObject).add(localp);
              bool2 = false;
              str2 = null;
              break label732;
              bool3 = false;
            }
          }
          catch (IOException localIOException)
          {
            while (!a);
            Log.d("TwitterService", "Problem processing response.", localIOException);
            return localn;
          }
      }
    case 3:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    }
    while (true)
    {
      ArrayList localArrayList;
      String str1;
      Object localObject;
      boolean bool3;
      boolean bool2;
      String str2;
      int j;
      ai localai;
      Object[] arrayOfObject;
      boolean bool1;
      p localp;
      label710: if (paramLong4 > 0L)
      {
        bool1 = true;
        label720: str2 = str1;
        bool2 = bool1;
        localObject = localArrayList;
        label732: if (paramLong4 != 0L)
          bool3 = true;
      }
    }
  }

  // ERROR //
  private n a(ak paramak, cl paramcl, long paramLong1, String paramString, int paramInt, be parambe, long paramLong2, Intent paramIntent)
  {
    // Byte code:
    //   0: aload 10
    //   2: ldc_w 362
    //   5: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   8: astore 11
    //   10: aload 10
    //   12: ldc_w 679
    //   15: dconst_0
    //   16: invokevirtual 683	android/content/Intent:getDoubleExtra	(Ljava/lang/String;D)D
    //   19: dstore 12
    //   21: aload 10
    //   23: ldc_w 685
    //   26: dconst_0
    //   27: invokevirtual 683	android/content/Intent:getDoubleExtra	(Ljava/lang/String;D)D
    //   30: dstore 14
    //   32: aload 7
    //   34: ifnull +437 -> 471
    //   37: aload 7
    //   39: getfield 688	be:d	Ljava/util/ArrayList;
    //   42: ifnull +429 -> 471
    //   45: aload 7
    //   47: getfield 688	be:d	Ljava/util/ArrayList;
    //   50: invokevirtual 561	java/util/ArrayList:size	()I
    //   53: ifle +418 -> 471
    //   56: iconst_1
    //   57: istore 16
    //   59: iload 16
    //   61: ifeq +521 -> 582
    //   64: iload 6
    //   66: iconst_2
    //   67: if_icmpeq +515 -> 582
    //   70: new 281	java/lang/StringBuilder
    //   73: dup
    //   74: aload 5
    //   76: invokespecial 689	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: astore 33
    //   81: aload 7
    //   83: getfield 688	be:d	Ljava/util/ArrayList;
    //   86: iconst_0
    //   87: invokevirtual 565	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   90: checkcast 691	dy
    //   93: astore 34
    //   95: aload 34
    //   97: getfield 693	dy:e	Ljava/lang/String;
    //   100: astore 35
    //   102: aload 35
    //   104: ifnonnull +30 -> 134
    //   107: aload_0
    //   108: aload_0
    //   109: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   112: iload 6
    //   114: aload_2
    //   115: getfield 631	cl:c	Lac;
    //   118: aload 34
    //   120: getfield 695	dy:c	Ljava/lang/String;
    //   123: invokestatic 701	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   126: aload 5
    //   128: aconst_null
    //   129: invokestatic 706	s:a	(Landroid/content/Context;Lorg/apache/http/client/HttpClient;ILac;Landroid/net/Uri;Ljava/lang/String;Lbf;)Ljava/lang/String;
    //   132: astore 35
    //   134: aload 35
    //   136: ifnull +341 -> 477
    //   139: aload 33
    //   141: invokevirtual 709	java/lang/StringBuilder:length	()I
    //   144: ifle +11 -> 155
    //   147: aload 33
    //   149: bipush 32
    //   151: invokevirtual 712	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload 33
    //   157: aload 35
    //   159: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload 34
    //   165: aload 35
    //   167: putfield 693	dy:e	Ljava/lang/String;
    //   170: aload 33
    //   172: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: astore 17
    //   177: iload 16
    //   179: ifeq +313 -> 492
    //   182: iload 6
    //   184: iconst_2
    //   185: if_icmpne +307 -> 492
    //   188: iconst_1
    //   189: istore 18
    //   191: new 234	java/io/ByteArrayOutputStream
    //   194: dup
    //   195: sipush 1024
    //   198: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   201: astore 19
    //   203: iload 18
    //   205: ifeq +293 -> 498
    //   208: aload_0
    //   209: ldc_w 713
    //   212: invokevirtual 717	com/twitter/android/service/TwitterService:getString	(I)Ljava/lang/String;
    //   215: iconst_2
    //   216: anewarray 268	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: ldc_w 552
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: ldc_w 719
    //   230: aastore
    //   231: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   234: ldc_w 279
    //   237: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: astore 20
    //   242: aload 20
    //   244: ldc_w 724
    //   247: aload 17
    //   249: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   252: lload 8
    //   254: lconst_0
    //   255: lcmp
    //   256: ifle +28 -> 284
    //   259: aload 20
    //   261: ldc_w 726
    //   264: lload 8
    //   266: invokestatic 440	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;J)V
    //   269: aload 11
    //   271: ifnull +13 -> 284
    //   274: aload 20
    //   276: ldc_w 362
    //   279: aload 11
    //   281: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   284: dload 12
    //   286: dconst_0
    //   287: dcmpl
    //   288: ifeq +30 -> 318
    //   291: dload 14
    //   293: dconst_0
    //   294: dcmpl
    //   295: ifeq +23 -> 318
    //   298: aload 20
    //   300: ldc_w 679
    //   303: dload 12
    //   305: invokestatic 729	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;D)V
    //   308: aload 20
    //   310: ldc_w 685
    //   313: dload 14
    //   315: invokestatic 729	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;D)V
    //   318: new 731	org/apache/http/client/methods/HttpPost
    //   321: dup
    //   322: aload 20
    //   324: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   327: invokespecial 732	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   330: astore 21
    //   332: iload 18
    //   334: ifeq +80 -> 414
    //   337: aconst_null
    //   338: astore 27
    //   340: aload 7
    //   342: getfield 688	be:d	Ljava/util/ArrayList;
    //   345: iconst_0
    //   346: invokevirtual 565	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   349: checkcast 691	dy
    //   352: astore 30
    //   354: aload_0
    //   355: invokevirtual 733	com/twitter/android/service/TwitterService:getContentResolver	()Landroid/content/ContentResolver;
    //   358: aload 30
    //   360: getfield 695	dy:c	Ljava/lang/String;
    //   363: invokestatic 701	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   366: invokevirtual 737	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   369: astore 27
    //   371: new 739	as
    //   374: dup
    //   375: aconst_null
    //   376: invokespecial 742	as:<init>	(Lbf;)V
    //   379: astore 31
    //   381: aload 31
    //   383: ldc_w 744
    //   386: bipush 8
    //   388: invokestatic 748	cr:a	(I)Ljava/lang/String;
    //   391: aload 27
    //   393: invokevirtual 751	as:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)I
    //   396: pop
    //   397: aload 31
    //   399: invokevirtual 753	as:a	()V
    //   402: aload 21
    //   404: aload 31
    //   406: invokevirtual 757	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   409: aload 27
    //   411: invokestatic 760	cr:a	(Ljava/io/Closeable;)V
    //   414: new 762	bu
    //   417: dup
    //   418: aload_0
    //   419: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   422: aload 21
    //   424: aload_2
    //   425: aload 19
    //   427: invokespecial 765	bu:<init>	(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Lcl;Ljava/io/OutputStream;)V
    //   430: astore 22
    //   432: aload_0
    //   433: invokestatic 768	ai:a	(Landroid/content/Context;)Lai;
    //   436: aload 22
    //   438: invokevirtual 771	ai:a	(Ln;)V
    //   441: aload 22
    //   443: invokevirtual 301	n:a	()Ln;
    //   446: pop
    //   447: aload 22
    //   449: invokevirtual 304	n:b	()Z
    //   452: ifeq +109 -> 561
    //   455: aload_1
    //   456: aload 19
    //   458: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   461: invokestatic 402	do:d	(Lbq;)Lp;
    //   464: lload_3
    //   465: invokevirtual 774	com/twitter/android/provider/ak:a	(Lp;J)V
    //   468: aload 22
    //   470: areturn
    //   471: iconst_0
    //   472: istore 16
    //   474: goto -415 -> 59
    //   477: aload_1
    //   478: lconst_0
    //   479: aload 5
    //   481: lload_3
    //   482: lload 8
    //   484: aload 7
    //   486: invokevirtual 777	com/twitter/android/provider/ak:a	(JLjava/lang/String;JJLbe;)J
    //   489: pop2
    //   490: aconst_null
    //   491: areturn
    //   492: iconst_0
    //   493: istore 18
    //   495: goto -304 -> 191
    //   498: aload_0
    //   499: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   502: iconst_2
    //   503: anewarray 268	java/lang/Object
    //   506: dup
    //   507: iconst_0
    //   508: ldc_w 552
    //   511: aastore
    //   512: dup
    //   513: iconst_1
    //   514: ldc_w 779
    //   517: aastore
    //   518: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   521: ldc_w 279
    //   524: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: astore 20
    //   529: aload 20
    //   531: ldc_w 390
    //   534: iconst_1
    //   535: invokestatic 467	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    //   538: goto -296 -> 242
    //   541: astore 29
    //   543: aload 27
    //   545: invokestatic 760	cr:a	(Ljava/io/Closeable;)V
    //   548: goto -134 -> 414
    //   551: astore 28
    //   553: aload 27
    //   555: invokestatic 760	cr:a	(Ljava/io/Closeable;)V
    //   558: aload 28
    //   560: athrow
    //   561: aload_1
    //   562: lconst_0
    //   563: aload 5
    //   565: lload_3
    //   566: lload 8
    //   568: aload 7
    //   570: invokevirtual 777	com/twitter/android/provider/ak:a	(JLjava/lang/String;JJLbe;)J
    //   573: pop2
    //   574: goto -106 -> 468
    //   577: astore 26
    //   579: goto -111 -> 468
    //   582: aload 5
    //   584: astore 17
    //   586: goto -409 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   340	409	541	java/io/IOException
    //   340	409	551	finally
    //   455	468	577	java/io/IOException
  }

  private n a(ak paramak, cl paramcl, long paramLong, boolean paramBoolean)
  {
    n localn;
    if (paramLong <= 0L)
      localn = null;
    do
    {
      do
      {
        return localn;
        ai localai = this.h;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = "direct_messages";
        arrayOfObject[1] = "destroy";
        arrayOfObject[2] = Long.valueOf(paramLong);
        StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
        localn = n.a(this.h, this.g, localStringBuilder.toString(), paramcl, null).a();
      }
      while (!paramBoolean);
      if (localn.b())
      {
        paramak.c(paramLong);
        return localn;
      }
    }
    while (localn.c != 404);
    paramak.c(paramLong);
    return localn;
  }

  private n a(ak paramak, cl paramcl, Intent paramIntent)
  {
    int j = paramIntent.getIntExtra("page", 0);
    long l = paramIntent.getLongExtra("user_id", 0L);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "favorites" });
    localStringBuilder.append(".json");
    ai.a(localStringBuilder, "id", l);
    if (j > 0)
      ai.a(localStringBuilder, "page", j);
    ai.a(localStringBuilder, "include_entities", true);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        ArrayList localArrayList = do.c(b(localByteArrayOutputStream));
        if ((j > 0) && (localArrayList.size() > 0))
          str = Long.toString(((p)localArrayList.get(localArrayList.size() - 1)).a);
        else
          while (true)
          {
            paramak.a(localArrayList, l, 2, -1L, false, bool, str, true);
            return localn;
            str = null;
            break;
            bool = false;
          }
      }
      catch (IOException localIOException)
      {
        while (!a);
        Log.d("TwitterService", "Problem processing response.", localIOException);
        return localn;
      }
    while (true)
    {
      String str;
      boolean bool;
      if (j > 0)
        bool = true;
    }
  }

  private n a(ak paramak, cl paramcl, Intent paramIntent, boolean paramBoolean)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    ArrayList localArrayList1 = new ArrayList();
    StringBuilder localStringBuilder;
    n localn;
    if (paramBoolean)
    {
      localStringBuilder = this.h.a(new Object[] { "report_spam" }).append(".json");
      localArrayList1.add(new BasicNameValuePair("id", String.valueOf(l1)));
      while (true)
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList1, localByteArrayOutputStream).a();
        if (localn.b());
        try
        {
          ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
          paramak.a(1, l2, localad.a);
          paramak.a(0, l2, localad.a);
          ArrayList localArrayList2 = new ArrayList();
          localArrayList2.add(localad);
          paramak.a(localArrayList2, l2, 2, -1L, null, null);
          return localn;
          localStringBuilder = this.h.a(new Object[] { "blocks", "create" }).append(".json");
          localArrayList1.add(new BasicNameValuePair("user_id", String.valueOf(l1)));
        }
        catch (IOException localIOException)
        {
          while (!a);
          Log.d("TwitterService", "createBlock, spam: " + paramBoolean, localIOException);
        }
      }
    }
    return localn;
  }

  private void a(cl paramcl, int paramInt, String paramString, long paramLong)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "promoted_content", "log" }).append(".json");
    if (paramString != null)
      ai.a(localStringBuilder, "impression_id", paramString);
    if (paramLong > 0L)
      ai.a(localStringBuilder, "promoted_trend_id", paramLong);
    ai.a(localStringBuilder, "event", b[paramInt]);
    n.a(this.h, this.g, localStringBuilder, paramcl, false, null).a();
  }

  private static bq b(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    bq localbq = do.a.a(paramByteArrayOutputStream.toByteArray());
    localbq.g();
    return localbq;
  }

  private n b(long paramLong, ak paramak, cl paramcl, Intent paramIntent)
  {
    long l = paramIntent.getLongExtra("status_id", 0L);
    String str = paramIntent.getStringExtra("impression_id");
    ai localai = this.h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "statuses";
    arrayOfObject[1] = "retweet";
    arrayOfObject[2] = Long.valueOf(l);
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    ArrayList localArrayList = new ArrayList();
    if (str != null)
      localArrayList.add(new BasicNameValuePair("impression_id", str));
    localArrayList.add(new BasicNameValuePair("include_entities", "true"));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      paramak.a(do.d(b(localByteArrayOutputStream)), paramLong);
      return localn;
    }
    catch (IOException localIOException)
    {
      while (!a);
      Log.d("TwitterService", "retweet", localIOException);
    }
    return localn;
  }

  private n b(cl paramcl, Intent paramIntent)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "client_applications", "configuration" }).append(".json");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      paramIntent.putExtra("settings", do.i(b(localByteArrayOutputStream)));
      return localn;
    }
    catch (IOException localIOException)
    {
      localn.c = 0;
    }
    return localn;
  }

  private n b(ak paramak, cl paramcl, Intent paramIntent)
  {
    int j = paramIntent.getIntExtra("list_type", 0);
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    String str = paramak.a(2, j, l1, paramIntent.getIntExtra("page", 0));
    Object localObject;
    n localn;
    int k;
    switch (j)
    {
    default:
      throw new IllegalArgumentException("Invalid list type: " + j);
    case 0:
      ai localai3 = this.h;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Long.valueOf(l1);
      arrayOfObject3[1] = "lists";
      StringBuilder localStringBuilder3 = localai3.a(arrayOfObject3);
      localStringBuilder3.append(".json");
      localObject = localStringBuilder3;
      while (true)
      {
        if (str != null)
          ai.a((StringBuilder)localObject, "cursor", str);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, (java.lang.CharSequence)localObject, paramcl, false, localByteArrayOutputStream).a();
        if (localn.b())
          switch (j)
          {
          default:
            k = 0;
            try
            {
              dw localdw;
              while (true)
              {
                localdw = do.a(b(localByteArrayOutputStream), k);
                if (localdw != null)
                  break label431;
                localn.c = 0;
                return localn;
                ai localai2 = this.h;
                Object[] arrayOfObject2 = new Object[3];
                arrayOfObject2[0] = Long.valueOf(l1);
                arrayOfObject2[1] = "lists";
                arrayOfObject2[2] = "memberships";
                StringBuilder localStringBuilder2 = localai2.a(arrayOfObject2);
                localStringBuilder2.append(".json");
                localObject = localStringBuilder2;
                break;
                ai localai1 = this.h;
                Object[] arrayOfObject1 = new Object[3];
                arrayOfObject1[0] = Long.valueOf(l1);
                arrayOfObject1[1] = "lists";
                arrayOfObject1[2] = "subscriptions";
                StringBuilder localStringBuilder1 = localai1.a(arrayOfObject1);
                localStringBuilder1.append(".json");
                localObject = localStringBuilder1;
                break;
                k = 0;
                continue;
                if (l1 == l2)
                {
                  k = 1;
                }
                else
                {
                  k = 0;
                  continue;
                  if (l1 == l2)
                    k = 1;
                  else
                    k = 0;
                }
              }
              paramak.a(localdw.b(), l1, j, localdw.a());
              return localn;
            }
            catch (IOException localIOException)
            {
              do
                localn.c = 0;
              while (!a);
              Log.d("TwitterService", "Problem processing response.", localIOException);
            }
          case 1:
          case 2:
          case 0:
          }
      }
    case 1:
    case 2:
    }
    label431: return localn;
  }

  private n c(long paramLong, ak paramak, cl paramcl, Intent paramIntent)
  {
    long l = paramIntent.getLongExtra("status_id", 0L);
    ai localai = this.h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "statuses";
    arrayOfObject[1] = "destroy";
    arrayOfObject[2] = Long.valueOf(l);
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localByteArrayOutputStream).a();
    if (localn.b());
    while (localn.c != 404)
      try
      {
        paramak.a(paramLong, do.d(b(localByteArrayOutputStream)));
        return localn;
      }
      catch (IOException localIOException)
      {
        localn.c = 0;
        return localn;
      }
    p localp = paramak.a(l);
    if (localp != null)
    {
      paramak.a(paramLong, localp);
      localn.c = 200;
      return localn;
    }
    if (paramak.a(l, paramLong))
    {
      localn.c = 200;
      return localn;
    }
    Log.w("TwitterService", "destroyStatus: status not found: " + l);
    return localn;
  }

  private n c(cl paramcl, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("url");
    StringBuilder localStringBuilder = this.h.a(new Object[] { "urls", "shorten" }).append(".json");
    ai.a(localStringBuilder, "url", str);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    try
    {
      JSONObject localJSONObject = new JSONObject(new String(localByteArrayOutputStream.toByteArray()));
      if (localn.b())
      {
        paramIntent.putExtra("short_url", localJSONObject.getString("url"));
        return localn;
      }
      localn.d = localJSONObject.getJSONArray("errors").getJSONObject(0).getString("message");
      return localn;
    }
    catch (Exception localException)
    {
      if (a)
        localException.printStackTrace();
    }
    return localn;
  }

  private n c(ak paramak, cl paramcl, Intent paramIntent)
  {
    int j = paramIntent.getIntExtra("page", 0);
    long l = paramIntent.getLongExtra("user_id", 0L);
    int k = paramIntent.getIntExtra("user_type", 0);
    String str1 = paramak.a(1, k, l, j);
    StringBuilder localStringBuilder;
    n localn;
    switch (k)
    {
    default:
      throw new IllegalStateException("Unknown user type: " + k);
    case 1:
      localStringBuilder = this.h.a(new Object[] { "statuses", "followers" });
      while (true)
      {
        localStringBuilder.append(".json");
        ai.a(localStringBuilder, "user_id", l);
        if (str1 != null)
          ai.a(localStringBuilder, "cursor", str1);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
        if (localn.b())
          try
          {
            dw localdw = do.a(b(localByteArrayOutputStream));
            if (localdw == null)
            {
              localn.c = 0;
              return localn;
              localStringBuilder = this.h.a(new Object[] { "statuses", "friends" });
            }
            else
            {
              localArrayList = localdw.b();
              if (j == 0)
              {
                str2 = "-1";
                paramIntent.putExtra("count", paramak.a(localArrayList, l, k, -1L, str2, localdw.a()));
                return localn;
              }
            }
          }
          catch (IOException localIOException)
          {
            do
              localn.c = 0;
            while (!a);
            Log.d("TwitterService", "Problem processing response.", localIOException);
            return localn;
          }
      }
    case 0:
    }
    while (true)
    {
      ArrayList localArrayList;
      String str2 = null;
    }
  }

  private n d(cl paramcl, Intent paramIntent)
  {
    double d1 = paramIntent.getDoubleExtra("lat", 0.0D);
    double d2 = paramIntent.getDoubleExtra("long", 0.0D);
    String str1 = paramIntent.getStringExtra("accuracy");
    StringBuilder localStringBuilder = this.h.a(new Object[] { "geo", "reverse_geocode" }).append(".json");
    ai.a(localStringBuilder, "lat", Double.toString(d1));
    ai.a(localStringBuilder, "long", Double.toString(d2));
    if (str1 != null)
      ai.a(localStringBuilder, "accuracy", str1);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        ArrayList localArrayList = do.k(b(localByteArrayOutputStream));
        if (localArrayList != null)
        {
          localIterator1 = localArrayList.iterator();
          do
          {
            bool = localIterator1.hasNext();
            str2 = null;
            if (!bool)
              break;
            localap1 = (ap)localIterator1.next();
          }
          while (3 != localap1.a);
          str2 = localap1.b;
          if (a)
            Log.d("TwitterService", "Found city type: " + str2);
          if (TextUtils.isEmpty(str2))
          {
            localIterator2 = localArrayList.iterator();
            do
            {
              if (!localIterator2.hasNext())
                break;
              localap2 = (ap)localIterator2.next();
            }
            while (4 != localap2.a);
            str3 = localap2.b;
            if (a)
              Log.d("TwitterService", "Found admin type: " + str3);
            paramIntent.putExtra("place", str3);
          }
        }
        else
        {
          return localn;
        }
      }
      catch (IOException localIOException)
      {
        while (!a);
        Log.d("TwitterService", "reverseGeo", localIOException);
        return localn;
      }
    while (true)
    {
      Iterator localIterator1;
      boolean bool;
      String str2;
      ap localap1;
      Iterator localIterator2;
      ap localap2;
      String str3 = str2;
    }
  }

  private n d(ak paramak, cl paramcl, Intent paramIntent)
  {
    int j = paramIntent.getIntExtra("page", 0);
    long l = paramIntent.getLongExtra("user_id", 0L);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "blocks", "blocking" });
    localStringBuilder.append(".json");
    if (j > 0)
      ai.a(localStringBuilder, "page", j);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b())
      try
      {
        ArrayList localArrayList = do.b(b(localByteArrayOutputStream));
        String str1;
        if (j == 1)
        {
          str1 = "-1";
          if (localArrayList.size() != 0)
            break label177;
        }
        for (String str2 = "0"; ; str2 = null)
        {
          paramIntent.putExtra("count", paramak.a(localArrayList, l, 2, -1L, str1, str2));
          return localn;
          str1 = null;
          break;
        }
      }
      catch (IOException localIOException)
      {
        while (!a);
        Log.d("TwitterService", "Problem processing response.", localIOException);
      }
    label177: return localn;
  }

  private n e(cl paramcl, Intent paramIntent)
  {
    StringBuilder localStringBuilder = this.h.a(new Object[] { "account", "verify_credentials" }).append(".json");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
      paramIntent.putExtra("user", localad);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localad);
      ak.a(this, localad.a).a(localArrayList, -1L, -1, -1L, null, null);
      return localn;
    }
    catch (IOException localIOException)
    {
      localn.c = 0;
      localn.e = localIOException;
    }
    return localn;
  }

  private n e(ak paramak, cl paramcl, Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("device_follow", false);
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "friendships", "create" }).append(".json");
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(new BasicNameValuePair("user_id", String.valueOf(l1)));
    if (bool)
      localArrayList1.add(new BasicNameValuePair("follow", "true"));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder.toString(), paramcl, localArrayList1, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.add(localad);
      paramak.a(localArrayList2, l2, 0, -1L, null, null);
      paramak.a(localad.a, true);
      return localn;
    }
    catch (IOException localIOException)
    {
      localn.c = 0;
    }
    return localn;
  }

  private n f(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "friendships", "destroy" });
    localStringBuilder.append(".json");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("user_id", String.valueOf(l1)));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
      paramak.a(l1, false);
      paramak.a(0, l2, localad.a);
      return localn;
    }
    catch (IOException localIOException)
    {
      while (!a);
      Log.d("TwitterService", "Problem processing response.", localIOException);
    }
    return localn;
  }

  private n g(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    String str1 = paramIntent.getStringExtra("screen_name");
    String str2 = paramIntent.getStringExtra("android.intent.extra.TEXT");
    StringBuilder localStringBuilder = this.h.a(new Object[] { "direct_messages", "new" });
    localStringBuilder.append(".json");
    ArrayList localArrayList1 = new ArrayList();
    n localn;
    if (str1 == null)
    {
      localArrayList1.add(new BasicNameValuePair("user_id", String.valueOf(l1)));
      while (true)
      {
        localArrayList1.add(new BasicNameValuePair("text", str2));
        localArrayList1.add(new BasicNameValuePair("include_entities", "true"));
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList1, localByteArrayOutputStream).a();
        if (localn.b());
        try
        {
          cq localcq = do.f(b(localByteArrayOutputStream));
          ArrayList localArrayList2 = new ArrayList();
          localArrayList2.add(localcq);
          paramak.a(localArrayList2, l2, 0, true, false, null);
          paramIntent.putExtra("user", localcq.e);
          return localn;
          localArrayList1.add(new BasicNameValuePair("screen_name", str1));
        }
        catch (IOException localIOException)
        {
          while (!a);
          Log.d("TwitterService", "Problem processing response.", localIOException);
        }
      }
    }
    return localn;
  }

  private n h(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    String str = paramIntent.getStringExtra("screen_name");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = a(paramcl, str, l1, localByteArrayOutputStream);
    if (localn.b())
      try
      {
        ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
        if (localad != null)
        {
          ArrayList localArrayList = new ArrayList(1);
          localArrayList.add(localad);
          paramak.a(localArrayList, -1L, -1, -1L, null, null);
          if (l2 != localad.a)
            a(paramak, l2, localad.a);
          paramIntent.putExtra("user", localad);
        }
        return localn;
      }
      catch (IOException localIOException)
      {
        while (!a);
        Log.d("TwitterService", "Problem processing response.", localIOException);
      }
    return localn;
  }

  private n i(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("owner_id", 0L);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "blocks", "destroy" }).append(".json");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("user_id", String.valueOf(l1)));
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList, null).a();
    if (localn.b());
    try
    {
      paramak.a(2, l2, l1);
      return localn;
    }
    catch (Exception localException)
    {
      while (!a);
      Log.d("TwitterService", "destroyBlock", localException);
    }
    return localn;
  }

  private n j(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    String str1 = paramIntent.getStringExtra("name");
    String str2 = paramIntent.getStringExtra("desc");
    int j = paramIntent.getIntExtra("list_mode", 0);
    long l2 = paramIntent.getLongExtra("list_id", 0L);
    ArrayList localArrayList1 = new ArrayList();
    StringBuilder localStringBuilder;
    label148: n localn;
    if (l2 == 0L)
    {
      ai localai2 = this.h;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(l1);
      arrayOfObject2[1] = "lists";
      localStringBuilder = localai2.a(arrayOfObject2).append(".json");
      while (true)
      {
        localArrayList1.add(new BasicNameValuePair("name", str1));
        switch (j)
        {
        default:
          if (str2 != null)
            localArrayList1.add(new BasicNameValuePair("description", str2));
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList1, localByteArrayOutputStream).a();
          if (localn.b());
          try
          {
            cv localcv = do.b(b(localByteArrayOutputStream), 1);
            ArrayList localArrayList2 = new ArrayList();
            localArrayList2.add(localcv);
            paramak.a(localArrayList2, l1, 0, null);
            paramIntent.putExtra("list_id", localcv.a());
            return localn;
            ai localai1 = this.h;
            Object[] arrayOfObject1 = new Object[3];
            arrayOfObject1[0] = Long.valueOf(l1);
            arrayOfObject1[1] = "lists";
            arrayOfObject1[2] = Long.valueOf(l2);
            localStringBuilder = localai1.a(arrayOfObject1).append(".json");
            continue;
            localArrayList1.add(new BasicNameValuePair("mode", "public"));
            break label148;
            localArrayList1.add(new BasicNameValuePair("mode", "private"));
          }
          catch (IOException localIOException)
          {
            while (!a);
            Log.d("TwitterService", "createList", localIOException);
          }
        case 0:
        case 1:
        }
      }
    }
    return localn;
  }

  private n k(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    long l2 = paramIntent.getLongExtra("list_id", 0L);
    ai localai = this.h;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(l1);
    arrayOfObject[1] = "lists";
    arrayOfObject[2] = Long.valueOf(l2);
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    ai.a(localStringBuilder, "_method", "DELETE");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      do.b(b(localByteArrayOutputStream), 2);
      paramak.b(l1, l2);
      return localn;
    }
    catch (IOException localIOException)
    {
      while (!a);
      Log.d("TwitterService", "createList", localIOException);
    }
    return localn;
  }

  private n l(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("since_id", 0L);
    long l2 = paramIntent.getLongExtra("user_id", 0L);
    long l3 = paramIntent.getLongExtra("list_id", 0L);
    long l4 = paramIntent.getLongExtra("max_id", 0L);
    int j = paramIntent.getIntExtra("count", 100);
    ai localai = this.h;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(l2);
    arrayOfObject[1] = "lists";
    arrayOfObject[2] = Long.valueOf(l3);
    arrayOfObject[3] = "statuses";
    StringBuilder localStringBuilder = localai.a(arrayOfObject).append(".json");
    if (l1 > 0L)
      ai.a(localStringBuilder, "since_id", l1);
    if (l4 > 0L)
      ai.a(localStringBuilder, "max_id", l4);
    ai.a(localStringBuilder, "per_page", j);
    ai.a(localStringBuilder, "include_entities", true);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn;
    if (paramcl.c != null)
    {
      localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream);
      while (true)
        if (localn.a().b())
          try
          {
            ArrayList localArrayList = do.c(b(localByteArrayOutputStream));
            if ((l4 > 0L) && (localArrayList.size() > 0))
              str = Long.toString(((p)localArrayList.get(localArrayList.size() - 1)).a);
            else
              while (true)
              {
                paramak.a(localArrayList, l2, 9, l3, bool2, bool1, str, true);
                return localn;
                localn = n.a(this.h, this.g, localStringBuilder, localByteArrayOutputStream);
                break;
                str = null;
                break label343;
                bool1 = false;
                break label353;
                bool2 = false;
              }
          }
          catch (IOException localIOException)
          {
            while (!a);
            Log.d("TwitterService", "getListTweets", localIOException);
            return localn;
          }
    }
    while (true)
    {
      String str;
      boolean bool2;
      boolean bool1;
      label343: if (l4 > 0L)
      {
        bool1 = true;
        label353: if (l4 != 0L)
          bool2 = true;
      }
    }
  }

  private n m(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("user_id", 0L);
    long l2 = paramIntent.getLongExtra("list_id", 0L);
    int j = paramIntent.getIntExtra("page", 0);
    int k = paramIntent.getIntExtra("user_type", 0);
    String str1 = paramak.a(1, k, l1, j);
    StringBuilder localStringBuilder;
    n localn;
    switch (k)
    {
    default:
      throw new IllegalStateException("Unknown user type: " + k);
    case 4:
    case 6:
      ai localai2 = this.h;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(l1);
      arrayOfObject2[1] = Long.valueOf(l2);
      arrayOfObject2[2] = "members";
      localStringBuilder = localai2.a(arrayOfObject2);
      while (true)
      {
        localStringBuilder.append(".json");
        if (str1 != null)
          ai.a(localStringBuilder, "cursor", str1);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
        if (localn.b())
          try
          {
            dw localdw = do.a(b(localByteArrayOutputStream));
            if (localdw == null)
            {
              localn.c = 0;
              return localn;
              localai1 = this.h;
              arrayOfObject1 = new Object[3];
              arrayOfObject1[0] = Long.valueOf(l1);
              arrayOfObject1[1] = Long.valueOf(l2);
              arrayOfObject1[2] = "subscribers";
              localStringBuilder = localai1.a(arrayOfObject1);
            }
            else
            {
              localArrayList = localdw.b();
              if (j == 0)
              {
                str2 = "-1";
                paramIntent.putExtra("count", paramak.a(localArrayList, l1, k, l2, str2, localdw.a()));
                return localn;
              }
            }
          }
          catch (IOException localIOException)
          {
            do
              localn.c = 0;
            while (!a);
            Log.d("TwitterService", "getListUsers", localIOException);
            return localn;
          }
      }
    case 5:
    }
    while (true)
    {
      ai localai1;
      Object[] arrayOfObject1;
      ArrayList localArrayList;
      String str2 = null;
    }
  }

  private n n(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    long l2 = paramIntent.getLongExtra("user_id", 0L);
    long l3 = paramIntent.getLongExtra("list_id", 0L);
    int j = paramIntent.getIntExtra("user_type", 0);
    ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
    n localn1 = a(paramcl, null, l2, localByteArrayOutputStream1);
    ArrayList localArrayList = new ArrayList();
    ad localad;
    if (localn1.b())
      try
      {
        localad = do.a(b(localByteArrayOutputStream1), System.currentTimeMillis());
        if (localad != null)
          switch (j)
          {
          default:
            throw new IllegalStateException("Unknown user type: " + j);
          case 4:
          case 5:
          }
      }
      catch (IOException localIOException)
      {
        if (a)
          Log.d("TwitterService", "addListUser", localIOException);
      }
    return null;
    ai localai2 = this.h;
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Long.valueOf(l1);
    arrayOfObject2[1] = Long.valueOf(l3);
    arrayOfObject2[2] = "members";
    StringBuilder localStringBuilder2 = localai2.a(arrayOfObject2).append(".json");
    localArrayList.add(new BasicNameValuePair("id", String.valueOf(l2)));
    n localn2;
    StringBuilder localStringBuilder1;
    for (Object localObject = localStringBuilder2; ; localObject = localStringBuilder1)
    {
      ByteArrayOutputStream localByteArrayOutputStream2 = new ByteArrayOutputStream();
      localn2 = n.a(this.h, this.g, (java.lang.CharSequence)localObject, paramcl, localArrayList, localByteArrayOutputStream2).a();
      if (!localn2.b())
        break;
      paramak.a(l1, localad, j, do.b(b(localByteArrayOutputStream2), 1));
      break;
      ai localai1 = this.h;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Long.valueOf(l2);
      arrayOfObject1[1] = Long.valueOf(l3);
      arrayOfObject1[2] = "subscribers";
      localStringBuilder1 = localai1.a(arrayOfObject1).append(".json");
    }
    return localn2;
  }

  private n o(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    long l2 = paramIntent.getLongExtra("user_id", 0L);
    long l3 = paramIntent.getLongExtra("list_id", 0L);
    int j = paramIntent.getIntExtra("user_type", 0);
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder1;
    n localn;
    int k;
    switch (j)
    {
    default:
      throw new IllegalStateException("Unknown user type: " + j);
    case 4:
      ai localai2 = this.h;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(l1);
      arrayOfObject2[1] = Long.valueOf(l3);
      arrayOfObject2[2] = "members";
      StringBuilder localStringBuilder2 = localai2.a(arrayOfObject2).append(".json");
      localArrayList.add(new BasicNameValuePair("id", String.valueOf(l2)));
      localStringBuilder1 = localStringBuilder2;
      while (true)
      {
        ai.a(localStringBuilder1, "_method", "DELETE");
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localn = n.a(this.h, this.g, localStringBuilder1, paramcl, localArrayList, localByteArrayOutputStream).a();
        if (localn.b());
        switch (j)
        {
        default:
          k = 0;
          try
          {
            while (true)
            {
              paramak.a(j, l1, l2, do.b(b(localByteArrayOutputStream), k));
              return localn;
              ai localai1 = this.h;
              Object[] arrayOfObject1 = new Object[3];
              arrayOfObject1[0] = Long.valueOf(l2);
              arrayOfObject1[1] = Long.valueOf(l3);
              arrayOfObject1[2] = "subscribers";
              localStringBuilder1 = localai1.a(arrayOfObject1).append(".json");
              break;
              k = 1;
              continue;
              k = 2;
            }
          }
          catch (IOException localIOException)
          {
            while (!a);
            Log.d("TwitterService", "removeListUser", localIOException);
          }
        case 4:
        case 5:
        }
      }
    case 5:
    }
    return localn;
  }

  private n p(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("owner_id", 0L);
    long l2 = paramIntent.getLongExtra("max_id", 0L);
    long l3 = paramIntent.getLongExtra("since_id", 0L);
    int j = paramIntent.getIntExtra("page", 0);
    String str1 = paramIntent.getStringExtra("q");
    String str2 = paramIntent.getStringExtra("q_name");
    int k = paramIntent.getIntExtra("q_type", 0);
    String str3 = paramIntent.getStringExtra("place");
    String str4 = paramIntent.getStringExtra("lang");
    boolean bool1 = paramIntent.getBooleanExtra("show_user", false);
    String str5 = paramIntent.getStringExtra("geo");
    String str6 = paramIntent.getStringExtra("locale");
    int m = paramIntent.getIntExtra("count", 0);
    int n;
    StringBuilder localStringBuilder;
    n localn;
    if (m <= 0)
    {
      n = 20;
      localStringBuilder = ai.a(this.h.a, new Object[] { "i", "search" }).append(".json");
      ai.a(localStringBuilder, "q", str1);
      if ((k == 5) || (k == 8) || (paramak.a(str1)))
      {
        ai.a(localStringBuilder, "result_type", "recent");
        while (true)
        {
          if (str4 != null)
            ai.a(localStringBuilder, "lang", str4);
          if (str6 != null)
            ai.a(localStringBuilder, "locale", str6);
          if (l3 != 0L)
            ai.a(localStringBuilder, "since_id", l3);
          ai.a(localStringBuilder, "rpp", n);
          if (l2 != 0L)
            ai.a(localStringBuilder, "max_id", l2);
          if (bool1)
            ai.a(localStringBuilder, "show_user", bool1);
          if (str5 != null)
            ai.a(localStringBuilder, "geocode", str5);
          if (j == 1)
            ai.a(localStringBuilder, "stories", true);
          ai.a(localStringBuilder, "include_entities", true);
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
          if (localn.b())
            try
            {
              dd localdd = do.t(b(localByteArrayOutputStream));
              if ((localdd.b != null) && (!localdd.b.isEmpty()))
                paramak.a((an)localdd.b.get(0), str1);
              localArrayList1 = localdd.a;
              localArrayList2 = new ArrayList();
              if (j == 1)
              {
                paramak.a();
                if ((k != 5) && (paramcl.c != null))
                {
                  localArrayList6 = a(paramcl, str1);
                  if ((localArrayList6 != null) && (localArrayList6.size() > 0))
                  {
                    localArrayList7 = new ArrayList();
                    localArrayList7.addAll(localArrayList6);
                    localArrayList7.addAll(localArrayList1);
                    localArrayList3 = localArrayList6;
                    localArrayList4 = localArrayList7;
                    localArrayList2.add(new dn(str2, str1, 0L, 0L, null, null, null, str3));
                    paramak.a(localArrayList2, 9);
                    if (localArrayList4 == null)
                    {
                      localArrayList5 = localArrayList1;
                      break label751;
                      paramak.a(localArrayList5, l1, -1, -1L, true, bool2, null, false);
                      if (j == 1)
                        break label691;
                      bool3 = true;
                      paramak.b(localArrayList1, l1, 13, 3L, true, bool3, null, false);
                      if (localArrayList3 != null)
                        if (j == 1)
                          break label697;
                    }
                    for (bool4 = true; ; bool4 = false)
                    {
                      paramak.b(localArrayList3, l1, 13, 5L, true, bool4, null, false);
                      getContentResolver().notifyChange(az.o, null);
                      return localn;
                      ai.a(localStringBuilder, "result_type", "mixed");
                      break;
                      localArrayList5 = localArrayList4;
                      break label751;
                      bool2 = false;
                      break label571;
                      bool3 = false;
                      break label598;
                    }
                  }
                }
              }
            }
            catch (IOException localIOException)
            {
              while (!a);
              Log.d("TwitterService", "searchTweets", localIOException);
              return localn;
            }
        }
      }
    }
    while (true)
    {
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      ArrayList localArrayList6;
      ArrayList localArrayList7;
      ArrayList localArrayList5;
      label571: boolean bool2;
      boolean bool3;
      label598: boolean bool4;
      label691: label697: ArrayList localArrayList3 = localArrayList6;
      ArrayList localArrayList4 = null;
      continue;
      localArrayList3 = null;
      localArrayList4 = null;
      continue;
      n = m;
      break;
      label751: if (j != 1)
        bool2 = true;
    }
  }

  private n q(ak paramak, cl paramcl, Intent paramIntent)
  {
    long l = paramIntent.getLongExtra("owner_id", 0L);
    String str = paramIntent.getStringExtra("q");
    int j = paramIntent.getIntExtra("count", 20);
    int k = paramIntent.getIntExtra("page", 1);
    StringBuilder localStringBuilder = this.h.a(new Object[] { "users", "search" }).append(".json");
    ai.a(localStringBuilder, "q", str);
    ai.a(localStringBuilder, "per_page", j);
    if (k > 0)
      ai.a(localStringBuilder, "page", k);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn;
    if (paramcl.c != null)
    {
      localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
      while (true)
        if (localn.b())
          try
          {
            ArrayList localArrayList = do.b(b(localByteArrayOutputStream));
            dn localdn = new dn(str, str, 0L, 0L);
            if (localArrayList.size() < j);
            for (boolean bool = true; ; bool = false)
            {
              paramIntent.putExtra("search_id", paramak.a(localdn, localArrayList, l, bool));
              paramIntent.putExtra("count", localArrayList.size());
              return localn;
              localn = n.a(this.h, this.g, localStringBuilder, localByteArrayOutputStream).a(0);
              break;
            }
          }
          catch (IOException localIOException)
          {
            localn.c = 0;
          }
    }
    return localn;
  }

  private n r(ak paramak, cl paramcl, Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("name");
    String str2 = paramIntent.getStringExtra("desc");
    String str3 = paramIntent.getStringExtra("url");
    String str4 = paramIntent.getStringExtra("place");
    String str5 = paramIntent.getStringExtra("account_name");
    StringBuilder localStringBuilder = this.h.a(new Object[] { "account", "update_profile" }).append(".json");
    ArrayList localArrayList1 = new ArrayList();
    if (str1 != null)
      localArrayList1.add(new BasicNameValuePair("name", str1));
    if (str3 != null)
      localArrayList1.add(new BasicNameValuePair("url", str3));
    if (str4 != null)
      localArrayList1.add(new BasicNameValuePair("location", str4));
    if (str2 != null)
      localArrayList1.add(new BasicNameValuePair("description", str2));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, localArrayList1, localByteArrayOutputStream).a();
    if (localn.b());
    try
    {
      ad localad = do.a(b(localByteArrayOutputStream), System.currentTimeMillis());
      d.a(this, str5, localad, null);
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.add(localad);
      paramak.a(localArrayList2, -1L, -1, -1L, null, null);
      paramIntent.putExtra("user", localad);
      return localn;
    }
    catch (IOException localIOException)
    {
      while (!a);
      Log.d("TwitterService", "updateProfile", localIOException);
    }
    return localn;
  }

  // ERROR //
  private n s(ak paramak, cl paramcl, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_3
    //   1: ldc_w 799
    //   4: lconst_0
    //   5: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   8: lstore 4
    //   10: aload_3
    //   11: ldc_w 457
    //   14: lconst_0
    //   15: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   18: lstore 6
    //   20: aload_3
    //   21: ldc_w 459
    //   24: lconst_0
    //   25: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   28: lstore 8
    //   30: aload_3
    //   31: ldc_w 461
    //   34: bipush 100
    //   36: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   39: istore 10
    //   41: aload_3
    //   42: ldc_w 1166
    //   45: iconst_0
    //   46: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   49: istore 11
    //   51: iconst_1
    //   52: iload 11
    //   54: if_icmpne +310 -> 364
    //   57: aload_0
    //   58: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   61: getfield 1089	ai:a	Ljava/lang/String;
    //   64: iconst_3
    //   65: anewarray 268	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: ldc_w 1090
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: ldc_w 1168
    //   79: aastore
    //   80: dup
    //   81: iconst_2
    //   82: ldc_w 1170
    //   85: aastore
    //   86: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   89: ldc_w 279
    //   92: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: astore 12
    //   97: aload 12
    //   99: ldc_w 390
    //   102: iconst_1
    //   103: invokestatic 467	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    //   106: iload 10
    //   108: ifle +13 -> 121
    //   111: aload 12
    //   113: ldc_w 461
    //   116: iload 10
    //   118: invokestatic 464	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   121: lload 8
    //   123: lconst_0
    //   124: lcmp
    //   125: ifle +13 -> 138
    //   128: aload 12
    //   130: ldc_w 459
    //   133: lload 8
    //   135: invokestatic 440	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;J)V
    //   138: lload 6
    //   140: lconst_0
    //   141: lcmp
    //   142: ifle +13 -> 155
    //   145: aload 12
    //   147: ldc_w 457
    //   150: lload 6
    //   152: invokestatic 440	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;J)V
    //   155: new 234	java/io/ByteArrayOutputStream
    //   158: dup
    //   159: sipush 1024
    //   162: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   165: astore 13
    //   167: aload_0
    //   168: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   171: aload_0
    //   172: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   175: aload 12
    //   177: aload_2
    //   178: iconst_0
    //   179: aload 13
    //   181: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   184: invokevirtual 301	n:a	()Ln;
    //   187: astore 14
    //   189: aload 14
    //   191: invokevirtual 304	n:b	()Z
    //   194: ifeq +327 -> 521
    //   197: aload 13
    //   199: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   202: invokestatic 1172	do:s	(Lbq;)Ljava/util/ArrayList;
    //   205: astore 19
    //   207: lload 8
    //   209: lconst_0
    //   210: lcmp
    //   211: ifle +196 -> 407
    //   214: iconst_1
    //   215: istore 20
    //   217: iload 20
    //   219: ifeq +194 -> 413
    //   222: aload 19
    //   224: invokevirtual 561	java/util/ArrayList:size	()I
    //   227: iload 10
    //   229: if_icmpge +184 -> 413
    //   232: iconst_1
    //   233: istore 21
    //   235: aload_1
    //   236: aload 19
    //   238: lload 4
    //   240: iload 11
    //   242: iload 20
    //   244: iload 21
    //   246: invokevirtual 1175	com/twitter/android/provider/ak:a	(Ljava/util/ArrayList;JIZZ)Ljava/util/ArrayList;
    //   249: astore 22
    //   251: aload 22
    //   253: invokevirtual 561	java/util/ArrayList:size	()I
    //   256: istore 23
    //   258: iload 23
    //   260: istore 18
    //   262: iload 11
    //   264: ifne +210 -> 474
    //   267: iload 20
    //   269: ifne +205 -> 474
    //   272: iload 18
    //   274: ifle +200 -> 474
    //   277: iconst_0
    //   278: istore 24
    //   280: aload 22
    //   282: invokevirtual 319	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   285: astore 25
    //   287: aload 25
    //   289: invokeinterface 324 1 0
    //   294: ifeq +163 -> 457
    //   297: aload 25
    //   299: invokeinterface 328 1 0
    //   304: checkcast 1177	ae
    //   307: getfield 1178	ae:a	I
    //   310: istore 27
    //   312: iload 27
    //   314: tableswitch	default:+38 -> 352, 1:+41->355, 2:+105->419, 3:+105->419, 4:+123->437, 5:+114->428, 6:+133->447
    //   353: impdep2
    //   354: athrow
    //   355: iload 24
    //   357: iconst_2
    //   358: ior
    //   359: istore 24
    //   361: goto -74 -> 287
    //   364: aload_0
    //   365: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   368: getfield 1089	ai:a	Ljava/lang/String;
    //   371: iconst_3
    //   372: anewarray 268	java/lang/Object
    //   375: dup
    //   376: iconst_0
    //   377: ldc_w 1090
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: ldc_w 1168
    //   386: aastore
    //   387: dup
    //   388: iconst_2
    //   389: ldc_w 1180
    //   392: aastore
    //   393: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   396: ldc_w 279
    //   399: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: astore 12
    //   404: goto -307 -> 97
    //   407: iconst_0
    //   408: istore 20
    //   410: goto -193 -> 217
    //   413: iconst_0
    //   414: istore 21
    //   416: goto -181 -> 235
    //   419: iload 24
    //   421: iconst_1
    //   422: ior
    //   423: istore 24
    //   425: goto -138 -> 287
    //   428: iload 24
    //   430: iconst_4
    //   431: ior
    //   432: istore 24
    //   434: goto -147 -> 287
    //   437: iload 24
    //   439: bipush 8
    //   441: ior
    //   442: istore 24
    //   444: goto -157 -> 287
    //   447: iload 24
    //   449: bipush 16
    //   451: ior
    //   452: istore 24
    //   454: goto -167 -> 287
    //   457: aload_0
    //   458: invokestatic 496	com/twitter/android/provider/q:a	(Landroid/content/Context;)Lcom/twitter/android/provider/q;
    //   461: aload_3
    //   462: ldc_w 498
    //   465: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   468: iload 24
    //   470: invokevirtual 663	com/twitter/android/provider/q:a	(Ljava/lang/String;I)I
    //   473: pop
    //   474: iload 18
    //   476: istore 15
    //   478: aload_3
    //   479: ldc_w 461
    //   482: iload 15
    //   484: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   487: pop
    //   488: aload 14
    //   490: areturn
    //   491: astore 17
    //   493: iconst_0
    //   494: istore 18
    //   496: aload 14
    //   498: iconst_0
    //   499: putfield 428	n:c	I
    //   502: aload 14
    //   504: aload 17
    //   506: putfield 518	n:e	Ljava/lang/Exception;
    //   509: iload 18
    //   511: istore 15
    //   513: goto -35 -> 478
    //   516: astore 17
    //   518: goto -22 -> 496
    //   521: iconst_0
    //   522: istore 15
    //   524: goto -46 -> 478
    //
    // Exception table:
    //   from	to	target	type
    //   197	207	491	java/io/IOException
    //   222	232	491	java/io/IOException
    //   235	258	491	java/io/IOException
    //   280	287	516	java/io/IOException
    //   287	312	516	java/io/IOException
    //   457	474	516	java/io/IOException
  }

  private n t(ak paramak, cl paramcl, Intent paramIntent)
  {
    StringBuilder localStringBuilder = ai.a(this.h.a, new Object[] { "i", "discovery" }).append(".json");
    double d1 = paramIntent.getDoubleExtra("lat", 0.0D);
    double d2 = paramIntent.getDoubleExtra("long", 0.0D);
    long l = paramIntent.getLongExtra("soid", 0L);
    if ((d1 != 0.0D) && (d2 != 0.0D))
    {
      ai.a(localStringBuilder, "lat", d1);
      ai.a(localStringBuilder, "long", d2);
    }
    String str = paramIntent.getStringExtra("lang");
    if (!TextUtils.isEmpty(str))
      ai.a(localStringBuilder, "lang", str);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    n localn = n.a(this.h, this.g, localStringBuilder, paramcl, false, localByteArrayOutputStream).a();
    try
    {
      bq localbq = b(localByteArrayOutputStream);
      localbq.g();
      int j = paramak.a(do.u(localbq), l, 3);
      if (j > 0)
        paramIntent.putExtra("unread_stories", j);
      return localn;
    }
    catch (IOException localIOException)
    {
      localn.c = 0;
      localn.e = localIOException;
    }
    return localn;
  }

  final void a(int paramInt)
  {
    this.e.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
    Iterator localIterator1 = this.e.entrySet().iterator();
    while (localIterator1.hasNext())
      if (!((Boolean)((Map.Entry)localIterator1.next()).getValue()).booleanValue())
        return;
    Iterator localIterator2 = this.e.keySet().iterator();
    while (localIterator2.hasNext())
      stopSelf(((Integer)localIterator2.next()).intValue());
    this.e.clear();
  }

  // ERROR //
  final void a(Intent paramIntent, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_1
    //   6: invokevirtual 1235	android/content/Intent:getAction	()Ljava/lang/String;
    //   9: astore_3
    //   10: getstatic 64	com/twitter/android/service/TwitterService:c	Ljava/util/HashMap;
    //   13: aload_3
    //   14: invokevirtual 1236	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast 68	java/lang/Integer
    //   20: astore 4
    //   22: new 243	cl
    //   25: dup
    //   26: aload_1
    //   27: ldc_w 1238
    //   30: invokevirtual 1242	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   33: checkcast 248	ac
    //   36: invokespecial 1245	cl:<init>	(Lac;)V
    //   39: astore 5
    //   41: aload_1
    //   42: ldc_w 498
    //   45: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   48: astore 6
    //   50: aload_1
    //   51: ldc_w 1184
    //   54: lconst_0
    //   55: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   58: lstore 7
    //   60: aload_0
    //   61: lload 7
    //   63: invokestatic 994	com/twitter/android/provider/ak:a	(Landroid/content/Context;J)Lcom/twitter/android/provider/ak;
    //   66: astore 9
    //   68: aload 4
    //   70: ifnonnull +517 -> 587
    //   73: iconst_0
    //   74: istore 10
    //   76: iload 10
    //   78: tableswitch	default:+298 -> 376, 1:+519->597, 2:+596->674, 3:+701->779, 4:+726->804, 5:+745->823, 6:+762->840, 7:+857->935, 8:+873->951, 9:+1084->1162, 10:+1098->1176, 11:+1110->1188, 12:+1124->1202, 13:+1138->1216, 14:+1152->1230, 15:+1166->1244, 16:+1180->1258, 17:+1180->1258, 18:+1297->1375, 19:+1364->1442, 20:+1378->1456, 21:+1400->1478, 22:+1412->1490, 23:+1439->1517, 24:+1453->1531, 25:+1518->1596, 26:+1534->1612, 27:+1550->1628, 28:+1550->1628, 29:+1588->1666, 30:+1602->1680, 31:+1602->1680, 32:+1616->1694, 33:+1630->1708, 34:+1644->1722, 35:+1658->1736, 36:+1672->1750, 37:+1686->1764, 38:+2034->2112, 39:+2055->2133, 40:+2069->2147, 41:+2083->2161, 42:+2097->2175, 43:+2109->2187, 44:+2121->2199, 45:+2280->2358, 46:+2325->2403, 47:+2386->2464, 48:+2433->2511, 49:+2459->2537, 50:+2649->2727, 51:+2763->2841, 52:+3117->3195, 53:+3543->3621, 54:+3681->3759, 55:+4135->4213, 56:+4928->5006, 57:+5108->5186, 58:+5120->5198, 59:+5120->5198, 60:+5315->5393, 61:+5384->5462, 62:+5492->5570, 63:+5649->5727, 64:+5773->5851, 65:+5787->5865, 66:+5844->5922, 67:+3302->3380, 68:+6082->6160, 69:+6307->6385, 70:+6620->6698, 71:+5801->5879
    //   377: nop
    //   378: fload_0
    //   379: ifeq +29 -> 408
    //   382: ldc 26
    //   384: new 281	java/lang/StringBuilder
    //   387: dup
    //   388: invokespecial 445	java/lang/StringBuilder:<init>	()V
    //   391: ldc_w 1247
    //   394: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: aload_3
    //   398: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 453	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   407: pop
    //   408: aconst_null
    //   409: astore 17
    //   411: aload 17
    //   413: ifnull +6440 -> 6853
    //   416: aload 17
    //   418: getfield 428	n:c	I
    //   421: istore 29
    //   423: aload 17
    //   425: getfield 927	n:d	Ljava/lang/String;
    //   428: astore 30
    //   430: aload 17
    //   432: getfield 1250	n:f	Lao;
    //   435: astore 31
    //   437: aload_0
    //   438: lload 7
    //   440: aload 17
    //   442: invokestatic 1255	com/twitter/android/service/ScribeService:a	(Landroid/content/Context;JLn;)V
    //   445: aload 31
    //   447: astore 19
    //   449: iload 29
    //   451: istore 21
    //   453: aload 30
    //   455: astore 20
    //   457: getstatic 34	com/twitter/android/service/TwitterService:a	Z
    //   460: ifeq +59 -> 519
    //   463: aload_1
    //   464: ldc_w 1257
    //   467: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   470: astore 27
    //   472: ldc 26
    //   474: new 281	java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial 445	java/lang/StringBuilder:<init>	()V
    //   481: ldc_w 1259
    //   484: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: aload 27
    //   489: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: bipush 32
    //   494: invokevirtual 712	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   497: iload 21
    //   499: invokevirtual 650	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   502: bipush 32
    //   504: invokevirtual 712	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   507: aload 20
    //   509: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: invokestatic 453	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   518: pop
    //   519: aload_1
    //   520: ldc_w 1261
    //   523: invokevirtual 1264	android/content/Intent:hasExtra	(Ljava/lang/String;)Z
    //   526: ifeq +43 -> 569
    //   529: aload_1
    //   530: ldc_w 1266
    //   533: iload 10
    //   535: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   538: pop
    //   539: aload_1
    //   540: ldc_w 1268
    //   543: iload 21
    //   545: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   548: pop
    //   549: aload_1
    //   550: ldc_w 1270
    //   553: aload 20
    //   555: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   558: pop
    //   559: aload_1
    //   560: ldc_w 418
    //   563: aload 19
    //   565: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   568: pop
    //   569: aload_0
    //   570: getfield 231	com/twitter/android/service/TwitterService:i	Landroid/os/Handler;
    //   573: aload_0
    //   574: getfield 231	com/twitter/android/service/TwitterService:i	Landroid/os/Handler;
    //   577: iload_2
    //   578: aload_1
    //   579: invokevirtual 1276	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   582: invokevirtual 1280	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   585: pop
    //   586: return
    //   587: aload 4
    //   589: invokevirtual 1223	java/lang/Integer:intValue	()I
    //   592: istore 10
    //   594: goto -518 -> 76
    //   597: new 1282	com/twitter/android/platform/o
    //   600: dup
    //   601: aload_0
    //   602: invokespecial 1285	com/twitter/android/platform/o:<init>	(Landroid/content/Context;)V
    //   605: wide
    //   609: new 1287	android/content/SyncResult
    //   612: dup
    //   613: invokespecial 1288	android/content/SyncResult:<init>	()V
    //   616: wide
    //   620: aload_1
    //   621: ldc_w 414
    //   624: invokevirtual 1242	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   627: checkcast 1290	android/accounts/Account
    //   630: wide
    //   634: aload_1
    //   635: ldc_w 1292
    //   638: invokevirtual 1296	android/content/Intent:getBundleExtra	(Ljava/lang/String;)Landroid/os/Bundle;
    //   641: wide
    //   645: wide
    //   649: aload_0
    //   650: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   653: wide
    //   657: wide
    //   661: wide
    //   665: invokevirtual 1299	com/twitter/android/platform/o:a	(Lorg/apache/http/client/HttpClient;Landroid/accounts/Account;Landroid/os/Bundle;Landroid/content/SyncResult;)V
    //   668: aconst_null
    //   669: astore 17
    //   671: goto -260 -> 411
    //   674: aload_1
    //   675: ldc_w 1166
    //   678: iconst_0
    //   679: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   682: wide
    //   686: aload 9
    //   688: aload_1
    //   689: ldc_w 799
    //   692: lconst_0
    //   693: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   696: wide
    //   700: ldc2_w 405
    //   703: invokevirtual 1302	com/twitter/android/provider/ak:b	(JIJ)V
    //   706: wide
    //   710: lookupswitch	default:+26->736, 0:+32->742, 5:+52->762
    //   737: astore 17
    //   739: goto -328 -> 411
    //   742: aload_0
    //   743: invokestatic 496	com/twitter/android/provider/q:a	(Landroid/content/Context;)Lcom/twitter/android/provider/q;
    //   746: aload 6
    //   748: ldc_w 599
    //   751: iconst_0
    //   752: invokevirtual 503	com/twitter/android/provider/q:a	(Ljava/lang/String;Ljava/lang/String;I)I
    //   755: pop
    //   756: aconst_null
    //   757: astore 17
    //   759: goto -348 -> 411
    //   762: aload_0
    //   763: invokestatic 496	com/twitter/android/provider/q:a	(Landroid/content/Context;)Lcom/twitter/android/provider/q;
    //   766: aload 6
    //   768: ldc_w 1304
    //   771: iconst_0
    //   772: invokevirtual 503	com/twitter/android/provider/q:a	(Ljava/lang/String;Ljava/lang/String;I)I
    //   775: pop
    //   776: goto -40 -> 736
    //   779: aload 9
    //   781: invokevirtual 1306	com/twitter/android/provider/ak:c	()V
    //   784: aload_0
    //   785: invokestatic 496	com/twitter/android/provider/q:a	(Landroid/content/Context;)Lcom/twitter/android/provider/q;
    //   788: aload 6
    //   790: ldc_w 500
    //   793: iconst_0
    //   794: invokevirtual 503	com/twitter/android/provider/q:a	(Ljava/lang/String;Ljava/lang/String;I)I
    //   797: pop
    //   798: aconst_null
    //   799: astore 17
    //   801: goto -390 -> 411
    //   804: aload 9
    //   806: aload_1
    //   807: ldc_w 799
    //   810: lconst_0
    //   811: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   814: invokevirtual 1308	com/twitter/android/provider/ak:e	(J)V
    //   817: aconst_null
    //   818: astore 17
    //   820: goto -409 -> 411
    //   823: aload_0
    //   824: aload 6
    //   826: invokestatic 1311	com/twitter/android/platform/d:b	(Landroid/content/Context;Ljava/lang/String;)V
    //   829: aload 9
    //   831: invokevirtual 1313	com/twitter/android/provider/ak:b	()V
    //   834: aconst_null
    //   835: astore 17
    //   837: goto -426 -> 411
    //   840: aload_1
    //   841: ldc_w 437
    //   844: lconst_0
    //   845: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   848: wide
    //   852: aload_1
    //   853: ldc_w 1315
    //   856: iconst_0
    //   857: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   860: wide
    //   864: aload_1
    //   865: ldc_w 459
    //   868: lconst_0
    //   869: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   872: wide
    //   876: aload_1
    //   877: ldc_w 354
    //   880: lconst_0
    //   881: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   884: wide
    //   888: aload_0
    //   889: aload 9
    //   891: aload 5
    //   893: wide
    //   897: wide
    //   901: aload_1
    //   902: ldc_w 457
    //   905: lconst_0
    //   906: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   909: wide
    //   913: wide
    //   917: aload_1
    //   918: ldc_w 461
    //   921: iconst_0
    //   922: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   925: iconst_1
    //   926: aload_1
    //   927: invokespecial 1317	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JIJJJIZLandroid/content/Intent;)Ln;
    //   930: astore 17
    //   932: goto -521 -> 411
    //   935: aload_0
    //   936: lload 7
    //   938: aload 9
    //   940: aload 5
    //   942: aload_1
    //   943: invokespecial 1319	com/twitter/android/service/TwitterService:a	(JLcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   946: astore 17
    //   948: goto -537 -> 411
    //   951: aload_1
    //   952: ldc_w 354
    //   955: lconst_0
    //   956: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   959: wide
    //   963: aload_1
    //   964: ldc_w 362
    //   967: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   970: wide
    //   974: aload 9
    //   976: lload 7
    //   978: wide
    //   982: iconst_0
    //   983: invokevirtual 371	com/twitter/android/provider/ak:a	(JJZ)V
    //   986: aload_0
    //   987: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   990: wide
    //   994: iconst_3
    //   995: anewarray 268	java/lang/Object
    //   998: wide
    //   1002: wide
    //   1006: iconst_0
    //   1007: ldc_w 373
    //   1010: aastore
    //   1011: wide
    //   1015: iconst_1
    //   1016: ldc_w 782
    //   1019: aastore
    //   1020: wide
    //   1024: iconst_2
    //   1025: wide
    //   1029: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1032: aastore
    //   1033: wide
    //   1037: wide
    //   1041: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1044: wide
    //   1048: wide
    //   1052: ldc_w 279
    //   1055: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1058: pop
    //   1059: new 315	java/util/ArrayList
    //   1062: dup
    //   1063: invokespecial 381	java/util/ArrayList:<init>	()V
    //   1066: wide
    //   1070: wide
    //   1074: ifnull +25 -> 1099
    //   1077: wide
    //   1081: new 383	org/apache/http/message/BasicNameValuePair
    //   1084: dup
    //   1085: ldc_w 362
    //   1088: wide
    //   1092: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1095: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1098: pop
    //   1099: aload_0
    //   1100: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   1103: aload_0
    //   1104: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   1107: wide
    //   1111: aload 5
    //   1113: wide
    //   1117: aconst_null
    //   1118: invokestatic 399	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/util/ArrayList;Ljava/io/OutputStream;)Ln;
    //   1121: invokevirtual 301	n:a	()Ln;
    //   1124: wide
    //   1128: wide
    //   1132: getfield 428	n:c	I
    //   1135: sipush 200
    //   1138: if_icmpeq +15 -> 1153
    //   1141: aload 9
    //   1143: lload 7
    //   1145: wide
    //   1149: iconst_1
    //   1150: invokevirtual 371	com/twitter/android/provider/ak:a	(JJZ)V
    //   1153: wide
    //   1157: astore 17
    //   1159: goto -748 -> 411
    //   1162: aload_0
    //   1163: aload 9
    //   1165: aload 5
    //   1167: aload_1
    //   1168: invokespecial 1321	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1171: astore 17
    //   1173: goto -762 -> 411
    //   1176: aload_0
    //   1177: aload 5
    //   1179: aload_1
    //   1180: invokespecial 1323	com/twitter/android/service/TwitterService:a	(Lcl;Landroid/content/Intent;)Ln;
    //   1183: astore 17
    //   1185: goto -774 -> 411
    //   1188: aload_0
    //   1189: aload 9
    //   1191: aload 5
    //   1193: aload_1
    //   1194: invokespecial 1325	com/twitter/android/service/TwitterService:b	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1197: astore 17
    //   1199: goto -788 -> 411
    //   1202: aload_0
    //   1203: aload 9
    //   1205: aload 5
    //   1207: aload_1
    //   1208: invokespecial 1327	com/twitter/android/service/TwitterService:c	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1211: astore 17
    //   1213: goto -802 -> 411
    //   1216: aload_0
    //   1217: aload 9
    //   1219: aload 5
    //   1221: aload_1
    //   1222: invokespecial 1329	com/twitter/android/service/TwitterService:d	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1225: astore 17
    //   1227: goto -816 -> 411
    //   1230: aload_0
    //   1231: aload 9
    //   1233: aload 5
    //   1235: aload_1
    //   1236: invokespecial 1331	com/twitter/android/service/TwitterService:e	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1239: astore 17
    //   1241: goto -830 -> 411
    //   1244: aload_0
    //   1245: aload 9
    //   1247: aload 5
    //   1249: aload_1
    //   1250: invokespecial 1333	com/twitter/android/service/TwitterService:f	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1253: astore 17
    //   1255: goto -844 -> 411
    //   1258: aload_1
    //   1259: ldc_w 437
    //   1262: lconst_0
    //   1263: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1266: wide
    //   1270: aload_1
    //   1271: ldc_w 459
    //   1274: lconst_0
    //   1275: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1278: wide
    //   1282: aload_1
    //   1283: ldc_w 457
    //   1286: lconst_0
    //   1287: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1290: wide
    //   1294: aload_1
    //   1295: ldc_w 461
    //   1298: iconst_0
    //   1299: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1302: wide
    //   1306: iload 10
    //   1308: bipush 16
    //   1310: if_icmpne +34 -> 1344
    //   1313: aload_0
    //   1314: aload 9
    //   1316: iconst_1
    //   1317: aload 5
    //   1319: wide
    //   1323: wide
    //   1327: wide
    //   1331: wide
    //   1335: aload_1
    //   1336: invokespecial 1335	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;ILcl;JJJILandroid/content/Intent;)Ln;
    //   1339: astore 17
    //   1341: goto -930 -> 411
    //   1344: aload_0
    //   1345: aload 9
    //   1347: iconst_0
    //   1348: aload 5
    //   1350: wide
    //   1354: wide
    //   1358: wide
    //   1362: wide
    //   1366: aconst_null
    //   1367: invokespecial 1335	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;ILcl;JJJILandroid/content/Intent;)Ln;
    //   1370: astore 17
    //   1372: goto -961 -> 411
    //   1375: aload_1
    //   1376: ldc_w 437
    //   1379: lconst_0
    //   1380: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1383: wide
    //   1387: aload_1
    //   1388: ldc_w 615
    //   1391: aload 9
    //   1393: wide
    //   1397: iconst_0
    //   1398: invokevirtual 597	com/twitter/android/provider/ak:d	(JI)I
    //   1401: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1404: pop
    //   1405: aload_1
    //   1406: ldc_w 665
    //   1409: aload 9
    //   1411: wide
    //   1415: iconst_5
    //   1416: invokevirtual 597	com/twitter/android/provider/ak:d	(JI)I
    //   1419: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1422: pop
    //   1423: aload_1
    //   1424: ldc_w 510
    //   1427: aload 9
    //   1429: invokevirtual 491	com/twitter/android/provider/ak:d	()I
    //   1432: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1435: pop
    //   1436: aconst_null
    //   1437: astore 17
    //   1439: goto -1028 -> 411
    //   1442: aload_0
    //   1443: aload 9
    //   1445: aload 5
    //   1447: aload_1
    //   1448: invokespecial 1337	com/twitter/android/service/TwitterService:g	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1451: astore 17
    //   1453: goto -1042 -> 411
    //   1456: aload_0
    //   1457: aload 9
    //   1459: aload 5
    //   1461: aload_1
    //   1462: ldc_w 1339
    //   1465: lconst_0
    //   1466: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1469: iconst_1
    //   1470: invokespecial 1341	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JZ)Ln;
    //   1473: astore 17
    //   1475: goto -1064 -> 411
    //   1478: aload_0
    //   1479: aload 5
    //   1481: aload_1
    //   1482: invokespecial 1343	com/twitter/android/service/TwitterService:c	(Lcl;Landroid/content/Intent;)Ln;
    //   1485: astore 17
    //   1487: goto -1076 -> 411
    //   1490: aload_0
    //   1491: aload 9
    //   1493: aload_1
    //   1494: ldc_w 799
    //   1497: lconst_0
    //   1498: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1501: aload_1
    //   1502: ldc_w 437
    //   1505: lconst_0
    //   1506: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1509: invokespecial 1022	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;JJ)Ln;
    //   1512: astore 17
    //   1514: goto -1103 -> 411
    //   1517: aload_0
    //   1518: aload 9
    //   1520: aload 5
    //   1522: aload_1
    //   1523: invokespecial 1345	com/twitter/android/service/TwitterService:h	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1526: astore 17
    //   1528: goto -1117 -> 411
    //   1531: aload_1
    //   1532: ldc_w 1007
    //   1535: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1538: wide
    //   1542: aload_1
    //   1543: ldc_w 1292
    //   1546: invokevirtual 1349	android/content/Intent:getSerializableExtra	(Ljava/lang/String;)Ljava/io/Serializable;
    //   1549: checkcast 335	be
    //   1552: wide
    //   1556: aload_0
    //   1557: aload 9
    //   1559: aload 5
    //   1561: lload 7
    //   1563: wide
    //   1567: aload_1
    //   1568: ldc_w 1166
    //   1571: iconst_2
    //   1572: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1575: wide
    //   1579: aload_1
    //   1580: ldc_w 354
    //   1583: lconst_0
    //   1584: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1587: aload_1
    //   1588: invokespecial 1351	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JLjava/lang/String;ILbe;JLandroid/content/Intent;)Ln;
    //   1591: astore 17
    //   1593: goto -1182 -> 411
    //   1596: aload_0
    //   1597: lload 7
    //   1599: aload 9
    //   1601: aload 5
    //   1603: aload_1
    //   1604: invokespecial 1353	com/twitter/android/service/TwitterService:b	(JLcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1607: astore 17
    //   1609: goto -1198 -> 411
    //   1612: aload_0
    //   1613: lload 7
    //   1615: aload 9
    //   1617: aload 5
    //   1619: aload_1
    //   1620: invokespecial 1355	com/twitter/android/service/TwitterService:c	(JLcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1623: astore 17
    //   1625: goto -1214 -> 411
    //   1628: iload 10
    //   1630: bipush 28
    //   1632: if_icmpne +26 -> 1658
    //   1635: iconst_1
    //   1636: wide
    //   1640: aload_0
    //   1641: aload 9
    //   1643: aload 5
    //   1645: aload_1
    //   1646: wide
    //   1650: invokespecial 1357	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;Z)Ln;
    //   1653: astore 17
    //   1655: goto -1244 -> 411
    //   1658: iconst_0
    //   1659: wide
    //   1663: goto -23 -> 1640
    //   1666: aload_0
    //   1667: aload 9
    //   1669: aload 5
    //   1671: aload_1
    //   1672: invokespecial 1359	com/twitter/android/service/TwitterService:i	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1675: astore 17
    //   1677: goto -1266 -> 411
    //   1680: aload_0
    //   1681: aload 9
    //   1683: aload 5
    //   1685: aload_1
    //   1686: invokespecial 1361	com/twitter/android/service/TwitterService:j	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1689: astore 17
    //   1691: goto -1280 -> 411
    //   1694: aload_0
    //   1695: aload 9
    //   1697: aload 5
    //   1699: aload_1
    //   1700: invokespecial 1363	com/twitter/android/service/TwitterService:k	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1703: astore 17
    //   1705: goto -1294 -> 411
    //   1708: aload_0
    //   1709: aload 9
    //   1711: aload 5
    //   1713: aload_1
    //   1714: invokespecial 1365	com/twitter/android/service/TwitterService:l	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1717: astore 17
    //   1719: goto -1308 -> 411
    //   1722: aload_0
    //   1723: aload 9
    //   1725: aload 5
    //   1727: aload_1
    //   1728: invokespecial 1367	com/twitter/android/service/TwitterService:m	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1731: astore 17
    //   1733: goto -1322 -> 411
    //   1736: aload_0
    //   1737: aload 9
    //   1739: aload 5
    //   1741: aload_1
    //   1742: invokespecial 1369	com/twitter/android/service/TwitterService:n	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1745: astore 17
    //   1747: goto -1336 -> 411
    //   1750: aload_0
    //   1751: aload 9
    //   1753: aload 5
    //   1755: aload_1
    //   1756: invokespecial 1371	com/twitter/android/service/TwitterService:o	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   1759: astore 17
    //   1761: goto -1350 -> 411
    //   1764: aload_1
    //   1765: ldc_w 799
    //   1768: lconst_0
    //   1769: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1772: lstore 253
    //   1774: aload_1
    //   1775: ldc_w 437
    //   1778: lconst_0
    //   1779: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1782: lstore 255
    //   1784: aload_1
    //   1785: ldc_w 1032
    //   1788: lconst_0
    //   1789: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   1792: wide
    //   1796: aload_1
    //   1797: ldc_w 932
    //   1800: iconst_0
    //   1801: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1804: wide
    //   1808: wide
    //   1812: tableswitch	default:+24 -> 1836, 4:+55->1867, 5:+196->2008
    //   1837: iconst_0
    //   1838: if_acmpne +22971 -> 24809
    //   1841: aconst_null
    //   1842: aload 89
    //   1844: invokespecial 445	java/lang/StringBuilder:<init>	()V
    //   1847: ldc_w 936
    //   1850: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1853: wide
    //   1857: invokevirtual 650	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1860: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1863: invokespecial 937	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1866: athrow
    //   1867: aload_0
    //   1868: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   1871: wide
    //   1875: iconst_4
    //   1876: anewarray 268	java/lang/Object
    //   1879: wide
    //   1883: wide
    //   1887: iconst_0
    //   1888: lload 253
    //   1890: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1893: aastore
    //   1894: wide
    //   1898: iconst_1
    //   1899: wide
    //   1903: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1906: aastore
    //   1907: wide
    //   1911: iconst_2
    //   1912: ldc_w 1063
    //   1915: aastore
    //   1916: wide
    //   1920: iconst_3
    //   1921: lload 255
    //   1923: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1926: aastore
    //   1927: wide
    //   1931: wide
    //   1935: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1938: wide
    //   1942: wide
    //   1946: ldc_w 279
    //   1949: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1952: pop
    //   1953: aload_0
    //   1954: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   1957: aload_0
    //   1958: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   1961: wide
    //   1965: aload 5
    //   1967: iconst_0
    //   1968: aconst_null
    //   1969: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   1972: invokevirtual 301	n:a	()Ln;
    //   1975: wide
    //   1979: wide
    //   1983: invokevirtual 304	n:b	()Z
    //   1986: ifeq +100 -> 2086
    //   1989: aload 9
    //   1991: wide
    //   1995: iconst_1
    //   1996: invokevirtual 1373	com/twitter/android/provider/ak:b	(JZ)V
    //   1999: wide
    //   2003: astore 17
    //   2005: goto -1594 -> 411
    //   2008: aload_0
    //   2009: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2012: wide
    //   2016: iconst_4
    //   2017: anewarray 268	java/lang/Object
    //   2020: wide
    //   2024: wide
    //   2028: iconst_0
    //   2029: lload 253
    //   2031: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2034: aastore
    //   2035: wide
    //   2039: iconst_1
    //   2040: wide
    //   2044: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2047: aastore
    //   2048: wide
    //   2052: iconst_2
    //   2053: ldc_w 1065
    //   2056: aastore
    //   2057: wide
    //   2061: iconst_3
    //   2062: lload 255
    //   2064: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2067: aastore
    //   2068: wide
    //   2072: wide
    //   2076: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2079: wide
    //   2083: goto -141 -> 1942
    //   2086: wide
    //   2090: getfield 428	n:c	I
    //   2093: sipush 404
    //   2096: if_icmpne -97 -> 1999
    //   2099: aload 9
    //   2101: wide
    //   2105: iconst_0
    //   2106: invokevirtual 1373	com/twitter/android/provider/ak:b	(JZ)V
    //   2109: goto -110 -> 1999
    //   2112: aload_0
    //   2113: aload 9
    //   2115: aload 5
    //   2117: aload_1
    //   2118: ldc_w 1088
    //   2121: lconst_1
    //   2122: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2125: invokespecial 1375	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;J)Ln;
    //   2128: astore 17
    //   2130: goto -1719 -> 411
    //   2133: aload_0
    //   2134: aload 9
    //   2136: aload 5
    //   2138: aload_1
    //   2139: invokespecial 1377	com/twitter/android/service/TwitterService:p	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   2142: astore 17
    //   2144: goto -1733 -> 411
    //   2147: aload_0
    //   2148: aload 9
    //   2150: aload 5
    //   2152: aload_1
    //   2153: invokespecial 1379	com/twitter/android/service/TwitterService:q	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   2156: astore 17
    //   2158: goto -1747 -> 411
    //   2161: aload_0
    //   2162: aload 9
    //   2164: aload 5
    //   2166: aload_1
    //   2167: invokespecial 1381	com/twitter/android/service/TwitterService:r	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   2170: astore 17
    //   2172: goto -1761 -> 411
    //   2175: aload_0
    //   2176: aload 5
    //   2178: aload_1
    //   2179: invokespecial 1383	com/twitter/android/service/TwitterService:d	(Lcl;Landroid/content/Intent;)Ln;
    //   2182: astore 17
    //   2184: goto -1773 -> 411
    //   2187: aload_0
    //   2188: aload 5
    //   2190: aload_1
    //   2191: invokespecial 1385	com/twitter/android/service/TwitterService:e	(Lcl;Landroid/content/Intent;)Ln;
    //   2194: astore 17
    //   2196: goto -1785 -> 411
    //   2199: aload_1
    //   2200: ldc_w 435
    //   2203: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2206: astore 246
    //   2208: aload_1
    //   2209: ldc_w 1387
    //   2212: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2215: astore 247
    //   2217: new 281	java/lang/StringBuilder
    //   2220: dup
    //   2221: aload_0
    //   2222: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2225: getfield 1089	ai:a	Ljava/lang/String;
    //   2228: invokespecial 689	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2231: ldc_w 1389
    //   2234: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2237: astore 248
    //   2239: aload 248
    //   2241: ldc_w 1391
    //   2244: ldc_w 1393
    //   2247: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2250: aload 248
    //   2252: ldc_w 1395
    //   2255: aload 247
    //   2257: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2260: aload 248
    //   2262: ldc_w 1397
    //   2265: aload 246
    //   2267: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2270: new 234	java/io/ByteArrayOutputStream
    //   2273: dup
    //   2274: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   2277: astore 249
    //   2279: aload_0
    //   2280: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2283: aload_0
    //   2284: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   2287: aload 248
    //   2289: new 243	cl
    //   2292: dup
    //   2293: aconst_null
    //   2294: invokespecial 1245	cl:<init>	(Lac;)V
    //   2297: aload 249
    //   2299: invokestatic 785	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/io/OutputStream;)Ln;
    //   2302: invokevirtual 301	n:a	()Ln;
    //   2305: astore 250
    //   2307: aload 250
    //   2309: invokevirtual 304	n:b	()Z
    //   2312: ifeq +39 -> 2351
    //   2315: aload 249
    //   2317: invokestatic 1399	com/twitter/android/service/TwitterService:a	(Ljava/io/ByteArrayOutputStream;)Lac;
    //   2320: astore 251
    //   2322: aload_1
    //   2323: ldc_w 1238
    //   2326: aload 251
    //   2328: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   2331: pop
    //   2332: aload_0
    //   2333: new 243	cl
    //   2336: dup
    //   2337: aload 251
    //   2339: invokespecial 1245	cl:<init>	(Lac;)V
    //   2342: aload_1
    //   2343: invokespecial 1385	com/twitter/android/service/TwitterService:e	(Lcl;Landroid/content/Intent;)Ln;
    //   2346: astore 17
    //   2348: goto -1937 -> 411
    //   2351: aload 250
    //   2353: astore 17
    //   2355: goto -1944 -> 411
    //   2358: aload_1
    //   2359: ldc_w 1401
    //   2362: iconst_m1
    //   2363: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   2366: istore 245
    //   2368: iload 245
    //   2370: iconst_m1
    //   2371: if_icmpeq -1963 -> 408
    //   2374: aload_0
    //   2375: aload 5
    //   2377: iload 245
    //   2379: aload_1
    //   2380: ldc_w 362
    //   2383: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2386: aload_1
    //   2387: ldc_w 1403
    //   2390: lconst_0
    //   2391: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2394: invokespecial 346	com/twitter/android/service/TwitterService:a	(Lcl;ILjava/lang/String;J)V
    //   2397: aconst_null
    //   2398: astore 17
    //   2400: goto -1989 -> 411
    //   2403: aload_1
    //   2404: ldc_w 459
    //   2407: lconst_0
    //   2408: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2411: lstore 240
    //   2413: aload_1
    //   2414: ldc_w 457
    //   2417: lconst_0
    //   2418: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2421: lstore 242
    //   2423: aload_1
    //   2424: ldc_w 461
    //   2427: bipush 100
    //   2429: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   2432: istore 244
    //   2434: aload_0
    //   2435: aload 9
    //   2437: aload_1
    //   2438: ldc_w 991
    //   2441: invokevirtual 1242	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   2444: checkcast 540	ad
    //   2447: aload 5
    //   2449: lload 242
    //   2451: lload 240
    //   2453: iload 244
    //   2455: aload_1
    //   2456: invokespecial 1405	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lad;Lcl;JJILandroid/content/Intent;)Ln;
    //   2459: astore 17
    //   2461: goto -2050 -> 411
    //   2464: aload 9
    //   2466: aload_1
    //   2467: ldc_w 354
    //   2470: lconst_0
    //   2471: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2474: aload_1
    //   2475: ldc_w 1007
    //   2478: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2481: lload 7
    //   2483: aload_1
    //   2484: ldc_w 1407
    //   2487: lconst_0
    //   2488: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2491: aload_1
    //   2492: ldc_w 1292
    //   2495: invokevirtual 1349	android/content/Intent:getSerializableExtra	(Ljava/lang/String;)Ljava/io/Serializable;
    //   2498: checkcast 335	be
    //   2501: invokevirtual 777	com/twitter/android/provider/ak:a	(JLjava/lang/String;JJLbe;)J
    //   2504: pop2
    //   2505: aconst_null
    //   2506: astore 17
    //   2508: goto -2097 -> 411
    //   2511: aload 9
    //   2513: iconst_1
    //   2514: newarray long
    //   2516: dup
    //   2517: iconst_0
    //   2518: aload_1
    //   2519: ldc_w 354
    //   2522: lconst_0
    //   2523: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   2526: lastore
    //   2527: invokevirtual 1410	com/twitter/android/provider/ak:b	([J)I
    //   2530: pop
    //   2531: aconst_null
    //   2532: astore 17
    //   2534: goto -2123 -> 411
    //   2537: lload 7
    //   2539: invokestatic 803	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   2542: astore 231
    //   2544: aload_1
    //   2545: ldc_w 1166
    //   2548: iconst_2
    //   2549: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   2552: istore 232
    //   2554: aload_0
    //   2555: invokevirtual 733	com/twitter/android/service/TwitterService:getContentResolver	()Landroid/content/ContentResolver;
    //   2558: getstatic 1412	com/twitter/android/provider/az:l	Landroid/net/Uri;
    //   2561: invokevirtual 1416	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   2564: aload 231
    //   2566: invokevirtual 1422	android/net/Uri$Builder:appendEncodedPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   2569: ldc_w 1424
    //   2572: aload 231
    //   2574: invokevirtual 1428	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   2577: invokevirtual 1432	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   2580: iconst_4
    //   2581: anewarray 36	java/lang/String
    //   2584: dup
    //   2585: iconst_0
    //   2586: ldc_w 1434
    //   2589: aastore
    //   2590: dup
    //   2591: iconst_1
    //   2592: ldc_w 1436
    //   2595: aastore
    //   2596: dup
    //   2597: iconst_2
    //   2598: ldc_w 1438
    //   2601: aastore
    //   2602: dup
    //   2603: iconst_3
    //   2604: ldc_w 1440
    //   2607: aastore
    //   2608: aconst_null
    //   2609: aconst_null
    //   2610: ldc_w 1442
    //   2613: invokevirtual 1446	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   2616: astore 233
    //   2618: aload 233
    //   2620: ifnull -2212 -> 408
    //   2623: aload 233
    //   2625: invokeinterface 1451 1 0
    //   2630: newarray long
    //   2632: astore 234
    //   2634: aload 233
    //   2636: invokeinterface 1454 1 0
    //   2641: ifeq +65 -> 2706
    //   2644: aload 234
    //   2646: aload 233
    //   2648: invokeinterface 1457 1 0
    //   2653: aload 233
    //   2655: iconst_0
    //   2656: invokeinterface 1460 2 0
    //   2661: lastore
    //   2662: aload_0
    //   2663: aload 9
    //   2665: aload 5
    //   2667: lload 7
    //   2669: aload 233
    //   2671: iconst_1
    //   2672: invokeinterface 1461 2 0
    //   2677: iload 232
    //   2679: aload 233
    //   2681: iconst_2
    //   2682: invokeinterface 1465 2 0
    //   2687: invokestatic 1468	be:a	([B)Lbe;
    //   2690: aload 233
    //   2692: iconst_3
    //   2693: invokeinterface 1460 2 0
    //   2698: aload_1
    //   2699: invokespecial 1351	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JLjava/lang/String;ILbe;JLandroid/content/Intent;)Ln;
    //   2702: pop
    //   2703: goto -69 -> 2634
    //   2706: aload 9
    //   2708: aload 234
    //   2710: invokevirtual 1470	com/twitter/android/provider/ak:c	([J)I
    //   2713: pop
    //   2714: aload 233
    //   2716: invokeinterface 1473 1 0
    //   2721: aconst_null
    //   2722: astore 17
    //   2724: goto -2313 -> 411
    //   2727: aload_0
    //   2728: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2731: iconst_1
    //   2732: anewarray 268	java/lang/Object
    //   2735: dup
    //   2736: iconst_0
    //   2737: ldc_w 1475
    //   2740: aastore
    //   2741: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2744: ldc_w 279
    //   2747: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2750: astore 226
    //   2752: new 234	java/io/ByteArrayOutputStream
    //   2755: dup
    //   2756: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   2759: astore 227
    //   2761: aload_0
    //   2762: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2765: aload_0
    //   2766: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   2769: aload 226
    //   2771: aload 5
    //   2773: iconst_0
    //   2774: aload 227
    //   2776: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   2779: invokevirtual 301	n:a	()Ln;
    //   2782: astore 40
    //   2784: aload 40
    //   2786: invokevirtual 304	n:b	()Z
    //   2789: ifeq +4076 -> 6865
    //   2792: aload 9
    //   2794: aload 227
    //   2796: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   2799: invokestatic 1477	do:m	(Lbq;)Ljava/util/ArrayList;
    //   2802: bipush 6
    //   2804: invokevirtual 638	com/twitter/android/provider/ak:a	(Ljava/util/ArrayList;I)I
    //   2807: pop
    //   2808: aload 40
    //   2810: astore 17
    //   2812: goto -2401 -> 411
    //   2815: astore 228
    //   2817: getstatic 34	com/twitter/android/service/TwitterService:a	Z
    //   2820: ifeq +14 -> 2834
    //   2823: ldc 26
    //   2825: ldc_w 1479
    //   2828: aload 228
    //   2830: invokestatic 351	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2833: pop
    //   2834: aload 40
    //   2836: astore 17
    //   2838: goto -2427 -> 411
    //   2841: aload_0
    //   2842: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2845: iconst_2
    //   2846: anewarray 268	java/lang/Object
    //   2849: dup
    //   2850: iconst_0
    //   2851: ldc_w 431
    //   2854: aastore
    //   2855: dup
    //   2856: iconst_1
    //   2857: ldc_w 1481
    //   2860: aastore
    //   2861: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2864: ldc_w 279
    //   2867: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2870: astore 208
    //   2872: aload_1
    //   2873: ldc_w 1084
    //   2876: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2879: astore 209
    //   2881: aload_1
    //   2882: ldc_w 1088
    //   2885: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   2888: astore 210
    //   2890: aload 209
    //   2892: ifnull +37 -> 2929
    //   2895: aload 210
    //   2897: ifnull +32 -> 2929
    //   2900: aload 208
    //   2902: ldc_w 1084
    //   2905: aload 209
    //   2907: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2910: aload 208
    //   2912: ldc_w 1483
    //   2915: aload 210
    //   2917: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2920: aload 208
    //   2922: ldc_w 1485
    //   2925: iconst_1
    //   2926: invokestatic 467	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    //   2929: aload 208
    //   2931: ldc_w 1487
    //   2934: iconst_1
    //   2935: invokestatic 467	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    //   2938: aload 208
    //   2940: ldc_w 1489
    //   2943: ldc_w 1491
    //   2946: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   2949: new 234	java/io/ByteArrayOutputStream
    //   2952: dup
    //   2953: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   2956: astore 211
    //   2958: aload_0
    //   2959: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   2962: aload_0
    //   2963: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   2966: aload 208
    //   2968: aload 211
    //   2970: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   2973: invokevirtual 301	n:a	()Ln;
    //   2976: astore 212
    //   2978: aload 212
    //   2980: invokevirtual 304	n:b	()Z
    //   2983: ifeq +3941 -> 6924
    //   2986: aload 211
    //   2988: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   2991: invokestatic 1493	do:o	(Lbq;)Ljava/util/ArrayList;
    //   2994: astore 215
    //   2996: aload_1
    //   2997: ldc_w 461
    //   3000: aload 9
    //   3002: aload 215
    //   3004: bipush 7
    //   3006: invokevirtual 638	com/twitter/android/provider/ak:a	(Ljava/util/ArrayList;I)I
    //   3009: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   3012: pop
    //   3013: new 315	java/util/ArrayList
    //   3016: dup
    //   3017: invokespecial 381	java/util/ArrayList:<init>	()V
    //   3020: astore 217
    //   3022: aload 215
    //   3024: invokevirtual 319	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   3027: astore 218
    //   3029: aload 218
    //   3031: invokeinterface 324 1 0
    //   3036: ifeq +63 -> 3099
    //   3039: aload 218
    //   3041: invokeinterface 328 1 0
    //   3046: checkcast 640	dn
    //   3049: astore 224
    //   3051: aload 224
    //   3053: getfield 1495	dn:i	Ljava/util/ArrayList;
    //   3056: ifnull -27 -> 3029
    //   3059: aload 217
    //   3061: aload 224
    //   3063: getfield 1495	dn:i	Ljava/util/ArrayList;
    //   3066: invokevirtual 1496	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   3069: pop
    //   3070: goto -41 -> 3029
    //   3073: astore 213
    //   3075: getstatic 34	com/twitter/android/service/TwitterService:a	Z
    //   3078: ifeq +14 -> 3092
    //   3081: ldc 26
    //   3083: ldc_w 1498
    //   3086: aload 213
    //   3088: invokestatic 351	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   3091: pop
    //   3092: aload 212
    //   3094: astore 17
    //   3096: goto -2685 -> 411
    //   3099: aload_1
    //   3100: ldc_w 799
    //   3103: lconst_0
    //   3104: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3107: lstore 219
    //   3109: aload 9
    //   3111: aload 217
    //   3113: lload 219
    //   3115: iconst_m1
    //   3116: ldc2_w 405
    //   3119: aconst_null
    //   3120: aconst_null
    //   3121: invokevirtual 819	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;)I
    //   3124: pop
    //   3125: aload 215
    //   3127: invokevirtual 319	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   3130: astore 222
    //   3132: aload 222
    //   3134: invokeinterface 324 1 0
    //   3139: ifeq +38 -> 3177
    //   3142: aload 222
    //   3144: invokeinterface 328 1 0
    //   3149: checkcast 640	dn
    //   3152: astore 223
    //   3154: aload 9
    //   3156: aload 223
    //   3158: getfield 1495	dn:i	Ljava/util/ArrayList;
    //   3161: lload 219
    //   3163: bipush 6
    //   3165: aload 223
    //   3167: getfield 642	dn:g	J
    //   3170: aconst_null
    //   3171: invokevirtual 1501	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;)V
    //   3174: goto -42 -> 3132
    //   3177: aload_0
    //   3178: invokevirtual 733	com/twitter/android/service/TwitterService:getContentResolver	()Landroid/content/ContentResolver;
    //   3181: getstatic 1504	com/twitter/android/provider/ay:a	Landroid/net/Uri;
    //   3184: aconst_null
    //   3185: invokevirtual 594	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   3188: aload 212
    //   3190: astore 17
    //   3192: goto -2781 -> 411
    //   3195: aload_1
    //   3196: ldc_w 287
    //   3199: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   3202: astore 200
    //   3204: aload_0
    //   3205: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3208: iconst_3
    //   3209: anewarray 268	java/lang/Object
    //   3212: dup
    //   3213: iconst_0
    //   3214: ldc_w 431
    //   3217: aastore
    //   3218: dup
    //   3219: iconst_1
    //   3220: ldc_w 1481
    //   3223: aastore
    //   3224: dup
    //   3225: iconst_2
    //   3226: aload 200
    //   3228: aastore
    //   3229: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3232: ldc_w 279
    //   3235: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3238: astore 201
    //   3240: new 234	java/io/ByteArrayOutputStream
    //   3243: dup
    //   3244: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   3247: astore 202
    //   3249: aload_0
    //   3250: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3253: aload_0
    //   3254: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   3257: aload 201
    //   3259: aload 5
    //   3261: iconst_0
    //   3262: aload 202
    //   3264: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   3267: invokevirtual 301	n:a	()Ln;
    //   3270: astore 203
    //   3272: aload 203
    //   3274: invokevirtual 304	n:b	()Z
    //   3277: ifeq +3640 -> 6917
    //   3280: aload 202
    //   3282: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   3285: invokestatic 1506	do:p	(Lbq;)Ljava/util/ArrayList;
    //   3288: astore 206
    //   3290: aload 206
    //   3292: ifnonnull +16 -> 3308
    //   3295: aload 203
    //   3297: iconst_0
    //   3298: putfield 428	n:c	I
    //   3301: aload 203
    //   3303: astore 17
    //   3305: goto -2894 -> 411
    //   3308: aload_1
    //   3309: ldc_w 461
    //   3312: aload 9
    //   3314: aload 206
    //   3316: aload_1
    //   3317: ldc_w 799
    //   3320: lconst_0
    //   3321: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3324: bipush 6
    //   3326: aload_1
    //   3327: ldc_w 1032
    //   3330: lconst_0
    //   3331: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3334: ldc_w 946
    //   3337: ldc_w 987
    //   3340: invokevirtual 819	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;)I
    //   3343: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   3346: pop
    //   3347: aload 203
    //   3349: astore 17
    //   3351: goto -2940 -> 411
    //   3354: astore 204
    //   3356: getstatic 34	com/twitter/android/service/TwitterService:a	Z
    //   3359: ifeq +14 -> 3373
    //   3362: ldc 26
    //   3364: ldc_w 1508
    //   3367: aload 204
    //   3369: invokestatic 351	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   3372: pop
    //   3373: aload 203
    //   3375: astore 17
    //   3377: goto -2966 -> 411
    //   3380: aload_1
    //   3381: ldc_w 791
    //   3384: iconst_0
    //   3385: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3388: istore 187
    //   3390: aload_1
    //   3391: ldc_w 437
    //   3394: lconst_0
    //   3395: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3398: lstore 188
    //   3400: aload_1
    //   3401: ldc_w 1510
    //   3404: iconst_0
    //   3405: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3408: istore 190
    //   3410: aload_1
    //   3411: ldc_w 932
    //   3414: bipush 9
    //   3416: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3419: istore 191
    //   3421: aload_0
    //   3422: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3425: iconst_2
    //   3426: anewarray 268	java/lang/Object
    //   3429: dup
    //   3430: iconst_0
    //   3431: ldc_w 431
    //   3434: aastore
    //   3435: dup
    //   3436: iconst_1
    //   3437: ldc_w 1512
    //   3440: aastore
    //   3441: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3444: ldc_w 279
    //   3447: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3450: astore 192
    //   3452: aload 192
    //   3454: ldc_w 1514
    //   3457: aload_1
    //   3458: ldc_w 1514
    //   3461: iconst_1
    //   3462: invokevirtual 1000	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   3465: invokestatic 467	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    //   3468: lload 188
    //   3470: lconst_0
    //   3471: lcmp
    //   3472: ifle +13 -> 3485
    //   3475: aload 192
    //   3477: ldc_w 437
    //   3480: lload 188
    //   3482: invokestatic 440	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;J)V
    //   3485: iload 190
    //   3487: ifle +13 -> 3500
    //   3490: aload 192
    //   3492: ldc_w 1510
    //   3495: iload 190
    //   3497: invokestatic 464	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   3500: new 234	java/io/ByteArrayOutputStream
    //   3503: dup
    //   3504: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   3507: astore 193
    //   3509: aload_0
    //   3510: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3513: aload_0
    //   3514: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   3517: aload 192
    //   3519: aload 5
    //   3521: iconst_0
    //   3522: aload 193
    //   3524: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   3527: invokevirtual 301	n:a	()Ln;
    //   3530: astore 102
    //   3532: aload 102
    //   3534: invokevirtual 304	n:b	()Z
    //   3537: ifeq +3348 -> 6885
    //   3540: aload 193
    //   3542: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   3545: invokestatic 1516	do:w	(Lbq;)Ljava/util/ArrayList;
    //   3548: astore 195
    //   3550: lload 188
    //   3552: lconst_0
    //   3553: lcmp
    //   3554: ifle +39 -> 3593
    //   3557: lload 188
    //   3559: lstore 196
    //   3561: goto +3370 -> 6931
    //   3564: aload_1
    //   3565: ldc_w 461
    //   3568: aload 9
    //   3570: aload 195
    //   3572: lload 196
    //   3574: iload 191
    //   3576: aload 198
    //   3578: aconst_null
    //   3579: invokevirtual 1519	com/twitter/android/provider/ak:a	(Ljava/util/ArrayList;JILjava/lang/String;Ljava/lang/String;)I
    //   3582: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   3585: pop
    //   3586: aload 102
    //   3588: astore 17
    //   3590: goto -3179 -> 411
    //   3593: lload 7
    //   3595: lstore 196
    //   3597: goto +3334 -> 6931
    //   3600: aconst_null
    //   3601: astore 198
    //   3603: goto -39 -> 3564
    //   3606: astore 194
    //   3608: aload 102
    //   3610: iconst_0
    //   3611: putfield 428	n:c	I
    //   3614: aload 102
    //   3616: astore 17
    //   3618: goto -3207 -> 411
    //   3621: aload_1
    //   3622: ldc_w 435
    //   3625: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   3628: astore 179
    //   3630: aload_1
    //   3631: ldc_w 287
    //   3634: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   3637: astore 180
    //   3639: aload_0
    //   3640: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3643: iconst_3
    //   3644: anewarray 268	java/lang/Object
    //   3647: dup
    //   3648: iconst_0
    //   3649: aload 179
    //   3651: aastore
    //   3652: dup
    //   3653: iconst_1
    //   3654: ldc_w 864
    //   3657: aastore
    //   3658: dup
    //   3659: iconst_2
    //   3660: aload 180
    //   3662: aastore
    //   3663: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3666: ldc_w 279
    //   3669: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3672: astore 181
    //   3674: new 234	java/io/ByteArrayOutputStream
    //   3677: dup
    //   3678: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   3681: astore 182
    //   3683: aload_0
    //   3684: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3687: aload_0
    //   3688: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   3691: aload 181
    //   3693: aload 182
    //   3695: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   3698: invokevirtual 301	n:a	()Ln;
    //   3701: astore 17
    //   3703: aload 17
    //   3705: invokevirtual 304	n:b	()Z
    //   3708: ifeq -3297 -> 411
    //   3711: aload 182
    //   3713: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   3716: iconst_0
    //   3717: invokestatic 1037	do:b	(Lbq;I)Lcv;
    //   3720: astore 184
    //   3722: aload_1
    //   3723: ldc_w 1032
    //   3726: aload 184
    //   3728: invokevirtual 1041	cv:a	()J
    //   3731: invokevirtual 676	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   3734: pop
    //   3735: aload_1
    //   3736: ldc_w 799
    //   3739: aload 184
    //   3741: invokevirtual 1522	cv:h	()Lad;
    //   3744: getfield 541	ad:a	J
    //   3747: invokevirtual 676	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   3750: pop
    //   3751: goto -3340 -> 411
    //   3754: astore 183
    //   3756: goto -3345 -> 411
    //   3759: aload_1
    //   3760: ldc_w 799
    //   3763: lconst_0
    //   3764: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3767: lstore 145
    //   3769: aload_1
    //   3770: ldc_w 1524
    //   3773: invokevirtual 1528	android/content/Intent:getStringArrayExtra	(Ljava/lang/String;)[Ljava/lang/String;
    //   3776: astore 147
    //   3778: aload_1
    //   3779: ldc_w 1530
    //   3782: invokevirtual 1528	android/content/Intent:getStringArrayExtra	(Ljava/lang/String;)[Ljava/lang/String;
    //   3785: astore 148
    //   3787: aload_1
    //   3788: ldc_w 437
    //   3791: invokevirtual 1534	android/content/Intent:getLongArrayExtra	(Ljava/lang/String;)[J
    //   3794: astore 149
    //   3796: aload_1
    //   3797: ldc_w 1166
    //   3800: bipush 7
    //   3802: invokevirtual 794	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3805: istore 150
    //   3807: aload_1
    //   3808: ldc_w 1032
    //   3811: ldc2_w 405
    //   3814: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   3817: lstore 151
    //   3819: aload 147
    //   3821: ifnull +330 -> 4151
    //   3824: aload 147
    //   3826: arraylength
    //   3827: istore 153
    //   3829: aload 148
    //   3831: ifnull +326 -> 4157
    //   3834: aload 148
    //   3836: arraylength
    //   3837: istore 154
    //   3839: aload 149
    //   3841: ifnull +322 -> 4163
    //   3844: aload 149
    //   3846: arraylength
    //   3847: istore 155
    //   3849: iload 155
    //   3851: iload 153
    //   3853: iload 154
    //   3855: iadd
    //   3856: iadd
    //   3857: bipush 100
    //   3859: invokestatic 1537	ai:a	(II)I
    //   3862: istore 156
    //   3864: iconst_0
    //   3865: istore 157
    //   3867: iconst_0
    //   3868: istore 158
    //   3870: iload 153
    //   3872: istore 159
    //   3874: iload 155
    //   3876: istore 160
    //   3878: iload 157
    //   3880: iload 156
    //   3882: if_icmpge +315 -> 4197
    //   3885: aload_0
    //   3886: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   3889: iconst_2
    //   3890: anewarray 268	java/lang/Object
    //   3893: dup
    //   3894: iconst_0
    //   3895: ldc_w 431
    //   3898: aastore
    //   3899: dup
    //   3900: iconst_1
    //   3901: ldc_w 1539
    //   3904: aastore
    //   3905: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3908: ldc_w 279
    //   3911: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3914: astore 162
    //   3916: iload 160
    //   3918: ifle +2974 -> 6892
    //   3921: aload 162
    //   3923: ldc_w 437
    //   3926: aload 149
    //   3928: aload 149
    //   3930: arraylength
    //   3931: iload 160
    //   3933: isub
    //   3934: bipush 100
    //   3936: invokestatic 1542	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;[JII)I
    //   3939: istore 176
    //   3941: iload 160
    //   3943: iload 176
    //   3945: isub
    //   3946: istore 177
    //   3948: bipush 100
    //   3950: iload 176
    //   3952: isub
    //   3953: istore 178
    //   3955: iload 177
    //   3957: istore 163
    //   3959: iload 178
    //   3961: istore 164
    //   3963: iload 164
    //   3965: ifle +2945 -> 6910
    //   3968: iload 159
    //   3970: ifle +2940 -> 6910
    //   3973: aload 162
    //   3975: ldc_w 1524
    //   3978: aload 147
    //   3980: aload 147
    //   3982: arraylength
    //   3983: iload 159
    //   3985: isub
    //   3986: iload 164
    //   3988: invokestatic 1545	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;[Ljava/lang/String;II)I
    //   3991: istore 174
    //   3993: iload 159
    //   3995: iload 174
    //   3997: isub
    //   3998: istore 175
    //   4000: iload 164
    //   4002: iload 174
    //   4004: isub
    //   4005: istore 164
    //   4007: iload 175
    //   4009: istore 165
    //   4011: iload 164
    //   4013: ifle +2890 -> 6903
    //   4016: iload 154
    //   4018: ifle +2885 -> 6903
    //   4021: iload 154
    //   4023: aload 162
    //   4025: ldc_w 1530
    //   4028: aload 148
    //   4030: aload 148
    //   4032: arraylength
    //   4033: iload 154
    //   4035: isub
    //   4036: iload 164
    //   4038: invokestatic 1545	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;[Ljava/lang/String;II)I
    //   4041: isub
    //   4042: istore 166
    //   4044: new 234	java/io/ByteArrayOutputStream
    //   4047: dup
    //   4048: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   4051: astore 167
    //   4053: aload_0
    //   4054: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   4057: aload_0
    //   4058: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   4061: aload 162
    //   4063: aload 5
    //   4065: iconst_0
    //   4066: aload 167
    //   4068: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   4071: invokevirtual 301	n:a	()Ln;
    //   4074: astore 168
    //   4076: aload 168
    //   4078: invokevirtual 304	n:b	()Z
    //   4081: ifeq +109 -> 4190
    //   4084: aload 167
    //   4086: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   4089: invokestatic 985	do:b	(Lbq;)Ljava/util/ArrayList;
    //   4092: astore 171
    //   4094: iload 157
    //   4096: ifne +73 -> 4169
    //   4099: ldc_w 946
    //   4102: astore 172
    //   4104: aload 9
    //   4106: aload 171
    //   4108: lload 145
    //   4110: iload 150
    //   4112: lload 151
    //   4114: aload 172
    //   4116: aconst_null
    //   4117: invokevirtual 819	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;)I
    //   4120: istore 173
    //   4122: iload 173
    //   4124: iload 158
    //   4126: iadd
    //   4127: istore 169
    //   4129: iinc 157 1
    //   4132: iload 165
    //   4134: istore 159
    //   4136: iload 169
    //   4138: istore 158
    //   4140: iload 163
    //   4142: istore 160
    //   4144: iload 166
    //   4146: istore 154
    //   4148: goto -270 -> 3878
    //   4151: iconst_0
    //   4152: istore 153
    //   4154: goto -325 -> 3829
    //   4157: iconst_0
    //   4158: istore 154
    //   4160: goto -321 -> 3839
    //   4163: iconst_0
    //   4164: istore 155
    //   4166: goto -317 -> 3849
    //   4169: aconst_null
    //   4170: astore 172
    //   4172: goto -68 -> 4104
    //   4175: astore 170
    //   4177: aload 168
    //   4179: iconst_0
    //   4180: putfield 428	n:c	I
    //   4183: aload 168
    //   4185: aload 170
    //   4187: putfield 518	n:e	Ljava/lang/Exception;
    //   4190: iload 158
    //   4192: istore 169
    //   4194: goto -65 -> 4129
    //   4197: aload_1
    //   4198: ldc_w 461
    //   4201: iload 158
    //   4203: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   4206: pop
    //   4207: aconst_null
    //   4208: astore 17
    //   4210: goto -3799 -> 411
    //   4213: aload_1
    //   4214: ldc_w 1026
    //   4217: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4220: astore 109
    //   4222: aload_1
    //   4223: ldc_w 435
    //   4226: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4229: astore 110
    //   4231: aload_1
    //   4232: ldc_w 1524
    //   4235: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4238: astore 111
    //   4240: aload_1
    //   4241: ldc_w 1387
    //   4244: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4247: astore 112
    //   4249: aload_1
    //   4250: ldc_w 1080
    //   4253: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4256: astore 113
    //   4258: aload_1
    //   4259: ldc_w 287
    //   4262: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4265: astore 114
    //   4267: aload_1
    //   4268: ldc_w 1084
    //   4271: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   4274: astore 115
    //   4276: aload_1
    //   4277: ldc_w 1026
    //   4280: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4283: aload_1
    //   4284: ldc_w 1524
    //   4287: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4290: aload_1
    //   4291: ldc_w 435
    //   4294: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4297: aload_1
    //   4298: ldc_w 1387
    //   4301: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4304: aload_1
    //   4305: ldc_w 1080
    //   4308: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4311: aload_1
    //   4312: ldc_w 287
    //   4315: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4318: aload_1
    //   4319: ldc_w 1084
    //   4322: invokevirtual 1548	android/content/Intent:removeExtra	(Ljava/lang/String;)V
    //   4325: aload_0
    //   4326: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   4329: getfield 1549	ai:c	Ljava/lang/String;
    //   4332: iconst_1
    //   4333: anewarray 268	java/lang/Object
    //   4336: dup
    //   4337: iconst_0
    //   4338: ldc_w 1551
    //   4341: aastore
    //   4342: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4345: astore 116
    //   4347: new 315	java/util/ArrayList
    //   4350: dup
    //   4351: invokespecial 381	java/util/ArrayList:<init>	()V
    //   4354: astore 117
    //   4356: aload 109
    //   4358: ifnull +21 -> 4379
    //   4361: aload 117
    //   4363: new 383	org/apache/http/message/BasicNameValuePair
    //   4366: dup
    //   4367: ldc_w 1553
    //   4370: aload 109
    //   4372: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4375: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4378: pop
    //   4379: aload 110
    //   4381: ifnull +21 -> 4402
    //   4384: aload 117
    //   4386: new 383	org/apache/http/message/BasicNameValuePair
    //   4389: dup
    //   4390: ldc_w 435
    //   4393: aload 110
    //   4395: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4398: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4401: pop
    //   4402: aload 111
    //   4404: ifnull +21 -> 4425
    //   4407: aload 117
    //   4409: new 383	org/apache/http/message/BasicNameValuePair
    //   4412: dup
    //   4413: ldc_w 1524
    //   4416: aload 111
    //   4418: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4421: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4424: pop
    //   4425: aload 112
    //   4427: ifnull +21 -> 4448
    //   4430: aload 117
    //   4432: new 383	org/apache/http/message/BasicNameValuePair
    //   4435: dup
    //   4436: ldc_w 1555
    //   4439: aload 112
    //   4441: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4444: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4447: pop
    //   4448: aload 115
    //   4450: ifnull +21 -> 4471
    //   4453: aload 117
    //   4455: new 383	org/apache/http/message/BasicNameValuePair
    //   4458: dup
    //   4459: ldc_w 1084
    //   4462: aload 115
    //   4464: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4467: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4470: pop
    //   4471: aload 113
    //   4473: ifnull +44 -> 4517
    //   4476: aload 114
    //   4478: ifnull +39 -> 4517
    //   4481: aload 117
    //   4483: new 383	org/apache/http/message/BasicNameValuePair
    //   4486: dup
    //   4487: ldc_w 1557
    //   4490: aload 113
    //   4492: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4495: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4498: pop
    //   4499: aload 117
    //   4501: new 383	org/apache/http/message/BasicNameValuePair
    //   4504: dup
    //   4505: ldc_w 1559
    //   4508: aload 114
    //   4510: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   4513: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4516: pop
    //   4517: new 234	java/io/ByteArrayOutputStream
    //   4520: dup
    //   4521: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   4524: astore 118
    //   4526: aload_0
    //   4527: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   4530: aload_0
    //   4531: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   4534: aload 116
    //   4536: new 243	cl
    //   4539: dup
    //   4540: aconst_null
    //   4541: getstatic 1560	cl:a	Ljava/lang/String;
    //   4544: getstatic 1561	cl:b	Ljava/lang/String;
    //   4547: invokespecial 1564	cl:<init>	(Lac;Ljava/lang/String;Ljava/lang/String;)V
    //   4550: aload 117
    //   4552: aload 118
    //   4554: invokestatic 399	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/util/ArrayList;Ljava/io/OutputStream;)Ln;
    //   4557: astore 17
    //   4559: aload 17
    //   4561: invokevirtual 301	n:a	()Ln;
    //   4564: pop
    //   4565: aload 17
    //   4567: invokevirtual 304	n:b	()Z
    //   4570: ifeq +51 -> 4621
    //   4573: aload 118
    //   4575: invokestatic 1399	com/twitter/android/service/TwitterService:a	(Ljava/io/ByteArrayOutputStream;)Lac;
    //   4578: astore 136
    //   4580: aload_1
    //   4581: ldc_w 1238
    //   4584: aload 136
    //   4586: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   4589: pop
    //   4590: aload_0
    //   4591: new 243	cl
    //   4594: dup
    //   4595: aload 136
    //   4597: invokespecial 1245	cl:<init>	(Lac;)V
    //   4600: aload_1
    //   4601: invokespecial 1385	com/twitter/android/service/TwitterService:e	(Lcl;Landroid/content/Intent;)Ln;
    //   4604: invokevirtual 304	n:b	()Z
    //   4607: ifne -4196 -> 411
    //   4610: aload 17
    //   4612: sipush 400
    //   4615: putfield 428	n:c	I
    //   4618: goto -4207 -> 411
    //   4621: aload 17
    //   4623: getfield 428	n:c	I
    //   4626: sipush 403
    //   4629: if_icmpne +257 -> 4886
    //   4632: new 36	java/lang/String
    //   4635: dup
    //   4636: aload 118
    //   4638: invokevirtual 238	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   4641: invokespecial 241	java/lang/String:<init>	([B)V
    //   4644: astore 120
    //   4646: new 905	org/json/JSONObject
    //   4649: dup
    //   4650: aload 120
    //   4652: invokespecial 906	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   4655: astore 121
    //   4657: aload 121
    //   4659: ldc_w 1553
    //   4662: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4665: ifeq +44 -> 4709
    //   4668: aload 121
    //   4670: ldc_w 1553
    //   4673: invokevirtual 919	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   4676: astore 129
    //   4678: aload 129
    //   4680: invokevirtual 1568	org/json/JSONArray:length	()I
    //   4683: ifle +26 -> 4709
    //   4686: aload_1
    //   4687: ldc_w 1026
    //   4690: getstatic 1572	f:a	Lf;
    //   4693: aload 129
    //   4695: iconst_0
    //   4696: invokevirtual 1573	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   4699: invokevirtual 1576	f:a	(Ljava/lang/String;)Ldx;
    //   4702: getfield 1579	dx:a	Ljava/lang/String;
    //   4705: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4708: pop
    //   4709: aload 121
    //   4711: ldc_w 1524
    //   4714: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4717: ifeq +44 -> 4761
    //   4720: aload 121
    //   4722: ldc_w 1524
    //   4725: invokevirtual 919	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   4728: astore 127
    //   4730: aload 127
    //   4732: invokevirtual 1568	org/json/JSONArray:length	()I
    //   4735: ifle +26 -> 4761
    //   4738: aload_1
    //   4739: ldc_w 1524
    //   4742: getstatic 1572	f:a	Lf;
    //   4745: aload 127
    //   4747: iconst_0
    //   4748: invokevirtual 1573	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   4751: invokevirtual 1576	f:a	(Ljava/lang/String;)Ldx;
    //   4754: getfield 1579	dx:a	Ljava/lang/String;
    //   4757: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4760: pop
    //   4761: aload 121
    //   4763: ldc_w 435
    //   4766: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4769: ifeq +44 -> 4813
    //   4772: aload 121
    //   4774: ldc_w 435
    //   4777: invokevirtual 919	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   4780: astore 125
    //   4782: aload 125
    //   4784: invokevirtual 1568	org/json/JSONArray:length	()I
    //   4787: ifle +26 -> 4813
    //   4790: aload_1
    //   4791: ldc_w 435
    //   4794: getstatic 1572	f:a	Lf;
    //   4797: aload 125
    //   4799: iconst_0
    //   4800: invokevirtual 1573	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   4803: invokevirtual 1576	f:a	(Ljava/lang/String;)Ldx;
    //   4806: getfield 1579	dx:a	Ljava/lang/String;
    //   4809: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4812: pop
    //   4813: aload 121
    //   4815: ldc_w 1555
    //   4818: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4821: ifeq -4410 -> 411
    //   4824: aload 121
    //   4826: ldc_w 1555
    //   4829: invokevirtual 919	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   4832: astore 123
    //   4834: aload 123
    //   4836: invokevirtual 1568	org/json/JSONArray:length	()I
    //   4839: ifle -4428 -> 411
    //   4842: aload_1
    //   4843: ldc_w 1387
    //   4846: getstatic 1572	f:a	Lf;
    //   4849: aload 123
    //   4851: iconst_0
    //   4852: invokevirtual 1573	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   4855: invokevirtual 1576	f:a	(Ljava/lang/String;)Ldx;
    //   4858: getfield 1579	dx:a	Ljava/lang/String;
    //   4861: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4864: pop
    //   4865: goto -4454 -> 411
    //   4868: astore 122
    //   4870: aload 17
    //   4872: iconst_0
    //   4873: putfield 428	n:c	I
    //   4876: aload 17
    //   4878: aload 122
    //   4880: putfield 518	n:e	Ljava/lang/Exception;
    //   4883: goto -4472 -> 411
    //   4886: aload 17
    //   4888: getfield 428	n:c	I
    //   4891: sipush 412
    //   4894: if_icmpne -4483 -> 411
    //   4897: new 36	java/lang/String
    //   4900: dup
    //   4901: aload 118
    //   4903: invokevirtual 238	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   4906: invokespecial 241	java/lang/String:<init>	([B)V
    //   4909: astore 131
    //   4911: new 905	org/json/JSONObject
    //   4914: dup
    //   4915: aload 131
    //   4917: invokespecial 906	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   4920: astore 132
    //   4922: aload 132
    //   4924: ldc_w 1557
    //   4927: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4930: ifeq +67 -> 4997
    //   4933: aload 132
    //   4935: ldc_w 1581
    //   4938: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   4941: ifeq +56 -> 4997
    //   4944: aload_1
    //   4945: ldc_w 1080
    //   4948: aload 132
    //   4950: ldc_w 1557
    //   4953: invokevirtual 910	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   4956: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4959: pop
    //   4960: aload_1
    //   4961: ldc_w 287
    //   4964: aload 132
    //   4966: ldc_w 1581
    //   4969: invokevirtual 910	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   4972: invokevirtual 913	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4975: pop
    //   4976: goto -4565 -> 411
    //   4979: astore 133
    //   4981: aload 17
    //   4983: iconst_0
    //   4984: putfield 428	n:c	I
    //   4987: aload 17
    //   4989: aload 133
    //   4991: putfield 518	n:e	Ljava/lang/Exception;
    //   4994: goto -4583 -> 411
    //   4997: aload 17
    //   4999: iconst_0
    //   5000: putfield 428	n:c	I
    //   5003: goto -4592 -> 411
    //   5006: aload_1
    //   5007: ldc_w 437
    //   5010: invokevirtual 1534	android/content/Intent:getLongArrayExtra	(Ljava/lang/String;)[J
    //   5013: astore 99
    //   5015: aload 99
    //   5017: arraylength
    //   5018: bipush 100
    //   5020: invokestatic 1537	ai:a	(II)I
    //   5023: istore 100
    //   5025: iconst_0
    //   5026: istore 101
    //   5028: aconst_null
    //   5029: astore 102
    //   5031: iconst_0
    //   5032: istore 103
    //   5034: iconst_0
    //   5035: istore 104
    //   5037: iload 103
    //   5039: iload 100
    //   5041: if_icmpge +120 -> 5161
    //   5044: aload_0
    //   5045: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5048: iconst_2
    //   5049: anewarray 268	java/lang/Object
    //   5052: dup
    //   5053: iconst_0
    //   5054: ldc_w 521
    //   5057: aastore
    //   5058: dup
    //   5059: iconst_1
    //   5060: ldc_w 1583
    //   5063: aastore
    //   5064: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5067: ldc_w 279
    //   5070: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5073: astore 105
    //   5075: aload 105
    //   5077: ldc_w 437
    //   5080: aload 99
    //   5082: iload 103
    //   5084: bipush 100
    //   5086: imul
    //   5087: bipush 100
    //   5089: invokestatic 1542	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;[JII)I
    //   5092: pop
    //   5093: new 234	java/io/ByteArrayOutputStream
    //   5096: dup
    //   5097: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   5100: astore 107
    //   5102: aload_0
    //   5103: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5106: aload_0
    //   5107: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5110: aload 105
    //   5112: aload 5
    //   5114: aload 107
    //   5116: invokestatic 785	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/io/OutputStream;)Ln;
    //   5119: invokevirtual 301	n:a	()Ln;
    //   5122: astore 102
    //   5124: aload 102
    //   5126: invokevirtual 304	n:b	()Z
    //   5129: ifeq +26 -> 5155
    //   5132: aload 9
    //   5134: aload 107
    //   5136: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   5139: invokestatic 1585	do:q	(Lbq;)Ljava/util/ArrayList;
    //   5142: iconst_1
    //   5143: invokevirtual 1588	com/twitter/android/provider/ak:a	(Ljava/util/ArrayList;Z)V
    //   5146: iconst_1
    //   5147: istore 101
    //   5149: iinc 103 1
    //   5152: goto -115 -> 5037
    //   5155: iconst_1
    //   5156: istore 104
    //   5158: goto -9 -> 5149
    //   5161: iload 104
    //   5163: ifeq +1722 -> 6885
    //   5166: iload 101
    //   5168: ifeq +1717 -> 6885
    //   5171: aload 102
    //   5173: sipush 418
    //   5176: putfield 428	n:c	I
    //   5179: aload 102
    //   5181: astore 17
    //   5183: goto -4772 -> 411
    //   5186: aload_0
    //   5187: aload 5
    //   5189: aload_1
    //   5190: invokespecial 1590	com/twitter/android/service/TwitterService:b	(Lcl;Landroid/content/Intent;)Ln;
    //   5193: astore 17
    //   5195: goto -4784 -> 411
    //   5198: iload 10
    //   5200: bipush 58
    //   5202: if_icmpne +159 -> 5361
    //   5205: iconst_1
    //   5206: istore 92
    //   5208: aload_0
    //   5209: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5212: iconst_2
    //   5213: anewarray 268	java/lang/Object
    //   5216: dup
    //   5217: iconst_0
    //   5218: ldc_w 414
    //   5221: aastore
    //   5222: dup
    //   5223: iconst_1
    //   5224: ldc_w 855
    //   5227: aastore
    //   5228: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5231: ldc_w 279
    //   5234: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5237: astore 93
    //   5239: new 234	java/io/ByteArrayOutputStream
    //   5242: dup
    //   5243: sipush 512
    //   5246: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   5249: astore 94
    //   5251: iload 92
    //   5253: ifeq +114 -> 5367
    //   5256: new 315	java/util/ArrayList
    //   5259: dup
    //   5260: invokespecial 381	java/util/ArrayList:<init>	()V
    //   5263: astore 95
    //   5265: aload 95
    //   5267: new 383	org/apache/http/message/BasicNameValuePair
    //   5270: dup
    //   5271: ldc_w 1592
    //   5274: aload_1
    //   5275: ldc_w 950
    //   5278: iconst_1
    //   5279: invokevirtual 1000	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   5282: invokestatic 1595	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   5285: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   5288: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   5291: pop
    //   5292: aload_0
    //   5293: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5296: aload_0
    //   5297: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5300: aload 93
    //   5302: aload 5
    //   5304: aload 95
    //   5306: aload 94
    //   5308: invokestatic 399	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/util/ArrayList;Ljava/io/OutputStream;)Ln;
    //   5311: invokevirtual 301	n:a	()Ln;
    //   5314: astore 17
    //   5316: aload 17
    //   5318: invokevirtual 304	n:b	()Z
    //   5321: ifeq -4910 -> 411
    //   5324: aload_1
    //   5325: ldc_w 855
    //   5328: aload 94
    //   5330: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   5333: invokestatic 1600	cb:a	(Lbq;)Lcb;
    //   5336: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   5339: pop
    //   5340: goto -4929 -> 411
    //   5343: astore 97
    //   5345: aload 17
    //   5347: iconst_0
    //   5348: putfield 428	n:c	I
    //   5351: aload 17
    //   5353: aload 97
    //   5355: putfield 518	n:e	Ljava/lang/Exception;
    //   5358: goto -4947 -> 411
    //   5361: iconst_0
    //   5362: istore 92
    //   5364: goto -156 -> 5208
    //   5367: aload_0
    //   5368: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5371: aload_0
    //   5372: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5375: aload 93
    //   5377: aload 5
    //   5379: iconst_0
    //   5380: aload 94
    //   5382: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   5385: invokevirtual 301	n:a	()Ln;
    //   5388: astore 17
    //   5390: goto -74 -> 5316
    //   5393: aload_1
    //   5394: ldc_w 1339
    //   5397: invokevirtual 1534	android/content/Intent:getLongArrayExtra	(Ljava/lang/String;)[J
    //   5400: astore 88
    //   5402: aload 88
    //   5404: ifnull -4996 -> 408
    //   5407: aload 88
    //   5409: arraylength
    //   5410: istore 89
    //   5412: iconst_0
    //   5413: istore 90
    //   5415: iload 90
    //   5417: iload 89
    //   5419: if_icmpge +29 -> 5448
    //   5422: aload_0
    //   5423: lload 7
    //   5425: aload_0
    //   5426: aload 9
    //   5428: aload 5
    //   5430: aload 88
    //   5432: iload 90
    //   5434: laload
    //   5435: iconst_0
    //   5436: invokespecial 1341	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JZ)Ln;
    //   5439: invokestatic 1255	com/twitter/android/service/ScribeService:a	(Landroid/content/Context;JLn;)V
    //   5442: iinc 90 1
    //   5445: goto -30 -> 5415
    //   5448: aload 9
    //   5450: aload 88
    //   5452: invokevirtual 1602	com/twitter/android/provider/ak:d	([J)I
    //   5455: pop
    //   5456: aconst_null
    //   5457: astore 17
    //   5459: goto -5048 -> 411
    //   5462: aload_0
    //   5463: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5466: getfield 1549	ai:c	Ljava/lang/String;
    //   5469: iconst_2
    //   5470: anewarray 268	java/lang/Object
    //   5473: dup
    //   5474: iconst_0
    //   5475: ldc_w 1604
    //   5478: aastore
    //   5479: dup
    //   5480: iconst_1
    //   5481: ldc_w 1606
    //   5484: aastore
    //   5485: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5488: ldc_w 279
    //   5491: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5494: astore 84
    //   5496: new 234	java/io/ByteArrayOutputStream
    //   5499: dup
    //   5500: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   5503: astore 85
    //   5505: aload_0
    //   5506: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5509: aload_0
    //   5510: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5513: aload 84
    //   5515: aload 85
    //   5517: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   5520: invokevirtual 301	n:a	()Ln;
    //   5523: astore 17
    //   5525: aload 17
    //   5527: invokevirtual 304	n:b	()Z
    //   5530: ifeq -5119 -> 411
    //   5533: aload_1
    //   5534: ldc_w 855
    //   5537: aload 85
    //   5539: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   5542: invokestatic 1609	do:r	(Lbq;)Lay;
    //   5545: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   5548: pop
    //   5549: goto -5138 -> 411
    //   5552: astore 86
    //   5554: aload 17
    //   5556: iconst_0
    //   5557: putfield 428	n:c	I
    //   5560: aload 17
    //   5562: aload 86
    //   5564: putfield 518	n:e	Ljava/lang/Exception;
    //   5567: goto -5156 -> 411
    //   5570: aload_0
    //   5571: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5574: iconst_2
    //   5575: anewarray 268	java/lang/Object
    //   5578: dup
    //   5579: iconst_0
    //   5580: ldc_w 1475
    //   5583: aastore
    //   5584: dup
    //   5585: iconst_1
    //   5586: ldc_w 375
    //   5589: aastore
    //   5590: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5593: ldc_w 279
    //   5596: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5599: astore 76
    //   5601: aload_1
    //   5602: ldc_w 287
    //   5605: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   5608: astore 77
    //   5610: new 234	java/io/ByteArrayOutputStream
    //   5613: dup
    //   5614: invokespecial 291	java/io/ByteArrayOutputStream:<init>	()V
    //   5617: astore 78
    //   5619: new 315	java/util/ArrayList
    //   5622: dup
    //   5623: iconst_1
    //   5624: invokespecial 1020	java/util/ArrayList:<init>	(I)V
    //   5627: astore 79
    //   5629: aload 79
    //   5631: new 383	org/apache/http/message/BasicNameValuePair
    //   5634: dup
    //   5635: ldc_w 1610
    //   5638: aload 77
    //   5640: invokespecial 384	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   5643: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   5646: pop
    //   5647: aload_0
    //   5648: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5651: aload_0
    //   5652: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5655: aload 76
    //   5657: invokevirtual 396	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5660: aload 5
    //   5662: aload 79
    //   5664: aload 78
    //   5666: invokestatic 399	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/util/ArrayList;Ljava/io/OutputStream;)Ln;
    //   5669: invokevirtual 301	n:a	()Ln;
    //   5672: astore 40
    //   5674: aload 40
    //   5676: invokevirtual 304	n:b	()Z
    //   5679: ifeq +1186 -> 6865
    //   5682: aload 9
    //   5684: aload 78
    //   5686: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   5689: invokestatic 1613	do:n	(Lbq;)Ldn;
    //   5692: bipush 6
    //   5694: invokevirtual 1616	com/twitter/android/provider/ak:a	(Ldn;I)J
    //   5697: pop2
    //   5698: aload 40
    //   5700: astore 17
    //   5702: goto -5291 -> 411
    //   5705: astore 81
    //   5707: aload 40
    //   5709: iconst_0
    //   5710: putfield 428	n:c	I
    //   5713: aload 40
    //   5715: aload 81
    //   5717: putfield 518	n:e	Ljava/lang/Exception;
    //   5720: aload 40
    //   5722: astore 17
    //   5724: goto -5313 -> 411
    //   5727: aload 9
    //   5729: aload_1
    //   5730: ldc_w 287
    //   5733: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   5736: bipush 6
    //   5738: invokevirtual 1619	com/twitter/android/provider/ak:a	(Ljava/lang/String;I)J
    //   5741: lstore 69
    //   5743: aload_0
    //   5744: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5747: astore 71
    //   5749: iconst_3
    //   5750: anewarray 268	java/lang/Object
    //   5753: astore 72
    //   5755: aload 72
    //   5757: iconst_0
    //   5758: ldc_w 1475
    //   5761: aastore
    //   5762: aload 72
    //   5764: iconst_1
    //   5765: ldc_w 782
    //   5768: aastore
    //   5769: aload 72
    //   5771: iconst_2
    //   5772: lload 69
    //   5774: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5777: aastore
    //   5778: aload 71
    //   5780: aload 72
    //   5782: invokevirtual 277	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5785: ldc_w 279
    //   5788: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5791: astore 73
    //   5793: aload_0
    //   5794: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5797: aload_0
    //   5798: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   5801: aload 73
    //   5803: aload 5
    //   5805: aconst_null
    //   5806: invokestatic 785	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Ljava/io/OutputStream;)Ln;
    //   5809: invokevirtual 301	n:a	()Ln;
    //   5812: astore 74
    //   5814: aload 74
    //   5816: getfield 428	n:c	I
    //   5819: sipush 200
    //   5822: if_icmpeq +14 -> 5836
    //   5825: aload 74
    //   5827: getfield 428	n:c	I
    //   5830: sipush 404
    //   5833: if_icmpne +1045 -> 6878
    //   5836: aload 9
    //   5838: lload 69
    //   5840: invokevirtual 1622	com/twitter/android/provider/ak:b	(J)I
    //   5843: pop
    //   5844: aload 74
    //   5846: astore 17
    //   5848: goto -5437 -> 411
    //   5851: aload_0
    //   5852: aload 9
    //   5854: aload 5
    //   5856: aload_1
    //   5857: invokespecial 1624	com/twitter/android/service/TwitterService:s	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   5860: astore 17
    //   5862: goto -5451 -> 411
    //   5865: aload_0
    //   5866: aload 9
    //   5868: aload 5
    //   5870: aload_1
    //   5871: invokespecial 1626	com/twitter/android/service/TwitterService:t	(Lcom/twitter/android/provider/ak;Lcl;Landroid/content/Intent;)Ln;
    //   5874: astore 17
    //   5876: goto -5465 -> 411
    //   5879: aload_1
    //   5880: ldc_w 287
    //   5883: invokevirtual 1534	android/content/Intent:getLongArrayExtra	(Ljava/lang/String;)[J
    //   5886: ifnull +16 -> 5902
    //   5889: aload 9
    //   5891: aload_1
    //   5892: ldc_w 287
    //   5895: invokevirtual 1534	android/content/Intent:getLongArrayExtra	(Ljava/lang/String;)[J
    //   5898: invokevirtual 1628	com/twitter/android/provider/ak:a	([J)I
    //   5901: pop
    //   5902: aload_0
    //   5903: invokestatic 496	com/twitter/android/provider/q:a	(Landroid/content/Context;)Lcom/twitter/android/provider/q;
    //   5906: aload 6
    //   5908: ldc_w 1630
    //   5911: iconst_0
    //   5912: invokevirtual 503	com/twitter/android/provider/q:a	(Ljava/lang/String;Ljava/lang/String;I)I
    //   5915: pop
    //   5916: aconst_null
    //   5917: astore 17
    //   5919: goto -5508 -> 411
    //   5922: aload_1
    //   5923: ldc_w 354
    //   5926: lconst_0
    //   5927: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   5930: lstore 51
    //   5932: aload_1
    //   5933: ldc_w 437
    //   5936: lconst_0
    //   5937: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   5940: lstore 53
    //   5942: aload_1
    //   5943: ldc_w 287
    //   5946: lconst_0
    //   5947: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   5950: lstore 55
    //   5952: lload 55
    //   5954: lconst_0
    //   5955: lcmp
    //   5956: ifle +916 -> 6872
    //   5959: aload_0
    //   5960: aload 9
    //   5962: aload 5
    //   5964: lload 53
    //   5966: bipush 10
    //   5968: lconst_0
    //   5969: lload 55
    //   5971: lconst_0
    //   5972: iconst_0
    //   5973: iconst_0
    //   5974: new 356	android/content/Intent
    //   5977: dup
    //   5978: invokespecial 1631	android/content/Intent:<init>	()V
    //   5981: invokespecial 1317	com/twitter/android/service/TwitterService:a	(Lcom/twitter/android/provider/ak;Lcl;JIJJJIZLandroid/content/Intent;)Ln;
    //   5984: invokevirtual 304	n:b	()Z
    //   5987: ifeq +885 -> 6872
    //   5990: iconst_0
    //   5991: iconst_1
    //   5992: iadd
    //   5993: istore 57
    //   5995: aload_0
    //   5996: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   5999: getfield 1632	ai:b	Ljava/lang/String;
    //   6002: astore 58
    //   6004: iconst_3
    //   6005: anewarray 268	java/lang/Object
    //   6008: astore 59
    //   6010: aload 59
    //   6012: iconst_0
    //   6013: ldc_w 1634
    //   6016: aastore
    //   6017: aload 59
    //   6019: iconst_1
    //   6020: ldc_w 433
    //   6023: aastore
    //   6024: aload 59
    //   6026: iconst_2
    //   6027: lload 51
    //   6029: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6032: aastore
    //   6033: aload 58
    //   6035: aload 59
    //   6037: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6040: ldc_w 279
    //   6043: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6046: astore 60
    //   6048: new 234	java/io/ByteArrayOutputStream
    //   6051: dup
    //   6052: sipush 1024
    //   6055: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   6058: astore 61
    //   6060: aload_0
    //   6061: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6064: aload_0
    //   6065: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   6068: aload 60
    //   6070: aload 61
    //   6072: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   6075: invokevirtual 301	n:a	()Ln;
    //   6078: astore 62
    //   6080: aload 62
    //   6082: invokevirtual 304	n:b	()Z
    //   6085: ifeq +68 -> 6153
    //   6088: aload 9
    //   6090: aload 61
    //   6092: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   6095: invokestatic 1637	do:v	(Lbq;)Ljava/util/ArrayList;
    //   6098: lload 53
    //   6100: bipush 10
    //   6102: ldc2_w 405
    //   6105: iconst_1
    //   6106: iconst_0
    //   6107: aconst_null
    //   6108: iconst_0
    //   6109: invokevirtual 409	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJZZLjava/lang/String;Z)I
    //   6112: istore 66
    //   6114: iload 66
    //   6116: iload 57
    //   6118: iadd
    //   6119: istore 63
    //   6121: aload_1
    //   6122: ldc_w 613
    //   6125: iload 63
    //   6127: invokevirtual 508	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   6130: pop
    //   6131: aload 62
    //   6133: astore 17
    //   6135: goto -5724 -> 411
    //   6138: astore 65
    //   6140: aload 62
    //   6142: iconst_0
    //   6143: putfield 428	n:c	I
    //   6146: aload 62
    //   6148: aload 65
    //   6150: putfield 518	n:e	Ljava/lang/Exception;
    //   6153: iload 57
    //   6155: istore 63
    //   6157: goto -36 -> 6121
    //   6160: aload_1
    //   6161: ldc_w 1524
    //   6164: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6167: astore 44
    //   6169: aload_1
    //   6170: ldc_w 1084
    //   6173: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6176: astore 45
    //   6178: aload_0
    //   6179: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6182: getfield 1089	ai:a	Ljava/lang/String;
    //   6185: iconst_3
    //   6186: anewarray 268	java/lang/Object
    //   6189: dup
    //   6190: iconst_0
    //   6191: ldc_w 1090
    //   6194: aastore
    //   6195: dup
    //   6196: iconst_1
    //   6197: ldc_w 431
    //   6200: aastore
    //   6201: dup
    //   6202: iconst_2
    //   6203: ldc_w 1639
    //   6206: aastore
    //   6207: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6210: ldc_w 279
    //   6213: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6216: astore 46
    //   6218: aload 46
    //   6220: ldc_w 1524
    //   6223: aload 44
    //   6225: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6228: aload 45
    //   6230: invokestatic 975	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6233: ifne +13 -> 6246
    //   6236: aload 46
    //   6238: ldc_w 1084
    //   6241: aload 45
    //   6243: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6246: new 234	java/io/ByteArrayOutputStream
    //   6249: dup
    //   6250: sipush 1024
    //   6253: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   6256: astore 47
    //   6258: aload_0
    //   6259: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6262: aload_0
    //   6263: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   6266: aload 46
    //   6268: aload 47
    //   6270: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   6273: invokevirtual 301	n:a	()Ln;
    //   6276: astore 40
    //   6278: aload 40
    //   6280: invokevirtual 304	n:b	()Z
    //   6283: ifeq +582 -> 6865
    //   6286: new 36	java/lang/String
    //   6289: dup
    //   6290: aload 47
    //   6292: invokevirtual 238	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   6295: invokespecial 241	java/lang/String:<init>	([B)V
    //   6298: astore 48
    //   6300: new 905	org/json/JSONObject
    //   6303: dup
    //   6304: aload 48
    //   6306: invokespecial 906	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   6309: astore 49
    //   6311: aload 49
    //   6313: ldc_w 1641
    //   6316: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   6319: ifeq +14 -> 6333
    //   6322: aload 49
    //   6324: ldc_w 1641
    //   6327: invokevirtual 1644	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   6330: ifne +33 -> 6363
    //   6333: aload 40
    //   6335: iconst_0
    //   6336: putfield 428	n:c	I
    //   6339: aload 49
    //   6341: ldc_w 1646
    //   6344: invokevirtual 1567	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   6347: ifeq +16 -> 6363
    //   6350: aload 40
    //   6352: aload 49
    //   6354: ldc_w 1646
    //   6357: invokevirtual 910	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   6360: putfield 927	n:d	Ljava/lang/String;
    //   6363: aload 40
    //   6365: astore 17
    //   6367: goto -5956 -> 411
    //   6370: astore 50
    //   6372: aload 40
    //   6374: iconst_0
    //   6375: putfield 428	n:c	I
    //   6378: aload 40
    //   6380: astore 17
    //   6382: goto -5971 -> 411
    //   6385: aload_1
    //   6386: ldc_w 1524
    //   6389: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6392: astore 33
    //   6394: aload_1
    //   6395: ldc_w 435
    //   6398: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6401: astore 34
    //   6403: aload_1
    //   6404: ldc_w 1026
    //   6407: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6410: astore 35
    //   6412: aload_1
    //   6413: ldc_w 1084
    //   6416: invokevirtual 366	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   6419: astore 36
    //   6421: aload_0
    //   6422: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6425: getfield 1089	ai:a	Ljava/lang/String;
    //   6428: iconst_3
    //   6429: anewarray 268	java/lang/Object
    //   6432: dup
    //   6433: iconst_0
    //   6434: ldc_w 1090
    //   6437: aastore
    //   6438: dup
    //   6439: iconst_1
    //   6440: ldc_w 431
    //   6443: aastore
    //   6444: dup
    //   6445: iconst_2
    //   6446: ldc_w 1648
    //   6449: aastore
    //   6450: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6453: ldc_w 279
    //   6456: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6459: astore 37
    //   6461: aload 34
    //   6463: invokestatic 975	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6466: istore 38
    //   6468: aload 37
    //   6470: ldc_w 1650
    //   6473: iconst_1
    //   6474: invokestatic 464	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   6477: aload 37
    //   6479: ldc_w 1652
    //   6482: ldc_w 1551
    //   6485: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6488: aload 33
    //   6490: invokestatic 975	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6493: ifne +13 -> 6506
    //   6496: aload 37
    //   6498: ldc_w 1524
    //   6501: aload 33
    //   6503: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6506: aload 35
    //   6508: invokestatic 975	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6511: ifne +13 -> 6524
    //   6514: aload 37
    //   6516: ldc_w 1654
    //   6519: aload 35
    //   6521: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6524: iload 38
    //   6526: ifeq +111 -> 6637
    //   6529: aload 37
    //   6531: ldc_w 1656
    //   6534: iconst_1
    //   6535: invokestatic 464	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   6538: aload 36
    //   6540: invokestatic 975	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6543: ifne +13 -> 6556
    //   6546: aload 37
    //   6548: ldc_w 1084
    //   6551: aload 36
    //   6553: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6556: new 234	java/io/ByteArrayOutputStream
    //   6559: dup
    //   6560: sipush 1024
    //   6563: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   6566: astore 39
    //   6568: aload_0
    //   6569: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6572: aload_0
    //   6573: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   6576: aload 37
    //   6578: aload 39
    //   6580: invokestatic 528	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Ljava/io/OutputStream;)Ln;
    //   6583: invokevirtual 301	n:a	()Ln;
    //   6586: astore 40
    //   6588: aload 40
    //   6590: invokevirtual 304	n:b	()Z
    //   6593: ifeq +272 -> 6865
    //   6596: aload 39
    //   6598: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   6601: invokestatic 1660	do:x	(Lbq;)Lcn;
    //   6604: astore 42
    //   6606: iload 38
    //   6608: ifeq +42 -> 6650
    //   6611: aload 40
    //   6613: iconst_0
    //   6614: putfield 428	n:c	I
    //   6617: aload_1
    //   6618: ldc_w 1103
    //   6621: aload 42
    //   6623: getfield 1664	cn:c	Ljava/util/ArrayList;
    //   6626: invokevirtual 1668	android/content/Intent:putStringArrayListExtra	(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //   6629: pop
    //   6630: aload 40
    //   6632: astore 17
    //   6634: goto -6223 -> 411
    //   6637: aload 37
    //   6639: ldc_w 1670
    //   6642: aload 34
    //   6644: invokestatic 290	ai:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   6647: goto -109 -> 6538
    //   6650: aload 42
    //   6652: getfield 1671	cn:a	Z
    //   6655: ifne +21 -> 6676
    //   6658: aload 40
    //   6660: sipush 400
    //   6663: putfield 428	n:c	I
    //   6666: aload 40
    //   6668: aload 42
    //   6670: getfield 1672	cn:b	Ljava/lang/String;
    //   6673: putfield 927	n:d	Ljava/lang/String;
    //   6676: aload 40
    //   6678: astore 17
    //   6680: goto -6269 -> 411
    //   6683: astore 41
    //   6685: aload 40
    //   6687: iconst_0
    //   6688: putfield 428	n:c	I
    //   6691: aload 40
    //   6693: astore 17
    //   6695: goto -6284 -> 411
    //   6698: aload_1
    //   6699: ldc_w 354
    //   6702: lconst_0
    //   6703: invokevirtual 360	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   6706: lstore 11
    //   6708: aload_0
    //   6709: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6712: getfield 1089	ai:a	Ljava/lang/String;
    //   6715: astore 13
    //   6717: iconst_5
    //   6718: anewarray 268	java/lang/Object
    //   6721: astore 14
    //   6723: aload 14
    //   6725: iconst_0
    //   6726: ldc_w 1090
    //   6729: aastore
    //   6730: aload 14
    //   6732: iconst_1
    //   6733: ldc_w 552
    //   6736: aastore
    //   6737: aload 14
    //   6739: iconst_2
    //   6740: lload 11
    //   6742: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6745: aastore
    //   6746: aload 14
    //   6748: iconst_3
    //   6749: ldc_w 1168
    //   6752: aastore
    //   6753: aload 14
    //   6755: iconst_4
    //   6756: ldc_w 1674
    //   6759: aastore
    //   6760: aload 13
    //   6762: aload 14
    //   6764: invokestatic 722	ai:a	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6767: ldc_w 279
    //   6770: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6773: astore 15
    //   6775: new 234	java/io/ByteArrayOutputStream
    //   6778: dup
    //   6779: sipush 1024
    //   6782: invokespecial 557	java/io/ByteArrayOutputStream:<init>	(I)V
    //   6785: astore 16
    //   6787: aload_0
    //   6788: getfield 266	com/twitter/android/service/TwitterService:h	Lai;
    //   6791: aload_0
    //   6792: getfield 293	com/twitter/android/service/TwitterService:g	Lorg/apache/http/client/HttpClient;
    //   6795: aload 15
    //   6797: aload 5
    //   6799: iconst_0
    //   6800: aload 16
    //   6802: invokestatic 298	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;ZLjava/io/OutputStream;)Ln;
    //   6805: invokevirtual 301	n:a	()Ln;
    //   6808: astore 17
    //   6810: aload 17
    //   6812: invokevirtual 304	n:b	()Z
    //   6815: ifeq -6404 -> 411
    //   6818: aload_1
    //   6819: ldc_w 287
    //   6822: aload 16
    //   6824: invokestatic 307	com/twitter/android/service/TwitterService:b	(Ljava/io/ByteArrayOutputStream;)Lbq;
    //   6827: invokestatic 1678	do:y	(Lbq;)Ldh;
    //   6830: invokevirtual 425	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   6833: pop
    //   6834: goto -6423 -> 411
    //   6837: astore 18
    //   6839: aload 17
    //   6841: iconst_0
    //   6842: putfield 428	n:c	I
    //   6845: goto -6434 -> 411
    //   6848: astore 108
    //   6850: goto -1701 -> 5149
    //   6853: aconst_null
    //   6854: astore 19
    //   6856: aconst_null
    //   6857: astore 20
    //   6859: iconst_0
    //   6860: istore 21
    //   6862: goto -6405 -> 457
    //   6865: aload 40
    //   6867: astore 17
    //   6869: goto -6458 -> 411
    //   6872: iconst_0
    //   6873: istore 57
    //   6875: goto -880 -> 5995
    //   6878: aload 74
    //   6880: astore 17
    //   6882: goto -6471 -> 411
    //   6885: aload 102
    //   6887: astore 17
    //   6889: goto -6478 -> 411
    //   6892: iload 160
    //   6894: istore 163
    //   6896: bipush 100
    //   6898: istore 164
    //   6900: goto -2937 -> 3963
    //   6903: iload 154
    //   6905: istore 166
    //   6907: goto -2863 -> 4044
    //   6910: iload 159
    //   6912: istore 165
    //   6914: goto -2903 -> 4011
    //   6917: aload 203
    //   6919: astore 17
    //   6921: goto -6510 -> 411
    //   6924: aload 212
    //   6926: astore 17
    //   6928: goto -6517 -> 411
    //   6931: iload 187
    //   6933: ifne -3333 -> 3600
    //   6936: ldc_w 946
    //   6939: astore 198
    //   6941: goto -3377 -> 3564
    //
    // Exception table:
    //   from	to	target	type
    //   2792	2808	2815	java/io/IOException
    //   2986	3029	3073	java/io/IOException
    //   3029	3070	3073	java/io/IOException
    //   3099	3132	3073	java/io/IOException
    //   3132	3174	3073	java/io/IOException
    //   3177	3188	3073	java/io/IOException
    //   3280	3290	3354	java/io/IOException
    //   3295	3301	3354	java/io/IOException
    //   3308	3347	3354	java/io/IOException
    //   3540	3550	3606	java/io/IOException
    //   3564	3586	3606	java/io/IOException
    //   3711	3751	3754	java/io/IOException
    //   4084	4094	4175	java/io/IOException
    //   4104	4122	4175	java/io/IOException
    //   4646	4709	4868	org/json/JSONException
    //   4709	4761	4868	org/json/JSONException
    //   4761	4813	4868	org/json/JSONException
    //   4813	4865	4868	org/json/JSONException
    //   4911	4976	4979	org/json/JSONException
    //   4997	5003	4979	org/json/JSONException
    //   5324	5340	5343	java/io/IOException
    //   5533	5549	5552	java/io/IOException
    //   5682	5698	5705	java/io/IOException
    //   6088	6114	6138	java/io/IOException
    //   6300	6333	6370	org/json/JSONException
    //   6333	6363	6370	org/json/JSONException
    //   6596	6606	6683	java/io/IOException
    //   6611	6630	6683	java/io/IOException
    //   6650	6676	6683	java/io/IOException
    //   6818	6834	6837	java/io/IOException
    //   5132	5146	6848	java/io/IOException
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    this.f = new ThreadSafeClientConnManager(n.b, n.a);
    this.g = n.a(this.f);
    this.d = Executors.newCachedThreadPool();
    this.e = new LinkedHashMap(50, 50.0F);
    this.h = ai.a(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.f.shutdown();
    this.d.shutdownNow();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    this.d.execute(new c(this, paramIntent, paramInt2));
    this.e.put(Integer.valueOf(paramInt2), Boolean.valueOf(false));
    return 2;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.TwitterService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
