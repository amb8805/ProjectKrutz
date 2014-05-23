package com.spotify.mobile.android.orbit;

import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import junit.framework.Assert;

public abstract class OrbitServiceObserver
{
  public static final int FEATURE_ADD_TO_QUEUE = 1;
  public static final int FEATURE_TOGGLE_SHUFFLE = 2;
  public static final int FEATURE_UNKNOWN = 0;
  public static final int PLAYBACK_ERROR_BANNED_BY_ARTIST = 19;
  public static final int PLAYBACK_ERROR_CAPPING_REACHED = 14;
  public static final int PLAYBACK_ERROR_COMMERCIAL_IS_PLAYING = 10;
  public static final int PLAYBACK_ERROR_DMCA_NO_SKIPS_REMAINING = 12;
  public static final int PLAYBACK_ERROR_DMCA_PREMIUM_ONLY = 1;
  public static final int PLAYBACK_ERROR_DMCA_PREMIUM_ONLY_IS_OFFLINE = 4;
  public static final int PLAYBACK_ERROR_LOCAL_TRACK_UNSYNCED = 9;
  public static final int PLAYBACK_ERROR_NEED_ONLINE_IN_OFFLINE_MODE = 5;
  public static final int PLAYBACK_ERROR_NEED_ONLINE_NO_CONNECTION = 3;
  public static final int PLAYBACK_ERROR_NONE = 0;
  public static final int PLAYBACK_ERROR_NOT_IN_REGION = 18;
  public static final int PLAYBACK_ERROR_NOT_IN_REGION_IS_OFFLINE = 7;
  public static final int PLAYBACK_ERROR_PREMIUM_ONLY = 2;
  public static final int PLAYBACK_ERROR_SHUFFLE_NO_SKIPS_REMAINING = 15;
  public static final int PLAYBACK_ERROR_SHUFFLE_PREMIUM_ONLY = 16;
  public static final int PLAYBACK_ERROR_SHUFFLE_PREMIUM_ONLY_IS_OFFLINE = 17;
  public static final int PLAYBACK_ERROR_UNABLE_TO_START_RADIO = 11;
  public static final int PLAYBACK_ERROR_UNAVAILABLE = 6;
  public static final int PLAYBACK_ERROR_UNAVAILABLE_IS_OFFLINE = 8;
  public static final int PLAYBACK_ERROR_UNKNOWN = 99;
  public static final int PLAYBACK_ERROR_WIFI_ONLY = 13;
  public static final int SOCIAL_ERROR_FAILED_TO_CONNECT = 1;
  public static final int SOCIAL_ERROR_NONE = 0;
  public static final int SOCIAL_ERROR_PERMISSIONS = 5;
  public static final int SOCIAL_ERROR_SERVICE_CONNECT_NOT_PERMITTED = 7;
  public static final int SOCIAL_ERROR_TOKEN_EXPIRED = 6;
  public static final int SOCIAL_ERROR_TRANSFER_AND_REMOVE_FAILED = 4;
  public static final int SOCIAL_ERROR_USER_DATA_FAIL = 2;
  public static final int SOCIAL_ERROR_USER_NOT_SOCIAL = 3;

  public OrbitServiceObserver()
  {
  }

  public static ClientEvent getPlaybackErrorAsClientEvent(int paramInt)
  {
    ClientEvent.SubEvent localSubEvent = ClientEvent.SubEvent.d;
    switch (paramInt)
    {
    default:
      Assert.fail("Unhandled playback error: " + paramInt);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 99:
    }
    while (true)
    {
      return new ClientEvent(ClientEvent.Event.b, localSubEvent);
      localSubEvent = ClientEvent.SubEvent.a;
      continue;
      localSubEvent = ClientEvent.SubEvent.e;
      continue;
      localSubEvent = ClientEvent.SubEvent.f;
      continue;
      localSubEvent = ClientEvent.SubEvent.g;
      continue;
      localSubEvent = ClientEvent.SubEvent.h;
      continue;
      localSubEvent = ClientEvent.SubEvent.i;
      continue;
      localSubEvent = ClientEvent.SubEvent.j;
      continue;
      localSubEvent = ClientEvent.SubEvent.k;
      continue;
      localSubEvent = ClientEvent.SubEvent.l;
      continue;
      localSubEvent = ClientEvent.SubEvent.m;
      continue;
      localSubEvent = ClientEvent.SubEvent.n;
      continue;
      localSubEvent = ClientEvent.SubEvent.o;
      continue;
      localSubEvent = ClientEvent.SubEvent.p;
      continue;
      localSubEvent = ClientEvent.SubEvent.q;
      continue;
      localSubEvent = ClientEvent.SubEvent.r;
      continue;
      localSubEvent = ClientEvent.SubEvent.s;
      continue;
      localSubEvent = ClientEvent.SubEvent.t;
      continue;
      localSubEvent = ClientEvent.SubEvent.u;
      continue;
      localSubEvent = ClientEvent.SubEvent.v;
      continue;
      localSubEvent = ClientEvent.SubEvent.w;
      continue;
      localSubEvent = ClientEvent.SubEvent.d;
    }
  }

  public static String getSocialErrorAsString(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "Unknown error: " + paramInt;
    case 0:
      return "kSocialErrorNone";
    case 1:
      return "kSocialErrorFailedToConnect";
    case 2:
      return "kSocialErrorUserDataFail";
    case 3:
      return "kSocialErrorUserNotSocial";
    case 4:
      return "kSocialErrorTransferAndRemoveFailed";
    case 5:
      return "kSocialErrorPermissions";
    case 6:
      return "kSocialErrorTokenExpired";
    case 7:
    }
    return "kSocialErrorServiceConnectNotPermitted";
  }

  public abstract void onConnectionError(int paramInt);

  public abstract void onFeatureError(int paramInt1, int paramInt2);

  public abstract void onIncognitoModeDisabledByTimer();

  public abstract void onLastFmAuthenticationError();

  public abstract void onLoginError(int paramInt);

  public abstract void onOfflineSyncError(int paramInt);

  public abstract void onOrbitStarted();

  public abstract void onOrbitStopped();

  public abstract void onPlayTokenLost();

  public abstract void onPlaybackError(int paramInt, String paramString);

  public abstract void onSessionIdle(boolean paramBoolean);

  public abstract void onSocialError(int paramInt, String paramString);

  public abstract void onSyncActive(boolean paramBoolean);

  public abstract void onUpdateAvailable(String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitServiceObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
