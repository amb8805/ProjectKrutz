package com.spotify.mobile.android.util;

import android.text.TextUtils;

public final class ClientEventFactory
{
  public ClientEventFactory()
  {
  }

  public static ClientEvent.SubEvent a(String paramString)
  {
    cc.a(paramString);
    if (TextUtils.isEmpty(paramString))
      return ClientEvent.SubEvent.a;
    if ("offline_mode".equals(paramString))
      return ClientEvent.SubEvent.bi;
    if ("private_session".equals(paramString))
      return ClientEvent.SubEvent.bj;
    if ("broadcast_play_state".equals(paramString))
      return ClientEvent.SubEvent.aZ;
    if ("download_over_3g".equals(paramString))
      return ClientEvent.SubEvent.ba;
    if ("download_quality".equals(paramString))
      return ClientEvent.SubEvent.bb;
    if ("stream_quality".equals(paramString))
      return ClientEvent.SubEvent.bm;
    if ("facebook_connected".equals(paramString))
      return ClientEvent.SubEvent.bc;
    if ("post_to_facebook".equals(paramString))
      return ClientEvent.SubEvent.bk;
    if ("seconds_to_offline_expiry".equals(paramString))
      return ClientEvent.SubEvent.bl;
    if ("lastfm_username".equals(paramString))
      return ClientEvent.SubEvent.bg;
    if ("lastfm_password".equals(paramString))
      return ClientEvent.SubEvent.bh;
    if ("gapless".equals(paramString))
      return ClientEvent.SubEvent.bf;
    if ("crossfade".equals(paramString))
      return ClientEvent.SubEvent.bd;
    if ("crossfade_time_seconds".equals(paramString))
      return ClientEvent.SubEvent.be;
    if ("ap".equals(paramString))
      return ClientEvent.SubEvent.aY;
    throw new ClientEventFactory.NoMatchingSettingException(paramString + "not mapped to a " + ClientEvent.SubEvent.class.getSimpleName());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ClientEventFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
