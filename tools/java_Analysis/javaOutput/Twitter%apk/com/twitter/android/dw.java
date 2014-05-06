package com.twitter.android;

import ag;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.widget.EditText;
import com.twitter.android.client.g;
import com.twitter.android.widget.PopupEditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class dw extends Handler
{
  dw(SignUpActivity paramSignUpActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      this.a.c();
      return;
      boolean bool2;
      if (this.a.d.length() > 0)
      {
        bool2 = true;
        label60: this.a.a(this.a.d, bool2);
        if (!bool2)
          break label105;
      }
      label105: for (this.a.o = 1; ; this.a.o = 0)
      {
        this.a.f();
        break;
        bool2 = false;
        break label60;
      }
      Editable localEditable2 = this.a.e.getText();
      if (ag.h.matcher(localEditable2).matches())
        this.a.a(this.a.a.f(localEditable2.toString()));
      while (true)
      {
        this.a.f();
        break;
        if (!this.a.e.hasFocus())
          this.a.a(this.a.e, this.a.i, this.a.getString(2131427686));
        this.a.p = 0;
      }
      Editable localEditable1 = this.a.f.getText();
      if (ag.i.matcher(localEditable1).matches())
      {
        this.a.a(this.a.a.a(localEditable1.toString(), null, null));
      }
      else
      {
        if (!this.a.f.hasFocus())
          this.a.a(this.a.f, this.a.j, this.a.getString(2131427687));
        this.a.q = 0;
        continue;
        if (this.a.g.length() >= 6);
        for (boolean bool1 = true; ; bool1 = false)
        {
          this.a.a(this.a.g, bool1);
          if (!bool1)
            break label384;
          this.a.r = 1;
          break;
        }
        label384: if (!this.a.g.hasFocus())
          this.a.a(this.a.g, this.a.k, this.a.getString(2131427688));
        this.a.r = 0;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
