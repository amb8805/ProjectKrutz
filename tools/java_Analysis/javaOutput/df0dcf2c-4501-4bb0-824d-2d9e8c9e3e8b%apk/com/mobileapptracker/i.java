package com.mobileapptracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

final class i extends SQLiteOpenHelper
{
  i(Context paramContext)
  {
    super(paramContext, "MAT", null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table referrer_apps (_id integer primary key autoincrement, publisher_package_name text not null, tracking_id text, unique(publisher_package_name) on conflict replace);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Log.w("Content provider database", "Upgrading database from version " + paramInt1 + " to " + paramInt2 + ", which will destroy all old data");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS siteids");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
