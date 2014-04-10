// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.*;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import com.applovin.adview.AdViewController;
import com.applovin.impl.sdk.AppLovinAdInternal;
import com.applovin.sdk.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.applovin.impl.adview:
//            y, g, l, j, 
//            m, AdViewControllerJsInterface, v, k, 
//            i, h, a, t, 
//            b, c

public class AdViewControllerImpl
    implements AdViewController
{

    public AdViewControllerImpl()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #50  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #52  <Field AppLovinAd n>
    //    5    9:aload_0         
    //    6   10:new             #54  <Class AtomicReference>
    //    7   13:dup             
    //    8   14:invokespecial   #55  <Method void AtomicReference()>
    //    9   17:putfield        #57  <Field AtomicReference o>
    //   10   20:aload_0         
    //   11   21:iconst_0        
    //   12   22:putfield        #59  <Field boolean p>
    //   13   25:aload_0         
    //   14   26:iconst_1        
    //   15   27:putfield        #61  <Field boolean q>
    //   16   30:aload_0         
    //   17   31:iconst_0        
    //   18   32:putfield        #63  <Field boolean r>
    //   19   35:aload_0         
    //   20   36:iconst_0        
    //   21   37:putfield        #65  <Field boolean s>
    //   22   40:return          
    }

    static AdViewControllerJsInterface a(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field AdViewControllerJsInterface i>
    //    2    4:areturn         
    }

    static void a(View view, AppLovinAdSize applovinadsize)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #71  <Method void b(View, AppLovinAdSize)>
    //    3    5:return          
    }

    private void a(ViewGroup viewgroup, AppLovinSdk applovinsdk, AppLovinAdSize applovinadsize, String s1, Context context)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #74  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #76  <String "No parent view specified">
    //    5   10:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_2         
    //    8   15:ifnonnull       28
    //    9   18:new             #74  <Class IllegalArgumentException>
    //   10   21:dup             
    //   11   22:ldc1            #81  <String "No sdk specified">
    //   12   24:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //   13   27:athrow          
    //   14   28:aload_3         
    //   15   29:ifnonnull       42
    //   16   32:new             #74  <Class IllegalArgumentException>
    //   17   35:dup             
    //   18   36:ldc1            #83  <String "No ad size specified">
    //   19   38:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //   20   41:athrow          
    //   21   42:aload           5
    //   22   44:instanceof      #85  <Class Activity>
    //   23   47:ifne            60
    //   24   50:new             #74  <Class IllegalArgumentException>
    //   25   53:dup             
    //   26   54:ldc1            #87  <String "Specified context is not an activity">
    //   27   56:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //   28   59:athrow          
    //   29   60:aload_0         
    //   30   61:aload_2         
    //   31   62:putfield        #89  <Field AppLovinSdk b>
    //   32   65:aload_0         
    //   33   66:aload_2         
    //   34   67:invokevirtual   #95  <Method AppLovinAdService AppLovinSdk.getAdService()>
    //   35   70:putfield        #97  <Field AppLovinAdService c>
    //   36   73:aload_0         
    //   37   74:aload_2         
    //   38   75:invokevirtual   #101 <Method AppLovinLogger AppLovinSdk.getLogger()>
    //   39   78:putfield        #103 <Field AppLovinLogger d>
    //   40   81:aload_0         
    //   41   82:aload_3         
    //   42   83:putfield        #105 <Field AppLovinAdSize e>
    //   43   86:aload_0         
    //   44   87:aload           5
    //   45   89:checkcast       #85  <Class Activity>
    //   46   92:putfield        #107 <Field Activity a>
    //   47   95:aload_0         
    //   48   96:new             #109 <Class AppLovinAdInternal>
    //   49   99:dup             
    //   50  100:ldc1            #111 <String "">
    //   51  102:getstatic       #116 <Field AppLovinAdSize AppLovinAdSize.BANNER>
    //   52  105:getstatic       #122 <Field AppLovinAdType AppLovinAdType.REGULAR>
    //   53  108:new             #124 <Class ArrayList>
    //   54  111:dup             
    //   55  112:invokespecial   #125 <Method void ArrayList()>
    //   56  115:ldc1            #111 <String "">
    //   57  117:getstatic       #131 <Field com.applovin.impl.sdk.AppLovinAdInternal$AdTarget com.applovin.impl.sdk.AppLovinAdInternal$AdTarget.DEFAULT>
    //   58  120:ldc1            #133 <String "-1">
    //   59  122:invokespecial   #136 <Method void AppLovinAdInternal(String, AppLovinAdSize, AppLovinAdType, java.util.List, String, com.applovin.impl.sdk.AppLovinAdInternal$AdTarget, String)>
    //   60  125:putfield        #138 <Field AppLovinAd j>
    //   61  128:aload_0         
    //   62  129:new             #140 <Class y>
    //   63  132:dup             
    //   64  133:aload_0         
    //   65  134:aload_2         
    //   66  135:invokespecial   #143 <Method void y(AdViewControllerImpl, AppLovinSdk)>
    //   67  138:putfield        #145 <Field y f>
    //   68  141:aload_0         
    //   69  142:new             #147 <Class g>
    //   70  145:dup             
    //   71  146:aload_0         
    //   72  147:invokespecial   #150 <Method void g(AdViewControllerImpl)>
    //   73  150:putfield        #152 <Field Runnable m>
    //   74  153:aload_0         
    //   75  154:new             #154 <Class l>
    //   76  157:dup             
    //   77  158:aload_0         
    //   78  159:invokespecial   #155 <Method void l(AdViewControllerImpl)>
    //   79  162:putfield        #157 <Field Runnable k>
    //   80  165:aload_0         
    //   81  166:new             #159 <Class j>
    //   82  169:dup             
    //   83  170:aload_0         
    //   84  171:invokespecial   #160 <Method void j(AdViewControllerImpl)>
    //   85  174:putfield        #162 <Field Runnable l>
    //   86  177:aload_0         
    //   87  178:new             #164 <Class m>
    //   88  181:dup             
    //   89  182:aload_0         
    //   90  183:aload_2         
    //   91  184:invokespecial   #165 <Method void m(AdViewControllerImpl, AppLovinSdk)>
    //   92  187:putfield        #167 <Field m g>
    //   93  190:aload           5
    //   94  192:invokestatic    #170 <Method boolean a(Context)>
    //   95  195:ifeq            283
    //   96  198:aload_0         
    //   97  199:aload_0         
    //   98  200:invokespecial   #173 <Method v b()>
    //   99  203:putfield        #175 <Field v h>
    //  100  206:aload_0         
    //  101  207:new             #177 <Class AdViewControllerJsInterface>
    //  102  210:dup             
    //  103  211:aload_2         
    //  104  212:aload_0         
    //  105  213:getfield        #175 <Field v h>
    //  106  216:aload_0         
    //  107  217:getfield        #107 <Field Activity a>
    //  108  220:aload_1         
    //  109  221:aload_0         
    //  110  222:getfield        #52  <Field AppLovinAd n>
    //  111  225:aload_0         
    //  112  226:getfield        #179 <Field AppLovinAdVideoPlaybackListener v>
    //  113  229:invokespecial   #182 <Method void AdViewControllerJsInterface(AppLovinSdk, v, Activity, ViewGroup, AppLovinAd, AppLovinAdVideoPlaybackListener)>
    //  114  232:putfield        #68  <Field AdViewControllerJsInterface i>
    //  115  235:aload_1         
    //  116  236:iconst_0        
    //  117  237:invokevirtual   #188 <Method void ViewGroup.setBackgroundColor(int)>
    //  118  240:aload_1         
    //  119  241:aload_0         
    //  120  242:getfield        #175 <Field v h>
    //  121  245:invokevirtual   #192 <Method void ViewGroup.addView(View)>
    //  122  248:aload_0         
    //  123  249:getfield        #175 <Field v h>
    //  124  252:aload_3         
    //  125  253:invokestatic    #71  <Method void b(View, AppLovinAdSize)>
    //  126  256:aload_0         
    //  127  257:getfield        #175 <Field v h>
    //  128  260:bipush          8
    //  129  262:invokevirtual   #197 <Method void v.setVisibility(int)>
    //  130  265:aload_0         
    //  131  266:new             #199 <Class k>
    //  132  269:dup             
    //  133  270:aload_0         
    //  134  271:invokespecial   #200 <Method void k(AdViewControllerImpl)>
    //  135  274:invokespecial   #203 <Method void a(Runnable)>
    //  136  277:aload_0         
    //  137  278:iconst_1        
    //  138  279:putfield        #59  <Field boolean p>
    //  139  282:return          
    //  140  283:aload_0         
    //  141  284:getfield        #103 <Field AppLovinLogger d>
    //  142  287:ldc1            #205 <String "AppLovinAdView">
    //  143  289:ldc1            #207 <String "Web view database is corrupt, AdView not loaded">
    //  144  291:invokeinterface #213 <Method void AppLovinLogger.userError(String, String)>
    //  145  296:return          
    }

    private void a(Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field Activity a>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #216 <Method void Activity.runOnUiThread(Runnable)>
    //    4    8:return          
    }

    private static boolean a(Context context)
    {
    // try 0 45 handler(s) 47 62 77 92 105
    //    0    0:getstatic       #230 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmpge          45
    //    3    8:aload_0         
    //    4    9:invokestatic    #236 <Method WebViewDatabase WebViewDatabase.getInstance(Context)>
    //    5   12:astore          11
    //    6   14:ldc1            #232 <Class WebViewDatabase>
    //    7   16:ldc1            #238 <String "getCacheTotalSize">
    //    8   18:iconst_0        
    //    9   19:anewarray       Class[]
    //   10   22:invokevirtual   #244 <Method Method Class.getDeclaredMethod(String, Class[])>
    //   11   25:astore          12
    //   12   27:aload           12
    //   13   29:iconst_1        
    //   14   30:invokevirtual   #250 <Method void Method.setAccessible(boolean)>
    //   15   33:aload           12
    //   16   35:aload           11
    //   17   37:iconst_0        
    //   18   38:anewarray       Object[]
    //   19   41:invokevirtual   #254 <Method Object Method.invoke(Object, Object[])>
    //   20   44:pop             
    //   21   45:iconst_1        
    //   22   46:ireturn         
    // catch NoSuchMethodException
    //   23   47:astore          9
    //   24   49:ldc1            #205 <String "AppLovinAdView">
    //   25   51:ldc2            #256 <String "Error invoking getCacheTotalSize()">
    //   26   54:aload           9
    //   27   56:invokestatic    #261 <Method int Log.e(String, String, Throwable)>
    //   28   59:pop             
    //   29   60:iconst_1        
    //   30   61:ireturn         
    // catch IllegalArgumentException
    //   31   62:astore          7
    //   32   64:ldc1            #205 <String "AppLovinAdView">
    //   33   66:ldc2            #256 <String "Error invoking getCacheTotalSize()">
    //   34   69:aload           7
    //   35   71:invokestatic    #261 <Method int Log.e(String, String, Throwable)>
    //   36   74:pop             
    //   37   75:iconst_1        
    //   38   76:ireturn         
    // catch IllegalAccessException
    //   39   77:astore          5
    //   40   79:ldc1            #205 <String "AppLovinAdView">
    //   41   81:ldc2            #256 <String "Error invoking getCacheTotalSize()">
    //   42   84:aload           5
    //   43   86:invokestatic    #261 <Method int Log.e(String, String, Throwable)>
    //   44   89:pop             
    //   45   90:iconst_1        
    //   46   91:ireturn         
    // catch InvocationTargetException
    //   47   92:astore_3        
    //   48   93:ldc1            #205 <String "AppLovinAdView">
    //   49   95:ldc2            #263 <String "getCacheTotalSize() reported exception">
    //   50   98:aload_3         
    //   51   99:invokestatic    #261 <Method int Log.e(String, String, Throwable)>
    //   52  102:pop             
    //   53  103:iconst_0        
    //   54  104:ireturn         
    // catch Throwable
    //   55  105:astore_1        
    //   56  106:ldc1            #205 <String "AppLovinAdView">
    //   57  108:ldc2            #265 <String "Unexpected error while checking DB state">
    //   58  111:aload_1         
    //   59  112:invokestatic    #261 <Method int Log.e(String, String, Throwable)>
    //   60  115:pop             
    //   61  116:iconst_0        
    //   62  117:ireturn         
    }

    private v b()
    {
    //    0    0:new             #194 <Class v>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #105 <Field AppLovinAdSize e>
    //    4    8:aload_0         
    //    5    9:getfield        #145 <Field y f>
    //    6   12:aload_0         
    //    7   13:getfield        #89  <Field AppLovinSdk b>
    //    8   16:aload_0         
    //    9   17:getfield        #107 <Field Activity a>
    //   10   20:invokespecial   #268 <Method void v(AppLovinAdSize, y, AppLovinSdk, Context)>
    //   11   23:astore_1        
    //   12   24:aload_1         
    //   13   25:iconst_0        
    //   14   26:invokevirtual   #269 <Method void v.setBackgroundColor(int)>
    //   15   29:aload_1         
    //   16   30:iconst_0        
    //   17   31:invokevirtual   #272 <Method void v.setWillNotCacheDrawing(boolean)>
    //   18   34:aload_1         
    //   19   35:areturn         
    }

    static AppLovinAdLoadListener b(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #275 <Field AppLovinAdLoadListener t>
    //    2    4:areturn         
    }

    private static void b(View view, AppLovinAdSize applovinadsize)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #281 <Method Resources View.getResources()>
    //    2    4:invokevirtual   #287 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    3    7:astore_2        
    //    4    8:aload_1         
    //    5    9:invokevirtual   #291 <Method String AppLovinAdSize.getLabel()>
    //    6   12:getstatic       #294 <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //    7   15:invokevirtual   #291 <Method String AppLovinAdSize.getLabel()>
    //    8   18:invokevirtual   #300 <Method boolean String.equals(Object)>
    //    9   21:ifeq            118
    //   10   24:iconst_m1       
    //   11   25:istore_3        
    //   12   26:aload_1         
    //   13   27:invokevirtual   #291 <Method String AppLovinAdSize.getLabel()>
    //   14   30:getstatic       #294 <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //   15   33:invokevirtual   #291 <Method String AppLovinAdSize.getLabel()>
    //   16   36:invokevirtual   #300 <Method boolean String.equals(Object)>
    //   17   39:ifeq            149
    //   18   42:iconst_m1       
    //   19   43:istore          4
    //   20   45:aload_0         
    //   21   46:invokevirtual   #304 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   22   49:astore          5
    //   23   51:aload           5
    //   24   53:ifnonnull       69
    //   25   56:new             #306 <Class android.widget.RelativeLayout$LayoutParams>
    //   26   59:dup             
    //   27   60:bipush          -2
    //   28   62:bipush          -2
    //   29   64:invokespecial   #309 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //   30   67:astore          5
    //   31   69:aload           5
    //   32   71:iload_3         
    //   33   72:putfield        #314 <Field int android.view.ViewGroup$LayoutParams.width>
    //   34   75:aload           5
    //   35   77:iload           4
    //   36   79:putfield        #317 <Field int android.view.ViewGroup$LayoutParams.height>
    //   37   82:aload           5
    //   38   84:instanceof      #306 <Class android.widget.RelativeLayout$LayoutParams>
    //   39   87:ifeq            111
    //   40   90:aload           5
    //   41   92:checkcast       #306 <Class android.widget.RelativeLayout$LayoutParams>
    //   42   95:astore          6
    //   43   97:aload           6
    //   44   99:bipush          10
    //   45  101:invokevirtual   #320 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   46  104:aload           6
    //   47  106:bipush          9
    //   48  108:invokevirtual   #320 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   49  111:aload_0         
    //   50  112:aload           5
    //   51  114:invokevirtual   #324 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   52  117:return          
    //   53  118:aload_1         
    //   54  119:invokevirtual   #328 <Method int AppLovinAdSize.getWidth()>
    //   55  122:iconst_m1       
    //   56  123:icmpne          134
    //   57  126:aload_2         
    //   58  127:getfield        #333 <Field int DisplayMetrics.widthPixels>
    //   59  130:istore_3        
    //   60  131:goto            26
    //   61  134:iconst_1        
    //   62  135:aload_1         
    //   63  136:invokevirtual   #328 <Method int AppLovinAdSize.getWidth()>
    //   64  139:i2f             
    //   65  140:aload_2         
    //   66  141:invokestatic    #339 <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //   67  144:f2i             
    //   68  145:istore_3        
    //   69  146:goto            26
    //   70  149:aload_1         
    //   71  150:invokevirtual   #342 <Method int AppLovinAdSize.getHeight()>
    //   72  153:iconst_m1       
    //   73  154:icmpne          166
    //   74  157:aload_2         
    //   75  158:getfield        #345 <Field int DisplayMetrics.heightPixels>
    //   76  161:istore          4
    //   77  163:goto            45
    //   78  166:iconst_1        
    //   79  167:aload_1         
    //   80  168:invokevirtual   #342 <Method int AppLovinAdSize.getHeight()>
    //   81  171:i2f             
    //   82  172:aload_2         
    //   83  173:invokestatic    #339 <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //   84  176:f2i             
    //   85  177:istore          4
    //   86  179:goto            45
    }

    static AppLovinLogger c(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field AppLovinLogger d>
    //    2    4:areturn         
    }

    static v d(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field v h>
    //    2    4:areturn         
    }

    static AppLovinAd e(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field AppLovinAd n>
    //    2    4:areturn         
    }

    static AppLovinSdk f(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field AppLovinSdk b>
    //    2    4:areturn         
    }

    static Activity g(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field Activity a>
    //    2    4:areturn         
    }

    static AppLovinAdDisplayListener h(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #353 <Field AppLovinAdDisplayListener u>
    //    2    4:areturn         
    }

    static AppLovinAdClickListener i(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #356 <Field AppLovinAdClickListener w>
    //    2    4:areturn         
    }

    static AppLovinAdVideoPlaybackListener j(AdViewControllerImpl adviewcontrollerimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #179 <Field AppLovinAdVideoPlaybackListener v>
    //    2    4:areturn         
    }

    AdViewControllerJsInterface a()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field AdViewControllerJsInterface i>
    //    2    4:areturn         
    }

    void a(WebView webview)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #152 <Field Runnable m>
    //    3    5:invokespecial   #203 <Method void a(Runnable)>
    //    4    8:aload_0         
    //    5    9:new             #361 <Class i>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:aload_0         
    //    9   15:getfield        #52  <Field AppLovinAd n>
    //   10   18:invokespecial   #364 <Method void i(AdViewControllerImpl, AppLovinAd)>
    //   11   21:invokespecial   #203 <Method void a(Runnable)>
    //   12   24:aload_0         
    //   13   25:getfield        #68  <Field AdViewControllerJsInterface i>
    //   14   28:invokevirtual   #367 <Method void AdViewControllerJsInterface.destroyVideoOverlay()>
    //   15   31:aload_0         
    //   16   32:aconst_null     
    //   17   33:putfield        #52  <Field AppLovinAd n>
    //   18   36:return          
    }

    void a(AppLovinAd applovinad)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #109 <Class AppLovinAdInternal>
    //    2    4:invokevirtual   #372 <Method com.applovin.impl.sdk.AppLovinAdInternal$ApiCompatibilityLevel AppLovinAdInternal.getCompatibilityLevel()>
    //    3    7:getstatic       #378 <Field com.applovin.impl.sdk.AppLovinAdInternal$ApiCompatibilityLevel com.applovin.impl.sdk.AppLovinAdInternal$ApiCompatibilityLevel.AdServerApi10>
    //    4   10:if_acmpne       26
    //    5   13:aload_0         
    //    6   14:getfield        #89  <Field AppLovinSdk b>
    //    7   17:invokevirtual   #95  <Method AppLovinAdService AppLovinSdk.getAdService()>
    //    8   20:aload_1         
    //    9   21:invokeinterface #383 <Method void AppLovinAdService.trackAdClick(AppLovinAd)>
    //   10   26:aload_0         
    //   11   27:new             #385 <Class h>
    //   12   30:dup             
    //   13   31:aload_0         
    //   14   32:aload_1         
    //   15   33:invokespecial   #386 <Method void h(AdViewControllerImpl, AppLovinAd)>
    //   16   36:invokespecial   #203 <Method void a(Runnable)>
    //   17   39:return          
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field AppLovinAdService c>
    //    2    4:ifnull          24
    //    3    7:aload_0         
    //    4    8:getfield        #97  <Field AppLovinAdService c>
    //    5   11:aload_0         
    //    6   12:getfield        #167 <Field m g>
    //    7   15:aload_0         
    //    8   16:invokevirtual   #391 <Method AppLovinAdSize getSize()>
    //    9   19:invokeinterface #395 <Method void AppLovinAdService.removeAdUpdateListener(com.applovin.sdk.AppLovinAdUpdateListener, AppLovinAdSize)>
    //   10   24:aload_0         
    //   11   25:getfield        #175 <Field v h>
    //   12   28:ifnull          38
    //   13   31:aload_0         
    //   14   32:getfield        #175 <Field v h>
    //   15   35:invokevirtual   #397 <Method void v.destroy()>
    //   16   38:aload_0         
    //   17   39:iconst_1        
    //   18   40:putfield        #63  <Field boolean r>
    //   19   43:return          
    }

    public AppLovinAdSize getSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field AppLovinAdSize e>
    //    2    4:areturn         
    }

    public void handleCommandInvocation(String s1, Map map)
    {
    //    0    0:aload_0         
    //    1    1:new             #401 <Class a>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:aload_2         
    //    6    8:invokespecial   #404 <Method void a(AdViewControllerImpl, String, Map)>
    //    7   11:invokespecial   #203 <Method void a(Runnable)>
    //    8   14:return          
    }

    public void initializeAdView(ViewGroup viewgroup, Context context, AppLovinAdSize applovinadsize, AppLovinSdk applovinsdk, AttributeSet attributeset)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #74  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #76  <String "No parent view specified">
    //    5   10:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_2         
    //    8   15:ifnonnull       29
    //    9   18:ldc2            #408 <String "AppLovinSdk">
    //   10   21:ldc2            #410 <String "Unable to create AppLovinAdView: no context provided. Please use a different constructor for this view.">
    //   11   24:invokestatic    #413 <Method int Log.e(String, String)>
    //   12   27:pop             
    //   13   28:return          
    //   14   29:aload_3         
    //   15   30:ifnonnull       114
    //   16   33:aload           5
    //   17   35:invokestatic    #418 <Method AppLovinAdSize t.a(AttributeSet)>
    //   18   38:astore          6
    //   19   40:aload           6
    //   20   42:ifnonnull       50
    //   21   45:getstatic       #116 <Field AppLovinAdSize AppLovinAdSize.BANNER>
    //   22   48:astore          6
    //   23   50:aload           5
    //   24   52:aload_2         
    //   25   53:invokestatic    #421 <Method String t.a(AttributeSet, Context)>
    //   26   56:astore          7
    //   27   58:aload           4
    //   28   60:ifnonnull       107
    //   29   63:aload_2         
    //   30   64:invokestatic    #424 <Method AppLovinSdk AppLovinSdk.getInstance(Context)>
    //   31   67:astore          8
    //   32   69:aload           8
    //   33   71:ifnull          28
    //   34   74:aload           8
    //   35   76:invokevirtual   #428 <Method boolean AppLovinSdk.hasCriticalErrors()>
    //   36   79:ifne            28
    //   37   82:aload_0         
    //   38   83:aload_1         
    //   39   84:aload           8
    //   40   86:aload           6
    //   41   88:aload           7
    //   42   90:aload_2         
    //   43   91:invokespecial   #430 <Method void a(ViewGroup, AppLovinSdk, AppLovinAdSize, String, Context)>
    //   44   94:aload           5
    //   45   96:invokestatic    #433 <Method boolean t.b(AttributeSet)>
    //   46   99:ifeq            28
    //   47  102:aload_0         
    //   48  103:invokevirtual   #436 <Method void loadNextAd()>
    //   49  106:return          
    //   50  107:aload           4
    //   51  109:astore          8
    //   52  111:goto            69
    //   53  114:aload_3         
    //   54  115:astore          6
    //   55  117:goto            50
    }

    public boolean isAutoDestroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #61  <Field boolean q>
    //    2    4:ireturn         
    }

    public void loadNextAd()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field AppLovinSdk b>
    //    2    4:ifnull          46
    //    3    7:aload_0         
    //    4    8:getfield        #167 <Field m g>
    //    5   11:ifnull          46
    //    6   14:aload_0         
    //    7   15:getfield        #107 <Field Activity a>
    //    8   18:ifnull          46
    //    9   21:aload_0         
    //   10   22:getfield        #59  <Field boolean p>
    //   11   25:ifeq            46
    //   12   28:aload_0         
    //   13   29:getfield        #97  <Field AppLovinAdService c>
    //   14   32:aload_0         
    //   15   33:getfield        #105 <Field AppLovinAdSize e>
    //   16   36:aload_0         
    //   17   37:getfield        #167 <Field m g>
    //   18   40:invokeinterface #440 <Method void AppLovinAdService.loadNextAd(AppLovinAdSize, AppLovinAdLoadListener)>
    //   19   45:return          
    //   20   46:ldc2            #408 <String "AppLovinSdk">
    //   21   49:ldc2            #442 <String "Unable to load next ad: AppLovinAdView is not initialized.">
    //   22   52:invokestatic    #444 <Method int Log.i(String, String)>
    //   23   55:pop             
    //   24   56:return          
    }

    public void onAdHtmlLoaded(WebView webview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field AppLovinAd n>
    //    2    4:ifnull          32
    //    3    7:aload_1         
    //    4    8:iconst_0        
    //    5    9:invokevirtual   #448 <Method void WebView.setVisibility(int)>
    // try 12 32 handler(s) 33
    //    6   12:aload_0         
    //    7   13:getfield        #353 <Field AppLovinAdDisplayListener u>
    //    8   16:ifnull          32
    //    9   19:aload_0         
    //   10   20:getfield        #353 <Field AppLovinAdDisplayListener u>
    //   11   23:aload_0         
    //   12   24:getfield        #52  <Field AppLovinAd n>
    //   13   27:invokeinterface #453 <Method void AppLovinAdDisplayListener.adDisplayed(AppLovinAd)>
    //   14   32:return          
    // catch Throwable
    //   15   33:astore_2        
    //   16   34:aload_0         
    //   17   35:getfield        #103 <Field AppLovinLogger d>
    //   18   38:ldc1            #205 <String "AppLovinAdView">
    //   19   40:ldc2            #455 <String "Exception while notifying ad display listener">
    //   20   43:aload_2         
    //   21   44:invokeinterface #458 <Method void AppLovinLogger.userError(String, String, Throwable)>
    //   22   49:return          
    }

    protected void onAdReceived(AppLovinAd applovinad)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          77
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #65  <Field boolean s>
    //    5    9:aload_0         
    //    6   10:getfield        #63  <Field boolean r>
    //    7   13:ifne            52
    //    8   16:aload_0         
    //    9   17:getfield        #97  <Field AppLovinAdService c>
    //   10   20:aload_0         
    //   11   21:getfield        #167 <Field m g>
    //   12   24:aload_0         
    //   13   25:getfield        #105 <Field AppLovinAdSize e>
    //   14   28:invokeinterface #462 <Method void AppLovinAdService.addAdUpdateListener(com.applovin.sdk.AppLovinAdUpdateListener, AppLovinAdSize)>
    //   15   33:aload_0         
    //   16   34:aload_1         
    //   17   35:invokevirtual   #465 <Method void renderAd(AppLovinAd)>
    //   18   38:aload_0         
    //   19   39:new             #467 <Class b>
    //   20   42:dup             
    //   21   43:aload_0         
    //   22   44:aload_1         
    //   23   45:invokespecial   #468 <Method void b(AdViewControllerImpl, AppLovinAd)>
    //   24   48:invokespecial   #203 <Method void a(Runnable)>
    //   25   51:return          
    //   26   52:aload_0         
    //   27   53:getfield        #57  <Field AtomicReference o>
    //   28   56:aload_1         
    //   29   57:invokevirtual   #472 <Method void AtomicReference.set(Object)>
    //   30   60:aload_0         
    //   31   61:getfield        #103 <Field AppLovinLogger d>
    //   32   64:ldc1            #205 <String "AppLovinAdView">
    //   33   66:ldc2            #474 <String "Ad view has paused when an ad was recieved, ad saved for later">
    //   34   69:invokeinterface #476 <Method void AppLovinLogger.d(String, String)>
    //   35   74:goto            38
    //   36   77:aload_0         
    //   37   78:getfield        #103 <Field AppLovinLogger d>
    //   38   81:ldc1            #205 <String "AppLovinAdView">
    //   39   83:ldc2            #478 <String "No provided when to the view controller">
    //   40   86:invokeinterface #480 <Method void AppLovinLogger.e(String, String)>
    //   41   91:aload_0         
    //   42   92:iconst_m1       
    //   43   93:invokevirtual   #483 <Method void onFailedToReceiveAd(int)>
    //   44   96:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean p>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:new             #361 <Class i>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:aload_0         
    //    9   15:getfield        #52  <Field AppLovinAd n>
    //   10   18:invokespecial   #364 <Method void i(AdViewControllerImpl, AppLovinAd)>
    //   11   21:invokespecial   #203 <Method void a(Runnable)>
    //   12   24:aload_0         
    //   13   25:getfield        #61  <Field boolean q>
    //   14   28:ifeq            7
    //   15   31:aload_0         
    //   16   32:invokevirtual   #485 <Method void destroy()>
    //   17   35:return          
    }

    protected void onFailedToReceiveAd(int i1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field boolean r>
    //    2    4:ifne            32
    //    3    7:aload_0         
    //    4    8:getfield        #97  <Field AppLovinAdService c>
    //    5   11:aload_0         
    //    6   12:getfield        #167 <Field m g>
    //    7   15:aload_0         
    //    8   16:getfield        #105 <Field AppLovinAdSize e>
    //    9   19:invokeinterface #462 <Method void AppLovinAdService.addAdUpdateListener(com.applovin.sdk.AppLovinAdUpdateListener, AppLovinAdSize)>
    //   10   24:aload_0         
    //   11   25:aload_0         
    //   12   26:getfield        #152 <Field Runnable m>
    //   13   29:invokespecial   #203 <Method void a(Runnable)>
    //   14   32:aload_0         
    //   15   33:new             #487 <Class c>
    //   16   36:dup             
    //   17   37:aload_0         
    //   18   38:iload_1         
    //   19   39:invokespecial   #490 <Method void c(AdViewControllerImpl, int)>
    //   20   42:invokespecial   #203 <Method void a(Runnable)>
    //   21   45:return          
    }

    public void onVisibilityChanged(int i1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean p>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #61  <Field boolean q>
    //    6   12:ifeq            7
    //    7   15:iload_1         
    //    8   16:bipush          8
    //    9   18:icmpeq          26
    //   10   21:iload_1         
    //   11   22:iconst_4        
    //   12   23:icmpne          31
    //   13   26:aload_0         
    //   14   27:invokevirtual   #494 <Method void pause()>
    //   15   30:return          
    //   16   31:iload_1         
    //   17   32:ifne            7
    //   18   35:aload_0         
    //   19   36:invokevirtual   #497 <Method void resume()>
    //   20   39:return          
    }

    public void pause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean p>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #97  <Field AppLovinAdService c>
    //    6   12:aload_0         
    //    7   13:getfield        #167 <Field m g>
    //    8   16:aload_0         
    //    9   17:invokevirtual   #391 <Method AppLovinAdSize getSize()>
    //   10   20:invokeinterface #395 <Method void AppLovinAdService.removeAdUpdateListener(com.applovin.sdk.AppLovinAdUpdateListener, AppLovinAdSize)>
    //   11   25:aload_0         
    //   12   26:getfield        #52  <Field AppLovinAd n>
    //   13   29:astore_1        
    //   14   30:aload_0         
    //   15   31:aload_0         
    //   16   32:getfield        #138 <Field AppLovinAd j>
    //   17   35:invokevirtual   #465 <Method void renderAd(AppLovinAd)>
    //   18   38:aload_1         
    //   19   39:ifnull          50
    //   20   42:aload_0         
    //   21   43:getfield        #57  <Field AtomicReference o>
    //   22   46:aload_1         
    //   23   47:invokevirtual   #472 <Method void AtomicReference.set(Object)>
    //   24   50:aload_0         
    //   25   51:iconst_1        
    //   26   52:putfield        #63  <Field boolean r>
    //   27   55:return          
    }

    public void renderAd(AppLovinAd applovinad)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       15
    //    2    4:new             #74  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc2            #499 <String "No ad specified">
    //    5   11:invokespecial   #79  <Method void IllegalArgumentException(String)>
    //    6   14:athrow          
    //    7   15:aload_0         
    //    8   16:getfield        #59  <Field boolean p>
    //    9   19:ifeq            218
    //   10   22:aload_1         
    //   11   23:aload_0         
    //   12   24:getfield        #52  <Field AppLovinAd n>
    //   13   27:if_acmpeq       177
    //   14   30:aload_0         
    //   15   31:getfield        #103 <Field AppLovinLogger d>
    //   16   34:ldc1            #205 <String "AppLovinAdView">
    //   17   36:new             #501 <Class StringBuilder>
    //   18   39:dup             
    //   19   40:invokespecial   #502 <Method void StringBuilder()>
    //   20   43:ldc2            #504 <String "Rendering ">
    //   21   46:invokevirtual   #508 <Method StringBuilder StringBuilder.append(String)>
    //   22   49:aload_1         
    //   23   50:invokevirtual   #511 <Method AppLovinAdSize AppLovinAd.getSize()>
    //   24   53:invokevirtual   #514 <Method StringBuilder StringBuilder.append(Object)>
    //   25   56:ldc2            #516 <String " ad for \"">
    //   26   59:invokevirtual   #508 <Method StringBuilder StringBuilder.append(String)>
    //   27   62:aload_1         
    //   28   63:invokevirtual   #520 <Method java.util.List AppLovinAd.getDestinationUrls()>
    //   29   66:invokevirtual   #514 <Method StringBuilder StringBuilder.append(Object)>
    //   30   69:ldc2            #522 <String "\"...">
    //   31   72:invokevirtual   #508 <Method StringBuilder StringBuilder.append(String)>
    //   32   75:invokevirtual   #525 <Method String StringBuilder.toString()>
    //   33   78:invokeinterface #476 <Method void AppLovinLogger.d(String, String)>
    //   34   83:aload_0         
    //   35   84:new             #361 <Class i>
    //   36   87:dup             
    //   37   88:aload_0         
    //   38   89:aload_0         
    //   39   90:getfield        #52  <Field AppLovinAd n>
    //   40   93:invokespecial   #364 <Method void i(AdViewControllerImpl, AppLovinAd)>
    //   41   96:invokespecial   #203 <Method void a(Runnable)>
    //   42   99:aload_0         
    //   43  100:getfield        #57  <Field AtomicReference o>
    //   44  103:aconst_null     
    //   45  104:invokevirtual   #472 <Method void AtomicReference.set(Object)>
    //   46  107:aload_0         
    //   47  108:getfield        #68  <Field AdViewControllerJsInterface i>
    //   48  111:invokevirtual   #367 <Method void AdViewControllerJsInterface.destroyVideoOverlay()>
    //   49  114:aload_0         
    //   50  115:getfield        #68  <Field AdViewControllerJsInterface i>
    //   51  118:aload_1         
    //   52  119:invokevirtual   #528 <Method String AppLovinAd.getVideoFilename()>
    //   53  122:invokevirtual   #531 <Method void AdViewControllerJsInterface.setVideoFilename(String)>
    //   54  125:aload_0         
    //   55  126:aload_1         
    //   56  127:putfield        #52  <Field AppLovinAd n>
    //   57  130:aload_1         
    //   58  131:invokevirtual   #511 <Method AppLovinAdSize AppLovinAd.getSize()>
    //   59  134:aload_0         
    //   60  135:getfield        #105 <Field AppLovinAdSize e>
    //   61  138:if_acmpne       150
    //   62  141:aload_0         
    //   63  142:aload_0         
    //   64  143:getfield        #157 <Field Runnable k>
    //   65  146:invokespecial   #203 <Method void a(Runnable)>
    //   66  149:return          
    //   67  150:aload_1         
    //   68  151:invokevirtual   #511 <Method AppLovinAdSize AppLovinAd.getSize()>
    //   69  154:getstatic       #294 <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //   70  157:if_acmpne       149
    //   71  160:aload_0         
    //   72  161:aload_0         
    //   73  162:getfield        #152 <Field Runnable m>
    //   74  165:invokespecial   #203 <Method void a(Runnable)>
    //   75  168:aload_0         
    //   76  169:aload_0         
    //   77  170:getfield        #162 <Field Runnable l>
    //   78  173:invokespecial   #203 <Method void a(Runnable)>
    //   79  176:return          
    //   80  177:aload_0         
    //   81  178:getfield        #103 <Field AppLovinLogger d>
    //   82  181:ldc1            #205 <String "AppLovinAdView">
    //   83  183:new             #501 <Class StringBuilder>
    //   84  186:dup             
    //   85  187:invokespecial   #502 <Method void StringBuilder()>
    //   86  190:ldc2            #533 <String "Ad for \"">
    //   87  193:invokevirtual   #508 <Method StringBuilder StringBuilder.append(String)>
    //   88  196:aload_1         
    //   89  197:invokevirtual   #520 <Method java.util.List AppLovinAd.getDestinationUrls()>
    //   90  200:invokevirtual   #514 <Method StringBuilder StringBuilder.append(Object)>
    //   91  203:ldc2            #535 <String "\" is already showing, ignoring">
    //   92  206:invokevirtual   #508 <Method StringBuilder StringBuilder.append(String)>
    //   93  209:invokevirtual   #525 <Method String StringBuilder.toString()>
    //   94  212:invokeinterface #537 <Method void AppLovinLogger.w(String, String)>
    //   95  217:return          
    //   96  218:ldc2            #408 <String "AppLovinSdk">
    //   97  221:ldc2            #539 <String "Unable to render ad: AppLovinAdView is not initialized.">
    //   98  224:invokestatic    #444 <Method int Log.i(String, String)>
    //   99  227:pop             
    //  100  228:return          
    }

    public void resume()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean p>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #65  <Field boolean s>
    //    6   12:ifeq            32
    //    7   15:aload_0         
    //    8   16:getfield        #97  <Field AppLovinAdService c>
    //    9   19:aload_0         
    //   10   20:getfield        #167 <Field m g>
    //   11   23:aload_0         
    //   12   24:getfield        #105 <Field AppLovinAdSize e>
    //   13   27:invokeinterface #462 <Method void AppLovinAdService.addAdUpdateListener(com.applovin.sdk.AppLovinAdUpdateListener, AppLovinAdSize)>
    //   14   32:aload_0         
    //   15   33:getfield        #57  <Field AtomicReference o>
    //   16   36:aconst_null     
    //   17   37:invokevirtual   #543 <Method Object AtomicReference.getAndSet(Object)>
    //   18   40:checkcast       #510 <Class AppLovinAd>
    //   19   43:astore_1        
    //   20   44:aload_1         
    //   21   45:ifnull          53
    //   22   48:aload_0         
    //   23   49:aload_1         
    //   24   50:invokevirtual   #465 <Method void renderAd(AppLovinAd)>
    //   25   53:aload_0         
    //   26   54:iconst_0        
    //   27   55:putfield        #63  <Field boolean r>
    //   28   58:return          
    }

    public void setAdClickListener(AppLovinAdClickListener applovinadclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #356 <Field AppLovinAdClickListener w>
    //    3    5:return          
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener applovinaddisplaylistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #353 <Field AppLovinAdDisplayListener u>
    //    3    5:return          
    }

    public void setAdLoadListener(AppLovinAdLoadListener applovinadloadlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #275 <Field AppLovinAdLoadListener t>
    //    3    5:return          
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #179 <Field AppLovinAdVideoPlaybackListener v>
    //    3    5:aload_0         
    //    4    6:getfield        #68  <Field AdViewControllerJsInterface i>
    //    5    9:ifnull          20
    //    6   12:aload_0         
    //    7   13:getfield        #68  <Field AdViewControllerJsInterface i>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #553 <Method void AdViewControllerJsInterface.setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener)>
    //   10   20:return          
    }

    public void setAutoDestroy(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #61  <Field boolean q>
    //    3    5:return          
    }

    private Activity a;
    private AppLovinSdk b;
    private AppLovinAdService c;
    private AppLovinLogger d;
    private AppLovinAdSize e;
    private y f;
    private m g;
    private v h;
    private AdViewControllerJsInterface i;
    private AppLovinAd j;
    private Runnable k;
    private Runnable l;
    private Runnable m;
    private volatile AppLovinAd n;
    private final AtomicReference o;
    private volatile boolean p;
    private volatile boolean q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile AppLovinAdLoadListener t;
    private volatile AppLovinAdDisplayListener u;
    private volatile AppLovinAdVideoPlaybackListener v;
    private volatile AppLovinAdClickListener w;
}
