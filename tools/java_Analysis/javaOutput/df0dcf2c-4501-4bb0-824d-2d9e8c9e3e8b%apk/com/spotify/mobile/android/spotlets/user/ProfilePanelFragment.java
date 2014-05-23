package com.spotify.mobile.android.spotlets.user;

import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.b.a;
import com.spotify.mobile.android.ui.k;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class ProfilePanelFragment extends Fragment
{
  private TextView Y;
  private ProfilePanelFragment.ImageLoadingState Z = ProfilePanelFragment.ImageLoadingState.a;
  private String a;
  private View.OnClickListener aa = new ProfilePanelFragment.1(this);
  private View.OnClickListener ab = new ProfilePanelFragment.2(this);
  private com.squareup.picasso.f ac = new ProfilePanelFragment.3(this);
  private o<Cursor> ad = new ProfilePanelFragment.4(this);
  private o<Cursor> ae = new ProfilePanelFragment.5(this);
  private o<Cursor> af = new ProfilePanelFragment.6(this);
  private k ag = new ProfilePanelFragment.7(this);
  private boolean b;
  private String c;
  private String d;
  private int e;
  private View f;
  private View g;
  private ImageView h;
  private TextView i;

  public ProfilePanelFragment()
  {
  }

  private void a(String paramString1, String paramString2)
  {
    if (!TextUtils.equals(this.c, paramString1))
    {
      this.c = paramString1;
      this.i.setText(this.c);
    }
    if (!TextUtils.equals(this.d, paramString2))
    {
      this.d = paramString2;
      b();
    }
  }

  private void a(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.equals(this.a, paramString))
    {
      this.a = paramString;
      if (!TextUtils.isEmpty(this.a))
      {
        t().b(2131362153, null, this.ae);
        t().b(2131362151, null, this.af);
      }
    }
    this.b = paramBoolean;
    if ((this.Z == ProfilePanelFragment.ImageLoadingState.d) && (this.b) && (!TextUtils.isEmpty(this.d)))
      b();
  }

  private void b()
  {
    this.Z = ProfilePanelFragment.ImageLoadingState.b;
    Drawable localDrawable = com.spotify.mobile.android.ui.stuff.i.d(i());
    ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(this.d)).a(localDrawable).b(localDrawable).a(a.a()).a(this.h, this.ac);
  }

  private void b(int paramInt)
  {
    String str;
    TextView localTextView;
    if (this.e != paramInt)
    {
      this.e = paramInt;
      if (this.e <= 99)
        break label55;
      str = "99+";
      this.Y.setText(str);
      localTextView = this.Y;
      if (this.e <= 0)
        break label66;
    }
    label55: label66: for (int j = 0; ; j = 8)
    {
      localTextView.setVisibility(j);
      return;
      str = Integer.toString(this.e);
      break;
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup = (ViewGroup)paramLayoutInflater.inflate(2130903143, null);
    this.h = ((ImageView)localViewGroup.findViewById(2131362223));
    this.i = ((TextView)localViewGroup.findViewById(2131362300));
    this.Y = ((TextView)localViewGroup.findViewById(2131362405));
    this.f = localViewGroup.findViewById(2131362403);
    this.f.setOnClickListener(this.aa);
    this.g = localViewGroup.findViewById(2131362404);
    this.g.setOnClickListener(this.ab);
    if (paramBundle != null)
    {
      a(paramBundle.getString("username_key"), paramBundle.getBoolean("is_connected_key"));
      a(paramBundle.getString("profile_name_key"), paramBundle.getString("profile_image_uri_key"));
      b(paramBundle.getInt("unseen_messages_key"));
    }
    if ((i() instanceof MainActivity))
      ((MainActivity)i()).f().a(this.ag);
    return localViewGroup;
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    t().a(2131362152, null, this.ad);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("username_key", this.a);
    paramBundle.putBoolean("is_connected_key", this.b);
    paramBundle.putString("profile_name_key", this.c);
    paramBundle.putString("profile_image_uri_key", this.d);
    paramBundle.putInt("unseen_messages_key", this.e);
  }

  public final void e()
  {
    if ((i() instanceof MainActivity))
      ((MainActivity)i()).f().b(this.ag);
    super.e();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.ProfilePanelFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
