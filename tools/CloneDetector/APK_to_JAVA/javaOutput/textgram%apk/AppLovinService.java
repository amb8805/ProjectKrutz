// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package com.applovin.sdk:
//            AppLovinSdk

public class AppLovinService extends Service
{

    public AppLovinService()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Service()>
    //    2    4:return          
    }

    public IBinder onBind(Intent intent)
    {
    //    0    0:new             #12  <Class AppLovinService$LocalBinder>
    //    1    3:dup             
    //    2    4:invokespecial   #13  <Method void AppLovinService$LocalBinder()>
    //    3    7:areturn         
    }

    public void onCreate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Service.onCreate()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #20  <Method android.content.Context getApplicationContext()>
    //    4    8:invokestatic    #26  <Method AppLovinSdk AppLovinSdk.getInstance(android.content.Context)>
    //    5   11:pop             
    //    6   12:return          
    }

    private class LocalBinder extends Binder
    {

        public LocalBinder()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Binder()>
        //    2    4:return          
        }
    }

}
