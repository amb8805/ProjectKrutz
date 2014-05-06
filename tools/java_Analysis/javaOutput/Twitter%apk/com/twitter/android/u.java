package com.twitter.android;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class u
  implements DialogInterface.OnClickListener
{
  u(SignUpActivity paramSignUpActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      this.a.n = ((EditText)((AlertDialog)paramDialogInterface).findViewById(2131165239)).getText().toString();
      this.a.d();
    }
    paramDialogInterface.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
