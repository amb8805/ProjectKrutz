package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.d.a.j;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.view.ConnectIconView;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.ui.view.l;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.aj;

public final class s extends Fragment
  implements com.spotify.mobile.android.service.connections.g
{
  private static final String[] c = { "name", "artist_name", "album_name", "album_image_small_uri", "album_image_uri", "uri" };
  private static final String[] d = { "paused", "is_ad_playing", "is_suggested_track", "is_next_enabled", "is_preview_track" };
  private TextView Y;
  private ImageButton Z;
  o<Cursor> a = new s.10(this);
  private ImageButton aa;
  private TextView ab;
  private TextView ac;
  private TransitionDrawable ad;
  private int ae;
  private boolean af;
  private boolean ag;
  private boolean ah;
  private boolean ai;
  private boolean aj;
  private String ak;
  private String al;
  private boolean am = true;
  private boolean an = false;
  private com.spotify.mobile.android.service.connections.b ao;
  private boolean ap = false;
  private com.spotify.mobile.android.ui.actions.d aq = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.a ar = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private int as = 0;
  private boolean at = false;
  private com.spotify.mobile.android.ui.b.c au = new com.spotify.mobile.android.ui.b.c();
  private aj av = new s.1(this);
  private Runnable aw = new s.3(this);
  private com.spotify.mobile.android.service.connections.c ax = new s.9(this);
  private com.d.a.a ay;
  o<Cursor> b = new s.2(this);
  private View e;
  private View f;
  private SpotifyImageView g;
  private ConnectIconView h;
  private TextView i;

  public s()
  {
  }

  private void F()
  {
    this.ac.removeCallbacks(this.aw);
    this.ac.setBackgroundColor(this.ae);
  }

  public static int a(View paramView)
  {
    Context localContext = paramView.getContext();
    if (!f.a(paramView.getContext()))
      return com.spotify.android.paste.graphics.d.b(48.0F, localContext.getResources());
    return localContext.getResources().getDimensionPixelSize(2131427467);
  }

  private void a(float paramFloat)
  {
    if (this.ay != null)
      this.ay.b();
    View localView = this.e;
    com.d.b.c localc = l.a;
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = ((l)this.e.getLayoutParams()).b;
    arrayOfFloat[1] = paramFloat;
    this.ay = j.a(localView, localc, arrayOfFloat);
    this.ay.a(j().getInteger(2131558421));
    this.ay.a();
  }

  public final void C()
  {
    if (this.ao != null)
      this.ao.d();
    if (!this.an);
    for (boolean bool = true; ; bool = false)
    {
      this.am = bool;
      this.an = false;
      return;
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramViewGroup;
    int j;
    int k;
    label28: View localView;
    if (!f.a(i()))
    {
      j = 1;
      if (j == 0)
        break label389;
      k = 2130903244;
      localView = paramLayoutInflater.inflate(k, paramViewGroup, false);
      this.f = localView.findViewById(2131362513);
      this.f.setOnClickListener(new s.4(this));
      if (j != 0)
      {
        this.au.a(j().getDrawable(2131296371), false);
        this.au.setColorFilter(j().getColor(2131296307), PorterDuff.Mode.SRC_ATOP);
        com.spotify.android.paste.widget.g.a(localView.findViewById(2131362643), this.au);
      }
      this.g = ((SpotifyImageView)localView.findViewById(2131362546));
      this.h = ((ConnectIconView)localView.findViewById(2131362626));
      this.h.setVisibility(4);
      this.h.a(new s.5(this));
      this.h.setOnClickListener(new s.6(this));
      this.i = ((TextView)localView.findViewById(2131362227));
      this.Y = ((TextView)localView.findViewById(2131362635));
      this.ab = ((TextView)localView.findViewById(2131362638));
      this.ac = ((TextView)localView.findViewById(2131362639));
      this.ac.setSelected(true);
      this.ad = ((TransitionDrawable)this.ac.getBackground());
      this.Z = ((ImageButton)localView.findViewById(2131362642));
      this.Z.setOnClickListener(new s.7(this));
      this.aa = ((ImageButton)localView.findViewById(2131362641));
      this.aa.setOnClickListener(new s.8(this));
      this.aa.setImageDrawable(k.g(i()));
      this.g.a(2130837634);
      if (j == 0)
        break label397;
    }
    label389: label397: for (int m = j().getColor(2131296308); ; m = j().getColor(2131296270))
    {
      this.ae = m;
      return localView;
      j = 0;
      break;
      k = 2130903243;
      break label28;
    }
  }

  public final void a()
  {
    this.ap = true;
    this.ao.a();
    this.ao.a(this.ax);
    if (!this.at)
    {
      this.at = true;
      this.ao.c();
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.al = paramBundle.getString("key_active_connect_device_hash");
      this.am = paramBundle.getBoolean("key_was_in_background");
      this.at = paramBundle.getBoolean("key_device_discovery_requested");
    }
    t().a(2131362140, null, this.a);
    t().a(2131362139, null, this.b);
  }

  public final void b()
  {
    this.ap = false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("key_device_discovery_requested", this.at);
    paramBundle.putString("key_active_connect_device_hash", this.al);
    paramBundle.putBoolean("key_was_in_background", this.am);
  }

  public final void e()
  {
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(this.av);
    super.e();
  }

  public final void p_()
  {
    super.p_();
    if (FeatureFragment.i.a())
    {
      this.ao = new com.spotify.mobile.android.service.connections.b(i());
      this.ao.a(this);
      this.ao.e();
    }
  }

  public final void q_()
  {
    super.q_();
    if ((FeatureFragment.i.a()) && (this.ap))
    {
      this.ao.a();
      this.ao.f();
    }
  }

  public final void w()
  {
    super.w();
    if ((this.am) && (this.ao != null))
      this.ao.d();
  }

  public final void x()
  {
    super.x();
    F();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
