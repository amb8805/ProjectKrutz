package com.applovin.impl.adview;

import android.view.View;
import android.view.ViewGroup;

class n
  implements Runnable
{
  n(AdViewControllerJsInterface paramAdViewControllerJsInterface, View paramView)
  {
  }

  public void run()
  {
    AdViewControllerJsInterface.access$000(this.b).removeView(this.a);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
