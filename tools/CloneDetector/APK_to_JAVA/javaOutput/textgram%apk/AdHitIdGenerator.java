// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            AdMobInfo

public class AdHitIdGenerator
{

    public AdHitIdGenerator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Object()>
    // try 4 12 handler(s) 25
    //    2    4:ldc1            #14  <String "com.google.ads.AdRequest">
    //    3    6:invokestatic    #20  <Method Class Class.forName(String)>
    //    4    9:ifnull          20
    //    5   12:iconst_1        
    //    6   13:istore_2        
    // try 14 19 handler(s) 25
    //    7   14:aload_0         
    //    8   15:iload_2         
    //    9   16:putfield        #22  <Field boolean adMobSdkInstalled>
    //   10   19:return          
    //   11   20:iconst_0        
    //   12   21:istore_2        
    //   13   22:goto            14
    // catch ClassNotFoundException ClassNotFoundException
    //   14   25:astore_1        
    //   15   26:aload_0         
    //   16   27:iconst_0        
    //   17   28:putfield        #22  <Field boolean adMobSdkInstalled>
    //   18   31:return          
    }

    AdHitIdGenerator(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:putfield        #22  <Field boolean adMobSdkInstalled>
    //    5    9:return          
    }

    int getAdHitId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field boolean adMobSdkInstalled>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:invokestatic    #31  <Method AdMobInfo AdMobInfo.getInstance()>
    //    6   12:invokevirtual   #34  <Method int AdMobInfo.generateAdHitId()>
    //    7   15:ireturn         
    }

    private boolean adMobSdkInstalled;
}
