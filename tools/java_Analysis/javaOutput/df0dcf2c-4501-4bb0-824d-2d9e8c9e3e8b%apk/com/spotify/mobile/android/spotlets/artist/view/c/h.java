package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.artist.view.SnappingListView;
import com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewGallery;

public final class h extends a
{
  private SnappingListView b;
  private HeaderViewGallery c;

  h(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    super(paramContext, parama);
  }

  public final void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    b(LayoutInflater.from(d()).inflate(2130903191, null, false));
    this.b = ((SnappingListView)e().findViewById(2131362356));
    this.b.setOnCreateContextMenuListener(paramOnCreateContextMenuListener);
  }

  public final ListView b()
  {
    return this.b;
  }

  public final boolean h()
  {
    if (this.c.d())
    {
      this.b.a();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
