package com.google.android.gms.maps.model;

public final class b
{
  private LatLng a;
  private float b;
  private float c;
  private float d;

  public b()
  {
  }

  public final CameraPosition a()
  {
    return new CameraPosition(this.a, this.b, this.c, this.d);
  }

  public final b a(float paramFloat)
  {
    this.b = paramFloat;
    return this;
  }

  public final b a(LatLng paramLatLng)
  {
    this.a = paramLatLng;
    return this;
  }

  public final b b(float paramFloat)
  {
    this.c = paramFloat;
    return this;
  }

  public final b c(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
