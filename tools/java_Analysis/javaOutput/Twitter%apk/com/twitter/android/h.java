package com.twitter.android;

import android.view.View;
import android.widget.TextView;
import com.twitter.android.widget.NotchView;
import com.twitter.android.widget.TweetView;

final class h
{
  final TweetView a;
  private NotchView b;
  private TextView c;

  h(View paramView)
  {
    this.a = ((TweetView)paramView.findViewById(2131165222));
    this.b = ((NotchView)paramView.findViewById(2131165300));
    this.c = ((TextView)paramView.findViewById(2131165301));
  }

  public final void a(String paramString)
  {
    if (paramString != null)
    {
      if (this.b != null)
        this.b.setVisibility(0);
      this.c.setText(paramString);
      this.c.setVisibility(0);
      return;
    }
    if (this.b != null)
      this.b.setVisibility(8);
    this.c.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
