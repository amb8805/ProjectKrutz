// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat, AccessibilityEventCompatIcs

public class AccessibilityEventCompat
{
    static class AccessibilityEventIcsImpl extends AccessibilityEventStubImpl
    {

        AccessibilityEventIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityEventCompat$AccessibilityEventStubImpl()>
        //    2    4:return          
        }

        public void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #14  <Method void AccessibilityEventCompatIcs.appendRecord(AccessibilityEvent, Object)>
        //    3    5:return          
        }

        public Object getRecord(AccessibilityEvent accessibilityevent, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method Object AccessibilityEventCompatIcs.getRecord(AccessibilityEvent, int)>
        //    3    5:areturn         
        }

        public int getRecordCount(AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #22  <Method int AccessibilityEventCompatIcs.getRecordCount(AccessibilityEvent)>
        //    2    4:ireturn         
        }
    }

    static class AccessibilityEventStubImpl
        implements AccessibilityEventVersionImpl
    {

        AccessibilityEventStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
        {
        //    0    0:return          
        }

        public Object getRecord(AccessibilityEvent accessibilityevent, int i)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public int getRecordCount(AccessibilityEvent accessibilityevent)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }
    }

    static interface AccessibilityEventVersionImpl
    {

        public abstract void appendRecord(AccessibilityEvent accessibilityevent, Object obj);

        public abstract Object getRecord(AccessibilityEvent accessibilityevent, int i);

        public abstract int getRecordCount(AccessibilityEvent accessibilityevent);
    }


    static 
    {
    //    0    0:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #48  <Class AccessibilityEventCompat$AccessibilityEventIcsImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #51  <Method void AccessibilityEventCompat$AccessibilityEventIcsImpl()>
    //    6   15:putstatic       #53  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
    //    7   18:return          
    //    8   19:new             #55  <Class AccessibilityEventCompat$AccessibilityEventStubImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #56  <Method void AccessibilityEventCompat$AccessibilityEventStubImpl()>
    //   11   26:putstatic       #53  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
    //   12   29:return          
    }

    private AccessibilityEventCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #57  <Method void Object()>
    //    2    4:return          
    }

    public static void appendRecord(AccessibilityEvent accessibilityevent, AccessibilityRecordCompat accessibilityrecordcompat)
    {
    //    0    0:getstatic       #53  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokevirtual   #65  <Method Object AccessibilityRecordCompat.getImpl()>
    //    4    8:invokeinterface #70  <Method void AccessibilityEventCompat$AccessibilityEventVersionImpl.appendRecord(AccessibilityEvent, Object)>
    //    5   13:return          
    }

    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
    {
    //    0    0:new             #61  <Class AccessibilityRecordCompat>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #75  <Method void AccessibilityRecordCompat(Object)>
    //    4    8:areturn         
    }

    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityevent, int i)
    {
    //    0    0:new             #61  <Class AccessibilityRecordCompat>
    //    1    3:dup             
    //    2    4:getstatic       #53  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:invokeinterface #80  <Method Object AccessibilityEventCompat$AccessibilityEventVersionImpl.getRecord(AccessibilityEvent, int)>
    //    6   14:invokespecial   #75  <Method void AccessibilityRecordCompat(Object)>
    //    7   17:areturn         
    }

    public static int getRecordCount(AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #53  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #84  <Method int AccessibilityEventCompat$AccessibilityEventVersionImpl.getRecordCount(AccessibilityEvent)>
    //    3    9:ireturn         
    }

    private static final AccessibilityEventVersionImpl IMPL;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_GESTURE_DETECTION_END = 0x80000;
    public static final int TYPE_GESTURE_DETECTION_START = 0x40000;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 0x200000;
    public static final int TYPE_TOUCH_INTERACTION_START = 0x100000;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 0x10000;
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 0x20000;
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
}
