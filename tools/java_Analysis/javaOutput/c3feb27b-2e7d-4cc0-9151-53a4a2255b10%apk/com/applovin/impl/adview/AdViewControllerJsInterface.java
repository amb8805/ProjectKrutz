package com.applovin.impl.adview;

import android.app.Activity;
import android.graphics.Point;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.AppLovinSdkImpl;
import com.applovin.impl.sdk.bg;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;

public class AdViewControllerJsInterface
{
  private static String TAG = "AdViewControllerJsInterface";
  private AppLovinAdVideoPlaybackListener adVideoPlaybackListener;
  private v adWebView;
  private AppLovinAd currentAd;
  private volatile boolean currentlyWaiting = false;
  private volatile boolean interruptNotify = false;
  private int lastKnownDuration;
  private Map lastParameters;
  private AppLovinLogger logger;
  private Activity parentActivity;
  private ViewGroup parentView;
  private AppLovinSdkImpl sdk;
  private String videoFilename;
  private AppLovinVideoOverlay videoOverlay;
  private final Object videoOverlayLock = new Object();

  public AdViewControllerJsInterface(AppLovinSdk paramAppLovinSdk, v paramv, Activity paramActivity, ViewGroup paramViewGroup, AppLovinAd paramAppLovinAd, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    this.sdk = ((AppLovinSdkImpl)paramAppLovinSdk);
    this.logger = paramAppLovinSdk.getLogger();
    this.parentActivity = paramActivity;
    this.adWebView = paramv;
    this.parentView = paramViewGroup;
    this.videoFilename = null;
    this.adVideoPlaybackListener = paramAppLovinAdVideoPlaybackListener;
    this.currentAd = paramAppLovinAd;
    this.logger.d(TAG, "New instance created.");
  }

  private int calculateDimension(String paramString, r paramr)
  {
    Point localPoint = j.a(this.parentActivity);
    if (paramr == r.a)
      return Math.round(parsePercent(paramString) * localPoint.x);
    if (paramr == r.b)
      return Math.round(parsePercent(paramString) * localPoint.y);
    return -1;
  }

  private void notifyOfNewTime()
  {
    new Thread(new p(this), "JSNotificationThread").start();
  }

  private float parsePercent(String paramString)
  {
    return Float.parseFloat(paramString) / 100.0F;
  }

  public void debugMessage(Map paramMap)
  {
    this.logger.d(TAG, "Received JS debug message: " + (String)paramMap.get("text"));
  }

  public void destroyVideoOverlay()
  {
    this.logger.d(TAG, "Asked to stop video if playing.");
    this.interruptNotify = true;
    synchronized (this.videoOverlayLock)
    {
      if (this.videoOverlay != null)
      {
        if (this.videoOverlay.getPlaybackState() == AppLovinVideoPlaybackState.PLAYING)
          this.videoOverlay.requestPause();
        localRelativeLayout = this.videoOverlay.getVideoLayout();
        this.videoOverlay.stopUnderlyingMediaPlayer();
        this.videoOverlay = null;
        this.currentAd = null;
        if (localRelativeLayout != null)
          this.parentActivity.runOnUiThread(new n(this, localRelativeLayout));
        return;
      }
      RelativeLayout localRelativeLayout = null;
    }
  }

  public void executeJS(String paramString)
  {
    this.adWebView.loadUrl("javascript:" + paramString);
    this.logger.d(TAG, "Invoking JS on WebView: " + paramString);
  }

  public int getPercentViewed()
  {
    if (this.videoOverlay == null)
      return 0;
    return this.videoOverlay.getPercentViewed();
  }

  public int getPlaybackDuration()
  {
    if (this.videoOverlay != null)
      return this.videoOverlay.getDuration();
    return this.lastKnownDuration;
  }

  public int getPlaybackTime()
  {
    if (this.videoOverlay == null)
      return 0;
    return this.videoOverlay.getPlaybackTime();
  }

  public void handleCommandInvocation(String paramString, Map paramMap)
  {
    this.logger.d(TAG, "Asked to invoke " + paramString + " with parameters: " + paramMap.toString());
    try
    {
      getClass().getDeclaredMethod(paramString, new Class[] { Map.class }).invoke(this, new Object[] { paramMap });
      return;
    }
    catch (Exception localException)
    {
      this.logger.e(TAG, "Unable to invoke method: " + paramString, localException);
    }
  }

  public void notifyJavaScriptOfNewState(AppLovinVideoPlaybackState paramAppLovinVideoPlaybackState)
  {
    String str = "";
    if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.PLAYING)
      str = "play";
    if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.PAUSED)
      str = "pause";
    if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.STOPPED)
      str = "stop";
    if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.FAILED)
      str = "fail";
    if (this.videoOverlay != null);
    for (int i = Math.round(this.videoOverlay.getPercentViewed()); ; i = 0)
    {
      if ((paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.STOPPED) && (i < 98))
        i = 100;
      executeJS("onPlaybackChanged('" + str + "','" + i + "')");
      return;
    }
  }

  public void pauseVideo(Map paramMap)
  {
    synchronized (this.videoOverlayLock)
    {
      if (this.videoOverlay != null)
      {
        this.videoOverlay.requestPause();
        return;
      }
      this.logger.e(TAG, "Template issue: pauseVideo called before renderVideo.");
    }
  }

  public void ping(Map paramMap)
  {
    this.logger.d(TAG, "Received ping request, invoking JS function ping(...)");
    executeJS("ping('Android SDK '5.2.2)");
  }

  public void playVideo(Map paramMap)
  {
    while (true)
    {
      synchronized (this.videoOverlayLock)
      {
        if (this.videoOverlay != null)
        {
          this.videoOverlay.requestPlay();
          return;
        }
        if (this.lastParameters != null)
        {
          this.lastParameters.put("autoplay", "true");
          renderVideo(this.lastParameters);
        }
      }
      this.logger.e(TAG, "Template issue: playVideo called before renderVideo.");
    }
  }

  public void renderVideo(Map paramMap)
  {
    if (this.lastParameters == null)
      this.lastParameters = paramMap;
    this.interruptNotify = false;
    int i = calculateDimension((String)paramMap.get("widthp"), r.a);
    int j = calculateDimension((String)paramMap.get("heightp"), r.b);
    Boolean localBoolean = Boolean.valueOf((String)paramMap.get("autoplay"));
    int k = Integer.parseInt((String)paramMap.get("x"));
    int m = Integer.parseInt((String)paramMap.get("y"));
    if (this.videoFilename != null)
      synchronized (this.videoOverlayLock)
      {
        if (this.videoOverlay == null)
        {
          File localFile = bg.a(this.videoFilename, this.parentActivity);
          this.logger.d(TAG, "Rending video from " + localFile + " at (" + k + "," + m + "), " + i + "x" + j + " autoplay is " + localBoolean);
          Uri localUri = Uri.fromFile(localFile);
          o localo = new o(this);
          this.videoOverlay = new AppLovinVideoOverlayImpl(k, m, i, j, this.parentActivity, localUri, this.logger, localo);
          this.parentView.addView(this.videoOverlay.getVideoLayout(), 0);
        }
        this.lastKnownDuration = this.videoOverlay.getDuration();
        if (localBoolean.booleanValue())
          playVideo(null);
        return;
      }
    this.logger.e(TAG, "renderVideo called before video filename was set");
  }

  public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    this.adVideoPlaybackListener = paramAppLovinAdVideoPlaybackListener;
  }

  public void setCloseButtonHidden(Map paramMap)
  {
    this.logger.d(TAG, "Ignoring a call to setCloseButtonHidden.");
  }

  public void setPercentViewed(int paramInt)
  {
    if (this.videoOverlay == null)
      renderVideo(this.lastParameters);
    this.videoOverlay.setPercentViewed(paramInt);
    notifyOfNewTime();
  }

  public void setPlaybackPercent(Map paramMap)
  {
    setPercentViewed(Integer.parseInt((String)paramMap.get("percent")));
  }

  public void setPlaybackTime(int paramInt)
  {
    if (this.videoOverlay == null)
      renderVideo(this.lastParameters);
    this.videoOverlay.setPlaybackTime(paramInt);
    notifyOfNewTime();
  }

  public void setPlaybackTime(Map paramMap)
  {
    setPlaybackTime(Integer.parseInt((String)paramMap.get("seconds")));
  }

  public void setVideoFilename(String paramString)
  {
    this.videoFilename = paramString;
  }

  public void stopVideo(Map paramMap)
  {
    pauseVideo(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AdViewControllerJsInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
