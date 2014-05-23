package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import net.hockeyapp.android.d.j;

public final class a extends RelativeLayout
{
  public a(Context paramContext, String paramString)
  {
    super(paramContext);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    setBackgroundColor(-1);
    setLayoutParams(localLayoutParams1);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 3.0F, getResources().getDisplayMetrics()));
    localLayoutParams2.addRule(10, -1);
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(localLayoutParams2);
    localImageView.setBackgroundDrawable(j.a());
    addView(localImageView);
    int i = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams3.addRule(13, -1);
    localLayoutParams3.setMargins(i, i, i, i);
    TextView localTextView = new TextView(paramContext);
    localTextView.setGravity(17);
    localTextView.setLayoutParams(localLayoutParams3);
    localTextView.setText(paramString);
    localTextView.setTextColor(-16777216);
    addView(localTextView);
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.views.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
