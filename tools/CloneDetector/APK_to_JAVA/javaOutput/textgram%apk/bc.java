// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.content.Context;
import android.util.Base64;
import com.applovin.sdk.AppLovinLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.applovin.impl.sdk:
//            ar, n, AppLovinSdkImpl, z, 
//            m, bd, k

class bc extends ar
{

    bc(AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #8   <String "UploadAppIcon">
    //    2    3:aload_1         
    //    3    4:invokespecial   #11  <Method void ar(String, AppLovinSdkImpl)>
    //    4    7:return          
    }

    private String a(byte abyte0[])
    {
    //    0    0:new             #15  <Class String>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:iconst_0        
    //    4    6:invokestatic    #21  <Method byte[] Base64.encode(byte[], int)>
    //    5    9:invokespecial   #24  <Method void String(byte[])>
    //    6   12:areturn         
    }

    protected void b()
    {
    //    0    0:return          
    }

    protected void c()
    {
    //    0    0:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #34  <Method n f()>
    //    2    4:invokevirtual   #40  <Method byte[] n.e()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnull          131
    // try 12 131 handler(s) 132
    //    6   12:new             #42  <Class JSONObject>
    //    7   15:dup             
    //    8   16:invokespecial   #44  <Method void JSONObject()>
    //    9   19:astore_2        
    //   10   20:aload_2         
    //   11   21:ldc1            #46  <String "icon">
    //   12   23:aload_0         
    //   13   24:aload_1         
    //   14   25:invokespecial   #48  <Method String a(byte[])>
    //   15   28:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
    //   16   31:pop             
    //   17   32:aload_2         
    //   18   33:ldc1            #54  <String "icon_type">
    //   19   35:ldc1            #56  <String "image/jpeg">
    //   20   37:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
    //   21   40:pop             
    //   22   41:aload_2         
    //   23   42:ldc1            #58  <String "package_name">
    //   24   44:aload_0         
    //   25   45:getfield        #61  <Field AppLovinSdkImpl e>
    //   26   48:invokevirtual   #67  <Method Context AppLovinSdkImpl.getApplicationContext()>
    //   27   51:invokevirtual   #73  <Method String Context.getPackageName()>
    //   28   54:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
    //   29   57:pop             
    //   30   58:new             #75  <Class StringBuffer>
    //   31   61:dup             
    //   32   62:ldc1            #77  <String "app">
    //   33   64:invokespecial   #80  <Method void StringBuffer(String)>
    //   34   67:astore          7
    //   35   69:aload           7
    //   36   71:bipush          47
    //   37   73:invokevirtual   #84  <Method StringBuffer StringBuffer.append(char)>
    //   38   76:pop             
    //   39   77:aload           7
    //   40   79:aload_0         
    //   41   80:getfield        #61  <Field AppLovinSdkImpl e>
    //   42   83:getstatic       #89  <Field ab z.e>
    //   43   86:invokevirtual   #92  <Method Object AppLovinSdkImpl.a(ab)>
    //   44   89:checkcast       #15  <Class String>
    //   45   92:invokevirtual   #95  <Method StringBuffer StringBuffer.append(String)>
    //   46   95:pop             
    //   47   96:aload           7
    //   48   98:invokevirtual   #98  <Method String StringBuffer.toString()>
    //   49  101:aload_0         
    //   50  102:getfield        #61  <Field AppLovinSdkImpl e>
    //   51  105:invokestatic    #103 <Method String m.a(String, AppLovinSdkImpl)>
    //   52  108:astore          10
    //   53  110:aload_0         
    //   54  111:getfield        #61  <Field AppLovinSdkImpl e>
    //   55  114:invokevirtual   #107 <Method k AppLovinSdkImpl.getConnectionManager()>
    //   56  117:aload           10
    //   57  119:aload_2         
    //   58  120:new             #109 <Class bd>
    //   59  123:dup             
    //   60  124:aload_0         
    //   61  125:invokespecial   #112 <Method void bd(bc)>
    //   62  128:invokevirtual   #117 <Method void k.a(String, JSONObject, l)>
    //   63  131:return          
    // catch JSONException
    //   64  132:astore_3        
    //   65  133:aload_0         
    //   66  134:getfield        #120 <Field AppLovinLogger f>
    //   67  137:aload_0         
    //   68  138:getfield        #124 <Field String d>
    //   69  141:ldc1            #126 <String "Unable to create icon JSON request">
    //   70  143:aload_3         
    //   71  144:invokeinterface #131 <Method void AppLovinLogger.e(String, String, Throwable)>
    //   72  149:return          
    }
}
