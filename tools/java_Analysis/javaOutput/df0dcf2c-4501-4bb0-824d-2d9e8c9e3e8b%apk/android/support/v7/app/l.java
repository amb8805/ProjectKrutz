package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

final class l extends ActionBar
{
  final Activity a;
  final a b;
  final android.app.ActionBar c;
  private ArrayList d = new ArrayList();

  public l(Activity paramActivity, a parama)
  {
    this.a = paramActivity;
    this.b = parama;
    this.c = paramActivity.getActionBar();
  }

  public final void a()
  {
    this.c.setIcon(2130838009);
  }

  public final void a(int paramInt)
  {
    this.c.setCustomView(paramInt);
  }

  public final void a(Drawable paramDrawable)
  {
    this.c.setIcon(paramDrawable);
  }

  public final void a(View paramView)
  {
    this.c.setCustomView(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.c.setTitle(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    this.c.setDisplayShowCustomEnabled(paramBoolean);
  }

  public final void b()
  {
    this.c.setDisplayHomeAsUpEnabled(true);
  }

  public final void b(Drawable paramDrawable)
  {
    this.c.setBackgroundDrawable(paramDrawable);
  }

  public final View c()
  {
    return this.c.getCustomView();
  }

  public final int d()
  {
    return this.c.getDisplayOptions();
  }

  public final Context e()
  {
    return this.c.getThemedContext();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
