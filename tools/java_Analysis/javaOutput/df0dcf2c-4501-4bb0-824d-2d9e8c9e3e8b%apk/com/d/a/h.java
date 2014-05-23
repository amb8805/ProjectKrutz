package com.d.a;

final class h extends g
{
  float d;

  h()
  {
    this.a = 0.0F;
    this.b = Float.TYPE;
  }

  h(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.d = paramFloat2;
    this.b = Float.TYPE;
    this.c = true;
  }

  private h d()
  {
    h localh = new h(this.a, this.d);
    localh.a(b());
    return localh;
  }

  public final Object a()
  {
    return Float.valueOf(this.d);
  }

  public final void a(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == Float.class))
    {
      this.d = ((Float)paramObject).floatValue();
      this.c = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.d.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
