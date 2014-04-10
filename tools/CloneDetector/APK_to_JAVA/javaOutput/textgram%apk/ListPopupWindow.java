// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.*;
import android.view.*;
import android.widget.*;

public class ListPopupWindow
{
    private static class DropDownListView extends ListView
    {

        public DropDownListView(Context context, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:getstatic       #22  <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
        //    4    6:invokespecial   #25  <Method void ListView(Context, AttributeSet, int)>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #27  <Field boolean mHijackFocus>
        //    8   14:aload_0         
        //    9   15:iconst_0        
        //   10   16:invokevirtual   #31  <Method void setCacheColorHint(int)>
        //   11   19:return          
        }

        static boolean access$502(DropDownListView dropdownlistview, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #35  <Field boolean mListSelectionHidden>
        //    3    5:iload_1         
        //    4    6:ireturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:iload_1         
        //    7    2:putfield        #35  <Field boolean mListSelectionHidden>
        //    8    5:iload_1         
        //    9    6:ireturn         
        }

        static int access$600(DropDownListView dropdownlistview, int i, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #41  <Method int lookForSelectablePosition(int, boolean)>
        //    4    6:ireturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:iload_1         
        //    7    2:iload_2         
        //    8    3:invokespecial   #41  <Method int lookForSelectablePosition(int, boolean)>
        //    9    6:ireturn         
        }

        private int lookForSelectablePosition(int i, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #45  <Method ListAdapter getAdapter()>
        //    2    4:astore_3        
        //    3    5:aload_3         
        //    4    6:ifnull          16
        //    5    9:aload_0         
        //    6   10:invokevirtual   #49  <Method boolean isInTouchMode()>
        //    7   13:ifeq            18
        //    8   16:iconst_m1       
        //    9   17:ireturn         
        //   10   18:aload_3         
        //   11   19:invokeinterface #55  <Method int ListAdapter.getCount()>
        //   12   24:istore          4
        //   13   26:aload_0         
        //   14   27:invokevirtual   #45  <Method ListAdapter getAdapter()>
        //   15   30:invokeinterface #58  <Method boolean ListAdapter.areAllItemsEnabled()>
        //   16   35:ifne            120
        //   17   38:iload_2         
        //   18   39:ifeq            73
        //   19   42:iconst_0        
        //   20   43:iload_1         
        //   21   44:invokestatic    #64  <Method int Math.max(int, int)>
        //   22   47:istore          5
        //   23   49:iload           5
        //   24   51:iload           4
        //   25   53:icmpge          105
        //   26   56:aload_3         
        //   27   57:iload           5
        //   28   59:invokeinterface #68  <Method boolean ListAdapter.isEnabled(int)>
        //   29   64:ifne            105
        //   30   67:iinc            5  1
        //   31   70:goto            49
        //   32   73:iload_1         
        //   33   74:iload           4
        //   34   76:iconst_1        
        //   35   77:isub            
        //   36   78:invokestatic    #71  <Method int Math.min(int, int)>
        //   37   81:istore          5
        //   38   83:iload           5
        //   39   85:iflt            105
        //   40   88:aload_3         
        //   41   89:iload           5
        //   42   91:invokeinterface #68  <Method boolean ListAdapter.isEnabled(int)>
        //   43   96:ifne            105
        //   44   99:iinc            5  -1
        //   45  102:goto            83
        //   46  105:iload           5
        //   47  107:iflt            16
        //   48  110:iload           5
        //   49  112:iload           4
        //   50  114:icmpge          16
        //   51  117:iload           5
        //   52  119:ireturn         
        //   53  120:iload_1         
        //   54  121:iflt            16
        //   55  124:iload_1         
        //   56  125:iload           4
        //   57  127:icmpge          16
        //   58  130:iload_1         
        //   59  131:ireturn         
        }

        public boolean hasFocus()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field boolean mHijackFocus>
        //    2    4:ifne            14
        //    3    7:aload_0         
        //    4    8:invokespecial   #74  <Method boolean ListView.hasFocus()>
        //    5   11:ifeq            16
        //    6   14:iconst_1        
        //    7   15:ireturn         
        //    8   16:iconst_0        
        //    9   17:ireturn         
        }

        public boolean hasWindowFocus()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field boolean mHijackFocus>
        //    2    4:ifne            14
        //    3    7:aload_0         
        //    4    8:invokespecial   #77  <Method boolean ListView.hasWindowFocus()>
        //    5   11:ifeq            16
        //    6   14:iconst_1        
        //    7   15:ireturn         
        //    8   16:iconst_0        
        //    9   17:ireturn         
        }

        public boolean isFocused()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field boolean mHijackFocus>
        //    2    4:ifne            14
        //    3    7:aload_0         
        //    4    8:invokespecial   #80  <Method boolean ListView.isFocused()>
        //    5   11:ifeq            16
        //    6   14:iconst_1        
        //    7   15:ireturn         
        //    8   16:iconst_0        
        //    9   17:ireturn         
        }

        public boolean isInTouchMode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field boolean mHijackFocus>
        //    2    4:ifeq            14
        //    3    7:aload_0         
        //    4    8:getfield        #35  <Field boolean mListSelectionHidden>
        //    5   11:ifne            21
        //    6   14:aload_0         
        //    7   15:invokespecial   #81  <Method boolean ListView.isInTouchMode()>
        //    8   18:ifeq            23
        //    9   21:iconst_1        
        //   10   22:ireturn         
        //   11   23:iconst_0        
        //   12   24:ireturn         
        }

        final int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #86  <Method int getListPaddingTop()>
        //    2    4:istore          6
        //    3    6:aload_0         
        //    4    7:invokevirtual   #89  <Method int getListPaddingBottom()>
        //    5   10:istore          7
        //    6   12:aload_0         
        //    7   13:invokevirtual   #92  <Method int getListPaddingLeft()>
        //    8   16:pop             
        //    9   17:aload_0         
        //   10   18:invokevirtual   #95  <Method int getListPaddingRight()>
        //   11   21:pop             
        //   12   22:aload_0         
        //   13   23:invokevirtual   #98  <Method int getDividerHeight()>
        //   14   26:istore          10
        //   15   28:aload_0         
        //   16   29:invokevirtual   #102 <Method Drawable getDivider()>
        //   17   32:astore          11
        //   18   34:aload_0         
        //   19   35:invokevirtual   #45  <Method ListAdapter getAdapter()>
        //   20   38:astore          12
        //   21   40:aload           12
        //   22   42:ifnonnull       55
        //   23   45:iload           6
        //   24   47:iload           7
        //   25   49:iadd            
        //   26   50:istore          15
        //   27   52:iload           15
        //   28   54:ireturn         
        //   29   55:iload           6
        //   30   57:iload           7
        //   31   59:iadd            
        //   32   60:istore          13
        //   33   62:iload           10
        //   34   64:ifle            231
        //   35   67:aload           11
        //   36   69:ifnull          231
        //   37   72:iload           10
        //   38   74:istore          14
        //   39   76:iconst_0        
        //   40   77:istore          15
        //   41   79:aconst_null     
        //   42   80:astore          16
        //   43   82:iconst_0        
        //   44   83:istore          17
        //   45   85:aload           12
        //   46   87:invokeinterface #55  <Method int ListAdapter.getCount()>
        //   47   92:istore          18
        //   48   94:iconst_0        
        //   49   95:istore          19
        //   50   97:iload           19
        //   51   99:iload           18
        //   52  101:icmpge          269
        //   53  104:aload           12
        //   54  106:iload           19
        //   55  108:invokeinterface #106 <Method int ListAdapter.getItemViewType(int)>
        //   56  113:istore          20
        //   57  115:iload           20
        //   58  117:iload           17
        //   59  119:icmpeq          129
        //   60  122:aconst_null     
        //   61  123:astore          16
        //   62  125:iload           20
        //   63  127:istore          17
        //   64  129:aload           12
        //   65  131:iload           19
        //   66  133:aload           16
        //   67  135:aload_0         
        //   68  136:invokeinterface #110 <Method View ListAdapter.getView(int, View, ViewGroup)>
        //   69  141:astore          16
        //   70  143:aload           16
        //   71  145:invokevirtual   #116 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //   72  148:getfield        #121 <Field int android.view.ViewGroup$LayoutParams.height>
        //   73  151:istore          21
        //   74  153:iload           21
        //   75  155:ifle            237
        //   76  158:iload           21
        //   77  160:ldc1            #122 <Int 0x40000000>
        //   78  162:invokestatic    #127 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   79  165:istore          22
        //   80  167:aload           16
        //   81  169:iload_1         
        //   82  170:iload           22
        //   83  172:invokevirtual   #131 <Method void View.measure(int, int)>
        //   84  175:iload           19
        //   85  177:ifle            187
        //   86  180:iload           13
        //   87  182:iload           14
        //   88  184:iadd            
        //   89  185:istore          13
        //   90  187:iload           13
        //   91  189:aload           16
        //   92  191:invokevirtual   #134 <Method int View.getMeasuredHeight()>
        //   93  194:iadd            
        //   94  195:istore          13
        //   95  197:iload           13
        //   96  199:iload           4
        //   97  201:icmplt          247
        //   98  204:iload           5
        //   99  206:iflt            228
        //  100  209:iload           19
        //  101  211:iload           5
        //  102  213:icmple          228
        //  103  216:iload           15
        //  104  218:ifle            228
        //  105  221:iload           13
        //  106  223:iload           4
        //  107  225:icmpne          52
        //  108  228:iload           4
        //  109  230:ireturn         
        //  110  231:iconst_0        
        //  111  232:istore          14
        //  112  234:goto            76
        //  113  237:iconst_0        
        //  114  238:iconst_0        
        //  115  239:invokestatic    #127 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //  116  242:istore          22
        //  117  244:goto            167
        //  118  247:iload           5
        //  119  249:iflt            263
        //  120  252:iload           19
        //  121  254:iload           5
        //  122  256:icmplt          263
        //  123  259:iload           13
        //  124  261:istore          15
        //  125  263:iinc            19  1
        //  126  266:goto            97
        //  127  269:iload           13
        //  128  271:ireturn         
        }

        public static final int INVALID_POSITION = -1;
        static final int NO_POSITION = -1;
        private static final String TAG = "ListPopupWindow.DropDownListView";
        private boolean mHijackFocus;
        private boolean mListSelectionHidden;

        static boolean access$502(DropDownListView dropdownlistview, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #35  <Field boolean mListSelectionHidden>
        //    3    5:iload_1         
        //    4    6:ireturn         
        }

        static int access$600(DropDownListView dropdownlistview, int i, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #41  <Method int lookForSelectablePosition(int, boolean)>
        //    4    6:ireturn         
        }
    }

    private class ListSelectorHider
        implements Runnable
    {

        private ListSelectorHider()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ListSelectorHider(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ListPopupWindow$ListSelectorHider(ListPopupWindow)>
        //    3    5:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ListPopupWindow this$0>
        //    2    4:invokevirtual   #24  <Method void ListPopupWindow.clearListSelection()>
        //    3    7:return          
        }

        final ListPopupWindow this$0;
    }

    private class PopupDataSetObserver extends DataSetObserver
    {

        private PopupDataSetObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void DataSetObserver()>
        //    5    9:return          
        }

        PopupDataSetObserver(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void ListPopupWindow$PopupDataSetObserver(ListPopupWindow)>
        //    3    5:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ListPopupWindow this$0>
        //    2    4:invokevirtual   #23  <Method boolean ListPopupWindow.isShowing()>
        //    3    7:ifeq            17
        //    4   10:aload_0         
        //    5   11:getfield        #10  <Field ListPopupWindow this$0>
        //    6   14:invokevirtual   #26  <Method void ListPopupWindow.show()>
        //    7   17:return          
        }

        public void onInvalidated()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ListPopupWindow this$0>
        //    2    4:invokevirtual   #30  <Method void ListPopupWindow.dismiss()>
        //    3    7:return          
        }

        final ListPopupWindow this$0;
    }

    private class PopupScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        private PopupScrollListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        PopupScrollListener(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ListPopupWindow$PopupScrollListener(ListPopupWindow)>
        //    3    5:return          
        }

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        //    0    0:return          
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
        //    0    0:iload_2         
        //    1    1:iconst_1        
        //    2    2:icmpne          55
        //    3    5:aload_0         
        //    4    6:getfield        #12  <Field ListPopupWindow this$0>
        //    5    9:invokevirtual   #28  <Method boolean ListPopupWindow.isInputMethodNotNeeded()>
        //    6   12:ifne            55
        //    7   15:aload_0         
        //    8   16:getfield        #12  <Field ListPopupWindow this$0>
        //    9   19:invokestatic    #32  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   10   22:invokevirtual   #38  <Method View PopupWindow.getContentView()>
        //   11   25:ifnull          55
        //   12   28:aload_0         
        //   13   29:getfield        #12  <Field ListPopupWindow this$0>
        //   14   32:invokestatic    #42  <Method Handler ListPopupWindow.access$1000(ListPopupWindow)>
        //   15   35:aload_0         
        //   16   36:getfield        #12  <Field ListPopupWindow this$0>
        //   17   39:invokestatic    #46  <Method ListPopupWindow$ResizePopupRunnable ListPopupWindow.access$900(ListPopupWindow)>
        //   18   42:invokevirtual   #52  <Method void Handler.removeCallbacks(Runnable)>
        //   19   45:aload_0         
        //   20   46:getfield        #12  <Field ListPopupWindow this$0>
        //   21   49:invokestatic    #46  <Method ListPopupWindow$ResizePopupRunnable ListPopupWindow.access$900(ListPopupWindow)>
        //   22   52:invokevirtual   #57  <Method void ListPopupWindow$ResizePopupRunnable.run()>
        //   23   55:return          
        }

        final ListPopupWindow this$0;
    }

    private class PopupTouchInterceptor
        implements android.view.View.OnTouchListener
    {

        private PopupTouchInterceptor()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        PopupTouchInterceptor(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ListPopupWindow$PopupTouchInterceptor(ListPopupWindow)>
        //    3    5:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #26  <Method int MotionEvent.getAction()>
        //    2    4:istore_3        
        //    3    5:aload_2         
        //    4    6:invokevirtual   #30  <Method float MotionEvent.getX()>
        //    5    9:f2i             
        //    6   10:istore          4
        //    7   12:aload_2         
        //    8   13:invokevirtual   #33  <Method float MotionEvent.getY()>
        //    9   16:f2i             
        //   10   17:istore          5
        //   11   19:iload_3         
        //   12   20:ifne            109
        //   13   23:aload_0         
        //   14   24:getfield        #12  <Field ListPopupWindow this$0>
        //   15   27:invokestatic    #39  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   16   30:ifnull          109
        //   17   33:aload_0         
        //   18   34:getfield        #12  <Field ListPopupWindow this$0>
        //   19   37:invokestatic    #39  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   20   40:invokevirtual   #45  <Method boolean PopupWindow.isShowing()>
        //   21   43:ifeq            109
        //   22   46:iload           4
        //   23   48:iflt            109
        //   24   51:iload           4
        //   25   53:aload_0         
        //   26   54:getfield        #12  <Field ListPopupWindow this$0>
        //   27   57:invokestatic    #39  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   28   60:invokevirtual   #48  <Method int PopupWindow.getWidth()>
        //   29   63:icmpge          109
        //   30   66:iload           5
        //   31   68:iflt            109
        //   32   71:iload           5
        //   33   73:aload_0         
        //   34   74:getfield        #12  <Field ListPopupWindow this$0>
        //   35   77:invokestatic    #39  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   36   80:invokevirtual   #51  <Method int PopupWindow.getHeight()>
        //   37   83:icmpge          109
        //   38   86:aload_0         
        //   39   87:getfield        #12  <Field ListPopupWindow this$0>
        //   40   90:invokestatic    #55  <Method Handler ListPopupWindow.access$1000(ListPopupWindow)>
        //   41   93:aload_0         
        //   42   94:getfield        #12  <Field ListPopupWindow this$0>
        //   43   97:invokestatic    #59  <Method ListPopupWindow$ResizePopupRunnable ListPopupWindow.access$900(ListPopupWindow)>
        //   44  100:ldc2w           #60  <Long 250L>
        //   45  103:invokevirtual   #67  <Method boolean Handler.postDelayed(Runnable, long)>
        //   46  106:pop             
        //   47  107:iconst_0        
        //   48  108:ireturn         
        //   49  109:iload_3         
        //   50  110:iconst_1        
        //   51  111:icmpne          107
        //   52  114:aload_0         
        //   53  115:getfield        #12  <Field ListPopupWindow this$0>
        //   54  118:invokestatic    #55  <Method Handler ListPopupWindow.access$1000(ListPopupWindow)>
        //   55  121:aload_0         
        //   56  122:getfield        #12  <Field ListPopupWindow this$0>
        //   57  125:invokestatic    #59  <Method ListPopupWindow$ResizePopupRunnable ListPopupWindow.access$900(ListPopupWindow)>
        //   58  128:invokevirtual   #71  <Method void Handler.removeCallbacks(Runnable)>
        //   59  131:goto            107
        }

        final ListPopupWindow this$0;
    }

    private class ResizePopupRunnable
        implements Runnable
    {

        private ResizePopupRunnable()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ResizePopupRunnable(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ListPopupWindow$ResizePopupRunnable(ListPopupWindow)>
        //    3    5:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ListPopupWindow this$0>
        //    2    4:invokestatic    #25  <Method ListPopupWindow$DropDownListView ListPopupWindow.access$700(ListPopupWindow)>
        //    3    7:ifnull          71
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ListPopupWindow this$0>
        //    6   14:invokestatic    #25  <Method ListPopupWindow$DropDownListView ListPopupWindow.access$700(ListPopupWindow)>
        //    7   17:invokevirtual   #31  <Method int ListPopupWindow$DropDownListView.getCount()>
        //    8   20:aload_0         
        //    9   21:getfield        #12  <Field ListPopupWindow this$0>
        //   10   24:invokestatic    #25  <Method ListPopupWindow$DropDownListView ListPopupWindow.access$700(ListPopupWindow)>
        //   11   27:invokevirtual   #34  <Method int ListPopupWindow$DropDownListView.getChildCount()>
        //   12   30:icmple          71
        //   13   33:aload_0         
        //   14   34:getfield        #12  <Field ListPopupWindow this$0>
        //   15   37:invokestatic    #25  <Method ListPopupWindow$DropDownListView ListPopupWindow.access$700(ListPopupWindow)>
        //   16   40:invokevirtual   #34  <Method int ListPopupWindow$DropDownListView.getChildCount()>
        //   17   43:aload_0         
        //   18   44:getfield        #12  <Field ListPopupWindow this$0>
        //   19   47:getfield        #38  <Field int ListPopupWindow.mListItemExpandMaximum>
        //   20   50:icmpgt          71
        //   21   53:aload_0         
        //   22   54:getfield        #12  <Field ListPopupWindow this$0>
        //   23   57:invokestatic    #42  <Method PopupWindow ListPopupWindow.access$800(ListPopupWindow)>
        //   24   60:iconst_2        
        //   25   61:invokevirtual   #48  <Method void PopupWindow.setInputMethodMode(int)>
        //   26   64:aload_0         
        //   27   65:getfield        #12  <Field ListPopupWindow this$0>
        //   28   68:invokevirtual   #51  <Method void ListPopupWindow.show()>
        //   29   71:return          
        }

        final ListPopupWindow this$0;
    }


    public ListPopupWindow(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:getstatic       #76  <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
    //    4    6:invokespecial   #79  <Method void ListPopupWindow(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public ListPopupWindow(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #76  <Field int android.support.v7.appcompat.R$attr.listPopupWindowStyle>
    //    4    6:invokespecial   #79  <Method void ListPopupWindow(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public ListPopupWindow(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #83  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:bipush          -2
    //    4    7:putfield        #85  <Field int mDropDownHeight>
    //    5   10:aload_0         
    //    6   11:bipush          -2
    //    7   13:putfield        #87  <Field int mDropDownWidth>
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #89  <Field boolean mDropDownAlwaysVisible>
    //   11   21:aload_0         
    //   12   22:iconst_0        
    //   13   23:putfield        #91  <Field boolean mForceIgnoreOutsideTouch>
    //   14   26:aload_0         
    //   15   27:ldc1            #92  <Int 0x7fffffff>
    //   16   29:putfield        #94  <Field int mListItemExpandMaximum>
    //   17   32:aload_0         
    //   18   33:iconst_0        
    //   19   34:putfield        #96  <Field int mPromptPosition>
    //   20   37:aload_0         
    //   21   38:new             #98  <Class ListPopupWindow$ResizePopupRunnable>
    //   22   41:dup             
    //   23   42:aload_0         
    //   24   43:aconst_null     
    //   25   44:invokespecial   #101 <Method void ListPopupWindow$ResizePopupRunnable(ListPopupWindow, ListPopupWindow$1)>
    //   26   47:putfield        #103 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
    //   27   50:aload_0         
    //   28   51:new             #105 <Class ListPopupWindow$PopupTouchInterceptor>
    //   29   54:dup             
    //   30   55:aload_0         
    //   31   56:aconst_null     
    //   32   57:invokespecial   #106 <Method void ListPopupWindow$PopupTouchInterceptor(ListPopupWindow, ListPopupWindow$1)>
    //   33   60:putfield        #108 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
    //   34   63:aload_0         
    //   35   64:new             #110 <Class ListPopupWindow$PopupScrollListener>
    //   36   67:dup             
    //   37   68:aload_0         
    //   38   69:aconst_null     
    //   39   70:invokespecial   #111 <Method void ListPopupWindow$PopupScrollListener(ListPopupWindow, ListPopupWindow$1)>
    //   40   73:putfield        #113 <Field ListPopupWindow$PopupScrollListener mScrollListener>
    //   41   76:aload_0         
    //   42   77:new             #115 <Class ListPopupWindow$ListSelectorHider>
    //   43   80:dup             
    //   44   81:aload_0         
    //   45   82:aconst_null     
    //   46   83:invokespecial   #116 <Method void ListPopupWindow$ListSelectorHider(ListPopupWindow, ListPopupWindow$1)>
    //   47   86:putfield        #118 <Field ListPopupWindow$ListSelectorHider mHideSelector>
    //   48   89:aload_0         
    //   49   90:new             #120 <Class Handler>
    //   50   93:dup             
    //   51   94:invokespecial   #121 <Method void Handler()>
    //   52   97:putfield        #123 <Field Handler mHandler>
    //   53  100:aload_0         
    //   54  101:new             #125 <Class Rect>
    //   55  104:dup             
    //   56  105:invokespecial   #126 <Method void Rect()>
    //   57  108:putfield        #128 <Field Rect mTempRect>
    //   58  111:aload_0         
    //   59  112:aload_1         
    //   60  113:putfield        #130 <Field Context mContext>
    //   61  116:aload_0         
    //   62  117:new             #132 <Class PopupWindow>
    //   63  120:dup             
    //   64  121:aload_1         
    //   65  122:aload_2         
    //   66  123:iload_3         
    //   67  124:invokespecial   #133 <Method void PopupWindow(Context, AttributeSet, int)>
    //   68  127:putfield        #135 <Field PopupWindow mPopup>
    //   69  130:aload_0         
    //   70  131:getfield        #135 <Field PopupWindow mPopup>
    //   71  134:iconst_1        
    //   72  135:invokevirtual   #139 <Method void PopupWindow.setInputMethodMode(int)>
    //   73  138:aload_0         
    //   74  139:getfield        #130 <Field Context mContext>
    //   75  142:invokevirtual   #145 <Method Resources Context.getResources()>
    //   76  145:invokevirtual   #151 <Method Configuration Resources.getConfiguration()>
    //   77  148:getfield        #157 <Field java.util.Locale Configuration.locale>
    //   78  151:pop             
    //   79  152:return          
    }

    static Handler access$1000(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Handler mHandler>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #123 <Field Handler mHandler>
    //    5    4:areturn         
    }

    static DropDownListView access$700(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    5    4:areturn         
    }

    static PopupWindow access$800(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #135 <Field PopupWindow mPopup>
    //    5    4:areturn         
    }

    static ResizePopupRunnable access$900(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #103 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
    //    5    4:areturn         
    }

    private int buildDropDown()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:ifnonnull       464
    //    3    7:aload_0         
    //    4    8:getfield        #130 <Field Context mContext>
    //    5   11:astore          12
    //    6   13:aload_0         
    //    7   14:new             #171 <Class ListPopupWindow$1>
    //    8   17:dup             
    //    9   18:aload_0         
    //   10   19:invokespecial   #174 <Method void ListPopupWindow$1(ListPopupWindow)>
    //   11   22:putfield        #176 <Field Runnable mShowDropDownRunnable>
    //   12   25:aload_0         
    //   13   26:getfield        #178 <Field boolean mModal>
    //   14   29:ifne            420
    //   15   32:iconst_1        
    //   16   33:istore          13
    //   17   35:aload_0         
    //   18   36:new             #180 <Class ListPopupWindow$DropDownListView>
    //   19   39:dup             
    //   20   40:aload           12
    //   21   42:iload           13
    //   22   44:invokespecial   #183 <Method void ListPopupWindow$DropDownListView(Context, boolean)>
    //   23   47:putfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   24   50:aload_0         
    //   25   51:getfield        #185 <Field Drawable mDropDownListHighlight>
    //   26   54:ifnull          68
    //   27   57:aload_0         
    //   28   58:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   29   61:aload_0         
    //   30   62:getfield        #185 <Field Drawable mDropDownListHighlight>
    //   31   65:invokevirtual   #189 <Method void ListPopupWindow$DropDownListView.setSelector(Drawable)>
    //   32   68:aload_0         
    //   33   69:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   34   72:aload_0         
    //   35   73:getfield        #191 <Field ListAdapter mAdapter>
    //   36   76:invokevirtual   #195 <Method void ListPopupWindow$DropDownListView.setAdapter(ListAdapter)>
    //   37   79:aload_0         
    //   38   80:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   39   83:aload_0         
    //   40   84:getfield        #197 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
    //   41   87:invokevirtual   #201 <Method void ListPopupWindow$DropDownListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   42   90:aload_0         
    //   43   91:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   44   94:iconst_1        
    //   45   95:invokevirtual   #205 <Method void ListPopupWindow$DropDownListView.setFocusable(boolean)>
    //   46   98:aload_0         
    //   47   99:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   48  102:iconst_1        
    //   49  103:invokevirtual   #208 <Method void ListPopupWindow$DropDownListView.setFocusableInTouchMode(boolean)>
    //   50  106:aload_0         
    //   51  107:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   52  110:new             #210 <Class ListPopupWindow$2>
    //   53  113:dup             
    //   54  114:aload_0         
    //   55  115:invokespecial   #211 <Method void ListPopupWindow$2(ListPopupWindow)>
    //   56  118:invokevirtual   #215 <Method void ListPopupWindow$DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
    //   57  121:aload_0         
    //   58  122:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   59  125:aload_0         
    //   60  126:getfield        #113 <Field ListPopupWindow$PopupScrollListener mScrollListener>
    //   61  129:invokevirtual   #219 <Method void ListPopupWindow$DropDownListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
    //   62  132:aload_0         
    //   63  133:getfield        #221 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
    //   64  136:ifnull          150
    //   65  139:aload_0         
    //   66  140:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   67  143:aload_0         
    //   68  144:getfield        #221 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
    //   69  147:invokevirtual   #215 <Method void ListPopupWindow$DropDownListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
    //   70  150:aload_0         
    //   71  151:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   72  154:astore          14
    //   73  156:aload_0         
    //   74  157:getfield        #223 <Field View mPromptView>
    //   75  160:astore          15
    //   76  162:iconst_0        
    //   77  163:istore_3        
    //   78  164:aload           15
    //   79  166:ifnull          300
    //   80  169:new             #225 <Class LinearLayout>
    //   81  172:dup             
    //   82  173:aload           12
    //   83  175:invokespecial   #227 <Method void LinearLayout(Context)>
    //   84  178:astore          16
    //   85  180:aload           16
    //   86  182:iconst_1        
    //   87  183:invokevirtual   #230 <Method void LinearLayout.setOrientation(int)>
    //   88  186:new             #232 <Class android.widget.LinearLayout$LayoutParams>
    //   89  189:dup             
    //   90  190:iconst_m1       
    //   91  191:iconst_0        
    //   92  192:fconst_1        
    //   93  193:invokespecial   #235 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   94  196:astore          17
    //   95  198:aload_0         
    //   96  199:getfield        #96  <Field int mPromptPosition>
    //   97  202:tableswitch     0 1: default 224
    //                   0 445
    //                   1 426
    //   98  224:ldc1            #23  <String "ListPopupWindow">
    //   99  226:new             #237 <Class StringBuilder>
    //  100  229:dup             
    //  101  230:invokespecial   #238 <Method void StringBuilder()>
    //  102  233:ldc1            #240 <String "Invalid hint position ">
    //  103  235:invokevirtual   #244 <Method StringBuilder StringBuilder.append(String)>
    //  104  238:aload_0         
    //  105  239:getfield        #96  <Field int mPromptPosition>
    //  106  242:invokevirtual   #247 <Method StringBuilder StringBuilder.append(int)>
    //  107  245:invokevirtual   #251 <Method String StringBuilder.toString()>
    //  108  248:invokestatic    #257 <Method int Log.e(String, String)>
    //  109  251:pop             
    //  110  252:aload           15
    //  111  254:aload_0         
    //  112  255:getfield        #87  <Field int mDropDownWidth>
    //  113  258:ldc2            #258 <Int 0x80000000>
    //  114  261:invokestatic    #264 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  115  264:iconst_0        
    //  116  265:invokevirtual   #270 <Method void View.measure(int, int)>
    //  117  268:aload           15
    //  118  270:invokevirtual   #274 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  119  273:checkcast       #232 <Class android.widget.LinearLayout$LayoutParams>
    //  120  276:astore          18
    //  121  278:aload           15
    //  122  280:invokevirtual   #277 <Method int View.getMeasuredHeight()>
    //  123  283:aload           18
    //  124  285:getfield        #280 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //  125  288:iadd            
    //  126  289:aload           18
    //  127  291:getfield        #283 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
    //  128  294:iadd            
    //  129  295:istore_3        
    //  130  296:aload           16
    //  131  298:astore          14
    //  132  300:aload_0         
    //  133  301:getfield        #135 <Field PopupWindow mPopup>
    //  134  304:aload           14
    //  135  306:invokevirtual   #287 <Method void PopupWindow.setContentView(View)>
    //  136  309:aload_0         
    //  137  310:getfield        #135 <Field PopupWindow mPopup>
    //  138  313:invokevirtual   #291 <Method Drawable PopupWindow.getBackground()>
    //  139  316:astore          5
    //  140  318:aload           5
    //  141  320:ifnull          515
    //  142  323:aload           5
    //  143  325:aload_0         
    //  144  326:getfield        #128 <Field Rect mTempRect>
    //  145  329:invokevirtual   #297 <Method boolean Drawable.getPadding(Rect)>
    //  146  332:pop             
    //  147  333:aload_0         
    //  148  334:getfield        #128 <Field Rect mTempRect>
    //  149  337:getfield        #300 <Field int Rect.top>
    //  150  340:aload_0         
    //  151  341:getfield        #128 <Field Rect mTempRect>
    //  152  344:getfield        #303 <Field int Rect.bottom>
    //  153  347:iadd            
    //  154  348:istore          6
    //  155  350:aload_0         
    //  156  351:getfield        #305 <Field boolean mDropDownVerticalOffsetSet>
    //  157  354:ifne            369
    //  158  357:aload_0         
    //  159  358:aload_0         
    //  160  359:getfield        #128 <Field Rect mTempRect>
    //  161  362:getfield        #300 <Field int Rect.top>
    //  162  365:ineg            
    //  163  366:putfield        #307 <Field int mDropDownVerticalOffset>
    //  164  369:aload_0         
    //  165  370:getfield        #135 <Field PopupWindow mPopup>
    //  166  373:invokevirtual   #310 <Method int PopupWindow.getInputMethodMode()>
    //  167  376:iconst_2        
    //  168  377:icmpne          528
    //  169  380:iconst_1        
    //  170  381:istore          7
    //  171  383:aload_0         
    //  172  384:aload_0         
    //  173  385:invokevirtual   #314 <Method View getAnchorView()>
    //  174  388:aload_0         
    //  175  389:getfield        #307 <Field int mDropDownVerticalOffset>
    //  176  392:iload           7
    //  177  394:invokevirtual   #318 <Method int getMaxAvailableHeight(View, int, boolean)>
    //  178  397:istore          8
    //  179  399:aload_0         
    //  180  400:getfield        #89  <Field boolean mDropDownAlwaysVisible>
    //  181  403:ifne            414
    //  182  406:aload_0         
    //  183  407:getfield        #85  <Field int mDropDownHeight>
    //  184  410:iconst_m1       
    //  185  411:icmpne          534
    //  186  414:iload           8
    //  187  416:iload           6
    //  188  418:iadd            
    //  189  419:ireturn         
    //  190  420:iconst_0        
    //  191  421:istore          13
    //  192  423:goto            35
    //  193  426:aload           16
    //  194  428:aload           14
    //  195  430:aload           17
    //  196  432:invokevirtual   #322 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //  197  435:aload           16
    //  198  437:aload           15
    //  199  439:invokevirtual   #324 <Method void LinearLayout.addView(View)>
    //  200  442:goto            252
    //  201  445:aload           16
    //  202  447:aload           15
    //  203  449:invokevirtual   #324 <Method void LinearLayout.addView(View)>
    //  204  452:aload           16
    //  205  454:aload           14
    //  206  456:aload           17
    //  207  458:invokevirtual   #322 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //  208  461:goto            252
    //  209  464:aload_0         
    //  210  465:getfield        #135 <Field PopupWindow mPopup>
    //  211  468:invokevirtual   #327 <Method View PopupWindow.getContentView()>
    //  212  471:checkcast       #329 <Class ViewGroup>
    //  213  474:pop             
    //  214  475:aload_0         
    //  215  476:getfield        #223 <Field View mPromptView>
    //  216  479:astore_2        
    //  217  480:iconst_0        
    //  218  481:istore_3        
    //  219  482:aload_2         
    //  220  483:ifnull          309
    //  221  486:aload_2         
    //  222  487:invokevirtual   #274 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  223  490:checkcast       #232 <Class android.widget.LinearLayout$LayoutParams>
    //  224  493:astore          4
    //  225  495:aload_2         
    //  226  496:invokevirtual   #277 <Method int View.getMeasuredHeight()>
    //  227  499:aload           4
    //  228  501:getfield        #280 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //  229  504:iadd            
    //  230  505:aload           4
    //  231  507:getfield        #283 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
    //  232  510:iadd            
    //  233  511:istore_3        
    //  234  512:goto            309
    //  235  515:aload_0         
    //  236  516:getfield        #128 <Field Rect mTempRect>
    //  237  519:invokevirtual   #332 <Method void Rect.setEmpty()>
    //  238  522:iconst_0        
    //  239  523:istore          6
    //  240  525:goto            369
    //  241  528:iconst_0        
    //  242  529:istore          7
    //  243  531:goto            383
    //  244  534:aload_0         
    //  245  535:getfield        #87  <Field int mDropDownWidth>
    //  246  538:tableswitch     -2 -1: default 560
    //                   -2 605
    //                   -1 645
    //  247  560:aload_0         
    //  248  561:getfield        #87  <Field int mDropDownWidth>
    //  249  564:ldc2            #333 <Int 0x40000000>
    //  250  567:invokestatic    #264 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  251  570:istore          9
    //  252  572:aload_0         
    //  253  573:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //  254  576:iload           9
    //  255  578:iconst_0        
    //  256  579:iconst_m1       
    //  257  580:iload           8
    //  258  582:iload_3         
    //  259  583:isub            
    //  260  584:iconst_m1       
    //  261  585:invokevirtual   #337 <Method int ListPopupWindow$DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
    //  262  588:istore          10
    //  263  590:iload           10
    //  264  592:ifle            600
    //  265  595:iload_3         
    //  266  596:iload           6
    //  267  598:iadd            
    //  268  599:istore_3        
    //  269  600:iload           10
    //  270  602:iload_3         
    //  271  603:iadd            
    //  272  604:ireturn         
    //  273  605:aload_0         
    //  274  606:getfield        #130 <Field Context mContext>
    //  275  609:invokevirtual   #145 <Method Resources Context.getResources()>
    //  276  612:invokevirtual   #341 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //  277  615:getfield        #346 <Field int DisplayMetrics.widthPixels>
    //  278  618:aload_0         
    //  279  619:getfield        #128 <Field Rect mTempRect>
    //  280  622:getfield        #349 <Field int Rect.left>
    //  281  625:aload_0         
    //  282  626:getfield        #128 <Field Rect mTempRect>
    //  283  629:getfield        #352 <Field int Rect.right>
    //  284  632:iadd            
    //  285  633:isub            
    //  286  634:ldc2            #258 <Int 0x80000000>
    //  287  637:invokestatic    #264 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  288  640:istore          9
    //  289  642:goto            572
    //  290  645:aload_0         
    //  291  646:getfield        #130 <Field Context mContext>
    //  292  649:invokevirtual   #145 <Method Resources Context.getResources()>
    //  293  652:invokevirtual   #341 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //  294  655:getfield        #346 <Field int DisplayMetrics.widthPixels>
    //  295  658:aload_0         
    //  296  659:getfield        #128 <Field Rect mTempRect>
    //  297  662:getfield        #349 <Field int Rect.left>
    //  298  665:aload_0         
    //  299  666:getfield        #128 <Field Rect mTempRect>
    //  300  669:getfield        #352 <Field int Rect.right>
    //  301  672:iadd            
    //  302  673:isub            
    //  303  674:ldc2            #333 <Int 0x40000000>
    //  304  677:invokestatic    #264 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  305  680:istore          9
    //  306  682:goto            572
    }

    private void removePromptView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #223 <Field View mPromptView>
    //    2    4:ifnull          33
    //    3    7:aload_0         
    //    4    8:getfield        #223 <Field View mPromptView>
    //    5   11:invokevirtual   #357 <Method android.view.ViewParent View.getParent()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:instanceof      #329 <Class ViewGroup>
    //    9   19:ifeq            33
    //   10   22:aload_1         
    //   11   23:checkcast       #329 <Class ViewGroup>
    //   12   26:aload_0         
    //   13   27:getfield        #223 <Field View mPromptView>
    //   14   30:invokevirtual   #360 <Method void ViewGroup.removeView(View)>
    //   15   33:return          
    }

    public void clearListSelection()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          19
    //    5    9:aload_1         
    //    6   10:iconst_1        
    //    7   11:invokestatic    #365 <Method boolean ListPopupWindow$DropDownListView.access$502(ListPopupWindow$DropDownListView, boolean)>
    //    8   14:pop             
    //    9   15:aload_1         
    //   10   16:invokevirtual   #368 <Method void ListPopupWindow$DropDownListView.requestLayout()>
    //   11   19:return          
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #371 <Method void PopupWindow.dismiss()>
    //    3    7:aload_0         
    //    4    8:invokespecial   #373 <Method void removePromptView()>
    //    5   11:aload_0         
    //    6   12:getfield        #135 <Field PopupWindow mPopup>
    //    7   15:aconst_null     
    //    8   16:invokevirtual   #287 <Method void PopupWindow.setContentView(View)>
    //    9   19:aload_0         
    //   10   20:aconst_null     
    //   11   21:putfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   12   24:aload_0         
    //   13   25:getfield        #123 <Field Handler mHandler>
    //   14   28:aload_0         
    //   15   29:getfield        #103 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
    //   16   32:invokevirtual   #377 <Method void Handler.removeCallbacks(Runnable)>
    //   17   35:return          
    }

    public View getAnchorView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #379 <Field View mDropDownAnchorView>
    //    2    4:areturn         
    }

    public int getAnimationStyle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #382 <Method int PopupWindow.getAnimationStyle()>
    //    3    7:ireturn         
    }

    public Drawable getBackground()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #291 <Method Drawable PopupWindow.getBackground()>
    //    3    7:areturn         
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mDropDownHeight>
    //    2    4:ireturn         
    }

    public int getHorizontalOffset()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #386 <Field int mDropDownHorizontalOffset>
    //    2    4:ireturn         
    }

    public int getInputMethodMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #310 <Method int PopupWindow.getInputMethodMode()>
    //    3    7:ireturn         
    }

    public ListView getListView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:areturn         
    }

    public int getMaxAvailableHeight(View view, int i, boolean flag)
    {
    //    0    0:new             #125 <Class Rect>
    //    1    3:dup             
    //    2    4:invokespecial   #126 <Method void Rect()>
    //    3    7:astore          4
    //    4    9:aload_1         
    //    5   10:aload           4
    //    6   12:invokevirtual   #392 <Method void View.getWindowVisibleDisplayFrame(Rect)>
    //    7   15:iconst_2        
    //    8   16:newarray        int[]
    //    9   18:astore          5
    //   10   20:aload_1         
    //   11   21:aload           5
    //   12   23:invokevirtual   #396 <Method void View.getLocationOnScreen(int[])>
    //   13   26:aload           4
    //   14   28:getfield        #303 <Field int Rect.bottom>
    //   15   31:istore          6
    //   16   33:iload_3         
    //   17   34:ifeq            52
    //   18   37:aload_1         
    //   19   38:invokevirtual   #400 <Method Context View.getContext()>
    //   20   41:invokevirtual   #145 <Method Resources Context.getResources()>
    //   21   44:invokevirtual   #341 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   22   47:getfield        #403 <Field int DisplayMetrics.heightPixels>
    //   23   50:istore          6
    //   24   52:iload           6
    //   25   54:aload           5
    //   26   56:iconst_1        
    //   27   57:iaload          
    //   28   58:aload_1         
    //   29   59:invokevirtual   #405 <Method int View.getHeight()>
    //   30   62:iadd            
    //   31   63:isub            
    //   32   64:iload_2         
    //   33   65:isub            
    //   34   66:iload_2         
    //   35   67:aload           5
    //   36   69:iconst_1        
    //   37   70:iaload          
    //   38   71:aload           4
    //   39   73:getfield        #300 <Field int Rect.top>
    //   40   76:isub            
    //   41   77:iadd            
    //   42   78:invokestatic    #410 <Method int Math.max(int, int)>
    //   43   81:istore          7
    //   44   83:aload_0         
    //   45   84:getfield        #135 <Field PopupWindow mPopup>
    //   46   87:invokevirtual   #291 <Method Drawable PopupWindow.getBackground()>
    //   47   90:ifnull          128
    //   48   93:aload_0         
    //   49   94:getfield        #135 <Field PopupWindow mPopup>
    //   50   97:invokevirtual   #291 <Method Drawable PopupWindow.getBackground()>
    //   51  100:aload_0         
    //   52  101:getfield        #128 <Field Rect mTempRect>
    //   53  104:invokevirtual   #297 <Method boolean Drawable.getPadding(Rect)>
    //   54  107:pop             
    //   55  108:iload           7
    //   56  110:aload_0         
    //   57  111:getfield        #128 <Field Rect mTempRect>
    //   58  114:getfield        #300 <Field int Rect.top>
    //   59  117:aload_0         
    //   60  118:getfield        #128 <Field Rect mTempRect>
    //   61  121:getfield        #303 <Field int Rect.bottom>
    //   62  124:iadd            
    //   63  125:isub            
    //   64  126:istore          7
    //   65  128:iload           7
    //   66  130:ireturn         
    }

    public int getPromptPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #96  <Field int mPromptPosition>
    //    2    4:ireturn         
    }

    public Object getSelectedItem()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifne            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    7   13:invokevirtual   #419 <Method Object ListPopupWindow$DropDownListView.getSelectedItem()>
    //    8   16:areturn         
    }

    public long getSelectedItemId()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifne            11
    //    3    7:ldc2w           #422 <Long 0x8000000000000000L>
    //    4   10:lreturn         
    //    5   11:aload_0         
    //    6   12:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    7   15:invokevirtual   #425 <Method long ListPopupWindow$DropDownListView.getSelectedItemId()>
    //    8   18:lreturn         
    }

    public int getSelectedItemPosition()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifne            9
    //    3    7:iconst_m1       
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    7   13:invokevirtual   #428 <Method int ListPopupWindow$DropDownListView.getSelectedItemPosition()>
    //    8   16:ireturn         
    }

    public View getSelectedView()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifne            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    7   13:invokevirtual   #431 <Method View ListPopupWindow$DropDownListView.getSelectedView()>
    //    8   16:areturn         
    }

    public int getSoftInputMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #434 <Method int PopupWindow.getSoftInputMode()>
    //    3    7:ireturn         
    }

    public int getVerticalOffset()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #305 <Field boolean mDropDownVerticalOffsetSet>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #307 <Field int mDropDownVerticalOffset>
    //    7   13:ireturn         
    }

    public int getWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field int mDropDownWidth>
    //    2    4:ireturn         
    }

    public boolean isDropDownAlwaysVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field boolean mDropDownAlwaysVisible>
    //    2    4:ireturn         
    }

    public boolean isInputMethodNotNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #310 <Method int PopupWindow.getInputMethodMode()>
    //    3    7:iconst_2        
    //    4    8:icmpne          13
    //    5   11:iconst_1        
    //    6   12:ireturn         
    //    7   13:iconst_0        
    //    8   14:ireturn         
    }

    public boolean isModal()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #178 <Field boolean mModal>
    //    2    4:ireturn         
    }

    public boolean isShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #440 <Method boolean PopupWindow.isShowing()>
    //    3    7:ireturn         
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifeq            288
    //    3    7:iload_1         
    //    4    8:bipush          62
    //    5   10:icmpeq          288
    //    6   13:aload_0         
    //    7   14:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    8   17:invokevirtual   #428 <Method int ListPopupWindow$DropDownListView.getSelectedItemPosition()>
    //    9   20:ifge            35
    //   10   23:iload_1         
    //   11   24:bipush          66
    //   12   26:icmpeq          288
    //   13   29:iload_1         
    //   14   30:bipush          23
    //   15   32:icmpeq          288
    //   16   35:aload_0         
    //   17   36:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   18   39:invokevirtual   #428 <Method int ListPopupWindow$DropDownListView.getSelectedItemPosition()>
    //   19   42:istore_3        
    //   20   43:aload_0         
    //   21   44:getfield        #135 <Field PopupWindow mPopup>
    //   22   47:invokevirtual   #445 <Method boolean PopupWindow.isAboveAnchor()>
    //   23   50:ifne            161
    //   24   53:iconst_1        
    //   25   54:istore          4
    //   26   56:aload_0         
    //   27   57:getfield        #191 <Field ListAdapter mAdapter>
    //   28   60:astore          5
    //   29   62:ldc1            #92  <Int 0x7fffffff>
    //   30   64:istore          6
    //   31   66:ldc2            #258 <Int 0x80000000>
    //   32   69:istore          7
    //   33   71:aload           5
    //   34   73:ifnull          109
    //   35   76:aload           5
    //   36   78:invokeinterface #450 <Method boolean ListAdapter.areAllItemsEnabled()>
    //   37   83:istore          10
    //   38   85:iload           10
    //   39   87:ifeq            167
    //   40   90:iconst_0        
    //   41   91:istore          6
    //   42   93:iload           10
    //   43   95:ifeq            181
    //   44   98:iconst_m1       
    //   45   99:aload           5
    //   46  101:invokeinterface #453 <Method int ListAdapter.getCount()>
    //   47  106:iadd            
    //   48  107:istore          7
    //   49  109:iload           4
    //   50  111:ifeq            126
    //   51  114:iload_1         
    //   52  115:bipush          19
    //   53  117:icmpne          126
    //   54  120:iload_3         
    //   55  121:iload           6
    //   56  123:icmple          143
    //   57  126:iload           4
    //   58  128:ifne            203
    //   59  131:iload_1         
    //   60  132:bipush          20
    //   61  134:icmpne          203
    //   62  137:iload_3         
    //   63  138:iload           7
    //   64  140:icmplt          203
    //   65  143:aload_0         
    //   66  144:invokevirtual   #455 <Method void clearListSelection()>
    //   67  147:aload_0         
    //   68  148:getfield        #135 <Field PopupWindow mPopup>
    //   69  151:iconst_1        
    //   70  152:invokevirtual   #139 <Method void PopupWindow.setInputMethodMode(int)>
    //   71  155:aload_0         
    //   72  156:invokevirtual   #458 <Method void show()>
    //   73  159:iconst_1        
    //   74  160:ireturn         
    //   75  161:iconst_0        
    //   76  162:istore          4
    //   77  164:goto            56
    //   78  167:aload_0         
    //   79  168:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   80  171:iconst_0        
    //   81  172:iconst_1        
    //   82  173:invokestatic    #462 <Method int ListPopupWindow$DropDownListView.access$600(ListPopupWindow$DropDownListView, int, boolean)>
    //   83  176:istore          6
    //   84  178:goto            93
    //   85  181:aload_0         
    //   86  182:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   87  185:iconst_m1       
    //   88  186:aload           5
    //   89  188:invokeinterface #453 <Method int ListAdapter.getCount()>
    //   90  193:iadd            
    //   91  194:iconst_0        
    //   92  195:invokestatic    #462 <Method int ListPopupWindow$DropDownListView.access$600(ListPopupWindow$DropDownListView, int, boolean)>
    //   93  198:istore          7
    //   94  200:goto            109
    //   95  203:aload_0         
    //   96  204:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   97  207:iconst_0        
    //   98  208:invokestatic    #365 <Method boolean ListPopupWindow$DropDownListView.access$502(ListPopupWindow$DropDownListView, boolean)>
    //   99  211:pop             
    //  100  212:aload_0         
    //  101  213:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //  102  216:iload_1         
    //  103  217:aload_2         
    //  104  218:invokevirtual   #464 <Method boolean ListPopupWindow$DropDownListView.onKeyDown(int, KeyEvent)>
    //  105  221:ifeq            290
    //  106  224:aload_0         
    //  107  225:getfield        #135 <Field PopupWindow mPopup>
    //  108  228:iconst_2        
    //  109  229:invokevirtual   #139 <Method void PopupWindow.setInputMethodMode(int)>
    //  110  232:aload_0         
    //  111  233:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //  112  236:invokevirtual   #467 <Method boolean ListPopupWindow$DropDownListView.requestFocusFromTouch()>
    //  113  239:pop             
    //  114  240:aload_0         
    //  115  241:invokevirtual   #458 <Method void show()>
    //  116  244:iload_1         
    //  117  245:lookupswitch    4: default 288
    //                   19: 159
    //                   20: 159
    //                   23: 159
    //                   66: 159
    //  118  288:iconst_0        
    //  119  289:ireturn         
    //  120  290:iload           4
    //  121  292:ifeq            309
    //  122  295:iload_1         
    //  123  296:bipush          20
    //  124  298:icmpne          309
    //  125  301:iload_3         
    //  126  302:iload           7
    //  127  304:icmpne          288
    //  128  307:iconst_1        
    //  129  308:ireturn         
    //  130  309:iload           4
    //  131  311:ifne            288
    //  132  314:iload_1         
    //  133  315:bipush          19
    //  134  317:icmpne          288
    //  135  320:iload_3         
    //  136  321:iload           6
    //  137  323:icmpne          288
    //  138  326:iconst_1        
    //  139  327:ireturn         
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifeq            68
    //    3    7:aload_0         
    //    4    8:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    5   11:invokevirtual   #428 <Method int ListPopupWindow$DropDownListView.getSelectedItemPosition()>
    //    6   14:iflt            68
    //    7   17:aload_0         
    //    8   18:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    9   21:iload_1         
    //   10   22:aload_2         
    //   11   23:invokevirtual   #470 <Method boolean ListPopupWindow$DropDownListView.onKeyUp(int, KeyEvent)>
    //   12   26:istore_3        
    //   13   27:iload_3         
    //   14   28:ifeq            60
    //   15   31:iload_1         
    //   16   32:lookupswitch    2: default 60
    //                   23: 62
    //                   66: 62
    //   17   60:iload_3         
    //   18   61:ireturn         
    //   19   62:aload_0         
    //   20   63:invokevirtual   #471 <Method void dismiss()>
    //   21   66:iload_3         
    //   22   67:ireturn         
    //   23   68:iconst_0        
    //   24   69:ireturn         
    }

    public boolean performItemClick(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:ifeq            58
    //    3    7:aload_0         
    //    4    8:getfield        #197 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
    //    5   11:ifnull          56
    //    6   14:aload_0         
    //    7   15:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    8   18:astore_2        
    //    9   19:aload_2         
    //   10   20:iload_1         
    //   11   21:aload_2         
    //   12   22:invokevirtual   #476 <Method int ListPopupWindow$DropDownListView.getFirstVisiblePosition()>
    //   13   25:isub            
    //   14   26:invokevirtual   #480 <Method View ListPopupWindow$DropDownListView.getChildAt(int)>
    //   15   29:astore_3        
    //   16   30:aload_2         
    //   17   31:invokevirtual   #484 <Method ListAdapter ListPopupWindow$DropDownListView.getAdapter()>
    //   18   34:astore          4
    //   19   36:aload_0         
    //   20   37:getfield        #197 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
    //   21   40:aload_2         
    //   22   41:aload_3         
    //   23   42:iload_1         
    //   24   43:aload           4
    //   25   45:iload_1         
    //   26   46:invokeinterface #488 <Method long ListAdapter.getItemId(int)>
    //   27   51:invokeinterface #494 <Method void android.widget.AdapterView$OnItemClickListener.onItemClick(AdapterView, View, int, long)>
    //   28   56:iconst_1        
    //   29   57:ireturn         
    //   30   58:iconst_0        
    //   31   59:ireturn         
    }

    public void postShow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Handler mHandler>
    //    2    4:aload_0         
    //    3    5:getfield        #176 <Field Runnable mShowDropDownRunnable>
    //    4    8:invokevirtual   #499 <Method boolean Handler.post(Runnable)>
    //    5   11:pop             
    //    6   12:return          
    }

    public void setAdapter(ListAdapter listadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #501 <Field DataSetObserver mObserver>
    //    2    4:ifnonnull       61
    //    3    7:aload_0         
    //    4    8:new             #503 <Class ListPopupWindow$PopupDataSetObserver>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:aconst_null     
    //    8   14:invokespecial   #504 <Method void ListPopupWindow$PopupDataSetObserver(ListPopupWindow, ListPopupWindow$1)>
    //    9   17:putfield        #501 <Field DataSetObserver mObserver>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:putfield        #191 <Field ListAdapter mAdapter>
    //   13   25:aload_0         
    //   14   26:getfield        #191 <Field ListAdapter mAdapter>
    //   15   29:ifnull          42
    //   16   32:aload_1         
    //   17   33:aload_0         
    //   18   34:getfield        #501 <Field DataSetObserver mObserver>
    //   19   37:invokeinterface #508 <Method void ListAdapter.registerDataSetObserver(DataSetObserver)>
    //   20   42:aload_0         
    //   21   43:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   22   46:ifnull          60
    //   23   49:aload_0         
    //   24   50:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //   25   53:aload_0         
    //   26   54:getfield        #191 <Field ListAdapter mAdapter>
    //   27   57:invokevirtual   #195 <Method void ListPopupWindow$DropDownListView.setAdapter(ListAdapter)>
    //   28   60:return          
    //   29   61:aload_0         
    //   30   62:getfield        #191 <Field ListAdapter mAdapter>
    //   31   65:ifnull          20
    //   32   68:aload_0         
    //   33   69:getfield        #191 <Field ListAdapter mAdapter>
    //   34   72:aload_0         
    //   35   73:getfield        #501 <Field DataSetObserver mObserver>
    //   36   76:invokeinterface #511 <Method void ListAdapter.unregisterDataSetObserver(DataSetObserver)>
    //   37   81:goto            20
    }

    public void setAnchorView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #379 <Field View mDropDownAnchorView>
    //    3    5:return          
    }

    public void setAnimationStyle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #515 <Method void PopupWindow.setAnimationStyle(int)>
    //    4    8:return          
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #518 <Method void PopupWindow.setBackgroundDrawable(Drawable)>
    //    4    8:return          
    }

    public void setContentWidth(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:invokevirtual   #291 <Method Drawable PopupWindow.getBackground()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ifnull          43
    //    6   12:aload_2         
    //    7   13:aload_0         
    //    8   14:getfield        #128 <Field Rect mTempRect>
    //    9   17:invokevirtual   #297 <Method boolean Drawable.getPadding(Rect)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:iload_1         
    //   13   23:aload_0         
    //   14   24:getfield        #128 <Field Rect mTempRect>
    //   15   27:getfield        #349 <Field int Rect.left>
    //   16   30:aload_0         
    //   17   31:getfield        #128 <Field Rect mTempRect>
    //   18   34:getfield        #352 <Field int Rect.right>
    //   19   37:iadd            
    //   20   38:iadd            
    //   21   39:putfield        #87  <Field int mDropDownWidth>
    //   22   42:return          
    //   23   43:aload_0         
    //   24   44:iload_1         
    //   25   45:invokevirtual   #522 <Method void setWidth(int)>
    //   26   48:return          
    }

    public void setDropDownAlwaysVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #89  <Field boolean mDropDownAlwaysVisible>
    //    3    5:return          
    }

    public void setForceIgnoreOutsideTouch(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #91  <Field boolean mForceIgnoreOutsideTouch>
    //    3    5:return          
    }

    public void setHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #85  <Field int mDropDownHeight>
    //    3    5:return          
    }

    public void setHorizontalOffset(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #386 <Field int mDropDownHorizontalOffset>
    //    3    5:return          
    }

    public void setInputMethodMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #139 <Method void PopupWindow.setInputMethodMode(int)>
    //    4    8:return          
    }

    void setListItemExpandMax(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #94  <Field int mListItemExpandMaximum>
    //    3    5:return          
    }

    public void setListSelector(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #185 <Field Drawable mDropDownListHighlight>
    //    3    5:return          
    }

    public void setModal(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #178 <Field boolean mModal>
    //    3    5:aload_0         
    //    4    6:getfield        #135 <Field PopupWindow mPopup>
    //    5    9:iload_1         
    //    6   10:invokevirtual   #530 <Method void PopupWindow.setFocusable(boolean)>
    //    7   13:return          
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #534 <Method void PopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
    //    4    8:return          
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #197 <Field android.widget.AdapterView$OnItemClickListener mItemClickListener>
    //    3    5:return          
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #221 <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
    //    3    5:return          
    }

    public void setPromptPosition(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #96  <Field int mPromptPosition>
    //    3    5:return          
    }

    public void setPromptView(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #417 <Method boolean isShowing()>
    //    2    4:istore_2        
    //    3    5:iload_2         
    //    4    6:ifeq            13
    //    5    9:aload_0         
    //    6   10:invokespecial   #373 <Method void removePromptView()>
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:putfield        #223 <Field View mPromptView>
    //   10   18:iload_2         
    //   11   19:ifeq            26
    //   12   22:aload_0         
    //   13   23:invokevirtual   #458 <Method void show()>
    //   14   26:return          
    }

    public void setSelection(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #417 <Method boolean isShowing()>
    //    5    9:ifeq            40
    //    6   12:aload_2         
    //    7   13:ifnull          40
    //    8   16:aload_2         
    //    9   17:iconst_0        
    //   10   18:invokestatic    #365 <Method boolean ListPopupWindow$DropDownListView.access$502(ListPopupWindow$DropDownListView, boolean)>
    //   11   21:pop             
    //   12   22:aload_2         
    //   13   23:iload_1         
    //   14   24:invokevirtual   #539 <Method void ListPopupWindow$DropDownListView.setSelection(int)>
    //   15   27:aload_2         
    //   16   28:invokevirtual   #542 <Method int ListPopupWindow$DropDownListView.getChoiceMode()>
    //   17   31:ifeq            40
    //   18   34:aload_2         
    //   19   35:iload_1         
    //   20   36:iconst_1        
    //   21   37:invokevirtual   #546 <Method void ListPopupWindow$DropDownListView.setItemChecked(int, boolean)>
    //   22   40:return          
    }

    public void setSoftInputMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #549 <Method void PopupWindow.setSoftInputMode(int)>
    //    4    8:return          
    }

    public void setVerticalOffset(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #307 <Field int mDropDownVerticalOffset>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #305 <Field boolean mDropDownVerticalOffsetSet>
    //    6   10:return          
    }

    public void setWidth(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #87  <Field int mDropDownWidth>
    //    3    5:return          
    }

    public void show()
    {
    //    0    0:iconst_1        
    //    1    1:istore_1        
    //    2    2:iconst_m1       
    //    3    3:istore_2        
    //    4    4:aload_0         
    //    5    5:invokespecial   #552 <Method int buildDropDown()>
    //    6    8:istore_3        
    //    7    9:aload_0         
    //    8   10:invokevirtual   #554 <Method boolean isInputMethodNotNeeded()>
    //    9   13:istore          4
    //   10   15:aload_0         
    //   11   16:getfield        #135 <Field PopupWindow mPopup>
    //   12   19:invokevirtual   #440 <Method boolean PopupWindow.isShowing()>
    //   13   22:ifeq            245
    //   14   25:aload_0         
    //   15   26:getfield        #87  <Field int mDropDownWidth>
    //   16   29:iload_2         
    //   17   30:icmpne          146
    //   18   33:iconst_m1       
    //   19   34:istore          9
    //   20   36:aload_0         
    //   21   37:getfield        #85  <Field int mDropDownHeight>
    //   22   40:iload_2         
    //   23   41:icmpne          221
    //   24   44:iload           4
    //   25   46:ifeq            176
    //   26   49:iload_3         
    //   27   50:istore          10
    //   28   52:iload           4
    //   29   54:ifeq            187
    //   30   57:aload_0         
    //   31   58:getfield        #135 <Field PopupWindow mPopup>
    //   32   61:astore          17
    //   33   63:aload_0         
    //   34   64:getfield        #87  <Field int mDropDownWidth>
    //   35   67:iload_2         
    //   36   68:icmpne          182
    //   37   71:aload           17
    //   38   73:iload_2         
    //   39   74:iconst_0        
    //   40   75:invokevirtual   #557 <Method void PopupWindow.setWindowLayoutMode(int, int)>
    //   41   78:aload_0         
    //   42   79:getfield        #135 <Field PopupWindow mPopup>
    //   43   82:astore          11
    //   44   84:aload_0         
    //   45   85:getfield        #91  <Field boolean mForceIgnoreOutsideTouch>
    //   46   88:istore          12
    //   47   90:iconst_0        
    //   48   91:istore          13
    //   49   93:iload           12
    //   50   95:ifne            115
    //   51   98:aload_0         
    //   52   99:getfield        #89  <Field boolean mDropDownAlwaysVisible>
    //   53  102:istore          14
    //   54  104:iconst_0        
    //   55  105:istore          13
    //   56  107:iload           14
    //   57  109:ifne            115
    //   58  112:iload_1         
    //   59  113:istore          13
    //   60  115:aload           11
    //   61  117:iload           13
    //   62  119:invokevirtual   #560 <Method void PopupWindow.setOutsideTouchable(boolean)>
    //   63  122:aload_0         
    //   64  123:getfield        #135 <Field PopupWindow mPopup>
    //   65  126:aload_0         
    //   66  127:invokevirtual   #314 <Method View getAnchorView()>
    //   67  130:aload_0         
    //   68  131:getfield        #386 <Field int mDropDownHorizontalOffset>
    //   69  134:aload_0         
    //   70  135:getfield        #307 <Field int mDropDownVerticalOffset>
    //   71  138:iload           9
    //   72  140:iload           10
    //   73  142:invokevirtual   #564 <Method void PopupWindow.update(View, int, int, int, int)>
    //   74  145:return          
    //   75  146:aload_0         
    //   76  147:getfield        #87  <Field int mDropDownWidth>
    //   77  150:bipush          -2
    //   78  152:icmpne          167
    //   79  155:aload_0         
    //   80  156:invokevirtual   #314 <Method View getAnchorView()>
    //   81  159:invokevirtual   #566 <Method int View.getWidth()>
    //   82  162:istore          9
    //   83  164:goto            36
    //   84  167:aload_0         
    //   85  168:getfield        #87  <Field int mDropDownWidth>
    //   86  171:istore          9
    //   87  173:goto            36
    //   88  176:iload_2         
    //   89  177:istore          10
    //   90  179:goto            52
    //   91  182:iconst_0        
    //   92  183:istore_2        
    //   93  184:goto            71
    //   94  187:aload_0         
    //   95  188:getfield        #135 <Field PopupWindow mPopup>
    //   96  191:astore          15
    //   97  193:aload_0         
    //   98  194:getfield        #87  <Field int mDropDownWidth>
    //   99  197:iload_2         
    //  100  198:icmpne          215
    //  101  201:iload_2         
    //  102  202:istore          16
    //  103  204:aload           15
    //  104  206:iload           16
    //  105  208:iload_2         
    //  106  209:invokevirtual   #557 <Method void PopupWindow.setWindowLayoutMode(int, int)>
    //  107  212:goto            78
    //  108  215:iconst_0        
    //  109  216:istore          16
    //  110  218:goto            204
    //  111  221:aload_0         
    //  112  222:getfield        #85  <Field int mDropDownHeight>
    //  113  225:bipush          -2
    //  114  227:icmpne          236
    //  115  230:iload_3         
    //  116  231:istore          10
    //  117  233:goto            78
    //  118  236:aload_0         
    //  119  237:getfield        #85  <Field int mDropDownHeight>
    //  120  240:istore          10
    //  121  242:goto            78
    //  122  245:aload_0         
    //  123  246:getfield        #87  <Field int mDropDownWidth>
    //  124  249:iload_2         
    //  125  250:icmpne          383
    //  126  253:iconst_m1       
    //  127  254:istore          5
    //  128  256:aload_0         
    //  129  257:getfield        #85  <Field int mDropDownHeight>
    //  130  260:iload_2         
    //  131  261:icmpne          429
    //  132  264:iconst_m1       
    //  133  265:istore          6
    //  134  267:aload_0         
    //  135  268:getfield        #135 <Field PopupWindow mPopup>
    //  136  271:iload           5
    //  137  273:iload           6
    //  138  275:invokevirtual   #557 <Method void PopupWindow.setWindowLayoutMode(int, int)>
    //  139  278:aload_0         
    //  140  279:getfield        #135 <Field PopupWindow mPopup>
    //  141  282:astore          7
    //  142  284:aload_0         
    //  143  285:getfield        #91  <Field boolean mForceIgnoreOutsideTouch>
    //  144  288:ifne            469
    //  145  291:aload_0         
    //  146  292:getfield        #89  <Field boolean mDropDownAlwaysVisible>
    //  147  295:ifne            469
    //  148  298:aload           7
    //  149  300:iload_1         
    //  150  301:invokevirtual   #560 <Method void PopupWindow.setOutsideTouchable(boolean)>
    //  151  304:aload_0         
    //  152  305:getfield        #135 <Field PopupWindow mPopup>
    //  153  308:aload_0         
    //  154  309:getfield        #108 <Field ListPopupWindow$PopupTouchInterceptor mTouchInterceptor>
    //  155  312:invokevirtual   #570 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
    //  156  315:aload_0         
    //  157  316:getfield        #135 <Field PopupWindow mPopup>
    //  158  319:aload_0         
    //  159  320:invokevirtual   #314 <Method View getAnchorView()>
    //  160  323:aload_0         
    //  161  324:getfield        #386 <Field int mDropDownHorizontalOffset>
    //  162  327:aload_0         
    //  163  328:getfield        #307 <Field int mDropDownVerticalOffset>
    //  164  331:invokevirtual   #574 <Method void PopupWindow.showAsDropDown(View, int, int)>
    //  165  334:aload_0         
    //  166  335:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //  167  338:iload_2         
    //  168  339:invokevirtual   #539 <Method void ListPopupWindow$DropDownListView.setSelection(int)>
    //  169  342:aload_0         
    //  170  343:getfield        #178 <Field boolean mModal>
    //  171  346:ifeq            359
    //  172  349:aload_0         
    //  173  350:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //  174  353:invokevirtual   #577 <Method boolean ListPopupWindow$DropDownListView.isInTouchMode()>
    //  175  356:ifeq            363
    //  176  359:aload_0         
    //  177  360:invokevirtual   #455 <Method void clearListSelection()>
    //  178  363:aload_0         
    //  179  364:getfield        #178 <Field boolean mModal>
    //  180  367:ifne            145
    //  181  370:aload_0         
    //  182  371:getfield        #123 <Field Handler mHandler>
    //  183  374:aload_0         
    //  184  375:getfield        #118 <Field ListPopupWindow$ListSelectorHider mHideSelector>
    //  185  378:invokevirtual   #499 <Method boolean Handler.post(Runnable)>
    //  186  381:pop             
    //  187  382:return          
    //  188  383:aload_0         
    //  189  384:getfield        #87  <Field int mDropDownWidth>
    //  190  387:bipush          -2
    //  191  389:icmpne          412
    //  192  392:aload_0         
    //  193  393:getfield        #135 <Field PopupWindow mPopup>
    //  194  396:aload_0         
    //  195  397:invokevirtual   #314 <Method View getAnchorView()>
    //  196  400:invokevirtual   #566 <Method int View.getWidth()>
    //  197  403:invokevirtual   #578 <Method void PopupWindow.setWidth(int)>
    //  198  406:iconst_0        
    //  199  407:istore          5
    //  200  409:goto            256
    //  201  412:aload_0         
    //  202  413:getfield        #135 <Field PopupWindow mPopup>
    //  203  416:aload_0         
    //  204  417:getfield        #87  <Field int mDropDownWidth>
    //  205  420:invokevirtual   #578 <Method void PopupWindow.setWidth(int)>
    //  206  423:iconst_0        
    //  207  424:istore          5
    //  208  426:goto            256
    //  209  429:aload_0         
    //  210  430:getfield        #85  <Field int mDropDownHeight>
    //  211  433:bipush          -2
    //  212  435:icmpne          452
    //  213  438:aload_0         
    //  214  439:getfield        #135 <Field PopupWindow mPopup>
    //  215  442:iload_3         
    //  216  443:invokevirtual   #580 <Method void PopupWindow.setHeight(int)>
    //  217  446:iconst_0        
    //  218  447:istore          6
    //  219  449:goto            267
    //  220  452:aload_0         
    //  221  453:getfield        #135 <Field PopupWindow mPopup>
    //  222  456:aload_0         
    //  223  457:getfield        #85  <Field int mDropDownHeight>
    //  224  460:invokevirtual   #580 <Method void PopupWindow.setHeight(int)>
    //  225  463:iconst_0        
    //  226  464:istore          6
    //  227  466:goto            267
    //  228  469:iconst_0        
    //  229  470:istore_1        
    //  230  471:goto            298
    }

    private static final boolean DEBUG = false;
    private static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int FILL_PARENT = -1;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private boolean mForceIgnoreOutsideTouch;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private int mLayoutDirection;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    static Handler access$1000(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Handler mHandler>
    //    2    4:areturn         
    }

    static DropDownListView access$700(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field ListPopupWindow$DropDownListView mDropDownList>
    //    2    4:areturn         
    }

    static PopupWindow access$800(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field PopupWindow mPopup>
    //    2    4:areturn         
    }

    static ResizePopupRunnable access$900(ListPopupWindow listpopupwindow)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field ListPopupWindow$ResizePopupRunnable mResizePopupRunnable>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ListPopupWindow$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ListPopupWindow this$0>
        //    2    4:invokevirtual   #25  <Method View ListPopupWindow.getAnchorView()>
        //    3    7:astore_1        
        //    4    8:aload_1         
        //    5    9:ifnull          26
        //    6   12:aload_1         
        //    7   13:invokevirtual   #31  <Method android.os.IBinder View.getWindowToken()>
        //    8   16:ifnull          26
        //    9   19:aload_0         
        //   10   20:getfield        #17  <Field ListPopupWindow this$0>
        //   11   23:invokevirtual   #34  <Method void ListPopupWindow.show()>
        //   12   26:return          
        }

        final ListPopupWindow this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ListPopupWindow$2

/* anonymous class */
    class _cls2
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ListPopupWindow this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:iload_3         
        //    1    1:iconst_m1       
        //    2    2:icmpeq          26
        //    3    5:aload_0         
        //    4    6:getfield        #17  <Field ListPopupWindow this$0>
        //    5    9:invokestatic    #26  <Method ListPopupWindow$DropDownListView ListPopupWindow.access$700(ListPopupWindow)>
        //    6   12:astore          6
        //    7   14:aload           6
        //    8   16:ifnull          26
        //    9   19:aload           6
        //   10   21:iconst_0        
        //   11   22:invokestatic    #32  <Method boolean ListPopupWindow$DropDownListView.access$502(ListPopupWindow$DropDownListView, boolean)>
        //   12   25:pop             
        //   13   26:return          
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        //    0    0:return          
        }

        final ListPopupWindow this$0;
    }

}
