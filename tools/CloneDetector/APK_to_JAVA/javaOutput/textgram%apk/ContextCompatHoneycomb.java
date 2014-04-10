// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import java.io.File;

class ContextCompatHoneycomb
{

    ContextCompatHoneycomb()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static File getObbDir(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #15  <Method File Context.getObbDir()>
    //    2    4:areturn         
    }

    static void startActivities(Context context, Intent aintent[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #20  <Method void Context.startActivities(Intent[])>
    //    3    5:return          
    }
}
