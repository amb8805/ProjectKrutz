package com.twitter.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class ao
  implements BaseColumns
{
  public static final Uri a = Uri.parse("content://com.twitter.android.provider.TwitterProvider/users");
  public static final Uri b = Uri.parse("content://com.twitter.android.provider.TwitterProvider/users/images");
  public static final Uri c = Uri.parse("content://com.twitter.android.provider.TwitterProvider/users/id");

  public ao()
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
