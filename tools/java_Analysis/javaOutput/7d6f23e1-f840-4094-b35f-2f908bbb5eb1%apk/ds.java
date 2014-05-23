public final class ds
{
  private transient cy[] a = new cy[20];
  private transient int b;
  private int c = 15;
  private float d = 0.75F;

  public ds()
  {
    this(20, 0.75F);
  }

  private ds(int paramInt, float paramFloat)
  {
  }

  public final Object a(int paramInt, Object paramObject)
  {
    cy[] arrayOfcy1 = this.a;
    int i = (paramInt & 0x7FFFFFFF) % arrayOfcy1.length;
    for (cy localcy1 = arrayOfcy1[i]; localcy1 != null; localcy1 = localcy1.c)
      if (localcy1.a == paramInt)
      {
        Object localObject2 = localcy1.b;
        localcy1.b = paramObject;
        return localObject2;
      }
    int i1;
    cy[] arrayOfcy2;
    if (this.b >= this.c)
    {
      int k = this.a.length;
      cy[] arrayOfcy3 = this.a;
      int m = 1 + k * 2;
      cy[] arrayOfcy4 = new cy[m];
      this.c = (int)(m * this.d);
      this.a = arrayOfcy4;
      while (true)
      {
        int n = k - 1;
        if (k <= 0)
          break;
        cy localcy2;
        for (Object localObject1 = arrayOfcy3[n]; localObject1 != null; localObject1 = localcy2)
        {
          localcy2 = ((cy)localObject1).c;
          int i2 = (0x7FFFFFFF & ((cy)localObject1).a) % m;
          ((cy)localObject1).c = arrayOfcy4[i2];
          arrayOfcy4[i2] = localObject1;
        }
        k = n;
      }
      cy[] arrayOfcy5 = this.a;
      i1 = (paramInt & 0x7FFFFFFF) % arrayOfcy5.length;
      arrayOfcy2 = arrayOfcy5;
    }
    for (int j = i1; ; j = i)
    {
      arrayOfcy2[j] = new cy(paramInt, paramInt, paramObject, arrayOfcy2[j]);
      this.b = (1 + this.b);
      return null;
      arrayOfcy2 = arrayOfcy1;
    }
  }
}

/* Location:
 * Qualified Name:     ds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
