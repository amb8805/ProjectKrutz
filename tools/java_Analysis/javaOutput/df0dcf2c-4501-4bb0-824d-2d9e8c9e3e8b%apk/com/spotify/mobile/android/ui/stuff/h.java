package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;

public final class h
{
  public static EmptyView a(Context paramContext, EmptyView paramEmptyView, String paramString)
  {
    paramEmptyView.a(i.b(paramContext, SpotifyIcon.cO));
    paramEmptyView.a(paramContext.getString(2131689945));
    paramEmptyView.b(paramString);
    return paramEmptyView;
  }

  public static EmptyView a(Context paramContext, String paramString)
  {
    return a(paramContext, new EmptyView(paramContext), paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
