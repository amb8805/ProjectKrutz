package com.spotify.cosmos.smash;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class Dispatcher
{
  private Executor mChannelExecutor;
  private Executor mTransportExecutor;

  public Dispatcher(Executor paramExecutor1, Executor paramExecutor2)
  {
    this.mTransportExecutor = paramExecutor1;
    this.mChannelExecutor = paramExecutor2;
  }

  public void postCancel(Connection paramConnection, Subscription<?> paramSubscription)
  {
    try
    {
      this.mTransportExecutor.execute(new Dispatcher.2(this, paramConnection, paramSubscription));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public <T> void postDeliverError(Subscription<T> paramSubscription, Throwable paramThrowable)
  {
    this.mChannelExecutor.execute(new Dispatcher.5(this, paramSubscription, paramThrowable));
  }

  public <T> void postDeliverMessage(Subscription<T> paramSubscription, T paramT)
  {
    this.mChannelExecutor.execute(new Dispatcher.4(this, paramSubscription, paramT));
  }

  public <T> void postParseMessage(Connection paramConnection, Subscription<T> paramSubscription, TransportMessage paramTransportMessage)
  {
    try
    {
      this.mTransportExecutor.execute(new Dispatcher.3(this, paramConnection, paramSubscription, paramTransportMessage));
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
    }
  }

  public void postSubscribe(Connection paramConnection, Subscription<?> paramSubscription, Request paramRequest)
  {
    try
    {
      this.mTransportExecutor.execute(new Dispatcher.1(this, paramConnection, paramSubscription, paramRequest));
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Dispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
