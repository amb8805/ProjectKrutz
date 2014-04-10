// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.net;

import java.net.Socket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompatIcs

public class TrafficStatsCompat
{
    static class BaseTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        BaseTrafficStatsCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #15  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl$1>
        //    4    8:dup             
        //    5    9:aload_0         
        //    6   10:invokespecial   #18  <Method void TrafficStatsCompat$BaseTrafficStatsCompatImpl$1(TrafficStatsCompat$BaseTrafficStatsCompatImpl)>
        //    7   13:putfield        #20  <Field ThreadLocal mThreadSocketTags>
        //    8   16:return          
        }

        public void clearThreadStatsTag()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field ThreadLocal mThreadSocketTags>
        //    2    4:invokevirtual   #27  <Method Object ThreadLocal.get()>
        //    3    7:checkcast       #29  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags>
        //    4   10:iconst_m1       
        //    5   11:putfield        #33  <Field int TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags.statsTag>
        //    6   14:return          
        }

        public int getThreadStatsTag()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field ThreadLocal mThreadSocketTags>
        //    2    4:invokevirtual   #27  <Method Object ThreadLocal.get()>
        //    3    7:checkcast       #29  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags>
        //    4   10:getfield        #33  <Field int TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags.statsTag>
        //    5   13:ireturn         
        }

        public void incrementOperationCount(int i)
        {
        //    0    0:return          
        }

        public void incrementOperationCount(int i, int j)
        {
        //    0    0:return          
        }

        public void setThreadStatsTag(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field ThreadLocal mThreadSocketTags>
        //    2    4:invokevirtual   #27  <Method Object ThreadLocal.get()>
        //    3    7:checkcast       #29  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags>
        //    4   10:iload_1         
        //    5   11:putfield        #33  <Field int TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags.statsTag>
        //    6   14:return          
        }

        public void tagSocket(Socket socket)
        {
        //    0    0:return          
        }

        public void untagSocket(Socket socket)
        {
        //    0    0:return          
        }

        private ThreadLocal mThreadSocketTags;
    }

    private static class BaseTrafficStatsCompatImpl.SocketTags
    {

        private BaseTrafficStatsCompatImpl.SocketTags()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iconst_m1       
        //    4    6:putfield        #12  <Field int statsTag>
        //    5    9:return          
        }

        BaseTrafficStatsCompatImpl.SocketTags(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags()>
        //    2    4:return          
        }

        public int statsTag;
    }

    static class IcsTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        IcsTrafficStatsCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void clearThreadStatsTag()
        {
        //    0    0:invokestatic    #15  <Method void TrafficStatsCompatIcs.clearThreadStatsTag()>
        //    1    3:return          
        }

        public int getThreadStatsTag()
        {
        //    0    0:invokestatic    #19  <Method int TrafficStatsCompatIcs.getThreadStatsTag()>
        //    1    3:ireturn         
        }

        public void incrementOperationCount(int i)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #23  <Method void TrafficStatsCompatIcs.incrementOperationCount(int)>
        //    2    4:return          
        }

        public void incrementOperationCount(int i, int j)
        {
        //    0    0:iload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #26  <Method void TrafficStatsCompatIcs.incrementOperationCount(int, int)>
        //    3    5:return          
        }

        public void setThreadStatsTag(int i)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #29  <Method void TrafficStatsCompatIcs.setThreadStatsTag(int)>
        //    2    4:return          
        }

        public void tagSocket(Socket socket)
            throws SocketException
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #35  <Method void TrafficStatsCompatIcs.tagSocket(Socket)>
        //    2    4:return          
        }

        public void untagSocket(Socket socket)
            throws SocketException
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #38  <Method void TrafficStatsCompatIcs.untagSocket(Socket)>
        //    2    4:return          
        }
    }

    static interface TrafficStatsCompatImpl
    {

        public abstract void clearThreadStatsTag();

        public abstract int getThreadStatsTag();

        public abstract void incrementOperationCount(int i);

        public abstract void incrementOperationCount(int i, int j);

        public abstract void setThreadStatsTag(int i);

        public abstract void tagSocket(Socket socket)
            throws SocketException;

        public abstract void untagSocket(Socket socket)
            throws SocketException;
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class TrafficStatsCompat$IcsTrafficStatsCompatImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void TrafficStatsCompat$IcsTrafficStatsCompatImpl()>
    //    6   15:putstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void TrafficStatsCompat$BaseTrafficStatsCompatImpl()>
    //   11   26:putstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //   12   29:return          
    }

    public TrafficStatsCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static void clearThreadStatsTag()
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:invokeinterface #30  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.clearThreadStatsTag()>
    //    2    8:return          
    }

    public static int getThreadStatsTag()
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:invokeinterface #34  <Method int TrafficStatsCompat$TrafficStatsCompatImpl.getThreadStatsTag()>
    //    2    8:ireturn         
    }

    public static void incrementOperationCount(int i)
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:iload_0         
    //    2    4:invokeinterface #38  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.incrementOperationCount(int)>
    //    3    9:return          
    }

    public static void incrementOperationCount(int i, int j)
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:iload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #41  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.incrementOperationCount(int, int)>
    //    4   10:return          
    }

    public static void setThreadStatsTag(int i)
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:iload_0         
    //    2    4:invokeinterface #44  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.setThreadStatsTag(int)>
    //    3    9:return          
    }

    public static void tagSocket(Socket socket)
        throws SocketException
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #50  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.tagSocket(Socket)>
    //    3    9:return          
    }

    public static void untagSocket(Socket socket)
        throws SocketException
    {
    //    0    0:getstatic       #21  <Field TrafficStatsCompat$TrafficStatsCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #53  <Method void TrafficStatsCompat$TrafficStatsCompatImpl.untagSocket(Socket)>
    //    3    9:return          
    }

    private static final TrafficStatsCompatImpl IMPL;

    // Unreferenced inner class android/support/v4/net/TrafficStatsCompat$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$1

/* anonymous class */
    class BaseTrafficStatsCompatImpl._cls1 extends ThreadLocal
    {

        BaseTrafficStatsCompatImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field TrafficStatsCompat$BaseTrafficStatsCompatImpl this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void ThreadLocal()>
        //    5    9:return          
        }

        protected BaseTrafficStatsCompatImpl.SocketTags initialValue()
        {
        //    0    0:new             #20  <Class TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags>
        //    1    3:dup             
        //    2    4:aconst_null     
        //    3    5:invokespecial   #23  <Method void TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags(TrafficStatsCompat$1)>
        //    4    8:areturn         
        }

        protected volatile Object initialValue()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #26  <Method TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags initialValue()>
        //    2    4:areturn         
        }

        final BaseTrafficStatsCompatImpl this$0;
    }

}
