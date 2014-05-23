package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.a.c;
import android.widget.ImageButton;

final class e extends ImageButton
  implements h
{
  public e(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, c.g);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
  }

  public final boolean d()
  {
    return false;
  }

  public final boolean e()
  {
    return false;
  }

  public final boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.a.c();
    return true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
