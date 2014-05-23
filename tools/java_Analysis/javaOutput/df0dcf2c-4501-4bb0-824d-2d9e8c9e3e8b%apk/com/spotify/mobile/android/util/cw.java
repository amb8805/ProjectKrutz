package com.spotify.mobile.android.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;

public final class cw
{
  private static final Pattern a = Pattern.compile("");
  private static final HashMap<String, cw> b = new HashMap();
  private final Context c;
  private final String d;
  private SharedPreferences e;

  private cw(Context paramContext, String paramString)
  {
    this.c = paramContext;
    this.d = paramString;
    b();
  }

  @SuppressLint({"SharedPreferencesUsage"})
  public static cw a(Context paramContext)
  {
    try
    {
      cw localcw = a(paramContext, "spotify_preferences", false);
      return localcw;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static cw a(Context paramContext, String paramString, boolean paramBoolean)
  {
    cw localcw = (cw)b.get(paramString);
    if (localcw == null)
    {
      localcw = new cw(paramContext.getApplicationContext(), paramString);
      b.put(paramString, localcw);
    }
    while (!paramBoolean)
      return localcw;
    localcw.b();
    return localcw;
  }

  @SuppressLint({"SharedPreferencesUsage"})
  public static cw b(Context paramContext)
  {
    try
    {
      cw localcw = a(paramContext, "spotify_preferences", true);
      return localcw;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  @TargetApi(11)
  private void b()
  {
    this.e = this.c.getSharedPreferences(this.d, 4);
  }

  public final int a(cy paramcy, int paramInt)
  {
    return this.e.getInt(cy.a(paramcy), paramInt);
  }

  public final int a(cy paramcy, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.e.getInt(cy.a(paramcy), paramInt1);
    if ((i >= paramInt2) && (i <= paramInt3))
      paramInt1 = i;
    return paramInt1;
  }

  public final long a(cy paramcy, long paramLong)
  {
    return this.e.getLong(cy.a(paramcy), paramLong);
  }

  @SuppressLint({"CommitPrefEdits"})
  public final cx a()
  {
    b();
    return new cx(this.e.edit(), (byte)0);
  }

  public final String a(cy paramcy, String paramString)
  {
    return this.e.getString(cy.a(paramcy), paramString);
  }

  public final String a(cy paramcy, String paramString, String[] paramArrayOfString)
  {
    String str = this.e.getString(cy.a(paramcy), paramString);
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
      if (!str.equals(paramArrayOfString[j]));
    while (true)
    {
      return (String)str;
      j++;
      break;
      str = paramString;
    }
  }

  public final JSONArray a(cy paramcy, JSONArray paramJSONArray)
  {
    try
    {
      String str2 = this.e.getString(cy.a(paramcy), null);
      str1 = str2;
      if (str1 == null)
        return paramJSONArray;
      return new JSONArray(str1);
    }
    catch (ClassCastException localClassCastException)
    {
      while (true)
        String str1 = null;
    }
  }

  public final boolean a(cy paramcy)
  {
    return this.e.contains(cy.a(paramcy));
  }

  public final boolean a(cy paramcy, boolean paramBoolean)
  {
    return this.e.getBoolean(cy.a(paramcy), paramBoolean);
  }

  public final void b(cy paramcy, String paramString)
  {
    a().a(paramcy, paramString).a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
