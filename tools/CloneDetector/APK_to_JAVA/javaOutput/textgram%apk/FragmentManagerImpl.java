// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.*;
import android.view.animation.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, FragmentActivity, Fragment, BackStackRecord, 
//            LoaderManagerImpl, SuperNotCalledException, NoSaveStateFrameLayout, FragmentContainer, 
//            FragmentManagerState, FragmentState, BackStackState, FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
{

    static 
    {
    //    0    0:iconst_0        
    //    1    1:putstatic       #85  <Field boolean DEBUG>
    //    2    4:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
    //    3    7:istore_0        
    //    4    8:iconst_0        
    //    5    9:istore_1        
    //    6   10:iload_0         
    //    7   11:bipush          11
    //    8   13:icmplt          18
    //    9   16:iconst_1        
    //   10   17:istore_1        
    //   11   18:iload_1         
    //   12   19:putstatic       #92  <Field boolean HONEYCOMB>
    //   13   22:new             #94  <Class DecelerateInterpolator>
    //   14   25:dup             
    //   15   26:ldc1            #95  <Float 2.5F>
    //   16   28:invokespecial   #99  <Method void DecelerateInterpolator(float)>
    //   17   31:putstatic       #101 <Field Interpolator DECELERATE_QUINT>
    //   18   34:new             #94  <Class DecelerateInterpolator>
    //   19   37:dup             
    //   20   38:ldc1            #102 <Float 1.5F>
    //   21   40:invokespecial   #99  <Method void DecelerateInterpolator(float)>
    //   22   43:putstatic       #104 <Field Interpolator DECELERATE_CUBIC>
    //   23   46:new             #106 <Class AccelerateInterpolator>
    //   24   49:dup             
    //   25   50:ldc1            #95  <Float 2.5F>
    //   26   52:invokespecial   #107 <Method void AccelerateInterpolator(float)>
    //   27   55:putstatic       #109 <Field Interpolator ACCELERATE_QUINT>
    //   28   58:new             #106 <Class AccelerateInterpolator>
    //   29   61:dup             
    //   30   62:ldc1            #102 <Float 1.5F>
    //   31   64:invokespecial   #107 <Method void AccelerateInterpolator(float)>
    //   32   67:putstatic       #111 <Field Interpolator ACCELERATE_CUBIC>
    //   33   70:return          
    }

    FragmentManagerImpl()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #113 <Method void FragmentManager()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #115 <Field int mCurState>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #117 <Field Bundle mStateBundle>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #119 <Field SparseArray mStateArray>
    //   11   19:aload_0         
    //   12   20:new             #121 <Class FragmentManagerImpl$1>
    //   13   23:dup             
    //   14   24:aload_0         
    //   15   25:invokespecial   #124 <Method void FragmentManagerImpl$1(FragmentManagerImpl)>
    //   16   28:putfield        #126 <Field Runnable mExecCommit>
    //   17   31:return          
    }

    private void checkStateLoss()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #129 <Field boolean mStateSaved>
    //    2    4:ifeq            17
    //    3    7:new             #131 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #133 <String "Can not perform this action after onSaveInstanceState">
    //    6   13:invokespecial   #136 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #138 <Field String mNoTransactionsBecause>
    //   10   21:ifnull          54
    //   11   24:new             #131 <Class IllegalStateException>
    //   12   27:dup             
    //   13   28:new             #140 <Class StringBuilder>
    //   14   31:dup             
    //   15   32:invokespecial   #141 <Method void StringBuilder()>
    //   16   35:ldc1            #143 <String "Can not perform this action inside of ">
    //   17   37:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   18   40:aload_0         
    //   19   41:getfield        #138 <Field String mNoTransactionsBecause>
    //   20   44:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   21   47:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   22   50:invokespecial   #136 <Method void IllegalStateException(String)>
    //   23   53:athrow          
    //   24   54:return          
    }

    static Animation makeFadeAnimation(Context context, float f, float f1)
    {
    //    0    0:new             #155 <Class AlphaAnimation>
    //    1    3:dup             
    //    2    4:fload_1         
    //    3    5:fload_2         
    //    4    6:invokespecial   #158 <Method void AlphaAnimation(float, float)>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:getstatic       #104 <Field Interpolator DECELERATE_CUBIC>
    //    8   14:invokevirtual   #162 <Method void AlphaAnimation.setInterpolator(Interpolator)>
    //    9   17:aload_3         
    //   10   18:ldc2w           #163 <Long 220L>
    //   11   21:invokevirtual   #168 <Method void AlphaAnimation.setDuration(long)>
    //   12   24:aload_3         
    //   13   25:areturn         
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
    {
    //    0    0:new             #172 <Class AnimationSet>
    //    1    3:dup             
    //    2    4:iconst_0        
    //    3    5:invokespecial   #175 <Method void AnimationSet(boolean)>
    //    4    8:astore          5
    //    5   10:new             #177 <Class ScaleAnimation>
    //    6   13:dup             
    //    7   14:fload_1         
    //    8   15:fload_2         
    //    9   16:fload_1         
    //   10   17:fload_2         
    //   11   18:iconst_1        
    //   12   19:ldc1            #178 <Float 0.5F>
    //   13   21:iconst_1        
    //   14   22:ldc1            #178 <Float 0.5F>
    //   15   24:invokespecial   #181 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
    //   16   27:astore          6
    //   17   29:aload           6
    //   18   31:getstatic       #101 <Field Interpolator DECELERATE_QUINT>
    //   19   34:invokevirtual   #182 <Method void ScaleAnimation.setInterpolator(Interpolator)>
    //   20   37:aload           6
    //   21   39:ldc2w           #163 <Long 220L>
    //   22   42:invokevirtual   #183 <Method void ScaleAnimation.setDuration(long)>
    //   23   45:aload           5
    //   24   47:aload           6
    //   25   49:invokevirtual   #187 <Method void AnimationSet.addAnimation(Animation)>
    //   26   52:new             #155 <Class AlphaAnimation>
    //   27   55:dup             
    //   28   56:fload_3         
    //   29   57:fload           4
    //   30   59:invokespecial   #158 <Method void AlphaAnimation(float, float)>
    //   31   62:astore          7
    //   32   64:aload           7
    //   33   66:getstatic       #104 <Field Interpolator DECELERATE_CUBIC>
    //   34   69:invokevirtual   #162 <Method void AlphaAnimation.setInterpolator(Interpolator)>
    //   35   72:aload           7
    //   36   74:ldc2w           #163 <Long 220L>
    //   37   77:invokevirtual   #168 <Method void AlphaAnimation.setDuration(long)>
    //   38   80:aload           5
    //   39   82:aload           7
    //   40   84:invokevirtual   #187 <Method void AnimationSet.addAnimation(Animation)>
    //   41   87:aload           5
    //   42   89:areturn         
    }

    public static int reverseTransit(int i)
    {
    //    0    0:iload_0         
    //    1    1:lookupswitch    3: default 36
    //                   4097: 38
    //                   4099: 46
    //                   8194: 42
    //    2   36:iconst_0        
    //    3   37:ireturn         
    //    4   38:sipush          8194
    //    5   41:ireturn         
    //    6   42:sipush          4097
    //    7   45:ireturn         
    //    8   46:sipush          4099
    //    9   49:ireturn         
    }

    private void throwException(RuntimeException runtimeexception)
    {
    //    0    0:ldc1            #32  <String "FragmentManager">
    //    1    2:aload_1         
    //    2    3:invokevirtual   #198 <Method String RuntimeException.getMessage()>
    //    3    6:invokestatic    #204 <Method int Log.e(String, String)>
    //    4    9:pop             
    //    5   10:ldc1            #32  <String "FragmentManager">
    //    6   12:ldc1            #206 <String "Activity state:">
    //    7   14:invokestatic    #204 <Method int Log.e(String, String)>
    //    8   17:pop             
    //    9   18:new             #208 <Class PrintWriter>
    //   10   21:dup             
    //   11   22:new             #210 <Class LogWriter>
    //   12   25:dup             
    //   13   26:ldc1            #32  <String "FragmentManager">
    //   14   28:invokespecial   #211 <Method void LogWriter(String)>
    //   15   31:invokespecial   #214 <Method void PrintWriter(java.io.Writer)>
    //   16   34:astore          4
    //   17   36:aload_0         
    //   18   37:getfield        #216 <Field FragmentActivity mActivity>
    //   19   40:ifnull          76
    // try 43 59 handler(s) 61
    //   20   43:aload_0         
    //   21   44:getfield        #216 <Field FragmentActivity mActivity>
    //   22   47:ldc1            #218 <String "  ">
    //   23   49:aconst_null     
    //   24   50:aload           4
    //   25   52:iconst_0        
    //   26   53:anewarray       String[]
    //   27   56:invokevirtual   #226 <Method void FragmentActivity.dump(String, FileDescriptor, PrintWriter, String[])>
    //   28   59:aload_1         
    //   29   60:athrow          
    // catch Exception
    //   30   61:astore          7
    //   31   63:ldc1            #32  <String "FragmentManager">
    //   32   65:ldc1            #228 <String "Failed dumping state">
    //   33   67:aload           7
    //   34   69:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
    //   35   72:pop             
    //   36   73:goto            59
    // try 76 89 handler(s) 92
    //   37   76:aload_0         
    //   38   77:ldc1            #218 <String "  ">
    //   39   79:aconst_null     
    //   40   80:aload           4
    //   41   82:iconst_0        
    //   42   83:anewarray       String[]
    //   43   86:invokevirtual   #232 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
    //   44   89:goto            59
    // catch Exception
    //   45   92:astore          5
    //   46   94:ldc1            #32  <String "FragmentManager">
    //   47   96:ldc1            #228 <String "Failed dumping state">
    //   48   98:aload           5
    //   49  100:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
    //   50  103:pop             
    //   51  104:goto            59
    }

    public static int transitToStyleIndex(int i, boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:lookupswitch    3: default 36
    //                   4097: 38
    //                   4099: 54
    //                   8194: 46
    //    2   36:iconst_m1       
    //    3   37:ireturn         
    //    4   38:iload_1         
    //    5   39:ifeq            44
    //    6   42:iconst_1        
    //    7   43:ireturn         
    //    8   44:iconst_2        
    //    9   45:ireturn         
    //   10   46:iload_1         
    //   11   47:ifeq            52
    //   12   50:iconst_3        
    //   13   51:ireturn         
    //   14   52:iconst_4        
    //   15   53:ireturn         
    //   16   54:iload_1         
    //   17   55:ifeq            60
    //   18   58:iconst_5        
    //   19   59:ireturn         
    //   20   60:bipush          6
    //   21   62:ireturn         
    }

    void addBackStackState(BackStackRecord backstackrecord)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #238 <Field ArrayList mBackStack>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #240 <Class ArrayList>
    //    5   11:dup             
    //    6   12:invokespecial   #241 <Method void ArrayList()>
    //    7   15:putfield        #238 <Field ArrayList mBackStack>
    //    8   18:aload_0         
    //    9   19:getfield        #238 <Field ArrayList mBackStack>
    //   10   22:aload_1         
    //   11   23:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   12   26:pop             
    //   13   27:aload_0         
    //   14   28:invokevirtual   #248 <Method void reportBackStackChanged()>
    //   15   31:return          
    }

    public void addFragment(Fragment fragment, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #240 <Class ArrayList>
    //    5   11:dup             
    //    6   12:invokespecial   #241 <Method void ArrayList()>
    //    7   15:putfield        #252 <Field ArrayList mAdded>
    //    8   18:getstatic       #85  <Field boolean DEBUG>
    //    9   21:ifeq            49
    //   10   24:ldc1            #32  <String "FragmentManager">
    //   11   26:new             #140 <Class StringBuilder>
    //   12   29:dup             
    //   13   30:invokespecial   #141 <Method void StringBuilder()>
    //   14   33:ldc1            #254 <String "add: ">
    //   15   35:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   16   38:aload_1         
    //   17   39:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   18   42:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   19   45:invokestatic    #260 <Method int Log.v(String, String)>
    //   20   48:pop             
    //   21   49:aload_0         
    //   22   50:aload_1         
    //   23   51:invokevirtual   #264 <Method void makeActive(Fragment)>
    //   24   54:aload_1         
    //   25   55:getfield        #269 <Field boolean Fragment.mDetached>
    //   26   58:ifne            147
    //   27   61:aload_0         
    //   28   62:getfield        #252 <Field ArrayList mAdded>
    //   29   65:aload_1         
    //   30   66:invokevirtual   #272 <Method boolean ArrayList.contains(Object)>
    //   31   69:ifeq            100
    //   32   72:new             #131 <Class IllegalStateException>
    //   33   75:dup             
    //   34   76:new             #140 <Class StringBuilder>
    //   35   79:dup             
    //   36   80:invokespecial   #141 <Method void StringBuilder()>
    //   37   83:ldc2            #274 <String "Fragment already added: ">
    //   38   86:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   39   89:aload_1         
    //   40   90:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   41   93:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   42   96:invokespecial   #136 <Method void IllegalStateException(String)>
    //   43   99:athrow          
    //   44  100:aload_0         
    //   45  101:getfield        #252 <Field ArrayList mAdded>
    //   46  104:aload_1         
    //   47  105:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   48  108:pop             
    //   49  109:aload_1         
    //   50  110:iconst_1        
    //   51  111:putfield        #276 <Field boolean Fragment.mAdded>
    //   52  114:aload_1         
    //   53  115:iconst_0        
    //   54  116:putfield        #279 <Field boolean Fragment.mRemoving>
    //   55  119:aload_1         
    //   56  120:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   57  123:ifeq            138
    //   58  126:aload_1         
    //   59  127:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   60  130:ifeq            138
    //   61  133:aload_0         
    //   62  134:iconst_1        
    //   63  135:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   64  138:iload_2         
    //   65  139:ifeq            147
    //   66  142:aload_0         
    //   67  143:aload_1         
    //   68  144:invokevirtual   #290 <Method void moveToState(Fragment)>
    //   69  147:return          
    }

    public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #240 <Class ArrayList>
    //    5   11:dup             
    //    6   12:invokespecial   #241 <Method void ArrayList()>
    //    7   15:putfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    8   18:aload_0         
    //    9   19:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //   10   22:aload_1         
    //   11   23:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   12   26:pop             
    //   13   27:return          
    }

    public int allocBackStackIndex(BackStackRecord backstackrecord)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 19 handler(s) 183
    //    2    2:aload_0         
    //    3    3:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //    4    6:ifnull          19
    //    5    9:aload_0         
    //    6   10:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //    7   13:invokevirtual   #302 <Method int ArrayList.size()>
    //    8   16:ifgt            100
    // try 19 37 handler(s) 183
    //    9   19:aload_0         
    //   10   20:getfield        #304 <Field ArrayList mBackStackIndices>
    //   11   23:ifnonnull       37
    //   12   26:aload_0         
    //   13   27:new             #240 <Class ArrayList>
    //   14   30:dup             
    //   15   31:invokespecial   #241 <Method void ArrayList()>
    //   16   34:putfield        #304 <Field ArrayList mBackStackIndices>
    // try 37 87 handler(s) 183
    //   17   37:aload_0         
    //   18   38:getfield        #304 <Field ArrayList mBackStackIndices>
    //   19   41:invokevirtual   #302 <Method int ArrayList.size()>
    //   20   44:istore_3        
    //   21   45:getstatic       #85  <Field boolean DEBUG>
    //   22   48:ifeq            87
    //   23   51:ldc1            #32  <String "FragmentManager">
    //   24   53:new             #140 <Class StringBuilder>
    //   25   56:dup             
    //   26   57:invokespecial   #141 <Method void StringBuilder()>
    //   27   60:ldc2            #306 <String "Setting back stack index ">
    //   28   63:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   29   66:iload_3         
    //   30   67:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   31   70:ldc2            #311 <String " to ">
    //   32   73:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   33   76:aload_1         
    //   34   77:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   35   80:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   36   83:invokestatic    #260 <Method int Log.v(String, String)>
    //   37   86:pop             
    // try 87 98 handler(s) 183
    //   38   87:aload_0         
    //   39   88:getfield        #304 <Field ArrayList mBackStackIndices>
    //   40   91:aload_1         
    //   41   92:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   42   95:pop             
    //   43   96:aload_0         
    //   44   97:monitorexit     
    //   45   98:iload_3         
    //   46   99:ireturn         
    // try 100 167 handler(s) 183
    //   47  100:aload_0         
    //   48  101:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   49  104:iconst_m1       
    //   50  105:aload_0         
    //   51  106:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   52  109:invokevirtual   #302 <Method int ArrayList.size()>
    //   53  112:iadd            
    //   54  113:invokevirtual   #315 <Method Object ArrayList.remove(int)>
    //   55  116:checkcast       #317 <Class Integer>
    //   56  119:invokevirtual   #320 <Method int Integer.intValue()>
    //   57  122:istore          6
    //   58  124:getstatic       #85  <Field boolean DEBUG>
    //   59  127:ifeq            167
    //   60  130:ldc1            #32  <String "FragmentManager">
    //   61  132:new             #140 <Class StringBuilder>
    //   62  135:dup             
    //   63  136:invokespecial   #141 <Method void StringBuilder()>
    //   64  139:ldc2            #322 <String "Adding back stack index ">
    //   65  142:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   66  145:iload           6
    //   67  147:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   68  150:ldc2            #324 <String " with ">
    //   69  153:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   70  156:aload_1         
    //   71  157:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   72  160:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   73  163:invokestatic    #260 <Method int Log.v(String, String)>
    //   74  166:pop             
    // try 167 180 handler(s) 183
    //   75  167:aload_0         
    //   76  168:getfield        #304 <Field ArrayList mBackStackIndices>
    //   77  171:iload           6
    //   78  173:aload_1         
    //   79  174:invokevirtual   #328 <Method Object ArrayList.set(int, Object)>
    //   80  177:pop             
    //   81  178:aload_0         
    //   82  179:monitorexit     
    //   83  180:iload           6
    //   84  182:ireturn         
    // finally
    //   85  183:astore_2        
    // try 184 186 handler(s) 183
    //   86  184:aload_0         
    //   87  185:monitorexit     
    //   88  186:aload_2         
    //   89  187:athrow          
    }

    public void attachActivity(FragmentActivity fragmentactivity, FragmentContainer fragmentcontainer, Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #216 <Field FragmentActivity mActivity>
    //    2    4:ifnull          18
    //    3    7:new             #131 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #332 <String "Already attached">
    //    6   14:invokespecial   #136 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:aload_1         
    //   10   20:putfield        #216 <Field FragmentActivity mActivity>
    //   11   23:aload_0         
    //   12   24:aload_2         
    //   13   25:putfield        #334 <Field FragmentContainer mContainer>
    //   14   28:aload_0         
    //   15   29:aload_3         
    //   16   30:putfield        #336 <Field Fragment mParent>
    //   17   33:return          
    }

    public void attachFragment(Fragment fragment, int i, int j)
    {
    //    0    0:getstatic       #85  <Field boolean DEBUG>
    //    1    3:ifeq            32
    //    2    6:ldc1            #32  <String "FragmentManager">
    //    3    8:new             #140 <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #141 <Method void StringBuilder()>
    //    6   15:ldc2            #340 <String "attach: ">
    //    7   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_1         
    //    9   22:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #260 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_1         
    //   14   33:getfield        #269 <Field boolean Fragment.mDetached>
    //   15   36:ifeq            185
    //   16   39:aload_1         
    //   17   40:iconst_0        
    //   18   41:putfield        #269 <Field boolean Fragment.mDetached>
    //   19   44:aload_1         
    //   20   45:getfield        #276 <Field boolean Fragment.mAdded>
    //   21   48:ifne            185
    //   22   51:aload_0         
    //   23   52:getfield        #252 <Field ArrayList mAdded>
    //   24   55:ifnonnull       69
    //   25   58:aload_0         
    //   26   59:new             #240 <Class ArrayList>
    //   27   62:dup             
    //   28   63:invokespecial   #241 <Method void ArrayList()>
    //   29   66:putfield        #252 <Field ArrayList mAdded>
    //   30   69:aload_0         
    //   31   70:getfield        #252 <Field ArrayList mAdded>
    //   32   73:aload_1         
    //   33   74:invokevirtual   #272 <Method boolean ArrayList.contains(Object)>
    //   34   77:ifeq            108
    //   35   80:new             #131 <Class IllegalStateException>
    //   36   83:dup             
    //   37   84:new             #140 <Class StringBuilder>
    //   38   87:dup             
    //   39   88:invokespecial   #141 <Method void StringBuilder()>
    //   40   91:ldc2            #274 <String "Fragment already added: ">
    //   41   94:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   42   97:aload_1         
    //   43   98:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   44  101:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   45  104:invokespecial   #136 <Method void IllegalStateException(String)>
    //   46  107:athrow          
    //   47  108:getstatic       #85  <Field boolean DEBUG>
    //   48  111:ifeq            140
    //   49  114:ldc1            #32  <String "FragmentManager">
    //   50  116:new             #140 <Class StringBuilder>
    //   51  119:dup             
    //   52  120:invokespecial   #141 <Method void StringBuilder()>
    //   53  123:ldc2            #342 <String "add from attach: ">
    //   54  126:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   55  129:aload_1         
    //   56  130:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   57  133:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   58  136:invokestatic    #260 <Method int Log.v(String, String)>
    //   59  139:pop             
    //   60  140:aload_0         
    //   61  141:getfield        #252 <Field ArrayList mAdded>
    //   62  144:aload_1         
    //   63  145:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   64  148:pop             
    //   65  149:aload_1         
    //   66  150:iconst_1        
    //   67  151:putfield        #276 <Field boolean Fragment.mAdded>
    //   68  154:aload_1         
    //   69  155:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   70  158:ifeq            173
    //   71  161:aload_1         
    //   72  162:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   73  165:ifeq            173
    //   74  168:aload_0         
    //   75  169:iconst_1        
    //   76  170:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   77  173:aload_0         
    //   78  174:aload_1         
    //   79  175:aload_0         
    //   80  176:getfield        #115 <Field int mCurState>
    //   81  179:iload_2         
    //   82  180:iload_3         
    //   83  181:iconst_0        
    //   84  182:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   85  185:return          
    }

    public FragmentTransaction beginTransaction()
    {
    //    0    0:new             #349 <Class BackStackRecord>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #350 <Method void BackStackRecord(FragmentManagerImpl)>
    //    4    8:areturn         
    }

    public void detachFragment(Fragment fragment, int i, int j)
    {
    //    0    0:getstatic       #85  <Field boolean DEBUG>
    //    1    3:ifeq            32
    //    2    6:ldc1            #32  <String "FragmentManager">
    //    3    8:new             #140 <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #141 <Method void StringBuilder()>
    //    6   15:ldc2            #353 <String "detach: ">
    //    7   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_1         
    //    9   22:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #260 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_1         
    //   14   33:getfield        #269 <Field boolean Fragment.mDetached>
    //   15   36:ifne            132
    //   16   39:aload_1         
    //   17   40:iconst_1        
    //   18   41:putfield        #269 <Field boolean Fragment.mDetached>
    //   19   44:aload_1         
    //   20   45:getfield        #276 <Field boolean Fragment.mAdded>
    //   21   48:ifeq            132
    //   22   51:aload_0         
    //   23   52:getfield        #252 <Field ArrayList mAdded>
    //   24   55:ifnull          99
    //   25   58:getstatic       #85  <Field boolean DEBUG>
    //   26   61:ifeq            90
    //   27   64:ldc1            #32  <String "FragmentManager">
    //   28   66:new             #140 <Class StringBuilder>
    //   29   69:dup             
    //   30   70:invokespecial   #141 <Method void StringBuilder()>
    //   31   73:ldc2            #355 <String "remove from detach: ">
    //   32   76:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   33   79:aload_1         
    //   34   80:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   35   83:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   36   86:invokestatic    #260 <Method int Log.v(String, String)>
    //   37   89:pop             
    //   38   90:aload_0         
    //   39   91:getfield        #252 <Field ArrayList mAdded>
    //   40   94:aload_1         
    //   41   95:invokevirtual   #357 <Method boolean ArrayList.remove(Object)>
    //   42   98:pop             
    //   43   99:aload_1         
    //   44  100:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   45  103:ifeq            118
    //   46  106:aload_1         
    //   47  107:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   48  110:ifeq            118
    //   49  113:aload_0         
    //   50  114:iconst_1        
    //   51  115:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   52  118:aload_1         
    //   53  119:iconst_0        
    //   54  120:putfield        #276 <Field boolean Fragment.mAdded>
    //   55  123:aload_0         
    //   56  124:aload_1         
    //   57  125:iconst_1        
    //   58  126:iload_2         
    //   59  127:iload_3         
    //   60  128:iconst_0        
    //   61  129:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   62  132:return          
    }

    public void dispatchActivityCreated()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:aload_0         
    //    4    6:iconst_2        
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    7   11:return          
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          47
    //    3    7:iconst_0        
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:aload_0         
    //    7   11:getfield        #252 <Field ArrayList mAdded>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          47
    //   10   20:aload_0         
    //   11   21:getfield        #252 <Field ArrayList mAdded>
    //   12   24:iload_2         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #266 <Class Fragment>
    //   15   31:astore_3        
    //   16   32:aload_3         
    //   17   33:ifnull          41
    //   18   36:aload_3         
    //   19   37:aload_1         
    //   20   38:invokevirtual   #369 <Method void Fragment.performConfigurationChanged(Configuration)>
    //   21   41:iinc            2  1
    //   22   44:goto            9
    //   23   47:return          
    }

    public boolean dispatchContextItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          52
    //    3    7:iconst_0        
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:aload_0         
    //    7   11:getfield        #252 <Field ArrayList mAdded>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          52
    //   10   20:aload_0         
    //   11   21:getfield        #252 <Field ArrayList mAdded>
    //   12   24:iload_2         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #266 <Class Fragment>
    //   15   31:astore_3        
    //   16   32:aload_3         
    //   17   33:ifnull          46
    //   18   36:aload_3         
    //   19   37:aload_1         
    //   20   38:invokevirtual   #374 <Method boolean Fragment.performContextItemSelected(MenuItem)>
    //   21   41:ifeq            46
    //   22   44:iconst_1        
    //   23   45:ireturn         
    //   24   46:iinc            2  1
    //   25   49:goto            9
    //   26   52:iconst_0        
    //   27   53:ireturn         
    }

    public void dispatchCreate()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    7   11:return          
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:astore_3        
    //    3    5:aconst_null     
    //    4    6:astore          4
    //    5    8:iconst_0        
    //    6    9:istore          5
    //    7   11:aload_3         
    //    8   12:ifnull          90
    //    9   15:iconst_0        
    //   10   16:istore          8
    //   11   18:iload           8
    //   12   20:aload_0         
    //   13   21:getfield        #252 <Field ArrayList mAdded>
    //   14   24:invokevirtual   #302 <Method int ArrayList.size()>
    //   15   27:icmpge          90
    //   16   30:aload_0         
    //   17   31:getfield        #252 <Field ArrayList mAdded>
    //   18   34:iload           8
    //   19   36:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   20   39:checkcast       #266 <Class Fragment>
    //   21   42:astore          9
    //   22   44:aload           9
    //   23   46:ifnull          84
    //   24   49:aload           9
    //   25   51:aload_1         
    //   26   52:aload_2         
    //   27   53:invokevirtual   #380 <Method boolean Fragment.performCreateOptionsMenu(Menu, MenuInflater)>
    //   28   56:ifeq            84
    //   29   59:iconst_1        
    //   30   60:istore          5
    //   31   62:aload           4
    //   32   64:ifnonnull       76
    //   33   67:new             #240 <Class ArrayList>
    //   34   70:dup             
    //   35   71:invokespecial   #241 <Method void ArrayList()>
    //   36   74:astore          4
    //   37   76:aload           4
    //   38   78:aload           9
    //   39   80:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   40   83:pop             
    //   41   84:iinc            8  1
    //   42   87:goto            18
    //   43   90:aload_0         
    //   44   91:getfield        #382 <Field ArrayList mCreatedMenus>
    //   45   94:ifnull          152
    //   46   97:iconst_0        
    //   47   98:istore          6
    //   48  100:iload           6
    //   49  102:aload_0         
    //   50  103:getfield        #382 <Field ArrayList mCreatedMenus>
    //   51  106:invokevirtual   #302 <Method int ArrayList.size()>
    //   52  109:icmpge          152
    //   53  112:aload_0         
    //   54  113:getfield        #382 <Field ArrayList mCreatedMenus>
    //   55  116:iload           6
    //   56  118:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   57  121:checkcast       #266 <Class Fragment>
    //   58  124:astore          7
    //   59  126:aload           4
    //   60  128:ifnull          141
    //   61  131:aload           4
    //   62  133:aload           7
    //   63  135:invokevirtual   #272 <Method boolean ArrayList.contains(Object)>
    //   64  138:ifne            146
    //   65  141:aload           7
    //   66  143:invokevirtual   #385 <Method void Fragment.onDestroyOptionsMenu()>
    //   67  146:iinc            6  1
    //   68  149:goto            100
    //   69  152:aload_0         
    //   70  153:aload           4
    //   71  155:putfield        #382 <Field ArrayList mCreatedMenus>
    //   72  158:iload           5
    //   73  160:ireturn         
    }

    public void dispatchDestroy()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #388 <Field boolean mDestroyed>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #392 <Method boolean execPendingActions()>
    //    5    9:pop             
    //    6   10:aload_0         
    //    7   11:iconst_0        
    //    8   12:iconst_0        
    //    9   13:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //   10   16:aload_0         
    //   11   17:aconst_null     
    //   12   18:putfield        #216 <Field FragmentActivity mActivity>
    //   13   21:aload_0         
    //   14   22:aconst_null     
    //   15   23:putfield        #334 <Field FragmentContainer mContainer>
    //   16   26:aload_0         
    //   17   27:aconst_null     
    //   18   28:putfield        #336 <Field Fragment mParent>
    //   19   31:return          
    }

    public void dispatchDestroyView()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    4    6:return          
    }

    public void dispatchLowMemory()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          46
    //    3    7:iconst_0        
    //    4    8:istore_1        
    //    5    9:iload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #252 <Field ArrayList mAdded>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          46
    //   10   20:aload_0         
    //   11   21:getfield        #252 <Field ArrayList mAdded>
    //   12   24:iload_1         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #266 <Class Fragment>
    //   15   31:astore_2        
    //   16   32:aload_2         
    //   17   33:ifnull          40
    //   18   36:aload_2         
    //   19   37:invokevirtual   #397 <Method void Fragment.performLowMemory()>
    //   20   40:iinc            1  1
    //   21   43:goto            9
    //   22   46:return          
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          52
    //    3    7:iconst_0        
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:aload_0         
    //    7   11:getfield        #252 <Field ArrayList mAdded>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          52
    //   10   20:aload_0         
    //   11   21:getfield        #252 <Field ArrayList mAdded>
    //   12   24:iload_2         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #266 <Class Fragment>
    //   15   31:astore_3        
    //   16   32:aload_3         
    //   17   33:ifnull          46
    //   18   36:aload_3         
    //   19   37:aload_1         
    //   20   38:invokevirtual   #401 <Method boolean Fragment.performOptionsItemSelected(MenuItem)>
    //   21   41:ifeq            46
    //   22   44:iconst_1        
    //   23   45:ireturn         
    //   24   46:iinc            2  1
    //   25   49:goto            9
    //   26   52:iconst_0        
    //   27   53:ireturn         
    }

    public void dispatchOptionsMenuClosed(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          47
    //    3    7:iconst_0        
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:aload_0         
    //    7   11:getfield        #252 <Field ArrayList mAdded>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          47
    //   10   20:aload_0         
    //   11   21:getfield        #252 <Field ArrayList mAdded>
    //   12   24:iload_2         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #266 <Class Fragment>
    //   15   31:astore_3        
    //   16   32:aload_3         
    //   17   33:ifnull          41
    //   18   36:aload_3         
    //   19   37:aload_1         
    //   20   38:invokevirtual   #406 <Method void Fragment.performOptionsMenuClosed(Menu)>
    //   21   41:iinc            2  1
    //   22   44:goto            9
    //   23   47:return          
    }

    public void dispatchPause()
    {
    //    0    0:aload_0         
    //    1    1:iconst_4        
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    4    6:return          
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:astore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:aload_2         
    //    6    8:ifnull          62
    //    7   11:iconst_0        
    //    8   12:istore          4
    //    9   14:iload           4
    //   10   16:aload_0         
    //   11   17:getfield        #252 <Field ArrayList mAdded>
    //   12   20:invokevirtual   #302 <Method int ArrayList.size()>
    //   13   23:icmpge          62
    //   14   26:aload_0         
    //   15   27:getfield        #252 <Field ArrayList mAdded>
    //   16   30:iload           4
    //   17   32:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   18   35:checkcast       #266 <Class Fragment>
    //   19   38:astore          5
    //   20   40:aload           5
    //   21   42:ifnull          56
    //   22   45:aload           5
    //   23   47:aload_1         
    //   24   48:invokevirtual   #412 <Method boolean Fragment.performPrepareOptionsMenu(Menu)>
    //   25   51:ifeq            56
    //   26   54:iconst_1        
    //   27   55:istore_3        
    //   28   56:iinc            4  1
    //   29   59:goto            14
    //   30   62:iload_3         
    //   31   63:ireturn         
    }

    public void dispatchReallyStop()
    {
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    4    6:return          
    }

    public void dispatchResume()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:aload_0         
    //    4    6:iconst_5        
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    7   11:return          
    }

    public void dispatchStart()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:aload_0         
    //    4    6:iconst_4        
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    7   11:return          
    }

    public void dispatchStop()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:aload_0         
    //    4    6:iconst_3        
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #361 <Method void moveToState(int, boolean)>
    //    7   11:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:new             #140 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #141 <Method void StringBuilder()>
    //    3    7:aload_1         
    //    4    8:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    5   11:ldc2            #418 <String "    ">
    //    6   14:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    7   17:invokevirtual   #151 <Method String StringBuilder.toString()>
    //    8   20:astore          5
    //    9   22:aload_0         
    //   10   23:getfield        #420 <Field ArrayList mActive>
    //   11   26:ifnull          150
    //   12   29:aload_0         
    //   13   30:getfield        #420 <Field ArrayList mActive>
    //   14   33:invokevirtual   #302 <Method int ArrayList.size()>
    //   15   36:istore          22
    //   16   38:iload           22
    //   17   40:ifle            150
    //   18   43:aload_3         
    //   19   44:aload_1         
    //   20   45:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   21   48:aload_3         
    //   22   49:ldc2            #425 <String "Active Fragments in ">
    //   23   52:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   24   55:aload_3         
    //   25   56:aload_0         
    //   26   57:invokestatic    #431 <Method int System.identityHashCode(Object)>
    //   27   60:invokestatic    #435 <Method String Integer.toHexString(int)>
    //   28   63:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   29   66:aload_3         
    //   30   67:ldc2            #437 <String ":">
    //   31   70:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //   32   73:iconst_0        
    //   33   74:istore          23
    //   34   76:iload           23
    //   35   78:iload           22
    //   36   80:icmpge          150
    //   37   83:aload_0         
    //   38   84:getfield        #420 <Field ArrayList mActive>
    //   39   87:iload           23
    //   40   89:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   41   92:checkcast       #266 <Class Fragment>
    //   42   95:astore          24
    //   43   97:aload_3         
    //   44   98:aload_1         
    //   45   99:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   46  102:aload_3         
    //   47  103:ldc2            #442 <String "  #">
    //   48  106:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   49  109:aload_3         
    //   50  110:iload           23
    //   51  112:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //   52  115:aload_3         
    //   53  116:ldc2            #447 <String ": ">
    //   54  119:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   55  122:aload_3         
    //   56  123:aload           24
    //   57  125:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //   58  128:aload           24
    //   59  130:ifnull          144
    //   60  133:aload           24
    //   61  135:aload           5
    //   62  137:aload_2         
    //   63  138:aload_3         
    //   64  139:aload           4
    //   65  141:invokevirtual   #451 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
    //   66  144:iinc            23  1
    //   67  147:goto            76
    //   68  150:aload_0         
    //   69  151:getfield        #252 <Field ArrayList mAdded>
    //   70  154:ifnull          247
    //   71  157:aload_0         
    //   72  158:getfield        #252 <Field ArrayList mAdded>
    //   73  161:invokevirtual   #302 <Method int ArrayList.size()>
    //   74  164:istore          19
    //   75  166:iload           19
    //   76  168:ifle            247
    //   77  171:aload_3         
    //   78  172:aload_1         
    //   79  173:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   80  176:aload_3         
    //   81  177:ldc2            #453 <String "Added Fragments:">
    //   82  180:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //   83  183:iconst_0        
    //   84  184:istore          20
    //   85  186:iload           20
    //   86  188:iload           19
    //   87  190:icmpge          247
    //   88  193:aload_0         
    //   89  194:getfield        #252 <Field ArrayList mAdded>
    //   90  197:iload           20
    //   91  199:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   92  202:checkcast       #266 <Class Fragment>
    //   93  205:astore          21
    //   94  207:aload_3         
    //   95  208:aload_1         
    //   96  209:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //   97  212:aload_3         
    //   98  213:ldc2            #442 <String "  #">
    //   99  216:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  100  219:aload_3         
    //  101  220:iload           20
    //  102  222:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  103  225:aload_3         
    //  104  226:ldc2            #447 <String ": ">
    //  105  229:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  106  232:aload_3         
    //  107  233:aload           21
    //  108  235:invokevirtual   #454 <Method String Fragment.toString()>
    //  109  238:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  110  241:iinc            20  1
    //  111  244:goto            186
    //  112  247:aload_0         
    //  113  248:getfield        #382 <Field ArrayList mCreatedMenus>
    //  114  251:ifnull          344
    //  115  254:aload_0         
    //  116  255:getfield        #382 <Field ArrayList mCreatedMenus>
    //  117  258:invokevirtual   #302 <Method int ArrayList.size()>
    //  118  261:istore          16
    //  119  263:iload           16
    //  120  265:ifle            344
    //  121  268:aload_3         
    //  122  269:aload_1         
    //  123  270:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  124  273:aload_3         
    //  125  274:ldc2            #456 <String "Fragments Created Menus:">
    //  126  277:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  127  280:iconst_0        
    //  128  281:istore          17
    //  129  283:iload           17
    //  130  285:iload           16
    //  131  287:icmpge          344
    //  132  290:aload_0         
    //  133  291:getfield        #382 <Field ArrayList mCreatedMenus>
    //  134  294:iload           17
    //  135  296:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  136  299:checkcast       #266 <Class Fragment>
    //  137  302:astore          18
    //  138  304:aload_3         
    //  139  305:aload_1         
    //  140  306:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  141  309:aload_3         
    //  142  310:ldc2            #442 <String "  #">
    //  143  313:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  144  316:aload_3         
    //  145  317:iload           17
    //  146  319:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  147  322:aload_3         
    //  148  323:ldc2            #447 <String ": ">
    //  149  326:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  150  329:aload_3         
    //  151  330:aload           18
    //  152  332:invokevirtual   #454 <Method String Fragment.toString()>
    //  153  335:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  154  338:iinc            17  1
    //  155  341:goto            283
    //  156  344:aload_0         
    //  157  345:getfield        #238 <Field ArrayList mBackStack>
    //  158  348:ifnull          452
    //  159  351:aload_0         
    //  160  352:getfield        #238 <Field ArrayList mBackStack>
    //  161  355:invokevirtual   #302 <Method int ArrayList.size()>
    //  162  358:istore          13
    //  163  360:iload           13
    //  164  362:ifle            452
    //  165  365:aload_3         
    //  166  366:aload_1         
    //  167  367:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  168  370:aload_3         
    //  169  371:ldc2            #458 <String "Back Stack:">
    //  170  374:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  171  377:iconst_0        
    //  172  378:istore          14
    //  173  380:iload           14
    //  174  382:iload           13
    //  175  384:icmpge          452
    //  176  387:aload_0         
    //  177  388:getfield        #238 <Field ArrayList mBackStack>
    //  178  391:iload           14
    //  179  393:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  180  396:checkcast       #349 <Class BackStackRecord>
    //  181  399:astore          15
    //  182  401:aload_3         
    //  183  402:aload_1         
    //  184  403:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  185  406:aload_3         
    //  186  407:ldc2            #442 <String "  #">
    //  187  410:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  188  413:aload_3         
    //  189  414:iload           14
    //  190  416:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  191  419:aload_3         
    //  192  420:ldc2            #447 <String ": ">
    //  193  423:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  194  426:aload_3         
    //  195  427:aload           15
    //  196  429:invokevirtual   #459 <Method String BackStackRecord.toString()>
    //  197  432:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  198  435:aload           15
    //  199  437:aload           5
    //  200  439:aload_2         
    //  201  440:aload_3         
    //  202  441:aload           4
    //  203  443:invokevirtual   #460 <Method void BackStackRecord.dump(String, FileDescriptor, PrintWriter, String[])>
    //  204  446:iinc            14  1
    //  205  449:goto            380
    //  206  452:aload_0         
    //  207  453:monitorenter    
    // try 454 470 handler(s) 687
    //  208  454:aload_0         
    //  209  455:getfield        #304 <Field ArrayList mBackStackIndices>
    //  210  458:ifnull          548
    //  211  461:aload_0         
    //  212  462:getfield        #304 <Field ArrayList mBackStackIndices>
    //  213  465:invokevirtual   #302 <Method int ArrayList.size()>
    //  214  468:istore          10
    //  215  470:iload           10
    //  216  472:ifle            548
    // try 475 487 handler(s) 687
    //  217  475:aload_3         
    //  218  476:aload_1         
    //  219  477:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  220  480:aload_3         
    //  221  481:ldc2            #462 <String "Back Stack Indices:">
    //  222  484:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  223  487:iconst_0        
    //  224  488:istore          11
    //  225  490:iload           11
    //  226  492:iload           10
    //  227  494:icmpge          548
    // try 497 542 handler(s) 687
    //  228  497:aload_0         
    //  229  498:getfield        #304 <Field ArrayList mBackStackIndices>
    //  230  501:iload           11
    //  231  503:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  232  506:checkcast       #349 <Class BackStackRecord>
    //  233  509:astore          12
    //  234  511:aload_3         
    //  235  512:aload_1         
    //  236  513:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  237  516:aload_3         
    //  238  517:ldc2            #442 <String "  #">
    //  239  520:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  240  523:aload_3         
    //  241  524:iload           11
    //  242  526:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  243  529:aload_3         
    //  244  530:ldc2            #447 <String ": ">
    //  245  533:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  246  536:aload_3         
    //  247  537:aload           12
    //  248  539:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //  249  542:iinc            11  1
    //  250  545:goto            490
    // try 548 591 handler(s) 687
    //  251  548:aload_0         
    //  252  549:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //  253  552:ifnull          591
    //  254  555:aload_0         
    //  255  556:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //  256  559:invokevirtual   #302 <Method int ArrayList.size()>
    //  257  562:ifle            591
    //  258  565:aload_3         
    //  259  566:aload_1         
    //  260  567:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  261  570:aload_3         
    //  262  571:ldc2            #464 <String "mAvailBackStackIndices: ">
    //  263  574:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  264  577:aload_3         
    //  265  578:aload_0         
    //  266  579:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //  267  582:invokevirtual   #468 <Method Object[] ArrayList.toArray()>
    //  268  585:invokestatic    #473 <Method String Arrays.toString(Object[])>
    //  269  588:invokevirtual   #440 <Method void PrintWriter.println(String)>
    // try 591 593 handler(s) 687
    //  270  591:aload_0         
    //  271  592:monitorexit     
    //  272  593:aload_0         
    //  273  594:getfield        #475 <Field ArrayList mPendingActions>
    //  274  597:ifnull          694
    //  275  600:aload_0         
    //  276  601:getfield        #475 <Field ArrayList mPendingActions>
    //  277  604:invokevirtual   #302 <Method int ArrayList.size()>
    //  278  607:istore          7
    //  279  609:iload           7
    //  280  611:ifle            694
    //  281  614:aload_3         
    //  282  615:aload_1         
    //  283  616:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  284  619:aload_3         
    //  285  620:ldc2            #477 <String "Pending Actions:">
    //  286  623:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  287  626:iconst_0        
    //  288  627:istore          8
    //  289  629:iload           8
    //  290  631:iload           7
    //  291  633:icmpge          694
    //  292  636:aload_0         
    //  293  637:getfield        #475 <Field ArrayList mPendingActions>
    //  294  640:iload           8
    //  295  642:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  296  645:checkcast       #479 <Class Runnable>
    //  297  648:astore          9
    //  298  650:aload_3         
    //  299  651:aload_1         
    //  300  652:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  301  655:aload_3         
    //  302  656:ldc2            #442 <String "  #">
    //  303  659:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  304  662:aload_3         
    //  305  663:iload           8
    //  306  665:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  307  668:aload_3         
    //  308  669:ldc2            #447 <String ": ">
    //  309  672:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  310  675:aload_3         
    //  311  676:aload           9
    //  312  678:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //  313  681:iinc            8  1
    //  314  684:goto            629
    // finally
    //  315  687:astore          6
    // try 689 691 handler(s) 687
    //  316  689:aload_0         
    //  317  690:monitorexit     
    //  318  691:aload           6
    //  319  693:athrow          
    //  320  694:aload_3         
    //  321  695:aload_1         
    //  322  696:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  323  699:aload_3         
    //  324  700:ldc2            #481 <String "FragmentManager misc state:">
    //  325  703:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  326  706:aload_3         
    //  327  707:aload_1         
    //  328  708:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  329  711:aload_3         
    //  330  712:ldc2            #483 <String "  mActivity=">
    //  331  715:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  332  718:aload_3         
    //  333  719:aload_0         
    //  334  720:getfield        #216 <Field FragmentActivity mActivity>
    //  335  723:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //  336  726:aload_3         
    //  337  727:aload_1         
    //  338  728:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  339  731:aload_3         
    //  340  732:ldc2            #485 <String "  mContainer=">
    //  341  735:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  342  738:aload_3         
    //  343  739:aload_0         
    //  344  740:getfield        #334 <Field FragmentContainer mContainer>
    //  345  743:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //  346  746:aload_0         
    //  347  747:getfield        #336 <Field Fragment mParent>
    //  348  750:ifnull          773
    //  349  753:aload_3         
    //  350  754:aload_1         
    //  351  755:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  352  758:aload_3         
    //  353  759:ldc2            #487 <String "  mParent=">
    //  354  762:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  355  765:aload_3         
    //  356  766:aload_0         
    //  357  767:getfield        #336 <Field Fragment mParent>
    //  358  770:invokevirtual   #450 <Method void PrintWriter.println(Object)>
    //  359  773:aload_3         
    //  360  774:aload_1         
    //  361  775:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  362  778:aload_3         
    //  363  779:ldc2            #489 <String "  mCurState=">
    //  364  782:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  365  785:aload_3         
    //  366  786:aload_0         
    //  367  787:getfield        #115 <Field int mCurState>
    //  368  790:invokevirtual   #445 <Method void PrintWriter.print(int)>
    //  369  793:aload_3         
    //  370  794:ldc2            #491 <String " mStateSaved=">
    //  371  797:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  372  800:aload_3         
    //  373  801:aload_0         
    //  374  802:getfield        #129 <Field boolean mStateSaved>
    //  375  805:invokevirtual   #493 <Method void PrintWriter.print(boolean)>
    //  376  808:aload_3         
    //  377  809:ldc2            #495 <String " mDestroyed=">
    //  378  812:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  379  815:aload_3         
    //  380  816:aload_0         
    //  381  817:getfield        #388 <Field boolean mDestroyed>
    //  382  820:invokevirtual   #497 <Method void PrintWriter.println(boolean)>
    //  383  823:aload_0         
    //  384  824:getfield        #287 <Field boolean mNeedMenuInvalidate>
    //  385  827:ifeq            850
    //  386  830:aload_3         
    //  387  831:aload_1         
    //  388  832:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  389  835:aload_3         
    //  390  836:ldc2            #499 <String "  mNeedMenuInvalidate=">
    //  391  839:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  392  842:aload_3         
    //  393  843:aload_0         
    //  394  844:getfield        #287 <Field boolean mNeedMenuInvalidate>
    //  395  847:invokevirtual   #497 <Method void PrintWriter.println(boolean)>
    //  396  850:aload_0         
    //  397  851:getfield        #138 <Field String mNoTransactionsBecause>
    //  398  854:ifnull          877
    //  399  857:aload_3         
    //  400  858:aload_1         
    //  401  859:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  402  862:aload_3         
    //  403  863:ldc2            #501 <String "  mNoTransactionsBecause=">
    //  404  866:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  405  869:aload_3         
    //  406  870:aload_0         
    //  407  871:getfield        #138 <Field String mNoTransactionsBecause>
    //  408  874:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  409  877:aload_0         
    //  410  878:getfield        #503 <Field ArrayList mAvailIndices>
    //  411  881:ifnull          920
    //  412  884:aload_0         
    //  413  885:getfield        #503 <Field ArrayList mAvailIndices>
    //  414  888:invokevirtual   #302 <Method int ArrayList.size()>
    //  415  891:ifle            920
    //  416  894:aload_3         
    //  417  895:aload_1         
    //  418  896:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  419  899:aload_3         
    //  420  900:ldc2            #505 <String "  mAvailIndices: ">
    //  421  903:invokevirtual   #423 <Method void PrintWriter.print(String)>
    //  422  906:aload_3         
    //  423  907:aload_0         
    //  424  908:getfield        #503 <Field ArrayList mAvailIndices>
    //  425  911:invokevirtual   #468 <Method Object[] ArrayList.toArray()>
    //  426  914:invokestatic    #473 <Method String Arrays.toString(Object[])>
    //  427  917:invokevirtual   #440 <Method void PrintWriter.println(String)>
    //  428  920:return          
    }

    public void enqueueAction(Runnable runnable, boolean flag)
    {
    //    0    0:iload_2         
    //    1    1:ifne            8
    //    2    4:aload_0         
    //    3    5:invokespecial   #509 <Method void checkStateLoss()>
    //    4    8:aload_0         
    //    5    9:monitorenter    
    // try 10 24 handler(s) 35
    //    6   10:aload_0         
    //    7   11:getfield        #388 <Field boolean mDestroyed>
    //    8   14:ifne            24
    //    9   17:aload_0         
    //   10   18:getfield        #216 <Field FragmentActivity mActivity>
    //   11   21:ifnonnull       40
    // try 24 35 handler(s) 35
    //   12   24:new             #131 <Class IllegalStateException>
    //   13   27:dup             
    //   14   28:ldc2            #511 <String "Activity has been destroyed">
    //   15   31:invokespecial   #136 <Method void IllegalStateException(String)>
    //   16   34:athrow          
    // finally
    //   17   35:astore_3        
    // try 36 38 handler(s) 35
    //   18   36:aload_0         
    //   19   37:monitorexit     
    //   20   38:aload_3         
    //   21   39:athrow          
    // try 40 58 handler(s) 35
    //   22   40:aload_0         
    //   23   41:getfield        #475 <Field ArrayList mPendingActions>
    //   24   44:ifnonnull       58
    //   25   47:aload_0         
    //   26   48:new             #240 <Class ArrayList>
    //   27   51:dup             
    //   28   52:invokespecial   #241 <Method void ArrayList()>
    //   29   55:putfield        #475 <Field ArrayList mPendingActions>
    // try 58 107 handler(s) 35
    //   30   58:aload_0         
    //   31   59:getfield        #475 <Field ArrayList mPendingActions>
    //   32   62:aload_1         
    //   33   63:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   34   66:pop             
    //   35   67:aload_0         
    //   36   68:getfield        #475 <Field ArrayList mPendingActions>
    //   37   71:invokevirtual   #302 <Method int ArrayList.size()>
    //   38   74:iconst_1        
    //   39   75:icmpne          107
    //   40   78:aload_0         
    //   41   79:getfield        #216 <Field FragmentActivity mActivity>
    //   42   82:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //   43   85:aload_0         
    //   44   86:getfield        #126 <Field Runnable mExecCommit>
    //   45   89:invokevirtual   #521 <Method void Handler.removeCallbacks(Runnable)>
    //   46   92:aload_0         
    //   47   93:getfield        #216 <Field FragmentActivity mActivity>
    //   48   96:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //   49   99:aload_0         
    //   50  100:getfield        #126 <Field Runnable mExecCommit>
    //   51  103:invokevirtual   #525 <Method boolean Handler.post(Runnable)>
    //   52  106:pop             
    // try 107 109 handler(s) 35
    //   53  107:aload_0         
    //   54  108:monitorexit     
    //   55  109:return          
    }

    public boolean execPendingActions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #527 <Field boolean mExecutingActions>
    //    2    4:ifeq            18
    //    3    7:new             #131 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #529 <String "Recursive entry to executePendingTransactions">
    //    6   14:invokespecial   #136 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:invokestatic    #535 <Method Looper Looper.myLooper()>
    //    9   21:aload_0         
    //   10   22:getfield        #216 <Field FragmentActivity mActivity>
    //   11   25:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //   12   28:invokevirtual   #538 <Method Looper Handler.getLooper()>
    //   13   31:if_acmpeq       45
    //   14   34:new             #131 <Class IllegalStateException>
    //   15   37:dup             
    //   16   38:ldc2            #540 <String "Must be called from main thread of process">
    //   17   41:invokespecial   #136 <Method void IllegalStateException(String)>
    //   18   44:athrow          
    //   19   45:iconst_0        
    //   20   46:istore_1        
    //   21   47:aload_0         
    //   22   48:monitorenter    
    // try 49 66 handler(s) 247
    //   23   49:aload_0         
    //   24   50:getfield        #475 <Field ArrayList mPendingActions>
    //   25   53:ifnull          66
    //   26   56:aload_0         
    //   27   57:getfield        #475 <Field ArrayList mPendingActions>
    //   28   60:invokevirtual   #302 <Method int ArrayList.size()>
    //   29   63:ifne            136
    // try 66 68 handler(s) 247
    //   30   66:aload_0         
    //   31   67:monitorexit     
    //   32   68:aload_0         
    //   33   69:getfield        #542 <Field boolean mHavePendingDeferredStart>
    //   34   72:ifeq            275
    //   35   75:iconst_0        
    //   36   76:istore_3        
    //   37   77:iconst_0        
    //   38   78:istore          4
    //   39   80:iload           4
    //   40   82:aload_0         
    //   41   83:getfield        #420 <Field ArrayList mActive>
    //   42   86:invokevirtual   #302 <Method int ArrayList.size()>
    //   43   89:icmpge          262
    //   44   92:aload_0         
    //   45   93:getfield        #420 <Field ArrayList mActive>
    //   46   96:iload           4
    //   47   98:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   48  101:checkcast       #266 <Class Fragment>
    //   49  104:astore          5
    //   50  106:aload           5
    //   51  108:ifnull          130
    //   52  111:aload           5
    //   53  113:getfield        #546 <Field LoaderManagerImpl Fragment.mLoaderManager>
    //   54  116:ifnull          130
    //   55  119:iload_3         
    //   56  120:aload           5
    //   57  122:getfield        #546 <Field LoaderManagerImpl Fragment.mLoaderManager>
    //   58  125:invokevirtual   #551 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
    //   59  128:ior             
    //   60  129:istore_3        
    //   61  130:iinc            4  1
    //   62  133:goto            80
    // try 136 162 handler(s) 247
    //   63  136:aload_0         
    //   64  137:getfield        #475 <Field ArrayList mPendingActions>
    //   65  140:invokevirtual   #302 <Method int ArrayList.size()>
    //   66  143:istore          6
    //   67  145:aload_0         
    //   68  146:getfield        #553 <Field Runnable[] mTmpActions>
    //   69  149:ifnull          162
    //   70  152:aload_0         
    //   71  153:getfield        #553 <Field Runnable[] mTmpActions>
    //   72  156:arraylength     
    //   73  157:iload           6
    //   74  159:icmpge          171
    // try 162 171 handler(s) 247
    //   75  162:aload_0         
    //   76  163:iload           6
    //   77  165:anewarray       Runnable[]
    //   78  168:putfield        #553 <Field Runnable[] mTmpActions>
    // try 171 206 handler(s) 247
    //   79  171:aload_0         
    //   80  172:getfield        #475 <Field ArrayList mPendingActions>
    //   81  175:aload_0         
    //   82  176:getfield        #553 <Field Runnable[] mTmpActions>
    //   83  179:invokevirtual   #556 <Method Object[] ArrayList.toArray(Object[])>
    //   84  182:pop             
    //   85  183:aload_0         
    //   86  184:getfield        #475 <Field ArrayList mPendingActions>
    //   87  187:invokevirtual   #559 <Method void ArrayList.clear()>
    //   88  190:aload_0         
    //   89  191:getfield        #216 <Field FragmentActivity mActivity>
    //   90  194:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //   91  197:aload_0         
    //   92  198:getfield        #126 <Field Runnable mExecCommit>
    //   93  201:invokevirtual   #521 <Method void Handler.removeCallbacks(Runnable)>
    //   94  204:aload_0         
    //   95  205:monitorexit     
    //   96  206:aload_0         
    //   97  207:iconst_1        
    //   98  208:putfield        #527 <Field boolean mExecutingActions>
    //   99  211:iconst_0        
    //  100  212:istore          8
    //  101  214:iload           8
    //  102  216:iload           6
    //  103  218:icmpge          252
    //  104  221:aload_0         
    //  105  222:getfield        #553 <Field Runnable[] mTmpActions>
    //  106  225:iload           8
    //  107  227:aaload          
    //  108  228:invokeinterface #562 <Method void Runnable.run()>
    //  109  233:aload_0         
    //  110  234:getfield        #553 <Field Runnable[] mTmpActions>
    //  111  237:iload           8
    //  112  239:aconst_null     
    //  113  240:aastore         
    //  114  241:iinc            8  1
    //  115  244:goto            214
    // finally
    //  116  247:astore_2        
    // try 248 250 handler(s) 247
    //  117  248:aload_0         
    //  118  249:monitorexit     
    //  119  250:aload_2         
    //  120  251:athrow          
    //  121  252:aload_0         
    //  122  253:iconst_0        
    //  123  254:putfield        #527 <Field boolean mExecutingActions>
    //  124  257:iconst_1        
    //  125  258:istore_1        
    //  126  259:goto            47
    //  127  262:iload_3         
    //  128  263:ifne            275
    //  129  266:aload_0         
    //  130  267:iconst_0        
    //  131  268:putfield        #542 <Field boolean mHavePendingDeferredStart>
    //  132  271:aload_0         
    //  133  272:invokevirtual   #565 <Method void startPendingDeferredFragments()>
    //  134  275:iload_1         
    //  135  276:ireturn         
    }

    public boolean executePendingTransactions()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #392 <Method boolean execPendingActions()>
    //    2    4:ireturn         
    }

    public Fragment findFragmentById(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          56
    //    3    7:iconst_m1       
    //    4    8:aload_0         
    //    5    9:getfield        #252 <Field ArrayList mAdded>
    //    6   12:invokevirtual   #302 <Method int ArrayList.size()>
    //    7   15:iadd            
    //    8   16:istore          4
    //    9   18:iload           4
    //   10   20:iflt            56
    //   11   23:aload_0         
    //   12   24:getfield        #252 <Field ArrayList mAdded>
    //   13   27:iload           4
    //   14   29:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   15   32:checkcast       #266 <Class Fragment>
    //   16   35:astore_3        
    //   17   36:aload_3         
    //   18   37:ifnull          50
    //   19   40:aload_3         
    //   20   41:getfield        #571 <Field int Fragment.mFragmentId>
    //   21   44:iload_1         
    //   22   45:icmpne          50
    //   23   48:aload_3         
    //   24   49:areturn         
    //   25   50:iinc            4  -1
    //   26   53:goto            18
    //   27   56:aload_0         
    //   28   57:getfield        #420 <Field ArrayList mActive>
    //   29   60:ifnull          107
    //   30   63:iconst_m1       
    //   31   64:aload_0         
    //   32   65:getfield        #420 <Field ArrayList mActive>
    //   33   68:invokevirtual   #302 <Method int ArrayList.size()>
    //   34   71:iadd            
    //   35   72:istore_2        
    //   36   73:iload_2         
    //   37   74:iflt            107
    //   38   77:aload_0         
    //   39   78:getfield        #420 <Field ArrayList mActive>
    //   40   81:iload_2         
    //   41   82:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   42   85:checkcast       #266 <Class Fragment>
    //   43   88:astore_3        
    //   44   89:aload_3         
    //   45   90:ifnull          101
    //   46   93:aload_3         
    //   47   94:getfield        #571 <Field int Fragment.mFragmentId>
    //   48   97:iload_1         
    //   49   98:icmpeq          48
    //   50  101:iinc            2  -1
    //   51  104:goto            73
    //   52  107:aconst_null     
    //   53  108:areturn         
    }

    public Fragment findFragmentByTag(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #252 <Field ArrayList mAdded>
    //    2    4:ifnull          63
    //    3    7:aload_1         
    //    4    8:ifnull          63
    //    5   11:iconst_m1       
    //    6   12:aload_0         
    //    7   13:getfield        #252 <Field ArrayList mAdded>
    //    8   16:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   19:iadd            
    //   10   20:istore          4
    //   11   22:iload           4
    //   12   24:iflt            63
    //   13   27:aload_0         
    //   14   28:getfield        #252 <Field ArrayList mAdded>
    //   15   31:iload           4
    //   16   33:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   17   36:checkcast       #266 <Class Fragment>
    //   18   39:astore_3        
    //   19   40:aload_3         
    //   20   41:ifnull          57
    //   21   44:aload_1         
    //   22   45:aload_3         
    //   23   46:getfield        #576 <Field String Fragment.mTag>
    //   24   49:invokevirtual   #579 <Method boolean String.equals(Object)>
    //   25   52:ifeq            57
    //   26   55:aload_3         
    //   27   56:areturn         
    //   28   57:iinc            4  -1
    //   29   60:goto            22
    //   30   63:aload_0         
    //   31   64:getfield        #420 <Field ArrayList mActive>
    //   32   67:ifnull          121
    //   33   70:aload_1         
    //   34   71:ifnull          121
    //   35   74:iconst_m1       
    //   36   75:aload_0         
    //   37   76:getfield        #420 <Field ArrayList mActive>
    //   38   79:invokevirtual   #302 <Method int ArrayList.size()>
    //   39   82:iadd            
    //   40   83:istore_2        
    //   41   84:iload_2         
    //   42   85:iflt            121
    //   43   88:aload_0         
    //   44   89:getfield        #420 <Field ArrayList mActive>
    //   45   92:iload_2         
    //   46   93:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   47   96:checkcast       #266 <Class Fragment>
    //   48   99:astore_3        
    //   49  100:aload_3         
    //   50  101:ifnull          115
    //   51  104:aload_1         
    //   52  105:aload_3         
    //   53  106:getfield        #576 <Field String Fragment.mTag>
    //   54  109:invokevirtual   #579 <Method boolean String.equals(Object)>
    //   55  112:ifne            55
    //   56  115:iinc            2  -1
    //   57  118:goto            84
    //   58  121:aconst_null     
    //   59  122:areturn         
    }

    public Fragment findFragmentByWho(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #420 <Field ArrayList mActive>
    //    2    4:ifnull          62
    //    3    7:aload_1         
    //    4    8:ifnull          62
    //    5   11:iconst_m1       
    //    6   12:aload_0         
    //    7   13:getfield        #420 <Field ArrayList mActive>
    //    8   16:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   19:iadd            
    //   10   20:istore_2        
    //   11   21:iload_2         
    //   12   22:iflt            62
    //   13   25:aload_0         
    //   14   26:getfield        #420 <Field ArrayList mActive>
    //   15   29:iload_2         
    //   16   30:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   17   33:checkcast       #266 <Class Fragment>
    //   18   36:astore_3        
    //   19   37:aload_3         
    //   20   38:ifnull          56
    //   21   41:aload_3         
    //   22   42:aload_1         
    //   23   43:invokevirtual   #582 <Method Fragment Fragment.findFragmentByWho(String)>
    //   24   46:astore          4
    //   25   48:aload           4
    //   26   50:ifnull          56
    //   27   53:aload           4
    //   28   55:areturn         
    //   29   56:iinc            2  -1
    //   30   59:goto            21
    //   31   62:aconst_null     
    //   32   63:areturn         
    }

    public void freeBackStackIndex(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 30 handler(s) 77
    //    2    2:aload_0         
    //    3    3:getfield        #304 <Field ArrayList mBackStackIndices>
    //    4    6:iload_1         
    //    5    7:aconst_null     
    //    6    8:invokevirtual   #328 <Method Object ArrayList.set(int, Object)>
    //    7   11:pop             
    //    8   12:aload_0         
    //    9   13:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   10   16:ifnonnull       30
    //   11   19:aload_0         
    //   12   20:new             #240 <Class ArrayList>
    //   13   23:dup             
    //   14   24:invokespecial   #241 <Method void ArrayList()>
    //   15   27:putfield        #298 <Field ArrayList mAvailBackStackIndices>
    // try 30 62 handler(s) 77
    //   16   30:getstatic       #85  <Field boolean DEBUG>
    //   17   33:ifeq            62
    //   18   36:ldc1            #32  <String "FragmentManager">
    //   19   38:new             #140 <Class StringBuilder>
    //   20   41:dup             
    //   21   42:invokespecial   #141 <Method void StringBuilder()>
    //   22   45:ldc2            #585 <String "Freeing back stack index ">
    //   23   48:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   24   51:iload_1         
    //   25   52:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   26   55:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   27   58:invokestatic    #260 <Method int Log.v(String, String)>
    //   28   61:pop             
    // try 62 76 handler(s) 77
    //   29   62:aload_0         
    //   30   63:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   31   66:iload_1         
    //   32   67:invokestatic    #589 <Method Integer Integer.valueOf(int)>
    //   33   70:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   34   73:pop             
    //   35   74:aload_0         
    //   36   75:monitorexit     
    //   37   76:return          
    // finally
    //   38   77:astore_2        
    // try 78 80 handler(s) 77
    //   39   78:aload_0         
    //   40   79:monitorexit     
    //   41   80:aload_2         
    //   42   81:athrow          
    }

    public FragmentManager.BackStackEntry getBackStackEntryAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #238 <Field ArrayList mBackStack>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //    4    8:checkcast       #593 <Class FragmentManager$BackStackEntry>
    //    5   11:areturn         
    }

    public int getBackStackEntryCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #238 <Field ArrayList mBackStack>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #238 <Field ArrayList mBackStack>
    //    5   11:invokevirtual   #302 <Method int ArrayList.size()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public Fragment getFragment(Bundle bundle, String s)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:iconst_m1       
    //    3    3:invokevirtual   #602 <Method int Bundle.getInt(String, int)>
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iconst_m1       
    //    7    9:icmpne          18
    //    8   12:aconst_null     
    //    9   13:astore          4
    //   10   15:aload           4
    //   11   17:areturn         
    //   12   18:iload_3         
    //   13   19:aload_0         
    //   14   20:getfield        #420 <Field ArrayList mActive>
    //   15   23:invokevirtual   #302 <Method int ArrayList.size()>
    //   16   26:icmplt          70
    //   17   29:aload_0         
    //   18   30:new             #131 <Class IllegalStateException>
    //   19   33:dup             
    //   20   34:new             #140 <Class StringBuilder>
    //   21   37:dup             
    //   22   38:invokespecial   #141 <Method void StringBuilder()>
    //   23   41:ldc2            #604 <String "Fragement no longer exists for key ">
    //   24   44:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   25   47:aload_2         
    //   26   48:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   27   51:ldc2            #606 <String ": index ">
    //   28   54:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   29   57:iload_3         
    //   30   58:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   31   61:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   32   64:invokespecial   #136 <Method void IllegalStateException(String)>
    //   33   67:invokespecial   #608 <Method void throwException(RuntimeException)>
    //   34   70:aload_0         
    //   35   71:getfield        #420 <Field ArrayList mActive>
    //   36   74:iload_3         
    //   37   75:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   38   78:checkcast       #266 <Class Fragment>
    //   39   81:astore          4
    //   40   83:aload           4
    //   41   85:ifnonnull       15
    //   42   88:aload_0         
    //   43   89:new             #131 <Class IllegalStateException>
    //   44   92:dup             
    //   45   93:new             #140 <Class StringBuilder>
    //   46   96:dup             
    //   47   97:invokespecial   #141 <Method void StringBuilder()>
    //   48  100:ldc2            #604 <String "Fragement no longer exists for key ">
    //   49  103:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   50  106:aload_2         
    //   51  107:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   52  110:ldc2            #606 <String ": index ">
    //   53  113:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   54  116:iload_3         
    //   55  117:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   56  120:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   57  123:invokespecial   #136 <Method void IllegalStateException(String)>
    //   58  126:invokespecial   #608 <Method void throwException(RuntimeException)>
    //   59  129:aload           4
    //   60  131:areturn         
    }

    public List getFragments()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #420 <Field ArrayList mActive>
    //    2    4:areturn         
    }

    public void hideFragment(Fragment fragment, int i, int j)
    {
    //    0    0:getstatic       #85  <Field boolean DEBUG>
    //    1    3:ifeq            32
    //    2    6:ldc1            #32  <String "FragmentManager">
    //    3    8:new             #140 <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #141 <Method void StringBuilder()>
    //    6   15:ldc2            #613 <String "hide: ">
    //    7   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_1         
    //    9   22:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #260 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_1         
    //   14   33:getfield        #616 <Field boolean Fragment.mHidden>
    //   15   36:ifne            115
    //   16   39:aload_1         
    //   17   40:iconst_1        
    //   18   41:putfield        #616 <Field boolean Fragment.mHidden>
    //   19   44:aload_1         
    //   20   45:getfield        #620 <Field View Fragment.mView>
    //   21   48:ifnull          84
    //   22   51:aload_0         
    //   23   52:aload_1         
    //   24   53:iload_2         
    //   25   54:iconst_0        
    //   26   55:iload_3         
    //   27   56:invokevirtual   #624 <Method Animation loadAnimation(Fragment, int, boolean, int)>
    //   28   59:astore          4
    //   29   61:aload           4
    //   30   63:ifnull          75
    //   31   66:aload_1         
    //   32   67:getfield        #620 <Field View Fragment.mView>
    //   33   70:aload           4
    //   34   72:invokevirtual   #629 <Method void View.startAnimation(Animation)>
    //   35   75:aload_1         
    //   36   76:getfield        #620 <Field View Fragment.mView>
    //   37   79:bipush          8
    //   38   81:invokevirtual   #632 <Method void View.setVisibility(int)>
    //   39   84:aload_1         
    //   40   85:getfield        #276 <Field boolean Fragment.mAdded>
    //   41   88:ifeq            110
    //   42   91:aload_1         
    //   43   92:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   44   95:ifeq            110
    //   45   98:aload_1         
    //   46   99:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   47  102:ifeq            110
    //   48  105:aload_0         
    //   49  106:iconst_1        
    //   50  107:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   51  110:aload_1         
    //   52  111:iconst_1        
    //   53  112:invokevirtual   #635 <Method void Fragment.onHiddenChanged(boolean)>
    //   54  115:return          
    }

    Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:iload_3         
    //    3    3:aload_1         
    //    4    4:getfield        #638 <Field int Fragment.mNextAnim>
    //    5    7:invokevirtual   #642 <Method Animation Fragment.onCreateAnimation(int, boolean, int)>
    //    6   10:astore          5
    //    7   12:aload           5
    //    8   14:ifnull          20
    //    9   17:aload           5
    //   10   19:areturn         
    //   11   20:aload_1         
    //   12   21:getfield        #638 <Field int Fragment.mNextAnim>
    //   13   24:ifeq            48
    //   14   27:aload_0         
    //   15   28:getfield        #216 <Field FragmentActivity mActivity>
    //   16   31:aload_1         
    //   17   32:getfield        #638 <Field int Fragment.mNextAnim>
    //   18   35:invokestatic    #647 <Method Animation AnimationUtils.loadAnimation(Context, int)>
    //   19   38:astore          7
    //   20   40:aload           7
    //   21   42:ifnull          48
    //   22   45:aload           7
    //   23   47:areturn         
    //   24   48:iload_2         
    //   25   49:ifne            54
    //   26   52:aconst_null     
    //   27   53:areturn         
    //   28   54:iload_2         
    //   29   55:iload_3         
    //   30   56:invokestatic    #649 <Method int transitToStyleIndex(int, boolean)>
    //   31   59:istore          6
    //   32   61:iload           6
    //   33   63:ifge            68
    //   34   66:aconst_null     
    //   35   67:areturn         
    //   36   68:iload           6
    //   37   70:tableswitch     1 6: default 108
    //                   1 145
    //                   2 159
    //                   3 173
    //                   4 187
    //                   5 201
    //                   6 211
    //   38  108:iload           4
    //   39  110:ifne            138
    //   40  113:aload_0         
    //   41  114:getfield        #216 <Field FragmentActivity mActivity>
    //   42  117:invokevirtual   #653 <Method Window FragmentActivity.getWindow()>
    //   43  120:ifnull          138
    //   44  123:aload_0         
    //   45  124:getfield        #216 <Field FragmentActivity mActivity>
    //   46  127:invokevirtual   #653 <Method Window FragmentActivity.getWindow()>
    //   47  130:invokevirtual   #659 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
    //   48  133:getfield        #664 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
    //   49  136:istore          4
    //   50  138:iload           4
    //   51  140:ifne            221
    //   52  143:aconst_null     
    //   53  144:areturn         
    //   54  145:aload_0         
    //   55  146:getfield        #216 <Field FragmentActivity mActivity>
    //   56  149:ldc2            #665 <Float 1.125F>
    //   57  152:fconst_1        
    //   58  153:fconst_0        
    //   59  154:fconst_1        
    //   60  155:invokestatic    #667 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
    //   61  158:areturn         
    //   62  159:aload_0         
    //   63  160:getfield        #216 <Field FragmentActivity mActivity>
    //   64  163:fconst_1        
    //   65  164:ldc2            #668 <Float 0.975F>
    //   66  167:fconst_1        
    //   67  168:fconst_0        
    //   68  169:invokestatic    #667 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
    //   69  172:areturn         
    //   70  173:aload_0         
    //   71  174:getfield        #216 <Field FragmentActivity mActivity>
    //   72  177:ldc2            #668 <Float 0.975F>
    //   73  180:fconst_1        
    //   74  181:fconst_0        
    //   75  182:fconst_1        
    //   76  183:invokestatic    #667 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
    //   77  186:areturn         
    //   78  187:aload_0         
    //   79  188:getfield        #216 <Field FragmentActivity mActivity>
    //   80  191:fconst_1        
    //   81  192:ldc2            #669 <Float 1.075F>
    //   82  195:fconst_1        
    //   83  196:fconst_0        
    //   84  197:invokestatic    #667 <Method Animation makeOpenCloseAnimation(Context, float, float, float, float)>
    //   85  200:areturn         
    //   86  201:aload_0         
    //   87  202:getfield        #216 <Field FragmentActivity mActivity>
    //   88  205:fconst_0        
    //   89  206:fconst_1        
    //   90  207:invokestatic    #671 <Method Animation makeFadeAnimation(Context, float, float)>
    //   91  210:areturn         
    //   92  211:aload_0         
    //   93  212:getfield        #216 <Field FragmentActivity mActivity>
    //   94  215:fconst_1        
    //   95  216:fconst_0        
    //   96  217:invokestatic    #671 <Method Animation makeFadeAnimation(Context, float, float)>
    //   97  220:areturn         
    //   98  221:aconst_null     
    //   99  222:areturn         
    }

    void makeActive(Fragment fragment)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #674 <Field int Fragment.mIndex>
    //    2    4:iflt            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #503 <Field ArrayList mAvailIndices>
    //    6   12:ifnull          25
    //    7   15:aload_0         
    //    8   16:getfield        #503 <Field ArrayList mAvailIndices>
    //    9   19:invokevirtual   #302 <Method int ArrayList.size()>
    //   10   22:ifgt            100
    //   11   25:aload_0         
    //   12   26:getfield        #420 <Field ArrayList mActive>
    //   13   29:ifnonnull       43
    //   14   32:aload_0         
    //   15   33:new             #240 <Class ArrayList>
    //   16   36:dup             
    //   17   37:invokespecial   #241 <Method void ArrayList()>
    //   18   40:putfield        #420 <Field ArrayList mActive>
    //   19   43:aload_1         
    //   20   44:aload_0         
    //   21   45:getfield        #420 <Field ArrayList mActive>
    //   22   48:invokevirtual   #302 <Method int ArrayList.size()>
    //   23   51:aload_0         
    //   24   52:getfield        #336 <Field Fragment mParent>
    //   25   55:invokevirtual   #678 <Method void Fragment.setIndex(int, Fragment)>
    //   26   58:aload_0         
    //   27   59:getfield        #420 <Field ArrayList mActive>
    //   28   62:aload_1         
    //   29   63:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   30   66:pop             
    //   31   67:getstatic       #85  <Field boolean DEBUG>
    //   32   70:ifeq            7
    //   33   73:ldc1            #32  <String "FragmentManager">
    //   34   75:new             #140 <Class StringBuilder>
    //   35   78:dup             
    //   36   79:invokespecial   #141 <Method void StringBuilder()>
    //   37   82:ldc2            #680 <String "Allocated fragment index ">
    //   38   85:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   39   88:aload_1         
    //   40   89:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   41   92:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   42   95:invokestatic    #260 <Method int Log.v(String, String)>
    //   43   98:pop             
    //   44   99:return          
    //   45  100:aload_1         
    //   46  101:aload_0         
    //   47  102:getfield        #503 <Field ArrayList mAvailIndices>
    //   48  105:iconst_m1       
    //   49  106:aload_0         
    //   50  107:getfield        #503 <Field ArrayList mAvailIndices>
    //   51  110:invokevirtual   #302 <Method int ArrayList.size()>
    //   52  113:iadd            
    //   53  114:invokevirtual   #315 <Method Object ArrayList.remove(int)>
    //   54  117:checkcast       #317 <Class Integer>
    //   55  120:invokevirtual   #320 <Method int Integer.intValue()>
    //   56  123:aload_0         
    //   57  124:getfield        #336 <Field Fragment mParent>
    //   58  127:invokevirtual   #678 <Method void Fragment.setIndex(int, Fragment)>
    //   59  130:aload_0         
    //   60  131:getfield        #420 <Field ArrayList mActive>
    //   61  134:aload_1         
    //   62  135:getfield        #674 <Field int Fragment.mIndex>
    //   63  138:aload_1         
    //   64  139:invokevirtual   #328 <Method Object ArrayList.set(int, Object)>
    //   65  142:pop             
    //   66  143:goto            67
    }

    void makeInactive(Fragment fragment)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #674 <Field int Fragment.mIndex>
    //    2    4:ifge            8
    //    3    7:return          
    //    4    8:getstatic       #85  <Field boolean DEBUG>
    //    5   11:ifeq            40
    //    6   14:ldc1            #32  <String "FragmentManager">
    //    7   16:new             #140 <Class StringBuilder>
    //    8   19:dup             
    //    9   20:invokespecial   #141 <Method void StringBuilder()>
    //   10   23:ldc2            #683 <String "Freeing fragment index ">
    //   11   26:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   12   29:aload_1         
    //   13   30:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   14   33:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   15   36:invokestatic    #260 <Method int Log.v(String, String)>
    //   16   39:pop             
    //   17   40:aload_0         
    //   18   41:getfield        #420 <Field ArrayList mActive>
    //   19   44:aload_1         
    //   20   45:getfield        #674 <Field int Fragment.mIndex>
    //   21   48:aconst_null     
    //   22   49:invokevirtual   #328 <Method Object ArrayList.set(int, Object)>
    //   23   52:pop             
    //   24   53:aload_0         
    //   25   54:getfield        #503 <Field ArrayList mAvailIndices>
    //   26   57:ifnonnull       71
    //   27   60:aload_0         
    //   28   61:new             #240 <Class ArrayList>
    //   29   64:dup             
    //   30   65:invokespecial   #241 <Method void ArrayList()>
    //   31   68:putfield        #503 <Field ArrayList mAvailIndices>
    //   32   71:aload_0         
    //   33   72:getfield        #503 <Field ArrayList mAvailIndices>
    //   34   75:aload_1         
    //   35   76:getfield        #674 <Field int Fragment.mIndex>
    //   36   79:invokestatic    #589 <Method Integer Integer.valueOf(int)>
    //   37   82:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   38   85:pop             
    //   39   86:aload_0         
    //   40   87:getfield        #216 <Field FragmentActivity mActivity>
    //   41   90:aload_1         
    //   42   91:getfield        #686 <Field String Fragment.mWho>
    //   43   94:invokevirtual   #689 <Method void FragmentActivity.invalidateSupportFragment(String)>
    //   44   97:aload_1         
    //   45   98:invokevirtual   #692 <Method void Fragment.initState()>
    //   46  101:return          
    }

    void moveToState(int i, int j, int k, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #216 <Field FragmentActivity mActivity>
    //    2    4:ifnonnull       22
    //    3    7:iload_1         
    //    4    8:ifeq            22
    //    5   11:new             #131 <Class IllegalStateException>
    //    6   14:dup             
    //    7   15:ldc2            #695 <String "No activity">
    //    8   18:invokespecial   #136 <Method void IllegalStateException(String)>
    //    9   21:athrow          
    //   10   22:iload           4
    //   11   24:ifne            36
    //   12   27:aload_0         
    //   13   28:getfield        #115 <Field int mCurState>
    //   14   31:iload_1         
    //   15   32:icmpne          36
    //   16   35:return          
    //   17   36:aload_0         
    //   18   37:iload_1         
    //   19   38:putfield        #115 <Field int mCurState>
    //   20   41:aload_0         
    //   21   42:getfield        #420 <Field ArrayList mActive>
    //   22   45:ifnull          35
    //   23   48:iconst_0        
    //   24   49:istore          5
    //   25   51:iconst_0        
    //   26   52:istore          6
    //   27   54:iload           6
    //   28   56:aload_0         
    //   29   57:getfield        #420 <Field ArrayList mActive>
    //   30   60:invokevirtual   #302 <Method int ArrayList.size()>
    //   31   63:icmpge          122
    //   32   66:aload_0         
    //   33   67:getfield        #420 <Field ArrayList mActive>
    //   34   70:iload           6
    //   35   72:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   36   75:checkcast       #266 <Class Fragment>
    //   37   78:astore          7
    //   38   80:aload           7
    //   39   82:ifnull          116
    //   40   85:aload_0         
    //   41   86:aload           7
    //   42   88:iload_1         
    //   43   89:iload_2         
    //   44   90:iload_3         
    //   45   91:iconst_0        
    //   46   92:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   47   95:aload           7
    //   48   97:getfield        #546 <Field LoaderManagerImpl Fragment.mLoaderManager>
    //   49  100:ifnull          116
    //   50  103:iload           5
    //   51  105:aload           7
    //   52  107:getfield        #546 <Field LoaderManagerImpl Fragment.mLoaderManager>
    //   53  110:invokevirtual   #551 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
    //   54  113:ior             
    //   55  114:istore          5
    //   56  116:iinc            6  1
    //   57  119:goto            54
    //   58  122:iload           5
    //   59  124:ifne            131
    //   60  127:aload_0         
    //   61  128:invokevirtual   #565 <Method void startPendingDeferredFragments()>
    //   62  131:aload_0         
    //   63  132:getfield        #287 <Field boolean mNeedMenuInvalidate>
    //   64  135:ifeq            35
    //   65  138:aload_0         
    //   66  139:getfield        #216 <Field FragmentActivity mActivity>
    //   67  142:ifnull          35
    //   68  145:aload_0         
    //   69  146:getfield        #115 <Field int mCurState>
    //   70  149:iconst_5        
    //   71  150:icmpne          35
    //   72  153:aload_0         
    //   73  154:getfield        #216 <Field FragmentActivity mActivity>
    //   74  157:invokevirtual   #698 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
    //   75  160:aload_0         
    //   76  161:iconst_0        
    //   77  162:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   78  165:return          
    }

    void moveToState(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_0        
    //    3    3:iconst_0        
    //    4    4:iload_2         
    //    5    5:invokevirtual   #700 <Method void moveToState(int, int, int, boolean)>
    //    6    8:return          
    }

    void moveToState(Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #115 <Field int mCurState>
    //    4    6:iconst_0        
    //    5    7:iconst_0        
    //    6    8:iconst_0        
    //    7    9:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //    8   12:return          
    }

    void moveToState(Fragment fragment, int i, int j, int k, boolean flag)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #276 <Field boolean Fragment.mAdded>
    //    2    4:ifeq            14
    //    3    7:aload_1         
    //    4    8:getfield        #269 <Field boolean Fragment.mDetached>
    //    5   11:ifeq            21
    //    6   14:iload_2         
    //    7   15:iconst_1        
    //    8   16:icmple          21
    //    9   19:iconst_1        
    //   10   20:istore_2        
    //   11   21:aload_1         
    //   12   22:getfield        #279 <Field boolean Fragment.mRemoving>
    //   13   25:ifeq            41
    //   14   28:iload_2         
    //   15   29:aload_1         
    //   16   30:getfield        #703 <Field int Fragment.mState>
    //   17   33:icmple          41
    //   18   36:aload_1         
    //   19   37:getfield        #703 <Field int Fragment.mState>
    //   20   40:istore_2        
    //   21   41:aload_1         
    //   22   42:getfield        #706 <Field boolean Fragment.mDeferStart>
    //   23   45:ifeq            63
    //   24   48:aload_1         
    //   25   49:getfield        #703 <Field int Fragment.mState>
    //   26   52:iconst_4        
    //   27   53:icmpge          63
    //   28   56:iload_2         
    //   29   57:iconst_3        
    //   30   58:icmple          63
    //   31   61:iconst_3        
    //   32   62:istore_2        
    //   33   63:aload_1         
    //   34   64:getfield        #703 <Field int Fragment.mState>
    //   35   67:iload_2         
    //   36   68:icmpge          915
    //   37   71:aload_1         
    //   38   72:getfield        #709 <Field boolean Fragment.mFromLayout>
    //   39   75:ifeq            86
    //   40   78:aload_1         
    //   41   79:getfield        #712 <Field boolean Fragment.mInLayout>
    //   42   82:ifne            86
    //   43   85:return          
    //   44   86:aload_1         
    //   45   87:getfield        #715 <Field View Fragment.mAnimatingAway>
    //   46   90:ifnull          110
    //   47   93:aload_1         
    //   48   94:aconst_null     
    //   49   95:putfield        #715 <Field View Fragment.mAnimatingAway>
    //   50   98:aload_0         
    //   51   99:aload_1         
    //   52  100:aload_1         
    //   53  101:getfield        #718 <Field int Fragment.mStateAfterAnimating>
    //   54  104:iconst_0        
    //   55  105:iconst_0        
    //   56  106:iconst_1        
    //   57  107:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   58  110:aload_1         
    //   59  111:getfield        #703 <Field int Fragment.mState>
    //   60  114:tableswitch     0 4: default 148
    //                   0 154
    //                   1 495
    //                   2 799
    //                   3 799
    //                   4 840
    //   61  148:aload_1         
    //   62  149:iload_2         
    //   63  150:putfield        #703 <Field int Fragment.mState>
    //   64  153:return          
    //   65  154:getstatic       #85  <Field boolean DEBUG>
    //   66  157:ifeq            186
    //   67  160:ldc1            #32  <String "FragmentManager">
    //   68  162:new             #140 <Class StringBuilder>
    //   69  165:dup             
    //   70  166:invokespecial   #141 <Method void StringBuilder()>
    //   71  169:ldc2            #720 <String "moveto CREATED: ">
    //   72  172:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   73  175:aload_1         
    //   74  176:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   75  179:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   76  182:invokestatic    #260 <Method int Log.v(String, String)>
    //   77  185:pop             
    //   78  186:aload_1         
    //   79  187:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //   80  190:ifnull          274
    //   81  193:aload_1         
    //   82  194:aload_1         
    //   83  195:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //   84  198:ldc1            #44  <String "android:view_state">
    //   85  200:invokevirtual   #727 <Method SparseArray Bundle.getSparseParcelableArray(String)>
    //   86  203:putfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   87  206:aload_1         
    //   88  207:aload_0         
    //   89  208:aload_1         
    //   90  209:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //   91  212:ldc1            #38  <String "android:target_state">
    //   92  214:invokevirtual   #732 <Method Fragment getFragment(Bundle, String)>
    //   93  217:putfield        #735 <Field Fragment Fragment.mTarget>
    //   94  220:aload_1         
    //   95  221:getfield        #735 <Field Fragment Fragment.mTarget>
    //   96  224:ifnull          241
    //   97  227:aload_1         
    //   98  228:aload_1         
    //   99  229:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  100  232:ldc1            #35  <String "android:target_req_state">
    //  101  234:iconst_0        
    //  102  235:invokevirtual   #602 <Method int Bundle.getInt(String, int)>
    //  103  238:putfield        #738 <Field int Fragment.mTargetRequestCode>
    //  104  241:aload_1         
    //  105  242:aload_1         
    //  106  243:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  107  246:ldc1            #41  <String "android:user_visible_hint">
    //  108  248:iconst_1        
    //  109  249:invokevirtual   #742 <Method boolean Bundle.getBoolean(String, boolean)>
    //  110  252:putfield        #745 <Field boolean Fragment.mUserVisibleHint>
    //  111  255:aload_1         
    //  112  256:getfield        #745 <Field boolean Fragment.mUserVisibleHint>
    //  113  259:ifne            274
    //  114  262:aload_1         
    //  115  263:iconst_1        
    //  116  264:putfield        #706 <Field boolean Fragment.mDeferStart>
    //  117  267:iload_2         
    //  118  268:iconst_3        
    //  119  269:icmple          274
    //  120  272:iconst_3        
    //  121  273:istore_2        
    //  122  274:aload_1         
    //  123  275:aload_0         
    //  124  276:getfield        #216 <Field FragmentActivity mActivity>
    //  125  279:putfield        #746 <Field FragmentActivity Fragment.mActivity>
    //  126  282:aload_1         
    //  127  283:aload_0         
    //  128  284:getfield        #336 <Field Fragment mParent>
    //  129  287:putfield        #749 <Field Fragment Fragment.mParentFragment>
    //  130  290:aload_0         
    //  131  291:getfield        #336 <Field Fragment mParent>
    //  132  294:ifnull          366
    //  133  297:aload_0         
    //  134  298:getfield        #336 <Field Fragment mParent>
    //  135  301:getfield        #753 <Field FragmentManagerImpl Fragment.mChildFragmentManager>
    //  136  304:astore          21
    //  137  306:aload_1         
    //  138  307:aload           21
    //  139  309:putfield        #756 <Field FragmentManagerImpl Fragment.mFragmentManager>
    //  140  312:aload_1         
    //  141  313:iconst_0        
    //  142  314:putfield        #759 <Field boolean Fragment.mCalled>
    //  143  317:aload_1         
    //  144  318:aload_0         
    //  145  319:getfield        #216 <Field FragmentActivity mActivity>
    //  146  322:invokevirtual   #763 <Method void Fragment.onAttach(android.app.Activity)>
    //  147  325:aload_1         
    //  148  326:getfield        #759 <Field boolean Fragment.mCalled>
    //  149  329:ifne            378
    //  150  332:new             #765 <Class SuperNotCalledException>
    //  151  335:dup             
    //  152  336:new             #140 <Class StringBuilder>
    //  153  339:dup             
    //  154  340:invokespecial   #141 <Method void StringBuilder()>
    //  155  343:ldc2            #767 <String "Fragment ">
    //  156  346:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  157  349:aload_1         
    //  158  350:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  159  353:ldc2            #769 <String " did not call through to super.onAttach()">
    //  160  356:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  161  359:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  162  362:invokespecial   #770 <Method void SuperNotCalledException(String)>
    //  163  365:athrow          
    //  164  366:aload_0         
    //  165  367:getfield        #216 <Field FragmentActivity mActivity>
    //  166  370:getfield        #773 <Field FragmentManagerImpl FragmentActivity.mFragments>
    //  167  373:astore          21
    //  168  375:goto            306
    //  169  378:aload_1         
    //  170  379:getfield        #749 <Field Fragment Fragment.mParentFragment>
    //  171  382:ifnonnull       393
    //  172  385:aload_0         
    //  173  386:getfield        #216 <Field FragmentActivity mActivity>
    //  174  389:aload_1         
    //  175  390:invokevirtual   #776 <Method void FragmentActivity.onAttachFragment(Fragment)>
    //  176  393:aload_1         
    //  177  394:getfield        #779 <Field boolean Fragment.mRetaining>
    //  178  397:ifne            408
    //  179  400:aload_1         
    //  180  401:aload_1         
    //  181  402:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  182  405:invokevirtual   #783 <Method void Fragment.performCreate(Bundle)>
    //  183  408:aload_1         
    //  184  409:iconst_0        
    //  185  410:putfield        #779 <Field boolean Fragment.mRetaining>
    //  186  413:aload_1         
    //  187  414:getfield        #709 <Field boolean Fragment.mFromLayout>
    //  188  417:ifeq            495
    //  189  420:aload_1         
    //  190  421:aload_1         
    //  191  422:aload_1         
    //  192  423:aload_1         
    //  193  424:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  194  427:invokevirtual   #787 <Method android.view.LayoutInflater Fragment.getLayoutInflater(Bundle)>
    //  195  430:aconst_null     
    //  196  431:aload_1         
    //  197  432:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  198  435:invokevirtual   #791 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
    //  199  438:putfield        #620 <Field View Fragment.mView>
    //  200  441:aload_1         
    //  201  442:getfield        #620 <Field View Fragment.mView>
    //  202  445:ifnull          899
    //  203  448:aload_1         
    //  204  449:aload_1         
    //  205  450:getfield        #620 <Field View Fragment.mView>
    //  206  453:putfield        #794 <Field View Fragment.mInnerView>
    //  207  456:aload_1         
    //  208  457:aload_1         
    //  209  458:getfield        #620 <Field View Fragment.mView>
    //  210  461:invokestatic    #800 <Method ViewGroup NoSaveStateFrameLayout.wrap(View)>
    //  211  464:putfield        #620 <Field View Fragment.mView>
    //  212  467:aload_1         
    //  213  468:getfield        #616 <Field boolean Fragment.mHidden>
    //  214  471:ifeq            483
    //  215  474:aload_1         
    //  216  475:getfield        #620 <Field View Fragment.mView>
    //  217  478:bipush          8
    //  218  480:invokevirtual   #632 <Method void View.setVisibility(int)>
    //  219  483:aload_1         
    //  220  484:aload_1         
    //  221  485:getfield        #620 <Field View Fragment.mView>
    //  222  488:aload_1         
    //  223  489:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  224  492:invokevirtual   #804 <Method void Fragment.onViewCreated(View, Bundle)>
    //  225  495:iload_2         
    //  226  496:iconst_1        
    //  227  497:icmple          799
    //  228  500:getstatic       #85  <Field boolean DEBUG>
    //  229  503:ifeq            532
    //  230  506:ldc1            #32  <String "FragmentManager">
    //  231  508:new             #140 <Class StringBuilder>
    //  232  511:dup             
    //  233  512:invokespecial   #141 <Method void StringBuilder()>
    //  234  515:ldc2            #806 <String "moveto ACTIVITY_CREATED: ">
    //  235  518:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  236  521:aload_1         
    //  237  522:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  238  525:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  239  528:invokestatic    #260 <Method int Log.v(String, String)>
    //  240  531:pop             
    //  241  532:aload_1         
    //  242  533:getfield        #709 <Field boolean Fragment.mFromLayout>
    //  243  536:ifne            771
    //  244  539:aload_1         
    //  245  540:getfield        #809 <Field int Fragment.mContainerId>
    //  246  543:istore          17
    //  247  545:aconst_null     
    //  248  546:astore          18
    //  249  548:iload           17
    //  250  550:ifeq            650
    //  251  553:aload_0         
    //  252  554:getfield        #334 <Field FragmentContainer mContainer>
    //  253  557:aload_1         
    //  254  558:getfield        #809 <Field int Fragment.mContainerId>
    //  255  561:invokeinterface #815 <Method View FragmentContainer.findViewById(int)>
    //  256  566:checkcast       #817 <Class ViewGroup>
    //  257  569:astore          18
    //  258  571:aload           18
    //  259  573:ifnonnull       650
    //  260  576:aload_1         
    //  261  577:getfield        #820 <Field boolean Fragment.mRestored>
    //  262  580:ifne            650
    //  263  583:aload_0         
    //  264  584:new             #822 <Class IllegalArgumentException>
    //  265  587:dup             
    //  266  588:new             #140 <Class StringBuilder>
    //  267  591:dup             
    //  268  592:invokespecial   #141 <Method void StringBuilder()>
    //  269  595:ldc2            #824 <String "No view found for id 0x">
    //  270  598:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  271  601:aload_1         
    //  272  602:getfield        #809 <Field int Fragment.mContainerId>
    //  273  605:invokestatic    #435 <Method String Integer.toHexString(int)>
    //  274  608:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  275  611:ldc2            #826 <String " (">
    //  276  614:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  277  617:aload_1         
    //  278  618:invokevirtual   #830 <Method Resources Fragment.getResources()>
    //  279  621:aload_1         
    //  280  622:getfield        #809 <Field int Fragment.mContainerId>
    //  281  625:invokevirtual   #835 <Method String Resources.getResourceName(int)>
    //  282  628:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  283  631:ldc2            #837 <String ") for fragment ">
    //  284  634:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  285  637:aload_1         
    //  286  638:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  287  641:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  288  644:invokespecial   #838 <Method void IllegalArgumentException(String)>
    //  289  647:invokespecial   #608 <Method void throwException(RuntimeException)>
    //  290  650:aload_1         
    //  291  651:aload           18
    //  292  653:putfield        #841 <Field ViewGroup Fragment.mContainer>
    //  293  656:aload_1         
    //  294  657:aload_1         
    //  295  658:aload_1         
    //  296  659:aload_1         
    //  297  660:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  298  663:invokevirtual   #787 <Method android.view.LayoutInflater Fragment.getLayoutInflater(Bundle)>
    //  299  666:aload           18
    //  300  668:aload_1         
    //  301  669:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  302  672:invokevirtual   #791 <Method View Fragment.performCreateView(android.view.LayoutInflater, ViewGroup, Bundle)>
    //  303  675:putfield        #620 <Field View Fragment.mView>
    //  304  678:aload_1         
    //  305  679:getfield        #620 <Field View Fragment.mView>
    //  306  682:ifnull          907
    //  307  685:aload_1         
    //  308  686:aload_1         
    //  309  687:getfield        #620 <Field View Fragment.mView>
    //  310  690:putfield        #794 <Field View Fragment.mInnerView>
    //  311  693:aload_1         
    //  312  694:aload_1         
    //  313  695:getfield        #620 <Field View Fragment.mView>
    //  314  698:invokestatic    #800 <Method ViewGroup NoSaveStateFrameLayout.wrap(View)>
    //  315  701:putfield        #620 <Field View Fragment.mView>
    //  316  704:aload           18
    //  317  706:ifnull          743
    //  318  709:aload_0         
    //  319  710:aload_1         
    //  320  711:iload_3         
    //  321  712:iconst_1        
    //  322  713:iload           4
    //  323  715:invokevirtual   #624 <Method Animation loadAnimation(Fragment, int, boolean, int)>
    //  324  718:astore          19
    //  325  720:aload           19
    //  326  722:ifnull          734
    //  327  725:aload_1         
    //  328  726:getfield        #620 <Field View Fragment.mView>
    //  329  729:aload           19
    //  330  731:invokevirtual   #629 <Method void View.startAnimation(Animation)>
    //  331  734:aload           18
    //  332  736:aload_1         
    //  333  737:getfield        #620 <Field View Fragment.mView>
    //  334  740:invokevirtual   #845 <Method void ViewGroup.addView(View)>
    //  335  743:aload_1         
    //  336  744:getfield        #616 <Field boolean Fragment.mHidden>
    //  337  747:ifeq            759
    //  338  750:aload_1         
    //  339  751:getfield        #620 <Field View Fragment.mView>
    //  340  754:bipush          8
    //  341  756:invokevirtual   #632 <Method void View.setVisibility(int)>
    //  342  759:aload_1         
    //  343  760:aload_1         
    //  344  761:getfield        #620 <Field View Fragment.mView>
    //  345  764:aload_1         
    //  346  765:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  347  768:invokevirtual   #804 <Method void Fragment.onViewCreated(View, Bundle)>
    //  348  771:aload_1         
    //  349  772:aload_1         
    //  350  773:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  351  776:invokevirtual   #848 <Method void Fragment.performActivityCreated(Bundle)>
    //  352  779:aload_1         
    //  353  780:getfield        #620 <Field View Fragment.mView>
    //  354  783:ifnull          794
    //  355  786:aload_1         
    //  356  787:aload_1         
    //  357  788:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  358  791:invokevirtual   #851 <Method void Fragment.restoreViewState(Bundle)>
    //  359  794:aload_1         
    //  360  795:aconst_null     
    //  361  796:putfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  362  799:iload_2         
    //  363  800:iconst_3        
    //  364  801:icmple          840
    //  365  804:getstatic       #85  <Field boolean DEBUG>
    //  366  807:ifeq            836
    //  367  810:ldc1            #32  <String "FragmentManager">
    //  368  812:new             #140 <Class StringBuilder>
    //  369  815:dup             
    //  370  816:invokespecial   #141 <Method void StringBuilder()>
    //  371  819:ldc2            #853 <String "moveto STARTED: ">
    //  372  822:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  373  825:aload_1         
    //  374  826:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  375  829:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  376  832:invokestatic    #260 <Method int Log.v(String, String)>
    //  377  835:pop             
    //  378  836:aload_1         
    //  379  837:invokevirtual   #856 <Method void Fragment.performStart()>
    //  380  840:iload_2         
    //  381  841:iconst_4        
    //  382  842:icmple          148
    //  383  845:getstatic       #85  <Field boolean DEBUG>
    //  384  848:ifeq            877
    //  385  851:ldc1            #32  <String "FragmentManager">
    //  386  853:new             #140 <Class StringBuilder>
    //  387  856:dup             
    //  388  857:invokespecial   #141 <Method void StringBuilder()>
    //  389  860:ldc2            #858 <String "moveto RESUMED: ">
    //  390  863:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  391  866:aload_1         
    //  392  867:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  393  870:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  394  873:invokestatic    #260 <Method int Log.v(String, String)>
    //  395  876:pop             
    //  396  877:aload_1         
    //  397  878:iconst_1        
    //  398  879:putfield        #861 <Field boolean Fragment.mResumed>
    //  399  882:aload_1         
    //  400  883:invokevirtual   #864 <Method void Fragment.performResume()>
    //  401  886:aload_1         
    //  402  887:aconst_null     
    //  403  888:putfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  404  891:aload_1         
    //  405  892:aconst_null     
    //  406  893:putfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //  407  896:goto            148
    //  408  899:aload_1         
    //  409  900:aconst_null     
    //  410  901:putfield        #794 <Field View Fragment.mInnerView>
    //  411  904:goto            495
    //  412  907:aload_1         
    //  413  908:aconst_null     
    //  414  909:putfield        #794 <Field View Fragment.mInnerView>
    //  415  912:goto            771
    //  416  915:aload_1         
    //  417  916:getfield        #703 <Field int Fragment.mState>
    //  418  919:iload_2         
    //  419  920:icmple          148
    //  420  923:aload_1         
    //  421  924:getfield        #703 <Field int Fragment.mState>
    //  422  927:tableswitch     1 5: default 960
    //                   1 963
    //                   2 1143
    //                   3 1102
    //                   4 1061
    //                   5 1015
    //  423  960:goto            148
    //  424  963:iload_2         
    //  425  964:iconst_1        
    //  426  965:icmpge          148
    //  427  968:aload_0         
    //  428  969:getfield        #388 <Field boolean mDestroyed>
    //  429  972:ifeq            998
    //  430  975:aload_1         
    //  431  976:getfield        #715 <Field View Fragment.mAnimatingAway>
    //  432  979:ifnull          998
    //  433  982:aload_1         
    //  434  983:getfield        #715 <Field View Fragment.mAnimatingAway>
    //  435  986:astore          7
    //  436  988:aload_1         
    //  437  989:aconst_null     
    //  438  990:putfield        #715 <Field View Fragment.mAnimatingAway>
    //  439  993:aload           7
    //  440  995:invokevirtual   #867 <Method void View.clearAnimation()>
    //  441  998:aload_1         
    //  442  999:getfield        #715 <Field View Fragment.mAnimatingAway>
    //  443 1002:ifnull          1336
    //  444 1005:aload_1         
    //  445 1006:iload_2         
    //  446 1007:putfield        #718 <Field int Fragment.mStateAfterAnimating>
    //  447 1010:iconst_1        
    //  448 1011:istore_2        
    //  449 1012:goto            148
    //  450 1015:iload_2         
    //  451 1016:iconst_5        
    //  452 1017:icmpge          1061
    //  453 1020:getstatic       #85  <Field boolean DEBUG>
    //  454 1023:ifeq            1052
    //  455 1026:ldc1            #32  <String "FragmentManager">
    //  456 1028:new             #140 <Class StringBuilder>
    //  457 1031:dup             
    //  458 1032:invokespecial   #141 <Method void StringBuilder()>
    //  459 1035:ldc2            #869 <String "movefrom RESUMED: ">
    //  460 1038:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  461 1041:aload_1         
    //  462 1042:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  463 1045:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  464 1048:invokestatic    #260 <Method int Log.v(String, String)>
    //  465 1051:pop             
    //  466 1052:aload_1         
    //  467 1053:invokevirtual   #872 <Method void Fragment.performPause()>
    //  468 1056:aload_1         
    //  469 1057:iconst_0        
    //  470 1058:putfield        #861 <Field boolean Fragment.mResumed>
    //  471 1061:iload_2         
    //  472 1062:iconst_4        
    //  473 1063:icmpge          1102
    //  474 1066:getstatic       #85  <Field boolean DEBUG>
    //  475 1069:ifeq            1098
    //  476 1072:ldc1            #32  <String "FragmentManager">
    //  477 1074:new             #140 <Class StringBuilder>
    //  478 1077:dup             
    //  479 1078:invokespecial   #141 <Method void StringBuilder()>
    //  480 1081:ldc2            #874 <String "movefrom STARTED: ">
    //  481 1084:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  482 1087:aload_1         
    //  483 1088:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  484 1091:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  485 1094:invokestatic    #260 <Method int Log.v(String, String)>
    //  486 1097:pop             
    //  487 1098:aload_1         
    //  488 1099:invokevirtual   #877 <Method void Fragment.performStop()>
    //  489 1102:iload_2         
    //  490 1103:iconst_3        
    //  491 1104:icmpge          1143
    //  492 1107:getstatic       #85  <Field boolean DEBUG>
    //  493 1110:ifeq            1139
    //  494 1113:ldc1            #32  <String "FragmentManager">
    //  495 1115:new             #140 <Class StringBuilder>
    //  496 1118:dup             
    //  497 1119:invokespecial   #141 <Method void StringBuilder()>
    //  498 1122:ldc2            #879 <String "movefrom STOPPED: ">
    //  499 1125:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  500 1128:aload_1         
    //  501 1129:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  502 1132:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  503 1135:invokestatic    #260 <Method int Log.v(String, String)>
    //  504 1138:pop             
    //  505 1139:aload_1         
    //  506 1140:invokevirtual   #882 <Method void Fragment.performReallyStop()>
    //  507 1143:iload_2         
    //  508 1144:iconst_2        
    //  509 1145:icmpge          963
    //  510 1148:getstatic       #85  <Field boolean DEBUG>
    //  511 1151:ifeq            1180
    //  512 1154:ldc1            #32  <String "FragmentManager">
    //  513 1156:new             #140 <Class StringBuilder>
    //  514 1159:dup             
    //  515 1160:invokespecial   #141 <Method void StringBuilder()>
    //  516 1163:ldc2            #884 <String "movefrom ACTIVITY_CREATED: ">
    //  517 1166:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  518 1169:aload_1         
    //  519 1170:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  520 1173:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  521 1176:invokestatic    #260 <Method int Log.v(String, String)>
    //  522 1179:pop             
    //  523 1180:aload_1         
    //  524 1181:getfield        #620 <Field View Fragment.mView>
    //  525 1184:ifnull          1209
    //  526 1187:aload_0         
    //  527 1188:getfield        #216 <Field FragmentActivity mActivity>
    //  528 1191:invokevirtual   #887 <Method boolean FragmentActivity.isFinishing()>
    //  529 1194:ifne            1209
    //  530 1197:aload_1         
    //  531 1198:getfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //  532 1201:ifnonnull       1209
    //  533 1204:aload_0         
    //  534 1205:aload_1         
    //  535 1206:invokevirtual   #890 <Method void saveFragmentViewState(Fragment)>
    //  536 1209:aload_1         
    //  537 1210:invokevirtual   #893 <Method void Fragment.performDestroyView()>
    //  538 1213:aload_1         
    //  539 1214:getfield        #620 <Field View Fragment.mView>
    //  540 1217:ifnull          1318
    //  541 1220:aload_1         
    //  542 1221:getfield        #841 <Field ViewGroup Fragment.mContainer>
    //  543 1224:ifnull          1318
    //  544 1227:aload_0         
    //  545 1228:getfield        #115 <Field int mCurState>
    //  546 1231:istore          8
    //  547 1233:aconst_null     
    //  548 1234:astore          9
    //  549 1236:iload           8
    //  550 1238:ifle            1266
    //  551 1241:aload_0         
    //  552 1242:getfield        #388 <Field boolean mDestroyed>
    //  553 1245:istore          10
    //  554 1247:aconst_null     
    //  555 1248:astore          9
    //  556 1250:iload           10
    //  557 1252:ifne            1266
    //  558 1255:aload_0         
    //  559 1256:aload_1         
    //  560 1257:iload_3         
    //  561 1258:iconst_0        
    //  562 1259:iload           4
    //  563 1261:invokevirtual   #624 <Method Animation loadAnimation(Fragment, int, boolean, int)>
    //  564 1264:astore          9
    //  565 1266:aload           9
    //  566 1268:ifnull          1307
    //  567 1271:aload_1         
    //  568 1272:aload_1         
    //  569 1273:getfield        #620 <Field View Fragment.mView>
    //  570 1276:putfield        #715 <Field View Fragment.mAnimatingAway>
    //  571 1279:aload_1         
    //  572 1280:iload_2         
    //  573 1281:putfield        #718 <Field int Fragment.mStateAfterAnimating>
    //  574 1284:aload           9
    //  575 1286:new             #895 <Class FragmentManagerImpl$5>
    //  576 1289:dup             
    //  577 1290:aload_0         
    //  578 1291:aload_1         
    //  579 1292:invokespecial   #898 <Method void FragmentManagerImpl$5(FragmentManagerImpl, Fragment)>
    //  580 1295:invokevirtual   #904 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
    //  581 1298:aload_1         
    //  582 1299:getfield        #620 <Field View Fragment.mView>
    //  583 1302:aload           9
    //  584 1304:invokevirtual   #629 <Method void View.startAnimation(Animation)>
    //  585 1307:aload_1         
    //  586 1308:getfield        #841 <Field ViewGroup Fragment.mContainer>
    //  587 1311:aload_1         
    //  588 1312:getfield        #620 <Field View Fragment.mView>
    //  589 1315:invokevirtual   #907 <Method void ViewGroup.removeView(View)>
    //  590 1318:aload_1         
    //  591 1319:aconst_null     
    //  592 1320:putfield        #841 <Field ViewGroup Fragment.mContainer>
    //  593 1323:aload_1         
    //  594 1324:aconst_null     
    //  595 1325:putfield        #620 <Field View Fragment.mView>
    //  596 1328:aload_1         
    //  597 1329:aconst_null     
    //  598 1330:putfield        #794 <Field View Fragment.mInnerView>
    //  599 1333:goto            963
    //  600 1336:getstatic       #85  <Field boolean DEBUG>
    //  601 1339:ifeq            1368
    //  602 1342:ldc1            #32  <String "FragmentManager">
    //  603 1344:new             #140 <Class StringBuilder>
    //  604 1347:dup             
    //  605 1348:invokespecial   #141 <Method void StringBuilder()>
    //  606 1351:ldc2            #909 <String "movefrom CREATED: ">
    //  607 1354:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  608 1357:aload_1         
    //  609 1358:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  610 1361:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  611 1364:invokestatic    #260 <Method int Log.v(String, String)>
    //  612 1367:pop             
    //  613 1368:aload_1         
    //  614 1369:getfield        #779 <Field boolean Fragment.mRetaining>
    //  615 1372:ifne            1379
    //  616 1375:aload_1         
    //  617 1376:invokevirtual   #912 <Method void Fragment.performDestroy()>
    //  618 1379:aload_1         
    //  619 1380:iconst_0        
    //  620 1381:putfield        #759 <Field boolean Fragment.mCalled>
    //  621 1384:aload_1         
    //  622 1385:invokevirtual   #915 <Method void Fragment.onDetach()>
    //  623 1388:aload_1         
    //  624 1389:getfield        #759 <Field boolean Fragment.mCalled>
    //  625 1392:ifne            1429
    //  626 1395:new             #765 <Class SuperNotCalledException>
    //  627 1398:dup             
    //  628 1399:new             #140 <Class StringBuilder>
    //  629 1402:dup             
    //  630 1403:invokespecial   #141 <Method void StringBuilder()>
    //  631 1406:ldc2            #767 <String "Fragment ">
    //  632 1409:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  633 1412:aload_1         
    //  634 1413:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  635 1416:ldc2            #917 <String " did not call through to super.onDetach()">
    //  636 1419:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  637 1422:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  638 1425:invokespecial   #770 <Method void SuperNotCalledException(String)>
    //  639 1428:athrow          
    //  640 1429:iload           5
    //  641 1431:ifne            148
    //  642 1434:aload_1         
    //  643 1435:getfield        #779 <Field boolean Fragment.mRetaining>
    //  644 1438:ifne            1449
    //  645 1441:aload_0         
    //  646 1442:aload_1         
    //  647 1443:invokevirtual   #919 <Method void makeInactive(Fragment)>
    //  648 1446:goto            148
    //  649 1449:aload_1         
    //  650 1450:aconst_null     
    //  651 1451:putfield        #746 <Field FragmentActivity Fragment.mActivity>
    //  652 1454:aload_1         
    //  653 1455:aconst_null     
    //  654 1456:putfield        #756 <Field FragmentManagerImpl Fragment.mFragmentManager>
    //  655 1459:goto            148
    }

    public void noteStateNotSaved()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #129 <Field boolean mStateSaved>
    //    3    5:return          
    }

    public void performPendingDeferredStart(Fragment fragment)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #706 <Field boolean Fragment.mDeferStart>
    //    2    4:ifeq            19
    //    3    7:aload_0         
    //    4    8:getfield        #527 <Field boolean mExecutingActions>
    //    5   11:ifeq            20
    //    6   14:aload_0         
    //    7   15:iconst_1        
    //    8   16:putfield        #542 <Field boolean mHavePendingDeferredStart>
    //    9   19:return          
    //   10   20:aload_1         
    //   11   21:iconst_0        
    //   12   22:putfield        #706 <Field boolean Fragment.mDeferStart>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:aload_0         
    //   16   28:getfield        #115 <Field int mCurState>
    //   17   31:iconst_0        
    //   18   32:iconst_0        
    //   19   33:iconst_0        
    //   20   34:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   21   37:return          
    }

    public void popBackStack()
    {
    //    0    0:aload_0         
    //    1    1:new             #924 <Class FragmentManagerImpl$2>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:invokespecial   #925 <Method void FragmentManagerImpl$2(FragmentManagerImpl)>
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #927 <Method void enqueueAction(Runnable, boolean)>
    //    7   13:return          
    }

    public void popBackStack(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:ifge            32
    //    2    4:new             #822 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:new             #140 <Class StringBuilder>
    //    5   11:dup             
    //    6   12:invokespecial   #141 <Method void StringBuilder()>
    //    7   15:ldc2            #930 <String "Bad id: ">
    //    8   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    9   21:iload_1         
    //   10   22:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   11   25:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   12   28:invokespecial   #838 <Method void IllegalArgumentException(String)>
    //   13   31:athrow          
    //   14   32:aload_0         
    //   15   33:new             #932 <Class FragmentManagerImpl$4>
    //   16   36:dup             
    //   17   37:aload_0         
    //   18   38:iload_1         
    //   19   39:iload_2         
    //   20   40:invokespecial   #935 <Method void FragmentManagerImpl$4(FragmentManagerImpl, int, int)>
    //   21   43:iconst_0        
    //   22   44:invokevirtual   #927 <Method void enqueueAction(Runnable, boolean)>
    //   23   47:return          
    }

    public void popBackStack(String s, int i)
    {
    //    0    0:aload_0         
    //    1    1:new             #938 <Class FragmentManagerImpl$3>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:iload_2         
    //    6    8:invokespecial   #941 <Method void FragmentManagerImpl$3(FragmentManagerImpl, String, int)>
    //    7   11:iconst_0        
    //    8   12:invokevirtual   #927 <Method void enqueueAction(Runnable, boolean)>
    //    9   15:return          
    }

    public boolean popBackStackImmediate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #509 <Method void checkStateLoss()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #944 <Method boolean executePendingTransactions()>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:getfield        #216 <Field FragmentActivity mActivity>
    //    8   14:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //    9   17:aconst_null     
    //   10   18:iconst_m1       
    //   11   19:iconst_0        
    //   12   20:invokevirtual   #948 <Method boolean popBackStackState(Handler, String, int, int)>
    //   13   23:ireturn         
    }

    public boolean popBackStackImmediate(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #509 <Method void checkStateLoss()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #944 <Method boolean executePendingTransactions()>
    //    4    8:pop             
    //    5    9:iload_1         
    //    6   10:ifge            41
    //    7   13:new             #822 <Class IllegalArgumentException>
    //    8   16:dup             
    //    9   17:new             #140 <Class StringBuilder>
    //   10   20:dup             
    //   11   21:invokespecial   #141 <Method void StringBuilder()>
    //   12   24:ldc2            #930 <String "Bad id: ">
    //   13   27:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   14   30:iload_1         
    //   15   31:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   16   34:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   17   37:invokespecial   #838 <Method void IllegalArgumentException(String)>
    //   18   40:athrow          
    //   19   41:aload_0         
    //   20   42:aload_0         
    //   21   43:getfield        #216 <Field FragmentActivity mActivity>
    //   22   46:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //   23   49:aconst_null     
    //   24   50:iload_1         
    //   25   51:iload_2         
    //   26   52:invokevirtual   #948 <Method boolean popBackStackState(Handler, String, int, int)>
    //   27   55:ireturn         
    }

    public boolean popBackStackImmediate(String s, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #509 <Method void checkStateLoss()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #944 <Method boolean executePendingTransactions()>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:getfield        #216 <Field FragmentActivity mActivity>
    //    8   14:getfield        #515 <Field Handler FragmentActivity.mHandler>
    //    9   17:aload_1         
    //   10   18:iconst_m1       
    //   11   19:iload_2         
    //   12   20:invokevirtual   #948 <Method boolean popBackStackState(Handler, String, int, int)>
    //   13   23:ireturn         
    }

    boolean popBackStackState(Handler handler, String s, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #238 <Field ArrayList mBackStack>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_2         
    //    6   10:ifnonnull       62
    //    7   13:iload_3         
    //    8   14:ifge            62
    //    9   17:iload           4
    //   10   19:iconst_1        
    //   11   20:iand            
    //   12   21:ifne            62
    //   13   24:iconst_m1       
    //   14   25:aload_0         
    //   15   26:getfield        #238 <Field ArrayList mBackStack>
    //   16   29:invokevirtual   #302 <Method int ArrayList.size()>
    //   17   32:iadd            
    //   18   33:istore          16
    //   19   35:iload           16
    //   20   37:iflt            7
    //   21   40:aload_0         
    //   22   41:getfield        #238 <Field ArrayList mBackStack>
    //   23   44:iload           16
    //   24   46:invokevirtual   #315 <Method Object ArrayList.remove(int)>
    //   25   49:checkcast       #349 <Class BackStackRecord>
    //   26   52:iconst_1        
    //   27   53:invokevirtual   #953 <Method void BackStackRecord.popFromBackStack(boolean)>
    //   28   56:aload_0         
    //   29   57:invokevirtual   #248 <Method void reportBackStackChanged()>
    //   30   60:iconst_1        
    //   31   61:ireturn         
    //   32   62:iconst_m1       
    //   33   63:istore          5
    //   34   65:aload_2         
    //   35   66:ifnonnull       73
    //   36   69:iload_3         
    //   37   70:iflt            207
    //   38   73:iconst_m1       
    //   39   74:aload_0         
    //   40   75:getfield        #238 <Field ArrayList mBackStack>
    //   41   78:invokevirtual   #302 <Method int ArrayList.size()>
    //   42   81:iadd            
    //   43   82:istore          5
    //   44   84:iload           5
    //   45   86:iflt            119
    //   46   89:aload_0         
    //   47   90:getfield        #238 <Field ArrayList mBackStack>
    //   48   93:iload           5
    //   49   95:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   50   98:checkcast       #349 <Class BackStackRecord>
    //   51  101:astore          15
    //   52  103:aload_2         
    //   53  104:ifnull          188
    //   54  107:aload_2         
    //   55  108:aload           15
    //   56  110:invokevirtual   #956 <Method String BackStackRecord.getName()>
    //   57  113:invokevirtual   #579 <Method boolean String.equals(Object)>
    //   58  116:ifeq            188
    //   59  119:iload           5
    //   60  121:iflt            7
    //   61  124:iload           4
    //   62  126:iconst_1        
    //   63  127:iand            
    //   64  128:ifeq            207
    //   65  131:iinc            5  -1
    //   66  134:iload           5
    //   67  136:iflt            207
    //   68  139:aload_0         
    //   69  140:getfield        #238 <Field ArrayList mBackStack>
    //   70  143:iload           5
    //   71  145:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   72  148:checkcast       #349 <Class BackStackRecord>
    //   73  151:astore          14
    //   74  153:aload_2         
    //   75  154:ifnull          169
    //   76  157:aload_2         
    //   77  158:aload           14
    //   78  160:invokevirtual   #956 <Method String BackStackRecord.getName()>
    //   79  163:invokevirtual   #579 <Method boolean String.equals(Object)>
    //   80  166:ifne            182
    //   81  169:iload_3         
    //   82  170:iflt            207
    //   83  173:iload_3         
    //   84  174:aload           14
    //   85  176:getfield        #957 <Field int BackStackRecord.mIndex>
    //   86  179:icmpne          207
    //   87  182:iinc            5  -1
    //   88  185:goto            134
    //   89  188:iload_3         
    //   90  189:iflt            201
    //   91  192:iload_3         
    //   92  193:aload           15
    //   93  195:getfield        #957 <Field int BackStackRecord.mIndex>
    //   94  198:icmpeq          119
    //   95  201:iinc            5  -1
    //   96  204:goto            84
    //   97  207:iload           5
    //   98  209:iconst_m1       
    //   99  210:aload_0         
    //  100  211:getfield        #238 <Field ArrayList mBackStack>
    //  101  214:invokevirtual   #302 <Method int ArrayList.size()>
    //  102  217:iadd            
    //  103  218:icmpeq          7
    //  104  221:new             #240 <Class ArrayList>
    //  105  224:dup             
    //  106  225:invokespecial   #241 <Method void ArrayList()>
    //  107  228:astore          6
    //  108  230:iconst_m1       
    //  109  231:aload_0         
    //  110  232:getfield        #238 <Field ArrayList mBackStack>
    //  111  235:invokevirtual   #302 <Method int ArrayList.size()>
    //  112  238:iadd            
    //  113  239:istore          7
    //  114  241:iload           7
    //  115  243:iload           5
    //  116  245:icmple          269
    //  117  248:aload           6
    //  118  250:aload_0         
    //  119  251:getfield        #238 <Field ArrayList mBackStack>
    //  120  254:iload           7
    //  121  256:invokevirtual   #315 <Method Object ArrayList.remove(int)>
    //  122  259:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  123  262:pop             
    //  124  263:iinc            7  -1
    //  125  266:goto            241
    //  126  269:iconst_m1       
    //  127  270:aload           6
    //  128  272:invokevirtual   #302 <Method int ArrayList.size()>
    //  129  275:iadd            
    //  130  276:istore          8
    //  131  278:iconst_0        
    //  132  279:istore          9
    //  133  281:iload           9
    //  134  283:iload           8
    //  135  285:icmpgt          367
    //  136  288:getstatic       #85  <Field boolean DEBUG>
    //  137  291:ifeq            326
    //  138  294:ldc1            #32  <String "FragmentManager">
    //  139  296:new             #140 <Class StringBuilder>
    //  140  299:dup             
    //  141  300:invokespecial   #141 <Method void StringBuilder()>
    //  142  303:ldc2            #959 <String "Popping back stack state: ">
    //  143  306:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  144  309:aload           6
    //  145  311:iload           9
    //  146  313:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  147  316:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  148  319:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  149  322:invokestatic    #260 <Method int Log.v(String, String)>
    //  150  325:pop             
    //  151  326:aload           6
    //  152  328:iload           9
    //  153  330:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  154  333:checkcast       #349 <Class BackStackRecord>
    //  155  336:astore          10
    //  156  338:iload           9
    //  157  340:iload           8
    //  158  342:icmpne          361
    //  159  345:iconst_1        
    //  160  346:istore          11
    //  161  348:aload           10
    //  162  350:iload           11
    //  163  352:invokevirtual   #953 <Method void BackStackRecord.popFromBackStack(boolean)>
    //  164  355:iinc            9  1
    //  165  358:goto            281
    //  166  361:iconst_0        
    //  167  362:istore          11
    //  168  364:goto            348
    //  169  367:aload_0         
    //  170  368:invokevirtual   #248 <Method void reportBackStackChanged()>
    //  171  371:goto            60
    }

    public void putFragment(Bundle bundle, String s, Fragment fragment)
    {
    //    0    0:aload_3         
    //    1    1:getfield        #674 <Field int Fragment.mIndex>
    //    2    4:ifge            44
    //    3    7:aload_0         
    //    4    8:new             #131 <Class IllegalStateException>
    //    5   11:dup             
    //    6   12:new             #140 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #141 <Method void StringBuilder()>
    //    9   19:ldc2            #767 <String "Fragment ">
    //   10   22:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_3         
    //   12   26:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #963 <String " is not currently in the FragmentManager">
    //   14   32:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #136 <Method void IllegalStateException(String)>
    //   17   41:invokespecial   #608 <Method void throwException(RuntimeException)>
    //   18   44:aload_1         
    //   19   45:aload_2         
    //   20   46:aload_3         
    //   21   47:getfield        #674 <Field int Fragment.mIndex>
    //   22   50:invokevirtual   #966 <Method void Bundle.putInt(String, int)>
    //   23   53:return          
    }

    public void removeFragment(Fragment fragment, int i, int j)
    {
    //    0    0:getstatic       #85  <Field boolean DEBUG>
    //    1    3:ifeq            45
    //    2    6:ldc1            #32  <String "FragmentManager">
    //    3    8:new             #140 <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #141 <Method void StringBuilder()>
    //    6   15:ldc2            #969 <String "remove: ">
    //    7   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_1         
    //    9   22:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:ldc2            #971 <String " nesting=">
    //   11   28:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   12   31:aload_1         
    //   13   32:getfield        #974 <Field int Fragment.mBackStackNesting>
    //   14   35:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   15   38:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   16   41:invokestatic    #260 <Method int Log.v(String, String)>
    //   17   44:pop             
    //   18   45:aload_1         
    //   19   46:invokevirtual   #977 <Method boolean Fragment.isInBackStack()>
    //   20   49:ifne            131
    //   21   52:iconst_1        
    //   22   53:istore          4
    //   23   55:aload_1         
    //   24   56:getfield        #269 <Field boolean Fragment.mDetached>
    //   25   59:ifeq            67
    //   26   62:iload           4
    //   27   64:ifeq            130
    //   28   67:aload_0         
    //   29   68:getfield        #252 <Field ArrayList mAdded>
    //   30   71:ifnull          83
    //   31   74:aload_0         
    //   32   75:getfield        #252 <Field ArrayList mAdded>
    //   33   78:aload_1         
    //   34   79:invokevirtual   #357 <Method boolean ArrayList.remove(Object)>
    //   35   82:pop             
    //   36   83:aload_1         
    //   37   84:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   38   87:ifeq            102
    //   39   90:aload_1         
    //   40   91:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   41   94:ifeq            102
    //   42   97:aload_0         
    //   43   98:iconst_1        
    //   44   99:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   45  102:aload_1         
    //   46  103:iconst_0        
    //   47  104:putfield        #276 <Field boolean Fragment.mAdded>
    //   48  107:aload_1         
    //   49  108:iconst_1        
    //   50  109:putfield        #279 <Field boolean Fragment.mRemoving>
    //   51  112:iload           4
    //   52  114:ifeq            137
    //   53  117:iconst_0        
    //   54  118:istore          5
    //   55  120:aload_0         
    //   56  121:aload_1         
    //   57  122:iload           5
    //   58  124:iload_2         
    //   59  125:iload_3         
    //   60  126:iconst_0        
    //   61  127:invokevirtual   #345 <Method void moveToState(Fragment, int, int, int, boolean)>
    //   62  130:return          
    //   63  131:iconst_0        
    //   64  132:istore          4
    //   65  134:goto            55
    //   66  137:iconst_1        
    //   67  138:istore          5
    //   68  140:goto            120
    }

    public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #357 <Method boolean ArrayList.remove(Object)>
    //    7   15:pop             
    //    8   16:return          
    }

    void reportBackStackChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    2    4:ifnull          42
    //    3    7:iconst_0        
    //    4    8:istore_1        
    //    5    9:iload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //    8   14:invokevirtual   #302 <Method int ArrayList.size()>
    //    9   17:icmpge          42
    //   10   20:aload_0         
    //   11   21:getfield        #294 <Field ArrayList mBackStackChangeListeners>
    //   12   24:iload_1         
    //   13   25:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   14   28:checkcast       #980 <Class FragmentManager$OnBackStackChangedListener>
    //   15   31:invokeinterface #983 <Method void FragmentManager$OnBackStackChangedListener.onBackStackChanged()>
    //   16   36:iinc            1  1
    //   17   39:goto            9
    //   18   42:return          
    }

    void restoreAllState(Parcelable parcelable, ArrayList arraylist)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       5
    //    2    4:return          
    //    3    5:aload_1         
    //    4    6:checkcast       #987 <Class FragmentManagerState>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:getfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //    8   14:ifnull          4
    //    9   17:aload_2         
    //   10   18:ifnull          170
    //   11   21:iconst_0        
    //   12   22:istore          23
    //   13   24:iload           23
    //   14   26:aload_2         
    //   15   27:invokevirtual   #302 <Method int ArrayList.size()>
    //   16   30:icmpge          170
    //   17   33:aload_2         
    //   18   34:iload           23
    //   19   36:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   20   39:checkcast       #266 <Class Fragment>
    //   21   42:astore          24
    //   22   44:getstatic       #85  <Field boolean DEBUG>
    //   23   47:ifeq            77
    //   24   50:ldc1            #32  <String "FragmentManager">
    //   25   52:new             #140 <Class StringBuilder>
    //   26   55:dup             
    //   27   56:invokespecial   #141 <Method void StringBuilder()>
    //   28   59:ldc2            #992 <String "restoreAllState: re-attaching retained ">
    //   29   62:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   30   65:aload           24
    //   31   67:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   32   70:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   33   73:invokestatic    #260 <Method int Log.v(String, String)>
    //   34   76:pop             
    //   35   77:aload_3         
    //   36   78:getfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //   37   81:aload           24
    //   38   83:getfield        #674 <Field int Fragment.mIndex>
    //   39   86:aaload          
    //   40   87:astore          25
    //   41   89:aload           25
    //   42   91:aload           24
    //   43   93:putfield        #997 <Field Fragment FragmentState.mInstance>
    //   44   96:aload           24
    //   45   98:aconst_null     
    //   46   99:putfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   47  102:aload           24
    //   48  104:iconst_0        
    //   49  105:putfield        #974 <Field int Fragment.mBackStackNesting>
    //   50  108:aload           24
    //   51  110:iconst_0        
    //   52  111:putfield        #712 <Field boolean Fragment.mInLayout>
    //   53  114:aload           24
    //   54  116:iconst_0        
    //   55  117:putfield        #276 <Field boolean Fragment.mAdded>
    //   56  120:aload           24
    //   57  122:aconst_null     
    //   58  123:putfield        #735 <Field Fragment Fragment.mTarget>
    //   59  126:aload           25
    //   60  128:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //   61  131:ifnull          164
    //   62  134:aload           25
    //   63  136:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //   64  139:aload_0         
    //   65  140:getfield        #216 <Field FragmentActivity mActivity>
    //   66  143:invokevirtual   #1002 <Method ClassLoader FragmentActivity.getClassLoader()>
    //   67  146:invokevirtual   #1006 <Method void Bundle.setClassLoader(ClassLoader)>
    //   68  149:aload           24
    //   69  151:aload           25
    //   70  153:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //   71  156:ldc1            #44  <String "android:view_state">
    //   72  158:invokevirtual   #727 <Method SparseArray Bundle.getSparseParcelableArray(String)>
    //   73  161:putfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   74  164:iinc            23  1
    //   75  167:goto            24
    //   76  170:aload_0         
    //   77  171:new             #240 <Class ArrayList>
    //   78  174:dup             
    //   79  175:aload_3         
    //   80  176:getfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //   81  179:arraylength     
    //   82  180:invokespecial   #1008 <Method void ArrayList(int)>
    //   83  183:putfield        #420 <Field ArrayList mActive>
    //   84  186:aload_0         
    //   85  187:getfield        #503 <Field ArrayList mAvailIndices>
    //   86  190:ifnull          200
    //   87  193:aload_0         
    //   88  194:getfield        #503 <Field ArrayList mAvailIndices>
    //   89  197:invokevirtual   #559 <Method void ArrayList.clear()>
    //   90  200:iconst_0        
    //   91  201:istore          4
    //   92  203:iload           4
    //   93  205:aload_3         
    //   94  206:getfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //   95  209:arraylength     
    //   96  210:icmpge          384
    //   97  213:aload_3         
    //   98  214:getfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //   99  217:iload           4
    //  100  219:aaload          
    //  101  220:astore          16
    //  102  222:aload           16
    //  103  224:ifnull          308
    //  104  227:aload           16
    //  105  229:aload_0         
    //  106  230:getfield        #216 <Field FragmentActivity mActivity>
    //  107  233:aload_0         
    //  108  234:getfield        #336 <Field Fragment mParent>
    //  109  237:invokevirtual   #1012 <Method Fragment FragmentState.instantiate(FragmentActivity, Fragment)>
    //  110  240:astore          20
    //  111  242:getstatic       #85  <Field boolean DEBUG>
    //  112  245:ifeq            286
    //  113  248:ldc1            #32  <String "FragmentManager">
    //  114  250:new             #140 <Class StringBuilder>
    //  115  253:dup             
    //  116  254:invokespecial   #141 <Method void StringBuilder()>
    //  117  257:ldc2            #1014 <String "restoreAllState: active #">
    //  118  260:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  119  263:iload           4
    //  120  265:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  121  268:ldc2            #447 <String ": ">
    //  122  271:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  123  274:aload           20
    //  124  276:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  125  279:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  126  282:invokestatic    #260 <Method int Log.v(String, String)>
    //  127  285:pop             
    //  128  286:aload_0         
    //  129  287:getfield        #420 <Field ArrayList mActive>
    //  130  290:aload           20
    //  131  292:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  132  295:pop             
    //  133  296:aload           16
    //  134  298:aconst_null     
    //  135  299:putfield        #997 <Field Fragment FragmentState.mInstance>
    //  136  302:iinc            4  1
    //  137  305:goto            203
    //  138  308:aload_0         
    //  139  309:getfield        #420 <Field ArrayList mActive>
    //  140  312:aconst_null     
    //  141  313:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  142  316:pop             
    //  143  317:aload_0         
    //  144  318:getfield        #503 <Field ArrayList mAvailIndices>
    //  145  321:ifnonnull       335
    //  146  324:aload_0         
    //  147  325:new             #240 <Class ArrayList>
    //  148  328:dup             
    //  149  329:invokespecial   #241 <Method void ArrayList()>
    //  150  332:putfield        #503 <Field ArrayList mAvailIndices>
    //  151  335:getstatic       #85  <Field boolean DEBUG>
    //  152  338:ifeq            368
    //  153  341:ldc1            #32  <String "FragmentManager">
    //  154  343:new             #140 <Class StringBuilder>
    //  155  346:dup             
    //  156  347:invokespecial   #141 <Method void StringBuilder()>
    //  157  350:ldc2            #1016 <String "restoreAllState: avail #">
    //  158  353:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  159  356:iload           4
    //  160  358:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  161  361:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  162  364:invokestatic    #260 <Method int Log.v(String, String)>
    //  163  367:pop             
    //  164  368:aload_0         
    //  165  369:getfield        #503 <Field ArrayList mAvailIndices>
    //  166  372:iload           4
    //  167  374:invokestatic    #589 <Method Integer Integer.valueOf(int)>
    //  168  377:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  169  380:pop             
    //  170  381:goto            302
    //  171  384:aload_2         
    //  172  385:ifnull          510
    //  173  388:iconst_0        
    //  174  389:istore          13
    //  175  391:iload           13
    //  176  393:aload_2         
    //  177  394:invokevirtual   #302 <Method int ArrayList.size()>
    //  178  397:icmpge          510
    //  179  400:aload_2         
    //  180  401:iload           13
    //  181  403:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  182  406:checkcast       #266 <Class Fragment>
    //  183  409:astore          14
    //  184  411:aload           14
    //  185  413:getfield        #1019 <Field int Fragment.mTargetIndex>
    //  186  416:iflt            454
    //  187  419:aload           14
    //  188  421:getfield        #1019 <Field int Fragment.mTargetIndex>
    //  189  424:aload_0         
    //  190  425:getfield        #420 <Field ArrayList mActive>
    //  191  428:invokevirtual   #302 <Method int ArrayList.size()>
    //  192  431:icmpge          460
    //  193  434:aload           14
    //  194  436:aload_0         
    //  195  437:getfield        #420 <Field ArrayList mActive>
    //  196  440:aload           14
    //  197  442:getfield        #1019 <Field int Fragment.mTargetIndex>
    //  198  445:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  199  448:checkcast       #266 <Class Fragment>
    //  200  451:putfield        #735 <Field Fragment Fragment.mTarget>
    //  201  454:iinc            13  1
    //  202  457:goto            391
    //  203  460:ldc1            #32  <String "FragmentManager">
    //  204  462:new             #140 <Class StringBuilder>
    //  205  465:dup             
    //  206  466:invokespecial   #141 <Method void StringBuilder()>
    //  207  469:ldc2            #1021 <String "Re-attaching retained fragment ">
    //  208  472:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  209  475:aload           14
    //  210  477:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  211  480:ldc2            #1023 <String " target no longer exists: ">
    //  212  483:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  213  486:aload           14
    //  214  488:getfield        #1019 <Field int Fragment.mTargetIndex>
    //  215  491:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  216  494:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  217  497:invokestatic    #1026 <Method int Log.w(String, String)>
    //  218  500:pop             
    //  219  501:aload           14
    //  220  503:aconst_null     
    //  221  504:putfield        #735 <Field Fragment Fragment.mTarget>
    //  222  507:goto            454
    //  223  510:aload_3         
    //  224  511:getfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  225  514:ifnull          696
    //  226  517:aload_0         
    //  227  518:new             #240 <Class ArrayList>
    //  228  521:dup             
    //  229  522:aload_3         
    //  230  523:getfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  231  526:arraylength     
    //  232  527:invokespecial   #1008 <Method void ArrayList(int)>
    //  233  530:putfield        #252 <Field ArrayList mAdded>
    //  234  533:iconst_0        
    //  235  534:istore          9
    //  236  536:iload           9
    //  237  538:aload_3         
    //  238  539:getfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  239  542:arraylength     
    //  240  543:icmpge          701
    //  241  546:aload_0         
    //  242  547:getfield        #420 <Field ArrayList mActive>
    //  243  550:aload_3         
    //  244  551:getfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  245  554:iload           9
    //  246  556:iaload          
    //  247  557:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  248  560:checkcast       #266 <Class Fragment>
    //  249  563:astore          10
    //  250  565:aload           10
    //  251  567:ifnonnull       607
    //  252  570:aload_0         
    //  253  571:new             #131 <Class IllegalStateException>
    //  254  574:dup             
    //  255  575:new             #140 <Class StringBuilder>
    //  256  578:dup             
    //  257  579:invokespecial   #141 <Method void StringBuilder()>
    //  258  582:ldc2            #1031 <String "No instantiated fragment for index #">
    //  259  585:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  260  588:aload_3         
    //  261  589:getfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  262  592:iload           9
    //  263  594:iaload          
    //  264  595:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  265  598:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  266  601:invokespecial   #136 <Method void IllegalStateException(String)>
    //  267  604:invokespecial   #608 <Method void throwException(RuntimeException)>
    //  268  607:aload           10
    //  269  609:iconst_1        
    //  270  610:putfield        #276 <Field boolean Fragment.mAdded>
    //  271  613:getstatic       #85  <Field boolean DEBUG>
    //  272  616:ifeq            657
    //  273  619:ldc1            #32  <String "FragmentManager">
    //  274  621:new             #140 <Class StringBuilder>
    //  275  624:dup             
    //  276  625:invokespecial   #141 <Method void StringBuilder()>
    //  277  628:ldc2            #1033 <String "restoreAllState: added #">
    //  278  631:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  279  634:iload           9
    //  280  636:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  281  639:ldc2            #447 <String ": ">
    //  282  642:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  283  645:aload           10
    //  284  647:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  285  650:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  286  653:invokestatic    #260 <Method int Log.v(String, String)>
    //  287  656:pop             
    //  288  657:aload_0         
    //  289  658:getfield        #252 <Field ArrayList mAdded>
    //  290  661:aload           10
    //  291  663:invokevirtual   #272 <Method boolean ArrayList.contains(Object)>
    //  292  666:ifeq            680
    //  293  669:new             #131 <Class IllegalStateException>
    //  294  672:dup             
    //  295  673:ldc2            #1035 <String "Already added!">
    //  296  676:invokespecial   #136 <Method void IllegalStateException(String)>
    //  297  679:athrow          
    //  298  680:aload_0         
    //  299  681:getfield        #252 <Field ArrayList mAdded>
    //  300  684:aload           10
    //  301  686:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  302  689:pop             
    //  303  690:iinc            9  1
    //  304  693:goto            536
    //  305  696:aload_0         
    //  306  697:aconst_null     
    //  307  698:putfield        #252 <Field ArrayList mAdded>
    //  308  701:aload_3         
    //  309  702:getfield        #1038 <Field BackStackState[] FragmentManagerState.mBackStack>
    //  310  705:ifnull          867
    //  311  708:aload_0         
    //  312  709:new             #240 <Class ArrayList>
    //  313  712:dup             
    //  314  713:aload_3         
    //  315  714:getfield        #1038 <Field BackStackState[] FragmentManagerState.mBackStack>
    //  316  717:arraylength     
    //  317  718:invokespecial   #1008 <Method void ArrayList(int)>
    //  318  721:putfield        #238 <Field ArrayList mBackStack>
    //  319  724:iconst_0        
    //  320  725:istore          5
    //  321  727:iload           5
    //  322  729:aload_3         
    //  323  730:getfield        #1038 <Field BackStackState[] FragmentManagerState.mBackStack>
    //  324  733:arraylength     
    //  325  734:icmpge          4
    //  326  737:aload_3         
    //  327  738:getfield        #1038 <Field BackStackState[] FragmentManagerState.mBackStack>
    //  328  741:iload           5
    //  329  743:aaload          
    //  330  744:aload_0         
    //  331  745:invokevirtual   #1043 <Method BackStackRecord BackStackState.instantiate(FragmentManagerImpl)>
    //  332  748:astore          6
    //  333  750:getstatic       #85  <Field boolean DEBUG>
    //  334  753:ifeq            832
    //  335  756:ldc1            #32  <String "FragmentManager">
    //  336  758:new             #140 <Class StringBuilder>
    //  337  761:dup             
    //  338  762:invokespecial   #141 <Method void StringBuilder()>
    //  339  765:ldc2            #1045 <String "restoreAllState: back stack #">
    //  340  768:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  341  771:iload           5
    //  342  773:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  343  776:ldc2            #1047 <String " (index ">
    //  344  779:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  345  782:aload           6
    //  346  784:getfield        #957 <Field int BackStackRecord.mIndex>
    //  347  787:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  348  790:ldc2            #1049 <String "): ">
    //  349  793:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  350  796:aload           6
    //  351  798:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  352  801:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  353  804:invokestatic    #260 <Method int Log.v(String, String)>
    //  354  807:pop             
    //  355  808:aload           6
    //  356  810:ldc1            #218 <String "  ">
    //  357  812:new             #208 <Class PrintWriter>
    //  358  815:dup             
    //  359  816:new             #210 <Class LogWriter>
    //  360  819:dup             
    //  361  820:ldc1            #32  <String "FragmentManager">
    //  362  822:invokespecial   #211 <Method void LogWriter(String)>
    //  363  825:invokespecial   #214 <Method void PrintWriter(java.io.Writer)>
    //  364  828:iconst_0        
    //  365  829:invokevirtual   #1052 <Method void BackStackRecord.dump(String, PrintWriter, boolean)>
    //  366  832:aload_0         
    //  367  833:getfield        #238 <Field ArrayList mBackStack>
    //  368  836:aload           6
    //  369  838:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  370  841:pop             
    //  371  842:aload           6
    //  372  844:getfield        #957 <Field int BackStackRecord.mIndex>
    //  373  847:iflt            861
    //  374  850:aload_0         
    //  375  851:aload           6
    //  376  853:getfield        #957 <Field int BackStackRecord.mIndex>
    //  377  856:aload           6
    //  378  858:invokevirtual   #1056 <Method void setBackStackIndex(int, BackStackRecord)>
    //  379  861:iinc            5  1
    //  380  864:goto            727
    //  381  867:aload_0         
    //  382  868:aconst_null     
    //  383  869:putfield        #238 <Field ArrayList mBackStack>
    //  384  872:return          
    }

    ArrayList retainNonConfig()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #420 <Field ArrayList mActive>
    //    2    4:astore_1        
    //    3    5:aconst_null     
    //    4    6:astore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          145
    //    7   11:iconst_0        
    //    8   12:istore_3        
    //    9   13:iload_3         
    //   10   14:aload_0         
    //   11   15:getfield        #420 <Field ArrayList mActive>
    //   12   18:invokevirtual   #302 <Method int ArrayList.size()>
    //   13   21:icmpge          145
    //   14   24:aload_0         
    //   15   25:getfield        #420 <Field ArrayList mActive>
    //   16   28:iload_3         
    //   17   29:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   18   32:checkcast       #266 <Class Fragment>
    //   19   35:astore          4
    //   20   37:aload           4
    //   21   39:ifnull          133
    //   22   42:aload           4
    //   23   44:getfield        #1061 <Field boolean Fragment.mRetainInstance>
    //   24   47:ifeq            133
    //   25   50:aload_2         
    //   26   51:ifnonnull       62
    //   27   54:new             #240 <Class ArrayList>
    //   28   57:dup             
    //   29   58:invokespecial   #241 <Method void ArrayList()>
    //   30   61:astore_2        
    //   31   62:aload_2         
    //   32   63:aload           4
    //   33   65:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   34   68:pop             
    //   35   69:aload           4
    //   36   71:iconst_1        
    //   37   72:putfield        #779 <Field boolean Fragment.mRetaining>
    //   38   75:aload           4
    //   39   77:getfield        #735 <Field Fragment Fragment.mTarget>
    //   40   80:ifnull          139
    //   41   83:aload           4
    //   42   85:getfield        #735 <Field Fragment Fragment.mTarget>
    //   43   88:getfield        #674 <Field int Fragment.mIndex>
    //   44   91:istore          6
    //   45   93:aload           4
    //   46   95:iload           6
    //   47   97:putfield        #1019 <Field int Fragment.mTargetIndex>
    //   48  100:getstatic       #85  <Field boolean DEBUG>
    //   49  103:ifeq            133
    //   50  106:ldc1            #32  <String "FragmentManager">
    //   51  108:new             #140 <Class StringBuilder>
    //   52  111:dup             
    //   53  112:invokespecial   #141 <Method void StringBuilder()>
    //   54  115:ldc2            #1063 <String "retainNonConfig: keeping retained ">
    //   55  118:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   56  121:aload           4
    //   57  123:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   58  126:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   59  129:invokestatic    #260 <Method int Log.v(String, String)>
    //   60  132:pop             
    //   61  133:iinc            3  1
    //   62  136:goto            13
    //   63  139:iconst_m1       
    //   64  140:istore          6
    //   65  142:goto            93
    //   66  145:aload_2         
    //   67  146:areturn         
    }

    Parcelable saveAllState()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #392 <Method boolean execPendingActions()>
    //    2    4:pop             
    //    3    5:getstatic       #92  <Field boolean HONEYCOMB>
    //    4    8:ifeq            16
    //    5   11:aload_0         
    //    6   12:iconst_1        
    //    7   13:putfield        #129 <Field boolean mStateSaved>
    //    8   16:aload_0         
    //    9   17:getfield        #420 <Field ArrayList mActive>
    //   10   20:ifnull          33
    //   11   23:aload_0         
    //   12   24:getfield        #420 <Field ArrayList mActive>
    //   13   27:invokevirtual   #302 <Method int ArrayList.size()>
    //   14   30:ifgt            35
    //   15   33:aconst_null     
    //   16   34:areturn         
    //   17   35:aload_0         
    //   18   36:getfield        #420 <Field ArrayList mActive>
    //   19   39:invokevirtual   #302 <Method int ArrayList.size()>
    //   20   42:istore_2        
    //   21   43:iload_2         
    //   22   44:anewarray       FragmentState[]
    //   23   47:astore_3        
    //   24   48:iconst_0        
    //   25   49:istore          4
    //   26   51:iconst_0        
    //   27   52:istore          5
    //   28   54:iload           5
    //   29   56:iload_2         
    //   30   57:icmpge          370
    //   31   60:aload_0         
    //   32   61:getfield        #420 <Field ArrayList mActive>
    //   33   64:iload           5
    //   34   66:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   35   69:checkcast       #266 <Class Fragment>
    //   36   72:astore          18
    //   37   74:aload           18
    //   38   76:ifnull          351
    //   39   79:aload           18
    //   40   81:getfield        #674 <Field int Fragment.mIndex>
    //   41   84:ifge            133
    //   42   87:aload_0         
    //   43   88:new             #131 <Class IllegalStateException>
    //   44   91:dup             
    //   45   92:new             #140 <Class StringBuilder>
    //   46   95:dup             
    //   47   96:invokespecial   #141 <Method void StringBuilder()>
    //   48   99:ldc2            #1067 <String "Failure saving state: active ">
    //   49  102:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   50  105:aload           18
    //   51  107:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   52  110:ldc2            #1069 <String " has cleared index: ">
    //   53  113:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   54  116:aload           18
    //   55  118:getfield        #674 <Field int Fragment.mIndex>
    //   56  121:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   57  124:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   58  127:invokespecial   #136 <Method void IllegalStateException(String)>
    //   59  130:invokespecial   #608 <Method void throwException(RuntimeException)>
    //   60  133:iconst_1        
    //   61  134:istore          4
    //   62  136:new             #994 <Class FragmentState>
    //   63  139:dup             
    //   64  140:aload           18
    //   65  142:invokespecial   #1071 <Method void FragmentState(Fragment)>
    //   66  145:astore          19
    //   67  147:aload_3         
    //   68  148:iload           5
    //   69  150:aload           19
    //   70  152:aastore         
    //   71  153:aload           18
    //   72  155:getfield        #703 <Field int Fragment.mState>
    //   73  158:ifle            357
    //   74  161:aload           19
    //   75  163:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //   76  166:ifnonnull       357
    //   77  169:aload           19
    //   78  171:aload_0         
    //   79  172:aload           18
    //   80  174:invokevirtual   #1075 <Method Bundle saveFragmentBasicState(Fragment)>
    //   81  177:putfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //   82  180:aload           18
    //   83  182:getfield        #735 <Field Fragment Fragment.mTarget>
    //   84  185:ifnull          304
    //   85  188:aload           18
    //   86  190:getfield        #735 <Field Fragment Fragment.mTarget>
    //   87  193:getfield        #674 <Field int Fragment.mIndex>
    //   88  196:ifge            245
    //   89  199:aload_0         
    //   90  200:new             #131 <Class IllegalStateException>
    //   91  203:dup             
    //   92  204:new             #140 <Class StringBuilder>
    //   93  207:dup             
    //   94  208:invokespecial   #141 <Method void StringBuilder()>
    //   95  211:ldc2            #1077 <String "Failure saving state: ">
    //   96  214:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   97  217:aload           18
    //   98  219:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   99  222:ldc2            #1079 <String " has target not in fragment manager: ">
    //  100  225:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  101  228:aload           18
    //  102  230:getfield        #735 <Field Fragment Fragment.mTarget>
    //  103  233:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  104  236:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  105  239:invokespecial   #136 <Method void IllegalStateException(String)>
    //  106  242:invokespecial   #608 <Method void throwException(RuntimeException)>
    //  107  245:aload           19
    //  108  247:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  109  250:ifnonnull       265
    //  110  253:aload           19
    //  111  255:new             #598 <Class Bundle>
    //  112  258:dup             
    //  113  259:invokespecial   #1080 <Method void Bundle()>
    //  114  262:putfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  115  265:aload_0         
    //  116  266:aload           19
    //  117  268:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  118  271:ldc1            #38  <String "android:target_state">
    //  119  273:aload           18
    //  120  275:getfield        #735 <Field Fragment Fragment.mTarget>
    //  121  278:invokevirtual   #1082 <Method void putFragment(Bundle, String, Fragment)>
    //  122  281:aload           18
    //  123  283:getfield        #738 <Field int Fragment.mTargetRequestCode>
    //  124  286:ifeq            304
    //  125  289:aload           19
    //  126  291:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  127  294:ldc1            #35  <String "android:target_req_state">
    //  128  296:aload           18
    //  129  298:getfield        #738 <Field int Fragment.mTargetRequestCode>
    //  130  301:invokevirtual   #966 <Method void Bundle.putInt(String, int)>
    //  131  304:getstatic       #85  <Field boolean DEBUG>
    //  132  307:ifeq            351
    //  133  310:ldc1            #32  <String "FragmentManager">
    //  134  312:new             #140 <Class StringBuilder>
    //  135  315:dup             
    //  136  316:invokespecial   #141 <Method void StringBuilder()>
    //  137  319:ldc2            #1084 <String "Saved state of ">
    //  138  322:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  139  325:aload           18
    //  140  327:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  141  330:ldc2            #447 <String ": ">
    //  142  333:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  143  336:aload           19
    //  144  338:getfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  145  341:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  146  344:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  147  347:invokestatic    #260 <Method int Log.v(String, String)>
    //  148  350:pop             
    //  149  351:iinc            5  1
    //  150  354:goto            54
    //  151  357:aload           19
    //  152  359:aload           18
    //  153  361:getfield        #723 <Field Bundle Fragment.mSavedFragmentState>
    //  154  364:putfield        #998 <Field Bundle FragmentState.mSavedFragmentState>
    //  155  367:goto            304
    //  156  370:iload           4
    //  157  372:ifne            392
    //  158  375:getstatic       #85  <Field boolean DEBUG>
    //  159  378:ifeq            33
    //  160  381:ldc1            #32  <String "FragmentManager">
    //  161  383:ldc2            #1086 <String "saveAllState: no fragments!">
    //  162  386:invokestatic    #260 <Method int Log.v(String, String)>
    //  163  389:pop             
    //  164  390:aconst_null     
    //  165  391:areturn         
    //  166  392:aload_0         
    //  167  393:getfield        #252 <Field ArrayList mAdded>
    //  168  396:astore          6
    //  169  398:aconst_null     
    //  170  399:astore          7
    //  171  401:aload           6
    //  172  403:ifnull          577
    //  173  406:aload_0         
    //  174  407:getfield        #252 <Field ArrayList mAdded>
    //  175  410:invokevirtual   #302 <Method int ArrayList.size()>
    //  176  413:istore          14
    //  177  415:aconst_null     
    //  178  416:astore          7
    //  179  418:iload           14
    //  180  420:ifle            577
    //  181  423:iload           14
    //  182  425:newarray        int[]
    //  183  427:astore          7
    //  184  429:iconst_0        
    //  185  430:istore          15
    //  186  432:iload           15
    //  187  434:iload           14
    //  188  436:icmpge          577
    //  189  439:aload           7
    //  190  441:iload           15
    //  191  443:aload_0         
    //  192  444:getfield        #252 <Field ArrayList mAdded>
    //  193  447:iload           15
    //  194  449:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  195  452:checkcast       #266 <Class Fragment>
    //  196  455:getfield        #674 <Field int Fragment.mIndex>
    //  197  458:iastore         
    //  198  459:aload           7
    //  199  461:iload           15
    //  200  463:iaload          
    //  201  464:ifge            520
    //  202  467:aload_0         
    //  203  468:new             #131 <Class IllegalStateException>
    //  204  471:dup             
    //  205  472:new             #140 <Class StringBuilder>
    //  206  475:dup             
    //  207  476:invokespecial   #141 <Method void StringBuilder()>
    //  208  479:ldc2            #1067 <String "Failure saving state: active ">
    //  209  482:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  210  485:aload_0         
    //  211  486:getfield        #252 <Field ArrayList mAdded>
    //  212  489:iload           15
    //  213  491:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  214  494:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  215  497:ldc2            #1069 <String " has cleared index: ">
    //  216  500:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  217  503:aload           7
    //  218  505:iload           15
    //  219  507:iaload          
    //  220  508:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  221  511:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  222  514:invokespecial   #136 <Method void IllegalStateException(String)>
    //  223  517:invokespecial   #608 <Method void throwException(RuntimeException)>
    //  224  520:getstatic       #85  <Field boolean DEBUG>
    //  225  523:ifeq            571
    //  226  526:ldc1            #32  <String "FragmentManager">
    //  227  528:new             #140 <Class StringBuilder>
    //  228  531:dup             
    //  229  532:invokespecial   #141 <Method void StringBuilder()>
    //  230  535:ldc2            #1088 <String "saveAllState: adding fragment #">
    //  231  538:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  232  541:iload           15
    //  233  543:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  234  546:ldc2            #447 <String ": ">
    //  235  549:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  236  552:aload_0         
    //  237  553:getfield        #252 <Field ArrayList mAdded>
    //  238  556:iload           15
    //  239  558:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  240  561:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  241  564:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  242  567:invokestatic    #260 <Method int Log.v(String, String)>
    //  243  570:pop             
    //  244  571:iinc            15  1
    //  245  574:goto            432
    //  246  577:aload_0         
    //  247  578:getfield        #238 <Field ArrayList mBackStack>
    //  248  581:astore          8
    //  249  583:aconst_null     
    //  250  584:astore          9
    //  251  586:aload           8
    //  252  588:ifnull          707
    //  253  591:aload_0         
    //  254  592:getfield        #238 <Field ArrayList mBackStack>
    //  255  595:invokevirtual   #302 <Method int ArrayList.size()>
    //  256  598:istore          11
    //  257  600:aconst_null     
    //  258  601:astore          9
    //  259  603:iload           11
    //  260  605:ifle            707
    //  261  608:iload           11
    //  262  610:anewarray       BackStackState[]
    //  263  613:astore          9
    //  264  615:iconst_0        
    //  265  616:istore          12
    //  266  618:iload           12
    //  267  620:iload           11
    //  268  622:icmpge          707
    //  269  625:aload           9
    //  270  627:iload           12
    //  271  629:new             #1040 <Class BackStackState>
    //  272  632:dup             
    //  273  633:aload_0         
    //  274  634:aload_0         
    //  275  635:getfield        #238 <Field ArrayList mBackStack>
    //  276  638:iload           12
    //  277  640:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  278  643:checkcast       #349 <Class BackStackRecord>
    //  279  646:invokespecial   #1091 <Method void BackStackState(FragmentManagerImpl, BackStackRecord)>
    //  280  649:aastore         
    //  281  650:getstatic       #85  <Field boolean DEBUG>
    //  282  653:ifeq            701
    //  283  656:ldc1            #32  <String "FragmentManager">
    //  284  658:new             #140 <Class StringBuilder>
    //  285  661:dup             
    //  286  662:invokespecial   #141 <Method void StringBuilder()>
    //  287  665:ldc2            #1093 <String "saveAllState: adding back stack #">
    //  288  668:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  289  671:iload           12
    //  290  673:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //  291  676:ldc2            #447 <String ": ">
    //  292  679:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //  293  682:aload_0         
    //  294  683:getfield        #238 <Field ArrayList mBackStack>
    //  295  686:iload           12
    //  296  688:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //  297  691:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //  298  694:invokevirtual   #151 <Method String StringBuilder.toString()>
    //  299  697:invokestatic    #260 <Method int Log.v(String, String)>
    //  300  700:pop             
    //  301  701:iinc            12  1
    //  302  704:goto            618
    //  303  707:new             #987 <Class FragmentManagerState>
    //  304  710:dup             
    //  305  711:invokespecial   #1094 <Method void FragmentManagerState()>
    //  306  714:astore          10
    //  307  716:aload           10
    //  308  718:aload_3         
    //  309  719:putfield        #990 <Field FragmentState[] FragmentManagerState.mActive>
    //  310  722:aload           10
    //  311  724:aload           7
    //  312  726:putfield        #1029 <Field int[] FragmentManagerState.mAdded>
    //  313  729:aload           10
    //  314  731:aload           9
    //  315  733:putfield        #1038 <Field BackStackState[] FragmentManagerState.mBackStack>
    //  316  736:aload           10
    //  317  738:areturn         
    }

    Bundle saveFragmentBasicState(Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #117 <Field Bundle mStateBundle>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #598 <Class Bundle>
    //    5   11:dup             
    //    6   12:invokespecial   #1080 <Method void Bundle()>
    //    7   15:putfield        #117 <Field Bundle mStateBundle>
    //    8   18:aload_1         
    //    9   19:aload_0         
    //   10   20:getfield        #117 <Field Bundle mStateBundle>
    //   11   23:invokevirtual   #1097 <Method void Fragment.performSaveInstanceState(Bundle)>
    //   12   26:aload_0         
    //   13   27:getfield        #117 <Field Bundle mStateBundle>
    //   14   30:invokevirtual   #1100 <Method boolean Bundle.isEmpty()>
    //   15   33:istore_2        
    //   16   34:aconst_null     
    //   17   35:astore_3        
    //   18   36:iload_2         
    //   19   37:ifne            50
    //   20   40:aload_0         
    //   21   41:getfield        #117 <Field Bundle mStateBundle>
    //   22   44:astore_3        
    //   23   45:aload_0         
    //   24   46:aconst_null     
    //   25   47:putfield        #117 <Field Bundle mStateBundle>
    //   26   50:aload_1         
    //   27   51:getfield        #620 <Field View Fragment.mView>
    //   28   54:ifnull          62
    //   29   57:aload_0         
    //   30   58:aload_1         
    //   31   59:invokevirtual   #890 <Method void saveFragmentViewState(Fragment)>
    //   32   62:aload_1         
    //   33   63:getfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   34   66:ifnull          91
    //   35   69:aload_3         
    //   36   70:ifnonnull       81
    //   37   73:new             #598 <Class Bundle>
    //   38   76:dup             
    //   39   77:invokespecial   #1080 <Method void Bundle()>
    //   40   80:astore_3        
    //   41   81:aload_3         
    //   42   82:ldc1            #44  <String "android:view_state">
    //   43   84:aload_1         
    //   44   85:getfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   45   88:invokevirtual   #1104 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
    //   46   91:aload_1         
    //   47   92:getfield        #745 <Field boolean Fragment.mUserVisibleHint>
    //   48   95:ifne            120
    //   49   98:aload_3         
    //   50   99:ifnonnull       110
    //   51  102:new             #598 <Class Bundle>
    //   52  105:dup             
    //   53  106:invokespecial   #1080 <Method void Bundle()>
    //   54  109:astore_3        
    //   55  110:aload_3         
    //   56  111:ldc1            #41  <String "android:user_visible_hint">
    //   57  113:aload_1         
    //   58  114:getfield        #745 <Field boolean Fragment.mUserVisibleHint>
    //   59  117:invokevirtual   #1108 <Method void Bundle.putBoolean(String, boolean)>
    //   60  120:aload_3         
    //   61  121:areturn         
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #674 <Field int Fragment.mIndex>
    //    2    4:ifge            44
    //    3    7:aload_0         
    //    4    8:new             #131 <Class IllegalStateException>
    //    5   11:dup             
    //    6   12:new             #140 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #141 <Method void StringBuilder()>
    //    9   19:ldc2            #767 <String "Fragment ">
    //   10   22:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #963 <String " is not currently in the FragmentManager">
    //   14   32:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #136 <Method void IllegalStateException(String)>
    //   17   41:invokespecial   #608 <Method void throwException(RuntimeException)>
    //   18   44:aload_1         
    //   19   45:getfield        #703 <Field int Fragment.mState>
    //   20   48:istore_2        
    //   21   49:aconst_null     
    //   22   50:astore_3        
    //   23   51:iload_2         
    //   24   52:ifle            79
    //   25   55:aload_0         
    //   26   56:aload_1         
    //   27   57:invokevirtual   #1075 <Method Bundle saveFragmentBasicState(Fragment)>
    //   28   60:astore          4
    //   29   62:aconst_null     
    //   30   63:astore_3        
    //   31   64:aload           4
    //   32   66:ifnull          79
    //   33   69:new             #1112 <Class Fragment$SavedState>
    //   34   72:dup             
    //   35   73:aload           4
    //   36   75:invokespecial   #1114 <Method void Fragment$SavedState(Bundle)>
    //   37   78:astore_3        
    //   38   79:aload_3         
    //   39   80:areturn         
    }

    void saveFragmentViewState(Fragment fragment)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #794 <Field View Fragment.mInnerView>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #119 <Field SparseArray mStateArray>
    //    6   12:ifnonnull       61
    //    7   15:aload_0         
    //    8   16:new             #1116 <Class SparseArray>
    //    9   19:dup             
    //   10   20:invokespecial   #1117 <Method void SparseArray()>
    //   11   23:putfield        #119 <Field SparseArray mStateArray>
    //   12   26:aload_1         
    //   13   27:getfield        #794 <Field View Fragment.mInnerView>
    //   14   30:aload_0         
    //   15   31:getfield        #119 <Field SparseArray mStateArray>
    //   16   34:invokevirtual   #1121 <Method void View.saveHierarchyState(SparseArray)>
    //   17   37:aload_0         
    //   18   38:getfield        #119 <Field SparseArray mStateArray>
    //   19   41:invokevirtual   #1122 <Method int SparseArray.size()>
    //   20   44:ifle            7
    //   21   47:aload_1         
    //   22   48:aload_0         
    //   23   49:getfield        #119 <Field SparseArray mStateArray>
    //   24   52:putfield        #730 <Field SparseArray Fragment.mSavedViewState>
    //   25   55:aload_0         
    //   26   56:aconst_null     
    //   27   57:putfield        #119 <Field SparseArray mStateArray>
    //   28   60:return          
    //   29   61:aload_0         
    //   30   62:getfield        #119 <Field SparseArray mStateArray>
    //   31   65:invokevirtual   #1123 <Method void SparseArray.clear()>
    //   32   68:goto            26
    }

    public void setBackStackIndex(int i, BackStackRecord backstackrecord)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 20 handler(s) 229
    //    2    2:aload_0         
    //    3    3:getfield        #304 <Field ArrayList mBackStackIndices>
    //    4    6:ifnonnull       20
    //    5    9:aload_0         
    //    6   10:new             #240 <Class ArrayList>
    //    7   13:dup             
    //    8   14:invokespecial   #241 <Method void ArrayList()>
    //    9   17:putfield        #304 <Field ArrayList mBackStackIndices>
    // try 20 29 handler(s) 229
    //   10   20:aload_0         
    //   11   21:getfield        #304 <Field ArrayList mBackStackIndices>
    //   12   24:invokevirtual   #302 <Method int ArrayList.size()>
    //   13   27:istore          4
    //   14   29:iload_1         
    //   15   30:iload           4
    //   16   32:icmpge          90
    // try 35 77 handler(s) 229
    //   17   35:getstatic       #85  <Field boolean DEBUG>
    //   18   38:ifeq            77
    //   19   41:ldc1            #32  <String "FragmentManager">
    //   20   43:new             #140 <Class StringBuilder>
    //   21   46:dup             
    //   22   47:invokespecial   #141 <Method void StringBuilder()>
    //   23   50:ldc2            #306 <String "Setting back stack index ">
    //   24   53:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   25   56:iload_1         
    //   26   57:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   27   60:ldc2            #311 <String " to ">
    //   28   63:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   29   66:aload_2         
    //   30   67:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   31   70:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   32   73:invokestatic    #260 <Method int Log.v(String, String)>
    //   33   76:pop             
    // try 77 87 handler(s) 229
    //   34   77:aload_0         
    //   35   78:getfield        #304 <Field ArrayList mBackStackIndices>
    //   36   81:iload_1         
    //   37   82:aload_2         
    //   38   83:invokevirtual   #328 <Method Object ArrayList.set(int, Object)>
    //   39   86:pop             
    // try 87 89 handler(s) 229
    //   40   87:aload_0         
    //   41   88:monitorexit     
    //   42   89:return          
    //   43   90:iload           4
    //   44   92:iload_1         
    //   45   93:icmpge          175
    // try 96 123 handler(s) 229
    //   46   96:aload_0         
    //   47   97:getfield        #304 <Field ArrayList mBackStackIndices>
    //   48  100:aconst_null     
    //   49  101:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   50  104:pop             
    //   51  105:aload_0         
    //   52  106:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   53  109:ifnonnull       123
    //   54  112:aload_0         
    //   55  113:new             #240 <Class ArrayList>
    //   56  116:dup             
    //   57  117:invokespecial   #241 <Method void ArrayList()>
    //   58  120:putfield        #298 <Field ArrayList mAvailBackStackIndices>
    // try 123 156 handler(s) 229
    //   59  123:getstatic       #85  <Field boolean DEBUG>
    //   60  126:ifeq            156
    //   61  129:ldc1            #32  <String "FragmentManager">
    //   62  131:new             #140 <Class StringBuilder>
    //   63  134:dup             
    //   64  135:invokespecial   #141 <Method void StringBuilder()>
    //   65  138:ldc2            #1125 <String "Adding available back stack index ">
    //   66  141:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   67  144:iload           4
    //   68  146:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   69  149:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   70  152:invokestatic    #260 <Method int Log.v(String, String)>
    //   71  155:pop             
    // try 156 169 handler(s) 229
    //   72  156:aload_0         
    //   73  157:getfield        #298 <Field ArrayList mAvailBackStackIndices>
    //   74  160:iload           4
    //   75  162:invokestatic    #589 <Method Integer Integer.valueOf(int)>
    //   76  165:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //   77  168:pop             
    //   78  169:iinc            4  1
    //   79  172:goto            90
    // try 175 217 handler(s) 229
    //   80  175:getstatic       #85  <Field boolean DEBUG>
    //   81  178:ifeq            217
    //   82  181:ldc1            #32  <String "FragmentManager">
    //   83  183:new             #140 <Class StringBuilder>
    //   84  186:dup             
    //   85  187:invokespecial   #141 <Method void StringBuilder()>
    //   86  190:ldc2            #322 <String "Adding back stack index ">
    //   87  193:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   88  196:iload_1         
    //   89  197:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
    //   90  200:ldc2            #324 <String " with ">
    //   91  203:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   92  206:aload_2         
    //   93  207:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   94  210:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   95  213:invokestatic    #260 <Method int Log.v(String, String)>
    //   96  216:pop             
    // try 217 226 handler(s) 229
    //   97  217:aload_0         
    //   98  218:getfield        #304 <Field ArrayList mBackStackIndices>
    //   99  221:aload_2         
    //  100  222:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
    //  101  225:pop             
    //  102  226:goto            87
    // finally
    //  103  229:astore_3        
    // try 230 232 handler(s) 229
    //  104  230:aload_0         
    //  105  231:monitorexit     
    //  106  232:aload_3         
    //  107  233:athrow          
    }

    public void showFragment(Fragment fragment, int i, int j)
    {
    //    0    0:getstatic       #85  <Field boolean DEBUG>
    //    1    3:ifeq            32
    //    2    6:ldc1            #32  <String "FragmentManager">
    //    3    8:new             #140 <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #141 <Method void StringBuilder()>
    //    6   15:ldc2            #1128 <String "show: ">
    //    7   18:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_1         
    //    9   22:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #260 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_1         
    //   14   33:getfield        #616 <Field boolean Fragment.mHidden>
    //   15   36:ifeq            114
    //   16   39:aload_1         
    //   17   40:iconst_0        
    //   18   41:putfield        #616 <Field boolean Fragment.mHidden>
    //   19   44:aload_1         
    //   20   45:getfield        #620 <Field View Fragment.mView>
    //   21   48:ifnull          83
    //   22   51:aload_0         
    //   23   52:aload_1         
    //   24   53:iload_2         
    //   25   54:iconst_1        
    //   26   55:iload_3         
    //   27   56:invokevirtual   #624 <Method Animation loadAnimation(Fragment, int, boolean, int)>
    //   28   59:astore          4
    //   29   61:aload           4
    //   30   63:ifnull          75
    //   31   66:aload_1         
    //   32   67:getfield        #620 <Field View Fragment.mView>
    //   33   70:aload           4
    //   34   72:invokevirtual   #629 <Method void View.startAnimation(Animation)>
    //   35   75:aload_1         
    //   36   76:getfield        #620 <Field View Fragment.mView>
    //   37   79:iconst_0        
    //   38   80:invokevirtual   #632 <Method void View.setVisibility(int)>
    //   39   83:aload_1         
    //   40   84:getfield        #276 <Field boolean Fragment.mAdded>
    //   41   87:ifeq            109
    //   42   90:aload_1         
    //   43   91:getfield        #282 <Field boolean Fragment.mHasMenu>
    //   44   94:ifeq            109
    //   45   97:aload_1         
    //   46   98:getfield        #285 <Field boolean Fragment.mMenuVisible>
    //   47  101:ifeq            109
    //   48  104:aload_0         
    //   49  105:iconst_1        
    //   50  106:putfield        #287 <Field boolean mNeedMenuInvalidate>
    //   51  109:aload_1         
    //   52  110:iconst_0        
    //   53  111:invokevirtual   #635 <Method void Fragment.onHiddenChanged(boolean)>
    //   54  114:return          
    }

    void startPendingDeferredFragments()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #420 <Field ArrayList mActive>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:iconst_0        
    //    5    9:istore_1        
    //    6   10:iload_1         
    //    7   11:aload_0         
    //    8   12:getfield        #420 <Field ArrayList mActive>
    //    9   15:invokevirtual   #302 <Method int ArrayList.size()>
    //   10   18:icmpge          7
    //   11   21:aload_0         
    //   12   22:getfield        #420 <Field ArrayList mActive>
    //   13   25:iload_1         
    //   14   26:invokevirtual   #366 <Method Object ArrayList.get(int)>
    //   15   29:checkcast       #266 <Class Fragment>
    //   16   32:astore_2        
    //   17   33:aload_2         
    //   18   34:ifnull          42
    //   19   37:aload_0         
    //   20   38:aload_2         
    //   21   39:invokevirtual   #1130 <Method void performPendingDeferredStart(Fragment)>
    //   22   42:iinc            1  1
    //   23   45:goto            10
    }

    public String toString()
    {
    //    0    0:new             #140 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:sipush          128
    //    3    7:invokespecial   #1131 <Method void StringBuilder(int)>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ldc2            #1133 <String "FragmentManager{">
    //    7   15:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //    8   18:pop             
    //    9   19:aload_1         
    //   10   20:aload_0         
    //   11   21:invokestatic    #431 <Method int System.identityHashCode(Object)>
    //   12   24:invokestatic    #435 <Method String Integer.toHexString(int)>
    //   13   27:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   14   30:pop             
    //   15   31:aload_1         
    //   16   32:ldc2            #1135 <String " in ">
    //   17   35:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   18   38:pop             
    //   19   39:aload_0         
    //   20   40:getfield        #336 <Field Fragment mParent>
    //   21   43:ifnull          67
    //   22   46:aload_0         
    //   23   47:getfield        #336 <Field Fragment mParent>
    //   24   50:aload_1         
    //   25   51:invokestatic    #1141 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //   26   54:aload_1         
    //   27   55:ldc2            #1143 <String "}}">
    //   28   58:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
    //   29   61:pop             
    //   30   62:aload_1         
    //   31   63:invokevirtual   #151 <Method String StringBuilder.toString()>
    //   32   66:areturn         
    //   33   67:aload_0         
    //   34   68:getfield        #216 <Field FragmentActivity mActivity>
    //   35   71:aload_1         
    //   36   72:invokestatic    #1141 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //   37   75:goto            54
    }

    static final Interpolator ACCELERATE_CUBIC;
    static final Interpolator ACCELERATE_QUINT;
    static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    static boolean DEBUG = false;
    static final Interpolator DECELERATE_CUBIC;
    static final Interpolator DECELERATE_QUINT;
    static final boolean HONEYCOMB = false;
    static final String TAG = "FragmentManager";
    static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final String TARGET_STATE_TAG = "android:target_state";
    static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final String VIEW_STATE_TAG = "android:view_state";
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable mTmpActions[];

    // Unreferenced inner class android/support/v4/app/FragmentManagerImpl$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field FragmentManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field FragmentManagerImpl this$0>
        //    2    4:invokevirtual   #22  <Method boolean FragmentManagerImpl.execPendingActions()>
        //    3    7:pop             
        //    4    8:return          
        }

        final FragmentManagerImpl this$0;
    }


    // Unreferenced inner class android/support/v4/app/FragmentManagerImpl$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field FragmentManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field FragmentManagerImpl this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field FragmentManagerImpl this$0>
        //    4    8:getfield        #24  <Field FragmentActivity FragmentManagerImpl.mActivity>
        //    5   11:getfield        #30  <Field Handler FragmentActivity.mHandler>
        //    6   14:aconst_null     
        //    7   15:iconst_m1       
        //    8   16:iconst_0        
        //    9   17:invokevirtual   #34  <Method boolean FragmentManagerImpl.popBackStackState(Handler, String, int, int)>
        //   10   20:pop             
        //   11   21:return          
        }

        final FragmentManagerImpl this$0;
    }


    // Unreferenced inner class android/support/v4/app/FragmentManagerImpl$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field String val$name>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #25  <Field int val$flags>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field FragmentManagerImpl this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field FragmentManagerImpl this$0>
        //    4    8:getfield        #33  <Field FragmentActivity FragmentManagerImpl.mActivity>
        //    5   11:getfield        #39  <Field Handler FragmentActivity.mHandler>
        //    6   14:aload_0         
        //    7   15:getfield        #23  <Field String val$name>
        //    8   18:iconst_m1       
        //    9   19:aload_0         
        //   10   20:getfield        #25  <Field int val$flags>
        //   11   23:invokevirtual   #43  <Method boolean FragmentManagerImpl.popBackStackState(Handler, String, int, int)>
        //   12   26:pop             
        //   13   27:return          
        }

        final FragmentManagerImpl this$0;
        final int val$flags;
        final String val$name;
    }


    // Unreferenced inner class android/support/v4/app/FragmentManagerImpl$4

/* anonymous class */
    class _cls4
        implements Runnable
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field FragmentManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:iload_2         
        //    5    7:putfield        #22  <Field int val$id>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #24  <Field int val$flags>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field FragmentManagerImpl this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #20  <Field FragmentManagerImpl this$0>
        //    4    8:getfield        #32  <Field FragmentActivity FragmentManagerImpl.mActivity>
        //    5   11:getfield        #38  <Field Handler FragmentActivity.mHandler>
        //    6   14:aconst_null     
        //    7   15:aload_0         
        //    8   16:getfield        #22  <Field int val$id>
        //    9   19:aload_0         
        //   10   20:getfield        #24  <Field int val$flags>
        //   11   23:invokevirtual   #42  <Method boolean FragmentManagerImpl.popBackStackState(Handler, String, int, int)>
        //   12   26:pop             
        //   13   27:return          
        }

        final FragmentManagerImpl this$0;
        final int val$flags;
        final int val$id;
    }


    // Unreferenced inner class android/support/v4/app/FragmentManagerImpl$5

/* anonymous class */
    class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field FragmentManagerImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Fragment val$fragment>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onAnimationEnd(Animation animation)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field Fragment val$fragment>
        //    2    4:getfield        #32  <Field View Fragment.mAnimatingAway>
        //    3    7:ifnull          39
        //    4   10:aload_0         
        //    5   11:getfield        #21  <Field Fragment val$fragment>
        //    6   14:aconst_null     
        //    7   15:putfield        #32  <Field View Fragment.mAnimatingAway>
        //    8   18:aload_0         
        //    9   19:getfield        #19  <Field FragmentManagerImpl this$0>
        //   10   22:aload_0         
        //   11   23:getfield        #21  <Field Fragment val$fragment>
        //   12   26:aload_0         
        //   13   27:getfield        #21  <Field Fragment val$fragment>
        //   14   30:getfield        #36  <Field int Fragment.mStateAfterAnimating>
        //   15   33:iconst_0        
        //   16   34:iconst_0        
        //   17   35:iconst_0        
        //   18   36:invokevirtual   #37  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
        //   19   39:return          
        }

        public void onAnimationRepeat(Animation animation)
        {
        //    0    0:return          
        }

        public void onAnimationStart(Animation animation)
        {
        //    0    0:return          
        }

        final FragmentManagerImpl this$0;
        final Fragment val$fragment;
    }

}
