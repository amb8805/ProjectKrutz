package com.twitter.android;

import ad;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl;
import com.twitter.android.client.g;
import com.twitter.android.provider.af;
import com.twitter.android.provider.ao;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.p;
import com.twitter.android.provider.r;
import com.twitter.android.service.j;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.ShadowTextView;
import com.twitter.android.widget.UserView;
import com.twitter.android.widget.l;
import cr;
import dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ProfileFragment extends BaseListFragment
  implements View.OnClickListener, l
{
  private ga A;
  private dm B;
  private RelativeLayout C;
  private TextView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private Uri H;
  private boolean I;
  private int J;
  SharedPreferences a;
  long b;
  int c = 0;
  boolean d;
  String e;
  ad f;
  ay g;
  private String h;
  private HashSet r;
  private boolean s;
  private CardRowView t;
  private ImageView u;
  private ShadowTextView v;
  private ImageButton w;
  private View x;
  private bv y;
  private ck z;

  public ProfileFragment()
  {
  }

  private void a(Bitmap paramBitmap)
  {
    ImageView localImageView = this.u;
    if (paramBitmap != null)
    {
      localImageView.setBackgroundDrawable(new BitmapDrawable(getResources(), paramBitmap));
      return;
    }
    localImageView.setBackgroundResource(2130837734);
  }

  private void a(ViewGroup paramViewGroup, int paramInt1, String paramString, int paramInt2)
  {
    View localView = paramViewGroup.findViewById(paramInt1);
    localView.setOnClickListener(this);
    ((TextView)localView.findViewById(2131165306)).setText(paramString.toUpperCase());
    ((TextView)localView.findViewById(2131165322)).setText(cr.a(getResources(), paramInt2));
  }

  private static void a(TextView paramTextView, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setText(paramString);
    paramTextView.setVisibility(0);
  }

  private void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.D.setText(this.e);
      return;
    }
    this.D.setText(paramString);
  }

  private void b(int paramInt)
  {
    if (this.j.h())
      if (this.I)
      {
        a(true, 2131427536);
        this.z.a(null);
      }
    while (true)
    {
      this.c = paramInt;
      this.x.setVisibility(8);
      this.C.setVisibility(0);
      return;
      int i;
      if ((paramInt & 0x1) != 0)
      {
        i = 1;
        label63: if (i == 0)
          break label144;
        a(true, 2131427535);
        label74: if ((paramInt & 0x2) == 0)
          break label154;
        TextView localTextView = this.E;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.e;
        localTextView.setText(getString(2131427601, arrayOfObject));
      }
      while (true)
      {
        if ((this.f.h) && (i == 0))
          break label184;
        this.z.a(this.f);
        break;
        i = 0;
        break label63;
        label144: a(true, 2131427534);
        break label74;
        label154: this.E.setText('@' + this.e);
      }
      label184: continue;
      a(false, 2131427534);
    }
  }

  private void k()
  {
    FragmentActivity localFragmentActivity = getActivity();
    this.z = new ck(localFragmentActivity);
    this.g = new ay(localFragmentActivity, 0, this.j);
    this.A = new ga(localFragmentActivity);
    this.B = new dm(localFragmentActivity, 0, this.j, 2130837573, this, this.r);
  }

  private void l()
  {
    ad localad = this.f;
    this.e = localad.g;
    this.b = localad.a;
    boolean bool;
    ImageView localImageView;
    if (this.b == this.j.e())
    {
      bool = true;
      this.I = bool;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.e;
      this.H = Uri.parse(getString(2131427336, arrayOfObject));
      CardRowView localCardRowView = this.t;
      a(this.F, localad.d);
      a(this.G, localad.e);
      ViewGroup localViewGroup = (ViewGroup)localCardRowView.findViewById(2131165371);
      Resources localResources = getResources();
      a(localViewGroup, 2131165323, localResources.getString(2131427363), localad.n);
      a(localViewGroup, 2131165324, localResources.getString(2131427370), localad.l);
      a(localViewGroup, 2131165325, localResources.getString(2131427371), localad.k);
      this.E.setText('@' + this.e);
      localImageView = (ImageView)localCardRowView.findViewById(2131165267);
      if (!localad.i)
        break label711;
      localImageView.setImageResource(2130837805);
      localImageView.setVisibility(0);
      label240: String str = localad.c;
      a(this.j.b(this.b, str));
      a(localad.b);
      if (!this.I)
        break label745;
      b(0);
    }
    while (true)
    {
      m();
      long l = this.b;
      FragmentActivity localFragmentActivity = getActivity();
      ga localga = this.A;
      if (localga == null)
      {
        k();
        localga = this.A;
      }
      localga.setNotifyOnChange(false);
      localga.clear();
      Intent localIntent1 = new Intent(localFragmentActivity, UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", l).putExtra("type", 0);
      localga.add(new el(localFragmentActivity.getString(2131427370), 0, localIntent1));
      Intent localIntent2 = new Intent(localFragmentActivity, UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", l).putExtra("type", 1);
      localga.add(new el(localFragmentActivity.getString(2131427371), 0, localIntent2));
      Intent localIntent3 = new Intent(localFragmentActivity, TimelineActivity.class).putExtra("owner_id", l).putExtra("type", 2);
      localga.add(new el(localFragmentActivity.getString(2131427368), 0, localIntent3));
      Intent localIntent4 = new Intent(localFragmentActivity, ListsActivity.class).putExtra("owner_id", l).putExtra("profile", true);
      localga.add(new el(localFragmentActivity.getString(2131427364), 0, localIntent4));
      if (this.I)
      {
        Intent localIntent5 = new Intent(localFragmentActivity, UsersActivity.class).putExtra("owner_id", l).putExtra("type", 2);
        localga.add(new el(localFragmentActivity.getString(2131427367), 0, localIntent5));
      }
      localga.notifyDataSetChanged();
      this.g.a(localad);
      this.B.a(localad);
      if (this.y == null)
      {
        BaseAdapter[] arrayOfBaseAdapter = new BaseAdapter[4];
        arrayOfBaseAdapter[0] = this.z;
        arrayOfBaseAdapter[1] = this.g;
        arrayOfBaseAdapter[2] = this.A;
        arrayOfBaseAdapter[3] = this.B;
        this.y = new bv(arrayOfBaseAdapter);
        this.p.setAdapter(this.y);
      }
      c(3);
      return;
      bool = false;
      break;
      label711: if (localad.h)
      {
        localImageView.setImageResource(2130837711);
        localImageView.setVisibility(0);
        break label240;
      }
      localImageView.setVisibility(8);
      break label240;
      label745: if (System.currentTimeMillis() < 300000L + localad.r)
      {
        b(localad.q);
      }
      else if ((0x1 & this.J) == 0)
      {
        this.j.a(this.b);
        this.J = (0x1 | this.J);
      }
    }
  }

  private void m()
  {
    if ((0x4 & this.J) == 0)
    {
      getLoaderManager().initLoader(2, null, this);
      this.J = (0x4 | this.J);
    }
    if ((0x10 & this.J) == 0)
    {
      getLoaderManager().initLoader(3, null, this);
      this.J = (0x10 | this.J);
    }
  }

  protected final Dialog a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      df localdf = new df(this);
      return new AlertDialog.Builder(getActivity()).setTitle(2131427421).setIcon(17301659).setMessage(2131427422).setPositiveButton(2131427505, localdf).setNegativeButton(2131427506, null).create();
    case 2:
      dg localdg = new dg(this);
      return new AlertDialog.Builder(getActivity()).setTitle(2131427414).setIcon(17301659).setMessage(2131427415).setPositiveButton(2131427505, localdg).setNegativeButton(2131427506, null).create();
    case 3:
      dh localdh = new dh(this);
      return new AlertDialog.Builder(getActivity()).setTitle(2131427413).setIcon(17301659).setMessage(2131427566).setPositiveButton(2131427505, localdh).setNegativeButton(2131427506, null).create();
    case 4:
      di localdi = new di(this);
      return new AlertDialog.Builder(getActivity()).setTitle(2131427548).setIcon(17301659).setMessage(2131427417).setPositiveButton(2131427505, localdi).setNegativeButton(2131427506, null).create();
    case 5:
    }
    ArrayList localArrayList = new ArrayList(4);
    boolean bool;
    if ((0x2 & this.c) != 0)
    {
      bool = true;
      if (bool)
        localArrayList.add(getString(2131427342));
      localArrayList.add(getString(2131427549));
      if (!this.d)
        break label407;
      localArrayList.add(getString(2131427413));
    }
    while (true)
    {
      localArrayList.add(getString(2131427548));
      cm localcm = new cm(this, bool, getActivity());
      String[] arrayOfString = new String[localArrayList.size()];
      localArrayList.toArray(arrayOfString);
      return new AlertDialog.Builder(getActivity()).setItems(arrayOfString, localcm).create();
      bool = false;
      break;
      label407: localArrayList.add(getString(2131427414));
    }
  }

  public final void a(ad paramad)
  {
    if (paramad.equals(this.f))
      return;
    this.f = paramad;
    l();
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    switch (paramLoader.getId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    do
    {
      do
        return;
      while ((paramCursor == null) || (!paramCursor.moveToFirst()));
      b(paramCursor.getInt(0));
      return;
      ((eh)this.g.c()).swapCursor(paramCursor);
      if (((eh)this.g.c()).getCursor().getCount() == 0)
      {
        a(this.j.a(1, this.b, 0L, 0L, 3), 3);
        return;
      }
      this.g.a(false);
      return;
      ((cj)this.B.c()).swapCursor(paramCursor);
    }
    while ((((cj)this.B.c()).getCursor().getCount() != 0) && ((!this.s) || (System.currentTimeMillis() <= 300000L + this.a.getLong("last_refresh", 0L))));
    b(this.j.a(false, 0, 6, this.b));
    this.s = false;
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (this.y == null);
    Intent localIntent1;
    do
    {
      Intent localIntent2;
      do
      {
        return;
        switch (this.y.a(paramInt - paramListView.getHeaderViewsCount()))
        {
        default:
          localIntent2 = (Intent)paramListView.getItemAtPosition(paramInt);
        case 2:
        }
      }
      while (localIntent2 == null);
      startActivity(localIntent2);
      return;
      localIntent1 = ((el)paramListView.getItemAtPosition(paramInt)).c;
    }
    while (localIntent1 == null);
    startActivity(localIntent1);
  }

  public final void a(UserView paramUserView, long paramLong)
  {
    if (paramUserView.isChecked())
    {
      if (!this.r.remove(Long.valueOf(paramLong)))
      {
        g localg = this.j;
        localg.c(paramLong);
        localg.a(this.j.e(), j.B);
      }
      return;
    }
    this.r.add(Long.valueOf(paramLong));
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    bl localbl = (bl)paramHashMap.get(Long.valueOf(this.b));
    if ((localbl != null) && (this.f != null) && (localbl.a.equals(this.f.c)))
      a(localbl.a());
    if (this.g != null)
      this.g.notifyDataSetChanged();
    if (this.B != null)
      this.B.notifyDataSetChanged();
  }

  final void a(boolean paramBoolean, int paramInt)
  {
    ShadowTextView localShadowTextView = this.v;
    ImageButton localImageButton = this.w;
    localShadowTextView.setEnabled(paramBoolean);
    localImageButton.setEnabled(paramBoolean);
    Resources localResources;
    if (paramInt > 0)
    {
      localShadowTextView.setText(paramInt);
      localResources = getResources();
      switch (paramInt)
      {
      default:
      case 2131427534:
      case 2131427535:
      case 2131427536:
      }
    }
    while (true)
    {
      int i = localResources.getDimensionPixelSize(2131492868);
      localShadowTextView.setPadding(i, 0, i, 0);
      if (this.b == this.j.j())
        break;
      localImageButton.setVisibility(0);
      return;
      localShadowTextView.setChecked(false);
      localShadowTextView.setCompoundDrawablesWithIntrinsicBounds(localResources.getDrawable(2130837706), null, null, null);
      localShadowTextView.setBackgroundDrawable(localResources.getDrawable(2130837574));
      continue;
      localShadowTextView.setChecked(true);
      localShadowTextView.setCompoundDrawables(null, null, null, null);
      localShadowTextView.setBackgroundDrawable(localResources.getDrawable(2130837574));
      continue;
      localShadowTextView.setCompoundDrawables(null, null, null, null);
      localShadowTextView.setBackgroundDrawable(localResources.getDrawable(2130837565));
    }
    localImageButton.setVisibility(8);
  }

  protected final boolean d_()
  {
    return this.p.getCount() - this.p.getFooterViewsCount() == 0;
  }

  final void h()
  {
    getLoaderManager().initLoader(1, null, this);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.g == null)
      k();
    Bundle localBundle = getArguments();
    boolean bool1;
    if (localBundle.getInt("type", 0) == 2)
    {
      bool1 = true;
      this.d = bool1;
      if (this.f == null)
        break label57;
      l();
    }
    label57: long l;
    do
    {
      return;
      bool1 = false;
      break;
      l = localBundle.getLong("user_id", 0L);
    }
    while (l <= 0L);
    if (l == this.j.e());
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.I = bool2;
      this.b = l;
      m();
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0)
      return;
    switch (paramInt1)
    {
    default:
      return;
    case 1:
      long l1 = paramIntent.getLongExtra("list_id", -1L);
      long l2 = paramIntent.getLongExtra("user_id", -1L);
      this.j.a(4, l1, l2);
      return;
    case 2:
    }
    a(paramIntent.getStringExtra("name"));
    a(this.F, paramIntent.getStringExtra("bio"));
    a(this.G, paramIntent.getStringExtra("web"));
  }

  public void onClick(View paramView)
  {
    if (this.f == null);
    String str1;
    do
    {
      return;
      switch (paramView.getId())
      {
      default:
        return;
      case 2131165258:
        startActivity(new Intent(getActivity(), ImageActivity.class).setData(this.H).putExtra("image_url", this.H.toString()).putExtra("android.intent.extra.TEXT", this.e));
        return;
      case 2131165373:
        if (this.b == this.j.j())
        {
          String str2 = String.valueOf(this.b);
          startActivityForResult(new Intent(getActivity(), EditProfileActivity.class).setData(ao.c.buildUpon().appendEncodedPath(str2).appendQueryParameter("ownerId", str2).build()), 2);
          return;
        }
        if ((0x1 & this.c) != 0)
        {
          h(1);
          return;
        }
        this.c = (0x1 | this.c);
        a(true, 2131427535);
        g localg = this.j;
        b(localg.a(this.b, false));
        localg.a(localg.e(), j.y);
        return;
      case 2131165374:
        h(5);
        return;
      case 2131165323:
        startActivity(new Intent(getActivity(), TimelineActivity.class).putExtra("owner_id", this.b).putExtra("type", 1));
        return;
      case 2131165324:
        startActivity(new Intent(getActivity(), UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.b).putExtra("type", 0));
        return;
      case 2131165325:
        startActivity(new Intent(getActivity(), UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.b).putExtra("type", 1));
        return;
      case 2131165368:
      }
      str1 = this.f.e;
    }
    while (str1 == null);
    BaseActivity.a(getActivity(), Uri.parse(str1));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new ar(this, null);
    this.a = getActivity().getSharedPreferences("profile_prefs", 0);
    this.r = new HashSet();
    if (paramBundle != null)
    {
      this.h = paramBundle.getString("state_dialog_text");
      long[] arrayOfLong = paramBundle.getLongArray("state_added_followers");
      if (arrayOfLong != null)
      {
        int i = arrayOfLong.length;
        for (int j = 0; j < i; j++)
        {
          long l = arrayOfLong[j];
          this.r.add(Long.valueOf(l));
        }
      }
      this.f = ((ad)paramBundle.getParcelable("state_user"));
      this.s = false;
    }
    while (true)
    {
      a(1, this);
      return;
      this.f = ((ad)getArguments().getParcelable("user"));
      this.s = true;
      this.j.a(this.j.e(), j.x);
    }
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      Uri localUri = ao.c.buildUpon().appendEncodedPath(String.valueOf(this.b)).appendQueryParameter("ownerId", String.valueOf(this.j.j())).build();
      return new dc(getActivity(), localUri, gd.a, null, null, null);
    case 2:
      Uri.Builder localBuilder2 = ContentUris.withAppendedId(af.b, this.b).buildUpon();
      localBuilder2.appendQueryParameter("limit", "3").appendQueryParameter("ownerId", String.valueOf(this.j.e()));
      return new CursorLoader(getActivity(), localBuilder2.build(), ax.c, null, null, "updated_at DESC, _id ASC");
    case 3:
    }
    Uri.Builder localBuilder1 = ContentUris.withAppendedId(r.b, this.b).buildUpon();
    localBuilder1.appendQueryParameter("limit", "3").appendQueryParameter("ownerId", String.valueOf(this.j.e()));
    String[] arrayOfString1;
    String str;
    if (this.r.isEmpty())
    {
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(this.b);
      arrayOfString1 = arrayOfString2;
      str = "friendship IS NULL OR friendship NOT IN (1,3) AND user_id!=?";
    }
    while (true)
    {
      return new CursorLoader(getActivity(), localBuilder1.build(), p.b, str, arrayOfString1, null);
      str = null;
      arrayOfString1 = null;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onLoaderReset(Loader paramLoader)
  {
    switch (paramLoader.getId())
    {
    default:
      return;
    case 2:
      ((eh)this.g.c()).swapCursor(null);
      return;
    case 3:
    }
    ((cj)this.B.c()).swapCursor(null);
  }

  public void onResume()
  {
    boolean bool1 = j();
    super.onResume();
    boolean bool2 = this.j.h();
    if ((bool1) && (!j()))
    {
      this.c = 0;
      h();
    }
    for (boolean bool3 = false; ; bool3 = bool2)
    {
      a(bool3, 0);
      if (this.f == null)
        f(3);
      return;
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("state_dialog_text", this.h);
    long[] arrayOfLong = cr.b(this.r);
    if (arrayOfLong != null)
      paramBundle.putLongArray("state_added_followers", arrayOfLong);
    if (this.f != null)
      paramBundle.putParcelable("state_user", this.f);
  }

  public void onStop()
  {
    long[] arrayOfLong = cr.b(this.r);
    if (arrayOfLong != null)
    {
      g localg = this.j;
      localg.c(arrayOfLong);
      localg.a(localg.e(), j.A, arrayOfLong.length);
      this.r.clear();
    }
    super.onStop();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    CardRowView localCardRowView = (CardRowView)LayoutInflater.from(getActivity()).inflate(2130903122, null);
    RelativeLayout localRelativeLayout = (RelativeLayout)localCardRowView.findViewById(2131165372);
    this.t = localCardRowView;
    this.u = ((ImageView)localCardRowView.findViewById(2131165258));
    this.u.setOnClickListener(this);
    this.v = ((ShadowTextView)localRelativeLayout.findViewById(2131165373));
    this.v.setOnClickListener(this);
    this.w = ((ImageButton)localRelativeLayout.findViewById(2131165374));
    this.w.setOnClickListener(this);
    this.D = ((TextView)localCardRowView.findViewById(2131165306));
    this.E = ((TextView)localCardRowView.findViewById(2131165375));
    this.F = ((TextView)localCardRowView.findViewById(2131165367));
    this.G = ((TextView)localCardRowView.findViewById(2131165368));
    this.G.setOnClickListener(this);
    this.C = localRelativeLayout;
    this.x = localCardRowView.findViewById(2131165269);
    ((ListView)paramView.findViewById(16908298)).addHeaderView(localCardRowView);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ProfileFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
