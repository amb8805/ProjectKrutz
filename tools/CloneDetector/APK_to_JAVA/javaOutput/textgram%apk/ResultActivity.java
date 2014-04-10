// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.ProgressDialog;
import android.content.*;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.view.*;
import android.widget.*;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.io.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, AdUtilities, Settings, StylingActivity, 
//            SuperSurface, el7rUtilities, Utilities, AboutActivity

public class ResultActivity extends el7rActivity
{

    public ResultActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #24  <Field boolean doneCaching>
    //    5    9:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #32  <String "ResultActivity">
    //    2    3:putfield        #36  <Field String thisActityName>
    //    3    6:aload_0         
    //    4    7:aload_1         
    //    5    8:invokespecial   #38  <Method void el7rActivity.onCreate(Bundle)>
    //    6   11:aload_0         
    //    7   12:ldc1            #39  <Int 0x7f030020>
    //    8   14:invokevirtual   #43  <Method void setContentView(int)>
    //    9   17:invokestatic    #48  <Method void System.gc()>
    //   10   20:aload_0         
    //   11   21:putstatic       #50  <Field el7rActivity c>
    //   12   24:aload_0         
    //   13   25:iconst_0        
    //   14   26:putfield        #24  <Field boolean doneCaching>
    //   15   29:new             #52  <Class ProgressDialog>
    //   16   32:dup             
    //   17   33:aload_0         
    //   18   34:getfield        #55  <Field el7rActivity thisActivity>
    //   19   37:invokespecial   #58  <Method void ProgressDialog(Context)>
    //   20   40:putstatic       #60  <Field ProgressDialog loadingDialog>
    //   21   43:getstatic       #60  <Field ProgressDialog loadingDialog>
    //   22   46:aload_0         
    //   23   47:ldc1            #61  <Int 0x7f0b0033>
    //   24   49:invokevirtual   #65  <Method String getString(int)>
    //   25   52:invokevirtual   #69  <Method void ProgressDialog.setTitle(CharSequence)>
    //   26   55:getstatic       #60  <Field ProgressDialog loadingDialog>
    //   27   58:iconst_1        
    //   28   59:invokevirtual   #73  <Method void ProgressDialog.setIndeterminate(boolean)>
    //   29   62:new             #75  <Class Handler>
    //   30   65:dup             
    //   31   66:invokespecial   #76  <Method void Handler()>
    //   32   69:putstatic       #78  <Field Handler UIHandler>
    //   33   72:aload_0         
    //   34   73:invokevirtual   #82  <Method ActionBar getSupportActionBar()>
    //   35   76:astore_2        
    //   36   77:aload_0         
    //   37   78:aload_0         
    //   38   79:ldc1            #84  <String "TextgramSettings">
    //   39   81:iconst_0        
    //   40   82:invokevirtual   #88  <Method SharedPreferences getSharedPreferences(String, int)>
    //   41   85:putfield        #90  <Field SharedPreferences settings>
    //   42   88:aload_0         
    //   43   89:getfield        #90  <Field SharedPreferences settings>
    //   44   92:invokeinterface #96  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //   45   97:pop             
    //   46   98:aload_0         
    //   47   99:aload_0         
    //   48  100:ldc1            #97  <Int 0x7f060067>
    //   49  102:invokevirtual   #101 <Method View findViewById(int)>
    //   50  105:invokestatic    #107 <Method void AdUtilities.installAd(android.app.Activity, View)>
    //   51  108:getstatic       #113 <Field JSONObject Settings.json>
    //   52  111:ifnull          146
    //   53  114:getstatic       #113 <Field JSONObject Settings.json>
    //   54  117:ldc1            #115 <String "show_ads_results_fs">
    //   55  119:invokevirtual   #121 <Method boolean JSONObject.has(String)>
    //   56  122:ifeq            146
    // try 125 146 handler(s) 327
    //   57  125:getstatic       #113 <Field JSONObject Settings.json>
    //   58  128:ldc1            #115 <String "show_ads_results_fs">
    //   59  130:invokevirtual   #124 <Method boolean JSONObject.getBoolean(String)>
    //   60  133:ifeq            146
    //   61  136:aload_0         
    //   62  137:aload_0         
    //   63  138:ldc1            #125 <Int 0x7f060068>
    //   64  140:invokevirtual   #101 <Method View findViewById(int)>
    //   65  143:invokestatic    #128 <Method void AdUtilities.installFullScreenAd(android.app.Activity, View)>
    //   66  146:aload_0         
    //   67  147:getfield        #132 <Field GoogleAnalyticsTracker tracker>
    //   68  150:ldc1            #134 <String "/ResultActivity">
    //   69  152:invokevirtual   #140 <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   70  155:aload_2         
    //   71  156:iconst_1        
    //   72  157:invokevirtual   #145 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   73  160:aload_0         
    //   74  161:aload_0         
    //   75  162:ldc1            #146 <Int 0x7f060069>
    //   76  164:invokevirtual   #101 <Method View findViewById(int)>
    //   77  167:checkcast       #148 <Class ImageView>
    //   78  170:putfield        #150 <Field ImageView resultIv>
    //   79  173:getstatic       #152 <Field Bitmap resultBitmap>
    //   80  176:ifnonnull       188
    // try 179 188 handler(s) 337
    //   81  179:getstatic       #158 <Field SuperSurface StylingActivity.superSurface>
    //   82  182:invokevirtual   #164 <Method Bitmap SuperSurface.export()>
    //   83  185:putstatic       #152 <Field Bitmap resultBitmap>
    //   84  188:getstatic       #152 <Field Bitmap resultBitmap>
    //   85  191:ifnull          204
    //   86  194:aload_0         
    //   87  195:getfield        #150 <Field ImageView resultIv>
    //   88  198:getstatic       #152 <Field Bitmap resultBitmap>
    //   89  201:invokevirtual   #168 <Method void ImageView.setImageBitmap(Bitmap)>
    //   90  204:aload_0         
    //   91  205:ldc1            #169 <Int 0x7f06006b>
    //   92  207:invokevirtual   #101 <Method View findViewById(int)>
    //   93  210:checkcast       #171 <Class Button>
    //   94  213:new             #173 <Class ResultActivity$1>
    //   95  216:dup             
    //   96  217:aload_0         
    //   97  218:invokespecial   #176 <Method void ResultActivity$1(ResultActivity)>
    //   98  221:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   99  224:aload_0         
    //  100  225:ldc1            #181 <Int 0x7f06006a>
    //  101  227:invokevirtual   #101 <Method View findViewById(int)>
    //  102  230:checkcast       #171 <Class Button>
    //  103  233:new             #183 <Class ResultActivity$2>
    //  104  236:dup             
    //  105  237:aload_0         
    //  106  238:invokespecial   #184 <Method void ResultActivity$2(ResultActivity)>
    //  107  241:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  108  244:aload_0         
    //  109  245:ldc1            #185 <Int 0x7f06006c>
    //  110  247:invokevirtual   #101 <Method View findViewById(int)>
    //  111  250:checkcast       #171 <Class Button>
    //  112  253:astore          4
    //  113  255:getstatic       #50  <Field el7rActivity c>
    //  114  258:ldc1            #187 <String "com.instagram.android">
    //  115  260:invokestatic    #193 <Method boolean el7rUtilities.isAppInstalled(Context, String)>
    //  116  263:ifeq            285
    //  117  266:aload           4
    //  118  268:iconst_0        
    //  119  269:invokevirtual   #196 <Method void Button.setVisibility(int)>
    //  120  272:aload           4
    //  121  274:new             #198 <Class ResultActivity$3>
    //  122  277:dup             
    //  123  278:aload_0         
    //  124  279:invokespecial   #199 <Method void ResultActivity$3(ResultActivity)>
    //  125  282:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  126  285:aload_0         
    //  127  286:ldc1            #200 <Int 0x7f06006d>
    //  128  288:invokevirtual   #101 <Method View findViewById(int)>
    //  129  291:checkcast       #171 <Class Button>
    //  130  294:astore          5
    //  131  296:getstatic       #50  <Field el7rActivity c>
    //  132  299:ldc1            #202 <String "com.facebook.katana">
    //  133  301:invokestatic    #193 <Method boolean el7rUtilities.isAppInstalled(Context, String)>
    //  134  304:ifeq            326
    //  135  307:aload           5
    //  136  309:iconst_0        
    //  137  310:invokevirtual   #196 <Method void Button.setVisibility(int)>
    //  138  313:aload           5
    //  139  315:new             #204 <Class ResultActivity$4>
    //  140  318:dup             
    //  141  319:aload_0         
    //  142  320:invokespecial   #205 <Method void ResultActivity$4(ResultActivity)>
    //  143  323:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  144  326:return          
    // catch JSONException
    //  145  327:astore          7
    //  146  329:aload           7
    //  147  331:invokevirtual   #208 <Method void JSONException.printStackTrace()>
    //  148  334:goto            146
    // catch Exception
    //  149  337:astore          6
    //  150  339:goto            188
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #214 <Method MenuInflater getMenuInflater()>
    //    2    4:ldc1            #215 <Int 0x7f0d0000>
    //    3    6:aload_1         
    //    4    7:invokevirtual   #221 <Method void MenuInflater.inflate(int, Menu)>
    //    5   10:aload_0         
    //    6   11:aload_1         
    //    7   12:putfield        #225 <Field Menu theMenu>
    //    8   15:aload_1         
    //    9   16:ldc1            #226 <Int 0x7f0600e0>
    //   10   18:invokeinterface #232 <Method MenuItem Menu.findItem(int)>
    //   11   23:iconst_0        
    //   12   24:invokeinterface #238 <Method MenuItem MenuItem.setVisible(boolean)>
    //   13   29:pop             
    //   14   30:aload_0         
    //   15   31:invokevirtual   #242 <Method Context getBaseContext()>
    //   16   34:ldc1            #244 <String "layout_inflater">
    //   17   36:invokevirtual   #250 <Method Object Context.getSystemService(String)>
    //   18   39:checkcast       #252 <Class LayoutInflater>
    //   19   42:ldc1            #253 <Int 0x7f030000>
    //   20   44:aconst_null     
    //   21   45:invokevirtual   #256 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   22   48:astore_3        
    //   23   49:aload_3         
    //   24   50:ldc2            #257 <Int 0x7f06001c>
    //   25   53:invokevirtual   #260 <Method View View.findViewById(int)>
    //   26   56:checkcast       #171 <Class Button>
    //   27   59:astore          4
    //   28   61:aload           4
    //   29   63:aload_0         
    //   30   64:ldc2            #261 <Int 0x7f0b0016>
    //   31   67:invokevirtual   #65  <Method String getString(int)>
    //   32   70:invokevirtual   #264 <Method void Button.setText(CharSequence)>
    //   33   73:aload           4
    //   34   75:ldc2            #265 <Int 0x7f02007c>
    //   35   78:invokevirtual   #268 <Method void Button.setBackgroundResource(int)>
    //   36   81:aload           4
    //   37   83:new             #270 <Class ResultActivity$6>
    //   38   86:dup             
    //   39   87:aload_0         
    //   40   88:invokespecial   #271 <Method void ResultActivity$6(ResultActivity)>
    //   41   91:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   42   94:aload_1         
    //   43   95:ldc2            #272 <Int 0x7f0600e5>
    //   44   98:invokeinterface #232 <Method MenuItem Menu.findItem(int)>
    //   45  103:astore          5
    //   46  105:aload           5
    //   47  107:iconst_2        
    //   48  108:invokestatic    #278 <Method void MenuItemCompat.setShowAsAction(MenuItem, int)>
    //   49  111:aload           5
    //   50  113:aload_3         
    //   51  114:invokestatic    #282 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
    //   52  117:pop             
    //   53  118:iconst_1        
    //   54  119:ireturn         
    }

    protected void onDestroy()
    {
    //    0    0:getstatic       #60  <Field ProgressDialog loadingDialog>
    //    1    3:invokevirtual   #286 <Method void ProgressDialog.cancel()>
    //    2    6:getstatic       #60  <Field ProgressDialog loadingDialog>
    //    3    9:invokevirtual   #289 <Method void ProgressDialog.dismiss()>
    //    4   12:aload_0         
    //    5   13:invokespecial   #291 <Method void el7rActivity.onDestroy()>
    //    6   16:return          
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #294 <Method void el7rActivity.onRestoreInstanceState(Bundle)>
    //    3    5:getstatic       #152 <Field Bitmap resultBitmap>
    //    4    8:ifnonnull       40
    // try 11 40 handler(s) 41
    //    5   11:aload_0         
    //    6   12:ldc2            #296 <String "CACHE_BITMAP">
    //    7   15:invokevirtual   #300 <Method FileInputStream openFileInput(String)>
    //    8   18:astore_3        
    //    9   19:aload_3         
    //   10   20:invokestatic    #306 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
    //   11   23:putstatic       #152 <Field Bitmap resultBitmap>
    //   12   26:aload_0         
    //   13   27:getfield        #150 <Field ImageView resultIv>
    //   14   30:getstatic       #152 <Field Bitmap resultBitmap>
    //   15   33:invokevirtual   #168 <Method void ImageView.setImageBitmap(Bitmap)>
    //   16   36:aload_3         
    //   17   37:invokevirtual   #311 <Method void FileInputStream.close()>
    //   18   40:return          
    // catch Exception
    //   19   41:astore_2        
    //   20   42:aload_2         
    //   21   43:invokevirtual   #312 <Method void Exception.printStackTrace()>
    //   22   46:return          
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #315 <Method void el7rActivity.onSaveInstanceState(Bundle)>
    //    3    5:new             #317 <Class Thread>
    //    4    8:dup             
    //    5    9:new             #319 <Class ResultActivity$5>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:invokespecial   #320 <Method void ResultActivity$5(ResultActivity)>
    //    9   17:invokespecial   #323 <Method void Thread(Runnable)>
    //   10   20:invokevirtual   #326 <Method void Thread.start()>
    //   11   23:return          
    }

    public static Handler UIHandler;
    public static el7rActivity c;
    static ProgressDialog loadingDialog;
    public static Bitmap resultBitmap;
    boolean doneCaching;
    ImageView resultIv;
    SharedPreferences settings;

    // Unreferenced inner class codeadore/textgram/ResultActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 29 handler(s) 30
        //    0    0:getstatic       #28  <Field el7rActivity ResultActivity.c>
        //    1    3:getstatic       #32  <Field Bitmap ResultActivity.resultBitmap>
        //    2    6:getstatic       #36  <Field ProgressDialog ResultActivity.loadingDialog>
        //    3    9:invokestatic    #42  <Method void Utilities.shareBitmap(Context, Bitmap, ProgressDialog)>
        //    4   12:aload_0         
        //    5   13:getfield        #17  <Field ResultActivity this$0>
        //    6   16:getfield        #46  <Field GoogleAnalyticsTracker ResultActivity.tracker>
        //    7   19:iconst_1        
        //    8   20:ldc1            #48  <String "Share Button">
        //    9   22:ldc1            #50  <String "Button click">
        //   10   24:iconst_2        
        //   11   25:invokevirtual   #56  <Method boolean GoogleAnalyticsTracker.setCustomVar(int, String, String, int)>
        //   12   28:pop             
        //   13   29:return          
        // catch IOException
        //   14   30:astore_2        
        //   15   31:aload_2         
        //   16   32:invokevirtual   #59  <Method void IOException.printStackTrace()>
        //   17   35:return          
        }

        final ResultActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/ResultActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 29 handler(s) 30
        //    0    0:getstatic       #28  <Field el7rActivity ResultActivity.c>
        //    1    3:getstatic       #32  <Field Bitmap ResultActivity.resultBitmap>
        //    2    6:getstatic       #36  <Field ProgressDialog ResultActivity.loadingDialog>
        //    3    9:invokestatic    #42  <Method void Utilities.saveBitmap(Context, Bitmap, ProgressDialog)>
        //    4   12:aload_0         
        //    5   13:getfield        #17  <Field ResultActivity this$0>
        //    6   16:getfield        #46  <Field GoogleAnalyticsTracker ResultActivity.tracker>
        //    7   19:iconst_1        
        //    8   20:ldc1            #48  <String "Save Button">
        //    9   22:ldc1            #50  <String "Button click">
        //   10   24:iconst_2        
        //   11   25:invokevirtual   #56  <Method boolean GoogleAnalyticsTracker.setCustomVar(int, String, String, int)>
        //   12   28:pop             
        //   13   29:return          
        // catch IOException
        //   14   30:astore_2        
        //   15   31:aload_2         
        //   16   32:invokevirtual   #59  <Method void IOException.printStackTrace()>
        //   17   35:return          
        }

        final ResultActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/ResultActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 128 handler(s) 129
        //    0    0:new             #28  <Class ByteArrayOutputStream>
        //    1    3:dup             
        //    2    4:invokespecial   #29  <Method void ByteArrayOutputStream()>
        //    3    7:astore_2        
        //    4    8:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //    5   11:getstatic       #39  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
        //    6   14:bipush          100
        //    7   16:aload_2         
        //    8   17:invokevirtual   #45  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
        //    9   20:pop             
        //   10   21:aload_0         
        //   11   22:getfield        #17  <Field ResultActivity this$0>
        //   12   25:invokevirtual   #49  <Method android.content.ContentResolver ResultActivity.getContentResolver()>
        //   13   28:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //   14   31:ldc1            #51  <String "Title">
        //   15   33:ldc1            #53  <String "subject">
        //   16   35:invokestatic    #59  <Method String android.provider.MediaStore$Images$Media.insertImage(android.content.ContentResolver, Bitmap, String, String)>
        //   17   38:invokestatic    #65  <Method Uri Uri.parse(String)>
        //   18   41:astore          7
        //   19   43:new             #67  <Class Intent>
        //   20   46:dup             
        //   21   47:ldc1            #69  <String "android.intent.action.SEND">
        //   22   49:invokespecial   #72  <Method void Intent(String)>
        //   23   52:astore          8
        //   24   54:aload           8
        //   25   56:ldc1            #74  <String "image/*">
        //   26   58:invokevirtual   #78  <Method Intent Intent.setType(String)>
        //   27   61:pop             
        //   28   62:aload           8
        //   29   64:ldc1            #80  <String "android.intent.extra.TEXT">
        //   30   66:ldc1            #82  <String "@textgramofficial">
        //   31   68:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
        //   32   71:pop             
        //   33   72:aload           8
        //   34   74:ldc1            #88  <String "android.intent.extra.SUBJECT">
        //   35   76:ldc1            #82  <String "@textgramofficial">
        //   36   78:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
        //   37   81:pop             
        //   38   82:aload           8
        //   39   84:ldc1            #90  <String "android.intent.extra.STREAM">
        //   40   86:aload           7
        //   41   88:invokevirtual   #93  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
        //   42   91:pop             
        //   43   92:aload           8
        //   44   94:ldc1            #95  <String "com.instagram.android">
        //   45   96:invokevirtual   #98  <Method Intent Intent.setPackage(String)>
        //   46   99:pop             
        //   47  100:aload_0         
        //   48  101:getfield        #17  <Field ResultActivity this$0>
        //   49  104:aload           8
        //   50  106:invokevirtual   #102 <Method void ResultActivity.startActivity(Intent)>
        //   51  109:getstatic       #106 <Field el7rActivity ResultActivity.c>
        //   52  112:aload_0         
        //   53  113:getfield        #17  <Field ResultActivity this$0>
        //   54  116:ldc1            #107 <Int 0x7f0b0067>
        //   55  118:invokevirtual   #111 <Method String ResultActivity.getString(int)>
        //   56  121:iconst_1        
        //   57  122:invokestatic    #117 <Method Toast Toast.makeText(Context, CharSequence, int)>
        //   58  125:invokevirtual   #120 <Method void Toast.show()>
        //   59  128:return          
        // catch Exception
        //   60  129:astore_3        
        // try 130 159 handler(s) 164
        //   61  130:getstatic       #106 <Field el7rActivity ResultActivity.c>
        //   62  133:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //   63  136:getstatic       #124 <Field ProgressDialog ResultActivity.loadingDialog>
        //   64  139:invokestatic    #130 <Method void Utilities.shareBitmap(Context, Bitmap, ProgressDialog)>
        //   65  142:aload_0         
        //   66  143:getfield        #17  <Field ResultActivity this$0>
        //   67  146:getfield        #134 <Field GoogleAnalyticsTracker ResultActivity.tracker>
        //   68  149:iconst_1        
        //   69  150:ldc1            #136 <String "Share Button">
        //   70  152:ldc1            #138 <String "Button click">
        //   71  154:iconst_2        
        //   72  155:invokevirtual   #144 <Method boolean GoogleAnalyticsTracker.setCustomVar(int, String, String, int)>
        //   73  158:pop             
        //   74  159:aload_3         
        //   75  160:invokevirtual   #147 <Method void Exception.printStackTrace()>
        //   76  163:return          
        // catch IOException
        //   77  164:astore          4
        //   78  166:aload           4
        //   79  168:invokevirtual   #148 <Method void IOException.printStackTrace()>
        //   80  171:goto            159
        }

        final ResultActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/ResultActivity$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 128 handler(s) 129
        //    0    0:new             #28  <Class ByteArrayOutputStream>
        //    1    3:dup             
        //    2    4:invokespecial   #29  <Method void ByteArrayOutputStream()>
        //    3    7:astore_2        
        //    4    8:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //    5   11:getstatic       #39  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
        //    6   14:bipush          100
        //    7   16:aload_2         
        //    8   17:invokevirtual   #45  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
        //    9   20:pop             
        //   10   21:aload_0         
        //   11   22:getfield        #17  <Field ResultActivity this$0>
        //   12   25:invokevirtual   #49  <Method android.content.ContentResolver ResultActivity.getContentResolver()>
        //   13   28:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //   14   31:ldc1            #51  <String "Title">
        //   15   33:ldc1            #53  <String "subject">
        //   16   35:invokestatic    #59  <Method String android.provider.MediaStore$Images$Media.insertImage(android.content.ContentResolver, Bitmap, String, String)>
        //   17   38:invokestatic    #65  <Method Uri Uri.parse(String)>
        //   18   41:astore          7
        //   19   43:new             #67  <Class Intent>
        //   20   46:dup             
        //   21   47:ldc1            #69  <String "android.intent.action.SEND">
        //   22   49:invokespecial   #72  <Method void Intent(String)>
        //   23   52:astore          8
        //   24   54:aload           8
        //   25   56:ldc1            #74  <String "image/*">
        //   26   58:invokevirtual   #78  <Method Intent Intent.setType(String)>
        //   27   61:pop             
        //   28   62:aload           8
        //   29   64:ldc1            #80  <String "android.intent.extra.TEXT">
        //   30   66:ldc1            #82  <String "#textgram">
        //   31   68:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
        //   32   71:pop             
        //   33   72:aload           8
        //   34   74:ldc1            #88  <String "android.intent.extra.SUBJECT">
        //   35   76:ldc1            #82  <String "#textgram">
        //   36   78:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
        //   37   81:pop             
        //   38   82:aload           8
        //   39   84:ldc1            #90  <String "android.intent.extra.STREAM">
        //   40   86:aload           7
        //   41   88:invokevirtual   #93  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
        //   42   91:pop             
        //   43   92:aload           8
        //   44   94:ldc1            #95  <String "com.facebook.katana">
        //   45   96:invokevirtual   #98  <Method Intent Intent.setPackage(String)>
        //   46   99:pop             
        //   47  100:aload_0         
        //   48  101:getfield        #17  <Field ResultActivity this$0>
        //   49  104:aload           8
        //   50  106:invokevirtual   #102 <Method void ResultActivity.startActivity(Intent)>
        //   51  109:getstatic       #106 <Field el7rActivity ResultActivity.c>
        //   52  112:aload_0         
        //   53  113:getfield        #17  <Field ResultActivity this$0>
        //   54  116:ldc1            #107 <Int 0x7f0b0067>
        //   55  118:invokevirtual   #111 <Method String ResultActivity.getString(int)>
        //   56  121:iconst_1        
        //   57  122:invokestatic    #117 <Method Toast Toast.makeText(Context, CharSequence, int)>
        //   58  125:invokevirtual   #120 <Method void Toast.show()>
        //   59  128:return          
        // catch Exception
        //   60  129:astore_3        
        // try 130 159 handler(s) 164
        //   61  130:getstatic       #106 <Field el7rActivity ResultActivity.c>
        //   62  133:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //   63  136:getstatic       #124 <Field ProgressDialog ResultActivity.loadingDialog>
        //   64  139:invokestatic    #130 <Method void Utilities.shareBitmap(Context, Bitmap, ProgressDialog)>
        //   65  142:aload_0         
        //   66  143:getfield        #17  <Field ResultActivity this$0>
        //   67  146:getfield        #134 <Field GoogleAnalyticsTracker ResultActivity.tracker>
        //   68  149:iconst_1        
        //   69  150:ldc1            #136 <String "Share Button">
        //   70  152:ldc1            #138 <String "Button click">
        //   71  154:iconst_2        
        //   72  155:invokevirtual   #144 <Method boolean GoogleAnalyticsTracker.setCustomVar(int, String, String, int)>
        //   73  158:pop             
        //   74  159:aload_3         
        //   75  160:invokevirtual   #147 <Method void Exception.printStackTrace()>
        //   76  163:return          
        // catch IOException
        //   77  164:astore          4
        //   78  166:aload           4
        //   79  168:invokevirtual   #148 <Method void IOException.printStackTrace()>
        //   80  171:goto            159
        }

        final ResultActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/ResultActivity$5

/* anonymous class */
    class _cls5
        implements Runnable
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        // try 0 28 handler(s) 29
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ResultActivity this$0>
        //    2    4:ldc1            #25  <String "CACHE_BITMAP">
        //    3    6:iconst_0        
        //    4    7:invokevirtual   #29  <Method FileOutputStream ResultActivity.openFileOutput(String, int)>
        //    5   10:astore_2        
        //    6   11:getstatic       #33  <Field Bitmap ResultActivity.resultBitmap>
        //    7   14:getstatic       #39  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
        //    8   17:bipush          100
        //    9   19:aload_2         
        //   10   20:invokevirtual   #45  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
        //   11   23:pop             
        //   12   24:aload_2         
        //   13   25:invokevirtual   #50  <Method void FileOutputStream.close()>
        //   14   28:return          
        // catch Exception
        //   15   29:astore_1        
        //   16   30:aload_1         
        //   17   31:invokevirtual   #53  <Method void Exception.printStackTrace()>
        //   18   34:return          
        }

        final ResultActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/ResultActivity$6

/* anonymous class */
    class _cls6
        implements android.view.View.OnClickListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ResultActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field ResultActivity this$0>
        //    4    8:ldc1            #26  <Class AboutActivity>
        //    5   10:invokespecial   #29  <Method void Intent(Context, Class)>
        //    6   13:astore_2        
        //    7   14:aload_0         
        //    8   15:getfield        #17  <Field ResultActivity this$0>
        //    9   18:aload_2         
        //   10   19:invokevirtual   #33  <Method void ResultActivity.startActivity(Intent)>
        //   11   22:return          
        }

        final ResultActivity this$0;
    }

}
