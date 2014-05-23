package com.spotify.mobile.android.util;

import android.os.Process;
import com.spotify.mobile.android.c.a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ce
  implements a
{
  public ce()
  {
  }

  public static Reader a()
  {
    return new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
