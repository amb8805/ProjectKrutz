package com.spotify.mobile.android.ui.actions.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.spotify.mobile.android.provider.d;
import com.spotify.mobile.android.ui.actions.b;

public final class a
  implements b
{
  private final ContentResolver a;

  public a(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
  }

  public final void a()
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("is_active", Boolean.valueOf(true));
    this.a.update(d.a("local_device"), localContentValues, null, null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.actions.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
