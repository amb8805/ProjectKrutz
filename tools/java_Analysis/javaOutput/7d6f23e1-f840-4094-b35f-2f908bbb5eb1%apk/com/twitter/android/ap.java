package com.twitter.android;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;

public final class ap extends gh
{
  public TextView a;
  public TextView b;
  public TextView c;
  public String d;
  public long e;
  private ImageView m;

  public ap(View paramView)
  {
    super(paramView);
    this.m = ((ImageView)paramView.findViewById(2131165197));
    this.a = ((TextView)paramView.findViewById(2131165341));
    this.b = ((TextView)paramView.findViewById(2131165342));
    this.c = ((TextView)paramView.findViewById(2131165340));
  }

  public final void a(g paramg)
  {
    if ((this.m != null) && (this.d != null))
    {
      Bitmap localBitmap = paramg.a(2, this.e, this.d);
      if (localBitmap != null)
        this.m.setBackgroundDrawable(new BitmapDrawable(this.m.getResources(), localBitmap));
    }
    else
    {
      return;
    }
    this.m.setBackgroundResource(2130837734);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
