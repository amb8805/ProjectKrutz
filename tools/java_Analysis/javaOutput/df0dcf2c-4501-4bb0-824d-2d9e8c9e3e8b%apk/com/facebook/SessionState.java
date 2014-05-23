package com.facebook;

public enum SessionState
{
  private final SessionState.Category category;

  static
  {
    SessionState[] arrayOfSessionState = new SessionState[7];
    arrayOfSessionState[0] = a;
    arrayOfSessionState[1] = b;
    arrayOfSessionState[2] = c;
    arrayOfSessionState[3] = d;
    arrayOfSessionState[4] = e;
    arrayOfSessionState[5] = f;
    arrayOfSessionState[6] = g;
  }

  private SessionState(SessionState.Category paramCategory)
  {
    this.category = paramCategory;
  }

  public final boolean a()
  {
    return this.category == SessionState.Category.b;
  }

  public final boolean b()
  {
    return this.category == SessionState.Category.c;
  }
}

/* Location:
 * Qualified Name:     com.facebook.SessionState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
