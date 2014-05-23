package com.spotify.cosmos.smash;

public class Subscription<T>
{
  private boolean mCancelled;
  private Connection mConnection;
  private Parser<T> mParser;
  private Subscriber<T> mSubscriber;

  public Subscription(Parser<T> paramParser, Subscriber<T> paramSubscriber)
  {
    this.mParser = paramParser;
    this.mSubscriber = paramSubscriber;
    this.mCancelled = false;
  }

  public void cancel()
  {
    if (this.mConnection != null)
      this.mConnection.cancel(this);
    this.mCancelled = true;
  }

  void deliverError(Throwable paramThrowable)
  {
    if (!this.mCancelled)
      this.mSubscriber.onError(paramThrowable);
  }

  void deliverMessage(T paramT)
  {
    if (!this.mCancelled)
      this.mSubscriber.onData(paramT);
  }

  public boolean isCancelled()
  {
    return this.mCancelled;
  }

  T parseTransportMessage(TransportMessage paramTransportMessage)
  {
    return this.mParser.parseTransportMessage(paramTransportMessage);
  }

  void setCancelled(boolean paramBoolean)
  {
    this.mCancelled = paramBoolean;
  }

  void setConnection(Connection paramConnection)
  {
    this.mConnection = paramConnection;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Subscription
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
