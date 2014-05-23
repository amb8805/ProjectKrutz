package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

final class f extends e
{
  f(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  public final ActionBar a()
  {
    k();
    return new j(this.a, this.a);
  }

  final void a(Bundle paramBundle)
  {
    this.a.getWindow().requestFeature(10);
    super.a(paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
