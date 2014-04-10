// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.animation.*;

public abstract class AutoScrollHelper
    implements android.view.View.OnTouchListener
{
    private static class ClampedScroller
    {

        public ClampedScroller()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:ldc2w           #23  <Long 0x8000000000000000L>
        //    4    8:putfield        #26  <Field long mStartTime>
        //    5   11:aload_0         
        //    6   12:ldc2w           #27  <Long -1L>
        //    7   15:putfield        #30  <Field long mStopTime>
        //    8   18:aload_0         
        //    9   19:lconst_0        
        //   10   20:putfield        #32  <Field long mDeltaTime>
        //   11   23:aload_0         
        //   12   24:iconst_0        
        //   13   25:putfield        #34  <Field int mDeltaX>
        //   14   28:aload_0         
        //   15   29:iconst_0        
        //   16   30:putfield        #36  <Field int mDeltaY>
        //   17   33:return          
        }

        private float getValueAt(long l)
        {
        //    0    0:lload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #26  <Field long mStartTime>
        //    3    5:lcmp            
        //    4    6:ifge            11
        //    5    9:fconst_0        
        //    6   10:freturn         
        //    7   11:aload_0         
        //    8   12:getfield        #30  <Field long mStopTime>
        //    9   15:lconst_0        
        //   10   16:lcmp            
        //   11   17:iflt            29
        //   12   20:lload_1         
        //   13   21:aload_0         
        //   14   22:getfield        #30  <Field long mStopTime>
        //   15   25:lcmp            
        //   16   26:ifge            51
        //   17   29:ldc1            #39  <Float 0.5F>
        //   18   31:lload_1         
        //   19   32:aload_0         
        //   20   33:getfield        #26  <Field long mStartTime>
        //   21   36:lsub            
        //   22   37:l2f             
        //   23   38:aload_0         
        //   24   39:getfield        #41  <Field int mRampUpDuration>
        //   25   42:i2f             
        //   26   43:fdiv            
        //   27   44:fconst_0        
        //   28   45:fconst_1        
        //   29   46:invokestatic    #47  <Method float AutoScrollHelper.access$900(float, float, float)>
        //   30   49:fmul            
        //   31   50:freturn         
        //   32   51:lload_1         
        //   33   52:aload_0         
        //   34   53:getfield        #30  <Field long mStopTime>
        //   35   56:lsub            
        //   36   57:lstore_3        
        //   37   58:fconst_1        
        //   38   59:aload_0         
        //   39   60:getfield        #49  <Field float mStopValue>
        //   40   63:fsub            
        //   41   64:aload_0         
        //   42   65:getfield        #49  <Field float mStopValue>
        //   43   68:lload_3         
        //   44   69:l2f             
        //   45   70:aload_0         
        //   46   71:getfield        #51  <Field int mEffectiveRampDown>
        //   47   74:i2f             
        //   48   75:fdiv            
        //   49   76:fconst_0        
        //   50   77:fconst_1        
        //   51   78:invokestatic    #47  <Method float AutoScrollHelper.access$900(float, float, float)>
        //   52   81:fmul            
        //   53   82:fadd            
        //   54   83:freturn         
        }

        private float interpolateValue(float f)
        {
        //    0    0:fload_1         
        //    1    1:ldc1            #54  <Float -4F>
        //    2    3:fload_1         
        //    3    4:fmul            
        //    4    5:fmul            
        //    5    6:ldc1            #55  <Float 4F>
        //    6    8:fload_1         
        //    7    9:fmul            
        //    8   10:fadd            
        //    9   11:freturn         
        }

        public void computeScrollDelta()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #32  <Field long mDeltaTime>
        //    2    4:lconst_0        
        //    3    5:lcmp            
        //    4    6:ifne            19
        //    5    9:new             #58  <Class RuntimeException>
        //    6   12:dup             
        //    7   13:ldc1            #60  <String "Cannot compute scroll delta before calling start()">
        //    8   15:invokespecial   #63  <Method void RuntimeException(String)>
        //    9   18:athrow          
        //   10   19:invokestatic    #69  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //   11   22:lstore_1        
        //   12   23:aload_0         
        //   13   24:aload_0         
        //   14   25:lload_1         
        //   15   26:invokespecial   #71  <Method float getValueAt(long)>
        //   16   29:invokespecial   #73  <Method float interpolateValue(float)>
        //   17   32:fstore_3        
        //   18   33:lload_1         
        //   19   34:aload_0         
        //   20   35:getfield        #32  <Field long mDeltaTime>
        //   21   38:lsub            
        //   22   39:lstore          4
        //   23   41:aload_0         
        //   24   42:lload_1         
        //   25   43:putfield        #32  <Field long mDeltaTime>
        //   26   46:aload_0         
        //   27   47:fload_3         
        //   28   48:lload           4
        //   29   50:l2f             
        //   30   51:fmul            
        //   31   52:aload_0         
        //   32   53:getfield        #75  <Field float mTargetVelocityX>
        //   33   56:fmul            
        //   34   57:f2i             
        //   35   58:putfield        #34  <Field int mDeltaX>
        //   36   61:aload_0         
        //   37   62:fload_3         
        //   38   63:lload           4
        //   39   65:l2f             
        //   40   66:fmul            
        //   41   67:aload_0         
        //   42   68:getfield        #77  <Field float mTargetVelocityY>
        //   43   71:fmul            
        //   44   72:f2i             
        //   45   73:putfield        #36  <Field int mDeltaY>
        //   46   76:return          
        }

        public int getDeltaX()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #34  <Field int mDeltaX>
        //    2    4:ireturn         
        }

        public int getDeltaY()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #36  <Field int mDeltaY>
        //    2    4:ireturn         
        }

        public int getHorizontalDirection()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #75  <Field float mTargetVelocityX>
        //    2    4:aload_0         
        //    3    5:getfield        #75  <Field float mTargetVelocityX>
        //    4    8:invokestatic    #86  <Method float Math.abs(float)>
        //    5   11:fdiv            
        //    6   12:f2i             
        //    7   13:ireturn         
        }

        public int getVerticalDirection()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #77  <Field float mTargetVelocityY>
        //    2    4:aload_0         
        //    3    5:getfield        #77  <Field float mTargetVelocityY>
        //    4    8:invokestatic    #86  <Method float Math.abs(float)>
        //    5   11:fdiv            
        //    6   12:f2i             
        //    7   13:ireturn         
        }

        public boolean isFinished()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field long mStopTime>
        //    2    4:lconst_0        
        //    3    5:lcmp            
        //    4    6:ifle            28
        //    5    9:invokestatic    #69  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //    6   12:aload_0         
        //    7   13:getfield        #30  <Field long mStopTime>
        //    8   16:aload_0         
        //    9   17:getfield        #51  <Field int mEffectiveRampDown>
        //   10   20:i2l             
        //   11   21:ladd            
        //   12   22:lcmp            
        //   13   23:ifle            28
        //   14   26:iconst_1        
        //   15   27:ireturn         
        //   16   28:iconst_0        
        //   17   29:ireturn         
        }

        public void requestStop()
        {
        //    0    0:invokestatic    #69  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //    1    3:lstore_1        
        //    2    4:aload_0         
        //    3    5:lload_1         
        //    4    6:aload_0         
        //    5    7:getfield        #26  <Field long mStartTime>
        //    6   10:lsub            
        //    7   11:l2i             
        //    8   12:iconst_0        
        //    9   13:aload_0         
        //   10   14:getfield        #92  <Field int mRampDownDuration>
        //   11   17:invokestatic    #96  <Method int AutoScrollHelper.access$800(int, int, int)>
        //   12   20:putfield        #51  <Field int mEffectiveRampDown>
        //   13   23:aload_0         
        //   14   24:aload_0         
        //   15   25:lload_1         
        //   16   26:invokespecial   #71  <Method float getValueAt(long)>
        //   17   29:putfield        #49  <Field float mStopValue>
        //   18   32:aload_0         
        //   19   33:lload_1         
        //   20   34:putfield        #30  <Field long mStopTime>
        //   21   37:return          
        }

        public void setRampDownDuration(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #92  <Field int mRampDownDuration>
        //    3    5:return          
        }

        public void setRampUpDuration(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #41  <Field int mRampUpDuration>
        //    3    5:return          
        }

        public void setTargetVelocity(float f, float f1)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:putfield        #75  <Field float mTargetVelocityX>
        //    3    5:aload_0         
        //    4    6:fload_2         
        //    5    7:putfield        #77  <Field float mTargetVelocityY>
        //    6   10:return          
        }

        public void start()
        {
        //    0    0:aload_0         
        //    1    1:invokestatic    #69  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //    2    4:putfield        #26  <Field long mStartTime>
        //    3    7:aload_0         
        //    4    8:ldc2w           #27  <Long -1L>
        //    5   11:putfield        #30  <Field long mStopTime>
        //    6   14:aload_0         
        //    7   15:aload_0         
        //    8   16:getfield        #26  <Field long mStartTime>
        //    9   19:putfield        #32  <Field long mDeltaTime>
        //   10   22:aload_0         
        //   11   23:ldc1            #39  <Float 0.5F>
        //   12   25:putfield        #49  <Field float mStopValue>
        //   13   28:aload_0         
        //   14   29:iconst_0        
        //   15   30:putfield        #34  <Field int mDeltaX>
        //   16   33:aload_0         
        //   17   34:iconst_0        
        //   18   35:putfield        #36  <Field int mDeltaY>
        //   19   38:return          
        }

        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;
    }

    private class ScrollAnimationRunnable
        implements Runnable
    {

        private ScrollAnimationRunnable()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AutoScrollHelper this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ScrollAnimationRunnable(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper)>
        //    3    5:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AutoScrollHelper this$0>
        //    2    4:invokestatic    #25  <Method boolean AutoScrollHelper.access$100(AutoScrollHelper)>
        //    3    7:ifne            11
        //    4   10:return          
        //    5   11:aload_0         
        //    6   12:getfield        #12  <Field AutoScrollHelper this$0>
        //    7   15:invokestatic    #28  <Method boolean AutoScrollHelper.access$200(AutoScrollHelper)>
        //    8   18:ifeq            40
        //    9   21:aload_0         
        //   10   22:getfield        #12  <Field AutoScrollHelper this$0>
        //   11   25:iconst_0        
        //   12   26:invokestatic    #32  <Method boolean AutoScrollHelper.access$202(AutoScrollHelper, boolean)>
        //   13   29:pop             
        //   14   30:aload_0         
        //   15   31:getfield        #12  <Field AutoScrollHelper this$0>
        //   16   34:invokestatic    #36  <Method AutoScrollHelper$ClampedScroller AutoScrollHelper.access$300(AutoScrollHelper)>
        //   17   37:invokevirtual   #41  <Method void AutoScrollHelper$ClampedScroller.start()>
        //   18   40:aload_0         
        //   19   41:getfield        #12  <Field AutoScrollHelper this$0>
        //   20   44:invokestatic    #36  <Method AutoScrollHelper$ClampedScroller AutoScrollHelper.access$300(AutoScrollHelper)>
        //   21   47:astore_1        
        //   22   48:aload_1         
        //   23   49:invokevirtual   #45  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
        //   24   52:ifne            65
        //   25   55:aload_0         
        //   26   56:getfield        #12  <Field AutoScrollHelper this$0>
        //   27   59:invokestatic    #48  <Method boolean AutoScrollHelper.access$400(AutoScrollHelper)>
        //   28   62:ifne            75
        //   29   65:aload_0         
        //   30   66:getfield        #12  <Field AutoScrollHelper this$0>
        //   31   69:iconst_0        
        //   32   70:invokestatic    #51  <Method boolean AutoScrollHelper.access$102(AutoScrollHelper, boolean)>
        //   33   73:pop             
        //   34   74:return          
        //   35   75:aload_0         
        //   36   76:getfield        #12  <Field AutoScrollHelper this$0>
        //   37   79:invokestatic    #54  <Method boolean AutoScrollHelper.access$500(AutoScrollHelper)>
        //   38   82:ifeq            101
        //   39   85:aload_0         
        //   40   86:getfield        #12  <Field AutoScrollHelper this$0>
        //   41   89:iconst_0        
        //   42   90:invokestatic    #57  <Method boolean AutoScrollHelper.access$502(AutoScrollHelper, boolean)>
        //   43   93:pop             
        //   44   94:aload_0         
        //   45   95:getfield        #12  <Field AutoScrollHelper this$0>
        //   46   98:invokestatic    #60  <Method void AutoScrollHelper.access$600(AutoScrollHelper)>
        //   47  101:aload_1         
        //   48  102:invokevirtual   #63  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
        //   49  105:aload_1         
        //   50  106:invokevirtual   #67  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
        //   51  109:istore_3        
        //   52  110:aload_1         
        //   53  111:invokevirtual   #70  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
        //   54  114:istore          4
        //   55  116:aload_0         
        //   56  117:getfield        #12  <Field AutoScrollHelper this$0>
        //   57  120:iload_3         
        //   58  121:iload           4
        //   59  123:invokevirtual   #74  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
        //   60  126:aload_0         
        //   61  127:getfield        #12  <Field AutoScrollHelper this$0>
        //   62  130:invokestatic    #78  <Method View AutoScrollHelper.access$700(AutoScrollHelper)>
        //   63  133:aload_0         
        //   64  134:invokestatic    #84  <Method void ViewCompat.postOnAnimation(View, Runnable)>
        //   65  137:return          
        }

        final AutoScrollHelper this$0;
    }


    static 
    {
    //    0    0:invokestatic    #66  <Method int ViewConfiguration.getTapTimeout()>
    //    1    3:putstatic       #68  <Field int DEFAULT_ACTIVATION_DELAY>
    //    2    6:return          
    }

    public AutoScrollHelper(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #72  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #74  <Class AutoScrollHelper$ClampedScroller>
    //    4    8:dup             
    //    5    9:invokespecial   #75  <Method void AutoScrollHelper$ClampedScroller()>
    //    6   12:putfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    7   15:aload_0         
    //    8   16:new             #79  <Class AccelerateInterpolator>
    //    9   19:dup             
    //   10   20:invokespecial   #80  <Method void AccelerateInterpolator()>
    //   11   23:putfield        #82  <Field Interpolator mEdgeInterpolator>
    //   12   26:aload_0         
    //   13   27:iconst_2        
    //   14   28:newarray        float[]
    //   15   30:dup             
    //   16   31:iconst_0        
    //   17   32:fconst_0        
    //   18   33:fastore         
    //   19   34:dup             
    //   20   35:iconst_1        
    //   21   36:fconst_0        
    //   22   37:fastore         
    //   23   38:putfield        #84  <Field float[] mRelativeEdges>
    //   24   41:aload_0         
    //   25   42:iconst_2        
    //   26   43:newarray        float[]
    //   27   45:dup             
    //   28   46:iconst_0        
    //   29   47:ldc1            #14  <Float 3.402823E+38F>
    //   30   49:fastore         
    //   31   50:dup             
    //   32   51:iconst_1        
    //   33   52:ldc1            #14  <Float 3.402823E+38F>
    //   34   54:fastore         
    //   35   55:putfield        #86  <Field float[] mMaximumEdges>
    //   36   58:aload_0         
    //   37   59:iconst_2        
    //   38   60:newarray        float[]
    //   39   62:dup             
    //   40   63:iconst_0        
    //   41   64:fconst_0        
    //   42   65:fastore         
    //   43   66:dup             
    //   44   67:iconst_1        
    //   45   68:fconst_0        
    //   46   69:fastore         
    //   47   70:putfield        #88  <Field float[] mRelativeVelocity>
    //   48   73:aload_0         
    //   49   74:iconst_2        
    //   50   75:newarray        float[]
    //   51   77:dup             
    //   52   78:iconst_0        
    //   53   79:fconst_0        
    //   54   80:fastore         
    //   55   81:dup             
    //   56   82:iconst_1        
    //   57   83:fconst_0        
    //   58   84:fastore         
    //   59   85:putfield        #90  <Field float[] mMinimumVelocity>
    //   60   88:aload_0         
    //   61   89:iconst_2        
    //   62   90:newarray        float[]
    //   63   92:dup             
    //   64   93:iconst_0        
    //   65   94:ldc1            #14  <Float 3.402823E+38F>
    //   66   96:fastore         
    //   67   97:dup             
    //   68   98:iconst_1        
    //   69   99:ldc1            #14  <Float 3.402823E+38F>
    //   70  101:fastore         
    //   71  102:putfield        #92  <Field float[] mMaximumVelocity>
    //   72  105:aload_0         
    //   73  106:aload_1         
    //   74  107:putfield        #94  <Field View mTarget>
    //   75  110:invokestatic    #100 <Method Resources Resources.getSystem()>
    //   76  113:invokevirtual   #104 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   77  116:astore_2        
    //   78  117:ldc1            #105 <Float 0.5F>
    //   79  119:ldc1            #106 <Float 1575F>
    //   80  121:aload_2         
    //   81  122:getfield        #111 <Field float DisplayMetrics.density>
    //   82  125:fmul            
    //   83  126:fadd            
    //   84  127:f2i             
    //   85  128:istore_3        
    //   86  129:ldc1            #105 <Float 0.5F>
    //   87  131:ldc1            #112 <Float 315F>
    //   88  133:aload_2         
    //   89  134:getfield        #111 <Field float DisplayMetrics.density>
    //   90  137:fmul            
    //   91  138:fadd            
    //   92  139:f2i             
    //   93  140:istore          4
    //   94  142:aload_0         
    //   95  143:iload_3         
    //   96  144:i2f             
    //   97  145:iload_3         
    //   98  146:i2f             
    //   99  147:invokevirtual   #116 <Method AutoScrollHelper setMaximumVelocity(float, float)>
    //  100  150:pop             
    //  101  151:aload_0         
    //  102  152:iload           4
    //  103  154:i2f             
    //  104  155:iload           4
    //  105  157:i2f             
    //  106  158:invokevirtual   #119 <Method AutoScrollHelper setMinimumVelocity(float, float)>
    //  107  161:pop             
    //  108  162:aload_0         
    //  109  163:iconst_1        
    //  110  164:invokevirtual   #123 <Method AutoScrollHelper setEdgeType(int)>
    //  111  167:pop             
    //  112  168:aload_0         
    //  113  169:ldc1            #14  <Float 3.402823E+38F>
    //  114  171:ldc1            #14  <Float 3.402823E+38F>
    //  115  173:invokevirtual   #126 <Method AutoScrollHelper setMaximumEdges(float, float)>
    //  116  176:pop             
    //  117  177:aload_0         
    //  118  178:ldc1            #23  <Float 0.2F>
    //  119  180:ldc1            #23  <Float 0.2F>
    //  120  182:invokevirtual   #129 <Method AutoScrollHelper setRelativeEdges(float, float)>
    //  121  185:pop             
    //  122  186:aload_0         
    //  123  187:fconst_1        
    //  124  188:fconst_1        
    //  125  189:invokevirtual   #132 <Method AutoScrollHelper setRelativeVelocity(float, float)>
    //  126  192:pop             
    //  127  193:aload_0         
    //  128  194:getstatic       #68  <Field int DEFAULT_ACTIVATION_DELAY>
    //  129  197:invokevirtual   #135 <Method AutoScrollHelper setActivationDelay(int)>
    //  130  200:pop             
    //  131  201:aload_0         
    //  132  202:sipush          500
    //  133  205:invokevirtual   #138 <Method AutoScrollHelper setRampUpDuration(int)>
    //  134  208:pop             
    //  135  209:aload_0         
    //  136  210:sipush          500
    //  137  213:invokevirtual   #141 <Method AutoScrollHelper setRampDownDuration(int)>
    //  138  216:pop             
    //  139  217:return          
    }

    static boolean access$100(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #145 <Field boolean mAnimating>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #145 <Field boolean mAnimating>
    //    5    4:ireturn         
    }

    static boolean access$102(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #145 <Field boolean mAnimating>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #145 <Field boolean mAnimating>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static boolean access$200(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #150 <Field boolean mNeedsReset>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #150 <Field boolean mNeedsReset>
    //    5    4:ireturn         
    }

    static boolean access$202(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #150 <Field boolean mNeedsReset>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #150 <Field boolean mNeedsReset>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static ClampedScroller access$300(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    5    4:areturn         
    }

    static boolean access$400(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #158 <Method boolean shouldAnimate()>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #158 <Method boolean shouldAnimate()>
    //    5    4:ireturn         
    }

    static boolean access$500(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #161 <Field boolean mNeedsCancel>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #161 <Field boolean mNeedsCancel>
    //    5    4:ireturn         
    }

    static boolean access$502(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #161 <Field boolean mNeedsCancel>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #161 <Field boolean mNeedsCancel>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static void access$600(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #167 <Method void cancelTargetTouch()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #167 <Method void cancelTargetTouch()>
    //    5    4:return          
    }

    static View access$700(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field View mTarget>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #94  <Field View mTarget>
    //    5    4:areturn         
    }

    static int access$800(int i, int j, int k)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #174 <Method int constrain(int, int, int)>
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:iload_0         
    //    6    1:iload_1         
    //    7    2:iload_2         
    //    8    3:invokestatic    #174 <Method int constrain(int, int, int)>
    //    9    6:ireturn         
    }

    static float access$900(float f, float f1, float f2)
    {
    //    0    0:fload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:invokestatic    #178 <Method float constrain(float, float, float)>
    //    4    6:freturn         
// Previous instruction length mismatch
    //    5    0:fload_0         
    //    6    1:fload_1         
    //    7    2:fload_2         
    //    8    3:invokestatic    #178 <Method float constrain(float, float, float)>
    //    9    6:freturn         
    }

    private void cancelTargetTouch()
    {
    //    0    0:invokestatic    #184 <Method long SystemClock.uptimeMillis()>
    //    1    3:lstore_1        
    //    2    4:lload_1         
    //    3    5:lload_1         
    //    4    6:iconst_3        
    //    5    7:fconst_0        
    //    6    8:fconst_0        
    //    7    9:iconst_0        
    //    8   10:invokestatic    #190 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
    //    9   13:astore_3        
    //   10   14:aload_0         
    //   11   15:getfield        #94  <Field View mTarget>
    //   12   18:aload_3         
    //   13   19:invokevirtual   #196 <Method boolean View.onTouchEvent(MotionEvent)>
    //   14   22:pop             
    //   15   23:aload_3         
    //   16   24:invokevirtual   #199 <Method void MotionEvent.recycle()>
    //   17   27:return          
    }

    private float computeTargetVelocity(int i, float f, float f1, float f2)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #84  <Field float[] mRelativeEdges>
    //    3    5:iload_1         
    //    4    6:faload          
    //    5    7:fload_3         
    //    6    8:aload_0         
    //    7    9:getfield        #86  <Field float[] mMaximumEdges>
    //    8   12:iload_1         
    //    9   13:faload          
    //   10   14:fload_2         
    //   11   15:invokespecial   #205 <Method float getEdgeValue(float, float, float, float)>
    //   12   18:fstore          5
    //   13   20:fload           5
    //   14   22:fconst_0        
    //   15   23:fcmpl           
    //   16   24:ifne            29
    //   17   27:fconst_0        
    //   18   28:freturn         
    //   19   29:aload_0         
    //   20   30:getfield        #88  <Field float[] mRelativeVelocity>
    //   21   33:iload_1         
    //   22   34:faload          
    //   23   35:fstore          6
    //   24   37:aload_0         
    //   25   38:getfield        #90  <Field float[] mMinimumVelocity>
    //   26   41:iload_1         
    //   27   42:faload          
    //   28   43:fstore          7
    //   29   45:aload_0         
    //   30   46:getfield        #92  <Field float[] mMaximumVelocity>
    //   31   49:iload_1         
    //   32   50:faload          
    //   33   51:fstore          8
    //   34   53:fload           6
    //   35   55:fload           4
    //   36   57:fmul            
    //   37   58:fstore          9
    //   38   60:fload           5
    //   39   62:fconst_0        
    //   40   63:fcmpl           
    //   41   64:ifle            80
    //   42   67:fload           5
    //   43   69:fload           9
    //   44   71:fmul            
    //   45   72:fload           7
    //   46   74:fload           8
    //   47   76:invokestatic    #178 <Method float constrain(float, float, float)>
    //   48   79:freturn         
    //   49   80:fload           9
    //   50   82:fload           5
    //   51   84:fneg            
    //   52   85:fmul            
    //   53   86:fload           7
    //   54   88:fload           8
    //   55   90:invokestatic    #178 <Method float constrain(float, float, float)>
    //   56   93:fneg            
    //   57   94:freturn         
    }

    private static float constrain(float f, float f1, float f2)
    {
    //    0    0:fload_0         
    //    1    1:fload_2         
    //    2    2:fcmpl           
    //    3    3:ifle            8
    //    4    6:fload_2         
    //    5    7:freturn         
    //    6    8:fload_0         
    //    7    9:fload_1         
    //    8   10:fcmpg           
    //    9   11:ifge            16
    //   10   14:fload_1         
    //   11   15:freturn         
    //   12   16:fload_0         
    //   13   17:freturn         
    }

    private static int constrain(int i, int j, int k)
    {
    //    0    0:iload_0         
    //    1    1:iload_2         
    //    2    2:icmple          7
    //    3    5:iload_2         
    //    4    6:ireturn         
    //    5    7:iload_0         
    //    6    8:iload_1         
    //    7    9:icmpge          14
    //    8   12:iload_1         
    //    9   13:ireturn         
    //   10   14:iload_0         
    //   11   15:ireturn         
    }

    private float constrainEdgeValue(float f, float f1)
    {
    //    0    0:fload_2         
    //    1    1:fconst_0        
    //    2    2:fcmpl           
    //    3    3:ifne            8
    //    4    6:fconst_0        
    //    5    7:freturn         
    //    6    8:aload_0         
    //    7    9:getfield        #209 <Field int mEdgeType>
    //    8   12:tableswitch     0 2: default 40
    //                   0 42
    //                   1 42
    //                   2 77
    //    9   40:fconst_0        
    //   10   41:freturn         
    //   11   42:fload_1         
    //   12   43:fload_2         
    //   13   44:fcmpg           
    //   14   45:ifge            6
    //   15   48:fload_1         
    //   16   49:fconst_0        
    //   17   50:fcmpl           
    //   18   51:iflt            60
    //   19   54:fconst_1        
    //   20   55:fload_1         
    //   21   56:fload_2         
    //   22   57:fdiv            
    //   23   58:fsub            
    //   24   59:freturn         
    //   25   60:aload_0         
    //   26   61:getfield        #145 <Field boolean mAnimating>
    //   27   64:ifeq            6
    //   28   67:aload_0         
    //   29   68:getfield        #209 <Field int mEdgeType>
    //   30   71:iconst_1        
    //   31   72:icmpne          6
    //   32   75:fconst_1        
    //   33   76:freturn         
    //   34   77:fload_1         
    //   35   78:fconst_0        
    //   36   79:fcmpg           
    //   37   80:ifge            6
    //   38   83:fload_1         
    //   39   84:fload_2         
    //   40   85:fneg            
    //   41   86:fdiv            
    //   42   87:freturn         
    }

    private float getEdgeValue(float f, float f1, float f2, float f3)
    {
    //    0    0:fload_1         
    //    1    1:fload_2         
    //    2    2:fmul            
    //    3    3:fconst_0        
    //    4    4:fload_3         
    //    5    5:invokestatic    #178 <Method float constrain(float, float, float)>
    //    6    8:fstore          5
    //    7   10:aload_0         
    //    8   11:fload           4
    //    9   13:fload           5
    //   10   15:invokespecial   #211 <Method float constrainEdgeValue(float, float)>
    //   11   18:fstore          6
    //   12   20:aload_0         
    //   13   21:fload_2         
    //   14   22:fload           4
    //   15   24:fsub            
    //   16   25:fload           5
    //   17   27:invokespecial   #211 <Method float constrainEdgeValue(float, float)>
    //   18   30:fload           6
    //   19   32:fsub            
    //   20   33:fstore          7
    //   21   35:fload           7
    //   22   37:fconst_0        
    //   23   38:fcmpg           
    //   24   39:ifge            70
    //   25   42:aload_0         
    //   26   43:getfield        #82  <Field Interpolator mEdgeInterpolator>
    //   27   46:fload           7
    //   28   48:fneg            
    //   29   49:invokeinterface #217 <Method float Interpolator.getInterpolation(float)>
    //   30   54:fneg            
    //   31   55:fstore          10
    //   32   57:fload           10
    //   33   59:ldc1            #218 <Float -1F>
    //   34   61:fconst_1        
    //   35   62:invokestatic    #178 <Method float constrain(float, float, float)>
    //   36   65:fstore          9
    //   37   67:fload           9
    //   38   69:freturn         
    //   39   70:fload           7
    //   40   72:fconst_0        
    //   41   73:fcmpl           
    //   42   74:istore          8
    //   43   76:fconst_0        
    //   44   77:fstore          9
    //   45   79:iload           8
    //   46   81:ifle            67
    //   47   84:aload_0         
    //   48   85:getfield        #82  <Field Interpolator mEdgeInterpolator>
    //   49   88:fload           7
    //   50   90:invokeinterface #217 <Method float Interpolator.getInterpolation(float)>
    //   51   95:fstore          10
    //   52   97:goto            57
    }

    private void requestStop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #150 <Field boolean mNeedsReset>
    //    2    4:ifeq            13
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #145 <Field boolean mAnimating>
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    9   17:invokevirtual   #221 <Method void AutoScrollHelper$ClampedScroller.requestStop()>
    //   10   20:return          
    }

    private boolean shouldAnimate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:invokevirtual   #224 <Method int AutoScrollHelper$ClampedScroller.getVerticalDirection()>
    //    5    9:istore_2        
    //    6   10:aload_1         
    //    7   11:invokevirtual   #227 <Method int AutoScrollHelper$ClampedScroller.getHorizontalDirection()>
    //    8   14:istore_3        
    //    9   15:iload_2         
    //   10   16:ifeq            27
    //   11   19:aload_0         
    //   12   20:iload_2         
    //   13   21:invokevirtual   #231 <Method boolean canTargetScrollVertically(int)>
    //   14   24:ifne            39
    //   15   27:iload_3         
    //   16   28:ifeq            41
    //   17   31:aload_0         
    //   18   32:iload_3         
    //   19   33:invokevirtual   #234 <Method boolean canTargetScrollHorizontally(int)>
    //   20   36:ifeq            41
    //   21   39:iconst_1        
    //   22   40:ireturn         
    //   23   41:iconst_0        
    //   24   42:ireturn         
    }

    private void startAnimating()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #237 <Field Runnable mRunnable>
    //    2    4:ifnonnull       20
    //    3    7:aload_0         
    //    4    8:new             #239 <Class AutoScrollHelper$ScrollAnimationRunnable>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:aconst_null     
    //    8   14:invokespecial   #242 <Method void AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper, AutoScrollHelper$1)>
    //    9   17:putfield        #237 <Field Runnable mRunnable>
    //   10   20:aload_0         
    //   11   21:iconst_1        
    //   12   22:putfield        #145 <Field boolean mAnimating>
    //   13   25:aload_0         
    //   14   26:iconst_1        
    //   15   27:putfield        #150 <Field boolean mNeedsReset>
    //   16   30:aload_0         
    //   17   31:getfield        #244 <Field boolean mAlreadyDelayed>
    //   18   34:ifne            66
    //   19   37:aload_0         
    //   20   38:getfield        #246 <Field int mActivationDelay>
    //   21   41:ifle            66
    //   22   44:aload_0         
    //   23   45:getfield        #94  <Field View mTarget>
    //   24   48:aload_0         
    //   25   49:getfield        #237 <Field Runnable mRunnable>
    //   26   52:aload_0         
    //   27   53:getfield        #246 <Field int mActivationDelay>
    //   28   56:i2l             
    //   29   57:invokestatic    #252 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
    //   30   60:aload_0         
    //   31   61:iconst_1        
    //   32   62:putfield        #244 <Field boolean mAlreadyDelayed>
    //   33   65:return          
    //   34   66:aload_0         
    //   35   67:getfield        #237 <Field Runnable mRunnable>
    //   36   70:invokeinterface #257 <Method void Runnable.run()>
    //   37   75:goto            60
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public boolean isEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #260 <Field boolean mEnabled>
    //    2    4:ireturn         
    }

    public boolean isExclusive()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #263 <Field boolean mExclusive>
    //    2    4:ireturn         
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:aload_0         
    //    3    3:getfield        #260 <Field boolean mEnabled>
    //    4    6:ifne            11
    //    5    9:iconst_0        
    //    6   10:ireturn         
    //    7   11:aload_2         
    //    8   12:invokestatic    #271 <Method int MotionEventCompat.getActionMasked(MotionEvent)>
    //    9   15:tableswitch     0 3: default 44
    //                   0 60
    //                   1 150
    //                   2 70
    //                   3 150
    //   10   44:aload_0         
    //   11   45:getfield        #263 <Field boolean mExclusive>
    //   12   48:ifeq            157
    //   13   51:aload_0         
    //   14   52:getfield        #145 <Field boolean mAnimating>
    //   15   55:ifeq            157
    //   16   58:iload_3         
    //   17   59:ireturn         
    //   18   60:aload_0         
    //   19   61:iload_3         
    //   20   62:putfield        #161 <Field boolean mNeedsCancel>
    //   21   65:aload_0         
    //   22   66:iconst_0        
    //   23   67:putfield        #244 <Field boolean mAlreadyDelayed>
    //   24   70:aload_0         
    //   25   71:iconst_0        
    //   26   72:aload_2         
    //   27   73:invokevirtual   #275 <Method float MotionEvent.getX()>
    //   28   76:aload_1         
    //   29   77:invokevirtual   #278 <Method int View.getWidth()>
    //   30   80:i2f             
    //   31   81:aload_0         
    //   32   82:getfield        #94  <Field View mTarget>
    //   33   85:invokevirtual   #278 <Method int View.getWidth()>
    //   34   88:i2f             
    //   35   89:invokespecial   #280 <Method float computeTargetVelocity(int, float, float, float)>
    //   36   92:fstore          4
    //   37   94:aload_0         
    //   38   95:iload_3         
    //   39   96:aload_2         
    //   40   97:invokevirtual   #283 <Method float MotionEvent.getY()>
    //   41  100:aload_1         
    //   42  101:invokevirtual   #286 <Method int View.getHeight()>
    //   43  104:i2f             
    //   44  105:aload_0         
    //   45  106:getfield        #94  <Field View mTarget>
    //   46  109:invokevirtual   #286 <Method int View.getHeight()>
    //   47  112:i2f             
    //   48  113:invokespecial   #280 <Method float computeTargetVelocity(int, float, float, float)>
    //   49  116:fstore          5
    //   50  118:aload_0         
    //   51  119:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //   52  122:fload           4
    //   53  124:fload           5
    //   54  126:invokevirtual   #290 <Method void AutoScrollHelper$ClampedScroller.setTargetVelocity(float, float)>
    //   55  129:aload_0         
    //   56  130:getfield        #145 <Field boolean mAnimating>
    //   57  133:ifne            44
    //   58  136:aload_0         
    //   59  137:invokespecial   #158 <Method boolean shouldAnimate()>
    //   60  140:ifeq            44
    //   61  143:aload_0         
    //   62  144:invokespecial   #292 <Method void startAnimating()>
    //   63  147:goto            44
    //   64  150:aload_0         
    //   65  151:invokespecial   #293 <Method void requestStop()>
    //   66  154:goto            44
    //   67  157:iconst_0        
    //   68  158:istore_3        
    //   69  159:goto            58
    }

    public abstract void scrollTargetBy(int i, int j);

    public AutoScrollHelper setActivationDelay(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #246 <Field int mActivationDelay>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AutoScrollHelper setEdgeType(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #209 <Field int mEdgeType>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AutoScrollHelper setEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #260 <Field boolean mEnabled>
    //    2    4:ifeq            15
    //    3    7:iload_1         
    //    4    8:ifne            15
    //    5   11:aload_0         
    //    6   12:invokespecial   #293 <Method void requestStop()>
    //    7   15:aload_0         
    //    8   16:iload_1         
    //    9   17:putfield        #260 <Field boolean mEnabled>
    //   10   20:aload_0         
    //   11   21:areturn         
    }

    public AutoScrollHelper setExclusive(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #263 <Field boolean mExclusive>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AutoScrollHelper setMaximumEdges(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field float[] mMaximumEdges>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:aload_0         
    //    6    8:getfield        #86  <Field float[] mMaximumEdges>
    //    7   11:iconst_1        
    //    8   12:fload_2         
    //    9   13:fastore         
    //   10   14:aload_0         
    //   11   15:areturn         
    }

    public AutoScrollHelper setMaximumVelocity(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field float[] mMaximumVelocity>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:ldc2            #299 <Float 1000F>
    //    5    9:fdiv            
    //    6   10:fastore         
    //    7   11:aload_0         
    //    8   12:getfield        #92  <Field float[] mMaximumVelocity>
    //    9   15:iconst_1        
    //   10   16:fload_2         
    //   11   17:ldc2            #299 <Float 1000F>
    //   12   20:fdiv            
    //   13   21:fastore         
    //   14   22:aload_0         
    //   15   23:areturn         
    }

    public AutoScrollHelper setMinimumVelocity(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field float[] mMinimumVelocity>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:ldc2            #299 <Float 1000F>
    //    5    9:fdiv            
    //    6   10:fastore         
    //    7   11:aload_0         
    //    8   12:getfield        #90  <Field float[] mMinimumVelocity>
    //    9   15:iconst_1        
    //   10   16:fload_2         
    //   11   17:ldc2            #299 <Float 1000F>
    //   12   20:fdiv            
    //   13   21:fastore         
    //   14   22:aload_0         
    //   15   23:areturn         
    }

    public AutoScrollHelper setRampDownDuration(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #302 <Method void AutoScrollHelper$ClampedScroller.setRampDownDuration(int)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public AutoScrollHelper setRampUpDuration(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #304 <Method void AutoScrollHelper$ClampedScroller.setRampUpDuration(int)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public AutoScrollHelper setRelativeEdges(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #84  <Field float[] mRelativeEdges>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:aload_0         
    //    6    8:getfield        #84  <Field float[] mRelativeEdges>
    //    7   11:iconst_1        
    //    8   12:fload_2         
    //    9   13:fastore         
    //   10   14:aload_0         
    //   11   15:areturn         
    }

    public AutoScrollHelper setRelativeVelocity(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field float[] mRelativeVelocity>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:ldc2            #299 <Float 1000F>
    //    5    9:fdiv            
    //    6   10:fastore         
    //    7   11:aload_0         
    //    8   12:getfield        #88  <Field float[] mRelativeVelocity>
    //    9   15:iconst_1        
    //   10   16:fload_2         
    //   11   17:ldc2            #299 <Float 1000F>
    //   12   20:fdiv            
    //   13   21:fastore         
    //   14   22:aload_0         
    //   15   23:areturn         
    }

    private static final int DEFAULT_ACTIVATION_DELAY = 0;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = 3.402823E+38F;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2F;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1F;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = 3.402823E+38F;
    public static final float NO_MIN = 0F;
    public static final float RELATIVE_UNSPECIFIED = 0F;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    private boolean mAnimating;
    private final Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float mMaximumEdges[];
    private float mMaximumVelocity[];
    private float mMinimumVelocity[];
    private boolean mNeedsCancel;
    private boolean mNeedsReset;
    private float mRelativeEdges[];
    private float mRelativeVelocity[];
    private Runnable mRunnable;
    private final ClampedScroller mScroller;
    private final View mTarget;

    static boolean access$100(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #145 <Field boolean mAnimating>
    //    2    4:ireturn         
    }

    static boolean access$102(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #145 <Field boolean mAnimating>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static boolean access$200(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #150 <Field boolean mNeedsReset>
    //    2    4:ireturn         
    }

    static boolean access$202(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #150 <Field boolean mNeedsReset>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static ClampedScroller access$300(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field AutoScrollHelper$ClampedScroller mScroller>
    //    2    4:areturn         
    }

    static boolean access$400(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #158 <Method boolean shouldAnimate()>
    //    2    4:ireturn         
    }

    static boolean access$500(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #161 <Field boolean mNeedsCancel>
    //    2    4:ireturn         
    }

    static boolean access$502(AutoScrollHelper autoscrollhelper, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #161 <Field boolean mNeedsCancel>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static void access$600(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #167 <Method void cancelTargetTouch()>
    //    2    4:return          
    }

    static View access$700(AutoScrollHelper autoscrollhelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field View mTarget>
    //    2    4:areturn         
    }

    static int access$800(int i, int j, int k)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #174 <Method int constrain(int, int, int)>
    //    4    6:ireturn         
    }

    static float access$900(float f, float f1, float f2)
    {
    //    0    0:fload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:invokestatic    #178 <Method float constrain(float, float, float)>
    //    4    6:freturn         
    }

    // Unreferenced inner class android/support/v4/widget/AutoScrollHelper$1

/* anonymous class */
    static class _cls1
    {
    }

}
