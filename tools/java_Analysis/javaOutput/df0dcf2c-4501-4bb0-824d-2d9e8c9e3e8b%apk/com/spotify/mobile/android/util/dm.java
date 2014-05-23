package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.collect.MapMaker;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import java.util.concurrent.ConcurrentMap;

public final class dm
{
  private static ConcurrentMap<Integer, Toast> a = new MapMaker().e().f();

  private static boolean A(Context paramContext)
  {
    Assertion.a(paramContext, "context is null");
    return paramContext == null;
  }

  public static void a(Context paramContext)
  {
    a(paramContext, 2131690338);
  }

  private static void a(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, 0, new Object[0]);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    if (A(paramContext))
      return;
    Context localContext = paramContext.getApplicationContext();
    if (paramArrayOfObject.length > 0);
    for (Toast localToast = Toast.makeText(localContext, localContext.getString(paramInt1, paramArrayOfObject), paramInt2); ; localToast = Toast.makeText(localContext, paramInt1, paramInt2))
    {
      localToast.show();
      return;
    }
  }

  private static void a(Context paramContext, SpotifyIcon paramSpotifyIcon, int paramInt)
  {
    try
    {
      boolean bool = A(paramContext);
      if (bool);
      while (true)
      {
        return;
        Toast localToast1 = (Toast)a.get(Integer.valueOf(paramInt));
        if (localToast1 != null)
          localToast1.cancel();
        View localView = LayoutInflater.from(paramContext).inflate(2130903260, null, false);
        TextView localTextView = (TextView)localView.findViewById(2131362227);
        localTextView.setText(paramInt);
        localTextView.setCompoundDrawablesWithIntrinsicBounds(null, new e(paramContext, paramSpotifyIcon, paramContext.getResources().getDimensionPixelSize(2131427434)), null, null);
        Toast localToast2 = new Toast(paramContext.getApplicationContext());
        localToast2.setView(localView);
        localToast2.setGravity(17, 0, 0);
        localToast2.setDuration(0);
        localToast2.show();
        a.put(Integer.valueOf(paramInt), localToast2);
      }
    }
    finally
    {
    }
  }

  public static void a(Context paramContext, SpotifyLink.LinkType paramLinkType)
  {
    int i;
    switch (dm.1.a[paramLinkType.ordinal()])
    {
    default:
      i = 2131690347;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      a(paramContext, i, 0, new Object[0]);
      return;
      i = 2131690344;
      continue;
      i = 2131690345;
      continue;
      i = 2131690348;
      continue;
      i = 2131690349;
      continue;
      i = 2131690346;
    }
  }

  public static void a(Context paramContext, String paramString)
  {
    a(paramContext, 2131690330, 1, new Object[] { paramString });
  }

  public static void a(Context paramContext, Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramThrowable.getMessage();
    a(paramContext, 2131690310, 1, arrayOfObject);
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2131690333; ; i = 2131690351)
    {
      a(paramContext, i, 0, new Object[0]);
      return;
    }
  }

  public static void b(Context paramContext)
  {
    a(paramContext, 2131690337);
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2131690316; ; i = 2131690317)
    {
      a(paramContext, i, 0, new Object[0]);
      return;
    }
  }

  public static void c(Context paramContext)
  {
    a(paramContext, 2131690341);
  }

  public static void c(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2131690322; ; i = 2131690350)
    {
      a(paramContext, i, 0, new Object[0]);
      return;
    }
  }

  public static void d(Context paramContext)
  {
    a(paramContext, 2131690343);
  }

  public static void e(Context paramContext)
  {
    a(paramContext, 2131690342);
  }

  public static void f(Context paramContext)
  {
    a(paramContext, 2131690321, 0, new Object[0]);
  }

  public static void g(Context paramContext)
  {
    a(paramContext, 2131690315, 1, new Object[0]);
  }

  public static void h(Context paramContext)
  {
    a(paramContext, 2131690340);
  }

  public static void i(Context paramContext)
  {
    a(paramContext, 2131690312, 1, new Object[0]);
  }

  public static void j(Context paramContext)
  {
    a(paramContext, 2131690306, 0, new Object[0]);
  }

  public static void k(Context paramContext)
  {
    a(paramContext, SpotifyIcon.l, 2131690307);
  }

  public static void l(Context paramContext)
  {
    a(paramContext, SpotifyIcon.aP, 2131690326);
  }

  public static void m(Context paramContext)
  {
    a(paramContext, 2131690332, 0, new Object[0]);
  }

  public static void n(Context paramContext)
  {
    a(paramContext, 2131690331, 0, new Object[0]);
  }

  public static void o(Context paramContext)
  {
    a(paramContext, 2131690314, 1, new Object[0]);
  }

  public static void p(Context paramContext)
  {
    a(paramContext, 2131690336, 1, new Object[0]);
  }

  public static void q(Context paramContext)
  {
    a(paramContext, 2131690309, 1, new Object[0]);
  }

  public static void r(Context paramContext)
  {
    if (!FeatureFragment.h.a())
      a(paramContext, 2131690308, 1, new Object[0]);
  }

  public static void s(Context paramContext)
  {
    a(paramContext, 2131690328, 1, new Object[0]);
  }

  public static void t(Context paramContext)
  {
    a(paramContext, 2131690327, 1, new Object[0]);
  }

  public static void u(Context paramContext)
  {
    a(paramContext, 2131690334, 1, new Object[0]);
  }

  public static void v(Context paramContext)
  {
    a(paramContext, 2131690335, 1, new Object[0]);
  }

  public static void w(Context paramContext)
  {
    a(paramContext, 2131690325, 1, new Object[0]);
  }

  public static void x(Context paramContext)
  {
    a(paramContext, 2131690323, 1, new Object[0]);
  }

  public static void y(Context paramContext)
  {
    a(paramContext, 2131690324, 0, new Object[0]);
  }

  public static void z(Context paramContext)
  {
    a(paramContext, 2131690313, 1, new Object[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
