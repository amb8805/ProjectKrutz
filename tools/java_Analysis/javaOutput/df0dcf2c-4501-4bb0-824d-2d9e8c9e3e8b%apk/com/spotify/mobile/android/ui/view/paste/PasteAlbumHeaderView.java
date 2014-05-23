package com.spotify.mobile.android.ui.view.paste;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.ui.view.AlbumHeaderView;
import com.spotify.mobile.android.ui.view.ListHeaderView;

public class PasteAlbumHeaderView extends AlbumHeaderView
{
  ListHeaderView a;
  HeaderView b;
  ImageView c;
  private Button d;
  private LinearLayout e;
  private String f;
  private String g;

  public PasteAlbumHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PasteAlbumHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new ListHeaderView(paramContext);
    this.b = this.a.b();
    this.c = this.a.a();
    this.e = new LinearLayout(getContext());
    this.e.setOrientation(1);
    this.e.setGravity(1);
    this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    TextView localTextView = new TextView(getContext());
    g.b(getContext(), localTextView, 2130772390);
    localTextView.setGravity(1);
    localTextView.setText(getContext().getString(2131689497));
    this.d = h.c(getContext(), this.e);
    this.d.setOnClickListener(new PasteAlbumHeaderView.1(this));
    ((LinearLayout.LayoutParams)this.d.getLayoutParams()).topMargin = d.a(4.0F, getResources());
    this.e.addView(localTextView);
    this.e.addView(this.d);
    this.a.a(this.e);
    addView(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.paste.PasteAlbumHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
