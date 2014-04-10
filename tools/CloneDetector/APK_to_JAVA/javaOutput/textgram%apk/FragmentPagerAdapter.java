// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, Fragment, FragmentTransaction

public abstract class FragmentPagerAdapter extends PagerAdapter
{

    public FragmentPagerAdapter(FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void PagerAdapter()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #24  <Field FragmentTransaction mCurTransaction>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #26  <Field Fragment mCurrentPrimaryItem>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:putfield        #28  <Field FragmentManager mFragmentManager>
    //   11   19:return          
    }

    private static String makeFragmentName(int i, long l)
    {
    //    0    0:new             #32  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #33  <Method void StringBuilder()>
    //    3    7:ldc1            #35  <String "android:switcher:">
    //    4    9:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
    //    5   12:iload_0         
    //    6   13:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
    //    7   16:ldc1            #44  <String ":">
    //    8   18:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
    //    9   21:lload_1         
    //   10   22:invokevirtual   #47  <Method StringBuilder StringBuilder.append(long)>
    //   11   25:invokevirtual   #51  <Method String StringBuilder.toString()>
    //   12   28:areturn         
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #28  <Field FragmentManager mFragmentManager>
    //    6   12:invokevirtual   #59  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
    //    8   18:aload_0         
    //    9   19:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //   10   22:aload_3         
    //   11   23:checkcast       #61  <Class Fragment>
    //   12   26:invokevirtual   #67  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
    //   13   29:pop             
    //   14   30:return          
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //    2    4:ifnull          28
    //    3    7:aload_0         
    //    4    8:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //    5   11:invokevirtual   #73  <Method int FragmentTransaction.commitAllowingStateLoss()>
    //    6   14:pop             
    //    7   15:aload_0         
    //    8   16:aconst_null     
    //    9   17:putfield        #24  <Field FragmentTransaction mCurTransaction>
    //   10   20:aload_0         
    //   11   21:getfield        #28  <Field FragmentManager mFragmentManager>
    //   12   24:invokevirtual   #77  <Method boolean FragmentManager.executePendingTransactions()>
    //   13   27:pop             
    //   14   28:return          
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i)
    {
    //    0    0:iload_1         
    //    1    1:i2l             
    //    2    2:lreturn         
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #28  <Field FragmentManager mFragmentManager>
    //    6   12:invokevirtual   #59  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //    7   15:putfield        #24  <Field FragmentTransaction mCurTransaction>
    //    8   18:aload_0         
    //    9   19:iload_2         
    //   10   20:invokevirtual   #85  <Method long getItemId(int)>
    //   11   23:lstore_3        
    //   12   24:aload_1         
    //   13   25:invokevirtual   #90  <Method int ViewGroup.getId()>
    //   14   28:lload_3         
    //   15   29:invokestatic    #92  <Method String makeFragmentName(int, long)>
    //   16   32:astore          5
    //   17   34:aload_0         
    //   18   35:getfield        #28  <Field FragmentManager mFragmentManager>
    //   19   38:aload           5
    //   20   40:invokevirtual   #96  <Method Fragment FragmentManager.findFragmentByTag(String)>
    //   21   43:astore          6
    //   22   45:aload           6
    //   23   47:ifnull          84
    //   24   50:aload_0         
    //   25   51:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //   26   54:aload           6
    //   27   56:invokevirtual   #99  <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
    //   28   59:pop             
    //   29   60:aload           6
    //   30   62:aload_0         
    //   31   63:getfield        #26  <Field Fragment mCurrentPrimaryItem>
    //   32   66:if_acmpeq       81
    //   33   69:aload           6
    //   34   71:iconst_0        
    //   35   72:invokevirtual   #103 <Method void Fragment.setMenuVisibility(boolean)>
    //   36   75:aload           6
    //   37   77:iconst_0        
    //   38   78:invokevirtual   #106 <Method void Fragment.setUserVisibleHint(boolean)>
    //   39   81:aload           6
    //   40   83:areturn         
    //   41   84:aload_0         
    //   42   85:iload_2         
    //   43   86:invokevirtual   #108 <Method Fragment getItem(int)>
    //   44   89:astore          6
    //   45   91:aload_0         
    //   46   92:getfield        #24  <Field FragmentTransaction mCurTransaction>
    //   47   95:aload_1         
    //   48   96:invokevirtual   #90  <Method int ViewGroup.getId()>
    //   49   99:aload           6
    //   50  101:aload_1         
    //   51  102:invokevirtual   #90  <Method int ViewGroup.getId()>
    //   52  105:lload_3         
    //   53  106:invokestatic    #92  <Method String makeFragmentName(int, long)>
    //   54  109:invokevirtual   #112 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
    //   55  112:pop             
    //   56  113:goto            60
    }

    public boolean isViewFromObject(View view, Object obj)
    {
    //    0    0:aload_2         
    //    1    1:checkcast       #61  <Class Fragment>
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
    //    0    0:return          
    }

    public Parcelable saveState()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_3         
    //    1    1:checkcast       #61  <Class Fragment>
    //    2    4:astore          4
    //    3    6:aload           4
    //    4    8:aload_0         
    //    5    9:getfield        #26  <Field Fragment mCurrentPrimaryItem>
    //    6   12:if_acmpeq       61
    //    7   15:aload_0         
    //    8   16:getfield        #26  <Field Fragment mCurrentPrimaryItem>
    //    9   19:ifnull          38
    //   10   22:aload_0         
    //   11   23:getfield        #26  <Field Fragment mCurrentPrimaryItem>
    //   12   26:iconst_0        
    //   13   27:invokevirtual   #103 <Method void Fragment.setMenuVisibility(boolean)>
    //   14   30:aload_0         
    //   15   31:getfield        #26  <Field Fragment mCurrentPrimaryItem>
    //   16   34:iconst_0        
    //   17   35:invokevirtual   #106 <Method void Fragment.setUserVisibleHint(boolean)>
    //   18   38:aload           4
    //   19   40:ifnull          55
    //   20   43:aload           4
    //   21   45:iconst_1        
    //   22   46:invokevirtual   #103 <Method void Fragment.setMenuVisibility(boolean)>
    //   23   49:aload           4
    //   24   51:iconst_1        
    //   25   52:invokevirtual   #106 <Method void Fragment.setUserVisibleHint(boolean)>
    //   26   55:aload_0         
    //   27   56:aload           4
    //   28   58:putfield        #26  <Field Fragment mCurrentPrimaryItem>
    //   29   61:return          
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    //    0    0:return          
    }

    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
}
