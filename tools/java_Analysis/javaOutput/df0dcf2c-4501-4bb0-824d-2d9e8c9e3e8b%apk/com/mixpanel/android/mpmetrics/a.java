package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

final class a
{
  private static int e = 0;
  private static int f = 1;
  private static int g = 2;
  private static int h = 5;
  private static int i = 11;
  private static int j = 4;
  private static int k = 10;
  private static final Map<Context, a> l = new HashMap();
  private final AtomicBoolean a;
  private final d b;
  private final Context c;
  private final j d;

  private a(Context paramContext)
  {
    this.c = paramContext;
    this.d = j.a(paramContext);
    this.a = new AtomicBoolean(false);
    this.b = new d(this);
  }

  public static a a(Context paramContext)
  {
    synchronized (l)
    {
      Context localContext = paramContext.getApplicationContext();
      if (!l.containsKey(localContext))
      {
        locala = new a(localContext);
        l.put(localContext, locala);
        return locala;
      }
      a locala = (a)l.get(localContext);
    }
  }

  protected static MPDbAdapter b(Context paramContext)
  {
    return new MPDbAdapter(paramContext);
  }

  protected static ServerMessage b()
  {
    return new ServerMessage();
  }

  public final void a()
  {
    Message localMessage = Message.obtain();
    localMessage.what = g;
    this.b.a(localMessage);
  }

  public final void a(b paramb)
  {
    Message localMessage = Message.obtain();
    localMessage.what = f;
    localMessage.obj = paramb;
    this.b.a(localMessage);
  }

  public final void a(c paramc)
  {
    Message localMessage = Message.obtain();
    localMessage.what = i;
    localMessage.obj = paramc;
    this.b.a(localMessage);
  }

  public final void a(JSONObject paramJSONObject)
  {
    Message localMessage = Message.obtain();
    localMessage.what = e;
    localMessage.obj = paramJSONObject;
    this.b.a(localMessage);
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
