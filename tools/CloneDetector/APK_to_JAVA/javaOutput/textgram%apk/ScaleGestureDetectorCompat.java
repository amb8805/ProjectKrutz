// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            ScaleGestureDetectorCompatKitKat

public class ScaleGestureDetectorCompat
{
    private static class BaseScaleGestureDetectorImpl
        implements ScaleGestureDetectorImpl
    {

        private BaseScaleGestureDetectorImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        BaseScaleGestureDetectorImpl(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl()>
        //    2    4:return          
        }

        public boolean isQuickScaleEnabled(Object obj)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void setQuickScaleEnabled(Object obj, boolean flag)
        {
        //    0    0:return          
        }
    }

    private static class ScaleGestureDetectorCompatKitKatImpl
        implements ScaleGestureDetectorImpl
    {

        private ScaleGestureDetectorCompatKitKatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        ScaleGestureDetectorCompatKitKatImpl(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl()>
        //    2    4:return          
        }

        public boolean isQuickScaleEnabled(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #18  <Method boolean ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(Object)>
        //    2    4:ireturn         
        }

        public void setQuickScaleEnabled(Object obj, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #22  <Method void ScaleGestureDetectorCompatKitKat.setQuickScaleEnabled(Object, boolean)>
        //    3    5:return          
        }
    }

    static interface ScaleGestureDetectorImpl
    {

        public abstract boolean isQuickScaleEnabled(Object obj);

        public abstract void setQuickScaleEnabled(Object obj, boolean flag);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          20
    //    3    8:new             #16  <Class ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl>
    //    4   11:dup             
    //    5   12:aconst_null     
    //    6   13:invokespecial   #20  <Method void ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl(ScaleGestureDetectorCompat$1)>
    //    7   16:putstatic       #22  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
    //    8   19:return          
    //    9   20:new             #24  <Class ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl>
    //   10   23:dup             
    //   11   24:aconst_null     
    //   12   25:invokespecial   #25  <Method void ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl(ScaleGestureDetectorCompat$1)>
    //   13   28:putstatic       #22  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
    //   14   31:return          
    }

    private ScaleGestureDetectorCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #27  <Method void Object()>
    //    2    4:return          
    }

    public static boolean isQuickScaleEnabled(Object obj)
    {
    //    0    0:getstatic       #22  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #33  <Method boolean ScaleGestureDetectorCompat$ScaleGestureDetectorImpl.isQuickScaleEnabled(Object)>
    //    3    9:ireturn         
    }

    public static void setQuickScaleEnabled(Object obj, boolean flag)
    {
    //    0    0:getstatic       #22  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #37  <Method void ScaleGestureDetectorCompat$ScaleGestureDetectorImpl.setQuickScaleEnabled(Object, boolean)>
    //    4   10:return          
    }

    static final ScaleGestureDetectorImpl IMPL;

    // Unreferenced inner class android/support/v4/view/ScaleGestureDetectorCompat$1

/* anonymous class */
    static class _cls1
    {
    }

}
