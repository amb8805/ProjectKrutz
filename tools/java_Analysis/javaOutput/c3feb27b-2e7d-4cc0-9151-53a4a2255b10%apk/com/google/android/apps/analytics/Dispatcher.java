package com.google.android.apps.analytics;

abstract interface Dispatcher
{
  public abstract void dispatchHits(Hit[] paramArrayOfHit);

  public abstract void init(Dispatcher.Callbacks paramCallbacks);

  public abstract boolean isDryRun();

  public abstract void setDryRun(boolean paramBoolean);

  public abstract void stop();
}

/* Location:
 * Qualified Name:     com.google.android.apps.analytics.Dispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
