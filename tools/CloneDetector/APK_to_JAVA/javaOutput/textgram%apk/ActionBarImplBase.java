// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.*;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, ActionBarActivity

class ActionBarImplBase extends ActionBar
{
    class ActionModeImpl extends ActionMode
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        public ActionModeImpl(android.support.v7.view.ActionMode.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field ActionBarImplBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #22  <Method void ActionMode()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    8   14:aload_0         
        //    9   15:new             #26  <Class MenuBuilder>
        //   10   18:dup             
        //   11   19:aload_1         
        //   12   20:invokevirtual   #32  <Method Context ActionBarImplBase.getThemedContext()>
        //   13   23:invokespecial   #35  <Method void MenuBuilder(Context)>
        //   14   26:iconst_1        
        //   15   27:invokevirtual   #39  <Method MenuBuilder MenuBuilder.setDefaultShowAsAction(int)>
        //   16   30:putfield        #41  <Field MenuBuilder mMenu>
        //   17   33:aload_0         
        //   18   34:getfield        #41  <Field MenuBuilder mMenu>
        //   19   37:aload_0         
        //   20   38:invokevirtual   #45  <Method void MenuBuilder.setCallback(android.support.v7.internal.view.menu.MenuBuilder$Callback)>
        //   21   41:return          
        }

        public boolean dispatchOnCreate()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field MenuBuilder mMenu>
        //    2    4:invokevirtual   #50  <Method void MenuBuilder.stopDispatchingItemsChanged()>
        // try 7 22 handler(s) 31
        //    3    7:aload_0         
        //    4    8:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    5   11:aload_0         
        //    6   12:aload_0         
        //    7   13:getfield        #41  <Field MenuBuilder mMenu>
        //    8   16:invokeinterface #56  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
        //    9   21:istore_2        
        //   10   22:aload_0         
        //   11   23:getfield        #41  <Field MenuBuilder mMenu>
        //   12   26:invokevirtual   #59  <Method void MenuBuilder.startDispatchingItemsChanged()>
        //   13   29:iload_2         
        //   14   30:ireturn         
        // finally
        //   15   31:astore_1        
        //   16   32:aload_0         
        //   17   33:getfield        #41  <Field MenuBuilder mMenu>
        //   18   36:invokevirtual   #59  <Method void MenuBuilder.startDispatchingItemsChanged()>
        //   19   39:aload_1         
        //   20   40:athrow          
        }

        public void finish()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:getfield        #64  <Field ActionBarImplBase$ActionModeImpl ActionBarImplBase.mActionMode>
        //    3    7:aload_0         
        //    4    8:if_acmpeq       12
        //    5   11:return          
        //    6   12:aload_0         
        //    7   13:getfield        #19  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #68  <Method boolean ActionBarImplBase.access$200(ActionBarImplBase)>
        //    9   19:aload_0         
        //   10   20:getfield        #19  <Field ActionBarImplBase this$0>
        //   11   23:invokestatic    #71  <Method boolean ActionBarImplBase.access$300(ActionBarImplBase)>
        //   12   26:iconst_0        
        //   13   27:invokestatic    #75  <Method boolean ActionBarImplBase.access$400(boolean, boolean, boolean)>
        //   14   30:ifne            96
        //   15   33:aload_0         
        //   16   34:getfield        #19  <Field ActionBarImplBase this$0>
        //   17   37:aload_0         
        //   18   38:putfield        #79  <Field ActionMode ActionBarImplBase.mDeferredDestroyActionMode>
        //   19   41:aload_0         
        //   20   42:getfield        #19  <Field ActionBarImplBase this$0>
        //   21   45:aload_0         
        //   22   46:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //   23   49:putfield        #82  <Field android.support.v7.view.ActionMode$Callback ActionBarImplBase.mDeferredModeDestroyCallback>
        //   24   52:aload_0         
        //   25   53:aconst_null     
        //   26   54:putfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //   27   57:aload_0         
        //   28   58:getfield        #19  <Field ActionBarImplBase this$0>
        //   29   61:iconst_0        
        //   30   62:invokevirtual   #86  <Method void ActionBarImplBase.animateToMode(boolean)>
        //   31   65:aload_0         
        //   32   66:getfield        #19  <Field ActionBarImplBase this$0>
        //   33   69:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //   34   72:invokevirtual   #95  <Method void ActionBarContextView.closeMode()>
        //   35   75:aload_0         
        //   36   76:getfield        #19  <Field ActionBarImplBase this$0>
        //   37   79:invokestatic    #99  <Method ActionBarView ActionBarImplBase.access$600(ActionBarImplBase)>
        //   38   82:bipush          32
        //   39   84:invokevirtual   #105 <Method void ActionBarView.sendAccessibilityEvent(int)>
        //   40   87:aload_0         
        //   41   88:getfield        #19  <Field ActionBarImplBase this$0>
        //   42   91:aconst_null     
        //   43   92:putfield        #64  <Field ActionBarImplBase$ActionModeImpl ActionBarImplBase.mActionMode>
        //   44   95:return          
        //   45   96:aload_0         
        //   46   97:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //   47  100:aload_0         
        //   48  101:invokeinterface #109 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
        //   49  106:goto            52
        }

        public View getCustomView()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #113 <Field WeakReference mCustomView>
        //    2    4:ifnull          18
        //    3    7:aload_0         
        //    4    8:getfield        #113 <Field WeakReference mCustomView>
        //    5   11:invokevirtual   #119 <Method Object WeakReference.get()>
        //    6   14:checkcast       #121 <Class View>
        //    7   17:areturn         
        //    8   18:aconst_null     
        //    9   19:areturn         
        }

        public Menu getMenu()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field MenuBuilder mMenu>
        //    2    4:areturn         
        }

        public MenuInflater getMenuInflater()
        {
        //    0    0:new             #127 <Class SupportMenuInflater>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #19  <Field ActionBarImplBase this$0>
        //    4    8:invokevirtual   #32  <Method Context ActionBarImplBase.getThemedContext()>
        //    5   11:invokespecial   #128 <Method void SupportMenuInflater(Context)>
        //    6   14:areturn         
        }

        public CharSequence getSubtitle()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:invokevirtual   #132 <Method CharSequence ActionBarContextView.getSubtitle()>
        //    4   10:areturn         
        }

        public CharSequence getTitle()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:invokevirtual   #135 <Method CharSequence ActionBarContextView.getTitle()>
        //    4   10:areturn         
        }

        public void invalidate()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field MenuBuilder mMenu>
        //    2    4:invokevirtual   #50  <Method void MenuBuilder.stopDispatchingItemsChanged()>
        // try 7 22 handler(s) 30
        //    3    7:aload_0         
        //    4    8:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    5   11:aload_0         
        //    6   12:aload_0         
        //    7   13:getfield        #41  <Field MenuBuilder mMenu>
        //    8   16:invokeinterface #139 <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
        //    9   21:pop             
        //   10   22:aload_0         
        //   11   23:getfield        #41  <Field MenuBuilder mMenu>
        //   12   26:invokevirtual   #59  <Method void MenuBuilder.startDispatchingItemsChanged()>
        //   13   29:return          
        // finally
        //   14   30:astore_1        
        //   15   31:aload_0         
        //   16   32:getfield        #41  <Field MenuBuilder mMenu>
        //   17   35:invokevirtual   #59  <Method void MenuBuilder.startDispatchingItemsChanged()>
        //   18   38:aload_1         
        //   19   39:athrow          
        }

        public boolean isTitleOptional()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:invokevirtual   #142 <Method boolean ActionBarContextView.isTitleOptional()>
        //    4   10:ireturn         
        }

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        //    0    0:return          
        }

        public void onCloseSubMenu(SubMenuBuilder submenubuilder)
        {
        //    0    0:return          
        }

        public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    2    4:ifnull          19
        //    3    7:aload_0         
        //    4    8:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    5   11:aload_0         
        //    6   12:aload_2         
        //    7   13:invokeinterface #152 <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
        //    8   18:ireturn         
        //    9   19:iconst_0        
        //   10   20:ireturn         
        }

        public void onMenuModeChange(MenuBuilder menubuilder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    2    4:ifnonnull       8
        //    3    7:return          
        //    4    8:aload_0         
        //    5    9:invokevirtual   #156 <Method void invalidate()>
        //    6   12:aload_0         
        //    7   13:getfield        #19  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    9   19:invokevirtual   #159 <Method boolean ActionBarContextView.showOverflowMenu()>
        //   10   22:pop             
        //   11   23:return          
        }

        public void onMenuModeChange(Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    2    4:ifnonnull       8
        //    3    7:return          
        //    4    8:aload_0         
        //    5    9:invokevirtual   #156 <Method void invalidate()>
        //    6   12:aload_0         
        //    7   13:getfield        #19  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    9   19:invokevirtual   #159 <Method boolean ActionBarContextView.showOverflowMenu()>
        //   10   22:pop             
        //   11   23:return          
        }

        public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
        //    0    0:iconst_1        
        //    1    1:istore_2        
        //    2    2:aload_0         
        //    3    3:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mCallback>
        //    4    6:ifnonnull       13
        //    5    9:iconst_0        
        //    6   10:istore_2        
        //    7   11:iload_2         
        //    8   12:ireturn         
        //    9   13:aload_1         
        //   10   14:invokevirtual   #167 <Method boolean SubMenuBuilder.hasVisibleItems()>
        //   11   17:ifne            11
        //   12   20:iload_2         
        //   13   21:ireturn         
        }

        public void setCustomView(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #171 <Method void ActionBarContextView.setCustomView(View)>
        //    5   11:aload_0         
        //    6   12:new             #115 <Class WeakReference>
        //    7   15:dup             
        //    8   16:aload_1         
        //    9   17:invokespecial   #174 <Method void WeakReference(Object)>
        //   10   20:putfield        #113 <Field WeakReference mCustomView>
        //   11   23:return          
        }

        public void setSubtitle(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #19  <Field ActionBarImplBase this$0>
        //    3    5:invokestatic    #179 <Method Context ActionBarImplBase.access$100(ActionBarImplBase)>
        //    4    8:invokevirtual   #185 <Method Resources Context.getResources()>
        //    5   11:iload_1         
        //    6   12:invokevirtual   #191 <Method String Resources.getString(int)>
        //    7   15:invokevirtual   #194 <Method void setSubtitle(CharSequence)>
        //    8   18:return          
        }

        public void setSubtitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #195 <Method void ActionBarContextView.setSubtitle(CharSequence)>
        //    5   11:return          
        }

        public void setTitle(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #19  <Field ActionBarImplBase this$0>
        //    3    5:invokestatic    #179 <Method Context ActionBarImplBase.access$100(ActionBarImplBase)>
        //    4    8:invokevirtual   #185 <Method Resources Context.getResources()>
        //    5   11:iload_1         
        //    6   12:invokevirtual   #191 <Method String Resources.getString(int)>
        //    7   15:invokevirtual   #198 <Method void setTitle(CharSequence)>
        //    8   18:return          
        }

        public void setTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field ActionBarImplBase this$0>
        //    2    4:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #199 <Method void ActionBarContextView.setTitle(CharSequence)>
        //    5   11:return          
        }

        public void setTitleOptionalHint(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokespecial   #202 <Method void ActionMode.setTitleOptionalHint(boolean)>
        //    3    5:aload_0         
        //    4    6:getfield        #19  <Field ActionBarImplBase this$0>
        //    5    9:invokestatic    #90  <Method ActionBarContextView ActionBarImplBase.access$500(ActionBarImplBase)>
        //    6   12:iload_1         
        //    7   13:invokevirtual   #205 <Method void ActionBarContextView.setTitleOptional(boolean)>
        //    8   16:return          
        }

        private android.support.v7.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final ActionBarImplBase this$0;
    }

    public class TabImpl extends ActionBar.Tab
    {

        public TabImpl()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field ActionBarImplBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #26  <Method void ActionBar$Tab()>
        //    5    9:aload_0         
        //    6   10:iconst_m1       
        //    7   11:putfield        #28  <Field int mPosition>
        //    8   14:return          
        }

        public ActionBar.TabListener getCallback()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #32  <Field ActionBar$TabListener mCallback>
        //    2    4:areturn         
        }

        public CharSequence getContentDescription()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #36  <Field CharSequence mContentDesc>
        //    2    4:areturn         
        }

        public View getCustomView()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field View mCustomView>
        //    2    4:areturn         
        }

        public Drawable getIcon()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #44  <Field Drawable mIcon>
        //    2    4:areturn         
        }

        public int getPosition()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field int mPosition>
        //    2    4:ireturn         
        }

        public Object getTag()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field Object mTag>
        //    2    4:areturn         
        }

        public CharSequence getText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #53  <Field CharSequence mText>
        //    2    4:areturn         
        }

        public void select()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionBarImplBase this$0>
        //    2    4:aload_0         
        //    3    5:invokevirtual   #60  <Method void ActionBarImplBase.selectTab(ActionBar$Tab)>
        //    4    8:return          
        }

        public ActionBar.Tab setContentDescription(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #23  <Field ActionBarImplBase this$0>
        //    3    5:invokestatic    #66  <Method Context ActionBarImplBase.access$100(ActionBarImplBase)>
        //    4    8:invokevirtual   #72  <Method Resources Context.getResources()>
        //    5   11:iload_1         
        //    6   12:invokevirtual   #77  <Method CharSequence Resources.getText(int)>
        //    7   15:invokevirtual   #80  <Method ActionBar$Tab setContentDescription(CharSequence)>
        //    8   18:areturn         
        }

        public ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #36  <Field CharSequence mContentDesc>
        //    3    5:aload_0         
        //    4    6:getfield        #28  <Field int mPosition>
        //    5    9:iflt            26
        //    6   12:aload_0         
        //    7   13:getfield        #23  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #84  <Method ScrollingTabContainerView ActionBarImplBase.access$000(ActionBarImplBase)>
        //    9   19:aload_0         
        //   10   20:getfield        #28  <Field int mPosition>
        //   11   23:invokevirtual   #90  <Method void ScrollingTabContainerView.updateTab(int)>
        //   12   26:aload_0         
        //   13   27:areturn         
        }

        public ActionBar.Tab setCustomView(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #23  <Field ActionBarImplBase this$0>
        //    3    5:invokevirtual   #95  <Method Context ActionBarImplBase.getThemedContext()>
        //    4    8:invokestatic    #101 <Method LayoutInflater LayoutInflater.from(Context)>
        //    5   11:iload_1         
        //    6   12:aconst_null     
        //    7   13:invokevirtual   #105 <Method View LayoutInflater.inflate(int, ViewGroup)>
        //    8   16:invokevirtual   #108 <Method ActionBar$Tab setCustomView(View)>
        //    9   19:areturn         
        }

        public ActionBar.Tab setCustomView(View view)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #40  <Field View mCustomView>
        //    3    5:aload_0         
        //    4    6:getfield        #28  <Field int mPosition>
        //    5    9:iflt            26
        //    6   12:aload_0         
        //    7   13:getfield        #23  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #84  <Method ScrollingTabContainerView ActionBarImplBase.access$000(ActionBarImplBase)>
        //    9   19:aload_0         
        //   10   20:getfield        #28  <Field int mPosition>
        //   11   23:invokevirtual   #90  <Method void ScrollingTabContainerView.updateTab(int)>
        //   12   26:aload_0         
        //   13   27:areturn         
        }

        public ActionBar.Tab setIcon(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #23  <Field ActionBarImplBase this$0>
        //    3    5:invokestatic    #66  <Method Context ActionBarImplBase.access$100(ActionBarImplBase)>
        //    4    8:invokevirtual   #72  <Method Resources Context.getResources()>
        //    5   11:iload_1         
        //    6   12:invokevirtual   #113 <Method Drawable Resources.getDrawable(int)>
        //    7   15:invokevirtual   #116 <Method ActionBar$Tab setIcon(Drawable)>
        //    8   18:areturn         
        }

        public ActionBar.Tab setIcon(Drawable drawable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #44  <Field Drawable mIcon>
        //    3    5:aload_0         
        //    4    6:getfield        #28  <Field int mPosition>
        //    5    9:iflt            26
        //    6   12:aload_0         
        //    7   13:getfield        #23  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #84  <Method ScrollingTabContainerView ActionBarImplBase.access$000(ActionBarImplBase)>
        //    9   19:aload_0         
        //   10   20:getfield        #28  <Field int mPosition>
        //   11   23:invokevirtual   #90  <Method void ScrollingTabContainerView.updateTab(int)>
        //   12   26:aload_0         
        //   13   27:areturn         
        }

        public void setPosition(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #28  <Field int mPosition>
        //    3    5:return          
        }

        public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #32  <Field ActionBar$TabListener mCallback>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public ActionBar.Tab setTag(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #50  <Field Object mTag>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public ActionBar.Tab setText(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #23  <Field ActionBarImplBase this$0>
        //    3    5:invokestatic    #66  <Method Context ActionBarImplBase.access$100(ActionBarImplBase)>
        //    4    8:invokevirtual   #72  <Method Resources Context.getResources()>
        //    5   11:iload_1         
        //    6   12:invokevirtual   #77  <Method CharSequence Resources.getText(int)>
        //    7   15:invokevirtual   #124 <Method ActionBar$Tab setText(CharSequence)>
        //    8   18:areturn         
        }

        public ActionBar.Tab setText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #53  <Field CharSequence mText>
        //    3    5:aload_0         
        //    4    6:getfield        #28  <Field int mPosition>
        //    5    9:iflt            26
        //    6   12:aload_0         
        //    7   13:getfield        #23  <Field ActionBarImplBase this$0>
        //    8   16:invokestatic    #84  <Method ScrollingTabContainerView ActionBarImplBase.access$000(ActionBarImplBase)>
        //    9   19:aload_0         
        //   10   20:getfield        #28  <Field int mPosition>
        //   11   23:invokevirtual   #90  <Method void ScrollingTabContainerView.updateTab(int)>
        //   12   26:aload_0         
        //   13   27:areturn         
        }

        private ActionBar.TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition;
        private Object mTag;
        private CharSequence mText;
        final ActionBarImplBase this$0;
    }


    public ActionBarImplBase(ActionBarActivity actionbaractivity, ActionBar.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #69  <Method void ActionBar()>
    //    2    4:aload_0         
    //    3    5:new             #71  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #72  <Method void ArrayList()>
    //    6   12:putfield        #74  <Field ArrayList mTabs>
    //    7   15:aload_0         
    //    8   16:iconst_m1       
    //    9   17:putfield        #76  <Field int mSavedTabPosition>
    //   10   20:aload_0         
    //   11   21:new             #71  <Class ArrayList>
    //   12   24:dup             
    //   13   25:invokespecial   #72  <Method void ArrayList()>
    //   14   28:putfield        #78  <Field ArrayList mMenuVisibilityListeners>
    //   15   31:aload_0         
    //   16   32:new             #80  <Class Handler>
    //   17   35:dup             
    //   18   36:invokespecial   #81  <Method void Handler()>
    //   19   39:putfield        #83  <Field Handler mHandler>
    //   20   42:aload_0         
    //   21   43:iconst_0        
    //   22   44:putfield        #85  <Field int mCurWindowVisibility>
    //   23   47:aload_0         
    //   24   48:iconst_1        
    //   25   49:putfield        #87  <Field boolean mNowShowing>
    //   26   52:aload_0         
    //   27   53:aload_1         
    //   28   54:putfield        #89  <Field ActionBarActivity mActivity>
    //   29   57:aload_0         
    //   30   58:aload_1         
    //   31   59:putfield        #91  <Field Context mContext>
    //   32   62:aload_0         
    //   33   63:aload_2         
    //   34   64:putfield        #93  <Field ActionBar$Callback mCallback>
    //   35   67:aload_0         
    //   36   68:aload_0         
    //   37   69:getfield        #89  <Field ActionBarActivity mActivity>
    //   38   72:invokespecial   #97  <Method void init(ActionBarActivity)>
    //   39   75:return          
    }

    static ScrollingTabContainerView access$000(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    5    4:areturn         
    }

    static Context access$100(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Context mContext>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #91  <Field Context mContext>
    //    5    4:areturn         
    }

    static boolean access$200(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field boolean mHiddenByApp>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #107 <Field boolean mHiddenByApp>
    //    5    4:ireturn         
    }

    static boolean access$300(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #110 <Field boolean mHiddenBySystem>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #110 <Field boolean mHiddenBySystem>
    //    5    4:ireturn         
    }

    static boolean access$400(boolean flag, boolean flag1, boolean flag2)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #115 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:iload_0         
    //    6    1:iload_1         
    //    7    2:iload_2         
    //    8    3:invokestatic    #115 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
    //    9    6:ireturn         
    }

    static ActionBarContextView access$500(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field ActionBarContextView mContextView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #119 <Field ActionBarContextView mContextView>
    //    5    4:areturn         
    }

    static ActionBarView access$600(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #123 <Field ActionBarView mActionView>
    //    5    4:areturn         
    }

    private static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
    {
    //    0    0:iload_2         
    //    1    1:ifeq            6
    //    2    4:iconst_1        
    //    3    5:ireturn         
    //    4    6:iload_0         
    //    5    7:ifne            14
    //    6   10:iload_1         
    //    7   11:ifeq            4
    //    8   14:iconst_0        
    //    9   15:ireturn         
    }

    private void cleanupTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:aconst_null     
    //    5    9:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //    6   12:aload_0         
    //    7   13:getfield        #74  <Field ArrayList mTabs>
    //    8   16:invokevirtual   #133 <Method void ArrayList.clear()>
    //    9   19:aload_0         
    //   10   20:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   11   23:ifnull          33
    //   12   26:aload_0         
    //   13   27:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   14   30:invokevirtual   #138 <Method void ScrollingTabContainerView.removeAllTabs()>
    //   15   33:aload_0         
    //   16   34:iconst_m1       
    //   17   35:putfield        #76  <Field int mSavedTabPosition>
    //   18   38:return          
    }

    private void configureTab(ActionBar.Tab tab, int i)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:invokevirtual   #146 <Method ActionBar$TabListener ActionBarImplBase$TabImpl.getCallback()>
    //    5    9:ifnonnull       22
    //    6   12:new             #148 <Class IllegalStateException>
    //    7   15:dup             
    //    8   16:ldc1            #150 <String "Action Bar Tab must have a Callback">
    //    9   18:invokespecial   #153 <Method void IllegalStateException(String)>
    //   10   21:athrow          
    //   11   22:aload_3         
    //   12   23:iload_2         
    //   13   24:invokevirtual   #157 <Method void ActionBarImplBase$TabImpl.setPosition(int)>
    //   14   27:aload_0         
    //   15   28:getfield        #74  <Field ArrayList mTabs>
    //   16   31:iload_2         
    //   17   32:aload_3         
    //   18   33:invokevirtual   #161 <Method void ArrayList.add(int, Object)>
    //   19   36:aload_0         
    //   20   37:getfield        #74  <Field ArrayList mTabs>
    //   21   40:invokevirtual   #165 <Method int ArrayList.size()>
    //   22   43:istore          4
    //   23   45:iload_2         
    //   24   46:iconst_1        
    //   25   47:iadd            
    //   26   48:istore          5
    //   27   50:iload           5
    //   28   52:iload           4
    //   29   54:icmpge          80
    //   30   57:aload_0         
    //   31   58:getfield        #74  <Field ArrayList mTabs>
    //   32   61:iload           5
    //   33   63:invokevirtual   #169 <Method Object ArrayList.get(int)>
    //   34   66:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //   35   69:iload           5
    //   36   71:invokevirtual   #157 <Method void ActionBarImplBase$TabImpl.setPosition(int)>
    //   37   74:iinc            5  1
    //   38   77:goto            50
    //   39   80:return          
    }

    private void ensureTabsExist()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:ifnull          8
    //    3    7:return          
    //    4    8:new             #135 <Class ScrollingTabContainerView>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:getfield        #91  <Field Context mContext>
    //    8   16:invokespecial   #173 <Method void ScrollingTabContainerView(Context)>
    //    9   19:astore_1        
    //   10   20:aload_0         
    //   11   21:getfield        #175 <Field boolean mHasEmbeddedTabs>
    //   12   24:ifeq            46
    //   13   27:aload_1         
    //   14   28:iconst_0        
    //   15   29:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   16   32:aload_0         
    //   17   33:getfield        #123 <Field ActionBarView mActionView>
    //   18   36:aload_1         
    //   19   37:invokevirtual   #184 <Method void ActionBarView.setEmbeddedTabView(ScrollingTabContainerView)>
    //   20   40:aload_0         
    //   21   41:aload_1         
    //   22   42:putfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   23   45:return          
    //   24   46:aload_0         
    //   25   47:invokevirtual   #187 <Method int getNavigationMode()>
    //   26   50:iconst_2        
    //   27   51:icmpne          70
    //   28   54:aload_1         
    //   29   55:iconst_0        
    //   30   56:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   31   59:aload_0         
    //   32   60:getfield        #189 <Field ActionBarContainer mContainerView>
    //   33   63:aload_1         
    //   34   64:invokevirtual   #194 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
    //   35   67:goto            40
    //   36   70:aload_1         
    //   37   71:bipush          8
    //   38   73:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   39   76:goto            59
    }

    private void init(ActionBarActivity actionbaractivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getstatic       #199 <Field int android.support.v7.appcompat.R$id.action_bar_overlay_layout>
    //    3    5:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //    4    8:checkcast       #207 <Class ActionBarOverlayLayout>
    //    5   11:putfield        #209 <Field ActionBarOverlayLayout mOverlayLayout>
    //    6   14:aload_0         
    //    7   15:getfield        #209 <Field ActionBarOverlayLayout mOverlayLayout>
    //    8   18:ifnull          29
    //    9   21:aload_0         
    //   10   22:getfield        #209 <Field ActionBarOverlayLayout mOverlayLayout>
    //   11   25:aload_0         
    //   12   26:invokevirtual   #213 <Method void ActionBarOverlayLayout.setActionBar(ActionBar)>
    //   13   29:aload_0         
    //   14   30:aload_1         
    //   15   31:getstatic       #216 <Field int android.support.v7.appcompat.R$id.action_bar>
    //   16   34:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //   17   37:checkcast       #180 <Class ActionBarView>
    //   18   40:putfield        #123 <Field ActionBarView mActionView>
    //   19   43:aload_0         
    //   20   44:aload_1         
    //   21   45:getstatic       #219 <Field int android.support.v7.appcompat.R$id.action_context_bar>
    //   22   48:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //   23   51:checkcast       #221 <Class ActionBarContextView>
    //   24   54:putfield        #119 <Field ActionBarContextView mContextView>
    //   25   57:aload_0         
    //   26   58:aload_1         
    //   27   59:getstatic       #224 <Field int android.support.v7.appcompat.R$id.action_bar_container>
    //   28   62:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //   29   65:checkcast       #191 <Class ActionBarContainer>
    //   30   68:putfield        #189 <Field ActionBarContainer mContainerView>
    //   31   71:aload_0         
    //   32   72:aload_1         
    //   33   73:getstatic       #227 <Field int android.support.v7.appcompat.R$id.top_action_bar>
    //   34   76:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //   35   79:checkcast       #229 <Class ViewGroup>
    //   36   82:putfield        #231 <Field ViewGroup mTopVisibilityView>
    //   37   85:aload_0         
    //   38   86:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //   39   89:ifnonnull       100
    //   40   92:aload_0         
    //   41   93:aload_0         
    //   42   94:getfield        #189 <Field ActionBarContainer mContainerView>
    //   43   97:putfield        #231 <Field ViewGroup mTopVisibilityView>
    //   44  100:aload_0         
    //   45  101:aload_1         
    //   46  102:getstatic       #234 <Field int android.support.v7.appcompat.R$id.split_action_bar>
    //   47  105:invokevirtual   #205 <Method View ActionBarActivity.findViewById(int)>
    //   48  108:checkcast       #191 <Class ActionBarContainer>
    //   49  111:putfield        #236 <Field ActionBarContainer mSplitView>
    //   50  114:aload_0         
    //   51  115:getfield        #123 <Field ActionBarView mActionView>
    //   52  118:ifnull          135
    //   53  121:aload_0         
    //   54  122:getfield        #119 <Field ActionBarContextView mContextView>
    //   55  125:ifnull          135
    //   56  128:aload_0         
    //   57  129:getfield        #189 <Field ActionBarContainer mContainerView>
    //   58  132:ifnonnull       175
    //   59  135:new             #148 <Class IllegalStateException>
    //   60  138:dup             
    //   61  139:new             #238 <Class StringBuilder>
    //   62  142:dup             
    //   63  143:invokespecial   #239 <Method void StringBuilder()>
    //   64  146:aload_0         
    //   65  147:invokevirtual   #245 <Method Class Object.getClass()>
    //   66  150:invokevirtual   #251 <Method String Class.getSimpleName()>
    //   67  153:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
    //   68  156:ldc2            #257 <String " can only be used ">
    //   69  159:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
    //   70  162:ldc2            #259 <String "with a compatible window decor layout">
    //   71  165:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
    //   72  168:invokevirtual   #262 <Method String StringBuilder.toString()>
    //   73  171:invokespecial   #153 <Method void IllegalStateException(String)>
    //   74  174:athrow          
    //   75  175:aload_0         
    //   76  176:getfield        #123 <Field ActionBarView mActionView>
    //   77  179:aload_0         
    //   78  180:getfield        #119 <Field ActionBarContextView mContextView>
    //   79  183:invokevirtual   #266 <Method void ActionBarView.setContextView(ActionBarContextView)>
    //   80  186:aload_0         
    //   81  187:getfield        #123 <Field ActionBarView mActionView>
    //   82  190:invokevirtual   #270 <Method boolean ActionBarView.isSplitActionBar()>
    //   83  193:ifeq            280
    //   84  196:iconst_1        
    //   85  197:istore_2        
    //   86  198:aload_0         
    //   87  199:iload_2         
    //   88  200:putfield        #272 <Field int mContextDisplayMode>
    //   89  203:iconst_4        
    //   90  204:aload_0         
    //   91  205:getfield        #123 <Field ActionBarView mActionView>
    //   92  208:invokevirtual   #275 <Method int ActionBarView.getDisplayOptions()>
    //   93  211:iand            
    //   94  212:ifeq            285
    //   95  215:iconst_1        
    //   96  216:istore_3        
    //   97  217:iload_3         
    //   98  218:ifeq            226
    //   99  221:aload_0         
    //  100  222:iconst_1        
    //  101  223:putfield        #277 <Field boolean mDisplayHomeAsUpSet>
    //  102  226:aload_0         
    //  103  227:getfield        #91  <Field Context mContext>
    //  104  230:invokestatic    #282 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
    //  105  233:astore          4
    //  106  235:aload           4
    //  107  237:invokevirtual   #285 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
    //  108  240:ifne            250
    //  109  243:iconst_0        
    //  110  244:istore          5
    //  111  246:iload_3         
    //  112  247:ifeq            253
    //  113  250:iconst_1        
    //  114  251:istore          5
    //  115  253:aload_0         
    //  116  254:iload           5
    //  117  256:invokevirtual   #289 <Method void setHomeButtonEnabled(boolean)>
    //  118  259:aload_0         
    //  119  260:aload           4
    //  120  262:invokevirtual   #292 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
    //  121  265:invokespecial   #295 <Method void setHasEmbeddedTabs(boolean)>
    //  122  268:aload_0         
    //  123  269:aload_0         
    //  124  270:getfield        #89  <Field ActionBarActivity mActivity>
    //  125  273:invokevirtual   #299 <Method CharSequence ActionBarActivity.getTitle()>
    //  126  276:invokevirtual   #303 <Method void setTitle(CharSequence)>
    //  127  279:return          
    //  128  280:iconst_0        
    //  129  281:istore_2        
    //  130  282:goto            198
    //  131  285:iconst_0        
    //  132  286:istore_3        
    //  133  287:goto            217
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:putfield        #175 <Field boolean mHasEmbeddedTabs>
    //    5    7:aload_0         
    //    6    8:getfield        #175 <Field boolean mHasEmbeddedTabs>
    //    7   11:ifne            86
    //    8   14:aload_0         
    //    9   15:getfield        #123 <Field ActionBarView mActionView>
    //   10   18:aconst_null     
    //   11   19:invokevirtual   #184 <Method void ActionBarView.setEmbeddedTabView(ScrollingTabContainerView)>
    //   12   22:aload_0         
    //   13   23:getfield        #189 <Field ActionBarContainer mContainerView>
    //   14   26:aload_0         
    //   15   27:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   16   30:invokevirtual   #194 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
    //   17   33:aload_0         
    //   18   34:invokevirtual   #187 <Method int getNavigationMode()>
    //   19   37:iconst_2        
    //   20   38:icmpne          108
    //   21   41:iload_2         
    //   22   42:istore_3        
    //   23   43:aload_0         
    //   24   44:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   25   47:ifnull          62
    //   26   50:iload_3         
    //   27   51:ifeq            113
    //   28   54:aload_0         
    //   29   55:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   30   58:iconst_0        
    //   31   59:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   32   62:aload_0         
    //   33   63:getfield        #123 <Field ActionBarView mActionView>
    //   34   66:astore          4
    //   35   68:aload_0         
    //   36   69:getfield        #175 <Field boolean mHasEmbeddedTabs>
    //   37   72:ifne            125
    //   38   75:iload_3         
    //   39   76:ifeq            125
    //   40   79:aload           4
    //   41   81:iload_2         
    //   42   82:invokevirtual   #306 <Method void ActionBarView.setCollapsable(boolean)>
    //   43   85:return          
    //   44   86:aload_0         
    //   45   87:getfield        #189 <Field ActionBarContainer mContainerView>
    //   46   90:aconst_null     
    //   47   91:invokevirtual   #194 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
    //   48   94:aload_0         
    //   49   95:getfield        #123 <Field ActionBarView mActionView>
    //   50   98:aload_0         
    //   51   99:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   52  102:invokevirtual   #184 <Method void ActionBarView.setEmbeddedTabView(ScrollingTabContainerView)>
    //   53  105:goto            33
    //   54  108:iconst_0        
    //   55  109:istore_3        
    //   56  110:goto            43
    //   57  113:aload_0         
    //   58  114:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   59  117:bipush          8
    //   60  119:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   61  122:goto            62
    //   62  125:iconst_0        
    //   63  126:istore_2        
    //   64  127:goto            79
    }

    private void updateVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field boolean mHiddenByApp>
    //    2    4:aload_0         
    //    3    5:getfield        #110 <Field boolean mHiddenBySystem>
    //    4    8:aload_0         
    //    5    9:getfield        #309 <Field boolean mShowingForMode>
    //    6   12:invokestatic    #115 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
    //    7   15:ifeq            36
    //    8   18:aload_0         
    //    9   19:getfield        #87  <Field boolean mNowShowing>
    //   10   22:ifne            35
    //   11   25:aload_0         
    //   12   26:iconst_1        
    //   13   27:putfield        #87  <Field boolean mNowShowing>
    //   14   30:aload_0         
    //   15   31:iload_1         
    //   16   32:invokevirtual   #312 <Method void doShow(boolean)>
    //   17   35:return          
    //   18   36:aload_0         
    //   19   37:getfield        #87  <Field boolean mNowShowing>
    //   20   40:ifeq            35
    //   21   43:aload_0         
    //   22   44:iconst_0        
    //   23   45:putfield        #87  <Field boolean mNowShowing>
    //   24   48:aload_0         
    //   25   49:iload_1         
    //   26   50:invokevirtual   #315 <Method void doHide(boolean)>
    //   27   53:return          
    }

    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field ArrayList mMenuVisibilityListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #320 <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    public void addTab(ActionBar.Tab tab)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #74  <Field ArrayList mTabs>
    //    4    6:invokevirtual   #324 <Method boolean ArrayList.isEmpty()>
    //    5    9:invokevirtual   #327 <Method void addTab(ActionBar$Tab, boolean)>
    //    6   12:return          
    }

    public void addTab(ActionBar.Tab tab, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:getfield        #74  <Field ArrayList mTabs>
    //    5    7:invokevirtual   #324 <Method boolean ArrayList.isEmpty()>
    //    6   10:invokevirtual   #330 <Method void addTab(ActionBar$Tab, int, boolean)>
    //    7   13:return          
    }

    public void addTab(ActionBar.Tab tab, int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #332 <Method void ensureTabsExist()>
    //    2    4:aload_0         
    //    3    5:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    4    8:aload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:invokevirtual   #333 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, int, boolean)>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:iload_2         
    //   11   17:invokespecial   #335 <Method void configureTab(ActionBar$Tab, int)>
    //   12   20:iload_3         
    //   13   21:ifeq            29
    //   14   24:aload_0         
    //   15   25:aload_1         
    //   16   26:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //   17   29:return          
    }

    public void addTab(ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #332 <Method void ensureTabsExist()>
    //    2    4:aload_0         
    //    3    5:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    4    8:aload_1         
    //    5    9:iload_2         
    //    6   10:invokevirtual   #336 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, boolean)>
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:aload_0         
    //   10   16:getfield        #74  <Field ArrayList mTabs>
    //   11   19:invokevirtual   #165 <Method int ArrayList.size()>
    //   12   22:invokespecial   #335 <Method void configureTab(ActionBar$Tab, int)>
    //   13   25:iload_2         
    //   14   26:ifeq            34
    //   15   29:aload_0         
    //   16   30:aload_1         
    //   17   31:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //   18   34:return          
    }

    void animateToMode(boolean flag)
    {
    //    0    0:bipush          8
    //    1    2:istore_2        
    //    2    3:iload_1         
    //    3    4:ifeq            93
    //    4    7:aload_0         
    //    5    8:invokevirtual   #340 <Method void showForActionMode()>
    //    6   11:aload_0         
    //    7   12:getfield        #123 <Field ActionBarView mActionView>
    //    8   15:astore_3        
    //    9   16:iload_1         
    //   10   17:ifeq            100
    //   11   20:iconst_4        
    //   12   21:istore          4
    //   13   23:aload_3         
    //   14   24:iload           4
    //   15   26:invokevirtual   #343 <Method void ActionBarView.animateToVisibility(int)>
    //   16   29:aload_0         
    //   17   30:getfield        #119 <Field ActionBarContextView mContextView>
    //   18   33:astore          5
    //   19   35:iload_1         
    //   20   36:ifeq            106
    //   21   39:iconst_0        
    //   22   40:istore          6
    //   23   42:aload           5
    //   24   44:iload           6
    //   25   46:invokevirtual   #344 <Method void ActionBarContextView.animateToVisibility(int)>
    //   26   49:aload_0         
    //   27   50:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   28   53:ifnull          92
    //   29   56:aload_0         
    //   30   57:getfield        #123 <Field ActionBarView mActionView>
    //   31   60:invokevirtual   #345 <Method boolean ActionBarView.hasEmbeddedTabs()>
    //   32   63:ifne            92
    //   33   66:aload_0         
    //   34   67:getfield        #123 <Field ActionBarView mActionView>
    //   35   70:invokevirtual   #348 <Method boolean ActionBarView.isCollapsed()>
    //   36   73:ifeq            92
    //   37   76:aload_0         
    //   38   77:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   39   80:astore          7
    //   40   82:iload_1         
    //   41   83:ifeq            112
    //   42   86:aload           7
    //   43   88:iload_2         
    //   44   89:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   45   92:return          
    //   46   93:aload_0         
    //   47   94:invokevirtual   #351 <Method void hideForActionMode()>
    //   48   97:goto            11
    //   49  100:iconst_0        
    //   50  101:istore          4
    //   51  103:goto            23
    //   52  106:iload_2         
    //   53  107:istore          6
    //   54  109:goto            42
    //   55  112:iconst_0        
    //   56  113:istore_2        
    //   57  114:goto            86
    }

    public void doHide(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //    2    4:invokevirtual   #354 <Method void ViewGroup.clearAnimation()>
    //    3    7:aload_0         
    //    4    8:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //    5   11:invokevirtual   #357 <Method int ViewGroup.getVisibility()>
    //    6   14:bipush          8
    //    7   16:icmpne          20
    //    8   19:return          
    //    9   20:aload_0         
    //   10   21:invokevirtual   #360 <Method boolean isShowHideAnimationEnabled()>
    //   11   24:ifne            31
    //   12   27:iload_1         
    //   13   28:ifeq            119
    //   14   31:iconst_1        
    //   15   32:istore_2        
    //   16   33:iload_2         
    //   17   34:ifeq            58
    //   18   37:aload_0         
    //   19   38:getfield        #91  <Field Context mContext>
    //   20   41:getstatic       #365 <Field int android.support.v7.appcompat.R$anim.abc_slide_out_top>
    //   21   44:invokestatic    #371 <Method android.view.animation.Animation AnimationUtils.loadAnimation(Context, int)>
    //   22   47:astore          4
    //   23   49:aload_0         
    //   24   50:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //   25   53:aload           4
    //   26   55:invokevirtual   #375 <Method void ViewGroup.startAnimation(android.view.animation.Animation)>
    //   27   58:aload_0         
    //   28   59:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //   29   62:bipush          8
    //   30   64:invokevirtual   #376 <Method void ViewGroup.setVisibility(int)>
    //   31   67:aload_0         
    //   32   68:getfield        #236 <Field ActionBarContainer mSplitView>
    //   33   71:ifnull          19
    //   34   74:aload_0         
    //   35   75:getfield        #236 <Field ActionBarContainer mSplitView>
    //   36   78:invokevirtual   #377 <Method int ActionBarContainer.getVisibility()>
    //   37   81:bipush          8
    //   38   83:icmpeq          19
    //   39   86:iload_2         
    //   40   87:ifeq            109
    //   41   90:aload_0         
    //   42   91:getfield        #91  <Field Context mContext>
    //   43   94:getstatic       #380 <Field int android.support.v7.appcompat.R$anim.abc_slide_out_bottom>
    //   44   97:invokestatic    #371 <Method android.view.animation.Animation AnimationUtils.loadAnimation(Context, int)>
    //   45  100:astore_3        
    //   46  101:aload_0         
    //   47  102:getfield        #236 <Field ActionBarContainer mSplitView>
    //   48  105:aload_3         
    //   49  106:invokevirtual   #381 <Method void ActionBarContainer.startAnimation(android.view.animation.Animation)>
    //   50  109:aload_0         
    //   51  110:getfield        #236 <Field ActionBarContainer mSplitView>
    //   52  113:bipush          8
    //   53  115:invokevirtual   #382 <Method void ActionBarContainer.setVisibility(int)>
    //   54  118:return          
    //   55  119:iconst_0        
    //   56  120:istore_2        
    //   57  121:goto            33
    }

    public void doShow(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //    2    4:invokevirtual   #354 <Method void ViewGroup.clearAnimation()>
    //    3    7:aload_0         
    //    4    8:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //    5   11:invokevirtual   #357 <Method int ViewGroup.getVisibility()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_0         
    //    9   19:invokevirtual   #360 <Method boolean isShowHideAnimationEnabled()>
    //   10   22:ifne            29
    //   11   25:iload_1         
    //   12   26:ifeq            113
    //   13   29:iconst_1        
    //   14   30:istore_2        
    //   15   31:iload_2         
    //   16   32:ifeq            56
    //   17   35:aload_0         
    //   18   36:getfield        #91  <Field Context mContext>
    //   19   39:getstatic       #385 <Field int android.support.v7.appcompat.R$anim.abc_slide_in_top>
    //   20   42:invokestatic    #371 <Method android.view.animation.Animation AnimationUtils.loadAnimation(Context, int)>
    //   21   45:astore          4
    //   22   47:aload_0         
    //   23   48:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //   24   51:aload           4
    //   25   53:invokevirtual   #375 <Method void ViewGroup.startAnimation(android.view.animation.Animation)>
    //   26   56:aload_0         
    //   27   57:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //   28   60:iconst_0        
    //   29   61:invokevirtual   #376 <Method void ViewGroup.setVisibility(int)>
    //   30   64:aload_0         
    //   31   65:getfield        #236 <Field ActionBarContainer mSplitView>
    //   32   68:ifnull          17
    //   33   71:aload_0         
    //   34   72:getfield        #236 <Field ActionBarContainer mSplitView>
    //   35   75:invokevirtual   #377 <Method int ActionBarContainer.getVisibility()>
    //   36   78:ifeq            17
    //   37   81:iload_2         
    //   38   82:ifeq            104
    //   39   85:aload_0         
    //   40   86:getfield        #91  <Field Context mContext>
    //   41   89:getstatic       #388 <Field int android.support.v7.appcompat.R$anim.abc_slide_in_bottom>
    //   42   92:invokestatic    #371 <Method android.view.animation.Animation AnimationUtils.loadAnimation(Context, int)>
    //   43   95:astore_3        
    //   44   96:aload_0         
    //   45   97:getfield        #236 <Field ActionBarContainer mSplitView>
    //   46  100:aload_3         
    //   47  101:invokevirtual   #381 <Method void ActionBarContainer.startAnimation(android.view.animation.Animation)>
    //   48  104:aload_0         
    //   49  105:getfield        #236 <Field ActionBarContainer mSplitView>
    //   50  108:iconst_0        
    //   51  109:invokevirtual   #382 <Method void ActionBarContainer.setVisibility(int)>
    //   52  112:return          
    //   53  113:iconst_0        
    //   54  114:istore_2        
    //   55  115:goto            31
    }

    public View getCustomView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #393 <Method View ActionBarView.getCustomNavigationView()>
    //    3    7:areturn         
    }

    public int getDisplayOptions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #275 <Method int ActionBarView.getDisplayOptions()>
    //    3    7:ireturn         
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #189 <Field ActionBarContainer mContainerView>
    //    2    4:invokevirtual   #396 <Method int ActionBarContainer.getHeight()>
    //    3    7:ireturn         
    }

    public int getNavigationItemCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #398 <Method int ActionBarView.getNavigationMode()>
    //    3    7:tableswitch     1 2: default 28
    //                   1 38
    //                   2 30
    //    4   28:iconst_0        
    //    5   29:ireturn         
    //    6   30:aload_0         
    //    7   31:getfield        #74  <Field ArrayList mTabs>
    //    8   34:invokevirtual   #165 <Method int ArrayList.size()>
    //    9   37:ireturn         
    //   10   38:aload_0         
    //   11   39:getfield        #123 <Field ActionBarView mActionView>
    //   12   42:invokevirtual   #402 <Method SpinnerAdapter ActionBarView.getDropdownAdapter()>
    //   13   45:astore_1        
    //   14   46:aload_1         
    //   15   47:ifnull          28
    //   16   50:aload_1         
    //   17   51:invokeinterface #407 <Method int SpinnerAdapter.getCount()>
    //   18   56:ireturn         
    }

    public int getNavigationMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #398 <Method int ActionBarView.getNavigationMode()>
    //    3    7:ireturn         
    }

    public int getSelectedNavigationIndex()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #398 <Method int ActionBarView.getNavigationMode()>
    //    3    7:tableswitch     1 2: default 28
    //                   1 45
    //                   2 30
    //    4   28:iconst_m1       
    //    5   29:ireturn         
    //    6   30:aload_0         
    //    7   31:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //    8   34:ifnull          28
    //    9   37:aload_0         
    //   10   38:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   11   41:invokevirtual   #411 <Method int ActionBarImplBase$TabImpl.getPosition()>
    //   12   44:ireturn         
    //   13   45:aload_0         
    //   14   46:getfield        #123 <Field ActionBarView mActionView>
    //   15   49:invokevirtual   #414 <Method int ActionBarView.getDropdownSelectedPosition()>
    //   16   52:ireturn         
    }

    public ActionBar.Tab getSelectedTab()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //    2    4:areturn         
    }

    public CharSequence getSubtitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #419 <Method CharSequence ActionBarView.getSubtitle()>
    //    3    7:areturn         
    }

    public ActionBar.Tab getTabAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field ArrayList mTabs>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #169 <Method Object ArrayList.get(int)>
    //    4    8:checkcast       #423 <Class ActionBar$Tab>
    //    5   11:areturn         
    }

    public int getTabCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field ArrayList mTabs>
    //    2    4:invokevirtual   #165 <Method int ArrayList.size()>
    //    3    7:ireturn         
    }

    public Context getThemedContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #428 <Field Context mThemedContext>
    //    2    4:ifnonnull       56
    //    3    7:new             #430 <Class TypedValue>
    //    4   10:dup             
    //    5   11:invokespecial   #431 <Method void TypedValue()>
    //    6   14:astore_1        
    //    7   15:aload_0         
    //    8   16:getfield        #91  <Field Context mContext>
    //    9   19:invokevirtual   #437 <Method android.content.res.Resources$Theme Context.getTheme()>
    //   10   22:getstatic       #442 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
    //   11   25:aload_1         
    //   12   26:iconst_1        
    //   13   27:invokevirtual   #448 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
    //   14   30:pop             
    //   15   31:aload_1         
    //   16   32:getfield        #451 <Field int TypedValue.resourceId>
    //   17   35:istore_3        
    //   18   36:iload_3         
    //   19   37:ifeq            61
    //   20   40:aload_0         
    //   21   41:new             #453 <Class ContextThemeWrapper>
    //   22   44:dup             
    //   23   45:aload_0         
    //   24   46:getfield        #91  <Field Context mContext>
    //   25   49:iload_3         
    //   26   50:invokespecial   #456 <Method void ContextThemeWrapper(Context, int)>
    //   27   53:putfield        #428 <Field Context mThemedContext>
    //   28   56:aload_0         
    //   29   57:getfield        #428 <Field Context mThemedContext>
    //   30   60:areturn         
    //   31   61:aload_0         
    //   32   62:aload_0         
    //   33   63:getfield        #91  <Field Context mContext>
    //   34   66:putfield        #428 <Field Context mThemedContext>
    //   35   69:goto            56
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #457 <Method CharSequence ActionBarView.getTitle()>
    //    3    7:areturn         
    }

    public boolean hasNonEmbeddedTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field boolean mHasEmbeddedTabs>
    //    2    4:ifne            17
    //    3    7:aload_0         
    //    4    8:invokevirtual   #187 <Method int getNavigationMode()>
    //    5   11:iconst_2        
    //    6   12:icmpne          17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public void hide()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field boolean mHiddenByApp>
    //    2    4:ifne            17
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #107 <Field boolean mHiddenByApp>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:invokespecial   #461 <Method void updateVisibility(boolean)>
    //    9   17:return          
    }

    void hideForActionMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #309 <Field boolean mShowingForMode>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #309 <Field boolean mShowingForMode>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:invokespecial   #461 <Method void updateVisibility(boolean)>
    //    9   17:return          
    }

    boolean isShowHideAnimationEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #463 <Field boolean mShowHideAnimationEnabled>
    //    2    4:ireturn         
    }

    public boolean isShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field boolean mNowShowing>
    //    2    4:ireturn         
    }

    public ActionBar.Tab newTab()
    {
    //    0    0:new             #142 <Class ActionBarImplBase$TabImpl>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #468 <Method void ActionBarImplBase$TabImpl(ActionBarImplBase)>
    //    4    8:areturn         
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #91  <Field Context mContext>
    //    3    5:invokestatic    #282 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
    //    4    8:invokevirtual   #292 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
    //    5   11:invokespecial   #295 <Method void setHasEmbeddedTabs(boolean)>
    //    6   14:return          
    }

    public void removeAllTabs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #472 <Method void cleanupTabs()>
    //    2    4:return          
    }

    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field ArrayList mMenuVisibilityListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #476 <Method boolean ArrayList.remove(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    public void removeTab(ActionBar.Tab tab)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #478 <Method int ActionBar$Tab.getPosition()>
    //    3    5:invokevirtual   #481 <Method void removeTabAt(int)>
    //    4    8:return          
    }

    public void removeTabAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //    6   12:ifnull          94
    //    7   15:aload_0         
    //    8   16:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //    9   19:invokevirtual   #411 <Method int ActionBarImplBase$TabImpl.getPosition()>
    //   10   22:istore_2        
    //   11   23:aload_0         
    //   12   24:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   13   27:iload_1         
    //   14   28:invokevirtual   #482 <Method void ScrollingTabContainerView.removeTabAt(int)>
    //   15   31:aload_0         
    //   16   32:getfield        #74  <Field ArrayList mTabs>
    //   17   35:iload_1         
    //   18   36:invokevirtual   #484 <Method Object ArrayList.remove(int)>
    //   19   39:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //   20   42:astore_3        
    //   21   43:aload_3         
    //   22   44:ifnull          52
    //   23   47:aload_3         
    //   24   48:iconst_m1       
    //   25   49:invokevirtual   #157 <Method void ActionBarImplBase$TabImpl.setPosition(int)>
    //   26   52:aload_0         
    //   27   53:getfield        #74  <Field ArrayList mTabs>
    //   28   56:invokevirtual   #165 <Method int ArrayList.size()>
    //   29   59:istore          4
    //   30   61:iload_1         
    //   31   62:istore          5
    //   32   64:iload           5
    //   33   66:iload           4
    //   34   68:icmpge          102
    //   35   71:aload_0         
    //   36   72:getfield        #74  <Field ArrayList mTabs>
    //   37   75:iload           5
    //   38   77:invokevirtual   #169 <Method Object ArrayList.get(int)>
    //   39   80:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //   40   83:iload           5
    //   41   85:invokevirtual   #157 <Method void ActionBarImplBase$TabImpl.setPosition(int)>
    //   42   88:iinc            5  1
    //   43   91:goto            64
    //   44   94:aload_0         
    //   45   95:getfield        #76  <Field int mSavedTabPosition>
    //   46   98:istore_2        
    //   47   99:goto            23
    //   48  102:iload_2         
    //   49  103:iload_1         
    //   50  104:icmpne          7
    //   51  107:aload_0         
    //   52  108:getfield        #74  <Field ArrayList mTabs>
    //   53  111:invokevirtual   #324 <Method boolean ArrayList.isEmpty()>
    //   54  114:ifeq            127
    //   55  117:aconst_null     
    //   56  118:astore          6
    //   57  120:aload_0         
    //   58  121:aload           6
    //   59  123:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //   60  126:return          
    //   61  127:aload_0         
    //   62  128:getfield        #74  <Field ArrayList mTabs>
    //   63  131:iconst_0        
    //   64  132:iload_1         
    //   65  133:iconst_1        
    //   66  134:isub            
    //   67  135:invokestatic    #490 <Method int Math.max(int, int)>
    //   68  138:invokevirtual   #169 <Method Object ArrayList.get(int)>
    //   69  141:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //   70  144:astore          6
    //   71  146:goto            120
    }

    public void selectTab(ActionBar.Tab tab)
    {
    //    0    0:iconst_m1       
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #187 <Method int getNavigationMode()>
    //    4    6:iconst_2        
    //    5    7:icmpeq          25
    //    6   10:aload_1         
    //    7   11:ifnull          19
    //    8   14:aload_1         
    //    9   15:invokevirtual   #478 <Method int ActionBar$Tab.getPosition()>
    //   10   18:istore_2        
    //   11   19:aload_0         
    //   12   20:iload_2         
    //   13   21:putfield        #76  <Field int mSavedTabPosition>
    //   14   24:return          
    //   15   25:aload_0         
    //   16   26:getfield        #89  <Field ActionBarActivity mActivity>
    //   17   29:invokevirtual   #494 <Method FragmentManager ActionBarActivity.getSupportFragmentManager()>
    //   18   32:invokevirtual   #500 <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   19   35:invokevirtual   #505 <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
    //   20   38:astore_3        
    //   21   39:aload_0         
    //   22   40:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   23   43:aload_1         
    //   24   44:if_acmpne       95
    //   25   47:aload_0         
    //   26   48:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   27   51:ifnull          82
    //   28   54:aload_0         
    //   29   55:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   30   58:invokevirtual   #146 <Method ActionBar$TabListener ActionBarImplBase$TabImpl.getCallback()>
    //   31   61:aload_0         
    //   32   62:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   33   65:aload_3         
    //   34   66:invokeinterface #511 <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
    //   35   71:aload_0         
    //   36   72:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   37   75:aload_1         
    //   38   76:invokevirtual   #478 <Method int ActionBar$Tab.getPosition()>
    //   39   79:invokevirtual   #514 <Method void ScrollingTabContainerView.animateToTab(int)>
    //   40   82:aload_3         
    //   41   83:invokevirtual   #515 <Method boolean FragmentTransaction.isEmpty()>
    //   42   86:ifne            24
    //   43   89:aload_3         
    //   44   90:invokevirtual   #518 <Method int FragmentTransaction.commit()>
    //   45   93:pop             
    //   46   94:return          
    //   47   95:aload_0         
    //   48   96:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   49   99:astore          4
    //   50  101:aload_1         
    //   51  102:ifnull          110
    //   52  105:aload_1         
    //   53  106:invokevirtual   #478 <Method int ActionBar$Tab.getPosition()>
    //   54  109:istore_2        
    //   55  110:aload           4
    //   56  112:iload_2         
    //   57  113:invokevirtual   #521 <Method void ScrollingTabContainerView.setTabSelected(int)>
    //   58  116:aload_0         
    //   59  117:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   60  120:ifnull          140
    //   61  123:aload_0         
    //   62  124:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   63  127:invokevirtual   #146 <Method ActionBar$TabListener ActionBarImplBase$TabImpl.getCallback()>
    //   64  130:aload_0         
    //   65  131:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   66  134:aload_3         
    //   67  135:invokeinterface #524 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
    //   68  140:aload_0         
    //   69  141:aload_1         
    //   70  142:checkcast       #142 <Class ActionBarImplBase$TabImpl>
    //   71  145:putfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   72  148:aload_0         
    //   73  149:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   74  152:ifnull          82
    //   75  155:aload_0         
    //   76  156:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   77  159:invokevirtual   #146 <Method ActionBar$TabListener ActionBarImplBase$TabImpl.getCallback()>
    //   78  162:aload_0         
    //   79  163:getfield        #126 <Field ActionBarImplBase$TabImpl mSelectedTab>
    //   80  166:aload_3         
    //   81  167:invokeinterface #527 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
    //   82  172:goto            82
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #189 <Field ActionBarContainer mContainerView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #532 <Method void ActionBarContainer.setPrimaryBackground(Drawable)>
    //    4    8:return          
    }

    public void setCustomView(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #535 <Method Context getThemedContext()>
    //    3    5:invokestatic    #541 <Method LayoutInflater LayoutInflater.from(Context)>
    //    4    8:iload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #123 <Field ActionBarView mActionView>
    //    7   13:iconst_0        
    //    8   14:invokevirtual   #545 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    9   17:invokevirtual   #548 <Method void setCustomView(View)>
    //   10   20:return          
    }

    public void setCustomView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #551 <Method void ActionBarView.setCustomNavigationView(View)>
    //    4    8:return          
    }

    public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #558 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    3    5:aload_0         
    //    4    6:getfield        #123 <Field ActionBarView mActionView>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #551 <Method void ActionBarView.setCustomNavigationView(View)>
    //    7   13:return          
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            13
    //    2    4:iconst_4        
    //    3    5:istore_2        
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:iconst_4        
    //    7    9:invokevirtual   #563 <Method void setDisplayOptions(int, int)>
    //    8   12:return          
    //    9   13:iconst_0        
    //   10   14:istore_2        
    //   11   15:goto            6
    }

    public void setDisplayOptions(int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_4        
    //    2    2:iand            
    //    3    3:ifeq            11
    //    4    6:aload_0         
    //    5    7:iconst_1        
    //    6    8:putfield        #277 <Field boolean mDisplayHomeAsUpSet>
    //    7   11:aload_0         
    //    8   12:getfield        #123 <Field ActionBarView mActionView>
    //    9   15:iload_1         
    //   10   16:invokevirtual   #565 <Method void ActionBarView.setDisplayOptions(int)>
    //   11   19:return          
    }

    public void setDisplayOptions(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #275 <Method int ActionBarView.getDisplayOptions()>
    //    3    7:istore_3        
    //    4    8:iload_2         
    //    5    9:iconst_4        
    //    6   10:iand            
    //    7   11:ifeq            19
    //    8   14:aload_0         
    //    9   15:iconst_1        
    //   10   16:putfield        #277 <Field boolean mDisplayHomeAsUpSet>
    //   11   19:aload_0         
    //   12   20:getfield        #123 <Field ActionBarView mActionView>
    //   13   23:iload_1         
    //   14   24:iload_2         
    //   15   25:iand            
    //   16   26:iload_3         
    //   17   27:iload_2         
    //   18   28:iconst_m1       
    //   19   29:ixor            
    //   20   30:iand            
    //   21   31:ior             
    //   22   32:invokevirtual   #565 <Method void ActionBarView.setDisplayOptions(int)>
    //   23   35:return          
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            15
    //    2    4:bipush          16
    //    3    6:istore_2        
    //    4    7:aload_0         
    //    5    8:iload_2         
    //    6    9:bipush          16
    //    7   11:invokevirtual   #563 <Method void setDisplayOptions(int, int)>
    //    8   14:return          
    //    9   15:iconst_0        
    //   10   16:istore_2        
    //   11   17:goto            7
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            13
    //    2    4:iconst_2        
    //    3    5:istore_2        
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:iconst_2        
    //    7    9:invokevirtual   #563 <Method void setDisplayOptions(int, int)>
    //    8   12:return          
    //    9   13:iconst_0        
    //   10   14:istore_2        
    //   11   15:goto            6
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            15
    //    2    4:bipush          8
    //    3    6:istore_2        
    //    4    7:aload_0         
    //    5    8:iload_2         
    //    6    9:bipush          8
    //    7   11:invokevirtual   #563 <Method void setDisplayOptions(int, int)>
    //    8   14:return          
    //    9   15:iconst_0        
    //   10   16:istore_2        
    //   11   17:goto            7
    }

    public void setDisplayUseLogoEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            13
    //    2    4:iconst_1        
    //    3    5:istore_2        
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:iconst_1        
    //    7    9:invokevirtual   #563 <Method void setDisplayOptions(int, int)>
    //    8   12:return          
    //    9   13:iconst_0        
    //   10   14:istore_2        
    //   11   15:goto            6
    }

    public void setHomeButtonEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #570 <Method void ActionBarView.setHomeButtonEnabled(boolean)>
    //    4    8:return          
    }

    public void setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #573 <Method void ActionBarView.setIcon(int)>
    //    4    8:return          
    }

    public void setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #575 <Method void ActionBarView.setIcon(Drawable)>
    //    4    8:return          
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #581 <Method void ActionBarView.setDropdownAdapter(SpinnerAdapter)>
    //    4    8:aload_0         
    //    5    9:getfield        #123 <Field ActionBarView mActionView>
    //    6   12:aload_2         
    //    7   13:invokevirtual   #585 <Method void ActionBarView.setCallback(ActionBar$OnNavigationListener)>
    //    8   16:return          
    }

    public void setLogo(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #588 <Method void ActionBarView.setLogo(int)>
    //    4    8:return          
    }

    public void setLogo(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #590 <Method void ActionBarView.setLogo(Drawable)>
    //    4    8:return          
    }

    public void setNavigationMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #398 <Method int ActionBarView.getNavigationMode()>
    //    3    7:tableswitch     2 2: default 24
    //                   2 85
    //    4   24:aload_0         
    //    5   25:getfield        #123 <Field ActionBarView mActionView>
    //    6   28:iload_1         
    //    7   29:invokevirtual   #593 <Method void ActionBarView.setNavigationMode(int)>
    //    8   32:iload_1         
    //    9   33:tableswitch     2 2: default 52
    //                   2 110
    //   10   52:aload_0         
    //   11   53:getfield        #123 <Field ActionBarView mActionView>
    //   12   56:astore_2        
    //   13   57:iconst_0        
    //   14   58:istore_3        
    //   15   59:iload_1         
    //   16   60:iconst_2        
    //   17   61:icmpne          79
    //   18   64:aload_0         
    //   19   65:getfield        #175 <Field boolean mHasEmbeddedTabs>
    //   20   68:istore          4
    //   21   70:iconst_0        
    //   22   71:istore_3        
    //   23   72:iload           4
    //   24   74:ifne            79
    //   25   77:iconst_1        
    //   26   78:istore_3        
    //   27   79:aload_2         
    //   28   80:iload_3         
    //   29   81:invokevirtual   #306 <Method void ActionBarView.setCollapsable(boolean)>
    //   30   84:return          
    //   31   85:aload_0         
    //   32   86:aload_0         
    //   33   87:invokevirtual   #595 <Method int getSelectedNavigationIndex()>
    //   34   90:putfield        #76  <Field int mSavedTabPosition>
    //   35   93:aload_0         
    //   36   94:aconst_null     
    //   37   95:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //   38   98:aload_0         
    //   39   99:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   40  102:bipush          8
    //   41  104:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   42  107:goto            24
    //   43  110:aload_0         
    //   44  111:invokespecial   #332 <Method void ensureTabsExist()>
    //   45  114:aload_0         
    //   46  115:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //   47  118:iconst_0        
    //   48  119:invokevirtual   #178 <Method void ScrollingTabContainerView.setVisibility(int)>
    //   49  122:aload_0         
    //   50  123:getfield        #76  <Field int mSavedTabPosition>
    //   51  126:iconst_m1       
    //   52  127:icmpeq          52
    //   53  130:aload_0         
    //   54  131:aload_0         
    //   55  132:getfield        #76  <Field int mSavedTabPosition>
    //   56  135:invokevirtual   #598 <Method void setSelectedNavigationItem(int)>
    //   57  138:aload_0         
    //   58  139:iconst_m1       
    //   59  140:putfield        #76  <Field int mSavedTabPosition>
    //   60  143:goto            52
    }

    public void setSelectedNavigationItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:invokevirtual   #398 <Method int ActionBarView.getNavigationMode()>
    //    3    7:tableswitch     1 2: default 28
    //                   1 55
    //                   2 39
    //    4   28:new             #148 <Class IllegalStateException>
    //    5   31:dup             
    //    6   32:ldc2            #600 <String "setSelectedNavigationIndex not valid for current navigation mode">
    //    7   35:invokespecial   #153 <Method void IllegalStateException(String)>
    //    8   38:athrow          
    //    9   39:aload_0         
    //   10   40:aload_0         
    //   11   41:getfield        #74  <Field ArrayList mTabs>
    //   12   44:iload_1         
    //   13   45:invokevirtual   #169 <Method Object ArrayList.get(int)>
    //   14   48:checkcast       #423 <Class ActionBar$Tab>
    //   15   51:invokevirtual   #130 <Method void selectTab(ActionBar$Tab)>
    //   16   54:return          
    //   17   55:aload_0         
    //   18   56:getfield        #123 <Field ActionBarView mActionView>
    //   19   59:iload_1         
    //   20   60:invokevirtual   #603 <Method void ActionBarView.setDropdownSelectedPosition(int)>
    //   21   63:return          
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #463 <Field boolean mShowHideAnimationEnabled>
    //    3    5:iload_1         
    //    4    6:ifne            30
    //    5    9:aload_0         
    //    6   10:getfield        #231 <Field ViewGroup mTopVisibilityView>
    //    7   13:invokevirtual   #354 <Method void ViewGroup.clearAnimation()>
    //    8   16:aload_0         
    //    9   17:getfield        #236 <Field ActionBarContainer mSplitView>
    //   10   20:ifnull          30
    //   11   23:aload_0         
    //   12   24:getfield        #236 <Field ActionBarContainer mSplitView>
    //   13   27:invokevirtual   #605 <Method void ActionBarContainer.clearAnimation()>
    //   14   30:return          
    }

    public void setSubtitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #91  <Field Context mContext>
    //    3    5:iload_1         
    //    4    6:invokevirtual   #610 <Method String Context.getString(int)>
    //    5    9:invokevirtual   #612 <Method void setSubtitle(CharSequence)>
    //    6   12:return          
    }

    public void setSubtitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #613 <Method void ActionBarView.setSubtitle(CharSequence)>
    //    4    8:return          
    }

    public void setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #91  <Field Context mContext>
    //    3    5:iload_1         
    //    4    6:invokevirtual   #610 <Method String Context.getString(int)>
    //    5    9:invokevirtual   #303 <Method void setTitle(CharSequence)>
    //    6   12:return          
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #614 <Method void ActionBarView.setTitle(CharSequence)>
    //    4    8:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field boolean mHiddenByApp>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #107 <Field boolean mHiddenByApp>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:invokespecial   #461 <Method void updateVisibility(boolean)>
    //    9   17:return          
    }

    void showForActionMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #309 <Field boolean mShowingForMode>
    //    2    4:ifne            17
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #309 <Field boolean mShowingForMode>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:invokespecial   #461 <Method void updateVisibility(boolean)>
    //    9   17:return          
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #619 <Field ActionBarImplBase$ActionModeImpl mActionMode>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #619 <Field ActionBarImplBase$ActionModeImpl mActionMode>
    //    5   11:invokevirtual   #624 <Method void ActionBarImplBase$ActionModeImpl.finish()>
    //    6   14:aload_0         
    //    7   15:getfield        #119 <Field ActionBarContextView mContextView>
    //    8   18:invokevirtual   #627 <Method void ActionBarContextView.killMode()>
    //    9   21:new             #621 <Class ActionBarImplBase$ActionModeImpl>
    //   10   24:dup             
    //   11   25:aload_0         
    //   12   26:aload_1         
    //   13   27:invokespecial   #630 <Method void ActionBarImplBase$ActionModeImpl(ActionBarImplBase, android.support.v7.view.ActionMode$Callback)>
    //   14   30:astore_2        
    //   15   31:aload_2         
    //   16   32:invokevirtual   #633 <Method boolean ActionBarImplBase$ActionModeImpl.dispatchOnCreate()>
    //   17   35:ifeq            104
    //   18   38:aload_2         
    //   19   39:invokevirtual   #636 <Method void ActionBarImplBase$ActionModeImpl.invalidate()>
    //   20   42:aload_0         
    //   21   43:getfield        #119 <Field ActionBarContextView mContextView>
    //   22   46:aload_2         
    //   23   47:invokevirtual   #640 <Method void ActionBarContextView.initForMode(ActionMode)>
    //   24   50:aload_0         
    //   25   51:iconst_1        
    //   26   52:invokevirtual   #642 <Method void animateToMode(boolean)>
    //   27   55:aload_0         
    //   28   56:getfield        #236 <Field ActionBarContainer mSplitView>
    //   29   59:ifnull          88
    //   30   62:aload_0         
    //   31   63:getfield        #272 <Field int mContextDisplayMode>
    //   32   66:iconst_1        
    //   33   67:icmpne          88
    //   34   70:aload_0         
    //   35   71:getfield        #236 <Field ActionBarContainer mSplitView>
    //   36   74:invokevirtual   #377 <Method int ActionBarContainer.getVisibility()>
    //   37   77:ifeq            88
    //   38   80:aload_0         
    //   39   81:getfield        #236 <Field ActionBarContainer mSplitView>
    //   40   84:iconst_0        
    //   41   85:invokevirtual   #382 <Method void ActionBarContainer.setVisibility(int)>
    //   42   88:aload_0         
    //   43   89:getfield        #119 <Field ActionBarContextView mContextView>
    //   44   92:bipush          32
    //   45   94:invokevirtual   #645 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
    //   46   97:aload_0         
    //   47   98:aload_2         
    //   48   99:putfield        #619 <Field ActionBarImplBase$ActionModeImpl mActionMode>
    //   49  102:aload_2         
    //   50  103:areturn         
    //   51  104:aconst_null     
    //   52  105:areturn         
    }

    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final int INVALID_POSITION = -1;
    ActionModeImpl mActionMode;
    private ActionBarView mActionView;
    private ActionBarActivity mActivity;
    private ActionBar.Callback mCallback;
    private ActionBarContainer mContainerView;
    private View mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    ActionMode mDeferredDestroyActionMode;
    android.support.v7.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    final Handler mHandler;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    private boolean mShowingForMode;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    Runnable mTabSelector;
    private ArrayList mTabs;
    private Context mThemedContext;
    private ViewGroup mTopVisibilityView;

    static ScrollingTabContainerView access$000(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field ScrollingTabContainerView mTabScrollView>
    //    2    4:areturn         
    }

    static Context access$100(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Context mContext>
    //    2    4:areturn         
    }

    static boolean access$200(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field boolean mHiddenByApp>
    //    2    4:ireturn         
    }

    static boolean access$300(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #110 <Field boolean mHiddenBySystem>
    //    2    4:ireturn         
    }

    static boolean access$400(boolean flag, boolean flag1, boolean flag2)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #115 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
    //    4    6:ireturn         
    }

    static ActionBarContextView access$500(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field ActionBarContextView mContextView>
    //    2    4:areturn         
    }

    static ActionBarView access$600(ActionBarImplBase actionbarimplbase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field ActionBarView mActionView>
    //    2    4:areturn         
    }
}
