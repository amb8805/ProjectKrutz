package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class ArtistPortraitCell extends RelativeLayout
  implements View.OnCreateContextMenuListener
{
  public static final String[] a = { "_id", "name", "uri", "image_uri", "is_available", "is_radio_available", "collection_uri", "offline_state", "sync_progress" };
  public int b;
  public String c;
  public String d;
  public boolean e;
  public boolean f;
  private TextView g;
  private ImageView h;
  private View i;
  private String j;
  private a k;
  private ArtistMenuDelegate l;

  public ArtistPortraitCell(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public ArtistPortraitCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public static ArtistPortraitCell a(Context paramContext, ViewGroup paramViewGroup, ArtistMenuDelegate paramArtistMenuDelegate, a parama)
  {
    ArtistPortraitCell localArtistPortraitCell = (ArtistPortraitCell)LayoutInflater.from(paramContext).inflate(2130903081, paramViewGroup, false);
    localArtistPortraitCell.l = paramArtistMenuDelegate;
    localArtistPortraitCell.k = parama;
    return localArtistPortraitCell;
  }

  private void a()
  {
    this.j = getResources().getString(2131690130);
  }

  public final void a(String paramString1, String paramString2, Uri paramUri)
  {
    this.d = paramString2;
    this.c = paramString1;
    this.e = true;
    this.f = true;
    this.g.setText(paramString1);
    ((dd)c.a(dd.class)).a().a(paramUri).a(2130837635).a(this.h);
    this.h.setEnabled(true);
    this.g.setEnabled(true);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    onCreateContextMenu(paramContextMenu, this, new AdapterView.AdapterContextMenuInfo(this, -1, this.b));
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = ((TextView)findViewById(2131362227));
    this.h = ((ImageView)findViewById(2131362223));
    findViewById(2131362282).setVisibility(8);
    this.i = findViewById(2131362279);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 1073741824;
    int n = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int i1 = getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i4;
    if (i2 == 0)
      i4 = n;
    while (true)
    {
      int i5 = Math.min(n, i4);
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, i3), View.MeasureSpec.makeMeasureSpec(i5, m));
      return;
      if (i3 == 0)
      {
        i3 = m;
        n = i1;
        m = i2;
        i4 = i1;
      }
      else
      {
        m = i2;
        i4 = i1;
      }
    }
  }

  public void setPressed(boolean paramBoolean)
  {
    View localView = this.i;
    if (paramBoolean);
    for (int m = 0; ; m = 8)
    {
      localView.setVisibility(m);
      super.setPressed(paramBoolean);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.ArtistPortraitCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
