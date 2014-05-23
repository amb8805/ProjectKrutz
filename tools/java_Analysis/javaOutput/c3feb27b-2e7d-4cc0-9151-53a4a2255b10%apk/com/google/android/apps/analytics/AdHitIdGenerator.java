package com.google.android.apps.analytics;

public class AdHitIdGenerator
{
  private boolean adMobSdkInstalled;

  public AdHitIdGenerator()
  {
    try
    {
      if (Class.forName("com.google.ads.AdRequest") != null);
      for (boolean bool = true; ; bool = false)
      {
        this.adMobSdkInstalled = bool;
        return;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      this.adMobSdkInstalled = false;
    }
  }

  AdHitIdGenerator(boolean paramBoolean)
  {
    this.adMobSdkInstalled = paramBoolean;
  }

  int getAdHitId()
  {
    if (!this.adMobSdkInstalled)
      return 0;
    return AdMobInfo.getInstance().generateAdHitId();
  }
}

/* Location:
 * Qualified Name:     com.google.android.apps.analytics.AdHitIdGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
