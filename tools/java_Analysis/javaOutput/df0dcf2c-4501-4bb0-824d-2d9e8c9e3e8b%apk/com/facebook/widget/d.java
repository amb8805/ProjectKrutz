package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AppEventsLogger;
import com.facebook.Session;
import com.facebook.Session.OpenRequest;
import com.facebook.SessionState;
import com.facebook.a.g;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.z;
import com.facebook.model.GraphUser;
import com.facebook.v;

final class d
  implements View.OnClickListener
{
  private d(LoginButton paramLoginButton)
  {
  }

  public final void onClick(View paramView)
  {
    Context localContext = this.a.getContext();
    Session localSession1 = LoginButton.a(this.a).b();
    String str3;
    if (localSession1 != null)
      if (LoginButton.d(this.a))
      {
        String str1 = this.a.getResources().getString(g.f);
        String str2 = this.a.getResources().getString(g.d);
        if ((LoginButton.c(this.a) != null) && (LoginButton.c(this.a).getName() != null))
        {
          String str4 = this.a.getResources().getString(g.h);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = LoginButton.c(this.a).getName();
          str3 = String.format(str4, arrayOfObject);
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
          localBuilder.setMessage(str3).setCancelable(true).setPositiveButton(str1, new d.1(this, localSession1)).setNegativeButton(str2, null);
          localBuilder.create().show();
        }
      }
    label212: label482: label486: 
    while (true)
    {
      AppEventsLogger localAppEventsLogger = AppEventsLogger.a(this.a.getContext());
      Bundle localBundle = new Bundle();
      int i;
      Session localSession2;
      Session.OpenRequest localOpenRequest;
      if (localSession1 != null)
      {
        i = 0;
        localBundle.putInt("logging_in", i);
        localAppEventsLogger.a(LoginButton.h(this.a), localBundle);
        return;
        str3 = this.a.getResources().getString(g.i);
        break;
        localSession1.g();
        continue;
        localSession2 = LoginButton.a(this.a).a();
        if ((localSession2 == null) || (localSession2.c().b()))
        {
          LoginButton.a(this.a).c();
          localSession2 = new v(localContext).a(LoginButton.e(this.a)).a();
          Session.a(localSession2);
        }
        if (localSession2.a())
          continue;
        if (LoginButton.f(this.a) != null)
          localOpenRequest = new Session.OpenRequest(LoginButton.f(this.a));
      }
      while (true)
      {
        if (localOpenRequest == null)
          break label486;
        localOpenRequest.b(c.a(LoginButton.g(this.a)));
        localOpenRequest.b(c.b(LoginButton.g(this.a)));
        localOpenRequest.b(c.c(LoginButton.g(this.a)));
        if (SessionAuthorizationType.b.equals(c.d(LoginButton.g(this.a))))
        {
          localSession2.b(localOpenRequest);
          break;
          if (!(localContext instanceof Activity))
            break label482;
          localOpenRequest = new Session.OpenRequest((Activity)localContext);
          continue;
        }
        localSession2.a(localOpenRequest);
        break;
        i = 1;
        break label212;
        localOpenRequest = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
