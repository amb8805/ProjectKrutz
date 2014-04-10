// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.*;
import codeadore.textgram.lazylist.ImageLoader;
import codeadore.textgram.store.StorePackages;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, Settings, el7rUtilities

public class StoreItemActivity extends el7rActivity
{

    static 
    {
    //    0    0:ldc1            #22  <String "Package">
    //    1    2:putstatic       #24  <Field String packageTitle>
    //    2    5:ldc1            #26  <String "">
    //    3    7:putstatic       #28  <Field String packageURL>
    //    4   10:return          
    }

    public StoreItemActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #33  <String "StoreItemActivity">
    //    4    7:putfield        #35  <Field String TAG>
    //    5   10:return          
    }

    public static void reset()
    {
    //    0    0:getstatic       #38  <Field LinearLayout layoutLoadingLL>
    //    1    3:iconst_0        
    //    2    4:invokevirtual   #44  <Method void LinearLayout.setVisibility(int)>
    //    3    7:getstatic       #46  <Field LinearLayout LayoutMainLL>
    //    4   10:bipush          8
    //    5   12:invokevirtual   #44  <Method void LinearLayout.setVisibility(int)>
    //    6   15:new             #48  <Class Thread>
    //    7   18:dup             
    //    8   19:getstatic       #50  <Field Runnable loadItem>
    //    9   22:invokespecial   #53  <Method void Thread(Runnable)>
    //   10   25:invokevirtual   #56  <Method void Thread.start()>
    //   11   28:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #60  <Method void el7rActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #61  <Int 0x7f03002f>
    //    5    8:invokevirtual   #64  <Method void setContentView(int)>
    //    6   11:aload_0         
    //    7   12:new             #66  <Class ImageLoader>
    //    8   15:dup             
    //    9   16:aload_0         
    //   10   17:invokevirtual   #70  <Method Context getApplicationContext()>
    //   11   20:invokespecial   #73  <Method void ImageLoader(Context)>
    //   12   23:putfield        #75  <Field ImageLoader imageLoader>
    //   13   26:aload_0         
    //   14   27:getfield        #79  <Field GoogleAnalyticsTracker tracker>
    //   15   30:ldc1            #81  <String "/StoreItemActivity">
    //   16   32:invokevirtual   #87  <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   17   35:aload_0         
    //   18   36:aload_0         
    //   19   37:invokevirtual   #91  <Method Intent getIntent()>
    //   20   40:invokevirtual   #97  <Method Bundle Intent.getExtras()>
    //   21   43:ldc1            #98  <String "unique_id">
    //   22   45:invokevirtual   #104 <Method String Bundle.getString(String)>
    //   23   48:putfield        #106 <Field String unique_id>
    //   24   51:new             #108 <Class Handler>
    //   25   54:dup             
    //   26   55:invokespecial   #109 <Method void Handler()>
    //   27   58:astore_2        
    //   28   59:aload_0         
    //   29   60:putstatic       #111 <Field Context c>
    //   30   63:aload_0         
    //   31   64:invokevirtual   #115 <Method ActionBar getSupportActionBar()>
    //   32   67:iconst_1        
    //   33   68:invokevirtual   #121 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   34   71:aload_0         
    //   35   72:aload_0         
    //   36   73:ldc1            #122 <Int 0x7f0b003f>
    //   37   75:invokevirtual   #125 <Method String getString(int)>
    //   38   78:invokevirtual   #128 <Method void setTitle(String)>
    //   39   81:aload_0         
    //   40   82:ldc1            #129 <Int 0x7f06009f>
    //   41   84:invokevirtual   #133 <Method View findViewById(int)>
    //   42   87:checkcast       #40  <Class LinearLayout>
    //   43   90:putstatic       #38  <Field LinearLayout layoutLoadingLL>
    //   44   93:aload_0         
    //   45   94:ldc1            #134 <Int 0x7f0600a1>
    //   46   96:invokevirtual   #133 <Method View findViewById(int)>
    //   47   99:checkcast       #40  <Class LinearLayout>
    //   48  102:putstatic       #46  <Field LinearLayout LayoutMainLL>
    //   49  105:new             #136 <Class StoreItemActivity$1>
    //   50  108:dup             
    //   51  109:aload_0         
    //   52  110:aload_2         
    //   53  111:aload_0         
    //   54  112:ldc1            #137 <Int 0x7f0600a2>
    //   55  114:invokevirtual   #133 <Method View findViewById(int)>
    //   56  117:checkcast       #139 <Class ImageView>
    //   57  120:aload_0         
    //   58  121:ldc1            #140 <Int 0x7f0600a3>
    //   59  123:invokevirtual   #133 <Method View findViewById(int)>
    //   60  126:checkcast       #142 <Class TextView>
    //   61  129:aload_0         
    //   62  130:ldc1            #143 <Int 0x7f0600a4>
    //   63  132:invokevirtual   #133 <Method View findViewById(int)>
    //   64  135:checkcast       #142 <Class TextView>
    //   65  138:aload_0         
    //   66  139:ldc1            #144 <Int 0x7f0600a6>
    //   67  141:invokevirtual   #133 <Method View findViewById(int)>
    //   68  144:checkcast       #142 <Class TextView>
    //   69  147:aload_0         
    //   70  148:ldc1            #145 <Int 0x7f0600a7>
    //   71  150:invokevirtual   #133 <Method View findViewById(int)>
    //   72  153:checkcast       #142 <Class TextView>
    //   73  156:aload_0         
    //   74  157:ldc1            #146 <Int 0x7f0600a8>
    //   75  159:invokevirtual   #133 <Method View findViewById(int)>
    //   76  162:checkcast       #148 <Class Button>
    //   77  165:invokespecial   #151 <Method void StoreItemActivity$1(StoreItemActivity, Handler, ImageView, TextView, TextView, TextView, TextView, Button)>
    //   78  168:putstatic       #50  <Field Runnable loadItem>
    //   79  171:new             #48  <Class Thread>
    //   80  174:dup             
    //   81  175:getstatic       #50  <Field Runnable loadItem>
    //   82  178:invokespecial   #53  <Method void Thread(Runnable)>
    //   83  181:invokevirtual   #56  <Method void Thread.start()>
    //   84  184:return          
    }

    static LinearLayout LayoutMainLL;
    static Context c;
    static LinearLayout layoutLoadingLL;
    static Runnable loadItem;
    static String packageTitle;
    static String packageURL;
    String TAG;
    ImageLoader imageLoader;
    String unique_id;

    // Unreferenced inner class codeadore/textgram/StoreItemActivity$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #28  <Field StoreItemActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #30  <Field Handler val$UIHandler>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #32  <Field ImageView val$layoutIconIV>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #34  <Field TextView val$layoutTitleTV>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #36  <Field TextView val$layoutAuthorTV>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #38  <Field TextView val$layoutDescrTV>
        //   18   33:aload_0         
        //   19   34:aload           7
        //   20   36:putfield        #40  <Field TextView val$layoutDetailsTV>
        //   21   39:aload_0         
        //   22   40:aload           8
        //   23   42:putfield        #42  <Field Button val$LayoutBtn>
        //   24   45:aload_0         
        //   25   46:invokespecial   #45  <Method void Object()>
        //   26   49:return          
        }

        static StoreItemActivity access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field StoreItemActivity this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #28  <Field StoreItemActivity this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        // try 0 35 handler(s) 199
        //    0    0:new             #52  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:getstatic       #58  <Field String Settings.store_api_url>
        //    3    7:invokestatic    #64  <Method String String.valueOf(Object)>
        //    4   10:invokespecial   #67  <Method void StringBuilder(String)>
        //    5   13:ldc1            #69  <String "/items.php?action=item_details&item=">
        //    6   15:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
        //    7   18:aload_0         
        //    8   19:getfield        #28  <Field StoreItemActivity this$0>
        //    9   22:getfield        #76  <Field String StoreItemActivity.unique_id>
        //   10   25:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
        //   11   28:invokevirtual   #80  <Method String StringBuilder.toString()>
        //   12   31:invokestatic    #86  <Method String el7rUtilities.geHTTPtContents(String)>
        //   13   34:astore_2        
        //   14   35:aload_2         
        //   15   36:ifnull          45
        //   16   39:aload_2         
        //   17   40:ldc1            #88  <String "">
        //   18   42:if_acmpne       62
        // try 45 61 handler(s) 199
        //   19   45:aload_0         
        //   20   46:getfield        #30  <Field Handler val$UIHandler>
        //   21   49:new             #90  <Class StoreItemActivity$1$1>
        //   22   52:dup             
        //   23   53:aload_0         
        //   24   54:invokespecial   #93  <Method void StoreItemActivity$1$1(StoreItemActivity$1)>
        //   25   57:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //   26   60:pop             
        //   27   61:return          
        // try 62 198 handler(s) 199
        //   28   62:new             #101 <Class JSONObject>
        //   29   65:dup             
        //   30   66:aload_2         
        //   31   67:invokespecial   #102 <Method void JSONObject(String)>
        //   32   70:astore          4
        //   33   72:aload           4
        //   34   74:ldc1            #104 <String "valid">
        //   35   76:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   36   79:ldc1            #109 <String "true">
        //   37   81:invokevirtual   #113 <Method boolean String.contains(CharSequence)>
        //   38   84:ifeq            204
        //   39   87:aload           4
        //   40   89:ldc1            #115 <String "title">
        //   41   91:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   42   94:astore          5
        //   43   96:aload           4
        //   44   98:ldc1            #117 <String "description">
        //   45  100:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   46  103:astore          6
        //   47  105:aload           4
        //   48  107:ldc1            #119 <String "author_name">
        //   49  109:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   50  112:astore          7
        //   51  114:aload           4
        //   52  116:ldc1            #121 <String "download_size">
        //   53  118:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   54  121:astore          8
        //   55  123:aload           4
        //   56  125:ldc1            #123 <String "icon_link">
        //   57  127:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   58  130:astore          9
        //   59  132:aload           4
        //   60  134:ldc1            #125 <String "download_link">
        //   61  136:invokevirtual   #107 <Method String JSONObject.getString(String)>
        //   62  139:astore          10
        //   63  141:aload           10
        //   64  143:putstatic       #128 <Field String StoreItemActivity.packageURL>
        //   65  146:aload_0         
        //   66  147:getfield        #30  <Field Handler val$UIHandler>
        //   67  150:new             #130 <Class StoreItemActivity$1$2>
        //   68  153:dup             
        //   69  154:aload_0         
        //   70  155:aload           9
        //   71  157:aload_0         
        //   72  158:getfield        #32  <Field ImageView val$layoutIconIV>
        //   73  161:aload_0         
        //   74  162:getfield        #34  <Field TextView val$layoutTitleTV>
        //   75  165:aload           5
        //   76  167:aload_0         
        //   77  168:getfield        #36  <Field TextView val$layoutAuthorTV>
        //   78  171:aload           7
        //   79  173:aload_0         
        //   80  174:getfield        #38  <Field TextView val$layoutDescrTV>
        //   81  177:aload           6
        //   82  179:aload_0         
        //   83  180:getfield        #40  <Field TextView val$layoutDetailsTV>
        //   84  183:aload           8
        //   85  185:aload_0         
        //   86  186:getfield        #42  <Field Button val$LayoutBtn>
        //   87  189:aload           10
        //   88  191:invokespecial   #133 <Method void StoreItemActivity$1$2(StoreItemActivity$1, String, ImageView, TextView, String, TextView, String, TextView, String, TextView, String, Button, String)>
        //   89  194:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //   90  197:pop             
        //   91  198:return          
        // catch Exception Exception Exception
        //   92  199:astore_1        
        //   93  200:aload_1         
        //   94  201:invokevirtual   #136 <Method void Exception.printStackTrace()>
        //   95  204:return          
        }

        final StoreItemActivity this$0;
        private final Button val$LayoutBtn;
        private final Handler val$UIHandler;
        private final TextView val$layoutAuthorTV;
        private final TextView val$layoutDescrTV;
        private final TextView val$layoutDetailsTV;
        private final ImageView val$layoutIconIV;
        private final TextView val$layoutTitleTV;

            static StoreItemActivity access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #28  <Field StoreItemActivity this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/StoreItemActivity$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreItemActivity$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:ldc1            #21  <String "Error">
        //    1    2:ldc1            #23  <String "fail">
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field StoreItemActivity$1 this$1>
        //    4    8:invokestatic    #27  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //    5   11:invokevirtual   #33  <Method Context StoreItemActivity.getApplicationContext()>
        //    6   14:invokestatic    #39  <Method void el7rUtilities.messageBox(String, String, Context)>
        //    7   17:return          
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class codeadore/textgram/StoreItemActivity$1$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #33  <Field StoreItemActivity$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #35  <Field String val$icon_link>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #37  <Field ImageView val$layoutIconIV>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #39  <Field TextView val$layoutTitleTV>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #41  <Field String val$title>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #43  <Field TextView val$layoutAuthorTV>
        //   18   33:aload_0         
        //   19   34:aload           7
        //   20   36:putfield        #45  <Field String val$author>
        //   21   39:aload_0         
        //   22   40:aload           8
        //   23   42:putfield        #47  <Field TextView val$layoutDescrTV>
        //   24   45:aload_0         
        //   25   46:aload           9
        //   26   48:putfield        #49  <Field String val$description>
        //   27   51:aload_0         
        //   28   52:aload           10
        //   29   54:putfield        #51  <Field TextView val$layoutDetailsTV>
        //   30   57:aload_0         
        //   31   58:aload           11
        //   32   60:putfield        #53  <Field String val$download_size>
        //   33   63:aload_0         
        //   34   64:aload           12
        //   35   66:putfield        #55  <Field Button val$LayoutBtn>
        //   36   69:aload_0         
        //   37   70:aload           13
        //   38   72:putfield        #57  <Field String val$download_link>
        //   39   75:aload_0         
        //   40   76:invokespecial   #59  <Method void Object()>
        //   41   79:return          
        }

        static _cls1 access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field StoreItemActivity$1 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #33  <Field StoreItemActivity$1 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:getstatic       #67  <Field LinearLayout StoreItemActivity.layoutLoadingLL>
        //    1    3:bipush          8
        //    2    5:invokevirtual   #73  <Method void LinearLayout.setVisibility(int)>
        //    3    8:getstatic       #76  <Field LinearLayout StoreItemActivity.LayoutMainLL>
        //    4   11:iconst_0        
        //    5   12:invokevirtual   #73  <Method void LinearLayout.setVisibility(int)>
        //    6   15:aload_0         
        //    7   16:getfield        #33  <Field StoreItemActivity$1 this$1>
        //    8   19:invokestatic    #79  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //    9   22:getfield        #83  <Field ImageLoader StoreItemActivity.imageLoader>
        //   10   25:aload_0         
        //   11   26:getfield        #35  <Field String val$icon_link>
        //   12   29:aload_0         
        //   13   30:getfield        #37  <Field ImageView val$layoutIconIV>
        //   14   33:invokevirtual   #89  <Method void ImageLoader.DisplayImage(String, ImageView)>
        //   15   36:aload_0         
        //   16   37:getfield        #39  <Field TextView val$layoutTitleTV>
        //   17   40:aload_0         
        //   18   41:getfield        #41  <Field String val$title>
        //   19   44:invokevirtual   #95  <Method void TextView.setText(CharSequence)>
        //   20   47:aload_0         
        //   21   48:getfield        #43  <Field TextView val$layoutAuthorTV>
        //   22   51:aload_0         
        //   23   52:getfield        #45  <Field String val$author>
        //   24   55:invokevirtual   #95  <Method void TextView.setText(CharSequence)>
        //   25   58:aload_0         
        //   26   59:getfield        #47  <Field TextView val$layoutDescrTV>
        //   27   62:aload_0         
        //   28   63:getfield        #49  <Field String val$description>
        //   29   66:invokevirtual   #95  <Method void TextView.setText(CharSequence)>
        //   30   69:aload_0         
        //   31   70:getfield        #51  <Field TextView val$layoutDetailsTV>
        //   32   73:new             #97  <Class StringBuilder>
        //   33   76:dup             
        //   34   77:ldc1            #99  <String "Size: ">
        //   35   79:invokespecial   #102 <Method void StringBuilder(String)>
        //   36   82:aload_0         
        //   37   83:getfield        #53  <Field String val$download_size>
        //   38   86:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
        //   39   89:ldc1            #108 <String "KB">
        //   40   91:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
        //   41   94:invokevirtual   #112 <Method String StringBuilder.toString()>
        //   42   97:invokevirtual   #95  <Method void TextView.setText(CharSequence)>
        //   43  100:aload_0         
        //   44  101:getfield        #33  <Field StoreItemActivity$1 this$1>
        //   45  104:invokestatic    #79  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //   46  107:getfield        #115 <Field String StoreItemActivity.unique_id>
        //   47  110:invokestatic    #121 <Method boolean StorePackages.isInstalled(String)>
        //   48  113:ifeq            149
        //   49  116:aload_0         
        //   50  117:getfield        #55  <Field Button val$LayoutBtn>
        //   51  120:ldc1            #123 <String "UNINSTALL">
        //   52  122:invokevirtual   #126 <Method void Button.setText(CharSequence)>
        //   53  125:aload_0         
        //   54  126:getfield        #55  <Field Button val$LayoutBtn>
        //   55  129:new             #128 <Class StoreItemActivity$1$2$1>
        //   56  132:dup             
        //   57  133:aload_0         
        //   58  134:aload_0         
        //   59  135:getfield        #57  <Field String val$download_link>
        //   60  138:aload_0         
        //   61  139:getfield        #41  <Field String val$title>
        //   62  142:invokespecial   #131 <Method void StoreItemActivity$1$2$1(StoreItemActivity$1$2, String, String)>
        //   63  145:invokevirtual   #135 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
        //   64  148:return          
        //   65  149:aload_0         
        //   66  150:getfield        #55  <Field Button val$LayoutBtn>
        //   67  153:ldc1            #137 <String "INSTALL">
        //   68  155:invokevirtual   #126 <Method void Button.setText(CharSequence)>
        //   69  158:goto            125
        }

        final _cls1 this$1;
        private final Button val$LayoutBtn;
        private final String val$author;
        private final String val$description;
        private final String val$download_link;
        private final String val$download_size;
        private final String val$icon_link;
        private final TextView val$layoutAuthorTV;
        private final TextView val$layoutDescrTV;
        private final TextView val$layoutDetailsTV;
        private final ImageView val$layoutIconIV;
        private final TextView val$layoutTitleTV;
        private final String val$title;

            static _cls1 access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #33  <Field StoreItemActivity$1 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/StoreItemActivity$1$2$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field StoreItemActivity$1$2 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #22  <Field String val$download_link>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #24  <Field String val$title>
        //    9   15:aload_0         
        //   10   16:invokespecial   #26  <Method void Object()>
        //   11   19:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field StoreItemActivity$1$2 this$2>
        //    2    4:invokestatic    #34  <Method StoreItemActivity$1 StoreItemActivity$1$2.access$0(StoreItemActivity$1$2)>
        //    3    7:invokestatic    #39  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //    4   10:getfield        #44  <Field String StoreItemActivity.unique_id>
        //    5   13:invokestatic    #50  <Method boolean StorePackages.isInstalled(String)>
        //    6   16:ifeq            46
        //    7   19:aload_0         
        //    8   20:getfield        #20  <Field StoreItemActivity$1$2 this$2>
        //    9   23:invokestatic    #34  <Method StoreItemActivity$1 StoreItemActivity$1$2.access$0(StoreItemActivity$1$2)>
        //   10   26:invokestatic    #39  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //   11   29:getfield        #44  <Field String StoreItemActivity.unique_id>
        //   12   32:aload_0         
        //   13   33:getfield        #20  <Field StoreItemActivity$1$2 this$2>
        //   14   36:invokestatic    #34  <Method StoreItemActivity$1 StoreItemActivity$1$2.access$0(StoreItemActivity$1$2)>
        //   15   39:invokestatic    #39  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //   16   42:invokestatic    #54  <Method void StorePackages.uninstall(String, Context)>
        //   17   45:return          
        // try 46 80 handler(s) 81
        //   18   46:aload_0         
        //   19   47:getfield        #22  <Field String val$download_link>
        //   20   50:aload_0         
        //   21   51:getfield        #20  <Field StoreItemActivity$1$2 this$2>
        //   22   54:invokestatic    #34  <Method StoreItemActivity$1 StoreItemActivity$1$2.access$0(StoreItemActivity$1$2)>
        //   23   57:invokestatic    #39  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //   24   60:getfield        #44  <Field String StoreItemActivity.unique_id>
        //   25   63:aload_0         
        //   26   64:getfield        #24  <Field String val$title>
        //   27   67:aload_0         
        //   28   68:getfield        #20  <Field StoreItemActivity$1$2 this$2>
        //   29   71:invokestatic    #34  <Method StoreItemActivity$1 StoreItemActivity$1$2.access$0(StoreItemActivity$1$2)>
        //   30   74:invokestatic    #39  <Method StoreItemActivity StoreItemActivity$1.access$0(StoreItemActivity$1)>
        //   31   77:invokestatic    #58  <Method void StorePackages.install(String, String, String, Context)>
        //   32   80:return          
        // catch Exception
        //   33   81:astore_2        
        //   34   82:return          
        }

        final _cls2 this$2;
        private final String val$download_link;
        private final String val$title;
    }

}
