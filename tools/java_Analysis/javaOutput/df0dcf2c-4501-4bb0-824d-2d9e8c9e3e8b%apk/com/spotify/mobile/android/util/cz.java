package com.spotify.mobile.android.util;

import android.os.StatFs;
import java.io.IOException;

public final class cz
{
  private final StatFs a;

  public cz(String paramString)
  {
    try
    {
      this.a = new StatFs(paramString);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new IOException(localRuntimeException.getMessage());
    }
  }

  public final int a()
  {
    return this.a.getBlockSize();
  }

  public final int b()
  {
    return this.a.getFreeBlocks();
  }

  public final int c()
  {
    return this.a.getBlockCount();
  }

  public final long d()
  {
    return this.a.getAvailableBlocks() * this.a.getBlockSize();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
