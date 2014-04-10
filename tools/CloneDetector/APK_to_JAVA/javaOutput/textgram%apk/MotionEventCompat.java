// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompatEclair

public class MotionEventCompat
{
    static class BaseMotionEventVersionImpl
        implements MotionEventVersionImpl
    {

        BaseMotionEventVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
        //    0    0:iload_2         
        //    1    1:ifne            6
        //    2    4:iconst_0        
        //    3    5:ireturn         
        //    4    6:iconst_m1       
        //    5    7:ireturn         
        }

        public int getPointerCount(MotionEvent motionevent)
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public int getPointerId(MotionEvent motionevent, int i)
        {
        //    0    0:iload_2         
        //    1    1:ifne            6
        //    2    4:iconst_0        
        //    3    5:ireturn         
        //    4    6:new             #17  <Class IndexOutOfBoundsException>
        //    5    9:dup             
        //    6   10:ldc1            #19  <String "Pre-Eclair does not support multiple pointers">
        //    7   12:invokespecial   #22  <Method void IndexOutOfBoundsException(String)>
        //    8   15:athrow          
        }

        public float getX(MotionEvent motionevent, int i)
        {
        //    0    0:iload_2         
        //    1    1:ifne            9
        //    2    4:aload_1         
        //    3    5:invokevirtual   #29  <Method float MotionEvent.getX()>
        //    4    8:freturn         
        //    5    9:new             #17  <Class IndexOutOfBoundsException>
        //    6   12:dup             
        //    7   13:ldc1            #19  <String "Pre-Eclair does not support multiple pointers">
        //    8   15:invokespecial   #22  <Method void IndexOutOfBoundsException(String)>
        //    9   18:athrow          
        }

        public float getY(MotionEvent motionevent, int i)
        {
        //    0    0:iload_2         
        //    1    1:ifne            9
        //    2    4:aload_1         
        //    3    5:invokevirtual   #32  <Method float MotionEvent.getY()>
        //    4    8:freturn         
        //    5    9:new             #17  <Class IndexOutOfBoundsException>
        //    6   12:dup             
        //    7   13:ldc1            #19  <String "Pre-Eclair does not support multiple pointers">
        //    8   15:invokespecial   #22  <Method void IndexOutOfBoundsException(String)>
        //    9   18:athrow          
        }
    }

    static class EclairMotionEventVersionImpl
        implements MotionEventVersionImpl
    {

        EclairMotionEventVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #16  <Method int MotionEventCompatEclair.findPointerIndex(MotionEvent, int)>
        //    3    5:ireturn         
        }

        public int getPointerCount(MotionEvent motionevent)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #20  <Method int MotionEventCompatEclair.getPointerCount(MotionEvent)>
        //    2    4:ireturn         
        }

        public int getPointerId(MotionEvent motionevent, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #23  <Method int MotionEventCompatEclair.getPointerId(MotionEvent, int)>
        //    3    5:ireturn         
        }

        public float getX(MotionEvent motionevent, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #27  <Method float MotionEventCompatEclair.getX(MotionEvent, int)>
        //    3    5:freturn         
        }

        public float getY(MotionEvent motionevent, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #30  <Method float MotionEventCompatEclair.getY(MotionEvent, int)>
        //    3    5:freturn         
        }
    }

    static interface MotionEventVersionImpl
    {

        public abstract int findPointerIndex(MotionEvent motionevent, int i);

        public abstract int getPointerCount(MotionEvent motionevent);

        public abstract int getPointerId(MotionEvent motionevent, int i);

        public abstract float getX(MotionEvent motionevent, int i);

        public abstract float getY(MotionEvent motionevent, int i);
    }


    static 
    {
    //    0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:iconst_5        
    //    2    4:icmplt          18
    //    3    7:new             #33  <Class MotionEventCompat$EclairMotionEventVersionImpl>
    //    4   10:dup             
    //    5   11:invokespecial   #36  <Method void MotionEventCompat$EclairMotionEventVersionImpl()>
    //    6   14:putstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    7   17:return          
    //    8   18:new             #40  <Class MotionEventCompat$BaseMotionEventVersionImpl>
    //    9   21:dup             
    //   10   22:invokespecial   #41  <Method void MotionEventCompat$BaseMotionEventVersionImpl()>
    //   11   25:putstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //   12   28:return          
    }

    public MotionEventCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void Object()>
    //    2    4:return          
    }

    public static int findPointerIndex(MotionEvent motionevent, int i)
    {
    //    0    0:getstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #48  <Method int MotionEventCompat$MotionEventVersionImpl.findPointerIndex(MotionEvent, int)>
    //    4   10:ireturn         
    }

    public static int getActionIndex(MotionEvent motionevent)
    {
    //    0    0:ldc1            #17  <Int 65280>
    //    1    2:aload_0         
    //    2    3:invokevirtual   #56  <Method int MotionEvent.getAction()>
    //    3    6:iand            
    //    4    7:bipush          8
    //    5    9:ishr            
    //    6   10:ireturn         
    }

    public static int getActionMasked(MotionEvent motionevent)
    {
    //    0    0:sipush          255
    //    1    3:aload_0         
    //    2    4:invokevirtual   #56  <Method int MotionEvent.getAction()>
    //    3    7:iand            
    //    4    8:ireturn         
    }

    public static int getPointerCount(MotionEvent motionevent)
    {
    //    0    0:getstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #60  <Method int MotionEventCompat$MotionEventVersionImpl.getPointerCount(MotionEvent)>
    //    3    9:ireturn         
    }

    public static int getPointerId(MotionEvent motionevent, int i)
    {
    //    0    0:getstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #63  <Method int MotionEventCompat$MotionEventVersionImpl.getPointerId(MotionEvent, int)>
    //    4   10:ireturn         
    }

    public static float getX(MotionEvent motionevent, int i)
    {
    //    0    0:getstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #67  <Method float MotionEventCompat$MotionEventVersionImpl.getX(MotionEvent, int)>
    //    4   10:freturn         
    }

    public static float getY(MotionEvent motionevent, int i)
    {
    //    0    0:getstatic       #38  <Field MotionEventCompat$MotionEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #70  <Method float MotionEventCompat$MotionEventVersionImpl.getY(MotionEvent, int)>
    //    4   10:freturn         
    }

    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_POINTER_DOWN = 5;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_SCROLL = 8;
    static final MotionEventVersionImpl IMPL;
}
