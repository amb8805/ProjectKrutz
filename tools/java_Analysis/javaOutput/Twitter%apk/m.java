import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

public class m
{
  public final String a;
  public int b;
  public Object c;
  private SoftReference d;

  public m(Object paramObject, String paramString, Bitmap paramBitmap)
  {
    this.c = paramObject;
    this.a = paramString;
    this.b = 1;
    this.d = new SoftReference(null);
  }

  public final Bitmap a()
  {
    return (Bitmap)this.d.get();
  }

  public final void a(Bitmap paramBitmap)
  {
    this.d = new SoftReference(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
