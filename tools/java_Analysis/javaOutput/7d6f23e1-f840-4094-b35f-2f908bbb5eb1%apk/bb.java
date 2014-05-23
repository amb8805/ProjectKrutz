import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public abstract class bb
{
  protected static final boolean a = Log.isLoggable("ImageCache", 3);
  protected final HashMap b;
  final int[] c = new int[0];
  private HashMap d;
  private ArrayList e;
  private LinkedHashMap f;
  private Handler g = new Handler(Looper.getMainLooper());
  private final int h;
  private final int i;
  private final int j;

  public bb(int paramInt1, int paramInt2, int paramInt3)
  {
    this.e = new ArrayList(paramInt1);
    this.f = new LinkedHashMap(20, 10.0F, true);
    this.b = new HashMap(20, 10.0F);
    this.d = new HashMap(paramInt1);
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
  }

  private void b()
  {
    this.e.addAll(this.d.values());
    Collections.sort(this.e, new i(this));
    if (a)
    {
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        m localm2 = (m)localIterator.next();
        Log.d("ImageCache", "Sorted: " + localm2.a + " " + localm2.b);
      }
    }
    int k = this.e.size() - this.h + this.i;
    if (a)
      Log.d("ImageCache", "Purging: " + k + " items");
    for (int m = 0; m < k; m++)
    {
      m localm1 = (m)this.e.get(m);
      if (a)
        Log.d("ImageCache", "Removing: " + localm1.a + " " + localm1.b);
      this.d.remove(localm1.c);
    }
    this.e.clear();
  }

  private void b(long paramLong, Object paramObject, String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.length() > 0))
      synchronized (this.c)
      {
        if (!this.f.containsKey(paramObject))
        {
          bg localbg = new bg(this, paramString, paramBoolean);
          this.f.put(paramObject, localbg);
          this.b.put(paramObject, localbg);
          this.g.postDelayed(new bs(this, paramLong), 100L);
        }
        return;
      }
  }

  protected final Bitmap a(long paramLong, Object paramObject, String paramString, boolean paramBoolean)
  {
    m localm = (m)this.d.get(paramObject);
    if (a)
      Log.d("ImageCache", "Url: " + paramString);
    Bitmap localBitmap2;
    if (localm != null)
    {
      if (a)
        Log.d("ImageCache", "Have photo: " + localm.a);
      if (!localm.a.equals(paramString))
        break label186;
      localBitmap2 = localm.a();
      if (localBitmap2 != null);
    }
    label186: for (Bitmap localBitmap1 = localBitmap2; ; localBitmap1 = null)
    {
      b(paramLong, paramObject, paramString, paramBoolean);
      return localBitmap1;
      localm.b = (1 + localm.b);
      return localBitmap2;
      if (a)
        Log.d("ImageCache", "Looking in persistent storage: " + paramString);
      b(paramLong, paramObject, paramString, paramBoolean);
      return null;
    }
  }

  protected final Bitmap a(Object paramObject)
  {
    m localm = (m)this.d.get(paramObject);
    if (localm != null)
      return localm.a();
    return null;
  }

  protected abstract m a(long paramLong, Object paramObject, String paramString);

  protected abstract m a(long paramLong, Object paramObject, String paramString, byte[] paramArrayOfByte);

  protected final m a(Bitmap paramBitmap, Object paramObject, String paramString)
  {
    if (paramBitmap != null)
    {
      m localm = a(paramObject, paramString);
      localm.a(paramBitmap);
      return localm;
    }
    return null;
  }

  protected abstract m a(Object paramObject, String paramString);

  public final void a()
  {
    this.d.clear();
    synchronized (this.c)
    {
      this.f.clear();
      return;
    }
  }

  protected abstract void a(HashMap paramHashMap);

  final void b(HashMap paramHashMap)
  {
    if (paramHashMap.size() > 0)
    {
      Iterator localIterator = paramHashMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object localObject1 = localEntry.getKey();
        m localm = (m)localEntry.getValue();
        if (localm != null)
        {
          String str = localm.a;
          if (a)
            Log.d("ImageCache", "Loaded: " + str);
          if (this.d.size() >= this.h)
            b();
          this.d.put(localObject1, localm);
        }
        synchronized (this.c)
        {
          this.f.remove(localObject1);
        }
      }
      a(paramHashMap);
    }
  }
}

/* Location:
 * Qualified Name:     bb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
