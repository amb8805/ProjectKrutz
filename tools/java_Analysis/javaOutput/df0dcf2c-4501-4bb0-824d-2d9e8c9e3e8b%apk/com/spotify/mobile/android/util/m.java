package com.spotify.mobile.android.util;

import com.c.a.a.g;
import com.spotify.mobile.android.c.c;
import java.util.Map;

public class m
  implements com.spotify.mobile.android.c.a, be
{
  private String a;
  private com.c.a.a.a b;

  static
  {
    c.a(m.class, n.class, new p());
  }

  protected m(String paramString)
  {
    this.a = paramString;
    this.b = new com.c.a.a.a();
  }

  public static be a(String paramString)
  {
    return ((n)c.a(m.class, n.class)).a(paramString);
  }

  public final void a(String paramString, Map<String, String> paramMap, bg parambg)
  {
    this.b.b(this.a + paramString, new g(paramMap), new q(parambg));
  }

  public final void a(String paramString, Map<String, String> paramMap, bh parambh)
  {
    this.b.a(this.a + paramString, new g(paramMap), new r(parambh));
  }

  public final void a(String paramString, Map<String, String> paramMap, bi parambi)
  {
    this.b.a(this.a + paramString, new g(paramMap), new s(parambi));
  }

  public final void b(String paramString, Map<String, String> paramMap, bh parambh)
  {
    this.b.b(this.a + paramString, new g(paramMap), new r(parambh));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
