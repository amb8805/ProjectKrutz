package com.squareup.picasso;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class w
{
  private final Context a;
  private Downloader b;
  private ExecutorService c;
  private e d;
  private y e;
  private z f;
  private boolean g;

  public w(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Context must not be null.");
    this.a = paramContext.getApplicationContext();
  }

  public final Picasso a()
  {
    Context localContext = this.a;
    if (this.b == null)
      this.b = an.a(localContext);
    if (this.d == null)
      this.d = new s(localContext);
    if (this.c == null)
      this.c = new ab();
    if (this.f == null)
      this.f = z.a;
    ag localag = new ag(this.d);
    return new Picasso(localContext, new j(localContext, this.c, Picasso.a, this.b, this.d, localag), this.d, this.e, this.f, localag, this.g);
  }

  public final w a(e parame)
  {
    if (this.d != null)
      throw new IllegalStateException("Memory cache already set.");
    this.d = parame;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
