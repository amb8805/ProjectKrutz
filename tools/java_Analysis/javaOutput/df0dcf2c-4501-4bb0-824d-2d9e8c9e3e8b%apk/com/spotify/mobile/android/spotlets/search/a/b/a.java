package com.spotify.mobile.android.spotlets.search.a.b;

import android.text.TextUtils;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.cosmos.android.router.PlayerState;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.spotlets.search.model.g;

public final class a
{
  private final com.spotify.mobile.android.spotlets.search.a a;
  private final boolean b;
  private final boolean c;
  private final boolean d;

  public a(com.spotify.mobile.android.spotlets.search.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = parama;
    this.b = true;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }

  private CharSequence a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      paramString = this.a.a(paramString);
    return paramString;
  }

  public final void a(ListItemView paramListItemView, String paramString1, String paramString2, g paramg)
  {
    PlayerState localPlayerState = this.a.n().a();
    String str;
    boolean bool;
    CharSequence localCharSequence;
    if ((paramg instanceof SearchResults.Track))
    {
      str = localPlayerState.trackUri;
      bool = TextUtils.equals(str, paramg.getUri());
      paramListItemView.a(a(paramString1, this.b));
      localCharSequence = a(paramString2, this.c);
      if (!this.d)
        break label99;
      paramListItemView.c(localCharSequence);
    }
    while (true)
    {
      paramListItemView.c(bool);
      return;
      str = localPlayerState.contextUri;
      break;
      label99: paramListItemView.b(localCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
