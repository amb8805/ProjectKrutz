// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class ActionMenuItem
    implements SupportMenuItem
{

    public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #43  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #45  <Field int mIconResId>
    //    5    9:aload_0         
    //    6   10:bipush          16
    //    7   12:putfield        #47  <Field int mFlags>
    //    8   15:aload_0         
    //    9   16:aload_1         
    //   10   17:putfield        #49  <Field Context mContext>
    //   11   20:aload_0         
    //   12   21:iload_3         
    //   13   22:putfield        #51  <Field int mId>
    //   14   25:aload_0         
    //   15   26:iload_2         
    //   16   27:putfield        #53  <Field int mGroup>
    //   17   30:aload_0         
    //   18   31:iload           4
    //   19   33:putfield        #55  <Field int mCategoryOrder>
    //   20   36:aload_0         
    //   21   37:iload           5
    //   22   39:putfield        #57  <Field int mOrdering>
    //   23   42:aload_0         
    //   24   43:aload           6
    //   25   45:putfield        #59  <Field CharSequence mTitle>
    //   26   48:return          
    }

    public boolean collapseActionView()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean expandActionView()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public ActionProvider getActionProvider()
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public View getActionView()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public char getAlphabeticShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field char mShortcutAlphabeticChar>
    //    2    4:ireturn         
    }

    public int getGroupId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field int mGroup>
    //    2    4:ireturn         
    }

    public Drawable getIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field Drawable mIconDrawable>
    //    2    4:areturn         
    }

    public Intent getIntent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field Intent mIntent>
    //    2    4:areturn         
    }

    public int getItemId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field int mId>
    //    2    4:ireturn         
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public char getNumericShortcut()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field char mShortcutNumericChar>
    //    2    4:ireturn         
    }

    public int getOrder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field int mOrdering>
    //    2    4:ireturn         
    }

    public SubMenu getSubMenu()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public android.support.v4.view.ActionProvider getSupportActionProvider()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field CharSequence mTitle>
    //    2    4:areturn         
    }

    public CharSequence getTitleCondensed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #99  <Field CharSequence mTitleCondensed>
    //    2    4:areturn         
    }

    public boolean hasSubMenu()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean invoke()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    2    4:ifnull          22
    //    3    7:aload_0         
    //    4    8:getfield        #103 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    5   11:aload_0         
    //    6   12:invokeinterface #109 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
    //    7   17:ifeq            22
    //    8   20:iconst_1        
    //    9   21:ireturn         
    //   10   22:aload_0         
    //   11   23:getfield        #83  <Field Intent mIntent>
    //   12   26:ifnull          42
    //   13   29:aload_0         
    //   14   30:getfield        #49  <Field Context mContext>
    //   15   33:aload_0         
    //   16   34:getfield        #83  <Field Intent mIntent>
    //   17   37:invokevirtual   #115 <Method void Context.startActivity(Intent)>
    //   18   40:iconst_1        
    //   19   41:ireturn         
    //   20   42:iconst_0        
    //   21   43:ireturn         
    }

    public boolean isActionViewExpanded()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean isCheckable()
    {
    //    0    0:iconst_1        
    //    1    1:aload_0         
    //    2    2:getfield        #47  <Field int mFlags>
    //    3    5:iand            
    //    4    6:ifeq            11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iconst_0        
    //    8   12:ireturn         
    }

    public boolean isChecked()
    {
    //    0    0:iconst_2        
    //    1    1:aload_0         
    //    2    2:getfield        #47  <Field int mFlags>
    //    3    5:iand            
    //    4    6:ifeq            11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iconst_0        
    //    8   12:ireturn         
    }

    public boolean isEnabled()
    {
    //    0    0:bipush          16
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:ifeq            12
    //    5   10:iconst_1        
    //    6   11:ireturn         
    //    7   12:iconst_0        
    //    8   13:ireturn         
    }

    public boolean isVisible()
    {
    //    0    0:bipush          8
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:ifne            12
    //    5   10:iconst_1        
    //    6   11:ireturn         
    //    7   12:iconst_0        
    //    8   13:ireturn         
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public SupportMenuItem setActionView(int i)
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public SupportMenuItem setActionView(View view)
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public volatile MenuItem setActionView(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #128 <Method SupportMenuItem setActionView(int)>
    //    3    5:areturn         
    }

    public volatile MenuItem setActionView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #131 <Method SupportMenuItem setActionView(View)>
    //    3    5:areturn         
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #73  <Field char mShortcutAlphabeticChar>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setCheckable(boolean flag)
    {
    //    0    0:bipush          -2
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            23
    //    7   12:iconst_1        
    //    8   13:istore_3        
    //    9   14:aload_0         
    //   10   15:iload_3         
    //   11   16:iload_2         
    //   12   17:ior             
    //   13   18:putfield        #47  <Field int mFlags>
    //   14   21:aload_0         
    //   15   22:areturn         
    //   16   23:iconst_0        
    //   17   24:istore_3        
    //   18   25:goto            14
    }

    public MenuItem setChecked(boolean flag)
    {
    //    0    0:bipush          -3
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            23
    //    7   12:iconst_2        
    //    8   13:istore_3        
    //    9   14:aload_0         
    //   10   15:iload_3         
    //   11   16:iload_2         
    //   12   17:ior             
    //   13   18:putfield        #47  <Field int mFlags>
    //   14   21:aload_0         
    //   15   22:areturn         
    //   16   23:iconst_0        
    //   17   24:istore_3        
    //   18   25:goto            14
    }

    public MenuItem setEnabled(boolean flag)
    {
    //    0    0:bipush          -17
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            24
    //    7   12:bipush          16
    //    8   14:istore_3        
    //    9   15:aload_0         
    //   10   16:iload_3         
    //   11   17:iload_2         
    //   12   18:ior             
    //   13   19:putfield        #47  <Field int mFlags>
    //   14   22:aload_0         
    //   15   23:areturn         
    //   16   24:iconst_0        
    //   17   25:istore_3        
    //   18   26:goto            15
    }

    public ActionMenuItem setExclusiveCheckable(boolean flag)
    {
    //    0    0:bipush          -5
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            23
    //    7   12:iconst_4        
    //    8   13:istore_3        
    //    9   14:aload_0         
    //   10   15:iload_3         
    //   11   16:iload_2         
    //   12   17:ior             
    //   13   18:putfield        #47  <Field int mFlags>
    //   14   21:aload_0         
    //   15   22:areturn         
    //   16   23:iconst_0        
    //   17   24:istore_3        
    //   18   25:goto            14
    }

    public MenuItem setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #45  <Field int mIconResId>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:getfield        #49  <Field Context mContext>
    //    6   10:invokevirtual   #144 <Method Resources Context.getResources()>
    //    7   13:iload_1         
    //    8   14:invokevirtual   #150 <Method Drawable Resources.getDrawable(int)>
    //    9   17:putfield        #79  <Field Drawable mIconDrawable>
    //   10   20:aload_0         
    //   11   21:areturn         
    }

    public MenuItem setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #79  <Field Drawable mIconDrawable>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #45  <Field int mIconResId>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public MenuItem setIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #83  <Field Intent mIntent>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setNumericShortcut(char c)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #89  <Field char mShortcutNumericChar>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #103 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setShortcut(char c, char c1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #89  <Field char mShortcutNumericChar>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #73  <Field char mShortcutAlphabeticChar>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public void setShowAsAction(int i)
    {
    //    0    0:return          
    }

    public SupportMenuItem setShowAsActionFlags(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #165 <Method void setShowAsAction(int)>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public volatile MenuItem setShowAsActionFlags(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #167 <Method SupportMenuItem setShowAsActionFlags(int)>
    //    3    5:areturn         
    }

    public SupportMenuItem setSupportActionProvider(android.support.v4.view.ActionProvider actionprovider)
    {
    //    0    0:new             #66  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:invokespecial   #67  <Method void UnsupportedOperationException()>
    //    3    7:athrow          
    }

    public SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
    //    0    0:aload_0         
    //    1    1:areturn         
    }

    public MenuItem setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #49  <Field Context mContext>
    //    3    5:invokevirtual   #144 <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #176 <Method String Resources.getString(int)>
    //    6   12:putfield        #59  <Field CharSequence mTitle>
    //    7   15:aload_0         
    //    8   16:areturn         
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #59  <Field CharSequence mTitle>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #99  <Field CharSequence mTitleCondensed>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public MenuItem setVisible(boolean flag)
    {
    //    0    0:bipush          8
    //    1    2:aload_0         
    //    2    3:getfield        #47  <Field int mFlags>
    //    3    6:iand            
    //    4    7:istore_2        
    //    5    8:iload_1         
    //    6    9:ifeq            23
    //    7   12:iconst_0        
    //    8   13:istore_3        
    //    9   14:aload_0         
    //   10   15:iload_3         
    //   11   16:iload_2         
    //   12   17:ior             
    //   13   18:putfield        #47  <Field int mFlags>
    //   14   21:aload_0         
    //   15   22:areturn         
    //   16   23:bipush          8
    //   17   25:istore_3        
    //   18   26:goto            14
    }

    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int NO_ICON;
    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
}
