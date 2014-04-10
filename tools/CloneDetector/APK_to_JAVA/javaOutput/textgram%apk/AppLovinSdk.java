// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinSdkImpl;

// Referenced classes of package com.applovin.sdk:
//            AppLovinSdkUtils, AppLovinSdkSettings, AppLovinAdService, AppLovinEventService, 
//            AppLovinLogger, AppLovinTargetingData

public abstract class AppLovinSdk
{

    static 
    {
    //    0    0:iconst_0        
    //    1    1:anewarray       AppLovinSdk[]
    //    2    4:putstatic       #22  <Field AppLovinSdk[] a>
    //    3    7:new             #4   <Class Object>
    //    4   10:dup             
    //    5   11:invokespecial   #25  <Method void Object()>
    //    6   14:putstatic       #27  <Field Object b>
    //    7   17:return          
    }

    public AppLovinSdk()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static AppLovinSdk getInstance(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #31  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #33  <String "No context specified">
    //    5   10:invokespecial   #36  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:invokestatic    #42  <Method String AppLovinSdkUtils.retrieveSdkKey(Context)>
    //    9   18:aload_0         
    //   10   19:invokestatic    #46  <Method AppLovinSdkSettings AppLovinSdkUtils.retrieveUserSettings(Context)>
    //   11   22:aload_0         
    //   12   23:invokestatic    #49  <Method AppLovinSdk getInstance(String, AppLovinSdkSettings, Context)>
    //   13   26:areturn         
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings applovinsdksettings, Context context)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #31  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #33  <String "No context specified">
    //    5   10:invokespecial   #36  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_1         
    //    8   15:invokestatic    #42  <Method String AppLovinSdkUtils.retrieveSdkKey(Context)>
    //    9   18:aload_0         
    //   10   19:aload_1         
    //   11   20:invokestatic    #49  <Method AppLovinSdk getInstance(String, AppLovinSdkSettings, Context)>
    //   12   23:areturn         
    }

    public static AppLovinSdk getInstance(String s, AppLovinSdkSettings applovinsdksettings, Context context)
    {
    //    0    0:getstatic       #27  <Field Object b>
    //    1    3:astore_3        
    //    2    4:aload_3         
    //    3    5:monitorenter    
    // try 6 38 handler(s) 85
    //    4    6:getstatic       #22  <Field AppLovinSdk[] a>
    //    5    9:arraylength     
    //    6   10:iconst_1        
    //    7   11:icmpne          41
    //    8   14:getstatic       #22  <Field AppLovinSdk[] a>
    //    9   17:iconst_0        
    //   10   18:aaload          
    //   11   19:invokevirtual   #56  <Method String getSdkKey()>
    //   12   22:aload_0         
    //   13   23:invokevirtual   #62  <Method boolean String.equals(Object)>
    //   14   26:ifeq            41
    //   15   29:getstatic       #22  <Field AppLovinSdk[] a>
    //   16   32:iconst_0        
    //   17   33:aaload          
    //   18   34:astore          13
    //   19   36:aload_3         
    //   20   37:monitorexit     
    //   21   38:aload           13
    //   22   40:areturn         
    // try 41 51 handler(s) 85
    //   23   41:getstatic       #22  <Field AppLovinSdk[] a>
    //   24   44:astore          5
    //   25   46:aload           5
    //   26   48:arraylength     
    //   27   49:istore          6
    //   28   51:iconst_0        
    //   29   52:istore          7
    //   30   54:iload           7
    //   31   56:iload           6
    //   32   58:icmpge          98
    // try 61 82 handler(s) 85
    //   33   61:aload           5
    //   34   63:iload           7
    //   35   65:aaload          
    //   36   66:astore          8
    //   37   68:aload           8
    //   38   70:invokevirtual   #56  <Method String getSdkKey()>
    //   39   73:aload_0         
    //   40   74:invokevirtual   #62  <Method boolean String.equals(Object)>
    //   41   77:ifeq            92
    //   42   80:aload_3         
    //   43   81:monitorexit     
    //   44   82:aload           8
    //   45   84:areturn         
    // finally
    //   46   85:astore          4
    // try 87 89 handler(s) 85
    //   47   87:aload_3         
    //   48   88:monitorexit     
    //   49   89:aload           4
    //   50   91:athrow          
    //   51   92:iinc            7  1
    //   52   95:goto            54
    // try 98 118 handler(s) 162 85
    //   53   98:new             #64  <Class AppLovinSdkImpl>
    //   54  101:dup             
    //   55  102:invokespecial   #65  <Method void AppLovinSdkImpl()>
    //   56  105:astore          9
    //   57  107:aload           9
    //   58  109:aload_0         
    //   59  110:aload_1         
    //   60  111:aload_2         
    //   61  112:invokevirtual   #71  <Method Context Context.getApplicationContext()>
    //   62  115:invokevirtual   #75  <Method void initialize(String, AppLovinSdkSettings, Context)>
    // try 118 159 handler(s) 85
    //   63  118:iconst_1        
    //   64  119:getstatic       #22  <Field AppLovinSdk[] a>
    //   65  122:arraylength     
    //   66  123:iadd            
    //   67  124:anewarray       AppLovinSdk[]
    //   68  127:astore          12
    //   69  129:getstatic       #22  <Field AppLovinSdk[] a>
    //   70  132:iconst_0        
    //   71  133:aload           12
    //   72  135:iconst_0        
    //   73  136:getstatic       #22  <Field AppLovinSdk[] a>
    //   74  139:arraylength     
    //   75  140:invokestatic    #81  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   76  143:aload           12
    //   77  145:getstatic       #22  <Field AppLovinSdk[] a>
    //   78  148:arraylength     
    //   79  149:aload           9
    //   80  151:aastore         
    //   81  152:aload           12
    //   82  154:putstatic       #22  <Field AppLovinSdk[] a>
    //   83  157:aload_3         
    //   84  158:monitorexit     
    //   85  159:aload           9
    //   86  161:areturn         
    // catch Throwable
    //   87  162:astore          10
    // try 164 184 handler(s) 85
    //   88  164:ldc1            #83  <String "AppLovinSdk">
    //   89  166:ldc1            #85  <String "Failed to create AppLovin SDK. Try cleaning application data and starting the applion again.">
    //   90  168:aload           10
    //   91  170:invokestatic    #91  <Method int Log.e(String, String, Throwable)>
    //   92  173:pop             
    //   93  174:new             #93  <Class RuntimeException>
    //   94  177:dup             
    //   95  178:ldc1            #95  <String "Unable to create AppLovin SDK">
    //   96  180:invokespecial   #96  <Method void RuntimeException(String)>
    //   97  183:athrow          
    }

    public static void initializeSdk(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #31  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #33  <String "No context specified">
    //    5   10:invokespecial   #36  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:invokestatic    #100 <Method AppLovinSdk getInstance(Context)>
    //    9   18:astore_1        
    //   10   19:aload_1         
    //   11   20:ifnull          28
    //   12   23:aload_1         
    //   13   24:invokevirtual   #102 <Method void initializeSdk()>
    //   14   27:return          
    //   15   28:ldc1            #83  <String "AppLovinSdk">
    //   16   30:ldc1            #104 <String "Unable to initialize AppLovin SDK: SDK object not created">
    //   17   32:invokestatic    #107 <Method int Log.e(String, String)>
    //   18   35:pop             
    //   19   36:return          
    }

    public abstract AppLovinAdService getAdService();

    public abstract Context getApplicationContext();

    public abstract AppLovinEventService getEventService();

    public abstract AppLovinLogger getLogger();

    public abstract String getSdkKey();

    public abstract AppLovinSdkSettings getSettings();

    public abstract AppLovinTargetingData getTargetingData();

    public abstract boolean hasCriticalErrors();

    protected abstract void initialize(String s, AppLovinSdkSettings applovinsdksettings, Context context);

    public abstract void initializeSdk();

    public abstract boolean isEnabled();

    public abstract void setPluginVersion(String s);

    public static final String URI_HOST = "com.applovin.sdk";
    public static final String URI_SCHEME = "applovin";
    public static final String VERSION = "5.2.2";
    private static AppLovinSdk a[];
    private static final Object b;
}
