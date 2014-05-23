package com.spotify.mobile.android.spotlets.search.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.common.base.i;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.f;
import java.util.HashSet;
import java.util.Set;

public final class a
  implements d
{
  final Set<e> a = new HashSet();
  EditText b;
  final boolean c;
  final View d;
  final Drawable e;
  boolean f;
  private final ActionBar g;
  private final Context h;
  private final View i;
  private final Drawable j;

  public a(ActionBarActivity paramActionBarActivity, boolean paramBoolean)
  {
    this.c = f.a(paramActionBarActivity);
    this.h = ((Context)i.a(paramActionBarActivity));
    this.g = ((ActionBar)i.a(paramActionBarActivity.e()));
    ActionBar localActionBar = this.g;
    int k;
    if (this.c)
    {
      k = 2130903065;
      localActionBar.a(k);
      this.i = this.g.c();
      this.b = ((EditText)this.i.findViewById(2131362252));
      if (paramBoolean)
        this.b.setHint(2131690189);
      if (!this.c)
        break label220;
      this.d = this.i.findViewById(2131362253);
      this.e = null;
      this.j = null;
      label140: this.b.addTextChangedListener(new a.3(this));
      this.b.setOnEditorActionListener(new a.4(this));
      this.b.setOnFocusChangeListener(new a.5(this));
      if (!this.c)
        break label278;
      this.d.setOnClickListener(new a.1(this));
    }
    while (true)
    {
      a(false);
      return;
      k = 2130903064;
      break;
      label220: this.d = null;
      float f1 = paramActionBarActivity.getResources().getDimensionPixelSize(2131427354);
      this.j = new com.spotify.android.paste.graphics.e(paramActionBarActivity, SpotifyIcon.al, f1);
      this.e = new com.spotify.android.paste.graphics.e(paramActionBarActivity, SpotifyIcon.aP, f1);
      a();
      break label140;
      label278: this.b.setOnTouchListener(new a.2(this));
    }
  }

  static String a(Editable paramEditable)
  {
    if (paramEditable != null)
      return paramEditable.toString();
    return "";
  }

  final void a()
  {
    if (this.c)
      throw new AssertionError("Don't call updateDrawables in legacy theme!");
    if (this.b.length() > 0);
    for (Drawable localDrawable = this.e; ; localDrawable = null)
    {
      this.b.setCompoundDrawablesWithIntrinsicBounds(this.j, null, localDrawable, null);
      return;
    }
  }

  public final void a(e parame)
  {
    this.a.add(i.a(parame));
  }

  public final void a(String paramString)
  {
    this.b.setText(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.g.c() != this.i)
        this.g.a(this.i);
      this.g.a(true);
    }
    while (this.g.c() != this.i)
      return;
    this.g.a(false);
  }

  public final String b()
  {
    return a(this.b.getText());
  }

  public final void b(e parame)
  {
    this.a.remove(i.a(parame));
  }

  final void c()
  {
    this.b.getText().clear();
    d();
  }

  public final void d()
  {
    if ((Build.VERSION.SDK_INT < 11) && (this.b.isFocused()))
      this.b.clearFocus();
    this.b.requestFocus();
    ((InputMethodManager)this.h.getSystemService("input_method")).showSoftInput(this.b, 1);
  }

  public final void e()
  {
    if (this.g.c() == this.i)
      this.g.a(null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
