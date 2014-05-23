package android.support.v4.app;

import android.support.v4.c.d;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends l
  implements Runnable
{
  final i a;
  b b;
  b c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  boolean k;
  boolean l = true;
  String m;
  boolean n;
  int o = -1;
  int p;
  CharSequence q;
  int r;
  CharSequence s;

  public a(i parami)
  {
    this.a = parami;
  }

  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.B = this.a;
    if (paramString != null)
    {
      if ((paramFragment.H != null) && (!paramString.equals(paramFragment.H)))
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.H + " now " + paramString);
      paramFragment.H = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.F != 0) && (paramFragment.F != paramInt1))
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.F + " now " + paramInt1);
      paramFragment.F = paramInt1;
      paramFragment.G = paramInt1;
    }
    b localb = new b();
    localb.c = paramInt2;
    localb.d = paramFragment;
    a(localb);
  }

  private int b(boolean paramBoolean)
  {
    if (this.n)
      throw new IllegalStateException("commit already called");
    if (i.a)
    {
      Log.v("FragmentManager", "Commit: " + this);
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    this.n = true;
    if (this.k);
    for (this.o = this.a.a(this); ; this.o = -1)
    {
      this.a.a(this, paramBoolean);
      return this.o;
    }
  }

  public final l a()
  {
    if (!this.l)
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    this.k = true;
    this.m = null;
    return this;
  }

  public final l a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
    return this;
  }

  public final l a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }

  public final l a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }

  public final l a(Fragment paramFragment)
  {
    b localb = new b();
    localb.c = 3;
    localb.d = paramFragment;
    a(localb);
    return this;
  }

  public final l a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }

  final void a(int paramInt)
  {
    if (!this.k);
    while (true)
    {
      return;
      if (i.a)
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      for (b localb = this.b; localb != null; localb = localb.a)
      {
        if (localb.d != null)
        {
          Fragment localFragment2 = localb.d;
          localFragment2.A = (paramInt + localFragment2.A);
          if (i.a)
            Log.v("FragmentManager", "Bump nesting of " + localb.d + " to " + localb.d.A);
        }
        if (localb.i != null)
          for (int i1 = -1 + localb.i.size(); i1 >= 0; i1--)
          {
            Fragment localFragment1 = (Fragment)localb.i.get(i1);
            localFragment1.A = (paramInt + localFragment1.A);
            if (i.a)
              Log.v("FragmentManager", "Bump nesting of " + localFragment1 + " to " + localFragment1.A);
          }
      }
    }
  }

  final void a(b paramb)
  {
    if (this.b == null)
    {
      this.c = paramb;
      this.b = paramb;
    }
    while (true)
    {
      paramb.e = this.e;
      paramb.f = this.f;
      paramb.g = this.g;
      paramb.h = this.h;
      this.d = (1 + this.d);
      return;
      paramb.b = this.c;
      this.c.a = paramb;
      this.c = paramb;
    }
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }

  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.m);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.o);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.n);
      if (this.i != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.i));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.j));
      }
      if ((this.e != 0) || (this.f != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.e));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.f));
      }
      if ((this.g != 0) || (this.h != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.g));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.h));
      }
      if ((this.p != 0) || (this.q != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.p));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.q);
      }
      if ((this.r != 0) || (this.s != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.r));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.s);
      }
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str1 = paramString + "    ";
      b localb1 = this.b;
      int i1 = 0;
      b localb2 = localb1;
      while (localb2 != null)
      {
        String str2;
        int i2;
        switch (localb2.c)
        {
        default:
          str2 = "cmd=" + localb2.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localb2.d);
          if (paramBoolean)
          {
            if ((localb2.e != 0) || (localb2.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localb2.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localb2.f));
            }
            if ((localb2.g != 0) || (localb2.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localb2.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localb2.h));
            }
          }
          if ((localb2.i == null) || (localb2.i.size() <= 0))
            break label793;
          i2 = 0;
          label630: if (i2 >= localb2.i.size())
            break label793;
          paramPrintWriter.print(str1);
          if (localb2.i.size() == 1)
            paramPrintWriter.print("Removed: ");
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
        while (true)
        {
          paramPrintWriter.println(localb2.i.get(i2));
          i2++;
          break label630;
          str2 = "NULL";
          break;
          str2 = "ADD";
          break;
          str2 = "REPLACE";
          break;
          str2 = "REMOVE";
          break;
          str2 = "HIDE";
          break;
          str2 = "SHOW";
          break;
          str2 = "DETACH";
          break;
          str2 = "ATTACH";
          break;
          if (i2 == 0)
            paramPrintWriter.println("Removed:");
          paramPrintWriter.print(str1);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label793: localb2 = localb2.a;
        i1++;
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (i.a)
    {
      Log.v("FragmentManager", "popFromBackStack: " + this);
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    a(-1);
    b localb = this.c;
    if (localb != null)
    {
      switch (localb.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localb.c);
      case 1:
        Fragment localFragment8 = localb.d;
        localFragment8.P = localb.h;
        this.a.a(localFragment8, i.d(this.i), this.j);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      while (true)
      {
        localb = localb.b;
        break;
        Fragment localFragment6 = localb.d;
        if (localFragment6 != null)
        {
          localFragment6.P = localb.h;
          this.a.a(localFragment6, i.d(this.i), this.j);
        }
        if (localb.i != null)
        {
          for (int i2 = 0; i2 < localb.i.size(); i2++)
          {
            Fragment localFragment7 = (Fragment)localb.i.get(i2);
            localFragment7.P = localb.g;
            this.a.a(localFragment7, false);
          }
          Fragment localFragment5 = localb.d;
          localFragment5.P = localb.g;
          this.a.a(localFragment5, false);
          continue;
          Fragment localFragment4 = localb.d;
          localFragment4.P = localb.g;
          this.a.c(localFragment4, i.d(this.i), this.j);
          continue;
          Fragment localFragment3 = localb.d;
          localFragment3.P = localb.h;
          this.a.b(localFragment3, i.d(this.i), this.j);
          continue;
          Fragment localFragment2 = localb.d;
          localFragment2.P = localb.g;
          this.a.e(localFragment2, i.d(this.i), this.j);
          continue;
          Fragment localFragment1 = localb.d;
          localFragment1.P = localb.g;
          this.a.d(localFragment1, i.d(this.i), this.j);
        }
      }
    }
    if (paramBoolean)
      this.a.a(this.a.n, i.d(this.i), this.j, true);
    if (this.o >= 0)
    {
      locali = this.a;
      i1 = this.o;
      try
      {
        locali.k.set(i1, null);
        if (locali.l == null)
          locali.l = new ArrayList();
        if (i.a)
          Log.v("FragmentManager", "Freeing back stack index " + i1);
        locali.l.add(Integer.valueOf(i1));
        this.o = -1;
        return;
      }
      finally
      {
      }
    }
  }

  public final int b()
  {
    return b(false);
  }

  public final l b(int paramInt, Fragment paramFragment)
  {
    return b(paramInt, paramFragment, null);
  }

  public final l b(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    a(paramInt, paramFragment, paramString, 2);
    return this;
  }

  public final l b(Fragment paramFragment)
  {
    b localb = new b();
    localb.c = 6;
    localb.d = paramFragment;
    a(localb);
    return this;
  }

  public final int c()
  {
    return b(true);
  }

  public final l c(Fragment paramFragment)
  {
    b localb = new b();
    localb.c = 7;
    localb.d = paramFragment;
    a(localb);
    return this;
  }

  public final void run()
  {
    if (i.a)
      Log.v("FragmentManager", "Run: " + this);
    if ((this.k) && (this.o < 0))
      throw new IllegalStateException("addToBackStack() called after commit()");
    a(1);
    b localb = this.b;
    if (localb != null)
    {
      switch (localb.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localb.c);
      case 1:
        Fragment localFragment9 = localb.d;
        localFragment9.P = localb.e;
        this.a.a(localFragment9, false);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      while (true)
      {
        localb = localb.a;
        break;
        Fragment localFragment6 = localb.d;
        Fragment localFragment7;
        if (this.a.g != null)
        {
          int i1 = 0;
          localFragment7 = localFragment6;
          if (i1 < this.a.g.size())
          {
            Fragment localFragment8 = (Fragment)this.a.g.get(i1);
            if (i.a)
              Log.v("FragmentManager", "OP_REPLACE: adding=" + localFragment7 + " old=" + localFragment8);
            if ((localFragment7 == null) || (localFragment8.G == localFragment7.G))
            {
              if (localFragment8 != localFragment7)
                break label312;
              localFragment7 = null;
              localb.d = null;
            }
            while (true)
            {
              i1++;
              break;
              label312: if (localb.i == null)
                localb.i = new ArrayList();
              localb.i.add(localFragment8);
              localFragment8.P = localb.f;
              if (this.k)
              {
                localFragment8.A = (1 + localFragment8.A);
                if (i.a)
                  Log.v("FragmentManager", "Bump nesting of " + localFragment8 + " to " + localFragment8.A);
              }
              this.a.a(localFragment8, this.i, this.j);
            }
          }
        }
        else
        {
          localFragment7 = localFragment6;
        }
        if (localFragment7 != null)
        {
          localFragment7.P = localb.e;
          this.a.a(localFragment7, false);
          continue;
          Fragment localFragment5 = localb.d;
          localFragment5.P = localb.f;
          this.a.a(localFragment5, this.i, this.j);
          continue;
          Fragment localFragment4 = localb.d;
          localFragment4.P = localb.f;
          this.a.b(localFragment4, this.i, this.j);
          continue;
          Fragment localFragment3 = localb.d;
          localFragment3.P = localb.e;
          this.a.c(localFragment3, this.i, this.j);
          continue;
          Fragment localFragment2 = localb.d;
          localFragment2.P = localb.f;
          this.a.d(localFragment2, this.i, this.j);
          continue;
          Fragment localFragment1 = localb.d;
          localFragment1.P = localb.e;
          this.a.e(localFragment1, this.i, this.j);
        }
      }
    }
    this.a.a(this.a.n, this.i, this.j, true);
    if (this.k)
    {
      i locali = this.a;
      if (locali.i == null)
        locali.i = new ArrayList();
      locali.i.add(this);
      locali.g();
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.o >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.o);
    }
    if (this.m != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.m);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
