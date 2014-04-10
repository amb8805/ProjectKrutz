// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.support.v4.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class MenuItemWrapperJB extends MenuItemWrapperICS
{
    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
        implements android.support.v4.view.ActionProvider.VisibilityListener
    {

        public ActionProviderWrapperJB(ActionProvider actionprovider)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field MenuItemWrapperJB this$0>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_2         
        //    6    8:invokespecial   #17  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, ActionProvider)>
        //    7   11:return          
        }

        public boolean isVisible()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:invokevirtual   #27  <Method boolean ActionProvider.isVisible()>
        //    3    7:ireturn         
        }

        public void onActionProviderVisibilityChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #31  <Field android.view.ActionProvider$VisibilityListener mListener>
        //    2    4:ifnull          17
        //    3    7:aload_0         
        //    4    8:getfield        #31  <Field android.view.ActionProvider$VisibilityListener mListener>
        //    5   11:iload_1         
        //    6   12:invokeinterface #35  <Method void android.view.ActionProvider$VisibilityListener.onActionProviderVisibilityChanged(boolean)>
        //    7   17:return          
        }

        public View onCreateActionView(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #39  <Method View ActionProvider.onCreateActionView(MenuItem)>
        //    4    8:areturn         
        }

        public boolean overridesItemVisibility()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:invokevirtual   #42  <Method boolean ActionProvider.overridesItemVisibility()>
        //    3    7:ireturn         
        }

        public void refreshVisibility()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ActionProvider mInner>
        //    2    4:invokevirtual   #46  <Method void ActionProvider.refreshVisibility()>
        //    3    7:return          
        }

        public void setVisibilityListener(android.view.ActionProvider.VisibilityListener visibilitylistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field android.view.ActionProvider$VisibilityListener mListener>
        //    3    5:aload_0         
        //    4    6:getfield        #23  <Field ActionProvider mInner>
        //    5    9:astore_2        
        //    6   10:aload_1         
        //    7   11:ifnull          20
        //    8   14:aload_2         
        //    9   15:aload_0         
        //   10   16:invokevirtual   #51  <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
        //   11   19:return          
        //   12   20:aconst_null     
        //   13   21:astore_0        
        //   14   22:goto            14
        }

        android.view.ActionProvider.VisibilityListener mListener;
        final MenuItemWrapperJB this$0;
    }


    MenuItemWrapperJB(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #9   <Method void MenuItemWrapperICS(MenuItem, boolean)>
    //    4    6:return          
    }

    MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
    //    0    0:new             #13  <Class MenuItemWrapperJB$ActionProviderWrapperJB>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #16  <Method void MenuItemWrapperJB$ActionProviderWrapperJB(MenuItemWrapperJB, ActionProvider)>
    //    5    9:areturn         
    }
}
