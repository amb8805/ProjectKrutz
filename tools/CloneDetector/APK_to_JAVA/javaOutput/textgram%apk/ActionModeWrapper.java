// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view:
//            SupportMenuInflater

public class ActionModeWrapper extends ActionMode
{
    public static class CallbackWrapper
        implements android.view.ActionMode.Callback
    {

        public CallbackWrapper(Context context, android.support.v7.view.ActionMode.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #17  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #19  <Field Context mContext>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #21  <Field android.support.v7.view.ActionMode$Callback mWrappedCallback>
        //    8   14:return          
        }

        private ActionMode getActionModeWrapper(android.view.ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field ActionModeWrapper mLastStartedActionMode>
        //    2    4:ifnull          23
        //    3    7:aload_0         
        //    4    8:getfield        #25  <Field ActionModeWrapper mLastStartedActionMode>
        //    5   11:getfield        #31  <Field android.view.ActionMode ActionModeWrapper.mWrappedObject>
        //    6   14:aload_1         
        //    7   15:if_acmpne       23
        //    8   18:aload_0         
        //    9   19:getfield        #25  <Field ActionModeWrapper mLastStartedActionMode>
        //   10   22:areturn         
        //   11   23:new             #27  <Class ActionModeWrapper>
        //   12   26:dup             
        //   13   27:aload_0         
        //   14   28:getfield        #19  <Field Context mContext>
        //   15   31:aload_1         
        //   16   32:invokespecial   #34  <Method void ActionModeWrapper(Context, android.view.ActionMode)>
        //   17   35:areturn         
        }

        public boolean onActionItemClicked(android.view.ActionMode actionmode, MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field android.support.v7.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #38  <Method ActionMode getActionModeWrapper(android.view.ActionMode)>
        //    5    9:aload_2         
        //    6   10:invokestatic    #44  <Method MenuItem MenuWrapperFactory.createMenuItemWrapper(MenuItem)>
        //    7   13:invokeinterface #49  <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
        //    8   18:ireturn         
        }

        public boolean onCreateActionMode(android.view.ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field android.support.v7.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #38  <Method ActionMode getActionModeWrapper(android.view.ActionMode)>
        //    5    9:aload_2         
        //    6   10:invokestatic    #55  <Method Menu MenuWrapperFactory.createMenuWrapper(Menu)>
        //    7   13:invokeinterface #58  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
        //    8   18:ireturn         
        }

        public void onDestroyActionMode(android.view.ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field android.support.v7.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #38  <Method ActionMode getActionModeWrapper(android.view.ActionMode)>
        //    5    9:invokeinterface #63  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
        //    6   14:return          
        }

        public boolean onPrepareActionMode(android.view.ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field android.support.v7.view.ActionMode$Callback mWrappedCallback>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #38  <Method ActionMode getActionModeWrapper(android.view.ActionMode)>
        //    5    9:aload_2         
        //    6   10:invokestatic    #55  <Method Menu MenuWrapperFactory.createMenuWrapper(Menu)>
        //    7   13:invokeinterface #66  <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
        //    8   18:ireturn         
        }

        public void setLastStartedActionMode(ActionModeWrapper actionmodewrapper)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field ActionModeWrapper mLastStartedActionMode>
        //    3    5:return          
        }

        final Context mContext;
        private ActionModeWrapper mLastStartedActionMode;
        final android.support.v7.view.ActionMode.Callback mWrappedCallback;
    }


    public ActionModeWrapper(Context context, android.view.ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void ActionMode()>
    //    2    4:aload_0         
    //    3    5:aload_2         
    //    4    6:putfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    5    9:aload_0         
    //    6   10:new             #17  <Class SupportMenuInflater>
    //    7   13:dup             
    //    8   14:aload_1         
    //    9   15:invokespecial   #20  <Method void SupportMenuInflater(Context)>
    //   10   18:putfield        #22  <Field MenuInflater mInflater>
    //   11   21:return          
    }

    public void finish()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #27  <Method void android.view.ActionMode.finish()>
    //    3    7:return          
    }

    public View getCustomView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #31  <Method View android.view.ActionMode.getCustomView()>
    //    3    7:areturn         
    }

    public Menu getMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #35  <Method Menu android.view.ActionMode.getMenu()>
    //    3    7:invokestatic    #41  <Method Menu MenuWrapperFactory.createMenuWrapper(Menu)>
    //    4   10:areturn         
    }

    public MenuInflater getMenuInflater()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field MenuInflater mInflater>
    //    2    4:areturn         
    }

    public CharSequence getSubtitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #47  <Method CharSequence android.view.ActionMode.getSubtitle()>
    //    3    7:areturn         
    }

    public Object getTag()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #51  <Method Object android.view.ActionMode.getTag()>
    //    3    7:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #54  <Method CharSequence android.view.ActionMode.getTitle()>
    //    3    7:areturn         
    }

    public boolean getTitleOptionalHint()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #58  <Method boolean android.view.ActionMode.getTitleOptionalHint()>
    //    3    7:ireturn         
    }

    public void invalidate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #61  <Method void android.view.ActionMode.invalidate()>
    //    3    7:return          
    }

    public boolean isTitleOptional()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:invokevirtual   #64  <Method boolean android.view.ActionMode.isTitleOptional()>
    //    3    7:ireturn         
    }

    public void setCustomView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #68  <Method void android.view.ActionMode.setCustomView(View)>
    //    4    8:return          
    }

    public void setSubtitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #72  <Method void android.view.ActionMode.setSubtitle(int)>
    //    4    8:return          
    }

    public void setSubtitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #75  <Method void android.view.ActionMode.setSubtitle(CharSequence)>
    //    4    8:return          
    }

    public void setTag(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #79  <Method void android.view.ActionMode.setTag(Object)>
    //    4    8:return          
    }

    public void setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #82  <Method void android.view.ActionMode.setTitle(int)>
    //    4    8:return          
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #84  <Method void android.view.ActionMode.setTitle(CharSequence)>
    //    4    8:return          
    }

    public void setTitleOptionalHint(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field android.view.ActionMode mWrappedObject>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #88  <Method void android.view.ActionMode.setTitleOptionalHint(boolean)>
    //    4    8:return          
    }

    final MenuInflater mInflater;
    final android.view.ActionMode mWrappedObject;
}
