package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.bp;

public class CrossfadeSettingsCell extends AbstractSettingsCell
{
  protected boolean c;
  private SeekBar d;
  private int e;
  private PopupWindow f;
  private int g;
  private int h;
  private int i;
  private int j;
  private TextView k;
  private String l = "";
  private String m = " s ";

  public CrossfadeSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  public CrossfadeSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CrossfadeSettingsCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    CrossfadeSettingsCell localCrossfadeSettingsCell = (CrossfadeSettingsCell)LayoutInflater.from(paramContext).inflate(2130903253, paramViewGroup, false);
    if (FeatureFragment.h.a())
    {
      localCrossfadeSettingsCell.d.setEnabled(false);
      for (int n = 0; n < localCrossfadeSettingsCell.getChildCount(); n++)
        localCrossfadeSettingsCell.getChildAt(n).setEnabled(false);
    }
    localCrossfadeSettingsCell.d.setOnSeekBarChangeListener(new CrossfadeSettingsCell.1(localCrossfadeSettingsCell));
    return localCrossfadeSettingsCell;
  }

  protected final void a(ContentValues paramContentValues)
  {
    int n = this.d.getProgress();
    if (n == this.e)
    {
      bp.b("Not saving crossfade settings, they are the same.", new Object[0]);
      return;
    }
    if ((n >= 0) && (n <= 12));
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Out of range again! aaargh.");
      if (n != 0)
        break;
      paramContentValues.put("crossfade", Integer.valueOf(0));
      a(ClientEvent.SubEvent.bd, Integer.valueOf(0));
      return;
    }
    paramContentValues.put("crossfade", Integer.valueOf(1));
    a(ClientEvent.SubEvent.bd, Integer.valueOf(1));
    paramContentValues.put("crossfade_time_seconds", Integer.valueOf(n));
    a(ClientEvent.SubEvent.be, Integer.valueOf(n));
  }

  public final void a(Cursor paramCursor)
  {
    if (this.c)
      return;
    boolean bool1 = am.a(paramCursor, paramCursor.getColumnIndexOrThrow("crossfade"));
    int n = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("crossfade_time_seconds"));
    if ((n >= 0) && (n <= 12));
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assertion.a(bool2, "Out of range, aaargh: " + n);
      int i1 = 0;
      if (bool1)
        i1 = n;
      this.e = i1;
      this.d.setProgress(this.e);
      return;
    }
  }

  public final void a(String paramString)
  {
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = ((SeekBar)findViewById(2131362618));
    this.d.setMax(12);
    this.d.refreshDrawableState();
    this.k = new TextView(getContext());
    this.k.setGravity(17);
    this.k.setBackgroundResource(2130837646);
    this.k.setTextSize(1, 16.0F);
    this.k.setTextColor(getResources().getColor(2131296525));
    this.f = new PopupWindow(this.k);
    this.f.setFocusable(false);
    this.f.setTouchable(false);
    this.f.setClippingEnabled(false);
    this.f.setWindowLayoutMode(-2, -2);
    this.i = getResources().getDrawable(2130838186).getIntrinsicWidth();
    this.j = getResources().getDrawable(2130838186).getIntrinsicHeight();
    this.l = (" " + getResources().getString(2131690203) + " ");
    this.m = (" " + getResources().getString(2131690238) + " ");
    ((TextView)findViewById(2131362646)).setText(2131690203);
    ((TextView)findViewById(2131362647)).setText("12 " + getResources().getString(2131690238));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.CrossfadeSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
