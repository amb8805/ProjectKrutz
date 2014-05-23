package com.spotify.mobile.android.spotlets.artist.model;

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.android.util.RequestBuilder;

public final class a
{
  private final b a;
  private final d b;
  private final c c;
  private final e d;
  private Resolver e;
  private Handler f;

  private a(Context paramContext, b paramb)
  {
    this.a = paramb;
    this.b = new d(this, paramContext.getContentResolver());
    this.c = new c(this, paramContext.getContentResolver());
    this.d = new e(this, new Handler());
    this.f = new Handler(paramContext.getMainLooper());
    this.e = Cosmos.getResolver("com.spotify.artist", paramContext);
    this.e.connect();
  }

  public static a a(Context paramContext, b paramb)
  {
    return new a(paramContext, paramb);
  }

  public final void a()
  {
    this.e.destroy();
  }

  public final void a(com.spotify.mobile.android.spotlets.artist.b.b paramb)
  {
    String str = paramb.g();
    this.e.resolve(RequestBuilder.get(str).build(), new ArtistLoader.1(this, this.f, ArtistModel.class));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
