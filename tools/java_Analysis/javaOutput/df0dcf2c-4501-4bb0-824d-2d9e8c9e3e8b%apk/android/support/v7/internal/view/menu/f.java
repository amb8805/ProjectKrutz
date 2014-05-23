package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.View;

final class f extends y
{
  public f(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, n paramn, View paramView)
  {
    super(paramContext, paramn, paramView, true);
    a(paramActionMenuPresenter.a);
  }

  public final void onDismiss()
  {
    super.onDismiss();
    this.a.e.close();
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
