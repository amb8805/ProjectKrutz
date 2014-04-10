// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package android.support.v4.content:
//            Loader, ModernAsyncTask

public abstract class AsyncTaskLoader extends Loader
{
    final class LoadTask extends ModernAsyncTask
        implements Runnable
    {

        LoadTask()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field AsyncTaskLoader this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #23  <Method void ModernAsyncTask()>
        //    5    9:aload_0         
        //    6   10:new             #25  <Class CountDownLatch>
        //    7   13:dup             
        //    8   14:iconst_1        
        //    9   15:invokespecial   #28  <Method void CountDownLatch(int)>
        //   10   18:putfield        #30  <Field CountDownLatch done>
        //   11   21:return          
        }

        static CountDownLatch access$000(LoadTask loadtask)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field CountDownLatch done>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #30  <Field CountDownLatch done>
        //    5    4:areturn         
        }

        protected volatile Object doInBackground(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #36  <Class Void[]>
        //    3    5:invokevirtual   #39  <Method Object doInBackground(Void[])>
        //    4    8:areturn         
        }

        protected transient Object doInBackground(Void avoid[])
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #20  <Field AsyncTaskLoader this$0>
        //    3    5:invokevirtual   #45  <Method Object AsyncTaskLoader.onLoadInBackground()>
        //    4    8:putfield        #47  <Field Object result>
        //    5   11:aload_0         
        //    6   12:getfield        #47  <Field Object result>
        //    7   15:areturn         
        }

        protected void onCancelled()
        {
        // try 0 12 handler(s) 20
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
        //    2    4:aload_0         
        //    3    5:aload_0         
        //    4    6:getfield        #47  <Field Object result>
        //    5    9:invokevirtual   #52  <Method void AsyncTaskLoader.dispatchOnCancelled(AsyncTaskLoader$LoadTask, Object)>
        //    6   12:aload_0         
        //    7   13:getfield        #30  <Field CountDownLatch done>
        //    8   16:invokevirtual   #55  <Method void CountDownLatch.countDown()>
        //    9   19:return          
        // finally
        //   10   20:astore_1        
        //   11   21:aload_0         
        //   12   22:getfield        #30  <Field CountDownLatch done>
        //   13   25:invokevirtual   #55  <Method void CountDownLatch.countDown()>
        //   14   28:aload_1         
        //   15   29:athrow          
        }

        protected void onPostExecute(Object obj)
        {
        // try 0 9 handler(s) 17
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #60  <Method void AsyncTaskLoader.dispatchOnLoadComplete(AsyncTaskLoader$LoadTask, Object)>
        //    5    9:aload_0         
        //    6   10:getfield        #30  <Field CountDownLatch done>
        //    7   13:invokevirtual   #55  <Method void CountDownLatch.countDown()>
        //    8   16:return          
        // finally
        //    9   17:astore_2        
        //   10   18:aload_0         
        //   11   19:getfield        #30  <Field CountDownLatch done>
        //   12   22:invokevirtual   #55  <Method void CountDownLatch.countDown()>
        //   13   25:aload_2         
        //   14   26:athrow          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:iconst_0        
        //    2    2:putfield        #63  <Field boolean waiting>
        //    3    5:aload_0         
        //    4    6:getfield        #20  <Field AsyncTaskLoader this$0>
        //    5    9:invokevirtual   #66  <Method void AsyncTaskLoader.executePendingTask()>
        //    6   12:return          
        }

        private CountDownLatch done;
        Object result;
        final AsyncTaskLoader this$0;
        boolean waiting;

        static CountDownLatch access$000(LoadTask loadtask)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field CountDownLatch done>
        //    2    4:areturn         
        }
    }


    public AsyncTaskLoader(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #25  <Method void Loader(Context)>
    //    3    5:aload_0         
    //    4    6:ldc2w           #26  <Long -10000L>
    //    5    9:putfield        #29  <Field long mLastLoadCompleteTime>
    //    6   12:return          
    }

    public boolean cancelLoad()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    2    4:ifnull          48
    //    3    7:aload_0         
    //    4    8:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //    5   11:ifnull          50
    //    6   14:aload_0         
    //    7   15:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    8   18:getfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //    9   21:ifeq            43
    //   10   24:aload_0         
    //   11   25:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   12   28:iconst_0        
    //   13   29:putfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   14   32:aload_0         
    //   15   33:getfield        #42  <Field Handler mHandler>
    //   16   36:aload_0         
    //   17   37:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   18   40:invokevirtual   #48  <Method void Handler.removeCallbacks(Runnable)>
    //   19   43:aload_0         
    //   20   44:aconst_null     
    //   21   45:putfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   22   48:iconst_0        
    //   23   49:ireturn         
    //   24   50:aload_0         
    //   25   51:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   26   54:getfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   27   57:ifeq            86
    //   28   60:aload_0         
    //   29   61:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   30   64:iconst_0        
    //   31   65:putfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   32   68:aload_0         
    //   33   69:getfield        #42  <Field Handler mHandler>
    //   34   72:aload_0         
    //   35   73:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   36   76:invokevirtual   #48  <Method void Handler.removeCallbacks(Runnable)>
    //   37   79:aload_0         
    //   38   80:aconst_null     
    //   39   81:putfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   40   84:iconst_0        
    //   41   85:ireturn         
    //   42   86:aload_0         
    //   43   87:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   44   90:iconst_0        
    //   45   91:invokevirtual   #52  <Method boolean AsyncTaskLoader$LoadTask.cancel(boolean)>
    //   46   94:istore_1        
    //   47   95:iload_1         
    //   48   96:ifeq            107
    //   49   99:aload_0         
    //   50  100:aload_0         
    //   51  101:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   52  104:putfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //   53  107:aload_0         
    //   54  108:aconst_null     
    //   55  109:putfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   56  112:iload_1         
    //   57  113:ireturn         
    }

    void dispatchOnCancelled(LoadTask loadtask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #58  <Method void onCanceled(Object)>
    //    3    5:aload_0         
    //    4    6:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //    5    9:aload_1         
    //    6   10:if_acmpne       33
    //    7   13:aload_0         
    //    8   14:invokevirtual   #62  <Method void rollbackContentChanged()>
    //    9   17:aload_0         
    //   10   18:invokestatic    #68  <Method long SystemClock.uptimeMillis()>
    //   11   21:putfield        #29  <Field long mLastLoadCompleteTime>
    //   12   24:aload_0         
    //   13   25:aconst_null     
    //   14   26:putfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //   15   29:aload_0         
    //   16   30:invokevirtual   #71  <Method void executePendingTask()>
    //   17   33:return          
    }

    void dispatchOnLoadComplete(LoadTask loadtask, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    2    4:aload_1         
    //    3    5:if_acmpeq       15
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #74  <Method void dispatchOnCancelled(AsyncTaskLoader$LoadTask, Object)>
    //    8   14:return          
    //    9   15:aload_0         
    //   10   16:invokevirtual   #77  <Method boolean isAbandoned()>
    //   11   19:ifeq            28
    //   12   22:aload_0         
    //   13   23:aload_2         
    //   14   24:invokevirtual   #58  <Method void onCanceled(Object)>
    //   15   27:return          
    //   16   28:aload_0         
    //   17   29:invokevirtual   #80  <Method void commitContentChanged()>
    //   18   32:aload_0         
    //   19   33:invokestatic    #68  <Method long SystemClock.uptimeMillis()>
    //   20   36:putfield        #29  <Field long mLastLoadCompleteTime>
    //   21   39:aload_0         
    //   22   40:aconst_null     
    //   23   41:putfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   24   44:aload_0         
    //   25   45:aload_2         
    //   26   46:invokevirtual   #83  <Method void deliverResult(Object)>
    //   27   49:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aload           4
    //    5    6:invokespecial   #87  <Method void Loader.dump(String, FileDescriptor, PrintWriter, String[])>
    //    6    9:aload_0         
    //    7   10:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    8   13:ifnull          52
    //    9   16:aload_3         
    //   10   17:aload_1         
    //   11   18:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   12   21:aload_3         
    //   13   22:ldc1            #95  <String "mTask=">
    //   14   24:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   15   27:aload_3         
    //   16   28:aload_0         
    //   17   29:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   18   32:invokevirtual   #97  <Method void PrintWriter.print(Object)>
    //   19   35:aload_3         
    //   20   36:ldc1            #99  <String " waiting=">
    //   21   38:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   22   41:aload_3         
    //   23   42:aload_0         
    //   24   43:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   25   46:getfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   26   49:invokevirtual   #103 <Method void PrintWriter.println(boolean)>
    //   27   52:aload_0         
    //   28   53:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //   29   56:ifnull          95
    //   30   59:aload_3         
    //   31   60:aload_1         
    //   32   61:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   33   64:aload_3         
    //   34   65:ldc1            #105 <String "mCancellingTask=">
    //   35   67:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   36   70:aload_3         
    //   37   71:aload_0         
    //   38   72:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //   39   75:invokevirtual   #97  <Method void PrintWriter.print(Object)>
    //   40   78:aload_3         
    //   41   79:ldc1            #99  <String " waiting=">
    //   42   81:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   43   84:aload_3         
    //   44   85:aload_0         
    //   45   86:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //   46   89:getfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   47   92:invokevirtual   #103 <Method void PrintWriter.println(boolean)>
    //   48   95:aload_0         
    //   49   96:getfield        #107 <Field long mUpdateThrottle>
    //   50   99:lconst_0        
    //   51  100:lcmp            
    //   52  101:ifeq            144
    //   53  104:aload_3         
    //   54  105:aload_1         
    //   55  106:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   56  109:aload_3         
    //   57  110:ldc1            #109 <String "mUpdateThrottle=">
    //   58  112:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   59  115:aload_0         
    //   60  116:getfield        #107 <Field long mUpdateThrottle>
    //   61  119:aload_3         
    //   62  120:invokestatic    #115 <Method void TimeUtils.formatDuration(long, PrintWriter)>
    //   63  123:aload_3         
    //   64  124:ldc1            #117 <String " mLastLoadCompleteTime=">
    //   65  126:invokevirtual   #93  <Method void PrintWriter.print(String)>
    //   66  129:aload_0         
    //   67  130:getfield        #29  <Field long mLastLoadCompleteTime>
    //   68  133:invokestatic    #68  <Method long SystemClock.uptimeMillis()>
    //   69  136:aload_3         
    //   70  137:invokestatic    #120 <Method void TimeUtils.formatDuration(long, long, PrintWriter)>
    //   71  140:aload_3         
    //   72  141:invokevirtual   #122 <Method void PrintWriter.println()>
    //   73  144:return          
    }

    void executePendingTask()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field AsyncTaskLoader$LoadTask mCancellingTask>
    //    2    4:ifnonnull       97
    //    3    7:aload_0         
    //    4    8:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    5   11:ifnull          97
    //    6   14:aload_0         
    //    7   15:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    8   18:getfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //    9   21:ifeq            43
    //   10   24:aload_0         
    //   11   25:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   12   28:iconst_0        
    //   13   29:putfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   14   32:aload_0         
    //   15   33:getfield        #42  <Field Handler mHandler>
    //   16   36:aload_0         
    //   17   37:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   18   40:invokevirtual   #48  <Method void Handler.removeCallbacks(Runnable)>
    //   19   43:aload_0         
    //   20   44:getfield        #107 <Field long mUpdateThrottle>
    //   21   47:lconst_0        
    //   22   48:lcmp            
    //   23   49:ifle            98
    //   24   52:invokestatic    #68  <Method long SystemClock.uptimeMillis()>
    //   25   55:aload_0         
    //   26   56:getfield        #29  <Field long mLastLoadCompleteTime>
    //   27   59:aload_0         
    //   28   60:getfield        #107 <Field long mUpdateThrottle>
    //   29   63:ladd            
    //   30   64:lcmp            
    //   31   65:ifge            98
    //   32   68:aload_0         
    //   33   69:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   34   72:iconst_1        
    //   35   73:putfield        #40  <Field boolean AsyncTaskLoader$LoadTask.waiting>
    //   36   76:aload_0         
    //   37   77:getfield        #42  <Field Handler mHandler>
    //   38   80:aload_0         
    //   39   81:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   40   84:aload_0         
    //   41   85:getfield        #29  <Field long mLastLoadCompleteTime>
    //   42   88:aload_0         
    //   43   89:getfield        #107 <Field long mUpdateThrottle>
    //   44   92:ladd            
    //   45   93:invokevirtual   #126 <Method boolean Handler.postAtTime(Runnable, long)>
    //   46   96:pop             
    //   47   97:return          
    //   48   98:aload_0         
    //   49   99:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   50  102:getstatic       #132 <Field java.util.concurrent.Executor ModernAsyncTask.THREAD_POOL_EXECUTOR>
    //   51  105:aconst_null     
    //   52  106:checkcast       #134 <Class Void[]>
    //   53  109:invokevirtual   #138 <Method ModernAsyncTask AsyncTaskLoader$LoadTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
    //   54  112:pop             
    //   55  113:return          
    }

    public abstract Object loadInBackground();

    public void onCanceled(Object obj)
    {
    //    0    0:return          
    }

    protected void onForceLoad()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #143 <Method void Loader.onForceLoad()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #145 <Method boolean cancelLoad()>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:new             #37  <Class AsyncTaskLoader$LoadTask>
    //    7   13:dup             
    //    8   14:aload_0         
    //    9   15:invokespecial   #148 <Method void AsyncTaskLoader$LoadTask(AsyncTaskLoader)>
    //   10   18:putfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #71  <Method void executePendingTask()>
    //   13   25:return          
    }

    protected Object onLoadInBackground()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #151 <Method Object loadInBackground()>
    //    2    4:areturn         
    }

    public void setUpdateThrottle(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #107 <Field long mUpdateThrottle>
    //    3    5:lload_1         
    //    4    6:lconst_0        
    //    5    7:lcmp            
    //    6    8:ifeq            22
    //    7   11:aload_0         
    //    8   12:new             #44  <Class Handler>
    //    9   15:dup             
    //   10   16:invokespecial   #155 <Method void Handler()>
    //   11   19:putfield        #42  <Field Handler mHandler>
    //   12   22:return          
    }

    public void waitForLoader()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field AsyncTaskLoader$LoadTask mTask>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          16
    // try 9 16 handler(s) 17
    //    5    9:aload_1         
    //    6   10:invokestatic    #162 <Method CountDownLatch AsyncTaskLoader$LoadTask.access$000(AsyncTaskLoader$LoadTask)>
    //    7   13:invokevirtual   #167 <Method void CountDownLatch.await()>
    //    8   16:return          
    // catch InterruptedException
    //    9   17:astore_2        
    //   10   18:return          
    }

    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile LoadTask mCancellingTask;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile LoadTask mTask;
    long mUpdateThrottle;
}
