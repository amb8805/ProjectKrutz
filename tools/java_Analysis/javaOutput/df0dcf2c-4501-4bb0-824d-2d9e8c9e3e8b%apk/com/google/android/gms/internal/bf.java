package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.plus.c;

final class bf
  implements View.OnClickListener, c
{
  private final c b = null;

  public bf(el paramel)
  {
  }

  public final void a(Intent paramIntent)
  {
    Context localContext = this.a.getContext();
    if (((localContext instanceof Activity)) && (paramIntent != null))
      ((Activity)localContext).startActivityForResult(paramIntent, this.a.b);
  }

  public final void onClick(View paramView)
  {
    if ((paramView == this.a.e) || (paramView == this.a.f))
      if (this.a.i != null)
        break label52;
    label52: for (Intent localIntent = null; this.b != null; localIntent = (Intent)this.a.i.a.getParcelable("intent"))
    {
      this.b.a(localIntent);
      return;
    }
    a(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
