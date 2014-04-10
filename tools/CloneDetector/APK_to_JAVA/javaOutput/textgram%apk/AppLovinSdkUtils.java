// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.applovin.sdk:
//            AppLovinSdkSettings

public class AppLovinSdkUtils
{

    public AppLovinSdkUtils()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static long getAdRefreshSeconds(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #14  <Method Bundle retrieveMetadata(Context)>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          19
    //    5    9:aload_1         
    //    6   10:ldc1            #16  <String "applovin.sdk.ad_refresh_seconds">
    //    7   12:bipush          -100
    //    8   14:invokevirtual   #22  <Method int Bundle.getInt(String, int)>
    //    9   17:i2l             
    //   10   18:lreturn         
    //   11   19:ldc2w           #23  <Long -100L>
    //   12   22:lreturn         
    }

    public static String getAutoPreloadSizes(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #14  <Method Bundle retrieveMetadata(Context)>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          22
    //    5    9:aload_1         
    //    6   10:ldc1            #28  <String "applovin.sdk.auto_preload_ad_sizes">
    //    7   12:invokevirtual   #32  <Method String Bundle.getString(String)>
    //    8   15:astore_2        
    //    9   16:aload_2         
    //   10   17:ifnull          22
    //   11   20:aload_2         
    //   12   21:areturn         
    //   13   22:ldc1            #34  <String "BANNER,INTER">
    //   14   24:areturn         
    }

    public static boolean isVerboseLoggingEnabled(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #14  <Method Bundle retrieveMetadata(Context)>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          19
    //    7   11:aload_1         
    //    8   12:ldc1            #38  <String "applovin.sdk.verbose_logging">
    //    9   14:iconst_0        
    //   10   15:invokevirtual   #42  <Method boolean Bundle.getBoolean(String, boolean)>
    //   11   18:istore_2        
    //   12   19:iload_2         
    //   13   20:ireturn         
    }

    protected static Bundle retrieveMetadata(Context context)
    {
    // try 0 18 handler(s) 20
    //    0    0:aload_0         
    //    1    1:invokevirtual   #50  <Method PackageManager Context.getPackageManager()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #54  <Method String Context.getPackageName()>
    //    4    8:sipush          128
    //    5   11:invokevirtual   #60  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
    //    6   14:getfield        #66  <Field Bundle ApplicationInfo.metaData>
    //    7   17:astore_3        
    //    8   18:aload_3         
    //    9   19:areturn         
    // catch android.content.pm.PackageManager.NameNotFoundException
    //   10   20:astore_1        
    //   11   21:ldc1            #68  <String "AppLovinSdk">
    //   12   23:ldc1            #70  <String "Unable to retrieve application metadata">
    //   13   25:aload_1         
    //   14   26:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
    //   15   29:pop             
    //   16   30:aconst_null     
    //   17   31:areturn         
    }

    public static String retrieveSdkKey(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #14  <Method Bundle retrieveMetadata(Context)>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          25
    //    5    9:aload_1         
    //    6   10:ldc1            #79  <String "applovin.sdk.key">
    //    7   12:invokevirtual   #32  <Method String Bundle.getString(String)>
    //    8   15:astore_2        
    //    9   16:aload_2         
    //   10   17:ifnull          22
    //   11   20:aload_2         
    //   12   21:areturn         
    //   13   22:ldc1            #81  <String "">
    //   14   24:areturn         
    //   15   25:aconst_null     
    //   16   26:areturn         
    }

    public static AppLovinSdkSettings retrieveUserSettings(Context context)
    {
    //    0    0:new             #85  <Class AppLovinSdkSettings>
    //    1    3:dup             
    //    2    4:invokespecial   #86  <Method void AppLovinSdkSettings()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:invokestatic    #88  <Method boolean isVerboseLoggingEnabled(Context)>
    //    7   13:invokevirtual   #92  <Method void AppLovinSdkSettings.setVerboseLogging(boolean)>
    //    8   16:aload_1         
    //    9   17:aload_0         
    //   10   18:invokestatic    #94  <Method long getAdRefreshSeconds(Context)>
    //   11   21:invokevirtual   #98  <Method void AppLovinSdkSettings.setBannerAdRefreshSeconds(long)>
    //   12   24:aload_1         
    //   13   25:aload_0         
    //   14   26:invokestatic    #100 <Method String getAutoPreloadSizes(Context)>
    //   15   29:invokevirtual   #104 <Method void AppLovinSdkSettings.setAutoPreloadSizes(String)>
    //   16   32:aload_1         
    //   17   33:areturn         
    }
}
