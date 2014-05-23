package com.c.a.a;

import android.os.Message;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class f extends d
{
  public f()
  {
  }

  private static Object c(String paramString)
  {
    return new JSONTokener(paramString).nextValue();
  }

  protected final void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.a(paramMessage);
      return;
    case 100:
    }
    Object localObject = paramMessage.obj;
    if ((localObject instanceof JSONObject))
    {
      a((JSONObject)localObject);
      return;
    }
    if ((localObject instanceof JSONArray))
    {
      a((JSONArray)localObject);
      return;
    }
    new JSONException("Unexpected type " + localObject.getClass().getName());
  }

  public void a(Throwable paramThrowable, JSONArray paramJSONArray)
  {
  }

  public void a(Throwable paramThrowable, JSONObject paramJSONObject)
  {
  }

  public void a(JSONArray paramJSONArray)
  {
  }

  public void a(JSONObject paramJSONObject)
  {
  }

  protected final void b(String paramString)
  {
    try
    {
      b(a(100, c(paramString)));
      return;
    }
    catch (JSONException localJSONException)
    {
      b(localJSONException, paramString);
    }
  }

  protected final void c(Throwable paramThrowable, String paramString)
  {
    if (paramString != null)
      try
      {
        Object localObject = c(paramString);
        if ((localObject instanceof JSONObject))
        {
          a(paramThrowable, (JSONObject)localObject);
          return;
        }
        if (!(localObject instanceof JSONArray))
          return;
        a(paramThrowable, (JSONArray)localObject);
        return;
      }
      catch (JSONException localJSONException)
      {
        a(paramThrowable, paramString);
        return;
      }
    else
      a(paramThrowable, "");
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
