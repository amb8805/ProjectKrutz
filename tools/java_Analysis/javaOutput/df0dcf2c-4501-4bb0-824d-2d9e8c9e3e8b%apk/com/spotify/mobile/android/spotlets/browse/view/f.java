package com.spotify.mobile.android.spotlets.browse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.ui.view.PlayableImageHeaderView;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.cc;

@SuppressLint({"ViewConstructor"})
public final class f extends PlayableImageHeaderView
{
  private View d = findViewById(2131362279);
  private View e;
  private String f = "";
  private final com.spotify.mobile.android.spotlets.browse.b.f g = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.R, ViewUri.k, ViewUri.SubView.f));

  public f(Context paramContext, String paramString)
  {
    super(paramContext, 2130903172);
    this.a.setOnTouchListener(new f.1(this));
    this.a.setOnClickListener(new f.2(this, paramContext, paramString));
    this.e = findViewById(2131362477);
  }

  public final View a()
  {
    return this.e;
  }

  public final void a(String paramString)
  {
    this.f = ((String)cc.a(paramString));
    TextView localTextView = (TextView)findViewById(2131362478);
    localTextView.setText(paramString);
    localTextView.setVisibility(0);
  }

  public final void a(boolean paramBoolean)
  {
    TextView localTextView = (TextView)findViewById(2131362479);
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }

  public final void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.d;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
