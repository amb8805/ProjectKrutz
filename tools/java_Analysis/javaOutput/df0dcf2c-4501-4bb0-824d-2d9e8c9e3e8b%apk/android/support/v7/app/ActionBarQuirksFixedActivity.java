package android.support.v7.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

public class ActionBarQuirksFixedActivity extends ActionBarActivity
{
  private boolean o;

  public ActionBarQuirksFixedActivity()
  {
  }

  final boolean a(int paramInt, Menu paramMenu)
  {
    if (this.o)
      return false;
    return super.a(paramInt, paramMenu);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.o = false;
    super.onCreate(paramBundle);
    if ((Build.VERSION.SDK_INT >= 11) && (Build.VERSION.SDK_INT < 18))
      getWindow().setCallback(new m(getWindow().getCallback()));
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.o = true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarQuirksFixedActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
