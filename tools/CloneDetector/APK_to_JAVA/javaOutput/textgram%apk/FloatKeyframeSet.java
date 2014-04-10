// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            KeyframeSet, Keyframe, TypeEvaluator

class FloatKeyframeSet extends KeyframeSet
{

    public transient FloatKeyframeSet(Keyframe.FloatKeyframe afloatkeyframe[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #15  <Method void KeyframeSet(Keyframe[])>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #17  <Field boolean firstTime>
    //    6   10:return          
    }

    public FloatKeyframeSet clone()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field ArrayList mKeyframes>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #23  <Field ArrayList mKeyframes>
    //    5    9:invokevirtual   #29  <Method int ArrayList.size()>
    //    6   12:istore_2        
    //    7   13:iload_2         
    //    8   14:anewarray       Keyframe.FloatKeyframe[]
    //    9   17:astore_3        
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:iload           4
    //   13   23:iload_2         
    //   14   24:icmplt          36
    //   15   27:new             #2   <Class FloatKeyframeSet>
    //   16   30:dup             
    //   17   31:aload_3         
    //   18   32:invokespecial   #33  <Method void FloatKeyframeSet(Keyframe$FloatKeyframe[])>
    //   19   35:areturn         
    //   20   36:aload_3         
    //   21   37:iload           4
    //   22   39:aload_1         
    //   23   40:iload           4
    //   24   42:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   25   45:checkcast       #39  <Class Keyframe>
    //   26   48:invokevirtual   #42  <Method Keyframe Keyframe.clone()>
    //   27   51:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //   28   54:aastore         
    //   29   55:iinc            4  1
    //   30   58:goto            21
    }

    public volatile KeyframeSet clone()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #45  <Method FloatKeyframeSet clone()>
    //    2    4:areturn         
    }

    public float getFloatValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field int mNumKeyframes>
    //    2    4:iconst_2        
    //    3    5:icmpne          137
    //    4    8:aload_0         
    //    5    9:getfield        #17  <Field boolean firstTime>
    //    6   12:ifeq            69
    //    7   15:aload_0         
    //    8   16:iconst_0        
    //    9   17:putfield        #17  <Field boolean firstTime>
    //   10   20:aload_0         
    //   11   21:aload_0         
    //   12   22:getfield        #23  <Field ArrayList mKeyframes>
    //   13   25:iconst_0        
    //   14   26:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   15   29:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //   16   32:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //   17   35:putfield        #56  <Field float firstValue>
    //   18   38:aload_0         
    //   19   39:aload_0         
    //   20   40:getfield        #23  <Field ArrayList mKeyframes>
    //   21   43:iconst_1        
    //   22   44:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   23   47:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //   24   50:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //   25   53:putfield        #58  <Field float lastValue>
    //   26   56:aload_0         
    //   27   57:aload_0         
    //   28   58:getfield        #58  <Field float lastValue>
    //   29   61:aload_0         
    //   30   62:getfield        #56  <Field float firstValue>
    //   31   65:fsub            
    //   32   66:putfield        #60  <Field float deltaValue>
    //   33   69:aload_0         
    //   34   70:getfield        #64  <Field Interpolator mInterpolator>
    //   35   73:ifnull          87
    //   36   76:aload_0         
    //   37   77:getfield        #64  <Field Interpolator mInterpolator>
    //   38   80:fload_1         
    //   39   81:invokeinterface #69  <Method float Interpolator.getInterpolation(float)>
    //   40   86:fstore_1        
    //   41   87:aload_0         
    //   42   88:getfield        #73  <Field TypeEvaluator mEvaluator>
    //   43   91:ifnonnull       106
    //   44   94:aload_0         
    //   45   95:getfield        #56  <Field float firstValue>
    //   46   98:fload_1         
    //   47   99:aload_0         
    //   48  100:getfield        #60  <Field float deltaValue>
    //   49  103:fmul            
    //   50  104:fadd            
    //   51  105:freturn         
    //   52  106:aload_0         
    //   53  107:getfield        #73  <Field TypeEvaluator mEvaluator>
    //   54  110:fload_1         
    //   55  111:aload_0         
    //   56  112:getfield        #56  <Field float firstValue>
    //   57  115:invokestatic    #79  <Method Float Float.valueOf(float)>
    //   58  118:aload_0         
    //   59  119:getfield        #58  <Field float lastValue>
    //   60  122:invokestatic    #79  <Method Float Float.valueOf(float)>
    //   61  125:invokeinterface #85  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //   62  130:checkcast       #87  <Class Number>
    //   63  133:invokevirtual   #90  <Method float Number.floatValue()>
    //   64  136:freturn         
    //   65  137:fload_1         
    //   66  138:fconst_0        
    //   67  139:fcmpg           
    //   68  140:ifgt            277
    //   69  143:aload_0         
    //   70  144:getfield        #23  <Field ArrayList mKeyframes>
    //   71  147:iconst_0        
    //   72  148:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   73  151:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //   74  154:astore          17
    //   75  156:aload_0         
    //   76  157:getfield        #23  <Field ArrayList mKeyframes>
    //   77  160:iconst_1        
    //   78  161:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   79  164:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //   80  167:astore          18
    //   81  169:aload           17
    //   82  171:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //   83  174:fstore          19
    //   84  176:aload           18
    //   85  178:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //   86  181:fstore          20
    //   87  183:aload           17
    //   88  185:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //   89  188:fstore          21
    //   90  190:aload           18
    //   91  192:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //   92  195:fstore          22
    //   93  197:aload           18
    //   94  199:invokevirtual   #97  <Method Interpolator Keyframe$FloatKeyframe.getInterpolator()>
    //   95  202:astore          23
    //   96  204:aload           23
    //   97  206:ifnull          218
    //   98  209:aload           23
    //   99  211:fload_1         
    //  100  212:invokeinterface #69  <Method float Interpolator.getInterpolation(float)>
    //  101  217:fstore_1        
    //  102  218:fload_1         
    //  103  219:fload           21
    //  104  221:fsub            
    //  105  222:fload           22
    //  106  224:fload           21
    //  107  226:fsub            
    //  108  227:fdiv            
    //  109  228:fstore          24
    //  110  230:aload_0         
    //  111  231:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  112  234:ifnonnull       249
    //  113  237:fload           19
    //  114  239:fload           24
    //  115  241:fload           20
    //  116  243:fload           19
    //  117  245:fsub            
    //  118  246:fmul            
    //  119  247:fadd            
    //  120  248:freturn         
    //  121  249:aload_0         
    //  122  250:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  123  253:fload           24
    //  124  255:fload           19
    //  125  257:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  126  260:fload           20
    //  127  262:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  128  265:invokeinterface #85  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  129  270:checkcast       #87  <Class Number>
    //  130  273:invokevirtual   #90  <Method float Number.floatValue()>
    //  131  276:freturn         
    //  132  277:fload_1         
    //  133  278:fconst_1        
    //  134  279:fcmpl           
    //  135  280:iflt            428
    //  136  283:aload_0         
    //  137  284:getfield        #23  <Field ArrayList mKeyframes>
    //  138  287:bipush          -2
    //  139  289:aload_0         
    //  140  290:getfield        #51  <Field int mNumKeyframes>
    //  141  293:iadd            
    //  142  294:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  143  297:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //  144  300:astore          9
    //  145  302:aload_0         
    //  146  303:getfield        #23  <Field ArrayList mKeyframes>
    //  147  306:iconst_m1       
    //  148  307:aload_0         
    //  149  308:getfield        #51  <Field int mNumKeyframes>
    //  150  311:iadd            
    //  151  312:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  152  315:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //  153  318:astore          10
    //  154  320:aload           9
    //  155  322:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //  156  325:fstore          11
    //  157  327:aload           10
    //  158  329:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //  159  332:fstore          12
    //  160  334:aload           9
    //  161  336:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  162  339:fstore          13
    //  163  341:aload           10
    //  164  343:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  165  346:fstore          14
    //  166  348:aload           10
    //  167  350:invokevirtual   #97  <Method Interpolator Keyframe$FloatKeyframe.getInterpolator()>
    //  168  353:astore          15
    //  169  355:aload           15
    //  170  357:ifnull          369
    //  171  360:aload           15
    //  172  362:fload_1         
    //  173  363:invokeinterface #69  <Method float Interpolator.getInterpolation(float)>
    //  174  368:fstore_1        
    //  175  369:fload_1         
    //  176  370:fload           13
    //  177  372:fsub            
    //  178  373:fload           14
    //  179  375:fload           13
    //  180  377:fsub            
    //  181  378:fdiv            
    //  182  379:fstore          16
    //  183  381:aload_0         
    //  184  382:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  185  385:ifnonnull       400
    //  186  388:fload           11
    //  187  390:fload           16
    //  188  392:fload           12
    //  189  394:fload           11
    //  190  396:fsub            
    //  191  397:fmul            
    //  192  398:fadd            
    //  193  399:freturn         
    //  194  400:aload_0         
    //  195  401:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  196  404:fload           16
    //  197  406:fload           11
    //  198  408:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  199  411:fload           12
    //  200  413:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  201  416:invokeinterface #85  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  202  421:checkcast       #87  <Class Number>
    //  203  424:invokevirtual   #90  <Method float Number.floatValue()>
    //  204  427:freturn         
    //  205  428:aload_0         
    //  206  429:getfield        #23  <Field ArrayList mKeyframes>
    //  207  432:iconst_0        
    //  208  433:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  209  436:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //  210  439:astore_2        
    //  211  440:iconst_1        
    //  212  441:istore_3        
    //  213  442:iload_3         
    //  214  443:aload_0         
    //  215  444:getfield        #51  <Field int mNumKeyframes>
    //  216  447:icmplt          476
    //  217  450:aload_0         
    //  218  451:getfield        #23  <Field ArrayList mKeyframes>
    //  219  454:iconst_m1       
    //  220  455:aload_0         
    //  221  456:getfield        #51  <Field int mNumKeyframes>
    //  222  459:iadd            
    //  223  460:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  224  463:checkcast       #39  <Class Keyframe>
    //  225  466:invokevirtual   #101 <Method Object Keyframe.getValue()>
    //  226  469:checkcast       #87  <Class Number>
    //  227  472:invokevirtual   #90  <Method float Number.floatValue()>
    //  228  475:freturn         
    //  229  476:aload_0         
    //  230  477:getfield        #23  <Field ArrayList mKeyframes>
    //  231  480:iload_3         
    //  232  481:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  233  484:checkcast       #31  <Class Keyframe$FloatKeyframe>
    //  234  487:astore          4
    //  235  489:fload_1         
    //  236  490:aload           4
    //  237  492:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  238  495:fcmpg           
    //  239  496:ifge            599
    //  240  499:aload           4
    //  241  501:invokevirtual   #97  <Method Interpolator Keyframe$FloatKeyframe.getInterpolator()>
    //  242  504:astore          5
    //  243  506:aload           5
    //  244  508:ifnull          520
    //  245  511:aload           5
    //  246  513:fload_1         
    //  247  514:invokeinterface #69  <Method float Interpolator.getInterpolation(float)>
    //  248  519:fstore_1        
    //  249  520:fload_1         
    //  250  521:aload_2         
    //  251  522:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  252  525:fsub            
    //  253  526:aload           4
    //  254  528:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  255  531:aload_2         
    //  256  532:invokevirtual   #93  <Method float Keyframe$FloatKeyframe.getFraction()>
    //  257  535:fsub            
    //  258  536:fdiv            
    //  259  537:fstore          6
    //  260  539:aload_2         
    //  261  540:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //  262  543:fstore          7
    //  263  545:aload           4
    //  264  547:invokevirtual   #54  <Method float Keyframe$FloatKeyframe.getFloatValue()>
    //  265  550:fstore          8
    //  266  552:aload_0         
    //  267  553:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  268  556:ifnonnull       571
    //  269  559:fload           7
    //  270  561:fload           6
    //  271  563:fload           8
    //  272  565:fload           7
    //  273  567:fsub            
    //  274  568:fmul            
    //  275  569:fadd            
    //  276  570:freturn         
    //  277  571:aload_0         
    //  278  572:getfield        #73  <Field TypeEvaluator mEvaluator>
    //  279  575:fload           6
    //  280  577:fload           7
    //  281  579:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  282  582:fload           8
    //  283  584:invokestatic    #79  <Method Float Float.valueOf(float)>
    //  284  587:invokeinterface #85  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  285  592:checkcast       #87  <Class Number>
    //  286  595:invokevirtual   #90  <Method float Number.floatValue()>
    //  287  598:freturn         
    //  288  599:aload           4
    //  289  601:astore_2        
    //  290  602:iinc            3  1
    //  291  605:goto            442
    }

    public Object getValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokevirtual   #104 <Method float getFloatValue(float)>
    //    3    5:invokestatic    #79  <Method Float Float.valueOf(float)>
    //    4    8:areturn         
    }

    private float deltaValue;
    private boolean firstTime;
    private float firstValue;
    private float lastValue;
}
