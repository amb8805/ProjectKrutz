package com.spotify.mobile.android.ui.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ap;

public final class j extends Fragment
{
  public j()
  {
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903148, paramViewGroup, false);
    ImageView localImageView1 = (ImageView)localView.findViewById(2131362411);
    TextView localTextView1 = (TextView)localView.findViewById(2131362412);
    TextView localTextView2 = (TextView)localView.findViewById(2131362413);
    ImageView localImageView2 = (ImageView)localView.findViewById(2131362414);
    Bundle localBundle = g();
    String str = localBundle.getString("showcase-spoticon");
    if (str != null)
    {
      SpotifyIcon localSpotifyIcon = SpotifyIcon.valueOf(str);
      localImageView1.setImageDrawable(new e(i(), localSpotifyIcon));
      localTextView1.setText(localBundle.getInt("showcase-title"));
      localTextView2.setText(localBundle.getInt("showcase-descr"));
      if (((ap)c.a(ap.class)).c() < j().getDimensionPixelSize(2131427476))
        break label194;
    }
    label194: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label200;
      localImageView2.setImageResource(localBundle.getInt("showcase-image"));
      localImageView2.setVisibility(0);
      return localView;
      localImageView1.setImageResource(localBundle.getInt("showcase-icon"));
      break;
    }
    label200: localImageView2.setVisibility(4);
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
