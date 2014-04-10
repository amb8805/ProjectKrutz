// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.view.ActionBarPolicy;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.*;
import android.widget.ImageButton;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuPresenter, ActionMenuView, ActionMenuItemView, MenuBuilder, 
//            MenuItemImpl, MenuPopupHelper, SubMenuBuilder, MenuView, 
//            MenuDialogHelper

public class ActionMenuPresenter extends BaseMenuPresenter
    implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
    private class ActionButtonSubmenu extends MenuDialogHelper
    {

        public ActionButtonSubmenu(SubMenuBuilder submenubuilder)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ActionMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #13  <Method void MenuDialogHelper(MenuBuilder)>
        //    6   10:aload_1         
        //    7   11:aload_1         
        //    8   12:getfield        #19  <Field ActionMenuPresenter$PopupPresenterCallback ActionMenuPresenter.mPopupPresenterCallback>
        //    9   15:invokevirtual   #23  <Method void ActionMenuPresenter.setCallback(MenuPresenter$Callback)>
        //   10   18:return          
        }

        public void onDismiss(DialogInterface dialoginterface)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #27  <Method void MenuDialogHelper.onDismiss(DialogInterface)>
        //    3    5:aload_0         
        //    4    6:getfield        #10  <Field ActionMenuPresenter this$0>
        //    5    9:aconst_null     
        //    6   10:invokestatic    #31  <Method ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.access$202(ActionMenuPresenter, ActionMenuPresenter$ActionButtonSubmenu)>
        //    7   13:pop             
        //    8   14:aload_0         
        //    9   15:getfield        #10  <Field ActionMenuPresenter this$0>
        //   10   18:iconst_0        
        //   11   19:putfield        #35  <Field int ActionMenuPresenter.mOpenSubMenuId>
        //   12   22:return          
        }

        final ActionMenuPresenter this$0;
    }

    private class OpenOverflowRunnable
        implements Runnable
    {

        public OpenOverflowRunnable(OverflowPopup overflowpopup)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field ActionMenuPresenter$OverflowPopup mPopup>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActionMenuPresenter this$0>
        //    2    4:getfield        #26  <Field MenuBuilder ActionMenuPresenter.mMenu>
        //    3    7:invokevirtual   #31  <Method void MenuBuilder.changeMenuMode()>
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionMenuPresenter this$0>
        //    6   14:getfield        #35  <Field MenuView ActionMenuPresenter.mMenuView>
        //    7   17:checkcast       #37  <Class View>
        //    8   20:astore_1        
        //    9   21:aload_1         
        //   10   22:ifnull          54
        //   11   25:aload_1         
        //   12   26:invokevirtual   #41  <Method android.os.IBinder View.getWindowToken()>
        //   13   29:ifnull          54
        //   14   32:aload_0         
        //   15   33:getfield        #19  <Field ActionMenuPresenter$OverflowPopup mPopup>
        //   16   36:invokevirtual   #47  <Method boolean ActionMenuPresenter$OverflowPopup.tryShow()>
        //   17   39:ifeq            54
        //   18   42:aload_0         
        //   19   43:getfield        #14  <Field ActionMenuPresenter this$0>
        //   20   46:aload_0         
        //   21   47:getfield        #19  <Field ActionMenuPresenter$OverflowPopup mPopup>
        //   22   50:invokestatic    #51  <Method ActionMenuPresenter$OverflowPopup ActionMenuPresenter.access$102(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
        //   23   53:pop             
        //   24   54:aload_0         
        //   25   55:getfield        #14  <Field ActionMenuPresenter this$0>
        //   26   58:aconst_null     
        //   27   59:invokestatic    #55  <Method ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.access$302(ActionMenuPresenter, ActionMenuPresenter$OpenOverflowRunnable)>
        //   28   62:pop             
        //   29   63:return          
        }

        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;
    }

    private class OverflowMenuButton extends ImageButton
        implements ActionMenuView.ActionMenuChildView
    {

        public OverflowMenuButton(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ActionMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:aconst_null     
        //    6    8:getstatic       #18  <Field int android.support.v7.appcompat.R$attr.actionOverflowButtonStyle>
        //    7   11:invokespecial   #21  <Method void ImageButton(Context, android.util.AttributeSet, int)>
        //    8   14:aload_0         
        //    9   15:iconst_1        
        //   10   16:invokevirtual   #25  <Method void setClickable(boolean)>
        //   11   19:aload_0         
        //   12   20:iconst_1        
        //   13   21:invokevirtual   #28  <Method void setFocusable(boolean)>
        //   14   24:aload_0         
        //   15   25:iconst_0        
        //   16   26:invokevirtual   #32  <Method void setVisibility(int)>
        //   17   29:aload_0         
        //   18   30:iconst_1        
        //   19   31:invokevirtual   #35  <Method void setEnabled(boolean)>
        //   20   34:return          
        }

        public boolean needsDividerAfter()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean needsDividerBefore()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean performClick()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #41  <Method boolean ImageButton.performClick()>
        //    2    4:ifeq            9
        //    3    7:iconst_1        
        //    4    8:ireturn         
        //    5    9:aload_0         
        //    6   10:iconst_0        
        //    7   11:invokevirtual   #44  <Method void playSoundEffect(int)>
        //    8   14:aload_0         
        //    9   15:getfield        #12  <Field ActionMenuPresenter this$0>
        //   10   18:invokevirtual   #49  <Method boolean ActionMenuPresenter.showOverflowMenu()>
        //   11   21:pop             
        //   12   22:iconst_1        
        //   13   23:ireturn         
        }

        final ActionMenuPresenter this$0;
    }

    private class OverflowPopup extends MenuPopupHelper
    {

        public OverflowPopup(Context context, MenuBuilder menubuilder, View view, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ActionMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:aload_3         
        //    6    8:aload           4
        //    7   10:iload           5
        //    8   12:invokespecial   #13  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean)>
        //    9   15:aload_0         
        //   10   16:aload_1         
        //   11   17:getfield        #19  <Field ActionMenuPresenter$PopupPresenterCallback ActionMenuPresenter.mPopupPresenterCallback>
        //   12   20:invokevirtual   #23  <Method void setCallback(MenuPresenter$Callback)>
        //   13   23:return          
        }

        public void onDismiss()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #27  <Method void MenuPopupHelper.onDismiss()>
        //    2    4:aload_0         
        //    3    5:getfield        #10  <Field ActionMenuPresenter this$0>
        //    4    8:getfield        #31  <Field MenuBuilder ActionMenuPresenter.mMenu>
        //    5   11:invokevirtual   #36  <Method void MenuBuilder.close()>
        //    6   14:aload_0         
        //    7   15:getfield        #10  <Field ActionMenuPresenter this$0>
        //    8   18:aconst_null     
        //    9   19:invokestatic    #40  <Method ActionMenuPresenter$OverflowPopup ActionMenuPresenter.access$102(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
        //   10   22:pop             
        //   11   23:return          
        }

        final ActionMenuPresenter this$0;
    }

    private class PopupPresenterCallback
        implements MenuPresenter.Callback
    {

        private PopupPresenterCallback()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ActionMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        PopupPresenterCallback(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter)>
        //    3    5:return          
        }

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:instanceof      #22  <Class SubMenuBuilder>
        //    2    4:ifeq            18
        //    3    7:aload_1         
        //    4    8:checkcast       #22  <Class SubMenuBuilder>
        //    5   11:invokevirtual   #26  <Method MenuBuilder SubMenuBuilder.getRootMenu()>
        //    6   14:iconst_0        
        //    7   15:invokevirtual   #32  <Method void MenuBuilder.close(boolean)>
        //    8   18:return          
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
        //    0    0:aload_1         
        //    1    1:ifnonnull       6
        //    2    4:iconst_0        
        //    3    5:ireturn         
        //    4    6:aload_0         
        //    5    7:getfield        #12  <Field ActionMenuPresenter this$0>
        //    6   10:aload_1         
        //    7   11:checkcast       #22  <Class SubMenuBuilder>
        //    8   14:invokevirtual   #38  <Method MenuItem SubMenuBuilder.getItem()>
        //    9   17:invokeinterface #44  <Method int MenuItem.getItemId()>
        //   10   22:putfield        #50  <Field int ActionMenuPresenter.mOpenSubMenuId>
        //   11   25:iconst_0        
        //   12   26:ireturn         
        }

        final ActionMenuPresenter this$0;
    }

    private static class SavedState
        implements Parcelable
    {

        static 
        {
        //    0    0:new             #15  <Class ActionMenuPresenter$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #18  <Method void ActionMenuPresenter$SavedState$1()>
        //    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        SavedState()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #21  <Method void Object()>
        //    2    4:return          
        }

        SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #21  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #28  <Method int Parcel.readInt()>
        //    5    9:putfield        #30  <Field int openSubMenuId>
        //    6   12:return          
        }

        public int describeContents()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #30  <Field int openSubMenuId>
        //    3    5:invokevirtual   #37  <Method void Parcel.writeInt(int)>
        //    4    8:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        public int openSubMenuId;
    }


    public ActionMenuPresenter(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getstatic       #43  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_layout>
    //    3    5:getstatic       #46  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_item_layout>
    //    4    8:invokespecial   #49  <Method void BaseMenuPresenter(Context, int, int)>
    //    5   11:aload_0         
    //    6   12:new             #51  <Class SparseBooleanArray>
    //    7   15:dup             
    //    8   16:invokespecial   #54  <Method void SparseBooleanArray()>
    //    9   19:putfield        #56  <Field SparseBooleanArray mActionButtonGroups>
    //   10   22:aload_0         
    //   11   23:new             #58  <Class ActionMenuPresenter$PopupPresenterCallback>
    //   12   26:dup             
    //   13   27:aload_0         
    //   14   28:aconst_null     
    //   15   29:invokespecial   #61  <Method void ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter, ActionMenuPresenter$1)>
    //   16   32:putfield        #63  <Field ActionMenuPresenter$PopupPresenterCallback mPopupPresenterCallback>
    //   17   35:return          
    }

    static OverflowPopup access$102(ActionMenuPresenter actionmenupresenter, OverflowPopup overflowpopup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    static ActionButtonSubmenu access$202(ActionMenuPresenter actionmenupresenter, ActionButtonSubmenu actionbuttonsubmenu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    static OpenOverflowRunnable access$302(ActionMenuPresenter actionmenupresenter, OpenOverflowRunnable openoverflowrunnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    private View findViewForItem(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuView mMenuView>
    //    2    4:checkcast       #83  <Class ViewGroup>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ifnonnull       18
    //    6   12:aconst_null     
    //    7   13:astore          5
    //    8   15:aload           5
    //    9   17:areturn         
    //   10   18:aload_2         
    //   11   19:invokevirtual   #87  <Method int ViewGroup.getChildCount()>
    //   12   22:istore_3        
    //   13   23:iconst_0        
    //   14   24:istore          4
    //   15   26:iload           4
    //   16   28:iload_3         
    //   17   29:icmpge          68
    //   18   32:aload_2         
    //   19   33:iload           4
    //   20   35:invokevirtual   #91  <Method View ViewGroup.getChildAt(int)>
    //   21   38:astore          5
    //   22   40:aload           5
    //   23   42:instanceof      #93  <Class MenuView$ItemView>
    //   24   45:ifeq            62
    //   25   48:aload           5
    //   26   50:checkcast       #93  <Class MenuView$ItemView>
    //   27   53:invokeinterface #97  <Method MenuItemImpl MenuView$ItemView.getItemData()>
    //   28   58:aload_1         
    //   29   59:if_acmpeq       15
    //   30   62:iinc            4  1
    //   31   65:goto            26
    //   32   68:aconst_null     
    //   33   69:areturn         
    }

    public void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokeinterface #103 <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
    //    4    8:aload_0         
    //    5    9:getfield        #81  <Field MenuView mMenuView>
    //    6   12:checkcast       #105 <Class ActionMenuView>
    //    7   15:astore_3        
    //    8   16:aload_2         
    //    9   17:checkcast       #107 <Class ActionMenuItemView>
    //   10   20:aload_3         
    //   11   21:invokevirtual   #111 <Method void ActionMenuItemView.setItemInvoker(MenuBuilder$ItemInvoker)>
    //   12   24:return          
    }

    public boolean dismissPopupMenus()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #116 <Method boolean hideOverflowMenu()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #119 <Method boolean hideSubMenus()>
    //    4    8:ior             
    //    5    9:ireturn         
    }

    public boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:invokevirtual   #91  <Method View ViewGroup.getChildAt(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #123 <Field View mOverflowButton>
    //    5    9:if_acmpne       14
    //    6   12:iconst_0        
    //    7   13:ireturn         
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:iload_2         
    //   11   17:invokespecial   #125 <Method boolean BaseMenuPresenter.filterLeftoverView(ViewGroup, int)>
    //   12   20:ireturn         
    }

    public boolean flagActionItems()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #130 <Field MenuBuilder mMenu>
    //    2    4:invokevirtual   #136 <Method ArrayList MenuBuilder.getVisibleItems()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokevirtual   #141 <Method int ArrayList.size()>
    //    6   12:istore_2        
    //    7   13:aload_0         
    //    8   14:getfield        #143 <Field int mMaxItems>
    //    9   17:istore_3        
    //   10   18:aload_0         
    //   11   19:getfield        #145 <Field int mActionItemWidthLimit>
    //   12   22:istore          4
    //   13   24:iconst_0        
    //   14   25:iconst_0        
    //   15   26:invokestatic    #151 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   16   29:istore          5
    //   17   31:aload_0         
    //   18   32:getfield        #81  <Field MenuView mMenuView>
    //   19   35:checkcast       #83  <Class ViewGroup>
    //   20   38:astore          6
    //   21   40:iconst_0        
    //   22   41:istore          7
    //   23   43:iconst_0        
    //   24   44:istore          8
    //   25   46:iconst_0        
    //   26   47:istore          9
    //   27   49:iconst_0        
    //   28   50:istore          10
    //   29   52:iconst_0        
    //   30   53:istore          11
    //   31   55:iload           11
    //   32   57:iload_2         
    //   33   58:icmpge          126
    //   34   61:aload_1         
    //   35   62:iload           11
    //   36   64:invokevirtual   #155 <Method Object ArrayList.get(int)>
    //   37   67:checkcast       #157 <Class MenuItemImpl>
    //   38   70:astore          33
    //   39   72:aload           33
    //   40   74:invokevirtual   #160 <Method boolean MenuItemImpl.requiresActionButton()>
    //   41   77:ifeq            106
    //   42   80:iinc            7  1
    //   43   83:aload_0         
    //   44   84:getfield        #162 <Field boolean mExpandedActionViewsExclusive>
    //   45   87:ifeq            100
    //   46   90:aload           33
    //   47   92:invokevirtual   #165 <Method boolean MenuItemImpl.isActionViewExpanded()>
    //   48   95:ifeq            100
    //   49   98:iconst_0        
    //   50   99:istore_3        
    //   51  100:iinc            11  1
    //   52  103:goto            55
    //   53  106:aload           33
    //   54  108:invokevirtual   #168 <Method boolean MenuItemImpl.requestsActionButton()>
    //   55  111:ifeq            120
    //   56  114:iinc            8  1
    //   57  117:goto            83
    //   58  120:iconst_1        
    //   59  121:istore          10
    //   60  123:goto            83
    //   61  126:aload_0         
    //   62  127:getfield        #170 <Field boolean mReserveOverflow>
    //   63  130:ifeq            150
    //   64  133:iload           10
    //   65  135:ifne            147
    //   66  138:iload           7
    //   67  140:iload           8
    //   68  142:iadd            
    //   69  143:iload_3         
    //   70  144:icmple          150
    //   71  147:iinc            3  -1
    //   72  150:iload_3         
    //   73  151:iload           7
    //   74  153:isub            
    //   75  154:istore          12
    //   76  156:aload_0         
    //   77  157:getfield        #56  <Field SparseBooleanArray mActionButtonGroups>
    //   78  160:astore          13
    //   79  162:aload           13
    //   80  164:invokevirtual   #173 <Method void SparseBooleanArray.clear()>
    //   81  167:aload_0         
    //   82  168:getfield        #175 <Field boolean mStrictWidthLimit>
    //   83  171:istore          14
    //   84  173:iconst_0        
    //   85  174:istore          15
    //   86  176:iconst_0        
    //   87  177:istore          16
    //   88  179:iload           14
    //   89  181:ifeq            214
    //   90  184:iload           4
    //   91  186:aload_0         
    //   92  187:getfield        #177 <Field int mMinCellSize>
    //   93  190:idiv            
    //   94  191:istore          16
    //   95  193:iload           4
    //   96  195:aload_0         
    //   97  196:getfield        #177 <Field int mMinCellSize>
    //   98  199:irem            
    //   99  200:istore          32
    //  100  202:aload_0         
    //  101  203:getfield        #177 <Field int mMinCellSize>
    //  102  206:iload           32
    //  103  208:iload           16
    //  104  210:idiv            
    //  105  211:iadd            
    //  106  212:istore          15
    //  107  214:iconst_0        
    //  108  215:istore          17
    //  109  217:iload           17
    //  110  219:iload_2         
    //  111  220:icmpge          681
    //  112  223:aload_1         
    //  113  224:iload           17
    //  114  226:invokevirtual   #155 <Method Object ArrayList.get(int)>
    //  115  229:checkcast       #157 <Class MenuItemImpl>
    //  116  232:astore          18
    //  117  234:aload           18
    //  118  236:invokevirtual   #160 <Method boolean MenuItemImpl.requiresActionButton()>
    //  119  239:ifeq            360
    //  120  242:aload_0         
    //  121  243:aload           18
    //  122  245:aload_0         
    //  123  246:getfield        #179 <Field View mScrapActionButtonView>
    //  124  249:aload           6
    //  125  251:invokevirtual   #183 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
    //  126  254:astore          29
    //  127  256:aload_0         
    //  128  257:getfield        #179 <Field View mScrapActionButtonView>
    //  129  260:ifnonnull       269
    //  130  263:aload_0         
    //  131  264:aload           29
    //  132  266:putfield        #179 <Field View mScrapActionButtonView>
    //  133  269:aload_0         
    //  134  270:getfield        #175 <Field boolean mStrictWidthLimit>
    //  135  273:ifeq            348
    //  136  276:iload           16
    //  137  278:aload           29
    //  138  280:iload           15
    //  139  282:iload           16
    //  140  284:iload           5
    //  141  286:iconst_0        
    //  142  287:invokestatic    #187 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
    //  143  290:isub            
    //  144  291:istore          16
    //  145  293:aload           29
    //  146  295:invokevirtual   #192 <Method int View.getMeasuredWidth()>
    //  147  298:istore          30
    //  148  300:iload           4
    //  149  302:iload           30
    //  150  304:isub            
    //  151  305:istore          4
    //  152  307:iload           9
    //  153  309:ifne            316
    //  154  312:iload           30
    //  155  314:istore          9
    //  156  316:aload           18
    //  157  318:invokevirtual   #195 <Method int MenuItemImpl.getGroupId()>
    //  158  321:istore          31
    //  159  323:iload           31
    //  160  325:ifeq            336
    //  161  328:aload           13
    //  162  330:iload           31
    //  163  332:iconst_1        
    //  164  333:invokevirtual   #199 <Method void SparseBooleanArray.put(int, boolean)>
    //  165  336:aload           18
    //  166  338:iconst_1        
    //  167  339:invokevirtual   #203 <Method void MenuItemImpl.setIsActionButton(boolean)>
    //  168  342:iinc            17  1
    //  169  345:goto            217
    //  170  348:aload           29
    //  171  350:iload           5
    //  172  352:iload           5
    //  173  354:invokevirtual   #207 <Method void View.measure(int, int)>
    //  174  357:goto            293
    //  175  360:aload           18
    //  176  362:invokevirtual   #168 <Method boolean MenuItemImpl.requestsActionButton()>
    //  177  365:ifeq            342
    //  178  368:aload           18
    //  179  370:invokevirtual   #195 <Method int MenuItemImpl.getGroupId()>
    //  180  373:istore          19
    //  181  375:aload           13
    //  182  377:iload           19
    //  183  379:invokevirtual   #210 <Method boolean SparseBooleanArray.get(int)>
    //  184  382:istore          20
    //  185  384:iload           12
    //  186  386:ifgt            394
    //  187  389:iload           20
    //  188  391:ifeq            563
    //  189  394:iload           4
    //  190  396:ifle            563
    //  191  399:aload_0         
    //  192  400:getfield        #175 <Field boolean mStrictWidthLimit>
    //  193  403:ifeq            411
    //  194  406:iload           16
    //  195  408:ifle            563
    //  196  411:iconst_1        
    //  197  412:istore          21
    //  198  414:iload           21
    //  199  416:ifeq            527
    //  200  419:aload_0         
    //  201  420:aload           18
    //  202  422:aload_0         
    //  203  423:getfield        #179 <Field View mScrapActionButtonView>
    //  204  426:aload           6
    //  205  428:invokevirtual   #183 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
    //  206  431:astore          24
    //  207  433:aload_0         
    //  208  434:getfield        #179 <Field View mScrapActionButtonView>
    //  209  437:ifnonnull       446
    //  210  440:aload_0         
    //  211  441:aload           24
    //  212  443:putfield        #179 <Field View mScrapActionButtonView>
    //  213  446:aload_0         
    //  214  447:getfield        #175 <Field boolean mStrictWidthLimit>
    //  215  450:ifeq            569
    //  216  453:aload           24
    //  217  455:iload           15
    //  218  457:iload           16
    //  219  459:iload           5
    //  220  461:iconst_0        
    //  221  462:invokestatic    #187 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
    //  222  465:istore          28
    //  223  467:iload           16
    //  224  469:iload           28
    //  225  471:isub            
    //  226  472:istore          16
    //  227  474:iload           28
    //  228  476:ifne            482
    //  229  479:iconst_0        
    //  230  480:istore          21
    //  231  482:aload           24
    //  232  484:invokevirtual   #192 <Method int View.getMeasuredWidth()>
    //  233  487:istore          25
    //  234  489:iload           4
    //  235  491:iload           25
    //  236  493:isub            
    //  237  494:istore          4
    //  238  496:iload           9
    //  239  498:ifne            505
    //  240  501:iload           25
    //  241  503:istore          9
    //  242  505:aload_0         
    //  243  506:getfield        #175 <Field boolean mStrictWidthLimit>
    //  244  509:ifeq            587
    //  245  512:iload           4
    //  246  514:iflt            581
    //  247  517:iconst_1        
    //  248  518:istore          27
    //  249  520:iload           21
    //  250  522:iload           27
    //  251  524:iand            
    //  252  525:istore          21
    //  253  527:iload           21
    //  254  529:ifeq            614
    //  255  532:iload           19
    //  256  534:ifeq            614
    //  257  537:aload           13
    //  258  539:iload           19
    //  259  541:iconst_1        
    //  260  542:invokevirtual   #199 <Method void SparseBooleanArray.put(int, boolean)>
    //  261  545:iload           21
    //  262  547:ifeq            553
    //  263  550:iinc            12  -1
    //  264  553:aload           18
    //  265  555:iload           21
    //  266  557:invokevirtual   #203 <Method void MenuItemImpl.setIsActionButton(boolean)>
    //  267  560:goto            342
    //  268  563:iconst_0        
    //  269  564:istore          21
    //  270  566:goto            414
    //  271  569:aload           24
    //  272  571:iload           5
    //  273  573:iload           5
    //  274  575:invokevirtual   #207 <Method void View.measure(int, int)>
    //  275  578:goto            482
    //  276  581:iconst_0        
    //  277  582:istore          27
    //  278  584:goto            520
    //  279  587:iload           4
    //  280  589:iload           9
    //  281  591:iadd            
    //  282  592:ifle            608
    //  283  595:iconst_1        
    //  284  596:istore          26
    //  285  598:iload           21
    //  286  600:iload           26
    //  287  602:iand            
    //  288  603:istore          21
    //  289  605:goto            527
    //  290  608:iconst_0        
    //  291  609:istore          26
    //  292  611:goto            598
    //  293  614:iload           20
    //  294  616:ifeq            545
    //  295  619:aload           13
    //  296  621:iload           19
    //  297  623:iconst_0        
    //  298  624:invokevirtual   #199 <Method void SparseBooleanArray.put(int, boolean)>
    //  299  627:iconst_0        
    //  300  628:istore          22
    //  301  630:iload           22
    //  302  632:iload           17
    //  303  634:icmpge          545
    //  304  637:aload_1         
    //  305  638:iload           22
    //  306  640:invokevirtual   #155 <Method Object ArrayList.get(int)>
    //  307  643:checkcast       #157 <Class MenuItemImpl>
    //  308  646:astore          23
    //  309  648:aload           23
    //  310  650:invokevirtual   #195 <Method int MenuItemImpl.getGroupId()>
    //  311  653:iload           19
    //  312  655:icmpne          675
    //  313  658:aload           23
    //  314  660:invokevirtual   #213 <Method boolean MenuItemImpl.isActionButton()>
    //  315  663:ifeq            669
    //  316  666:iinc            12  1
    //  317  669:aload           23
    //  318  671:iconst_0        
    //  319  672:invokevirtual   #203 <Method void MenuItemImpl.setIsActionButton(boolean)>
    //  320  675:iinc            22  1
    //  321  678:goto            630
    //  322  681:iconst_1        
    //  323  682:ireturn         
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #217 <Method View MenuItemImpl.getActionView()>
    //    2    4:astore          4
    //    3    6:aload           4
    //    4    8:ifnull          18
    //    5   11:aload_1         
    //    6   12:invokevirtual   #220 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
    //    7   15:ifeq            36
    //    8   18:aload_2         
    //    9   19:instanceof      #107 <Class ActionMenuItemView>
    //   10   22:ifne            27
    //   11   25:aconst_null     
    //   12   26:astore_2        
    //   13   27:aload_0         
    //   14   28:aload_1         
    //   15   29:aload_2         
    //   16   30:aload_3         
    //   17   31:invokespecial   #221 <Method View BaseMenuPresenter.getItemView(MenuItemImpl, View, ViewGroup)>
    //   18   34:astore          4
    //   19   36:aload_1         
    //   20   37:invokevirtual   #165 <Method boolean MenuItemImpl.isActionViewExpanded()>
    //   21   40:ifeq            92
    //   22   43:bipush          8
    //   23   45:istore          5
    //   24   47:aload           4
    //   25   49:iload           5
    //   26   51:invokevirtual   #225 <Method void View.setVisibility(int)>
    //   27   54:aload_3         
    //   28   55:checkcast       #105 <Class ActionMenuView>
    //   29   58:astore          6
    //   30   60:aload           4
    //   31   62:invokevirtual   #229 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   32   65:astore          7
    //   33   67:aload           6
    //   34   69:aload           7
    //   35   71:invokevirtual   #233 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   36   74:ifne            89
    //   37   77:aload           4
    //   38   79:aload           6
    //   39   81:aload           7
    //   40   83:invokevirtual   #237 <Method ActionMenuView$LayoutParams ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   41   86:invokevirtual   #241 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   42   89:aload           4
    //   43   91:areturn         
    //   44   92:iconst_0        
    //   45   93:istore          5
    //   46   95:goto            47
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #245 <Method MenuView BaseMenuPresenter.getMenuView(ViewGroup)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:checkcast       #105 <Class ActionMenuView>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #249 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
    //    8   14:aload_2         
    //    9   15:areturn         
    }

    public boolean hideOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //    2    4:ifnull          36
    //    3    7:aload_0         
    //    4    8:getfield        #81  <Field MenuView mMenuView>
    //    5   11:ifnull          36
    //    6   14:aload_0         
    //    7   15:getfield        #81  <Field MenuView mMenuView>
    //    8   18:checkcast       #189 <Class View>
    //    9   21:aload_0         
    //   10   22:getfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //   11   25:invokevirtual   #253 <Method boolean View.removeCallbacks(Runnable)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:aconst_null     
    //   15   31:putfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //   16   34:iconst_1        
    //   17   35:ireturn         
    //   18   36:aload_0         
    //   19   37:getfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //   20   40:astore_1        
    //   21   41:aload_1         
    //   22   42:ifnull          51
    //   23   45:aload_1         
    //   24   46:invokevirtual   #258 <Method void MenuPopupHelper.dismiss()>
    //   25   49:iconst_1        
    //   26   50:ireturn         
    //   27   51:iconst_0        
    //   28   52:ireturn         
    }

    public boolean hideSubMenus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //    5   11:invokevirtual   #261 <Method void ActionMenuPresenter$ActionButtonSubmenu.dismiss()>
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #265 <Method void BaseMenuPresenter.initForMenu(Context, MenuBuilder)>
    //    4    6:aload_1         
    //    5    7:invokevirtual   #271 <Method Resources Context.getResources()>
    //    6   10:astore_3        
    //    7   11:aload_1         
    //    8   12:invokestatic    #276 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
    //    9   15:astore          4
    //   10   17:aload_0         
    //   11   18:getfield        #278 <Field boolean mReserveOverflowSet>
    //   12   21:ifne            33
    //   13   24:aload_0         
    //   14   25:aload           4
    //   15   27:invokevirtual   #281 <Method boolean ActionBarPolicy.showsOverflowMenuButton()>
    //   16   30:putfield        #170 <Field boolean mReserveOverflow>
    //   17   33:aload_0         
    //   18   34:getfield        #283 <Field boolean mWidthLimitSet>
    //   19   37:ifne            49
    //   20   40:aload_0         
    //   21   41:aload           4
    //   22   43:invokevirtual   #286 <Method int ActionBarPolicy.getEmbeddedMenuWidthLimit()>
    //   23   46:putfield        #288 <Field int mWidthLimit>
    //   24   49:aload_0         
    //   25   50:getfield        #290 <Field boolean mMaxItemsSet>
    //   26   53:ifne            65
    //   27   56:aload_0         
    //   28   57:aload           4
    //   29   59:invokevirtual   #293 <Method int ActionBarPolicy.getMaxActionButtons()>
    //   30   62:putfield        #143 <Field int mMaxItems>
    //   31   65:aload_0         
    //   32   66:getfield        #288 <Field int mWidthLimit>
    //   33   69:istore          5
    //   34   71:aload_0         
    //   35   72:getfield        #170 <Field boolean mReserveOverflow>
    //   36   75:ifeq            159
    //   37   78:aload_0         
    //   38   79:getfield        #123 <Field View mOverflowButton>
    //   39   82:ifnonnull       119
    //   40   85:aload_0         
    //   41   86:new             #295 <Class ActionMenuPresenter$OverflowMenuButton>
    //   42   89:dup             
    //   43   90:aload_0         
    //   44   91:aload_0         
    //   45   92:getfield        #299 <Field Context mSystemContext>
    //   46   95:invokespecial   #302 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
    //   47   98:putfield        #123 <Field View mOverflowButton>
    //   48  101:iconst_0        
    //   49  102:iconst_0        
    //   50  103:invokestatic    #151 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   51  106:istore          6
    //   52  108:aload_0         
    //   53  109:getfield        #123 <Field View mOverflowButton>
    //   54  112:iload           6
    //   55  114:iload           6
    //   56  116:invokevirtual   #207 <Method void View.measure(int, int)>
    //   57  119:iload           5
    //   58  121:aload_0         
    //   59  122:getfield        #123 <Field View mOverflowButton>
    //   60  125:invokevirtual   #192 <Method int View.getMeasuredWidth()>
    //   61  128:isub            
    //   62  129:istore          5
    //   63  131:aload_0         
    //   64  132:iload           5
    //   65  134:putfield        #145 <Field int mActionItemWidthLimit>
    //   66  137:aload_0         
    //   67  138:ldc2            #303 <Float 56F>
    //   68  141:aload_3         
    //   69  142:invokevirtual   #309 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   70  145:getfield        #315 <Field float DisplayMetrics.density>
    //   71  148:fmul            
    //   72  149:f2i             
    //   73  150:putfield        #177 <Field int mMinCellSize>
    //   74  153:aload_0         
    //   75  154:aconst_null     
    //   76  155:putfield        #179 <Field View mScrapActionButtonView>
    //   77  158:return          
    //   78  159:aload_0         
    //   79  160:aconst_null     
    //   80  161:putfield        #123 <Field View mOverflowButton>
    //   81  164:goto            131
    }

    public boolean isOverflowMenuShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //    5   11:invokevirtual   #321 <Method boolean ActionMenuPresenter$OverflowPopup.isShowing()>
    //    6   14:ifeq            19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    public boolean isOverflowReserved()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field boolean mReserveOverflow>
    //    2    4:ireturn         
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #326 <Method boolean dismissPopupMenus()>
    //    2    4:pop             
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:iload_2         
    //    6    8:invokespecial   #328 <Method void BaseMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
    //    7   11:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #290 <Field boolean mMaxItemsSet>
    //    2    4:ifne            24
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #333 <Field Context mContext>
    //    6   12:invokevirtual   #271 <Method Resources Context.getResources()>
    //    7   15:getstatic       #338 <Field int android.support.v7.appcompat.R$integer.abc_max_action_buttons>
    //    8   18:invokevirtual   #342 <Method int Resources.getInteger(int)>
    //    9   21:putfield        #143 <Field int mMaxItems>
    //   10   24:aload_0         
    //   11   25:getfield        #130 <Field MenuBuilder mMenu>
    //   12   28:ifnull          39
    //   13   31:aload_0         
    //   14   32:getfield        #130 <Field MenuBuilder mMenu>
    //   15   35:iconst_1        
    //   16   36:invokevirtual   #345 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   17   39:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #349 <Class ActionMenuPresenter$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:getfield        #352 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
    //    5    9:ifle            42
    //    6   12:aload_0         
    //    7   13:getfield        #130 <Field MenuBuilder mMenu>
    //    8   16:aload_2         
    //    9   17:getfield        #352 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
    //   10   20:invokevirtual   #356 <Method MenuItem MenuBuilder.findItem(int)>
    //   11   23:astore_3        
    //   12   24:aload_3         
    //   13   25:ifnull          42
    //   14   28:aload_0         
    //   15   29:aload_3         
    //   16   30:invokeinterface #362 <Method android.view.SubMenu MenuItem.getSubMenu()>
    //   17   35:checkcast       #364 <Class SubMenuBuilder>
    //   18   38:invokevirtual   #368 <Method boolean onSubMenuSelected(SubMenuBuilder)>
    //   19   41:pop             
    //   20   42:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #349 <Class ActionMenuPresenter$SavedState>
    //    1    3:dup             
    //    2    4:invokespecial   #371 <Method void ActionMenuPresenter$SavedState()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #373 <Field int mOpenSubMenuId>
    //    7   13:putfield        #352 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
    //    8   16:aload_1         
    //    9   17:areturn         
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #376 <Method boolean SubMenuBuilder.hasVisibleItems()>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_1         
    //    6   10:astore_2        
    //    7   11:aload_2         
    //    8   12:invokevirtual   #380 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
    //    9   15:aload_0         
    //   10   16:getfield        #130 <Field MenuBuilder mMenu>
    //   11   19:if_acmpeq       33
    //   12   22:aload_2         
    //   13   23:invokevirtual   #380 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
    //   14   26:checkcast       #364 <Class SubMenuBuilder>
    //   15   29:astore_2        
    //   16   30:goto            11
    //   17   33:aload_0         
    //   18   34:aload_2         
    //   19   35:invokevirtual   #384 <Method MenuItem SubMenuBuilder.getItem()>
    //   20   38:invokespecial   #386 <Method View findViewForItem(MenuItem)>
    //   21   41:ifnonnull       56
    //   22   44:aload_0         
    //   23   45:getfield        #123 <Field View mOverflowButton>
    //   24   48:ifnull          7
    //   25   51:aload_0         
    //   26   52:getfield        #123 <Field View mOverflowButton>
    //   27   55:pop             
    //   28   56:aload_0         
    //   29   57:aload_1         
    //   30   58:invokevirtual   #384 <Method MenuItem SubMenuBuilder.getItem()>
    //   31   61:invokeinterface #389 <Method int MenuItem.getItemId()>
    //   32   66:putfield        #373 <Field int mOpenSubMenuId>
    //   33   69:aload_0         
    //   34   70:new             #260 <Class ActionMenuPresenter$ActionButtonSubmenu>
    //   35   73:dup             
    //   36   74:aload_0         
    //   37   75:aload_1         
    //   38   76:invokespecial   #392 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, SubMenuBuilder)>
    //   39   79:putfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //   40   82:aload_0         
    //   41   83:getfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //   42   86:aconst_null     
    //   43   87:invokevirtual   #396 <Method void ActionMenuPresenter$ActionButtonSubmenu.show(android.os.IBinder)>
    //   44   90:aload_0         
    //   45   91:aload_1         
    //   46   92:invokespecial   #397 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
    //   47   95:pop             
    //   48   96:iconst_1        
    //   49   97:ireturn         
    }

    public void onSubUiVisibilityChanged(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            11
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:invokespecial   #397 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
    //    5    9:pop             
    //    6   10:return          
    //    7   11:aload_0         
    //    8   12:getfield        #130 <Field MenuBuilder mMenu>
    //    9   15:iconst_0        
    //   10   16:invokevirtual   #401 <Method void MenuBuilder.close(boolean)>
    //   11   19:return          
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #162 <Field boolean mExpandedActionViewsExclusive>
    //    3    5:return          
    }

    public void setItemLimit(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #143 <Field int mMaxItems>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #290 <Field boolean mMaxItemsSet>
    //    6   10:return          
    }

    public void setReserveOverflow(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #170 <Field boolean mReserveOverflow>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #278 <Field boolean mReserveOverflowSet>
    //    6   10:return          
    }

    public void setWidthLimit(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #288 <Field int mWidthLimit>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #175 <Field boolean mStrictWidthLimit>
    //    6   10:aload_0         
    //    7   11:iconst_1        
    //    8   12:putfield        #283 <Field boolean mWidthLimitSet>
    //    9   15:return          
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #213 <Method boolean MenuItemImpl.isActionButton()>
    //    2    4:ireturn         
    }

    public boolean showOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field boolean mReserveOverflow>
    //    2    4:ifeq            91
    //    3    7:aload_0         
    //    4    8:invokevirtual   #410 <Method boolean isOverflowMenuShowing()>
    //    5   11:ifne            91
    //    6   14:aload_0         
    //    7   15:getfield        #130 <Field MenuBuilder mMenu>
    //    8   18:ifnull          91
    //    9   21:aload_0         
    //   10   22:getfield        #81  <Field MenuView mMenuView>
    //   11   25:ifnull          91
    //   12   28:aload_0         
    //   13   29:getfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //   14   32:ifnonnull       91
    //   15   35:aload_0         
    //   16   36:new             #412 <Class ActionMenuPresenter$OpenOverflowRunnable>
    //   17   39:dup             
    //   18   40:aload_0         
    //   19   41:new             #318 <Class ActionMenuPresenter$OverflowPopup>
    //   20   44:dup             
    //   21   45:aload_0         
    //   22   46:aload_0         
    //   23   47:getfield        #333 <Field Context mContext>
    //   24   50:aload_0         
    //   25   51:getfield        #130 <Field MenuBuilder mMenu>
    //   26   54:aload_0         
    //   27   55:getfield        #123 <Field View mOverflowButton>
    //   28   58:iconst_1        
    //   29   59:invokespecial   #415 <Method void ActionMenuPresenter$OverflowPopup(ActionMenuPresenter, Context, MenuBuilder, View, boolean)>
    //   30   62:invokespecial   #418 <Method void ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
    //   31   65:putfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //   32   68:aload_0         
    //   33   69:getfield        #81  <Field MenuView mMenuView>
    //   34   72:checkcast       #189 <Class View>
    //   35   75:aload_0         
    //   36   76:getfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //   37   79:invokevirtual   #421 <Method boolean View.post(Runnable)>
    //   38   82:pop             
    //   39   83:aload_0         
    //   40   84:aconst_null     
    //   41   85:invokespecial   #397 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
    //   42   88:pop             
    //   43   89:iconst_1        
    //   44   90:ireturn         
    //   45   91:iconst_0        
    //   46   92:ireturn         
    }

    public void updateMenuView(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #424 <Method void BaseMenuPresenter.updateMenuView(boolean)>
    //    3    5:aload_0         
    //    4    6:getfield        #81  <Field MenuView mMenuView>
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #130 <Field MenuBuilder mMenu>
    //    9   17:ifnull          78
    //   10   20:aload_0         
    //   11   21:getfield        #130 <Field MenuBuilder mMenu>
    //   12   24:invokevirtual   #427 <Method ArrayList MenuBuilder.getActionItems()>
    //   13   27:astore          8
    //   14   29:aload           8
    //   15   31:invokevirtual   #141 <Method int ArrayList.size()>
    //   16   34:istore          9
    //   17   36:iconst_0        
    //   18   37:istore          10
    //   19   39:iload           10
    //   20   41:iload           9
    //   21   43:icmpge          78
    //   22   46:aload           8
    //   23   48:iload           10
    //   24   50:invokevirtual   #155 <Method Object ArrayList.get(int)>
    //   25   53:checkcast       #157 <Class MenuItemImpl>
    //   26   56:invokevirtual   #431 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
    //   27   59:astore          11
    //   28   61:aload           11
    //   29   63:ifnull          72
    //   30   66:aload           11
    //   31   68:aload_0         
    //   32   69:invokevirtual   #437 <Method void ActionProvider.setSubUiVisibilityListener(android.support.v4.view.ActionProvider$SubUiVisibilityListener)>
    //   33   72:iinc            10  1
    //   34   75:goto            39
    //   35   78:aload_0         
    //   36   79:getfield        #130 <Field MenuBuilder mMenu>
    //   37   82:ifnull          242
    //   38   85:aload_0         
    //   39   86:getfield        #130 <Field MenuBuilder mMenu>
    //   40   89:invokevirtual   #440 <Method ArrayList MenuBuilder.getNonActionItems()>
    //   41   92:astore_2        
    //   42   93:aload_0         
    //   43   94:getfield        #170 <Field boolean mReserveOverflow>
    //   44   97:istore_3        
    //   45   98:iconst_0        
    //   46   99:istore          4
    //   47  101:iload_3         
    //   48  102:ifeq            141
    //   49  105:iconst_0        
    //   50  106:istore          4
    //   51  108:aload_2         
    //   52  109:ifnull          141
    //   53  112:aload_2         
    //   54  113:invokevirtual   #141 <Method int ArrayList.size()>
    //   55  116:istore          7
    //   56  118:iload           7
    //   57  120:iconst_1        
    //   58  121:icmpne          253
    //   59  124:aload_2         
    //   60  125:iconst_0        
    //   61  126:invokevirtual   #155 <Method Object ArrayList.get(int)>
    //   62  129:checkcast       #157 <Class MenuItemImpl>
    //   63  132:invokevirtual   #165 <Method boolean MenuItemImpl.isActionViewExpanded()>
    //   64  135:ifne            247
    //   65  138:iconst_1        
    //   66  139:istore          4
    //   67  141:iload           4
    //   68  143:ifeq            270
    //   69  146:aload_0         
    //   70  147:getfield        #123 <Field View mOverflowButton>
    //   71  150:ifnonnull       169
    //   72  153:aload_0         
    //   73  154:new             #295 <Class ActionMenuPresenter$OverflowMenuButton>
    //   74  157:dup             
    //   75  158:aload_0         
    //   76  159:aload_0         
    //   77  160:getfield        #299 <Field Context mSystemContext>
    //   78  163:invokespecial   #302 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
    //   79  166:putfield        #123 <Field View mOverflowButton>
    //   80  169:aload_0         
    //   81  170:getfield        #123 <Field View mOverflowButton>
    //   82  173:invokevirtual   #444 <Method android.view.ViewParent View.getParent()>
    //   83  176:checkcast       #83  <Class ViewGroup>
    //   84  179:astore          5
    //   85  181:aload           5
    //   86  183:aload_0         
    //   87  184:getfield        #81  <Field MenuView mMenuView>
    //   88  187:if_acmpeq       227
    //   89  190:aload           5
    //   90  192:ifnull          204
    //   91  195:aload           5
    //   92  197:aload_0         
    //   93  198:getfield        #123 <Field View mOverflowButton>
    //   94  201:invokevirtual   #448 <Method void ViewGroup.removeView(View)>
    //   95  204:aload_0         
    //   96  205:getfield        #81  <Field MenuView mMenuView>
    //   97  208:checkcast       #105 <Class ActionMenuView>
    //   98  211:astore          6
    //   99  213:aload           6
    //  100  215:aload_0         
    //  101  216:getfield        #123 <Field View mOverflowButton>
    //  102  219:aload           6
    //  103  221:invokevirtual   #452 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
    //  104  224:invokevirtual   #456 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
    //  105  227:aload_0         
    //  106  228:getfield        #81  <Field MenuView mMenuView>
    //  107  231:checkcast       #105 <Class ActionMenuView>
    //  108  234:aload_0         
    //  109  235:getfield        #170 <Field boolean mReserveOverflow>
    //  110  238:invokevirtual   #459 <Method void ActionMenuView.setOverflowReserved(boolean)>
    //  111  241:return          
    //  112  242:aconst_null     
    //  113  243:astore_2        
    //  114  244:goto            93
    //  115  247:iconst_0        
    //  116  248:istore          4
    //  117  250:goto            141
    //  118  253:iload           7
    //  119  255:ifle            264
    //  120  258:iconst_1        
    //  121  259:istore          4
    //  122  261:goto            141
    //  123  264:iconst_0        
    //  124  265:istore          4
    //  125  267:goto            261
    //  126  270:aload_0         
    //  127  271:getfield        #123 <Field View mOverflowButton>
    //  128  274:ifnull          227
    //  129  277:aload_0         
    //  130  278:getfield        #123 <Field View mOverflowButton>
    //  131  281:invokevirtual   #444 <Method android.view.ViewParent View.getParent()>
    //  132  284:aload_0         
    //  133  285:getfield        #81  <Field MenuView mMenuView>
    //  134  288:if_acmpne       227
    //  135  291:aload_0         
    //  136  292:getfield        #81  <Field MenuView mMenuView>
    //  137  295:checkcast       #83  <Class ViewGroup>
    //  138  298:aload_0         
    //  139  299:getfield        #123 <Field View mOverflowButton>
    //  140  302:invokevirtual   #448 <Method void ViewGroup.removeView(View)>
    //  141  305:goto            227
    }

    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups;
    private ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private View mOverflowButton;
    private OverflowPopup mOverflowPopup;
    final PopupPresenterCallback mPopupPresenterCallback;
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    static OverflowPopup access$102(ActionMenuPresenter actionmenupresenter, OverflowPopup overflowpopup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #67  <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    static ActionButtonSubmenu access$202(ActionMenuPresenter actionmenupresenter, ActionButtonSubmenu actionbuttonsubmenu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #71  <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    static OpenOverflowRunnable access$302(ActionMenuPresenter actionmenupresenter, OpenOverflowRunnable openoverflowrunnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #75  <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/view/menu/ActionMenuPresenter$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v7/internal/view/menu/ActionMenuPresenter$SavedState$1

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
        //    0    0:new             #9   <Class ActionMenuPresenter$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #18  <Method void ActionMenuPresenter$SavedState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method ActionMenuPresenter$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method ActionMenuPresenter$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
