package com.spotify.cosmos.android;

public class RemoteRouterSubscription
  implements Subscription
{
  private Resolver mResolver;
  private int mSubscriptionId;

  RemoteRouterSubscription(Resolver paramResolver, int paramInt)
  {
    this.mResolver = paramResolver;
    this.mSubscriptionId = paramInt;
  }

  public boolean unsubscribe()
  {
    if ((!this.mResolver.isConnected()) || (this.mResolver.isConnecting()))
      return false;
    return this.mResolver.unsubscribe(this.mSubscriptionId);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.RemoteRouterSubscription
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
