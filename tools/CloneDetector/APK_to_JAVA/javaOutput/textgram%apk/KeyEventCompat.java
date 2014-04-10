// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            KeyEventCompatEclair, KeyEventCompatHoneycomb

public class KeyEventCompat
{
    static class BaseKeyEventVersionImpl
        implements KeyEventVersionImpl
    {

        BaseKeyEventVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:return          
        }

        private static int metaStateFilterDirectionalModifiers(int i, int j, int k, int l, int i1)
        {
        //    0    0:iconst_1        
        //    1    1:istore          5
        //    2    3:iload_1         
        //    3    4:iload_2         
        //    4    5:iand            
        //    5    6:ifeq            46
        //    6    9:iload           5
        //    7   11:istore          6
        //    8   13:iload_3         
        //    9   14:iload           4
        //   10   16:ior             
        //   11   17:istore          7
        //   12   19:iload_1         
        //   13   20:iload           7
        //   14   22:iand            
        //   15   23:ifeq            52
        //   16   26:iload           6
        //   17   28:ifeq            67
        //   18   31:iload           5
        //   19   33:ifeq            58
        //   20   36:new             #18  <Class IllegalArgumentException>
        //   21   39:dup             
        //   22   40:ldc1            #20  <String "bad arguments">
        //   23   42:invokespecial   #23  <Method void IllegalArgumentException(String)>
        //   24   45:athrow          
        //   25   46:iconst_0        
        //   26   47:istore          6
        //   27   49:goto            13
        //   28   52:iconst_0        
        //   29   53:istore          5
        //   30   55:goto            26
        //   31   58:iload_0         
        //   32   59:iload           7
        //   33   61:iconst_m1       
        //   34   62:ixor            
        //   35   63:iand            
        //   36   64:istore_0        
        //   37   65:iload_0         
        //   38   66:ireturn         
        //   39   67:iload           5
        //   40   69:ifeq            65
        //   41   72:iload_0         
        //   42   73:iload_2         
        //   43   74:iconst_m1       
        //   44   75:ixor            
        //   45   76:iand            
        //   46   77:ireturn         
        }

        public boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #30  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback)>
        //    3    5:ireturn         
        }

        public Object getKeyDispatcherState(View view)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean isTracking(KeyEvent keyevent)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean metaStateHasModifiers(int i, int j)
        {
        //    0    0:sipush          247
        //    1    3:aload_0         
        //    2    4:iload_1         
        //    3    5:invokevirtual   #40  <Method int normalizeMetaState(int)>
        //    4    8:iand            
        //    5    9:iload_2         
        //    6   10:iconst_1        
        //    7   11:bipush          64
        //    8   13:sipush          128
        //    9   16:invokestatic    #42  <Method int metaStateFilterDirectionalModifiers(int, int, int, int, int)>
        //   10   19:iload_2         
        //   11   20:iconst_2        
        //   12   21:bipush          16
        //   13   23:bipush          32
        //   14   25:invokestatic    #42  <Method int metaStateFilterDirectionalModifiers(int, int, int, int, int)>
        //   15   28:iload_2         
        //   16   29:icmpne          34
        //   17   32:iconst_1        
        //   18   33:ireturn         
        //   19   34:iconst_0        
        //   20   35:ireturn         
        }

        public boolean metaStateHasNoModifiers(int i)
        {
        //    0    0:sipush          247
        //    1    3:aload_0         
        //    2    4:iload_1         
        //    3    5:invokevirtual   #40  <Method int normalizeMetaState(int)>
        //    4    8:iand            
        //    5    9:ifne            14
        //    6   12:iconst_1        
        //    7   13:ireturn         
        //    8   14:iconst_0        
        //    9   15:ireturn         
        }

        public int normalizeMetaState(int i)
        {
        //    0    0:iload_1         
        //    1    1:sipush          192
        //    2    4:iand            
        //    3    5:ifeq            12
        //    4    8:iload_1         
        //    5    9:iconst_1        
        //    6   10:ior             
        //    7   11:istore_1        
        //    8   12:iload_1         
        //    9   13:bipush          48
        //   10   15:iand            
        //   11   16:ifeq            23
        //   12   19:iload_1         
        //   13   20:iconst_2        
        //   14   21:ior             
        //   15   22:istore_1        
        //   16   23:iload_1         
        //   17   24:sipush          247
        //   18   27:iand            
        //   19   28:ireturn         
        }

        public void startTracking(KeyEvent keyevent)
        {
        //    0    0:return          
        }

        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;
    }

    static class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl
    {

        EclairKeyEventVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void KeyEventCompat$BaseKeyEventVersionImpl()>
        //    2    4:return          
        }

        public boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aload           4
        //    4    5:invokestatic    #14  <Method boolean KeyEventCompatEclair.dispatch(KeyEvent, android.view.KeyEvent$Callback, Object, Object)>
        //    5    8:ireturn         
        }

        public Object getKeyDispatcherState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #18  <Method Object KeyEventCompatEclair.getKeyDispatcherState(View)>
        //    2    4:areturn         
        }

        public boolean isTracking(KeyEvent keyevent)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #22  <Method boolean KeyEventCompatEclair.isTracking(KeyEvent)>
        //    2    4:ireturn         
        }

        public void startTracking(KeyEvent keyevent)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #26  <Method void KeyEventCompatEclair.startTracking(KeyEvent)>
        //    2    4:return          
        }
    }

    static class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl
    {

        HoneycombKeyEventVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void KeyEventCompat$EclairKeyEventVersionImpl()>
        //    2    4:return          
        }

        public boolean metaStateHasModifiers(int i, int j)
        {
        //    0    0:iload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #14  <Method boolean KeyEventCompatHoneycomb.metaStateHasModifiers(int, int)>
        //    3    5:ireturn         
        }

        public boolean metaStateHasNoModifiers(int i)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #18  <Method boolean KeyEventCompatHoneycomb.metaStateHasNoModifiers(int)>
        //    2    4:ireturn         
        }

        public int normalizeMetaState(int i)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #22  <Method int KeyEventCompatHoneycomb.normalizeMetaState(int)>
        //    2    4:ireturn         
        }
    }

    static interface KeyEventVersionImpl
    {

        public abstract boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1);

        public abstract Object getKeyDispatcherState(View view);

        public abstract boolean isTracking(KeyEvent keyevent);

        public abstract boolean metaStateHasModifiers(int i, int j);

        public abstract boolean metaStateHasNoModifiers(int i);

        public abstract int normalizeMetaState(int i);

        public abstract void startTracking(KeyEvent keyevent);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class KeyEventCompat$HoneycombKeyEventVersionImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void KeyEventCompat$HoneycombKeyEventVersionImpl()>
    //    6   15:putstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class KeyEventCompat$BaseKeyEventVersionImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void KeyEventCompat$BaseKeyEventVersionImpl()>
    //   11   26:putstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //   12   29:return          
    }

    public KeyEventCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokeinterface #31  <Method boolean KeyEventCompat$KeyEventVersionImpl.dispatch(KeyEvent, android.view.KeyEvent$Callback, Object, Object)>
    //    6   12:ireturn         
    }

    public static Object getKeyDispatcherState(View view)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #35  <Method Object KeyEventCompat$KeyEventVersionImpl.getKeyDispatcherState(View)>
    //    3    9:areturn         
    }

    public static boolean hasModifiers(KeyEvent keyevent, int i)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokevirtual   #43  <Method int KeyEvent.getMetaState()>
    //    3    7:iload_1         
    //    4    8:invokeinterface #47  <Method boolean KeyEventCompat$KeyEventVersionImpl.metaStateHasModifiers(int, int)>
    //    5   13:ireturn         
    }

    public static boolean hasNoModifiers(KeyEvent keyevent)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokevirtual   #43  <Method int KeyEvent.getMetaState()>
    //    3    7:invokeinterface #53  <Method boolean KeyEventCompat$KeyEventVersionImpl.metaStateHasNoModifiers(int)>
    //    4   12:ireturn         
    }

    public static boolean isTracking(KeyEvent keyevent)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #56  <Method boolean KeyEventCompat$KeyEventVersionImpl.isTracking(KeyEvent)>
    //    3    9:ireturn         
    }

    public static boolean metaStateHasModifiers(int i, int j)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:iload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #47  <Method boolean KeyEventCompat$KeyEventVersionImpl.metaStateHasModifiers(int, int)>
    //    4   10:ireturn         
    }

    public static boolean metaStateHasNoModifiers(int i)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:iload_0         
    //    2    4:invokeinterface #53  <Method boolean KeyEventCompat$KeyEventVersionImpl.metaStateHasNoModifiers(int)>
    //    3    9:ireturn         
    }

    public static int normalizeMetaState(int i)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:iload_0         
    //    2    4:invokeinterface #60  <Method int KeyEventCompat$KeyEventVersionImpl.normalizeMetaState(int)>
    //    3    9:ireturn         
    }

    public static void startTracking(KeyEvent keyevent)
    {
    //    0    0:getstatic       #21  <Field KeyEventCompat$KeyEventVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #64  <Method void KeyEventCompat$KeyEventVersionImpl.startTracking(KeyEvent)>
    //    3    9:return          
    }

    static final KeyEventVersionImpl IMPL;
}
