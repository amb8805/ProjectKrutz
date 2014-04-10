// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.Context;
import java.io.File;

class ContextCompatKitKat
{

    ContextCompatKitKat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static File[] getExternalCacheDirs(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #15  <Method File[] Context.getExternalCacheDirs()>
    //    2    4:areturn         
    }

    public static File[] getExternalFilesDirs(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #20  <Method File[] Context.getExternalFilesDirs(String)>
    //    3    5:areturn         
    }

    public static File[] getObbDirs(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #23  <Method File[] Context.getObbDirs()>
    //    2    4:areturn         
    }
}
