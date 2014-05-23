package com.spotify.mobile.android.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dx
{
  private final Pattern a;

  dx(String paramString)
  {
    this.a = Pattern.compile(paramString);
  }

  public final ViewUri.Verified a(String paramString)
  {
    Assertion.a(this.a.matcher(paramString).matches(), "Uri " + paramString + " did not match pattern " + this.a.pattern());
    return new ViewUri.Verified(paramString, (byte)0);
  }

  public final String toString()
  {
    return this.a.pattern();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
