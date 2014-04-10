// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.hardware.display:
//            DisplayManagerJellybeanMr1

public abstract class DisplayManagerCompat
{
    private static class JellybeanMr1Impl extends DisplayManagerCompat
    {

        public JellybeanMr1Impl(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void DisplayManagerCompat()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokestatic    #17  <Method Object DisplayManagerJellybeanMr1.getDisplayManager(Context)>
        //    5    9:putfield        #19  <Field Object mDisplayManagerObj>
        //    6   12:return          
        }

        public Display getDisplay(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field Object mDisplayManagerObj>
        //    2    4:iload_1         
        //    3    5:invokestatic    #24  <Method Display DisplayManagerJellybeanMr1.getDisplay(Object, int)>
        //    4    8:areturn         
        }

        public Display[] getDisplays()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field Object mDisplayManagerObj>
        //    2    4:invokestatic    #29  <Method Display[] DisplayManagerJellybeanMr1.getDisplays(Object)>
        //    3    7:areturn         
        }

        public Display[] getDisplays(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field Object mDisplayManagerObj>
        //    2    4:aload_1         
        //    3    5:invokestatic    #33  <Method Display[] DisplayManagerJellybeanMr1.getDisplays(Object, String)>
        //    4    8:areturn         
        }

        private final Object mDisplayManagerObj;
    }

    private static class LegacyImpl extends DisplayManagerCompat
    {

        public LegacyImpl(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void DisplayManagerCompat()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:ldc1            #13  <String "window">
        //    5    8:invokevirtual   #19  <Method Object Context.getSystemService(String)>
        //    6   11:checkcast       #21  <Class WindowManager>
        //    7   14:putfield        #23  <Field WindowManager mWindowManager>
        //    8   17:return          
        }

        public Display getDisplay(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field WindowManager mWindowManager>
        //    2    4:invokeinterface #29  <Method Display WindowManager.getDefaultDisplay()>
        //    3    9:astore_2        
        //    4   10:aload_2         
        //    5   11:invokevirtual   #35  <Method int Display.getDisplayId()>
        //    6   14:iload_1         
        //    7   15:icmpne          20
        //    8   18:aload_2         
        //    9   19:areturn         
        //   10   20:aconst_null     
        //   11   21:areturn         
        }

        public Display[] getDisplays()
        {
        //    0    0:iconst_1        
        //    1    1:anewarray       Display[]
        //    2    4:astore_1        
        //    3    5:aload_1         
        //    4    6:iconst_0        
        //    5    7:aload_0         
        //    6    8:getfield        #23  <Field WindowManager mWindowManager>
        //    7   11:invokeinterface #29  <Method Display WindowManager.getDefaultDisplay()>
        //    8   16:aastore         
        //    9   17:aload_1         
        //   10   18:areturn         
        }

        public Display[] getDisplays(String s)
        {
        //    0    0:aload_1         
        //    1    1:ifnonnull       9
        //    2    4:aload_0         
        //    3    5:invokevirtual   #40  <Method Display[] getDisplays()>
        //    4    8:areturn         
        //    5    9:iconst_0        
        //    6   10:anewarray       Display[]
        //    7   13:areturn         
        }

        private final WindowManager mWindowManager;
    }


    static 
    {
    //    0    0:new             #15  <Class WeakHashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #18  <Method void WeakHashMap()>
    //    3    7:putstatic       #20  <Field WeakHashMap sInstances>
    //    4   10:return          
    }

    DisplayManagerCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:return          
    }

    public static DisplayManagerCompat getInstance(Context context)
    {
    //    0    0:getstatic       #20  <Field WeakHashMap sInstances>
    //    1    3:astore_1        
    //    2    4:aload_1         
    //    3    5:monitorenter    
    // try 6 17 handler(s) 63
    //    4    6:getstatic       #20  <Field WeakHashMap sInstances>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #27  <Method Object WeakHashMap.get(Object)>
    //    7   13:checkcast       #2   <Class DisplayManagerCompat>
    //    8   16:astore_3        
    //    9   17:aload_3         
    //   10   18:ifnonnull       47
    // try 21 38 handler(s) 63
    //   11   21:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
    //   12   24:bipush          17
    //   13   26:icmplt          51
    //   14   29:new             #35  <Class DisplayManagerCompat$JellybeanMr1Impl>
    //   15   32:dup             
    //   16   33:aload_0         
    //   17   34:invokespecial   #38  <Method void DisplayManagerCompat$JellybeanMr1Impl(Context)>
    //   18   37:astore_3        
    // try 38 47 handler(s) 63
    //   19   38:getstatic       #20  <Field WeakHashMap sInstances>
    //   20   41:aload_0         
    //   21   42:aload_3         
    //   22   43:invokevirtual   #42  <Method Object WeakHashMap.put(Object, Object)>
    //   23   46:pop             
    // try 47 49 handler(s) 63
    //   24   47:aload_1         
    //   25   48:monitorexit     
    //   26   49:aload_3         
    //   27   50:areturn         
    // try 51 60 handler(s) 63
    //   28   51:new             #44  <Class DisplayManagerCompat$LegacyImpl>
    //   29   54:dup             
    //   30   55:aload_0         
    //   31   56:invokespecial   #45  <Method void DisplayManagerCompat$LegacyImpl(Context)>
    //   32   59:astore_3        
    //   33   60:goto            38
    // finally
    //   34   63:astore_2        
    // try 64 66 handler(s) 63
    //   35   64:aload_1         
    //   36   65:monitorexit     
    //   37   66:aload_2         
    //   38   67:athrow          
    }

    public abstract Display getDisplay(int i);

    public abstract Display[] getDisplays();

    public abstract Display[] getDisplays(String s);

    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final WeakHashMap sInstances;
}
