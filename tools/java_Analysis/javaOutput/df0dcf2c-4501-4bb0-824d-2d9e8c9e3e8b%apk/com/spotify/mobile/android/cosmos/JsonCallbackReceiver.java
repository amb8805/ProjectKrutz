package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class JsonCallbackReceiver<T> extends ParsingCallbackReceiver<T>
{
  private static final ObjectMapper a = new ObjectMapper();
  private static final Charset b = Charset.forName("UTF-8");
  private final ObjectMapper c;
  private final Class<T> d;

  static
  {
    a.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public JsonCallbackReceiver(Handler paramHandler, Class<T> paramClass)
  {
    this(paramHandler, paramClass, (byte)0);
  }

  private JsonCallbackReceiver(Handler paramHandler, Class<T> paramClass, byte paramByte)
  {
    super(paramHandler);
    if (paramClass == null)
      throw new IllegalArgumentException("modelClass was null");
    this.d = paramClass;
    this.c = a;
  }

  protected final T a(Response paramResponse)
  {
    try
    {
      String str = new String(paramResponse.getBody(), b);
      Object localObject = this.c.readValue(str, this.d);
      return localObject;
    }
    catch (IOException localIOException)
    {
      throw new ParsingCallbackReceiver.ParserException(localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.cosmos.JsonCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
