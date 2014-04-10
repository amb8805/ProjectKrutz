// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, el7rUtilities, AdUtilities

public class GoProActivity extends el7rActivity
{

    public GoProActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #21  <String "GoProActivity">
    //    4    7:putfield        #23  <Field String TAG>
    //    5   10:aload_0         
    //    6   11:new             #25  <Class Handler>
    //    7   14:dup             
    //    8   15:invokespecial   #26  <Method void Handler()>
    //    9   18:putfield        #28  <Field Handler handler>
    //   10   21:return          
    }

    public void applyUpgrade(String s, String s1, String s2)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field SharedPreferences settings>
    //    2    4:invokeinterface #38  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //    3    9:astore          4
    //    4   11:aload_1         
    //    5   12:ifnull          35
    //    6   15:aload_1         
    //    7   16:ldc1            #40  <String "true">
    //    8   18:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //    9   21:ifeq            162
    //   10   24:aload           4
    //   11   26:ldc1            #48  <String "removeAds">
    //   12   28:iconst_1        
    //   13   29:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //   14   34:pop             
    //   15   35:aload_2         
    //   16   36:ifnull          59
    //   17   39:aload_2         
    //   18   40:ldc1            #40  <String "true">
    //   19   42:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   20   45:ifeq            185
    //   21   48:aload           4
    //   22   50:ldc1            #56  <String "removeWatermark">
    //   23   52:iconst_1        
    //   24   53:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //   25   58:pop             
    //   26   59:aload           4
    //   27   61:invokeinterface #60  <Method boolean android.content.SharedPreferences$Editor.commit()>
    //   28   66:pop             
    //   29   67:aload_1         
    //   30   68:ldc1            #40  <String "true">
    //   31   70:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   32   73:ifeq            208
    //   33   76:aload_0         
    //   34   77:getfield        #62  <Field Button removeadsBtn>
    //   35   80:iconst_0        
    //   36   81:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   37   84:aload_2         
    //   38   85:ldc1            #40  <String "true">
    //   39   87:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   40   90:ifeq            219
    //   41   93:aload_0         
    //   42   94:getfield        #70  <Field Button removewatermarkBtn>
    //   43   97:iconst_0        
    //   44   98:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   45  101:aload_1         
    //   46  102:ldc1            #40  <String "true">
    //   47  104:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   48  107:ifeq            135
    //   49  110:aload_2         
    //   50  111:ldc1            #40  <String "true">
    //   51  113:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   52  116:ifeq            135
    //   53  119:aload_0         
    //   54  120:getfield        #62  <Field Button removeadsBtn>
    //   55  123:iconst_0        
    //   56  124:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   57  127:aload_0         
    //   58  128:getfield        #70  <Field Button removewatermarkBtn>
    //   59  131:iconst_0        
    //   60  132:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   61  135:ldc1            #72  <String "">
    //   62  137:astore          6
    //   63  139:aload_3         
    //   64  140:ldc1            #74  <String "promotion_code">
    //   65  142:if_acmpne       230
    //   66  145:aload_0         
    //   67  146:ldc1            #75  <Int 0x7f0b0058>
    //   68  148:invokevirtual   #79  <Method String getString(int)>
    //   69  151:astore          6
    //   70  153:aload           6
    //   71  155:ldc1            #81  <String "done">
    //   72  157:aload_0         
    //   73  158:invokestatic    #87  <Method void el7rUtilities.messageBox(String, String, android.content.Context)>
    //   74  161:return          
    //   75  162:aload_1         
    //   76  163:ldc1            #89  <String "false">
    //   77  165:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   78  168:ifeq            35
    //   79  171:aload           4
    //   80  173:ldc1            #48  <String "removeAds">
    //   81  175:iconst_0        
    //   82  176:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //   83  181:pop             
    //   84  182:goto            35
    //   85  185:aload_2         
    //   86  186:ldc1            #89  <String "false">
    //   87  188:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
    //   88  191:ifeq            59
    //   89  194:aload           4
    //   90  196:ldc1            #56  <String "removeWatermark">
    //   91  198:iconst_0        
    //   92  199:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //   93  204:pop             
    //   94  205:goto            59
    //   95  208:aload_0         
    //   96  209:getfield        #62  <Field Button removeadsBtn>
    //   97  212:iconst_1        
    //   98  213:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   99  216:goto            84
    //  100  219:aload_0         
    //  101  220:getfield        #70  <Field Button removewatermarkBtn>
    //  102  223:iconst_1        
    //  103  224:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //  104  227:goto            101
    //  105  230:aload_3         
    //  106  231:ldc1            #91  <String "purchase">
    //  107  233:if_acmpne       153
    //  108  236:aload_0         
    //  109  237:ldc1            #92  <Int 0x7f0b0059>
    //  110  239:invokevirtual   #79  <Method String getString(int)>
    //  111  242:astore          6
    //  112  244:goto            153
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #95  <Method void el7rActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #96  <Int 0x7f04000d>
    //    4    7:ldc1            #97  <Int 0x7f040007>
    //    5    9:invokevirtual   #101 <Method void overridePendingTransition(int, int)>
    //    6   12:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #105 <Method void el7rActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #106 <Int 0x7f04000c>
    //    5    8:ldc1            #107 <Int 0x7f040006>
    //    6   10:invokevirtual   #101 <Method void overridePendingTransition(int, int)>
    //    7   13:aload_0         
    //    8   14:ldc1            #108 <Int 0x7f03001c>
    //    9   16:invokevirtual   #112 <Method void setContentView(int)>
    //   10   19:aload_0         
    //   11   20:invokevirtual   #116 <Method ActionBar getSupportActionBar()>
    //   12   23:iconst_1        
    //   13   24:invokevirtual   #121 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   14   27:aload_0         
    //   15   28:aload_0         
    //   16   29:ldc1            #123 <String "TextgramSettings">
    //   17   31:iconst_0        
    //   18   32:invokevirtual   #127 <Method SharedPreferences getSharedPreferences(String, int)>
    //   19   35:putfield        #32  <Field SharedPreferences settings>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:ldc1            #128 <Int 0x7f0b0054>
    //   23   42:invokevirtual   #79  <Method String getString(int)>
    //   24   45:invokevirtual   #132 <Method void setTitle(String)>
    //   25   48:aload_0         
    //   26   49:invokevirtual   #136 <Method Window getWindow()>
    //   27   52:iconst_3        
    //   28   53:invokevirtual   #141 <Method void Window.setSoftInputMode(int)>
    //   29   56:aload_0         
    //   30   57:aload_0         
    //   31   58:ldc1            #142 <Int 0x7f06004a>
    //   32   60:invokevirtual   #146 <Method View findViewById(int)>
    //   33   63:invokestatic    #152 <Method void AdUtilities.installAd(android.app.Activity, View)>
    //   34   66:aload_0         
    //   35   67:getfield        #156 <Field GoogleAnalyticsTracker tracker>
    //   36   70:ldc1            #158 <String "/GoProActivity">
    //   37   72:invokevirtual   #163 <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   38   75:aload_0         
    //   39   76:aload_0         
    //   40   77:ldc1            #164 <Int 0x7f06004c>
    //   41   79:invokevirtual   #146 <Method View findViewById(int)>
    //   42   82:checkcast       #64  <Class Button>
    //   43   85:putfield        #166 <Field Button fullversionBtn>
    //   44   88:aload_0         
    //   45   89:aload_0         
    //   46   90:ldc1            #167 <Int 0x7f06004d>
    //   47   92:invokevirtual   #146 <Method View findViewById(int)>
    //   48   95:checkcast       #64  <Class Button>
    //   49   98:putfield        #62  <Field Button removeadsBtn>
    //   50  101:aload_0         
    //   51  102:aload_0         
    //   52  103:ldc1            #168 <Int 0x7f06004e>
    //   53  105:invokevirtual   #146 <Method View findViewById(int)>
    //   54  108:checkcast       #64  <Class Button>
    //   55  111:putfield        #70  <Field Button removewatermarkBtn>
    //   56  114:aload_0         
    //   57  115:aload_0         
    //   58  116:ldc1            #169 <Int 0x7f06004f>
    //   59  118:invokevirtual   #146 <Method View findViewById(int)>
    //   60  121:checkcast       #64  <Class Button>
    //   61  124:putfield        #171 <Field Button goProBtn>
    //   62  127:aload_0         
    //   63  128:getfield        #171 <Field Button goProBtn>
    //   64  131:new             #173 <Class GoProActivity$1>
    //   65  134:dup             
    //   66  135:aload_0         
    //   67  136:invokespecial   #176 <Method void GoProActivity$1(GoProActivity)>
    //   68  139:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   69  142:aload_0         
    //   70  143:getfield        #32  <Field SharedPreferences settings>
    //   71  146:ldc1            #182 <String "fullVersion">
    //   72  148:iconst_0        
    //   73  149:invokeinterface #186 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   74  154:ifeq            165
    //   75  157:aload_0         
    //   76  158:getfield        #166 <Field Button fullversionBtn>
    //   77  161:iconst_0        
    //   78  162:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   79  165:aload_0         
    //   80  166:getfield        #32  <Field SharedPreferences settings>
    //   81  169:ldc1            #48  <String "removeAds">
    //   82  171:iconst_0        
    //   83  172:invokeinterface #186 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   84  177:ifeq            188
    //   85  180:aload_0         
    //   86  181:getfield        #62  <Field Button removeadsBtn>
    //   87  184:iconst_0        
    //   88  185:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   89  188:aload_0         
    //   90  189:getfield        #32  <Field SharedPreferences settings>
    //   91  192:ldc1            #56  <String "removeWatermark">
    //   92  194:iconst_0        
    //   93  195:invokeinterface #186 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   94  200:ifeq            211
    //   95  203:aload_0         
    //   96  204:getfield        #70  <Field Button removewatermarkBtn>
    //   97  207:iconst_0        
    //   98  208:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //   99  211:aload_0         
    //  100  212:getfield        #32  <Field SharedPreferences settings>
    //  101  215:ldc1            #48  <String "removeAds">
    //  102  217:iconst_0        
    //  103  218:invokeinterface #186 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //  104  223:ifeq            265
    //  105  226:aload_0         
    //  106  227:getfield        #32  <Field SharedPreferences settings>
    //  107  230:ldc1            #56  <String "removeWatermark">
    //  108  232:iconst_0        
    //  109  233:invokeinterface #186 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //  110  238:ifeq            265
    //  111  241:aload_0         
    //  112  242:getfield        #166 <Field Button fullversionBtn>
    //  113  245:iconst_0        
    //  114  246:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //  115  249:aload_0         
    //  116  250:getfield        #62  <Field Button removeadsBtn>
    //  117  253:iconst_0        
    //  118  254:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //  119  257:aload_0         
    //  120  258:getfield        #70  <Field Button removewatermarkBtn>
    //  121  261:iconst_0        
    //  122  262:invokevirtual   #68  <Method void Button.setEnabled(boolean)>
    //  123  265:aload_0         
    //  124  266:ldc1            #187 <Int 0x7f060050>
    //  125  268:invokevirtual   #146 <Method View findViewById(int)>
    //  126  271:checkcast       #189 <Class EditText>
    //  127  274:astore_2        
    //  128  275:aload_0         
    //  129  276:ldc1            #190 <Int 0x7f060051>
    //  130  278:invokevirtual   #146 <Method View findViewById(int)>
    //  131  281:checkcast       #64  <Class Button>
    //  132  284:new             #192 <Class GoProActivity$2>
    //  133  287:dup             
    //  134  288:aload_0         
    //  135  289:aload_2         
    //  136  290:invokespecial   #195 <Method void GoProActivity$2(GoProActivity, EditText)>
    //  137  293:invokevirtual   #180 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  138  296:return          
    }

    public void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #198 <Method void el7rActivity.onDestroy()>
    //    2    4:return          
    }

    String TAG;
    Button fullversionBtn;
    Button goProBtn;
    Handler handler;
    Button removeadsBtn;
    Button removewatermarkBtn;
    SharedPreferences settings;

    // Unreferenced inner class codeadore/textgram/GoProActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field GoProActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class Intent>
        //    1    3:dup             
        //    2    4:ldc1            #26  <String "android.intent.action.VIEW">
        //    3    6:ldc1            #28  <String "market://details?id=codeadore.textgrampro&referrer=utm_source%3DTextgram%2520Free%26utm_medium%3DMenu%2520Item%26utm_campaign%3DRemove%2520Ads%2520Menu%2520Item">
        //    4    8:invokestatic    #34  <Method Uri Uri.parse(String)>
        //    5   11:invokespecial   #37  <Method void Intent(String, Uri)>
        //    6   14:astore_2        
        //    7   15:aload_0         
        //    8   16:getfield        #17  <Field GoProActivity this$0>
        //    9   19:aload_2         
        //   10   20:invokevirtual   #41  <Method void GoProActivity.startActivity(Intent)>
        //   11   23:return          
        }

        final GoProActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/GoProActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field GoProActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field EditText val$promotionCodeET>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        static GoProActivity access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field GoProActivity this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #19  <Field GoProActivity this$0>
        //    5    4:areturn         
        }

        public void onClick(View view)
        {
        //    0    0:new             #30  <Class ProgressDialog>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #19  <Field GoProActivity this$0>
        //    4    8:getfield        #34  <Field el7rActivity GoProActivity.thisActivity>
        //    5   11:invokespecial   #37  <Method void ProgressDialog(android.content.Context)>
        //    6   14:astore_2        
        //    7   15:aload_2         
        //    8   16:aload_0         
        //    9   17:getfield        #19  <Field GoProActivity this$0>
        //   10   20:ldc1            #38  <Int 0x7f0b0033>
        //   11   22:invokevirtual   #42  <Method String GoProActivity.getString(int)>
        //   12   25:invokevirtual   #46  <Method void ProgressDialog.setMessage(CharSequence)>
        //   13   28:aload_2         
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #50  <Method void ProgressDialog.setCancelable(boolean)>
        //   16   33:aload_2         
        //   17   34:invokevirtual   #53  <Method void ProgressDialog.show()>
        //   18   37:new             #55  <Class Thread>
        //   19   40:dup             
        //   20   41:new             #57  <Class GoProActivity$2$1>
        //   21   44:dup             
        //   22   45:aload_0         
        //   23   46:aload_0         
        //   24   47:getfield        #21  <Field EditText val$promotionCodeET>
        //   25   50:aload_2         
        //   26   51:invokespecial   #60  <Method void GoProActivity$2$1(GoProActivity$2, EditText, ProgressDialog)>
        //   27   54:invokespecial   #63  <Method void Thread(Runnable)>
        //   28   57:invokevirtual   #66  <Method void Thread.start()>
        //   29   60:return          
        }

        final GoProActivity this$0;
        private final EditText val$promotionCodeET;

            static GoProActivity access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #19  <Field GoProActivity this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/GoProActivity$2$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field GoProActivity$2 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field EditText val$promotionCodeET>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field ProgressDialog val$dialog>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        static _cls2 access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field GoProActivity$2 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #21  <Field GoProActivity$2 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        // try 0 58 handler(s) 59
        //    0    0:new             #35  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:ldc1            #37  <String "http://www.codeadore.net/secure/tg_settings/promotion_code.php?code=">
        //    3    6:invokespecial   #40  <Method void StringBuilder(String)>
        //    4    9:aload_0         
        //    5   10:getfield        #23  <Field EditText val$promotionCodeET>
        //    6   13:invokevirtual   #46  <Method Editable EditText.getText()>
        //    7   16:invokeinterface #52  <Method String Editable.toString()>
        //    8   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
        //    9   24:invokevirtual   #57  <Method String StringBuilder.toString()>
        //   10   27:invokestatic    #63  <Method String el7rUtilities.geHTTPtContents(String)>
        //   11   30:astore_2        
        //   12   31:aload_0         
        //   13   32:getfield        #21  <Field GoProActivity$2 this$1>
        //   14   35:invokestatic    #66  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   15   38:getfield        #72  <Field Handler GoProActivity.handler>
        //   16   41:new             #74  <Class GoProActivity$2$1$1>
        //   17   44:dup             
        //   18   45:aload_0         
        //   19   46:aload_0         
        //   20   47:getfield        #25  <Field ProgressDialog val$dialog>
        //   21   50:aload_2         
        //   22   51:invokespecial   #77  <Method void GoProActivity$2$1$1(GoProActivity$2$1, ProgressDialog, String)>
        //   23   54:invokevirtual   #83  <Method boolean Handler.post(Runnable)>
        //   24   57:pop             
        //   25   58:return          
        // catch IOException
        //   26   59:astore_1        
        //   27   60:aload_1         
        //   28   61:invokevirtual   #86  <Method void IOException.printStackTrace()>
        //   29   64:return          
        }

        final _cls2 this$1;
        private final ProgressDialog val$dialog;
        private final EditText val$promotionCodeET;

            static _cls2 access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #21  <Field GoProActivity$2 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/GoProActivity$2$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field GoProActivity$2$1 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ProgressDialog val$dialog>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field String val$check>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ProgressDialog val$dialog>
        //    2    4:invokevirtual   #34  <Method void ProgressDialog.hide()>
        //    3    7:aload_0         
        //    4    8:getfield        #25  <Field String val$check>
        //    5   11:ldc1            #36  <String "INVALID">
        //    6   13:invokevirtual   #42  <Method boolean String.contains(CharSequence)>
        //    7   16:ifeq            50
        //    8   19:aload_0         
        //    9   20:getfield        #21  <Field GoProActivity$2$1 this$2>
        //   10   23:invokestatic    #46  <Method GoProActivity$2 GoProActivity$2$1.access$0(GoProActivity$2$1)>
        //   11   26:invokestatic    #51  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   12   29:ldc1            #52  <Int 0x7f0b0057>
        //   13   31:invokevirtual   #58  <Method String GoProActivity.getString(int)>
        //   14   34:ldc1            #60  <String "fail">
        //   15   36:aload_0         
        //   16   37:getfield        #21  <Field GoProActivity$2$1 this$2>
        //   17   40:invokestatic    #46  <Method GoProActivity$2 GoProActivity$2$1.access$0(GoProActivity$2$1)>
        //   18   43:invokestatic    #51  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   19   46:invokestatic    #66  <Method void el7rUtilities.messageBox(String, String, android.content.Context)>
        //   20   49:return          
        //   21   50:aload_0         
        //   22   51:getfield        #25  <Field String val$check>
        //   23   54:ldc1            #68  <String "VALID">
        //   24   56:invokevirtual   #42  <Method boolean String.contains(CharSequence)>
        //   25   59:ifeq            49
        //   26   62:iconst_0        
        //   27   63:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
        //   28   66:pop             
        //   29   67:iconst_0        
        //   30   68:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
        //   31   71:pop             
        // try 72 131 handler(s) 132
        //   32   72:new             #76  <Class JSONObject>
        //   33   75:dup             
        //   34   76:aload_0         
        //   35   77:getfield        #25  <Field String val$check>
        //   36   80:invokespecial   #79  <Method void JSONObject(String)>
        //   37   83:astore_3        
        //   38   84:aload_3         
        //   39   85:ldc1            #81  <String "removeAds">
        //   40   87:invokevirtual   #85  <Method boolean JSONObject.getBoolean(String)>
        //   41   90:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
        //   42   93:astore          5
        //   43   95:aload_3         
        //   44   96:ldc1            #87  <String "removeWatermark">
        //   45   98:invokevirtual   #85  <Method boolean JSONObject.getBoolean(String)>
        //   46  101:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
        //   47  104:astore          6
        //   48  106:aload_0         
        //   49  107:getfield        #21  <Field GoProActivity$2$1 this$2>
        //   50  110:invokestatic    #46  <Method GoProActivity$2 GoProActivity$2$1.access$0(GoProActivity$2$1)>
        //   51  113:invokestatic    #51  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   52  116:aload           6
        //   53  118:invokevirtual   #91  <Method String Boolean.toString()>
        //   54  121:aload           5
        //   55  123:invokevirtual   #91  <Method String Boolean.toString()>
        //   56  126:ldc1            #93  <String "promotion_code">
        //   57  128:invokevirtual   #97  <Method void GoProActivity.applyUpgrade(String, String, String)>
        //   58  131:return          
        // catch JSONException
        //   59  132:astore          4
        //   60  134:aload_0         
        //   61  135:getfield        #21  <Field GoProActivity$2$1 this$2>
        //   62  138:invokestatic    #46  <Method GoProActivity$2 GoProActivity$2$1.access$0(GoProActivity$2$1)>
        //   63  141:invokestatic    #51  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   64  144:ldc1            #52  <Int 0x7f0b0057>
        //   65  146:invokevirtual   #58  <Method String GoProActivity.getString(int)>
        //   66  149:ldc1            #60  <String "fail">
        //   67  151:aload_0         
        //   68  152:getfield        #21  <Field GoProActivity$2$1 this$2>
        //   69  155:invokestatic    #46  <Method GoProActivity$2 GoProActivity$2$1.access$0(GoProActivity$2$1)>
        //   70  158:invokestatic    #51  <Method GoProActivity GoProActivity$2.access$0(GoProActivity$2)>
        //   71  161:invokestatic    #66  <Method void el7rUtilities.messageBox(String, String, android.content.Context)>
        //   72  164:aload           4
        //   73  166:invokevirtual   #100 <Method void JSONException.printStackTrace()>
        //   74  169:return          
        }

        final _cls1 this$2;
        private final String val$check;
        private final ProgressDialog val$dialog;
    }

}
