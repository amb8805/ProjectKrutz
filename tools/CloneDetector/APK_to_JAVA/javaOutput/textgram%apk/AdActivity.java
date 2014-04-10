// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.internal.i;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.e;
import com.google.ads.util.f;
import com.google.ads.util.g;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            n, m

public class AdActivity extends Activity
    implements android.view.View.OnClickListener
{
    public static class StaticMethodWrapper
    {

        public StaticMethodWrapper()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Object()>
        //    2    4:return          
        }

        public boolean isShowing()
        {
        //    0    0:invokestatic    #16  <Method Object com.google.ads.AdActivity.a()>
        //    1    3:astore_1        
        //    2    4:aload_1         
        //    3    5:monitorenter    
        // try 6 12 handler(s) 18
        //    4    6:invokestatic    #20  <Method AdActivity com.google.ads.AdActivity.b()>
        //    5    9:ifnull          23
        //    6   12:iconst_1        
        //    7   13:istore_3        
        // try 14 16 handler(s) 18
        //    8   14:aload_1         
        //    9   15:monitorexit     
        //   10   16:iload_3         
        //   11   17:ireturn         
        // finally
        //   12   18:astore_2        
        // try 19 21 handler(s) 18
        //   13   19:aload_1         
        //   14   20:monitorexit     
        //   15   21:aload_2         
        //   16   22:athrow          
        //   17   23:iconst_0        
        //   18   24:istore_3        
        //   19   25:goto            14
        }

        public void launchAdActivity(d d1, com.google.ads.internal.e e1)
        {
        //    0    0:invokestatic    #16  <Method Object com.google.ads.AdActivity.a()>
        //    1    3:astore_3        
        //    2    4:aload_3         
        //    3    5:monitorenter    
        // try 6 17 handler(s) 60
        //    4    6:invokestatic    #28  <Method d com.google.ads.AdActivity.d()>
        //    5    9:ifnonnull       45
        //    6   12:aload_1         
        //    7   13:invokestatic    #31  <Method d com.google.ads.AdActivity.b(d)>
        //    8   16:pop             
        // try 17 19 handler(s) 60
        //    9   17:aload_3         
        //   10   18:monitorexit     
        //   11   19:aload_1         
        //   12   20:invokevirtual   #37  <Method n d.i()>
        //   13   23:getfield        #43  <Field com.google.ads.util.i$d n.c>
        //   14   26:invokevirtual   #46  <Method Object com.google.ads.util.i$d.a()>
        //   15   29:checkcast       #48  <Class Activity>
        //   16   32:astore          5
        //   17   34:aload           5
        //   18   36:ifnonnull       67
        //   19   39:ldc1            #50  <String "activity was null while launching an AdActivity.">
        //   20   41:invokestatic    #56  <Method void b.e(String)>
        //   21   44:return          
        // try 45 59 handler(s) 60
        //   22   45:invokestatic    #28  <Method d com.google.ads.AdActivity.d()>
        //   23   48:aload_1         
        //   24   49:if_acmpeq       17
        //   25   52:ldc1            #58  <String "Tried to launch a new AdActivity with a different AdManager.">
        //   26   54:invokestatic    #60  <Method void b.b(String)>
        //   27   57:aload_3         
        //   28   58:monitorexit     
        //   29   59:return          
        // finally
        //   30   60:astore          4
        // try 62 64 handler(s) 60
        //   31   62:aload_3         
        //   32   63:monitorexit     
        //   33   64:aload           4
        //   34   66:athrow          
        //   35   67:new             #62  <Class Intent>
        //   36   70:dup             
        //   37   71:aload           5
        //   38   73:invokevirtual   #66  <Method android.content.Context Activity.getApplicationContext()>
        //   39   76:ldc1            #12  <Class AdActivity>
        //   40   78:invokespecial   #69  <Method void Intent(android.content.Context, Class)>
        //   41   81:astore          6
        //   42   83:aload           6
        //   43   85:ldc1            #71  <String "com.google.ads.AdOpener">
        //   44   87:aload_2         
        //   45   88:invokevirtual   #76  <Method Bundle com.google.ads.internal.e.a()>
        //   46   91:invokevirtual   #80  <Method Intent Intent.putExtra(String, Bundle)>
        //   47   94:pop             
        // try 95 107 handler(s) 108
        //   48   95:ldc1            #82  <String "Launching AdActivity.">
        //   49   97:invokestatic    #84  <Method void b.a(String)>
        //   50  100:aload           5
        //   51  102:aload           6
        //   52  104:invokevirtual   #88  <Method void Activity.startActivity(Intent)>
        //   53  107:return          
        // catch ActivityNotFoundException
        //   54  108:astore          8
        //   55  110:ldc1            #90  <String "Activity not found.">
        //   56  112:aload           8
        //   57  114:invokestatic    #93  <Method void b.b(String, Throwable)>
        //   58  117:return          
        }

        public boolean leftApplication()
        {
        //    0    0:invokestatic    #16  <Method Object com.google.ads.AdActivity.a()>
        //    1    3:astore_1        
        //    2    4:aload_1         
        //    3    5:monitorenter    
        // try 6 12 handler(s) 18
        //    4    6:invokestatic    #96  <Method AdActivity AdActivity.c()>
        //    5    9:ifnull          23
        //    6   12:iconst_1        
        //    7   13:istore_3        
        // try 14 16 handler(s) 18
        //    8   14:aload_1         
        //    9   15:monitorexit     
        //   10   16:iload_3         
        //   11   17:ireturn         
        // finally
        //   12   18:astore_2        
        // try 19 21 handler(s) 18
        //   13   19:aload_1         
        //   14   20:monitorexit     
        //   15   21:aload_2         
        //   16   22:athrow          
        //   17   23:iconst_0        
        //   18   24:istore_3        
        //   19   25:goto            14
        }
    }


    static 
    {
    //    0    0:getstatic       #73  <Field f a.a>
    //    1    3:invokeinterface #78  <Method Object f.b()>
    //    2    8:checkcast       #70  <Class a>
    //    3   11:putstatic       #80  <Field a a>
    //    4   14:new             #82  <Class Object>
    //    5   17:dup             
    //    6   18:invokespecial   #85  <Method void Object()>
    //    7   21:putstatic       #87  <Field Object b>
    //    8   24:aconst_null     
    //    9   25:putstatic       #89  <Field AdActivity c>
    //   10   28:aconst_null     
    //   11   29:putstatic       #91  <Field d d>
    //   12   32:aconst_null     
    //   13   33:putstatic       #93  <Field AdActivity e>
    //   14   36:aconst_null     
    //   15   37:putstatic       #95  <Field AdActivity f>
    //   16   40:new             #97  <Class AdActivity$StaticMethodWrapper>
    //   17   43:dup             
    //   18   44:invokespecial   #98  <Method void AdActivity$StaticMethodWrapper()>
    //   19   47:putstatic       #100 <Field AdActivity$StaticMethodWrapper g>
    //   20   50:return          
    }

    public AdActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #101 <Method void Activity()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #103 <Field ViewGroup k>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #105 <Field AdActivity o>
    //    8   14:return          
    }

    private android.widget.RelativeLayout.LayoutParams a(int i1, int j1, int k1, int l1)
    {
    //    0    0:new             #108 <Class android.widget.RelativeLayout$LayoutParams>
    //    1    3:dup             
    //    2    4:iload_3         
    //    3    5:iload           4
    //    4    7:invokespecial   #111 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //    5   10:astore          5
    //    6   12:aload           5
    //    7   14:iload_1         
    //    8   15:iload_2         
    //    9   16:iconst_0        
    //   10   17:iconst_0        
    //   11   18:invokevirtual   #115 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
    //   12   21:aload           5
    //   13   23:bipush          10
    //   14   25:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   15   28:aload           5
    //   16   30:bipush          9
    //   17   32:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   18   35:aload           5
    //   19   37:areturn         
    }

    static Object a()
    {
    //    0    0:getstatic       #87  <Field Object b>
    //    1    3:areturn         
    }

    private void a(String s1)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #124 <Method void b.b(String)>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #127 <Method void finish()>
    //    4    8:return          
    }

    private void a(String s1, Throwable throwable)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokestatic    #130 <Method void b.b(String, Throwable)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #127 <Method void finish()>
    //    5    9:return          
    }

    static AdActivity b()
    {
    //    0    0:getstatic       #93  <Field AdActivity e>
    //    1    3:areturn         
    }

    static d b(d d1)
    {
    //    0    0:aload_0         
    //    1    1:putstatic       #91  <Field d d>
    //    2    4:aload_0         
    //    3    5:areturn         
    }

    static AdActivity c()
    {
    //    0    0:getstatic       #89  <Field AdActivity c>
    //    1    3:areturn         
    }

    static d d()
    {
    //    0    0:getstatic       #91  <Field d d>
    //    1    3:areturn         
    }

    private void e()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field boolean l>
    //    2    4:ifne            237
    //    3    7:aload_0         
    //    4    8:getfield        #137 <Field AdWebView h>
    //    5   11:ifnull          109
    //    6   14:getstatic       #80  <Field a a>
    //    7   17:aload_0         
    //    8   18:getfield        #137 <Field AdWebView h>
    //    9   21:invokevirtual   #140 <Method void a.b(android.webkit.WebView)>
    //   10   24:aload_0         
    //   11   25:getfield        #137 <Field AdWebView h>
    //   12   28:aconst_null     
    //   13   29:invokevirtual   #146 <Method void AdWebView.setAdActivity(AdActivity)>
    //   14   32:aload_0         
    //   15   33:getfield        #137 <Field AdWebView h>
    //   16   36:iconst_0        
    //   17   37:invokevirtual   #150 <Method void AdWebView.setIsExpandedMraid(boolean)>
    //   18   40:aload_0         
    //   19   41:getfield        #152 <Field boolean q>
    //   20   44:ifne            109
    //   21   47:aload_0         
    //   22   48:getfield        #154 <Field RelativeLayout n>
    //   23   51:ifnull          109
    //   24   54:aload_0         
    //   25   55:getfield        #103 <Field ViewGroup k>
    //   26   58:ifnull          109
    //   27   61:aload_0         
    //   28   62:getfield        #156 <Field boolean r>
    //   29   65:ifeq            238
    //   30   68:aload_0         
    //   31   69:getfield        #158 <Field boolean s>
    //   32   72:ifne            238
    //   33   75:ldc1            #160 <String "Disabling hardware acceleration on collapsing MRAID WebView.">
    //   34   77:invokestatic    #162 <Method void b.a(String)>
    //   35   80:aload_0         
    //   36   81:getfield        #137 <Field AdWebView h>
    //   37   84:invokevirtual   #164 <Method void AdWebView.g()>
    //   38   87:aload_0         
    //   39   88:getfield        #154 <Field RelativeLayout n>
    //   40   91:aload_0         
    //   41   92:getfield        #137 <Field AdWebView h>
    //   42   95:invokevirtual   #170 <Method void RelativeLayout.removeView(View)>
    //   43   98:aload_0         
    //   44   99:getfield        #103 <Field ViewGroup k>
    //   45  102:aload_0         
    //   46  103:getfield        #137 <Field AdWebView h>
    //   47  106:invokevirtual   #175 <Method void ViewGroup.addView(View)>
    //   48  109:aload_0         
    //   49  110:getfield        #177 <Field AdVideoView t>
    //   50  113:ifnull          128
    //   51  116:aload_0         
    //   52  117:getfield        #177 <Field AdVideoView t>
    //   53  120:invokevirtual   #181 <Method void AdVideoView.e()>
    //   54  123:aload_0         
    //   55  124:aconst_null     
    //   56  125:putfield        #177 <Field AdVideoView t>
    //   57  128:aload_0         
    //   58  129:getstatic       #89  <Field AdActivity c>
    //   59  132:if_acmpne       139
    //   60  135:aconst_null     
    //   61  136:putstatic       #89  <Field AdActivity c>
    //   62  139:aload_0         
    //   63  140:getfield        #105 <Field AdActivity o>
    //   64  143:putstatic       #95  <Field AdActivity f>
    //   65  146:getstatic       #87  <Field Object b>
    //   66  149:astore_1        
    //   67  150:aload_1         
    //   68  151:monitorenter    
    // try 152 191 handler(s) 275
    //   69  152:getstatic       #91  <Field d d>
    //   70  155:ifnull          198
    //   71  158:aload_0         
    //   72  159:getfield        #152 <Field boolean q>
    //   73  162:ifeq            198
    //   74  165:aload_0         
    //   75  166:getfield        #137 <Field AdWebView h>
    //   76  169:ifnull          198
    //   77  172:aload_0         
    //   78  173:getfield        #137 <Field AdWebView h>
    //   79  176:getstatic       #91  <Field d d>
    //   80  179:invokevirtual   #186 <Method AdWebView d.l()>
    //   81  182:if_acmpne       191
    //   82  185:getstatic       #91  <Field d d>
    //   83  188:invokevirtual   #188 <Method void d.a()>
    // try 191 198 handler(s) 275
    //   84  191:aload_0         
    //   85  192:getfield        #137 <Field AdWebView h>
    //   86  195:invokevirtual   #191 <Method void AdWebView.stopLoading()>
    // try 198 225 handler(s) 275
    //   87  198:aload_0         
    //   88  199:getstatic       #93  <Field AdActivity e>
    //   89  202:if_acmpne       225
    //   90  205:aconst_null     
    //   91  206:putstatic       #93  <Field AdActivity e>
    //   92  209:getstatic       #91  <Field d d>
    //   93  212:ifnull          267
    //   94  215:getstatic       #91  <Field d d>
    //   95  218:invokevirtual   #193 <Method void d.u()>
    //   96  221:aconst_null     
    //   97  222:putstatic       #91  <Field d d>
    // try 225 227 handler(s) 275
    //   98  225:aload_1         
    //   99  226:monitorexit     
    //  100  227:aload_0         
    //  101  228:iconst_1        
    //  102  229:putfield        #135 <Field boolean l>
    //  103  232:ldc1            #195 <String "AdActivity is closing.">
    //  104  234:invokestatic    #162 <Method void b.a(String)>
    //  105  237:return          
    //  106  238:aload_0         
    //  107  239:getfield        #156 <Field boolean r>
    //  108  242:ifne            87
    //  109  245:aload_0         
    //  110  246:getfield        #158 <Field boolean s>
    //  111  249:ifeq            87
    //  112  252:ldc1            #197 <String "Re-enabling hardware acceleration on collapsing MRAID WebView.">
    //  113  254:invokestatic    #162 <Method void b.a(String)>
    //  114  257:aload_0         
    //  115  258:getfield        #137 <Field AdWebView h>
    //  116  261:invokevirtual   #199 <Method void AdWebView.h()>
    //  117  264:goto            87
    // try 267 272 handler(s) 275
    //  118  267:ldc1            #201 <String "currentAdManager is null while trying to destroy AdActivity.">
    //  119  269:invokestatic    #203 <Method void b.e(String)>
    //  120  272:goto            225
    // finally
    //  121  275:astore_2        
    // try 276 278 handler(s) 275
    //  122  276:aload_1         
    //  123  277:monitorexit     
    //  124  278:aload_2         
    //  125  279:athrow          
    }

    public static boolean isShowing()
    {
    //    0    0:getstatic       #100 <Field AdActivity$StaticMethodWrapper g>
    //    1    3:invokevirtual   #207 <Method boolean AdActivity$StaticMethodWrapper.isShowing()>
    //    2    6:ireturn         
    }

    public static void launchAdActivity(d d1, com.google.ads.internal.e e1)
    {
    //    0    0:getstatic       #100 <Field AdActivity$StaticMethodWrapper g>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokevirtual   #211 <Method void AdActivity$StaticMethodWrapper.launchAdActivity(d, com.google.ads.internal.e)>
    //    4    8:return          
    }

    public static boolean leftApplication()
    {
    //    0    0:getstatic       #100 <Field AdActivity$StaticMethodWrapper g>
    //    1    3:invokevirtual   #214 <Method boolean AdActivity$StaticMethodWrapper.leftApplication()>
    //    2    6:ireturn         
    }

    protected View a(int i1, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:iload_1         
    //    3    3:i2f             
    //    4    4:aload_0         
    //    5    5:invokevirtual   #219 <Method Resources getResources()>
    //    6    8:invokevirtual   #225 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
    //    7   11:invokestatic    #231 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
    //    8   14:f2i             
    //    9   15:putfield        #233 <Field int j>
    //   10   18:aload_0         
    //   11   19:new             #235 <Class FrameLayout>
    //   12   22:dup             
    //   13   23:aload_0         
    //   14   24:invokevirtual   #239 <Method android.content.Context getApplicationContext()>
    //   15   27:invokespecial   #242 <Method void FrameLayout(android.content.Context)>
    //   16   30:putfield        #244 <Field FrameLayout i>
    //   17   33:aload_0         
    //   18   34:getfield        #244 <Field FrameLayout i>
    //   19   37:aload_0         
    //   20   38:getfield        #233 <Field int j>
    //   21   41:invokevirtual   #247 <Method void FrameLayout.setMinimumWidth(int)>
    //   22   44:aload_0         
    //   23   45:getfield        #244 <Field FrameLayout i>
    //   24   48:aload_0         
    //   25   49:getfield        #233 <Field int j>
    //   26   52:invokevirtual   #250 <Method void FrameLayout.setMinimumHeight(int)>
    //   27   55:aload_0         
    //   28   56:getfield        #244 <Field FrameLayout i>
    //   29   59:aload_0         
    //   30   60:invokevirtual   #254 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
    //   31   63:aload_0         
    //   32   64:iload_2         
    //   33   65:invokevirtual   #257 <Method void setCustomClose(boolean)>
    //   34   68:aload_0         
    //   35   69:getfield        #244 <Field FrameLayout i>
    //   36   72:areturn         
    }

    protected AdVideoView a(Activity activity)
    {
    //    0    0:new             #179 <Class AdVideoView>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #137 <Field AdWebView h>
    //    5    9:invokespecial   #261 <Method void AdVideoView(Activity, AdWebView)>
    //    6   12:areturn         
    }

    protected void a(AdWebView adwebview, boolean flag, int i1, boolean flag1, boolean flag2)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokevirtual   #266 <Method boolean requestWindowFeature(int)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:invokevirtual   #270 <Method Window getWindow()>
    //    6   10:astore          7
    //    7   12:aload           7
    //    8   14:sipush          1024
    //    9   17:sipush          1024
    //   10   20:invokevirtual   #275 <Method void Window.setFlags(int, int)>
    //   11   23:getstatic       #279 <Field int AdUtil.a>
    //   12   26:bipush          11
    //   13   28:icmplt          49
    //   14   31:aload_0         
    //   15   32:getfield        #156 <Field boolean r>
    //   16   35:ifeq            105
    //   17   38:ldc2            #281 <String "Enabling hardware acceleration on the AdActivity window.">
    //   18   41:invokestatic    #162 <Method void b.a(String)>
    //   19   44:aload           7
    //   20   46:invokestatic    #286 <Method void g.a(Window)>
    //   21   49:aload_1         
    //   22   50:invokevirtual   #290 <Method android.view.ViewParent AdWebView.getParent()>
    //   23   53:astore          8
    //   24   55:aload           8
    //   25   57:ifnull          90
    //   26   60:iload           4
    //   27   62:ifeq            126
    //   28   65:aload           8
    //   29   67:instanceof      #172 <Class ViewGroup>
    //   30   70:ifeq            118
    //   31   73:aload_0         
    //   32   74:aload           8
    //   33   76:checkcast       #172 <Class ViewGroup>
    //   34   79:putfield        #103 <Field ViewGroup k>
    //   35   82:aload_0         
    //   36   83:getfield        #103 <Field ViewGroup k>
    //   37   86:aload_1         
    //   38   87:invokevirtual   #291 <Method void ViewGroup.removeView(View)>
    //   39   90:aload_1         
    //   40   91:invokevirtual   #293 <Method AdActivity AdWebView.i()>
    //   41   94:ifnull          134
    //   42   97:aload_0         
    //   43   98:ldc2            #295 <String "Interstitial created with an AdWebView that is already in use by another AdActivity.">
    //   44  101:invokespecial   #296 <Method void a(String)>
    //   45  104:return          
    //   46  105:ldc2            #298 <String "Disabling hardware acceleration on the AdActivity WebView.">
    //   47  108:invokestatic    #162 <Method void b.a(String)>
    //   48  111:aload_1         
    //   49  112:invokevirtual   #164 <Method void AdWebView.g()>
    //   50  115:goto            49
    //   51  118:aload_0         
    //   52  119:ldc2            #300 <String "MRAID banner was not a child of a ViewGroup.">
    //   53  122:invokespecial   #296 <Method void a(String)>
    //   54  125:return          
    //   55  126:aload_0         
    //   56  127:ldc2            #302 <String "Interstitial created with an AdWebView that has a parent.">
    //   57  130:invokespecial   #296 <Method void a(String)>
    //   58  133:return          
    //   59  134:aload_0         
    //   60  135:iload_3         
    //   61  136:invokevirtual   #305 <Method void setRequestedOrientation(int)>
    //   62  139:aload_1         
    //   63  140:aload_0         
    //   64  141:invokevirtual   #146 <Method void AdWebView.setAdActivity(AdActivity)>
    //   65  144:iload           4
    //   66  146:ifeq            257
    //   67  149:bipush          50
    //   68  151:istore          9
    //   69  153:aload_0         
    //   70  154:iload           9
    //   71  156:iload           5
    //   72  158:invokevirtual   #307 <Method View a(int, boolean)>
    //   73  161:astore          10
    //   74  163:aload_0         
    //   75  164:getfield        #154 <Field RelativeLayout n>
    //   76  167:aload_1         
    //   77  168:iconst_m1       
    //   78  169:iconst_m1       
    //   79  170:invokevirtual   #310 <Method void RelativeLayout.addView(View, int, int)>
    //   80  173:new             #108 <Class android.widget.RelativeLayout$LayoutParams>
    //   81  176:dup             
    //   82  177:bipush          -2
    //   83  179:bipush          -2
    //   84  181:invokespecial   #111 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //   85  184:astore          11
    //   86  186:iload           4
    //   87  188:ifeq            264
    //   88  191:aload           11
    //   89  193:bipush          10
    //   90  195:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   91  198:aload           11
    //   92  200:bipush          11
    //   93  202:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //   94  205:aload_0         
    //   95  206:getfield        #154 <Field RelativeLayout n>
    //   96  209:aload           10
    //   97  211:aload           11
    //   98  213:invokevirtual   #313 <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   99  216:aload_0         
    //  100  217:getfield        #154 <Field RelativeLayout n>
    //  101  220:iconst_1        
    //  102  221:invokevirtual   #316 <Method void RelativeLayout.setKeepScreenOn(boolean)>
    //  103  224:aload_0         
    //  104  225:aload_0         
    //  105  226:getfield        #154 <Field RelativeLayout n>
    //  106  229:invokevirtual   #319 <Method void setContentView(View)>
    //  107  232:aload_0         
    //  108  233:getfield        #154 <Field RelativeLayout n>
    //  109  236:invokevirtual   #323 <Method View RelativeLayout.getRootView()>
    //  110  239:ldc2            #324 <Int 0xff000000>
    //  111  242:invokevirtual   #329 <Method void View.setBackgroundColor(int)>
    //  112  245:iload_2         
    //  113  246:ifeq            104
    //  114  249:getstatic       #80  <Field a a>
    //  115  252:aload_1         
    //  116  253:invokevirtual   #331 <Method void a.a(android.webkit.WebView)>
    //  117  256:return          
    //  118  257:bipush          32
    //  119  259:istore          9
    //  120  261:goto            153
    //  121  264:aload           11
    //  122  266:bipush          10
    //  123  268:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //  124  271:aload           11
    //  125  273:bipush          9
    //  126  275:invokevirtual   #119 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
    //  127  278:goto            205
    }

    protected void a(d d1)
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #137 <Field AdWebView h>
    //    3    5:aload_0         
    //    4    6:invokestatic    #338 <Method long SystemClock.elapsedRealtime()>
    //    5    9:putfield        #340 <Field long m>
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:putfield        #342 <Field boolean p>
    //    9   17:getstatic       #87  <Field Object b>
    //   10   20:astore_2        
    //   11   21:aload_2         
    //   12   22:monitorenter    
    // try 23 37 handler(s) 40
    //   13   23:getstatic       #89  <Field AdActivity c>
    //   14   26:ifnonnull       37
    //   15   29:aload_0         
    //   16   30:putstatic       #89  <Field AdActivity c>
    //   17   33:aload_1         
    //   18   34:invokevirtual   #345 <Method void d.w()>
    // try 37 39 handler(s) 40
    //   19   37:aload_2         
    //   20   38:monitorexit     
    //   21   39:return          
    // finally
    //   22   40:astore_3        
    // try 41 43 handler(s) 40
    //   23   41:aload_2         
    //   24   42:monitorexit     
    //   25   43:aload_3         
    //   26   44:athrow          
    }

    protected void a(HashMap hashmap, d d1)
    {
    //    0    0:iconst_0        
    //    1    1:istore_3        
    //    2    2:aload_1         
    //    3    3:ifnonnull       14
    //    4    6:aload_0         
    //    5    7:ldc2            #354 <String "Could not get the paramMap in launchIntent()">
    //    6   10:invokespecial   #296 <Method void a(String)>
    //    7   13:return          
    //    8   14:new             #356 <Class Intent>
    //    9   17:dup             
    //   10   18:invokespecial   #357 <Method void Intent()>
    //   11   21:astore          4
    //   12   23:aload_1         
    //   13   24:ldc1            #40  <String "u">
    //   14   26:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   15   29:checkcast       #365 <Class String>
    //   16   32:astore          5
    //   17   34:aload_1         
    //   18   35:ldc1            #37  <String "m">
    //   19   37:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   20   40:checkcast       #365 <Class String>
    //   21   43:astore          6
    //   22   45:aload_1         
    //   23   46:ldc1            #22  <String "i">
    //   24   48:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   25   51:checkcast       #365 <Class String>
    //   26   54:astore          7
    //   27   56:aload_1         
    //   28   57:ldc1            #34  <String "p">
    //   29   59:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   30   62:checkcast       #365 <Class String>
    //   31   65:astore          8
    //   32   67:aload_1         
    //   33   68:ldc1            #13  <String "c">
    //   34   70:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   35   73:checkcast       #365 <Class String>
    //   36   76:astore          9
    //   37   78:aload_1         
    //   38   79:ldc1            #28  <String "f">
    //   39   81:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   40   84:checkcast       #365 <Class String>
    //   41   87:astore          10
    //   42   89:aload_1         
    //   43   90:ldc1            #25  <String "e">
    //   44   92:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //   45   95:checkcast       #365 <Class String>
    //   46   98:astore          11
    //   47  100:aload           5
    //   48  102:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   49  105:ifne            419
    //   50  108:iconst_1        
    //   51  109:istore          12
    //   52  111:aload           6
    //   53  113:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   54  116:ifne            425
    //   55  119:iconst_1        
    //   56  120:istore          13
    //   57  122:iload           12
    //   58  124:ifeq            431
    //   59  127:iload           13
    //   60  129:ifeq            431
    //   61  132:aload           4
    //   62  134:aload           5
    //   63  136:invokestatic    #377 <Method Uri Uri.parse(String)>
    //   64  139:aload           6
    //   65  141:invokevirtual   #381 <Method Intent Intent.setDataAndType(Uri, String)>
    //   66  144:pop             
    //   67  145:aload           7
    //   68  147:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   69  150:ifne            466
    //   70  153:aload           4
    //   71  155:aload           7
    //   72  157:invokevirtual   #385 <Method Intent Intent.setAction(String)>
    //   73  160:pop             
    //   74  161:aload           8
    //   75  163:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   76  166:ifne            183
    //   77  169:getstatic       #279 <Field int AdUtil.a>
    //   78  172:iconst_4        
    //   79  173:icmplt          183
    //   80  176:aload           4
    //   81  178:aload           8
    //   82  180:invokestatic    #390 <Method void e.a(Intent, String)>
    //   83  183:aload           9
    //   84  185:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   85  188:ifne            246
    //   86  191:aload           9
    //   87  193:ldc2            #392 <String "/">
    //   88  196:invokevirtual   #396 <Method String[] String.split(String)>
    //   89  199:astore          32
    //   90  201:aload           32
    //   91  203:arraylength     
    //   92  204:iconst_2        
    //   93  205:icmpge          232
    //   94  208:new             #398 <Class StringBuilder>
    //   95  211:dup             
    //   96  212:invokespecial   #399 <Method void StringBuilder()>
    //   97  215:ldc2            #401 <String "Warning: Could not parse component name from open GMSG: ">
    //   98  218:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //   99  221:aload           9
    //  100  223:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  101  226:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  102  229:invokestatic    #203 <Method void b.e(String)>
    //  103  232:aload           4
    //  104  234:aload           32
    //  105  236:iconst_0        
    //  106  237:aaload          
    //  107  238:aload           32
    //  108  240:iconst_1        
    //  109  241:aaload          
    //  110  242:invokevirtual   #413 <Method Intent Intent.setClassName(String, String)>
    //  111  245:pop             
    //  112  246:aload           10
    //  113  248:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //  114  251:ifne            273
    // try 254 261 handler(s) 483
    //  115  254:aload           10
    //  116  256:invokestatic    #419 <Method int Integer.parseInt(String)>
    //  117  259:istore          31
    //  118  261:iload           31
    //  119  263:istore          29
    //  120  265:aload           4
    //  121  267:iload           29
    //  122  269:invokevirtual   #423 <Method Intent Intent.addFlags(int)>
    //  123  272:pop             
    //  124  273:aload           11
    //  125  275:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
    //  126  278:ifne            560
    // try 281 299 handler(s) 534
    //  127  281:new             #425 <Class JSONObject>
    //  128  284:dup             
    //  129  285:aload           11
    //  130  287:invokespecial   #427 <Method void JSONObject(String)>
    //  131  290:astore          17
    //  132  292:aload           17
    //  133  294:invokevirtual   #431 <Method JSONArray JSONObject.names()>
    //  134  297:astore          19
    // try 299 335 handler(s) 534
    //  135  299:iload_3         
    //  136  300:aload           19
    //  137  302:invokevirtual   #437 <Method int JSONArray.length()>
    //  138  305:icmpge          560
    //  139  308:aload           19
    //  140  310:iload_3         
    //  141  311:invokevirtual   #441 <Method String JSONArray.getString(int)>
    //  142  314:astore          20
    //  143  316:aload           17
    //  144  318:aload           20
    //  145  320:invokevirtual   #445 <Method JSONObject JSONObject.getJSONObject(String)>
    //  146  323:astore          21
    //  147  325:aload           21
    //  148  327:ldc2            #446 <String "t">
    //  149  330:invokevirtual   #449 <Method int JSONObject.getInt(String)>
    //  150  333:istore          22
    //  151  335:iload           22
    //  152  337:tableswitch     1 5: default 372
    //                   1 515
    //                   2 583
    //                   3 602
    //                   4 621
    //                   5 640
    // try 372 413 handler(s) 534
    //  153  372:new             #398 <Class StringBuilder>
    //  154  375:dup             
    //  155  376:invokespecial   #399 <Method void StringBuilder()>
    //  156  379:ldc2            #451 <String "Warning: Unknown type in extras from open GMSG: ">
    //  157  382:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  158  385:aload           20
    //  159  387:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  160  390:ldc2            #453 <String " (type: ">
    //  161  393:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  162  396:iload           22
    //  163  398:invokevirtual   #456 <Method StringBuilder StringBuilder.append(int)>
    //  164  401:ldc2            #458 <String ")">
    //  165  404:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  166  407:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  167  410:invokestatic    #203 <Method void b.e(String)>
    //  168  413:iinc            3  1
    //  169  416:goto            299
    //  170  419:iconst_0        
    //  171  420:istore          12
    //  172  422:goto            111
    //  173  425:iconst_0        
    //  174  426:istore          13
    //  175  428:goto            122
    //  176  431:iload           12
    //  177  433:ifeq            450
    //  178  436:aload           4
    //  179  438:aload           5
    //  180  440:invokestatic    #377 <Method Uri Uri.parse(String)>
    //  181  443:invokevirtual   #462 <Method Intent Intent.setData(Uri)>
    //  182  446:pop             
    //  183  447:goto            145
    //  184  450:iload           13
    //  185  452:ifeq            145
    //  186  455:aload           4
    //  187  457:aload           6
    //  188  459:invokevirtual   #465 <Method Intent Intent.setType(String)>
    //  189  462:pop             
    //  190  463:goto            145
    //  191  466:iload           12
    //  192  468:ifeq            161
    //  193  471:aload           4
    //  194  473:ldc2            #467 <String "android.intent.action.VIEW">
    //  195  476:invokevirtual   #385 <Method Intent Intent.setAction(String)>
    //  196  479:pop             
    //  197  480:goto            161
    // catch NumberFormatException
    //  198  483:astore          28
    //  199  485:new             #398 <Class StringBuilder>
    //  200  488:dup             
    //  201  489:invokespecial   #399 <Method void StringBuilder()>
    //  202  492:ldc2            #469 <String "Warning: Could not parse flags from open GMSG: ">
    //  203  495:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  204  498:aload           10
    //  205  500:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  206  503:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  207  506:invokestatic    #203 <Method void b.e(String)>
    //  208  509:iconst_0        
    //  209  510:istore          29
    //  210  512:goto            265
    // try 515 531 handler(s) 534
    //  211  515:aload           4
    //  212  517:aload           20
    //  213  519:aload           21
    //  214  521:ldc2            #471 <String "v">
    //  215  524:invokevirtual   #475 <Method boolean JSONObject.getBoolean(String)>
    //  216  527:invokevirtual   #479 <Method Intent Intent.putExtra(String, boolean)>
    //  217  530:pop             
    //  218  531:goto            413
    // catch JSONException JSONException JSONException JSONException JSONException JSONException JSONException JSONException
    //  219  534:astore          18
    //  220  536:new             #398 <Class StringBuilder>
    //  221  539:dup             
    //  222  540:invokespecial   #399 <Method void StringBuilder()>
    //  223  543:ldc2            #481 <String "Warning: Could not parse extras from open GMSG: ">
    //  224  546:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  225  549:aload           11
    //  226  551:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  227  554:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  228  557:invokestatic    #203 <Method void b.e(String)>
    //  229  560:aload           4
    //  230  562:new             #356 <Class Intent>
    //  231  565:dup             
    //  232  566:invokespecial   #357 <Method void Intent()>
    //  233  569:invokevirtual   #485 <Method boolean Intent.filterEquals(Intent)>
    //  234  572:ifeq            659
    //  235  575:aload_0         
    //  236  576:ldc2            #487 <String "Tried to launch empty intent.">
    //  237  579:invokespecial   #296 <Method void a(String)>
    //  238  582:return          
    // try 583 599 handler(s) 534
    //  239  583:aload           4
    //  240  585:aload           20
    //  241  587:aload           21
    //  242  589:ldc2            #471 <String "v">
    //  243  592:invokevirtual   #491 <Method double JSONObject.getDouble(String)>
    //  244  595:invokevirtual   #494 <Method Intent Intent.putExtra(String, double)>
    //  245  598:pop             
    //  246  599:goto            413
    // try 602 618 handler(s) 534
    //  247  602:aload           4
    //  248  604:aload           20
    //  249  606:aload           21
    //  250  608:ldc2            #471 <String "v">
    //  251  611:invokevirtual   #449 <Method int JSONObject.getInt(String)>
    //  252  614:invokevirtual   #497 <Method Intent Intent.putExtra(String, int)>
    //  253  617:pop             
    //  254  618:goto            413
    // try 621 637 handler(s) 534
    //  255  621:aload           4
    //  256  623:aload           20
    //  257  625:aload           21
    //  258  627:ldc2            #471 <String "v">
    //  259  630:invokevirtual   #501 <Method long JSONObject.getLong(String)>
    //  260  633:invokevirtual   #504 <Method Intent Intent.putExtra(String, long)>
    //  261  636:pop             
    //  262  637:goto            413
    // try 640 656 handler(s) 534
    //  263  640:aload           4
    //  264  642:aload           20
    //  265  644:aload           21
    //  266  646:ldc2            #471 <String "v">
    //  267  649:invokevirtual   #507 <Method String JSONObject.getString(String)>
    //  268  652:invokevirtual   #509 <Method Intent Intent.putExtra(String, String)>
    //  269  655:pop             
    //  270  656:goto            413
    // try 659 694 handler(s) 695
    //  271  659:new             #398 <Class StringBuilder>
    //  272  662:dup             
    //  273  663:invokespecial   #399 <Method void StringBuilder()>
    //  274  666:ldc2            #511 <String "Launching an intent from AdActivity: ">
    //  275  669:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  276  672:aload           4
    //  277  674:invokevirtual   #514 <Method StringBuilder StringBuilder.append(Object)>
    //  278  677:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  279  680:invokestatic    #162 <Method void b.a(String)>
    //  280  683:aload_0         
    //  281  684:aload           4
    //  282  686:invokevirtual   #518 <Method void startActivity(Intent)>
    //  283  689:aload_0         
    //  284  690:aload_2         
    //  285  691:invokevirtual   #520 <Method void a(d)>
    //  286  694:return          
    // catch ActivityNotFoundException
    //  287  695:astore          16
    //  288  697:aload_0         
    //  289  698:aload           16
    //  290  700:invokevirtual   #523 <Method String ActivityNotFoundException.getMessage()>
    //  291  703:aload           16
    //  292  705:invokespecial   #525 <Method void a(String, Throwable)>
    //  293  708:return          
    }

    public AdVideoView getAdVideoView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #177 <Field AdVideoView t>
    //    2    4:areturn         
    }

    public AdWebView getOpeningAdWebView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field AdActivity o>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #105 <Field AdActivity o>
    //    5   11:getfield        #137 <Field AdWebView h>
    //    6   14:areturn         
    //    7   15:getstatic       #87  <Field Object b>
    //    8   18:astore_1        
    //    9   19:aload_1         
    //   10   20:monitorenter    
    // try 21 35 handler(s) 37
    //   11   21:getstatic       #91  <Field d d>
    //   12   24:ifnonnull       42
    //   13   27:ldc2            #530 <String "currentAdManager was null while trying to get the opening AdWebView.">
    //   14   30:invokestatic    #203 <Method void b.e(String)>
    //   15   33:aload_1         
    //   16   34:monitorexit     
    //   17   35:aconst_null     
    //   18   36:areturn         
    // finally
    //   19   37:astore_2        
    // try 38 40 handler(s) 37
    //   20   38:aload_1         
    //   21   39:monitorexit     
    //   22   40:aload_2         
    //   23   41:athrow          
    // try 42 59 handler(s) 37
    //   24   42:getstatic       #91  <Field d d>
    //   25   45:invokevirtual   #186 <Method AdWebView d.l()>
    //   26   48:astore_3        
    //   27   49:aload_3         
    //   28   50:aload_0         
    //   29   51:getfield        #137 <Field AdWebView h>
    //   30   54:if_acmpeq       61
    //   31   57:aload_1         
    //   32   58:monitorexit     
    //   33   59:aload_3         
    //   34   60:areturn         
    // try 61 63 handler(s) 37
    //   35   61:aload_1         
    //   36   62:monitorexit     
    //   37   63:aconst_null     
    //   38   64:areturn         
    }

    public void moveAdVideoView(int i1, int j1, int k1, int l1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #177 <Field AdVideoView t>
    //    2    4:ifnull          30
    //    3    7:aload_0         
    //    4    8:getfield        #177 <Field AdVideoView t>
    //    5   11:aload_0         
    //    6   12:iload_1         
    //    7   13:iload_2         
    //    8   14:iload_3         
    //    9   15:iload           4
    //   10   17:invokespecial   #533 <Method android.widget.RelativeLayout$LayoutParams a(int, int, int, int)>
    //   11   20:invokevirtual   #537 <Method void AdVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   12   23:aload_0         
    //   13   24:getfield        #177 <Field AdVideoView t>
    //   14   27:invokevirtual   #540 <Method void AdVideoView.requestLayout()>
    //   15   30:return          
    }

    public void newAdVideoView(int i1, int j1, int k1, int l1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #177 <Field AdVideoView t>
    //    2    4:ifnonnull       83
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:aload_0         
    //    6   10:invokevirtual   #543 <Method AdVideoView a(Activity)>
    //    7   13:putfield        #177 <Field AdVideoView t>
    //    8   16:aload_0         
    //    9   17:getfield        #154 <Field RelativeLayout n>
    //   10   20:aload_0         
    //   11   21:getfield        #177 <Field AdVideoView t>
    //   12   24:iconst_0        
    //   13   25:aload_0         
    //   14   26:iload_1         
    //   15   27:iload_2         
    //   16   28:iload_3         
    //   17   29:iload           4
    //   18   31:invokespecial   #533 <Method android.widget.RelativeLayout$LayoutParams a(int, int, int, int)>
    //   19   34:invokevirtual   #546 <Method void RelativeLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
    //   20   37:getstatic       #87  <Field Object b>
    //   21   40:astore          5
    //   22   42:aload           5
    //   23   44:monitorenter    
    // try 45 60 handler(s) 75
    //   24   45:getstatic       #91  <Field d d>
    //   25   48:ifnonnull       61
    //   26   51:ldc2            #530 <String "currentAdManager was null while trying to get the opening AdWebView.">
    //   27   54:invokestatic    #203 <Method void b.e(String)>
    //   28   57:aload           5
    //   29   59:monitorexit     
    //   30   60:return          
    // try 61 74 handler(s) 75
    //   31   61:getstatic       #91  <Field d d>
    //   32   64:invokevirtual   #549 <Method i d.m()>
    //   33   67:iconst_0        
    //   34   68:invokevirtual   #553 <Method void i.b(boolean)>
    //   35   71:aload           5
    //   36   73:monitorexit     
    //   37   74:return          
    // finally
    //   38   75:astore          6
    // try 77 80 handler(s) 75
    //   39   77:aload           5
    //   40   79:monitorexit     
    //   41   80:aload           6
    //   42   82:athrow          
    //   43   83:return          
    }

    public void onClick(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #127 <Method void finish()>
    //    2    4:return          
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #558 <Method void Activity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #135 <Field boolean l>
    //    6   10:getstatic       #87  <Field Object b>
    //    7   13:astore_2        
    //    8   14:aload_2         
    //    9   15:monitorenter    
    // try 16 42 handler(s) 257
    //   10   16:getstatic       #91  <Field d d>
    //   11   19:ifnull          247
    //   12   22:getstatic       #91  <Field d d>
    //   13   25:astore          4
    //   14   27:getstatic       #93  <Field AdActivity e>
    //   15   30:ifnonnull       42
    //   16   33:aload_0         
    //   17   34:putstatic       #93  <Field AdActivity e>
    //   18   37:aload           4
    //   19   39:invokevirtual   #560 <Method void d.v()>
    // try 42 62 handler(s) 257
    //   20   42:aload_0         
    //   21   43:getfield        #105 <Field AdActivity o>
    //   22   46:ifnonnull       62
    //   23   49:getstatic       #95  <Field AdActivity f>
    //   24   52:ifnull          62
    //   25   55:aload_0         
    //   26   56:getstatic       #95  <Field AdActivity f>
    //   27   59:putfield        #105 <Field AdActivity o>
    // try 62 84 handler(s) 257
    //   28   62:aload_0         
    //   29   63:putstatic       #95  <Field AdActivity f>
    //   30   66:aload           4
    //   31   68:invokevirtual   #563 <Method n d.i()>
    //   32   71:invokevirtual   #567 <Method boolean com.google.ads.n.a()>
    //   33   74:ifeq            84
    //   34   77:getstatic       #93  <Field AdActivity e>
    //   35   80:aload_0         
    //   36   81:if_acmpeq       105
    // try 84 105 handler(s) 257
    //   37   84:aload           4
    //   38   86:invokevirtual   #563 <Method n d.i()>
    //   39   89:invokevirtual   #569 <Method boolean com.google.ads.n.b()>
    //   40   92:ifeq            110
    //   41   95:aload_0         
    //   42   96:getfield        #105 <Field AdActivity o>
    //   43   99:getstatic       #93  <Field AdActivity e>
    //   44  102:if_acmpne       110
    // try 105 110 handler(s) 257
    //   45  105:aload           4
    //   46  107:invokevirtual   #572 <Method void d.x()>
    // try 110 162 handler(s) 257
    //   47  110:aload           4
    //   48  112:invokevirtual   #574 <Method boolean d.r()>
    //   49  115:istore          5
    //   50  117:aload           4
    //   51  119:invokevirtual   #563 <Method n d.i()>
    //   52  122:getfield        #577 <Field com.google.ads.util.i$b com.google.ads.n.d>
    //   53  125:invokevirtual   #581 <Method Object com.google.ads.util.i$b.a()>
    //   54  128:checkcast       #583 <Class m>
    //   55  131:getfield        #585 <Field com.google.ads.util.i$b com.google.ads.m.b>
    //   56  134:invokevirtual   #581 <Method Object com.google.ads.util.i$b.a()>
    //   57  137:checkcast       #587 <Class m$a>
    //   58  140:astore          6
    //   59  142:getstatic       #279 <Field int AdUtil.a>
    //   60  145:aload           6
    //   61  147:getfield        #590 <Field com.google.ads.util.i$c com.google.ads.m$a.b>
    //   62  150:invokevirtual   #593 <Method Object com.google.ads.util.i$c.a()>
    //   63  153:checkcast       #415 <Class Integer>
    //   64  156:invokevirtual   #596 <Method int Integer.intValue()>
    //   65  159:icmplt          262
    //   66  162:iconst_1        
    //   67  163:istore          7
    // try 165 191 handler(s) 257
    //   68  165:aload_0         
    //   69  166:iload           7
    //   70  168:putfield        #158 <Field boolean s>
    //   71  171:getstatic       #279 <Field int AdUtil.a>
    //   72  174:aload           6
    //   73  176:getfield        #598 <Field com.google.ads.util.i$c com.google.ads.m$a.d>
    //   74  179:invokevirtual   #593 <Method Object com.google.ads.util.i$c.a()>
    //   75  182:checkcast       #415 <Class Integer>
    //   76  185:invokevirtual   #596 <Method int Integer.intValue()>
    //   77  188:icmplt          268
    //   78  191:iconst_1        
    //   79  192:istore          8
    // try 194 202 handler(s) 257
    //   80  194:aload_0         
    //   81  195:iload           8
    //   82  197:putfield        #156 <Field boolean r>
    //   83  200:aload_2         
    //   84  201:monitorexit     
    //   85  202:aload_0         
    //   86  203:aconst_null     
    //   87  204:putfield        #154 <Field RelativeLayout n>
    //   88  207:aload_0         
    //   89  208:iconst_0        
    //   90  209:putfield        #342 <Field boolean p>
    //   91  212:aload_0         
    //   92  213:iconst_1        
    //   93  214:putfield        #152 <Field boolean q>
    //   94  217:aload_0         
    //   95  218:aconst_null     
    //   96  219:putfield        #177 <Field AdVideoView t>
    //   97  222:aload_0         
    //   98  223:invokevirtual   #602 <Method Intent getIntent()>
    //   99  226:ldc2            #604 <String "com.google.ads.AdOpener">
    //  100  229:invokevirtual   #608 <Method Bundle Intent.getBundleExtra(String)>
    //  101  232:astore          9
    //  102  234:aload           9
    //  103  236:ifnonnull       274
    //  104  239:aload_0         
    //  105  240:ldc2            #610 <String "Could not get the Bundle used to create AdActivity.">
    //  106  243:invokespecial   #296 <Method void a(String)>
    //  107  246:return          
    // try 247 256 handler(s) 257
    //  108  247:aload_0         
    //  109  248:ldc2            #612 <String "Could not get currentAdManager.">
    //  110  251:invokespecial   #296 <Method void a(String)>
    //  111  254:aload_2         
    //  112  255:monitorexit     
    //  113  256:return          
    // finally
    //  114  257:astore_3        
    // try 258 260 handler(s) 257
    //  115  258:aload_2         
    //  116  259:monitorexit     
    //  117  260:aload_3         
    //  118  261:athrow          
    //  119  262:iconst_0        
    //  120  263:istore          7
    //  121  265:goto            165
    //  122  268:iconst_0        
    //  123  269:istore          8
    //  124  271:goto            194
    //  125  274:new             #614 <Class com.google.ads.internal.e>
    //  126  277:dup             
    //  127  278:aload           9
    //  128  280:invokespecial   #616 <Method void com.google.ads.internal.e(Bundle)>
    //  129  283:astore          10
    //  130  285:aload           10
    //  131  287:invokevirtual   #618 <Method String com.google.ads.internal.e.b()>
    //  132  290:astore          11
    //  133  292:aload           10
    //  134  294:invokevirtual   #621 <Method HashMap com.google.ads.internal.e.c()>
    //  135  297:astore          12
    //  136  299:aload           11
    //  137  301:ldc2            #623 <String "intent">
    //  138  304:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  139  307:ifeq            319
    //  140  310:aload_0         
    //  141  311:aload           12
    //  142  313:aload           4
    //  143  315:invokevirtual   #629 <Method void a(HashMap, d)>
    //  144  318:return          
    //  145  319:aload_0         
    //  146  320:new             #166 <Class RelativeLayout>
    //  147  323:dup             
    //  148  324:aload_0         
    //  149  325:invokevirtual   #239 <Method android.content.Context getApplicationContext()>
    //  150  328:invokespecial   #630 <Method void RelativeLayout(android.content.Context)>
    //  151  331:putfield        #154 <Field RelativeLayout n>
    //  152  334:aload           11
    //  153  336:ldc2            #632 <String "webapp">
    //  154  339:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  155  342:ifeq            622
    //  156  345:aload_0         
    //  157  346:new             #142 <Class AdWebView>
    //  158  349:dup             
    //  159  350:aload           4
    //  160  352:invokevirtual   #563 <Method n d.i()>
    //  161  355:aconst_null     
    //  162  356:invokespecial   #635 <Method void AdWebView(n, AdSize)>
    //  163  359:putfield        #137 <Field AdWebView h>
    //  164  362:getstatic       #638 <Field java.util.Map a.d>
    //  165  365:astore          17
    //  166  367:iload           5
    //  167  369:ifne            534
    //  168  372:iconst_1        
    //  169  373:istore          18
    //  170  375:aload           4
    //  171  377:aload           17
    //  172  379:iconst_1        
    //  173  380:iload           18
    //  174  382:invokestatic    #641 <Method i i.a(d, java.util.Map, boolean, boolean)>
    //  175  385:astore          19
    //  176  387:aload           19
    //  177  389:iconst_1        
    //  178  390:invokevirtual   #643 <Method void i.d(boolean)>
    //  179  393:iload           5
    //  180  395:ifeq            404
    //  181  398:aload           19
    //  182  400:iconst_1        
    //  183  401:invokevirtual   #645 <Method void i.a(boolean)>
    //  184  404:aload_0         
    //  185  405:getfield        #137 <Field AdWebView h>
    //  186  408:aload           19
    //  187  410:invokevirtual   #649 <Method void AdWebView.setWebViewClient(android.webkit.WebViewClient)>
    //  188  413:aload           12
    //  189  415:ldc1            #40  <String "u">
    //  190  417:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  191  420:checkcast       #365 <Class String>
    //  192  423:astore          20
    //  193  425:aload           12
    //  194  427:ldc1            #10  <String "baseurl">
    //  195  429:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  196  432:checkcast       #365 <Class String>
    //  197  435:astore          21
    //  198  437:aload           12
    //  199  439:ldc1            #19  <String "html">
    //  200  441:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  201  444:checkcast       #365 <Class String>
    //  202  447:astore          22
    //  203  449:aload           20
    //  204  451:ifnull          540
    //  205  454:aload_0         
    //  206  455:getfield        #137 <Field AdWebView h>
    //  207  458:aload           20
    //  208  460:invokevirtual   #652 <Method void AdWebView.loadUrl(String)>
    //  209  463:aload           12
    //  210  465:ldc1            #31  <String "o">
    //  211  467:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  212  470:checkcast       #365 <Class String>
    //  213  473:astore          23
    //  214  475:ldc1            #34  <String "p">
    //  215  477:aload           23
    //  216  479:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  217  482:ifeq            574
    //  218  485:invokestatic    #654 <Method int AdUtil.b()>
    //  219  488:istore          24
    //  220  490:aload_0         
    //  221  491:getfield        #137 <Field AdWebView h>
    //  222  494:astore          25
    //  223  496:aload           12
    //  224  498:ifnull          616
    //  225  501:ldc2            #656 <String "1">
    //  226  504:aload           12
    //  227  506:ldc1            #16  <String "custom_close">
    //  228  508:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  229  511:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  230  514:ifeq            616
    //  231  517:iconst_1        
    //  232  518:istore          26
    //  233  520:aload_0         
    //  234  521:aload           25
    //  235  523:iconst_0        
    //  236  524:iload           24
    //  237  526:iload           5
    //  238  528:iload           26
    //  239  530:invokevirtual   #658 <Method void a(AdWebView, boolean, int, boolean, boolean)>
    //  240  533:return          
    //  241  534:iconst_0        
    //  242  535:istore          18
    //  243  537:goto            375
    //  244  540:aload           22
    //  245  542:ifnull          566
    //  246  545:aload_0         
    //  247  546:getfield        #137 <Field AdWebView h>
    //  248  549:aload           21
    //  249  551:aload           22
    //  250  553:ldc2            #660 <String "text/html">
    //  251  556:ldc2            #662 <String "utf-8">
    //  252  559:aconst_null     
    //  253  560:invokevirtual   #666 <Method void AdWebView.loadDataWithBaseURL(String, String, String, String, String)>
    //  254  563:goto            463
    //  255  566:aload_0         
    //  256  567:ldc2            #668 <String "Could not get the URL or HTML parameter to show a web app.">
    //  257  570:invokespecial   #296 <Method void a(String)>
    //  258  573:return          
    //  259  574:ldc2            #669 <String "l">
    //  260  577:aload           23
    //  261  579:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  262  582:ifeq            593
    //  263  585:invokestatic    #671 <Method int AdUtil.a()>
    //  264  588:istore          24
    //  265  590:goto            490
    //  266  593:aload_0         
    //  267  594:getstatic       #93  <Field AdActivity e>
    //  268  597:if_acmpne       610
    //  269  600:aload           4
    //  270  602:invokevirtual   #673 <Method int d.o()>
    //  271  605:istore          24
    //  272  607:goto            490
    //  273  610:iconst_m1       
    //  274  611:istore          24
    //  275  613:goto            490
    //  276  616:iconst_0        
    //  277  617:istore          26
    //  278  619:goto            520
    //  279  622:aload           11
    //  280  624:ldc2            #675 <String "interstitial">
    //  281  627:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  282  630:ifne            644
    //  283  633:aload           11
    //  284  635:ldc2            #677 <String "expand">
    //  285  638:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  286  641:ifeq            777
    //  287  644:aload_0         
    //  288  645:aload           4
    //  289  647:invokevirtual   #186 <Method AdWebView d.l()>
    //  290  650:putfield        #137 <Field AdWebView h>
    //  291  653:aload           4
    //  292  655:invokevirtual   #673 <Method int d.o()>
    //  293  658:istore          13
    //  294  660:aload           11
    //  295  662:ldc2            #677 <String "expand">
    //  296  665:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  297  668:ifeq            765
    //  298  671:aload_0         
    //  299  672:getfield        #137 <Field AdWebView h>
    //  300  675:iconst_1        
    //  301  676:invokevirtual   #150 <Method void AdWebView.setIsExpandedMraid(boolean)>
    //  302  679:aload_0         
    //  303  680:iconst_0        
    //  304  681:putfield        #152 <Field boolean q>
    //  305  684:iconst_0        
    //  306  685:istore          15
    //  307  687:aload           12
    //  308  689:ifnull          718
    //  309  692:ldc2            #656 <String "1">
    //  310  695:aload           12
    //  311  697:ldc1            #16  <String "custom_close">
    //  312  699:invokevirtual   #363 <Method Object HashMap.get(Object)>
    //  313  702:invokevirtual   #627 <Method boolean String.equals(Object)>
    //  314  705:istore          16
    //  315  707:iconst_0        
    //  316  708:istore          15
    //  317  710:iload           16
    //  318  712:ifeq            718
    //  319  715:iconst_1        
    //  320  716:istore          15
    //  321  718:aload_0         
    //  322  719:getfield        #156 <Field boolean r>
    //  323  722:ifeq            809
    //  324  725:aload_0         
    //  325  726:getfield        #158 <Field boolean s>
    //  326  729:ifne            809
    //  327  732:ldc2            #679 <String "Re-enabling hardware acceleration on expanding MRAID WebView.">
    //  328  735:invokestatic    #162 <Method void b.a(String)>
    //  329  738:aload_0         
    //  330  739:getfield        #137 <Field AdWebView h>
    //  331  742:invokevirtual   #199 <Method void AdWebView.h()>
    //  332  745:iload           15
    //  333  747:istore          14
    //  334  749:aload_0         
    //  335  750:aload_0         
    //  336  751:getfield        #137 <Field AdWebView h>
    //  337  754:iconst_1        
    //  338  755:iload           13
    //  339  757:iload           5
    //  340  759:iload           14
    //  341  761:invokevirtual   #658 <Method void a(AdWebView, boolean, int, boolean, boolean)>
    //  342  764:return          
    //  343  765:aload_0         
    //  344  766:getfield        #137 <Field AdWebView h>
    //  345  769:invokevirtual   #681 <Method boolean AdWebView.j()>
    //  346  772:istore          14
    //  347  774:goto            749
    //  348  777:aload_0         
    //  349  778:new             #398 <Class StringBuilder>
    //  350  781:dup             
    //  351  782:invokespecial   #399 <Method void StringBuilder()>
    //  352  785:ldc2            #683 <String "Unknown AdOpener, <action: ">
    //  353  788:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  354  791:aload           11
    //  355  793:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  356  796:ldc2            #685 <String ">">
    //  357  799:invokevirtual   #405 <Method StringBuilder StringBuilder.append(String)>
    //  358  802:invokevirtual   #409 <Method String StringBuilder.toString()>
    //  359  805:invokespecial   #296 <Method void a(String)>
    //  360  808:return          
    //  361  809:iload           15
    //  362  811:istore          14
    //  363  813:goto            749
    }

    public void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #154 <Field RelativeLayout n>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #154 <Field RelativeLayout n>
    //    5   11:invokevirtual   #689 <Method void RelativeLayout.removeAllViews()>
    //    6   14:aload_0         
    //    7   15:invokevirtual   #692 <Method boolean isFinishing()>
    //    8   18:ifeq            58
    //    9   21:aload_0         
    //   10   22:invokespecial   #693 <Method void e()>
    //   11   25:aload_0         
    //   12   26:getfield        #152 <Field boolean q>
    //   13   29:ifeq            58
    //   14   32:aload_0         
    //   15   33:getfield        #137 <Field AdWebView h>
    //   16   36:ifnull          58
    //   17   39:aload_0         
    //   18   40:getfield        #137 <Field AdWebView h>
    //   19   43:invokevirtual   #191 <Method void AdWebView.stopLoading()>
    //   20   46:aload_0         
    //   21   47:getfield        #137 <Field AdWebView h>
    //   22   50:invokevirtual   #696 <Method void AdWebView.destroy()>
    //   23   53:aload_0         
    //   24   54:aconst_null     
    //   25   55:putfield        #137 <Field AdWebView h>
    //   26   58:aload_0         
    //   27   59:invokespecial   #698 <Method void Activity.onDestroy()>
    //   28   62:return          
    }

    public void onPause()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #692 <Method boolean isFinishing()>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #693 <Method void e()>
    //    5   11:aload_0         
    //    6   12:invokespecial   #701 <Method void Activity.onPause()>
    //    7   15:return          
    }

    public void onWindowFocusChanged(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #342 <Field boolean p>
    //    2    4:ifeq            36
    //    3    7:iload_1         
    //    4    8:ifeq            36
    //    5   11:invokestatic    #338 <Method long SystemClock.elapsedRealtime()>
    //    6   14:aload_0         
    //    7   15:getfield        #340 <Field long m>
    //    8   18:lsub            
    //    9   19:ldc2w           #703 <Long 250L>
    //   10   22:lcmp            
    //   11   23:ifle            36
    //   12   26:ldc2            #706 <String "Launcher AdActivity got focus and is closing.">
    //   13   29:invokestatic    #708 <Method void b.d(String)>
    //   14   32:aload_0         
    //   15   33:invokevirtual   #127 <Method void finish()>
    //   16   36:aload_0         
    //   17   37:iload_1         
    //   18   38:invokespecial   #710 <Method void Activity.onWindowFocusChanged(boolean)>
    //   19   41:return          
    }

    public void setCustomClose(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #244 <Field FrameLayout i>
    //    2    4:ifnull          79
    //    3    7:aload_0         
    //    4    8:getfield        #244 <Field FrameLayout i>
    //    5   11:invokevirtual   #711 <Method void FrameLayout.removeAllViews()>
    //    6   14:iload_1         
    //    7   15:ifne            79
    //    8   18:new             #713 <Class ImageButton>
    //    9   21:dup             
    //   10   22:aload_0         
    //   11   23:invokespecial   #714 <Method void ImageButton(android.content.Context)>
    //   12   26:astore_2        
    //   13   27:aload_2         
    //   14   28:ldc2            #715 <Int 0x1080017>
    //   15   31:invokevirtual   #718 <Method void ImageButton.setImageResource(int)>
    //   16   34:aload_2         
    //   17   35:iconst_0        
    //   18   36:invokevirtual   #719 <Method void ImageButton.setBackgroundColor(int)>
    //   19   39:aload_2         
    //   20   40:aload_0         
    //   21   41:invokevirtual   #720 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   22   44:aload_2         
    //   23   45:iconst_0        
    //   24   46:iconst_0        
    //   25   47:iconst_0        
    //   26   48:iconst_0        
    //   27   49:invokevirtual   #723 <Method void ImageButton.setPadding(int, int, int, int)>
    //   28   52:new             #725 <Class android.widget.FrameLayout$LayoutParams>
    //   29   55:dup             
    //   30   56:aload_0         
    //   31   57:getfield        #233 <Field int j>
    //   32   60:aload_0         
    //   33   61:getfield        #233 <Field int j>
    //   34   64:bipush          17
    //   35   66:invokespecial   #728 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
    //   36   69:astore_3        
    //   37   70:aload_0         
    //   38   71:getfield        #244 <Field FrameLayout i>
    //   39   74:aload_2         
    //   40   75:aload_3         
    //   41   76:invokevirtual   #729 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   42   79:return          
    }

    public static final String BASE_URL_PARAM = "baseurl";
    public static final String COMPONENT_NAME_PARAM = "c";
    public static final String CUSTOM_CLOSE_PARAM = "custom_close";
    public static final String HTML_PARAM = "html";
    public static final String INTENT_ACTION_PARAM = "i";
    public static final String INTENT_EXTRAS_PARAM = "e";
    public static final String INTENT_FLAGS_PARAM = "f";
    public static final String ORIENTATION_PARAM = "o";
    public static final String PACKAGE_NAME_PARAM = "p";
    public static final String TYPE_PARAM = "m";
    public static final String URL_PARAM = "u";
    private static final a a;
    private static final Object b;
    private static AdActivity c;
    private static d d;
    private static AdActivity e;
    private static AdActivity f;
    private static final StaticMethodWrapper g;
    private AdWebView h;
    private FrameLayout i;
    private int j;
    private ViewGroup k;
    private boolean l;
    private long m;
    private RelativeLayout n;
    private AdActivity o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private AdVideoView t;
}
