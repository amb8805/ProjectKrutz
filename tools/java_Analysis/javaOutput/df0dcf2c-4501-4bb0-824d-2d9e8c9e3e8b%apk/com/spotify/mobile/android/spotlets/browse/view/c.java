package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.browse.util.b;

public final class c
{
  private b a;
  private int b;

  public c(Context paramContext)
  {
    this.a = new b(paramContext, GenreCell.class.getName(), Bitmap.CompressFormat.JPEG);
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    if (i < j);
    while (true)
    {
      this.b = (i / 2);
      return;
      i = j;
    }
  }

  public final void a(ImageView paramImageView, String paramString)
  {
    this.a.a(paramImageView, paramString, this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
