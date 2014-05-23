package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.n;
import android.text.TextWatcher;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class CreateRenamePlaylistActivity extends BaseFragmentActivity
{
  final TextWatcher n = new CreateRenamePlaylistActivity.1(this);
  final View.OnClickListener o = new CreateRenamePlaylistActivity.2(this);
  final View.OnClickListener p = new CreateRenamePlaylistActivity.3(this);
  private final String[] q = { "name" };
  private EditText r;
  private Button s;
  private Button t;
  private e u;
  private String v;
  private String w;
  private String x;

  public CreateRenamePlaylistActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = d(paramContext, "com.spotify.mobile.android.ui.activity.action.ADD_TRACK_TO_NEW_PLAYLIST");
    localIntent.putExtra("uri", paramString);
    return localIntent;
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = a(paramContext, paramString1);
    localIntent.putExtra("folder_uri", paramString2);
    return localIntent;
  }

  public static Intent b(Context paramContext, String paramString)
  {
    Intent localIntent = d(paramContext, "com.spotify.mobile.android.ui.activity.action.RENAME");
    localIntent.putExtra("uri", paramString);
    return localIntent;
  }

  public static Intent c(Context paramContext, String paramString)
  {
    Intent localIntent = d(paramContext, "com.spotify.mobile.android.ui.activity.action.CREATE_PLAYLIST");
    localIntent.putExtra("folder_uri", paramString);
    return localIntent;
  }

  private static Intent d(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramString);
    localIntent.setClass(paramContext, CreateRenamePlaylistActivity.class);
    return localIntent;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject1;
    Object localObject2;
    label167: Button localButton;
    if (((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
    {
      setTheme(2131755249);
      DialogLayout localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      this.v = getIntent().getAction();
      if (paramBundle != null)
        this.v = paramBundle.getString("action");
      this.w = getIntent().getStringExtra("uri");
      if (paramBundle != null)
        this.w = paramBundle.getString("uri");
      this.x = getIntent().getStringExtra("folder_uri");
      if (paramBundle != null)
        this.x = paramBundle.getString("folder_uri");
      if (!"com.spotify.mobile.android.ui.activity.action.CREATE_PLAYLIST".equals(this.v))
        break label327;
      localObject1 = getResources().getString(2131689852);
      localObject2 = getResources().getString(2131689849);
      this.u = new b(this, this.x);
      localDialogLayout.a((java.lang.CharSequence)localObject1);
      localDialogLayout.a((java.lang.CharSequence)localObject2, this.p);
      localDialogLayout.b(2131689848, this.o);
      this.s = localDialogLayout.b();
      this.t = localDialogLayout.a();
      this.r = h.a(this);
      this.r.setInputType(16384);
      this.r.setImeOptions(6);
      this.r.setSingleLine(true);
      this.r.setHint(2131689853);
      this.r.addTextChangedListener(this.n);
      localDialogLayout.a(this.r);
      localButton = this.s;
      if (this.r.getText().toString().trim().length() <= 0)
        break label681;
    }
    label681: for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      a(dv.a(this, ViewUri.W));
      return;
      setTheme(2131755258);
      break;
      label327: if ("com.spotify.mobile.android.ui.activity.action.CREATE_FOLDER".equals(this.v))
      {
        localObject1 = getResources().getString(2131689845);
        localObject2 = getResources().getString(2131689849);
        this.u = new a(this, this.x);
        break label167;
      }
      if ("com.spotify.mobile.android.ui.activity.action.RENAME".equals(this.v))
      {
        Assertion.a(this.w, "Don't start this activity to rename a playlist without specifying the playlist uri");
        SpotifyLink localSpotifyLink = new SpotifyLink(this.w);
        Object localObject3;
        switch (CreateRenamePlaylistActivity.4.a[localSpotifyLink.a().ordinal()])
        {
        default:
          Assertion.a("Got unepexted link type: " + localSpotifyLink.a());
          localObject3 = null;
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          Assertion.a(localObject3, "Uri is neither a folder nor a playlist.");
          String str = getResources().getString(2131689850);
          this.u = new f(this, this.w);
          d().a(2131362113, null, new d(this, this.w));
          localObject1 = localObject3;
          localObject2 = str;
          break;
          localObject3 = getResources().getString(2131689846);
          continue;
          localObject3 = getResources().getString(2131689854);
        }
      }
      if ("com.spotify.mobile.android.ui.activity.action.ADD_TRACK_TO_NEW_PLAYLIST".equals(this.v))
      {
        localObject1 = getResources().getString(2131689851);
        localObject2 = getResources().getString(2131689847);
        Assertion.a(this.w, "Don't start this activity to create a playlist and adding tracks without specifying the track uri to add");
        this.u = new c(this, this.w, this.x);
        break label167;
      }
      throw new RuntimeException("Intent action " + this.v + " is invalid.");
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("action", this.v);
    paramBundle.putString("uri", this.w);
    paramBundle.putString("folder_uri", this.x);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.CreateRenamePlaylistActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
