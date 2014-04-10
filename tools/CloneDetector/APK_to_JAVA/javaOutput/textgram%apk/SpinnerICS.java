// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS, ListPopupWindow, AdapterViewICS

class SpinnerICS extends AbsSpinnerICS
    implements android.content.DialogInterface.OnClickListener
{
    private class DialogPopup
        implements SpinnerPopup, android.content.DialogInterface.OnClickListener
    {

        private DialogPopup()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field SpinnerICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #23  <Method void Object()>
        //    5    9:return          
        }

        DialogPopup(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #26  <Method void SpinnerICS$DialogPopup(SpinnerICS)>
        //    3    5:return          
        }

        public void dismiss()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #29  <Field AlertDialog mPopup>
        //    2    4:invokevirtual   #33  <Method void AlertDialog.dismiss()>
        //    3    7:aload_0         
        //    4    8:aconst_null     
        //    5    9:putfield        #29  <Field AlertDialog mPopup>
        //    6   12:return          
        }

        public CharSequence getHintText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #37  <Field CharSequence mPrompt>
        //    2    4:areturn         
        }

        public boolean isShowing()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #29  <Field AlertDialog mPopup>
        //    2    4:ifnull          15
        //    3    7:aload_0         
        //    4    8:getfield        #29  <Field AlertDialog mPopup>
        //    5   11:invokevirtual   #41  <Method boolean AlertDialog.isShowing()>
        //    6   14:ireturn         
        //    7   15:iconst_0        
        //    8   16:ireturn         
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field SpinnerICS this$0>
        //    2    4:iload_2         
        //    3    5:invokevirtual   #49  <Method void SpinnerICS.setSelection(int)>
        //    4    8:aload_0         
        //    5    9:getfield        #20  <Field SpinnerICS this$0>
        //    6   12:getfield        #53  <Field AdapterViewICS$OnItemClickListener SpinnerICS.mOnItemClickListener>
        //    7   15:ifnull          38
        //    8   18:aload_0         
        //    9   19:getfield        #20  <Field SpinnerICS this$0>
        //   10   22:aconst_null     
        //   11   23:iload_2         
        //   12   24:aload_0         
        //   13   25:getfield        #55  <Field ListAdapter mListAdapter>
        //   14   28:iload_2         
        //   15   29:invokeinterface #61  <Method long ListAdapter.getItemId(int)>
        //   16   34:invokevirtual   #65  <Method boolean SpinnerICS.performItemClick(View, int, long)>
        //   17   37:pop             
        //   18   38:aload_0         
        //   19   39:invokevirtual   #66  <Method void dismiss()>
        //   20   42:return          
        }

        public void setAdapter(ListAdapter listadapter)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #55  <Field ListAdapter mListAdapter>
        //    3    5:return          
        }

        public void setPromptText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #37  <Field CharSequence mPrompt>
        //    3    5:return          
        }

        public void show()
        {
        //    0    0:new             #73  <Class android.app.AlertDialog$Builder>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #20  <Field SpinnerICS this$0>
        //    4    8:invokevirtual   #77  <Method Context SpinnerICS.getContext()>
        //    5   11:invokespecial   #80  <Method void android.app.AlertDialog$Builder(Context)>
        //    6   14:astore_1        
        //    7   15:aload_0         
        //    8   16:getfield        #37  <Field CharSequence mPrompt>
        //    9   19:ifnull          31
        //   10   22:aload_1         
        //   11   23:aload_0         
        //   12   24:getfield        #37  <Field CharSequence mPrompt>
        //   13   27:invokevirtual   #84  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
        //   14   30:pop             
        //   15   31:aload_0         
        //   16   32:aload_1         
        //   17   33:aload_0         
        //   18   34:getfield        #55  <Field ListAdapter mListAdapter>
        //   19   37:aload_0         
        //   20   38:getfield        #20  <Field SpinnerICS this$0>
        //   21   41:invokevirtual   #88  <Method int SpinnerICS.getSelectedItemPosition()>
        //   22   44:aload_0         
        //   23   45:invokevirtual   #92  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setSingleChoiceItems(ListAdapter, int, android.content.DialogInterface$OnClickListener)>
        //   24   48:invokevirtual   #95  <Method AlertDialog android.app.AlertDialog$Builder.show()>
        //   25   51:putfield        #29  <Field AlertDialog mPopup>
        //   26   54:return          
        }

        private ListAdapter mListAdapter;
        private AlertDialog mPopup;
        private CharSequence mPrompt;
        final SpinnerICS this$0;
    }

    private static class DropDownAdapter
        implements ListAdapter, SpinnerAdapter
    {

        public DropDownAdapter(SpinnerAdapter spinneradapter)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #17  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #19  <Field SpinnerAdapter mAdapter>
        //    5    9:aload_1         
        //    6   10:instanceof      #6   <Class ListAdapter>
        //    7   13:ifeq            24
        //    8   16:aload_0         
        //    9   17:aload_1         
        //   10   18:checkcast       #6   <Class ListAdapter>
        //   11   21:putfield        #21  <Field ListAdapter mListAdapter>
        //   12   24:return          
        }

        public boolean areAllItemsEnabled()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field ListAdapter mListAdapter>
        //    2    4:astore_1        
        //    3    5:aload_1         
        //    4    6:ifnull          16
        //    5    9:aload_1         
        //    6   10:invokeinterface #25  <Method boolean ListAdapter.areAllItemsEnabled()>
        //    7   15:ireturn         
        //    8   16:iconst_1        
        //    9   17:ireturn         
        }

        public int getCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnonnull       9
        //    3    7:iconst_0        
        //    4    8:ireturn         
        //    5    9:aload_0         
        //    6   10:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    7   13:invokeinterface #29  <Method int SpinnerAdapter.getCount()>
        //    8   18:ireturn         
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnonnull       9
        //    3    7:aconst_null     
        //    4    8:areturn         
        //    5    9:aload_0         
        //    6   10:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    7   13:iload_1         
        //    8   14:aload_2         
        //    9   15:aload_3         
        //   10   16:invokeinterface #33  <Method View SpinnerAdapter.getDropDownView(int, View, ViewGroup)>
        //   11   21:areturn         
        }

        public Object getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnonnull       9
        //    3    7:aconst_null     
        //    4    8:areturn         
        //    5    9:aload_0         
        //    6   10:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    7   13:iload_1         
        //    8   14:invokeinterface #37  <Method Object SpinnerAdapter.getItem(int)>
        //    9   19:areturn         
        }

        public long getItemId(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnonnull       11
        //    3    7:ldc2w           #40  <Long -1L>
        //    4   10:lreturn         
        //    5   11:aload_0         
        //    6   12:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    7   15:iload_1         
        //    8   16:invokeinterface #43  <Method long SpinnerAdapter.getItemId(int)>
        //    9   21:lreturn         
        }

        public int getItemViewType(int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:aload_2         
        //    3    3:aload_3         
        //    4    4:invokevirtual   #47  <Method View getDropDownView(int, View, ViewGroup)>
        //    5    7:areturn         
        }

        public int getViewTypeCount()
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public boolean hasStableIds()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnull          21
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    5   11:invokeinterface #51  <Method boolean SpinnerAdapter.hasStableIds()>
        //    6   16:ifeq            21
        //    7   19:iconst_1        
        //    8   20:ireturn         
        //    9   21:iconst_0        
        //   10   22:ireturn         
        }

        public boolean isEmpty()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #53  <Method int getCount()>
        //    2    4:ifne            9
        //    3    7:iconst_1        
        //    4    8:ireturn         
        //    5    9:iconst_0        
        //    6   10:ireturn         
        }

        public boolean isEnabled(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field ListAdapter mListAdapter>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:ifnull          17
        //    5    9:aload_2         
        //    6   10:iload_1         
        //    7   11:invokeinterface #57  <Method boolean ListAdapter.isEnabled(int)>
        //    8   16:ireturn         
        //    9   17:iconst_1        
        //   10   18:ireturn         
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnull          17
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    5   11:aload_1         
        //    6   12:invokeinterface #61  <Method void SpinnerAdapter.registerDataSetObserver(DataSetObserver)>
        //    7   17:return          
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    2    4:ifnull          17
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field SpinnerAdapter mAdapter>
        //    5   11:aload_1         
        //    6   12:invokeinterface #64  <Method void SpinnerAdapter.unregisterDataSetObserver(DataSetObserver)>
        //    7   17:return          
        }

        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;
    }

    private class DropdownPopup extends ListPopupWindow
        implements SpinnerPopup
    {

        public DropdownPopup(Context context, AttributeSet attributeset, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field SpinnerICS this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:aload_3         
        //    6    8:iload           4
        //    7   10:invokespecial   #19  <Method void ListPopupWindow(Context, AttributeSet, int)>
        //    8   13:aload_0         
        //    9   14:aload_1         
        //   10   15:invokevirtual   #23  <Method void setAnchorView(View)>
        //   11   18:aload_0         
        //   12   19:iconst_1        
        //   13   20:invokevirtual   #27  <Method void setModal(boolean)>
        //   14   23:aload_0         
        //   15   24:iconst_0        
        //   16   25:invokevirtual   #31  <Method void setPromptPosition(int)>
        //   17   28:aload_0         
        //   18   29:new             #33  <Class AdapterViewICS$OnItemClickListenerWrapper>
        //   19   32:dup             
        //   20   33:aload_1         
        //   21   34:new             #35  <Class SpinnerICS$DropdownPopup$1>
        //   22   37:dup             
        //   23   38:aload_0         
        //   24   39:aload_1         
        //   25   40:invokespecial   #38  <Method void SpinnerICS$DropdownPopup$1(SpinnerICS$DropdownPopup, SpinnerICS)>
        //   26   43:invokespecial   #41  <Method void AdapterViewICS$OnItemClickListenerWrapper(AdapterViewICS, AdapterViewICS$OnItemClickListener)>
        //   27   46:invokevirtual   #45  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
        //   28   49:return          
        }

        static ListAdapter access$100(DropdownPopup dropdownpopup)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #49  <Field ListAdapter mAdapter>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #49  <Field ListAdapter mAdapter>
        //    5    4:areturn         
        }

        public CharSequence getHintText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #53  <Field CharSequence mHintText>
        //    2    4:areturn         
        }

        public void setAdapter(ListAdapter listadapter)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #57  <Method void ListPopupWindow.setAdapter(ListAdapter)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:putfield        #49  <Field ListAdapter mAdapter>
        //    6   10:return          
        }

        public void setPromptText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #53  <Field CharSequence mHintText>
        //    3    5:return          
        }

        public void show()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field SpinnerICS this$0>
        //    2    4:invokevirtual   #67  <Method int SpinnerICS.getPaddingLeft()>
        //    3    7:istore_1        
        //    4    8:aload_0         
        //    5    9:getfield        #16  <Field SpinnerICS this$0>
        //    6   12:getfield        #71  <Field int SpinnerICS.mDropDownWidth>
        //    7   15:bipush          -2
        //    8   17:icmpne          141
        //    9   20:aload_0         
        //   10   21:getfield        #16  <Field SpinnerICS this$0>
        //   11   24:invokevirtual   #74  <Method int SpinnerICS.getWidth()>
        //   12   27:istore          7
        //   13   29:aload_0         
        //   14   30:getfield        #16  <Field SpinnerICS this$0>
        //   15   33:invokevirtual   #77  <Method int SpinnerICS.getPaddingRight()>
        //   16   36:istore          8
        //   17   38:aload_0         
        //   18   39:aload_0         
        //   19   40:getfield        #16  <Field SpinnerICS this$0>
        //   20   43:aload_0         
        //   21   44:getfield        #49  <Field ListAdapter mAdapter>
        //   22   47:checkcast       #79  <Class SpinnerAdapter>
        //   23   50:aload_0         
        //   24   51:invokevirtual   #83  <Method Drawable getBackground()>
        //   25   54:invokevirtual   #87  <Method int SpinnerICS.measureContentWidth(SpinnerAdapter, Drawable)>
        //   26   57:iload           7
        //   27   59:iload_1         
        //   28   60:isub            
        //   29   61:iload           8
        //   30   63:isub            
        //   31   64:invokestatic    #93  <Method int Math.max(int, int)>
        //   32   67:invokevirtual   #96  <Method void setContentWidth(int)>
        //   33   70:aload_0         
        //   34   71:invokevirtual   #83  <Method Drawable getBackground()>
        //   35   74:astore_2        
        //   36   75:iconst_0        
        //   37   76:istore_3        
        //   38   77:aload_2         
        //   39   78:ifnull          105
        //   40   81:aload_2         
        //   41   82:aload_0         
        //   42   83:getfield        #16  <Field SpinnerICS this$0>
        //   43   86:invokestatic    #100 <Method Rect SpinnerICS.access$200(SpinnerICS)>
        //   44   89:invokevirtual   #106 <Method boolean Drawable.getPadding(Rect)>
        //   45   92:pop             
        //   46   93:aload_0         
        //   47   94:getfield        #16  <Field SpinnerICS this$0>
        //   48   97:invokestatic    #100 <Method Rect SpinnerICS.access$200(SpinnerICS)>
        //   49  100:getfield        #111 <Field int Rect.left>
        //   50  103:ineg            
        //   51  104:istore_3        
        //   52  105:aload_0         
        //   53  106:iload_3         
        //   54  107:iload_1         
        //   55  108:iadd            
        //   56  109:invokevirtual   #114 <Method void setHorizontalOffset(int)>
        //   57  112:aload_0         
        //   58  113:iconst_2        
        //   59  114:invokevirtual   #117 <Method void setInputMethodMode(int)>
        //   60  117:aload_0         
        //   61  118:invokespecial   #119 <Method void ListPopupWindow.show()>
        //   62  121:aload_0         
        //   63  122:invokevirtual   #123 <Method ListView getListView()>
        //   64  125:iconst_1        
        //   65  126:invokevirtual   #128 <Method void ListView.setChoiceMode(int)>
        //   66  129:aload_0         
        //   67  130:aload_0         
        //   68  131:getfield        #16  <Field SpinnerICS this$0>
        //   69  134:invokevirtual   #131 <Method int SpinnerICS.getSelectedItemPosition()>
        //   70  137:invokevirtual   #134 <Method void setSelection(int)>
        //   71  140:return          
        //   72  141:aload_0         
        //   73  142:getfield        #16  <Field SpinnerICS this$0>
        //   74  145:getfield        #71  <Field int SpinnerICS.mDropDownWidth>
        //   75  148:iconst_m1       
        //   76  149:icmpne          184
        //   77  152:aload_0         
        //   78  153:getfield        #16  <Field SpinnerICS this$0>
        //   79  156:invokevirtual   #74  <Method int SpinnerICS.getWidth()>
        //   80  159:istore          5
        //   81  161:aload_0         
        //   82  162:getfield        #16  <Field SpinnerICS this$0>
        //   83  165:invokevirtual   #77  <Method int SpinnerICS.getPaddingRight()>
        //   84  168:istore          6
        //   85  170:aload_0         
        //   86  171:iload           5
        //   87  173:iload_1         
        //   88  174:isub            
        //   89  175:iload           6
        //   90  177:isub            
        //   91  178:invokevirtual   #96  <Method void setContentWidth(int)>
        //   92  181:goto            70
        //   93  184:aload_0         
        //   94  185:aload_0         
        //   95  186:getfield        #16  <Field SpinnerICS this$0>
        //   96  189:getfield        #71  <Field int SpinnerICS.mDropDownWidth>
        //   97  192:invokevirtual   #96  <Method void setContentWidth(int)>
        //   98  195:goto            70
        }

        private ListAdapter mAdapter;
        private CharSequence mHintText;
        final SpinnerICS this$0;

        static ListAdapter access$100(DropdownPopup dropdownpopup)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #49  <Field ListAdapter mAdapter>
        //    2    4:areturn         
        }
    }

    private static interface SpinnerPopup
    {

        public abstract void dismiss();

        public abstract CharSequence getHintText();

        public abstract boolean isShowing();

        public abstract void setAdapter(ListAdapter listadapter);

        public abstract void setPromptText(CharSequence charsequence);

        public abstract void show();
    }


    SpinnerICS(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #32  <Method void SpinnerICS(Context, AttributeSet)>
    //    4    6:return          
    }

    SpinnerICS(Context context, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:getstatic       #38  <Field int android.support.v7.appcompat.R$attr.spinnerStyle>
    //    4    6:iload_2         
    //    5    7:invokespecial   #41  <Method void SpinnerICS(Context, AttributeSet, int, int)>
    //    6   10:return          
    }

    SpinnerICS(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #38  <Field int android.support.v7.appcompat.R$attr.spinnerStyle>
    //    4    6:invokespecial   #44  <Method void SpinnerICS(Context, AttributeSet, int)>
    //    5    9:return          
    }

    SpinnerICS(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:iconst_m1       
    //    5    5:invokespecial   #41  <Method void SpinnerICS(Context, AttributeSet, int, int)>
    //    6    8:return          
    }

    SpinnerICS(Context context, AttributeSet attributeset, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #45  <Method void AbsSpinnerICS(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:new             #47  <Class Rect>
    //    7   11:dup             
    //    8   12:invokespecial   #50  <Method void Rect()>
    //    9   15:putfield        #52  <Field Rect mTempRect>
    //   10   18:aload_1         
    //   11   19:aload_2         
    //   12   20:getstatic       #57  <Field int[] android.support.v7.appcompat.R$styleable.Spinner>
    //   13   23:iload_3         
    //   14   24:iconst_0        
    //   15   25:invokevirtual   #63  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   16   28:astore          5
    //   17   30:iload           4
    //   18   32:iconst_m1       
    //   19   33:icmpne          46
    //   20   36:aload           5
    //   21   38:bipush          7
    //   22   40:iconst_0        
    //   23   41:invokevirtual   #69  <Method int TypedArray.getInt(int, int)>
    //   24   44:istore          4
    //   25   46:iload           4
    //   26   48:tableswitch     0 1: default 72
    //                   0 131
    //                   1 147
    //   27   72:aload_0         
    //   28   73:aload           5
    //   29   75:iconst_0        
    //   30   76:bipush          17
    //   31   78:invokevirtual   #69  <Method int TypedArray.getInt(int, int)>
    //   32   81:putfield        #71  <Field int mGravity>
    //   33   84:aload_0         
    //   34   85:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //   35   88:aload           5
    //   36   90:bipush          6
    //   37   92:invokevirtual   #77  <Method String TypedArray.getString(int)>
    //   38   95:invokeinterface #83  <Method void SpinnerICS$SpinnerPopup.setPromptText(CharSequence)>
    //   39  100:aload           5
    //   40  102:invokevirtual   #86  <Method void TypedArray.recycle()>
    //   41  105:aload_0         
    //   42  106:getfield        #88  <Field SpinnerICS$DropDownAdapter mTempAdapter>
    //   43  109:ifnull          130
    //   44  112:aload_0         
    //   45  113:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //   46  116:aload_0         
    //   47  117:getfield        #88  <Field SpinnerICS$DropDownAdapter mTempAdapter>
    //   48  120:invokeinterface #92  <Method void SpinnerICS$SpinnerPopup.setAdapter(ListAdapter)>
    //   49  125:aload_0         
    //   50  126:aconst_null     
    //   51  127:putfield        #88  <Field SpinnerICS$DropDownAdapter mTempAdapter>
    //   52  130:return          
    //   53  131:aload_0         
    //   54  132:new             #94  <Class SpinnerICS$DialogPopup>
    //   55  135:dup             
    //   56  136:aload_0         
    //   57  137:aconst_null     
    //   58  138:invokespecial   #97  <Method void SpinnerICS$DialogPopup(SpinnerICS, SpinnerICS$1)>
    //   59  141:putfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //   60  144:goto            72
    //   61  147:new             #99  <Class SpinnerICS$DropdownPopup>
    //   62  150:dup             
    //   63  151:aload_0         
    //   64  152:aload_1         
    //   65  153:aload_2         
    //   66  154:iload_3         
    //   67  155:invokespecial   #102 <Method void SpinnerICS$DropdownPopup(SpinnerICS, Context, AttributeSet, int)>
    //   68  158:astore          6
    //   69  160:aload_0         
    //   70  161:aload           5
    //   71  163:iconst_3        
    //   72  164:bipush          -2
    //   73  166:invokevirtual   #105 <Method int TypedArray.getLayoutDimension(int, int)>
    //   74  169:putfield        #107 <Field int mDropDownWidth>
    //   75  172:aload           6
    //   76  174:aload           5
    //   77  176:iconst_2        
    //   78  177:invokevirtual   #111 <Method Drawable TypedArray.getDrawable(int)>
    //   79  180:invokevirtual   #115 <Method void SpinnerICS$DropdownPopup.setBackgroundDrawable(Drawable)>
    //   80  183:aload           5
    //   81  185:iconst_5        
    //   82  186:iconst_0        
    //   83  187:invokevirtual   #118 <Method int TypedArray.getDimensionPixelOffset(int, int)>
    //   84  190:istore          7
    //   85  192:iload           7
    //   86  194:ifeq            204
    //   87  197:aload           6
    //   88  199:iload           7
    //   89  201:invokevirtual   #122 <Method void SpinnerICS$DropdownPopup.setVerticalOffset(int)>
    //   90  204:aload           5
    //   91  206:iconst_4        
    //   92  207:iconst_0        
    //   93  208:invokevirtual   #118 <Method int TypedArray.getDimensionPixelOffset(int, int)>
    //   94  211:istore          8
    //   95  213:iload           8
    //   96  215:ifeq            225
    //   97  218:aload           6
    //   98  220:iload           8
    //   99  222:invokevirtual   #125 <Method void SpinnerICS$DropdownPopup.setHorizontalOffset(int)>
    //  100  225:aload_0         
    //  101  226:aload           6
    //  102  228:putfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //  103  231:goto            72
    }

    static Rect access$200(SpinnerICS spinnerics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field Rect mTempRect>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #52  <Field Rect mTempRect>
    //    5    4:areturn         
    }

    private View makeAndAddView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #133 <Field boolean mDataChanged>
    //    2    4:ifne            27
    //    3    7:aload_0         
    //    4    8:getfield        #137 <Field AbsSpinnerICS$RecycleBin mRecycler>
    //    5   11:iload_1         
    //    6   12:invokevirtual   #142 <Method View AbsSpinnerICS$RecycleBin.get(int)>
    //    7   15:astore_3        
    //    8   16:aload_3         
    //    9   17:ifnull          27
    //   10   20:aload_0         
    //   11   21:aload_3         
    //   12   22:invokespecial   #146 <Method void setUpChild(View)>
    //   13   25:aload_3         
    //   14   26:areturn         
    //   15   27:aload_0         
    //   16   28:getfield        #150 <Field SpinnerAdapter mAdapter>
    //   17   31:iload_1         
    //   18   32:aconst_null     
    //   19   33:aload_0         
    //   20   34:invokeinterface #156 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
    //   21   39:astore_2        
    //   22   40:aload_0         
    //   23   41:aload_2         
    //   24   42:invokespecial   #146 <Method void setUpChild(View)>
    //   25   45:aload_2         
    //   26   46:areturn         
    }

    private void setUpChild(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnonnull       14
    //    5    9:aload_0         
    //    6   10:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:iconst_0        
    //   11   17:aload_2         
    //   12   18:invokevirtual   #169 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
    //   13   21:pop             
    //   14   22:aload_1         
    //   15   23:aload_0         
    //   16   24:invokevirtual   #173 <Method boolean hasFocus()>
    //   17   27:invokevirtual   #177 <Method void View.setSelected(boolean)>
    //   18   30:aload_0         
    //   19   31:getfield        #180 <Field int mHeightMeasureSpec>
    //   20   34:aload_0         
    //   21   35:getfield        #183 <Field Rect mSpinnerPadding>
    //   22   38:getfield        #186 <Field int Rect.top>
    //   23   41:aload_0         
    //   24   42:getfield        #183 <Field Rect mSpinnerPadding>
    //   25   45:getfield        #189 <Field int Rect.bottom>
    //   26   48:iadd            
    //   27   49:aload_2         
    //   28   50:getfield        #194 <Field int android.view.ViewGroup$LayoutParams.height>
    //   29   53:invokestatic    #200 <Method int ViewGroup.getChildMeasureSpec(int, int, int)>
    //   30   56:istore          4
    //   31   58:aload_1         
    //   32   59:aload_0         
    //   33   60:getfield        #203 <Field int mWidthMeasureSpec>
    //   34   63:aload_0         
    //   35   64:getfield        #183 <Field Rect mSpinnerPadding>
    //   36   67:getfield        #206 <Field int Rect.left>
    //   37   70:aload_0         
    //   38   71:getfield        #183 <Field Rect mSpinnerPadding>
    //   39   74:getfield        #209 <Field int Rect.right>
    //   40   77:iadd            
    //   41   78:aload_2         
    //   42   79:getfield        #212 <Field int android.view.ViewGroup$LayoutParams.width>
    //   43   82:invokestatic    #200 <Method int ViewGroup.getChildMeasureSpec(int, int, int)>
    //   44   85:iload           4
    //   45   87:invokevirtual   #216 <Method void View.measure(int, int)>
    //   46   90:aload_0         
    //   47   91:getfield        #183 <Field Rect mSpinnerPadding>
    //   48   94:getfield        #186 <Field int Rect.top>
    //   49   97:aload_0         
    //   50   98:invokevirtual   #220 <Method int getMeasuredHeight()>
    //   51  101:aload_0         
    //   52  102:getfield        #183 <Field Rect mSpinnerPadding>
    //   53  105:getfield        #189 <Field int Rect.bottom>
    //   54  108:isub            
    //   55  109:aload_0         
    //   56  110:getfield        #183 <Field Rect mSpinnerPadding>
    //   57  113:getfield        #186 <Field int Rect.top>
    //   58  116:isub            
    //   59  117:aload_1         
    //   60  118:invokevirtual   #221 <Method int View.getMeasuredHeight()>
    //   61  121:isub            
    //   62  122:iconst_2        
    //   63  123:idiv            
    //   64  124:iadd            
    //   65  125:istore          5
    //   66  127:iload           5
    //   67  129:aload_1         
    //   68  130:invokevirtual   #221 <Method int View.getMeasuredHeight()>
    //   69  133:iadd            
    //   70  134:istore          6
    //   71  136:aload_1         
    //   72  137:iconst_0        
    //   73  138:iload           5
    //   74  140:iconst_0        
    //   75  141:aload_1         
    //   76  142:invokevirtual   #224 <Method int View.getMeasuredWidth()>
    //   77  145:iadd            
    //   78  146:iload           6
    //   79  148:invokevirtual   #228 <Method void View.layout(int, int, int, int)>
    //   80  151:return          
    }

    public int getBaseline()
    {
    //    0    0:iconst_m1       
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #232 <Method int getChildCount()>
    //    4    6:ifle            40
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:invokevirtual   #235 <Method View getChildAt(int)>
    //    8   14:astore_3        
    //    9   15:aload_3         
    //   10   16:ifnull          38
    //   11   19:aload_3         
    //   12   20:invokevirtual   #237 <Method int View.getBaseline()>
    //   13   23:istore          5
    //   14   25:iload           5
    //   15   27:iflt            38
    //   16   30:iload           5
    //   17   32:aload_3         
    //   18   33:invokevirtual   #240 <Method int View.getTop()>
    //   19   36:iadd            
    //   20   37:istore_1        
    //   21   38:iload_1         
    //   22   39:ireturn         
    //   23   40:aload_0         
    //   24   41:getfield        #150 <Field SpinnerAdapter mAdapter>
    //   25   44:astore_2        
    //   26   45:aconst_null     
    //   27   46:astore_3        
    //   28   47:aload_2         
    //   29   48:ifnull          15
    //   30   51:aload_0         
    //   31   52:getfield        #150 <Field SpinnerAdapter mAdapter>
    //   32   55:invokeinterface #243 <Method int SpinnerAdapter.getCount()>
    //   33   60:istore          4
    //   34   62:aconst_null     
    //   35   63:astore_3        
    //   36   64:iload           4
    //   37   66:ifle            15
    //   38   69:aload_0         
    //   39   70:iconst_0        
    //   40   71:invokespecial   #245 <Method View makeAndAddView(int)>
    //   41   74:astore_3        
    //   42   75:aload_0         
    //   43   76:getfield        #137 <Field AbsSpinnerICS$RecycleBin mRecycler>
    //   44   79:iconst_0        
    //   45   80:aload_3         
    //   46   81:invokevirtual   #249 <Method void AbsSpinnerICS$RecycleBin.put(int, View)>
    //   47   84:aload_0         
    //   48   85:invokevirtual   #252 <Method void removeAllViewsInLayout()>
    //   49   88:goto            15
    }

    public CharSequence getPrompt()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    2    4:invokeinterface #257 <Method CharSequence SpinnerICS$SpinnerPopup.getHintText()>
    //    3    9:areturn         
    }

    void layout(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #183 <Field Rect mSpinnerPadding>
    //    2    4:getfield        #206 <Field int Rect.left>
    //    3    7:istore_3        
    //    4    8:aload_0         
    //    5    9:invokevirtual   #261 <Method int getRight()>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #264 <Method int getLeft()>
    //    8   16:isub            
    //    9   17:aload_0         
    //   10   18:getfield        #183 <Field Rect mSpinnerPadding>
    //   11   21:getfield        #206 <Field int Rect.left>
    //   12   24:isub            
    //   13   25:aload_0         
    //   14   26:getfield        #183 <Field Rect mSpinnerPadding>
    //   15   29:getfield        #209 <Field int Rect.right>
    //   16   32:isub            
    //   17   33:istore          4
    //   18   35:aload_0         
    //   19   36:getfield        #133 <Field boolean mDataChanged>
    //   20   39:ifeq            46
    //   21   42:aload_0         
    //   22   43:invokevirtual   #267 <Method void handleDataChanged()>
    //   23   46:aload_0         
    //   24   47:getfield        #270 <Field int mItemCount>
    //   25   50:ifne            58
    //   26   53:aload_0         
    //   27   54:invokevirtual   #273 <Method void resetList()>
    //   28   57:return          
    //   29   58:aload_0         
    //   30   59:getfield        #276 <Field int mNextSelectedPosition>
    //   31   62:iflt            73
    //   32   65:aload_0         
    //   33   66:aload_0         
    //   34   67:getfield        #276 <Field int mNextSelectedPosition>
    //   35   70:invokevirtual   #279 <Method void setSelectedPositionInt(int)>
    //   36   73:aload_0         
    //   37   74:invokevirtual   #282 <Method void recycleAllViews()>
    //   38   77:aload_0         
    //   39   78:invokevirtual   #252 <Method void removeAllViewsInLayout()>
    //   40   81:aload_0         
    //   41   82:aload_0         
    //   42   83:getfield        #285 <Field int mSelectedPosition>
    //   43   86:putfield        #288 <Field int mFirstPosition>
    //   44   89:aload_0         
    //   45   90:aload_0         
    //   46   91:getfield        #285 <Field int mSelectedPosition>
    //   47   94:invokespecial   #245 <Method View makeAndAddView(int)>
    //   48   97:astore          5
    //   49   99:aload           5
    //   50  101:invokevirtual   #224 <Method int View.getMeasuredWidth()>
    //   51  104:istore          6
    //   52  106:iload_3         
    //   53  107:istore          7
    //   54  109:bipush          7
    //   55  111:aload_0         
    //   56  112:getfield        #71  <Field int mGravity>
    //   57  115:iand            
    //   58  116:lookupswitch    2: default 144
    //                   1: 185
    //                   5: 201
    //   59  144:aload           5
    //   60  146:iload           7
    //   61  148:invokevirtual   #291 <Method void View.offsetLeftAndRight(int)>
    //   62  151:aload_0         
    //   63  152:getfield        #137 <Field AbsSpinnerICS$RecycleBin mRecycler>
    //   64  155:invokevirtual   #294 <Method void AbsSpinnerICS$RecycleBin.clear()>
    //   65  158:aload_0         
    //   66  159:invokevirtual   #297 <Method void invalidate()>
    //   67  162:aload_0         
    //   68  163:invokevirtual   #300 <Method void checkSelectionChanged()>
    //   69  166:aload_0         
    //   70  167:iconst_0        
    //   71  168:putfield        #133 <Field boolean mDataChanged>
    //   72  171:aload_0         
    //   73  172:iconst_0        
    //   74  173:putfield        #303 <Field boolean mNeedSync>
    //   75  176:aload_0         
    //   76  177:aload_0         
    //   77  178:getfield        #285 <Field int mSelectedPosition>
    //   78  181:invokevirtual   #306 <Method void setNextSelectedPositionInt(int)>
    //   79  184:return          
    //   80  185:iload_3         
    //   81  186:iload           4
    //   82  188:iconst_2        
    //   83  189:idiv            
    //   84  190:iadd            
    //   85  191:iload           6
    //   86  193:iconst_2        
    //   87  194:idiv            
    //   88  195:isub            
    //   89  196:istore          7
    //   90  198:goto            144
    //   91  201:iload_3         
    //   92  202:iload           4
    //   93  204:iadd            
    //   94  205:iload           6
    //   95  207:isub            
    //   96  208:istore          7
    //   97  210:goto            144
    }

    int measureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       8
    //    2    4:iconst_0        
    //    3    5:istore_3        
    //    4    6:iload_3         
    //    5    7:ireturn         
    //    6    8:iconst_0        
    //    7    9:istore_3        
    //    8   10:aconst_null     
    //    9   11:astore          4
    //   10   13:iconst_0        
    //   11   14:istore          5
    //   12   16:iconst_0        
    //   13   17:iconst_0        
    //   14   18:invokestatic    #313 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   15   21:istore          6
    //   16   23:iconst_0        
    //   17   24:iconst_0        
    //   18   25:invokestatic    #313 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   19   28:istore          7
    //   20   30:iconst_0        
    //   21   31:aload_0         
    //   22   32:invokevirtual   #316 <Method int getSelectedItemPosition()>
    //   23   35:invokestatic    #321 <Method int Math.max(int, int)>
    //   24   38:istore          8
    //   25   40:aload_1         
    //   26   41:invokeinterface #243 <Method int SpinnerAdapter.getCount()>
    //   27   46:iload           8
    //   28   48:bipush          15
    //   29   50:iadd            
    //   30   51:invokestatic    #324 <Method int Math.min(int, int)>
    //   31   54:istore          9
    //   32   56:iconst_0        
    //   33   57:iload           8
    //   34   59:bipush          15
    //   35   61:iload           9
    //   36   63:iload           8
    //   37   65:isub            
    //   38   66:isub            
    //   39   67:isub            
    //   40   68:invokestatic    #321 <Method int Math.max(int, int)>
    //   41   71:istore          10
    //   42   73:iload           10
    //   43   75:iload           9
    //   44   77:icmpge          166
    //   45   80:aload_1         
    //   46   81:iload           10
    //   47   83:invokeinterface #328 <Method int SpinnerAdapter.getItemViewType(int)>
    //   48   88:istore          12
    //   49   90:iload           12
    //   50   92:iload           5
    //   51   94:icmpeq          104
    //   52   97:iload           12
    //   53   99:istore          5
    //   54  101:aconst_null     
    //   55  102:astore          4
    //   56  104:aload_1         
    //   57  105:iload           10
    //   58  107:aload           4
    //   59  109:aload_0         
    //   60  110:invokeinterface #156 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
    //   61  115:astore          4
    //   62  117:aload           4
    //   63  119:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   64  122:ifnonnull       141
    //   65  125:aload           4
    //   66  127:new             #191 <Class android.view.ViewGroup$LayoutParams>
    //   67  130:dup             
    //   68  131:bipush          -2
    //   69  133:bipush          -2
    //   70  135:invokespecial   #330 <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   71  138:invokevirtual   #334 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   72  141:aload           4
    //   73  143:iload           6
    //   74  145:iload           7
    //   75  147:invokevirtual   #216 <Method void View.measure(int, int)>
    //   76  150:iload_3         
    //   77  151:aload           4
    //   78  153:invokevirtual   #224 <Method int View.getMeasuredWidth()>
    //   79  156:invokestatic    #321 <Method int Math.max(int, int)>
    //   80  159:istore_3        
    //   81  160:iinc            10  1
    //   82  163:goto            73
    //   83  166:aload_2         
    //   84  167:ifnull          6
    //   85  170:aload_2         
    //   86  171:aload_0         
    //   87  172:getfield        #52  <Field Rect mTempRect>
    //   88  175:invokevirtual   #340 <Method boolean Drawable.getPadding(Rect)>
    //   89  178:pop             
    //   90  179:iload_3         
    //   91  180:aload_0         
    //   92  181:getfield        #52  <Field Rect mTempRect>
    //   93  184:getfield        #206 <Field int Rect.left>
    //   94  187:aload_0         
    //   95  188:getfield        #52  <Field Rect mTempRect>
    //   96  191:getfield        #209 <Field int Rect.right>
    //   97  194:iadd            
    //   98  195:iadd            
    //   99  196:ireturn         
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_2         
    //    2    2:invokevirtual   #345 <Method void setSelection(int)>
    //    3    5:aload_1         
    //    4    6:invokeinterface #350 <Method void DialogInterface.dismiss()>
    //    5   11:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #353 <Method void AbsSpinnerICS.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    4    8:ifnull          32
    //    5   11:aload_0         
    //    6   12:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    7   15:invokeinterface #356 <Method boolean SpinnerICS$SpinnerPopup.isShowing()>
    //    8   20:ifeq            32
    //    9   23:aload_0         
    //   10   24:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //   11   27:invokeinterface #357 <Method void SpinnerICS$SpinnerPopup.dismiss()>
    //   12   32:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:iload           5
    //    6    8:invokespecial   #361 <Method void AbsSpinnerICS.onLayout(boolean, int, int, int, int)>
    //    7   11:aload_0         
    //    8   12:iconst_1        
    //    9   13:putfield        #364 <Field boolean mInLayout>
    //   10   16:aload_0         
    //   11   17:iconst_0        
    //   12   18:iconst_0        
    //   13   19:invokevirtual   #366 <Method void layout(int, boolean)>
    //   14   22:aload_0         
    //   15   23:iconst_0        
    //   16   24:putfield        #364 <Field boolean mInLayout>
    //   17   27:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #369 <Method void AbsSpinnerICS.onMeasure(int, int)>
    //    4    6:aload_0         
    //    5    7:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    6   10:ifnull          57
    //    7   13:iload_1         
    //    8   14:invokestatic    #372 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    9   17:ldc2            #373 <Int 0x80000000>
    //   10   20:icmpne          57
    //   11   23:aload_0         
    //   12   24:aload_0         
    //   13   25:invokevirtual   #374 <Method int getMeasuredWidth()>
    //   14   28:aload_0         
    //   15   29:aload_0         
    //   16   30:invokevirtual   #378 <Method SpinnerAdapter getAdapter()>
    //   17   33:aload_0         
    //   18   34:invokevirtual   #382 <Method Drawable getBackground()>
    //   19   37:invokevirtual   #384 <Method int measureContentWidth(SpinnerAdapter, Drawable)>
    //   20   40:invokestatic    #321 <Method int Math.max(int, int)>
    //   21   43:iload_1         
    //   22   44:invokestatic    #387 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   23   47:invokestatic    #324 <Method int Math.min(int, int)>
    //   24   50:aload_0         
    //   25   51:invokevirtual   #220 <Method int getMeasuredHeight()>
    //   26   54:invokevirtual   #390 <Method void setMeasuredDimension(int, int)>
    //   27   57:return          
    }

    public boolean performClick()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #393 <Method boolean AbsSpinnerICS.performClick()>
    //    2    4:istore_1        
    //    3    5:iload_1         
    //    4    6:ifne            32
    //    5    9:iconst_1        
    //    6   10:istore_1        
    //    7   11:aload_0         
    //    8   12:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    9   15:invokeinterface #356 <Method boolean SpinnerICS$SpinnerPopup.isShowing()>
    //   10   20:ifne            32
    //   11   23:aload_0         
    //   12   24:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //   13   27:invokeinterface #396 <Method void SpinnerICS$SpinnerPopup.show()>
    //   14   32:iload_1         
    //   15   33:ireturn         
    }

    public volatile void setAdapter(Adapter adapter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #152 <Class SpinnerAdapter>
    //    3    5:invokevirtual   #400 <Method void setAdapter(SpinnerAdapter)>
    //    4    8:return          
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #401 <Method void AbsSpinnerICS.setAdapter(SpinnerAdapter)>
    //    3    5:aload_0         
    //    4    6:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    5    9:ifnull          30
    //    6   12:aload_0         
    //    7   13:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    8   16:new             #403 <Class SpinnerICS$DropDownAdapter>
    //    9   19:dup             
    //   10   20:aload_1         
    //   11   21:invokespecial   #405 <Method void SpinnerICS$DropDownAdapter(SpinnerAdapter)>
    //   12   24:invokeinterface #92  <Method void SpinnerICS$SpinnerPopup.setAdapter(ListAdapter)>
    //   13   29:return          
    //   14   30:aload_0         
    //   15   31:new             #403 <Class SpinnerICS$DropDownAdapter>
    //   16   34:dup             
    //   17   35:aload_1         
    //   18   36:invokespecial   #405 <Method void SpinnerICS$DropDownAdapter(SpinnerAdapter)>
    //   19   39:putfield        #88  <Field SpinnerICS$DropDownAdapter mTempAdapter>
    //   20   42:return          
    }

    public void setGravity(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field int mGravity>
    //    2    4:iload_1         
    //    3    5:icmpeq          28
    //    4    8:iload_1         
    //    5    9:bipush          7
    //    6   11:iand            
    //    7   12:ifne            19
    //    8   15:iload_1         
    //    9   16:iconst_3        
    //   10   17:ior             
    //   11   18:istore_1        
    //   12   19:aload_0         
    //   13   20:iload_1         
    //   14   21:putfield        #71  <Field int mGravity>
    //   15   24:aload_0         
    //   16   25:invokevirtual   #409 <Method void requestLayout()>
    //   17   28:return          
    }

    public void setOnItemClickListener(AdapterViewICS.OnItemClickListener onitemclicklistener)
    {
    //    0    0:new             #413 <Class RuntimeException>
    //    1    3:dup             
    //    2    4:ldc2            #415 <String "setOnItemClickListener cannot be used with a spinner.">
    //    3    7:invokespecial   #418 <Method void RuntimeException(String)>
    //    4   10:athrow          
    }

    void setOnItemClickListenerInt(AdapterViewICS.OnItemClickListener onitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #421 <Method void AbsSpinnerICS.setOnItemClickListener(AdapterViewICS$OnItemClickListener)>
    //    3    5:return          
    }

    public void setPrompt(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field SpinnerICS$SpinnerPopup mPopup>
    //    2    4:aload_1         
    //    3    5:invokeinterface #83  <Method void SpinnerICS$SpinnerPopup.setPromptText(CharSequence)>
    //    4   10:return          
    }

    public void setPromptId(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #427 <Method Context getContext()>
    //    3    5:iload_1         
    //    4    6:invokevirtual   #431 <Method CharSequence Context.getText(int)>
    //    5    9:invokevirtual   #433 <Method void setPrompt(CharSequence)>
    //    6   12:return          
    }

    private static final int MAX_ITEMS_MEASURED = 15;
    static final int MODE_DIALOG = 0;
    static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "Spinner";
    int mDropDownWidth;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;

    static Rect access$200(SpinnerICS spinnerics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field Rect mTempRect>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/SpinnerICS$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v7/internal/widget/SpinnerICS$DropdownPopup$1

/* anonymous class */
    class DropdownPopup._cls1
        implements AdapterViewICS.OnItemClickListener
    {

        DropdownPopup._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field SpinnerICS val$this$0>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void onItemClick(AdapterViewICS adapterviewics, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //    2    4:getfield        #28  <Field SpinnerICS SpinnerICS$DropdownPopup.this$0>
        //    3    7:iload_3         
        //    4    8:invokevirtual   #34  <Method void SpinnerICS.setSelection(int)>
        //    5   11:aload_0         
        //    6   12:getfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //    7   15:getfield        #28  <Field SpinnerICS SpinnerICS$DropdownPopup.this$0>
        //    8   18:getfield        #38  <Field AdapterViewICS$OnItemClickListener SpinnerICS.mOnItemClickListener>
        //    9   21:ifnull          50
        //   10   24:aload_0         
        //   11   25:getfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //   12   28:getfield        #28  <Field SpinnerICS SpinnerICS$DropdownPopup.this$0>
        //   13   31:aload_2         
        //   14   32:iload_3         
        //   15   33:aload_0         
        //   16   34:getfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //   17   37:invokestatic    #42  <Method ListAdapter SpinnerICS$DropdownPopup.access$100(SpinnerICS$DropdownPopup)>
        //   18   40:iload_3         
        //   19   41:invokeinterface #48  <Method long ListAdapter.getItemId(int)>
        //   20   46:invokevirtual   #52  <Method boolean SpinnerICS.performItemClick(View, int, long)>
        //   21   49:pop             
        //   22   50:aload_0         
        //   23   51:getfield        #18  <Field SpinnerICS$DropdownPopup this$1>
        //   24   54:invokevirtual   #55  <Method void SpinnerICS$DropdownPopup.dismiss()>
        //   25   57:return          
        }

        final DropdownPopup this$1;
        final SpinnerICS val$this$0;
    }

}
