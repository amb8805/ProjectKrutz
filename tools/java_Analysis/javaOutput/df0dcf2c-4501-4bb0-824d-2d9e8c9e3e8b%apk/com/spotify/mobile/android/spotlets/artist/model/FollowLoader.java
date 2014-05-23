package com.spotify.mobile.android.spotlets.artist.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.n;
import android.support.v4.app.o;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.a;
import com.spotify.mobile.android.spotlets.follow.b;

public final class FollowLoader
{
  private final String a;
  private final Context b;
  private final h c;
  private FollowManager d;
  private n e;
  private g f;
  private b g = new FollowLoader.1(this);
  private Resolver h;
  private Handler i;
  private o<Cursor> j = new FollowLoader.2(this);

  public FollowLoader(Context paramContext, String paramString, h paramh)
  {
    this.a = paramString;
    this.b = paramContext;
    this.c = paramh;
    this.d = ((FollowManager)c.a(FollowManager.class));
    this.i = new Handler(Looper.getMainLooper());
    this.h = Cosmos.getResolver("com.spotify.artist", paramContext);
    this.f = new g(this, (byte)0);
  }

  public final void a()
  {
    this.h.destroy();
    this.d.b(this.a, this.g);
  }

  public final void a(n paramn)
  {
    this.d.a(this.a, this.g);
    if (this.d.a(this.a) != null)
    {
      a locala = this.d.a(this.a);
      this.c.a(locala);
      return;
    }
    this.h.connect();
    this.e = paramn;
    this.e.a(2131362089, null, this.j);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Uri.decode(this.a);
    Request localRequest = new Request("GET", "hm://socialgraph/v2/counts?format=json", null, String.format("{\"target_uris\": [\"%s\"]}", arrayOfObject).getBytes());
    this.h.resolve(localRequest, new FollowLoader.3(this, this.i, [Lcom.spotify.mobile.android.spotlets.artist.model.FollowLoader.SimpleProfileModel.class));
  }

  public final void a(boolean paramBoolean)
  {
    this.d.a(this.a, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.FollowLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
