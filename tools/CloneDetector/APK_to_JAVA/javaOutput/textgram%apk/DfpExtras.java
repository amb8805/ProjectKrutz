// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.doubleclick;

import com.google.ads.mediation.admob.AdMobAdapterExtras;
import java.util.Map;

public class DfpExtras extends AdMobAdapterExtras
{

    public DfpExtras()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void AdMobAdapterExtras()>
    //    2    4:return          
    }

    public DfpExtras(DfpExtras dfpextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #14  <Method void AdMobAdapterExtras(AdMobAdapterExtras)>
    //    3    5:aload_1         
    //    4    6:ifnull          17
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:getfield        #16  <Field String a>
    //    8   14:putfield        #16  <Field String a>
    //    9   17:return          
    }

    public DfpExtras addExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #21  <Method AdMobAdapterExtras AdMobAdapterExtras.addExtra(String, Object)>
    //    4    6:pop             
    //    5    7:aload_0         
    //    6    8:areturn         
    }

    public volatile AdMobAdapterExtras addExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #23  <Method DfpExtras addExtra(String, Object)>
    //    4    6:areturn         
    }

    public DfpExtras clearExtras()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #28  <Method AdMobAdapterExtras AdMobAdapterExtras.clearExtras()>
    //    2    4:pop             
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public volatile AdMobAdapterExtras clearExtras()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #30  <Method DfpExtras clearExtras()>
    //    2    4:areturn         
    }

    public String getPublisherProvidedId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field String a>
    //    2    4:areturn         
    }

    public DfpExtras setExtras(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #37  <Method AdMobAdapterExtras AdMobAdapterExtras.setExtras(Map)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public volatile AdMobAdapterExtras setExtras(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #39  <Method DfpExtras setExtras(Map)>
    //    3    5:areturn         
    }

    public DfpExtras setPlusOneOptOut(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #44  <Method AdMobAdapterExtras AdMobAdapterExtras.setPlusOneOptOut(boolean)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public volatile AdMobAdapterExtras setPlusOneOptOut(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #46  <Method DfpExtras setPlusOneOptOut(boolean)>
    //    3    5:areturn         
    }

    public DfpExtras setPublisherProvidedId(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #16  <Field String a>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public DfpExtras setUseExactAdSize(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #51  <Method AdMobAdapterExtras AdMobAdapterExtras.setUseExactAdSize(boolean)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public volatile AdMobAdapterExtras setUseExactAdSize(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #53  <Method DfpExtras setUseExactAdSize(boolean)>
    //    3    5:areturn         
    }

    private String a;
}
