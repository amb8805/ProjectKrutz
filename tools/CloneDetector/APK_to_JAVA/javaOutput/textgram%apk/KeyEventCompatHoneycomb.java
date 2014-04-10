// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.KeyEvent;

class KeyEventCompatHoneycomb
{

    KeyEventCompatHoneycomb()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean metaStateHasModifiers(int i, int j)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:invokestatic    #14  <Method boolean KeyEvent.metaStateHasModifiers(int, int)>
    //    3    5:ireturn         
    }

    public static boolean metaStateHasNoModifiers(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #18  <Method boolean KeyEvent.metaStateHasNoModifiers(int)>
    //    2    4:ireturn         
    }

    public static int normalizeMetaState(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #22  <Method int KeyEvent.normalizeMetaState(int)>
    //    2    4:ireturn         
    }
}
