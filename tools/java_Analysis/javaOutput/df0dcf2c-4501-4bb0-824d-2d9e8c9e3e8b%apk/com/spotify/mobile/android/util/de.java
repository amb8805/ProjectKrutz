package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.ui.actions.a;

public final class de
{
  private final a a = (a)c.a(a.class);
  private final Context b;

  public de(Context paramContext)
  {
    this.b = paramContext;
  }

  private void a(Story paramStory, String paramString1, String paramString2)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.J);
    localClientEvent.a("story_id", paramStory.e());
    localClientEvent.a("story_music_uri", paramStory.g().d());
    localClientEvent.a("type", paramString1);
    localClientEvent.a("url", paramString2);
    a.a(this.b, ViewUri.g, ViewUri.SubView.a, localClientEvent);
  }

  public final void a(long paramLong)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ac, ClientEvent.SubEvent.ac);
    localClientEvent.a("error", "hermes_error");
    localClientEvent.a("code", String.valueOf(paramLong));
    a.a(this.b, ViewUri.g, ViewUri.SubView.a, localClientEvent);
  }

  public final void a(long paramLong1, long paramLong2)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.W, ClientEvent.SubEvent.M);
    if (paramLong2 == 0L)
      localClientEvent.a("data_loaded_from_server", String.valueOf(paramLong1));
    while (true)
    {
      a.a(this.b, ViewUri.g, ViewUri.SubView.a, localClientEvent);
      return;
      localClientEvent.a("ended_on_error", String.valueOf(paramLong1));
    }
  }

  public final void a(Story paramStory)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.Y, ClientEvent.SubEvent.ab);
    localClientEvent.a("story_id", paramStory.e());
    localClientEvent.a("story_music_uri", paramStory.g().d());
    a.a(this.b, ViewUri.g, ViewUri.SubView.a, localClientEvent);
  }

  public final void a(Story paramStory, String paramString)
  {
    a(paramStory, "reason_item", paramString);
  }

  public final void b(Story paramStory, String paramString)
  {
    a(paramStory, "meta_total", paramString);
  }

  public final void c(Story paramStory, String paramString)
  {
    a(paramStory, "hero", paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.de
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
