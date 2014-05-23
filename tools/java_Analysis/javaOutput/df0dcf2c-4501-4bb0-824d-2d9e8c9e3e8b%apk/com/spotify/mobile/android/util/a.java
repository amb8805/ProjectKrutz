package com.spotify.mobile.android.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.spotify.mobile.android.provider.z;

public class a
{
  private static final String a = a.class.getSimpleName();

  public a()
  {
  }

  public static void a(ContentResolver paramContentResolver, String paramString)
  {
    cc.a(paramContentResolver);
    cc.a(paramString);
    bp.b("Resetting test name: %s", new Object[] { paramString });
    paramContentResolver.delete(z.a(paramString), null, null);
  }

  public static void a(ContentResolver paramContentResolver, String paramString, int paramInt)
  {
    cc.a(paramContentResolver);
    cc.a(paramString);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    bp.b("Overriding test name: %s with test group: %d", arrayOfObject);
    if ((paramInt < 0) || (paramInt > 1000))
      throw new IllegalArgumentException("Test group must be in the inclusive range 0-1000");
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("test_group", Integer.valueOf(paramInt));
    paramContentResolver.update(z.a(paramString), localContentValues, null, null);
  }

  public static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0);
  }

  public static boolean a(String paramString, int paramInt)
  {
    return (a(paramString)) && (paramInt >= 0) && (paramInt <= 1000);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
