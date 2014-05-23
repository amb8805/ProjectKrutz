package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;

@TargetApi(14)
final class f extends android.support.v4.view.a
{
  f(AbsHListView paramAbsHListView)
  {
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    int i = this.b.a(paramView);
    ListAdapter localListAdapter = (ListAdapter)this.b.q();
    if ((i == -1) || (localListAdapter == null))
      break label37;
    label37: 
    while ((!this.b.isEnabled()) || (!localListAdapter.isEnabled(i)))
      return;
    if (i == this.b.r())
    {
      parama.e(true);
      parama.a(8);
    }
    while (true)
    {
      if (this.b.isClickable())
      {
        parama.a(16);
        parama.f(true);
      }
      if (!this.b.isLongClickable())
        break;
      parama.a(32);
      parama.g(true);
      return;
      parama.a(4);
    }
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    int i = this.b.a(paramView);
    ListAdapter localListAdapter = (ListAdapter)this.b.q();
    if ((i == -1) || (localListAdapter == null))
      return false;
    if ((!this.b.isEnabled()) || (!localListAdapter.isEnabled(i)))
      return false;
    long l = this.b.g(i);
    switch (paramInt)
    {
    default:
      return false;
    case 8:
      if (this.b.r() == i)
      {
        this.b.f(-1);
        return true;
      }
      return false;
    case 4:
      if (this.b.r() != i)
      {
        this.b.f(i);
        return true;
      }
      return false;
    case 16:
      if (this.b.isClickable())
        return this.b.a(paramView, i, l);
      return false;
    case 32:
    }
    if (this.b.isLongClickable())
      return this.b.b(paramView, i, l);
    return false;
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
