// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinLogger;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;

// Referenced classes of package com.applovin.impl.sdk:
//            AppLovinSdkImpl, z, ak, aq, 
//            ap

class bh extends Thread
{

    bh(AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void Thread()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #19  <Field ServerSocket c>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #21  <Field boolean d>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:putfield        #23  <Field AppLovinSdkImpl a>
    //   11   19:aload_0         
    //   12   20:aload_1         
    //   13   21:invokevirtual   #29  <Method AppLovinLogger AppLovinSdkImpl.getLogger()>
    //   14   24:putfield        #31  <Field AppLovinLogger b>
    //   15   27:aload_0         
    //   16   28:ldc1            #33  <String "AppLovinSdk:WebServer">
    //   17   30:invokevirtual   #37  <Method void setName(String)>
    //   18   33:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field AppLovinLogger b>
    //    2    4:ldc1            #44  <String "AdWebServer">
    //    3    6:ldc1            #46  <String "Staring AppLovin web server...">
    //    4    8:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //    5   13:aload_0         
    //    6   14:getfield        #23  <Field AppLovinSdkImpl a>
    //    7   17:getstatic       #57  <Field ab z.z>
    //    8   20:invokevirtual   #60  <Method Object AppLovinSdkImpl.a(ab)>
    //    9   23:checkcast       #62  <Class Integer>
    //   10   26:invokevirtual   #66  <Method int Integer.intValue()>
    //   11   29:istore_1        
    // try 30 42 handler(s) 169 204
    //   12   30:aload_0         
    //   13   31:new             #68  <Class ServerSocket>
    //   14   34:dup             
    //   15   35:iload_1         
    //   16   36:invokespecial   #71  <Method void ServerSocket(int)>
    //   17   39:putfield        #19  <Field ServerSocket c>
    //   18   42:aload_0         
    //   19   43:getfield        #19  <Field ServerSocket c>
    //   20   46:ifnull          217
    //   21   49:aload_0         
    //   22   50:getfield        #21  <Field boolean d>
    //   23   53:ifne            217
    // try 56 139 handler(s) 142
    //   24   56:aload_0         
    //   25   57:getfield        #31  <Field AppLovinLogger b>
    //   26   60:ldc1            #44  <String "AdWebServer">
    //   27   62:new             #73  <Class StringBuilder>
    //   28   65:dup             
    //   29   66:invokespecial   #74  <Method void StringBuilder()>
    //   30   69:ldc1            #76  <String "Waiting for a client on ">
    //   31   71:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   32   74:iload_1         
    //   33   75:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
    //   34   78:ldc1            #85  <String "...">
    //   35   80:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   36   83:invokevirtual   #89  <Method String StringBuilder.toString()>
    //   37   86:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //   38   91:aload_0         
    //   39   92:getfield        #19  <Field ServerSocket c>
    //   40   95:invokevirtual   #93  <Method java.net.Socket ServerSocket.accept()>
    //   41   98:astore          5
    //   42  100:aload_0         
    //   43  101:getfield        #31  <Field AppLovinLogger b>
    //   44  104:ldc1            #44  <String "AdWebServer">
    //   45  106:ldc1            #95  <String "Client accepted, rendering request...">
    //   46  108:invokeinterface #51  <Method void AppLovinLogger.d(String, String)>
    //   47  113:aload_0         
    //   48  114:getfield        #23  <Field AppLovinSdkImpl a>
    //   49  117:invokevirtual   #98  <Method ap AppLovinSdkImpl.a()>
    //   50  120:new             #100 <Class ak>
    //   51  123:dup             
    //   52  124:aload           5
    //   53  126:aload_0         
    //   54  127:getfield        #23  <Field AppLovinSdkImpl a>
    //   55  130:invokespecial   #103 <Method void ak(java.net.Socket, AppLovinSdkImpl)>
    //   56  133:getstatic       #108 <Field aq aq.a>
    //   57  136:invokevirtual   #113 <Method void ap.a(ar, aq)>
    //   58  139:goto            42
    // catch IOException
    //   59  142:astore          4
    //   60  144:aload_0         
    //   61  145:getfield        #21  <Field boolean d>
    //   62  148:ifne            42
    //   63  151:aload_0         
    //   64  152:getfield        #31  <Field AppLovinLogger b>
    //   65  155:ldc1            #44  <String "AdWebServer">
    //   66  157:ldc1            #115 <String "Web server caught IO error">
    //   67  159:aload           4
    //   68  161:invokeinterface #119 <Method void AppLovinLogger.e(String, String, Throwable)>
    //   69  166:goto            42
    // catch BindException
    //   70  169:astore          6
    //   71  171:ldc1            #44  <String "AdWebServer">
    //   72  173:new             #73  <Class StringBuilder>
    //   73  176:dup             
    //   74  177:invokespecial   #74  <Method void StringBuilder()>
    //   75  180:ldc1            #121 <String "Unable to bind to port ">
    //   76  182:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   77  185:iload_1         
    //   78  186:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
    //   79  189:ldc1            #123 <String ", a server must be already running">
    //   80  191:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   81  194:invokevirtual   #89  <Method String StringBuilder.toString()>
    //   82  197:invokestatic    #129 <Method int Log.w(String, String)>
    //   83  200:pop             
    //   84  201:goto            42
    // catch IOException
    //   85  204:astore_2        
    //   86  205:ldc1            #44  <String "AdWebServer">
    //   87  207:ldc1            #131 <String "Unable to create server socket">
    //   88  209:aload_2         
    //   89  210:invokestatic    #134 <Method int Log.w(String, String, Throwable)>
    //   90  213:pop             
    //   91  214:goto            42
    //   92  217:return          
    }

    private final AppLovinSdkImpl a;
    private final AppLovinLogger b;
    private ServerSocket c;
    private volatile boolean d;
}
