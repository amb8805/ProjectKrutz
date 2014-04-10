// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

class KeyEventCompatEclair
{

    KeyEventCompatEclair()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:checkcast       #12  <Class android.view.KeyEvent$DispatcherState>
    //    4    6:aload_3         
    //    5    7:invokevirtual   #17  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback, android.view.KeyEvent$DispatcherState, Object)>
    //    6   10:ireturn         
    }

    public static Object getKeyDispatcherState(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #24  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
    //    2    4:areturn         
    }

    public static boolean isTracking(KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #29  <Method boolean KeyEvent.isTracking()>
    //    2    4:ireturn         
    }

    public static void startTracking(KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #33  <Method void KeyEvent.startTracking()>
    //    2    4:return          
    }
}
