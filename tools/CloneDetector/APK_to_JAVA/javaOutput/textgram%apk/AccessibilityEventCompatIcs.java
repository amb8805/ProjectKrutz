// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

class AccessibilityEventCompatIcs
{

    AccessibilityEventCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #12  <Class AccessibilityRecord>
    //    3    5:invokevirtual   #17  <Method void AccessibilityEvent.appendRecord(AccessibilityRecord)>
    //    4    8:return          
    }

    public static Object getRecord(AccessibilityEvent accessibilityevent, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #22  <Method AccessibilityRecord AccessibilityEvent.getRecord(int)>
    //    3    5:areturn         
    }

    public static int getRecordCount(AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #27  <Method int AccessibilityEvent.getRecordCount()>
    //    2    4:ireturn         
    }
}
