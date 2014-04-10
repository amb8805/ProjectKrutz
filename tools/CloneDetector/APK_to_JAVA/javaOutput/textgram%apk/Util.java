// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.*;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import java.io.Closeable;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            MonitoredActivity

public class Util
{
    private static class BackgroundJob extends MonitoredActivity.LifeCycleAdapter
        implements Runnable
    {

        public BackgroundJob(MonitoredActivity monitoredactivity, Runnable runnable, ProgressDialog progressdialog, Handler handler)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #20  <Method void MonitoredActivity$LifeCycleAdapter()>
        //    2    4:aload_0         
        //    3    5:new             #22  <Class Util$BackgroundJob$1>
        //    4    8:dup             
        //    5    9:aload_0         
        //    6   10:invokespecial   #25  <Method void Util$BackgroundJob$1(Util$BackgroundJob)>
        //    7   13:putfield        #27  <Field Runnable mCleanupRunner>
        //    8   16:aload_0         
        //    9   17:aload_1         
        //   10   18:putfield        #29  <Field MonitoredActivity mActivity>
        //   11   21:aload_0         
        //   12   22:aload_3         
        //   13   23:putfield        #31  <Field ProgressDialog mDialog>
        //   14   26:aload_0         
        //   15   27:aload_2         
        //   16   28:putfield        #33  <Field Runnable mJob>
        //   17   31:aload_0         
        //   18   32:getfield        #29  <Field MonitoredActivity mActivity>
        //   19   35:aload_0         
        //   20   36:invokevirtual   #39  <Method void MonitoredActivity.addLifeCycleListener(MonitoredActivity$LifeCycleListener)>
        //   21   39:aload_0         
        //   22   40:aload           4
        //   23   42:putfield        #41  <Field Handler mHandler>
        //   24   45:return          
        }

        static MonitoredActivity access$0(BackgroundJob backgroundjob)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #29  <Field MonitoredActivity mActivity>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #29  <Field MonitoredActivity mActivity>
        //    5    4:areturn         
        }

        static ProgressDialog access$1(BackgroundJob backgroundjob)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #31  <Field ProgressDialog mDialog>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #31  <Field ProgressDialog mDialog>
        //    5    4:areturn         
        }

        public void onActivityDestroyed(MonitoredActivity monitoredactivity)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field Runnable mCleanupRunner>
        //    2    4:invokeinterface #50  <Method void Runnable.run()>
        //    3    9:aload_0         
        //    4   10:getfield        #41  <Field Handler mHandler>
        //    5   13:aload_0         
        //    6   14:getfield        #27  <Field Runnable mCleanupRunner>
        //    7   17:invokevirtual   #56  <Method void Handler.removeCallbacks(Runnable)>
        //    8   20:return          
        }

        public void onActivityStarted(MonitoredActivity monitoredactivity)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #31  <Field ProgressDialog mDialog>
        //    2    4:invokevirtual   #62  <Method void ProgressDialog.show()>
        //    3    7:return          
        }

        public void onActivityStopped(MonitoredActivity monitoredactivity)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #31  <Field ProgressDialog mDialog>
        //    2    4:invokevirtual   #66  <Method void ProgressDialog.hide()>
        //    3    7:return          
        }

        public void run()
        {
        // try 0 9 handler(s) 22
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Runnable mJob>
        //    2    4:invokeinterface #50  <Method void Runnable.run()>
        //    3    9:aload_0         
        //    4   10:getfield        #41  <Field Handler mHandler>
        //    5   13:aload_0         
        //    6   14:getfield        #27  <Field Runnable mCleanupRunner>
        //    7   17:invokevirtual   #70  <Method boolean Handler.post(Runnable)>
        //    8   20:pop             
        //    9   21:return          
        // finally
        //   10   22:astore_1        
        //   11   23:aload_0         
        //   12   24:getfield        #41  <Field Handler mHandler>
        //   13   27:aload_0         
        //   14   28:getfield        #27  <Field Runnable mCleanupRunner>
        //   15   31:invokevirtual   #70  <Method boolean Handler.post(Runnable)>
        //   16   34:pop             
        //   17   35:aload_1         
        //   18   36:athrow          
        }

        private final MonitoredActivity mActivity;
        private final Runnable mCleanupRunner;
        private final ProgressDialog mDialog;
        private final Handler mHandler;
        private final Runnable mJob;

        static MonitoredActivity access$0(BackgroundJob backgroundjob)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #29  <Field MonitoredActivity mActivity>
        //    2    4:areturn         
        }

        static ProgressDialog access$1(BackgroundJob backgroundjob)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #31  <Field ProgressDialog mDialog>
        //    2    4:areturn         
        }
    }


    private Util()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Object()>
    //    2    4:return          
    }

    public static void closeSilently(Closeable closeable)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       5
    //    2    4:return          
    // try 5 11 handler(s) 12
    //    3    5:aload_0         
    //    4    6:invokeinterface #21  <Method void Closeable.close()>
    //    5   11:return          
    // catch Throwable
    //    6   12:astore_1        
    //    7   13:return          
    }

    public static android.graphics.BitmapFactory.Options createNativeAllocOptions()
    {
    //    0    0:new             #25  <Class android.graphics.BitmapFactory$Options>
    //    1    3:dup             
    //    2    4:invokespecial   #26  <Method void android.graphics.BitmapFactory$Options()>
    //    3    7:areturn         
    }

    public static int getOrientationInDegree(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #37  <Method WindowManager Activity.getWindowManager()>
    //    2    4:invokeinterface #43  <Method Display WindowManager.getDefaultDisplay()>
    //    3    9:invokevirtual   #49  <Method int Display.getRotation()>
    //    4   12:tableswitch     0 3: default 44
    //                   0 46
    //                   1 48
    //                   2 51
    //                   3 55
    //    5   44:iconst_0        
    //    6   45:ireturn         
    //    7   46:iconst_0        
    //    8   47:ireturn         
    //    9   48:bipush          90
    //   10   50:ireturn         
    //   11   51:sipush          180
    //   12   54:ireturn         
    //   13   55:sipush          270
    //   14   58:ireturn         
    }

    public static Bitmap rotateImage(Bitmap bitmap, float f)
    {
    //    0    0:new             #53  <Class Matrix>
    //    1    3:dup             
    //    2    4:invokespecial   #54  <Method void Matrix()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:fload_1         
    //    6   10:invokevirtual   #58  <Method boolean Matrix.postRotate(float)>
    //    7   13:pop             
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:iconst_0        
    //   11   17:aload_0         
    //   12   18:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //   13   21:aload_0         
    //   14   22:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //   15   25:aload_2         
    //   16   26:iconst_1        
    //   17   27:invokestatic    #70  <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
    //   18   30:areturn         
    }

    public static void startBackgroundJob(MonitoredActivity monitoredactivity, String s, String s1, Runnable runnable, Handler handler)
    {
    //    0    0:new             #74  <Class Thread>
    //    1    3:dup             
    //    2    4:new             #76  <Class Util$BackgroundJob>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:aload_3         
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:aload_2         
    //    9   13:iconst_1        
    //   10   14:iconst_0        
    //   11   15:invokestatic    #82  <Method ProgressDialog ProgressDialog.show(android.content.Context, CharSequence, CharSequence, boolean, boolean)>
    //   12   18:aload           4
    //   13   20:invokespecial   #85  <Method void Util$BackgroundJob(MonitoredActivity, Runnable, ProgressDialog, Handler)>
    //   14   23:invokespecial   #88  <Method void Thread(Runnable)>
    //   15   26:invokevirtual   #91  <Method void Thread.start()>
    //   16   29:return          
    }

    public static Bitmap transform(Matrix matrix, Bitmap bitmap, int i, int j, boolean flag)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //    2    4:iload_2         
    //    3    5:isub            
    //    4    6:istore          5
    //    5    8:aload_1         
    //    6    9:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //    7   12:iload_3         
    //    8   13:isub            
    //    9   14:istore          6
    //   10   16:iload           4
    //   11   18:ifne            164
    //   12   21:iload           5
    //   13   23:iflt            31
    //   14   26:iload           6
    //   15   28:ifge            164
    //   16   31:iload_2         
    //   17   32:iload_3         
    //   18   33:getstatic       #99  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //   19   36:invokestatic    #102 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //   20   39:astore          13
    //   21   41:new             #104 <Class Canvas>
    //   22   44:dup             
    //   23   45:aload           13
    //   24   47:invokespecial   #107 <Method void Canvas(Bitmap)>
    //   25   50:astore          15
    //   26   52:iconst_0        
    //   27   53:iload           5
    //   28   55:iconst_2        
    //   29   56:idiv            
    //   30   57:invokestatic    #113 <Method int Math.max(int, int)>
    //   31   60:istore          16
    //   32   62:iconst_0        
    //   33   63:iload           6
    //   34   65:iconst_2        
    //   35   66:idiv            
    //   36   67:invokestatic    #113 <Method int Math.max(int, int)>
    //   37   70:istore          17
    //   38   72:new             #115 <Class Rect>
    //   39   75:dup             
    //   40   76:iload           16
    //   41   78:iload           17
    //   42   80:iload           16
    //   43   82:iload_2         
    //   44   83:aload_1         
    //   45   84:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //   46   87:invokestatic    #118 <Method int Math.min(int, int)>
    //   47   90:iadd            
    //   48   91:iload           17
    //   49   93:iload_3         
    //   50   94:aload_1         
    //   51   95:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //   52   98:invokestatic    #118 <Method int Math.min(int, int)>
    //   53  101:iadd            
    //   54  102:invokespecial   #121 <Method void Rect(int, int, int, int)>
    //   55  105:astore          18
    //   56  107:iload_2         
    //   57  108:aload           18
    //   58  110:invokevirtual   #124 <Method int Rect.width()>
    //   59  113:isub            
    //   60  114:iconst_2        
    //   61  115:idiv            
    //   62  116:istore          19
    //   63  118:iload_3         
    //   64  119:aload           18
    //   65  121:invokevirtual   #127 <Method int Rect.height()>
    //   66  124:isub            
    //   67  125:iconst_2        
    //   68  126:idiv            
    //   69  127:istore          20
    //   70  129:new             #115 <Class Rect>
    //   71  132:dup             
    //   72  133:iload           19
    //   73  135:iload           20
    //   74  137:iload_2         
    //   75  138:iload           19
    //   76  140:isub            
    //   77  141:iload_3         
    //   78  142:iload           20
    //   79  144:isub            
    //   80  145:invokespecial   #121 <Method void Rect(int, int, int, int)>
    //   81  148:astore          21
    //   82  150:aload           15
    //   83  152:aload_1         
    //   84  153:aload           18
    //   85  155:aload           21
    //   86  157:aconst_null     
    //   87  158:invokevirtual   #131 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, android.graphics.Paint)>
    //   88  161:aload           13
    //   89  163:areturn         
    //   90  164:aload_1         
    //   91  165:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //   92  168:i2f             
    //   93  169:fstore          7
    //   94  171:aload_1         
    //   95  172:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //   96  175:i2f             
    //   97  176:fstore          8
    //   98  178:fload           7
    //   99  180:fload           8
    //  100  182:fdiv            
    //  101  183:iload_2         
    //  102  184:i2f             
    //  103  185:iload_3         
    //  104  186:i2f             
    //  105  187:fdiv            
    //  106  188:fcmpl           
    //  107  189:ifle            306
    //  108  192:iload_3         
    //  109  193:i2f             
    //  110  194:fload           8
    //  111  196:fdiv            
    //  112  197:fstore          14
    //  113  199:fload           14
    //  114  201:ldc1            #132 <Float 0.9F>
    //  115  203:fcmpg           
    //  116  204:iflt            214
    //  117  207:fload           14
    //  118  209:fconst_1        
    //  119  210:fcmpl           
    //  120  211:ifle            301
    //  121  214:aload_0         
    //  122  215:fload           14
    //  123  217:fload           14
    //  124  219:invokevirtual   #136 <Method void Matrix.setScale(float, float)>
    //  125  222:aload_0         
    //  126  223:ifnull          344
    //  127  226:aload_1         
    //  128  227:iconst_0        
    //  129  228:iconst_0        
    //  130  229:aload_1         
    //  131  230:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //  132  233:aload_1         
    //  133  234:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //  134  237:aload_0         
    //  135  238:iconst_1        
    //  136  239:invokestatic    #70  <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
    //  137  242:astore          10
    //  138  244:iconst_0        
    //  139  245:aload           10
    //  140  247:invokevirtual   #63  <Method int Bitmap.getWidth()>
    //  141  250:iload_2         
    //  142  251:isub            
    //  143  252:invokestatic    #113 <Method int Math.max(int, int)>
    //  144  255:istore          11
    //  145  257:iconst_0        
    //  146  258:aload           10
    //  147  260:invokevirtual   #66  <Method int Bitmap.getHeight()>
    //  148  263:iload_3         
    //  149  264:isub            
    //  150  265:invokestatic    #113 <Method int Math.max(int, int)>
    //  151  268:istore          12
    //  152  270:aload           10
    //  153  272:iload           11
    //  154  274:iconst_2        
    //  155  275:idiv            
    //  156  276:iload           12
    //  157  278:iconst_2        
    //  158  279:idiv            
    //  159  280:iload_2         
    //  160  281:iload_3         
    //  161  282:invokestatic    #139 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int)>
    //  162  285:astore          13
    //  163  287:aload           10
    //  164  289:aload_1         
    //  165  290:if_acmpeq       161
    //  166  293:aload           10
    //  167  295:invokevirtual   #142 <Method void Bitmap.recycle()>
    //  168  298:aload           13
    //  169  300:areturn         
    //  170  301:aconst_null     
    //  171  302:astore_0        
    //  172  303:goto            222
    //  173  306:iload_2         
    //  174  307:i2f             
    //  175  308:fload           7
    //  176  310:fdiv            
    //  177  311:fstore          9
    //  178  313:fload           9
    //  179  315:ldc1            #132 <Float 0.9F>
    //  180  317:fcmpg           
    //  181  318:iflt            328
    //  182  321:fload           9
    //  183  323:fconst_1        
    //  184  324:fcmpl           
    //  185  325:ifle            339
    //  186  328:aload_0         
    //  187  329:fload           9
    //  188  331:fload           9
    //  189  333:invokevirtual   #136 <Method void Matrix.setScale(float, float)>
    //  190  336:goto            222
    //  191  339:aconst_null     
    //  192  340:astore_0        
    //  193  341:goto            222
    //  194  344:aload_1         
    //  195  345:astore          10
    //  196  347:goto            244
    }

    private static final String TAG = "db.Util";

    // Unreferenced inner class eu/janmuller/android/simplecropimage/Util$BackgroundJob$1

/* anonymous class */
    class BackgroundJob._cls1
        implements Runnable
    {

        BackgroundJob._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field Util$BackgroundJob this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field Util$BackgroundJob this$1>
        //    2    4:invokestatic    #22  <Method MonitoredActivity Util$BackgroundJob.access$0(Util$BackgroundJob)>
        //    3    7:aload_0         
        //    4    8:getfield        #14  <Field Util$BackgroundJob this$1>
        //    5   11:invokevirtual   #28  <Method void MonitoredActivity.removeLifeCycleListener(MonitoredActivity$LifeCycleListener)>
        //    6   14:aload_0         
        //    7   15:getfield        #14  <Field Util$BackgroundJob this$1>
        //    8   18:invokestatic    #32  <Method ProgressDialog Util$BackgroundJob.access$1(Util$BackgroundJob)>
        //    9   21:invokevirtual   #38  <Method android.view.Window ProgressDialog.getWindow()>
        //   10   24:ifnull          37
        //   11   27:aload_0         
        //   12   28:getfield        #14  <Field Util$BackgroundJob this$1>
        //   13   31:invokestatic    #32  <Method ProgressDialog Util$BackgroundJob.access$1(Util$BackgroundJob)>
        //   14   34:invokevirtual   #41  <Method void ProgressDialog.dismiss()>
        //   15   37:return          
        }

        final BackgroundJob this$1;
    }

}
