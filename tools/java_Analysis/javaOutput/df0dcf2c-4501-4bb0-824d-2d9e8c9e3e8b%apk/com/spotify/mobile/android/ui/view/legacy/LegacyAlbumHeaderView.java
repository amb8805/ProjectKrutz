package com.spotify.mobile.android.ui.view.legacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.AlbumHeaderView;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.ds;

public class LegacyAlbumHeaderView extends AlbumHeaderView
{
  private SpotifyImageView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private View e;
  private String f;
  private String g;

  public LegacyAlbumHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public LegacyAlbumHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LegacyAlbumHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onFinishInflate()
  {
    this.a = ((SpotifyImageView)findViewById(2131362223));
    this.b = ((TextView)findViewById(2131362314));
    this.c = ((TextView)findViewById(2131362450));
    this.d = ((TextView)findViewById(2131362451));
    this.a.a(2130837634);
    this.e = findViewById(2131362449);
    this.e.setOnClickListener(new LegacyAlbumHeaderView.1(this));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (ds.b(getContext()))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
    setMeasuredDimension(i, i);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.legacy.LegacyAlbumHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
