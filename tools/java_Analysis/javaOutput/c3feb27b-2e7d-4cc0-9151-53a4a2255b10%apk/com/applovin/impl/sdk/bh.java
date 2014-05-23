package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinLogger;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

class bh extends Thread
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;
  private ServerSocket c = null;
  private volatile boolean d = false;

  bh(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    setName("AppLovinSdk:WebServer");
  }

  public void run()
  {
    this.b.d("AdWebServer", "Staring AppLovin web server...");
    int i = ((Integer)this.a.a(z.z)).intValue();
    try
    {
      this.c = new ServerSocket(i);
      while ((this.c != null) && (!this.d))
      {
        try
        {
          this.b.d("AdWebServer", "Waiting for a client on " + i + "...");
          Socket localSocket = this.c.accept();
          this.b.d("AdWebServer", "Client accepted, rendering request...");
          this.a.a().a(new ak(localSocket, this.a), aq.a);
        }
        catch (IOException localIOException2)
        {
        }
        if (!this.d)
          this.b.e("AdWebServer", "Web server caught IO error", localIOException2);
      }
    }
    catch (BindException localBindException)
    {
      while (true)
        Log.w("AdWebServer", "Unable to bind to port " + i + ", a server must be already running");
    }
    catch (IOException localIOException1)
    {
      while (true)
        Log.w("AdWebServer", "Unable to create server socket", localIOException1);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
