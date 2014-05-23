package com.spotify.mobile.android.service;

import android.annotation.SuppressLint;
import android.os.Environment;
import java.io.File;

final class al
  implements am
{
  private String a;

  private al(String paramString)
  {
    this.a = paramString;
  }

  private String i()
  {
    return "Android/data/" + this.a + "/";
  }

  @SuppressLint({"SdCardPath"})
  public final String a()
  {
    return "/sdcard/spotify2/";
  }

  public final String b()
  {
    return Environment.getExternalStorageDirectory().getAbsolutePath();
  }

  public final String c()
  {
    return i() + "cache/";
  }

  public final String d()
  {
    return i() + "files/";
  }

  public final String e()
  {
    return "Android/data/" + this.a + "/cache";
  }

  public final String f()
  {
    return "Android/data/" + this.a + "/files/spotifycache";
  }

  public final String g()
  {
    return "settings";
  }

  public final boolean h()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
