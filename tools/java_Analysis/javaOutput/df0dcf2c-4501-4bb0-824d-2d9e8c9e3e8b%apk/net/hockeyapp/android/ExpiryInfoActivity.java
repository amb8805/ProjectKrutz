package net.hockeyapp.android;

import android.app.Activity;
import android.os.Bundle;
import net.hockeyapp.android.views.a;

public class ExpiryInfoActivity extends Activity
{
  public ExpiryInfoActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitle(f.a(h.b(), 13));
    setContentView(new a(this, f.a(h.b(), 14)));
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.ExpiryInfoActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
