package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.SpotifyImageView;

public class TrackCoverCell extends RelativeLayout
{
  public static final String[] a = { "_id", "name", "uri", "artist_name", "album_image_uri", "is_available" };
  private TextView b;
  private TextView c;
  private SpotifyImageView d;
  private String e;

  public TrackCoverCell(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public TrackCoverCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  private void a()
  {
    this.e = getResources().getString(2131690130);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((TextView)findViewById(2131362227));
    this.c = ((TextView)findViewById(2131362314));
    this.d = ((SpotifyImageView)findViewById(2131362223));
    this.d.a(2130837634);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    if (k == 0)
    {
      k = 1073741824;
      j = i;
    }
    int n = Math.min(i, j);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(n, m), View.MeasureSpec.makeMeasureSpec(n, k));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.TrackCoverCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
