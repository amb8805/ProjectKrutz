package com.spotify.mobile.android.ui.fragments;

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.d.a.a;
import com.d.a.j;
import com.d.b.c;
import com.spotify.mobile.android.ui.view.l;

public final class p extends Fragment
{
  private static final String[] b = { "connected", "can_connect" };
  private static boolean f;
  private static boolean g;
  private Handler Y = new Handler();
  private Runnable Z = new p.2(this);
  o<Cursor> a = new p.3(this);
  private a aa;
  private View c;
  private TextView d;
  private boolean e;
  private int h;
  private Runnable i = new p.1(this);

  public p()
  {
  }

  private void a(float paramFloat)
  {
    if (this.aa != null)
      this.aa.b();
    View localView = this.c;
    c localc = l.a;
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = ((l)this.c.getLayoutParams()).b;
    arrayOfFloat[1] = paramFloat;
    this.aa = j.a(localView, localc, arrayOfFloat);
    this.aa.a(j().getInteger(2131558417));
    this.aa.a();
  }

  public static boolean b()
  {
    return f;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramViewGroup;
    View localView = paramLayoutInflater.inflate(2130903142, paramViewGroup, false);
    this.h = j().getInteger(2131558418);
    this.d = ((TextView)localView.findViewById(2131362256));
    this.e = true;
    return localView;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null)
    {
      this.Y.postDelayed(this.Z, j().getInteger(2131558403));
      return;
    }
    this.Y.post(this.Z);
  }

  public final void y()
  {
    this.Y.removeCallbacks(this.Z);
    this.Y.removeCallbacks(this.i);
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
