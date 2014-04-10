// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import codeadore.textgram.custom_widgets.EmojisTabPageIndicator;

// Referenced classes of package codeadore.textgram:
//            StylingActivity, SuperSurface, SuperSurfaceItem, Utilities, 
//            Settings, EmojisPagerAdapter

public class EditTextActivity extends FragmentActivity
{

    public EditTextActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void FragmentActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #20  <String "EditTextActivity">
    //    4    7:putfield        #22  <Field String TAG>
    //    5   10:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #28  <Method void FragmentActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #32  <Method boolean requestWindowFeature(int)>
    //    6   10:pop             
    //    7   11:aload_0         
    //    8   12:ldc1            #33  <Int 0x7f030026>
    //    9   14:invokevirtual   #37  <Method void setContentView(int)>
    //   10   17:aload_0         
    //   11   18:new             #39  <Class Handler>
    //   12   21:dup             
    //   13   22:invokespecial   #40  <Method void Handler()>
    //   14   25:putfield        #42  <Field Handler UIHandler>
    //   15   28:aload_0         
    //   16   29:ldc1            #43  <Int 0x7f060080>
    //   17   31:invokevirtual   #47  <Method View findViewById(int)>
    //   18   34:checkcast       #49  <Class EditText>
    //   19   37:putstatic       #51  <Field EditText et>
    // try 40 92 handler(s) 174
    //   20   40:getstatic       #51  <Field EditText et>
    //   21   43:getstatic       #57  <Field SuperSurface StylingActivity.superSurface>
    //   22   46:invokevirtual   #63  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   23   49:invokevirtual   #69  <Method SpannableString SuperSurfaceItem.getText()>
    //   24   52:invokevirtual   #73  <Method void EditText.setText(CharSequence)>
    //   25   55:getstatic       #51  <Field EditText et>
    //   26   58:getstatic       #57  <Field SuperSurface StylingActivity.superSurface>
    //   27   61:invokevirtual   #63  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   28   64:invokevirtual   #77  <Method int SuperSurfaceItem.getTextGravity()>
    //   29   67:invokevirtual   #80  <Method void EditText.setGravity(int)>
    //   30   70:getstatic       #51  <Field EditText et>
    //   31   73:aload_0         
    //   32   74:invokevirtual   #84  <Method android.content.Context getApplicationContext()>
    //   33   77:getstatic       #57  <Field SuperSurface StylingActivity.superSurface>
    //   34   80:invokevirtual   #63  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   35   83:getfield        #87  <Field String SuperSurfaceItem.typeFacePath>
    //   36   86:invokestatic    #93  <Method android.graphics.Typeface Utilities.getTypefaceFromPath(android.content.Context, String)>
    //   37   89:invokevirtual   #97  <Method void EditText.setTypeface(android.graphics.Typeface)>
    //   38   92:aload_0         
    //   39   93:ldc1            #98  <Int 0x7f060083>
    //   40   95:invokevirtual   #47  <Method View findViewById(int)>
    //   41   98:checkcast       #100 <Class ImageButton>
    //   42  101:new             #102 <Class EditTextActivity$1>
    //   43  104:dup             
    //   44  105:aload_0         
    //   45  106:invokespecial   #105 <Method void EditTextActivity$1(EditTextActivity)>
    //   46  109:invokevirtual   #109 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   47  112:aload_0         
    //   48  113:ldc1            #110 <Int 0x7f060084>
    //   49  115:invokevirtual   #47  <Method View findViewById(int)>
    //   50  118:checkcast       #112 <Class Button>
    //   51  121:new             #114 <Class EditTextActivity$2>
    //   52  124:dup             
    //   53  125:aload_0         
    //   54  126:invokespecial   #115 <Method void EditTextActivity$2(EditTextActivity)>
    //   55  129:invokevirtual   #116 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   56  132:aload_0         
    //   57  133:aload_0         
    //   58  134:ldc1            #117 <Int 0x7f060082>
    //   59  136:invokevirtual   #47  <Method View findViewById(int)>
    //   60  139:checkcast       #100 <Class ImageButton>
    //   61  142:putfield        #119 <Field ImageButton smileysBtn>
    //   62  145:aload_0         
    //   63  146:aload_0         
    //   64  147:ldc1            #120 <Int 0x7f060085>
    //   65  149:invokevirtual   #47  <Method View findViewById(int)>
    //   66  152:checkcast       #122 <Class LinearLayout>
    //   67  155:putfield        #124 <Field LinearLayout smileysLL>
    //   68  158:aload_0         
    //   69  159:getfield        #119 <Field ImageButton smileysBtn>
    //   70  162:new             #126 <Class EditTextActivity$3>
    //   71  165:dup             
    //   72  166:aload_0         
    //   73  167:invokespecial   #127 <Method void EditTextActivity$3(EditTextActivity)>
    //   74  170:invokevirtual   #109 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   75  173:return          
    // catch Exception
    //   76  174:astore_3        
    //   77  175:aload_0         
    //   78  176:getfield        #22  <Field String TAG>
    //   79  179:ldc1            #129 <String "in setting et's text">
    //   80  181:invokestatic    #135 <Method int Log.e(String, String)>
    //   81  184:pop             
    //   82  185:goto            92
    }

    public void setupSmileys()
    {
    //    0    0:ldc1            #20  <String "EditTextActivity">
    //    1    2:putstatic       #141 <Field String Settings.currentEmojisActivity>
    //    2    5:aload_0         
    //    3    6:ldc1            #142 <Int 0x7f060088>
    //    4    8:invokevirtual   #47  <Method View findViewById(int)>
    //    5   11:checkcast       #144 <Class ViewPager>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:new             #146 <Class EmojisPagerAdapter>
    //    9   19:dup             
    //   10   20:aload_0         
    //   11   21:invokevirtual   #150 <Method android.support.v4.app.FragmentManager getSupportFragmentManager()>
    //   12   24:invokespecial   #153 <Method void EmojisPagerAdapter(android.support.v4.app.FragmentManager)>
    //   13   27:invokevirtual   #157 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   14   30:aload_0         
    //   15   31:ldc1            #158 <Int 0x7f060086>
    //   16   33:invokevirtual   #47  <Method View findViewById(int)>
    //   17   36:checkcast       #160 <Class EmojisTabPageIndicator>
    //   18   39:aload_1         
    //   19   40:invokevirtual   #164 <Method void EmojisTabPageIndicator.setViewPager(ViewPager)>
    //   20   43:aload_0         
    //   21   44:ldc1            #165 <Int 0x7f060087>
    //   22   46:invokevirtual   #47  <Method View findViewById(int)>
    //   23   49:checkcast       #100 <Class ImageButton>
    //   24   52:new             #167 <Class EditTextActivity$4>
    //   25   55:dup             
    //   26   56:aload_0         
    //   27   57:invokespecial   #168 <Method void EditTextActivity$4(EditTextActivity)>
    //   28   60:invokevirtual   #109 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   29   63:return          
    }

    protected void toggleEmojis(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            48
    //    2    4:aload_0         
    //    3    5:getfield        #124 <Field LinearLayout smileysLL>
    //    4    8:iconst_0        
    //    5    9:invokevirtual   #173 <Method void LinearLayout.setVisibility(int)>
    //    6   12:aload_0         
    //    7   13:ldc1            #174 <Int 0x7f04000c>
    //    8   15:invokestatic    #180 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //    9   18:astore_3        
    //   10   19:aload_0         
    //   11   20:getfield        #124 <Field LinearLayout smileysLL>
    //   12   23:aload_3         
    //   13   24:invokevirtual   #184 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   14   27:aload_0         
    //   15   28:ldc1            #186 <String "input_method">
    //   16   30:invokevirtual   #190 <Method Object getSystemService(String)>
    //   17   33:checkcast       #192 <Class InputMethodManager>
    //   18   36:getstatic       #51  <Field EditText et>
    //   19   39:invokevirtual   #196 <Method android.os.IBinder EditText.getWindowToken()>
    //   20   42:iconst_0        
    //   21   43:invokevirtual   #200 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
    //   22   46:pop             
    //   23   47:return          
    //   24   48:aload_0         
    //   25   49:ldc1            #201 <Int 0x7f040007>
    //   26   51:invokestatic    #180 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   27   54:astore_2        
    //   28   55:aload_0         
    //   29   56:getfield        #124 <Field LinearLayout smileysLL>
    //   30   59:aload_2         
    //   31   60:invokevirtual   #184 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   32   63:aload_0         
    //   33   64:getfield        #124 <Field LinearLayout smileysLL>
    //   34   67:bipush          8
    //   35   69:invokevirtual   #173 <Method void LinearLayout.setVisibility(int)>
    //   36   72:return          
    }

    public static EditText et;
    String TAG;
    Handler UIHandler;
    ImageButton smileysBtn;
    LinearLayout smileysLL;

    // Unreferenced inner class codeadore/textgram/EditTextActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field EditTextActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class android.app.AlertDialog$Builder>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field EditTextActivity this$0>
        //    4    8:invokespecial   #27  <Method void android.app.AlertDialog$Builder(android.content.Context)>
        //    5   11:ldc1            #28  <Int 0x1080027>
        //    6   13:invokevirtual   #32  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
        //    7   16:ldc1            #33  <Int 0x7f0b0043>
        //    8   18:invokevirtual   #36  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
        //    9   21:ldc1            #37  <Int 0x7f0b0044>
        //   10   23:invokevirtual   #40  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
        //   11   26:ldc1            #41  <Int 0x7f02007f>
        //   12   28:invokevirtual   #32  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
        //   13   31:ldc1            #42  <Int 0x7f0b0037>
        //   14   33:new             #44  <Class EditTextActivity$1$1>
        //   15   36:dup             
        //   16   37:aload_0         
        //   17   38:invokespecial   #47  <Method void EditTextActivity$1$1(EditTextActivity$1)>
        //   18   41:invokevirtual   #51  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
        //   19   44:ldc1            #52  <Int 0x7f0b0036>
        //   20   46:aconst_null     
        //   21   47:invokevirtual   #55  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
        //   22   50:invokevirtual   #59  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
        //   23   53:pop             
        //   24   54:return          
        }

        final EditTextActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/EditTextActivity$1$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field EditTextActivity$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:getstatic       #27  <Field EditText EditTextActivity.et>
        //    1    3:ldc1            #29  <String "">
        //    2    5:invokevirtual   #35  <Method void EditText.setText(CharSequence)>
        //    3    8:return          
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class codeadore/textgram/EditTextActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field EditTextActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:getstatic       #28  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #34  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:new             #36  <Class SpannableString>
        //    3    9:dup             
        //    4   10:getstatic       #40  <Field EditText EditTextActivity.et>
        //    5   13:invokevirtual   #46  <Method Editable EditText.getText()>
        //    6   16:invokespecial   #49  <Method void SpannableString(CharSequence)>
        //    7   19:invokevirtual   #55  <Method void SuperSurfaceItem.setText(SpannableString)>
        //    8   22:getstatic       #28  <Field SuperSurface StylingActivity.superSurface>
        //    9   25:invokevirtual   #34  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   10   28:invokevirtual   #58  <Method void SuperSurfaceItem.updateTextBitmap()>
        //   11   31:aload_0         
        //   12   32:getfield        #17  <Field EditTextActivity this$0>
        //   13   35:invokevirtual   #61  <Method void EditTextActivity.finish()>
        //   14   38:return          
        }

        final EditTextActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/EditTextActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field EditTextActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field EditTextActivity this$0>
        //    2    4:getfield        #26  <Field LinearLayout EditTextActivity.smileysLL>
        //    3    7:invokevirtual   #32  <Method int LinearLayout.getVisibility()>
        //    4   10:istore_2        
        //    5   11:iload_2         
        //    6   12:ifne            44
        //    7   15:aload_0         
        //    8   16:getfield        #17  <Field EditTextActivity this$0>
        //    9   19:iconst_0        
        //   10   20:invokevirtual   #36  <Method void EditTextActivity.toggleEmojis(boolean)>
        //   11   23:aload_0         
        //   12   24:getfield        #17  <Field EditTextActivity this$0>
        //   13   27:getfield        #26  <Field LinearLayout EditTextActivity.smileysLL>
        //   14   30:invokevirtual   #32  <Method int LinearLayout.getVisibility()>
        //   15   33:ifne            43
        //   16   36:aload_0         
        //   17   37:getfield        #17  <Field EditTextActivity this$0>
        //   18   40:invokevirtual   #39  <Method void EditTextActivity.setupSmileys()>
        //   19   43:return          
        //   20   44:iload_2         
        //   21   45:bipush          8
        //   22   47:icmpne          23
        //   23   50:aload_0         
        //   24   51:getfield        #17  <Field EditTextActivity this$0>
        //   25   54:iconst_1        
        //   26   55:invokevirtual   #36  <Method void EditTextActivity.toggleEmojis(boolean)>
        //   27   58:goto            23
        }

        final EditTextActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/EditTextActivity$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field EditTextActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:getstatic       #27  <Field EditText EditTextActivity.et>
        //    1    3:invokevirtual   #33  <Method int EditText.length()>
        //    2    6:ifle            55
        // try 9 55 handler(s) 56
        //    3    9:getstatic       #27  <Field EditText EditTextActivity.et>
        //    4   12:invokevirtual   #36  <Method int EditText.getSelectionStart()>
        //    5   15:istore_3        
        //    6   16:getstatic       #27  <Field EditText EditTextActivity.et>
        //    7   19:invokevirtual   #39  <Method int EditText.getSelectionEnd()>
        //    8   22:istore          4
        //    9   24:getstatic       #27  <Field EditText EditTextActivity.et>
        //   10   27:getstatic       #27  <Field EditText EditTextActivity.et>
        //   11   30:invokevirtual   #43  <Method Editable EditText.getText()>
        //   12   33:iload_3         
        //   13   34:iconst_1        
        //   14   35:isub            
        //   15   36:iload           4
        //   16   38:invokeinterface #49  <Method Editable Editable.delete(int, int)>
        //   17   43:invokevirtual   #53  <Method void EditText.setText(CharSequence)>
        //   18   46:getstatic       #27  <Field EditText EditTextActivity.et>
        //   19   49:iload_3         
        //   20   50:iconst_1        
        //   21   51:isub            
        //   22   52:invokevirtual   #57  <Method void EditText.setSelection(int)>
        //   23   55:return          
        // catch Exception
        //   24   56:astore_2        
        //   25   57:aload_2         
        //   26   58:invokevirtual   #60  <Method void Exception.printStackTrace()>
        //   27   61:return          
        }

        final EditTextActivity this$0;
    }

}
