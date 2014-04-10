// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.*;
import com.applovin.impl.sdk.AppLovinAdInternal;
import com.applovin.sdk.*;
import java.util.ArrayList;

// Referenced classes of package com.applovin.adview:
//            a, b, c

public class AppLovinInterstitialActivity extends Activity
    implements ac
{

    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #26  <Field aj lastKnownWrapper>
    //    2    4:return          
    }

    public AppLovinInterstitialActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #29  <Method void Activity()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #31  <Field boolean c>
    //    5    9:aload_0         
    //    6   10:invokestatic    #34  <Method AppLovinAdInternal a()>
    //    7   13:putfield        #36  <Field AppLovinAd d>
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #38  <Field boolean e>
    //   11   21:aload_0         
    //   12   22:iconst_0        
    //   13   23:putfield        #40  <Field boolean f>
    //   14   26:aload_0         
    //   15   27:iconst_0        
    //   16   28:putfield        #42  <Field boolean g>
    //   17   31:return          
    }

    private static AppLovinAdInternal a()
    {
    //    0    0:new             #44  <Class AppLovinAdInternal>
    //    1    3:dup             
    //    2    4:ldc1            #46  <String "">
    //    3    6:getstatic       #52  <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //    4    9:getstatic       #58  <Field AppLovinAdType AppLovinAdType.REGULAR>
    //    5   12:new             #60  <Class ArrayList>
    //    6   15:dup             
    //    7   16:invokespecial   #61  <Method void ArrayList()>
    //    8   19:ldc1            #46  <String "">
    //    9   21:getstatic       #67  <Field com.applovin.impl.sdk.AppLovinAdInternal$AdTarget com.applovin.impl.sdk.AppLovinAdInternal$AdTarget.DEFAULT>
    //   10   24:ldc1            #69  <String "-1">
    //   11   26:invokespecial   #72  <Method void AppLovinAdInternal(String, AppLovinAdSize, AppLovinAdType, java.util.List, String, com.applovin.impl.sdk.AppLovinAdInternal$AdTarget, String)>
    //   12   29:areturn         
    }

    static void a(AppLovinInterstitialActivity applovininterstitialactivity, AppLovinAd applovinad)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #76  <Method void a(AppLovinAd)>
    //    3    5:return          
    }

    static void a(AppLovinInterstitialActivity applovininterstitialactivity, AppLovinAd applovinad, double d1, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:dload_2         
    //    3    3:iload           4
    //    4    5:invokespecial   #80  <Method void a(AppLovinAd, double, boolean)>
    //    5    8:return          
    }

    private void a(AppLovinAd applovinad)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field boolean f>
    //    2    4:ifne            50
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #40  <Field boolean f>
    //    6   12:aload_0         
    //    7   13:getfield        #82  <Field aj b>
    //    8   16:invokevirtual   #87  <Method AppLovinAdDisplayListener aj.c()>
    //    9   19:astore_2        
    //   10   20:aload_2         
    //   11   21:ifnull          31
    //   12   24:aload_2         
    //   13   25:aload_1         
    //   14   26:invokeinterface #92  <Method void AppLovinAdDisplayListener.adHidden(AppLovinAd)>
    //   15   31:aload_0         
    //   16   32:getfield        #82  <Field aj b>
    //   17   35:iconst_0        
    //   18   36:invokevirtual   #95  <Method void aj.a(boolean)>
    //   19   39:aload_0         
    //   20   40:getfield        #82  <Field aj b>
    //   21   43:invokevirtual   #97  <Method void aj.f()>
    //   22   46:aload_0         
    //   23   47:invokevirtual   #100 <Method void finish()>
    //   24   50:return          
    }

    private void a(AppLovinAd applovinad, double d1, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field boolean g>
    //    2    4:ifne            37
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #42  <Field boolean g>
    //    6   12:aload_0         
    //    7   13:getfield        #82  <Field aj b>
    //    8   16:invokevirtual   #103 <Method AppLovinAdVideoPlaybackListener aj.b()>
    //    9   19:astore          5
    //   10   21:aload           5
    //   11   23:ifnull          37
    //   12   26:aload           5
    //   13   28:aload_1         
    //   14   29:dload_2         
    //   15   30:iload           4
    //   16   32:invokeinterface #108 <Method void AppLovinAdVideoPlaybackListener.videoPlaybackEnded(AppLovinAd, double, boolean)>
    //   17   37:return          
    }

    static boolean a(AppLovinInterstitialActivity applovininterstitialactivity)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field boolean e>
    //    2    4:ireturn         
    }

    static boolean a(AppLovinInterstitialActivity applovininterstitialactivity, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #38  <Field boolean e>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static aj b(AppLovinInterstitialActivity applovininterstitialactivity)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #82  <Field aj b>
    //    2    4:areturn         
    }

    static AppLovinAd b(AppLovinInterstitialActivity applovininterstitialactivity, AppLovinAd applovinad)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #36  <Field AppLovinAd d>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #100 <Method void finish()>
    //    2    4:return          
    }

    public void exitWithError(String s)
    {
    //    0    0:new             #117 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void StringBuilder()>
    //    3    7:ldc1            #120 <String "Initialized = ">
    //    4    9:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //    5   12:getstatic       #126 <Field boolean aj.a>
    //    6   15:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
    //    7   18:ldc1            #131 <String "; CleanedUp = ">
    //    8   20:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //    9   23:getstatic       #133 <Field boolean aj.b>
    //   10   26:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
    //   11   29:invokevirtual   #137 <Method String StringBuilder.toString()>
    //   12   32:astore_2        
    //   13   33:ldc1            #139 <String "AppLovinInterstitialActivity">
    //   14   35:new             #117 <Class StringBuilder>
    //   15   38:dup             
    //   16   39:invokespecial   #118 <Method void StringBuilder()>
    //   17   42:ldc1            #141 <String "Failed to properly render an Interstitial Activity, due to error: ">
    //   18   44:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //   19   47:aload_1         
    //   20   48:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //   21   51:invokevirtual   #137 <Method String StringBuilder.toString()>
    //   22   54:new             #143 <Class Throwable>
    //   23   57:dup             
    //   24   58:aload_2         
    //   25   59:invokespecial   #145 <Method void Throwable(String)>
    //   26   62:invokestatic    #150 <Method int Log.e(String, String, Throwable)>
    //   27   65:pop             
    //   28   66:aload_0         
    //   29   67:invokevirtual   #100 <Method void finish()>
    //   30   70:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #82  <Field aj b>
    //    2    4:ifnull          22
    //    3    7:aload_0         
    //    4    8:getfield        #82  <Field aj b>
    //    5   11:invokevirtual   #154 <Method boolean aj.g()>
    //    6   14:ifeq            21
    //    7   17:aload_0         
    //    8   18:invokespecial   #156 <Method void Activity.onBackPressed()>
    //    9   21:return          
    //   10   22:aload_0         
    //   11   23:invokespecial   #156 <Method void Activity.onBackPressed()>
    //   12   26:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #160 <Method void Activity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #164 <Method boolean requestWindowFeature(int)>
    //    6   10:pop             
    // try 11 24 handler(s) 306
    //    7   11:aload_0         
    //    8   12:invokevirtual   #168 <Method Window getWindow()>
    //    9   15:sipush          1024
    //   10   18:sipush          1024
    //   11   21:invokevirtual   #174 <Method void Window.setFlags(int, int)>
    //   12   24:aload_0         
    //   13   25:ldc1            #175 <Int 0x1030011>
    //   14   27:invokevirtual   #179 <Method void setTheme(int)>
    //   15   30:aload_0         
    //   16   31:invokevirtual   #183 <Method Intent getIntent()>
    //   17   34:ldc1            #10  <String "com.applovin.interstitial.wrapper_id">
    //   18   36:invokevirtual   #189 <Method String Intent.getStringExtra(String)>
    //   19   39:astore          4
    //   20   41:aload           4
    //   21   43:ifnull          296
    //   22   46:aload           4
    //   23   48:invokevirtual   #194 <Method boolean String.isEmpty()>
    //   24   51:ifne            296
    //   25   54:aload_0         
    //   26   55:aload           4
    //   27   57:invokestatic    #197 <Method aj aj.a(String)>
    //   28   60:putfield        #82  <Field aj b>
    //   29   63:aload_0         
    //   30   64:getfield        #82  <Field aj b>
    //   31   67:ifnonnull       83
    //   32   70:getstatic       #26  <Field aj lastKnownWrapper>
    //   33   73:ifnull          83
    //   34   76:aload_0         
    //   35   77:getstatic       #26  <Field aj lastKnownWrapper>
    //   36   80:putfield        #82  <Field aj b>
    //   37   83:aload_0         
    //   38   84:getfield        #82  <Field aj b>
    //   39   87:ifnull          264
    //   40   90:aload_0         
    //   41   91:getfield        #82  <Field aj b>
    //   42   94:invokevirtual   #200 <Method AppLovinAd aj.a()>
    //   43   97:ifnull          254
    //   44  100:aload_0         
    //   45  101:ldc1            #202 <String "window">
    //   46  103:invokevirtual   #206 <Method Object getSystemService(String)>
    //   47  106:checkcast       #208 <Class WindowManager>
    //   48  109:invokeinterface #212 <Method Display WindowManager.getDefaultDisplay()>
    //   49  114:invokevirtual   #218 <Method int Display.getRotation()>
    //   50  117:istore          5
    //   51  119:aload_0         
    //   52  120:getfield        #82  <Field aj b>
    //   53  123:invokevirtual   #221 <Method com.applovin.impl.sdk.AppLovinAdInternal$AdTarget aj.e()>
    //   54  126:getstatic       #224 <Field com.applovin.impl.sdk.AppLovinAdInternal$AdTarget com.applovin.impl.sdk.AppLovinAdInternal$AdTarget.ACTIVITY_PORTRAIT>
    //   55  129:if_acmpne       229
    //   56  132:iload           5
    //   57  134:ifeq            142
    //   58  137:aload_0         
    //   59  138:iconst_1        
    //   60  139:putfield        #31  <Field boolean c>
    //   61  142:aload_0         
    //   62  143:iconst_1        
    //   63  144:invokevirtual   #227 <Method void setRequestedOrientation(int)>
    //   64  147:aload_0         
    //   65  148:new             #229 <Class AppLovinAdViewInternal>
    //   66  151:dup             
    //   67  152:getstatic       #52  <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //   68  155:aload_0         
    //   69  156:invokespecial   #232 <Method void AppLovinAdViewInternal(AppLovinAdSize, Activity)>
    //   70  159:putfield        #234 <Field AppLovinAdViewInternal a>
    //   71  162:aload_0         
    //   72  163:getfield        #234 <Field AppLovinAdViewInternal a>
    //   73  166:iconst_0        
    //   74  167:invokevirtual   #237 <Method void AppLovinAdViewInternal.setAutoDestroy(boolean)>
    //   75  170:aload_0         
    //   76  171:getfield        #82  <Field aj b>
    //   77  174:aload_0         
    //   78  175:invokevirtual   #240 <Method void aj.a(ac)>
    //   79  178:new             #242 <Class RelativeLayout>
    //   80  181:dup             
    //   81  182:aload_0         
    //   82  183:invokespecial   #245 <Method void RelativeLayout(android.content.Context)>
    //   83  186:astore          6
    //   84  188:aload           6
    //   85  190:new             #247 <Class android.widget.RelativeLayout$LayoutParams>
    //   86  193:dup             
    //   87  194:iconst_m1       
    //   88  195:iconst_m1       
    //   89  196:invokespecial   #249 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //   90  199:invokevirtual   #253 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   91  202:aload           6
    //   92  204:ldc1            #254 <Int 0xbb000000>
    //   93  206:invokevirtual   #257 <Method void RelativeLayout.setBackgroundColor(int)>
    //   94  209:aload           6
    //   95  211:aload_0         
    //   96  212:getfield        #234 <Field AppLovinAdViewInternal a>
    //   97  215:invokevirtual   #261 <Method void RelativeLayout.addView(android.view.View)>
    //   98  218:aload_0         
    //   99  219:aload           6
    //  100  221:invokevirtual   #264 <Method void setContentView(android.view.View)>
    //  101  224:aload_0         
    //  102  225:invokevirtual   #267 <Method void renderDialog()>
    //  103  228:return          
    //  104  229:iload           5
    //  105  231:iconst_1        
    //  106  232:icmpeq          246
    //  107  235:iload           5
    //  108  237:iconst_3        
    //  109  238:icmpeq          246
    //  110  241:aload_0         
    //  111  242:iconst_1        
    //  112  243:putfield        #31  <Field boolean c>
    //  113  246:aload_0         
    //  114  247:iconst_0        
    //  115  248:invokevirtual   #227 <Method void setRequestedOrientation(int)>
    //  116  251:goto            147
    //  117  254:aload_0         
    //  118  255:ldc2            #269 <String "No current ad found.">
    //  119  258:invokevirtual   #271 <Method void exitWithError(String)>
    //  120  261:goto            224
    //  121  264:aload_0         
    //  122  265:new             #117 <Class StringBuilder>
    //  123  268:dup             
    //  124  269:invokespecial   #118 <Method void StringBuilder()>
    //  125  272:ldc2            #273 <String "Wrapper is null; initialized state: ">
    //  126  275:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //  127  278:getstatic       #126 <Field boolean aj.a>
    //  128  281:invokestatic    #278 <Method String Boolean.toString(boolean)>
    //  129  284:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
    //  130  287:invokevirtual   #137 <Method String StringBuilder.toString()>
    //  131  290:invokevirtual   #271 <Method void exitWithError(String)>
    //  132  293:goto            224
    //  133  296:aload_0         
    //  134  297:ldc2            #280 <String "Wrapper ID is null">
    //  135  300:invokevirtual   #271 <Method void exitWithError(String)>
    //  136  303:goto            224
    // catch Throwable
    //  137  306:astore_3        
    //  138  307:goto            24
    }

    protected void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #234 <Field AppLovinAdViewInternal a>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #234 <Field AppLovinAdViewInternal a>
    //    5   11:invokevirtual   #284 <Method void AppLovinAdViewInternal.destroy()>
    //    6   14:aload_0         
    //    7   15:invokespecial   #286 <Method void Activity.onDestroy()>
    //    8   18:return          
    }

    protected void onPause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field boolean c>
    //    2    4:ifne            54
    //    3    7:aload_0         
    //    4    8:getfield        #234 <Field AppLovinAdViewInternal a>
    //    5   11:invokevirtual   #291 <Method AdViewControllerJsInterface AppLovinAdViewInternal.getAdViewControllerJsInterface()>
    //    6   14:astore_1        
    //    7   15:aload_0         
    //    8   16:getfield        #36  <Field AppLovinAd d>
    //    9   19:astore_2        
    //   10   20:aload_1         
    //   11   21:invokevirtual   #296 <Method int AdViewControllerJsInterface.getPercentViewed()>
    //   12   24:i2d             
    //   13   25:dstore_3        
    //   14   26:aload_1         
    //   15   27:invokevirtual   #296 <Method int AdViewControllerJsInterface.getPercentViewed()>
    //   16   30:bipush          97
    //   17   32:icmplt          59
    //   18   35:iconst_1        
    //   19   36:istore          5
    //   20   38:aload_0         
    //   21   39:aload_2         
    //   22   40:dload_3         
    //   23   41:iload           5
    //   24   43:invokespecial   #80  <Method void a(AppLovinAd, double, boolean)>
    //   25   46:aload_0         
    //   26   47:aload_0         
    //   27   48:getfield        #36  <Field AppLovinAd d>
    //   28   51:invokespecial   #76  <Method void a(AppLovinAd)>
    //   29   54:aload_0         
    //   30   55:invokespecial   #298 <Method void Activity.onPause()>
    //   31   58:return          
    //   32   59:iconst_0        
    //   33   60:istore          5
    //   34   62:goto            38
    }

    protected void renderDialog()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field boolean c>
    //    2    4:ifne            81
    //    3    7:aload_0         
    //    4    8:getfield        #234 <Field AppLovinAdViewInternal a>
    //    5   11:ifnull          82
    //    6   14:aload_0         
    //    7   15:getfield        #234 <Field AppLovinAdViewInternal a>
    //    8   18:new             #300 <Class a>
    //    9   21:dup             
    //   10   22:aload_0         
    //   11   23:invokespecial   #303 <Method void a(AppLovinInterstitialActivity)>
    //   12   26:invokevirtual   #307 <Method void AppLovinAdViewInternal.setAdDisplayListener(AppLovinAdDisplayListener)>
    //   13   29:aload_0         
    //   14   30:getfield        #234 <Field AppLovinAdViewInternal a>
    //   15   33:new             #309 <Class b>
    //   16   36:dup             
    //   17   37:aload_0         
    //   18   38:invokespecial   #310 <Method void b(AppLovinInterstitialActivity)>
    //   19   41:invokevirtual   #314 <Method void AppLovinAdViewInternal.setAdClickListener(com.applovin.sdk.AppLovinAdClickListener)>
    //   20   44:aload_0         
    //   21   45:getfield        #234 <Field AppLovinAdViewInternal a>
    //   22   48:new             #316 <Class c>
    //   23   51:dup             
    //   24   52:aload_0         
    //   25   53:invokespecial   #317 <Method void c(AppLovinInterstitialActivity)>
    //   26   56:invokevirtual   #321 <Method void AppLovinAdViewInternal.setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener)>
    //   27   59:aload_0         
    //   28   60:getfield        #234 <Field AppLovinAdViewInternal a>
    //   29   63:aload_0         
    //   30   64:getfield        #82  <Field aj b>
    //   31   67:invokevirtual   #200 <Method AppLovinAd aj.a()>
    //   32   70:invokevirtual   #324 <Method void AppLovinAdViewInternal.renderAd(AppLovinAd)>
    //   33   73:aload_0         
    //   34   74:getfield        #82  <Field aj b>
    //   35   77:iconst_1        
    //   36   78:invokevirtual   #95  <Method void aj.a(boolean)>
    //   37   81:return          
    //   38   82:aload_0         
    //   39   83:ldc2            #326 <String "AdView was null">
    //   40   86:invokevirtual   #271 <Method void exitWithError(String)>
    //   41   89:return          
    }

    public static final String KEY_WRAPPER_ID = "com.applovin.interstitial.wrapper_id";
    public static volatile aj lastKnownWrapper;
    private AppLovinAdViewInternal a;
    private aj b;
    private volatile boolean c;
    private volatile AppLovinAd d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;
}
