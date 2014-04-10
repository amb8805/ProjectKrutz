// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.*;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            LoaderManagerImpl, FragmentManagerImpl, FragmentActivity, SuperNotCalledException, 
//            FragmentManager, LoaderManager, FragmentContainer

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{
    public static class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s, Exception exception)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #9   <Method void RuntimeException(String, Throwable)>
        //    4    6:return          
        }
    }

    public static class SavedState
        implements Parcelable
    {

        static 
        {
        //    0    0:new             #15  <Class Fragment$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #18  <Method void Fragment$SavedState$1()>
        //    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        SavedState(Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #24  <Field Bundle mState>
        //    5    9:return          
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #31  <Method Bundle Parcel.readBundle()>
        //    5    9:putfield        #24  <Field Bundle mState>
        //    6   12:aload_2         
        //    7   13:ifnull          31
        //    8   16:aload_0         
        //    9   17:getfield        #24  <Field Bundle mState>
        //   10   20:ifnull          31
        //   11   23:aload_0         
        //   12   24:getfield        #24  <Field Bundle mState>
        //   13   27:aload_2         
        //   14   28:invokevirtual   #37  <Method void Bundle.setClassLoader(ClassLoader)>
        //   15   31:return          
        }

        public int describeContents()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #24  <Field Bundle mState>
        //    3    5:invokevirtual   #44  <Method void Parcel.writeBundle(Bundle)>
        //    4    8:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        final Bundle mState;
    }


    static 
    {
    //    0    0:new             #80  <Class SimpleArrayMap>
    //    1    3:dup             
    //    2    4:invokespecial   #83  <Method void SimpleArrayMap()>
    //    3    7:putstatic       #85  <Field SimpleArrayMap sClassMap>
    //    4   10:return          
    }

    public Fragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #86  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #88  <Field int mState>
    //    5    9:aload_0         
    //    6   10:iconst_m1       
    //    7   11:putfield        #90  <Field int mIndex>
    //    8   14:aload_0         
    //    9   15:iconst_m1       
    //   10   16:putfield        #92  <Field int mTargetIndex>
    //   11   19:aload_0         
    //   12   20:iconst_1        
    //   13   21:putfield        #94  <Field boolean mMenuVisible>
    //   14   24:aload_0         
    //   15   25:iconst_1        
    //   16   26:putfield        #96  <Field boolean mUserVisibleHint>
    //   17   29:return          
    }

    public static Fragment instantiate(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokestatic    #101 <Method Fragment instantiate(Context, String, Bundle)>
    //    4    6:areturn         
    }

    public static Fragment instantiate(Context context, String s, Bundle bundle)
    {
    // try 0 12 handler(s) 72 113 154
    //    0    0:getstatic       #85  <Field SimpleArrayMap sClassMap>
    //    1    3:aload_1         
    //    2    4:invokevirtual   #111 <Method Object SimpleArrayMap.get(Object)>
    //    3    7:checkcast       #113 <Class Class>
    //    4   10:astore          6
    //    5   12:aload           6
    //    6   14:ifnonnull       37
    // try 17 37 handler(s) 72 113 154
    //    7   17:aload_0         
    //    8   18:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
    //    9   21:aload_1         
    //   10   22:invokevirtual   #125 <Method Class ClassLoader.loadClass(String)>
    //   11   25:astore          6
    //   12   27:getstatic       #85  <Field SimpleArrayMap sClassMap>
    //   13   30:aload_1         
    //   14   31:aload           6
    //   15   33:invokevirtual   #129 <Method Object SimpleArrayMap.put(Object, Object)>
    //   16   36:pop             
    // try 37 47 handler(s) 72 113 154
    //   17   37:aload           6
    //   18   39:invokevirtual   #133 <Method Object Class.newInstance()>
    //   19   42:checkcast       #2   <Class Fragment>
    //   20   45:astore          8
    //   21   47:aload_2         
    //   22   48:ifnull          69
    // try 51 69 handler(s) 72 113 154
    //   23   51:aload_2         
    //   24   52:aload           8
    //   25   54:invokevirtual   #137 <Method Class Object.getClass()>
    //   26   57:invokevirtual   #138 <Method ClassLoader Class.getClassLoader()>
    //   27   60:invokevirtual   #144 <Method void Bundle.setClassLoader(ClassLoader)>
    //   28   63:aload           8
    //   29   65:aload_2         
    //   30   66:putfield        #146 <Field Bundle mArguments>
    //   31   69:aload           8
    //   32   71:areturn         
    // catch ClassNotFoundException ClassNotFoundException ClassNotFoundException ClassNotFoundException
    //   33   72:astore          5
    //   34   74:new             #148 <Class Fragment$InstantiationException>
    //   35   77:dup             
    //   36   78:new             #150 <Class StringBuilder>
    //   37   81:dup             
    //   38   82:invokespecial   #151 <Method void StringBuilder()>
    //   39   85:ldc1            #153 <String "Unable to instantiate fragment ">
    //   40   87:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   41   90:aload_1         
    //   42   91:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   43   94:ldc1            #159 <String ": make sure class name exists, is public, and has an">
    //   44   96:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   45   99:ldc1            #161 <String " empty constructor that is public">
    //   46  101:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   47  104:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   48  107:aload           5
    //   49  109:invokespecial   #168 <Method void Fragment$InstantiationException(String, Exception)>
    //   50  112:athrow          
    // catch java.lang.InstantiationException java.lang.InstantiationException java.lang.InstantiationException java.lang.InstantiationException
    //   51  113:astore          4
    //   52  115:new             #148 <Class Fragment$InstantiationException>
    //   53  118:dup             
    //   54  119:new             #150 <Class StringBuilder>
    //   55  122:dup             
    //   56  123:invokespecial   #151 <Method void StringBuilder()>
    //   57  126:ldc1            #153 <String "Unable to instantiate fragment ">
    //   58  128:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   59  131:aload_1         
    //   60  132:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   61  135:ldc1            #159 <String ": make sure class name exists, is public, and has an">
    //   62  137:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   63  140:ldc1            #161 <String " empty constructor that is public">
    //   64  142:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   65  145:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   66  148:aload           4
    //   67  150:invokespecial   #168 <Method void Fragment$InstantiationException(String, Exception)>
    //   68  153:athrow          
    // catch IllegalAccessException IllegalAccessException IllegalAccessException IllegalAccessException
    //   69  154:astore_3        
    //   70  155:new             #148 <Class Fragment$InstantiationException>
    //   71  158:dup             
    //   72  159:new             #150 <Class StringBuilder>
    //   73  162:dup             
    //   74  163:invokespecial   #151 <Method void StringBuilder()>
    //   75  166:ldc1            #153 <String "Unable to instantiate fragment ">
    //   76  168:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   77  171:aload_1         
    //   78  172:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   79  175:ldc1            #159 <String ": make sure class name exists, is public, and has an">
    //   80  177:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   81  180:ldc1            #161 <String " empty constructor that is public">
    //   82  182:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   83  185:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   84  188:aload_3         
    //   85  189:invokespecial   #168 <Method void Fragment$InstantiationException(String, Exception)>
    //   86  192:athrow          
    }

    static boolean isSupportFragmentClass(Context context, String s)
    {
    // try 0 11 handler(s) 44
    //    0    0:getstatic       #85  <Field SimpleArrayMap sClassMap>
    //    1    3:aload_1         
    //    2    4:invokevirtual   #111 <Method Object SimpleArrayMap.get(Object)>
    //    3    7:checkcast       #113 <Class Class>
    //    4   10:astore_3        
    //    5   11:aload_3         
    //    6   12:ifnonnull       33
    // try 15 33 handler(s) 44
    //    7   15:aload_0         
    //    8   16:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
    //    9   19:aload_1         
    //   10   20:invokevirtual   #125 <Method Class ClassLoader.loadClass(String)>
    //   11   23:astore_3        
    //   12   24:getstatic       #85  <Field SimpleArrayMap sClassMap>
    //   13   27:aload_1         
    //   14   28:aload_3         
    //   15   29:invokevirtual   #129 <Method Object SimpleArrayMap.put(Object, Object)>
    //   16   32:pop             
    // try 33 41 handler(s) 44
    //   17   33:ldc1            #2   <Class Fragment>
    //   18   35:aload_3         
    //   19   36:invokevirtual   #174 <Method boolean Class.isAssignableFrom(Class)>
    //   20   39:istore          5
    //   21   41:iload           5
    //   22   43:ireturn         
    // catch ClassNotFoundException ClassNotFoundException ClassNotFoundException
    //   23   44:astore_2        
    //   24   45:iconst_0        
    //   25   46:ireturn         
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_3         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //    3    5:aload_3         
    //    4    6:ldc1            #184 <String "mFragmentId=#">
    //    5    8:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //    6   11:aload_3         
    //    7   12:aload_0         
    //    8   13:getfield        #186 <Field int mFragmentId>
    //    9   16:invokestatic    #192 <Method String Integer.toHexString(int)>
    //   10   19:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   11   22:aload_3         
    //   12   23:ldc1            #194 <String " mContainerId=#">
    //   13   25:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   14   28:aload_3         
    //   15   29:aload_0         
    //   16   30:getfield        #196 <Field int mContainerId>
    //   17   33:invokestatic    #192 <Method String Integer.toHexString(int)>
    //   18   36:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   19   39:aload_3         
    //   20   40:ldc1            #198 <String " mTag=">
    //   21   42:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   22   45:aload_3         
    //   23   46:aload_0         
    //   24   47:getfield        #200 <Field String mTag>
    //   25   50:invokevirtual   #203 <Method void PrintWriter.println(String)>
    //   26   53:aload_3         
    //   27   54:aload_1         
    //   28   55:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   29   58:aload_3         
    //   30   59:ldc1            #205 <String "mState=">
    //   31   61:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   32   64:aload_3         
    //   33   65:aload_0         
    //   34   66:getfield        #88  <Field int mState>
    //   35   69:invokevirtual   #208 <Method void PrintWriter.print(int)>
    //   36   72:aload_3         
    //   37   73:ldc1            #210 <String " mIndex=">
    //   38   75:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   39   78:aload_3         
    //   40   79:aload_0         
    //   41   80:getfield        #90  <Field int mIndex>
    //   42   83:invokevirtual   #208 <Method void PrintWriter.print(int)>
    //   43   86:aload_3         
    //   44   87:ldc1            #212 <String " mWho=">
    //   45   89:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   46   92:aload_3         
    //   47   93:aload_0         
    //   48   94:getfield        #214 <Field String mWho>
    //   49   97:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   50  100:aload_3         
    //   51  101:ldc1            #216 <String " mBackStackNesting=">
    //   52  103:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   53  106:aload_3         
    //   54  107:aload_0         
    //   55  108:getfield        #218 <Field int mBackStackNesting>
    //   56  111:invokevirtual   #220 <Method void PrintWriter.println(int)>
    //   57  114:aload_3         
    //   58  115:aload_1         
    //   59  116:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   60  119:aload_3         
    //   61  120:ldc1            #222 <String "mAdded=">
    //   62  122:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   63  125:aload_3         
    //   64  126:aload_0         
    //   65  127:getfield        #224 <Field boolean mAdded>
    //   66  130:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //   67  133:aload_3         
    //   68  134:ldc1            #229 <String " mRemoving=">
    //   69  136:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   70  139:aload_3         
    //   71  140:aload_0         
    //   72  141:getfield        #231 <Field boolean mRemoving>
    //   73  144:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //   74  147:aload_3         
    //   75  148:ldc1            #233 <String " mResumed=">
    //   76  150:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   77  153:aload_3         
    //   78  154:aload_0         
    //   79  155:getfield        #235 <Field boolean mResumed>
    //   80  158:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //   81  161:aload_3         
    //   82  162:ldc1            #237 <String " mFromLayout=">
    //   83  164:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   84  167:aload_3         
    //   85  168:aload_0         
    //   86  169:getfield        #239 <Field boolean mFromLayout>
    //   87  172:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //   88  175:aload_3         
    //   89  176:ldc1            #241 <String " mInLayout=">
    //   90  178:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   91  181:aload_3         
    //   92  182:aload_0         
    //   93  183:getfield        #243 <Field boolean mInLayout>
    //   94  186:invokevirtual   #245 <Method void PrintWriter.println(boolean)>
    //   95  189:aload_3         
    //   96  190:aload_1         
    //   97  191:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //   98  194:aload_3         
    //   99  195:ldc1            #247 <String "mHidden=">
    //  100  197:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  101  200:aload_3         
    //  102  201:aload_0         
    //  103  202:getfield        #249 <Field boolean mHidden>
    //  104  205:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //  105  208:aload_3         
    //  106  209:ldc1            #251 <String " mDetached=">
    //  107  211:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  108  214:aload_3         
    //  109  215:aload_0         
    //  110  216:getfield        #253 <Field boolean mDetached>
    //  111  219:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //  112  222:aload_3         
    //  113  223:ldc1            #255 <String " mMenuVisible=">
    //  114  225:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  115  228:aload_3         
    //  116  229:aload_0         
    //  117  230:getfield        #94  <Field boolean mMenuVisible>
    //  118  233:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //  119  236:aload_3         
    //  120  237:ldc2            #257 <String " mHasMenu=">
    //  121  240:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  122  243:aload_3         
    //  123  244:aload_0         
    //  124  245:getfield        #259 <Field boolean mHasMenu>
    //  125  248:invokevirtual   #245 <Method void PrintWriter.println(boolean)>
    //  126  251:aload_3         
    //  127  252:aload_1         
    //  128  253:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  129  256:aload_3         
    //  130  257:ldc2            #261 <String "mRetainInstance=">
    //  131  260:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  132  263:aload_3         
    //  133  264:aload_0         
    //  134  265:getfield        #263 <Field boolean mRetainInstance>
    //  135  268:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //  136  271:aload_3         
    //  137  272:ldc2            #265 <String " mRetaining=">
    //  138  275:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  139  278:aload_3         
    //  140  279:aload_0         
    //  141  280:getfield        #267 <Field boolean mRetaining>
    //  142  283:invokevirtual   #227 <Method void PrintWriter.print(boolean)>
    //  143  286:aload_3         
    //  144  287:ldc2            #269 <String " mUserVisibleHint=">
    //  145  290:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  146  293:aload_3         
    //  147  294:aload_0         
    //  148  295:getfield        #96  <Field boolean mUserVisibleHint>
    //  149  298:invokevirtual   #245 <Method void PrintWriter.println(boolean)>
    //  150  301:aload_0         
    //  151  302:getfield        #271 <Field FragmentManagerImpl mFragmentManager>
    //  152  305:ifnull          328
    //  153  308:aload_3         
    //  154  309:aload_1         
    //  155  310:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  156  313:aload_3         
    //  157  314:ldc2            #273 <String "mFragmentManager=">
    //  158  317:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  159  320:aload_3         
    //  160  321:aload_0         
    //  161  322:getfield        #271 <Field FragmentManagerImpl mFragmentManager>
    //  162  325:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  163  328:aload_0         
    //  164  329:getfield        #278 <Field FragmentActivity mActivity>
    //  165  332:ifnull          355
    //  166  335:aload_3         
    //  167  336:aload_1         
    //  168  337:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  169  340:aload_3         
    //  170  341:ldc2            #280 <String "mActivity=">
    //  171  344:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  172  347:aload_3         
    //  173  348:aload_0         
    //  174  349:getfield        #278 <Field FragmentActivity mActivity>
    //  175  352:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  176  355:aload_0         
    //  177  356:getfield        #282 <Field Fragment mParentFragment>
    //  178  359:ifnull          382
    //  179  362:aload_3         
    //  180  363:aload_1         
    //  181  364:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  182  367:aload_3         
    //  183  368:ldc2            #284 <String "mParentFragment=">
    //  184  371:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  185  374:aload_3         
    //  186  375:aload_0         
    //  187  376:getfield        #282 <Field Fragment mParentFragment>
    //  188  379:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  189  382:aload_0         
    //  190  383:getfield        #146 <Field Bundle mArguments>
    //  191  386:ifnull          409
    //  192  389:aload_3         
    //  193  390:aload_1         
    //  194  391:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  195  394:aload_3         
    //  196  395:ldc2            #286 <String "mArguments=">
    //  197  398:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  198  401:aload_3         
    //  199  402:aload_0         
    //  200  403:getfield        #146 <Field Bundle mArguments>
    //  201  406:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  202  409:aload_0         
    //  203  410:getfield        #288 <Field Bundle mSavedFragmentState>
    //  204  413:ifnull          436
    //  205  416:aload_3         
    //  206  417:aload_1         
    //  207  418:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  208  421:aload_3         
    //  209  422:ldc2            #290 <String "mSavedFragmentState=">
    //  210  425:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  211  428:aload_3         
    //  212  429:aload_0         
    //  213  430:getfield        #288 <Field Bundle mSavedFragmentState>
    //  214  433:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  215  436:aload_0         
    //  216  437:getfield        #292 <Field SparseArray mSavedViewState>
    //  217  440:ifnull          463
    //  218  443:aload_3         
    //  219  444:aload_1         
    //  220  445:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  221  448:aload_3         
    //  222  449:ldc2            #294 <String "mSavedViewState=">
    //  223  452:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  224  455:aload_3         
    //  225  456:aload_0         
    //  226  457:getfield        #292 <Field SparseArray mSavedViewState>
    //  227  460:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  228  463:aload_0         
    //  229  464:getfield        #296 <Field Fragment mTarget>
    //  230  467:ifnull          505
    //  231  470:aload_3         
    //  232  471:aload_1         
    //  233  472:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  234  475:aload_3         
    //  235  476:ldc2            #298 <String "mTarget=">
    //  236  479:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  237  482:aload_3         
    //  238  483:aload_0         
    //  239  484:getfield        #296 <Field Fragment mTarget>
    //  240  487:invokevirtual   #300 <Method void PrintWriter.print(Object)>
    //  241  490:aload_3         
    //  242  491:ldc2            #302 <String " mTargetRequestCode=">
    //  243  494:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  244  497:aload_3         
    //  245  498:aload_0         
    //  246  499:getfield        #304 <Field int mTargetRequestCode>
    //  247  502:invokevirtual   #220 <Method void PrintWriter.println(int)>
    //  248  505:aload_0         
    //  249  506:getfield        #306 <Field int mNextAnim>
    //  250  509:ifeq            532
    //  251  512:aload_3         
    //  252  513:aload_1         
    //  253  514:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  254  517:aload_3         
    //  255  518:ldc2            #308 <String "mNextAnim=">
    //  256  521:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  257  524:aload_3         
    //  258  525:aload_0         
    //  259  526:getfield        #306 <Field int mNextAnim>
    //  260  529:invokevirtual   #220 <Method void PrintWriter.println(int)>
    //  261  532:aload_0         
    //  262  533:getfield        #310 <Field ViewGroup mContainer>
    //  263  536:ifnull          559
    //  264  539:aload_3         
    //  265  540:aload_1         
    //  266  541:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  267  544:aload_3         
    //  268  545:ldc2            #312 <String "mContainer=">
    //  269  548:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  270  551:aload_3         
    //  271  552:aload_0         
    //  272  553:getfield        #310 <Field ViewGroup mContainer>
    //  273  556:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  274  559:aload_0         
    //  275  560:getfield        #314 <Field View mView>
    //  276  563:ifnull          586
    //  277  566:aload_3         
    //  278  567:aload_1         
    //  279  568:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  280  571:aload_3         
    //  281  572:ldc2            #316 <String "mView=">
    //  282  575:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  283  578:aload_3         
    //  284  579:aload_0         
    //  285  580:getfield        #314 <Field View mView>
    //  286  583:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  287  586:aload_0         
    //  288  587:getfield        #318 <Field View mInnerView>
    //  289  590:ifnull          613
    //  290  593:aload_3         
    //  291  594:aload_1         
    //  292  595:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  293  598:aload_3         
    //  294  599:ldc2            #320 <String "mInnerView=">
    //  295  602:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  296  605:aload_3         
    //  297  606:aload_0         
    //  298  607:getfield        #314 <Field View mView>
    //  299  610:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  300  613:aload_0         
    //  301  614:getfield        #322 <Field View mAnimatingAway>
    //  302  617:ifnull          660
    //  303  620:aload_3         
    //  304  621:aload_1         
    //  305  622:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  306  625:aload_3         
    //  307  626:ldc2            #324 <String "mAnimatingAway=">
    //  308  629:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  309  632:aload_3         
    //  310  633:aload_0         
    //  311  634:getfield        #322 <Field View mAnimatingAway>
    //  312  637:invokevirtual   #276 <Method void PrintWriter.println(Object)>
    //  313  640:aload_3         
    //  314  641:aload_1         
    //  315  642:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  316  645:aload_3         
    //  317  646:ldc2            #326 <String "mStateAfterAnimating=">
    //  318  649:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  319  652:aload_3         
    //  320  653:aload_0         
    //  321  654:getfield        #328 <Field int mStateAfterAnimating>
    //  322  657:invokevirtual   #220 <Method void PrintWriter.println(int)>
    //  323  660:aload_0         
    //  324  661:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //  325  664:ifnull          710
    //  326  667:aload_3         
    //  327  668:aload_1         
    //  328  669:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  329  672:aload_3         
    //  330  673:ldc2            #332 <String "Loader Manager:">
    //  331  676:invokevirtual   #203 <Method void PrintWriter.println(String)>
    //  332  679:aload_0         
    //  333  680:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //  334  683:new             #150 <Class StringBuilder>
    //  335  686:dup             
    //  336  687:invokespecial   #151 <Method void StringBuilder()>
    //  337  690:aload_1         
    //  338  691:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  339  694:ldc2            #334 <String "  ">
    //  340  697:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  341  700:invokevirtual   #165 <Method String StringBuilder.toString()>
    //  342  703:aload_2         
    //  343  704:aload_3         
    //  344  705:aload           4
    //  345  707:invokevirtual   #338 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
    //  346  710:aload_0         
    //  347  711:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //  348  714:ifnull          786
    //  349  717:aload_3         
    //  350  718:aload_1         
    //  351  719:invokevirtual   #182 <Method void PrintWriter.print(String)>
    //  352  722:aload_3         
    //  353  723:new             #150 <Class StringBuilder>
    //  354  726:dup             
    //  355  727:invokespecial   #151 <Method void StringBuilder()>
    //  356  730:ldc2            #342 <String "Child ">
    //  357  733:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  358  736:aload_0         
    //  359  737:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //  360  740:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //  361  743:ldc2            #347 <String ":">
    //  362  746:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  363  749:invokevirtual   #165 <Method String StringBuilder.toString()>
    //  364  752:invokevirtual   #203 <Method void PrintWriter.println(String)>
    //  365  755:aload_0         
    //  366  756:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //  367  759:new             #150 <Class StringBuilder>
    //  368  762:dup             
    //  369  763:invokespecial   #151 <Method void StringBuilder()>
    //  370  766:aload_1         
    //  371  767:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  372  770:ldc2            #334 <String "  ">
    //  373  773:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //  374  776:invokevirtual   #165 <Method String StringBuilder.toString()>
    //  375  779:aload_2         
    //  376  780:aload_3         
    //  377  781:aload           4
    //  378  783:invokevirtual   #350 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
    //  379  786:return          
    }

    public final boolean equals(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #354 <Method boolean Object.equals(Object)>
    //    3    5:ireturn         
    }

    Fragment findFragmentByWho(String s)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #214 <Field String mWho>
    //    3    5:invokevirtual   #359 <Method boolean String.equals(Object)>
    //    4    8:ifeq            13
    //    5   11:aload_0         
    //    6   12:areturn         
    //    7   13:aload_0         
    //    8   14:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    9   17:ifnull          29
    //   10   20:aload_0         
    //   11   21:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #361 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
    //   14   28:areturn         
    //   15   29:aconst_null     
    //   16   30:areturn         
    }

    public final FragmentActivity getActivity()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:areturn         
    }

    public final Bundle getArguments()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field Bundle mArguments>
    //    2    4:areturn         
    }

    public final FragmentManager getChildFragmentManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnonnull       26
    //    3    7:aload_0         
    //    4    8:invokevirtual   #370 <Method void instantiateChildFragmentManager()>
    //    5   11:aload_0         
    //    6   12:getfield        #88  <Field int mState>
    //    7   15:iconst_5        
    //    8   16:icmplt          31
    //    9   19:aload_0         
    //   10   20:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   11   23:invokevirtual   #373 <Method void FragmentManagerImpl.dispatchResume()>
    //   12   26:aload_0         
    //   13   27:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   14   30:areturn         
    //   15   31:aload_0         
    //   16   32:getfield        #88  <Field int mState>
    //   17   35:iconst_4        
    //   18   36:icmplt          49
    //   19   39:aload_0         
    //   20   40:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   21   43:invokevirtual   #376 <Method void FragmentManagerImpl.dispatchStart()>
    //   22   46:goto            26
    //   23   49:aload_0         
    //   24   50:getfield        #88  <Field int mState>
    //   25   53:iconst_2        
    //   26   54:icmplt          67
    //   27   57:aload_0         
    //   28   58:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   29   61:invokevirtual   #379 <Method void FragmentManagerImpl.dispatchActivityCreated()>
    //   30   64:goto            26
    //   31   67:aload_0         
    //   32   68:getfield        #88  <Field int mState>
    //   33   71:iconst_1        
    //   34   72:icmplt          26
    //   35   75:aload_0         
    //   36   76:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   37   79:invokevirtual   #382 <Method void FragmentManagerImpl.dispatchCreate()>
    //   38   82:goto            26
    }

    public final FragmentManager getFragmentManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #271 <Field FragmentManagerImpl mFragmentManager>
    //    2    4:areturn         
    }

    public final int getId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #186 <Field int mFragmentId>
    //    2    4:ireturn         
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:invokevirtual   #392 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
    //    3    7:areturn         
    }

    public LoaderManager getLoaderManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #278 <Field FragmentActivity mActivity>
    //    8   16:ifnonnull       53
    //    9   19:new             #396 <Class IllegalStateException>
    //   10   22:dup             
    //   11   23:new             #150 <Class StringBuilder>
    //   12   26:dup             
    //   13   27:invokespecial   #151 <Method void StringBuilder()>
    //   14   30:ldc2            #398 <String "Fragment ">
    //   15   33:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   16   36:aload_0         
    //   17   37:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   18   40:ldc2            #400 <String " not attached to Activity">
    //   19   43:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   20   46:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   21   49:invokespecial   #402 <Method void IllegalStateException(String)>
    //   22   52:athrow          
    //   23   53:aload_0         
    //   24   54:iconst_1        
    //   25   55:putfield        #404 <Field boolean mCheckedForLoaderManager>
    //   26   58:aload_0         
    //   27   59:aload_0         
    //   28   60:getfield        #278 <Field FragmentActivity mActivity>
    //   29   63:aload_0         
    //   30   64:getfield        #214 <Field String mWho>
    //   31   67:aload_0         
    //   32   68:getfield        #406 <Field boolean mLoadersStarted>
    //   33   71:iconst_1        
    //   34   72:invokevirtual   #409 <Method LoaderManagerImpl FragmentActivity.getLoaderManager(String, boolean, boolean)>
    //   35   75:putfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   36   78:aload_0         
    //   37   79:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   38   82:areturn         
    }

    public final Fragment getParentFragment()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #282 <Field Fragment mParentFragment>
    //    2    4:areturn         
    }

    public final Resources getResources()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:ifnonnull       41
    //    3    7:new             #396 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:new             #150 <Class StringBuilder>
    //    6   14:dup             
    //    7   15:invokespecial   #151 <Method void StringBuilder()>
    //    8   18:ldc2            #398 <String "Fragment ">
    //    9   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   10   24:aload_0         
    //   11   25:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   12   28:ldc2            #400 <String " not attached to Activity">
    //   13   31:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   14   34:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   15   37:invokespecial   #402 <Method void IllegalStateException(String)>
    //   16   40:athrow          
    //   17   41:aload_0         
    //   18   42:getfield        #278 <Field FragmentActivity mActivity>
    //   19   45:invokevirtual   #415 <Method Resources FragmentActivity.getResources()>
    //   20   48:areturn         
    }

    public final boolean getRetainInstance()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #263 <Field boolean mRetainInstance>
    //    2    4:ireturn         
    }

    public final String getString(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #419 <Method Resources getResources()>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #423 <Method String Resources.getString(int)>
    //    4    8:areturn         
    }

    public final transient String getString(int i, Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #419 <Method Resources getResources()>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #426 <Method String Resources.getString(int, Object[])>
    //    5    9:areturn         
    }

    public final String getTag()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #200 <Field String mTag>
    //    2    4:areturn         
    }

    public final Fragment getTargetFragment()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #296 <Field Fragment mTarget>
    //    2    4:areturn         
    }

    public final int getTargetRequestCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #304 <Field int mTargetRequestCode>
    //    2    4:ireturn         
    }

    public final CharSequence getText(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #419 <Method Resources getResources()>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #433 <Method CharSequence Resources.getText(int)>
    //    4    8:areturn         
    }

    public boolean getUserVisibleHint()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #96  <Field boolean mUserVisibleHint>
    //    2    4:ireturn         
    }

    public View getView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #314 <Field View mView>
    //    2    4:areturn         
    }

    public final boolean hasOptionsMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #259 <Field boolean mHasMenu>
    //    2    4:ireturn         
    }

    public final int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #440 <Method int Object.hashCode()>
    //    2    4:ireturn         
    }

    void initState()
    {
    //    0    0:aload_0         
    //    1    1:iconst_m1       
    //    2    2:putfield        #90  <Field int mIndex>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #214 <Field String mWho>
    //    6   10:aload_0         
    //    7   11:iconst_0        
    //    8   12:putfield        #224 <Field boolean mAdded>
    //    9   15:aload_0         
    //   10   16:iconst_0        
    //   11   17:putfield        #231 <Field boolean mRemoving>
    //   12   20:aload_0         
    //   13   21:iconst_0        
    //   14   22:putfield        #235 <Field boolean mResumed>
    //   15   25:aload_0         
    //   16   26:iconst_0        
    //   17   27:putfield        #239 <Field boolean mFromLayout>
    //   18   30:aload_0         
    //   19   31:iconst_0        
    //   20   32:putfield        #243 <Field boolean mInLayout>
    //   21   35:aload_0         
    //   22   36:iconst_0        
    //   23   37:putfield        #443 <Field boolean mRestored>
    //   24   40:aload_0         
    //   25   41:iconst_0        
    //   26   42:putfield        #218 <Field int mBackStackNesting>
    //   27   45:aload_0         
    //   28   46:aconst_null     
    //   29   47:putfield        #271 <Field FragmentManagerImpl mFragmentManager>
    //   30   50:aload_0         
    //   31   51:aconst_null     
    //   32   52:putfield        #278 <Field FragmentActivity mActivity>
    //   33   55:aload_0         
    //   34   56:iconst_0        
    //   35   57:putfield        #186 <Field int mFragmentId>
    //   36   60:aload_0         
    //   37   61:iconst_0        
    //   38   62:putfield        #196 <Field int mContainerId>
    //   39   65:aload_0         
    //   40   66:aconst_null     
    //   41   67:putfield        #200 <Field String mTag>
    //   42   70:aload_0         
    //   43   71:iconst_0        
    //   44   72:putfield        #249 <Field boolean mHidden>
    //   45   75:aload_0         
    //   46   76:iconst_0        
    //   47   77:putfield        #253 <Field boolean mDetached>
    //   48   80:aload_0         
    //   49   81:iconst_0        
    //   50   82:putfield        #267 <Field boolean mRetaining>
    //   51   85:aload_0         
    //   52   86:aconst_null     
    //   53   87:putfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   54   90:aload_0         
    //   55   91:iconst_0        
    //   56   92:putfield        #406 <Field boolean mLoadersStarted>
    //   57   95:aload_0         
    //   58   96:iconst_0        
    //   59   97:putfield        #404 <Field boolean mCheckedForLoaderManager>
    //   60  100:return          
    }

    void instantiateChildFragmentManager()
    {
    //    0    0:aload_0         
    //    1    1:new             #349 <Class FragmentManagerImpl>
    //    2    4:dup             
    //    3    5:invokespecial   #444 <Method void FragmentManagerImpl()>
    //    4    8:putfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:aload_0         
    //    6   12:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    7   15:aload_0         
    //    8   16:getfield        #278 <Field FragmentActivity mActivity>
    //    9   19:new             #446 <Class Fragment$1>
    //   10   22:dup             
    //   11   23:aload_0         
    //   12   24:invokespecial   #449 <Method void Fragment$1(Fragment)>
    //   13   27:aload_0         
    //   14   28:invokevirtual   #453 <Method void FragmentManagerImpl.attachActivity(FragmentActivity, FragmentContainer, Fragment)>
    //   15   31:return          
    }

    public final boolean isAdded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #224 <Field boolean mAdded>
    //    5   11:ifeq            16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    public final boolean isDetached()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #253 <Field boolean mDetached>
    //    2    4:ireturn         
    }

    public final boolean isHidden()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:ireturn         
    }

    final boolean isInBackStack()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #218 <Field int mBackStackNesting>
    //    2    4:ifle            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public final boolean isInLayout()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #243 <Field boolean mInLayout>
    //    2    4:ireturn         
    }

    public final boolean isMenuVisible()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field boolean mMenuVisible>
    //    2    4:ireturn         
    }

    public final boolean isRemoving()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #231 <Field boolean mRemoving>
    //    2    4:ireturn         
    }

    public final boolean isResumed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #235 <Field boolean mResumed>
    //    2    4:ireturn         
    }

    public final boolean isVisible()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #464 <Method boolean isAdded()>
    //    2    4:ifeq            43
    //    3    7:aload_0         
    //    4    8:invokevirtual   #466 <Method boolean isHidden()>
    //    5   11:ifne            43
    //    6   14:aload_0         
    //    7   15:getfield        #314 <Field View mView>
    //    8   18:ifnull          43
    //    9   21:aload_0         
    //   10   22:getfield        #314 <Field View mView>
    //   11   25:invokevirtual   #472 <Method android.os.IBinder View.getWindowToken()>
    //   12   28:ifnull          43
    //   13   31:aload_0         
    //   14   32:getfield        #314 <Field View mView>
    //   15   35:invokevirtual   #475 <Method int View.getVisibility()>
    //   16   38:ifne            43
    //   17   41:iconst_1        
    //   18   42:ireturn         
    //   19   43:iconst_0        
    //   20   44:ireturn         
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    //    0    0:return          
    }

    public void onAttach(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public Animation onCreateAnimation(int i, boolean flag, int j)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #494 <Method FragmentActivity getActivity()>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokevirtual   #496 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
    //    6   10:return          
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    //    0    0:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:aload_0         
    //    4    6:getfield        #404 <Field boolean mCheckedForLoaderManager>
    //    5    9:ifne            37
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:putfield        #404 <Field boolean mCheckedForLoaderManager>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #278 <Field FragmentActivity mActivity>
    //   12   22:aload_0         
    //   13   23:getfield        #214 <Field String mWho>
    //   14   26:aload_0         
    //   15   27:getfield        #406 <Field boolean mLoadersStarted>
    //   16   30:iconst_0        
    //   17   31:invokevirtual   #409 <Method LoaderManagerImpl FragmentActivity.getLoaderManager(String, boolean, boolean)>
    //   18   34:putfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   19   37:aload_0         
    //   20   38:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   21   41:ifnull          51
    //   22   44:aload_0         
    //   23   45:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   24   48:invokevirtual   #504 <Method void LoaderManagerImpl.doDestroy()>
    //   25   51:return          
    }

    public void onDestroyOptionsMenu()
    {
    //    0    0:return          
    }

    public void onDestroyView()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onDetach()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onHiddenChanged(boolean flag)
    {
    //    0    0:return          
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onLowMemory()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void onOptionsMenuClosed(Menu menu)
    {
    //    0    0:return          
    }

    public void onPause()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
    //    0    0:return          
    }

    public void onResume()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:return          
    }

    public void onStart()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:aload_0         
    //    4    6:getfield        #406 <Field boolean mLoadersStarted>
    //    5    9:ifne            63
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:putfield        #406 <Field boolean mLoadersStarted>
    //    9   17:aload_0         
    //   10   18:getfield        #404 <Field boolean mCheckedForLoaderManager>
    //   11   21:ifne            49
    //   12   24:aload_0         
    //   13   25:iconst_1        
    //   14   26:putfield        #404 <Field boolean mCheckedForLoaderManager>
    //   15   29:aload_0         
    //   16   30:aload_0         
    //   17   31:getfield        #278 <Field FragmentActivity mActivity>
    //   18   34:aload_0         
    //   19   35:getfield        #214 <Field String mWho>
    //   20   38:aload_0         
    //   21   39:getfield        #406 <Field boolean mLoadersStarted>
    //   22   42:iconst_0        
    //   23   43:invokevirtual   #409 <Method LoaderManagerImpl FragmentActivity.getLoaderManager(String, boolean, boolean)>
    //   24   46:putfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   25   49:aload_0         
    //   26   50:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   27   53:ifnull          63
    //   28   56:aload_0         
    //   29   57:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   30   60:invokevirtual   #522 <Method void LoaderManagerImpl.doStart()>
    //   31   63:return          
    }

    public void onStop()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    public void onViewCreated(View view, Bundle bundle)
    {
    //    0    0:return          
    }

    public void onViewStateRestored(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #479 <Field boolean mCalled>
    //    3    5:return          
    }

    void performActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #530 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:aload_1         
    //   11   21:invokevirtual   #532 <Method void onActivityCreated(Bundle)>
    //   12   24:aload_0         
    //   13   25:getfield        #479 <Field boolean mCalled>
    //   14   28:ifne            65
    //   15   31:new             #534 <Class SuperNotCalledException>
    //   16   34:dup             
    //   17   35:new             #150 <Class StringBuilder>
    //   18   38:dup             
    //   19   39:invokespecial   #151 <Method void StringBuilder()>
    //   20   42:ldc2            #398 <String "Fragment ">
    //   21   45:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   22   48:aload_0         
    //   23   49:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   24   52:ldc2            #536 <String " did not call through to super.onActivityCreated()">
    //   25   55:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   26   58:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   27   61:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   28   64:athrow          
    //   29   65:aload_0         
    //   30   66:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   31   69:ifnull          79
    //   32   72:aload_0         
    //   33   73:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   34   76:invokevirtual   #379 <Method void FragmentManagerImpl.dispatchActivityCreated()>
    //   35   79:return          
    }

    void performConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #540 <Method void onConfigurationChanged(Configuration)>
    //    3    5:aload_0         
    //    4    6:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5    9:ifnull          20
    //    6   12:aload_0         
    //    7   13:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #543 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
    //   10   20:return          
    }

    boolean performContextItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:ifne            35
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokevirtual   #546 <Method boolean onContextItemSelected(MenuItem)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:aload_0         
    //   10   18:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   11   21:ifnull          35
    //   12   24:aload_0         
    //   13   25:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   14   28:aload_1         
    //   15   29:invokevirtual   #549 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
    //   16   32:ifne            15
    //   17   35:iconst_0        
    //   18   36:ireturn         
    }

    void performCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #530 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:aload_1         
    //   11   21:invokevirtual   #552 <Method void onCreate(Bundle)>
    //   12   24:aload_0         
    //   13   25:getfield        #479 <Field boolean mCalled>
    //   14   28:ifne            65
    //   15   31:new             #534 <Class SuperNotCalledException>
    //   16   34:dup             
    //   17   35:new             #150 <Class StringBuilder>
    //   18   38:dup             
    //   19   39:invokespecial   #151 <Method void StringBuilder()>
    //   20   42:ldc2            #398 <String "Fragment ">
    //   21   45:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   22   48:aload_0         
    //   23   49:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   24   52:ldc2            #554 <String " did not call through to super.onCreate()">
    //   25   55:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   26   58:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   27   61:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   28   64:athrow          
    //   29   65:aload_1         
    //   30   66:ifnull          108
    //   31   69:aload_1         
    //   32   70:ldc2            #556 <String "android:support:fragments">
    //   33   73:invokevirtual   #560 <Method Parcelable Bundle.getParcelable(String)>
    //   34   76:astore_2        
    //   35   77:aload_2         
    //   36   78:ifnull          108
    //   37   81:aload_0         
    //   38   82:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   39   85:ifnonnull       92
    //   40   88:aload_0         
    //   41   89:invokevirtual   #370 <Method void instantiateChildFragmentManager()>
    //   42   92:aload_0         
    //   43   93:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   44   96:aload_2         
    //   45   97:aconst_null     
    //   46   98:invokevirtual   #564 <Method void FragmentManagerImpl.restoreAllState(Parcelable, java.util.ArrayList)>
    //   47  101:aload_0         
    //   48  102:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   49  105:invokevirtual   #382 <Method void FragmentManagerImpl.dispatchCreate()>
    //   50  108:return          
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:istore_3        
    //    3    5:iconst_0        
    //    4    6:istore          4
    //    5    8:iload_3         
    //    6    9:ifne            70
    //    7   12:aload_0         
    //    8   13:getfield        #259 <Field boolean mHasMenu>
    //    9   16:istore          5
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:iload           5
    //   13   23:ifeq            49
    //   14   26:aload_0         
    //   15   27:getfield        #94  <Field boolean mMenuVisible>
    //   16   30:istore          6
    //   17   32:iconst_0        
    //   18   33:istore          4
    //   19   35:iload           6
    //   20   37:ifeq            49
    //   21   40:iconst_1        
    //   22   41:istore          4
    //   23   43:aload_0         
    //   24   44:aload_1         
    //   25   45:aload_2         
    //   26   46:invokevirtual   #568 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
    //   27   49:aload_0         
    //   28   50:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   29   53:ifnull          70
    //   30   56:iload           4
    //   31   58:aload_0         
    //   32   59:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   33   62:aload_1         
    //   34   63:aload_2         
    //   35   64:invokevirtual   #571 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
    //   36   67:ior             
    //   37   68:istore          4
    //   38   70:iload           4
    //   39   72:ireturn         
    }

    View performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #530 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   14:aload_0         
    //    7   15:aload_1         
    //    8   16:aload_2         
    //    9   17:aload_3         
    //   10   18:invokevirtual   #574 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
    //   11   21:areturn         
    }

    void performDestroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #578 <Method void FragmentManagerImpl.dispatchDestroy()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:invokevirtual   #580 <Method void onDestroy()>
    //   11   23:aload_0         
    //   12   24:getfield        #479 <Field boolean mCalled>
    //   13   27:ifne            64
    //   14   30:new             #534 <Class SuperNotCalledException>
    //   15   33:dup             
    //   16   34:new             #150 <Class StringBuilder>
    //   17   37:dup             
    //   18   38:invokespecial   #151 <Method void StringBuilder()>
    //   19   41:ldc2            #398 <String "Fragment ">
    //   20   44:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   21   47:aload_0         
    //   22   48:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   23   51:ldc2            #582 <String " did not call through to super.onDestroy()">
    //   24   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   57:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   26   60:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   27   63:athrow          
    //   28   64:return          
    }

    void performDestroyView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #586 <Method void FragmentManagerImpl.dispatchDestroyView()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:invokevirtual   #588 <Method void onDestroyView()>
    //   11   23:aload_0         
    //   12   24:getfield        #479 <Field boolean mCalled>
    //   13   27:ifne            64
    //   14   30:new             #534 <Class SuperNotCalledException>
    //   15   33:dup             
    //   16   34:new             #150 <Class StringBuilder>
    //   17   37:dup             
    //   18   38:invokespecial   #151 <Method void StringBuilder()>
    //   19   41:ldc2            #398 <String "Fragment ">
    //   20   44:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   21   47:aload_0         
    //   22   48:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   23   51:ldc2            #590 <String " did not call through to super.onDestroyView()">
    //   24   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   57:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   26   60:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   27   63:athrow          
    //   28   64:aload_0         
    //   29   65:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   30   68:ifnull          78
    //   31   71:aload_0         
    //   32   72:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   33   75:invokevirtual   #593 <Method void LoaderManagerImpl.doReportNextStart()>
    //   34   78:return          
    }

    void performLowMemory()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #596 <Method void onLowMemory()>
    //    2    4:aload_0         
    //    3    5:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    4    8:ifnull          18
    //    5   11:aload_0         
    //    6   12:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    7   15:invokevirtual   #599 <Method void FragmentManagerImpl.dispatchLowMemory()>
    //    8   18:return          
    }

    boolean performOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:ifne            49
    //    3    7:aload_0         
    //    4    8:getfield        #259 <Field boolean mHasMenu>
    //    5   11:ifeq            31
    //    6   14:aload_0         
    //    7   15:getfield        #94  <Field boolean mMenuVisible>
    //    8   18:ifeq            31
    //    9   21:aload_0         
    //   10   22:aload_1         
    //   11   23:invokevirtual   #602 <Method boolean onOptionsItemSelected(MenuItem)>
    //   12   26:ifeq            31
    //   13   29:iconst_1        
    //   14   30:ireturn         
    //   15   31:aload_0         
    //   16   32:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   17   35:ifnull          49
    //   18   38:aload_0         
    //   19   39:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   20   42:aload_1         
    //   21   43:invokevirtual   #605 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
    //   22   46:ifne            29
    //   23   49:iconst_0        
    //   24   50:ireturn         
    }

    void performOptionsMenuClosed(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:ifne            41
    //    3    7:aload_0         
    //    4    8:getfield        #259 <Field boolean mHasMenu>
    //    5   11:ifeq            26
    //    6   14:aload_0         
    //    7   15:getfield        #94  <Field boolean mMenuVisible>
    //    8   18:ifeq            26
    //    9   21:aload_0         
    //   10   22:aload_1         
    //   11   23:invokevirtual   #608 <Method void onOptionsMenuClosed(Menu)>
    //   12   26:aload_0         
    //   13   27:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   14   30:ifnull          41
    //   15   33:aload_0         
    //   16   34:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   17   37:aload_1         
    //   18   38:invokevirtual   #611 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
    //   19   41:return          
    }

    void performPause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #615 <Method void FragmentManagerImpl.dispatchPause()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:invokevirtual   #617 <Method void onPause()>
    //   11   23:aload_0         
    //   12   24:getfield        #479 <Field boolean mCalled>
    //   13   27:ifne            64
    //   14   30:new             #534 <Class SuperNotCalledException>
    //   15   33:dup             
    //   16   34:new             #150 <Class StringBuilder>
    //   17   37:dup             
    //   18   38:invokespecial   #151 <Method void StringBuilder()>
    //   19   41:ldc2            #398 <String "Fragment ">
    //   20   44:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   21   47:aload_0         
    //   22   48:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   23   51:ldc2            #619 <String " did not call through to super.onPause()">
    //   24   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   57:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   26   60:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   27   63:athrow          
    //   28   64:return          
    }

    boolean performPrepareOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field boolean mHidden>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_2         
    //    6    8:ifne            62
    //    7   11:aload_0         
    //    8   12:getfield        #259 <Field boolean mHasMenu>
    //    9   15:istore          4
    //   10   17:iconst_0        
    //   11   18:istore_3        
    //   12   19:iload           4
    //   13   21:ifeq            44
    //   14   24:aload_0         
    //   15   25:getfield        #94  <Field boolean mMenuVisible>
    //   16   28:istore          5
    //   17   30:iconst_0        
    //   18   31:istore_3        
    //   19   32:iload           5
    //   20   34:ifeq            44
    //   21   37:iconst_1        
    //   22   38:istore_3        
    //   23   39:aload_0         
    //   24   40:aload_1         
    //   25   41:invokevirtual   #623 <Method void onPrepareOptionsMenu(Menu)>
    //   26   44:aload_0         
    //   27   45:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   28   48:ifnull          62
    //   29   51:iload_3         
    //   30   52:aload_0         
    //   31   53:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   32   56:aload_1         
    //   33   57:invokevirtual   #626 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
    //   34   60:ior             
    //   35   61:istore_3        
    //   36   62:iload_3         
    //   37   63:ireturn         
    }

    void performReallyStop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #630 <Method void FragmentManagerImpl.dispatchReallyStop()>
    //    6   14:aload_0         
    //    7   15:getfield        #406 <Field boolean mLoadersStarted>
    //    8   18:ifeq            82
    //    9   21:aload_0         
    //   10   22:iconst_0        
    //   11   23:putfield        #406 <Field boolean mLoadersStarted>
    //   12   26:aload_0         
    //   13   27:getfield        #404 <Field boolean mCheckedForLoaderManager>
    //   14   30:ifne            58
    //   15   33:aload_0         
    //   16   34:iconst_1        
    //   17   35:putfield        #404 <Field boolean mCheckedForLoaderManager>
    //   18   38:aload_0         
    //   19   39:aload_0         
    //   20   40:getfield        #278 <Field FragmentActivity mActivity>
    //   21   43:aload_0         
    //   22   44:getfield        #214 <Field String mWho>
    //   23   47:aload_0         
    //   24   48:getfield        #406 <Field boolean mLoadersStarted>
    //   25   51:iconst_0        
    //   26   52:invokevirtual   #409 <Method LoaderManagerImpl FragmentActivity.getLoaderManager(String, boolean, boolean)>
    //   27   55:putfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   28   58:aload_0         
    //   29   59:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   30   62:ifnull          82
    //   31   65:aload_0         
    //   32   66:getfield        #278 <Field FragmentActivity mActivity>
    //   33   69:getfield        #631 <Field boolean FragmentActivity.mRetaining>
    //   34   72:ifne            83
    //   35   75:aload_0         
    //   36   76:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   37   79:invokevirtual   #634 <Method void LoaderManagerImpl.doStop()>
    //   38   82:return          
    //   39   83:aload_0         
    //   40   84:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   41   87:invokevirtual   #637 <Method void LoaderManagerImpl.doRetain()>
    //   42   90:return          
    }

    void performResume()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          22
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #530 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   14:aload_0         
    //    7   15:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    8   18:invokevirtual   #641 <Method boolean FragmentManagerImpl.execPendingActions()>
    //    9   21:pop             
    //   10   22:aload_0         
    //   11   23:iconst_0        
    //   12   24:putfield        #479 <Field boolean mCalled>
    //   13   27:aload_0         
    //   14   28:invokevirtual   #643 <Method void onResume()>
    //   15   31:aload_0         
    //   16   32:getfield        #479 <Field boolean mCalled>
    //   17   35:ifne            72
    //   18   38:new             #534 <Class SuperNotCalledException>
    //   19   41:dup             
    //   20   42:new             #150 <Class StringBuilder>
    //   21   45:dup             
    //   22   46:invokespecial   #151 <Method void StringBuilder()>
    //   23   49:ldc2            #398 <String "Fragment ">
    //   24   52:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   55:aload_0         
    //   26   56:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   27   59:ldc2            #645 <String " did not call through to super.onResume()">
    //   28   62:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   29   65:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   30   68:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   31   71:athrow          
    //   32   72:aload_0         
    //   33   73:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   34   76:ifnull          94
    //   35   79:aload_0         
    //   36   80:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   37   83:invokevirtual   #373 <Method void FragmentManagerImpl.dispatchResume()>
    //   38   86:aload_0         
    //   39   87:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   40   90:invokevirtual   #641 <Method boolean FragmentManagerImpl.execPendingActions()>
    //   41   93:pop             
    //   42   94:return          
    }

    void performSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #648 <Method void onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5    9:ifnull          32
    //    6   12:aload_0         
    //    7   13:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    8   16:invokevirtual   #652 <Method Parcelable FragmentManagerImpl.saveAllState()>
    //    9   19:astore_2        
    //   10   20:aload_2         
    //   11   21:ifnull          32
    //   12   24:aload_1         
    //   13   25:ldc2            #556 <String "android:support:fragments">
    //   14   28:aload_2         
    //   15   29:invokevirtual   #656 <Method void Bundle.putParcelable(String, Parcelable)>
    //   16   32:return          
    }

    void performStart()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          22
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #530 <Method void FragmentManagerImpl.noteStateNotSaved()>
    //    6   14:aload_0         
    //    7   15:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    8   18:invokevirtual   #641 <Method boolean FragmentManagerImpl.execPendingActions()>
    //    9   21:pop             
    //   10   22:aload_0         
    //   11   23:iconst_0        
    //   12   24:putfield        #479 <Field boolean mCalled>
    //   13   27:aload_0         
    //   14   28:invokevirtual   #659 <Method void onStart()>
    //   15   31:aload_0         
    //   16   32:getfield        #479 <Field boolean mCalled>
    //   17   35:ifne            72
    //   18   38:new             #534 <Class SuperNotCalledException>
    //   19   41:dup             
    //   20   42:new             #150 <Class StringBuilder>
    //   21   45:dup             
    //   22   46:invokespecial   #151 <Method void StringBuilder()>
    //   23   49:ldc2            #398 <String "Fragment ">
    //   24   52:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   55:aload_0         
    //   26   56:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   27   59:ldc2            #661 <String " did not call through to super.onStart()">
    //   28   62:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   29   65:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   30   68:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   31   71:athrow          
    //   32   72:aload_0         
    //   33   73:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   34   76:ifnull          86
    //   35   79:aload_0         
    //   36   80:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //   37   83:invokevirtual   #376 <Method void FragmentManagerImpl.dispatchStart()>
    //   38   86:aload_0         
    //   39   87:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   40   90:ifnull          100
    //   41   93:aload_0         
    //   42   94:getfield        #330 <Field LoaderManagerImpl mLoaderManager>
    //   43   97:invokevirtual   #664 <Method void LoaderManagerImpl.doReportStart()>
    //   44  100:return          
    }

    void performStop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #340 <Field FragmentManagerImpl mChildFragmentManager>
    //    5   11:invokevirtual   #668 <Method void FragmentManagerImpl.dispatchStop()>
    //    6   14:aload_0         
    //    7   15:iconst_0        
    //    8   16:putfield        #479 <Field boolean mCalled>
    //    9   19:aload_0         
    //   10   20:invokevirtual   #670 <Method void onStop()>
    //   11   23:aload_0         
    //   12   24:getfield        #479 <Field boolean mCalled>
    //   13   27:ifne            64
    //   14   30:new             #534 <Class SuperNotCalledException>
    //   15   33:dup             
    //   16   34:new             #150 <Class StringBuilder>
    //   17   37:dup             
    //   18   38:invokespecial   #151 <Method void StringBuilder()>
    //   19   41:ldc2            #398 <String "Fragment ">
    //   20   44:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   21   47:aload_0         
    //   22   48:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   23   51:ldc2            #672 <String " did not call through to super.onStop()">
    //   24   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   25   57:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   26   60:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   27   63:athrow          
    //   28   64:return          
    }

    public void registerForContextMenu(View view)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #678 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
    //    3    5:return          
    }

    final void restoreViewState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #292 <Field SparseArray mSavedViewState>
    //    2    4:ifnull          23
    //    3    7:aload_0         
    //    4    8:getfield        #318 <Field View mInnerView>
    //    5   11:aload_0         
    //    6   12:getfield        #292 <Field SparseArray mSavedViewState>
    //    7   15:invokevirtual   #683 <Method void View.restoreHierarchyState(SparseArray)>
    //    8   18:aload_0         
    //    9   19:aconst_null     
    //   10   20:putfield        #292 <Field SparseArray mSavedViewState>
    //   11   23:aload_0         
    //   12   24:iconst_0        
    //   13   25:putfield        #479 <Field boolean mCalled>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokevirtual   #685 <Method void onViewStateRestored(Bundle)>
    //   17   33:aload_0         
    //   18   34:getfield        #479 <Field boolean mCalled>
    //   19   37:ifne            74
    //   20   40:new             #534 <Class SuperNotCalledException>
    //   21   43:dup             
    //   22   44:new             #150 <Class StringBuilder>
    //   23   47:dup             
    //   24   48:invokespecial   #151 <Method void StringBuilder()>
    //   25   51:ldc2            #398 <String "Fragment ">
    //   26   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   27   57:aload_0         
    //   28   58:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   29   61:ldc2            #687 <String " did not call through to super.onViewStateRestored()">
    //   30   64:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   31   67:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   32   70:invokespecial   #537 <Method void SuperNotCalledException(String)>
    //   33   73:athrow          
    //   34   74:return          
    }

    public void setArguments(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field int mIndex>
    //    2    4:iflt            18
    //    3    7:new             #396 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #690 <String "Fragment already active">
    //    6   14:invokespecial   #402 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:aload_1         
    //   10   20:putfield        #146 <Field Bundle mArguments>
    //   11   23:return          
    }

    public void setHasOptionsMenu(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #259 <Field boolean mHasMenu>
    //    2    4:iload_1         
    //    3    5:icmpeq          34
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #259 <Field boolean mHasMenu>
    //    7   13:aload_0         
    //    8   14:invokevirtual   #464 <Method boolean isAdded()>
    //    9   17:ifeq            34
    //   10   20:aload_0         
    //   11   21:invokevirtual   #466 <Method boolean isHidden()>
    //   12   24:ifne            34
    //   13   27:aload_0         
    //   14   28:getfield        #278 <Field FragmentActivity mActivity>
    //   15   31:invokevirtual   #694 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
    //   16   34:return          
    }

    final void setIndex(int i, Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #90  <Field int mIndex>
    //    3    5:aload_2         
    //    4    6:ifnull          44
    //    5    9:aload_0         
    //    6   10:new             #150 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:invokespecial   #151 <Method void StringBuilder()>
    //    9   17:aload_2         
    //   10   18:getfield        #214 <Field String mWho>
    //   11   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   12   24:ldc2            #347 <String ":">
    //   13   27:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   14   30:aload_0         
    //   15   31:getfield        #90  <Field int mIndex>
    //   16   34:invokevirtual   #699 <Method StringBuilder StringBuilder.append(int)>
    //   17   37:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   18   40:putfield        #214 <Field String mWho>
    //   19   43:return          
    //   20   44:aload_0         
    //   21   45:new             #150 <Class StringBuilder>
    //   22   48:dup             
    //   23   49:invokespecial   #151 <Method void StringBuilder()>
    //   24   52:ldc2            #701 <String "android:fragment:">
    //   25   55:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   26   58:aload_0         
    //   27   59:getfield        #90  <Field int mIndex>
    //   28   62:invokevirtual   #699 <Method StringBuilder StringBuilder.append(int)>
    //   29   65:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   30   68:putfield        #214 <Field String mWho>
    //   31   71:return          
    }

    public void setInitialSavedState(SavedState savedstate)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field int mIndex>
    //    2    4:iflt            18
    //    3    7:new             #396 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #690 <String "Fragment already active">
    //    6   14:invokespecial   #402 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_1         
    //    9   19:ifnull          40
    //   10   22:aload_1         
    //   11   23:getfield        #707 <Field Bundle Fragment$SavedState.mState>
    //   12   26:ifnull          40
    //   13   29:aload_1         
    //   14   30:getfield        #707 <Field Bundle Fragment$SavedState.mState>
    //   15   33:astore_2        
    //   16   34:aload_0         
    //   17   35:aload_2         
    //   18   36:putfield        #288 <Field Bundle mSavedFragmentState>
    //   19   39:return          
    //   20   40:aconst_null     
    //   21   41:astore_2        
    //   22   42:goto            34
    }

    public void setMenuVisibility(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field boolean mMenuVisible>
    //    2    4:iload_1         
    //    3    5:icmpeq          41
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #94  <Field boolean mMenuVisible>
    //    7   13:aload_0         
    //    8   14:getfield        #259 <Field boolean mHasMenu>
    //    9   17:ifeq            41
    //   10   20:aload_0         
    //   11   21:invokevirtual   #464 <Method boolean isAdded()>
    //   12   24:ifeq            41
    //   13   27:aload_0         
    //   14   28:invokevirtual   #466 <Method boolean isHidden()>
    //   15   31:ifne            41
    //   16   34:aload_0         
    //   17   35:getfield        #278 <Field FragmentActivity mActivity>
    //   18   38:invokevirtual   #694 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
    //   19   41:return          
    }

    public void setRetainInstance(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            22
    //    2    4:aload_0         
    //    3    5:getfield        #282 <Field Fragment mParentFragment>
    //    4    8:ifnull          22
    //    5   11:new             #396 <Class IllegalStateException>
    //    6   14:dup             
    //    7   15:ldc2            #711 <String "Can't retain fragements that are nested in other fragments">
    //    8   18:invokespecial   #402 <Method void IllegalStateException(String)>
    //    9   21:athrow          
    //   10   22:aload_0         
    //   11   23:iload_1         
    //   12   24:putfield        #263 <Field boolean mRetainInstance>
    //   13   27:return          
    }

    public void setTargetFragment(Fragment fragment, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #296 <Field Fragment mTarget>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #304 <Field int mTargetRequestCode>
    //    6   10:return          
    }

    public void setUserVisibleHint(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #96  <Field boolean mUserVisibleHint>
    //    2    4:ifne            27
    //    3    7:iload_1         
    //    4    8:ifeq            27
    //    5   11:aload_0         
    //    6   12:getfield        #88  <Field int mState>
    //    7   15:iconst_4        
    //    8   16:icmpge          27
    //    9   19:aload_0         
    //   10   20:getfield        #271 <Field FragmentManagerImpl mFragmentManager>
    //   11   23:aload_0         
    //   12   24:invokevirtual   #717 <Method void FragmentManagerImpl.performPendingDeferredStart(Fragment)>
    //   13   27:aload_0         
    //   14   28:iload_1         
    //   15   29:putfield        #96  <Field boolean mUserVisibleHint>
    //   16   32:iload_1         
    //   17   33:ifne            44
    //   18   36:iconst_1        
    //   19   37:istore_2        
    //   20   38:aload_0         
    //   21   39:iload_2         
    //   22   40:putfield        #719 <Field boolean mDeferStart>
    //   23   43:return          
    //   24   44:iconst_0        
    //   25   45:istore_2        
    //   26   46:goto            38
    }

    public void startActivity(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:ifnonnull       41
    //    3    7:new             #396 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:new             #150 <Class StringBuilder>
    //    6   14:dup             
    //    7   15:invokespecial   #151 <Method void StringBuilder()>
    //    8   18:ldc2            #398 <String "Fragment ">
    //    9   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   10   24:aload_0         
    //   11   25:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   12   28:ldc2            #400 <String " not attached to Activity">
    //   13   31:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   14   34:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   15   37:invokespecial   #402 <Method void IllegalStateException(String)>
    //   16   40:athrow          
    //   17   41:aload_0         
    //   18   42:getfield        #278 <Field FragmentActivity mActivity>
    //   19   45:aload_0         
    //   20   46:aload_1         
    //   21   47:iconst_m1       
    //   22   48:invokevirtual   #725 <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int)>
    //   23   51:return          
    }

    public void startActivityForResult(Intent intent, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #278 <Field FragmentActivity mActivity>
    //    2    4:ifnonnull       41
    //    3    7:new             #396 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:new             #150 <Class StringBuilder>
    //    6   14:dup             
    //    7   15:invokespecial   #151 <Method void StringBuilder()>
    //    8   18:ldc2            #398 <String "Fragment ">
    //    9   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   10   24:aload_0         
    //   11   25:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
    //   12   28:ldc2            #400 <String " not attached to Activity">
    //   13   31:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   14   34:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   15   37:invokespecial   #402 <Method void IllegalStateException(String)>
    //   16   40:athrow          
    //   17   41:aload_0         
    //   18   42:getfield        #278 <Field FragmentActivity mActivity>
    //   19   45:aload_0         
    //   20   46:aload_1         
    //   21   47:iload_2         
    //   22   48:invokevirtual   #725 <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int)>
    //   23   51:return          
    }

    public String toString()
    {
    //    0    0:new             #150 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:sipush          128
    //    3    7:invokespecial   #729 <Method void StringBuilder(int)>
    //    4   10:astore_1        
    //    5   11:aload_0         
    //    6   12:aload_1         
    //    7   13:invokestatic    #735 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //    8   16:aload_0         
    //    9   17:getfield        #90  <Field int mIndex>
    //   10   20:iflt            40
    //   11   23:aload_1         
    //   12   24:ldc2            #737 <String " #">
    //   13   27:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   14   30:pop             
    //   15   31:aload_1         
    //   16   32:aload_0         
    //   17   33:getfield        #90  <Field int mIndex>
    //   18   36:invokevirtual   #699 <Method StringBuilder StringBuilder.append(int)>
    //   19   39:pop             
    //   20   40:aload_0         
    //   21   41:getfield        #186 <Field int mFragmentId>
    //   22   44:ifeq            67
    //   23   47:aload_1         
    //   24   48:ldc2            #739 <String " id=0x">
    //   25   51:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   26   54:pop             
    //   27   55:aload_1         
    //   28   56:aload_0         
    //   29   57:getfield        #186 <Field int mFragmentId>
    //   30   60:invokestatic    #192 <Method String Integer.toHexString(int)>
    //   31   63:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   32   66:pop             
    //   33   67:aload_0         
    //   34   68:getfield        #200 <Field String mTag>
    //   35   71:ifnull          91
    //   36   74:aload_1         
    //   37   75:ldc2            #741 <String " ">
    //   38   78:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   39   81:pop             
    //   40   82:aload_1         
    //   41   83:aload_0         
    //   42   84:getfield        #200 <Field String mTag>
    //   43   87:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
    //   44   90:pop             
    //   45   91:aload_1         
    //   46   92:bipush          125
    //   47   94:invokevirtual   #744 <Method StringBuilder StringBuilder.append(char)>
    //   48   97:pop             
    //   49   98:aload_1         
    //   50   99:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   51  102:areturn         
    }

    public void unregisterForContextMenu(View view)
    {
    //    0    0:aload_1         
    //    1    1:aconst_null     
    //    2    2:invokevirtual   #678 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
    //    3    5:return          
    }

    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    private static final SimpleArrayMap sClassMap;
    FragmentActivity mActivity;
    boolean mAdded;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    Fragment mParentFragment;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    String mWho;

    // Unreferenced inner class android/support/v4/app/Fragment$1

/* anonymous class */
    class _cls1
        implements FragmentContainer
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field Fragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public View findViewById(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field Fragment this$0>
        //    2    4:getfield        #25  <Field View Fragment.mView>
        //    3    7:ifnonnull       20
        //    4   10:new             #27  <Class IllegalStateException>
        //    5   13:dup             
        //    6   14:ldc1            #29  <String "Fragment does not have a view">
        //    7   16:invokespecial   #32  <Method void IllegalStateException(String)>
        //    8   19:athrow          
        //    9   20:aload_0         
        //   10   21:getfield        #17  <Field Fragment this$0>
        //   11   24:getfield        #25  <Field View Fragment.mView>
        //   12   27:iload_1         
        //   13   28:invokevirtual   #36  <Method View View.findViewById(int)>
        //   14   31:areturn         
        }

        final Fragment this$0;
    }


    // Unreferenced inner class android/support/v4/app/Fragment$SavedState$1

/* anonymous class */
    static final class SavedState._cls1
        implements android.os.Parcelable.Creator
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public SavedState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class Fragment$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void Fragment$SavedState(Parcel, ClassLoader)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method Fragment$SavedState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public SavedState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       SavedState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method Fragment$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
