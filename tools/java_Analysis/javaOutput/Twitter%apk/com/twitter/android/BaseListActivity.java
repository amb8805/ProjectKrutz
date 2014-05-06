package com.twitter.android;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ar;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.RefreshableListView;
import com.twitter.android.widget.m;
import com.twitter.android.widget.p;
import com.twitter.android.widget.r;
import dz;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public class BaseListActivity extends ListActivity
  implements AbsListView.OnScrollListener, ar, m, p
{
  protected g a;
  protected i b;
  protected CursorAdapter c;
  protected Navbar d;
  private boolean e;
  private boolean f;
  private eu g;
  private int h;
  private boolean i;
  private boolean j;
  private Activity k;
  private int l;
  private int m;
  private View n;
  private View o;
  private ProgressBar p;
  private TextView q;
  private ArrayList r;

  public BaseListActivity()
  {
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      getListView().setVisibility(8);
      this.n.setVisibility(0);
      this.o.setVisibility(8);
      this.p.setVisibility(0);
    }
    ListView localListView;
    do
    {
      return;
      this.o.setVisibility(0);
      this.p.setVisibility(8);
      localListView = getListView();
    }
    while (localListView.getCount() - localListView.getHeaderViewsCount() - localListView.getFooterViewsCount() <= 0);
    this.n.setVisibility(8);
    localListView.setVisibility(0);
  }

  private int c(int paramInt)
  {
    if ((!isFinishing()) && (this.a.a()))
    {
      if (this.g == null)
        this.g = eu.a(this);
      return this.g.a(paramInt);
    }
    return 0;
  }

  private void d()
  {
    Object localObject = this.k;
    if (localObject == null)
      localObject = this;
    Intent localIntent = new Intent(this, HomeTabActivity.class);
    localIntent.setFlags(67108864);
    startActivity(localIntent);
    ((Activity)localObject).finish();
  }

  private void e()
  {
    if (this.c != null)
      this.c.notifyDataSetChanged();
  }

  public final void a()
  {
    c(0);
  }

  protected final void a(int paramInt)
  {
    if (this.k != null)
      return;
    this.q.setText(getString(2131427531));
  }

  protected final void a(Bundle paramBundle, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.onCreate(paramBundle);
    setContentView(2130903082);
    g localg = g.a(this);
    this.a = localg;
    this.j = true;
    if (!localg.h())
    {
      if (getParent() == null)
        StartActivity.a(this, getIntent());
      return;
    }
    View localView = findViewById(16908292);
    this.o = localView.findViewById(2131165241);
    this.p = ((ProgressBar)localView.findViewById(2131165242));
    this.n = localView;
    this.k = getParent();
    ListView localListView = getListView();
    localListView.setOnScrollListener(this);
    this.f = false;
    String str;
    label175: Navbar localNavbar;
    if (paramBundle != null)
    {
      this.l = paramBundle.getInt("scroll_pos");
      this.m = paramBundle.getInt("scroll_off");
      this.r = paramBundle.getParcelableArrayList("pending_reqs");
      str = getIntent().getAction();
      if (!"android.intent.action.PICK".equals(str))
        break label293;
      localListView.setChoiceMode(1);
      localg.a(1, this);
      localNavbar = (Navbar)findViewById(2131165246);
      if (this.k != null)
        break label321;
      if (localNavbar != null)
      {
        localNavbar.a(this);
        localNavbar.setVisibility(0);
        this.q = ((TextView)localNavbar.findViewById(2131165215));
        if (!this.a.h())
          localNavbar.a(8, new int[] { 2131165255, 2131165284 });
      }
    }
    while (true)
    {
      this.d = localNavbar;
      return;
      this.l = 0;
      this.m = 0;
      this.r = new ArrayList(5);
      break;
      label293: if ("com.twitter.android.pick_multiple".equals(str))
      {
        localListView.setChoiceMode(2);
        break label175;
      }
      localListView.setChoiceMode(0);
      break label175;
      label321: if (localNavbar != null)
        localNavbar.setVisibility(8);
    }
  }

  public void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.h == 2)
    {
      this.i = true;
      return;
    }
    e();
    this.i = false;
  }

  public final void a_(boolean paramBoolean)
  {
  }

  public final int b(long paramLong)
  {
    return 0;
  }

  public final void b()
  {
    c(2);
  }

  public void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2131165215:
      d();
      return;
    case 2131165284:
      onSearchRequested();
      return;
    case 2131165255:
    }
    Intent localIntent = new Intent(this, PostActivity.class);
    localIntent.setAction("com.twitter.android.post.status");
    startActivity(localIntent);
  }

  protected final void b(String paramString)
  {
    if (this.k != null)
      return;
    this.q.setText(paramString);
  }

  public final void c()
  {
    CursorAdapter localCursorAdapter = this.c;
    if (localCursorAdapter != null)
    {
      Cursor localCursor = localCursorAdapter.getCursor();
      if (localCursor != null)
        localCursor.requery();
    }
  }

  protected final void c(String paramString)
  {
    this.r.add(new dp(paramString));
  }

  protected final dp d(String paramString)
  {
    ArrayList localArrayList = this.r;
    int i1 = 0;
    int i2 = localArrayList.size();
    while (i1 < i2)
    {
      if (((dp)localArrayList.get(i1)).a.equals(paramString))
        return (dp)localArrayList.remove(i1);
      i1++;
    }
    return null;
  }

  public final r g()
  {
    return new r(0, 0L, 0);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getWindow().setFormat(1);
  }

  protected void onCreate(Bundle paramBundle)
  {
    throw new IllegalArgumentException("You must call the multiple parameter versions of this method");
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    if ((this.a.h()) && (getParent() == null))
      getMenuInflater().inflate(2131755008, paramMenu);
    return bool;
  }

  protected void onDestroy()
  {
    if (this.a != null)
      this.a.b(1, this);
    if (this.g != null)
      this.g.a();
    if ((this.c != null) && (this.c.getCursor() != null))
      this.c.changeCursor(null);
    super.onDestroy();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165395:
    }
    d();
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    g localg = this.a;
    if ((localg != null) && (this.b != null))
      localg.b(this.b);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    super.onPrepareOptionsMenu(paramMenu);
    MenuItem localMenuItem;
    if ((this.a.h()) && (getParent() == null))
    {
      localMenuItem = paramMenu.findItem(2131165395);
      if (getListView().getChoiceMode() != 0)
        break label57;
    }
    label57: for (boolean bool = true; ; bool = false)
    {
      localMenuItem.setVisible(bool);
      return true;
    }
  }

  protected void onResume()
  {
    super.onResume();
    if (this.c != null)
    {
      Cursor localCursor = this.c.getCursor();
      if (localCursor != null)
        localCursor.requery();
    }
    this.a = g.a(this);
    if ((this.j) && (!this.a.h()))
    {
      StartActivity.a(this);
      return;
    }
    if (this.b != null)
      this.a.a(this.b);
    int i1 = this.r.size() - 1;
    if (i1 >= 0)
    {
      dp localdp = (dp)this.r.get(i1);
      if (this.a.h(localdp.a))
      {
        switch (localdp.b)
        {
        default:
        case 1:
        case 2:
        case 4:
        case 3:
        }
        while (true)
        {
          i1--;
          break;
          if (this.f)
          {
            ((RefreshableListView)getListView()).a(true);
            continue;
            if (this.f)
            {
              this.e = true;
              ((RefreshableListView)getListView()).a();
              c(1);
              continue;
              b(true);
            }
          }
        }
      }
      switch (localdp.b)
      {
      default:
      case 3:
      case 2:
      case 4:
      case 1:
      }
      while (true)
      {
        this.r.remove(localdp);
        break;
        b(false);
        continue;
        if (this.f)
        {
          this.e = false;
          ((RefreshableListView)getListView()).b();
          c(2);
          continue;
          if (this.f)
            ((RefreshableListView)getListView()).a(false);
        }
      }
    }
    getListView().setSelectionFromTop(this.l, this.m);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelableArrayList("pending_reqs", this.r);
    ListView localListView = getListView();
    int i1 = localListView.getFirstVisiblePosition();
    View localView = localListView.getChildAt(0);
    if (localView != null);
    for (int i2 = localView.getTop(); ; i2 = 0)
    {
      this.l = i1;
      this.m = i2;
      paramBundle.putInt("scroll_pos", this.l);
      paramBundle.putInt("scroll_off", this.m);
      return;
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == 0);
    Cursor localCursor;
    do
    {
      do
      {
        return;
        if (paramInt1 == 0)
          getParent();
      }
      while ((paramInt1 <= 0) || (this.c == null) || (paramInt1 + paramInt2 < paramInt3) || (this.c.getCount() <= 0));
      localCursor = this.c.getCursor();
    }
    while (localCursor == null);
    localCursor.moveToLast();
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.h = paramInt;
    if ((paramInt != 2) && (this.i))
    {
      e();
      this.i = false;
    }
  }

  protected void onStop()
  {
    super.onStop();
    if (this.c != null)
    {
      Cursor localCursor = this.c.getCursor();
      if (localCursor != null)
        localCursor.deactivate();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.BaseListActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
