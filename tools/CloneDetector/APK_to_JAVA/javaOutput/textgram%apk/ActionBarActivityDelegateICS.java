// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.internal.view.ActionModeWrapper;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBarActivity, ActionBarImplICS, ActionBar

class ActionBarActivityDelegateICS extends ActionBarActivityDelegate
{
    class WindowCallbackWrapper
        implements android.view.Window.Callback
    {

        public WindowCallbackWrapper(android.view.Window.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarActivityDelegateICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field android.view.Window$Callback mWrapped>
        //    8   14:return          
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #23  <Method boolean android.view.Window$Callback.dispatchGenericMotionEvent(MotionEvent)>
        //    4   10:ireturn         
        }

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #27  <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
        //    4   10:ireturn         
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #30  <Method boolean android.view.Window$Callback.dispatchKeyShortcutEvent(KeyEvent)>
        //    4   10:ireturn         
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #34  <Method boolean android.view.Window$Callback.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
        //    4   10:ireturn         
        }

        public boolean dispatchTouchEvent(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #37  <Method boolean android.view.Window$Callback.dispatchTouchEvent(MotionEvent)>
        //    4   10:ireturn         
        }

        public boolean dispatchTrackballEvent(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #40  <Method boolean android.view.Window$Callback.dispatchTrackballEvent(MotionEvent)>
        //    4   10:ireturn         
        }

        public void onActionModeFinished(ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #44  <Method void android.view.Window$Callback.onActionModeFinished(ActionMode)>
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionBarActivityDelegateICS this$0>
        //    6   14:aload_1         
        //    7   15:invokevirtual   #47  <Method void ActionBarActivityDelegateICS.onActionModeFinished(ActionMode)>
        //    8   18:return          
        }

        public void onActionModeStarted(ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #50  <Method void android.view.Window$Callback.onActionModeStarted(ActionMode)>
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionBarActivityDelegateICS this$0>
        //    6   14:aload_1         
        //    7   15:invokevirtual   #51  <Method void ActionBarActivityDelegateICS.onActionModeStarted(ActionMode)>
        //    8   18:return          
        }

        public void onAttachedToWindow()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:invokeinterface #54  <Method void android.view.Window$Callback.onAttachedToWindow()>
        //    3    9:return          
        }

        public void onContentChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:invokeinterface #57  <Method void android.view.Window$Callback.onContentChanged()>
        //    3    9:return          
        }

        public boolean onCreatePanelMenu(int i, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #61  <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
        //    5   11:ireturn         
        }

        public View onCreatePanelView(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:invokeinterface #65  <Method View android.view.Window$Callback.onCreatePanelView(int)>
        //    4   10:areturn         
        }

        public void onDetachedFromWindow()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:invokeinterface #68  <Method void android.view.Window$Callback.onDetachedFromWindow()>
        //    3    9:return          
        }

        public boolean onMenuItemSelected(int i, MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #72  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
        //    5   11:ireturn         
        }

        public boolean onMenuOpened(int i, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #75  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
        //    5   11:ireturn         
        }

        public void onPanelClosed(int i, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #79  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
        //    5   11:return          
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokeinterface #83  <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
        //    6   12:ireturn         
        }

        public boolean onSearchRequested()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:invokeinterface #87  <Method boolean android.view.Window$Callback.onSearchRequested()>
        //    3    9:ireturn         
        }

        public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #91  <Method void android.view.Window$Callback.onWindowAttributesChanged(android.view.WindowManager$LayoutParams)>
        //    4   10:return          
        }

        public void onWindowFocusChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:iload_1         
        //    3    5:invokeinterface #95  <Method void android.view.Window$Callback.onWindowFocusChanged(boolean)>
        //    4   10:return          
        }

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #99  <Method ActionMode android.view.Window$Callback.onWindowStartingActionMode(android.view.ActionMode$Callback)>
        //    4   10:areturn         
        }

        final android.view.Window.Callback mWrapped;
        final ActionBarActivityDelegateICS this$0;
    }


    ActionBarActivityDelegateICS(ActionBarActivity actionbaractivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #10  <Method void ActionBarActivityDelegate(ActionBarActivity)>
    //    3    5:return          
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #21  <Method void ActionBarActivity.superAddContentView(View, android.view.ViewGroup$LayoutParams)>
    //    5    9:return          
    }

    public ActionBar createSupportActionBar()
    {
    //    0    0:new             #25  <Class ActionBarImplICS>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #16  <Field ActionBarActivity mActivity>
    //    4    8:aload_0         
    //    5    9:getfield        #16  <Field ActionBarActivity mActivity>
    //    6   12:invokespecial   #28  <Method void ActionBarImplICS(android.app.Activity, ActionBar$Callback)>
    //    7   15:areturn         
    }

    android.view.Window.Callback createWindowCallbackWrapper(android.view.Window.Callback callback)
    {
    //    0    0:new             #32  <Class ActionBarActivityDelegateICS$WindowCallbackWrapper>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #35  <Method void ActionBarActivityDelegateICS$WindowCallbackWrapper(ActionBarActivityDelegateICS, android.view.Window$Callback)>
    //    5    9:areturn         
    }

    public android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:new             #41  <Class ActionModeWrapper>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokevirtual   #45  <Method android.content.Context getActionBarThemedContext()>
    //    6   12:aload_1         
    //    7   13:invokespecial   #48  <Method void ActionModeWrapper(android.content.Context, ActionMode)>
    //    8   16:invokevirtual   #52  <Method void ActionBarActivity.onSupportActionModeFinished(android.support.v7.view.ActionMode)>
    //    9   19:return          
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:new             #41  <Class ActionModeWrapper>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokevirtual   #45  <Method android.content.Context getActionBarThemedContext()>
    //    6   12:aload_1         
    //    7   13:invokespecial   #48  <Method void ActionModeWrapper(android.content.Context, ActionMode)>
    //    8   16:invokevirtual   #56  <Method void ActionBarActivity.onSupportActionModeStarted(android.support.v7.view.ActionMode)>
    //    9   19:return          
    }

    public boolean onBackPressed()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:return          
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:ldc1            #64  <String "splitActionBarWhenNarrow">
    //    1    2:aload_0         
    //    2    3:invokevirtual   #68  <Method String getUiOptionsFromMetadata()>
    //    3    6:invokevirtual   #74  <Method boolean String.equals(Object)>
    //    4    9:ifeq            24
    //    5   12:aload_0         
    //    6   13:getfield        #16  <Field ActionBarActivity mActivity>
    //    7   16:invokevirtual   #78  <Method Window ActionBarActivity.getWindow()>
    //    8   19:iconst_1        
    //    9   20:iconst_1        
    //   10   21:invokevirtual   #84  <Method void Window.setUiOptions(int, int)>
    //   11   24:aload_0         
    //   12   25:aload_1         
    //   13   26:invokespecial   #86  <Method void ActionBarActivityDelegate.onCreate(Bundle)>
    //   14   29:aload_0         
    //   15   30:getfield        #90  <Field boolean mHasActionBar>
    //   16   33:ifeq            46
    //   17   36:aload_0         
    //   18   37:getfield        #16  <Field ActionBarActivity mActivity>
    //   19   40:bipush          8
    //   20   42:invokevirtual   #94  <Method boolean ActionBarActivity.requestWindowFeature(int)>
    //   21   45:pop             
    //   22   46:aload_0         
    //   23   47:getfield        #97  <Field boolean mOverlayActionBar>
    //   24   50:ifeq            63
    //   25   53:aload_0         
    //   26   54:getfield        #16  <Field ActionBarActivity mActivity>
    //   27   57:bipush          9
    //   28   59:invokevirtual   #94  <Method boolean ActionBarActivity.requestWindowFeature(int)>
    //   29   62:pop             
    //   30   63:aload_0         
    //   31   64:getfield        #16  <Field ActionBarActivity mActivity>
    //   32   67:invokevirtual   #78  <Method Window ActionBarActivity.getWindow()>
    //   33   70:astore_2        
    //   34   71:aload_2         
    //   35   72:aload_0         
    //   36   73:aload_2         
    //   37   74:invokevirtual   #101 <Method android.view.Window$Callback Window.getCallback()>
    //   38   77:invokevirtual   #103 <Method android.view.Window$Callback createWindowCallbackWrapper(android.view.Window$Callback)>
    //   39   80:invokevirtual   #107 <Method void Window.setCallback(android.view.Window$Callback)>
    //   40   83:return          
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            10
    //    2    4:iload_1         
    //    3    5:bipush          8
    //    4    7:icmpne          38
    //    5   10:aload_0         
    //    6   11:getfield        #111 <Field Menu mMenu>
    //    7   14:ifnonnull       25
    //    8   17:aload_0         
    //    9   18:aload_2         
    //   10   19:invokestatic    #117 <Method Menu MenuWrapperFactory.createMenuWrapper(Menu)>
    //   11   22:putfield        #111 <Field Menu mMenu>
    //   12   25:aload_0         
    //   13   26:getfield        #16  <Field ActionBarActivity mActivity>
    //   14   29:iload_1         
    //   15   30:aload_0         
    //   16   31:getfield        #111 <Field Menu mMenu>
    //   17   34:invokevirtual   #120 <Method boolean ActionBarActivity.superOnCreatePanelMenu(int, Menu)>
    //   18   37:ireturn         
    //   19   38:aload_0         
    //   20   39:getfield        #16  <Field ActionBarActivity mActivity>
    //   21   42:iload_1         
    //   22   43:aload_2         
    //   23   44:invokevirtual   #120 <Method boolean ActionBarActivity.superOnCreatePanelMenu(int, Menu)>
    //   24   47:ireturn         
    }

    public View onCreatePanelView(int i)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
    //    0    0:iload_1         
    //    1    1:ifne            9
    //    2    4:aload_2         
    //    3    5:invokestatic    #128 <Method MenuItem MenuWrapperFactory.createMenuItemWrapper(MenuItem)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #16  <Field ActionBarActivity mActivity>
    //    7   13:iload_1         
    //    8   14:aload_2         
    //    9   15:invokevirtual   #131 <Method boolean ActionBarActivity.superOnMenuItemSelected(int, MenuItem)>
    //   10   18:ireturn         
    }

    public void onPostResume()
    {
    //    0    0:return          
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            10
    //    2    4:iload_1         
    //    3    5:bipush          8
    //    4    7:icmpne          24
    //    5   10:aload_0         
    //    6   11:getfield        #16  <Field ActionBarActivity mActivity>
    //    7   14:iload_1         
    //    8   15:aload_2         
    //    9   16:aload_0         
    //   10   17:getfield        #111 <Field Menu mMenu>
    //   11   20:invokevirtual   #138 <Method boolean ActionBarActivity.superOnPreparePanel(int, View, Menu)>
    //   12   23:ireturn         
    //   13   24:aload_0         
    //   14   25:getfield        #16  <Field ActionBarActivity mActivity>
    //   15   28:iload_1         
    //   16   29:aload_2         
    //   17   30:aload_3         
    //   18   31:invokevirtual   #138 <Method boolean ActionBarActivity.superOnPreparePanel(int, View, Menu)>
    //   19   34:ireturn         
    }

    public void onStop()
    {
    //    0    0:return          
    }

    public void onTitleChanged(CharSequence charsequence)
    {
    //    0    0:return          
    }

    public void setContentView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #146 <Method void ActionBarActivity.superSetContentView(int)>
    //    4    8:return          
    }

    public void setContentView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #149 <Method void ActionBarActivity.superSetContentView(View)>
    //    4    8:return          
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #151 <Method void ActionBarActivity.superSetContentView(View, android.view.ViewGroup$LayoutParams)>
    //    5    9:return          
    }

    void setSupportProgress(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #155 <Method void ActionBarActivity.setProgress(int)>
    //    4    8:return          
    }

    void setSupportProgressBarIndeterminate(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #160 <Method void ActionBarActivity.setProgressBarIndeterminate(boolean)>
    //    4    8:return          
    }

    void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #164 <Method void ActionBarActivity.setProgressBarIndeterminateVisibility(boolean)>
    //    4    8:return          
    }

    void setSupportProgressBarVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #168 <Method void ActionBarActivity.setProgressBarVisibility(boolean)>
    //    4    8:return          
    }

    public android.support.v7.view.ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #172 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #174 <String "ActionMode callback can not be null.">
    //    5   10:invokespecial   #177 <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:invokevirtual   #45  <Method android.content.Context getActionBarThemedContext()>
    //    9   18:astore_2        
    //   10   19:new             #179 <Class android.support.v7.internal.view.ActionModeWrapper$CallbackWrapper>
    //   11   22:dup             
    //   12   23:aload_2         
    //   13   24:aload_1         
    //   14   25:invokespecial   #182 <Method void android.support.v7.internal.view.ActionModeWrapper$CallbackWrapper(android.content.Context, android.support.v7.view.ActionMode$Callback)>
    //   15   28:astore_3        
    //   16   29:aload_0         
    //   17   30:getfield        #16  <Field ActionBarActivity mActivity>
    //   18   33:aload_3         
    //   19   34:invokevirtual   #186 <Method ActionMode ActionBarActivity.startActionMode(android.view.ActionMode$Callback)>
    //   20   37:astore          4
    //   21   39:aconst_null     
    //   22   40:astore          5
    //   23   42:aload           4
    //   24   44:ifnull          71
    //   25   47:new             #41  <Class ActionModeWrapper>
    //   26   50:dup             
    //   27   51:aload_2         
    //   28   52:aload_0         
    //   29   53:getfield        #16  <Field ActionBarActivity mActivity>
    //   30   56:aload_3         
    //   31   57:invokevirtual   #186 <Method ActionMode ActionBarActivity.startActionMode(android.view.ActionMode$Callback)>
    //   32   60:invokespecial   #48  <Method void ActionModeWrapper(android.content.Context, ActionMode)>
    //   33   63:astore          5
    //   34   65:aload_3         
    //   35   66:aload           5
    //   36   68:invokevirtual   #190 <Method void android.support.v7.internal.view.ActionModeWrapper$CallbackWrapper.setLastStartedActionMode(ActionModeWrapper)>
    //   37   71:aload           5
    //   38   73:areturn         
    }

    public void supportInvalidateOptionsMenu()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #111 <Field Menu mMenu>
    //    3    5:return          
    }

    public boolean supportRequestWindowFeature(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field ActionBarActivity mActivity>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #94  <Method boolean ActionBarActivity.requestWindowFeature(int)>
    //    4    8:ireturn         
    }

    Menu mMenu;
}
