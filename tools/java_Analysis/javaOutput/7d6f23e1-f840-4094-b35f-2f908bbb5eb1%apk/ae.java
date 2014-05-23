import java.util.List;

public final class ae
{
  public final int a;
  public final long b;
  public final long c;
  public final long d;
  public final int e;
  public final int f;
  public final List g;
  public final int h;
  public final int i;
  public final List j;
  public final int k;
  public final int l;
  public final List m;

  public ae(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, List paramList1, int paramInt4, int paramInt5, List paramList2, int paramInt6, int paramInt7, List paramList3)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramLong3;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramList1;
    this.h = paramInt4;
    this.i = paramInt5;
    this.j = paramList2;
    this.k = paramInt6;
    this.l = paramInt7;
    this.m = paramList3;
  }

  public final String toString()
  {
    return "event=" + this.a + ", createdAt=" + this.b + ", maxPosition=" + this.c + ", minPosition=" + this.d + ", sourcesSize=" + this.e + ", sourceType=" + this.f + ", targetsSize=" + this.h + ", targetType=" + this.i + ", targetObjectsSize=" + this.k + ", targetObjectType=" + this.l;
  }
}

/* Location:
 * Qualified Name:     ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
