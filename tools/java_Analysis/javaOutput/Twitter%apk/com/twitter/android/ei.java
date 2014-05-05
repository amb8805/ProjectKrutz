package com.twitter.android;

import ad;
import android.content.Intent;
import android.widget.EditText;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class ei extends i
{
  private ei(EditProfileActivity paramEditProfileActivity)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, ad paramad)
  {
    if ((this.a.b(paramString1)) && (paramInt == 200))
    {
      this.a.a.a(paramad);
      this.a.a.b(paramad.a, paramad.c);
    }
  }

  public final void c(j paramj, String paramString1, int paramInt, String paramString2, ad paramad)
  {
    this.a.dismissDialog(2);
    if (paramInt == 200)
    {
      paramj.a(paramad);
      Intent localIntent = new Intent();
      localIntent.putExtra("name", this.a.f.getText().toString());
      localIntent.putExtra("bio", this.a.g.getText().toString());
      localIntent.putExtra("web", this.a.h.getText().toString());
      localIntent.putExtra("loc", this.a.i.getText().toString());
      this.a.setResult(-1, localIntent);
      this.a.finish();
      return;
    }
    this.a.showDialog(3);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
