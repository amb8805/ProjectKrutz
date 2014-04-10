// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.*;
import android.os.*;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public class LocalBroadcastManager
{
    private static class BroadcastRecord
    {

        BroadcastRecord(Intent intent1, ArrayList arraylist)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #16  <Field Intent intent>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #18  <Field ArrayList receivers>
        //    8   14:return          
        }

        final Intent intent;
        final ArrayList receivers;
    }

    private static class ReceiverRecord
    {

        ReceiverRecord(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #17  <Field IntentFilter filter>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field BroadcastReceiver receiver>
        //    8   14:return          
        }

        public String toString()
        {
        //    0    0:new             #23  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:sipush          128
        //    3    7:invokespecial   #26  <Method void StringBuilder(int)>
        //    4   10:astore_1        
        //    5   11:aload_1         
        //    6   12:ldc1            #28  <String "Receiver{">
        //    7   14:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
        //    8   17:pop             
        //    9   18:aload_1         
        //   10   19:aload_0         
        //   11   20:getfield        #19  <Field BroadcastReceiver receiver>
        //   12   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(Object)>
        //   13   26:pop             
        //   14   27:aload_1         
        //   15   28:ldc1            #37  <String " filter=">
        //   16   30:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
        //   17   33:pop             
        //   18   34:aload_1         
        //   19   35:aload_0         
        //   20   36:getfield        #17  <Field IntentFilter filter>
        //   21   39:invokevirtual   #35  <Method StringBuilder StringBuilder.append(Object)>
        //   22   42:pop             
        //   23   43:aload_1         
        //   24   44:ldc1            #39  <String "}">
        //   25   46:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
        //   26   49:pop             
        //   27   50:aload_1         
        //   28   51:invokevirtual   #41  <Method String StringBuilder.toString()>
        //   29   54:areturn         
        }

        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;
    }


    static 
    {
    //    0    0:new             #4   <Class Object>
    //    1    3:dup             
    //    2    4:invokespecial   #35  <Method void Object()>
    //    3    7:putstatic       #37  <Field Object mLock>
    //    4   10:return          
    }

    private LocalBroadcastManager(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #40  <Class HashMap>
    //    4    8:dup             
    //    5    9:invokespecial   #41  <Method void HashMap()>
    //    6   12:putfield        #43  <Field HashMap mReceivers>
    //    7   15:aload_0         
    //    8   16:new             #40  <Class HashMap>
    //    9   19:dup             
    //   10   20:invokespecial   #41  <Method void HashMap()>
    //   11   23:putfield        #45  <Field HashMap mActions>
    //   12   26:aload_0         
    //   13   27:new             #47  <Class ArrayList>
    //   14   30:dup             
    //   15   31:invokespecial   #48  <Method void ArrayList()>
    //   16   34:putfield        #50  <Field ArrayList mPendingBroadcasts>
    //   17   37:aload_0         
    //   18   38:aload_1         
    //   19   39:putfield        #52  <Field Context mAppContext>
    //   20   42:aload_0         
    //   21   43:new             #54  <Class LocalBroadcastManager$1>
    //   22   46:dup             
    //   23   47:aload_0         
    //   24   48:aload_1         
    //   25   49:invokevirtual   #60  <Method Looper Context.getMainLooper()>
    //   26   52:invokespecial   #63  <Method void LocalBroadcastManager$1(LocalBroadcastManager, Looper)>
    //   27   55:putfield        #65  <Field Handler mHandler>
    //   28   58:return          
    }

    static void access$000(LocalBroadcastManager localbroadcastmanager)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #70  <Method void executePendingBroadcasts()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #70  <Method void executePendingBroadcasts()>
    //    5    4:return          
    }

    private void executePendingBroadcasts()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field HashMap mReceivers>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 15 handler(s) 115
    //    5    7:aload_0         
    //    6    8:getfield        #50  <Field ArrayList mPendingBroadcasts>
    //    7   11:invokevirtual   #74  <Method int ArrayList.size()>
    //    8   14:istore_3        
    //    9   15:iload_3         
    //   10   16:ifgt            22
    // try 19 21 handler(s) 115
    //   11   19:aload_1         
    //   12   20:monitorexit     
    //   13   21:return          
    // try 22 47 handler(s) 115
    //   14   22:iload_3         
    //   15   23:anewarray       BroadcastRecord[]
    //   16   26:astore          4
    //   17   28:aload_0         
    //   18   29:getfield        #50  <Field ArrayList mPendingBroadcasts>
    //   19   32:aload           4
    //   20   34:invokevirtual   #80  <Method Object[] ArrayList.toArray(Object[])>
    //   21   37:pop             
    //   22   38:aload_0         
    //   23   39:getfield        #50  <Field ArrayList mPendingBroadcasts>
    //   24   42:invokevirtual   #83  <Method void ArrayList.clear()>
    //   25   45:aload_1         
    //   26   46:monitorexit     
    //   27   47:iconst_0        
    //   28   48:istore          6
    //   29   50:iload           6
    //   30   52:aload           4
    //   31   54:arraylength     
    //   32   55:icmpge          0
    //   33   58:aload           4
    //   34   60:iload           6
    //   35   62:aaload          
    //   36   63:astore          7
    //   37   65:iconst_0        
    //   38   66:istore          8
    //   39   68:iload           8
    //   40   70:aload           7
    //   41   72:getfield        #86  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
    //   42   75:invokevirtual   #74  <Method int ArrayList.size()>
    //   43   78:icmpge          120
    //   44   81:aload           7
    //   45   83:getfield        #86  <Field ArrayList LocalBroadcastManager$BroadcastRecord.receivers>
    //   46   86:iload           8
    //   47   88:invokevirtual   #90  <Method Object ArrayList.get(int)>
    //   48   91:checkcast       #92  <Class LocalBroadcastManager$ReceiverRecord>
    //   49   94:getfield        #96  <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
    //   50   97:aload_0         
    //   51   98:getfield        #52  <Field Context mAppContext>
    //   52  101:aload           7
    //   53  103:getfield        #100 <Field Intent LocalBroadcastManager$BroadcastRecord.intent>
    //   54  106:invokevirtual   #106 <Method void BroadcastReceiver.onReceive(Context, Intent)>
    //   55  109:iinc            8  1
    //   56  112:goto            68
    // finally
    //   57  115:astore_2        
    // try 116 118 handler(s) 115
    //   58  116:aload_1         
    //   59  117:monitorexit     
    //   60  118:aload_2         
    //   61  119:athrow          
    //   62  120:iinc            6  1
    //   63  123:goto            50
    }

    public static LocalBroadcastManager getInstance(Context context)
    {
    //    0    0:getstatic       #37  <Field Object mLock>
    //    1    3:astore_1        
    //    2    4:aload_1         
    //    3    5:monitorenter    
    // try 6 26 handler(s) 34
    //    4    6:getstatic       #110 <Field LocalBroadcastManager mInstance>
    //    5    9:ifnonnull       26
    //    6   12:new             #2   <Class LocalBroadcastManager>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:invokevirtual   #114 <Method Context Context.getApplicationContext()>
    //   10   20:invokespecial   #116 <Method void LocalBroadcastManager(Context)>
    //   11   23:putstatic       #110 <Field LocalBroadcastManager mInstance>
    // try 26 32 handler(s) 34
    //   12   26:getstatic       #110 <Field LocalBroadcastManager mInstance>
    //   13   29:astore_3        
    //   14   30:aload_1         
    //   15   31:monitorexit     
    //   16   32:aload_3         
    //   17   33:areturn         
    // finally
    //   18   34:astore_2        
    // try 35 37 handler(s) 34
    //   19   35:aload_1         
    //   20   36:monitorexit     
    //   21   37:aload_2         
    //   22   38:athrow          
    }

    public void registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field HashMap mReceivers>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:monitorenter    
    // try 7 31 handler(s) 142
    //    5    7:new             #92  <Class LocalBroadcastManager$ReceiverRecord>
    //    6   10:dup             
    //    7   11:aload_2         
    //    8   12:aload_1         
    //    9   13:invokespecial   #121 <Method void LocalBroadcastManager$ReceiverRecord(IntentFilter, BroadcastReceiver)>
    //   10   16:astore          4
    //   11   18:aload_0         
    //   12   19:getfield        #43  <Field HashMap mReceivers>
    //   13   22:aload_1         
    //   14   23:invokevirtual   #124 <Method Object HashMap.get(Object)>
    //   15   26:checkcast       #47  <Class ArrayList>
    //   16   29:astore          6
    //   17   31:aload           6
    //   18   33:ifnonnull       57
    // try 36 57 handler(s) 142
    //   19   36:new             #47  <Class ArrayList>
    //   20   39:dup             
    //   21   40:iconst_1        
    //   22   41:invokespecial   #127 <Method void ArrayList(int)>
    //   23   44:astore          6
    //   24   46:aload_0         
    //   25   47:getfield        #43  <Field HashMap mReceivers>
    //   26   50:aload_1         
    //   27   51:aload           6
    //   28   53:invokevirtual   #131 <Method Object HashMap.put(Object, Object)>
    //   29   56:pop             
    // try 57 64 handler(s) 142
    //   30   57:aload           6
    //   31   59:aload_2         
    //   32   60:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
    //   33   63:pop             
    //   34   64:iconst_0        
    //   35   65:istore          9
    // try 67 98 handler(s) 142
    //   36   67:iload           9
    //   37   69:aload_2         
    //   38   70:invokevirtual   #140 <Method int IntentFilter.countActions()>
    //   39   73:icmpge          139
    //   40   76:aload_2         
    //   41   77:iload           9
    //   42   79:invokevirtual   #144 <Method String IntentFilter.getAction(int)>
    //   43   82:astore          10
    //   44   84:aload_0         
    //   45   85:getfield        #45  <Field HashMap mActions>
    //   46   88:aload           10
    //   47   90:invokevirtual   #124 <Method Object HashMap.get(Object)>
    //   48   93:checkcast       #47  <Class ArrayList>
    //   49   96:astore          11
    //   50   98:aload           11
    //   51  100:ifnonnull       125
    // try 103 125 handler(s) 142
    //   52  103:new             #47  <Class ArrayList>
    //   53  106:dup             
    //   54  107:iconst_1        
    //   55  108:invokespecial   #127 <Method void ArrayList(int)>
    //   56  111:astore          11
    //   57  113:aload_0         
    //   58  114:getfield        #45  <Field HashMap mActions>
    //   59  117:aload           10
    //   60  119:aload           11
    //   61  121:invokevirtual   #131 <Method Object HashMap.put(Object, Object)>
    //   62  124:pop             
    // try 125 133 handler(s) 142
    //   63  125:aload           11
    //   64  127:aload           4
    //   65  129:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
    //   66  132:pop             
    //   67  133:iinc            9  1
    //   68  136:goto            67
    // try 139 141 handler(s) 142
    //   69  139:aload_3         
    //   70  140:monitorexit     
    //   71  141:return          
    // finally
    //   72  142:astore          5
    // try 144 146 handler(s) 142
    //   73  144:aload_3         
    //   74  145:monitorexit     
    //   75  146:aload           5
    //   76  148:athrow          
    }

    public boolean sendBroadcast(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field HashMap mReceivers>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 54 handler(s) 334
    //    5    7:aload_1         
    //    6    8:invokevirtual   #151 <Method String Intent.getAction()>
    //    7   11:astore          4
    //    8   13:aload_1         
    //    9   14:aload_0         
    //   10   15:getfield        #52  <Field Context mAppContext>
    //   11   18:invokevirtual   #155 <Method android.content.ContentResolver Context.getContentResolver()>
    //   12   21:invokevirtual   #159 <Method String Intent.resolveTypeIfNeeded(android.content.ContentResolver)>
    //   13   24:astore          5
    //   14   26:aload_1         
    //   15   27:invokevirtual   #163 <Method android.net.Uri Intent.getData()>
    //   16   30:astore          6
    //   17   32:aload_1         
    //   18   33:invokevirtual   #166 <Method String Intent.getScheme()>
    //   19   36:astore          7
    //   20   38:aload_1         
    //   21   39:invokevirtual   #170 <Method java.util.Set Intent.getCategories()>
    //   22   42:astore          8
    //   23   44:bipush          8
    //   24   46:aload_1         
    //   25   47:invokevirtual   #173 <Method int Intent.getFlags()>
    //   26   50:iand            
    //   27   51:ifeq            500
    //   28   54:iconst_1        
    //   29   55:istore          9
    //   30   57:iload           9
    //   31   59:ifeq            107
    // try 62 107 handler(s) 334
    //   32   62:ldc1            #14  <String "LocalBroadcastManager">
    //   33   64:new             #175 <Class StringBuilder>
    //   34   67:dup             
    //   35   68:invokespecial   #176 <Method void StringBuilder()>
    //   36   71:ldc1            #178 <String "Resolving type ">
    //   37   73:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   38   76:aload           5
    //   39   78:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   40   81:ldc1            #184 <String " scheme ">
    //   41   83:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   42   86:aload           7
    //   43   88:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   44   91:ldc1            #186 <String " of intent ">
    //   45   93:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   46   96:aload_1         
    //   47   97:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
    //   48  100:invokevirtual   #192 <Method String StringBuilder.toString()>
    //   49  103:invokestatic    #198 <Method int Log.v(String, String)>
    //   50  106:pop             
    // try 107 123 handler(s) 334
    //   51  107:aload_0         
    //   52  108:getfield        #45  <Field HashMap mActions>
    //   53  111:aload_1         
    //   54  112:invokevirtual   #151 <Method String Intent.getAction()>
    //   55  115:invokevirtual   #124 <Method Object HashMap.get(Object)>
    //   56  118:checkcast       #47  <Class ArrayList>
    //   57  121:astore          11
    //   58  123:aload           11
    //   59  125:ifnull          481
    //   60  128:iload           9
    //   61  130:ifeq            485
    // try 133 159 handler(s) 334
    //   62  133:ldc1            #14  <String "LocalBroadcastManager">
    //   63  135:new             #175 <Class StringBuilder>
    //   64  138:dup             
    //   65  139:invokespecial   #176 <Method void StringBuilder()>
    //   66  142:ldc1            #200 <String "Action list: ">
    //   67  144:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   68  147:aload           11
    //   69  149:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
    //   70  152:invokevirtual   #192 <Method String StringBuilder.toString()>
    //   71  155:invokestatic    #198 <Method int Log.v(String, String)>
    //   72  158:pop             
    //   73  159:goto            485
    // try 162 184 handler(s) 334
    //   74  162:iload           13
    //   75  164:aload           11
    //   76  166:invokevirtual   #74  <Method int ArrayList.size()>
    //   77  169:icmpge          534
    //   78  172:aload           11
    //   79  174:iload           13
    //   80  176:invokevirtual   #90  <Method Object ArrayList.get(int)>
    //   81  179:checkcast       #92  <Class LocalBroadcastManager$ReceiverRecord>
    //   82  182:astore          18
    //   83  184:iload           9
    //   84  186:ifeq            218
    // try 189 218 handler(s) 334
    //   85  189:ldc1            #14  <String "LocalBroadcastManager">
    //   86  191:new             #175 <Class StringBuilder>
    //   87  194:dup             
    //   88  195:invokespecial   #176 <Method void StringBuilder()>
    //   89  198:ldc1            #202 <String "Matching against filter ">
    //   90  200:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //   91  203:aload           18
    //   92  205:getfield        #206 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
    //   93  208:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
    //   94  211:invokevirtual   #192 <Method String StringBuilder.toString()>
    //   95  214:invokestatic    #198 <Method int Log.v(String, String)>
    //   96  217:pop             
    // try 218 226 handler(s) 334
    //   97  218:aload           18
    //   98  220:getfield        #209 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
    //   99  223:ifeq            242
    //  100  226:iload           9
    //  101  228:ifeq            494
    // try 231 239 handler(s) 334
    //  102  231:ldc1            #14  <String "LocalBroadcastManager">
    //  103  233:ldc1            #211 <String "  Filter's target already added">
    //  104  235:invokestatic    #198 <Method int Log.v(String, String)>
    //  105  238:pop             
    //  106  239:goto            494
    // try 242 264 handler(s) 334
    //  107  242:aload           18
    //  108  244:getfield        #206 <Field IntentFilter LocalBroadcastManager$ReceiverRecord.filter>
    //  109  247:aload           4
    //  110  249:aload           5
    //  111  251:aload           7
    //  112  253:aload           6
    //  113  255:aload           8
    //  114  257:ldc1            #14  <String "LocalBroadcastManager">
    //  115  259:invokevirtual   #215 <Method int IntentFilter.match(String, String, String, android.net.Uri, java.util.Set, String)>
    //  116  262:istore          21
    //  117  264:iload           21
    //  118  266:iflt            339
    //  119  269:iload           9
    //  120  271:ifeq            303
    // try 274 303 handler(s) 334
    //  121  274:ldc1            #14  <String "LocalBroadcastManager">
    //  122  276:new             #175 <Class StringBuilder>
    //  123  279:dup             
    //  124  280:invokespecial   #176 <Method void StringBuilder()>
    //  125  283:ldc1            #217 <String "  Filter matched!  match=0x">
    //  126  285:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //  127  288:iload           21
    //  128  290:invokestatic    #222 <Method String Integer.toHexString(int)>
    //  129  293:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //  130  296:invokevirtual   #192 <Method String StringBuilder.toString()>
    //  131  299:invokestatic    #198 <Method int Log.v(String, String)>
    //  132  302:pop             
    //  133  303:aload           14
    //  134  305:ifnonnull       317
    // try 308 317 handler(s) 334
    //  135  308:new             #47  <Class ArrayList>
    //  136  311:dup             
    //  137  312:invokespecial   #48  <Method void ArrayList()>
    //  138  315:astore          14
    // try 317 331 handler(s) 334
    //  139  317:aload           14
    //  140  319:aload           18
    //  141  321:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
    //  142  324:pop             
    //  143  325:aload           18
    //  144  327:iconst_1        
    //  145  328:putfield        #209 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
    //  146  331:goto            494
    // finally
    //  147  334:astore_3        
    // try 335 337 handler(s) 334
    //  148  335:aload_2         
    //  149  336:monitorexit     
    //  150  337:aload_3         
    //  151  338:athrow          
    //  152  339:iload           9
    //  153  341:ifeq            494
    //  154  344:iload           21
    //  155  346:tableswitch     -4 -1: default 376
    //                   -4 513
    //                   -3 506
    //                   -2 520
    //                   -1 527
    //  156  376:ldc1            #224 <String "unknown reason">
    //  157  378:astore          22
    // try 380 406 handler(s) 334
    //  158  380:ldc1            #14  <String "LocalBroadcastManager">
    //  159  382:new             #175 <Class StringBuilder>
    //  160  385:dup             
    //  161  386:invokespecial   #176 <Method void StringBuilder()>
    //  162  389:ldc1            #226 <String "  Filter did not match: ">
    //  163  391:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //  164  394:aload           22
    //  165  396:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
    //  166  399:invokevirtual   #192 <Method String StringBuilder.toString()>
    //  167  402:invokestatic    #198 <Method int Log.v(String, String)>
    //  168  405:pop             
    //  169  406:goto            494
    // try 409 433 handler(s) 334
    //  170  409:iload           15
    //  171  411:aload           14
    //  172  413:invokevirtual   #74  <Method int ArrayList.size()>
    //  173  416:icmpge          439
    //  174  419:aload           14
    //  175  421:iload           15
    //  176  423:invokevirtual   #90  <Method Object ArrayList.get(int)>
    //  177  426:checkcast       #92  <Class LocalBroadcastManager$ReceiverRecord>
    //  178  429:iconst_0        
    //  179  430:putfield        #209 <Field boolean LocalBroadcastManager$ReceiverRecord.broadcasting>
    //  180  433:iinc            15  1
    //  181  436:goto            409
    // try 439 477 handler(s) 334
    //  182  439:aload_0         
    //  183  440:getfield        #50  <Field ArrayList mPendingBroadcasts>
    //  184  443:new             #76  <Class LocalBroadcastManager$BroadcastRecord>
    //  185  446:dup             
    //  186  447:aload_1         
    //  187  448:aload           14
    //  188  450:invokespecial   #229 <Method void LocalBroadcastManager$BroadcastRecord(Intent, ArrayList)>
    //  189  453:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
    //  190  456:pop             
    //  191  457:aload_0         
    //  192  458:getfield        #65  <Field Handler mHandler>
    //  193  461:iconst_1        
    //  194  462:invokevirtual   #235 <Method boolean Handler.hasMessages(int)>
    //  195  465:ifne            477
    //  196  468:aload_0         
    //  197  469:getfield        #65  <Field Handler mHandler>
    //  198  472:iconst_1        
    //  199  473:invokevirtual   #238 <Method boolean Handler.sendEmptyMessage(int)>
    //  200  476:pop             
    // try 477 479 handler(s) 334
    //  201  477:aload_2         
    //  202  478:monitorexit     
    //  203  479:iconst_1        
    //  204  480:ireturn         
    // try 481 483 handler(s) 334
    //  205  481:aload_2         
    //  206  482:monitorexit     
    //  207  483:iconst_0        
    //  208  484:ireturn         
    //  209  485:iconst_0        
    //  210  486:istore          13
    //  211  488:aconst_null     
    //  212  489:astore          14
    //  213  491:goto            162
    //  214  494:iinc            13  1
    //  215  497:goto            162
    //  216  500:iconst_0        
    //  217  501:istore          9
    //  218  503:goto            57
    //  219  506:ldc1            #240 <String "action">
    //  220  508:astore          22
    //  221  510:goto            380
    //  222  513:ldc1            #242 <String "category">
    //  223  515:astore          22
    //  224  517:goto            380
    //  225  520:ldc1            #244 <String "data">
    //  226  522:astore          22
    //  227  524:goto            380
    //  228  527:ldc1            #246 <String "type">
    //  229  529:astore          22
    //  230  531:goto            380
    //  231  534:aload           14
    //  232  536:ifnull          481
    //  233  539:iconst_0        
    //  234  540:istore          15
    //  235  542:goto            409
    }

    public void sendBroadcastSync(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #250 <Method boolean sendBroadcast(Intent)>
    //    3    5:ifeq            12
    //    4    8:aload_0         
    //    5    9:invokespecial   #70  <Method void executePendingBroadcasts()>
    //    6   12:return          
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field HashMap mReceivers>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 20 handler(s) 159
    //    5    7:aload_0         
    //    6    8:getfield        #43  <Field HashMap mReceivers>
    //    7   11:aload_1         
    //    8   12:invokevirtual   #255 <Method Object HashMap.remove(Object)>
    //    9   15:checkcast       #47  <Class ArrayList>
    //   10   18:astore          4
    //   11   20:aload           4
    //   12   22:ifnonnull       164
    // try 25 27 handler(s) 159
    //   13   25:aload_2         
    //   14   26:monitorexit     
    //   15   27:return          
    // try 28 50 handler(s) 159
    //   16   28:iload           5
    //   17   30:aload           4
    //   18   32:invokevirtual   #74  <Method int ArrayList.size()>
    //   19   35:icmpge          156
    //   20   38:aload           4
    //   21   40:iload           5
    //   22   42:invokevirtual   #90  <Method Object ArrayList.get(int)>
    //   23   45:checkcast       #137 <Class IntentFilter>
    //   24   48:astore          6
    //   25   50:iconst_0        
    //   26   51:istore          7
    // try 53 86 handler(s) 159
    //   27   53:iload           7
    //   28   55:aload           6
    //   29   57:invokevirtual   #140 <Method int IntentFilter.countActions()>
    //   30   60:icmpge          182
    //   31   63:aload           6
    //   32   65:iload           7
    //   33   67:invokevirtual   #144 <Method String IntentFilter.getAction(int)>
    //   34   70:astore          8
    //   35   72:aload_0         
    //   36   73:getfield        #45  <Field HashMap mActions>
    //   37   76:aload           8
    //   38   78:invokevirtual   #124 <Method Object HashMap.get(Object)>
    //   39   81:checkcast       #47  <Class ArrayList>
    //   40   84:astore          9
    //   41   86:aload           9
    //   42   88:ifnull          176
    //   43   91:iconst_0        
    //   44   92:istore          10
    // try 94 129 handler(s) 159
    //   45   94:iload           10
    //   46   96:aload           9
    //   47   98:invokevirtual   #74  <Method int ArrayList.size()>
    //   48  101:icmpge          135
    //   49  104:aload           9
    //   50  106:iload           10
    //   51  108:invokevirtual   #90  <Method Object ArrayList.get(int)>
    //   52  111:checkcast       #92  <Class LocalBroadcastManager$ReceiverRecord>
    //   53  114:getfield        #96  <Field BroadcastReceiver LocalBroadcastManager$ReceiverRecord.receiver>
    //   54  117:aload_1         
    //   55  118:if_acmpne       170
    //   56  121:aload           9
    //   57  123:iload           10
    //   58  125:invokevirtual   #257 <Method Object ArrayList.remove(int)>
    //   59  128:pop             
    //   60  129:iinc            10  -1
    //   61  132:goto            170
    // try 135 153 handler(s) 159
    //   62  135:aload           9
    //   63  137:invokevirtual   #74  <Method int ArrayList.size()>
    //   64  140:ifgt            176
    //   65  143:aload_0         
    //   66  144:getfield        #45  <Field HashMap mActions>
    //   67  147:aload           8
    //   68  149:invokevirtual   #255 <Method Object HashMap.remove(Object)>
    //   69  152:pop             
    //   70  153:goto            176
    // try 156 158 handler(s) 159
    //   71  156:aload_2         
    //   72  157:monitorexit     
    //   73  158:return          
    // finally
    //   74  159:astore_3        
    // try 160 162 handler(s) 159
    //   75  160:aload_2         
    //   76  161:monitorexit     
    //   77  162:aload_3         
    //   78  163:athrow          
    //   79  164:iconst_0        
    //   80  165:istore          5
    //   81  167:goto            28
    //   82  170:iinc            10  1
    //   83  173:goto            94
    //   84  176:iinc            7  1
    //   85  179:goto            53
    //   86  182:iinc            5  1
    //   87  185:goto            28
    }

    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock;
    private final HashMap mActions;
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList mPendingBroadcasts;
    private final HashMap mReceivers;

    static void access$000(LocalBroadcastManager localbroadcastmanager)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #70  <Method void executePendingBroadcasts()>
    //    2    4:return          
    }

    // Unreferenced inner class android/support/v4/content/LocalBroadcastManager$1

/* anonymous class */
    class _cls1 extends Handler
    {

        _cls1(Looper looper)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field LocalBroadcastManager this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #17  <Method void Handler(Looper)>
        //    6   10:return          
        }

        public void handleMessage(Message message)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #25  <Field int Message.what>
        //    2    4:tableswitch     1 1: default 24
        //                       1 30
        //    3   24:aload_0         
        //    4   25:aload_1         
        //    5   26:invokespecial   #27  <Method void Handler.handleMessage(Message)>
        //    6   29:return          
        //    7   30:aload_0         
        //    8   31:getfield        #14  <Field LocalBroadcastManager this$0>
        //    9   34:invokestatic    #31  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
        //   10   37:return          
        }

        final LocalBroadcastManager this$0;
    }

}
