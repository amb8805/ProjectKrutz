package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.util.UUID;

public class NativeAppCallContentProvider extends ContentProvider
{
  private static final String a = NativeAppCallContentProvider.class.getName();
  private final l b;

  public NativeAppCallContentProvider()
  {
    this(new k());
  }

  private NativeAppCallContentProvider(l paraml)
  {
    this.b = paraml;
  }

  private static Pair<UUID, String> a(Uri paramUri)
  {
    try
    {
      String[] arrayOfString = paramUri.getPath().substring(1).split("/");
      String str1 = arrayOfString[0];
      String str2 = arrayOfString[1];
      Pair localPair = new Pair(UUID.fromString(str1), str2);
      return localPair;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    Pair localPair = a(paramUri);
    if (localPair == null)
      throw new FileNotFoundException();
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(this.b.a((UUID)localPair.first, (String)localPair.second), 268435456);
      return localParcelFileDescriptor;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.e(a, "Got unexpected exception:" + localFileNotFoundException);
      throw localFileNotFoundException;
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.facebook.NativeAppCallContentProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */