package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.model.k;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.bc;

public class RadioCoverCell extends RelativeLayout
{
  private SpotifyImageView a;
  private View b;
  private View c;
  private TextView d;
  private TextView e;
  private TextView f;
  private String g;
  private String h;

  public RadioCoverCell(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public RadioCoverCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public static RadioCoverCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (RadioCoverCell)LayoutInflater.from(paramContext).inflate(2130903094, paramViewGroup, false);
  }

  private void a()
  {
    if (isInEditMode())
      return;
    this.g = getResources().getString(2131690130);
    this.h = getResources().getString(2131690147);
  }

  public final void a(k paramk)
  {
    int i = 8;
    SpotifyLink localSpotifyLink = new SpotifyLink(paramk.e());
    int j;
    int k;
    label46: label64: String str1;
    label135: String str2;
    int m;
    if (paramk.c().length() > 0)
    {
      j = 1;
      View localView = this.c;
      if (j == 0)
        break label228;
      k = 0;
      localView.setVisibility(k);
      TextView localTextView = this.d;
      if (j == 0)
        break label234;
      localTextView.setVisibility(i);
      str1 = paramk.b();
      if (TextUtils.isEmpty(str1))
        str1 = this.g;
      if (localSpotifyLink.a() == SpotifyLink.LinkType.ae)
        str1 = this.h;
      if (j == 0)
        break label239;
      this.e.setText(str1);
      this.f.setText(paramk.c());
      str2 = paramk.d();
      this.a.a(null);
      switch (RadioCoverCell.1.a[localSpotifyLink.a().ordinal()])
      {
      default:
        m = 2130837635;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      if ((str2 == null) || (str2.length() <= 0))
        break label283;
      this.a.a(i.a(str2));
      return;
      j = 0;
      break;
      label228: k = i;
      break label46;
      label234: i = 0;
      break label64;
      label239: this.d.setText(str1);
      break label135;
      m = 2130837638;
      continue;
      m = 2130837639;
      continue;
      m = 2130837637;
      str2 = bc.a(paramk.e());
    }
    label283: this.a.setImageResource(m);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.a = ((SpotifyImageView)findViewById(2131362223));
    this.a.a(2130837634);
    this.c = findViewById(2131362303);
    this.d = ((TextView)findViewById(2131362304));
    this.e = ((TextView)findViewById(2131362227));
    this.f = ((TextView)findViewById(2131362282));
    this.b = findViewById(2131362279);
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

  public void setPressed(boolean paramBoolean)
  {
    View localView = this.b;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      super.setPressed(paramBoolean);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.RadioCoverCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
