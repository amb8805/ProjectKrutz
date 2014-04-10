// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package android.support.v4.net:
//            ConnectivityManagerCompatGingerbread, ConnectivityManagerCompatHoneycombMR2, ConnectivityManagerCompatJellyBean

public class ConnectivityManagerCompat
{
    static class BaseConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        BaseConnectivityManagerCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #18  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:ifnonnull       11
        //    5    9:iconst_1        
        //    6   10:ireturn         
        //    7   11:aload_2         
        //    8   12:invokevirtual   #24  <Method int NetworkInfo.getType()>
        //    9   15:tableswitch     0 1: default 36
        //                       0 9
        //                       1 38
        //   10   36:iconst_1        
        //   11   37:ireturn         
        //   12   38:iconst_0        
        //   13   39:ireturn         
        }
    }

    static interface ConnectivityManagerCompatImpl
    {

        public abstract boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager);
    }

    static class GingerbreadConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        GingerbreadConnectivityManagerCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method boolean ConnectivityManagerCompatGingerbread.isActiveNetworkMetered(ConnectivityManager)>
        //    2    4:ireturn         
        }
    }

    static class HoneycombMR2ConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        HoneycombMR2ConnectivityManagerCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method boolean ConnectivityManagerCompatHoneycombMR2.isActiveNetworkMetered(ConnectivityManager)>
        //    2    4:ireturn         
        }
    }

    static class JellyBeanConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        JellyBeanConnectivityManagerCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method boolean ConnectivityManagerCompatJellyBean.isActiveNetworkMetered(ConnectivityManager)>
        //    2    4:ireturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl()>
    //    6   15:putstatic       #21  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          13
    //   10   24:icmplt          38
    //   11   27:new             #23  <Class ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl>
    //   12   30:dup             
    //   13   31:invokespecial   #24  <Method void ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl()>
    //   14   34:putstatic       #21  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
    //   15   37:return          
    //   16   38:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //   17   41:bipush          8
    //   18   43:icmplt          57
    //   19   46:new             #26  <Class ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl>
    //   20   49:dup             
    //   21   50:invokespecial   #27  <Method void ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl()>
    //   22   53:putstatic       #21  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
    //   23   56:return          
    //   24   57:new             #29  <Class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl>
    //   25   60:dup             
    //   26   61:invokespecial   #30  <Method void ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl()>
    //   27   64:putstatic       #21  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
    //   28   67:return          
    }

    public ConnectivityManagerCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void Object()>
    //    2    4:return          
    }

    public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivitymanager, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #35  <String "networkInfo">
    //    3    4:invokevirtual   #41  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
    //    4    7:checkcast       #43  <Class NetworkInfo>
    //    5   10:invokevirtual   #47  <Method int NetworkInfo.getType()>
    //    6   13:invokevirtual   #53  <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
    //    7   16:areturn         
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
    {
    //    0    0:getstatic       #21  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #59  <Method boolean ConnectivityManagerCompat$ConnectivityManagerCompatImpl.isActiveNetworkMetered(ConnectivityManager)>
    //    3    9:ireturn         
    }

    private static final ConnectivityManagerCompatImpl IMPL;
}
