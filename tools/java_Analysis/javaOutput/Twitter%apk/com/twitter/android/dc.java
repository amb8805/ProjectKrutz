package com.twitter.android;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.AsyncTaskLoader;

public final class dc extends AsyncTaskLoader
{
  private Cursor a;
  private Uri b;
  private String[] c;
  private String d;
  private String[] e;
  private String f;

  public dc(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    this.b = paramUri;
    this.c = paramArrayOfString1;
    this.d = paramString1;
    this.e = paramArrayOfString2;
    this.f = paramString2;
  }

  private void a(Cursor paramCursor)
  {
    if (isReset())
      if (paramCursor != null)
        paramCursor.close();
    Cursor localCursor;
    do
    {
      return;
      localCursor = this.a;
      this.a = paramCursor;
      if (isStarted())
        super.deliverResult(paramCursor);
    }
    while ((localCursor == null) || (localCursor == paramCursor) || (localCursor.isClosed()));
    localCursor.close();
  }

  protected final void onReset()
  {
    super.onReset();
    cancelLoad();
    Cursor localCursor = this.a;
    if ((localCursor != null) && (!localCursor.isClosed()))
      localCursor.close();
    this.a = null;
  }

  protected final void onStartLoading()
  {
    if (this.a != null)
    {
      a(this.a);
      return;
    }
    forceLoad();
  }

  protected final void onStopLoading()
  {
    cancelLoad();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
