package it.sephiroth.android.library.a;

import android.util.Log;
import android.view.View;

public abstract class b
{
  protected View a;

  protected b(View paramView)
  {
    this.a = paramView;
    Log.i("ViewHelper", getClass().getSimpleName());
  }

  public abstract void a(int paramInt);

  public abstract void a(Runnable paramRunnable);

  public abstract boolean a();
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
