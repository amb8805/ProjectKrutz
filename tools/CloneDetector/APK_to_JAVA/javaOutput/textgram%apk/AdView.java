// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.b;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.internal.k;
import com.google.ads.util.AdUtil;
import com.google.ads.util.f;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.ads:
//            Ad, AdSize, AdRequest, n, 
//            AdActivity, AdListener, AppEventListener, SwipeableAdListener

public class AdView extends RelativeLayout
    implements Ad
{

    static 
    {
    //    0    0:getstatic       #17  <Field f a.a>
    //    1    3:invokeinterface #22  <Method Object f.b()>
    //    2    8:checkcast       #14  <Class a>
    //    3   11:putstatic       #24  <Field a b>
    //    4   14:return          
    }

    public AdView(Activity activity, AdSize adsize, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #34  <Method Context Activity.getApplicationContext()>
    //    3    5:invokespecial   #37  <Method void RelativeLayout(Context)>
    // try 8 31 handler(s) 32
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:aload_2         
    //    7   11:aconst_null     
    //    8   12:invokespecial   #40  <Method boolean a(Context, AdSize, AttributeSet)>
    //    9   15:pop             
    //   10   16:aload_0         
    //   11   17:aload_1         
    //   12   18:aload_2         
    //   13   19:aconst_null     
    //   14   20:invokespecial   #42  <Method boolean b(Context, AdSize, AttributeSet)>
    //   15   23:pop             
    //   16   24:aload_0         
    //   17   25:aload_1         
    //   18   26:aload_2         
    //   19   27:aload_3         
    //   20   28:invokespecial   #44  <Method void a(Activity, AdSize, String)>
    //   21   31:return          
    // catch b
    //   22   32:astore          4
    //   23   34:aload_0         
    //   24   35:aload_1         
    //   25   36:aload           4
    //   26   38:ldc1            #46  <String "Could not initialize AdView">
    //   27   40:invokevirtual   #50  <Method String b.c(String)>
    //   28   43:aload_2         
    //   29   44:aconst_null     
    //   30   45:invokespecial   #53  <Method void a(Context, String, AdSize, AttributeSet)>
    //   31   48:aload           4
    //   32   50:ldc1            #46  <String "Could not initialize AdView">
    //   33   52:invokevirtual   #56  <Method void b.a(String)>
    //   34   55:return          
    }

    protected AdView(Activity activity, AdSize aadsize[], String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:new             #59  <Class AdSize>
    //    3    5:dup             
    //    4    6:iconst_0        
    //    5    7:iconst_0        
    //    6    8:invokespecial   #62  <Method void AdSize(int, int)>
    //    7   11:aload_3         
    //    8   12:invokespecial   #64  <Method void AdView(Activity, AdSize, String)>
    //    9   15:aload_0         
    //   10   16:aload_2         
    //   11   17:invokespecial   #67  <Method void a(AdSize[])>
    //   12   20:return          
    }

    public AdView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #70  <Method void RelativeLayout(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:aload_2         
    //    7    9:invokespecial   #72  <Method void a(Context, AttributeSet)>
    //    8   12:return          
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #74  <Method void AdView(Context, AttributeSet)>
    //    4    6:return          
    }

    private void a(Activity activity, AdSize adsize, String s)
        throws b
    {
    //    0    0:new             #78  <Class FrameLayout>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #79  <Method void FrameLayout(Context)>
    //    4    8:astore          4
    //    5   10:aload           4
    //    6   12:iconst_0        
    //    7   13:invokevirtual   #83  <Method void FrameLayout.setFocusable(boolean)>
    //    8   16:aload_0         
    //    9   17:new             #85  <Class d>
    //   10   20:dup             
    //   11   21:aload_0         
    //   12   22:aload_1         
    //   13   23:aload_2         
    //   14   24:aload_3         
    //   15   25:aload           4
    //   16   27:iconst_0        
    //   17   28:invokespecial   #88  <Method void d(Ad, Activity, AdSize, String, ViewGroup, boolean)>
    //   18   31:putfield        #90  <Field d a>
    //   19   34:aload_0         
    //   20   35:bipush          17
    //   21   37:invokevirtual   #94  <Method void setGravity(int)>
    // try 40 50 handler(s) 88
    //   22   40:aload_1         
    //   23   41:aload_0         
    //   24   42:getfield        #90  <Field d a>
    //   25   45:invokestatic    #99  <Method ViewGroup k.a(Activity, d)>
    //   26   48:astore          6
    //   27   50:aload           6
    //   28   52:ifnull          77
    // try 55 76 handler(s) 88
    //   29   55:aload           6
    //   30   57:aload           4
    //   31   59:bipush          -2
    //   32   61:bipush          -2
    //   33   63:invokevirtual   #105 <Method void ViewGroup.addView(android.view.View, int, int)>
    //   34   66:aload_0         
    //   35   67:aload           6
    //   36   69:bipush          -2
    //   37   71:bipush          -2
    //   38   73:invokevirtual   #106 <Method void addView(android.view.View, int, int)>
    //   39   76:return          
    // try 77 87 handler(s) 88
    //   40   77:aload_0         
    //   41   78:aload           4
    //   42   80:bipush          -2
    //   43   82:bipush          -2
    //   44   84:invokevirtual   #106 <Method void addView(android.view.View, int, int)>
    //   45   87:return          
    // catch VerifyError VerifyError VerifyError
    //   46   88:astore          5
    //   47   90:ldc1            #108 <String "Gestures disabled: Not supported on this version of Android.">
    //   48   92:aload           5
    //   49   94:invokestatic    #113 <Method void com.google.ads.util.b.a(String, Throwable)>
    //   50   97:aload_0         
    //   51   98:aload           4
    //   52  100:bipush          -2
    //   53  102:bipush          -2
    //   54  104:invokevirtual   #106 <Method void addView(android.view.View, int, int)>
    //   55  107:return          
    }

    private void a(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_2         
    //    1    1:ifnonnull       5
    //    2    4:return          
    // try 5 24 handler(s) 375
    //    3    5:aload_0         
    //    4    6:ldc1            #115 <String "adSize">
    //    5    8:aload_1         
    //    6    9:aload_2         
    //    7   10:iconst_1        
    //    8   11:invokespecial   #118 <Method String b(String, Context, AttributeSet, boolean)>
    //    9   14:astore          8
    //   10   16:aload_0         
    //   11   17:aload           8
    //   12   19:invokevirtual   #121 <Method AdSize[] a(String)>
    //   13   22:astore          9
    //   14   24:aload           9
    //   15   26:ifnull          35
    // try 29 35 handler(s) 64
    //   16   29:aload           9
    //   17   31:arraylength     
    //   18   32:ifne            132
    // try 35 64 handler(s) 64
    //   19   35:new             #28  <Class b>
    //   20   38:dup             
    //   21   39:new             #123 <Class StringBuilder>
    //   22   42:dup             
    //   23   43:invokespecial   #125 <Method void StringBuilder()>
    //   24   46:ldc1            #127 <String "Attribute \"adSize\" invalid: ">
    //   25   48:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   26   51:aload           8
    //   27   53:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   28   56:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   29   59:iconst_1        
    //   30   60:invokespecial   #138 <Method void b(String, boolean)>
    //   31   63:athrow          
    // catch b b b b b b b b b
    //   32   64:astore          10
    //   33   66:aload           10
    //   34   68:astore          4
    //   35   70:aload           9
    //   36   72:astore          5
    //   37   74:aload           4
    //   38   76:ldc1            #46  <String "Could not initialize AdView">
    //   39   78:invokevirtual   #50  <Method String b.c(String)>
    //   40   81:astore          6
    //   41   83:aload           5
    //   42   85:ifnull          367
    //   43   88:aload           5
    //   44   90:arraylength     
    //   45   91:ifle            367
    //   46   94:aload           5
    //   47   96:iconst_0        
    //   48   97:aaload          
    //   49   98:astore          7
    //   50  100:aload_0         
    //   51  101:aload_1         
    //   52  102:aload           6
    //   53  104:aload           7
    //   54  106:aload_2         
    //   55  107:invokespecial   #53  <Method void a(Context, String, AdSize, AttributeSet)>
    //   56  110:aload           4
    //   57  112:ldc1            #46  <String "Could not initialize AdView">
    //   58  114:invokevirtual   #56  <Method void b.a(String)>
    //   59  117:aload_0         
    //   60  118:invokevirtual   #142 <Method boolean isInEditMode()>
    //   61  121:ifne            4
    //   62  124:aload           4
    //   63  126:ldc1            #46  <String "Could not initialize AdView">
    //   64  128:invokevirtual   #144 <Method void b.b(String)>
    //   65  131:return          
    // try 132 153 handler(s) 64
    //   66  132:aload_0         
    //   67  133:ldc1            #146 <String "adUnitId">
    //   68  135:aload_2         
    //   69  136:invokespecial   #149 <Method boolean a(String, AttributeSet)>
    //   70  139:ifne            153
    //   71  142:new             #28  <Class b>
    //   72  145:dup             
    //   73  146:ldc1            #151 <String "Required XML attribute \"adUnitId\" missing">
    //   74  148:iconst_1        
    //   75  149:invokespecial   #138 <Method void b(String, boolean)>
    //   76  152:athrow          
    // try 153 173 handler(s) 64
    //   77  153:aload_0         
    //   78  154:invokevirtual   #142 <Method boolean isInEditMode()>
    //   79  157:ifeq            174
    //   80  160:aload_0         
    //   81  161:aload_1         
    //   82  162:ldc1            #153 <String "Ads by Google">
    //   83  164:iconst_m1       
    //   84  165:aload           9
    //   85  167:iconst_0        
    //   86  168:aaload          
    //   87  169:aload_2         
    //   88  170:invokevirtual   #156 <Method void a(Context, String, int, AdSize, AttributeSet)>
    //   89  173:return          
    // try 174 252 handler(s) 64
    //   90  174:aload_0         
    //   91  175:ldc1            #146 <String "adUnitId">
    //   92  177:aload_1         
    //   93  178:aload_2         
    //   94  179:iconst_1        
    //   95  180:invokespecial   #118 <Method String b(String, Context, AttributeSet, boolean)>
    //   96  183:astore          11
    //   97  185:aload_0         
    //   98  186:ldc1            #158 <String "loadAdOnCreate">
    //   99  188:aload_1         
    //  100  189:aload_2         
    //  101  190:iconst_0        
    //  102  191:invokespecial   #161 <Method boolean a(String, Context, AttributeSet, boolean)>
    //  103  194:istore          12
    //  104  196:aload_1         
    //  105  197:instanceof      #30  <Class Activity>
    //  106  200:ifeq            356
    //  107  203:aload_1         
    //  108  204:checkcast       #30  <Class Activity>
    //  109  207:astore          13
    //  110  209:aload_0         
    //  111  210:aload           13
    //  112  212:aload           9
    //  113  214:iconst_0        
    //  114  215:aaload          
    //  115  216:aload_2         
    //  116  217:invokespecial   #40  <Method boolean a(Context, AdSize, AttributeSet)>
    //  117  220:pop             
    //  118  221:aload_0         
    //  119  222:aload           13
    //  120  224:aload           9
    //  121  226:iconst_0        
    //  122  227:aaload          
    //  123  228:aload_2         
    //  124  229:invokespecial   #42  <Method boolean b(Context, AdSize, AttributeSet)>
    //  125  232:pop             
    //  126  233:aload           9
    //  127  235:arraylength     
    //  128  236:iconst_1        
    //  129  237:icmpne          330
    //  130  240:aload_0         
    //  131  241:aload           13
    //  132  243:aload           9
    //  133  245:iconst_0        
    //  134  246:aaload          
    //  135  247:aload           11
    //  136  249:invokespecial   #44  <Method void a(Activity, AdSize, String)>
    //  137  252:iload           12
    //  138  254:ifeq            4
    // try 257 301 handler(s) 64
    //  139  257:aload_0         
    //  140  258:ldc1            #163 <String "testDevices">
    //  141  260:aload_1         
    //  142  261:aload_2         
    //  143  262:iconst_0        
    //  144  263:invokespecial   #166 <Method Set c(String, Context, AttributeSet, boolean)>
    //  145  266:astore          16
    //  146  268:aload           16
    //  147  270:ldc1            #168 <String "TEST_EMULATOR">
    //  148  272:invokeinterface #174 <Method boolean Set.contains(Object)>
    //  149  277:ifeq            301
    //  150  280:aload           16
    //  151  282:ldc1            #168 <String "TEST_EMULATOR">
    //  152  284:invokeinterface #177 <Method boolean Set.remove(Object)>
    //  153  289:pop             
    //  154  290:aload           16
    //  155  292:getstatic       #182 <Field String AdRequest.TEST_EMULATOR>
    //  156  295:invokeinterface #185 <Method boolean Set.add(Object)>
    //  157  300:pop             
    // try 301 329 handler(s) 64
    //  158  301:aload_0         
    //  159  302:new             #179 <Class AdRequest>
    //  160  305:dup             
    //  161  306:invokespecial   #186 <Method void AdRequest()>
    //  162  309:aload           16
    //  163  311:invokevirtual   #190 <Method AdRequest AdRequest.setTestDevices(Set)>
    //  164  314:aload_0         
    //  165  315:ldc1            #192 <String "keywords">
    //  166  317:aload_1         
    //  167  318:aload_2         
    //  168  319:iconst_0        
    //  169  320:invokespecial   #166 <Method Set c(String, Context, AttributeSet, boolean)>
    //  170  323:invokevirtual   #195 <Method AdRequest AdRequest.setKeywords(Set)>
    //  171  326:invokevirtual   #199 <Method void loadAd(AdRequest)>
    //  172  329:return          
    // try 330 353 handler(s) 64
    //  173  330:aload_0         
    //  174  331:aload           13
    //  175  333:new             #59  <Class AdSize>
    //  176  336:dup             
    //  177  337:iconst_0        
    //  178  338:iconst_0        
    //  179  339:invokespecial   #62  <Method void AdSize(int, int)>
    //  180  342:aload           11
    //  181  344:invokespecial   #44  <Method void a(Activity, AdSize, String)>
    //  182  347:aload_0         
    //  183  348:aload           9
    //  184  350:invokespecial   #67  <Method void a(AdSize[])>
    //  185  353:goto            252
    // try 356 367 handler(s) 64
    //  186  356:new             #28  <Class b>
    //  187  359:dup             
    //  188  360:ldc1            #201 <String "AdView was initialized with a Context that wasn't an Activity.">
    //  189  362:iconst_1        
    //  190  363:invokespecial   #138 <Method void b(String, boolean)>
    //  191  366:athrow          
    //  192  367:getstatic       #205 <Field AdSize AdSize.BANNER>
    //  193  370:astore          7
    //  194  372:goto            100
    // catch b
    //  195  375:astore_3        
    //  196  376:aload_3         
    //  197  377:astore          4
    //  198  379:aconst_null     
    //  199  380:astore          5
    //  200  382:goto            74
    }

    private void a(Context context, String s, AdSize adsize, AttributeSet attributeset)
    {
    //    0    0:aload_2         
    //    1    1:invokestatic    #206 <Method void com.google.ads.util.b.b(String)>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:aload_2         
    //    5    7:ldc1            #207 <Int 0xffff0000>
    //    6    9:aload_3         
    //    7   10:aload           4
    //    8   12:invokevirtual   #156 <Method void a(Context, String, int, AdSize, AttributeSet)>
    //    9   15:return          
    }

    private transient void a(AdSize aadsize[])
    {
    //    0    0:aload_1         
    //    1    1:arraylength     
    //    2    2:anewarray       AdSize[]
    //    3    5:astore_2        
    //    4    6:iconst_0        
    //    5    7:istore_3        
    //    6    8:iload_3         
    //    7    9:aload_1         
    //    8   10:arraylength     
    //    9   11:icmpge          33
    //   10   14:aload_2         
    //   11   15:iload_3         
    //   12   16:aload_1         
    //   13   17:iload_3         
    //   14   18:aaload          
    //   15   19:aload_0         
    //   16   20:invokevirtual   #210 <Method Context getContext()>
    //   17   23:invokestatic    #214 <Method AdSize AdSize.createAdSize(AdSize, Context)>
    //   18   26:aastore         
    //   19   27:iinc            3  1
    //   20   30:goto            8
    //   21   33:aload_0         
    //   22   34:getfield        #90  <Field d a>
    //   23   37:invokevirtual   #218 <Method n d.i()>
    //   24   40:getfield        #224 <Field com.google.ads.util.i$c n.n>
    //   25   43:aload_2         
    //   26   44:invokevirtual   #229 <Method void com.google.ads.util.i$c.a(Object)>
    //   27   47:return          
    }

    private boolean a(Context context, AdSize adsize, AttributeSet attributeset)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #234 <Method boolean AdUtil.c(Context)>
    //    2    4:ifne            18
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:ldc1            #236 <String "You must have AdActivity declared in AndroidManifest.xml with configChanges.">
    //    6   11:aload_2         
    //    7   12:aload_3         
    //    8   13:invokespecial   #53  <Method void a(Context, String, AdSize, AttributeSet)>
    //    9   16:iconst_0        
    //   10   17:ireturn         
    //   11   18:iconst_1        
    //   12   19:ireturn         
    }

    private boolean a(String s, Context context, AttributeSet attributeset, boolean flag)
        throws b
    {
    //    0    0:aload_3         
    //    1    1:ldc1            #240 <String "http://schemas.android.com/apk/lib/com.google.ads">
    //    2    3:aload_1         
    //    3    4:invokeinterface #246 <Method String AttributeSet.getAttributeValue(String, String)>
    //    4    9:astore          5
    //    5   11:aload_3         
    //    6   12:ldc1            #240 <String "http://schemas.android.com/apk/lib/com.google.ads">
    //    7   14:aload_1         
    //    8   15:iload           4
    //    9   17:invokeinterface #250 <Method boolean AttributeSet.getAttributeBooleanValue(String, String, boolean)>
    //   10   22:istore          6
    //   11   24:aload           5
    //   12   26:ifnull          247
    //   13   29:aload_2         
    //   14   30:invokevirtual   #255 <Method String Context.getPackageName()>
    //   15   33:astore          7
    //   16   35:aload           5
    //   17   37:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   18   40:invokevirtual   #263 <Method boolean String.matches(String)>
    //   19   43:ifeq            72
    //   20   46:aload           5
    //   21   48:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   22   51:ldc2            #265 <String "$1">
    //   23   54:invokevirtual   #268 <Method String String.replaceFirst(String, String)>
    //   24   57:astore          7
    //   25   59:aload           5
    //   26   61:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   27   64:ldc2            #270 <String "@$2">
    //   28   67:invokevirtual   #268 <Method String String.replaceFirst(String, String)>
    //   29   70:astore          5
    //   30   72:aload           5
    //   31   74:ldc2            #272 <String "@bool/">
    //   32   77:invokevirtual   #275 <Method boolean String.startsWith(String)>
    //   33   80:ifeq            247
    //   34   83:aload           5
    //   35   85:ldc2            #272 <String "@bool/">
    //   36   88:invokevirtual   #279 <Method int String.length()>
    //   37   91:invokevirtual   #283 <Method String String.substring(int)>
    //   38   94:astore          8
    //   39   96:new             #285 <Class TypedValue>
    //   40   99:dup             
    //   41  100:invokespecial   #286 <Method void TypedValue()>
    //   42  103:astore          9
    // try 105 141 handler(s) 161
    //   43  105:aload_0         
    //   44  106:invokevirtual   #290 <Method Resources getResources()>
    //   45  109:new             #123 <Class StringBuilder>
    //   46  112:dup             
    //   47  113:invokespecial   #125 <Method void StringBuilder()>
    //   48  116:aload           7
    //   49  118:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   50  121:ldc2            #292 <String ":bool/">
    //   51  124:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   52  127:aload           8
    //   53  129:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   54  132:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   55  135:aload           9
    //   56  137:iconst_1        
    //   57  138:invokevirtual   #298 <Method void Resources.getValue(String, TypedValue, boolean)>
    //   58  141:aload           9
    //   59  143:getfield        #302 <Field int TypedValue.type>
    //   60  146:bipush          18
    //   61  148:icmpne          207
    //   62  151:aload           9
    //   63  153:getfield        #305 <Field int TypedValue.data>
    //   64  156:ifeq            205
    //   65  159:iconst_1        
    //   66  160:ireturn         
    // catch android.content.res.Resources.NotFoundException
    //   67  161:astore          10
    //   68  163:new             #28  <Class b>
    //   69  166:dup             
    //   70  167:new             #123 <Class StringBuilder>
    //   71  170:dup             
    //   72  171:invokespecial   #125 <Method void StringBuilder()>
    //   73  174:ldc2            #307 <String "Could not find resource for ">
    //   74  177:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   75  180:aload_1         
    //   76  181:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   77  184:ldc2            #309 <String ": ">
    //   78  187:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   79  190:aload           5
    //   80  192:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   81  195:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   82  198:iconst_1        
    //   83  199:aload           10
    //   84  201:invokespecial   #312 <Method void b(String, boolean, Throwable)>
    //   85  204:athrow          
    //   86  205:iconst_0        
    //   87  206:ireturn         
    //   88  207:new             #28  <Class b>
    //   89  210:dup             
    //   90  211:new             #123 <Class StringBuilder>
    //   91  214:dup             
    //   92  215:invokespecial   #125 <Method void StringBuilder()>
    //   93  218:ldc2            #314 <String "Resource ">
    //   94  221:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   95  224:aload_1         
    //   96  225:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   97  228:ldc2            #316 <String " was not a boolean: ">
    //   98  231:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   99  234:aload           9
    //  100  236:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
    //  101  239:invokevirtual   #135 <Method String StringBuilder.toString()>
    //  102  242:iconst_1        
    //  103  243:invokespecial   #138 <Method void b(String, boolean)>
    //  104  246:athrow          
    //  105  247:iload           6
    //  106  249:ireturn         
    }

    private boolean a(String s, AttributeSet attributeset)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #240 <String "http://schemas.android.com/apk/lib/com.google.ads">
    //    2    3:aload_1         
    //    3    4:invokeinterface #246 <Method String AttributeSet.getAttributeValue(String, String)>
    //    4    9:ifnull          14
    //    5   12:iconst_1        
    //    6   13:ireturn         
    //    7   14:iconst_0        
    //    8   15:ireturn         
    }

    private String b(String s, Context context, AttributeSet attributeset, boolean flag)
        throws b
    {
    //    0    0:aload_3         
    //    1    1:ldc1            #240 <String "http://schemas.android.com/apk/lib/com.google.ads">
    //    2    3:aload_1         
    //    3    4:invokeinterface #246 <Method String AttributeSet.getAttributeValue(String, String)>
    //    4    9:astore          5
    //    5   11:aload           5
    //    6   13:ifnull          146
    //    7   16:aload_2         
    //    8   17:invokevirtual   #255 <Method String Context.getPackageName()>
    //    9   20:astore          6
    //   10   22:aload           5
    //   11   24:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   12   27:invokevirtual   #263 <Method boolean String.matches(String)>
    //   13   30:ifeq            59
    //   14   33:aload           5
    //   15   35:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   16   38:ldc2            #265 <String "$1">
    //   17   41:invokevirtual   #268 <Method String String.replaceFirst(String, String)>
    //   18   44:astore          6
    //   19   46:aload           5
    //   20   48:ldc2            #257 <String "^@([^:]+)\\:(.*)$">
    //   21   51:ldc2            #270 <String "@$2">
    //   22   54:invokevirtual   #268 <Method String String.replaceFirst(String, String)>
    //   23   57:astore          5
    //   24   59:aload           5
    //   25   61:ldc2            #321 <String "@string/">
    //   26   64:invokevirtual   #275 <Method boolean String.startsWith(String)>
    //   27   67:ifeq            146
    //   28   70:aload           5
    //   29   72:ldc2            #321 <String "@string/">
    //   30   75:invokevirtual   #279 <Method int String.length()>
    //   31   78:invokevirtual   #283 <Method String String.substring(int)>
    //   32   81:astore          7
    //   33   83:new             #285 <Class TypedValue>
    //   34   86:dup             
    //   35   87:invokespecial   #286 <Method void TypedValue()>
    //   36   90:astore          8
    // try 92 128 handler(s) 191
    //   37   92:aload_0         
    //   38   93:invokevirtual   #290 <Method Resources getResources()>
    //   39   96:new             #123 <Class StringBuilder>
    //   40   99:dup             
    //   41  100:invokespecial   #125 <Method void StringBuilder()>
    //   42  103:aload           6
    //   43  105:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   44  108:ldc2            #323 <String ":string/">
    //   45  111:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   46  114:aload           7
    //   47  116:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   48  119:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   49  122:aload           8
    //   50  124:iconst_1        
    //   51  125:invokevirtual   #298 <Method void Resources.getValue(String, TypedValue, boolean)>
    //   52  128:aload           8
    //   53  130:getfield        #327 <Field CharSequence TypedValue.string>
    //   54  133:ifnull          235
    //   55  136:aload           8
    //   56  138:getfield        #327 <Field CharSequence TypedValue.string>
    //   57  141:invokevirtual   #330 <Method String Object.toString()>
    //   58  144:astore          5
    //   59  146:iload           4
    //   60  148:ifeq            275
    //   61  151:aload           5
    //   62  153:ifnonnull       275
    //   63  156:new             #28  <Class b>
    //   64  159:dup             
    //   65  160:new             #123 <Class StringBuilder>
    //   66  163:dup             
    //   67  164:invokespecial   #125 <Method void StringBuilder()>
    //   68  167:ldc2            #332 <String "Required XML attribute \"">
    //   69  170:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   70  173:aload_1         
    //   71  174:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   72  177:ldc2            #334 <String "\" missing">
    //   73  180:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   74  183:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   75  186:iconst_1        
    //   76  187:invokespecial   #138 <Method void b(String, boolean)>
    //   77  190:athrow          
    // catch android.content.res.Resources.NotFoundException
    //   78  191:astore          9
    //   79  193:new             #28  <Class b>
    //   80  196:dup             
    //   81  197:new             #123 <Class StringBuilder>
    //   82  200:dup             
    //   83  201:invokespecial   #125 <Method void StringBuilder()>
    //   84  204:ldc2            #307 <String "Could not find resource for ">
    //   85  207:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   86  210:aload_1         
    //   87  211:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   88  214:ldc2            #309 <String ": ">
    //   89  217:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   90  220:aload           5
    //   91  222:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   92  225:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   93  228:iconst_1        
    //   94  229:aload           9
    //   95  231:invokespecial   #312 <Method void b(String, boolean, Throwable)>
    //   96  234:athrow          
    //   97  235:new             #28  <Class b>
    //   98  238:dup             
    //   99  239:new             #123 <Class StringBuilder>
    //  100  242:dup             
    //  101  243:invokespecial   #125 <Method void StringBuilder()>
    //  102  246:ldc2            #314 <String "Resource ">
    //  103  249:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //  104  252:aload_1         
    //  105  253:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //  106  256:ldc2            #336 <String " was not a string: ">
    //  107  259:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //  108  262:aload           8
    //  109  264:invokevirtual   #319 <Method StringBuilder StringBuilder.append(Object)>
    //  110  267:invokevirtual   #135 <Method String StringBuilder.toString()>
    //  111  270:iconst_1        
    //  112  271:invokespecial   #138 <Method void b(String, boolean)>
    //  113  274:athrow          
    //  114  275:aload           5
    //  115  277:areturn         
    }

    private boolean b(Context context, AdSize adsize, AttributeSet attributeset)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #338 <Method boolean AdUtil.b(Context)>
    //    2    4:ifne            19
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:ldc2            #340 <String "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.">
    //    6   12:aload_2         
    //    7   13:aload_3         
    //    8   14:invokespecial   #53  <Method void a(Context, String, AdSize, AttributeSet)>
    //    9   17:iconst_0        
    //   10   18:ireturn         
    //   11   19:iconst_1        
    //   12   20:ireturn         
    }

    private Set c(String s, Context context, AttributeSet attributeset, boolean flag)
        throws b
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:iload           4
    //    5    6:invokespecial   #118 <Method String b(String, Context, AttributeSet, boolean)>
    //    6    9:astore          5
    //    7   11:new             #342 <Class HashSet>
    //    8   14:dup             
    //    9   15:invokespecial   #343 <Method void HashSet()>
    //   10   18:astore          6
    //   11   20:aload           5
    //   12   22:ifnull          84
    //   13   25:aload           5
    //   14   27:ldc2            #345 <String ",">
    //   15   30:invokevirtual   #349 <Method String[] String.split(String)>
    //   16   33:astore          7
    //   17   35:aload           7
    //   18   37:arraylength     
    //   19   38:istore          8
    //   20   40:iconst_0        
    //   21   41:istore          9
    //   22   43:iload           9
    //   23   45:iload           8
    //   24   47:icmpge          84
    //   25   50:aload           7
    //   26   52:iload           9
    //   27   54:aaload          
    //   28   55:invokevirtual   #352 <Method String String.trim()>
    //   29   58:astore          10
    //   30   60:aload           10
    //   31   62:invokevirtual   #279 <Method int String.length()>
    //   32   65:ifeq            78
    //   33   68:aload           6
    //   34   70:aload           10
    //   35   72:invokeinterface #185 <Method boolean Set.add(Object)>
    //   36   77:pop             
    //   37   78:iinc            9  1
    //   38   81:goto            43
    //   39   84:aload           6
    //   40   86:areturn         
    }

    void a(Context context, String s, int i, AdSize adsize, AttributeSet attributeset)
    {
    //    0    0:aload           4
    //    1    2:ifnonnull       10
    //    2    5:getstatic       #205 <Field AdSize AdSize.BANNER>
    //    3    8:astore          4
    //    4   10:aload           4
    //    5   12:aload_1         
    //    6   13:invokevirtual   #353 <Method Context Context.getApplicationContext()>
    //    7   16:invokestatic    #214 <Method AdSize AdSize.createAdSize(AdSize, Context)>
    //    8   19:astore          6
    //    9   21:aload_0         
    //   10   22:invokevirtual   #356 <Method int getChildCount()>
    //   11   25:ifne            174
    //   12   28:aload           5
    //   13   30:ifnonnull       175
    //   14   33:new             #358 <Class TextView>
    //   15   36:dup             
    //   16   37:aload_1         
    //   17   38:invokespecial   #359 <Method void TextView(Context)>
    //   18   41:astore          7
    //   19   43:aload           7
    //   20   45:bipush          17
    //   21   47:invokevirtual   #360 <Method void TextView.setGravity(int)>
    //   22   50:aload           7
    //   23   52:aload_2         
    //   24   53:invokevirtual   #364 <Method void TextView.setText(CharSequence)>
    //   25   56:aload           7
    //   26   58:iload_3         
    //   27   59:invokevirtual   #367 <Method void TextView.setTextColor(int)>
    //   28   62:aload           7
    //   29   64:ldc2            #368 <Int 0xff000000>
    //   30   67:invokevirtual   #371 <Method void TextView.setBackgroundColor(int)>
    //   31   70:aload           5
    //   32   72:ifnonnull       190
    //   33   75:new             #373 <Class LinearLayout>
    //   34   78:dup             
    //   35   79:aload_1         
    //   36   80:invokespecial   #374 <Method void LinearLayout(Context)>
    //   37   83:astore          8
    //   38   85:aload           8
    //   39   87:bipush          17
    //   40   89:invokevirtual   #375 <Method void LinearLayout.setGravity(int)>
    //   41   92:aload           5
    //   42   94:ifnonnull       205
    //   43   97:new             #373 <Class LinearLayout>
    //   44  100:dup             
    //   45  101:aload_1         
    //   46  102:invokespecial   #374 <Method void LinearLayout(Context)>
    //   47  105:astore          9
    //   48  107:aload           9
    //   49  109:bipush          17
    //   50  111:invokevirtual   #375 <Method void LinearLayout.setGravity(int)>
    //   51  114:aload           9
    //   52  116:iload_3         
    //   53  117:invokevirtual   #376 <Method void LinearLayout.setBackgroundColor(int)>
    //   54  120:aload_1         
    //   55  121:aload           6
    //   56  123:invokevirtual   #379 <Method int AdSize.getWidth()>
    //   57  126:invokestatic    #382 <Method int AdUtil.a(Context, int)>
    //   58  129:istore          10
    //   59  131:aload_1         
    //   60  132:aload           6
    //   61  134:invokevirtual   #385 <Method int AdSize.getHeight()>
    //   62  137:invokestatic    #382 <Method int AdUtil.a(Context, int)>
    //   63  140:istore          11
    //   64  142:aload           8
    //   65  144:aload           7
    //   66  146:iload           10
    //   67  148:iconst_2        
    //   68  149:isub            
    //   69  150:iload           11
    //   70  152:iconst_2        
    //   71  153:isub            
    //   72  154:invokevirtual   #386 <Method void LinearLayout.addView(android.view.View, int, int)>
    //   73  157:aload           9
    //   74  159:aload           8
    //   75  161:invokevirtual   #389 <Method void LinearLayout.addView(android.view.View)>
    //   76  164:aload_0         
    //   77  165:aload           9
    //   78  167:iload           10
    //   79  169:iload           11
    //   80  171:invokevirtual   #106 <Method void addView(android.view.View, int, int)>
    //   81  174:return          
    //   82  175:new             #358 <Class TextView>
    //   83  178:dup             
    //   84  179:aload_1         
    //   85  180:aload           5
    //   86  182:invokespecial   #390 <Method void TextView(Context, AttributeSet)>
    //   87  185:astore          7
    //   88  187:goto            43
    //   89  190:new             #373 <Class LinearLayout>
    //   90  193:dup             
    //   91  194:aload_1         
    //   92  195:aload           5
    //   93  197:invokespecial   #391 <Method void LinearLayout(Context, AttributeSet)>
    //   94  200:astore          8
    //   95  202:goto            85
    //   96  205:new             #373 <Class LinearLayout>
    //   97  208:dup             
    //   98  209:aload_1         
    //   99  210:aload           5
    //  100  212:invokespecial   #391 <Method void LinearLayout(Context, AttributeSet)>
    //  101  215:astore          9
    //  102  217:goto            107
    }

    AdSize[] a(String s)
    {
    //    0    0:aload_1         
    //    1    1:ldc2            #345 <String ",">
    //    2    4:invokevirtual   #349 <Method String[] String.split(String)>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:arraylength     
    //    6   10:anewarray       AdSize[]
    //    7   13:astore_3        
    //    8   14:iconst_0        
    //    9   15:istore          4
    //   10   17:iload           4
    //   11   19:aload_2         
    //   12   20:arraylength     
    //   13   21:icmpge          293
    //   14   24:aload_2         
    //   15   25:iload           4
    //   16   27:aaload          
    //   17   28:invokevirtual   #352 <Method String String.trim()>
    //   18   31:astore          5
    //   19   33:aload           5
    //   20   35:ldc2            #395 <String "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$">
    //   21   38:invokevirtual   #263 <Method boolean String.matches(String)>
    //   22   41:ifeq            161
    //   23   44:aload           5
    //   24   46:ldc2            #397 <String "[xX]">
    //   25   49:invokevirtual   #349 <Method String[] String.split(String)>
    //   26   52:astore          7
    //   27   54:aload           7
    //   28   56:iconst_0        
    //   29   57:aload           7
    //   30   59:iconst_0        
    //   31   60:aaload          
    //   32   61:invokevirtual   #352 <Method String String.trim()>
    //   33   64:aastore         
    //   34   65:aload           7
    //   35   67:iconst_1        
    //   36   68:aload           7
    //   37   70:iconst_1        
    //   38   71:aaload          
    //   39   72:invokevirtual   #352 <Method String String.trim()>
    //   40   75:aastore         
    // try 76 89 handler(s) 295
    //   41   76:ldc2            #399 <String "FULL_WIDTH">
    //   42   79:aload           7
    //   43   81:iconst_0        
    //   44   82:aaload          
    //   45   83:invokevirtual   #402 <Method boolean String.equals(Object)>
    //   46   86:ifeq            133
    //   47   89:iconst_m1       
    //   48   90:istore          9
    // try 92 104 handler(s) 295
    //   49   92:ldc2            #404 <String "AUTO_HEIGHT">
    //   50   95:aload           7
    //   51   97:iconst_1        
    //   52   98:aaload          
    //   53   99:invokevirtual   #402 <Method boolean String.equals(Object)>
    //   54  102:istore          10
    //   55  104:iload           10
    //   56  106:ifeq            145
    //   57  109:bipush          -2
    //   58  111:istore          12
    //   59  113:new             #59  <Class AdSize>
    //   60  116:dup             
    //   61  117:iload           9
    //   62  119:iload           12
    //   63  121:invokespecial   #62  <Method void AdSize(int, int)>
    //   64  124:astore          6
    //   65  126:aload           6
    //   66  128:ifnonnull       281
    //   67  131:aconst_null     
    //   68  132:areturn         
    // try 133 142 handler(s) 295
    //   69  133:aload           7
    //   70  135:iconst_0        
    //   71  136:aaload          
    //   72  137:invokestatic    #410 <Method int Integer.parseInt(String)>
    //   73  140:istore          9
    //   74  142:goto            92
    // try 145 154 handler(s) 295
    //   75  145:aload           7
    //   76  147:iconst_1        
    //   77  148:aaload          
    //   78  149:invokestatic    #410 <Method int Integer.parseInt(String)>
    //   79  152:istore          11
    //   80  154:iload           11
    //   81  156:istore          12
    //   82  158:goto            113
    //   83  161:ldc2            #411 <String "BANNER">
    //   84  164:aload           5
    //   85  166:invokevirtual   #402 <Method boolean String.equals(Object)>
    //   86  169:ifeq            180
    //   87  172:getstatic       #205 <Field AdSize AdSize.BANNER>
    //   88  175:astore          6
    //   89  177:goto            126
    //   90  180:ldc2            #413 <String "SMART_BANNER">
    //   91  183:aload           5
    //   92  185:invokevirtual   #402 <Method boolean String.equals(Object)>
    //   93  188:ifeq            199
    //   94  191:getstatic       #415 <Field AdSize AdSize.SMART_BANNER>
    //   95  194:astore          6
    //   96  196:goto            126
    //   97  199:ldc2            #417 <String "IAB_MRECT">
    //   98  202:aload           5
    //   99  204:invokevirtual   #402 <Method boolean String.equals(Object)>
    //  100  207:ifeq            218
    //  101  210:getstatic       #419 <Field AdSize AdSize.IAB_MRECT>
    //  102  213:astore          6
    //  103  215:goto            126
    //  104  218:ldc2            #421 <String "IAB_BANNER">
    //  105  221:aload           5
    //  106  223:invokevirtual   #402 <Method boolean String.equals(Object)>
    //  107  226:ifeq            237
    //  108  229:getstatic       #423 <Field AdSize AdSize.IAB_BANNER>
    //  109  232:astore          6
    //  110  234:goto            126
    //  111  237:ldc2            #425 <String "IAB_LEADERBOARD">
    //  112  240:aload           5
    //  113  242:invokevirtual   #402 <Method boolean String.equals(Object)>
    //  114  245:ifeq            256
    //  115  248:getstatic       #427 <Field AdSize AdSize.IAB_LEADERBOARD>
    //  116  251:astore          6
    //  117  253:goto            126
    //  118  256:ldc2            #429 <String "IAB_WIDE_SKYSCRAPER">
    //  119  259:aload           5
    //  120  261:invokevirtual   #402 <Method boolean String.equals(Object)>
    //  121  264:ifeq            275
    //  122  267:getstatic       #431 <Field AdSize AdSize.IAB_WIDE_SKYSCRAPER>
    //  123  270:astore          6
    //  124  272:goto            126
    //  125  275:aconst_null     
    //  126  276:astore          6
    //  127  278:goto            126
    //  128  281:aload_3         
    //  129  282:iload           4
    //  130  284:aload           6
    //  131  286:aastore         
    //  132  287:iinc            4  1
    //  133  290:goto            17
    //  134  293:aload_3         
    //  135  294:areturn         
    // catch NumberFormatException NumberFormatException NumberFormatException NumberFormatException
    //  136  295:astore          8
    //  137  297:aconst_null     
    //  138  298:areturn         
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:invokevirtual   #434 <Method void d.b()>
    //    3    7:return          
    }

    public boolean isReady()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #90  <Field d a>
    //    7   13:invokevirtual   #438 <Method boolean d.s()>
    //    8   16:ireturn         
    }

    public boolean isRefreshing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #90  <Field d a>
    //    7   13:invokevirtual   #442 <Method boolean d.t()>
    //    8   16:ireturn         
    }

    public void loadAd(AdRequest adrequest)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:ifnull          29
    //    3    7:aload_0         
    //    4    8:invokevirtual   #444 <Method boolean isRefreshing()>
    //    5   11:ifeq            21
    //    6   14:aload_0         
    //    7   15:getfield        #90  <Field d a>
    //    8   18:invokevirtual   #447 <Method void d.f()>
    //    9   21:aload_0         
    //   10   22:getfield        #90  <Field d a>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #449 <Method void d.a(AdRequest)>
    //   13   29:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #142 <Method boolean isInEditMode()>
    //    2    4:ifne            24
    //    3    7:aload_0         
    //    4    8:getfield        #90  <Field d a>
    //    5   11:invokevirtual   #454 <Method AdWebView d.l()>
    //    6   14:astore_3        
    //    7   15:aload_3         
    //    8   16:ifnull          24
    //    9   19:aload_3         
    //   10   20:iconst_0        
    //   11   21:invokevirtual   #459 <Method void AdWebView.setVisibility(int)>
    //   12   24:aload_0         
    //   13   25:iload_1         
    //   14   26:iload_2         
    //   15   27:invokespecial   #461 <Method void RelativeLayout.onMeasure(int, int)>
    //   16   30:return          
    }

    protected void onWindowVisibilityChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #464 <Method void RelativeLayout.onWindowVisibilityChanged(int)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #142 <Method boolean isInEditMode()>
    //    5    9:ifeq            13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #90  <Field d a>
    //    9   17:invokevirtual   #218 <Method n d.i()>
    //   10   20:getfield        #468 <Field com.google.ads.util.i$b n.g>
    //   11   23:invokevirtual   #472 <Method Object com.google.ads.util.i$b.a()>
    //   12   26:checkcast       #474 <Class h>
    //   13   29:invokevirtual   #476 <Method boolean h.b()>
    //   14   32:ifeq            12
    //   15   35:iload_1         
    //   16   36:ifeq            12
    //   17   39:aload_0         
    //   18   40:getfield        #90  <Field d a>
    //   19   43:invokevirtual   #218 <Method n d.i()>
    //   20   46:getfield        #478 <Field com.google.ads.util.i$c n.l>
    //   21   49:invokevirtual   #479 <Method Object com.google.ads.util.i$c.a()>
    //   22   52:ifnull          12
    //   23   55:aload_0         
    //   24   56:getfield        #90  <Field d a>
    //   25   59:invokevirtual   #218 <Method n d.i()>
    //   26   62:getfield        #482 <Field com.google.ads.util.i$b n.e>
    //   27   65:invokevirtual   #472 <Method Object com.google.ads.util.i$b.a()>
    //   28   68:ifnull          12
    //   29   71:invokestatic    #487 <Method boolean AdActivity.isShowing()>
    //   30   74:ifeq            110
    //   31   77:invokestatic    #490 <Method boolean AdActivity.leftApplication()>
    //   32   80:ifne            110
    //   33   83:getstatic       #24  <Field a b>
    //   34   86:aload_0         
    //   35   87:getfield        #90  <Field d a>
    //   36   90:invokevirtual   #218 <Method n d.i()>
    //   37   93:getfield        #482 <Field com.google.ads.util.i$b n.e>
    //   38   96:invokevirtual   #472 <Method Object com.google.ads.util.i$b.a()>
    //   39   99:checkcast       #492 <Class WebView>
    //   40  102:ldc2            #494 <String "onopeninapp">
    //   41  105:aconst_null     
    //   42  106:invokevirtual   #497 <Method void a.a(WebView, String, String)>
    //   43  109:return          
    //   44  110:getstatic       #24  <Field a b>
    //   45  113:aload_0         
    //   46  114:getfield        #90  <Field d a>
    //   47  117:invokevirtual   #218 <Method n d.i()>
    //   48  120:getfield        #482 <Field com.google.ads.util.i$b n.e>
    //   49  123:invokevirtual   #472 <Method Object com.google.ads.util.i$b.a()>
    //   50  126:checkcast       #492 <Class WebView>
    //   51  129:ldc2            #499 <String "onleaveapp">
    //   52  132:aconst_null     
    //   53  133:invokevirtual   #497 <Method void a.a(WebView, String, String)>
    //   54  136:return          
    }

    public void setAdListener(AdListener adlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:invokevirtual   #218 <Method n d.i()>
    //    3    7:getfield        #504 <Field com.google.ads.util.i$c n.o>
    //    4   10:aload_1         
    //    5   11:invokevirtual   #229 <Method void com.google.ads.util.i$c.a(Object)>
    //    6   14:return          
    }

    protected void setAppEventListener(AppEventListener appeventlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:invokevirtual   #218 <Method n d.i()>
    //    3    7:getfield        #509 <Field com.google.ads.util.i$c n.p>
    //    4   10:aload_1         
    //    5   11:invokevirtual   #229 <Method void com.google.ads.util.i$c.a(Object)>
    //    6   14:return          
    }

    protected transient void setSupportedAdSizes(AdSize aadsize[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:invokevirtual   #218 <Method n d.i()>
    //    3    7:getfield        #224 <Field com.google.ads.util.i$c n.n>
    //    4   10:invokevirtual   #479 <Method Object com.google.ads.util.i$c.a()>
    //    5   13:ifnonnull       23
    //    6   16:ldc2            #512 <String "Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.">
    //    7   19:invokestatic    #514 <Method void com.google.ads.util.b.e(String)>
    //    8   22:return          
    //    9   23:aload_0         
    //   10   24:aload_1         
    //   11   25:invokespecial   #67  <Method void a(AdSize[])>
    //   12   28:return          
    }

    protected void setSwipeableEventListener(SwipeableAdListener swipeableadlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:invokevirtual   #218 <Method n d.i()>
    //    3    7:getfield        #519 <Field com.google.ads.util.i$c n.q>
    //    4   10:aload_1         
    //    5   11:invokevirtual   #229 <Method void com.google.ads.util.i$c.a(Object)>
    //    6   14:return          
    }

    public void stopLoading()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field d a>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #90  <Field d a>
    //    5   11:invokevirtual   #523 <Method void d.C()>
    //    6   14:return          
    }

    private static final a b;
    protected d a;
}
