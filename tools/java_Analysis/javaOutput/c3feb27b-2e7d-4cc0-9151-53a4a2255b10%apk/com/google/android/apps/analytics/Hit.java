package com.google.android.apps.analytics;

public class Hit
{
  final long hitId;
  final String hitString;

  Hit(String paramString, long paramLong)
  {
    this.hitString = paramString;
    this.hitId = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.apps.analytics.Hit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
