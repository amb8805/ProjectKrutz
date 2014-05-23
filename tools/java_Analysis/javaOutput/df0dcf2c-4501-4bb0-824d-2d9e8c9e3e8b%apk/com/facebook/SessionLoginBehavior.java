package com.facebook;

public enum SessionLoginBehavior
{
  private final boolean allowsKatanaAuth;
  private final boolean allowsWebViewAuth;

  static
  {
    SessionLoginBehavior[] arrayOfSessionLoginBehavior = new SessionLoginBehavior[3];
    arrayOfSessionLoginBehavior[0] = a;
    arrayOfSessionLoginBehavior[1] = b;
    arrayOfSessionLoginBehavior[2] = c;
  }

  private SessionLoginBehavior(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.allowsKatanaAuth = paramBoolean1;
    this.allowsWebViewAuth = paramBoolean2;
  }

  final boolean a()
  {
    return this.allowsKatanaAuth;
  }

  final boolean b()
  {
    return this.allowsWebViewAuth;
  }
}

/* Location:
 * Qualified Name:     com.facebook.SessionLoginBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
