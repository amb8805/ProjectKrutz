package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.b.a;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InboxItemView extends RelativeLayout
{
  private final ImageView a;
  private final ImageView b;
  private final TextView c;
  private final TextView d;
  private final TextView e;
  private final Drawable f;
  private final e g;
  private final DateFormat h;
  private ViewGroup i;
  private String j;
  private String k;

  public InboxItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public InboxItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = com.spotify.mobile.android.ui.stuff.i.g(paramContext);
    this.g = new e(paramContext, SpotifyIcon.Y);
    this.g.a(com.spotify.android.paste.widget.g.a(paramContext, 2130772383));
    this.g.a(com.spotify.android.paste.graphics.d.a(20.0F, paramContext.getResources()));
    this.h = new SimpleDateFormat("EEEE d MMMM y HH:mm", paramContext.getResources().getConfiguration().locale);
    inflate(paramContext, 2130903263, this);
    int m = com.spotify.android.paste.graphics.d.a(16.0F, paramContext.getResources());
    setPadding(0, m, 0, m);
    this.a = ((ImageView)findViewById(2131362654));
    this.b = ((ImageView)findViewById(2131362292));
    this.c = ((TextView)findViewById(2131362656));
    this.d = ((TextView)findViewById(2131362227));
    this.e = ((TextView)findViewById(2131362309));
    this.d.setCompoundDrawablePadding(com.spotify.android.paste.graphics.d.a(6.0F, paramContext.getResources()));
    this.b.setOnClickListener(new InboxItemView.1(this));
    InboxItemView.2 local2 = new InboxItemView.2(this, new OvalShape());
    local2.getPaint().setColor(paramContext.getResources().getColor(2131296389));
    this.a.setImageDrawable(local2);
    this.i = ((ViewGroup)findViewById(2131362600));
    this.i.addView(com.spotify.mobile.android.ui.stuff.g.a(paramContext));
  }

  public final void a(d paramd)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(13, -paramd.b());
    String str1 = this.h.format(localCalendar.getTime());
    String str2 = paramd.a(getResources());
    String str3 = paramd.c();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int m;
    label145: label175: SpotifyIcon localSpotifyIcon;
    label216: ViewGroup localViewGroup;
    int n;
    if (TextUtils.isEmpty(str2))
    {
      localSpannableStringBuilder.append(getResources().getString(2131690130));
      StringBuilder localStringBuilder = new StringBuilder(paramd.e());
      if (!TextUtils.isEmpty(str3))
      {
        localStringBuilder.append(": ");
        localStringBuilder.append(paramd.c().trim());
      }
      ImageView localImageView = this.a;
      if (!paramd.d())
        break label396;
      m = 4;
      localImageView.setVisibility(m);
      if (!TextUtils.isEmpty(paramd.g()))
        break label402;
      this.b.setImageDrawable(this.f);
      localSpotifyIcon = SpotifyIcon.Y;
      switch (paramd.i())
      {
      default:
        this.g.a(localSpotifyIcon);
        this.j = paramd.e();
        this.k = paramd.f();
        this.c.setText(str1.toUpperCase(getResources().getConfiguration().locale));
        this.d.setText(localSpannableStringBuilder);
        this.d.setCompoundDrawablesWithIntrinsicBounds(this.g, null, null, null);
        this.e.setText(localStringBuilder.toString());
        localViewGroup = this.i;
        boolean bool = paramd.r();
        n = 0;
        if (!bool);
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localViewGroup.setVisibility(n);
      return;
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.append((char)' ');
      localSpannableStringBuilder.append(paramd.b(getResources()));
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(com.spotify.android.paste.widget.g.a(getContext(), 2130772382)), 0, str2.length(), 33);
      break;
      label396: m = 0;
      break label145;
      label402: ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(paramd.g())).a(this.f).a(a.a()).a(this.b);
      break label175;
      localSpotifyIcon = SpotifyIcon.aG;
      break label216;
      localSpotifyIcon = SpotifyIcon.a;
      break label216;
      localSpotifyIcon = SpotifyIcon.c;
      break label216;
      localSpotifyIcon = SpotifyIcon.Y;
      break label216;
      n = 4;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.phoenixinbox.InboxItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
