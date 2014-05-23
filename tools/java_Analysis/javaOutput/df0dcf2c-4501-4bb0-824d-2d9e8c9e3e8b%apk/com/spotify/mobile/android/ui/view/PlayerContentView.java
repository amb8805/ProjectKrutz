package com.spotify.mobile.android.ui.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.fragments.k;
import com.spotify.mobile.android.ui.menus.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.ds;

public class PlayerContentView extends LinearLayout
  implements View.OnCreateContextMenuListener
{
  private static final int[] F = new int[0];
  private static final int[] G = { 16842912 };
  public static final String[] d = { "name", "artist_name", "album_image_uri", "album_image_large_uri", "artist_uri", "album_uri", "album_name", "uri", "is_starred", "is_available", "is_album_browsable", "is_artist_browsable", "is_radio_available", "focused_row", "is_ad", "ad_url", "is_queueable", "is_hidden", "is_in_collection" };
  private String A;
  private o B;
  private a C = (a)com.spotify.mobile.android.c.c.a(a.class);
  private com.spotify.mobile.android.ui.actions.c D = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private d E = (d)com.spotify.mobile.android.c.c.a(d.class);
  private View.OnClickListener H = new PlayerContentView.3(this);
  private View.OnClickListener I = new PlayerContentView.4(this);
  public String a;
  public boolean b;
  public boolean c;
  private SpotifyImageView e;
  private View f;
  private ImageButton g;
  private View h;
  private TextView i;
  private int j;
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private Uri v;
  private Uri w;
  private boolean x;
  private String y;
  private boolean z;

  public PlayerContentView(Context paramContext)
  {
    super(paramContext);
  }

  public PlayerContentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static void c()
  {
  }

  private void g()
  {
    this.n = this.A;
    this.o = null;
    this.k = this.A;
    this.a = null;
    this.l = this.A;
    this.m = null;
    this.p = false;
    this.q = false;
    this.s = false;
    this.v = null;
    this.w = null;
    this.x = false;
    this.y = "";
    this.j = -1;
  }

  private void h()
  {
    boolean bool1 = true;
    if (!this.z);
    while (isInEditMode())
      return;
    View localView1 = this.f;
    int i1;
    int i2;
    label53: int i3;
    label98: boolean bool2;
    label156: label179: label206: View localView3;
    int i6;
    label251: int i4;
    label276: View localView4;
    if (this.u)
    {
      i1 = 0;
      localView1.setVisibility(i1);
      SpotifyImageView localSpotifyImageView1 = this.e;
      if (!this.u)
        break label383;
      i2 = 8;
      localSpotifyImageView1.setVisibility(i2);
      this.e.a(this.v);
      this.e.a(this.w);
      TextView localTextView1 = this.i;
      if (!this.u)
        break label389;
      i3 = 4;
      localTextView1.setVisibility(i3);
      this.i.setText(this.k);
      this.i.setSelected(bool1);
      this.B.a();
      if ((!this.c) || (this.a == null))
        break label395;
      this.g.setImageState(G, bool1);
      SpotifyImageView localSpotifyImageView2 = this.e;
      if ((!this.p) && (!this.s))
        break label409;
      bool2 = bool1;
      localSpotifyImageView2.setEnabled(bool2);
      TextView localTextView2 = this.i;
      if ((!this.p) && (!this.s))
        break label415;
      localTextView2.setEnabled(bool1);
      View localView2 = findViewById(2131362634);
      localView3 = findViewById(2131362636);
      if (localView2 != null)
      {
        if ((!this.x) && (!this.u))
          break label420;
        i6 = 8;
        localView2.setVisibility(i6);
      }
      if ((!this.x) && (!this.u))
        break label426;
      i4 = 8;
      localView3.setVisibility(i4);
      ImageButton localImageButton = this.g;
      int i5;
      if (!this.x)
      {
        boolean bool3 = this.u;
        i5 = 0;
        if (!bool3);
      }
      else
      {
        i5 = 8;
      }
      localImageButton.setVisibility(i5);
      localView4 = this.h;
      if (!a())
        break label432;
    }
    label389: label395: label409: label415: label420: label426: label432: for (View.OnClickListener localOnClickListener = this.I; ; localOnClickListener = null)
    {
      localView4.setOnClickListener(localOnClickListener);
      this.g.setImageDrawable(k.l(getContext()));
      ((ImageView)localView3).setImageDrawable(k.k(getContext()));
      return;
      i1 = 8;
      break;
      label383: i2 = 0;
      break label53;
      i3 = 0;
      break label98;
      this.g.setImageState(F, bool1);
      break label156;
      bool2 = false;
      break label179;
      bool1 = false;
      break label206;
      i6 = 0;
      break label251;
      i4 = 0;
      break label276;
    }
  }

  public final void a(int paramInt)
  {
    this.j = paramInt;
  }

  public final void a(Cursor paramCursor)
  {
    int i1 = 1;
    if ((paramCursor == null) || (paramCursor.isClosed()))
    {
      g();
      h();
      return;
    }
    this.k = am.a(paramCursor, 0, this.A);
    this.a = paramCursor.getString(7);
    this.m = paramCursor.getString(5);
    this.l = am.a(paramCursor, 6, this.A);
    this.n = am.a(paramCursor, i1, this.A);
    this.o = paramCursor.getString(4);
    this.b = am.a(paramCursor, 8);
    this.p = am.a(paramCursor, 9);
    int i2;
    if ((am.a(paramCursor, 10)) && (this.m != null) && (this.m.length() > 0))
    {
      i2 = i1;
      this.q = i2;
      if ((!am.a(paramCursor, 11)) || (this.o == null) || (this.o.length() <= 0))
        break label282;
    }
    while (true)
    {
      this.r = i1;
      this.s = am.a(paramCursor, 12);
      this.t = am.a(paramCursor, 16);
      this.u = am.a(paramCursor, 17);
      this.c = am.a(paramCursor, 18);
      this.v = com.spotify.mobile.android.provider.i.a(paramCursor.getString(2));
      this.w = com.spotify.mobile.android.provider.i.a(paramCursor.getString(3));
      this.x = am.a(paramCursor, 14);
      this.y = am.a(paramCursor, 15, "");
      h();
      return;
      i2 = 0;
      break;
      label282: i1 = 0;
    }
  }

  public final boolean a()
  {
    return (this.x) && (this.y.length() > 0);
  }

  public final void b()
  {
    com.google.common.base.i.b(a());
    localUri = Uri.parse(this.y);
    try
    {
      getContext().startActivity(new Intent("android.intent.action.VIEW", localUri));
      a.b(getContext());
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        Assertion.b("Could not open ad URI: " + localUri);
    }
  }

  public final int d()
  {
    return this.j;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    super.onCreateContextMenu(paramContextMenu);
    this.E.a(getContext(), paramContextMenu, ViewUri.r, ViewUri.SubView.a, this.c, true, this.a);
    this.E.b(getContext(), paramContextMenu, ViewUri.r, this.a);
    d locald = this.E;
    Context localContext1 = getContext();
    ViewUri.Verified localVerified = ViewUri.r;
    String str = this.k;
    Context localContext2 = getContext();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.n;
    locald.a(localContext1, paramContextMenu, localVerified, str, localContext2.getString(2131690251, arrayOfObject), this.a);
    if (this.s)
      this.E.c(getContext(), paramContextMenu, ViewUri.r, this.a);
    if (this.t)
      this.E.a(getContext(), paramContextMenu, ViewUri.r, this.a);
    if (this.r)
      this.E.b(getContext(), paramContextMenu, ViewUri.r, this.o, this.n);
    if (this.q)
      this.E.a(getContext(), paramContextMenu, ViewUri.r, this.m, this.l);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    onCreateContextMenu(paramContextMenu);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.e = ((SpotifyImageView)findViewById(2131362223));
    this.e.setOnClickListener(this.H);
    this.f = findViewById(2131362629);
    this.h = findViewById(2131362499);
    this.i = ((TextView)findViewById(2131362227));
    if (ds.b(getContext()));
    for (Object localObject = new p(this); ; localObject = new q(this))
    {
      this.B = ((o)localObject);
      this.g = ((ImageButton)findViewById(2131362633));
      this.g.setOnClickListener(new PlayerContentView.1(this));
      this.A = getResources().getString(2131690130);
      View localView = findViewById(2131362634);
      if (localView == null)
        localView = findViewById(2131362636);
      localView.setOnClickListener(new PlayerContentView.2(this));
      this.e.a(2130837634);
      g();
      this.z = true;
      h();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.PlayerContentView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
