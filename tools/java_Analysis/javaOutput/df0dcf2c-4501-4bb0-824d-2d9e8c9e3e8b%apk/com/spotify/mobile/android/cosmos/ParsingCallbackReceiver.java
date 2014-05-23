package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.android.Resolver.CallbackReceiver;
import com.spotify.cosmos.router.Response;

public abstract class ParsingCallbackReceiver<T> extends Resolver.CallbackReceiver
{
  private final Handler a;

  public ParsingCallbackReceiver(Handler paramHandler)
  {
    super(null);
    this.a = paramHandler;
  }

  private void b(Throwable paramThrowable, ParsingCallbackReceiver.ErrorCause paramErrorCause)
  {
    if (this.a != null)
    {
      this.a.post(new ParsingCallbackReceiver.2(this, paramThrowable, paramErrorCause));
      return;
    }
    a(paramThrowable, paramErrorCause);
  }

  protected abstract T a(Response paramResponse);

  protected abstract void a(T paramT);

  protected abstract void a(Throwable paramThrowable, ParsingCallbackReceiver.ErrorCause paramErrorCause);

  protected final void onError(Throwable paramThrowable)
  {
    b(paramThrowable, ParsingCallbackReceiver.ErrorCause.a);
  }

  protected final void onResolved(Response paramResponse)
  {
    try
    {
      Object localObject = a(paramResponse);
      if (this.a != null)
      {
        this.a.post(new ParsingCallbackReceiver.1(this, paramResponse, localObject));
        return;
      }
      a(localObject);
      return;
    }
    catch (ParsingCallbackReceiver.ParserException localParserException)
    {
      b(localParserException, ParsingCallbackReceiver.ErrorCause.b);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
