package com.spotify.mobile.android.spotlets.search.loader;

import android.text.TextUtils;

final class e
{
  public static final d a = new d(null, null, 0, 0, 0, false, false);

  e()
  {
  }

  static d a(String paramString, SearchLoader.SearchType paramSearchType, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (TextUtils.isEmpty(paramString))
      return a;
    return new d(paramString, paramSearchType, paramInt1, paramInt2, 4000, paramBoolean1, paramBoolean2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.loader.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
