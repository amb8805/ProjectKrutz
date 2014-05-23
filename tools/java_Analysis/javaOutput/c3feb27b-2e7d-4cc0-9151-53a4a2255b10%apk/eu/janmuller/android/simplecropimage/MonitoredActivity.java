package eu.janmuller.android.simplecropimage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public class MonitoredActivity extends Activity
{
  private final ArrayList<MonitoredActivity.LifeCycleListener> mListeners = new ArrayList();

  public MonitoredActivity()
  {
  }

  public void addLifeCycleListener(MonitoredActivity.LifeCycleListener paramLifeCycleListener)
  {
    if (this.mListeners.contains(paramLifeCycleListener))
      return;
    this.mListeners.add(paramLifeCycleListener);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Iterator localIterator = this.mListeners.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((MonitoredActivity.LifeCycleListener)localIterator.next()).onActivityCreated(this);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.mListeners.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((MonitoredActivity.LifeCycleListener)localIterator.next()).onActivityDestroyed(this);
    }
  }

  protected void onStart()
  {
    super.onStart();
    Iterator localIterator = this.mListeners.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((MonitoredActivity.LifeCycleListener)localIterator.next()).onActivityStarted(this);
    }
  }

  protected void onStop()
  {
    super.onStop();
    Iterator localIterator = this.mListeners.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((MonitoredActivity.LifeCycleListener)localIterator.next()).onActivityStopped(this);
    }
  }

  public void removeLifeCycleListener(MonitoredActivity.LifeCycleListener paramLifeCycleListener)
  {
    this.mListeners.remove(paramLifeCycleListener);
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.MonitoredActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
