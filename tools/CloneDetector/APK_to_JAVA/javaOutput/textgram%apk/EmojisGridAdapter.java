// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.adapters;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import codeadore.textgram.el7rUtilities;
import java.io.File;
import java.io.IOException;

public class EmojisGridAdapter extends BaseAdapter
{

    public EmojisGridAdapter(Context context1, String s, WindowManager windowmanager)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #23  <Method void BaseAdapter()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #25  <Field int gcCount>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #27  <Field Context context>
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:putfield        #29  <Field WindowManager windowManager>
    //   11   19:aload_0         
    //   12   20:aload_0         
    //   13   21:getfield        #27  <Field Context context>
    //   14   24:ldc1            #31  <String "layout_inflater">
    //   15   26:invokevirtual   #37  <Method Object Context.getSystemService(String)>
    //   16   29:checkcast       #39  <Class LayoutInflater>
    //   17   32:putfield        #41  <Field LayoutInflater mInflater>
    //   18   35:aload_0         
    //   19   36:aload_2         
    //   20   37:putfield        #43  <Field String category>
    // try 40 60 handler(s) 98
    //   21   40:aload_0         
    //   22   41:getfield        #43  <Field String category>
    //   23   44:ifnonnull       61
    //   24   47:aload_0         
    //   25   48:aload_1         
    //   26   49:invokevirtual   #47  <Method AssetManager Context.getAssets()>
    //   27   52:ldc1            #49  <String "emojis">
    //   28   54:invokevirtual   #55  <Method String[] AssetManager.list(String)>
    //   29   57:putfield        #57  <Field String[] faces_list>
    //   30   60:return          
    // try 61 97 handler(s) 98
    //   31   61:aload_0         
    //   32   62:aload_1         
    //   33   63:invokevirtual   #47  <Method AssetManager Context.getAssets()>
    //   34   66:new             #59  <Class StringBuilder>
    //   35   69:dup             
    //   36   70:ldc1            #49  <String "emojis">
    //   37   72:invokespecial   #62  <Method void StringBuilder(String)>
    //   38   75:getstatic       #67  <Field String File.separator>
    //   39   78:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   40   81:aload_0         
    //   41   82:getfield        #43  <Field String category>
    //   42   85:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   43   88:invokevirtual   #75  <Method String StringBuilder.toString()>
    //   44   91:invokevirtual   #55  <Method String[] AssetManager.list(String)>
    //   45   94:putfield        #57  <Field String[] faces_list>
    //   46   97:return          
    // catch IOException IOException
    //   47   98:astore          4
    //   48  100:aload           4
    //   49  102:invokevirtual   #78  <Method void IOException.printStackTrace()>
    //   50  105:return          
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field String[] faces_list>
    //    2    4:arraylength     
    //    3    5:ireturn         
    }

    public String getFaceItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field String[] faces_list>
    //    2    4:iload_1         
    //    3    5:aaload          
    //    4    6:areturn         
    }

    public Object getItem(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #90  <Method Integer Integer.valueOf(int)>
    //    2    4:areturn         
    }

    public long getItemId(int i)
    {
    //    0    0:iload_1         
    //    1    1:i2l             
    //    2    2:lreturn         
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_2         
    //    1    1:ifnonnull       175
    //    2    4:aload_0         
    //    3    5:getfield        #41  <Field LayoutInflater mInflater>
    //    4    8:ldc1            #97  <Int 0x7f030027>
    //    5   10:aload_3         
    //    6   11:iconst_0        
    //    7   12:invokevirtual   #101 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    8   15:astore          4
    //    9   17:aload           4
    //   10   19:ldc1            #102 <Int 0x7f060089>
    //   11   21:invokevirtual   #108 <Method View View.findViewById(int)>
    //   12   24:checkcast       #110 <Class ImageView>
    //   13   27:astore          5
    //   14   29:new             #112 <Class DisplayMetrics>
    //   15   32:dup             
    //   16   33:invokespecial   #113 <Method void DisplayMetrics()>
    //   17   36:astore          6
    //   18   38:aload_0         
    //   19   39:getfield        #29  <Field WindowManager windowManager>
    //   20   42:invokeinterface #119 <Method Display WindowManager.getDefaultDisplay()>
    //   21   47:aload           6
    //   22   49:invokevirtual   #125 <Method void Display.getMetrics(DisplayMetrics)>
    //   23   52:aload           6
    //   24   54:getfield        #128 <Field int DisplayMetrics.heightPixels>
    //   25   57:pop             
    //   26   58:aload           6
    //   27   60:getfield        #131 <Field int DisplayMetrics.widthPixels>
    //   28   63:istore          8
    //   29   65:ldc1            #132 <Float 8.169935F>
    //   30   67:ldc1            #133 <Float 100F>
    //   31   69:fdiv            
    //   32   70:iload           8
    //   33   72:i2f             
    //   34   73:fmul            
    //   35   74:invokestatic    #138 <Method String String.valueOf(float)>
    //   36   77:astore          9
    //   37   79:aload           9
    //   38   81:iconst_0        
    //   39   82:aload           9
    //   40   84:ldc1            #140 <String ".">
    //   41   86:invokevirtual   #144 <Method int String.lastIndexOf(String)>
    //   42   89:invokevirtual   #148 <Method String String.substring(int, int)>
    //   43   92:invokestatic    #151 <Method Integer Integer.valueOf(String)>
    //   44   95:invokevirtual   #154 <Method int Integer.intValue()>
    //   45   98:istore          10
    //   46  100:aload_0         
    //   47  101:getfield        #27  <Field Context context>
    //   48  104:new             #59  <Class StringBuilder>
    //   49  107:dup             
    //   50  108:ldc1            #49  <String "emojis">
    //   51  110:invokespecial   #62  <Method void StringBuilder(String)>
    //   52  113:getstatic       #67  <Field String File.separator>
    //   53  116:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   54  119:aload_0         
    //   55  120:getfield        #43  <Field String category>
    //   56  123:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   57  126:getstatic       #67  <Field String File.separator>
    //   58  129:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   59  132:aload_0         
    //   60  133:getfield        #57  <Field String[] faces_list>
    //   61  136:iload_1         
    //   62  137:aaload          
    //   63  138:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   64  141:invokevirtual   #75  <Method String StringBuilder.toString()>
    //   65  144:invokestatic    #160 <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
    //   66  147:astore          11
    // try 149 161 handler(s) 181
    //   67  149:aload           11
    //   68  151:iload           10
    //   69  153:iload           10
    //   70  155:iconst_0        
    //   71  156:invokestatic    #166 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   72  159:astore          13
    //   73  161:aload           13
    //   74  163:astore          11
    //   75  165:aload           5
    //   76  167:aload           11
    //   77  169:invokevirtual   #170 <Method void ImageView.setImageBitmap(Bitmap)>
    //   78  172:aload           4
    //   79  174:areturn         
    //   80  175:aload_2         
    //   81  176:astore          4
    //   82  178:goto            17
    // catch Exception
    //   83  181:astore          12
    //   84  183:aload           12
    //   85  185:invokevirtual   #171 <Method void Exception.printStackTrace()>
    //   86  188:goto            165
    }

    String category;
    Context context;
    String faces_list[];
    int gcCount;
    LayoutInflater mInflater;
    WindowManager windowManager;
}
