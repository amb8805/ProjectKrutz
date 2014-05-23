package com.spotify.mobile.android.ui.view;

import android.widget.TextView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.util.Assertion;

final class q extends o
{
  private TextView b;

  public q(PlayerContentView paramPlayerContentView)
  {
    super((byte)0);
    this.b = ((TextView)paramPlayerContentView.findViewById(2131362635));
    Assertion.a(this.b);
  }

  public final void a()
  {
    TextView localTextView = this.b;
    String str;
    boolean bool1;
    if ((f.a(this.a.getContext())) && (!PlayerContentView.f(this.a).equals(PlayerContentView.e(this.a))))
    {
      str = PlayerContentView.d(this.a) + " — " + PlayerContentView.f(this.a);
      bool1 = PlayerContentView.a(this.a);
      if ((!PlayerContentView.b(this.a)) && (!PlayerContentView.c(this.a)))
        break label125;
    }
    label125: for (boolean bool2 = true; ; bool2 = false)
    {
      a(localTextView, str, bool1, bool2);
      return;
      str = PlayerContentView.d(this.a);
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
