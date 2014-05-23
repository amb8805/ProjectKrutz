package com.twitter.android;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import be;
import cj;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.service.j;

final class bo
  implements View.OnClickListener
{
  bo(TweetListFragment paramTweetListFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.h == null);
    label415: 
    while (true)
    {
      return;
      g localg = this.a.j;
      ax localax = this.a.b(this.a.h.a);
      be localbe = localg.b(localax);
      String str1;
      if ((localbe != null) && (localbe.c != null))
      {
        str1 = localbe.c.a;
        switch (paramView.getId())
        {
        default:
        case 2131165346:
        case 2131165350:
        case 2131165349:
        case 2131165347:
        case 2131165348:
        case 2131165351:
        }
      }
      while (true)
      {
        if (this.a.h == null)
          break label415;
        this.a.a(null);
        return;
        str1 = null;
        break;
        Intent localIntent2 = new Intent(this.a.getActivity(), PostActivity.class);
        localIntent2.putExtra("reply_to_tweet", new ax[] { localax });
        localIntent2.setAction("com.twitter.android.post.reply");
        this.a.startActivity(localIntent2);
        localg.a(localg.e(), j.s);
        continue;
        this.a.startActivity(new Intent(this.a.getActivity(), ProfileActivity.class).putExtra("user_id", localax.n));
        continue;
        if (localax.l);
        for (String str2 = localg.c(localg.f(), localax.o, str1); ; str2 = localg.b(localg.f(), localax.o, str1))
        {
          this.a.b(str2);
          localg.a(localg.e(), j.v);
          break;
        }
        FragmentActivity localFragmentActivity = this.a.getActivity();
        long l = localg.j();
        boolean bool = localax.a(l);
        am localam = new am(this, bool, localax, localg, str1, l, localFragmentActivity);
        g.a(this.a.getActivity(), bool, localam).show();
        continue;
        this.a.g = localax;
        this.a.h(1);
        continue;
        Intent localIntent1 = localg.d(localax.e, localax.d);
        this.a.startActivity(localIntent1);
        localg.a(localg.e(), j.w);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
