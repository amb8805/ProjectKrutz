// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatHoneycomb, DrawableCompatKitKat

public class DrawableCompat
{
    static class BaseDrawableImpl
        implements DrawableImpl
    {

        BaseDrawableImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean isAutoMirrored(Drawable drawable)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void jumpToCurrentState(Drawable drawable)
        {
        //    0    0:return          
        }

        public void setAutoMirrored(Drawable drawable, boolean flag)
        {
        //    0    0:return          
        }
    }

    static interface DrawableImpl
    {

        public abstract boolean isAutoMirrored(Drawable drawable);

        public abstract void jumpToCurrentState(Drawable drawable);

        public abstract void setAutoMirrored(Drawable drawable, boolean flag);
    }

    static class HoneycombDrawableImpl extends BaseDrawableImpl
    {

        HoneycombDrawableImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void DrawableCompat$BaseDrawableImpl()>
        //    2    4:return          
        }

        public void jumpToCurrentState(Drawable drawable)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method void DrawableCompatHoneycomb.jumpToCurrentState(Drawable)>
        //    2    4:return          
        }
    }

    static class KitKatDrawableImpl extends HoneycombDrawableImpl
    {

        KitKatDrawableImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void DrawableCompat$HoneycombDrawableImpl()>
        //    2    4:return          
        }

        public boolean isAutoMirrored(Drawable drawable)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method boolean DrawableCompatKitKat.isAutoMirrored(Drawable)>
        //    2    4:ireturn         
        }

        public void setAutoMirrored(Drawable drawable, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method void DrawableCompatKitKat.setAutoMirrored(Drawable, boolean)>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          19
    //    4    7:icmplt          21
    //    5   10:new             #16  <Class DrawableCompat$KitKatDrawableImpl>
    //    6   13:dup             
    //    7   14:invokespecial   #19  <Method void DrawableCompat$KitKatDrawableImpl()>
    //    8   17:putstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          11
    //   12   24:icmplt          38
    //   13   27:new             #23  <Class DrawableCompat$HoneycombDrawableImpl>
    //   14   30:dup             
    //   15   31:invokespecial   #24  <Method void DrawableCompat$HoneycombDrawableImpl()>
    //   16   34:putstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //   17   37:return          
    //   18   38:new             #26  <Class DrawableCompat$BaseDrawableImpl>
    //   19   41:dup             
    //   20   42:invokespecial   #27  <Method void DrawableCompat$BaseDrawableImpl()>
    //   21   45:putstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //   22   48:return          
    }

    public DrawableCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #28  <Method void Object()>
    //    2    4:return          
    }

    public static boolean isAutoMirrored(Drawable drawable)
    {
    //    0    0:getstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #34  <Method boolean DrawableCompat$DrawableImpl.isAutoMirrored(Drawable)>
    //    3    9:ireturn         
    }

    public static void jumpToCurrentState(Drawable drawable)
    {
    //    0    0:getstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #38  <Method void DrawableCompat$DrawableImpl.jumpToCurrentState(Drawable)>
    //    3    9:return          
    }

    public static void setAutoMirrored(Drawable drawable, boolean flag)
    {
    //    0    0:getstatic       #21  <Field DrawableCompat$DrawableImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #42  <Method void DrawableCompat$DrawableImpl.setAutoMirrored(Drawable, boolean)>
    //    4   10:return          
    }

    static final DrawableImpl IMPL;
}
