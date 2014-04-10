// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.content.Context;
import android.content.res.*;
import android.util.*;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.nineoldandroids.animation:
//            Animator, AnimatorSet, ValueAnimator, ArgbEvaluator, 
//            ObjectAnimator

public class AnimatorInflater
{

    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #32  <Int 0x10102e2>
    //    5    7:iastore         
    //    6    8:putstatic       #34  <Field int[] AnimatorSet>
    //    7   11:iconst_1        
    //    8   12:newarray        int[]
    //    9   14:dup             
    //   10   15:iconst_0        
    //   11   16:ldc1            #35  <Int 0x10102e1>
    //   12   18:iastore         
    //   13   19:putstatic       #37  <Field int[] PropertyAnimator>
    //   14   22:bipush          8
    //   15   24:newarray        int[]
    //   16   26:dup             
    //   17   27:iconst_0        
    //   18   28:ldc1            #38  <Int 0x1010141>
    //   19   30:iastore         
    //   20   31:dup             
    //   21   32:iconst_1        
    //   22   33:ldc1            #39  <Int 0x1010198>
    //   23   35:iastore         
    //   24   36:dup             
    //   25   37:iconst_2        
    //   26   38:ldc1            #40  <Int 0x10101be>
    //   27   40:iastore         
    //   28   41:dup             
    //   29   42:iconst_3        
    //   30   43:ldc1            #41  <Int 0x10101bf>
    //   31   45:iastore         
    //   32   46:dup             
    //   33   47:iconst_4        
    //   34   48:ldc1            #42  <Int 0x10101c0>
    //   35   50:iastore         
    //   36   51:dup             
    //   37   52:iconst_5        
    //   38   53:ldc1            #43  <Int 0x10102de>
    //   39   55:iastore         
    //   40   56:dup             
    //   41   57:bipush          6
    //   42   59:ldc1            #44  <Int 0x10102df>
    //   43   61:iastore         
    //   44   62:dup             
    //   45   63:bipush          7
    //   46   65:ldc1            #45  <Int 0x10102e0>
    //   47   67:iastore         
    //   48   68:putstatic       #47  <Field int[] Animator>
    //   49   71:return          
    }

    public AnimatorInflater()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #50  <Method void Object()>
    //    2    4:return          
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_1         
    //    3    3:invokestatic    #62  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
    //    4    6:aconst_null     
    //    5    7:iconst_0        
    //    6    8:invokestatic    #65  <Method Animator createAnimatorFromXml(Context, XmlPullParser, AttributeSet, AnimatorSet, int)>
    //    7   11:areturn         
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, AnimatorSet animatorset, int i)
        throws XmlPullParserException, IOException
    {
    //    0    0:aconst_null     
    //    1    1:astore          5
    //    2    3:aconst_null     
    //    3    4:astore          6
    //    4    6:aload_1         
    //    5    7:invokeinterface #71  <Method int XmlPullParser.getDepth()>
    //    6   12:istore          7
    //    7   14:aload_1         
    //    8   15:invokeinterface #74  <Method int XmlPullParser.next()>
    //    9   20:istore          8
    //   10   22:iload           8
    //   11   24:iconst_3        
    //   12   25:icmpne          39
    //   13   28:aload_1         
    //   14   29:invokeinterface #71  <Method int XmlPullParser.getDepth()>
    //   15   34:iload           7
    //   16   36:icmple          45
    //   17   39:iload           8
    //   18   41:iconst_1        
    //   19   42:icmpne          98
    //   20   45:aload_3         
    //   21   46:ifnull          95
    //   22   49:aload           6
    //   23   51:ifnull          95
    //   24   54:aload           6
    //   25   56:invokevirtual   #79  <Method int ArrayList.size()>
    //   26   59:anewarray       Animator[]
    //   27   62:astore          16
    //   28   64:iconst_0        
    //   29   65:istore          17
    //   30   67:aload           6
    //   31   69:invokevirtual   #85  <Method Iterator ArrayList.iterator()>
    //   32   72:astore          18
    //   33   74:aload           18
    //   34   76:invokeinterface #91  <Method boolean Iterator.hasNext()>
    //   35   81:ifne            300
    //   36   84:iload           4
    //   37   86:ifne            332
    //   38   89:aload_3         
    //   39   90:aload           16
    //   40   92:invokevirtual   #97  <Method void AnimatorSet.playTogether(Animator[])>
    //   41   95:aload           5
    //   42   97:areturn         
    //   43   98:iload           8
    //   44  100:iconst_2        
    //   45  101:icmpne          14
    //   46  104:aload_1         
    //   47  105:invokeinterface #101 <Method String XmlPullParser.getName()>
    //   48  110:astore          9
    //   49  112:aload           9
    //   50  114:ldc1            #103 <String "objectAnimator">
    //   51  116:invokevirtual   #109 <Method boolean String.equals(Object)>
    //   52  119:ifeq            158
    //   53  122:aload_0         
    //   54  123:aload_2         
    //   55  124:invokestatic    #113 <Method ObjectAnimator loadObjectAnimator(Context, AttributeSet)>
    //   56  127:astore          5
    //   57  129:aload_3         
    //   58  130:ifnull          14
    //   59  133:aload           6
    //   60  135:ifnonnull       147
    //   61  138:new             #76  <Class ArrayList>
    //   62  141:dup             
    //   63  142:invokespecial   #114 <Method void ArrayList()>
    //   64  145:astore          6
    //   65  147:aload           6
    //   66  149:aload           5
    //   67  151:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
    //   68  154:pop             
    //   69  155:goto            14
    //   70  158:aload           9
    //   71  160:ldc1            #119 <String "animator">
    //   72  162:invokevirtual   #109 <Method boolean String.equals(Object)>
    //   73  165:ifeq            179
    //   74  168:aload_0         
    //   75  169:aload_2         
    //   76  170:aconst_null     
    //   77  171:invokestatic    #123 <Method ValueAnimator loadAnimator(Context, AttributeSet, ValueAnimator)>
    //   78  174:astore          5
    //   79  176:goto            129
    //   80  179:aload           9
    //   81  181:ldc1            #125 <String "set">
    //   82  183:invokevirtual   #109 <Method boolean String.equals(Object)>
    //   83  186:ifeq            271
    //   84  189:new             #93  <Class AnimatorSet>
    //   85  192:dup             
    //   86  193:invokespecial   #126 <Method void AnimatorSet()>
    //   87  196:astore          5
    //   88  198:aload_0         
    //   89  199:aload_2         
    //   90  200:getstatic       #34  <Field int[] AnimatorSet>
    //   91  203:invokevirtual   #132 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   92  206:astore          10
    //   93  208:new             #134 <Class TypedValue>
    //   94  211:dup             
    //   95  212:invokespecial   #135 <Method void TypedValue()>
    //   96  215:astore          11
    //   97  217:aload           10
    //   98  219:iconst_0        
    //   99  220:aload           11
    //  100  222:invokevirtual   #141 <Method boolean TypedArray.getValue(int, TypedValue)>
    //  101  225:pop             
    //  102  226:aload           11
    //  103  228:getfield        #144 <Field int TypedValue.type>
    //  104  231:bipush          16
    //  105  233:icmpne          265
    //  106  236:aload           11
    //  107  238:getfield        #147 <Field int TypedValue.data>
    //  108  241:istore          13
    //  109  243:aload_0         
    //  110  244:aload_1         
    //  111  245:aload_2         
    //  112  246:aload           5
    //  113  248:checkcast       #93  <Class AnimatorSet>
    //  114  251:iload           13
    //  115  253:invokestatic    #65  <Method Animator createAnimatorFromXml(Context, XmlPullParser, AttributeSet, AnimatorSet, int)>
    //  116  256:pop             
    //  117  257:aload           10
    //  118  259:invokevirtual   #150 <Method void TypedArray.recycle()>
    //  119  262:goto            129
    //  120  265:iconst_0        
    //  121  266:istore          13
    //  122  268:goto            243
    //  123  271:new             #152 <Class RuntimeException>
    //  124  274:dup             
    //  125  275:new             #154 <Class StringBuilder>
    //  126  278:dup             
    //  127  279:ldc1            #156 <String "Unknown animator name: ">
    //  128  281:invokespecial   #159 <Method void StringBuilder(String)>
    //  129  284:aload_1         
    //  130  285:invokeinterface #101 <Method String XmlPullParser.getName()>
    //  131  290:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
    //  132  293:invokevirtual   #166 <Method String StringBuilder.toString()>
    //  133  296:invokespecial   #167 <Method void RuntimeException(String)>
    //  134  299:athrow          
    //  135  300:aload           18
    //  136  302:invokeinterface #170 <Method Object Iterator.next()>
    //  137  307:checkcast       #81  <Class Animator>
    //  138  310:astore          19
    //  139  312:iload           17
    //  140  314:iconst_1        
    //  141  315:iadd            
    //  142  316:istore          20
    //  143  318:aload           16
    //  144  320:iload           17
    //  145  322:aload           19
    //  146  324:aastore         
    //  147  325:iload           20
    //  148  327:istore          17
    //  149  329:goto            74
    //  150  332:aload_3         
    //  151  333:aload           16
    //  152  335:invokevirtual   #173 <Method void AnimatorSet.playSequentially(Animator[])>
    //  153  338:aload           5
    //  154  340:areturn         
    }

    public static Animator loadAnimator(Context context, int i)
        throws android.content.res.Resources.NotFoundException
    {
    //    0    0:aconst_null     
    //    1    1:astore_2        
    // try 2 18 handler(s) 31 87 72
    //    2    2:aload_0         
    //    3    3:invokevirtual   #180 <Method Resources Context.getResources()>
    //    4    6:iload_1         
    //    5    7:invokevirtual   #186 <Method XmlResourceParser Resources.getAnimation(int)>
    //    6   10:astore_2        
    //    7   11:aload_0         
    //    8   12:aload_2         
    //    9   13:invokestatic    #188 <Method Animator createAnimatorFromXml(Context, XmlPullParser)>
    //   10   16:astore          10
    //   11   18:aload_2         
    //   12   19:ifnull          28
    //   13   22:aload_2         
    //   14   23:invokeinterface #193 <Method void XmlResourceParser.close()>
    //   15   28:aload           10
    //   16   30:areturn         
    // catch XmlPullParserException
    //   17   31:astore          7
    // try 33 72 handler(s) 72
    //   18   33:new             #176 <Class android.content.res.Resources$NotFoundException>
    //   19   36:dup             
    //   20   37:new             #154 <Class StringBuilder>
    //   21   40:dup             
    //   22   41:ldc1            #195 <String "Can't load animation resource ID #0x">
    //   23   43:invokespecial   #159 <Method void StringBuilder(String)>
    //   24   46:iload_1         
    //   25   47:invokestatic    #201 <Method String Integer.toHexString(int)>
    //   26   50:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
    //   27   53:invokevirtual   #166 <Method String StringBuilder.toString()>
    //   28   56:invokespecial   #202 <Method void android.content.res.Resources$NotFoundException(String)>
    //   29   59:astore          8
    //   30   61:aload           8
    //   31   63:aload           7
    //   32   65:invokevirtual   #206 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
    //   33   68:pop             
    //   34   69:aload           8
    //   35   71:athrow          
    // finally
    //   36   72:astore          6
    //   37   74:aload_2         
    //   38   75:ifnull          84
    //   39   78:aload_2         
    //   40   79:invokeinterface #193 <Method void XmlResourceParser.close()>
    //   41   84:aload           6
    //   42   86:athrow          
    // catch IOException
    //   43   87:astore_3        
    // try 88 126 handler(s) 72
    //   44   88:new             #176 <Class android.content.res.Resources$NotFoundException>
    //   45   91:dup             
    //   46   92:new             #154 <Class StringBuilder>
    //   47   95:dup             
    //   48   96:ldc1            #195 <String "Can't load animation resource ID #0x">
    //   49   98:invokespecial   #159 <Method void StringBuilder(String)>
    //   50  101:iload_1         
    //   51  102:invokestatic    #201 <Method String Integer.toHexString(int)>
    //   52  105:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
    //   53  108:invokevirtual   #166 <Method String StringBuilder.toString()>
    //   54  111:invokespecial   #202 <Method void android.content.res.Resources$NotFoundException(String)>
    //   55  114:astore          4
    //   56  116:aload           4
    //   57  118:aload_3         
    //   58  119:invokevirtual   #206 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
    //   59  122:pop             
    //   60  123:aload           4
    //   61  125:athrow          
    }

    private static ValueAnimator loadAnimator(Context context, AttributeSet attributeset, ValueAnimator valueanimator)
        throws android.content.res.Resources.NotFoundException
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getstatic       #47  <Field int[] Animator>
    //    3    5:invokevirtual   #132 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:iconst_1        
    //    7   11:iconst_0        
    //    8   12:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //    9   15:i2l             
    //   10   16:lstore          4
    //   11   18:aload_3         
    //   12   19:iconst_2        
    //   13   20:iconst_0        
    //   14   21:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //   15   24:i2l             
    //   16   25:lstore          6
    //   17   27:aload_3         
    //   18   28:bipush          7
    //   19   30:iconst_0        
    //   20   31:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //   21   34:istore          8
    //   22   36:aload_2         
    //   23   37:ifnonnull       48
    //   24   40:new             #212 <Class ValueAnimator>
    //   25   43:dup             
    //   26   44:invokespecial   #213 <Method void ValueAnimator()>
    //   27   47:astore_2        
    //   28   48:iload           8
    //   29   50:ifne            322
    //   30   53:iconst_1        
    //   31   54:istore          9
    //   32   56:aload_3         
    //   33   57:iconst_5        
    //   34   58:invokevirtual   #217 <Method TypedValue TypedArray.peekValue(int)>
    //   35   61:astore          10
    //   36   63:aload           10
    //   37   65:ifnull          328
    //   38   68:iconst_1        
    //   39   69:istore          11
    //   40   71:iload           11
    //   41   73:ifeq            334
    //   42   76:aload           10
    //   43   78:getfield        #144 <Field int TypedValue.type>
    //   44   81:istore          12
    //   45   83:aload_3         
    //   46   84:bipush          6
    //   47   86:invokevirtual   #217 <Method TypedValue TypedArray.peekValue(int)>
    //   48   89:astore          13
    //   49   91:aload           13
    //   50   93:ifnull          340
    //   51   96:iconst_1        
    //   52   97:istore          14
    //   53   99:iload           14
    //   54  101:ifeq            346
    //   55  104:aload           13
    //   56  106:getfield        #144 <Field int TypedValue.type>
    //   57  109:istore          15
    //   58  111:iload           11
    //   59  113:ifeq            130
    //   60  116:iload           12
    //   61  118:bipush          28
    //   62  120:icmplt          130
    //   63  123:iload           12
    //   64  125:bipush          31
    //   65  127:icmple          149
    //   66  130:iload           14
    //   67  132:ifeq            167
    //   68  135:iload           15
    //   69  137:bipush          28
    //   70  139:icmplt          167
    //   71  142:iload           15
    //   72  144:bipush          31
    //   73  146:icmpgt          167
    //   74  149:iconst_0        
    //   75  150:istore          9
    //   76  152:new             #219 <Class ArgbEvaluator>
    //   77  155:dup             
    //   78  156:invokespecial   #220 <Method void ArgbEvaluator()>
    //   79  159:astore          33
    //   80  161:aload_2         
    //   81  162:aload           33
    //   82  164:invokevirtual   #224 <Method void ValueAnimator.setEvaluator(TypeEvaluator)>
    //   83  167:iload           9
    //   84  169:ifeq            440
    //   85  172:iload           11
    //   86  174:ifeq            394
    //   87  177:iload           12
    //   88  179:iconst_5        
    //   89  180:icmpne          352
    //   90  183:aload_3         
    //   91  184:iconst_5        
    //   92  185:fconst_0        
    //   93  186:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //   94  189:fstore          29
    //   95  191:iload           14
    //   96  193:ifeq            375
    //   97  196:iload           15
    //   98  198:iconst_5        
    //   99  199:icmpne          363
    //  100  202:aload_3         
    //  101  203:bipush          6
    //  102  205:fconst_0        
    //  103  206:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //  104  209:fstore          31
    //  105  211:iconst_2        
    //  106  212:newarray        float[]
    //  107  214:dup             
    //  108  215:iconst_0        
    //  109  216:fload           29
    //  110  218:fastore         
    //  111  219:dup             
    //  112  220:iconst_1        
    //  113  221:fload           31
    //  114  223:fastore         
    //  115  224:astore          32
    //  116  226:aload_2         
    //  117  227:aload           32
    //  118  229:invokevirtual   #232 <Method void ValueAnimator.setFloatValues(float[])>
    //  119  232:aload_2         
    //  120  233:lload           4
    //  121  235:invokevirtual   #236 <Method ValueAnimator ValueAnimator.setDuration(long)>
    //  122  238:pop             
    //  123  239:aload_2         
    //  124  240:lload           6
    //  125  242:invokevirtual   #240 <Method void ValueAnimator.setStartDelay(long)>
    //  126  245:aload_3         
    //  127  246:iconst_3        
    //  128  247:invokevirtual   #244 <Method boolean TypedArray.hasValue(int)>
    //  129  250:ifeq            267
    //  130  253:aload_3         
    //  131  254:iconst_3        
    //  132  255:iconst_0        
    //  133  256:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //  134  259:istore          22
    //  135  261:aload_2         
    //  136  262:iload           22
    //  137  264:invokevirtual   #248 <Method void ValueAnimator.setRepeatCount(int)>
    //  138  267:aload_3         
    //  139  268:iconst_4        
    //  140  269:invokevirtual   #244 <Method boolean TypedArray.hasValue(int)>
    //  141  272:ifeq            289
    //  142  275:aload_3         
    //  143  276:iconst_4        
    //  144  277:iconst_1        
    //  145  278:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //  146  281:istore          21
    //  147  283:aload_2         
    //  148  284:iload           21
    //  149  286:invokevirtual   #251 <Method void ValueAnimator.setRepeatMode(int)>
    //  150  289:aload_3         
    //  151  290:iconst_0        
    //  152  291:iconst_0        
    //  153  292:invokevirtual   #254 <Method int TypedArray.getResourceId(int, int)>
    //  154  295:istore          19
    //  155  297:iload           19
    //  156  299:ifle            316
    //  157  302:aload_0         
    //  158  303:iload           19
    //  159  305:invokestatic    #260 <Method android.view.animation.Interpolator AnimationUtils.loadInterpolator(Context, int)>
    //  160  308:astore          20
    //  161  310:aload_2         
    //  162  311:aload           20
    //  163  313:invokevirtual   #264 <Method void ValueAnimator.setInterpolator(android.view.animation.Interpolator)>
    //  164  316:aload_3         
    //  165  317:invokevirtual   #150 <Method void TypedArray.recycle()>
    //  166  320:aload_2         
    //  167  321:areturn         
    //  168  322:iconst_0        
    //  169  323:istore          9
    //  170  325:goto            56
    //  171  328:iconst_0        
    //  172  329:istore          11
    //  173  331:goto            71
    //  174  334:iconst_0        
    //  175  335:istore          12
    //  176  337:goto            83
    //  177  340:iconst_0        
    //  178  341:istore          14
    //  179  343:goto            99
    //  180  346:iconst_0        
    //  181  347:istore          15
    //  182  349:goto            111
    //  183  352:aload_3         
    //  184  353:iconst_5        
    //  185  354:fconst_0        
    //  186  355:invokevirtual   #267 <Method float TypedArray.getFloat(int, float)>
    //  187  358:fstore          29
    //  188  360:goto            191
    //  189  363:aload_3         
    //  190  364:bipush          6
    //  191  366:fconst_0        
    //  192  367:invokevirtual   #267 <Method float TypedArray.getFloat(int, float)>
    //  193  370:fstore          31
    //  194  372:goto            211
    //  195  375:iconst_1        
    //  196  376:newarray        float[]
    //  197  378:dup             
    //  198  379:iconst_0        
    //  199  380:fload           29
    //  200  382:fastore         
    //  201  383:astore          30
    //  202  385:aload_2         
    //  203  386:aload           30
    //  204  388:invokevirtual   #232 <Method void ValueAnimator.setFloatValues(float[])>
    //  205  391:goto            232
    //  206  394:iload           15
    //  207  396:iconst_5        
    //  208  397:icmpne          428
    //  209  400:aload_3         
    //  210  401:bipush          6
    //  211  403:fconst_0        
    //  212  404:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //  213  407:fstore          27
    //  214  409:iconst_1        
    //  215  410:newarray        float[]
    //  216  412:dup             
    //  217  413:iconst_0        
    //  218  414:fload           27
    //  219  416:fastore         
    //  220  417:astore          28
    //  221  419:aload_2         
    //  222  420:aload           28
    //  223  422:invokevirtual   #232 <Method void ValueAnimator.setFloatValues(float[])>
    //  224  425:goto            232
    //  225  428:aload_3         
    //  226  429:bipush          6
    //  227  431:fconst_0        
    //  228  432:invokevirtual   #267 <Method float TypedArray.getFloat(int, float)>
    //  229  435:fstore          27
    //  230  437:goto            409
    //  231  440:iload           11
    //  232  442:ifeq            598
    //  233  445:iload           12
    //  234  447:iconst_5        
    //  235  448:icmpne          505
    //  236  451:aload_3         
    //  237  452:iconst_5        
    //  238  453:fconst_0        
    //  239  454:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //  240  457:f2i             
    //  241  458:istore          23
    //  242  460:iload           14
    //  243  462:ifeq            579
    //  244  465:iload           15
    //  245  467:iconst_5        
    //  246  468:icmpne          541
    //  247  471:aload_3         
    //  248  472:bipush          6
    //  249  474:fconst_0        
    //  250  475:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //  251  478:f2i             
    //  252  479:istore          25
    //  253  481:iconst_2        
    //  254  482:newarray        int[]
    //  255  484:dup             
    //  256  485:iconst_0        
    //  257  486:iload           23
    //  258  488:iastore         
    //  259  489:dup             
    //  260  490:iconst_1        
    //  261  491:iload           25
    //  262  493:iastore         
    //  263  494:astore          26
    //  264  496:aload_2         
    //  265  497:aload           26
    //  266  499:invokevirtual   #271 <Method void ValueAnimator.setIntValues(int[])>
    //  267  502:goto            232
    //  268  505:iload           12
    //  269  507:bipush          28
    //  270  509:icmplt          530
    //  271  512:iload           12
    //  272  514:bipush          31
    //  273  516:icmpgt          530
    //  274  519:aload_3         
    //  275  520:iconst_5        
    //  276  521:iconst_0        
    //  277  522:invokevirtual   #274 <Method int TypedArray.getColor(int, int)>
    //  278  525:istore          23
    //  279  527:goto            460
    //  280  530:aload_3         
    //  281  531:iconst_5        
    //  282  532:iconst_0        
    //  283  533:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //  284  536:istore          23
    //  285  538:goto            460
    //  286  541:iload           15
    //  287  543:bipush          28
    //  288  545:icmplt          567
    //  289  548:iload           15
    //  290  550:bipush          31
    //  291  552:icmpgt          567
    //  292  555:aload_3         
    //  293  556:bipush          6
    //  294  558:iconst_0        
    //  295  559:invokevirtual   #274 <Method int TypedArray.getColor(int, int)>
    //  296  562:istore          25
    //  297  564:goto            481
    //  298  567:aload_3         
    //  299  568:bipush          6
    //  300  570:iconst_0        
    //  301  571:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //  302  574:istore          25
    //  303  576:goto            481
    //  304  579:iconst_1        
    //  305  580:newarray        int[]
    //  306  582:dup             
    //  307  583:iconst_0        
    //  308  584:iload           23
    //  309  586:iastore         
    //  310  587:astore          24
    //  311  589:aload_2         
    //  312  590:aload           24
    //  313  592:invokevirtual   #271 <Method void ValueAnimator.setIntValues(int[])>
    //  314  595:goto            232
    //  315  598:iload           14
    //  316  600:ifeq            232
    //  317  603:iload           15
    //  318  605:iconst_5        
    //  319  606:icmpne          638
    //  320  609:aload_3         
    //  321  610:bipush          6
    //  322  612:fconst_0        
    //  323  613:invokevirtual   #228 <Method float TypedArray.getDimension(int, float)>
    //  324  616:f2i             
    //  325  617:istore          16
    //  326  619:iconst_1        
    //  327  620:newarray        int[]
    //  328  622:dup             
    //  329  623:iconst_0        
    //  330  624:iload           16
    //  331  626:iastore         
    //  332  627:astore          17
    //  333  629:aload_2         
    //  334  630:aload           17
    //  335  632:invokevirtual   #271 <Method void ValueAnimator.setIntValues(int[])>
    //  336  635:goto            232
    //  337  638:iload           15
    //  338  640:bipush          28
    //  339  642:icmplt          664
    //  340  645:iload           15
    //  341  647:bipush          31
    //  342  649:icmpgt          664
    //  343  652:aload_3         
    //  344  653:bipush          6
    //  345  655:iconst_0        
    //  346  656:invokevirtual   #274 <Method int TypedArray.getColor(int, int)>
    //  347  659:istore          16
    //  348  661:goto            619
    //  349  664:aload_3         
    //  350  665:bipush          6
    //  351  667:iconst_0        
    //  352  668:invokevirtual   #210 <Method int TypedArray.getInt(int, int)>
    //  353  671:istore          16
    //  354  673:goto            619
    }

    private static ObjectAnimator loadObjectAnimator(Context context, AttributeSet attributeset)
        throws android.content.res.Resources.NotFoundException
    {
    //    0    0:new             #276 <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #277 <Method void ObjectAnimator()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:aload_2         
    //    7   11:invokestatic    #123 <Method ValueAnimator loadAnimator(Context, AttributeSet, ValueAnimator)>
    //    8   14:pop             
    //    9   15:aload_0         
    //   10   16:aload_1         
    //   11   17:getstatic       #37  <Field int[] PropertyAnimator>
    //   12   20:invokevirtual   #132 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   13   23:astore          4
    //   14   25:aload_2         
    //   15   26:aload           4
    //   16   28:iconst_0        
    //   17   29:invokevirtual   #280 <Method String TypedArray.getString(int)>
    //   18   32:invokevirtual   #283 <Method void ObjectAnimator.setPropertyName(String)>
    //   19   35:aload           4
    //   20   37:invokevirtual   #150 <Method void TypedArray.recycle()>
    //   21   40:aload_2         
    //   22   41:areturn         
    }

    private static final int Animator[];
    private static final int AnimatorSet[];
    private static final int AnimatorSet_ordering = 0;
    private static final int Animator_duration = 1;
    private static final int Animator_interpolator = 0;
    private static final int Animator_repeatCount = 3;
    private static final int Animator_repeatMode = 4;
    private static final int Animator_startOffset = 2;
    private static final int Animator_valueFrom = 5;
    private static final int Animator_valueTo = 6;
    private static final int Animator_valueType = 7;
    private static final int PropertyAnimator[];
    private static final int PropertyAnimator_propertyName;
    private static final int TOGETHER;
    private static final int VALUE_TYPE_FLOAT;
}
