// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Dialog;
import android.content.*;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.*;

// Referenced classes of package codeadore.textgram:
//            Settings

public class AppRater
{

    public AppRater()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Object()>
    //    2    4:return          
    }

    public static void app_launched(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #24  <String "apprater">
    //    2    3:iconst_0        
    //    3    4:invokevirtual   #30  <Method SharedPreferences Context.getSharedPreferences(String, int)>
    //    4    7:astore_1        
    //    5    8:aload_1         
    //    6    9:ldc1            #32  <String "dontshowagain">
    //    7   11:iconst_0        
    //    8   12:invokeinterface #38  <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //    9   17:ifeq            21
    //   10   20:return          
    //   11   21:aload_1         
    //   12   22:invokeinterface #42  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //   13   27:astore_2        
    //   14   28:lconst_1        
    //   15   29:aload_1         
    //   16   30:ldc1            #44  <String "launch_count">
    //   17   32:lconst_0        
    //   18   33:invokeinterface #48  <Method long SharedPreferences.getLong(String, long)>
    //   19   38:ladd            
    //   20   39:lstore_3        
    //   21   40:aload_2         
    //   22   41:ldc1            #44  <String "launch_count">
    //   23   43:lload_3         
    //   24   44:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
    //   25   49:pop             
    //   26   50:aload_1         
    //   27   51:ldc1            #56  <String "date_firstlaunch">
    //   28   53:lconst_0        
    //   29   54:invokeinterface #48  <Method long SharedPreferences.getLong(String, long)>
    //   30   59:invokestatic    #62  <Method Long Long.valueOf(long)>
    //   31   62:astore          6
    //   32   64:aload           6
    //   33   66:invokevirtual   #66  <Method long Long.longValue()>
    //   34   69:lconst_0        
    //   35   70:lcmp            
    //   36   71:ifne            96
    //   37   74:invokestatic    #71  <Method long System.currentTimeMillis()>
    //   38   77:invokestatic    #62  <Method Long Long.valueOf(long)>
    //   39   80:astore          6
    //   40   82:aload_2         
    //   41   83:ldc1            #56  <String "date_firstlaunch">
    //   42   85:aload           6
    //   43   87:invokevirtual   #66  <Method long Long.longValue()>
    //   44   90:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
    //   45   95:pop             
    //   46   96:lload_3         
    //   47   97:ldc2w           #72  <Long 3L>
    //   48  100:lcmp            
    //   49  101:iflt            123
    //   50  104:invokestatic    #71  <Method long System.currentTimeMillis()>
    //   51  107:lconst_0        
    //   52  108:aload           6
    //   53  110:invokevirtual   #66  <Method long Long.longValue()>
    //   54  113:ladd            
    //   55  114:lcmp            
    //   56  115:iflt            123
    //   57  118:aload_0         
    //   58  119:aload_2         
    //   59  120:invokestatic    #77  <Method void showRateDialog(Context, android.content.SharedPreferences$Editor)>
    //   60  123:aload_2         
    //   61  124:invokeinterface #81  <Method boolean android.content.SharedPreferences$Editor.commit()>
    //   62  129:pop             
    //   63  130:return          
    }

    public static void showRateDialog(Context context, android.content.SharedPreferences.Editor editor)
    {
    //    0    0:new             #83  <Class Dialog>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #85  <Method void Dialog(Context)>
    //    4    8:astore_2        
    //    5    9:aload_2         
    //    6   10:ldc1            #87  <String "Rate Textgram">
    //    7   12:invokevirtual   #91  <Method void Dialog.setTitle(CharSequence)>
    //    8   15:aload_2         
    //    9   16:iconst_0        
    //   10   17:invokevirtual   #95  <Method void Dialog.setCancelable(boolean)>
    //   11   20:new             #97  <Class LinearLayout>
    //   12   23:dup             
    //   13   24:aload_0         
    //   14   25:invokespecial   #98  <Method void LinearLayout(Context)>
    //   15   28:astore_3        
    //   16   29:aload_3         
    //   17   30:iconst_1        
    //   18   31:invokevirtual   #102 <Method void LinearLayout.setOrientation(int)>
    //   19   34:aload_3         
    //   20   35:iconst_5        
    //   21   36:iconst_5        
    //   22   37:iconst_5        
    //   23   38:iconst_5        
    //   24   39:invokevirtual   #106 <Method void LinearLayout.setPadding(int, int, int, int)>
    //   25   42:new             #108 <Class TextView>
    //   26   45:dup             
    //   27   46:aload_0         
    //   28   47:invokespecial   #109 <Method void TextView(Context)>
    //   29   50:astore          4
    //   30   52:aload           4
    //   31   54:ldc1            #111 <String "If you enjoy using Textgram, please take a moment to rate it. Thanks for your support!">
    //   32   56:invokevirtual   #114 <Method void TextView.setText(CharSequence)>
    //   33   59:aload           4
    //   34   61:ldc1            #115 <Float 20F>
    //   35   63:invokevirtual   #119 <Method void TextView.setTextSize(float)>
    //   36   66:aload           4
    //   37   68:iconst_4        
    //   38   69:iconst_4        
    //   39   70:iconst_4        
    //   40   71:bipush          10
    //   41   73:invokevirtual   #120 <Method void TextView.setPadding(int, int, int, int)>
    //   42   76:aload_3         
    //   43   77:aload           4
    //   44   79:invokevirtual   #124 <Method void LinearLayout.addView(View)>
    //   45   82:new             #97  <Class LinearLayout>
    //   46   85:dup             
    //   47   86:aload_0         
    //   48   87:invokespecial   #98  <Method void LinearLayout(Context)>
    //   49   90:astore          5
    //   50   92:aload           5
    //   51   94:iconst_0        
    //   52   95:invokevirtual   #102 <Method void LinearLayout.setOrientation(int)>
    //   53   98:new             #126 <Class Button>
    //   54  101:dup             
    //   55  102:aload_0         
    //   56  103:invokespecial   #127 <Method void Button(Context)>
    //   57  106:astore          6
    //   58  108:aload           6
    //   59  110:ldc1            #129 <String "Rate">
    //   60  112:invokevirtual   #130 <Method void Button.setText(CharSequence)>
    //   61  115:aload           6
    //   62  117:ldc1            #132 <String "#989A69">
    //   63  119:invokestatic    #138 <Method int Color.parseColor(String)>
    //   64  122:invokevirtual   #141 <Method void Button.setTextColor(int)>
    //   65  125:aload           6
    //   66  127:new             #143 <Class AppRater$1>
    //   67  130:dup             
    //   68  131:aload_0         
    //   69  132:aload_2         
    //   70  133:invokespecial   #146 <Method void AppRater$1(Context, Dialog)>
    //   71  136:invokevirtual   #150 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   72  139:aload           5
    //   73  141:aload           6
    //   74  143:invokevirtual   #124 <Method void LinearLayout.addView(View)>
    //   75  146:new             #126 <Class Button>
    //   76  149:dup             
    //   77  150:aload_0         
    //   78  151:invokespecial   #127 <Method void Button(Context)>
    //   79  154:astore          7
    //   80  156:aload           7
    //   81  158:ldc1            #152 <String "Later">
    //   82  160:invokevirtual   #130 <Method void Button.setText(CharSequence)>
    //   83  163:aload           7
    //   84  165:new             #154 <Class AppRater$2>
    //   85  168:dup             
    //   86  169:aload_2         
    //   87  170:invokespecial   #157 <Method void AppRater$2(Dialog)>
    //   88  173:invokevirtual   #150 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   89  176:aload           5
    //   90  178:aload           7
    //   91  180:invokevirtual   #124 <Method void LinearLayout.addView(View)>
    //   92  183:new             #126 <Class Button>
    //   93  186:dup             
    //   94  187:aload_0         
    //   95  188:invokespecial   #127 <Method void Button(Context)>
    //   96  191:astore          8
    //   97  193:aload           8
    //   98  195:ldc1            #159 <String "No, thanks">
    //   99  197:invokevirtual   #130 <Method void Button.setText(CharSequence)>
    //  100  200:aload           8
    //  101  202:new             #161 <Class AppRater$3>
    //  102  205:dup             
    //  103  206:aload_1         
    //  104  207:aload_2         
    //  105  208:invokespecial   #164 <Method void AppRater$3(android.content.SharedPreferences$Editor, Dialog)>
    //  106  211:invokevirtual   #150 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  107  214:aload           5
    //  108  216:aload           8
    //  109  218:invokevirtual   #124 <Method void LinearLayout.addView(View)>
    //  110  221:aload_3         
    //  111  222:aload           5
    //  112  224:invokevirtual   #124 <Method void LinearLayout.addView(View)>
    //  113  227:aload_2         
    //  114  228:aload_3         
    //  115  229:invokevirtual   #167 <Method void Dialog.setContentView(View)>
    //  116  232:aload_2         
    //  117  233:invokevirtual   #170 <Method void Dialog.show()>
    //  118  236:return          
    }

    private static final String APP_PNAME = "codeadore.textgram";
    private static final String APP_TITLE = "Textgram";
    private static final int DAYS_UNTIL_PROMPT = 0;
    private static final int LAUNCHES_UNTIL_PROMPT = 3;

    // Unreferenced inner class codeadore/textgram/AppRater$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field Context val$mContext>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Dialog val$dialog>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:ldc1            #28  <String "market://details?id=codeadore.textgram">
        //    1    2:astore_2        
        //    2    3:getstatic       #34  <Field String Settings.buildFor>
        //    3    6:ldc1            #36  <String "amazon_appstore">
        //    4    8:if_acmpne       14
        //    5   11:ldc1            #38  <String "http://www.amazon.com/gp/mas/dl/android?p=codeadore.textgram">
        //    6   13:astore_2        
        //    7   14:aload_0         
        //    8   15:getfield        #19  <Field Context val$mContext>
        //    9   18:new             #40  <Class Intent>
        //   10   21:dup             
        //   11   22:ldc1            #42  <String "android.intent.action.VIEW">
        //   12   24:aload_2         
        //   13   25:invokestatic    #48  <Method Uri Uri.parse(String)>
        //   14   28:invokespecial   #51  <Method void Intent(String, Uri)>
        //   15   31:invokevirtual   #57  <Method void Context.startActivity(Intent)>
        //   16   34:aload_0         
        //   17   35:getfield        #21  <Field Dialog val$dialog>
        //   18   38:invokevirtual   #62  <Method void Dialog.dismiss()>
        //   19   41:return          
        }

        private final Dialog val$dialog;
        private final Context val$mContext;
    }


    // Unreferenced inner class codeadore/textgram/AppRater$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field Dialog val$dialog>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field Dialog val$dialog>
        //    2    4:invokevirtual   #27  <Method void Dialog.dismiss()>
        //    3    7:return          
        }

        private final Dialog val$dialog;
    }


    // Unreferenced inner class codeadore/textgram/AppRater$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field android.content.SharedPreferences$Editor val$editor>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Dialog val$dialog>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.content.SharedPreferences$Editor val$editor>
        //    2    4:ifnull          30
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field android.content.SharedPreferences$Editor val$editor>
        //    5   11:ldc1            #28  <String "dontshowagain">
        //    6   13:iconst_1        
        //    7   14:invokeinterface #34  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
        //    8   19:pop             
        //    9   20:aload_0         
        //   10   21:getfield        #19  <Field android.content.SharedPreferences$Editor val$editor>
        //   11   24:invokeinterface #38  <Method boolean android.content.SharedPreferences$Editor.commit()>
        //   12   29:pop             
        //   13   30:aload_0         
        //   14   31:getfield        #21  <Field Dialog val$dialog>
        //   15   34:invokevirtual   #43  <Method void Dialog.dismiss()>
        //   16   37:return          
        }

        private final Dialog val$dialog;
        private final android.content.SharedPreferences.Editor val$editor;
    }

}
