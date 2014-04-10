// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            LoaderManager, FragmentActivity, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{
    final class LoaderInfo
        implements android.support.v4.content.Loader.OnLoadCompleteListener
    {

        public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #36  <Field LoaderManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #39  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #41  <Field int mId>
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:putfield        #43  <Field Bundle mArgs>
        //   11   19:aload_0         
        //   12   20:aload           4
        //   13   22:putfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   14   25:return          
        }

        void callOnLoadFinished(Loader loader, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //    2    4:ifnull          137
        //    3    7:aload_0         
        //    4    8:getfield        #36  <Field LoaderManagerImpl this$0>
        //    5   11:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //    6   14:astore_3        
        //    7   15:aconst_null     
        //    8   16:astore          4
        //    9   18:aload_3         
        //   10   19:ifnull          52
        //   11   22:aload_0         
        //   12   23:getfield        #36  <Field LoaderManagerImpl this$0>
        //   13   26:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   14   29:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   15   32:getfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //   16   35:astore          4
        //   17   37:aload_0         
        //   18   38:getfield        #36  <Field LoaderManagerImpl this$0>
        //   19   41:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   20   44:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   21   47:ldc1            #67  <String "onLoadFinished">
        //   22   49:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        // try 52 96 handler(s) 138
        //   23   52:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   24   55:ifeq            96
        //   25   58:ldc1            #72  <String "LoaderManager">
        //   26   60:new             #74  <Class StringBuilder>
        //   27   63:dup             
        //   28   64:invokespecial   #75  <Method void StringBuilder()>
        //   29   67:ldc1            #77  <String "  onLoadFinished in ">
        //   30   69:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   31   72:aload_1         
        //   32   73:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   33   76:ldc1            #86  <String ": ">
        //   34   78:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   35   81:aload_1         
        //   36   82:aload_2         
        //   37   83:invokevirtual   #92  <Method String Loader.dataToString(Object)>
        //   38   86:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   39   89:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   40   92:invokestatic    #102 <Method int Log.v(String, String)>
        //   41   95:pop             
        // try 96 107 handler(s) 138
        //   42   96:aload_0         
        //   43   97:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   44  100:aload_1         
        //   45  101:aload_2         
        //   46  102:invokeinterface #106 <Method void LoaderManager$LoaderCallbacks.onLoadFinished(Loader, Object)>
        //   47  107:aload_0         
        //   48  108:getfield        #36  <Field LoaderManagerImpl this$0>
        //   49  111:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   50  114:ifnull          132
        //   51  117:aload_0         
        //   52  118:getfield        #36  <Field LoaderManagerImpl this$0>
        //   53  121:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   54  124:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   55  127:aload           4
        //   56  129:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //   57  132:aload_0         
        //   58  133:iconst_1        
        //   59  134:putfield        #108 <Field boolean mDeliveredData>
        //   60  137:return          
        // finally
        //   61  138:astore          5
        //   62  140:aload_0         
        //   63  141:getfield        #36  <Field LoaderManagerImpl this$0>
        //   64  144:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   65  147:ifnull          165
        //   66  150:aload_0         
        //   67  151:getfield        #36  <Field LoaderManagerImpl this$0>
        //   68  154:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   69  157:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   70  160:aload           4
        //   71  162:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //   72  165:aload           5
        //   73  167:athrow          
        }

        void destroy()
        {
        //    0    0:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //    1    3:ifeq            31
        //    2    6:ldc1            #72  <String "LoaderManager">
        //    3    8:new             #74  <Class StringBuilder>
        //    4   11:dup             
        //    5   12:invokespecial   #75  <Method void StringBuilder()>
        //    6   15:ldc1            #111 <String "  Destroying: ">
        //    7   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //    8   20:aload_0         
        //    9   21:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   10   24:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   11   27:invokestatic    #102 <Method int Log.v(String, String)>
        //   12   30:pop             
        //   13   31:aload_0         
        //   14   32:iconst_1        
        //   15   33:putfield        #113 <Field boolean mDestroyed>
        //   16   36:aload_0         
        //   17   37:getfield        #108 <Field boolean mDeliveredData>
        //   18   40:istore_1        
        //   19   41:aload_0         
        //   20   42:iconst_0        
        //   21   43:putfield        #108 <Field boolean mDeliveredData>
        //   22   46:aload_0         
        //   23   47:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   24   50:ifnull          182
        //   25   53:aload_0         
        //   26   54:getfield        #115 <Field Loader mLoader>
        //   27   57:ifnull          182
        //   28   60:aload_0         
        //   29   61:getfield        #117 <Field boolean mHaveData>
        //   30   64:ifeq            182
        //   31   67:iload_1         
        //   32   68:ifeq            182
        //   33   71:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   34   74:ifeq            102
        //   35   77:ldc1            #72  <String "LoaderManager">
        //   36   79:new             #74  <Class StringBuilder>
        //   37   82:dup             
        //   38   83:invokespecial   #75  <Method void StringBuilder()>
        //   39   86:ldc1            #119 <String "  Reseting: ">
        //   40   88:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   41   91:aload_0         
        //   42   92:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   43   95:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   44   98:invokestatic    #102 <Method int Log.v(String, String)>
        //   45  101:pop             
        //   46  102:aload_0         
        //   47  103:getfield        #36  <Field LoaderManagerImpl this$0>
        //   48  106:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   49  109:astore_2        
        //   50  110:aconst_null     
        //   51  111:astore_3        
        //   52  112:aload_2         
        //   53  113:ifnull          145
        //   54  116:aload_0         
        //   55  117:getfield        #36  <Field LoaderManagerImpl this$0>
        //   56  120:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   57  123:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   58  126:getfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //   59  129:astore_3        
        //   60  130:aload_0         
        //   61  131:getfield        #36  <Field LoaderManagerImpl this$0>
        //   62  134:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   63  137:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   64  140:ldc1            #121 <String "onLoaderReset">
        //   65  142:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        // try 145 158 handler(s) 246
        //   66  145:aload_0         
        //   67  146:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   68  149:aload_0         
        //   69  150:getfield        #115 <Field Loader mLoader>
        //   70  153:invokeinterface #124 <Method void LoaderManager$LoaderCallbacks.onLoaderReset(Loader)>
        //   71  158:aload_0         
        //   72  159:getfield        #36  <Field LoaderManagerImpl this$0>
        //   73  162:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   74  165:ifnull          182
        //   75  168:aload_0         
        //   76  169:getfield        #36  <Field LoaderManagerImpl this$0>
        //   77  172:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //   78  175:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //   79  178:aload_3         
        //   80  179:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //   81  182:aload_0         
        //   82  183:aconst_null     
        //   83  184:putfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   84  187:aload_0         
        //   85  188:aconst_null     
        //   86  189:putfield        #126 <Field Object mData>
        //   87  192:aload_0         
        //   88  193:iconst_0        
        //   89  194:putfield        #117 <Field boolean mHaveData>
        //   90  197:aload_0         
        //   91  198:getfield        #115 <Field Loader mLoader>
        //   92  201:ifnull          231
        //   93  204:aload_0         
        //   94  205:getfield        #128 <Field boolean mListenerRegistered>
        //   95  208:ifeq            224
        //   96  211:aload_0         
        //   97  212:iconst_0        
        //   98  213:putfield        #128 <Field boolean mListenerRegistered>
        //   99  216:aload_0         
        //  100  217:getfield        #115 <Field Loader mLoader>
        //  101  220:aload_0         
        //  102  221:invokevirtual   #132 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
        //  103  224:aload_0         
        //  104  225:getfield        #115 <Field Loader mLoader>
        //  105  228:invokevirtual   #135 <Method void Loader.reset()>
        //  106  231:aload_0         
        //  107  232:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //  108  235:ifnull          245
        //  109  238:aload_0         
        //  110  239:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //  111  242:invokevirtual   #139 <Method void destroy()>
        //  112  245:return          
        // finally
        //  113  246:astore          4
        //  114  248:aload_0         
        //  115  249:getfield        #36  <Field LoaderManagerImpl this$0>
        //  116  252:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //  117  255:ifnull          272
        //  118  258:aload_0         
        //  119  259:getfield        #36  <Field LoaderManagerImpl this$0>
        //  120  262:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //  121  265:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //  122  268:aload_3         
        //  123  269:putfield        #65  <Field String FragmentManagerImpl.mNoTransactionsBecause>
        //  124  272:aload           4
        //  125  274:athrow          
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
        //    0    0:aload_3         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //    3    5:aload_3         
        //    4    6:ldc1            #149 <String "mId=">
        //    5    8:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //    6   11:aload_3         
        //    7   12:aload_0         
        //    8   13:getfield        #41  <Field int mId>
        //    9   16:invokevirtual   #152 <Method void PrintWriter.print(int)>
        //   10   19:aload_3         
        //   11   20:ldc1            #154 <String " mArgs=">
        //   12   22:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   13   25:aload_3         
        //   14   26:aload_0         
        //   15   27:getfield        #43  <Field Bundle mArgs>
        //   16   30:invokevirtual   #158 <Method void PrintWriter.println(Object)>
        //   17   33:aload_3         
        //   18   34:aload_1         
        //   19   35:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   20   38:aload_3         
        //   21   39:ldc1            #160 <String "mCallbacks=">
        //   22   41:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   23   44:aload_3         
        //   24   45:aload_0         
        //   25   46:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   26   49:invokevirtual   #158 <Method void PrintWriter.println(Object)>
        //   27   52:aload_3         
        //   28   53:aload_1         
        //   29   54:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   30   57:aload_3         
        //   31   58:ldc1            #162 <String "mLoader=">
        //   32   60:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   33   63:aload_3         
        //   34   64:aload_0         
        //   35   65:getfield        #115 <Field Loader mLoader>
        //   36   68:invokevirtual   #158 <Method void PrintWriter.println(Object)>
        //   37   71:aload_0         
        //   38   72:getfield        #115 <Field Loader mLoader>
        //   39   75:ifnull          108
        //   40   78:aload_0         
        //   41   79:getfield        #115 <Field Loader mLoader>
        //   42   82:new             #74  <Class StringBuilder>
        //   43   85:dup             
        //   44   86:invokespecial   #75  <Method void StringBuilder()>
        //   45   89:aload_1         
        //   46   90:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   47   93:ldc1            #164 <String "  ">
        //   48   95:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   49   98:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   50  101:aload_2         
        //   51  102:aload_3         
        //   52  103:aload           4
        //   53  105:invokevirtual   #166 <Method void Loader.dump(String, FileDescriptor, PrintWriter, String[])>
        //   54  108:aload_0         
        //   55  109:getfield        #117 <Field boolean mHaveData>
        //   56  112:ifne            122
        //   57  115:aload_0         
        //   58  116:getfield        #108 <Field boolean mDeliveredData>
        //   59  119:ifeq            174
        //   60  122:aload_3         
        //   61  123:aload_1         
        //   62  124:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   63  127:aload_3         
        //   64  128:ldc1            #168 <String "mHaveData=">
        //   65  130:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   66  133:aload_3         
        //   67  134:aload_0         
        //   68  135:getfield        #117 <Field boolean mHaveData>
        //   69  138:invokevirtual   #171 <Method void PrintWriter.print(boolean)>
        //   70  141:aload_3         
        //   71  142:ldc1            #173 <String "  mDeliveredData=">
        //   72  144:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   73  147:aload_3         
        //   74  148:aload_0         
        //   75  149:getfield        #108 <Field boolean mDeliveredData>
        //   76  152:invokevirtual   #175 <Method void PrintWriter.println(boolean)>
        //   77  155:aload_3         
        //   78  156:aload_1         
        //   79  157:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   80  160:aload_3         
        //   81  161:ldc1            #177 <String "mData=">
        //   82  163:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   83  166:aload_3         
        //   84  167:aload_0         
        //   85  168:getfield        #126 <Field Object mData>
        //   86  171:invokevirtual   #158 <Method void PrintWriter.println(Object)>
        //   87  174:aload_3         
        //   88  175:aload_1         
        //   89  176:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   90  179:aload_3         
        //   91  180:ldc1            #179 <String "mStarted=">
        //   92  182:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //   93  185:aload_3         
        //   94  186:aload_0         
        //   95  187:getfield        #181 <Field boolean mStarted>
        //   96  190:invokevirtual   #171 <Method void PrintWriter.print(boolean)>
        //   97  193:aload_3         
        //   98  194:ldc1            #183 <String " mReportNextStart=">
        //   99  196:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  100  199:aload_3         
        //  101  200:aload_0         
        //  102  201:getfield        #185 <Field boolean mReportNextStart>
        //  103  204:invokevirtual   #171 <Method void PrintWriter.print(boolean)>
        //  104  207:aload_3         
        //  105  208:ldc1            #187 <String " mDestroyed=">
        //  106  210:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  107  213:aload_3         
        //  108  214:aload_0         
        //  109  215:getfield        #113 <Field boolean mDestroyed>
        //  110  218:invokevirtual   #175 <Method void PrintWriter.println(boolean)>
        //  111  221:aload_3         
        //  112  222:aload_1         
        //  113  223:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  114  226:aload_3         
        //  115  227:ldc1            #189 <String "mRetaining=">
        //  116  229:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  117  232:aload_3         
        //  118  233:aload_0         
        //  119  234:getfield        #191 <Field boolean mRetaining>
        //  120  237:invokevirtual   #171 <Method void PrintWriter.print(boolean)>
        //  121  240:aload_3         
        //  122  241:ldc1            #193 <String " mRetainingStarted=">
        //  123  243:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  124  246:aload_3         
        //  125  247:aload_0         
        //  126  248:getfield        #195 <Field boolean mRetainingStarted>
        //  127  251:invokevirtual   #171 <Method void PrintWriter.print(boolean)>
        //  128  254:aload_3         
        //  129  255:ldc1            #197 <String " mListenerRegistered=">
        //  130  257:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  131  260:aload_3         
        //  132  261:aload_0         
        //  133  262:getfield        #128 <Field boolean mListenerRegistered>
        //  134  265:invokevirtual   #175 <Method void PrintWriter.println(boolean)>
        //  135  268:aload_0         
        //  136  269:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //  137  272:ifnull          330
        //  138  275:aload_3         
        //  139  276:aload_1         
        //  140  277:invokevirtual   #147 <Method void PrintWriter.print(String)>
        //  141  280:aload_3         
        //  142  281:ldc1            #199 <String "Pending Loader ">
        //  143  283:invokevirtual   #201 <Method void PrintWriter.println(String)>
        //  144  286:aload_3         
        //  145  287:aload_0         
        //  146  288:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //  147  291:invokevirtual   #203 <Method void PrintWriter.print(Object)>
        //  148  294:aload_3         
        //  149  295:ldc1            #205 <String ":">
        //  150  297:invokevirtual   #201 <Method void PrintWriter.println(String)>
        //  151  300:aload_0         
        //  152  301:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //  153  304:new             #74  <Class StringBuilder>
        //  154  307:dup             
        //  155  308:invokespecial   #75  <Method void StringBuilder()>
        //  156  311:aload_1         
        //  157  312:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //  158  315:ldc1            #164 <String "  ">
        //  159  317:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //  160  320:invokevirtual   #96  <Method String StringBuilder.toString()>
        //  161  323:aload_2         
        //  162  324:aload_3         
        //  163  325:aload           4
        //  164  327:invokevirtual   #206 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
        //  165  330:return          
        }

        void finishRetain()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #191 <Field boolean mRetaining>
        //    2    4:ifeq            65
        //    3    7:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //    4   10:ifeq            38
        //    5   13:ldc1            #72  <String "LoaderManager">
        //    6   15:new             #74  <Class StringBuilder>
        //    7   18:dup             
        //    8   19:invokespecial   #75  <Method void StringBuilder()>
        //    9   22:ldc1            #209 <String "  Finished Retaining: ">
        //   10   24:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:aload_0         
        //   12   28:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   13   31:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   14   34:invokestatic    #102 <Method int Log.v(String, String)>
        //   15   37:pop             
        //   16   38:aload_0         
        //   17   39:iconst_0        
        //   18   40:putfield        #191 <Field boolean mRetaining>
        //   19   43:aload_0         
        //   20   44:getfield        #181 <Field boolean mStarted>
        //   21   47:aload_0         
        //   22   48:getfield        #195 <Field boolean mRetainingStarted>
        //   23   51:icmpeq          65
        //   24   54:aload_0         
        //   25   55:getfield        #181 <Field boolean mStarted>
        //   26   58:ifne            65
        //   27   61:aload_0         
        //   28   62:invokevirtual   #212 <Method void stop()>
        //   29   65:aload_0         
        //   30   66:getfield        #181 <Field boolean mStarted>
        //   31   69:ifeq            98
        //   32   72:aload_0         
        //   33   73:getfield        #117 <Field boolean mHaveData>
        //   34   76:ifeq            98
        //   35   79:aload_0         
        //   36   80:getfield        #185 <Field boolean mReportNextStart>
        //   37   83:ifne            98
        //   38   86:aload_0         
        //   39   87:aload_0         
        //   40   88:getfield        #115 <Field Loader mLoader>
        //   41   91:aload_0         
        //   42   92:getfield        #126 <Field Object mData>
        //   43   95:invokevirtual   #214 <Method void callOnLoadFinished(Loader, Object)>
        //   44   98:return          
        }

        public void onLoadComplete(Loader loader, Object obj)
        {
        //    0    0:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //    1    3:ifeq            31
        //    2    6:ldc1            #72  <String "LoaderManager">
        //    3    8:new             #74  <Class StringBuilder>
        //    4   11:dup             
        //    5   12:invokespecial   #75  <Method void StringBuilder()>
        //    6   15:ldc1            #217 <String "onLoadComplete: ">
        //    7   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //    8   20:aload_0         
        //    9   21:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   10   24:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   11   27:invokestatic    #102 <Method int Log.v(String, String)>
        //   12   30:pop             
        //   13   31:aload_0         
        //   14   32:getfield        #113 <Field boolean mDestroyed>
        //   15   35:ifeq            53
        //   16   38:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   17   41:ifeq            52
        //   18   44:ldc1            #72  <String "LoaderManager">
        //   19   46:ldc1            #219 <String "  Ignoring load complete -- destroyed">
        //   20   48:invokestatic    #102 <Method int Log.v(String, String)>
        //   21   51:pop             
        //   22   52:return          
        //   23   53:aload_0         
        //   24   54:getfield        #36  <Field LoaderManagerImpl this$0>
        //   25   57:getfield        #223 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
        //   26   60:aload_0         
        //   27   61:getfield        #41  <Field int mId>
        //   28   64:invokevirtual   #229 <Method Object SparseArrayCompat.get(int)>
        //   29   67:aload_0         
        //   30   68:if_acmpeq       86
        //   31   71:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   32   74:ifeq            52
        //   33   77:ldc1            #72  <String "LoaderManager">
        //   34   79:ldc1            #231 <String "  Ignoring load complete -- not active">
        //   35   81:invokestatic    #102 <Method int Log.v(String, String)>
        //   36   84:pop             
        //   37   85:return          
        //   38   86:aload_0         
        //   39   87:getfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //   40   90:astore_3        
        //   41   91:aload_3         
        //   42   92:ifnull          159
        //   43   95:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   44   98:ifeq            126
        //   45  101:ldc1            #72  <String "LoaderManager">
        //   46  103:new             #74  <Class StringBuilder>
        //   47  106:dup             
        //   48  107:invokespecial   #75  <Method void StringBuilder()>
        //   49  110:ldc1            #233 <String "  Switching to pending loader: ">
        //   50  112:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   51  115:aload_3         
        //   52  116:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   53  119:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   54  122:invokestatic    #102 <Method int Log.v(String, String)>
        //   55  125:pop             
        //   56  126:aload_0         
        //   57  127:aconst_null     
        //   58  128:putfield        #137 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
        //   59  131:aload_0         
        //   60  132:getfield        #36  <Field LoaderManagerImpl this$0>
        //   61  135:getfield        #223 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
        //   62  138:aload_0         
        //   63  139:getfield        #41  <Field int mId>
        //   64  142:aconst_null     
        //   65  143:invokevirtual   #237 <Method void SparseArrayCompat.put(int, Object)>
        //   66  146:aload_0         
        //   67  147:invokevirtual   #139 <Method void destroy()>
        //   68  150:aload_0         
        //   69  151:getfield        #36  <Field LoaderManagerImpl this$0>
        //   70  154:aload_3         
        //   71  155:invokevirtual   #241 <Method void LoaderManagerImpl.installLoader(LoaderManagerImpl$LoaderInfo)>
        //   72  158:return          
        //   73  159:aload_0         
        //   74  160:getfield        #126 <Field Object mData>
        //   75  163:aload_2         
        //   76  164:if_acmpne       174
        //   77  167:aload_0         
        //   78  168:getfield        #117 <Field boolean mHaveData>
        //   79  171:ifne            197
        //   80  174:aload_0         
        //   81  175:aload_2         
        //   82  176:putfield        #126 <Field Object mData>
        //   83  179:aload_0         
        //   84  180:iconst_1        
        //   85  181:putfield        #117 <Field boolean mHaveData>
        //   86  184:aload_0         
        //   87  185:getfield        #181 <Field boolean mStarted>
        //   88  188:ifeq            197
        //   89  191:aload_0         
        //   90  192:aload_1         
        //   91  193:aload_2         
        //   92  194:invokevirtual   #214 <Method void callOnLoadFinished(Loader, Object)>
        //   93  197:aload_0         
        //   94  198:getfield        #36  <Field LoaderManagerImpl this$0>
        //   95  201:getfield        #244 <Field SparseArrayCompat LoaderManagerImpl.mInactiveLoaders>
        //   96  204:aload_0         
        //   97  205:getfield        #41  <Field int mId>
        //   98  208:invokevirtual   #229 <Method Object SparseArrayCompat.get(int)>
        //   99  211:checkcast       #2   <Class LoaderManagerImpl$LoaderInfo>
        //  100  214:astore          4
        //  101  216:aload           4
        //  102  218:ifnull          252
        //  103  221:aload           4
        //  104  223:aload_0         
        //  105  224:if_acmpeq       252
        //  106  227:aload           4
        //  107  229:iconst_0        
        //  108  230:putfield        #108 <Field boolean mDeliveredData>
        //  109  233:aload           4
        //  110  235:invokevirtual   #139 <Method void destroy()>
        //  111  238:aload_0         
        //  112  239:getfield        #36  <Field LoaderManagerImpl this$0>
        //  113  242:getfield        #244 <Field SparseArrayCompat LoaderManagerImpl.mInactiveLoaders>
        //  114  245:aload_0         
        //  115  246:getfield        #41  <Field int mId>
        //  116  249:invokevirtual   #247 <Method void SparseArrayCompat.remove(int)>
        //  117  252:aload_0         
        //  118  253:getfield        #36  <Field LoaderManagerImpl this$0>
        //  119  256:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //  120  259:ifnull          52
        //  121  262:aload_0         
        //  122  263:getfield        #36  <Field LoaderManagerImpl this$0>
        //  123  266:invokevirtual   #251 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
        //  124  269:ifne            52
        //  125  272:aload_0         
        //  126  273:getfield        #36  <Field LoaderManagerImpl this$0>
        //  127  276:getfield        #53  <Field FragmentActivity LoaderManagerImpl.mActivity>
        //  128  279:getfield        #59  <Field FragmentManagerImpl FragmentActivity.mFragments>
        //  129  282:invokevirtual   #254 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
        //  130  285:return          
        }

        void reportStart()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #181 <Field boolean mStarted>
        //    2    4:ifeq            38
        //    3    7:aload_0         
        //    4    8:getfield        #185 <Field boolean mReportNextStart>
        //    5   11:ifeq            38
        //    6   14:aload_0         
        //    7   15:iconst_0        
        //    8   16:putfield        #185 <Field boolean mReportNextStart>
        //    9   19:aload_0         
        //   10   20:getfield        #117 <Field boolean mHaveData>
        //   11   23:ifeq            38
        //   12   26:aload_0         
        //   13   27:aload_0         
        //   14   28:getfield        #115 <Field Loader mLoader>
        //   15   31:aload_0         
        //   16   32:getfield        #126 <Field Object mData>
        //   17   35:invokevirtual   #214 <Method void callOnLoadFinished(Loader, Object)>
        //   18   38:return          
        }

        void retain()
        {
        //    0    0:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //    1    3:ifeq            32
        //    2    6:ldc1            #72  <String "LoaderManager">
        //    3    8:new             #74  <Class StringBuilder>
        //    4   11:dup             
        //    5   12:invokespecial   #75  <Method void StringBuilder()>
        //    6   15:ldc2            #258 <String "  Retaining: ">
        //    7   18:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //    8   21:aload_0         
        //    9   22:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   10   25:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   11   28:invokestatic    #102 <Method int Log.v(String, String)>
        //   12   31:pop             
        //   13   32:aload_0         
        //   14   33:iconst_1        
        //   15   34:putfield        #191 <Field boolean mRetaining>
        //   16   37:aload_0         
        //   17   38:aload_0         
        //   18   39:getfield        #181 <Field boolean mStarted>
        //   19   42:putfield        #195 <Field boolean mRetainingStarted>
        //   20   45:aload_0         
        //   21   46:iconst_0        
        //   22   47:putfield        #181 <Field boolean mStarted>
        //   23   50:aload_0         
        //   24   51:aconst_null     
        //   25   52:putfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   26   55:return          
        }

        void start()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #191 <Field boolean mRetaining>
        //    2    4:ifeq            20
        //    3    7:aload_0         
        //    4    8:getfield        #195 <Field boolean mRetainingStarted>
        //    5   11:ifeq            20
        //    6   14:aload_0         
        //    7   15:iconst_1        
        //    8   16:putfield        #181 <Field boolean mStarted>
        //    9   19:return          
        //   10   20:aload_0         
        //   11   21:getfield        #181 <Field boolean mStarted>
        //   12   24:ifne            19
        //   13   27:aload_0         
        //   14   28:iconst_1        
        //   15   29:putfield        #181 <Field boolean mStarted>
        //   16   32:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //   17   35:ifeq            64
        //   18   38:ldc1            #72  <String "LoaderManager">
        //   19   40:new             #74  <Class StringBuilder>
        //   20   43:dup             
        //   21   44:invokespecial   #75  <Method void StringBuilder()>
        //   22   47:ldc2            #261 <String "  Starting: ">
        //   23   50:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   24   53:aload_0         
        //   25   54:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   26   57:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   27   60:invokestatic    #102 <Method int Log.v(String, String)>
        //   28   63:pop             
        //   29   64:aload_0         
        //   30   65:getfield        #115 <Field Loader mLoader>
        //   31   68:ifnonnull       99
        //   32   71:aload_0         
        //   33   72:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   34   75:ifnull          99
        //   35   78:aload_0         
        //   36   79:aload_0         
        //   37   80:getfield        #45  <Field LoaderManager$LoaderCallbacks mCallbacks>
        //   38   83:aload_0         
        //   39   84:getfield        #41  <Field int mId>
        //   40   87:aload_0         
        //   41   88:getfield        #43  <Field Bundle mArgs>
        //   42   91:invokeinterface #265 <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
        //   43   96:putfield        #115 <Field Loader mLoader>
        //   44   99:aload_0         
        //   45  100:getfield        #115 <Field Loader mLoader>
        //   46  103:ifnull          19
        //   47  106:aload_0         
        //   48  107:getfield        #115 <Field Loader mLoader>
        //   49  110:invokevirtual   #269 <Method Class Object.getClass()>
        //   50  113:invokevirtual   #274 <Method boolean Class.isMemberClass()>
        //   51  116:ifeq            166
        //   52  119:aload_0         
        //   53  120:getfield        #115 <Field Loader mLoader>
        //   54  123:invokevirtual   #269 <Method Class Object.getClass()>
        //   55  126:invokevirtual   #278 <Method int Class.getModifiers()>
        //   56  129:invokestatic    #284 <Method boolean Modifier.isStatic(int)>
        //   57  132:ifne            166
        //   58  135:new             #286 <Class IllegalArgumentException>
        //   59  138:dup             
        //   60  139:new             #74  <Class StringBuilder>
        //   61  142:dup             
        //   62  143:invokespecial   #75  <Method void StringBuilder()>
        //   63  146:ldc2            #288 <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
        //   64  149:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   65  152:aload_0         
        //   66  153:getfield        #115 <Field Loader mLoader>
        //   67  156:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   68  159:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   69  162:invokespecial   #290 <Method void IllegalArgumentException(String)>
        //   70  165:athrow          
        //   71  166:aload_0         
        //   72  167:getfield        #128 <Field boolean mListenerRegistered>
        //   73  170:ifne            190
        //   74  173:aload_0         
        //   75  174:getfield        #115 <Field Loader mLoader>
        //   76  177:aload_0         
        //   77  178:getfield        #41  <Field int mId>
        //   78  181:aload_0         
        //   79  182:invokevirtual   #294 <Method void Loader.registerListener(int, android.support.v4.content.Loader$OnLoadCompleteListener)>
        //   80  185:aload_0         
        //   81  186:iconst_1        
        //   82  187:putfield        #128 <Field boolean mListenerRegistered>
        //   83  190:aload_0         
        //   84  191:getfield        #115 <Field Loader mLoader>
        //   85  194:invokevirtual   #297 <Method void Loader.startLoading()>
        //   86  197:return          
        }

        void stop()
        {
        //    0    0:getstatic       #70  <Field boolean LoaderManagerImpl.DEBUG>
        //    1    3:ifeq            32
        //    2    6:ldc1            #72  <String "LoaderManager">
        //    3    8:new             #74  <Class StringBuilder>
        //    4   11:dup             
        //    5   12:invokespecial   #75  <Method void StringBuilder()>
        //    6   15:ldc2            #299 <String "  Stopping: ">
        //    7   18:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //    8   21:aload_0         
        //    9   22:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
        //   10   25:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   11   28:invokestatic    #102 <Method int Log.v(String, String)>
        //   12   31:pop             
        //   13   32:aload_0         
        //   14   33:iconst_0        
        //   15   34:putfield        #181 <Field boolean mStarted>
        //   16   37:aload_0         
        //   17   38:getfield        #191 <Field boolean mRetaining>
        //   18   41:ifne            78
        //   19   44:aload_0         
        //   20   45:getfield        #115 <Field Loader mLoader>
        //   21   48:ifnull          78
        //   22   51:aload_0         
        //   23   52:getfield        #128 <Field boolean mListenerRegistered>
        //   24   55:ifeq            78
        //   25   58:aload_0         
        //   26   59:iconst_0        
        //   27   60:putfield        #128 <Field boolean mListenerRegistered>
        //   28   63:aload_0         
        //   29   64:getfield        #115 <Field Loader mLoader>
        //   30   67:aload_0         
        //   31   68:invokevirtual   #132 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
        //   32   71:aload_0         
        //   33   72:getfield        #115 <Field Loader mLoader>
        //   34   75:invokevirtual   #302 <Method void Loader.stopLoading()>
        //   35   78:return          
        }

        public String toString()
        {
        //    0    0:new             #74  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:bipush          64
        //    3    6:invokespecial   #304 <Method void StringBuilder(int)>
        //    4    9:astore_1        
        //    5   10:aload_1         
        //    6   11:ldc2            #306 <String "LoaderInfo{">
        //    7   14:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //    8   17:pop             
        //    9   18:aload_1         
        //   10   19:aload_0         
        //   11   20:invokestatic    #312 <Method int System.identityHashCode(Object)>
        //   12   23:invokestatic    #318 <Method String Integer.toHexString(int)>
        //   13   26:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   14   29:pop             
        //   15   30:aload_1         
        //   16   31:ldc2            #320 <String " #">
        //   17   34:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   18   37:pop             
        //   19   38:aload_1         
        //   20   39:aload_0         
        //   21   40:getfield        #41  <Field int mId>
        //   22   43:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
        //   23   46:pop             
        //   24   47:aload_1         
        //   25   48:ldc2            #325 <String " : ">
        //   26   51:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   27   54:pop             
        //   28   55:aload_0         
        //   29   56:getfield        #115 <Field Loader mLoader>
        //   30   59:aload_1         
        //   31   60:invokestatic    #331 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
        //   32   63:aload_1         
        //   33   64:ldc2            #333 <String "}}">
        //   34   67:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
        //   35   70:pop             
        //   36   71:aload_1         
        //   37   72:invokevirtual   #96  <Method String StringBuilder.toString()>
        //   38   75:areturn         
        }

        final Bundle mArgs;
        LoaderManager.LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        final LoaderManagerImpl this$0;
    }


    static 
    {
    //    0    0:iconst_0        
    //    1    1:putstatic       #26  <Field boolean DEBUG>
    //    2    4:return          
    }

    LoaderManagerImpl(String s, FragmentActivity fragmentactivity, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #30  <Method void LoaderManager()>
    //    2    4:aload_0         
    //    3    5:new             #32  <Class SparseArrayCompat>
    //    4    8:dup             
    //    5    9:invokespecial   #33  <Method void SparseArrayCompat()>
    //    6   12:putfield        #35  <Field SparseArrayCompat mLoaders>
    //    7   15:aload_0         
    //    8   16:new             #32  <Class SparseArrayCompat>
    //    9   19:dup             
    //   10   20:invokespecial   #33  <Method void SparseArrayCompat()>
    //   11   23:putfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   12   26:aload_0         
    //   13   27:aload_1         
    //   14   28:putfield        #39  <Field String mWho>
    //   15   31:aload_0         
    //   16   32:aload_2         
    //   17   33:putfield        #41  <Field FragmentActivity mActivity>
    //   18   36:aload_0         
    //   19   37:iload_3         
    //   20   38:putfield        #43  <Field boolean mStarted>
    //   21   41:return          
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
    // try 0 20 handler(s) 28
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #47  <Field boolean mCreatingLoader>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:aload_2         
    //    6    8:aload_3         
    //    7    9:invokespecial   #50  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
    //    8   12:astore          5
    //    9   14:aload_0         
    //   10   15:aload           5
    //   11   17:invokevirtual   #54  <Method void installLoader(LoaderManagerImpl$LoaderInfo)>
    //   12   20:aload_0         
    //   13   21:iconst_0        
    //   14   22:putfield        #47  <Field boolean mCreatingLoader>
    //   15   25:aload           5
    //   16   27:areturn         
    // finally
    //   17   28:astore          4
    //   18   30:aload_0         
    //   19   31:iconst_0        
    //   20   32:putfield        #47  <Field boolean mCreatingLoader>
    //   21   35:aload           4
    //   22   37:athrow          
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
    //    0    0:new             #56  <Class LoaderManagerImpl$LoaderInfo>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:aload_2         
    //    5    7:aload_3         
    //    6    8:invokespecial   #59  <Method void LoaderManagerImpl$LoaderInfo(LoaderManagerImpl, int, Bundle, LoaderManager$LoaderCallbacks)>
    //    7   11:astore          4
    //    8   13:aload           4
    //    9   15:aload_3         
    //   10   16:iload_1         
    //   11   17:aload_2         
    //   12   18:invokeinterface #65  <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
    //   13   23:putfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   14   26:aload           4
    //   15   28:areturn         
    }

    public void destroyLoader(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field boolean mCreatingLoader>
    //    2    4:ifeq            17
    //    3    7:new             #73  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #75  <String "Called while creating a loader">
    //    6   13:invokespecial   #78  <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:getstatic       #26  <Field boolean DEBUG>
    //    9   20:ifeq            57
    //   10   23:ldc1            #11  <String "LoaderManager">
    //   11   25:new             #80  <Class StringBuilder>
    //   12   28:dup             
    //   13   29:invokespecial   #81  <Method void StringBuilder()>
    //   14   32:ldc1            #83  <String "destroyLoader in ">
    //   15   34:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   16   37:aload_0         
    //   17   38:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   18   41:ldc1            #92  <String " of ">
    //   19   43:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   20   46:iload_1         
    //   21   47:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
    //   22   50:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   23   53:invokestatic    #105 <Method int Log.v(String, String)>
    //   24   56:pop             
    //   25   57:aload_0         
    //   26   58:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   27   61:iload_1         
    //   28   62:invokevirtual   #109 <Method int SparseArrayCompat.indexOfKey(int)>
    //   29   65:istore_2        
    //   30   66:iload_2         
    //   31   67:iflt            96
    //   32   70:aload_0         
    //   33   71:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   34   74:iload_2         
    //   35   75:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   36   78:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   37   81:astore          5
    //   38   83:aload_0         
    //   39   84:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   40   87:iload_2         
    //   41   88:invokevirtual   #116 <Method void SparseArrayCompat.removeAt(int)>
    //   42   91:aload           5
    //   43   93:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   44   96:aload_0         
    //   45   97:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   46  100:iload_1         
    //   47  101:invokevirtual   #109 <Method int SparseArrayCompat.indexOfKey(int)>
    //   48  104:istore_3        
    //   49  105:iload_3         
    //   50  106:iflt            135
    //   51  109:aload_0         
    //   52  110:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   53  113:iload_3         
    //   54  114:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   55  117:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   56  120:astore          4
    //   57  122:aload_0         
    //   58  123:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   59  126:iload_3         
    //   60  127:invokevirtual   #116 <Method void SparseArrayCompat.removeAt(int)>
    //   61  130:aload           4
    //   62  132:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   63  135:aload_0         
    //   64  136:getfield        #41  <Field FragmentActivity mActivity>
    //   65  139:ifnull          159
    //   66  142:aload_0         
    //   67  143:invokevirtual   #123 <Method boolean hasRunningLoaders()>
    //   68  146:ifne            159
    //   69  149:aload_0         
    //   70  150:getfield        #41  <Field FragmentActivity mActivity>
    //   71  153:getfield        #129 <Field FragmentManagerImpl FragmentActivity.mFragments>
    //   72  156:invokevirtual   #134 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
    //   73  159:return          
    }

    void doDestroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field boolean mRetaining>
    //    2    4:ifne            79
    //    3    7:getstatic       #26  <Field boolean DEBUG>
    //    4   10:ifeq            38
    //    5   13:ldc1            #11  <String "LoaderManager">
    //    6   15:new             #80  <Class StringBuilder>
    //    7   18:dup             
    //    8   19:invokespecial   #81  <Method void StringBuilder()>
    //    9   22:ldc1            #139 <String "Destroying Active in ">
    //   10   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   11   27:aload_0         
    //   12   28:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   13   31:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   14   34:invokestatic    #105 <Method int Log.v(String, String)>
    //   15   37:pop             
    //   16   38:iconst_m1       
    //   17   39:aload_0         
    //   18   40:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   19   43:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   20   46:iadd            
    //   21   47:istore_3        
    //   22   48:iload_3         
    //   23   49:iflt            72
    //   24   52:aload_0         
    //   25   53:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   26   56:iload_3         
    //   27   57:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   28   60:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   29   63:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   30   66:iinc            3  -1
    //   31   69:goto            48
    //   32   72:aload_0         
    //   33   73:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   34   76:invokevirtual   #146 <Method void SparseArrayCompat.clear()>
    //   35   79:getstatic       #26  <Field boolean DEBUG>
    //   36   82:ifeq            110
    //   37   85:ldc1            #11  <String "LoaderManager">
    //   38   87:new             #80  <Class StringBuilder>
    //   39   90:dup             
    //   40   91:invokespecial   #81  <Method void StringBuilder()>
    //   41   94:ldc1            #148 <String "Destroying Inactive in ">
    //   42   96:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   43   99:aload_0         
    //   44  100:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   45  103:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   46  106:invokestatic    #105 <Method int Log.v(String, String)>
    //   47  109:pop             
    //   48  110:iconst_m1       
    //   49  111:aload_0         
    //   50  112:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   51  115:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   52  118:iadd            
    //   53  119:istore_1        
    //   54  120:iload_1         
    //   55  121:iflt            144
    //   56  124:aload_0         
    //   57  125:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   58  128:iload_1         
    //   59  129:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   60  132:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   61  135:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   62  138:iinc            1  -1
    //   63  141:goto            120
    //   64  144:aload_0         
    //   65  145:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   66  148:invokevirtual   #146 <Method void SparseArrayCompat.clear()>
    //   67  151:return          
    }

    void doReportNextStart()
    {
    //    0    0:iconst_m1       
    //    1    1:aload_0         
    //    2    2:getfield        #35  <Field SparseArrayCompat mLoaders>
    //    3    5:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //    4    8:iadd            
    //    5    9:istore_1        
    //    6   10:iload_1         
    //    7   11:iflt            35
    //    8   14:aload_0         
    //    9   15:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   10   18:iload_1         
    //   11   19:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   12   22:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   13   25:iconst_1        
    //   14   26:putfield        #152 <Field boolean LoaderManagerImpl$LoaderInfo.mReportNextStart>
    //   15   29:iinc            1  -1
    //   16   32:goto            10
    //   17   35:return          
    }

    void doReportStart()
    {
    //    0    0:iconst_m1       
    //    1    1:aload_0         
    //    2    2:getfield        #35  <Field SparseArrayCompat mLoaders>
    //    3    5:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //    4    8:iadd            
    //    5    9:istore_1        
    //    6   10:iload_1         
    //    7   11:iflt            34
    //    8   14:aload_0         
    //    9   15:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   10   18:iload_1         
    //   11   19:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   12   22:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   13   25:invokevirtual   #156 <Method void LoaderManagerImpl$LoaderInfo.reportStart()>
    //   14   28:iinc            1  -1
    //   15   31:goto            10
    //   16   34:return          
    }

    void doRetain()
    {
    //    0    0:getstatic       #26  <Field boolean DEBUG>
    //    1    3:ifeq            31
    //    2    6:ldc1            #11  <String "LoaderManager">
    //    3    8:new             #80  <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #81  <Method void StringBuilder()>
    //    6   15:ldc1            #159 <String "Retaining in ">
    //    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //    8   20:aload_0         
    //    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   10   24:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   11   27:invokestatic    #105 <Method int Log.v(String, String)>
    //   12   30:pop             
    //   13   31:aload_0         
    //   14   32:getfield        #43  <Field boolean mStarted>
    //   15   35:ifne            80
    //   16   38:new             #161 <Class RuntimeException>
    //   17   41:dup             
    //   18   42:ldc1            #163 <String "here">
    //   19   44:invokespecial   #164 <Method void RuntimeException(String)>
    //   20   47:astore_1        
    //   21   48:aload_1         
    //   22   49:invokevirtual   #168 <Method Throwable RuntimeException.fillInStackTrace()>
    //   23   52:pop             
    //   24   53:ldc1            #11  <String "LoaderManager">
    //   25   55:new             #80  <Class StringBuilder>
    //   26   58:dup             
    //   27   59:invokespecial   #81  <Method void StringBuilder()>
    //   28   62:ldc1            #170 <String "Called doRetain when not started: ">
    //   29   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   30   67:aload_0         
    //   31   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   32   71:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   33   74:aload_1         
    //   34   75:invokestatic    #174 <Method int Log.w(String, String, Throwable)>
    //   35   78:pop             
    //   36   79:return          
    //   37   80:aload_0         
    //   38   81:iconst_1        
    //   39   82:putfield        #137 <Field boolean mRetaining>
    //   40   85:aload_0         
    //   41   86:iconst_0        
    //   42   87:putfield        #43  <Field boolean mStarted>
    //   43   90:iconst_m1       
    //   44   91:aload_0         
    //   45   92:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   46   95:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   47   98:iadd            
    //   48   99:istore          4
    //   49  101:iload           4
    //   50  103:iflt            79
    //   51  106:aload_0         
    //   52  107:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   53  110:iload           4
    //   54  112:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   55  115:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   56  118:invokevirtual   #177 <Method void LoaderManagerImpl$LoaderInfo.retain()>
    //   57  121:iinc            4  -1
    //   58  124:goto            101
    }

    void doStart()
    {
    //    0    0:getstatic       #26  <Field boolean DEBUG>
    //    1    3:ifeq            31
    //    2    6:ldc1            #11  <String "LoaderManager">
    //    3    8:new             #80  <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #81  <Method void StringBuilder()>
    //    6   15:ldc1            #180 <String "Starting in ">
    //    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //    8   20:aload_0         
    //    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   10   24:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   11   27:invokestatic    #105 <Method int Log.v(String, String)>
    //   12   30:pop             
    //   13   31:aload_0         
    //   14   32:getfield        #43  <Field boolean mStarted>
    //   15   35:ifeq            80
    //   16   38:new             #161 <Class RuntimeException>
    //   17   41:dup             
    //   18   42:ldc1            #163 <String "here">
    //   19   44:invokespecial   #164 <Method void RuntimeException(String)>
    //   20   47:astore_1        
    //   21   48:aload_1         
    //   22   49:invokevirtual   #168 <Method Throwable RuntimeException.fillInStackTrace()>
    //   23   52:pop             
    //   24   53:ldc1            #11  <String "LoaderManager">
    //   25   55:new             #80  <Class StringBuilder>
    //   26   58:dup             
    //   27   59:invokespecial   #81  <Method void StringBuilder()>
    //   28   62:ldc1            #182 <String "Called doStart when already started: ">
    //   29   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   30   67:aload_0         
    //   31   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   32   71:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   33   74:aload_1         
    //   34   75:invokestatic    #174 <Method int Log.w(String, String, Throwable)>
    //   35   78:pop             
    //   36   79:return          
    //   37   80:aload_0         
    //   38   81:iconst_1        
    //   39   82:putfield        #43  <Field boolean mStarted>
    //   40   85:iconst_m1       
    //   41   86:aload_0         
    //   42   87:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   43   90:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   44   93:iadd            
    //   45   94:istore          4
    //   46   96:iload           4
    //   47   98:iflt            79
    //   48  101:aload_0         
    //   49  102:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   50  105:iload           4
    //   51  107:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   52  110:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   53  113:invokevirtual   #185 <Method void LoaderManagerImpl$LoaderInfo.start()>
    //   54  116:iinc            4  -1
    //   55  119:goto            96
    }

    void doStop()
    {
    //    0    0:getstatic       #26  <Field boolean DEBUG>
    //    1    3:ifeq            31
    //    2    6:ldc1            #11  <String "LoaderManager">
    //    3    8:new             #80  <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #81  <Method void StringBuilder()>
    //    6   15:ldc1            #188 <String "Stopping in ">
    //    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //    8   20:aload_0         
    //    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   10   24:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   11   27:invokestatic    #105 <Method int Log.v(String, String)>
    //   12   30:pop             
    //   13   31:aload_0         
    //   14   32:getfield        #43  <Field boolean mStarted>
    //   15   35:ifne            80
    //   16   38:new             #161 <Class RuntimeException>
    //   17   41:dup             
    //   18   42:ldc1            #163 <String "here">
    //   19   44:invokespecial   #164 <Method void RuntimeException(String)>
    //   20   47:astore_1        
    //   21   48:aload_1         
    //   22   49:invokevirtual   #168 <Method Throwable RuntimeException.fillInStackTrace()>
    //   23   52:pop             
    //   24   53:ldc1            #11  <String "LoaderManager">
    //   25   55:new             #80  <Class StringBuilder>
    //   26   58:dup             
    //   27   59:invokespecial   #81  <Method void StringBuilder()>
    //   28   62:ldc1            #190 <String "Called doStop when not started: ">
    //   29   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   30   67:aload_0         
    //   31   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   32   71:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   33   74:aload_1         
    //   34   75:invokestatic    #174 <Method int Log.w(String, String, Throwable)>
    //   35   78:pop             
    //   36   79:return          
    //   37   80:iconst_m1       
    //   38   81:aload_0         
    //   39   82:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   40   85:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   41   88:iadd            
    //   42   89:istore          4
    //   43   91:iload           4
    //   44   93:iflt            117
    //   45   96:aload_0         
    //   46   97:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   47  100:iload           4
    //   48  102:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   49  105:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   50  108:invokevirtual   #193 <Method void LoaderManagerImpl$LoaderInfo.stop()>
    //   51  111:iinc            4  -1
    //   52  114:goto            91
    //   53  117:aload_0         
    //   54  118:iconst_0        
    //   55  119:putfield        #43  <Field boolean mStarted>
    //   56  122:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field SparseArrayCompat mLoaders>
    //    2    4:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //    3    7:ifle            127
    //    4   10:aload_3         
    //    5   11:aload_1         
    //    6   12:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //    7   15:aload_3         
    //    8   16:ldc1            #202 <String "Active Loaders:">
    //    9   18:invokevirtual   #205 <Method void PrintWriter.println(String)>
    //   10   21:new             #80  <Class StringBuilder>
    //   11   24:dup             
    //   12   25:invokespecial   #81  <Method void StringBuilder()>
    //   13   28:aload_1         
    //   14   29:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   15   32:ldc1            #207 <String "    ">
    //   16   34:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   17   37:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   18   40:astore          8
    //   19   42:iconst_0        
    //   20   43:istore          9
    //   21   45:iload           9
    //   22   47:aload_0         
    //   23   48:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   24   51:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   25   54:icmpge          127
    //   26   57:aload_0         
    //   27   58:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   28   61:iload           9
    //   29   63:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   30   66:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   31   69:astore          10
    //   32   71:aload_3         
    //   33   72:aload_1         
    //   34   73:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   35   76:aload_3         
    //   36   77:ldc1            #209 <String "  #">
    //   37   79:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   38   82:aload_3         
    //   39   83:aload_0         
    //   40   84:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   41   87:iload           9
    //   42   89:invokevirtual   #212 <Method int SparseArrayCompat.keyAt(int)>
    //   43   92:invokevirtual   #214 <Method void PrintWriter.print(int)>
    //   44   95:aload_3         
    //   45   96:ldc1            #216 <String ": ">
    //   46   98:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   47  101:aload_3         
    //   48  102:aload           10
    //   49  104:invokevirtual   #217 <Method String LoaderManagerImpl$LoaderInfo.toString()>
    //   50  107:invokevirtual   #205 <Method void PrintWriter.println(String)>
    //   51  110:aload           10
    //   52  112:aload           8
    //   53  114:aload_2         
    //   54  115:aload_3         
    //   55  116:aload           4
    //   56  118:invokevirtual   #219 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
    //   57  121:iinc            9  1
    //   58  124:goto            45
    //   59  127:aload_0         
    //   60  128:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   61  131:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   62  134:ifle            254
    //   63  137:aload_3         
    //   64  138:aload_1         
    //   65  139:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   66  142:aload_3         
    //   67  143:ldc1            #221 <String "Inactive Loaders:">
    //   68  145:invokevirtual   #205 <Method void PrintWriter.println(String)>
    //   69  148:new             #80  <Class StringBuilder>
    //   70  151:dup             
    //   71  152:invokespecial   #81  <Method void StringBuilder()>
    //   72  155:aload_1         
    //   73  156:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   74  159:ldc1            #207 <String "    ">
    //   75  161:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   76  164:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   77  167:astore          5
    //   78  169:iconst_0        
    //   79  170:istore          6
    //   80  172:iload           6
    //   81  174:aload_0         
    //   82  175:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   83  178:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   84  181:icmpge          254
    //   85  184:aload_0         
    //   86  185:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   87  188:iload           6
    //   88  190:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   89  193:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   90  196:astore          7
    //   91  198:aload_3         
    //   92  199:aload_1         
    //   93  200:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   94  203:aload_3         
    //   95  204:ldc1            #209 <String "  #">
    //   96  206:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //   97  209:aload_3         
    //   98  210:aload_0         
    //   99  211:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //  100  214:iload           6
    //  101  216:invokevirtual   #212 <Method int SparseArrayCompat.keyAt(int)>
    //  102  219:invokevirtual   #214 <Method void PrintWriter.print(int)>
    //  103  222:aload_3         
    //  104  223:ldc1            #216 <String ": ">
    //  105  225:invokevirtual   #200 <Method void PrintWriter.print(String)>
    //  106  228:aload_3         
    //  107  229:aload           7
    //  108  231:invokevirtual   #217 <Method String LoaderManagerImpl$LoaderInfo.toString()>
    //  109  234:invokevirtual   #205 <Method void PrintWriter.println(String)>
    //  110  237:aload           7
    //  111  239:aload           5
    //  112  241:aload_2         
    //  113  242:aload_3         
    //  114  243:aload           4
    //  115  245:invokevirtual   #219 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
    //  116  248:iinc            6  1
    //  117  251:goto            172
    //  118  254:return          
    }

    void finishRetain()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field boolean mRetaining>
    //    2    4:ifeq            77
    //    3    7:getstatic       #26  <Field boolean DEBUG>
    //    4   10:ifeq            38
    //    5   13:ldc1            #11  <String "LoaderManager">
    //    6   15:new             #80  <Class StringBuilder>
    //    7   18:dup             
    //    8   19:invokespecial   #81  <Method void StringBuilder()>
    //    9   22:ldc1            #224 <String "Finished Retaining in ">
    //   10   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   11   27:aload_0         
    //   12   28:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   13   31:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   14   34:invokestatic    #105 <Method int Log.v(String, String)>
    //   15   37:pop             
    //   16   38:aload_0         
    //   17   39:iconst_0        
    //   18   40:putfield        #137 <Field boolean mRetaining>
    //   19   43:iconst_m1       
    //   20   44:aload_0         
    //   21   45:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   22   48:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //   23   51:iadd            
    //   24   52:istore_1        
    //   25   53:iload_1         
    //   26   54:iflt            77
    //   27   57:aload_0         
    //   28   58:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   29   61:iload_1         
    //   30   62:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   31   65:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   32   68:invokevirtual   #226 <Method void LoaderManagerImpl$LoaderInfo.finishRetain()>
    //   33   71:iinc            1  -1
    //   34   74:goto            53
    //   35   77:return          
    }

    public Loader getLoader(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field boolean mCreatingLoader>
    //    2    4:ifeq            17
    //    3    7:new             #73  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #75  <String "Called while creating a loader">
    //    6   13:invokespecial   #78  <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   10   21:iload_1         
    //   11   22:invokevirtual   #231 <Method Object SparseArrayCompat.get(int)>
    //   12   25:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   13   28:astore_2        
    //   14   29:aload_2         
    //   15   30:ifnull          53
    //   16   33:aload_2         
    //   17   34:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //   18   37:ifnull          48
    //   19   40:aload_2         
    //   20   41:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //   21   44:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   22   47:areturn         
    //   23   48:aload_2         
    //   24   49:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   25   52:areturn         
    //   26   53:aconst_null     
    //   27   54:areturn         
    }

    public boolean hasRunningLoaders()
    {
    //    0    0:iconst_0        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #35  <Field SparseArrayCompat mLoaders>
    //    4    6:invokevirtual   #143 <Method int SparseArrayCompat.size()>
    //    5    9:istore_2        
    //    6   10:iconst_0        
    //    7   11:istore_3        
    //    8   12:iload_3         
    //    9   13:iload_2         
    //   10   14:icmpge          66
    //   11   17:aload_0         
    //   12   18:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   13   21:iload_3         
    //   14   22:invokevirtual   #113 <Method Object SparseArrayCompat.valueAt(int)>
    //   15   25:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   16   28:astore          4
    //   17   30:aload           4
    //   18   32:getfield        #236 <Field boolean LoaderManagerImpl$LoaderInfo.mStarted>
    //   19   35:ifeq            60
    //   20   38:aload           4
    //   21   40:getfield        #239 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
    //   22   43:ifne            60
    //   23   46:iconst_1        
    //   24   47:istore          5
    //   25   49:iload_1         
    //   26   50:iload           5
    //   27   52:ior             
    //   28   53:istore_1        
    //   29   54:iinc            3  1
    //   30   57:goto            12
    //   31   60:iconst_0        
    //   32   61:istore          5
    //   33   63:goto            49
    //   34   66:iload_1         
    //   35   67:ireturn         
    }

    public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field boolean mCreatingLoader>
    //    2    4:ifeq            17
    //    3    7:new             #73  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #75  <String "Called while creating a loader">
    //    6   13:invokespecial   #78  <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   10   21:iload_1         
    //   11   22:invokevirtual   #231 <Method Object SparseArrayCompat.get(int)>
    //   12   25:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   13   28:astore          4
    //   14   30:getstatic       #26  <Field boolean DEBUG>
    //   15   33:ifeq            70
    //   16   36:ldc1            #11  <String "LoaderManager">
    //   17   38:new             #80  <Class StringBuilder>
    //   18   41:dup             
    //   19   42:invokespecial   #81  <Method void StringBuilder()>
    //   20   45:ldc1            #243 <String "initLoader in ">
    //   21   47:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   22   50:aload_0         
    //   23   51:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   24   54:ldc1            #245 <String ": args=">
    //   25   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   26   59:aload_2         
    //   27   60:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   28   63:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   29   66:invokestatic    #105 <Method int Log.v(String, String)>
    //   30   69:pop             
    //   31   70:aload           4
    //   32   72:ifnonnull       152
    //   33   75:aload_0         
    //   34   76:iload_1         
    //   35   77:aload_2         
    //   36   78:aload_3         
    //   37   79:invokespecial   #247 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
    //   38   82:astore          4
    //   39   84:getstatic       #26  <Field boolean DEBUG>
    //   40   87:ifeq            116
    //   41   90:ldc1            #11  <String "LoaderManager">
    //   42   92:new             #80  <Class StringBuilder>
    //   43   95:dup             
    //   44   96:invokespecial   #81  <Method void StringBuilder()>
    //   45   99:ldc1            #249 <String "  Created new loader ">
    //   46  101:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   47  104:aload           4
    //   48  106:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   49  109:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   50  112:invokestatic    #105 <Method int Log.v(String, String)>
    //   51  115:pop             
    //   52  116:aload           4
    //   53  118:getfield        #252 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
    //   54  121:ifeq            146
    //   55  124:aload_0         
    //   56  125:getfield        #43  <Field boolean mStarted>
    //   57  128:ifeq            146
    //   58  131:aload           4
    //   59  133:aload           4
    //   60  135:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   61  138:aload           4
    //   62  140:getfield        #256 <Field Object LoaderManagerImpl$LoaderInfo.mData>
    //   63  143:invokevirtual   #260 <Method void LoaderManagerImpl$LoaderInfo.callOnLoadFinished(Loader, Object)>
    //   64  146:aload           4
    //   65  148:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   66  151:areturn         
    //   67  152:getstatic       #26  <Field boolean DEBUG>
    //   68  155:ifeq            185
    //   69  158:ldc1            #11  <String "LoaderManager">
    //   70  160:new             #80  <Class StringBuilder>
    //   71  163:dup             
    //   72  164:invokespecial   #81  <Method void StringBuilder()>
    //   73  167:ldc2            #262 <String "  Re-using existing loader ">
    //   74  170:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   75  173:aload           4
    //   76  175:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   77  178:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   78  181:invokestatic    #105 <Method int Log.v(String, String)>
    //   79  184:pop             
    //   80  185:aload           4
    //   81  187:aload_3         
    //   82  188:putfield        #266 <Field LoaderManager$LoaderCallbacks LoaderManagerImpl$LoaderInfo.mCallbacks>
    //   83  191:goto            116
    }

    void installLoader(LoaderInfo loaderinfo)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field SparseArrayCompat mLoaders>
    //    2    4:aload_1         
    //    3    5:getfield        #270 <Field int LoaderManagerImpl$LoaderInfo.mId>
    //    4    8:aload_1         
    //    5    9:invokevirtual   #274 <Method void SparseArrayCompat.put(int, Object)>
    //    6   12:aload_0         
    //    7   13:getfield        #43  <Field boolean mStarted>
    //    8   16:ifeq            23
    //    9   19:aload_1         
    //   10   20:invokevirtual   #185 <Method void LoaderManagerImpl$LoaderInfo.start()>
    //   11   23:return          
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field boolean mCreatingLoader>
    //    2    4:ifeq            17
    //    3    7:new             #73  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #75  <String "Called while creating a loader">
    //    6   13:invokespecial   #78  <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   10   21:iload_1         
    //   11   22:invokevirtual   #231 <Method Object SparseArrayCompat.get(int)>
    //   12   25:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   13   28:astore          4
    //   14   30:getstatic       #26  <Field boolean DEBUG>
    //   15   33:ifeq            71
    //   16   36:ldc1            #11  <String "LoaderManager">
    //   17   38:new             #80  <Class StringBuilder>
    //   18   41:dup             
    //   19   42:invokespecial   #81  <Method void StringBuilder()>
    //   20   45:ldc2            #277 <String "restartLoader in ">
    //   21   48:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   22   51:aload_0         
    //   23   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   24   55:ldc1            #245 <String ": args=">
    //   25   57:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   26   60:aload_2         
    //   27   61:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   28   64:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   29   67:invokestatic    #105 <Method int Log.v(String, String)>
    //   30   70:pop             
    //   31   71:aload           4
    //   32   73:ifnull          164
    //   33   76:aload_0         
    //   34   77:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   35   80:iload_1         
    //   36   81:invokevirtual   #231 <Method Object SparseArrayCompat.get(int)>
    //   37   84:checkcast       #56  <Class LoaderManagerImpl$LoaderInfo>
    //   38   87:astore          5
    //   39   89:aload           5
    //   40   91:ifnull          309
    //   41   94:aload           4
    //   42   96:getfield        #252 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
    //   43   99:ifeq            175
    //   44  102:getstatic       #26  <Field boolean DEBUG>
    //   45  105:ifeq            135
    //   46  108:ldc1            #11  <String "LoaderManager">
    //   47  110:new             #80  <Class StringBuilder>
    //   48  113:dup             
    //   49  114:invokespecial   #81  <Method void StringBuilder()>
    //   50  117:ldc2            #279 <String "  Removing last inactive loader: ">
    //   51  120:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   52  123:aload           4
    //   53  125:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //   54  128:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   55  131:invokestatic    #105 <Method int Log.v(String, String)>
    //   56  134:pop             
    //   57  135:aload           5
    //   58  137:iconst_0        
    //   59  138:putfield        #239 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
    //   60  141:aload           5
    //   61  143:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   62  146:aload           4
    //   63  148:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   64  151:invokevirtual   #284 <Method void Loader.abandon()>
    //   65  154:aload_0         
    //   66  155:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //   67  158:iload_1         
    //   68  159:aload           4
    //   69  161:invokevirtual   #274 <Method void SparseArrayCompat.put(int, Object)>
    //   70  164:aload_0         
    //   71  165:iload_1         
    //   72  166:aload_2         
    //   73  167:aload_3         
    //   74  168:invokespecial   #247 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
    //   75  171:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //   76  174:areturn         
    //   77  175:aload           4
    //   78  177:getfield        #236 <Field boolean LoaderManagerImpl$LoaderInfo.mStarted>
    //   79  180:ifne            215
    //   80  183:getstatic       #26  <Field boolean DEBUG>
    //   81  186:ifeq            198
    //   82  189:ldc1            #11  <String "LoaderManager">
    //   83  191:ldc2            #286 <String "  Current loader is stopped; replacing">
    //   84  194:invokestatic    #105 <Method int Log.v(String, String)>
    //   85  197:pop             
    //   86  198:aload_0         
    //   87  199:getfield        #35  <Field SparseArrayCompat mLoaders>
    //   88  202:iload_1         
    //   89  203:aconst_null     
    //   90  204:invokevirtual   #274 <Method void SparseArrayCompat.put(int, Object)>
    //   91  207:aload           4
    //   92  209:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //   93  212:goto            164
    //   94  215:aload           4
    //   95  217:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //   96  220:ifnull          273
    //   97  223:getstatic       #26  <Field boolean DEBUG>
    //   98  226:ifeq            259
    //   99  229:ldc1            #11  <String "LoaderManager">
    //  100  231:new             #80  <Class StringBuilder>
    //  101  234:dup             
    //  102  235:invokespecial   #81  <Method void StringBuilder()>
    //  103  238:ldc2            #288 <String "  Removing pending loader: ">
    //  104  241:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //  105  244:aload           4
    //  106  246:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //  107  249:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //  108  252:invokevirtual   #99  <Method String StringBuilder.toString()>
    //  109  255:invokestatic    #105 <Method int Log.v(String, String)>
    //  110  258:pop             
    //  111  259:aload           4
    //  112  261:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //  113  264:invokevirtual   #119 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
    //  114  267:aload           4
    //  115  269:aconst_null     
    //  116  270:putfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //  117  273:getstatic       #26  <Field boolean DEBUG>
    //  118  276:ifeq            288
    //  119  279:ldc1            #11  <String "LoaderManager">
    //  120  281:ldc2            #290 <String "  Enqueuing as new pending loader">
    //  121  284:invokestatic    #105 <Method int Log.v(String, String)>
    //  122  287:pop             
    //  123  288:aload           4
    //  124  290:aload_0         
    //  125  291:iload_1         
    //  126  292:aload_2         
    //  127  293:aload_3         
    //  128  294:invokespecial   #50  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
    //  129  297:putfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //  130  300:aload           4
    //  131  302:getfield        #235 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
    //  132  305:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //  133  308:areturn         
    //  134  309:getstatic       #26  <Field boolean DEBUG>
    //  135  312:ifeq            342
    //  136  315:ldc1            #11  <String "LoaderManager">
    //  137  317:new             #80  <Class StringBuilder>
    //  138  320:dup             
    //  139  321:invokespecial   #81  <Method void StringBuilder()>
    //  140  324:ldc2            #292 <String "  Making last loader inactive: ">
    //  141  327:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //  142  330:aload           4
    //  143  332:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
    //  144  335:invokevirtual   #99  <Method String StringBuilder.toString()>
    //  145  338:invokestatic    #105 <Method int Log.v(String, String)>
    //  146  341:pop             
    //  147  342:aload           4
    //  148  344:getfield        #69  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
    //  149  347:invokevirtual   #284 <Method void Loader.abandon()>
    //  150  350:aload_0         
    //  151  351:getfield        #37  <Field SparseArrayCompat mInactiveLoaders>
    //  152  354:iload_1         
    //  153  355:aload           4
    //  154  357:invokevirtual   #274 <Method void SparseArrayCompat.put(int, Object)>
    //  155  360:goto            164
    }

    public String toString()
    {
    //    0    0:new             #80  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:sipush          128
    //    3    7:invokespecial   #294 <Method void StringBuilder(int)>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ldc2            #296 <String "LoaderManager{">
    //    7   15:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //    8   18:pop             
    //    9   19:aload_1         
    //   10   20:aload_0         
    //   11   21:invokestatic    #302 <Method int System.identityHashCode(Object)>
    //   12   24:invokestatic    #308 <Method String Integer.toHexString(int)>
    //   13   27:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   14   30:pop             
    //   15   31:aload_1         
    //   16   32:ldc2            #310 <String " in ">
    //   17   35:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   18   38:pop             
    //   19   39:aload_0         
    //   20   40:getfield        #41  <Field FragmentActivity mActivity>
    //   21   43:aload_1         
    //   22   44:invokestatic    #316 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //   23   47:aload_1         
    //   24   48:ldc2            #318 <String "}}">
    //   25   51:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
    //   26   54:pop             
    //   27   55:aload_1         
    //   28   56:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   29   59:areturn         
    }

    void updateActivity(FragmentActivity fragmentactivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #41  <Field FragmentActivity mActivity>
    //    3    5:return          
    }

    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;
}
