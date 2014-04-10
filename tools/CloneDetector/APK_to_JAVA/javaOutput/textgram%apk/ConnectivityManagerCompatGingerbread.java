// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompatGingerbread
{

    ConnectivityManagerCompatGingerbread()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #16  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnonnull       11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:aload_1         
    //    8   12:invokevirtual   #22  <Method int NetworkInfo.getType()>
    //    9   15:tableswitch     0 6: default 56
    //                   0 9
    //                   1 58
    //                   2 9
    //                   3 9
    //                   4 9
    //                   5 9
    //                   6 9
    //   10   56:iconst_1        
    //   11   57:ireturn         
    //   12   58:iconst_0        
    //   13   59:ireturn         
    }
}
