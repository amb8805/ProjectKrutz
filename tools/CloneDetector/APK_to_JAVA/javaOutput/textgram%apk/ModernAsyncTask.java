// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.os.*;
import android.util.Log;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask
{
    private static class AsyncTaskResult
    {

        transient AsyncTaskResult(ModernAsyncTask modernasynctask, Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #17  <Field ModernAsyncTask mTask>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field Object[] mData>
        //    8   14:return          
        }

        final Object mData[];
        final ModernAsyncTask mTask;
    }

    private static class InternalHandler extends Handler
    {

        private InternalHandler()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Handler()>
        //    2    4:return          
        }

        InternalHandler(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void ModernAsyncTask$InternalHandler()>
        //    2    4:return          
        }

        public void handleMessage(Message message)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #18  <Field Object Message.obj>
        //    2    4:checkcast       #20  <Class ModernAsyncTask$AsyncTaskResult>
        //    3    7:astore_2        
        //    4    8:aload_1         
        //    5    9:getfield        #24  <Field int Message.what>
        //    6   12:tableswitch     1 2: default 36
        //                       1 37
        //                       2 51
        //    7   36:return          
        //    8   37:aload_2         
        //    9   38:getfield        #28  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
        //   10   41:aload_2         
        //   11   42:getfield        #32  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
        //   12   45:iconst_0        
        //   13   46:aaload          
        //   14   47:invokestatic    #38  <Method void ModernAsyncTask.access$500(ModernAsyncTask, Object)>
        //   15   50:return          
        //   16   51:aload_2         
        //   17   52:getfield        #28  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
        //   18   55:aload_2         
        //   19   56:getfield        #32  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
        //   20   59:invokevirtual   #42  <Method void ModernAsyncTask.onProgressUpdate(Object[])>
        //   21   62:return          
        }
    }

    public static final class Status extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class ModernAsyncTask$Status>
        //    1    3:dup             
        //    2    4:ldc1            #14  <String "PENDING">
        //    3    6:iconst_0        
        //    4    7:invokespecial   #18  <Method void ModernAsyncTask$Status(String, int)>
        //    5   10:putstatic       #20  <Field ModernAsyncTask$Status PENDING>
        //    6   13:new             #2   <Class ModernAsyncTask$Status>
        //    7   16:dup             
        //    8   17:ldc1            #21  <String "RUNNING">
        //    9   19:iconst_1        
        //   10   20:invokespecial   #18  <Method void ModernAsyncTask$Status(String, int)>
        //   11   23:putstatic       #23  <Field ModernAsyncTask$Status RUNNING>
        //   12   26:new             #2   <Class ModernAsyncTask$Status>
        //   13   29:dup             
        //   14   30:ldc1            #24  <String "FINISHED">
        //   15   32:iconst_2        
        //   16   33:invokespecial   #18  <Method void ModernAsyncTask$Status(String, int)>
        //   17   36:putstatic       #26  <Field ModernAsyncTask$Status FINISHED>
        //   18   39:iconst_3        
        //   19   40:anewarray       Status[]
        //   20   43:astore_0        
        //   21   44:aload_0         
        //   22   45:iconst_0        
        //   23   46:getstatic       #20  <Field ModernAsyncTask$Status PENDING>
        //   24   49:aastore         
        //   25   50:aload_0         
        //   26   51:iconst_1        
        //   27   52:getstatic       #23  <Field ModernAsyncTask$Status RUNNING>
        //   28   55:aastore         
        //   29   56:aload_0         
        //   30   57:iconst_2        
        //   31   58:getstatic       #26  <Field ModernAsyncTask$Status FINISHED>
        //   32   61:aastore         
        //   33   62:aload_0         
        //   34   63:putstatic       #28  <Field ModernAsyncTask$Status[] $VALUES>
        //   35   66:return          
        }

        private Status(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #29  <Method void Enum(String, int)>
        //    4    6:return          
        }

        public static Status valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class ModernAsyncTask$Status>
        //    1    2:aload_0         
        //    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class ModernAsyncTask$Status>
        //    4    9:areturn         
        }

        public static Status[] values()
        {
        //    0    0:getstatic       #28  <Field ModernAsyncTask$Status[] $VALUES>
        //    1    3:invokevirtual   #41  <Method Object _5B_Landroid.support.v4.content.ModernAsyncTask$Status_3B_.clone()>
        //    2    6:checkcast       #37  <Class ModernAsyncTask$Status[]>
        //    3    9:areturn         
        }

        private static final Status $VALUES[];
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
    }

    private static abstract class WorkerRunnable
        implements Callable
    {

        private WorkerRunnable()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:return          
        }

        WorkerRunnable(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void ModernAsyncTask$WorkerRunnable()>
        //    2    4:return          
        }

        Object mParams[];
    }


    static 
    {
    //    0    0:new             #43  <Class ModernAsyncTask$1>
    //    1    3:dup             
    //    2    4:invokespecial   #46  <Method void ModernAsyncTask$1()>
    //    3    7:putstatic       #48  <Field ThreadFactory sThreadFactory>
    //    4   10:new             #50  <Class LinkedBlockingQueue>
    //    5   13:dup             
    //    6   14:bipush          10
    //    7   16:invokespecial   #53  <Method void LinkedBlockingQueue(int)>
    //    8   19:putstatic       #55  <Field BlockingQueue sPoolWorkQueue>
    //    9   22:new             #57  <Class ThreadPoolExecutor>
    //   10   25:dup             
    //   11   26:iconst_5        
    //   12   27:sipush          128
    //   13   30:lconst_1        
    //   14   31:getstatic       #63  <Field TimeUnit TimeUnit.SECONDS>
    //   15   34:getstatic       #55  <Field BlockingQueue sPoolWorkQueue>
    //   16   37:getstatic       #48  <Field ThreadFactory sThreadFactory>
    //   17   40:invokespecial   #66  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
    //   18   43:putstatic       #68  <Field Executor THREAD_POOL_EXECUTOR>
    //   19   46:new             #70  <Class ModernAsyncTask$InternalHandler>
    //   20   49:dup             
    //   21   50:aconst_null     
    //   22   51:invokespecial   #73  <Method void ModernAsyncTask$InternalHandler(ModernAsyncTask$1)>
    //   23   54:putstatic       #75  <Field ModernAsyncTask$InternalHandler sHandler>
    //   24   57:getstatic       #68  <Field Executor THREAD_POOL_EXECUTOR>
    //   25   60:putstatic       #77  <Field Executor sDefaultExecutor>
    //   26   63:return          
    }

    public ModernAsyncTask()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #78  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #83  <Field ModernAsyncTask$Status ModernAsyncTask$Status.PENDING>
    //    4    8:putfield        #85  <Field ModernAsyncTask$Status mStatus>
    //    5   11:aload_0         
    //    6   12:new             #87  <Class AtomicBoolean>
    //    7   15:dup             
    //    8   16:invokespecial   #88  <Method void AtomicBoolean()>
    //    9   19:putfield        #90  <Field AtomicBoolean mTaskInvoked>
    //   10   22:aload_0         
    //   11   23:new             #92  <Class ModernAsyncTask$2>
    //   12   26:dup             
    //   13   27:aload_0         
    //   14   28:invokespecial   #95  <Method void ModernAsyncTask$2(ModernAsyncTask)>
    //   15   31:putfield        #97  <Field ModernAsyncTask$WorkerRunnable mWorker>
    //   16   34:aload_0         
    //   17   35:new             #99  <Class ModernAsyncTask$3>
    //   18   38:dup             
    //   19   39:aload_0         
    //   20   40:aload_0         
    //   21   41:getfield        #97  <Field ModernAsyncTask$WorkerRunnable mWorker>
    //   22   44:invokespecial   #102 <Method void ModernAsyncTask$3(ModernAsyncTask, Callable)>
    //   23   47:putfield        #104 <Field FutureTask mFuture>
    //   24   50:return          
    }

    static AtomicBoolean access$200(ModernAsyncTask modernasynctask)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AtomicBoolean mTaskInvoked>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #90  <Field AtomicBoolean mTaskInvoked>
    //    5    4:areturn         
    }

    static Object access$300(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #112 <Method Object postResult(Object)>
    //    3    5:areturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #112 <Method Object postResult(Object)>
    //    7    5:areturn         
    }

    static void access$400(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #118 <Method void postResultIfNotInvoked(Object)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #118 <Method void postResultIfNotInvoked(Object)>
    //    7    5:return          
    }

    static void access$500(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #122 <Method void finish(Object)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #122 <Method void finish(Object)>
    //    7    5:return          
    }

    public static void execute(Runnable runnable)
    {
    //    0    0:getstatic       #77  <Field Executor sDefaultExecutor>
    //    1    3:aload_0         
    //    2    4:invokeinterface #128 <Method void Executor.execute(Runnable)>
    //    3    9:return          
    }

    private void finish(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #132 <Method boolean isCancelled()>
    //    2    4:ifeq            20
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokevirtual   #135 <Method void onCancelled(Object)>
    //    6   12:aload_0         
    //    7   13:getstatic       #138 <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
    //    8   16:putfield        #85  <Field ModernAsyncTask$Status mStatus>
    //    9   19:return          
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokevirtual   #141 <Method void onPostExecute(Object)>
    //   13   25:goto            12
    }

    public static void init()
    {
    //    0    0:getstatic       #75  <Field ModernAsyncTask$InternalHandler sHandler>
    //    1    3:invokevirtual   #146 <Method android.os.Looper ModernAsyncTask$InternalHandler.getLooper()>
    //    2    6:pop             
    //    3    7:return          
    }

    private Object postResult(Object obj)
    {
    //    0    0:getstatic       #75  <Field ModernAsyncTask$InternalHandler sHandler>
    //    1    3:iconst_1        
    //    2    4:new             #148 <Class ModernAsyncTask$AsyncTaskResult>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:anewarray       Object[]
    //    7   13:dup             
    //    8   14:iconst_0        
    //    9   15:aload_1         
    //   10   16:aastore         
    //   11   17:invokespecial   #151 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
    //   12   20:invokevirtual   #155 <Method Message ModernAsyncTask$InternalHandler.obtainMessage(int, Object)>
    //   13   23:invokevirtual   #160 <Method void Message.sendToTarget()>
    //   14   26:aload_1         
    //   15   27:areturn         
    }

    private void postResultIfNotInvoked(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AtomicBoolean mTaskInvoked>
    //    2    4:invokevirtual   #163 <Method boolean AtomicBoolean.get()>
    //    3    7:ifne            16
    //    4   10:aload_0         
    //    5   11:aload_1         
    //    6   12:invokespecial   #112 <Method Object postResult(Object)>
    //    7   15:pop             
    //    8   16:return          
    }

    public static void setDefaultExecutor(Executor executor)
    {
    //    0    0:aload_0         
    //    1    1:putstatic       #77  <Field Executor sDefaultExecutor>
    //    2    4:return          
    }

    public final boolean cancel(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field FutureTask mFuture>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #171 <Method boolean FutureTask.cancel(boolean)>
    //    4    8:ireturn         
    }

    protected transient abstract Object doInBackground(Object aobj[]);

    public final transient ModernAsyncTask execute(Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:getstatic       #77  <Field Executor sDefaultExecutor>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #178 <Method ModernAsyncTask executeOnExecutor(Executor, Object[])>
    //    4    8:areturn         
    }

    public final transient ModernAsyncTask executeOnExecutor(Executor executor, Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field ModernAsyncTask$Status mStatus>
    //    2    4:getstatic       #83  <Field ModernAsyncTask$Status ModernAsyncTask$Status.PENDING>
    //    3    7:if_acmpeq       44
    //    4   10:getstatic       #184 <Field int[] ModernAsyncTask$4.$SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
    //    5   13:aload_0         
    //    6   14:getfield        #85  <Field ModernAsyncTask$Status mStatus>
    //    7   17:invokevirtual   #188 <Method int ModernAsyncTask$Status.ordinal()>
    //    8   20:iaload          
    //    9   21:tableswitch     1 2: default 44
    //                   1 75
    //                   2 85
    //   10   44:aload_0         
    //   11   45:getstatic       #191 <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
    //   12   48:putfield        #85  <Field ModernAsyncTask$Status mStatus>
    //   13   51:aload_0         
    //   14   52:invokevirtual   #194 <Method void onPreExecute()>
    //   15   55:aload_0         
    //   16   56:getfield        #97  <Field ModernAsyncTask$WorkerRunnable mWorker>
    //   17   59:aload_2         
    //   18   60:putfield        #200 <Field Object[] ModernAsyncTask$WorkerRunnable.mParams>
    //   19   63:aload_1         
    //   20   64:aload_0         
    //   21   65:getfield        #104 <Field FutureTask mFuture>
    //   22   68:invokeinterface #128 <Method void Executor.execute(Runnable)>
    //   23   73:aload_0         
    //   24   74:areturn         
    //   25   75:new             #202 <Class IllegalStateException>
    //   26   78:dup             
    //   27   79:ldc1            #204 <String "Cannot execute task: the task is already running.">
    //   28   81:invokespecial   #207 <Method void IllegalStateException(String)>
    //   29   84:athrow          
    //   30   85:new             #202 <Class IllegalStateException>
    //   31   88:dup             
    //   32   89:ldc1            #209 <String "Cannot execute task: the task has already been executed (a task can be executed only once)">
    //   33   91:invokespecial   #207 <Method void IllegalStateException(String)>
    //   34   94:athrow          
    }

    public final Object get()
        throws InterruptedException, ExecutionException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field FutureTask mFuture>
    //    2    4:invokevirtual   #216 <Method Object FutureTask.get()>
    //    3    7:areturn         
    }

    public final Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field FutureTask mFuture>
    //    2    4:lload_1         
    //    3    5:aload_3         
    //    4    6:invokevirtual   #221 <Method Object FutureTask.get(long, TimeUnit)>
    //    5    9:areturn         
    }

    public final Status getStatus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field ModernAsyncTask$Status mStatus>
    //    2    4:areturn         
    }

    public final boolean isCancelled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field FutureTask mFuture>
    //    2    4:invokevirtual   #224 <Method boolean FutureTask.isCancelled()>
    //    3    7:ireturn         
    }

    protected void onCancelled()
    {
    //    0    0:return          
    }

    protected void onCancelled(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #226 <Method void onCancelled()>
    //    2    4:return          
    }

    protected void onPostExecute(Object obj)
    {
    //    0    0:return          
    }

    protected void onPreExecute()
    {
    //    0    0:return          
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
    //    0    0:return          
    }

    protected final transient void publishProgress(Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #132 <Method boolean isCancelled()>
    //    2    4:ifne            26
    //    3    7:getstatic       #75  <Field ModernAsyncTask$InternalHandler sHandler>
    //    4   10:iconst_2        
    //    5   11:new             #148 <Class ModernAsyncTask$AsyncTaskResult>
    //    6   14:dup             
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:invokespecial   #151 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
    //   10   20:invokevirtual   #155 <Method Message ModernAsyncTask$InternalHandler.obtainMessage(int, Object)>
    //   11   23:invokevirtual   #160 <Method void Message.sendToTarget()>
    //   12   26:return          
    }

    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE = 128;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static final InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final FutureTask mFuture;
    private volatile Status mStatus;
    private final AtomicBoolean mTaskInvoked;
    private final WorkerRunnable mWorker;

    static AtomicBoolean access$200(ModernAsyncTask modernasynctask)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AtomicBoolean mTaskInvoked>
    //    2    4:areturn         
    }

    static Object access$300(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #112 <Method Object postResult(Object)>
    //    3    5:areturn         
    }

    static void access$400(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #118 <Method void postResultIfNotInvoked(Object)>
    //    3    5:return          
    }

    static void access$500(ModernAsyncTask modernasynctask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #122 <Method void finish(Object)>
    //    3    5:return          
    }

    // Unreferenced inner class android/support/v4/content/ModernAsyncTask$1

/* anonymous class */
    static final class _cls1
        implements ThreadFactory
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #16  <Class AtomicInteger>
        //    4    8:dup             
        //    5    9:iconst_1        
        //    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
        //    7   13:putfield        #21  <Field AtomicInteger mCount>
        //    8   16:return          
        }

        public Thread newThread(Runnable runnable)
        {
        //    0    0:new             #25  <Class Thread>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:new             #27  <Class StringBuilder>
        //    4    8:dup             
        //    5    9:invokespecial   #28  <Method void StringBuilder()>
        //    6   12:ldc1            #30  <String "ModernAsyncTask #">
        //    7   14:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
        //    8   17:aload_0         
        //    9   18:getfield        #21  <Field AtomicInteger mCount>
        //   10   21:invokevirtual   #38  <Method int AtomicInteger.getAndIncrement()>
        //   11   24:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
        //   12   27:invokevirtual   #45  <Method String StringBuilder.toString()>
        //   13   30:invokespecial   #48  <Method void Thread(Runnable, String)>
        //   14   33:areturn         
        }

        private final AtomicInteger mCount;
    }


    // Unreferenced inner class android/support/v4/content/ModernAsyncTask$2

/* anonymous class */
    class _cls2 extends WorkerRunnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field ModernAsyncTask this$0>
        //    3    5:aload_0         
        //    4    6:aconst_null     
        //    5    7:invokespecial   #18  <Method void ModernAsyncTask$WorkerRunnable(ModernAsyncTask$1)>
        //    6   10:return          
        }

        public Object call()
            throws Exception
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field ModernAsyncTask this$0>
        //    2    4:invokestatic    #26  <Method AtomicBoolean ModernAsyncTask.access$200(ModernAsyncTask)>
        //    3    7:iconst_1        
        //    4    8:invokevirtual   #32  <Method void AtomicBoolean.set(boolean)>
        //    5   11:bipush          10
        //    6   13:invokestatic    #38  <Method void Process.setThreadPriority(int)>
        //    7   16:aload_0         
        //    8   17:getfield        #15  <Field ModernAsyncTask this$0>
        //    9   20:aload_0         
        //   10   21:getfield        #15  <Field ModernAsyncTask this$0>
        //   11   24:aload_0         
        //   12   25:getfield        #42  <Field Object[] mParams>
        //   13   28:invokevirtual   #46  <Method Object ModernAsyncTask.doInBackground(Object[])>
        //   14   31:invokestatic    #50  <Method Object ModernAsyncTask.access$300(ModernAsyncTask, Object)>
        //   15   34:areturn         
        }

        final ModernAsyncTask this$0;
    }


    // Unreferenced inner class android/support/v4/content/ModernAsyncTask$3

/* anonymous class */
    class _cls3 extends FutureTask
    {

        _cls3(Callable callable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field ModernAsyncTask this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
        //    6   10:return          
        }

        protected void done()
        {
        // try 0 15 handler(s) 16 27 42 52
        //    0    0:aload_0         
        //    1    1:invokevirtual   #31  <Method Object get()>
        //    2    4:astore          6
        //    3    6:aload_0         
        //    4    7:getfield        #15  <Field ModernAsyncTask this$0>
        //    5   10:aload           6
        //    6   12:invokestatic    #35  <Method void ModernAsyncTask.access$400(ModernAsyncTask, Object)>
        //    7   15:return          
        // catch InterruptedException
        //    8   16:astore          4
        //    9   18:ldc1            #37  <String "AsyncTask">
        //   10   20:aload           4
        //   11   22:invokestatic    #43  <Method int Log.w(String, Throwable)>
        //   12   25:pop             
        //   13   26:return          
        // catch ExecutionException
        //   14   27:astore_3        
        //   15   28:new             #45  <Class RuntimeException>
        //   16   31:dup             
        //   17   32:ldc1            #47  <String "An error occured while executing doInBackground()">
        //   18   34:aload_3         
        //   19   35:invokevirtual   #51  <Method Throwable ExecutionException.getCause()>
        //   20   38:invokespecial   #54  <Method void RuntimeException(String, Throwable)>
        //   21   41:athrow          
        // catch CancellationException
        //   22   42:astore_2        
        //   23   43:aload_0         
        //   24   44:getfield        #15  <Field ModernAsyncTask this$0>
        //   25   47:aconst_null     
        //   26   48:invokestatic    #35  <Method void ModernAsyncTask.access$400(ModernAsyncTask, Object)>
        //   27   51:return          
        // catch Throwable
        //   28   52:astore_1        
        //   29   53:new             #45  <Class RuntimeException>
        //   30   56:dup             
        //   31   57:ldc1            #47  <String "An error occured while executing doInBackground()">
        //   32   59:aload_1         
        //   33   60:invokespecial   #54  <Method void RuntimeException(String, Throwable)>
        //   34   63:athrow          
        }

        final ModernAsyncTask this$0;
    }


    // Unreferenced inner class android/support/v4/content/ModernAsyncTask$4

/* anonymous class */
    static class _cls4
    {

        static 
        {
        //    0    0:invokestatic    #18  <Method ModernAsyncTask$Status[] ModernAsyncTask$Status.values()>
        //    1    3:arraylength     
        //    2    4:newarray        int[]
        //    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
        // try 9 20 handler(s) 34
        //    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
        //    5   12:getstatic       #24  <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
        //    6   15:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
        //    7   18:iconst_1        
        //    8   19:iastore         
        // try 20 31 handler(s) 32
        //    9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
        //   10   23:getstatic       #31  <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
        //   11   26:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
        //   12   29:iconst_2        
        //   13   30:iastore         
        //   14   31:return          
        // catch NoSuchFieldError
        //   15   32:astore_1        
        //   16   33:return          
        // catch NoSuchFieldError
        //   17   34:astore_0        
        //   18   35:goto            20
        }

        static final int $SwitchMap$android$support$v4$content$ModernAsyncTask$Status[];
    }

}
