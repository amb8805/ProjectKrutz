import java.io.CharConversionException;
import java.io.InputStream;

public final class ed extends ba
{
  private boolean e;
  private char f = '\000';
  private int g = 0;
  private int h = 0;

  public ed(q paramq, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramq, paramInputStream, paramArrayOfByte, paramInt1, paramInt2);
    this.e = paramBoolean;
  }

  private boolean a(int paramInt)
  {
    this.h += this.d - paramInt;
    if (paramInt > 0)
    {
      if (this.c > 0)
      {
        for (int i1 = 0; i1 < paramInt; i1++)
          this.b[i1] = this.b[(i1 + this.c)];
        this.c = 0;
      }
      this.d = paramInt;
    }
    while (this.d < 4)
    {
      int j = this.a.read(this.b, this.d, this.b.length - this.d);
      if (j <= 0)
      {
        if (j < 0)
        {
          a();
          int k = this.d;
          int m = k + this.h;
          int n = this.g;
          throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + k + ", needed " + 4 + ", at char #" + n + ", byte #" + m + ")");
          this.c = 0;
          int i = this.a.read(this.b);
          if (i <= 0)
          {
            this.d = 0;
            if (i < 0)
            {
              a();
              return false;
            }
            b();
          }
          this.d = i;
        }
        else
        {
          b();
        }
      }
      else
        this.d = (j + this.d);
    }
    return true;
  }

  public final int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.b == null)
      return -1;
    if (paramInt2 <= 0)
      return paramInt2;
    if ((paramInt1 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length))
      throw new ArrayIndexOutOfBoundsException("read(buf," + paramInt1 + "," + paramInt2 + "), cbuf[" + paramArrayOfChar.length + "]");
    int i = paramInt2 + paramInt1;
    int k;
    if (this.f != 0)
    {
      k = paramInt1 + 1;
      paramArrayOfChar[paramInt1] = this.f;
      this.f = '\000';
    }
    while (true)
    {
      int i2;
      int i8;
      int i5;
      int m;
      if (k < i)
      {
        int i1 = this.c;
        if (this.e);
        for (i2 = this.b[i1] << 24 | (0xFF & this.b[(i1 + 1)]) << 16 | (0xFF & this.b[(i1 + 2)]) << 8 | 0xFF & this.b[(i1 + 3)]; ; i2 = 0xFF & this.b[i1] | (0xFF & this.b[(i1 + 1)]) << 8 | (0xFF & this.b[(i1 + 2)]) << 16 | this.b[(i1 + 3)] << 24)
        {
          this.c = (4 + this.c);
          if (i2 <= 65535)
            break label538;
          if (i2 <= 1114111)
            break;
          int i9 = k - paramInt1;
          String str = "(above " + Integer.toHexString(1114111) + ") ";
          int i10 = this.h + this.c - 1;
          int i11 = i9 + this.g;
          throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i2) + str + " at char #" + i11 + ", byte #" + i10 + ")");
          int j = this.d - this.c;
          if ((j >= 4) || (a(j)))
            break label560;
          return -1;
        }
        int i7 = i2 - 65536;
        i8 = k + 1;
        paramArrayOfChar[k] = (char)(55296 + (i7 >> 10));
        i5 = 0xDC00 | i7 & 0x3FF;
        if (i8 >= i)
        {
          this.f = (char)i5;
          m = i8;
        }
      }
      while (true)
      {
        label476: int n = m - paramInt1;
        this.g = (n + this.g);
        return n;
        int i4 = i8;
        while (true)
        {
          int i6 = i4 + 1;
          paramArrayOfChar[i4] = (char)i5;
          if (this.c >= this.d)
          {
            m = i6;
            break label476;
          }
          k = i6;
          break;
          label538: int i3 = i2;
          i4 = k;
          i5 = i3;
        }
        m = k;
      }
      label560: k = paramInt1;
    }
  }
}

/* Location:
 * Qualified Name:     ed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
