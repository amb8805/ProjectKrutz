package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.c;
import com.google.android.gms.plus.a;
import com.google.android.gms.plus.b;

public final class aw extends ImageView
  implements c, b
{
  private int a;
  private Uri b;
  private boolean c;
  private boolean d;
  private Bitmap e;
  private a f;

  public aw(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(Uri paramUri, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    int i;
    if (this.b == null)
      if (paramUri == null)
      {
        bool2 = bool1;
        if (this.a != paramInt)
          break label57;
        i = bool1;
        label27: if ((!bool2) || (i == 0))
          break label63;
      }
    label57: label63: label125: 
    do
      while (true)
      {
        return;
        bool2 = false;
        break;
        bool2 = this.b.equals(paramUri);
        break;
        i = 0;
        break label27;
        this.b = paramUri;
        this.a = paramInt;
        this.d = bool1;
        if ((this.b != null) && ("android.resource".equals(this.b.getScheme())));
        while (this.d)
        {
          if (this.b != null)
            break label125;
          setImageBitmap(null);
          return;
          bool1 = false;
        }
      }
    while ((!bool1) && ((this.f == null) || (!this.f.a())));
    if (bool1)
      setImageURI(this.b);
    while (true)
    {
      this.d = false;
      return;
      a locala = this.f;
      locala.a(this, this.a);
    }
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.c = true;
    if ((this.f != null) && (!this.f.b(this)))
      this.f.a(this);
    if (this.e != null)
      setImageBitmap(this.e);
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c = false;
    if ((this.f != null) && (this.f.b(this)))
      this.f.c(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
