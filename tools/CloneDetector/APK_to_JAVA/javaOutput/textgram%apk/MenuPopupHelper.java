// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.internal.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, MenuBuilder, SubMenuBuilder, MenuItemImpl, 
//            MenuView, ListMenuItemView

public class MenuPopupHelper
    implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.PopupWindow.OnDismissListener, MenuPresenter
{
    private class MenuAdapter extends BaseAdapter
    {

        public MenuAdapter(MenuBuilder menubuilder)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field MenuPopupHelper this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void BaseAdapter()>
        //    5    9:aload_0         
        //    6   10:iconst_m1       
        //    7   11:putfield        #19  <Field int mExpandedIndex>
        //    8   14:aload_0         
        //    9   15:aload_2         
        //   10   16:putfield        #21  <Field MenuBuilder mAdapterMenu>
        //   11   19:aload_0         
        //   12   20:invokevirtual   #24  <Method void findExpandedIndex()>
        //   13   23:return          
        }

        static MenuBuilder access$000(MenuAdapter menuadapter)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //    5    4:areturn         
        }

        void findExpandedIndex()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field MenuPopupHelper this$0>
        //    2    4:invokestatic    #32  <Method MenuBuilder MenuPopupHelper.access$300(MenuPopupHelper)>
        //    3    7:invokevirtual   #38  <Method MenuItemImpl MenuBuilder.getExpandedItem()>
        //    4   10:astore_1        
        //    5   11:aload_1         
        //    6   12:ifnull          66
        //    7   15:aload_0         
        //    8   16:getfield        #14  <Field MenuPopupHelper this$0>
        //    9   19:invokestatic    #32  <Method MenuBuilder MenuPopupHelper.access$300(MenuPopupHelper)>
        //   10   22:invokevirtual   #42  <Method ArrayList MenuBuilder.getNonActionItems()>
        //   11   25:astore_2        
        //   12   26:aload_2         
        //   13   27:invokevirtual   #48  <Method int ArrayList.size()>
        //   14   30:istore_3        
        //   15   31:iconst_0        
        //   16   32:istore          4
        //   17   34:iload           4
        //   18   36:iload_3         
        //   19   37:icmpge          66
        //   20   40:aload_2         
        //   21   41:iload           4
        //   22   43:invokevirtual   #52  <Method Object ArrayList.get(int)>
        //   23   46:checkcast       #54  <Class MenuItemImpl>
        //   24   49:aload_1         
        //   25   50:if_acmpne       60
        //   26   53:aload_0         
        //   27   54:iload           4
        //   28   56:putfield        #19  <Field int mExpandedIndex>
        //   29   59:return          
        //   30   60:iinc            4  1
        //   31   63:goto            34
        //   32   66:aload_0         
        //   33   67:iconst_m1       
        //   34   68:putfield        #19  <Field int mExpandedIndex>
        //   35   71:return          
        }

        public int getCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field MenuPopupHelper this$0>
        //    2    4:invokestatic    #59  <Method boolean MenuPopupHelper.access$100(MenuPopupHelper)>
        //    3    7:ifeq            30
        //    4   10:aload_0         
        //    5   11:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //    6   14:invokevirtual   #42  <Method ArrayList MenuBuilder.getNonActionItems()>
        //    7   17:astore_1        
        //    8   18:aload_0         
        //    9   19:getfield        #19  <Field int mExpandedIndex>
        //   10   22:ifge            41
        //   11   25:aload_1         
        //   12   26:invokevirtual   #48  <Method int ArrayList.size()>
        //   13   29:ireturn         
        //   14   30:aload_0         
        //   15   31:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //   16   34:invokevirtual   #62  <Method ArrayList MenuBuilder.getVisibleItems()>
        //   17   37:astore_1        
        //   18   38:goto            18
        //   19   41:iconst_m1       
        //   20   42:aload_1         
        //   21   43:invokevirtual   #48  <Method int ArrayList.size()>
        //   22   46:iadd            
        //   23   47:ireturn         
        }

        public MenuItemImpl getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field MenuPopupHelper this$0>
        //    2    4:invokestatic    #59  <Method boolean MenuPopupHelper.access$100(MenuPopupHelper)>
        //    3    7:ifeq            45
        //    4   10:aload_0         
        //    5   11:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //    6   14:invokevirtual   #42  <Method ArrayList MenuBuilder.getNonActionItems()>
        //    7   17:astore_2        
        //    8   18:aload_0         
        //    9   19:getfield        #19  <Field int mExpandedIndex>
        //   10   22:iflt            36
        //   11   25:iload_1         
        //   12   26:aload_0         
        //   13   27:getfield        #19  <Field int mExpandedIndex>
        //   14   30:icmplt          36
        //   15   33:iinc            1  1
        //   16   36:aload_2         
        //   17   37:iload_1         
        //   18   38:invokevirtual   #52  <Method Object ArrayList.get(int)>
        //   19   41:checkcast       #54  <Class MenuItemImpl>
        //   20   44:areturn         
        //   21   45:aload_0         
        //   22   46:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //   23   49:invokevirtual   #62  <Method ArrayList MenuBuilder.getVisibleItems()>
        //   24   52:astore_2        
        //   25   53:goto            18
        }

        public volatile Object getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #66  <Method MenuItemImpl getItem(int)>
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
        //    1    1:ifnonnull       20
        //    2    4:aload_0         
        //    3    5:getfield        #14  <Field MenuPopupHelper this$0>
        //    4    8:invokestatic    #74  <Method LayoutInflater MenuPopupHelper.access$200(MenuPopupHelper)>
        //    5   11:getstatic       #77  <Field int MenuPopupHelper.ITEM_LAYOUT>
        //    6   14:aload_3         
        //    7   15:iconst_0        
        //    8   16:invokevirtual   #83  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
        //    9   19:astore_2        
        //   10   20:aload_2         
        //   11   21:checkcast       #85  <Class MenuView$ItemView>
        //   12   24:astore          4
        //   13   26:aload_0         
        //   14   27:getfield        #14  <Field MenuPopupHelper this$0>
        //   15   30:getfield        #89  <Field boolean MenuPopupHelper.mForceShowIcon>
        //   16   33:ifeq            44
        //   17   36:aload_2         
        //   18   37:checkcast       #91  <Class ListMenuItemView>
        //   19   40:iconst_1        
        //   20   41:invokevirtual   #95  <Method void ListMenuItemView.setForceShowIcon(boolean)>
        //   21   44:aload           4
        //   22   46:aload_0         
        //   23   47:iload_1         
        //   24   48:invokevirtual   #66  <Method MenuItemImpl getItem(int)>
        //   25   51:iconst_0        
        //   26   52:invokeinterface #99  <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
        //   27   57:aload_2         
        //   28   58:areturn         
        }

        public void notifyDataSetChanged()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #24  <Method void findExpandedIndex()>
        //    2    4:aload_0         
        //    3    5:invokespecial   #102 <Method void BaseAdapter.notifyDataSetChanged()>
        //    4    8:return          
        }

        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        static MenuBuilder access$000(MenuAdapter menuadapter)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field MenuBuilder mAdapterMenu>
        //    2    4:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #50  <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_item_layout>
    //    1    3:putstatic       #52  <Field int ITEM_LAYOUT>
    //    2    6:return          
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aconst_null     
    //    4    4:iconst_0        
    //    5    5:invokespecial   #57  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean)>
    //    6    8:return          
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:iconst_0        
    //    5    5:invokespecial   #57  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean)>
    //    6    8:return          
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #60  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #62  <Field Context mContext>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:invokestatic    #68  <Method LayoutInflater LayoutInflater.from(Context)>
    //    8   14:putfield        #70  <Field LayoutInflater mInflater>
    //    9   17:aload_0         
    //   10   18:aload_2         
    //   11   19:putfield        #72  <Field MenuBuilder mMenu>
    //   12   22:aload_0         
    //   13   23:iload           4
    //   14   25:putfield        #74  <Field boolean mOverflowOnly>
    //   15   28:aload_1         
    //   16   29:invokevirtual   #80  <Method Resources Context.getResources()>
    //   17   32:astore          5
    //   18   34:aload_0         
    //   19   35:aload           5
    //   20   37:invokevirtual   #86  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   21   40:getfield        #91  <Field int DisplayMetrics.widthPixels>
    //   22   43:iconst_2        
    //   23   44:idiv            
    //   24   45:aload           5
    //   25   47:getstatic       #96  <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
    //   26   50:invokevirtual   #100 <Method int Resources.getDimensionPixelSize(int)>
    //   27   53:invokestatic    #106 <Method int Math.max(int, int)>
    //   28   56:putfield        #108 <Field int mPopupMaxWidth>
    //   29   59:aload_0         
    //   30   60:aload_3         
    //   31   61:putfield        #110 <Field View mAnchorView>
    //   32   64:aload_2         
    //   33   65:aload_0         
    //   34   66:invokevirtual   #116 <Method void MenuBuilder.addMenuPresenter(MenuPresenter)>
    //   35   69:return          
    }

    static boolean access$100(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field boolean mOverflowOnly>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #74  <Field boolean mOverflowOnly>
    //    5    4:ireturn         
    }

    static LayoutInflater access$200(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field LayoutInflater mInflater>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #70  <Field LayoutInflater mInflater>
    //    5    4:areturn         
    }

    static MenuBuilder access$300(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #72  <Field MenuBuilder mMenu>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #72  <Field MenuBuilder mMenu>
    //    5    4:areturn         
    }

    private int measureContentWidth(ListAdapter listadapter)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:aconst_null     
    //    3    3:astore_3        
    //    4    4:iconst_0        
    //    5    5:istore          4
    //    6    7:iconst_0        
    //    7    8:iconst_0        
    //    8    9:invokestatic    #129 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //    9   12:istore          5
    //   10   14:iconst_0        
    //   11   15:iconst_0        
    //   12   16:invokestatic    #129 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   13   19:istore          6
    //   14   21:aload_1         
    //   15   22:invokeinterface #135 <Method int ListAdapter.getCount()>
    //   16   27:istore          7
    //   17   29:iconst_0        
    //   18   30:istore          8
    //   19   32:iload           8
    //   20   34:iload           7
    //   21   36:icmpge          121
    //   22   39:aload_1         
    //   23   40:iload           8
    //   24   42:invokeinterface #138 <Method int ListAdapter.getItemViewType(int)>
    //   25   47:istore          9
    //   26   49:iload           9
    //   27   51:iload           4
    //   28   53:icmpeq          62
    //   29   56:iload           9
    //   30   58:istore          4
    //   31   60:aconst_null     
    //   32   61:astore_3        
    //   33   62:aload_0         
    //   34   63:getfield        #140 <Field ViewGroup mMeasureParent>
    //   35   66:ifnonnull       84
    //   36   69:aload_0         
    //   37   70:new             #142 <Class FrameLayout>
    //   38   73:dup             
    //   39   74:aload_0         
    //   40   75:getfield        #62  <Field Context mContext>
    //   41   78:invokespecial   #145 <Method void FrameLayout(Context)>
    //   42   81:putfield        #140 <Field ViewGroup mMeasureParent>
    //   43   84:aload_1         
    //   44   85:iload           8
    //   45   87:aload_3         
    //   46   88:aload_0         
    //   47   89:getfield        #140 <Field ViewGroup mMeasureParent>
    //   48   92:invokeinterface #149 <Method View ListAdapter.getView(int, View, ViewGroup)>
    //   49   97:astore_3        
    //   50   98:aload_3         
    //   51   99:iload           5
    //   52  101:iload           6
    //   53  103:invokevirtual   #155 <Method void View.measure(int, int)>
    //   54  106:iload_2         
    //   55  107:aload_3         
    //   56  108:invokevirtual   #158 <Method int View.getMeasuredWidth()>
    //   57  111:invokestatic    #106 <Method int Math.max(int, int)>
    //   58  114:istore_2        
    //   59  115:iinc            8  1
    //   60  118:goto            32
    //   61  121:iload_2         
    //   62  122:ireturn         
    }

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #165 <Method boolean isShowing()>
    //    2    4:ifeq            14
    //    3    7:aload_0         
    //    4    8:getfield        #167 <Field ListPopupWindow mPopup>
    //    5   11:invokevirtual   #171 <Method void ListPopupWindow.dismiss()>
    //    6   14:return          
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

    public int getId()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
    //    0    0:new             #178 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #180 <String "MenuPopupHelpers manage their own views">
    //    3    6:invokespecial   #183 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    //    0    0:return          
    }

    public boolean isShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #167 <Field ListPopupWindow mPopup>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #167 <Field ListPopupWindow mPopup>
    //    5   11:invokevirtual   #185 <Method boolean ListPopupWindow.isShowing()>
    //    6   14:ifeq            19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #72  <Field MenuBuilder mMenu>
    //    3    5:if_acmpeq       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:invokevirtual   #188 <Method void dismiss()>
    //    7   13:aload_0         
    //    8   14:getfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //    9   17:ifnull          8
    //   10   20:aload_0         
    //   11   21:getfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //   12   24:aload_1         
    //   13   25:iload_2         
    //   14   26:invokeinterface #194 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
    //   15   31:return          
    }

    public void onDismiss()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #167 <Field ListPopupWindow mPopup>
    //    3    5:aload_0         
    //    4    6:getfield        #72  <Field MenuBuilder mMenu>
    //    5    9:invokevirtual   #198 <Method void MenuBuilder.close()>
    //    6   12:aload_0         
    //    7   13:getfield        #200 <Field ViewTreeObserver mTreeObserver>
    //    8   16:ifnull          53
    //    9   19:aload_0         
    //   10   20:getfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   11   23:invokevirtual   #205 <Method boolean ViewTreeObserver.isAlive()>
    //   12   26:ifne            40
    //   13   29:aload_0         
    //   14   30:aload_0         
    //   15   31:getfield        #110 <Field View mAnchorView>
    //   16   34:invokevirtual   #209 <Method ViewTreeObserver View.getViewTreeObserver()>
    //   17   37:putfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   18   40:aload_0         
    //   19   41:getfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   20   44:aload_0         
    //   21   45:invokevirtual   #213 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   22   48:aload_0         
    //   23   49:aconst_null     
    //   24   50:putfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   25   53:return          
    }

    public void onGlobalLayout()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #165 <Method boolean isShowing()>
    //    2    4:ifeq            27
    //    3    7:aload_0         
    //    4    8:getfield        #110 <Field View mAnchorView>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:ifnull          23
    //    8   16:aload_1         
    //    9   17:invokevirtual   #217 <Method boolean View.isShown()>
    //   10   20:ifne            28
    //   11   23:aload_0         
    //   12   24:invokevirtual   #188 <Method void dismiss()>
    //   13   27:return          
    //   14   28:aload_0         
    //   15   29:invokevirtual   #165 <Method boolean isShowing()>
    //   16   32:ifeq            27
    //   17   35:aload_0         
    //   18   36:getfield        #167 <Field ListPopupWindow mPopup>
    //   19   39:invokevirtual   #220 <Method void ListPopupWindow.show()>
    //   20   42:return          
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //    2    4:astore          6
    //    3    6:aload           6
    //    4    8:invokestatic    #230 <Method MenuBuilder MenuPopupHelper$MenuAdapter.access$000(MenuPopupHelper$MenuAdapter)>
    //    5   11:aload           6
    //    6   13:iload_3         
    //    7   14:invokevirtual   #234 <Method MenuItemImpl MenuPopupHelper$MenuAdapter.getItem(int)>
    //    8   17:iconst_0        
    //    9   18:invokevirtual   #238 <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
    //   10   21:pop             
    //   11   22:return          
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
    //    0    0:aload_3         
    //    1    1:invokevirtual   #245 <Method int KeyEvent.getAction()>
    //    2    4:iconst_1        
    //    3    5:icmpne          20
    //    4    8:iload_2         
    //    5    9:bipush          82
    //    6   11:icmpne          20
    //    7   14:aload_0         
    //    8   15:invokevirtual   #188 <Method void dismiss()>
    //    9   18:iconst_1        
    //   10   19:ireturn         
    //   11   20:iconst_0        
    //   12   21:ireturn         
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #256 <Method boolean SubMenuBuilder.hasVisibleItems()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_2         
    //    6    8:ifeq            130
    //    7   11:new             #2   <Class MenuPopupHelper>
    //    8   14:dup             
    //    9   15:aload_0         
    //   10   16:getfield        #62  <Field Context mContext>
    //   11   19:aload_1         
    //   12   20:aload_0         
    //   13   21:getfield        #110 <Field View mAnchorView>
    //   14   24:iconst_0        
    //   15   25:invokespecial   #57  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean)>
    //   16   28:astore          4
    //   17   30:aload           4
    //   18   32:aload_0         
    //   19   33:getfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //   20   36:invokevirtual   #260 <Method void setCallback(MenuPresenter$Callback)>
    //   21   39:aload_1         
    //   22   40:invokevirtual   #263 <Method int SubMenuBuilder.size()>
    //   23   43:istore          5
    //   24   45:iconst_0        
    //   25   46:istore          6
    //   26   48:iconst_0        
    //   27   49:istore          7
    //   28   51:iload           6
    //   29   53:iload           5
    //   30   55:icmpge          89
    //   31   58:aload_1         
    //   32   59:iload           6
    //   33   61:invokevirtual   #266 <Method MenuItem SubMenuBuilder.getItem(int)>
    //   34   64:astore          10
    //   35   66:aload           10
    //   36   68:invokeinterface #271 <Method boolean MenuItem.isVisible()>
    //   37   73:ifeq            132
    //   38   76:aload           10
    //   39   78:invokeinterface #275 <Method android.graphics.drawable.Drawable MenuItem.getIcon()>
    //   40   83:ifnull          132
    //   41   86:iconst_1        
    //   42   87:istore          7
    //   43   89:aload           4
    //   44   91:iload           7
    //   45   93:invokevirtual   #279 <Method void setForceShowIcon(boolean)>
    //   46   96:aload           4
    //   47   98:invokevirtual   #282 <Method boolean tryShow()>
    //   48  101:istore          8
    //   49  103:iconst_0        
    //   50  104:istore_3        
    //   51  105:iload           8
    //   52  107:ifeq            130
    //   53  110:aload_0         
    //   54  111:getfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //   55  114:ifnull          128
    //   56  117:aload_0         
    //   57  118:getfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //   58  121:aload_1         
    //   59  122:invokeinterface #286 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
    //   60  127:pop             
    //   61  128:iconst_1        
    //   62  129:istore_3        
    //   63  130:iload_3         
    //   64  131:ireturn         
    //   65  132:iinc            6  1
    //   66  135:goto            48
    }

    public void setAnchorView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #110 <Field View mAnchorView>
    //    3    5:return          
    }

    public void setCallback(MenuPresenter.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #190 <Field MenuPresenter$Callback mPresenterCallback>
    //    3    5:return          
    }

    public void setForceShowIcon(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #290 <Field boolean mForceShowIcon>
    //    3    5:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #282 <Method boolean tryShow()>
    //    2    4:ifne            18
    //    3    7:new             #292 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #294 <String "MenuPopupHelper cannot be used without an anchor">
    //    6   14:invokespecial   #295 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:return          
    }

    public boolean tryShow()
    {
    //    0    0:aload_0         
    //    1    1:new             #169 <Class ListPopupWindow>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:getfield        #62  <Field Context mContext>
    //    5    9:aconst_null     
    //    6   10:getstatic       #300 <Field int android.support.v7.appcompat.R$attr.popupMenuStyle>
    //    7   13:invokespecial   #303 <Method void ListPopupWindow(Context, android.util.AttributeSet, int)>
    //    8   16:putfield        #167 <Field ListPopupWindow mPopup>
    //    9   19:aload_0         
    //   10   20:getfield        #167 <Field ListPopupWindow mPopup>
    //   11   23:aload_0         
    //   12   24:invokevirtual   #307 <Method void ListPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
    //   13   27:aload_0         
    //   14   28:getfield        #167 <Field ListPopupWindow mPopup>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #311 <Method void ListPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   17   35:aload_0         
    //   18   36:new             #226 <Class MenuPopupHelper$MenuAdapter>
    //   19   39:dup             
    //   20   40:aload_0         
    //   21   41:aload_0         
    //   22   42:getfield        #72  <Field MenuBuilder mMenu>
    //   23   45:invokespecial   #314 <Method void MenuPopupHelper$MenuAdapter(MenuPopupHelper, MenuBuilder)>
    //   24   48:putfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //   25   51:aload_0         
    //   26   52:getfield        #167 <Field ListPopupWindow mPopup>
    //   27   55:aload_0         
    //   28   56:getfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //   29   59:invokevirtual   #318 <Method void ListPopupWindow.setAdapter(ListAdapter)>
    //   30   62:aload_0         
    //   31   63:getfield        #167 <Field ListPopupWindow mPopup>
    //   32   66:iconst_1        
    //   33   67:invokevirtual   #321 <Method void ListPopupWindow.setModal(boolean)>
    //   34   70:aload_0         
    //   35   71:getfield        #110 <Field View mAnchorView>
    //   36   74:astore_1        
    //   37   75:aload_1         
    //   38   76:ifnull          170
    //   39   79:aload_0         
    //   40   80:getfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   41   83:astore_2        
    //   42   84:iconst_0        
    //   43   85:istore_3        
    //   44   86:aload_2         
    //   45   87:ifnonnull       92
    //   46   90:iconst_1        
    //   47   91:istore_3        
    //   48   92:aload_0         
    //   49   93:aload_1         
    //   50   94:invokevirtual   #209 <Method ViewTreeObserver View.getViewTreeObserver()>
    //   51   97:putfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   52  100:iload_3         
    //   53  101:ifeq            112
    //   54  104:aload_0         
    //   55  105:getfield        #200 <Field ViewTreeObserver mTreeObserver>
    //   56  108:aload_0         
    //   57  109:invokevirtual   #324 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   58  112:aload_0         
    //   59  113:getfield        #167 <Field ListPopupWindow mPopup>
    //   60  116:aload_1         
    //   61  117:invokevirtual   #326 <Method void ListPopupWindow.setAnchorView(View)>
    //   62  120:aload_0         
    //   63  121:getfield        #167 <Field ListPopupWindow mPopup>
    //   64  124:aload_0         
    //   65  125:aload_0         
    //   66  126:getfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //   67  129:invokespecial   #328 <Method int measureContentWidth(ListAdapter)>
    //   68  132:aload_0         
    //   69  133:getfield        #108 <Field int mPopupMaxWidth>
    //   70  136:invokestatic    #331 <Method int Math.min(int, int)>
    //   71  139:invokevirtual   #335 <Method void ListPopupWindow.setContentWidth(int)>
    //   72  142:aload_0         
    //   73  143:getfield        #167 <Field ListPopupWindow mPopup>
    //   74  146:iconst_2        
    //   75  147:invokevirtual   #338 <Method void ListPopupWindow.setInputMethodMode(int)>
    //   76  150:aload_0         
    //   77  151:getfield        #167 <Field ListPopupWindow mPopup>
    //   78  154:invokevirtual   #220 <Method void ListPopupWindow.show()>
    //   79  157:aload_0         
    //   80  158:getfield        #167 <Field ListPopupWindow mPopup>
    //   81  161:invokevirtual   #342 <Method ListView ListPopupWindow.getListView()>
    //   82  164:aload_0         
    //   83  165:invokevirtual   #348 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
    //   84  168:iconst_1        
    //   85  169:ireturn         
    //   86  170:iconst_0        
    //   87  171:ireturn         
    }

    public void updateMenuView(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #224 <Field MenuPopupHelper$MenuAdapter mAdapter>
    //    5   11:invokevirtual   #352 <Method void MenuPopupHelper$MenuAdapter.notifyDataSetChanged()>
    //    6   14:return          
    }

    static final int ITEM_LAYOUT = 0;
    private static final String TAG = "MenuPopupHelper";
    private MenuAdapter mAdapter;
    private View mAnchorView;
    private Context mContext;
    boolean mForceShowIcon;
    private LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private MenuBuilder mMenu;
    private boolean mOverflowOnly;
    private ListPopupWindow mPopup;
    private int mPopupMaxWidth;
    private MenuPresenter.Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    static boolean access$100(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field boolean mOverflowOnly>
    //    2    4:ireturn         
    }

    static LayoutInflater access$200(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field LayoutInflater mInflater>
    //    2    4:areturn         
    }

    static MenuBuilder access$300(MenuPopupHelper menupopuphelper)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #72  <Field MenuBuilder mMenu>
    //    2    4:areturn         
    }
}
