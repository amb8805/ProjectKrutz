package com.spotify.mobile.android.util;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class dl extends t
{
  public dl()
  {
  }

  public final String a()
  {
    return "Threads";
  }

  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("Crashing thread:\n");
    localStringBuilder.append(Thread.currentThread().getName());
    localStringBuilder.append((char)'\n');
    localStringBuilder.append((char)'\n');
    localStringBuilder.append("All threads:\n");
    for (ThreadGroup localThreadGroup = Thread.currentThread().getThreadGroup(); localThreadGroup.getParent() != null; localThreadGroup = localThreadGroup.getParent());
    Thread[] arrayOfThread = new Thread[localThreadGroup.activeCount()];
    int i = localThreadGroup.enumerate(arrayOfThread, true);
    ConcurrentSkipListMap localConcurrentSkipListMap = new ConcurrentSkipListMap();
    for (int j = 0; j < i; j++)
    {
      localConcurrentSkipListMap.putIfAbsent(arrayOfThread[j].getName(), new AtomicInteger(0));
      ((AtomicInteger)localConcurrentSkipListMap.get(arrayOfThread[j].getName())).incrementAndGet();
    }
    Iterator localIterator = localConcurrentSkipListMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append((String)localEntry.getKey());
      if (((AtomicInteger)localEntry.getValue()).get() > 1)
        localStringBuilder.append(" * ").append(localEntry.getValue());
      localStringBuilder.append((char)'\n');
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
