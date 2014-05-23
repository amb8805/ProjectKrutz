package com.facebook.internal;

import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.x;

final class ab
  implements x
{
  private final x b;

  public ab(z paramz, x paramx)
  {
    this.b = paramx;
  }

  public final void a(Session paramSession, SessionState paramSessionState, Exception paramException)
  {
    if ((this.b != null) && (this.a.f()))
      this.b.a(paramSession, paramSessionState, paramException);
    if ((paramSession == z.b(this.a)) && (paramSessionState.b()))
      this.a.c();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
