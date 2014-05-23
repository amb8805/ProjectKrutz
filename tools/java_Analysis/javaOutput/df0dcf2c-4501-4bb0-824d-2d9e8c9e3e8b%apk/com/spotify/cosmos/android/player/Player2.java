package com.spotify.cosmos.android.player;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Resolver.CallbackReceiver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.android.player.models.PlayOptions;
import com.spotify.cosmos.android.player.models.PlayOrigin;
import com.spotify.cosmos.android.player.models.PlayerContext;
import com.spotify.cosmos.android.player.models.requests.BoolValueRequest;
import com.spotify.cosmos.android.player.models.requests.IntValueRequest;
import com.spotify.cosmos.android.player.models.requests.PlayerContextRequest;
import com.spotify.cosmos.android.util.JacksonModel;
import com.spotify.cosmos.android.util.JacksonSerializer;
import com.spotify.cosmos.router.Request;
import java.util.HashMap;

@Deprecated
public class Player2
{
  private static final String DEFAULT_PLAYER_ID = "main";
  private static final String PLAYER_URI = "sp://player/v2/";
  private static String mId;
  private final String mFeatureIdentifier;
  private final String mFeatureVersion;
  private final Resolver mResolver;
  private final String mViewUri;

  public Player2(Resolver paramResolver, String paramString1, String paramString2, String paramString3)
  {
    this(paramResolver, paramString1, paramString2, paramString3, "main");
  }

  public Player2(Resolver paramResolver, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.mResolver = paramResolver;
    this.mViewUri = paramString1;
    this.mFeatureIdentifier = paramString2;
    this.mFeatureVersion = paramString3;
    mId = paramString4;
  }

  private PlayOrigin createPlayOrigin(String paramString1, String paramString2)
  {
    PlayOrigin localPlayOrigin = new PlayOrigin();
    if (paramString1 != null);
    for (localPlayOrigin.viewUri = paramString1; ; localPlayOrigin.viewUri = this.mViewUri)
    {
      if (paramString2 != null)
        localPlayOrigin.externalReferrer = paramString2;
      localPlayOrigin.featureIdentifier = this.mFeatureIdentifier;
      localPlayOrigin.featureVersion = this.mFeatureVersion;
      return localPlayOrigin;
    }
  }

  public static String getPlayerUri()
  {
    return "sp://player/v2/" + mId;
  }

  private String getPlayerUriForAction(Player2.Actions paramActions)
  {
    return getPlayerUri() + "/" + paramActions;
  }

  private boolean play(PlayerContext paramPlayerContext, PlayOptions paramPlayOptions, String paramString1, String paramString2, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    PlayerContextRequest localPlayerContextRequest = new PlayerContextRequest(paramPlayerContext, createPlayOrigin(paramString1, paramString2));
    if (paramPlayOptions != null)
      localPlayerContextRequest.options = paramPlayOptions;
    return sendRequestWithModel(Player2.Actions.PLAY, localPlayerContextRequest, paramCallbackReceiver);
  }

  private boolean resolveRequest(Request paramRequest, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return this.mResolver.resolve(paramRequest, paramCallbackReceiver);
  }

  private boolean sendRequestWithAction(Player2.Actions paramActions, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return resolveRequest(new Request("POST", getPlayerUriForAction(paramActions)), paramCallbackReceiver);
  }

  private boolean sendRequestWithModel(Player2.Actions paramActions, JacksonModel paramJacksonModel, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    try
    {
      Request localRequest = new Request("POST", getPlayerUriForAction(paramActions), new HashMap(), JacksonSerializer.toBytes(paramJacksonModel));
      return resolveRequest(localRequest, paramCallbackReceiver);
    }
    catch (JsonProcessingException localJsonProcessingException)
    {
      if (paramCallbackReceiver != null)
        paramCallbackReceiver.sendOnError(localJsonProcessingException);
    }
    return false;
  }

  private boolean sendRequestWithParam(Player2.Actions paramActions, int paramInt, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithModel(paramActions, new IntValueRequest(paramInt), paramCallbackReceiver);
  }

  private boolean sendRequestWithParam(Player2.Actions paramActions, boolean paramBoolean, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithModel(paramActions, new BoolValueRequest(paramBoolean), paramCallbackReceiver);
  }

  public boolean getState(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return resolveRequest(new Request("GET", getPlayerUri()), paramCallbackReceiver);
  }

  public boolean pause()
  {
    return pause(null);
  }

  public boolean pause(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithAction(Player2.Actions.PAUSE, paramCallbackReceiver);
  }

  public boolean play(PlayCommand paramPlayCommand)
  {
    return play(paramPlayCommand, null);
  }

  public boolean play(PlayCommand paramPlayCommand, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (paramPlayCommand == null)
      throw new IllegalArgumentException("Can't play with null playCommand");
    String str1 = paramPlayCommand.getViewUri();
    String str2 = paramPlayCommand.getExternalReferrer();
    return play(paramPlayCommand.getContext(), paramPlayCommand.getOptions(), str1, str2, paramCallbackReceiver);
  }

  public boolean play(PlayerContext paramPlayerContext)
  {
    return play(paramPlayerContext, null);
  }

  public boolean play(PlayerContext paramPlayerContext, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return play(paramPlayerContext, null, null, null, paramCallbackReceiver);
  }

  public boolean resume()
  {
    return resume(null);
  }

  public boolean resume(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithAction(Player2.Actions.RESUME, paramCallbackReceiver);
  }

  public boolean seekTo(int paramInt)
  {
    return seekTo(paramInt, null);
  }

  public boolean seekTo(int paramInt, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithParam(Player2.Actions.SEEK_TO, paramInt, paramCallbackReceiver);
  }

  public boolean setRepeatingContext(boolean paramBoolean)
  {
    return setRepeatingContext(paramBoolean, null);
  }

  public boolean setRepeatingContext(boolean paramBoolean, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithParam(Player2.Actions.SET_REPEATING_CONTEXT, paramBoolean, paramCallbackReceiver);
  }

  public boolean setRepeatingTrack(boolean paramBoolean)
  {
    return setRepeatingTrack(paramBoolean, null);
  }

  public boolean setRepeatingTrack(boolean paramBoolean, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithParam(Player2.Actions.SET_REPEATING_TRACK, paramBoolean, paramCallbackReceiver);
  }

  public boolean setShufflingContext(boolean paramBoolean)
  {
    return setShufflingContext(paramBoolean, null);
  }

  public boolean setShufflingContext(boolean paramBoolean, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithParam(Player2.Actions.SET_SHUFFLING_CONTEXT, paramBoolean, paramCallbackReceiver);
  }

  public boolean skipToNextTrack()
  {
    return skipToNextTrack(null);
  }

  public boolean skipToNextTrack(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithAction(Player2.Actions.SKIP_NEXT, paramCallbackReceiver);
  }

  public boolean skipToPreviousTrack()
  {
    return skipToPreviousTrack(null);
  }

  public boolean skipToPreviousTrack(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithAction(Player2.Actions.SKIP_PREV, paramCallbackReceiver);
  }

  public boolean stop()
  {
    return stop(null);
  }

  public boolean stop(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return sendRequestWithAction(Player2.Actions.STOP, paramCallbackReceiver);
  }

  public Subscription subscribe(Resolver.CallbackReceiver paramCallbackReceiver)
  {
    Request localRequest = new Request("SUB", getPlayerUri());
    return this.mResolver.subscribe(localRequest, paramCallbackReceiver);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.Player2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
