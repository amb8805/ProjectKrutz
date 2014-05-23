package net.hockeyapp.android.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class h
{
  private static String a = "versionInfo";

  public static String a(Context paramContext)
  {
    if (paramContext != null)
      return paramContext.getSharedPreferences("HockeyApp", 0).getString(a, "[]");
    return "[]";
  }

  public static void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("HockeyApp", 0).edit();
      localEditor.putString(a, paramString);
      e.a(localEditor);
    }
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.d.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
