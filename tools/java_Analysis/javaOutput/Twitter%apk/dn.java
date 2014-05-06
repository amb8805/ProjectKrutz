import java.util.ArrayList;

public final class dn
{
  public final String a;
  public final String b;
  public final Float c;
  public final Float d;
  public final Float e;
  public final String f;
  public final long g;
  public long h;
  public final ArrayList i;

  public dn(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    this(paramString1, paramString2, paramLong1, paramLong2, null, null, null, null, null);
  }

  public dn(String paramString1, String paramString2, long paramLong1, long paramLong2, Float paramFloat1, Float paramFloat2, Float paramFloat3, String paramString3)
  {
    this(paramString1, paramString2, 0L, 0L, null, null, null, paramString3, null);
  }

  private dn(String paramString1, String paramString2, long paramLong1, long paramLong2, Float paramFloat1, Float paramFloat2, Float paramFloat3, String paramString3, ArrayList paramArrayList)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = paramString3;
    this.h = paramLong1;
    this.g = paramLong2;
    this.i = paramArrayList;
  }

  public dn(String paramString1, String paramString2, long paramLong, ArrayList paramArrayList)
  {
    this(paramString1, paramString2, 0L, paramLong, null, null, null, null, paramArrayList);
  }
}

/* Location:
 * Qualified Name:     dn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
