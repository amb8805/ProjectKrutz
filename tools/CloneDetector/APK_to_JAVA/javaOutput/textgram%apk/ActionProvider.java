// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.*;

public abstract class ActionProvider
{
    public static interface SubUiVisibilityListener
    {

        public abstract void onSubUiVisibilityChanged(boolean flag);
    }

    public static interface VisibilityListener
    {

        public abstract void onActionProviderVisibilityChanged(boolean flag);
    }


    public ActionProvider(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #21  <Field Context mContext>
    //    5    9:return          
    }

    public Context getContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field Context mContext>
    //    2    4:areturn         
    }

    public boolean hasSubMenu()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean isVisible()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #31  <Method View onCreateActionView()>
    //    2    4:areturn         
    }

    public boolean onPerformDefaultAction()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    //    0    0:return          
    }

    public boolean overridesItemVisibility()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void refreshVisibility()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field ActionProvider$VisibilityListener mVisibilityListener>
    //    2    4:ifnull          27
    //    3    7:aload_0         
    //    4    8:invokevirtual   #40  <Method boolean overridesItemVisibility()>
    //    5   11:ifeq            27
    //    6   14:aload_0         
    //    7   15:getfield        #38  <Field ActionProvider$VisibilityListener mVisibilityListener>
    //    8   18:aload_0         
    //    9   19:invokevirtual   #42  <Method boolean isVisible()>
    //   10   22:invokeinterface #48  <Method void ActionProvider$VisibilityListener.onActionProviderVisibilityChanged(boolean)>
    //   11   27:return          
    }

    public void setSubUiVisibilityListener(SubUiVisibilityListener subuivisibilitylistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #52  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
    //    3    5:return          
    }

    public void setVisibilityListener(VisibilityListener visibilitylistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field ActionProvider$VisibilityListener mVisibilityListener>
    //    2    4:ifnull          47
    //    3    7:aload_1         
    //    4    8:ifnull          47
    //    5   11:ldc1            #8   <String "ActionProvider(support)">
    //    6   13:new             #56  <Class StringBuilder>
    //    7   16:dup             
    //    8   17:invokespecial   #57  <Method void StringBuilder()>
    //    9   20:ldc1            #59  <String "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ">
    //   10   22:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_0         
    //   12   26:invokevirtual   #67  <Method Class Object.getClass()>
    //   13   29:invokevirtual   #73  <Method String Class.getSimpleName()>
    //   14   32:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   15   35:ldc1            #75  <String " instance while it is still in use somewhere else?">
    //   16   37:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   17   40:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   18   43:invokestatic    #84  <Method int Log.w(String, String)>
    //   19   46:pop             
    //   20   47:aload_0         
    //   21   48:aload_1         
    //   22   49:putfield        #38  <Field ActionProvider$VisibilityListener mVisibilityListener>
    //   23   52:return          
    }

    public void subUiVisibilityChanged(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #52  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #90  <Method void ActionProvider$SubUiVisibilityListener.onSubUiVisibilityChanged(boolean)>
    //    7   17:return          
    }

    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private SubUiVisibilityListener mSubUiVisibilityListener;
    private VisibilityListener mVisibilityListener;
}
