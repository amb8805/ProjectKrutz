// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuBuilder, MenuItemImpl

public class SubMenuBuilder extends MenuBuilder
    implements SubMenu
{

    public SubMenuBuilder(Context context, MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #15  <Method void MenuBuilder(Context)>
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:putfield        #17  <Field MenuBuilder mParentMenu>
    //    6   10:aload_0         
    //    7   11:aload_3         
    //    8   12:putfield        #19  <Field MenuItemImpl mItem>
    //    9   15:return          
    }

    public void clearHeader()
    {
    //    0    0:return          
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #25  <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
    //    4    8:ireturn         
    }

    public boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #29  <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
    //    4    6:ifne            21
    //    5    9:aload_0         
    //    6   10:getfield        #17  <Field MenuBuilder mParentMenu>
    //    7   13:aload_1         
    //    8   14:aload_2         
    //    9   15:invokevirtual   #29  <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
    //   10   18:ifeq            23
    //   11   21:iconst_1        
    //   12   22:ireturn         
    //   13   23:iconst_0        
    //   14   24:ireturn         
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #32  <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
    //    4    8:ireturn         
    }

    public String getActionViewStatesKey()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field MenuItemImpl mItem>
    //    2    4:ifnull          21
    //    3    7:aload_0         
    //    4    8:getfield        #19  <Field MenuItemImpl mItem>
    //    5   11:invokevirtual   #40  <Method int MenuItemImpl.getItemId()>
    //    6   14:istore_1        
    //    7   15:iload_1         
    //    8   16:ifne            26
    //    9   19:aconst_null     
    //   10   20:areturn         
    //   11   21:iconst_0        
    //   12   22:istore_1        
    //   13   23:goto            15
    //   14   26:new             #42  <Class StringBuilder>
    //   15   29:dup             
    //   16   30:invokespecial   #44  <Method void StringBuilder()>
    //   17   33:aload_0         
    //   18   34:invokespecial   #46  <Method String MenuBuilder.getActionViewStatesKey()>
    //   19   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
    //   20   40:ldc1            #52  <String ":">
    //   21   42:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
    //   22   45:iload_1         
    //   23   46:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
    //   24   49:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   25   52:areturn         
    }

    public MenuItem getItem()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field MenuItemImpl mItem>
    //    2    4:areturn         
    }

    public Menu getParentMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:areturn         
    }

    public MenuBuilder getRootMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:areturn         
    }

    public boolean isQwertyMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:invokevirtual   #68  <Method boolean MenuBuilder.isQwertyMode()>
    //    3    7:ireturn         
    }

    public boolean isShortcutsVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:invokevirtual   #71  <Method boolean MenuBuilder.isShortcutsVisible()>
    //    3    7:ireturn         
    }

    public void setCallback(MenuBuilder.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #75  <Method void MenuBuilder.setCallback(MenuBuilder$Callback)>
    //    4    8:return          
    }

    public SubMenu setHeaderIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #81  <Method Context getContext()>
    //    3    5:invokevirtual   #87  <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #93  <Method Drawable Resources.getDrawable(int)>
    //    6   12:invokespecial   #97  <Method MenuBuilder MenuBuilder.setHeaderIconInt(Drawable)>
    //    7   15:pop             
    //    8   16:aload_0         
    //    9   17:areturn         
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #97  <Method MenuBuilder MenuBuilder.setHeaderIconInt(Drawable)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public SubMenu setHeaderTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #81  <Method Context getContext()>
    //    3    5:invokevirtual   #87  <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #103 <Method String Resources.getString(int)>
    //    6   12:invokespecial   #107 <Method MenuBuilder MenuBuilder.setHeaderTitleInt(CharSequence)>
    //    7   15:pop             
    //    8   16:aload_0         
    //    9   17:areturn         
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #107 <Method MenuBuilder MenuBuilder.setHeaderTitleInt(CharSequence)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public SubMenu setHeaderView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #114 <Method MenuBuilder MenuBuilder.setHeaderViewInt(View)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public SubMenu setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field MenuItemImpl mItem>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #118 <Method MenuItem MenuItemImpl.setIcon(int)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:areturn         
    }

    public SubMenu setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field MenuItemImpl mItem>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #121 <Method MenuItem MenuItemImpl.setIcon(Drawable)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:areturn         
    }

    public void setQwertyMode(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #125 <Method void MenuBuilder.setQwertyMode(boolean)>
    //    4    8:return          
    }

    public void setShortcutsVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field MenuBuilder mParentMenu>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #128 <Method void MenuBuilder.setShortcutsVisible(boolean)>
    //    4    8:return          
    }

    private MenuItemImpl mItem;
    private MenuBuilder mParentMenu;
}
