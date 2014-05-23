package com.spotify.mobile.android.spotlets.artist.view.a;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.spotify.mobile.android.spotlets.artist.view.b.c;

public final class a
{
  private final b a = new a.1(this);
  private final f b = new f(paramContext, paramString, this.a);
  private final e c = new e(paramContext, paramString, this.a);
  private String d = "";
  private View e;

  public a(Context paramContext, String paramString)
  {
  }

  public final void a()
  {
    this.b.c();
    this.c.c();
  }

  public final void a(ContextMenu paramContextMenu, View paramView)
  {
    if (!(paramView.getTag() instanceof c))
      return;
    c localc = (c)paramView.getTag();
    this.e = paramView;
    localc.a(new a.2(this, paramContextMenu));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
