package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class bd
  implements View.OnClickListener
{
  bd(ck paramck, Context paramContext, TextView paramTextView)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.startActivity(new Intent(this.a, PostActivity.class).putExtra("android.intent.extra.TEXT", this.b.getHint()));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
