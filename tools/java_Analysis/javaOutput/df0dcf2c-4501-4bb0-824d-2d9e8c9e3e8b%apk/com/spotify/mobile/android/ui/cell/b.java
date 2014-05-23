package com.spotify.mobile.android.ui.cell;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.ui.view.e;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.HtmlUtil;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.spotify.mobile.android.util.de;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
public final class b extends LinearLayout
{
  private final Drawable a;
  private final Drawable b;
  private final Drawable c;
  private final Drawable d;
  private final Drawable e;
  private dd f = (dd)c.a(dd.class);
  private int g;
  private de h;
  private final View.OnClickListener i = new b.1(this);

  public b(Context paramContext, int paramInt, de paramde)
  {
    super(paramContext);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Each row should have at least one item");
      this.a = com.spotify.mobile.android.ui.stuff.i.b(paramContext);
      this.b = com.spotify.mobile.android.ui.stuff.i.c(paramContext);
      this.c = com.spotify.mobile.android.ui.stuff.i.a(paramContext);
      this.d = com.spotify.mobile.android.ui.stuff.i.d(paramContext);
      this.e = com.spotify.mobile.android.ui.stuff.i.b(paramContext, SpotifyIcon.aH);
      this.h = paramde;
      this.g = paramInt;
      setOrientation(0);
      setBackgroundResource(2130838194);
      setWeightSum(this.g);
      int j = getResources().getDimensionPixelSize(2131427383);
      for (int k = 0; k < paramInt; k++)
      {
        e locale = new e(getContext());
        locale.findViewById(2131362348).setOnClickListener(this.i);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2, 1.0F);
        localLayoutParams.setMargins(j, j, j, j);
        addView(locale, k, localLayoutParams);
      }
    }
  }

  public final void a()
  {
    for (int j = 0; j < this.g; j++)
    {
      e locale = (e)getChildAt(j);
      Story localStory = (Story)locale.getTag();
      if (localStory != null)
        locale.c().a(localStory.q());
    }
  }

  public final void a(Map<Long, Story> paramMap, List<Long> paramList, d paramd)
  {
    int j = 0;
    if (j < this.g)
    {
      e locale = (e)getChildAt(j);
      Story localStory;
      String str1;
      label142: String str2;
      label173: Boolean localBoolean;
      label224: CharSequence localCharSequence;
      String str3;
      label268: label286: label338: Drawable localDrawable;
      int k;
      if (j < paramList.size())
      {
        localStory = (Story)paramMap.get(paramList.get(j));
        locale.setTag(localStory);
        locale.d();
        Spannable localSpannable = (Spannable)Html.fromHtml(localStory.o());
        HtmlUtil.a(localSpannable, new b.2(this, localStory));
        TextView localTextView = locale.a();
        localTextView.setText(localSpannable);
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
        if ((localStory.f() == 3) && (!TextUtils.isEmpty(localStory.n())))
        {
          str1 = localStory.n();
          Assertion.a(str1, "Card's title can not be empty!");
          locale.a(str1);
          if (localStory.f() != 3)
            break label725;
          str2 = localStory.i();
          locale.b(str2);
          Integer localInteger1 = Integer.valueOf(localStory.f());
          if ((localInteger1.intValue() != 1) && (localInteger1.intValue() != 2) && (localInteger1.intValue() != 8))
            break label756;
          localBoolean = Boolean.valueOf(false);
          if (!localBoolean.booleanValue())
            break label812;
          Integer localInteger2 = Integer.valueOf(localStory.f());
          localCharSequence = DateUtils.getRelativeTimeSpanString(localStory.s());
          if (!TextUtils.isEmpty(localStory.m()))
            break label765;
          str3 = "";
          if (localInteger2.intValue() != 3)
            break label801;
          locale.a(localCharSequence, str3);
          locale.b().setVisibility(0);
          Uri localUri2 = com.spotify.mobile.android.provider.i.a(localStory.l());
          this.f.a().a(localUri2).a(this.d).a(com.spotify.mobile.android.ui.b.a.a()).a(locale.b());
          switch (b.3.a[localStory.g().a().ordinal()])
          {
          default:
            localDrawable = this.b;
            k = 0;
            label393: if (k != 0)
              localDrawable = com.spotify.mobile.android.ui.b.b.a(localDrawable);
            Uri localUri1 = com.spotify.mobile.android.provider.i.a(localStory.c());
            ae localae = this.f.a().a(localUri1).a(localDrawable);
            if (k != 0)
              localae.a(com.spotify.mobile.android.ui.b.b.a());
            localae.a(locale.e());
            locale.c().a(localStory.q());
            com.spotify.mobile.android.a.a locala = new com.spotify.mobile.android.a.a(getContext(), localStory.g(), localStory.p(), ViewUri.g, ViewUri.g, paramd);
            ViewUri.SubView localSubView = ViewUri.SubView.a;
            ClientEvent localClientEvent1 = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.I);
            localClientEvent1.a("story_id", localStory.e());
            localClientEvent1.a("story_music_uri", localStory.g().d());
            localClientEvent1.a("action", "play");
            ClientEvent localClientEvent2 = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.I);
            localClientEvent2.a("story_id", localStory.e());
            localClientEvent2.a("story_music_uri", localStory.g().d());
            localClientEvent2.a("action", "pause");
            ClientEvent localClientEvent3 = new ClientEvent(ClientEvent.Event.V, ClientEvent.SubEvent.I);
            localClientEvent3.a("story_id", localStory.e());
            localClientEvent3.a("story_music_uri", localStory.g().d());
            locala.a(localSubView, localClientEvent1, localClientEvent2, localClientEvent3);
            locale.c().a(locala);
            locale.findViewById(2131362348).setTag(localStory);
            locale.setVisibility(0);
          case 5:
          case 4:
          case 3:
          case 2:
          }
        }
      }
      while (true)
      {
        j++;
        break;
        str1 = localStory.h();
        break label142;
        label725: if (TextUtils.isEmpty(localStory.n()))
        {
          str2 = localStory.i();
          break label173;
        }
        str2 = localStory.n();
        break label173;
        label756: localBoolean = Boolean.valueOf(true);
        break label224;
        label765: Context localContext = getContext();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localStory.m();
        str3 = localContext.getString(2131689918, arrayOfObject);
        break label268;
        label801: locale.a(localCharSequence, null);
        break label286;
        label812: locale.a(null, null);
        locale.b().setVisibility(8);
        break label338;
        localDrawable = this.d;
        k = 1;
        break label393;
        localDrawable = this.c;
        k = 1;
        break label393;
        localDrawable = this.a;
        k = 0;
        break label393;
        localDrawable = this.e;
        k = 0;
        break label393;
        locale.setVisibility(4);
        locale.setTag(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
