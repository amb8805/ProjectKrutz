package com.twitter.android;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;

public final class bt extends gh
{
  public TextView a;
  public TextView b;
  public long c;

  public bt(View paramView)
  {
    super(paramView);
    this.g = ((ImageView)paramView.findViewById(2131165258));
    this.a = ((TextView)paramView.findViewById(2131165306));
    this.b = ((TextView)paramView.findViewById(2131165375));
  }

  public final void a(g paramg)
  {
    if ((this.g != null) && (this.h != null))
    {
      Bitmap localBitmap = paramg.a(1, this.c, this.h);
      if (localBitmap != null)
        this.g.setBackgroundDrawable(new BitmapDrawable(this.g.getResources(), localBitmap));
    }
    else
    {
      return;
    }
    this.g.setBackgroundResource(2130837734);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
