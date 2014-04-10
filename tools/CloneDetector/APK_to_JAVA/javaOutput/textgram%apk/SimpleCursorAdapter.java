// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//            ResourceCursorAdapter

public class SimpleCursorAdapter extends ResourceCursorAdapter
{
    public static interface CursorToStringConverter
    {

        public abstract CharSequence convertToString(Cursor cursor);
    }

    public static interface ViewBinder
    {

        public abstract boolean setViewValue(View view, Cursor cursor, int i);
    }


    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String as[], int ai[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #21  <Method void ResourceCursorAdapter(Context, int, Cursor)>
    //    5    7:aload_0         
    //    6    8:iconst_m1       
    //    7    9:putfield        #23  <Field int mStringConversionColumn>
    //    8   12:aload_0         
    //    9   13:aload           5
    //   10   15:putfield        #25  <Field int[] mTo>
    //   11   18:aload_0         
    //   12   19:aload           4
    //   13   21:putfield        #27  <Field String[] mOriginalFrom>
    //   14   24:aload_0         
    //   15   25:aload           4
    //   16   27:invokespecial   #31  <Method void findColumns(String[])>
    //   17   30:return          
    }

    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String as[], int ai[], int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:iload           6
    //    5    6:invokespecial   #35  <Method void ResourceCursorAdapter(Context, int, Cursor, int)>
    //    6    9:aload_0         
    //    7   10:iconst_m1       
    //    8   11:putfield        #23  <Field int mStringConversionColumn>
    //    9   14:aload_0         
    //   10   15:aload           5
    //   11   17:putfield        #25  <Field int[] mTo>
    //   12   20:aload_0         
    //   13   21:aload           4
    //   14   23:putfield        #27  <Field String[] mOriginalFrom>
    //   15   26:aload_0         
    //   16   27:aload           4
    //   17   29:invokespecial   #31  <Method void findColumns(String[])>
    //   18   32:return          
    }

    private void findColumns(String as[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #39  <Field Cursor mCursor>
    //    2    4:ifnull          64
    //    3    7:aload_1         
    //    4    8:arraylength     
    //    5    9:istore_2        
    //    6   10:aload_0         
    //    7   11:getfield        #41  <Field int[] mFrom>
    //    8   14:ifnull          26
    //    9   17:aload_0         
    //   10   18:getfield        #41  <Field int[] mFrom>
    //   11   21:arraylength     
    //   12   22:iload_2         
    //   13   23:icmpeq          33
    //   14   26:aload_0         
    //   15   27:iload_2         
    //   16   28:newarray        int[]
    //   17   30:putfield        #41  <Field int[] mFrom>
    //   18   33:iconst_0        
    //   19   34:istore_3        
    //   20   35:iload_3         
    //   21   36:iload_2         
    //   22   37:icmpge          69
    //   23   40:aload_0         
    //   24   41:getfield        #41  <Field int[] mFrom>
    //   25   44:iload_3         
    //   26   45:aload_0         
    //   27   46:getfield        #39  <Field Cursor mCursor>
    //   28   49:aload_1         
    //   29   50:iload_3         
    //   30   51:aaload          
    //   31   52:invokeinterface #47  <Method int Cursor.getColumnIndexOrThrow(String)>
    //   32   57:iastore         
    //   33   58:iinc            3  1
    //   34   61:goto            35
    //   35   64:aload_0         
    //   36   65:aconst_null     
    //   37   66:putfield        #41  <Field int[] mFrom>
    //   38   69:return          
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
    //    2    4:astore          4
    //    3    6:aload_0         
    //    4    7:getfield        #25  <Field int[] mTo>
    //    5   10:arraylength     
    //    6   11:istore          5
    //    7   13:aload_0         
    //    8   14:getfield        #41  <Field int[] mFrom>
    //    9   17:astore          6
    //   10   19:aload_0         
    //   11   20:getfield        #25  <Field int[] mTo>
    //   12   23:astore          7
    //   13   25:iconst_0        
    //   14   26:istore          8
    //   15   28:iload           8
    //   16   30:iload           5
    //   17   32:icmpge          189
    //   18   35:aload_1         
    //   19   36:aload           7
    //   20   38:iload           8
    //   21   40:iaload          
    //   22   41:invokevirtual   #57  <Method View View.findViewById(int)>
    //   23   44:astore          9
    //   24   46:aload           9
    //   25   48:ifnull          122
    //   26   51:iconst_0        
    //   27   52:istore          10
    //   28   54:aload           4
    //   29   56:ifnull          76
    //   30   59:aload           4
    //   31   61:aload           9
    //   32   63:aload_3         
    //   33   64:aload           6
    //   34   66:iload           8
    //   35   68:iaload          
    //   36   69:invokeinterface #63  <Method boolean SimpleCursorAdapter$ViewBinder.setViewValue(View, Cursor, int)>
    //   37   74:istore          10
    //   38   76:iload           10
    //   39   78:ifne            122
    //   40   81:aload_3         
    //   41   82:aload           6
    //   42   84:iload           8
    //   43   86:iaload          
    //   44   87:invokeinterface #67  <Method String Cursor.getString(int)>
    //   45   92:astore          11
    //   46   94:aload           11
    //   47   96:ifnonnull       103
    //   48   99:ldc1            #69  <String "">
    //   49  101:astore          11
    //   50  103:aload           9
    //   51  105:instanceof      #71  <Class TextView>
    //   52  108:ifeq            128
    //   53  111:aload_0         
    //   54  112:aload           9
    //   55  114:checkcast       #71  <Class TextView>
    //   56  117:aload           11
    //   57  119:invokevirtual   #75  <Method void setViewText(TextView, String)>
    //   58  122:iinc            8  1
    //   59  125:goto            28
    //   60  128:aload           9
    //   61  130:instanceof      #77  <Class ImageView>
    //   62  133:ifeq            150
    //   63  136:aload_0         
    //   64  137:aload           9
    //   65  139:checkcast       #77  <Class ImageView>
    //   66  142:aload           11
    //   67  144:invokevirtual   #81  <Method void setViewImage(ImageView, String)>
    //   68  147:goto            122
    //   69  150:new             #83  <Class IllegalStateException>
    //   70  153:dup             
    //   71  154:new             #85  <Class StringBuilder>
    //   72  157:dup             
    //   73  158:invokespecial   #88  <Method void StringBuilder()>
    //   74  161:aload           9
    //   75  163:invokevirtual   #94  <Method Class Object.getClass()>
    //   76  166:invokevirtual   #100 <Method String Class.getName()>
    //   77  169:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   78  172:ldc1            #106 <String " is not a ">
    //   79  174:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   80  177:ldc1            #108 <String " view that can be bounds by this SimpleCursorAdapter">
    //   81  179:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   82  182:invokevirtual   #111 <Method String StringBuilder.toString()>
    //   83  185:invokespecial   #114 <Method void IllegalStateException(String)>
    //   84  188:athrow          
    //   85  189:return          
    }

    public void changeCursorAndColumns(Cursor cursor, String as[], int ai[])
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:putfield        #27  <Field String[] mOriginalFrom>
    //    3    5:aload_0         
    //    4    6:aload_3         
    //    5    7:putfield        #25  <Field int[] mTo>
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:invokespecial   #120 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
    //    9   15:aload_0         
    //   10   16:aload_0         
    //   11   17:getfield        #27  <Field String[] mOriginalFrom>
    //   12   20:invokespecial   #31  <Method void findColumns(String[])>
    //   13   23:return          
    }

    public CharSequence convertToString(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #124 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
    //    5   11:aload_1         
    //    6   12:invokeinterface #128 <Method CharSequence SimpleCursorAdapter$CursorToStringConverter.convertToString(Cursor)>
    //    7   17:areturn         
    //    8   18:aload_0         
    //    9   19:getfield        #23  <Field int mStringConversionColumn>
    //   10   22:iconst_m1       
    //   11   23:icmple          37
    //   12   26:aload_1         
    //   13   27:aload_0         
    //   14   28:getfield        #23  <Field int mStringConversionColumn>
    //   15   31:invokeinterface #67  <Method String Cursor.getString(int)>
    //   16   36:areturn         
    //   17   37:aload_0         
    //   18   38:aload_1         
    //   19   39:invokespecial   #129 <Method CharSequence ResourceCursorAdapter.convertToString(Cursor)>
    //   20   42:areturn         
    }

    public CursorToStringConverter getCursorToStringConverter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
    //    2    4:areturn         
    }

    public int getStringConversionColumn()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field int mStringConversionColumn>
    //    2    4:ireturn         
    }

    public ViewBinder getViewBinder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
    //    2    4:areturn         
    }

    public void setCursorToStringConverter(CursorToStringConverter cursortostringconverter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #124 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
    //    3    5:return          
    }

    public void setStringConversionColumn(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #23  <Field int mStringConversionColumn>
    //    3    5:return          
    }

    public void setViewBinder(ViewBinder viewbinder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #51  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
    //    3    5:return          
    }

    public void setViewImage(ImageView imageview, String s)
    {
    // try 0 8 handler(s) 9
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokestatic    #148 <Method int Integer.parseInt(String)>
    //    3    5:invokevirtual   #151 <Method void ImageView.setImageResource(int)>
    //    4    8:return          
    // catch NumberFormatException
    //    5    9:astore_3        
    //    6   10:aload_1         
    //    7   11:aload_2         
    //    8   12:invokestatic    #157 <Method Uri Uri.parse(String)>
    //    9   15:invokevirtual   #161 <Method void ImageView.setImageURI(Uri)>
    //   10   18:return          
    }

    public void setViewText(TextView textview, String s)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
    //    3    5:return          
    }

    public Cursor swapCursor(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #169 <Method Cursor ResourceCursorAdapter.swapCursor(Cursor)>
    //    3    5:astore_2        
    //    4    6:aload_0         
    //    5    7:aload_0         
    //    6    8:getfield        #27  <Field String[] mOriginalFrom>
    //    7   11:invokespecial   #31  <Method void findColumns(String[])>
    //    8   14:aload_2         
    //    9   15:areturn         
    }

    private CursorToStringConverter mCursorToStringConverter;
    protected int mFrom[];
    String mOriginalFrom[];
    private int mStringConversionColumn;
    protected int mTo[];
    private ViewBinder mViewBinder;
}
