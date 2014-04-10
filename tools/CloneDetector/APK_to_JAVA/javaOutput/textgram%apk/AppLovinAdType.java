// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import java.util.HashSet;
import java.util.Set;

public class AppLovinAdType
{

    static 
    {
    //    0    0:new             #2   <Class AppLovinAdType>
    //    1    3:dup             
    //    2    4:ldc1            #12  <String "REGULAR">
    //    3    6:invokespecial   #16  <Method void AppLovinAdType(String)>
    //    4    9:putstatic       #18  <Field AppLovinAdType REGULAR>
    //    5   12:new             #2   <Class AppLovinAdType>
    //    6   15:dup             
    //    7   16:ldc1            #20  <String "VIDEOA">
    //    8   18:invokespecial   #16  <Method void AppLovinAdType(String)>
    //    9   21:putstatic       #22  <Field AppLovinAdType INCENTIVIZED>
    //   10   24:return          
    }

    public AppLovinAdType(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #24  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #26  <Field String a>
    //    5    9:return          
    }

    public static Set allTypes()
    {
    //    0    0:new             #30  <Class HashSet>
    //    1    3:dup             
    //    2    4:iconst_2        
    //    3    5:invokespecial   #33  <Method void HashSet(int)>
    //    4    8:astore_0        
    //    5    9:aload_0         
    //    6   10:getstatic       #18  <Field AppLovinAdType REGULAR>
    //    7   13:invokeinterface #39  <Method boolean Set.add(Object)>
    //    8   18:pop             
    //    9   19:aload_0         
    //   10   20:getstatic       #22  <Field AppLovinAdType INCENTIVIZED>
    //   11   23:invokeinterface #39  <Method boolean Set.add(Object)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:areturn         
    }

    public static AppLovinAdType fromString(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #47  <Method String String.toUpperCase()>
    //    2    4:getstatic       #22  <Field AppLovinAdType INCENTIVIZED>
    //    3    7:invokevirtual   #50  <Method String getLabel()>
    //    4   10:invokevirtual   #53  <Method boolean String.equals(Object)>
    //    5   13:ifeq            20
    //    6   16:getstatic       #22  <Field AppLovinAdType INCENTIVIZED>
    //    7   19:areturn         
    //    8   20:getstatic       #18  <Field AppLovinAdType REGULAR>
    //    9   23:areturn         
    }

    public boolean equals(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:if_acmpne       7
    //    3    5:iconst_1        
    //    4    6:ireturn         
    //    5    7:aload_1         
    //    6    8:ifnull          22
    //    7   11:aload_0         
    //    8   12:invokevirtual   #57  <Method Class Object.getClass()>
    //    9   15:aload_1         
    //   10   16:invokevirtual   #57  <Method Class Object.getClass()>
    //   11   19:if_acmpeq       24
    //   12   22:iconst_0        
    //   13   23:ireturn         
    //   14   24:aload_1         
    //   15   25:checkcast       #2   <Class AppLovinAdType>
    //   16   28:astore_2        
    //   17   29:aload_0         
    //   18   30:getfield        #26  <Field String a>
    //   19   33:ifnull          52
    //   20   36:aload_0         
    //   21   37:getfield        #26  <Field String a>
    //   22   40:aload_2         
    //   23   41:getfield        #26  <Field String a>
    //   24   44:invokevirtual   #53  <Method boolean String.equals(Object)>
    //   25   47:ifne            5
    //   26   50:iconst_0        
    //   27   51:ireturn         
    //   28   52:aload_2         
    //   29   53:getfield        #26  <Field String a>
    //   30   56:ifnull          5
    //   31   59:goto            50
    }

    public String getLabel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field String a>
    //    2    4:invokevirtual   #47  <Method String String.toUpperCase()>
    //    3    7:areturn         
    }

    public int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field String a>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #26  <Field String a>
    //    5   11:invokevirtual   #61  <Method int String.hashCode()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public String toString()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #50  <Method String getLabel()>
    //    2    4:areturn         
    }

    public static final AppLovinAdType INCENTIVIZED;
    public static final AppLovinAdType REGULAR;
    private final String a;
}
