package com.twitter.android.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;

public class GlobalDatabaseProvider extends ContentProvider
{
  private static final UriMatcher a = new n(-1);
  private static final HashMap b;
  private q c;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("_id", "_id");
    b.put("name", "name");
    b.put("value", "value");
  }

  public GlobalDatabaseProvider()
  {
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Delete not supported: " + paramUri);
  }

  public String getType(Uri paramUri)
  {
    switch (a.match(paramUri))
    {
    default:
      throw new IllegalArgumentException("Unknown URL " + paramUri);
    case 1:
    case 2:
    }
    return "vnd.android.cursor.dir/vnd.twitter.android.uservalues";
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("Insert not supported " + paramUri);
  }

  public boolean onCreate()
  {
    this.c = q.a(getContext());
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    switch (a.match(paramUri))
    {
    default:
      throw new IllegalArgumentException("Unknown URL " + paramUri);
    case 1:
      localSQLiteQueryBuilder.setTables("user_values");
      localSQLiteQueryBuilder.setProjectionMap(b);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      Cursor localCursor = localSQLiteQueryBuilder.query(this.c.getReadableDatabase(), paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
      localCursor.setNotificationUri(getContext().getContentResolver(), paramUri);
      return localCursor;
      localSQLiteQueryBuilder.setTables("user_values");
      localSQLiteQueryBuilder.appendWhere("_id=" + (String)paramUri.getPathSegments().get(1));
      continue;
      localSQLiteQueryBuilder.setTables("activity_states");
      continue;
      localSQLiteQueryBuilder.setTables("activity_states");
      localSQLiteQueryBuilder.appendWhere("account_name='" + paramUri.getLastPathSegment() + "'");
      continue;
      localSQLiteQueryBuilder.setTables("account_settings");
      continue;
      localSQLiteQueryBuilder.setTables("account_settings");
      localSQLiteQueryBuilder.appendWhere("account_name='" + paramUri.getLastPathSegment() + "'");
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Update not supported: " + paramUri);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.GlobalDatabaseProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
