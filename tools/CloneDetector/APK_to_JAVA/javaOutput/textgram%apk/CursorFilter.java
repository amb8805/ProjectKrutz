// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

class CursorFilter extends Filter
{
    static interface CursorFilterClient
    {

        public abstract void changeCursor(Cursor cursor);

        public abstract CharSequence convertToString(Cursor cursor);

        public abstract Cursor getCursor();

        public abstract Cursor runQueryOnBackgroundThread(CharSequence charsequence);
    }


    CursorFilter(CursorFilterClient cursorfilterclient)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Filter()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #13  <Field CursorFilter$CursorFilterClient mClient>
    //    5    9:return          
    }

    public CharSequence convertResultToString(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field CursorFilter$CursorFilterClient mClient>
    //    2    4:aload_1         
    //    3    5:checkcast       #17  <Class Cursor>
    //    4    8:invokeinterface #23  <Method CharSequence CursorFilter$CursorFilterClient.convertToString(Cursor)>
    //    5   13:areturn         
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field CursorFilter$CursorFilterClient mClient>
    //    2    4:aload_1         
    //    3    5:invokeinterface #29  <Method Cursor CursorFilter$CursorFilterClient.runQueryOnBackgroundThread(CharSequence)>
    //    4   10:astore_2        
    //    5   11:new             #31  <Class android.widget.Filter$FilterResults>
    //    6   14:dup             
    //    7   15:invokespecial   #32  <Method void android.widget.Filter$FilterResults()>
    //    8   18:astore_3        
    //    9   19:aload_2         
    //   10   20:ifnull          40
    //   11   23:aload_3         
    //   12   24:aload_2         
    //   13   25:invokeinterface #36  <Method int Cursor.getCount()>
    //   14   30:putfield        #40  <Field int android.widget.Filter$FilterResults.count>
    //   15   33:aload_3         
    //   16   34:aload_2         
    //   17   35:putfield        #44  <Field Object android.widget.Filter$FilterResults.values>
    //   18   38:aload_3         
    //   19   39:areturn         
    //   20   40:aload_3         
    //   21   41:iconst_0        
    //   22   42:putfield        #40  <Field int android.widget.Filter$FilterResults.count>
    //   23   45:aload_3         
    //   24   46:aconst_null     
    //   25   47:putfield        #44  <Field Object android.widget.Filter$FilterResults.values>
    //   26   50:aload_3         
    //   27   51:areturn         
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field CursorFilter$CursorFilterClient mClient>
    //    2    4:invokeinterface #50  <Method Cursor CursorFilter$CursorFilterClient.getCursor()>
    //    3    9:astore_3        
    //    4   10:aload_2         
    //    5   11:getfield        #44  <Field Object android.widget.Filter$FilterResults.values>
    //    6   14:ifnull          41
    //    7   17:aload_2         
    //    8   18:getfield        #44  <Field Object android.widget.Filter$FilterResults.values>
    //    9   21:aload_3         
    //   10   22:if_acmpeq       41
    //   11   25:aload_0         
    //   12   26:getfield        #13  <Field CursorFilter$CursorFilterClient mClient>
    //   13   29:aload_2         
    //   14   30:getfield        #44  <Field Object android.widget.Filter$FilterResults.values>
    //   15   33:checkcast       #17  <Class Cursor>
    //   16   36:invokeinterface #54  <Method void CursorFilter$CursorFilterClient.changeCursor(Cursor)>
    //   17   41:return          
    }

    CursorFilterClient mClient;
}
