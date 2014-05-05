package com.twitter.android;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Data;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.aj;
import com.twitter.android.provider.p;
import com.twitter.android.provider.r;
import com.twitter.android.service.j;
import com.twitter.android.widget.UserView;
import com.twitter.android.widget.l;
import cr;
import java.util.ArrayList;
import java.util.HashSet;

public class UsersFragment extends BaseListFragment
  implements l
{
  long a;
  long b;
  ArrayList c;
  fc d;
  String e;
  private HashSet f;
  private Uri g;
  private int h;
  private long[] r;
  private boolean s;
  private gi t;
  private String[] u;
  private String v;

  public UsersFragment()
  {
  }

  private void b(int paramInt)
  {
    if (e(paramInt))
      return;
    String str1;
    switch (this.h)
    {
    case 8:
    case 10:
    default:
      str1 = this.j.a(this.o, d(paramInt), 0);
    case 1:
    case 2:
    case 4:
    case 6:
    case 5:
    case 9:
    case 7:
    case 3:
    case 11:
    case 12:
    }
    while (true)
    {
      f(paramInt);
      if (str1 == null)
        break;
      a(str1, paramInt);
      return;
      str1 = this.j.a(this.o, d(paramInt), 1);
      continue;
      str1 = this.j.a(i(paramInt));
      continue;
      str1 = this.j.a(this.h, this.o, this.b, d(paramInt));
      continue;
      str1 = this.j.a(this.h, this.o, this.b, d(paramInt));
      continue;
      str1 = this.j.a(true, d(paramInt));
      continue;
      if (paramInt != 3)
        break;
      getLoaderManager().initLoader(1, null, this);
      str1 = null;
      continue;
      String str2 = getArguments().getString("query");
      str1 = this.j.a(str2, i(paramInt), 20);
      continue;
      str1 = this.j.a(null, null, this.r, this.h, this.b);
    }
  }

  private int d(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
    case 2:
    case 3:
      return 0;
    case 1:
    }
    Cursor localCursor = this.l.getCursor();
    if (localCursor != null)
    {
      if (localCursor.getCount() > 0)
        return 1;
      return 0;
    }
    return 0;
  }

  private int i(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
    case 2:
    case 3:
      return 1;
    case 1:
    }
    Cursor localCursor = this.l.getCursor();
    if (localCursor != null)
    {
      if (localCursor.getCount() > 0)
        return 1 + localCursor.getCount() / 20;
      return 1;
    }
    return 1;
  }

  protected final Dialog a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      bn localbn = new bn(this);
      return new AlertDialog.Builder(getActivity()).setTitle(2131427421).setIcon(17301659).setMessage(2131427422).setPositiveButton(2131427505, localbn).setNegativeButton(2131427506, null).create();
    case 2:
    }
    bl localbl = new bl(this);
    return new AlertDialog.Builder(getActivity()).setTitle(2131427424).setIcon(17301659).setMessage(2131427425).setPositiveButton(2131427505, localbl).setNegativeButton(2131427506, null).create();
  }

  protected final void a(Cursor paramCursor)
  {
    if ((9 != this.h) && (paramCursor.getInt(1) == 0) && (paramCursor.getCount() < 400))
      b(1);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    if (1 == paramLoader.getId())
    {
      if (paramCursor == null)
      {
        if (this.d != null)
          this.d.a(0);
        return;
      }
      if (paramCursor.getCount() > 0)
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        StringBuilder localStringBuilder = new StringBuilder();
        int i = PhoneNumberUtils.getFormatTypeForLocale(getResources().getConfiguration().locale);
        while (paramCursor.moveToNext())
          if ("vnd.android.cursor.item/phone_v2".equals(paramCursor.getString(1)))
          {
            String str = paramCursor.getString(0);
            switch (i)
            {
            default:
            case 1:
            case 2:
            }
            while (true)
            {
              int j = str.length();
              for (int k = 0; k < j; k++)
              {
                char c1 = str.charAt(k);
                if (PhoneNumberUtils.isISODigit(c1))
                  localStringBuilder.append(c1);
              }
              localStringBuilder.append("+1");
              continue;
              localStringBuilder.append((char)'+');
            }
            localArrayList1.add(localStringBuilder.toString());
            localStringBuilder.delete(0, localStringBuilder.length());
          }
          else
          {
            localArrayList2.add(paramCursor.getString(0));
          }
        String[] arrayOfString1 = new String[localArrayList1.size()];
        String[] arrayOfString2 = new String[localArrayList2.size()];
        localArrayList1.toArray(arrayOfString1);
        localArrayList2.toArray(arrayOfString2);
        a(this.j.a(arrayOfString2, arrayOfString1, null, 7, -1L), 3);
        return;
      }
      if (this.d != null)
        this.d.a(0);
      c(3);
      return;
    }
    super.a(paramLoader, paramCursor);
    if ((this.l.isEmpty()) || (this.h == 7))
    {
      b(3);
      return;
    }
    if (this.d != null)
      this.d.a(paramCursor.getCount());
    c(3);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int i = paramListView.getHeaderViewsCount();
    if ((i > 0) && (paramInt <= i - 1))
    {
      Intent localIntent2 = (Intent)paramListView.getItemAtPosition(paramInt);
      if (localIntent2 != null)
        startActivity(localIntent2);
    }
    while (true)
    {
      return;
      int j = paramListView.getFooterViewsCount();
      if ((j > 0) && (paramInt > paramListView.getCount() - j - 1))
      {
        Intent localIntent1 = (Intent)paramListView.getItemAtPosition(paramInt);
        if (localIntent1 != null)
          startActivity(localIntent1);
      }
      else
      {
        switch (paramListView.getChoiceMode())
        {
        default:
          if (paramLong > 0L)
          {
            startActivity(new Intent(getActivity(), ProfileActivity.class).putExtra("user_id", paramLong).putExtra("type", this.h));
            return;
          }
        case 1:
          if (this.t != null)
          {
            Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
            this.t.a(localCursor.getString(4));
            return;
          }
        case 2:
          String str = ((Cursor)paramListView.getItemAtPosition(paramInt)).getString(4);
          if (this.c.contains(str))
            this.c.remove(str);
          while (this.t != null)
          {
            this.t.a(this.c.size());
            return;
            this.c.add(str);
          }
        }
      }
    }
  }

  final void a(gi paramgi)
  {
    this.t = paramgi;
  }

  public final void a(UserView paramUserView, long paramLong)
  {
    switch (this.h)
    {
    default:
      if (paramUserView.isChecked())
      {
        if (!this.f.remove(Long.valueOf(paramLong)))
          this.j.c(paramLong);
        return;
      }
    case 4:
      this.a = paramLong;
      h(2);
      return;
    }
    this.f.add(Long.valueOf(paramLong));
  }

  public final void a_()
  {
    b(2);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity;
    Bundle localBundle;
    String[] arrayOfString1;
    String str;
    label126: String[] arrayOfString2;
    int i;
    if (this.l == null)
    {
      localFragmentActivity = getActivity();
      localBundle = getArguments();
      arrayOfString1 = p.a;
      if (this.p.getChoiceMode() == 0)
        break label238;
      str = "LOWER(username) ASC";
      switch (this.h)
      {
      case 10:
      default:
        this.g = ContentUris.withAppendedId(aj.h, this.o);
        arrayOfString2 = arrayOfString1;
        i = 0;
        label133: this.u = arrayOfString2;
        this.v = str;
        if (!localBundle.getBoolean("follow", false));
      case 0:
      case 1:
      case 2:
      case 4:
      case 6:
      case 5:
      case 7:
      case 9:
      case 8:
      case 3:
      case 11:
      case 12:
      }
    }
    for (int j = 2130837573; ; j = i)
    {
      if (9 == this.h)
      {
        g localg2 = this.j;
        if (this.q != 0);
        for (boolean bool2 = true; ; bool2 = false)
        {
          this.l = new cj(localFragmentActivity, 2, localg2, bool2, j, this, this.f, localBundle.getInt("follow_all_title", 0), localBundle.getInt("follow_all_subtitle", 0));
          this.p.setAdapter(this.l);
          return;
          label238: str = "_id ASC";
          break;
          this.g = ContentUris.withAppendedId(aj.f, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.g, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.e, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          if ((this.b > 0L) && (this.o > 0L))
            this.g = ContentUris.withAppendedId(aj.c, this.o);
          if (this.o != this.j.j())
            break label126;
          arrayOfString2 = arrayOfString1;
          i = 2130837804;
          break label133;
          this.g = ContentUris.withAppendedId(aj.j, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.b, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.i, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = r.a;
          arrayOfString2 = p.b;
          i = 0;
          str = null;
          break label133;
          this.g = ContentUris.withAppendedId(aj.k, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = aj.d;
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.l, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
          this.g = ContentUris.withAppendedId(aj.m, this.o);
          arrayOfString2 = arrayOfString1;
          i = 0;
          break label133;
        }
      }
      g localg1 = this.j;
      if (this.q != 0);
      for (boolean bool1 = true; ; bool1 = false)
      {
        this.l = new dd(localFragmentActivity, 2, localg1, bool1, j, this, this.f, localBundle.getInt("follow_all_title", 0), localBundle.getInt("follow_all_subtitle", 0));
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new bw(this, null);
    Bundle localBundle = getArguments();
    this.h = localBundle.getInt("type", -1);
    this.b = localBundle.getLong("tag", -1L);
    long[] arrayOfLong1 = localBundle.getLongArray("user_ids");
    if ((arrayOfLong1 != null) && (arrayOfLong1.length > 0))
      this.r = arrayOfLong1;
    this.s = localBundle.getBoolean("onboarding", false);
    this.f = new HashSet();
    if (paramBundle != null)
    {
      this.a = paramBundle.getLong("state_dialog_user");
      this.c = paramBundle.getStringArrayList("state_checked_users");
      this.r = paramBundle.getLongArray("state_user_ids");
      long[] arrayOfLong2 = paramBundle.getLongArray("state_added_followers");
      if (arrayOfLong2 != null)
      {
        int i = arrayOfLong2.length;
        for (int j = 0; j < i; j++)
        {
          long l = arrayOfLong2[j];
          this.f.add(Long.valueOf(l));
        }
      }
      this.e = paramBundle.getString("state_search_id");
    }
    while (true)
    {
      if (this.q == 2)
      {
        if (this.c == null)
          this.c = new ArrayList();
        if (this.t != null)
          this.t.a(this.c.size());
      }
      a(1, this);
      return;
      switch (this.h)
      {
      default:
        break;
      case 0:
        this.j.a(this.j.e(), j.i);
        break;
      case 1:
        this.j.a(this.j.e(), j.j);
        break;
      case 9:
        if (this.s)
          this.j.a(this.j.e(), j.O);
        else
          this.j.a(this.j.e(), j.af);
      }
    }
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    if (1 == paramInt)
      return new dc(getActivity(), ContactsContract.Data.CONTENT_URI, new String[] { "data1", "mimetype" }, "data1 NOT NULL AND (mimetype=? OR mimetype=?)", new String[] { "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2" }, null);
    String str;
    Object localObject;
    if (this.b > 0L)
    {
      String[] arrayOfString5 = new String[2];
      arrayOfString5[0] = Integer.toString(this.h);
      arrayOfString5[1] = Long.toString(this.b);
      str = "type=? AND tag=?";
      localObject = arrayOfString5;
    }
    while (true)
    {
      long l = getArguments().getLong("session_owner_id", this.j.j());
      return new dc(getActivity(), aa.a(this.g, l), this.u, str, (String[])localObject, this.v);
      if (this.r != null)
      {
        long[] arrayOfLong = this.r;
        int i = arrayOfLong.length;
        String[] arrayOfString4 = new String[i];
        StringBuilder localStringBuilder = new StringBuilder("user_id").append(" IN (?");
        arrayOfString4[0] = String.valueOf(arrayOfLong[0]);
        for (int j = 1; j < i; j++)
        {
          localStringBuilder.append(", ?");
          arrayOfString4[j] = String.valueOf(arrayOfLong[j]);
        }
        localStringBuilder.append(")");
        str = localStringBuilder.toString();
        localObject = arrayOfString4;
      }
      else
      {
        switch (this.h)
        {
        default:
          str = null;
          localObject = null;
          break;
        case 7:
          String[] arrayOfString3 = new String[1];
          arrayOfString3[0] = Long.toString(this.o);
          str = "friendship IS NULL OR friendship NOT IN (1,3) AND user_id!=?";
          localObject = arrayOfString3;
          break;
        case 9:
          if (this.f.isEmpty())
          {
            String[] arrayOfString2 = new String[1];
            arrayOfString2[0] = Long.toString(this.o);
            str = "friendship IS NULL OR friendship NOT IN (1,3) AND user_id!=?";
            localObject = arrayOfString2;
          }
          else
          {
            str = null;
            localObject = null;
          }
          break;
        case 3:
          String[] arrayOfString1 = new String[2];
          arrayOfString1[0] = Integer.toString(3);
          arrayOfString1[1] = this.e;
          str = "type=? AND tag=?";
          localObject = arrayOfString1;
        }
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onResume()
  {
    super.onResume();
    if (this.g != null)
    {
      if (((this.h != 3) && (this.l.getCursor() == null)) || (this.e != null))
      {
        f(3);
        f();
      }
      while (!this.l.isEmpty())
        return;
      b(3);
      return;
    }
    c(3);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putLong("state_dialog_user", this.a);
    if (this.c != null)
      paramBundle.putStringArrayList("state_checked_users", this.c);
    if (this.r != null)
      paramBundle.putLongArray("state_user_ids", this.r);
    long[] arrayOfLong = cr.b(this.f);
    if (arrayOfLong != null)
      paramBundle.putLongArray("state_added_followers", arrayOfLong);
    paramBundle.putString("state_search_id", this.e);
  }

  public void onStop()
  {
    long[] arrayOfLong = cr.b(this.f);
    if (arrayOfLong != null)
    {
      this.j.c(arrayOfLong);
      this.f.clear();
      if (this.s)
        switch (this.h)
        {
        case 8:
        default:
        case 7:
        case 9:
        case 6:
        }
    }
    while (true)
    {
      super.onStop();
      return;
      this.j.a(this.j.e(), j.P, arrayOfLong.length);
      continue;
      this.j.a(this.j.e(), j.Q, arrayOfLong.length);
      continue;
      this.j.a(this.j.e(), j.R, arrayOfLong.length);
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    Bundle localBundle = getArguments();
    if ((3 == this.h) && (localBundle.getBoolean("view_tweets", true)))
    {
      View localView2 = LayoutInflater.from(localFragmentActivity).inflate(2130903096, null);
      ((TextView)localView2.findViewById(2131165215)).setText(2131427684);
      this.p.addHeaderView(localView2, new Intent(localFragmentActivity, SearchTweetsActivity.class).putExtra("query", getArguments().getString("query")).putExtra("view_people", false), true);
    }
    if (localBundle.getBoolean("browse_categories", false))
    {
      View localView1 = LayoutInflater.from(localFragmentActivity).inflate(2130903048, null);
      this.p.addFooterView(localView1, new Intent(localFragmentActivity, SULActivity.class).putExtra("onboarding", this.s), true);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.UsersFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
