package com.spotify.mobile.android.service.flow.login;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.service.u;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ct;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.concurrent.TimeUnit;

public class p extends d
{
  private Button a;
  private String b;
  private String c;
  private boolean d;
  private boolean e;
  private int f;
  private u g;
  private dt h;

  public p()
  {
  }

  private void D()
  {
    if (!this.d)
    {
      this.e = true;
      this.a.setEnabled(false);
      this.a.setText(2131690027);
      v().findViewById(2131362400).setVisibility(0);
      return;
    }
    E().b();
  }

  private q E()
  {
    return (q)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  public static p a(com.spotify.mobile.android.service.flow.a.a parama, String paramString1, String paramString2, u paramu)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("username", paramString1);
    localBundle.putString("password", paramString2);
    paramu.a(localBundle);
    p localp = new p();
    localp.b_(localBundle);
    localp.a(parama);
    return localp;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Object localObject;
    if ((this.g.b()) && (!this.g.a()))
    {
      localObject = paramLayoutInflater.inflate(2130903153, paramViewGroup, false);
      this.a = ((Button)((View)localObject).findViewById(2131362050));
      return localObject;
    }
    View localView = paramLayoutInflater.inflate(2130903140, paramViewGroup, false);
    TextView localTextView = (TextView)localView.findViewById(2131362401);
    boolean bool = this.g.a();
    int i = 0;
    if (bool);
    while (true)
    {
      localTextView.setVisibility(i);
      localObject = localView;
      break;
      i = 8;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (1 != paramInt1);
    do
    {
      return;
      if (paramInt2 == 0)
      {
        E().a(this.b);
        return;
      }
      if (paramInt2 != -1)
        break;
      com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
      com.spotify.mobile.android.ui.actions.c.a(i(), this.h.c(), false);
    }
    while (this.f >= 10);
    E().a(this.b, this.c);
    this.f = (1 + this.f);
    return;
    Assertion.a("Unhandled resultCode from " + DisableOfflineModeActivity.class.getSimpleName() + " in " + p.class.getSimpleName());
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = g();
    this.g = new u(localBundle);
    this.b = localBundle.getString("username");
    this.c = localBundle.getString("password");
    E().a(this.b, this.c);
    this.f = 1;
    this.h = dv.a(i(), ViewUri.P, this.b);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.a.setOnClickListener(new p.1(this));
  }

  public final void a(e parame)
  {
    if ((!this.d) && (parame.b()))
    {
      new ct(i()).a(0);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("should_show_trial_start_notice", Boolean.valueOf(false));
      i().getContentResolver().update(w.a, localContentValues, null, null);
      this.d = true;
      if (!parame.d())
        break label102;
      E().b();
      if (this.e)
        E().b();
    }
    return;
    label102: FragmentActivity localFragmentActivity = i();
    localFragmentActivity.findViewById(2131362399).setVisibility(0);
    int i = parame.a();
    int j;
    String str2;
    label195: String str1;
    if (this.g.b())
    {
      j = (int)TimeUnit.HOURS.toDays(i);
      int k = j / 30;
      if (k > 0)
      {
        Resources localResources3 = j();
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(k);
        str2 = localResources3.getQuantityString(2131623965, k, arrayOfObject5);
        str1 = str2;
      }
    }
    while (true)
    {
      ((TextView)localFragmentActivity.findViewById(2131362315)).setText(str1);
      localFragmentActivity.findViewById(2131362398).setVisibility(8);
      break;
      if (i >= 48)
      {
        Resources localResources2 = j();
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(j);
        str2 = localResources2.getQuantityString(2131623963, j, arrayOfObject4);
        break label195;
      }
      Resources localResources1 = j();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i);
      str2 = localResources1.getQuantityString(2131623964, i, arrayOfObject3);
      break label195;
      if (i <= 48)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        str1 = a(2131690035, arrayOfObject2);
      }
      else
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i / 24);
        str1 = a(2131690034, arrayOfObject1);
      }
    }
  }

  protected final void a(SpotifyError paramSpotifyError)
  {
    if (SpotifyError.G.equals(paramSpotifyError))
    {
      a(new Intent(i(), DisableOfflineModeActivity.class), 1);
      return;
    }
    if (this.f < 10)
    {
      E().a(this.b, this.c);
      this.f = (1 + this.f);
      return;
    }
    Toast.makeText(i(), paramSpotifyError.a(i()), 1).show();
    E().a();
  }

  public final boolean b()
  {
    D();
    return true;
  }

  public final boolean b_()
  {
    return false;
  }

  public final void w()
  {
    super.w();
    this.h.a();
  }

  public final void x()
  {
    super.x();
    this.h.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
