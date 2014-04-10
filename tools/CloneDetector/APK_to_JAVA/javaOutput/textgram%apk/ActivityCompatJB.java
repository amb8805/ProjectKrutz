// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class ActivityCompatJB
{

    ActivityCompatJB()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void finishAffinity(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #14  <Method void Activity.finishAffinity()>
    //    2    4:return          
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #21  <Method void Context.startActivity(Intent, Bundle)>
    //    4    6:return          
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokevirtual   #26  <Method void Activity.startActivityForResult(Intent, int, Bundle)>
    //    5    7:return          
    }
}
