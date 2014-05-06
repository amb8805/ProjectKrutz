package com.twitter.android.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.twitter.android.ImageActivity;
import com.twitter.android.provider.ax;
import dy;

final class j
  implements View.OnClickListener
{
  j(TweetDetailView paramTweetDetailView, Context paramContext, dy paramdy, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.startActivity(new Intent(this.a, ImageActivity.class).putExtra("android.intent.extra.STREAM", Uri.parse(this.b.c)).putExtra("android.intent.extra.TEXT", this.d.a.d).putExtra("image_url", this.b.d).setData(Uri.parse(this.c)));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
