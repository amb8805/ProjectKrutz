// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v7.view.ActionMode;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBar

public class ActionBarActivity extends FragmentActivity
    implements ActionBar.Callback, android.support.v4.app.TaskStackBuilder.SupportParentable, android.support.v4.app.ActionBarDrawerToggle.DelegateProvider
{

    public ActionBarActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void FragmentActivity()>
    //    2    4:return          
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #24  <Method void ActionBarActivityDelegate.addContentView(View, android.view.ViewGroup$LayoutParams)>
    //    5    9:return          
    }

    public final android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:invokevirtual   #28  <Method android.support.v4.app.ActionBarDrawerToggle$Delegate ActionBarActivityDelegate.getDrawerToggleDelegate()>
    //    3    7:areturn         
    }

    public MenuInflater getMenuInflater()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:invokevirtual   #32  <Method MenuInflater ActionBarActivityDelegate.getMenuInflater()>
    //    3    7:areturn         
    }

    public ActionBar getSupportActionBar()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:invokevirtual   #36  <Method ActionBar ActionBarActivityDelegate.getSupportActionBar()>
    //    3    7:areturn         
    }

    public Intent getSupportParentActivityIntent()
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #44  <Method Intent NavUtils.getParentActivityIntent(android.app.Activity)>
    //    2    4:areturn         
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:invokevirtual   #48  <Method boolean ActionBarActivityDelegate.onBackPressed()>
    //    3    7:ifne            14
    //    4   10:aload_0         
    //    5   11:invokespecial   #50  <Method void FragmentActivity.onBackPressed()>
    //    6   14:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #54  <Method void FragmentActivity.onConfigurationChanged(Configuration)>
    //    3    5:aload_0         
    //    4    6:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #55  <Method void ActionBarActivityDelegate.onConfigurationChanged(Configuration)>
    //    7   13:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokestatic    #61  <Method ActionBarActivityDelegate ActionBarActivityDelegate.createDelegate(ActionBarActivity)>
    //    3    5:putfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokespecial   #63  <Method void FragmentActivity.onCreate(Bundle)>
    //    7   13:aload_0         
    //    8   14:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    9   17:aload_1         
    //   10   18:invokevirtual   #64  <Method void ActionBarActivityDelegate.onCreate(Bundle)>
    //   11   21:return          
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #68  <Method boolean ActionBarActivityDelegate.onCreatePanelMenu(int, Menu)>
    //    5    9:ireturn         
    }

    public View onCreatePanelView(int i)
    {
    //    0    0:iload_1         
    //    1    1:ifne            13
    //    2    4:aload_0         
    //    3    5:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #72  <Method View ActionBarActivityDelegate.onCreatePanelView(int)>
    //    6   12:areturn         
    //    7   13:aload_0         
    //    8   14:iload_1         
    //    9   15:invokespecial   #73  <Method View FragmentActivity.onCreatePanelView(int)>
    //   10   18:areturn         
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #81  <Method TaskStackBuilder TaskStackBuilder.addParentStack(android.app.Activity)>
    //    3    5:pop             
    //    4    6:return          
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #85  <Method boolean ActionBarActivityDelegate.onMenuItemSelected(int, MenuItem)>
    //    5    9:ifeq            14
    //    6   12:iconst_1        
    //    7   13:ireturn         
    //    8   14:aload_0         
    //    9   15:invokevirtual   #86  <Method ActionBar getSupportActionBar()>
    //   10   18:astore_3        
    //   11   19:aload_2         
    //   12   20:invokeinterface #92  <Method int MenuItem.getItemId()>
    //   13   25:ldc1            #93  <Int 0x102002c>
    //   14   27:icmpne          48
    //   15   30:aload_3         
    //   16   31:ifnull          48
    //   17   34:iconst_4        
    //   18   35:aload_3         
    //   19   36:invokevirtual   #98  <Method int ActionBar.getDisplayOptions()>
    //   20   39:iand            
    //   21   40:ifeq            48
    //   22   43:aload_0         
    //   23   44:invokevirtual   #101 <Method boolean onSupportNavigateUp()>
    //   24   47:ireturn         
    //   25   48:iconst_0        
    //   26   49:ireturn         
    }

    protected void onPostResume()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #104 <Method void FragmentActivity.onPostResume()>
    //    2    4:aload_0         
    //    3    5:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    4    8:invokevirtual   #105 <Method void ActionBarActivityDelegate.onPostResume()>
    //    5   11:return          
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokevirtual   #109 <Method boolean ActionBarActivityDelegate.onPreparePanel(int, View, Menu)>
    //    6   10:ireturn         
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
    {
    //    0    0:return          
    }

    protected void onStop()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #113 <Method void FragmentActivity.onStop()>
    //    2    4:aload_0         
    //    3    5:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    4    8:invokevirtual   #114 <Method void ActionBarActivityDelegate.onStop()>
    //    5   11:return          
    }

    public void onSupportActionModeFinished(ActionMode actionmode)
    {
    //    0    0:return          
    }

    public void onSupportActionModeStarted(ActionMode actionmode)
    {
    //    0    0:return          
    }

    public boolean onSupportNavigateUp()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Intent getSupportParentActivityIntent()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          58
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:invokevirtual   #125 <Method boolean supportShouldUpRecreateTask(Intent)>
    //    8   14:ifeq            50
    //    9   17:aload_0         
    //   10   18:invokestatic    #129 <Method TaskStackBuilder TaskStackBuilder.create(android.content.Context)>
    //   11   21:astore_2        
    //   12   22:aload_0         
    //   13   23:aload_2         
    //   14   24:invokevirtual   #131 <Method void onCreateSupportNavigateUpTaskStack(TaskStackBuilder)>
    //   15   27:aload_0         
    //   16   28:aload_2         
    //   17   29:invokevirtual   #133 <Method void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder)>
    //   18   32:aload_2         
    //   19   33:invokevirtual   #136 <Method void TaskStackBuilder.startActivities()>
    // try 36 40 handler(s) 42
    //   20   36:aload_0         
    //   21   37:invokestatic    #142 <Method void ActivityCompat.finishAffinity(android.app.Activity)>
    //   22   40:iconst_1        
    //   23   41:ireturn         
    // catch IllegalStateException
    //   24   42:astore_3        
    //   25   43:aload_0         
    //   26   44:invokevirtual   #145 <Method void finish()>
    //   27   47:goto            40
    //   28   50:aload_0         
    //   29   51:aload_1         
    //   30   52:invokevirtual   #149 <Method void supportNavigateUpTo(Intent)>
    //   31   55:goto            40
    //   32   58:iconst_0        
    //   33   59:ireturn         
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #153 <Method void FragmentActivity.onTitleChanged(CharSequence, int)>
    //    4    6:aload_0         
    //    5    7:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    6   10:aload_1         
    //    7   11:invokevirtual   #156 <Method void ActionBarActivityDelegate.onTitleChanged(CharSequence)>
    //    8   14:return          
    }

    public void setContentView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #160 <Method void ActionBarActivityDelegate.setContentView(int)>
    //    4    8:return          
    }

    public void setContentView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #163 <Method void ActionBarActivityDelegate.setContentView(View)>
    //    4    8:return          
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #165 <Method void ActionBarActivityDelegate.setContentView(View, android.view.ViewGroup$LayoutParams)>
    //    5    9:return          
    }

    public void setSupportProgress(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #168 <Method void ActionBarActivityDelegate.setSupportProgress(int)>
    //    4    8:return          
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #172 <Method void ActionBarActivityDelegate.setSupportProgressBarIndeterminate(boolean)>
    //    4    8:return          
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #175 <Method void ActionBarActivityDelegate.setSupportProgressBarIndeterminateVisibility(boolean)>
    //    4    8:return          
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #178 <Method void ActionBarActivityDelegate.setSupportProgressBarVisibility(boolean)>
    //    4    8:return          
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #182 <Method ActionMode ActionBarActivityDelegate.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
    //    4    8:areturn         
    }

    void superAddContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #184 <Method void FragmentActivity.addContentView(View, android.view.ViewGroup$LayoutParams)>
    //    4    6:return          
    }

    boolean superOnCreatePanelMenu(int i, Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #186 <Method boolean FragmentActivity.onCreatePanelMenu(int, Menu)>
    //    4    6:ireturn         
    }

    boolean superOnMenuItemSelected(int i, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #188 <Method boolean FragmentActivity.onMenuItemSelected(int, MenuItem)>
    //    4    6:ireturn         
    }

    boolean superOnPreparePanel(int i, View view, Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #190 <Method boolean FragmentActivity.onPreparePanel(int, View, Menu)>
    //    5    7:ireturn         
    }

    void superSetContentView(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #192 <Method void FragmentActivity.setContentView(int)>
    //    3    5:return          
    }

    void superSetContentView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #193 <Method void FragmentActivity.setContentView(View)>
    //    3    5:return          
    }

    void superSetContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #194 <Method void FragmentActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
    //    4    6:return          
    }

    public void supportInvalidateOptionsMenu()
    {
    //    0    0:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          12
    //    3    8:aload_0         
    //    4    9:invokespecial   #203 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
    //    5   12:aload_0         
    //    6   13:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    7   16:invokevirtual   #204 <Method void ActionBarActivityDelegate.supportInvalidateOptionsMenu()>
    //    8   19:return          
    }

    public void supportNavigateUpTo(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #208 <Method void NavUtils.navigateUpTo(android.app.Activity, Intent)>
    //    3    5:return          
    }

    public boolean supportRequestWindowFeature(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivityDelegate mImpl>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #212 <Method boolean ActionBarActivityDelegate.supportRequestWindowFeature(int)>
    //    4    8:ireturn         
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #216 <Method boolean NavUtils.shouldUpRecreateTask(android.app.Activity, Intent)>
    //    3    5:ireturn         
    }

    ActionBarActivityDelegate mImpl;
}
