// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, MenuView, MenuBuilder, MenuItemImpl, 
//            SubMenuBuilder

public abstract class BaseMenuPresenter
    implements MenuPresenter
{

    public BaseMenuPresenter(Context context, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #27  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #29  <Field Context mSystemContext>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:invokestatic    #35  <Method LayoutInflater LayoutInflater.from(Context)>
    //    8   14:putfield        #37  <Field LayoutInflater mSystemInflater>
    //    9   17:aload_0         
    //   10   18:iload_2         
    //   11   19:putfield        #39  <Field int mMenuLayoutRes>
    //   12   22:aload_0         
    //   13   23:iload_3         
    //   14   24:putfield        #41  <Field int mItemLayoutRes>
    //   15   27:return          
    }

    protected void addItemView(View view, int i)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #49  <Method android.view.ViewParent View.getParent()>
    //    2    4:checkcast       #51  <Class ViewGroup>
    //    3    7:astore_3        
    //    4    8:aload_3         
    //    5    9:ifnull          17
    //    6   12:aload_3         
    //    7   13:aload_1         
    //    8   14:invokevirtual   #55  <Method void ViewGroup.removeView(View)>
    //    9   17:aload_0         
    //   10   18:getfield        #57  <Field MenuView mMenuView>
    //   11   21:checkcast       #51  <Class ViewGroup>
    //   12   24:aload_1         
    //   13   25:iload_2         
    //   14   26:invokevirtual   #60  <Method void ViewGroup.addView(View, int)>
    //   15   29:return          
    }

    public abstract void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview);

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public MenuView.ItemView createItemView(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field LayoutInflater mSystemInflater>
    //    2    4:aload_0         
    //    3    5:getfield        #41  <Field int mItemLayoutRes>
    //    4    8:aload_1         
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #70  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    7   13:checkcast       #72  <Class MenuView$ItemView>
    //    8   16:areturn         
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    protected boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:invokevirtual   #79  <Method void ViewGroup.removeViewAt(int)>
    //    3    5:iconst_1        
    //    4    6:ireturn         
    }

    public boolean flagActionItems()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public int getId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mId>
    //    2    4:ireturn         
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_2         
    //    1    1:instanceof      #72  <Class MenuView$ItemView>
    //    2    4:ifeq            26
    //    3    7:aload_2         
    //    4    8:checkcast       #72  <Class MenuView$ItemView>
    //    5   11:astore          4
    //    6   13:aload_0         
    //    7   14:aload_1         
    //    8   15:aload           4
    //    9   17:invokevirtual   #89  <Method void bindItemView(MenuItemImpl, MenuView$ItemView)>
    //   10   20:aload           4
    //   11   22:checkcast       #45  <Class View>
    //   12   25:areturn         
    //   13   26:aload_0         
    //   14   27:aload_3         
    //   15   28:invokevirtual   #91  <Method MenuView$ItemView createItemView(ViewGroup)>
    //   16   31:astore          4
    //   17   33:goto            13
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field MenuView mMenuView>
    //    2    4:ifnonnull       45
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #37  <Field LayoutInflater mSystemInflater>
    //    6   12:aload_0         
    //    7   13:getfield        #39  <Field int mMenuLayoutRes>
    //    8   16:aload_1         
    //    9   17:iconst_0        
    //   10   18:invokevirtual   #70  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   11   21:checkcast       #95  <Class MenuView>
    //   12   24:putfield        #57  <Field MenuView mMenuView>
    //   13   27:aload_0         
    //   14   28:getfield        #57  <Field MenuView mMenuView>
    //   15   31:aload_0         
    //   16   32:getfield        #97  <Field MenuBuilder mMenu>
    //   17   35:invokeinterface #101 <Method void MenuView.initialize(MenuBuilder)>
    //   18   40:aload_0         
    //   19   41:iconst_1        
    //   20   42:invokevirtual   #105 <Method void updateMenuView(boolean)>
    //   21   45:aload_0         
    //   22   46:getfield        #57  <Field MenuView mMenuView>
    //   23   49:areturn         
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #109 <Field Context mContext>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:getfield        #109 <Field Context mContext>
    //    6   10:invokestatic    #35  <Method LayoutInflater LayoutInflater.from(Context)>
    //    7   13:putfield        #111 <Field LayoutInflater mInflater>
    //    8   16:aload_0         
    //    9   17:aload_2         
    //   10   18:putfield        #97  <Field MenuBuilder mMenu>
    //   11   21:return          
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field MenuPresenter$Callback mCallback>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #115 <Field MenuPresenter$Callback mCallback>
    //    5   11:aload_1         
    //    6   12:iload_2         
    //    7   13:invokeinterface #119 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
    //    8   18:return          
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field MenuPresenter$Callback mCallback>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #115 <Field MenuPresenter$Callback mCallback>
    //    5   11:aload_1         
    //    6   12:invokeinterface #125 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
    //    7   17:ireturn         
    //    8   18:iconst_0        
    //    9   19:ireturn         
    }

    public void setCallback(MenuPresenter.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #115 <Field MenuPresenter$Callback mCallback>
    //    3    5:return          
    }

    public void setId(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #85  <Field int mId>
    //    3    5:return          
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public void updateMenuView(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field MenuView mMenuView>
    //    2    4:checkcast       #51  <Class ViewGroup>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #97  <Field MenuBuilder mMenu>
    //    9   17:astore_3        
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:aload_3         
    //   13   22:ifnull          163
    //   14   25:aload_0         
    //   15   26:getfield        #97  <Field MenuBuilder mMenu>
    //   16   29:invokevirtual   #134 <Method void MenuBuilder.flagActionItems()>
    //   17   32:aload_0         
    //   18   33:getfield        #97  <Field MenuBuilder mMenu>
    //   19   36:invokevirtual   #138 <Method ArrayList MenuBuilder.getVisibleItems()>
    //   20   39:astore          5
    //   21   41:aload           5
    //   22   43:invokevirtual   #143 <Method int ArrayList.size()>
    //   23   46:istore          6
    //   24   48:iconst_0        
    //   25   49:istore          7
    //   26   51:iload           7
    //   27   53:iload           6
    //   28   55:icmpge          163
    //   29   58:aload           5
    //   30   60:iload           7
    //   31   62:invokevirtual   #147 <Method Object ArrayList.get(int)>
    //   32   65:checkcast       #149 <Class MenuItemImpl>
    //   33   68:astore          8
    //   34   70:aload_0         
    //   35   71:iload           4
    //   36   73:aload           8
    //   37   75:invokevirtual   #151 <Method boolean shouldIncludeItem(int, MenuItemImpl)>
    //   38   78:ifeq            151
    //   39   81:aload_2         
    //   40   82:iload           4
    //   41   84:invokevirtual   #155 <Method View ViewGroup.getChildAt(int)>
    //   42   87:astore          9
    //   43   89:aload           9
    //   44   91:instanceof      #72  <Class MenuView$ItemView>
    //   45   94:ifeq            157
    //   46   97:aload           9
    //   47   99:checkcast       #72  <Class MenuView$ItemView>
    //   48  102:invokeinterface #159 <Method MenuItemImpl MenuView$ItemView.getItemData()>
    //   49  107:astore          10
    //   50  109:aload_0         
    //   51  110:aload           8
    //   52  112:aload           9
    //   53  114:aload_2         
    //   54  115:invokevirtual   #161 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
    //   55  118:astore          11
    //   56  120:aload           8
    //   57  122:aload           10
    //   58  124:if_acmpeq       133
    //   59  127:aload           11
    //   60  129:iconst_0        
    //   61  130:invokevirtual   #164 <Method void View.setPressed(boolean)>
    //   62  133:aload           11
    //   63  135:aload           9
    //   64  137:if_acmpeq       148
    //   65  140:aload_0         
    //   66  141:aload           11
    //   67  143:iload           4
    //   68  145:invokevirtual   #166 <Method void addItemView(View, int)>
    //   69  148:iinc            4  1
    //   70  151:iinc            7  1
    //   71  154:goto            51
    //   72  157:aconst_null     
    //   73  158:astore          10
    //   74  160:goto            109
    //   75  163:iload           4
    //   76  165:aload_2         
    //   77  166:invokevirtual   #169 <Method int ViewGroup.getChildCount()>
    //   78  169:icmpge          12
    //   79  172:aload_0         
    //   80  173:aload_2         
    //   81  174:iload           4
    //   82  176:invokevirtual   #171 <Method boolean filterLeftoverView(ViewGroup, int)>
    //   83  179:ifne            163
    //   84  182:iinc            4  1
    //   85  185:goto            163
    }

    private MenuPresenter.Callback mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected MenuView mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;
}
