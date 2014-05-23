package com.spotify.mobile.android.spotlets.openaccess;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.be;
import com.spotify.mobile.android.util.m;
import java.util.HashMap;

public final class a
{
  private static final ObjectMapper a;
  private final b b;
  private final be c;

  static
  {
    ObjectMapper localObjectMapper = new ObjectMapper();
    a = localObjectMapper;
    localObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  private a(b paramb)
  {
    this.b = paramb;
    this.c = m.a("https://api.spotify.com/v1/albums/");
  }

  public static a a(b paramb)
  {
    return new a(paramb);
  }

  public final void a(String paramString)
  {
    this.c.a(paramString, new HashMap(), new a.1(this));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
