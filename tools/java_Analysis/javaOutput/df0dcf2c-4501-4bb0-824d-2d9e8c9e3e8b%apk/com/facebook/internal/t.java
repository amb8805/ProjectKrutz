package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

final class t extends BufferedInputStream
{
  HttpURLConnection a;

  t(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection)
  {
    super(paramInputStream, 8192);
    this.a = paramHttpURLConnection;
  }

  public final void close()
  {
    super.close();
    ad.a(this.a);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
