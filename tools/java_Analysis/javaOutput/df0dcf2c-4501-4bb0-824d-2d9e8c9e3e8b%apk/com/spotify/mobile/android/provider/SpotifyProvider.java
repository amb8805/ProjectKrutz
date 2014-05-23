package com.spotify.mobile.android.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.service.connections.d;
import com.spotify.mobile.android.service.l;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class SpotifyProvider extends ContentProvider
{
  public static final Uri a = Uri.parse("content://com.spotify.mobile.android");
  private d b;
  private Handler c;
  private aj d;

  public SpotifyProvider()
  {
  }

  private void a()
  {
    if (this.c == null)
    {
      HandlerThread localHandlerThread = new HandlerThread("SpotifyProviderWorker");
      localHandlerThread.start();
      this.c = new Handler(localHandlerThread.getLooper());
    }
  }

  private boolean b()
  {
    try
    {
      this.b.a(true);
      if (this.d == null)
      {
        this.d = new aj(this);
        this.b.a(this.d);
      }
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    return false;
  }

  private static boolean c()
  {
    return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
  }

  public final void a(Uri paramUri, ContentValues paramContentValues)
  {
    if (!this.b.c())
      return;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator1 = paramContentValues.valueSet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      localArrayList1.add(localEntry.getKey());
      localArrayList2.add(localEntry.getValue().toString());
    }
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    Iterator localIterator2 = URLEncodedUtils.parse(URI.create(paramUri.toString()), "utf-8").iterator();
    while (localIterator2.hasNext())
    {
      NameValuePair localNameValuePair = (NameValuePair)localIterator2.next();
      localArrayList3.add(localNameValuePair.getName());
      localArrayList4.add(localNameValuePair.getValue());
    }
    l locall = this.b.h();
    try
    {
      locall.a(paramUri.getEncodedPath().substring(1), (String[])localArrayList1.toArray(new String[localArrayList1.size()]), (String[])localArrayList2.toArray(new String[localArrayList2.size()]), (String[])localArrayList3.toArray(new String[localArrayList3.size()]), (String[])localArrayList4.toArray(new String[localArrayList4.size()]));
      return;
    }
    catch (Exception localException)
    {
      bp.b(localException, "Error calling update.");
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    ContentProvider localContentProvider = (ContentProvider)c.b(SpotifyProviderDelegate.class);
    if (localContentProvider != null)
      return localContentProvider.delete(paramUri, paramString, paramArrayOfString);
    a();
    SpotifyProvider.3 local3 = new SpotifyProvider.3(this, paramUri);
    if (c())
      this.c.post(local3);
    while (true)
    {
      return 1;
      local3.run();
    }
  }

  public String getType(Uri paramUri)
  {
    ContentProvider localContentProvider = (ContentProvider)c.b(SpotifyProviderDelegate.class);
    if (localContentProvider != null)
      return localContentProvider.getType(paramUri);
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    ContentProvider localContentProvider = (ContentProvider)c.b(SpotifyProviderDelegate.class);
    if (localContentProvider != null)
      return localContentProvider.insert(paramUri, paramContentValues);
    a();
    SpotifyProvider.2 local2 = new SpotifyProvider.2(this, paramUri, paramContentValues);
    if (c())
      this.c.post(local2);
    while (true)
    {
      return null;
      local2.run();
    }
  }

  public boolean onCreate()
  {
    this.b = new d(getContext());
    this.d = null;
    a();
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    if (!this.b.c())
      localObject = null;
    while (true)
    {
      return localObject;
      if ((paramUri == null) || (paramUri.getPathSegments().size() < 2) || (!((String)paramUri.getPathSegments().get(0)).equals("image")))
        return null;
      String str = (String)paramUri.getPathSegments().get(1);
      l locall = this.b.h();
      try
      {
        ParcelFileDescriptor localParcelFileDescriptor = locall.c(str);
        localObject = localParcelFileDescriptor;
        if (localObject != null)
          continue;
        return super.openFile(paramUri, paramString);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          localObject = null;
      }
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    cc.a("The content provider com.spotify.mobile.android may not be queried from the main thread.");
    ContentProvider localContentProvider = (ContentProvider)c.b(SpotifyProviderDelegate.class);
    if (localContentProvider != null)
      return localContentProvider.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
    if (!b())
      return null;
    Bundle localBundle1 = new Bundle();
    localBundle1.putAll(ai.a(paramString1, paramArrayOfString2));
    Bundle localBundle2 = new Bundle();
    if (paramString2 != null)
    {
      String[] arrayOfString = paramString2.trim().split(" ");
      if (arrayOfString.length > 0)
      {
        localBundle2.putString("order", arrayOfString[0]);
        if ((arrayOfString.length >= 2) && (arrayOfString[1].trim().equalsIgnoreCase("REVERSE")))
          localBundle2.putBoolean("reverse", true);
      }
    }
    localBundle1.putAll(localBundle2);
    try
    {
      ae localae = new ae(getContext(), this.b, paramUri, paramArrayOfString1, localBundle1);
      return localae;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new RuntimeException("The query failed: " + paramUri, localRuntimeException);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    ContentProvider localContentProvider = (ContentProvider)c.b(SpotifyProviderDelegate.class);
    if (localContentProvider != null)
      return localContentProvider.update(paramUri, paramContentValues, paramString, paramArrayOfString);
    a();
    SpotifyProvider.1 local1 = new SpotifyProvider.1(this, paramUri, paramContentValues);
    if (c())
      this.c.post(local1);
    while (true)
    {
      return 1;
      local1.run();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.SpotifyProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
