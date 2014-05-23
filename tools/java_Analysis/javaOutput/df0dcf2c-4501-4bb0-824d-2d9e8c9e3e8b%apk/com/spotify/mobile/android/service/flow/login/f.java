package com.spotify.mobile.android.service.flow.login;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dj;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.Locale;

public class f extends d
{
  private TextWatcher Y = new f.5(this);
  private dt a;
  private View b;
  private Button c;
  private EditText d;
  private EditText e;
  private TextView f;
  private com.spotify.mobile.android.ui.actions.c g = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private String h;
  private TextView.OnEditorActionListener i = new f.4(this);

  public f()
  {
  }

  private void E()
  {
    h localh = new h((byte)0);
    localh.a = dj.a(this.d);
    localh.b = dj.a(this.e);
    String str = localh.a.trim();
    if (str.length() == 0)
    {
      this.d.setError(a(2131690352));
      return;
    }
    if (localh.b.length() == 0)
    {
      this.e.setError(a(2131690320));
      return;
    }
    c(2131690027);
    D().a(str, localh.b);
  }

  public static f a(com.spotify.mobile.android.service.flow.a.a parama)
  {
    f localf = new f();
    localf.a(parama);
    return localf;
  }

  public static f a(com.spotify.mobile.android.service.flow.a.a parama, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("userName", paramString);
    f localf = new f();
    localf.a(parama);
    localf.b_(localBundle);
    return localf;
  }

  private void a(CharSequence paramCharSequence)
  {
    if (this.c == null)
      return;
    if (!com.spotify.android.paste.widget.f.a(this.c.getContext()))
      paramCharSequence = paramCharSequence.toString().toUpperCase(Locale.getDefault());
    this.c.setText(paramCharSequence);
  }

  private void c(int paramInt)
  {
    if (this.c == null)
      return;
    a(this.c.getContext().getString(paramInt));
  }

  public final g D()
  {
    return (g)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int j = 2130903138;
    if (!com.spotify.android.paste.widget.f.a(i()));
    for (int k = 1; ; k = 0)
    {
      if (k != 0)
        j = 2130903139;
      View localView = (View)cc.a(paramLayoutInflater.inflate(j, paramViewGroup, false));
      this.b = ((View)cc.a(localView.findViewById(2131362383)));
      this.c = ((Button)cc.a(localView.findViewById(2131362393)));
      this.d = ((EditText)cc.a(localView.findViewById(2131362387)));
      this.e = ((EditText)cc.a(localView.findViewById(2131362390)));
      this.f = ((TextView)cc.a(localView.findViewById(2131362395)));
      if (k != 0)
      {
        a(this.c.getText());
        TextView localTextView = (TextView)cc.a(localView.findViewById(2131362396));
        localTextView.setText(localTextView.getText().toString().toUpperCase(Locale.getDefault()));
      }
      return localView;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((1 == paramInt1) && (paramInt2 == -1))
    {
      com.spotify.mobile.android.ui.actions.c.a(i(), this.a.c(), false);
      E();
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = dv.b(i(), ViewUri.U);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.b.setOnClickListener(new f.1(this));
    this.e.setOnEditorActionListener(this.i);
    if (com.spotify.android.paste.widget.f.a(paramView.getContext()))
      this.e.setTypeface(Typeface.DEFAULT);
    this.c.setOnClickListener(new f.2(this));
    if (com.spotify.android.paste.widget.f.a(paramView.getContext()))
      this.f.setText(Html.fromHtml(a(2131690029)));
    this.f.setOnClickListener(new f.3(this));
    Bundle localBundle = g();
    if (localBundle != null)
      this.d.setText(localBundle.getString("userName"));
  }

  public final void a(e parame)
  {
    super.a(parame);
    if ((this.c == null) || (this.b == null))
      return;
    int j;
    View localView;
    if (parame.c())
    {
      j = 2131690027;
      c(j);
      localView = this.b;
      if (parame.c())
        break label64;
    }
    label64: for (boolean bool = true; ; bool = false)
    {
      localView.setEnabled(bool);
      return;
      j = 2131690028;
      break;
    }
  }

  protected final void a(SpotifyError paramSpotifyError)
  {
    super.a(paramSpotifyError);
    c(2131690028);
    if (SpotifyError.G.equals(paramSpotifyError))
    {
      a(new Intent(i(), DisableOfflineModeActivity.class), 1);
      return;
    }
    this.h = paramSpotifyError.a(i());
    Toast.makeText(i(), this.h, 1).show();
  }

  public final void w()
  {
    super.w();
    this.d.addTextChangedListener(this.Y);
    this.a.a();
  }

  public final void x()
  {
    super.x();
    this.d.removeTextChangedListener(this.Y);
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
