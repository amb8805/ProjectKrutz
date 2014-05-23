package com.spotify.cosmos.android.router;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Resolver.CallbackReceiver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.android.util.JacksonSerializer;
import com.spotify.cosmos.router.Request;
import java.util.HashMap;

public class Player
{
  public static final String PLAYER_URI = "sp://player/v1/main";
  private final Resolver mResolver;

  public Player(Resolver paramResolver)
  {
    this.mResolver = paramResolver;
  }

  public Boolean pause()
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.PAUSE).build(), null);
  }

  public Boolean pause(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.PAUSE).build(), paramCallbackReceiver);
  }

  public Boolean play(PlayerState paramPlayerState)
  {
    return sendRequestWithState(paramPlayerState, null);
  }

  public Boolean play(PlayerState paramPlayerState, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(paramPlayerState, paramCallbackReceiver);
  }

  public Boolean play(String paramString1, String paramString2, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.PLAY).viewUri(paramString1).contextUri(paramString2).build(), paramCallbackReceiver);
  }

  public Boolean resume()
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.RESUME).build(), null);
  }

  public Boolean resume(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.RESUME).build(), paramCallbackReceiver);
  }

  public Boolean sendRequestWithState(PlayerState paramPlayerState, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (paramPlayerState == null)
      throw new IllegalArgumentException("Cannot play with null player state");
    try
    {
      Request localRequest = new Request("POST", "sp://player/v1/main", new HashMap(), JacksonSerializer.toBytes(paramPlayerState));
      Boolean localBoolean = Boolean.valueOf(this.mResolver.resolve(localRequest, paramCallbackReceiver));
      return localBoolean;
    }
    catch (JsonProcessingException localJsonProcessingException)
    {
      if (paramCallbackReceiver != null)
        paramCallbackReceiver.sendOnError(localJsonProcessingException);
    }
    return Boolean.valueOf(false);
  }

  public Boolean skipToNextTrack()
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_NEXT).build(), null);
  }

  public Boolean skipToNextTrack(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_NEXT).build(), paramCallbackReceiver);
  }

  public Boolean skipToPreviousTrack()
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_PREV).build(), null);
  }

  public Boolean skipToPreviousTrack(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_PREV).build(), paramCallbackReceiver);
  }

  public Subscription subscribe(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    Request localRequest = new Request("SUB", "sp://player/v1/main");
    return this.mResolver.subscribe(localRequest, paramCallbackReceiver);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.Player
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
