// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v7.internal.view.menu.*;
import android.support.v7.view.CollapsibleActionView;
import android.text.TextUtils;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.widget.*;
import java.util.List;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, SpinnerICS, ProgressBarICS, ScrollingTabContainerView, 
//            ActionBarContextView, ActionBarContainer, AdapterViewICS

public class ActionBarView extends AbsActionBarView
{
    private class ExpandedActionViewMenuPresenter
        implements MenuPresenter
    {

        private ExpandedActionViewMenuPresenter()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field ActionBarView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        ExpandedActionViewMenuPresenter(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #22  <Method void ActionBarView$ExpandedActionViewMenuPresenter(ActionBarView)>
        //    3    5:return          
        }

        public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ActionBarView this$0>
        //    2    4:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //    3    7:instanceof      #32  <Class CollapsibleActionView>
        //    4   10:ifeq            28
        //    5   13:aload_0         
        //    6   14:getfield        #16  <Field ActionBarView this$0>
        //    7   17:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //    8   20:checkcast       #32  <Class CollapsibleActionView>
        //    9   23:invokeinterface #35  <Method void CollapsibleActionView.onActionViewCollapsed()>
        //   10   28:aload_0         
        //   11   29:getfield        #16  <Field ActionBarView this$0>
        //   12   32:aload_0         
        //   13   33:getfield        #16  <Field ActionBarView this$0>
        //   14   36:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //   15   39:invokevirtual   #39  <Method void ActionBarView.removeView(View)>
        //   16   42:aload_0         
        //   17   43:getfield        #16  <Field ActionBarView this$0>
        //   18   46:aload_0         
        //   19   47:getfield        #16  <Field ActionBarView this$0>
        //   20   50:invokestatic    #43  <Method ActionBarView$HomeView ActionBarView.access$600(ActionBarView)>
        //   21   53:invokevirtual   #39  <Method void ActionBarView.removeView(View)>
        //   22   56:aload_0         
        //   23   57:getfield        #16  <Field ActionBarView this$0>
        //   24   60:aconst_null     
        //   25   61:putfield        #30  <Field View ActionBarView.mExpandedActionView>
        //   26   64:iconst_2        
        //   27   65:aload_0         
        //   28   66:getfield        #16  <Field ActionBarView this$0>
        //   29   69:invokestatic    #47  <Method int ActionBarView.access$1200(ActionBarView)>
        //   30   72:iand            
        //   31   73:ifeq            87
        //   32   76:aload_0         
        //   33   77:getfield        #16  <Field ActionBarView this$0>
        //   34   80:invokestatic    #50  <Method ActionBarView$HomeView ActionBarView.access$700(ActionBarView)>
        //   35   83:iconst_0        
        //   36   84:invokevirtual   #56  <Method void ActionBarView$HomeView.setVisibility(int)>
        //   37   87:bipush          8
        //   38   89:aload_0         
        //   39   90:getfield        #16  <Field ActionBarView this$0>
        //   40   93:invokestatic    #47  <Method int ActionBarView.access$1200(ActionBarView)>
        //   41   96:iand            
        //   42   97:ifeq            117
        //   43  100:aload_0         
        //   44  101:getfield        #16  <Field ActionBarView this$0>
        //   45  104:invokestatic    #60  <Method LinearLayout ActionBarView.access$800(ActionBarView)>
        //   46  107:ifnonnull       245
        //   47  110:aload_0         
        //   48  111:getfield        #16  <Field ActionBarView this$0>
        //   49  114:invokestatic    #63  <Method void ActionBarView.access$1300(ActionBarView)>
        //   50  117:aload_0         
        //   51  118:getfield        #16  <Field ActionBarView this$0>
        //   52  121:invokestatic    #67  <Method ScrollingTabContainerView ActionBarView.access$900(ActionBarView)>
        //   53  124:ifnull          149
        //   54  127:aload_0         
        //   55  128:getfield        #16  <Field ActionBarView this$0>
        //   56  131:invokestatic    #70  <Method int ActionBarView.access$1400(ActionBarView)>
        //   57  134:iconst_2        
        //   58  135:icmpne          149
        //   59  138:aload_0         
        //   60  139:getfield        #16  <Field ActionBarView this$0>
        //   61  142:invokestatic    #67  <Method ScrollingTabContainerView ActionBarView.access$900(ActionBarView)>
        //   62  145:iconst_0        
        //   63  146:invokevirtual   #73  <Method void ScrollingTabContainerView.setVisibility(int)>
        //   64  149:aload_0         
        //   65  150:getfield        #16  <Field ActionBarView this$0>
        //   66  153:invokestatic    #77  <Method SpinnerICS ActionBarView.access$1000(ActionBarView)>
        //   67  156:ifnull          181
        //   68  159:aload_0         
        //   69  160:getfield        #16  <Field ActionBarView this$0>
        //   70  163:invokestatic    #70  <Method int ActionBarView.access$1400(ActionBarView)>
        //   71  166:iconst_1        
        //   72  167:icmpne          181
        //   73  170:aload_0         
        //   74  171:getfield        #16  <Field ActionBarView this$0>
        //   75  174:invokestatic    #77  <Method SpinnerICS ActionBarView.access$1000(ActionBarView)>
        //   76  177:iconst_0        
        //   77  178:invokevirtual   #80  <Method void SpinnerICS.setVisibility(int)>
        //   78  181:aload_0         
        //   79  182:getfield        #16  <Field ActionBarView this$0>
        //   80  185:invokestatic    #84  <Method View ActionBarView.access$1100(ActionBarView)>
        //   81  188:ifnull          215
        //   82  191:bipush          16
        //   83  193:aload_0         
        //   84  194:getfield        #16  <Field ActionBarView this$0>
        //   85  197:invokestatic    #47  <Method int ActionBarView.access$1200(ActionBarView)>
        //   86  200:iand            
        //   87  201:ifeq            215
        //   88  204:aload_0         
        //   89  205:getfield        #16  <Field ActionBarView this$0>
        //   90  208:invokestatic    #84  <Method View ActionBarView.access$1100(ActionBarView)>
        //   91  211:iconst_0        
        //   92  212:invokevirtual   #87  <Method void View.setVisibility(int)>
        //   93  215:aload_0         
        //   94  216:getfield        #16  <Field ActionBarView this$0>
        //   95  219:invokestatic    #43  <Method ActionBarView$HomeView ActionBarView.access$600(ActionBarView)>
        //   96  222:aconst_null     
        //   97  223:invokevirtual   #91  <Method void ActionBarView$HomeView.setIcon(Drawable)>
        //   98  226:aload_0         
        //   99  227:aconst_null     
        //  100  228:putfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //  101  231:aload_0         
        //  102  232:getfield        #16  <Field ActionBarView this$0>
        //  103  235:invokevirtual   #96  <Method void ActionBarView.requestLayout()>
        //  104  238:aload_2         
        //  105  239:iconst_0        
        //  106  240:invokevirtual   #102 <Method void MenuItemImpl.setActionViewExpanded(boolean)>
        //  107  243:iconst_1        
        //  108  244:ireturn         
        //  109  245:aload_0         
        //  110  246:getfield        #16  <Field ActionBarView this$0>
        //  111  249:invokestatic    #60  <Method LinearLayout ActionBarView.access$800(ActionBarView)>
        //  112  252:iconst_0        
        //  113  253:invokevirtual   #105 <Method void LinearLayout.setVisibility(int)>
        //  114  256:goto            117
        }

        public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ActionBarView this$0>
        //    2    4:aload_2         
        //    3    5:invokevirtual   #110 <Method View MenuItemImpl.getActionView()>
        //    4    8:putfield        #30  <Field View ActionBarView.mExpandedActionView>
        //    5   11:aload_0         
        //    6   12:getfield        #16  <Field ActionBarView this$0>
        //    7   15:invokestatic    #43  <Method ActionBarView$HomeView ActionBarView.access$600(ActionBarView)>
        //    8   18:aload_0         
        //    9   19:getfield        #16  <Field ActionBarView this$0>
        //   10   22:invokestatic    #114 <Method Drawable ActionBarView.access$500(ActionBarView)>
        //   11   25:invokevirtual   #120 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
        //   12   28:aload_0         
        //   13   29:getfield        #16  <Field ActionBarView this$0>
        //   14   32:invokevirtual   #124 <Method Resources ActionBarView.getResources()>
        //   15   35:invokevirtual   #130 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
        //   16   38:invokevirtual   #91  <Method void ActionBarView$HomeView.setIcon(Drawable)>
        //   17   41:aload_0         
        //   18   42:aload_2         
        //   19   43:putfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //   20   46:aload_0         
        //   21   47:getfield        #16  <Field ActionBarView this$0>
        //   22   50:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //   23   53:invokevirtual   #134 <Method android.view.ViewParent View.getParent()>
        //   24   56:aload_0         
        //   25   57:getfield        #16  <Field ActionBarView this$0>
        //   26   60:if_acmpeq       77
        //   27   63:aload_0         
        //   28   64:getfield        #16  <Field ActionBarView this$0>
        //   29   67:aload_0         
        //   30   68:getfield        #16  <Field ActionBarView this$0>
        //   31   71:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //   32   74:invokevirtual   #137 <Method void ActionBarView.addView(View)>
        //   33   77:aload_0         
        //   34   78:getfield        #16  <Field ActionBarView this$0>
        //   35   81:invokestatic    #43  <Method ActionBarView$HomeView ActionBarView.access$600(ActionBarView)>
        //   36   84:invokevirtual   #138 <Method android.view.ViewParent ActionBarView$HomeView.getParent()>
        //   37   87:aload_0         
        //   38   88:getfield        #16  <Field ActionBarView this$0>
        //   39   91:if_acmpeq       108
        //   40   94:aload_0         
        //   41   95:getfield        #16  <Field ActionBarView this$0>
        //   42   98:aload_0         
        //   43   99:getfield        #16  <Field ActionBarView this$0>
        //   44  102:invokestatic    #43  <Method ActionBarView$HomeView ActionBarView.access$600(ActionBarView)>
        //   45  105:invokevirtual   #137 <Method void ActionBarView.addView(View)>
        //   46  108:aload_0         
        //   47  109:getfield        #16  <Field ActionBarView this$0>
        //   48  112:invokestatic    #50  <Method ActionBarView$HomeView ActionBarView.access$700(ActionBarView)>
        //   49  115:bipush          8
        //   50  117:invokevirtual   #56  <Method void ActionBarView$HomeView.setVisibility(int)>
        //   51  120:aload_0         
        //   52  121:getfield        #16  <Field ActionBarView this$0>
        //   53  124:invokestatic    #60  <Method LinearLayout ActionBarView.access$800(ActionBarView)>
        //   54  127:ifnull          142
        //   55  130:aload_0         
        //   56  131:getfield        #16  <Field ActionBarView this$0>
        //   57  134:invokestatic    #60  <Method LinearLayout ActionBarView.access$800(ActionBarView)>
        //   58  137:bipush          8
        //   59  139:invokevirtual   #105 <Method void LinearLayout.setVisibility(int)>
        //   60  142:aload_0         
        //   61  143:getfield        #16  <Field ActionBarView this$0>
        //   62  146:invokestatic    #67  <Method ScrollingTabContainerView ActionBarView.access$900(ActionBarView)>
        //   63  149:ifnull          164
        //   64  152:aload_0         
        //   65  153:getfield        #16  <Field ActionBarView this$0>
        //   66  156:invokestatic    #67  <Method ScrollingTabContainerView ActionBarView.access$900(ActionBarView)>
        //   67  159:bipush          8
        //   68  161:invokevirtual   #73  <Method void ScrollingTabContainerView.setVisibility(int)>
        //   69  164:aload_0         
        //   70  165:getfield        #16  <Field ActionBarView this$0>
        //   71  168:invokestatic    #77  <Method SpinnerICS ActionBarView.access$1000(ActionBarView)>
        //   72  171:ifnull          186
        //   73  174:aload_0         
        //   74  175:getfield        #16  <Field ActionBarView this$0>
        //   75  178:invokestatic    #77  <Method SpinnerICS ActionBarView.access$1000(ActionBarView)>
        //   76  181:bipush          8
        //   77  183:invokevirtual   #80  <Method void SpinnerICS.setVisibility(int)>
        //   78  186:aload_0         
        //   79  187:getfield        #16  <Field ActionBarView this$0>
        //   80  190:invokestatic    #84  <Method View ActionBarView.access$1100(ActionBarView)>
        //   81  193:ifnull          208
        //   82  196:aload_0         
        //   83  197:getfield        #16  <Field ActionBarView this$0>
        //   84  200:invokestatic    #84  <Method View ActionBarView.access$1100(ActionBarView)>
        //   85  203:bipush          8
        //   86  205:invokevirtual   #87  <Method void View.setVisibility(int)>
        //   87  208:aload_0         
        //   88  209:getfield        #16  <Field ActionBarView this$0>
        //   89  212:invokevirtual   #96  <Method void ActionBarView.requestLayout()>
        //   90  215:aload_2         
        //   91  216:iconst_1        
        //   92  217:invokevirtual   #102 <Method void MenuItemImpl.setActionViewExpanded(boolean)>
        //   93  220:aload_0         
        //   94  221:getfield        #16  <Field ActionBarView this$0>
        //   95  224:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //   96  227:instanceof      #32  <Class CollapsibleActionView>
        //   97  230:ifeq            248
        //   98  233:aload_0         
        //   99  234:getfield        #16  <Field ActionBarView this$0>
        //  100  237:getfield        #30  <Field View ActionBarView.mExpandedActionView>
        //  101  240:checkcast       #32  <Class CollapsibleActionView>
        //  102  243:invokeinterface #141 <Method void CollapsibleActionView.onActionViewExpanded()>
        //  103  248:iconst_1        
        //  104  249:ireturn         
        }

        public boolean flagActionItems()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getId()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public MenuView getMenuView(ViewGroup viewgroup)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public void initForMenu(Context context, MenuBuilder menubuilder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #151 <Field MenuBuilder mMenu>
        //    2    4:ifnull          26
        //    3    7:aload_0         
        //    4    8:getfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //    5   11:ifnull          26
        //    6   14:aload_0         
        //    7   15:getfield        #151 <Field MenuBuilder mMenu>
        //    8   18:aload_0         
        //    9   19:getfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //   10   22:invokevirtual   #156 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
        //   11   25:pop             
        //   12   26:aload_0         
        //   13   27:aload_2         
        //   14   28:putfield        #151 <Field MenuBuilder mMenu>
        //   15   31:return          
        }

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        //    0    0:return          
        }

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        //    0    0:return          
        }

        public Parcelable onSaveInstanceState()
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void setCallback(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
        {
        //    0    0:return          
        }

        public void updateMenuView(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //    2    4:ifnull          77
        //    3    7:aload_0         
        //    4    8:getfield        #151 <Field MenuBuilder mMenu>
        //    5   11:astore_2        
        //    6   12:iconst_0        
        //    7   13:istore_3        
        //    8   14:aload_2         
        //    9   15:ifnull          60
        //   10   18:aload_0         
        //   11   19:getfield        #151 <Field MenuBuilder mMenu>
        //   12   22:invokevirtual   #170 <Method int MenuBuilder.size()>
        //   13   25:istore          5
        //   14   27:iconst_0        
        //   15   28:istore          6
        //   16   30:iconst_0        
        //   17   31:istore_3        
        //   18   32:iload           6
        //   19   34:iload           5
        //   20   36:icmpge          60
        //   21   39:aload_0         
        //   22   40:getfield        #151 <Field MenuBuilder mMenu>
        //   23   43:iload           6
        //   24   45:invokevirtual   #174 <Method android.view.MenuItem MenuBuilder.getItem(int)>
        //   25   48:checkcast       #176 <Class SupportMenuItem>
        //   26   51:aload_0         
        //   27   52:getfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //   28   55:if_acmpne       78
        //   29   58:iconst_1        
        //   30   59:istore_3        
        //   31   60:iload_3         
        //   32   61:ifne            77
        //   33   64:aload_0         
        //   34   65:aload_0         
        //   35   66:getfield        #151 <Field MenuBuilder mMenu>
        //   36   69:aload_0         
        //   37   70:getfield        #93  <Field MenuItemImpl mCurrentExpandedItem>
        //   38   73:invokevirtual   #178 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
        //   39   76:pop             
        //   40   77:return          
        //   41   78:iinc            6  1
        //   42   81:goto            30
        }

        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final ActionBarView this$0;
    }

    private static class HomeView extends FrameLayout
    {

        public HomeView(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #17  <Method void ActionBarView$HomeView(Context, AttributeSet)>
        //    4    6:return          
        }

        public HomeView(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #18  <Method void FrameLayout(Context, AttributeSet)>
        //    4    6:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #24  <Method CharSequence getContentDescription()>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:invokestatic    #30  <Method boolean TextUtils.isEmpty(CharSequence)>
        //    5    9:ifne            23
        //    6   12:aload_1         
        //    7   13:invokevirtual   #36  <Method List AccessibilityEvent.getText()>
        //    8   16:aload_2         
        //    9   17:invokeinterface #42  <Method boolean List.add(Object)>
        //   10   22:pop             
        //   11   23:iconst_1        
        //   12   24:ireturn         
        }

        public int getLeftOffset()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #46  <Field ImageView mUpView>
        //    2    4:invokevirtual   #51  <Method int ImageView.getVisibility()>
        //    3    7:bipush          8
        //    4    9:icmpne          17
        //    5   12:aload_0         
        //    6   13:getfield        #53  <Field int mUpWidth>
        //    7   16:ireturn         
        //    8   17:iconst_0        
        //    9   18:ireturn         
        }

        protected void onConfigurationChanged(Configuration configuration)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #57  <Method void FrameLayout.onConfigurationChanged(Configuration)>
        //    3    5:aload_0         
        //    4    6:getfield        #59  <Field int mUpIndicatorRes>
        //    5    9:ifeq            20
        //    6   12:aload_0         
        //    7   13:aload_0         
        //    8   14:getfield        #59  <Field int mUpIndicatorRes>
        //    9   17:invokevirtual   #63  <Method void setUpIndicator(int)>
        //   10   20:return          
        }

        protected void onFinishInflate()
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getstatic       #70  <Field int android.support.v7.appcompat.R$id.up>
        //    3    5:invokevirtual   #74  <Method View findViewById(int)>
        //    4    8:checkcast       #48  <Class ImageView>
        //    5   11:putfield        #46  <Field ImageView mUpView>
        //    6   14:aload_0         
        //    7   15:aload_0         
        //    8   16:getstatic       #77  <Field int android.support.v7.appcompat.R$id.home>
        //    9   19:invokevirtual   #74  <Method View findViewById(int)>
        //   10   22:checkcast       #48  <Class ImageView>
        //   11   25:putfield        #79  <Field ImageView mIconView>
        //   12   28:aload_0         
        //   13   29:aload_0         
        //   14   30:getfield        #46  <Field ImageView mUpView>
        //   15   33:invokevirtual   #83  <Method Drawable ImageView.getDrawable()>
        //   16   36:putfield        #85  <Field Drawable mDefaultUpIndicator>
        //   17   39:return          
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
        //    0    0:iload           5
        //    1    2:iload_3         
        //    2    3:isub            
        //    3    4:iconst_2        
        //    4    5:idiv            
        //    5    6:istore          6
        //    6    8:iload           4
        //    7   10:iload_2         
        //    8   11:isub            
        //    9   12:istore          7
        //   10   14:aload_0         
        //   11   15:getfield        #46  <Field ImageView mUpView>
        //   12   18:invokevirtual   #51  <Method int ImageView.getVisibility()>
        //   13   21:istore          8
        //   14   23:iconst_0        
        //   15   24:istore          9
        //   16   26:iload           8
        //   17   28:bipush          8
        //   18   30:icmpeq          116
        //   19   33:aload_0         
        //   20   34:getfield        #46  <Field ImageView mUpView>
        //   21   37:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
        //   22   40:checkcast       #93  <Class android.widget.FrameLayout$LayoutParams>
        //   23   43:astore          16
        //   24   45:aload_0         
        //   25   46:getfield        #46  <Field ImageView mUpView>
        //   26   49:invokevirtual   #96  <Method int ImageView.getMeasuredHeight()>
        //   27   52:istore          17
        //   28   54:aload_0         
        //   29   55:getfield        #46  <Field ImageView mUpView>
        //   30   58:invokevirtual   #99  <Method int ImageView.getMeasuredWidth()>
        //   31   61:istore          18
        //   32   63:iload           6
        //   33   65:iload           17
        //   34   67:iconst_2        
        //   35   68:idiv            
        //   36   69:isub            
        //   37   70:istore          19
        //   38   72:aload_0         
        //   39   73:getfield        #46  <Field ImageView mUpView>
        //   40   76:iconst_0        
        //   41   77:iload           19
        //   42   79:iload           18
        //   43   81:iload           19
        //   44   83:iload           17
        //   45   85:iadd            
        //   46   86:invokevirtual   #103 <Method void ImageView.layout(int, int, int, int)>
        //   47   89:iload           18
        //   48   91:aload           16
        //   49   93:getfield        #106 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
        //   50   96:iadd            
        //   51   97:aload           16
        //   52   99:getfield        #109 <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
        //   53  102:iadd            
        //   54  103:istore          9
        //   55  105:iload           7
        //   56  107:iload           9
        //   57  109:isub            
        //   58  110:pop             
        //   59  111:iload_2         
        //   60  112:iload           9
        //   61  114:iadd            
        //   62  115:istore_2        
        //   63  116:aload_0         
        //   64  117:getfield        #79  <Field ImageView mIconView>
        //   65  120:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
        //   66  123:checkcast       #93  <Class android.widget.FrameLayout$LayoutParams>
        //   67  126:astore          10
        //   68  128:aload_0         
        //   69  129:getfield        #79  <Field ImageView mIconView>
        //   70  132:invokevirtual   #96  <Method int ImageView.getMeasuredHeight()>
        //   71  135:istore          11
        //   72  137:aload_0         
        //   73  138:getfield        #79  <Field ImageView mIconView>
        //   74  141:invokevirtual   #99  <Method int ImageView.getMeasuredWidth()>
        //   75  144:istore          12
        //   76  146:iload           4
        //   77  148:iload_2         
        //   78  149:isub            
        //   79  150:iconst_2        
        //   80  151:idiv            
        //   81  152:istore          13
        //   82  154:iload           9
        //   83  156:aload           10
        //   84  158:getfield        #106 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
        //   85  161:iload           13
        //   86  163:iload           12
        //   87  165:iconst_2        
        //   88  166:idiv            
        //   89  167:isub            
        //   90  168:invokestatic    #115 <Method int Math.max(int, int)>
        //   91  171:iadd            
        //   92  172:istore          14
        //   93  174:aload           10
        //   94  176:getfield        #118 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
        //   95  179:iload           6
        //   96  181:iload           11
        //   97  183:iconst_2        
        //   98  184:idiv            
        //   99  185:isub            
        //  100  186:invokestatic    #115 <Method int Math.max(int, int)>
        //  101  189:istore          15
        //  102  191:aload_0         
        //  103  192:getfield        #79  <Field ImageView mIconView>
        //  104  195:iload           14
        //  105  197:iload           15
        //  106  199:iload           14
        //  107  201:iload           12
        //  108  203:iadd            
        //  109  204:iload           15
        //  110  206:iload           11
        //  111  208:iadd            
        //  112  209:invokevirtual   #103 <Method void ImageView.layout(int, int, int, int)>
        //  113  212:return          
        }

        protected void onMeasure(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #46  <Field ImageView mUpView>
        //    3    5:iload_1         
        //    4    6:iconst_0        
        //    5    7:iload_2         
        //    6    8:iconst_0        
        //    7    9:invokevirtual   #124 <Method void measureChildWithMargins(View, int, int, int, int)>
        //    8   12:aload_0         
        //    9   13:getfield        #46  <Field ImageView mUpView>
        //   10   16:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
        //   11   19:checkcast       #93  <Class android.widget.FrameLayout$LayoutParams>
        //   12   22:astore_3        
        //   13   23:aload_0         
        //   14   24:aload_3         
        //   15   25:getfield        #106 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
        //   16   28:aload_0         
        //   17   29:getfield        #46  <Field ImageView mUpView>
        //   18   32:invokevirtual   #99  <Method int ImageView.getMeasuredWidth()>
        //   19   35:iadd            
        //   20   36:aload_3         
        //   21   37:getfield        #109 <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
        //   22   40:iadd            
        //   23   41:putfield        #53  <Field int mUpWidth>
        //   24   44:aload_0         
        //   25   45:getfield        #46  <Field ImageView mUpView>
        //   26   48:invokevirtual   #51  <Method int ImageView.getVisibility()>
        //   27   51:bipush          8
        //   28   53:icmpne          241
        //   29   56:iconst_0        
        //   30   57:istore          4
        //   31   59:aload_3         
        //   32   60:getfield        #118 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
        //   33   63:aload_0         
        //   34   64:getfield        #46  <Field ImageView mUpView>
        //   35   67:invokevirtual   #96  <Method int ImageView.getMeasuredHeight()>
        //   36   70:iadd            
        //   37   71:aload_3         
        //   38   72:getfield        #127 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
        //   39   75:iadd            
        //   40   76:istore          5
        //   41   78:aload_0         
        //   42   79:aload_0         
        //   43   80:getfield        #79  <Field ImageView mIconView>
        //   44   83:iload_1         
        //   45   84:iload           4
        //   46   86:iload_2         
        //   47   87:iconst_0        
        //   48   88:invokevirtual   #124 <Method void measureChildWithMargins(View, int, int, int, int)>
        //   49   91:aload_0         
        //   50   92:getfield        #79  <Field ImageView mIconView>
        //   51   95:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
        //   52   98:checkcast       #93  <Class android.widget.FrameLayout$LayoutParams>
        //   53  101:astore          6
        //   54  103:iload           4
        //   55  105:aload           6
        //   56  107:getfield        #106 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
        //   57  110:aload_0         
        //   58  111:getfield        #79  <Field ImageView mIconView>
        //   59  114:invokevirtual   #99  <Method int ImageView.getMeasuredWidth()>
        //   60  117:iadd            
        //   61  118:aload           6
        //   62  120:getfield        #109 <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
        //   63  123:iadd            
        //   64  124:iadd            
        //   65  125:istore          7
        //   66  127:iload           5
        //   67  129:aload           6
        //   68  131:getfield        #118 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
        //   69  134:aload_0         
        //   70  135:getfield        #79  <Field ImageView mIconView>
        //   71  138:invokevirtual   #96  <Method int ImageView.getMeasuredHeight()>
        //   72  141:iadd            
        //   73  142:aload           6
        //   74  144:getfield        #127 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
        //   75  147:iadd            
        //   76  148:invokestatic    #115 <Method int Math.max(int, int)>
        //   77  151:istore          8
        //   78  153:iload_1         
        //   79  154:invokestatic    #133 <Method int android.view.View$MeasureSpec.getMode(int)>
        //   80  157:istore          9
        //   81  159:iload_2         
        //   82  160:invokestatic    #133 <Method int android.view.View$MeasureSpec.getMode(int)>
        //   83  163:istore          10
        //   84  165:iload_1         
        //   85  166:invokestatic    #136 <Method int android.view.View$MeasureSpec.getSize(int)>
        //   86  169:istore          11
        //   87  171:iload_2         
        //   88  172:invokestatic    #136 <Method int android.view.View$MeasureSpec.getSize(int)>
        //   89  175:istore          12
        //   90  177:iload           9
        //   91  179:lookupswitch    2: default 204
        //                       -2147483648: 250
        //                       1073741824: 262
        //   92  204:iload           10
        //   93  206:lookupswitch    2: default 232
        //                       -2147483648: 269
        //                       1073741824: 281
        //   94  232:aload_0         
        //   95  233:iload           7
        //   96  235:iload           8
        //   97  237:invokevirtual   #139 <Method void setMeasuredDimension(int, int)>
        //   98  240:return          
        //   99  241:aload_0         
        //  100  242:getfield        #53  <Field int mUpWidth>
        //  101  245:istore          4
        //  102  247:goto            59
        //  103  250:iload           7
        //  104  252:iload           11
        //  105  254:invokestatic    #142 <Method int Math.min(int, int)>
        //  106  257:istore          7
        //  107  259:goto            204
        //  108  262:iload           11
        //  109  264:istore          7
        //  110  266:goto            204
        //  111  269:iload           8
        //  112  271:iload           12
        //  113  273:invokestatic    #142 <Method int Math.min(int, int)>
        //  114  276:istore          8
        //  115  278:goto            232
        //  116  281:iload           12
        //  117  283:istore          8
        //  118  285:goto            232
        }

        public void setIcon(Drawable drawable)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #79  <Field ImageView mIconView>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #147 <Method void ImageView.setImageDrawable(Drawable)>
        //    4    8:return          
        }

        public void setUp(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #46  <Field ImageView mUpView>
        //    2    4:astore_2        
        //    3    5:iload_1         
        //    4    6:ifeq            17
        //    5    9:iconst_0        
        //    6   10:istore_3        
        //    7   11:aload_2         
        //    8   12:iload_3         
        //    9   13:invokevirtual   #152 <Method void ImageView.setVisibility(int)>
        //   10   16:return          
        //   11   17:bipush          8
        //   12   19:istore_3        
        //   13   20:goto            11
        }

        public void setUpIndicator(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #59  <Field int mUpIndicatorRes>
        //    3    5:aload_0         
        //    4    6:getfield        #46  <Field ImageView mUpView>
        //    5    9:astore_2        
        //    6   10:iload_1         
        //    7   11:ifeq            29
        //    8   14:aload_0         
        //    9   15:invokevirtual   #156 <Method Resources getResources()>
        //   10   18:iload_1         
        //   11   19:invokevirtual   #161 <Method Drawable Resources.getDrawable(int)>
        //   12   22:astore_3        
        //   13   23:aload_2         
        //   14   24:aload_3         
        //   15   25:invokevirtual   #147 <Method void ImageView.setImageDrawable(Drawable)>
        //   16   28:return          
        //   17   29:aconst_null     
        //   18   30:astore_3        
        //   19   31:goto            23
        }

        public void setUpIndicator(Drawable drawable)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #46  <Field ImageView mUpView>
        //    2    4:astore_2        
        //    3    5:aload_1         
        //    4    6:ifnull          20
        //    5    9:aload_2         
        //    6   10:aload_1         
        //    7   11:invokevirtual   #147 <Method void ImageView.setImageDrawable(Drawable)>
        //    8   14:aload_0         
        //    9   15:iconst_0        
        //   10   16:putfield        #59  <Field int mUpIndicatorRes>
        //   11   19:return          
        //   12   20:aload_0         
        //   13   21:getfield        #85  <Field Drawable mDefaultUpIndicator>
        //   14   24:astore_1        
        //   15   25:goto            9
        }

        private Drawable mDefaultUpIndicator;
        private ImageView mIconView;
        private int mUpIndicatorRes;
        private ImageView mUpView;
        private int mUpWidth;
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #15  <Class ActionBarView$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #18  <Method void ActionBarView$SavedState$1()>
        //    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #23  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #29  <Method int Parcel.readInt()>
        //    6   10:putfield        #31  <Field int expandedMenuItemId>
        //    7   13:aload_1         
        //    8   14:invokevirtual   #29  <Method int Parcel.readInt()>
        //    9   17:ifeq            28
        //   10   20:iconst_1        
        //   11   21:istore_2        
        //   12   22:aload_0         
        //   13   23:iload_2         
        //   14   24:putfield        #33  <Field boolean isOverflowOpen>
        //   15   27:return          
        //   16   28:iconst_0        
        //   17   29:istore_2        
        //   18   30:goto            22
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #35  <Method void ActionBarView$SavedState(Parcel)>
        //    3    5:return          
        }

        SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #38  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #42  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #31  <Field int expandedMenuItemId>
        //    7   11:invokevirtual   #46  <Method void Parcel.writeInt(int)>
        //    8   14:aload_0         
        //    9   15:getfield        #33  <Field boolean isOverflowOpen>
        //   10   18:ifeq            29
        //   11   21:iconst_1        
        //   12   22:istore_3        
        //   13   23:aload_1         
        //   14   24:iload_3         
        //   15   25:invokevirtual   #46  <Method void Parcel.writeInt(int)>
        //   16   28:return          
        //   17   29:iconst_0        
        //   18   30:istore_3        
        //   19   31:goto            23
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int expandedMenuItemId;
        boolean isOverflowOpen;
    }


    public ActionBarView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #83  <Method void AbsActionBarView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_m1       
    //    6    8:putfield        #85  <Field int mDisplayOptions>
    //    7   11:aload_0         
    //    8   12:new             #87  <Class ActionBarView$1>
    //    9   15:dup             
    //   10   16:aload_0         
    //   11   17:invokespecial   #90  <Method void ActionBarView$1(ActionBarView)>
    //   12   20:putfield        #92  <Field AdapterViewICS$OnItemSelectedListener mNavItemSelectedListener>
    //   13   23:aload_0         
    //   14   24:new             #94  <Class ActionBarView$2>
    //   15   27:dup             
    //   16   28:aload_0         
    //   17   29:invokespecial   #95  <Method void ActionBarView$2(ActionBarView)>
    //   18   32:putfield        #97  <Field android.view.View$OnClickListener mExpandedActionViewUpListener>
    //   19   35:aload_0         
    //   20   36:new             #99  <Class ActionBarView$3>
    //   21   39:dup             
    //   22   40:aload_0         
    //   23   41:invokespecial   #100 <Method void ActionBarView$3(ActionBarView)>
    //   24   44:putfield        #102 <Field android.view.View$OnClickListener mUpClickListener>
    //   25   47:aload_0         
    //   26   48:aload_1         
    //   27   49:putfield        #104 <Field Context mContext>
    //   28   52:aload_0         
    //   29   53:iconst_0        
    //   30   54:invokevirtual   #108 <Method void setBackgroundResource(int)>
    //   31   57:aload_1         
    //   32   58:aload_2         
    //   33   59:getstatic       #114 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
    //   34   62:getstatic       #119 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
    //   35   65:iconst_0        
    //   36   66:invokevirtual   #125 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   37   69:astore_3        
    //   38   70:aload_1         
    //   39   71:invokevirtual   #129 <Method ApplicationInfo Context.getApplicationInfo()>
    //   40   74:astore          4
    //   41   76:aload_1         
    //   42   77:invokevirtual   #133 <Method PackageManager Context.getPackageManager()>
    //   43   80:astore          5
    //   44   82:aload_0         
    //   45   83:aload_3         
    //   46   84:iconst_2        
    //   47   85:iconst_0        
    //   48   86:invokevirtual   #139 <Method int TypedArray.getInt(int, int)>
    //   49   89:putfield        #141 <Field int mNavigationMode>
    //   50   92:aload_0         
    //   51   93:aload_3         
    //   52   94:iconst_0        
    //   53   95:invokevirtual   #145 <Method CharSequence TypedArray.getText(int)>
    //   54   98:putfield        #147 <Field CharSequence mTitle>
    //   55  101:aload_0         
    //   56  102:aload_3         
    //   57  103:iconst_4        
    //   58  104:invokevirtual   #145 <Method CharSequence TypedArray.getText(int)>
    //   59  107:putfield        #149 <Field CharSequence mSubtitle>
    //   60  110:aload_0         
    //   61  111:aload_3         
    //   62  112:bipush          8
    //   63  114:invokevirtual   #153 <Method Drawable TypedArray.getDrawable(int)>
    //   64  117:putfield        #155 <Field Drawable mLogo>
    //   65  120:aload_0         
    //   66  121:getfield        #155 <Field Drawable mLogo>
    //   67  124:ifnonnull       176
    //   68  127:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
    //   69  130:bipush          9
    //   70  132:icmplt          176
    //   71  135:aload_1         
    //   72  136:instanceof      #162 <Class Activity>
    //   73  139:ifeq            158
    // try 142 158 handler(s) 501
    //   74  142:aload_0         
    //   75  143:aload           5
    //   76  145:aload_1         
    //   77  146:checkcast       #162 <Class Activity>
    //   78  149:invokevirtual   #166 <Method android.content.ComponentName Activity.getComponentName()>
    //   79  152:invokevirtual   #172 <Method Drawable PackageManager.getActivityLogo(android.content.ComponentName)>
    //   80  155:putfield        #155 <Field Drawable mLogo>
    //   81  158:aload_0         
    //   82  159:getfield        #155 <Field Drawable mLogo>
    //   83  162:ifnonnull       176
    //   84  165:aload_0         
    //   85  166:aload           4
    //   86  168:aload           5
    //   87  170:invokevirtual   #178 <Method Drawable ApplicationInfo.loadLogo(PackageManager)>
    //   88  173:putfield        #155 <Field Drawable mLogo>
    //   89  176:aload_0         
    //   90  177:aload_3         
    //   91  178:bipush          7
    //   92  180:invokevirtual   #153 <Method Drawable TypedArray.getDrawable(int)>
    //   93  183:putfield        #180 <Field Drawable mIcon>
    //   94  186:aload_0         
    //   95  187:getfield        #180 <Field Drawable mIcon>
    //   96  190:ifnonnull       234
    //   97  193:aload_1         
    //   98  194:instanceof      #162 <Class Activity>
    //   99  197:ifeq            216
    // try 200 216 handler(s) 517
    //  100  200:aload_0         
    //  101  201:aload           5
    //  102  203:aload_1         
    //  103  204:checkcast       #162 <Class Activity>
    //  104  207:invokevirtual   #166 <Method android.content.ComponentName Activity.getComponentName()>
    //  105  210:invokevirtual   #183 <Method Drawable PackageManager.getActivityIcon(android.content.ComponentName)>
    //  106  213:putfield        #180 <Field Drawable mIcon>
    //  107  216:aload_0         
    //  108  217:getfield        #180 <Field Drawable mIcon>
    //  109  220:ifnonnull       234
    //  110  223:aload_0         
    //  111  224:aload           4
    //  112  226:aload           5
    //  113  228:invokevirtual   #186 <Method Drawable ApplicationInfo.loadIcon(PackageManager)>
    //  114  231:putfield        #180 <Field Drawable mIcon>
    //  115  234:aload_1         
    //  116  235:invokestatic    #192 <Method LayoutInflater LayoutInflater.from(Context)>
    //  117  238:astore          6
    //  118  240:aload_3         
    //  119  241:bipush          14
    //  120  243:getstatic       #197 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_home>
    //  121  246:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  122  249:istore          7
    //  123  251:aload_0         
    //  124  252:aload           6
    //  125  254:iload           7
    //  126  256:aload_0         
    //  127  257:iconst_0        
    //  128  258:invokevirtual   #204 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //  129  261:checkcast       #206 <Class ActionBarView$HomeView>
    //  130  264:putfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  131  267:aload_0         
    //  132  268:aload           6
    //  133  270:iload           7
    //  134  272:aload_0         
    //  135  273:iconst_0        
    //  136  274:invokevirtual   #204 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //  137  277:checkcast       #206 <Class ActionBarView$HomeView>
    //  138  280:putfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //  139  283:aload_0         
    //  140  284:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //  141  287:iconst_1        
    //  142  288:invokevirtual   #214 <Method void ActionBarView$HomeView.setUp(boolean)>
    //  143  291:aload_0         
    //  144  292:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //  145  295:aload_0         
    //  146  296:getfield        #97  <Field android.view.View$OnClickListener mExpandedActionViewUpListener>
    //  147  299:invokevirtual   #218 <Method void ActionBarView$HomeView.setOnClickListener(android.view.View$OnClickListener)>
    //  148  302:aload_0         
    //  149  303:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //  150  306:aload_0         
    //  151  307:invokevirtual   #222 <Method Resources getResources()>
    //  152  310:getstatic       #227 <Field int android.support.v7.appcompat.R$string.abc_action_bar_up_description>
    //  153  313:invokevirtual   #230 <Method CharSequence Resources.getText(int)>
    //  154  316:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //  155  319:aload_0         
    //  156  320:aload_3         
    //  157  321:iconst_5        
    //  158  322:iconst_0        
    //  159  323:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  160  326:putfield        #236 <Field int mTitleStyleRes>
    //  161  329:aload_0         
    //  162  330:aload_3         
    //  163  331:bipush          6
    //  164  333:iconst_0        
    //  165  334:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  166  337:putfield        #238 <Field int mSubtitleStyleRes>
    //  167  340:aload_0         
    //  168  341:aload_3         
    //  169  342:bipush          15
    //  170  344:iconst_0        
    //  171  345:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  172  348:putfield        #240 <Field int mProgressStyle>
    //  173  351:aload_0         
    //  174  352:aload_3         
    //  175  353:bipush          16
    //  176  355:iconst_0        
    //  177  356:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  178  359:putfield        #242 <Field int mIndeterminateProgressStyle>
    //  179  362:aload_0         
    //  180  363:aload_3         
    //  181  364:bipush          17
    //  182  366:iconst_0        
    //  183  367:invokevirtual   #245 <Method int TypedArray.getDimensionPixelOffset(int, int)>
    //  184  370:putfield        #247 <Field int mProgressBarPadding>
    //  185  373:aload_0         
    //  186  374:aload_3         
    //  187  375:bipush          18
    //  188  377:iconst_0        
    //  189  378:invokevirtual   #245 <Method int TypedArray.getDimensionPixelOffset(int, int)>
    //  190  381:putfield        #249 <Field int mItemPadding>
    //  191  384:aload_0         
    //  192  385:aload_3         
    //  193  386:iconst_3        
    //  194  387:iconst_0        
    //  195  388:invokevirtual   #139 <Method int TypedArray.getInt(int, int)>
    //  196  391:invokevirtual   #252 <Method void setDisplayOptions(int)>
    //  197  394:aload_3         
    //  198  395:bipush          13
    //  199  397:iconst_0        
    //  200  398:invokevirtual   #200 <Method int TypedArray.getResourceId(int, int)>
    //  201  401:istore          8
    //  202  403:iload           8
    //  203  405:ifeq            437
    //  204  408:aload_0         
    //  205  409:aload           6
    //  206  411:iload           8
    //  207  413:aload_0         
    //  208  414:iconst_0        
    //  209  415:invokevirtual   #204 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //  210  418:putfield        #254 <Field View mCustomNavView>
    //  211  421:aload_0         
    //  212  422:iconst_0        
    //  213  423:putfield        #141 <Field int mNavigationMode>
    //  214  426:aload_0         
    //  215  427:bipush          16
    //  216  429:aload_0         
    //  217  430:getfield        #85  <Field int mDisplayOptions>
    //  218  433:ior             
    //  219  434:invokevirtual   #252 <Method void setDisplayOptions(int)>
    //  220  437:aload_0         
    //  221  438:aload_3         
    //  222  439:iconst_1        
    //  223  440:iconst_0        
    //  224  441:invokevirtual   #257 <Method int TypedArray.getLayoutDimension(int, int)>
    //  225  444:putfield        #260 <Field int mContentHeight>
    //  226  447:aload_3         
    //  227  448:invokevirtual   #264 <Method void TypedArray.recycle()>
    //  228  451:aload_0         
    //  229  452:new             #266 <Class ActionMenuItem>
    //  230  455:dup             
    //  231  456:aload_1         
    //  232  457:iconst_0        
    //  233  458:ldc2            #267 <Int 0x102002c>
    //  234  461:iconst_0        
    //  235  462:iconst_0        
    //  236  463:aload_0         
    //  237  464:getfield        #147 <Field CharSequence mTitle>
    //  238  467:invokespecial   #270 <Method void ActionMenuItem(Context, int, int, int, int, CharSequence)>
    //  239  470:putfield        #272 <Field ActionMenuItem mLogoNavItem>
    //  240  473:aload_0         
    //  241  474:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  242  477:aload_0         
    //  243  478:getfield        #102 <Field android.view.View$OnClickListener mUpClickListener>
    //  244  481:invokevirtual   #218 <Method void ActionBarView$HomeView.setOnClickListener(android.view.View$OnClickListener)>
    //  245  484:aload_0         
    //  246  485:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  247  488:iconst_1        
    //  248  489:invokevirtual   #275 <Method void ActionBarView$HomeView.setClickable(boolean)>
    //  249  492:aload_0         
    //  250  493:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  251  496:iconst_1        
    //  252  497:invokevirtual   #278 <Method void ActionBarView$HomeView.setFocusable(boolean)>
    //  253  500:return          
    // catch android.content.pm.PackageManager.NameNotFoundException
    //  254  501:astore          11
    //  255  503:ldc1            #15  <String "ActionBarView">
    //  256  505:ldc2            #280 <String "Activity component name not found!">
    //  257  508:aload           11
    //  258  510:invokestatic    #286 <Method int Log.e(String, String, Throwable)>
    //  259  513:pop             
    //  260  514:goto            158
    // catch android.content.pm.PackageManager.NameNotFoundException
    //  261  517:astore          9
    //  262  519:ldc1            #15  <String "ActionBarView">
    //  263  521:ldc2            #280 <String "Activity component name not found!">
    //  264  524:aload           9
    //  265  526:invokestatic    #286 <Method int Log.e(String, String, Throwable)>
    //  266  529:pop             
    //  267  530:goto            216
    }

    static android.support.v7.app.ActionBar.OnNavigationListener access$000(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #290 <Field android.support.v7.app.ActionBar$OnNavigationListener mCallback>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #290 <Field android.support.v7.app.ActionBar$OnNavigationListener mCallback>
    //    5    4:areturn         
    }

    static ExpandedActionViewMenuPresenter access$100(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    5    4:areturn         
    }

    static SpinnerICS access$1000(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field SpinnerICS mSpinner>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #298 <Field SpinnerICS mSpinner>
    //    5    4:areturn         
    }

    static View access$1100(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field View mCustomNavView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #254 <Field View mCustomNavView>
    //    5    4:areturn         
    }

    static int access$1200(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mDisplayOptions>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #85  <Field int mDisplayOptions>
    //    5    4:ireturn         
    }

    static void access$1300(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #306 <Method void initTitle()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #306 <Method void initTitle()>
    //    5    4:return          
    }

    static int access$1400(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #141 <Field int mNavigationMode>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #141 <Field int mNavigationMode>
    //    5    4:ireturn         
    }

    static ActionMenuItem access$200(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #272 <Field ActionMenuItem mLogoNavItem>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #272 <Field ActionMenuItem mLogoNavItem>
    //    5    4:areturn         
    }

    static Drawable access$500(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #180 <Field Drawable mIcon>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #180 <Field Drawable mIcon>
    //    5    4:areturn         
    }

    static HomeView access$600(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //    5    4:areturn         
    }

    static HomeView access$700(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    5    4:areturn         
    }

    static LinearLayout access$800(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #318 <Field LinearLayout mTitleLayout>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #318 <Field LinearLayout mTitleLayout>
    //    5    4:areturn         
    }

    static ScrollingTabContainerView access$900(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //    5    4:areturn         
    }

    private void configPresenters(MenuBuilder menubuilder)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          37
    //    2    4:aload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //    5    9:invokevirtual   #334 <Method void MenuBuilder.addMenuPresenter(MenuPresenter)>
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    9   17:invokevirtual   #334 <Method void MenuBuilder.addMenuPresenter(MenuPresenter)>
    //   10   20:aload_0         
    //   11   21:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   12   24:iconst_1        
    //   13   25:invokevirtual   #339 <Method void ActionMenuPresenter.updateMenuView(boolean)>
    //   14   28:aload_0         
    //   15   29:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   16   32:iconst_1        
    //   17   33:invokevirtual   #342 <Method void ActionBarView$ExpandedActionViewMenuPresenter.updateMenuView(boolean)>
    //   18   36:return          
    //   19   37:aload_0         
    //   20   38:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   21   41:aload_0         
    //   22   42:getfield        #104 <Field Context mContext>
    //   23   45:aconst_null     
    //   24   46:invokevirtual   #346 <Method void ActionMenuPresenter.initForMenu(Context, MenuBuilder)>
    //   25   49:aload_0         
    //   26   50:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   27   53:aload_0         
    //   28   54:getfield        #104 <Field Context mContext>
    //   29   57:aconst_null     
    //   30   58:invokevirtual   #347 <Method void ActionBarView$ExpandedActionViewMenuPresenter.initForMenu(Context, MenuBuilder)>
    //   31   61:goto            20
    }

    private void initTitle()
    {
    //    0    0:iconst_1        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #318 <Field LinearLayout mTitleLayout>
    //    4    6:ifnonnull       244
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:invokevirtual   #351 <Method Context getContext()>
    //    8   14:invokestatic    #192 <Method LayoutInflater LayoutInflater.from(Context)>
    //    9   17:getstatic       #354 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
    //   10   20:aload_0         
    //   11   21:iconst_0        
    //   12   22:invokevirtual   #204 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   13   25:checkcast       #356 <Class LinearLayout>
    //   14   28:putfield        #318 <Field LinearLayout mTitleLayout>
    //   15   31:aload_0         
    //   16   32:aload_0         
    //   17   33:getfield        #318 <Field LinearLayout mTitleLayout>
    //   18   36:getstatic       #361 <Field int android.support.v7.appcompat.R$id.action_bar_title>
    //   19   39:invokevirtual   #365 <Method View LinearLayout.findViewById(int)>
    //   20   42:checkcast       #367 <Class TextView>
    //   21   45:putfield        #369 <Field TextView mTitleView>
    //   22   48:aload_0         
    //   23   49:aload_0         
    //   24   50:getfield        #318 <Field LinearLayout mTitleLayout>
    //   25   53:getstatic       #372 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
    //   26   56:invokevirtual   #365 <Method View LinearLayout.findViewById(int)>
    //   27   59:checkcast       #367 <Class TextView>
    //   28   62:putfield        #374 <Field TextView mSubtitleView>
    //   29   65:aload_0         
    //   30   66:aload_0         
    //   31   67:getfield        #318 <Field LinearLayout mTitleLayout>
    //   32   70:getstatic       #377 <Field int android.support.v7.appcompat.R$id.up>
    //   33   73:invokevirtual   #365 <Method View LinearLayout.findViewById(int)>
    //   34   76:putfield        #379 <Field View mTitleUpView>
    //   35   79:aload_0         
    //   36   80:getfield        #318 <Field LinearLayout mTitleLayout>
    //   37   83:aload_0         
    //   38   84:getfield        #102 <Field android.view.View$OnClickListener mUpClickListener>
    //   39   87:invokevirtual   #380 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
    //   40   90:aload_0         
    //   41   91:getfield        #236 <Field int mTitleStyleRes>
    //   42   94:ifeq            112
    //   43   97:aload_0         
    //   44   98:getfield        #369 <Field TextView mTitleView>
    //   45  101:aload_0         
    //   46  102:getfield        #104 <Field Context mContext>
    //   47  105:aload_0         
    //   48  106:getfield        #236 <Field int mTitleStyleRes>
    //   49  109:invokevirtual   #384 <Method void TextView.setTextAppearance(Context, int)>
    //   50  112:aload_0         
    //   51  113:getfield        #147 <Field CharSequence mTitle>
    //   52  116:ifnull          130
    //   53  119:aload_0         
    //   54  120:getfield        #369 <Field TextView mTitleView>
    //   55  123:aload_0         
    //   56  124:getfield        #147 <Field CharSequence mTitle>
    //   57  127:invokevirtual   #387 <Method void TextView.setText(CharSequence)>
    //   58  130:aload_0         
    //   59  131:getfield        #238 <Field int mSubtitleStyleRes>
    //   60  134:ifeq            152
    //   61  137:aload_0         
    //   62  138:getfield        #374 <Field TextView mSubtitleView>
    //   63  141:aload_0         
    //   64  142:getfield        #104 <Field Context mContext>
    //   65  145:aload_0         
    //   66  146:getfield        #238 <Field int mSubtitleStyleRes>
    //   67  149:invokevirtual   #384 <Method void TextView.setTextAppearance(Context, int)>
    //   68  152:aload_0         
    //   69  153:getfield        #149 <Field CharSequence mSubtitle>
    //   70  156:ifnull          178
    //   71  159:aload_0         
    //   72  160:getfield        #374 <Field TextView mSubtitleView>
    //   73  163:aload_0         
    //   74  164:getfield        #149 <Field CharSequence mSubtitle>
    //   75  167:invokevirtual   #387 <Method void TextView.setText(CharSequence)>
    //   76  170:aload_0         
    //   77  171:getfield        #374 <Field TextView mSubtitleView>
    //   78  174:iconst_0        
    //   79  175:invokevirtual   #390 <Method void TextView.setVisibility(int)>
    //   80  178:iconst_4        
    //   81  179:aload_0         
    //   82  180:getfield        #85  <Field int mDisplayOptions>
    //   83  183:iand            
    //   84  184:ifeq            289
    //   85  187:iload_1         
    //   86  188:istore_2        
    //   87  189:iconst_2        
    //   88  190:aload_0         
    //   89  191:getfield        #85  <Field int mDisplayOptions>
    //   90  194:iand            
    //   91  195:ifeq            294
    //   92  198:iload_1         
    //   93  199:istore_3        
    //   94  200:aload_0         
    //   95  201:getfield        #379 <Field View mTitleUpView>
    //   96  204:astore          4
    //   97  206:iload_3         
    //   98  207:ifne            305
    //   99  210:iload_2         
    //  100  211:ifeq            299
    //  101  214:iconst_0        
    //  102  215:istore          5
    //  103  217:aload           4
    //  104  219:iload           5
    //  105  221:invokevirtual   #393 <Method void View.setVisibility(int)>
    //  106  224:aload_0         
    //  107  225:getfield        #318 <Field LinearLayout mTitleLayout>
    //  108  228:astore          6
    //  109  230:iload_2         
    //  110  231:ifeq            312
    //  111  234:iload_3         
    //  112  235:ifne            312
    //  113  238:aload           6
    //  114  240:iload_1         
    //  115  241:invokevirtual   #396 <Method void LinearLayout.setEnabled(boolean)>
    //  116  244:aload_0         
    //  117  245:aload_0         
    //  118  246:getfield        #318 <Field LinearLayout mTitleLayout>
    //  119  249:invokevirtual   #400 <Method void addView(View)>
    //  120  252:aload_0         
    //  121  253:getfield        #402 <Field View mExpandedActionView>
    //  122  256:ifnonnull       279
    //  123  259:aload_0         
    //  124  260:getfield        #147 <Field CharSequence mTitle>
    //  125  263:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //  126  266:ifeq            288
    //  127  269:aload_0         
    //  128  270:getfield        #149 <Field CharSequence mSubtitle>
    //  129  273:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //  130  276:ifeq            288
    //  131  279:aload_0         
    //  132  280:getfield        #318 <Field LinearLayout mTitleLayout>
    //  133  283:bipush          8
    //  134  285:invokevirtual   #409 <Method void LinearLayout.setVisibility(int)>
    //  135  288:return          
    //  136  289:iconst_0        
    //  137  290:istore_2        
    //  138  291:goto            189
    //  139  294:iconst_0        
    //  140  295:istore_3        
    //  141  296:goto            200
    //  142  299:iconst_4        
    //  143  300:istore          5
    //  144  302:goto            217
    //  145  305:bipush          8
    //  146  307:istore          5
    //  147  309:goto            217
    //  148  312:iconst_0        
    //  149  313:istore_1        
    //  150  314:goto            238
    }

    private void setTitleImpl(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #147 <Field CharSequence mTitle>
    //    3    5:aload_0         
    //    4    6:getfield        #369 <Field TextView mTitleView>
    //    5    9:ifnull          79
    //    6   12:aload_0         
    //    7   13:getfield        #369 <Field TextView mTitleView>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #387 <Method void TextView.setText(CharSequence)>
    //   10   20:aload_0         
    //   11   21:getfield        #402 <Field View mExpandedActionView>
    //   12   24:ifnonnull       96
    //   13   27:bipush          8
    //   14   29:aload_0         
    //   15   30:getfield        #85  <Field int mDisplayOptions>
    //   16   33:iand            
    //   17   34:ifeq            96
    //   18   37:aload_0         
    //   19   38:getfield        #147 <Field CharSequence mTitle>
    //   20   41:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   21   44:ifeq            57
    //   22   47:aload_0         
    //   23   48:getfield        #149 <Field CharSequence mSubtitle>
    //   24   51:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   25   54:ifne            96
    //   26   57:iconst_1        
    //   27   58:istore_3        
    //   28   59:aload_0         
    //   29   60:getfield        #318 <Field LinearLayout mTitleLayout>
    //   30   63:astore          4
    //   31   65:iconst_0        
    //   32   66:istore          5
    //   33   68:iload_3         
    //   34   69:ifeq            101
    //   35   72:aload           4
    //   36   74:iload           5
    //   37   76:invokevirtual   #409 <Method void LinearLayout.setVisibility(int)>
    //   38   79:aload_0         
    //   39   80:getfield        #272 <Field ActionMenuItem mLogoNavItem>
    //   40   83:ifnull          95
    //   41   86:aload_0         
    //   42   87:getfield        #272 <Field ActionMenuItem mLogoNavItem>
    //   43   90:aload_1         
    //   44   91:invokevirtual   #414 <Method android.view.MenuItem ActionMenuItem.setTitle(CharSequence)>
    //   45   94:pop             
    //   46   95:return          
    //   47   96:iconst_0        
    //   48   97:istore_3        
    //   49   98:goto            59
    //   50  101:bipush          8
    //   51  103:istore          5
    //   52  105:goto            72
    }

    public volatile void animateToVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #417 <Method void AbsActionBarView.animateToVisibility(int)>
    //    3    5:return          
    }

    public void collapseActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    2    4:ifnonnull       19
    //    3    7:aconst_null     
    //    4    8:astore_1        
    //    5    9:aload_1         
    //    6   10:ifnull          18
    //    7   13:aload_1         
    //    8   14:invokevirtual   #423 <Method boolean MenuItemImpl.collapseActionView()>
    //    9   17:pop             
    //   10   18:return          
    //   11   19:aload_0         
    //   12   20:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   13   23:getfield        #427 <Field MenuItemImpl ActionBarView$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
    //   14   26:astore_1        
    //   15   27:goto            9
    }

    public volatile void dismissPopupMenus()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #430 <Method void AbsActionBarView.dismissPopupMenus()>
    //    2    4:return          
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //    1    3:dup             
    //    2    4:bipush          19
    //    3    6:invokespecial   #436 <Method void android.support.v7.app.ActionBar$LayoutParams(int)>
    //    4    9:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #351 <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #439 <Method void android.support.v7.app.ActionBar$LayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       9
    //    2    4:aload_0         
    //    3    5:invokevirtual   #442 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
    //    4    8:astore_1        
    //    5    9:aload_1         
    //    6   10:areturn         
    }

    public volatile int getAnimatedVisibility()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #446 <Method int AbsActionBarView.getAnimatedVisibility()>
    //    2    4:ireturn         
    }

    public volatile int getContentHeight()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #449 <Method int AbsActionBarView.getContentHeight()>
    //    2    4:ireturn         
    }

    public View getCustomNavigationView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field View mCustomNavView>
    //    2    4:areturn         
    }

    public int getDisplayOptions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mDisplayOptions>
    //    2    4:ireturn         
    }

    public SpinnerAdapter getDropdownAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #456 <Field SpinnerAdapter mSpinnerAdapter>
    //    2    4:areturn         
    }

    public int getDropdownSelectedPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field SpinnerICS mSpinner>
    //    2    4:invokevirtual   #462 <Method int SpinnerICS.getSelectedItemPosition()>
    //    3    7:ireturn         
    }

    public int getNavigationMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #141 <Field int mNavigationMode>
    //    2    4:ireturn         
    }

    public CharSequence getSubtitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #149 <Field CharSequence mSubtitle>
    //    2    4:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #147 <Field CharSequence mTitle>
    //    2    4:areturn         
    }

    public boolean hasEmbeddedTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #469 <Field boolean mIncludeTabs>
    //    2    4:ireturn         
    }

    public boolean hasExpandedActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    5   11:getfield        #427 <Field MenuItemImpl ActionBarView$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
    //    6   14:ifnull          19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    public volatile boolean hideOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #473 <Method boolean AbsActionBarView.hideOverflowMenu()>
    //    2    4:ireturn         
    }

    public void initIndeterminateProgress()
    {
    //    0    0:aload_0         
    //    1    1:new             #476 <Class ProgressBarICS>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:getfield        #104 <Field Context mContext>
    //    5    9:aconst_null     
    //    6   10:iconst_0        
    //    7   11:aload_0         
    //    8   12:getfield        #242 <Field int mIndeterminateProgressStyle>
    //    9   15:invokespecial   #479 <Method void ProgressBarICS(Context, AttributeSet, int, int)>
    //   10   18:putfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //   11   21:aload_0         
    //   12   22:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //   13   25:getstatic       #484 <Field int android.support.v7.appcompat.R$id.progress_circular>
    //   14   28:invokevirtual   #487 <Method void ProgressBarICS.setId(int)>
    //   15   31:aload_0         
    //   16   32:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //   17   35:bipush          8
    //   18   37:invokevirtual   #488 <Method void ProgressBarICS.setVisibility(int)>
    //   19   40:aload_0         
    //   20   41:aload_0         
    //   21   42:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //   22   45:invokevirtual   #400 <Method void addView(View)>
    //   23   48:return          
    }

    public void initProgress()
    {
    //    0    0:aload_0         
    //    1    1:new             #476 <Class ProgressBarICS>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:getfield        #104 <Field Context mContext>
    //    5    9:aconst_null     
    //    6   10:iconst_0        
    //    7   11:aload_0         
    //    8   12:getfield        #240 <Field int mProgressStyle>
    //    9   15:invokespecial   #479 <Method void ProgressBarICS(Context, AttributeSet, int, int)>
    //   10   18:putfield        #491 <Field ProgressBarICS mProgressView>
    //   11   21:aload_0         
    //   12   22:getfield        #491 <Field ProgressBarICS mProgressView>
    //   13   25:getstatic       #494 <Field int android.support.v7.appcompat.R$id.progress_horizontal>
    //   14   28:invokevirtual   #487 <Method void ProgressBarICS.setId(int)>
    //   15   31:aload_0         
    //   16   32:getfield        #491 <Field ProgressBarICS mProgressView>
    //   17   35:sipush          10000
    //   18   38:invokevirtual   #497 <Method void ProgressBarICS.setMax(int)>
    //   19   41:aload_0         
    //   20   42:getfield        #491 <Field ProgressBarICS mProgressView>
    //   21   45:bipush          8
    //   22   47:invokevirtual   #488 <Method void ProgressBarICS.setVisibility(int)>
    //   23   50:aload_0         
    //   24   51:aload_0         
    //   25   52:getfield        #491 <Field ProgressBarICS mProgressView>
    //   26   55:invokevirtual   #400 <Method void addView(View)>
    //   27   58:return          
    }

    public boolean isCollapsed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #500 <Field boolean mIsCollapsed>
    //    2    4:ireturn         
    }

    public volatile boolean isOverflowMenuShowing()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #503 <Method boolean AbsActionBarView.isOverflowMenuShowing()>
    //    2    4:ireturn         
    }

    public volatile boolean isOverflowReserved()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #506 <Method boolean AbsActionBarView.isOverflowReserved()>
    //    2    4:ireturn         
    }

    public boolean isSplitActionBar()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #510 <Field boolean mSplitActionBar>
    //    2    4:ireturn         
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #514 <Method void AbsActionBarView.onConfigurationChanged(Configuration)>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #369 <Field TextView mTitleView>
    //    6   10:aload_0         
    //    7   11:aconst_null     
    //    8   12:putfield        #374 <Field TextView mSubtitleView>
    //    9   15:aload_0         
    //   10   16:aconst_null     
    //   11   17:putfield        #379 <Field View mTitleUpView>
    //   12   20:aload_0         
    //   13   21:getfield        #318 <Field LinearLayout mTitleLayout>
    //   14   24:ifnull          46
    //   15   27:aload_0         
    //   16   28:getfield        #318 <Field LinearLayout mTitleLayout>
    //   17   31:invokevirtual   #518 <Method android.view.ViewParent LinearLayout.getParent()>
    //   18   34:aload_0         
    //   19   35:if_acmpne       46
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #318 <Field LinearLayout mTitleLayout>
    //   23   43:invokevirtual   #521 <Method void removeView(View)>
    //   24   46:aload_0         
    //   25   47:aconst_null     
    //   26   48:putfield        #318 <Field LinearLayout mTitleLayout>
    //   27   51:bipush          8
    //   28   53:aload_0         
    //   29   54:getfield        #85  <Field int mDisplayOptions>
    //   30   57:iand            
    //   31   58:ifeq            65
    //   32   61:aload_0         
    //   33   62:invokespecial   #306 <Method void initTitle()>
    //   34   65:aload_0         
    //   35   66:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   36   69:ifnull          110
    //   37   72:aload_0         
    //   38   73:getfield        #469 <Field boolean mIncludeTabs>
    //   39   76:ifeq            110
    //   40   79:aload_0         
    //   41   80:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   42   83:invokevirtual   #526 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
    //   43   86:astore_2        
    //   44   87:aload_2         
    //   45   88:ifnull          102
    //   46   91:aload_2         
    //   47   92:bipush          -2
    //   48   94:putfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //   49   97:aload_2         
    //   50   98:iconst_m1       
    //   51   99:putfield        #534 <Field int android.view.ViewGroup$LayoutParams.height>
    //   52  102:aload_0         
    //   53  103:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   54  106:iconst_1        
    //   55  107:invokevirtual   #537 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
    //   56  110:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #540 <Method void AbsActionBarView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #542 <Field Runnable mTabSelector>
    //    5    9:invokevirtual   #546 <Method boolean removeCallbacks(Runnable)>
    //    6   12:pop             
    //    7   13:aload_0         
    //    8   14:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //    9   17:ifnull          36
    //   10   20:aload_0         
    //   11   21:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   12   24:invokevirtual   #547 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
    //   13   27:pop             
    //   14   28:aload_0         
    //   15   29:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   16   32:invokevirtual   #550 <Method boolean ActionMenuPresenter.hideSubMenus()>
    //   17   35:pop             
    //   18   36:return          
    }

    protected void onFinishInflate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #553 <Method void AbsActionBarView.onFinishInflate()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    5    9:invokevirtual   #400 <Method void addView(View)>
    //    6   12:aload_0         
    //    7   13:getfield        #254 <Field View mCustomNavView>
    //    8   16:ifnull          68
    //    9   19:bipush          16
    //   10   21:aload_0         
    //   11   22:getfield        #85  <Field int mDisplayOptions>
    //   12   25:iand            
    //   13   26:ifeq            68
    //   14   29:aload_0         
    //   15   30:getfield        #254 <Field View mCustomNavView>
    //   16   33:invokevirtual   #554 <Method android.view.ViewParent View.getParent()>
    //   17   36:astore_1        
    //   18   37:aload_1         
    //   19   38:aload_0         
    //   20   39:if_acmpeq       68
    //   21   42:aload_1         
    //   22   43:instanceof      #556 <Class ViewGroup>
    //   23   46:ifeq            60
    //   24   49:aload_1         
    //   25   50:checkcast       #556 <Class ViewGroup>
    //   26   53:aload_0         
    //   27   54:getfield        #254 <Field View mCustomNavView>
    //   28   57:invokevirtual   #557 <Method void ViewGroup.removeView(View)>
    //   29   60:aload_0         
    //   30   61:aload_0         
    //   31   62:getfield        #254 <Field View mCustomNavView>
    //   32   65:invokevirtual   #400 <Method void addView(View)>
    //   33   68:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #562 <Method int getPaddingLeft()>
    //    2    4:istore          6
    //    3    6:aload_0         
    //    4    7:invokevirtual   #565 <Method int getPaddingTop()>
    //    5   10:istore          7
    //    6   12:iload           5
    //    7   14:iload_3         
    //    8   15:isub            
    //    9   16:aload_0         
    //   10   17:invokevirtual   #565 <Method int getPaddingTop()>
    //   11   20:isub            
    //   12   21:aload_0         
    //   13   22:invokevirtual   #568 <Method int getPaddingBottom()>
    //   14   25:isub            
    //   15   26:istore          8
    //   16   28:iload           8
    //   17   30:ifgt            34
    //   18   33:return          
    //   19   34:aload_0         
    //   20   35:getfield        #402 <Field View mExpandedActionView>
    //   21   38:ifnull          613
    //   22   41:aload_0         
    //   23   42:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //   24   45:astore          9
    //   25   47:aload           9
    //   26   49:invokevirtual   #571 <Method int ActionBarView$HomeView.getVisibility()>
    //   27   52:bipush          8
    //   28   54:icmpeq          87
    //   29   57:aload           9
    //   30   59:invokevirtual   #574 <Method int ActionBarView$HomeView.getLeftOffset()>
    //   31   62:istore          34
    //   32   64:iload           6
    //   33   66:iload           34
    //   34   68:aload_0         
    //   35   69:aload           9
    //   36   71:iload           6
    //   37   73:iload           34
    //   38   75:iadd            
    //   39   76:iload           7
    //   40   78:iload           8
    //   41   80:invokevirtual   #578 <Method int positionChild(View, int, int, int)>
    //   42   83:iadd            
    //   43   84:iadd            
    //   44   85:istore          6
    //   45   87:aload_0         
    //   46   88:getfield        #402 <Field View mExpandedActionView>
    //   47   91:ifnonnull       180
    //   48   94:aload_0         
    //   49   95:getfield        #318 <Field LinearLayout mTitleLayout>
    //   50   98:ifnull          622
    //   51  101:aload_0         
    //   52  102:getfield        #318 <Field LinearLayout mTitleLayout>
    //   53  105:invokevirtual   #579 <Method int LinearLayout.getVisibility()>
    //   54  108:bipush          8
    //   55  110:icmpeq          622
    //   56  113:bipush          8
    //   57  115:aload_0         
    //   58  116:getfield        #85  <Field int mDisplayOptions>
    //   59  119:iand            
    //   60  120:ifeq            622
    //   61  123:iconst_1        
    //   62  124:istore          33
    //   63  126:iload           33
    //   64  128:ifeq            150
    //   65  131:iload           6
    //   66  133:aload_0         
    //   67  134:aload_0         
    //   68  135:getfield        #318 <Field LinearLayout mTitleLayout>
    //   69  138:iload           6
    //   70  140:iload           7
    //   71  142:iload           8
    //   72  144:invokevirtual   #578 <Method int positionChild(View, int, int, int)>
    //   73  147:iadd            
    //   74  148:istore          6
    //   75  150:aload_0         
    //   76  151:getfield        #141 <Field int mNavigationMode>
    //   77  154:tableswitch     0 2: default 180
    //                   0 180
    //                   1 628
    //                   2 676
    //   78  180:iload           4
    //   79  182:iload_2         
    //   80  183:isub            
    //   81  184:aload_0         
    //   82  185:invokevirtual   #582 <Method int getPaddingRight()>
    //   83  188:isub            
    //   84  189:istore          10
    //   85  191:aload_0         
    //   86  192:getfield        #586 <Field ActionMenuView mMenuView>
    //   87  195:ifnull          236
    //   88  198:aload_0         
    //   89  199:getfield        #586 <Field ActionMenuView mMenuView>
    //   90  202:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   91  205:aload_0         
    //   92  206:if_acmpne       236
    //   93  209:aload_0         
    //   94  210:aload_0         
    //   95  211:getfield        #586 <Field ActionMenuView mMenuView>
    //   96  214:iload           10
    //   97  216:iload           7
    //   98  218:iload           8
    //   99  220:invokevirtual   #592 <Method int positionChildInverse(View, int, int, int)>
    //  100  223:pop             
    //  101  224:iload           10
    //  102  226:aload_0         
    //  103  227:getfield        #586 <Field ActionMenuView mMenuView>
    //  104  230:invokevirtual   #595 <Method int ActionMenuView.getMeasuredWidth()>
    //  105  233:isub            
    //  106  234:istore          10
    //  107  236:aload_0         
    //  108  237:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  109  240:ifnull          282
    //  110  243:aload_0         
    //  111  244:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  112  247:invokevirtual   #596 <Method int ProgressBarICS.getVisibility()>
    //  113  250:bipush          8
    //  114  252:icmpeq          282
    //  115  255:aload_0         
    //  116  256:aload_0         
    //  117  257:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  118  260:iload           10
    //  119  262:iload           7
    //  120  264:iload           8
    //  121  266:invokevirtual   #592 <Method int positionChildInverse(View, int, int, int)>
    //  122  269:pop             
    //  123  270:iload           10
    //  124  272:aload_0         
    //  125  273:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  126  276:invokevirtual   #597 <Method int ProgressBarICS.getMeasuredWidth()>
    //  127  279:isub            
    //  128  280:istore          10
    //  129  282:aload_0         
    //  130  283:getfield        #402 <Field View mExpandedActionView>
    //  131  286:ifnull          724
    //  132  289:aload_0         
    //  133  290:getfield        #402 <Field View mExpandedActionView>
    //  134  293:astore          12
    //  135  295:aload           12
    //  136  297:ifnull          559
    //  137  300:aload           12
    //  138  302:invokevirtual   #598 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  139  305:astore          15
    //  140  307:aload           15
    //  141  309:instanceof      #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //  142  312:ifeq            764
    //  143  315:aload           15
    //  144  317:checkcast       #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //  145  320:astore          16
    //  146  322:aload           16
    //  147  324:ifnull          770
    //  148  327:aload           16
    //  149  329:getfield        #601 <Field int android.support.v7.app.ActionBar$LayoutParams.gravity>
    //  150  332:istore          17
    //  151  334:aload           12
    //  152  336:invokevirtual   #602 <Method int View.getMeasuredWidth()>
    //  153  339:istore          18
    //  154  341:iconst_0        
    //  155  342:istore          19
    //  156  344:iconst_0        
    //  157  345:istore          20
    //  158  347:aload           16
    //  159  349:ifnull          386
    //  160  352:iload           6
    //  161  354:aload           16
    //  162  356:getfield        #605 <Field int android.support.v7.app.ActionBar$LayoutParams.leftMargin>
    //  163  359:iadd            
    //  164  360:istore          6
    //  165  362:iload           10
    //  166  364:aload           16
    //  167  366:getfield        #608 <Field int android.support.v7.app.ActionBar$LayoutParams.rightMargin>
    //  168  369:isub            
    //  169  370:istore          10
    //  170  372:aload           16
    //  171  374:getfield        #611 <Field int android.support.v7.app.ActionBar$LayoutParams.topMargin>
    //  172  377:istore          20
    //  173  379:aload           16
    //  174  381:getfield        #614 <Field int android.support.v7.app.ActionBar$LayoutParams.bottomMargin>
    //  175  384:istore          19
    //  176  386:iload           17
    //  177  388:bipush          7
    //  178  390:iand            
    //  179  391:istore          21
    //  180  393:iload           21
    //  181  395:iconst_1        
    //  182  396:icmpne          793
    //  183  399:aload_0         
    //  184  400:invokevirtual   #617 <Method int getWidth()>
    //  185  403:iload           18
    //  186  405:isub            
    //  187  406:iconst_2        
    //  188  407:idiv            
    //  189  408:istore          30
    //  190  410:iload           30
    //  191  412:iload           6
    //  192  414:icmpge          777
    //  193  417:iconst_3        
    //  194  418:istore          21
    //  195  420:iconst_0        
    //  196  421:istore          22
    //  197  423:iload           21
    //  198  425:tableswitch     1 5: default 460
    //                   1 805
    //                   2 460
    //                   3 819
    //                   4 460
    //                   5 826
    //  199  460:iload           17
    //  200  462:bipush          112
    //  201  464:iand            
    //  202  465:istore          23
    //  203  467:iload           17
    //  204  469:iconst_m1       
    //  205  470:icmpne          477
    //  206  473:bipush          16
    //  207  475:istore          23
    //  208  477:iconst_0        
    //  209  478:istore          24
    //  210  480:iload           23
    //  211  482:lookupswitch    3: default 516
    //                   16: 836
    //                   48: 867
    //                   80: 879
    //  212  516:aload           12
    //  213  518:invokevirtual   #602 <Method int View.getMeasuredWidth()>
    //  214  521:istore          25
    //  215  523:iload           22
    //  216  525:iload           25
    //  217  527:iadd            
    //  218  528:istore          26
    //  219  530:iload           24
    //  220  532:aload           12
    //  221  534:invokevirtual   #620 <Method int View.getMeasuredHeight()>
    //  222  537:iadd            
    //  223  538:istore          27
    //  224  540:aload           12
    //  225  542:iload           22
    //  226  544:iload           24
    //  227  546:iload           26
    //  228  548:iload           27
    //  229  550:invokevirtual   #624 <Method void View.layout(int, int, int, int)>
    //  230  553:iload           6
    //  231  555:iload           25
    //  232  557:iadd            
    //  233  558:pop             
    //  234  559:aload_0         
    //  235  560:getfield        #491 <Field ProgressBarICS mProgressView>
    //  236  563:ifnull          33
    //  237  566:aload_0         
    //  238  567:getfield        #491 <Field ProgressBarICS mProgressView>
    //  239  570:invokevirtual   #627 <Method void ProgressBarICS.bringToFront()>
    //  240  573:aload_0         
    //  241  574:getfield        #491 <Field ProgressBarICS mProgressView>
    //  242  577:invokevirtual   #628 <Method int ProgressBarICS.getMeasuredHeight()>
    //  243  580:iconst_2        
    //  244  581:idiv            
    //  245  582:istore          14
    //  246  584:aload_0         
    //  247  585:getfield        #491 <Field ProgressBarICS mProgressView>
    //  248  588:aload_0         
    //  249  589:getfield        #247 <Field int mProgressBarPadding>
    //  250  592:iload           14
    //  251  594:ineg            
    //  252  595:aload_0         
    //  253  596:getfield        #247 <Field int mProgressBarPadding>
    //  254  599:aload_0         
    //  255  600:getfield        #491 <Field ProgressBarICS mProgressView>
    //  256  603:invokevirtual   #597 <Method int ProgressBarICS.getMeasuredWidth()>
    //  257  606:iadd            
    //  258  607:iload           14
    //  259  609:invokevirtual   #629 <Method void ProgressBarICS.layout(int, int, int, int)>
    //  260  612:return          
    //  261  613:aload_0         
    //  262  614:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  263  617:astore          9
    //  264  619:goto            47
    //  265  622:iconst_0        
    //  266  623:istore          33
    //  267  625:goto            126
    //  268  628:aload_0         
    //  269  629:getfield        #631 <Field LinearLayout mListNavLayout>
    //  270  632:ifnull          180
    //  271  635:iload           33
    //  272  637:ifeq            649
    //  273  640:iload           6
    //  274  642:aload_0         
    //  275  643:getfield        #249 <Field int mItemPadding>
    //  276  646:iadd            
    //  277  647:istore          6
    //  278  649:iload           6
    //  279  651:aload_0         
    //  280  652:aload_0         
    //  281  653:getfield        #631 <Field LinearLayout mListNavLayout>
    //  282  656:iload           6
    //  283  658:iload           7
    //  284  660:iload           8
    //  285  662:invokevirtual   #578 <Method int positionChild(View, int, int, int)>
    //  286  665:aload_0         
    //  287  666:getfield        #249 <Field int mItemPadding>
    //  288  669:iadd            
    //  289  670:iadd            
    //  290  671:istore          6
    //  291  673:goto            180
    //  292  676:aload_0         
    //  293  677:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  294  680:ifnull          180
    //  295  683:iload           33
    //  296  685:ifeq            697
    //  297  688:iload           6
    //  298  690:aload_0         
    //  299  691:getfield        #249 <Field int mItemPadding>
    //  300  694:iadd            
    //  301  695:istore          6
    //  302  697:iload           6
    //  303  699:aload_0         
    //  304  700:aload_0         
    //  305  701:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  306  704:iload           6
    //  307  706:iload           7
    //  308  708:iload           8
    //  309  710:invokevirtual   #578 <Method int positionChild(View, int, int, int)>
    //  310  713:aload_0         
    //  311  714:getfield        #249 <Field int mItemPadding>
    //  312  717:iadd            
    //  313  718:iadd            
    //  314  719:istore          6
    //  315  721:goto            180
    //  316  724:bipush          16
    //  317  726:aload_0         
    //  318  727:getfield        #85  <Field int mDisplayOptions>
    //  319  730:iand            
    //  320  731:istore          11
    //  321  733:aconst_null     
    //  322  734:astore          12
    //  323  736:iload           11
    //  324  738:ifeq            295
    //  325  741:aload_0         
    //  326  742:getfield        #254 <Field View mCustomNavView>
    //  327  745:astore          13
    //  328  747:aconst_null     
    //  329  748:astore          12
    //  330  750:aload           13
    //  331  752:ifnull          295
    //  332  755:aload_0         
    //  333  756:getfield        #254 <Field View mCustomNavView>
    //  334  759:astore          12
    //  335  761:goto            295
    //  336  764:aconst_null     
    //  337  765:astore          16
    //  338  767:goto            322
    //  339  770:bipush          19
    //  340  772:istore          17
    //  341  774:goto            334
    //  342  777:iload           30
    //  343  779:iload           18
    //  344  781:iadd            
    //  345  782:iload           10
    //  346  784:icmple          420
    //  347  787:iconst_5        
    //  348  788:istore          21
    //  349  790:goto            420
    //  350  793:iload           17
    //  351  795:iconst_m1       
    //  352  796:icmpne          420
    //  353  799:iconst_3        
    //  354  800:istore          21
    //  355  802:goto            420
    //  356  805:aload_0         
    //  357  806:invokevirtual   #617 <Method int getWidth()>
    //  358  809:iload           18
    //  359  811:isub            
    //  360  812:iconst_2        
    //  361  813:idiv            
    //  362  814:istore          22
    //  363  816:goto            460
    //  364  819:iload           6
    //  365  821:istore          22
    //  366  823:goto            460
    //  367  826:iload           10
    //  368  828:iload           18
    //  369  830:isub            
    //  370  831:istore          22
    //  371  833:goto            460
    //  372  836:aload_0         
    //  373  837:invokevirtual   #565 <Method int getPaddingTop()>
    //  374  840:istore          29
    //  375  842:aload_0         
    //  376  843:invokevirtual   #634 <Method int getHeight()>
    //  377  846:aload_0         
    //  378  847:invokevirtual   #568 <Method int getPaddingBottom()>
    //  379  850:isub            
    //  380  851:iload           29
    //  381  853:isub            
    //  382  854:aload           12
    //  383  856:invokevirtual   #620 <Method int View.getMeasuredHeight()>
    //  384  859:isub            
    //  385  860:iconst_2        
    //  386  861:idiv            
    //  387  862:istore          24
    //  388  864:goto            516
    //  389  867:iload           20
    //  390  869:aload_0         
    //  391  870:invokevirtual   #565 <Method int getPaddingTop()>
    //  392  873:iadd            
    //  393  874:istore          24
    //  394  876:goto            516
    //  395  879:aload_0         
    //  396  880:invokevirtual   #634 <Method int getHeight()>
    //  397  883:aload_0         
    //  398  884:invokevirtual   #568 <Method int getPaddingBottom()>
    //  399  887:isub            
    //  400  888:aload           12
    //  401  890:invokevirtual   #620 <Method int View.getMeasuredHeight()>
    //  402  893:isub            
    //  403  894:iload           19
    //  404  896:isub            
    //  405  897:istore          24
    //  406  899:goto            516
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #639 <Method int getChildCount()>
    //    2    4:istore_3        
    //    3    5:aload_0         
    //    4    6:getfield        #641 <Field boolean mIsCollapsable>
    //    5    9:ifeq            87
    //    6   12:iconst_0        
    //    7   13:istore          46
    //    8   15:iconst_0        
    //    9   16:istore          47
    //   10   18:iload           47
    //   11   20:iload_3         
    //   12   21:icmpge          70
    //   13   24:aload_0         
    //   14   25:iload           47
    //   15   27:invokevirtual   #644 <Method View getChildAt(int)>
    //   16   30:astore          48
    //   17   32:aload           48
    //   18   34:invokevirtual   #645 <Method int View.getVisibility()>
    //   19   37:bipush          8
    //   20   39:icmpeq          64
    //   21   42:aload           48
    //   22   44:aload_0         
    //   23   45:getfield        #586 <Field ActionMenuView mMenuView>
    //   24   48:if_acmpne       61
    //   25   51:aload_0         
    //   26   52:getfield        #586 <Field ActionMenuView mMenuView>
    //   27   55:invokevirtual   #646 <Method int ActionMenuView.getChildCount()>
    //   28   58:ifeq            64
    //   29   61:iinc            46  1
    //   30   64:iinc            47  1
    //   31   67:goto            18
    //   32   70:iload           46
    //   33   72:ifne            87
    //   34   75:aload_0         
    //   35   76:iconst_0        
    //   36   77:iconst_0        
    //   37   78:invokevirtual   #649 <Method void setMeasuredDimension(int, int)>
    //   38   81:aload_0         
    //   39   82:iconst_1        
    //   40   83:putfield        #500 <Field boolean mIsCollapsed>
    //   41   86:return          
    //   42   87:aload_0         
    //   43   88:iconst_0        
    //   44   89:putfield        #500 <Field boolean mIsCollapsed>
    //   45   92:iload_1         
    //   46   93:invokestatic    #655 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   47   96:ldc2            #656 <Int 0x40000000>
    //   48   99:icmpeq          142
    //   49  102:new             #658 <Class IllegalStateException>
    //   50  105:dup             
    //   51  106:new             #660 <Class StringBuilder>
    //   52  109:dup             
    //   53  110:invokespecial   #662 <Method void StringBuilder()>
    //   54  113:aload_0         
    //   55  114:invokevirtual   #668 <Method Class Object.getClass()>
    //   56  117:invokevirtual   #674 <Method String Class.getSimpleName()>
    //   57  120:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   58  123:ldc2            #680 <String " can only be used ">
    //   59  126:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   60  129:ldc2            #682 <String "with android:layout_width=\"MATCH_PARENT\" (or fill_parent)">
    //   61  132:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   62  135:invokevirtual   #685 <Method String StringBuilder.toString()>
    //   63  138:invokespecial   #688 <Method void IllegalStateException(String)>
    //   64  141:athrow          
    //   65  142:iload_2         
    //   66  143:invokestatic    #655 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   67  146:ldc2            #689 <Int 0x80000000>
    //   68  149:icmpeq          192
    //   69  152:new             #658 <Class IllegalStateException>
    //   70  155:dup             
    //   71  156:new             #660 <Class StringBuilder>
    //   72  159:dup             
    //   73  160:invokespecial   #662 <Method void StringBuilder()>
    //   74  163:aload_0         
    //   75  164:invokevirtual   #668 <Method Class Object.getClass()>
    //   76  167:invokevirtual   #674 <Method String Class.getSimpleName()>
    //   77  170:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   78  173:ldc2            #680 <String " can only be used ">
    //   79  176:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   80  179:ldc2            #691 <String "with android:layout_height=\"wrap_content\"">
    //   81  182:invokevirtual   #678 <Method StringBuilder StringBuilder.append(String)>
    //   82  185:invokevirtual   #685 <Method String StringBuilder.toString()>
    //   83  188:invokespecial   #688 <Method void IllegalStateException(String)>
    //   84  191:athrow          
    //   85  192:iload_1         
    //   86  193:invokestatic    #694 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   87  196:istore          4
    //   88  198:aload_0         
    //   89  199:getfield        #260 <Field int mContentHeight>
    //   90  202:ifle            878
    //   91  205:aload_0         
    //   92  206:getfield        #260 <Field int mContentHeight>
    //   93  209:istore          5
    //   94  211:aload_0         
    //   95  212:invokevirtual   #565 <Method int getPaddingTop()>
    //   96  215:aload_0         
    //   97  216:invokevirtual   #568 <Method int getPaddingBottom()>
    //   98  219:iadd            
    //   99  220:istore          6
    //  100  222:aload_0         
    //  101  223:invokevirtual   #562 <Method int getPaddingLeft()>
    //  102  226:istore          7
    //  103  228:aload_0         
    //  104  229:invokevirtual   #582 <Method int getPaddingRight()>
    //  105  232:istore          8
    //  106  234:iload           5
    //  107  236:iload           6
    //  108  238:isub            
    //  109  239:istore          9
    //  110  241:iload           9
    //  111  243:ldc2            #689 <Int 0x80000000>
    //  112  246:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  113  249:istore          10
    //  114  251:iload           4
    //  115  253:iload           7
    //  116  255:isub            
    //  117  256:iload           8
    //  118  258:isub            
    //  119  259:istore          11
    //  120  261:iload           11
    //  121  263:iconst_2        
    //  122  264:idiv            
    //  123  265:istore          12
    //  124  267:iload           12
    //  125  269:istore          13
    //  126  271:aload_0         
    //  127  272:getfield        #402 <Field View mExpandedActionView>
    //  128  275:ifnull          887
    //  129  278:aload_0         
    //  130  279:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //  131  282:astore          14
    //  132  284:aload           14
    //  133  286:invokevirtual   #571 <Method int ActionBarView$HomeView.getVisibility()>
    //  134  289:bipush          8
    //  135  291:icmpeq          373
    //  136  294:aload           14
    //  137  296:invokevirtual   #698 <Method android.view.ViewGroup$LayoutParams ActionBarView$HomeView.getLayoutParams()>
    //  138  299:astore          42
    //  139  301:aload           42
    //  140  303:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  141  306:ifge            896
    //  142  309:iload           11
    //  143  311:ldc2            #689 <Int 0x80000000>
    //  144  314:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  145  317:istore          43
    //  146  319:iload           9
    //  147  321:ldc2            #656 <Int 0x40000000>
    //  148  324:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  149  327:istore          44
    //  150  329:aload           14
    //  151  331:iload           43
    //  152  333:iload           44
    //  153  335:invokevirtual   #701 <Method void ActionBarView$HomeView.measure(int, int)>
    //  154  338:aload           14
    //  155  340:invokevirtual   #702 <Method int ActionBarView$HomeView.getMeasuredWidth()>
    //  156  343:aload           14
    //  157  345:invokevirtual   #574 <Method int ActionBarView$HomeView.getLeftOffset()>
    //  158  348:iadd            
    //  159  349:istore          45
    //  160  351:iconst_0        
    //  161  352:iload           11
    //  162  354:iload           45
    //  163  356:isub            
    //  164  357:invokestatic    #707 <Method int Math.max(int, int)>
    //  165  360:istore          11
    //  166  362:iconst_0        
    //  167  363:iload           11
    //  168  365:iload           45
    //  169  367:isub            
    //  170  368:invokestatic    #707 <Method int Math.max(int, int)>
    //  171  371:istore          12
    //  172  373:aload_0         
    //  173  374:getfield        #586 <Field ActionMenuView mMenuView>
    //  174  377:ifnull          422
    //  175  380:aload_0         
    //  176  381:getfield        #586 <Field ActionMenuView mMenuView>
    //  177  384:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //  178  387:aload_0         
    //  179  388:if_acmpne       422
    //  180  391:aload_0         
    //  181  392:aload_0         
    //  182  393:getfield        #586 <Field ActionMenuView mMenuView>
    //  183  396:iload           11
    //  184  398:iload           10
    //  185  400:iconst_0        
    //  186  401:invokevirtual   #710 <Method int measureChildView(View, int, int, int)>
    //  187  404:istore          11
    //  188  406:iconst_0        
    //  189  407:iload           13
    //  190  409:aload_0         
    //  191  410:getfield        #586 <Field ActionMenuView mMenuView>
    //  192  413:invokevirtual   #595 <Method int ActionMenuView.getMeasuredWidth()>
    //  193  416:isub            
    //  194  417:invokestatic    #707 <Method int Math.max(int, int)>
    //  195  420:istore          13
    //  196  422:aload_0         
    //  197  423:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  198  426:ifnull          472
    //  199  429:aload_0         
    //  200  430:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  201  433:invokevirtual   #596 <Method int ProgressBarICS.getVisibility()>
    //  202  436:bipush          8
    //  203  438:icmpeq          472
    //  204  441:aload_0         
    //  205  442:aload_0         
    //  206  443:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  207  446:iload           11
    //  208  448:iload           10
    //  209  450:iconst_0        
    //  210  451:invokevirtual   #710 <Method int measureChildView(View, int, int, int)>
    //  211  454:istore          11
    //  212  456:iconst_0        
    //  213  457:iload           13
    //  214  459:aload_0         
    //  215  460:getfield        #481 <Field ProgressBarICS mIndeterminateProgressView>
    //  216  463:invokevirtual   #597 <Method int ProgressBarICS.getMeasuredWidth()>
    //  217  466:isub            
    //  218  467:invokestatic    #707 <Method int Math.max(int, int)>
    //  219  470:istore          13
    //  220  472:aload_0         
    //  221  473:getfield        #318 <Field LinearLayout mTitleLayout>
    //  222  476:ifnull          912
    //  223  479:aload_0         
    //  224  480:getfield        #318 <Field LinearLayout mTitleLayout>
    //  225  483:invokevirtual   #579 <Method int LinearLayout.getVisibility()>
    //  226  486:bipush          8
    //  227  488:icmpeq          912
    //  228  491:bipush          8
    //  229  493:aload_0         
    //  230  494:getfield        #85  <Field int mDisplayOptions>
    //  231  497:iand            
    //  232  498:ifeq            912
    //  233  501:iconst_1        
    //  234  502:istore          15
    //  235  504:aload_0         
    //  236  505:getfield        #402 <Field View mExpandedActionView>
    //  237  508:ifnonnull       536
    //  238  511:aload_0         
    //  239  512:getfield        #141 <Field int mNavigationMode>
    //  240  515:tableswitch     1 2: default 536
    //                   1 918
    //                   2 1026
    //  241  536:aload_0         
    //  242  537:getfield        #402 <Field View mExpandedActionView>
    //  243  540:ifnull          1134
    //  244  543:aload_0         
    //  245  544:getfield        #402 <Field View mExpandedActionView>
    //  246  547:astore          17
    //  247  549:aload           17
    //  248  551:ifnull          779
    //  249  554:aload_0         
    //  250  555:aload           17
    //  251  557:invokevirtual   #598 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  252  560:invokevirtual   #712 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
    //  253  563:astore          24
    //  254  565:aload           24
    //  255  567:instanceof      #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //  256  570:ifeq            1174
    //  257  573:aload           24
    //  258  575:checkcast       #434 <Class android.support.v7.app.ActionBar$LayoutParams>
    //  259  578:astore          25
    //  260  580:iconst_0        
    //  261  581:istore          26
    //  262  583:iconst_0        
    //  263  584:istore          27
    //  264  586:aload           25
    //  265  588:ifnull          617
    //  266  591:aload           25
    //  267  593:getfield        #605 <Field int android.support.v7.app.ActionBar$LayoutParams.leftMargin>
    //  268  596:aload           25
    //  269  598:getfield        #608 <Field int android.support.v7.app.ActionBar$LayoutParams.rightMargin>
    //  270  601:iadd            
    //  271  602:istore          26
    //  272  604:aload           25
    //  273  606:getfield        #611 <Field int android.support.v7.app.ActionBar$LayoutParams.topMargin>
    //  274  609:aload           25
    //  275  611:getfield        #614 <Field int android.support.v7.app.ActionBar$LayoutParams.bottomMargin>
    //  276  614:iadd            
    //  277  615:istore          27
    //  278  617:aload_0         
    //  279  618:getfield        #260 <Field int mContentHeight>
    //  280  621:ifgt            1180
    //  281  624:ldc2            #689 <Int 0x80000000>
    //  282  627:istore          28
    //  283  629:aload           24
    //  284  631:getfield        #534 <Field int android.view.ViewGroup$LayoutParams.height>
    //  285  634:iflt            649
    //  286  637:aload           24
    //  287  639:getfield        #534 <Field int android.view.ViewGroup$LayoutParams.height>
    //  288  642:iload           9
    //  289  644:invokestatic    #715 <Method int Math.min(int, int)>
    //  290  647:istore          9
    //  291  649:iconst_0        
    //  292  650:iload           9
    //  293  652:iload           27
    //  294  654:isub            
    //  295  655:invokestatic    #707 <Method int Math.max(int, int)>
    //  296  658:istore          29
    //  297  660:aload           24
    //  298  662:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  299  665:bipush          -2
    //  300  667:icmpeq          1206
    //  301  670:ldc2            #656 <Int 0x40000000>
    //  302  673:istore          30
    //  303  675:aload           24
    //  304  677:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  305  680:iflt            1214
    //  306  683:aload           24
    //  307  685:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  308  688:iload           11
    //  309  690:invokestatic    #715 <Method int Math.min(int, int)>
    //  310  693:istore          31
    //  311  695:iconst_0        
    //  312  696:iload           31
    //  313  698:iload           26
    //  314  700:isub            
    //  315  701:invokestatic    #707 <Method int Math.max(int, int)>
    //  316  704:istore          32
    //  317  706:aload           25
    //  318  708:ifnull          1221
    //  319  711:aload           25
    //  320  713:getfield        #601 <Field int android.support.v7.app.ActionBar$LayoutParams.gravity>
    //  321  716:istore          33
    //  322  718:iload           33
    //  323  720:bipush          7
    //  324  722:iand            
    //  325  723:iconst_1        
    //  326  724:icmpne          747
    //  327  727:aload           24
    //  328  729:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  329  732:iconst_m1       
    //  330  733:icmpne          747
    //  331  736:iconst_2        
    //  332  737:iload           12
    //  333  739:iload           13
    //  334  741:invokestatic    #715 <Method int Math.min(int, int)>
    //  335  744:imul            
    //  336  745:istore          32
    //  337  747:aload           17
    //  338  749:iload           32
    //  339  751:iload           30
    //  340  753:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  341  756:iload           29
    //  342  758:iload           28
    //  343  760:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  344  763:invokevirtual   #716 <Method void View.measure(int, int)>
    //  345  766:iload           11
    //  346  768:iload           26
    //  347  770:aload           17
    //  348  772:invokevirtual   #602 <Method int View.getMeasuredWidth()>
    //  349  775:iadd            
    //  350  776:isub            
    //  351  777:istore          11
    //  352  779:aload_0         
    //  353  780:getfield        #402 <Field View mExpandedActionView>
    //  354  783:ifnonnull       828
    //  355  786:iload           15
    //  356  788:ifeq            828
    //  357  791:aload_0         
    //  358  792:aload_0         
    //  359  793:getfield        #318 <Field LinearLayout mTitleLayout>
    //  360  796:iload           11
    //  361  798:aload_0         
    //  362  799:getfield        #260 <Field int mContentHeight>
    //  363  802:ldc2            #656 <Int 0x40000000>
    //  364  805:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  365  808:iconst_0        
    //  366  809:invokevirtual   #710 <Method int measureChildView(View, int, int, int)>
    //  367  812:pop             
    //  368  813:iconst_0        
    //  369  814:iload           12
    //  370  816:aload_0         
    //  371  817:getfield        #318 <Field LinearLayout mTitleLayout>
    //  372  820:invokevirtual   #717 <Method int LinearLayout.getMeasuredWidth()>
    //  373  823:isub            
    //  374  824:invokestatic    #707 <Method int Math.max(int, int)>
    //  375  827:pop             
    //  376  828:aload_0         
    //  377  829:getfield        #260 <Field int mContentHeight>
    //  378  832:ifgt            1306
    //  379  835:iconst_0        
    //  380  836:istore          19
    //  381  838:iconst_0        
    //  382  839:istore          20
    //  383  841:iload           20
    //  384  843:iload_3         
    //  385  844:icmpge          1228
    //  386  847:iload           6
    //  387  849:aload_0         
    //  388  850:iload           20
    //  389  852:invokevirtual   #644 <Method View getChildAt(int)>
    //  390  855:invokevirtual   #620 <Method int View.getMeasuredHeight()>
    //  391  858:iadd            
    //  392  859:istore          21
    //  393  861:iload           21
    //  394  863:iload           19
    //  395  865:icmple          872
    //  396  868:iload           21
    //  397  870:istore          19
    //  398  872:iinc            20  1
    //  399  875:goto            841
    //  400  878:iload_2         
    //  401  879:invokestatic    #694 <Method int android.view.View$MeasureSpec.getSize(int)>
    //  402  882:istore          5
    //  403  884:goto            211
    //  404  887:aload_0         
    //  405  888:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  406  891:astore          14
    //  407  893:goto            284
    //  408  896:aload           42
    //  409  898:getfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  410  901:ldc2            #656 <Int 0x40000000>
    //  411  904:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  412  907:istore          43
    //  413  909:goto            319
    //  414  912:iconst_0        
    //  415  913:istore          15
    //  416  915:goto            504
    //  417  918:aload_0         
    //  418  919:getfield        #631 <Field LinearLayout mListNavLayout>
    //  419  922:ifnull          536
    //  420  925:iload           15
    //  421  927:ifeq            1017
    //  422  930:iconst_2        
    //  423  931:aload_0         
    //  424  932:getfield        #249 <Field int mItemPadding>
    //  425  935:imul            
    //  426  936:istore          38
    //  427  938:iconst_0        
    //  428  939:iload           11
    //  429  941:iload           38
    //  430  943:isub            
    //  431  944:invokestatic    #707 <Method int Math.max(int, int)>
    //  432  947:istore          39
    //  433  949:iconst_0        
    //  434  950:iload           12
    //  435  952:iload           38
    //  436  954:isub            
    //  437  955:invokestatic    #707 <Method int Math.max(int, int)>
    //  438  958:istore          40
    //  439  960:aload_0         
    //  440  961:getfield        #631 <Field LinearLayout mListNavLayout>
    //  441  964:iload           39
    //  442  966:ldc2            #689 <Int 0x80000000>
    //  443  969:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  444  972:iload           9
    //  445  974:ldc2            #656 <Int 0x40000000>
    //  446  977:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  447  980:invokevirtual   #718 <Method void LinearLayout.measure(int, int)>
    //  448  983:aload_0         
    //  449  984:getfield        #631 <Field LinearLayout mListNavLayout>
    //  450  987:invokevirtual   #717 <Method int LinearLayout.getMeasuredWidth()>
    //  451  990:istore          41
    //  452  992:iconst_0        
    //  453  993:iload           39
    //  454  995:iload           41
    //  455  997:isub            
    //  456  998:invokestatic    #707 <Method int Math.max(int, int)>
    //  457 1001:istore          11
    //  458 1003:iconst_0        
    //  459 1004:iload           40
    //  460 1006:iload           41
    //  461 1008:isub            
    //  462 1009:invokestatic    #707 <Method int Math.max(int, int)>
    //  463 1012:istore          12
    //  464 1014:goto            536
    //  465 1017:aload_0         
    //  466 1018:getfield        #249 <Field int mItemPadding>
    //  467 1021:istore          38
    //  468 1023:goto            938
    //  469 1026:aload_0         
    //  470 1027:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  471 1030:ifnull          536
    //  472 1033:iload           15
    //  473 1035:ifeq            1125
    //  474 1038:iconst_2        
    //  475 1039:aload_0         
    //  476 1040:getfield        #249 <Field int mItemPadding>
    //  477 1043:imul            
    //  478 1044:istore          34
    //  479 1046:iconst_0        
    //  480 1047:iload           11
    //  481 1049:iload           34
    //  482 1051:isub            
    //  483 1052:invokestatic    #707 <Method int Math.max(int, int)>
    //  484 1055:istore          35
    //  485 1057:iconst_0        
    //  486 1058:iload           12
    //  487 1060:iload           34
    //  488 1062:isub            
    //  489 1063:invokestatic    #707 <Method int Math.max(int, int)>
    //  490 1066:istore          36
    //  491 1068:aload_0         
    //  492 1069:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  493 1072:iload           35
    //  494 1074:ldc2            #689 <Int 0x80000000>
    //  495 1077:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  496 1080:iload           9
    //  497 1082:ldc2            #656 <Int 0x40000000>
    //  498 1085:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  499 1088:invokevirtual   #719 <Method void ScrollingTabContainerView.measure(int, int)>
    //  500 1091:aload_0         
    //  501 1092:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  502 1095:invokevirtual   #720 <Method int ScrollingTabContainerView.getMeasuredWidth()>
    //  503 1098:istore          37
    //  504 1100:iconst_0        
    //  505 1101:iload           35
    //  506 1103:iload           37
    //  507 1105:isub            
    //  508 1106:invokestatic    #707 <Method int Math.max(int, int)>
    //  509 1109:istore          11
    //  510 1111:iconst_0        
    //  511 1112:iload           36
    //  512 1114:iload           37
    //  513 1116:isub            
    //  514 1117:invokestatic    #707 <Method int Math.max(int, int)>
    //  515 1120:istore          12
    //  516 1122:goto            536
    //  517 1125:aload_0         
    //  518 1126:getfield        #249 <Field int mItemPadding>
    //  519 1129:istore          34
    //  520 1131:goto            1046
    //  521 1134:bipush          16
    //  522 1136:aload_0         
    //  523 1137:getfield        #85  <Field int mDisplayOptions>
    //  524 1140:iand            
    //  525 1141:istore          16
    //  526 1143:aconst_null     
    //  527 1144:astore          17
    //  528 1146:iload           16
    //  529 1148:ifeq            549
    //  530 1151:aload_0         
    //  531 1152:getfield        #254 <Field View mCustomNavView>
    //  532 1155:astore          18
    //  533 1157:aconst_null     
    //  534 1158:astore          17
    //  535 1160:aload           18
    //  536 1162:ifnull          549
    //  537 1165:aload_0         
    //  538 1166:getfield        #254 <Field View mCustomNavView>
    //  539 1169:astore          17
    //  540 1171:goto            549
    //  541 1174:aconst_null     
    //  542 1175:astore          25
    //  543 1177:goto            580
    //  544 1180:aload           24
    //  545 1182:getfield        #534 <Field int android.view.ViewGroup$LayoutParams.height>
    //  546 1185:bipush          -2
    //  547 1187:icmpeq          1198
    //  548 1190:ldc2            #656 <Int 0x40000000>
    //  549 1193:istore          28
    //  550 1195:goto            629
    //  551 1198:ldc2            #689 <Int 0x80000000>
    //  552 1201:istore          28
    //  553 1203:goto            1195
    //  554 1206:ldc2            #689 <Int 0x80000000>
    //  555 1209:istore          30
    //  556 1211:goto            675
    //  557 1214:iload           11
    //  558 1216:istore          31
    //  559 1218:goto            695
    //  560 1221:bipush          19
    //  561 1223:istore          33
    //  562 1225:goto            718
    //  563 1228:aload_0         
    //  564 1229:iload           4
    //  565 1231:iload           19
    //  566 1233:invokevirtual   #649 <Method void setMeasuredDimension(int, int)>
    //  567 1236:aload_0         
    //  568 1237:getfield        #722 <Field ActionBarContextView mContextView>
    //  569 1240:ifnull          1254
    //  570 1243:aload_0         
    //  571 1244:getfield        #722 <Field ActionBarContextView mContextView>
    //  572 1247:aload_0         
    //  573 1248:invokevirtual   #723 <Method int getMeasuredHeight()>
    //  574 1251:invokevirtual   #728 <Method void ActionBarContextView.setContentHeight(int)>
    //  575 1254:aload_0         
    //  576 1255:getfield        #491 <Field ProgressBarICS mProgressView>
    //  577 1258:ifnull          86
    //  578 1261:aload_0         
    //  579 1262:getfield        #491 <Field ProgressBarICS mProgressView>
    //  580 1265:invokevirtual   #596 <Method int ProgressBarICS.getVisibility()>
    //  581 1268:bipush          8
    //  582 1270:icmpeq          86
    //  583 1273:aload_0         
    //  584 1274:getfield        #491 <Field ProgressBarICS mProgressView>
    //  585 1277:iload           4
    //  586 1279:iconst_2        
    //  587 1280:aload_0         
    //  588 1281:getfield        #247 <Field int mProgressBarPadding>
    //  589 1284:imul            
    //  590 1285:isub            
    //  591 1286:ldc2            #656 <Int 0x40000000>
    //  592 1289:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  593 1292:aload_0         
    //  594 1293:invokevirtual   #723 <Method int getMeasuredHeight()>
    //  595 1296:ldc2            #689 <Int 0x80000000>
    //  596 1299:invokestatic    #697 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  597 1302:invokevirtual   #729 <Method void ProgressBarICS.measure(int, int)>
    //  598 1305:return          
    //  599 1306:aload_0         
    //  600 1307:iload           4
    //  601 1309:iload           5
    //  602 1311:invokevirtual   #649 <Method void setMeasuredDimension(int, int)>
    //  603 1314:goto            1236
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #733 <Class ActionBarView$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #737 <Method Parcelable ActionBarView$SavedState.getSuperState()>
    //    6   10:invokespecial   #739 <Method void AbsActionBarView.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_2         
    //    8   14:getfield        #742 <Field int ActionBarView$SavedState.expandedMenuItemId>
    //    9   17:ifeq            60
    //   10   20:aload_0         
    //   11   21:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   12   24:ifnull          60
    //   13   27:aload_0         
    //   14   28:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //   15   31:ifnull          60
    //   16   34:aload_0         
    //   17   35:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //   18   38:aload_2         
    //   19   39:getfield        #742 <Field int ActionBarView$SavedState.expandedMenuItemId>
    //   20   42:invokevirtual   #748 <Method android.view.MenuItem MenuBuilder.findItem(int)>
    //   21   45:checkcast       #750 <Class SupportMenuItem>
    //   22   48:astore_3        
    //   23   49:aload_3         
    //   24   50:ifnull          60
    //   25   53:aload_3         
    //   26   54:invokeinterface #753 <Method boolean SupportMenuItem.expandActionView()>
    //   27   59:pop             
    //   28   60:aload_2         
    //   29   61:getfield        #756 <Field boolean ActionBarView$SavedState.isOverflowOpen>
    //   30   64:ifeq            71
    //   31   67:aload_0         
    //   32   68:invokevirtual   #759 <Method void postShowOverflowMenu()>
    //   33   71:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #733 <Class ActionBarView$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #762 <Method Parcelable AbsActionBarView.onSaveInstanceState()>
    //    4    8:invokespecial   #764 <Method void ActionBarView$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_0         
    //    7   13:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    8   16:ifnull          43
    //    9   19:aload_0         
    //   10   20:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   11   23:getfield        #427 <Field MenuItemImpl ActionBarView$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
    //   12   26:ifnull          43
    //   13   29:aload_1         
    //   14   30:aload_0         
    //   15   31:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   16   34:getfield        #427 <Field MenuItemImpl ActionBarView$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
    //   17   37:invokevirtual   #767 <Method int MenuItemImpl.getItemId()>
    //   18   40:putfield        #742 <Field int ActionBarView$SavedState.expandedMenuItemId>
    //   19   43:aload_1         
    //   20   44:aload_0         
    //   21   45:invokevirtual   #768 <Method boolean isOverflowMenuShowing()>
    //   22   48:putfield        #756 <Field boolean ActionBarView$SavedState.isOverflowOpen>
    //   23   51:aload_1         
    //   24   52:areturn         
    }

    public volatile void postShowOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #769 <Method void AbsActionBarView.postShowOverflowMenu()>
    //    2    4:return          
    }

    public void setCallback(android.support.v7.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #290 <Field android.support.v7.app.ActionBar$OnNavigationListener mCallback>
    //    3    5:return          
    }

    public void setCollapsable(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #641 <Field boolean mIsCollapsable>
    //    3    5:return          
    }

    public volatile void setContentHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #773 <Method void AbsActionBarView.setContentHeight(int)>
    //    3    5:return          
    }

    public void setContextView(ActionBarContextView actionbarcontextview)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #722 <Field ActionBarContextView mContextView>
    //    3    5:return          
    }

    public void setCustomNavigationView(View view)
    {
    //    0    0:bipush          16
    //    1    2:aload_0         
    //    2    3:getfield        #85  <Field int mDisplayOptions>
    //    3    6:iand            
    //    4    7:ifeq            56
    //    5   10:iconst_1        
    //    6   11:istore_2        
    //    7   12:aload_0         
    //    8   13:getfield        #254 <Field View mCustomNavView>
    //    9   16:ifnull          31
    //   10   19:iload_2         
    //   11   20:ifeq            31
    //   12   23:aload_0         
    //   13   24:aload_0         
    //   14   25:getfield        #254 <Field View mCustomNavView>
    //   15   28:invokevirtual   #521 <Method void removeView(View)>
    //   16   31:aload_0         
    //   17   32:aload_1         
    //   18   33:putfield        #254 <Field View mCustomNavView>
    //   19   36:aload_0         
    //   20   37:getfield        #254 <Field View mCustomNavView>
    //   21   40:ifnull          55
    //   22   43:iload_2         
    //   23   44:ifeq            55
    //   24   47:aload_0         
    //   25   48:aload_0         
    //   26   49:getfield        #254 <Field View mCustomNavView>
    //   27   52:invokevirtual   #400 <Method void addView(View)>
    //   28   55:return          
    //   29   56:iconst_0        
    //   30   57:istore_2        
    //   31   58:goto            12
    }

    public void setDisplayOptions(int i)
    {
    //    0    0:bipush          8
    //    1    2:istore_2        
    //    2    3:iconst_m1       
    //    3    4:istore_3        
    //    4    5:iconst_1        
    //    5    6:istore          4
    //    6    8:aload_0         
    //    7    9:getfield        #85  <Field int mDisplayOptions>
    //    8   12:iload_3         
    //    9   13:icmpne          289
    //   10   16:aload_0         
    //   11   17:iload_1         
    //   12   18:putfield        #85  <Field int mDisplayOptions>
    //   13   21:iload_3         
    //   14   22:bipush          31
    //   15   24:iand            
    //   16   25:ifeq            371
    //   17   28:iload_1         
    //   18   29:iconst_2        
    //   19   30:iand            
    //   20   31:ifeq            299
    //   21   34:iload           4
    //   22   36:istore          5
    //   23   38:iload           5
    //   24   40:ifeq            305
    //   25   43:aload_0         
    //   26   44:getfield        #402 <Field View mExpandedActionView>
    //   27   47:ifnonnull       305
    //   28   50:iconst_0        
    //   29   51:istore          6
    //   30   53:aload_0         
    //   31   54:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   32   57:iload           6
    //   33   59:invokevirtual   #777 <Method void ActionBarView$HomeView.setVisibility(int)>
    //   34   62:iload_3         
    //   35   63:iconst_4        
    //   36   64:iand            
    //   37   65:ifeq            98
    //   38   68:iload_1         
    //   39   69:iconst_4        
    //   40   70:iand            
    //   41   71:ifeq            311
    //   42   74:iload           4
    //   43   76:istore          13
    //   44   78:aload_0         
    //   45   79:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   46   82:iload           13
    //   47   84:invokevirtual   #214 <Method void ActionBarView$HomeView.setUp(boolean)>
    //   48   87:iload           13
    //   49   89:ifeq            98
    //   50   92:aload_0         
    //   51   93:iload           4
    //   52   95:invokevirtual   #780 <Method void setHomeButtonEnabled(boolean)>
    //   53   98:iload_3         
    //   54   99:iconst_1        
    //   55  100:iand            
    //   56  101:ifeq            145
    //   57  104:aload_0         
    //   58  105:getfield        #155 <Field Drawable mLogo>
    //   59  108:ifnull          317
    //   60  111:iload_1         
    //   61  112:iconst_1        
    //   62  113:iand            
    //   63  114:ifeq            317
    //   64  117:iload           4
    //   65  119:istore          10
    //   66  121:aload_0         
    //   67  122:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   68  125:astore          11
    //   69  127:iload           10
    //   70  129:ifeq            323
    //   71  132:aload_0         
    //   72  133:getfield        #155 <Field Drawable mLogo>
    //   73  136:astore          12
    //   74  138:aload           11
    //   75  140:aload           12
    //   76  142:invokevirtual   #784 <Method void ActionBarView$HomeView.setIcon(Drawable)>
    //   77  145:iload_3         
    //   78  146:bipush          8
    //   79  148:iand            
    //   80  149:ifeq            163
    //   81  152:iload_1         
    //   82  153:bipush          8
    //   83  155:iand            
    //   84  156:ifeq            332
    //   85  159:aload_0         
    //   86  160:invokespecial   #306 <Method void initTitle()>
    //   87  163:aload_0         
    //   88  164:getfield        #318 <Field LinearLayout mTitleLayout>
    //   89  167:ifnull          237
    //   90  170:iload_3         
    //   91  171:bipush          6
    //   92  173:iand            
    //   93  174:ifeq            237
    //   94  177:iconst_4        
    //   95  178:aload_0         
    //   96  179:getfield        #85  <Field int mDisplayOptions>
    //   97  182:iand            
    //   98  183:ifeq            343
    //   99  186:iload           4
    //  100  188:istore          7
    //  101  190:aload_0         
    //  102  191:getfield        #379 <Field View mTitleUpView>
    //  103  194:astore          8
    //  104  196:iload           5
    //  105  198:ifne            208
    //  106  201:iload           7
    //  107  203:ifeq            349
    //  108  206:iconst_0        
    //  109  207:istore_2        
    //  110  208:aload           8
    //  111  210:iload_2         
    //  112  211:invokevirtual   #393 <Method void View.setVisibility(int)>
    //  113  214:aload_0         
    //  114  215:getfield        #318 <Field LinearLayout mTitleLayout>
    //  115  218:astore          9
    //  116  220:iload           5
    //  117  222:ifne            354
    //  118  225:iload           7
    //  119  227:ifeq            354
    //  120  230:aload           9
    //  121  232:iload           4
    //  122  234:invokevirtual   #396 <Method void LinearLayout.setEnabled(boolean)>
    //  123  237:iload_3         
    //  124  238:bipush          16
    //  125  240:iand            
    //  126  241:ifeq            266
    //  127  244:aload_0         
    //  128  245:getfield        #254 <Field View mCustomNavView>
    //  129  248:ifnull          266
    //  130  251:iload_1         
    //  131  252:bipush          16
    //  132  254:iand            
    //  133  255:ifeq            360
    //  134  258:aload_0         
    //  135  259:aload_0         
    //  136  260:getfield        #254 <Field View mCustomNavView>
    //  137  263:invokevirtual   #400 <Method void addView(View)>
    //  138  266:aload_0         
    //  139  267:invokevirtual   #787 <Method void requestLayout()>
    //  140  270:aload_0         
    //  141  271:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  142  274:invokevirtual   #790 <Method boolean ActionBarView$HomeView.isEnabled()>
    //  143  277:ifne            378
    //  144  280:aload_0         
    //  145  281:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  146  284:aconst_null     
    //  147  285:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //  148  288:return          
    //  149  289:iload_1         
    //  150  290:aload_0         
    //  151  291:getfield        #85  <Field int mDisplayOptions>
    //  152  294:ixor            
    //  153  295:istore_3        
    //  154  296:goto            16
    //  155  299:iconst_0        
    //  156  300:istore          5
    //  157  302:goto            38
    //  158  305:iload_2         
    //  159  306:istore          6
    //  160  308:goto            53
    //  161  311:iconst_0        
    //  162  312:istore          13
    //  163  314:goto            78
    //  164  317:iconst_0        
    //  165  318:istore          10
    //  166  320:goto            121
    //  167  323:aload_0         
    //  168  324:getfield        #180 <Field Drawable mIcon>
    //  169  327:astore          12
    //  170  329:goto            138
    //  171  332:aload_0         
    //  172  333:aload_0         
    //  173  334:getfield        #318 <Field LinearLayout mTitleLayout>
    //  174  337:invokevirtual   #521 <Method void removeView(View)>
    //  175  340:goto            163
    //  176  343:iconst_0        
    //  177  344:istore          7
    //  178  346:goto            190
    //  179  349:iconst_4        
    //  180  350:istore_2        
    //  181  351:goto            208
    //  182  354:iconst_0        
    //  183  355:istore          4
    //  184  357:goto            230
    //  185  360:aload_0         
    //  186  361:aload_0         
    //  187  362:getfield        #254 <Field View mCustomNavView>
    //  188  365:invokevirtual   #521 <Method void removeView(View)>
    //  189  368:goto            266
    //  190  371:aload_0         
    //  191  372:invokevirtual   #793 <Method void invalidate()>
    //  192  375:goto            270
    //  193  378:iload_1         
    //  194  379:iconst_4        
    //  195  380:iand            
    //  196  381:ifeq            405
    //  197  384:aload_0         
    //  198  385:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  199  388:aload_0         
    //  200  389:getfield        #104 <Field Context mContext>
    //  201  392:invokevirtual   #794 <Method Resources Context.getResources()>
    //  202  395:getstatic       #227 <Field int android.support.v7.appcompat.R$string.abc_action_bar_up_description>
    //  203  398:invokevirtual   #230 <Method CharSequence Resources.getText(int)>
    //  204  401:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //  205  404:return          
    //  206  405:aload_0         
    //  207  406:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //  208  409:aload_0         
    //  209  410:getfield        #104 <Field Context mContext>
    //  210  413:invokevirtual   #794 <Method Resources Context.getResources()>
    //  211  416:getstatic       #797 <Field int android.support.v7.appcompat.R$string.abc_action_bar_home_description>
    //  212  419:invokevirtual   #230 <Method CharSequence Resources.getText(int)>
    //  213  422:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //  214  425:return          
    }

    public void setDropdownAdapter(SpinnerAdapter spinneradapter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #456 <Field SpinnerAdapter mSpinnerAdapter>
    //    3    5:aload_0         
    //    4    6:getfield        #298 <Field SpinnerICS mSpinner>
    //    5    9:ifnull          20
    //    6   12:aload_0         
    //    7   13:getfield        #298 <Field SpinnerICS mSpinner>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #802 <Method void SpinnerICS.setAdapter(SpinnerAdapter)>
    //   10   20:return          
    }

    public void setDropdownSelectedPosition(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field SpinnerICS mSpinner>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #806 <Method void SpinnerICS.setSelection(int)>
    //    4    8:return          
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //    6   12:invokevirtual   #521 <Method void removeView(View)>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   10   20:aload_1         
    //   11   21:ifnull          79
    //   12   24:iconst_1        
    //   13   25:istore_2        
    //   14   26:aload_0         
    //   15   27:iload_2         
    //   16   28:putfield        #469 <Field boolean mIncludeTabs>
    //   17   31:aload_0         
    //   18   32:getfield        #469 <Field boolean mIncludeTabs>
    //   19   35:ifeq            78
    //   20   38:aload_0         
    //   21   39:getfield        #141 <Field int mNavigationMode>
    //   22   42:iconst_2        
    //   23   43:icmpne          78
    //   24   46:aload_0         
    //   25   47:aload_0         
    //   26   48:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   27   51:invokevirtual   #400 <Method void addView(View)>
    //   28   54:aload_0         
    //   29   55:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   30   58:invokevirtual   #526 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
    //   31   61:astore_3        
    //   32   62:aload_3         
    //   33   63:bipush          -2
    //   34   65:putfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //   35   68:aload_3         
    //   36   69:iconst_m1       
    //   37   70:putfield        #534 <Field int android.view.ViewGroup$LayoutParams.height>
    //   38   73:aload_1         
    //   39   74:iconst_1        
    //   40   75:invokevirtual   #537 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
    //   41   78:return          
    //   42   79:iconst_0        
    //   43   80:istore_2        
    //   44   81:goto            26
    }

    public void setHomeAsUpIndicator(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #812 <Method void ActionBarView$HomeView.setUpIndicator(int)>
    //    4    8:return          
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #814 <Method void ActionBarView$HomeView.setUpIndicator(Drawable)>
    //    4    8:return          
    }

    public void setHomeButtonEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #815 <Method void ActionBarView$HomeView.setEnabled(boolean)>
    //    4    8:aload_0         
    //    5    9:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    6   12:iload_1         
    //    7   13:invokevirtual   #278 <Method void ActionBarView$HomeView.setFocusable(boolean)>
    //    8   16:iload_1         
    //    9   17:ifne            29
    //   10   20:aload_0         
    //   11   21:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   12   24:aconst_null     
    //   13   25:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //   14   28:return          
    //   15   29:iconst_4        
    //   16   30:aload_0         
    //   17   31:getfield        #85  <Field int mDisplayOptions>
    //   18   34:iand            
    //   19   35:ifeq            59
    //   20   38:aload_0         
    //   21   39:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   22   42:aload_0         
    //   23   43:getfield        #104 <Field Context mContext>
    //   24   46:invokevirtual   #794 <Method Resources Context.getResources()>
    //   25   49:getstatic       #227 <Field int android.support.v7.appcompat.R$string.abc_action_bar_up_description>
    //   26   52:invokevirtual   #230 <Method CharSequence Resources.getText(int)>
    //   27   55:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //   28   58:return          
    //   29   59:aload_0         
    //   30   60:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   31   63:aload_0         
    //   32   64:getfield        #104 <Field Context mContext>
    //   33   67:invokevirtual   #794 <Method Resources Context.getResources()>
    //   34   70:getstatic       #797 <Field int android.support.v7.appcompat.R$string.abc_action_bar_home_description>
    //   35   73:invokevirtual   #230 <Method CharSequence Resources.getText(int)>
    //   36   76:invokevirtual   #234 <Method void ActionBarView$HomeView.setContentDescription(CharSequence)>
    //   37   79:return          
    }

    public void setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #104 <Field Context mContext>
    //    3    5:invokevirtual   #794 <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #816 <Method Drawable Resources.getDrawable(int)>
    //    6   12:invokevirtual   #817 <Method void setIcon(Drawable)>
    //    7   15:return          
    }

    public void setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #180 <Field Drawable mIcon>
    //    3    5:aload_1         
    //    4    6:ifnull          33
    //    5    9:iconst_1        
    //    6   10:aload_0         
    //    7   11:getfield        #85  <Field int mDisplayOptions>
    //    8   14:iand            
    //    9   15:ifeq            25
    //   10   18:aload_0         
    //   11   19:getfield        #155 <Field Drawable mLogo>
    //   12   22:ifnonnull       33
    //   13   25:aload_0         
    //   14   26:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   15   29:aload_1         
    //   16   30:invokevirtual   #784 <Method void ActionBarView$HomeView.setIcon(Drawable)>
    //   17   33:aload_0         
    //   18   34:getfield        #402 <Field View mExpandedActionView>
    //   19   37:ifnull          61
    //   20   40:aload_0         
    //   21   41:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //   22   44:aload_0         
    //   23   45:getfield        #180 <Field Drawable mIcon>
    //   24   48:invokevirtual   #823 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #222 <Method Resources getResources()>
    //   27   55:invokevirtual   #829 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
    //   28   58:invokevirtual   #784 <Method void ActionBarView$HomeView.setIcon(Drawable)>
    //   29   61:return          
    }

    public void setLogo(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #104 <Field Context mContext>
    //    3    5:invokevirtual   #794 <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #816 <Method Drawable Resources.getDrawable(int)>
    //    6   12:invokevirtual   #832 <Method void setLogo(Drawable)>
    //    7   15:return          
    }

    public void setLogo(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #155 <Field Drawable mLogo>
    //    3    5:aload_1         
    //    4    6:ifnull          26
    //    5    9:iconst_1        
    //    6   10:aload_0         
    //    7   11:getfield        #85  <Field int mDisplayOptions>
    //    8   14:iand            
    //    9   15:ifeq            26
    //   10   18:aload_0         
    //   11   19:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //   12   22:aload_1         
    //   13   23:invokevirtual   #784 <Method void ActionBarView$HomeView.setIcon(Drawable)>
    //   14   26:return          
    }

    public void setMenu(SupportMenu supportmenu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //    7   13:ifnull          38
    //    8   16:aload_0         
    //    9   17:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //   10   20:aload_0         
    //   11   21:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   12   24:invokevirtual   #837 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
    //   13   27:aload_0         
    //   14   28:getfield        #744 <Field MenuBuilder mOptionsMenu>
    //   15   31:aload_0         
    //   16   32:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   17   35:invokevirtual   #837 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
    //   18   38:aload_1         
    //   19   39:checkcast       #330 <Class MenuBuilder>
    //   20   42:astore_3        
    //   21   43:aload_0         
    //   22   44:aload_3         
    //   23   45:putfield        #744 <Field MenuBuilder mOptionsMenu>
    //   24   48:aload_0         
    //   25   49:getfield        #586 <Field ActionMenuView mMenuView>
    //   26   52:ifnull          81
    //   27   55:aload_0         
    //   28   56:getfield        #586 <Field ActionMenuView mMenuView>
    //   29   59:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   30   62:checkcast       #556 <Class ViewGroup>
    //   31   65:astore          8
    //   32   67:aload           8
    //   33   69:ifnull          81
    //   34   72:aload           8
    //   35   74:aload_0         
    //   36   75:getfield        #586 <Field ActionMenuView mMenuView>
    //   37   78:invokevirtual   #557 <Method void ViewGroup.removeView(View)>
    //   38   81:aload_0         
    //   39   82:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   40   85:ifnonnull       134
    //   41   88:aload_0         
    //   42   89:new             #336 <Class ActionMenuPresenter>
    //   43   92:dup             
    //   44   93:aload_0         
    //   45   94:getfield        #104 <Field Context mContext>
    //   46   97:invokespecial   #840 <Method void ActionMenuPresenter(Context)>
    //   47  100:putfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   48  103:aload_0         
    //   49  104:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   50  107:aload_2         
    //   51  108:invokevirtual   #843 <Method void ActionMenuPresenter.setCallback(android.support.v7.internal.view.menu.MenuPresenter$Callback)>
    //   52  111:aload_0         
    //   53  112:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   54  115:getstatic       #846 <Field int android.support.v7.appcompat.R$id.action_menu_presenter>
    //   55  118:invokevirtual   #847 <Method void ActionMenuPresenter.setId(int)>
    //   56  121:aload_0         
    //   57  122:new             #341 <Class ActionBarView$ExpandedActionViewMenuPresenter>
    //   58  125:dup             
    //   59  126:aload_0         
    //   60  127:aconst_null     
    //   61  128:invokespecial   #850 <Method void ActionBarView$ExpandedActionViewMenuPresenter(ActionBarView, ActionBarView$1)>
    //   62  131:putfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //   63  134:new             #528 <Class android.view.ViewGroup$LayoutParams>
    //   64  137:dup             
    //   65  138:bipush          -2
    //   66  140:iconst_m1       
    //   67  141:invokespecial   #852 <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   68  144:astore          4
    //   69  146:aload_0         
    //   70  147:getfield        #510 <Field boolean mSplitActionBar>
    //   71  150:ifne            231
    //   72  153:aload_0         
    //   73  154:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   74  157:aload_0         
    //   75  158:invokevirtual   #222 <Method Resources getResources()>
    //   76  161:getstatic       #857 <Field int android.support.v7.appcompat.R$bool.abc_action_bar_expanded_action_views_exclusive>
    //   77  164:invokevirtual   #861 <Method boolean Resources.getBoolean(int)>
    //   78  167:invokevirtual   #864 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
    //   79  170:aload_0         
    //   80  171:aload_3         
    //   81  172:invokespecial   #866 <Method void configPresenters(MenuBuilder)>
    //   82  175:aload_0         
    //   83  176:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   84  179:aload_0         
    //   85  180:invokevirtual   #870 <Method MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //   86  183:checkcast       #588 <Class ActionMenuView>
    //   87  186:astore          5
    //   88  188:aload           5
    //   89  190:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   90  193:checkcast       #556 <Class ViewGroup>
    //   91  196:astore          7
    //   92  198:aload           7
    //   93  200:ifnull          216
    //   94  203:aload           7
    //   95  205:aload_0         
    //   96  206:if_acmpeq       216
    //   97  209:aload           7
    //   98  211:aload           5
    //   99  213:invokevirtual   #557 <Method void ViewGroup.removeView(View)>
    //  100  216:aload_0         
    //  101  217:aload           5
    //  102  219:aload           4
    //  103  221:invokevirtual   #873 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //  104  224:aload_0         
    //  105  225:aload           5
    //  106  227:putfield        #586 <Field ActionMenuView mMenuView>
    //  107  230:return          
    //  108  231:aload_0         
    //  109  232:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //  110  235:iconst_0        
    //  111  236:invokevirtual   #864 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
    //  112  239:aload_0         
    //  113  240:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //  114  243:aload_0         
    //  115  244:invokevirtual   #351 <Method Context getContext()>
    //  116  247:invokevirtual   #794 <Method Resources Context.getResources()>
    //  117  250:invokevirtual   #877 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //  118  253:getfield        #882 <Field int DisplayMetrics.widthPixels>
    //  119  256:iconst_1        
    //  120  257:invokevirtual   #886 <Method void ActionMenuPresenter.setWidthLimit(int, boolean)>
    //  121  260:aload_0         
    //  122  261:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //  123  264:ldc2            #887 <Int 0x7fffffff>
    //  124  267:invokevirtual   #890 <Method void ActionMenuPresenter.setItemLimit(int)>
    //  125  270:aload           4
    //  126  272:iconst_m1       
    //  127  273:putfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //  128  276:aload_0         
    //  129  277:aload_3         
    //  130  278:invokespecial   #866 <Method void configPresenters(MenuBuilder)>
    //  131  281:aload_0         
    //  132  282:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //  133  285:aload_0         
    //  134  286:invokevirtual   #870 <Method MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //  135  289:checkcast       #588 <Class ActionMenuView>
    //  136  292:astore          5
    //  137  294:aload_0         
    //  138  295:getfield        #894 <Field ActionBarContainer mSplitView>
    //  139  298:ifnull          355
    //  140  301:aload           5
    //  141  303:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //  142  306:checkcast       #556 <Class ViewGroup>
    //  143  309:astore          6
    //  144  311:aload           6
    //  145  313:ifnull          332
    //  146  316:aload           6
    //  147  318:aload_0         
    //  148  319:getfield        #894 <Field ActionBarContainer mSplitView>
    //  149  322:if_acmpeq       332
    //  150  325:aload           6
    //  151  327:aload           5
    //  152  329:invokevirtual   #557 <Method void ViewGroup.removeView(View)>
    //  153  332:aload           5
    //  154  334:aload_0         
    //  155  335:invokevirtual   #895 <Method int getAnimatedVisibility()>
    //  156  338:invokevirtual   #896 <Method void ActionMenuView.setVisibility(int)>
    //  157  341:aload_0         
    //  158  342:getfield        #894 <Field ActionBarContainer mSplitView>
    //  159  345:aload           5
    //  160  347:aload           4
    //  161  349:invokevirtual   #899 <Method void ActionBarContainer.addView(View, android.view.ViewGroup$LayoutParams)>
    //  162  352:goto            224
    //  163  355:aload           5
    //  164  357:aload           4
    //  165  359:invokevirtual   #903 <Method void ActionMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //  166  362:goto            224
    }

    public void setNavigationMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #141 <Field int mNavigationMode>
    //    2    4:istore_2        
    //    3    5:iload_1         
    //    4    6:iload_2         
    //    5    7:icmpeq          65
    //    6   10:iload_2         
    //    7   11:tableswitch     1 2: default 32
    //                   1 66
    //                   2 84
    //    8   32:iload_1         
    //    9   33:tableswitch     1 2: default 56
    //                   1 109
    //                   2 232
    //   10   56:aload_0         
    //   11   57:iload_1         
    //   12   58:putfield        #141 <Field int mNavigationMode>
    //   13   61:aload_0         
    //   14   62:invokevirtual   #787 <Method void requestLayout()>
    //   15   65:return          
    //   16   66:aload_0         
    //   17   67:getfield        #631 <Field LinearLayout mListNavLayout>
    //   18   70:ifnull          32
    //   19   73:aload_0         
    //   20   74:aload_0         
    //   21   75:getfield        #631 <Field LinearLayout mListNavLayout>
    //   22   78:invokevirtual   #521 <Method void removeView(View)>
    //   23   81:goto            32
    //   24   84:aload_0         
    //   25   85:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   26   88:ifnull          32
    //   27   91:aload_0         
    //   28   92:getfield        #469 <Field boolean mIncludeTabs>
    //   29   95:ifeq            32
    //   30   98:aload_0         
    //   31   99:aload_0         
    //   32  100:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   33  103:invokevirtual   #521 <Method void removeView(View)>
    //   34  106:goto            32
    //   35  109:aload_0         
    //   36  110:getfield        #298 <Field SpinnerICS mSpinner>
    //   37  113:ifnonnull       185
    //   38  116:aload_0         
    //   39  117:new             #459 <Class SpinnerICS>
    //   40  120:dup             
    //   41  121:aload_0         
    //   42  122:getfield        #104 <Field Context mContext>
    //   43  125:aconst_null     
    //   44  126:getstatic       #907 <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
    //   45  129:invokespecial   #910 <Method void SpinnerICS(Context, AttributeSet, int)>
    //   46  132:putfield        #298 <Field SpinnerICS mSpinner>
    //   47  135:aload_0         
    //   48  136:aload_0         
    //   49  137:getfield        #104 <Field Context mContext>
    //   50  140:invokestatic    #192 <Method LayoutInflater LayoutInflater.from(Context)>
    //   51  143:getstatic       #913 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_view_list_nav_layout>
    //   52  146:aconst_null     
    //   53  147:invokevirtual   #916 <Method View LayoutInflater.inflate(int, ViewGroup)>
    //   54  150:checkcast       #356 <Class LinearLayout>
    //   55  153:putfield        #631 <Field LinearLayout mListNavLayout>
    //   56  156:new             #918 <Class android.widget.LinearLayout$LayoutParams>
    //   57  159:dup             
    //   58  160:bipush          -2
    //   59  162:iconst_m1       
    //   60  163:invokespecial   #919 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
    //   61  166:astore_3        
    //   62  167:aload_3         
    //   63  168:bipush          17
    //   64  170:putfield        #920 <Field int android.widget.LinearLayout$LayoutParams.gravity>
    //   65  173:aload_0         
    //   66  174:getfield        #631 <Field LinearLayout mListNavLayout>
    //   67  177:aload_0         
    //   68  178:getfield        #298 <Field SpinnerICS mSpinner>
    //   69  181:aload_3         
    //   70  182:invokevirtual   #921 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   71  185:aload_0         
    //   72  186:getfield        #298 <Field SpinnerICS mSpinner>
    //   73  189:invokevirtual   #924 <Method SpinnerAdapter SpinnerICS.getAdapter()>
    //   74  192:aload_0         
    //   75  193:getfield        #456 <Field SpinnerAdapter mSpinnerAdapter>
    //   76  196:if_acmpeq       210
    //   77  199:aload_0         
    //   78  200:getfield        #298 <Field SpinnerICS mSpinner>
    //   79  203:aload_0         
    //   80  204:getfield        #456 <Field SpinnerAdapter mSpinnerAdapter>
    //   81  207:invokevirtual   #802 <Method void SpinnerICS.setAdapter(SpinnerAdapter)>
    //   82  210:aload_0         
    //   83  211:getfield        #298 <Field SpinnerICS mSpinner>
    //   84  214:aload_0         
    //   85  215:getfield        #92  <Field AdapterViewICS$OnItemSelectedListener mNavItemSelectedListener>
    //   86  218:invokevirtual   #928 <Method void SpinnerICS.setOnItemSelectedListener(AdapterViewICS$OnItemSelectedListener)>
    //   87  221:aload_0         
    //   88  222:aload_0         
    //   89  223:getfield        #631 <Field LinearLayout mListNavLayout>
    //   90  226:invokevirtual   #400 <Method void addView(View)>
    //   91  229:goto            56
    //   92  232:aload_0         
    //   93  233:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //   94  236:ifnull          56
    //   95  239:aload_0         
    //   96  240:getfield        #469 <Field boolean mIncludeTabs>
    //   97  243:ifeq            56
    //   98  246:aload_0         
    //   99  247:aload_0         
    //  100  248:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //  101  251:invokevirtual   #400 <Method void addView(View)>
    //  102  254:goto            56
    }

    public void setSplitActionBar(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #510 <Field boolean mSplitActionBar>
    //    2    4:iload_1         
    //    3    5:icmpeq          137
    //    4    8:aload_0         
    //    5    9:getfield        #586 <Field ActionMenuView mMenuView>
    //    6   12:ifnull          81
    //    7   15:aload_0         
    //    8   16:getfield        #586 <Field ActionMenuView mMenuView>
    //    9   19:invokevirtual   #589 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   10   22:checkcast       #556 <Class ViewGroup>
    //   11   25:astore          4
    //   12   27:aload           4
    //   13   29:ifnull          41
    //   14   32:aload           4
    //   15   34:aload_0         
    //   16   35:getfield        #586 <Field ActionMenuView mMenuView>
    //   17   38:invokevirtual   #557 <Method void ViewGroup.removeView(View)>
    //   18   41:iload_1         
    //   19   42:ifeq            138
    //   20   45:aload_0         
    //   21   46:getfield        #894 <Field ActionBarContainer mSplitView>
    //   22   49:ifnull          63
    //   23   52:aload_0         
    //   24   53:getfield        #894 <Field ActionBarContainer mSplitView>
    //   25   56:aload_0         
    //   26   57:getfield        #586 <Field ActionMenuView mMenuView>
    //   27   60:invokevirtual   #930 <Method void ActionBarContainer.addView(View)>
    //   28   63:aload_0         
    //   29   64:getfield        #586 <Field ActionMenuView mMenuView>
    //   30   67:invokevirtual   #931 <Method android.view.ViewGroup$LayoutParams ActionMenuView.getLayoutParams()>
    //   31   70:iconst_m1       
    //   32   71:putfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //   33   74:aload_0         
    //   34   75:getfield        #586 <Field ActionMenuView mMenuView>
    //   35   78:invokevirtual   #932 <Method void ActionMenuView.requestLayout()>
    //   36   81:aload_0         
    //   37   82:getfield        #894 <Field ActionBarContainer mSplitView>
    //   38   85:ifnull          104
    //   39   88:aload_0         
    //   40   89:getfield        #894 <Field ActionBarContainer mSplitView>
    //   41   92:astore_2        
    //   42   93:iload_1         
    //   43   94:ifeq            161
    //   44   97:iconst_0        
    //   45   98:istore_3        
    //   46   99:aload_2         
    //   47  100:iload_3         
    //   48  101:invokevirtual   #933 <Method void ActionBarContainer.setVisibility(int)>
    //   49  104:aload_0         
    //   50  105:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   51  108:ifnull          132
    //   52  111:iload_1         
    //   53  112:ifne            167
    //   54  115:aload_0         
    //   55  116:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   56  119:aload_0         
    //   57  120:invokevirtual   #222 <Method Resources getResources()>
    //   58  123:getstatic       #857 <Field int android.support.v7.appcompat.R$bool.abc_action_bar_expanded_action_views_exclusive>
    //   59  126:invokevirtual   #861 <Method boolean Resources.getBoolean(int)>
    //   60  129:invokevirtual   #864 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
    //   61  132:aload_0         
    //   62  133:iload_1         
    //   63  134:invokespecial   #935 <Method void AbsActionBarView.setSplitActionBar(boolean)>
    //   64  137:return          
    //   65  138:aload_0         
    //   66  139:aload_0         
    //   67  140:getfield        #586 <Field ActionMenuView mMenuView>
    //   68  143:invokevirtual   #400 <Method void addView(View)>
    //   69  146:aload_0         
    //   70  147:getfield        #586 <Field ActionMenuView mMenuView>
    //   71  150:invokevirtual   #931 <Method android.view.ViewGroup$LayoutParams ActionMenuView.getLayoutParams()>
    //   72  153:bipush          -2
    //   73  155:putfield        #531 <Field int android.view.ViewGroup$LayoutParams.width>
    //   74  158:goto            74
    //   75  161:bipush          8
    //   76  163:istore_3        
    //   77  164:goto            99
    //   78  167:aload_0         
    //   79  168:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   80  171:iconst_0        
    //   81  172:invokevirtual   #864 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
    //   82  175:aload_0         
    //   83  176:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   84  179:aload_0         
    //   85  180:invokevirtual   #351 <Method Context getContext()>
    //   86  183:invokevirtual   #794 <Method Resources Context.getResources()>
    //   87  186:invokevirtual   #877 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   88  189:getfield        #882 <Field int DisplayMetrics.widthPixels>
    //   89  192:iconst_1        
    //   90  193:invokevirtual   #886 <Method void ActionMenuPresenter.setWidthLimit(int, boolean)>
    //   91  196:aload_0         
    //   92  197:getfield        #328 <Field ActionMenuPresenter mActionMenuPresenter>
    //   93  200:ldc2            #887 <Int 0x7fffffff>
    //   94  203:invokevirtual   #890 <Method void ActionMenuPresenter.setItemLimit(int)>
    //   95  206:goto            132
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #939 <Method void AbsActionBarView.setSplitView(ActionBarContainer)>
    //    3    5:return          
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #942 <Method void AbsActionBarView.setSplitWhenNarrow(boolean)>
    //    3    5:return          
    }

    public void setSubtitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #149 <Field CharSequence mSubtitle>
    //    3    5:aload_0         
    //    4    6:getfield        #374 <Field TextView mSubtitleView>
    //    5    9:ifnull          97
    //    6   12:aload_0         
    //    7   13:getfield        #374 <Field TextView mSubtitleView>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #387 <Method void TextView.setText(CharSequence)>
    //   10   20:aload_0         
    //   11   21:getfield        #374 <Field TextView mSubtitleView>
    //   12   24:astore_2        
    //   13   25:aload_1         
    //   14   26:ifnull          98
    //   15   29:iconst_0        
    //   16   30:istore_3        
    //   17   31:aload_2         
    //   18   32:iload_3         
    //   19   33:invokevirtual   #390 <Method void TextView.setVisibility(int)>
    //   20   36:aload_0         
    //   21   37:getfield        #402 <Field View mExpandedActionView>
    //   22   40:ifnonnull       104
    //   23   43:bipush          8
    //   24   45:aload_0         
    //   25   46:getfield        #85  <Field int mDisplayOptions>
    //   26   49:iand            
    //   27   50:ifeq            104
    //   28   53:aload_0         
    //   29   54:getfield        #147 <Field CharSequence mTitle>
    //   30   57:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   31   60:ifeq            73
    //   32   63:aload_0         
    //   33   64:getfield        #149 <Field CharSequence mSubtitle>
    //   34   67:invokestatic    #408 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   35   70:ifne            104
    //   36   73:iconst_1        
    //   37   74:istore          4
    //   38   76:aload_0         
    //   39   77:getfield        #318 <Field LinearLayout mTitleLayout>
    //   40   80:astore          5
    //   41   82:iconst_0        
    //   42   83:istore          6
    //   43   85:iload           4
    //   44   87:ifeq            110
    //   45   90:aload           5
    //   46   92:iload           6
    //   47   94:invokevirtual   #409 <Method void LinearLayout.setVisibility(int)>
    //   48   97:return          
    //   49   98:bipush          8
    //   50  100:istore_3        
    //   51  101:goto            31
    //   52  104:iconst_0        
    //   53  105:istore          4
    //   54  107:goto            76
    //   55  110:bipush          8
    //   56  112:istore          6
    //   57  114:goto            90
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #945 <Field boolean mUserTitle>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:invokespecial   #947 <Method void setTitleImpl(CharSequence)>
    //    6   10:return          
    }

    public volatile void setVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #948 <Method void AbsActionBarView.setVisibility(int)>
    //    3    5:return          
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #952 <Field android.view.Window$Callback mWindowCallback>
    //    3    5:return          
    }

    public void setWindowTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #945 <Field boolean mUserTitle>
    //    2    4:ifne            12
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #947 <Method void setTitleImpl(CharSequence)>
    //    6   12:return          
    }

    public boolean shouldDelayChildPressedState()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public volatile boolean showOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #957 <Method boolean AbsActionBarView.showOverflowMenu()>
    //    2    4:ireturn         
    }

    private static final int DEFAULT_CUSTOM_GRAVITY = 19;
    public static final int DISPLAY_DEFAULT = 0;
    private static final int DISPLAY_RELAYOUT_MASK = 31;
    private static final String TAG = "ActionBarView";
    private android.support.v7.app.ActionBar.OnNavigationListener mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private View mCustomNavView;
    private int mDisplayOptions;
    View mExpandedActionView;
    private final android.view.View.OnClickListener mExpandedActionViewUpListener;
    private HomeView mExpandedHomeLayout;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private HomeView mHomeLayout;
    private Drawable mIcon;
    private boolean mIncludeTabs;
    private int mIndeterminateProgressStyle;
    private ProgressBarICS mIndeterminateProgressView;
    private boolean mIsCollapsable;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private LinearLayout mListNavLayout;
    private Drawable mLogo;
    private ActionMenuItem mLogoNavItem;
    private final AdapterViewICS.OnItemSelectedListener mNavItemSelectedListener;
    private int mNavigationMode;
    private MenuBuilder mOptionsMenu;
    private int mProgressBarPadding;
    private int mProgressStyle;
    private ProgressBarICS mProgressView;
    private SpinnerICS mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private ScrollingTabContainerView mTabScrollView;
    private Runnable mTabSelector;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private View mTitleUpView;
    private TextView mTitleView;
    private final android.view.View.OnClickListener mUpClickListener;
    private boolean mUserTitle;
    android.view.Window.Callback mWindowCallback;

    static android.support.v7.app.ActionBar.OnNavigationListener access$000(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #290 <Field android.support.v7.app.ActionBar$OnNavigationListener mCallback>
    //    2    4:areturn         
    }

    static ExpandedActionViewMenuPresenter access$100(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ActionBarView$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
    //    2    4:areturn         
    }

    static SpinnerICS access$1000(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field SpinnerICS mSpinner>
    //    2    4:areturn         
    }

    static View access$1100(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field View mCustomNavView>
    //    2    4:areturn         
    }

    static int access$1200(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mDisplayOptions>
    //    2    4:ireturn         
    }

    static void access$1300(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #306 <Method void initTitle()>
    //    2    4:return          
    }

    static int access$1400(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #141 <Field int mNavigationMode>
    //    2    4:ireturn         
    }

    static ActionMenuItem access$200(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #272 <Field ActionMenuItem mLogoNavItem>
    //    2    4:areturn         
    }

    static Drawable access$500(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #180 <Field Drawable mIcon>
    //    2    4:areturn         
    }

    static HomeView access$600(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #210 <Field ActionBarView$HomeView mExpandedHomeLayout>
    //    2    4:areturn         
    }

    static HomeView access$700(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field ActionBarView$HomeView mHomeLayout>
    //    2    4:areturn         
    }

    static LinearLayout access$800(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #318 <Field LinearLayout mTitleLayout>
    //    2    4:areturn         
    }

    static ScrollingTabContainerView access$900(ActionBarView actionbarview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #322 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ActionBarView$1

/* anonymous class */
    class _cls1
        implements AdapterViewICS.OnItemSelectedListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onItemSelected(AdapterViewICS adapterviewics, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActionBarView this$0>
        //    2    4:invokestatic    #23  <Method android.support.v7.app.ActionBar$OnNavigationListener ActionBarView.access$000(ActionBarView)>
        //    3    7:ifnull          26
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionBarView this$0>
        //    6   14:invokestatic    #23  <Method android.support.v7.app.ActionBar$OnNavigationListener ActionBarView.access$000(ActionBarView)>
        //    7   17:iload_3         
        //    8   18:lload           4
        //    9   20:invokeinterface #29  <Method boolean android.support.v7.app.ActionBar$OnNavigationListener.onNavigationItemSelected(int, long)>
        //   10   25:pop             
        //   11   26:return          
        }

        public void onNothingSelected(AdapterViewICS adapterviewics)
        {
        //    0    0:return          
        }

        final ActionBarView this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ActionBarView$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActionBarView this$0>
        //    2    4:invokestatic    #23  <Method ActionBarView$ExpandedActionViewMenuPresenter ActionBarView.access$100(ActionBarView)>
        //    3    7:getfield        #29  <Field MenuItemImpl ActionBarView$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
        //    4   10:astore_2        
        //    5   11:aload_2         
        //    6   12:ifnull          20
        //    7   15:aload_2         
        //    8   16:invokevirtual   #35  <Method boolean MenuItemImpl.collapseActionView()>
        //    9   19:pop             
        //   10   20:return          
        }

        final ActionBarView this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ActionBarView$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActionBarView this$0>
        //    2    4:getfield        #23  <Field android.view.Window$Callback ActionBarView.mWindowCallback>
        //    3    7:iconst_0        
        //    4    8:aload_0         
        //    5    9:getfield        #14  <Field ActionBarView this$0>
        //    6   12:invokestatic    #27  <Method ActionMenuItem ActionBarView.access$200(ActionBarView)>
        //    7   15:invokeinterface #33  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, android.view.MenuItem)>
        //    8   20:pop             
        //    9   21:return          
        }

        final ActionBarView this$0;
    }


    // Unreferenced inner class android/support/v7/internal/widget/ActionBarView$SavedState$1

/* anonymous class */
    static final class SavedState._cls1
        implements android.os.Parcelable.Creator
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public SavedState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class ActionBarView$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void ActionBarView$SavedState(Parcel, ActionBarView$1)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method ActionBarView$SavedState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public SavedState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       SavedState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method ActionBarView$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
