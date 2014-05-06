package com.twitter.android.platform;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.RawContacts;

public class RemoveRawContactsService extends IntentService
{
  public RemoveRawContactsService()
  {
    super("RemoveRawContactsService");
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("account_name");
    if (str != null)
    {
      Uri.Builder localBuilder = ContactsContract.RawContacts.CONTENT_URI.buildUpon();
      localBuilder.appendQueryParameter("account_name", str);
      localBuilder.appendQueryParameter("account_type", "com.twitter.android.auth.login");
      localBuilder.appendQueryParameter("caller_is_syncadapter", "true");
      getContentResolver().delete(localBuilder.build(), null, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.RemoveRawContactsService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
