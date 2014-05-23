package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewGallery;

public final class g extends a
{
  private ListView b;
  private HeaderViewGallery c;

  g(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    super(paramContext, parama);
  }

  public final void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    b(LayoutInflater.from(d()).inflate(2130903201, null, false));
    this.b = ((ListView)e().findViewById(2131362356));
    this.b.setOnCreateContextMenuListener(paramOnCreateContextMenuListener);
    this.c = ((HeaderViewGallery)e().findViewById(2131362267));
  }

  public final ListView b()
  {
    return this.b;
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
