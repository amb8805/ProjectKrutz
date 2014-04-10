// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarImplHC, ActionBarActivity, ActionBar

class ActionBarActivityDelegateHC extends ActionBarActivityDelegateBase
{

    ActionBarActivityDelegateHC(ActionBarActivity actionbaractivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #8   <Method void ActionBarActivityDelegateBase(ActionBarActivity)>
    //    3    5:return          
    }

    public ActionBar createSupportActionBar()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #14  <Method void ensureSubDecor()>
    //    2    4:new             #16  <Class ActionBarImplHC>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:getfield        #20  <Field ActionBarActivity mActivity>
    //    6   12:aload_0         
    //    7   13:getfield        #20  <Field ActionBarActivity mActivity>
    //    8   16:invokespecial   #23  <Method void ActionBarImplHC(ActionBarActivity, ActionBar$Callback)>
    //    9   19:areturn         
    }

    void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field ActionBarActivity mActivity>
    //    2    4:invokevirtual   #31  <Method Window ActionBarActivity.getWindow()>
    //    3    7:bipush          10
    //    4    9:invokevirtual   #37  <Method boolean Window.requestFeature(int)>
    //    5   12:pop             
    //    6   13:aload_0         
    //    7   14:aload_1         
    //    8   15:invokespecial   #39  <Method void ActionBarActivityDelegateBase.onCreate(Bundle)>
    //    9   18:return          
    }
}
