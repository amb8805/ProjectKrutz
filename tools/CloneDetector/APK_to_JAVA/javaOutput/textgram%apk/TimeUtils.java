// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils
{

    static 
    {
    //    0    0:new             #4   <Class Object>
    //    1    3:dup             
    //    2    4:invokespecial   #22  <Method void Object()>
    //    3    7:putstatic       #24  <Field Object sFormatSync>
    //    4   10:bipush          24
    //    5   12:newarray        char[]
    //    6   14:putstatic       #26  <Field char[] sFormatStr>
    //    7   17:return          
    }

    public TimeUtils()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void Object()>
    //    2    4:return          
    }

    private static int accumField(int i, int j, boolean flag, int k)
    {
    //    0    0:iload_0         
    //    1    1:bipush          99
    //    2    3:icmpgt          15
    //    3    6:iload_2         
    //    4    7:ifeq            19
    //    5   10:iload_3         
    //    6   11:iconst_3        
    //    7   12:icmplt          19
    //    8   15:iload_1         
    //    9   16:iconst_3        
    //   10   17:iadd            
    //   11   18:ireturn         
    //   12   19:iload_0         
    //   13   20:bipush          9
    //   14   22:icmpgt          34
    //   15   25:iload_2         
    //   16   26:ifeq            38
    //   17   29:iload_3         
    //   18   30:iconst_2        
    //   19   31:icmplt          38
    //   20   34:iload_1         
    //   21   35:iconst_2        
    //   22   36:iadd            
    //   23   37:ireturn         
    //   24   38:iload_2         
    //   25   39:ifne            46
    //   26   42:iload_0         
    //   27   43:ifle            50
    //   28   46:iload_1         
    //   29   47:iconst_1        
    //   30   48:iadd            
    //   31   49:ireturn         
    //   32   50:iconst_0        
    //   33   51:ireturn         
    }

    public static void formatDuration(long l, long l1, PrintWriter printwriter)
    {
    //    0    0:lload_0         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifne            14
    //    4    6:aload           4
    //    5    8:ldc1            #32  <String "--">
    //    6   10:invokevirtual   #38  <Method void PrintWriter.print(String)>
    //    7   13:return          
    //    8   14:lload_0         
    //    9   15:lload_2         
    //   10   16:lsub            
    //   11   17:aload           4
    //   12   19:iconst_0        
    //   13   20:invokestatic    #41  <Method void formatDuration(long, PrintWriter, int)>
    //   14   23:return          
    }

    public static void formatDuration(long l, PrintWriter printwriter)
    {
    //    0    0:lload_0         
    //    1    1:aload_2         
    //    2    2:iconst_0        
    //    3    3:invokestatic    #41  <Method void formatDuration(long, PrintWriter, int)>
    //    4    6:return          
    }

    public static void formatDuration(long l, PrintWriter printwriter, int i)
    {
    //    0    0:getstatic       #24  <Field Object sFormatSync>
    //    1    3:astore          4
    //    2    5:aload           4
    //    3    7:monitorenter    
    // try 8 35 handler(s) 36
    //    4    8:lload_0         
    //    5    9:iload_3         
    //    6   10:invokestatic    #46  <Method int formatDurationLocked(long, int)>
    //    7   13:istore          6
    //    8   15:aload_2         
    //    9   16:new             #48  <Class String>
    //   10   19:dup             
    //   11   20:getstatic       #26  <Field char[] sFormatStr>
    //   12   23:iconst_0        
    //   13   24:iload           6
    //   14   26:invokespecial   #51  <Method void String(char[], int, int)>
    //   15   29:invokevirtual   #38  <Method void PrintWriter.print(String)>
    //   16   32:aload           4
    //   17   34:monitorexit     
    //   18   35:return          
    // finally
    //   19   36:astore          5
    // try 38 41 handler(s) 36
    //   20   38:aload           4
    //   21   40:monitorexit     
    //   22   41:aload           5
    //   23   43:athrow          
    }

    public static void formatDuration(long l, StringBuilder stringbuilder)
    {
    //    0    0:getstatic       #24  <Field Object sFormatSync>
    //    1    3:astore_3        
    //    2    4:aload_3         
    //    3    5:monitorenter    
    // try 6 26 handler(s) 27
    //    4    6:lload_0         
    //    5    7:iconst_0        
    //    6    8:invokestatic    #46  <Method int formatDurationLocked(long, int)>
    //    7   11:istore          5
    //    8   13:aload_2         
    //    9   14:getstatic       #26  <Field char[] sFormatStr>
    //   10   17:iconst_0        
    //   11   18:iload           5
    //   12   20:invokevirtual   #58  <Method StringBuilder StringBuilder.append(char[], int, int)>
    //   13   23:pop             
    //   14   24:aload_3         
    //   15   25:monitorexit     
    //   16   26:return          
    // finally
    //   17   27:astore          4
    // try 29 31 handler(s) 27
    //   18   29:aload_3         
    //   19   30:monitorexit     
    //   20   31:aload           4
    //   21   33:athrow          
    }

    private static int formatDurationLocked(long l, int i)
    {
    //    0    0:getstatic       #26  <Field char[] sFormatStr>
    //    1    3:arraylength     
    //    2    4:iload_2         
    //    3    5:icmpge          14
    //    4    8:iload_2         
    //    5    9:newarray        char[]
    //    6   11:putstatic       #26  <Field char[] sFormatStr>
    //    7   14:getstatic       #26  <Field char[] sFormatStr>
    //    8   17:astore_3        
    //    9   18:lload_0         
    //   10   19:lconst_0        
    //   11   20:lcmp            
    //   12   21:ifne            49
    //   13   24:iload_2         
    //   14   25:iconst_1        
    //   15   26:isub            
    //   16   27:istore          37
    //   17   29:iload           37
    //   18   31:ifge            42
    //   19   34:aload_3         
    //   20   35:iconst_0        
    //   21   36:bipush          32
    //   22   38:castore         
    //   23   39:goto            29
    //   24   42:aload_3         
    //   25   43:iconst_0        
    //   26   44:bipush          48
    //   27   46:castore         
    //   28   47:iconst_1        
    //   29   48:ireturn         
    //   30   49:lload_0         
    //   31   50:lconst_0        
    //   32   51:lcmp            
    //   33   52:ifle            303
    //   34   55:bipush          43
    //   35   57:istore          4
    //   36   59:lload_0         
    //   37   60:ldc2w           #59  <Long 1000L>
    //   38   63:lrem            
    //   39   64:l2i             
    //   40   65:istore          5
    //   41   67:lload_0         
    //   42   68:ldc2w           #59  <Long 1000L>
    //   43   71:ldiv            
    //   44   72:l2d             
    //   45   73:invokestatic    #66  <Method double Math.floor(double)>
    //   46   76:d2i             
    //   47   77:istore          6
    //   48   79:iload           6
    //   49   81:istore          7
    //   50   83:iconst_0        
    //   51   84:istore          8
    //   52   86:iload           7
    //   53   88:ldc1            #9   <Int 0x15180>
    //   54   90:icmple          110
    //   55   93:iload           6
    //   56   95:ldc1            #9   <Int 0x15180>
    //   57   97:idiv            
    //   58   98:istore          8
    //   59  100:iload           6
    //   60  102:ldc1            #9   <Int 0x15180>
    //   61  104:iload           8
    //   62  106:imul            
    //   63  107:isub            
    //   64  108:istore          6
    //   65  110:iload           6
    //   66  112:istore          9
    //   67  114:iconst_0        
    //   68  115:istore          10
    //   69  117:iload           9
    //   70  119:sipush          3600
    //   71  122:icmple          144
    //   72  125:iload           6
    //   73  127:sipush          3600
    //   74  130:idiv            
    //   75  131:istore          10
    //   76  133:iload           6
    //   77  135:iload           10
    //   78  137:sipush          3600
    //   79  140:imul            
    //   80  141:isub            
    //   81  142:istore          6
    //   82  144:iload           6
    //   83  146:istore          11
    //   84  148:iconst_0        
    //   85  149:istore          12
    //   86  151:iload           11
    //   87  153:bipush          60
    //   88  155:icmple          175
    //   89  158:iload           6
    //   90  160:bipush          60
    //   91  162:idiv            
    //   92  163:istore          12
    //   93  165:iload           6
    //   94  167:iload           12
    //   95  169:bipush          60
    //   96  171:imul            
    //   97  172:isub            
    //   98  173:istore          6
    //   99  175:iconst_0        
    //  100  176:istore          13
    //  101  178:iload_2         
    //  102  179:ifeq            337
    //  103  182:iload           8
    //  104  184:iconst_1        
    //  105  185:iconst_0        
    //  106  186:iconst_0        
    //  107  187:invokestatic    #68  <Method int accumField(int, int, boolean, int)>
    //  108  190:istore          28
    //  109  192:iload           28
    //  110  194:ifle            313
    //  111  197:iconst_1        
    //  112  198:istore          29
    //  113  200:iload           28
    //  114  202:iload           10
    //  115  204:iconst_1        
    //  116  205:iload           29
    //  117  207:iconst_2        
    //  118  208:invokestatic    #68  <Method int accumField(int, int, boolean, int)>
    //  119  211:iadd            
    //  120  212:istore          30
    //  121  214:iload           30
    //  122  216:ifle            319
    //  123  219:iconst_1        
    //  124  220:istore          31
    //  125  222:iload           30
    //  126  224:iload           12
    //  127  226:iconst_1        
    //  128  227:iload           31
    //  129  229:iconst_2        
    //  130  230:invokestatic    #68  <Method int accumField(int, int, boolean, int)>
    //  131  233:iadd            
    //  132  234:istore          32
    //  133  236:iload           32
    //  134  238:ifle            325
    //  135  241:iconst_1        
    //  136  242:istore          33
    //  137  244:iload           32
    //  138  246:iload           6
    //  139  248:iconst_1        
    //  140  249:iload           33
    //  141  251:iconst_2        
    //  142  252:invokestatic    #68  <Method int accumField(int, int, boolean, int)>
    //  143  255:iadd            
    //  144  256:istore          34
    //  145  258:iload           34
    //  146  260:ifle            331
    //  147  263:iconst_3        
    //  148  264:istore          35
    //  149  266:iload           34
    //  150  268:iconst_1        
    //  151  269:iload           5
    //  152  271:iconst_2        
    //  153  272:iconst_1        
    //  154  273:iload           35
    //  155  275:invokestatic    #68  <Method int accumField(int, int, boolean, int)>
    //  156  278:iadd            
    //  157  279:iadd            
    //  158  280:istore          36
    //  159  282:iload           36
    //  160  284:iload_2         
    //  161  285:icmpge          337
    //  162  288:aload_3         
    //  163  289:iload           13
    //  164  291:bipush          32
    //  165  293:castore         
    //  166  294:iinc            13  1
    //  167  297:iinc            36  1
    //  168  300:goto            282
    //  169  303:bipush          45
    //  170  305:istore          4
    //  171  307:lload_0         
    //  172  308:lneg            
    //  173  309:lstore_0        
    //  174  310:goto            59
    //  175  313:iconst_0        
    //  176  314:istore          29
    //  177  316:goto            200
    //  178  319:iconst_0        
    //  179  320:istore          31
    //  180  322:goto            222
    //  181  325:iconst_0        
    //  182  326:istore          33
    //  183  328:goto            244
    //  184  331:iconst_0        
    //  185  332:istore          35
    //  186  334:goto            266
    //  187  337:aload_3         
    //  188  338:iload           13
    //  189  340:iload           4
    //  190  342:castore         
    //  191  343:iload           13
    //  192  345:iconst_1        
    //  193  346:iadd            
    //  194  347:istore          14
    //  195  349:iload_2         
    //  196  350:ifeq            513
    //  197  353:iconst_1        
    //  198  354:istore          15
    //  199  356:aload_3         
    //  200  357:iload           8
    //  201  359:bipush          100
    //  202  361:iload           14
    //  203  363:iconst_0        
    //  204  364:iconst_0        
    //  205  365:invokestatic    #72  <Method int printField(char[], int, char, int, boolean, int)>
    //  206  368:istore          16
    //  207  370:iload           16
    //  208  372:iload           14
    //  209  374:icmpeq          519
    //  210  377:iconst_1        
    //  211  378:istore          17
    //  212  380:iload           15
    //  213  382:ifeq            525
    //  214  385:iconst_2        
    //  215  386:istore          18
    //  216  388:aload_3         
    //  217  389:iload           10
    //  218  391:bipush          104
    //  219  393:iload           16
    //  220  395:iload           17
    //  221  397:iload           18
    //  222  399:invokestatic    #72  <Method int printField(char[], int, char, int, boolean, int)>
    //  223  402:istore          19
    //  224  404:iload           19
    //  225  406:iload           14
    //  226  408:icmpeq          531
    //  227  411:iconst_1        
    //  228  412:istore          20
    //  229  414:iload           15
    //  230  416:ifeq            537
    //  231  419:iconst_2        
    //  232  420:istore          21
    //  233  422:aload_3         
    //  234  423:iload           12
    //  235  425:bipush          109
    //  236  427:iload           19
    //  237  429:iload           20
    //  238  431:iload           21
    //  239  433:invokestatic    #72  <Method int printField(char[], int, char, int, boolean, int)>
    //  240  436:istore          22
    //  241  438:iload           22
    //  242  440:iload           14
    //  243  442:icmpeq          543
    //  244  445:iconst_1        
    //  245  446:istore          23
    //  246  448:iload           15
    //  247  450:ifeq            549
    //  248  453:iconst_2        
    //  249  454:istore          24
    //  250  456:aload_3         
    //  251  457:iload           6
    //  252  459:bipush          115
    //  253  461:iload           22
    //  254  463:iload           23
    //  255  465:iload           24
    //  256  467:invokestatic    #72  <Method int printField(char[], int, char, int, boolean, int)>
    //  257  470:istore          25
    //  258  472:iload           15
    //  259  474:ifeq            555
    //  260  477:iload           25
    //  261  479:iload           14
    //  262  481:icmpeq          555
    //  263  484:iconst_3        
    //  264  485:istore          26
    //  265  487:aload_3         
    //  266  488:iload           5
    //  267  490:bipush          109
    //  268  492:iload           25
    //  269  494:iconst_1        
    //  270  495:iload           26
    //  271  497:invokestatic    #72  <Method int printField(char[], int, char, int, boolean, int)>
    //  272  500:istore          27
    //  273  502:aload_3         
    //  274  503:iload           27
    //  275  505:bipush          115
    //  276  507:castore         
    //  277  508:iload           27
    //  278  510:iconst_1        
    //  279  511:iadd            
    //  280  512:ireturn         
    //  281  513:iconst_0        
    //  282  514:istore          15
    //  283  516:goto            356
    //  284  519:iconst_0        
    //  285  520:istore          17
    //  286  522:goto            380
    //  287  525:iconst_0        
    //  288  526:istore          18
    //  289  528:goto            388
    //  290  531:iconst_0        
    //  291  532:istore          20
    //  292  534:goto            414
    //  293  537:iconst_0        
    //  294  538:istore          21
    //  295  540:goto            422
    //  296  543:iconst_0        
    //  297  544:istore          23
    //  298  546:goto            448
    //  299  549:iconst_0        
    //  300  550:istore          24
    //  301  552:goto            456
    //  302  555:iconst_0        
    //  303  556:istore          26
    //  304  558:goto            487
    }

    private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
    {
    //    0    0:iload           4
    //    1    2:ifne            9
    //    2    5:iload_1         
    //    3    6:ifle            127
    //    4    9:iload_3         
    //    5   10:istore          6
    //    6   12:iload           4
    //    7   14:ifeq            23
    //    8   17:iload           5
    //    9   19:iconst_3        
    //   10   20:icmpge          29
    //   11   23:iload_1         
    //   12   24:bipush          99
    //   13   26:icmple          55
    //   14   29:iload_1         
    //   15   30:bipush          100
    //   16   32:idiv            
    //   17   33:istore          9
    //   18   35:aload_0         
    //   19   36:iload_3         
    //   20   37:iload           9
    //   21   39:bipush          48
    //   22   41:iadd            
    //   23   42:int2char        
    //   24   43:castore         
    //   25   44:iinc            3  1
    //   26   47:iload_1         
    //   27   48:iload           9
    //   28   50:bipush          100
    //   29   52:imul            
    //   30   53:isub            
    //   31   54:istore_1        
    //   32   55:iload           4
    //   33   57:ifeq            66
    //   34   60:iload           5
    //   35   62:iconst_2        
    //   36   63:icmpge          78
    //   37   66:iload_1         
    //   38   67:bipush          9
    //   39   69:icmpgt          78
    //   40   72:iload           6
    //   41   74:iload_3         
    //   42   75:icmpeq          104
    //   43   78:iload_1         
    //   44   79:bipush          10
    //   45   81:idiv            
    //   46   82:istore          7
    //   47   84:aload_0         
    //   48   85:iload_3         
    //   49   86:iload           7
    //   50   88:bipush          48
    //   51   90:iadd            
    //   52   91:int2char        
    //   53   92:castore         
    //   54   93:iinc            3  1
    //   55   96:iload_1         
    //   56   97:iload           7
    //   57   99:bipush          10
    //   58  101:imul            
    //   59  102:isub            
    //   60  103:istore_1        
    //   61  104:aload_0         
    //   62  105:iload_3         
    //   63  106:iload_1         
    //   64  107:bipush          48
    //   65  109:iadd            
    //   66  110:int2char        
    //   67  111:castore         
    //   68  112:iload_3         
    //   69  113:iconst_1        
    //   70  114:iadd            
    //   71  115:istore          8
    //   72  117:aload_0         
    //   73  118:iload           8
    //   74  120:iload_2         
    //   75  121:castore         
    //   76  122:iload           8
    //   77  124:iconst_1        
    //   78  125:iadd            
    //   79  126:istore_3        
    //   80  127:iload_3         
    //   81  128:ireturn         
    }

    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 0x15180;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char sFormatStr[];
    private static final Object sFormatSync;
}
