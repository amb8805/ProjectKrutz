// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

public class FirstTimeActivity extends Activity
{

    public FirstTimeActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Activity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #18  <String "FirstTimeActivity">
    //    4    7:putfield        #20  <Field String TAG>
    //    5   10:aload_0         
    //    6   11:iconst_0        
    //    7   12:putfield        #22  <Field boolean fbClicked>
    //    8   15:aload_0         
    //    9   16:iconst_0        
    //   10   17:putfield        #24  <Field boolean twClicked>
    //   11   20:aload_0         
    //   12   21:iconst_0        
    //   13   22:putfield        #26  <Field boolean igClicked>
    //   14   25:return          
    }

    public void checkIfDone()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field boolean fbClicked>
    //    2    4:ifeq            25
    //    3    7:aload_0         
    //    4    8:getfield        #24  <Field boolean twClicked>
    //    5   11:ifeq            25
    //    6   14:aload_0         
    //    7   15:getfield        #26  <Field boolean igClicked>
    //    8   18:ifeq            25
    // try 21 25 handler(s) 26
    //    9   21:aload_0         
    //   10   22:invokevirtual   #32  <Method void finish()>
    //   11   25:return          
    // catch Exception
    //   12   26:astore_1        
    //   13   27:aload_0         
    //   14   28:getfield        #20  <Field String TAG>
    //   15   31:new             #34  <Class StringBuilder>
    //   16   34:dup             
    //   17   35:ldc1            #36  <String "in checkIfDone(): ">
    //   18   37:invokespecial   #39  <Method void StringBuilder(String)>
    //   19   40:aload_1         
    //   20   41:invokevirtual   #43  <Method String Exception.toString()>
    //   21   44:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
    //   22   47:invokevirtual   #48  <Method String StringBuilder.toString()>
    //   23   50:invokestatic    #54  <Method int Log.e(String, String)>
    //   24   53:pop             
    //   25   54:return          
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
    //    0    0:new             #58  <Class Rect>
    //    1    3:dup             
    //    2    4:invokespecial   #59  <Method void Rect()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:invokevirtual   #63  <Method Window getWindow()>
    //    6   12:invokevirtual   #69  <Method View Window.getDecorView()>
    //    7   15:aload_2         
    //    8   16:invokevirtual   #75  <Method void View.getHitRect(Rect)>
    //    9   19:aload_2         
    //   10   20:aload_1         
    //   11   21:invokevirtual   #81  <Method float MotionEvent.getX()>
    //   12   24:f2i             
    //   13   25:aload_1         
    //   14   26:invokevirtual   #84  <Method float MotionEvent.getY()>
    //   15   29:f2i             
    //   16   30:invokevirtual   #88  <Method boolean Rect.contains(int, int)>
    //   17   33:ifne            38
    //   18   36:iconst_0        
    //   19   37:ireturn         
    //   20   38:aload_0         
    //   21   39:aload_1         
    //   22   40:invokespecial   #90  <Method boolean Activity.dispatchTouchEvent(MotionEvent)>
    //   23   43:ireturn         
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #94  <Method void Activity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #98  <Method boolean requestWindowFeature(int)>
    //    6   10:pop             
    //    7   11:aload_0         
    //    8   12:ldc1            #99  <Int 0x7f030028>
    //    9   14:invokevirtual   #103 <Method void setContentView(int)>
    //   10   17:aload_0         
    //   11   18:ldc1            #104 <Int 0x7f06008c>
    //   12   20:invokevirtual   #108 <Method View findViewById(int)>
    //   13   23:checkcast       #110 <Class Button>
    //   14   26:astore_3        
    //   15   27:aload_0         
    //   16   28:ldc1            #111 <Int 0x7f06008d>
    //   17   30:invokevirtual   #108 <Method View findViewById(int)>
    //   18   33:checkcast       #110 <Class Button>
    //   19   36:astore          4
    //   20   38:aload_0         
    //   21   39:ldc1            #112 <Int 0x7f06008e>
    //   22   41:invokevirtual   #108 <Method View findViewById(int)>
    //   23   44:checkcast       #110 <Class Button>
    //   24   47:astore          5
    //   25   49:aload_3         
    //   26   50:new             #114 <Class FirstTimeActivity$1>
    //   27   53:dup             
    //   28   54:aload_0         
    //   29   55:invokespecial   #117 <Method void FirstTimeActivity$1(FirstTimeActivity)>
    //   30   58:invokevirtual   #121 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   31   61:aload           4
    //   32   63:new             #123 <Class FirstTimeActivity$2>
    //   33   66:dup             
    //   34   67:aload_0         
    //   35   68:invokespecial   #124 <Method void FirstTimeActivity$2(FirstTimeActivity)>
    //   36   71:invokevirtual   #121 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   37   74:aload           5
    //   38   76:new             #126 <Class FirstTimeActivity$3>
    //   39   79:dup             
    //   40   80:aload_0         
    //   41   81:invokespecial   #127 <Method void FirstTimeActivity$3(FirstTimeActivity)>
    //   42   84:invokevirtual   #121 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   43   87:aload_0         
    //   44   88:ldc1            #128 <Int 0x7f06008f>
    //   45   90:invokevirtual   #108 <Method View findViewById(int)>
    //   46   93:checkcast       #110 <Class Button>
    //   47   96:new             #130 <Class FirstTimeActivity$4>
    //   48   99:dup             
    //   49  100:aload_0         
    //   50  101:invokespecial   #131 <Method void FirstTimeActivity$4(FirstTimeActivity)>
    //   51  104:invokevirtual   #121 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   52  107:return          
    }

    String TAG;
    boolean fbClicked;
    boolean igClicked;
    TextView tvTitle;
    boolean twClicked;

    // Unreferenced inner class codeadore/textgram/FirstTimeActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field FirstTimeActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field FirstTimeActivity this$0>
        //    2    4:new             #24  <Class Intent>
        //    3    7:dup             
        //    4    8:ldc1            #26  <String "android.intent.action.VIEW">
        //    5   10:ldc1            #28  <String "http://www.instagram.com/TextgramOfficial">
        //    6   12:invokestatic    #34  <Method Uri Uri.parse(String)>
        //    7   15:invokespecial   #37  <Method void Intent(String, Uri)>
        //    8   18:invokevirtual   #41  <Method void FirstTimeActivity.startActivity(Intent)>
        //    9   21:aload_0         
        //   10   22:getfield        #17  <Field FirstTimeActivity this$0>
        //   11   25:iconst_1        
        //   12   26:putfield        #45  <Field boolean FirstTimeActivity.igClicked>
        //   13   29:aload_0         
        //   14   30:getfield        #17  <Field FirstTimeActivity this$0>
        //   15   33:invokevirtual   #48  <Method void FirstTimeActivity.checkIfDone()>
        //   16   36:return          
        }

        final FirstTimeActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/FirstTimeActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field FirstTimeActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field FirstTimeActivity this$0>
        //    2    4:new             #24  <Class Intent>
        //    3    7:dup             
        //    4    8:ldc1            #26  <String "android.intent.action.VIEW">
        //    5   10:ldc1            #28  <String "http://www.facebook.com/Textgram">
        //    6   12:invokestatic    #34  <Method Uri Uri.parse(String)>
        //    7   15:invokespecial   #37  <Method void Intent(String, Uri)>
        //    8   18:invokevirtual   #41  <Method void FirstTimeActivity.startActivity(Intent)>
        //    9   21:aload_0         
        //   10   22:getfield        #17  <Field FirstTimeActivity this$0>
        //   11   25:iconst_1        
        //   12   26:putfield        #45  <Field boolean FirstTimeActivity.fbClicked>
        //   13   29:aload_0         
        //   14   30:getfield        #17  <Field FirstTimeActivity this$0>
        //   15   33:invokevirtual   #48  <Method void FirstTimeActivity.checkIfDone()>
        //   16   36:return          
        }

        final FirstTimeActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/FirstTimeActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field FirstTimeActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 26 handler(s) 42
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field FirstTimeActivity this$0>
        //    2    4:new             #26  <Class Intent>
        //    3    7:dup             
        //    4    8:ldc1            #28  <String "android.intent.action.VIEW">
        //    5   10:ldc1            #30  <String "twitter://user?screen_name=">
        //    6   12:ldc1            #32  <String "textgram">
        //    7   14:invokevirtual   #38  <Method String String.concat(String)>
        //    8   17:invokestatic    #44  <Method Uri Uri.parse(String)>
        //    9   20:invokespecial   #47  <Method void Intent(String, Uri)>
        //   10   23:invokevirtual   #51  <Method void FirstTimeActivity.startActivity(Intent)>
        //   11   26:aload_0         
        //   12   27:getfield        #17  <Field FirstTimeActivity this$0>
        //   13   30:iconst_1        
        //   14   31:putfield        #55  <Field boolean FirstTimeActivity.twClicked>
        //   15   34:aload_0         
        //   16   35:getfield        #17  <Field FirstTimeActivity this$0>
        //   17   38:invokevirtual   #58  <Method void FirstTimeActivity.checkIfDone()>
        //   18   41:return          
        // catch Exception
        //   19   42:astore_2        
        //   20   43:aload_0         
        //   21   44:getfield        #17  <Field FirstTimeActivity this$0>
        //   22   47:new             #26  <Class Intent>
        //   23   50:dup             
        //   24   51:ldc1            #28  <String "android.intent.action.VIEW">
        //   25   53:ldc1            #60  <String "http://www.twitter.com/textgram">
        //   26   55:invokestatic    #44  <Method Uri Uri.parse(String)>
        //   27   58:invokespecial   #47  <Method void Intent(String, Uri)>
        //   28   61:invokevirtual   #51  <Method void FirstTimeActivity.startActivity(Intent)>
        //   29   64:goto            26
        }

        final FirstTimeActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/FirstTimeActivity$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field FirstTimeActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field FirstTimeActivity this$0>
        //    2    4:invokevirtual   #25  <Method void FirstTimeActivity.finish()>
        //    3    7:return          
        }

        final FirstTimeActivity this$0;
    }

}
