package com.twitter.android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.twitter.android.client.g;

final class cm
  implements DialogInterface.OnClickListener
{
  cm(ProfileFragment paramProfileFragment, boolean paramBoolean, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((this.a) && (paramInt == 0))
    {
      Intent localIntent = new Intent(this.b, MessagesThreadActivity.class);
      localIntent.putExtra("user_name", this.c.e);
      localIntent.putExtra("owner_id", this.c.j.j());
      this.c.startActivity(localIntent);
      return;
    }
    if (!this.a);
    for (int i = paramInt + 1; ; i = paramInt)
    {
      switch (i)
      {
      default:
        return;
      case 1:
        this.c.startActivityForResult(new Intent(this.b, ListsActivity.class).setAction("android.intent.action.PICK").putExtra("owner_id", this.c.j.j()).putExtra("type", 0).putExtra("inquire_user_id", this.c.b), 1);
        return;
      case 2:
        if (this.c.d)
        {
          paramDialogInterface.dismiss();
          this.c.h(3);
          return;
        }
        paramDialogInterface.dismiss();
        this.c.h(2);
        return;
      case 3:
      }
      paramDialogInterface.dismiss();
      this.c.h(4);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
