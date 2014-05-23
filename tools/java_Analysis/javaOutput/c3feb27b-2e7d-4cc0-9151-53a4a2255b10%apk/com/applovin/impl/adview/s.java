package com.applovin.impl.adview;

class s
  implements Runnable
{
  s(AdViewControllerJsInterface paramAdViewControllerJsInterface)
  {
  }

  public void run()
  {
    this.a.notifyJavaScriptOfNewState(AdViewControllerJsInterface.access$300(this.a).getPlaybackState());
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
