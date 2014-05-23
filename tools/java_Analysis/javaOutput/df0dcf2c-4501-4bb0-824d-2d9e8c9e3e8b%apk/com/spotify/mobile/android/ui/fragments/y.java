package com.spotify.mobile.android.ui.fragments;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.support.v4.app.c;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public final class y extends c
{
  dt Y;

  public y()
  {
  }

  public final Dialog b()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(2131689503);
    localBuilder.setMessage(2131689502);
    localBuilder.setPositiveButton(17039370, new y.1(this));
    this.Y = dv.b(i(), ViewUri.ay);
    this.Y.a();
    return localBuilder.create();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
