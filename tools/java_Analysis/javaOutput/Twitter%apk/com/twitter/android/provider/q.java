package com.twitter.android.provider;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;

public final class q extends SQLiteOpenHelper
{
  public static final String[] a = { "widget_id", "account_name", "content_type" };
  private static final String[] b = { "CREATE TABLE user_values (_id INTEGER PRIMARY KEY,name TEXT UNIQUE ON CONFLICT REPLACE,value TEXT);", "CREATE TABLE activity_states (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,tweet INTEGER, mention INTEGER, message INTEGER, discover INTEGER); ", "CREATE TABLE widget_settings (_id INTEGER PRIMARY KEY,widget_id INTEGER UNIQUE ON CONFLICT REPLACE,widget_type INTEGER, account_name TEXT, content_type INTEGER); ", "CREATE TABLE account_settings (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,notif_id INTEGER, notif_tweet INTEGER, notif_mention INTEGER, notif_message INTEGER, interval INTEGER, vibrate INTEGER, ringtone TEXT, light INTEGER);", "CREATE INDEX user_values_index  ON user_values (name);", "CREATE INDEX activity_states_index ON activity_states (account_name);", "CREATE INDEX widget_settings_index ON widget_settings (account_name);", "CREATE INDEX account_settings_index ON account_settings (account_name);", "CREATE VIEW states_settings AS SELECT activity_states.account_name AS account_name,activity_states.mention AS mention,activity_states.message AS message,activity_states.tweet AS tweet,activity_states.discover AS discover,account_settings.notif_id AS notif_id,account_settings.notif_mention AS notif_mention,account_settings.notif_message AS notif_message,account_settings.notif_tweet AS notif_tweet,account_settings.interval AS interval,account_settings.light AS light,account_settings.ringtone AS ringtone,account_settings.vibrate AS vibrate FROM activity_states LEFT JOIN account_settings ON activity_states.account_name=account_settings.account_name;" };
  private static String[] c = { "notif_tweet", "notif_mention", "notif_message", "tweet", "mention", "message", "discover" };
  private static q d;
  private Context e;

  private q(Context paramContext)
  {
    super(paramContext, "global.db", null, 7);
    this.e = paramContext.getApplicationContext();
  }

  private int a(SQLiteDatabase paramSQLiteDatabase, String paramString, ContentValues paramContentValues)
  {
    if (paramString == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        if (paramSQLiteDatabase.update("account_settings", paramContentValues, "account_name=?", new String[] { paramString }) == 0)
        {
          paramContentValues.put("account_name", paramString);
          if (!paramContentValues.containsKey("notif_tweet"))
            paramContentValues.put("notif_tweet", Integer.valueOf(0));
          if (!paramContentValues.containsKey("notif_mention"))
            paramContentValues.put("notif_mention", Integer.valueOf(1));
          if (!paramContentValues.containsKey("notif_message"))
            paramContentValues.put("notif_message", Integer.valueOf(1));
          if (!paramContentValues.containsKey("interval"))
            paramContentValues.put("interval", Integer.valueOf(60));
          long l = paramSQLiteDatabase.insert("account_settings", "account_name", paramContentValues);
          if (l > 0L)
          {
            i = 1;
            continue;
          }
          i = 0;
          continue;
        }
        i = 1;
      }
      finally
      {
      }
    }
  }

  public static q a(Context paramContext)
  {
    try
    {
      if (d == null)
        d = new q(paramContext);
      q localq = d;
      return localq;
    }
    finally
    {
    }
  }

  private int f(String paramString)
  {
    try
    {
      Cursor localCursor = getReadableDatabase().query("activity_states", i.a, "account_name=?", new String[] { paramString }, null, null, null, null);
      if (localCursor != null)
        if (localCursor.moveToFirst())
        {
          i = localCursor.getInt(2);
          localCursor.close();
          j = i;
          return j;
        }
    }
    finally
    {
    }
    while (true)
    {
      int i = 0;
      continue;
      int j = 0;
    }
  }

  public final int a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("widget_type", Integer.valueOf(paramInt2));
      localContentValues.put("account_name", paramString);
      localContentValues.put("content_type", Integer.valueOf(paramInt3));
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramInt1);
      if (localSQLiteDatabase.update("widget_settings", localContentValues, "widget_id=?", arrayOfString) == 0)
      {
        localContentValues.put("widget_id", Integer.valueOf(paramInt1));
        long l = localSQLiteDatabase.insert("widget_settings", "widget_id", localContentValues);
        if (l > 0L);
        for (i = 1; ; i = 0)
          return i;
      }
      int i = 1;
    }
    finally
    {
    }
  }

  public final int a(String paramString)
  {
    if (paramString == null)
      return 0;
    Cursor localCursor = getReadableDatabase().query("states_settings", c, "account_name=?", new String[] { paramString }, null, null, null, null);
    if (localCursor != null)
    {
      int i;
      if (localCursor.moveToFirst())
        if ((localCursor.getInt(0) != 0) && (1 == localCursor.getInt(3)))
        {
          i = 1;
          if ((localCursor.getInt(1) != 0) && ((0x1 & localCursor.getInt(4)) != 0))
            i |= 2;
          if ((localCursor.getInt(2) != 0) && (1 == localCursor.getInt(5)))
            i |= 4;
        }
      while (true)
      {
        localCursor.close();
        return i;
        i = 0;
        break;
        i = 0;
      }
    }
    return 0;
  }

  public final int a(String paramString, int paramInt)
  {
    if (paramString == null)
      j = 0;
    while (true)
    {
      return j;
      try
      {
        int i = a(paramString, "mention", paramInt | f(paramString));
        j = i;
      }
      finally
      {
      }
    }
  }

  public final int a(String paramString, ContentValues paramContentValues)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase.update("user_values", paramContentValues, "name=?", new String[] { paramString }) == 0)
      {
        paramContentValues.put("name", paramString);
        long l = localSQLiteDatabase.insert("user_values", "name", paramContentValues);
        if (l != 0L);
      }
      for (int i = 0; ; i = 1)
      {
        return i;
        this.e.getContentResolver().notifyChange(a.a, null);
      }
    }
    finally
    {
    }
  }

  public final int a(String paramString1, String paramString2)
  {
    i = 0;
    if (paramString1 == null);
    while (true)
    {
      return i;
      try
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("account_name", paramString2);
        int j = getWritableDatabase().update("widget_settings", localContentValues, "account_name=?", new String[] { paramString1 });
        i = j;
      }
      finally
      {
      }
    }
  }

  public final int a(String paramString1, String paramString2, int paramInt)
  {
    if (paramString1 == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put(paramString2, Integer.valueOf(paramInt));
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        if (localSQLiteDatabase.update("activity_states", localContentValues, "account_name=?", new String[] { paramString1 }) == 0)
        {
          localContentValues.put("account_name", paramString1);
          if (localSQLiteDatabase.insert("activity_states", "account_name", localContentValues) == 0L)
          {
            i = 0;
            continue;
          }
        }
        this.e.getContentResolver().notifyChange(Uri.withAppendedPath(k.a, paramString1), null);
        i = 1;
      }
      finally
      {
      }
    }
  }

  public final int a(int[] paramArrayOfInt)
  {
    i = 0;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      int j = paramArrayOfInt.length;
      int k = 0;
      while (i < j)
      {
        int m = paramArrayOfInt[i];
        String[] arrayOfString = new String[1];
        arrayOfString[0] = String.valueOf(m);
        int n = localSQLiteDatabase.delete("widget_settings", "widget_id=?", arrayOfString);
        k += n;
        i++;
      }
      return k;
    }
    finally
    {
    }
  }

  public final int b(String paramString)
  {
    int m;
    if (paramString == null)
      m = 0;
    while (true)
    {
      return m;
      try
      {
        SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
        String[] arrayOfString = { "notif_id" };
        Cursor localCursor1 = localSQLiteDatabase.query("account_settings", arrayOfString, "account_name=?", new String[] { paramString }, null, null, null, null);
        if (localCursor1 != null)
          if (localCursor1.moveToFirst())
          {
            i = localCursor1.getInt(0);
            localCursor1.close();
            j = i;
            if (j == 0)
            {
              localCursor2 = localSQLiteDatabase.query("account_settings", arrayOfString, "notif_id>0", null, null, null, "notif_id ASC");
              if (localCursor2 != null)
              {
                for (n = 0; localCursor2.moveToNext(); n = i1)
                {
                  i1 = localCursor2.getInt(0);
                  if (i1 - n > 1)
                    break;
                }
                localCursor2.close();
                k = n;
                m = k + 1;
                if ((m > 0) && (m <= 999))
                {
                  localContentValues = new ContentValues();
                  localContentValues.put("notif_id", Integer.valueOf(m));
                  if (b(paramString, localContentValues) != 0)
                    continue;
                  Log.e("GlobalDatabaseHelper", "Failed to save notification id");
                  break label269;
                }
                Log.e("GlobalDatabaseHelper", "Notification id out of range");
              }
            }
          }
      }
      finally
      {
      }
      while (true)
      {
        Cursor localCursor2;
        int n;
        int i1;
        ContentValues localContentValues;
        int k = 0;
        continue;
        m = j;
        break;
        int i = 0;
        continue;
        int j = 0;
      }
      label269: m = 0;
    }
  }

  public final int b(String paramString, ContentValues paramContentValues)
  {
    try
    {
      int i = a(getWritableDatabase(), paramString, paramContentValues);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int c(String paramString)
  {
    i = 0;
    if (paramString == null);
    while (true)
    {
      return i;
      try
      {
        int j = getWritableDatabase().delete("account_settings", "account_name=?", new String[] { paramString });
        i = j;
      }
      finally
      {
      }
    }
  }

  public final int d(String paramString)
  {
    i = 0;
    if (paramString == null);
    while (true)
    {
      return i;
      try
      {
        int j = getWritableDatabase().delete("activity_states", "account_name=?", new String[] { paramString });
        i = j;
      }
      finally
      {
      }
    }
  }

  public final int e(String paramString)
  {
    if (paramString != null)
    {
      localCursor = getReadableDatabase().query("account_settings", new String[] { "interval" }, "account_name=?", new String[] { paramString }, null, null, null);
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            int i = localCursor.getInt(0);
            return i;
          }
          return 60;
        }
        finally
        {
          localCursor.close();
        }
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    String[] arrayOfString = b;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      paramSQLiteDatabase.execSQL(arrayOfString[j]);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1);
    for (int i = 2; ; i = paramInt1)
    {
      if (i == 2)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE widget_settings (_id INTEGER PRIMARY KEY,widget_id INTEGER UNIQUE ON CONFLICT REPLACE,widget_type INTEGER, account_name TEXT, content_type INTEGER); ");
        paramSQLiteDatabase.execSQL("CREATE INDEX widget_settings_index ON widget_settings (account_name);");
        i = 3;
      }
      if (i == 3)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE scribe");
        i = 4;
      }
      if (i == 4)
        i = 5;
      if (i == 5)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE account_settings (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,notif_id INTEGER, notif_tweet INTEGER, notif_mention INTEGER, notif_message INTEGER, interval INTEGER, vibrate INTEGER, ringtone TEXT, light INTEGER);");
        paramSQLiteDatabase.execSQL("CREATE INDEX account_settings_index ON account_settings (account_name);");
        SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.e);
        ContentValues localContentValues1 = new ContentValues(4);
        if (paramInt1 < 5)
          localContentValues1.put("interval", Integer.valueOf(Integer.parseInt(localSharedPreferences.getString("polling_interval", String.valueOf(60)))));
        for (String[] arrayOfString = { "account_name", "notif_id", "notif_tweet", "notif_mention", "notif_message" }; ; arrayOfString = new String[] { "account_name", "interval", "notif_id", "notif_tweet", "notif_mention", "notif_message" })
        {
          localContentValues1.put("vibrate", Boolean.valueOf(localSharedPreferences.getBoolean("vibrate", false)));
          localContentValues1.put("ringtone", localSharedPreferences.getString("ringtone", ""));
          localContentValues1.put("light", Boolean.valueOf(localSharedPreferences.getBoolean("use_led", false)));
          Account[] arrayOfAccount = AccountManager.get(this.e).getAccountsByType("com.twitter.android.auth.login");
          int j = arrayOfAccount.length;
          for (int k = 0; k < j; k++)
            a(paramSQLiteDatabase, arrayOfAccount[k].name, localContentValues1);
        }
        Cursor localCursor = paramSQLiteDatabase.query("activity_states", arrayOfString, null, null, null, null, null);
        if (localCursor != null)
        {
          ContentValues localContentValues2 = new ContentValues(5);
          while (localCursor.moveToNext())
          {
            if (paramInt1 == 5)
              localContentValues2.put("interval", Integer.valueOf(localCursor.getInt(localCursor.getColumnIndexOrThrow("interval"))));
            localContentValues2.put("notif_id", Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("notif_id"))));
            localContentValues2.put("notif_tweet", Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("notif_tweet"))));
            localContentValues2.put("notif_mention", Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("notif_mention"))));
            localContentValues2.put("notif_message", Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("notif_message"))));
            a(paramSQLiteDatabase, localCursor.getString(0), localContentValues2);
          }
          localCursor.close();
        }
        i = 6;
      }
      if (i == 6)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activity_states ADD COLUMN discover INTEGER; ");
        paramSQLiteDatabase.execSQL("DROP VIEW IF EXISTS states_settings;");
        paramSQLiteDatabase.execSQL("CREATE VIEW states_settings AS SELECT activity_states.account_name AS account_name,activity_states.mention AS mention,activity_states.message AS message,activity_states.tweet AS tweet,activity_states.discover AS discover,account_settings.notif_id AS notif_id,account_settings.notif_mention AS notif_mention,account_settings.notif_message AS notif_message,account_settings.notif_tweet AS notif_tweet,account_settings.interval AS interval,account_settings.light AS light,account_settings.ringtone AS ringtone,account_settings.vibrate AS vibrate FROM activity_states LEFT JOIN account_settings ON activity_states.account_name=account_settings.account_name;");
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
