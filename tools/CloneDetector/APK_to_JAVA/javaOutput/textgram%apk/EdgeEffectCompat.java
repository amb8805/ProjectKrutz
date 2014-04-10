// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

// Referenced classes of package android.support.v4.widget:
//            EdgeEffectCompatIcs

public class EdgeEffectCompat
{
    static class BaseEdgeEffectImpl
        implements EdgeEffectImpl
    {

        BaseEdgeEffectImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean draw(Object obj, Canvas canvas)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void finish(Object obj)
        {
        //    0    0:return          
        }

        public boolean isFinished(Object obj)
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public Object newEdgeEffect(Context context)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean onAbsorb(Object obj, int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onPull(Object obj, float f)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onRelease(Object obj)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void setSize(Object obj, int i, int j)
        {
        //    0    0:return          
        }
    }

    static class EdgeEffectIcsImpl
        implements EdgeEffectImpl
    {

        EdgeEffectIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean draw(Object obj, Canvas canvas)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #16  <Method boolean EdgeEffectCompatIcs.draw(Object, Canvas)>
        //    3    5:ireturn         
        }

        public void finish(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #20  <Method void EdgeEffectCompatIcs.finish(Object)>
        //    2    4:return          
        }

        public boolean isFinished(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #24  <Method boolean EdgeEffectCompatIcs.isFinished(Object)>
        //    2    4:ireturn         
        }

        public Object newEdgeEffect(Context context)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #28  <Method Object EdgeEffectCompatIcs.newEdgeEffect(Context)>
        //    2    4:areturn         
        }

        public boolean onAbsorb(Object obj, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #32  <Method boolean EdgeEffectCompatIcs.onAbsorb(Object, int)>
        //    3    5:ireturn         
        }

        public boolean onPull(Object obj, float f)
        {
        //    0    0:aload_1         
        //    1    1:fload_2         
        //    2    2:invokestatic    #36  <Method boolean EdgeEffectCompatIcs.onPull(Object, float)>
        //    3    5:ireturn         
        }

        public boolean onRelease(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #39  <Method boolean EdgeEffectCompatIcs.onRelease(Object)>
        //    2    4:ireturn         
        }

        public void setSize(Object obj, int i, int j)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:invokestatic    #43  <Method void EdgeEffectCompatIcs.setSize(Object, int, int)>
        //    4    6:return          
        }
    }

    static interface EdgeEffectImpl
    {

        public abstract boolean draw(Object obj, Canvas canvas);

        public abstract void finish(Object obj);

        public abstract boolean isFinished(Object obj);

        public abstract Object newEdgeEffect(Context context);

        public abstract boolean onAbsorb(Object obj, int i);

        public abstract boolean onPull(Object obj, float f);

        public abstract boolean onRelease(Object obj);

        public abstract void setSize(Object obj, int i, int j);
    }


    static 
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #18  <Class EdgeEffectCompat$EdgeEffectIcsImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #21  <Method void EdgeEffectCompat$EdgeEffectIcsImpl()>
    //    6   15:putstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    7   18:return          
    //    8   19:new             #25  <Class EdgeEffectCompat$BaseEdgeEffectImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #26  <Method void EdgeEffectCompat$BaseEdgeEffectImpl()>
    //   11   26:putstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //   12   29:return          
    }

    public EdgeEffectCompat(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #28  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    4    8:aload_1         
    //    5    9:invokeinterface #34  <Method Object EdgeEffectCompat$EdgeEffectImpl.newEdgeEffect(Context)>
    //    6   14:putfield        #36  <Field Object mEdgeEffect>
    //    7   17:return          
    }

    public boolean draw(Canvas canvas)
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:aload_1         
    //    4    8:invokeinterface #41  <Method boolean EdgeEffectCompat$EdgeEffectImpl.draw(Object, Canvas)>
    //    5   13:ireturn         
    }

    public void finish()
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:invokeinterface #45  <Method void EdgeEffectCompat$EdgeEffectImpl.finish(Object)>
    //    4   12:return          
    }

    public boolean isFinished()
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:invokeinterface #50  <Method boolean EdgeEffectCompat$EdgeEffectImpl.isFinished(Object)>
    //    4   12:ireturn         
    }

    public boolean onAbsorb(int i)
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:iload_1         
    //    4    8:invokeinterface #55  <Method boolean EdgeEffectCompat$EdgeEffectImpl.onAbsorb(Object, int)>
    //    5   13:ireturn         
    }

    public boolean onPull(float f)
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:fload_1         
    //    4    8:invokeinterface #60  <Method boolean EdgeEffectCompat$EdgeEffectImpl.onPull(Object, float)>
    //    5   13:ireturn         
    }

    public boolean onRelease()
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:invokeinterface #63  <Method boolean EdgeEffectCompat$EdgeEffectImpl.onRelease(Object)>
    //    4   12:ireturn         
    }

    public void setSize(int i, int j)
    {
    //    0    0:getstatic       #23  <Field EdgeEffectCompat$EdgeEffectImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #36  <Field Object mEdgeEffect>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:invokeinterface #68  <Method void EdgeEffectCompat$EdgeEffectImpl.setSize(Object, int, int)>
    //    6   14:return          
    }

    private static final EdgeEffectImpl IMPL;
    private Object mEdgeEffect;
}
