package com.twitter.android;

import android.content.Intent;
import android.widget.EditText;
import android.widget.ScrollView;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.widget.PopupEditText;
import java.util.ArrayList;

final class ch extends i
{
  private ch(SignUpActivity paramSignUpActivity)
  {
  }

  public final void a(com.twitter.android.client.j paramj, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    long l;
    if (this.a.b(paramString1))
      l = paramj.g();
    switch (paramInt)
    {
    default:
      this.a.a.a(l, com.twitter.android.service.j.M);
      this.a.dismissDialog(1);
      this.a.l = null;
      this.a.e();
      return;
    case 200:
      this.a.a.a(l, com.twitter.android.service.j.L);
      this.a.dismissDialog(1);
      Intent localIntent = (Intent)this.a.getIntent().getParcelableExtra("android.intent.extra.INTENT");
      if (localIntent != null)
        this.a.startActivity(localIntent);
      this.a.setResult(-1);
      this.a.finish();
      return;
    case 400:
      this.a.startActivity(new Intent(this.a, LoginActivity.class).putExtra("screen_name", this.a.f.getText().toString()).putExtra("password", this.a.g.getText().toString()));
      this.a.finish();
      return;
    case 403:
      this.a.dismissDialog(1);
      this.a.a(this.a.d, this.a.h, paramString2);
      Object localObject = null;
      if (paramString2 != null)
      {
        this.a.a.a(l, com.twitter.android.service.j.G);
        this.a.a(this.a.d, false);
        localObject = this.a.d;
      }
      this.a.a(this.a.e, this.a.i, paramString4);
      if (paramString4 != null)
      {
        this.a.a.a(l, com.twitter.android.service.j.I);
        this.a.a(this.a.e, false);
        if (localObject == null)
          localObject = this.a.e;
      }
      this.a.a(this.a.f, this.a.j, paramString3);
      if (paramString3 != null)
      {
        this.a.a.a(l, com.twitter.android.service.j.H);
        this.a.a(this.a.f, false);
        if (localObject == null)
          localObject = this.a.f;
      }
      this.a.a(this.a.g, this.a.k, paramString5);
      if (paramString5 != null)
      {
        this.a.a.a(l, com.twitter.android.service.j.J);
        this.a.a(this.a.g, false);
        if (localObject == null)
          localObject = this.a.g;
      }
      if (localObject != null)
      {
        ((EditText)localObject).requestFocus();
        ((ScrollView)this.a.findViewById(2131165304)).smoothScrollTo(0, ((EditText)localObject).getTop());
        return;
      }
      this.a.a.a(l, com.twitter.android.service.j.M);
      this.a.e();
      return;
    case 412:
    }
    this.a.a.a(l, com.twitter.android.service.j.K);
    this.a.l = paramString6;
    new ew(this.a).execute(new String[] { paramString7 });
  }

  public final void a(com.twitter.android.client.j paramj, String paramString1, int paramInt, String paramString2, ArrayList paramArrayList)
  {
    if (this.a.b(paramString1))
      switch (paramInt)
      {
      default:
      case 200:
      case 400:
      }
    while (true)
    {
      if (paramArrayList != null)
      {
        this.a.s.a(paramArrayList);
        if (this.a.b())
          this.a.f.a();
      }
      this.a.c();
      return;
      this.a.a(this.a.f, true);
      this.a.q = 1;
      this.a.a(this.a.f, this.a.j, null);
      continue;
      this.a.a(this.a.f, false);
      this.a.q = 0;
      this.a.a(this.a.f, this.a.j, paramString2);
    }
  }

  public final void h(com.twitter.android.client.j paramj, String paramString1, int paramInt, String paramString2)
  {
    boolean bool;
    if (this.a.b(paramString1))
    {
      if (paramInt != 200)
        break label80;
      bool = true;
      this.a.a(this.a.e, bool);
      if (!bool)
        break label86;
      this.a.p = 1;
      this.a.a(this.a.e, this.a.i, null);
    }
    while (true)
    {
      this.a.c();
      return;
      label80: bool = false;
      break;
      label86: this.a.p = 0;
      this.a.a(this.a.e, this.a.i, paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
