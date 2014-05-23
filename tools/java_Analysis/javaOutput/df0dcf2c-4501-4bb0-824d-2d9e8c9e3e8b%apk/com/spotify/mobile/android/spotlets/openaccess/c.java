package com.spotify.mobile.android.spotlets.openaccess;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.be;
import com.spotify.mobile.android.util.m;
import java.util.HashMap;

public final class c
{
  private static final ObjectMapper a;
  private final d b;
  private final be c;

  static
  {
    ObjectMapper localObjectMapper = new ObjectMapper();
    a = localObjectMapper;
    localObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  private c(d paramd)
  {
    this.b = paramd;
    this.c = m.a("https://api.spotify.com/v1/artists/");
  }

  public static c a(d paramd)
  {
    return new c(paramd);
  }

  public final void a(String paramString)
  {
    this.c.a(paramString, new HashMap(), new c.1(this));
    HashMap localHashMap = new HashMap();
    localHashMap.put("country", "US");
    this.c.a(paramString + "/toptracks", localHashMap, new c.2(this));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
