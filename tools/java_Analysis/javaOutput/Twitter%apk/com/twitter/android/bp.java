package com.twitter.android;

import android.os.AsyncTask;

final class bp extends AsyncTask
{
  private bp(ImageActivity paramImageActivity)
  {
  }

  protected final void onPreExecute()
  {
    this.a.showDialog(1);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
