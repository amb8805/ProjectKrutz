// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    static 
    {
    //    0    0:new             #26  <Class BackStackState$1>
    //    1    3:dup             
    //    2    4:invokespecial   #29  <Method void BackStackState$1()>
    //    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
    //    4   10:return          
    }

    public BackStackState(Parcel parcel)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #33  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokevirtual   #39  <Method int[] Parcel.createIntArray()>
    //    5    9:putfield        #41  <Field int[] mOps>
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:invokevirtual   #45  <Method int Parcel.readInt()>
    //    9   17:putfield        #47  <Field int mTransition>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokevirtual   #45  <Method int Parcel.readInt()>
    //   13   25:putfield        #49  <Field int mTransitionStyle>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokevirtual   #53  <Method String Parcel.readString()>
    //   17   33:putfield        #55  <Field String mName>
    //   18   36:aload_0         
    //   19   37:aload_1         
    //   20   38:invokevirtual   #45  <Method int Parcel.readInt()>
    //   21   41:putfield        #57  <Field int mIndex>
    //   22   44:aload_0         
    //   23   45:aload_1         
    //   24   46:invokevirtual   #45  <Method int Parcel.readInt()>
    //   25   49:putfield        #59  <Field int mBreadCrumbTitleRes>
    //   26   52:aload_0         
    //   27   53:getstatic       #64  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
    //   28   56:aload_1         
    //   29   57:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
    //   30   62:checkcast       #72  <Class CharSequence>
    //   31   65:putfield        #74  <Field CharSequence mBreadCrumbTitleText>
    //   32   68:aload_0         
    //   33   69:aload_1         
    //   34   70:invokevirtual   #45  <Method int Parcel.readInt()>
    //   35   73:putfield        #76  <Field int mBreadCrumbShortTitleRes>
    //   36   76:aload_0         
    //   37   77:getstatic       #64  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
    //   38   80:aload_1         
    //   39   81:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
    //   40   86:checkcast       #72  <Class CharSequence>
    //   41   89:putfield        #78  <Field CharSequence mBreadCrumbShortTitleText>
    //   42   92:return          
    }

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #33  <Method void Object()>
    //    2    4:iconst_0        
    //    3    5:istore_3        
    //    4    6:aload_2         
    //    5    7:getfield        #85  <Field BackStackRecord$Op BackStackRecord.mHead>
    //    6   10:astore          4
    //    7   12:aload           4
    //    8   14:ifnull          46
    //    9   17:aload           4
    //   10   19:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //   11   22:ifnull          36
    //   12   25:iload_3         
    //   13   26:aload           4
    //   14   28:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //   15   31:invokevirtual   #96  <Method int ArrayList.size()>
    //   16   34:iadd            
    //   17   35:istore_3        
    //   18   36:aload           4
    //   19   38:getfield        #99  <Field BackStackRecord$Op BackStackRecord$Op.next>
    //   20   41:astore          4
    //   21   43:goto            12
    //   22   46:aload_0         
    //   23   47:iload_3         
    //   24   48:bipush          7
    //   25   50:aload_2         
    //   26   51:getfield        #102 <Field int BackStackRecord.mNumOp>
    //   27   54:imul            
    //   28   55:iadd            
    //   29   56:newarray        int[]
    //   30   58:putfield        #41  <Field int[] mOps>
    //   31   61:aload_2         
    //   32   62:getfield        #106 <Field boolean BackStackRecord.mAddToBackStack>
    //   33   65:ifne            78
    //   34   68:new             #108 <Class IllegalStateException>
    //   35   71:dup             
    //   36   72:ldc1            #110 <String "Not on back stack">
    //   37   74:invokespecial   #113 <Method void IllegalStateException(String)>
    //   38   77:athrow          
    //   39   78:aload_2         
    //   40   79:getfield        #85  <Field BackStackRecord$Op BackStackRecord.mHead>
    //   41   82:astore          5
    //   42   84:iconst_0        
    //   43   85:istore          6
    //   44   87:aload           5
    //   45   89:ifnull          378
    //   46   92:aload_0         
    //   47   93:getfield        #41  <Field int[] mOps>
    //   48   96:astore          7
    //   49   98:iload           6
    //   50  100:iconst_1        
    //   51  101:iadd            
    //   52  102:istore          8
    //   53  104:aload           7
    //   54  106:iload           6
    //   55  108:aload           5
    //   56  110:getfield        #116 <Field int BackStackRecord$Op.cmd>
    //   57  113:iastore         
    //   58  114:aload_0         
    //   59  115:getfield        #41  <Field int[] mOps>
    //   60  118:astore          9
    //   61  120:iload           8
    //   62  122:iconst_1        
    //   63  123:iadd            
    //   64  124:istore          10
    //   65  126:aload           5
    //   66  128:getfield        #120 <Field Fragment BackStackRecord$Op.fragment>
    //   67  131:ifnull          333
    //   68  134:aload           5
    //   69  136:getfield        #120 <Field Fragment BackStackRecord$Op.fragment>
    //   70  139:getfield        #123 <Field int Fragment.mIndex>
    //   71  142:istore          11
    //   72  144:aload           9
    //   73  146:iload           8
    //   74  148:iload           11
    //   75  150:iastore         
    //   76  151:aload_0         
    //   77  152:getfield        #41  <Field int[] mOps>
    //   78  155:astore          12
    //   79  157:iload           10
    //   80  159:iconst_1        
    //   81  160:iadd            
    //   82  161:istore          13
    //   83  163:aload           12
    //   84  165:iload           10
    //   85  167:aload           5
    //   86  169:getfield        #126 <Field int BackStackRecord$Op.enterAnim>
    //   87  172:iastore         
    //   88  173:aload_0         
    //   89  174:getfield        #41  <Field int[] mOps>
    //   90  177:astore          14
    //   91  179:iload           13
    //   92  181:iconst_1        
    //   93  182:iadd            
    //   94  183:istore          15
    //   95  185:aload           14
    //   96  187:iload           13
    //   97  189:aload           5
    //   98  191:getfield        #129 <Field int BackStackRecord$Op.exitAnim>
    //   99  194:iastore         
    //  100  195:aload_0         
    //  101  196:getfield        #41  <Field int[] mOps>
    //  102  199:astore          16
    //  103  201:iload           15
    //  104  203:iconst_1        
    //  105  204:iadd            
    //  106  205:istore          17
    //  107  207:aload           16
    //  108  209:iload           15
    //  109  211:aload           5
    //  110  213:getfield        #132 <Field int BackStackRecord$Op.popEnterAnim>
    //  111  216:iastore         
    //  112  217:aload_0         
    //  113  218:getfield        #41  <Field int[] mOps>
    //  114  221:astore          18
    //  115  223:iload           17
    //  116  225:iconst_1        
    //  117  226:iadd            
    //  118  227:istore          19
    //  119  229:aload           18
    //  120  231:iload           17
    //  121  233:aload           5
    //  122  235:getfield        #135 <Field int BackStackRecord$Op.popExitAnim>
    //  123  238:iastore         
    //  124  239:aload           5
    //  125  241:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //  126  244:ifnull          357
    //  127  247:aload           5
    //  128  249:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //  129  252:invokevirtual   #96  <Method int ArrayList.size()>
    //  130  255:istore          22
    //  131  257:aload_0         
    //  132  258:getfield        #41  <Field int[] mOps>
    //  133  261:astore          23
    //  134  263:iload           19
    //  135  265:iconst_1        
    //  136  266:iadd            
    //  137  267:istore          24
    //  138  269:aload           23
    //  139  271:iload           19
    //  140  273:iload           22
    //  141  275:iastore         
    //  142  276:iconst_0        
    //  143  277:istore          25
    //  144  279:iload           24
    //  145  281:istore          26
    //  146  283:iload           25
    //  147  285:iload           22
    //  148  287:icmpge          339
    //  149  290:aload_0         
    //  150  291:getfield        #41  <Field int[] mOps>
    //  151  294:astore          27
    //  152  296:iload           26
    //  153  298:iconst_1        
    //  154  299:iadd            
    //  155  300:istore          28
    //  156  302:aload           27
    //  157  304:iload           26
    //  158  306:aload           5
    //  159  308:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //  160  311:iload           25
    //  161  313:invokevirtual   #139 <Method Object ArrayList.get(int)>
    //  162  316:checkcast       #122 <Class Fragment>
    //  163  319:getfield        #123 <Field int Fragment.mIndex>
    //  164  322:iastore         
    //  165  323:iinc            25  1
    //  166  326:iload           28
    //  167  328:istore          26
    //  168  330:goto            283
    //  169  333:iconst_m1       
    //  170  334:istore          11
    //  171  336:goto            144
    //  172  339:iload           26
    //  173  341:istore          21
    //  174  343:aload           5
    //  175  345:getfield        #99  <Field BackStackRecord$Op BackStackRecord$Op.next>
    //  176  348:astore          5
    //  177  350:iload           21
    //  178  352:istore          6
    //  179  354:goto            87
    //  180  357:aload_0         
    //  181  358:getfield        #41  <Field int[] mOps>
    //  182  361:astore          20
    //  183  363:iload           19
    //  184  365:iconst_1        
    //  185  366:iadd            
    //  186  367:istore          21
    //  187  369:aload           20
    //  188  371:iload           19
    //  189  373:iconst_0        
    //  190  374:iastore         
    //  191  375:goto            343
    //  192  378:aload_0         
    //  193  379:aload_2         
    //  194  380:getfield        #140 <Field int BackStackRecord.mTransition>
    //  195  383:putfield        #47  <Field int mTransition>
    //  196  386:aload_0         
    //  197  387:aload_2         
    //  198  388:getfield        #141 <Field int BackStackRecord.mTransitionStyle>
    //  199  391:putfield        #49  <Field int mTransitionStyle>
    //  200  394:aload_0         
    //  201  395:aload_2         
    //  202  396:getfield        #142 <Field String BackStackRecord.mName>
    //  203  399:putfield        #55  <Field String mName>
    //  204  402:aload_0         
    //  205  403:aload_2         
    //  206  404:getfield        #143 <Field int BackStackRecord.mIndex>
    //  207  407:putfield        #57  <Field int mIndex>
    //  208  410:aload_0         
    //  209  411:aload_2         
    //  210  412:getfield        #144 <Field int BackStackRecord.mBreadCrumbTitleRes>
    //  211  415:putfield        #59  <Field int mBreadCrumbTitleRes>
    //  212  418:aload_0         
    //  213  419:aload_2         
    //  214  420:getfield        #145 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
    //  215  423:putfield        #74  <Field CharSequence mBreadCrumbTitleText>
    //  216  426:aload_0         
    //  217  427:aload_2         
    //  218  428:getfield        #146 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
    //  219  431:putfield        #76  <Field int mBreadCrumbShortTitleRes>
    //  220  434:aload_0         
    //  221  435:aload_2         
    //  222  436:getfield        #147 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
    //  223  439:putfield        #78  <Field CharSequence mBreadCrumbShortTitleText>
    //  224  442:return          
    }

    public int describeContents()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
    {
    //    0    0:new             #81  <Class BackStackRecord>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #153 <Method void BackStackRecord(FragmentManagerImpl)>
    //    4    8:astore_2        
    //    5    9:iconst_0        
    //    6   10:istore_3        
    //    7   11:iconst_0        
    //    8   12:istore          4
    //    9   14:iload_3         
    //   10   15:aload_0         
    //   11   16:getfield        #41  <Field int[] mOps>
    //   12   19:arraylength     
    //   13   20:icmpge          409
    //   14   23:new             #87  <Class BackStackRecord$Op>
    //   15   26:dup             
    //   16   27:invokespecial   #154 <Method void BackStackRecord$Op()>
    //   17   30:astore          5
    //   18   32:aload_0         
    //   19   33:getfield        #41  <Field int[] mOps>
    //   20   36:astore          6
    //   21   38:iload_3         
    //   22   39:iconst_1        
    //   23   40:iadd            
    //   24   41:istore          7
    //   25   43:aload           5
    //   26   45:aload           6
    //   27   47:iload_3         
    //   28   48:iaload          
    //   29   49:putfield        #116 <Field int BackStackRecord$Op.cmd>
    //   30   52:getstatic       #159 <Field boolean FragmentManagerImpl.DEBUG>
    //   31   55:ifeq            108
    //   32   58:ldc1            #161 <String "FragmentManager">
    //   33   60:new             #163 <Class StringBuilder>
    //   34   63:dup             
    //   35   64:invokespecial   #164 <Method void StringBuilder()>
    //   36   67:ldc1            #166 <String "Instantiate ">
    //   37   69:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
    //   38   72:aload_2         
    //   39   73:invokevirtual   #173 <Method StringBuilder StringBuilder.append(Object)>
    //   40   76:ldc1            #175 <String " op #">
    //   41   78:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
    //   42   81:iload           4
    //   43   83:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
    //   44   86:ldc1            #180 <String " base fragment #">
    //   45   88:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
    //   46   91:aload_0         
    //   47   92:getfield        #41  <Field int[] mOps>
    //   48   95:iload           7
    //   49   97:iaload          
    //   50   98:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
    //   51  101:invokevirtual   #183 <Method String StringBuilder.toString()>
    //   52  104:invokestatic    #189 <Method int Log.v(String, String)>
    //   53  107:pop             
    //   54  108:aload_0         
    //   55  109:getfield        #41  <Field int[] mOps>
    //   56  112:astore          8
    //   57  114:iload           7
    //   58  116:iconst_1        
    //   59  117:iadd            
    //   60  118:istore          9
    //   61  120:aload           8
    //   62  122:iload           7
    //   63  124:iaload          
    //   64  125:istore          10
    //   65  127:iload           10
    //   66  129:iflt            385
    //   67  132:aload           5
    //   68  134:aload_1         
    //   69  135:getfield        #192 <Field ArrayList FragmentManagerImpl.mActive>
    //   70  138:iload           10
    //   71  140:invokevirtual   #139 <Method Object ArrayList.get(int)>
    //   72  143:checkcast       #122 <Class Fragment>
    //   73  146:putfield        #120 <Field Fragment BackStackRecord$Op.fragment>
    //   74  149:aload_0         
    //   75  150:getfield        #41  <Field int[] mOps>
    //   76  153:astore          11
    //   77  155:iload           9
    //   78  157:iconst_1        
    //   79  158:iadd            
    //   80  159:istore          12
    //   81  161:aload           5
    //   82  163:aload           11
    //   83  165:iload           9
    //   84  167:iaload          
    //   85  168:putfield        #126 <Field int BackStackRecord$Op.enterAnim>
    //   86  171:aload_0         
    //   87  172:getfield        #41  <Field int[] mOps>
    //   88  175:astore          13
    //   89  177:iload           12
    //   90  179:iconst_1        
    //   91  180:iadd            
    //   92  181:istore          14
    //   93  183:aload           5
    //   94  185:aload           13
    //   95  187:iload           12
    //   96  189:iaload          
    //   97  190:putfield        #129 <Field int BackStackRecord$Op.exitAnim>
    //   98  193:aload_0         
    //   99  194:getfield        #41  <Field int[] mOps>
    //  100  197:astore          15
    //  101  199:iload           14
    //  102  201:iconst_1        
    //  103  202:iadd            
    //  104  203:istore          16
    //  105  205:aload           5
    //  106  207:aload           15
    //  107  209:iload           14
    //  108  211:iaload          
    //  109  212:putfield        #132 <Field int BackStackRecord$Op.popEnterAnim>
    //  110  215:aload_0         
    //  111  216:getfield        #41  <Field int[] mOps>
    //  112  219:astore          17
    //  113  221:iload           16
    //  114  223:iconst_1        
    //  115  224:iadd            
    //  116  225:istore          18
    //  117  227:aload           5
    //  118  229:aload           17
    //  119  231:iload           16
    //  120  233:iaload          
    //  121  234:putfield        #135 <Field int BackStackRecord$Op.popExitAnim>
    //  122  237:aload_0         
    //  123  238:getfield        #41  <Field int[] mOps>
    //  124  241:astore          19
    //  125  243:iload           18
    //  126  245:iconst_1        
    //  127  246:iadd            
    //  128  247:istore          20
    //  129  249:aload           19
    //  130  251:iload           18
    //  131  253:iaload          
    //  132  254:istore          21
    //  133  256:iload           21
    //  134  258:ifle            394
    //  135  261:aload           5
    //  136  263:new             #93  <Class ArrayList>
    //  137  266:dup             
    //  138  267:iload           21
    //  139  269:invokespecial   #195 <Method void ArrayList(int)>
    //  140  272:putfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //  141  275:iconst_0        
    //  142  276:istore          22
    //  143  278:iload           22
    //  144  280:iload           21
    //  145  282:icmpge          394
    //  146  285:getstatic       #159 <Field boolean FragmentManagerImpl.DEBUG>
    //  147  288:ifeq            331
    //  148  291:ldc1            #161 <String "FragmentManager">
    //  149  293:new             #163 <Class StringBuilder>
    //  150  296:dup             
    //  151  297:invokespecial   #164 <Method void StringBuilder()>
    //  152  300:ldc1            #166 <String "Instantiate ">
    //  153  302:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
    //  154  305:aload_2         
    //  155  306:invokevirtual   #173 <Method StringBuilder StringBuilder.append(Object)>
    //  156  309:ldc1            #197 <String " set remove fragment #">
    //  157  311:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
    //  158  314:aload_0         
    //  159  315:getfield        #41  <Field int[] mOps>
    //  160  318:iload           20
    //  161  320:iaload          
    //  162  321:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
    //  163  324:invokevirtual   #183 <Method String StringBuilder.toString()>
    //  164  327:invokestatic    #189 <Method int Log.v(String, String)>
    //  165  330:pop             
    //  166  331:aload_1         
    //  167  332:getfield        #192 <Field ArrayList FragmentManagerImpl.mActive>
    //  168  335:astore          23
    //  169  337:aload_0         
    //  170  338:getfield        #41  <Field int[] mOps>
    //  171  341:astore          24
    //  172  343:iload           20
    //  173  345:iconst_1        
    //  174  346:iadd            
    //  175  347:istore          25
    //  176  349:aload           23
    //  177  351:aload           24
    //  178  353:iload           20
    //  179  355:iaload          
    //  180  356:invokevirtual   #139 <Method Object ArrayList.get(int)>
    //  181  359:checkcast       #122 <Class Fragment>
    //  182  362:astore          26
    //  183  364:aload           5
    //  184  366:getfield        #91  <Field ArrayList BackStackRecord$Op.removed>
    //  185  369:aload           26
    //  186  371:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
    //  187  374:pop             
    //  188  375:iinc            22  1
    //  189  378:iload           25
    //  190  380:istore          20
    //  191  382:goto            278
    //  192  385:aload           5
    //  193  387:aconst_null     
    //  194  388:putfield        #120 <Field Fragment BackStackRecord$Op.fragment>
    //  195  391:goto            149
    //  196  394:iload           20
    //  197  396:istore_3        
    //  198  397:aload_2         
    //  199  398:aload           5
    //  200  400:invokevirtual   #205 <Method void BackStackRecord.addOp(BackStackRecord$Op)>
    //  201  403:iinc            4  1
    //  202  406:goto            14
    //  203  409:aload_2         
    //  204  410:aload_0         
    //  205  411:getfield        #47  <Field int mTransition>
    //  206  414:putfield        #140 <Field int BackStackRecord.mTransition>
    //  207  417:aload_2         
    //  208  418:aload_0         
    //  209  419:getfield        #49  <Field int mTransitionStyle>
    //  210  422:putfield        #141 <Field int BackStackRecord.mTransitionStyle>
    //  211  425:aload_2         
    //  212  426:aload_0         
    //  213  427:getfield        #55  <Field String mName>
    //  214  430:putfield        #142 <Field String BackStackRecord.mName>
    //  215  433:aload_2         
    //  216  434:aload_0         
    //  217  435:getfield        #57  <Field int mIndex>
    //  218  438:putfield        #143 <Field int BackStackRecord.mIndex>
    //  219  441:aload_2         
    //  220  442:iconst_1        
    //  221  443:putfield        #106 <Field boolean BackStackRecord.mAddToBackStack>
    //  222  446:aload_2         
    //  223  447:aload_0         
    //  224  448:getfield        #59  <Field int mBreadCrumbTitleRes>
    //  225  451:putfield        #144 <Field int BackStackRecord.mBreadCrumbTitleRes>
    //  226  454:aload_2         
    //  227  455:aload_0         
    //  228  456:getfield        #74  <Field CharSequence mBreadCrumbTitleText>
    //  229  459:putfield        #145 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
    //  230  462:aload_2         
    //  231  463:aload_0         
    //  232  464:getfield        #76  <Field int mBreadCrumbShortTitleRes>
    //  233  467:putfield        #146 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
    //  234  470:aload_2         
    //  235  471:aload_0         
    //  236  472:getfield        #78  <Field CharSequence mBreadCrumbShortTitleText>
    //  237  475:putfield        #147 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
    //  238  478:aload_2         
    //  239  479:iconst_1        
    //  240  480:invokevirtual   #208 <Method void BackStackRecord.bumpBackStackNesting(int)>
    //  241  483:aload_2         
    //  242  484:areturn         
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #41  <Field int[] mOps>
    //    3    5:invokevirtual   #214 <Method void Parcel.writeIntArray(int[])>
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #47  <Field int mTransition>
    //    7   13:invokevirtual   #217 <Method void Parcel.writeInt(int)>
    //    8   16:aload_1         
    //    9   17:aload_0         
    //   10   18:getfield        #49  <Field int mTransitionStyle>
    //   11   21:invokevirtual   #217 <Method void Parcel.writeInt(int)>
    //   12   24:aload_1         
    //   13   25:aload_0         
    //   14   26:getfield        #55  <Field String mName>
    //   15   29:invokevirtual   #220 <Method void Parcel.writeString(String)>
    //   16   32:aload_1         
    //   17   33:aload_0         
    //   18   34:getfield        #57  <Field int mIndex>
    //   19   37:invokevirtual   #217 <Method void Parcel.writeInt(int)>
    //   20   40:aload_1         
    //   21   41:aload_0         
    //   22   42:getfield        #59  <Field int mBreadCrumbTitleRes>
    //   23   45:invokevirtual   #217 <Method void Parcel.writeInt(int)>
    //   24   48:aload_0         
    //   25   49:getfield        #74  <Field CharSequence mBreadCrumbTitleText>
    //   26   52:aload_1         
    //   27   53:iconst_0        
    //   28   54:invokestatic    #223 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
    //   29   57:aload_1         
    //   30   58:aload_0         
    //   31   59:getfield        #76  <Field int mBreadCrumbShortTitleRes>
    //   32   62:invokevirtual   #217 <Method void Parcel.writeInt(int)>
    //   33   65:aload_0         
    //   34   66:getfield        #78  <Field CharSequence mBreadCrumbShortTitleText>
    //   35   69:aload_1         
    //   36   70:iconst_0        
    //   37   71:invokestatic    #223 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
    //   38   74:return          
    }

    public static final android.os.Parcelable.Creator CREATOR;
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int mOps[];
    final int mTransition;
    final int mTransitionStyle;

    // Unreferenced inner class android/support/v4/app/BackStackState$1

/* anonymous class */
    static final class _cls1
        implements android.os.Parcelable.Creator
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public BackStackState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class BackStackState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #18  <Method void BackStackState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method BackStackState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public BackStackState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       BackStackState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method BackStackState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
