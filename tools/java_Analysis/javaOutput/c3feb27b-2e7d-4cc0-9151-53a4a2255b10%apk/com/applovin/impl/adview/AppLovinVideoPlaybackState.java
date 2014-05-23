package com.applovin.impl.adview;

public enum AppLovinVideoPlaybackState
{
  static
  {
    PAUSED = new AppLovinVideoPlaybackState("PAUSED", 1);
    STOPPED = new AppLovinVideoPlaybackState("STOPPED", 2);
    FAILED = new AppLovinVideoPlaybackState("FAILED", 3);
    AppLovinVideoPlaybackState[] arrayOfAppLovinVideoPlaybackState = new AppLovinVideoPlaybackState[4];
    arrayOfAppLovinVideoPlaybackState[0] = PLAYING;
    arrayOfAppLovinVideoPlaybackState[1] = PAUSED;
    arrayOfAppLovinVideoPlaybackState[2] = STOPPED;
    arrayOfAppLovinVideoPlaybackState[3] = FAILED;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AppLovinVideoPlaybackState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
