// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.content.*;
import android.util.Log;

// Referenced classes of package com.google.android.apps.analytics:
//            PersistentHitStore, HitStore

public class AnalyticsReceiver extends BroadcastReceiver
{

    public AnalyticsReceiver()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void BroadcastReceiver()>
    //    2    4:return          
    }

    public void onReceive(Context context, Intent intent)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #11  <String "referrer">
    //    2    3:invokevirtual   #23  <Method String Intent.getStringExtra(String)>
    //    3    6:astore_3        
    //    4    7:ldc1            #8   <String "com.android.vending.INSTALL_REFERRER">
    //    5    9:aload_2         
    //    6   10:invokevirtual   #27  <Method String Intent.getAction()>
    //    7   13:invokevirtual   #33  <Method boolean String.equals(Object)>
    //    8   16:ifeq            23
    //    9   19:aload_3         
    //   10   20:ifnonnull       24
    //   11   23:return          
    //   12   24:ldc1            #35  <String "GoogleAnalyticsTracker">
    //   13   26:new             #37  <Class StringBuilder>
    //   14   29:dup             
    //   15   30:invokespecial   #38  <Method void StringBuilder()>
    //   16   33:ldc1            #40  <String "referrer=">
    //   17   35:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
    //   18   38:aload_3         
    //   19   39:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
    //   20   42:invokevirtual   #47  <Method String StringBuilder.toString()>
    //   21   45:invokestatic    #53  <Method int Log.i(String, String)>
    //   22   48:pop             
    //   23   49:new             #55  <Class PersistentHitStore>
    //   24   52:dup             
    //   25   53:aload_1         
    //   26   54:invokespecial   #58  <Method void PersistentHitStore(Context)>
    //   27   57:aload_3         
    //   28   58:invokeinterface #64  <Method boolean HitStore.setReferrer(String)>
    //   29   63:ifeq            75
    //   30   66:ldc1            #35  <String "GoogleAnalyticsTracker">
    //   31   68:ldc1            #66  <String "Referrer store attemped succeeded.">
    //   32   70:invokestatic    #69  <Method int Log.d(String, String)>
    //   33   73:pop             
    //   34   74:return          
    //   35   75:ldc1            #35  <String "GoogleAnalyticsTracker">
    //   36   77:ldc1            #71  <String "Referrer store attempt failed.">
    //   37   79:invokestatic    #74  <Method int Log.w(String, String)>
    //   38   82:pop             
    //   39   83:return          
    }

    static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";
    static final String REFERRER_KEY = "referrer";
}
