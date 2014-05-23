package com.twitter.android.provider;

import android.content.UriMatcher;

final class n extends UriMatcher
{
  n(int paramInt)
  {
    super(-1);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "user_values", 1);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "user_values/#", 2);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "activity_states", 3);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "activity_states/*", 4);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "account_settings", 5);
    addURI("com.twitter.android.provider.GlobalDatabaseProvider", "account_settings/*", 6);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
