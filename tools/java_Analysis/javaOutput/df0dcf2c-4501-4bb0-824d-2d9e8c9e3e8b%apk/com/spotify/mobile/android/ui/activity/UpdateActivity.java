package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dv;

public class UpdateActivity extends BaseFragmentActivity
{
  private Uri n;
  private com.spotify.mobile.android.ui.actions.c o = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);

  public UpdateActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.n = getIntent().getData();
    if (paramBundle != null)
      this.n = Uri.parse(paramBundle.getString("update_uri"));
    setContentView(2130903261);
    a(dv.a(this, ViewUri.as));
    com.spotify.mobile.android.ui.actions.c.a(this, ViewUri.as, true);
    ((Button)findViewById(2131362050)).setOnClickListener(new UpdateActivity.1(this));
    ((Button)findViewById(2131362051)).setOnClickListener(new UpdateActivity.2(this));
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("update_uri", this.n.toString());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.UpdateActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
