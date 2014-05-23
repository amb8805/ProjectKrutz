package com.spotify.mobile.android.ui.view;

import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;

final class p extends o
{
  private TextView b;
  private TextView c;

  public p(PlayerContentView paramPlayerContentView)
  {
    super((byte)0);
    this.b = ((TextView)paramPlayerContentView.findViewById(2131362314));
    Assertion.a(this.b);
    this.c = ((TextView)paramPlayerContentView.findViewById(2131362637));
    Assertion.a(this.c);
  }

  public final void a()
  {
    TextView localTextView1 = this.b;
    String str1 = PlayerContentView.d(this.a);
    boolean bool1 = PlayerContentView.a(this.a);
    if ((PlayerContentView.b(this.a)) || (PlayerContentView.c(this.a)));
    for (boolean bool2 = true; ; bool2 = false)
    {
      a(localTextView1, str1, bool1, bool2);
      TextView localTextView2 = this.c;
      String str2 = PlayerContentView.f(this.a);
      boolean bool3 = PlayerContentView.a(this.a);
      boolean bool4;
      if (!PlayerContentView.b(this.a))
      {
        boolean bool5 = PlayerContentView.c(this.a);
        bool4 = false;
        if (!bool5);
      }
      else
      {
        bool4 = true;
      }
      a(localTextView2, str2, bool3, bool4);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
