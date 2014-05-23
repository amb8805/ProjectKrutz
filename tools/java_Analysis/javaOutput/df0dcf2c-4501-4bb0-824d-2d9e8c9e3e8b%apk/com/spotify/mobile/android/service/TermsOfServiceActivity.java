package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.service.flow.FlowActivity;
import com.spotify.mobile.android.service.flow.a.i;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dk;

public class TermsOfServiceActivity extends FlowActivity
{
  public TermsOfServiceActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramString);
    localIntent.setClass(paramContext, TermsOfServiceActivity.class);
    localIntent.putExtra("intent", null);
    localIntent.addFlags(536870912);
    return localIntent;
  }

  public void onCreate(Bundle paramBundle)
  {
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755249);
    String str;
    while (true)
    {
      super.onCreate(paramBundle);
      setContentView(2130903066);
      str = getIntent().getAction();
      bp.b("Recived intent with action %s", new Object[] { str });
      if (!"com.spotify.mobile.android.service.action.introflow.TOS".equals(str))
        break;
      a(i.a(getIntent().getStringArrayExtra("licenses")));
      return;
      setTheme(2131755258);
    }
    throw new RuntimeException("Intent action " + str + " is invalid.");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.TermsOfServiceActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
