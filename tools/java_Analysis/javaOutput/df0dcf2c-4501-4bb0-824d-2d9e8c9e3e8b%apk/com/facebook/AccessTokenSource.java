package com.facebook;

public enum AccessTokenSource
{
  private final boolean canExtendToken;

  static
  {
    AccessTokenSource[] arrayOfAccessTokenSource = new AccessTokenSource[7];
    arrayOfAccessTokenSource[0] = a;
    arrayOfAccessTokenSource[1] = b;
    arrayOfAccessTokenSource[2] = c;
    arrayOfAccessTokenSource[3] = d;
    arrayOfAccessTokenSource[4] = e;
    arrayOfAccessTokenSource[5] = f;
    arrayOfAccessTokenSource[6] = g;
  }

  private AccessTokenSource(boolean paramBoolean)
  {
    this.canExtendToken = paramBoolean;
  }

  final boolean a()
  {
    return this.canExtendToken;
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
