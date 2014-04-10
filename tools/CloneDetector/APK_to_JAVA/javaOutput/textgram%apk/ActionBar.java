// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SpinnerAdapter;

public abstract class ActionBar
{
    static interface Callback
    {

        public abstract FragmentManager getSupportFragmentManager();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public LayoutParams(int i)
        {
        //    0    0:aload_0         
        //    1    1:bipush          -2
        //    2    3:iconst_m1       
        //    3    4:iload_1         
        //    4    5:invokespecial   #11  <Method void ActionBar$LayoutParams(int, int, int)>
        //    5    8:return          
        }

        public LayoutParams(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #14  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iconst_m1       
        //    6    8:putfield        #16  <Field int gravity>
        //    7   11:aload_0         
        //    8   12:bipush          19
        //    9   14:putfield        #16  <Field int gravity>
        //   10   17:return          
        }

        public LayoutParams(int i, int j, int k)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #14  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iconst_m1       
        //    6    8:putfield        #16  <Field int gravity>
        //    7   11:aload_0         
        //    8   12:iload_3         
        //    9   13:putfield        #16  <Field int gravity>
        //   10   16:return          
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #19  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
        //    4    6:aload_0         
        //    5    7:iconst_m1       
        //    6    8:putfield        #16  <Field int gravity>
        //    7   11:aload_1         
        //    8   12:aload_2         
        //    9   13:getstatic       #25  <Field int[] android.support.v7.appcompat.R$styleable.ActionBarLayout>
        //   10   16:invokevirtual   #31  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //   11   19:astore_3        
        //   12   20:aload_0         
        //   13   21:aload_3         
        //   14   22:iconst_0        
        //   15   23:iconst_m1       
        //   16   24:invokevirtual   #37  <Method int TypedArray.getInt(int, int)>
        //   17   27:putfield        #16  <Field int gravity>
        //   18   30:aload_3         
        //   19   31:invokevirtual   #41  <Method void TypedArray.recycle()>
        //   20   34:return          
        }

        public LayoutParams(LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #45  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:iconst_m1       
        //    5    7:putfield        #16  <Field int gravity>
        //    6   10:aload_0         
        //    7   11:aload_1         
        //    8   12:getfield        #16  <Field int gravity>
        //    9   15:putfield        #16  <Field int gravity>
        //   10   18:return          
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #48  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
        //    3    5:aload_0         
        //    4    6:iconst_m1       
        //    5    7:putfield        #16  <Field int gravity>
        //    6   10:return          
        }

        public int gravity;
    }

    public static interface OnMenuVisibilityListener
    {

        public abstract void onMenuVisibilityChanged(boolean flag);
    }

    public static interface OnNavigationListener
    {

        public abstract boolean onNavigationItemSelected(int i, long l);
    }

    public static abstract class Tab
    {

        public Tab()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Object()>
        //    2    4:return          
        }

        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract Object getTag();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract Tab setContentDescription(int i);

        public abstract Tab setContentDescription(CharSequence charsequence);

        public abstract Tab setCustomView(int i);

        public abstract Tab setCustomView(View view);

        public abstract Tab setIcon(int i);

        public abstract Tab setIcon(Drawable drawable);

        public abstract Tab setTabListener(TabListener tablistener);

        public abstract Tab setTag(Object obj);

        public abstract Tab setText(int i);

        public abstract Tab setText(CharSequence charsequence);

        public static final int INVALID_POSITION = -1;
    }

    public static interface TabListener
    {

        public abstract void onTabReselected(Tab tab, FragmentTransaction fragmenttransaction);

        public abstract void onTabSelected(Tab tab, FragmentTransaction fragmenttransaction);

        public abstract void onTabUnselected(Tab tab, FragmentTransaction fragmenttransaction);
    }


    public ActionBar()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #23  <Method void Object()>
    //    2    4:return          
    }

    public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

    public abstract void addTab(Tab tab);

    public abstract void addTab(Tab tab, int i);

    public abstract void addTab(Tab tab, int i, boolean flag);

    public abstract void addTab(Tab tab, boolean flag);

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public abstract int getHeight();

    public abstract int getNavigationItemCount();

    public abstract int getNavigationMode();

    public abstract int getSelectedNavigationIndex();

    public abstract Tab getSelectedTab();

    public abstract CharSequence getSubtitle();

    public abstract Tab getTabAt(int i);

    public abstract int getTabCount();

    public Context getThemedContext()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public abstract CharSequence getTitle();

    public abstract void hide();

    public abstract boolean isShowing();

    public abstract Tab newTab();

    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

    public abstract void removeTab(Tab tab);

    public abstract void removeTabAt(int i);

    public abstract void selectTab(Tab tab);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutparams);

    public abstract void setDisplayHomeAsUpEnabled(boolean flag);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayOptions(int i, int j);

    public abstract void setDisplayShowCustomEnabled(boolean flag);

    public abstract void setDisplayShowHomeEnabled(boolean flag);

    public abstract void setDisplayShowTitleEnabled(boolean flag);

    public abstract void setDisplayUseLogoEnabled(boolean flag);

    public void setHomeButtonEnabled(boolean flag)
    {
    //    0    0:return          
    }

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setListNavigationCallbacks(SpinnerAdapter spinneradapter, OnNavigationListener onnavigationlistener);

    public abstract void setLogo(int i);

    public abstract void setLogo(Drawable drawable);

    public abstract void setNavigationMode(int i);

    public abstract void setSelectedNavigationItem(int i);

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
    //    0    0:return          
    }

    public void setStackedBackgroundDrawable(Drawable drawable)
    {
    //    0    0:return          
    }

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charsequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charsequence);

    public abstract void show();

    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;
    public static final int NAVIGATION_MODE_LIST = 1;
    public static final int NAVIGATION_MODE_STANDARD = 0;
    public static final int NAVIGATION_MODE_TABS = 2;
}
