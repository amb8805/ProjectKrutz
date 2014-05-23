package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.InputStream;

final class g extends d
{
  private static final UriMatcher o;
  final Context n;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    o = localUriMatcher;
    localUriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    o.addURI("com.android.contacts", "contacts/lookup/*", 1);
    o.addURI("com.android.contacts", "contacts/#/photo", 2);
    o.addURI("com.android.contacts", "contacts/#", 3);
    o.addURI("com.android.contacts", "display_photo/#", 4);
  }

  g(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    super(paramPicasso, paramj, parame, paramag, parama);
    this.n = paramContext;
  }

  private Bitmap a(InputStream paramInputStream, ac paramac)
  {
    if (paramInputStream == null)
      return null;
    localOptions = b(paramac);
    if (paramac.a())
    {
      localOptions.inJustDecodeBounds = true;
      localInputStream = c();
      try
      {
        BitmapFactory.decodeStream(localInputStream, null, localOptions);
        an.a(localInputStream);
        a(paramac.e, paramac.f, localOptions);
        return BitmapFactory.decodeStream(paramInputStream, null, localOptions);
      }
      finally
      {
        an.a(localInputStream);
      }
    }
  }

  private InputStream c()
  {
    ContentResolver localContentResolver = this.n.getContentResolver();
    Uri localUri = this.f.a;
    switch (o.match(localUri))
    {
    default:
      throw new IllegalStateException("Invalid uri: " + localUri);
    case 1:
      localUri = ContactsContract.Contacts.lookupContact(localContentResolver, localUri);
      if (localUri == null)
        return null;
    case 3:
      if (Build.VERSION.SDK_INT < 14)
        return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, localUri);
      return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, localUri, true);
    case 2:
    case 4:
    }
    return localContentResolver.openInputStream(localUri);
  }

  final Bitmap a(ac paramac)
  {
    localInputStream = null;
    try
    {
      localInputStream = c();
      Bitmap localBitmap = a(localInputStream, paramac);
      return localBitmap;
    }
    finally
    {
      an.a(localInputStream);
    }
  }

  final Picasso.LoadedFrom a()
  {
    return Picasso.LoadedFrom.b;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
