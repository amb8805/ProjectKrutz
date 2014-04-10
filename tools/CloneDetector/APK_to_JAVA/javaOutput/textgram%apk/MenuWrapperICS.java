// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.internal.view.SupportMenu;
import android.view.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuWrapper

class MenuWrapperICS extends BaseMenuWrapper
    implements SupportMenu
{

    MenuWrapperICS(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #12  <Method void BaseMenuWrapper(Object)>
    //    3    5:return          
    }

    public MenuItem add(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:invokeinterface #22  <Method MenuItem Menu.add(int)>
    //    6   14:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //    7   17:areturn         
    }

    public MenuItem add(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:iload           4
    //    8   13:invokeinterface #29  <Method MenuItem Menu.add(int, int, int, int)>
    //    9   18:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //   10   21:areturn         
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:aload           4
    //    8   13:invokeinterface #32  <Method MenuItem Menu.add(int, int, int, CharSequence)>
    //    9   18:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //   10   21:areturn         
    }

    public MenuItem add(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:aload_1         
    //    5    9:invokeinterface #35  <Method MenuItem Menu.add(CharSequence)>
    //    6   14:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //    7   17:areturn         
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
    //    0    0:aconst_null     
    //    1    1:astore          9
    //    2    3:aload           8
    //    3    5:ifnull          16
    //    4    8:aload           8
    //    5   10:arraylength     
    //    6   11:anewarray       MenuItem[]
    //    7   14:astore          9
    //    8   16:aload_0         
    //    9   17:getfield        #18  <Field Object mWrappedObject>
    //   10   20:checkcast       #20  <Class Menu>
    //   11   23:iload_1         
    //   12   24:iload_2         
    //   13   25:iload_3         
    //   14   26:aload           4
    //   15   28:aload           5
    //   16   30:aload           6
    //   17   32:iload           7
    //   18   34:aload           9
    //   19   36:invokeinterface #41  <Method int Menu.addIntentOptions(int, int, int, ComponentName, Intent[], Intent, int, MenuItem[])>
    //   20   41:istore          10
    //   21   43:aload           9
    //   22   45:ifnull          83
    //   23   48:iconst_0        
    //   24   49:istore          11
    //   25   51:aload           9
    //   26   53:arraylength     
    //   27   54:istore          12
    //   28   56:iload           11
    //   29   58:iload           12
    //   30   60:icmpge          83
    //   31   63:aload           8
    //   32   65:iload           11
    //   33   67:aload_0         
    //   34   68:aload           9
    //   35   70:iload           11
    //   36   72:aaload          
    //   37   73:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //   38   76:aastore         
    //   39   77:iinc            11  1
    //   40   80:goto            56
    //   41   83:iload           10
    //   42   85:ireturn         
    }

    public SubMenu addSubMenu(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:invokeinterface #45  <Method SubMenu Menu.addSubMenu(int)>
    //    6   14:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
    //    7   17:areturn         
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:iload           4
    //    8   13:invokeinterface #52  <Method SubMenu Menu.addSubMenu(int, int, int, int)>
    //    9   18:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
    //   10   21:areturn         
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:aload           4
    //    8   13:invokeinterface #55  <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
    //    9   18:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
    //   10   21:areturn         
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:aload_1         
    //    5    9:invokeinterface #58  <Method SubMenu Menu.addSubMenu(CharSequence)>
    //    6   14:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
    //    7   17:areturn         
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #63  <Method void internalClear()>
    //    2    4:aload_0         
    //    3    5:getfield        #18  <Field Object mWrappedObject>
    //    4    8:checkcast       #20  <Class Menu>
    //    5   11:invokeinterface #65  <Method void Menu.clear()>
    //    6   16:return          
    }

    public void close()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:invokeinterface #68  <Method void Menu.close()>
    //    4   12:return          
    }

    public MenuItem findItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:invokeinterface #71  <Method MenuItem Menu.findItem(int)>
    //    6   14:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //    7   17:areturn         
    }

    public MenuItem getItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #18  <Field Object mWrappedObject>
    //    3    5:checkcast       #20  <Class Menu>
    //    4    8:iload_1         
    //    5    9:invokeinterface #74  <Method MenuItem Menu.getItem(int)>
    //    6   14:invokevirtual   #26  <Method android.support.v4.internal.view.SupportMenuItem getMenuItemWrapper(MenuItem)>
    //    7   17:areturn         
    }

    public boolean hasVisibleItems()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:invokeinterface #78  <Method boolean Menu.hasVisibleItems()>
    //    4   12:ireturn         
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:aload_2         
    //    5    9:invokeinterface #82  <Method boolean Menu.isShortcutKey(int, KeyEvent)>
    //    6   14:ireturn         
    }

    public boolean performIdentifierAction(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:invokeinterface #86  <Method boolean Menu.performIdentifierAction(int, int)>
    //    6   14:ireturn         
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:aload_2         
    //    5    9:iload_3         
    //    6   10:invokeinterface #90  <Method boolean Menu.performShortcut(int, KeyEvent, int)>
    //    7   15:ireturn         
    }

    public void removeGroup(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #95  <Method void internalRemoveGroup(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #18  <Field Object mWrappedObject>
    //    5    9:checkcast       #20  <Class Menu>
    //    6   12:iload_1         
    //    7   13:invokeinterface #97  <Method void Menu.removeGroup(int)>
    //    8   18:return          
    }

    public void removeItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #101 <Method void internalRemoveItem(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #18  <Field Object mWrappedObject>
    //    5    9:checkcast       #20  <Class Menu>
    //    6   12:iload_1         
    //    7   13:invokeinterface #103 <Method void Menu.removeItem(int)>
    //    8   18:return          
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:invokeinterface #107 <Method void Menu.setGroupCheckable(int, boolean, boolean)>
    //    7   15:return          
    }

    public void setGroupEnabled(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:invokeinterface #111 <Method void Menu.setGroupEnabled(int, boolean)>
    //    6   14:return          
    }

    public void setGroupVisible(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:invokeinterface #114 <Method void Menu.setGroupVisible(int, boolean)>
    //    6   14:return          
    }

    public void setQwertyMode(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:iload_1         
    //    4    8:invokeinterface #118 <Method void Menu.setQwertyMode(boolean)>
    //    5   13:return          
    }

    public int size()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field Object mWrappedObject>
    //    2    4:checkcast       #20  <Class Menu>
    //    3    7:invokeinterface #122 <Method int Menu.size()>
    //    4   12:ireturn         
    }
}
