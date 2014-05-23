package com.spotify.mobile.android.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import com.spotify.mobile.android.provider.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ct
{
  static final String[] a = { "permissions", "access_token", "post_open_graph", "enabled" };
  private Set b = new HashSet();
  private String[] c;
  private String d;
  private int e;
  private boolean f;
  private Context g;
  private cr h;
  private cs i = new ct.1(this);

  public ct(Context paramContext)
  {
    this.g = paramContext;
    this.h = new cr(this.g, this.i);
  }

  public static void a(Context paramContext, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("post_open_graph", String.valueOf(paramInt));
    paramContext.getContentResolver().update(x.a, localContentValues, null, null);
  }

  public static void a(Context paramContext, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("access_token", paramString);
    paramContext.getContentResolver().update(x.a, localContentValues, null, null);
  }

  public final void a()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  public final void a(int paramInt)
  {
    a(this.g, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
