package com.spotify.mobile.android.spotlets.follow;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;

public final class FollowersCountLoader
{
  private final Resolver a;
  private final Handler b;

  public FollowersCountLoader(Context paramContext)
  {
    this.b = new Handler(paramContext.getMainLooper());
    this.a = new DeferredResolver("main", paramContext);
    this.a.connect();
  }

  public final void a()
  {
    this.a.destroy();
  }

  public final void a(String paramString, e parame)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Uri.decode(paramString);
    Request localRequest = new Request("GET", "hm://socialgraph/v2/counts?format=json", null, String.format("{\"target_uris\": [\"%s\"]}", arrayOfObject).getBytes());
    this.a.resolve(localRequest, new FollowersCountLoader.1(this, this.b, [Lcom.spotify.mobile.android.spotlets.follow.FollowersCountLoader.Count.class, parame));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.FollowersCountLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
