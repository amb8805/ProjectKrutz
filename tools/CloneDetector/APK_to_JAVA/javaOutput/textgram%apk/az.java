// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import com.applovin.sdk.AppLovinLogger;

// Referenced classes of package com.applovin.impl.sdk:
//            ar, m, z, AppLovinSdkImpl, 
//            ac, ba, aw

class az extends ar
{

    az(AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #8   <String "TrackConversion">
    //    2    3:aload_1         
    //    3    4:invokespecial   #11  <Method void ar(String, AppLovinSdkImpl)>
    //    4    7:return          
    }

    static String a(az az1, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #16  <Method String a(String)>
    //    3    5:areturn         
    }

    private String a(String s)
    {
    //    0    0:new             #18  <Class StringBuffer>
    //    1    3:dup             
    //    2    4:invokespecial   #21  <Method void StringBuffer()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc1            #23  <String "conv">
    //    6   11:aload_0         
    //    7   12:getfield        #27  <Field AppLovinSdkImpl e>
    //    8   15:invokestatic    #33  <Method String m.b(String, AppLovinSdkImpl)>
    //    9   18:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   10   21:pop             
    //   11   22:aload_2         
    //   12   23:ldc1            #39  <String "?">
    //   13   25:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   14   28:pop             
    //   15   29:aload_2         
    //   16   30:ldc1            #41  <String "did=">
    //   17   32:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   18   35:aload_0         
    //   19   36:getfield        #27  <Field AppLovinSdkImpl e>
    //   20   39:getstatic       #47  <Field ab z.c>
    //   21   42:invokevirtual   #52  <Method Object AppLovinSdkImpl.a(ab)>
    //   22   45:checkcast       #54  <Class String>
    //   23   48:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   24   51:ldc1            #56  <String "&">
    //   25   53:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   26   56:pop             
    //   27   57:aload_2         
    //   28   58:ldc1            #58  <String "aid=">
    //   29   60:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   30   63:aload_1         
    //   31   64:invokevirtual   #37  <Method StringBuffer StringBuffer.append(String)>
    //   32   67:pop             
    //   33   68:aload_2         
    //   34   69:invokevirtual   #62  <Method String StringBuffer.toString()>
    //   35   72:areturn         
    }

    protected String b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field AppLovinSdkImpl e>
    //    2    4:getstatic       #65  <Field ab z.d>
    //    3    7:invokevirtual   #52  <Method Object AppLovinSdkImpl.a(ab)>
    //    4   10:checkcast       #54  <Class String>
    //    5   13:areturn         
    }

    protected void c()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field AppLovinSdkImpl e>
    //    2    4:invokevirtual   #69  <Method ac AppLovinSdkImpl.getSettingsManager()>
    //    3    7:invokevirtual   #74  <Method SharedPreferences ac.a()>
    //    4   10:invokeinterface #80  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //    5   15:astore_1        
    //    6   16:aload_1         
    //    7   17:ldc1            #82  <String "conversion_tracked">
    //    8   19:iconst_1        
    //    9   20:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //   10   25:pop             
    //   11   26:aload_1         
    //   12   27:invokeinterface #92  <Method boolean android.content.SharedPreferences$Editor.commit()>
    //   13   32:pop             
    //   14   33:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #95  <Method String b()>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #99  <Field AppLovinLogger f>
    //    5    9:aload_0         
    //    6   10:getfield        #102 <Field String d>
    //    7   13:new             #104 <Class StringBuilder>
    //    8   16:dup             
    //    9   17:invokespecial   #105 <Method void StringBuilder()>
    //   10   20:ldc1            #107 <String "Tracking conversion for advertiser \"">
    //   11   22:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
    //   12   25:aload_1         
    //   13   26:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
    //   14   29:ldc1            #112 <String "\" and device \"">
    //   15   31:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
    //   16   34:aload_0         
    //   17   35:getfield        #27  <Field AppLovinSdkImpl e>
    //   18   38:getstatic       #47  <Field ab z.c>
    //   19   41:invokevirtual   #52  <Method Object AppLovinSdkImpl.a(ab)>
    //   20   44:checkcast       #54  <Class String>
    //   21   47:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
    //   22   50:ldc1            #114 <String "\"...">
    //   23   52:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
    //   24   55:invokevirtual   #115 <Method String StringBuilder.toString()>
    //   25   58:invokeinterface #120 <Method void AppLovinLogger.d(String, String)>
    //   26   63:new             #122 <Class ba>
    //   27   66:dup             
    //   28   67:aload_0         
    //   29   68:ldc1            #124 <String "RepeatTrackConversion">
    //   30   70:getstatic       #127 <Field ab z.j>
    //   31   73:aload_0         
    //   32   74:getfield        #27  <Field AppLovinSdkImpl e>
    //   33   77:aload_1         
    //   34   78:invokespecial   #130 <Method void ba(az, String, ab, AppLovinSdkImpl, String)>
    //   35   81:astore_2        
    //   36   82:aload_2         
    //   37   83:getstatic       #133 <Field ab z.n>
    //   38   86:invokevirtual   #138 <Method void aw.a(ab)>
    //   39   89:aload_2         
    //   40   90:invokevirtual   #140 <Method void aw.run()>
    //   41   93:return          
    }
}
