// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.MenuItem;

class MenuItemCompatIcs
{
    static class OnActionExpandListenerWrapper
        implements android.view.MenuItem.OnActionExpandListener
    {

        public OnActionExpandListenerWrapper(SupportActionExpandProxy supportactionexpandproxy)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #15  <Field MenuItemCompatIcs$SupportActionExpandProxy mWrapped>
        //    5    9:return          
        }

        public boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field MenuItemCompatIcs$SupportActionExpandProxy mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #21  <Method boolean MenuItemCompatIcs$SupportActionExpandProxy.onMenuItemActionCollapse(MenuItem)>
        //    4   10:ireturn         
        }

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field MenuItemCompatIcs$SupportActionExpandProxy mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #24  <Method boolean MenuItemCompatIcs$SupportActionExpandProxy.onMenuItemActionExpand(MenuItem)>
        //    4   10:ireturn         
        }

        private SupportActionExpandProxy mWrapped;
    }

    static interface SupportActionExpandProxy
    {

        public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

        public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
    }


    MenuItemCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean collapseActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #15  <Method boolean MenuItem.collapseActionView()>
    //    2    6:ireturn         
    }

    public static boolean expandActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #18  <Method boolean MenuItem.expandActionView()>
    //    2    6:ireturn         
    }

    public static boolean isActionViewExpanded(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #21  <Method boolean MenuItem.isActionViewExpanded()>
    //    2    6:ireturn         
    }

    public static MenuItem setOnActionExpandListener(MenuItem menuitem, SupportActionExpandProxy supportactionexpandproxy)
    {
    //    0    0:aload_0         
    //    1    1:new             #25  <Class MenuItemCompatIcs$OnActionExpandListenerWrapper>
    //    2    4:dup             
    //    3    5:aload_1         
    //    4    6:invokespecial   #28  <Method void MenuItemCompatIcs$OnActionExpandListenerWrapper(MenuItemCompatIcs$SupportActionExpandProxy)>
    //    5    9:invokeinterface #31  <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
    //    6   14:areturn         
    }
}
