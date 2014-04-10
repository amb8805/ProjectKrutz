// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import org.json.JSONObject;

// Referenced classes of package com.applovin.impl.sdk:
//            aw, az, k, ab, 
//            AppLovinSdkImpl, l

class ba extends aw
{

    ba(az az1, String s, ab ab, AppLovinSdkImpl applovinsdkimpl, String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #12  <Field az b>
    //    3    5:aload_0         
    //    4    6:aload           5
    //    5    8:putfield        #14  <Field String a>
    //    6   11:aload_0         
    //    7   12:aload_2         
    //    8   13:aload_3         
    //    9   14:aload           4
    //   10   16:invokespecial   #17  <Method void aw(String, ab, AppLovinSdkImpl)>
    //   11   19:return          
    }

    public void a(int i)
    {
    //    0    0:iload_1         
    //    1    1:sipush          400
    //    2    4:icmple          14
    //    3    7:aload_0         
    //    4    8:getfield        #12  <Field az b>
    //    5   11:invokevirtual   #24  <Method void az.c()>
    //    6   14:aload_0         
    //    7   15:getfield        #28  <Field AppLovinLogger f>
    //    8   18:aload_0         
    //    9   19:getfield        #31  <Field String d>
    //   10   22:new             #33  <Class StringBuilder>
    //   11   25:dup             
    //   12   26:invokespecial   #35  <Method void StringBuilder()>
    //   13   29:ldc1            #37  <String "Unable to track conversion: server responded with ">
    //   14   31:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   15   34:iload_1         
    //   16   35:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
    //   17   38:invokevirtual   #48  <Method String StringBuilder.toString()>
    //   18   41:invokeinterface #54  <Method void AppLovinLogger.e(String, String)>
    //   19   46:return          
    }

    protected void a(k k1, l l)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #12  <Field az b>
    //    3    5:aload_0         
    //    4    6:getfield        #14  <Field String a>
    //    5    9:invokestatic    #58  <Method String az.a(az, String)>
    //    6   12:aload_2         
    //    7   13:invokevirtual   #63  <Method void k.a(String, l)>
    //    8   16:return          
    }

    public void a(JSONObject jsonobject, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #12  <Field az b>
    //    2    4:invokevirtual   #24  <Method void az.c()>
    //    3    7:return          
    }

    final String a;
    final az b;
}
