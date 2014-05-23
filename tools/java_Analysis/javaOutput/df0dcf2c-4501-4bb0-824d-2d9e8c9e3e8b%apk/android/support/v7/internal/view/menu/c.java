package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

final class c extends q
{
  public c(ActionMenuPresenter paramActionMenuPresenter, ag paramag)
  {
    super(paramag);
    paramActionMenuPresenter.a(paramActionMenuPresenter.a);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    ActionMenuPresenter.a(this.a);
    this.a.b = 0;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
