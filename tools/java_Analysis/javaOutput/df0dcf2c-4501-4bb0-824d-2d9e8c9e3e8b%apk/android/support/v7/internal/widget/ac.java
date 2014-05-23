package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

final class ac
  implements DialogInterface.OnClickListener, af
{
  private AlertDialog b;
  private ListAdapter c;
  private CharSequence d;

  private ac(ab paramab)
  {
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.c = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
  }

  public final void e()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.getContext());
    if (this.d != null)
      localBuilder.setTitle(this.d);
    this.b = localBuilder.setSingleChoiceItems(this.c, this.a.v, this).show();
  }

  public final void f()
  {
    this.b.dismiss();
    this.b = null;
  }

  public final boolean i()
  {
    if (this.b != null)
      return this.b.isShowing();
    return false;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a(paramInt);
    if (this.a.t != null)
    {
      ab localab = this.a;
      this.c.getItemId(paramInt);
      localab.a(null, paramInt);
    }
    f();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
