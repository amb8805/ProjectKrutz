import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

public final class ef
{
  private static int a = au.a();
  private static int b = cc.a();
  private static ThreadLocal c = new ThreadLocal();
  private cx d = cx.a();
  private dv e = dv.a();
  private am f = null;
  private int g = a;
  private int h = b;

  public ef()
  {
    this(null);
  }

  private ef(am paramam)
  {
  }

  private static q a(Object paramObject, boolean paramBoolean)
  {
    SoftReference localSoftReference = (SoftReference)c.get();
    if (localSoftReference == null);
    for (cd localcd = null; ; localcd = (cd)localSoftReference.get())
    {
      if (localcd == null)
      {
        localcd = new cd();
        c.set(new SoftReference(localcd));
      }
      return new q(localcd, paramObject, paramBoolean);
    }
  }

  private boolean a(au paramau)
  {
    return (this.g & paramau.b()) != 0;
  }

  public final aw a(Writer paramWriter)
  {
    return new di(a(paramWriter, false), this.h, this.f, paramWriter);
  }

  public final bq a(String paramString)
  {
    StringReader localStringReader = new StringReader(paramString);
    return new da(a(localStringReader, true), this.g, localStringReader, this.f, this.d.a(a(au.h), a(au.g)));
  }

  public final bq a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return new by(a(paramArrayOfByte, true), paramArrayOfByte, 0, i).a(this.g, this.f, this.e, this.d);
  }
}

/* Location:
 * Qualified Name:     ef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
