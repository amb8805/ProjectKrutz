package com.facebook.widget;

import com.facebook.k;

public final class FacebookDialog
{
  private static k a;

  public static boolean a(FacebookDialog.PendingCall paramPendingCall, int paramInt)
  {
    if (paramInt != paramPendingCall.b())
      return false;
    if (a != null)
      k.a(paramPendingCall.a());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.FacebookDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
