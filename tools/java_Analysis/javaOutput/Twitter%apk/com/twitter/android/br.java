package com.twitter.android;

import ab;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.twitter.android.widget.ShadowTextView;

final class br extends AsyncTask
{
  private br(PostActivity paramPostActivity)
  {
  }

  // ERROR //
  private float a(cq paramcq)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 10	com/twitter/android/br:a	Lcom/twitter/android/PostActivity;
    //   6: invokevirtual 25	com/twitter/android/PostActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   9: aload_1
    //   10: getfield 31	com/twitter/android/cq:e	Landroid/net/Uri;
    //   13: invokevirtual 37	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   16: astore 7
    //   18: aload 7
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 43	java/io/InputStream:available	()I
    //   25: istore 9
    //   27: iload 9
    //   29: i2f
    //   30: ldc 44
    //   32: fdiv
    //   33: fstore 10
    //   35: aload_2
    //   36: invokestatic 49	cr:a	(Ljava/io/Closeable;)V
    //   39: fload 10
    //   41: freturn
    //   42: astore 6
    //   44: aload_2
    //   45: invokestatic 49	cr:a	(Ljava/io/Closeable;)V
    //   48: fconst_0
    //   49: freturn
    //   50: astore_3
    //   51: aconst_null
    //   52: astore 4
    //   54: aload_3
    //   55: astore 5
    //   57: aload 4
    //   59: invokestatic 49	cr:a	(Ljava/io/Closeable;)V
    //   62: aload 5
    //   64: athrow
    //   65: astore 8
    //   67: aload_2
    //   68: astore 4
    //   70: aload 8
    //   72: astore 5
    //   74: goto -17 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   2	18	42	java/io/IOException
    //   21	27	42	java/io/IOException
    //   2	18	50	finally
    //   21	27	65	finally
  }

  private cq a(cq[] paramArrayOfcq)
  {
    cq localcq = paramArrayOfcq[0];
    try
    {
      float f1 = a(localcq);
      localPostActivity = this.a;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = Float.valueOf(f1);
      localcq.i = localPostActivity.getString(2131427592, arrayOfObject);
      localCursor = this.a.getContentResolver().query(localcq.e, new String[] { "title" }, null, null, null);
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
          localcq.h = localCursor.getString(0);
        localCursor.close();
      }
      if (f1 > 5120.0F)
      {
        localcq.f = 4;
        return localcq;
      }
    }
    catch (SecurityException localSecurityException)
    {
      localcq.f = 1;
      return localcq;
    }
    while (true)
    {
      PostActivity localPostActivity;
      Object[] arrayOfObject;
      Cursor localCursor;
      float f2 = 72.0F * this.a.getResources().getDisplayMetrics().density;
      localcq.g = ab.a(this.a, localcq.e, f2, f2, 0);
    }
  }

  protected final void onPreExecute()
  {
    this.a.k.setEnabled(false);
    this.a.h.setVisibility(0);
    this.a.j.setVisibility(0);
    this.a.i.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.br
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
