package com.squareup.wire;

final class u extends q
{
  private final Long a;

  public u(int paramInt, Long paramLong)
  {
    super(paramInt, WireType.a);
    this.a = paramLong;
  }

  public final int a()
  {
    return x.a(this.a.longValue());
  }

  public final void a(int paramInt, x paramx)
  {
    paramx.b(paramInt, WireType.a);
    paramx.b(this.a.longValue());
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
