package com.facebook.widget;

import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.x;

final class b
  implements x
{
  private b(LoginButton paramLoginButton)
  {
  }

  public final void a(Session paramSession, SessionState paramSessionState, Exception paramException)
  {
    LoginButton.i(this.a);
    LoginButton.j(this.a);
    if (c.e(LoginButton.g(this.a)) != null)
      c.e(LoginButton.g(this.a)).a(paramSession, paramSessionState, paramException);
    while (paramException == null)
      return;
    this.a.a(paramException);
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
