// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//            PrintHelperKitkat

public final class PrintHelper
{
    private static final class PrintHelperKitkatImpl
        implements PrintHelperVersionImpl
    {

        PrintHelperKitkatImpl(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #15  <Class PrintHelperKitkat>
        //    4    8:dup             
        //    5    9:aload_1         
        //    6   10:invokespecial   #17  <Method void PrintHelperKitkat(Context)>
        //    7   13:putfield        #19  <Field PrintHelperKitkat printHelper>
        //    8   16:return          
        }

        public int getColorMode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:invokevirtual   #23  <Method int PrintHelperKitkat.getColorMode()>
        //    3    7:ireturn         
        }

        public int getScaleMode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:invokevirtual   #26  <Method int PrintHelperKitkat.getScaleMode()>
        //    3    7:ireturn         
        }

        public void printBitmap(String s, Bitmap bitmap)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #30  <Method void PrintHelperKitkat.printBitmap(String, Bitmap)>
        //    5    9:return          
        }

        public void printBitmap(String s, Uri uri)
            throws FileNotFoundException
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #35  <Method void PrintHelperKitkat.printBitmap(String, Uri)>
        //    5    9:return          
        }

        public void setColorMode(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #39  <Method void PrintHelperKitkat.setColorMode(int)>
        //    4    8:return          
        }

        public void setScaleMode(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field PrintHelperKitkat printHelper>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #42  <Method void PrintHelperKitkat.setScaleMode(int)>
        //    4    8:return          
        }

        private final PrintHelperKitkat printHelper;
    }

    private static final class PrintHelperStubImpl
        implements PrintHelperVersionImpl
    {

        private PrintHelperStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iconst_2        
        //    4    6:putfield        #15  <Field int mScaleMode>
        //    5    9:aload_0         
        //    6   10:iconst_2        
        //    7   11:putfield        #17  <Field int mColorMode>
        //    8   14:return          
        }

        PrintHelperStubImpl(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #19  <Method void PrintHelper$PrintHelperStubImpl()>
        //    2    4:return          
        }

        public int getColorMode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field int mColorMode>
        //    2    4:ireturn         
        }

        public int getScaleMode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field int mScaleMode>
        //    2    4:ireturn         
        }

        public void printBitmap(String s, Bitmap bitmap)
        {
        //    0    0:return          
        }

        public void printBitmap(String s, Uri uri)
        {
        //    0    0:return          
        }

        public void setColorMode(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #17  <Field int mColorMode>
        //    3    5:return          
        }

        public void setScaleMode(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #15  <Field int mScaleMode>
        //    3    5:return          
        }

        int mColorMode;
        int mScaleMode;
    }

    static interface PrintHelperVersionImpl
    {

        public abstract int getColorMode();

        public abstract int getScaleMode();

        public abstract void printBitmap(String s, Bitmap bitmap);

        public abstract void printBitmap(String s, Uri uri)
            throws FileNotFoundException;

        public abstract void setColorMode(int i);

        public abstract void setScaleMode(int i);
    }


    public PrintHelper(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:invokestatic    #22  <Method boolean systemSupportsPrint()>
    //    3    7:ifeq            23
    //    4   10:aload_0         
    //    5   11:new             #24  <Class PrintHelper$PrintHelperKitkatImpl>
    //    6   14:dup             
    //    7   15:aload_1         
    //    8   16:invokespecial   #26  <Method void PrintHelper$PrintHelperKitkatImpl(Context)>
    //    9   19:putfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //   10   22:return          
    //   11   23:aload_0         
    //   12   24:new             #30  <Class PrintHelper$PrintHelperStubImpl>
    //   13   27:dup             
    //   14   28:aconst_null     
    //   15   29:invokespecial   #33  <Method void PrintHelper$PrintHelperStubImpl(PrintHelper$1)>
    //   16   32:putfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //   17   35:return          
    }

    public static boolean systemSupportsPrint()
    {
    //    0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          10
    //    3    8:iconst_1        
    //    4    9:ireturn         
    //    5   10:iconst_0        
    //    6   11:ireturn         
    }

    public int getColorMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:invokeinterface #44  <Method int PrintHelper$PrintHelperVersionImpl.getColorMode()>
    //    3    9:ireturn         
    }

    public int getScaleMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:invokeinterface #47  <Method int PrintHelper$PrintHelperVersionImpl.getScaleMode()>
    //    3    9:ireturn         
    }

    public void printBitmap(String s, Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #51  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Bitmap)>
    //    5   11:return          
    }

    public void printBitmap(String s, Uri uri)
        throws FileNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #56  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Uri)>
    //    5   11:return          
    }

    public void setColorMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:iload_1         
    //    3    5:invokeinterface #60  <Method void PrintHelper$PrintHelperVersionImpl.setColorMode(int)>
    //    4   10:return          
    }

    public void setScaleMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field PrintHelper$PrintHelperVersionImpl mImpl>
    //    2    4:iload_1         
    //    3    5:invokeinterface #63  <Method void PrintHelper$PrintHelperVersionImpl.setScaleMode(int)>
    //    4   10:return          
    }

    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    PrintHelperVersionImpl mImpl;

    // Unreferenced inner class android/support/v4/print/PrintHelper$1

/* anonymous class */
    static class _cls1
    {
    }

}
