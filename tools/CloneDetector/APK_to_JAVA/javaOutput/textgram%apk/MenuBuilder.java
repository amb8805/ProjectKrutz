// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.util.SparseArray;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl, MenuPresenter, SubMenuBuilder

public class MenuBuilder
    implements SupportMenu
{
    public static interface Callback
    {

        public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem);

        public abstract void onMenuModeChange(MenuBuilder menubuilder);
    }

    public static interface ItemInvoker
    {

        public abstract boolean invokeItem(MenuItemImpl menuitemimpl);
    }


    static 
    {
    //    0    0:bipush          6
    //    1    2:newarray        int[]
    //    2    4:dup             
    //    3    5:iconst_0        
    //    4    6:iconst_1        
    //    5    7:iastore         
    //    6    8:dup             
    //    7    9:iconst_1        
    //    8   10:iconst_4        
    //    9   11:iastore         
    //   10   12:dup             
    //   11   13:iconst_2        
    //   12   14:iconst_5        
    //   13   15:iastore         
    //   14   16:dup             
    //   15   17:iconst_3        
    //   16   18:iconst_3        
    //   17   19:iastore         
    //   18   20:dup             
    //   19   21:iconst_4        
    //   20   22:iconst_2        
    //   21   23:iastore         
    //   22   24:dup             
    //   23   25:iconst_5        
    //   24   26:iconst_0        
    //   25   27:iastore         
    //   26   28:putstatic       #62  <Field int[] sCategoryToOrder>
    //   27   31:return          
    }

    public MenuBuilder(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #66  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #68  <Field int mDefaultShowAsAction>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #74  <Field boolean mOptionalIconsVisible>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #76  <Field boolean mIsClosing>
    //   17   29:aload_0         
    //   18   30:new             #78  <Class ArrayList>
    //   19   33:dup             
    //   20   34:invokespecial   #79  <Method void ArrayList()>
    //   21   37:putfield        #81  <Field ArrayList mTempShortcutItemList>
    //   22   40:aload_0         
    //   23   41:new             #83  <Class CopyOnWriteArrayList>
    //   24   44:dup             
    //   25   45:invokespecial   #84  <Method void CopyOnWriteArrayList()>
    //   26   48:putfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   27   51:aload_0         
    //   28   52:aload_1         
    //   29   53:putfield        #88  <Field Context mContext>
    //   30   56:aload_0         
    //   31   57:aload_1         
    //   32   58:invokevirtual   #94  <Method Resources Context.getResources()>
    //   33   61:putfield        #96  <Field Resources mResources>
    //   34   64:aload_0         
    //   35   65:new             #78  <Class ArrayList>
    //   36   68:dup             
    //   37   69:invokespecial   #79  <Method void ArrayList()>
    //   38   72:putfield        #98  <Field ArrayList mItems>
    //   39   75:aload_0         
    //   40   76:new             #78  <Class ArrayList>
    //   41   79:dup             
    //   42   80:invokespecial   #79  <Method void ArrayList()>
    //   43   83:putfield        #100 <Field ArrayList mVisibleItems>
    //   44   86:aload_0         
    //   45   87:iconst_1        
    //   46   88:putfield        #102 <Field boolean mIsVisibleItemsStale>
    //   47   91:aload_0         
    //   48   92:new             #78  <Class ArrayList>
    //   49   95:dup             
    //   50   96:invokespecial   #79  <Method void ArrayList()>
    //   51   99:putfield        #104 <Field ArrayList mActionItems>
    //   52  102:aload_0         
    //   53  103:new             #78  <Class ArrayList>
    //   54  106:dup             
    //   55  107:invokespecial   #79  <Method void ArrayList()>
    //   56  110:putfield        #106 <Field ArrayList mNonActionItems>
    //   57  113:aload_0         
    //   58  114:iconst_1        
    //   59  115:putfield        #108 <Field boolean mIsActionItemsStale>
    //   60  118:aload_0         
    //   61  119:iconst_1        
    //   62  120:invokespecial   #112 <Method void setShortcutsVisibleInner(boolean)>
    //   63  123:return          
    }

    private MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
    {
    //    0    0:iload_3         
    //    1    1:invokestatic    #118 <Method int getOrdering(int)>
    //    2    4:istore          5
    //    3    6:new             #120 <Class MenuItemImpl>
    //    4    9:dup             
    //    5   10:aload_0         
    //    6   11:iload_1         
    //    7   12:iload_2         
    //    8   13:iload_3         
    //    9   14:iload           5
    //   10   16:aload           4
    //   11   18:aload_0         
    //   12   19:getfield        #68  <Field int mDefaultShowAsAction>
    //   13   22:invokespecial   #123 <Method void MenuItemImpl(MenuBuilder, int, int, int, int, CharSequence, int)>
    //   14   25:astore          6
    //   15   27:aload_0         
    //   16   28:getfield        #125 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
    //   17   31:ifnull          43
    //   18   34:aload           6
    //   19   36:aload_0         
    //   20   37:getfield        #125 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
    //   21   40:invokevirtual   #129 <Method void MenuItemImpl.setMenuInfo(android.view.ContextMenu$ContextMenuInfo)>
    //   22   43:aload_0         
    //   23   44:getfield        #98  <Field ArrayList mItems>
    //   24   47:aload_0         
    //   25   48:getfield        #98  <Field ArrayList mItems>
    //   26   51:iload           5
    //   27   53:invokestatic    #133 <Method int findInsertIndex(ArrayList, int)>
    //   28   56:aload           6
    //   29   58:invokevirtual   #137 <Method void ArrayList.add(int, Object)>
    //   30   61:aload_0         
    //   31   62:iconst_1        
    //   32   63:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   33   66:aload           6
    //   34   68:areturn         
    }

    private void dispatchPresenterUpdate(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    3    7:ifeq            11
    //    4   10:return          
    //    5   11:aload_0         
    //    6   12:invokevirtual   #148 <Method void stopDispatchingItemsChanged()>
    //    7   15:aload_0         
    //    8   16:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    9   19:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   10   22:astore_2        
    //   11   23:aload_2         
    //   12   24:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   13   29:ifeq            79
    //   14   32:aload_2         
    //   15   33:invokeinterface #161 <Method Object Iterator.next()>
    //   16   38:checkcast       #163 <Class WeakReference>
    //   17   41:astore_3        
    //   18   42:aload_3         
    //   19   43:invokevirtual   #166 <Method Object WeakReference.get()>
    //   20   46:checkcast       #168 <Class MenuPresenter>
    //   21   49:astore          4
    //   22   51:aload           4
    //   23   53:ifnonnull       68
    //   24   56:aload_0         
    //   25   57:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   26   60:aload_3         
    //   27   61:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   28   64:pop             
    //   29   65:goto            23
    //   30   68:aload           4
    //   31   70:iload_1         
    //   32   71:invokeinterface #175 <Method void MenuPresenter.updateMenuView(boolean)>
    //   33   76:goto            23
    //   34   79:aload_0         
    //   35   80:invokevirtual   #178 <Method void startDispatchingItemsChanged()>
    //   36   83:return          
    }

    private void dispatchRestoreInstanceState(Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #16  <String "android:menu:presenters">
    //    2    3:invokevirtual   #186 <Method SparseArray Bundle.getSparseParcelableArray(String)>
    //    3    6:astore_2        
    //    4    7:aload_2         
    //    5    8:ifnull          21
    //    6   11:aload_0         
    //    7   12:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    8   15:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    9   18:ifeq            22
    //   10   21:return          
    //   11   22:aload_0         
    //   12   23:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   13   26:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   14   29:astore_3        
    //   15   30:aload_3         
    //   16   31:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   17   36:ifeq            21
    //   18   39:aload_3         
    //   19   40:invokeinterface #161 <Method Object Iterator.next()>
    //   20   45:checkcast       #163 <Class WeakReference>
    //   21   48:astore          4
    //   22   50:aload           4
    //   23   52:invokevirtual   #166 <Method Object WeakReference.get()>
    //   24   55:checkcast       #168 <Class MenuPresenter>
    //   25   58:astore          5
    //   26   60:aload           5
    //   27   62:ifnonnull       78
    //   28   65:aload_0         
    //   29   66:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   30   69:aload           4
    //   31   71:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   32   74:pop             
    //   33   75:goto            30
    //   34   78:aload           5
    //   35   80:invokeinterface #190 <Method int MenuPresenter.getId()>
    //   36   85:istore          6
    //   37   87:iload           6
    //   38   89:ifle            30
    //   39   92:aload_2         
    //   40   93:iload           6
    //   41   95:invokevirtual   #195 <Method Object SparseArray.get(int)>
    //   42   98:checkcast       #197 <Class Parcelable>
    //   43  101:astore          7
    //   44  103:aload           7
    //   45  105:ifnull          30
    //   46  108:aload           5
    //   47  110:aload           7
    //   48  112:invokeinterface #201 <Method void MenuPresenter.onRestoreInstanceState(Parcelable)>
    //   49  117:goto            30
    }

    private void dispatchSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    3    7:ifeq            11
    //    4   10:return          
    //    5   11:new             #192 <Class SparseArray>
    //    6   14:dup             
    //    7   15:invokespecial   #203 <Method void SparseArray()>
    //    8   18:astore_2        
    //    9   19:aload_0         
    //   10   20:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   11   23:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   12   26:astore_3        
    //   13   27:aload_3         
    //   14   28:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   15   33:ifeq            114
    //   16   36:aload_3         
    //   17   37:invokeinterface #161 <Method Object Iterator.next()>
    //   18   42:checkcast       #163 <Class WeakReference>
    //   19   45:astore          4
    //   20   47:aload           4
    //   21   49:invokevirtual   #166 <Method Object WeakReference.get()>
    //   22   52:checkcast       #168 <Class MenuPresenter>
    //   23   55:astore          5
    //   24   57:aload           5
    //   25   59:ifnonnull       75
    //   26   62:aload_0         
    //   27   63:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   28   66:aload           4
    //   29   68:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   30   71:pop             
    //   31   72:goto            27
    //   32   75:aload           5
    //   33   77:invokeinterface #190 <Method int MenuPresenter.getId()>
    //   34   82:istore          6
    //   35   84:iload           6
    //   36   86:ifle            27
    //   37   89:aload           5
    //   38   91:invokeinterface #207 <Method Parcelable MenuPresenter.onSaveInstanceState()>
    //   39   96:astore          7
    //   40   98:aload           7
    //   41  100:ifnull          27
    //   42  103:aload_2         
    //   43  104:iload           6
    //   44  106:aload           7
    //   45  108:invokevirtual   #210 <Method void SparseArray.put(int, Object)>
    //   46  111:goto            27
    //   47  114:aload_1         
    //   48  115:ldc1            #16  <String "android:menu:presenters">
    //   49  117:aload_2         
    //   50  118:invokevirtual   #214 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
    //   51  121:return          
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    3    7:ifeq            14
    //    4   10:iconst_0        
    //    5   11:istore_2        
    //    6   12:iload_2         
    //    7   13:ireturn         
    //    8   14:iconst_0        
    //    9   15:istore_2        
    //   10   16:aload_0         
    //   11   17:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   12   20:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   13   23:astore_3        
    //   14   24:aload_3         
    //   15   25:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   16   30:ifeq            12
    //   17   33:aload_3         
    //   18   34:invokeinterface #161 <Method Object Iterator.next()>
    //   19   39:checkcast       #163 <Class WeakReference>
    //   20   42:astore          4
    //   21   44:aload           4
    //   22   46:invokevirtual   #166 <Method Object WeakReference.get()>
    //   23   49:checkcast       #168 <Class MenuPresenter>
    //   24   52:astore          5
    //   25   54:aload           5
    //   26   56:ifnonnull       72
    //   27   59:aload_0         
    //   28   60:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   29   63:aload           4
    //   30   65:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   31   68:pop             
    //   32   69:goto            24
    //   33   72:iload_2         
    //   34   73:ifne            24
    //   35   76:aload           5
    //   36   78:aload_1         
    //   37   79:invokeinterface #219 <Method boolean MenuPresenter.onSubMenuSelected(SubMenuBuilder)>
    //   38   84:istore_2        
    //   39   85:goto            24
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
    //    0    0:iconst_m1       
    //    1    1:aload_0         
    //    2    2:invokevirtual   #222 <Method int ArrayList.size()>
    //    3    5:iadd            
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:iflt            36
    //    7   11:aload_0         
    //    8   12:iload_2         
    //    9   13:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   10   16:checkcast       #120 <Class MenuItemImpl>
    //   11   19:invokevirtual   #225 <Method int MenuItemImpl.getOrdering()>
    //   12   22:iload_1         
    //   13   23:icmpgt          30
    //   14   26:iload_2         
    //   15   27:iconst_1        
    //   16   28:iadd            
    //   17   29:ireturn         
    //   18   30:iinc            2  -1
    //   19   33:goto            7
    //   20   36:iconst_0        
    //   21   37:ireturn         
    }

    private static int getOrdering(int i)
    {
    //    0    0:ldc1            #226 <Int 0xffff0000>
    //    1    2:iload_0         
    //    2    3:iand            
    //    3    4:bipush          16
    //    4    6:ishr            
    //    5    7:istore_1        
    //    6    8:iload_1         
    //    7    9:iflt            20
    //    8   12:iload_1         
    //    9   13:getstatic       #62  <Field int[] sCategoryToOrder>
    //   10   16:arraylength     
    //   11   17:icmplt          30
    //   12   20:new             #228 <Class IllegalArgumentException>
    //   13   23:dup             
    //   14   24:ldc1            #230 <String "order does not contain a valid category.">
    //   15   26:invokespecial   #233 <Method void IllegalArgumentException(String)>
    //   16   29:athrow          
    //   17   30:getstatic       #62  <Field int[] sCategoryToOrder>
    //   18   33:iload_1         
    //   19   34:iaload          
    //   20   35:bipush          16
    //   21   37:ishl            
    //   22   38:ldc1            #234 <Int 65535>
    //   23   40:iload_0         
    //   24   41:iand            
    //   25   42:ior             
    //   26   43:ireturn         
    }

    private void removeItemAtInt(int i, boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:iflt            15
    //    2    4:iload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #98  <Field ArrayList mItems>
    //    5    9:invokevirtual   #222 <Method int ArrayList.size()>
    //    6   12:icmplt          16
    //    7   15:return          
    //    8   16:aload_0         
    //    9   17:getfield        #98  <Field ArrayList mItems>
    //   10   20:iload_1         
    //   11   21:invokevirtual   #238 <Method Object ArrayList.remove(int)>
    //   12   24:pop             
    //   13   25:iload_2         
    //   14   26:ifeq            15
    //   15   29:aload_0         
    //   16   30:iconst_1        
    //   17   31:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   18   34:return          
    }

    private void setHeaderInternal(int i, CharSequence charsequence, int j, Drawable drawable, View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #241 <Method Resources getResources()>
    //    2    4:astore          6
    //    3    6:aload           5
    //    4    8:ifnull          33
    //    5   11:aload_0         
    //    6   12:aload           5
    //    7   14:putfield        #243 <Field View mHeaderView>
    //    8   17:aload_0         
    //    9   18:aconst_null     
    //   10   19:putfield        #245 <Field CharSequence mHeaderTitle>
    //   11   22:aload_0         
    //   12   23:aconst_null     
    //   13   24:putfield        #247 <Field Drawable mHeaderIcon>
    //   14   27:aload_0         
    //   15   28:iconst_0        
    //   16   29:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   17   32:return          
    //   18   33:iload_1         
    //   19   34:ifle            69
    //   20   37:aload_0         
    //   21   38:aload           6
    //   22   40:iload_1         
    //   23   41:invokevirtual   #253 <Method CharSequence Resources.getText(int)>
    //   24   44:putfield        #245 <Field CharSequence mHeaderTitle>
    //   25   47:iload_3         
    //   26   48:ifle            81
    //   27   51:aload_0         
    //   28   52:aload           6
    //   29   54:iload_3         
    //   30   55:invokevirtual   #257 <Method Drawable Resources.getDrawable(int)>
    //   31   58:putfield        #247 <Field Drawable mHeaderIcon>
    //   32   61:aload_0         
    //   33   62:aconst_null     
    //   34   63:putfield        #243 <Field View mHeaderView>
    //   35   66:goto            27
    //   36   69:aload_2         
    //   37   70:ifnull          47
    //   38   73:aload_0         
    //   39   74:aload_2         
    //   40   75:putfield        #245 <Field CharSequence mHeaderTitle>
    //   41   78:goto            47
    //   42   81:aload           4
    //   43   83:ifnull          61
    //   44   86:aload_0         
    //   45   87:aload           4
    //   46   89:putfield        #247 <Field Drawable mHeaderIcon>
    //   47   92:goto            61
    }

    private void setShortcutsVisibleInner(boolean flag)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:iload_1         
    //    3    3:ifeq            39
    //    4    6:aload_0         
    //    5    7:getfield        #96  <Field Resources mResources>
    //    6   10:invokevirtual   #261 <Method Configuration Resources.getConfiguration()>
    //    7   13:getfield        #266 <Field int Configuration.keyboard>
    //    8   16:iload_2         
    //    9   17:icmpeq          39
    //   10   20:aload_0         
    //   11   21:getfield        #96  <Field Resources mResources>
    //   12   24:getstatic       #271 <Field int android.support.v7.appcompat.R$bool.abc_config_showMenuShortcutsWhenKeyboardPresent>
    //   13   27:invokevirtual   #275 <Method boolean Resources.getBoolean(int)>
    //   14   30:ifeq            39
    //   15   33:aload_0         
    //   16   34:iload_2         
    //   17   35:putfield        #277 <Field boolean mShortcutsVisible>
    //   18   38:return          
    //   19   39:iconst_0        
    //   20   40:istore_2        
    //   21   41:goto            33
    }

    public MenuItem add(int i)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:iconst_0        
    //    3    3:iconst_0        
    //    4    4:aload_0         
    //    5    5:getfield        #96  <Field Resources mResources>
    //    6    8:iload_1         
    //    7    9:invokevirtual   #282 <Method String Resources.getString(int)>
    //    8   12:invokespecial   #284 <Method MenuItem addInternal(int, int, int, CharSequence)>
    //    9   15:areturn         
    }

    public MenuItem add(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:aload_0         
    //    5    5:getfield        #96  <Field Resources mResources>
    //    6    8:iload           4
    //    7   10:invokevirtual   #282 <Method String Resources.getString(int)>
    //    8   13:invokespecial   #284 <Method MenuItem addInternal(int, int, int, CharSequence)>
    //    9   16:areturn         
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:aload           4
    //    5    6:invokespecial   #284 <Method MenuItem addInternal(int, int, int, CharSequence)>
    //    6    9:areturn         
    }

    public MenuItem add(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:iconst_0        
    //    3    3:iconst_0        
    //    4    4:aload_1         
    //    5    5:invokespecial   #284 <Method MenuItem addInternal(int, int, int, CharSequence)>
    //    6    8:areturn         
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field Context mContext>
    //    2    4:invokevirtual   #292 <Method PackageManager Context.getPackageManager()>
    //    3    7:astore          9
    //    4    9:aload           9
    //    5   11:aload           4
    //    6   13:aload           5
    //    7   15:aload           6
    //    8   17:iconst_0        
    //    9   18:invokevirtual   #298 <Method List PackageManager.queryIntentActivityOptions(ComponentName, Intent[], Intent, int)>
    //   10   21:astore          10
    //   11   23:aload           10
    //   12   25:ifnull          192
    //   13   28:aload           10
    //   14   30:invokeinterface #301 <Method int List.size()>
    //   15   35:istore          11
    //   16   37:iload           7
    //   17   39:iconst_1        
    //   18   40:iand            
    //   19   41:ifne            49
    //   20   44:aload_0         
    //   21   45:iload_1         
    //   22   46:invokevirtual   #305 <Method void removeGroup(int)>
    //   23   49:iconst_0        
    //   24   50:istore          12
    //   25   52:iload           12
    //   26   54:iload           11
    //   27   56:icmpge          211
    //   28   59:aload           10
    //   29   61:iload           12
    //   30   63:invokeinterface #306 <Method Object List.get(int)>
    //   31   68:checkcast       #308 <Class ResolveInfo>
    //   32   71:astore          13
    //   33   73:aload           13
    //   34   75:getfield        #311 <Field int ResolveInfo.specificIndex>
    //   35   78:ifge            198
    //   36   81:aload           6
    //   37   83:astore          14
    //   38   85:new             #313 <Class Intent>
    //   39   88:dup             
    //   40   89:aload           14
    //   41   91:invokespecial   #316 <Method void Intent(Intent)>
    //   42   94:astore          15
    //   43   96:aload           15
    //   44   98:new             #318 <Class ComponentName>
    //   45  101:dup             
    //   46  102:aload           13
    //   47  104:getfield        #322 <Field ActivityInfo ResolveInfo.activityInfo>
    //   48  107:getfield        #328 <Field ApplicationInfo ActivityInfo.applicationInfo>
    //   49  110:getfield        #333 <Field String ApplicationInfo.packageName>
    //   50  113:aload           13
    //   51  115:getfield        #322 <Field ActivityInfo ResolveInfo.activityInfo>
    //   52  118:getfield        #336 <Field String ActivityInfo.name>
    //   53  121:invokespecial   #339 <Method void ComponentName(String, String)>
    //   54  124:invokevirtual   #343 <Method Intent Intent.setComponent(ComponentName)>
    //   55  127:pop             
    //   56  128:aload_0         
    //   57  129:iload_1         
    //   58  130:iload_2         
    //   59  131:iload_3         
    //   60  132:aload           13
    //   61  134:aload           9
    //   62  136:invokevirtual   #347 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
    //   63  139:invokevirtual   #349 <Method MenuItem add(int, int, int, CharSequence)>
    //   64  142:aload           13
    //   65  144:aload           9
    //   66  146:invokevirtual   #353 <Method Drawable ResolveInfo.loadIcon(PackageManager)>
    //   67  149:invokeinterface #359 <Method MenuItem MenuItem.setIcon(Drawable)>
    //   68  154:aload           15
    //   69  156:invokeinterface #363 <Method MenuItem MenuItem.setIntent(Intent)>
    //   70  161:astore          17
    //   71  163:aload           8
    //   72  165:ifnull          186
    //   73  168:aload           13
    //   74  170:getfield        #311 <Field int ResolveInfo.specificIndex>
    //   75  173:iflt            186
    //   76  176:aload           8
    //   77  178:aload           13
    //   78  180:getfield        #311 <Field int ResolveInfo.specificIndex>
    //   79  183:aload           17
    //   80  185:aastore         
    //   81  186:iinc            12  1
    //   82  189:goto            52
    //   83  192:iconst_0        
    //   84  193:istore          11
    //   85  195:goto            37
    //   86  198:aload           5
    //   87  200:aload           13
    //   88  202:getfield        #311 <Field int ResolveInfo.specificIndex>
    //   89  205:aaload          
    //   90  206:astore          14
    //   91  208:goto            85
    //   92  211:iload           11
    //   93  213:ireturn         
    }

    public void addMenuPresenter(MenuPresenter menupresenter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:new             #163 <Class WeakReference>
    //    3    7:dup             
    //    4    8:aload_1         
    //    5    9:invokespecial   #368 <Method void WeakReference(Object)>
    //    6   12:invokevirtual   #370 <Method boolean CopyOnWriteArrayList.add(Object)>
    //    7   15:pop             
    //    8   16:aload_1         
    //    9   17:aload_0         
    //   10   18:getfield        #88  <Field Context mContext>
    //   11   21:aload_0         
    //   12   22:invokeinterface #374 <Method void MenuPresenter.initForMenu(Context, MenuBuilder)>
    //   13   27:aload_0         
    //   14   28:iconst_1        
    //   15   29:putfield        #108 <Field boolean mIsActionItemsStale>
    //   16   32:return          
    }

    public SubMenu addSubMenu(int i)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:iconst_0        
    //    3    3:iconst_0        
    //    4    4:aload_0         
    //    5    5:getfield        #96  <Field Resources mResources>
    //    6    8:iload_1         
    //    7    9:invokevirtual   #282 <Method String Resources.getString(int)>
    //    8   12:invokevirtual   #379 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
    //    9   15:areturn         
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:aload_0         
    //    5    5:getfield        #96  <Field Resources mResources>
    //    6    8:iload           4
    //    7   10:invokevirtual   #282 <Method String Resources.getString(int)>
    //    8   13:invokevirtual   #379 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
    //    9   16:areturn         
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:aload           4
    //    5    6:invokespecial   #284 <Method MenuItem addInternal(int, int, int, CharSequence)>
    //    6    9:checkcast       #120 <Class MenuItemImpl>
    //    7   12:astore          5
    //    8   14:new             #382 <Class SubMenuBuilder>
    //    9   17:dup             
    //   10   18:aload_0         
    //   11   19:getfield        #88  <Field Context mContext>
    //   12   22:aload_0         
    //   13   23:aload           5
    //   14   25:invokespecial   #385 <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
    //   15   28:astore          6
    //   16   30:aload           5
    //   17   32:aload           6
    //   18   34:invokevirtual   #389 <Method void MenuItemImpl.setSubMenu(SubMenuBuilder)>
    //   19   37:aload           6
    //   20   39:areturn         
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:iconst_0        
    //    3    3:iconst_0        
    //    4    4:aload_1         
    //    5    5:invokevirtual   #379 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
    //    6    8:areturn         
    }

    public void changeMenuMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #393 <Field MenuBuilder$Callback mCallback>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #393 <Field MenuBuilder$Callback mCallback>
    //    5   11:aload_0         
    //    6   12:invokeinterface #399 <Method void MenuBuilder$Callback.onMenuModeChange(MenuBuilder)>
    //    7   17:return          
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #402 <Field MenuItemImpl mExpandedItem>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #402 <Field MenuItemImpl mExpandedItem>
    //    6   12:invokevirtual   #406 <Method boolean collapseItemActionView(MenuItemImpl)>
    //    7   15:pop             
    //    8   16:aload_0         
    //    9   17:getfield        #98  <Field ArrayList mItems>
    //   10   20:invokevirtual   #408 <Method void ArrayList.clear()>
    //   11   23:aload_0         
    //   12   24:iconst_1        
    //   13   25:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   14   28:return          
    }

    public void clearAll()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #410 <Method void clear()>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #413 <Method void clearHeader()>
    //    7   13:aload_0         
    //    8   14:iconst_0        
    //    9   15:putfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //   10   18:aload_0         
    //   11   19:iconst_0        
    //   12   20:putfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //   13   23:aload_0         
    //   14   24:iconst_1        
    //   15   25:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   16   28:return          
    }

    public void clearHeader()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #247 <Field Drawable mHeaderIcon>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #245 <Field CharSequence mHeaderTitle>
    //    6   10:aload_0         
    //    7   11:aconst_null     
    //    8   12:putfield        #243 <Field View mHeaderView>
    //    9   15:aload_0         
    //   10   16:iconst_0        
    //   11   17:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   12   20:return          
    }

    public void close()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokevirtual   #416 <Method void close(boolean)>
    //    3    5:return          
    }

    final void close(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field boolean mIsClosing>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:putfield        #76  <Field boolean mIsClosing>
    //    7   13:aload_0         
    //    8   14:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    9   17:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   10   20:astore_2        
    //   11   21:aload_2         
    //   12   22:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   13   27:ifeq            78
    //   14   30:aload_2         
    //   15   31:invokeinterface #161 <Method Object Iterator.next()>
    //   16   36:checkcast       #163 <Class WeakReference>
    //   17   39:astore_3        
    //   18   40:aload_3         
    //   19   41:invokevirtual   #166 <Method Object WeakReference.get()>
    //   20   44:checkcast       #168 <Class MenuPresenter>
    //   21   47:astore          4
    //   22   49:aload           4
    //   23   51:ifnonnull       66
    //   24   54:aload_0         
    //   25   55:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   26   58:aload_3         
    //   27   59:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   28   62:pop             
    //   29   63:goto            21
    //   30   66:aload           4
    //   31   68:aload_0         
    //   32   69:iload_1         
    //   33   70:invokeinterface #420 <Method void MenuPresenter.onCloseMenu(MenuBuilder, boolean)>
    //   34   75:goto            21
    //   35   78:aload_0         
    //   36   79:iconst_0        
    //   37   80:putfield        #76  <Field boolean mIsClosing>
    //   38   83:return          
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    3    7:ifne            18
    //    4   10:aload_0         
    //    5   11:getfield        #402 <Field MenuItemImpl mExpandedItem>
    //    6   14:aload_1         
    //    7   15:if_acmpeq       22
    //    8   18:iconst_0        
    //    9   19:istore_2        
    //   10   20:iload_2         
    //   11   21:ireturn         
    //   12   22:iconst_0        
    //   13   23:istore_2        
    //   14   24:aload_0         
    //   15   25:invokevirtual   #148 <Method void stopDispatchingItemsChanged()>
    //   16   28:aload_0         
    //   17   29:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   18   32:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   19   35:astore_3        
    //   20   36:aload_3         
    //   21   37:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   22   42:ifeq            98
    //   23   45:aload_3         
    //   24   46:invokeinterface #161 <Method Object Iterator.next()>
    //   25   51:checkcast       #163 <Class WeakReference>
    //   26   54:astore          4
    //   27   56:aload           4
    //   28   58:invokevirtual   #166 <Method Object WeakReference.get()>
    //   29   61:checkcast       #168 <Class MenuPresenter>
    //   30   64:astore          5
    //   31   66:aload           5
    //   32   68:ifnonnull       84
    //   33   71:aload_0         
    //   34   72:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   35   75:aload           4
    //   36   77:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   37   80:pop             
    //   38   81:goto            36
    //   39   84:aload           5
    //   40   86:aload_0         
    //   41   87:aload_1         
    //   42   88:invokeinterface #423 <Method boolean MenuPresenter.collapseItemActionView(MenuBuilder, MenuItemImpl)>
    //   43   93:istore_2        
    //   44   94:iload_2         
    //   45   95:ifeq            36
    //   46   98:aload_0         
    //   47   99:invokevirtual   #178 <Method void startDispatchingItemsChanged()>
    //   48  102:iload_2         
    //   49  103:ifeq            20
    //   50  106:aload_0         
    //   51  107:aconst_null     
    //   52  108:putfield        #402 <Field MenuItemImpl mExpandedItem>
    //   53  111:iload_2         
    //   54  112:ireturn         
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #393 <Field MenuBuilder$Callback mCallback>
    //    2    4:ifnull          23
    //    3    7:aload_0         
    //    4    8:getfield        #393 <Field MenuBuilder$Callback mCallback>
    //    5   11:aload_1         
    //    6   12:aload_2         
    //    7   13:invokeinterface #428 <Method boolean MenuBuilder$Callback.onMenuItemSelected(MenuBuilder, MenuItem)>
    //    8   18:ifeq            23
    //    9   21:iconst_1        
    //   10   22:ireturn         
    //   11   23:iconst_0        
    //   12   24:ireturn         
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #145 <Method boolean CopyOnWriteArrayList.isEmpty()>
    //    3    7:ifeq            14
    //    4   10:iconst_0        
    //    5   11:istore_2        
    //    6   12:iload_2         
    //    7   13:ireturn         
    //    8   14:iconst_0        
    //    9   15:istore_2        
    //   10   16:aload_0         
    //   11   17:invokevirtual   #148 <Method void stopDispatchingItemsChanged()>
    //   12   20:aload_0         
    //   13   21:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   14   24:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //   15   27:astore_3        
    //   16   28:aload_3         
    //   17   29:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   18   34:ifeq            90
    //   19   37:aload_3         
    //   20   38:invokeinterface #161 <Method Object Iterator.next()>
    //   21   43:checkcast       #163 <Class WeakReference>
    //   22   46:astore          4
    //   23   48:aload           4
    //   24   50:invokevirtual   #166 <Method Object WeakReference.get()>
    //   25   53:checkcast       #168 <Class MenuPresenter>
    //   26   56:astore          5
    //   27   58:aload           5
    //   28   60:ifnonnull       76
    //   29   63:aload_0         
    //   30   64:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   31   67:aload           4
    //   32   69:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   33   72:pop             
    //   34   73:goto            28
    //   35   76:aload           5
    //   36   78:aload_0         
    //   37   79:aload_1         
    //   38   80:invokeinterface #431 <Method boolean MenuPresenter.expandItemActionView(MenuBuilder, MenuItemImpl)>
    //   39   85:istore_2        
    //   40   86:iload_2         
    //   41   87:ifeq            28
    //   42   90:aload_0         
    //   43   91:invokevirtual   #178 <Method void startDispatchingItemsChanged()>
    //   44   94:iload_2         
    //   45   95:ifeq            12
    //   46   98:aload_0         
    //   47   99:aload_1         
    //   48  100:putfield        #402 <Field MenuItemImpl mExpandedItem>
    //   49  103:iload_2         
    //   50  104:ireturn         
    }

    public int findGroupIndex(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #435 <Method int findGroupIndex(int, int)>
    //    4    6:ireturn         
    }

    public int findGroupIndex(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #436 <Method int size()>
    //    2    4:istore_3        
    //    3    5:iload_2         
    //    4    6:ifge            11
    //    5    9:iconst_0        
    //    6   10:istore_2        
    //    7   11:iload_2         
    //    8   12:istore          4
    //    9   14:iload           4
    //   10   16:iload_3         
    //   11   17:icmpge          48
    //   12   20:aload_0         
    //   13   21:getfield        #98  <Field ArrayList mItems>
    //   14   24:iload           4
    //   15   26:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   16   29:checkcast       #120 <Class MenuItemImpl>
    //   17   32:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   18   35:iload_1         
    //   19   36:icmpne          42
    //   20   39:iload           4
    //   21   41:ireturn         
    //   22   42:iinc            4  1
    //   23   45:goto            14
    //   24   48:iconst_m1       
    //   25   49:ireturn         
    }

    public MenuItem findItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #436 <Method int size()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          72
    //    8   12:aload_0         
    //    9   13:getfield        #98  <Field ArrayList mItems>
    //   10   16:iload_3         
    //   11   17:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   12   20:checkcast       #120 <Class MenuItemImpl>
    //   13   23:astore          4
    //   14   25:aload           4
    //   15   27:invokevirtual   #443 <Method int MenuItemImpl.getItemId()>
    //   16   30:iload_1         
    //   17   31:icmpne          37
    //   18   34:aload           4
    //   19   36:areturn         
    //   20   37:aload           4
    //   21   39:invokevirtual   #446 <Method boolean MenuItemImpl.hasSubMenu()>
    //   22   42:ifeq            66
    //   23   45:aload           4
    //   24   47:invokevirtual   #450 <Method SubMenu MenuItemImpl.getSubMenu()>
    //   25   50:iload_1         
    //   26   51:invokeinterface #454 <Method MenuItem SubMenu.findItem(int)>
    //   27   56:astore          5
    //   28   58:aload           5
    //   29   60:ifnull          66
    //   30   63:aload           5
    //   31   65:areturn         
    //   32   66:iinc            3  1
    //   33   69:goto            7
    //   34   72:aconst_null     
    //   35   73:areturn         
    }

    public int findItemIndex(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #436 <Method int size()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          38
    //    8   12:aload_0         
    //    9   13:getfield        #98  <Field ArrayList mItems>
    //   10   16:iload_3         
    //   11   17:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   12   20:checkcast       #120 <Class MenuItemImpl>
    //   13   23:invokevirtual   #443 <Method int MenuItemImpl.getItemId()>
    //   14   26:iload_1         
    //   15   27:icmpne          32
    //   16   30:iload_3         
    //   17   31:ireturn         
    //   18   32:iinc            3  1
    //   19   35:goto            7
    //   20   38:iconst_m1       
    //   21   39:ireturn         
    }

    MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field ArrayList mTempShortcutItemList>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:invokevirtual   #408 <Method void ArrayList.clear()>
    //    5    9:aload_0         
    //    6   10:aload_3         
    //    7   11:iload_1         
    //    8   12:aload_2         
    //    9   13:invokevirtual   #461 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
    //   10   16:aload_3         
    //   11   17:invokevirtual   #462 <Method boolean ArrayList.isEmpty()>
    //   12   20:ifeq            25
    //   13   23:aconst_null     
    //   14   24:areturn         
    //   15   25:aload_2         
    //   16   26:invokevirtual   #467 <Method int KeyEvent.getMetaState()>
    //   17   29:istore          4
    //   18   31:new             #469 <Class android.view.KeyCharacterMap$KeyData>
    //   19   34:dup             
    //   20   35:invokespecial   #470 <Method void android.view.KeyCharacterMap$KeyData()>
    //   21   38:astore          5
    //   22   40:aload_2         
    //   23   41:aload           5
    //   24   43:invokevirtual   #474 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
    //   25   46:pop             
    //   26   47:aload_3         
    //   27   48:invokevirtual   #222 <Method int ArrayList.size()>
    //   28   51:istore          7
    //   29   53:iload           7
    //   30   55:iconst_1        
    //   31   56:icmpne          68
    //   32   59:aload_3         
    //   33   60:iconst_0        
    //   34   61:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   35   64:checkcast       #120 <Class MenuItemImpl>
    //   36   67:areturn         
    //   37   68:aload_0         
    //   38   69:invokevirtual   #477 <Method boolean isQwertyMode()>
    //   39   72:istore          8
    //   40   74:iconst_0        
    //   41   75:istore          9
    //   42   77:iload           9
    //   43   79:iload           7
    //   44   81:icmpge          23
    //   45   84:aload_3         
    //   46   85:iload           9
    //   47   87:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   48   90:checkcast       #120 <Class MenuItemImpl>
    //   49   93:astore          10
    //   50   95:iload           8
    //   51   97:ifeq            166
    //   52  100:aload           10
    //   53  102:invokevirtual   #481 <Method char MenuItemImpl.getAlphabeticShortcut()>
    //   54  105:istore          11
    //   55  107:iload           11
    //   56  109:aload           5
    //   57  111:getfield        #485 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
    //   58  114:iconst_0        
    //   59  115:caload          
    //   60  116:icmpne          126
    //   61  119:iload           4
    //   62  121:iconst_2        
    //   63  122:iand            
    //   64  123:ifeq            163
    //   65  126:iload           11
    //   66  128:aload           5
    //   67  130:getfield        #485 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
    //   68  133:iconst_2        
    //   69  134:caload          
    //   70  135:icmpne          145
    //   71  138:iload           4
    //   72  140:iconst_2        
    //   73  141:iand            
    //   74  142:ifne            163
    //   75  145:iload           8
    //   76  147:ifeq            176
    //   77  150:iload           11
    //   78  152:bipush          8
    //   79  154:icmpne          176
    //   80  157:iload_1         
    //   81  158:bipush          67
    //   82  160:icmpne          176
    //   83  163:aload           10
    //   84  165:areturn         
    //   85  166:aload           10
    //   86  168:invokevirtual   #488 <Method char MenuItemImpl.getNumericShortcut()>
    //   87  171:istore          11
    //   88  173:goto            107
    //   89  176:iinc            9  1
    //   90  179:goto            77
    }

    void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #477 <Method boolean isQwertyMode()>
    //    2    4:istore          4
    //    3    6:aload_3         
    //    4    7:invokevirtual   #467 <Method int KeyEvent.getMetaState()>
    //    5   10:istore          5
    //    6   12:new             #469 <Class android.view.KeyCharacterMap$KeyData>
    //    7   15:dup             
    //    8   16:invokespecial   #470 <Method void android.view.KeyCharacterMap$KeyData()>
    //    9   19:astore          6
    //   10   21:aload_3         
    //   11   22:aload           6
    //   12   24:invokevirtual   #474 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
    //   13   27:ifne            37
    //   14   30:iload_2         
    //   15   31:bipush          67
    //   16   33:icmpeq          37
    //   17   36:return          
    //   18   37:aload_0         
    //   19   38:getfield        #98  <Field ArrayList mItems>
    //   20   41:invokevirtual   #222 <Method int ArrayList.size()>
    //   21   44:istore          7
    //   22   46:iconst_0        
    //   23   47:istore          8
    //   24   49:iload           8
    //   25   51:iload           7
    //   26   53:icmpge          36
    //   27   56:aload_0         
    //   28   57:getfield        #98  <Field ArrayList mItems>
    //   29   60:iload           8
    //   30   62:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   31   65:checkcast       #120 <Class MenuItemImpl>
    //   32   68:astore          9
    //   33   70:aload           9
    //   34   72:invokevirtual   #446 <Method boolean MenuItemImpl.hasSubMenu()>
    //   35   75:ifeq            92
    //   36   78:aload           9
    //   37   80:invokevirtual   #450 <Method SubMenu MenuItemImpl.getSubMenu()>
    //   38   83:checkcast       #2   <Class MenuBuilder>
    //   39   86:aload_1         
    //   40   87:iload_2         
    //   41   88:aload_3         
    //   42   89:invokevirtual   #461 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
    //   43   92:iload           4
    //   44   94:ifeq            181
    //   45   97:aload           9
    //   46   99:invokevirtual   #481 <Method char MenuItemImpl.getAlphabeticShortcut()>
    //   47  102:istore          10
    //   48  104:iload           5
    //   49  106:iconst_5        
    //   50  107:iand            
    //   51  108:ifne            175
    //   52  111:iload           10
    //   53  113:ifeq            175
    //   54  116:iload           10
    //   55  118:aload           6
    //   56  120:getfield        #485 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
    //   57  123:iconst_0        
    //   58  124:caload          
    //   59  125:icmpeq          158
    //   60  128:iload           10
    //   61  130:aload           6
    //   62  132:getfield        #485 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
    //   63  135:iconst_2        
    //   64  136:caload          
    //   65  137:icmpeq          158
    //   66  140:iload           4
    //   67  142:ifeq            175
    //   68  145:iload           10
    //   69  147:bipush          8
    //   70  149:icmpne          175
    //   71  152:iload_2         
    //   72  153:bipush          67
    //   73  155:icmpne          175
    //   74  158:aload           9
    //   75  160:invokevirtual   #491 <Method boolean MenuItemImpl.isEnabled()>
    //   76  163:ifeq            175
    //   77  166:aload_1         
    //   78  167:aload           9
    //   79  169:invokeinterface #492 <Method boolean List.add(Object)>
    //   80  174:pop             
    //   81  175:iinc            8  1
    //   82  178:goto            49
    //   83  181:aload           9
    //   84  183:invokevirtual   #488 <Method char MenuItemImpl.getNumericShortcut()>
    //   85  186:istore          10
    //   86  188:goto            104
    }

    public void flagActionItems()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field boolean mIsActionItemsStale>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:iconst_0        
    //    5    9:istore_1        
    //    6   10:aload_0         
    //    7   11:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    8   14:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //    9   17:astore_2        
    //   10   18:aload_2         
    //   11   19:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //   12   24:ifeq            79
    //   13   27:aload_2         
    //   14   28:invokeinterface #161 <Method Object Iterator.next()>
    //   15   33:checkcast       #163 <Class WeakReference>
    //   16   36:astore          10
    //   17   38:aload           10
    //   18   40:invokevirtual   #166 <Method Object WeakReference.get()>
    //   19   43:checkcast       #168 <Class MenuPresenter>
    //   20   46:astore          11
    //   21   48:aload           11
    //   22   50:ifnonnull       66
    //   23   53:aload_0         
    //   24   54:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   25   57:aload           10
    //   26   59:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   27   62:pop             
    //   28   63:goto            18
    //   29   66:iload_1         
    //   30   67:aload           11
    //   31   69:invokeinterface #495 <Method boolean MenuPresenter.flagActionItems()>
    //   32   74:ior             
    //   33   75:istore_1        
    //   34   76:goto            18
    //   35   79:iload_1         
    //   36   80:ifeq            169
    //   37   83:aload_0         
    //   38   84:getfield        #104 <Field ArrayList mActionItems>
    //   39   87:invokevirtual   #408 <Method void ArrayList.clear()>
    //   40   90:aload_0         
    //   41   91:getfield        #106 <Field ArrayList mNonActionItems>
    //   42   94:invokevirtual   #408 <Method void ArrayList.clear()>
    //   43   97:aload_0         
    //   44   98:invokevirtual   #499 <Method ArrayList getVisibleItems()>
    //   45  101:astore          4
    //   46  103:aload           4
    //   47  105:invokevirtual   #222 <Method int ArrayList.size()>
    //   48  108:istore          5
    //   49  110:iconst_0        
    //   50  111:istore          6
    //   51  113:iload           6
    //   52  115:iload           5
    //   53  117:icmpge          195
    //   54  120:aload           4
    //   55  122:iload           6
    //   56  124:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   57  127:checkcast       #120 <Class MenuItemImpl>
    //   58  130:astore          7
    //   59  132:aload           7
    //   60  134:invokevirtual   #502 <Method boolean MenuItemImpl.isActionButton()>
    //   61  137:ifeq            156
    //   62  140:aload_0         
    //   63  141:getfield        #104 <Field ArrayList mActionItems>
    //   64  144:aload           7
    //   65  146:invokevirtual   #503 <Method boolean ArrayList.add(Object)>
    //   66  149:pop             
    //   67  150:iinc            6  1
    //   68  153:goto            113
    //   69  156:aload_0         
    //   70  157:getfield        #106 <Field ArrayList mNonActionItems>
    //   71  160:aload           7
    //   72  162:invokevirtual   #503 <Method boolean ArrayList.add(Object)>
    //   73  165:pop             
    //   74  166:goto            150
    //   75  169:aload_0         
    //   76  170:getfield        #104 <Field ArrayList mActionItems>
    //   77  173:invokevirtual   #408 <Method void ArrayList.clear()>
    //   78  176:aload_0         
    //   79  177:getfield        #106 <Field ArrayList mNonActionItems>
    //   80  180:invokevirtual   #408 <Method void ArrayList.clear()>
    //   81  183:aload_0         
    //   82  184:getfield        #106 <Field ArrayList mNonActionItems>
    //   83  187:aload_0         
    //   84  188:invokevirtual   #499 <Method ArrayList getVisibleItems()>
    //   85  191:invokevirtual   #507 <Method boolean ArrayList.addAll(java.util.Collection)>
    //   86  194:pop             
    //   87  195:aload_0         
    //   88  196:iconst_0        
    //   89  197:putfield        #108 <Field boolean mIsActionItemsStale>
    //   90  200:return          
    }

    ArrayList getActionItems()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #510 <Method void flagActionItems()>
    //    2    4:aload_0         
    //    3    5:getfield        #104 <Field ArrayList mActionItems>
    //    4    8:areturn         
    }

    protected String getActionViewStatesKey()
    {
    //    0    0:ldc1            #10  <String "android:menu:actionviewstates">
    //    1    2:areturn         
    }

    public Context getContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field Context mContext>
    //    2    4:areturn         
    }

    public MenuItemImpl getExpandedItem()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #402 <Field MenuItemImpl mExpandedItem>
    //    2    4:areturn         
    }

    public Drawable getHeaderIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #247 <Field Drawable mHeaderIcon>
    //    2    4:areturn         
    }

    public CharSequence getHeaderTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #245 <Field CharSequence mHeaderTitle>
    //    2    4:areturn         
    }

    public View getHeaderView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #243 <Field View mHeaderView>
    //    2    4:areturn         
    }

    public MenuItem getItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field ArrayList mItems>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //    4    8:checkcast       #355 <Class MenuItem>
    //    5   11:areturn         
    }

    ArrayList getNonActionItems()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #510 <Method void flagActionItems()>
    //    2    4:aload_0         
    //    3    5:getfield        #106 <Field ArrayList mNonActionItems>
    //    4    8:areturn         
    }

    boolean getOptionalIconsVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field boolean mOptionalIconsVisible>
    //    2    4:ireturn         
    }

    Resources getResources()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #96  <Field Resources mResources>
    //    2    4:areturn         
    }

    public MenuBuilder getRootMenu()
    {
    //    0    0:aload_0         
    //    1    1:areturn         
    }

    ArrayList getVisibleItems()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #102 <Field boolean mIsVisibleItemsStale>
    //    2    4:ifne            12
    //    3    7:aload_0         
    //    4    8:getfield        #100 <Field ArrayList mVisibleItems>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #100 <Field ArrayList mVisibleItems>
    //    8   16:invokevirtual   #408 <Method void ArrayList.clear()>
    //    9   19:aload_0         
    //   10   20:getfield        #98  <Field ArrayList mItems>
    //   11   23:invokevirtual   #222 <Method int ArrayList.size()>
    //   12   26:istore_1        
    //   13   27:iconst_0        
    //   14   28:istore_2        
    //   15   29:iload_2         
    //   16   30:iload_1         
    //   17   31:icmpge          68
    //   18   34:aload_0         
    //   19   35:getfield        #98  <Field ArrayList mItems>
    //   20   38:iload_2         
    //   21   39:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   22   42:checkcast       #120 <Class MenuItemImpl>
    //   23   45:astore_3        
    //   24   46:aload_3         
    //   25   47:invokevirtual   #530 <Method boolean MenuItemImpl.isVisible()>
    //   26   50:ifeq            62
    //   27   53:aload_0         
    //   28   54:getfield        #100 <Field ArrayList mVisibleItems>
    //   29   57:aload_3         
    //   30   58:invokevirtual   #503 <Method boolean ArrayList.add(Object)>
    //   31   61:pop             
    //   32   62:iinc            2  1
    //   33   65:goto            29
    //   34   68:aload_0         
    //   35   69:iconst_0        
    //   36   70:putfield        #102 <Field boolean mIsVisibleItemsStale>
    //   37   73:aload_0         
    //   38   74:iconst_1        
    //   39   75:putfield        #108 <Field boolean mIsActionItemsStale>
    //   40   78:aload_0         
    //   41   79:getfield        #100 <Field ArrayList mVisibleItems>
    //   42   82:areturn         
    }

    public boolean hasVisibleItems()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #436 <Method int size()>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:iload_1         
    //    7    9:icmpge          37
    //    8   12:aload_0         
    //    9   13:getfield        #98  <Field ArrayList mItems>
    //   10   16:iload_2         
    //   11   17:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   12   20:checkcast       #120 <Class MenuItemImpl>
    //   13   23:invokevirtual   #530 <Method boolean MenuItemImpl.isVisible()>
    //   14   26:ifeq            31
    //   15   29:iconst_1        
    //   16   30:ireturn         
    //   17   31:iinc            2  1
    //   18   34:goto            7
    //   19   37:iconst_0        
    //   20   38:ireturn         
    }

    boolean isQwertyMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #533 <Field boolean mQwertyMode>
    //    2    4:ireturn         
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #537 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
    //    4    6:ifnull          11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iconst_0        
    //    8   12:ireturn         
    }

    public boolean isShortcutsVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #277 <Field boolean mShortcutsVisible>
    //    2    4:ireturn         
    }

    void onItemActionRequestChanged(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #108 <Field boolean mIsActionItemsStale>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //    6   10:return          
    }

    void onItemVisibleChanged(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #102 <Field boolean mIsVisibleItemsStale>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //    6   10:return          
    }

    void onItemsChanged(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    2    4:ifne            27
    //    3    7:iload_1         
    //    4    8:ifeq            21
    //    5   11:aload_0         
    //    6   12:iconst_1        
    //    7   13:putfield        #102 <Field boolean mIsVisibleItemsStale>
    //    8   16:aload_0         
    //    9   17:iconst_1        
    //   10   18:putfield        #108 <Field boolean mIsActionItemsStale>
    //   11   21:aload_0         
    //   12   22:iload_1         
    //   13   23:invokespecial   #543 <Method void dispatchPresenterUpdate(boolean)>
    //   14   26:return          
    //   15   27:aload_0         
    //   16   28:iconst_1        
    //   17   29:putfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //   18   32:return          
    }

    public boolean performIdentifierAction(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:iload_1         
    //    3    3:invokevirtual   #546 <Method MenuItem findItem(int)>
    //    4    6:iload_2         
    //    5    7:invokevirtual   #550 <Method boolean performItemAction(MenuItem, int)>
    //    6   10:ireturn         
    }

    public boolean performItemAction(MenuItem menuitem, int i)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #120 <Class MenuItemImpl>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:ifnull          16
    //    5    9:aload_3         
    //    6   10:invokevirtual   #491 <Method boolean MenuItemImpl.isEnabled()>
    //    7   13:ifne            22
    //    8   16:iconst_0        
    //    9   17:istore          4
    //   10   19:iload           4
    //   11   21:ireturn         
    //   12   22:aload_3         
    //   13   23:invokevirtual   #553 <Method boolean MenuItemImpl.invoke()>
    //   14   26:istore          4
    //   15   28:aload_3         
    //   16   29:invokevirtual   #557 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
    //   17   32:astore          5
    //   18   34:aload           5
    //   19   36:ifnull          79
    //   20   39:aload           5
    //   21   41:invokevirtual   #560 <Method boolean ActionProvider.hasSubMenu()>
    //   22   44:ifeq            79
    //   23   47:iconst_1        
    //   24   48:istore          6
    //   25   50:aload_3         
    //   26   51:invokevirtual   #563 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
    //   27   54:ifeq            85
    //   28   57:iload           4
    //   29   59:aload_3         
    //   30   60:invokevirtual   #566 <Method boolean MenuItemImpl.expandActionView()>
    //   31   63:ior             
    //   32   64:istore          4
    //   33   66:iload           4
    //   34   68:ifeq            19
    //   35   71:aload_0         
    //   36   72:iconst_1        
    //   37   73:invokevirtual   #416 <Method void close(boolean)>
    //   38   76:iload           4
    //   39   78:ireturn         
    //   40   79:iconst_0        
    //   41   80:istore          6
    //   42   82:goto            50
    //   43   85:aload_3         
    //   44   86:invokevirtual   #446 <Method boolean MenuItemImpl.hasSubMenu()>
    //   45   89:ifne            97
    //   46   92:iload           6
    //   47   94:ifeq            171
    //   48   97:aload_0         
    //   49   98:iconst_0        
    //   50   99:invokevirtual   #416 <Method void close(boolean)>
    //   51  102:aload_3         
    //   52  103:invokevirtual   #446 <Method boolean MenuItemImpl.hasSubMenu()>
    //   53  106:ifne            126
    //   54  109:aload_3         
    //   55  110:new             #382 <Class SubMenuBuilder>
    //   56  113:dup             
    //   57  114:aload_0         
    //   58  115:invokevirtual   #568 <Method Context getContext()>
    //   59  118:aload_0         
    //   60  119:aload_3         
    //   61  120:invokespecial   #385 <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
    //   62  123:invokevirtual   #389 <Method void MenuItemImpl.setSubMenu(SubMenuBuilder)>
    //   63  126:aload_3         
    //   64  127:invokevirtual   #450 <Method SubMenu MenuItemImpl.getSubMenu()>
    //   65  130:checkcast       #382 <Class SubMenuBuilder>
    //   66  133:astore          7
    //   67  135:iload           6
    //   68  137:ifeq            147
    //   69  140:aload           5
    //   70  142:aload           7
    //   71  144:invokevirtual   #572 <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
    //   72  147:iload           4
    //   73  149:aload_0         
    //   74  150:aload           7
    //   75  152:invokespecial   #574 <Method boolean dispatchSubMenuSelected(SubMenuBuilder)>
    //   76  155:ior             
    //   77  156:istore          4
    //   78  158:iload           4
    //   79  160:ifne            19
    //   80  163:aload_0         
    //   81  164:iconst_1        
    //   82  165:invokevirtual   #416 <Method void close(boolean)>
    //   83  168:iload           4
    //   84  170:ireturn         
    //   85  171:iload_2         
    //   86  172:iconst_1        
    //   87  173:iand            
    //   88  174:ifne            19
    //   89  177:aload_0         
    //   90  178:iconst_1        
    //   91  179:invokevirtual   #416 <Method void close(boolean)>
    //   92  182:iload           4
    //   93  184:ireturn         
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #537 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
    //    4    6:astore          4
    //    5    8:iconst_0        
    //    6    9:istore          5
    //    7   11:aload           4
    //    8   13:ifnull          25
    //    9   16:aload_0         
    //   10   17:aload           4
    //   11   19:iload_3         
    //   12   20:invokevirtual   #550 <Method boolean performItemAction(MenuItem, int)>
    //   13   23:istore          5
    //   14   25:iload_3         
    //   15   26:iconst_2        
    //   16   27:iand            
    //   17   28:ifeq            36
    //   18   31:aload_0         
    //   19   32:iconst_1        
    //   20   33:invokevirtual   #416 <Method void close(boolean)>
    //   21   36:iload           5
    //   22   38:ireturn         
    }

    public void removeGroup(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #578 <Method int findGroupIndex(int)>
    //    3    5:istore_2        
    //    4    6:iload_2         
    //    5    7:iflt            71
    //    6   10:aload_0         
    //    7   11:getfield        #98  <Field ArrayList mItems>
    //    8   14:invokevirtual   #222 <Method int ArrayList.size()>
    //    9   17:iload_2         
    //   10   18:isub            
    //   11   19:istore_3        
    //   12   20:iconst_0        
    //   13   21:istore          4
    //   14   23:iload           4
    //   15   25:iconst_1        
    //   16   26:iadd            
    //   17   27:istore          5
    //   18   29:iload           4
    //   19   31:iload_3         
    //   20   32:icmpge          66
    //   21   35:aload_0         
    //   22   36:getfield        #98  <Field ArrayList mItems>
    //   23   39:iload_2         
    //   24   40:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   25   43:checkcast       #120 <Class MenuItemImpl>
    //   26   46:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   27   49:iload_1         
    //   28   50:icmpne          66
    //   29   53:aload_0         
    //   30   54:iload_2         
    //   31   55:iconst_0        
    //   32   56:invokespecial   #580 <Method void removeItemAtInt(int, boolean)>
    //   33   59:iload           5
    //   34   61:istore          4
    //   35   63:goto            23
    //   36   66:aload_0         
    //   37   67:iconst_1        
    //   38   68:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   39   71:return          
    }

    public void removeItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:iload_1         
    //    3    3:invokevirtual   #583 <Method int findItemIndex(int)>
    //    4    6:iconst_1        
    //    5    7:invokespecial   #580 <Method void removeItemAtInt(int, boolean)>
    //    6   10:return          
    }

    public void removeItemAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_1        
    //    3    3:invokespecial   #580 <Method void removeItemAtInt(int, boolean)>
    //    4    6:return          
    }

    public void removeMenuPresenter(MenuPresenter menupresenter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //    2    4:invokevirtual   #152 <Method Iterator CopyOnWriteArrayList.iterator()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:invokeinterface #157 <Method boolean Iterator.hasNext()>
    //    6   14:ifeq            59
    //    7   17:aload_2         
    //    8   18:invokeinterface #161 <Method Object Iterator.next()>
    //    9   23:checkcast       #163 <Class WeakReference>
    //   10   26:astore_3        
    //   11   27:aload_3         
    //   12   28:invokevirtual   #166 <Method Object WeakReference.get()>
    //   13   31:checkcast       #168 <Class MenuPresenter>
    //   14   34:astore          4
    //   15   36:aload           4
    //   16   38:ifnull          47
    //   17   41:aload           4
    //   18   43:aload_1         
    //   19   44:if_acmpne       8
    //   20   47:aload_0         
    //   21   48:getfield        #86  <Field CopyOnWriteArrayList mPresenters>
    //   22   51:aload_3         
    //   23   52:invokevirtual   #172 <Method boolean CopyOnWriteArrayList.remove(Object)>
    //   24   55:pop             
    //   25   56:goto            8
    //   26   59:return          
    }

    public void restoreActionViewStates(Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       5
    //    2    4:return          
    //    3    5:aload_1         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #588 <Method String getActionViewStatesKey()>
    //    6   10:invokevirtual   #186 <Method SparseArray Bundle.getSparseParcelableArray(String)>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:invokevirtual   #436 <Method int size()>
    //   10   18:istore_3        
    //   11   19:iconst_0        
    //   12   20:istore          4
    //   13   22:iload           4
    //   14   24:iload_3         
    //   15   25:icmpge          93
    //   16   28:aload_0         
    //   17   29:iload           4
    //   18   31:invokevirtual   #590 <Method MenuItem getItem(int)>
    //   19   34:astore          8
    //   20   36:aload           8
    //   21   38:invokestatic    #596 <Method View MenuItemCompat.getActionView(MenuItem)>
    //   22   41:astore          9
    //   23   43:aload           9
    //   24   45:ifnull          63
    //   25   48:aload           9
    //   26   50:invokevirtual   #599 <Method int View.getId()>
    //   27   53:iconst_m1       
    //   28   54:icmpeq          63
    //   29   57:aload           9
    //   30   59:aload_2         
    //   31   60:invokevirtual   #603 <Method void View.restoreHierarchyState(SparseArray)>
    //   32   63:aload           8
    //   33   65:invokeinterface #604 <Method boolean MenuItem.hasSubMenu()>
    //   34   70:ifeq            87
    //   35   73:aload           8
    //   36   75:invokeinterface #605 <Method SubMenu MenuItem.getSubMenu()>
    //   37   80:checkcast       #382 <Class SubMenuBuilder>
    //   38   83:aload_1         
    //   39   84:invokevirtual   #607 <Method void SubMenuBuilder.restoreActionViewStates(Bundle)>
    //   40   87:iinc            4  1
    //   41   90:goto            22
    //   42   93:aload_1         
    //   43   94:ldc1            #13  <String "android:menu:expandedactionview">
    //   44   96:invokevirtual   #611 <Method int Bundle.getInt(String)>
    //   45   99:istore          5
    //   46  101:iload           5
    //   47  103:ifle            4
    //   48  106:aload_0         
    //   49  107:iload           5
    //   50  109:invokevirtual   #546 <Method MenuItem findItem(int)>
    //   51  112:astore          6
    //   52  114:aload           6
    //   53  116:ifnull          4
    //   54  119:aload           6
    //   55  121:invokestatic    #614 <Method boolean MenuItemCompat.expandActionView(MenuItem)>
    //   56  124:pop             
    //   57  125:return          
    }

    public void restorePresenterStates(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #617 <Method void dispatchRestoreInstanceState(Bundle)>
    //    3    5:return          
    }

    public void saveActionViewStates(Bundle bundle)
    {
    //    0    0:aconst_null     
    //    1    1:astore_2        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #436 <Method int size()>
    //    4    6:istore_3        
    //    5    7:iconst_0        
    //    6    8:istore          4
    //    7   10:iload           4
    //    8   12:iload_3         
    //    9   13:icmpge          114
    //   10   16:aload_0         
    //   11   17:iload           4
    //   12   19:invokevirtual   #590 <Method MenuItem getItem(int)>
    //   13   22:astore          5
    //   14   24:aload           5
    //   15   26:invokestatic    #596 <Method View MenuItemCompat.getActionView(MenuItem)>
    //   16   29:astore          6
    //   17   31:aload           6
    //   18   33:ifnull          84
    //   19   36:aload           6
    //   20   38:invokevirtual   #599 <Method int View.getId()>
    //   21   41:iconst_m1       
    //   22   42:icmpeq          84
    //   23   45:aload_2         
    //   24   46:ifnonnull       57
    //   25   49:new             #192 <Class SparseArray>
    //   26   52:dup             
    //   27   53:invokespecial   #203 <Method void SparseArray()>
    //   28   56:astore_2        
    //   29   57:aload           6
    //   30   59:aload_2         
    //   31   60:invokevirtual   #621 <Method void View.saveHierarchyState(SparseArray)>
    //   32   63:aload           5
    //   33   65:invokestatic    #624 <Method boolean MenuItemCompat.isActionViewExpanded(MenuItem)>
    //   34   68:ifeq            84
    //   35   71:aload_1         
    //   36   72:ldc1            #13  <String "android:menu:expandedactionview">
    //   37   74:aload           5
    //   38   76:invokeinterface #625 <Method int MenuItem.getItemId()>
    //   39   81:invokevirtual   #629 <Method void Bundle.putInt(String, int)>
    //   40   84:aload           5
    //   41   86:invokeinterface #604 <Method boolean MenuItem.hasSubMenu()>
    //   42   91:ifeq            108
    //   43   94:aload           5
    //   44   96:invokeinterface #605 <Method SubMenu MenuItem.getSubMenu()>
    //   45  101:checkcast       #382 <Class SubMenuBuilder>
    //   46  104:aload_1         
    //   47  105:invokevirtual   #631 <Method void SubMenuBuilder.saveActionViewStates(Bundle)>
    //   48  108:iinc            4  1
    //   49  111:goto            10
    //   50  114:aload_2         
    //   51  115:ifnull          127
    //   52  118:aload_1         
    //   53  119:aload_0         
    //   54  120:invokevirtual   #588 <Method String getActionViewStatesKey()>
    //   55  123:aload_2         
    //   56  124:invokevirtual   #214 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
    //   57  127:return          
    }

    public void savePresenterStates(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #634 <Method void dispatchSaveInstanceState(Bundle)>
    //    3    5:return          
    }

    public void setCallback(Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #393 <Field MenuBuilder$Callback mCallback>
    //    3    5:return          
    }

    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #125 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
    //    3    5:return          
    }

    public MenuBuilder setDefaultShowAsAction(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #68  <Field int mDefaultShowAsAction>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    void setExclusiveItemChecked(MenuItem menuitem)
    {
    //    0    0:aload_1         
    //    1    1:invokeinterface #642 <Method int MenuItem.getGroupId()>
    //    2    6:istore_2        
    //    3    7:aload_0         
    //    4    8:getfield        #98  <Field ArrayList mItems>
    //    5   11:invokevirtual   #222 <Method int ArrayList.size()>
    //    6   14:istore_3        
    //    7   15:iconst_0        
    //    8   16:istore          4
    //    9   18:iload           4
    //   10   20:iload_3         
    //   11   21:icmpge          94
    //   12   24:aload_0         
    //   13   25:getfield        #98  <Field ArrayList mItems>
    //   14   28:iload           4
    //   15   30:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   16   33:checkcast       #120 <Class MenuItemImpl>
    //   17   36:astore          5
    //   18   38:aload           5
    //   19   40:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   20   43:iload_2         
    //   21   44:icmpne          55
    //   22   47:aload           5
    //   23   49:invokevirtual   #645 <Method boolean MenuItemImpl.isExclusiveCheckable()>
    //   24   52:ifne            61
    //   25   55:iinc            4  1
    //   26   58:goto            18
    //   27   61:aload           5
    //   28   63:invokevirtual   #648 <Method boolean MenuItemImpl.isCheckable()>
    //   29   66:ifeq            55
    //   30   69:aload           5
    //   31   71:aload_1         
    //   32   72:if_acmpne       88
    //   33   75:iconst_1        
    //   34   76:istore          6
    //   35   78:aload           5
    //   36   80:iload           6
    //   37   82:invokevirtual   #651 <Method void MenuItemImpl.setCheckedInt(boolean)>
    //   38   85:goto            55
    //   39   88:iconst_0        
    //   40   89:istore          6
    //   41   91:goto            78
    //   42   94:return          
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field ArrayList mItems>
    //    2    4:invokevirtual   #222 <Method int ArrayList.size()>
    //    3    7:istore          4
    //    4    9:iconst_0        
    //    5   10:istore          5
    //    6   12:iload           5
    //    7   14:iload           4
    //    8   16:icmpge          61
    //    9   19:aload_0         
    //   10   20:getfield        #98  <Field ArrayList mItems>
    //   11   23:iload           5
    //   12   25:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   13   28:checkcast       #120 <Class MenuItemImpl>
    //   14   31:astore          6
    //   15   33:aload           6
    //   16   35:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   17   38:iload_1         
    //   18   39:icmpne          55
    //   19   42:aload           6
    //   20   44:iload_3         
    //   21   45:invokevirtual   #656 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
    //   22   48:aload           6
    //   23   50:iload_2         
    //   24   51:invokevirtual   #660 <Method MenuItem MenuItemImpl.setCheckable(boolean)>
    //   25   54:pop             
    //   26   55:iinc            5  1
    //   27   58:goto            12
    //   28   61:return          
    }

    public void setGroupEnabled(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field ArrayList mItems>
    //    2    4:invokevirtual   #222 <Method int ArrayList.size()>
    //    3    7:istore_3        
    //    4    8:iconst_0        
    //    5    9:istore          4
    //    6   11:iload           4
    //    7   13:iload_3         
    //    8   14:icmpge          53
    //    9   17:aload_0         
    //   10   18:getfield        #98  <Field ArrayList mItems>
    //   11   21:iload           4
    //   12   23:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   13   26:checkcast       #120 <Class MenuItemImpl>
    //   14   29:astore          5
    //   15   31:aload           5
    //   16   33:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   17   36:iload_1         
    //   18   37:icmpne          47
    //   19   40:aload           5
    //   20   42:iload_2         
    //   21   43:invokevirtual   #664 <Method MenuItem MenuItemImpl.setEnabled(boolean)>
    //   22   46:pop             
    //   23   47:iinc            4  1
    //   24   50:goto            11
    //   25   53:return          
    }

    public void setGroupVisible(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field ArrayList mItems>
    //    2    4:invokevirtual   #222 <Method int ArrayList.size()>
    //    3    7:istore_3        
    //    4    8:iconst_0        
    //    5    9:istore          4
    //    6   11:iconst_0        
    //    7   12:istore          5
    //    8   14:iload           5
    //    9   16:iload_3         
    //   10   17:icmpge          61
    //   11   20:aload_0         
    //   12   21:getfield        #98  <Field ArrayList mItems>
    //   13   24:iload           5
    //   14   26:invokevirtual   #223 <Method Object ArrayList.get(int)>
    //   15   29:checkcast       #120 <Class MenuItemImpl>
    //   16   32:astore          6
    //   17   34:aload           6
    //   18   36:invokevirtual   #439 <Method int MenuItemImpl.getGroupId()>
    //   19   39:iload_1         
    //   20   40:icmpne          55
    //   21   43:aload           6
    //   22   45:iload_2         
    //   23   46:invokevirtual   #669 <Method boolean MenuItemImpl.setVisibleInt(boolean)>
    //   24   49:ifeq            55
    //   25   52:iconst_1        
    //   26   53:istore          4
    //   27   55:iinc            5  1
    //   28   58:goto            14
    //   29   61:iload           4
    //   30   63:ifeq            71
    //   31   66:aload_0         
    //   32   67:iconst_1        
    //   33   68:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   34   71:return          
    }

    protected MenuBuilder setHeaderIconInt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aconst_null     
    //    3    3:iload_1         
    //    4    4:aconst_null     
    //    5    5:aconst_null     
    //    6    6:invokespecial   #672 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
    //    7    9:aload_0         
    //    8   10:areturn         
    }

    protected MenuBuilder setHeaderIconInt(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aconst_null     
    //    3    3:iconst_0        
    //    4    4:aload_1         
    //    5    5:aconst_null     
    //    6    6:invokespecial   #672 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
    //    7    9:aload_0         
    //    8   10:areturn         
    }

    protected MenuBuilder setHeaderTitleInt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aconst_null     
    //    3    3:iconst_0        
    //    4    4:aconst_null     
    //    5    5:aconst_null     
    //    6    6:invokespecial   #672 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
    //    7    9:aload_0         
    //    8   10:areturn         
    }

    protected MenuBuilder setHeaderTitleInt(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aload_1         
    //    3    3:iconst_0        
    //    4    4:aconst_null     
    //    5    5:aconst_null     
    //    6    6:invokespecial   #672 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
    //    7    9:aload_0         
    //    8   10:areturn         
    }

    protected MenuBuilder setHeaderViewInt(View view)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aconst_null     
    //    3    3:iconst_0        
    //    4    4:aconst_null     
    //    5    5:aload_1         
    //    6    6:invokespecial   #672 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
    //    7    9:aload_0         
    //    8   10:areturn         
    }

    void setOptionalIconsVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #74  <Field boolean mOptionalIconsVisible>
    //    3    5:return          
    }

    public void setQwertyMode(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #533 <Field boolean mQwertyMode>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //    6   10:return          
    }

    public void setShortcutsVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #277 <Field boolean mShortcutsVisible>
    //    2    4:iload_1         
    //    3    5:icmpne          9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:iload_1         
    //    7   11:invokespecial   #112 <Method void setShortcutsVisibleInner(boolean)>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   11   19:return          
    }

    public int size()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field ArrayList mItems>
    //    2    4:invokevirtual   #222 <Method int ArrayList.size()>
    //    3    7:ireturn         
    }

    public void startDispatchingItemsChanged()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    3    5:aload_0         
    //    4    6:getfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //    5    9:ifeq            22
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:putfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //    9   17:aload_0         
    //   10   18:iconst_1        
    //   11   19:invokevirtual   #140 <Method void onItemsChanged(boolean)>
    //   12   22:return          
    }

    public void stopDispatchingItemsChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    2    4:ifne            17
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #70  <Field boolean mPreventDispatchingItemsChanged>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:putfield        #72  <Field boolean mItemsChangedWhileDispatchPrevented>
    //    9   17:return          
    }

    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int sCategoryToOrder[];
    private ArrayList mActionItems;
    private Callback mCallback;
    private final Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;
}
