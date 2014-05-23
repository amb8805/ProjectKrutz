package com.spotify.mobile.android.service.flow;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.service.flow.login.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public class b extends d
{
  private String[] a;
  private dt b;
  private com.spotify.mobile.android.ui.actions.c c = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);

  public b()
  {
    b_(new Bundle());
  }

  public static b a(com.spotify.mobile.android.service.flow.a.a parama, String[] paramArrayOfString)
  {
    Assertion.a(paramArrayOfString, "licenseUrls cannot be null.");
    if (paramArrayOfString.length > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "There must be at least one license.");
      Bundle localBundle = new Bundle();
      localBundle.putStringArray("license_urls", paramArrayOfString);
      b localb = new b();
      localb.b_(localBundle);
      localb.a(parama);
      return localb;
    }
  }

  public final c C()
  {
    return (c)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    DialogLayout localDialogLayout = new DialogLayout(i());
    localDialogLayout.a(2131690017);
    localDialogLayout.c(2131690013);
    localDialogLayout.a(2131690014, new b.1(this));
    localDialogLayout.b(2131690015, new b.2(this));
    TextView localTextView = h.a(i(), localDialogLayout);
    localTextView.setText(2131690016);
    if (f.a(i()));
    for (int i = 2131296539; ; i = 2131296400)
    {
      localTextView.setTextColor(j().getColor(i));
      localTextView.setOnClickListener(new b.3(this));
      localDialogLayout.a(localTextView);
      return localDialogLayout;
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = g().getStringArray("license_urls");
    this.b = dv.a(i(), ViewUri.K);
  }

  public final boolean b()
  {
    C().c();
    return true;
  }

  public final void w()
  {
    super.w();
    this.b.a();
  }

  public final void x()
  {
    super.x();
    this.b.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
