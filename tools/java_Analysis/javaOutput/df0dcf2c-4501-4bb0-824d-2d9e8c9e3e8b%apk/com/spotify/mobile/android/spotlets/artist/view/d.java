package com.spotify.mobile.android.spotlets.artist.view;

import android.graphics.Bitmap;
import android.os.AsyncTask;

final class d extends AsyncTask<Void, Void, Void>
{
  private final String b;
  private final Bitmap c;

  private d(ImageViewWithFaceDetection paramImageViewWithFaceDetection, String paramString, Bitmap paramBitmap)
  {
    this.b = paramString;
    this.c = paramBitmap;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
