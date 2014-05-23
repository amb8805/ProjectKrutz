package com.spotify.mobile.android.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

public final class dq
{
  private final Context a;

  public dq(Context paramContext)
  {
    this.a = paramContext;
  }

  private ComponentName a(Intent paramIntent)
  {
    Object localObject1 = null;
    PackageManager localPackageManager = this.a.getPackageManager();
    if (localPackageManager == null)
      return null;
    Iterator localIterator = localPackageManager.queryIntentActivities(paramIntent, 0).iterator();
    Object localObject2;
    if (localIterator.hasNext())
    {
      ActivityInfo localActivityInfo = ((ResolveInfo)localIterator.next()).activityInfo;
      if ((localActivityInfo == null) || (!"com.twitter.android".equals(localActivityInfo.packageName)))
        break label116;
      localObject2 = new ComponentName(localActivityInfo.packageName, localActivityInfo.name);
      if ("com.twitter.android.composer.TextFirstComposerActivity".equals(localActivityInfo.name))
        break label113;
    }
    while (true)
    {
      localObject1 = localObject2;
      break;
      localObject2 = localObject1;
      label113: return localObject2;
      label116: localObject2 = localObject1;
    }
  }

  public final Intent a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.TEXT", paramString);
    ComponentName localComponentName = a(localIntent);
    if (localComponentName == null)
      return null;
    localIntent.setComponent(localComponentName);
    return localIntent;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
