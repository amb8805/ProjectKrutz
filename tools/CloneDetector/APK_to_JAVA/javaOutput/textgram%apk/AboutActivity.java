// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, AdUtilities

public class AboutActivity extends el7rActivity
{

    public AboutActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #16  <String "AboutActivity">
    //    4    7:putfield        #18  <Field String TAG>
    //    5   10:aload_0         
    //    6   11:ldc1            #20  <String "about.html">
    //    7   13:putfield        #22  <Field String filename>
    //    8   16:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void el7rActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #26  <Int 0x7f04000d>
    //    4    7:ldc1            #27  <Int 0x7f040007>
    //    5    9:invokevirtual   #31  <Method void overridePendingTransition(int, int)>
    //    6   12:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #35  <Method void el7rActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #36  <Int 0x7f04000c>
    //    5    8:ldc1            #37  <Int 0x7f040006>
    //    6   10:invokevirtual   #31  <Method void overridePendingTransition(int, int)>
    //    7   13:aload_0         
    //    8   14:ldc1            #38  <Int 0x7f03001b>
    //    9   16:invokevirtual   #42  <Method void setContentView(int)>
    //   10   19:aload_0         
    //   11   20:invokevirtual   #46  <Method ActionBar getSupportActionBar()>
    //   12   23:iconst_1        
    //   13   24:invokevirtual   #52  <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   14   27:aload_0         
    //   15   28:aload_0         
    //   16   29:ldc1            #53  <Int 0x7f060049>
    //   17   31:invokevirtual   #57  <Method android.view.View findViewById(int)>
    //   18   34:invokestatic    #63  <Method void AdUtilities.installAd(android.app.Activity, android.view.View)>
    //   19   37:aload_0         
    //   20   38:getfield        #67  <Field GoogleAnalyticsTracker tracker>
    //   21   41:ldc1            #69  <String "/AboutActivity">
    //   22   43:invokevirtual   #75  <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   23   46:aload_0         
    //   24   47:ldc1            #76  <Int 0x7f060048>
    //   25   49:invokevirtual   #57  <Method android.view.View findViewById(int)>
    //   26   52:checkcast       #78  <Class WebView>
    //   27   55:astore_2        
    //   28   56:aload_2         
    //   29   57:iconst_0        
    //   30   58:invokevirtual   #81  <Method void WebView.setBackgroundColor(int)>
    //   31   61:aload_2         
    //   32   62:new             #83  <Class AboutActivity$1>
    //   33   65:dup             
    //   34   66:aload_0         
    //   35   67:aload_2         
    //   36   68:invokespecial   #86  <Method void AboutActivity$1(AboutActivity, WebView)>
    //   37   71:invokevirtual   #90  <Method void WebView.setWebViewClient(WebViewClient)>
    //   38   74:aload_2         
    //   39   75:new             #92  <Class StringBuilder>
    //   40   78:dup             
    //   41   79:ldc1            #94  <String "file:///android_asset/data/about/">
    //   42   81:invokespecial   #96  <Method void StringBuilder(String)>
    //   43   84:aload_0         
    //   44   85:getfield        #22  <Field String filename>
    //   45   88:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
    //   46   91:invokevirtual   #104 <Method String StringBuilder.toString()>
    //   47   94:invokevirtual   #107 <Method void WebView.loadUrl(String)>
    //   48   97:return          
    }

    String TAG;
    String filename;

    // Unreferenced inner class codeadore/textgram/AboutActivity$1

/* anonymous class */
    class _cls1 extends WebViewClient
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field AboutActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #19  <Field WebView val$webView>
        //    6   10:aload_0         
        //    7   11:invokespecial   #22  <Method void WebViewClient()>
        //    8   14:return          
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
        //    0    0:aload_2         
        //    1    1:new             #28  <Class StringBuilder>
        //    2    4:dup             
        //    3    5:ldc1            #30  <String "file:///android_asset/data/about/">
        //    4    7:invokespecial   #33  <Method void StringBuilder(String)>
        //    5   10:aload_0         
        //    6   11:getfield        #17  <Field AboutActivity this$0>
        //    7   14:getfield        #37  <Field String AboutActivity.filename>
        //    8   17:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
        //    9   20:invokevirtual   #45  <Method String StringBuilder.toString()>
        //   10   23:invokevirtual   #51  <Method boolean String.contains(CharSequence)>
        //   11   26:ifne            67
        //   12   29:aload_0         
        //   13   30:getfield        #19  <Field WebView val$webView>
        //   14   33:invokevirtual   #56  <Method void WebView.stopLoading()>
        //   15   36:aload_0         
        //   16   37:getfield        #19  <Field WebView val$webView>
        //   17   40:invokevirtual   #59  <Method void WebView.goBack()>
        // try 43 67 handler(s) 75
        //   18   43:new             #61  <Class Intent>
        //   19   46:dup             
        //   20   47:ldc1            #63  <String "android.intent.action.VIEW">
        //   21   49:aload_2         
        //   22   50:invokestatic    #69  <Method Uri Uri.parse(String)>
        //   23   53:invokespecial   #72  <Method void Intent(String, Uri)>
        //   24   56:astore          4
        //   25   58:aload_0         
        //   26   59:getfield        #17  <Field AboutActivity this$0>
        //   27   62:aload           4
        //   28   64:invokevirtual   #76  <Method void AboutActivity.startActivity(Intent)>
        //   29   67:aload_0         
        //   30   68:aload_1         
        //   31   69:aload_2         
        //   32   70:aload_3         
        //   33   71:invokespecial   #78  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
        //   34   74:return          
        // catch Exception
        //   35   75:astore          5
        //   36   77:aload_0         
        //   37   78:getfield        #17  <Field AboutActivity this$0>
        //   38   81:getfield        #81  <Field String AboutActivity.TAG>
        //   39   84:ldc1            #83  <String "error in onPageStarted()">
        //   40   86:invokestatic    #89  <Method int Log.e(String, String)>
        //   41   89:pop             
        //   42   90:aload           5
        //   43   92:invokevirtual   #92  <Method void Exception.printStackTrace()>
        //   44   95:goto            67
        }

        final AboutActivity this$0;
        private final WebView val$webView;
    }

}
