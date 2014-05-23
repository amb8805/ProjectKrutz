package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class aj
  implements Iterable<Intent>
{
  private static final al a = new am();
  private final ArrayList<Intent> b = new ArrayList();
  private final Context c;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new an();
      return;
    }
  }

  private aj(Context paramContext)
  {
    this.c = paramContext;
  }

  private aj a(ComponentName paramComponentName)
  {
    int i = this.b.size();
    try
    {
      Intent localIntent;
      for (Object localObject = r.a(this.c, paramComponentName); localObject != null; localObject = localIntent)
      {
        this.b.add(i, localObject);
        localIntent = r.a(this.c, ((Intent)localObject).getComponent());
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(localNameNotFoundException);
    }
    return this;
  }

  public static aj a(Context paramContext)
  {
    return new aj(paramContext);
  }

  public final aj a(Activity paramActivity)
  {
    boolean bool = paramActivity instanceof ak;
    Intent localIntent1 = null;
    if (bool)
      localIntent1 = ((ak)paramActivity).a_();
    if (localIntent1 == null);
    for (Intent localIntent2 = r.a(paramActivity); ; localIntent2 = localIntent1)
    {
      if (localIntent2 != null)
      {
        ComponentName localComponentName = localIntent2.getComponent();
        if (localComponentName == null)
          localComponentName = localIntent2.resolveActivity(this.c.getPackageManager());
        a(localComponentName);
        this.b.add(localIntent2);
      }
      return this;
    }
  }

  public final void a()
  {
    int i = 1;
    if (this.b.isEmpty())
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    Intent[] arrayOfIntent = (Intent[])this.b.toArray(new Intent[this.b.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    Context localContext = this.c;
    int j = Build.VERSION.SDK_INT;
    if (j >= 16)
      localContext.startActivities(arrayOfIntent, null);
    while (true)
    {
      if (i == 0)
      {
        Intent localIntent = new Intent(arrayOfIntent[(-1 + arrayOfIntent.length)]);
        localIntent.addFlags(268435456);
        this.c.startActivity(localIntent);
      }
      return;
      if (j >= 11)
        localContext.startActivities(arrayOfIntent);
      else
        i = 0;
    }
  }

  public final Iterator<Intent> iterator()
  {
    return this.b.iterator();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
