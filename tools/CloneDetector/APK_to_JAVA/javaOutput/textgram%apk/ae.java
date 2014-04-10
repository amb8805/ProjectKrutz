// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ae
    implements Runnable
{

    public ae(String s, Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #17  <Field String b>
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:putfield        #19  <Field Context a>
    //    8   14:return          
    }

    protected HttpURLConnection a(URL url)
        throws IOException
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #28  <Method java.net.URLConnection URL.openConnection()>
    //    2    4:checkcast       #30  <Class HttpURLConnection>
    //    3    7:areturn         
    }

    public void run()
    {
    // try 0 41 handler(s) 127
    //    0    0:new             #35  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #36  <Method void StringBuilder()>
    //    3    7:ldc1            #38  <String "Pinging URL: ">
    //    4    9:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //    5   12:aload_0         
    //    6   13:getfield        #17  <Field String b>
    //    7   16:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //    8   19:invokevirtual   #46  <Method String StringBuilder.toString()>
    //    9   22:invokestatic    #51  <Method void b.a(String)>
    //   10   25:aload_0         
    //   11   26:new             #24  <Class URL>
    //   12   29:dup             
    //   13   30:aload_0         
    //   14   31:getfield        #17  <Field String b>
    //   15   34:invokespecial   #53  <Method void URL(String)>
    //   16   37:invokevirtual   #55  <Method HttpURLConnection a(URL)>
    //   17   40:astore_2        
    // try 41 64 handler(s) 120
    //   18   41:aload_2         
    //   19   42:aload_0         
    //   20   43:getfield        #19  <Field Context a>
    //   21   46:invokestatic    #60  <Method void AdUtil.a(HttpURLConnection, Context)>
    //   22   49:aload_2         
    //   23   50:iconst_1        
    //   24   51:invokevirtual   #64  <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
    //   25   54:aload_2         
    //   26   55:invokevirtual   #67  <Method void HttpURLConnection.connect()>
    //   27   58:aload_2         
    //   28   59:invokevirtual   #71  <Method int HttpURLConnection.getResponseCode()>
    //   29   62:istore          4
    //   30   64:iload           4
    //   31   66:sipush          200
    //   32   69:icmplt          80
    //   33   72:iload           4
    //   34   74:sipush          300
    //   35   77:icmplt          115
    // try 80 115 handler(s) 120
    //   36   80:new             #35  <Class StringBuilder>
    //   37   83:dup             
    //   38   84:invokespecial   #36  <Method void StringBuilder()>
    //   39   87:ldc1            #73  <String "Did not receive 2XX (got ">
    //   40   89:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   41   92:iload           4
    //   42   94:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
    //   43   97:ldc1            #78  <String ") from pinging URL: ">
    //   44   99:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   45  102:aload_0         
    //   46  103:getfield        #17  <Field String b>
    //   47  106:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   48  109:invokevirtual   #46  <Method String StringBuilder.toString()>
    //   49  112:invokestatic    #81  <Method void b.e(String)>
    // try 115 119 handler(s) 127
    //   50  115:aload_2         
    //   51  116:invokevirtual   #84  <Method void HttpURLConnection.disconnect()>
    //   52  119:return          
    // finally
    //   53  120:astore_3        
    // try 121 127 handler(s) 127
    //   54  121:aload_2         
    //   55  122:invokevirtual   #84  <Method void HttpURLConnection.disconnect()>
    //   56  125:aload_3         
    //   57  126:athrow          
    // catch Throwable Throwable Throwable
    //   58  127:astore_1        
    //   59  128:new             #35  <Class StringBuilder>
    //   60  131:dup             
    //   61  132:invokespecial   #36  <Method void StringBuilder()>
    //   62  135:ldc1            #86  <String "Unable to ping the URL: ">
    //   63  137:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   64  140:aload_0         
    //   65  141:getfield        #17  <Field String b>
    //   66  144:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   67  147:invokevirtual   #46  <Method String StringBuilder.toString()>
    //   68  150:aload_1         
    //   69  151:invokestatic    #90  <Method void b.d(String, Throwable)>
    //   70  154:return          
    }

    private final Context a;
    private final String b;
}
