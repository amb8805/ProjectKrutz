package com.spotify.cosmos.android;

import android.os.Handler;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import java.io.IOException;
import java.nio.charset.Charset;

@Deprecated
public abstract class JsonCallbackReceiver<T> extends ParsingCallbackReceiver<T>
{
  private static final Charset DEFAULT_CHARSET;
  private static final ObjectMapper DEFAULT_OBJECT_MAPPER = new ObjectMapper();
  private final Class<T> mClazz;
  private final ObjectMapper mObjectMapper;

  static
  {
    DEFAULT_CHARSET = Charset.forName("UTF-8");
    DEFAULT_OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public JsonCallbackReceiver(Handler paramHandler, Class<T> paramClass)
  {
    this(paramHandler, paramClass, null);
  }

  public JsonCallbackReceiver(Handler paramHandler, Class<T> paramClass, ObjectMapper paramObjectMapper)
  {
    super(paramHandler);
    if (paramClass == null)
      throw new IllegalArgumentException("modelClass was null");
    this.mClazz = paramClass;
    if (paramObjectMapper != null);
    while (true)
    {
      this.mObjectMapper = paramObjectMapper;
      return;
      paramObjectMapper = DEFAULT_OBJECT_MAPPER;
    }
  }

  protected T parseResponse(Response paramResponse)
  {
    try
    {
      String str = new String(paramResponse.getBody(), DEFAULT_CHARSET);
      Object localObject = this.mObjectMapper.readValue(str, this.mClazz);
      return localObject;
    }
    catch (IOException localIOException)
    {
      throw new ParsingCallbackReceiver.ParserException(localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.JsonCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
