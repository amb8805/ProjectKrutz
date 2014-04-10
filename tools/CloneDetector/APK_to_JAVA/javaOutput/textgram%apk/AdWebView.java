// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.internal;

import android.app.Activity;
import android.content.*;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.*;
import com.google.ads.*;
import com.google.ads.util.*;
import java.lang.ref.WeakReference;

public class AdWebView extends WebView
{

    public AdWebView(n n1, AdSize adsize)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getfield        #22  <Field com.google.ads.util.i$b n.f>
    //    3    5:invokevirtual   #27  <Method Object com.google.ads.util.i$b.a()>
    //    4    8:checkcast       #29  <Class Context>
    //    5   11:invokespecial   #32  <Method void WebView(Context)>
    //    6   14:aload_0         
    //    7   15:aload_1         
    //    8   16:putfield        #34  <Field n a>
    //    9   19:aload_0         
    //   10   20:aload_2         
    //   11   21:putfield        #36  <Field AdSize c>
    //   12   24:aload_0         
    //   13   25:aconst_null     
    //   14   26:putfield        #38  <Field WeakReference b>
    //   15   29:aload_0         
    //   16   30:iconst_0        
    //   17   31:putfield        #40  <Field boolean d>
    //   18   34:aload_0         
    //   19   35:iconst_0        
    //   20   36:putfield        #42  <Field boolean e>
    //   21   39:aload_0         
    //   22   40:iconst_0        
    //   23   41:putfield        #44  <Field boolean f>
    //   24   44:aload_0         
    //   25   45:iconst_0        
    //   26   46:invokevirtual   #48  <Method void setBackgroundColor(int)>
    //   27   49:aload_0         
    //   28   50:invokestatic    #53  <Method void AdUtil.a(WebView)>
    //   29   53:aload_0         
    //   30   54:invokevirtual   #57  <Method WebSettings getSettings()>
    //   31   57:astore_3        
    //   32   58:aload_3         
    //   33   59:iconst_0        
    //   34   60:invokevirtual   #63  <Method void WebSettings.setSupportMultipleWindows(boolean)>
    //   35   63:aload_3         
    //   36   64:iconst_1        
    //   37   65:invokevirtual   #66  <Method void WebSettings.setJavaScriptEnabled(boolean)>
    //   38   68:aload_3         
    //   39   69:iconst_0        
    //   40   70:invokevirtual   #69  <Method void WebSettings.setSavePassword(boolean)>
    //   41   73:aload_0         
    //   42   74:new             #71  <Class AdWebView$1>
    //   43   77:dup             
    //   44   78:aload_0         
    //   45   79:invokespecial   #74  <Method void AdWebView$1(AdWebView)>
    //   46   82:invokevirtual   #78  <Method void setDownloadListener(DownloadListener)>
    //   47   85:getstatic       #81  <Field int AdUtil.a>
    //   48   88:bipush          17
    //   49   90:icmplt          125
    //   50   93:aload_3         
    //   51   94:aload_1         
    //   52   95:invokestatic    #86  <Method void h.a(WebSettings, n)>
    //   53   98:aload_0         
    //   54   99:ldc1            #87  <Int 0x2000000>
    //   55  101:invokevirtual   #90  <Method void setScrollBarStyle(int)>
    //   56  104:getstatic       #81  <Field int AdUtil.a>
    //   57  107:bipush          14
    //   58  109:icmplt          141
    //   59  112:aload_0         
    //   60  113:new             #92  <Class com.google.ads.util.IcsUtil$a>
    //   61  116:dup             
    //   62  117:aload_1         
    //   63  118:invokespecial   #95  <Method void com.google.ads.util.IcsUtil$a(n)>
    //   64  121:invokevirtual   #99  <Method void setWebChromeClient(android.webkit.WebChromeClient)>
    //   65  124:return          
    //   66  125:getstatic       #81  <Field int AdUtil.a>
    //   67  128:bipush          11
    //   68  130:icmplt          98
    //   69  133:aload_3         
    //   70  134:aload_1         
    //   71  135:invokestatic    #102 <Method void g.a(WebSettings, n)>
    //   72  138:goto            98
    //   73  141:getstatic       #81  <Field int AdUtil.a>
    //   74  144:bipush          11
    //   75  146:icmplt          124
    //   76  149:aload_0         
    //   77  150:new             #104 <Class com.google.ads.util.g$a>
    //   78  153:dup             
    //   79  154:aload_1         
    //   80  155:invokespecial   #105 <Method void com.google.ads.util.g$a(n)>
    //   81  158:invokevirtual   #99  <Method void setWebChromeClient(android.webkit.WebChromeClient)>
    //   82  161:return          
    }

    public void a(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            17
    //    2    4:aload_0         
    //    3    5:new             #107 <Class AdWebView$2>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:invokespecial   #108 <Method void AdWebView$2(AdWebView)>
    //    7   13:invokevirtual   #112 <Method void setOnTouchListener(android.view.View$OnTouchListener)>
    //    8   16:return          
    //    9   17:aload_0         
    //   10   18:aconst_null     
    //   11   19:invokevirtual   #112 <Method void setOnTouchListener(android.view.View$OnTouchListener)>
    //   12   22:return          
    }

    public void destroy()
    {
    // try 0 4 handler(s) 16
    //    0    0:aload_0         
    //    1    1:invokespecial   #118 <Method void WebView.destroy()>
    // try 4 15 handler(s) 26
    //    2    4:aload_0         
    //    3    5:new             #120 <Class WebViewClient>
    //    4    8:dup             
    //    5    9:invokespecial   #122 <Method void WebViewClient()>
    //    6   12:invokevirtual   #126 <Method void setWebViewClient(WebViewClient)>
    //    7   15:return          
    // catch Throwable
    //    8   16:astore_1        
    //    9   17:ldc1            #128 <String "An error occurred while destroying an AdWebView:">
    //   10   19:aload_1         
    //   11   20:invokestatic    #133 <Method void b.d(String, Throwable)>
    //   12   23:goto            4
    // catch Throwable
    //   13   26:astore_2        
    //   14   27:return          
    }

    public void f()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #137 <Method AdActivity i()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          13
    //    5    9:aload_1         
    //    6   10:invokevirtual   #142 <Method void AdActivity.finish()>
    //    7   13:return          
    }

    public void g()
    {
    //    0    0:getstatic       #81  <Field int AdUtil.a>
    //    1    3:bipush          11
    //    2    5:icmplt          12
    //    3    8:aload_0         
    //    4    9:invokestatic    #146 <Method void g.a(View)>
    //    5   12:aload_0         
    //    6   13:iconst_1        
    //    7   14:putfield        #42  <Field boolean e>
    //    8   17:return          
    }

    public void h()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field boolean e>
    //    2    4:ifeq            19
    //    3    7:getstatic       #81  <Field int AdUtil.a>
    //    4   10:bipush          11
    //    5   12:icmplt          19
    //    6   15:aload_0         
    //    7   16:invokestatic    #149 <Method void g.b(View)>
    //    8   19:aload_0         
    //    9   20:iconst_0        
    //   10   21:putfield        #42  <Field boolean e>
    //   11   24:return          
    }

    public AdActivity i()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field WeakReference b>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #38  <Field WeakReference b>
    //    5   11:invokevirtual   #154 <Method Object WeakReference.get()>
    //    6   14:checkcast       #139 <Class AdActivity>
    //    7   17:areturn         
    //    8   18:aconst_null     
    //    9   19:areturn         
    }

    public boolean j()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field boolean f>
    //    2    4:ireturn         
    }

    public boolean k()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field boolean e>
    //    2    4:ireturn         
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
    // try 0 11 handler(s) 12
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aload           4
    //    5    6:aload           5
    //    6    8:invokespecial   #161 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
    //    7   11:return          
    // catch Throwable
    //    8   12:astore          6
    //    9   14:ldc1            #163 <String "An error occurred while loading data in AdWebView:">
    //   10   16:aload           6
    //   11   18:invokestatic    #133 <Method void b.d(String, Throwable)>
    //   12   21:return          
    }

    public void loadUrl(String s)
    {
    // try 0 5 handler(s) 6
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #167 <Method void WebView.loadUrl(String)>
    //    3    5:return          
    // catch Throwable
    //    4    6:astore_2        
    //    5    7:ldc1            #169 <String "An error occurred while loading a URL in AdWebView:">
    //    6    9:aload_2         
    //    7   10:invokestatic    #133 <Method void b.d(String, Throwable)>
    //    8   13:return          
    }

    protected void onMeasure(int l, int i1)
    {
    //    0    0:ldc1            #172 <Int 0x7fffffff>
    //    1    2:istore_3        
    //    2    3:aload_0         
    //    3    4:monitorenter    
    // try 5 18 handler(s) 44
    //    4    5:aload_0         
    //    5    6:invokevirtual   #175 <Method boolean isInEditMode()>
    //    6    9:ifeq            21
    //    7   12:aload_0         
    //    8   13:iload_1         
    //    9   14:iload_2         
    //   10   15:invokespecial   #177 <Method void WebView.onMeasure(int, int)>
    //   11   18:aload_0         
    //   12   19:monitorexit     
    //   13   20:return          
    // try 21 35 handler(s) 44
    //   14   21:aload_0         
    //   15   22:getfield        #36  <Field AdSize c>
    //   16   25:ifnull          35
    //   17   28:aload_0         
    //   18   29:getfield        #40  <Field boolean d>
    //   19   32:ifeq            51
    // try 35 41 handler(s) 44
    //   20   35:aload_0         
    //   21   36:iload_1         
    //   22   37:iload_2         
    //   23   38:invokespecial   #177 <Method void WebView.onMeasure(int, int)>
    //   24   41:goto            18
    // finally
    //   25   44:astore          4
    //   26   46:aload_0         
    //   27   47:monitorexit     
    //   28   48:aload           4
    //   29   50:athrow          
    // try 51 118 handler(s) 44
    //   30   51:iload_1         
    //   31   52:invokestatic    #183 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   32   55:istore          5
    //   33   57:iload_1         
    //   34   58:invokestatic    #186 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   35   61:istore          6
    //   36   63:iload_2         
    //   37   64:invokestatic    #183 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   38   67:istore          7
    //   39   69:iload_2         
    //   40   70:invokestatic    #186 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   41   73:istore          8
    //   42   75:aload_0         
    //   43   76:invokevirtual   #190 <Method Context getContext()>
    //   44   79:invokevirtual   #194 <Method Resources Context.getResources()>
    //   45   82:invokevirtual   #200 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   46   85:getfield        #206 <Field float DisplayMetrics.density>
    //   47   88:fstore          9
    //   48   90:fload           9
    //   49   92:aload_0         
    //   50   93:getfield        #36  <Field AdSize c>
    //   51   96:invokevirtual   #212 <Method int AdSize.getWidth()>
    //   52   99:i2f             
    //   53  100:fmul            
    //   54  101:f2i             
    //   55  102:istore          10
    //   56  104:fload           9
    //   57  106:aload_0         
    //   58  107:getfield        #36  <Field AdSize c>
    //   59  110:invokevirtual   #215 <Method int AdSize.getHeight()>
    //   60  113:i2f             
    //   61  114:fmul            
    //   62  115:f2i             
    //   63  116:istore          11
    //   64  118:iload           5
    //   65  120:ldc1            #216 <Int 0x80000000>
    //   66  122:icmpeq          227
    //   67  125:iload           5
    //   68  127:ldc1            #217 <Int 0x40000000>
    //   69  129:icmpne          221
    //   70  132:goto            227
    // try 135 207 handler(s) 44
    //   71  135:new             #219 <Class StringBuilder>
    //   72  138:dup             
    //   73  139:invokespecial   #220 <Method void StringBuilder()>
    //   74  142:ldc1            #222 <String "Not enough space to show ad! Wants: <">
    //   75  144:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
    //   76  147:iload           10
    //   77  149:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
    //   78  152:ldc1            #231 <String ", ">
    //   79  154:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
    //   80  157:iload           11
    //   81  159:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
    //   82  162:ldc1            #233 <String ">, Has: <">
    //   83  164:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
    //   84  167:iload           6
    //   85  169:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
    //   86  172:ldc1            #231 <String ", ">
    //   87  174:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
    //   88  177:iload           8
    //   89  179:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
    //   90  182:ldc1            #235 <String ">">
    //   91  184:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
    //   92  187:invokevirtual   #239 <Method String StringBuilder.toString()>
    //   93  190:invokestatic    #241 <Method void b.b(String)>
    //   94  193:aload_0         
    //   95  194:bipush          8
    //   96  196:invokevirtual   #244 <Method void setVisibility(int)>
    //   97  199:aload_0         
    //   98  200:iload           6
    //   99  202:iload           8
    //  100  204:invokevirtual   #247 <Method void setMeasuredDimension(int, int)>
    //  101  207:goto            18
    // try 210 218 handler(s) 44
    //  102  210:aload_0         
    //  103  211:iload           10
    //  104  213:iload           11
    //  105  215:invokevirtual   #247 <Method void setMeasuredDimension(int, int)>
    //  106  218:goto            18
    //  107  221:iload_3         
    //  108  222:istore          12
    //  109  224:goto            231
    //  110  227:iload           6
    //  111  229:istore          12
    //  112  231:iload           7
    //  113  233:ldc1            #216 <Int 0x80000000>
    //  114  235:icmpeq          245
    //  115  238:iload           7
    //  116  240:ldc1            #217 <Int 0x40000000>
    //  117  242:icmpne          248
    //  118  245:iload           8
    //  119  247:istore_3        
    //  120  248:iload           10
    //  121  250:i2f             
    //  122  251:fload           9
    //  123  253:ldc1            #248 <Float 6F>
    //  124  255:fmul            
    //  125  256:fsub            
    //  126  257:iload           12
    //  127  259:i2f             
    //  128  260:fcmpl           
    //  129  261:ifgt            135
    //  130  264:iload           11
    //  131  266:iload_3         
    //  132  267:icmple          210
    //  133  270:goto            135
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field n a>
    //    2    4:getfield        #254 <Field com.google.ads.util.i$c n.r>
    //    3    7:invokevirtual   #257 <Method Object com.google.ads.util.i$c.a()>
    //    4   10:checkcast       #259 <Class ak>
    //    5   13:astore_2        
    //    6   14:aload_2         
    //    7   15:ifnull          23
    //    8   18:aload_2         
    //    9   19:aload_1         
    //   10   20:invokevirtual   #262 <Method void ak.a(MotionEvent)>
    //   11   23:aload_0         
    //   12   24:aload_1         
    //   13   25:invokespecial   #264 <Method boolean WebView.onTouchEvent(MotionEvent)>
    //   14   28:ireturn         
    }

    public void setAdActivity(AdActivity adactivity)
    {
    //    0    0:aload_0         
    //    1    1:new             #151 <Class WeakReference>
    //    2    4:dup             
    //    3    5:aload_1         
    //    4    6:invokespecial   #269 <Method void WeakReference(Object)>
    //    5    9:putfield        #38  <Field WeakReference b>
    //    6   12:return          
    }

    public void setAdSize(AdSize adsize)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 11 handler(s) 14
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:putfield        #36  <Field AdSize c>
    //    5    7:aload_0         
    //    6    8:invokevirtual   #274 <Method void requestLayout()>
    //    7   11:aload_0         
    //    8   12:monitorexit     
    //    9   13:return          
    // finally
    //   10   14:astore_2        
    //   11   15:aload_0         
    //   12   16:monitorexit     
    //   13   17:aload_2         
    //   14   18:athrow          
    }

    public void setCustomClose(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #44  <Field boolean f>
    //    3    5:aload_0         
    //    4    6:getfield        #38  <Field WeakReference b>
    //    5    9:ifnull          32
    //    6   12:aload_0         
    //    7   13:getfield        #38  <Field WeakReference b>
    //    8   16:invokevirtual   #154 <Method Object WeakReference.get()>
    //    9   19:checkcast       #139 <Class AdActivity>
    //   10   22:astore_2        
    //   11   23:aload_2         
    //   12   24:ifnull          32
    //   13   27:aload_2         
    //   14   28:iload_1         
    //   15   29:invokevirtual   #277 <Method void AdActivity.setCustomClose(boolean)>
    //   16   32:return          
    }

    public void setIsExpandedMraid(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #40  <Field boolean d>
    //    3    5:return          
    }

    public void stopLoading()
    {
    // try 0 4 handler(s) 5
    //    0    0:aload_0         
    //    1    1:invokespecial   #281 <Method void WebView.stopLoading()>
    //    2    4:return          
    // catch Throwable
    //    3    5:astore_1        
    //    4    6:ldc2            #283 <String "An error occurred while stopping loading in AdWebView:">
    //    5    9:aload_1         
    //    6   10:invokestatic    #133 <Method void b.d(String, Throwable)>
    //    7   13:return          
    }

    protected final n a;
    private WeakReference b;
    private AdSize c;
    private boolean d;
    private boolean e;
    private boolean f;

    // Unreferenced inner class com/google/ads/internal/AdWebView$1

/* anonymous class */
    class _cls1
        implements DownloadListener
    {

        _cls1(AdWebView adwebview)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AdWebView a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onDownloadStart(String s, String s1, String s2, String s3, long l)
        {
        // try 0 32 handler(s) 55 90
        //    0    0:new             #27  <Class Intent>
        //    1    3:dup             
        //    2    4:ldc1            #29  <String "android.intent.action.VIEW">
        //    3    6:invokespecial   #32  <Method void Intent(String)>
        //    4    9:astore          7
        //    5   11:aload           7
        //    6   13:aload_1         
        //    7   14:invokestatic    #38  <Method Uri Uri.parse(String)>
        //    8   17:aload           4
        //    9   19:invokevirtual   #42  <Method Intent Intent.setDataAndType(Uri, String)>
        //   10   22:pop             
        //   11   23:aload_0         
        //   12   24:getfield        #16  <Field AdWebView a>
        //   13   27:invokevirtual   #46  <Method AdActivity AdWebView.i()>
        //   14   30:astore          11
        //   15   32:aload           11
        //   16   34:ifnull          54
        // try 37 54 handler(s) 55 90
        //   17   37:aload           7
        //   18   39:aload           11
        //   19   41:invokestatic    #51  <Method boolean AdUtil.a(Intent, Context)>
        //   20   44:ifeq            54
        //   21   47:aload           11
        //   22   49:aload           7
        //   23   51:invokevirtual   #57  <Method void Activity.startActivity(Intent)>
        //   24   54:return          
        // catch ActivityNotFoundException ActivityNotFoundException
        //   25   55:astore          9
        //   26   57:new             #59  <Class StringBuilder>
        //   27   60:dup             
        //   28   61:invokespecial   #60  <Method void StringBuilder()>
        //   29   64:ldc1            #62  <String "Couldn't find an Activity to view url/mimetype: ">
        //   30   66:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   31   69:aload_1         
        //   32   70:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   33   73:ldc1            #68  <String " / ">
        //   34   75:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   35   78:aload           4
        //   36   80:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   37   83:invokevirtual   #72  <Method String StringBuilder.toString()>
        //   38   86:invokestatic    #76  <Method void b.a(String)>
        //   39   89:return          
        // catch Throwable Throwable
        //   40   90:astore          8
        //   41   92:new             #59  <Class StringBuilder>
        //   42   95:dup             
        //   43   96:invokespecial   #60  <Method void StringBuilder()>
        //   44   99:ldc1            #78  <String "Unknown error trying to start activity to view URL: ">
        //   45  101:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   46  104:aload_1         
        //   47  105:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
        //   48  108:invokevirtual   #72  <Method String StringBuilder.toString()>
        //   49  111:aload           8
        //   50  113:invokestatic    #82  <Method void b.b(String, Throwable)>
        //   51  116:return          
        }

        final AdWebView a;
    }


    // Unreferenced inner class com/google/ads/internal/AdWebView$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnTouchListener
    {

        _cls2(AdWebView adwebview)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AdWebView a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    2    4:iconst_2        
        //    3    5:icmpne          10
        //    4    8:iconst_1        
        //    5    9:ireturn         
        //    6   10:iconst_0        
        //    7   11:ireturn         
        }

        final AdWebView a;
    }

}
