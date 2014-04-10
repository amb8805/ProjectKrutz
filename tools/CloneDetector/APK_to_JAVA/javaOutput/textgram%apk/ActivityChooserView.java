// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, ActivityChooserModel

public class ActivityChooserView extends ViewGroup
    implements ActivityChooserModel.ActivityChooserModelClient
{
    private class ActivityChooserViewAdapter extends BaseAdapter
    {

        private ActivityChooserViewAdapter()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #28  <Field ActivityChooserView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #31  <Method void BaseAdapter()>
        //    5    9:aload_0         
        //    6   10:iconst_4        
        //    7   11:putfield        #33  <Field int mMaxActivityCount>
        //    8   14:return          
        }

        ActivityChooserViewAdapter(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #36  <Method void ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView)>
        //    3    5:return          
        }

        public int getActivityCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    2    4:invokevirtual   #44  <Method int ActivityChooserModel.getActivityCount()>
        //    3    7:ireturn         
        }

        public int getCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    2    4:invokevirtual   #44  <Method int ActivityChooserModel.getActivityCount()>
        //    3    7:istore_1        
        //    4    8:aload_0         
        //    5    9:getfield        #47  <Field boolean mShowDefaultActivity>
        //    6   12:ifne            28
        //    7   15:aload_0         
        //    8   16:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    9   19:invokevirtual   #51  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
        //   10   22:ifnull          28
        //   11   25:iinc            1  -1
        //   12   28:iload_1         
        //   13   29:aload_0         
        //   14   30:getfield        #33  <Field int mMaxActivityCount>
        //   15   33:invokestatic    #57  <Method int Math.min(int, int)>
        //   16   36:istore_2        
        //   17   37:aload_0         
        //   18   38:getfield        #59  <Field boolean mShowFooterView>
        //   19   41:ifeq            47
        //   20   44:iinc            2  1
        //   21   47:iload_2         
        //   22   48:ireturn         
        }

        public ActivityChooserModel getDataModel()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    2    4:areturn         
        }

        public ResolveInfo getDefaultActivity()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    2    4:invokevirtual   #51  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
        //    3    7:areturn         
        }

        public int getHistorySize()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field ActivityChooserModel mDataModel>
        //    2    4:invokevirtual   #64  <Method int ActivityChooserModel.getHistorySize()>
        //    3    7:ireturn         
        }

        public Object getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #70  <Method int getItemViewType(int)>
        //    3    5:tableswitch     0 1: default 28
        //                       0 38
        //                       1 36
        //    4   28:new             #72  <Class IllegalArgumentException>
        //    5   31:dup             
        //    6   32:invokespecial   #73  <Method void IllegalArgumentException()>
        //    7   35:athrow          
        //    8   36:aconst_null     
        //    9   37:areturn         
        //   10   38:aload_0         
        //   11   39:getfield        #47  <Field boolean mShowDefaultActivity>
        //   12   42:ifne            58
        //   13   45:aload_0         
        //   14   46:getfield        #40  <Field ActivityChooserModel mDataModel>
        //   15   49:invokevirtual   #51  <Method ResolveInfo ActivityChooserModel.getDefaultActivity()>
        //   16   52:ifnull          58
        //   17   55:iinc            1  1
        //   18   58:aload_0         
        //   19   59:getfield        #40  <Field ActivityChooserModel mDataModel>
        //   20   62:iload_1         
        //   21   63:invokevirtual   #77  <Method ResolveInfo ActivityChooserModel.getActivity(int)>
        //   22   66:areturn         
        }

        public long getItemId(int i)
        {
        //    0    0:iload_1         
        //    1    1:i2l             
        //    2    2:lreturn         
        }

        public int getItemViewType(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #59  <Field boolean mShowFooterView>
        //    2    4:ifeq            19
        //    3    7:iload_1         
        //    4    8:iconst_m1       
        //    5    9:aload_0         
        //    6   10:invokevirtual   #81  <Method int getCount()>
        //    7   13:iadd            
        //    8   14:icmpne          19
        //    9   17:iconst_1        
        //   10   18:ireturn         
        //   11   19:iconst_0        
        //   12   20:ireturn         
        }

        public int getMaxActivityCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field int mMaxActivityCount>
        //    2    4:ireturn         
        }

        public boolean getShowDefaultActivity()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field boolean mShowDefaultActivity>
        //    2    4:ireturn         
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #70  <Method int getItemViewType(int)>
        //    3    5:tableswitch     0 1: default 28
        //                       0 100
        //                       1 36
        //    4   28:new             #72  <Class IllegalArgumentException>
        //    5   31:dup             
        //    6   32:invokespecial   #73  <Method void IllegalArgumentException()>
        //    7   35:athrow          
        //    8   36:aload_2         
        //    9   37:ifnull          48
        //   10   40:aload_2         
        //   11   41:invokevirtual   #91  <Method int View.getId()>
        //   12   44:iconst_1        
        //   13   45:icmpeq          98
        //   14   48:aload_0         
        //   15   49:getfield        #28  <Field ActivityChooserView this$0>
        //   16   52:invokevirtual   #97  <Method Context ActivityChooserView.getContext()>
        //   17   55:invokestatic    #103 <Method LayoutInflater LayoutInflater.from(Context)>
        //   18   58:getstatic       #108 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
        //   19   61:aload_3         
        //   20   62:iconst_0        
        //   21   63:invokevirtual   #112 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
        //   22   66:astore_2        
        //   23   67:aload_2         
        //   24   68:iconst_1        
        //   25   69:invokevirtual   #116 <Method void View.setId(int)>
        //   26   72:aload_2         
        //   27   73:getstatic       #121 <Field int android.support.v7.appcompat.R$id.title>
        //   28   76:invokevirtual   #125 <Method View View.findViewById(int)>
        //   29   79:checkcast       #127 <Class TextView>
        //   30   82:aload_0         
        //   31   83:getfield        #28  <Field ActivityChooserView this$0>
        //   32   86:invokevirtual   #97  <Method Context ActivityChooserView.getContext()>
        //   33   89:getstatic       #132 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
        //   34   92:invokevirtual   #138 <Method String Context.getString(int)>
        //   35   95:invokevirtual   #142 <Method void TextView.setText(CharSequence)>
        //   36   98:aload_2         
        //   37   99:areturn         
        //   38  100:aload_2         
        //   39  101:ifnull          114
        //   40  104:aload_2         
        //   41  105:invokevirtual   #91  <Method int View.getId()>
        //   42  108:getstatic       #145 <Field int android.support.v7.appcompat.R$id.list_item>
        //   43  111:icmpeq          133
        //   44  114:aload_0         
        //   45  115:getfield        #28  <Field ActivityChooserView this$0>
        //   46  118:invokevirtual   #97  <Method Context ActivityChooserView.getContext()>
        //   47  121:invokestatic    #103 <Method LayoutInflater LayoutInflater.from(Context)>
        //   48  124:getstatic       #108 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view_list_item>
        //   49  127:aload_3         
        //   50  128:iconst_0        
        //   51  129:invokevirtual   #112 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
        //   52  132:astore_2        
        //   53  133:aload_0         
        //   54  134:getfield        #28  <Field ActivityChooserView this$0>
        //   55  137:invokevirtual   #97  <Method Context ActivityChooserView.getContext()>
        //   56  140:invokevirtual   #149 <Method android.content.pm.PackageManager Context.getPackageManager()>
        //   57  143:astore          4
        //   58  145:aload_2         
        //   59  146:getstatic       #152 <Field int android.support.v7.appcompat.R$id.icon>
        //   60  149:invokevirtual   #125 <Method View View.findViewById(int)>
        //   61  152:checkcast       #154 <Class ImageView>
        //   62  155:astore          5
        //   63  157:aload_0         
        //   64  158:iload_1         
        //   65  159:invokevirtual   #156 <Method Object getItem(int)>
        //   66  162:checkcast       #158 <Class ResolveInfo>
        //   67  165:astore          6
        //   68  167:aload           5
        //   69  169:aload           6
        //   70  171:aload           4
        //   71  173:invokevirtual   #162 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
        //   72  176:invokevirtual   #166 <Method void ImageView.setImageDrawable(Drawable)>
        //   73  179:aload_2         
        //   74  180:getstatic       #121 <Field int android.support.v7.appcompat.R$id.title>
        //   75  183:invokevirtual   #125 <Method View View.findViewById(int)>
        //   76  186:checkcast       #127 <Class TextView>
        //   77  189:aload           6
        //   78  191:aload           4
        //   79  193:invokevirtual   #170 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
        //   80  196:invokevirtual   #142 <Method void TextView.setText(CharSequence)>
        //   81  199:aload_0         
        //   82  200:getfield        #47  <Field boolean mShowDefaultActivity>
        //   83  203:ifeq            217
        //   84  206:iload_1         
        //   85  207:ifne            217
        //   86  210:aload_0         
        //   87  211:getfield        #172 <Field boolean mHighlightDefaultActivity>
        //   88  214:ifeq            217
        //   89  217:aload_2         
        //   90  218:areturn         
        }

        public int getViewTypeCount()
        {
        //    0    0:iconst_3        
        //    1    1:ireturn         
        }

        public int measureContentWidth()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field int mMaxActivityCount>
        //    2    4:istore_1        
        //    3    5:aload_0         
        //    4    6:ldc1            #15  <Int 0x7fffffff>
        //    5    8:putfield        #33  <Field int mMaxActivityCount>
        //    6   11:iconst_0        
        //    7   12:istore_2        
        //    8   13:aconst_null     
        //    9   14:astore_3        
        //   10   15:iconst_0        
        //   11   16:iconst_0        
        //   12   17:invokestatic    #179 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   13   20:istore          4
        //   14   22:iconst_0        
        //   15   23:iconst_0        
        //   16   24:invokestatic    #179 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   17   27:istore          5
        //   18   29:aload_0         
        //   19   30:invokevirtual   #81  <Method int getCount()>
        //   20   33:istore          6
        //   21   35:iconst_0        
        //   22   36:istore          7
        //   23   38:iload           7
        //   24   40:iload           6
        //   25   42:icmpge          77
        //   26   45:aload_0         
        //   27   46:iload           7
        //   28   48:aload_3         
        //   29   49:aconst_null     
        //   30   50:invokevirtual   #181 <Method View getView(int, View, ViewGroup)>
        //   31   53:astore_3        
        //   32   54:aload_3         
        //   33   55:iload           4
        //   34   57:iload           5
        //   35   59:invokevirtual   #185 <Method void View.measure(int, int)>
        //   36   62:iload_2         
        //   37   63:aload_3         
        //   38   64:invokevirtual   #188 <Method int View.getMeasuredWidth()>
        //   39   67:invokestatic    #191 <Method int Math.max(int, int)>
        //   40   70:istore_2        
        //   41   71:iinc            7  1
        //   42   74:goto            38
        //   43   77:aload_0         
        //   44   78:iload_1         
        //   45   79:putfield        #33  <Field int mMaxActivityCount>
        //   46   82:iload_2         
        //   47   83:ireturn         
        }

        public void setDataModel(ActivityChooserModel activitychoosermodel)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field ActivityChooserView this$0>
        //    2    4:invokestatic    #197 <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //    3    7:invokevirtual   #199 <Method ActivityChooserModel getDataModel()>
        //    4   10:astore_2        
        //    5   11:aload_2         
        //    6   12:ifnull          36
        //    7   15:aload_0         
        //    8   16:getfield        #28  <Field ActivityChooserView this$0>
        //    9   19:invokevirtual   #202 <Method boolean ActivityChooserView.isShown()>
        //   10   22:ifeq            36
        //   11   25:aload_2         
        //   12   26:aload_0         
        //   13   27:getfield        #28  <Field ActivityChooserView this$0>
        //   14   30:invokestatic    #206 <Method DataSetObserver ActivityChooserView.access$1100(ActivityChooserView)>
        //   15   33:invokevirtual   #210 <Method void ActivityChooserModel.unregisterObserver(Object)>
        //   16   36:aload_0         
        //   17   37:aload_1         
        //   18   38:putfield        #40  <Field ActivityChooserModel mDataModel>
        //   19   41:aload_1         
        //   20   42:ifnull          66
        //   21   45:aload_0         
        //   22   46:getfield        #28  <Field ActivityChooserView this$0>
        //   23   49:invokevirtual   #202 <Method boolean ActivityChooserView.isShown()>
        //   24   52:ifeq            66
        //   25   55:aload_1         
        //   26   56:aload_0         
        //   27   57:getfield        #28  <Field ActivityChooserView this$0>
        //   28   60:invokestatic    #206 <Method DataSetObserver ActivityChooserView.access$1100(ActivityChooserView)>
        //   29   63:invokevirtual   #213 <Method void ActivityChooserModel.registerObserver(Object)>
        //   30   66:aload_0         
        //   31   67:invokevirtual   #216 <Method void notifyDataSetChanged()>
        //   32   70:return          
        }

        public void setMaxActivityCount(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field int mMaxActivityCount>
        //    2    4:iload_1         
        //    3    5:icmpeq          17
        //    4    8:aload_0         
        //    5    9:iload_1         
        //    6   10:putfield        #33  <Field int mMaxActivityCount>
        //    7   13:aload_0         
        //    8   14:invokevirtual   #216 <Method void notifyDataSetChanged()>
        //    9   17:return          
        }

        public void setShowDefaultActivity(boolean flag, boolean flag1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field boolean mShowDefaultActivity>
        //    2    4:iload_1         
        //    3    5:icmpne          16
        //    4    8:aload_0         
        //    5    9:getfield        #172 <Field boolean mHighlightDefaultActivity>
        //    6   12:iload_2         
        //    7   13:icmpeq          30
        //    8   16:aload_0         
        //    9   17:iload_1         
        //   10   18:putfield        #47  <Field boolean mShowDefaultActivity>
        //   11   21:aload_0         
        //   12   22:iload_2         
        //   13   23:putfield        #172 <Field boolean mHighlightDefaultActivity>
        //   14   26:aload_0         
        //   15   27:invokevirtual   #216 <Method void notifyDataSetChanged()>
        //   16   30:return          
        }

        public void setShowFooterView(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #59  <Field boolean mShowFooterView>
        //    2    4:iload_1         
        //    3    5:icmpeq          17
        //    4    8:aload_0         
        //    5    9:iload_1         
        //    6   10:putfield        #59  <Field boolean mShowFooterView>
        //    7   13:aload_0         
        //    8   14:invokevirtual   #216 <Method void notifyDataSetChanged()>
        //    9   17:return          
        }

        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final ActivityChooserView this$0;
    }

    private class Callbacks
        implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener
    {

        private Callbacks()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field ActivityChooserView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #21  <Method void Object()>
        //    5    9:return          
        }

        Callbacks(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #24  <Method void ActivityChooserView$Callbacks(ActivityChooserView)>
        //    3    5:return          
        }

        private void notifyOnDismissListener()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field ActivityChooserView this$0>
        //    2    4:invokestatic    #31  <Method android.widget.PopupWindow$OnDismissListener ActivityChooserView.access$1000(ActivityChooserView)>
        //    3    7:ifnull          22
        //    4   10:aload_0         
        //    5   11:getfield        #18  <Field ActivityChooserView this$0>
        //    6   14:invokestatic    #31  <Method android.widget.PopupWindow$OnDismissListener ActivityChooserView.access$1000(ActivityChooserView)>
        //    7   17:invokeinterface #34  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
        //    8   22:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #18  <Field ActivityChooserView this$0>
        //    3    5:invokestatic    #40  <Method FrameLayout ActivityChooserView.access$700(ActivityChooserView)>
        //    4    8:if_acmpne       91
        //    5   11:aload_0         
        //    6   12:getfield        #18  <Field ActivityChooserView this$0>
        //    7   15:invokevirtual   #44  <Method boolean ActivityChooserView.dismissPopup()>
        //    8   18:pop             
        //    9   19:aload_0         
        //   10   20:getfield        #18  <Field ActivityChooserView this$0>
        //   11   23:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   12   26:invokevirtual   #54  <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
        //   13   29:astore          4
        //   14   31:aload_0         
        //   15   32:getfield        #18  <Field ActivityChooserView this$0>
        //   16   35:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   17   38:invokevirtual   #58  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
        //   18   41:aload           4
        //   19   43:invokevirtual   #64  <Method int ActivityChooserModel.getActivityIndex(ResolveInfo)>
        //   20   46:istore          5
        //   21   48:aload_0         
        //   22   49:getfield        #18  <Field ActivityChooserView this$0>
        //   23   52:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   24   55:invokevirtual   #58  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
        //   25   58:iload           5
        //   26   60:invokevirtual   #68  <Method Intent ActivityChooserModel.chooseActivity(int)>
        //   27   63:astore          6
        //   28   65:aload           6
        //   29   67:ifnull          90
        //   30   70:aload           6
        //   31   72:ldc1            #69  <Int 0x80000>
        //   32   74:invokevirtual   #74  <Method Intent Intent.addFlags(int)>
        //   33   77:pop             
        //   34   78:aload_0         
        //   35   79:getfield        #18  <Field ActivityChooserView this$0>
        //   36   82:invokevirtual   #78  <Method Context ActivityChooserView.getContext()>
        //   37   85:aload           6
        //   38   87:invokevirtual   #84  <Method void Context.startActivity(Intent)>
        //   39   90:return          
        //   40   91:aload_1         
        //   41   92:aload_0         
        //   42   93:getfield        #18  <Field ActivityChooserView this$0>
        //   43   96:invokestatic    #87  <Method FrameLayout ActivityChooserView.access$800(ActivityChooserView)>
        //   44   99:if_acmpne       126
        //   45  102:aload_0         
        //   46  103:getfield        #18  <Field ActivityChooserView this$0>
        //   47  106:iconst_0        
        //   48  107:invokestatic    #91  <Method boolean ActivityChooserView.access$602(ActivityChooserView, boolean)>
        //   49  110:pop             
        //   50  111:aload_0         
        //   51  112:getfield        #18  <Field ActivityChooserView this$0>
        //   52  115:aload_0         
        //   53  116:getfield        #18  <Field ActivityChooserView this$0>
        //   54  119:invokestatic    #95  <Method int ActivityChooserView.access$900(ActivityChooserView)>
        //   55  122:invokestatic    #99  <Method void ActivityChooserView.access$500(ActivityChooserView, int)>
        //   56  125:return          
        //   57  126:new             #101 <Class IllegalArgumentException>
        //   58  129:dup             
        //   59  130:invokespecial   #102 <Method void IllegalArgumentException()>
        //   60  133:athrow          
        }

        public void onDismiss()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #104 <Method void notifyOnDismissListener()>
        //    2    4:aload_0         
        //    3    5:getfield        #18  <Field ActivityChooserView this$0>
        //    4    8:getfield        #108 <Field ActionProvider ActivityChooserView.mProvider>
        //    5   11:ifnull          25
        //    6   14:aload_0         
        //    7   15:getfield        #18  <Field ActivityChooserView this$0>
        //    8   18:getfield        #108 <Field ActionProvider ActivityChooserView.mProvider>
        //    9   21:iconst_0        
        //   10   22:invokevirtual   #114 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
        //   11   25:return          
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #122 <Method android.widget.Adapter AdapterView.getAdapter()>
        //    2    4:checkcast       #50  <Class ActivityChooserView$ActivityChooserViewAdapter>
        //    3    7:iload_3         
        //    4    8:invokevirtual   #126 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
        //    5   11:tableswitch     0 1: default 32
        //                       0 50
        //                       1 40
        //    6   32:new             #101 <Class IllegalArgumentException>
        //    7   35:dup             
        //    8   36:invokespecial   #102 <Method void IllegalArgumentException()>
        //    9   39:athrow          
        //   10   40:aload_0         
        //   11   41:getfield        #18  <Field ActivityChooserView this$0>
        //   12   44:ldc1            #127 <Int 0x7fffffff>
        //   13   46:invokestatic    #99  <Method void ActivityChooserView.access$500(ActivityChooserView, int)>
        //   14   49:return          
        //   15   50:aload_0         
        //   16   51:getfield        #18  <Field ActivityChooserView this$0>
        //   17   54:invokevirtual   #44  <Method boolean ActivityChooserView.dismissPopup()>
        //   18   57:pop             
        //   19   58:aload_0         
        //   20   59:getfield        #18  <Field ActivityChooserView this$0>
        //   21   62:invokestatic    #131 <Method boolean ActivityChooserView.access$600(ActivityChooserView)>
        //   22   65:ifeq            87
        //   23   68:iload_3         
        //   24   69:ifle            49
        //   25   72:aload_0         
        //   26   73:getfield        #18  <Field ActivityChooserView this$0>
        //   27   76:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   28   79:invokevirtual   #58  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
        //   29   82:iload_3         
        //   30   83:invokevirtual   #135 <Method void ActivityChooserModel.setDefaultActivity(int)>
        //   31   86:return          
        //   32   87:aload_0         
        //   33   88:getfield        #18  <Field ActivityChooserView this$0>
        //   34   91:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   35   94:invokevirtual   #138 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
        //   36   97:ifeq            142
        //   37  100:aload_0         
        //   38  101:getfield        #18  <Field ActivityChooserView this$0>
        //   39  104:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //   40  107:invokevirtual   #58  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
        //   41  110:iload_3         
        //   42  111:invokevirtual   #68  <Method Intent ActivityChooserModel.chooseActivity(int)>
        //   43  114:astore          7
        //   44  116:aload           7
        //   45  118:ifnull          49
        //   46  121:aload           7
        //   47  123:ldc1            #69  <Int 0x80000>
        //   48  125:invokevirtual   #74  <Method Intent Intent.addFlags(int)>
        //   49  128:pop             
        //   50  129:aload_0         
        //   51  130:getfield        #18  <Field ActivityChooserView this$0>
        //   52  133:invokevirtual   #78  <Method Context ActivityChooserView.getContext()>
        //   53  136:aload           7
        //   54  138:invokevirtual   #84  <Method void Context.startActivity(Intent)>
        //   55  141:return          
        //   56  142:iinc            3  1
        //   57  145:goto            100
        }

        public boolean onLongClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #18  <Field ActivityChooserView this$0>
        //    3    5:invokestatic    #40  <Method FrameLayout ActivityChooserView.access$700(ActivityChooserView)>
        //    4    8:if_acmpne       49
        //    5   11:aload_0         
        //    6   12:getfield        #18  <Field ActivityChooserView this$0>
        //    7   15:invokestatic    #48  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //    8   18:invokevirtual   #144 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
        //    9   21:ifle            47
        //   10   24:aload_0         
        //   11   25:getfield        #18  <Field ActivityChooserView this$0>
        //   12   28:iconst_1        
        //   13   29:invokestatic    #91  <Method boolean ActivityChooserView.access$602(ActivityChooserView, boolean)>
        //   14   32:pop             
        //   15   33:aload_0         
        //   16   34:getfield        #18  <Field ActivityChooserView this$0>
        //   17   37:aload_0         
        //   18   38:getfield        #18  <Field ActivityChooserView this$0>
        //   19   41:invokestatic    #95  <Method int ActivityChooserView.access$900(ActivityChooserView)>
        //   20   44:invokestatic    #99  <Method void ActivityChooserView.access$500(ActivityChooserView, int)>
        //   21   47:iconst_1        
        //   22   48:ireturn         
        //   23   49:new             #101 <Class IllegalArgumentException>
        //   24   52:dup             
        //   25   53:invokespecial   #102 <Method void IllegalArgumentException()>
        //   26   56:athrow          
        }

        final ActivityChooserView this$0;
    }


    public ActivityChooserView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #42  <Method void ActivityChooserView(Context, AttributeSet)>
    //    4    6:return          
    }

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #45  <Method void ActivityChooserView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #46  <Method void ViewGroup(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:new             #48  <Class ActivityChooserView$1>
    //    7   11:dup             
    //    8   12:aload_0         
    //    9   13:invokespecial   #51  <Method void ActivityChooserView$1(ActivityChooserView)>
    //   10   16:putfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //   11   19:aload_0         
    //   12   20:new             #55  <Class ActivityChooserView$2>
    //   13   23:dup             
    //   14   24:aload_0         
    //   15   25:invokespecial   #56  <Method void ActivityChooserView$2(ActivityChooserView)>
    //   16   28:putfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
    //   17   31:aload_0         
    //   18   32:iconst_4        
    //   19   33:putfield        #60  <Field int mInitialActivityCount>
    //   20   36:aload_1         
    //   21   37:aload_2         
    //   22   38:getstatic       #66  <Field int[] android.support.v7.appcompat.R$styleable.ActivityChooserView>
    //   23   41:iload_3         
    //   24   42:iconst_0        
    //   25   43:invokevirtual   #72  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   26   46:astore          4
    //   27   48:aload_0         
    //   28   49:aload           4
    //   29   51:iconst_0        
    //   30   52:iconst_4        
    //   31   53:invokevirtual   #78  <Method int TypedArray.getInt(int, int)>
    //   32   56:putfield        #60  <Field int mInitialActivityCount>
    //   33   59:aload           4
    //   34   61:iconst_1        
    //   35   62:invokevirtual   #82  <Method Drawable TypedArray.getDrawable(int)>
    //   36   65:astore          5
    //   37   67:aload           4
    //   38   69:invokevirtual   #86  <Method void TypedArray.recycle()>
    //   39   72:aload_0         
    //   40   73:invokevirtual   #90  <Method Context getContext()>
    //   41   76:invokestatic    #96  <Method LayoutInflater LayoutInflater.from(Context)>
    //   42   79:getstatic       #101 <Field int android.support.v7.appcompat.R$layout.abc_activity_chooser_view>
    //   43   82:aload_0         
    //   44   83:iconst_1        
    //   45   84:invokevirtual   #105 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   46   87:pop             
    //   47   88:aload_0         
    //   48   89:new             #107 <Class ActivityChooserView$Callbacks>
    //   49   92:dup             
    //   50   93:aload_0         
    //   51   94:aconst_null     
    //   52   95:invokespecial   #110 <Method void ActivityChooserView$Callbacks(ActivityChooserView, ActivityChooserView$1)>
    //   53   98:putfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   54  101:aload_0         
    //   55  102:aload_0         
    //   56  103:getstatic       #117 <Field int android.support.v7.appcompat.R$id.activity_chooser_view_content>
    //   57  106:invokevirtual   #121 <Method View findViewById(int)>
    //   58  109:checkcast       #123 <Class LinearLayout>
    //   59  112:putfield        #125 <Field LinearLayout mActivityChooserContent>
    //   60  115:aload_0         
    //   61  116:aload_0         
    //   62  117:getfield        #125 <Field LinearLayout mActivityChooserContent>
    //   63  120:invokevirtual   #129 <Method Drawable LinearLayout.getBackground()>
    //   64  123:putfield        #131 <Field Drawable mActivityChooserContentBackground>
    //   65  126:aload_0         
    //   66  127:aload_0         
    //   67  128:getstatic       #134 <Field int android.support.v7.appcompat.R$id.default_activity_button>
    //   68  131:invokevirtual   #121 <Method View findViewById(int)>
    //   69  134:checkcast       #136 <Class FrameLayout>
    //   70  137:putfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   71  140:aload_0         
    //   72  141:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   73  144:aload_0         
    //   74  145:getfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   75  148:invokevirtual   #142 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
    //   76  151:aload_0         
    //   77  152:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   78  155:aload_0         
    //   79  156:getfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   80  159:invokevirtual   #146 <Method void FrameLayout.setOnLongClickListener(android.view.View$OnLongClickListener)>
    //   81  162:aload_0         
    //   82  163:aload_0         
    //   83  164:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   84  167:getstatic       #149 <Field int android.support.v7.appcompat.R$id.image>
    //   85  170:invokevirtual   #150 <Method View FrameLayout.findViewById(int)>
    //   86  173:checkcast       #152 <Class ImageView>
    //   87  176:putfield        #154 <Field ImageView mDefaultActivityButtonImage>
    //   88  179:aload_0         
    //   89  180:aload_0         
    //   90  181:getstatic       #157 <Field int android.support.v7.appcompat.R$id.expand_activities_button>
    //   91  184:invokevirtual   #121 <Method View findViewById(int)>
    //   92  187:checkcast       #136 <Class FrameLayout>
    //   93  190:putfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //   94  193:aload_0         
    //   95  194:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //   96  197:aload_0         
    //   97  198:getfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   98  201:invokevirtual   #142 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
    //   99  204:aload_0         
    //  100  205:aload_0         
    //  101  206:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //  102  209:getstatic       #149 <Field int android.support.v7.appcompat.R$id.image>
    //  103  212:invokevirtual   #150 <Method View FrameLayout.findViewById(int)>
    //  104  215:checkcast       #152 <Class ImageView>
    //  105  218:putfield        #161 <Field ImageView mExpandActivityOverflowButtonImage>
    //  106  221:aload_0         
    //  107  222:getfield        #161 <Field ImageView mExpandActivityOverflowButtonImage>
    //  108  225:aload           5
    //  109  227:invokevirtual   #165 <Method void ImageView.setImageDrawable(Drawable)>
    //  110  230:aload_0         
    //  111  231:new             #167 <Class ActivityChooserView$ActivityChooserViewAdapter>
    //  112  234:dup             
    //  113  235:aload_0         
    //  114  236:aconst_null     
    //  115  237:invokespecial   #168 <Method void ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView, ActivityChooserView$1)>
    //  116  240:putfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //  117  243:aload_0         
    //  118  244:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //  119  247:new             #172 <Class ActivityChooserView$3>
    //  120  250:dup             
    //  121  251:aload_0         
    //  122  252:invokespecial   #173 <Method void ActivityChooserView$3(ActivityChooserView)>
    //  123  255:invokevirtual   #177 <Method void ActivityChooserView$ActivityChooserViewAdapter.registerDataSetObserver(DataSetObserver)>
    //  124  258:aload_1         
    //  125  259:invokevirtual   #181 <Method Resources Context.getResources()>
    //  126  262:astore          7
    //  127  264:aload_0         
    //  128  265:aload           7
    //  129  267:invokevirtual   #187 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //  130  270:getfield        #192 <Field int DisplayMetrics.widthPixels>
    //  131  273:iconst_2        
    //  132  274:idiv            
    //  133  275:aload           7
    //  134  277:getstatic       #197 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
    //  135  280:invokevirtual   #201 <Method int Resources.getDimensionPixelSize(int)>
    //  136  283:invokestatic    #206 <Method int Math.max(int, int)>
    //  137  286:putfield        #208 <Field int mListPopupMaxWidth>
    //  138  289:return          
    }

    static ActivityChooserViewAdapter access$000(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    5    4:areturn         
    }

    static ListPopupWindow access$100(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //    5    4:areturn         
    }

    static android.widget.PopupWindow.OnDismissListener access$1000(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #220 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
    //    5    4:areturn         
    }

    static DataSetObserver access$1100(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //    5    4:areturn         
    }

    static void access$400(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #226 <Method void updateAppearance()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #226 <Method void updateAppearance()>
    //    5    4:return          
    }

    static void access$500(ActivityChooserView activitychooserview, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #232 <Method void showPopupUnchecked(int)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #232 <Method void showPopupUnchecked(int)>
    //    7    5:return          
    }

    static boolean access$600(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    5    4:ireturn         
    }

    static boolean access$602(ActivityChooserView activitychooserview, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static FrameLayout access$700(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //    5    4:areturn         
    }

    static FrameLayout access$800(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //    5    4:areturn         
    }

    static int access$900(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field int mInitialActivityCount>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #60  <Field int mInitialActivityCount>
    //    5    4:ireturn         
    }

    private ListPopupWindow getListPopupWindow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //    2    4:ifnonnull       71
    //    3    7:aload_0         
    //    4    8:new             #247 <Class ListPopupWindow>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokevirtual   #90  <Method Context getContext()>
    //    8   16:invokespecial   #249 <Method void ListPopupWindow(Context)>
    //    9   19:putfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   10   22:aload_0         
    //   11   23:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   12   26:aload_0         
    //   13   27:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   14   30:invokevirtual   #253 <Method void ListPopupWindow.setAdapter(android.widget.ListAdapter)>
    //   15   33:aload_0         
    //   16   34:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   17   37:aload_0         
    //   18   38:invokevirtual   #257 <Method void ListPopupWindow.setAnchorView(View)>
    //   19   41:aload_0         
    //   20   42:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   21   45:iconst_1        
    //   22   46:invokevirtual   #261 <Method void ListPopupWindow.setModal(boolean)>
    //   23   49:aload_0         
    //   24   50:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   25   53:aload_0         
    //   26   54:getfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   27   57:invokevirtual   #265 <Method void ListPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   28   60:aload_0         
    //   29   61:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   30   64:aload_0         
    //   31   65:getfield        #112 <Field ActivityChooserView$Callbacks mCallbacks>
    //   32   68:invokevirtual   #269 <Method void ListPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
    //   33   71:aload_0         
    //   34   72:getfield        #245 <Field ListPopupWindow mListPopupWindow>
    //   35   75:areturn         
    }

    private void showPopupUnchecked(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:invokevirtual   #273 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
    //    3    7:ifnonnull       21
    //    4   10:new             #275 <Class IllegalStateException>
    //    5   13:dup             
    //    6   14:ldc2            #277 <String "No data model. Did you call #setDataModel?">
    //    7   17:invokespecial   #280 <Method void IllegalStateException(String)>
    //    8   20:athrow          
    //    9   21:aload_0         
    //   10   22:invokevirtual   #284 <Method ViewTreeObserver getViewTreeObserver()>
    //   11   25:aload_0         
    //   12   26:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
    //   13   29:invokevirtual   #290 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   14   32:aload_0         
    //   15   33:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   16   36:invokevirtual   #294 <Method int FrameLayout.getVisibility()>
    //   17   39:ifne            184
    //   18   42:iconst_1        
    //   19   43:istore_2        
    //   20   44:aload_0         
    //   21   45:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   22   48:invokevirtual   #297 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
    //   23   51:istore_3        
    //   24   52:iload_2         
    //   25   53:ifeq            189
    //   26   56:iconst_1        
    //   27   57:istore          4
    //   28   59:iload_1         
    //   29   60:ldc2            #298 <Int 0x7fffffff>
    //   30   63:icmpeq          195
    //   31   66:iload_3         
    //   32   67:iload_1         
    //   33   68:iload           4
    //   34   70:iadd            
    //   35   71:icmple          195
    //   36   74:aload_0         
    //   37   75:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   38   78:iconst_1        
    //   39   79:invokevirtual   #301 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
    //   40   82:aload_0         
    //   41   83:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   42   86:iload_1         
    //   43   87:iconst_1        
    //   44   88:isub            
    //   45   89:invokevirtual   #304 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
    //   46   92:aload_0         
    //   47   93:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //   48   96:astore          5
    //   49   98:aload           5
    //   50  100:invokevirtual   #308 <Method boolean ListPopupWindow.isShowing()>
    //   51  103:ifne            183
    //   52  106:aload_0         
    //   53  107:getfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //   54  110:ifne            117
    //   55  113:iload_2         
    //   56  114:ifne            214
    //   57  117:aload_0         
    //   58  118:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   59  121:iconst_1        
    //   60  122:iload_2         
    //   61  123:invokevirtual   #312 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
    //   62  126:aload           5
    //   63  128:aload_0         
    //   64  129:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   65  132:invokevirtual   #315 <Method int ActivityChooserView$ActivityChooserViewAdapter.measureContentWidth()>
    //   66  135:aload_0         
    //   67  136:getfield        #208 <Field int mListPopupMaxWidth>
    //   68  139:invokestatic    #318 <Method int Math.min(int, int)>
    //   69  142:invokevirtual   #321 <Method void ListPopupWindow.setContentWidth(int)>
    //   70  145:aload           5
    //   71  147:invokevirtual   #324 <Method void ListPopupWindow.show()>
    //   72  150:aload_0         
    //   73  151:getfield        #326 <Field ActionProvider mProvider>
    //   74  154:ifnull          165
    //   75  157:aload_0         
    //   76  158:getfield        #326 <Field ActionProvider mProvider>
    //   77  161:iconst_1        
    //   78  162:invokevirtual   #331 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
    //   79  165:aload           5
    //   80  167:invokevirtual   #335 <Method ListView ListPopupWindow.getListView()>
    //   81  170:aload_0         
    //   82  171:invokevirtual   #90  <Method Context getContext()>
    //   83  174:getstatic       #340 <Field int android.support.v7.appcompat.R$string.abc_activitychooserview_choose_application>
    //   84  177:invokevirtual   #344 <Method String Context.getString(int)>
    //   85  180:invokevirtual   #350 <Method void ListView.setContentDescription(CharSequence)>
    //   86  183:return          
    //   87  184:iconst_0        
    //   88  185:istore_2        
    //   89  186:goto            44
    //   90  189:iconst_0        
    //   91  190:istore          4
    //   92  192:goto            59
    //   93  195:aload_0         
    //   94  196:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   95  199:iconst_0        
    //   96  200:invokevirtual   #301 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowFooterView(boolean)>
    //   97  203:aload_0         
    //   98  204:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   99  207:iload_1         
    //  100  208:invokevirtual   #304 <Method void ActivityChooserView$ActivityChooserViewAdapter.setMaxActivityCount(int)>
    //  101  211:goto            92
    //  102  214:aload_0         
    //  103  215:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //  104  218:iconst_0        
    //  105  219:iconst_0        
    //  106  220:invokevirtual   #312 <Method void ActivityChooserView$ActivityChooserViewAdapter.setShowDefaultActivity(boolean, boolean)>
    //  107  223:goto            126
    }

    private void updateAppearance()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:invokevirtual   #353 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
    //    3    7:ifle            154
    //    4   10:aload_0         
    //    5   11:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //    6   14:iconst_1        
    //    7   15:invokevirtual   #356 <Method void FrameLayout.setEnabled(boolean)>
    //    8   18:aload_0         
    //    9   19:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   10   22:invokevirtual   #297 <Method int ActivityChooserView$ActivityChooserViewAdapter.getActivityCount()>
    //   11   25:istore_1        
    //   12   26:aload_0         
    //   13   27:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   14   30:invokevirtual   #359 <Method int ActivityChooserView$ActivityChooserViewAdapter.getHistorySize()>
    //   15   33:istore_2        
    //   16   34:iload_1         
    //   17   35:iconst_1        
    //   18   36:icmpeq          48
    //   19   39:iload_1         
    //   20   40:iconst_1        
    //   21   41:icmple          165
    //   22   44:iload_2         
    //   23   45:ifle            165
    //   24   48:aload_0         
    //   25   49:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   26   52:iconst_0        
    //   27   53:invokevirtual   #362 <Method void FrameLayout.setVisibility(int)>
    //   28   56:aload_0         
    //   29   57:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //   30   60:invokevirtual   #366 <Method ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
    //   31   63:astore_3        
    //   32   64:aload_0         
    //   33   65:invokevirtual   #90  <Method Context getContext()>
    //   34   68:invokevirtual   #370 <Method android.content.pm.PackageManager Context.getPackageManager()>
    //   35   71:astore          4
    //   36   73:aload_0         
    //   37   74:getfield        #154 <Field ImageView mDefaultActivityButtonImage>
    //   38   77:aload_3         
    //   39   78:aload           4
    //   40   80:invokevirtual   #376 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
    //   41   83:invokevirtual   #165 <Method void ImageView.setImageDrawable(Drawable)>
    //   42   86:aload_0         
    //   43   87:getfield        #378 <Field int mDefaultActionButtonContentDescription>
    //   44   90:ifeq            132
    //   45   93:aload_3         
    //   46   94:aload           4
    //   47   96:invokevirtual   #382 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
    //   48   99:astore          5
    //   49  101:aload_0         
    //   50  102:invokevirtual   #90  <Method Context getContext()>
    //   51  105:aload_0         
    //   52  106:getfield        #378 <Field int mDefaultActionButtonContentDescription>
    //   53  109:iconst_1        
    //   54  110:anewarray       Object[]
    //   55  113:dup             
    //   56  114:iconst_0        
    //   57  115:aload           5
    //   58  117:aastore         
    //   59  118:invokevirtual   #387 <Method String Context.getString(int, Object[])>
    //   60  121:astore          6
    //   61  123:aload_0         
    //   62  124:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   63  127:aload           6
    //   64  129:invokevirtual   #388 <Method void FrameLayout.setContentDescription(CharSequence)>
    //   65  132:aload_0         
    //   66  133:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   67  136:invokevirtual   #294 <Method int FrameLayout.getVisibility()>
    //   68  139:ifne            177
    //   69  142:aload_0         
    //   70  143:getfield        #125 <Field LinearLayout mActivityChooserContent>
    //   71  146:aload_0         
    //   72  147:getfield        #131 <Field Drawable mActivityChooserContentBackground>
    //   73  150:invokevirtual   #391 <Method void LinearLayout.setBackgroundDrawable(Drawable)>
    //   74  153:return          
    //   75  154:aload_0         
    //   76  155:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //   77  158:iconst_0        
    //   78  159:invokevirtual   #356 <Method void FrameLayout.setEnabled(boolean)>
    //   79  162:goto            18
    //   80  165:aload_0         
    //   81  166:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //   82  169:bipush          8
    //   83  171:invokevirtual   #362 <Method void FrameLayout.setVisibility(int)>
    //   84  174:goto            132
    //   85  177:aload_0         
    //   86  178:getfield        #125 <Field LinearLayout mActivityChooserContent>
    //   87  181:aconst_null     
    //   88  182:invokevirtual   #391 <Method void LinearLayout.setBackgroundDrawable(Drawable)>
    //   89  185:return          
    }

    public boolean dismissPopup()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #395 <Method boolean isShowingPopup()>
    //    2    4:ifeq            34
    //    3    7:aload_0         
    //    4    8:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //    5   11:invokevirtual   #398 <Method void ListPopupWindow.dismiss()>
    //    6   14:aload_0         
    //    7   15:invokevirtual   #284 <Method ViewTreeObserver getViewTreeObserver()>
    //    8   18:astore_1        
    //    9   19:aload_1         
    //   10   20:invokevirtual   #401 <Method boolean ViewTreeObserver.isAlive()>
    //   11   23:ifeq            34
    //   12   26:aload_1         
    //   13   27:aload_0         
    //   14   28:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
    //   15   31:invokevirtual   #404 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   16   34:iconst_1        
    //   17   35:ireturn         
    }

    public ActivityChooserModel getDataModel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:invokevirtual   #273 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
    //    3    7:areturn         
    }

    public boolean isShowingPopup()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //    2    4:invokevirtual   #308 <Method boolean ListPopupWindow.isShowing()>
    //    3    7:ireturn         
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #407 <Method void ViewGroup.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    4    8:invokevirtual   #273 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:ifnull          24
    //    8   16:aload_1         
    //    9   17:aload_0         
    //   10   18:getfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //   11   21:invokevirtual   #413 <Method void ActivityChooserModel.registerObserver(Object)>
    //   12   24:aload_0         
    //   13   25:iconst_1        
    //   14   26:putfield        #415 <Field boolean mIsAttachedToWindow>
    //   15   29:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #418 <Method void ViewGroup.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    4    8:invokevirtual   #273 <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:ifnull          24
    //    8   16:aload_1         
    //    9   17:aload_0         
    //   10   18:getfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //   11   21:invokevirtual   #421 <Method void ActivityChooserModel.unregisterObserver(Object)>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #284 <Method ViewTreeObserver getViewTreeObserver()>
    //   14   28:astore_2        
    //   15   29:aload_2         
    //   16   30:invokevirtual   #401 <Method boolean ViewTreeObserver.isAlive()>
    //   17   33:ifeq            44
    //   18   36:aload_2         
    //   19   37:aload_0         
    //   20   38:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mOnGlobalLayoutListener>
    //   21   41:invokevirtual   #404 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   22   44:aload_0         
    //   23   45:invokevirtual   #395 <Method boolean isShowingPopup()>
    //   24   48:ifeq            56
    //   25   51:aload_0         
    //   26   52:invokevirtual   #423 <Method boolean dismissPopup()>
    //   27   55:pop             
    //   28   56:aload_0         
    //   29   57:iconst_0        
    //   30   58:putfield        #415 <Field boolean mIsAttachedToWindow>
    //   31   61:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #125 <Field LinearLayout mActivityChooserContent>
    //    2    4:iconst_0        
    //    3    5:iconst_0        
    //    4    6:iload           4
    //    5    8:iload_2         
    //    6    9:isub            
    //    7   10:iload           5
    //    8   12:iload_3         
    //    9   13:isub            
    //   10   14:invokevirtual   #429 <Method void LinearLayout.layout(int, int, int, int)>
    //   11   17:aload_0         
    //   12   18:invokevirtual   #395 <Method boolean isShowingPopup()>
    //   13   21:ifne            29
    //   14   24:aload_0         
    //   15   25:invokevirtual   #423 <Method boolean dismissPopup()>
    //   16   28:pop             
    //   17   29:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #125 <Field LinearLayout mActivityChooserContent>
    //    2    4:astore_3        
    //    3    5:aload_0         
    //    4    6:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //    5    9:invokevirtual   #294 <Method int FrameLayout.getVisibility()>
    //    6   12:ifeq            26
    //    7   15:iload_2         
    //    8   16:invokestatic    #436 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    9   19:ldc2            #437 <Int 0x40000000>
    //   10   22:invokestatic    #440 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   11   25:istore_2        
    //   12   26:aload_0         
    //   13   27:aload_3         
    //   14   28:iload_1         
    //   15   29:iload_2         
    //   16   30:invokevirtual   #444 <Method void measureChild(View, int, int)>
    //   17   33:aload_0         
    //   18   34:aload_3         
    //   19   35:invokevirtual   #449 <Method int View.getMeasuredWidth()>
    //   20   38:aload_3         
    //   21   39:invokevirtual   #452 <Method int View.getMeasuredHeight()>
    //   22   42:invokevirtual   #455 <Method void setMeasuredDimension(int, int)>
    //   23   45:return          
    }

    public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #460 <Method void ActivityChooserView$ActivityChooserViewAdapter.setDataModel(ActivityChooserModel)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #395 <Method boolean isShowingPopup()>
    //    6   12:ifeq            25
    //    7   15:aload_0         
    //    8   16:invokevirtual   #423 <Method boolean dismissPopup()>
    //    9   19:pop             
    //   10   20:aload_0         
    //   11   21:invokevirtual   #463 <Method boolean showPopup()>
    //   12   24:pop             
    //   13   25:return          
    }

    public void setDefaultActionButtonContentDescription(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #378 <Field int mDefaultActionButtonContentDescription>
    //    3    5:return          
    }

    public void setExpandActivityOverflowButtonContentDescription(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #90  <Method Context getContext()>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #344 <Method String Context.getString(int)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #161 <Field ImageView mExpandActivityOverflowButtonImage>
    //    7   13:aload_2         
    //    8   14:invokevirtual   #466 <Method void ImageView.setContentDescription(CharSequence)>
    //    9   17:return          
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #161 <Field ImageView mExpandActivityOverflowButtonImage>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #165 <Method void ImageView.setImageDrawable(Drawable)>
    //    4    8:return          
    }

    public void setInitialActivityCount(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #60  <Field int mInitialActivityCount>
    //    3    5:return          
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #220 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
    //    3    5:return          
    }

    public void setProvider(ActionProvider actionprovider)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #326 <Field ActionProvider mProvider>
    //    3    5:return          
    }

    public boolean showPopup()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #395 <Method boolean isShowingPopup()>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:getfield        #415 <Field boolean mIsAttachedToWindow>
    //    5   11:ifne            16
    //    6   14:iconst_0        
    //    7   15:ireturn         
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //   11   21:aload_0         
    //   12   22:aload_0         
    //   13   23:getfield        #60  <Field int mInitialActivityCount>
    //   14   26:invokespecial   #232 <Method void showPopupUnchecked(int)>
    //   15   29:iconst_1        
    //   16   30:ireturn         
    }

    private final LinearLayout mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    static ActivityChooserViewAdapter access$000(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field ActivityChooserView$ActivityChooserViewAdapter mAdapter>
    //    2    4:areturn         
    }

    static ListPopupWindow access$100(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #216 <Method ListPopupWindow getListPopupWindow()>
    //    2    4:areturn         
    }

    static android.widget.PopupWindow.OnDismissListener access$1000(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
    //    2    4:areturn         
    }

    static DataSetObserver access$1100(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field DataSetObserver mModelDataSetOberver>
    //    2    4:areturn         
    }

    static void access$400(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #226 <Method void updateAppearance()>
    //    2    4:return          
    }

    static void access$500(ActivityChooserView activitychooserview, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #232 <Method void showPopupUnchecked(int)>
    //    3    5:return          
    }

    static boolean access$600(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    2    4:ireturn         
    }

    static boolean access$602(ActivityChooserView activitychooserview, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #236 <Field boolean mIsSelectingDefaultActivity>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static FrameLayout access$700(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field FrameLayout mDefaultActivityButton>
    //    2    4:areturn         
    }

    static FrameLayout access$800(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field FrameLayout mExpandActivityOverflowButton>
    //    2    4:areturn         
    }

    static int access$900(ActivityChooserView activitychooserview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field int mInitialActivityCount>
    //    2    4:ireturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ActivityChooserView$1

/* anonymous class */
    class _cls1 extends DataSetObserver
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ActivityChooserView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void DataSetObserver()>
        //    5    9:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #18  <Method void DataSetObserver.onChanged()>
        //    2    4:aload_0         
        //    3    5:getfield        #12  <Field ActivityChooserView this$0>
        //    4    8:invokestatic    #22  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //    5   11:invokevirtual   #27  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetChanged()>
        //    6   14:return          
        }

        public void onInvalidated()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #30  <Method void DataSetObserver.onInvalidated()>
        //    2    4:aload_0         
        //    3    5:getfield        #12  <Field ActivityChooserView this$0>
        //    4    8:invokestatic    #22  <Method ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.access$000(ActivityChooserView)>
        //    5   11:invokevirtual   #33  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetInvalidated()>
        //    6   14:return          
        }

        final ActivityChooserView this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ActivityChooserView$2

/* anonymous class */
    class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActivityChooserView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActivityChooserView this$0>
        //    2    4:invokevirtual   #22  <Method boolean ActivityChooserView.isShowingPopup()>
        //    3    7:ifeq            30
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActivityChooserView this$0>
        //    6   14:invokevirtual   #25  <Method boolean ActivityChooserView.isShown()>
        //    7   17:ifne            31
        //    8   20:aload_0         
        //    9   21:getfield        #14  <Field ActivityChooserView this$0>
        //   10   24:invokestatic    #29  <Method ListPopupWindow ActivityChooserView.access$100(ActivityChooserView)>
        //   11   27:invokevirtual   #34  <Method void ListPopupWindow.dismiss()>
        //   12   30:return          
        //   13   31:aload_0         
        //   14   32:getfield        #14  <Field ActivityChooserView this$0>
        //   15   35:invokestatic    #29  <Method ListPopupWindow ActivityChooserView.access$100(ActivityChooserView)>
        //   16   38:invokevirtual   #37  <Method void ListPopupWindow.show()>
        //   17   41:aload_0         
        //   18   42:getfield        #14  <Field ActivityChooserView this$0>
        //   19   45:getfield        #41  <Field ActionProvider ActivityChooserView.mProvider>
        //   20   48:ifnull          30
        //   21   51:aload_0         
        //   22   52:getfield        #14  <Field ActivityChooserView this$0>
        //   23   55:getfield        #41  <Field ActionProvider ActivityChooserView.mProvider>
        //   24   58:iconst_1        
        //   25   59:invokevirtual   #47  <Method void ActionProvider.subUiVisibilityChanged(boolean)>
        //   26   62:return          
        }

        final ActivityChooserView this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ActivityChooserView$3

/* anonymous class */
    class _cls3 extends DataSetObserver
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActivityChooserView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void DataSetObserver()>
        //    5    9:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #20  <Method void DataSetObserver.onChanged()>
        //    2    4:aload_0         
        //    3    5:getfield        #14  <Field ActivityChooserView this$0>
        //    4    8:invokestatic    #23  <Method void ActivityChooserView.access$400(ActivityChooserView)>
        //    5   11:return          
        }

        final ActivityChooserView this$0;
    }

}
