import java.io.OutputStream;

public final class l
{
  private byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private byte b = 61;
  private byte[] c = new byte[''];

  public l()
  {
    a();
  }

  private void a()
  {
    for (int i = 0; i < this.a.length; i++)
      this.c[this.a[i]] = (byte)i;
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
  {
    int i = paramInt2 % 3;
    int j = paramInt2 - i;
    for (int k = 0; k < j + 0; k += 3)
    {
      int i9 = 0xFF & paramArrayOfByte[k];
      int i10 = 0xFF & paramArrayOfByte[(k + 1)];
      int i11 = 0xFF & paramArrayOfByte[(k + 2)];
      paramOutputStream.write(this.a[(0x3F & i9 >>> 2)]);
      paramOutputStream.write(this.a[(0x3F & (i9 << 4 | i10 >>> 4))]);
      paramOutputStream.write(this.a[(0x3F & (i10 << 2 | i11 >>> 6))]);
      paramOutputStream.write(this.a[(i11 & 0x3F)]);
    }
    int i4;
    switch (i)
    {
    case 0:
    default:
      i4 = 4 * (j / 3);
      if (i != 0);
    case 1:
    case 2:
    }
    for (int i5 = 0; ; i5 = 4)
    {
      return i5 + i4;
      int i6 = 0xFF & paramArrayOfByte[(j + 0)];
      int i7 = 0x3F & i6 >>> 2;
      int i8 = 0x3F & i6 << 4;
      paramOutputStream.write(this.a[i7]);
      paramOutputStream.write(this.a[i8]);
      paramOutputStream.write(this.b);
      paramOutputStream.write(this.b);
      break;
      int m = 0xFF & paramArrayOfByte[(j + 0)];
      int n = 0xFF & paramArrayOfByte[(1 + (j + 0))];
      int i1 = 0x3F & m >>> 2;
      int i2 = 0x3F & (m << 4 | n >>> 4);
      int i3 = 0x3F & n << 2;
      paramOutputStream.write(this.a[i1]);
      paramOutputStream.write(this.a[i2]);
      paramOutputStream.write(this.a[i3]);
      paramOutputStream.write(this.b);
      break;
    }
  }
}

/* Location:
 * Qualified Name:     l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
