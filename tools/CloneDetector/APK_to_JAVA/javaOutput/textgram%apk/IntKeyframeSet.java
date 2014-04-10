// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            KeyframeSet, Keyframe, TypeEvaluator

class IntKeyframeSet extends KeyframeSet
{

    public transient IntKeyframeSet(Keyframe.IntKeyframe aintkeyframe[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #15  <Method void KeyframeSet(Keyframe[])>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #17  <Field boolean firstTime>
    //    6   10:return          
    }

    public IntKeyframeSet clone()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field ArrayList mKeyframes>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #23  <Field ArrayList mKeyframes>
    //    5    9:invokevirtual   #29  <Method int ArrayList.size()>
    //    6   12:istore_2        
    //    7   13:iload_2         
    //    8   14:anewarray       Keyframe.IntKeyframe[]
    //    9   17:astore_3        
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:iload           4
    //   13   23:iload_2         
    //   14   24:icmplt          36
    //   15   27:new             #2   <Class IntKeyframeSet>
    //   16   30:dup             
    //   17   31:aload_3         
    //   18   32:invokespecial   #33  <Method void IntKeyframeSet(Keyframe$IntKeyframe[])>
    //   19   35:areturn         
    //   20   36:aload_3         
    //   21   37:iload           4
    //   22   39:aload_1         
    //   23   40:iload           4
    //   24   42:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   25   45:checkcast       #39  <Class Keyframe>
    //   26   48:invokevirtual   #42  <Method Keyframe Keyframe.clone()>
    //   27   51:checkcast       #31  <Class Keyframe$IntKeyframe>
    //   28   54:aastore         
    //   29   55:iinc            4  1
    //   30   58:goto            21
    }

    public volatile KeyframeSet clone()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #45  <Method IntKeyframeSet clone()>
    //    2    4:areturn         
    }

    public int getIntValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #50  <Field int mNumKeyframes>
    //    2    4:iconst_2        
    //    3    5:icmpne          139
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
    //   15   29:checkcast       #31  <Class Keyframe$IntKeyframe>
    //   16   32:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //   17   35:putfield        #54  <Field int firstValue>
    //   18   38:aload_0         
    //   19   39:aload_0         
    //   20   40:getfield        #23  <Field ArrayList mKeyframes>
    //   21   43:iconst_1        
    //   22   44:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   23   47:checkcast       #31  <Class Keyframe$IntKeyframe>
    //   24   50:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //   25   53:putfield        #56  <Field int lastValue>
    //   26   56:aload_0         
    //   27   57:aload_0         
    //   28   58:getfield        #56  <Field int lastValue>
    //   29   61:aload_0         
    //   30   62:getfield        #54  <Field int firstValue>
    //   31   65:isub            
    //   32   66:putfield        #58  <Field int deltaValue>
    //   33   69:aload_0         
    //   34   70:getfield        #62  <Field Interpolator mInterpolator>
    //   35   73:ifnull          87
    //   36   76:aload_0         
    //   37   77:getfield        #62  <Field Interpolator mInterpolator>
    //   38   80:fload_1         
    //   39   81:invokeinterface #68  <Method float Interpolator.getInterpolation(float)>
    //   40   86:fstore_1        
    //   41   87:aload_0         
    //   42   88:getfield        #72  <Field TypeEvaluator mEvaluator>
    //   43   91:ifnonnull       108
    //   44   94:aload_0         
    //   45   95:getfield        #54  <Field int firstValue>
    //   46   98:fload_1         
    //   47   99:aload_0         
    //   48  100:getfield        #58  <Field int deltaValue>
    //   49  103:i2f             
    //   50  104:fmul            
    //   51  105:f2i             
    //   52  106:iadd            
    //   53  107:ireturn         
    //   54  108:aload_0         
    //   55  109:getfield        #72  <Field TypeEvaluator mEvaluator>
    //   56  112:fload_1         
    //   57  113:aload_0         
    //   58  114:getfield        #54  <Field int firstValue>
    //   59  117:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //   60  120:aload_0         
    //   61  121:getfield        #56  <Field int lastValue>
    //   62  124:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //   63  127:invokeinterface #84  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //   64  132:checkcast       #86  <Class Number>
    //   65  135:invokevirtual   #89  <Method int Number.intValue()>
    //   66  138:ireturn         
    //   67  139:fload_1         
    //   68  140:fconst_0        
    //   69  141:fcmpg           
    //   70  142:ifgt            281
    //   71  145:aload_0         
    //   72  146:getfield        #23  <Field ArrayList mKeyframes>
    //   73  149:iconst_0        
    //   74  150:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   75  153:checkcast       #31  <Class Keyframe$IntKeyframe>
    //   76  156:astore          17
    //   77  158:aload_0         
    //   78  159:getfield        #23  <Field ArrayList mKeyframes>
    //   79  162:iconst_1        
    //   80  163:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //   81  166:checkcast       #31  <Class Keyframe$IntKeyframe>
    //   82  169:astore          18
    //   83  171:aload           17
    //   84  173:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //   85  176:istore          19
    //   86  178:aload           18
    //   87  180:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //   88  183:istore          20
    //   89  185:aload           17
    //   90  187:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //   91  190:fstore          21
    //   92  192:aload           18
    //   93  194:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //   94  197:fstore          22
    //   95  199:aload           18
    //   96  201:invokevirtual   #97  <Method Interpolator Keyframe$IntKeyframe.getInterpolator()>
    //   97  204:astore          23
    //   98  206:aload           23
    //   99  208:ifnull          220
    //  100  211:aload           23
    //  101  213:fload_1         
    //  102  214:invokeinterface #68  <Method float Interpolator.getInterpolation(float)>
    //  103  219:fstore_1        
    //  104  220:fload_1         
    //  105  221:fload           21
    //  106  223:fsub            
    //  107  224:fload           22
    //  108  226:fload           21
    //  109  228:fsub            
    //  110  229:fdiv            
    //  111  230:fstore          24
    //  112  232:aload_0         
    //  113  233:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  114  236:ifnonnull       253
    //  115  239:iload           19
    //  116  241:fload           24
    //  117  243:iload           20
    //  118  245:iload           19
    //  119  247:isub            
    //  120  248:i2f             
    //  121  249:fmul            
    //  122  250:f2i             
    //  123  251:iadd            
    //  124  252:ireturn         
    //  125  253:aload_0         
    //  126  254:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  127  257:fload           24
    //  128  259:iload           19
    //  129  261:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  130  264:iload           20
    //  131  266:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  132  269:invokeinterface #84  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  133  274:checkcast       #86  <Class Number>
    //  134  277:invokevirtual   #89  <Method int Number.intValue()>
    //  135  280:ireturn         
    //  136  281:fload_1         
    //  137  282:fconst_1        
    //  138  283:fcmpl           
    //  139  284:iflt            434
    //  140  287:aload_0         
    //  141  288:getfield        #23  <Field ArrayList mKeyframes>
    //  142  291:bipush          -2
    //  143  293:aload_0         
    //  144  294:getfield        #50  <Field int mNumKeyframes>
    //  145  297:iadd            
    //  146  298:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  147  301:checkcast       #31  <Class Keyframe$IntKeyframe>
    //  148  304:astore          9
    //  149  306:aload_0         
    //  150  307:getfield        #23  <Field ArrayList mKeyframes>
    //  151  310:iconst_m1       
    //  152  311:aload_0         
    //  153  312:getfield        #50  <Field int mNumKeyframes>
    //  154  315:iadd            
    //  155  316:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  156  319:checkcast       #31  <Class Keyframe$IntKeyframe>
    //  157  322:astore          10
    //  158  324:aload           9
    //  159  326:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //  160  329:istore          11
    //  161  331:aload           10
    //  162  333:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //  163  336:istore          12
    //  164  338:aload           9
    //  165  340:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  166  343:fstore          13
    //  167  345:aload           10
    //  168  347:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  169  350:fstore          14
    //  170  352:aload           10
    //  171  354:invokevirtual   #97  <Method Interpolator Keyframe$IntKeyframe.getInterpolator()>
    //  172  357:astore          15
    //  173  359:aload           15
    //  174  361:ifnull          373
    //  175  364:aload           15
    //  176  366:fload_1         
    //  177  367:invokeinterface #68  <Method float Interpolator.getInterpolation(float)>
    //  178  372:fstore_1        
    //  179  373:fload_1         
    //  180  374:fload           13
    //  181  376:fsub            
    //  182  377:fload           14
    //  183  379:fload           13
    //  184  381:fsub            
    //  185  382:fdiv            
    //  186  383:fstore          16
    //  187  385:aload_0         
    //  188  386:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  189  389:ifnonnull       406
    //  190  392:iload           11
    //  191  394:fload           16
    //  192  396:iload           12
    //  193  398:iload           11
    //  194  400:isub            
    //  195  401:i2f             
    //  196  402:fmul            
    //  197  403:f2i             
    //  198  404:iadd            
    //  199  405:ireturn         
    //  200  406:aload_0         
    //  201  407:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  202  410:fload           16
    //  203  412:iload           11
    //  204  414:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  205  417:iload           12
    //  206  419:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  207  422:invokeinterface #84  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  208  427:checkcast       #86  <Class Number>
    //  209  430:invokevirtual   #89  <Method int Number.intValue()>
    //  210  433:ireturn         
    //  211  434:aload_0         
    //  212  435:getfield        #23  <Field ArrayList mKeyframes>
    //  213  438:iconst_0        
    //  214  439:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  215  442:checkcast       #31  <Class Keyframe$IntKeyframe>
    //  216  445:astore_2        
    //  217  446:iconst_1        
    //  218  447:istore_3        
    //  219  448:iload_3         
    //  220  449:aload_0         
    //  221  450:getfield        #50  <Field int mNumKeyframes>
    //  222  453:icmplt          482
    //  223  456:aload_0         
    //  224  457:getfield        #23  <Field ArrayList mKeyframes>
    //  225  460:iconst_m1       
    //  226  461:aload_0         
    //  227  462:getfield        #50  <Field int mNumKeyframes>
    //  228  465:iadd            
    //  229  466:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  230  469:checkcast       #39  <Class Keyframe>
    //  231  472:invokevirtual   #101 <Method Object Keyframe.getValue()>
    //  232  475:checkcast       #86  <Class Number>
    //  233  478:invokevirtual   #89  <Method int Number.intValue()>
    //  234  481:ireturn         
    //  235  482:aload_0         
    //  236  483:getfield        #23  <Field ArrayList mKeyframes>
    //  237  486:iload_3         
    //  238  487:invokevirtual   #37  <Method Object ArrayList.get(int)>
    //  239  490:checkcast       #31  <Class Keyframe$IntKeyframe>
    //  240  493:astore          4
    //  241  495:fload_1         
    //  242  496:aload           4
    //  243  498:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  244  501:fcmpg           
    //  245  502:ifge            607
    //  246  505:aload           4
    //  247  507:invokevirtual   #97  <Method Interpolator Keyframe$IntKeyframe.getInterpolator()>
    //  248  510:astore          5
    //  249  512:aload           5
    //  250  514:ifnull          526
    //  251  517:aload           5
    //  252  519:fload_1         
    //  253  520:invokeinterface #68  <Method float Interpolator.getInterpolation(float)>
    //  254  525:fstore_1        
    //  255  526:fload_1         
    //  256  527:aload_2         
    //  257  528:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  258  531:fsub            
    //  259  532:aload           4
    //  260  534:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  261  537:aload_2         
    //  262  538:invokevirtual   #93  <Method float Keyframe$IntKeyframe.getFraction()>
    //  263  541:fsub            
    //  264  542:fdiv            
    //  265  543:fstore          6
    //  266  545:aload_2         
    //  267  546:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //  268  549:istore          7
    //  269  551:aload           4
    //  270  553:invokevirtual   #52  <Method int Keyframe$IntKeyframe.getIntValue()>
    //  271  556:istore          8
    //  272  558:aload_0         
    //  273  559:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  274  562:ifnonnull       579
    //  275  565:iload           7
    //  276  567:fload           6
    //  277  569:iload           8
    //  278  571:iload           7
    //  279  573:isub            
    //  280  574:i2f             
    //  281  575:fmul            
    //  282  576:f2i             
    //  283  577:iadd            
    //  284  578:ireturn         
    //  285  579:aload_0         
    //  286  580:getfield        #72  <Field TypeEvaluator mEvaluator>
    //  287  583:fload           6
    //  288  585:iload           7
    //  289  587:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  290  590:iload           8
    //  291  592:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //  292  595:invokeinterface #84  <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  293  600:checkcast       #86  <Class Number>
    //  294  603:invokevirtual   #89  <Method int Number.intValue()>
    //  295  606:ireturn         
    //  296  607:aload           4
    //  297  609:astore_2        
    //  298  610:iinc            3  1
    //  299  613:goto            448
    }

    public Object getValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokevirtual   #104 <Method int getIntValue(float)>
    //    3    5:invokestatic    #78  <Method Integer Integer.valueOf(int)>
    //    4    8:areturn         
    }

    private int deltaValue;
    private boolean firstTime;
    private int firstValue;
    private int lastValue;
}
