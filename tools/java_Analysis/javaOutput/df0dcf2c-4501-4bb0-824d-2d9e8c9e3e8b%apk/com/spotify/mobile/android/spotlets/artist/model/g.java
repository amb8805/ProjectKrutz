package com.spotify.mobile.android.spotlets.artist.model;

import com.google.common.base.Optional;
import com.google.common.base.i;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.a;

final class g
{
  private Optional<Boolean> b = Optional.d();
  private Optional<Integer> c = Optional.d();
  private Optional<Integer> d = Optional.d();
  private boolean e;

  private g(FollowLoader paramFollowLoader)
  {
  }

  private boolean a()
  {
    return (this.e) || ((this.b.a()) && (this.c.a()) && (this.d.a()));
  }

  private void b()
  {
    if (!a())
      return;
    if (this.e)
    {
      FollowLoader.a(this.a).a();
      return;
    }
    i.b(a());
    if (!this.e);
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool);
      a locala = new a(FollowLoader.d(this.a), ((Integer)this.c.b()).intValue(), ((Integer)this.d.b()).intValue(), ((Boolean)this.b.b()).booleanValue());
      FollowLoader.e(this.a).a(locala);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
