// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//            ActionBarImplBase, ActionBarActivity

class ActionBarImplHC extends ActionBarImplBase
    implements android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener
{
    private class CallbackWrapper
        implements android.view.ActionMode.Callback
    {

        CallbackWrapper(android.view.ActionMode.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarImplHC this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field android.view.ActionMode$Callback mWrappedCallback>
        //    8   14:return          
        }

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #23  <Method boolean android.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
        //    5   11:ireturn         
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #27  <Method boolean android.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
        //    5   11:istore_3        
        //    6   12:iload_3         
        //    7   13:ifeq            32
        //    8   16:aload_0         
        //    9   17:getfield        #14  <Field ActionBarImplHC this$0>
        //   10   20:aload_1         
        //   11   21:invokestatic    #33  <Method ActionMode ActionBarImplHC.access$002(ActionBarImplHC, ActionMode)>
        //   12   24:pop             
        //   13   25:aload_0         
        //   14   26:getfield        #14  <Field ActionBarImplHC this$0>
        //   15   29:invokevirtual   #36  <Method void ActionBarImplHC.showForActionMode()>
        //   16   32:iload_3         
        //   17   33:ireturn         
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_1         
        //    3    5:invokeinterface #40  <Method void android.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionBarImplHC this$0>
        //    6   14:invokevirtual   #43  <Method void ActionBarImplHC.hideForActionMode()>
        //    7   17:aload_0         
        //    8   18:getfield        #14  <Field ActionBarImplHC this$0>
        //    9   21:aconst_null     
        //   10   22:invokestatic    #33  <Method ActionMode ActionBarImplHC.access$002(ActionBarImplHC, ActionMode)>
        //   11   25:pop             
        //   12   26:return          
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #46  <Method boolean android.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
        //    5   11:ireturn         
        }

        private final android.view.ActionMode.Callback mWrappedCallback;
        final ActionBarImplHC this$0;
    }


    public ActionBarImplHC(ActionBarActivity actionbaractivity, ActionBar.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #14  <Method void ActionBarImplBase(ActionBarActivity, ActionBar$Callback)>
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:getstatic       #20  <Field int android.support.v7.appcompat.R$id.action_bar_root>
    //    7   11:invokevirtual   #26  <Method android.view.View ActionBarActivity.findViewById(int)>
    //    8   14:checkcast       #28  <Class NativeActionModeAwareLayout>
    //    9   17:putfield        #30  <Field NativeActionModeAwareLayout mNativeActionModeAwareLayout>
    //   10   20:aload_0         
    //   11   21:getfield        #30  <Field NativeActionModeAwareLayout mNativeActionModeAwareLayout>
    //   12   24:ifnull          35
    //   13   27:aload_0         
    //   14   28:getfield        #30  <Field NativeActionModeAwareLayout mNativeActionModeAwareLayout>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #34  <Method void NativeActionModeAwareLayout.setActionModeForChildListener(android.support.v7.internal.widget.NativeActionModeAwareLayout$OnActionModeForChildListener)>
    //   17   35:return          
    }

    static ActionMode access$002(ActionBarImplHC actionbarimplhc, ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #38  <Field ActionMode mCurActionMode>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #38  <Field ActionMode mCurActionMode>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    public void hide()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void ActionBarImplBase.hide()>
    //    2    4:aload_0         
    //    3    5:getfield        #38  <Field ActionMode mCurActionMode>
    //    4    8:ifnull          18
    //    5   11:aload_0         
    //    6   12:getfield        #38  <Field ActionMode mCurActionMode>
    //    7   15:invokevirtual   #47  <Method void ActionMode.finish()>
    //    8   18:return          
    }

    boolean isShowHideAnimationEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field ActionMode mCurActionMode>
    //    2    4:ifnonnull       16
    //    3    7:aload_0         
    //    4    8:invokespecial   #51  <Method boolean ActionBarImplBase.isShowHideAnimationEnabled()>
    //    5   11:ifeq            16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    public android.view.ActionMode.Callback onActionModeForChild(android.view.ActionMode.Callback callback)
    {
    //    0    0:new             #55  <Class ActionBarImplHC$CallbackWrapper>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #58  <Method void ActionBarImplHC$CallbackWrapper(ActionBarImplHC, android.view.ActionMode$Callback)>
    //    5    9:areturn         
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #61  <Method void ActionBarImplBase.show()>
    //    2    4:aload_0         
    //    3    5:getfield        #38  <Field ActionMode mCurActionMode>
    //    4    8:ifnull          18
    //    5   11:aload_0         
    //    6   12:getfield        #38  <Field ActionMode mCurActionMode>
    //    7   15:invokevirtual   #47  <Method void ActionMode.finish()>
    //    8   18:return          
    }

    private ActionMode mCurActionMode;
    final NativeActionModeAwareLayout mNativeActionModeAwareLayout;

    static ActionMode access$002(ActionBarImplHC actionbarimplhc, ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #38  <Field ActionMode mCurActionMode>
    //    3    5:aload_1         
    //    4    6:areturn         
    }
}
