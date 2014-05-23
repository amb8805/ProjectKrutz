package com.spotify.cosmos.android.router;

import java.util.ArrayList;
import java.util.List;

public class PlayerStateBuilder
{
  private static final String TRACK_RESOLVER_URI = "hm://track-resolver/v1?uri=";
  private PlayerState mState;

  private PlayerStateBuilder(PlayerState.Action paramAction)
  {
    this.mState = new PlayerState(paramAction);
  }

  public static PlayerStateBuilder create(PlayerState.Action paramAction)
  {
    return new PlayerStateBuilder(paramAction);
  }

  public static PlayerStateBuilder createFromContextUri(String paramString)
  {
    boolean bool1 = paramString.matches("^spotify:(album|artist):[A-Za-z0-9]+$");
    boolean bool2 = paramString.matches("^spotify:user:[^:]+:(playlist:[A-Za-z0-9]+|starred)$");
    if ((!bool1) && (!bool2))
      throw new IllegalArgumentException("This version of the player does not support createFromContextUri with this type of URI");
    if (bool2);
    for (String str = paramString; ; str = "hm://track-resolver/v1?uri=" + paramString)
      return create(PlayerState.Action.PLAY).contextUri(paramString).nextPageUrl(str).tracks(new ArrayList());
  }

  public PlayerState build()
  {
    if (this.mState.action == null)
      throw new IllegalArgumentException("Cannot create PlayerState with null action");
    if ((this.mState.index != null) && (this.mState.index.intValue() < 0))
      throw new IllegalArgumentException("Cannot create PlayerState with negative index");
    if (this.mState.action == PlayerState.Action.PLAY)
    {
      if ((this.mState.origin == null) || (this.mState.origin.source == null))
        throw new IllegalArgumentException("Cannot create PlayerState with null view URI");
      if (this.mState.contextUri == null)
        throw new IllegalArgumentException("Cannot create PlayerState with null context URI");
      if (this.mState.tracks == null)
        throw new IllegalArgumentException("Cannot create PlayerState with null track list");
    }
    return this.mState;
  }

  public PlayerStateBuilder contextUri(String paramString)
  {
    this.mState.contextUri = paramString;
    return this;
  }

  public PlayerStateBuilder index(int paramInt)
  {
    this.mState.index = Integer.valueOf(paramInt);
    return this;
  }

  public PlayerStateBuilder nextPageUrl(String paramString)
  {
    this.mState.nextPageUrl = paramString;
    return this;
  }

  public PlayerStateBuilder tracks(List<String> paramList)
  {
    this.mState.tracks = paramList;
    return this;
  }

  public PlayerStateBuilder viewUri(String paramString)
  {
    if (this.mState.origin == null)
      this.mState.origin = new PlayerState.PlayOrigin();
    this.mState.origin.source = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.PlayerStateBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
