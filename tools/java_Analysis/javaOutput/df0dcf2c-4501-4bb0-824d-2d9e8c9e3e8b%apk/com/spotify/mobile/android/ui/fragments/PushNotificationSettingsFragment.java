package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.c.a.a.a;
import com.c.a.a.d;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.stuff.h;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.ed;
import com.spotify.mobile.android.util.eg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;

public class PushNotificationSettingsFragment extends Fragment
  implements g, eg
{
  private static final String a = PushNotificationSettingsFragment.class.getSimpleName();
  private ArrayList<String> Y = new ArrayList();
  private boolean Z;
  private Uri aa;
  private EmptyView ab;
  private final d ac = new PushNotificationSettingsFragment.1(this);
  private o<Cursor> ad = new PushNotificationSettingsFragment.2(this);
  private dt b;
  private ed c;
  private a d;
  private View e;
  private ListView f;
  private u g;
  private final LinkedHashMap<String, PushNotificationSettingsFragment.Notification> h = new LinkedHashMap();
  private boolean i = true;

  public PushNotificationSettingsFragment()
  {
  }

  private void b()
  {
    int j = 4;
    int m;
    int k;
    label71: EmptyView localEmptyView;
    if (this.f != null)
    {
      ListView localListView = this.f;
      if (this.i)
      {
        m = 0;
        localListView.setVisibility(m);
      }
    }
    else
    {
      if (this.e != null)
      {
        View localView = this.e;
        if ((!this.i) || (this.h.size() != 0) || (this.Z))
          break label108;
        k = 0;
        localView.setVisibility(k);
      }
      if (this.ab != null)
      {
        localEmptyView = this.ab;
        if (!this.i)
          break label114;
      }
    }
    while (true)
    {
      localEmptyView.setVisibility(j);
      return;
      m = j;
      break;
      label108: k = j;
      break label71;
      label114: j = 0;
    }
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903144, paramViewGroup, false);
    this.e = localView.findViewById(2131362406);
    this.f = ((ListView)localView.findViewById(2131362356));
    this.g = new u(this, i());
    this.g.a(this.h.values());
    this.f.setAdapter(this.g);
    this.ab = ((EmptyView)localView.findViewById(2131362407));
    h.a(i(), this.ab, a(2131690176));
    b();
    return localView;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690234);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    r();
    a_(true);
    FragmentActivity localFragmentActivity = i();
    this.d = new a();
    this.d.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    this.aa = Uri.parse(a(2131690177));
    this.c = ed.a(localFragmentActivity, localFragmentActivity.d());
    this.c.a(this.aa.toString(), this);
    if (paramBundle == null);
    for (Parcelable[] arrayOfParcelable = null; arrayOfParcelable != null; arrayOfParcelable = paramBundle.getParcelableArray("notifications"))
    {
      int j = arrayOfParcelable.length;
      for (int k = 0; k < j; k++)
      {
        PushNotificationSettingsFragment.Notification localNotification = (PushNotificationSettingsFragment.Notification)arrayOfParcelable[k];
        this.h.put(localNotification.a, localNotification);
      }
    }
    if ((paramBundle == null) || (paramBundle.getBoolean("connected")));
    for (boolean bool = true; ; bool = false)
    {
      this.i = bool;
      t().a(2131362157, null, this.ad);
      this.b = dv.a(localFragmentActivity, ViewUri.aM);
      return;
    }
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void a(PushNotificationSettingsFragment.Notification paramNotification, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      paramNotification.c = j;
      Uri localUri = this.aa.buildUpon().appendQueryParameter(paramNotification.a, Integer.toString(paramNotification.c)).build();
      this.d.b(localUri.toString(), this.ac);
      this.Y.add(paramNotification.a);
      return;
    }
  }

  public final void a_(Uri paramUri)
  {
    this.d.a(paramUri.toString(), this.ac);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putParcelableArray("notifications", this.g.a());
    paramBundle.putBoolean("connected", this.i);
  }

  public final void e()
  {
    super.e();
    this.e = null;
    this.f = null;
    this.g = null;
    this.ab = null;
  }

  public final void w()
  {
    super.w();
    this.b.a();
  }

  public final void x()
  {
    super.x();
    this.b.b();
  }

  public final void y()
  {
    super.y();
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
    }
    t().a(2131362157);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.PushNotificationSettingsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
