// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ActionProvider, MenuItemCompatHoneycomb, MenuItemCompatIcs

public class MenuItemCompat
{
    static class BaseMenuVersionImpl
        implements MenuVersionImpl
    {

        BaseMenuVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean collapseActionView(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean expandActionView(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public View getActionView(MenuItem menuitem)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
        //    0    0:return          
        }
    }

    static class HoneycombMenuVersionImpl
        implements MenuVersionImpl
    {

        HoneycombMenuVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean collapseActionView(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean expandActionView(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public View getActionView(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method View MenuItemCompatHoneycomb.getActionView(MenuItem)>
        //    2    4:areturn         
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #24  <Method MenuItem MenuItemCompatHoneycomb.setActionView(MenuItem, int)>
        //    3    5:areturn         
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #27  <Method MenuItem MenuItemCompatHoneycomb.setActionView(MenuItem, View)>
        //    3    5:areturn         
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #33  <Method void MenuItemCompatHoneycomb.setShowAsAction(MenuItem, int)>
        //    3    5:return          
        }
    }

    static class IcsMenuVersionImpl extends HoneycombMenuVersionImpl
    {

        IcsMenuVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void MenuItemCompat$HoneycombMenuVersionImpl()>
        //    2    4:return          
        }

        public boolean collapseActionView(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method boolean MenuItemCompatIcs.collapseActionView(MenuItem)>
        //    2    4:ireturn         
        }

        public boolean expandActionView(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #17  <Method boolean MenuItemCompatIcs.expandActionView(MenuItem)>
        //    2    4:ireturn         
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #20  <Method boolean MenuItemCompatIcs.isActionViewExpanded(MenuItem)>
        //    2    4:ireturn         
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
        //    0    0:aload_2         
        //    1    1:ifnonnull       10
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokestatic    #25  <Method MenuItem MenuItemCompatIcs.setOnActionExpandListener(MenuItem, MenuItemCompatIcs$SupportActionExpandProxy)>
        //    5    9:areturn         
        //    6   10:aload_1         
        //    7   11:new             #27  <Class MenuItemCompat$IcsMenuVersionImpl$1>
        //    8   14:dup             
        //    9   15:aload_0         
        //   10   16:aload_2         
        //   11   17:invokespecial   #30  <Method void MenuItemCompat$IcsMenuVersionImpl$1(MenuItemCompat$IcsMenuVersionImpl, MenuItemCompat$OnActionExpandListener)>
        //   12   20:invokestatic    #25  <Method MenuItem MenuItemCompatIcs.setOnActionExpandListener(MenuItem, MenuItemCompatIcs$SupportActionExpandProxy)>
        //   13   23:areturn         
        }
    }

    static interface MenuVersionImpl
    {

        public abstract boolean collapseActionView(MenuItem menuitem);

        public abstract boolean expandActionView(MenuItem menuitem);

        public abstract View getActionView(MenuItem menuitem);

        public abstract boolean isActionViewExpanded(MenuItem menuitem);

        public abstract MenuItem setActionView(MenuItem menuitem, int i);

        public abstract MenuItem setActionView(MenuItem menuitem, View view);

        public abstract MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener);

        public abstract void setShowAsAction(MenuItem menuitem, int i);
    }

    public static interface OnActionExpandListener
    {

        public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

        public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
    }


    static 
    {
    //    0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          14
    //    4    7:icmplt          21
    //    5   10:new             #30  <Class MenuItemCompat$IcsMenuVersionImpl>
    //    6   13:dup             
    //    7   14:invokespecial   #33  <Method void MenuItemCompat$IcsMenuVersionImpl()>
    //    8   17:putstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          11
    //   12   24:icmplt          38
    //   13   27:new             #37  <Class MenuItemCompat$HoneycombMenuVersionImpl>
    //   14   30:dup             
    //   15   31:invokespecial   #38  <Method void MenuItemCompat$HoneycombMenuVersionImpl()>
    //   16   34:putstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //   17   37:return          
    //   18   38:new             #40  <Class MenuItemCompat$BaseMenuVersionImpl>
    //   19   41:dup             
    //   20   42:invokespecial   #41  <Method void MenuItemCompat$BaseMenuVersionImpl()>
    //   21   45:putstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //   22   48:return          
    }

    public MenuItemCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void Object()>
    //    2    4:return          
    }

    public static boolean collapseActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:invokeinterface #49  <Method boolean SupportMenuItem.collapseActionView()>
    //    6   16:ireturn         
    //    7   17:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    8   20:aload_0         
    //    9   21:invokeinterface #53  <Method boolean MenuItemCompat$MenuVersionImpl.collapseActionView(MenuItem)>
    //   10   26:ireturn         
    }

    public static boolean expandActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:invokeinterface #56  <Method boolean SupportMenuItem.expandActionView()>
    //    6   16:ireturn         
    //    7   17:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    8   20:aload_0         
    //    9   21:invokeinterface #58  <Method boolean MenuItemCompat$MenuVersionImpl.expandActionView(MenuItem)>
    //   10   26:ireturn         
    }

    public static ActionProvider getActionProvider(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:invokeinterface #64  <Method ActionProvider SupportMenuItem.getSupportActionProvider()>
    //    6   16:areturn         
    //    7   17:ldc1            #21  <String "MenuItemCompat">
    //    8   19:ldc1            #66  <String "getActionProvider: item does not implement SupportMenuItem; returning null">
    //    9   21:invokestatic    #72  <Method int Log.w(String, String)>
    //   10   24:pop             
    //   11   25:aconst_null     
    //   12   26:areturn         
    }

    public static View getActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:invokeinterface #77  <Method View SupportMenuItem.getActionView()>
    //    6   16:areturn         
    //    7   17:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    8   20:aload_0         
    //    9   21:invokeinterface #79  <Method View MenuItemCompat$MenuVersionImpl.getActionView(MenuItem)>
    //   10   26:areturn         
    }

    public static boolean isActionViewExpanded(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:invokeinterface #82  <Method boolean SupportMenuItem.isActionViewExpanded()>
    //    6   16:ireturn         
    //    7   17:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    8   20:aload_0         
    //    9   21:invokeinterface #84  <Method boolean MenuItemCompat$MenuVersionImpl.isActionViewExpanded(MenuItem)>
    //   10   26:ireturn         
    }

    public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            18
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:aload_1         
    //    6   12:invokeinterface #90  <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(ActionProvider)>
    //    7   17:areturn         
    //    8   18:ldc1            #21  <String "MenuItemCompat">
    //    9   20:ldc1            #92  <String "setActionProvider: item does not implement SupportMenuItem; ignoring">
    //   10   22:invokestatic    #72  <Method int Log.w(String, String)>
    //   11   25:pop             
    //   12   26:aload_0         
    //   13   27:areturn         
    }

    public static MenuItem setActionView(MenuItem menuitem, int i)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            18
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:iload_1         
    //    6   12:invokeinterface #97  <Method MenuItem SupportMenuItem.setActionView(int)>
    //    7   17:areturn         
    //    8   18:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    9   21:aload_0         
    //   10   22:iload_1         
    //   11   23:invokeinterface #99  <Method MenuItem MenuItemCompat$MenuVersionImpl.setActionView(MenuItem, int)>
    //   12   28:areturn         
    }

    public static MenuItem setActionView(MenuItem menuitem, View view)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            18
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:aload_1         
    //    6   12:invokeinterface #103 <Method MenuItem SupportMenuItem.setActionView(View)>
    //    7   17:areturn         
    //    8   18:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    9   21:aload_0         
    //   10   22:aload_1         
    //   11   23:invokeinterface #105 <Method MenuItem MenuItemCompat$MenuVersionImpl.setActionView(MenuItem, View)>
    //   12   28:areturn         
    }

    public static MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            18
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:aload_1         
    //    6   12:invokeinterface #111 <Method SupportMenuItem SupportMenuItem.setSupportOnActionExpandListener(MenuItemCompat$OnActionExpandListener)>
    //    7   17:areturn         
    //    8   18:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    9   21:aload_0         
    //   10   22:aload_1         
    //   11   23:invokeinterface #113 <Method MenuItem MenuItemCompat$MenuVersionImpl.setOnActionExpandListener(MenuItem, MenuItemCompat$OnActionExpandListener)>
    //   12   28:areturn         
    }

    public static void setShowAsAction(MenuItem menuitem, int i)
    {
    //    0    0:aload_0         
    //    1    1:instanceof      #46  <Class SupportMenuItem>
    //    2    4:ifeq            18
    //    3    7:aload_0         
    //    4    8:checkcast       #46  <Class SupportMenuItem>
    //    5   11:iload_1         
    //    6   12:invokeinterface #118 <Method void SupportMenuItem.setShowAsAction(int)>
    //    7   17:return          
    //    8   18:getstatic       #35  <Field MenuItemCompat$MenuVersionImpl IMPL>
    //    9   21:aload_0         
    //   10   22:iload_1         
    //   11   23:invokeinterface #120 <Method void MenuItemCompat$MenuVersionImpl.setShowAsAction(MenuItem, int)>
    //   12   28:return          
    }

    static final MenuVersionImpl IMPL;
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    // Unreferenced inner class android/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1

/* anonymous class */
    class IcsMenuVersionImpl._cls1
        implements MenuItemCompatIcs.SupportActionExpandProxy
    {

        IcsMenuVersionImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field MenuItemCompat$IcsMenuVersionImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field MenuItemCompat$OnActionExpandListener val$listener>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field MenuItemCompat$OnActionExpandListener val$listener>
        //    2    4:aload_1         
        //    3    5:invokeinterface #30  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
        //    4   10:ireturn         
        }

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field MenuItemCompat$OnActionExpandListener val$listener>
        //    2    4:aload_1         
        //    3    5:invokeinterface #33  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
        //    4   10:ireturn         
        }

        final IcsMenuVersionImpl this$0;
        final OnActionExpandListener val$listener;
    }

}
