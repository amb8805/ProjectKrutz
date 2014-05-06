package com.twitter.android.client;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.twitter.android.provider.q;
import cr;
import java.util.ArrayList;

public final class f
{
  public final int a;
  public final int b;
  public final int c;
  private String d;
  private int[] e;
  private int[] f;
  private int[] g;

  public f(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
  }

  public final void a(Context paramContext, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null);
    try
    {
      if (paramArrayOfInt.length == 0)
      {
        this.e = null;
        this.f = null;
        this.g = null;
      }
      do
      {
        return;
        if (this.a != 2131034114)
          break;
        str1 = String.valueOf(1);
        localCursor = q.a(paramContext).getReadableDatabase().query("widget_settings", q.a, "widget_type=?", new String[] { str1 }, null, null, null);
      }
      while (localCursor == null);
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      localArrayList3 = new ArrayList();
      while (true)
      {
        if (!localCursor.moveToNext())
          break label219;
        localInteger = Integer.valueOf(localCursor.getInt(0));
        str2 = localCursor.getString(1);
        k = localCursor.getInt(2);
        if (!TextUtils.isEmpty(str2))
        {
          if (str2.equals(this.d))
          {
            if (k != 0)
              break;
            localArrayList1.add(localInteger);
          }
          localArrayList3.add(localInteger);
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      Cursor localCursor;
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      ArrayList localArrayList3;
      Integer localInteger;
      String str2;
      int k;
      String str1 = String.valueOf(0);
      continue;
      localArrayList2.add(localInteger);
      continue;
      label219: localCursor.close();
      ArrayList localArrayList4 = new ArrayList();
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++)
        localArrayList4.add(Integer.valueOf(paramArrayOfInt[j]));
      localArrayList4.removeAll(localArrayList3);
      this.e = cr.a(localArrayList4);
      this.f = cr.a(localArrayList1);
      this.g = cr.a(localArrayList2);
    }
  }

  public final int[] a()
  {
    try
    {
      int[] arrayOfInt = this.e;
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int[] a(Context paramContext)
  {
    if (this.a == 2131034114)
      return AppWidgetManager.getInstance(paramContext).getAppWidgetIds(new ComponentName(paramContext, WidgetLargeProvider.class));
    return AppWidgetManager.getInstance(paramContext).getAppWidgetIds(new ComponentName(paramContext, WidgetSmallProvider.class));
  }

  public final int[] b()
  {
    try
    {
      int[] arrayOfInt = this.f;
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int[] c()
  {
    try
    {
      int[] arrayOfInt = this.g;
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
