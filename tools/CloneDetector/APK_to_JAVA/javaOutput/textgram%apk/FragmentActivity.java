// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.*;
import android.os.*;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, LoaderManagerImpl, Fragment, ActivityCompatHoneycomb, 
//            FragmentContainer, FragmentManager, LoaderManager

public class FragmentActivity extends Activity
{
    static class FragmentTag
    {

        static 
        {
        //    0    0:iconst_3        
        //    1    1:newarray        int[]
        //    2    3:dup             
        //    3    4:iconst_0        
        //    4    5:ldc1            #16  <Int 0x1010003>
        //    5    7:iastore         
        //    6    8:dup             
        //    7    9:iconst_1        
        //    8   10:ldc1            #17  <Int 0x10100d0>
        //    9   12:iastore         
        //   10   13:dup             
        //   11   14:iconst_2        
        //   12   15:ldc1            #18  <Int 0x10100d1>
        //   13   17:iastore         
        //   14   18:putstatic       #20  <Field int[] Fragment>
        //   15   21:return          
        }

        FragmentTag()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #23  <Method void Object()>
        //    2    4:return          
        }

        public static final int Fragment[];
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;
    }

    static final class NonConfigurationInstances
    {

        NonConfigurationInstances()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #19  <Method void Object()>
        //    2    4:return          
        }

        Object activity;
        SimpleArrayMap children;
        Object custom;
        ArrayList fragments;
        SimpleArrayMap loaders;
    }


    public FragmentActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void Activity()>
    //    2    4:aload_0         
    //    3    5:new             #44  <Class FragmentActivity$1>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:invokespecial   #47  <Method void FragmentActivity$1(FragmentActivity)>
    //    7   13:putfield        #49  <Field Handler mHandler>
    //    8   16:aload_0         
    //    9   17:new             #51  <Class FragmentManagerImpl>
    //   10   20:dup             
    //   11   21:invokespecial   #52  <Method void FragmentManagerImpl()>
    //   12   24:putfield        #54  <Field FragmentManagerImpl mFragments>
    //   13   27:aload_0         
    //   14   28:new             #56  <Class FragmentActivity$2>
    //   15   31:dup             
    //   16   32:aload_0         
    //   17   33:invokespecial   #57  <Method void FragmentActivity$2(FragmentActivity)>
    //   18   36:putfield        #59  <Field FragmentContainer mContainer>
    //   19   39:return          
    }

    private void dumpViewHierarchy(String s, PrintWriter printwriter, View view)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //    3    5:aload_3         
    //    4    6:ifnonnull       16
    //    5    9:aload_2         
    //    6   10:ldc1            #69  <String "null">
    //    7   12:invokevirtual   #72  <Method void PrintWriter.println(String)>
    //    8   15:return          
    //    9   16:aload_2         
    //   10   17:aload_3         
    //   11   18:invokestatic    #76  <Method String viewToString(View)>
    //   12   21:invokevirtual   #72  <Method void PrintWriter.println(String)>
    //   13   24:aload_3         
    //   14   25:instanceof      #78  <Class ViewGroup>
    //   15   28:ifeq            15
    //   16   31:aload_3         
    //   17   32:checkcast       #78  <Class ViewGroup>
    //   18   35:astore          4
    //   19   37:aload           4
    //   20   39:invokevirtual   #82  <Method int ViewGroup.getChildCount()>
    //   21   42:istore          5
    //   22   44:iload           5
    //   23   46:ifle            15
    //   24   49:new             #84  <Class StringBuilder>
    //   25   52:dup             
    //   26   53:invokespecial   #85  <Method void StringBuilder()>
    //   27   56:aload_1         
    //   28   57:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   29   60:ldc1            #91  <String "  ">
    //   30   62:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   31   65:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   32   68:astore          6
    //   33   70:iconst_0        
    //   34   71:istore          7
    //   35   73:iload           7
    //   36   75:iload           5
    //   37   77:icmpge          15
    //   38   80:aload_0         
    //   39   81:aload           6
    //   40   83:aload_2         
    //   41   84:aload           4
    //   42   86:iload           7
    //   43   88:invokevirtual   #99  <Method View ViewGroup.getChildAt(int)>
    //   44   91:invokespecial   #101 <Method void dumpViewHierarchy(String, PrintWriter, View)>
    //   45   94:iinc            7  1
    //   46   97:goto            73
    }

    private static String viewToString(View view)
    {
    //    0    0:bipush          70
    //    1    2:istore_1        
    //    2    3:bipush          46
    //    3    5:istore_2        
    //    4    6:new             #84  <Class StringBuilder>
    //    5    9:dup             
    //    6   10:sipush          128
    //    7   13:invokespecial   #106 <Method void StringBuilder(int)>
    //    8   16:astore_3        
    //    9   17:aload_3         
    //   10   18:aload_0         
    //   11   19:invokevirtual   #112 <Method Class Object.getClass()>
    //   12   22:invokevirtual   #117 <Method String Class.getName()>
    //   13   25:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   14   28:pop             
    //   15   29:aload_3         
    //   16   30:bipush          123
    //   17   32:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   18   35:pop             
    //   19   36:aload_3         
    //   20   37:aload_0         
    //   21   38:invokestatic    #126 <Method int System.identityHashCode(Object)>
    //   22   41:invokestatic    #132 <Method String Integer.toHexString(int)>
    //   23   44:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   24   47:pop             
    //   25   48:aload_3         
    //   26   49:bipush          32
    //   27   51:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   28   54:pop             
    //   29   55:aload_0         
    //   30   56:invokevirtual   #137 <Method int View.getVisibility()>
    //   31   59:lookupswitch    3: default 92
    //                   0: 497
    //                   4: 507
    //                   8: 517
    //   32   92:aload_3         
    //   33   93:iload_2         
    //   34   94:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   35   97:pop             
    //   36   98:aload_0         
    //   37   99:invokevirtual   #141 <Method boolean View.isFocusable()>
    //   38  102:ifeq            527
    //   39  105:iload_1         
    //   40  106:istore          9
    //   41  108:aload_3         
    //   42  109:iload           9
    //   43  111:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   44  114:pop             
    //   45  115:aload_0         
    //   46  116:invokevirtual   #144 <Method boolean View.isEnabled()>
    //   47  119:ifeq            533
    //   48  122:bipush          69
    //   49  124:istore          11
    //   50  126:aload_3         
    //   51  127:iload           11
    //   52  129:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   53  132:pop             
    //   54  133:aload_0         
    //   55  134:invokevirtual   #147 <Method boolean View.willNotDraw()>
    //   56  137:ifeq            539
    //   57  140:iload_2         
    //   58  141:istore          13
    //   59  143:aload_3         
    //   60  144:iload           13
    //   61  146:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   62  149:pop             
    //   63  150:aload_0         
    //   64  151:invokevirtual   #150 <Method boolean View.isHorizontalScrollBarEnabled()>
    //   65  154:ifeq            546
    //   66  157:bipush          72
    //   67  159:istore          15
    //   68  161:aload_3         
    //   69  162:iload           15
    //   70  164:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   71  167:pop             
    //   72  168:aload_0         
    //   73  169:invokevirtual   #153 <Method boolean View.isVerticalScrollBarEnabled()>
    //   74  172:ifeq            552
    //   75  175:bipush          86
    //   76  177:istore          17
    //   77  179:aload_3         
    //   78  180:iload           17
    //   79  182:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   80  185:pop             
    //   81  186:aload_0         
    //   82  187:invokevirtual   #156 <Method boolean View.isClickable()>
    //   83  190:ifeq            558
    //   84  193:bipush          67
    //   85  195:istore          19
    //   86  197:aload_3         
    //   87  198:iload           19
    //   88  200:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   89  203:pop             
    //   90  204:aload_0         
    //   91  205:invokevirtual   #159 <Method boolean View.isLongClickable()>
    //   92  208:ifeq            564
    //   93  211:bipush          76
    //   94  213:istore          21
    //   95  215:aload_3         
    //   96  216:iload           21
    //   97  218:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //   98  221:pop             
    //   99  222:aload_3         
    //  100  223:bipush          32
    //  101  225:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  102  228:pop             
    //  103  229:aload_0         
    //  104  230:invokevirtual   #162 <Method boolean View.isFocused()>
    //  105  233:ifeq            570
    //  106  236:aload_3         
    //  107  237:iload_1         
    //  108  238:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  109  241:pop             
    //  110  242:aload_0         
    //  111  243:invokevirtual   #165 <Method boolean View.isSelected()>
    //  112  246:ifeq            575
    //  113  249:bipush          83
    //  114  251:istore          25
    //  115  253:aload_3         
    //  116  254:iload           25
    //  117  256:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  118  259:pop             
    //  119  260:aload_0         
    //  120  261:invokevirtual   #168 <Method boolean View.isPressed()>
    //  121  264:ifeq            270
    //  122  267:bipush          80
    //  123  269:istore_2        
    //  124  270:aload_3         
    //  125  271:iload_2         
    //  126  272:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  127  275:pop             
    //  128  276:aload_3         
    //  129  277:bipush          32
    //  130  279:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  131  282:pop             
    //  132  283:aload_3         
    //  133  284:aload_0         
    //  134  285:invokevirtual   #171 <Method int View.getLeft()>
    //  135  288:invokevirtual   #174 <Method StringBuilder StringBuilder.append(int)>
    //  136  291:pop             
    //  137  292:aload_3         
    //  138  293:bipush          44
    //  139  295:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  140  298:pop             
    //  141  299:aload_3         
    //  142  300:aload_0         
    //  143  301:invokevirtual   #177 <Method int View.getTop()>
    //  144  304:invokevirtual   #174 <Method StringBuilder StringBuilder.append(int)>
    //  145  307:pop             
    //  146  308:aload_3         
    //  147  309:bipush          45
    //  148  311:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  149  314:pop             
    //  150  315:aload_3         
    //  151  316:aload_0         
    //  152  317:invokevirtual   #180 <Method int View.getRight()>
    //  153  320:invokevirtual   #174 <Method StringBuilder StringBuilder.append(int)>
    //  154  323:pop             
    //  155  324:aload_3         
    //  156  325:bipush          44
    //  157  327:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  158  330:pop             
    //  159  331:aload_3         
    //  160  332:aload_0         
    //  161  333:invokevirtual   #183 <Method int View.getBottom()>
    //  162  336:invokevirtual   #174 <Method StringBuilder StringBuilder.append(int)>
    //  163  339:pop             
    //  164  340:aload_0         
    //  165  341:invokevirtual   #186 <Method int View.getId()>
    //  166  344:istore          36
    //  167  346:iload           36
    //  168  348:iconst_m1       
    //  169  349:icmpeq          485
    //  170  352:aload_3         
    //  171  353:ldc1            #188 <String " #">
    //  172  355:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  173  358:pop             
    //  174  359:aload_3         
    //  175  360:iload           36
    //  176  362:invokestatic    #132 <Method String Integer.toHexString(int)>
    //  177  365:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  178  368:pop             
    //  179  369:aload_0         
    //  180  370:invokevirtual   #192 <Method Resources View.getResources()>
    //  181  373:astore          40
    //  182  375:iload           36
    //  183  377:ifeq            485
    //  184  380:aload           40
    //  185  382:ifnull          485
    //  186  385:ldc1            #193 <Int 0xff000000>
    //  187  387:iload           36
    //  188  389:iand            
    //  189  390:lookupswitch    2: default 416
    //                   16777216: 588
    //                   2130706432: 581
    // try 416 425 handler(s) 595
    //  190  416:aload           40
    //  191  418:iload           36
    //  192  420:invokevirtual   #198 <Method String Resources.getResourcePackageName(int)>
    //  193  423:astore          41
    // try 425 485 handler(s) 595
    //  194  425:aload           40
    //  195  427:iload           36
    //  196  429:invokevirtual   #201 <Method String Resources.getResourceTypeName(int)>
    //  197  432:astore          43
    //  198  434:aload           40
    //  199  436:iload           36
    //  200  438:invokevirtual   #204 <Method String Resources.getResourceEntryName(int)>
    //  201  441:astore          44
    //  202  443:aload_3         
    //  203  444:ldc1            #206 <String " ">
    //  204  446:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  205  449:pop             
    //  206  450:aload_3         
    //  207  451:aload           41
    //  208  453:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  209  456:pop             
    //  210  457:aload_3         
    //  211  458:ldc1            #208 <String ":">
    //  212  460:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  213  463:pop             
    //  214  464:aload_3         
    //  215  465:aload           43
    //  216  467:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  217  470:pop             
    //  218  471:aload_3         
    //  219  472:ldc1            #210 <String "/">
    //  220  474:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  221  477:pop             
    //  222  478:aload_3         
    //  223  479:aload           44
    //  224  481:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  225  484:pop             
    //  226  485:aload_3         
    //  227  486:ldc1            #212 <String "}">
    //  228  488:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  229  491:pop             
    //  230  492:aload_3         
    //  231  493:invokevirtual   #95  <Method String StringBuilder.toString()>
    //  232  496:areturn         
    //  233  497:aload_3         
    //  234  498:bipush          86
    //  235  500:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  236  503:pop             
    //  237  504:goto            98
    //  238  507:aload_3         
    //  239  508:bipush          73
    //  240  510:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  241  513:pop             
    //  242  514:goto            98
    //  243  517:aload_3         
    //  244  518:bipush          71
    //  245  520:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
    //  246  523:pop             
    //  247  524:goto            98
    //  248  527:iload_2         
    //  249  528:istore          9
    //  250  530:goto            108
    //  251  533:iload_2         
    //  252  534:istore          11
    //  253  536:goto            126
    //  254  539:bipush          68
    //  255  541:istore          13
    //  256  543:goto            143
    //  257  546:iload_2         
    //  258  547:istore          15
    //  259  549:goto            161
    //  260  552:iload_2         
    //  261  553:istore          17
    //  262  555:goto            179
    //  263  558:iload_2         
    //  264  559:istore          19
    //  265  561:goto            197
    //  266  564:iload_2         
    //  267  565:istore          21
    //  268  567:goto            215
    //  269  570:iload_2         
    //  270  571:istore_1        
    //  271  572:goto            236
    //  272  575:iload_2         
    //  273  576:istore          25
    //  274  578:goto            253
    //  275  581:ldc1            #214 <String "app">
    //  276  583:astore          41
    //  277  585:goto            425
    //  278  588:ldc1            #216 <String "android">
    //  279  590:astore          41
    //  280  592:goto            425
    // catch android.content.res.Resources.NotFoundException android.content.res.Resources.NotFoundException
    //  281  595:astore          42
    //  282  597:goto            485
    }

    void doReallyStop(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field boolean mReallyStopped>
    //    2    4:ifne            29
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #220 <Field boolean mReallyStopped>
    //    6   12:aload_0         
    //    7   13:iload_1         
    //    8   14:putfield        #222 <Field boolean mRetaining>
    //    9   17:aload_0         
    //   10   18:getfield        #49  <Field Handler mHandler>
    //   11   21:iconst_1        
    //   12   22:invokevirtual   #227 <Method void Handler.removeMessages(int)>
    //   13   25:aload_0         
    //   14   26:invokevirtual   #230 <Method void onReallyStop()>
    //   15   29:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:getstatic       #237 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          8
    //    3    8:aload_3         
    //    4    9:aload_1         
    //    5   10:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //    6   13:aload_3         
    //    7   14:ldc1            #239 <String "Local FragmentActivity ">
    //    8   16:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //    9   19:aload_3         
    //   10   20:aload_0         
    //   11   21:invokestatic    #126 <Method int System.identityHashCode(Object)>
    //   12   24:invokestatic    #132 <Method String Integer.toHexString(int)>
    //   13   27:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   14   30:aload_3         
    //   15   31:ldc1            #241 <String " State:">
    //   16   33:invokevirtual   #72  <Method void PrintWriter.println(String)>
    //   17   36:new             #84  <Class StringBuilder>
    //   18   39:dup             
    //   19   40:invokespecial   #85  <Method void StringBuilder()>
    //   20   43:aload_1         
    //   21   44:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   22   47:ldc1            #91  <String "  ">
    //   23   49:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   24   52:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   25   55:astore          5
    //   26   57:aload_3         
    //   27   58:aload           5
    //   28   60:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   29   63:aload_3         
    //   30   64:ldc1            #243 <String "mCreated=">
    //   31   66:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   32   69:aload_3         
    //   33   70:aload_0         
    //   34   71:getfield        #245 <Field boolean mCreated>
    //   35   74:invokevirtual   #247 <Method void PrintWriter.print(boolean)>
    //   36   77:aload_3         
    //   37   78:ldc1            #249 <String "mResumed=">
    //   38   80:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   39   83:aload_3         
    //   40   84:aload_0         
    //   41   85:getfield        #251 <Field boolean mResumed>
    //   42   88:invokevirtual   #247 <Method void PrintWriter.print(boolean)>
    //   43   91:aload_3         
    //   44   92:ldc1            #253 <String " mStopped=">
    //   45   94:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   46   97:aload_3         
    //   47   98:aload_0         
    //   48   99:getfield        #255 <Field boolean mStopped>
    //   49  102:invokevirtual   #247 <Method void PrintWriter.print(boolean)>
    //   50  105:aload_3         
    //   51  106:ldc2            #257 <String " mReallyStopped=">
    //   52  109:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   53  112:aload_3         
    //   54  113:aload_0         
    //   55  114:getfield        #220 <Field boolean mReallyStopped>
    //   56  117:invokevirtual   #259 <Method void PrintWriter.println(boolean)>
    //   57  120:aload_3         
    //   58  121:aload           5
    //   59  123:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   60  126:aload_3         
    //   61  127:ldc2            #261 <String "mLoadersStarted=">
    //   62  130:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   63  133:aload_3         
    //   64  134:aload_0         
    //   65  135:getfield        #263 <Field boolean mLoadersStarted>
    //   66  138:invokevirtual   #259 <Method void PrintWriter.println(boolean)>
    //   67  141:aload_0         
    //   68  142:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   69  145:ifnull          210
    //   70  148:aload_3         
    //   71  149:aload_1         
    //   72  150:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   73  153:aload_3         
    //   74  154:ldc2            #267 <String "Loader Manager ">
    //   75  157:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   76  160:aload_3         
    //   77  161:aload_0         
    //   78  162:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   79  165:invokestatic    #126 <Method int System.identityHashCode(Object)>
    //   80  168:invokestatic    #132 <Method String Integer.toHexString(int)>
    //   81  171:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //   82  174:aload_3         
    //   83  175:ldc1            #208 <String ":">
    //   84  177:invokevirtual   #72  <Method void PrintWriter.println(String)>
    //   85  180:aload_0         
    //   86  181:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   87  184:new             #84  <Class StringBuilder>
    //   88  187:dup             
    //   89  188:invokespecial   #85  <Method void StringBuilder()>
    //   90  191:aload_1         
    //   91  192:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   92  195:ldc1            #91  <String "  ">
    //   93  197:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   94  200:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   95  203:aload_2         
    //   96  204:aload_3         
    //   97  205:aload           4
    //   98  207:invokevirtual   #271 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
    //   99  210:aload_0         
    //  100  211:getfield        #54  <Field FragmentManagerImpl mFragments>
    //  101  214:aload_1         
    //  102  215:aload_2         
    //  103  216:aload_3         
    //  104  217:aload           4
    //  105  219:invokevirtual   #272 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
    //  106  222:aload_3         
    //  107  223:aload_1         
    //  108  224:invokevirtual   #67  <Method void PrintWriter.print(String)>
    //  109  227:aload_3         
    //  110  228:ldc2            #274 <String "View Hierarchy:">
    //  111  231:invokevirtual   #72  <Method void PrintWriter.println(String)>
    //  112  234:aload_0         
    //  113  235:new             #84  <Class StringBuilder>
    //  114  238:dup             
    //  115  239:invokespecial   #85  <Method void StringBuilder()>
    //  116  242:aload_1         
    //  117  243:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  118  246:ldc1            #91  <String "  ">
    //  119  248:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  120  251:invokevirtual   #95  <Method String StringBuilder.toString()>
    //  121  254:aload_3         
    //  122  255:aload_0         
    //  123  256:invokevirtual   #278 <Method Window getWindow()>
    //  124  259:invokevirtual   #284 <Method View Window.getDecorView()>
    //  125  262:invokespecial   #101 <Method void dumpViewHierarchy(String, PrintWriter, View)>
    //  126  265:return          
    }

    public Object getLastCustomNonConfigurationInstance()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #289 <Method Object getLastNonConfigurationInstance()>
    //    2    4:checkcast       #291 <Class FragmentActivity$NonConfigurationInstances>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnull          17
    //    6   12:aload_1         
    //    7   13:getfield        #295 <Field Object FragmentActivity$NonConfigurationInstances.custom>
    //    8   16:areturn         
    //    9   17:aconst_null     
    //   10   18:areturn         
    }

    LoaderManagerImpl getLoaderManager(String s, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #301 <Class SimpleArrayMap>
    //    5   11:dup             
    //    6   12:invokespecial   #302 <Method void SimpleArrayMap()>
    //    7   15:putfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //    8   18:aload_0         
    //    9   19:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   10   22:aload_1         
    //   11   23:invokevirtual   #306 <Method Object SimpleArrayMap.get(Object)>
    //   12   26:checkcast       #269 <Class LoaderManagerImpl>
    //   13   29:astore          4
    //   14   31:aload           4
    //   15   33:ifnonnull       66
    //   16   36:iload_3         
    //   17   37:ifeq            63
    //   18   40:new             #269 <Class LoaderManagerImpl>
    //   19   43:dup             
    //   20   44:aload_1         
    //   21   45:aload_0         
    //   22   46:iload_2         
    //   23   47:invokespecial   #309 <Method void LoaderManagerImpl(String, FragmentActivity, boolean)>
    //   24   50:astore          4
    //   25   52:aload_0         
    //   26   53:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   27   56:aload_1         
    //   28   57:aload           4
    //   29   59:invokevirtual   #313 <Method Object SimpleArrayMap.put(Object, Object)>
    //   30   62:pop             
    //   31   63:aload           4
    //   32   65:areturn         
    //   33   66:aload           4
    //   34   68:aload_0         
    //   35   69:invokevirtual   #316 <Method void LoaderManagerImpl.updateActivity(FragmentActivity)>
    //   36   72:aload           4
    //   37   74:areturn         
    }

    public FragmentManager getSupportFragmentManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    2    4:areturn         
    }

    public LoaderManager getSupportLoaderManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:putfield        #322 <Field boolean mCheckedForLoaderManager>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:ldc2            #324 <String "(root)">
    //   12   22:aload_0         
    //   13   23:getfield        #263 <Field boolean mLoadersStarted>
    //   14   26:iconst_1        
    //   15   27:invokevirtual   #326 <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
    //   16   30:putfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   17   33:aload_0         
    //   18   34:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   19   37:areturn         
    }

    void invalidateSupportFragment(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //    2    4:ifnull          43
    //    3    7:aload_0         
    //    4    8:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #306 <Method Object SimpleArrayMap.get(Object)>
    //    7   15:checkcast       #269 <Class LoaderManagerImpl>
    //    8   18:astore_2        
    //    9   19:aload_2         
    //   10   20:ifnull          43
    //   11   23:aload_2         
    //   12   24:getfield        #328 <Field boolean LoaderManagerImpl.mRetaining>
    //   13   27:ifne            43
    //   14   30:aload_2         
    //   15   31:invokevirtual   #331 <Method void LoaderManagerImpl.doDestroy()>
    //   16   34:aload_0         
    //   17   35:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   18   38:aload_1         
    //   19   39:invokevirtual   #334 <Method Object SimpleArrayMap.remove(Object)>
    //   20   42:pop             
    //   21   43:return          
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    2    4:invokevirtual   #339 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    3    7:iload_1         
    //    4    8:bipush          16
    //    5   10:ishr            
    //    6   11:istore          4
    //    7   13:iload           4
    //    8   15:ifeq            149
    //    9   18:iload           4
    //   10   20:iconst_1        
    //   11   21:isub            
    //   12   22:istore          5
    //   13   24:aload_0         
    //   14   25:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   15   28:getfield        #343 <Field ArrayList FragmentManagerImpl.mActive>
    //   16   31:ifnull          54
    //   17   34:iload           5
    //   18   36:iflt            54
    //   19   39:iload           5
    //   20   41:aload_0         
    //   21   42:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   22   45:getfield        #343 <Field ArrayList FragmentManagerImpl.mActive>
    //   23   48:invokevirtual   #348 <Method int ArrayList.size()>
    //   24   51:icmplt          84
    //   25   54:ldc1            #18  <String "FragmentActivity">
    //   26   56:new             #84  <Class StringBuilder>
    //   27   59:dup             
    //   28   60:invokespecial   #85  <Method void StringBuilder()>
    //   29   63:ldc2            #350 <String "Activity result fragment index out of range: 0x">
    //   30   66:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   31   69:iload_1         
    //   32   70:invokestatic    #132 <Method String Integer.toHexString(int)>
    //   33   73:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   34   76:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   35   79:invokestatic    #356 <Method int Log.w(String, String)>
    //   36   82:pop             
    //   37   83:return          
    //   38   84:aload_0         
    //   39   85:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   40   88:getfield        #343 <Field ArrayList FragmentManagerImpl.mActive>
    //   41   91:iload           5
    //   42   93:invokevirtual   #359 <Method Object ArrayList.get(int)>
    //   43   96:checkcast       #361 <Class Fragment>
    //   44   99:astore          7
    //   45  101:aload           7
    //   46  103:ifnonnull       136
    //   47  106:ldc1            #18  <String "FragmentActivity">
    //   48  108:new             #84  <Class StringBuilder>
    //   49  111:dup             
    //   50  112:invokespecial   #85  <Method void StringBuilder()>
    //   51  115:ldc2            #363 <String "Activity result no fragment exists for index: 0x">
    //   52  118:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   53  121:iload_1         
    //   54  122:invokestatic    #132 <Method String Integer.toHexString(int)>
    //   55  125:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   56  128:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   57  131:invokestatic    #356 <Method int Log.w(String, String)>
    //   58  134:pop             
    //   59  135:return          
    //   60  136:aload           7
    //   61  138:ldc2            #364 <Int 65535>
    //   62  141:iload_1         
    //   63  142:iand            
    //   64  143:iload_2         
    //   65  144:aload_3         
    //   66  145:invokevirtual   #366 <Method void Fragment.onActivityResult(int, int, Intent)>
    //   67  148:return          
    //   68  149:aload_0         
    //   69  150:iload_1         
    //   70  151:iload_2         
    //   71  152:aload_3         
    //   72  153:invokespecial   #367 <Method void Activity.onActivityResult(int, int, Intent)>
    //   73  156:return          
    }

    public void onAttachFragment(Fragment fragment)
    {
    //    0    0:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    2    4:invokevirtual   #373 <Method boolean FragmentManagerImpl.popBackStackImmediate()>
    //    3    7:ifne            14
    //    4   10:aload_0         
    //    5   11:invokevirtual   #376 <Method void finish()>
    //    6   14:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #380 <Method void Activity.onConfigurationChanged(Configuration)>
    //    3    5:aload_0         
    //    4    6:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #383 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
    //    7   13:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #59  <Field FragmentContainer mContainer>
    //    5    9:aconst_null     
    //    6   10:invokevirtual   #389 <Method void FragmentManagerImpl.attachActivity(FragmentActivity, FragmentContainer, Fragment)>
    //    7   13:aload_0         
    //    8   14:invokevirtual   #393 <Method LayoutInflater getLayoutInflater()>
    //    9   17:invokevirtual   #399 <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
    //   10   20:ifnonnull       31
    //   11   23:aload_0         
    //   12   24:invokevirtual   #393 <Method LayoutInflater getLayoutInflater()>
    //   13   27:aload_0         
    //   14   28:invokevirtual   #403 <Method void LayoutInflater.setFactory(android.view.LayoutInflater$Factory)>
    //   15   31:aload_0         
    //   16   32:aload_1         
    //   17   33:invokespecial   #405 <Method void Activity.onCreate(Bundle)>
    //   18   36:aload_0         
    //   19   37:invokevirtual   #289 <Method Object getLastNonConfigurationInstance()>
    //   20   40:checkcast       #291 <Class FragmentActivity$NonConfigurationInstances>
    //   21   43:astore_2        
    //   22   44:aload_2         
    //   23   45:ifnull          56
    //   24   48:aload_0         
    //   25   49:aload_2         
    //   26   50:getfield        #408 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
    //   27   53:putfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   28   56:aload_1         
    //   29   57:ifnull          94
    //   30   60:aload_1         
    //   31   61:ldc1            #8   <String "android:support:fragments">
    //   32   63:invokevirtual   #414 <Method android.os.Parcelable Bundle.getParcelable(String)>
    //   33   66:astore_3        
    //   34   67:aload_0         
    //   35   68:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   36   71:astore          4
    //   37   73:aconst_null     
    //   38   74:astore          5
    //   39   76:aload_2         
    //   40   77:ifnull          86
    //   41   80:aload_2         
    //   42   81:getfield        #417 <Field ArrayList FragmentActivity$NonConfigurationInstances.fragments>
    //   43   84:astore          5
    //   44   86:aload           4
    //   45   88:aload_3         
    //   46   89:aload           5
    //   47   91:invokevirtual   #421 <Method void FragmentManagerImpl.restoreAllState(android.os.Parcelable, ArrayList)>
    //   48   94:aload_0         
    //   49   95:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   50   98:invokevirtual   #424 <Method void FragmentManagerImpl.dispatchCreate()>
    //   51  101:return          
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifne            36
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:aload_2         
    //    5    7:invokespecial   #428 <Method boolean Activity.onCreatePanelMenu(int, Menu)>
    //    6   10:aload_0         
    //    7   11:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    8   14:aload_2         
    //    9   15:aload_0         
    //   10   16:invokevirtual   #432 <Method android.view.MenuInflater getMenuInflater()>
    //   11   19:invokevirtual   #436 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
    //   12   22:ior             
    //   13   23:istore_3        
    //   14   24:getstatic       #237 <Field int android.os.Build$VERSION.SDK_INT>
    //   15   27:bipush          11
    //   16   29:icmplt          34
    //   17   32:iload_3         
    //   18   33:ireturn         
    //   19   34:iconst_1        
    //   20   35:ireturn         
    //   21   36:aload_0         
    //   22   37:iload_1         
    //   23   38:aload_2         
    //   24   39:invokespecial   #428 <Method boolean Activity.onCreatePanelMenu(int, Menu)>
    //   25   42:ireturn         
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
    //    0    0:ldc2            #440 <String "fragment">
    //    1    3:aload_1         
    //    2    4:invokevirtual   #446 <Method boolean String.equals(Object)>
    //    3    7:ifne            18
    //    4   10:aload_0         
    //    5   11:aload_1         
    //    6   12:aload_2         
    //    7   13:aload_3         
    //    8   14:invokespecial   #448 <Method View Activity.onCreateView(String, Context, AttributeSet)>
    //    9   17:areturn         
    //   10   18:aload_3         
    //   11   19:aconst_null     
    //   12   20:ldc2            #450 <String "class">
    //   13   23:invokeinterface #456 <Method String AttributeSet.getAttributeValue(String, String)>
    //   14   28:astore          4
    //   15   30:aload_2         
    //   16   31:aload_3         
    //   17   32:getstatic       #462 <Field int[] FragmentActivity$FragmentTag.Fragment>
    //   18   35:invokevirtual   #468 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   19   38:astore          5
    //   20   40:aload           4
    //   21   42:ifnonnull       53
    //   22   45:aload           5
    //   23   47:iconst_0        
    //   24   48:invokevirtual   #473 <Method String TypedArray.getString(int)>
    //   25   51:astore          4
    //   26   53:aload           5
    //   27   55:iconst_1        
    //   28   56:iconst_m1       
    //   29   57:invokevirtual   #477 <Method int TypedArray.getResourceId(int, int)>
    //   30   60:istore          6
    //   31   62:aload           5
    //   32   64:iconst_2        
    //   33   65:invokevirtual   #473 <Method String TypedArray.getString(int)>
    //   34   68:astore          7
    //   35   70:aload           5
    //   36   72:invokevirtual   #480 <Method void TypedArray.recycle()>
    //   37   75:aload_0         
    //   38   76:aload           4
    //   39   78:invokestatic    #484 <Method boolean Fragment.isSupportFragmentClass(Context, String)>
    //   40   81:ifne            92
    //   41   84:aload_0         
    //   42   85:aload_1         
    //   43   86:aload_2         
    //   44   87:aload_3         
    //   45   88:invokespecial   #448 <Method View Activity.onCreateView(String, Context, AttributeSet)>
    //   46   91:areturn         
    //   47   92:iconst_0        
    //   48   93:istore          8
    //   49   95:iconst_0        
    //   50   96:ifeq            105
    //   51   99:aconst_null     
    //   52  100:invokevirtual   #186 <Method int View.getId()>
    //   53  103:istore          8
    //   54  105:iload           8
    //   55  107:iconst_m1       
    //   56  108:icmpne          160
    //   57  111:iload           6
    //   58  113:iconst_m1       
    //   59  114:icmpne          160
    //   60  117:aload           7
    //   61  119:ifnonnull       160
    //   62  122:new             #486 <Class IllegalArgumentException>
    //   63  125:dup             
    //   64  126:new             #84  <Class StringBuilder>
    //   65  129:dup             
    //   66  130:invokespecial   #85  <Method void StringBuilder()>
    //   67  133:aload_3         
    //   68  134:invokeinterface #489 <Method String AttributeSet.getPositionDescription()>
    //   69  139:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   70  142:ldc2            #491 <String ": Must specify unique android:id, android:tag, or have a parent with an id for ">
    //   71  145:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   72  148:aload           4
    //   73  150:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   74  153:invokevirtual   #95  <Method String StringBuilder.toString()>
    //   75  156:invokespecial   #493 <Method void IllegalArgumentException(String)>
    //   76  159:athrow          
    //   77  160:aconst_null     
    //   78  161:astore          9
    //   79  163:iload           6
    //   80  165:iconst_m1       
    //   81  166:icmpeq          180
    //   82  169:aload_0         
    //   83  170:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   84  173:iload           6
    //   85  175:invokevirtual   #497 <Method Fragment FragmentManagerImpl.findFragmentById(int)>
    //   86  178:astore          9
    //   87  180:aload           9
    //   88  182:ifnonnull       201
    //   89  185:aload           7
    //   90  187:ifnull          201
    //   91  190:aload_0         
    //   92  191:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   93  194:aload           7
    //   94  196:invokevirtual   #501 <Method Fragment FragmentManagerImpl.findFragmentByTag(String)>
    //   95  199:astore          9
    //   96  201:aload           9
    //   97  203:ifnonnull       223
    //   98  206:iload           8
    //   99  208:iconst_m1       
    //  100  209:icmpeq          223
    //  101  212:aload_0         
    //  102  213:getfield        #54  <Field FragmentManagerImpl mFragments>
    //  103  216:iload           8
    //  104  218:invokevirtual   #497 <Method Fragment FragmentManagerImpl.findFragmentById(int)>
    //  105  221:astore          9
    //  106  223:getstatic       #504 <Field boolean FragmentManagerImpl.DEBUG>
    //  107  226:ifeq            281
    //  108  229:ldc1            #18  <String "FragmentActivity">
    //  109  231:new             #84  <Class StringBuilder>
    //  110  234:dup             
    //  111  235:invokespecial   #85  <Method void StringBuilder()>
    //  112  238:ldc2            #506 <String "onCreateView: id=0x">
    //  113  241:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  114  244:iload           6
    //  115  246:invokestatic    #132 <Method String Integer.toHexString(int)>
    //  116  249:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  117  252:ldc2            #508 <String " fname=">
    //  118  255:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  119  258:aload           4
    //  120  260:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  121  263:ldc2            #510 <String " existing=">
    //  122  266:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  123  269:aload           9
    //  124  271:invokevirtual   #513 <Method StringBuilder StringBuilder.append(Object)>
    //  125  274:invokevirtual   #95  <Method String StringBuilder.toString()>
    //  126  277:invokestatic    #516 <Method int Log.v(String, String)>
    //  127  280:pop             
    //  128  281:aload           9
    //  129  283:ifnonnull       417
    //  130  286:aload_0         
    //  131  287:aload           4
    //  132  289:invokestatic    #520 <Method Fragment Fragment.instantiate(Context, String)>
    //  133  292:astore          9
    //  134  294:aload           9
    //  135  296:iconst_1        
    //  136  297:putfield        #523 <Field boolean Fragment.mFromLayout>
    //  137  300:iload           6
    //  138  302:ifeq            410
    //  139  305:iload           6
    //  140  307:istore          10
    //  141  309:aload           9
    //  142  311:iload           10
    //  143  313:putfield        #526 <Field int Fragment.mFragmentId>
    //  144  316:aload           9
    //  145  318:iload           8
    //  146  320:putfield        #529 <Field int Fragment.mContainerId>
    //  147  323:aload           9
    //  148  325:aload           7
    //  149  327:putfield        #532 <Field String Fragment.mTag>
    //  150  330:aload           9
    //  151  332:iconst_1        
    //  152  333:putfield        #535 <Field boolean Fragment.mInLayout>
    //  153  336:aload           9
    //  154  338:aload_0         
    //  155  339:getfield        #54  <Field FragmentManagerImpl mFragments>
    //  156  342:putfield        #538 <Field FragmentManagerImpl Fragment.mFragmentManager>
    //  157  345:aload           9
    //  158  347:aload_0         
    //  159  348:aload_3         
    //  160  349:aload           9
    //  161  351:getfield        #542 <Field Bundle Fragment.mSavedFragmentState>
    //  162  354:invokevirtual   #546 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
    //  163  357:aload_0         
    //  164  358:getfield        #54  <Field FragmentManagerImpl mFragments>
    //  165  361:aload           9
    //  166  363:iconst_1        
    //  167  364:invokevirtual   #550 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
    //  168  367:aload           9
    //  169  369:getfield        #554 <Field View Fragment.mView>
    //  170  372:ifnonnull       540
    //  171  375:new             #556 <Class IllegalStateException>
    //  172  378:dup             
    //  173  379:new             #84  <Class StringBuilder>
    //  174  382:dup             
    //  175  383:invokespecial   #85  <Method void StringBuilder()>
    //  176  386:ldc2            #558 <String "Fragment ">
    //  177  389:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  178  392:aload           4
    //  179  394:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  180  397:ldc2            #560 <String " did not create a view.">
    //  181  400:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  182  403:invokevirtual   #95  <Method String StringBuilder.toString()>
    //  183  406:invokespecial   #561 <Method void IllegalStateException(String)>
    //  184  409:athrow          
    //  185  410:iload           8
    //  186  412:istore          10
    //  187  414:goto            309
    //  188  417:aload           9
    //  189  419:getfield        #535 <Field boolean Fragment.mInLayout>
    //  190  422:ifeq            502
    //  191  425:new             #486 <Class IllegalArgumentException>
    //  192  428:dup             
    //  193  429:new             #84  <Class StringBuilder>
    //  194  432:dup             
    //  195  433:invokespecial   #85  <Method void StringBuilder()>
    //  196  436:aload_3         
    //  197  437:invokeinterface #489 <Method String AttributeSet.getPositionDescription()>
    //  198  442:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  199  445:ldc2            #563 <String ": Duplicate id 0x">
    //  200  448:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  201  451:iload           6
    //  202  453:invokestatic    #132 <Method String Integer.toHexString(int)>
    //  203  456:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  204  459:ldc2            #565 <String ", tag ">
    //  205  462:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  206  465:aload           7
    //  207  467:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  208  470:ldc2            #567 <String ", or parent id 0x">
    //  209  473:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  210  476:iload           8
    //  211  478:invokestatic    #132 <Method String Integer.toHexString(int)>
    //  212  481:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  213  484:ldc2            #569 <String " with another fragment for ">
    //  214  487:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  215  490:aload           4
    //  216  492:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //  217  495:invokevirtual   #95  <Method String StringBuilder.toString()>
    //  218  498:invokespecial   #493 <Method void IllegalArgumentException(String)>
    //  219  501:athrow          
    //  220  502:aload           9
    //  221  504:iconst_1        
    //  222  505:putfield        #535 <Field boolean Fragment.mInLayout>
    //  223  508:aload           9
    //  224  510:getfield        #570 <Field boolean Fragment.mRetaining>
    //  225  513:ifne            528
    //  226  516:aload           9
    //  227  518:aload_0         
    //  228  519:aload_3         
    //  229  520:aload           9
    //  230  522:getfield        #542 <Field Bundle Fragment.mSavedFragmentState>
    //  231  525:invokevirtual   #546 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
    //  232  528:aload_0         
    //  233  529:getfield        #54  <Field FragmentManagerImpl mFragments>
    //  234  532:aload           9
    //  235  534:invokevirtual   #573 <Method void FragmentManagerImpl.moveToState(Fragment)>
    //  236  537:goto            367
    //  237  540:iload           6
    //  238  542:ifeq            555
    //  239  545:aload           9
    //  240  547:getfield        #554 <Field View Fragment.mView>
    //  241  550:iload           6
    //  242  552:invokevirtual   #576 <Method void View.setId(int)>
    //  243  555:aload           9
    //  244  557:getfield        #554 <Field View Fragment.mView>
    //  245  560:invokevirtual   #579 <Method Object View.getTag()>
    //  246  563:ifnonnull       576
    //  247  566:aload           9
    //  248  568:getfield        #554 <Field View Fragment.mView>
    //  249  571:aload           7
    //  250  573:invokevirtual   #583 <Method void View.setTag(Object)>
    //  251  576:aload           9
    //  252  578:getfield        #554 <Field View Fragment.mView>
    //  253  581:areturn         
    }

    protected void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #586 <Method void Activity.onDestroy()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #588 <Method void doReallyStop(boolean)>
    //    5    9:aload_0         
    //    6   10:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    7   13:invokevirtual   #591 <Method void FragmentManagerImpl.dispatchDestroy()>
    //    8   16:aload_0         
    //    9   17:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   10   20:ifnull          30
    //   11   23:aload_0         
    //   12   24:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   13   27:invokevirtual   #331 <Method void LoaderManagerImpl.doDestroy()>
    //   14   30:return          
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:getstatic       #237 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:iconst_5        
    //    2    4:icmpge          25
    //    3    7:iload_1         
    //    4    8:iconst_4        
    //    5    9:icmpne          25
    //    6   12:aload_2         
    //    7   13:invokevirtual   #598 <Method int KeyEvent.getRepeatCount()>
    //    8   16:ifne            25
    //    9   19:aload_0         
    //   10   20:invokevirtual   #600 <Method void onBackPressed()>
    //   11   23:iconst_1        
    //   12   24:ireturn         
    //   13   25:aload_0         
    //   14   26:iload_1         
    //   15   27:aload_2         
    //   16   28:invokespecial   #602 <Method boolean Activity.onKeyDown(int, KeyEvent)>
    //   17   31:ireturn         
    }

    public void onLowMemory()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #605 <Method void Activity.onLowMemory()>
    //    2    4:aload_0         
    //    3    5:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    4    8:invokevirtual   #608 <Method void FragmentManagerImpl.dispatchLowMemory()>
    //    5   11:return          
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #612 <Method boolean Activity.onMenuItemSelected(int, MenuItem)>
    //    4    6:ifeq            11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iload_1         
    //    8   12:lookupswitch    2: default 40
    //                   0: 42
    //                   6: 51
    //    9   40:iconst_0        
    //   10   41:ireturn         
    //   11   42:aload_0         
    //   12   43:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   13   46:aload_2         
    //   14   47:invokevirtual   #616 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
    //   15   50:ireturn         
    //   16   51:aload_0         
    //   17   52:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   18   55:aload_2         
    //   19   56:invokevirtual   #619 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
    //   20   59:ireturn         
    }

    protected void onNewIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #623 <Method void Activity.onNewIntent(Intent)>
    //    3    5:aload_0         
    //    4    6:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    5    9:invokevirtual   #339 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   12:return          
    }

    public void onPanelClosed(int i, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     0 0: default 20
    //                   0 27
    //    2   20:aload_0         
    //    3   21:iload_1         
    //    4   22:aload_2         
    //    5   23:invokespecial   #627 <Method void Activity.onPanelClosed(int, Menu)>
    //    6   26:return          
    //    7   27:aload_0         
    //    8   28:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    9   31:aload_2         
    //   10   32:invokevirtual   #631 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
    //   11   35:goto            20
    }

    protected void onPause()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #634 <Method void Activity.onPause()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #251 <Field boolean mResumed>
    //    5    9:aload_0         
    //    6   10:getfield        #49  <Field Handler mHandler>
    //    7   13:iconst_2        
    //    8   14:invokevirtual   #638 <Method boolean Handler.hasMessages(int)>
    //    9   17:ifeq            32
    //   10   20:aload_0         
    //   11   21:getfield        #49  <Field Handler mHandler>
    //   12   24:iconst_2        
    //   13   25:invokevirtual   #227 <Method void Handler.removeMessages(int)>
    //   14   28:aload_0         
    //   15   29:invokevirtual   #641 <Method void onResumeFragments()>
    //   16   32:aload_0         
    //   17   33:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   18   36:invokevirtual   #644 <Method void FragmentManagerImpl.dispatchPause()>
    //   19   39:return          
    }

    protected void onPostResume()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #647 <Method void Activity.onPostResume()>
    //    2    4:aload_0         
    //    3    5:getfield        #49  <Field Handler mHandler>
    //    4    8:iconst_2        
    //    5    9:invokevirtual   #227 <Method void Handler.removeMessages(int)>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #641 <Method void onResumeFragments()>
    //    8   16:aload_0         
    //    9   17:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   10   20:invokevirtual   #650 <Method boolean FragmentManagerImpl.execPendingActions()>
    //   11   23:pop             
    //   12   24:return          
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aload_1         
    //    3    3:aload_2         
    //    4    4:invokespecial   #656 <Method boolean Activity.onPreparePanel(int, View, Menu)>
    //    5    7:ireturn         
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifne            49
    //    2    4:aload_3         
    //    3    5:ifnull          49
    //    4    8:aload_0         
    //    5    9:getfield        #658 <Field boolean mOptionsMenuInvalidated>
    //    6   12:ifeq            33
    //    7   15:aload_0         
    //    8   16:iconst_0        
    //    9   17:putfield        #658 <Field boolean mOptionsMenuInvalidated>
    //   10   20:aload_3         
    //   11   21:invokeinterface #663 <Method void Menu.clear()>
    //   12   26:aload_0         
    //   13   27:iload_1         
    //   14   28:aload_3         
    //   15   29:invokevirtual   #664 <Method boolean onCreatePanelMenu(int, Menu)>
    //   16   32:pop             
    //   17   33:aload_0         
    //   18   34:aload_2         
    //   19   35:aload_3         
    //   20   36:invokevirtual   #666 <Method boolean onPrepareOptionsPanel(View, Menu)>
    //   21   39:aload_0         
    //   22   40:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   23   43:aload_3         
    //   24   44:invokevirtual   #670 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
    //   25   47:ior             
    //   26   48:ireturn         
    //   27   49:aload_0         
    //   28   50:iload_1         
    //   29   51:aload_2         
    //   30   52:aload_3         
    //   31   53:invokespecial   #656 <Method boolean Activity.onPreparePanel(int, View, Menu)>
    //   32   56:ireturn         
    }

    void onReallyStop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #263 <Field boolean mLoadersStarted>
    //    2    4:ifeq            33
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #263 <Field boolean mLoadersStarted>
    //    6   12:aload_0         
    //    7   13:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //    8   16:ifnull          33
    //    9   19:aload_0         
    //   10   20:getfield        #222 <Field boolean mRetaining>
    //   11   23:ifne            41
    //   12   26:aload_0         
    //   13   27:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   14   30:invokevirtual   #673 <Method void LoaderManagerImpl.doStop()>
    //   15   33:aload_0         
    //   16   34:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   17   37:invokevirtual   #676 <Method void FragmentManagerImpl.dispatchReallyStop()>
    //   18   40:return          
    //   19   41:aload_0         
    //   20   42:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   21   45:invokevirtual   #679 <Method void LoaderManagerImpl.doRetain()>
    //   22   48:goto            33
    }

    protected void onResume()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #682 <Method void Activity.onResume()>
    //    2    4:aload_0         
    //    3    5:getfield        #49  <Field Handler mHandler>
    //    4    8:iconst_2        
    //    5    9:invokevirtual   #685 <Method boolean Handler.sendEmptyMessage(int)>
    //    6   12:pop             
    //    7   13:aload_0         
    //    8   14:iconst_1        
    //    9   15:putfield        #251 <Field boolean mResumed>
    //   10   18:aload_0         
    //   11   19:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   12   22:invokevirtual   #650 <Method boolean FragmentManagerImpl.execPendingActions()>
    //   13   25:pop             
    //   14   26:return          
    }

    protected void onResumeFragments()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    2    4:invokevirtual   #688 <Method void FragmentManagerImpl.dispatchResume()>
    //    3    7:return          
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public final Object onRetainNonConfigurationInstance()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #255 <Field boolean mStopped>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:invokevirtual   #588 <Method void doReallyStop(boolean)>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #692 <Method Object onRetainCustomNonConfigurationInstance()>
    //    8   16:astore_1        
    //    9   17:aload_0         
    //   10   18:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   11   21:invokevirtual   #696 <Method ArrayList FragmentManagerImpl.retainNonConfig()>
    //   12   24:astore_2        
    //   13   25:aload_0         
    //   14   26:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   15   29:astore_3        
    //   16   30:iconst_0        
    //   17   31:istore          4
    //   18   33:aload_3         
    //   19   34:ifnull          142
    //   20   37:aload_0         
    //   21   38:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   22   41:invokevirtual   #697 <Method int SimpleArrayMap.size()>
    //   23   44:istore          6
    //   24   46:iload           6
    //   25   48:anewarray       LoaderManagerImpl[]
    //   26   51:astore          7
    //   27   53:iload           6
    //   28   55:iconst_1        
    //   29   56:isub            
    //   30   57:istore          8
    //   31   59:iload           8
    //   32   61:iflt            87
    //   33   64:aload           7
    //   34   66:iload           8
    //   35   68:aload_0         
    //   36   69:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   37   72:iload           8
    //   38   74:invokevirtual   #700 <Method Object SimpleArrayMap.valueAt(int)>
    //   39   77:checkcast       #269 <Class LoaderManagerImpl>
    //   40   80:aastore         
    //   41   81:iinc            8  -1
    //   42   84:goto            59
    //   43   87:iconst_0        
    //   44   88:istore          9
    //   45   90:iload           9
    //   46   92:iload           6
    //   47   94:icmpge          142
    //   48   97:aload           7
    //   49   99:iload           9
    //   50  101:aaload          
    //   51  102:astore          10
    //   52  104:aload           10
    //   53  106:getfield        #328 <Field boolean LoaderManagerImpl.mRetaining>
    //   54  109:ifeq            121
    //   55  112:iconst_1        
    //   56  113:istore          4
    //   57  115:iinc            9  1
    //   58  118:goto            90
    //   59  121:aload           10
    //   60  123:invokevirtual   #331 <Method void LoaderManagerImpl.doDestroy()>
    //   61  126:aload_0         
    //   62  127:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   63  130:aload           10
    //   64  132:getfield        #703 <Field String LoaderManagerImpl.mWho>
    //   65  135:invokevirtual   #334 <Method Object SimpleArrayMap.remove(Object)>
    //   66  138:pop             
    //   67  139:goto            115
    //   68  142:aload_2         
    //   69  143:ifnonnull       157
    //   70  146:iload           4
    //   71  148:ifne            157
    //   72  151:aload_1         
    //   73  152:ifnonnull       157
    //   74  155:aconst_null     
    //   75  156:areturn         
    //   76  157:new             #291 <Class FragmentActivity$NonConfigurationInstances>
    //   77  160:dup             
    //   78  161:invokespecial   #704 <Method void FragmentActivity$NonConfigurationInstances()>
    //   79  164:astore          5
    //   80  166:aload           5
    //   81  168:aconst_null     
    //   82  169:putfield        #707 <Field Object FragmentActivity$NonConfigurationInstances.activity>
    //   83  172:aload           5
    //   84  174:aload_1         
    //   85  175:putfield        #295 <Field Object FragmentActivity$NonConfigurationInstances.custom>
    //   86  178:aload           5
    //   87  180:aconst_null     
    //   88  181:putfield        #710 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.children>
    //   89  184:aload           5
    //   90  186:aload_2         
    //   91  187:putfield        #417 <Field ArrayList FragmentActivity$NonConfigurationInstances.fragments>
    //   92  190:aload           5
    //   93  192:aload_0         
    //   94  193:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   95  196:putfield        #408 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
    //   96  199:aload           5
    //   97  201:areturn         
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #713 <Method void Activity.onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #54  <Field FragmentManagerImpl mFragments>
    //    5    9:invokevirtual   #717 <Method android.os.Parcelable FragmentManagerImpl.saveAllState()>
    //    6   12:astore_2        
    //    7   13:aload_2         
    //    8   14:ifnull          24
    //    9   17:aload_1         
    //   10   18:ldc1            #8   <String "android:support:fragments">
    //   11   20:aload_2         
    //   12   21:invokevirtual   #721 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
    //   13   24:return          
    }

    protected void onStart()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #724 <Method void Activity.onStart()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #255 <Field boolean mStopped>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #220 <Field boolean mReallyStopped>
    //    8   14:aload_0         
    //    9   15:getfield        #49  <Field Handler mHandler>
    //   10   18:iconst_1        
    //   11   19:invokevirtual   #227 <Method void Handler.removeMessages(int)>
    //   12   22:aload_0         
    //   13   23:getfield        #245 <Field boolean mCreated>
    //   14   26:ifne            41
    //   15   29:aload_0         
    //   16   30:iconst_1        
    //   17   31:putfield        #245 <Field boolean mCreated>
    //   18   34:aload_0         
    //   19   35:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   20   38:invokevirtual   #727 <Method void FragmentManagerImpl.dispatchActivityCreated()>
    //   21   41:aload_0         
    //   22   42:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   23   45:invokevirtual   #339 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //   24   48:aload_0         
    //   25   49:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   26   52:invokevirtual   #650 <Method boolean FragmentManagerImpl.execPendingActions()>
    //   27   55:pop             
    //   28   56:aload_0         
    //   29   57:getfield        #263 <Field boolean mLoadersStarted>
    //   30   60:ifne            87
    //   31   63:aload_0         
    //   32   64:iconst_1        
    //   33   65:putfield        #263 <Field boolean mLoadersStarted>
    //   34   68:aload_0         
    //   35   69:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   36   72:ifnull          146
    //   37   75:aload_0         
    //   38   76:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   39   79:invokevirtual   #730 <Method void LoaderManagerImpl.doStart()>
    //   40   82:aload_0         
    //   41   83:iconst_1        
    //   42   84:putfield        #322 <Field boolean mCheckedForLoaderManager>
    //   43   87:aload_0         
    //   44   88:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   45   91:invokevirtual   #733 <Method void FragmentManagerImpl.dispatchStart()>
    //   46   94:aload_0         
    //   47   95:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   48   98:ifnull          227
    //   49  101:aload_0         
    //   50  102:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   51  105:invokevirtual   #697 <Method int SimpleArrayMap.size()>
    //   52  108:istore_2        
    //   53  109:iload_2         
    //   54  110:anewarray       LoaderManagerImpl[]
    //   55  113:astore_3        
    //   56  114:iload_2         
    //   57  115:iconst_1        
    //   58  116:isub            
    //   59  117:istore          4
    //   60  119:iload           4
    //   61  121:iflt            196
    //   62  124:aload_3         
    //   63  125:iload           4
    //   64  127:aload_0         
    //   65  128:getfield        #299 <Field SimpleArrayMap mAllLoaderManagers>
    //   66  131:iload           4
    //   67  133:invokevirtual   #700 <Method Object SimpleArrayMap.valueAt(int)>
    //   68  136:checkcast       #269 <Class LoaderManagerImpl>
    //   69  139:aastore         
    //   70  140:iinc            4  -1
    //   71  143:goto            119
    //   72  146:aload_0         
    //   73  147:getfield        #322 <Field boolean mCheckedForLoaderManager>
    //   74  150:ifne            82
    //   75  153:aload_0         
    //   76  154:aload_0         
    //   77  155:ldc2            #324 <String "(root)">
    //   78  158:aload_0         
    //   79  159:getfield        #263 <Field boolean mLoadersStarted>
    //   80  162:iconst_0        
    //   81  163:invokevirtual   #326 <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
    //   82  166:putfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   83  169:aload_0         
    //   84  170:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   85  173:ifnull          82
    //   86  176:aload_0         
    //   87  177:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   88  180:getfield        #736 <Field boolean LoaderManagerImpl.mStarted>
    //   89  183:ifne            82
    //   90  186:aload_0         
    //   91  187:getfield        #265 <Field LoaderManagerImpl mLoaderManager>
    //   92  190:invokevirtual   #730 <Method void LoaderManagerImpl.doStart()>
    //   93  193:goto            82
    //   94  196:iconst_0        
    //   95  197:istore          5
    //   96  199:iload           5
    //   97  201:iload_2         
    //   98  202:icmpge          227
    //   99  205:aload_3         
    //  100  206:iload           5
    //  101  208:aaload          
    //  102  209:astore          6
    //  103  211:aload           6
    //  104  213:invokevirtual   #739 <Method void LoaderManagerImpl.finishRetain()>
    //  105  216:aload           6
    //  106  218:invokevirtual   #742 <Method void LoaderManagerImpl.doReportStart()>
    //  107  221:iinc            5  1
    //  108  224:goto            199
    //  109  227:return          
    }

    protected void onStop()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #745 <Method void Activity.onStop()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #255 <Field boolean mStopped>
    //    5    9:aload_0         
    //    6   10:getfield        #49  <Field Handler mHandler>
    //    7   13:iconst_1        
    //    8   14:invokevirtual   #685 <Method boolean Handler.sendEmptyMessage(int)>
    //    9   17:pop             
    //   10   18:aload_0         
    //   11   19:getfield        #54  <Field FragmentManagerImpl mFragments>
    //   12   22:invokevirtual   #748 <Method void FragmentManagerImpl.dispatchStop()>
    //   13   25:return          
    }

    public void startActivityForResult(Intent intent, int i)
    {
    //    0    0:iload_2         
    //    1    1:iconst_m1       
    //    2    2:icmpeq          24
    //    3    5:ldc2            #751 <Int 0xffff0000>
    //    4    8:iload_2         
    //    5    9:iand            
    //    6   10:ifeq            24
    //    7   13:new             #486 <Class IllegalArgumentException>
    //    8   16:dup             
    //    9   17:ldc2            #753 <String "Can only use lower 16 bits for requestCode">
    //   10   20:invokespecial   #493 <Method void IllegalArgumentException(String)>
    //   11   23:athrow          
    //   12   24:aload_0         
    //   13   25:aload_1         
    //   14   26:iload_2         
    //   15   27:invokespecial   #755 <Method void Activity.startActivityForResult(Intent, int)>
    //   16   30:return          
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
    //    0    0:iload_3         
    //    1    1:iconst_m1       
    //    2    2:icmpne          12
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:iconst_m1       
    //    6    8:invokespecial   #755 <Method void Activity.startActivityForResult(Intent, int)>
    //    7   11:return          
    //    8   12:ldc2            #751 <Int 0xffff0000>
    //    9   15:iload_3         
    //   10   16:iand            
    //   11   17:ifeq            31
    //   12   20:new             #486 <Class IllegalArgumentException>
    //   13   23:dup             
    //   14   24:ldc2            #753 <String "Can only use lower 16 bits for requestCode">
    //   15   27:invokespecial   #493 <Method void IllegalArgumentException(String)>
    //   16   30:athrow          
    //   17   31:aload_0         
    //   18   32:aload_2         
    //   19   33:iconst_1        
    //   20   34:aload_1         
    //   21   35:getfield        #760 <Field int Fragment.mIndex>
    //   22   38:iadd            
    //   23   39:bipush          16
    //   24   41:ishl            
    //   25   42:ldc2            #364 <Int 65535>
    //   26   45:iload_3         
    //   27   46:iand            
    //   28   47:iadd            
    //   29   48:invokespecial   #755 <Method void Activity.startActivityForResult(Intent, int)>
    //   30   51:return          
    }

    public void supportInvalidateOptionsMenu()
    {
    //    0    0:getstatic       #237 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:invokestatic    #767 <Method void ActivityCompatHoneycomb.invalidateOptionsMenu(Activity)>
    //    5   12:return          
    //    6   13:aload_0         
    //    7   14:iconst_1        
    //    8   15:putfield        #658 <Field boolean mOptionsMenuInvalidated>
    //    9   18:return          
    }

    static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final int HONEYCOMB = 11;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    private static final String TAG = "FragmentActivity";
    SimpleArrayMap mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final FragmentContainer mContainer;
    boolean mCreated;
    final FragmentManagerImpl mFragments;
    final Handler mHandler;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    // Unreferenced inner class android/support/v4/app/FragmentActivity$1

/* anonymous class */
    class _cls1 extends Handler
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field FragmentActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Handler()>
        //    5    9:return          
        }

        public void handleMessage(Message message)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #23  <Field int Message.what>
        //    2    4:tableswitch     1 2: default 28
        //                       1 34
        //                       2 53
        //    3   28:aload_0         
        //    4   29:aload_1         
        //    5   30:invokespecial   #25  <Method void Handler.handleMessage(Message)>
        //    6   33:return          
        //    7   34:aload_0         
        //    8   35:getfield        #12  <Field FragmentActivity this$0>
        //    9   38:getfield        #29  <Field boolean FragmentActivity.mStopped>
        //   10   41:ifeq            33
        //   11   44:aload_0         
        //   12   45:getfield        #12  <Field FragmentActivity this$0>
        //   13   48:iconst_0        
        //   14   49:invokevirtual   #33  <Method void FragmentActivity.doReallyStop(boolean)>
        //   15   52:return          
        //   16   53:aload_0         
        //   17   54:getfield        #12  <Field FragmentActivity this$0>
        //   18   57:invokevirtual   #36  <Method void FragmentActivity.onResumeFragments()>
        //   19   60:aload_0         
        //   20   61:getfield        #12  <Field FragmentActivity this$0>
        //   21   64:getfield        #40  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   22   67:invokevirtual   #46  <Method boolean FragmentManagerImpl.execPendingActions()>
        //   23   70:pop             
        //   24   71:return          
        }

        final FragmentActivity this$0;
    }


    // Unreferenced inner class android/support/v4/app/FragmentActivity$2

/* anonymous class */
    class _cls2
        implements FragmentContainer
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field FragmentActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public View findViewById(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field FragmentActivity this$0>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #21  <Method View FragmentActivity.findViewById(int)>
        //    4    8:areturn         
        }

        final FragmentActivity this$0;
    }

}
