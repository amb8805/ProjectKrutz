// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class NavUtilsJB
{

    NavUtilsJB()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static Intent getParentActivityIntent(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #15  <Method Intent Activity.getParentActivityIntent()>
    //    2    4:areturn         
    }

    public static String getParentActivityName(ActivityInfo activityinfo)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field String ActivityInfo.parentActivityName>
    //    2    4:areturn         
    }

    public static void navigateUpTo(Activity activity, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #28  <Method boolean Activity.navigateUpTo(Intent)>
    //    3    5:pop             
    //    4    6:return          
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #32  <Method boolean Activity.shouldUpRecreateTask(Intent)>
    //    3    5:ireturn         
    }
}
