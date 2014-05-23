package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.android.router.Player;
import com.spotify.cosmos.android.router.PlayerState;
import java.util.ArrayList;
import java.util.List;

public class CosmosTestFragment extends Fragment
  implements g
{
  private String Y;
  private Button Z;
  private String aa;
  private Button ab;
  private Button ac;
  private Spinner ad;
  private Spinner ae;
  private TextView af;
  private ScrollView ag;
  private Subscription ah;
  private final String ai = "spotify:album:5NrFMOprmnMEf4gMnLaHcq";
  private final String aj = "spotify:album:2LFstTk3PGSZ8KbGknoFzE";
  private final String ak = "spotify:artist:12VaqyEhgwDRuFfEqbnrpz";
  private final String al = "spotify:user:napstersean:playlist:3vxotOnOGDlZXyzJPLFnm2";
  private final List<String> am = new ArrayList();
  private boolean an;
  private boolean ao;
  private Handler b;
  private Resolver c;
  private Player d;
  private Subscription e;
  private String f;
  private String g;
  private String h;
  private String i;

  static
  {
    if (!CosmosTestFragment.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public CosmosTestFragment()
  {
  }

  private void a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(this.af.getText()))
      this.af.append("\n");
    this.af.append("[" + paramString1 + "] " + paramString2);
    this.ag.post(new CosmosTestFragment.5(this));
  }

  private void b()
  {
    this.d.pause(new CosmosTestFragment.17(this, this.b));
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903133, paramViewGroup, false);
    if ((!a) && (localView == null))
      throw new AssertionError();
    this.f = a(2131689842);
    this.g = a(2131689844);
    this.Y = a(2131689840);
    this.aa = a(2131689839);
    localView.findViewById(2131362364).setOnClickListener(new CosmosTestFragment.7(this));
    this.ab = ((Button)localView.findViewById(2131362365));
    this.ab.setOnClickListener(new CosmosTestFragment.8(this));
    this.Z = ((Button)localView.findViewById(2131362371));
    this.Z.setOnClickListener(new CosmosTestFragment.9(this));
    this.h = a(2131689838);
    this.i = a(2131689835);
    this.ac = ((Button)localView.findViewById(2131362369));
    this.ac.setOnClickListener(new CosmosTestFragment.10(this));
    this.ad = ((Spinner)localView.findViewById(2131362366));
    ArrayAdapter localArrayAdapter1 = ArrayAdapter.createFromResource(i(), 2131165185, 17367049);
    localArrayAdapter1.setDropDownViewResource(17367049);
    this.ad.setAdapter(localArrayAdapter1);
    this.ad.setOnItemSelectedListener(new CosmosTestFragment.11(this));
    this.ae = ((Spinner)localView.findViewById(2131362367));
    ArrayAdapter localArrayAdapter2 = ArrayAdapter.createFromResource(i(), 2131165184, 17367049);
    this.ae.setAdapter(localArrayAdapter2);
    this.ae.setOnItemSelectedListener(new CosmosTestFragment.20(this));
    localView.findViewById(2131362370).setOnClickListener(new CosmosTestFragment.21(this));
    localView.findViewById(2131362368).setOnClickListener(new CosmosTestFragment.3(this));
    localView.findViewById(2131362372).setOnClickListener(new CosmosTestFragment.4(this));
    this.ag = ((ScrollView)localView.findViewById(2131362373));
    this.af = ((TextView)localView.findViewById(2131362374));
    return localView;
  }

  public final String a(Context paramContext)
  {
    return "Cosmos Test";
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.b = new Handler(Looper.getMainLooper());
    this.c = new DeferredResolver("main", i());
    this.d = new Player(this.c);
    this.c.registerConnectionCallback(new CosmosTestFragment.1(this));
    this.d.subscribe(new CosmosTestFragment.2(this, this.b, PlayerState.class));
    this.c.connect();
    this.am.add("spotify:track:7vzczp2f2qK3YywNkZ2uo5");
    this.am.add("spotify:track:5z2YdsdkDtaYNbbNLguNlC");
    this.am.add("spotify:track:4zztp85oS36ijgAWwyhX8p");
    this.am.add("spotify:track:1n46BBFHozz6jDufJ81BDT");
    this.am.add("spotify:track:0i7Hh51R5z3Y32tJPFV54V");
    this.am.add("spotify:track:1RjUaJM9aKGixVZlbcFUZv");
  }

  public final void y()
  {
    this.c.destroy();
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.CosmosTestFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
