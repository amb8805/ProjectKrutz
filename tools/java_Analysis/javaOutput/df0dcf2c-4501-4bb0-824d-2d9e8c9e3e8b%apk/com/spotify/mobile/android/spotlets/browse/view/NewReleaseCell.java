package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.browse.b.a;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.b.f;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class NewReleaseCell extends FrameLayout
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private ImageView c;
  private View d;
  private String e;
  private String f;
  private int g;
  private boolean h;
  private final f i = new f(new e(ClientEvent.SubEvent.P, ViewUri.k, ViewUri.SubView.g));
  private final a j = new a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public NewReleaseCell(Context paramContext)
  {
    super(paramContext);
    setOnClickListener(this);
  }

  public NewReleaseCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnClickListener(this);
  }

  public static NewReleaseCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (NewReleaseCell)LayoutInflater.from(paramContext).inflate(2130903084, paramViewGroup, false);
  }

  public final void a(NewRelease paramNewRelease, int paramInt)
  {
    this.e = paramNewRelease.a();
    this.f = paramNewRelease.d();
    this.g = paramInt;
    String str = paramNewRelease.c();
    this.a.setText(this.e);
    this.b.setText(str);
    ae localae = ((dd)c.a(dd.class)).a().a(paramNewRelease.b());
    localae.a(2130837634);
    localae.b(2130837634);
    localae.a(this.c);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  public void onClick(View paramView)
  {
    if (this.h);
    for (String str = "overview"; ; str = "root")
    {
      this.i.a(getContext(), this.g, str, this.e, this.f);
      return;
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((TextView)findViewById(2131362282));
    this.c = ((SpotifyImageView)findViewById(2131362223));
    this.d = findViewById(2131362279);
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.d;
    if (paramBoolean);
    for (int k = 0; ; k = 8)
    {
      localView.setVisibility(k);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.NewReleaseCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
