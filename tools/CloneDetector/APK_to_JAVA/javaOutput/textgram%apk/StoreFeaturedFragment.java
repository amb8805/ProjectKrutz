// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.store;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.widget.*;
import codeadore.textgram.Settings;
import codeadore.textgram.StoreActivity;
import codeadore.textgram.custom_widgets.NoScrollViewPager;
import codeadore.textgram.custom_widgets.ViewPager3D;
import codeadore.textgram.el7rFragmentActivity;
import codeadore.textgram.el7rUtilities;
import codeadore.textgram.lazylist.ImageLoader;
import com.viewpagerindicator.CirclePageIndicator;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram.store:
//            StoreFeaturedGalleryAdapter, StoreArrayAdapter

public class StoreFeaturedFragment extends Fragment
{

    public StoreFeaturedFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
    //    5    9:putfield        #26  <Field Boolean areWeOk>
    //    6   12:aload_0         
    //    7   13:ldc1            #28  <String "StoreFeaturedFragment">
    //    8   15:putfield        #30  <Field String TAG>
    //    9   18:return          
    }

    public void loadData(String s, View view1)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #33  <Int 0x7f06009a>
    //    2    3:invokevirtual   #39  <Method View View.findViewById(int)>
    //    3    6:checkcast       #41  <Class LinearLayout>
    //    4    9:astore_3        
    //    5   10:aload_3         
    //    6   11:bipush          8
    //    7   13:invokevirtual   #45  <Method void LinearLayout.setVisibility(int)>
    //    8   16:aload_2         
    //    9   17:ldc1            #46  <Int 0x7f06009c>
    //   10   19:invokevirtual   #39  <Method View View.findViewById(int)>
    //   11   22:checkcast       #41  <Class LinearLayout>
    //   12   25:iconst_0        
    //   13   26:invokevirtual   #45  <Method void LinearLayout.setVisibility(int)>
    //   14   29:new             #48  <Class Thread>
    //   15   32:dup             
    //   16   33:new             #50  <Class StoreFeaturedFragment$4>
    //   17   36:dup             
    //   18   37:aload_0         
    //   19   38:aload_1         
    //   20   39:aload_3         
    //   21   40:aload_2         
    //   22   41:invokespecial   #53  <Method void StoreFeaturedFragment$4(StoreFeaturedFragment, String, LinearLayout, View)>
    //   23   44:invokespecial   #56  <Method void Thread(Runnable)>
    //   24   47:invokevirtual   #59  <Method void Thread.start()>
    //   25   50:return          
    }

    public void loadMoreItems(ArrayAdapter arrayadapter, String s, View view1, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, Button button, 
            ProgressBar progressbar)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #67  <Method int ArrayAdapter.getCount()>
    //    2    4:istore          9
    //    3    6:getstatic       #73  <Field int Settings.store_items_per_page>
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
    //   16   30:invokevirtual   #76  <Method void Button.setVisibility(int)>
    //   17   33:aload           8
    //   18   35:bipush          8
    //   19   37:invokevirtual   #79  <Method void ProgressBar.setVisibility(int)>
    //   20   40:aload           7
    //   21   42:iconst_0        
    //   22   43:invokevirtual   #83  <Method void Button.setEnabled(boolean)>
    //   23   46:aload           7
    //   24   48:ldc1            #85  <String "No more items to load">
    //   25   50:invokevirtual   #89  <Method void Button.setText(CharSequence)>
    //   26   53:return          
    //   27   54:new             #48  <Class Thread>
    //   28   57:dup             
    //   29   58:new             #91  <Class StoreFeaturedFragment$5>
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
    //   40   77:invokespecial   #94  <Method void StoreFeaturedFragment$5(StoreFeaturedFragment, String, int, ArrayList, ArrayList, ArrayList, View, Button, ProgressBar)>
    //   41   80:invokespecial   #56  <Method void Thread(Runnable)>
    //   42   83:invokevirtual   #59  <Method void Thread.start()>
    //   43   86:return          
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #98  <Method void Fragment.onActivityCreated(Bundle)>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #102 <Method android.support.v4.app.FragmentActivity getActivity()>
    //    6   10:checkcast       #104 <Class el7rFragmentActivity>
    //    7   13:putfield        #106 <Field el7rFragmentActivity mainActivity>
    //    8   16:aload_0         
    //    9   17:new             #108 <Class ImageLoader>
    //   10   20:dup             
    //   11   21:aload_0         
    //   12   22:getfield        #106 <Field el7rFragmentActivity mainActivity>
    //   13   25:invokevirtual   #112 <Method android.content.Context el7rFragmentActivity.getApplicationContext()>
    //   14   28:invokespecial   #115 <Method void ImageLoader(android.content.Context)>
    //   15   31:putfield        #117 <Field ImageLoader imageLoader>
    //   16   34:new             #48  <Class Thread>
    //   17   37:dup             
    //   18   38:new             #119 <Class StoreFeaturedFragment$1>
    //   19   41:dup             
    //   20   42:aload_0         
    //   21   43:invokespecial   #122 <Method void StoreFeaturedFragment$1(StoreFeaturedFragment)>
    //   22   46:invokespecial   #56  <Method void Thread(Runnable)>
    //   23   49:invokevirtual   #59  <Method void Thread.start()>
    //   24   52:new             #48  <Class Thread>
    //   25   55:dup             
    //   26   56:new             #124 <Class StoreFeaturedFragment$3>
    //   27   59:dup             
    //   28   60:aload_0         
    //   29   61:new             #48  <Class Thread>
    //   30   64:dup             
    //   31   65:new             #126 <Class StoreFeaturedFragment$2>
    //   32   68:dup             
    //   33   69:aload_0         
    //   34   70:invokespecial   #127 <Method void StoreFeaturedFragment$2(StoreFeaturedFragment)>
    //   35   73:invokespecial   #56  <Method void Thread(Runnable)>
    //   36   76:invokespecial   #130 <Method void StoreFeaturedFragment$3(StoreFeaturedFragment, Thread)>
    //   37   79:invokespecial   #56  <Method void Thread(Runnable)>
    //   38   82:invokevirtual   #59  <Method void Thread.start()>
    //   39   85:aload_0         
    //   40   86:ldc1            #132 <String "all">
    //   41   88:aload_0         
    //   42   89:getfield        #134 <Field View view>
    //   43   92:invokevirtual   #136 <Method void loadData(String, View)>
    //   44   95:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #139 <Int 0x7f03002d>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #145 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #134 <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #148 <Method void Fragment.onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #151 <Method void setUserVisibleHint(boolean)>
    //    6   10:return          
    }

    String TAG;
    Boolean areWeOk;
    ImageLoader imageLoader;
    el7rFragmentActivity mainActivity;
    View view;

    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        static StoreFeaturedFragment access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field StoreFeaturedFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field StoreFeaturedFragment this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        // try 0 26 handler(s) 50
        //    0    0:new             #27  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:getstatic       #33  <Field String Settings.store_api_url>
        //    3    7:invokestatic    #39  <Method String String.valueOf(Object)>
        //    4   10:invokespecial   #42  <Method void StringBuilder(String)>
        //    5   13:ldc1            #44  <String "/online.text">
        //    6   15:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
        //    7   18:invokevirtual   #52  <Method String StringBuilder.toString()>
        //    8   21:invokestatic    #58  <Method String el7rUtilities.geHTTPtContents(String)>
        //    9   24:astore          6
        //   10   26:aload           6
        //   11   28:astore_3        
        //   12   29:aload_3         
        //   13   30:astore          4
        //   14   32:getstatic       #64  <Field Handler StoreActivity.UIHandler>
        //   15   35:new             #66  <Class StoreFeaturedFragment$1$1>
        //   16   38:dup             
        //   17   39:aload_0         
        //   18   40:aload           4
        //   19   42:invokespecial   #69  <Method void StoreFeaturedFragment$1$1(StoreFeaturedFragment$1, String)>
        //   20   45:invokevirtual   #75  <Method boolean Handler.post(Runnable)>
        //   21   48:pop             
        //   22   49:return          
        // catch IOException
        //   23   50:astore_1        
        //   24   51:ldc1            #77  <String "SAD">
        //   25   53:new             #27  <Class StringBuilder>
        //   26   56:dup             
        //   27   57:ldc1            #79  <String "because im here :( ">
        //   28   59:invokespecial   #42  <Method void StringBuilder(String)>
        //   29   62:aload_1         
        //   30   63:invokevirtual   #80  <Method String IOException.toString()>
        //   31   66:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
        //   32   69:invokevirtual   #52  <Method String StringBuilder.toString()>
        //   33   72:invokestatic    #86  <Method int Log.e(String, String)>
        //   34   75:pop             
        //   35   76:aload_1         
        //   36   77:invokevirtual   #89  <Method void IOException.printStackTrace()>
        //   37   80:aconst_null     
        //   38   81:astore_3        
        //   39   82:goto            29
        }

        final StoreFeaturedFragment this$0;

            static StoreFeaturedFragment access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field StoreFeaturedFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field String val$finalStatus>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field String val$finalStatus>
        //    2    4:ifnull          88
        //    3    7:aload_0         
        //    4    8:getfield        #21  <Field String val$finalStatus>
        //    5   11:ldc1            #27  <String "[yes]">
        //    6   13:invokevirtual   #33  <Method boolean String.contains(CharSequence)>
        //    7   16:ifeq            34
        //    8   19:aload_0         
        //    9   20:getfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //   10   23:invokestatic    #37  <Method StoreFeaturedFragment StoreFeaturedFragment$1.access$0(StoreFeaturedFragment$1)>
        //   11   26:iconst_1        
        //   12   27:invokestatic    #43  <Method Boolean Boolean.valueOf(boolean)>
        //   13   30:putfield        #49  <Field Boolean StoreFeaturedFragment.areWeOk>
        //   14   33:return          
        //   15   34:aload_0         
        //   16   35:getfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //   17   38:invokestatic    #37  <Method StoreFeaturedFragment StoreFeaturedFragment$1.access$0(StoreFeaturedFragment$1)>
        //   18   41:getfield        #53  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   19   44:ldc1            #54  <Int 0x7f060096>
        //   20   46:invokevirtual   #60  <Method View el7rFragmentActivity.findViewById(int)>
        //   21   49:checkcast       #62  <Class ProgressBar>
        //   22   52:astore          4
        //   23   54:aload_0         
        //   24   55:getfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //   25   58:invokestatic    #37  <Method StoreFeaturedFragment StoreFeaturedFragment$1.access$0(StoreFeaturedFragment$1)>
        //   26   61:getfield        #53  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   27   64:ldc1            #63  <Int 0x7f060097>
        //   28   66:invokevirtual   #60  <Method View el7rFragmentActivity.findViewById(int)>
        //   29   69:checkcast       #65  <Class TextView>
        //   30   72:astore          5
        //   31   74:aload           4
        //   32   76:bipush          8
        //   33   78:invokevirtual   #69  <Method void ProgressBar.setVisibility(int)>
        //   34   81:aload           5
        //   35   83:iconst_0        
        //   36   84:invokevirtual   #70  <Method void TextView.setVisibility(int)>
        //   37   87:return          
        //   38   88:aload_0         
        //   39   89:getfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //   40   92:invokestatic    #37  <Method StoreFeaturedFragment StoreFeaturedFragment$1.access$0(StoreFeaturedFragment$1)>
        //   41   95:getfield        #53  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   42   98:ldc1            #54  <Int 0x7f060096>
        //   43  100:invokevirtual   #60  <Method View el7rFragmentActivity.findViewById(int)>
        //   44  103:checkcast       #62  <Class ProgressBar>
        //   45  106:astore_1        
        //   46  107:aload_0         
        //   47  108:getfield        #19  <Field StoreFeaturedFragment$1 this$1>
        //   48  111:invokestatic    #37  <Method StoreFeaturedFragment StoreFeaturedFragment$1.access$0(StoreFeaturedFragment$1)>
        //   49  114:getfield        #53  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   50  117:ldc1            #63  <Int 0x7f060097>
        //   51  119:invokevirtual   #60  <Method View el7rFragmentActivity.findViewById(int)>
        //   52  122:checkcast       #65  <Class TextView>
        //   53  125:astore_2        
        // try 126 137 handler(s) 138
        //   54  126:aload_1         
        //   55  127:bipush          8
        //   56  129:invokevirtual   #69  <Method void ProgressBar.setVisibility(int)>
        //   57  132:aload_2         
        //   58  133:iconst_0        
        //   59  134:invokevirtual   #70  <Method void TextView.setVisibility(int)>
        //   60  137:return          
        // catch Exception
        //   61  138:astore_3        
        //   62  139:aload_3         
        //   63  140:invokevirtual   #73  <Method void Exception.printStackTrace()>
        //   64  143:return          
        }

        final _cls1 this$1;
        private final String val$finalStatus;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        static StoreFeaturedFragment access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field StoreFeaturedFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field StoreFeaturedFragment this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:getstatic       #31  <Field String Settings.store_auth_key>
        //    1    3:ifnonnull       94
        //    2    6:new             #33  <Class StringBuilder>
        //    3    9:dup             
        //    4   10:getstatic       #36  <Field String Settings.store_api_url>
        //    5   13:invokestatic    #42  <Method String String.valueOf(Object)>
        //    6   16:invokespecial   #45  <Method void StringBuilder(String)>
        //    7   19:ldc1            #47  <String "/items.php?action=items_list&type=all&featured=yes">
        //    8   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //    9   24:invokevirtual   #55  <Method String StringBuilder.toString()>
        //   10   27:astore_1        
        // try 28 34 handler(s) 130
        //   11   28:aload_1         
        //   12   29:invokestatic    #61  <Method String el7rUtilities.geHTTPtContents(String)>
        //   13   32:astore          21
        //   14   34:aload           21
        //   15   36:astore          4
        //   16   38:aload           4
        //   17   40:ldc1            #63  <String "ERROR">
        //   18   42:if_acmpeq       50
        //   19   45:aload           4
        //   20   47:ifnonnull       167
        //   21   50:aload_0         
        //   22   51:getfield        #17  <Field StoreFeaturedFragment this$0>
        //   23   54:getfield        #66  <Field String StoreFeaturedFragment.TAG>
        //   24   57:new             #33  <Class StringBuilder>
        //   25   60:dup             
        //   26   61:ldc1            #68  <String "failed to load the url, theJSON:">
        //   27   63:invokespecial   #45  <Method void StringBuilder(String)>
        //   28   66:aload           4
        //   29   68:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   30   71:invokevirtual   #55  <Method String StringBuilder.toString()>
        //   31   74:invokestatic    #74  <Method int Log.e(String, String)>
        //   32   77:pop             
        //   33   78:getstatic       #80  <Field Handler StoreActivity.UIHandler>
        //   34   81:new             #82  <Class StoreFeaturedFragment$2$1>
        //   35   84:dup             
        //   36   85:aload_0         
        //   37   86:invokespecial   #85  <Method void StoreFeaturedFragment$2$1(StoreFeaturedFragment$2)>
        //   38   89:invokevirtual   #91  <Method boolean Handler.post(Runnable)>
        //   39   92:pop             
        //   40   93:return          
        //   41   94:new             #33  <Class StringBuilder>
        //   42   97:dup             
        //   43   98:getstatic       #36  <Field String Settings.store_api_url>
        //   44  101:invokestatic    #42  <Method String String.valueOf(Object)>
        //   45  104:invokespecial   #45  <Method void StringBuilder(String)>
        //   46  107:ldc1            #47  <String "/items.php?action=items_list&type=all&featured=yes">
        //   47  109:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   48  112:ldc1            #93  <String "&auth_key=">
        //   49  114:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   50  117:getstatic       #31  <Field String Settings.store_auth_key>
        //   51  120:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   52  123:invokevirtual   #55  <Method String StringBuilder.toString()>
        //   53  126:astore_1        
        //   54  127:goto            28
        // catch Exception
        //   55  130:astore_2        
        //   56  131:aload_0         
        //   57  132:getfield        #17  <Field StoreFeaturedFragment this$0>
        //   58  135:getfield        #66  <Field String StoreFeaturedFragment.TAG>
        //   59  138:new             #33  <Class StringBuilder>
        //   60  141:dup             
        //   61  142:ldc1            #95  <String "in loading the url of the api: ">
        //   62  144:invokespecial   #45  <Method void StringBuilder(String)>
        //   63  147:aload_2         
        //   64  148:invokevirtual   #96  <Method String Exception.toString()>
        //   65  151:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   66  154:invokevirtual   #55  <Method String StringBuilder.toString()>
        //   67  157:invokestatic    #74  <Method int Log.e(String, String)>
        //   68  160:pop             
        //   69  161:aconst_null     
        //   70  162:astore          4
        //   71  164:goto            38
        //   72  167:new             #98  <Class ArrayList>
        //   73  170:dup             
        //   74  171:invokespecial   #99  <Method void ArrayList()>
        //   75  174:astore          7
        //   76  176:new             #98  <Class ArrayList>
        //   77  179:dup             
        //   78  180:invokespecial   #99  <Method void ArrayList()>
        //   79  183:astore          8
        //   80  185:new             #98  <Class ArrayList>
        //   81  188:dup             
        //   82  189:invokespecial   #99  <Method void ArrayList()>
        //   83  192:astore          9
        //   84  194:new             #98  <Class ArrayList>
        //   85  197:dup             
        //   86  198:invokespecial   #99  <Method void ArrayList()>
        //   87  201:astore          10
        // try 203 214 handler(s) 334
        //   88  203:new             #101 <Class JSONArray>
        //   89  206:dup             
        //   90  207:aload           4
        //   91  209:invokespecial   #102 <Method void JSONArray(String)>
        //   92  212:astore          11
        //   93  214:iconst_0        
        //   94  215:istore          12
        // try 217 224 handler(s) 334
        //   95  217:aload           11
        //   96  219:invokevirtual   #106 <Method int JSONArray.length()>
        //   97  222:istore          15
        //   98  224:iload           12
        //   99  226:iload           15
        //  100  228:icmplt          251
        //  101  231:getstatic       #80  <Field Handler StoreActivity.UIHandler>
        //  102  234:new             #108 <Class StoreFeaturedFragment$2$2>
        //  103  237:dup             
        //  104  238:aload_0         
        //  105  239:aload           8
        //  106  241:aload           10
        //  107  243:invokespecial   #111 <Method void StoreFeaturedFragment$2$2(StoreFeaturedFragment$2, ArrayList, ArrayList)>
        //  108  246:invokevirtual   #91  <Method boolean Handler.post(Runnable)>
        //  109  249:pop             
        //  110  250:return          
        // try 251 322 handler(s) 334
        //  111  251:aload           7
        //  112  253:aload           11
        //  113  255:iload           12
        //  114  257:invokevirtual   #115 <Method JSONObject JSONArray.getJSONObject(int)>
        //  115  260:invokevirtual   #119 <Method boolean ArrayList.add(Object)>
        //  116  263:pop             
        //  117  264:aload           11
        //  118  266:iload           12
        //  119  268:invokevirtual   #115 <Method JSONObject JSONArray.getJSONObject(int)>
        //  120  271:ldc1            #121 <String "banner_link">
        //  121  273:invokevirtual   #126 <Method String JSONObject.getString(String)>
        //  122  276:astore          17
        //  123  278:aload           9
        //  124  280:aload           11
        //  125  282:iload           12
        //  126  284:invokevirtual   #115 <Method JSONObject JSONArray.getJSONObject(int)>
        //  127  287:ldc1            #128 <String "title">
        //  128  289:invokevirtual   #126 <Method String JSONObject.getString(String)>
        //  129  292:invokevirtual   #119 <Method boolean ArrayList.add(Object)>
        //  130  295:pop             
        //  131  296:aload           10
        //  132  298:aload           11
        //  133  300:iload           12
        //  134  302:invokevirtual   #115 <Method JSONObject JSONArray.getJSONObject(int)>
        //  135  305:ldc1            #130 <String "unique_id">
        //  136  307:invokevirtual   #126 <Method String JSONObject.getString(String)>
        //  137  310:invokevirtual   #119 <Method boolean ArrayList.add(Object)>
        //  138  313:pop             
        //  139  314:aload           8
        //  140  316:aload           17
        //  141  318:invokevirtual   #119 <Method boolean ArrayList.add(Object)>
        //  142  321:pop             
        //  143  322:iload           12
        //  144  324:iconst_3        
        //  145  325:icmpgt          231
        //  146  328:iinc            12  1
        //  147  331:goto            217
        // catch Exception Exception Exception
        //  148  334:astore          13
        //  149  336:aload           13
        //  150  338:invokevirtual   #133 <Method void Exception.printStackTrace()>
        //  151  341:goto            231
        }

        final StoreFeaturedFragment this$0;

            static StoreFeaturedFragment access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field StoreFeaturedFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$2$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedFragment$2 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:ldc1            #21  <String "Something went wrong, please try again later">
        //    1    2:ldc1            #23  <String "fail">
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field StoreFeaturedFragment$2 this$1>
        //    4    8:invokestatic    #27  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //    5   11:getfield        #33  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //    6   14:invokestatic    #39  <Method void el7rUtilities.messageBox(String, String, android.content.Context)>
        //    7   17:return          
        }

        final _cls2 this$1;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$2$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #22  <Field ArrayList val$banners>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #24  <Field ArrayList val$uniqueIDSList>
        //    9   15:aload_0         
        //   10   16:invokespecial   #26  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        // try 0 128 handler(s) 192
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //    2    4:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //    3    7:getfield        #38  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //    4   10:ldc1            #39  <Int 0x7f060095>
        //    5   12:invokevirtual   #45  <Method View el7rFragmentActivity.findViewById(int)>
        //    6   15:checkcast       #47  <Class LinearLayout>
        //    7   18:bipush          8
        //    8   20:invokevirtual   #51  <Method void LinearLayout.setVisibility(int)>
        //    9   23:aload_0         
        //   10   24:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //   11   27:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //   12   30:getfield        #38  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   13   33:ldc1            #52  <Int 0x7f060098>
        //   14   35:invokevirtual   #45  <Method View el7rFragmentActivity.findViewById(int)>
        //   15   38:checkcast       #54  <Class ViewPager3D>
        //   16   41:astore_3        
        //   17   42:new             #56  <Class DisplayMetrics>
        //   18   45:dup             
        //   19   46:invokespecial   #57  <Method void DisplayMetrics()>
        //   20   49:astore          4
        //   21   51:aload_0         
        //   22   52:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //   23   55:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //   24   58:getfield        #38  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   25   61:invokevirtual   #61  <Method WindowManager el7rFragmentActivity.getWindowManager()>
        //   26   64:invokeinterface #67  <Method Display WindowManager.getDefaultDisplay()>
        //   27   69:aload           4
        //   28   71:invokevirtual   #73  <Method void Display.getMetrics(DisplayMetrics)>
        //   29   74:aload           4
        //   30   76:getfield        #77  <Field int DisplayMetrics.widthPixels>
        //   31   79:i2f             
        //   32   80:aload           4
        //   33   82:getfield        #81  <Field float DisplayMetrics.xdpi>
        //   34   85:fdiv            
        //   35   86:f2d             
        //   36   87:ldc2w           #82  <Double 2D>
        //   37   90:invokestatic    #89  <Method double Math.pow(double, double)>
        //   38   93:aload           4
        //   39   95:getfield        #92  <Field int DisplayMetrics.heightPixels>
        //   40   98:i2f             
        //   41   99:aload           4
        //   42  101:getfield        #95  <Field float DisplayMetrics.ydpi>
        //   43  104:fdiv            
        //   44  105:f2d             
        //   45  106:ldc2w           #82  <Double 2D>
        //   46  109:invokestatic    #89  <Method double Math.pow(double, double)>
        //   47  112:dadd            
        //   48  113:invokestatic    #99  <Method double Math.sqrt(double)>
        //   49  116:ldc2w           #100 <Double 4.5D>
        //   50  119:dcmpl           
        //   51  120:ifle            128
        //   52  123:aload_3         
        //   53  124:iconst_1        
        //   54  125:invokevirtual   #105 <Method void ViewPager3D.setEnable3D(boolean)>
        // try 128 191 handler(s) 192
        //   55  128:aload_3         
        //   56  129:new             #107 <Class StoreFeaturedGalleryAdapter>
        //   57  132:dup             
        //   58  133:aload_0         
        //   59  134:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //   60  137:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //   61  140:getfield        #38  <Field el7rFragmentActivity StoreFeaturedFragment.mainActivity>
        //   62  143:aload_0         
        //   63  144:getfield        #22  <Field ArrayList val$banners>
        //   64  147:aload_0         
        //   65  148:getfield        #24  <Field ArrayList val$uniqueIDSList>
        //   66  151:invokespecial   #110 <Method void StoreFeaturedGalleryAdapter(android.content.Context, ArrayList, ArrayList)>
        //   67  154:invokevirtual   #114 <Method void ViewPager3D.setAdapter(android.support.v4.view.PagerAdapter)>
        //   68  157:aload_0         
        //   69  158:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //   70  161:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //   71  164:getfield        #118 <Field View StoreFeaturedFragment.view>
        //   72  167:ldc1            #119 <Int 0x7f060099>
        //   73  169:invokevirtual   #122 <Method View View.findViewById(int)>
        //   74  172:checkcast       #124 <Class CirclePageIndicator>
        //   75  175:aload_3         
        //   76  176:invokevirtual   #128 <Method void CirclePageIndicator.setViewPager(android.support.v4.view.ViewPager)>
        //   77  179:aload_3         
        //   78  180:new             #130 <Class StoreFeaturedFragment$2$2$1>
        //   79  183:dup             
        //   80  184:aload_0         
        //   81  185:invokespecial   #133 <Method void StoreFeaturedFragment$2$2$1(StoreFeaturedFragment$2$2)>
        //   82  188:invokevirtual   #137 <Method void ViewPager3D.setOnTouchListener(android.view.View$OnTouchListener)>
        //   83  191:return          
        // catch Exception Exception
        //   84  192:astore_1        
        //   85  193:aload_0         
        //   86  194:getfield        #20  <Field StoreFeaturedFragment$2 this$1>
        //   87  197:invokestatic    #32  <Method StoreFeaturedFragment StoreFeaturedFragment$2.access$0(StoreFeaturedFragment$2)>
        //   88  200:getfield        #141 <Field String StoreFeaturedFragment.TAG>
        //   89  203:aload_1         
        //   90  204:invokevirtual   #145 <Method String Exception.toString()>
        //   91  207:invokestatic    #151 <Method int Log.e(String, String)>
        //   92  210:pop             
        //   93  211:return          
        }

        final _cls2 this$1;
        private final ArrayList val$banners;
        private final ArrayList val$uniqueIDSList;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$2$2$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnTouchListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedFragment$2$2 this$2>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view1, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    2    4:tableswitch     0 1: default 28
        //                       0 30
        //                       1 39
        //    3   28:iconst_0        
        //    4   29:ireturn         
        //    5   30:getstatic       #33  <Field NoScrollViewPager StoreActivity.viewPager>
        //    6   33:invokevirtual   #38  <Method void NoScrollViewPager.disableScroll()>
        //    7   36:goto            28
        //    8   39:getstatic       #33  <Field NoScrollViewPager StoreActivity.viewPager>
        //    9   42:invokevirtual   #41  <Method void NoScrollViewPager.enableScroll()>
        //   10   45:goto            28
        }

        final _cls2 this$2;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StoreFeaturedFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Thread val$loadFeaturedThread>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StoreFeaturedFragment this$0>
        //    2    4:getfield        #31  <Field Boolean StoreFeaturedFragment.areWeOk>
        //    3    7:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
        //    4   10:ifeq            21
        //    5   13:aload_0         
        //    6   14:getfield        #21  <Field Thread val$loadFeaturedThread>
        //    7   17:invokevirtual   #42  <Method void Thread.start()>
        //    8   20:return          
        // try 21 27 handler(s) 30
        //    9   21:ldc2w           #43  <Long 100L>
        //   10   24:invokestatic    #48  <Method void Thread.sleep(long)>
        //   11   27:goto            0
        // catch InterruptedException
        //   12   30:astore_1        
        //   13   31:aload_1         
        //   14   32:invokevirtual   #51  <Method void InterruptedException.printStackTrace()>
        //   15   35:goto            0
        }

        final StoreFeaturedFragment this$0;
        private final Thread val$loadFeaturedThread;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$4

/* anonymous class */
    class _cls4
        implements Runnable
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field StoreFeaturedFragment this$0>
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

        static StoreFeaturedFragment access$0(_cls4 _pcls4)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field StoreFeaturedFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #23  <Field StoreFeaturedFragment this$0>
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
        //   14   33:astore          22
        //   15   35:aload           22
        //   16   37:astore          4
        //   17   39:aload           4
        //   18   41:ldc1            #71  <String "ERROR">
        //   19   43:if_acmpeq       51
        //   20   46:aload           4
        //   21   48:ifnonnull       144
        //   22   51:aload_0         
        //   23   52:getfield        #23  <Field StoreFeaturedFragment this$0>
        //   24   55:getfield        #74  <Field String StoreFeaturedFragment.TAG>
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
        //   35   82:new             #90  <Class StoreFeaturedFragment$4$1>
        //   36   85:dup             
        //   37   86:aload_0         
        //   38   87:aload_0         
        //   39   88:getfield        #27  <Field LinearLayout val$nocon_ll>
        //   40   91:aload_0         
        //   41   92:getfield        #29  <Field View val$view>
        //   42   95:aload_0         
        //   43   96:getfield        #25  <Field String val$type>
        //   44   99:invokespecial   #93  <Method void StoreFeaturedFragment$4$1(StoreFeaturedFragment$4, LinearLayout, View, String)>
        //   45  102:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //   46  105:pop             
        //   47  106:return          
        // catch Exception
        //   48  107:astore_2        
        //   49  108:aload_0         
        //   50  109:getfield        #23  <Field StoreFeaturedFragment this$0>
        //   51  112:getfield        #74  <Field String StoreFeaturedFragment.TAG>
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
        // try 171 182 handler(s) 313
        //   77  171:new             #107 <Class JSONArray>
        //   78  174:dup             
        //   79  175:aload           4
        //   80  177:invokespecial   #108 <Method void JSONArray(String)>
        //   81  180:astore          10
        //   82  182:iconst_0        
        //   83  183:istore          11
        // try 185 192 handler(s) 313
        //   84  185:aload           10
        //   85  187:invokevirtual   #112 <Method int JSONArray.length()>
        //   86  190:istore          14
        //   87  192:iload           11
        //   88  194:iload           14
        //   89  196:icmplt          229
        //   90  199:getstatic       #88  <Field Handler StoreActivity.UIHandler>
        //   91  202:new             #114 <Class StoreFeaturedFragment$4$2>
        //   92  205:dup             
        //   93  206:aload_0         
        //   94  207:aload_0         
        //   95  208:getfield        #29  <Field View val$view>
        //   96  211:aload           7
        //   97  213:aload           8
        //   98  215:aload           9
        //   99  217:aload_0         
        //  100  218:getfield        #25  <Field String val$type>
        //  101  221:invokespecial   #117 <Method void StoreFeaturedFragment$4$2(StoreFeaturedFragment$4, View, ArrayList, ArrayList, ArrayList, String)>
        //  102  224:invokevirtual   #99  <Method boolean Handler.post(Runnable)>
        //  103  227:pop             
        //  104  228:return          
        // try 229 274 handler(s) 313
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
        // try 274 282 handler(s) 288
        //  125  274:aload           8
        //  126  276:aload           16
        //  127  278:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
        //  128  281:pop             
        //  129  282:iinc            11  1
        //  130  285:goto            185
        // catch Exception
        //  131  288:astore          18
        // try 290 310 handler(s) 313
        //  132  290:getstatic       #138 <Field Activity StoreActivity.c>
        //  133  293:invokevirtual   #144 <Method android.content.res.Resources Activity.getResources()>
        //  134  296:ldc1            #145 <Int 0x7f02009c>
        //  135  298:invokestatic    #151 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
        //  136  301:pop             
        //  137  302:aload           8
        //  138  304:aload           16
        //  139  306:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
        //  140  309:pop             
        //  141  310:goto            282
        // catch Exception Exception Exception Exception
        //  142  313:astore          12
        //  143  315:aload           12
        //  144  317:invokevirtual   #154 <Method void Exception.printStackTrace()>
        //  145  320:goto            199
        }

        final StoreFeaturedFragment this$0;
        private final LinearLayout val$nocon_ll;
        private final String val$type;
        private final View val$view;

            static StoreFeaturedFragment access$0(_cls4 _pcls4)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #23  <Field StoreFeaturedFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$4$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field StoreFeaturedFragment$4 this$1>
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

        static _cls4 access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field StoreFeaturedFragment$4 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #23  <Field StoreFeaturedFragment$4 this$1>
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
        //    9   20:astore_1        
        //   10   21:aload_1         
        //   11   22:ifnull          45
        //   12   25:aload_1         
        //   13   26:new             #50  <Class StoreFeaturedFragment$4$1$1>
        //   14   29:dup             
        //   15   30:aload_0         
        //   16   31:aload_0         
        //   17   32:getfield        #29  <Field String val$type>
        //   18   35:aload_0         
        //   19   36:getfield        #27  <Field View val$view>
        //   20   39:invokespecial   #53  <Method void StoreFeaturedFragment$4$1$1(StoreFeaturedFragment$4$1, String, View)>
        //   21   42:invokevirtual   #57  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
        //   22   45:return          
        }

        final _cls4 this$1;
        private final LinearLayout val$nocon_ll;
        private final String val$type;
        private final View val$view;

            static _cls4 access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #23  <Field StoreFeaturedFragment$4 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$4$1$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StoreFeaturedFragment$4$1 this$2>
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
        //    1    1:getfield        #21  <Field StoreFeaturedFragment$4$1 this$2>
        //    2    4:invokestatic    #33  <Method StoreFeaturedFragment$4 StoreFeaturedFragment$4$1.access$0(StoreFeaturedFragment$4$1)>
        //    3    7:invokestatic    #38  <Method StoreFeaturedFragment StoreFeaturedFragment$4.access$0(StoreFeaturedFragment$4)>
        //    4   10:aload_0         
        //    5   11:getfield        #23  <Field String val$type>
        //    6   14:aload_0         
        //    7   15:getfield        #25  <Field View val$view>
        //    8   18:invokevirtual   #44  <Method void StoreFeaturedFragment.loadData(String, View)>
        //    9   21:return          
        }

        final _cls1 this$2;
        private final String val$type;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$4$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field StoreFeaturedFragment$4 this$1>
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

        static _cls4 access$0(_cls2 _pcls2)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field StoreFeaturedFragment$4 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #25  <Field StoreFeaturedFragment$4 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field View val$view>
        //    2    4:ldc1            #40  <Int 0x7f06009c>
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
        //   21   46:ldc1            #65  <Int 0x7f06009d>
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
        //   37   81:new             #85  <Class StoreFeaturedFragment$4$2$1>
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
        //   56  118:invokespecial   #91  <Method void StoreFeaturedFragment$4$2$1(StoreFeaturedFragment$4$2, Button, ProgressBar, ArrayAdapter, String, View, ArrayList, ArrayList, ArrayList)>
        //   57  121:invokevirtual   #95  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
        //   58  124:aload_2         
        //   59  125:aload_3         
        //   60  126:invokevirtual   #99  <Method void ListView.addFooterView(View)>
        //   61  129:aload_2         
        //   62  130:aload_1         
        //   63  131:invokevirtual   #103 <Method void ListView.setAdapter(android.widget.ListAdapter)>
        //   64  134:return          
        }

        final _cls4 this$1;
        private final ArrayList val$JSONObjects;
        private final ArrayList val$icons;
        private final ArrayList val$titlesList;
        private final String val$type;
        private final View val$view;

            static _cls4 access$0(_cls2 _pcls2)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #25  <Field StoreFeaturedFragment$4 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$4$2$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field StoreFeaturedFragment$4$2 this$2>
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
        //    9   18:getfield        #31  <Field StoreFeaturedFragment$4$2 this$2>
        //   10   21:invokestatic    #66  <Method StoreFeaturedFragment$4 StoreFeaturedFragment$4$2.access$0(StoreFeaturedFragment$4$2)>
        //   11   24:invokestatic    #71  <Method StoreFeaturedFragment StoreFeaturedFragment$4.access$0(StoreFeaturedFragment$4)>
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
        //   28   59:invokevirtual   #77  <Method void StoreFeaturedFragment.loadMoreItems(ArrayAdapter, String, View, ArrayList, ArrayList, ArrayList, Button, ProgressBar)>
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


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$5

/* anonymous class */
    class _cls5
        implements Runnable
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field StoreFeaturedFragment this$0>
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
        //   38   86:getfield        #31  <Field StoreFeaturedFragment this$0>
        //   39   89:getfield        #105 <Field String StoreFeaturedFragment.TAG>
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
        //   50  116:new             #115 <Class StoreFeaturedFragment$5$1>
        //   51  119:dup             
        //   52  120:aload_0         
        //   53  121:invokespecial   #118 <Method void StoreFeaturedFragment$5$1(StoreFeaturedFragment$5)>
        //   54  124:invokevirtual   #124 <Method boolean Handler.post(Runnable)>
        //   55  127:pop             
        //   56  128:return          
        // catch Exception
        //   57  129:astore_3        
        //   58  130:aload_0         
        //   59  131:getfield        #31  <Field StoreFeaturedFragment this$0>
        //   60  134:getfield        #105 <Field String StoreFeaturedFragment.TAG>
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
        //   92  204:new             #136 <Class StoreFeaturedFragment$5$2>
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
        //  108  235:invokespecial   #139 <Method void StoreFeaturedFragment$5$2(StoreFeaturedFragment$5, ArrayList, ArrayList, ArrayList, View, Button, ProgressBar, int)>
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

        final StoreFeaturedFragment this$0;
        private final ArrayList val$JSONObjects;
        private final ArrayList val$icons;
        private final Button val$moreBtn;
        private final int val$nextPage;
        private final ProgressBar val$thePb;
        private final ArrayList val$titlesList;
        private final String val$type;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$5$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedFragment$5 this$1>
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

        final _cls5 this$1;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedFragment$5$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #29  <Field StoreFeaturedFragment$5 this$1>
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
        //   14   29:ldc1            #58  <Int 0x7f06009d>
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

        final _cls5 this$1;
        private final ArrayList val$JSONObjects;
        private final int val$finalNewItems;
        private final ArrayList val$icons;
        private final Button val$moreBtn;
        private final ProgressBar val$thePb;
        private final ArrayList val$titlesList;
        private final View val$view;
    }

}
