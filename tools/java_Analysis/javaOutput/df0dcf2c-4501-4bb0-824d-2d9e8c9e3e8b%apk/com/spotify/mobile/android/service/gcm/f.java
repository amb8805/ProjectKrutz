package com.spotify.mobile.android.service.gcm;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.ed;
import com.spotify.mobile.android.util.eg;

final class f
  implements Handler.Callback, eg
{
  private final Handler a = new Handler(this);
  private final Context b;
  private final Uri c;
  private ed d;

  f(Service paramService, Uri paramUri)
  {
    this.b = paramService;
    this.c = paramUri;
    this.d = ed.a(paramService);
    this.d.a(paramUri.toString(), this);
    this.a.sendEmptyMessageDelayed(1, 500L);
    this.a.sendEmptyMessageDelayed(2, 5000L);
  }

  public final void a_(Uri paramUri)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", paramUri);
    localIntent.addFlags(268435456);
    this.b.startActivity(localIntent);
    if (this.d != null)
    {
      this.d.b();
      this.d = null;
    }
    this.a.removeMessages(1);
    this.a.removeMessages(2);
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 1:
      dm.w(this.b);
      return true;
    case 2:
    }
    a_(this.c);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
