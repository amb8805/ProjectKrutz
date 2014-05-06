package com.twitter.android;

import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.twitter.android.widget.ShadowTextView;
import java.io.File;
import java.io.FileNotFoundException;

final class p extends AsyncTask
{
  private final File a;
  private final cq b;

  private p(PostActivity paramPostActivity, File paramFile, cq paramcq)
  {
    this.a = paramFile;
    this.b = paramcq;
  }

  private Uri a(Void[] paramArrayOfVoid)
  {
    try
    {
      if (this.a.length() > 5242880L)
      {
        this.b.f = 4;
        boolean bool5 = this.a.delete();
        if (PostActivity.d)
          Log.d("PostActivity", "Deleted: " + bool5);
        localUri = null;
        return localUri;
      }
      Uri localUri = Uri.parse(MediaStore.Images.Media.insertImage(this.c.getContentResolver(), this.a.getAbsolutePath(), this.c.getString(2131427593), null));
      this.b.e = localUri;
      boolean bool4;
      return localUri;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      boolean bool3;
      return null;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      boolean bool2;
      return null;
    }
    finally
    {
      boolean bool1 = this.a.delete();
      if (PostActivity.d)
        Log.d("PostActivity", "Deleted: " + bool1);
    }
  }

  protected final void onPreExecute()
  {
    super.onPreExecute();
    this.c.k.setEnabled(false);
    this.c.h.setVisibility(0);
    this.c.j.setVisibility(0);
    this.c.i.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
