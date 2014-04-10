// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.database.*;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

// Referenced classes of package android.support.v4.widget:
//            CursorFilter

public abstract class CursorAdapter extends BaseAdapter
    implements Filterable, CursorFilter.CursorFilterClient
{
    private class ChangeObserver extends ContentObserver
    {

        public ChangeObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field CursorAdapter this$0>
        //    3    5:aload_0         
        //    4    6:new             #12  <Class Handler>
        //    5    9:dup             
        //    6   10:invokespecial   #15  <Method void Handler()>
        //    7   13:invokespecial   #18  <Method void ContentObserver(Handler)>
        //    8   16:return          
        }

        public boolean deliverSelfNotifications()
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public void onChange(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field CursorAdapter this$0>
        //    2    4:invokevirtual   #27  <Method void CursorAdapter.onContentChanged()>
        //    3    7:return          
        }

        final CursorAdapter this$0;
    }

    private class MyDataSetObserver extends DataSetObserver
    {

        private MyDataSetObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field CursorAdapter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void DataSetObserver()>
        //    5    9:return          
        }

        MyDataSetObserver(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void CursorAdapter$MyDataSetObserver(CursorAdapter)>
        //    3    5:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field CursorAdapter this$0>
        //    2    4:iconst_1        
        //    3    5:putfield        #23  <Field boolean CursorAdapter.mDataValid>
        //    4    8:aload_0         
        //    5    9:getfield        #10  <Field CursorAdapter this$0>
        //    6   12:invokevirtual   #26  <Method void CursorAdapter.notifyDataSetChanged()>
        //    7   15:return          
        }

        public void onInvalidated()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field CursorAdapter this$0>
        //    2    4:iconst_0        
        //    3    5:putfield        #23  <Field boolean CursorAdapter.mDataValid>
        //    4    8:aload_0         
        //    5    9:getfield        #10  <Field CursorAdapter this$0>
        //    6   12:invokevirtual   #30  <Method void CursorAdapter.notifyDataSetInvalidated()>
        //    7   15:return          
        }

        final CursorAdapter this$0;
    }


    public CursorAdapter(Context context, Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void BaseAdapter()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:aload_2         
    //    5    7:iconst_1        
    //    6    8:invokevirtual   #39  <Method void init(Context, Cursor, int)>
    //    7   11:return          
    }

    public CursorAdapter(Context context, Cursor cursor, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void BaseAdapter()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:aload_2         
    //    5    7:iload_3         
    //    6    8:invokevirtual   #39  <Method void init(Context, Cursor, int)>
    //    7   11:return          
    }

    public CursorAdapter(Context context, Cursor cursor, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void BaseAdapter()>
    //    2    4:iload_3         
    //    3    5:ifeq            20
    //    4    8:iconst_1        
    //    5    9:istore          4
    //    6   11:aload_0         
    //    7   12:aload_1         
    //    8   13:aload_2         
    //    9   14:iload           4
    //   10   16:invokevirtual   #39  <Method void init(Context, Cursor, int)>
    //   11   19:return          
    //   12   20:iconst_2        
    //   13   21:istore          4
    //   14   23:goto            11
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #48  <Method Cursor swapCursor(Cursor)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnull          16
    //    6   10:aload_2         
    //    7   11:invokeinterface #53  <Method void Cursor.close()>
    //    8   16:return          
    }

    public CharSequence convertToString(Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       7
    //    2    4:ldc1            #57  <String "">
    //    3    6:areturn         
    //    4    7:aload_1         
    //    5    8:invokevirtual   #63  <Method String Object.toString()>
    //    6   11:areturn         
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field boolean mDataValid>
    //    2    4:ifeq            24
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field Cursor mCursor>
    //    5   11:ifnull          24
    //    6   14:aload_0         
    //    7   15:getfield        #69  <Field Cursor mCursor>
    //    8   18:invokeinterface #71  <Method int Cursor.getCount()>
    //    9   23:ireturn         
    //   10   24:iconst_0        
    //   11   25:ireturn         
    }

    public Cursor getCursor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field Cursor mCursor>
    //    2    4:areturn         
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field boolean mDataValid>
    //    2    4:ifeq            60
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field Cursor mCursor>
    //    5   11:iload_1         
    //    6   12:invokeinterface #79  <Method boolean Cursor.moveToPosition(int)>
    //    7   17:pop             
    //    8   18:aload_2         
    //    9   19:ifnonnull       54
    //   10   22:aload_0         
    //   11   23:aload_0         
    //   12   24:getfield        #81  <Field Context mContext>
    //   13   27:aload_0         
    //   14   28:getfield        #69  <Field Cursor mCursor>
    //   15   31:aload_3         
    //   16   32:invokevirtual   #85  <Method View newDropDownView(Context, Cursor, ViewGroup)>
    //   17   35:astore          5
    //   18   37:aload_0         
    //   19   38:aload           5
    //   20   40:aload_0         
    //   21   41:getfield        #81  <Field Context mContext>
    //   22   44:aload_0         
    //   23   45:getfield        #69  <Field Cursor mCursor>
    //   24   48:invokevirtual   #87  <Method void bindView(View, Context, Cursor)>
    //   25   51:aload           5
    //   26   53:areturn         
    //   27   54:aload_2         
    //   28   55:astore          5
    //   29   57:goto            37
    //   30   60:aconst_null     
    //   31   61:areturn         
    }

    public Filter getFilter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field CursorFilter mCursorFilter>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #93  <Class CursorFilter>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #96  <Method void CursorFilter(CursorFilter$CursorFilterClient)>
    //    8   16:putfield        #91  <Field CursorFilter mCursorFilter>
    //    9   19:aload_0         
    //   10   20:getfield        #91  <Field CursorFilter mCursorFilter>
    //   11   23:areturn         
    }

    public FilterQueryProvider getFilterQueryProvider()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field FilterQueryProvider mFilterQueryProvider>
    //    2    4:areturn         
    }

    public Object getItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field boolean mDataValid>
    //    2    4:ifeq            30
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field Cursor mCursor>
    //    5   11:ifnull          30
    //    6   14:aload_0         
    //    7   15:getfield        #69  <Field Cursor mCursor>
    //    8   18:iload_1         
    //    9   19:invokeinterface #79  <Method boolean Cursor.moveToPosition(int)>
    //   10   24:pop             
    //   11   25:aload_0         
    //   12   26:getfield        #69  <Field Cursor mCursor>
    //   13   29:areturn         
    //   14   30:aconst_null     
    //   15   31:areturn         
    }

    public long getItemId(int i)
    {
    //    0    0:lconst_0        
    //    1    1:lstore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #67  <Field boolean mDataValid>
    //    4    6:ifeq            43
    //    5    9:aload_0         
    //    6   10:getfield        #69  <Field Cursor mCursor>
    //    7   13:ifnull          43
    //    8   16:aload_0         
    //    9   17:getfield        #69  <Field Cursor mCursor>
    //   10   20:iload_1         
    //   11   21:invokeinterface #79  <Method boolean Cursor.moveToPosition(int)>
    //   12   26:ifeq            43
    //   13   29:aload_0         
    //   14   30:getfield        #69  <Field Cursor mCursor>
    //   15   33:aload_0         
    //   16   34:getfield        #106 <Field int mRowIDColumn>
    //   17   37:invokeinterface #109 <Method long Cursor.getLong(int)>
    //   18   42:lstore_2        
    //   19   43:lload_2         
    //   20   44:lreturn         
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field boolean mDataValid>
    //    2    4:ifne            17
    //    3    7:new             #112 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #114 <String "this should only be called when the cursor is valid">
    //    6   13:invokespecial   #117 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #69  <Field Cursor mCursor>
    //   10   21:iload_1         
    //   11   22:invokeinterface #79  <Method boolean Cursor.moveToPosition(int)>
    //   12   27:ifne            57
    //   13   30:new             #112 <Class IllegalStateException>
    //   14   33:dup             
    //   15   34:new             #119 <Class StringBuilder>
    //   16   37:dup             
    //   17   38:invokespecial   #120 <Method void StringBuilder()>
    //   18   41:ldc1            #122 <String "couldn't move cursor to position ">
    //   19   43:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //   20   46:iload_1         
    //   21   47:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
    //   22   50:invokevirtual   #130 <Method String StringBuilder.toString()>
    //   23   53:invokespecial   #117 <Method void IllegalStateException(String)>
    //   24   56:athrow          
    //   25   57:aload_2         
    //   26   58:ifnonnull       93
    //   27   61:aload_0         
    //   28   62:aload_0         
    //   29   63:getfield        #81  <Field Context mContext>
    //   30   66:aload_0         
    //   31   67:getfield        #69  <Field Cursor mCursor>
    //   32   70:aload_3         
    //   33   71:invokevirtual   #133 <Method View newView(Context, Cursor, ViewGroup)>
    //   34   74:astore          4
    //   35   76:aload_0         
    //   36   77:aload           4
    //   37   79:aload_0         
    //   38   80:getfield        #81  <Field Context mContext>
    //   39   83:aload_0         
    //   40   84:getfield        #69  <Field Cursor mCursor>
    //   41   87:invokevirtual   #87  <Method void bindView(View, Context, Cursor)>
    //   42   90:aload           4
    //   43   92:areturn         
    //   44   93:aload_2         
    //   45   94:astore          4
    //   46   96:goto            76
    }

    public boolean hasStableIds()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    void init(Context context, Cursor cursor, int i)
    {
    //    0    0:iconst_1        
    //    1    1:istore          4
    //    2    3:iload_3         
    //    3    4:iconst_1        
    //    4    5:iand            
    //    5    6:iload           4
    //    6    8:icmpne          134
    //    7   11:iload_3         
    //    8   12:iconst_2        
    //    9   13:ior             
    //   10   14:istore_3        
    //   11   15:aload_0         
    //   12   16:iload           4
    //   13   18:putfield        #137 <Field boolean mAutoRequery>
    //   14   21:aload_2         
    //   15   22:ifnull          142
    //   16   25:aload_0         
    //   17   26:aload_2         
    //   18   27:putfield        #69  <Field Cursor mCursor>
    //   19   30:aload_0         
    //   20   31:iload           4
    //   21   33:putfield        #67  <Field boolean mDataValid>
    //   22   36:aload_0         
    //   23   37:aload_1         
    //   24   38:putfield        #81  <Field Context mContext>
    //   25   41:iload           4
    //   26   43:ifeq            148
    //   27   46:aload_2         
    //   28   47:ldc1            #139 <String "_id">
    //   29   49:invokeinterface #143 <Method int Cursor.getColumnIndexOrThrow(String)>
    //   30   54:istore          5
    //   31   56:aload_0         
    //   32   57:iload           5
    //   33   59:putfield        #106 <Field int mRowIDColumn>
    //   34   62:iload_3         
    //   35   63:iconst_2        
    //   36   64:iand            
    //   37   65:iconst_2        
    //   38   66:icmpne          154
    //   39   69:aload_0         
    //   40   70:new             #145 <Class CursorAdapter$ChangeObserver>
    //   41   73:dup             
    //   42   74:aload_0         
    //   43   75:invokespecial   #148 <Method void CursorAdapter$ChangeObserver(CursorAdapter)>
    //   44   78:putfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   45   81:aload_0         
    //   46   82:new             #152 <Class CursorAdapter$MyDataSetObserver>
    //   47   85:dup             
    //   48   86:aload_0         
    //   49   87:aconst_null     
    //   50   88:invokespecial   #155 <Method void CursorAdapter$MyDataSetObserver(CursorAdapter, CursorAdapter$1)>
    //   51   91:putfield        #157 <Field DataSetObserver mDataSetObserver>
    //   52   94:iload           4
    //   53   96:ifeq            133
    //   54   99:aload_0         
    //   55  100:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   56  103:ifnull          116
    //   57  106:aload_2         
    //   58  107:aload_0         
    //   59  108:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   60  111:invokeinterface #161 <Method void Cursor.registerContentObserver(ContentObserver)>
    //   61  116:aload_0         
    //   62  117:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   63  120:ifnull          133
    //   64  123:aload_2         
    //   65  124:aload_0         
    //   66  125:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   67  128:invokeinterface #165 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
    //   68  133:return          
    //   69  134:aload_0         
    //   70  135:iconst_0        
    //   71  136:putfield        #137 <Field boolean mAutoRequery>
    //   72  139:goto            21
    //   73  142:iconst_0        
    //   74  143:istore          4
    //   75  145:goto            25
    //   76  148:iconst_m1       
    //   77  149:istore          5
    //   78  151:goto            56
    //   79  154:aload_0         
    //   80  155:aconst_null     
    //   81  156:putfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   82  159:aload_0         
    //   83  160:aconst_null     
    //   84  161:putfield        #157 <Field DataSetObserver mDataSetObserver>
    //   85  164:goto            94
    }

    protected void init(Context context, Cursor cursor, boolean flag)
    {
    //    0    0:iload_3         
    //    1    1:ifeq            16
    //    2    4:iconst_1        
    //    3    5:istore          4
    //    4    7:aload_0         
    //    5    8:aload_1         
    //    6    9:aload_2         
    //    7   10:iload           4
    //    8   12:invokevirtual   #39  <Method void init(Context, Cursor, int)>
    //    9   15:return          
    //   10   16:iconst_2        
    //   11   17:istore          4
    //   12   19:goto            7
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokevirtual   #133 <Method View newView(Context, Cursor, ViewGroup)>
    //    5    7:areturn         
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

    protected void onContentChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field boolean mAutoRequery>
    //    2    4:ifeq            39
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field Cursor mCursor>
    //    5   11:ifnull          39
    //    6   14:aload_0         
    //    7   15:getfield        #69  <Field Cursor mCursor>
    //    8   18:invokeinterface #169 <Method boolean Cursor.isClosed()>
    //    9   23:ifne            39
    //   10   26:aload_0         
    //   11   27:aload_0         
    //   12   28:getfield        #69  <Field Cursor mCursor>
    //   13   31:invokeinterface #172 <Method boolean Cursor.requery()>
    //   14   36:putfield        #67  <Field boolean mDataValid>
    //   15   39:return          
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field FilterQueryProvider mFilterQueryProvider>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #100 <Field FilterQueryProvider mFilterQueryProvider>
    //    5   11:aload_1         
    //    6   12:invokeinterface #179 <Method Cursor FilterQueryProvider.runQuery(CharSequence)>
    //    7   17:areturn         
    //    8   18:aload_0         
    //    9   19:getfield        #69  <Field Cursor mCursor>
    //   10   22:areturn         
    }

    public void setFilterQueryProvider(FilterQueryProvider filterqueryprovider)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #100 <Field FilterQueryProvider mFilterQueryProvider>
    //    3    5:return          
    }

    public Cursor swapCursor(Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #69  <Field Cursor mCursor>
    //    3    5:if_acmpne       10
    //    4    8:aconst_null     
    //    5    9:areturn         
    //    6   10:aload_0         
    //    7   11:getfield        #69  <Field Cursor mCursor>
    //    8   14:astore_2        
    //    9   15:aload_2         
    //   10   16:ifnull          53
    //   11   19:aload_0         
    //   12   20:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   13   23:ifnull          36
    //   14   26:aload_2         
    //   15   27:aload_0         
    //   16   28:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   17   31:invokeinterface #184 <Method void Cursor.unregisterContentObserver(ContentObserver)>
    //   18   36:aload_0         
    //   19   37:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   20   40:ifnull          53
    //   21   43:aload_2         
    //   22   44:aload_0         
    //   23   45:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   24   48:invokeinterface #187 <Method void Cursor.unregisterDataSetObserver(DataSetObserver)>
    //   25   53:aload_0         
    //   26   54:aload_1         
    //   27   55:putfield        #69  <Field Cursor mCursor>
    //   28   58:aload_1         
    //   29   59:ifnull          119
    //   30   62:aload_0         
    //   31   63:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   32   66:ifnull          79
    //   33   69:aload_1         
    //   34   70:aload_0         
    //   35   71:getfield        #150 <Field CursorAdapter$ChangeObserver mChangeObserver>
    //   36   74:invokeinterface #161 <Method void Cursor.registerContentObserver(ContentObserver)>
    //   37   79:aload_0         
    //   38   80:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   39   83:ifnull          96
    //   40   86:aload_1         
    //   41   87:aload_0         
    //   42   88:getfield        #157 <Field DataSetObserver mDataSetObserver>
    //   43   91:invokeinterface #165 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
    //   44   96:aload_0         
    //   45   97:aload_1         
    //   46   98:ldc1            #139 <String "_id">
    //   47  100:invokeinterface #143 <Method int Cursor.getColumnIndexOrThrow(String)>
    //   48  105:putfield        #106 <Field int mRowIDColumn>
    //   49  108:aload_0         
    //   50  109:iconst_1        
    //   51  110:putfield        #67  <Field boolean mDataValid>
    //   52  113:aload_0         
    //   53  114:invokevirtual   #190 <Method void notifyDataSetChanged()>
    //   54  117:aload_2         
    //   55  118:areturn         
    //   56  119:aload_0         
    //   57  120:iconst_m1       
    //   58  121:putfield        #106 <Field int mRowIDColumn>
    //   59  124:aload_0         
    //   60  125:iconst_0        
    //   61  126:putfield        #67  <Field boolean mDataValid>
    //   62  129:aload_0         
    //   63  130:invokevirtual   #193 <Method void notifyDataSetInvalidated()>
    //   64  133:aload_2         
    //   65  134:areturn         
    }

    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    protected boolean mAutoRequery;
    protected ChangeObserver mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    // Unreferenced inner class android/support/v4/widget/CursorAdapter$1

/* anonymous class */
    static class _cls1
    {
    }

}
