package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.ui.view.SpotifyImageView;

public class GenreCell extends RelativeLayout
{
  private static c f;
  private TextView a;
  private SpotifyImageView b;
  private View c;
  private Genre d;
  private boolean e = false;

  public GenreCell(Context paramContext)
  {
    this(paramContext, null);
  }

  public GenreCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    boolean bool1 = f.a(paramContext);
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    this.e = bool2;
  }

  public static GenreCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    if (!f.a(paramContext))
      return (GenreCell)LayoutInflater.from(paramContext).inflate(2130903083, paramViewGroup, false);
    return (GenreCell)LayoutInflater.from(paramContext).inflate(2130903082, paramViewGroup, false);
  }

  private static void a(Context paramContext)
  {
    try
    {
      if (f == null)
        f = new c(paramContext);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Genre a()
  {
    return this.d;
  }

  public final void a(Genre paramGenre)
  {
    this.d = paramGenre;
    this.a.setText(this.d.d());
    String str = paramGenre.i();
    if (this.e)
      str = paramGenre.h();
    if (TextUtils.isEmpty(str))
    {
      int i = 2130838181;
      if ((!this.e) && (paramGenre.f() != -1))
        i = paramGenre.f();
      this.b.setImageResource(i);
      return;
    }
    f.a(this.b, str);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((SpotifyImageView)findViewById(2131362223));
    this.c = findViewById(2131362279);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    int n;
    if (this.e)
    {
      n = this.a.getLayoutParams().height;
      if (k == 0)
        if (!this.e)
          break label97;
    }
    label97: for (int i1 = i; ; i1 = n + i * 5 / 8)
    {
      j = i1;
      k = 1073741824;
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, m), View.MeasureSpec.makeMeasureSpec(j, k));
      return;
      n = 0;
      break;
    }
  }

  public void setPressed(boolean paramBoolean)
  {
    View localView = this.c;
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
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.GenreCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
