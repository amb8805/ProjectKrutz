package com.facebook;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(3)
public class q extends AsyncTask<Void, Void, List<t>>
{
  private static final String a = q.class.getCanonicalName();
  private static Method b;
  private final HttpURLConnection c;
  private final r d;
  private Exception e;

  static
  {
    Method[] arrayOfMethod = AsyncTask.class.getMethods();
    int i = arrayOfMethod.length;
    for (int j = 0; ; j++)
      if (j < i)
      {
        Method localMethod = arrayOfMethod[j];
        if ("executeOnExecutor".equals(localMethod.getName()))
        {
          Class[] arrayOfClass = localMethod.getParameterTypes();
          if ((arrayOfClass.length == 2) && (arrayOfClass[0] == Executor.class) && (arrayOfClass[1].isArray()))
            b = localMethod;
        }
      }
      else
      {
        return;
      }
  }

  public q(r paramr)
  {
    this(paramr, (byte)0);
  }

  private q(r paramr, byte paramByte)
  {
    this.d = paramr;
    this.c = null;
  }

  private List<t> b()
  {
    try
    {
      if (this.c == null)
        return Request.a(this.d);
      List localList = Request.a(this.c, this.d);
      return localList;
    }
    catch (Exception localException)
    {
      this.e = localException;
    }
    return null;
  }

  final q a()
  {
    try
    {
      if (b != null)
      {
        Method localMethod = b;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = aa.b();
        arrayOfObject[1] = null;
        localMethod.invoke(this, arrayOfObject);
        return this;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      execute(new Void[0]);
      return this;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label41;
    }
  }

  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.d.c() == null)
      this.d.a(new Handler());
  }

  public String toString()
  {
    return "{RequestAsyncTask:  connection: " + this.c + ", requests: " + this.d + "}";
  }
}

/* Location:
 * Qualified Name:     com.facebook.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
