// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.webkit.*;
import android.widget.*;
import com.google.ads.internal.*;
import com.google.ads.m;
import com.google.ads.n;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

// Referenced classes of package com.google.ads.util:
//            b, AdUtil

public class g
{
    public static class a extends WebChromeClient
    {

        public a(n n1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void WebChromeClient()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #13  <Field n a>
        //    5    9:return          
        }

        private static void a(android.app.AlertDialog.Builder builder, Context context, String s, String s1, JsPromptResult jspromptresult)
        {
        //    0    0:new             #16  <Class LinearLayout>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #19  <Method void LinearLayout(Context)>
        //    4    8:astore          5
        //    5   10:aload           5
        //    6   12:iconst_1        
        //    7   13:invokevirtual   #23  <Method void LinearLayout.setOrientation(int)>
        //    8   16:new             #25  <Class TextView>
        //    9   19:dup             
        //   10   20:aload_1         
        //   11   21:invokespecial   #26  <Method void TextView(Context)>
        //   12   24:astore          6
        //   13   26:aload           6
        //   14   28:aload_2         
        //   15   29:invokevirtual   #30  <Method void TextView.setText(CharSequence)>
        //   16   32:new             #32  <Class EditText>
        //   17   35:dup             
        //   18   36:aload_1         
        //   19   37:invokespecial   #33  <Method void EditText(Context)>
        //   20   40:astore          7
        //   21   42:aload           7
        //   22   44:aload_3         
        //   23   45:invokevirtual   #34  <Method void EditText.setText(CharSequence)>
        //   24   48:aload           5
        //   25   50:aload           6
        //   26   52:invokevirtual   #38  <Method void LinearLayout.addView(View)>
        //   27   55:aload           5
        //   28   57:aload           7
        //   29   59:invokevirtual   #38  <Method void LinearLayout.addView(View)>
        //   30   62:aload_0         
        //   31   63:aload           5
        //   32   65:invokevirtual   #44  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
        //   33   68:ldc1            #45  <Int 0x104000a>
        //   34   70:new             #47  <Class g$a$6>
        //   35   73:dup             
        //   36   74:aload           4
        //   37   76:aload           7
        //   38   78:invokespecial   #50  <Method void g$a$6(JsPromptResult, EditText)>
        //   39   81:invokevirtual   #54  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
        //   40   84:ldc1            #55  <Int 0x1040000>
        //   41   86:new             #57  <Class g$a$5>
        //   42   89:dup             
        //   43   90:aload           4
        //   44   92:invokespecial   #60  <Method void g$a$5(JsPromptResult)>
        //   45   95:invokevirtual   #63  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
        //   46   98:new             #65  <Class g$a$4>
        //   47  101:dup             
        //   48  102:aload           4
        //   49  104:invokespecial   #66  <Method void g$a$4(JsPromptResult)>
        //   50  107:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
        //   51  110:invokevirtual   #74  <Method AlertDialog android.app.AlertDialog$Builder.create()>
        //   52  113:invokevirtual   #79  <Method void AlertDialog.show()>
        //   53  116:return          
        }

        private static void a(android.app.AlertDialog.Builder builder, String s, JsResult jsresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #84  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
        //    3    5:ldc1            #45  <Int 0x104000a>
        //    4    7:new             #86  <Class g$a$3>
        //    5   10:dup             
        //    6   11:aload_2         
        //    7   12:invokespecial   #89  <Method void g$a$3(JsResult)>
        //    8   15:invokevirtual   #54  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
        //    9   18:ldc1            #55  <Int 0x1040000>
        //   10   20:new             #91  <Class g$a$2>
        //   11   23:dup             
        //   12   24:aload_2         
        //   13   25:invokespecial   #92  <Method void g$a$2(JsResult)>
        //   14   28:invokevirtual   #63  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
        //   15   31:new             #94  <Class g$a$1>
        //   16   34:dup             
        //   17   35:aload_2         
        //   18   36:invokespecial   #95  <Method void g$a$1(JsResult)>
        //   19   39:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
        //   20   42:invokevirtual   #74  <Method AlertDialog android.app.AlertDialog$Builder.create()>
        //   21   45:invokevirtual   #79  <Method void AlertDialog.show()>
        //   22   48:return          
        }

        private static boolean a(WebView webview, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:instanceof      #98  <Class AdWebView>
        //    2    4:ifeq            68
        //    3    7:aload_0         
        //    4    8:checkcast       #98  <Class AdWebView>
        //    5   11:invokevirtual   #102 <Method com.google.ads.AdActivity AdWebView.i()>
        //    6   14:astore          7
        //    7   16:aload           7
        //    8   18:ifnull          68
        //    9   21:new             #40  <Class android.app.AlertDialog$Builder>
        //   10   24:dup             
        //   11   25:aload           7
        //   12   27:invokespecial   #103 <Method void android.app.AlertDialog$Builder(Context)>
        //   13   30:astore          8
        //   14   32:aload           8
        //   15   34:aload_1         
        //   16   35:invokevirtual   #106 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
        //   17   38:pop             
        //   18   39:iload           6
        //   19   41:ifeq            57
        //   20   44:aload           8
        //   21   46:aload           7
        //   22   48:aload_2         
        //   23   49:aload_3         
        //   24   50:aload           5
        //   25   52:invokestatic    #108 <Method void a(android.app.AlertDialog$Builder, Context, String, String, JsPromptResult)>
        //   26   55:iconst_1        
        //   27   56:ireturn         
        //   28   57:aload           8
        //   29   59:aload_2         
        //   30   60:aload           4
        //   31   62:invokestatic    #110 <Method void a(android.app.AlertDialog$Builder, String, JsResult)>
        //   32   65:goto            55
        //   33   68:iconst_0        
        //   34   69:ireturn         
        }

        public void onCloseWindow(WebView webview)
        {
        //    0    0:aload_1         
        //    1    1:instanceof      #98  <Class AdWebView>
        //    2    4:ifeq            14
        //    3    7:aload_1         
        //    4    8:checkcast       #98  <Class AdWebView>
        //    5   11:invokevirtual   #115 <Method void AdWebView.f()>
        //    6   14:return          
        }

        public boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
        //    0    0:new             #119 <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #120 <Method void StringBuilder()>
        //    3    7:ldc1            #122 <String "JS: ">
        //    4    9:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_1         
        //    6   13:invokevirtual   #132 <Method String ConsoleMessage.message()>
        //    7   16:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //    8   19:ldc1            #134 <String " (">
        //    9   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //   10   24:aload_1         
        //   11   25:invokevirtual   #137 <Method String ConsoleMessage.sourceId()>
        //   12   28:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //   13   31:ldc1            #139 <String ":">
        //   14   33:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //   15   36:aload_1         
        //   16   37:invokevirtual   #143 <Method int ConsoleMessage.lineNumber()>
        //   17   40:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
        //   18   43:ldc1            #148 <String ")">
        //   19   45:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
        //   20   48:invokevirtual   #151 <Method String StringBuilder.toString()>
        //   21   51:astore_2        
        //   22   52:getstatic       #156 <Field int[] g$1.a>
        //   23   55:aload_1         
        //   24   56:invokevirtual   #160 <Method android.webkit.ConsoleMessage$MessageLevel ConsoleMessage.messageLevel()>
        //   25   59:invokevirtual   #165 <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //   26   62:iaload          
        //   27   63:tableswitch     1 5: default 96
        //                       1 102
        //                       2 109
        //                       3 116
        //                       4 116
        //                       5 123
        //   28   96:aload_0         
        //   29   97:aload_1         
        //   30   98:invokespecial   #167 <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
        //   31  101:ireturn         
        //   32  102:aload_2         
        //   33  103:invokestatic    #173 <Method void b.b(String)>
        //   34  106:goto            96
        //   35  109:aload_2         
        //   36  110:invokestatic    #176 <Method void b.e(String)>
        //   37  113:goto            96
        //   38  116:aload_2         
        //   39  117:invokestatic    #179 <Method void com.google.ads.util.b.c(String)>
        //   40  120:goto            96
        //   41  123:aload_2         
        //   42  124:invokestatic    #181 <Method void b.a(String)>
        //   43  127:goto            96
        }

        public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field n a>
        //    2    4:getfield        #189 <Field i$b n.d>
        //    3    7:invokevirtual   #194 <Method Object i$b.a()>
        //    4   10:checkcast       #196 <Class m>
        //    5   13:getfield        #198 <Field i$b m.b>
        //    6   16:invokevirtual   #194 <Method Object i$b.a()>
        //    7   19:checkcast       #200 <Class com.google.ads.m$a>
        //    8   22:astore          10
        //    9   24:aload           10
        //   10   26:getfield        #204 <Field i$c com.google.ads.m$a.l>
        //   11   29:invokevirtual   #207 <Method Object i$c.a()>
        //   12   32:checkcast       #209 <Class Long>
        //   13   35:invokevirtual   #213 <Method long Long.longValue()>
        //   14   38:lload           7
        //   15   40:lsub            
        //   16   41:lstore          11
        //   17   43:lload           11
        //   18   45:lconst_0        
        //   19   46:lcmp            
        //   20   47:ifgt            59
        //   21   50:aload           9
        //   22   52:lload_3         
        //   23   53:invokeinterface #219 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
        //   24   58:return          
        //   25   59:lload_3         
        //   26   60:lconst_0        
        //   27   61:lcmp            
        //   28   62:ifne            109
        //   29   65:lload           5
        //   30   67:lload           11
        //   31   69:lcmp            
        //   32   70:ifgt            103
        //   33   73:lload           5
        //   34   75:aload           10
        //   35   77:getfield        #222 <Field i$c com.google.ads.m$a.m>
        //   36   80:invokevirtual   #207 <Method Object i$c.a()>
        //   37   83:checkcast       #209 <Class Long>
        //   38   86:invokevirtual   #213 <Method long Long.longValue()>
        //   39   89:lcmp            
        //   40   90:ifgt            103
        //   41   93:aload           9
        //   42   95:lload           5
        //   43   97:invokeinterface #219 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
        //   44  102:return          
        //   45  103:lconst_0        
        //   46  104:lstore          5
        //   47  106:goto            93
        //   48  109:lload           5
        //   49  111:lconst_0        
        //   50  112:lcmp            
        //   51  113:ifne            159
        //   52  116:lload_3         
        //   53  117:aload           10
        //   54  119:getfield        #225 <Field i$c com.google.ads.m$a.n>
        //   55  122:invokevirtual   #207 <Method Object i$c.a()>
        //   56  125:checkcast       #209 <Class Long>
        //   57  128:invokevirtual   #213 <Method long Long.longValue()>
        //   58  131:lload           11
        //   59  133:invokestatic    #231 <Method long Math.min(long, long)>
        //   60  136:ladd            
        //   61  137:aload           10
        //   62  139:getfield        #222 <Field i$c com.google.ads.m$a.m>
        //   63  142:invokevirtual   #207 <Method Object i$c.a()>
        //   64  145:checkcast       #209 <Class Long>
        //   65  148:invokevirtual   #213 <Method long Long.longValue()>
        //   66  151:invokestatic    #231 <Method long Math.min(long, long)>
        //   67  154:lstore          5
        //   68  156:goto            93
        //   69  159:lload           5
        //   70  161:aload           10
        //   71  163:getfield        #222 <Field i$c com.google.ads.m$a.m>
        //   72  166:invokevirtual   #207 <Method Object i$c.a()>
        //   73  169:checkcast       #209 <Class Long>
        //   74  172:invokevirtual   #213 <Method long Long.longValue()>
        //   75  175:lload_3         
        //   76  176:lsub            
        //   77  177:lload           11
        //   78  179:invokestatic    #231 <Method long Math.min(long, long)>
        //   79  182:lcmp            
        //   80  183:ifgt            191
        //   81  186:lload_3         
        //   82  187:lload           5
        //   83  189:ladd            
        //   84  190:lstore_3        
        //   85  191:lload_3         
        //   86  192:lstore          5
        //   87  194:goto            93
        }

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aconst_null     
        //    4    4:aload           4
        //    5    6:aconst_null     
        //    6    7:iconst_0        
        //    7    8:invokestatic    #235 <Method boolean a(WebView, String, String, String, JsResult, JsPromptResult, boolean)>
        //    8   11:ireturn         
        }

        public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aconst_null     
        //    4    4:aload           4
        //    5    6:aconst_null     
        //    6    7:iconst_0        
        //    7    8:invokestatic    #235 <Method boolean a(WebView, String, String, String, JsResult, JsPromptResult, boolean)>
        //    8   11:ireturn         
        }

        public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aconst_null     
        //    4    4:aload           4
        //    5    6:aconst_null     
        //    6    7:iconst_0        
        //    7    8:invokestatic    #235 <Method boolean a(WebView, String, String, String, JsResult, JsPromptResult, boolean)>
        //    8   11:ireturn         
        }

        public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aload           4
        //    4    5:aconst_null     
        //    5    6:aload           5
        //    6    8:iconst_1        
        //    7    9:invokestatic    #235 <Method boolean a(WebView, String, String, String, JsResult, JsPromptResult, boolean)>
        //    8   12:ireturn         
        }

        public void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field n a>
        //    2    4:getfield        #189 <Field i$b n.d>
        //    3    7:invokevirtual   #194 <Method Object i$b.a()>
        //    4   10:checkcast       #196 <Class m>
        //    5   13:getfield        #198 <Field i$b m.b>
        //    6   16:invokevirtual   #194 <Method Object i$b.a()>
        //    7   19:checkcast       #200 <Class com.google.ads.m$a>
        //    8   22:astore          6
        //    9   24:aload           6
        //   10   26:getfield        #244 <Field i$c com.google.ads.m$a.k>
        //   11   29:invokevirtual   #207 <Method Object i$c.a()>
        //   12   32:checkcast       #209 <Class Long>
        //   13   35:invokevirtual   #213 <Method long Long.longValue()>
        //   14   38:lload_3         
        //   15   39:lsub            
        //   16   40:lstore          7
        //   17   42:lload_1         
        //   18   43:aload           6
        //   19   45:getfield        #247 <Field i$c com.google.ads.m$a.j>
        //   20   48:invokevirtual   #207 <Method Object i$c.a()>
        //   21   51:checkcast       #209 <Class Long>
        //   22   54:invokevirtual   #213 <Method long Long.longValue()>
        //   23   57:ladd            
        //   24   58:lstore          9
        //   25   60:lload           7
        //   26   62:lload           9
        //   27   64:lcmp            
        //   28   65:ifge            77
        //   29   68:aload           5
        //   30   70:lconst_0        
        //   31   71:invokeinterface #219 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
        //   32   76:return          
        //   33   77:aload           5
        //   34   79:lload           9
        //   35   81:invokeinterface #219 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
        //   36   86:return          
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
        //    0    0:aload_2         
        //    1    1:invokeinterface #254 <Method void android.webkit.WebChromeClient$CustomViewCallback.onCustomViewHidden()>
        //    2    6:return          
        }

        private final n a;
    }

    public static class b extends i
    {

        public b(d d1, Map map, boolean flag, boolean flag1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:iload_3         
        //    4    4:iload           4
        //    5    6:invokespecial   #8   <Method void i(d, Map, boolean, boolean)>
        //    6    9:return          
        }

        private static WebResourceResponse a(String s, Context context)
            throws IOException
        {
        //    0    0:new             #14  <Class URL>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokespecial   #17  <Method void URL(String)>
        //    4    8:invokevirtual   #21  <Method java.net.URLConnection URL.openConnection()>
        //    5   11:checkcast       #23  <Class HttpURLConnection>
        //    6   14:astore_2        
        // try 15 66 handler(s) 73
        //    7   15:aload_2         
        //    8   16:aload_1         
        //    9   17:invokevirtual   #29  <Method Context Context.getApplicationContext()>
        //   10   20:invokestatic    #34  <Method void AdUtil.a(HttpURLConnection, Context)>
        //   11   23:aload_2         
        //   12   24:invokevirtual   #38  <Method void HttpURLConnection.connect()>
        //   13   27:new             #40  <Class WebResourceResponse>
        //   14   30:dup             
        //   15   31:ldc1            #42  <String "application/javascript">
        //   16   33:ldc1            #44  <String "UTF-8">
        //   17   35:new             #46  <Class ByteArrayInputStream>
        //   18   38:dup             
        //   19   39:new             #48  <Class InputStreamReader>
        //   20   42:dup             
        //   21   43:aload_2         
        //   22   44:invokevirtual   #52  <Method java.io.InputStream HttpURLConnection.getInputStream()>
        //   23   47:invokespecial   #55  <Method void InputStreamReader(java.io.InputStream)>
        //   24   50:invokestatic    #58  <Method String AdUtil.a(Readable)>
        //   25   53:ldc1            #44  <String "UTF-8">
        //   26   55:invokevirtual   #64  <Method byte[] String.getBytes(String)>
        //   27   58:invokespecial   #67  <Method void ByteArrayInputStream(byte[])>
        //   28   61:invokespecial   #70  <Method void WebResourceResponse(String, String, java.io.InputStream)>
        //   29   64:astore          4
        //   30   66:aload_2         
        //   31   67:invokevirtual   #73  <Method void HttpURLConnection.disconnect()>
        //   32   70:aload           4
        //   33   72:areturn         
        // finally
        //   34   73:astore_3        
        //   35   74:aload_2         
        //   36   75:invokevirtual   #73  <Method void HttpURLConnection.disconnect()>
        //   37   78:aload_3         
        //   38   79:athrow          
        }

        public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
        {
        // try 0 28 handler(s) 148 270
        //    0    0:ldc1            #79  <String "mraid.js">
        //    1    2:new             #81  <Class File>
        //    2    5:dup             
        //    3    6:aload_2         
        //    4    7:invokespecial   #82  <Method void File(String)>
        //    5   10:invokevirtual   #86  <Method String File.getName()>
        //    6   13:invokevirtual   #90  <Method boolean String.equalsIgnoreCase(String)>
        //    7   16:ifeq            157
        //    8   19:aload_0         
        //    9   20:getfield        #93  <Field d a>
        //   10   23:invokevirtual   #99  <Method c d.k()>
        //   11   26:astore          5
        //   12   28:aload           5
        //   13   30:ifnull          137
        // try 33 39 handler(s) 148 270
        //   14   33:aload           5
        //   15   35:iconst_1        
        //   16   36:invokevirtual   #105 <Method void c.c(boolean)>
        // try 39 137 handler(s) 148 270
        //   17   39:aload_0         
        //   18   40:getfield        #93  <Field d a>
        //   19   43:invokevirtual   #109 <Method n d.i()>
        //   20   46:getfield        #115 <Field i$b n.d>
        //   21   49:invokevirtual   #120 <Method Object i$b.a()>
        //   22   52:checkcast       #122 <Class m>
        //   23   55:getfield        #125 <Field i$b m.b>
        //   24   58:invokevirtual   #120 <Method Object i$b.a()>
        //   25   61:checkcast       #127 <Class com.google.ads.m$a>
        //   26   64:astore          6
        //   27   66:aload_0         
        //   28   67:getfield        #93  <Field d a>
        //   29   70:invokevirtual   #109 <Method n d.i()>
        //   30   73:invokevirtual   #130 <Method boolean n.b()>
        //   31   76:ifne            215
        //   32   79:aload_0         
        //   33   80:getfield        #133 <Field boolean b>
        //   34   83:ifeq            164
        //   35   86:aload           6
        //   36   88:getfield        #137 <Field i$c com.google.ads.m$a.f>
        //   37   91:invokevirtual   #140 <Method Object i$c.a()>
        //   38   94:checkcast       #60  <Class String>
        //   39   97:astore          10
        //   40   99:new             #142 <Class StringBuilder>
        //   41  102:dup             
        //   42  103:invokespecial   #144 <Method void StringBuilder()>
        //   43  106:ldc1            #146 <String "shouldInterceptRequest(">
        //   44  108:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   45  111:aload           10
        //   46  113:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   47  116:ldc1            #152 <String ")">
        //   48  118:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   49  121:invokevirtual   #155 <Method String StringBuilder.toString()>
        //   50  124:invokestatic    #159 <Method void b.a(String)>
        //   51  127:aload           10
        //   52  129:aload_1         
        //   53  130:invokevirtual   #164 <Method Context WebView.getContext()>
        //   54  133:invokestatic    #166 <Method WebResourceResponse a(String, Context)>
        //   55  136:areturn         
        // try 137 145 handler(s) 148 270
        //   56  137:aload_0         
        //   57  138:getfield        #93  <Field d a>
        //   58  141:iconst_1        
        //   59  142:invokevirtual   #168 <Method void d.a(boolean)>
        //   60  145:goto            39
        // catch IOException IOException IOException IOException IOException IOException
        //   61  148:astore          4
        //   62  150:ldc1            #170 <String "IOException fetching MRAID JS.">
        //   63  152:aload           4
        //   64  154:invokestatic    #173 <Method void com.google.ads.util.b.d(String, Throwable)>
        //   65  157:aload_0         
        //   66  158:aload_1         
        //   67  159:aload_2         
        //   68  160:invokespecial   #175 <Method WebResourceResponse i.shouldInterceptRequest(WebView, String)>
        //   69  163:areturn         
        // try 164 215 handler(s) 148 270
        //   70  164:aload           6
        //   71  166:getfield        #178 <Field i$c com.google.ads.m$a.e>
        //   72  169:invokevirtual   #140 <Method Object i$c.a()>
        //   73  172:checkcast       #60  <Class String>
        //   74  175:astore          9
        //   75  177:new             #142 <Class StringBuilder>
        //   76  180:dup             
        //   77  181:invokespecial   #144 <Method void StringBuilder()>
        //   78  184:ldc1            #146 <String "shouldInterceptRequest(">
        //   79  186:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   80  189:aload           9
        //   81  191:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   82  194:ldc1            #152 <String ")">
        //   83  196:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //   84  199:invokevirtual   #155 <Method String StringBuilder.toString()>
        //   85  202:invokestatic    #159 <Method void b.a(String)>
        //   86  205:aload           9
        //   87  207:aload_1         
        //   88  208:invokevirtual   #164 <Method Context WebView.getContext()>
        //   89  211:invokestatic    #166 <Method WebResourceResponse a(String, Context)>
        //   90  214:areturn         
        // try 215 267 handler(s) 148 270
        //   91  215:aload           6
        //   92  217:getfield        #181 <Field i$c com.google.ads.m$a.g>
        //   93  220:invokevirtual   #140 <Method Object i$c.a()>
        //   94  223:checkcast       #60  <Class String>
        //   95  226:astore          7
        //   96  228:new             #142 <Class StringBuilder>
        //   97  231:dup             
        //   98  232:invokespecial   #144 <Method void StringBuilder()>
        //   99  235:ldc1            #146 <String "shouldInterceptRequest(">
        //  100  237:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //  101  240:aload           7
        //  102  242:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //  103  245:ldc1            #152 <String ")">
        //  104  247:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
        //  105  250:invokevirtual   #155 <Method String StringBuilder.toString()>
        //  106  253:invokestatic    #159 <Method void b.a(String)>
        //  107  256:aload           7
        //  108  258:aload_1         
        //  109  259:invokevirtual   #164 <Method Context WebView.getContext()>
        //  110  262:invokestatic    #166 <Method WebResourceResponse a(String, Context)>
        //  111  265:astore          8
        //  112  267:aload           8
        //  113  269:areturn         
        // catch Throwable Throwable Throwable Throwable Throwable Throwable
        //  114  270:astore_3        
        //  115  271:ldc1            #183 <String "An unknown error occurred fetching MRAID JS.">
        //  116  273:aload_3         
        //  117  274:invokestatic    #173 <Method void com.google.ads.util.b.d(String, Throwable)>
        //  118  277:goto            157
        }
    }


    public static void a(View view)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:aconst_null     
    //    3    3:invokevirtual   #15  <Method void View.setLayerType(int, android.graphics.Paint)>
    //    4    6:return          
    }

    public static void a(Window window)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #17  <Int 0x1000000>
    //    2    3:ldc1            #17  <Int 0x1000000>
    //    3    5:invokevirtual   #23  <Method void Window.setFlags(int, int)>
    //    4    8:return          
    }

    public static void a(WebSettings websettings, n n1)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #30  <Field i$b n.f>
    //    2    4:invokevirtual   #35  <Method Object i$b.a()>
    //    3    7:checkcast       #37  <Class Context>
    //    4   10:astore_2        
    //    5   11:aload_1         
    //    6   12:getfield        #40  <Field i$b n.d>
    //    7   15:invokevirtual   #35  <Method Object i$b.a()>
    //    8   18:checkcast       #42  <Class m>
    //    9   21:getfield        #45  <Field i$b m.b>
    //   10   24:invokevirtual   #35  <Method Object i$b.a()>
    //   11   27:checkcast       #47  <Class com.google.ads.m$a>
    //   12   30:astore_3        
    //   13   31:aload_0         
    //   14   32:iconst_1        
    //   15   33:invokevirtual   #53  <Method void WebSettings.setAppCacheEnabled(boolean)>
    //   16   36:aload_0         
    //   17   37:aload_3         
    //   18   38:getfield        #57  <Field i$c com.google.ads.m$a.i>
    //   19   41:invokevirtual   #60  <Method Object i$c.a()>
    //   20   44:checkcast       #62  <Class Long>
    //   21   47:invokevirtual   #66  <Method long Long.longValue()>
    //   22   50:invokevirtual   #70  <Method void WebSettings.setAppCacheMaxSize(long)>
    //   23   53:aload_0         
    //   24   54:new             #72  <Class File>
    //   25   57:dup             
    //   26   58:aload_2         
    //   27   59:invokevirtual   #76  <Method File Context.getCacheDir()>
    //   28   62:ldc1            #78  <String "admob">
    //   29   64:invokespecial   #82  <Method void File(File, String)>
    //   30   67:invokevirtual   #86  <Method String File.getAbsolutePath()>
    //   31   70:invokevirtual   #90  <Method void WebSettings.setAppCachePath(String)>
    //   32   73:aload_0         
    //   33   74:iconst_1        
    //   34   75:invokevirtual   #93  <Method void WebSettings.setDatabaseEnabled(boolean)>
    //   35   78:aload_0         
    //   36   79:aload_2         
    //   37   80:ldc1            #78  <String "admob">
    //   38   82:invokevirtual   #97  <Method File Context.getDatabasePath(String)>
    //   39   85:invokevirtual   #86  <Method String File.getAbsolutePath()>
    //   40   88:invokevirtual   #100 <Method void WebSettings.setDatabasePath(String)>
    //   41   91:aload_0         
    //   42   92:iconst_1        
    //   43   93:invokevirtual   #103 <Method void WebSettings.setDomStorageEnabled(boolean)>
    //   44   96:aload_0         
    //   45   97:iconst_1        
    //   46   98:invokevirtual   #106 <Method void WebSettings.setSupportZoom(boolean)>
    //   47  101:aload_0         
    //   48  102:iconst_1        
    //   49  103:invokevirtual   #109 <Method void WebSettings.setBuiltInZoomControls(boolean)>
    //   50  106:aload_0         
    //   51  107:iconst_0        
    //   52  108:invokevirtual   #112 <Method void WebSettings.setDisplayZoomControls(boolean)>
    //   53  111:return          
    }

    public static void b(View view)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aconst_null     
    //    3    3:invokevirtual   #15  <Method void View.setLayerType(int, android.graphics.Paint)>
    //    4    6:return          
    }

    // Unreferenced inner class com/google/ads/util/g$1

/* anonymous class */
    static class _cls1
    {

        static 
        {
        //    0    0:invokestatic    #18  <Method android.webkit.ConsoleMessage$MessageLevel[] android.webkit.ConsoleMessage$MessageLevel.values()>
        //    1    3:arraylength     
        //    2    4:newarray        int[]
        //    3    6:putstatic       #20  <Field int[] a>
        // try 9 20 handler(s) 80
        //    4    9:getstatic       #20  <Field int[] a>
        //    5   12:getstatic       #24  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.ERROR>
        //    6   15:invokevirtual   #28  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //    7   18:iconst_1        
        //    8   19:iastore         
        // try 20 31 handler(s) 76
        //    9   20:getstatic       #20  <Field int[] a>
        //   10   23:getstatic       #31  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.WARNING>
        //   11   26:invokevirtual   #28  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //   12   29:iconst_2        
        //   13   30:iastore         
        // try 31 42 handler(s) 72
        //   14   31:getstatic       #20  <Field int[] a>
        //   15   34:getstatic       #34  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.LOG>
        //   16   37:invokevirtual   #28  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //   17   40:iconst_3        
        //   18   41:iastore         
        // try 42 53 handler(s) 68
        //   19   42:getstatic       #20  <Field int[] a>
        //   20   45:getstatic       #37  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.TIP>
        //   21   48:invokevirtual   #28  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //   22   51:iconst_4        
        //   23   52:iastore         
        // try 53 64 handler(s) 65
        //   24   53:getstatic       #20  <Field int[] a>
        //   25   56:getstatic       #40  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.DEBUG>
        //   26   59:invokevirtual   #28  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
        //   27   62:iconst_5        
        //   28   63:iastore         
        //   29   64:return          
        // catch NoSuchFieldError
        //   30   65:astore          4
        //   31   67:return          
        // catch NoSuchFieldError
        //   32   68:astore_3        
        //   33   69:goto            53
        // catch NoSuchFieldError
        //   34   72:astore_2        
        //   35   73:goto            42
        // catch NoSuchFieldError
        //   36   76:astore_1        
        //   37   77:goto            31
        // catch NoSuchFieldError
        //   38   80:astore_0        
        //   39   81:goto            20
        }

        static final int a[];
    }


    // Unreferenced inner class com/google/ads/util/g$a$1

/* anonymous class */
    static final class a._cls1
        implements android.content.DialogInterface.OnCancelListener
    {

        a._cls1(JsResult jsresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field JsResult a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onCancel(DialogInterface dialoginterface)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field JsResult a>
        //    2    4:invokevirtual   #26  <Method void JsResult.cancel()>
        //    3    7:return          
        }

        final JsResult a;
    }


    // Unreferenced inner class com/google/ads/util/g$a$2

/* anonymous class */
    static final class a._cls2
        implements android.content.DialogInterface.OnClickListener
    {

        a._cls2(JsResult jsresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field JsResult a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field JsResult a>
        //    2    4:invokevirtual   #26  <Method void JsResult.cancel()>
        //    3    7:return          
        }

        final JsResult a;
    }


    // Unreferenced inner class com/google/ads/util/g$a$3

/* anonymous class */
    static final class a._cls3
        implements android.content.DialogInterface.OnClickListener
    {

        a._cls3(JsResult jsresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field JsResult a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field JsResult a>
        //    2    4:invokevirtual   #26  <Method void JsResult.confirm()>
        //    3    7:return          
        }

        final JsResult a;
    }


    // Unreferenced inner class com/google/ads/util/g$a$4

/* anonymous class */
    static final class a._cls4
        implements android.content.DialogInterface.OnCancelListener
    {

        a._cls4(JsPromptResult jspromptresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field JsPromptResult a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onCancel(DialogInterface dialoginterface)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field JsPromptResult a>
        //    2    4:invokevirtual   #26  <Method void JsPromptResult.cancel()>
        //    3    7:return          
        }

        final JsPromptResult a;
    }


    // Unreferenced inner class com/google/ads/util/g$a$5

/* anonymous class */
    static final class a._cls5
        implements android.content.DialogInterface.OnClickListener
    {

        a._cls5(JsPromptResult jspromptresult)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field JsPromptResult a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field JsPromptResult a>
        //    2    4:invokevirtual   #26  <Method void JsPromptResult.cancel()>
        //    3    7:return          
        }

        final JsPromptResult a;
    }


    // Unreferenced inner class com/google/ads/util/g$a$6

/* anonymous class */
    static final class a._cls6
        implements android.content.DialogInterface.OnClickListener
    {

        a._cls6(JsPromptResult jspromptresult, EditText edittext)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field JsPromptResult a>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field EditText b>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field JsPromptResult a>
        //    2    4:aload_0         
        //    3    5:getfield        #20  <Field EditText b>
        //    4    8:invokevirtual   #31  <Method android.text.Editable EditText.getText()>
        //    5   11:invokevirtual   #35  <Method String Object.toString()>
        //    6   14:invokevirtual   #41  <Method void JsPromptResult.confirm(String)>
        //    7   17:return          
        }

        final JsPromptResult a;
        final EditText b;
    }

}
