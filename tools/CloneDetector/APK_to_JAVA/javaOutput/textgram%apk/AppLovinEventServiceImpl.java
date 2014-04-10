// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinLogger;

// Referenced classes of package com.applovin.impl.sdk:
//            AppLovinSdkImpl, s, AppLovinEvent, ac, 
//            z

public class AppLovinEventServiceImpl
    implements AppLovinEventService
{

    AppLovinEventServiceImpl(AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #4   <Class Object>
    //    4    8:dup             
    //    5    9:invokespecial   #26  <Method void Object()>
    //    6   12:putfield        #28  <Field Object c>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #30  <Field AppLovinSdkImpl a>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokevirtual   #36  <Method AppLovinLogger AppLovinSdkImpl.getLogger()>
    //   13   25:putfield        #38  <Field AppLovinLogger b>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokevirtual   #42  <Method s AppLovinSdkImpl.getEventManager()>
    //   17   33:putfield        #44  <Field s d>
    //   18   36:return          
    }

    private void a()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field AppLovinLogger b>
    //    2    4:ldc1            #13  <String "EventServiceImpl">
    //    3    6:ldc1            #46  <String "Starting new user session...">
    //    4    8:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //    5   13:aload_0         
    //    6   14:getfield        #44  <Field s d>
    //    7   17:invokevirtual   #57  <Method String s.e()>
    //    8   20:pop             
    //    9   21:invokestatic    #63  <Method long System.currentTimeMillis()>
    //   10   24:lstore_2        
    //   11   25:aload_0         
    //   12   26:lload_2         
    //   13   27:invokespecial   #66  <Method void b(long)>
    //   14   30:aload_0         
    //   15   31:getfield        #44  <Field s d>
    //   16   34:ldc1            #68  <String "start">
    //   17   36:lload_2         
    //   18   37:invokestatic    #73  <Method AppLovinEvent AppLovinEvent.a(String, long)>
    //   19   40:invokevirtual   #76  <Method void s.a(AppLovinEvent)>
    //   20   43:return          
    }

    private void a(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field Object c>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:monitorenter    
    // try 7 59 handler(s) 60
    //    5    7:aload_0         
    //    6    8:getfield        #38  <Field AppLovinLogger b>
    //    7   11:ldc1            #13  <String "EventServiceImpl">
    //    8   13:new             #78  <Class StringBuilder>
    //    9   16:dup             
    //   10   17:invokespecial   #79  <Method void StringBuilder()>
    //   11   20:ldc1            #81  <String "Closing old session from ts: ">
    //   12   22:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
    //   13   25:lload_1         
    //   14   26:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
    //   15   29:invokevirtual   #91  <Method String StringBuilder.toString()>
    //   16   32:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //   17   37:aload_0         
    //   18   38:getfield        #44  <Field s d>
    //   19   41:ldc1            #93  <String "end">
    //   20   43:lload_1         
    //   21   44:invokestatic    #73  <Method AppLovinEvent AppLovinEvent.a(String, long)>
    //   22   47:invokevirtual   #76  <Method void s.a(AppLovinEvent)>
    //   23   50:aload_0         
    //   24   51:ldc2w           #94  <Long -1L>
    //   25   54:invokespecial   #66  <Method void b(long)>
    //   26   57:aload_3         
    //   27   58:monitorexit     
    //   28   59:return          
    // finally
    //   29   60:astore          4
    // try 62 64 handler(s) 60
    //   30   62:aload_3         
    //   31   63:monitorexit     
    //   32   64:aload           4
    //   33   66:athrow          
    }

    private SharedPreferences b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field AppLovinSdkImpl a>
    //    2    4:invokevirtual   #100 <Method ac AppLovinSdkImpl.getSettingsManager()>
    //    3    7:invokevirtual   #104 <Method SharedPreferences ac.a()>
    //    4   10:areturn         
    }

    private void b(long l)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #106 <Method SharedPreferences b()>
    //    2    4:invokeinterface #112 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //    3    9:astore_3        
    //    4   10:aload_3         
    //    5   11:ldc1            #10  <String "ALEventServicePauseTS">
    //    6   13:lload_1         
    //    7   14:invokeinterface #118 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
    //    8   19:pop             
    //    9   20:aload_3         
    //   10   21:invokeinterface #122 <Method boolean android.content.SharedPreferences$Editor.commit()>
    //   11   26:pop             
    //   12   27:return          
    }

    public void trackRevenueEvent(String s1, double d1, String s2)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field s d>
    //    2    4:aload_1         
    //    3    5:dload_2         
    //    4    6:aload           4
    //    5    8:invokestatic    #127 <Method AppLovinEvent AppLovinEvent.a(String, double, String)>
    //    6   11:invokevirtual   #76  <Method void s.a(AppLovinEvent)>
    //    7   14:return          
    }

    public void trackSessionEnd()
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #63  <Method long System.currentTimeMillis()>
    //    2    4:invokespecial   #130 <Method void a(long)>
    //    3    7:return          
    }

    public void trackSessionPause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field AppLovinLogger b>
    //    2    4:ldc1            #13  <String "EventServiceImpl">
    //    3    6:ldc1            #133 <String "Pausing current session.">
    //    4    8:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //    5   13:aload_0         
    //    6   14:invokestatic    #63  <Method long System.currentTimeMillis()>
    //    7   17:invokespecial   #66  <Method void b(long)>
    //    8   20:return          
    }

    public void trackSessionStart()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field Object c>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 55 handler(s) 121
    //    5    7:aload_0         
    //    6    8:invokespecial   #106 <Method SharedPreferences b()>
    //    7   11:ldc1            #10  <String "ALEventServicePauseTS">
    //    8   13:ldc2w           #94  <Long -1L>
    //    9   16:invokeinterface #138 <Method long SharedPreferences.getLong(String, long)>
    //   10   21:lstore_3        
    //   11   22:lload_3         
    //   12   23:ldc2w           #139 <Long 1000L>
    //   13   26:aload_0         
    //   14   27:getfield        #30  <Field AppLovinSdkImpl a>
    //   15   30:getstatic       #146 <Field ab z.Q>
    //   16   33:invokevirtual   #149 <Method Object AppLovinSdkImpl.a(ab)>
    //   17   36:checkcast       #151 <Class Long>
    //   18   39:invokevirtual   #154 <Method long Long.longValue()>
    //   19   42:lmul            
    //   20   43:ladd            
    //   21   44:lstore          5
    //   22   46:invokestatic    #63  <Method long System.currentTimeMillis()>
    //   23   49:lload           5
    //   24   51:lcmp            
    //   25   52:ifle            126
    //   26   55:iconst_1        
    //   27   56:istore          7
    //   28   58:iload           7
    //   29   60:ifeq            81
    //   30   63:lload_3         
    //   31   64:lconst_0        
    //   32   65:lcmp            
    //   33   66:ifle            74
    // try 69 74 handler(s) 121
    //   34   69:aload_0         
    //   35   70:lload_3         
    //   36   71:invokespecial   #130 <Method void a(long)>
    // try 74 78 handler(s) 121
    //   37   74:aload_0         
    //   38   75:invokespecial   #156 <Method void a()>
    // try 78 80 handler(s) 121
    //   39   78:aload_1         
    //   40   79:monitorexit     
    //   41   80:return          
    // try 81 118 handler(s) 121
    //   42   81:aload_0         
    //   43   82:getfield        #38  <Field AppLovinLogger b>
    //   44   85:ldc1            #13  <String "EventServiceImpl">
    //   45   87:new             #78  <Class StringBuilder>
    //   46   90:dup             
    //   47   91:invokespecial   #79  <Method void StringBuilder()>
    //   48   94:ldc1            #158 <String "Resuming old session from ts: ">
    //   49   96:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
    //   50   99:lload_3         
    //   51  100:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
    //   52  103:invokevirtual   #91  <Method String StringBuilder.toString()>
    //   53  106:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //   54  111:aload_0         
    //   55  112:invokestatic    #63  <Method long System.currentTimeMillis()>
    //   56  115:invokespecial   #66  <Method void b(long)>
    //   57  118:goto            78
    // finally
    //   58  121:astore_2        
    // try 122 124 handler(s) 121
    //   59  122:aload_1         
    //   60  123:monitorexit     
    //   61  124:aload_2         
    //   62  125:athrow          
    //   63  126:iconst_0        
    //   64  127:istore          7
    //   65  129:goto            58
    }

    public void uploadEvents()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field s d>
    //    2    4:invokevirtual   #161 <Method void s.c()>
    //    3    7:return          
    }

    public static final String KEY_LAST_SESSION_TS = "ALEventServicePauseTS";
    public static final String TAG = "EventServiceImpl";
    private AppLovinSdkImpl a;
    private AppLovinLogger b;
    private Object c;
    private s d;
}
