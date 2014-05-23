package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.common.base.i;

public final class y extends t
{
  private final Context a;

  public y(Context paramContext)
  {
    i.a(paramContext);
    this.a = paramContext;
  }

  public final String a()
  {
    return "Configuration";
  }

  public final String b()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    Configuration localConfiguration = this.a.getResources().getConfiguration();
    localStringBuilder1.append("User locale: ").append(String.valueOf(localConfiguration.locale)).append((char)'\n');
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Orientation: ");
    if (localConfiguration.orientation == 2);
    for (String str = "landscape"; ; str = "portrait")
    {
      localStringBuilder2.append(str).append((char)'\n');
      localStringBuilder1.append("Font scale: ").append(localConfiguration.fontScale).append((char)'\n');
      return localStringBuilder1.toString();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
