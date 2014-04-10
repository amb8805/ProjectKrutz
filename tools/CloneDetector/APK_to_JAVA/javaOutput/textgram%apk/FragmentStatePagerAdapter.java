// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentManager, FragmentTransaction

public abstract class FragmentStatePagerAdapter extends PagerAdapter
{

    public FragmentStatePagerAdapter(FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #27  <Method void PagerAdapter()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #29  <Field FragmentTransaction mCurTransaction>
    //    5    9:aload_0         
    //    6   10:new             #31  <Class ArrayList>
    //    7   13:dup             
    //    8   14:invokespecial   #32  <Method void ArrayList()>
    //    9   17:putfield        #34  <Field ArrayList mSavedState>
    //   10   20:aload_0         
    //   11   21:new             #31  <Class ArrayList>
    //   12   24:dup             
    //   13   25:invokespecial   #32  <Method void ArrayList()>
    //   14   28:putfield        #36  <Field ArrayList mFragments>
    //   15   31:aload_0         
    //   16   32:aconst_null     
    //   17   33:putfield        #38  <Field Fragment mCurrentPrimaryItem>
    //   18   36:aload_0         
    //   19   37:aload_1         
    //   20   38:putfield        #40  <Field FragmentManager mFragmentManager>
    //   21   41:return          
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_3         
    //    1    1:checkcast       #44  <Class Fragment>
    //    2    4:astore          4
    //    3    6:aload_0         
    //    4    7:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //    5   10:ifnonnull       24
    //    6   13:aload_0         
    //    7   14:aload_0         
    //    8   15:getfield        #40  <Field FragmentManager mFragmentManager>
    //    9   18:invokevirtual   #50  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   10   21:putfield        #29  <Field FragmentTransaction mCurTransaction>
    //   11   24:aload_0         
    //   12   25:getfield        #34  <Field ArrayList mSavedState>
    //   13   28:invokevirtual   #54  <Method int ArrayList.size()>
    //   14   31:iload_2         
    //   15   32:icmpgt          47
    //   16   35:aload_0         
    //   17   36:getfield        #34  <Field ArrayList mSavedState>
    //   18   39:aconst_null     
    //   19   40:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
    //   20   43:pop             
    //   21   44:goto            24
    //   22   47:aload_0         
    //   23   48:getfield        #34  <Field ArrayList mSavedState>
    //   24   51:iload_2         
    //   25   52:aload_0         
    //   26   53:getfield        #40  <Field FragmentManager mFragmentManager>
    //   27   56:aload           4
    //   28   58:invokevirtual   #62  <Method Fragment$SavedState FragmentManager.saveFragmentInstanceState(Fragment)>
    //   29   61:invokevirtual   #66  <Method Object ArrayList.set(int, Object)>
    //   30   64:pop             
    //   31   65:aload_0         
    //   32   66:getfield        #36  <Field ArrayList mFragments>
    //   33   69:iload_2         
    //   34   70:aconst_null     
    //   35   71:invokevirtual   #66  <Method Object ArrayList.set(int, Object)>
    //   36   74:pop             
    //   37   75:aload_0         
    //   38   76:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //   39   79:aload           4
    //   40   81:invokevirtual   #72  <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
    //   41   84:pop             
    //   42   85:return          
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //    2    4:ifnull          28
    //    3    7:aload_0         
    //    4    8:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //    5   11:invokevirtual   #77  <Method int FragmentTransaction.commitAllowingStateLoss()>
    //    6   14:pop             
    //    7   15:aload_0         
    //    8   16:aconst_null     
    //    9   17:putfield        #29  <Field FragmentTransaction mCurTransaction>
    //   10   20:aload_0         
    //   11   21:getfield        #40  <Field FragmentManager mFragmentManager>
    //   12   24:invokevirtual   #81  <Method boolean FragmentManager.executePendingTransactions()>
    //   13   27:pop             
    //   14   28:return          
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field ArrayList mFragments>
    //    2    4:invokevirtual   #54  <Method int ArrayList.size()>
    //    3    7:iload_2         
    //    4    8:icmple          32
    //    5   11:aload_0         
    //    6   12:getfield        #36  <Field ArrayList mFragments>
    //    7   15:iload_2         
    //    8   16:invokevirtual   #89  <Method Object ArrayList.get(int)>
    //    9   19:checkcast       #44  <Class Fragment>
    //   10   22:astore          8
    //   11   24:aload           8
    //   12   26:ifnull          32
    //   13   29:aload           8
    //   14   31:areturn         
    //   15   32:aload_0         
    //   16   33:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //   17   36:ifnonnull       50
    //   18   39:aload_0         
    //   19   40:aload_0         
    //   20   41:getfield        #40  <Field FragmentManager mFragmentManager>
    //   21   44:invokevirtual   #50  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   22   47:putfield        #29  <Field FragmentTransaction mCurTransaction>
    //   23   50:aload_0         
    //   24   51:iload_2         
    //   25   52:invokevirtual   #91  <Method Fragment getItem(int)>
    //   26   55:astore_3        
    //   27   56:aload_0         
    //   28   57:getfield        #34  <Field ArrayList mSavedState>
    //   29   60:invokevirtual   #54  <Method int ArrayList.size()>
    //   30   63:iload_2         
    //   31   64:icmple          91
    //   32   67:aload_0         
    //   33   68:getfield        #34  <Field ArrayList mSavedState>
    //   34   71:iload_2         
    //   35   72:invokevirtual   #89  <Method Object ArrayList.get(int)>
    //   36   75:checkcast       #93  <Class Fragment$SavedState>
    //   37   78:astore          7
    //   38   80:aload           7
    //   39   82:ifnull          91
    //   40   85:aload_3         
    //   41   86:aload           7
    //   42   88:invokevirtual   #97  <Method void Fragment.setInitialSavedState(Fragment$SavedState)>
    //   43   91:aload_0         
    //   44   92:getfield        #36  <Field ArrayList mFragments>
    //   45   95:invokevirtual   #54  <Method int ArrayList.size()>
    //   46   98:iload_2         
    //   47   99:icmpgt          114
    //   48  102:aload_0         
    //   49  103:getfield        #36  <Field ArrayList mFragments>
    //   50  106:aconst_null     
    //   51  107:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
    //   52  110:pop             
    //   53  111:goto            91
    //   54  114:aload_3         
    //   55  115:iconst_0        
    //   56  116:invokevirtual   #101 <Method void Fragment.setMenuVisibility(boolean)>
    //   57  119:aload_3         
    //   58  120:iconst_0        
    //   59  121:invokevirtual   #104 <Method void Fragment.setUserVisibleHint(boolean)>
    //   60  124:aload_0         
    //   61  125:getfield        #36  <Field ArrayList mFragments>
    //   62  128:iload_2         
    //   63  129:aload_3         
    //   64  130:invokevirtual   #66  <Method Object ArrayList.set(int, Object)>
    //   65  133:pop             
    //   66  134:aload_0         
    //   67  135:getfield        #29  <Field FragmentTransaction mCurTransaction>
    //   68  138:aload_1         
    //   69  139:invokevirtual   #109 <Method int ViewGroup.getId()>
    //   70  142:aload_3         
    //   71  143:invokevirtual   #112 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
    //   72  146:pop             
    //   73  147:aload_3         
    //   74  148:areturn         
    }

    public boolean isViewFromObject(View view, Object obj)
    {
    //    0    0:aload_2         
    //    1    1:checkcast       #44  <Class Fragment>
    //    2    4:invokevirtual   #118 <Method View Fragment.getView()>
    //    3    7:aload_1         
    //    4    8:if_acmpne       13
    //    5   11:iconst_1        
    //    6   12:ireturn         
    //    7   13:iconst_0        
    //    8   14:ireturn         
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          219
    //    2    4:aload_1         
    //    3    5:checkcast       #122 <Class Bundle>
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #126 <Method void Bundle.setClassLoader(ClassLoader)>
    //    8   14:aload_3         
    //    9   15:ldc1            #128 <String "states">
    //   10   17:invokevirtual   #132 <Method Parcelable[] Bundle.getParcelableArray(String)>
    //   11   20:astore          4
    //   12   22:aload_0         
    //   13   23:getfield        #34  <Field ArrayList mSavedState>
    //   14   26:invokevirtual   #135 <Method void ArrayList.clear()>
    //   15   29:aload_0         
    //   16   30:getfield        #36  <Field ArrayList mFragments>
    //   17   33:invokevirtual   #135 <Method void ArrayList.clear()>
    //   18   36:aload           4
    //   19   38:ifnull          74
    //   20   41:iconst_0        
    //   21   42:istore          12
    //   22   44:iload           12
    //   23   46:aload           4
    //   24   48:arraylength     
    //   25   49:icmpge          74
    //   26   52:aload_0         
    //   27   53:getfield        #34  <Field ArrayList mSavedState>
    //   28   56:aload           4
    //   29   58:iload           12
    //   30   60:aaload          
    //   31   61:checkcast       #93  <Class Fragment$SavedState>
    //   32   64:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
    //   33   67:pop             
    //   34   68:iinc            12  1
    //   35   71:goto            44
    //   36   74:aload_3         
    //   37   75:invokevirtual   #139 <Method java.util.Set Bundle.keySet()>
    //   38   78:invokeinterface #145 <Method Iterator Iterable.iterator()>
    //   39   83:astore          5
    //   40   85:aload           5
    //   41   87:invokeinterface #150 <Method boolean Iterator.hasNext()>
    //   42   92:ifeq            219
    //   43   95:aload           5
    //   44   97:invokeinterface #154 <Method Object Iterator.next()>
    //   45  102:checkcast       #156 <Class String>
    //   46  105:astore          6
    //   47  107:aload           6
    //   48  109:ldc1            #158 <String "f">
    //   49  111:invokevirtual   #162 <Method boolean String.startsWith(String)>
    //   50  114:ifeq            85
    //   51  117:aload           6
    //   52  119:iconst_1        
    //   53  120:invokevirtual   #166 <Method String String.substring(int)>
    //   54  123:invokestatic    #172 <Method int Integer.parseInt(String)>
    //   55  126:istore          7
    //   56  128:aload_0         
    //   57  129:getfield        #40  <Field FragmentManager mFragmentManager>
    //   58  132:aload_3         
    //   59  133:aload           6
    //   60  135:invokevirtual   #176 <Method Fragment FragmentManager.getFragment(Bundle, String)>
    //   61  138:astore          8
    //   62  140:aload           8
    //   63  142:ifnull          190
    //   64  145:aload_0         
    //   65  146:getfield        #36  <Field ArrayList mFragments>
    //   66  149:invokevirtual   #54  <Method int ArrayList.size()>
    //   67  152:iload           7
    //   68  154:icmpgt          169
    //   69  157:aload_0         
    //   70  158:getfield        #36  <Field ArrayList mFragments>
    //   71  161:aconst_null     
    //   72  162:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
    //   73  165:pop             
    //   74  166:goto            145
    //   75  169:aload           8
    //   76  171:iconst_0        
    //   77  172:invokevirtual   #101 <Method void Fragment.setMenuVisibility(boolean)>
    //   78  175:aload_0         
    //   79  176:getfield        #36  <Field ArrayList mFragments>
    //   80  179:iload           7
    //   81  181:aload           8
    //   82  183:invokevirtual   #66  <Method Object ArrayList.set(int, Object)>
    //   83  186:pop             
    //   84  187:goto            85
    //   85  190:ldc1            #11  <String "FragmentStatePagerAdapter">
    //   86  192:new             #178 <Class StringBuilder>
    //   87  195:dup             
    //   88  196:invokespecial   #179 <Method void StringBuilder()>
    //   89  199:ldc1            #181 <String "Bad fragment at key ">
    //   90  201:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
    //   91  204:aload           6
    //   92  206:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
    //   93  209:invokevirtual   #189 <Method String StringBuilder.toString()>
    //   94  212:invokestatic    #195 <Method int Log.w(String, String)>
    //   95  215:pop             
    //   96  216:goto            85
    //   97  219:return          
    }

    public Parcelable saveState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field ArrayList mSavedState>
    //    2    4:invokevirtual   #54  <Method int ArrayList.size()>
    //    3    7:istore_1        
    //    4    8:aconst_null     
    //    5    9:astore_2        
    //    6   10:iload_1         
    //    7   11:ifle            49
    //    8   14:new             #122 <Class Bundle>
    //    9   17:dup             
    //   10   18:invokespecial   #198 <Method void Bundle()>
    //   11   21:astore_2        
    //   12   22:aload_0         
    //   13   23:getfield        #34  <Field ArrayList mSavedState>
    //   14   26:invokevirtual   #54  <Method int ArrayList.size()>
    //   15   29:anewarray       Fragment.SavedState[]
    //   16   32:astore_3        
    //   17   33:aload_0         
    //   18   34:getfield        #34  <Field ArrayList mSavedState>
    //   19   37:aload_3         
    //   20   38:invokevirtual   #202 <Method Object[] ArrayList.toArray(Object[])>
    //   21   41:pop             
    //   22   42:aload_2         
    //   23   43:ldc1            #128 <String "states">
    //   24   45:aload_3         
    //   25   46:invokevirtual   #206 <Method void Bundle.putParcelableArray(String, Parcelable[])>
    //   26   49:iconst_0        
    //   27   50:istore          5
    //   28   52:iload           5
    //   29   54:aload_0         
    //   30   55:getfield        #36  <Field ArrayList mFragments>
    //   31   58:invokevirtual   #54  <Method int ArrayList.size()>
    //   32   61:icmpge          135
    //   33   64:aload_0         
    //   34   65:getfield        #36  <Field ArrayList mFragments>
    //   35   68:iload           5
    //   36   70:invokevirtual   #89  <Method Object ArrayList.get(int)>
    //   37   73:checkcast       #44  <Class Fragment>
    //   38   76:astore          6
    //   39   78:aload           6
    //   40   80:ifnull          129
    //   41   83:aload_2         
    //   42   84:ifnonnull       95
    //   43   87:new             #122 <Class Bundle>
    //   44   90:dup             
    //   45   91:invokespecial   #198 <Method void Bundle()>
    //   46   94:astore_2        
    //   47   95:new             #178 <Class StringBuilder>
    //   48   98:dup             
    //   49   99:invokespecial   #179 <Method void StringBuilder()>
    //   50  102:ldc1            #158 <String "f">
    //   51  104:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
    //   52  107:iload           5
    //   53  109:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
    //   54  112:invokevirtual   #189 <Method String StringBuilder.toString()>
    //   55  115:astore          7
    //   56  117:aload_0         
    //   57  118:getfield        #40  <Field FragmentManager mFragmentManager>
    //   58  121:aload_2         
    //   59  122:aload           7
    //   60  124:aload           6
    //   61  126:invokevirtual   #213 <Method void FragmentManager.putFragment(Bundle, String, Fragment)>
    //   62  129:iinc            5  1
    //   63  132:goto            52
    //   64  135:aload_2         
    //   65  136:areturn         
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_3         
    //    1    1:checkcast       #44  <Class Fragment>
    //    2    4:astore          4
    //    3    6:aload           4
    //    4    8:aload_0         
    //    5    9:getfield        #38  <Field Fragment mCurrentPrimaryItem>
    //    6   12:if_acmpeq       61
    //    7   15:aload_0         
    //    8   16:getfield        #38  <Field Fragment mCurrentPrimaryItem>
    //    9   19:ifnull          38
    //   10   22:aload_0         
    //   11   23:getfield        #38  <Field Fragment mCurrentPrimaryItem>
    //   12   26:iconst_0        
    //   13   27:invokevirtual   #101 <Method void Fragment.setMenuVisibility(boolean)>
    //   14   30:aload_0         
    //   15   31:getfield        #38  <Field Fragment mCurrentPrimaryItem>
    //   16   34:iconst_0        
    //   17   35:invokevirtual   #104 <Method void Fragment.setUserVisibleHint(boolean)>
    //   18   38:aload           4
    //   19   40:ifnull          55
    //   20   43:aload           4
    //   21   45:iconst_1        
    //   22   46:invokevirtual   #101 <Method void Fragment.setMenuVisibility(boolean)>
    //   23   49:aload           4
    //   24   51:iconst_1        
    //   25   52:invokevirtual   #104 <Method void Fragment.setUserVisibleHint(boolean)>
    //   26   55:aload_0         
    //   27   56:aload           4
    //   28   58:putfield        #38  <Field Fragment mCurrentPrimaryItem>
    //   29   61:return          
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    //    0    0:return          
    }

    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapter";
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private ArrayList mSavedState;
}
