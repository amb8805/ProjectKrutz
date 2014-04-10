// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation.admob;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;
import java.util.Map;

public class AdMobAdapterExtras
    implements NetworkExtras
{

    public AdMobAdapterExtras()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #17  <Field boolean a>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #21  <Method AdMobAdapterExtras clearExtras()>
    //    7   13:pop             
    //    8   14:return          
    }

    public AdMobAdapterExtras(AdMobAdapterExtras admobadapterextras)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #23  <Method void AdMobAdapterExtras()>
    //    2    4:aload_1         
    //    3    5:ifnull          29
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:getfield        #17  <Field boolean a>
    //    7   13:putfield        #17  <Field boolean a>
    //    8   16:aload_0         
    //    9   17:getfield        #25  <Field Map b>
    //   10   20:aload_1         
    //   11   21:getfield        #25  <Field Map b>
    //   12   24:invokeinterface #31  <Method void Map.putAll(Map)>
    //   13   29:return          
    }

    public AdMobAdapterExtras addExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field Map b>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //    5   11:pop             
    //    6   12:aload_0         
    //    7   13:areturn         
    }

    public AdMobAdapterExtras clearExtras()
    {
    //    0    0:aload_0         
    //    1    1:new             #39  <Class HashMap>
    //    2    4:dup             
    //    3    5:invokespecial   #40  <Method void HashMap()>
    //    4    8:putfield        #25  <Field Map b>
    //    5   11:aload_0         
    //    6   12:areturn         
    }

    public Map getExtras()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field Map b>
    //    2    4:areturn         
    }

    public boolean getPlusOneOptOut()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean getUseExactAdSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field boolean a>
    //    2    4:ireturn         
    }

    public AdMobAdapterExtras setExtras(Map map)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #50  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #52  <String "Argument 'extras' may not be null">
    //    5   10:invokespecial   #55  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:aload_1         
    //    9   16:putfield        #25  <Field Map b>
    //   10   19:aload_0         
    //   11   20:areturn         
    }

    public AdMobAdapterExtras setPlusOneOptOut(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:areturn         
    }

    public AdMobAdapterExtras setUseExactAdSize(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #17  <Field boolean a>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    private boolean a;
    private Map b;
}
