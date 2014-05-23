package com.twitter.android.platform;

import aa;
import ac;
import ad;
import ai;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import bq;
import cl;
import com.twitter.android.provider.ak;
import do;
import dw;
import ef;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.json.JSONException;

final class m extends AbstractThreadedSyncAdapter
{
  private static final boolean a = Log.isLoggable("TwitterContactsSync", 3);
  private static final boolean b = Log.isLoggable("TwitterContactsSync", 2);

  public m(Context paramContext)
  {
    super(paramContext, true);
  }

  private static void a(Context paramContext, HttpClient paramHttpClient, Account paramAccount, ac paramac, ad paramad, SyncResult paramSyncResult)
  {
    if (a)
      Log.d("TwitterContactsSync", "=====> Sync friends enter");
    j localj = k.b(paramContext, paramAccount);
    boolean bool2;
    boolean bool1;
    if (!"DONE".equals(localj.b()))
    {
      k.a(paramContext, paramAccount, localj);
      cl localcl = new cl(paramac);
      bool2 = a(paramContext, paramHttpClient, localcl, paramad.a, localj, paramAccount, paramSyncResult);
      if (a)
        Log.d("TwitterContactsSync", "Twitter sync complete: " + bool2);
      if (!bool2)
        break label644;
      k.b(paramContext, paramAccount, localj);
      bool1 = bool2;
    }
    while (true)
    {
      Map localMap = k.a(paramContext, paramAccount.name);
      if (b)
        Log.v("TwitterContactsSync", "Downloading image count: " + localMap.size());
      int i;
      label183: Iterator localIterator;
      int j;
      if (paramContext.getResources().getDisplayMetrics().density > 1.0F)
      {
        i = 1;
        localIterator = localMap.keySet().iterator();
        j = 0;
      }
      while (true)
        if (localIterator.hasNext())
        {
          Long localLong = (Long)localIterator.next();
          if (b)
            Log.v("TwitterContactsSync", "Downloading image for user: " + localLong);
          String str1 = (String)localMap.get(localLong);
          if (i != 0)
            str1 = str1.replace("_normal.", "_bigger.");
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(4096);
          HttpGet localHttpGet = new HttpGet(str1);
          n localn = new n(paramHttpClient, localHttpGet, localByteArrayOutputStream);
          localn.a(0);
          int k = localn.c;
          String str2 = localn.d;
          Exception localException = localn.e;
          if (k == 200)
          {
            int m = j + 1;
            k.a(paramContext, localLong, 200, localByteArrayOutputStream.toByteArray());
            j = m;
            continue;
            bool1 = true;
            break;
            i = 0;
            break label183;
          }
          if ((k == 403) || (k == 404) || (k == 417))
          {
            j++;
            k.a(paramContext, localLong, k, null);
            Log.w("TwitterContactsSync", "User image error ignored for user id: " + localLong + ' ' + k + '/' + str2);
          }
          else
          {
            k.a(paramContext, localLong, k, null);
            if ((localException != null) && (!(localException instanceof IOException)))
            {
              SyncStats localSyncStats2 = paramSyncResult.stats;
              localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
            }
            while (true)
            {
              Log.w("TwitterContactsSync", "User image download error for user id: " + localLong + ' ' + k + '/' + str2);
              break;
              SyncStats localSyncStats1 = paramSyncResult.stats;
              localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
            }
          }
        }
      if ((bool1) && (localMap.size() == j))
      {
        if (a)
          Log.d("TwitterContactsSync", "Sync end");
        k.a(paramContext, paramAccount);
      }
      if (a)
        Log.d("TwitterContactsSync", "====> Sync friends exit");
      return;
      label644: bool1 = bool2;
    }
  }

  private static boolean a(Context paramContext, HttpClient paramHttpClient, cl paramcl, long paramLong, j paramj, Account paramAccount, SyncResult paramSyncResult)
  {
    if (a)
      Log.d("TwitterContactsSync", "Fetching from cursor: " + paramj.c() + "...");
    ai localai = ai.a(paramContext);
    StringBuilder localStringBuilder1 = localai.a(new Object[] { "statuses", "friends" }).append(".json");
    ai.a(localStringBuilder1, "user_id", paramLong);
    String str = localStringBuilder1.toString();
    StringBuilder localStringBuilder2 = new StringBuilder();
    ak localak = ak.a(paramContext, paramLong);
    boolean bool1 = false;
    while (true)
      if (!bool1)
      {
        localStringBuilder2.append(str);
        if (paramj.c() != null)
          ai.a(localStringBuilder2, "cursor", paramj.c());
        try
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          n localn = n.a(localai, paramHttpClient, localStringBuilder2.toString(), paramcl, true, localByteArrayOutputStream);
          localn.a();
          if (localn.c == 200)
          {
            bq localbq = do.a.a(localByteArrayOutputStream.toByteArray());
            localbq.g();
            dw localdw = do.a(localbq);
            if (localdw == null)
            {
              SyncStats localSyncStats5 = paramSyncResult.stats;
              localSyncStats5.numParseExceptions = (1L + localSyncStats5.numParseExceptions);
              return false;
            }
            localak.a(localdw.b(), paramLong, 0, -1L, null, localdw.a());
            paramj.c(localdw.a());
            ArrayList localArrayList = localdw.b();
            if (a)
              Log.d("TwitterContactsSync", "Fetched friends: " + localArrayList.size() + ", next cursor: " + localdw.a());
            k.a(paramContext, paramAccount, localArrayList, paramj);
            boolean bool3 = "0".equals(localdw.a());
            bool2 = bool3;
          }
          while (true)
          {
            localStringBuilder2.delete(0, localStringBuilder2.length());
            bool1 = bool2;
            break;
            if (localn.c == 401)
            {
              SyncStats localSyncStats4 = paramSyncResult.stats;
              localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
              bool2 = bool1;
            }
            else
            {
              SyncStats localSyncStats3 = paramSyncResult.stats;
              localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
              bool2 = bool1;
            }
          }
        }
        catch (aa localaa)
        {
          while (true)
          {
            SyncStats localSyncStats2 = paramSyncResult.stats;
            localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
            boolean bool2 = bool1;
          }
        }
        catch (IOException localIOException)
        {
          SyncStats localSyncStats1 = paramSyncResult.stats;
          localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
          return false;
        }
        catch (OperationApplicationException localOperationApplicationException)
        {
          return false;
        }
        catch (RemoteException localRemoteException)
        {
          return false;
        }
      }
    if (a)
      Log.d("TwitterContactsSync", "Sync complete.");
    return bool1;
  }

  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    localSingleClientConnManager = new SingleClientConnManager(n.b, n.a);
    localHttpClient = n.a(localSingleClientConnManager);
    try
    {
      Context localContext = getContext();
      AccountManager localAccountManager = AccountManager.get(localContext);
      String str1 = localAccountManager.getUserData(paramAccount, "account_user_info");
      if (str1 == null)
      {
        SyncStats localSyncStats5 = paramSyncResult.stats;
        localSyncStats5.numAuthExceptions = (1L + localSyncStats5.numAuthExceptions);
        Log.e("TwitterContactsSync", "ACCOUNT_USER_INFO_KEY content not found.");
        return;
      }
      String str2 = localAccountManager.blockingGetAuthToken(paramAccount, "com.twitter.android.oauth.token", false);
      String str3 = localAccountManager.blockingGetAuthToken(paramAccount, "com.twitter.android.oauth.token.secret", false);
      if ((str2 == null) || (str3 == null))
      {
        SyncStats localSyncStats6 = paramSyncResult.stats;
        localSyncStats6.numAuthExceptions = (1L + localSyncStats6.numAuthExceptions);
        Log.e("TwitterContactsSync", "Token not found.");
        return;
      }
      ad localad = do.c(str1);
      a(localContext, localHttpClient, paramAccount, new ac(str2, str3), localad, paramSyncResult);
      return;
    }
    catch (AuthenticatorException localAuthenticatorException)
    {
      SyncStats localSyncStats4 = paramSyncResult.stats;
      localSyncStats4.numAuthExceptions = (1L + localSyncStats4.numAuthExceptions);
      return;
    }
    catch (OperationCanceledException localOperationCanceledException)
    {
      if (b)
        Log.v("TwitterContactsSync", "Contact sync canceled", localOperationCanceledException);
      return;
    }
    catch (OperationApplicationException localOperationApplicationException)
    {
      if (b)
        Log.v("TwitterContactsSync", "onPerformSync", localOperationApplicationException);
      return;
    }
    catch (IOException localIOException)
    {
      SyncStats localSyncStats3 = paramSyncResult.stats;
      localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
      return;
    }
    catch (JSONException localJSONException)
    {
      SyncStats localSyncStats2 = paramSyncResult.stats;
      localSyncStats2.numParseExceptions = (1L + localSyncStats2.numParseExceptions);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      SyncStats localSyncStats1 = paramSyncResult.stats;
      localSyncStats1.numAuthExceptions = (1L + localSyncStats1.numAuthExceptions);
      return;
    }
    finally
    {
      localSingleClientConnManager.shutdown();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
