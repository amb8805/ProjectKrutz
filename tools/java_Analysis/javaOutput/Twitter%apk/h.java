import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

public final class h
{
  private ArrayList a = new ArrayList();
  private ArrayList b = new ArrayList(10);
  private HashMap c = new HashMap(20, 20.0F);
  private Handler d = new Handler(Looper.getMainLooper());
  private int e;

  public h(int paramInt)
  {
    this.e = paramInt;
  }

  private be a(Long paramLong)
  {
    SoftReference localSoftReference = (SoftReference)this.c.get(paramLong);
    if (localSoftReference != null)
      return (be)localSoftReference.get();
    return null;
  }

  public final be a(Long paramLong, byte[] paramArrayOfByte)
  {
    be localbe = a(paramLong);
    if (localbe == null)
    {
      localbe = be.a(paramArrayOfByte);
      if (a(paramLong) == null)
        synchronized (this.b)
        {
          if (!this.b.contains(paramLong))
            this.c.put(paramLong, new SoftReference(localbe));
          return localbe;
        }
    }
    return localbe;
  }
}

/* Location:
 * Qualified Name:     h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
