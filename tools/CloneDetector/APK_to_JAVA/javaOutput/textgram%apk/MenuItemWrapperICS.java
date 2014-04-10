// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuWrapper, BaseWrapper

class MenuItemWrapperICS extends BaseMenuWrapper
    implements SupportMenuItem
{
    class ActionProviderWrapper extends android.view.ActionProvider
    {

        public ActionProviderWrapper(ActionProvider actionprovider)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field MenuItemWrapperICS this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokevirtual   #18  <Method android.content.Context ActionProvider.getContext()>
        //    6   10:invokespecial   #21  <Method void android.view.ActionProvider(android.content.Context)>
        //    7   13:aload_0         
        //    8   14:aload_2         
        //    9   15:putfield        #23  <Field ActionProvider mInner>
        //   10   18:aload_1         
        //   11   19:invokestatic    #29  <Method boolean MenuItemWrapperICS.access$000(MenuItemWrapperICS)>
        //   12   22:ifeq            41
        //   13   25:aload_0         
        //   14   26:getfield        #23  <Field ActionProvider mInner>
        //   15   29:new             #31  <Class MenuItemWrapperICS$ActionProviderWrapper$1>
        //   16   32:dup             
        //   17   33:aload_0         
        //   18   34:aload_1         
        //   19   35:invokespecial   #34  <Method void MenuItemWrapperICS$ActionProviderWrapper$1(MenuItemWrapperICS$ActionProviderWrapper, MenuItemWrapperICS)>
        //   20   38:invokevirtual   #38  <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
        //   21   41:return          
        }

        public boolean hasSubMenu()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:invokevirtual   #42  <Method boolean ActionProvider.hasSubMenu()>
        //    3    7:ireturn         
        }

        public View onCreateActionView()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field MenuItemWrapperICS this$0>
        //    2    4:invokestatic    #29  <Method boolean MenuItemWrapperICS.access$000(MenuItemWrapperICS)>
        //    3    7:ifeq            18
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field MenuItemWrapperICS this$0>
        //    6   14:invokevirtual   #47  <Method boolean MenuItemWrapperICS.checkActionProviderOverrideVisibility()>
        //    7   17:pop             
        //    8   18:aload_0         
        //    9   19:getfield        #23  <Field ActionProvider mInner>
        //   10   22:invokevirtual   #49  <Method View ActionProvider.onCreateActionView()>
        //   11   25:areturn         
        }

        public boolean onPerformDefaultAction()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:invokevirtual   #52  <Method boolean ActionProvider.onPerformDefaultAction()>
        //    3    7:ireturn         
        }

        public void onPrepareSubMenu(SubMenu submenu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:aload_0         
        //    3    5:getfield        #12  <Field MenuItemWrapperICS this$0>
        //    4    8:aload_1         
        //    5    9:invokevirtual   #58  <Method SubMenu MenuItemWrapperICS.getSubMenuWrapper(SubMenu)>
        //    6   12:invokevirtual   #60  <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
        //    7   15:return          
        }

        final ActionProvider mInner;
        final MenuItemWrapperICS this$0;
    }

    static class CollapsibleActionViewWrapper extends FrameLayout
        implements android.view.CollapsibleActionView
    {

        CollapsibleActionViewWrapper(View view)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #16  <Method android.content.Context View.getContext()>
        //    3    5:invokespecial   #19  <Method void FrameLayout(android.content.Context)>
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:checkcast       #21  <Class CollapsibleActionView>
        //    7   13:putfield        #23  <Field CollapsibleActionView mWrappedView>
        //    8   16:aload_0         
        //    9   17:aload_1         
        //   10   18:invokevirtual   #26  <Method void addView(View)>
        //   11   21:return          
        }

        View getWrappedView()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
        //    2    4:checkcast       #12  <Class View>
        //    3    7:areturn         
        }

        public void onActionViewCollapsed()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
        //    2    4:invokeinterface #32  <Method void CollapsibleActionView.onActionViewCollapsed()>
        //    3    9:return          
        }

        public void onActionViewExpanded()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
        //    2    4:invokeinterface #35  <Method void CollapsibleActionView.onActionViewExpanded()>
        //    3    9:return          
        }

        final CollapsibleActionView mWrappedView;
    }

    private class OnActionExpandListenerWrapper extends BaseWrapper
        implements android.view.MenuItem.OnActionExpandListener
    {

        OnActionExpandListenerWrapper(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field MenuItemWrapperICS this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #16  <Method void BaseWrapper(Object)>
        //    6   10:return          
        }

        public boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field Object mWrappedObject>
        //    2    4:checkcast       #24  <Class android.support.v4.view.MenuItemCompat$OnActionExpandListener>
        //    3    7:aload_0         
        //    4    8:getfield        #13  <Field MenuItemWrapperICS this$0>
        //    5   11:aload_1         
        //    6   12:invokevirtual   #30  <Method SupportMenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
        //    7   15:invokeinterface #32  <Method boolean android.support.v4.view.MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
        //    8   20:ireturn         
        }

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field Object mWrappedObject>
        //    2    4:checkcast       #24  <Class android.support.v4.view.MenuItemCompat$OnActionExpandListener>
        //    3    7:aload_0         
        //    4    8:getfield        #13  <Field MenuItemWrapperICS this$0>
        //    5   11:aload_1         
        //    6   12:invokevirtual   #30  <Method SupportMenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
        //    7   15:invokeinterface #35  <Method boolean android.support.v4.view.MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
        //    8   20:ireturn         
        }

        final MenuItemWrapperICS this$0;
    }

    private class OnMenuItemClickListenerWrapper extends BaseWrapper
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field MenuItemWrapperICS this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #16  <Method void BaseWrapper(Object)>
        //    6   10:return          
        }

        public boolean onMenuItemClick(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field Object mWrappedObject>
        //    2    4:checkcast       #7   <Class android.view.MenuItem$OnMenuItemClickListener>
        //    3    7:aload_0         
        //    4    8:getfield        #13  <Field MenuItemWrapperICS this$0>
        //    5   11:aload_1         
        //    6   12:invokevirtual   #28  <Method SupportMenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
        //    7   15:invokeinterface #30  <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
        //    8   20:ireturn         
        }

        final MenuItemWrapperICS this$0;
    }


    MenuItemWrapperICS(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_1        
    //    3    3:invokespecial   #15  <Method void MenuItemWrapperICS(MenuItem, boolean)>
    //    4    6:return          
    }

    MenuItemWrapperICS(MenuItem menuitem, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #18  <Method void BaseMenuWrapper(Object)>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:invokeinterface #24  <Method boolean MenuItem.isVisible()>
    //    6   12:putfield        #26  <Field boolean mLastRequestVisible>
    //    7   15:aload_0         
    //    8   16:iload_2         
    //    9   17:putfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //   10   20:return          
    }

    static boolean access$000(MenuItemWrapperICS menuitemwrapperics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //    5    4:ireturn         
    }

    static boolean access$100(MenuItemWrapperICS menuitemwrapperics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field boolean mLastRequestVisible>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #26  <Field boolean mLastRequestVisible>
    //    5    4:ireturn         
    }

    final boolean checkActionProviderOverrideVisibility()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field boolean mLastRequestVisible>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_1         
    //    6    8:ifeq            56
    //    7   11:aload_0         
    //    8   12:invokevirtual   #36  <Method ActionProvider getSupportActionProvider()>
    //    9   15:astore_3        
    //   10   16:iconst_0        
    //   11   17:istore_2        
    //   12   18:aload_3         
    //   13   19:ifnull          56
    //   14   22:aload_3         
    //   15   23:invokevirtual   #41  <Method boolean ActionProvider.overridesItemVisibility()>
    //   16   26:istore          4
    //   17   28:iconst_0        
    //   18   29:istore_2        
    //   19   30:iload           4
    //   20   32:ifeq            56
    //   21   35:aload_3         
    //   22   36:invokevirtual   #42  <Method boolean ActionProvider.isVisible()>
    //   23   39:istore          5
    //   24   41:iconst_0        
    //   25   42:istore_2        
    //   26   43:iload           5
    //   27   45:ifne            56
    //   28   48:aload_0         
    //   29   49:iconst_0        
    //   30   50:invokevirtual   #46  <Method MenuItem wrappedSetVisible(boolean)>
    //   31   53:pop             
    //   32   54:iconst_1        
    //   33   55:istore_2        
    //   34   56:iload_2         
    //   35   57:ireturn         
    }

    public boolean collapseActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #53  <Method boolean MenuItem.collapseActionView()>
    //    4   12:ireturn         
    }

    ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
    //    0    0:new             #57  <Class MenuItemWrapperICS$ActionProviderWrapper>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #60  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, ActionProvider)>
    //    5    9:areturn         
    }

    public boolean expandActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #63  <Method boolean MenuItem.expandActionView()>
    //    4   12:ireturn         
    }

    public android.view.ActionProvider getActionProvider()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #67  <Method android.view.ActionProvider MenuItem.getActionProvider()>
    //    4   12:areturn         
    }

    public View getActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #71  <Method View MenuItem.getActionView()>
    //    4   12:astore_1        
    //    5   13:aload_1         
    //    6   14:instanceof      #73  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
    //    7   17:ifeq            28
    //    8   20:aload_1         
    //    9   21:checkcast       #73  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
    //   10   24:invokevirtual   #76  <Method View MenuItemWrapperICS$CollapsibleActionViewWrapper.getWrappedView()>
    //   11   27:astore_1        
    //   12   28:aload_1         
    //   13   29:areturn         
    }

    public char getAlphabeticShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #80  <Method char MenuItem.getAlphabeticShortcut()>
    //    4   12:ireturn         
    }

    public int getGroupId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #84  <Method int MenuItem.getGroupId()>
    //    4   12:ireturn         
    }

    public Drawable getIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #88  <Method Drawable MenuItem.getIcon()>
    //    4   12:areturn         
    }

    public Intent getIntent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #92  <Method Intent MenuItem.getIntent()>
    //    4   12:areturn         
    }

    public int getItemId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #95  <Method int MenuItem.getItemId()>
    //    4   12:ireturn         
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #99  <Method android.view.ContextMenu$ContextMenuInfo MenuItem.getMenuInfo()>
    //    4   12:areturn         
    }

    public char getNumericShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #102 <Method char MenuItem.getNumericShortcut()>
    //    4   12:ireturn         
    }

    public int getOrder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #105 <Method int MenuItem.getOrder()>
    //    4   12:ireturn         
    }

    public SubMenu getSubMenu()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #51  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class MenuItem>
    //    4    8:invokeinterface #109 <Method SubMenu MenuItem.getSubMenu()>
    //    5   13:invokevirtual   #113 <Method SubMenu getSubMenuWrapper(SubMenu)>
    //    6   16:areturn         
    }

    public ActionProvider getSupportActionProvider()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #67  <Method android.view.ActionProvider MenuItem.getActionProvider()>
    //    4   12:checkcast       #57  <Class MenuItemWrapperICS$ActionProviderWrapper>
    //    5   15:astore_1        
    //    6   16:aload_1         
    //    7   17:ifnull          25
    //    8   20:aload_1         
    //    9   21:getfield        #117 <Field ActionProvider MenuItemWrapperICS$ActionProviderWrapper.mInner>
    //   10   24:areturn         
    //   11   25:aconst_null     
    //   12   26:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #121 <Method CharSequence MenuItem.getTitle()>
    //    4   12:areturn         
    }

    public CharSequence getTitleCondensed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #124 <Method CharSequence MenuItem.getTitleCondensed()>
    //    4   12:areturn         
    }

    public boolean hasSubMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #127 <Method boolean MenuItem.hasSubMenu()>
    //    4   12:ireturn         
    }

    public boolean isActionViewExpanded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #130 <Method boolean MenuItem.isActionViewExpanded()>
    //    4   12:ireturn         
    }

    public boolean isCheckable()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #133 <Method boolean MenuItem.isCheckable()>
    //    4   12:ireturn         
    }

    public boolean isChecked()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #136 <Method boolean MenuItem.isChecked()>
    //    4   12:ireturn         
    }

    public boolean isEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #139 <Method boolean MenuItem.isEnabled()>
    //    4   12:ireturn         
    }

    public boolean isVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:invokeinterface #24  <Method boolean MenuItem.isVisible()>
    //    4   12:ireturn         
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #143 <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
    //    5   13:pop             
    //    6   14:aload_1         
    //    7   15:ifnull          30
    //    8   18:aload_0         
    //    9   19:getfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //   10   22:ifeq            30
    //   11   25:aload_0         
    //   12   26:invokevirtual   #145 <Method boolean checkActionProviderOverrideVisibility()>
    //   13   29:pop             
    //   14   30:aload_0         
    //   15   31:areturn         
    }

    public MenuItem setActionView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #149 <Method MenuItem MenuItem.setActionView(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:getfield        #51  <Field Object mWrappedObject>
    //    8   18:checkcast       #20  <Class MenuItem>
    //    9   21:invokeinterface #71  <Method View MenuItem.getActionView()>
    //   10   26:astore_3        
    //   11   27:aload_3         
    //   12   28:instanceof      #151 <Class CollapsibleActionView>
    //   13   31:ifeq            55
    //   14   34:aload_0         
    //   15   35:getfield        #51  <Field Object mWrappedObject>
    //   16   38:checkcast       #20  <Class MenuItem>
    //   17   41:new             #73  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
    //   18   44:dup             
    //   19   45:aload_3         
    //   20   46:invokespecial   #154 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
    //   21   49:invokeinterface #157 <Method MenuItem MenuItem.setActionView(View)>
    //   22   54:pop             
    //   23   55:aload_0         
    //   24   56:areturn         
    }

    public MenuItem setActionView(View view)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #151 <Class CollapsibleActionView>
    //    2    4:ifeq            16
    //    3    7:new             #73  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
    //    4   10:dup             
    //    5   11:aload_1         
    //    6   12:invokespecial   #154 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
    //    7   15:astore_1        
    //    8   16:aload_0         
    //    9   17:getfield        #51  <Field Object mWrappedObject>
    //   10   20:checkcast       #20  <Class MenuItem>
    //   11   23:aload_1         
    //   12   24:invokeinterface #157 <Method MenuItem MenuItem.setActionView(View)>
    //   13   29:pop             
    //   14   30:aload_0         
    //   15   31:areturn         
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #161 <Method MenuItem MenuItem.setAlphabeticShortcut(char)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setCheckable(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #164 <Method MenuItem MenuItem.setCheckable(boolean)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setChecked(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #167 <Method MenuItem MenuItem.setChecked(boolean)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #170 <Method MenuItem MenuItem.setEnabled(boolean)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #173 <Method MenuItem MenuItem.setIcon(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #176 <Method MenuItem MenuItem.setIcon(Drawable)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #180 <Method MenuItem MenuItem.setIntent(Intent)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setNumericShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #183 <Method MenuItem MenuItem.setNumericShortcut(char)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #187 <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:astore_2        
    //    4    8:aload_1         
    //    5    9:ifnull          32
    //    6   12:new             #191 <Class MenuItemWrapperICS$OnMenuItemClickListenerWrapper>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:aload_1         
    //   10   18:invokespecial   #194 <Method void MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnMenuItemClickListener)>
    //   11   21:astore_3        
    //   12   22:aload_2         
    //   13   23:aload_3         
    //   14   24:invokeinterface #196 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
    //   15   29:pop             
    //   16   30:aload_0         
    //   17   31:areturn         
    //   18   32:aconst_null     
    //   19   33:astore_3        
    //   20   34:goto            22
    }

    public MenuItem setShortcut(char c, char c1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:invokeinterface #200 <Method MenuItem MenuItem.setShortcut(char, char)>
    //    6   14:pop             
    //    7   15:aload_0         
    //    8   16:areturn         
    }

    public void setShowAsAction(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #204 <Method void MenuItem.setShowAsAction(int)>
    //    5   13:return          
    }

    public MenuItem setShowAsActionFlags(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #207 <Method MenuItem MenuItem.setShowAsActionFlags(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:astore_2        
    //    4    8:aload_1         
    //    5    9:ifnull          28
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:invokevirtual   #211 <Method MenuItemWrapperICS$ActionProviderWrapper createActionProviderWrapper(ActionProvider)>
    //    9   17:astore_3        
    //   10   18:aload_2         
    //   11   19:aload_3         
    //   12   20:invokeinterface #143 <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
    //   13   25:pop             
    //   14   26:aload_0         
    //   15   27:areturn         
    //   16   28:aconst_null     
    //   17   29:astore_3        
    //   18   30:goto            18
    }

    public SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:astore_2        
    //    4    8:aload_1         
    //    5    9:ifnull          32
    //    6   12:new             #215 <Class MenuItemWrapperICS$OnActionExpandListenerWrapper>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:aload_1         
    //   10   18:invokespecial   #218 <Method void MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS, android.support.v4.view.MenuItemCompat$OnActionExpandListener)>
    //   11   21:astore_3        
    //   12   22:aload_2         
    //   13   23:aload_3         
    //   14   24:invokeinterface #187 <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
    //   15   29:pop             
    //   16   30:aconst_null     
    //   17   31:areturn         
    //   18   32:aconst_null     
    //   19   33:astore_3        
    //   20   34:goto            22
    }

    public MenuItem setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #221 <Method MenuItem MenuItem.setTitle(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #224 <Method MenuItem MenuItem.setTitle(CharSequence)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:aload_1         
    //    4    8:invokeinterface #227 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public MenuItem setVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //    2    4:ifeq            21
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:putfield        #26  <Field boolean mLastRequestVisible>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #145 <Method boolean checkActionProviderOverrideVisibility()>
    //    8   16:ifeq            21
    //    9   19:aload_0         
    //   10   20:areturn         
    //   11   21:aload_0         
    //   12   22:iload_1         
    //   13   23:invokevirtual   #46  <Method MenuItem wrappedSetVisible(boolean)>
    //   14   26:areturn         
    }

    final MenuItem wrappedSetVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class MenuItem>
    //    3    7:iload_1         
    //    4    8:invokeinterface #230 <Method MenuItem MenuItem.setVisible(boolean)>
    //    5   13:areturn         
    }

    private final boolean mEmulateProviderVisibilityOverride;
    private boolean mLastRequestVisible;

    static boolean access$000(MenuItemWrapperICS menuitemwrapperics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field boolean mEmulateProviderVisibilityOverride>
    //    2    4:ireturn         
    }

    static boolean access$100(MenuItemWrapperICS menuitemwrapperics)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field boolean mLastRequestVisible>
    //    2    4:ireturn         
    }

    // Unreferenced inner class android/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1

/* anonymous class */
    class ActionProviderWrapper._cls1
        implements android.support.v4.view.ActionProvider.VisibilityListener
    {

        ActionProviderWrapper._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field MenuItemWrapperICS$ActionProviderWrapper this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field MenuItemWrapperICS val$this$0>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void onActionProviderVisibilityChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field MenuItemWrapperICS$ActionProviderWrapper this$1>
        //    2    4:getfield        #29  <Field ActionProvider MenuItemWrapperICS$ActionProviderWrapper.mInner>
        //    3    7:invokevirtual   #35  <Method boolean ActionProvider.overridesItemVisibility()>
        //    4   10:ifeq            38
        //    5   13:aload_0         
        //    6   14:getfield        #18  <Field MenuItemWrapperICS$ActionProviderWrapper this$1>
        //    7   17:getfield        #38  <Field MenuItemWrapperICS MenuItemWrapperICS$ActionProviderWrapper.this$0>
        //    8   20:invokestatic    #44  <Method boolean MenuItemWrapperICS.access$100(MenuItemWrapperICS)>
        //    9   23:ifeq            38
        //   10   26:aload_0         
        //   11   27:getfield        #18  <Field MenuItemWrapperICS$ActionProviderWrapper this$1>
        //   12   30:getfield        #38  <Field MenuItemWrapperICS MenuItemWrapperICS$ActionProviderWrapper.this$0>
        //   13   33:iload_1         
        //   14   34:invokevirtual   #48  <Method MenuItem MenuItemWrapperICS.wrappedSetVisible(boolean)>
        //   15   37:pop             
        //   16   38:return          
        }

        final ActionProviderWrapper this$1;
        final MenuItemWrapperICS val$this$0;
    }

}
