// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.store;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.*;
import android.widget.*;
import codeadore.textgram.StoreActivity;
import codeadore.textgram.lazylist.ImageLoader;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram.store:
//            StorePackages

public class StoreArrayAdapter extends ArrayAdapter
{

    public StoreArrayAdapter(Context context, int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload           5
    //    4    5:invokespecial   #19  <Method void ArrayAdapter(Context, int, java.util.List)>
    //    5    8:aload_0         
    //    6    9:aload           5
    //    7   11:putfield        #21  <Field ArrayList titlesList>
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:putfield        #23  <Field ArrayList JSONObjects>
    //   11   19:aload_0         
    //   12   20:aload           4
    //   13   22:putfield        #25  <Field ArrayList iconsList>
    //   14   25:aload_0         
    //   15   26:new             #27  <Class ImageLoader>
    //   16   29:dup             
    //   17   30:aload_1         
    //   18   31:invokevirtual   #33  <Method Context Context.getApplicationContext()>
    //   19   34:invokespecial   #36  <Method void ImageLoader(Context)>
    //   20   37:putfield        #38  <Field ImageLoader imageLoader>
    //   21   40:return          
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_2         
    //    1    1:astore          4
    //    2    3:aload           4
    //    3    5:ifnonnull       287
    //    4    8:aconst_null     
    //    5    9:astore          5
    //    6   11:aconst_null     
    //    7   12:astore          6
    //    8   14:aconst_null     
    //    9   15:astore          7
    // try 17 88 handler(s) 290
    //   10   17:aload_0         
    //   11   18:getfield        #23  <Field ArrayList JSONObjects>
    //   12   21:iload_1         
    //   13   22:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   14   25:checkcast       #50  <Class JSONObject>
    //   15   28:ldc1            #52  <String "author_name">
    //   16   30:invokevirtual   #56  <Method String JSONObject.getString(String)>
    //   17   33:astore          6
    //   18   35:aload_0         
    //   19   36:getfield        #23  <Field ArrayList JSONObjects>
    //   20   39:iload_1         
    //   21   40:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   22   43:checkcast       #50  <Class JSONObject>
    //   23   46:ldc1            #58  <String "title">
    //   24   48:invokevirtual   #56  <Method String JSONObject.getString(String)>
    //   25   51:astore          7
    //   26   53:aload_0         
    //   27   54:getfield        #23  <Field ArrayList JSONObjects>
    //   28   57:iload_1         
    //   29   58:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   30   61:checkcast       #50  <Class JSONObject>
    //   31   64:ldc1            #60  <String "unique_id">
    //   32   66:invokevirtual   #56  <Method String JSONObject.getString(String)>
    //   33   69:astore          5
    //   34   71:aload_0         
    //   35   72:getfield        #23  <Field ArrayList JSONObjects>
    //   36   75:iload_1         
    //   37   76:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   38   79:checkcast       #50  <Class JSONObject>
    //   39   82:ldc1            #62  <String "purchased">
    //   40   84:invokevirtual   #56  <Method String JSONObject.getString(String)>
    //   41   87:pop             
    //   42   88:getstatic       #68  <Field Activity StoreActivity.c>
    //   43   91:ldc1            #70  <String "layout_inflater">
    //   44   93:invokevirtual   #76  <Method Object Activity.getSystemService(String)>
    //   45   96:checkcast       #78  <Class LayoutInflater>
    //   46   99:ldc1            #79  <Int 0x7f030030>
    //   47  101:aconst_null     
    //   48  102:invokevirtual   #83  <Method View LayoutInflater.inflate(int, ViewGroup)>
    //   49  105:astore          4
    //   50  107:aload           4
    //   51  109:ldc1            #84  <Int 0x7f0600ab>
    //   52  111:invokevirtual   #90  <Method View View.findViewById(int)>
    //   53  114:checkcast       #92  <Class TextView>
    //   54  117:aload           7
    //   55  119:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
    //   56  122:aload           4
    //   57  124:ldc1            #97  <Int 0x7f0600ac>
    //   58  126:invokevirtual   #90  <Method View View.findViewById(int)>
    //   59  129:checkcast       #92  <Class TextView>
    //   60  132:aload           6
    //   61  134:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
    //   62  137:aload           4
    //   63  139:ldc1            #98  <Int 0x7f0600aa>
    //   64  141:invokevirtual   #90  <Method View View.findViewById(int)>
    //   65  144:checkcast       #100 <Class ImageView>
    //   66  147:astore          9
    //   67  149:aload_0         
    //   68  150:getfield        #38  <Field ImageLoader imageLoader>
    //   69  153:aload_0         
    //   70  154:getfield        #25  <Field ArrayList iconsList>
    //   71  157:iload_1         
    //   72  158:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   73  161:checkcast       #102 <Class String>
    //   74  164:aload           9
    //   75  166:invokevirtual   #106 <Method void ImageLoader.DisplayImage(String, ImageView)>
    //   76  169:aload           4
    //   77  171:ldc1            #107 <Int 0x7f0600ad>
    //   78  173:invokevirtual   #90  <Method View View.findViewById(int)>
    //   79  176:checkcast       #109 <Class Button>
    //   80  179:astore          10
    //   81  181:aload           5
    //   82  183:invokestatic    #115 <Method boolean StorePackages.isInstalled(String)>
    //   83  186:ifeq            300
    //   84  189:aload           10
    //   85  191:ldc1            #117 <String "INSTALLED">
    //   86  193:invokevirtual   #118 <Method void Button.setText(CharSequence)>
    //   87  196:aload           10
    //   88  198:aload_0         
    //   89  199:invokevirtual   #121 <Method Context getContext()>
    //   90  202:invokevirtual   #125 <Method Resources Context.getResources()>
    //   91  205:ldc1            #126 <Int 0x7f0200b4>
    //   92  207:invokevirtual   #132 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
    //   93  210:aconst_null     
    //   94  211:aconst_null     
    //   95  212:aconst_null     
    //   96  213:invokevirtual   #136 <Method void Button.setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable)>
    //   97  216:aload           5
    //   98  218:astore          11
    //   99  220:new             #138 <Class StoreArrayAdapter$1>
    //  100  223:dup             
    //  101  224:aload_0         
    //  102  225:aload           11
    //  103  227:invokespecial   #141 <Method void StoreArrayAdapter$1(StoreArrayAdapter, String)>
    //  104  230:astore          12
    //  105  232:aload           10
    //  106  234:aload           12
    //  107  236:invokevirtual   #145 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  108  239:aload           4
    //  109  241:ldc1            #146 <Int 0x7f0600a9>
    //  110  243:invokevirtual   #90  <Method View View.findViewById(int)>
    //  111  246:checkcast       #148 <Class LinearLayout>
    //  112  249:astore          13
    //  113  251:new             #150 <Class StoreArrayAdapter$2>
    //  114  254:dup             
    //  115  255:aload_0         
    //  116  256:aload           11
    //  117  258:invokespecial   #151 <Method void StoreArrayAdapter$2(StoreArrayAdapter, String)>
    //  118  261:astore          14
    //  119  263:aload           13
    //  120  265:aload           14
    //  121  267:invokevirtual   #152 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
    //  122  270:new             #154 <Class StoreArrayAdapter$3>
    //  123  273:dup             
    //  124  274:aload_0         
    //  125  275:invokespecial   #157 <Method void StoreArrayAdapter$3(StoreArrayAdapter)>
    //  126  278:astore          15
    //  127  280:aload           13
    //  128  282:aload           15
    //  129  284:invokevirtual   #161 <Method void LinearLayout.setOnTouchListener(android.view.View$OnTouchListener)>
    //  130  287:aload           4
    //  131  289:areturn         
    // catch JSONException
    //  132  290:astore          8
    //  133  292:aload           8
    //  134  294:invokevirtual   #165 <Method void JSONException.printStackTrace()>
    //  135  297:goto            88
    //  136  300:aload           10
    //  137  302:ldc1            #167 <String "FREE">
    //  138  304:invokevirtual   #118 <Method void Button.setText(CharSequence)>
    //  139  307:goto            216
    }

    ArrayList JSONObjects;
    ArrayList iconsList;
    ImageLoader imageLoader;
    ArrayList titlesList;
    ArrayList uniqueIDSList;

    // Unreferenced inner class codeadore/textgram/store/StoreArrayAdapter$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StoreArrayAdapter this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field String val$finalUniqueID>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field String val$finalUniqueID>
        //    2    4:invokestatic    #32  <Method void StoreActivity.viewItem(String)>
        //    3    7:return          
        }

        final StoreArrayAdapter this$0;
        private final String val$finalUniqueID;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreArrayAdapter$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StoreArrayAdapter this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field String val$finalUniqueID>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field String val$finalUniqueID>
        //    2    4:invokestatic    #32  <Method void StoreActivity.viewItem(String)>
        //    3    7:return          
        }

        final StoreArrayAdapter this$0;
        private final String val$finalUniqueID;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreArrayAdapter$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnTouchListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreArrayAdapter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #28  <Method int MotionEvent.getAction()>
        //    2    4:ifne            18
        //    3    7:aload_1         
        //    4    8:ldc1            #30  <String "#DDDDDD">
        //    5   10:invokestatic    #36  <Method int Color.parseColor(String)>
        //    6   13:invokevirtual   #42  <Method void View.setBackgroundColor(int)>
        //    7   16:iconst_0        
        //    8   17:ireturn         
        //    9   18:aload_1         
        //   10   19:ldc1            #44  <String "#EAEAEA">
        //   11   21:invokestatic    #36  <Method int Color.parseColor(String)>
        //   12   24:invokevirtual   #42  <Method void View.setBackgroundColor(int)>
        //   13   27:goto            16
        }

        final StoreArrayAdapter this$0;
    }

}
