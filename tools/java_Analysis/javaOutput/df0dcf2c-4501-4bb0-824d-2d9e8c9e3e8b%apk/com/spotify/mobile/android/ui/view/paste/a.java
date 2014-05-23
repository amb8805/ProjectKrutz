package com.spotify.mobile.android.ui.view.paste;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.mobile.android.util.dy;
import java.text.DateFormat;
import java.util.Calendar;

public final class a extends LinearLayout
{
  private TextView a;
  private ImageView b;
  private Button c;
  private TextView d;
  private TextView e;
  private View.OnClickListener f;
  private TextView g;

  public a(Context paramContext)
  {
    super(paramContext);
    inflate(getContext(), 2130903170, this);
    this.a = ((TextView)findViewById(2131362309));
    this.b = ((ImageView)findViewById(2131362223));
    this.c = ((Button)findViewById(2131362316));
    this.g = ((TextView)findViewById(2131362468));
    e locale1 = new e(getContext(), SpotifyIcon.bj);
    locale1.a(getResources().getColor(2131296434));
    this.d = ((TextView)findViewById(2131362469));
    locale1.a(1.25F * this.d.getTextSize());
    this.d.setCompoundDrawablesWithIntrinsicBounds(locale1, null, null, null);
    e locale2 = new e(getContext(), SpotifyIcon.aD);
    locale2.a(getResources().getColor(2131296434));
    this.e = ((TextView)findViewById(2131362470));
    locale2.a(1.25F * this.e.getTextSize());
    this.e.setCompoundDrawablesWithIntrinsicBounds(locale2, null, null, null);
  }

  public final ImageView a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    int i = paramInt / 60;
    int j = i / 60;
    int k = i % 60;
    Resources localResources2;
    Object[] arrayOfObject2;
    if (j > 0)
    {
      localResources2 = getResources();
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(j);
      arrayOfObject2[1] = Integer.valueOf(k);
    }
    Resources localResources1;
    Object[] arrayOfObject1;
    for (String str = localResources2.getString(2131689986, arrayOfObject2); ; str = localResources1.getString(2131689987, arrayOfObject1))
    {
      this.e.setText(str);
      return;
      localResources1 = getResources();
      arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(k);
    }
  }

  public final void a(long paramLong)
  {
    if (paramLong > 0L)
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTimeInMillis(1000L * paramLong);
      DateFormat localDateFormat = DateFormat.getDateInstance(2);
      this.d.setText(localDateFormat.format(localCalendar.getTime()));
      this.d.setVisibility(0);
      return;
    }
    this.d.setVisibility(8);
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    this.f = paramOnClickListener;
    this.b.setOnClickListener(this.f);
    this.c.setOnClickListener(this.f);
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.a.setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
    this.a.setText(paramString);
    dy.a(this.a);
    ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
    int i = getResources().getDimensionPixelSize(2131427425);
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.b.setLayoutParams(localLayoutParams);
  }

  public final void a(boolean paramBoolean)
  {
    this.c.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
  }

  public final void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.d.setText(paramString);
      this.d.setVisibility(0);
      return;
    }
    this.d.setVisibility(8);
  }

  public final void c(String paramString)
  {
    this.g.setText(paramString);
  }

  public final void d(String paramString)
  {
    this.c.setText(paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.paste.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
