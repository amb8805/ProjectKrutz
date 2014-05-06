package com.twitter.android;

import ac;
import android.content.Intent;
import android.widget.TextView;
import com.twitter.android.service.i;

final class gf extends i
{
  gf(AuthenticatorActivity paramAuthenticatorActivity)
  {
  }

  public final void a(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("resp_code", 0);
    this.a.removeDialog(1);
    if (i == 200)
    {
      ac localac = (ac)paramIntent.getParcelableExtra("auth");
      if (!this.a.a.booleanValue())
      {
        this.a.a(localac);
        return;
      }
      this.a.a(localac, true);
      return;
    }
    ((TextView)this.a.findViewById(2131165274)).setText(this.a.getText(2131427502));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.gf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
