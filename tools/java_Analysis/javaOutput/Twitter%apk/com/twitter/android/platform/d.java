package com.twitter.android.platform;

import ac;
import ad;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract.Settings;
import android.util.Log;
import cb;
import do;

public final class d
{
  private static final boolean a = Log.isLoggable("TwitterAccountHelper", 3);

  public d()
  {
  }

  public static int a(Context paramContext)
  {
    return AccountManager.get(paramContext).getAccountsByType("com.twitter.android.auth.login").length;
  }

  public static ac a(AccountManager paramAccountManager, Account paramAccount)
  {
    String str1 = paramAccountManager.peekAuthToken(paramAccount, "com.twitter.android.oauth.token");
    String str2 = paramAccountManager.peekAuthToken(paramAccount, "com.twitter.android.oauth.token.secret");
    if ((str1 != null) && (str2 != null))
      return new ac(str1, str2);
    return null;
  }

  public static Account a(Context paramContext, String paramString)
  {
    for (Account localAccount : AccountManager.get(paramContext).getAccountsByType("com.twitter.android.auth.login"))
      if (localAccount.name.equals(paramString))
        return localAccount;
    return null;
  }

  public static Account a(Context paramContext, String paramString1, ac paramac, String paramString2)
  {
    AccountManager localAccountManager = AccountManager.get(paramContext);
    Account localAccount = a(paramContext, paramString1);
    if (localAccount == null)
    {
      if (a)
        Log.d("TwitterAccountHelper", "Creating account: " + paramString1);
      localAccount = new Account(paramString1, "com.twitter.android.auth.login");
      if (!localAccountManager.addAccountExplicitly(localAccount, null, null))
      {
        Log.e("TwitterAccountHelper", "Unable to create account for " + paramString1);
        return null;
      }
    }
    localAccountManager.setPassword(localAccount, null);
    localAccountManager.setUserData(localAccount, "account_user_info", paramString2);
    localAccountManager.setAuthToken(localAccount, "com.twitter.android.oauth.token", paramac.b);
    localAccountManager.setAuthToken(localAccount, "com.twitter.android.oauth.token.secret", paramac.a);
    return localAccount;
  }

  public static Account a(Context paramContext, String paramString1, ac paramac, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Account localAccount = a(paramContext, paramString1, paramac, paramString2);
    ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("account_name", paramString1);
    localContentValues.put("account_type", "com.twitter.android.auth.login");
    localContentValues.put("ungrouped_visible", Integer.valueOf(0));
    paramContext.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, localContentValues);
    return localAccount;
  }

  public static void a(Account paramAccount, String paramString, boolean paramBoolean)
  {
    if (paramAccount != null)
      ContentResolver.setSyncAutomatically(paramAccount, paramString, paramBoolean);
  }

  public static void a(Context paramContext, String paramString, ad paramad, cb paramcb)
  {
    Account localAccount = a(paramContext, paramString);
    if (localAccount != null)
    {
      AccountManager localAccountManager = AccountManager.get(paramContext);
      if (paramad != null)
        localAccountManager.setUserData(localAccount, "account_user_info", do.a(paramad));
      if (paramcb != null)
        localAccountManager.setUserData(localAccount, "account_settings", paramcb.toString());
      return;
    }
    Log.w("TwitterAccountHelper", "Account not found: " + paramString);
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Account localAccount = a(paramContext, paramString);
    if (localAccount == null)
    {
      Log.e("TwitterAccountHelper", "Account not found " + paramString);
      return;
    }
    ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", paramBoolean1);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("account_name", paramString);
    localContentValues.put("account_type", "com.twitter.android.auth.login");
    if (paramBoolean2);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("ungrouped_visible", Integer.valueOf(i));
      paramContext.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, localContentValues);
      return;
    }
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    Account localAccount = a(paramContext, paramString1);
    return (localAccount != null) && (ContentResolver.getSyncAutomatically(localAccount, paramString2));
  }

  public static void b(Context paramContext, String paramString)
  {
    AccountManager localAccountManager = AccountManager.get(paramContext);
    Account[] arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
    int i = arrayOfAccount.length;
    for (int j = 0; ; j++)
      if (j < i)
      {
        Account localAccount = arrayOfAccount[j];
        if (localAccount.name.equals(paramString))
          localAccountManager.removeAccount(localAccount, null, null);
      }
      else
      {
        return;
      }
  }

  public static boolean c(Context paramContext, String paramString)
  {
    Cursor localCursor = paramContext.getContentResolver().query(ContactsContract.Settings.CONTENT_URI, new String[] { "ungrouped_visible" }, "account_type=" + DatabaseUtils.sqlEscapeString("com.twitter.android.auth.login") + " AND " + "account_name" + "=" + DatabaseUtils.sqlEscapeString(paramString), null, null);
    if (localCursor == null)
      return false;
    try
    {
      if (localCursor.moveToNext())
      {
        int j = localCursor.getInt(0);
        i = j;
        localCursor.close();
        if (i == 1)
          return true;
      }
    }
    finally
    {
      localCursor.close();
    }
    while (true)
    {
      return false;
      int i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
