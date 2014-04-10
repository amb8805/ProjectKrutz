// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.google.android.apps.analytics:
//            Event, AdHitIdGenerator, CustomVariableBuffer, HitStore, 
//            Item, Transaction, Dispatcher, CustomVariable, 
//            PersistentHitStore, NetworkDispatcher

public class GoogleAnalyticsTracker
{
    final class DispatcherCallbacks
        implements Dispatcher.Callbacks
    {

        DispatcherCallbacks()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field GoogleAnalyticsTracker this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        public void dispatchFinished()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field GoogleAnalyticsTracker this$0>
        //    2    4:invokestatic    #22  <Method Handler GoogleAnalyticsTracker.access$000(GoogleAnalyticsTracker)>
        //    3    7:new             #24  <Class GoogleAnalyticsTracker$DispatcherCallbacks$1>
        //    4   10:dup             
        //    5   11:aload_0         
        //    6   12:invokespecial   #27  <Method void GoogleAnalyticsTracker$DispatcherCallbacks$1(GoogleAnalyticsTracker$DispatcherCallbacks)>
        //    7   15:invokevirtual   #33  <Method boolean Handler.post(Runnable)>
        //    8   18:pop             
        //    9   19:return          
        }

        public void hitDispatched(long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field GoogleAnalyticsTracker this$0>
        //    2    4:invokestatic    #39  <Method HitStore GoogleAnalyticsTracker.access$100(GoogleAnalyticsTracker)>
        //    3    7:lload_1         
        //    4    8:invokeinterface #44  <Method void HitStore.deleteHit(long)>
        //    5   13:return          
        }

        final GoogleAnalyticsTracker this$0;
    }


    static 
    {
    //    0    0:new             #2   <Class GoogleAnalyticsTracker>
    //    1    3:dup             
    //    2    4:invokespecial   #58  <Method void GoogleAnalyticsTracker()>
    //    3    7:putstatic       #60  <Field GoogleAnalyticsTracker instance>
    //    4   10:return          
    }

    private GoogleAnalyticsTracker()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #61  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #63  <Field boolean debug>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #65  <Field boolean dryRun>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #67  <Field boolean anonymizeIp>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #69  <Field boolean useServerTime>
    //   14   24:aload_0         
    //   15   25:bipush          100
    //   16   27:putfield        #71  <Field int sampleRate>
    //   17   30:aload_0         
    //   18   31:ldc1            #11  <String "GoogleAnalytics">
    //   19   33:putfield        #73  <Field String userAgentProduct>
    //   20   36:aload_0         
    //   21   37:ldc1            #14  <String "1.4.2">
    //   22   39:putfield        #75  <Field String userAgentVersion>
    //   23   42:aload_0         
    //   24   43:new             #77  <Class HashMap>
    //   25   46:dup             
    //   26   47:invokespecial   #78  <Method void HashMap()>
    //   27   50:putfield        #80  <Field Map transactionMap>
    //   28   53:aload_0         
    //   29   54:new             #77  <Class HashMap>
    //   30   57:dup             
    //   31   58:invokespecial   #78  <Method void HashMap()>
    //   32   61:putfield        #82  <Field Map itemMap>
    //   33   64:aload_0         
    //   34   65:new             #84  <Class GoogleAnalyticsTracker$1>
    //   35   68:dup             
    //   36   69:aload_0         
    //   37   70:invokespecial   #87  <Method void GoogleAnalyticsTracker$1(GoogleAnalyticsTracker)>
    //   38   73:putfield        #89  <Field Runnable dispatchRunner>
    //   39   76:return          
    }

    static Handler access$000(GoogleAnalyticsTracker googleanalyticstracker)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #93  <Field Handler handler>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #93  <Field Handler handler>
    //    5    4:areturn         
    }

    static HitStore access$100(GoogleAnalyticsTracker googleanalyticstracker)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #97  <Field HitStore hitStore>
    //    5    4:areturn         
    }

    private void cancelPendingDispatches()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #93  <Field Handler handler>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #93  <Field Handler handler>
    //    5   11:aload_0         
    //    6   12:getfield        #89  <Field Runnable dispatchRunner>
    //    7   15:invokevirtual   #104 <Method void Handler.removeCallbacks(Runnable)>
    //    8   18:return          
    }

    private void createEvent(String s, String s1, String s2, String s3, int i)
    {
    //    0    0:new             #108 <Class Event>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:aload           4
    //    6    9:iload           5
    //    7   11:aload_0         
    //    8   12:getfield        #110 <Field Context parent>
    //    9   15:invokevirtual   #116 <Method Resources Context.getResources()>
    //   10   18:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   11   21:getfield        #127 <Field int DisplayMetrics.widthPixels>
    //   12   24:aload_0         
    //   13   25:getfield        #110 <Field Context parent>
    //   14   28:invokevirtual   #116 <Method Resources Context.getResources()>
    //   15   31:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   16   34:getfield        #130 <Field int DisplayMetrics.heightPixels>
    //   17   37:invokespecial   #133 <Method void Event(String, String, String, String, int, int, int)>
    //   18   40:astore          6
    //   19   42:aload           6
    //   20   44:aload_0         
    //   21   45:getfield        #135 <Field CustomVariableBuffer customVariableBuffer>
    //   22   48:invokevirtual   #139 <Method void Event.setCustomVariableBuffer(CustomVariableBuffer)>
    //   23   51:aload           6
    //   24   53:aload_0         
    //   25   54:getfield        #141 <Field AdHitIdGenerator adHitIdGenerator>
    //   26   57:invokevirtual   #147 <Method int AdHitIdGenerator.getAdHitId()>
    //   27   60:invokevirtual   #151 <Method void Event.setAdHitId(int)>
    //   28   63:aload           6
    //   29   65:aload_0         
    //   30   66:getfield        #69  <Field boolean useServerTime>
    //   31   69:invokevirtual   #155 <Method void Event.setUseServerTime(boolean)>
    //   32   72:aload_0         
    //   33   73:new             #157 <Class CustomVariableBuffer>
    //   34   76:dup             
    //   35   77:invokespecial   #158 <Method void CustomVariableBuffer()>
    //   36   80:putfield        #135 <Field CustomVariableBuffer customVariableBuffer>
    //   37   83:aload_0         
    //   38   84:getfield        #97  <Field HitStore hitStore>
    //   39   87:aload           6
    //   40   89:invokeinterface #164 <Method void HitStore.putEvent(Event)>
    //   41   94:aload_0         
    //   42   95:invokespecial   #167 <Method void resetPowerSaveMode()>
    //   43   98:return          
    }

    public static GoogleAnalyticsTracker getInstance()
    {
    //    0    0:getstatic       #60  <Field GoogleAnalyticsTracker instance>
    //    1    3:areturn         
    }

    private void maybeScheduleNextDispatch()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field int dispatchPeriod>
    //    2    4:ifge            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #93  <Field Handler handler>
    //    6   12:aload_0         
    //    7   13:getfield        #89  <Field Runnable dispatchRunner>
    //    8   16:sipush          1000
    //    9   19:aload_0         
    //   10   20:getfield        #172 <Field int dispatchPeriod>
    //   11   23:imul            
    //   12   24:i2l             
    //   13   25:invokevirtual   #176 <Method boolean Handler.postDelayed(Runnable, long)>
    //   14   28:ifeq            7
    //   15   31:aload_0         
    //   16   32:getfield        #63  <Field boolean debug>
    //   17   35:ifeq            7
    //   18   38:ldc1            #8   <String "GoogleAnalyticsTracker">
    //   19   40:ldc1            #178 <String "Scheduled next dispatch">
    //   20   42:invokestatic    #184 <Method int Log.v(String, String)>
    //   21   45:pop             
    //   22   46:return          
    }

    private void resetPowerSaveMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #186 <Field boolean powerSaveMode>
    //    2    4:ifeq            16
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #186 <Field boolean powerSaveMode>
    //    6   12:aload_0         
    //    7   13:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //    8   16:return          
    }

    public void addItem(Item item)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field Map transactionMap>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #196 <Method String Item.getOrderId()>
    //    4    8:invokeinterface #202 <Method Object Map.get(Object)>
    //    5   13:checkcast       #204 <Class Transaction>
    //    6   16:ifnonnull       85
    //    7   19:ldc1            #8   <String "GoogleAnalyticsTracker">
    //    8   21:new             #206 <Class StringBuilder>
    //    9   24:dup             
    //   10   25:invokespecial   #207 <Method void StringBuilder()>
    //   11   28:ldc1            #209 <String "No transaction with orderId ">
    //   12   30:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   13   33:aload_1         
    //   14   34:invokevirtual   #196 <Method String Item.getOrderId()>
    //   15   37:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   16   40:ldc1            #215 <String " found, creating one">
    //   17   42:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   18   45:invokevirtual   #218 <Method String StringBuilder.toString()>
    //   19   48:invokestatic    #221 <Method int Log.i(String, String)>
    //   20   51:pop             
    //   21   52:new             #223 <Class Transaction$Builder>
    //   22   55:dup             
    //   23   56:aload_1         
    //   24   57:invokevirtual   #196 <Method String Item.getOrderId()>
    //   25   60:dconst_0        
    //   26   61:invokespecial   #226 <Method void Transaction$Builder(String, double)>
    //   27   64:invokevirtual   #230 <Method Transaction Transaction$Builder.build()>
    //   28   67:astore          6
    //   29   69:aload_0         
    //   30   70:getfield        #80  <Field Map transactionMap>
    //   31   73:aload_1         
    //   32   74:invokevirtual   #196 <Method String Item.getOrderId()>
    //   33   77:aload           6
    //   34   79:invokeinterface #234 <Method Object Map.put(Object, Object)>
    //   35   84:pop             
    //   36   85:aload_0         
    //   37   86:getfield        #82  <Field Map itemMap>
    //   38   89:aload_1         
    //   39   90:invokevirtual   #196 <Method String Item.getOrderId()>
    //   40   93:invokeinterface #202 <Method Object Map.get(Object)>
    //   41   98:checkcast       #198 <Class Map>
    //   42  101:astore_2        
    //   43  102:aload_2         
    //   44  103:ifnonnull       129
    //   45  106:new             #77  <Class HashMap>
    //   46  109:dup             
    //   47  110:invokespecial   #78  <Method void HashMap()>
    //   48  113:astore_2        
    //   49  114:aload_0         
    //   50  115:getfield        #82  <Field Map itemMap>
    //   51  118:aload_1         
    //   52  119:invokevirtual   #196 <Method String Item.getOrderId()>
    //   53  122:aload_2         
    //   54  123:invokeinterface #234 <Method Object Map.put(Object, Object)>
    //   55  128:pop             
    //   56  129:aload_2         
    //   57  130:aload_1         
    //   58  131:invokevirtual   #237 <Method String Item.getItemSKU()>
    //   59  134:aload_1         
    //   60  135:invokeinterface #234 <Method Object Map.put(Object, Object)>
    //   61  140:pop             
    //   62  141:return          
    }

    public void addTransaction(Transaction transaction)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field Map transactionMap>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #240 <Method String Transaction.getOrderId()>
    //    4    8:aload_1         
    //    5    9:invokeinterface #234 <Method Object Map.put(Object, Object)>
    //    6   14:pop             
    //    7   15:return          
    }

    public void clearTransactions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field Map transactionMap>
    //    2    4:invokeinterface #244 <Method void Map.clear()>
    //    3    9:aload_0         
    //    4   10:getfield        #82  <Field Map itemMap>
    //    5   13:invokeinterface #244 <Method void Map.clear()>
    //    6   18:return          
    }

    public boolean dispatch()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field boolean debug>
    //    2    4:ifeq            15
    //    3    7:ldc1            #8   <String "GoogleAnalyticsTracker">
    //    4    9:ldc1            #248 <String "Called dispatch">
    //    5   11:invokestatic    #184 <Method int Log.v(String, String)>
    //    6   14:pop             
    //    7   15:aload_0         
    //    8   16:getfield        #250 <Field boolean dispatcherIsBusy>
    //    9   19:ifeq            43
    //   10   22:aload_0         
    //   11   23:getfield        #63  <Field boolean debug>
    //   12   26:ifeq            37
    //   13   29:ldc1            #8   <String "GoogleAnalyticsTracker">
    //   14   31:ldc1            #252 <String "...but dispatcher was busy">
    //   15   33:invokestatic    #184 <Method int Log.v(String, String)>
    //   16   36:pop             
    //   17   37:aload_0         
    //   18   38:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //   19   41:iconst_0        
    //   20   42:ireturn         
    //   21   43:aload_0         
    //   22   44:getfield        #254 <Field ConnectivityManager connectivityManager>
    //   23   47:invokevirtual   #260 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
    //   24   50:astore_1        
    //   25   51:aload_1         
    //   26   52:ifnull          62
    //   27   55:aload_1         
    //   28   56:invokevirtual   #265 <Method boolean NetworkInfo.isAvailable()>
    //   29   59:ifne            84
    //   30   62:aload_0         
    //   31   63:getfield        #63  <Field boolean debug>
    //   32   66:ifeq            78
    //   33   69:ldc1            #8   <String "GoogleAnalyticsTracker">
    //   34   71:ldc2            #267 <String "...but there was no network available">
    //   35   74:invokestatic    #184 <Method int Log.v(String, String)>
    //   36   77:pop             
    //   37   78:aload_0         
    //   38   79:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //   39   82:iconst_0        
    //   40   83:ireturn         
    //   41   84:aload_0         
    //   42   85:getfield        #97  <Field HitStore hitStore>
    //   43   88:invokeinterface #270 <Method int HitStore.getNumStoredHits()>
    //   44   93:ifeq            170
    //   45   96:aload_0         
    //   46   97:getfield        #97  <Field HitStore hitStore>
    //   47  100:invokeinterface #274 <Method Hit[] HitStore.peekHits()>
    //   48  105:astore          4
    //   49  107:aload_0         
    //   50  108:getfield        #276 <Field Dispatcher dispatcher>
    //   51  111:aload           4
    //   52  113:invokeinterface #282 <Method void Dispatcher.dispatchHits(Hit[])>
    //   53  118:aload_0         
    //   54  119:iconst_1        
    //   55  120:putfield        #250 <Field boolean dispatcherIsBusy>
    //   56  123:aload_0         
    //   57  124:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //   58  127:aload_0         
    //   59  128:getfield        #63  <Field boolean debug>
    //   60  131:ifeq            168
    //   61  134:ldc1            #8   <String "GoogleAnalyticsTracker">
    //   62  136:new             #206 <Class StringBuilder>
    //   63  139:dup             
    //   64  140:invokespecial   #207 <Method void StringBuilder()>
    //   65  143:ldc2            #284 <String "Sending ">
    //   66  146:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   67  149:aload           4
    //   68  151:arraylength     
    //   69  152:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
    //   70  155:ldc2            #289 <String " hits to dispatcher">
    //   71  158:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   72  161:invokevirtual   #218 <Method String StringBuilder.toString()>
    //   73  164:invokestatic    #184 <Method int Log.v(String, String)>
    //   74  167:pop             
    //   75  168:iconst_1        
    //   76  169:ireturn         
    //   77  170:aload_0         
    //   78  171:iconst_1        
    //   79  172:putfield        #186 <Field boolean powerSaveMode>
    //   80  175:aload_0         
    //   81  176:getfield        #63  <Field boolean debug>
    //   82  179:ifeq            41
    //   83  182:ldc1            #8   <String "GoogleAnalyticsTracker">
    //   84  184:ldc2            #291 <String "...but there was nothing to dispatch">
    //   85  187:invokestatic    #184 <Method int Log.v(String, String)>
    //   86  190:pop             
    //   87  191:iconst_0        
    //   88  192:ireturn         
    }

    void dispatchFinished()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #250 <Field boolean dispatcherIsBusy>
    //    3    5:return          
    }

    public boolean getAnonymizeIp()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field boolean anonymizeIp>
    //    2    4:ireturn         
    }

    public boolean getDebug()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field boolean debug>
    //    2    4:ireturn         
    }

    Dispatcher getDispatcher()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #276 <Field Dispatcher dispatcher>
    //    2    4:areturn         
    }

    HitStore getHitStore()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:areturn         
    }

    public int getSampleRate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field int sampleRate>
    //    2    4:ireturn         
    }

    String getSessionIdForAds()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #97  <Field HitStore hitStore>
    //    7   13:invokeinterface #303 <Method String HitStore.getSessionId()>
    //    8   18:areturn         
    }

    public String getVisitorCustomVar(int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_1        
    //    2    2:icmplt          10
    //    3    5:iload_1         
    //    4    6:iconst_5        
    //    5    7:icmple          21
    //    6   10:new             #307 <Class IllegalArgumentException>
    //    7   13:dup             
    //    8   14:ldc2            #309 <String "Index must be between 1 and 5 inclusive.">
    //    9   17:invokespecial   #312 <Method void IllegalArgumentException(String)>
    //   10   20:athrow          
    //   11   21:aload_0         
    //   12   22:getfield        #97  <Field HitStore hitStore>
    //   13   25:iload_1         
    //   14   26:invokeinterface #314 <Method String HitStore.getVisitorCustomVar(int)>
    //   15   31:areturn         
    }

    String getVisitorIdForAds()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #97  <Field HitStore hitStore>
    //    7   13:invokeinterface #318 <Method String HitStore.getVisitorId()>
    //    8   18:areturn         
    }

    public boolean isDryRun()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field boolean dryRun>
    //    2    4:ireturn         
    }

    void returnToInitialState()
    {
    //    0    0:new             #2   <Class GoogleAnalyticsTracker>
    //    1    3:dup             
    //    2    4:invokespecial   #58  <Method void GoogleAnalyticsTracker()>
    //    3    7:putstatic       #60  <Field GoogleAnalyticsTracker instance>
    //    4   10:return          
    }

    void setAdHitIdGenerator(AdHitIdGenerator adhitidgenerator)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #141 <Field AdHitIdGenerator adHitIdGenerator>
    //    3    5:return          
    }

    public void setAnonymizeIp(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #67  <Field boolean anonymizeIp>
    //    3    5:aload_0         
    //    4    6:getfield        #97  <Field HitStore hitStore>
    //    5    9:ifnull          25
    //    6   12:aload_0         
    //    7   13:getfield        #97  <Field HitStore hitStore>
    //    8   16:aload_0         
    //    9   17:getfield        #67  <Field boolean anonymizeIp>
    //   10   20:invokeinterface #325 <Method void HitStore.setAnonymizeIp(boolean)>
    //   11   25:return          
    }

    public boolean setCustomVar(int i, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:iconst_3        
    //    5    5:invokevirtual   #330 <Method boolean setCustomVar(int, String, String, int)>
    //    6    8:ireturn         
    }

    public boolean setCustomVar(int i, String s, String s1, int j)
    {
    // try 0 32 handler(s) 43
    //    0    0:new             #332 <Class CustomVariable>
    //    1    3:dup             
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:iload           4
    //    6    9:invokespecial   #335 <Method void CustomVariable(int, String, String, int)>
    //    7   12:astore          5
    //    8   14:aload_0         
    //    9   15:getfield        #135 <Field CustomVariableBuffer customVariableBuffer>
    //   10   18:ifnonnull       32
    //   11   21:aload_0         
    //   12   22:new             #157 <Class CustomVariableBuffer>
    //   13   25:dup             
    //   14   26:invokespecial   #158 <Method void CustomVariableBuffer()>
    //   15   29:putfield        #135 <Field CustomVariableBuffer customVariableBuffer>
    // try 32 41 handler(s) 43
    //   16   32:aload_0         
    //   17   33:getfield        #135 <Field CustomVariableBuffer customVariableBuffer>
    //   18   36:aload           5
    //   19   38:invokevirtual   #339 <Method void CustomVariableBuffer.setCustomVariable(CustomVariable)>
    //   20   41:iconst_1        
    //   21   42:ireturn         
    // catch IllegalArgumentException IllegalArgumentException
    //   22   43:astore          6
    //   23   45:iconst_0        
    //   24   46:ireturn         
    }

    public void setDebug(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #63  <Field boolean debug>
    //    3    5:return          
    }

    public void setDispatchPeriod(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field int dispatchPeriod>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #172 <Field int dispatchPeriod>
    //    6   10:iload_2         
    //    7   11:ifgt            19
    //    8   14:aload_0         
    //    9   15:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //   10   18:return          
    //   11   19:iload_2         
    //   12   20:ifle            18
    //   13   23:aload_0         
    //   14   24:invokespecial   #343 <Method void cancelPendingDispatches()>
    //   15   27:aload_0         
    //   16   28:invokespecial   #188 <Method void maybeScheduleNextDispatch()>
    //   17   31:return          
    }

    public boolean setDispatcher(Dispatcher dispatcher1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #250 <Field boolean dispatcherIsBusy>
    //    2    4:ifeq            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #276 <Field Dispatcher dispatcher>
    //    7   13:ifnull          25
    //    8   16:aload_0         
    //    9   17:getfield        #276 <Field Dispatcher dispatcher>
    //   10   20:invokeinterface #348 <Method void Dispatcher.stop()>
    //   11   25:aload_0         
    //   12   26:aload_1         
    //   13   27:putfield        #276 <Field Dispatcher dispatcher>
    //   14   30:aload_0         
    //   15   31:getfield        #276 <Field Dispatcher dispatcher>
    //   16   34:new             #350 <Class GoogleAnalyticsTracker$DispatcherCallbacks>
    //   17   37:dup             
    //   18   38:aload_0         
    //   19   39:invokespecial   #351 <Method void GoogleAnalyticsTracker$DispatcherCallbacks(GoogleAnalyticsTracker)>
    //   20   42:invokeinterface #355 <Method void Dispatcher.init(Dispatcher$Callbacks)>
    //   21   47:aload_0         
    //   22   48:getfield        #276 <Field Dispatcher dispatcher>
    //   23   51:aload_0         
    //   24   52:getfield        #65  <Field boolean dryRun>
    //   25   55:invokeinterface #358 <Method void Dispatcher.setDryRun(boolean)>
    //   26   60:iconst_1        
    //   27   61:ireturn         
    }

    public void setDryRun(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #65  <Field boolean dryRun>
    //    3    5:aload_0         
    //    4    6:getfield        #276 <Field Dispatcher dispatcher>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #276 <Field Dispatcher dispatcher>
    //    8   16:iload_1         
    //    9   17:invokeinterface #358 <Method void Dispatcher.setDryRun(boolean)>
    //   10   22:return          
    }

    public void setProductVersion(String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #73  <Field String userAgentProduct>
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:putfield        #75  <Field String userAgentVersion>
    //    6   10:return          
    }

    public boolean setReferrer(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:ifnonnull       18
    //    3    7:new             #364 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #366 <String "Can't set a referrer before starting the tracker">
    //    6   14:invokespecial   #367 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #97  <Field HitStore hitStore>
    //   10   22:aload_1         
    //   11   23:invokeinterface #369 <Method boolean HitStore.setReferrer(String)>
    //   12   28:ireturn         
    }

    public void setSampleRate(int i)
    {
    //    0    0:iload_1         
    //    1    1:iflt            10
    //    2    4:iload_1         
    //    3    5:bipush          100
    //    4    7:icmple          43
    //    5   10:ldc1            #8   <String "GoogleAnalyticsTracker">
    //    6   12:new             #206 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #207 <Method void StringBuilder()>
    //    9   19:ldc2            #372 <String "Invalid sample rate: ">
    //   10   22:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:iload_1         
    //   12   26:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
    //   13   29:ldc2            #374 <String " (should be between 0 and 100">
    //   14   32:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #218 <Method String StringBuilder.toString()>
    //   16   38:invokestatic    #377 <Method int Log.w(String, String)>
    //   17   41:pop             
    //   18   42:return          
    //   19   43:aload_0         
    //   20   44:iload_1         
    //   21   45:putfield        #71  <Field int sampleRate>
    //   22   48:aload_0         
    //   23   49:getfield        #97  <Field HitStore hitStore>
    //   24   52:ifnull          42
    //   25   55:aload_0         
    //   26   56:getfield        #97  <Field HitStore hitStore>
    //   27   59:aload_0         
    //   28   60:getfield        #71  <Field int sampleRate>
    //   29   63:invokeinterface #379 <Method void HitStore.setSampleRate(int)>
    //   30   68:return          
    }

    public void setUseServerTime(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #69  <Field boolean useServerTime>
    //    3    5:return          
    }

    public void start(String s, int i, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokevirtual   #385 <Method void startNewSession(String, int, Context)>
    //    5    7:return          
    }

    void start(String s, int i, Context context, HitStore hitstore, Dispatcher dispatcher1, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:aload           4
    //    5    6:aload           5
    //    6    8:iload           6
    //    7   10:new             #350 <Class GoogleAnalyticsTracker$DispatcherCallbacks>
    //    8   13:dup             
    //    9   14:aload_0         
    //   10   15:invokespecial   #351 <Method void GoogleAnalyticsTracker$DispatcherCallbacks(GoogleAnalyticsTracker)>
    //   11   18:invokevirtual   #389 <Method void start(String, int, Context, HitStore, Dispatcher, boolean, Dispatcher$Callbacks)>
    //   12   21:return          
    }

    void start(String s, int i, Context context, HitStore hitstore, Dispatcher dispatcher1, boolean flag, Dispatcher.Callbacks callbacks)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #391 <Field String accountId>
    //    3    5:aload_3         
    //    4    6:ifnonnull       20
    //    5    9:new             #393 <Class NullPointerException>
    //    6   12:dup             
    //    7   13:ldc2            #395 <String "Context cannot be null">
    //    8   16:invokespecial   #396 <Method void NullPointerException(String)>
    //    9   19:athrow          
    //   10   20:aload_0         
    //   11   21:aload_3         
    //   12   22:invokevirtual   #400 <Method Context Context.getApplicationContext()>
    //   13   25:putfield        #110 <Field Context parent>
    //   14   28:aload_0         
    //   15   29:aload           4
    //   16   31:putfield        #97  <Field HitStore hitStore>
    //   17   34:aload_0         
    //   18   35:new             #143 <Class AdHitIdGenerator>
    //   19   38:dup             
    //   20   39:invokespecial   #401 <Method void AdHitIdGenerator()>
    //   21   42:putfield        #141 <Field AdHitIdGenerator adHitIdGenerator>
    //   22   45:iload           6
    //   23   47:ifeq            59
    //   24   50:aload_0         
    //   25   51:getfield        #97  <Field HitStore hitStore>
    //   26   54:invokeinterface #404 <Method void HitStore.startNewVisit()>
    //   27   59:aload_0         
    //   28   60:aload           5
    //   29   62:putfield        #276 <Field Dispatcher dispatcher>
    //   30   65:aload_0         
    //   31   66:getfield        #276 <Field Dispatcher dispatcher>
    //   32   69:aload           7
    //   33   71:invokeinterface #355 <Method void Dispatcher.init(Dispatcher$Callbacks)>
    //   34   76:aload_0         
    //   35   77:iconst_0        
    //   36   78:putfield        #250 <Field boolean dispatcherIsBusy>
    //   37   81:aload_0         
    //   38   82:getfield        #254 <Field ConnectivityManager connectivityManager>
    //   39   85:ifnonnull       105
    //   40   88:aload_0         
    //   41   89:aload_0         
    //   42   90:getfield        #110 <Field Context parent>
    //   43   93:ldc2            #406 <String "connectivity">
    //   44   96:invokevirtual   #410 <Method Object Context.getSystemService(String)>
    //   45   99:checkcast       #256 <Class ConnectivityManager>
    //   46  102:putfield        #254 <Field ConnectivityManager connectivityManager>
    //   47  105:aload_0         
    //   48  106:getfield        #93  <Field Handler handler>
    //   49  109:ifnonnull       133
    //   50  112:aload_0         
    //   51  113:new             #100 <Class Handler>
    //   52  116:dup             
    //   53  117:aload_3         
    //   54  118:invokevirtual   #414 <Method android.os.Looper Context.getMainLooper()>
    //   55  121:invokespecial   #417 <Method void Handler(android.os.Looper)>
    //   56  124:putfield        #93  <Field Handler handler>
    //   57  127:aload_0         
    //   58  128:iload_2         
    //   59  129:invokevirtual   #419 <Method void setDispatchPeriod(int)>
    //   60  132:return          
    //   61  133:aload_0         
    //   62  134:invokespecial   #343 <Method void cancelPendingDispatches()>
    //   63  137:goto            127
    }

    void start(String s, int i, Context context, boolean flag)
    {
    //    0    0:aload_3         
    //    1    1:ifnonnull       15
    //    2    4:new             #393 <Class NullPointerException>
    //    3    7:dup             
    //    4    8:ldc2            #395 <String "Context cannot be null">
    //    5   11:invokespecial   #396 <Method void NullPointerException(String)>
    //    6   14:athrow          
    //    7   15:aload_0         
    //    8   16:getfield        #97  <Field HitStore hitStore>
    //    9   19:ifnonnull       103
    //   10   22:new             #422 <Class PersistentHitStore>
    //   11   25:dup             
    //   12   26:aload_3         
    //   13   27:invokespecial   #425 <Method void PersistentHitStore(Context)>
    //   14   30:astore          5
    //   15   32:aload           5
    //   16   34:aload_0         
    //   17   35:getfield        #67  <Field boolean anonymizeIp>
    //   18   38:invokeinterface #325 <Method void HitStore.setAnonymizeIp(boolean)>
    //   19   43:aload           5
    //   20   45:aload_0         
    //   21   46:getfield        #71  <Field int sampleRate>
    //   22   49:invokeinterface #379 <Method void HitStore.setSampleRate(int)>
    //   23   54:aload_0         
    //   24   55:getfield        #276 <Field Dispatcher dispatcher>
    //   25   58:ifnonnull       112
    //   26   61:new             #427 <Class NetworkDispatcher>
    //   27   64:dup             
    //   28   65:aload_0         
    //   29   66:getfield        #73  <Field String userAgentProduct>
    //   30   69:aload_0         
    //   31   70:getfield        #75  <Field String userAgentVersion>
    //   32   73:invokespecial   #429 <Method void NetworkDispatcher(String, String)>
    //   33   76:astore          6
    //   34   78:aload           6
    //   35   80:aload_0         
    //   36   81:getfield        #65  <Field boolean dryRun>
    //   37   84:invokeinterface #358 <Method void Dispatcher.setDryRun(boolean)>
    //   38   89:aload_0         
    //   39   90:aload_1         
    //   40   91:iload_2         
    //   41   92:aload_3         
    //   42   93:aload           5
    //   43   95:aload           6
    //   44   97:iload           4
    //   45   99:invokevirtual   #431 <Method void start(String, int, Context, HitStore, Dispatcher, boolean)>
    //   46  102:return          
    //   47  103:aload_0         
    //   48  104:getfield        #97  <Field HitStore hitStore>
    //   49  107:astore          5
    //   50  109:goto            54
    //   51  112:aload_0         
    //   52  113:getfield        #276 <Field Dispatcher dispatcher>
    //   53  116:astore          6
    //   54  118:goto            89
    }

    public void start(String s, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_m1       
    //    3    3:aload_2         
    //    4    4:invokevirtual   #434 <Method void start(String, int, Context)>
    //    5    7:return          
    }

    public void startNewSession(String s, int i, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:iconst_1        
    //    5    5:invokevirtual   #436 <Method void start(String, int, Context, boolean)>
    //    6    8:return          
    }

    public void startNewSession(String s, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_m1       
    //    3    3:aload_2         
    //    4    4:invokevirtual   #385 <Method void startNewSession(String, int, Context)>
    //    5    7:return          
    }

    public void stop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #276 <Field Dispatcher dispatcher>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #276 <Field Dispatcher dispatcher>
    //    5   11:invokeinterface #348 <Method void Dispatcher.stop()>
    //    6   16:aload_0         
    //    7   17:invokespecial   #343 <Method void cancelPendingDispatches()>
    //    8   20:return          
    }

    public void stopSession()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #438 <Method void stop()>
    //    2    4:return          
    }

    public void trackEvent(String s, String s1, String s2, int i)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       15
    //    2    4:new             #307 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc2            #442 <String "category cannot be null">
    //    5   11:invokespecial   #312 <Method void IllegalArgumentException(String)>
    //    6   14:athrow          
    //    7   15:aload_2         
    //    8   16:ifnonnull       30
    //    9   19:new             #307 <Class IllegalArgumentException>
    //   10   22:dup             
    //   11   23:ldc2            #444 <String "action cannot be null">
    //   12   26:invokespecial   #312 <Method void IllegalArgumentException(String)>
    //   13   29:athrow          
    //   14   30:aload_0         
    //   15   31:aload_0         
    //   16   32:getfield        #391 <Field String accountId>
    //   17   35:aload_1         
    //   18   36:aload_2         
    //   19   37:aload_3         
    //   20   38:iload           4
    //   21   40:invokespecial   #446 <Method void createEvent(String, String, String, String, int)>
    //   22   43:return          
    }

    public void trackPageView(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #391 <Field String accountId>
    //    3    5:ldc2            #449 <String "__##GOOGLEPAGEVIEW##__">
    //    4    8:aload_1         
    //    5    9:aconst_null     
    //    6   10:iconst_m1       
    //    7   11:invokespecial   #446 <Method void createEvent(String, String, String, String, int)>
    //    8   14:return          
    }

    public void trackTransactions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field Map transactionMap>
    //    2    4:invokeinterface #454 <Method Collection Map.values()>
    //    3    9:invokeinterface #460 <Method Iterator Collection.iterator()>
    //    4   14:astore_1        
    //    5   15:aload_1         
    //    6   16:invokeinterface #465 <Method boolean Iterator.hasNext()>
    //    7   21:ifeq            226
    //    8   24:aload_1         
    //    9   25:invokeinterface #469 <Method Object Iterator.next()>
    //   10   30:checkcast       #204 <Class Transaction>
    //   11   33:astore_2        
    //   12   34:new             #108 <Class Event>
    //   13   37:dup             
    //   14   38:aload_0         
    //   15   39:getfield        #391 <Field String accountId>
    //   16   42:ldc2            #471 <String "__##GOOGLETRANSACTION##__">
    //   17   45:ldc2            #473 <String "">
    //   18   48:ldc2            #473 <String "">
    //   19   51:iconst_0        
    //   20   52:aload_0         
    //   21   53:getfield        #110 <Field Context parent>
    //   22   56:invokevirtual   #116 <Method Resources Context.getResources()>
    //   23   59:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   24   62:getfield        #127 <Field int DisplayMetrics.widthPixels>
    //   25   65:aload_0         
    //   26   66:getfield        #110 <Field Context parent>
    //   27   69:invokevirtual   #116 <Method Resources Context.getResources()>
    //   28   72:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   29   75:getfield        #130 <Field int DisplayMetrics.heightPixels>
    //   30   78:invokespecial   #133 <Method void Event(String, String, String, String, int, int, int)>
    //   31   81:astore_3        
    //   32   82:aload_3         
    //   33   83:aload_2         
    //   34   84:invokevirtual   #476 <Method void Event.setTransaction(Transaction)>
    //   35   87:aload_0         
    //   36   88:getfield        #97  <Field HitStore hitStore>
    //   37   91:aload_3         
    //   38   92:invokeinterface #164 <Method void HitStore.putEvent(Event)>
    //   39   97:aload_0         
    //   40   98:getfield        #82  <Field Map itemMap>
    //   41  101:aload_2         
    //   42  102:invokevirtual   #240 <Method String Transaction.getOrderId()>
    //   43  105:invokeinterface #202 <Method Object Map.get(Object)>
    //   44  110:checkcast       #198 <Class Map>
    //   45  113:astore          4
    //   46  115:aload           4
    //   47  117:ifnull          15
    //   48  120:aload           4
    //   49  122:invokeinterface #454 <Method Collection Map.values()>
    //   50  127:invokeinterface #460 <Method Iterator Collection.iterator()>
    //   51  132:astore          5
    //   52  134:aload           5
    //   53  136:invokeinterface #465 <Method boolean Iterator.hasNext()>
    //   54  141:ifeq            15
    //   55  144:aload           5
    //   56  146:invokeinterface #469 <Method Object Iterator.next()>
    //   57  151:checkcast       #192 <Class Item>
    //   58  154:astore          6
    //   59  156:new             #108 <Class Event>
    //   60  159:dup             
    //   61  160:aload_0         
    //   62  161:getfield        #391 <Field String accountId>
    //   63  164:ldc2            #478 <String "__##GOOGLEITEM##__">
    //   64  167:ldc2            #473 <String "">
    //   65  170:ldc2            #473 <String "">
    //   66  173:iconst_0        
    //   67  174:aload_0         
    //   68  175:getfield        #110 <Field Context parent>
    //   69  178:invokevirtual   #116 <Method Resources Context.getResources()>
    //   70  181:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   71  184:getfield        #127 <Field int DisplayMetrics.widthPixels>
    //   72  187:aload_0         
    //   73  188:getfield        #110 <Field Context parent>
    //   74  191:invokevirtual   #116 <Method Resources Context.getResources()>
    //   75  194:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   76  197:getfield        #130 <Field int DisplayMetrics.heightPixels>
    //   77  200:invokespecial   #133 <Method void Event(String, String, String, String, int, int, int)>
    //   78  203:astore          7
    //   79  205:aload           7
    //   80  207:aload           6
    //   81  209:invokevirtual   #481 <Method void Event.setItem(Item)>
    //   82  212:aload_0         
    //   83  213:getfield        #97  <Field HitStore hitStore>
    //   84  216:aload           7
    //   85  218:invokeinterface #164 <Method void HitStore.putEvent(Event)>
    //   86  223:goto            134
    //   87  226:aload_0         
    //   88  227:invokevirtual   #483 <Method void clearTransactions()>
    //   89  230:aload_0         
    //   90  231:invokespecial   #167 <Method void resetPowerSaveMode()>
    //   91  234:return          
    }

    public static final String LOG_TAG = "GoogleAnalyticsTracker";
    public static final String PRODUCT = "GoogleAnalytics";
    public static final String VERSION = "1.4.2";
    public static final String WIRE_VERSION = "4.8.1ma";
    private static GoogleAnalyticsTracker instance;
    private String accountId;
    private AdHitIdGenerator adHitIdGenerator;
    private boolean anonymizeIp;
    private ConnectivityManager connectivityManager;
    private CustomVariableBuffer customVariableBuffer;
    private boolean debug;
    private int dispatchPeriod;
    private Runnable dispatchRunner;
    private Dispatcher dispatcher;
    private boolean dispatcherIsBusy;
    private boolean dryRun;
    private Handler handler;
    private HitStore hitStore;
    private Map itemMap;
    private Context parent;
    private boolean powerSaveMode;
    private int sampleRate;
    private Map transactionMap;
    private boolean useServerTime;
    private String userAgentProduct;
    private String userAgentVersion;

    static Handler access$000(GoogleAnalyticsTracker googleanalyticstracker)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #93  <Field Handler handler>
    //    2    4:areturn         
    }

    static HitStore access$100(GoogleAnalyticsTracker googleanalyticstracker)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #97  <Field HitStore hitStore>
    //    2    4:areturn         
    }

    // Unreferenced inner class com/google/android/apps/analytics/GoogleAnalyticsTracker$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field GoogleAnalyticsTracker this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field GoogleAnalyticsTracker this$0>
        //    2    4:invokevirtual   #22  <Method boolean GoogleAnalyticsTracker.dispatch()>
        //    3    7:pop             
        //    4    8:return          
        }

        final GoogleAnalyticsTracker this$0;
    }


    // Unreferenced inner class com/google/android/apps/analytics/GoogleAnalyticsTracker$DispatcherCallbacks$1

/* anonymous class */
    class DispatcherCallbacks._cls1
        implements Runnable
    {

        DispatcherCallbacks._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field GoogleAnalyticsTracker$DispatcherCallbacks this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field GoogleAnalyticsTracker$DispatcherCallbacks this$1>
        //    2    4:getfield        #24  <Field GoogleAnalyticsTracker GoogleAnalyticsTracker$DispatcherCallbacks.this$0>
        //    3    7:invokevirtual   #27  <Method void GoogleAnalyticsTracker.dispatchFinished()>
        //    4   10:return          
        }

        final DispatcherCallbacks this$1;
    }

}
