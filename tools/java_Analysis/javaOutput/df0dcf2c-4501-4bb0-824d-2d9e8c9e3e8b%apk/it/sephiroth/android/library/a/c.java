package it.sephiroth.android.library.a;

import android.util.Log;
import android.view.View;

public class c extends b
{
  public c(View paramView)
  {
    super(paramView);
  }

  public void a(int paramInt)
  {
    Log.d("ViewHelper", "setScrollX: " + paramInt);
    this.a.scrollTo(paramInt, this.a.getScrollY());
  }

  public void a(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }

  public boolean a()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
