// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.support.v4.util.LogWriter;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, Fragment, FragmentManagerImpl, FragmentActivity

final class BackStackRecord extends FragmentTransaction
    implements FragmentManager.BackStackEntry, Runnable
{
    static final class Op
    {

        Op()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:return          
        }

        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList removed;
    }


    public BackStackRecord(FragmentManagerImpl fragmentmanagerimpl)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #57  <Method void FragmentTransaction()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #59  <Field boolean mAllowAddToBackStack>
    //    5    9:aload_0         
    //    6   10:iconst_m1       
    //    7   11:putfield        #61  <Field int mIndex>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:putfield        #63  <Field FragmentManagerImpl mManager>
    //   11   19:return          
    }

    private void doAddOp(int i, Fragment fragment, String s, int j)
    {
    //    0    0:aload_2         
    //    1    1:aload_0         
    //    2    2:getfield        #63  <Field FragmentManagerImpl mManager>
    //    3    5:putfield        #70  <Field FragmentManagerImpl Fragment.mFragmentManager>
    //    4    8:aload_3         
    //    5    9:ifnull          83
    //    6   12:aload_2         
    //    7   13:getfield        #73  <Field String Fragment.mTag>
    //    8   16:ifnull          78
    //    9   19:aload_3         
    //   10   20:aload_2         
    //   11   21:getfield        #73  <Field String Fragment.mTag>
    //   12   24:invokevirtual   #79  <Method boolean String.equals(Object)>
    //   13   27:ifne            78
    //   14   30:new             #81  <Class IllegalStateException>
    //   15   33:dup             
    //   16   34:new             #83  <Class StringBuilder>
    //   17   37:dup             
    //   18   38:invokespecial   #84  <Method void StringBuilder()>
    //   19   41:ldc1            #86  <String "Can't change tag of fragment ">
    //   20   43:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   21   46:aload_2         
    //   22   47:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   23   50:ldc1            #95  <String ": was ">
    //   24   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   25   55:aload_2         
    //   26   56:getfield        #73  <Field String Fragment.mTag>
    //   27   59:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   28   62:ldc1            #97  <String " now ">
    //   29   64:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   30   67:aload_3         
    //   31   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   32   71:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   33   74:invokespecial   #104 <Method void IllegalStateException(String)>
    //   34   77:athrow          
    //   35   78:aload_2         
    //   36   79:aload_3         
    //   37   80:putfield        #73  <Field String Fragment.mTag>
    //   38   83:iload_1         
    //   39   84:ifeq            160
    //   40   87:aload_2         
    //   41   88:getfield        #107 <Field int Fragment.mFragmentId>
    //   42   91:ifeq            150
    //   43   94:aload_2         
    //   44   95:getfield        #107 <Field int Fragment.mFragmentId>
    //   45   98:iload_1         
    //   46   99:icmpeq          150
    //   47  102:new             #81  <Class IllegalStateException>
    //   48  105:dup             
    //   49  106:new             #83  <Class StringBuilder>
    //   50  109:dup             
    //   51  110:invokespecial   #84  <Method void StringBuilder()>
    //   52  113:ldc1            #109 <String "Can't change container ID of fragment ">
    //   53  115:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   54  118:aload_2         
    //   55  119:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   56  122:ldc1            #95  <String ": was ">
    //   57  124:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   58  127:aload_2         
    //   59  128:getfield        #107 <Field int Fragment.mFragmentId>
    //   60  131:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   61  134:ldc1            #97  <String " now ">
    //   62  136:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   63  139:iload_1         
    //   64  140:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   65  143:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   66  146:invokespecial   #104 <Method void IllegalStateException(String)>
    //   67  149:athrow          
    //   68  150:aload_2         
    //   69  151:iload_1         
    //   70  152:putfield        #107 <Field int Fragment.mFragmentId>
    //   71  155:aload_2         
    //   72  156:iload_1         
    //   73  157:putfield        #115 <Field int Fragment.mContainerId>
    //   74  160:new             #117 <Class BackStackRecord$Op>
    //   75  163:dup             
    //   76  164:invokespecial   #118 <Method void BackStackRecord$Op()>
    //   77  167:astore          5
    //   78  169:aload           5
    //   79  171:iload           4
    //   80  173:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //   81  176:aload           5
    //   82  178:aload_2         
    //   83  179:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   84  182:aload_0         
    //   85  183:aload           5
    //   86  185:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   87  188:return          
    }

    public FragmentTransaction add(int i, Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aconst_null     
    //    4    4:iconst_1        
    //    5    5:invokespecial   #133 <Method void doAddOp(int, Fragment, String, int)>
    //    6    8:aload_0         
    //    7    9:areturn         
    }

    public FragmentTransaction add(int i, Fragment fragment, String s)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:iconst_1        
    //    5    5:invokespecial   #133 <Method void doAddOp(int, Fragment, String, int)>
    //    6    8:aload_0         
    //    7    9:areturn         
    }

    public FragmentTransaction add(Fragment fragment, String s)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:aload_1         
    //    3    3:aload_2         
    //    4    4:iconst_1        
    //    5    5:invokespecial   #133 <Method void doAddOp(int, Fragment, String, int)>
    //    6    8:aload_0         
    //    7    9:areturn         
    }

    void addOp(Op op)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field BackStackRecord$Op mHead>
    //    2    4:ifnonnull       60
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:putfield        #139 <Field BackStackRecord$Op mTail>
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:putfield        #137 <Field BackStackRecord$Op mHead>
    //    9   17:aload_1         
    //   10   18:aload_0         
    //   11   19:getfield        #141 <Field int mEnterAnim>
    //   12   22:putfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //   13   25:aload_1         
    //   14   26:aload_0         
    //   15   27:getfield        #146 <Field int mExitAnim>
    //   16   30:putfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //   17   33:aload_1         
    //   18   34:aload_0         
    //   19   35:getfield        #151 <Field int mPopEnterAnim>
    //   20   38:putfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //   21   41:aload_1         
    //   22   42:aload_0         
    //   23   43:getfield        #156 <Field int mPopExitAnim>
    //   24   46:putfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //   25   49:aload_0         
    //   26   50:iconst_1        
    //   27   51:aload_0         
    //   28   52:getfield        #161 <Field int mNumOp>
    //   29   55:iadd            
    //   30   56:putfield        #161 <Field int mNumOp>
    //   31   59:return          
    //   32   60:aload_1         
    //   33   61:aload_0         
    //   34   62:getfield        #139 <Field BackStackRecord$Op mTail>
    //   35   65:putfield        #164 <Field BackStackRecord$Op BackStackRecord$Op.prev>
    //   36   68:aload_0         
    //   37   69:getfield        #139 <Field BackStackRecord$Op mTail>
    //   38   72:aload_1         
    //   39   73:putfield        #167 <Field BackStackRecord$Op BackStackRecord$Op.next>
    //   40   76:aload_0         
    //   41   77:aload_1         
    //   42   78:putfield        #139 <Field BackStackRecord$Op mTail>
    //   43   81:goto            17
    }

    public FragmentTransaction addToBackStack(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean mAllowAddToBackStack>
    //    2    4:ifne            17
    //    3    7:new             #81  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #171 <String "This FragmentTransaction is not allowed to be added to the back stack.">
    //    6   13:invokespecial   #104 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:iconst_1        
    //   10   19:putfield        #173 <Field boolean mAddToBackStack>
    //   11   22:aload_0         
    //   12   23:aload_1         
    //   13   24:putfield        #175 <Field String mName>
    //   14   27:aload_0         
    //   15   28:areturn         
    }

    public FragmentTransaction attach(Fragment fragment)
    {
    //    0    0:new             #117 <Class BackStackRecord$Op>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void BackStackRecord$Op()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:bipush          7
    //    6   11:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //    7   14:aload_2         
    //    8   15:aload_1         
    //    9   16:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   10   19:aload_0         
    //   11   20:aload_2         
    //   12   21:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   13   24:aload_0         
    //   14   25:areturn         
    }

    void bumpBackStackNesting(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #173 <Field boolean mAddToBackStack>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //    5   11:ifeq            48
    //    6   14:ldc1            #29  <String "FragmentManager">
    //    7   16:new             #83  <Class StringBuilder>
    //    8   19:dup             
    //    9   20:invokespecial   #84  <Method void StringBuilder()>
    //   10   23:ldc1            #186 <String "Bump nesting in ">
    //   11   25:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   12   28:aload_0         
    //   13   29:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   14   32:ldc1            #188 <String " by ">
    //   15   34:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   16   37:iload_1         
    //   17   38:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   18   41:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   19   44:invokestatic    #194 <Method int Log.v(String, String)>
    //   20   47:pop             
    //   21   48:aload_0         
    //   22   49:getfield        #137 <Field BackStackRecord$Op mHead>
    //   23   52:astore_2        
    //   24   53:aload_2         
    //   25   54:ifnull          7
    //   26   57:aload_2         
    //   27   58:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   28   61:ifnull          131
    //   29   64:aload_2         
    //   30   65:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   31   68:astore          6
    //   32   70:aload           6
    //   33   72:iload_1         
    //   34   73:aload           6
    //   35   75:getfield        #197 <Field int Fragment.mBackStackNesting>
    //   36   78:iadd            
    //   37   79:putfield        #197 <Field int Fragment.mBackStackNesting>
    //   38   82:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //   39   85:ifeq            131
    //   40   88:ldc1            #29  <String "FragmentManager">
    //   41   90:new             #83  <Class StringBuilder>
    //   42   93:dup             
    //   43   94:invokespecial   #84  <Method void StringBuilder()>
    //   44   97:ldc1            #199 <String "Bump nesting of ">
    //   45   99:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   46  102:aload_2         
    //   47  103:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   48  106:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   49  109:ldc1            #201 <String " to ">
    //   50  111:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   51  114:aload_2         
    //   52  115:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   53  118:getfield        #197 <Field int Fragment.mBackStackNesting>
    //   54  121:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   55  124:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   56  127:invokestatic    #194 <Method int Log.v(String, String)>
    //   57  130:pop             
    //   58  131:aload_2         
    //   59  132:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   60  135:ifnull          228
    //   61  138:iconst_m1       
    //   62  139:aload_2         
    //   63  140:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   64  143:invokevirtual   #211 <Method int ArrayList.size()>
    //   65  146:iadd            
    //   66  147:istore_3        
    //   67  148:iload_3         
    //   68  149:iflt            228
    //   69  152:aload_2         
    //   70  153:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   71  156:iload_3         
    //   72  157:invokevirtual   #215 <Method Object ArrayList.get(int)>
    //   73  160:checkcast       #67  <Class Fragment>
    //   74  163:astore          4
    //   75  165:aload           4
    //   76  167:iload_1         
    //   77  168:aload           4
    //   78  170:getfield        #197 <Field int Fragment.mBackStackNesting>
    //   79  173:iadd            
    //   80  174:putfield        #197 <Field int Fragment.mBackStackNesting>
    //   81  177:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //   82  180:ifeq            222
    //   83  183:ldc1            #29  <String "FragmentManager">
    //   84  185:new             #83  <Class StringBuilder>
    //   85  188:dup             
    //   86  189:invokespecial   #84  <Method void StringBuilder()>
    //   87  192:ldc1            #199 <String "Bump nesting of ">
    //   88  194:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   89  197:aload           4
    //   90  199:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   91  202:ldc1            #201 <String " to ">
    //   92  204:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   93  207:aload           4
    //   94  209:getfield        #197 <Field int Fragment.mBackStackNesting>
    //   95  212:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   96  215:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   97  218:invokestatic    #194 <Method int Log.v(String, String)>
    //   98  221:pop             
    //   99  222:iinc            3  -1
    //  100  225:goto            148
    //  101  228:aload_2         
    //  102  229:getfield        #167 <Field BackStackRecord$Op BackStackRecord$Op.next>
    //  103  232:astore_2        
    //  104  233:goto            53
    }

    public int commit()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokevirtual   #220 <Method int commitInternal(boolean)>
    //    3    5:ireturn         
    }

    public int commitAllowingStateLoss()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokevirtual   #220 <Method int commitInternal(boolean)>
    //    3    5:ireturn         
    }

    int commitInternal(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #223 <Field boolean mCommitted>
    //    2    4:ifeq            17
    //    3    7:new             #81  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #225 <String "commit already called">
    //    6   13:invokespecial   #104 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //    9   20:ifeq            72
    //   10   23:ldc1            #29  <String "FragmentManager">
    //   11   25:new             #83  <Class StringBuilder>
    //   12   28:dup             
    //   13   29:invokespecial   #84  <Method void StringBuilder()>
    //   14   32:ldc1            #227 <String "Commit: ">
    //   15   34:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   16   37:aload_0         
    //   17   38:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   18   41:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   19   44:invokestatic    #194 <Method int Log.v(String, String)>
    //   20   47:pop             
    //   21   48:aload_0         
    //   22   49:ldc1            #229 <String "  ">
    //   23   51:aconst_null     
    //   24   52:new             #231 <Class PrintWriter>
    //   25   55:dup             
    //   26   56:new             #233 <Class LogWriter>
    //   27   59:dup             
    //   28   60:ldc1            #29  <String "FragmentManager">
    //   29   62:invokespecial   #234 <Method void LogWriter(String)>
    //   30   65:invokespecial   #237 <Method void PrintWriter(java.io.Writer)>
    //   31   68:aconst_null     
    //   32   69:invokevirtual   #241 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
    //   33   72:aload_0         
    //   34   73:iconst_1        
    //   35   74:putfield        #223 <Field boolean mCommitted>
    //   36   77:aload_0         
    //   37   78:getfield        #173 <Field boolean mAddToBackStack>
    //   38   81:ifeq            110
    //   39   84:aload_0         
    //   40   85:aload_0         
    //   41   86:getfield        #63  <Field FragmentManagerImpl mManager>
    //   42   89:aload_0         
    //   43   90:invokevirtual   #245 <Method int FragmentManagerImpl.allocBackStackIndex(BackStackRecord)>
    //   44   93:putfield        #61  <Field int mIndex>
    //   45   96:aload_0         
    //   46   97:getfield        #63  <Field FragmentManagerImpl mManager>
    //   47  100:aload_0         
    //   48  101:iload_1         
    //   49  102:invokevirtual   #249 <Method void FragmentManagerImpl.enqueueAction(Runnable, boolean)>
    //   50  105:aload_0         
    //   51  106:getfield        #61  <Field int mIndex>
    //   52  109:ireturn         
    //   53  110:aload_0         
    //   54  111:iconst_m1       
    //   55  112:putfield        #61  <Field int mIndex>
    //   56  115:goto            96
    }

    public FragmentTransaction detach(Fragment fragment)
    {
    //    0    0:new             #117 <Class BackStackRecord$Op>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void BackStackRecord$Op()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:bipush          6
    //    6   11:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //    7   14:aload_2         
    //    8   15:aload_1         
    //    9   16:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   10   19:aload_0         
    //   11   20:aload_2         
    //   12   21:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   13   24:aload_0         
    //   14   25:areturn         
    }

    public FragmentTransaction disallowAddToBackStack()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #173 <Field boolean mAddToBackStack>
    //    2    4:ifeq            17
    //    3    7:new             #81  <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #254 <String "This transaction is already being added to the back stack">
    //    6   13:invokespecial   #104 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:iconst_0        
    //   10   19:putfield        #59  <Field boolean mAllowAddToBackStack>
    //   11   22:aload_0         
    //   12   23:areturn         
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_3         
    //    3    3:iconst_1        
    //    4    4:invokevirtual   #257 <Method void dump(String, PrintWriter, boolean)>
    //    5    7:return          
    }

    public void dump(String s, PrintWriter printwriter, boolean flag)
    {
    //    0    0:iload_3         
    //    1    1:ifeq            316
    //    2    4:aload_2         
    //    3    5:aload_1         
    //    4    6:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //    5    9:aload_2         
    //    6   10:ldc2            #262 <String "mName=">
    //    7   13:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //    8   16:aload_2         
    //    9   17:aload_0         
    //   10   18:getfield        #175 <Field String mName>
    //   11   21:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   12   24:aload_2         
    //   13   25:ldc2            #264 <String " mIndex=">
    //   14   28:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   15   31:aload_2         
    //   16   32:aload_0         
    //   17   33:getfield        #61  <Field int mIndex>
    //   18   36:invokevirtual   #266 <Method void PrintWriter.print(int)>
    //   19   39:aload_2         
    //   20   40:ldc2            #268 <String " mCommitted=">
    //   21   43:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   22   46:aload_2         
    //   23   47:aload_0         
    //   24   48:getfield        #223 <Field boolean mCommitted>
    //   25   51:invokevirtual   #272 <Method void PrintWriter.println(boolean)>
    //   26   54:aload_0         
    //   27   55:getfield        #274 <Field int mTransition>
    //   28   58:ifeq            102
    //   29   61:aload_2         
    //   30   62:aload_1         
    //   31   63:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   32   66:aload_2         
    //   33   67:ldc2            #276 <String "mTransition=#">
    //   34   70:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   35   73:aload_2         
    //   36   74:aload_0         
    //   37   75:getfield        #274 <Field int mTransition>
    //   38   78:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   39   81:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   40   84:aload_2         
    //   41   85:ldc2            #284 <String " mTransitionStyle=#">
    //   42   88:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   43   91:aload_2         
    //   44   92:aload_0         
    //   45   93:getfield        #286 <Field int mTransitionStyle>
    //   46   96:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   47   99:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //   48  102:aload_0         
    //   49  103:getfield        #141 <Field int mEnterAnim>
    //   50  106:ifne            116
    //   51  109:aload_0         
    //   52  110:getfield        #146 <Field int mExitAnim>
    //   53  113:ifeq            157
    //   54  116:aload_2         
    //   55  117:aload_1         
    //   56  118:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   57  121:aload_2         
    //   58  122:ldc2            #290 <String "mEnterAnim=#">
    //   59  125:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   60  128:aload_2         
    //   61  129:aload_0         
    //   62  130:getfield        #141 <Field int mEnterAnim>
    //   63  133:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   64  136:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   65  139:aload_2         
    //   66  140:ldc2            #292 <String " mExitAnim=#">
    //   67  143:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   68  146:aload_2         
    //   69  147:aload_0         
    //   70  148:getfield        #146 <Field int mExitAnim>
    //   71  151:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   72  154:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //   73  157:aload_0         
    //   74  158:getfield        #151 <Field int mPopEnterAnim>
    //   75  161:ifne            171
    //   76  164:aload_0         
    //   77  165:getfield        #156 <Field int mPopExitAnim>
    //   78  168:ifeq            212
    //   79  171:aload_2         
    //   80  172:aload_1         
    //   81  173:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   82  176:aload_2         
    //   83  177:ldc2            #294 <String "mPopEnterAnim=#">
    //   84  180:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   85  183:aload_2         
    //   86  184:aload_0         
    //   87  185:getfield        #151 <Field int mPopEnterAnim>
    //   88  188:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   89  191:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   90  194:aload_2         
    //   91  195:ldc2            #296 <String " mPopExitAnim=#">
    //   92  198:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //   93  201:aload_2         
    //   94  202:aload_0         
    //   95  203:getfield        #156 <Field int mPopExitAnim>
    //   96  206:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   97  209:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //   98  212:aload_0         
    //   99  213:getfield        #298 <Field int mBreadCrumbTitleRes>
    //  100  216:ifne            226
    //  101  219:aload_0         
    //  102  220:getfield        #300 <Field CharSequence mBreadCrumbTitleText>
    //  103  223:ifnull          264
    //  104  226:aload_2         
    //  105  227:aload_1         
    //  106  228:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  107  231:aload_2         
    //  108  232:ldc2            #302 <String "mBreadCrumbTitleRes=#">
    //  109  235:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  110  238:aload_2         
    //  111  239:aload_0         
    //  112  240:getfield        #298 <Field int mBreadCrumbTitleRes>
    //  113  243:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  114  246:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  115  249:aload_2         
    //  116  250:ldc2            #304 <String " mBreadCrumbTitleText=">
    //  117  253:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  118  256:aload_2         
    //  119  257:aload_0         
    //  120  258:getfield        #300 <Field CharSequence mBreadCrumbTitleText>
    //  121  261:invokevirtual   #307 <Method void PrintWriter.println(Object)>
    //  122  264:aload_0         
    //  123  265:getfield        #309 <Field int mBreadCrumbShortTitleRes>
    //  124  268:ifne            278
    //  125  271:aload_0         
    //  126  272:getfield        #311 <Field CharSequence mBreadCrumbShortTitleText>
    //  127  275:ifnull          316
    //  128  278:aload_2         
    //  129  279:aload_1         
    //  130  280:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  131  283:aload_2         
    //  132  284:ldc2            #313 <String "mBreadCrumbShortTitleRes=#">
    //  133  287:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  134  290:aload_2         
    //  135  291:aload_0         
    //  136  292:getfield        #309 <Field int mBreadCrumbShortTitleRes>
    //  137  295:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  138  298:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  139  301:aload_2         
    //  140  302:ldc2            #315 <String " mBreadCrumbShortTitleText=">
    //  141  305:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  142  308:aload_2         
    //  143  309:aload_0         
    //  144  310:getfield        #311 <Field CharSequence mBreadCrumbShortTitleText>
    //  145  313:invokevirtual   #307 <Method void PrintWriter.println(Object)>
    //  146  316:aload_0         
    //  147  317:getfield        #137 <Field BackStackRecord$Op mHead>
    //  148  320:ifnull          817
    //  149  323:aload_2         
    //  150  324:aload_1         
    //  151  325:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  152  328:aload_2         
    //  153  329:ldc2            #317 <String "Operations:">
    //  154  332:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //  155  335:new             #83  <Class StringBuilder>
    //  156  338:dup             
    //  157  339:invokespecial   #84  <Method void StringBuilder()>
    //  158  342:aload_1         
    //  159  343:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  160  346:ldc2            #319 <String "    ">
    //  161  349:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  162  352:invokevirtual   #101 <Method String StringBuilder.toString()>
    //  163  355:astore          4
    //  164  357:aload_0         
    //  165  358:getfield        #137 <Field BackStackRecord$Op mHead>
    //  166  361:astore          5
    //  167  363:iconst_0        
    //  168  364:istore          6
    //  169  366:aload           5
    //  170  368:ifnull          817
    //  171  371:aload           5
    //  172  373:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //  173  376:tableswitch     0 7: default 424
    //                   0 699
    //                   1 707
    //                   2 715
    //                   3 723
    //                   4 731
    //                   5 739
    //                   6 747
    //                   7 755
    //  174  424:new             #83  <Class StringBuilder>
    //  175  427:dup             
    //  176  428:invokespecial   #84  <Method void StringBuilder()>
    //  177  431:ldc2            #321 <String "cmd=">
    //  178  434:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  179  437:aload           5
    //  180  439:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //  181  442:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //  182  445:invokevirtual   #101 <Method String StringBuilder.toString()>
    //  183  448:astore          7
    //  184  450:aload_2         
    //  185  451:aload_1         
    //  186  452:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  187  455:aload_2         
    //  188  456:ldc2            #323 <String "  Op #">
    //  189  459:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  190  462:aload_2         
    //  191  463:iload           6
    //  192  465:invokevirtual   #266 <Method void PrintWriter.print(int)>
    //  193  468:aload_2         
    //  194  469:ldc2            #325 <String ": ">
    //  195  472:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  196  475:aload_2         
    //  197  476:aload           7
    //  198  478:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  199  481:aload_2         
    //  200  482:ldc2            #327 <String " ">
    //  201  485:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  202  488:aload_2         
    //  203  489:aload           5
    //  204  491:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  205  494:invokevirtual   #307 <Method void PrintWriter.println(Object)>
    //  206  497:iload_3         
    //  207  498:ifeq            619
    //  208  501:aload           5
    //  209  503:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //  210  506:ifne            517
    //  211  509:aload           5
    //  212  511:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  213  514:ifeq            560
    //  214  517:aload_2         
    //  215  518:aload_1         
    //  216  519:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  217  522:aload_2         
    //  218  523:ldc2            #329 <String "enterAnim=#">
    //  219  526:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  220  529:aload_2         
    //  221  530:aload           5
    //  222  532:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //  223  535:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  224  538:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  225  541:aload_2         
    //  226  542:ldc2            #331 <String " exitAnim=#">
    //  227  545:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  228  548:aload_2         
    //  229  549:aload           5
    //  230  551:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  231  554:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  232  557:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //  233  560:aload           5
    //  234  562:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  235  565:ifne            576
    //  236  568:aload           5
    //  237  570:getfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //  238  573:ifeq            619
    //  239  576:aload_2         
    //  240  577:aload_1         
    //  241  578:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  242  581:aload_2         
    //  243  582:ldc2            #333 <String "popEnterAnim=#">
    //  244  585:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  245  588:aload_2         
    //  246  589:aload           5
    //  247  591:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  248  594:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  249  597:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  250  600:aload_2         
    //  251  601:ldc2            #335 <String " popExitAnim=#">
    //  252  604:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  253  607:aload_2         
    //  254  608:aload           5
    //  255  610:getfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //  256  613:invokestatic    #282 <Method String Integer.toHexString(int)>
    //  257  616:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //  258  619:aload           5
    //  259  621:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  260  624:ifnull          804
    //  261  627:aload           5
    //  262  629:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  263  632:invokevirtual   #211 <Method int ArrayList.size()>
    //  264  635:ifle            804
    //  265  638:iconst_0        
    //  266  639:istore          8
    //  267  641:iload           8
    //  268  643:aload           5
    //  269  645:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  270  648:invokevirtual   #211 <Method int ArrayList.size()>
    //  271  651:icmpge          804
    //  272  654:aload_2         
    //  273  655:aload           4
    //  274  657:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  275  660:aload           5
    //  276  662:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  277  665:invokevirtual   #211 <Method int ArrayList.size()>
    //  278  668:iconst_1        
    //  279  669:icmpne          763
    //  280  672:aload_2         
    //  281  673:ldc2            #337 <String "Removed: ">
    //  282  676:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  283  679:aload_2         
    //  284  680:aload           5
    //  285  682:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  286  685:iload           8
    //  287  687:invokevirtual   #215 <Method Object ArrayList.get(int)>
    //  288  690:invokevirtual   #307 <Method void PrintWriter.println(Object)>
    //  289  693:iinc            8  1
    //  290  696:goto            641
    //  291  699:ldc2            #339 <String "NULL">
    //  292  702:astore          7
    //  293  704:goto            450
    //  294  707:ldc2            #341 <String "ADD">
    //  295  710:astore          7
    //  296  712:goto            450
    //  297  715:ldc2            #343 <String "REPLACE">
    //  298  718:astore          7
    //  299  720:goto            450
    //  300  723:ldc2            #345 <String "REMOVE">
    //  301  726:astore          7
    //  302  728:goto            450
    //  303  731:ldc2            #347 <String "HIDE">
    //  304  734:astore          7
    //  305  736:goto            450
    //  306  739:ldc2            #349 <String "SHOW">
    //  307  742:astore          7
    //  308  744:goto            450
    //  309  747:ldc2            #351 <String "DETACH">
    //  310  750:astore          7
    //  311  752:goto            450
    //  312  755:ldc2            #353 <String "ATTACH">
    //  313  758:astore          7
    //  314  760:goto            450
    //  315  763:iload           8
    //  316  765:ifne            775
    //  317  768:aload_2         
    //  318  769:ldc2            #355 <String "Removed:">
    //  319  772:invokevirtual   #288 <Method void PrintWriter.println(String)>
    //  320  775:aload_2         
    //  321  776:aload           4
    //  322  778:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  323  781:aload_2         
    //  324  782:ldc2            #357 <String "  #">
    //  325  785:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  326  788:aload_2         
    //  327  789:iload           8
    //  328  791:invokevirtual   #266 <Method void PrintWriter.print(int)>
    //  329  794:aload_2         
    //  330  795:ldc2            #325 <String ": ">
    //  331  798:invokevirtual   #260 <Method void PrintWriter.print(String)>
    //  332  801:goto            679
    //  333  804:aload           5
    //  334  806:getfield        #167 <Field BackStackRecord$Op BackStackRecord$Op.next>
    //  335  809:astore          5
    //  336  811:iinc            6  1
    //  337  814:goto            366
    //  338  817:return          
    }

    public CharSequence getBreadCrumbShortTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #309 <Field int mBreadCrumbShortTitleRes>
    //    2    4:ifeq            22
    //    3    7:aload_0         
    //    4    8:getfield        #63  <Field FragmentManagerImpl mManager>
    //    5   11:getfield        #363 <Field FragmentActivity FragmentManagerImpl.mActivity>
    //    6   14:aload_0         
    //    7   15:getfield        #309 <Field int mBreadCrumbShortTitleRes>
    //    8   18:invokevirtual   #369 <Method CharSequence FragmentActivity.getText(int)>
    //    9   21:areturn         
    //   10   22:aload_0         
    //   11   23:getfield        #311 <Field CharSequence mBreadCrumbShortTitleText>
    //   12   26:areturn         
    }

    public int getBreadCrumbShortTitleRes()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #309 <Field int mBreadCrumbShortTitleRes>
    //    2    4:ireturn         
    }

    public CharSequence getBreadCrumbTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field int mBreadCrumbTitleRes>
    //    2    4:ifeq            22
    //    3    7:aload_0         
    //    4    8:getfield        #63  <Field FragmentManagerImpl mManager>
    //    5   11:getfield        #363 <Field FragmentActivity FragmentManagerImpl.mActivity>
    //    6   14:aload_0         
    //    7   15:getfield        #298 <Field int mBreadCrumbTitleRes>
    //    8   18:invokevirtual   #369 <Method CharSequence FragmentActivity.getText(int)>
    //    9   21:areturn         
    //   10   22:aload_0         
    //   11   23:getfield        #300 <Field CharSequence mBreadCrumbTitleText>
    //   12   26:areturn         
    }

    public int getBreadCrumbTitleRes()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #298 <Field int mBreadCrumbTitleRes>
    //    2    4:ireturn         
    }

    public int getId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #61  <Field int mIndex>
    //    2    4:ireturn         
    }

    public String getName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field String mName>
    //    2    4:areturn         
    }

    public int getTransition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #274 <Field int mTransition>
    //    2    4:ireturn         
    }

    public int getTransitionStyle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #286 <Field int mTransitionStyle>
    //    2    4:ireturn         
    }

    public FragmentTransaction hide(Fragment fragment)
    {
    //    0    0:new             #117 <Class BackStackRecord$Op>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void BackStackRecord$Op()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:iconst_4        
    //    6   10:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //    7   13:aload_2         
    //    8   14:aload_1         
    //    9   15:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   10   18:aload_0         
    //   11   19:aload_2         
    //   12   20:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   13   23:aload_0         
    //   14   24:areturn         
    }

    public boolean isAddToBackStackAllowed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean mAllowAddToBackStack>
    //    2    4:ireturn         
    }

    public boolean isEmpty()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #161 <Field int mNumOp>
    //    2    4:ifne            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public void popFromBackStack(boolean flag)
    {
    //    0    0:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //    1    3:ifeq            56
    //    2    6:ldc1            #29  <String "FragmentManager">
    //    3    8:new             #83  <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #84  <Method void StringBuilder()>
    //    6   15:ldc2            #383 <String "popFromBackStack: ">
    //    7   18:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_0         
    //    9   22:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #194 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_0         
    //   14   33:ldc1            #229 <String "  ">
    //   15   35:aconst_null     
    //   16   36:new             #231 <Class PrintWriter>
    //   17   39:dup             
    //   18   40:new             #233 <Class LogWriter>
    //   19   43:dup             
    //   20   44:ldc1            #29  <String "FragmentManager">
    //   21   46:invokespecial   #234 <Method void LogWriter(String)>
    //   22   49:invokespecial   #237 <Method void PrintWriter(java.io.Writer)>
    //   23   52:aconst_null     
    //   24   53:invokevirtual   #241 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
    //   25   56:aload_0         
    //   26   57:iconst_m1       
    //   27   58:invokevirtual   #385 <Method void bumpBackStackNesting(int)>
    //   28   61:aload_0         
    //   29   62:getfield        #139 <Field BackStackRecord$Op mTail>
    //   30   65:astore_2        
    //   31   66:aload_2         
    //   32   67:ifnull          468
    //   33   70:aload_2         
    //   34   71:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //   35   74:tableswitch     1 7: default 116
    //                   1 147
    //                   2 190
    //                   3 291
    //                   4 319
    //                   5 357
    //                   6 395
    //                   7 433
    //   36  116:new             #387 <Class IllegalArgumentException>
    //   37  119:dup             
    //   38  120:new             #83  <Class StringBuilder>
    //   39  123:dup             
    //   40  124:invokespecial   #84  <Method void StringBuilder()>
    //   41  127:ldc2            #389 <String "Unknown cmd: ">
    //   42  130:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   43  133:aload_2         
    //   44  134:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //   45  137:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   46  140:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   47  143:invokespecial   #390 <Method void IllegalArgumentException(String)>
    //   48  146:athrow          
    //   49  147:aload_2         
    //   50  148:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   51  151:astore          11
    //   52  153:aload           11
    //   53  155:aload_2         
    //   54  156:getfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //   55  159:putfield        #393 <Field int Fragment.mNextAnim>
    //   56  162:aload_0         
    //   57  163:getfield        #63  <Field FragmentManagerImpl mManager>
    //   58  166:aload           11
    //   59  168:aload_0         
    //   60  169:getfield        #274 <Field int mTransition>
    //   61  172:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //   62  175:aload_0         
    //   63  176:getfield        #286 <Field int mTransitionStyle>
    //   64  179:invokevirtual   #401 <Method void FragmentManagerImpl.removeFragment(Fragment, int, int)>
    //   65  182:aload_2         
    //   66  183:getfield        #164 <Field BackStackRecord$Op BackStackRecord$Op.prev>
    //   67  186:astore_2        
    //   68  187:goto            66
    //   69  190:aload_2         
    //   70  191:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   71  194:astore          8
    //   72  196:aload           8
    //   73  198:ifnull          230
    //   74  201:aload           8
    //   75  203:aload_2         
    //   76  204:getfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //   77  207:putfield        #393 <Field int Fragment.mNextAnim>
    //   78  210:aload_0         
    //   79  211:getfield        #63  <Field FragmentManagerImpl mManager>
    //   80  214:aload           8
    //   81  216:aload_0         
    //   82  217:getfield        #274 <Field int mTransition>
    //   83  220:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //   84  223:aload_0         
    //   85  224:getfield        #286 <Field int mTransitionStyle>
    //   86  227:invokevirtual   #401 <Method void FragmentManagerImpl.removeFragment(Fragment, int, int)>
    //   87  230:aload_2         
    //   88  231:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   89  234:ifnull          182
    //   90  237:iconst_0        
    //   91  238:istore          9
    //   92  240:iload           9
    //   93  242:aload_2         
    //   94  243:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   95  246:invokevirtual   #211 <Method int ArrayList.size()>
    //   96  249:icmpge          182
    //   97  252:aload_2         
    //   98  253:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //   99  256:iload           9
    //  100  258:invokevirtual   #215 <Method Object ArrayList.get(int)>
    //  101  261:checkcast       #67  <Class Fragment>
    //  102  264:astore          10
    //  103  266:aload           10
    //  104  268:aload_2         
    //  105  269:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  106  272:putfield        #393 <Field int Fragment.mNextAnim>
    //  107  275:aload_0         
    //  108  276:getfield        #63  <Field FragmentManagerImpl mManager>
    //  109  279:aload           10
    //  110  281:iconst_0        
    //  111  282:invokevirtual   #405 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
    //  112  285:iinc            9  1
    //  113  288:goto            240
    //  114  291:aload_2         
    //  115  292:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  116  295:astore          7
    //  117  297:aload           7
    //  118  299:aload_2         
    //  119  300:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  120  303:putfield        #393 <Field int Fragment.mNextAnim>
    //  121  306:aload_0         
    //  122  307:getfield        #63  <Field FragmentManagerImpl mManager>
    //  123  310:aload           7
    //  124  312:iconst_0        
    //  125  313:invokevirtual   #405 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
    //  126  316:goto            182
    //  127  319:aload_2         
    //  128  320:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  129  323:astore          6
    //  130  325:aload           6
    //  131  327:aload_2         
    //  132  328:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  133  331:putfield        #393 <Field int Fragment.mNextAnim>
    //  134  334:aload_0         
    //  135  335:getfield        #63  <Field FragmentManagerImpl mManager>
    //  136  338:aload           6
    //  137  340:aload_0         
    //  138  341:getfield        #274 <Field int mTransition>
    //  139  344:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //  140  347:aload_0         
    //  141  348:getfield        #286 <Field int mTransitionStyle>
    //  142  351:invokevirtual   #408 <Method void FragmentManagerImpl.showFragment(Fragment, int, int)>
    //  143  354:goto            182
    //  144  357:aload_2         
    //  145  358:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  146  361:astore          5
    //  147  363:aload           5
    //  148  365:aload_2         
    //  149  366:getfield        #159 <Field int BackStackRecord$Op.popExitAnim>
    //  150  369:putfield        #393 <Field int Fragment.mNextAnim>
    //  151  372:aload_0         
    //  152  373:getfield        #63  <Field FragmentManagerImpl mManager>
    //  153  376:aload           5
    //  154  378:aload_0         
    //  155  379:getfield        #274 <Field int mTransition>
    //  156  382:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //  157  385:aload_0         
    //  158  386:getfield        #286 <Field int mTransitionStyle>
    //  159  389:invokevirtual   #411 <Method void FragmentManagerImpl.hideFragment(Fragment, int, int)>
    //  160  392:goto            182
    //  161  395:aload_2         
    //  162  396:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  163  399:astore          4
    //  164  401:aload           4
    //  165  403:aload_2         
    //  166  404:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  167  407:putfield        #393 <Field int Fragment.mNextAnim>
    //  168  410:aload_0         
    //  169  411:getfield        #63  <Field FragmentManagerImpl mManager>
    //  170  414:aload           4
    //  171  416:aload_0         
    //  172  417:getfield        #274 <Field int mTransition>
    //  173  420:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //  174  423:aload_0         
    //  175  424:getfield        #286 <Field int mTransitionStyle>
    //  176  427:invokevirtual   #414 <Method void FragmentManagerImpl.attachFragment(Fragment, int, int)>
    //  177  430:goto            182
    //  178  433:aload_2         
    //  179  434:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  180  437:astore_3        
    //  181  438:aload_3         
    //  182  439:aload_2         
    //  183  440:getfield        #154 <Field int BackStackRecord$Op.popEnterAnim>
    //  184  443:putfield        #393 <Field int Fragment.mNextAnim>
    //  185  446:aload_0         
    //  186  447:getfield        #63  <Field FragmentManagerImpl mManager>
    //  187  450:aload_3         
    //  188  451:aload_0         
    //  189  452:getfield        #274 <Field int mTransition>
    //  190  455:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //  191  458:aload_0         
    //  192  459:getfield        #286 <Field int mTransitionStyle>
    //  193  462:invokevirtual   #417 <Method void FragmentManagerImpl.detachFragment(Fragment, int, int)>
    //  194  465:goto            182
    //  195  468:iload_1         
    //  196  469:ifeq            498
    //  197  472:aload_0         
    //  198  473:getfield        #63  <Field FragmentManagerImpl mManager>
    //  199  476:aload_0         
    //  200  477:getfield        #63  <Field FragmentManagerImpl mManager>
    //  201  480:getfield        #420 <Field int FragmentManagerImpl.mCurState>
    //  202  483:aload_0         
    //  203  484:getfield        #274 <Field int mTransition>
    //  204  487:invokestatic    #397 <Method int FragmentManagerImpl.reverseTransit(int)>
    //  205  490:aload_0         
    //  206  491:getfield        #286 <Field int mTransitionStyle>
    //  207  494:iconst_1        
    //  208  495:invokevirtual   #424 <Method void FragmentManagerImpl.moveToState(int, int, int, boolean)>
    //  209  498:aload_0         
    //  210  499:getfield        #61  <Field int mIndex>
    //  211  502:iflt            521
    //  212  505:aload_0         
    //  213  506:getfield        #63  <Field FragmentManagerImpl mManager>
    //  214  509:aload_0         
    //  215  510:getfield        #61  <Field int mIndex>
    //  216  513:invokevirtual   #427 <Method void FragmentManagerImpl.freeBackStackIndex(int)>
    //  217  516:aload_0         
    //  218  517:iconst_m1       
    //  219  518:putfield        #61  <Field int mIndex>
    //  220  521:return          
    }

    public FragmentTransaction remove(Fragment fragment)
    {
    //    0    0:new             #117 <Class BackStackRecord$Op>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void BackStackRecord$Op()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:iconst_3        
    //    6   10:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //    7   13:aload_2         
    //    8   14:aload_1         
    //    9   15:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   10   18:aload_0         
    //   11   19:aload_2         
    //   12   20:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   13   23:aload_0         
    //   14   24:areturn         
    }

    public FragmentTransaction replace(int i, Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aconst_null     
    //    4    4:invokevirtual   #431 <Method FragmentTransaction replace(int, Fragment, String)>
    //    5    7:areturn         
    }

    public FragmentTransaction replace(int i, Fragment fragment, String s)
    {
    //    0    0:iload_1         
    //    1    1:ifne            15
    //    2    4:new             #387 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc2            #433 <String "Must use non-zero containerViewId">
    //    5   11:invokespecial   #390 <Method void IllegalArgumentException(String)>
    //    6   14:athrow          
    //    7   15:aload_0         
    //    8   16:iload_1         
    //    9   17:aload_2         
    //   10   18:aload_3         
    //   11   19:iconst_2        
    //   12   20:invokespecial   #133 <Method void doAddOp(int, Fragment, String, int)>
    //   13   23:aload_0         
    //   14   24:areturn         
    }

    public void run()
    {
    //    0    0:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //    1    3:ifeq            32
    //    2    6:ldc1            #29  <String "FragmentManager">
    //    3    8:new             #83  <Class StringBuilder>
    //    4   11:dup             
    //    5   12:invokespecial   #84  <Method void StringBuilder()>
    //    6   15:ldc2            #436 <String "Run: ">
    //    7   18:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //    8   21:aload_0         
    //    9   22:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   10   25:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   11   28:invokestatic    #194 <Method int Log.v(String, String)>
    //   12   31:pop             
    //   13   32:aload_0         
    //   14   33:getfield        #173 <Field boolean mAddToBackStack>
    //   15   36:ifeq            57
    //   16   39:aload_0         
    //   17   40:getfield        #61  <Field int mIndex>
    //   18   43:ifge            57
    //   19   46:new             #81  <Class IllegalStateException>
    //   20   49:dup             
    //   21   50:ldc2            #438 <String "addToBackStack() called after commit()">
    //   22   53:invokespecial   #104 <Method void IllegalStateException(String)>
    //   23   56:athrow          
    //   24   57:aload_0         
    //   25   58:iconst_1        
    //   26   59:invokevirtual   #385 <Method void bumpBackStackNesting(int)>
    //   27   62:aload_0         
    //   28   63:getfield        #137 <Field BackStackRecord$Op mHead>
    //   29   66:astore_1        
    //   30   67:aload_1         
    //   31   68:ifnull          631
    //   32   71:aload_1         
    //   33   72:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //   34   75:tableswitch     1 7: default 116
    //                   1 147
    //                   2 180
    //                   3 462
    //                   4 497
    //                   5 532
    //                   6 567
    //                   7 599
    //   35  116:new             #387 <Class IllegalArgumentException>
    //   36  119:dup             
    //   37  120:new             #83  <Class StringBuilder>
    //   38  123:dup             
    //   39  124:invokespecial   #84  <Method void StringBuilder()>
    //   40  127:ldc2            #389 <String "Unknown cmd: ">
    //   41  130:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   42  133:aload_1         
    //   43  134:getfield        #121 <Field int BackStackRecord$Op.cmd>
    //   44  137:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   45  140:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   46  143:invokespecial   #390 <Method void IllegalArgumentException(String)>
    //   47  146:athrow          
    //   48  147:aload_1         
    //   49  148:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   50  151:astore          13
    //   51  153:aload           13
    //   52  155:aload_1         
    //   53  156:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //   54  159:putfield        #393 <Field int Fragment.mNextAnim>
    //   55  162:aload_0         
    //   56  163:getfield        #63  <Field FragmentManagerImpl mManager>
    //   57  166:aload           13
    //   58  168:iconst_0        
    //   59  169:invokevirtual   #405 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
    //   60  172:aload_1         
    //   61  173:getfield        #167 <Field BackStackRecord$Op BackStackRecord$Op.next>
    //   62  176:astore_1        
    //   63  177:goto            67
    //   64  180:aload_1         
    //   65  181:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   66  184:astore          7
    //   67  186:aload_0         
    //   68  187:getfield        #63  <Field FragmentManagerImpl mManager>
    //   69  190:getfield        #441 <Field ArrayList FragmentManagerImpl.mAdded>
    //   70  193:ifnull          435
    //   71  196:iconst_0        
    //   72  197:istore          8
    //   73  199:iload           8
    //   74  201:aload_0         
    //   75  202:getfield        #63  <Field FragmentManagerImpl mManager>
    //   76  205:getfield        #441 <Field ArrayList FragmentManagerImpl.mAdded>
    //   77  208:invokevirtual   #211 <Method int ArrayList.size()>
    //   78  211:icmpge          435
    //   79  214:aload_0         
    //   80  215:getfield        #63  <Field FragmentManagerImpl mManager>
    //   81  218:getfield        #441 <Field ArrayList FragmentManagerImpl.mAdded>
    //   82  221:iload           8
    //   83  223:invokevirtual   #215 <Method Object ArrayList.get(int)>
    //   84  226:checkcast       #67  <Class Fragment>
    //   85  229:astore          9
    //   86  231:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //   87  234:ifeq            275
    //   88  237:ldc1            #29  <String "FragmentManager">
    //   89  239:new             #83  <Class StringBuilder>
    //   90  242:dup             
    //   91  243:invokespecial   #84  <Method void StringBuilder()>
    //   92  246:ldc2            #443 <String "OP_REPLACE: adding=">
    //   93  249:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   94  252:aload           7
    //   95  254:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //   96  257:ldc2            #445 <String " old=">
    //   97  260:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   98  263:aload           9
    //   99  265:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //  100  268:invokevirtual   #101 <Method String StringBuilder.toString()>
    //  101  271:invokestatic    #194 <Method int Log.v(String, String)>
    //  102  274:pop             
    //  103  275:aload           7
    //  104  277:ifnull          293
    //  105  280:aload           9
    //  106  282:getfield        #115 <Field int Fragment.mContainerId>
    //  107  285:aload           7
    //  108  287:getfield        #115 <Field int Fragment.mContainerId>
    //  109  290:icmpne          308
    //  110  293:aload           9
    //  111  295:aload           7
    //  112  297:if_acmpne       314
    //  113  300:aconst_null     
    //  114  301:astore          7
    //  115  303:aload_1         
    //  116  304:aconst_null     
    //  117  305:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  118  308:iinc            8  1
    //  119  311:goto            199
    //  120  314:aload_1         
    //  121  315:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  122  318:ifnonnull       332
    //  123  321:aload_1         
    //  124  322:new             #207 <Class ArrayList>
    //  125  325:dup             
    //  126  326:invokespecial   #446 <Method void ArrayList()>
    //  127  329:putfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  128  332:aload_1         
    //  129  333:getfield        #205 <Field ArrayList BackStackRecord$Op.removed>
    //  130  336:aload           9
    //  131  338:invokevirtual   #448 <Method boolean ArrayList.add(Object)>
    //  132  341:pop             
    //  133  342:aload           9
    //  134  344:aload_1         
    //  135  345:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  136  348:putfield        #393 <Field int Fragment.mNextAnim>
    //  137  351:aload_0         
    //  138  352:getfield        #173 <Field boolean mAddToBackStack>
    //  139  355:ifeq            415
    //  140  358:aload           9
    //  141  360:iconst_1        
    //  142  361:aload           9
    //  143  363:getfield        #197 <Field int Fragment.mBackStackNesting>
    //  144  366:iadd            
    //  145  367:putfield        #197 <Field int Fragment.mBackStackNesting>
    //  146  370:getstatic       #184 <Field boolean FragmentManagerImpl.DEBUG>
    //  147  373:ifeq            415
    //  148  376:ldc1            #29  <String "FragmentManager">
    //  149  378:new             #83  <Class StringBuilder>
    //  150  381:dup             
    //  151  382:invokespecial   #84  <Method void StringBuilder()>
    //  152  385:ldc1            #199 <String "Bump nesting of ">
    //  153  387:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  154  390:aload           9
    //  155  392:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
    //  156  395:ldc1            #201 <String " to ">
    //  157  397:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  158  400:aload           9
    //  159  402:getfield        #197 <Field int Fragment.mBackStackNesting>
    //  160  405:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //  161  408:invokevirtual   #101 <Method String StringBuilder.toString()>
    //  162  411:invokestatic    #194 <Method int Log.v(String, String)>
    //  163  414:pop             
    //  164  415:aload_0         
    //  165  416:getfield        #63  <Field FragmentManagerImpl mManager>
    //  166  419:aload           9
    //  167  421:aload_0         
    //  168  422:getfield        #274 <Field int mTransition>
    //  169  425:aload_0         
    //  170  426:getfield        #286 <Field int mTransitionStyle>
    //  171  429:invokevirtual   #401 <Method void FragmentManagerImpl.removeFragment(Fragment, int, int)>
    //  172  432:goto            308
    //  173  435:aload           7
    //  174  437:ifnull          172
    //  175  440:aload           7
    //  176  442:aload_1         
    //  177  443:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //  178  446:putfield        #393 <Field int Fragment.mNextAnim>
    //  179  449:aload_0         
    //  180  450:getfield        #63  <Field FragmentManagerImpl mManager>
    //  181  453:aload           7
    //  182  455:iconst_0        
    //  183  456:invokevirtual   #405 <Method void FragmentManagerImpl.addFragment(Fragment, boolean)>
    //  184  459:goto            172
    //  185  462:aload_1         
    //  186  463:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  187  466:astore          6
    //  188  468:aload           6
    //  189  470:aload_1         
    //  190  471:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  191  474:putfield        #393 <Field int Fragment.mNextAnim>
    //  192  477:aload_0         
    //  193  478:getfield        #63  <Field FragmentManagerImpl mManager>
    //  194  481:aload           6
    //  195  483:aload_0         
    //  196  484:getfield        #274 <Field int mTransition>
    //  197  487:aload_0         
    //  198  488:getfield        #286 <Field int mTransitionStyle>
    //  199  491:invokevirtual   #401 <Method void FragmentManagerImpl.removeFragment(Fragment, int, int)>
    //  200  494:goto            172
    //  201  497:aload_1         
    //  202  498:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  203  501:astore          5
    //  204  503:aload           5
    //  205  505:aload_1         
    //  206  506:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  207  509:putfield        #393 <Field int Fragment.mNextAnim>
    //  208  512:aload_0         
    //  209  513:getfield        #63  <Field FragmentManagerImpl mManager>
    //  210  516:aload           5
    //  211  518:aload_0         
    //  212  519:getfield        #274 <Field int mTransition>
    //  213  522:aload_0         
    //  214  523:getfield        #286 <Field int mTransitionStyle>
    //  215  526:invokevirtual   #411 <Method void FragmentManagerImpl.hideFragment(Fragment, int, int)>
    //  216  529:goto            172
    //  217  532:aload_1         
    //  218  533:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  219  536:astore          4
    //  220  538:aload           4
    //  221  540:aload_1         
    //  222  541:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //  223  544:putfield        #393 <Field int Fragment.mNextAnim>
    //  224  547:aload_0         
    //  225  548:getfield        #63  <Field FragmentManagerImpl mManager>
    //  226  551:aload           4
    //  227  553:aload_0         
    //  228  554:getfield        #274 <Field int mTransition>
    //  229  557:aload_0         
    //  230  558:getfield        #286 <Field int mTransitionStyle>
    //  231  561:invokevirtual   #408 <Method void FragmentManagerImpl.showFragment(Fragment, int, int)>
    //  232  564:goto            172
    //  233  567:aload_1         
    //  234  568:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  235  571:astore_3        
    //  236  572:aload_3         
    //  237  573:aload_1         
    //  238  574:getfield        #149 <Field int BackStackRecord$Op.exitAnim>
    //  239  577:putfield        #393 <Field int Fragment.mNextAnim>
    //  240  580:aload_0         
    //  241  581:getfield        #63  <Field FragmentManagerImpl mManager>
    //  242  584:aload_3         
    //  243  585:aload_0         
    //  244  586:getfield        #274 <Field int mTransition>
    //  245  589:aload_0         
    //  246  590:getfield        #286 <Field int mTransitionStyle>
    //  247  593:invokevirtual   #417 <Method void FragmentManagerImpl.detachFragment(Fragment, int, int)>
    //  248  596:goto            172
    //  249  599:aload_1         
    //  250  600:getfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //  251  603:astore_2        
    //  252  604:aload_2         
    //  253  605:aload_1         
    //  254  606:getfield        #144 <Field int BackStackRecord$Op.enterAnim>
    //  255  609:putfield        #393 <Field int Fragment.mNextAnim>
    //  256  612:aload_0         
    //  257  613:getfield        #63  <Field FragmentManagerImpl mManager>
    //  258  616:aload_2         
    //  259  617:aload_0         
    //  260  618:getfield        #274 <Field int mTransition>
    //  261  621:aload_0         
    //  262  622:getfield        #286 <Field int mTransitionStyle>
    //  263  625:invokevirtual   #414 <Method void FragmentManagerImpl.attachFragment(Fragment, int, int)>
    //  264  628:goto            172
    //  265  631:aload_0         
    //  266  632:getfield        #63  <Field FragmentManagerImpl mManager>
    //  267  635:aload_0         
    //  268  636:getfield        #63  <Field FragmentManagerImpl mManager>
    //  269  639:getfield        #420 <Field int FragmentManagerImpl.mCurState>
    //  270  642:aload_0         
    //  271  643:getfield        #274 <Field int mTransition>
    //  272  646:aload_0         
    //  273  647:getfield        #286 <Field int mTransitionStyle>
    //  274  650:iconst_1        
    //  275  651:invokevirtual   #424 <Method void FragmentManagerImpl.moveToState(int, int, int, boolean)>
    //  276  654:aload_0         
    //  277  655:getfield        #173 <Field boolean mAddToBackStack>
    //  278  658:ifeq            669
    //  279  661:aload_0         
    //  280  662:getfield        #63  <Field FragmentManagerImpl mManager>
    //  281  665:aload_0         
    //  282  666:invokevirtual   #452 <Method void FragmentManagerImpl.addBackStackState(BackStackRecord)>
    //  283  669:return          
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #309 <Field int mBreadCrumbShortTitleRes>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #311 <Field CharSequence mBreadCrumbShortTitleText>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #309 <Field int mBreadCrumbShortTitleRes>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #311 <Field CharSequence mBreadCrumbShortTitleText>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public FragmentTransaction setBreadCrumbTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #298 <Field int mBreadCrumbTitleRes>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #300 <Field CharSequence mBreadCrumbTitleText>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #298 <Field int mBreadCrumbTitleRes>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #300 <Field CharSequence mBreadCrumbTitleText>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public FragmentTransaction setCustomAnimations(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iconst_0        
    //    4    4:iconst_0        
    //    5    5:invokevirtual   #461 <Method FragmentTransaction setCustomAnimations(int, int, int, int)>
    //    6    8:areturn         
    }

    public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #141 <Field int mEnterAnim>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #146 <Field int mExitAnim>
    //    6   10:aload_0         
    //    7   11:iload_3         
    //    8   12:putfield        #151 <Field int mPopEnterAnim>
    //    9   15:aload_0         
    //   10   16:iload           4
    //   11   18:putfield        #156 <Field int mPopExitAnim>
    //   12   21:aload_0         
    //   13   22:areturn         
    }

    public FragmentTransaction setTransition(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #274 <Field int mTransition>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public FragmentTransaction setTransitionStyle(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #286 <Field int mTransitionStyle>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public FragmentTransaction show(Fragment fragment)
    {
    //    0    0:new             #117 <Class BackStackRecord$Op>
    //    1    3:dup             
    //    2    4:invokespecial   #118 <Method void BackStackRecord$Op()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:iconst_5        
    //    6   10:putfield        #121 <Field int BackStackRecord$Op.cmd>
    //    7   13:aload_2         
    //    8   14:aload_1         
    //    9   15:putfield        #125 <Field Fragment BackStackRecord$Op.fragment>
    //   10   18:aload_0         
    //   11   19:aload_2         
    //   12   20:invokevirtual   #129 <Method void addOp(BackStackRecord$Op)>
    //   13   23:aload_0         
    //   14   24:areturn         
    }

    public String toString()
    {
    //    0    0:new             #83  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:sipush          128
    //    3    7:invokespecial   #466 <Method void StringBuilder(int)>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ldc2            #468 <String "BackStackEntry{">
    //    7   15:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //    8   18:pop             
    //    9   19:aload_1         
    //   10   20:aload_0         
    //   11   21:invokestatic    #474 <Method int System.identityHashCode(Object)>
    //   12   24:invokestatic    #282 <Method String Integer.toHexString(int)>
    //   13   27:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   14   30:pop             
    //   15   31:aload_0         
    //   16   32:getfield        #61  <Field int mIndex>
    //   17   35:iflt            55
    //   18   38:aload_1         
    //   19   39:ldc2            #476 <String " #">
    //   20   42:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   21   45:pop             
    //   22   46:aload_1         
    //   23   47:aload_0         
    //   24   48:getfield        #61  <Field int mIndex>
    //   25   51:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
    //   26   54:pop             
    //   27   55:aload_0         
    //   28   56:getfield        #175 <Field String mName>
    //   29   59:ifnull          79
    //   30   62:aload_1         
    //   31   63:ldc2            #327 <String " ">
    //   32   66:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   33   69:pop             
    //   34   70:aload_1         
    //   35   71:aload_0         
    //   36   72:getfield        #175 <Field String mName>
    //   37   75:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   38   78:pop             
    //   39   79:aload_1         
    //   40   80:ldc2            #478 <String "}">
    //   41   83:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   42   86:pop             
    //   43   87:aload_1         
    //   44   88:invokevirtual   #101 <Method String StringBuilder.toString()>
    //   45   91:areturn         
    }

    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    Op mTail;
    int mTransition;
    int mTransitionStyle;
}
