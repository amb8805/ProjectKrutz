package com.spotify.mobile.android.spotlets.suggestedtweet;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dq;

public class SuggestedTweetActivity extends BaseFragmentActivity
{
  private Button n;
  private Intent o;

  public SuggestedTweetActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent(paramContext, SuggestedTweetActivity.class);
    localIntent.putExtra("title", paramString1);
    localIntent.putExtra("body", paramString2);
    localIntent.putExtra("image_resource_id", 2130837858);
    localIntent.putExtra("tweet", paramString3);
    return localIntent;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 0)
    {
      setResult(-1);
      finish();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755252);
    Bundle localBundle;
    while (true)
    {
      super.onCreate(paramBundle);
      localBundle = getIntent().getExtras();
      String str = localBundle.getString("tweet");
      this.o = new dq(this).a(str);
      if (this.o != null)
        break;
      Assertion.b("Can't find Twitter");
      setResult(0);
      finish();
      return;
      setTheme(2131755260);
    }
    DialogLayout localDialogLayout = new DialogLayout(this);
    localDialogLayout.a(localBundle.getString("title"));
    localDialogLayout.b(localBundle.getString("body"));
    if (((ap)c.a(ap.class)).c() >= getResources().getDimensionPixelSize(2131427485));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        localDialogLayout.b(localBundle.getInt("image_resource_id"));
      this.n = h.b(this, localDialogLayout);
      this.n.setText(2131690305);
      this.n.setBackgroundResource(2130837793);
      this.n.setOnClickListener(new SuggestedTweetActivity.1(this));
      FrameLayout localFrameLayout = new FrameLayout(this);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(2131427484);
      if (i != 0)
        localLayoutParams.topMargin = localLayoutParams.bottomMargin;
      localFrameLayout.addView(this.n, localLayoutParams);
      localDialogLayout.a(localFrameLayout);
      setContentView(localDialogLayout);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.suggestedtweet.SuggestedTweetActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
