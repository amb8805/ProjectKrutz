package com.spotify.mobile.android.spotlets.collection.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.ds;
import java.util.Locale;

public final class a
{
  private static e a(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    e locale = new e(paramContext, paramSpotifyIcon, paramContext.getResources().getDimensionPixelSize(2131427413));
    locale.a(g.a(paramContext, 2130772376));
    return locale;
  }

  public static EmptyView a(Context paramContext)
  {
    return a(paramContext, 2131690121, a(paramContext, SpotifyIcon.aH));
  }

  private static EmptyView a(Context paramContext, int paramInt, e parame)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    localEmptyView.a(paramContext.getString(paramInt));
    localEmptyView.b(paramContext.getString(2131690115));
    if (ds.b(paramContext))
    {
      int i = d.b(16.0F, paramContext.getResources());
      localEmptyView.setPadding(localEmptyView.getPaddingLeft(), i, localEmptyView.getPaddingRight(), i);
    }
    while (true)
    {
      Button localButton = h.b(paramContext, localEmptyView);
      localButton.setId(2131362050);
      localButton.setText(2131690116);
      localButton.setSingleLine(true);
      localButton.setEllipsize(TextUtils.TruncateAt.END);
      localEmptyView.a(localButton);
      localButton.setOnClickListener(new a.1(paramContext));
      return localEmptyView;
      localEmptyView.a(parame);
    }
  }

  public static EmptyView a(Context paramContext, View.OnClickListener paramOnClickListener)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    localEmptyView.a(paramContext.getString(2131690124));
    localEmptyView.b(paramContext.getString(2131690122));
    if (ds.b(paramContext))
    {
      int i = d.b(16.0F, paramContext.getResources());
      localEmptyView.setPadding(localEmptyView.getPaddingLeft(), i, localEmptyView.getPaddingRight(), i);
    }
    while (true)
    {
      Button localButton = h.b(paramContext, localEmptyView);
      localButton.setId(2131362050);
      localButton.setText(2131690123);
      localButton.setSingleLine(true);
      localButton.setEllipsize(TextUtils.TruncateAt.END);
      localEmptyView.a(localButton);
      localButton.setOnClickListener(paramOnClickListener);
      return localEmptyView;
      localEmptyView.a(a(paramContext, SpotifyIcon.z));
    }
  }

  public static EmptyView a(Context paramContext, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, paramOnClickListener1, paramOnClickListener2, true);
  }

  private static EmptyView a(Context paramContext, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2, boolean paramBoolean)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    localEmptyView.a(paramContext.getString(2131690114, new Object[] { "" }));
    if (ds.a(paramContext))
    {
      localEmptyView.a(i.a(paramContext));
      a(paramContext, localEmptyView);
    }
    LinearLayout localLinearLayout1 = new LinearLayout(paramContext);
    int i;
    Button localButton1;
    label183: Button localButton2;
    LinearLayout.LayoutParams localLayoutParams2;
    int k;
    if (paramBoolean)
    {
      i = 0;
      localLinearLayout1.setOrientation(i);
      localLinearLayout1.setGravity(1);
      localLinearLayout1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      localButton1 = h.d(paramContext, localLinearLayout1);
      boolean bool1 = ds.b(paramContext);
      int j = 0;
      if (bool1)
      {
        DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
        boolean bool2 = localDisplayMetrics.widthPixels / localDisplayMetrics.density < 600.0F;
        j = 0;
        if (bool2)
          j = 1;
      }
      if (j == 0)
        break label420;
      localButton1.setText(paramContext.getString(2131689489).toUpperCase(Locale.getDefault()));
      localButton1.setSingleLine(true);
      localButton1.setId(2131362050);
      localButton1.setOnClickListener(paramOnClickListener1);
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localButton1.getLayoutParams();
      localLayoutParams1.width = paramContext.getResources().getDimensionPixelSize(2131427412);
      if (paramBoolean)
        localLayoutParams1.weight = 1.0F;
      localButton1.setLayoutParams(localLayoutParams1);
      localButton2 = h.b(paramContext, localLinearLayout1);
      localButton2.setId(2131362051);
      localButton2.setOnClickListener(paramOnClickListener2);
      localButton2.setText(paramContext.getString(2131690112).toUpperCase(Locale.getDefault()));
      localButton2.setSingleLine(true);
      localButton2.setEllipsize(TextUtils.TruncateAt.END);
      localLayoutParams2 = (LinearLayout.LayoutParams)localButton2.getLayoutParams();
      localLayoutParams2.width = paramContext.getResources().getDimensionPixelSize(2131427412);
      k = paramContext.getResources().getDimensionPixelSize(2131427411);
      if (!paramBoolean)
        break label430;
      localLayoutParams2.leftMargin = k;
      localLayoutParams2.weight = 1.0F;
    }
    while (true)
    {
      localButton2.setLayoutParams(localLayoutParams2);
      localLinearLayout1.addView(localButton1);
      localLinearLayout1.addView(localButton2);
      localEmptyView.a(localLinearLayout1);
      LinearLayout localLinearLayout2 = (LinearLayout)localEmptyView.e().getParent();
      LinearLayout.LayoutParams localLayoutParams3 = (LinearLayout.LayoutParams)localLinearLayout2.getLayoutParams();
      localLayoutParams3.width = -1;
      localLinearLayout2.setLayoutParams(localLayoutParams3);
      return localEmptyView;
      i = 1;
      break;
      label420: localButton1.setText(2131690113);
      break label183;
      label430: localLayoutParams2.topMargin = k;
    }
  }

  public static EmptyView a(Context paramContext, String paramString)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    localEmptyView.a(paramContext.getString(2131690128, new Object[] { paramString }));
    localEmptyView.b(paramContext.getString(2131690127));
    localEmptyView.a(a(paramContext, SpotifyIcon.D));
    return localEmptyView;
  }

  private static void a(Context paramContext, EmptyView paramEmptyView)
  {
    int i = paramContext.getResources().getDimensionPixelSize(2131427414);
    paramEmptyView.d().setScaleType(ImageView.ScaleType.CENTER_CROP);
    paramEmptyView.a(i);
    paramEmptyView.a();
  }

  private static void a(EmptyView paramEmptyView)
  {
    paramEmptyView.b().setSingleLine(false);
    paramEmptyView.b().setEllipsize(null);
    paramEmptyView.c().setSingleLine(false);
    paramEmptyView.c().setEllipsize(null);
  }

  public static EmptyView b(Context paramContext)
  {
    return a(paramContext, 2131690119, a(paramContext, SpotifyIcon.b));
  }

  public static EmptyView b(Context paramContext, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, paramOnClickListener1, paramOnClickListener2, false);
  }

  public static EmptyView c(Context paramContext)
  {
    return a(paramContext, 2131690120, a(paramContext, SpotifyIcon.d));
  }

  public static EmptyView d(Context paramContext)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    if (ds.a(paramContext))
    {
      localEmptyView.a(i.b(paramContext));
      a(paramContext, localEmptyView);
    }
    localEmptyView.a(paramContext.getString(2131690110));
    localEmptyView.b(paramContext.getString(2131690107));
    return localEmptyView;
  }

  public static EmptyView e(Context paramContext)
  {
    EmptyView localEmptyView = new EmptyView(paramContext);
    a(localEmptyView);
    localEmptyView.a(paramContext.getString(2131690118));
    localEmptyView.b(paramContext.getString(2131690117));
    if (!ds.b(paramContext))
      localEmptyView.a(a(paramContext, SpotifyIcon.Z));
    return localEmptyView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
