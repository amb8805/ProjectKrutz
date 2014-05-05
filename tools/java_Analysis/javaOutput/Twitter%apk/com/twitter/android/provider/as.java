package com.twitter.android.provider;

import android.database.Cursor;

public final class as extends ax
{
  public static final String[] a = { "_id", "msg_id", "content", "recipient_id", "r_name", "r_username", "r_profile_image_url", "sender_id", "s_name", "s_username", "s_profile_image_url", "created", "entities", "thread" };
  private final long E;

  public as(long paramLong, Cursor paramCursor)
  {
    this.E = paramLong;
    a(paramCursor);
  }

  public final void a(Cursor paramCursor)
  {
    long l = paramCursor.getLong(7);
    if (l == this.E)
    {
      this.q = paramCursor.getLong(3);
      this.g = paramCursor.getString(4);
      this.e = paramCursor.getString(5);
    }
    for (this.k = paramCursor.getString(6); ; this.k = paramCursor.getString(10))
    {
      this.s = paramCursor.getLong(1);
      this.d = paramCursor.getString(2);
      this.h = paramCursor.getLong(11);
      this.x = paramCursor.getBlob(12);
      this.n = this.q;
      this.o = this.s;
      this.p = this.e;
      return;
      this.q = l;
      this.g = paramCursor.getString(8);
      this.e = paramCursor.getString(9);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
