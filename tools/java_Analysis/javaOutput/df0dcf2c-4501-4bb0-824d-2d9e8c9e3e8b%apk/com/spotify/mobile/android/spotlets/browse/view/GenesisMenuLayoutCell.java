package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class GenesisMenuLayoutCell extends FrameLayout
{
  private TextView a;
  private TextView b;
  private ImageView c;
  private View d;

  public GenesisMenuLayoutCell(Context paramContext)
  {
    super(paramContext);
  }

  public GenesisMenuLayoutCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static GenesisMenuLayoutCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (GenesisMenuLayoutCell)LayoutInflater.from(paramContext).inflate(2130903090, paramViewGroup, false);
  }

  public final void a(String paramString1, String paramString2, Uri paramUri)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    ((dd)c.a(dd.class)).a().a(paramUri).a(this.c);
  }

  public final void a(String paramString1, String paramString2, String paramString3)
  {
    a(paramString1, paramString2, Uri.parse(paramString3));
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
    this.c = ((ImageView)findViewById(2131362223));
    this.d = findViewById(2131362279);
  }

  public void setPressed(boolean paramBoolean)
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
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.GenesisMenuLayoutCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
