package com.applovin.impl.adview;

import android.app.Activity;
import android.util.Log;
import java.util.Timer;

class p
  implements Runnable
{
  p(AdViewControllerJsInterface paramAdViewControllerJsInterface)
  {
  }

  public void run()
  {
    Log.d(AdViewControllerJsInterface.access$400(), "Waiting for VideoView to report a valid value.");
    AdViewControllerJsInterface.access$502(this.a, true);
    new Timer().schedule(new q(this), 2000L);
    while ((AdViewControllerJsInterface.access$300(this.a).getPercentViewed() == 0) && (!AdViewControllerJsInterface.access$600(this.a)));
    if (!AdViewControllerJsInterface.access$600(this.a))
    {
      AdViewControllerJsInterface.access$502(this.a, false);
      Log.d(AdViewControllerJsInterface.access$400(), "Video view returned percent: " + AdViewControllerJsInterface.access$300(this.a).getPercentViewed());
      AdViewControllerJsInterface.access$700(this.a).runOnUiThread(new s(this.a));
      return;
    }
    Log.d(AdViewControllerJsInterface.access$400(), "Notification was interrupted by timeout.");
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
