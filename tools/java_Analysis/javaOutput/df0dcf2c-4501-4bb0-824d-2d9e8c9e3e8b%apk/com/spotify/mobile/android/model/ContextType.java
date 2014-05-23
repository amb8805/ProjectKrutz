package com.spotify.mobile.android.model;

import android.content.res.Resources;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.cc;

public enum ContextType
{
  private static final ContextType[] w = values();
  private final int mOrbitContextType;
  private final boolean mRequiresOriginalContextTitle;
  private final int mResourceIdForContextDescription;
  private final int mResourceIdForContextTitle;

  static
  {
    ContextType[] arrayOfContextType = new ContextType[22];
    arrayOfContextType[0] = a;
    arrayOfContextType[1] = b;
    arrayOfContextType[2] = c;
    arrayOfContextType[3] = d;
    arrayOfContextType[4] = e;
    arrayOfContextType[5] = f;
    arrayOfContextType[6] = g;
    arrayOfContextType[7] = h;
    arrayOfContextType[8] = i;
    arrayOfContextType[9] = j;
    arrayOfContextType[10] = k;
    arrayOfContextType[11] = l;
    arrayOfContextType[12] = m;
    arrayOfContextType[13] = n;
    arrayOfContextType[14] = o;
    arrayOfContextType[15] = p;
    arrayOfContextType[16] = q;
    arrayOfContextType[17] = r;
    arrayOfContextType[18] = s;
    arrayOfContextType[19] = t;
    arrayOfContextType[20] = u;
    arrayOfContextType[21] = v;
    x = arrayOfContextType;
  }

  private ContextType(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 0, false);
  }

  private ContextType(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.mOrbitContextType = paramInt1;
    this.mResourceIdForContextDescription = paramInt2;
    this.mResourceIdForContextTitle = paramInt3;
    this.mRequiresOriginalContextTitle = paramBoolean;
  }

  public static ContextType a(int paramInt)
  {
    for (ContextType localContextType : w)
      if (localContextType.mOrbitContextType == paramInt)
        return localContextType;
    Assertion.a("unknown player context type: " + paramInt);
    return a;
  }

  public String a(Resources paramResources)
  {
    cc.a(paramResources);
    return paramResources.getString(this.mResourceIdForContextDescription);
  }

  public String a(Resources paramResources, String paramString)
  {
    cc.a(paramResources);
    cc.a(paramString);
    if (this.mResourceIdForContextTitle == 0)
      return paramString;
    if (this.mRequiresOriginalContextTitle)
      return paramResources.getString(this.mResourceIdForContextTitle, new Object[] { paramString });
    return paramResources.getString(this.mResourceIdForContextTitle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.ContextType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
