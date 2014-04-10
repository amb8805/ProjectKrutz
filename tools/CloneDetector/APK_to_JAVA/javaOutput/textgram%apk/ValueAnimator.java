// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.os.*;
import android.util.AndroidRuntimeException;
import android.view.animation.*;
import java.util.*;

// Referenced classes of package com.nineoldandroids.animation:
//            Animator, IntEvaluator, FloatEvaluator, PropertyValuesHolder, 
//            TypeEvaluator

public class ValueAnimator extends Animator
{
    private static class AnimationHandler extends Handler
    {

        private AnimationHandler()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Handler()>
        //    2    4:return          
        }

        AnimationHandler(AnimationHandler animationhandler)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void ValueAnimator$AnimationHandler()>
        //    2    4:return          
        }

        public void handleMessage(Message message)
        {
        //    0    0:iconst_1        
        //    1    1:istore_2        
        //    2    2:invokestatic    #18  <Method ThreadLocal ValueAnimator.access$2()>
        //    3    5:invokevirtual   #24  <Method Object ThreadLocal.get()>
        //    4    8:checkcast       #26  <Class ArrayList>
        //    5   11:astore_3        
        //    6   12:invokestatic    #29  <Method ThreadLocal ValueAnimator.access$3()>
        //    7   15:invokevirtual   #24  <Method Object ThreadLocal.get()>
        //    8   18:checkcast       #26  <Class ArrayList>
        //    9   21:astore          4
        //   10   23:aload_1         
        //   11   24:getfield        #35  <Field int Message.what>
        //   12   27:tableswitch     0 1: default 48
        //                       0 49
        //                       1 85
        //   13   48:return          
        //   14   49:invokestatic    #38  <Method ThreadLocal ValueAnimator.access$4()>
        //   15   52:invokevirtual   #24  <Method Object ThreadLocal.get()>
        //   16   55:checkcast       #26  <Class ArrayList>
        //   17   58:astore          24
        //   18   60:aload_3         
        //   19   61:invokevirtual   #42  <Method int ArrayList.size()>
        //   20   64:ifgt            75
        //   21   67:aload           4
        //   22   69:invokevirtual   #42  <Method int ArrayList.size()>
        //   23   72:ifle            77
        //   24   75:iconst_0        
        //   25   76:istore_2        
        //   26   77:aload           24
        //   27   79:invokevirtual   #42  <Method int ArrayList.size()>
        //   28   82:ifgt            238
        //   29   85:invokestatic    #48  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //   30   88:lstore          5
        //   31   90:invokestatic    #51  <Method ThreadLocal ValueAnimator.access$7()>
        //   32   93:invokevirtual   #24  <Method Object ThreadLocal.get()>
        //   33   96:checkcast       #26  <Class ArrayList>
        //   34   99:astore          7
        //   35  101:invokestatic    #54  <Method ThreadLocal ValueAnimator.access$8()>
        //   36  104:invokevirtual   #24  <Method Object ThreadLocal.get()>
        //   37  107:checkcast       #26  <Class ArrayList>
        //   38  110:astore          8
        //   39  112:aload           4
        //   40  114:invokevirtual   #42  <Method int ArrayList.size()>
        //   41  117:istore          9
        //   42  119:iconst_0        
        //   43  120:istore          10
        //   44  122:iload           10
        //   45  124:iload           9
        //   46  126:icmplt          314
        //   47  129:aload           7
        //   48  131:invokevirtual   #42  <Method int ArrayList.size()>
        //   49  134:istore          13
        //   50  136:iload           13
        //   51  138:ifle            156
        //   52  141:iconst_0        
        //   53  142:istore          21
        //   54  144:iload           21
        //   55  146:iload           13
        //   56  148:icmplt          350
        //   57  151:aload           7
        //   58  153:invokevirtual   #57  <Method void ArrayList.clear()>
        //   59  156:aload_3         
        //   60  157:invokevirtual   #42  <Method int ArrayList.size()>
        //   61  160:istore          14
        //   62  162:iconst_0        
        //   63  163:istore          15
        //   64  165:iload           15
        //   65  167:iload           14
        //   66  169:icmplt          387
        //   67  172:aload           8
        //   68  174:invokevirtual   #42  <Method int ArrayList.size()>
        //   69  177:ifle            198
        //   70  180:iconst_0        
        //   71  181:istore          20
        //   72  183:iload           20
        //   73  185:aload           8
        //   74  187:invokevirtual   #42  <Method int ArrayList.size()>
        //   75  190:icmplt          445
        //   76  193:aload           8
        //   77  195:invokevirtual   #57  <Method void ArrayList.clear()>
        //   78  198:iload_2         
        //   79  199:ifeq            48
        //   80  202:aload_3         
        //   81  203:invokevirtual   #61  <Method boolean ArrayList.isEmpty()>
        //   82  206:ifeq            217
        //   83  209:aload           4
        //   84  211:invokevirtual   #61  <Method boolean ArrayList.isEmpty()>
        //   85  214:ifne            48
        //   86  217:aload_0         
        //   87  218:iconst_1        
        //   88  219:lconst_0        
        //   89  220:invokestatic    #64  <Method long ValueAnimator.access$12()>
        //   90  223:invokestatic    #48  <Method long AnimationUtils.currentAnimationTimeMillis()>
        //   91  226:lload           5
        //   92  228:lsub            
        //   93  229:lsub            
        //   94  230:invokestatic    #70  <Method long Math.max(long, long)>
        //   95  233:invokevirtual   #74  <Method boolean sendEmptyMessageDelayed(int, long)>
        //   96  236:pop             
        //   97  237:return          
        //   98  238:aload           24
        //   99  240:invokevirtual   #77  <Method Object ArrayList.clone()>
        //  100  243:checkcast       #26  <Class ArrayList>
        //  101  246:astore          25
        //  102  248:aload           24
        //  103  250:invokevirtual   #57  <Method void ArrayList.clear()>
        //  104  253:aload           25
        //  105  255:invokevirtual   #42  <Method int ArrayList.size()>
        //  106  258:istore          26
        //  107  260:iconst_0        
        //  108  261:istore          27
        //  109  263:iload           27
        //  110  265:iload           26
        //  111  267:icmpge          77
        //  112  270:aload           25
        //  113  272:iload           27
        //  114  274:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //  115  277:checkcast       #14  <Class ValueAnimator>
        //  116  280:astore          28
        //  117  282:aload           28
        //  118  284:invokestatic    #84  <Method long ValueAnimator.access$5(ValueAnimator)>
        //  119  287:lconst_0        
        //  120  288:lcmp            
        //  121  289:ifne            303
        //  122  292:aload           28
        //  123  294:invokestatic    #88  <Method void ValueAnimator.access$6(ValueAnimator)>
        //  124  297:iinc            27  1
        //  125  300:goto            263
        //  126  303:aload           4
        //  127  305:aload           28
        //  128  307:invokevirtual   #92  <Method boolean ArrayList.add(Object)>
        //  129  310:pop             
        //  130  311:goto            297
        //  131  314:aload           4
        //  132  316:iload           10
        //  133  318:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //  134  321:checkcast       #14  <Class ValueAnimator>
        //  135  324:astore          11
        //  136  326:aload           11
        //  137  328:lload           5
        //  138  330:invokestatic    #96  <Method boolean ValueAnimator.access$9(ValueAnimator, long)>
        //  139  333:ifeq            344
        //  140  336:aload           7
        //  141  338:aload           11
        //  142  340:invokevirtual   #92  <Method boolean ArrayList.add(Object)>
        //  143  343:pop             
        //  144  344:iinc            10  1
        //  145  347:goto            122
        //  146  350:aload           7
        //  147  352:iload           21
        //  148  354:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //  149  357:checkcast       #14  <Class ValueAnimator>
        //  150  360:astore          22
        //  151  362:aload           22
        //  152  364:invokestatic    #88  <Method void ValueAnimator.access$6(ValueAnimator)>
        //  153  367:aload           22
        //  154  369:iconst_1        
        //  155  370:invokestatic    #100 <Method void ValueAnimator.access$10(ValueAnimator, boolean)>
        //  156  373:aload           4
        //  157  375:aload           22
        //  158  377:invokevirtual   #103 <Method boolean ArrayList.remove(Object)>
        //  159  380:pop             
        //  160  381:iinc            21  1
        //  161  384:goto            144
        //  162  387:aload_3         
        //  163  388:iload           15
        //  164  390:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //  165  393:checkcast       #14  <Class ValueAnimator>
        //  166  396:astore          16
        //  167  398:aload           16
        //  168  400:lload           5
        //  169  402:invokevirtual   #107 <Method boolean ValueAnimator.animationFrame(long)>
        //  170  405:ifeq            416
        //  171  408:aload           8
        //  172  410:aload           16
        //  173  412:invokevirtual   #92  <Method boolean ArrayList.add(Object)>
        //  174  415:pop             
        //  175  416:aload_3         
        //  176  417:invokevirtual   #42  <Method int ArrayList.size()>
        //  177  420:iload           14
        //  178  422:icmpne          431
        //  179  425:iinc            15  1
        //  180  428:goto            165
        //  181  431:iinc            14  -1
        //  182  434:aload           8
        //  183  436:aload           16
        //  184  438:invokevirtual   #103 <Method boolean ArrayList.remove(Object)>
        //  185  441:pop             
        //  186  442:goto            165
        //  187  445:aload           8
        //  188  447:iload           20
        //  189  449:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //  190  452:checkcast       #14  <Class ValueAnimator>
        //  191  455:invokestatic    #110 <Method void ValueAnimator.access$11(ValueAnimator)>
        //  192  458:iinc            20  1
        //  193  461:goto            183
        }
    }

    public static interface AnimatorUpdateListener
    {

        public abstract void onAnimationUpdate(ValueAnimator valueanimator);
    }


    static 
    {
    //    0    0:new             #66  <Class ThreadLocal>
    //    1    3:dup             
    //    2    4:invokespecial   #69  <Method void ThreadLocal()>
    //    3    7:putstatic       #71  <Field ThreadLocal sAnimationHandler>
    //    4   10:new             #73  <Class ValueAnimator$1>
    //    5   13:dup             
    //    6   14:invokespecial   #74  <Method void ValueAnimator$1()>
    //    7   17:putstatic       #76  <Field ThreadLocal sAnimations>
    //    8   20:new             #78  <Class ValueAnimator$2>
    //    9   23:dup             
    //   10   24:invokespecial   #79  <Method void ValueAnimator$2()>
    //   11   27:putstatic       #81  <Field ThreadLocal sPendingAnimations>
    //   12   30:new             #83  <Class ValueAnimator$3>
    //   13   33:dup             
    //   14   34:invokespecial   #84  <Method void ValueAnimator$3()>
    //   15   37:putstatic       #86  <Field ThreadLocal sDelayedAnims>
    //   16   40:new             #88  <Class ValueAnimator$4>
    //   17   43:dup             
    //   18   44:invokespecial   #89  <Method void ValueAnimator$4()>
    //   19   47:putstatic       #91  <Field ThreadLocal sEndingAnims>
    //   20   50:new             #93  <Class ValueAnimator$5>
    //   21   53:dup             
    //   22   54:invokespecial   #94  <Method void ValueAnimator$5()>
    //   23   57:putstatic       #96  <Field ThreadLocal sReadyAnims>
    //   24   60:new             #98  <Class AccelerateDecelerateInterpolator>
    //   25   63:dup             
    //   26   64:invokespecial   #99  <Method void AccelerateDecelerateInterpolator()>
    //   27   67:putstatic       #101 <Field Interpolator sDefaultInterpolator>
    //   28   70:new             #103 <Class IntEvaluator>
    //   29   73:dup             
    //   30   74:invokespecial   #104 <Method void IntEvaluator()>
    //   31   77:putstatic       #106 <Field TypeEvaluator sIntEvaluator>
    //   32   80:new             #108 <Class FloatEvaluator>
    //   33   83:dup             
    //   34   84:invokespecial   #109 <Method void FloatEvaluator()>
    //   35   87:putstatic       #111 <Field TypeEvaluator sFloatEvaluator>
    //   36   90:ldc2w           #12  <Long 10L>
    //   37   93:putstatic       #113 <Field long sFrameDelay>
    //   38   96:return          
    }

    public ValueAnimator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #114 <Method void Animator()>
    //    2    4:aload_0         
    //    3    5:ldc2w           #115 <Long -1L>
    //    4    8:putfield        #118 <Field long mSeekTime>
    //    5   11:aload_0         
    //    6   12:iconst_0        
    //    7   13:putfield        #120 <Field boolean mPlayingBackwards>
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #122 <Field int mCurrentIteration>
    //   11   21:aload_0         
    //   12   22:fconst_0        
    //   13   23:putfield        #124 <Field float mCurrentFraction>
    //   14   26:aload_0         
    //   15   27:iconst_0        
    //   16   28:putfield        #126 <Field boolean mStartedDelay>
    //   17   31:aload_0         
    //   18   32:iconst_0        
    //   19   33:putfield        #128 <Field int mPlayingState>
    //   20   36:aload_0         
    //   21   37:iconst_0        
    //   22   38:putfield        #130 <Field boolean mRunning>
    //   23   41:aload_0         
    //   24   42:iconst_0        
    //   25   43:putfield        #132 <Field boolean mStarted>
    //   26   46:aload_0         
    //   27   47:iconst_0        
    //   28   48:putfield        #134 <Field boolean mInitialized>
    //   29   51:aload_0         
    //   30   52:ldc2w           #135 <Long 300L>
    //   31   55:putfield        #138 <Field long mDuration>
    //   32   58:aload_0         
    //   33   59:lconst_0        
    //   34   60:putfield        #140 <Field long mStartDelay>
    //   35   63:aload_0         
    //   36   64:iconst_0        
    //   37   65:putfield        #142 <Field int mRepeatCount>
    //   38   68:aload_0         
    //   39   69:iconst_1        
    //   40   70:putfield        #144 <Field int mRepeatMode>
    //   41   73:aload_0         
    //   42   74:getstatic       #101 <Field Interpolator sDefaultInterpolator>
    //   43   77:putfield        #146 <Field Interpolator mInterpolator>
    //   44   80:aload_0         
    //   45   81:aconst_null     
    //   46   82:putfield        #148 <Field ArrayList mUpdateListeners>
    //   47   85:return          
    }

    static void access$10(ValueAnimator valueanimator, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #130 <Field boolean mRunning>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:putfield        #130 <Field boolean mRunning>
    //    7    5:return          
    }

    static void access$11(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #155 <Method void endAnimation()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #155 <Method void endAnimation()>
    //    5    4:return          
    }

    static long access$12()
    {
    //    0    0:getstatic       #113 <Field long sFrameDelay>
    //    1    3:lreturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #113 <Field long sFrameDelay>
    //    3    3:lreturn         
    }

    static ThreadLocal access$2()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    3    3:areturn         
    }

    static ThreadLocal access$3()
    {
    //    0    0:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //    3    3:areturn         
    }

    static ThreadLocal access$4()
    {
    //    0    0:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    3    3:areturn         
    }

    static long access$5(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #140 <Field long mStartDelay>
    //    2    4:lreturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #140 <Field long mStartDelay>
    //    5    4:lreturn         
    }

    static void access$6(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #167 <Method void startAnimation()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #167 <Method void startAnimation()>
    //    5    4:return          
    }

    static ThreadLocal access$7()
    {
    //    0    0:getstatic       #96  <Field ThreadLocal sReadyAnims>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #96  <Field ThreadLocal sReadyAnims>
    //    3    3:areturn         
    }

    static ThreadLocal access$8()
    {
    //    0    0:getstatic       #91  <Field ThreadLocal sEndingAnims>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #91  <Field ThreadLocal sEndingAnims>
    //    3    3:areturn         
    }

    static boolean access$9(ValueAnimator valueanimator, long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokespecial   #175 <Method boolean delayedAnimationFrame(long)>
    //    3    5:ireturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:lload_1         
    //    6    2:invokespecial   #175 <Method boolean delayedAnimationFrame(long)>
    //    7    5:ireturn         
    }

    public static void clearAllAnimations()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    2    6:checkcast       #182 <Class ArrayList>
    //    3    9:invokevirtual   #185 <Method void ArrayList.clear()>
    //    4   12:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    5   15:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    6   18:checkcast       #182 <Class ArrayList>
    //    7   21:invokevirtual   #185 <Method void ArrayList.clear()>
    //    8   24:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //    9   27:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //   10   30:checkcast       #182 <Class ArrayList>
    //   11   33:invokevirtual   #185 <Method void ArrayList.clear()>
    //   12   36:return          
    }

    private boolean delayedAnimationFrame(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field boolean mStartedDelay>
    //    2    4:ifne            19
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #126 <Field boolean mStartedDelay>
    //    6   12:aload_0         
    //    7   13:lload_1         
    //    8   14:putfield        #187 <Field long mDelayStartTime>
    //    9   17:iconst_0        
    //   10   18:ireturn         
    //   11   19:lload_1         
    //   12   20:aload_0         
    //   13   21:getfield        #187 <Field long mDelayStartTime>
    //   14   24:lsub            
    //   15   25:lstore_3        
    //   16   26:lload_3         
    //   17   27:aload_0         
    //   18   28:getfield        #140 <Field long mStartDelay>
    //   19   31:lcmp            
    //   20   32:ifle            17
    //   21   35:aload_0         
    //   22   36:lload_1         
    //   23   37:lload_3         
    //   24   38:aload_0         
    //   25   39:getfield        #140 <Field long mStartDelay>
    //   26   42:lsub            
    //   27   43:lsub            
    //   28   44:putfield        #189 <Field long mStartTime>
    //   29   47:aload_0         
    //   30   48:iconst_1        
    //   31   49:putfield        #128 <Field int mPlayingState>
    //   32   52:iconst_1        
    //   33   53:ireturn         
    }

    private void endAnimation()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    2    6:checkcast       #182 <Class ArrayList>
    //    3    9:aload_0         
    //    4   10:invokevirtual   #193 <Method boolean ArrayList.remove(Object)>
    //    5   13:pop             
    //    6   14:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    7   17:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    8   20:checkcast       #182 <Class ArrayList>
    //    9   23:aload_0         
    //   10   24:invokevirtual   #193 <Method boolean ArrayList.remove(Object)>
    //   11   27:pop             
    //   12   28:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //   13   31:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //   14   34:checkcast       #182 <Class ArrayList>
    //   15   37:aload_0         
    //   16   38:invokevirtual   #193 <Method boolean ArrayList.remove(Object)>
    //   17   41:pop             
    //   18   42:aload_0         
    //   19   43:iconst_0        
    //   20   44:putfield        #128 <Field int mPlayingState>
    //   21   47:aload_0         
    //   22   48:getfield        #130 <Field boolean mRunning>
    //   23   51:ifeq            90
    //   24   54:aload_0         
    //   25   55:getfield        #196 <Field ArrayList mListeners>
    //   26   58:ifnull          90
    //   27   61:aload_0         
    //   28   62:getfield        #196 <Field ArrayList mListeners>
    //   29   65:invokevirtual   #199 <Method Object ArrayList.clone()>
    //   30   68:checkcast       #182 <Class ArrayList>
    //   31   71:astore          4
    //   32   73:aload           4
    //   33   75:invokevirtual   #203 <Method int ArrayList.size()>
    //   34   78:istore          5
    //   35   80:iconst_0        
    //   36   81:istore          6
    //   37   83:iload           6
    //   38   85:iload           5
    //   39   87:icmplt          101
    //   40   90:aload_0         
    //   41   91:iconst_0        
    //   42   92:putfield        #130 <Field boolean mRunning>
    //   43   95:aload_0         
    //   44   96:iconst_0        
    //   45   97:putfield        #132 <Field boolean mStarted>
    //   46  100:return          
    //   47  101:aload           4
    //   48  103:iload           6
    //   49  105:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //   50  108:checkcast       #208 <Class Animator$AnimatorListener>
    //   51  111:aload_0         
    //   52  112:invokeinterface #212 <Method void Animator$AnimatorListener.onAnimationEnd(Animator)>
    //   53  117:iinc            6  1
    //   54  120:goto            83
    }

    public static int getCurrentAnimationsCount()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    2    6:checkcast       #182 <Class ArrayList>
    //    3    9:invokevirtual   #203 <Method int ArrayList.size()>
    //    4   12:ireturn         
    }

    public static long getFrameDelay()
    {
    //    0    0:getstatic       #113 <Field long sFrameDelay>
    //    1    3:lreturn         
    }

    public static transient ValueAnimator ofFloat(float af[])
    {
    //    0    0:new             #2   <Class ValueAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #217 <Method void ValueAnimator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:invokevirtual   #221 <Method void setFloatValues(float[])>
    //    7   13:aload_1         
    //    8   14:areturn         
    }

    public static transient ValueAnimator ofInt(int ai[])
    {
    //    0    0:new             #2   <Class ValueAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #217 <Method void ValueAnimator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:invokevirtual   #227 <Method void setIntValues(int[])>
    //    7   13:aload_1         
    //    8   14:areturn         
    }

    public static transient ValueAnimator ofObject(TypeEvaluator typeevaluator, Object aobj[])
    {
    //    0    0:new             #2   <Class ValueAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #217 <Method void ValueAnimator()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:aload_1         
    //    6   10:invokevirtual   #233 <Method void setObjectValues(Object[])>
    //    7   13:aload_2         
    //    8   14:aload_0         
    //    9   15:invokevirtual   #237 <Method void setEvaluator(TypeEvaluator)>
    //   10   18:aload_2         
    //   11   19:areturn         
    }

    public static transient ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder apropertyvaluesholder[])
    {
    //    0    0:new             #2   <Class ValueAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #217 <Method void ValueAnimator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:invokevirtual   #243 <Method void setValues(PropertyValuesHolder[])>
    //    7   13:aload_1         
    //    8   14:areturn         
    }

    public static void setFrameDelay(long l)
    {
    //    0    0:lload_0         
    //    1    1:putstatic       #113 <Field long sFrameDelay>
    //    2    4:return          
    }

    private void start(boolean flag)
    {
    //    0    0:invokestatic    #253 <Method Looper Looper.myLooper()>
    //    1    3:ifnonnull       17
    //    2    6:new             #255 <Class AndroidRuntimeException>
    //    3    9:dup             
    //    4   10:ldc2            #257 <String "Animators may only be run on Looper threads">
    //    5   13:invokespecial   #260 <Method void AndroidRuntimeException(String)>
    //    6   16:athrow          
    //    7   17:aload_0         
    //    8   18:iload_1         
    //    9   19:putfield        #120 <Field boolean mPlayingBackwards>
    //   10   22:aload_0         
    //   11   23:iconst_0        
    //   12   24:putfield        #122 <Field int mCurrentIteration>
    //   13   27:aload_0         
    //   14   28:iconst_0        
    //   15   29:putfield        #128 <Field int mPlayingState>
    //   16   32:aload_0         
    //   17   33:iconst_1        
    //   18   34:putfield        #132 <Field boolean mStarted>
    //   19   37:aload_0         
    //   20   38:iconst_0        
    //   21   39:putfield        #126 <Field boolean mStartedDelay>
    //   22   42:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //   23   45:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //   24   48:checkcast       #182 <Class ArrayList>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #263 <Method boolean ArrayList.add(Object)>
    //   27   55:pop             
    //   28   56:aload_0         
    //   29   57:getfield        #140 <Field long mStartDelay>
    //   30   60:lconst_0        
    //   31   61:lcmp            
    //   32   62:ifne            119
    //   33   65:aload_0         
    //   34   66:aload_0         
    //   35   67:invokevirtual   #266 <Method long getCurrentPlayTime()>
    //   36   70:invokevirtual   #269 <Method void setCurrentPlayTime(long)>
    //   37   73:aload_0         
    //   38   74:iconst_0        
    //   39   75:putfield        #128 <Field int mPlayingState>
    //   40   78:aload_0         
    //   41   79:iconst_1        
    //   42   80:putfield        #130 <Field boolean mRunning>
    //   43   83:aload_0         
    //   44   84:getfield        #196 <Field ArrayList mListeners>
    //   45   87:ifnull          119
    //   46   90:aload_0         
    //   47   91:getfield        #196 <Field ArrayList mListeners>
    //   48   94:invokevirtual   #199 <Method Object ArrayList.clone()>
    //   49   97:checkcast       #182 <Class ArrayList>
    //   50  100:astore          5
    //   51  102:aload           5
    //   52  104:invokevirtual   #203 <Method int ArrayList.size()>
    //   53  107:istore          6
    //   54  109:iconst_0        
    //   55  110:istore          7
    //   56  112:iload           7
    //   57  114:iload           6
    //   58  116:icmplt          156
    //   59  119:getstatic       #71  <Field ThreadLocal sAnimationHandler>
    //   60  122:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //   61  125:checkcast       #271 <Class ValueAnimator$AnimationHandler>
    //   62  128:astore_3        
    //   63  129:aload_3         
    //   64  130:ifnonnull       149
    //   65  133:new             #271 <Class ValueAnimator$AnimationHandler>
    //   66  136:dup             
    //   67  137:aconst_null     
    //   68  138:invokespecial   #274 <Method void ValueAnimator$AnimationHandler(ValueAnimator$AnimationHandler)>
    //   69  141:astore_3        
    //   70  142:getstatic       #71  <Field ThreadLocal sAnimationHandler>
    //   71  145:aload_3         
    //   72  146:invokevirtual   #278 <Method void ThreadLocal.set(Object)>
    //   73  149:aload_3         
    //   74  150:iconst_0        
    //   75  151:invokevirtual   #282 <Method boolean ValueAnimator$AnimationHandler.sendEmptyMessage(int)>
    //   76  154:pop             
    //   77  155:return          
    //   78  156:aload           5
    //   79  158:iload           7
    //   80  160:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //   81  163:checkcast       #208 <Class Animator$AnimatorListener>
    //   82  166:aload_0         
    //   83  167:invokeinterface #285 <Method void Animator$AnimatorListener.onAnimationStart(Animator)>
    //   84  172:iinc            7  1
    //   85  175:goto            112
    }

    private void startAnimation()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #288 <Method void initAnimation()>
    //    2    4:getstatic       #76  <Field ThreadLocal sAnimations>
    //    3    7:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    4   10:checkcast       #182 <Class ArrayList>
    //    5   13:aload_0         
    //    6   14:invokevirtual   #263 <Method boolean ArrayList.add(Object)>
    //    7   17:pop             
    //    8   18:aload_0         
    //    9   19:getfield        #140 <Field long mStartDelay>
    //   10   22:lconst_0        
    //   11   23:lcmp            
    //   12   24:ifle            59
    //   13   27:aload_0         
    //   14   28:getfield        #196 <Field ArrayList mListeners>
    //   15   31:ifnull          59
    //   16   34:aload_0         
    //   17   35:getfield        #196 <Field ArrayList mListeners>
    //   18   38:invokevirtual   #199 <Method Object ArrayList.clone()>
    //   19   41:checkcast       #182 <Class ArrayList>
    //   20   44:astore_2        
    //   21   45:aload_2         
    //   22   46:invokevirtual   #203 <Method int ArrayList.size()>
    //   23   49:istore_3        
    //   24   50:iconst_0        
    //   25   51:istore          4
    //   26   53:iload           4
    //   27   55:iload_3         
    //   28   56:icmplt          60
    //   29   59:return          
    //   30   60:aload_2         
    //   31   61:iload           4
    //   32   63:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //   33   66:checkcast       #208 <Class Animator$AnimatorListener>
    //   34   69:aload_0         
    //   35   70:invokeinterface #285 <Method void Animator$AnimatorListener.onAnimationStart(Animator)>
    //   36   75:iinc            4  1
    //   37   78:goto            53
    }

    public void addUpdateListener(AnimatorUpdateListener animatorupdatelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #148 <Field ArrayList mUpdateListeners>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #182 <Class ArrayList>
    //    5   11:dup             
    //    6   12:invokespecial   #291 <Method void ArrayList()>
    //    7   15:putfield        #148 <Field ArrayList mUpdateListeners>
    //    8   18:aload_0         
    //    9   19:getfield        #148 <Field ArrayList mUpdateListeners>
    //   10   22:aload_1         
    //   11   23:invokevirtual   #263 <Method boolean ArrayList.add(Object)>
    //   12   26:pop             
    //   13   27:return          
    }

    void animateValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field Interpolator mInterpolator>
    //    2    4:fload_1         
    //    3    5:invokeinterface #299 <Method float Interpolator.getInterpolation(float)>
    //    4   10:fstore_2        
    //    5   11:aload_0         
    //    6   12:fload_2         
    //    7   13:putfield        #124 <Field float mCurrentFraction>
    //    8   16:aload_0         
    //    9   17:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   10   20:arraylength     
    //   11   21:istore_3        
    //   12   22:iconst_0        
    //   13   23:istore          4
    //   14   25:iload           4
    //   15   27:iload_3         
    //   16   28:icmplt          58
    //   17   31:aload_0         
    //   18   32:getfield        #148 <Field ArrayList mUpdateListeners>
    //   19   35:ifnull          57
    //   20   38:aload_0         
    //   21   39:getfield        #148 <Field ArrayList mUpdateListeners>
    //   22   42:invokevirtual   #203 <Method int ArrayList.size()>
    //   23   45:istore          5
    //   24   47:iconst_0        
    //   25   48:istore          6
    //   26   50:iload           6
    //   27   52:iload           5
    //   28   54:icmplt          75
    //   29   57:return          
    //   30   58:aload_0         
    //   31   59:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   32   62:iload           4
    //   33   64:aaload          
    //   34   65:fload_2         
    //   35   66:invokevirtual   #306 <Method void PropertyValuesHolder.calculateValue(float)>
    //   36   69:iinc            4  1
    //   37   72:goto            25
    //   38   75:aload_0         
    //   39   76:getfield        #148 <Field ArrayList mUpdateListeners>
    //   40   79:iload           6
    //   41   81:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //   42   84:checkcast       #308 <Class ValueAnimator$AnimatorUpdateListener>
    //   43   87:aload_0         
    //   44   88:invokeinterface #311 <Method void ValueAnimator$AnimatorUpdateListener.onAnimationUpdate(ValueAnimator)>
    //   45   93:iinc            6  1
    //   46   96:goto            50
    }

    boolean animationFrame(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #128 <Field int mPlayingState>
    //    2    4:ifne            26
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #128 <Field int mPlayingState>
    //    6   12:aload_0         
    //    7   13:getfield        #118 <Field long mSeekTime>
    //    8   16:lconst_0        
    //    9   17:lcmp            
    //   10   18:ifge            54
    //   11   21:aload_0         
    //   12   22:lload_1         
    //   13   23:putfield        #189 <Field long mStartTime>
    //   14   26:aload_0         
    //   15   27:getfield        #128 <Field int mPlayingState>
    //   16   30:tableswitch     1 2: default 52
    //                   1 74
    //                   2 74
    //   17   52:iconst_0        
    //   18   53:ireturn         
    //   19   54:aload_0         
    //   20   55:lload_1         
    //   21   56:aload_0         
    //   22   57:getfield        #118 <Field long mSeekTime>
    //   23   60:lsub            
    //   24   61:putfield        #189 <Field long mStartTime>
    //   25   64:aload_0         
    //   26   65:ldc2w           #115 <Long -1L>
    //   27   68:putfield        #118 <Field long mSeekTime>
    //   28   71:goto            26
    //   29   74:aload_0         
    //   30   75:getfield        #138 <Field long mDuration>
    //   31   78:lconst_0        
    //   32   79:lcmp            
    //   33   80:ifle            226
    //   34   83:lload_1         
    //   35   84:aload_0         
    //   36   85:getfield        #189 <Field long mStartTime>
    //   37   88:lsub            
    //   38   89:l2f             
    //   39   90:aload_0         
    //   40   91:getfield        #138 <Field long mDuration>
    //   41   94:l2f             
    //   42   95:fdiv            
    //   43   96:fstore_3        
    //   44   97:fload_3         
    //   45   98:fconst_1        
    //   46   99:fcmpl           
    //   47  100:istore          4
    //   48  102:iconst_0        
    //   49  103:istore          5
    //   50  105:iload           4
    //   51  107:iflt            207
    //   52  110:aload_0         
    //   53  111:getfield        #122 <Field int mCurrentIteration>
    //   54  114:aload_0         
    //   55  115:getfield        #142 <Field int mRepeatCount>
    //   56  118:icmplt          129
    //   57  121:aload_0         
    //   58  122:getfield        #142 <Field int mRepeatCount>
    //   59  125:iconst_m1       
    //   60  126:icmpne          261
    //   61  129:aload_0         
    //   62  130:getfield        #196 <Field ArrayList mListeners>
    //   63  133:ifnull          155
    //   64  136:aload_0         
    //   65  137:getfield        #196 <Field ArrayList mListeners>
    //   66  140:invokevirtual   #203 <Method int ArrayList.size()>
    //   67  143:istore          7
    //   68  145:iconst_0        
    //   69  146:istore          8
    //   70  148:iload           8
    //   71  150:iload           7
    //   72  152:icmplt          231
    //   73  155:aload_0         
    //   74  156:getfield        #144 <Field int mRepeatMode>
    //   75  159:iconst_2        
    //   76  160:icmpne          179
    //   77  163:aload_0         
    //   78  164:getfield        #120 <Field boolean mPlayingBackwards>
    //   79  167:ifeq            255
    //   80  170:iconst_0        
    //   81  171:istore          6
    //   82  173:aload_0         
    //   83  174:iload           6
    //   84  176:putfield        #120 <Field boolean mPlayingBackwards>
    //   85  179:aload_0         
    //   86  180:aload_0         
    //   87  181:getfield        #122 <Field int mCurrentIteration>
    //   88  184:fload_3         
    //   89  185:f2i             
    //   90  186:iadd            
    //   91  187:putfield        #122 <Field int mCurrentIteration>
    //   92  190:fload_3         
    //   93  191:fconst_1        
    //   94  192:frem            
    //   95  193:fstore_3        
    //   96  194:aload_0         
    //   97  195:aload_0         
    //   98  196:getfield        #189 <Field long mStartTime>
    //   99  199:aload_0         
    //  100  200:getfield        #138 <Field long mDuration>
    //  101  203:ladd            
    //  102  204:putfield        #189 <Field long mStartTime>
    //  103  207:aload_0         
    //  104  208:getfield        #120 <Field boolean mPlayingBackwards>
    //  105  211:ifeq            218
    //  106  214:fconst_1        
    //  107  215:fload_3         
    //  108  216:fsub            
    //  109  217:fstore_3        
    //  110  218:aload_0         
    //  111  219:fload_3         
    //  112  220:invokevirtual   #314 <Method void animateValue(float)>
    //  113  223:iload           5
    //  114  225:ireturn         
    //  115  226:fconst_1        
    //  116  227:fstore_3        
    //  117  228:goto            97
    //  118  231:aload_0         
    //  119  232:getfield        #196 <Field ArrayList mListeners>
    //  120  235:iload           8
    //  121  237:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //  122  240:checkcast       #208 <Class Animator$AnimatorListener>
    //  123  243:aload_0         
    //  124  244:invokeinterface #317 <Method void Animator$AnimatorListener.onAnimationRepeat(Animator)>
    //  125  249:iinc            8  1
    //  126  252:goto            148
    //  127  255:iconst_1        
    //  128  256:istore          6
    //  129  258:goto            173
    //  130  261:iconst_1        
    //  131  262:istore          5
    //  132  264:fload_3         
    //  133  265:fconst_1        
    //  134  266:invokestatic    #323 <Method float Math.min(float, float)>
    //  135  269:fstore_3        
    //  136  270:goto            207
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #128 <Field int mPlayingState>
    //    2    4:ifne            39
    //    3    7:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    4   10:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    5   13:checkcast       #182 <Class ArrayList>
    //    6   16:aload_0         
    //    7   17:invokevirtual   #327 <Method boolean ArrayList.contains(Object)>
    //    8   20:ifne            39
    //    9   23:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //   10   26:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //   11   29:checkcast       #182 <Class ArrayList>
    //   12   32:aload_0         
    //   13   33:invokevirtual   #327 <Method boolean ArrayList.contains(Object)>
    //   14   36:ifeq            80
    //   15   39:aload_0         
    //   16   40:getfield        #130 <Field boolean mRunning>
    //   17   43:ifeq            76
    //   18   46:aload_0         
    //   19   47:getfield        #196 <Field ArrayList mListeners>
    //   20   50:ifnull          76
    //   21   53:aload_0         
    //   22   54:getfield        #196 <Field ArrayList mListeners>
    //   23   57:invokevirtual   #199 <Method Object ArrayList.clone()>
    //   24   60:checkcast       #182 <Class ArrayList>
    //   25   63:invokevirtual   #331 <Method Iterator ArrayList.iterator()>
    //   26   66:astore_1        
    //   27   67:aload_1         
    //   28   68:invokeinterface #337 <Method boolean Iterator.hasNext()>
    //   29   73:ifne            81
    //   30   76:aload_0         
    //   31   77:invokespecial   #155 <Method void endAnimation()>
    //   32   80:return          
    //   33   81:aload_1         
    //   34   82:invokeinterface #340 <Method Object Iterator.next()>
    //   35   87:checkcast       #208 <Class Animator$AnimatorListener>
    //   36   90:aload_0         
    //   37   91:invokeinterface #343 <Method void Animator$AnimatorListener.onAnimationCancel(Animator)>
    //   38   96:goto            67
    }

    public volatile Animator clone()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #347 <Method ValueAnimator clone()>
    //    2    4:areturn         
    }

    public ValueAnimator clone()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #349 <Method Animator Animator.clone()>
    //    2    4:checkcast       #2   <Class ValueAnimator>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:getfield        #148 <Field ArrayList mUpdateListeners>
    //    6   12:ifnull          49
    //    7   15:aload_0         
    //    8   16:getfield        #148 <Field ArrayList mUpdateListeners>
    //    9   19:astore          7
    //   10   21:aload_1         
    //   11   22:new             #182 <Class ArrayList>
    //   12   25:dup             
    //   13   26:invokespecial   #291 <Method void ArrayList()>
    //   14   29:putfield        #148 <Field ArrayList mUpdateListeners>
    //   15   32:aload           7
    //   16   34:invokevirtual   #203 <Method int ArrayList.size()>
    //   17   37:istore          8
    //   18   39:iconst_0        
    //   19   40:istore          9
    //   20   42:iload           9
    //   21   44:iload           8
    //   22   46:icmplt          124
    //   23   49:aload_1         
    //   24   50:ldc2w           #115 <Long -1L>
    //   25   53:putfield        #118 <Field long mSeekTime>
    //   26   56:aload_1         
    //   27   57:iconst_0        
    //   28   58:putfield        #120 <Field boolean mPlayingBackwards>
    //   29   61:aload_1         
    //   30   62:iconst_0        
    //   31   63:putfield        #122 <Field int mCurrentIteration>
    //   32   66:aload_1         
    //   33   67:iconst_0        
    //   34   68:putfield        #134 <Field boolean mInitialized>
    //   35   71:aload_1         
    //   36   72:iconst_0        
    //   37   73:putfield        #128 <Field int mPlayingState>
    //   38   76:aload_1         
    //   39   77:iconst_0        
    //   40   78:putfield        #126 <Field boolean mStartedDelay>
    //   41   81:aload_0         
    //   42   82:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   43   85:astore_2        
    //   44   86:aload_2         
    //   45   87:ifnull          122
    //   46   90:aload_2         
    //   47   91:arraylength     
    //   48   92:istore_3        
    //   49   93:aload_1         
    //   50   94:iload_3         
    //   51   95:anewarray       PropertyValuesHolder[]
    //   52   98:putfield        #301 <Field PropertyValuesHolder[] mValues>
    //   53  101:aload_1         
    //   54  102:new             #351 <Class HashMap>
    //   55  105:dup             
    //   56  106:iload_3         
    //   57  107:invokespecial   #354 <Method void HashMap(int)>
    //   58  110:putfield        #356 <Field HashMap mValuesMap>
    //   59  113:iconst_0        
    //   60  114:istore          4
    //   61  116:iload           4
    //   62  118:iload_3         
    //   63  119:icmplt          148
    //   64  122:aload_1         
    //   65  123:areturn         
    //   66  124:aload_1         
    //   67  125:getfield        #148 <Field ArrayList mUpdateListeners>
    //   68  128:aload           7
    //   69  130:iload           9
    //   70  132:invokevirtual   #206 <Method Object ArrayList.get(int)>
    //   71  135:checkcast       #308 <Class ValueAnimator$AnimatorUpdateListener>
    //   72  138:invokevirtual   #263 <Method boolean ArrayList.add(Object)>
    //   73  141:pop             
    //   74  142:iinc            9  1
    //   75  145:goto            42
    //   76  148:aload_2         
    //   77  149:iload           4
    //   78  151:aaload          
    //   79  152:invokevirtual   #359 <Method PropertyValuesHolder PropertyValuesHolder.clone()>
    //   80  155:astore          5
    //   81  157:aload_1         
    //   82  158:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   83  161:iload           4
    //   84  163:aload           5
    //   85  165:aastore         
    //   86  166:aload_1         
    //   87  167:getfield        #356 <Field HashMap mValuesMap>
    //   88  170:aload           5
    //   89  172:invokevirtual   #363 <Method String PropertyValuesHolder.getPropertyName()>
    //   90  175:aload           5
    //   91  177:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
    //   92  180:pop             
    //   93  181:iinc            4  1
    //   94  184:goto            116
    }

    public void end()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    2    6:checkcast       #182 <Class ArrayList>
    //    3    9:aload_0         
    //    4   10:invokevirtual   #327 <Method boolean ArrayList.contains(Object)>
    //    5   13:ifne            68
    //    6   16:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    7   19:invokevirtual   #180 <Method Object ThreadLocal.get()>
    //    8   22:checkcast       #182 <Class ArrayList>
    //    9   25:aload_0         
    //   10   26:invokevirtual   #327 <Method boolean ArrayList.contains(Object)>
    //   11   29:ifne            68
    //   12   32:aload_0         
    //   13   33:iconst_0        
    //   14   34:putfield        #126 <Field boolean mStartedDelay>
    //   15   37:aload_0         
    //   16   38:invokespecial   #167 <Method void startAnimation()>
    //   17   41:aload_0         
    //   18   42:getfield        #142 <Field int mRepeatCount>
    //   19   45:ifle            82
    //   20   48:iconst_1        
    //   21   49:aload_0         
    //   22   50:getfield        #142 <Field int mRepeatCount>
    //   23   53:iand            
    //   24   54:iconst_1        
    //   25   55:icmpne          82
    //   26   58:aload_0         
    //   27   59:fconst_0        
    //   28   60:invokevirtual   #314 <Method void animateValue(float)>
    //   29   63:aload_0         
    //   30   64:invokespecial   #155 <Method void endAnimation()>
    //   31   67:return          
    //   32   68:aload_0         
    //   33   69:getfield        #134 <Field boolean mInitialized>
    //   34   72:ifne            41
    //   35   75:aload_0         
    //   36   76:invokevirtual   #288 <Method void initAnimation()>
    //   37   79:goto            41
    //   38   82:aload_0         
    //   39   83:fconst_1        
    //   40   84:invokevirtual   #314 <Method void animateValue(float)>
    //   41   87:goto            63
    }

    public float getAnimatedFraction()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field float mCurrentFraction>
    //    2    4:freturn         
    }

    public Object getAnimatedValue()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          25
    //    3    7:aload_0         
    //    4    8:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    5   11:arraylength     
    //    6   12:ifle            25
    //    7   15:aload_0         
    //    8   16:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    9   19:iconst_0        
    //   10   20:aaload          
    //   11   21:invokevirtual   #373 <Method Object PropertyValuesHolder.getAnimatedValue()>
    //   12   24:areturn         
    //   13   25:aconst_null     
    //   14   26:areturn         
    }

    public Object getAnimatedValue(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #356 <Field HashMap mValuesMap>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #377 <Method Object HashMap.get(Object)>
    //    4    8:checkcast       #303 <Class PropertyValuesHolder>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:ifnull          21
    //    8   16:aload_2         
    //    9   17:invokevirtual   #373 <Method Object PropertyValuesHolder.getAnimatedValue()>
    //   10   20:areturn         
    //   11   21:aconst_null     
    //   12   22:areturn         
    }

    public long getCurrentPlayTime()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field boolean mInitialized>
    //    2    4:ifeq            14
    //    3    7:aload_0         
    //    4    8:getfield        #128 <Field int mPlayingState>
    //    5   11:ifne            16
    //    6   14:lconst_0        
    //    7   15:lreturn         
    //    8   16:invokestatic    #382 <Method long AnimationUtils.currentAnimationTimeMillis()>
    //    9   19:aload_0         
    //   10   20:getfield        #189 <Field long mStartTime>
    //   11   23:lsub            
    //   12   24:lreturn         
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field long mDuration>
    //    2    4:lreturn         
    }

    public Interpolator getInterpolator()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field Interpolator mInterpolator>
    //    2    4:areturn         
    }

    public int getRepeatCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #142 <Field int mRepeatCount>
    //    2    4:ireturn         
    }

    public int getRepeatMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #144 <Field int mRepeatMode>
    //    2    4:ireturn         
    }

    public long getStartDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #140 <Field long mStartDelay>
    //    2    4:lreturn         
    }

    public PropertyValuesHolder[] getValues()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    2    4:areturn         
    }

    void initAnimation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field boolean mInitialized>
    //    2    4:ifne            25
    //    3    7:aload_0         
    //    4    8:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    5   11:arraylength     
    //    6   12:istore_1        
    //    7   13:iconst_0        
    //    8   14:istore_2        
    //    9   15:iload_2         
    //   10   16:iload_1         
    //   11   17:icmplt          26
    //   12   20:aload_0         
    //   13   21:iconst_1        
    //   14   22:putfield        #134 <Field boolean mInitialized>
    //   15   25:return          
    //   16   26:aload_0         
    //   17   27:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   18   30:iload_2         
    //   19   31:aaload          
    //   20   32:invokevirtual   #393 <Method void PropertyValuesHolder.init()>
    //   21   35:iinc            2  1
    //   22   38:goto            15
    }

    public boolean isRunning()
    {
    //    0    0:iconst_1        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #128 <Field int mPlayingState>
    //    4    6:iload_1         
    //    5    7:icmpeq          19
    //    6   10:aload_0         
    //    7   11:getfield        #130 <Field boolean mRunning>
    //    8   14:ifne            19
    //    9   17:iconst_0        
    //   10   18:istore_1        
    //   11   19:iload_1         
    //   12   20:ireturn         
    }

    public boolean isStarted()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #132 <Field boolean mStarted>
    //    2    4:ireturn         
    }

    public void removeAllUpdateListeners()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #148 <Field ArrayList mUpdateListeners>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #148 <Field ArrayList mUpdateListeners>
    //    6   12:invokevirtual   #185 <Method void ArrayList.clear()>
    //    7   15:aload_0         
    //    8   16:aconst_null     
    //    9   17:putfield        #148 <Field ArrayList mUpdateListeners>
    //   10   20:return          
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorupdatelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #148 <Field ArrayList mUpdateListeners>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #148 <Field ArrayList mUpdateListeners>
    //    6   12:aload_1         
    //    7   13:invokevirtual   #193 <Method boolean ArrayList.remove(Object)>
    //    8   16:pop             
    //    9   17:aload_0         
    //   10   18:getfield        #148 <Field ArrayList mUpdateListeners>
    //   11   21:invokevirtual   #203 <Method int ArrayList.size()>
    //   12   24:ifne            7
    //   13   27:aload_0         
    //   14   28:aconst_null     
    //   15   29:putfield        #148 <Field ArrayList mUpdateListeners>
    //   16   32:return          
    }

    public void reverse()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #120 <Field boolean mPlayingBackwards>
    //    2    4:ifeq            48
    //    3    7:iconst_0        
    //    4    8:istore_1        
    //    5    9:aload_0         
    //    6   10:iload_1         
    //    7   11:putfield        #120 <Field boolean mPlayingBackwards>
    //    8   14:aload_0         
    //    9   15:getfield        #128 <Field int mPlayingState>
    //   10   18:iconst_1        
    //   11   19:icmpne          53
    //   12   22:invokestatic    #382 <Method long AnimationUtils.currentAnimationTimeMillis()>
    //   13   25:lstore_2        
    //   14   26:lload_2         
    //   15   27:aload_0         
    //   16   28:getfield        #189 <Field long mStartTime>
    //   17   31:lsub            
    //   18   32:lstore          4
    //   19   34:aload_0         
    //   20   35:lload_2         
    //   21   36:aload_0         
    //   22   37:getfield        #138 <Field long mDuration>
    //   23   40:lload           4
    //   24   42:lsub            
    //   25   43:lsub            
    //   26   44:putfield        #189 <Field long mStartTime>
    //   27   47:return          
    //   28   48:iconst_1        
    //   29   49:istore_1        
    //   30   50:goto            9
    //   31   53:aload_0         
    //   32   54:iconst_1        
    //   33   55:invokespecial   #400 <Method void start(boolean)>
    //   34   58:return          
    }

    public void setCurrentPlayTime(long l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #288 <Method void initAnimation()>
    //    2    4:invokestatic    #382 <Method long AnimationUtils.currentAnimationTimeMillis()>
    //    3    7:lstore_3        
    //    4    8:aload_0         
    //    5    9:getfield        #128 <Field int mPlayingState>
    //    6   12:iconst_1        
    //    7   13:icmpeq          26
    //    8   16:aload_0         
    //    9   17:lload_1         
    //   10   18:putfield        #118 <Field long mSeekTime>
    //   11   21:aload_0         
    //   12   22:iconst_2        
    //   13   23:putfield        #128 <Field int mPlayingState>
    //   14   26:aload_0         
    //   15   27:lload_3         
    //   16   28:lload_1         
    //   17   29:lsub            
    //   18   30:putfield        #189 <Field long mStartTime>
    //   19   33:aload_0         
    //   20   34:lload_3         
    //   21   35:invokevirtual   #402 <Method boolean animationFrame(long)>
    //   22   38:pop             
    //   23   39:return          
    }

    public volatile Animator setDuration(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokevirtual   #407 <Method ValueAnimator setDuration(long)>
    //    3    5:areturn         
    }

    public ValueAnimator setDuration(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            31
    //    4    6:new             #409 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:new             #411 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:ldc2            #413 <String "Animators cannot have negative duration: ">
    //    9   17:invokespecial   #414 <Method void StringBuilder(String)>
    //   10   20:lload_1         
    //   11   21:invokevirtual   #418 <Method StringBuilder StringBuilder.append(long)>
    //   12   24:invokevirtual   #421 <Method String StringBuilder.toString()>
    //   13   27:invokespecial   #422 <Method void IllegalArgumentException(String)>
    //   14   30:athrow          
    //   15   31:aload_0         
    //   16   32:lload_1         
    //   17   33:putfield        #138 <Field long mDuration>
    //   18   36:aload_0         
    //   19   37:areturn         
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          29
    //    2    4:aload_0         
    //    3    5:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    4    8:ifnull          29
    //    5   11:aload_0         
    //    6   12:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    7   15:arraylength     
    //    8   16:ifle            29
    //    9   19:aload_0         
    //   10   20:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   11   23:iconst_0        
    //   12   24:aaload          
    //   13   25:aload_1         
    //   14   26:invokevirtual   #423 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
    //   15   29:return          
    }

    public transient void setFloatValues(float af[])
    {
    //    0    0:aload_1         
    //    1    1:ifnull          9
    //    2    4:aload_1         
    //    3    5:arraylength     
    //    4    6:ifne            10
    //    5    9:return          
    //    6   10:aload_0         
    //    7   11:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    8   14:ifnull          25
    //    9   17:aload_0         
    //   10   18:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   11   21:arraylength     
    //   12   22:ifne            51
    //   13   25:iconst_1        
    //   14   26:anewarray       PropertyValuesHolder[]
    //   15   29:astore_2        
    //   16   30:aload_2         
    //   17   31:iconst_0        
    //   18   32:ldc2            #425 <String "">
    //   19   35:aload_1         
    //   20   36:invokestatic    #428 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
    //   21   39:aastore         
    //   22   40:aload_0         
    //   23   41:aload_2         
    //   24   42:invokevirtual   #243 <Method void setValues(PropertyValuesHolder[])>
    //   25   45:aload_0         
    //   26   46:iconst_0        
    //   27   47:putfield        #134 <Field boolean mInitialized>
    //   28   50:return          
    //   29   51:aload_0         
    //   30   52:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   31   55:iconst_0        
    //   32   56:aaload          
    //   33   57:aload_1         
    //   34   58:invokevirtual   #429 <Method void PropertyValuesHolder.setFloatValues(float[])>
    //   35   61:goto            45
    }

    public transient void setIntValues(int ai[])
    {
    //    0    0:aload_1         
    //    1    1:ifnull          9
    //    2    4:aload_1         
    //    3    5:arraylength     
    //    4    6:ifne            10
    //    5    9:return          
    //    6   10:aload_0         
    //    7   11:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    8   14:ifnull          25
    //    9   17:aload_0         
    //   10   18:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   11   21:arraylength     
    //   12   22:ifne            51
    //   13   25:iconst_1        
    //   14   26:anewarray       PropertyValuesHolder[]
    //   15   29:astore_2        
    //   16   30:aload_2         
    //   17   31:iconst_0        
    //   18   32:ldc2            #425 <String "">
    //   19   35:aload_1         
    //   20   36:invokestatic    #432 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
    //   21   39:aastore         
    //   22   40:aload_0         
    //   23   41:aload_2         
    //   24   42:invokevirtual   #243 <Method void setValues(PropertyValuesHolder[])>
    //   25   45:aload_0         
    //   26   46:iconst_0        
    //   27   47:putfield        #134 <Field boolean mInitialized>
    //   28   50:return          
    //   29   51:aload_0         
    //   30   52:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   31   55:iconst_0        
    //   32   56:aaload          
    //   33   57:aload_1         
    //   34   58:invokevirtual   #433 <Method void PropertyValuesHolder.setIntValues(int[])>
    //   35   61:goto            45
    }

    public void setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          10
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #146 <Field Interpolator mInterpolator>
    //    5    9:return          
    //    6   10:aload_0         
    //    7   11:new             #437 <Class LinearInterpolator>
    //    8   14:dup             
    //    9   15:invokespecial   #438 <Method void LinearInterpolator()>
    //   10   18:putfield        #146 <Field Interpolator mInterpolator>
    //   11   21:return          
    }

    public transient void setObjectValues(Object aobj[])
    {
    //    0    0:aload_1         
    //    1    1:ifnull          9
    //    2    4:aload_1         
    //    3    5:arraylength     
    //    4    6:ifne            10
    //    5    9:return          
    //    6   10:aload_0         
    //    7   11:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //    8   14:ifnull          25
    //    9   17:aload_0         
    //   10   18:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   11   21:arraylength     
    //   12   22:ifne            52
    //   13   25:iconst_1        
    //   14   26:anewarray       PropertyValuesHolder[]
    //   15   29:astore_2        
    //   16   30:aload_2         
    //   17   31:iconst_0        
    //   18   32:ldc2            #425 <String "">
    //   19   35:aconst_null     
    //   20   36:aload_1         
    //   21   37:invokestatic    #441 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
    //   22   40:aastore         
    //   23   41:aload_0         
    //   24   42:aload_2         
    //   25   43:invokevirtual   #243 <Method void setValues(PropertyValuesHolder[])>
    //   26   46:aload_0         
    //   27   47:iconst_0        
    //   28   48:putfield        #134 <Field boolean mInitialized>
    //   29   51:return          
    //   30   52:aload_0         
    //   31   53:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   32   56:iconst_0        
    //   33   57:aaload          
    //   34   58:aload_1         
    //   35   59:invokevirtual   #442 <Method void PropertyValuesHolder.setObjectValues(Object[])>
    //   36   62:goto            46
    }

    public void setRepeatCount(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #142 <Field int mRepeatCount>
    //    3    5:return          
    }

    public void setRepeatMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #144 <Field int mRepeatMode>
    //    3    5:return          
    }

    public void setStartDelay(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #140 <Field long mStartDelay>
    //    3    5:return          
    }

    public transient void setValues(PropertyValuesHolder apropertyvaluesholder[])
    {
    //    0    0:aload_1         
    //    1    1:arraylength     
    //    2    2:istore_2        
    //    3    3:aload_0         
    //    4    4:aload_1         
    //    5    5:putfield        #301 <Field PropertyValuesHolder[] mValues>
    //    6    8:aload_0         
    //    7    9:new             #351 <Class HashMap>
    //    8   12:dup             
    //    9   13:iload_2         
    //   10   14:invokespecial   #354 <Method void HashMap(int)>
    //   11   17:putfield        #356 <Field HashMap mValuesMap>
    //   12   20:iconst_0        
    //   13   21:istore_3        
    //   14   22:iload_3         
    //   15   23:iload_2         
    //   16   24:icmplt          33
    //   17   27:aload_0         
    //   18   28:iconst_0        
    //   19   29:putfield        #134 <Field boolean mInitialized>
    //   20   32:return          
    //   21   33:aload_1         
    //   22   34:iload_3         
    //   23   35:aaload          
    //   24   36:astore          4
    //   25   38:aload_0         
    //   26   39:getfield        #356 <Field HashMap mValuesMap>
    //   27   42:aload           4
    //   28   44:invokevirtual   #363 <Method String PropertyValuesHolder.getPropertyName()>
    //   29   47:aload           4
    //   30   49:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
    //   31   52:pop             
    //   32   53:iinc            3  1
    //   33   56:goto            22
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokespecial   #400 <Method void start(boolean)>
    //    3    5:return          
    }

    public String toString()
    {
    //    0    0:new             #411 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:ldc2            #447 <String "ValueAnimator@">
    //    3    7:invokespecial   #414 <Method void StringBuilder(String)>
    //    4   10:aload_0         
    //    5   11:invokevirtual   #452 <Method int Object.hashCode()>
    //    6   14:invokestatic    #458 <Method String Integer.toHexString(int)>
    //    7   17:invokevirtual   #461 <Method StringBuilder StringBuilder.append(String)>
    //    8   20:invokevirtual   #421 <Method String StringBuilder.toString()>
    //    9   23:astore_1        
    //   10   24:aload_0         
    //   11   25:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   12   28:ifnull          42
    //   13   31:iconst_0        
    //   14   32:istore_2        
    //   15   33:iload_2         
    //   16   34:aload_0         
    //   17   35:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   18   38:arraylength     
    //   19   39:icmplt          44
    //   20   42:aload_1         
    //   21   43:areturn         
    //   22   44:new             #411 <Class StringBuilder>
    //   23   47:dup             
    //   24   48:aload_1         
    //   25   49:invokestatic    #467 <Method String String.valueOf(Object)>
    //   26   52:invokespecial   #414 <Method void StringBuilder(String)>
    //   27   55:ldc2            #469 <String "\n    ">
    //   28   58:invokevirtual   #461 <Method StringBuilder StringBuilder.append(String)>
    //   29   61:aload_0         
    //   30   62:getfield        #301 <Field PropertyValuesHolder[] mValues>
    //   31   65:iload_2         
    //   32   66:aaload          
    //   33   67:invokevirtual   #470 <Method String PropertyValuesHolder.toString()>
    //   34   70:invokevirtual   #461 <Method StringBuilder StringBuilder.append(String)>
    //   35   73:invokevirtual   #421 <Method String StringBuilder.toString()>
    //   36   76:astore_1        
    //   37   77:iinc            2  1
    //   38   80:goto            33
    }

    static final int ANIMATION_FRAME = 1;
    static final int ANIMATION_START = 0;
    private static final long DEFAULT_FRAME_DELAY = 10L;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    static final int RUNNING = 1;
    static final int SEEKED = 2;
    static final int STOPPED;
    private static ThreadLocal sAnimationHandler;
    private static final ThreadLocal sAnimations;
    private static final Interpolator sDefaultInterpolator;
    private static final ThreadLocal sDelayedAnims;
    private static final ThreadLocal sEndingAnims;
    private static final TypeEvaluator sFloatEvaluator;
    private static long sFrameDelay;
    private static final TypeEvaluator sIntEvaluator;
    private static final ThreadLocal sPendingAnimations;
    private static final ThreadLocal sReadyAnims;
    private float mCurrentFraction;
    private int mCurrentIteration;
    private long mDelayStartTime;
    private long mDuration;
    boolean mInitialized;
    private Interpolator mInterpolator;
    private boolean mPlayingBackwards;
    int mPlayingState;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mRunning;
    long mSeekTime;
    private long mStartDelay;
    long mStartTime;
    private boolean mStarted;
    private boolean mStartedDelay;
    private ArrayList mUpdateListeners;
    PropertyValuesHolder mValues[];
    HashMap mValuesMap;

    static void access$10(ValueAnimator valueanimator, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #130 <Field boolean mRunning>
    //    3    5:return          
    }

    static void access$11(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #155 <Method void endAnimation()>
    //    2    4:return          
    }

    static long access$12()
    {
    //    0    0:getstatic       #113 <Field long sFrameDelay>
    //    1    3:lreturn         
    }

    static ThreadLocal access$2()
    {
    //    0    0:getstatic       #76  <Field ThreadLocal sAnimations>
    //    1    3:areturn         
    }

    static ThreadLocal access$3()
    {
    //    0    0:getstatic       #86  <Field ThreadLocal sDelayedAnims>
    //    1    3:areturn         
    }

    static ThreadLocal access$4()
    {
    //    0    0:getstatic       #81  <Field ThreadLocal sPendingAnimations>
    //    1    3:areturn         
    }

    static long access$5(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #140 <Field long mStartDelay>
    //    2    4:lreturn         
    }

    static void access$6(ValueAnimator valueanimator)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #167 <Method void startAnimation()>
    //    2    4:return          
    }

    static ThreadLocal access$7()
    {
    //    0    0:getstatic       #96  <Field ThreadLocal sReadyAnims>
    //    1    3:areturn         
    }

    static ThreadLocal access$8()
    {
    //    0    0:getstatic       #91  <Field ThreadLocal sEndingAnims>
    //    1    3:areturn         
    }

    static boolean access$9(ValueAnimator valueanimator, long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokespecial   #175 <Method boolean delayedAnimationFrame(long)>
    //    3    5:ireturn         
    }

    // Unreferenced inner class com/nineoldandroids/animation/ValueAnimator$1

/* anonymous class */
    class _cls1 extends ThreadLocal
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ThreadLocal()>
        //    2    4:return          
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #16  <Method ArrayList initialValue()>
        //    2    4:areturn         
        }

        protected ArrayList initialValue()
        {
        //    0    0:new             #18  <Class ArrayList>
        //    1    3:dup             
        //    2    4:invokespecial   #19  <Method void ArrayList()>
        //    3    7:areturn         
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/ValueAnimator$2

/* anonymous class */
    class _cls2 extends ThreadLocal
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ThreadLocal()>
        //    2    4:return          
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #16  <Method ArrayList initialValue()>
        //    2    4:areturn         
        }

        protected ArrayList initialValue()
        {
        //    0    0:new             #18  <Class ArrayList>
        //    1    3:dup             
        //    2    4:invokespecial   #19  <Method void ArrayList()>
        //    3    7:areturn         
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/ValueAnimator$3

/* anonymous class */
    class _cls3 extends ThreadLocal
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ThreadLocal()>
        //    2    4:return          
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #16  <Method ArrayList initialValue()>
        //    2    4:areturn         
        }

        protected ArrayList initialValue()
        {
        //    0    0:new             #18  <Class ArrayList>
        //    1    3:dup             
        //    2    4:invokespecial   #19  <Method void ArrayList()>
        //    3    7:areturn         
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/ValueAnimator$4

/* anonymous class */
    class _cls4 extends ThreadLocal
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ThreadLocal()>
        //    2    4:return          
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #16  <Method ArrayList initialValue()>
        //    2    4:areturn         
        }

        protected ArrayList initialValue()
        {
        //    0    0:new             #18  <Class ArrayList>
        //    1    3:dup             
        //    2    4:invokespecial   #19  <Method void ArrayList()>
        //    3    7:areturn         
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/ValueAnimator$5

/* anonymous class */
    class _cls5 extends ThreadLocal
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ThreadLocal()>
        //    2    4:return          
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #16  <Method ArrayList initialValue()>
        //    2    4:areturn         
        }

        protected ArrayList initialValue()
        {
        //    0    0:new             #18  <Class ArrayList>
        //    1    3:dup             
        //    2    4:invokespecial   #19  <Method void ArrayList()>
        //    3    7:areturn         
        }
    }

}
