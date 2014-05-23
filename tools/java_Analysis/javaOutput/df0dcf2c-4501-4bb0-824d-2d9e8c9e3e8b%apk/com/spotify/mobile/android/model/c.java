package com.spotify.mobile.android.model;

import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.bc;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dc;

public final class c
{
  private ContextType a;
  private String b;
  private String c;
  private SpotifyLink d;

  public c(ContextType paramContextType, String paramString1, String paramString2, SpotifyLink paramSpotifyLink)
  {
    this.a = ((ContextType)cc.a(paramContextType));
    this.b = ((String)cc.a(paramString1));
    this.c = ((String)cc.a(paramString2));
    this.d = ((SpotifyLink)cc.a(paramSpotifyLink));
  }

  public final String a(Resources paramResources, boolean paramBoolean)
  {
    cc.a(paramResources);
    if (this.a == ContextType.a)
    {
      if (dc.b(this.d).booleanValue())
        return ContextType.q.a(paramResources);
      return "";
    }
    if (paramBoolean)
      return paramResources.getString(2131690134);
    return this.a.a(paramResources);
  }

  public final boolean a()
  {
    return this.d.a() != SpotifyLink.LinkType.D;
  }

  public final String b()
  {
    return this.d.d();
  }

  public final String b(Resources paramResources, boolean paramBoolean)
  {
    SpotifyLink localSpotifyLink;
    String str1;
    if (this.a == ContextType.a)
      if (dc.b(this.d).booleanValue())
      {
        localSpotifyLink = this.d;
        if (!dc.b(localSpotifyLink).booleanValue())
          str1 = "";
      }
    do
    {
      String[] arrayOfString;
      do
      {
        return str1;
        String str2 = localSpotifyLink.d();
        arrayOfString = str2.split(":");
        str1 = bc.b(dc.a(str2));
      }
      while (!"".equals(str1));
      return arrayOfString[3];
      return "";
      if (paramBoolean)
        return this.b;
      cc.a(paramResources);
      str1 = this.a.a(paramResources, this.b);
    }
    while (TextUtils.isEmpty(this.c));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = this.c;
    return paramResources.getString(2131690142, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
