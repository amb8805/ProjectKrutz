package com.c.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public class d
{
  private Handler a;

  public d()
  {
    if (Looper.myLooper() != null)
      this.a = new d.1(this);
  }

  protected final Message a(int paramInt, Object paramObject)
  {
    if (this.a != null)
      return this.a.obtainMessage(paramInt, paramObject);
    Message localMessage = new Message();
    localMessage.what = paramInt;
    localMessage.obj = paramObject;
    return localMessage;
  }

  protected final void a()
  {
    b(a(2, null));
  }

  protected void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      a((String)paramMessage.obj);
      return;
    case 1:
    }
    Object[] arrayOfObject = (Object[])paramMessage.obj;
    c((Throwable)arrayOfObject[0], (String)arrayOfObject[1]);
  }

  public void a(String paramString)
  {
  }

  public void a(Throwable paramThrowable, String paramString)
  {
  }

  protected void a(Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    b(a(1, new Object[] { paramThrowable, paramArrayOfByte }));
  }

  void a(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    try
    {
      HttpEntity localHttpEntity = paramHttpResponse.getEntity();
      localObject = null;
      if (localHttpEntity != null)
      {
        String str = EntityUtils.toString(new BufferedHttpEntity(localHttpEntity), "UTF-8");
        localObject = str;
      }
      if (localStatusLine.getStatusCode() >= 300)
      {
        b(new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()), localObject);
        return;
      }
    }
    catch (IOException localIOException)
    {
      Object localObject;
      while (true)
      {
        b(localIOException, null);
        localObject = null;
      }
      b(localObject);
    }
  }

  protected final void b()
  {
    b(a(3, null));
  }

  protected final void b(Message paramMessage)
  {
    if (this.a != null)
    {
      this.a.sendMessage(paramMessage);
      return;
    }
    a(paramMessage);
  }

  protected void b(String paramString)
  {
    b(a(0, paramString));
  }

  protected final void b(Throwable paramThrowable, String paramString)
  {
    b(a(1, new Object[] { paramThrowable, paramString }));
  }

  protected void c(Throwable paramThrowable, String paramString)
  {
    a(paramThrowable, paramString);
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
