package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.View;

public abstract class l
{
  private final Context a;
  private m b;
  private n c;

  public final Context a()
  {
    return this.a;
  }

  public final void a(m paramm)
  {
    this.b = paramm;
  }

  public final void a(n paramn)
  {
    if ((this.c != null) && (paramn != null))
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    this.c = paramn;
  }

  public final void a(boolean paramBoolean)
  {
    if (this.b != null)
      this.b.a(paramBoolean);
  }

  public abstract View b();

  public final void c()
  {
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
