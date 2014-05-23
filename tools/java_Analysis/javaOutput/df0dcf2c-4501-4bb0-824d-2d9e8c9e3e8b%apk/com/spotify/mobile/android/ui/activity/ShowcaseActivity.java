package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import com.spotify.android.paste.widget.ViewPagerIndicator;
import com.spotify.mobile.android.util.c.b;
import com.spotify.mobile.android.util.c.e;
import com.spotify.mobile.android.util.ui.a;
import java.util.List;

public class ShowcaseActivity extends BaseFragmentActivity
{
  private ViewPager n;
  private k o;
  private Button p;
  private Button q;
  private e r;
  private List<b> s;

  public ShowcaseActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903074);
    this.o = new k(c());
    this.n = ((ViewPager)findViewById(2131362268));
    this.n.a(this.o);
    ViewPagerIndicator localViewPagerIndicator = (ViewPagerIndicator)findViewById(2131362269);
    localViewPagerIndicator.a(this.n);
    this.p = ((Button)findViewById(2131362270));
    this.p.setOnClickListener(new ShowcaseActivity.1(this));
    this.q = ((Button)findViewById(2131362271));
    this.q.setOnClickListener(new ShowcaseActivity.2(this));
    ShowcaseActivity.3 local3 = new ShowcaseActivity.3(this);
    this.r = new e(this);
    this.s = this.r.a();
    this.o.a(this.s);
    if (this.s.size() == 1)
    {
      this.p.setVisibility(4);
      this.q.setVisibility(0);
    }
    a locala = new a();
    locala.a(local3);
    locala.a(localViewPagerIndicator);
    this.n.a(locala);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.ShowcaseActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
