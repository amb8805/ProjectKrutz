package com.spotify.android.paste.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;

public final class b
{
  private Context a;
  private int b;
  private CharSequence c;
  private CharSequence d;
  private View e;
  private CharSequence f;
  private CharSequence g;
  private DialogInterface.OnClickListener h;
  private DialogInterface.OnClickListener i;
  private DialogInterface.OnCancelListener j;
  private DialogInterface.OnDismissListener k;
  private boolean l = true;

  public b(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
  }

  public final a a()
  {
    a locala = new a(this.a, this.b);
    locala.setCancelable(this.l);
    locala.setOnCancelListener(this.j);
    locala.setOnDismissListener(this.k);
    DialogLayout localDialogLayout = new DialogLayout(locala.getContext());
    if (this.f != null)
      localDialogLayout.a(this.f, new b.1(this, locala));
    if (this.g != null)
      localDialogLayout.b(this.g, new b.2(this, locala));
    if (this.c != null)
      localDialogLayout.a(this.c);
    if (this.d != null)
      localDialogLayout.b(this.d);
    if (this.e != null)
      localDialogLayout.a(this.e);
    a.a(locala, localDialogLayout.a());
    a.b(locala, localDialogLayout.b());
    locala.setContentView(localDialogLayout);
    return locala;
  }

  public final b a(int paramInt)
  {
    this.c = this.a.getResources().getText(paramInt);
    return this;
  }

  public final b a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.f = this.a.getResources().getText(paramInt);
    this.h = paramOnClickListener;
    return this;
  }

  public final b a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }

  public final b b()
  {
    this.l = false;
    return this;
  }

  public final b b(int paramInt)
  {
    this.d = this.a.getResources().getText(paramInt);
    return this;
  }

  public final b b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.g = this.a.getResources().getText(paramInt);
    this.i = paramOnClickListener;
    return this;
  }

  public final b b(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.app.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
