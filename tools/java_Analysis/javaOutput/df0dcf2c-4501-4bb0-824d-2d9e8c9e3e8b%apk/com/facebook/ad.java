package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.n;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.FacebookDialog.PendingCall;
import java.util.UUID;

public final class ad
{
  private final Activity a;
  private final x b;
  private final BroadcastReceiver c;
  private final n d;
  private FacebookDialog.PendingCall e;

  public ad(Activity paramActivity, x paramx)
  {
    if (paramActivity == null)
      throw new IllegalArgumentException("activity cannot be null");
    this.a = paramActivity;
    this.b = paramx;
    this.c = new ae(this, (byte)0);
    this.d = n.a(paramActivity);
  }

  private boolean a(int paramInt, Intent paramIntent)
  {
    if ((this.e == null) || (this.e.b() != paramInt))
      return false;
    if (paramIntent == null)
    {
      this.e = null;
      return true;
    }
    String str = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    if (str != null)
      try
      {
        UUID localUUID2 = UUID.fromString(str);
        localUUID1 = localUUID2;
        if ((localUUID1 != null) && (this.e.a().equals(localUUID1)))
        {
          FacebookDialog.a(this.e, paramInt);
          this.e = null;
          return true;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
    while (true)
    {
      UUID localUUID1 = null;
      continue;
      this.e = null;
    }
  }

  public final void a()
  {
    Session localSession = Session.h();
    if (localSession != null)
    {
      if (this.b != null)
        localSession.a(this.b);
      if (SessionState.b.equals(localSession.c()))
        localSession.a(null);
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
    this.d.a(this.c, localIntentFilter);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Session localSession = Session.h();
    if (localSession != null)
      localSession.a(this.a, paramInt1, paramInt2, paramIntent);
    a(paramInt1, paramIntent);
  }

  public final void a(Bundle paramBundle)
  {
    Session localSession = Session.h();
    if (localSession == null)
    {
      if (paramBundle != null)
        localSession = Session.a(this.a, this.b, paramBundle);
      if (localSession == null)
        localSession = new Session(this.a);
      Session.a(localSession);
    }
    if (paramBundle != null)
      this.e = ((FacebookDialog.PendingCall)paramBundle.getParcelable("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"));
  }

  public final void b()
  {
    this.d.a(this.c);
    if (this.b != null)
    {
      Session localSession = Session.h();
      if (localSession != null)
        localSession.b(this.b);
    }
  }

  public final void b(Bundle paramBundle)
  {
    Session.a(Session.h(), paramBundle);
    paramBundle.putParcelable("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey", this.e);
  }
}

/* Location:
 * Qualified Name:     com.facebook.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
