package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class e
{
  private final List<String> a;
  private final Object b;

  private e(Object paramObject)
  {
    this.b = f.a(paramObject);
    this.a = new ArrayList();
  }

  public final e a(String paramString, Object paramObject)
  {
    this.a.add((String)f.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append((char)'{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j < i - 1)
        localStringBuilder.append(", ");
    }
    return '}';
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
