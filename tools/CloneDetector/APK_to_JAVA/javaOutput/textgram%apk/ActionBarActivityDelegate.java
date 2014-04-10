// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateICS, ActionBarActivityDelegateHC, ActionBarActivityDelegateBase, ActionBar, 
//            ActionBarActivity

abstract class ActionBarActivityDelegate
{

    ActionBarActivityDelegate(ActionBarActivity actionbaractivity)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #28  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #30  <Field ActionBarActivity mActivity>
    //    5    9:return          
    }

    static ActionBarActivityDelegate createDelegate(ActionBarActivity actionbaractivity)
    {
    //    0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_1        
    //    2    4:iload_1         
    //    3    5:bipush          14
    //    4    7:icmplt          19
    //    5   10:new             #40  <Class ActionBarActivityDelegateICS>
    //    6   13:dup             
    //    7   14:aload_0         
    //    8   15:invokespecial   #42  <Method void ActionBarActivityDelegateICS(ActionBarActivity)>
    //    9   18:areturn         
    //   10   19:iload_1         
    //   11   20:bipush          11
    //   12   22:icmplt          34
    //   13   25:new             #44  <Class ActionBarActivityDelegateHC>
    //   14   28:dup             
    //   15   29:aload_0         
    //   16   30:invokespecial   #45  <Method void ActionBarActivityDelegateHC(ActionBarActivity)>
    //   17   33:areturn         
    //   18   34:new             #47  <Class ActionBarActivityDelegateBase>
    //   19   37:dup             
    //   20   38:aload_0         
    //   21   39:invokespecial   #48  <Method void ActionBarActivityDelegateBase(ActionBarActivity)>
    //   22   42:areturn         
    }

    abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract ActionBar createSupportActionBar();

    protected final Context getActionBarThemedContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field ActionBarActivity mActivity>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #57  <Method ActionBar getSupportActionBar()>
    //    5    9:astore_2        
    //    6   10:aload_2         
    //    7   11:ifnull          19
    //    8   14:aload_2         
    //    9   15:invokevirtual   #62  <Method Context ActionBar.getThemedContext()>
    //   10   18:astore_1        
    //   11   19:aload_1         
    //   12   20:areturn         
    }

    abstract android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    MenuInflater getMenuInflater()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field MenuInflater mMenuInflater>
    //    2    4:ifnonnull       31
    //    3    7:aload_0         
    //    4    8:invokevirtual   #57  <Method ActionBar getSupportActionBar()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:ifnull          36
    //    8   16:aload_0         
    //    9   17:new             #70  <Class SupportMenuInflater>
    //   10   20:dup             
    //   11   21:aload_1         
    //   12   22:invokevirtual   #62  <Method Context ActionBar.getThemedContext()>
    //   13   25:invokespecial   #73  <Method void SupportMenuInflater(Context)>
    //   14   28:putfield        #68  <Field MenuInflater mMenuInflater>
    //   15   31:aload_0         
    //   16   32:getfield        #68  <Field MenuInflater mMenuInflater>
    //   17   35:areturn         
    //   18   36:aload_0         
    //   19   37:new             #70  <Class SupportMenuInflater>
    //   20   40:dup             
    //   21   41:aload_0         
    //   22   42:getfield        #30  <Field ActionBarActivity mActivity>
    //   23   45:invokespecial   #73  <Method void SupportMenuInflater(Context)>
    //   24   48:putfield        #68  <Field MenuInflater mMenuInflater>
    //   25   51:goto            31
    }

    final ActionBar getSupportActionBar()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field boolean mHasActionBar>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:getfield        #77  <Field boolean mOverlayActionBar>
    //    5   11:ifeq            34
    //    6   14:aload_0         
    //    7   15:getfield        #79  <Field ActionBar mActionBar>
    //    8   18:ifnonnull       29
    //    9   21:aload_0         
    //   10   22:aload_0         
    //   11   23:invokevirtual   #81  <Method ActionBar createSupportActionBar()>
    //   12   26:putfield        #79  <Field ActionBar mActionBar>
    //   13   29:aload_0         
    //   14   30:getfield        #79  <Field ActionBar mActionBar>
    //   15   33:areturn         
    //   16   34:aload_0         
    //   17   35:aconst_null     
    //   18   36:putfield        #79  <Field ActionBar mActionBar>
    //   19   39:goto            29
    }

    protected final String getUiOptionsFromMetadata()
    {
    // try 0 27 handler(s) 53
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field ActionBarActivity mActivity>
    //    2    4:invokevirtual   #91  <Method PackageManager ActionBarActivity.getPackageManager()>
    //    3    7:aload_0         
    //    4    8:getfield        #30  <Field ActionBarActivity mActivity>
    //    5   11:invokevirtual   #95  <Method android.content.ComponentName ActionBarActivity.getComponentName()>
    //    6   14:sipush          128
    //    7   17:invokevirtual   #101 <Method ActivityInfo PackageManager.getActivityInfo(android.content.ComponentName, int)>
    //    8   20:astore_3        
    //    9   21:aload_3         
    //   10   22:getfield        #107 <Field Bundle ActivityInfo.metaData>
    //   11   25:astore          4
    //   12   27:aconst_null     
    //   13   28:astore          5
    //   14   30:aload           4
    //   15   32:ifnull          50
    // try 35 46 handler(s) 53
    //   16   35:aload_3         
    //   17   36:getfield        #107 <Field Bundle ActivityInfo.metaData>
    //   18   39:ldc1            #8   <String "android.support.UI_OPTIONS">
    //   19   41:invokevirtual   #113 <Method String Bundle.getString(String)>
    //   20   44:astore          6
    //   21   46:aload           6
    //   22   48:astore          5
    //   23   50:aload           5
    //   24   52:areturn         
    // catch android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException
    //   25   53:astore_1        
    //   26   54:ldc1            #11  <String "ActionBarActivityDelegate">
    //   27   56:new             #115 <Class StringBuilder>
    //   28   59:dup             
    //   29   60:invokespecial   #116 <Method void StringBuilder()>
    //   30   63:ldc1            #118 <String "getUiOptionsFromMetadata: Activity '">
    //   31   65:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
    //   32   68:aload_0         
    //   33   69:getfield        #30  <Field ActionBarActivity mActivity>
    //   34   72:invokevirtual   #126 <Method Class Object.getClass()>
    //   35   75:invokevirtual   #131 <Method String Class.getSimpleName()>
    //   36   78:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
    //   37   81:ldc1            #133 <String "' not in manifest">
    //   38   83:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
    //   39   86:invokevirtual   #136 <Method String StringBuilder.toString()>
    //   40   89:invokestatic    #142 <Method int Log.e(String, String)>
    //   41   92:pop             
    //   42   93:aconst_null     
    //   43   94:areturn         
    }

    abstract boolean onBackPressed();

    abstract void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field ActionBarActivity mActivity>
    //    2    4:getstatic       #154 <Field int[] android.support.v7.appcompat.R$styleable.ActionBarWindow>
    //    3    7:invokevirtual   #158 <Method TypedArray ActionBarActivity.obtainStyledAttributes(int[])>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:iconst_0        
    //    7   13:invokevirtual   #164 <Method boolean TypedArray.hasValue(int)>
    //    8   16:ifne            33
    //    9   19:aload_2         
    //   10   20:invokevirtual   #167 <Method void TypedArray.recycle()>
    //   11   23:new             #169 <Class IllegalStateException>
    //   12   26:dup             
    //   13   27:ldc1            #171 <String "You need to use a Theme.AppCompat theme (or descendant) with this activity.">
    //   14   29:invokespecial   #174 <Method void IllegalStateException(String)>
    //   15   32:athrow          
    //   16   33:aload_0         
    //   17   34:aload_2         
    //   18   35:iconst_0        
    //   19   36:iconst_0        
    //   20   37:invokevirtual   #178 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   21   40:putfield        #75  <Field boolean mHasActionBar>
    //   22   43:aload_0         
    //   23   44:aload_2         
    //   24   45:iconst_1        
    //   25   46:iconst_0        
    //   26   47:invokevirtual   #178 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   27   50:putfield        #77  <Field boolean mOverlayActionBar>
    //   28   53:aload_2         
    //   29   54:invokevirtual   #167 <Method void TypedArray.recycle()>
    //   30   57:return          
    }

    abstract boolean onCreatePanelMenu(int i, Menu menu);

    abstract View onCreatePanelView(int i);

    abstract boolean onMenuItemSelected(int i, MenuItem menuitem);

    abstract void onPostResume();

    abstract boolean onPreparePanel(int i, View view, Menu menu);

    abstract void onStop();

    abstract void onTitleChanged(CharSequence charsequence);

    abstract void setContentView(int i);

    abstract void setContentView(View view);

    abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract void setSupportProgress(int i);

    abstract void setSupportProgressBarIndeterminate(boolean flag);

    abstract void setSupportProgressBarIndeterminateVisibility(boolean flag);

    abstract void setSupportProgressBarVisibility(boolean flag);

    abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);

    abstract void supportInvalidateOptionsMenu();

    abstract boolean supportRequestWindowFeature(int i);

    static final String METADATA_UI_OPTIONS = "android.support.UI_OPTIONS";
    private static final String TAG = "ActionBarActivityDelegate";
    static final String UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = "splitActionBarWhenNarrow";
    private ActionBar mActionBar;
    final ActionBarActivity mActivity;
    boolean mHasActionBar;
    private MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
}
