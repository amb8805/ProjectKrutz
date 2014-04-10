// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.util.i;

// Referenced classes of package com.google.ads:
//            m, Ad, AdView, InterstitialAd

public class n extends i
{

    public n(m m1, Ad ad, AdView adview, InterstitialAd interstitialad, String s1, Activity activity, Context context, 
            ViewGroup viewgroup, h h1, d d1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #51  <Method void i()>
    //    2    4:aload_0         
    //    3    5:new             #53  <Class com.google.ads.util.i$c>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:ldc1            #55  <String "currentAd">
    //    7   12:aconst_null     
    //    8   13:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //    9   16:putfield        #60  <Field com.google.ads.util.i$c l>
    //   10   19:aload_0         
    //   11   20:new             #53  <Class com.google.ads.util.i$c>
    //   12   23:dup             
    //   13   24:aload_0         
    //   14   25:ldc1            #62  <String "nextAd">
    //   15   27:aconst_null     
    //   16   28:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //   17   31:putfield        #64  <Field com.google.ads.util.i$c m>
    //   18   34:aload_0         
    //   19   35:new             #53  <Class com.google.ads.util.i$c>
    //   20   38:dup             
    //   21   39:aload_0         
    //   22   40:ldc1            #66  <String "adListener">
    //   23   42:invokespecial   #69  <Method void com.google.ads.util.i$c(i, String)>
    //   24   45:putfield        #71  <Field com.google.ads.util.i$c o>
    //   25   48:aload_0         
    //   26   49:new             #53  <Class com.google.ads.util.i$c>
    //   27   52:dup             
    //   28   53:aload_0         
    //   29   54:ldc1            #73  <String "appEventListener">
    //   30   56:invokespecial   #69  <Method void com.google.ads.util.i$c(i, String)>
    //   31   59:putfield        #75  <Field com.google.ads.util.i$c p>
    //   32   62:aload_0         
    //   33   63:new             #53  <Class com.google.ads.util.i$c>
    //   34   66:dup             
    //   35   67:aload_0         
    //   36   68:ldc1            #77  <String "swipeableEventListener">
    //   37   70:invokespecial   #69  <Method void com.google.ads.util.i$c(i, String)>
    //   38   73:putfield        #79  <Field com.google.ads.util.i$c q>
    //   39   76:aload_0         
    //   40   77:new             #53  <Class com.google.ads.util.i$c>
    //   41   80:dup             
    //   42   81:aload_0         
    //   43   82:ldc1            #81  <String "spamSignals">
    //   44   84:aconst_null     
    //   45   85:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //   46   88:putfield        #83  <Field com.google.ads.util.i$c r>
    //   47   91:aload_0         
    //   48   92:new             #53  <Class com.google.ads.util.i$c>
    //   49   95:dup             
    //   50   96:aload_0         
    //   51   97:ldc1            #85  <String "spamSignalsUtil">
    //   52   99:aconst_null     
    //   53  100:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //   54  103:putfield        #87  <Field com.google.ads.util.i$c s>
    //   55  106:aload_0         
    //   56  107:new             #53  <Class com.google.ads.util.i$c>
    //   57  110:dup             
    //   58  111:aload_0         
    //   59  112:ldc1            #89  <String "usesManualImpressions">
    //   60  114:iconst_0        
    //   61  115:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
    //   62  118:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //   63  121:putfield        #97  <Field com.google.ads.util.i$c t>
    //   64  124:aload_0         
    //   65  125:new             #99  <Class com.google.ads.util.i$b>
    //   66  128:dup             
    //   67  129:aload_0         
    //   68  130:ldc1            #101 <String "appState">
    //   69  132:aload_1         
    //   70  133:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //   71  136:putfield        #104 <Field com.google.ads.util.i$b d>
    //   72  139:aload_0         
    //   73  140:new             #99  <Class com.google.ads.util.i$b>
    //   74  143:dup             
    //   75  144:aload_0         
    //   76  145:ldc1            #106 <String "ad">
    //   77  147:aload_2         
    //   78  148:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //   79  151:putfield        #108 <Field com.google.ads.util.i$b a>
    //   80  154:aload_0         
    //   81  155:new             #99  <Class com.google.ads.util.i$b>
    //   82  158:dup             
    //   83  159:aload_0         
    //   84  160:ldc1            #110 <String "adView">
    //   85  162:aload_3         
    //   86  163:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //   87  166:putfield        #112 <Field com.google.ads.util.i$b j>
    //   88  169:aload_0         
    //   89  170:new             #99  <Class com.google.ads.util.i$b>
    //   90  173:dup             
    //   91  174:aload_0         
    //   92  175:ldc1            #114 <String "adType">
    //   93  177:aload           9
    //   94  179:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //   95  182:putfield        #116 <Field com.google.ads.util.i$b g>
    //   96  185:aload_0         
    //   97  186:new             #99  <Class com.google.ads.util.i$b>
    //   98  189:dup             
    //   99  190:aload_0         
    //  100  191:ldc1            #118 <String "adUnitId">
    //  101  193:aload           5
    //  102  195:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  103  198:putfield        #120 <Field com.google.ads.util.i$b h>
    //  104  201:aload_0         
    //  105  202:new             #122 <Class com.google.ads.util.i$d>
    //  106  205:dup             
    //  107  206:aload_0         
    //  108  207:ldc1            #124 <String "activity">
    //  109  209:aload           6
    //  110  211:invokespecial   #125 <Method void com.google.ads.util.i$d(i, String, Object)>
    //  111  214:putfield        #127 <Field com.google.ads.util.i$d c>
    //  112  217:aload_0         
    //  113  218:new             #99  <Class com.google.ads.util.i$b>
    //  114  221:dup             
    //  115  222:aload_0         
    //  116  223:ldc1            #129 <String "interstitialAd">
    //  117  225:aload           4
    //  118  227:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  119  230:putfield        #131 <Field com.google.ads.util.i$b k>
    //  120  233:aload_0         
    //  121  234:new             #99  <Class com.google.ads.util.i$b>
    //  122  237:dup             
    //  123  238:aload_0         
    //  124  239:ldc1            #133 <String "bannerContainer">
    //  125  241:aload           8
    //  126  243:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  127  246:putfield        #135 <Field com.google.ads.util.i$b i>
    //  128  249:aload_0         
    //  129  250:new             #99  <Class com.google.ads.util.i$b>
    //  130  253:dup             
    //  131  254:aload_0         
    //  132  255:ldc1            #137 <String "applicationContext">
    //  133  257:aload           7
    //  134  259:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  135  262:putfield        #139 <Field com.google.ads.util.i$b f>
    //  136  265:aload_0         
    //  137  266:new             #53  <Class com.google.ads.util.i$c>
    //  138  269:dup             
    //  139  270:aload_0         
    //  140  271:ldc1            #141 <String "adSizes">
    //  141  273:aconst_null     
    //  142  274:invokespecial   #58  <Method void com.google.ads.util.i$c(i, String, Object)>
    //  143  277:putfield        #143 <Field com.google.ads.util.i$c n>
    //  144  280:aload_0         
    //  145  281:new             #99  <Class com.google.ads.util.i$b>
    //  146  284:dup             
    //  147  285:aload_0         
    //  148  286:ldc1            #145 <String "adManager">
    //  149  288:aload           10
    //  150  290:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  151  293:putfield        #147 <Field com.google.ads.util.i$b b>
    //  152  296:aconst_null     
    //  153  297:astore          11
    //  154  299:aload           9
    //  155  301:ifnull          329
    //  156  304:aload           9
    //  157  306:invokevirtual   #152 <Method boolean h.b()>
    //  158  309:istore          12
    //  159  311:aconst_null     
    //  160  312:astore          11
    //  161  314:iload           12
    //  162  316:ifeq            329
    //  163  319:new             #154 <Class ActivationOverlay>
    //  164  322:dup             
    //  165  323:aload_0         
    //  166  324:invokespecial   #157 <Method void ActivationOverlay(n)>
    //  167  327:astore          11
    //  168  329:aload_0         
    //  169  330:new             #99  <Class com.google.ads.util.i$b>
    //  170  333:dup             
    //  171  334:aload_0         
    //  172  335:ldc1            #159 <String "activationOverlay">
    //  173  337:aload           11
    //  174  339:invokespecial   #102 <Method void com.google.ads.util.i$b(i, String, Object)>
    //  175  342:putfield        #161 <Field com.google.ads.util.i$b e>
    //  176  345:return          
    }

    public boolean a()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #162 <Method boolean b()>
    //    2    4:ifne            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public boolean b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field com.google.ads.util.i$b g>
    //    2    4:invokevirtual   #165 <Method Object com.google.ads.util.i$b.a()>
    //    3    7:checkcast       #149 <Class h>
    //    4   10:invokevirtual   #167 <Method boolean h.a()>
    //    5   13:ireturn         
    }

    public final com.google.ads.util.i.b a;
    public final com.google.ads.util.i.b b;
    public final com.google.ads.util.i.d c;
    public final com.google.ads.util.i.b d;
    public final com.google.ads.util.i.b e;
    public final com.google.ads.util.i.b f;
    public final com.google.ads.util.i.b g;
    public final com.google.ads.util.i.b h;
    public final com.google.ads.util.i.b i;
    public final com.google.ads.util.i.b j;
    public final com.google.ads.util.i.b k;
    public final com.google.ads.util.i.c l;
    public final com.google.ads.util.i.c m;
    public final com.google.ads.util.i.c n;
    public final com.google.ads.util.i.c o;
    public final com.google.ads.util.i.c p;
    public final com.google.ads.util.i.c q;
    public final com.google.ads.util.i.c r;
    public final com.google.ads.util.i.c s;
    public final com.google.ads.util.i.c t;
}
