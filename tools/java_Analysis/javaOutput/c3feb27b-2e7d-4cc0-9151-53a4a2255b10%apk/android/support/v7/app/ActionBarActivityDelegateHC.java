package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

class ActionBarActivityDelegateHC extends ActionBarActivityDelegateBase
{
  ActionBarActivityDelegateHC(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  public ActionBar createSupportActionBar()
  {
    ensureSubDecor();
    return new ActionBarImplHC(this.mActivity, this.mActivity);
  }

  void onCreate(Bundle paramBundle)
  {
    this.mActivity.getWindow().requestFeature(10);
    super.onCreate(paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateHC
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
