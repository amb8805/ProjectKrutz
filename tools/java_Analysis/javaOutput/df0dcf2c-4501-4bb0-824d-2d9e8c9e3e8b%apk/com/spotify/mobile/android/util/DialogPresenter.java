package com.spotify.mobile.android.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.text.TextUtils;
import com.google.common.base.i;
import com.spotify.mobile.android.ui.fragments.logic.o;
import java.util.ArrayList;

public final class DialogPresenter extends Fragment
{
  private ArrayList<DialogPresenter.DialogTag> a = new ArrayList();
  private ArrayList<DialogPresenter.DialogTag> b = new ArrayList();
  private DialogPresenter.DialogTag c;

  public DialogPresenter()
  {
  }

  private o a(DialogPresenter.DialogTag paramDialogTag)
  {
    return (o)m_().a(DialogPresenter.DialogTag.a(paramDialogTag));
  }

  private void b()
  {
    try
    {
      boolean bool = this.b.isEmpty();
      if (bool);
      while (true)
      {
        return;
        if (this.c == null)
        {
          this.c = ((DialogPresenter.DialogTag)this.b.remove(0));
          o localo = a(this.c);
          bp.b("Showing dialog (%s)", new Object[] { localo });
          localo.D();
        }
      }
    }
    finally
    {
    }
  }

  private void f(Bundle paramBundle)
  {
    try
    {
      this.a = paramBundle.getParcelableArrayList("request_code_map");
      this.b = paramBundle.getParcelableArrayList("dialog_queue");
      this.c = ((DialogPresenter.DialogTag)paramBundle.getParcelable("current_dialog"));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      DialogPresenter.DialogTag localDialogTag = (DialogPresenter.DialogTag)this.a.get(paramInt1 - 1);
      o localo = a(localDialogTag);
      bp.b("Dialog has closed (%s)", new Object[] { localo });
      if (localo == null);
      while (true)
      {
        return;
        Assertion.a(localDialogTag, this.c);
        this.c = null;
        b();
      }
    }
    finally
    {
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      f(paramBundle);
  }

  public final void a(o paramo)
  {
    if (!TextUtils.isEmpty(paramo.k_()));
    for (boolean bool = true; ; bool = false)
    {
      i.a(bool, "Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
      paramo.a(this);
      return;
    }
  }

  public final void b(o paramo)
  {
    try
    {
      bp.b("Queuing dialog (%s)", new Object[] { paramo });
      this.b.add(new DialogPresenter.DialogTag(paramo.k_(), (byte)0));
      b();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int c(o paramo)
  {
    try
    {
      this.a.add(new DialogPresenter.DialogTag(paramo.k_(), (byte)0));
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void d(Bundle paramBundle)
  {
    try
    {
      super.d(paramBundle);
      paramBundle.putParcelableArrayList("request_code_map", this.a);
      paramBundle.putParcelableArrayList("dialog_queue", this.b);
      paramBundle.putParcelable("current_dialog", this.c);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.DialogPresenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
