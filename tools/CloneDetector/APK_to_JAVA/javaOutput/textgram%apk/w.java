// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.internal.d;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.google.ads:
//            o, n, m

public class w
    implements o
{

    public w()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #14  <String "url">
    //    2    3:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #22  <Class String>
    //    4    9:astore          4
    //    5   11:aload_2         
    //    6   12:ldc1            #24  <String "type">
    //    7   14:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    8   17:checkcast       #22  <Class String>
    //    9   20:astore          5
    //   10   22:aload_2         
    //   11   23:ldc1            #26  <String "afma_notify_dt">
    //   12   25:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   13   28:checkcast       #22  <Class String>
    //   14   31:astore          6
    //   15   33:aload_2         
    //   16   34:ldc1            #28  <String "activation_overlay_url">
    //   17   36:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   18   39:checkcast       #22  <Class String>
    //   19   42:astore          7
    //   20   44:aload_2         
    //   21   45:ldc1            #30  <String "check_packages">
    //   22   47:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   23   50:checkcast       #22  <Class String>
    //   24   53:astore          8
    //   25   55:ldc1            #32  <String "1">
    //   26   57:aload_2         
    //   27   58:ldc1            #34  <String "drt_include">
    //   28   60:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   29   63:invokevirtual   #38  <Method boolean String.equals(Object)>
    //   30   66:istore          9
    //   31   68:aload_2         
    //   32   69:ldc1            #40  <String "request_scenario">
    //   33   71:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   34   74:checkcast       #22  <Class String>
    //   35   77:astore          10
    //   36   79:ldc1            #32  <String "1">
    //   37   81:aload_2         
    //   38   82:ldc1            #42  <String "use_webview_loadurl">
    //   39   84:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   40   87:invokevirtual   #38  <Method boolean String.equals(Object)>
    //   41   90:istore          11
    //   42   92:getstatic       #48  <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.d>
    //   43   95:getfield        #52  <Field String com.google.ads.internal.c$d.e>
    //   44   98:aload           10
    //   45  100:invokevirtual   #38  <Method boolean String.equals(Object)>
    //   46  103:ifeq            270
    //   47  106:getstatic       #48  <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.d>
    //   48  109:astore          12
    //   49  111:new             #54  <Class StringBuilder>
    //   50  114:dup             
    //   51  115:invokespecial   #55  <Method void StringBuilder()>
    //   52  118:ldc1            #57  <String "Received ad url: <url: \"">
    //   53  120:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   54  123:aload           4
    //   55  125:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   56  128:ldc1            #63  <String "\" type: \"">
    //   57  130:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   58  133:aload           5
    //   59  135:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   60  138:ldc1            #65  <String "\" afmaNotifyDt: \"">
    //   61  140:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   62  143:aload           6
    //   63  145:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   64  148:ldc1            #67  <String "\" activationOverlayUrl: \"">
    //   65  150:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   66  153:aload           7
    //   67  155:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   68  158:ldc1            #69  <String "\" useWebViewLoadUrl: \"">
    //   69  160:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   70  163:iload           11
    //   71  165:invokevirtual   #72  <Method StringBuilder StringBuilder.append(boolean)>
    //   72  168:ldc1            #74  <String "\">">
    //   73  170:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   74  173:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   75  176:invokestatic    #84  <Method void b.c(String)>
    //   76  179:aload           8
    //   77  181:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
    //   78  184:ifne            386
    //   79  187:aload           4
    //   80  189:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
    //   81  192:ifne            386
    //   82  195:new             #92  <Class BigInteger>
    //   83  198:dup             
    //   84  199:iconst_1        
    //   85  200:newarray        byte[]
    //   86  202:invokespecial   #95  <Method void BigInteger(byte[])>
    //   87  205:astore          14
    //   88  207:aload           8
    //   89  209:ldc1            #97  <String ",">
    //   90  211:invokevirtual   #101 <Method String[] String.split(String)>
    //   91  214:astore          15
    //   92  216:iconst_0        
    //   93  217:istore          16
    //   94  219:aload           14
    //   95  221:astore          17
    //   96  223:iload           16
    //   97  225:aload           15
    //   98  227:arraylength     
    //   99  228:icmpge          322
    //  100  231:aload_1         
    //  101  232:invokevirtual   #107 <Method n d.i()>
    //  102  235:getfield        #112 <Field com.google.ads.util.i$d com.google.ads.n.c>
    //  103  238:invokevirtual   #117 <Method Object com.google.ads.util.i$d.a()>
    //  104  241:checkcast       #119 <Class Context>
    //  105  244:aload           15
    //  106  246:iload           16
    //  107  248:aaload          
    //  108  249:invokestatic    #124 <Method boolean AdUtil.a(Context, String)>
    //  109  252:ifeq            264
    //  110  255:aload           17
    //  111  257:iload           16
    //  112  259:invokevirtual   #128 <Method BigInteger BigInteger.setBit(int)>
    //  113  262:astore          17
    //  114  264:iinc            16  1
    //  115  267:goto            223
    //  116  270:getstatic       #130 <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.c>
    //  117  273:getfield        #52  <Field String com.google.ads.internal.c$d.e>
    //  118  276:aload           10
    //  119  278:invokevirtual   #38  <Method boolean String.equals(Object)>
    //  120  281:ifeq            292
    //  121  284:getstatic       #130 <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.c>
    //  122  287:astore          12
    //  123  289:goto            111
    //  124  292:getstatic       #132 <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.a>
    //  125  295:getfield        #52  <Field String com.google.ads.internal.c$d.e>
    //  126  298:aload           10
    //  127  300:invokevirtual   #38  <Method boolean String.equals(Object)>
    //  128  303:ifeq            314
    //  129  306:getstatic       #132 <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.a>
    //  130  309:astore          12
    //  131  311:goto            111
    //  132  314:getstatic       #135 <Field com.google.ads.internal.c$d com.google.ads.internal.c$d.b>
    //  133  317:astore          12
    //  134  319:goto            111
    //  135  322:getstatic       #141 <Field Locale Locale.US>
    //  136  325:ldc1            #143 <String "%X">
    //  137  327:iconst_1        
    //  138  328:anewarray       Object[]
    //  139  331:dup             
    //  140  332:iconst_0        
    //  141  333:aload           17
    //  142  335:aastore         
    //  143  336:invokestatic    #147 <Method String String.format(Locale, String, Object[])>
    //  144  339:astore          18
    //  145  341:aload           4
    //  146  343:ldc1            #149 <String "%40installed_markets%40">
    //  147  345:aload           18
    //  148  347:invokevirtual   #153 <Method String String.replaceAll(String, String)>
    //  149  350:astore          4
    //  150  352:invokestatic    #158 <Method m m.a()>
    //  151  355:getfield        #161 <Field com.google.ads.util.i$c m.a>
    //  152  358:aload           18
    //  153  360:invokevirtual   #166 <Method void com.google.ads.util.i$c.a(Object)>
    //  154  363:new             #54  <Class StringBuilder>
    //  155  366:dup             
    //  156  367:invokespecial   #55  <Method void StringBuilder()>
    //  157  370:ldc1            #168 <String "Ad url modified to ">
    //  158  372:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  159  375:aload           4
    //  160  377:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  161  380:invokevirtual   #78  <Method String StringBuilder.toString()>
    //  162  383:invokestatic    #84  <Method void b.c(String)>
    //  163  386:aload_1         
    //  164  387:invokevirtual   #172 <Method c d.k()>
    //  165  390:astore          13
    //  166  392:aload           13
    //  167  394:ifnull          432
    //  168  397:aload           13
    //  169  399:iload           9
    //  170  401:invokevirtual   #177 <Method void c.d(boolean)>
    //  171  404:aload           13
    //  172  406:aload           12
    //  173  408:invokevirtual   #180 <Method void c.a(com.google.ads.internal.c$d)>
    //  174  411:aload           13
    //  175  413:iload           11
    //  176  415:invokevirtual   #182 <Method void c.e(boolean)>
    //  177  418:aload           13
    //  178  420:aload           7
    //  179  422:invokevirtual   #184 <Method void c.e(String)>
    //  180  425:aload           13
    //  181  427:aload           4
    //  182  429:invokevirtual   #186 <Method void c.d(String)>
    //  183  432:return          
    }
}
