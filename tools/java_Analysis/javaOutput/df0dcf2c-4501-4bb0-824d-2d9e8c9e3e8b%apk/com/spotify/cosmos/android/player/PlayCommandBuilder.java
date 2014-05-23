package com.spotify.cosmos.android.player;

import com.spotify.cosmos.android.player.models.IndexPath;
import com.spotify.cosmos.android.player.models.PlayOptions;
import com.spotify.cosmos.android.player.models.PlayerContext;
import com.spotify.cosmos.android.player.models.PlayerOptions;

public class PlayCommandBuilder
{
  private PlayCommand mPlayCommand;

  private PlayCommandBuilder(PlayerContext paramPlayerContext)
  {
    this.mPlayCommand = new PlayCommand(paramPlayerContext);
  }

  public static PlayCommandBuilder create(PlayerContext paramPlayerContext)
  {
    return new PlayCommandBuilder(paramPlayerContext);
  }

  private PlayOptions getOptions()
  {
    PlayOptions localPlayOptions = this.mPlayCommand.getOptions();
    if (localPlayOptions == null)
    {
      localPlayOptions = new PlayOptions();
      this.mPlayCommand.setOptions(localPlayOptions);
    }
    return localPlayOptions;
  }

  public PlayCommand build()
  {
    if (this.mPlayCommand.getContext() == null)
      throw new IllegalArgumentException("Cannot create PlayCommand with null context");
    return this.mPlayCommand;
  }

  public PlayCommandBuilder initiallyPaused(boolean paramBoolean)
  {
    getOptions().initiallyPaused = paramBoolean;
    return this;
  }

  public PlayCommandBuilder overridePlayerOptions(PlayerOptions paramPlayerOptions)
  {
    getOptions().playerOptionsOverride = paramPlayerOptions;
    return this;
  }

  public PlayCommandBuilder seekTo(int paramInt)
  {
    getOptions().seekTo = paramInt;
    return this;
  }

  public PlayCommandBuilder skipToIndex(int paramInt1, int paramInt2)
  {
    getOptions().skipToIndex = new IndexPath(paramInt1, paramInt2);
    return this;
  }

  public PlayCommandBuilder withExternalReferrer(String paramString)
  {
    this.mPlayCommand.setExternalReferrer(paramString);
    return this;
  }

  public PlayCommandBuilder withOptions(PlayOptions paramPlayOptions)
  {
    this.mPlayCommand.setOptions(paramPlayOptions);
    return this;
  }

  public PlayCommandBuilder withViewUri(String paramString)
  {
    this.mPlayCommand.setViewUri(paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.PlayCommandBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
