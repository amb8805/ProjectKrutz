// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.net;

import android.net.TrafficStats;
import java.net.Socket;
import java.net.SocketException;

class TrafficStatsCompatIcs
{

    TrafficStatsCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void clearThreadStatsTag()
    {
    //    0    0:invokestatic    #13  <Method void TrafficStats.clearThreadStatsTag()>
    //    1    3:return          
    }

    public static int getThreadStatsTag()
    {
    //    0    0:invokestatic    #17  <Method int TrafficStats.getThreadStatsTag()>
    //    1    3:ireturn         
    }

    public static void incrementOperationCount(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #21  <Method void TrafficStats.incrementOperationCount(int)>
    //    2    4:return          
    }

    public static void incrementOperationCount(int i, int j)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:invokestatic    #24  <Method void TrafficStats.incrementOperationCount(int, int)>
    //    3    5:return          
    }

    public static void setThreadStatsTag(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #27  <Method void TrafficStats.setThreadStatsTag(int)>
    //    2    4:return          
    }

    public static void tagSocket(Socket socket)
        throws SocketException
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #33  <Method void TrafficStats.tagSocket(Socket)>
    //    2    4:return          
    }

    public static void untagSocket(Socket socket)
        throws SocketException
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #36  <Method void TrafficStats.untagSocket(Socket)>
    //    2    4:return          
    }
}
