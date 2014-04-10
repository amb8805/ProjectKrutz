// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.*;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.params.BasicHttpParams;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker

class PipelinedRequester
{
    static interface Callbacks
    {

        public abstract void pipelineModeChanged(boolean flag);

        public abstract void requestSent();

        public abstract void serverError(int i);
    }


    public PipelinedRequester(HttpHost httphost)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:new             #22  <Class PlainSocketFactory>
    //    3    5:dup             
    //    4    6:invokespecial   #25  <Method void PlainSocketFactory()>
    //    5    9:invokespecial   #28  <Method void PipelinedRequester(HttpHost, SocketFactory)>
    //    6   12:return          
    }

    public PipelinedRequester(HttpHost httphost, SocketFactory socketfactory)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #29  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #31  <Class DefaultHttpClientConnection>
    //    4    8:dup             
    //    5    9:invokespecial   #32  <Method void DefaultHttpClientConnection()>
    //    6   12:putfield        #34  <Field DefaultHttpClientConnection connection>
    //    7   15:aload_0         
    //    8   16:iconst_1        
    //    9   17:putfield        #36  <Field boolean canPipeline>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:putfield        #38  <Field HttpHost host>
    //   13   25:aload_0         
    //   14   26:aload_2         
    //   15   27:putfield        #40  <Field SocketFactory socketFactory>
    //   16   30:return          
    }

    private void closeConnection()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    2    4:ifnull          24
    //    3    7:aload_0         
    //    4    8:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    5   11:invokevirtual   #47  <Method boolean DefaultHttpClientConnection.isOpen()>
    //    6   14:ifeq            24
    // try 17 24 handler(s) 25
    //    7   17:aload_0         
    //    8   18:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    9   21:invokevirtual   #50  <Method void DefaultHttpClientConnection.close()>
    //   10   24:return          
    // catch IOException
    //   11   25:astore_1        
    //   12   26:return          
    }

    private void maybeOpenConnection()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    5   11:invokevirtual   #47  <Method boolean DefaultHttpClientConnection.isOpen()>
    //    6   14:ifne            79
    //    7   17:new             #53  <Class BasicHttpParams>
    //    8   20:dup             
    //    9   21:invokespecial   #54  <Method void BasicHttpParams()>
    //   10   24:astore_1        
    //   11   25:aload_0         
    //   12   26:getfield        #40  <Field SocketFactory socketFactory>
    //   13   29:invokeinterface #60  <Method Socket SocketFactory.createSocket()>
    //   14   34:astore_2        
    //   15   35:aload_0         
    //   16   36:getfield        #40  <Field SocketFactory socketFactory>
    //   17   39:aload_2         
    //   18   40:aload_0         
    //   19   41:getfield        #38  <Field HttpHost host>
    //   20   44:invokevirtual   #66  <Method String HttpHost.getHostName()>
    //   21   47:aload_0         
    //   22   48:getfield        #38  <Field HttpHost host>
    //   23   51:invokevirtual   #70  <Method int HttpHost.getPort()>
    //   24   54:aconst_null     
    //   25   55:iconst_0        
    //   26   56:aload_1         
    //   27   57:invokeinterface #74  <Method Socket SocketFactory.connectSocket(Socket, String, int, java.net.InetAddress, int, org.apache.http.params.HttpParams)>
    //   28   62:astore_3        
    //   29   63:aload_3         
    //   30   64:sipush          8192
    //   31   67:invokevirtual   #80  <Method void Socket.setReceiveBufferSize(int)>
    //   32   70:aload_0         
    //   33   71:getfield        #34  <Field DefaultHttpClientConnection connection>
    //   34   74:aload_3         
    //   35   75:aload_1         
    //   36   76:invokevirtual   #84  <Method void DefaultHttpClientConnection.bind(Socket, org.apache.http.params.HttpParams)>
    //   37   79:return          
    }

    public void addRequest(HttpEntityEnclosingRequest httpentityenclosingrequest)
        throws HttpException, IOException
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #90  <Method void maybeOpenConnection()>
    //    2    4:aload_0         
    //    3    5:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    4    8:aload_1         
    //    5    9:invokevirtual   #94  <Method void DefaultHttpClientConnection.sendRequestHeader(org.apache.http.HttpRequest)>
    //    6   12:aload_0         
    //    7   13:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #97  <Method void DefaultHttpClientConnection.sendRequestEntity(HttpEntityEnclosingRequest)>
    //   10   20:return          
    }

    public void finishedCurrentRequests()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #100 <Method void closeConnection()>
    //    2    4:return          
    }

    public void installCallbacks(Callbacks callbacks1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #104 <Field PipelinedRequester$Callbacks callbacks>
    //    3    5:return          
    }

    public void sendRequests()
        throws IOException, HttpException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    2    4:invokevirtual   #108 <Method void DefaultHttpClientConnection.flush()>
    //    3    7:aload_0         
    //    4    8:getfield        #34  <Field DefaultHttpClientConnection connection>
    //    5   11:invokevirtual   #112 <Method HttpConnectionMetrics DefaultHttpClientConnection.getMetrics()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:invokeinterface #118 <Method long HttpConnectionMetrics.getResponseCount()>
    //    9   21:aload_1         
    //   10   22:invokeinterface #121 <Method long HttpConnectionMetrics.getRequestCount()>
    //   11   27:lcmp            
    //   12   28:ifge            181
    //   13   31:aload_0         
    //   14   32:getfield        #34  <Field DefaultHttpClientConnection connection>
    //   15   35:invokevirtual   #125 <Method HttpResponse DefaultHttpClientConnection.receiveResponseHeader()>
    //   16   38:astore_2        
    //   17   39:aload_2         
    //   18   40:invokeinterface #131 <Method StatusLine HttpResponse.getStatusLine()>
    //   19   45:invokeinterface #137 <Method ProtocolVersion StatusLine.getProtocolVersion()>
    //   20   50:getstatic       #143 <Field HttpVersion HttpVersion.HTTP_1_1>
    //   21   53:invokevirtual   #149 <Method boolean ProtocolVersion.greaterEquals(ProtocolVersion)>
    //   22   56:ifne            74
    //   23   59:aload_0         
    //   24   60:getfield        #104 <Field PipelinedRequester$Callbacks callbacks>
    //   25   63:iconst_0        
    //   26   64:invokeinterface #155 <Method void PipelinedRequester$Callbacks.pipelineModeChanged(boolean)>
    //   27   69:aload_0         
    //   28   70:iconst_0        
    //   29   71:putfield        #36  <Field boolean canPipeline>
    //   30   74:aload_2         
    //   31   75:ldc1            #157 <String "Connection">
    //   32   77:invokeinterface #161 <Method Header[] HttpResponse.getHeaders(String)>
    //   33   82:astore_3        
    //   34   83:aload_3         
    //   35   84:ifnull          139
    //   36   87:aload_3         
    //   37   88:arraylength     
    //   38   89:istore          5
    //   39   91:iconst_0        
    //   40   92:istore          6
    //   41   94:iload           6
    //   42   96:iload           5
    //   43   98:icmpge          139
    //   44  101:ldc1            #162 <String "close">
    //   45  103:aload_3         
    //   46  104:iload           6
    //   47  106:aaload          
    //   48  107:invokeinterface #167 <Method String Header.getValue()>
    //   49  112:invokevirtual   #173 <Method boolean String.equalsIgnoreCase(String)>
    //   50  115:ifeq            133
    //   51  118:aload_0         
    //   52  119:getfield        #104 <Field PipelinedRequester$Callbacks callbacks>
    //   53  122:iconst_0        
    //   54  123:invokeinterface #155 <Method void PipelinedRequester$Callbacks.pipelineModeChanged(boolean)>
    //   55  128:aload_0         
    //   56  129:iconst_0        
    //   57  130:putfield        #36  <Field boolean canPipeline>
    //   58  133:iinc            6  1
    //   59  136:goto            94
    //   60  139:aload_0         
    //   61  140:aload_2         
    //   62  141:invokeinterface #131 <Method StatusLine HttpResponse.getStatusLine()>
    //   63  146:invokeinterface #176 <Method int StatusLine.getStatusCode()>
    //   64  151:putfield        #178 <Field int lastStatusCode>
    //   65  154:aload_0         
    //   66  155:getfield        #178 <Field int lastStatusCode>
    //   67  158:sipush          200
    //   68  161:icmpeq          182
    //   69  164:aload_0         
    //   70  165:getfield        #104 <Field PipelinedRequester$Callbacks callbacks>
    //   71  168:aload_0         
    //   72  169:getfield        #178 <Field int lastStatusCode>
    //   73  172:invokeinterface #181 <Method void PipelinedRequester$Callbacks.serverError(int)>
    //   74  177:aload_0         
    //   75  178:invokespecial   #100 <Method void closeConnection()>
    //   76  181:return          
    //   77  182:aload_0         
    //   78  183:getfield        #34  <Field DefaultHttpClientConnection connection>
    //   79  186:aload_2         
    //   80  187:invokevirtual   #185 <Method void DefaultHttpClientConnection.receiveResponseEntity(HttpResponse)>
    //   81  190:aload_2         
    //   82  191:invokeinterface #189 <Method HttpEntity HttpResponse.getEntity()>
    //   83  196:invokeinterface #194 <Method void HttpEntity.consumeContent()>
    //   84  201:aload_0         
    //   85  202:getfield        #104 <Field PipelinedRequester$Callbacks callbacks>
    //   86  205:invokeinterface #197 <Method void PipelinedRequester$Callbacks.requestSent()>
    //   87  210:invokestatic    #203 <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
    //   88  213:invokevirtual   #206 <Method boolean GoogleAnalyticsTracker.getDebug()>
    //   89  216:ifeq            254
    //   90  219:ldc1            #208 <String "GoogleAnalyticsTracker">
    //   91  221:new             #210 <Class StringBuilder>
    //   92  224:dup             
    //   93  225:invokespecial   #211 <Method void StringBuilder()>
    //   94  228:ldc1            #213 <String "HTTP Response Code: ">
    //   95  230:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
    //   96  233:aload_2         
    //   97  234:invokeinterface #131 <Method StatusLine HttpResponse.getStatusLine()>
    //   98  239:invokeinterface #176 <Method int StatusLine.getStatusCode()>
    //   99  244:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
    //  100  247:invokevirtual   #223 <Method String StringBuilder.toString()>
    //  101  250:invokestatic    #229 <Method int Log.v(String, String)>
    //  102  253:pop             
    //  103  254:aload_0         
    //  104  255:getfield        #36  <Field boolean canPipeline>
    //  105  258:ifne            15
    //  106  261:aload_0         
    //  107  262:invokespecial   #100 <Method void closeConnection()>
    //  108  265:return          
    }

    private static final int RECEIVE_BUFFER_SIZE = 8192;
    Callbacks callbacks;
    boolean canPipeline;
    DefaultHttpClientConnection connection;
    HttpHost host;
    int lastStatusCode;
    SocketFactory socketFactory;
}
