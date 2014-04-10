// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

final class DisplayManagerJellybeanMr1
{

    DisplayManagerJellybeanMr1()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static Display getDisplay(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class DisplayManager>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #15  <Method Display DisplayManager.getDisplay(int)>
    //    4    8:areturn         
    }

    public static Object getDisplayManager(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #19  <String "display">
    //    2    3:invokevirtual   #25  <Method Object Context.getSystemService(String)>
    //    3    6:areturn         
    }

    public static Display[] getDisplays(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class DisplayManager>
    //    2    4:invokevirtual   #30  <Method Display[] DisplayManager.getDisplays()>
    //    3    7:areturn         
    }

    public static Display[] getDisplays(Object obj, String s)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class DisplayManager>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #34  <Method Display[] DisplayManager.getDisplays(String)>
    //    4    8:areturn         
    }
}
