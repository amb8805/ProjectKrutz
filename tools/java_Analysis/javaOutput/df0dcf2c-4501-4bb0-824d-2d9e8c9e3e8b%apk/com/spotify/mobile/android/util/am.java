package com.spotify.mobile.android.util;

import android.database.Cursor;
import android.text.Html;
import android.text.Spanned;

public final class am
{
  public static String a(Cursor paramCursor, int paramInt, String paramString)
  {
    String str = ((Cursor)cc.a(paramCursor)).getString(paramInt);
    if ((str == null) || (str.length() == 0))
      return paramString;
    return str;
  }

  public static String a(Cursor paramCursor, String paramString1, String paramString2)
  {
    return a(paramCursor, ((Cursor)cc.a(paramCursor)).getColumnIndexOrThrow((String)cc.a(paramString1)), paramString2);
  }

  public static boolean a(Cursor paramCursor, int paramInt)
  {
    return ((Cursor)cc.a(paramCursor)).getInt(paramInt) != 0;
  }

  public static boolean a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, ((Cursor)cc.a(paramCursor)).getColumnIndexOrThrow((String)cc.a(paramString)));
  }

  public static int b(Cursor paramCursor, String paramString)
  {
    return ((Cursor)cc.a(paramCursor)).getInt(paramCursor.getColumnIndexOrThrow((String)cc.a(paramString)));
  }

  public static String b(Cursor paramCursor, int paramInt, String paramString)
  {
    return ((Spanned)cc.a(Html.fromHtml(a(paramCursor, paramInt, paramString)))).toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
