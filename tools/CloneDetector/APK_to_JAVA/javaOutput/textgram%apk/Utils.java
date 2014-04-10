// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

class Utils
{

    Utils()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    static String addQueueTimeParameter(String s, long l)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #18  <Method Uri Uri.parse(String)>
    //    2    4:ldc1            #20  <String "utmht">
    //    3    6:invokevirtual   #24  <Method String Uri.getQueryParameter(String)>
    //    4    9:astore_3        
    //    5   10:aload_3         
    //    6   11:ifnull          57
    // try 14 54 handler(s) 59
    //    7   14:aload_3         
    //    8   15:invokestatic    #30  <Method long Long.parseLong(String)>
    //    9   18:invokestatic    #34  <Method Long Long.valueOf(long)>
    //   10   21:astore          6
    //   11   23:new             #36  <Class StringBuilder>
    //   12   26:dup             
    //   13   27:invokespecial   #37  <Method void StringBuilder()>
    //   14   30:aload_0         
    //   15   31:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   16   34:ldc1            #43  <String "&utmqt=">
    //   17   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   18   39:lload_1         
    //   19   40:aload           6
    //   20   42:invokevirtual   #47  <Method long Long.longValue()>
    //   21   45:lsub            
    //   22   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(long)>
    //   23   49:invokevirtual   #54  <Method String StringBuilder.toString()>
    //   24   52:astore          7
    //   25   54:aload           7
    //   26   56:astore_0        
    //   27   57:aload_0         
    //   28   58:areturn         
    // catch NumberFormatException
    //   29   59:astore          4
    //   30   61:ldc1            #56  <String "GoogleAnalyticsTracker">
    //   31   63:new             #36  <Class StringBuilder>
    //   32   66:dup             
    //   33   67:invokespecial   #37  <Method void StringBuilder()>
    //   34   70:ldc1            #58  <String "Error parsing utmht parameter: ">
    //   35   72:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   36   75:aload           4
    //   37   77:invokevirtual   #59  <Method String NumberFormatException.toString()>
    //   38   80:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   39   83:invokevirtual   #54  <Method String StringBuilder.toString()>
    //   40   86:invokestatic    #65  <Method int Log.e(String, String)>
    //   41   89:pop             
    //   42   90:aload_0         
    //   43   91:areturn         
    }

    static Map parseURLParameters(String s)
    {
    //    0    0:new             #69  <Class HashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #70  <Method void HashMap()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:ldc1            #72  <String "&">
    //    6   11:invokevirtual   #78  <Method String[] String.split(String)>
    //    7   14:astore_2        
    //    8   15:aload_2         
    //    9   16:arraylength     
    //   10   17:istore_3        
    //   11   18:iconst_0        
    //   12   19:istore          4
    //   13   21:iload           4
    //   14   23:iload_3         
    //   15   24:icmpge          88
    //   16   27:aload_2         
    //   17   28:iload           4
    //   18   30:aaload          
    //   19   31:ldc1            #80  <String "=">
    //   20   33:invokevirtual   #78  <Method String[] String.split(String)>
    //   21   36:astore          5
    //   22   38:aload           5
    //   23   40:arraylength     
    //   24   41:iconst_1        
    //   25   42:icmple          66
    //   26   45:aload_1         
    //   27   46:aload           5
    //   28   48:iconst_0        
    //   29   49:aaload          
    //   30   50:aload           5
    //   31   52:iconst_1        
    //   32   53:aaload          
    //   33   54:invokeinterface #86  <Method Object Map.put(Object, Object)>
    //   34   59:pop             
    //   35   60:iinc            4  1
    //   36   63:goto            21
    //   37   66:aload           5
    //   38   68:arraylength     
    //   39   69:iconst_1        
    //   40   70:icmpne          60
    //   41   73:aload_1         
    //   42   74:aload           5
    //   43   76:iconst_0        
    //   44   77:aaload          
    //   45   78:aconst_null     
    //   46   79:invokeinterface #86  <Method Object Map.put(Object, Object)>
    //   47   84:pop             
    //   48   85:goto            60
    //   49   88:aload_1         
    //   50   89:areturn         
    }
}
