package com.spotify.mobile.android.spotlets.artist.model;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

final class e extends ContentObserver
{
  private Cursor b;
  private ArtistModel c;
  private boolean d;

  public e(a parama, Handler paramHandler)
  {
    super(paramHandler);
  }

  public final void a(Cursor paramCursor, ArtistModel paramArtistModel)
  {
    this.b = paramCursor;
    this.c = paramArtistModel;
    try
    {
      this.b.registerContentObserver(this);
      this.d = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    try
    {
      if (this.d)
      {
        this.b.unregisterContentObserver(this);
        this.d = false;
      }
      a.d(this.a).a(this.b);
      a.d(this.a).a(this.c);
      return;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
