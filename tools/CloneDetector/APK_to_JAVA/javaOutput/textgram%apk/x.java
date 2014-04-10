// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o, n, m, al

public class x
    implements o
{

    public x()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    private void a(HashMap hashmap, String s, com.google.ads.util.i.c c1)
    {
    // try 0 27 handler(s) 28
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    5:checkcast       #22  <Class String>
    //    4    8:astore          5
    //    5   10:aload           5
    //    6   12:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
    //    7   15:ifne            27
    //    8   18:aload_3         
    //    9   19:aload           5
    //   10   21:invokestatic    #34  <Method Integer Integer.valueOf(String)>
    //   11   24:invokevirtual   #39  <Method void com.google.ads.util.i$c.a(Object)>
    //   12   27:return          
    // catch NumberFormatException
    //   13   28:astore          4
    //   14   30:new             #41  <Class StringBuilder>
    //   15   33:dup             
    //   16   34:invokespecial   #42  <Method void StringBuilder()>
    //   17   37:ldc1            #44  <String "Could not parse \"">
    //   18   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   19   42:aload_2         
    //   20   43:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   21   46:ldc1            #50  <String "\" constant.">
    //   22   48:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   23   51:invokevirtual   #54  <Method String StringBuilder.toString()>
    //   24   54:invokestatic    #59  <Method void b.a(String)>
    //   25   57:return          
    }

    private void b(HashMap hashmap, String s, com.google.ads.util.i.c c1)
    {
    // try 0 27 handler(s) 28
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    5:checkcast       #22  <Class String>
    //    4    8:astore          5
    //    5   10:aload           5
    //    6   12:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
    //    7   15:ifne            27
    //    8   18:aload_3         
    //    9   19:aload           5
    //   10   21:invokestatic    #65  <Method Long Long.valueOf(String)>
    //   11   24:invokevirtual   #39  <Method void com.google.ads.util.i$c.a(Object)>
    //   12   27:return          
    // catch NumberFormatException
    //   13   28:astore          4
    //   14   30:new             #41  <Class StringBuilder>
    //   15   33:dup             
    //   16   34:invokespecial   #42  <Method void StringBuilder()>
    //   17   37:ldc1            #44  <String "Could not parse \"">
    //   18   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   19   42:aload_2         
    //   20   43:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   21   46:ldc1            #50  <String "\" constant.">
    //   22   48:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   23   51:invokevirtual   #54  <Method String StringBuilder.toString()>
    //   24   54:invokestatic    #59  <Method void b.a(String)>
    //   25   57:return          
    }

    private void c(HashMap hashmap, String s, com.google.ads.util.i.c c1)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    5:checkcast       #22  <Class String>
    //    4    8:astore          4
    //    5   10:aload           4
    //    6   12:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
    //    7   15:ifne            24
    //    8   18:aload_3         
    //    9   19:aload           4
    //   10   21:invokevirtual   #39  <Method void com.google.ads.util.i$c.a(Object)>
    //   11   24:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #73  <Method n d.i()>
    //    2    4:astore          4
    //    3    6:aload           4
    //    4    8:getfield        #79  <Field com.google.ads.util.i$b com.google.ads.n.d>
    //    5   11:invokevirtual   #84  <Method Object com.google.ads.util.i$b.a()>
    //    6   14:checkcast       #86  <Class m>
    //    7   17:getfield        #88  <Field com.google.ads.util.i$b com.google.ads.m.b>
    //    8   20:invokevirtual   #84  <Method Object com.google.ads.util.i$b.a()>
    //    9   23:checkcast       #90  <Class m$a>
    //   10   26:astore          5
    //   11   28:aload_0         
    //   12   29:aload_2         
    //   13   30:ldc1            #92  <String "as_domains">
    //   14   32:aload           5
    //   15   34:getfield        #95  <Field com.google.ads.util.i$c m$a.a>
    //   16   37:invokespecial   #97  <Method void c(HashMap, String, com.google.ads.util.i$c)>
    //   17   40:aload_0         
    //   18   41:aload_2         
    //   19   42:ldc1            #99  <String "bad_ad_report_path">
    //   20   44:aload           5
    //   21   46:getfield        #102 <Field com.google.ads.util.i$c com.google.ads.m$a.h>
    //   22   49:invokespecial   #97  <Method void c(HashMap, String, com.google.ads.util.i$c)>
    //   23   52:aload_0         
    //   24   53:aload_2         
    //   25   54:ldc1            #104 <String "min_hwa_banner">
    //   26   56:aload           5
    //   27   58:getfield        #106 <Field com.google.ads.util.i$c com.google.ads.m$a.b>
    //   28   61:invokespecial   #108 <Method void a(HashMap, String, com.google.ads.util.i$c)>
    //   29   64:aload_0         
    //   30   65:aload_2         
    //   31   66:ldc1            #110 <String "min_hwa_activation_overlay">
    //   32   68:aload           5
    //   33   70:getfield        #112 <Field com.google.ads.util.i$c m$a.c>
    //   34   73:invokespecial   #108 <Method void a(HashMap, String, com.google.ads.util.i$c)>
    //   35   76:aload_0         
    //   36   77:aload_2         
    //   37   78:ldc1            #114 <String "min_hwa_overlay">
    //   38   80:aload           5
    //   39   82:getfield        #116 <Field com.google.ads.util.i$c com.google.ads.m$a.d>
    //   40   85:invokespecial   #108 <Method void a(HashMap, String, com.google.ads.util.i$c)>
    //   41   88:aload_0         
    //   42   89:aload_2         
    //   43   90:ldc1            #118 <String "mraid_banner_path">
    //   44   92:aload           5
    //   45   94:getfield        #121 <Field com.google.ads.util.i$c m$a.e>
    //   46   97:invokespecial   #97  <Method void c(HashMap, String, com.google.ads.util.i$c)>
    //   47  100:aload_0         
    //   48  101:aload_2         
    //   49  102:ldc1            #123 <String "mraid_expanded_banner_path">
    //   50  104:aload           5
    //   51  106:getfield        #126 <Field com.google.ads.util.i$c m$a.f>
    //   52  109:invokespecial   #97  <Method void c(HashMap, String, com.google.ads.util.i$c)>
    //   53  112:aload_0         
    //   54  113:aload_2         
    //   55  114:ldc1            #128 <String "mraid_interstitial_path">
    //   56  116:aload           5
    //   57  118:getfield        #131 <Field com.google.ads.util.i$c com.google.ads.m$a.g>
    //   58  121:invokespecial   #97  <Method void c(HashMap, String, com.google.ads.util.i$c)>
    //   59  124:aload_0         
    //   60  125:aload_2         
    //   61  126:ldc1            #133 <String "ac_max_size">
    //   62  128:aload           5
    //   63  130:getfield        #135 <Field com.google.ads.util.i$c m$a.i>
    //   64  133:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   65  136:aload_0         
    //   66  137:aload_2         
    //   67  138:ldc1            #139 <String "ac_padding">
    //   68  140:aload           5
    //   69  142:getfield        #142 <Field com.google.ads.util.i$c m$a.j>
    //   70  145:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   71  148:aload_0         
    //   72  149:aload_2         
    //   73  150:ldc1            #144 <String "ac_total_quota">
    //   74  152:aload           5
    //   75  154:getfield        #147 <Field com.google.ads.util.i$c m$a.k>
    //   76  157:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   77  160:aload_0         
    //   78  161:aload_2         
    //   79  162:ldc1            #149 <String "db_total_quota">
    //   80  164:aload           5
    //   81  166:getfield        #152 <Field com.google.ads.util.i$c m$a.l>
    //   82  169:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   83  172:aload_0         
    //   84  173:aload_2         
    //   85  174:ldc1            #154 <String "db_quota_per_origin">
    //   86  176:aload           5
    //   87  178:getfield        #157 <Field com.google.ads.util.i$c m$a.m>
    //   88  181:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   89  184:aload_0         
    //   90  185:aload_2         
    //   91  186:ldc1            #159 <String "db_quota_step_size">
    //   92  188:aload           5
    //   93  190:getfield        #162 <Field com.google.ads.util.i$c m$a.n>
    //   94  193:invokespecial   #137 <Method void b(HashMap, String, com.google.ads.util.i$c)>
    //   95  196:aload_1         
    //   96  197:invokevirtual   #165 <Method AdWebView d.l()>
    //   97  200:astore          6
    //   98  202:getstatic       #170 <Field int AdUtil.a>
    //   99  205:bipush          11
    //  100  207:icmplt          229
    //  101  210:aload           6
    //  102  212:invokevirtual   #176 <Method android.webkit.WebSettings AdWebView.getSettings()>
    //  103  215:aload           4
    //  104  217:invokestatic    #181 <Method void g.a(android.webkit.WebSettings, n)>
    //  105  220:aload_3         
    //  106  221:invokevirtual   #184 <Method android.webkit.WebSettings WebView.getSettings()>
    //  107  224:aload           4
    //  108  226:invokestatic    #181 <Method void g.a(android.webkit.WebSettings, n)>
    //  109  229:aload           4
    //  110  231:getfield        #186 <Field com.google.ads.util.i$b com.google.ads.n.g>
    //  111  234:invokevirtual   #84  <Method Object com.google.ads.util.i$b.a()>
    //  112  237:checkcast       #188 <Class h>
    //  113  240:invokevirtual   #191 <Method boolean h.a()>
    //  114  243:ifne            296
    //  115  246:aload           6
    //  116  248:invokevirtual   #193 <Method boolean AdWebView.k()>
    //  117  251:istore          12
    //  118  253:getstatic       #170 <Field int AdUtil.a>
    //  119  256:aload           5
    //  120  258:getfield        #106 <Field com.google.ads.util.i$c com.google.ads.m$a.b>
    //  121  261:invokevirtual   #194 <Method Object com.google.ads.util.i$c.a()>
    //  122  264:checkcast       #30  <Class Integer>
    //  123  267:invokevirtual   #198 <Method int Integer.intValue()>
    //  124  270:icmpge          440
    //  125  273:iconst_1        
    //  126  274:istore          13
    //  127  276:iload           13
    //  128  278:ifne            446
    //  129  281:iload           12
    //  130  283:ifeq            446
    //  131  286:ldc1            #200 <String "Re-enabling hardware acceleration for a banner after reading constants.">
    //  132  288:invokestatic    #59  <Method void b.a(String)>
    //  133  291:aload           6
    //  134  293:invokevirtual   #202 <Method void AdWebView.h()>
    //  135  296:aload           4
    //  136  298:getfield        #204 <Field com.google.ads.util.i$b n.e>
    //  137  301:invokevirtual   #84  <Method Object com.google.ads.util.i$b.a()>
    //  138  304:checkcast       #206 <Class ActivationOverlay>
    //  139  307:astore          7
    //  140  309:aload           4
    //  141  311:getfield        #186 <Field com.google.ads.util.i$b com.google.ads.n.g>
    //  142  314:invokevirtual   #84  <Method Object com.google.ads.util.i$b.a()>
    //  143  317:checkcast       #188 <Class h>
    //  144  320:invokevirtual   #208 <Method boolean h.b()>
    //  145  323:ifne            381
    //  146  326:aload           7
    //  147  328:ifnull          381
    //  148  331:aload           7
    //  149  333:invokevirtual   #209 <Method boolean ActivationOverlay.k()>
    //  150  336:istore          10
    //  151  338:getstatic       #170 <Field int AdUtil.a>
    //  152  341:aload           5
    //  153  343:getfield        #112 <Field com.google.ads.util.i$c m$a.c>
    //  154  346:invokevirtual   #194 <Method Object com.google.ads.util.i$c.a()>
    //  155  349:checkcast       #30  <Class Integer>
    //  156  352:invokevirtual   #198 <Method int Integer.intValue()>
    //  157  355:icmpge          469
    //  158  358:iconst_1        
    //  159  359:istore          11
    //  160  361:iload           11
    //  161  363:ifne            475
    //  162  366:iload           10
    //  163  368:ifeq            475
    //  164  371:ldc1            #211 <String "Re-enabling hardware acceleration for an activation overlay after reading constants.">
    //  165  373:invokestatic    #59  <Method void b.a(String)>
    //  166  376:aload           7
    //  167  378:invokevirtual   #212 <Method void ActivationOverlay.h()>
    //  168  381:aload           5
    //  169  383:getfield        #95  <Field com.google.ads.util.i$c m$a.a>
    //  170  386:invokevirtual   #194 <Method Object com.google.ads.util.i$c.a()>
    //  171  389:checkcast       #22  <Class String>
    //  172  392:astore          8
    //  173  394:aload           4
    //  174  396:getfield        #215 <Field com.google.ads.util.i$c n.s>
    //  175  399:invokevirtual   #194 <Method Object com.google.ads.util.i$c.a()>
    //  176  402:checkcast       #217 <Class al>
    //  177  405:astore          9
    //  178  407:aload           9
    //  179  409:ifnull          427
    //  180  412:aload           8
    //  181  414:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
    //  182  417:ifne            427
    //  183  420:aload           9
    //  184  422:aload           8
    //  185  424:invokevirtual   #218 <Method void al.a(String)>
    //  186  427:aload           5
    //  187  429:getfield        #221 <Field com.google.ads.util.i$c m$a.o>
    //  188  432:iconst_1        
    //  189  433:invokestatic    #226 <Method Boolean Boolean.valueOf(boolean)>
    //  190  436:invokevirtual   #39  <Method void com.google.ads.util.i$c.a(Object)>
    //  191  439:return          
    //  192  440:iconst_0        
    //  193  441:istore          13
    //  194  443:goto            276
    //  195  446:iload           13
    //  196  448:ifeq            296
    //  197  451:iload           12
    //  198  453:ifne            296
    //  199  456:ldc1            #228 <String "Disabling hardware acceleration for a banner after reading constants.">
    //  200  458:invokestatic    #59  <Method void b.a(String)>
    //  201  461:aload           6
    //  202  463:invokevirtual   #230 <Method void AdWebView.g()>
    //  203  466:goto            296
    //  204  469:iconst_0        
    //  205  470:istore          11
    //  206  472:goto            361
    //  207  475:iload           11
    //  208  477:ifeq            381
    //  209  480:iload           10
    //  210  482:ifne            381
    //  211  485:ldc1            #232 <String "Disabling hardware acceleration for an activation overlay after reading constants.">
    //  212  487:invokestatic    #59  <Method void b.a(String)>
    //  213  490:aload           7
    //  214  492:invokevirtual   #233 <Method void ActivationOverlay.g()>
    //  215  495:goto            381
    }
}
