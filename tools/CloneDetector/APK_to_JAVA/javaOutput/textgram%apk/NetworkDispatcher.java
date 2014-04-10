// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.os.*;
import android.util.Log;
import java.io.IOException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.apps.analytics:
//            Dispatcher, Hit, PipelinedRequester, HitStore, 
//            GoogleAnalyticsTracker, Utils

class NetworkDispatcher
    implements Dispatcher
{
    private static class DispatcherThread extends HandlerThread
    {

        private DispatcherThread(Dispatcher.Callbacks callbacks1, PipelinedRequester pipelinedrequester, String s, NetworkDispatcher networkdispatcher)
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #27  <String "DispatcherThread">
        //    2    3:invokespecial   #30  <Method void HandlerThread(String)>
        //    3    6:aload_0         
        //    4    7:bipush          30
        //    5    9:putfield        #32  <Field int maxEventsPerRequest>
        //    6   12:aload_0         
        //    7   13:aconst_null     
        //    8   14:putfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    9   17:aload_0         
        //   10   18:aload_1         
        //   11   19:putfield        #36  <Field Dispatcher$Callbacks callbacks>
        //   12   22:aload_0         
        //   13   23:aload_3         
        //   14   24:putfield        #38  <Field String userAgent>
        //   15   27:aload_0         
        //   16   28:aload_2         
        //   17   29:putfield        #40  <Field PipelinedRequester pipelinedRequester>
        //   18   32:aload_0         
        //   19   33:new             #42  <Class NetworkDispatcher$DispatcherThread$RequesterCallbacks>
        //   20   36:dup             
        //   21   37:aload_0         
        //   22   38:aconst_null     
        //   23   39:invokespecial   #45  <Method void NetworkDispatcher$DispatcherThread$RequesterCallbacks(NetworkDispatcher$DispatcherThread, NetworkDispatcher$1)>
        //   24   42:putfield        #47  <Field NetworkDispatcher$DispatcherThread$RequesterCallbacks requesterCallBacks>
        //   25   45:aload_0         
        //   26   46:getfield        #40  <Field PipelinedRequester pipelinedRequester>
        //   27   49:aload_0         
        //   28   50:getfield        #47  <Field NetworkDispatcher$DispatcherThread$RequesterCallbacks requesterCallBacks>
        //   29   53:invokevirtual   #53  <Method void PipelinedRequester.installCallbacks(PipelinedRequester$Callbacks)>
        //   30   56:aload_0         
        //   31   57:aload           4
        //   32   59:putfield        #55  <Field NetworkDispatcher parent>
        //   33   62:return          
        }

        DispatcherThread(Dispatcher.Callbacks callbacks1, PipelinedRequester pipelinedrequester, String s, NetworkDispatcher networkdispatcher, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aload_3         
        //    4    4:aload           4
        //    5    6:invokespecial   #58  <Method void NetworkDispatcher$DispatcherThread(Dispatcher$Callbacks, PipelinedRequester, String, NetworkDispatcher)>
        //    6    9:return          
        }

        private DispatcherThread(Dispatcher.Callbacks callbacks1, String s, NetworkDispatcher networkdispatcher)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:new             #49  <Class PipelinedRequester>
        //    3    5:dup             
        //    4    6:aload_3         
        //    5    7:invokestatic    #65  <Method HttpHost NetworkDispatcher.access$200(NetworkDispatcher)>
        //    6   10:invokespecial   #68  <Method void PipelinedRequester(HttpHost)>
        //    7   13:aload_2         
        //    8   14:aload_3         
        //    9   15:invokespecial   #58  <Method void NetworkDispatcher$DispatcherThread(Dispatcher$Callbacks, PipelinedRequester, String, NetworkDispatcher)>
        //   10   18:return          
        }

        DispatcherThread(Dispatcher.Callbacks callbacks1, String s, NetworkDispatcher networkdispatcher, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aload_3         
        //    4    4:invokespecial   #71  <Method void NetworkDispatcher$DispatcherThread(Dispatcher$Callbacks, String, NetworkDispatcher)>
        //    5    7:return          
        }

        static int access$1000(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #32  <Field int maxEventsPerRequest>
        //    2    4:ireturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #32  <Field int maxEventsPerRequest>
        //    5    4:ireturn         
        }

        static int access$1002(DispatcherThread dispatcherthread, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #32  <Field int maxEventsPerRequest>
        //    3    5:iload_1         
        //    4    6:ireturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:iload_1         
        //    7    2:putfield        #32  <Field int maxEventsPerRequest>
        //    8    5:iload_1         
        //    9    6:ireturn         
        }

        static String access$1100(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #38  <Field String userAgent>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #38  <Field String userAgent>
        //    5    4:areturn         
        }

        static RequesterCallbacks access$1200(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field NetworkDispatcher$DispatcherThread$RequesterCallbacks requesterCallBacks>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #47  <Field NetworkDispatcher$DispatcherThread$RequesterCallbacks requesterCallBacks>
        //    5    4:areturn         
        }

        static AsyncDispatchTask access$400(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    5    4:areturn         
        }

        static AsyncDispatchTask access$402(DispatcherThread dispatcherthread, AsyncDispatchTask asyncdispatchtask)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    3    5:aload_1         
        //    4    6:areturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:aload_1         
        //    7    2:putfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    8    5:aload_1         
        //    9    6:areturn         
        }

        static int access$500(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #86  <Field int lastStatusCode>
        //    2    4:ireturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #86  <Field int lastStatusCode>
        //    5    4:ireturn         
        }

        static int access$502(DispatcherThread dispatcherthread, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #86  <Field int lastStatusCode>
        //    3    5:iload_1         
        //    4    6:ireturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:iload_1         
        //    7    2:putfield        #86  <Field int lastStatusCode>
        //    8    5:iload_1         
        //    9    6:ireturn         
        }

        static long access$600(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #91  <Field long retryInterval>
        //    2    4:lreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #91  <Field long retryInterval>
        //    5    4:lreturn         
        }

        static long access$602(DispatcherThread dispatcherthread, long l)
        {
        //    0    0:aload_0         
        //    1    1:lload_1         
        //    2    2:putfield        #91  <Field long retryInterval>
        //    3    5:lload_1         
        //    4    6:lreturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:lload_1         
        //    7    2:putfield        #91  <Field long retryInterval>
        //    8    5:lload_1         
        //    9    6:lreturn         
        }

        static long access$630(DispatcherThread dispatcherthread, long l)
        {
        //    0    0:lload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #91  <Field long retryInterval>
        //    3    5:lmul            
        //    4    6:lstore_3        
        //    5    7:aload_0         
        //    6    8:lload_3         
        //    7    9:putfield        #91  <Field long retryInterval>
        //    8   12:lload_3         
        //    9   13:lreturn         
// Previous instruction length mismatch
        //   10    0:lload_1         
        //   11    1:aload_0         
        //   12    2:getfield        #91  <Field long retryInterval>
        //   13    5:lmul            
        //   14    6:lstore_3        
        //   15    7:aload_0         
        //   16    8:lload_3         
        //   17    9:putfield        #91  <Field long retryInterval>
        //   18   12:lload_3         
        //   19   13:lreturn         
        }

        static NetworkDispatcher access$700(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #55  <Field NetworkDispatcher parent>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #55  <Field NetworkDispatcher parent>
        //    5    4:areturn         
        }

        static PipelinedRequester access$800(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field PipelinedRequester pipelinedRequester>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #40  <Field PipelinedRequester pipelinedRequester>
        //    5    4:areturn         
        }

        static Dispatcher.Callbacks access$900(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #36  <Field Dispatcher$Callbacks callbacks>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #36  <Field Dispatcher$Callbacks callbacks>
        //    5    4:areturn         
        }

        public void dispatchHits(Hit ahit[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #104 <Field Handler handlerExecuteOnDispatcherThread>
        //    2    4:ifnonnull       8
        //    3    7:return          
        //    4    8:aload_0         
        //    5    9:getfield        #104 <Field Handler handlerExecuteOnDispatcherThread>
        //    6   12:new             #106 <Class NetworkDispatcher$DispatcherThread$AsyncDispatchTask>
        //    7   15:dup             
        //    8   16:aload_0         
        //    9   17:aload_1         
        //   10   18:invokespecial   #109 <Method void NetworkDispatcher$DispatcherThread$AsyncDispatchTask(NetworkDispatcher$DispatcherThread, Hit[])>
        //   11   21:invokevirtual   #115 <Method boolean Handler.post(Runnable)>
        //   12   24:pop             
        //   13   25:return          
        }

        protected void onLooperPrepared()
        {
        //    0    0:aload_0         
        //    1    1:new             #111 <Class Handler>
        //    2    4:dup             
        //    3    5:invokespecial   #119 <Method void Handler()>
        //    4    8:putfield        #104 <Field Handler handlerExecuteOnDispatcherThread>
        //    5   11:return          
        }

        private final Dispatcher.Callbacks callbacks;
        private AsyncDispatchTask currentTask;
        volatile Handler handlerExecuteOnDispatcherThread;
        private int lastStatusCode;
        private int maxEventsPerRequest;
        private final NetworkDispatcher parent;
        private final PipelinedRequester pipelinedRequester;
        private final RequesterCallbacks requesterCallBacks;
        private long retryInterval;
        private final String userAgent;

        static int access$1000(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #32  <Field int maxEventsPerRequest>
        //    2    4:ireturn         
        }

        static int access$1002(DispatcherThread dispatcherthread, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #32  <Field int maxEventsPerRequest>
        //    3    5:iload_1         
        //    4    6:ireturn         
        }

        static String access$1100(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #38  <Field String userAgent>
        //    2    4:areturn         
        }

        static RequesterCallbacks access$1200(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field NetworkDispatcher$DispatcherThread$RequesterCallbacks requesterCallBacks>
        //    2    4:areturn         
        }

        static AsyncDispatchTask access$400(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    2    4:areturn         
        }

        static AsyncDispatchTask access$402(DispatcherThread dispatcherthread, AsyncDispatchTask asyncdispatchtask)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #34  <Field NetworkDispatcher$DispatcherThread$AsyncDispatchTask currentTask>
        //    3    5:aload_1         
        //    4    6:areturn         
        }

        static int access$500(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #86  <Field int lastStatusCode>
        //    2    4:ireturn         
        }

        static int access$502(DispatcherThread dispatcherthread, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #86  <Field int lastStatusCode>
        //    3    5:iload_1         
        //    4    6:ireturn         
        }

        static long access$600(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #91  <Field long retryInterval>
        //    2    4:lreturn         
        }

        static long access$602(DispatcherThread dispatcherthread, long l)
        {
        //    0    0:aload_0         
        //    1    1:lload_1         
        //    2    2:putfield        #91  <Field long retryInterval>
        //    3    5:lload_1         
        //    4    6:lreturn         
        }

        static long access$630(DispatcherThread dispatcherthread, long l)
        {
        //    0    0:lload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #91  <Field long retryInterval>
        //    3    5:lmul            
        //    4    6:lstore_3        
        //    5    7:aload_0         
        //    6    8:lload_3         
        //    7    9:putfield        #91  <Field long retryInterval>
        //    8   12:lload_3         
        //    9   13:lreturn         
        }

        static NetworkDispatcher access$700(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #55  <Field NetworkDispatcher parent>
        //    2    4:areturn         
        }

        static PipelinedRequester access$800(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field PipelinedRequester pipelinedRequester>
        //    2    4:areturn         
        }

        static Dispatcher.Callbacks access$900(DispatcherThread dispatcherthread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #36  <Field Dispatcher$Callbacks callbacks>
        //    2    4:areturn         
        }
    }

    private class DispatcherThread.AsyncDispatchTask
        implements Runnable
    {

        public DispatcherThread.AsyncDispatchTask(Hit ahit[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:new             #20  <Class LinkedList>
        //    7   13:dup             
        //    8   14:invokespecial   #21  <Method void LinkedList()>
        //    9   17:putfield        #23  <Field LinkedList hits>
        //   10   20:aload_0         
        //   11   21:getfield        #23  <Field LinkedList hits>
        //   12   24:aload_2         
        //   13   25:invokestatic    #29  <Method boolean Collections.addAll(java.util.Collection, Object[])>
        //   14   28:pop             
        //   15   29:return          
        }

        private void dispatchSomePendingHits(boolean flag)
            throws IOException, ParseException, HttpException
        {
        //    0    0:invokestatic    #43  <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
        //    1    3:invokevirtual   #47  <Method boolean GoogleAnalyticsTracker.getDebug()>
        //    2    6:ifeq            21
        //    3    9:iload_1         
        //    4   10:ifeq            21
        //    5   13:ldc1            #49  <String "GoogleAnalyticsTracker">
        //    6   15:ldc1            #51  <String "dispatching hits in dry run mode">
        //    7   17:invokestatic    #57  <Method int Log.v(String, String)>
        //    8   20:pop             
        //    9   21:iconst_0        
        //   10   22:istore_2        
        //   11   23:iload_2         
        //   12   24:aload_0         
        //   13   25:getfield        #23  <Field LinkedList hits>
        //   14   28:invokevirtual   #61  <Method int LinkedList.size()>
        //   15   31:icmpge          520
        //   16   34:iload_2         
        //   17   35:aload_0         
        //   18   36:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   19   39:invokestatic    #67  <Method int NetworkDispatcher$DispatcherThread.access$1000(NetworkDispatcher$DispatcherThread)>
        //   20   42:icmpge          520
        //   21   45:aload_0         
        //   22   46:getfield        #23  <Field LinkedList hits>
        //   23   49:iload_2         
        //   24   50:invokevirtual   #71  <Method Object LinkedList.get(int)>
        //   25   53:checkcast       #73  <Class Hit>
        //   26   56:getfield        #77  <Field String Hit.hitString>
        //   27   59:invokestatic    #83  <Method long System.currentTimeMillis()>
        //   28   62:invokestatic    #89  <Method String Utils.addQueueTimeParameter(String, long)>
        //   29   65:astore_3        
        //   30   66:aload_3         
        //   31   67:bipush          63
        //   32   69:invokevirtual   #95  <Method int String.indexOf(int)>
        //   33   72:istore          4
        //   34   74:iload           4
        //   35   76:ifge            274
        //   36   79:ldc1            #97  <String "">
        //   37   81:astore          7
        //   38   83:aload_3         
        //   39   84:astore          6
        //   40   86:aload           7
        //   41   88:invokevirtual   #100 <Method int String.length()>
        //   42   91:sipush          2036
        //   43   94:icmpge          339
        //   44   97:new             #102 <Class BasicHttpEntityEnclosingRequest>
        //   45  100:dup             
        //   46  101:ldc1            #104 <String "GET">
        //   47  103:aload_3         
        //   48  104:invokespecial   #107 <Method void BasicHttpEntityEnclosingRequest(String, String)>
        //   49  107:astore          8
        //   50  109:aload_0         
        //   51  110:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   52  113:invokestatic    #111 <Method NetworkDispatcher NetworkDispatcher$DispatcherThread.access$700(NetworkDispatcher$DispatcherThread)>
        //   53  116:invokestatic    #117 <Method HttpHost NetworkDispatcher.access$200(NetworkDispatcher)>
        //   54  119:invokevirtual   #123 <Method String HttpHost.getHostName()>
        //   55  122:astore          9
        //   56  124:aload_0         
        //   57  125:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   58  128:invokestatic    #111 <Method NetworkDispatcher NetworkDispatcher$DispatcherThread.access$700(NetworkDispatcher$DispatcherThread)>
        //   59  131:invokestatic    #117 <Method HttpHost NetworkDispatcher.access$200(NetworkDispatcher)>
        //   60  134:invokevirtual   #126 <Method int HttpHost.getPort()>
        //   61  137:bipush          80
        //   62  139:icmpeq          180
        //   63  142:new             #128 <Class StringBuilder>
        //   64  145:dup             
        //   65  146:invokespecial   #129 <Method void StringBuilder()>
        //   66  149:aload           9
        //   67  151:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
        //   68  154:ldc1            #135 <String ":">
        //   69  156:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
        //   70  159:aload_0         
        //   71  160:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   72  163:invokestatic    #111 <Method NetworkDispatcher NetworkDispatcher$DispatcherThread.access$700(NetworkDispatcher$DispatcherThread)>
        //   73  166:invokestatic    #117 <Method HttpHost NetworkDispatcher.access$200(NetworkDispatcher)>
        //   74  169:invokevirtual   #126 <Method int HttpHost.getPort()>
        //   75  172:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
        //   76  175:invokevirtual   #141 <Method String StringBuilder.toString()>
        //   77  178:astore          9
        //   78  180:aload           8
        //   79  182:ldc1            #143 <String "Host">
        //   80  184:aload           9
        //   81  186:invokeinterface #148 <Method void HttpEntityEnclosingRequest.addHeader(String, String)>
        //   82  191:aload           8
        //   83  193:ldc1            #150 <String "User-Agent">
        //   84  195:aload_0         
        //   85  196:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   86  199:invokestatic    #154 <Method String NetworkDispatcher$DispatcherThread.access$1100(NetworkDispatcher$DispatcherThread)>
        //   87  202:invokeinterface #148 <Method void HttpEntityEnclosingRequest.addHeader(String, String)>
        //   88  207:invokestatic    #43  <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
        //   89  210:invokevirtual   #47  <Method boolean GoogleAnalyticsTracker.getDebug()>
        //   90  213:ifeq            453
        //   91  216:new             #156 <Class StringBuffer>
        //   92  219:dup             
        //   93  220:invokespecial   #157 <Method void StringBuffer()>
        //   94  223:astore          10
        //   95  225:aload           8
        //   96  227:invokeinterface #161 <Method org.apache.http.Header[] HttpEntityEnclosingRequest.getAllHeaders()>
        //   97  232:astore          11
        //   98  234:aload           11
        //   99  236:arraylength     
        //  100  237:istore          12
        //  101  239:iconst_0        
        //  102  240:istore          13
        //  103  242:iload           13
        //  104  244:iload           12
        //  105  246:icmpge          421
        //  106  249:aload           10
        //  107  251:aload           11
        //  108  253:iload           13
        //  109  255:aaload          
        //  110  256:invokevirtual   #162 <Method String Object.toString()>
        //  111  259:invokevirtual   #165 <Method StringBuffer StringBuffer.append(String)>
        //  112  262:ldc1            #167 <String "\n">
        //  113  264:invokevirtual   #165 <Method StringBuffer StringBuffer.append(String)>
        //  114  267:pop             
        //  115  268:iinc            13  1
        //  116  271:goto            242
        //  117  274:iload           4
        //  118  276:ifle            321
        //  119  279:aload_3         
        //  120  280:iconst_0        
        //  121  281:iload           4
        //  122  283:invokevirtual   #171 <Method String String.substring(int, int)>
        //  123  286:astore          5
        //  124  288:iload           4
        //  125  290:bipush          -2
        //  126  292:aload_3         
        //  127  293:invokevirtual   #100 <Method int String.length()>
        //  128  296:iadd            
        //  129  297:icmpge          328
        //  130  300:aload_3         
        //  131  301:iload           4
        //  132  303:iconst_1        
        //  133  304:iadd            
        //  134  305:invokevirtual   #174 <Method String String.substring(int)>
        //  135  308:astore          19
        //  136  310:aload           5
        //  137  312:astore          6
        //  138  314:aload           19
        //  139  316:astore          7
        //  140  318:goto            86
        //  141  321:ldc1            #97  <String "">
        //  142  323:astore          5
        //  143  325:goto            288
        //  144  328:aload           5
        //  145  330:astore          6
        //  146  332:ldc1            #97  <String "">
        //  147  334:astore          7
        //  148  336:goto            86
        //  149  339:new             #102 <Class BasicHttpEntityEnclosingRequest>
        //  150  342:dup             
        //  151  343:ldc1            #176 <String "POST">
        //  152  345:new             #128 <Class StringBuilder>
        //  153  348:dup             
        //  154  349:invokespecial   #129 <Method void StringBuilder()>
        //  155  352:ldc1            #178 <String "/p">
        //  156  354:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
        //  157  357:aload           6
        //  158  359:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
        //  159  362:invokevirtual   #141 <Method String StringBuilder.toString()>
        //  160  365:invokespecial   #107 <Method void BasicHttpEntityEnclosingRequest(String, String)>
        //  161  368:astore          18
        //  162  370:aload           18
        //  163  372:ldc1            #180 <String "Content-Length">
        //  164  374:aload           7
        //  165  376:invokevirtual   #100 <Method int String.length()>
        //  166  379:invokestatic    #184 <Method String Integer.toString(int)>
        //  167  382:invokeinterface #148 <Method void HttpEntityEnclosingRequest.addHeader(String, String)>
        //  168  387:aload           18
        //  169  389:ldc1            #186 <String "Content-Type">
        //  170  391:ldc1            #188 <String "text/plain">
        //  171  393:invokeinterface #148 <Method void HttpEntityEnclosingRequest.addHeader(String, String)>
        //  172  398:aload           18
        //  173  400:new             #190 <Class StringEntity>
        //  174  403:dup             
        //  175  404:aload           7
        //  176  406:invokespecial   #193 <Method void StringEntity(String)>
        //  177  409:invokeinterface #197 <Method void HttpEntityEnclosingRequest.setEntity(org.apache.http.HttpEntity)>
        //  178  414:aload           18
        //  179  416:astore          8
        //  180  418:goto            109
        //  181  421:aload           10
        //  182  423:aload           8
        //  183  425:invokeinterface #201 <Method org.apache.http.RequestLine HttpEntityEnclosingRequest.getRequestLine()>
        //  184  430:invokevirtual   #162 <Method String Object.toString()>
        //  185  433:invokevirtual   #165 <Method StringBuffer StringBuffer.append(String)>
        //  186  436:ldc1            #167 <String "\n">
        //  187  438:invokevirtual   #165 <Method StringBuffer StringBuffer.append(String)>
        //  188  441:pop             
        //  189  442:ldc1            #49  <String "GoogleAnalyticsTracker">
        //  190  444:aload           10
        //  191  446:invokevirtual   #202 <Method String StringBuffer.toString()>
        //  192  449:invokestatic    #205 <Method int Log.i(String, String)>
        //  193  452:pop             
        //  194  453:aload           7
        //  195  455:invokevirtual   #100 <Method int String.length()>
        //  196  458:sipush          8192
        //  197  461:icmple          488
        //  198  464:ldc1            #49  <String "GoogleAnalyticsTracker">
        //  199  466:ldc1            #207 <String "Hit too long (> 8192 bytes)--not sent">
        //  200  468:invokestatic    #210 <Method int Log.w(String, String)>
        //  201  471:pop             
        //  202  472:aload_0         
        //  203  473:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //  204  476:invokestatic    #214 <Method NetworkDispatcher$DispatcherThread$RequesterCallbacks NetworkDispatcher$DispatcherThread.access$1200(NetworkDispatcher$DispatcherThread)>
        //  205  479:invokevirtual   #219 <Method void NetworkDispatcher$DispatcherThread$RequesterCallbacks.requestSent()>
        //  206  482:iinc            2  1
        //  207  485:goto            23
        //  208  488:iload_1         
        //  209  489:ifeq            505
        //  210  492:aload_0         
        //  211  493:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //  212  496:invokestatic    #214 <Method NetworkDispatcher$DispatcherThread$RequesterCallbacks NetworkDispatcher$DispatcherThread.access$1200(NetworkDispatcher$DispatcherThread)>
        //  213  499:invokevirtual   #219 <Method void NetworkDispatcher$DispatcherThread$RequesterCallbacks.requestSent()>
        //  214  502:goto            482
        //  215  505:aload_0         
        //  216  506:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //  217  509:invokestatic    #223 <Method PipelinedRequester NetworkDispatcher$DispatcherThread.access$800(NetworkDispatcher$DispatcherThread)>
        //  218  512:aload           8
        //  219  514:invokevirtual   #229 <Method void PipelinedRequester.addRequest(HttpEntityEnclosingRequest)>
        //  220  517:goto            482
        //  221  520:iload_1         
        //  222  521:ifne            534
        //  223  524:aload_0         
        //  224  525:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //  225  528:invokestatic    #223 <Method PipelinedRequester NetworkDispatcher$DispatcherThread.access$800(NetworkDispatcher$DispatcherThread)>
        //  226  531:invokevirtual   #232 <Method void PipelinedRequester.sendRequests()>
        //  227  534:return          
        }

        public Hit removeNextHit()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field LinkedList hits>
        //    2    4:invokevirtual   #238 <Method Object LinkedList.poll()>
        //    3    7:checkcast       #73  <Class Hit>
        //    4   10:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //    2    4:aload_0         
        //    3    5:invokestatic    #245 <Method NetworkDispatcher$DispatcherThread$AsyncDispatchTask NetworkDispatcher$DispatcherThread.access$402(NetworkDispatcher$DispatcherThread, NetworkDispatcher$DispatcherThread$AsyncDispatchTask)>
        //    4    8:pop             
        //    5    9:iconst_0        
        //    6   10:istore_2        
        //    7   11:iload_2         
        //    8   12:iconst_5        
        //    9   13:icmpge          151
        //   10   16:aload_0         
        //   11   17:getfield        #23  <Field LinkedList hits>
        //   12   20:invokevirtual   #61  <Method int LinkedList.size()>
        //   13   23:ifle            151
        //   14   26:lconst_0        
        //   15   27:lstore          4
        // try 29 55 handler(s) 138 183 199
        //   16   29:aload_0         
        //   17   30:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   18   33:invokestatic    #248 <Method int NetworkDispatcher$DispatcherThread.access$500(NetworkDispatcher$DispatcherThread)>
        //   19   36:sipush          500
        //   20   39:icmpeq          55
        //   21   42:aload_0         
        //   22   43:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   23   46:invokestatic    #248 <Method int NetworkDispatcher$DispatcherThread.access$500(NetworkDispatcher$DispatcherThread)>
        //   24   49:sipush          503
        //   25   52:icmpne          124
        // try 55 95 handler(s) 138 183 199
        //   26   55:invokestatic    #254 <Method double Math.random()>
        //   27   58:aload_0         
        //   28   59:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   29   62:invokestatic    #258 <Method long NetworkDispatcher$DispatcherThread.access$600(NetworkDispatcher$DispatcherThread)>
        //   30   65:l2d             
        //   31   66:dmul            
        //   32   67:d2l             
        //   33   68:lstore          4
        //   34   70:aload_0         
        //   35   71:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   36   74:invokestatic    #258 <Method long NetworkDispatcher$DispatcherThread.access$600(NetworkDispatcher$DispatcherThread)>
        //   37   77:ldc2w           #259 <Long 256L>
        //   38   80:lcmp            
        //   39   81:ifge            95
        //   40   84:aload_0         
        //   41   85:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   42   88:ldc2w           #261 <Long 2L>
        //   43   91:invokestatic    #266 <Method long NetworkDispatcher$DispatcherThread.access$630(NetworkDispatcher$DispatcherThread, long)>
        //   44   94:pop2            
        // try 95 118 handler(s) 138 183 199
        //   45   95:lload           4
        //   46   97:ldc2w           #267 <Long 1000L>
        //   47  100:lmul            
        //   48  101:invokestatic    #274 <Method void Thread.sleep(long)>
        //   49  104:aload_0         
        //   50  105:aload_0         
        //   51  106:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   52  109:invokestatic    #111 <Method NetworkDispatcher NetworkDispatcher$DispatcherThread.access$700(NetworkDispatcher$DispatcherThread)>
        //   53  112:invokevirtual   #277 <Method boolean NetworkDispatcher.isDryRun()>
        //   54  115:invokespecial   #279 <Method void dispatchSomePendingHits(boolean)>
        //   55  118:iinc            2  1
        //   56  121:goto            11
        // try 124 135 handler(s) 138 183 199
        //   57  124:aload_0         
        //   58  125:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   59  128:ldc2w           #261 <Long 2L>
        //   60  131:invokestatic    #282 <Method long NetworkDispatcher$DispatcherThread.access$602(NetworkDispatcher$DispatcherThread, long)>
        //   61  134:pop2            
        //   62  135:goto            95
        // catch InterruptedException InterruptedException InterruptedException InterruptedException
        //   63  138:astore          10
        //   64  140:ldc1            #49  <String "GoogleAnalyticsTracker">
        //   65  142:ldc2            #284 <String "Couldn't sleep.">
        //   66  145:aload           10
        //   67  147:invokestatic    #287 <Method int Log.w(String, String, Throwable)>
        //   68  150:pop             
        //   69  151:aload_0         
        //   70  152:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   71  155:invokestatic    #223 <Method PipelinedRequester NetworkDispatcher$DispatcherThread.access$800(NetworkDispatcher$DispatcherThread)>
        //   72  158:invokevirtual   #290 <Method void PipelinedRequester.finishedCurrentRequests()>
        //   73  161:aload_0         
        //   74  162:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   75  165:invokestatic    #294 <Method Dispatcher$Callbacks NetworkDispatcher$DispatcherThread.access$900(NetworkDispatcher$DispatcherThread)>
        //   76  168:invokeinterface #299 <Method void Dispatcher$Callbacks.dispatchFinished()>
        //   77  173:aload_0         
        //   78  174:getfield        #15  <Field NetworkDispatcher$DispatcherThread this$0>
        //   79  177:aconst_null     
        //   80  178:invokestatic    #245 <Method NetworkDispatcher$DispatcherThread$AsyncDispatchTask NetworkDispatcher$DispatcherThread.access$402(NetworkDispatcher$DispatcherThread, NetworkDispatcher$DispatcherThread$AsyncDispatchTask)>
        //   81  181:pop             
        //   82  182:return          
        // catch IOException IOException IOException IOException
        //   83  183:astore          8
        //   84  185:ldc1            #49  <String "GoogleAnalyticsTracker">
        //   85  187:ldc2            #301 <String "Problem with socket or streams.">
        //   86  190:aload           8
        //   87  192:invokestatic    #287 <Method int Log.w(String, String, Throwable)>
        //   88  195:pop             
        //   89  196:goto            151
        // catch HttpException HttpException HttpException HttpException
        //   90  199:astore          6
        //   91  201:ldc1            #49  <String "GoogleAnalyticsTracker">
        //   92  203:ldc2            #303 <String "Problem with http streams.">
        //   93  206:aload           6
        //   94  208:invokestatic    #287 <Method int Log.w(String, String, Throwable)>
        //   95  211:pop             
        //   96  212:goto            151
        }

        private final LinkedList hits;
        final DispatcherThread this$0;
    }

    private class DispatcherThread.RequesterCallbacks
        implements PipelinedRequester.Callbacks
    {

        private DispatcherThread.RequesterCallbacks()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        DispatcherThread.RequesterCallbacks(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void NetworkDispatcher$DispatcherThread$RequesterCallbacks(NetworkDispatcher$DispatcherThread)>
        //    3    5:return          
        }

        public void pipelineModeChanged(boolean flag)
        {
        //    0    0:iload_1         
        //    1    1:ifeq            15
        //    2    4:aload_0         
        //    3    5:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //    4    8:bipush          30
        //    5   10:invokestatic    #26  <Method int NetworkDispatcher$DispatcherThread.access$1002(NetworkDispatcher$DispatcherThread, int)>
        //    6   13:pop             
        //    7   14:return          
        //    8   15:aload_0         
        //    9   16:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //   10   19:iconst_1        
        //   11   20:invokestatic    #26  <Method int NetworkDispatcher$DispatcherThread.access$1002(NetworkDispatcher$DispatcherThread, int)>
        //   12   23:pop             
        //   13   24:return          
        }

        public void requestSent()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //    2    4:invokestatic    #31  <Method NetworkDispatcher$DispatcherThread$AsyncDispatchTask NetworkDispatcher$DispatcherThread.access$400(NetworkDispatcher$DispatcherThread)>
        //    3    7:ifnonnull       11
        //    4   10:return          
        //    5   11:aload_0         
        //    6   12:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //    7   15:invokestatic    #31  <Method NetworkDispatcher$DispatcherThread$AsyncDispatchTask NetworkDispatcher$DispatcherThread.access$400(NetworkDispatcher$DispatcherThread)>
        //    8   18:invokevirtual   #37  <Method Hit NetworkDispatcher$DispatcherThread$AsyncDispatchTask.removeNextHit()>
        //    9   21:astore_1        
        //   10   22:aload_1         
        //   11   23:ifnull          10
        //   12   26:aload_0         
        //   13   27:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //   14   30:invokestatic    #41  <Method Dispatcher$Callbacks NetworkDispatcher$DispatcherThread.access$900(NetworkDispatcher$DispatcherThread)>
        //   15   33:aload_1         
        //   16   34:getfield        #47  <Field long Hit.hitId>
        //   17   37:invokeinterface #53  <Method void Dispatcher$Callbacks.hitDispatched(long)>
        //   18   42:return          
        }

        public void serverError(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field NetworkDispatcher$DispatcherThread this$0>
        //    2    4:iload_1         
        //    3    5:invokestatic    #58  <Method int NetworkDispatcher$DispatcherThread.access$502(NetworkDispatcher$DispatcherThread, int)>
        //    4    8:pop             
        //    5    9:return          
        }

        final DispatcherThread this$0;
    }


    public NetworkDispatcher()
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #39  <String "GoogleAnalytics">
    //    2    3:ldc1            #41  <String "1.4.2">
    //    3    5:invokespecial   #44  <Method void NetworkDispatcher(String, String)>
    //    4    8:return          
    }

    public NetworkDispatcher(String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:ldc1            #10  <String "www.google-analytics.com">
    //    4    5:bipush          80
    //    5    7:invokespecial   #47  <Method void NetworkDispatcher(String, String, String, int)>
    //    6   10:return          
    }

    NetworkDispatcher(String s, String s1, String s2, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #49  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #51  <Field boolean dryRun>
    //    5    9:aload_0         
    //    6   10:new             #53  <Class HttpHost>
    //    7   13:dup             
    //    8   14:aload_3         
    //    9   15:iload           4
    //   10   17:invokespecial   #56  <Method void HttpHost(String, int)>
    //   11   20:putfield        #58  <Field HttpHost googleAnalyticsHost>
    //   12   23:invokestatic    #64  <Method Locale Locale.getDefault()>
    //   13   26:astore          5
    //   14   28:bipush          7
    //   15   30:anewarray       Object[]
    //   16   33:astore          6
    //   17   35:aload           6
    //   18   37:iconst_0        
    //   19   38:aload_1         
    //   20   39:aastore         
    //   21   40:aload           6
    //   22   42:iconst_1        
    //   23   43:aload_2         
    //   24   44:aastore         
    //   25   45:aload           6
    //   26   47:iconst_2        
    //   27   48:getstatic       #69  <Field String android.os.Build$VERSION.RELEASE>
    //   28   51:aastore         
    //   29   52:aload           5
    //   30   54:invokevirtual   #73  <Method String Locale.getLanguage()>
    //   31   57:ifnull          127
    //   32   60:aload           5
    //   33   62:invokevirtual   #73  <Method String Locale.getLanguage()>
    //   34   65:invokevirtual   #78  <Method String String.toLowerCase()>
    //   35   68:astore          7
    //   36   70:aload           6
    //   37   72:iconst_3        
    //   38   73:aload           7
    //   39   75:aastore         
    //   40   76:aload           5
    //   41   78:invokevirtual   #81  <Method String Locale.getCountry()>
    //   42   81:ifnull          134
    //   43   84:aload           5
    //   44   86:invokevirtual   #81  <Method String Locale.getCountry()>
    //   45   89:invokevirtual   #78  <Method String String.toLowerCase()>
    //   46   92:astore          8
    //   47   94:aload           6
    //   48   96:iconst_4        
    //   49   97:aload           8
    //   50   99:aastore         
    //   51  100:aload           6
    //   52  102:iconst_5        
    //   53  103:getstatic       #86  <Field String Build.MODEL>
    //   54  106:aastore         
    //   55  107:aload           6
    //   56  109:bipush          6
    //   57  111:getstatic       #89  <Field String Build.ID>
    //   58  114:aastore         
    //   59  115:aload_0         
    //   60  116:ldc1            #28  <String "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)">
    //   61  118:aload           6
    //   62  120:invokestatic    #93  <Method String String.format(String, Object[])>
    //   63  123:putfield        #95  <Field String userAgent>
    //   64  126:return          
    //   65  127:ldc1            #97  <String "en">
    //   66  129:astore          7
    //   67  131:goto            70
    //   68  134:ldc1            #99  <String "">
    //   69  136:astore          8
    //   70  138:goto            94
    }

    static HttpHost access$200(NetworkDispatcher networkdispatcher)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field HttpHost googleAnalyticsHost>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #58  <Field HttpHost googleAnalyticsHost>
    //    5    4:areturn         
    }

    public void dispatchHits(Hit ahit[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    6   12:aload_1         
    //    7   13:invokevirtual   #109 <Method void NetworkDispatcher$DispatcherThread.dispatchHits(Hit[])>
    //    8   16:return          
    }

    String getUserAgent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #95  <Field String userAgent>
    //    2    4:areturn         
    }

    public void init(Dispatcher.Callbacks callbacks)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #115 <Method void stop()>
    //    2    4:aload_0         
    //    3    5:new             #107 <Class NetworkDispatcher$DispatcherThread>
    //    4    8:dup             
    //    5    9:aload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #95  <Field String userAgent>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:invokespecial   #118 <Method void NetworkDispatcher$DispatcherThread(Dispatcher$Callbacks, String, NetworkDispatcher, NetworkDispatcher$1)>
    //   11   19:putfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //   12   22:aload_0         
    //   13   23:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //   14   26:invokevirtual   #121 <Method void NetworkDispatcher$DispatcherThread.start()>
    //   15   29:return          
    }

    public void init(Dispatcher.Callbacks callbacks, PipelinedRequester pipelinedrequester, HitStore hitstore)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #115 <Method void stop()>
    //    2    4:aload_0         
    //    3    5:new             #107 <Class NetworkDispatcher$DispatcherThread>
    //    4    8:dup             
    //    5    9:aload_1         
    //    6   10:aload_2         
    //    7   11:aload_0         
    //    8   12:getfield        #95  <Field String userAgent>
    //    9   15:aload_0         
    //   10   16:aconst_null     
    //   11   17:invokespecial   #125 <Method void NetworkDispatcher$DispatcherThread(Dispatcher$Callbacks, PipelinedRequester, String, NetworkDispatcher, NetworkDispatcher$1)>
    //   12   20:putfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //   13   23:aload_0         
    //   14   24:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //   15   27:invokevirtual   #121 <Method void NetworkDispatcher$DispatcherThread.start()>
    //   16   30:return          
    }

    public boolean isDryRun()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field boolean dryRun>
    //    2    4:ireturn         
    }

    public void setDryRun(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #51  <Field boolean dryRun>
    //    3    5:return          
    }

    public void stop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    2    4:ifnull          32
    //    3    7:aload_0         
    //    4    8:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    5   11:invokevirtual   #133 <Method Looper NetworkDispatcher$DispatcherThread.getLooper()>
    //    6   14:ifnull          32
    //    7   17:aload_0         
    //    8   18:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    9   21:invokevirtual   #133 <Method Looper NetworkDispatcher$DispatcherThread.getLooper()>
    //   10   24:invokevirtual   #138 <Method void Looper.quit()>
    //   11   27:aload_0         
    //   12   28:aconst_null     
    //   13   29:putfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //   14   32:return          
    }

    void waitForThreadLooper()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    2    4:invokevirtual   #133 <Method Looper NetworkDispatcher$DispatcherThread.getLooper()>
    //    3    7:pop             
    //    4    8:aload_0         
    //    5    9:getfield        #105 <Field NetworkDispatcher$DispatcherThread dispatcherThread>
    //    6   12:getfield        #143 <Field Handler NetworkDispatcher$DispatcherThread.handlerExecuteOnDispatcherThread>
    //    7   15:ifnonnull       24
    //    8   18:invokestatic    #148 <Method void Thread.yield()>
    //    9   21:goto            8
    //   10   24:return          
    }

    private static final String GOOGLE_ANALYTICS_HOST_NAME = "www.google-analytics.com";
    private static final int GOOGLE_ANALYTICS_HOST_PORT = 80;
    private static final int MAX_EVENTS_PER_PIPELINE = 30;
    private static final int MAX_GET_LENGTH = 2036;
    private static final int MAX_POST_LENGTH = 8192;
    private static final int MAX_SEQUENTIAL_REQUESTS = 5;
    private static final long MIN_RETRY_INTERVAL = 2L;
    private static final String USER_AGENT_TEMPLATE = "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)";
    private DispatcherThread dispatcherThread;
    private boolean dryRun;
    private final HttpHost googleAnalyticsHost;
    private final String userAgent;

    static HttpHost access$200(NetworkDispatcher networkdispatcher)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field HttpHost googleAnalyticsHost>
    //    2    4:areturn         
    }

    // Unreferenced inner class com/google/android/apps/analytics/NetworkDispatcher$1

/* anonymous class */
    static class _cls1
    {
    }

}
