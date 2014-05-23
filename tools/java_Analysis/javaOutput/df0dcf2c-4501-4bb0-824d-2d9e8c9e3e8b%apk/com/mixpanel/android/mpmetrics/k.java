package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

final class k extends SQLiteOpenHelper
{
  private final File a;

  k(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 4);
    this.a = paramContext.getDatabasePath(paramString);
  }

  public final void a()
  {
    close();
    this.a.delete();
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(MPDbAdapter.b());
    paramSQLiteDatabase.execSQL(MPDbAdapter.c());
    paramSQLiteDatabase.execSQL(MPDbAdapter.d());
    paramSQLiteDatabase.execSQL(MPDbAdapter.e());
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MPDbAdapter.Table.a.a());
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MPDbAdapter.Table.b.a());
    paramSQLiteDatabase.execSQL(MPDbAdapter.b());
    paramSQLiteDatabase.execSQL(MPDbAdapter.c());
    paramSQLiteDatabase.execSQL(MPDbAdapter.d());
    paramSQLiteDatabase.execSQL(MPDbAdapter.e());
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
