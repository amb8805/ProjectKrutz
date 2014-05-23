package com.twitter.android;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;

public class gh
{
  private TextView a;
  public int f;
  public ImageView g;
  public String h;
  public TextView i;
  public View j;
  public int k;
  public int l;

  public gh()
  {
  }

  public gh(View paramView)
  {
    this.g = ((ImageView)paramView.findViewById(2131165326));
    this.i = ((TextView)paramView.findViewById(2131165333));
    this.a = ((TextView)paramView.findViewById(2131165334));
    this.j = paramView.findViewById(2131165331);
  }

  public void a(g paramg)
  {
  }

  public final void b(g paramg)
  {
    String str = this.h;
    ImageView localImageView = this.g;
    Bitmap localBitmap;
    if ((localImageView != null) && (str != null))
    {
      localBitmap = paramg.g(str);
      if (localBitmap == null)
        localImageView.setImageResource(2130837539);
    }
    else
    {
      return;
    }
    int m = localBitmap.getWidth();
    int n = localBitmap.getHeight();
    float f1 = this.l / m;
    RectF localRectF1 = new RectF(0.0F, 0.0F, m, n);
    RectF localRectF2 = new RectF(0.0F, 0.0F, this.l, f1 * n);
    localImageView.setImageBitmap(localBitmap);
    Matrix localMatrix = localImageView.getImageMatrix();
    localMatrix.setRectToRect(localRectF1, localRectF2, Matrix.ScaleToFit.CENTER);
    localImageView.setImageMatrix(localMatrix);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.gh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
