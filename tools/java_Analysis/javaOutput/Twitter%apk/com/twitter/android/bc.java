package com.twitter.android;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

final class bc extends AsyncTask
{
  private bc(ProfileActivity paramProfileActivity)
  {
  }

  private Long a(Uri[] paramArrayOfUri)
  {
    ContentResolver localContentResolver = this.a.getContentResolver();
    Uri localUri = paramArrayOfUri[0];
    boolean bool1 = "com.android.contacts".equals(localUri.getAuthority());
    boolean bool2 = "vnd.android.cursor.item/vnd.twitter.profile".equals(this.a.getIntent().resolveType(localContentResolver));
    if ((bool1) && (bool2))
    {
      localCursor = localContentResolver.query(localUri, new String[] { "data1" }, null, null, null);
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            Long localLong = Long.valueOf(localCursor.getLong(0));
            return localLong;
          }
          return Long.valueOf(0L);
        }
        finally
        {
          localCursor.close();
        }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
