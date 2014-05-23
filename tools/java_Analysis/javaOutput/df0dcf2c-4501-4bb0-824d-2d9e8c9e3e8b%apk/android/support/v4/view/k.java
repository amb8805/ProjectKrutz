package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

final class k extends Button
  implements View.OnClickListener
{
  private int b;

  public k(ActionBarTabStrip paramActionBarTabStrip)
  {
    super(paramActionBarTabStrip.getContext());
    setOnClickListener(this);
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
    setText(ActionBarTabStrip.a(this.a).b(paramInt));
  }

  public final boolean isFocused()
  {
    return this.b == ActionBarTabStrip.c(this.a);
  }

  public final void onClick(View paramView)
  {
    ActionBarTabStrip.b(this.a).a(this.b, true);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
