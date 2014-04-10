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
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import codeadore.textgram.custom_widgets.EmojisTabPageIndicator;

// Referenced classes of package codeadore.textgram:
//            Settings, EmojisPagerAdapter, SuperSurfaceItem, StylingActivity, 
//            SuperSurface

public class CreateTextboxActivity extends FragmentActivity
{

    public CreateTextboxActivity()
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
    //    2    2:invokespecial   #26  <Method void FragmentActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #30  <Method boolean requestWindowFeature(int)>
    //    6   10:pop             
    //    7   11:aload_0         
    //    8   12:ldc1            #31  <Int 0x7f030026>
    //    9   14:invokevirtual   #35  <Method void setContentView(int)>
    //   10   17:aload_0         
    //   11   18:new             #37  <Class Handler>
    //   12   21:dup             
    //   13   22:invokespecial   #38  <Method void Handler()>
    //   14   25:putfield        #40  <Field Handler UIHandler>
    //   15   28:aload_0         
    //   16   29:ldc1            #41  <Int 0x7f060080>
    //   17   31:invokevirtual   #45  <Method View findViewById(int)>
    //   18   34:checkcast       #47  <Class EditText>
    //   19   37:putstatic       #49  <Field EditText et>
    //   20   40:aload_0         
    //   21   41:ldc1            #50  <Int 0x7f060083>
    //   22   43:invokevirtual   #45  <Method View findViewById(int)>
    //   23   46:checkcast       #52  <Class ImageButton>
    //   24   49:new             #54  <Class CreateTextboxActivity$1>
    //   25   52:dup             
    //   26   53:aload_0         
    //   27   54:invokespecial   #57  <Method void CreateTextboxActivity$1(CreateTextboxActivity)>
    //   28   57:invokevirtual   #61  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   29   60:aload_0         
    //   30   61:ldc1            #62  <Int 0x7f060084>
    //   31   63:invokevirtual   #45  <Method View findViewById(int)>
    //   32   66:checkcast       #64  <Class Button>
    //   33   69:astore_3        
    //   34   70:aload_3         
    //   35   71:aload_0         
    //   36   72:ldc1            #65  <Int 0x7f0b005e>
    //   37   74:invokevirtual   #69  <Method String getString(int)>
    //   38   77:invokevirtual   #73  <Method void Button.setText(CharSequence)>
    //   39   80:aload_3         
    //   40   81:new             #75  <Class CreateTextboxActivity$2>
    //   41   84:dup             
    //   42   85:aload_0         
    //   43   86:invokespecial   #76  <Method void CreateTextboxActivity$2(CreateTextboxActivity)>
    //   44   89:invokevirtual   #77  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   45   92:aload_0         
    //   46   93:aload_0         
    //   47   94:ldc1            #78  <Int 0x7f060082>
    //   48   96:invokevirtual   #45  <Method View findViewById(int)>
    //   49   99:checkcast       #52  <Class ImageButton>
    //   50  102:putfield        #80  <Field ImageButton smileysBtn>
    //   51  105:aload_0         
    //   52  106:aload_0         
    //   53  107:ldc1            #81  <Int 0x7f060085>
    //   54  109:invokevirtual   #45  <Method View findViewById(int)>
    //   55  112:checkcast       #83  <Class LinearLayout>
    //   56  115:putfield        #85  <Field LinearLayout smileysLL>
    //   57  118:aload_0         
    //   58  119:getfield        #80  <Field ImageButton smileysBtn>
    //   59  122:new             #87  <Class CreateTextboxActivity$3>
    //   60  125:dup             
    //   61  126:aload_0         
    //   62  127:invokespecial   #88  <Method void CreateTextboxActivity$3(CreateTextboxActivity)>
    //   63  130:invokevirtual   #61  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   64  133:aload_0         
    //   65  134:invokevirtual   #91  <Method void setupSmileys()>
    //   66  137:return          
    }

    public void setupSmileys()
    {
    //    0    0:ldc1            #93  <String "CreateTextboxActivity">
    //    1    2:putstatic       #98  <Field String Settings.currentEmojisActivity>
    //    2    5:aload_0         
    //    3    6:ldc1            #99  <Int 0x7f060088>
    //    4    8:invokevirtual   #45  <Method View findViewById(int)>
    //    5   11:checkcast       #101 <Class ViewPager>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:new             #103 <Class EmojisPagerAdapter>
    //    9   19:dup             
    //   10   20:aload_0         
    //   11   21:invokevirtual   #107 <Method android.support.v4.app.FragmentManager getSupportFragmentManager()>
    //   12   24:invokespecial   #110 <Method void EmojisPagerAdapter(android.support.v4.app.FragmentManager)>
    //   13   27:invokevirtual   #114 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   14   30:aload_0         
    //   15   31:ldc1            #115 <Int 0x7f060086>
    //   16   33:invokevirtual   #45  <Method View findViewById(int)>
    //   17   36:checkcast       #117 <Class EmojisTabPageIndicator>
    //   18   39:aload_1         
    //   19   40:invokevirtual   #121 <Method void EmojisTabPageIndicator.setViewPager(ViewPager)>
    //   20   43:aload_0         
    //   21   44:ldc1            #122 <Int 0x7f060087>
    //   22   46:invokevirtual   #45  <Method View findViewById(int)>
    //   23   49:checkcast       #52  <Class ImageButton>
    //   24   52:new             #124 <Class CreateTextboxActivity$4>
    //   25   55:dup             
    //   26   56:aload_0         
    //   27   57:invokespecial   #125 <Method void CreateTextboxActivity$4(CreateTextboxActivity)>
    //   28   60:invokevirtual   #61  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   29   63:return          
    }

    protected void toggleEmojis(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            48
    //    2    4:aload_0         
    //    3    5:getfield        #85  <Field LinearLayout smileysLL>
    //    4    8:iconst_0        
    //    5    9:invokevirtual   #130 <Method void LinearLayout.setVisibility(int)>
    //    6   12:aload_0         
    //    7   13:ldc1            #131 <Int 0x7f04000c>
    //    8   15:invokestatic    #137 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //    9   18:astore_3        
    //   10   19:aload_0         
    //   11   20:getfield        #85  <Field LinearLayout smileysLL>
    //   12   23:aload_3         
    //   13   24:invokevirtual   #141 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   14   27:aload_0         
    //   15   28:ldc1            #143 <String "input_method">
    //   16   30:invokevirtual   #147 <Method Object getSystemService(String)>
    //   17   33:checkcast       #149 <Class InputMethodManager>
    //   18   36:getstatic       #49  <Field EditText et>
    //   19   39:invokevirtual   #153 <Method android.os.IBinder EditText.getWindowToken()>
    //   20   42:iconst_0        
    //   21   43:invokevirtual   #157 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
    //   22   46:pop             
    //   23   47:return          
    //   24   48:aload_0         
    //   25   49:ldc1            #158 <Int 0x7f040007>
    //   26   51:invokestatic    #137 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   27   54:astore_2        
    //   28   55:aload_0         
    //   29   56:getfield        #85  <Field LinearLayout smileysLL>
    //   30   59:aload_2         
    //   31   60:invokevirtual   #141 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   32   63:aload_0         
    //   33   64:getfield        #85  <Field LinearLayout smileysLL>
    //   34   67:bipush          8
    //   35   69:invokevirtual   #130 <Method void LinearLayout.setVisibility(int)>
    //   36   72:return          
    }

    public static EditText et;
    String TAG;
    Handler UIHandler;
    ImageButton smileysBtn;
    LinearLayout smileysLL;

    // Unreferenced inner class codeadore/textgram/CreateTextboxActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CreateTextboxActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class android.app.AlertDialog$Builder>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field CreateTextboxActivity this$0>
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
        //   14   33:new             #44  <Class CreateTextboxActivity$1$1>
        //   15   36:dup             
        //   16   37:aload_0         
        //   17   38:invokespecial   #47  <Method void CreateTextboxActivity$1$1(CreateTextboxActivity$1)>
        //   18   41:invokevirtual   #51  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
        //   19   44:ldc1            #52  <Int 0x7f0b0036>
        //   20   46:aconst_null     
        //   21   47:invokevirtual   #55  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
        //   22   50:invokevirtual   #59  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
        //   23   53:pop             
        //   24   54:return          
        }

        final CreateTextboxActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/CreateTextboxActivity$1$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CreateTextboxActivity$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //    1    3:ldc1            #29  <String "">
        //    2    5:invokevirtual   #35  <Method void EditText.setText(CharSequence)>
        //    3    8:return          
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class codeadore/textgram/CreateTextboxActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CreateTextboxActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class SuperSurfaceItem>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void SuperSurfaceItem()>
        //    3    7:astore_2        
        //    4    8:aload_2         
        //    5    9:new             #27  <Class SpannableString>
        //    6   12:dup             
        //    7   13:getstatic       #31  <Field EditText CreateTextboxActivity.et>
        //    8   16:invokevirtual   #37  <Method Editable EditText.getText()>
        //    9   19:invokespecial   #40  <Method void SpannableString(CharSequence)>
        //   10   22:putfield        #44  <Field SpannableString SuperSurfaceItem.text>
        //   11   25:getstatic       #50  <Field android.content.Context StylingActivity.c>
        //   12   28:checkcast       #46  <Class StylingActivity>
        //   13   31:astore_3        
        //   14   32:aload_2         
        //   15   33:ldc1            #51  <String "text">
        //   16   35:putfield        #55  <Field String SuperSurfaceItem.type>
        //   17   38:aload_2         
        //   18   39:getstatic       #59  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //   19   42:getfield        #62  <Field String SuperSurfaceItem.textColor>
        //   20   45:putfield        #62  <Field String SuperSurfaceItem.textColor>
        //   21   48:aload_2         
        //   22   49:ldc1            #63  <Float 40F>
        //   23   51:putfield        #67  <Field float SuperSurfaceItem.textSize>
        //   24   54:aload_2         
        //   25   55:ldc1            #68  <Float 300F>
        //   26   57:putfield        #71  <Field float SuperSurfaceItem.width>
        //   27   60:aload_2         
        //   28   61:ldc1            #72  <Float 200F>
        //   29   63:putfield        #75  <Field float SuperSurfaceItem.height>
        //   30   66:aload_2         
        //   31   67:iconst_1        
        //   32   68:putfield        #79  <Field boolean SuperSurfaceItem.selected>
        //   33   71:aload_2         
        //   34   72:aload_3         
        //   35   73:invokevirtual   #83  <Method void SuperSurfaceItem.setup(StylingActivity)>
        //   36   76:aload_2         
        //   37   77:invokevirtual   #86  <Method void SuperSurfaceItem.updateTextBitmap()>
        //   38   80:getstatic       #90  <Field SuperSurface StylingActivity.superSurface>
        //   39   83:aload_2         
        //   40   84:invokevirtual   #96  <Method void SuperSurface.addItem(SuperSurfaceItem)>
        //   41   87:getstatic       #90  <Field SuperSurface StylingActivity.superSurface>
        //   42   90:aload_2         
        //   43   91:putfield        #99  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //   44   94:aload_0         
        //   45   95:getfield        #17  <Field CreateTextboxActivity this$0>
        //   46   98:invokevirtual   #102 <Method void CreateTextboxActivity.finish()>
        //   47  101:return          
        }

        final CreateTextboxActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/CreateTextboxActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CreateTextboxActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CreateTextboxActivity this$0>
        //    2    4:getfield        #26  <Field LinearLayout CreateTextboxActivity.smileysLL>
        //    3    7:invokevirtual   #32  <Method int LinearLayout.getVisibility()>
        //    4   10:istore_2        
        //    5   11:iload_2         
        //    6   12:ifne            24
        //    7   15:aload_0         
        //    8   16:getfield        #17  <Field CreateTextboxActivity this$0>
        //    9   19:iconst_0        
        //   10   20:invokevirtual   #36  <Method void CreateTextboxActivity.toggleEmojis(boolean)>
        //   11   23:return          
        //   12   24:iload_2         
        //   13   25:bipush          8
        //   14   27:icmpne          23
        //   15   30:aload_0         
        //   16   31:getfield        #17  <Field CreateTextboxActivity this$0>
        //   17   34:iconst_1        
        //   18   35:invokevirtual   #36  <Method void CreateTextboxActivity.toggleEmojis(boolean)>
        //   19   38:return          
        }

        final CreateTextboxActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/CreateTextboxActivity$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CreateTextboxActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //    1    3:invokevirtual   #33  <Method int EditText.length()>
        //    2    6:ifle            55
        // try 9 55 handler(s) 56
        //    3    9:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //    4   12:invokevirtual   #36  <Method int EditText.getSelectionStart()>
        //    5   15:istore_3        
        //    6   16:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //    7   19:invokevirtual   #39  <Method int EditText.getSelectionEnd()>
        //    8   22:istore          4
        //    9   24:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //   10   27:getstatic       #27  <Field EditText CreateTextboxActivity.et>
        //   11   30:invokevirtual   #43  <Method Editable EditText.getText()>
        //   12   33:iload_3         
        //   13   34:iconst_1        
        //   14   35:isub            
        //   15   36:iload           4
        //   16   38:invokeinterface #49  <Method Editable Editable.delete(int, int)>
        //   17   43:invokevirtual   #53  <Method void EditText.setText(CharSequence)>
        //   18   46:getstatic       #27  <Field EditText CreateTextboxActivity.et>
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

        final CreateTextboxActivity this$0;
    }

}
