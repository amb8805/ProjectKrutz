// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import org.json.JSONObject;

// Referenced classes of package com.applovin.impl.sdk:
//            aw, z, AppLovinSdkImpl, ae, 
//            m, k, l

class ay extends aw
{

    ay(AppLovinAd applovinad, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #11  <String "TrackClick">
    //    2    3:getstatic       #17  <Field ab z.k>
    //    3    6:aload_2         
    //    4    7:invokespecial   #20  <Method void aw(String, ab, AppLovinSdkImpl)>
    //    5   10:aload_1         
    //    6   11:ifnonnull       24
    //    7   14:new             #22  <Class IllegalArgumentException>
    //    8   17:dup             
    //    9   18:ldc1            #24  <String "No clicked ad specified">
    //   10   20:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //   11   23:athrow          
    //   12   24:aload_0         
    //   13   25:aload_1         
    //   14   26:putfield        #29  <Field AppLovinAd a>
    //   15   29:aload_2         
    //   16   30:invokevirtual   #35  <Method ae AppLovinSdkImpl.b()>
    //   17   33:ldc1            #37  <String "clk_req">
    //   18   35:invokevirtual   #41  <Method void ae.a(String)>
    //   19   38:return          
    }

    public void a(int i)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #46  <Field AppLovinSdkImpl e>
    //    3    5:invokestatic    #51  <Method void m.b(int, AppLovinSdkImpl)>
    //    4    8:return          
    }

    protected void a(k k1, l l)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #29  <Field AppLovinAd a>
    //    3    5:invokevirtual   #58  <Method String AppLovinAd.getClickTrackerUrl()>
    //    4    8:aload_2         
    //    5    9:invokevirtual   #63  <Method void k.a(String, l)>
    //    6   12:return          
    }

    public void a(JSONObject jsonobject, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field AppLovinSdkImpl e>
    //    2    4:invokevirtual   #35  <Method ae AppLovinSdkImpl.b()>
    //    3    7:ldc1            #66  <String "clk_trk">
    //    4    9:invokevirtual   #41  <Method void ae.a(String)>
    //    5   12:return          
    }

    private final AppLovinAd a;
}
