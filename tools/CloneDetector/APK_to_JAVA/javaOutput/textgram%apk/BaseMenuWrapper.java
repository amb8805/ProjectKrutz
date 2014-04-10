// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.support.v4.internal.view.SupportMenuItem;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuWrapperFactory

abstract class BaseMenuWrapper extends BaseWrapper
{

    BaseMenuWrapper(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #14  <Method void BaseWrapper(Object)>
    //    3    5:return          
    }

    final SupportMenuItem getMenuItemWrapper(MenuItem menuitem)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          55
    //    2    4:aload_0         
    //    3    5:getfield        #18  <Field HashMap mMenuItems>
    //    4    8:ifnonnull       22
    //    5   11:aload_0         
    //    6   12:new             #20  <Class HashMap>
    //    7   15:dup             
    //    8   16:invokespecial   #23  <Method void HashMap()>
    //    9   19:putfield        #18  <Field HashMap mMenuItems>
    //   10   22:aload_0         
    //   11   23:getfield        #18  <Field HashMap mMenuItems>
    //   12   26:aload_1         
    //   13   27:invokevirtual   #27  <Method Object HashMap.get(Object)>
    //   14   30:checkcast       #29  <Class SupportMenuItem>
    //   15   33:astore_2        
    //   16   34:aload_2         
    //   17   35:ifnonnull       53
    //   18   38:aload_1         
    //   19   39:invokestatic    #34  <Method SupportMenuItem MenuWrapperFactory.createSupportMenuItemWrapper(MenuItem)>
    //   20   42:astore_2        
    //   21   43:aload_0         
    //   22   44:getfield        #18  <Field HashMap mMenuItems>
    //   23   47:aload_1         
    //   24   48:aload_2         
    //   25   49:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
    //   26   52:pop             
    //   27   53:aload_2         
    //   28   54:areturn         
    //   29   55:aconst_null     
    //   30   56:areturn         
    }

    final SubMenu getSubMenuWrapper(SubMenu submenu)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          55
    //    2    4:aload_0         
    //    3    5:getfield        #42  <Field HashMap mSubMenus>
    //    4    8:ifnonnull       22
    //    5   11:aload_0         
    //    6   12:new             #20  <Class HashMap>
    //    7   15:dup             
    //    8   16:invokespecial   #23  <Method void HashMap()>
    //    9   19:putfield        #42  <Field HashMap mSubMenus>
    //   10   22:aload_0         
    //   11   23:getfield        #42  <Field HashMap mSubMenus>
    //   12   26:aload_1         
    //   13   27:invokevirtual   #27  <Method Object HashMap.get(Object)>
    //   14   30:checkcast       #44  <Class SubMenu>
    //   15   33:astore_2        
    //   16   34:aload_2         
    //   17   35:ifnonnull       53
    //   18   38:aload_1         
    //   19   39:invokestatic    #48  <Method android.support.v4.internal.view.SupportSubMenu MenuWrapperFactory.createSupportSubMenuWrapper(SubMenu)>
    //   20   42:astore_2        
    //   21   43:aload_0         
    //   22   44:getfield        #42  <Field HashMap mSubMenus>
    //   23   47:aload_1         
    //   24   48:aload_2         
    //   25   49:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
    //   26   52:pop             
    //   27   53:aload_2         
    //   28   54:areturn         
    //   29   55:aconst_null     
    //   30   56:areturn         
    }

    final void internalClear()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap mMenuItems>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #18  <Field HashMap mMenuItems>
    //    5   11:invokevirtual   #52  <Method void HashMap.clear()>
    //    6   14:aload_0         
    //    7   15:getfield        #42  <Field HashMap mSubMenus>
    //    8   18:ifnull          28
    //    9   21:aload_0         
    //   10   22:getfield        #42  <Field HashMap mSubMenus>
    //   11   25:invokevirtual   #52  <Method void HashMap.clear()>
    //   12   28:return          
    }

    final void internalRemoveGroup(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap mMenuItems>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #18  <Field HashMap mMenuItems>
    //    6   12:invokevirtual   #58  <Method Set HashMap.keySet()>
    //    7   15:invokeinterface #64  <Method Iterator Set.iterator()>
    //    8   20:astore_2        
    //    9   21:aload_2         
    //   10   22:invokeinterface #70  <Method boolean Iterator.hasNext()>
    //   11   27:ifeq            7
    //   12   30:iload_1         
    //   13   31:aload_2         
    //   14   32:invokeinterface #74  <Method Object Iterator.next()>
    //   15   37:checkcast       #76  <Class MenuItem>
    //   16   40:invokeinterface #80  <Method int MenuItem.getGroupId()>
    //   17   45:icmpne          21
    //   18   48:aload_2         
    //   19   49:invokeinterface #83  <Method void Iterator.remove()>
    //   20   54:goto            21
    }

    final void internalRemoveItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap mMenuItems>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #18  <Field HashMap mMenuItems>
    //    6   12:invokevirtual   #58  <Method Set HashMap.keySet()>
    //    7   15:invokeinterface #64  <Method Iterator Set.iterator()>
    //    8   20:astore_2        
    //    9   21:aload_2         
    //   10   22:invokeinterface #70  <Method boolean Iterator.hasNext()>
    //   11   27:ifeq            7
    //   12   30:iload_1         
    //   13   31:aload_2         
    //   14   32:invokeinterface #74  <Method Object Iterator.next()>
    //   15   37:checkcast       #76  <Class MenuItem>
    //   16   40:invokeinterface #87  <Method int MenuItem.getItemId()>
    //   17   45:icmpne          21
    //   18   48:aload_2         
    //   19   49:invokeinterface #83  <Method void Iterator.remove()>
    //   20   54:return          
    }

    private HashMap mMenuItems;
    private HashMap mSubMenus;
}
