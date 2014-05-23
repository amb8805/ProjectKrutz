package com.spotify.mobile.android.service.flow.login;

import android.widget.Button;
import android.widget.ProgressBar;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.ec;
import com.spotify.mobile.android.util.ei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class j
  implements ei
{
  private final boolean b;

  j(NewSignUpFragment paramNewSignUpFragment, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final void a()
  {
    if (!NewSignUpFragment.h(this.a));
    while (NewSignUpFragment.k(this.a).getVisibility() != 0)
      return;
    NewSignUpFragment.a(this.a, false);
    NewSignUpFragment.q(this.a);
  }

  public final void a(ArrayList<String> paramArrayList, Map<String, String> paramMap)
  {
    if (!NewSignUpFragment.h(this.a))
      return;
    NewSignUpFragment.a(NewSignUpFragment.e(this.a), (CharSequence)paramMap.get("email"));
    NewSignUpFragment.a(NewSignUpFragment.n(this.a), (CharSequence)paramMap.get("username"));
    NewSignUpFragment.a(this.a, ImmutableList.a(paramArrayList));
    NewSignUpFragment.a(this.a, paramArrayList);
    NewSignUpFragment.a(this.a, false);
  }

  public final void a(ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    if (!NewSignUpFragment.h(this.a));
    do
    {
      return;
      NewSignUpFragment.a(NewSignUpFragment.e(this.a));
      NewSignUpFragment.a(NewSignUpFragment.n(this.a));
      NewSignUpFragment.a(this.a, ImmutableList.a(paramArrayList));
      NewSignUpFragment.a(this.a, paramArrayList);
      NewSignUpFragment.a(this.a, false);
    }
    while (!this.b);
    NewSignUpFragment.j(this.a).setEnabled(false);
    cw localcw = cw.a(this.a.i());
    int i = localcw.a(NewSignUpFragment.a, -2147483648);
    if (i != -2147483648)
    {
      NewSignUpFragment.a(this.a, "Test it!");
      HashMap localHashMap = new HashMap();
      String str1 = localcw.a(NewSignUpFragment.b, null);
      String str2 = localcw.a(NewSignUpFragment.c, null);
      String str3 = localcw.a(NewSignUpFragment.d, null);
      String str4 = localcw.a(NewSignUpFragment.e, null);
      if (str1 != null)
        localHashMap.put("email", str1);
      if (str2 != null)
        localHashMap.put("username", str2);
      if (str3 != null)
        localHashMap.put("birthdate", str3);
      if (str4 != null)
        localHashMap.put("gender", str4);
      localcw.a().a(NewSignUpFragment.a).a(NewSignUpFragment.b).a(NewSignUpFragment.c).a(NewSignUpFragment.d).a(NewSignUpFragment.e).a();
      NewSignUpFragment.o(this.a).a(i, localHashMap);
      return;
    }
    if (paramBoolean)
    {
      NewSignUpFragment.p(this.a);
      return;
    }
    NewSignUpFragment.a(this.a, new j.1(this));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
