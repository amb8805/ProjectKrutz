package com.spotify.mobile.android.spotlets.search.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.am;
import java.util.Locale;

public class e<T extends g> extends d<T>
{
  protected e(T paramT, Cursor paramCursor, String paramString)
  {
    super(paramT);
    String str1 = paramT.getUri().toLowerCase(Locale.US);
    String str2 = am.a(paramCursor, paramString, "").toLowerCase(Locale.US);
    if (!TextUtils.equals(str1, str2))
      throw new IllegalStateException("Expected item" + str1 + "but got" + str2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
