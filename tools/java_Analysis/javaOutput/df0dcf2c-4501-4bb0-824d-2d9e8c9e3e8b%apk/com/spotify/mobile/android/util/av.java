package com.spotify.mobile.android.util;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.Session;
import com.facebook.Session.NewPermissionsRequest;
import com.facebook.Session.OpenRequest;
import com.facebook.x;
import java.util.Arrays;
import java.util.List;

public final class av
{
  public static final List<String> a = Arrays.asList(new String[] { "email", "user_birthday", "user_hometown" });
  public static final List<String> b = Arrays.asList(new String[] { "publish_actions" });

  public static void a(Activity paramActivity)
  {
    a(new Session.OpenRequest(paramActivity));
  }

  public static void a(Fragment paramFragment, x paramx)
  {
    Session.OpenRequest localOpenRequest = new Session.OpenRequest(paramFragment);
    localOpenRequest.b(paramx);
    a(localOpenRequest);
  }

  private static void a(Session.OpenRequest paramOpenRequest)
  {
    Session localSession = Session.h();
    paramOpenRequest.b(a);
    paramOpenRequest.h();
    localSession.a(paramOpenRequest);
  }

  public static boolean a(List<String> paramList)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramList.toString();
    bp.b("Checking if active session contains permissions:%s", arrayOfObject);
    Session localSession = Session.h();
    boolean bool = false;
    if (localSession != null)
      bool = localSession.f().containsAll(paramList);
    return bool;
  }

  public static void b(Activity paramActivity)
  {
    Session.NewPermissionsRequest localNewPermissionsRequest = new Session.NewPermissionsRequest(paramActivity, b);
    Session localSession = Session.h();
    if ((localSession != null) && (localSession.a()))
    {
      localNewPermissionsRequest.h();
      localSession.a(localNewPermissionsRequest);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
