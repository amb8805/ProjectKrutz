// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuBuilder, SubMenuBuilder

public final class MenuItemImpl
    implements SupportMenuItem
{

    MenuItemImpl(MenuBuilder menubuilder, int i, int j, int k, int l, CharSequence charsequence, int i1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #71  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #73  <Field int mIconResId>
    //    5    9:aload_0         
    //    6   10:bipush          16
    //    7   12:putfield        #75  <Field int mFlags>
    //    8   15:aload_0         
    //    9   16:iconst_0        
    //   10   17:putfield        #77  <Field int mShowAsAction>
    //   11   20:aload_0         
    //   12   21:iconst_0        
    //   13   22:putfield        #79  <Field boolean mIsActionViewExpanded>
    //   14   25:aload_0         
    //   15   26:aload_1         
    //   16   27:putfield        #81  <Field MenuBuilder mMenu>
    //   17   30:aload_0         
    //   18   31:iload_3         
    //   19   32:putfield        #83  <Field int mId>
    //   20   35:aload_0         
    //   21   36:iload_2         
    //   22   37:putfield        #85  <Field int mGroup>
    //   23   40:aload_0         
    //   24   41:iload           4
    //   25   43:putfield        #87  <Field int mCategoryOrder>
    //   26   46:aload_0         
    //   27   47:iload           5
    //   28   49:putfield        #89  <Field int mOrdering>
    //   29   52:aload_0         
    //   30   53:aload           6
    //   31   55:putfield        #91  <Field CharSequence mTitle>
    //   32   58:aload_0         
    //   33   59:iload           7
    //   34   61:putfield        #77  <Field int mShowAsAction>
    //   35   64:return          
    }

    static MenuBuilder access$000(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #81  <Field MenuBuilder mMenu>
    //    5    4:areturn         
    }

    public void actionFormatChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #100 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
    //    4    8:return          
    }

    public boolean collapseActionView()
    {
    //    0    0:bipush          8
    //    1    2:aload_0         
    //    2    3:getfield        #77  <Field int mShowAsAction>
    //    3    6:iand            
    //    4    7:ifne            12
    //    5   10:iconst_0        
    //    6   11:ireturn         
    //    7   12:aload_0         
    //    8   13:getfield        #104 <Field View mActionView>
    //    9   16:ifnonnull       21
    //   10   19:iconst_1        
    //   11   20:ireturn         
    //   12   21:aload_0         
    //   13   22:getfield        #106 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener mOnActionExpandListener>
    //   14   25:ifnull          41
    //   15   28:aload_0         
    //   16   29:getfield        #106 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener mOnActionExpandListener>
    //   17   32:aload_0         
    //   18   33:invokeinterface #112 <Method boolean android.support.v4.view.MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
    //   19   38:ifeq            10
    //   20   41:aload_0         
    //   21   42:getfield        #81  <Field MenuBuilder mMenu>
    //   22   45:aload_0         
    //   23   46:invokevirtual   #116 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
    //   24   49:ireturn         
    }

    public boolean expandActionView()
    {
    //    0    0:bipush          8
    //    1    2:aload_0         
    //    2    3:getfield        #77  <Field int mShowAsAction>
    //    3    6:iand            
    //    4    7:ifeq            17
    //    5   10:aload_0         
    //    6   11:getfield        #104 <Field View mActionView>
    //    7   14:ifnonnull       19
    //    8   17:iconst_0        
    //    9   18:ireturn         
    //   10   19:aload_0         
    //   11   20:getfield        #106 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener mOnActionExpandListener>
    //   12   23:ifnull          39
    //   13   26:aload_0         
    //   14   27:getfield        #106 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener mOnActionExpandListener>
    //   15   30:aload_0         
    //   16   31:invokeinterface #120 <Method boolean android.support.v4.view.MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
    //   17   36:ifeq            17
    //   18   39:aload_0         
    //   19   40:getfield        #81  <Field MenuBuilder mMenu>
    //   20   43:aload_0         
    //   21   44:invokevirtual   #123 <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
    //   22   47:ireturn         
    }

    public android.view.ActionProvider getActionProvider()
    {
    //    0    0:new             #127 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #129 <String "Implementation should use getSupportActionProvider!">
    //    3    6:invokespecial   #132 <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public View getActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field View mActionView>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #104 <Field View mActionView>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #136 <Field ActionProvider mActionProvider>
    //    8   16:ifnull          36
    //    9   19:aload_0         
    //   10   20:aload_0         
    //   11   21:getfield        #136 <Field ActionProvider mActionProvider>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #142 <Method View ActionProvider.onCreateActionView(MenuItem)>
    //   14   28:putfield        #104 <Field View mActionView>
    //   15   31:aload_0         
    //   16   32:getfield        #104 <Field View mActionView>
    //   17   35:areturn         
    //   18   36:aconst_null     
    //   19   37:areturn         
    }

    public char getAlphabeticShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field char mShortcutAlphabeticChar>
    //    2    4:ireturn         
    }

    Runnable getCallback()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #150 <Field Runnable mItemCallback>
    //    2    4:areturn         
    }

    public int getGroupId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field int mGroup>
    //    2    4:ireturn         
    }

    public Drawable getIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #156 <Field Drawable mIconDrawable>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #156 <Field Drawable mIconDrawable>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #73  <Field int mIconResId>
    //    8   16:ifeq            46
    //    9   19:aload_0         
    //   10   20:getfield        #81  <Field MenuBuilder mMenu>
    //   11   23:invokevirtual   #160 <Method Resources MenuBuilder.getResources()>
    //   12   26:aload_0         
    //   13   27:getfield        #73  <Field int mIconResId>
    //   14   30:invokevirtual   #166 <Method Drawable Resources.getDrawable(int)>
    //   15   33:astore_1        
    //   16   34:aload_0         
    //   17   35:iconst_0        
    //   18   36:putfield        #73  <Field int mIconResId>
    //   19   39:aload_0         
    //   20   40:aload_1         
    //   21   41:putfield        #156 <Field Drawable mIconDrawable>
    //   22   44:aload_1         
    //   23   45:areturn         
    //   24   46:aconst_null     
    //   25   47:areturn         
    }

    public Intent getIntent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field Intent mIntent>
    //    2    4:areturn         
    }

    public int getItemId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field int mId>
    //    2    4:ireturn         
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #176 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
    //    2    4:areturn         
    }

    public char getNumericShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #179 <Field char mShortcutNumericChar>
    //    2    4:ireturn         
    }

    public int getOrder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field int mCategoryOrder>
    //    2    4:ireturn         
    }

    public int getOrdering()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field int mOrdering>
    //    2    4:ireturn         
    }

    char getShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field char mShortcutAlphabeticChar>
    //    2    4:ireturn         
    }

    String getShortcutLabel()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #186 <Method char getShortcut()>
    //    2    4:istore_1        
    //    3    5:iload_1         
    //    4    6:ifne            12
    //    5    9:ldc1            #188 <String "">
    //    6   11:areturn         
    //    7   12:new             #190 <Class StringBuilder>
    //    8   15:dup             
    //    9   16:getstatic       #192 <Field String sPrependShortcutLabel>
    //   10   19:invokespecial   #193 <Method void StringBuilder(String)>
    //   11   22:astore_2        
    //   12   23:iload_1         
    //   13   24:lookupswitch    3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93
    //   14   60:aload_2         
    //   15   61:iload_1         
    //   16   62:invokevirtual   #197 <Method StringBuilder StringBuilder.append(char)>
    //   17   65:pop             
    //   18   66:aload_2         
    //   19   67:invokevirtual   #200 <Method String StringBuilder.toString()>
    //   20   70:areturn         
    //   21   71:aload_2         
    //   22   72:getstatic       #202 <Field String sEnterShortcutLabel>
    //   23   75:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
    //   24   78:pop             
    //   25   79:goto            66
    //   26   82:aload_2         
    //   27   83:getstatic       #207 <Field String sDeleteShortcutLabel>
    //   28   86:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
    //   29   89:pop             
    //   30   90:goto            66
    //   31   93:aload_2         
    //   32   94:getstatic       #209 <Field String sSpaceShortcutLabel>
    //   33   97:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
    //   34  100:pop             
    //   35  101:goto            66
    }

    public SubMenu getSubMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #213 <Field SubMenuBuilder mSubMenu>
    //    2    4:areturn         
    }

    public ActionProvider getSupportActionProvider()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #136 <Field ActionProvider mActionProvider>
    //    2    4:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field CharSequence mTitle>
    //    2    4:areturn         
    }

    public CharSequence getTitleCondensed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field CharSequence mTitleCondensed>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #220 <Field CharSequence mTitleCondensed>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #91  <Field CharSequence mTitle>
    //    8   16:areturn         
    }

    CharSequence getTitleForItemView(MenuView.ItemView itemview)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          18
    //    2    4:aload_1         
    //    3    5:invokeinterface #227 <Method boolean MenuView$ItemView.prefersCondensedTitle()>
    //    4   10:ifeq            18
    //    5   13:aload_0         
    //    6   14:invokevirtual   #229 <Method CharSequence getTitleCondensed()>
    //    7   17:areturn         
    //    8   18:aload_0         
    //    9   19:invokevirtual   #231 <Method CharSequence getTitle()>
    //   10   22:areturn         
    }

    public boolean hasCollapsibleActionView()
    {
    //    0    0:bipush          8
    //    1    2:aload_0         
    //    2    3:getfield        #77  <Field int mShowAsAction>
    //    3    6:iand            
    //    4    7:ifeq            19
    //    5   10:aload_0         
    //    6   11:getfield        #104 <Field View mActionView>
    //    7   14:ifnull          19
    //    8   17:iconst_1        
    //    9   18:ireturn         
    //   10   19:iconst_0        
    //   11   20:ireturn         
    }

    public boolean hasSubMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #213 <Field SubMenuBuilder mSubMenu>
    //    2    4:ifnull          9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public boolean invoke()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #238 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    2    4:ifnull          22
    //    3    7:aload_0         
    //    4    8:getfield        #238 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    5   11:aload_0         
    //    6   12:invokeinterface #243 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
    //    7   17:ifeq            22
    //    8   20:iconst_1        
    //    9   21:ireturn         
    //   10   22:aload_0         
    //   11   23:getfield        #81  <Field MenuBuilder mMenu>
    //   12   26:aload_0         
    //   13   27:getfield        #81  <Field MenuBuilder mMenu>
    //   14   30:invokevirtual   #247 <Method MenuBuilder MenuBuilder.getRootMenu()>
    //   15   33:aload_0         
    //   16   34:invokevirtual   #251 <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
    //   17   37:ifne            20
    //   18   40:aload_0         
    //   19   41:getfield        #150 <Field Runnable mItemCallback>
    //   20   44:ifnull          58
    //   21   47:aload_0         
    //   22   48:getfield        #150 <Field Runnable mItemCallback>
    //   23   51:invokeinterface #256 <Method void Runnable.run()>
    //   24   56:iconst_1        
    //   25   57:ireturn         
    //   26   58:aload_0         
    //   27   59:getfield        #170 <Field Intent mIntent>
    //   28   62:ifnull          92
    // try 65 79 handler(s) 81
    //   29   65:aload_0         
    //   30   66:getfield        #81  <Field MenuBuilder mMenu>
    //   31   69:invokevirtual   #260 <Method Context MenuBuilder.getContext()>
    //   32   72:aload_0         
    //   33   73:getfield        #170 <Field Intent mIntent>
    //   34   76:invokevirtual   #266 <Method void Context.startActivity(Intent)>
    //   35   79:iconst_1        
    //   36   80:ireturn         
    // catch ActivityNotFoundException
    //   37   81:astore_1        
    //   38   82:ldc1            #27  <String "MenuItemImpl">
    //   39   84:ldc2            #268 <String "Can't find activity to handle intent; ignoring">
    //   40   87:aload_1         
    //   41   88:invokestatic    #274 <Method int Log.e(String, String, Throwable)>
    //   42   91:pop             
    //   43   92:aload_0         
    //   44   93:getfield        #136 <Field ActionProvider mActionProvider>
    //   45   96:ifnull          109
    //   46   99:aload_0         
    //   47  100:getfield        #136 <Field ActionProvider mActionProvider>
    //   48  103:invokevirtual   #277 <Method boolean ActionProvider.onPerformDefaultAction()>
    //   49  106:ifne            20
    //   50  109:iconst_0        
    //   51  110:ireturn         
    }

    public boolean isActionButton()
    {
    //    0    0:bipush          32
    //    1    2:aload_0         
    //    2    3:getfield        #75  <Field int mFlags>
    //    3    6:iand            
    //    4    7:bipush          32
    //    5    9:icmpne          14
    //    6   12:iconst_1        
    //    7   13:ireturn         
    //    8   14:iconst_0        
    //    9   15:ireturn         
    }

    public boolean isActionViewExpanded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field boolean mIsActionViewExpanded>
    //    2    4:ireturn         
    }

    public boolean isCheckable()
    {
    //    0    0:iconst_1        
    //    1    1:aload_0         
    //    2    2:getfield        #75  <Field int mFlags>
    //    3    5:iand            
    //    4    6:iconst_1        
    //    5    7:icmpne          12
    //    6   10:iconst_1        
    //    7   11:ireturn         
    //    8   12:iconst_0        
    //    9   13:ireturn         
    }

    public boolean isChecked()
    {
    //    0    0:iconst_2        
    //    1    1:aload_0         
    //    2    2:getfield        #75  <Field int mFlags>
    //    3    5:iand            
    //    4    6:iconst_2        
    //    5    7:icmpne          12
    //    6   10:iconst_1        
    //    7   11:ireturn         
    //    8   12:iconst_0        
    //    9   13:ireturn         
    }

    public boolean isEnabled()
    {
    //    0    0:bipush          16
    //    1    2:aload_0         
    //    2    3:getfield        #75  <Field int mFlags>
    //    3    6:iand            
    //    4    7:ifeq            12
    //    5   10:iconst_1        
    //    6   11:ireturn         
    //    7   12:iconst_0        
    //    8   13:ireturn         
    }

    public boolean isExclusiveCheckable()
    {
    //    0    0:iconst_4        
    //    1    1:aload_0         
    //    2    2:getfield        #75  <Field int mFlags>
    //    3    5:iand            
    //    4    6:ifeq            11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iconst_0        
    //    8   12:ireturn         
    }

    public boolean isVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #136 <Field ActionProvider mActionProvider>
    //    2    4:ifnull          41
    //    3    7:aload_0         
    //    4    8:getfield        #136 <Field ActionProvider mActionProvider>
    //    5   11:invokevirtual   #287 <Method boolean ActionProvider.overridesItemVisibility()>
    //    6   14:ifeq            41
    //    7   17:bipush          8
    //    8   19:aload_0         
    //    9   20:getfield        #75  <Field int mFlags>
    //   10   23:iand            
    //   11   24:ifne            39
    //   12   27:aload_0         
    //   13   28:getfield        #136 <Field ActionProvider mActionProvider>
    //   14   31:invokevirtual   #289 <Method boolean ActionProvider.isVisible()>
    //   15   34:ifeq            39
    //   16   37:iconst_1        
    //   17   38:ireturn         
    //   18   39:iconst_0        
    //   19   40:ireturn         
    //   20   41:bipush          8
    //   21   43:aload_0         
    //   22   44:getfield        #75  <Field int mFlags>
    //   23   47:iand            
    //   24   48:ifeq            37
    //   25   51:iconst_0        
    //   26   52:ireturn         
    }

    public boolean requestsActionButton()
    {
    //    0    0:iconst_1        
    //    1    1:aload_0         
    //    2    2:getfield        #77  <Field int mShowAsAction>
    //    3    5:iand            
    //    4    6:iconst_1        
    //    5    7:icmpne          12
    //    6   10:iconst_1        
    //    7   11:ireturn         
    //    8   12:iconst_0        
    //    9   13:ireturn         
    }

    public boolean requiresActionButton()
    {
    //    0    0:iconst_2        
    //    1    1:aload_0         
    //    2    2:getfield        #77  <Field int mShowAsAction>
    //    3    5:iand            
    //    4    6:iconst_2        
    //    5    7:icmpne          12
    //    6   10:iconst_1        
    //    7   11:ireturn         
    //    8   12:iconst_0        
    //    9   13:ireturn         
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionprovider)
    {
    //    0    0:new             #127 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #295 <String "Implementation should use setSupportActionProvider!">
    //    3    7:invokespecial   #132 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    public SupportMenuItem setActionView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:invokevirtual   #260 <Method Context MenuBuilder.getContext()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:aload_2         
    //    6   10:invokestatic    #303 <Method LayoutInflater LayoutInflater.from(Context)>
    //    7   13:iload_1         
    //    8   14:new             #305 <Class LinearLayout>
    //    9   17:dup             
    //   10   18:aload_2         
    //   11   19:invokespecial   #308 <Method void LinearLayout(Context)>
    //   12   22:iconst_0        
    //   13   23:invokevirtual   #312 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
    //   14   26:invokevirtual   #315 <Method SupportMenuItem setActionView(View)>
    //   15   29:pop             
    //   16   30:aload_0         
    //   17   31:areturn         
    }

    public SupportMenuItem setActionView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #104 <Field View mActionView>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #136 <Field ActionProvider mActionProvider>
    //    6   10:aload_1         
    //    7   11:ifnull          37
    //    8   14:aload_1         
    //    9   15:invokevirtual   #320 <Method int View.getId()>
    //   10   18:iconst_m1       
    //   11   19:icmpne          37
    //   12   22:aload_0         
    //   13   23:getfield        #83  <Field int mId>
    //   14   26:ifle            37
    //   15   29:aload_1         
    //   16   30:aload_0         
    //   17   31:getfield        #83  <Field int mId>
    //   18   34:invokevirtual   #324 <Method void View.setId(int)>
    //   19   37:aload_0         
    //   20   38:getfield        #81  <Field MenuBuilder mMenu>
    //   21   41:aload_0         
    //   22   42:invokevirtual   #100 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
    //   23   45:aload_0         
    //   24   46:areturn         
    }

    public volatile MenuItem setActionView(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #327 <Method SupportMenuItem setActionView(int)>
    //    3    5:areturn         
    }

    public volatile MenuItem setActionView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #315 <Method SupportMenuItem setActionView(View)>
    //    3    5:areturn         
    }

    public void setActionViewExpanded(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #79  <Field boolean mIsActionViewExpanded>
    //    3    5:aload_0         
    //    4    6:getfield        #81  <Field MenuBuilder mMenu>
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //    7   13:return          
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field char mShortcutAlphabeticChar>
    //    2    4:iload_1         
    //    3    5:icmpne          10
    //    4    8:aload_0         
    //    5    9:areturn         
    //    6   10:aload_0         
    //    7   11:iload_1         
    //    8   12:invokestatic    #341 <Method char Character.toLowerCase(char)>
    //    9   15:putfield        #146 <Field char mShortcutAlphabeticChar>
    //   10   18:aload_0         
    //   11   19:getfield        #81  <Field MenuBuilder mMenu>
    //   12   22:iconst_0        
    //   13   23:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   14   26:aload_0         
    //   15   27:areturn         
    }

    public MenuItem setCallback(Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #150 <Field Runnable mItemCallback>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setCheckable(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field int mFlags>
    //    2    4:istore_2        
    //    3    5:bipush          -2
    //    4    7:aload_0         
    //    5    8:getfield        #75  <Field int mFlags>
    //    6   11:iand            
    //    7   12:istore_3        
    //    8   13:iload_1         
    //    9   14:ifeq            46
    //   10   17:iconst_1        
    //   11   18:istore          4
    //   12   20:aload_0         
    //   13   21:iload           4
    //   14   23:iload_3         
    //   15   24:ior             
    //   16   25:putfield        #75  <Field int mFlags>
    //   17   28:iload_2         
    //   18   29:aload_0         
    //   19   30:getfield        #75  <Field int mFlags>
    //   20   33:icmpeq          44
    //   21   36:aload_0         
    //   22   37:getfield        #81  <Field MenuBuilder mMenu>
    //   23   40:iconst_0        
    //   24   41:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   25   44:aload_0         
    //   26   45:areturn         
    //   27   46:iconst_0        
    //   28   47:istore          4
    //   29   49:goto            20
    }

    public MenuItem setChecked(boolean flag)
    {
    //    0    0:iconst_4        
    //    1    1:aload_0         
    //    2    2:getfield        #75  <Field int mFlags>
    //    3    5:iand            
    //    4    6:ifeq            19
    //    5    9:aload_0         
    //    6   10:getfield        #81  <Field MenuBuilder mMenu>
    //    7   13:aload_0         
    //    8   14:invokevirtual   #350 <Method void MenuBuilder.setExclusiveItemChecked(MenuItem)>
    //    9   17:aload_0         
    //   10   18:areturn         
    //   11   19:aload_0         
    //   12   20:iload_1         
    //   13   21:invokevirtual   #353 <Method void setCheckedInt(boolean)>
    //   14   24:aload_0         
    //   15   25:areturn         
    }

    void setCheckedInt(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field int mFlags>
    //    2    4:istore_2        
    //    3    5:bipush          -3
    //    4    7:aload_0         
    //    5    8:getfield        #75  <Field int mFlags>
    //    6   11:iand            
    //    7   12:istore_3        
    //    8   13:iload_1         
    //    9   14:ifeq            45
    //   10   17:iconst_2        
    //   11   18:istore          4
    //   12   20:aload_0         
    //   13   21:iload           4
    //   14   23:iload_3         
    //   15   24:ior             
    //   16   25:putfield        #75  <Field int mFlags>
    //   17   28:iload_2         
    //   18   29:aload_0         
    //   19   30:getfield        #75  <Field int mFlags>
    //   20   33:icmpeq          44
    //   21   36:aload_0         
    //   22   37:getfield        #81  <Field MenuBuilder mMenu>
    //   23   40:iconst_0        
    //   24   41:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   25   44:return          
    //   26   45:iconst_0        
    //   27   46:istore          4
    //   28   48:goto            20
    }

    public MenuItem setEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            25
    //    2    4:aload_0         
    //    3    5:bipush          16
    //    4    7:aload_0         
    //    5    8:getfield        #75  <Field int mFlags>
    //    6   11:ior             
    //    7   12:putfield        #75  <Field int mFlags>
    //    8   15:aload_0         
    //    9   16:getfield        #81  <Field MenuBuilder mMenu>
    //   10   19:iconst_0        
    //   11   20:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   12   23:aload_0         
    //   13   24:areturn         
    //   14   25:aload_0         
    //   15   26:bipush          -17
    //   16   28:aload_0         
    //   17   29:getfield        #75  <Field int mFlags>
    //   18   32:iand            
    //   19   33:putfield        #75  <Field int mFlags>
    //   20   36:goto            15
    }

    public void setExclusiveCheckable(boolean flag)
    {
    //    0    0:bipush          -5
    //    1    2:aload_0         
    //    2    3:getfield        #75  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            22
    //    7   12:iconst_4        
    //    8   13:istore_3        
    //    9   14:aload_0         
    //   10   15:iload_3         
    //   11   16:iload_2         
    //   12   17:ior             
    //   13   18:putfield        #75  <Field int mFlags>
    //   14   21:return          
    //   15   22:iconst_0        
    //   16   23:istore_3        
    //   17   24:goto            14
    }

    public MenuItem setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #156 <Field Drawable mIconDrawable>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #73  <Field int mIconResId>
    //    6   10:aload_0         
    //    7   11:getfield        #81  <Field MenuBuilder mMenu>
    //    8   14:iconst_0        
    //    9   15:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   10   18:aload_0         
    //   11   19:areturn         
    }

    public MenuItem setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #73  <Field int mIconResId>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #156 <Field Drawable mIconDrawable>
    //    6   10:aload_0         
    //    7   11:getfield        #81  <Field MenuBuilder mMenu>
    //    8   14:iconst_0        
    //    9   15:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   10   18:aload_0         
    //   11   19:areturn         
    }

    public MenuItem setIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #170 <Field Intent mIntent>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public void setIsActionButton(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            16
    //    2    4:aload_0         
    //    3    5:bipush          32
    //    4    7:aload_0         
    //    5    8:getfield        #75  <Field int mFlags>
    //    6   11:ior             
    //    7   12:putfield        #75  <Field int mFlags>
    //    8   15:return          
    //    9   16:aload_0         
    //   10   17:bipush          -33
    //   11   19:aload_0         
    //   12   20:getfield        #75  <Field int mFlags>
    //   13   23:iand            
    //   14   24:putfield        #75  <Field int mFlags>
    //   15   27:return          
    }

    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #176 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
    //    3    5:return          
    }

    public MenuItem setNumericShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #179 <Field char mShortcutNumericChar>
    //    2    4:iload_1         
    //    3    5:icmpne          10
    //    4    8:aload_0         
    //    5    9:areturn         
    //    6   10:aload_0         
    //    7   11:iload_1         
    //    8   12:putfield        #179 <Field char mShortcutNumericChar>
    //    9   15:aload_0         
    //   10   16:getfield        #81  <Field MenuBuilder mMenu>
    //   11   19:iconst_0        
    //   12   20:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   13   23:aload_0         
    //   14   24:areturn         
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:new             #127 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #367 <String "Implementation should use setSupportOnActionExpandListener!">
    //    3    7:invokespecial   #132 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #238 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setShortcut(char c, char c1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #179 <Field char mShortcutNumericChar>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokestatic    #341 <Method char Character.toLowerCase(char)>
    //    6   10:putfield        #146 <Field char mShortcutAlphabeticChar>
    //    7   13:aload_0         
    //    8   14:getfield        #81  <Field MenuBuilder mMenu>
    //    9   17:iconst_0        
    //   10   18:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public void setShowAsAction(int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_3        
    //    2    2:iand            
    //    3    3:tableswitch     0 2: default 28
    //                   0 39
    //                   1 39
    //                   2 39
    //    4   28:new             #374 <Class IllegalArgumentException>
    //    5   31:dup             
    //    6   32:ldc2            #376 <String "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.">
    //    7   35:invokespecial   #377 <Method void IllegalArgumentException(String)>
    //    8   38:athrow          
    //    9   39:aload_0         
    //   10   40:iload_1         
    //   11   41:putfield        #77  <Field int mShowAsAction>
    //   12   44:aload_0         
    //   13   45:getfield        #81  <Field MenuBuilder mMenu>
    //   14   48:aload_0         
    //   15   49:invokevirtual   #100 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
    //   16   52:return          
    }

    public SupportMenuItem setShowAsActionFlags(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #380 <Method void setShowAsAction(int)>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public volatile MenuItem setShowAsActionFlags(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #382 <Method SupportMenuItem setShowAsActionFlags(int)>
    //    3    5:areturn         
    }

    void setSubMenu(SubMenuBuilder submenubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #213 <Field SubMenuBuilder mSubMenu>
    //    3    5:aload_1         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #231 <Method CharSequence getTitle()>
    //    6   10:invokevirtual   #390 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
    //    7   13:pop             
    //    8   14:return          
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #136 <Field ActionProvider mActionProvider>
    //    2    4:aload_1         
    //    3    5:if_acmpne       10
    //    4    8:aload_0         
    //    5    9:areturn         
    //    6   10:aload_0         
    //    7   11:aconst_null     
    //    8   12:putfield        #104 <Field View mActionView>
    //    9   15:aload_0         
    //   10   16:getfield        #136 <Field ActionProvider mActionProvider>
    //   11   19:ifnull          30
    //   12   22:aload_0         
    //   13   23:getfield        #136 <Field ActionProvider mActionProvider>
    //   14   26:aconst_null     
    //   15   27:invokevirtual   #396 <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
    //   16   30:aload_0         
    //   17   31:aload_1         
    //   18   32:putfield        #136 <Field ActionProvider mActionProvider>
    //   19   35:aload_0         
    //   20   36:getfield        #81  <Field MenuBuilder mMenu>
    //   21   39:iconst_1        
    //   22   40:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   23   43:aload_1         
    //   24   44:ifnull          8
    //   25   47:aload_1         
    //   26   48:new             #398 <Class MenuItemImpl$1>
    //   27   51:dup             
    //   28   52:aload_0         
    //   29   53:invokespecial   #400 <Method void MenuItemImpl$1(MenuItemImpl)>
    //   30   56:invokevirtual   #396 <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
    //   31   59:aload_0         
    //   32   60:areturn         
    }

    public SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #106 <Field android.support.v4.view.MenuItemCompat$OnActionExpandListener mOnActionExpandListener>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #81  <Field MenuBuilder mMenu>
    //    3    5:invokevirtual   #260 <Method Context MenuBuilder.getContext()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #407 <Method String Context.getString(int)>
    //    6   12:invokevirtual   #410 <Method MenuItem setTitle(CharSequence)>
    //    7   15:areturn         
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #91  <Field CharSequence mTitle>
    //    3    5:aload_0         
    //    4    6:getfield        #81  <Field MenuBuilder mMenu>
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //    7   13:aload_0         
    //    8   14:getfield        #213 <Field SubMenuBuilder mSubMenu>
    //    9   17:ifnull          29
    //   10   20:aload_0         
    //   11   21:getfield        #213 <Field SubMenuBuilder mSubMenu>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #390 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
    //   14   28:pop             
    //   15   29:aload_0         
    //   16   30:areturn         
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #220 <Field CharSequence mTitleCondensed>
    //    3    5:aload_1         
    //    4    6:ifnonnull       14
    //    5    9:aload_0         
    //    6   10:getfield        #91  <Field CharSequence mTitle>
    //    7   13:pop             
    //    8   14:aload_0         
    //    9   15:getfield        #81  <Field MenuBuilder mMenu>
    //   10   18:iconst_0        
    //   11   19:invokevirtual   #333 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   12   22:aload_0         
    //   13   23:areturn         
    }

    public MenuItem setVisible(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #416 <Method boolean setVisibleInt(boolean)>
    //    3    5:ifeq            16
    //    4    8:aload_0         
    //    5    9:getfield        #81  <Field MenuBuilder mMenu>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #419 <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
    //    8   16:aload_0         
    //    9   17:areturn         
    }

    boolean setVisibleInt(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field int mFlags>
    //    2    4:istore_2        
    //    3    5:bipush          -9
    //    4    7:aload_0         
    //    5    8:getfield        #75  <Field int mFlags>
    //    6   11:iand            
    //    7   12:istore_3        
    //    8   13:iload_1         
    //    9   14:ifeq            49
    //   10   17:iconst_0        
    //   11   18:istore          4
    //   12   20:aload_0         
    //   13   21:iload           4
    //   14   23:iload_3         
    //   15   24:ior             
    //   16   25:putfield        #75  <Field int mFlags>
    //   17   28:aload_0         
    //   18   29:getfield        #75  <Field int mFlags>
    //   19   32:istore          5
    //   20   34:iconst_0        
    //   21   35:istore          6
    //   22   37:iload_2         
    //   23   38:iload           5
    //   24   40:icmpeq          46
    //   25   43:iconst_1        
    //   26   44:istore          6
    //   27   46:iload           6
    //   28   48:ireturn         
    //   29   49:bipush          8
    //   30   51:istore          4
    //   31   53:goto            20
    }

    public boolean shouldShowIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:invokevirtual   #423 <Method boolean MenuBuilder.getOptionalIconsVisible()>
    //    3    7:ireturn         
    }

    boolean shouldShowShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:invokevirtual   #427 <Method boolean MenuBuilder.isShortcutsVisible()>
    //    3    7:ifeq            19
    //    4   10:aload_0         
    //    5   11:invokevirtual   #186 <Method char getShortcut()>
    //    6   14:ifeq            19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    public boolean showsTextAsAction()
    {
    //    0    0:iconst_4        
    //    1    1:aload_0         
    //    2    2:getfield        #77  <Field int mShowAsAction>
    //    3    5:iand            
    //    4    6:iconst_4        
    //    5    7:icmpne          12
    //    6   10:iconst_1        
    //    7   11:ireturn         
    //    8   12:iconst_0        
    //    9   13:ireturn         
    }

    public String toString()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field CharSequence mTitle>
    //    2    4:invokevirtual   #429 <Method String Object.toString()>
    //    3    7:areturn         
    }

    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final String TAG = "MenuItemImpl";
    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    private MenuBuilder mMenu;
    private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
    private android.support.v4.view.MenuItemCompat.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    static MenuBuilder access$000(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #81  <Field MenuBuilder mMenu>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/view/menu/MenuItemImpl$1

/* anonymous class */
    class _cls1
        implements android.support.v4.view.ActionProvider.VisibilityListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MenuItemImpl this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onActionProviderVisibilityChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MenuItemImpl this$0>
        //    2    4:invokestatic    #26  <Method MenuBuilder MenuItemImpl.access$000(MenuItemImpl)>
        //    3    7:aload_0         
        //    4    8:getfield        #17  <Field MenuItemImpl this$0>
        //    5   11:invokevirtual   #31  <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
        //    6   14:return          
        }

        final MenuItemImpl this$0;
    }

}
