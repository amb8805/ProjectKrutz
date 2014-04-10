// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompatGingerbread, ScrollerCompatIcs

public class ScrollerCompat
{
    static interface ScrollerCompatImpl
    {

        public abstract void abortAnimation(Object obj);

        public abstract boolean computeScrollOffset(Object obj);

        public abstract Object createScroller(Context context, Interpolator interpolator);

        public abstract void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1);

        public abstract void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1, int i2, int j2);

        public abstract float getCurrVelocity(Object obj);

        public abstract int getCurrX(Object obj);

        public abstract int getCurrY(Object obj);

        public abstract int getFinalX(Object obj);

        public abstract int getFinalY(Object obj);

        public abstract boolean isFinished(Object obj);

        public abstract boolean isOverScrolled(Object obj);

        public abstract void notifyHorizontalEdgeReached(Object obj, int i, int j, int k);

        public abstract void notifyVerticalEdgeReached(Object obj, int i, int j, int k);

        public abstract void startScroll(Object obj, int i, int j, int k, int l);

        public abstract void startScroll(Object obj, int i, int j, int k, int l, int i1);
    }

    static class ScrollerCompatImplBase
        implements ScrollerCompatImpl
    {

        ScrollerCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void abortAnimation(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #16  <Method void Scroller.abortAnimation()>
        //    3    7:return          
        }

        public boolean computeScrollOffset(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #21  <Method boolean Scroller.computeScrollOffset()>
        //    3    7:ireturn         
        }

        public Object createScroller(Context context, Interpolator interpolator)
        {
        //    0    0:aload_2         
        //    1    1:ifnull          14
        //    2    4:new             #14  <Class Scroller>
        //    3    7:dup             
        //    4    8:aload_1         
        //    5    9:aload_2         
        //    6   10:invokespecial   #26  <Method void Scroller(Context, Interpolator)>
        //    7   13:areturn         
        //    8   14:new             #14  <Class Scroller>
        //    9   17:dup             
        //   10   18:aload_1         
        //   11   19:invokespecial   #29  <Method void Scroller(Context)>
        //   12   22:areturn         
        }

        public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:iload_2         
        //    3    5:iload_3         
        //    4    6:iload           4
        //    5    8:iload           5
        //    6   10:iload           6
        //    7   12:iload           7
        //    8   14:iload           8
        //    9   16:iload           9
        //   10   18:invokevirtual   #34  <Method void Scroller.fling(int, int, int, int, int, int, int, int)>
        //   11   21:return          
        }

        public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1, int i2, int j2)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:iload_2         
        //    3    5:iload_3         
        //    4    6:iload           4
        //    5    8:iload           5
        //    6   10:iload           6
        //    7   12:iload           7
        //    8   14:iload           8
        //    9   16:iload           9
        //   10   18:invokevirtual   #34  <Method void Scroller.fling(int, int, int, int, int, int, int, int)>
        //   11   21:return          
        }

        public float getCurrVelocity(Object obj)
        {
        //    0    0:fconst_0        
        //    1    1:freturn         
        }

        public int getCurrX(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #42  <Method int Scroller.getCurrX()>
        //    3    7:ireturn         
        }

        public int getCurrY(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #45  <Method int Scroller.getCurrY()>
        //    3    7:ireturn         
        }

        public int getFinalX(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #48  <Method int Scroller.getFinalX()>
        //    3    7:ireturn         
        }

        public int getFinalY(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #51  <Method int Scroller.getFinalY()>
        //    3    7:ireturn         
        }

        public boolean isFinished(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:invokevirtual   #54  <Method boolean Scroller.isFinished()>
        //    3    7:ireturn         
        }

        public boolean isOverScrolled(Object obj)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void notifyHorizontalEdgeReached(Object obj, int i, int j, int k)
        {
        //    0    0:return          
        }

        public void notifyVerticalEdgeReached(Object obj, int i, int j, int k)
        {
        //    0    0:return          
        }

        public void startScroll(Object obj, int i, int j, int k, int l)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:iload_2         
        //    3    5:iload_3         
        //    4    6:iload           4
        //    5    8:iload           5
        //    6   10:invokevirtual   #63  <Method void Scroller.startScroll(int, int, int, int)>
        //    7   13:return          
        }

        public void startScroll(Object obj, int i, int j, int k, int l, int i1)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #14  <Class Scroller>
        //    2    4:iload_2         
        //    3    5:iload_3         
        //    4    6:iload           4
        //    5    8:iload           5
        //    6   10:iload           6
        //    7   12:invokevirtual   #67  <Method void Scroller.startScroll(int, int, int, int, int)>
        //    8   15:return          
        }
    }

    static class ScrollerCompatImplGingerbread
        implements ScrollerCompatImpl
    {

        ScrollerCompatImplGingerbread()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void abortAnimation(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method void ScrollerCompatGingerbread.abortAnimation(Object)>
        //    2    4:return          
        }

        public boolean computeScrollOffset(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #20  <Method boolean ScrollerCompatGingerbread.computeScrollOffset(Object)>
        //    2    4:ireturn         
        }

        public Object createScroller(Context context, Interpolator interpolator)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #24  <Method Object ScrollerCompatGingerbread.createScroller(Context, Interpolator)>
        //    3    5:areturn         
        }

        public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:iload           5
        //    5    7:iload           6
        //    6    9:iload           7
        //    7   11:iload           8
        //    8   13:iload           9
        //    9   15:invokestatic    #28  <Method void ScrollerCompatGingerbread.fling(Object, int, int, int, int, int, int, int, int)>
        //   10   18:return          
        }

        public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1, int i2, int j2)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:iload           5
        //    5    7:iload           6
        //    6    9:iload           7
        //    7   11:iload           8
        //    8   13:iload           9
        //    9   15:iload           10
        //   10   17:iload           11
        //   11   19:invokestatic    #31  <Method void ScrollerCompatGingerbread.fling(Object, int, int, int, int, int, int, int, int, int, int)>
        //   12   22:return          
        }

        public float getCurrVelocity(Object obj)
        {
        //    0    0:fconst_0        
        //    1    1:freturn         
        }

        public int getCurrX(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #37  <Method int ScrollerCompatGingerbread.getCurrX(Object)>
        //    2    4:ireturn         
        }

        public int getCurrY(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #40  <Method int ScrollerCompatGingerbread.getCurrY(Object)>
        //    2    4:ireturn         
        }

        public int getFinalX(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #43  <Method int ScrollerCompatGingerbread.getFinalX(Object)>
        //    2    4:ireturn         
        }

        public int getFinalY(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #46  <Method int ScrollerCompatGingerbread.getFinalY(Object)>
        //    2    4:ireturn         
        }

        public boolean isFinished(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #49  <Method boolean ScrollerCompatGingerbread.isFinished(Object)>
        //    2    4:ireturn         
        }

        public boolean isOverScrolled(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #52  <Method boolean ScrollerCompatGingerbread.isOverScrolled(Object)>
        //    2    4:ireturn         
        }

        public void notifyHorizontalEdgeReached(Object obj, int i, int j, int k)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:invokestatic    #56  <Method void ScrollerCompatGingerbread.notifyHorizontalEdgeReached(Object, int, int, int)>
        //    5    8:return          
        }

        public void notifyVerticalEdgeReached(Object obj, int i, int j, int k)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:invokestatic    #59  <Method void ScrollerCompatGingerbread.notifyVerticalEdgeReached(Object, int, int, int)>
        //    5    8:return          
        }

        public void startScroll(Object obj, int i, int j, int k, int l)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:iload           5
        //    5    7:invokestatic    #63  <Method void ScrollerCompatGingerbread.startScroll(Object, int, int, int, int)>
        //    6   10:return          
        }

        public void startScroll(Object obj, int i, int j, int k, int l, int i1)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:iload           5
        //    5    7:iload           6
        //    6    9:invokestatic    #66  <Method void ScrollerCompatGingerbread.startScroll(Object, int, int, int, int, int)>
        //    7   12:return          
        }
    }

    static class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread
    {

        ScrollerCompatImplIcs()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ScrollerCompat$ScrollerCompatImplGingerbread()>
        //    2    4:return          
        }

        public float getCurrVelocity(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method float ScrollerCompatIcs.getCurrVelocity(Object)>
        //    2    4:freturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          14
    //    4    7:icmplt          21
    //    5   10:new             #18  <Class ScrollerCompat$ScrollerCompatImplIcs>
    //    6   13:dup             
    //    7   14:invokespecial   #21  <Method void ScrollerCompat$ScrollerCompatImplIcs()>
    //    8   17:putstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          9
    //   12   24:icmplt          38
    //   13   27:new             #25  <Class ScrollerCompat$ScrollerCompatImplGingerbread>
    //   14   30:dup             
    //   15   31:invokespecial   #26  <Method void ScrollerCompat$ScrollerCompatImplGingerbread()>
    //   16   34:putstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //   17   37:return          
    //   18   38:new             #28  <Class ScrollerCompat$ScrollerCompatImplBase>
    //   19   41:dup             
    //   20   42:invokespecial   #29  <Method void ScrollerCompat$ScrollerCompatImplBase()>
    //   21   45:putstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //   22   48:return          
    }

    ScrollerCompat(Context context, Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    4    8:aload_1         
    //    5    9:aload_2         
    //    6   10:invokeinterface #37  <Method Object ScrollerCompat$ScrollerCompatImpl.createScroller(Context, Interpolator)>
    //    7   15:putfield        #39  <Field Object mScroller>
    //    8   18:return          
    }

    public static ScrollerCompat create(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:invokestatic    #44  <Method ScrollerCompat create(Context, Interpolator)>
    //    3    5:areturn         
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator)
    {
    //    0    0:new             #2   <Class ScrollerCompat>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #46  <Method void ScrollerCompat(Context, Interpolator)>
    //    5    9:areturn         
    }

    public void abortAnimation()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #50  <Method void ScrollerCompat$ScrollerCompatImpl.abortAnimation(Object)>
    //    4   12:return          
    }

    public boolean computeScrollOffset()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #55  <Method boolean ScrollerCompat$ScrollerCompatImpl.computeScrollOffset(Object)>
    //    4   12:ireturn         
    }

    public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:iload           4
    //    7   12:iload           5
    //    8   14:iload           6
    //    9   16:iload           7
    //   10   18:iload           8
    //   11   20:invokeinterface #60  <Method void ScrollerCompat$ScrollerCompatImpl.fling(Object, int, int, int, int, int, int, int, int)>
    //   12   25:return          
    }

    public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:iload           4
    //    7   12:iload           5
    //    8   14:iload           6
    //    9   16:iload           7
    //   10   18:iload           8
    //   11   20:iload           9
    //   12   22:iload           10
    //   13   24:invokeinterface #64  <Method void ScrollerCompat$ScrollerCompatImpl.fling(Object, int, int, int, int, int, int, int, int, int, int)>
    //   14   29:return          
    }

    public float getCurrVelocity()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #69  <Method float ScrollerCompat$ScrollerCompatImpl.getCurrVelocity(Object)>
    //    4   12:freturn         
    }

    public int getCurrX()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #74  <Method int ScrollerCompat$ScrollerCompatImpl.getCurrX(Object)>
    //    4   12:ireturn         
    }

    public int getCurrY()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #77  <Method int ScrollerCompat$ScrollerCompatImpl.getCurrY(Object)>
    //    4   12:ireturn         
    }

    public int getFinalX()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #80  <Method int ScrollerCompat$ScrollerCompatImpl.getFinalX(Object)>
    //    4   12:ireturn         
    }

    public int getFinalY()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #83  <Method int ScrollerCompat$ScrollerCompatImpl.getFinalY(Object)>
    //    4   12:ireturn         
    }

    public boolean isFinished()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #86  <Method boolean ScrollerCompat$ScrollerCompatImpl.isFinished(Object)>
    //    4   12:ireturn         
    }

    public boolean isOverScrolled()
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:invokeinterface #89  <Method boolean ScrollerCompat$ScrollerCompatImpl.isOverScrolled(Object)>
    //    4   12:ireturn         
    }

    public void notifyHorizontalEdgeReached(int i, int j, int k)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:invokeinterface #94  <Method void ScrollerCompat$ScrollerCompatImpl.notifyHorizontalEdgeReached(Object, int, int, int)>
    //    7   15:return          
    }

    public void notifyVerticalEdgeReached(int i, int j, int k)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:invokeinterface #97  <Method void ScrollerCompat$ScrollerCompatImpl.notifyVerticalEdgeReached(Object, int, int, int)>
    //    7   15:return          
    }

    public void startScroll(int i, int j, int k, int l)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:iload           4
    //    7   12:invokeinterface #102 <Method void ScrollerCompat$ScrollerCompatImpl.startScroll(Object, int, int, int, int)>
    //    8   17:return          
    }

    public void startScroll(int i, int j, int k, int l, int i1)
    {
    //    0    0:getstatic       #23  <Field ScrollerCompat$ScrollerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:getfield        #39  <Field Object mScroller>
    //    3    7:iload_1         
    //    4    8:iload_2         
    //    5    9:iload_3         
    //    6   10:iload           4
    //    7   12:iload           5
    //    8   14:invokeinterface #106 <Method void ScrollerCompat$ScrollerCompatImpl.startScroll(Object, int, int, int, int, int)>
    //    9   19:return          
    }

    static final ScrollerCompatImpl IMPL;
    Object mScroller;
}
