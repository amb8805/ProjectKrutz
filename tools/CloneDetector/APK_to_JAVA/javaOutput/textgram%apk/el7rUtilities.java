// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.AlertDialog;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package codeadore.textgram:
//            StoreItemActivity

public class el7rUtilities
{

    public el7rUtilities()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static String geHTTPtContents(String s)
        throws IOException
    {
    //    0    0:ldc1            #14  <String "">
    //    1    2:astore_1        
    //    2    3:new             #16  <Class BufferedReader>
    //    3    6:dup             
    //    4    7:new             #18  <Class InputStreamReader>
    //    5   10:dup             
    //    6   11:new             #20  <Class URL>
    //    7   14:dup             
    //    8   15:aload_0         
    //    9   16:invokespecial   #23  <Method void URL(String)>
    //   10   19:invokevirtual   #27  <Method URLConnection URL.openConnection()>
    //   11   22:invokevirtual   #33  <Method java.io.InputStream URLConnection.getInputStream()>
    //   12   25:invokespecial   #36  <Method void InputStreamReader(java.io.InputStream)>
    //   13   28:invokespecial   #39  <Method void BufferedReader(java.io.Reader)>
    //   14   31:astore_2        
    //   15   32:aload_2         
    //   16   33:invokevirtual   #43  <Method String BufferedReader.readLine()>
    //   17   36:astore_3        
    //   18   37:aload_3         
    //   19   38:ifnonnull       43
    //   20   41:aload_1         
    //   21   42:areturn         
    //   22   43:new             #45  <Class StringBuilder>
    //   23   46:dup             
    //   24   47:aload_1         
    //   25   48:invokestatic    #51  <Method String String.valueOf(Object)>
    //   26   51:invokespecial   #52  <Method void StringBuilder(String)>
    //   27   54:aload_3         
    //   28   55:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
    //   29   58:invokevirtual   #59  <Method String StringBuilder.toString()>
    //   30   61:astore_1        
    //   31   62:goto            32
    }

    public static Bitmap getBitmapFromAsset(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #67  <Method AssetManager Context.getAssets()>
    //    2    4:astore_2        
    // try 5 15 handler(s) 18
    //    3    5:aload_2         
    //    4    6:aload_1         
    //    5    7:invokevirtual   #73  <Method java.io.InputStream AssetManager.open(String)>
    //    6   10:invokestatic    #79  <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
    //    7   13:astore          4
    //    8   15:aload           4
    //    9   17:areturn         
    // catch IOException
    //   10   18:astore_3        
    //   11   19:aconst_null     
    //   12   20:areturn         
    }

    public static boolean isAppInstalled(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #85  <Method PackageManager Context.getPackageManager()>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #91  <Method Intent PackageManager.getLaunchIntentForPackage(String)>
    //    4    8:ifnull          13
    //    5   11:iconst_1        
    //    6   12:ireturn         
    //    7   13:iconst_0        
    //    8   14:ireturn         
    }

    public static void messageBox(String s, String s1, Context context)
    {
    //    0    0:new             #95  <Class android.app.AlertDialog$Builder>
    //    1    3:dup             
    //    2    4:aload_2         
    //    3    5:invokespecial   #98  <Method void android.app.AlertDialog$Builder(Context)>
    //    4    8:invokevirtual   #102 <Method AlertDialog android.app.AlertDialog$Builder.create()>
    //    5   11:astore_3        
    //    6   12:aload_3         
    //    7   13:ldc1            #104 <String "OK">
    //    8   15:new             #106 <Class el7rUtilities$1>
    //    9   18:dup             
    //   10   19:invokespecial   #107 <Method void el7rUtilities$1()>
    //   11   22:invokevirtual   #113 <Method void AlertDialog.setButton(CharSequence, android.content.DialogInterface$OnClickListener)>
    //   12   25:aload_2         
    //   13   26:invokestatic    #119 <Method LayoutInflater LayoutInflater.from(Context)>
    //   14   29:ldc1            #120 <Int 0x7f030022>
    //   15   31:aconst_null     
    //   16   32:invokevirtual   #124 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   17   35:astore          4
    //   18   37:aload           4
    //   19   39:ldc1            #125 <Int 0x7f060071>
    //   20   41:invokevirtual   #131 <Method View View.findViewById(int)>
    //   21   44:checkcast       #133 <Class TextView>
    //   22   47:aload_0         
    //   23   48:invokevirtual   #137 <Method void TextView.setText(CharSequence)>
    //   24   51:aload_1         
    //   25   52:ifnull          86
    //   26   55:aload           4
    //   27   57:ldc1            #138 <Int 0x7f060070>
    //   28   59:invokevirtual   #131 <Method View View.findViewById(int)>
    //   29   62:checkcast       #140 <Class ImageView>
    //   30   65:astore          5
    //   31   67:aload           5
    //   32   69:iconst_0        
    //   33   70:invokevirtual   #144 <Method void ImageView.setVisibility(int)>
    //   34   73:aload_1         
    //   35   74:ldc1            #146 <String "done">
    //   36   76:if_acmpne       97
    //   37   79:aload           5
    //   38   81:ldc1            #147 <Int 0x7f020082>
    //   39   83:invokevirtual   #150 <Method void ImageView.setImageResource(int)>
    //   40   86:aload_3         
    //   41   87:aload           4
    //   42   89:invokevirtual   #154 <Method void AlertDialog.setView(View)>
    //   43   92:aload_3         
    //   44   93:invokevirtual   #157 <Method void AlertDialog.show()>
    //   45   96:return          
    //   46   97:aload_1         
    //   47   98:ldc1            #159 <String "fail">
    //   48  100:if_acmpne       86
    //   49  103:aload           5
    //   50  105:ldc1            #160 <Int 0x7f0200cd>
    //   51  107:invokevirtual   #150 <Method void ImageView.setImageResource(int)>
    //   52  110:goto            86
    }

    public static void viewHTMLMessage(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          100
    // try 4 100 handler(s) 101
    //    2    4:new             #95  <Class android.app.AlertDialog$Builder>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokespecial   #98  <Method void android.app.AlertDialog$Builder(Context)>
    //    6   12:astore_2        
    //    7   13:aload_2         
    //    8   14:aload_0         
    //    9   15:ldc1            #165 <Int 0x7f0b0047>
    //   10   17:invokevirtual   #169 <Method String Context.getString(int)>
    //   11   20:invokevirtual   #173 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
    //   12   23:pop             
    //   13   24:aload_2         
    //   14   25:ldc1            #174 <Int 0x7f02009b>
    //   15   27:invokevirtual   #178 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
    //   16   30:pop             
    //   17   31:new             #180 <Class WebView>
    //   18   34:dup             
    //   19   35:aload_0         
    //   20   36:invokespecial   #181 <Method void WebView(Context)>
    //   21   39:astore          6
    //   22   41:aload_2         
    //   23   42:aload           6
    //   24   44:invokevirtual   #184 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
    //   25   47:pop             
    //   26   48:aload           6
    //   27   50:aload_1         
    //   28   51:ldc1            #186 <String "text/html">
    //   29   53:ldc1            #188 <String "utf-8">
    //   30   55:invokevirtual   #192 <Method void WebView.loadData(String, String, String)>
    //   31   58:aload_2         
    //   32   59:aload_0         
    //   33   60:ldc1            #193 <Int 0x7f0b002a>
    //   34   62:invokevirtual   #169 <Method String Context.getString(int)>
    //   35   65:new             #195 <Class el7rUtilities$2>
    //   36   68:dup             
    //   37   69:invokespecial   #196 <Method void el7rUtilities$2()>
    //   38   72:invokevirtual   #200 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
    //   39   75:pop             
    //   40   76:aload           6
    //   41   78:new             #202 <Class el7rUtilities$3>
    //   42   81:dup             
    //   43   82:aload_0         
    //   44   83:invokespecial   #203 <Method void el7rUtilities$3(Context)>
    //   45   86:invokevirtual   #207 <Method void WebView.setWebViewClient(WebViewClient)>
    //   46   89:aload_2         
    //   47   90:iconst_0        
    //   48   91:invokevirtual   #211 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
    //   49   94:pop             
    //   50   95:aload_2         
    //   51   96:invokevirtual   #213 <Method AlertDialog android.app.AlertDialog$Builder.show()>
    //   52   99:pop             
    //   53  100:return          
    // catch Exception
    //   54  101:astore_3        
    //   55  102:aload_3         
    //   56  103:invokevirtual   #216 <Method void Exception.printStackTrace()>
    //   57  106:return          
    }

    // Unreferenced inner class codeadore/textgram/el7rUtilities$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #22  <Method void DialogInterface.cancel()>
        //    2    6:return          
        }
    }


    // Unreferenced inner class codeadore/textgram/el7rUtilities$2

/* anonymous class */
    class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #22  <Method void DialogInterface.cancel()>
        //    2    6:return          
        }
    }


    // Unreferenced inner class codeadore/textgram/el7rUtilities$3

/* anonymous class */
    class _cls3 extends WebViewClient
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field Context val$context>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void WebViewClient()>
        //    5    9:return          
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
        //    0    0:aload_2         
        //    1    1:ldc1            #22  <String "store://">
        //    2    3:invokevirtual   #28  <Method boolean String.startsWith(String)>
        //    3    6:ifeq            58
        //    4    9:aload_1         
        //    5   10:invokevirtual   #33  <Method void WebView.stopLoading()>
        //    6   13:aload_2         
        //    7   14:ldc1            #22  <String "store://">
        //    8   16:ldc1            #35  <String "">
        //    9   18:invokevirtual   #39  <Method String String.replace(CharSequence, CharSequence)>
        //   10   21:astore          6
        //   11   23:new             #41  <Class Intent>
        //   12   26:dup             
        //   13   27:aload_0         
        //   14   28:getfield        #15  <Field Context val$context>
        //   15   31:ldc1            #43  <Class StoreItemActivity>
        //   16   33:invokespecial   #46  <Method void Intent(Context, Class)>
        //   17   36:astore          7
        //   18   38:aload           7
        //   19   40:ldc1            #48  <String "unique_id">
        //   20   42:aload           6
        //   21   44:invokevirtual   #52  <Method Intent Intent.putExtra(String, String)>
        //   22   47:pop             
        //   23   48:aload_0         
        //   24   49:getfield        #15  <Field Context val$context>
        //   25   52:aload           7
        //   26   54:invokevirtual   #58  <Method void Context.startActivity(Intent)>
        //   27   57:return          
        //   28   58:aload_2         
        //   29   59:ldc1            #60  <String "http">
        //   30   61:invokevirtual   #28  <Method boolean String.startsWith(String)>
        //   31   64:ifne            76
        //   32   67:aload_2         
        //   33   68:ldc1            #62  <String "market://">
        //   34   70:invokevirtual   #28  <Method boolean String.startsWith(String)>
        //   35   73:ifeq            111
        //   36   76:aload_1         
        //   37   77:invokevirtual   #33  <Method void WebView.stopLoading()>
        //   38   80:new             #41  <Class Intent>
        //   39   83:dup             
        //   40   84:ldc1            #64  <String "android.intent.action.VIEW">
        //   41   86:invokespecial   #67  <Method void Intent(String)>
        //   42   89:astore          4
        //   43   91:aload           4
        //   44   93:aload_2         
        //   45   94:invokestatic    #73  <Method Uri Uri.parse(String)>
        //   46   97:invokevirtual   #77  <Method Intent Intent.setData(Uri)>
        //   47  100:pop             
        //   48  101:aload_0         
        //   49  102:getfield        #15  <Field Context val$context>
        //   50  105:aload           4
        //   51  107:invokevirtual   #58  <Method void Context.startActivity(Intent)>
        //   52  110:return          
        //   53  111:aload_0         
        //   54  112:aload_1         
        //   55  113:aload_2         
        //   56  114:aload_3         
        //   57  115:invokespecial   #79  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
        //   58  118:return          
        }

        private final Context val$context;
    }

}
