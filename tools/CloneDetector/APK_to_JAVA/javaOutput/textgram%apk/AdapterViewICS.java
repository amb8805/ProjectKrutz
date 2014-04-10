// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;
import android.widget.AdapterView;

abstract class AdapterViewICS extends ViewGroup
{
    public static class AdapterContextMenuInfo
        implements android.view.ContextMenu.ContextMenuInfo
    {

        public AdapterContextMenuInfo(View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #17  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #19  <Field View targetView>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #21  <Field int position>
        //    8   14:aload_0         
        //    9   15:lload_3         
        //   10   16:putfield        #23  <Field long id>
        //   11   19:return          
        }

        public long id;
        public int position;
        public View targetView;
    }

    class AdapterDataSetObserver extends DataSetObserver
    {

        AdapterDataSetObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AdapterViewICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void DataSetObserver()>
        //    5    9:aload_0         
        //    6   10:aconst_null     
        //    7   11:putfield        #17  <Field Parcelable mInstanceState>
        //    8   14:return          
        }

        public void clearSavedState()
        {
        //    0    0:aload_0         
        //    1    1:aconst_null     
        //    2    2:putfield        #17  <Field Parcelable mInstanceState>
        //    3    5:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdapterViewICS this$0>
        //    2    4:iconst_1        
        //    3    5:putfield        #25  <Field boolean AdapterViewICS.mDataChanged>
        //    4    8:aload_0         
        //    5    9:getfield        #12  <Field AdapterViewICS this$0>
        //    6   12:aload_0         
        //    7   13:getfield        #12  <Field AdapterViewICS this$0>
        //    8   16:getfield        #29  <Field int AdapterViewICS.mItemCount>
        //    9   19:putfield        #32  <Field int AdapterViewICS.mOldItemCount>
        //   10   22:aload_0         
        //   11   23:getfield        #12  <Field AdapterViewICS this$0>
        //   12   26:aload_0         
        //   13   27:getfield        #12  <Field AdapterViewICS this$0>
        //   14   30:invokevirtual   #36  <Method Adapter AdapterViewICS.getAdapter()>
        //   15   33:invokeinterface #42  <Method int Adapter.getCount()>
        //   16   38:putfield        #29  <Field int AdapterViewICS.mItemCount>
        //   17   41:aload_0         
        //   18   42:getfield        #12  <Field AdapterViewICS this$0>
        //   19   45:invokevirtual   #36  <Method Adapter AdapterViewICS.getAdapter()>
        //   20   48:invokeinterface #46  <Method boolean Adapter.hasStableIds()>
        //   21   53:ifeq            114
        //   22   56:aload_0         
        //   23   57:getfield        #17  <Field Parcelable mInstanceState>
        //   24   60:ifnull          114
        //   25   63:aload_0         
        //   26   64:getfield        #12  <Field AdapterViewICS this$0>
        //   27   67:getfield        #32  <Field int AdapterViewICS.mOldItemCount>
        //   28   70:ifne            114
        //   29   73:aload_0         
        //   30   74:getfield        #12  <Field AdapterViewICS this$0>
        //   31   77:getfield        #29  <Field int AdapterViewICS.mItemCount>
        //   32   80:ifle            114
        //   33   83:aload_0         
        //   34   84:getfield        #12  <Field AdapterViewICS this$0>
        //   35   87:aload_0         
        //   36   88:getfield        #17  <Field Parcelable mInstanceState>
        //   37   91:invokestatic    #50  <Method void AdapterViewICS.access$000(AdapterViewICS, Parcelable)>
        //   38   94:aload_0         
        //   39   95:aconst_null     
        //   40   96:putfield        #17  <Field Parcelable mInstanceState>
        //   41   99:aload_0         
        //   42  100:getfield        #12  <Field AdapterViewICS this$0>
        //   43  103:invokevirtual   #53  <Method void AdapterViewICS.checkFocus()>
        //   44  106:aload_0         
        //   45  107:getfield        #12  <Field AdapterViewICS this$0>
        //   46  110:invokevirtual   #56  <Method void AdapterViewICS.requestLayout()>
        //   47  113:return          
        //   48  114:aload_0         
        //   49  115:getfield        #12  <Field AdapterViewICS this$0>
        //   50  118:invokevirtual   #59  <Method void AdapterViewICS.rememberSyncState()>
        //   51  121:goto            99
        }

        public void onInvalidated()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdapterViewICS this$0>
        //    2    4:iconst_1        
        //    3    5:putfield        #25  <Field boolean AdapterViewICS.mDataChanged>
        //    4    8:aload_0         
        //    5    9:getfield        #12  <Field AdapterViewICS this$0>
        //    6   12:invokevirtual   #36  <Method Adapter AdapterViewICS.getAdapter()>
        //    7   15:invokeinterface #46  <Method boolean Adapter.hasStableIds()>
        //    8   20:ifeq            34
        //    9   23:aload_0         
        //   10   24:aload_0         
        //   11   25:getfield        #12  <Field AdapterViewICS this$0>
        //   12   28:invokestatic    #64  <Method Parcelable AdapterViewICS.access$100(AdapterViewICS)>
        //   13   31:putfield        #17  <Field Parcelable mInstanceState>
        //   14   34:aload_0         
        //   15   35:getfield        #12  <Field AdapterViewICS this$0>
        //   16   38:aload_0         
        //   17   39:getfield        #12  <Field AdapterViewICS this$0>
        //   18   42:getfield        #29  <Field int AdapterViewICS.mItemCount>
        //   19   45:putfield        #32  <Field int AdapterViewICS.mOldItemCount>
        //   20   48:aload_0         
        //   21   49:getfield        #12  <Field AdapterViewICS this$0>
        //   22   52:iconst_0        
        //   23   53:putfield        #29  <Field int AdapterViewICS.mItemCount>
        //   24   56:aload_0         
        //   25   57:getfield        #12  <Field AdapterViewICS this$0>
        //   26   60:iconst_m1       
        //   27   61:putfield        #67  <Field int AdapterViewICS.mSelectedPosition>
        //   28   64:aload_0         
        //   29   65:getfield        #12  <Field AdapterViewICS this$0>
        //   30   68:ldc2w           #68  <Long 0x8000000000000000L>
        //   31   71:putfield        #73  <Field long AdapterViewICS.mSelectedRowId>
        //   32   74:aload_0         
        //   33   75:getfield        #12  <Field AdapterViewICS this$0>
        //   34   78:iconst_m1       
        //   35   79:putfield        #76  <Field int AdapterViewICS.mNextSelectedPosition>
        //   36   82:aload_0         
        //   37   83:getfield        #12  <Field AdapterViewICS this$0>
        //   38   86:ldc2w           #68  <Long 0x8000000000000000L>
        //   39   89:putfield        #79  <Field long AdapterViewICS.mNextSelectedRowId>
        //   40   92:aload_0         
        //   41   93:getfield        #12  <Field AdapterViewICS this$0>
        //   42   96:iconst_0        
        //   43   97:putfield        #82  <Field boolean AdapterViewICS.mNeedSync>
        //   44  100:aload_0         
        //   45  101:getfield        #12  <Field AdapterViewICS this$0>
        //   46  104:invokevirtual   #53  <Method void AdapterViewICS.checkFocus()>
        //   47  107:aload_0         
        //   48  108:getfield        #12  <Field AdapterViewICS this$0>
        //   49  111:invokevirtual   #56  <Method void AdapterViewICS.requestLayout()>
        //   50  114:return          
        }

        private Parcelable mInstanceState;
        final AdapterViewICS this$0;
    }

    public static interface OnItemClickListener
    {

        public abstract void onItemClick(AdapterViewICS adapterviewics, View view, int i, long l);
    }

    class OnItemClickListenerWrapper
        implements android.widget.AdapterView.OnItemClickListener
    {

        public OnItemClickListenerWrapper(OnItemClickListener onitemclicklistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field AdapterViewICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field AdapterViewICS$OnItemClickListener mWrappedListener>
        //    8   14:return          
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field AdapterViewICS$OnItemClickListener mWrappedListener>
        //    2    4:aload_0         
        //    3    5:getfield        #14  <Field AdapterViewICS this$0>
        //    4    8:aload_2         
        //    5    9:iload_3         
        //    6   10:lload           4
        //    7   12:invokeinterface #26  <Method void AdapterViewICS$OnItemClickListener.onItemClick(AdapterViewICS, View, int, long)>
        //    8   17:return          
        }

        private final OnItemClickListener mWrappedListener;
        final AdapterViewICS this$0;
    }

    public static interface OnItemLongClickListener
    {

        public abstract boolean onItemLongClick(AdapterViewICS adapterviewics, View view, int i, long l);
    }

    public static interface OnItemSelectedListener
    {

        public abstract void onItemSelected(AdapterViewICS adapterviewics, View view, int i, long l);

        public abstract void onNothingSelected(AdapterViewICS adapterviewics);
    }

    private class SelectionNotifier
        implements Runnable
    {

        private SelectionNotifier()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AdapterViewICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        SelectionNotifier(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void AdapterViewICS$SelectionNotifier(AdapterViewICS)>
        //    3    5:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdapterViewICS this$0>
        //    2    4:getfield        #25  <Field boolean AdapterViewICS.mDataChanged>
        //    3    7:ifeq            30
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field AdapterViewICS this$0>
        //    6   14:invokevirtual   #29  <Method Adapter AdapterViewICS.getAdapter()>
        //    7   17:ifnull          29
        //    8   20:aload_0         
        //    9   21:getfield        #12  <Field AdapterViewICS this$0>
        //   10   24:aload_0         
        //   11   25:invokevirtual   #33  <Method boolean AdapterViewICS.post(Runnable)>
        //   12   28:pop             
        //   13   29:return          
        //   14   30:aload_0         
        //   15   31:getfield        #12  <Field AdapterViewICS this$0>
        //   16   34:invokestatic    #36  <Method void AdapterViewICS.access$200(AdapterViewICS)>
        //   17   37:return          
        }

        final AdapterViewICS this$0;
    }


    AdapterViewICS(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #61  <Method void ViewGroup(Context)>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #63  <Field int mFirstPosition>
    //    6   10:aload_0         
    //    7   11:ldc2w           #11  <Long 0x8000000000000000L>
    //    8   14:putfield        #65  <Field long mSyncRowId>
    //    9   17:aload_0         
    //   10   18:iconst_0        
    //   11   19:putfield        #67  <Field boolean mNeedSync>
    //   12   22:aload_0         
    //   13   23:iconst_0        
    //   14   24:putfield        #69  <Field boolean mInLayout>
    //   15   27:aload_0         
    //   16   28:iconst_m1       
    //   17   29:putfield        #71  <Field int mNextSelectedPosition>
    //   18   32:aload_0         
    //   19   33:ldc2w           #11  <Long 0x8000000000000000L>
    //   20   36:putfield        #73  <Field long mNextSelectedRowId>
    //   21   39:aload_0         
    //   22   40:iconst_m1       
    //   23   41:putfield        #75  <Field int mSelectedPosition>
    //   24   44:aload_0         
    //   25   45:ldc2w           #11  <Long 0x8000000000000000L>
    //   26   48:putfield        #77  <Field long mSelectedRowId>
    //   27   51:aload_0         
    //   28   52:iconst_m1       
    //   29   53:putfield        #79  <Field int mOldSelectedPosition>
    //   30   56:aload_0         
    //   31   57:ldc2w           #11  <Long 0x8000000000000000L>
    //   32   60:putfield        #81  <Field long mOldSelectedRowId>
    //   33   63:aload_0         
    //   34   64:iconst_0        
    //   35   65:putfield        #83  <Field boolean mBlockLayoutRequests>
    //   36   68:return          
    }

    AdapterViewICS(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #86  <Method void ViewGroup(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_0        
    //    6    8:putfield        #63  <Field int mFirstPosition>
    //    7   11:aload_0         
    //    8   12:ldc2w           #11  <Long 0x8000000000000000L>
    //    9   15:putfield        #65  <Field long mSyncRowId>
    //   10   18:aload_0         
    //   11   19:iconst_0        
    //   12   20:putfield        #67  <Field boolean mNeedSync>
    //   13   23:aload_0         
    //   14   24:iconst_0        
    //   15   25:putfield        #69  <Field boolean mInLayout>
    //   16   28:aload_0         
    //   17   29:iconst_m1       
    //   18   30:putfield        #71  <Field int mNextSelectedPosition>
    //   19   33:aload_0         
    //   20   34:ldc2w           #11  <Long 0x8000000000000000L>
    //   21   37:putfield        #73  <Field long mNextSelectedRowId>
    //   22   40:aload_0         
    //   23   41:iconst_m1       
    //   24   42:putfield        #75  <Field int mSelectedPosition>
    //   25   45:aload_0         
    //   26   46:ldc2w           #11  <Long 0x8000000000000000L>
    //   27   49:putfield        #77  <Field long mSelectedRowId>
    //   28   52:aload_0         
    //   29   53:iconst_m1       
    //   30   54:putfield        #79  <Field int mOldSelectedPosition>
    //   31   57:aload_0         
    //   32   58:ldc2w           #11  <Long 0x8000000000000000L>
    //   33   61:putfield        #81  <Field long mOldSelectedRowId>
    //   34   64:aload_0         
    //   35   65:iconst_0        
    //   36   66:putfield        #83  <Field boolean mBlockLayoutRequests>
    //   37   69:return          
    }

    AdapterViewICS(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #89  <Method void ViewGroup(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:iconst_0        
    //    7    9:putfield        #63  <Field int mFirstPosition>
    //    8   12:aload_0         
    //    9   13:ldc2w           #11  <Long 0x8000000000000000L>
    //   10   16:putfield        #65  <Field long mSyncRowId>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #67  <Field boolean mNeedSync>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #69  <Field boolean mInLayout>
    //   17   29:aload_0         
    //   18   30:iconst_m1       
    //   19   31:putfield        #71  <Field int mNextSelectedPosition>
    //   20   34:aload_0         
    //   21   35:ldc2w           #11  <Long 0x8000000000000000L>
    //   22   38:putfield        #73  <Field long mNextSelectedRowId>
    //   23   41:aload_0         
    //   24   42:iconst_m1       
    //   25   43:putfield        #75  <Field int mSelectedPosition>
    //   26   46:aload_0         
    //   27   47:ldc2w           #11  <Long 0x8000000000000000L>
    //   28   50:putfield        #77  <Field long mSelectedRowId>
    //   29   53:aload_0         
    //   30   54:iconst_m1       
    //   31   55:putfield        #79  <Field int mOldSelectedPosition>
    //   32   58:aload_0         
    //   33   59:ldc2w           #11  <Long 0x8000000000000000L>
    //   34   62:putfield        #81  <Field long mOldSelectedRowId>
    //   35   65:aload_0         
    //   36   66:iconst_0        
    //   37   67:putfield        #83  <Field boolean mBlockLayoutRequests>
    //   38   70:return          
    }

    static void access$000(AdapterViewICS adapterviewics, Parcelable parcelable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #95  <Method void onRestoreInstanceState(Parcelable)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokevirtual   #95  <Method void onRestoreInstanceState(Parcelable)>
    //    7    5:return          
    }

    static Parcelable access$100(AdapterViewICS adapterviewics)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #101 <Method Parcelable onSaveInstanceState()>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokevirtual   #101 <Method Parcelable onSaveInstanceState()>
    //    5    4:areturn         
    }

    static void access$200(AdapterViewICS adapterviewics)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #107 <Method void fireOnSelected()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #107 <Method void fireOnSelected()>
    //    5    4:return          
    }

    private void fireOnSelected()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:invokevirtual   #113 <Method int getSelectedItemPosition()>
    //    6   12:istore_1        
    //    7   13:iload_1         
    //    8   14:iflt            45
    //    9   17:aload_0         
    //   10   18:invokevirtual   #117 <Method View getSelectedView()>
    //   11   21:astore_2        
    //   12   22:aload_0         
    //   13   23:getfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //   14   26:aload_0         
    //   15   27:aload_2         
    //   16   28:iload_1         
    //   17   29:aload_0         
    //   18   30:invokevirtual   #121 <Method Adapter getAdapter()>
    //   19   33:iload_1         
    //   20   34:invokeinterface #127 <Method long Adapter.getItemId(int)>
    //   21   39:invokeinterface #133 <Method void AdapterViewICS$OnItemSelectedListener.onItemSelected(AdapterViewICS, View, int, long)>
    //   22   44:return          
    //   23   45:aload_0         
    //   24   46:getfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //   25   49:aload_0         
    //   26   50:invokeinterface #136 <Method void AdapterViewICS$OnItemSelectedListener.onNothingSelected(AdapterViewICS)>
    //   27   55:return          
    }

    private void updateEmptyStatus(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #142 <Method boolean isInFilterMode()>
    //    2    4:ifeq            9
    //    3    7:iconst_0        
    //    4    8:istore_1        
    //    5    9:iload_1         
    //    6   10:ifeq            71
    //    7   13:aload_0         
    //    8   14:getfield        #144 <Field View mEmptyView>
    //    9   17:ifnull          63
    //   10   20:aload_0         
    //   11   21:getfield        #144 <Field View mEmptyView>
    //   12   24:iconst_0        
    //   13   25:invokevirtual   #150 <Method void View.setVisibility(int)>
    //   14   28:aload_0         
    //   15   29:bipush          8
    //   16   31:invokevirtual   #151 <Method void setVisibility(int)>
    //   17   34:aload_0         
    //   18   35:getfield        #153 <Field boolean mDataChanged>
    //   19   38:ifeq            62
    //   20   41:aload_0         
    //   21   42:iconst_0        
    //   22   43:aload_0         
    //   23   44:invokevirtual   #156 <Method int getLeft()>
    //   24   47:aload_0         
    //   25   48:invokevirtual   #159 <Method int getTop()>
    //   26   51:aload_0         
    //   27   52:invokevirtual   #162 <Method int getRight()>
    //   28   55:aload_0         
    //   29   56:invokevirtual   #165 <Method int getBottom()>
    //   30   59:invokevirtual   #169 <Method void onLayout(boolean, int, int, int, int)>
    //   31   62:return          
    //   32   63:aload_0         
    //   33   64:iconst_0        
    //   34   65:invokevirtual   #151 <Method void setVisibility(int)>
    //   35   68:goto            34
    //   36   71:aload_0         
    //   37   72:getfield        #144 <Field View mEmptyView>
    //   38   75:ifnull          87
    //   39   78:aload_0         
    //   40   79:getfield        #144 <Field View mEmptyView>
    //   41   82:bipush          8
    //   42   84:invokevirtual   #150 <Method void View.setVisibility(int)>
    //   43   87:aload_0         
    //   44   88:iconst_0        
    //   45   89:invokevirtual   #151 <Method void setVisibility(int)>
    //   46   92:return          
    }

    public void addView(View view)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #175 <String "addView(View) is not supported in AdapterView">
    //    3    6:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public void addView(View view, int i)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #181 <String "addView(View, int) is not supported in AdapterView">
    //    3    6:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #184 <String "addView(View, int, LayoutParams) is not supported in AdapterView">
    //    3    6:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #187 <String "addView(View, LayoutParams) is not supported in AdapterView">
    //    3    6:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    protected boolean canAnimate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #190 <Method boolean ViewGroup.canAnimate()>
    //    2    4:ifeq            16
    //    3    7:aload_0         
    //    4    8:getfield        #192 <Field int mItemCount>
    //    5   11:ifle            16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    void checkFocus()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Adapter getAdapter()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          18
    //    5    9:aload_1         
    //    6   10:invokeinterface #196 <Method int Adapter.getCount()>
    //    7   15:ifne            110
    //    8   18:iconst_1        
    //    9   19:istore_2        
    //   10   20:iload_2         
    //   11   21:ifeq            31
    //   12   24:aload_0         
    //   13   25:invokevirtual   #142 <Method boolean isInFilterMode()>
    //   14   28:ifeq            115
    //   15   31:iconst_1        
    //   16   32:istore_3        
    //   17   33:iload_3         
    //   18   34:ifeq            120
    //   19   37:aload_0         
    //   20   38:getfield        #198 <Field boolean mDesiredFocusableInTouchModeState>
    //   21   41:ifeq            120
    //   22   44:iconst_1        
    //   23   45:istore          4
    //   24   47:aload_0         
    //   25   48:iload           4
    //   26   50:invokespecial   #201 <Method void ViewGroup.setFocusableInTouchMode(boolean)>
    //   27   53:iload_3         
    //   28   54:ifeq            126
    //   29   57:aload_0         
    //   30   58:getfield        #203 <Field boolean mDesiredFocusableState>
    //   31   61:ifeq            126
    //   32   64:iconst_1        
    //   33   65:istore          5
    //   34   67:aload_0         
    //   35   68:iload           5
    //   36   70:invokespecial   #206 <Method void ViewGroup.setFocusable(boolean)>
    //   37   73:aload_0         
    //   38   74:getfield        #144 <Field View mEmptyView>
    //   39   77:ifnull          109
    //   40   80:aload_1         
    //   41   81:ifnull          100
    //   42   84:aload_1         
    //   43   85:invokeinterface #209 <Method boolean Adapter.isEmpty()>
    //   44   90:istore          7
    //   45   92:iconst_0        
    //   46   93:istore          6
    //   47   95:iload           7
    //   48   97:ifeq            103
    //   49  100:iconst_1        
    //   50  101:istore          6
    //   51  103:aload_0         
    //   52  104:iload           6
    //   53  106:invokespecial   #211 <Method void updateEmptyStatus(boolean)>
    //   54  109:return          
    //   55  110:iconst_0        
    //   56  111:istore_2        
    //   57  112:goto            20
    //   58  115:iconst_0        
    //   59  116:istore_3        
    //   60  117:goto            33
    //   61  120:iconst_0        
    //   62  121:istore          4
    //   63  123:goto            47
    //   64  126:iconst_0        
    //   65  127:istore          5
    //   66  129:goto            67
    }

    void checkSelectionChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field int mSelectedPosition>
    //    2    4:aload_0         
    //    3    5:getfield        #79  <Field int mOldSelectedPosition>
    //    4    8:icmpne          23
    //    5   11:aload_0         
    //    6   12:getfield        #77  <Field long mSelectedRowId>
    //    7   15:aload_0         
    //    8   16:getfield        #81  <Field long mOldSelectedRowId>
    //    9   19:lcmp            
    //   10   20:ifeq            43
    //   11   23:aload_0         
    //   12   24:invokevirtual   #215 <Method void selectionChanged()>
    //   13   27:aload_0         
    //   14   28:aload_0         
    //   15   29:getfield        #75  <Field int mSelectedPosition>
    //   16   32:putfield        #79  <Field int mOldSelectedPosition>
    //   17   35:aload_0         
    //   18   36:aload_0         
    //   19   37:getfield        #77  <Field long mSelectedRowId>
    //   20   40:putfield        #81  <Field long mOldSelectedRowId>
    //   21   43:return          
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #117 <Method View getSelectedView()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnull          26
    //    5    9:aload_2         
    //    6   10:invokevirtual   #220 <Method int View.getVisibility()>
    //    7   13:ifne            26
    //    8   16:aload_2         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #222 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
    //   11   21:ifeq            26
    //   12   24:iconst_1        
    //   13   25:ireturn         
    //   14   26:iconst_0        
    //   15   27:ireturn         
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #227 <Method void dispatchThawSelfOnly(SparseArray)>
    //    3    5:return          
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #231 <Method void dispatchFreezeSelfOnly(SparseArray)>
    //    3    5:return          
    }

    int findSyncPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #192 <Field int mItemCount>
    //    2    4:istore_1        
    //    3    5:iload_1         
    //    4    6:ifne            15
    //    5    9:iconst_m1       
    //    6   10:istore          6
    //    7   12:iload           6
    //    8   14:ireturn         
    //    9   15:aload_0         
    //   10   16:getfield        #65  <Field long mSyncRowId>
    //   11   19:lstore_2        
    //   12   20:aload_0         
    //   13   21:getfield        #234 <Field int mSyncPosition>
    //   14   24:istore          4
    //   15   26:lload_2         
    //   16   27:ldc2w           #11  <Long 0x8000000000000000L>
    //   17   30:lcmp            
    //   18   31:ifne            36
    //   19   34:iconst_m1       
    //   20   35:ireturn         
    //   21   36:iconst_0        
    //   22   37:iload           4
    //   23   39:invokestatic    #240 <Method int Math.max(int, int)>
    //   24   42:istore          5
    //   25   44:iload_1         
    //   26   45:iconst_1        
    //   27   46:isub            
    //   28   47:iload           5
    //   29   49:invokestatic    #243 <Method int Math.min(int, int)>
    //   30   52:istore          6
    //   31   54:ldc2w           #244 <Long 100L>
    //   32   57:invokestatic    #251 <Method long SystemClock.uptimeMillis()>
    //   33   60:ladd            
    //   34   61:lstore          7
    //   35   63:iload           6
    //   36   65:istore          9
    //   37   67:iload           6
    //   38   69:istore          10
    //   39   71:aload_0         
    //   40   72:invokevirtual   #121 <Method Adapter getAdapter()>
    //   41   75:astore          11
    //   42   77:iconst_0        
    //   43   78:istore          12
    //   44   80:aload           11
    //   45   82:ifnonnull       112
    //   46   85:iconst_m1       
    //   47   86:ireturn         
    //   48   87:iload           14
    //   49   89:ifne            102
    //   50   92:iload           12
    //   51   94:ifeq            178
    //   52   97:iload           13
    //   53   99:ifne            178
    //   54  102:iinc            10  1
    //   55  105:iload           10
    //   56  107:istore          6
    //   57  109:iconst_0        
    //   58  110:istore          12
    //   59  112:invokestatic    #251 <Method long SystemClock.uptimeMillis()>
    //   60  115:lload           7
    //   61  117:lcmp            
    //   62  118:ifgt            164
    //   63  121:aload           11
    //   64  123:iload           6
    //   65  125:invokeinterface #127 <Method long Adapter.getItemId(int)>
    //   66  130:lload_2         
    //   67  131:lcmp            
    //   68  132:ifeq            12
    //   69  135:iload           10
    //   70  137:iload_1         
    //   71  138:iconst_1        
    //   72  139:isub            
    //   73  140:icmpne          166
    //   74  143:iconst_1        
    //   75  144:istore          13
    //   76  146:iload           9
    //   77  148:ifne            172
    //   78  151:iconst_1        
    //   79  152:istore          14
    //   80  154:iload           13
    //   81  156:ifeq            87
    //   82  159:iload           14
    //   83  161:ifeq            87
    //   84  164:iconst_m1       
    //   85  165:ireturn         
    //   86  166:iconst_0        
    //   87  167:istore          13
    //   88  169:goto            146
    //   89  172:iconst_0        
    //   90  173:istore          14
    //   91  175:goto            154
    //   92  178:iload           13
    //   93  180:ifne            193
    //   94  183:iload           12
    //   95  185:ifne            112
    //   96  188:iload           14
    //   97  190:ifne            112
    //   98  193:iinc            9  -1
    //   99  196:iload           9
    //  100  198:istore          6
    //  101  200:iconst_1        
    //  102  201:istore          12
    //  103  203:goto            112
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #192 <Field int mItemCount>
    //    2    4:ireturn         
    }

    public View getEmptyView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #144 <Field View mEmptyView>
    //    2    4:areturn         
    }

    public int getFirstVisiblePosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field int mFirstPosition>
    //    2    4:ireturn         
    }

    public Object getItemAtPosition(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Adapter getAdapter()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnull          13
    //    5    9:iload_1         
    //    6   10:ifge            15
    //    7   13:aconst_null     
    //    8   14:areturn         
    //    9   15:aload_2         
    //   10   16:iload_1         
    //   11   17:invokeinterface #259 <Method Object Adapter.getItem(int)>
    //   12   22:areturn         
    }

    public long getItemIdAtPosition(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Adapter getAdapter()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnull          13
    //    5    9:iload_1         
    //    6   10:ifge            17
    //    7   13:ldc2w           #11  <Long 0x8000000000000000L>
    //    8   16:lreturn         
    //    9   17:aload_2         
    //   10   18:iload_1         
    //   11   19:invokeinterface #127 <Method long Adapter.getItemId(int)>
    //   12   24:lreturn         
    }

    public int getLastVisiblePosition()
    {
    //    0    0:iconst_m1       
    //    1    1:aload_0         
    //    2    2:getfield        #63  <Field int mFirstPosition>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #264 <Method int getChildCount()>
    //    5    9:iadd            
    //    6   10:iadd            
    //    7   11:ireturn         
    }

    public final OnItemClickListener getOnItemClickListener()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #268 <Field AdapterViewICS$OnItemClickListener mOnItemClickListener>
    //    2    4:areturn         
    }

    public final OnItemLongClickListener getOnItemLongClickListener()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #272 <Field AdapterViewICS$OnItemLongClickListener mOnItemLongClickListener>
    //    2    4:areturn         
    }

    public final OnItemSelectedListener getOnItemSelectedListener()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //    2    4:areturn         
    }

    public int getPositionForView(View view)
    {
    //    0    0:aload_1         
    //    1    1:astore_2        
    // try 2 19 handler(s) 30
    //    2    2:aload_2         
    //    3    3:invokevirtual   #282 <Method android.view.ViewParent View.getParent()>
    //    4    6:checkcast       #146 <Class View>
    //    5    9:astore          4
    //    6   11:aload           4
    //    7   13:aload_0         
    //    8   14:invokevirtual   #288 <Method boolean Object.equals(Object)>
    //    9   17:istore          5
    //   10   19:iload           5
    //   11   21:ifne            33
    //   12   24:aload           4
    //   13   26:astore_2        
    //   14   27:goto            2
    // catch ClassCastException
    //   15   30:astore_3        
    //   16   31:iconst_m1       
    //   17   32:ireturn         
    //   18   33:aload_0         
    //   19   34:invokevirtual   #264 <Method int getChildCount()>
    //   20   37:istore          6
    //   21   39:iconst_0        
    //   22   40:istore          7
    //   23   42:iload           7
    //   24   44:iload           6
    //   25   46:icmpge          31
    //   26   49:aload_0         
    //   27   50:iload           7
    //   28   52:invokevirtual   #292 <Method View getChildAt(int)>
    //   29   55:aload_2         
    //   30   56:invokevirtual   #288 <Method boolean Object.equals(Object)>
    //   31   59:ifeq            70
    //   32   62:iload           7
    //   33   64:aload_0         
    //   34   65:getfield        #63  <Field int mFirstPosition>
    //   35   68:iadd            
    //   36   69:ireturn         
    //   37   70:iinc            7  1
    //   38   73:goto            42
    }

    public Object getSelectedItem()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Adapter getAdapter()>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #113 <Method int getSelectedItemPosition()>
    //    5    9:istore_2        
    //    6   10:aload_1         
    //    7   11:ifnull          35
    //    8   14:aload_1         
    //    9   15:invokeinterface #196 <Method int Adapter.getCount()>
    //   10   20:ifle            35
    //   11   23:iload_2         
    //   12   24:iflt            35
    //   13   27:aload_1         
    //   14   28:iload_2         
    //   15   29:invokeinterface #259 <Method Object Adapter.getItem(int)>
    //   16   34:areturn         
    //   17   35:aconst_null     
    //   18   36:areturn         
    }

    public long getSelectedItemId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field long mNextSelectedRowId>
    //    2    4:lreturn         
    }

    public int getSelectedItemPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field int mNextSelectedPosition>
    //    2    4:ireturn         
    }

    public abstract View getSelectedView();

    void handleDataChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #192 <Field int mItemCount>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_1         
    //    6    8:ifle            135
    //    7   11:aload_0         
    //    8   12:getfield        #67  <Field boolean mNeedSync>
    //    9   15:istore_3        
    //   10   16:iconst_0        
    //   11   17:istore_2        
    //   12   18:iload_3         
    //   13   19:ifeq            66
    //   14   22:aload_0         
    //   15   23:iconst_0        
    //   16   24:putfield        #67  <Field boolean mNeedSync>
    //   17   27:aload_0         
    //   18   28:invokevirtual   #298 <Method int findSyncPosition()>
    //   19   31:istore          6
    //   20   33:iconst_0        
    //   21   34:istore_2        
    //   22   35:iload           6
    //   23   37:iflt            66
    //   24   40:aload_0         
    //   25   41:iload           6
    //   26   43:iconst_1        
    //   27   44:invokevirtual   #302 <Method int lookForSelectablePosition(int, boolean)>
    //   28   47:istore          7
    //   29   49:iconst_0        
    //   30   50:istore_2        
    //   31   51:iload           7
    //   32   53:iload           6
    //   33   55:icmpne          66
    //   34   58:aload_0         
    //   35   59:iload           6
    //   36   61:invokevirtual   #305 <Method void setNextSelectedPositionInt(int)>
    //   37   64:iconst_1        
    //   38   65:istore_2        
    //   39   66:iload_2         
    //   40   67:ifne            135
    //   41   70:aload_0         
    //   42   71:invokevirtual   #113 <Method int getSelectedItemPosition()>
    //   43   74:istore          4
    //   44   76:iload           4
    //   45   78:iload_1         
    //   46   79:icmplt          87
    //   47   82:iload_1         
    //   48   83:iconst_1        
    //   49   84:isub            
    //   50   85:istore          4
    //   51   87:iload           4
    //   52   89:ifge            95
    //   53   92:iconst_0        
    //   54   93:istore          4
    //   55   95:aload_0         
    //   56   96:iload           4
    //   57   98:iconst_1        
    //   58   99:invokevirtual   #302 <Method int lookForSelectablePosition(int, boolean)>
    //   59  102:istore          5
    //   60  104:iload           5
    //   61  106:ifge            118
    //   62  109:aload_0         
    //   63  110:iload           4
    //   64  112:iconst_0        
    //   65  113:invokevirtual   #302 <Method int lookForSelectablePosition(int, boolean)>
    //   66  116:istore          5
    //   67  118:iload           5
    //   68  120:iflt            135
    //   69  123:aload_0         
    //   70  124:iload           5
    //   71  126:invokevirtual   #305 <Method void setNextSelectedPositionInt(int)>
    //   72  129:aload_0         
    //   73  130:invokevirtual   #307 <Method void checkSelectionChanged()>
    //   74  133:iconst_1        
    //   75  134:istore_2        
    //   76  135:iload_2         
    //   77  136:ifne            172
    //   78  139:aload_0         
    //   79  140:iconst_m1       
    //   80  141:putfield        #75  <Field int mSelectedPosition>
    //   81  144:aload_0         
    //   82  145:ldc2w           #11  <Long 0x8000000000000000L>
    //   83  148:putfield        #77  <Field long mSelectedRowId>
    //   84  151:aload_0         
    //   85  152:iconst_m1       
    //   86  153:putfield        #71  <Field int mNextSelectedPosition>
    //   87  156:aload_0         
    //   88  157:ldc2w           #11  <Long 0x8000000000000000L>
    //   89  160:putfield        #73  <Field long mNextSelectedRowId>
    //   90  163:aload_0         
    //   91  164:iconst_0        
    //   92  165:putfield        #67  <Field boolean mNeedSync>
    //   93  168:aload_0         
    //   94  169:invokevirtual   #307 <Method void checkSelectionChanged()>
    //   95  172:return          
    }

    boolean isInFilterMode()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    int lookForSelectablePosition(int i, boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ireturn         
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #310 <Method void ViewGroup.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #312 <Field AdapterViewICS$SelectionNotifier mSelectionNotifier>
    //    5    9:invokevirtual   #316 <Method boolean removeCallbacks(Runnable)>
    //    6   12:pop             
    //    7   13:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #319 <Method int getHeight()>
    //    3    5:putfield        #321 <Field int mLayoutHeight>
    //    4    8:return          
    }

    public boolean performItemClick(View view, int i, long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #268 <Field AdapterViewICS$OnItemClickListener mOnItemClickListener>
    //    2    4:astore          5
    //    3    6:iconst_0        
    //    4    7:istore          6
    //    5    9:aload           5
    //    6   11:ifnull          44
    //    7   14:aload_0         
    //    8   15:iconst_0        
    //    9   16:invokevirtual   #326 <Method void playSoundEffect(int)>
    //   10   19:aload_1         
    //   11   20:ifnull          28
    //   12   23:aload_1         
    //   13   24:iconst_1        
    //   14   25:invokevirtual   #329 <Method void View.sendAccessibilityEvent(int)>
    //   15   28:aload_0         
    //   16   29:getfield        #268 <Field AdapterViewICS$OnItemClickListener mOnItemClickListener>
    //   17   32:aload_0         
    //   18   33:aload_1         
    //   19   34:iload_2         
    //   20   35:lload_3         
    //   21   36:invokeinterface #334 <Method void AdapterViewICS$OnItemClickListener.onItemClick(AdapterViewICS, View, int, long)>
    //   22   41:iconst_1        
    //   23   42:istore          6
    //   24   44:iload           6
    //   25   46:ireturn         
    }

    void rememberSyncState()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #264 <Method int getChildCount()>
    //    2    4:ifle            75
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #67  <Field boolean mNeedSync>
    //    6   12:aload_0         
    //    7   13:aload_0         
    //    8   14:getfield        #321 <Field int mLayoutHeight>
    //    9   17:i2l             
    //   10   18:putfield        #337 <Field long mSyncHeight>
    //   11   21:aload_0         
    //   12   22:getfield        #75  <Field int mSelectedPosition>
    //   13   25:iflt            76
    //   14   28:aload_0         
    //   15   29:aload_0         
    //   16   30:getfield        #75  <Field int mSelectedPosition>
    //   17   33:aload_0         
    //   18   34:getfield        #63  <Field int mFirstPosition>
    //   19   37:isub            
    //   20   38:invokevirtual   #292 <Method View getChildAt(int)>
    //   21   41:astore_3        
    //   22   42:aload_0         
    //   23   43:aload_0         
    //   24   44:getfield        #73  <Field long mNextSelectedRowId>
    //   25   47:putfield        #65  <Field long mSyncRowId>
    //   26   50:aload_0         
    //   27   51:aload_0         
    //   28   52:getfield        #71  <Field int mNextSelectedPosition>
    //   29   55:putfield        #234 <Field int mSyncPosition>
    //   30   58:aload_3         
    //   31   59:ifnull          70
    //   32   62:aload_0         
    //   33   63:aload_3         
    //   34   64:invokevirtual   #338 <Method int View.getTop()>
    //   35   67:putfield        #340 <Field int mSpecificTop>
    //   36   70:aload_0         
    //   37   71:iconst_0        
    //   38   72:putfield        #342 <Field int mSyncMode>
    //   39   75:return          
    //   40   76:aload_0         
    //   41   77:iconst_0        
    //   42   78:invokevirtual   #292 <Method View getChildAt(int)>
    //   43   81:astore_1        
    //   44   82:aload_0         
    //   45   83:invokevirtual   #121 <Method Adapter getAdapter()>
    //   46   86:astore_2        
    //   47   87:aload_0         
    //   48   88:getfield        #63  <Field int mFirstPosition>
    //   49   91:iflt            147
    //   50   94:aload_0         
    //   51   95:getfield        #63  <Field int mFirstPosition>
    //   52   98:aload_2         
    //   53   99:invokeinterface #196 <Method int Adapter.getCount()>
    //   54  104:icmpge          147
    //   55  107:aload_0         
    //   56  108:aload_2         
    //   57  109:aload_0         
    //   58  110:getfield        #63  <Field int mFirstPosition>
    //   59  113:invokeinterface #127 <Method long Adapter.getItemId(int)>
    //   60  118:putfield        #65  <Field long mSyncRowId>
    //   61  121:aload_0         
    //   62  122:aload_0         
    //   63  123:getfield        #63  <Field int mFirstPosition>
    //   64  126:putfield        #234 <Field int mSyncPosition>
    //   65  129:aload_1         
    //   66  130:ifnull          141
    //   67  133:aload_0         
    //   68  134:aload_1         
    //   69  135:invokevirtual   #338 <Method int View.getTop()>
    //   70  138:putfield        #340 <Field int mSpecificTop>
    //   71  141:aload_0         
    //   72  142:iconst_1        
    //   73  143:putfield        #342 <Field int mSyncMode>
    //   74  146:return          
    //   75  147:aload_0         
    //   76  148:ldc2w           #343 <Long -1L>
    //   77  151:putfield        #65  <Field long mSyncRowId>
    //   78  154:goto            121
    }

    public void removeAllViews()
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #347 <String "removeAllViews() is not supported in AdapterView">
    //    3    7:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    public void removeView(View view)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #350 <String "removeView(View) is not supported in AdapterView">
    //    3    7:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    public void removeViewAt(int i)
    {
    //    0    0:new             #173 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #353 <String "removeViewAt(int) is not supported in AdapterView">
    //    3    7:invokespecial   #178 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    void selectionChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //    2    4:ifnull          50
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field boolean mInLayout>
    //    5   11:ifne            21
    //    6   14:aload_0         
    //    7   15:getfield        #83  <Field boolean mBlockLayoutRequests>
    //    8   18:ifeq            78
    //    9   21:aload_0         
    //   10   22:getfield        #312 <Field AdapterViewICS$SelectionNotifier mSelectionNotifier>
    //   11   25:ifnonnull       41
    //   12   28:aload_0         
    //   13   29:new             #355 <Class AdapterViewICS$SelectionNotifier>
    //   14   32:dup             
    //   15   33:aload_0         
    //   16   34:aconst_null     
    //   17   35:invokespecial   #358 <Method void AdapterViewICS$SelectionNotifier(AdapterViewICS, AdapterViewICS$1)>
    //   18   38:putfield        #312 <Field AdapterViewICS$SelectionNotifier mSelectionNotifier>
    //   19   41:aload_0         
    //   20   42:aload_0         
    //   21   43:getfield        #312 <Field AdapterViewICS$SelectionNotifier mSelectionNotifier>
    //   22   46:invokevirtual   #361 <Method boolean post(Runnable)>
    //   23   49:pop             
    //   24   50:aload_0         
    //   25   51:getfield        #75  <Field int mSelectedPosition>
    //   26   54:iconst_m1       
    //   27   55:icmpeq          77
    //   28   58:aload_0         
    //   29   59:invokevirtual   #364 <Method boolean isShown()>
    //   30   62:ifeq            77
    //   31   65:aload_0         
    //   32   66:invokevirtual   #367 <Method boolean isInTouchMode()>
    //   33   69:ifne            77
    //   34   72:aload_0         
    //   35   73:iconst_4        
    //   36   74:invokevirtual   #368 <Method void sendAccessibilityEvent(int)>
    //   37   77:return          
    //   38   78:aload_0         
    //   39   79:invokespecial   #107 <Method void fireOnSelected()>
    //   40   82:goto            50
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #144 <Field View mEmptyView>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #121 <Method Adapter getAdapter()>
    //    5    9:astore_2        
    //    6   10:aload_2         
    //    7   11:ifnull          23
    //    8   14:aload_2         
    //    9   15:invokeinterface #209 <Method boolean Adapter.isEmpty()>
    //   10   20:ifeq            31
    //   11   23:iconst_1        
    //   12   24:istore_3        
    //   13   25:aload_0         
    //   14   26:iload_3         
    //   15   27:invokespecial   #211 <Method void updateEmptyStatus(boolean)>
    //   16   30:return          
    //   17   31:iconst_0        
    //   18   32:istore_3        
    //   19   33:goto            25
    }

    public void setFocusable(boolean flag)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #121 <Method Adapter getAdapter()>
    //    4    6:astore_3        
    //    5    7:aload_3         
    //    6    8:ifnull          20
    //    7   11:aload_3         
    //    8   12:invokeinterface #196 <Method int Adapter.getCount()>
    //    9   17:ifne            59
    //   10   20:iload_2         
    //   11   21:istore          4
    //   12   23:aload_0         
    //   13   24:iload_1         
    //   14   25:putfield        #203 <Field boolean mDesiredFocusableState>
    //   15   28:iload_1         
    //   16   29:ifne            37
    //   17   32:aload_0         
    //   18   33:iconst_0        
    //   19   34:putfield        #198 <Field boolean mDesiredFocusableInTouchModeState>
    //   20   37:iload_1         
    //   21   38:ifeq            65
    //   22   41:iload           4
    //   23   43:ifeq            53
    //   24   46:aload_0         
    //   25   47:invokevirtual   #142 <Method boolean isInFilterMode()>
    //   26   50:ifeq            65
    //   27   53:aload_0         
    //   28   54:iload_2         
    //   29   55:invokespecial   #206 <Method void ViewGroup.setFocusable(boolean)>
    //   30   58:return          
    //   31   59:iconst_0        
    //   32   60:istore          4
    //   33   62:goto            23
    //   34   65:iconst_0        
    //   35   66:istore_2        
    //   36   67:goto            53
    }

    public void setFocusableInTouchMode(boolean flag)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #121 <Method Adapter getAdapter()>
    //    4    6:astore_3        
    //    5    7:aload_3         
    //    6    8:ifnull          20
    //    7   11:aload_3         
    //    8   12:invokeinterface #196 <Method int Adapter.getCount()>
    //    9   17:ifne            59
    //   10   20:iload_2         
    //   11   21:istore          4
    //   12   23:aload_0         
    //   13   24:iload_1         
    //   14   25:putfield        #198 <Field boolean mDesiredFocusableInTouchModeState>
    //   15   28:iload_1         
    //   16   29:ifeq            37
    //   17   32:aload_0         
    //   18   33:iload_2         
    //   19   34:putfield        #203 <Field boolean mDesiredFocusableState>
    //   20   37:iload_1         
    //   21   38:ifeq            65
    //   22   41:iload           4
    //   23   43:ifeq            53
    //   24   46:aload_0         
    //   25   47:invokevirtual   #142 <Method boolean isInFilterMode()>
    //   26   50:ifeq            65
    //   27   53:aload_0         
    //   28   54:iload_2         
    //   29   55:invokespecial   #201 <Method void ViewGroup.setFocusableInTouchMode(boolean)>
    //   30   58:return          
    //   31   59:iconst_0        
    //   32   60:istore          4
    //   33   62:goto            23
    //   34   65:iconst_0        
    //   35   66:istore_2        
    //   36   67:goto            53
    }

    void setNextSelectedPositionInt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #71  <Field int mNextSelectedPosition>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:iload_1         
    //    6    8:invokevirtual   #373 <Method long getItemIdAtPosition(int)>
    //    7   11:putfield        #73  <Field long mNextSelectedRowId>
    //    8   14:aload_0         
    //    9   15:getfield        #67  <Field boolean mNeedSync>
    //   10   18:ifeq            45
    //   11   21:aload_0         
    //   12   22:getfield        #342 <Field int mSyncMode>
    //   13   25:ifne            45
    //   14   28:iload_1         
    //   15   29:iflt            45
    //   16   32:aload_0         
    //   17   33:iload_1         
    //   18   34:putfield        #234 <Field int mSyncPosition>
    //   19   37:aload_0         
    //   20   38:aload_0         
    //   21   39:getfield        #73  <Field long mNextSelectedRowId>
    //   22   42:putfield        #65  <Field long mSyncRowId>
    //   23   45:return          
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
    //    0    0:new             #377 <Class RuntimeException>
    //    1    3:dup             
    //    2    4:ldc2            #379 <String "Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead">
    //    3    7:invokespecial   #380 <Method void RuntimeException(String)>
    //    4   10:athrow          
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #268 <Field AdapterViewICS$OnItemClickListener mOnItemClickListener>
    //    3    5:return          
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onitemlongclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #387 <Method boolean isLongClickable()>
    //    2    4:ifne            12
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:invokevirtual   #390 <Method void setLongClickable(boolean)>
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:putfield        #272 <Field AdapterViewICS$OnItemLongClickListener mOnItemLongClickListener>
    //    9   17:return          
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onitemselectedlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #109 <Field AdapterViewICS$OnItemSelectedListener mOnItemSelectedListener>
    //    3    5:return          
    }

    void setSelectedPositionInt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #75  <Field int mSelectedPosition>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:iload_1         
    //    6    8:invokevirtual   #373 <Method long getItemIdAtPosition(int)>
    //    7   11:putfield        #77  <Field long mSelectedRowId>
    //    8   14:return          
    }

    public abstract void setSelection(int i);

    public static final int INVALID_POSITION = -1;
    public static final long INVALID_ROW_ID = 0x8000000000000000L;
    static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
    static final int ITEM_VIEW_TYPE_IGNORE = -1;
    static final int SYNC_FIRST_POSITION = 1;
    static final int SYNC_MAX_DURATION_MILLIS = 100;
    static final int SYNC_SELECTED_POSITION;
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    int mFirstPosition;
    boolean mInLayout;
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    OnItemClickListener mOnItemClickListener;
    OnItemLongClickListener mOnItemLongClickListener;
    OnItemSelectedListener mOnItemSelectedListener;
    int mSelectedPosition;
    long mSelectedRowId;
    private SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;

    static void access$000(AdapterViewICS adapterviewics, Parcelable parcelable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #95  <Method void onRestoreInstanceState(Parcelable)>
    //    3    5:return          
    }

    static Parcelable access$100(AdapterViewICS adapterviewics)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #101 <Method Parcelable onSaveInstanceState()>
    //    2    4:areturn         
    }

    static void access$200(AdapterViewICS adapterviewics)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #107 <Method void fireOnSelected()>
    //    2    4:return          
    }

    // Unreferenced inner class android/support/v7/internal/widget/AdapterViewICS$1

/* anonymous class */
    static class _cls1
    {
    }

}
