package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.c.m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity
{
  final Handler a = new FragmentActivity.1(this);
  final i b = new i();
  final f c = new FragmentActivity.2(this);
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  m<String, p> l;
  p m;

  public FragmentActivity()
  {
  }

  private static String a(View paramView)
  {
    c1 = 'F';
    c2 = '.';
    localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append((char)'{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append((char)' ');
    switch (paramView.getVisibility())
    {
    default:
      localStringBuilder.append(c2);
      while (true)
        if (paramView.isFocusable())
        {
          c3 = c1;
          label108: localStringBuilder.append(c3);
          if (!paramView.isEnabled())
            break label533;
          c4 = 'E';
          label126: localStringBuilder.append(c4);
          if (!paramView.willNotDraw())
            break label539;
          c5 = c2;
          label143: localStringBuilder.append(c5);
          if (!paramView.isHorizontalScrollBarEnabled())
            break label546;
          c6 = 'H';
          label161: localStringBuilder.append(c6);
          if (!paramView.isVerticalScrollBarEnabled())
            break label552;
          c7 = 'V';
          label179: localStringBuilder.append(c7);
          if (!paramView.isClickable())
            break label558;
          c8 = 'C';
          label197: localStringBuilder.append(c8);
          if (!paramView.isLongClickable())
            break label564;
          c9 = 'L';
          label215: localStringBuilder.append(c9);
          localStringBuilder.append((char)' ');
          if (!paramView.isFocused())
            break label570;
          label236: localStringBuilder.append(c1);
          if (!paramView.isSelected())
            break label575;
          c10 = 'S';
          label253: localStringBuilder.append(c10);
          if (paramView.isPressed())
            c2 = 'P';
          localStringBuilder.append(c2);
          localStringBuilder.append((char)' ');
          localStringBuilder.append(paramView.getLeft());
          localStringBuilder.append((char)',');
          localStringBuilder.append(paramView.getTop());
          localStringBuilder.append((char)'-');
          localStringBuilder.append(paramView.getRight());
          localStringBuilder.append((char)',');
          localStringBuilder.append(paramView.getBottom());
          n = paramView.getId();
          if (n != -1)
          {
            localStringBuilder.append(" #");
            localStringBuilder.append(Integer.toHexString(n));
            localResources = paramView.getResources();
            if ((n != 0) && (localResources != null))
              switch (0xFF000000 & n)
              {
              default:
                try
                {
                  String str1 = localResources.getResourcePackageName(n);
                  while (true)
                  {
                    String str2 = localResources.getResourceTypeName(n);
                    String str3 = localResources.getResourceEntryName(n);
                    localStringBuilder.append(" ");
                    localStringBuilder.append(str1);
                    localStringBuilder.append(":");
                    localStringBuilder.append(str2);
                    localStringBuilder.append("/");
                    localStringBuilder.append(str3);
                    localStringBuilder.append("}");
                    return localStringBuilder.toString();
                    localStringBuilder.append((char)'V');
                    break;
                    localStringBuilder.append((char)'I');
                    break;
                    localStringBuilder.append((char)'G');
                    break;
                    c3 = c2;
                    break label108;
                    c4 = c2;
                    break label126;
                    c5 = 'D';
                    break label143;
                    c6 = c2;
                    break label161;
                    c7 = c2;
                    break label179;
                    c8 = c2;
                    break label197;
                    c9 = c2;
                    break label215;
                    c1 = c2;
                    break label236;
                    c10 = c2;
                    break label253;
                    str1 = "app";
                    continue;
                    str1 = "android";
                  }
                }
                catch (Resources.NotFoundException localNotFoundException)
                {
                  break label485;
                }
              case 2130706432:
              case 16777216:
              }
          }
        }
    case 0:
    case 4:
    case 8:
    }
  }

  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int n = localViewGroup.getChildCount();
        if (n > 0)
        {
          String str = paramString + "  ";
          for (int i1 = 0; i1 < n; i1++)
            a(str, paramPrintWriter, localViewGroup.getChildAt(i1));
        }
      }
    }
  }

  final p a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.l == null)
      this.l = new m();
    p localp = (p)this.l.get(paramString);
    if (localp == null)
    {
      if (paramBoolean2)
      {
        localp = new p(paramString, this, paramBoolean1);
        this.l.put(paramString, localp);
      }
      return localp;
    }
    localp.e = this;
    return localp;
  }

  public final void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, (1 + paramFragment.o << 16) + (0xFFFF & paramInt));
  }

  final void a(String paramString)
  {
    if (this.l != null)
    {
      p localp = (p)this.l.get(paramString);
      if ((localp != null) && (!localp.g))
      {
        localp.g();
        this.l.remove(paramString);
      }
    }
  }

  final void a(boolean paramBoolean)
  {
    if (!this.g)
    {
      this.g = true;
      this.h = paramBoolean;
      this.a.removeMessages(1);
      if (this.k)
      {
        this.k = false;
        if (this.m != null)
        {
          if (this.h)
            break label67;
          this.m.c();
        }
      }
    }
    while (true)
    {
      this.b.c(2);
      return;
      label67: this.m.d();
    }
  }

  public final g c()
  {
    return this.b;
  }

  public final n d()
  {
    if (this.m != null)
      return this.m;
    this.j = true;
    this.m = a("(root)", this.k, true);
    return this.m;
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.k);
    if (this.m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
      paramPrintWriter.println(":");
      this.m.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.s = false;
    int n = paramInt1 >> 16;
    if (n != 0)
    {
      int i1 = n - 1;
      if ((this.b.f == null) || (i1 < 0) || (i1 >= this.b.f.size()))
      {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      Fragment localFragment = (Fragment)this.b.f.get(i1);
      if (localFragment == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
        return;
      }
      localFragment.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    if (!this.b.d())
      finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.b.a(this, this.c, null);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    e locale = (e)getLastNonConfigurationInstance();
    if (locale != null)
      this.l = locale.e;
    Parcelable localParcelable;
    i locali;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      locali = this.b;
      if (locale == null)
        break label100;
    }
    label100: for (ArrayList localArrayList = locale.d; ; localArrayList = null)
    {
      locali.a(localParcelable, localArrayList);
      this.b.i();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.b.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11)
        return bool;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, d.a);
    if (str1 == null)
      str1 = localTypedArray.getString(0);
    int n = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    if (!Fragment.b(this, str1))
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    Object localObject = null;
    if (n != -1)
      localObject = this.b.a(n);
    if ((localObject == null) && (str2 != null))
      localObject = this.b.a(str2);
    if (localObject == null)
      localObject = this.b.a(0);
    if (i.a)
      Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(n) + " fname=" + str1 + " existing=" + localObject);
    int i1;
    if (localObject == null)
    {
      Fragment localFragment = Fragment.a(this, str1);
      localFragment.x = true;
      if (n != 0)
      {
        i1 = n;
        localFragment.F = i1;
        localFragment.G = 0;
        localFragment.H = str2;
        localFragment.y = true;
        localFragment.B = this.b;
        localFragment.O = true;
        this.b.a(localFragment, true);
        localObject = localFragment;
      }
    }
    while (true)
    {
      if (((Fragment)localObject).R != null)
        break label461;
      throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
      i1 = 0;
      break;
      if (((Fragment)localObject).y)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(n) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + str1);
      ((Fragment)localObject).y = true;
      if (!((Fragment)localObject).L)
        ((Fragment)localObject).O = true;
      this.b.c((Fragment)localObject);
    }
    label461: if (n != 0)
      ((Fragment)localObject).R.setId(n);
    if (((Fragment)localObject).R.getTag() == null)
      ((Fragment)localObject).R.setTag(str2);
    return ((Fragment)localObject).R;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.n();
    if (this.m != null)
      this.m.g();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.o();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.b.a(paramMenuItem);
    case 6:
    }
    return this.b.b(paramMenuItem);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.s = false;
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.b(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.e = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      u_();
    }
    this.b.c(4);
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    u_();
    this.b.f();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.i)
      {
        this.i = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return super.onPreparePanel(0, paramView, paramMenu) | this.b.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  protected void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.e = true;
    this.b.f();
  }

  public final Object onRetainNonConfigurationInstance()
  {
    int n = 0;
    if (this.f)
      a(true);
    i locali = this.b;
    ArrayList localArrayList;
    if (locali.f != null)
    {
      int i4 = 0;
      localArrayList = null;
      if (i4 < locali.f.size())
      {
        Fragment localFragment = (Fragment)locali.f.get(i4);
        if ((localFragment != null) && (localFragment.K))
        {
          if (localArrayList == null)
            localArrayList = new ArrayList();
          localArrayList.add(localFragment);
          localFragment.L = true;
          if (localFragment.r == null)
            break label157;
        }
        label157: for (int i5 = localFragment.r.o; ; i5 = -1)
        {
          localFragment.s = i5;
          if (i.a)
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + localFragment);
          i4++;
          break;
        }
      }
    }
    else
    {
      localArrayList = null;
    }
    int i1;
    if (this.l != null)
    {
      int i2 = this.l.size();
      p[] arrayOfp = new p[i2];
      for (int i3 = i2 - 1; i3 >= 0; i3--)
        arrayOfp[i3] = ((p)this.l.b(i3));
      i1 = 0;
      if (n < i2)
      {
        p localp = arrayOfp[n];
        if (localp.g)
          i1 = 1;
        while (true)
        {
          n++;
          break;
          localp.g();
          this.l.remove(localp.d);
        }
      }
    }
    else
    {
      i1 = 0;
    }
    if ((localArrayList == null) && (i1 == 0))
      return null;
    e locale = new e();
    locale.a = null;
    locale.b = null;
    locale.c = null;
    locale.d = localArrayList;
    locale.e = this.l;
    return locale;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.h();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.f = false;
    this.g = false;
    this.a.removeMessages(1);
    if (!this.d)
    {
      this.d = true;
      this.b.j();
    }
    this.b.s = false;
    this.b.f();
    if (!this.k)
    {
      this.k = true;
      if (this.m == null)
        break label147;
      this.m.b();
    }
    int n;
    p[] arrayOfp;
    while (true)
    {
      this.j = true;
      this.b.k();
      if (this.l == null)
        return;
      n = this.l.size();
      arrayOfp = new p[n];
      for (int i1 = n - 1; i1 >= 0; i1--)
        arrayOfp[i1] = ((p)this.l.b(i1));
      label147: if (!this.j)
      {
        this.m = a("(root)", this.k, false);
        if ((this.m != null) && (!this.m.f))
          this.m.b();
      }
    }
    for (int i2 = 0; i2 < n; i2++)
    {
      p localp = arrayOfp[i2];
      if (localp.g)
      {
        if (p.a)
          Log.v("LoaderManager", "Finished Retaining in " + localp);
        localp.g = false;
        for (int i3 = -1 + localp.b.a(); i3 >= 0; i3--)
        {
          q localq = (q)localp.b.e(i3);
          if (localq.i)
          {
            if (p.a)
              Log.v("LoaderManager", "  Finished Retaining: " + localq);
            localq.i = false;
            if ((localq.h != localq.j) && (!localq.h))
              localq.b();
          }
          if ((localq.h) && (localq.e) && (!localq.k))
            localq.b(localq.d, localq.g);
        }
      }
      localp.f();
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.f = true;
    this.a.sendEmptyMessage(1);
    this.b.m();
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }

  protected void u_()
  {
    this.b.l();
  }

  public void v_()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.i = true;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
