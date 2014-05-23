package com.facebook;

public enum SessionDefaultAudience
{
  private final String nativeProtocolAudience;

  static
  {
    SessionDefaultAudience[] arrayOfSessionDefaultAudience = new SessionDefaultAudience[4];
    arrayOfSessionDefaultAudience[0] = a;
    arrayOfSessionDefaultAudience[1] = b;
    arrayOfSessionDefaultAudience[2] = c;
    arrayOfSessionDefaultAudience[3] = d;
  }

  private SessionDefaultAudience(String paramString)
  {
    this.nativeProtocolAudience = paramString;
  }

  final String a()
  {
    return this.nativeProtocolAudience;
  }
}

/* Location:
 * Qualified Name:     com.facebook.SessionDefaultAudience
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
