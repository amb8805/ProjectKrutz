package com.spotify.mobile.android.util;

import android.app.Activity;
import android.os.AsyncTask;
import com.spotify.mobile.android.service.ak;
import java.io.IOException;

public final class v extends AsyncTask<Void, Integer, Long[]>
{
  ak a;
  Activity b;

  public v(Activity paramActivity, ak paramak)
  {
    this.a = paramak;
    this.b = paramActivity;
  }

  private Long[] a()
  {
    Long[] arrayOfLong = new Long[2];
    try
    {
      arrayOfLong[0] = Long.valueOf(new cz(this.a.b()).d());
      String str = this.a.a();
      if (str != null)
      {
        arrayOfLong[1] = Long.valueOf(new cz(str).d());
        return arrayOfLong;
      }
      arrayOfLong[1] = Long.valueOf(9223372036854775807L);
      return arrayOfLong;
    }
    catch (IOException localIOException)
    {
      cancel(false);
    }
    return arrayOfLong;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
