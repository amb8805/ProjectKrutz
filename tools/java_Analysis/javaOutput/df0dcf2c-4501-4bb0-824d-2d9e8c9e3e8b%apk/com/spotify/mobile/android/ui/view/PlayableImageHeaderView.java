package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.app.o;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;

public class PlayableImageHeaderView extends RelativeLayout
{
  protected SpotifyImageView a;
  View b;
  protected String c;
  private View d;
  private View e;
  private n f;
  private String g;
  private boolean h;
  private boolean i;
  private ViewUri.Verified j;
  private ViewUri.SubView k;
  private boolean l;
  private boolean m;
  private ClientEvent n;
  private ClientEvent o;
  private a p = (a)c.a(a.class);
  private d q = (d)c.a(d.class);
  private View.OnClickListener r = new PlayableImageHeaderView.1(this);
  private View.OnClickListener s = new PlayableImageHeaderView.2(this);
  private o<Cursor> t = new PlayableImageHeaderView.3(this);

  public PlayableImageHeaderView(Context paramContext)
  {
    super(paramContext);
    c(2130903171);
  }

  protected PlayableImageHeaderView(Context paramContext, int paramInt)
  {
    super(paramContext);
    c(paramInt);
  }

  public PlayableImageHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c(2130903171);
  }

  private void c(int paramInt)
  {
    View.inflate(getContext(), paramInt, this);
    this.a = ((SpotifyImageView)findViewById(2131362472));
    this.b = findViewById(2131362476);
    this.d = findViewById(2131362474);
    this.e = findViewById(2131362473);
    this.d.setOnClickListener(this.r);
    this.e.setOnClickListener(this.s);
  }

  public final void a(int paramInt)
  {
    if (this.a != null)
      this.a.setImageResource(paramInt);
  }

  public final void a(Uri paramUri)
  {
    this.a.a(paramUri);
  }

  public final void a(android.support.v4.app.n paramn, String paramString)
  {
    this.c = paramString;
    paramn.a(2131362124, null, this.t);
  }

  public final void a(n paramn)
  {
    this.f = paramn;
  }

  public final void a(ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, ClientEvent paramClientEvent1, ClientEvent paramClientEvent2)
  {
    boolean bool1 = true;
    cc.a(paramVerified, "Don't call setEventLogging with null viewUri");
    cc.a(paramSubView, "Don't call setEventLogging with null subView");
    boolean bool2;
    if ((paramSubView != null) && (paramClientEvent1 != null))
    {
      bool2 = bool1;
      this.l = bool2;
      if ((paramSubView == null) || (paramClientEvent2 == null))
        break label78;
    }
    while (true)
    {
      this.m = bool1;
      this.k = paramSubView;
      this.j = paramVerified;
      this.n = paramClientEvent1;
      this.o = paramClientEvent2;
      return;
      bool2 = false;
      break;
      label78: bool1 = false;
    }
  }

  public final SpotifyImageView b()
  {
    return this.a;
  }

  public final void b(int paramInt)
  {
    if (this.a != null)
    {
      this.a.setImageResource(paramInt);
      this.a.a(paramInt);
    }
  }

  public final void b(boolean paramBoolean)
  {
    View localView1 = this.e;
    if ((paramBoolean) || (this.h));
    for (int i1 = 8; ; i1 = 0)
    {
      localView1.setVisibility(i1);
      View localView2 = this.d;
      int i2;
      if (paramBoolean)
      {
        boolean bool = this.h;
        i2 = 0;
        if (!bool);
      }
      else
      {
        i2 = 8;
      }
      localView2.setVisibility(i2);
      return;
    }
  }

  public final View c()
  {
    return this.b;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof PlayableImageHeaderView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    PlayableImageHeaderView.SavedState localSavedState = (PlayableImageHeaderView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.i = localSavedState.a;
    b(this.i);
  }

  protected Parcelable onSaveInstanceState()
  {
    PlayableImageHeaderView.SavedState localSavedState = new PlayableImageHeaderView.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.i;
    return localSavedState;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.PlayableImageHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
