// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            MarginLayoutParamsCompatJellybeanMr1

public class MarginLayoutParamsCompat
{
    static interface MarginLayoutParamsCompatImpl
    {

        public abstract int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

        public abstract void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

        public abstract void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

        public abstract void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);
    }

    static class MarginLayoutParamsCompatImplBase
        implements MarginLayoutParamsCompatImpl
    {

        MarginLayoutParamsCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #19  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
        //    2    4:ireturn         
        }

        public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
        //    2    4:ireturn         
        }

        public boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:return          
        }

        public void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:return          
        }

        public void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:putfield        #19  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
        //    3    5:return          
        }

        public void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:putfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
        //    3    5:return          
        }
    }

    static class MarginLayoutParamsCompatImplJbMr1
        implements MarginLayoutParamsCompatImpl
    {

        MarginLayoutParamsCompatImplJbMr1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method int MarginLayoutParamsCompatJellybeanMr1.getLayoutDirection(android.view.ViewGroup$MarginLayoutParams)>
        //    2    4:ireturn         
        }

        public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method int MarginLayoutParamsCompatJellybeanMr1.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
        //    2    4:ireturn         
        }

        public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #22  <Method int MarginLayoutParamsCompatJellybeanMr1.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
        //    2    4:ireturn         
        }

        public boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #26  <Method boolean MarginLayoutParamsCompatJellybeanMr1.isMarginRelative(android.view.ViewGroup$MarginLayoutParams)>
        //    2    4:ireturn         
        }

        public void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #30  <Method void MarginLayoutParamsCompatJellybeanMr1.resolveLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
        //    3    5:return          
        }

        public void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #33  <Method void MarginLayoutParamsCompatJellybeanMr1.setLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
        //    3    5:return          
        }

        public void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #36  <Method void MarginLayoutParamsCompatJellybeanMr1.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
        //    3    5:return          
        }

        public void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #39  <Method void MarginLayoutParamsCompatJellybeanMr1.setMarginStart(android.view.ViewGroup$MarginLayoutParams, int)>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          17
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1()>
    //    6   15:putstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase()>
    //   11   26:putstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //   12   29:return          
    }

    public MarginLayoutParamsCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #31  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getLayoutDirection(android.view.ViewGroup$MarginLayoutParams)>
    //    3    9:ireturn         
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #34  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
    //    3    9:ireturn         
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #37  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
    //    3    9:ireturn         
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #41  <Method boolean MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.isMarginRelative(android.view.ViewGroup$MarginLayoutParams)>
    //    3    9:ireturn         
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #45  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.resolveLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
    //    4   10:return          
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #48  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
    //    4   10:return          
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #51  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
    //    4   10:return          
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
    //    0    0:getstatic       #21  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #54  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setMarginStart(android.view.ViewGroup$MarginLayoutParams, int)>
    //    4   10:return          
    }

    static final MarginLayoutParamsCompatImpl IMPL;
}
