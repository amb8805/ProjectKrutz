import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class dz extends bb
{
  public final int d;
  private final ArrayList e;
  private final Context f;

  public dz(Context paramContext, int paramInt1, int paramInt2)
  {
    super(150, 50, paramInt2);
    this.d = paramInt1;
    this.e = new ArrayList();
    this.f = paramContext;
  }

  private bl a(byte[] paramArrayOfByte, Long paramLong, String paramString)
  {
    if (paramArrayOfByte == null)
      return null;
    if (2 == this.d)
    {
      int i = this.f.getResources().getDimensionPixelSize(2131492865);
      return (bl)a(ab.a(paramArrayOfByte, i, i), paramLong, paramString);
    }
    return (bl)a(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length), paramLong, paramString);
  }

  public final Bitmap a(long paramLong)
  {
    return super.a(Long.valueOf(paramLong));
  }

  public final Bitmap a(long paramLong1, long paramLong2, String paramString)
  {
    return super.a(paramLong1, Long.valueOf(paramLong2), paramString, true);
  }

  public final void a(ar paramar)
  {
    this.e.add(paramar);
  }

  protected final void a(HashMap paramHashMap)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((ar)localIterator.next()).a(this, paramHashMap);
  }

  public final void b(ar paramar)
  {
    this.e.remove(paramar);
  }
}

/* Location:
 * Qualified Name:     dz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
