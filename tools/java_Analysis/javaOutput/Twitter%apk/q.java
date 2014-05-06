public final class q
{
  private Object a;
  private y b;
  private boolean c;
  private cd d;
  private byte[] e = null;
  private byte[] f = null;
  private char[] g = null;
  private char[] h = null;
  private char[] i = null;

  public q(cd paramcd, Object paramObject, boolean paramBoolean)
  {
    this.d = paramcd;
    this.a = paramObject;
    this.c = paramBoolean;
  }

  public final Object a()
  {
    return this.a;
  }

  public final void a(y paramy)
  {
    this.b = paramy;
  }

  public final void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte != this.e)
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      this.e = null;
      this.d.a(at.a, paramArrayOfByte);
    }
  }

  public final void a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.g)
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      this.g = null;
      this.d.a(dq.a, paramArrayOfChar);
    }
  }

  public final y b()
  {
    return this.b;
  }

  public final void b(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.h)
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      this.h = null;
      this.d.a(dq.b, paramArrayOfChar);
    }
  }

  public final void c(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.i)
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      this.i = null;
      this.d.a(dq.d, paramArrayOfChar);
    }
  }

  public final boolean c()
  {
    return this.c;
  }

  public final ci d()
  {
    return new ci(this.d);
  }

  public final char[] e()
  {
    if (this.g != null)
      throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
    this.g = this.d.a(dq.a);
    return this.g;
  }

  public final char[] f()
  {
    if (this.h != null)
      throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
    this.h = this.d.a(dq.b);
    return this.h;
  }
}

/* Location:
 * Qualified Name:     q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
