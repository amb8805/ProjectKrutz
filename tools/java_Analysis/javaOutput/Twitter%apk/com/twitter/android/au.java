package com.twitter.android;

import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ProgressBar;
import bf;

final class au extends AsyncTask
  implements bf
{
  private au(ImageActivity paramImageActivity)
  {
  }

  public final void a(long paramLong1, long paramLong2)
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf((int)paramLong1);
    arrayOfInteger[1] = Integer.valueOf((int)paramLong2);
    publishProgress(arrayOfInteger);
  }

  protected final void onPreExecute()
  {
    this.a.b.setMax(2147483647);
    this.a.b.setProgress(0);
    this.a.b.setVisibility(0);
    this.a.a.setVisibility(4);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
