import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStream;;
import java.io.InputStreamReader;
import java.io.Reader;;

public final class by
{
  private q a;
  private InputStream b;
  private byte[] c;
  private int d;
  private int e;
  private final boolean f;
  private int g;
  private boolean h = true;
  private int i = 0;

  public by(q paramq, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramq;
    this.b = null;
    this.c = paramArrayOfByte;
    this.d = 0;
    this.e = (paramInt2 + 0);
    this.g = 0;
    this.f = false;
  }

  private static void a(String paramString)
  {
    throw new CharConversionException("Unsupported UCS-4 endianness (" + paramString + ") detected");
  }

  private boolean a(int paramInt)
  {
    if ((0xFF00 & paramInt) == 0);
    for (this.h = true; ; this.h = false)
    {
      this.i = 2;
      return true;
      if ((paramInt & 0xFF) != 0)
        break;
    }
    return false;
  }

  private boolean b(int paramInt)
  {
    int j = this.e - this.d;
    while (j < paramInt)
    {
      if (this.b == null);
      for (int k = -1; k <= 0; k = this.b.read(this.c, this.e, this.c.length - this.e))
        return false;
      this.e = (k + this.e);
      j += k;
    }
    return true;
  }

  public final bq a(int paramInt, am paramam, dv paramdv, cx paramcx)
  {
    int k;
    int m;
    int n;
    label157: int j;
    if (b(4))
    {
      k = this.c[this.d] << 24 | (0xFF & this.c[(1 + this.d)]) << 16 | (0xFF & this.c[(2 + this.d)]) << 8 | 0xFF & this.c[(3 + this.d)];
      switch (k)
      {
      default:
        m = k >>> 16;
        if (m == 65279)
        {
          this.d = (2 + this.d);
          this.i = 2;
          this.h = true;
          n = 1;
          if (n == 0)
            break label401;
          j = 1;
        }
      case 65279:
      case -131072:
      case 65534:
      case -16842752:
      }
    }
    while (true)
    {
      label165: y localy1;
      if (j == 0)
        localy1 = y.a;
      boolean bool1;
      boolean bool2;
      while (true)
      {
        this.a.a(localy1);
        bool1 = au.h.a(paramInt);
        bool2 = au.g.a(paramInt);
        if ((localy1 != y.a) || (!bool1))
          break label630;
        dv localdv = paramdv.a(bool1, bool2);
        return new ee(this.a, paramInt, this.b, paramam, localdv, this.c, this.d, this.e, this.f);
        this.h = true;
        this.d = (4 + this.d);
        this.i = 4;
        n = 1;
        break label157;
        this.d = (4 + this.d);
        this.i = 4;
        this.h = false;
        n = 1;
        break label157;
        a("2143");
        a("3412");
        break;
        if (m == 65534)
        {
          this.d = (2 + this.d);
          this.i = 2;
          this.h = false;
          n = 1;
          break label157;
        }
        if (k >>> 8 == 15711167)
        {
          this.d = (3 + this.d);
          this.i = 1;
          this.h = true;
          n = 1;
          break label157;
        }
        n = 0;
        break label157;
        label401: if (k >> 8 == 0)
        {
          this.h = true;
          label414: this.i = 4;
        }
        for (int i1 = 1; ; i1 = 0)
        {
          if (i1 == 0)
            break label487;
          j = 1;
          break;
          if ((0xFFFFFF & k) == 0)
          {
            this.h = false;
            break label414;
          }
          if ((0xFF00FFFF & k) == 0)
          {
            a("3412");
            break label414;
          }
          if ((0xFFFF00FF & k) == 0)
          {
            a("2143");
            break label414;
          }
        }
        label487: if (!a(k >>> 16))
          break label863;
        j = 1;
        break label165;
        if ((!b(2)) || (!a((0xFF & this.c[this.d]) << 8 | 0xFF & this.c[(1 + this.d)])))
          break label863;
        j = 1;
        break label165;
        if (this.i == 2)
        {
          if (this.h)
            localy1 = y.b;
          else
            localy1 = y.c;
        }
        else
        {
          if (this.i != 4)
            break label620;
          if (this.h)
            localy1 = y.d;
          else
            localy1 = y.e;
        }
      }
      label620: throw new RuntimeException("Internal error");
      label630: q localq = this.a;
      y localy2 = this.a.b();
      Object localObject2;
      switch (al.a[localy2.ordinal()])
      {
      default:
        throw new RuntimeException("Internal error");
      case 1:
      case 2:
        localObject2 = new ed(this.a, this.b, this.c, this.d, this.e, this.a.b().b());
        da localda = new da(localq, paramInt, (java.io.Reader)localObject2, paramam, paramcx.a(bool1, bool2));
        return localda;
      case 3:
      case 4:
      case 5:
      }
      InputStream localInputStream = this.b;
      Object localObject1;
      if (localInputStream == null)
        localObject1 = new ByteArrayInputStream(this.c, this.d, this.e);
      while (true)
      {
        localObject2 = new InputStreamReader((InputStream)localObject1, localy2.a());
        break;
        if (this.d < this.e)
          localObject1 = new bj(this.a, localInputStream, this.c, this.d, this.e);
        else
          localObject1 = localInputStream;
      }
      label863: j = 0;
    }
  }
}

/* Location:
 * Qualified Name:     by
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
