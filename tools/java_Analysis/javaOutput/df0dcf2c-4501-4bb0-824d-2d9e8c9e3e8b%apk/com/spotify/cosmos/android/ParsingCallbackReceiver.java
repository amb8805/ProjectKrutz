package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.cosmos.router.Response;

@Deprecated
public abstract class ParsingCallbackReceiver<T> extends Resolver.CallbackReceiver
{
  private final Handler mHandler;

  public ParsingCallbackReceiver(Handler paramHandler)
  {
    super(null);
    this.mHandler = paramHandler;
  }

  private void postError(Throwable paramThrowable, ParsingCallbackReceiver.ErrorCause paramErrorCause)
  {
    if (this.mHandler != null)
    {
      this.mHandler.post(new ParsingCallbackReceiver.2(this, paramThrowable, paramErrorCause));
      return;
    }
    onError(paramThrowable, paramErrorCause);
  }

  private void postResult(Response paramResponse, T paramT)
  {
    if (this.mHandler != null)
    {
      this.mHandler.post(new ParsingCallbackReceiver.1(this, paramResponse, paramT));
      return;
    }
    onResolved(paramResponse, paramT);
  }

  protected final void onError(Throwable paramThrowable)
  {
    postError(paramThrowable, ParsingCallbackReceiver.ErrorCause.RESOLVING);
  }

  protected abstract void onError(Throwable paramThrowable, ParsingCallbackReceiver.ErrorCause paramErrorCause);

  protected final void onResolved(Response paramResponse)
  {
    try
    {
      postResult(paramResponse, parseResponse(paramResponse));
      return;
    }
    catch (ParsingCallbackReceiver.ParserException localParserException)
    {
      postError(localParserException, ParsingCallbackReceiver.ErrorCause.PARSING);
    }
  }

  protected abstract void onResolved(Response paramResponse, T paramT);

  protected abstract T parseResponse(Response paramResponse);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.ParsingCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
