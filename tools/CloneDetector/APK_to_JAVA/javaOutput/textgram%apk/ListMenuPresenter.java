// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, ExpandedMenuView, MenuBuilder, SubMenuBuilder, 
//            MenuDialogHelper, MenuItemImpl, MenuView

public class ListMenuPresenter
    implements MenuPresenter, android.widget.AdapterView.OnItemClickListener
{
    private class MenuAdapter extends BaseAdapter
    {

        public MenuAdapter()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ListMenuPresenter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void BaseAdapter()>
        //    5    9:aload_0         
        //    6   10:iconst_m1       
        //    7   11:putfield        #17  <Field int mExpandedIndex>
        //    8   14:aload_0         
        //    9   15:invokevirtual   #20  <Method void findExpandedIndex()>
        //   10   18:return          
        }

        void findExpandedIndex()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ListMenuPresenter this$0>
        //    2    4:getfield        #26  <Field MenuBuilder ListMenuPresenter.mMenu>
        //    3    7:invokevirtual   #32  <Method MenuItemImpl MenuBuilder.getExpandedItem()>
        //    4   10:astore_1        
        //    5   11:aload_1         
        //    6   12:ifnull          66
        //    7   15:aload_0         
        //    8   16:getfield        #12  <Field ListMenuPresenter this$0>
        //    9   19:getfield        #26  <Field MenuBuilder ListMenuPresenter.mMenu>
        //   10   22:invokevirtual   #36  <Method ArrayList MenuBuilder.getNonActionItems()>
        //   11   25:astore_2        
        //   12   26:aload_2         
        //   13   27:invokevirtual   #42  <Method int ArrayList.size()>
        //   14   30:istore_3        
        //   15   31:iconst_0        
        //   16   32:istore          4
        //   17   34:iload           4
        //   18   36:iload_3         
        //   19   37:icmpge          66
        //   20   40:aload_2         
        //   21   41:iload           4
        //   22   43:invokevirtual   #46  <Method Object ArrayList.get(int)>
        //   23   46:checkcast       #48  <Class MenuItemImpl>
        //   24   49:aload_1         
        //   25   50:if_acmpne       60
        //   26   53:aload_0         
        //   27   54:iload           4
        //   28   56:putfield        #17  <Field int mExpandedIndex>
        //   29   59:return          
        //   30   60:iinc            4  1
        //   31   63:goto            34
        //   32   66:aload_0         
        //   33   67:iconst_m1       
        //   34   68:putfield        #17  <Field int mExpandedIndex>
        //   35   71:return          
        }

        public int getCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ListMenuPresenter this$0>
        //    2    4:getfield        #26  <Field MenuBuilder ListMenuPresenter.mMenu>
        //    3    7:invokevirtual   #36  <Method ArrayList MenuBuilder.getNonActionItems()>
        //    4   10:invokevirtual   #42  <Method int ArrayList.size()>
        //    5   13:aload_0         
        //    6   14:getfield        #12  <Field ListMenuPresenter this$0>
        //    7   17:invokestatic    #53  <Method int ListMenuPresenter.access$000(ListMenuPresenter)>
        //    8   20:isub            
        //    9   21:istore_1        
        //   10   22:aload_0         
        //   11   23:getfield        #17  <Field int mExpandedIndex>
        //   12   26:ifge            31
        //   13   29:iload_1         
        //   14   30:ireturn         
        //   15   31:iload_1         
        //   16   32:iconst_1        
        //   17   33:isub            
        //   18   34:ireturn         
        }

        public MenuItemImpl getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ListMenuPresenter this$0>
        //    2    4:getfield        #26  <Field MenuBuilder ListMenuPresenter.mMenu>
        //    3    7:invokevirtual   #36  <Method ArrayList MenuBuilder.getNonActionItems()>
        //    4   10:astore_2        
        //    5   11:iload_1         
        //    6   12:aload_0         
        //    7   13:getfield        #12  <Field ListMenuPresenter this$0>
        //    8   16:invokestatic    #53  <Method int ListMenuPresenter.access$000(ListMenuPresenter)>
        //    9   19:iadd            
        //   10   20:istore_3        
        //   11   21:aload_0         
        //   12   22:getfield        #17  <Field int mExpandedIndex>
        //   13   25:iflt            39
        //   14   28:iload_3         
        //   15   29:aload_0         
        //   16   30:getfield        #17  <Field int mExpandedIndex>
        //   17   33:icmplt          39
        //   18   36:iinc            3  1
        //   19   39:aload_2         
        //   20   40:iload_3         
        //   21   41:invokevirtual   #46  <Method Object ArrayList.get(int)>
        //   22   44:checkcast       #48  <Class MenuItemImpl>
        //   23   47:areturn         
        }

        public volatile Object getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #57  <Method MenuItemImpl getItem(int)>
        //    3    5:areturn         
        }

        public long getItemId(int i)
        {
        //    0    0:iload_1         
        //    1    1:i2l             
        //    2    2:lreturn         
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
        //    0    0:aload_2         
        //    1    1:ifnonnull       24
        //    2    4:aload_0         
        //    3    5:getfield        #12  <Field ListMenuPresenter this$0>
        //    4    8:getfield        #65  <Field LayoutInflater ListMenuPresenter.mInflater>
        //    5   11:aload_0         
        //    6   12:getfield        #12  <Field ListMenuPresenter this$0>
        //    7   15:getfield        #68  <Field int ListMenuPresenter.mItemLayoutRes>
        //    8   18:aload_3         
        //    9   19:iconst_0        
        //   10   20:invokevirtual   #74  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
        //   11   23:astore_2        
        //   12   24:aload_2         
        //   13   25:checkcast       #76  <Class MenuView$ItemView>
        //   14   28:aload_0         
        //   15   29:iload_1         
        //   16   30:invokevirtual   #57  <Method MenuItemImpl getItem(int)>
        //   17   33:iconst_0        
        //   18   34:invokeinterface #80  <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
        //   19   39:aload_2         
        //   20   40:areturn         
        }

        public void notifyDataSetChanged()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #20  <Method void findExpandedIndex()>
        //    2    4:aload_0         
        //    3    5:invokespecial   #83  <Method void BaseAdapter.notifyDataSetChanged()>
        //    4    8:return          
        }

        private int mExpandedIndex;
        final ListMenuPresenter this$0;
    }


    public ListMenuPresenter(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #37  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:putfield        #39  <Field int mItemLayoutRes>
    //    5    9:aload_0         
    //    6   10:iload_2         
    //    7   11:putfield        #41  <Field int mThemeRes>
    //    8   14:return          
    }

    public ListMenuPresenter(Context context, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_2         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #44  <Method void ListMenuPresenter(int, int)>
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:putfield        #46  <Field Context mContext>
    //    7   11:aload_0         
    //    8   12:aload_0         
    //    9   13:getfield        #46  <Field Context mContext>
    //   10   16:invokestatic    #52  <Method LayoutInflater LayoutInflater.from(Context)>
    //   11   19:putfield        #54  <Field LayoutInflater mInflater>
    //   12   22:return          
    }

    static int access$000(ListMenuPresenter listmenupresenter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field int mItemIndexOffset>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #58  <Field int mItemIndexOffset>
    //    5    4:ireturn         
    }

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean flagActionItems()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public ListAdapter getAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #69  <Class ListMenuPresenter$MenuAdapter>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #72  <Method void ListMenuPresenter$MenuAdapter(ListMenuPresenter)>
    //    8   16:putfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    9   19:aload_0         
    //   10   20:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //   11   23:areturn         
    }

    public int getId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field int mId>
    //    2    4:ireturn         
    }

    int getItemIndexOffset()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field int mItemIndexOffset>
    //    2    4:ireturn         
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #69  <Class ListMenuPresenter$MenuAdapter>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #72  <Method void ListMenuPresenter$MenuAdapter(ListMenuPresenter)>
    //    8   16:putfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    9   19:aload_0         
    //   10   20:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //   11   23:invokevirtual   #82  <Method boolean ListMenuPresenter$MenuAdapter.isEmpty()>
    //   12   26:ifne            79
    //   13   29:aload_0         
    //   14   30:getfield        #84  <Field ExpandedMenuView mMenuView>
    //   15   33:ifnonnull       74
    //   16   36:aload_0         
    //   17   37:aload_0         
    //   18   38:getfield        #54  <Field LayoutInflater mInflater>
    //   19   41:getstatic       #89  <Field int android.support.v7.appcompat.R$layout.abc_expanded_menu_layout>
    //   20   44:aload_1         
    //   21   45:iconst_0        
    //   22   46:invokevirtual   #93  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   23   49:checkcast       #95  <Class ExpandedMenuView>
    //   24   52:putfield        #84  <Field ExpandedMenuView mMenuView>
    //   25   55:aload_0         
    //   26   56:getfield        #84  <Field ExpandedMenuView mMenuView>
    //   27   59:aload_0         
    //   28   60:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //   29   63:invokevirtual   #99  <Method void ExpandedMenuView.setAdapter(ListAdapter)>
    //   30   66:aload_0         
    //   31   67:getfield        #84  <Field ExpandedMenuView mMenuView>
    //   32   70:aload_0         
    //   33   71:invokevirtual   #103 <Method void ExpandedMenuView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   34   74:aload_0         
    //   35   75:getfield        #84  <Field ExpandedMenuView mMenuView>
    //   36   78:areturn         
    //   37   79:aconst_null     
    //   38   80:areturn         
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #41  <Field int mThemeRes>
    //    2    4:ifeq            54
    //    3    7:aload_0         
    //    4    8:new             #107 <Class ContextThemeWrapper>
    //    5   11:dup             
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #41  <Field int mThemeRes>
    //    9   17:invokespecial   #109 <Method void ContextThemeWrapper(Context, int)>
    //   10   20:putfield        #46  <Field Context mContext>
    //   11   23:aload_0         
    //   12   24:aload_0         
    //   13   25:getfield        #46  <Field Context mContext>
    //   14   28:invokestatic    #52  <Method LayoutInflater LayoutInflater.from(Context)>
    //   15   31:putfield        #54  <Field LayoutInflater mInflater>
    //   16   34:aload_0         
    //   17   35:aload_2         
    //   18   36:putfield        #111 <Field MenuBuilder mMenu>
    //   19   39:aload_0         
    //   20   40:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //   21   43:ifnull          53
    //   22   46:aload_0         
    //   23   47:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //   24   50:invokevirtual   #114 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
    //   25   53:return          
    //   26   54:aload_0         
    //   27   55:getfield        #46  <Field Context mContext>
    //   28   58:ifnull          34
    //   29   61:aload_0         
    //   30   62:aload_1         
    //   31   63:putfield        #46  <Field Context mContext>
    //   32   66:aload_0         
    //   33   67:getfield        #54  <Field LayoutInflater mInflater>
    //   34   70:ifnonnull       34
    //   35   73:aload_0         
    //   36   74:aload_0         
    //   37   75:getfield        #46  <Field Context mContext>
    //   38   78:invokestatic    #52  <Method LayoutInflater LayoutInflater.from(Context)>
    //   39   81:putfield        #54  <Field LayoutInflater mInflater>
    //   40   84:goto            34
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #118 <Field MenuPresenter$Callback mCallback>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #118 <Field MenuPresenter$Callback mCallback>
    //    5   11:aload_1         
    //    6   12:iload_2         
    //    7   13:invokeinterface #122 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
    //    8   18:return          
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #111 <Field MenuBuilder mMenu>
    //    2    4:aload_0         
    //    3    5:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    4    8:iload_3         
    //    5    9:invokevirtual   #128 <Method MenuItemImpl ListMenuPresenter$MenuAdapter.getItem(int)>
    //    6   12:iconst_0        
    //    7   13:invokevirtual   #134 <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
    //    8   16:pop             
    //    9   17:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #138 <Class Bundle>
    //    3    5:invokevirtual   #142 <Method void restoreHierarchyState(Bundle)>
    //    4    8:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #84  <Field ExpandedMenuView mMenuView>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:new             #138 <Class Bundle>
    //    6   12:dup             
    //    7   13:invokespecial   #145 <Method void Bundle()>
    //    8   16:astore_1        
    //    9   17:aload_0         
    //   10   18:aload_1         
    //   11   19:invokevirtual   #148 <Method void saveHierarchyState(Bundle)>
    //   12   22:aload_1         
    //   13   23:areturn         
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #155 <Method boolean SubMenuBuilder.hasVisibleItems()>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:new             #157 <Class MenuDialogHelper>
    //    6   12:dup             
    //    7   13:aload_1         
    //    8   14:invokespecial   #160 <Method void MenuDialogHelper(MenuBuilder)>
    //    9   17:aconst_null     
    //   10   18:invokevirtual   #164 <Method void MenuDialogHelper.show(android.os.IBinder)>
    //   11   21:aload_0         
    //   12   22:getfield        #118 <Field MenuPresenter$Callback mCallback>
    //   13   25:ifnull          39
    //   14   28:aload_0         
    //   15   29:getfield        #118 <Field MenuPresenter$Callback mCallback>
    //   16   32:aload_1         
    //   17   33:invokeinterface #168 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
    //   18   38:pop             
    //   19   39:iconst_1        
    //   20   40:ireturn         
    }

    public void restoreHierarchyState(Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #15  <String "android:menu:list">
    //    2    3:invokevirtual   #172 <Method SparseArray Bundle.getSparseParcelableArray(String)>
    //    3    6:astore_2        
    //    4    7:aload_2         
    //    5    8:ifnull          19
    //    6   11:aload_0         
    //    7   12:getfield        #84  <Field ExpandedMenuView mMenuView>
    //    8   15:aload_2         
    //    9   16:invokevirtual   #177 <Method void View.restoreHierarchyState(SparseArray)>
    //   10   19:return          
    }

    public void saveHierarchyState(Bundle bundle)
    {
    //    0    0:new             #179 <Class SparseArray>
    //    1    3:dup             
    //    2    4:invokespecial   #180 <Method void SparseArray()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #84  <Field ExpandedMenuView mMenuView>
    //    6   12:ifnull          23
    //    7   15:aload_0         
    //    8   16:getfield        #84  <Field ExpandedMenuView mMenuView>
    //    9   19:aload_2         
    //   10   20:invokevirtual   #182 <Method void View.saveHierarchyState(SparseArray)>
    //   11   23:aload_1         
    //   12   24:ldc1            #15  <String "android:menu:list">
    //   13   26:aload_2         
    //   14   27:invokevirtual   #186 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
    //   15   30:return          
    }

    public void setCallback(MenuPresenter.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #118 <Field MenuPresenter$Callback mCallback>
    //    3    5:return          
    }

    public void setId(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #76  <Field int mId>
    //    3    5:return          
    }

    public void setItemIndexOffset(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #58  <Field int mItemIndexOffset>
    //    3    5:aload_0         
    //    4    6:getfield        #84  <Field ExpandedMenuView mMenuView>
    //    5    9:ifnull          17
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:invokevirtual   #195 <Method void updateMenuView(boolean)>
    //    9   17:return          
    }

    public void updateMenuView(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #67  <Field ListMenuPresenter$MenuAdapter mAdapter>
    //    5   11:invokevirtual   #114 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
    //    6   14:return          
    }

    private static final String TAG = "ListMenuPresenter";
    public static final String VIEWS_TAG = "android:menu:list";
    MenuAdapter mAdapter;
    private MenuPresenter.Callback mCallback;
    Context mContext;
    private int mId;
    LayoutInflater mInflater;
    private int mItemIndexOffset;
    int mItemLayoutRes;
    MenuBuilder mMenu;
    ExpandedMenuView mMenuView;
    int mThemeRes;

    static int access$000(ListMenuPresenter listmenupresenter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field int mItemIndexOffset>
    //    2    4:ireturn         
    }
}
