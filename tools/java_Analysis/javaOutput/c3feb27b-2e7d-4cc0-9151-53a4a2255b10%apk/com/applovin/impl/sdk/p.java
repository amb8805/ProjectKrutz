package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class p extends Thread
{
  p(n paramn, String paramString, AtomicReference paramAtomicReference, CountDownLatch paramCountDownLatch)
  {
    super(paramString);
  }

  public void run()
  {
    str = "";
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/proc/cpuinfo" }).start().getInputStream();
      byte[] arrayOfByte = new byte[1024];
      for (int i = localInputStream.read(arrayOfByte); i > 0; i = localInputStream.read(arrayOfByte))
        str = str + new String(arrayOfByte, 0, i);
      localInputStream.close();
      this.a.set(str);
      return;
    }
    catch (Exception localException)
    {
      this.c.d.e("DataCollector", "Unable to collect CPU into", localException);
      return;
    }
    finally
    {
      this.b.countDown();
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
