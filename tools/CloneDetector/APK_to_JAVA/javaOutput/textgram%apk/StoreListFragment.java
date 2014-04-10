// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.store;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.*;
import android.widget.*;
import codeadore.textgram.*;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram.store:
//            StoreArrayAdapter

public class StoreListFragment extends Fragment
{

    public StoreListFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:ldc1            #14  <String "StoreListFragment">
    //    4    7:putfield        #16  <Field String TAG>
    //    5   10:return          
    }

    public static StoreListFragment newInstance(String s, String s1)
    {
    //    0    0:new             #2   <Class StoreListFragment>
    //    1    3:dup             
    //    2    4:invokespecial   #19  <Method void StoreListFragment()>
    //    3    7:astore_2        
    //    4    8:new             #21  <Class Bundle>
    //    5   11:dup             
    //    6   12:invokespecial   #22  <Method void Bundle()>
    //    7   15:astore_3        
    //    8   16:aload_3         
    //    9   17:ldc1            #24  <String "type">
    //   10   19:aload_0         
    //   11   20:invokevirtual   #28  <Method void Bundle.putString(String, String)>
    //   12   23:aload_3         
    //   13   24:ldc1            #30  <String "title">
    //   14   26:aload_1         
    //   15   27:invokevirtual   #28  <Method void Bundle.putString(String, String)>
    //   16   30:aload_2         
    //   17   31:aload_3         
    //   18   32:invokevirtual   #34  <Method void setArguments(Bundle)>
    //   19   35:aload_2         
    //   20   36:areturn         
    }

    public void loadData(String s, View view)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #37  <Int 0x7f0600ae>
    //    2    3:invokevirtual   #43  <Method View View.findViewById(int)>
    //    3    6:checkcast       #45  <Class LinearLayout>
    //    4    9:astore_3        
    //    5   10:aload_3         
    //    6   11:bipush          8
    //    7   13:invokevirtual   #49  <Method void LinearLayout.setVisibility(int)>
    //    8   16:aload_2         
    //    9   17:ldc1            #50  <Int 0x7f0600b0>
    //   10   19:invokevirtual   #43  <Method View View.findViewById(int)>
    //   11   22:checkcast       #45  <Class LinearLayout>
    //   12   25:iconst_0        
    //   13   26:invokevirtual   #49  <Method void LinearLayout.setVisibility(int)>
    //   14   29:new             #52  <Class Thread>
    //   15   32:dup             
    //   16   33:new             #54  <Class StoreListFragment$2>
    //   17   36:dup             
    //   18   37:aload_0         
    //   19   38:aload_1         
    //   20   39:aload_3         
    //   21   40:aload_2         
    //   22   41:invokespecial   #57  <Method void StoreListFragment$2(StoreListFragment, String, LinearLayout, View)>
    //   23   44:invokespecial   #60  <Method void Thread(Runnable)>
    //   24   47:invokevirtual   #63  <Method void Thread.start()>
    //   25   50:return          
    }

    public void loadMoreItems(ArrayAdapter arrayadapter, String s, View view, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Button button, 
            ProgressBar progressbar)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #71  <Method int ArrayAdapter.getCount()>
    //    2    4:istore          9
    //    3    6:getstatic       #77  <Field int Settings.store_items_per_page>
    //    4    9:istore          10
    //    5   11:iconst_1        
    //    6   12:iload           9
    //    7   14:iload           10
    //    8   16:idiv            
    //    9   17:iadd            
    //   10   18:istore          11
    //   11   20:iload           9
    //   12   22:iload           10
    //   13   24:icmpge          54
    //   14   27:aload           7
    //   15   29:iconst_0        
    //   16   30:invokevirtual   #80  <Method void Button.setVisibility(int)>
    //   17   33:aload           8
    //   18   35:bipush          8
    //   19   37:invokevirtual   #83  <Method void ProgressBar.setVisibility(int)>
    //   20   40:aload           7
    //   21   42:iconst_0        
    //   22   43:invokevirtual   #87  <Method void Button.setEnabled(boolean)>
    //   23   46:aload           7
    //   24   48:ldc1            #89  <String "No more items to load">
    //   25   50:invokevirtual   #93  <Method void Button.setText(CharSequence)>
    //   26   53:return          
    //   27   54:new             #52  <Class Thread>
    //   28   57:dup             
    //   29   58:new             #95  <Class StoreListFragment$3>
    //   30   61:dup             
    //   31   62:aload_0         
    //   32   63:aload_2         
    //   33   64:iload           11
    //   34   66:aload           4
    //   35   68:aload           6
    //   36   70:aload           5
    //   37   72:aload_3         
    //   38   73:aload           7
    //   39   75:aload           8
    //   40   77:invokespecial   #98  <Method void StoreListFragment$3(StoreListFragment, String, int, ArrayList, ArrayList, ArrayList, View, Button, ProgressBar)>
    //   41   80:invokespecial   #60  <Method void Thread(Runnable)>
    //   42   83:invokevirtual   #63  <Method void Thread.start()>
    //   43   86:return          
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #103 <Method void Fragment.onActivityCreated(Bundle)>
    // try 5 22 handler(s) 41
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #107 <Method Bundle getArguments()>
    //    6   10:ldc1            #24  <String "type">
    //    7   12:invokevirtual   #111 <Method String Bundle.getString(String)>
    //    8   15:aload_0         
    //    9   16:getfield        #113 <Field View theView>
    //   10   19:invokevirtual   #115 <Method void loadData(String, View)>
    //   11   22:new             #52  <Class Thread>
    //   12   25:dup             
    //   13   26:new             #117 <Class StoreListFragment$1>
    //   14   29:dup             
    //   15   30:aload_0         
    //   16   31:invokespecial   #120 <Method void StoreListFragment$1(StoreListFragment)>
    //   17   34:invokespecial   #60  <Method void Thread(Runnable)>
    //   18   37:invokevirtual   #63  <Method void Thread.start()>
    //   19   40:return          
    // catch Exception
    //   20   41:astore_2        
    //   21   42:ldc1            #122 <String "IM">
    //   22   44:ldc1            #124 <String "SAD">
    //   23   46:invokestatic    #130 <Method int Log.e(String, String)>
    //   24   49:pop             
    //   25   50:aload_2         
    //   26   51:invokevirtual   #133 <Method void Exception.printStackTrace()>
    //   27   54:goto            22
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #136 <Int 0x7f030031>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #142 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #113 <Field View theView>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    String TAG;
    View theView;

    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreListFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        // try 0 6 handler(s) 57
        //    0    0:ldc2w           #26  <Long 500L>
        //    1    3:invokestatic    #33  <Method void Thread.sleep(long)>
        //    2    6:getstatic       #39  <Field boolean Settings.store_request_refresh>
        //    3    9:ifeq            56
        // try 12 56 handler(s) 65
        //    4   12:aload_0         
        //    5   13:getfield        #17  <Field StoreListFragment this$0>
        //    6   16:aload_0         
        //    7   17:getfield        #17  <Field StoreListFragment this$0>
        //    8   20:invokevirtual   #43  <Method Bundle StoreListFragment.getArguments()>
        //    9   23:ldc1            #45  <String "type">
        //   10   25:invokevirtual   #51  <Method String Bundle.getString(String)>
        //   11   28:aload_0         
        //   12   29:getfield        #17  <Field StoreListFragment this$0>
        //   13   32:getfield        #55  <Field View StoreListFragment.theView>
        //   14   35:invokevirtual   #59  <Method void StoreListFragment.loadData(String, View)>
        //   15   38:getstatic       #65  <Field Handler StoreActivity.UIHandler>
        //   16   41:new             #67  <Class StoreListFragment$1$1>
        //   17   44:dup             
        //   18   45:aload_0         
        //   19   46:invokespecial   #70  <Method void StoreListFragment$1$1(StoreListFragment$1)>
        //   20   49:ldc2w           #71  <Long 300L>
        //   21   52:invokevirtual   #78  <Method boolean Handler.postDelayed(Runnable, long)>
        //   22   55:pop             
        //   23   56:return          
        // catch InterruptedException
        //   24   57:astore_1        
        //   25   58:aload_1         
        //   26   59:invokevirtual   #81  <Method void InterruptedException.printStackTrace()>
        //   27   62:goto            6
        // catch Exception
        //   28   65:astore_2        
        //   29   66:ldc1            #83  <String "IM">
        //   30   68:ldc1            #85  <String "SAD">
        //   31   70:invokestatic    #91  <Method int Log.e(String, String)>
        //   32   73:pop             
        //   33   74:aload_2         
        //   34   75:invokevirtual   #92  <Method void Exception.printStackTrace()>
        //   35   78:return          
        }

        final StoreListFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreListFragment$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:iconst_0        
        //    1    1:putstatic       #25  <Field boolean Settings.store_request_refresh>
        //    2    4:return          
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field StoreListFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #25  <Field String val$type>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #27  <Field LinearLayout val$nocon_ll>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #29  <Field View val$view>
        //   12   21:aload_0         
        //   13   22:invokespecial   #32  <Method void Object()>
        //   14   25:return          
        }

        static StoreListFragment access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field StoreListFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #23  <Field StoreListFragment this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:new             #39  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:getstatic       #44  <Field String Settings.store_api_url>
        //    3    7:invokestatic    #50  <Method String String.valueOf(Object)>
        //    4   10:invokespecial   #53  <Method void StringBuilder(String)>
        //    5   13:ldc1            #55  <String "/items.php?action=items_list&type=">
        //    6   15:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //    7   18:aload_0         
        //    8   19:getfield        #25  <Field String val$type>
        //    9   22:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   10   25:invokevirtual   #63  <Method String StringBuilder.toString()>
        //   11   28:astore_1        
        // try 29 35 handler(s) 107
        //   12   29:aload_1         
        //   13   30:invokestatic    #69  <Method String el7rUtilities.geHTTPtContents(String)>
        //   14   33:astore          19
        //   15   35:aload           19
        //   16   37:astore          4
        //   17   39:aload           4
        //   18   41:ldc1            #71  <String "ERROR">
        //   19   43:if_acmpeq       51
        //   20   46:aload           4
        //   21   48:ifnonnull       144
        //   22   51:aload_0         
        //   23   52:getfield        #23  <Field StoreListFragment this$0>
        //   24   55:getfield        #74  <Field String StoreListFragment.TAG>
        //   25   58:new             #39  <Class StringBuilder>
        //   26   61:dup             
        //   27   62:ldc1            #76  <String "failed to load the url, theJSON:">
        //   28   64:invokespecial   #53  <Method void StringBuilder(String)>
        //   29   67:aload           4
        //   30   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   31   72:invokevirtual   #63  <Method String StringBuilder.toString()>
        //   32   75:invokestatic    #82  <Method int Log.e(String, String)>
        //   33   78:pop             
        //   34   79:getstatic       #88  <Field Handler StoreActivity.UIHandler>
        //   35   82:new             #90  <Class StoreListFragment$2$1>
        //   36   85:dup             
        //   37   86:aload_0         
        //   38   87:aload_0         
        //   39   88:getfield        #27  <Field LinearLayout val$nocon_ll>
        //   40   91:aload_0         
        //   41   92:getfield        #29  <Field View val$view>
        //   42   95:aload_0         
        //   43   96:getfield        #25  <Field String val$type>
        //   44   99:invokespecial   #93  <Method void StoreListFragment$2$1(StoreListFragment$2, LinearLayout, View, String)>
        //   45  102:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //   46  105:pop             
        //   47  106:return          
        // catch Exception
        //   48  107:astore_2        
        //   49  108:aload_0         
        //   50  109:getfield        #23  <Field StoreListFragment this$0>
        //   51  112:getfield        #74  <Field String StoreListFragment.TAG>
        //   52  115:new             #39  <Class StringBuilder>
        //   53  118:dup             
        //   54  119:ldc1            #101 <String "in loading the url of the api: ">
        //   55  121:invokespecial   #53  <Method void StringBuilder(String)>
        //   56  124:aload_2         
        //   57  125:invokevirtual   #102 <Method String Exception.toString()>
        //   58  128:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   59  131:invokevirtual   #63  <Method String StringBuilder.toString()>
        //   60  134:invokestatic    #82  <Method int Log.e(String, String)>
        //   61  137:pop             
        //   62  138:aconst_null     
        //   63  139:astore          4
        //   64  141:goto            39
        //   65  144:new             #104 <Class ArrayList>
        //   66  147:dup             
        //   67  148:invokespecial   #105 <Method void ArrayList()>
        //   68  151:astore          7
        //   69  153:new             #104 <Class ArrayList>
        //   70  156:dup             
        //   71  157:invokespecial   #105 <Method void ArrayList()>
        //   72  160:astore          8
        //   73  162:new             #104 <Class ArrayList>
        //   74  165:dup             
        //   75  166:invokespecial   #105 <Method void ArrayList()>
        //   76  169:astore          9
        // try 171 182 handler(s) 288
        //   77  171:new             #107 <Class JSONArray>
        //   78  174:dup             
        //   79  175:aload           4
        //   80  177:invokespecial   #108 <Method void JSONArray(String)>
        //   81  180:astore          10
        //   82  182:iconst_0        
        //   83  183:istore          11
        // try 185 192 handler(s) 288
        //   84  185:aload           10
        //   85  187:invokevirtual   #112 <Method int JSONArray.length()>
        //   86  190:istore          14
        //   87  192:iload           11
        //   88  194:iload           14
        //   89  196:icmplt          229
        //   90  199:getstatic       #88  <Field Handler StoreActivity.UIHandler>
        //   91  202:new             #114 <Class StoreListFragment$2$2>
        //   92  205:dup             
        //   93  206:aload_0         
        //   94  207:aload_0         
        //   95  208:getfield        #29  <Field View val$view>
        //   96  211:aload           7
        //   97  213:aload           8
        //   98  215:aload           9
        //   99  217:aload_0         
        //  100  218:getfield        #25  <Field String val$type>
        //  101  221:invokespecial   #117 <Method void StoreListFragment$2$2(StoreListFragment$2, View, ArrayList, ArrayList, ArrayList, String)>
        //  102  224:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //  103  227:pop             
        //  104  228:return          
        // try 229 282 handler(s) 288
        //  105  229:aload           7
        //  106  231:aload           10
        //  107  233:iload           11
        //  108  235:invokevirtual   #121 <Method JSONObject JSONArray.getJSONObject(int)>
        //  109  238:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
        //  110  241:pop             
        //  111  242:aload           10
        //  112  244:iload           11
        //  113  246:invokevirtual   #121 <Method JSONObject JSONArray.getJSONObject(int)>
        //  114  249:ldc1            #127 <String "icon_link">
        //  115  251:invokevirtual   #132 <Method String JSONObject.getString(String)>
        //  116  254:astore          16
        //  117  256:aload           9
        //  118  258:aload           10
        //  119  260:iload           11
        //  120  262:invokevirtual   #121 <Method JSONObject JSONArray.getJSONObject(int)>
        //  121  265:ldc1            #134 <String "title">
        //  122  267:invokevirtual   #132 <Method String JSONObject.getString(String)>
        //  123  270:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
        //  124  273:pop             
        //  125  274:aload           8
        //  126  276:aload           16
        //  127  278:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
        //  128  281:pop             
        //  129  282:iinc            11  1
        //  130  285:goto            185
        // catch Exception Exception Exception
        //  131  288:astore          12
        //  132  290:aload           12
        //  133  292:invokevirtual   #137 <Method void Exception.printStackTrace()>
        //  134  295:goto            199
        }

        final StoreListFragment this$0;
        private final LinearLayout val$nocon_ll;
        private final String val$type;
        private final View val$view;

            static StoreListFragment access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #23  <Field StoreListFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$2$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field StoreListFragment$2 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #25  <Field LinearLayout val$nocon_ll>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #27  <Field View val$view>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #29  <Field String val$type>
        //   12   21:aload_0         
        //   13   22:invokespecial   #31  <Method void Object()>
        //   14   25:return          
        }

        static _cls2 access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field StoreListFragment$2 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #23  <Field StoreListFragment$2 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field LinearLayout val$nocon_ll>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #39  <Method void LinearLayout.setVisibility(int)>
        //    4    8:aload_0         
        //    5    9:getfield        #27  <Field View val$view>
        //    6   12:ldc1            #40  <Int 0x7f0600af>
        //    7   14:invokevirtual   #46  <Method View View.findViewById(int)>
        //    8   17:checkcast       #48  <Class Button>
        //    9   20:new             #50  <Class StoreListFragment$2$1$1>
        //   10   23:dup             
        //   11   24:aload_0         
        //   12   25:aload_0         
        //   13   26:getfield        #29  <Field String val$type>
        //   14   29:aload_0         
        //   15   30:getfield        #27  <Field View val$view>
        //   16   33:invokespecial   #53  <Method void StoreListFragment$2$1$1(StoreListFragment$2$1, String, View)>
        //   17   36:invokevirtual   #57  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
        //   18   39:return          
        }

        final _cls2 this$1;
        private final LinearLayout val$nocon_ll;
        private final String val$type;
        private final View val$view;

            static _cls2 access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #23  <Field StoreListFragment$2 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$2$1$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StoreListFragment$2$1 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field String val$type>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field View val$view>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field StoreListFragment$2$1 this$2>
        //    2    4:invokestatic    #33  <Method StoreListFragment$2 StoreListFragment$2$1.access$0(StoreListFragment$2$1)>
        //    3    7:invokestatic    #38  <Method StoreListFragment StoreListFragment$2.access$0(StoreListFragment$2)>
        //    4   10:aload_0         
        //    5   11:getfield        #23  <Field String val$type>
        //    6   14:aload_0         
        //    7   15:getfield        #25  <Field View val$view>
        //    8   18:invokevirtual   #44  <Method void StoreListFragment.loadData(String, View)>
        //    9   21:return          
        }

        final _cls1 this$2;
        private final String val$type;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$2$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field StoreListFragment$2 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #27  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #29  <Field ArrayList val$JSONObjects>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #31  <Field ArrayList val$icons>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #33  <Field ArrayList val$titlesList>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #35  <Field String val$type>
        //   18   33:aload_0         
        //   19   34:invokespecial   #37  <Method void Object()>
        //   20   37:return          
        }

        static _cls2 access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field StoreListFragment$2 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #25  <Field StoreListFragment$2 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field View val$view>
        //    2    4:ldc1            #40  <Int 0x7f0600b0>
        //    3    6:invokevirtual   #46  <Method View View.findViewById(int)>
        //    4    9:checkcast       #48  <Class LinearLayout>
        //    5   12:bipush          8
        //    6   14:invokevirtual   #52  <Method void LinearLayout.setVisibility(int)>
        //    7   17:new             #54  <Class StoreArrayAdapter>
        //    8   20:dup             
        //    9   21:getstatic       #60  <Field Activity StoreActivity.c>
        //   10   24:ldc1            #61  <Int 0x7f030030>
        //   11   26:aload_0         
        //   12   27:getfield        #29  <Field ArrayList val$JSONObjects>
        //   13   30:aload_0         
        //   14   31:getfield        #31  <Field ArrayList val$icons>
        //   15   34:aload_0         
        //   16   35:getfield        #33  <Field ArrayList val$titlesList>
        //   17   38:invokespecial   #64  <Method void StoreArrayAdapter(android.content.Context, int, ArrayList, ArrayList, ArrayList)>
        //   18   41:astore_1        
        //   19   42:aload_0         
        //   20   43:getfield        #27  <Field View val$view>
        //   21   46:ldc1            #65  <Int 0x7f0600b2>
        //   22   48:invokevirtual   #46  <Method View View.findViewById(int)>
        //   23   51:checkcast       #67  <Class ListView>
        //   24   54:astore_2        
        //   25   55:getstatic       #60  <Field Activity StoreActivity.c>
        //   26   58:invokevirtual   #73  <Method LayoutInflater Activity.getLayoutInflater()>
        //   27   61:ldc1            #74  <Int 0x7f030032>
        //   28   63:aconst_null     
        //   29   64:invokevirtual   #80  <Method View LayoutInflater.inflate(int, ViewGroup)>
        //   30   67:astore_3        
        //   31   68:aload_3         
        //   32   69:ldc1            #81  <Int 0x7f0600b3>
        //   33   71:invokevirtual   #46  <Method View View.findViewById(int)>
        //   34   74:checkcast       #83  <Class Button>
        //   35   77:astore          4
        //   36   79:aload           4
        //   37   81:new             #85  <Class StoreListFragment$2$2$1>
        //   38   84:dup             
        //   39   85:aload_0         
        //   40   86:aload           4
        //   41   88:aload_3         
        //   42   89:ldc1            #86  <Int 0x7f0600b4>
        //   43   91:invokevirtual   #46  <Method View View.findViewById(int)>
        //   44   94:checkcast       #88  <Class ProgressBar>
        //   45   97:aload_1         
        //   46   98:aload_0         
        //   47   99:getfield        #35  <Field String val$type>
        //   48  102:aload_0         
        //   49  103:getfield        #27  <Field View val$view>
        //   50  106:aload_0         
        //   51  107:getfield        #29  <Field ArrayList val$JSONObjects>
        //   52  110:aload_0         
        //   53  111:getfield        #31  <Field ArrayList val$icons>
        //   54  114:aload_0         
        //   55  115:getfield        #33  <Field ArrayList val$titlesList>
        //   56  118:invokespecial   #91  <Method void StoreListFragment$2$2$1(StoreListFragment$2$2, Button, ProgressBar, ArrayAdapter, String, View, ArrayList, ArrayList, ArrayList)>
        //   57  121:invokevirtual   #95  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
        //   58  124:aload_2         
        //   59  125:aload_3         
        //   60  126:invokevirtual   #99  <Method void ListView.addFooterView(View)>
        //   61  129:aload_2         
        //   62  130:aload_1         
        //   63  131:invokevirtual   #103 <Method void ListView.setAdapter(android.widget.ListAdapter)>
        //   64  134:return          
        }

        final _cls2 this$1;
        private final ArrayList val$JSONObjects;
        private final ArrayList val$icons;
        private final ArrayList val$titlesList;
        private final String val$type;
        private final View val$view;

            static _cls2 access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #25  <Field StoreListFragment$2 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$2$2$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field StoreListFragment$2$2 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #33  <Field Button val$moreBtn>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #35  <Field ProgressBar val$thePb>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #37  <Field ArrayAdapter val$listAdapter>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #39  <Field String val$type>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #41  <Field View val$view>
        //   18   33:aload_0         
        //   19   34:aload           7
        //   20   36:putfield        #43  <Field ArrayList val$JSONObjects>
        //   21   39:aload_0         
        //   22   40:aload           8
        //   23   42:putfield        #45  <Field ArrayList val$icons>
        //   24   45:aload_0         
        //   25   46:aload           9
        //   26   48:putfield        #47  <Field ArrayList val$titlesList>
        //   27   51:aload_0         
        //   28   52:invokespecial   #49  <Method void Object()>
        //   29   55:return          
        }

        private void loadMore(ArrayAdapter arrayadapter, String s, int i)
        {
        //    0    0:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Button val$moreBtn>
        //    2    4:bipush          8
        //    3    6:invokevirtual   #59  <Method void Button.setVisibility(int)>
        //    4    9:aload_0         
        //    5   10:getfield        #35  <Field ProgressBar val$thePb>
        //    6   13:iconst_0        
        //    7   14:invokevirtual   #62  <Method void ProgressBar.setVisibility(int)>
        //    8   17:aload_0         
        //    9   18:getfield        #31  <Field StoreListFragment$2$2 this$2>
        //   10   21:invokestatic    #66  <Method StoreListFragment$2 StoreListFragment$2$2.access$0(StoreListFragment$2$2)>
        //   11   24:invokestatic    #71  <Method StoreListFragment StoreListFragment$2.access$0(StoreListFragment$2)>
        //   12   27:aload_0         
        //   13   28:getfield        #37  <Field ArrayAdapter val$listAdapter>
        //   14   31:aload_0         
        //   15   32:getfield        #39  <Field String val$type>
        //   16   35:aload_0         
        //   17   36:getfield        #41  <Field View val$view>
        //   18   39:aload_0         
        //   19   40:getfield        #43  <Field ArrayList val$JSONObjects>
        //   20   43:aload_0         
        //   21   44:getfield        #45  <Field ArrayList val$icons>
        //   22   47:aload_0         
        //   23   48:getfield        #47  <Field ArrayList val$titlesList>
        //   24   51:aload_0         
        //   25   52:getfield        #33  <Field Button val$moreBtn>
        //   26   55:aload_0         
        //   27   56:getfield        #35  <Field ProgressBar val$thePb>
        //   28   59:invokevirtual   #77  <Method void StoreListFragment.loadMoreItems(ArrayAdapter, String, View, ArrayList, ArrayList, ArrayList, Button, ProgressBar)>
        //   29   62:return          
        }

        final _cls2 this$2;
        private final ArrayList val$JSONObjects;
        private final ArrayList val$icons;
        private final ArrayAdapter val$listAdapter;
        private final Button val$moreBtn;
        private final ProgressBar val$thePb;
        private final ArrayList val$titlesList;
        private final String val$type;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field StoreListFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #33  <Field String val$type>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #35  <Field int val$nextPage>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #37  <Field ArrayList val$JSONObjects>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #39  <Field ArrayList val$titlesList>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #41  <Field ArrayList val$icons>
        //   18   33:aload_0         
        //   19   34:aload           7
        //   20   36:putfield        #43  <Field View val$view>
        //   21   39:aload_0         
        //   22   40:aload           8
        //   23   42:putfield        #45  <Field Button val$moreBtn>
        //   24   45:aload_0         
        //   25   46:aload           9
        //   26   48:putfield        #47  <Field ProgressBar val$thePb>
        //   27   51:aload_0         
        //   28   52:invokespecial   #50  <Method void Object()>
        //   29   55:return          
        }

        public void run()
        {
        //    0    0:new             #55  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:getstatic       #60  <Field String Settings.store_api_url>
        //    3    7:invokestatic    #66  <Method String String.valueOf(Object)>
        //    4   10:invokespecial   #69  <Method void StringBuilder(String)>
        //    5   13:ldc1            #71  <String "/items.php?action=items_list&type=">
        //    6   15:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //    7   18:aload_0         
        //    8   19:getfield        #33  <Field String val$type>
        //    9   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   10   25:ldc1            #77  <String "&page=">
        //   11   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   12   30:aload_0         
        //   13   31:getfield        #35  <Field int val$nextPage>
        //   14   34:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
        //   15   37:invokevirtual   #84  <Method String StringBuilder.toString()>
        //   16   40:astore_1        
        //   17   41:ldc1            #86  <String "fuck">
        //   18   43:new             #55  <Class StringBuilder>
        //   19   46:dup             
        //   20   47:ldc1            #88  <String "loaded url: ">
        //   21   49:invokespecial   #69  <Method void StringBuilder(String)>
        //   22   52:aload_1         
        //   23   53:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   24   56:invokevirtual   #84  <Method String StringBuilder.toString()>
        //   25   59:invokestatic    #94  <Method int Log.e(String, String)>
        //   26   62:pop             
        // try 63 69 handler(s) 129
        //   27   63:aload_1         
        //   28   64:invokestatic    #100 <Method String el7rUtilities.geHTTPtContents(String)>
        //   29   67:astore          21
        //   30   69:aload           21
        //   31   71:astore          5
        //   32   73:aload           5
        //   33   75:ldc1            #102 <String "ERROR">
        //   34   77:if_acmpeq       85
        //   35   80:aload           5
        //   36   82:ifnonnull       166
        //   37   85:aload_0         
        //   38   86:getfield        #31  <Field StoreListFragment this$0>
        //   39   89:getfield        #105 <Field String StoreListFragment.TAG>
        //   40   92:new             #55  <Class StringBuilder>
        //   41   95:dup             
        //   42   96:ldc1            #107 <String "failed to load the url, theJSON:">
        //   43   98:invokespecial   #69  <Method void StringBuilder(String)>
        //   44  101:aload           5
        //   45  103:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   46  106:invokevirtual   #84  <Method String StringBuilder.toString()>
        //   47  109:invokestatic    #94  <Method int Log.e(String, String)>
        //   48  112:pop             
        //   49  113:getstatic       #113 <Field Handler StoreActivity.UIHandler>
        //   50  116:new             #115 <Class StoreListFragment$3$1>
        //   51  119:dup             
        //   52  120:aload_0         
        //   53  121:invokespecial   #118 <Method void StoreListFragment$3$1(StoreListFragment$3)>
        //   54  124:invokevirtual   #124 <Method boolean Handler.post(Runnable)>
        //   55  127:pop             
        //   56  128:return          
        // catch Exception
        //   57  129:astore_3        
        //   58  130:aload_0         
        //   59  131:getfield        #31  <Field StoreListFragment this$0>
        //   60  134:getfield        #105 <Field String StoreListFragment.TAG>
        //   61  137:new             #55  <Class StringBuilder>
        //   62  140:dup             
        //   63  141:ldc1            #126 <String "in loading the url of the api: ">
        //   64  143:invokespecial   #69  <Method void StringBuilder(String)>
        //   65  146:aload_3         
        //   66  147:invokevirtual   #127 <Method String Exception.toString()>
        //   67  150:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   68  153:invokevirtual   #84  <Method String StringBuilder.toString()>
        //   69  156:invokestatic    #94  <Method int Log.e(String, String)>
        //   70  159:pop             
        //   71  160:aconst_null     
        //   72  161:astore          5
        //   73  163:goto            73
        //   74  166:iconst_0        
        //   75  167:istore          8
        // try 169 180 handler(s) 319
        //   76  169:new             #129 <Class JSONArray>
        //   77  172:dup             
        //   78  173:aload           5
        //   79  175:invokespecial   #130 <Method void JSONArray(String)>
        //   80  178:astore          9
        //   81  180:iconst_0        
        //   82  181:istore          10
        // try 183 190 handler(s) 319
        //   83  183:aload           9
        //   84  185:invokevirtual   #134 <Method int JSONArray.length()>
        //   85  188:istore          14
        //   86  190:iload           10
        //   87  192:iload           14
        //   88  194:icmplt          243
        //   89  197:iload           8
        //   90  199:istore          12
        //   91  201:getstatic       #113 <Field Handler StoreActivity.UIHandler>
        //   92  204:new             #136 <Class StoreListFragment$3$2>
        //   93  207:dup             
        //   94  208:aload_0         
        //   95  209:aload_0         
        //   96  210:getfield        #37  <Field ArrayList val$JSONObjects>
        //   97  213:aload_0         
        //   98  214:getfield        #41  <Field ArrayList val$icons>
        //   99  217:aload_0         
        //  100  218:getfield        #39  <Field ArrayList val$titlesList>
        //  101  221:aload_0         
        //  102  222:getfield        #43  <Field View val$view>
        //  103  225:aload_0         
        //  104  226:getfield        #45  <Field Button val$moreBtn>
        //  105  229:aload_0         
        //  106  230:getfield        #47  <Field ProgressBar val$thePb>
        //  107  233:iload           12
        //  108  235:invokespecial   #139 <Method void StoreListFragment$3$2(StoreListFragment$3, ArrayList, ArrayList, ArrayList, View, Button, ProgressBar, int)>
        //  109  238:invokevirtual   #124 <Method boolean Handler.post(Runnable)>
        //  110  241:pop             
        //  111  242:return          
        //  112  243:iinc            8  1
        // try 246 313 handler(s) 319
        //  113  246:aload           9
        //  114  248:iload           10
        //  115  250:invokevirtual   #143 <Method JSONObject JSONArray.getJSONObject(int)>
        //  116  253:astore          15
        //  117  255:aload_0         
        //  118  256:getfield        #37  <Field ArrayList val$JSONObjects>
        //  119  259:aload           15
        //  120  261:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
        //  121  264:pop             
        //  122  265:aload           9
        //  123  267:iload           10
        //  124  269:invokevirtual   #143 <Method JSONObject JSONArray.getJSONObject(int)>
        //  125  272:ldc1            #151 <String "icon_link">
        //  126  274:invokevirtual   #156 <Method String JSONObject.getString(String)>
        //  127  277:astore          17
        //  128  279:aload           9
        //  129  281:iload           10
        //  130  283:invokevirtual   #143 <Method JSONObject JSONArray.getJSONObject(int)>
        //  131  286:ldc1            #158 <String "title">
        //  132  288:invokevirtual   #156 <Method String JSONObject.getString(String)>
        //  133  291:astore          18
        //  134  293:aload_0         
        //  135  294:getfield        #39  <Field ArrayList val$titlesList>
        //  136  297:aload           18
        //  137  299:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
        //  138  302:pop             
        //  139  303:aload_0         
        //  140  304:getfield        #41  <Field ArrayList val$icons>
        //  141  307:aload           17
        //  142  309:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
        //  143  312:pop             
        //  144  313:iinc            10  1
        //  145  316:goto            183
        // catch Exception Exception Exception
        //  146  319:astore          11
        //  147  321:aload           11
        //  148  323:invokevirtual   #161 <Method void Exception.printStackTrace()>
        //  149  326:goto            197
        }

        final StoreListFragment this$0;
        private final ArrayList val$JSONObjects;
        private final ArrayList val$icons;
        private final Button val$moreBtn;
        private final int val$nextPage;
        private final ProgressBar val$thePb;
        private final ArrayList val$titlesList;
        private final String val$type;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$3$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreListFragment$3 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:ldc1            #21  <String "Error in connecting to the store, make sure that you are connected to the internet">
        //    1    2:ldc1            #23  <String "error">
        //    2    4:getstatic       #29  <Field Activity StoreActivity.c>
        //    3    7:invokestatic    #35  <Method void el7rUtilities.messageBox(String, String, android.content.Context)>
        //    4   10:return          
        }

        final _cls3 this$1;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreListFragment$3$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #29  <Field StoreListFragment$3 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #31  <Field ArrayList val$JSONObjects>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #33  <Field ArrayList val$icons>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #35  <Field ArrayList val$titlesList>
        //   12   21:aload_0         
        //   13   22:aload           5
        //   14   24:putfield        #37  <Field View val$view>
        //   15   27:aload_0         
        //   16   28:aload           6
        //   17   30:putfield        #39  <Field Button val$moreBtn>
        //   18   33:aload_0         
        //   19   34:aload           7
        //   20   36:putfield        #41  <Field ProgressBar val$thePb>
        //   21   39:aload_0         
        //   22   40:iload           8
        //   23   42:putfield        #43  <Field int val$finalNewItems>
        //   24   45:aload_0         
        //   25   46:invokespecial   #45  <Method void Object()>
        //   26   49:return          
        }

        public void run()
        {
        //    0    0:new             #47  <Class StoreArrayAdapter>
        //    1    3:dup             
        //    2    4:getstatic       #53  <Field Activity StoreActivity.c>
        //    3    7:ldc1            #54  <Int 0x7f030030>
        //    4    9:aload_0         
        //    5   10:getfield        #31  <Field ArrayList val$JSONObjects>
        //    6   13:aload_0         
        //    7   14:getfield        #33  <Field ArrayList val$icons>
        //    8   17:aload_0         
        //    9   18:getfield        #35  <Field ArrayList val$titlesList>
        //   10   21:invokespecial   #57  <Method void StoreArrayAdapter(android.content.Context, int, ArrayList, ArrayList, ArrayList)>
        //   11   24:astore_1        
        //   12   25:aload_0         
        //   13   26:getfield        #37  <Field View val$view>
        //   14   29:ldc1            #58  <Int 0x7f0600b2>
        //   15   31:invokevirtual   #64  <Method View View.findViewById(int)>
        //   16   34:checkcast       #66  <Class ListView>
        //   17   37:aload_1         
        //   18   38:invokevirtual   #70  <Method void ListView.setAdapter(android.widget.ListAdapter)>
        //   19   41:aload_0         
        //   20   42:getfield        #39  <Field Button val$moreBtn>
        //   21   45:iconst_0        
        //   22   46:invokevirtual   #76  <Method void Button.setVisibility(int)>
        //   23   49:aload_0         
        //   24   50:getfield        #41  <Field ProgressBar val$thePb>
        //   25   53:bipush          8
        //   26   55:invokevirtual   #79  <Method void ProgressBar.setVisibility(int)>
        //   27   58:aload_0         
        //   28   59:getfield        #43  <Field int val$finalNewItems>
        //   29   62:ifne            82
        //   30   65:aload_0         
        //   31   66:getfield        #39  <Field Button val$moreBtn>
        //   32   69:iconst_0        
        //   33   70:invokevirtual   #83  <Method void Button.setEnabled(boolean)>
        //   34   73:aload_0         
        //   35   74:getfield        #39  <Field Button val$moreBtn>
        //   36   77:ldc1            #85  <String "No more items to load">
        //   37   79:invokevirtual   #89  <Method void Button.setText(CharSequence)>
        //   38   82:return          
        }

        final _cls3 this$1;
        private final ArrayList val$JSONObjects;
        private final int val$finalNewItems;
        private final ArrayList val$icons;
        private final Button val$moreBtn;
        private final ProgressBar val$thePb;
        private final ArrayList val$titlesList;
        private final View val$view;
    }

}
