package com.spotify.mobile.android.service.flow.login;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.FacebookRequestError;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import com.facebook.n;
import com.facebook.t;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dm;

final class c
  implements n
{
  private c(a parama)
  {
  }

  public final void a(GraphUser paramGraphUser, t paramt)
  {
    if (paramGraphUser != null)
    {
      Session localSession = Session.h();
      if (localSession == null)
      {
        bp.e("Unable to login, facebook session was null", new Object[0]);
        return;
      }
      String str1 = localSession.e();
      String str2 = paramGraphUser.getId();
      boolean bool = this.a.g().getBoolean("isSignUpFlow", false);
      this.a.D().a(str2, str1, bool);
      return;
    }
    if ((paramt == null) || (paramt.a() == null));
    while (true)
    {
      FragmentActivity localFragmentActivity = this.a.i();
      if (localFragmentActivity == null)
        break;
      dm.i(localFragmentActivity);
      a.a(this.a);
      return;
      bp.b(paramt.a().toString(), new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
