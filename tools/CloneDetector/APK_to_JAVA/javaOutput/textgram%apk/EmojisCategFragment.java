// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.*;
import android.view.*;
import android.widget.*;
import codeadore.textgram.adapters.EmojisGridAdapter;
import java.io.File;
import java.io.IOException;

// Referenced classes of package codeadore.textgram:
//            Settings, MainActivity, EditTextActivity, CreateTextboxActivity

public class EmojisCategFragment extends Fragment
{

    public EmojisCategFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #18  <Field boolean smileysLoaded>
    //    5    9:aload_0         
    //    6   10:new             #20  <Class Handler>
    //    7   13:dup             
    //    8   14:invokespecial   #21  <Method void Handler()>
    //    9   17:putfield        #23  <Field Handler UIHandler>
    //   10   20:return          
    }

    public static Fragment newInstance(String s)
    {
    //    0    0:new             #2   <Class EmojisCategFragment>
    //    1    3:dup             
    //    2    4:invokespecial   #26  <Method void EmojisCategFragment()>
    //    3    7:astore_1        
    //    4    8:new             #28  <Class Bundle>
    //    5   11:dup             
    //    6   12:invokespecial   #29  <Method void Bundle()>
    //    7   15:astore_2        
    //    8   16:aload_2         
    //    9   17:ldc1            #31  <String "category">
    //   10   19:aload_0         
    //   11   20:invokevirtual   #35  <Method void Bundle.putString(String, String)>
    //   12   23:aload_1         
    //   13   24:aload_2         
    //   14   25:invokevirtual   #39  <Method void Fragment.setArguments(Bundle)>
    //   15   28:aload_1         
    //   16   29:areturn         
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #43  <Method void Fragment.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #47  <Method Bundle getArguments()>
    //    5    9:ldc1            #31  <String "category">
    //    6   11:invokevirtual   #51  <Method String Bundle.getString(String)>
    //    7   14:astore_2        
    //    8   15:aload_0         
    //    9   16:getfield        #53  <Field View view>
    //   10   19:ldc1            #54  <Int 0x7f060091>
    //   11   21:invokevirtual   #60  <Method View View.findViewById(int)>
    //   12   24:checkcast       #62  <Class ProgressBar>
    //   13   27:astore_3        
    //   14   28:aload_0         
    //   15   29:getfield        #53  <Field View view>
    //   16   32:ldc1            #63  <Int 0x7f060092>
    //   17   34:invokevirtual   #60  <Method View View.findViewById(int)>
    //   18   37:checkcast       #65  <Class GridView>
    //   19   40:astore          4
    //   20   42:aload_0         
    //   21   43:invokevirtual   #69  <Method android.support.v4.app.FragmentActivity getActivity()>
    //   22   46:astore          5
    //   23   48:aload_3         
    //   24   49:invokevirtual   #73  <Method int ProgressBar.getVisibility()>
    //   25   52:ifne            113
    //   26   55:aload_0         
    //   27   56:iconst_1        
    //   28   57:putfield        #18  <Field boolean smileysLoaded>
    //   29   60:new             #75  <Class EmojisCategFragment$1>
    //   30   63:dup             
    //   31   64:aload_0         
    //   32   65:aload           5
    //   33   67:aload_2         
    //   34   68:aload           4
    //   35   70:aload_3         
    //   36   71:invokespecial   #78  <Method void EmojisCategFragment$1(EmojisCategFragment, Activity, String, GridView, ProgressBar)>
    //   37   74:astore          6
    //   38   76:aload           4
    //   39   78:new             #80  <Class EmojisCategFragment$2>
    //   40   81:dup             
    //   41   82:aload_0         
    //   42   83:aload           5
    //   43   85:aload_2         
    //   44   86:invokespecial   #83  <Method void EmojisCategFragment$2(EmojisCategFragment, Activity, String)>
    //   45   89:invokevirtual   #87  <Method void GridView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   46   92:aload_0         
    //   47   93:getfield        #23  <Field Handler UIHandler>
    //   48   96:new             #89  <Class EmojisCategFragment$3>
    //   49   99:dup             
    //   50  100:aload_0         
    //   51  101:aload           6
    //   52  103:invokespecial   #92  <Method void EmojisCategFragment$3(EmojisCategFragment, Runnable)>
    //   53  106:ldc2w           #93  <Long 500L>
    //   54  109:invokevirtual   #98  <Method boolean Handler.postDelayed(Runnable, long)>
    //   55  112:pop             
    //   56  113:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #101 <Int 0x7f030029>
    //    3    4:aload_2         
    //    4    5:iconst_0        
    //    5    6:invokevirtual   #107 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    6    9:putfield        #53  <Field View view>
    //    7   12:aload_0         
    //    8   13:getfield        #53  <Field View view>
    //    9   16:areturn         
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #110 <Method void Fragment.onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #114 <Method void setUserVisibleHint(boolean)>
    //    6   10:return          
    }

    Handler UIHandler;
    EmojisGridAdapter emojisAdapter;
    boolean smileysLoaded;
    View view;

    // Unreferenced inner class codeadore/textgram/EmojisCategFragment$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field EmojisCategFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #27  <Field Activity val$activity>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #29  <Field String val$category>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #31  <Field GridView val$emojisGridView>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #33  <Field ProgressBar val$smileysPB>
        //   15   27:aload_0         
        //   16   28:invokespecial   #36  <Method void Object()>
        //   17   31:return          
        }

        static EmojisCategFragment access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field EmojisCategFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #25  <Field EmojisCategFragment this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field EmojisCategFragment this$0>
        //    2    4:getfield        #43  <Field Handler EmojisCategFragment.UIHandler>
        //    3    7:new             #45  <Class EmojisCategFragment$1$1>
        //    4   10:dup             
        //    5   11:aload_0         
        //    6   12:aload_0         
        //    7   13:getfield        #27  <Field Activity val$activity>
        //    8   16:aload_0         
        //    9   17:getfield        #29  <Field String val$category>
        //   10   20:aload_0         
        //   11   21:getfield        #31  <Field GridView val$emojisGridView>
        //   12   24:aload_0         
        //   13   25:getfield        #33  <Field ProgressBar val$smileysPB>
        //   14   28:invokespecial   #48  <Method void EmojisCategFragment$1$1(EmojisCategFragment$1, Activity, String, GridView, ProgressBar)>
        //   15   31:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
        //   16   34:pop             
        //   17   35:return          
        }

        final EmojisCategFragment this$0;
        private final Activity val$activity;
        private final String val$category;
        private final GridView val$emojisGridView;
        private final ProgressBar val$smileysPB;

            static EmojisCategFragment access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #25  <Field EmojisCategFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/EmojisCategFragment$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field EmojisCategFragment$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #27  <Field Activity val$activity>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #29  <Field String val$category>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #31  <Field GridView val$emojisGridView>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #33  <Field ProgressBar val$smileysPB>
        //   15   27:aload_0         
        //   16   28:invokespecial   #35  <Method void Object()>
        //   17   31:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field EmojisCategFragment$1 this$1>
        //    2    4:invokestatic    #39  <Method EmojisCategFragment EmojisCategFragment$1.access$0(EmojisCategFragment$1)>
        //    3    7:new             #41  <Class EmojisGridAdapter>
        //    4   10:dup             
        //    5   11:aload_0         
        //    6   12:getfield        #27  <Field Activity val$activity>
        //    7   15:aload_0         
        //    8   16:getfield        #29  <Field String val$category>
        //    9   19:aload_0         
        //   10   20:getfield        #27  <Field Activity val$activity>
        //   11   23:invokevirtual   #47  <Method android.view.WindowManager Activity.getWindowManager()>
        //   12   26:invokespecial   #50  <Method void EmojisGridAdapter(android.content.Context, String, android.view.WindowManager)>
        //   13   29:putfield        #56  <Field EmojisGridAdapter EmojisCategFragment.emojisAdapter>
        //   14   32:aload_0         
        //   15   33:getfield        #31  <Field GridView val$emojisGridView>
        //   16   36:aload_0         
        //   17   37:getfield        #25  <Field EmojisCategFragment$1 this$1>
        //   18   40:invokestatic    #39  <Method EmojisCategFragment EmojisCategFragment$1.access$0(EmojisCategFragment$1)>
        //   19   43:getfield        #56  <Field EmojisGridAdapter EmojisCategFragment.emojisAdapter>
        //   20   46:invokevirtual   #62  <Method void GridView.setAdapter(android.widget.ListAdapter)>
        //   21   49:aload_0         
        //   22   50:getfield        #33  <Field ProgressBar val$smileysPB>
        //   23   53:bipush          8
        //   24   55:invokevirtual   #68  <Method void ProgressBar.setVisibility(int)>
        //   25   58:return          
        }

        final _cls1 this$1;
        private final Activity val$activity;
        private final String val$category;
        private final GridView val$emojisGridView;
        private final ProgressBar val$smileysPB;
    }


    // Unreferenced inner class codeadore/textgram/EmojisCategFragment$2

/* anonymous class */
    class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field EmojisCategFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #24  <Field Activity val$activity>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #26  <Field String val$category>
        //    9   15:aload_0         
        //   10   16:invokespecial   #29  <Method void Object()>
        //   11   19:return          
        }

        public void onItemClick(AdapterView adapterview, View view1, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field EmojisCategFragment this$0>
        //    2    4:getfield        #37  <Field EmojisGridAdapter EmojisCategFragment.emojisAdapter>
        //    3    7:iload_3         
        //    4    8:invokevirtual   #43  <Method String EmojisGridAdapter.getFaceItem(int)>
        //    5   11:astore          6
        // try 13 65 handler(s) 174
        //    6   13:aload_0         
        //    7   14:getfield        #24  <Field Activity val$activity>
        //    8   17:invokevirtual   #49  <Method AssetManager Activity.getAssets()>
        //    9   20:new             #51  <Class StringBuilder>
        //   10   23:dup             
        //   11   24:ldc1            #53  <String "emojis">
        //   12   26:invokespecial   #56  <Method void StringBuilder(String)>
        //   13   29:getstatic       #61  <Field String File.separator>
        //   14   32:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
        //   15   35:aload_0         
        //   16   36:getfield        #26  <Field String val$category>
        //   17   39:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
        //   18   42:getstatic       #61  <Field String File.separator>
        //   19   45:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
        //   20   48:aload           6
        //   21   50:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
        //   22   53:invokevirtual   #69  <Method String StringBuilder.toString()>
        //   23   56:invokevirtual   #75  <Method java.io.InputStream AssetManager.open(String)>
        //   24   59:aconst_null     
        //   25   60:invokestatic    #81  <Method Drawable Drawable.createFromStream(java.io.InputStream, String)>
        //   26   63:astore          16
        //   27   65:aload           16
        //   28   67:astore          8
        //   29   69:new             #83  <Class EmojisCategFragment$2$1>
        //   30   72:dup             
        //   31   73:aload_0         
        //   32   74:aload           8
        //   33   76:invokespecial   #86  <Method void EmojisCategFragment$2$1(EmojisCategFragment$2, Drawable)>
        //   34   79:astore          9
        //   35   81:new             #51  <Class StringBuilder>
        //   36   84:dup             
        //   37   85:ldc1            #88  <String "<img src='">
        //   38   87:invokespecial   #56  <Method void StringBuilder(String)>
        //   39   90:aload           8
        //   40   92:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
        //   41   95:ldc1            #93  <String "' />">
        //   42   97:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
        //   43  100:invokevirtual   #69  <Method String StringBuilder.toString()>
        //   44  103:aload           9
        //   45  105:aconst_null     
        //   46  106:invokestatic    #99  <Method Spanned Html.fromHtml(String, android.text.Html$ImageGetter, android.text.Html$TagHandler)>
        //   47  109:astore          10
        //   48  111:getstatic       #104 <Field String Settings.currentEmojisActivity>
        //   49  114:ldc1            #106 <String "MainActivity">
        //   50  116:if_acmpne       187
        //   51  119:getstatic       #112 <Field EditText MainActivity.editText>
        //   52  122:astore          12
        //   53  124:aload           12
        //   54  126:invokevirtual   #118 <Method int EditText.getSelectionStart()>
        //   55  129:istore          13
        //   56  131:aload           12
        //   57  133:invokevirtual   #121 <Method int EditText.getSelectionEnd()>
        //   58  136:istore          14
        //   59  138:aload           12
        //   60  140:invokevirtual   #125 <Method Editable EditText.getText()>
        //   61  143:iload           13
        //   62  145:iload           14
        //   63  147:invokestatic    #131 <Method int Math.min(int, int)>
        //   64  150:iload           13
        //   65  152:iload           14
        //   66  154:invokestatic    #134 <Method int Math.max(int, int)>
        //   67  157:aload           10
        //   68  159:iconst_0        
        //   69  160:aload           10
        //   70  162:invokeinterface #139 <Method int Spanned.length()>
        //   71  167:invokeinterface #145 <Method Editable Editable.replace(int, int, CharSequence, int, int)>
        //   72  172:pop             
        //   73  173:return          
        // catch IOException
        //   74  174:astore          7
        //   75  176:aload           7
        //   76  178:invokevirtual   #148 <Method void IOException.printStackTrace()>
        //   77  181:aconst_null     
        //   78  182:astore          8
        //   79  184:goto            69
        //   80  187:getstatic       #104 <Field String Settings.currentEmojisActivity>
        //   81  190:ldc1            #150 <String "EditTextActivity">
        //   82  192:if_acmpne       203
        //   83  195:getstatic       #155 <Field EditText EditTextActivity.et>
        //   84  198:astore          12
        //   85  200:goto            124
        //   86  203:getstatic       #104 <Field String Settings.currentEmojisActivity>
        //   87  206:astore          11
        //   88  208:aconst_null     
        //   89  209:astore          12
        //   90  211:aload           11
        //   91  213:ldc1            #157 <String "CreateTextboxActivity">
        //   92  215:if_acmpne       124
        //   93  218:getstatic       #160 <Field EditText CreateTextboxActivity.et>
        //   94  221:astore          12
        //   95  223:goto            124
        }

        final EmojisCategFragment this$0;
        private final Activity val$activity;
        private final String val$category;
    }


    // Unreferenced inner class codeadore/textgram/EmojisCategFragment$2$1

/* anonymous class */
    class _cls1
        implements android.text.Html.ImageGetter
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field EmojisCategFragment$2 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Drawable val$final_face_drawable>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public Drawable getDrawable(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field Drawable val$final_face_drawable>
        //    2    4:iconst_0        
        //    3    5:iconst_0        
        //    4    6:bipush          48
        //    5    8:bipush          48
        //    6   10:invokevirtual   #32  <Method void Drawable.setBounds(int, int, int, int)>
        //    7   13:aload_0         
        //    8   14:getfield        #21  <Field Drawable val$final_face_drawable>
        //    9   17:areturn         
        }

        final _cls2 this$1;
        private final Drawable val$final_face_drawable;
    }


    // Unreferenced inner class codeadore/textgram/EmojisCategFragment$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field EmojisCategFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Runnable val$emojisRunnable>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:new             #27  <Class Thread>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field Runnable val$emojisRunnable>
        //    4    8:invokespecial   #30  <Method void Thread(Runnable)>
        //    5   11:invokevirtual   #33  <Method void Thread.start()>
        //    6   14:return          
        }

        final EmojisCategFragment this$0;
        private final Runnable val$emojisRunnable;
    }

}
