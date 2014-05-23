package com.spotify.mobile.android.spotlets.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.prettylist.PrettyHeaderView;
import com.spotify.mobile.android.ui.stuff.f;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dd;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.g;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.Locale;

final class d
{
  private final Context a;
  private TextView b;
  private Button c;
  private ToggleButton d;
  private PrettyHeaderView e;
  private Collection.State f;
  private e g;
  private com.spotify.mobile.android.ui.prettylist.c h;
  private com.spotify.mobile.android.ui.view.paste.a i;
  private String j;
  private String k;
  private g l;
  private final Drawable m;

  public d(Context paramContext, e parame)
  {
    this.a = paramContext;
    this.g = parame;
    this.m = com.spotify.mobile.android.ui.stuff.i.a(this.a);
    if (ds.b(paramContext))
      this.h = com.spotify.mobile.android.ui.prettylist.e.b((MainActivity)paramContext);
    while (true)
    {
      this.e = this.h.b();
      this.g.a(this.h.c());
      this.g.a(this.h.i());
      HeaderView localHeaderView = this.h.f();
      View localView = LayoutInflater.from(paramContext).inflate(2130903161, null);
      this.b = ((TextView)localView.findViewById(2131362282));
      this.d = ((ToggleButton)localView.findViewById(2131362452));
      this.d.setOnClickListener(new d.3(this));
      localHeaderView.a(localView);
      this.l = new g();
      this.i = new com.spotify.mobile.android.ui.view.paste.a(paramContext);
      d.1 local1 = new d.1(this, paramContext);
      this.i.a(local1);
      this.i.c(paramContext.getString(2131689497));
      this.e.b().a(new d.2(this));
      return;
      this.h = com.spotify.mobile.android.ui.prettylist.e.a((MainActivity)paramContext);
      this.c = f.a(paramContext, null);
      this.c.setOnClickListener(this.g.a());
      this.h.b(this.c);
    }
  }

  private static void a(Context paramContext, ViewUri.Verified paramVerified, ClientEvent.Event paramEvent)
  {
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
    com.spotify.mobile.android.ui.actions.a.a(paramContext, paramVerified, new ClientEvent(paramEvent, ClientEvent.SubEvent.G));
  }

  private void b()
  {
    this.i.a().setImageDrawable(this.m);
  }

  public final void a()
  {
    if (this.c != null)
      ShufflePlayHeaderView.a(this.l, this.c);
  }

  public final void a(int paramInt)
  {
    this.i.a(paramInt);
  }

  public final void a(Collection.State paramState)
  {
    this.f = paramState;
    if (this.d != null);
    switch (d.4.a[paramState.ordinal()])
    {
    default:
      return;
    case 1:
      this.d.setText(2131689651);
      this.d.setChecked(false);
      return;
    case 2:
      this.d.setText(2131689650);
      this.d.setChecked(false);
      return;
    case 3:
    }
    this.d.setText(2131689652);
    this.d.setChecked(true);
  }

  public final void a(String paramString)
  {
    this.k = paramString;
    this.b.setText(this.a.getString(2131689498, new Object[] { paramString }).toUpperCase(Locale.getDefault()));
    this.i.d(paramString.toUpperCase(Locale.getDefault()));
  }

  public final void a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      b();
      return;
    }
    Uri localUri = com.spotify.mobile.android.provider.i.a(paramString2);
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(localUri).a(com.spotify.mobile.android.ui.b.a.a()).a(this.m).a(this.i.a());
  }

  public final void a(boolean paramBoolean)
  {
    com.spotify.mobile.android.ui.view.paste.a locala = this.i;
    if ((paramBoolean) && (SpotifyLink.b(this.j)));
    for (boolean bool = true; ; bool = false)
    {
      locala.a(bool);
      if (!paramBoolean)
        b();
      return;
    }
  }

  public final void b(String paramString)
  {
    this.j = paramString;
  }

  public final void c(String paramString)
  {
    this.h.a(paramString);
  }

  public final void d(String paramString)
  {
    if (this.e != null)
    {
      Uri localUri = com.spotify.mobile.android.provider.i.a(paramString);
      Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
      localPicasso.a(localUri).a(new com.spotify.mobile.android.ui.c.a(this.a)).a(this.e.a());
      localPicasso.a(localUri).a(com.spotify.mobile.android.ui.stuff.i.b(this.a)).a(this.e.b().a());
    }
  }

  public final void e(String paramString)
  {
    this.i.b(paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
