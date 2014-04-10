// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import java.util.List;

// Referenced classes of package com.applovin.sdk:
//            AppLovinAdType, AppLovinAdSize

public class AppLovinAd
{

    public AppLovinAd(String s, AppLovinAdSize applovinadsize, AppLovinAdType applovinadtype, List list, String s1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Object()>
    //    2    4:aload_1         
    //    3    5:ifnonnull       18
    //    4    8:new             #22  <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:ldc1            #24  <String "No html specified">
    //    7   14:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //    8   17:athrow          
    //    9   18:aload_2         
    //   10   19:ifnonnull       32
    //   11   22:new             #22  <Class IllegalArgumentException>
    //   12   25:dup             
    //   13   26:ldc1            #29  <String "No size specified">
    //   14   28:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //   15   31:athrow          
    //   16   32:aload_3         
    //   17   33:ifnonnull       46
    //   18   36:new             #22  <Class IllegalArgumentException>
    //   19   39:dup             
    //   20   40:ldc1            #31  <String "No type specified">
    //   21   42:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //   22   45:athrow          
    //   23   46:aload_0         
    //   24   47:aload_1         
    //   25   48:putfield        #33  <Field String a>
    //   26   51:aload_0         
    //   27   52:aload_2         
    //   28   53:putfield        #35  <Field AppLovinAdSize b>
    //   29   56:aload_0         
    //   30   57:aload_3         
    //   31   58:putfield        #37  <Field AppLovinAdType c>
    //   32   61:aload_0         
    //   33   62:aload           4
    //   34   64:putfield        #39  <Field List d>
    //   35   67:aload_0         
    //   36   68:aload           5
    //   37   70:putfield        #41  <Field String e>
    //   38   73:return          
    }

    public AppLovinAd(String s, AppLovinAdSize applovinadsize, List list)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aconst_null     
    //    5    5:invokespecial   #45  <Method void AppLovinAd(String, AppLovinAdSize, List, String)>
    //    6    8:return          
    }

    public AppLovinAd(String s, AppLovinAdSize applovinadsize, List list, String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #50  <Field AppLovinAdType AppLovinAdType.REGULAR>
    //    4    6:aload_3         
    //    5    7:aload           4
    //    6    9:invokespecial   #52  <Method void AppLovinAd(String, AppLovinAdSize, AppLovinAdType, List, String)>
    //    7   12:return          
    }

    public String getClickTrackerUrl()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field String f>
    //    2    4:areturn         
    }

    public List getDestinationUrls()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #39  <Field List d>
    //    2    4:areturn         
    }

    public String getHtml()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field String a>
    //    2    4:areturn         
    }

    public AppLovinAdSize getSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field AppLovinAdSize b>
    //    2    4:areturn         
    }

    public AppLovinAdType getType()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field AppLovinAdType c>
    //    2    4:areturn         
    }

    public String getVideoFilename()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #41  <Field String e>
    //    2    4:areturn         
    }

    public void setClickTrackerUrl(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #56  <Field String f>
    //    3    5:return          
    }

    private final String a;
    private final AppLovinAdSize b;
    private final AppLovinAdType c;
    private final List d;
    private final String e;
    private String f;
}
