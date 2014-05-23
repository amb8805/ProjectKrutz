package com.spotify.mobile.android.spotlets.browse.datasource.hermes;

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.android.util.RequestBuilder;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.browse.model.CollectionFavorites;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.cc;
import java.lang.ref.WeakReference;

public final class a
{
  private final WeakReference<com.spotify.mobile.android.spotlets.browse.datasource.a<Playlist>> a;
  private Resolver b;
  private Handler c;

  public a(com.spotify.mobile.android.spotlets.browse.datasource.a<Playlist> parama)
  {
    this.a = new WeakReference(parama);
  }

  public final void a()
  {
    cc.a(this.b);
    Request localRequest = RequestBuilder.get("hm://apollo-genesis/v1/favorites").build();
    this.b.resolve(localRequest, new CollectionFavoritesHermesClient.1(this, this.c, CollectionFavorites.class));
  }

  public final void a(Context paramContext)
  {
    this.b = Cosmos.getResolver("com.spotify.feature.browse", paramContext);
    this.c = new Handler(paramContext.getMainLooper());
  }

  public final void b()
  {
    cc.a(this.b);
    this.b.destroy();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.hermes.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
