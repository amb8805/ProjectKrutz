package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

final class u extends t
{
  u()
  {
  }

  public final Intent a(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getParentActivityIntent();
    if (localIntent == null)
      localIntent = super.a(paramActivity);
    return localIntent;
  }

  public final String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str = paramActivityInfo.parentActivityName;
    if (str == null)
      str = super.a(paramContext, paramActivityInfo);
    return str;
  }

  public final boolean a(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.shouldUpRecreateTask(paramIntent);
  }

  public final void b(Activity paramActivity, Intent paramIntent)
  {
    paramActivity.navigateUpTo(paramIntent);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
