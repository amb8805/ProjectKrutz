// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public class MonitoredActivity extends Activity
{
    public static class LifeCycleAdapter
        implements LifeCycleListener
    {

        public LifeCycleAdapter()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void onActivityCreated(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }

        public void onActivityDestroyed(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }

        public void onActivityPaused(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }

        public void onActivityResumed(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }

        public void onActivityStarted(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }

        public void onActivityStopped(MonitoredActivity monitoredactivity)
        {
        //    0    0:return          
        }
    }

    public static interface LifeCycleListener
    {

        public abstract void onActivityCreated(MonitoredActivity monitoredactivity);

        public abstract void onActivityDestroyed(MonitoredActivity monitoredactivity);

        public abstract void onActivityPaused(MonitoredActivity monitoredactivity);

        public abstract void onActivityResumed(MonitoredActivity monitoredactivity);

        public abstract void onActivityStarted(MonitoredActivity monitoredactivity);

        public abstract void onActivityStopped(MonitoredActivity monitoredactivity);
    }


    public MonitoredActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Activity()>
    //    2    4:aload_0         
    //    3    5:new             #13  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #14  <Method void ArrayList()>
    //    6   12:putfield        #16  <Field ArrayList mListeners>
    //    7   15:return          
    }

    public void addLifeCycleListener(LifeCycleListener lifecyclelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ArrayList mListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #22  <Method boolean ArrayList.contains(Object)>
    //    4    8:ifeq            12
    //    5   11:return          
    //    6   12:aload_0         
    //    7   13:getfield        #16  <Field ArrayList mListeners>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
    //   10   20:pop             
    //   11   21:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #29  <Method void Activity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #16  <Field ArrayList mListeners>
    //    5    9:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
    //    6   12:astore_2        
    //    7   13:aload_2         
    //    8   14:invokeinterface #39  <Method boolean Iterator.hasNext()>
    //    9   19:ifne            23
    //   10   22:return          
    //   11   23:aload_2         
    //   12   24:invokeinterface #43  <Method Object Iterator.next()>
    //   13   29:checkcast       #45  <Class MonitoredActivity$LifeCycleListener>
    //   14   32:aload_0         
    //   15   33:invokeinterface #49  <Method void MonitoredActivity$LifeCycleListener.onActivityCreated(MonitoredActivity)>
    //   16   38:goto            13
    }

    protected void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #52  <Method void Activity.onDestroy()>
    //    2    4:aload_0         
    //    3    5:getfield        #16  <Field ArrayList mListeners>
    //    4    8:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokeinterface #39  <Method boolean Iterator.hasNext()>
    //    8   18:ifne            22
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:invokeinterface #43  <Method Object Iterator.next()>
    //   12   28:checkcast       #45  <Class MonitoredActivity$LifeCycleListener>
    //   13   31:aload_0         
    //   14   32:invokeinterface #55  <Method void MonitoredActivity$LifeCycleListener.onActivityDestroyed(MonitoredActivity)>
    //   15   37:goto            12
    }

    protected void onStart()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #58  <Method void Activity.onStart()>
    //    2    4:aload_0         
    //    3    5:getfield        #16  <Field ArrayList mListeners>
    //    4    8:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokeinterface #39  <Method boolean Iterator.hasNext()>
    //    8   18:ifne            22
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:invokeinterface #43  <Method Object Iterator.next()>
    //   12   28:checkcast       #45  <Class MonitoredActivity$LifeCycleListener>
    //   13   31:aload_0         
    //   14   32:invokeinterface #61  <Method void MonitoredActivity$LifeCycleListener.onActivityStarted(MonitoredActivity)>
    //   15   37:goto            12
    }

    protected void onStop()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #64  <Method void Activity.onStop()>
    //    2    4:aload_0         
    //    3    5:getfield        #16  <Field ArrayList mListeners>
    //    4    8:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokeinterface #39  <Method boolean Iterator.hasNext()>
    //    8   18:ifne            22
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:invokeinterface #43  <Method Object Iterator.next()>
    //   12   28:checkcast       #45  <Class MonitoredActivity$LifeCycleListener>
    //   13   31:aload_0         
    //   14   32:invokeinterface #67  <Method void MonitoredActivity$LifeCycleListener.onActivityStopped(MonitoredActivity)>
    //   15   37:goto            12
    }

    public void removeLifeCycleListener(LifeCycleListener lifecyclelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ArrayList mListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    private final ArrayList mListeners;
}
