// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.support.v4.internal.view.*;
import android.view.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperJB, MenuItemWrapperICS, MenuWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

    private MenuWrapperFactory()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static MenuItem createMenuItemWrapper(MenuItem menuitem)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          19
    //    3    8:new             #18  <Class MenuItemWrapperJB>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:invokespecial   #21  <Method void MenuItemWrapperJB(MenuItem)>
    //    7   16:astore_0        
    //    8   17:aload_0         
    //    9   18:areturn         
    //   10   19:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //   11   22:bipush          14
    //   12   24:icmplt          17
    //   13   27:new             #23  <Class MenuItemWrapperICS>
    //   14   30:dup             
    //   15   31:aload_0         
    //   16   32:invokespecial   #24  <Method void MenuItemWrapperICS(MenuItem)>
    //   17   35:areturn         
    }

    public static Menu createMenuWrapper(Menu menu)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          17
    //    3    8:new             #28  <Class MenuWrapperICS>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:invokespecial   #31  <Method void MenuWrapperICS(Menu)>
    //    7   16:astore_0        
    //    8   17:aload_0         
    //    9   18:areturn         
    }

    public static SupportMenuItem createSupportMenuItemWrapper(MenuItem menuitem)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          17
    //    3    8:new             #18  <Class MenuItemWrapperJB>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:invokespecial   #21  <Method void MenuItemWrapperJB(MenuItem)>
    //    7   16:areturn         
    //    8   17:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   20:bipush          14
    //   10   22:icmplt          34
    //   11   25:new             #23  <Class MenuItemWrapperICS>
    //   12   28:dup             
    //   13   29:aload_0         
    //   14   30:invokespecial   #24  <Method void MenuItemWrapperICS(MenuItem)>
    //   15   33:areturn         
    //   16   34:new             #35  <Class UnsupportedOperationException>
    //   17   37:dup             
    //   18   38:invokespecial   #36  <Method void UnsupportedOperationException()>
    //   19   41:athrow          
    }

    public static SupportMenu createSupportMenuWrapper(Menu menu)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          17
    //    3    8:new             #28  <Class MenuWrapperICS>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:invokespecial   #31  <Method void MenuWrapperICS(Menu)>
    //    7   16:areturn         
    //    8   17:new             #35  <Class UnsupportedOperationException>
    //    9   20:dup             
    //   10   21:invokespecial   #36  <Method void UnsupportedOperationException()>
    //   11   24:athrow          
    }

    public static SupportSubMenu createSupportSubMenuWrapper(SubMenu submenu)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          17
    //    3    8:new             #42  <Class SubMenuWrapperICS>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:invokespecial   #45  <Method void SubMenuWrapperICS(SubMenu)>
    //    7   16:areturn         
    //    8   17:new             #35  <Class UnsupportedOperationException>
    //    9   20:dup             
    //   10   21:invokespecial   #36  <Method void UnsupportedOperationException()>
    //   11   24:athrow          
    }
}
