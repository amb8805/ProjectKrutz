// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import java.util.Random;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker

public class AdMobInfo
{

    static 
    {
    //    0    0:new             #2   <Class AdMobInfo>
    //    1    3:dup             
    //    2    4:invokespecial   #15  <Method void AdMobInfo()>
    //    3    7:putstatic       #17  <Field AdMobInfo INSTANCE>
    //    4   10:return          
    }

    private AdMobInfo()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #20  <Class Random>
    //    4    8:dup             
    //    5    9:invokespecial   #21  <Method void Random()>
    //    6   12:putfield        #23  <Field Random random>
    //    7   15:return          
    }

    public static AdMobInfo getInstance()
    {
    //    0    0:getstatic       #17  <Field AdMobInfo INSTANCE>
    //    1    3:areturn         
    }

    public int generateAdHitId()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #23  <Field Random random>
    //    3    5:invokevirtual   #30  <Method int Random.nextInt()>
    //    4    8:putfield        #32  <Field int adHitId>
    //    5   11:aload_0         
    //    6   12:getfield        #32  <Field int adHitId>
    //    7   15:ireturn         
    }

    public int getAdHitId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field int adHitId>
    //    2    4:ireturn         
    }

    public String getJoinId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field int adHitId>
    //    2    4:ifne            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:invokestatic    #40  <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
    //    6   12:astore_1        
    //    7   13:aload_1         
    //    8   14:invokevirtual   #43  <Method String GoogleAnalyticsTracker.getVisitorIdForAds()>
    //    9   17:astore_2        
    //   10   18:aload_1         
    //   11   19:invokevirtual   #46  <Method String GoogleAnalyticsTracker.getSessionIdForAds()>
    //   12   22:astore_3        
    //   13   23:aload_2         
    //   14   24:ifnull          7
    //   15   27:aload_3         
    //   16   28:ifnull          7
    //   17   31:iconst_3        
    //   18   32:anewarray       Object[]
    //   19   35:astore          4
    //   20   37:aload           4
    //   21   39:iconst_0        
    //   22   40:aload_2         
    //   23   41:aastore         
    //   24   42:aload           4
    //   25   44:iconst_1        
    //   26   45:aload_3         
    //   27   46:aastore         
    //   28   47:aload           4
    //   29   49:iconst_2        
    //   30   50:aload_0         
    //   31   51:getfield        #32  <Field int adHitId>
    //   32   54:invokestatic    #52  <Method Integer Integer.valueOf(int)>
    //   33   57:aastore         
    //   34   58:ldc1            #54  <String "A,%s,%s,%d">
    //   35   60:aload           4
    //   36   62:invokestatic    #60  <Method String String.format(String, Object[])>
    //   37   65:areturn         
    }

    public void setAdHitId(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #32  <Field int adHitId>
    //    3    5:return          
    }

    private static final AdMobInfo INSTANCE;
    private int adHitId;
    private Random random;
}
