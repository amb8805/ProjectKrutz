package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;

final class ej
  implements DialogInterface.OnClickListener
{
  ej(PostActivity paramPostActivity, int paramInt)
  {
  }

  private void a()
  {
    if (this.a == 1)
    {
      this.b.finish();
      return;
    }
    PostActivity.a(this.b);
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -3)
    {
      if (this.b.f != 0L)
        this.b.a.c(this.b.n, this.b.f);
      a();
    }
    while (paramInt != -1)
      return;
    this.b.a.a(this.b.n, this.b.f(), this.b.f, this.b.g, this.b.g());
    a();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ej
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
