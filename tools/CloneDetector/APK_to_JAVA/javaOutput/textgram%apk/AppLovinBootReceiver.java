// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import android.content.*;

// Referenced classes of package com.applovin.sdk:
//            AppLovinService

public class AppLovinBootReceiver extends BroadcastReceiver
{

    public AppLovinBootReceiver()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
    //    2    4:return          
    }

    public void onReceive(Context context, Intent intent)
    {
    //    0    0:ldc1            #12  <String "android.intent.action.BOOT_COMPLETED">
    //    1    2:aload_2         
    //    2    3:invokevirtual   #18  <Method String Intent.getAction()>
    //    3    6:invokevirtual   #24  <Method boolean String.equals(Object)>
    //    4    9:ifeq            27
    //    5   12:aload_1         
    //    6   13:new             #14  <Class Intent>
    //    7   16:dup             
    //    8   17:aload_1         
    //    9   18:ldc1            #26  <Class AppLovinService>
    //   10   20:invokespecial   #29  <Method void Intent(Context, Class)>
    //   11   23:invokevirtual   #35  <Method android.content.ComponentName Context.startService(Intent)>
    //   12   26:pop             
    //   13   27:return          
    }
}
