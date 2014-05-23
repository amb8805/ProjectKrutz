package com.squareup.wire;

public abstract class h<T extends Message>
{
  p unknownFieldMap;

  public h()
  {
  }

  public h(Message paramMessage)
  {
    if ((paramMessage != null) && (Message.a(paramMessage) != null))
      this.unknownFieldMap = new p(Message.a(paramMessage));
  }

  private p ensureUnknownFieldMap()
  {
    if (this.unknownFieldMap == null)
      this.unknownFieldMap = new p();
    return this.unknownFieldMap;
  }

  public void addFixed32(int paramInt1, int paramInt2)
  {
    ensureUnknownFieldMap().a(paramInt1, Integer.valueOf(paramInt2));
  }

  public void addFixed64(int paramInt, long paramLong)
  {
    ensureUnknownFieldMap().b(paramInt, Long.valueOf(paramLong));
  }

  public void addLengthDelimited(int paramInt, b paramb)
  {
    ensureUnknownFieldMap().a(paramInt, paramb);
  }

  public void addVarint(int paramInt, long paramLong)
  {
    ensureUnknownFieldMap().a(paramInt, Long.valueOf(paramLong));
  }

  public abstract T build();

  public void checkRequiredFields()
  {
    Message.d().b(getClass()).a(this);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
