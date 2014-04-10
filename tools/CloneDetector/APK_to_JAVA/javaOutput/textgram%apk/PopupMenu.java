// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.*;
import android.view.*;

public class PopupMenu
    implements android.support.v7.internal.view.menu.MenuBuilder.Callback, android.support.v7.internal.view.menu.MenuPresenter.Callback
{
    public static interface OnDismissListener
    {

        public abstract void onDismiss(PopupMenu popupmenu);
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    public PopupMenu(Context context, View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #27  <Field Context mContext>
    //    5    9:aload_0         
    //    6   10:new             #29  <Class MenuBuilder>
    //    7   13:dup             
    //    8   14:aload_1         
    //    9   15:invokespecial   #32  <Method void MenuBuilder(Context)>
    //   10   18:putfield        #34  <Field MenuBuilder mMenu>
    //   11   21:aload_0         
    //   12   22:getfield        #34  <Field MenuBuilder mMenu>
    //   13   25:aload_0         
    //   14   26:invokevirtual   #38  <Method void MenuBuilder.setCallback(android.support.v7.internal.view.menu.MenuBuilder$Callback)>
    //   15   29:aload_0         
    //   16   30:aload_2         
    //   17   31:putfield        #40  <Field View mAnchor>
    //   18   34:aload_0         
    //   19   35:new             #42  <Class MenuPopupHelper>
    //   20   38:dup             
    //   21   39:aload_1         
    //   22   40:aload_0         
    //   23   41:getfield        #34  <Field MenuBuilder mMenu>
    //   24   44:aload_2         
    //   25   45:invokespecial   #45  <Method void MenuPopupHelper(Context, MenuBuilder, View)>
    //   26   48:putfield        #47  <Field MenuPopupHelper mPopup>
    //   27   51:aload_0         
    //   28   52:getfield        #47  <Field MenuPopupHelper mPopup>
    //   29   55:aload_0         
    //   30   56:invokevirtual   #50  <Method void MenuPopupHelper.setCallback(android.support.v7.internal.view.menu.MenuPresenter$Callback)>
    //   31   59:return          
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field MenuPopupHelper mPopup>
    //    2    4:invokevirtual   #53  <Method void MenuPopupHelper.dismiss()>
    //    3    7:return          
    }

    public Menu getMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field MenuBuilder mMenu>
    //    2    4:areturn         
    }

    public MenuInflater getMenuInflater()
    {
    //    0    0:new             #59  <Class SupportMenuInflater>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #27  <Field Context mContext>
    //    4    8:invokespecial   #60  <Method void SupportMenuInflater(Context)>
    //    5   11:areturn         
    }

    public void inflate(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #64  <Method MenuInflater getMenuInflater()>
    //    2    4:iload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #34  <Field MenuBuilder mMenu>
    //    5    9:invokevirtual   #69  <Method void MenuInflater.inflate(int, Menu)>
    //    6   12:return          
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field PopupMenu$OnDismissListener mDismissListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field PopupMenu$OnDismissListener mDismissListener>
    //    5   11:aload_0         
    //    6   12:invokeinterface #79  <Method void PopupMenu$OnDismissListener.onDismiss(PopupMenu)>
    //    7   17:return          
    }

    public void onCloseSubMenu(SubMenuBuilder submenubuilder)
    {
    //    0    0:return          
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #85  <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
    //    5   11:aload_2         
    //    6   12:invokeinterface #91  <Method boolean PopupMenu$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
    //    7   17:ireturn         
    //    8   18:iconst_0        
    //    9   19:ireturn         
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
    //    0    0:return          
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_1         
    //    3    3:ifnonnull       10
    //    4    6:iconst_0        
    //    5    7:istore_2        
    //    6    8:iload_2         
    //    7    9:ireturn         
    //    8   10:aload_1         
    //    9   11:invokevirtual   #99  <Method boolean MenuBuilder.hasVisibleItems()>
    //   10   14:ifeq            8
    //   11   17:new             #42  <Class MenuPopupHelper>
    //   12   20:dup             
    //   13   21:aload_0         
    //   14   22:getfield        #27  <Field Context mContext>
    //   15   25:aload_1         
    //   16   26:aload_0         
    //   17   27:getfield        #40  <Field View mAnchor>
    //   18   30:invokespecial   #45  <Method void MenuPopupHelper(Context, MenuBuilder, View)>
    //   19   33:invokevirtual   #102 <Method void MenuPopupHelper.show()>
    //   20   36:iload_2         
    //   21   37:ireturn         
    }

    public void setOnDismissListener(OnDismissListener ondismisslistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #73  <Field PopupMenu$OnDismissListener mDismissListener>
    //    3    5:return          
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #85  <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
    //    3    5:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field MenuPopupHelper mPopup>
    //    2    4:invokevirtual   #102 <Method void MenuPopupHelper.show()>
    //    3    7:return          
    }

    private View mAnchor;
    private Context mContext;
    private OnDismissListener mDismissListener;
    private MenuBuilder mMenu;
    private OnMenuItemClickListener mMenuItemClickListener;
    private MenuPopupHelper mPopup;
}
