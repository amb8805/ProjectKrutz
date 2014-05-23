package com.spotify.mobile.android.service;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import com.spotify.mobile.android.b.b;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cz;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public final class an
{
  private ak a;
  private String b;
  private String c;

  public an(Context paramContext)
  {
    this.a = new ak(paramContext);
    this.b = a(paramContext);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.b;
    bp.c("Using cache location %s", arrayOfObject1);
    this.c = this.a.b();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = this.c;
    bp.c("Using settings location %s", arrayOfObject2);
  }

  private String a(Context paramContext)
  {
    Object localObject = this.a.a();
    if (localObject == null)
    {
      if (Build.VERSION.SDK_INT >= 19)
        for (File localFile2 : paramContext.getExternalCacheDirs())
          if (localFile2 != null)
            bp.c("Cache dir=" + localFile2.getAbsolutePath(), new Object[0]);
      bp.c("No cache location set", new Object[0]);
      Set localSet = new b().a();
      StringBuilder localStringBuilder = new StringBuilder();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localSet.size());
      bp.c("Choosing cache volume between %d candidate(s): ", arrayOfObject2);
      Iterator localIterator = localSet.iterator();
      String str3;
      while (localIterator.hasNext())
      {
        str3 = (String)localIterator.next();
        try
        {
          cz localcz = new cz(str3);
          long l1 = localcz.d();
          long l2 = localcz.c() * localcz.a();
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = str3;
          arrayOfObject3[1] = Long.valueOf(l1);
          arrayOfObject3[2] = Long.valueOf(l2);
          localStringBuilder.append(String.format("%s %d %d;", arrayOfObject3));
          Object[] arrayOfObject4 = new Object[3];
          arrayOfObject4[0] = str3;
          arrayOfObject4[1] = Long.valueOf(l1);
          arrayOfObject4[2] = Long.valueOf(l2);
          bp.c("%s (%d/%d bytes free/total)", arrayOfObject4);
        }
        catch (IOException localIOException)
        {
          bp.d("cannot stat %s", new Object[] { str3 });
        }
      }
      String str1 = com.spotify.mobile.android.b.a.a(localSet);
      bp.c("Chose cache volume: %s", new Object[] { str1 });
      if (str1 == null)
      {
        str1 = Environment.getExternalStorageDirectory().getAbsolutePath();
        bp.c("Falling back to volume: %s", new Object[] { str1 });
      }
      String str2 = this.a.a(str1);
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.K);
      localClientEvent.a("cache-volume", str1);
      localClientEvent.a("candidate-volumes", localStringBuilder.toString());
      c.a(com.spotify.mobile.android.ui.actions.a.class);
      com.spotify.mobile.android.ui.actions.a.a(ViewUri.N, ViewUri.SubView.a, localClientEvent);
      localObject = str2;
    }
    while (true)
    {
      this.a.b((String)localObject);
      return localObject;
      File localFile1 = new File((String)localObject);
      if ((!localFile1.exists()) || (!localFile1.isDirectory()))
      {
        boolean bool = localFile1.mkdirs();
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = localFile1;
        arrayOfObject1[1] = Boolean.valueOf(bool);
        bp.c("Recreating cache directory %s, success: %b", arrayOfObject1);
      }
      if ((Math.random() < 0.001D) && ((((String)localObject).equals("/sdcard/spotify2")) || (((String)localObject).endsWith("/cache"))))
        Assertion.b("Using legacy path " + (String)localObject + " (throttled 1/1000)");
    }
  }

  public final boolean a()
  {
    if (this.b == null);
    File localFile;
    do
    {
      return false;
      localFile = new File(this.b);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Boolean.valueOf(localFile.isDirectory());
      bp.c("The cache location is a directory? %b", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(localFile.canWrite());
      bp.c("The cache location is writable? %b", arrayOfObject2);
    }
    while ((!localFile.isDirectory()) || (!localFile.canWrite()));
    return true;
  }

  public final String b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
