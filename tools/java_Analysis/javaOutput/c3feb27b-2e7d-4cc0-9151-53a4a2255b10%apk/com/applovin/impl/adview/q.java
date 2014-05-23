package com.applovin.impl.adview;

import android.util.Log;
import java.util.TimerTask;

class q extends TimerTask
{
  q(p paramp)
  {
  }

  public void run()
  {
    if (AdViewControllerJsInterface.access$500(this.a.a))
    {
      Log.d(AdViewControllerJsInterface.access$400(), "Timeout was reached, expiring video notification.");
      AdViewControllerJsInterface.access$602(this.a.a, true);
      return;
    }
    Log.d(AdViewControllerJsInterface.access$400(), "Timeout was reached, notification has already finished.");
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
