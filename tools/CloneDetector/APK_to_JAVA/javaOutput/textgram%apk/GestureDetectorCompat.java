// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.*;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompat, VelocityTrackerCompat

public class GestureDetectorCompat
{
    static interface GestureDetectorCompatImpl
    {

        public abstract boolean isLongpressEnabled();

        public abstract boolean onTouchEvent(MotionEvent motionevent);

        public abstract void setIsLongpressEnabled(boolean flag);

        public abstract void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener);
    }

    static class GestureDetectorCompatImplBase
        implements GestureDetectorCompatImpl
    {

        static 
        {
        //    0    0:invokestatic    #53  <Method int ViewConfiguration.getLongPressTimeout()>
        //    1    3:putstatic       #55  <Field int LONGPRESS_TIMEOUT>
        //    2    6:invokestatic    #58  <Method int ViewConfiguration.getTapTimeout()>
        //    3    9:putstatic       #60  <Field int TAP_TIMEOUT>
        //    4   12:invokestatic    #63  <Method int ViewConfiguration.getDoubleTapTimeout()>
        //    5   15:putstatic       #65  <Field int DOUBLE_TAP_TIMEOUT>
        //    6   18:return          
        }

        public GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #69  <Method void Object()>
        //    2    4:aload_3         
        //    3    5:ifnull          47
        //    4    8:aload_0         
        //    5    9:new             #71  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
        //    6   12:dup             
        //    7   13:aload_0         
        //    8   14:aload_3         
        //    9   15:invokespecial   #74  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase, Handler)>
        //   10   18:putfield        #76  <Field Handler mHandler>
        //   11   21:aload_0         
        //   12   22:aload_2         
        //   13   23:putfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //   14   26:aload_2         
        //   15   27:instanceof      #80  <Class android.view.GestureDetector$OnDoubleTapListener>
        //   16   30:ifeq            41
        //   17   33:aload_0         
        //   18   34:aload_2         
        //   19   35:checkcast       #80  <Class android.view.GestureDetector$OnDoubleTapListener>
        //   20   38:invokevirtual   #84  <Method void setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
        //   21   41:aload_0         
        //   22   42:aload_1         
        //   23   43:invokespecial   #88  <Method void init(Context)>
        //   24   46:return          
        //   25   47:aload_0         
        //   26   48:new             #71  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
        //   27   51:dup             
        //   28   52:aload_0         
        //   29   53:invokespecial   #91  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   30   56:putfield        #76  <Field Handler mHandler>
        //   31   59:goto            21
        }

        static MotionEvent access$000(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //    5    4:areturn         
        }

        static android.view.GestureDetector.OnGestureListener access$100(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //    5    4:areturn         
        }

        static void access$200(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #101 <Method void dispatchLongPress()>
        //    2    4:return          
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #101 <Method void dispatchLongPress()>
        //    5    4:return          
        }

        static android.view.GestureDetector.OnDoubleTapListener access$300(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //    5    4:areturn         
        }

        static boolean access$400(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #109 <Field boolean mStillDown>
        //    2    4:ireturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #109 <Field boolean mStillDown>
        //    5    4:ireturn         
        }

        static boolean access$502(GestureDetectorCompatImplBase gesturedetectorcompatimplbase, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //    3    5:iload_1         
        //    4    6:ireturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:iload_1         
        //    7    2:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //    8    5:iload_1         
        //    9    6:ireturn         
        }

        private void cancel()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #76  <Field Handler mHandler>
        //    2    4:iconst_1        
        //    3    5:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //    4    8:aload_0         
        //    5    9:getfield        #76  <Field Handler mHandler>
        //    6   12:iconst_2        
        //    7   13:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //    8   16:aload_0         
        //    9   17:getfield        #76  <Field Handler mHandler>
        //   10   20:iconst_3        
        //   11   21:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //   12   24:aload_0         
        //   13   25:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //   14   28:invokevirtual   #127 <Method void VelocityTracker.recycle()>
        //   15   31:aload_0         
        //   16   32:aconst_null     
        //   17   33:putfield        #122 <Field VelocityTracker mVelocityTracker>
        //   18   36:aload_0         
        //   19   37:iconst_0        
        //   20   38:putfield        #129 <Field boolean mIsDoubleTapping>
        //   21   41:aload_0         
        //   22   42:iconst_0        
        //   23   43:putfield        #109 <Field boolean mStillDown>
        //   24   46:aload_0         
        //   25   47:iconst_0        
        //   26   48:putfield        #131 <Field boolean mAlwaysInTapRegion>
        //   27   51:aload_0         
        //   28   52:iconst_0        
        //   29   53:putfield        #133 <Field boolean mAlwaysInBiggerTapRegion>
        //   30   56:aload_0         
        //   31   57:iconst_0        
        //   32   58:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //   33   61:aload_0         
        //   34   62:getfield        #135 <Field boolean mInLongPress>
        //   35   65:ifeq            73
        //   36   68:aload_0         
        //   37   69:iconst_0        
        //   38   70:putfield        #135 <Field boolean mInLongPress>
        //   39   73:return          
        }

        private void cancelTaps()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #76  <Field Handler mHandler>
        //    2    4:iconst_1        
        //    3    5:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //    4    8:aload_0         
        //    5    9:getfield        #76  <Field Handler mHandler>
        //    6   12:iconst_2        
        //    7   13:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //    8   16:aload_0         
        //    9   17:getfield        #76  <Field Handler mHandler>
        //   10   20:iconst_3        
        //   11   21:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //   12   24:aload_0         
        //   13   25:iconst_0        
        //   14   26:putfield        #129 <Field boolean mIsDoubleTapping>
        //   15   29:aload_0         
        //   16   30:iconst_0        
        //   17   31:putfield        #131 <Field boolean mAlwaysInTapRegion>
        //   18   34:aload_0         
        //   19   35:iconst_0        
        //   20   36:putfield        #133 <Field boolean mAlwaysInBiggerTapRegion>
        //   21   39:aload_0         
        //   22   40:iconst_0        
        //   23   41:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //   24   44:aload_0         
        //   25   45:getfield        #135 <Field boolean mInLongPress>
        //   26   48:ifeq            56
        //   27   51:aload_0         
        //   28   52:iconst_0        
        //   29   53:putfield        #135 <Field boolean mInLongPress>
        //   30   56:return          
        }

        private void dispatchLongPress()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #76  <Field Handler mHandler>
        //    2    4:iconst_3        
        //    3    5:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //    4    8:aload_0         
        //    5    9:iconst_0        
        //    6   10:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //    7   13:aload_0         
        //    8   14:iconst_1        
        //    9   15:putfield        #135 <Field boolean mInLongPress>
        //   10   18:aload_0         
        //   11   19:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //   12   22:aload_0         
        //   13   23:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //   14   26:invokeinterface #142 <Method void android.view.GestureDetector$OnGestureListener.onLongPress(MotionEvent)>
        //   15   31:return          
        }

        private void init(Context context)
        {
        //    0    0:aload_1         
        //    1    1:ifnonnull       14
        //    2    4:new             #144 <Class IllegalArgumentException>
        //    3    7:dup             
        //    4    8:ldc1            #146 <String "Context must not be null">
        //    5   10:invokespecial   #149 <Method void IllegalArgumentException(String)>
        //    6   13:athrow          
        //    7   14:aload_0         
        //    8   15:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //    9   18:ifnonnull       31
        //   10   21:new             #144 <Class IllegalArgumentException>
        //   11   24:dup             
        //   12   25:ldc1            #151 <String "OnGestureListener must not be null">
        //   13   27:invokespecial   #149 <Method void IllegalArgumentException(String)>
        //   14   30:athrow          
        //   15   31:aload_0         
        //   16   32:iconst_1        
        //   17   33:putfield        #153 <Field boolean mIsLongpressEnabled>
        //   18   36:aload_1         
        //   19   37:invokestatic    #157 <Method ViewConfiguration ViewConfiguration.get(Context)>
        //   20   40:astore_2        
        //   21   41:aload_2         
        //   22   42:invokevirtual   #160 <Method int ViewConfiguration.getScaledTouchSlop()>
        //   23   45:istore_3        
        //   24   46:aload_2         
        //   25   47:invokevirtual   #163 <Method int ViewConfiguration.getScaledDoubleTapSlop()>
        //   26   50:istore          4
        //   27   52:aload_0         
        //   28   53:aload_2         
        //   29   54:invokevirtual   #166 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
        //   30   57:putfield        #168 <Field int mMinimumFlingVelocity>
        //   31   60:aload_0         
        //   32   61:aload_2         
        //   33   62:invokevirtual   #171 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
        //   34   65:putfield        #173 <Field int mMaximumFlingVelocity>
        //   35   68:aload_0         
        //   36   69:iload_3         
        //   37   70:iload_3         
        //   38   71:imul            
        //   39   72:putfield        #175 <Field int mTouchSlopSquare>
        //   40   75:aload_0         
        //   41   76:iload           4
        //   42   78:iload           4
        //   43   80:imul            
        //   44   81:putfield        #177 <Field int mDoubleTapSlopSquare>
        //   45   84:return          
        }

        private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #133 <Field boolean mAlwaysInBiggerTapRegion>
        //    2    4:ifne            9
        //    3    7:iconst_0        
        //    4    8:ireturn         
        //    5    9:aload_3         
        //    6   10:invokevirtual   #185 <Method long MotionEvent.getEventTime()>
        //    7   13:aload_2         
        //    8   14:invokevirtual   #185 <Method long MotionEvent.getEventTime()>
        //    9   17:lsub            
        //   10   18:getstatic       #65  <Field int DOUBLE_TAP_TIMEOUT>
        //   11   21:i2l             
        //   12   22:lcmp            
        //   13   23:ifgt            7
        //   14   26:aload_1         
        //   15   27:invokevirtual   #189 <Method float MotionEvent.getX()>
        //   16   30:f2i             
        //   17   31:aload_3         
        //   18   32:invokevirtual   #189 <Method float MotionEvent.getX()>
        //   19   35:f2i             
        //   20   36:isub            
        //   21   37:istore          4
        //   22   39:aload_1         
        //   23   40:invokevirtual   #192 <Method float MotionEvent.getY()>
        //   24   43:f2i             
        //   25   44:aload_3         
        //   26   45:invokevirtual   #192 <Method float MotionEvent.getY()>
        //   27   48:f2i             
        //   28   49:isub            
        //   29   50:istore          5
        //   30   52:iload           4
        //   31   54:iload           4
        //   32   56:imul            
        //   33   57:iload           5
        //   34   59:iload           5
        //   35   61:imul            
        //   36   62:iadd            
        //   37   63:aload_0         
        //   38   64:getfield        #177 <Field int mDoubleTapSlopSquare>
        //   39   67:icmpge          7
        //   40   70:iconst_1        
        //   41   71:ireturn         
        }

        public boolean isLongpressEnabled()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #153 <Field boolean mIsLongpressEnabled>
        //    2    4:ireturn         
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #199 <Method int MotionEvent.getAction()>
        //    2    4:istore_2        
        //    3    5:aload_0         
        //    4    6:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //    5    9:ifnonnull       19
        //    6   12:aload_0         
        //    7   13:invokestatic    #203 <Method VelocityTracker VelocityTracker.obtain()>
        //    8   16:putfield        #122 <Field VelocityTracker mVelocityTracker>
        //    9   19:aload_0         
        //   10   20:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //   11   23:aload_1         
        //   12   24:invokevirtual   #206 <Method void VelocityTracker.addMovement(MotionEvent)>
        //   13   27:iload_2         
        //   14   28:sipush          255
        //   15   31:iand            
        //   16   32:bipush          6
        //   17   34:icmpne          84
        //   18   37:iconst_1        
        //   19   38:istore_3        
        //   20   39:iload_3         
        //   21   40:ifeq            89
        //   22   43:aload_1         
        //   23   44:invokestatic    #212 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
        //   24   47:istore          4
        //   25   49:fconst_0        
        //   26   50:fstore          5
        //   27   52:fconst_0        
        //   28   53:fstore          6
        //   29   55:aload_1         
        //   30   56:invokestatic    #215 <Method int MotionEventCompat.getPointerCount(MotionEvent)>
        //   31   59:istore          7
        //   32   61:iconst_0        
        //   33   62:istore          8
        //   34   64:iload           8
        //   35   66:iload           7
        //   36   68:icmpge          120
        //   37   71:iload           4
        //   38   73:iload           8
        //   39   75:icmpne          95
        //   40   78:iinc            8  1
        //   41   81:goto            64
        //   42   84:iconst_0        
        //   43   85:istore_3        
        //   44   86:goto            39
        //   45   89:iconst_m1       
        //   46   90:istore          4
        //   47   92:goto            49
        //   48   95:fload           5
        //   49   97:aload_1         
        //   50   98:iload           8
        //   51  100:invokestatic    #218 <Method float MotionEventCompat.getX(MotionEvent, int)>
        //   52  103:fadd            
        //   53  104:fstore          5
        //   54  106:fload           6
        //   55  108:aload_1         
        //   56  109:iload           8
        //   57  111:invokestatic    #220 <Method float MotionEventCompat.getY(MotionEvent, int)>
        //   58  114:fadd            
        //   59  115:fstore          6
        //   60  117:goto            78
        //   61  120:iload_3         
        //   62  121:ifeq            203
        //   63  124:iload           7
        //   64  126:iconst_1        
        //   65  127:isub            
        //   66  128:istore          9
        //   67  130:fload           5
        //   68  132:iload           9
        //   69  134:i2f             
        //   70  135:fdiv            
        //   71  136:fstore          10
        //   72  138:fload           6
        //   73  140:iload           9
        //   74  142:i2f             
        //   75  143:fdiv            
        //   76  144:fstore          11
        //   77  146:iload_2         
        //   78  147:sipush          255
        //   79  150:iand            
        //   80  151:istore          12
        //   81  153:iconst_0        
        //   82  154:istore          13
        //   83  156:iload           12
        //   84  158:tableswitch     0 6: default 200
        //                       0 392
        //                       1 911
        //                       2 663
        //                       3 1186
        //                       4 200
        //                       5 210
        //                       6 240
        //   85  200:iload           13
        //   86  202:ireturn         
        //   87  203:iload           7
        //   88  205:istore          9
        //   89  207:goto            130
        //   90  210:aload_0         
        //   91  211:fload           10
        //   92  213:putfield        #222 <Field float mLastFocusX>
        //   93  216:aload_0         
        //   94  217:fload           10
        //   95  219:putfield        #224 <Field float mDownFocusX>
        //   96  222:aload_0         
        //   97  223:fload           11
        //   98  225:putfield        #226 <Field float mLastFocusY>
        //   99  228:aload_0         
        //  100  229:fload           11
        //  101  231:putfield        #228 <Field float mDownFocusY>
        //  102  234:aload_0         
        //  103  235:invokespecial   #230 <Method void cancelTaps()>
        //  104  238:iconst_0        
        //  105  239:ireturn         
        //  106  240:aload_0         
        //  107  241:fload           10
        //  108  243:putfield        #222 <Field float mLastFocusX>
        //  109  246:aload_0         
        //  110  247:fload           10
        //  111  249:putfield        #224 <Field float mDownFocusX>
        //  112  252:aload_0         
        //  113  253:fload           11
        //  114  255:putfield        #226 <Field float mLastFocusY>
        //  115  258:aload_0         
        //  116  259:fload           11
        //  117  261:putfield        #228 <Field float mDownFocusY>
        //  118  264:aload_0         
        //  119  265:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  120  268:sipush          1000
        //  121  271:aload_0         
        //  122  272:getfield        #173 <Field int mMaximumFlingVelocity>
        //  123  275:i2f             
        //  124  276:invokevirtual   #234 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
        //  125  279:aload_1         
        //  126  280:invokestatic    #212 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
        //  127  283:istore          37
        //  128  285:aload_1         
        //  129  286:iload           37
        //  130  288:invokestatic    #238 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
        //  131  291:istore          38
        //  132  293:aload_0         
        //  133  294:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  134  297:iload           38
        //  135  299:invokestatic    #244 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
        //  136  302:fstore          39
        //  137  304:aload_0         
        //  138  305:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  139  308:iload           38
        //  140  310:invokestatic    #247 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
        //  141  313:fstore          40
        //  142  315:iconst_0        
        //  143  316:istore          41
        //  144  318:iload           41
        //  145  320:istore          42
        //  146  322:iconst_0        
        //  147  323:istore          13
        //  148  325:iload           42
        //  149  327:iload           7
        //  150  329:icmpge          200
        //  151  332:iload           41
        //  152  334:iload           37
        //  153  336:icmpne          345
        //  154  339:iinc            41  1
        //  155  342:goto            318
        //  156  345:aload_1         
        //  157  346:iload           41
        //  158  348:invokestatic    #238 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
        //  159  351:istore          43
        //  160  353:fload           39
        //  161  355:aload_0         
        //  162  356:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  163  359:iload           43
        //  164  361:invokestatic    #244 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
        //  165  364:fmul            
        //  166  365:fload           40
        //  167  367:aload_0         
        //  168  368:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  169  371:iload           43
        //  170  373:invokestatic    #247 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
        //  171  376:fmul            
        //  172  377:fadd            
        //  173  378:fconst_0        
        //  174  379:fcmpg           
        //  175  380:ifge            339
        //  176  383:aload_0         
        //  177  384:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  178  387:invokevirtual   #250 <Method void VelocityTracker.clear()>
        //  179  390:iconst_0        
        //  180  391:ireturn         
        //  181  392:aload_0         
        //  182  393:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  183  396:astore          31
        //  184  398:iconst_0        
        //  185  399:istore          32
        //  186  401:aload           31
        //  187  403:ifnull          497
        //  188  406:aload_0         
        //  189  407:getfield        #76  <Field Handler mHandler>
        //  190  410:iconst_3        
        //  191  411:invokevirtual   #254 <Method boolean Handler.hasMessages(int)>
        //  192  414:istore          35
        //  193  416:iload           35
        //  194  418:ifeq            429
        //  195  421:aload_0         
        //  196  422:getfield        #76  <Field Handler mHandler>
        //  197  425:iconst_3        
        //  198  426:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  199  429:aload_0         
        //  200  430:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  201  433:ifnull          644
        //  202  436:aload_0         
        //  203  437:getfield        #256 <Field MotionEvent mPreviousUpEvent>
        //  204  440:ifnull          644
        //  205  443:iload           35
        //  206  445:ifeq            644
        //  207  448:aload_0         
        //  208  449:aload_0         
        //  209  450:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  210  453:aload_0         
        //  211  454:getfield        #256 <Field MotionEvent mPreviousUpEvent>
        //  212  457:aload_1         
        //  213  458:invokespecial   #258 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
        //  214  461:ifeq            644
        //  215  464:aload_0         
        //  216  465:iconst_1        
        //  217  466:putfield        #129 <Field boolean mIsDoubleTapping>
        //  218  469:iconst_0        
        //  219  470:aload_0         
        //  220  471:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  221  474:aload_0         
        //  222  475:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  223  478:invokeinterface #261 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
        //  224  483:ior             
        //  225  484:aload_0         
        //  226  485:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  227  488:aload_1         
        //  228  489:invokeinterface #264 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
        //  229  494:ior             
        //  230  495:istore          32
        //  231  497:aload_0         
        //  232  498:fload           10
        //  233  500:putfield        #222 <Field float mLastFocusX>
        //  234  503:aload_0         
        //  235  504:fload           10
        //  236  506:putfield        #224 <Field float mDownFocusX>
        //  237  509:aload_0         
        //  238  510:fload           11
        //  239  512:putfield        #226 <Field float mLastFocusY>
        //  240  515:aload_0         
        //  241  516:fload           11
        //  242  518:putfield        #228 <Field float mDownFocusY>
        //  243  521:aload_0         
        //  244  522:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  245  525:ifnull          535
        //  246  528:aload_0         
        //  247  529:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  248  532:invokevirtual   #265 <Method void MotionEvent.recycle()>
        //  249  535:aload_0         
        //  250  536:aload_1         
        //  251  537:invokestatic    #268 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
        //  252  540:putfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  253  543:aload_0         
        //  254  544:iconst_1        
        //  255  545:putfield        #131 <Field boolean mAlwaysInTapRegion>
        //  256  548:aload_0         
        //  257  549:iconst_1        
        //  258  550:putfield        #133 <Field boolean mAlwaysInBiggerTapRegion>
        //  259  553:aload_0         
        //  260  554:iconst_1        
        //  261  555:putfield        #109 <Field boolean mStillDown>
        //  262  558:aload_0         
        //  263  559:iconst_0        
        //  264  560:putfield        #135 <Field boolean mInLongPress>
        //  265  563:aload_0         
        //  266  564:iconst_0        
        //  267  565:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //  268  568:aload_0         
        //  269  569:getfield        #153 <Field boolean mIsLongpressEnabled>
        //  270  572:ifeq            609
        //  271  575:aload_0         
        //  272  576:getfield        #76  <Field Handler mHandler>
        //  273  579:iconst_2        
        //  274  580:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  275  583:aload_0         
        //  276  584:getfield        #76  <Field Handler mHandler>
        //  277  587:iconst_2        
        //  278  588:aload_0         
        //  279  589:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  280  592:invokevirtual   #271 <Method long MotionEvent.getDownTime()>
        //  281  595:getstatic       #60  <Field int TAP_TIMEOUT>
        //  282  598:i2l             
        //  283  599:ladd            
        //  284  600:getstatic       #55  <Field int LONGPRESS_TIMEOUT>
        //  285  603:i2l             
        //  286  604:ladd            
        //  287  605:invokevirtual   #275 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
        //  288  608:pop             
        //  289  609:aload_0         
        //  290  610:getfield        #76  <Field Handler mHandler>
        //  291  613:iconst_1        
        //  292  614:aload_0         
        //  293  615:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  294  618:invokevirtual   #271 <Method long MotionEvent.getDownTime()>
        //  295  621:getstatic       #60  <Field int TAP_TIMEOUT>
        //  296  624:i2l             
        //  297  625:ladd            
        //  298  626:invokevirtual   #275 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
        //  299  629:pop             
        //  300  630:iload           32
        //  301  632:aload_0         
        //  302  633:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //  303  636:aload_1         
        //  304  637:invokeinterface #278 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
        //  305  642:ior             
        //  306  643:ireturn         
        //  307  644:aload_0         
        //  308  645:getfield        #76  <Field Handler mHandler>
        //  309  648:iconst_3        
        //  310  649:getstatic       #65  <Field int DOUBLE_TAP_TIMEOUT>
        //  311  652:i2l             
        //  312  653:invokevirtual   #281 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
        //  313  656:pop             
        //  314  657:iconst_0        
        //  315  658:istore          32
        //  316  660:goto            497
        //  317  663:aload_0         
        //  318  664:getfield        #135 <Field boolean mInLongPress>
        //  319  667:istore          22
        //  320  669:iconst_0        
        //  321  670:istore          13
        //  322  672:iload           22
        //  323  674:ifne            200
        //  324  677:aload_0         
        //  325  678:getfield        #222 <Field float mLastFocusX>
        //  326  681:fload           10
        //  327  683:fsub            
        //  328  684:fstore          23
        //  329  686:aload_0         
        //  330  687:getfield        #226 <Field float mLastFocusY>
        //  331  690:fload           11
        //  332  692:fsub            
        //  333  693:fstore          24
        //  334  695:aload_0         
        //  335  696:getfield        #129 <Field boolean mIsDoubleTapping>
        //  336  699:ifeq            715
        //  337  702:iconst_0        
        //  338  703:aload_0         
        //  339  704:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  340  707:aload_1         
        //  341  708:invokeinterface #264 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
        //  342  713:ior             
        //  343  714:ireturn         
        //  344  715:aload_0         
        //  345  716:getfield        #131 <Field boolean mAlwaysInTapRegion>
        //  346  719:ifeq            849
        //  347  722:fload           10
        //  348  724:aload_0         
        //  349  725:getfield        #224 <Field float mDownFocusX>
        //  350  728:fsub            
        //  351  729:f2i             
        //  352  730:istore          27
        //  353  732:fload           11
        //  354  734:aload_0         
        //  355  735:getfield        #228 <Field float mDownFocusY>
        //  356  738:fsub            
        //  357  739:f2i             
        //  358  740:istore          28
        //  359  742:iload           27
        //  360  744:iload           27
        //  361  746:imul            
        //  362  747:iload           28
        //  363  749:iload           28
        //  364  751:imul            
        //  365  752:iadd            
        //  366  753:istore          29
        //  367  755:aload_0         
        //  368  756:getfield        #175 <Field int mTouchSlopSquare>
        //  369  759:istore          30
        //  370  761:iconst_0        
        //  371  762:istore          13
        //  372  764:iload           29
        //  373  766:iload           30
        //  374  768:icmple          832
        //  375  771:aload_0         
        //  376  772:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //  377  775:aload_0         
        //  378  776:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  379  779:aload_1         
        //  380  780:fload           23
        //  381  782:fload           24
        //  382  784:invokeinterface #285 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
        //  383  789:istore          13
        //  384  791:aload_0         
        //  385  792:fload           10
        //  386  794:putfield        #222 <Field float mLastFocusX>
        //  387  797:aload_0         
        //  388  798:fload           11
        //  389  800:putfield        #226 <Field float mLastFocusY>
        //  390  803:aload_0         
        //  391  804:iconst_0        
        //  392  805:putfield        #131 <Field boolean mAlwaysInTapRegion>
        //  393  808:aload_0         
        //  394  809:getfield        #76  <Field Handler mHandler>
        //  395  812:iconst_3        
        //  396  813:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  397  816:aload_0         
        //  398  817:getfield        #76  <Field Handler mHandler>
        //  399  820:iconst_1        
        //  400  821:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  401  824:aload_0         
        //  402  825:getfield        #76  <Field Handler mHandler>
        //  403  828:iconst_2        
        //  404  829:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  405  832:iload           29
        //  406  834:aload_0         
        //  407  835:getfield        #175 <Field int mTouchSlopSquare>
        //  408  838:icmple          200
        //  409  841:aload_0         
        //  410  842:iconst_0        
        //  411  843:putfield        #133 <Field boolean mAlwaysInBiggerTapRegion>
        //  412  846:iload           13
        //  413  848:ireturn         
        //  414  849:fload           23
        //  415  851:invokestatic    #291 <Method float Math.abs(float)>
        //  416  854:fconst_1        
        //  417  855:fcmpl           
        //  418  856:ifge            876
        //  419  859:fload           24
        //  420  861:invokestatic    #291 <Method float Math.abs(float)>
        //  421  864:fconst_1        
        //  422  865:fcmpl           
        //  423  866:istore          26
        //  424  868:iconst_0        
        //  425  869:istore          13
        //  426  871:iload           26
        //  427  873:iflt            200
        //  428  876:aload_0         
        //  429  877:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //  430  880:aload_0         
        //  431  881:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  432  884:aload_1         
        //  433  885:fload           23
        //  434  887:fload           24
        //  435  889:invokeinterface #285 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
        //  436  894:istore          25
        //  437  896:aload_0         
        //  438  897:fload           10
        //  439  899:putfield        #222 <Field float mLastFocusX>
        //  440  902:aload_0         
        //  441  903:fload           11
        //  442  905:putfield        #226 <Field float mLastFocusY>
        //  443  908:iload           25
        //  444  910:ireturn         
        //  445  911:aload_0         
        //  446  912:iconst_0        
        //  447  913:putfield        #109 <Field boolean mStillDown>
        //  448  916:aload_1         
        //  449  917:invokestatic    #268 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
        //  450  920:astore          14
        //  451  922:aload_0         
        //  452  923:getfield        #129 <Field boolean mIsDoubleTapping>
        //  453  926:ifeq            1011
        //  454  929:iconst_0        
        //  455  930:aload_0         
        //  456  931:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  457  934:aload_1         
        //  458  935:invokeinterface #264 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
        //  459  940:ior             
        //  460  941:istore          19
        //  461  943:aload_0         
        //  462  944:getfield        #256 <Field MotionEvent mPreviousUpEvent>
        //  463  947:ifnull          957
        //  464  950:aload_0         
        //  465  951:getfield        #256 <Field MotionEvent mPreviousUpEvent>
        //  466  954:invokevirtual   #265 <Method void MotionEvent.recycle()>
        //  467  957:aload_0         
        //  468  958:aload           14
        //  469  960:putfield        #256 <Field MotionEvent mPreviousUpEvent>
        //  470  963:aload_0         
        //  471  964:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  472  967:ifnull          982
        //  473  970:aload_0         
        //  474  971:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  475  974:invokevirtual   #127 <Method void VelocityTracker.recycle()>
        //  476  977:aload_0         
        //  477  978:aconst_null     
        //  478  979:putfield        #122 <Field VelocityTracker mVelocityTracker>
        //  479  982:aload_0         
        //  480  983:iconst_0        
        //  481  984:putfield        #129 <Field boolean mIsDoubleTapping>
        //  482  987:aload_0         
        //  483  988:iconst_0        
        //  484  989:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //  485  992:aload_0         
        //  486  993:getfield        #76  <Field Handler mHandler>
        //  487  996:iconst_1        
        //  488  997:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  489 1000:aload_0         
        //  490 1001:getfield        #76  <Field Handler mHandler>
        //  491 1004:iconst_2        
        //  492 1005:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  493 1008:iload           19
        //  494 1010:ireturn         
        //  495 1011:aload_0         
        //  496 1012:getfield        #135 <Field boolean mInLongPress>
        //  497 1015:ifeq            1037
        //  498 1018:aload_0         
        //  499 1019:getfield        #76  <Field Handler mHandler>
        //  500 1022:iconst_3        
        //  501 1023:invokevirtual   #120 <Method void Handler.removeMessages(int)>
        //  502 1026:aload_0         
        //  503 1027:iconst_0        
        //  504 1028:putfield        #135 <Field boolean mInLongPress>
        //  505 1031:iconst_0        
        //  506 1032:istore          19
        //  507 1034:goto            943
        //  508 1037:aload_0         
        //  509 1038:getfield        #131 <Field boolean mAlwaysInTapRegion>
        //  510 1041:ifeq            1084
        //  511 1044:aload_0         
        //  512 1045:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //  513 1048:aload_1         
        //  514 1049:invokeinterface #294 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
        //  515 1054:istore          19
        //  516 1056:aload_0         
        //  517 1057:getfield        #113 <Field boolean mDeferConfirmSingleTap>
        //  518 1060:ifeq            943
        //  519 1063:aload_0         
        //  520 1064:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  521 1067:ifnull          943
        //  522 1070:aload_0         
        //  523 1071:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //  524 1074:aload_1         
        //  525 1075:invokeinterface #297 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
        //  526 1080:pop             
        //  527 1081:goto            943
        //  528 1084:aload_0         
        //  529 1085:getfield        #122 <Field VelocityTracker mVelocityTracker>
        //  530 1088:astore          15
        //  531 1090:aload_1         
        //  532 1091:iconst_0        
        //  533 1092:invokestatic    #238 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
        //  534 1095:istore          16
        //  535 1097:aload           15
        //  536 1099:sipush          1000
        //  537 1102:aload_0         
        //  538 1103:getfield        #173 <Field int mMaximumFlingVelocity>
        //  539 1106:i2f             
        //  540 1107:invokevirtual   #234 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
        //  541 1110:aload           15
        //  542 1112:iload           16
        //  543 1114:invokestatic    #247 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
        //  544 1117:fstore          17
        //  545 1119:aload           15
        //  546 1121:iload           16
        //  547 1123:invokestatic    #244 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
        //  548 1126:fstore          18
        //  549 1128:fload           17
        //  550 1130:invokestatic    #291 <Method float Math.abs(float)>
        //  551 1133:aload_0         
        //  552 1134:getfield        #168 <Field int mMinimumFlingVelocity>
        //  553 1137:i2f             
        //  554 1138:fcmpl           
        //  555 1139:ifgt            1163
        //  556 1142:fload           18
        //  557 1144:invokestatic    #291 <Method float Math.abs(float)>
        //  558 1147:aload_0         
        //  559 1148:getfield        #168 <Field int mMinimumFlingVelocity>
        //  560 1151:i2f             
        //  561 1152:fcmpl           
        //  562 1153:istore          20
        //  563 1155:iconst_0        
        //  564 1156:istore          19
        //  565 1158:iload           20
        //  566 1160:ifle            943
        //  567 1163:aload_0         
        //  568 1164:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //  569 1167:aload_0         
        //  570 1168:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //  571 1171:aload_1         
        //  572 1172:fload           18
        //  573 1174:fload           17
        //  574 1176:invokeinterface #300 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
        //  575 1181:istore          19
        //  576 1183:goto            943
        //  577 1186:aload_0         
        //  578 1187:invokespecial   #302 <Method void cancel()>
        //  579 1190:iconst_0        
        //  580 1191:ireturn         
        }

        public void setIsLongpressEnabled(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #153 <Field boolean mIsLongpressEnabled>
        //    3    5:return          
        }

        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //    3    5:return          
        }

        private static final int DOUBLE_TAP_TIMEOUT = 0;
        private static final int LONGPRESS_TIMEOUT = 0;
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private static final int TAP_TIMEOUT;
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        private MotionEvent mCurrentDownEvent;
        private boolean mDeferConfirmSingleTap;
        private android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        private final android.view.GestureDetector.OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private MotionEvent mPreviousUpEvent;
        private boolean mStillDown;
        private int mTouchSlopSquare;
        private VelocityTracker mVelocityTracker;

        static MotionEvent access$000(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #95  <Field MotionEvent mCurrentDownEvent>
        //    2    4:areturn         
        }

        static android.view.GestureDetector.OnGestureListener access$100(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #78  <Field android.view.GestureDetector$OnGestureListener mListener>
        //    2    4:areturn         
        }

        static void access$200(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #101 <Method void dispatchLongPress()>
        //    2    4:return          
        }

        static android.view.GestureDetector.OnDoubleTapListener access$300(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #105 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
        //    2    4:areturn         
        }

        static boolean access$400(GestureDetectorCompatImplBase gesturedetectorcompatimplbase)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #109 <Field boolean mStillDown>
        //    2    4:ireturn         
        }

        static boolean access$502(GestureDetectorCompatImplBase gesturedetectorcompatimplbase, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #113 <Field boolean mDeferConfirmSingleTap>
        //    3    5:iload_1         
        //    4    6:ireturn         
        }
    }

    private class GestureDetectorCompatImplBase.GestureHandler extends Handler
    {

        GestureDetectorCompatImplBase.GestureHandler()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void Handler()>
        //    5    9:return          
        }

        GestureDetectorCompatImplBase.GestureHandler(Handler handler)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokevirtual   #18  <Method android.os.Looper Handler.getLooper()>
        //    6   10:invokespecial   #21  <Method void Handler(android.os.Looper)>
        //    7   13:return          
        }

        public void handleMessage(Message message)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #29  <Field int Message.what>
        //    2    4:tableswitch     1 3: default 32
        //                       1 59
        //                       2 79
        //                       3 87
        //    3   32:new             #31  <Class RuntimeException>
        //    4   35:dup             
        //    5   36:new             #33  <Class StringBuilder>
        //    6   39:dup             
        //    7   40:invokespecial   #34  <Method void StringBuilder()>
        //    8   43:ldc1            #36  <String "Unknown message ">
        //    9   45:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
        //   10   48:aload_1         
        //   11   49:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
        //   12   52:invokevirtual   #47  <Method String StringBuilder.toString()>
        //   13   55:invokespecial   #50  <Method void RuntimeException(String)>
        //   14   58:athrow          
        //   15   59:aload_0         
        //   16   60:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   17   63:invokestatic    #56  <Method android.view.GestureDetector$OnGestureListener GestureDetectorCompat$GestureDetectorCompatImplBase.access$100(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   18   66:aload_0         
        //   19   67:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   20   70:invokestatic    #60  <Method MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.access$000(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   21   73:invokeinterface #66  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(MotionEvent)>
        //   22   78:return          
        //   23   79:aload_0         
        //   24   80:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   25   83:invokestatic    #69  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase.access$200(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   26   86:return          
        //   27   87:aload_0         
        //   28   88:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   29   91:invokestatic    #73  <Method android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.access$300(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   30   94:ifnull          78
        //   31   97:aload_0         
        //   32   98:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   33  101:invokestatic    #77  <Method boolean GestureDetectorCompat$GestureDetectorCompatImplBase.access$400(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   34  104:ifne            128
        //   35  107:aload_0         
        //   36  108:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   37  111:invokestatic    #73  <Method android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.access$300(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   38  114:aload_0         
        //   39  115:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   40  118:invokestatic    #60  <Method MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.access$000(GestureDetectorCompat$GestureDetectorCompatImplBase)>
        //   41  121:invokeinterface #83  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
        //   42  126:pop             
        //   43  127:return          
        //   44  128:aload_0         
        //   45  129:getfield        #10  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
        //   46  132:iconst_1        
        //   47  133:invokestatic    #87  <Method boolean GestureDetectorCompat$GestureDetectorCompatImplBase.access$502(GestureDetectorCompat$GestureDetectorCompatImplBase, boolean)>
        //   48  136:pop             
        //   49  137:return          
        }

        final GestureDetectorCompatImplBase this$0;
    }

    static class GestureDetectorCompatImplJellybeanMr2
        implements GestureDetectorCompatImpl
    {

        public GestureDetectorCompatImplJellybeanMr2(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #15  <Class GestureDetector>
        //    4    8:dup             
        //    5    9:aload_1         
        //    6   10:aload_2         
        //    7   11:aload_3         
        //    8   12:invokespecial   #17  <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener, Handler)>
        //    9   15:putfield        #19  <Field GestureDetector mDetector>
        //   10   18:return          
        }

        public boolean isLongpressEnabled()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field GestureDetector mDetector>
        //    2    4:invokevirtual   #23  <Method boolean GestureDetector.isLongpressEnabled()>
        //    3    7:ireturn         
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field GestureDetector mDetector>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #27  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
        //    4    8:ireturn         
        }

        public void setIsLongpressEnabled(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field GestureDetector mDetector>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #31  <Method void GestureDetector.setIsLongpressEnabled(boolean)>
        //    4    8:return          
        }

        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field GestureDetector mDetector>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #35  <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
        //    4    8:return          
        }

        private final GestureDetector mDetector;
    }


    public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aconst_null     
    //    4    4:invokespecial   #11  <Method void GestureDetectorCompat(Context, android.view.GestureDetector$OnGestureListener, Handler)>
    //    5    7:return          
    }

    public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Object()>
    //    2    4:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
    //    3    7:bipush          17
    //    4    9:icmple          27
    //    5   12:aload_0         
    //    6   13:new             #22  <Class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2>
    //    7   16:dup             
    //    8   17:aload_1         
    //    9   18:aload_2         
    //   10   19:aload_3         
    //   11   20:invokespecial   #23  <Method void GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(Context, android.view.GestureDetector$OnGestureListener, Handler)>
    //   12   23:putfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //   13   26:return          
    //   14   27:aload_0         
    //   15   28:new             #27  <Class GestureDetectorCompat$GestureDetectorCompatImplBase>
    //   16   31:dup             
    //   17   32:aload_1         
    //   18   33:aload_2         
    //   19   34:aload_3         
    //   20   35:invokespecial   #28  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase(Context, android.view.GestureDetector$OnGestureListener, Handler)>
    //   21   38:putfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //   22   41:return          
    }

    public boolean isLongpressEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //    2    4:invokeinterface #34  <Method boolean GestureDetectorCompat$GestureDetectorCompatImpl.isLongpressEnabled()>
    //    3    9:ireturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //    2    4:aload_1         
    //    3    5:invokeinterface #38  <Method boolean GestureDetectorCompat$GestureDetectorCompatImpl.onTouchEvent(MotionEvent)>
    //    4   10:ireturn         
    }

    public void setIsLongpressEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //    2    4:iload_1         
    //    3    5:invokeinterface #42  <Method void GestureDetectorCompat$GestureDetectorCompatImpl.setIsLongpressEnabled(boolean)>
    //    4   10:return          
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
    //    2    4:aload_1         
    //    3    5:invokeinterface #46  <Method void GestureDetectorCompat$GestureDetectorCompatImpl.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
    //    4   10:return          
    }

    private final GestureDetectorCompatImpl mImpl;
}
