package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class t
  implements BaseColumns
{
  public static final Uri a = Uri.parse(d + "/recent");
  public static final Uri b = Uri.parse(d + "/recommended");
  public static final Uri c = Uri.parse(d + "/playing");
  private static final Uri d = Uri.parse(SpotifyProvider.a + "/radio_stations");

  public static final Uri a(String paramString)
  {
    return Uri.parse(d + "/station/" + paramString);
  }

  public static final Uri a(boolean paramBoolean)
  {
    return Uri.parse(a + "?current=" + paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
