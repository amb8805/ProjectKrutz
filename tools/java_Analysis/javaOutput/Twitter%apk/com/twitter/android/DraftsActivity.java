package com.twitter.android;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.twitter.android.client.g;
import com.twitter.android.client.j;

public class DraftsActivity extends BaseFragmentActivity
{
  j a;

  public DraftsActivity()
  {
  }

  public final void b(int paramInt)
  {
    if (paramInt == 2131165255)
    {
      showDialog(1);
      return;
    }
    super.b(paramInt);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903059, true);
    c(2131427537);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("account_name");
    if (paramBundle == null)
    {
      DraftsFragment localDraftsFragment = new DraftsFragment();
      localDraftsFragment.setArguments(DraftsFragment.a(localIntent, false));
      getSupportFragmentManager().beginTransaction().add(2131165245, localDraftsFragment).commit();
    }
    if (TextUtils.isEmpty(str))
    {
      this.a = this.e.f();
      return;
    }
    this.a = this.e.b(str);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    fp localfp = new fp(this);
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    }
    return new AlertDialog.Builder(this).setTitle(2131427611).setIcon(17301659).setMessage(2131427612).setPositiveButton(2131427505, localfp).setNegativeButton(2131427506, null).create();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.DraftsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
