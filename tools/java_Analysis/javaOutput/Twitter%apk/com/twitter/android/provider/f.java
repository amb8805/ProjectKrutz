package com.twitter.android.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public final class f
{
  private static final String[] a = { "value" };

  private f()
  {
  }

  public static String a(Context paramContext)
  {
    Cursor localCursor = paramContext.getContentResolver().query(a.a, a, "name=?", new String[] { "current_account" }, null);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst());
      for (String str = localCursor.getString(0); ; str = null)
      {
        localCursor.close();
        return str;
      }
    }
    return null;
  }

  public static void a(Context paramContext, String paramString, long paramLong)
  {
    ContentValues localContentValues1 = new ContentValues();
    localContentValues1.put("value", paramString);
    q.a(paramContext).a("current_account", localContentValues1);
    ContentValues localContentValues2 = new ContentValues();
    localContentValues2.put("value", Long.valueOf(paramLong));
    q.a(paramContext).a("current_user_id", localContentValues2);
  }

  public static long b(Context paramContext)
  {
    Cursor localCursor = paramContext.getContentResolver().query(a.a, a, "name=?", new String[] { "current_user_id" }, null);
    long l = 0L;
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        l = localCursor.getLong(0);
      localCursor.close();
    }
    return l;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
