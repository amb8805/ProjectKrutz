package com.twitter.android.platform;

import ad;
import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.StatusUpdates;
import android.provider.ContactsContract.SyncState;
import android.util.Log;
import cr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p;

public final class k
{
  static final boolean a = Log.isLoggable("ContactsStorage", 3);

  public k()
  {
  }

  private static int a(ad paramad)
  {
    int i = 31 * (527 + (int)(paramad.a ^ paramad.a >>> 32));
    int j;
    int k;
    if (paramad.b != null)
    {
      j = paramad.b.hashCode();
      k = 31 * (i + j);
      if (paramad.c == null)
        break label80;
    }
    label80: for (int m = paramad.c.hashCode(); ; m = 0)
    {
      return 31 * (k + m) + paramad.g.hashCode();
      j = 0;
      break;
    }
  }

  private static long a(ContentResolver paramContentResolver, long paramLong)
  {
    Uri localUri = ContactsContract.Data.CONTENT_URI;
    String[] arrayOfString1 = i.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.toString(paramLong);
    Cursor localCursor = paramContentResolver.query(localUri, arrayOfString1, "mimetype='vnd.android.cursor.item/vnd.twitter.profile' AND data1=?", arrayOfString2, null);
    if (localCursor == null)
      return 0L;
    try
    {
      if (localCursor.moveToFirst())
      {
        long l2 = localCursor.getLong(0);
        l1 = l2;
        return l1;
      }
    }
    finally
    {
      localCursor.close();
    }
    while (true)
      long l1 = 0L;
  }

  private static long a(ContentResolver paramContentResolver, String paramString)
  {
    Uri localUri = ContactsContract.RawContacts.CONTENT_URI;
    String[] arrayOfString1 = g.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramString);
    Cursor localCursor = paramContentResolver.query(localUri, arrayOfString1, "account_type='com.twitter.android.auth.login' AND sourceid=?", arrayOfString2, null);
    if (localCursor == null)
      return 0L;
    try
    {
      if (localCursor.moveToFirst())
      {
        long l2 = localCursor.getLong(0);
        l1 = l2;
        return l1;
      }
    }
    finally
    {
      localCursor.close();
    }
    while (true)
      long l1 = 0L;
  }

  private static ContentProviderOperation.Builder a(Uri paramUri, boolean paramBoolean)
  {
    return ContentProviderOperation.newInsert(a(paramUri)).withYieldAllowed(paramBoolean);
  }

  private static ContentProviderOperation a(Account paramAccount, j paramj)
  {
    ContentProviderOperation.Builder localBuilder = ContentProviderOperation.newUpdate(a(ContactsContract.SyncState.CONTENT_URI));
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramAccount.name;
    arrayOfString[1] = paramAccount.type;
    return localBuilder.withSelection("account_name=? AND account_type=?", arrayOfString).withValue("data", paramj.d()).withExpectedCount(1).build();
  }

  private static Uri a(Uri paramUri)
  {
    return paramUri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
  }

  public static Map a(Context paramContext, String paramString)
  {
    HashMap localHashMap = new HashMap();
    Cursor localCursor = paramContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, r.a, "account_type='com.twitter.android.auth.login' AND account_name=? AND mimetype='vnd.android.cursor.item/photo' AND data_sync1 NOT IN(200,404,417)", new String[] { paramString }, null);
    if (localCursor == null)
      return localHashMap;
    try
    {
      if (localCursor.moveToNext())
        localHashMap.put(Long.valueOf(localCursor.getLong(0)), localCursor.getString(1));
    }
    finally
    {
      localCursor.close();
    }
    return localHashMap;
  }

  private static void a(ContentResolver paramContentResolver, ArrayList paramArrayList)
  {
    if (paramArrayList.size() <= 1)
      return;
    paramContentResolver.applyBatch("com.android.contacts", paramArrayList);
  }

  public static void a(Context paramContext, Account paramAccount)
  {
    try
    {
      c(paramContext, paramAccount, new j(null, null, "-1"));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void a(Context paramContext, Account paramAccount, j paramj)
  {
    try
    {
      if (a)
        Log.d("ContactsStorage", "syncBegin: sync id: " + paramj.a());
      if (paramj.a() == null)
      {
        paramj.a(cr.a(4));
        paramj.c("-1");
        c(paramContext, paramAccount, paramj);
      }
      while (true)
      {
        return;
        if (paramj.c() == null)
        {
          paramj.c("-1");
          c(paramContext, paramAccount, paramj);
        }
      }
    }
    finally
    {
    }
  }

  public static void a(Context paramContext, Account paramAccount, List paramList, j paramj)
  {
    try
    {
      int i = paramList.size();
      if (i == 0);
      do
      {
        return;
        localContentResolver = paramContext.getContentResolver();
        localHashMap1 = new HashMap();
        localUri1 = ContactsContract.RawContacts.CONTENT_URI;
        arrayOfString1 = n.a;
        arrayOfString2 = new String[1];
        arrayOfString2[0] = paramAccount.name;
        localCursor = localContentResolver.query(localUri1, arrayOfString1, "account_type='com.twitter.android.auth.login' AND account_name=?", arrayOfString2, null);
      }
      while (localCursor == null);
      try
      {
        if (localCursor.moveToNext())
          localHashMap1.put(Long.valueOf(localCursor.getLong(1)), new h(localCursor.getLong(0), localCursor.getInt(2)));
      }
      finally
      {
        localCursor.close();
      }
    }
    finally
    {
    }
    while (true)
    {
      ContentResolver localContentResolver;
      HashMap localHashMap1;
      Uri localUri1;
      String[] arrayOfString1;
      String[] arrayOfString2;
      Cursor localCursor;
      localCursor.close();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator1 = paramList.iterator();
      while (localIterator1.hasNext())
      {
        ad localad3 = (ad)localIterator1.next();
        long l3 = localad3.a;
        h localh = (h)localHashMap1.get(Long.valueOf(l3));
        if (localh != null)
        {
          if (a(localad3) != localh.b)
          {
            if (a)
              Log.d("ContactsStorage", "Update contact: " + l3);
            localHashMap2.put(Long.valueOf(localh.a), localad3);
          }
          else
          {
            if (a)
              Log.d("ContactsStorage", "Unchanged contact: " + l3);
            localArrayList1.add(Long.valueOf(localh.a));
          }
        }
        else
        {
          if (a)
            Log.d("ContactsStorage", "New contact: " + l3);
          localArrayList2.add(localad3);
        }
      }
      ContentValues localContentValues = new ContentValues();
      ArrayList localArrayList3 = new ArrayList();
      if (localArrayList1.size() > 0)
      {
        localArrayList3.clear();
        localArrayList3.add(a(paramAccount, paramj));
        Iterator localIterator5 = localArrayList1.iterator();
        while (localIterator5.hasNext())
        {
          Long localLong2 = (Long)localIterator5.next();
          Uri localUri2 = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, localLong2.longValue());
          localContentValues.clear();
          localContentValues.put("sync1", paramj.a());
          localArrayList3.add(b(localUri2, true).withValues(localContentValues).build());
          if (localArrayList3.size() >= 50)
          {
            a(localContentResolver, localArrayList3);
            localArrayList3.clear();
            localArrayList3.add(a(paramAccount, paramj));
          }
        }
        a(localContentResolver, localArrayList3);
      }
      if (localArrayList2.size() > 0)
      {
        localArrayList3.clear();
        localArrayList3.add(a(paramAccount, paramj));
        Iterator localIterator4 = localArrayList2.iterator();
        while (localIterator4.hasNext())
        {
          ad localad2 = (ad)localIterator4.next();
          String str = paramAccount.name;
          int j = localArrayList3.size();
          localContentValues.clear();
          localContentValues.put("account_type", "com.twitter.android.auth.login");
          localContentValues.put("account_name", str);
          localContentValues.put("sourceid", Long.valueOf(localad2.a));
          localContentValues.put("sync1", paramj.a());
          localContentValues.put("sync2", Integer.valueOf(a(localad2)));
          localArrayList3.add(a(ContactsContract.RawContacts.CONTENT_URI, true).withValues(localContentValues).build());
          localContentValues.clear();
          localContentValues.put("mimetype", "vnd.android.cursor.item/name");
          localContentValues.put("data1", localad2.b);
          ContentProviderOperation.Builder localBuilder1 = a(ContactsContract.Data.CONTENT_URI, false).withValues(localContentValues);
          localBuilder1.withValueBackReference("raw_contact_id", j);
          localArrayList3.add(localBuilder1.build());
          localContentValues.clear();
          localContentValues.put("mimetype", "vnd.android.cursor.item/nickname");
          localContentValues.put("data1", localad2.g);
          ContentProviderOperation.Builder localBuilder2 = a(ContactsContract.Data.CONTENT_URI, false).withValues(localContentValues);
          localBuilder2.withValueBackReference("raw_contact_id", j);
          localArrayList3.add(localBuilder2.build());
          localContentValues.clear();
          localContentValues.put("mimetype", "vnd.android.cursor.item/vnd.twitter.profile");
          localContentValues.put("data1", Long.valueOf(localad2.a));
          localContentValues.put("data2", paramContext.getString(2131427521));
          localContentValues.put("data3", paramContext.getString(2131427522));
          ContentProviderOperation.Builder localBuilder3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValues(localContentValues);
          localBuilder3.withValueBackReference("raw_contact_id", j);
          localArrayList3.add(localBuilder3.build());
          localContentValues.clear();
          localContentValues.put("mimetype", "vnd.android.cursor.item/photo");
          localContentValues.put("data15", null);
          localContentValues.put("data_sync1", Integer.valueOf(-1));
          localContentValues.put("data_sync2", localad2.c);
          ContentProviderOperation.Builder localBuilder4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValues(localContentValues);
          localBuilder4.withValueBackReference("raw_contact_id", j);
          localArrayList3.add(localBuilder4.build());
          if (localArrayList3.size() >= 50)
          {
            a(localContentResolver, localArrayList3);
            localArrayList3.clear();
            localArrayList3.add(a(paramAccount, paramj));
          }
        }
        a(localContentResolver, localArrayList3);
      }
      if (localHashMap2.size() > 0)
      {
        localArrayList3.clear();
        localArrayList3.add(a(paramAccount, paramj));
        Iterator localIterator3 = localHashMap2.keySet().iterator();
        while (localIterator3.hasNext())
        {
          Long localLong1 = (Long)localIterator3.next();
          a(paramContext, localContentResolver, localArrayList3, localContentValues, (ad)localHashMap2.get(localLong1), localLong1, paramj);
          if (localArrayList3.size() >= 50)
          {
            a(localContentResolver, localArrayList3);
            localArrayList3.clear();
            localArrayList3.add(a(paramAccount, paramj));
          }
        }
        a(localContentResolver, localArrayList3);
      }
      localArrayList3.clear();
      Iterator localIterator2 = paramList.iterator();
      while (localIterator2.hasNext())
      {
        ad localad1 = (ad)localIterator2.next();
        p localp = localad1.o;
        if (localp != null)
        {
          long l1 = localad1.a;
          long l2 = a(localContentResolver, l1);
          if (l2 > 0L)
          {
            localContentValues.clear();
            localContentValues.put("presence_data_id", Long.valueOf(l2));
            localContentValues.put("status", localp.h);
            localContentValues.put("status_ts", Long.valueOf(localp.d));
            localContentValues.put("protocol", Integer.valueOf(-1));
            localContentValues.put("custom_protocol", "Twitter");
            localContentValues.put("im_account", paramAccount.name);
            localContentValues.put("im_handle", Long.valueOf(l1));
            localContentValues.put("status_res_package", paramContext.getPackageName());
            localContentValues.put("status_icon", Integer.valueOf(2130837829));
            localContentValues.put("status_label", Integer.valueOf(2131427343));
            localArrayList3.add(a(ContactsContract.StatusUpdates.CONTENT_URI, true).withValues(localContentValues).build());
            if (localArrayList3.size() >= 50)
            {
              a(localContentResolver, localArrayList3);
              localArrayList3.clear();
            }
          }
        }
      }
      a(localContentResolver, localArrayList3);
    }
  }

  private static void a(Context paramContext, ContentResolver paramContentResolver, ArrayList paramArrayList, ContentValues paramContentValues, ad paramad, Long paramLong, j paramj)
  {
    Uri localUri1 = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, paramLong.longValue());
    paramContentValues.clear();
    paramContentValues.put("sync1", paramj.a());
    paramContentValues.put("sync2", Integer.valueOf(a(paramad)));
    paramArrayList.add(b(localUri1, true).withValues(paramContentValues).build());
    Uri localUri2 = ContactsContract.Data.CONTENT_URI;
    String[] arrayOfString1 = c.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = paramLong.toString();
    Cursor localCursor = paramContentResolver.query(localUri2, arrayOfString1, "raw_contact_id=?", arrayOfString2, null);
    String str4;
    if (localCursor == null)
    {
      return;
      try
      {
        while (true)
          if (localCursor.moveToNext())
          {
            Uri localUri3 = ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, localCursor.getLong(0));
            String str1 = localCursor.getString(1);
            if ("vnd.android.cursor.item/name".equals(str1))
            {
              str4 = paramad.b;
              String str5 = localCursor.getString(2);
              if (str5 != null)
                break label452;
              if (str4 == null)
                break label434;
              for (j = 1; j != 0; j = 1)
              {
                paramContentValues.clear();
                paramContentValues.put("data1", str4);
                paramArrayList.add(b(localUri3, bool).withValues(paramContentValues).build());
                break label446;
                if (str5.equals(str4))
                  break label434;
              }
            }
            if ("vnd.android.cursor.item/photo".equals(str1))
            {
              str2 = localCursor.getString(3);
              str3 = paramad.c;
              if (str2 != null)
                if (str3 == null)
                {
                  paramContentValues.clear();
                  paramContentValues.put("data_sync1", Integer.valueOf(200));
                  paramContentValues.put("data_sync2", null);
                  i = 1;
                  if (i == 0)
                    continue;
                  paramArrayList.add(ContentProviderOperation.newUpdate(localUri3).withValues(paramContentValues).build());
                }
            }
          }
      }
      finally
      {
        localCursor.close();
      }
    }
    while (true)
    {
      int j;
      boolean bool;
      String str2;
      String str3;
      int i;
      if (!str2.equals(str3))
      {
        paramContentValues.clear();
        paramContentValues.put("data_sync1", Integer.valueOf(-1));
        paramContentValues.put("data_sync2", str3);
        i = 1;
        continue;
        if (str3 != null)
        {
          paramContentValues.clear();
          paramContentValues.put("data_sync1", Integer.valueOf(-1));
          paramContentValues.put("data_sync2", str3);
          i = 1;
          continue;
          localCursor.close();
        }
      }
      else
      {
        i = 0;
        continue;
        label434: j = 0;
        continue;
        bool = true;
        break;
        label446: bool = false;
        break;
        label452: if (str4 == null)
          j = 1;
      }
    }
  }

  public static void a(Context paramContext, Long paramLong, int paramInt, byte[] paramArrayOfByte)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    long l = a(localContentResolver, Long.toString(paramLong.longValue()));
    if (l > 0L)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("data15", paramArrayOfByte);
      localContentValues.put("data_sync1", Integer.valueOf(paramInt));
      localContentResolver.update(a(ContactsContract.Data.CONTENT_URI), localContentValues, "raw_contact_id=" + l + " AND " + "mimetype" + "='" + "vnd.android.cursor.item/photo" + "'", null);
    }
  }

  public static void a(Context paramContext, String paramString, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      ad localad = localp.m;
      if (localad != null)
      {
        long l1 = localad.a;
        long l2 = a(localContentResolver, l1);
        if (l2 > 0L)
        {
          localContentValues.clear();
          localContentValues.put("presence_data_id", Long.valueOf(l2));
          localContentValues.put("status", localp.h);
          localContentValues.put("status_ts", Long.valueOf(localp.d));
          localContentValues.put("protocol", Integer.valueOf(-1));
          localContentValues.put("custom_protocol", "Twitter");
          localContentValues.put("im_account", paramString);
          localContentValues.put("im_handle", Long.valueOf(l1));
          localContentValues.put("status_res_package", paramContext.getPackageName());
          localContentValues.put("status_icon", Integer.valueOf(2130837829));
          localContentValues.put("status_label", Integer.valueOf(2131427343));
          localArrayList.add(a(ContactsContract.StatusUpdates.CONTENT_URI, true).withValues(localContentValues).build());
          if (localArrayList.size() >= 50)
          {
            a(localContentResolver, localArrayList);
            localArrayList.clear();
          }
        }
      }
    }
    a(localContentResolver, localArrayList);
  }

  private static ContentProviderOperation.Builder b(Uri paramUri, boolean paramBoolean)
  {
    return ContentProviderOperation.newUpdate(a(paramUri)).withYieldAllowed(paramBoolean);
  }

  public static j b(Context paramContext, Account paramAccount)
  {
    localContentProviderClient = paramContext.getContentResolver().acquireContentProviderClient(ContactsContract.SyncState.CONTENT_URI);
    try
    {
      byte[] arrayOfByte = ContactsContract.SyncState.get(localContentProviderClient, paramAccount);
      if (arrayOfByte == null)
      {
        j localj1 = new j(null, null, "-1");
        ContactsContract.SyncState.set(localContentProviderClient, paramAccount, localj1.d());
        return localj1;
      }
      j localj2 = new j(new String(arrayOfByte));
      return localj2;
    }
    finally
    {
      localContentProviderClient.release();
    }
  }

  public static void b(Context paramContext, Account paramAccount, j paramj)
  {
    try
    {
      if (a)
        Log.d("ContactsStorage", "syncComplete: sync id: " + paramj.a());
      if (paramj.a() != null)
      {
        Uri.Builder localBuilder = ContactsContract.RawContacts.CONTENT_URI.buildUpon();
        localBuilder.appendQueryParameter("account_name", paramAccount.name);
        localBuilder.appendQueryParameter("account_type", "com.twitter.android.auth.login");
        localBuilder.appendQueryParameter("caller_is_syncadapter", "true");
        int i = paramContext.getContentResolver().delete(localBuilder.build(), "sync1<>" + DatabaseUtils.sqlEscapeString(paramj.a()), null);
        if (a)
          Log.d("ContactsStorage", "syncComplete: Deleted contacts: " + i);
      }
      while (true)
      {
        paramj.b("DONE");
        paramj.c(null);
        c(paramContext, paramAccount, paramj);
        return;
        Log.w("ContactsStorage", "syncComplete: No sync id found at the end of sync.");
      }
    }
    finally
    {
    }
  }

  private static void c(Context paramContext, Account paramAccount, j paramj)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(a(paramAccount, paramj));
    paramContext.getContentResolver().applyBatch("com.android.contacts", localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
