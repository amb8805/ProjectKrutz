package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.c.a;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class GenesisMenuLayoutHeaderCell extends FrameLayout
{
  private TextView a;
  private TextView b;
  private TextView c;
  private ImageView d;
  private View e;
  private ImageView f;
  private ImageView g;
  private ImageView h;

  public GenesisMenuLayoutHeaderCell(Context paramContext)
  {
    super(paramContext);
  }

  public GenesisMenuLayoutHeaderCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static GenesisMenuLayoutHeaderCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (GenesisMenuLayoutHeaderCell)LayoutInflater.from(paramContext).inflate(2130903091, paramViewGroup, false);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      this.a.setVisibility(0);
      this.a.setText(paramString1);
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      this.b.setVisibility(0);
      this.b.setText(paramString2);
    }
    Picasso localPicasso = ((dd)c.a(dd.class)).a();
    if (!TextUtils.isEmpty(paramString3))
    {
      ae localae = localPicasso.a(paramString3);
      localae.a(new a(getContext()));
      localae.a(this.d);
    }
    if (!TextUtils.isEmpty(paramString4))
    {
      this.c.setVisibility(0);
      this.c.setText(paramString4);
    }
    if (!TextUtils.isEmpty(paramString5))
    {
      this.f.setVisibility(0);
      localPicasso.a(paramString5).a(this.f);
    }
    if (!TextUtils.isEmpty(paramString6))
    {
      this.g.setVisibility(0);
      localPicasso.a(paramString6).a(this.g);
    }
    if (!TextUtils.isEmpty(paramString7))
    {
      this.h.setVisibility(0);
      localPicasso.a(paramString7).a(this.h);
    }
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((TextView)findViewById(2131362282));
    this.d = ((ImageView)findViewById(2131362223));
    this.c = ((TextView)findViewById(2131362290));
    this.f = ((ImageView)findViewById(2131362288));
    this.g = ((ImageView)findViewById(2131362289));
    this.h = ((ImageView)findViewById(2131362287));
    this.e = findViewById(2131362279);
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.e;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.GenesisMenuLayoutHeaderCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
