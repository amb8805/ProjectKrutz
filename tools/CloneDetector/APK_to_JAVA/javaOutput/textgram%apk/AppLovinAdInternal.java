// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import com.applovin.sdk.*;
import java.util.List;

public class AppLovinAdInternal extends AppLovinAd
{

    public AppLovinAdInternal(String s, AppLovinAdSize applovinadsize, AppLovinAdType applovinadtype, List list, String s1, AdTarget adtarget, String s2)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aload           4
    //    5    6:aload           5
    //    6    8:invokespecial   #16  <Method void AppLovinAd(String, AppLovinAdSize, AppLovinAdType, List, String)>
    //    7   11:aload_0         
    //    8   12:aload           6
    //    9   14:putfield        #18  <Field AppLovinAdInternal$AdTarget a>
    //   10   17:aload           7
    //   11   19:ifnull          29
    //   12   22:aload_0         
    //   13   23:aload           7
    //   14   25:putfield        #20  <Field String c>
    //   15   28:return          
    //   16   29:aload_0         
    //   17   30:ldc1            #22  <String "Unknown">
    //   18   32:putfield        #20  <Field String c>
    //   19   35:return          
    }

    public ApiCompatibilityLevel getCompatibilityLevel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field AppLovinAdInternal$ApiCompatibilityLevel b>
    //    2    4:areturn         
    }

    public String getCurrentAdIdNumber()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field String c>
    //    2    4:areturn         
    }

    public AdTarget getTarget()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field AppLovinAdInternal$AdTarget a>
    //    2    4:areturn         
    }

    public void setCompatibilityLevel(ApiCompatibilityLevel apicompatibilitylevel)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #26  <Field AppLovinAdInternal$ApiCompatibilityLevel b>
    //    3    5:return          
    }

    private final AdTarget a;
    private ApiCompatibilityLevel b;
    private final String c;
}
