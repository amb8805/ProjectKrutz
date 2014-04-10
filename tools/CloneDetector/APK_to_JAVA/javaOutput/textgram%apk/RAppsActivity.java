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
import android.view.MenuItem;
import android.webkit.*;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, AdUtilities, Utilities, Settings

public class RAppsActivity extends el7rActivity
{

    public RAppsActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #14  <String "RAppsActivity">
    //    4    7:putfield        #16  <Field String TAG>
    //    5   10:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void el7rActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #20  <Int 0x7f04000d>
    //    4    7:ldc1            #21  <Int 0x7f040007>
    //    5    9:invokevirtual   #25  <Method void overridePendingTransition(int, int)>
    //    6   12:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #29  <Method void el7rActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #30  <Int 0x7f04000c>
    //    5    8:ldc1            #31  <Int 0x7f040006>
    //    6   10:invokevirtual   #25  <Method void overridePendingTransition(int, int)>
    //    7   13:aload_0         
    //    8   14:ldc1            #32  <Int 0x7f03001f>
    //    9   16:invokevirtual   #36  <Method void setContentView(int)>
    //   10   19:aload_0         
    //   11   20:invokevirtual   #40  <Method ActionBar getSupportActionBar()>
    //   12   23:iconst_1        
    //   13   24:invokevirtual   #46  <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   14   27:aload_0         
    //   15   28:aload_0         
    //   16   29:ldc1            #47  <Int 0x7f060065>
    //   17   31:invokevirtual   #51  <Method android.view.View findViewById(int)>
    //   18   34:invokestatic    #57  <Method void AdUtilities.installAd(android.app.Activity, android.view.View)>
    //   19   37:aload_0         
    //   20   38:getfield        #61  <Field el7rActivity thisActivity>
    //   21   41:aload_0         
    //   22   42:ldc1            #62  <Int 0x7f060066>
    //   23   44:invokevirtual   #51  <Method android.view.View findViewById(int)>
    //   24   47:invokestatic    #65  <Method void AdUtilities.installFullScreenAd(android.app.Activity, android.view.View)>
    //   25   50:aload_0         
    //   26   51:getfield        #69  <Field GoogleAnalyticsTracker tracker>
    //   27   54:ldc1            #71  <String "/RAppsActivity">
    //   28   56:invokevirtual   #77  <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   29   59:aload_0         
    //   30   60:aload_0         
    //   31   61:ldc1            #78  <Int 0x7f060063>
    //   32   63:invokevirtual   #51  <Method android.view.View findViewById(int)>
    //   33   66:checkcast       #80  <Class WebView>
    //   34   69:putfield        #82  <Field WebView r_apps_wv>
    //   35   72:aload_0         
    //   36   73:getfield        #82  <Field WebView r_apps_wv>
    //   37   76:ldc1            #83  <Int 0x2000000>
    //   38   78:invokevirtual   #86  <Method void WebView.setScrollBarStyle(int)>
    //   39   81:aload_0         
    //   40   82:getfield        #82  <Field WebView r_apps_wv>
    //   41   85:iconst_0        
    //   42   86:invokevirtual   #89  <Method void WebView.setBackgroundColor(int)>
    //   43   89:aload_0         
    //   44   90:getfield        #82  <Field WebView r_apps_wv>
    //   45   93:invokevirtual   #93  <Method WebSettings WebView.getSettings()>
    //   46   96:iconst_1        
    //   47   97:invokevirtual   #98  <Method void WebSettings.setJavaScriptEnabled(boolean)>
    //   48  100:aload_0         
    //   49  101:getfield        #82  <Field WebView r_apps_wv>
    //   50  104:iconst_1        
    //   51  105:invokevirtual   #101 <Method void WebView.clearCache(boolean)>
    //   52  108:aload_0         
    //   53  109:getfield        #82  <Field WebView r_apps_wv>
    //   54  112:new             #103 <Class RAppsActivity$1>
    //   55  115:dup             
    //   56  116:aload_0         
    //   57  117:invokespecial   #106 <Method void RAppsActivity$1(RAppsActivity)>
    //   58  120:invokevirtual   #110 <Method void WebView.setWebViewClient(WebViewClient)>
    //   59  123:aload_0         
    //   60  124:invokestatic    #116 <Method boolean Utilities.isOnline(android.content.Context)>
    //   61  127:ifeq            163
    //   62  130:aload_0         
    //   63  131:getfield        #82  <Field WebView r_apps_wv>
    //   64  134:new             #118 <Class StringBuilder>
    //   65  137:dup             
    //   66  138:ldc1            #120 <String "http://www.the-ghost.com/extras/textgram/r_apps/?version=2.1.51&build=">
    //   67  140:invokespecial   #122 <Method void StringBuilder(String)>
    //   68  143:getstatic       #127 <Field String Settings.buildFor>
    //   69  146:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   70  149:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   71  152:invokevirtual   #138 <Method void WebView.loadUrl(String)>
    //   72  155:aload_0         
    //   73  156:getfield        #82  <Field WebView r_apps_wv>
    //   74  159:invokevirtual   #141 <Method void WebView.refreshDrawableState()>
    //   75  162:return          
    //   76  163:new             #118 <Class StringBuilder>
    //   77  166:dup             
    //   78  167:ldc1            #143 <String "<div style='text-align:center;margin-top:100px;color:red'>">
    //   79  169:invokespecial   #122 <Method void StringBuilder(String)>
    //   80  172:aload_0         
    //   81  173:ldc1            #144 <Int 0x7f0b003b>
    //   82  175:invokevirtual   #148 <Method String getString(int)>
    //   83  178:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   84  181:ldc1            #150 <String "</div>">
    //   85  183:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
    //   86  186:invokevirtual   #135 <Method String StringBuilder.toString()>
    //   87  189:astore_2        
    //   88  190:aload_0         
    //   89  191:getfield        #82  <Field WebView r_apps_wv>
    //   90  194:ldc1            #152 <String "">
    //   91  196:aload_2         
    //   92  197:ldc1            #154 <String "text/html">
    //   93  199:ldc1            #156 <String "utf-8">
    //   94  201:ldc1            #152 <String "">
    //   95  203:invokevirtual   #160 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
    //   96  206:return          
    }

    String TAG;
    WebView r_apps_wv;

    // Unreferenced inner class codeadore/textgram/RAppsActivity$1

/* anonymous class */
    class _cls1 extends WebViewClient
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field RAppsActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void WebViewClient()>
        //    5    9:return          
        }

        public void onPageFinished(WebView webview, String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #22  <Method void WebViewClient.onPageFinished(WebView, String)>
        //    4    6:getstatic       #26  <Field MenuItem RAppsActivity.progressItem>
        //    5    9:ifnull          22
        //    6   12:getstatic       #26  <Field MenuItem RAppsActivity.progressItem>
        //    7   15:iconst_0        
        //    8   16:invokeinterface #32  <Method MenuItem MenuItem.setVisible(boolean)>
        //    9   21:pop             
        //   10   22:return          
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aload_3         
        //    4    4:invokespecial   #38  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
        //    5    7:aload_2         
        //    6    8:ldc1            #40  <String "play.google.com">
        //    7   10:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
        //    8   13:ifeq            77
        // try 16 60 handler(s) 61
        //    9   16:aload_0         
        //   10   17:getfield        #15  <Field RAppsActivity this$0>
        //   11   20:getfield        #50  <Field WebView RAppsActivity.r_apps_wv>
        //   12   23:invokevirtual   #55  <Method void WebView.stopLoading()>
        //   13   26:aload_0         
        //   14   27:getfield        #15  <Field RAppsActivity this$0>
        //   15   30:getfield        #50  <Field WebView RAppsActivity.r_apps_wv>
        //   16   33:invokevirtual   #58  <Method void WebView.goBack()>
        //   17   36:new             #60  <Class Intent>
        //   18   39:dup             
        //   19   40:ldc1            #62  <String "android.intent.action.VIEW">
        //   20   42:aload_2         
        //   21   43:invokestatic    #68  <Method Uri Uri.parse(String)>
        //   22   46:invokespecial   #71  <Method void Intent(String, Uri)>
        //   23   49:astore          7
        //   24   51:aload_0         
        //   25   52:getfield        #15  <Field RAppsActivity this$0>
        //   26   55:aload           7
        //   27   57:invokevirtual   #75  <Method void RAppsActivity.startActivity(Intent)>
        //   28   60:return          
        // catch Exception
        //   29   61:astore          5
        //   30   63:aload_0         
        //   31   64:getfield        #15  <Field RAppsActivity this$0>
        //   32   67:getfield        #79  <Field String RAppsActivity.TAG>
        //   33   70:ldc1            #81  <String "error in onPageStarted()">
        //   34   72:invokestatic    #87  <Method int Log.e(String, String)>
        //   35   75:pop             
        //   36   76:return          
        //   37   77:getstatic       #26  <Field MenuItem RAppsActivity.progressItem>
        //   38   80:ifnull          60
        //   39   83:getstatic       #26  <Field MenuItem RAppsActivity.progressItem>
        //   40   86:iconst_1        
        //   41   87:invokeinterface #32  <Method MenuItem MenuItem.setVisible(boolean)>
        //   42   92:pop             
        //   43   93:return          
        }

        final RAppsActivity this$0;
    }

}
