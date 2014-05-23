package com.spotify.mobile.android.service;

import android.annotation.SuppressLint;
import android.content.Context;
import com.spotify.mobile.android.b.b;
import com.spotify.mobile.android.b.c;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class ak
{
  public static final cy a = cy.a("installation_id");
  static final cy b = cy.a("cache_location_v4");
  static final cy c = cy.a("cache_location");
  static final cy d = cy.a("settings_location");
  static final cy e = cy.a("storage_location");
  private final Context f;
  private cw g;
  private am h;
  private List<File> i = null;
  private c j = new b();

  public ak(Context paramContext)
  {
    this.f = paramContext;
    this.g = cw.a(this.f);
    this.h = new al(paramContext.getPackageName(), (byte)0);
  }

  private static String a(File paramFile)
  {
    if ((!paramFile.isDirectory()) && (!paramFile.mkdirs()))
      return null;
    return paramFile.getAbsolutePath();
  }

  private static void a(Set<String> paramSet, String paramString, List<File> paramList)
  {
    if (paramSet != null)
    {
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        File localFile = new File((String)localIterator.next(), paramString);
        if (localFile.isDirectory())
          paramList.add(localFile);
      }
    }
  }

  private boolean d()
  {
    return new File(this.h.a()).isDirectory();
  }

  private boolean e()
  {
    if (this.i == null)
    {
      Set localSet = this.j.a();
      LinkedList localLinkedList = new LinkedList();
      a(localSet, this.h.f(), localLinkedList);
      a(localSet, this.h.e(), localLinkedList);
      this.i = localLinkedList;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.i.size());
    bp.c("Found %d volume(s) containing a pre-existing cache", arrayOfObject);
    return this.i.size() > 0;
  }

  private String f()
  {
    return this.g.a(e, this.h.b());
  }

  private boolean g()
  {
    return this.h.h();
  }

  public final String a()
  {
    boolean bool1 = this.h.h();
    int k;
    label26: String str3;
    if (this.g.a(b, null) == null)
    {
      k = 0;
      if (k == 0)
        break label64;
      str3 = this.g.a(b, null);
    }
    while (bool1 == this.h.h())
    {
      return str3;
      k = 1;
      break label26;
      label64: String str1 = this.g.a(c, null);
      boolean bool2;
      label83: File localFile3;
      File localFile4;
      File localFile5;
      if (str1 == null)
      {
        bool2 = false;
        if (!bool2)
          break label299;
        str3 = this.g.a(c, null);
        cc.a(str3);
        localFile3 = new File(str3);
        if (!str3.endsWith(this.h.e()))
          break label271;
        localFile4 = new File(str3.substring(0, str3.length() - this.h.e().length()), this.h.f());
        localFile5 = localFile4.getParentFile();
        if (localFile5.exists())
          break label265;
      }
      label265: for (boolean bool5 = localFile5.mkdirs(); ; bool5 = true)
      {
        if ((!bool5) || (!localFile3.renameTo(localFile4)))
          break label269;
        str3 = localFile4.toString();
        this.g.a().a(c, null).a(b, str3).b();
        break;
        bool2 = new File(str1).isDirectory();
        break label83;
      }
      label269: continue;
      label271: this.g.a().a(c, null).a(b, str3).b();
      continue;
      label299: String str2 = this.g.a(c, null);
      int m;
      if (str2 == null)
        m = 0;
      while (true)
      {
        if (m == 0)
          break label432;
        str3 = this.g.a(c, null);
        break;
        File localFile1 = new File(str2);
        if (!localFile1.isDirectory())
        {
          if (localFile1.mkdirs())
          {
            this.g.a().a(c, null).b();
            boolean bool4 = localFile1.delete();
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Boolean.valueOf(bool4);
            bp.c("Deleted temporary cache dir: %b", arrayOfObject);
            m = 0;
          }
          else
          {
            m = 1;
          }
        }
        else
          m = 1;
      }
      label432: if (e())
      {
        if (e())
        {
          File localFile2 = (File)this.i.iterator().next();
          bp.c("Using orphan cache stored on %s", new Object[] { localFile2 });
          str3 = a(localFile2);
        }
        else
        {
          str3 = null;
        }
      }
      else
      {
        boolean bool3 = new File(f(), this.h.c()).isDirectory();
        if ((!bool3) && (!g()))
          bool3 = true;
        if (bool3)
          str3 = new File(f(), this.h.c()).getAbsolutePath();
        else if (d())
          str3 = this.h.a();
        else
          str3 = null;
      }
    }
  }

  public final String a(cy paramcy, String paramString)
  {
    return this.g.a(paramcy, paramString);
  }

  public final String a(String paramString)
  {
    return a(new File(paramString, this.h.f()));
  }

  public final String b()
  {
    boolean bool1 = this.h.h();
    int k;
    label26: String str1;
    if (this.g.a(d, null) != null)
    {
      k = 1;
      if (k == 0)
        break label74;
      str1 = this.g.a(d, null);
    }
    while (bool1 == this.h.h())
    {
      if ("".equals(str1))
        break label171;
      return str1;
      k = 0;
      break label26;
      label74: boolean bool2 = new File(f(), this.h.d()).isDirectory();
      if ((!bool2) && (!g()))
        bool2 = true;
      if (bool2)
        str1 = new File(f(), this.h.d()).getAbsolutePath();
      else if (d())
        str1 = this.h.a();
      else
        str1 = "";
    }
    label171: File localFile = new File(this.f.getFilesDir(), this.h.g());
    String str2 = localFile.getAbsolutePath();
    if (localFile.isDirectory());
    for (boolean bool3 = true; !bool3; bool3 = localFile.mkdirs())
    {
      bp.c("Failed to create settings directory, possibly because of full file system: %s", new Object[] { localFile });
      return str2;
    }
    b(d, str2);
    return str2;
  }

  @SuppressLint({"CommitPrefEdits"})
  public final void b(cy paramcy, String paramString)
  {
    cx localcx = this.g.a();
    localcx.a(paramcy, paramString);
    localcx.a();
  }

  public final boolean b(String paramString)
  {
    if (paramString == null);
    File localFile;
    do
    {
      return false;
      localFile = new File(paramString);
    }
    while ((!localFile.exists()) || (!localFile.isDirectory()));
    b(b, paramString);
    return true;
  }

  public final void c()
  {
    this.g.a().a(b).a(c).a(d).a(e).a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
