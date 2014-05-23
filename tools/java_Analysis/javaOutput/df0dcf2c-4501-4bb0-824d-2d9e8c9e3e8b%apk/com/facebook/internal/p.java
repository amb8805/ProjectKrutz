package com.facebook.internal;

import android.content.Context;
import java.net.URI;

public final class p
{
  private Context a;
  private URI b;
  private q c;
  private boolean d;
  private Object e;

  public p(Context paramContext, URI paramURI)
  {
    af.a(paramURI, "imageUrl");
    this.a = paramContext;
    this.b = paramURI;
  }

  public final o a()
  {
    return new o(this, (byte)0);
  }

  public final p a(q paramq)
  {
    this.c = paramq;
    return this;
  }

  public final p a(Object paramObject)
  {
    this.e = paramObject;
    return this;
  }

  public final p a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
