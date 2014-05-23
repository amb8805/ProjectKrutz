package com.spotify.mobile.android.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.common.base.i;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.util.ac;

public final class ActionBarManager
{
  private ActionBarActivity a;
  private ActionBar b;
  private View c;
  private Drawable d;
  private a e;
  private boolean f;
  private ActionBarTitle g;
  private ActionBarTitle h;
  private float i;
  private ActionBarManager.State j = ActionBarManager.State.b;

  public ActionBarManager(MainActivity paramMainActivity)
  {
    this.a = paramMainActivity;
    this.b = paramMainActivity.e();
    this.e = new a();
    this.c = paramMainActivity.findViewById(2131362516);
    ActionBarActivity localActionBarActivity = this.a;
    int[] arrayOfInt = new int[1];
    int k;
    if (ac.g)
    {
      k = 16843470;
      arrayOfInt[0] = k;
      TypedArray localTypedArray1 = localActionBarActivity.obtainStyledAttributes(arrayOfInt);
      int m = localTypedArray1.getResourceId(0, 0);
      localTypedArray1.recycle();
      TypedArray localTypedArray2 = this.a.obtainStyledAttributes(m, new int[] { 2130772082 });
      this.d = localTypedArray2.getDrawable(0);
      localTypedArray2.recycle();
      if (this.c == null)
        break label232;
      this.b.b(null);
      g.a(this.c, this.d);
    }
    while (true)
    {
      i.a(this.d);
      if (this.c != null)
        this.c.getLayoutParams().height = b(paramMainActivity);
      ((MainLayout)paramMainActivity.findViewById(2131362447)).a(new ActionBarManager.1(this, paramMainActivity));
      this.b.b();
      if (!f.a(this.a))
        break label246;
      this.b.a();
      return;
      k = 2130771972;
      break;
      label232: this.b.b(this.d);
    }
    label246: ActionBar localActionBar = this.b;
    Resources localResources = this.a.getResources();
    int n = d.b(24.0F, localResources);
    int i1 = d.b(12.0F, localResources);
    int i2 = d.b(8.0F, localResources);
    e locale = new e(this.a, SpotifyIcon.cq, n);
    locale.a(g.a(this.a, 2130772377));
    LayerDrawable localLayerDrawable = new LayerDrawable(new Drawable[] { locale });
    localLayerDrawable.setLayerInset(0, i1, 0, i2, 0);
    localActionBar.a(localLayerDrawable);
  }

  @TargetApi(19)
  public static void a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 19);
    while (!(paramContext instanceof Activity))
      return;
    ((Activity)paramContext).getWindow().addFlags(67108864);
  }

  public static int b(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    if (!paramContext.getTheme().resolveAttribute(2130771970, localTypedValue, true))
      return 0;
    int k = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramContext.getResources().getDisplayMetrics());
    int m;
    int i1;
    int i2;
    if ((Build.VERSION.SDK_INT >= 19) && ((paramContext instanceof Activity)) && ((0x4000000 & ((Activity)paramContext).getWindow().getAttributes().flags) != 0))
    {
      m = 1;
      if (m == 0)
        break label130;
      i1 = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
      if (i1 != 0)
        break label116;
      i2 = 0;
    }
    label102: for (int n = i2 + k; ; n = k)
    {
      return n;
      m = 0;
      break;
      label116: i2 = paramContext.getResources().getDimensionPixelSize(i1);
      break label102;
    }
  }

  private void b()
  {
    b(this.i);
  }

  public final void a(float paramFloat)
  {
    if (this.j == ActionBarManager.State.b)
      return;
    int k = (int)(paramFloat * ActionBarManager.State.a(ActionBarManager.State.b));
    this.d.setAlpha(k);
  }

  public final void a(ActionBarTitle paramActionBarTitle)
  {
    this.g = paramActionBarTitle;
    b();
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (ActionBarManager.State localState = ActionBarManager.State.a; ; localState = ActionBarManager.State.b)
    {
      this.j = localState;
      this.d.setAlpha(ActionBarManager.State.a(this.j));
      return;
    }
  }

  public final boolean a()
  {
    return this.f;
  }

  public final void b(float paramFloat)
  {
    boolean bool = false;
    float f1 = 1.0F;
    this.i = paramFloat;
    a(paramFloat);
    ActionBarTitle localActionBarTitle;
    if (paramFloat < 0.05F)
      localActionBarTitle = this.g;
    while (true)
    {
      if (this.f != bool)
      {
        this.f = bool;
        this.a.v_();
      }
      if (localActionBarTitle != null)
        localActionBarTitle.b(f1);
      this.a.e().a(localActionBarTitle);
      return;
      if (paramFloat < 0.5F)
      {
        localActionBarTitle = this.g;
        f1 -= (paramFloat - 0.05F) / 0.45F;
        bool = false;
      }
      else
      {
        localActionBarTitle = this.h;
        f1 = (paramFloat - 0.5F) / 0.5F;
        bool = true;
      }
    }
  }

  public final void b(ActionBarTitle paramActionBarTitle)
  {
    this.h = paramActionBarTitle;
    b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.ActionBarManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
