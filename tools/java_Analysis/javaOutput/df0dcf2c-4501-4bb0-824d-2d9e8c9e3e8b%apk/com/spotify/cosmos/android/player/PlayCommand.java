package com.spotify.cosmos.android.player;

import com.spotify.cosmos.android.player.models.PlayOptions;
import com.spotify.cosmos.android.player.models.PlayerContext;

public class PlayCommand
{
  private PlayerContext context;
  private String externalReferrer;
  private PlayOptions options;
  private String viewUri;

  public PlayCommand(PlayerContext paramPlayerContext)
  {
    this.context = paramPlayerContext;
  }

  public PlayerContext getContext()
  {
    return this.context;
  }

  public String getExternalReferrer()
  {
    return this.externalReferrer;
  }

  public PlayOptions getOptions()
  {
    return this.options;
  }

  public String getViewUri()
  {
    return this.viewUri;
  }

  public void setExternalReferrer(String paramString)
  {
    this.externalReferrer = paramString;
  }

  public void setOptions(PlayOptions paramPlayOptions)
  {
    this.options = paramPlayOptions;
  }

  public void setViewUri(String paramString)
  {
    this.viewUri = paramString;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.PlayCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
