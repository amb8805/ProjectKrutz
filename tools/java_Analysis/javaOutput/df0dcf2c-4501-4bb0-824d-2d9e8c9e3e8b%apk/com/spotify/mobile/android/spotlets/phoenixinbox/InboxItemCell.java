package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.Calendar;
import java.util.Locale;

public class InboxItemCell extends LinearLayout
{
  private SpotifyImageView a;
  private SpotifyImageView b;
  private ImageView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private d i;
  private String j;
  private final View.OnClickListener k = new InboxItemCell.1(this);

  public InboxItemCell(Context paramContext)
  {
    this(paramContext, null);
  }

  public InboxItemCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.j = paramContext.getString(2131690130);
  }

  public static InboxItemCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (InboxItemCell)LayoutInflater.from(paramContext).inflate(2130903092, paramViewGroup, false);
  }

  public final void a(d paramd)
  {
    int m = 1;
    int n = 0;
    this.i = paramd;
    TextView localTextView1 = this.e;
    int i1 = paramd.b();
    String str;
    label101: int i2;
    label119: int i3;
    if (i1 < 60)
    {
      str = getResources().getString(2131690009).toUpperCase(Locale.getDefault());
      localTextView1.setText(str);
      this.d.setText(paramd.e());
      if (TextUtils.isEmpty(this.i.g()))
        break label536;
      this.a.a(i.a(this.i.g()));
      if (TextUtils.isEmpty(paramd.c().trim()))
        break label549;
      i2 = m;
      TextView localTextView2 = this.f;
      if (i2 == 0)
        break label555;
      i3 = 0;
      label133: localTextView2.setVisibility(i3);
      this.f.setText(paramd.c().trim());
      this.h.setVisibility(0);
      if (paramd.d())
        m = 0;
      this.d.setTypeface(null, m);
      this.f.setTypeface(null, m);
      this.g.setTypeface(null, m);
      this.h.setTypeface(null, m);
      if (paramd.i() != -1)
        break label562;
      this.c.setImageResource(0);
      this.b.setImageResource(2130837634);
      this.g.setText(2131690011);
      this.h.setText(2131690011);
    }
    while (true)
    {
      boolean bool = paramd.r();
      this.a.setEnabled(bool);
      this.b.setEnabled(bool);
      this.d.setEnabled(bool);
      this.e.setEnabled(bool);
      this.f.setEnabled(bool);
      this.g.setEnabled(bool);
      this.h.setEnabled(bool);
      return;
      if (i1 < 3600)
      {
        int i7 = i1 / 60;
        Resources localResources3 = getResources();
        Object[] arrayOfObject3 = new Object[m];
        arrayOfObject3[0] = Integer.valueOf(i7);
        str = localResources3.getQuantityString(2131623948, i7, arrayOfObject3).toUpperCase(Locale.getDefault());
        break;
      }
      if (i1 < 86400)
      {
        int i6 = i1 / 3600;
        Resources localResources2 = getResources();
        Object[] arrayOfObject2 = new Object[m];
        arrayOfObject2[0] = Integer.valueOf(i6);
        str = localResources2.getQuantityString(2131623947, i6, arrayOfObject2).toUpperCase(Locale.getDefault());
        break;
      }
      if (i1 < 1209600)
      {
        int i5 = i1 / 86400;
        Resources localResources1 = getResources();
        Object[] arrayOfObject1 = new Object[m];
        arrayOfObject1[0] = Integer.valueOf(i5);
        str = localResources1.getQuantityString(2131623946, i5, arrayOfObject1).toUpperCase(Locale.getDefault());
        break;
      }
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.add(13, -i1);
      str = android.text.format.DateFormat.getDateFormat(getContext()).format(localCalendar.getTime());
      break;
      label536: this.a.a(Uri.EMPTY);
      break label101;
      label549: i2 = 0;
      break label119;
      label555: i3 = 8;
      break label133;
      label562: if (paramd.r())
        break label609;
      this.c.setImageResource(0);
      this.b.setImageResource(2130837634);
      this.g.setText(2131690130);
      this.h.setText(2131690130);
    }
    label609: int i4;
    switch (paramd.i())
    {
    default:
      i4 = 0;
    case 1:
    case 2:
    case 3:
    case 0:
    }
    while (true)
    {
      this.c.setImageResource(n);
      ((dd)c.a(dd.class)).a().a(i.a(paramd.k())).a(i4).a(this.b);
      this.g.setText(paramd.a(getResources()));
      this.h.setText(paramd.b(getResources()));
      break;
      n = 2130838032;
      i4 = 2130837634;
      continue;
      n = 2130838033;
      this.h.setVisibility(8);
      i4 = 2130837635;
      continue;
      n = 2130838034;
      i4 = 2130837638;
      continue;
      n = 2130838035;
      i4 = 2130837634;
    }
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ImageView)findViewById(2131362299));
    this.a = ((SpotifyImageView)findViewById(2131362292));
    this.b = ((SpotifyImageView)findViewById(2131362298));
    this.d = ((TextView)findViewById(2131362294));
    this.e = ((TextView)findViewById(2131362295));
    this.f = ((TextView)findViewById(2131362296));
    this.g = ((TextView)findViewById(2131362300));
    this.h = ((TextView)findViewById(2131362301));
    this.a.a(2130837640);
    this.a.setOnClickListener(this.k);
    findViewById(2131362293).setOnClickListener(this.k);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.phoenixinbox.InboxItemCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
