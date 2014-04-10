// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuWrapperICS

class SubMenuWrapperICS extends MenuWrapperICS
    implements SupportSubMenu
{

    SubMenuWrapperICS(SubMenu submenu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #11  <Method void MenuWrapperICS(android.view.Menu)>
    //    3    5:return          
    }

    public void clearHeader()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:invokeinterface #21  <Method void SubMenu.clearHeader()>
    //    4   12:return          
    }

    public MenuItem getItem()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #17  <Field Object mWrappedObject>
    //    3    5:checkcast       #19  <Class SubMenu>
    //    4    8:invokeinterface #25  <Method MenuItem SubMenu.getItem()>
    //    5   13:invokevirtual   #29  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //    6   16:areturn         
    }

    public SubMenu getWrappedObject()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:areturn         
    }

    public volatile Object getWrappedObject()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #34  <Method SubMenu getWrappedObject()>
    //    2    4:areturn         
    }

    public SubMenu setHeaderIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:iload_1         
    //    4    8:invokeinterface #38  <Method SubMenu SubMenu.setHeaderIcon(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:aload_1         
    //    4    8:invokeinterface #41  <Method SubMenu SubMenu.setHeaderIcon(Drawable)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setHeaderTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:iload_1         
    //    4    8:invokeinterface #44  <Method SubMenu SubMenu.setHeaderTitle(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:aload_1         
    //    4    8:invokeinterface #47  <Method SubMenu SubMenu.setHeaderTitle(CharSequence)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setHeaderView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:aload_1         
    //    4    8:invokeinterface #51  <Method SubMenu SubMenu.setHeaderView(View)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:iload_1         
    //    4    8:invokeinterface #54  <Method SubMenu SubMenu.setIcon(int)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }

    public SubMenu setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field Object mWrappedObject>
    //    2    4:checkcast       #19  <Class SubMenu>
    //    3    7:aload_1         
    //    4    8:invokeinterface #56  <Method SubMenu SubMenu.setIcon(Drawable)>
    //    5   13:pop             
    //    6   14:aload_0         
    //    7   15:areturn         
    }
}
