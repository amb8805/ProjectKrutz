package com.facebook.internal;

import java.net.URI;

final class n
{
  URI a;
  Object b;

  n(URI paramURI, Object paramObject)
  {
    this.a = paramURI;
    this.b = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof n;
      bool1 = false;
      if (bool2)
      {
        n localn = (n)paramObject;
        URI localURI1 = localn.a;
        URI localURI2 = this.a;
        bool1 = false;
        if (localURI1 == localURI2)
        {
          Object localObject1 = localn.b;
          Object localObject2 = this.b;
          bool1 = false;
          if (localObject1 == localObject2)
            bool1 = true;
        }
      }
    }
    return bool1;
  }

  public final int hashCode()
  {
    return 37 * (1073 + this.a.hashCode()) + this.b.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
