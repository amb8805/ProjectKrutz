// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.VelocityTracker;

// Referenced classes of package android.support.v4.view:
//            VelocityTrackerCompatHoneycomb

public class VelocityTrackerCompat
{
    static class BaseVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        BaseVelocityTrackerVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public float getXVelocity(VelocityTracker velocitytracker, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #17  <Method float VelocityTracker.getXVelocity()>
        //    2    4:freturn         
        }

        public float getYVelocity(VelocityTracker velocitytracker, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #20  <Method float VelocityTracker.getYVelocity()>
        //    2    4:freturn         
        }
    }

    static class HoneycombVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        HoneycombVelocityTrackerVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public float getXVelocity(VelocityTracker velocitytracker, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #16  <Method float VelocityTrackerCompatHoneycomb.getXVelocity(VelocityTracker, int)>
        //    3    5:freturn         
        }

        public float getYVelocity(VelocityTracker velocitytracker, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #19  <Method float VelocityTrackerCompatHoneycomb.getYVelocity(VelocityTracker, int)>
        //    3    5:freturn         
        }
    }

    static interface VelocityTrackerVersionImpl
    {

        public abstract float getXVelocity(VelocityTracker velocitytracker, int i);

        public abstract float getYVelocity(VelocityTracker velocitytracker, int i);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl()>
    //    6   15:putstatic       #21  <Field VelocityTrackerCompat$VelocityTrackerVersionImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class VelocityTrackerCompat$BaseVelocityTrackerVersionImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void VelocityTrackerCompat$BaseVelocityTrackerVersionImpl()>
    //   11   26:putstatic       #21  <Field VelocityTrackerCompat$VelocityTrackerVersionImpl IMPL>
    //   12   29:return          
    }

    public VelocityTrackerCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static float getXVelocity(VelocityTracker velocitytracker, int i)
    {
    //    0    0:getstatic       #21  <Field VelocityTrackerCompat$VelocityTrackerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #31  <Method float VelocityTrackerCompat$VelocityTrackerVersionImpl.getXVelocity(VelocityTracker, int)>
    //    4   10:freturn         
    }

    public static float getYVelocity(VelocityTracker velocitytracker, int i)
    {
    //    0    0:getstatic       #21  <Field VelocityTrackerCompat$VelocityTrackerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #34  <Method float VelocityTrackerCompat$VelocityTrackerVersionImpl.getYVelocity(VelocityTracker, int)>
    //    4   10:freturn         
    }

    static final VelocityTrackerVersionImpl IMPL;
}
