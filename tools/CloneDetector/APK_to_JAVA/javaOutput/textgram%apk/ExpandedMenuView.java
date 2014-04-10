// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuView, MenuBuilder, MenuItemImpl

public final class ExpandedMenuView extends ListView
    implements MenuBuilder.ItemInvoker, MenuView, android.widget.AdapterView.OnItemClickListener
{

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #18  <Method void ListView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aload_0         
    //    6    8:invokevirtual   #22  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //    7   11:return          
    }

    public int getWindowAnimations()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field int mAnimations>
    //    2    4:ireturn         
    }

    public void initialize(MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #30  <Field MenuBuilder mMenu>
    //    3    5:return          
    }

    public boolean invokeItem(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field MenuBuilder mMenu>
    //    2    4:aload_1         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #38  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
    //    5    9:ireturn         
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void ListView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #46  <Method void setChildrenDrawingCacheEnabled(boolean)>
    //    5    9:return          
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #52  <Method ListAdapter getAdapter()>
    //    3    5:iload_3         
    //    4    6:invokeinterface #58  <Method Object ListAdapter.getItem(int)>
    //    5   11:checkcast       #60  <Class MenuItemImpl>
    //    6   14:invokevirtual   #62  <Method boolean invokeItem(MenuItemImpl)>
    //    7   17:pop             
    //    8   18:return          
    }

    private int mAnimations;
    private MenuBuilder mMenu;
}
