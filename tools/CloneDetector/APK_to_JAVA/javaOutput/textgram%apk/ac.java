// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.f;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o, AdActivity

public class ac
    implements o
{

    static 
    {
    //    0    0:getstatic       #15  <Field f a.a>
    //    1    3:invokeinterface #21  <Method Object f.b()>
    //    2    8:checkcast       #12  <Class a>
    //    3   11:putstatic       #23  <Field a a>
    //    4   14:return          
    }

    public ac()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void Object()>
    //    2    4:return          
    }

    protected int a(HashMap hashmap, String s, int i, DisplayMetrics displaymetrics)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //    3    5:checkcast       #37  <Class String>
    //    4    8:astore          5
    //    5   10:aload           5
    //    6   12:ifnull          33
    // try 15 29 handler(s) 35
    //    7   15:iconst_1        
    //    8   16:aload           5
    //    9   18:invokestatic    #43  <Method int Integer.parseInt(String)>
    //   10   21:i2f             
    //   11   22:aload           4
    //   12   24:invokestatic    #49  <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //   13   27:fstore          7
    //   14   29:fload           7
    //   15   31:f2i             
    //   16   32:istore_3        
    //   17   33:iload_3         
    //   18   34:ireturn         
    // catch NumberFormatException
    //   19   35:astore          6
    //   20   37:new             #51  <Class StringBuilder>
    //   21   40:dup             
    //   22   41:invokespecial   #52  <Method void StringBuilder()>
    //   23   44:ldc1            #54  <String "Could not parse \"">
    //   24   46:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   25   49:aload_2         
    //   26   50:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   27   53:ldc1            #60  <String "\" in a video gmsg: ">
    //   28   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   29   58:aload           5
    //   30   60:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   31   63:invokevirtual   #64  <Method String StringBuilder.toString()>
    //   32   66:invokestatic    #69  <Method void b.a(String)>
    //   33   69:iload_3         
    //   34   70:ireturn         
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #72  <String "action">
    //    2    3:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #37  <Class String>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:ifnonnull       22
    //    7   16:ldc1            #74  <String "No \"action\" parameter in a video gmsg.">
    //    8   18:invokestatic    #69  <Method void b.a(String)>
    //    9   21:return          
    //   10   22:aload_3         
    //   11   23:instanceof      #76  <Class AdWebView>
    //   12   26:ifeq            53
    //   13   29:aload_3         
    //   14   30:checkcast       #76  <Class AdWebView>
    //   15   33:astore          5
    //   16   35:aload           5
    //   17   37:invokevirtual   #80  <Method AdActivity AdWebView.i()>
    //   18   40:astore          6
    //   19   42:aload           6
    //   20   44:ifnonnull       59
    //   21   47:ldc1            #82  <String "Could not get adActivity for a video gmsg.">
    //   22   49:invokestatic    #69  <Method void b.a(String)>
    //   23   52:return          
    //   24   53:ldc1            #84  <String "Could not get adWebView for a video gmsg.">
    //   25   55:invokestatic    #69  <Method void b.a(String)>
    //   26   58:return          
    //   27   59:aload           4
    //   28   61:ldc1            #86  <String "new">
    //   29   63:invokevirtual   #90  <Method boolean String.equals(Object)>
    //   30   66:istore          7
    //   31   68:aload           4
    //   32   70:ldc1            #92  <String "position">
    //   33   72:invokevirtual   #90  <Method boolean String.equals(Object)>
    //   34   75:istore          8
    //   35   77:iload           7
    //   36   79:ifne            87
    //   37   82:iload           8
    //   38   84:ifeq            183
    //   39   87:aload           6
    //   40   89:invokestatic    #97  <Method DisplayMetrics AdUtil.a(android.app.Activity)>
    //   41   92:astore          9
    //   42   94:aload_0         
    //   43   95:aload_2         
    //   44   96:ldc1            #99  <String "x">
    //   45   98:iconst_0        
    //   46   99:aload           9
    //   47  101:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //   48  104:istore          10
    //   49  106:aload_0         
    //   50  107:aload_2         
    //   51  108:ldc1            #103 <String "y">
    //   52  110:iconst_0        
    //   53  111:aload           9
    //   54  113:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //   55  116:istore          11
    //   56  118:aload_0         
    //   57  119:aload_2         
    //   58  120:ldc1            #105 <String "w">
    //   59  122:iconst_m1       
    //   60  123:aload           9
    //   61  125:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //   62  128:istore          12
    //   63  130:aload_0         
    //   64  131:aload_2         
    //   65  132:ldc1            #107 <String "h">
    //   66  134:iconst_m1       
    //   67  135:aload           9
    //   68  137:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //   69  140:istore          13
    //   70  142:iload           7
    //   71  144:ifeq            169
    //   72  147:aload           6
    //   73  149:invokevirtual   #113 <Method AdVideoView AdActivity.getAdVideoView()>
    //   74  152:ifnonnull       169
    //   75  155:aload           6
    //   76  157:iload           10
    //   77  159:iload           11
    //   78  161:iload           12
    //   79  163:iload           13
    //   80  165:invokevirtual   #117 <Method void AdActivity.newAdVideoView(int, int, int, int)>
    //   81  168:return          
    //   82  169:aload           6
    //   83  171:iload           10
    //   84  173:iload           11
    //   85  175:iload           12
    //   86  177:iload           13
    //   87  179:invokevirtual   #120 <Method void AdActivity.moveAdVideoView(int, int, int, int)>
    //   88  182:return          
    //   89  183:aload           6
    //   90  185:invokevirtual   #113 <Method AdVideoView AdActivity.getAdVideoView()>
    //   91  188:astore          14
    //   92  190:aload           14
    //   93  192:ifnonnull       208
    //   94  195:getstatic       #23  <Field a a>
    //   95  198:aload           5
    //   96  200:ldc1            #122 <String "onVideoEvent">
    //   97  202:ldc1            #124 <String "{'event': 'error', 'what': 'no_video_view'}">
    //   98  204:invokevirtual   #127 <Method void a.a(WebView, String, String)>
    //   99  207:return          
    //  100  208:aload           4
    //  101  210:ldc1            #129 <String "click">
    //  102  212:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  103  215:ifeq            275
    //  104  218:aload           6
    //  105  220:invokestatic    #97  <Method DisplayMetrics AdUtil.a(android.app.Activity)>
    //  106  223:astore          18
    //  107  225:aload_0         
    //  108  226:aload_2         
    //  109  227:ldc1            #99  <String "x">
    //  110  229:iconst_0        
    //  111  230:aload           18
    //  112  232:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //  113  235:istore          19
    //  114  237:aload_0         
    //  115  238:aload_2         
    //  116  239:ldc1            #103 <String "y">
    //  117  241:iconst_0        
    //  118  242:aload           18
    //  119  244:invokevirtual   #101 <Method int a(HashMap, String, int, DisplayMetrics)>
    //  120  247:istore          20
    //  121  249:invokestatic    #135 <Method long SystemClock.uptimeMillis()>
    //  122  252:lstore          21
    //  123  254:aload           14
    //  124  256:lload           21
    //  125  258:lload           21
    //  126  260:iconst_0        
    //  127  261:iload           19
    //  128  263:i2f             
    //  129  264:iload           20
    //  130  266:i2f             
    //  131  267:iconst_0        
    //  132  268:invokestatic    #141 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
    //  133  271:invokevirtual   #146 <Method void AdVideoView.a(MotionEvent)>
    //  134  274:return          
    //  135  275:aload           4
    //  136  277:ldc1            #148 <String "controls">
    //  137  279:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  138  282:ifeq            331
    //  139  285:aload_2         
    //  140  286:ldc1            #150 <String "enabled">
    //  141  288:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //  142  291:checkcast       #37  <Class String>
    //  143  294:astore          17
    //  144  296:aload           17
    //  145  298:ifnonnull       307
    //  146  301:ldc1            #152 <String "No \"enabled\" parameter in a controls video gmsg.">
    //  147  303:invokestatic    #69  <Method void b.a(String)>
    //  148  306:return          
    //  149  307:aload           17
    //  150  309:ldc1            #154 <String "true">
    //  151  311:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  152  314:ifeq            324
    //  153  317:aload           14
    //  154  319:iconst_1        
    //  155  320:invokevirtual   #158 <Method void AdVideoView.setMediaControllerEnabled(boolean)>
    //  156  323:return          
    //  157  324:aload           14
    //  158  326:iconst_0        
    //  159  327:invokevirtual   #158 <Method void AdVideoView.setMediaControllerEnabled(boolean)>
    //  160  330:return          
    //  161  331:aload           4
    //  162  333:ldc1            #160 <String "currentTime">
    //  163  335:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  164  338:ifeq            404
    //  165  341:aload_2         
    //  166  342:ldc1            #162 <String "time">
    //  167  344:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //  168  347:checkcast       #37  <Class String>
    //  169  350:astore          15
    //  170  352:aload           15
    //  171  354:ifnonnull       363
    //  172  357:ldc1            #164 <String "No \"time\" parameter in a currentTime video gmsg.">
    //  173  359:invokestatic    #69  <Method void b.a(String)>
    //  174  362:return          
    // try 363 377 handler(s) 378
    //  175  363:aload           14
    //  176  365:ldc1            #165 <Float 1000F>
    //  177  367:aload           15
    //  178  369:invokestatic    #171 <Method float Float.parseFloat(String)>
    //  179  372:fmul            
    //  180  373:f2i             
    //  181  374:invokevirtual   #174 <Method void AdVideoView.a(int)>
    //  182  377:return          
    // catch NumberFormatException
    //  183  378:astore          16
    //  184  380:new             #51  <Class StringBuilder>
    //  185  383:dup             
    //  186  384:invokespecial   #52  <Method void StringBuilder()>
    //  187  387:ldc1            #176 <String "Could not parse \"time\" parameter: ">
    //  188  389:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  189  392:aload           15
    //  190  394:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  191  397:invokevirtual   #64  <Method String StringBuilder.toString()>
    //  192  400:invokestatic    #69  <Method void b.a(String)>
    //  193  403:return          
    //  194  404:aload           4
    //  195  406:ldc1            #178 <String "hide">
    //  196  408:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  197  411:ifeq            421
    //  198  414:aload           14
    //  199  416:iconst_4        
    //  200  417:invokevirtual   #181 <Method void AdVideoView.setVisibility(int)>
    //  201  420:return          
    //  202  421:aload           4
    //  203  423:ldc1            #183 <String "load">
    //  204  425:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  205  428:ifeq            437
    //  206  431:aload           14
    //  207  433:invokevirtual   #185 <Method void AdVideoView.b()>
    //  208  436:return          
    //  209  437:aload           4
    //  210  439:ldc1            #187 <String "pause">
    //  211  441:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  212  444:ifeq            453
    //  213  447:aload           14
    //  214  449:invokevirtual   #190 <Method void AdVideoView.c()>
    //  215  452:return          
    //  216  453:aload           4
    //  217  455:ldc1            #192 <String "play">
    //  218  457:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  219  460:ifeq            469
    //  220  463:aload           14
    //  221  465:invokevirtual   #195 <Method void AdVideoView.d()>
    //  222  468:return          
    //  223  469:aload           4
    //  224  471:ldc1            #197 <String "show">
    //  225  473:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  226  476:ifeq            486
    //  227  479:aload           14
    //  228  481:iconst_0        
    //  229  482:invokevirtual   #181 <Method void AdVideoView.setVisibility(int)>
    //  230  485:return          
    //  231  486:aload           4
    //  232  488:ldc1            #199 <String "src">
    //  233  490:invokevirtual   #90  <Method boolean String.equals(Object)>
    //  234  493:ifeq            511
    //  235  496:aload           14
    //  236  498:aload_2         
    //  237  499:ldc1            #199 <String "src">
    //  238  501:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //  239  504:checkcast       #37  <Class String>
    //  240  507:invokevirtual   #202 <Method void AdVideoView.setSrc(String)>
    //  241  510:return          
    //  242  511:new             #51  <Class StringBuilder>
    //  243  514:dup             
    //  244  515:invokespecial   #52  <Method void StringBuilder()>
    //  245  518:ldc1            #204 <String "Unknown video action: ">
    //  246  520:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  247  523:aload           4
    //  248  525:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  249  528:invokevirtual   #64  <Method String StringBuilder.toString()>
    //  250  531:invokestatic    #69  <Method void b.a(String)>
    //  251  534:return          
    }

    private static final a a;
}
