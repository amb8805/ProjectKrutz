package com.facebook.internal;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

final class i
{
  static JSONObject a(InputStream paramInputStream)
  {
    int i = 0;
    if (paramInputStream.read() != 0)
      return null;
    int j = 0;
    int k = 0;
    while (j < 3)
    {
      int n = paramInputStream.read();
      if (n == -1)
      {
        u.a();
        return null;
      }
      k = (k << 8) + (n & 0xFF);
      j++;
    }
    byte[] arrayOfByte = new byte[k];
    while (i < k)
    {
      int m = paramInputStream.read(arrayOfByte, i, k - i);
      if (m <= 0)
      {
        new StringBuilder("readHeader: stream.read stopped at ").append(Integer.valueOf(i)).append(" when expected ").append(k);
        u.a();
        return null;
      }
      i += m;
    }
    JSONTokener localJSONTokener = new JSONTokener(new String(arrayOfByte));
    try
    {
      Object localObject = localJSONTokener.nextValue();
      if (!(localObject instanceof JSONObject))
      {
        new StringBuilder("readHeader: expected JSONObject, got ").append(localObject.getClass().getCanonicalName());
        u.a();
        return null;
      }
      JSONObject localJSONObject = (JSONObject)localObject;
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new IOException(localJSONException.getMessage());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
