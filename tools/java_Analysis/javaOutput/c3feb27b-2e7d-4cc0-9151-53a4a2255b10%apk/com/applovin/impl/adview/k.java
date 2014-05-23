package com.applovin.impl.adview;

class k
  implements Runnable
{
  k(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void run()
  {
    try
    {
      AdViewControllerImpl.d(this.a).loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
