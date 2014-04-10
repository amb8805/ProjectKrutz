// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.*;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, FragmentTransaction, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{
    static class DummyTabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        public DummyTabFactory(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #15  <Field Context mContext>
        //    5    9:return          
        }

        public View createTabContent(String s)
        {
        //    0    0:new             #19  <Class View>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #15  <Field Context mContext>
        //    4    8:invokespecial   #21  <Method void View(Context)>
        //    5   11:astore_2        
        //    6   12:aload_2         
        //    7   13:iconst_0        
        //    8   14:invokevirtual   #25  <Method void View.setMinimumWidth(int)>
        //    9   17:aload_2         
        //   10   18:iconst_0        
        //   11   19:invokevirtual   #28  <Method void View.setMinimumHeight(int)>
        //   12   22:aload_2         
        //   13   23:areturn         
        }

        private final Context mContext;
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class FragmentTabHost$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void FragmentTabHost$SavedState$1()>
        //    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #27  <Method String Parcel.readString()>
        //    6   10:putfield        #29  <Field String curTab>
        //    7   13:return          
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #31  <Method void FragmentTabHost$SavedState(Parcel)>
        //    3    5:return          
        }

        SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #34  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public String toString()
        {
        //    0    0:new             #37  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #38  <Method void StringBuilder()>
        //    3    7:ldc1            #40  <String "FragmentTabHost.SavedState{">
        //    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_0         
        //    6   13:invokestatic    #50  <Method int System.identityHashCode(Object)>
        //    7   16:invokestatic    #56  <Method String Integer.toHexString(int)>
        //    8   19:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:ldc1            #58  <String " curTab=">
        //   10   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:aload_0         
        //   12   28:getfield        #29  <Field String curTab>
        //   13   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //   14   34:ldc1            #60  <String "}">
        //   15   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //   16   39:invokevirtual   #62  <Method String StringBuilder.toString()>
        //   17   42:areturn         
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #66  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #29  <Field String curTab>
        //    7   11:invokevirtual   #70  <Method void Parcel.writeString(String)>
        //    8   14:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        String curTab;
    }

    static final class TabInfo
    {

        TabInfo(String s, Class class1, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #18  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #20  <Field String tag>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #22  <Field Class clss>
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:putfield        #24  <Field Bundle args>
        //   11   19:return          
        }

        static Fragment access$100(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field Fragment fragment>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #28  <Field Fragment fragment>
        //    5    4:areturn         
        }

        static Fragment access$102(TabInfo tabinfo, Fragment fragment1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #28  <Field Fragment fragment>
        //    3    5:aload_1         
        //    4    6:areturn         
// Previous instruction length mismatch
        //    5    0:aload_0         
        //    6    1:aload_1         
        //    7    2:putfield        #28  <Field Fragment fragment>
        //    8    5:aload_1         
        //    9    6:areturn         
        }

        static String access$200(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field String tag>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #20  <Field String tag>
        //    5    4:areturn         
        }

        static Class access$300(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field Class clss>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #22  <Field Class clss>
        //    5    4:areturn         
        }

        static Bundle access$400(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field Bundle args>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #24  <Field Bundle args>
        //    5    4:areturn         
        }

        private final Bundle args;
        private final Class clss;
        private Fragment fragment;
        private final String tag;

        static Fragment access$100(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field Fragment fragment>
        //    2    4:areturn         
        }

        static Fragment access$102(TabInfo tabinfo, Fragment fragment1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #28  <Field Fragment fragment>
        //    3    5:aload_1         
        //    4    6:areturn         
        }

        static String access$200(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field String tag>
        //    2    4:areturn         
        }

        static Class access$300(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field Class clss>
        //    2    4:areturn         
        }

        static Bundle access$400(TabInfo tabinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field Bundle args>
        //    2    4:areturn         
        }
    }


    public FragmentTabHost(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #28  <Method void TabHost(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #30  <Class ArrayList>
    //    6   10:dup             
    //    7   11:invokespecial   #33  <Method void ArrayList()>
    //    8   14:putfield        #35  <Field ArrayList mTabs>
    //    9   17:aload_0         
    //   10   18:aload_1         
    //   11   19:aconst_null     
    //   12   20:invokespecial   #38  <Method void initFragmentTabHost(Context, AttributeSet)>
    //   13   23:return          
    }

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #28  <Method void TabHost(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #30  <Class ArrayList>
    //    6   10:dup             
    //    7   11:invokespecial   #33  <Method void ArrayList()>
    //    8   14:putfield        #35  <Field ArrayList mTabs>
    //    9   17:aload_0         
    //   10   18:aload_1         
    //   11   19:aload_2         
    //   12   20:invokespecial   #38  <Method void initFragmentTabHost(Context, AttributeSet)>
    //   13   23:return          
    }

    private FragmentTransaction doTabChanged(String s, FragmentTransaction fragmenttransaction)
    {
    //    0    0:aconst_null     
    //    1    1:astore_3        
    //    2    2:iconst_0        
    //    3    3:istore          4
    //    4    5:iload           4
    //    5    7:aload_0         
    //    6    8:getfield        #35  <Field ArrayList mTabs>
    //    7   11:invokevirtual   #44  <Method int ArrayList.size()>
    //    8   14:icmpge          52
    //    9   17:aload_0         
    //   10   18:getfield        #35  <Field ArrayList mTabs>
    //   11   21:iload           4
    //   12   23:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   13   26:checkcast       #50  <Class FragmentTabHost$TabInfo>
    //   14   29:astore          9
    //   15   31:aload           9
    //   16   33:invokestatic    #54  <Method String FragmentTabHost$TabInfo.access$200(FragmentTabHost$TabInfo)>
    //   17   36:aload_1         
    //   18   37:invokevirtual   #60  <Method boolean String.equals(Object)>
    //   19   40:ifeq            46
    //   20   43:aload           9
    //   21   45:astore_3        
    //   22   46:iinc            4  1
    //   23   49:goto            5
    //   24   52:aload_3         
    //   25   53:ifnonnull       83
    //   26   56:new             #62  <Class IllegalStateException>
    //   27   59:dup             
    //   28   60:new             #64  <Class StringBuilder>
    //   29   63:dup             
    //   30   64:invokespecial   #65  <Method void StringBuilder()>
    //   31   67:ldc1            #67  <String "No tab known for tag ">
    //   32   69:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   33   72:aload_1         
    //   34   73:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   35   76:invokevirtual   #75  <Method String StringBuilder.toString()>
    //   36   79:invokespecial   #78  <Method void IllegalStateException(String)>
    //   37   82:athrow          
    //   38   83:aload_0         
    //   39   84:getfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   40   87:aload_3         
    //   41   88:if_acmpeq       188
    //   42   91:aload_2         
    //   43   92:ifnonnull       103
    //   44   95:aload_0         
    //   45   96:getfield        #82  <Field FragmentManager mFragmentManager>
    //   46   99:invokevirtual   #88  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   47  102:astore_2        
    //   48  103:aload_0         
    //   49  104:getfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   50  107:ifnull          132
    //   51  110:aload_0         
    //   52  111:getfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   53  114:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   54  117:ifnull          132
    //   55  120:aload_2         
    //   56  121:aload_0         
    //   57  122:getfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   58  125:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   59  128:invokevirtual   #98  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
    //   60  131:pop             
    //   61  132:aload_3         
    //   62  133:ifnull          183
    //   63  136:aload_3         
    //   64  137:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   65  140:ifnonnull       190
    //   66  143:aload_3         
    //   67  144:aload_0         
    //   68  145:getfield        #100 <Field Context mContext>
    //   69  148:aload_3         
    //   70  149:invokestatic    #104 <Method Class FragmentTabHost$TabInfo.access$300(FragmentTabHost$TabInfo)>
    //   71  152:invokevirtual   #109 <Method String Class.getName()>
    //   72  155:aload_3         
    //   73  156:invokestatic    #113 <Method Bundle FragmentTabHost$TabInfo.access$400(FragmentTabHost$TabInfo)>
    //   74  159:invokestatic    #119 <Method Fragment Fragment.instantiate(Context, String, Bundle)>
    //   75  162:invokestatic    #123 <Method Fragment FragmentTabHost$TabInfo.access$102(FragmentTabHost$TabInfo, Fragment)>
    //   76  165:pop             
    //   77  166:aload_2         
    //   78  167:aload_0         
    //   79  168:getfield        #125 <Field int mContainerId>
    //   80  171:aload_3         
    //   81  172:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   82  175:aload_3         
    //   83  176:invokestatic    #54  <Method String FragmentTabHost$TabInfo.access$200(FragmentTabHost$TabInfo)>
    //   84  179:invokevirtual   #129 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
    //   85  182:pop             
    //   86  183:aload_0         
    //   87  184:aload_3         
    //   88  185:putfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   89  188:aload_2         
    //   90  189:areturn         
    //   91  190:aload_2         
    //   92  191:aload_3         
    //   93  192:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   94  195:invokevirtual   #132 <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
    //   95  198:pop             
    //   96  199:goto            183
    }

    private void ensureContent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field FrameLayout mRealTabContent>
    //    2    4:ifnonnull       59
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:aload_0         
    //    6   10:getfield        #125 <Field int mContainerId>
    //    7   13:invokevirtual   #139 <Method View findViewById(int)>
    //    8   16:checkcast       #141 <Class FrameLayout>
    //    9   19:putfield        #135 <Field FrameLayout mRealTabContent>
    //   10   22:aload_0         
    //   11   23:getfield        #135 <Field FrameLayout mRealTabContent>
    //   12   26:ifnonnull       59
    //   13   29:new             #62  <Class IllegalStateException>
    //   14   32:dup             
    //   15   33:new             #64  <Class StringBuilder>
    //   16   36:dup             
    //   17   37:invokespecial   #65  <Method void StringBuilder()>
    //   18   40:ldc1            #143 <String "No tab content FrameLayout found for id ">
    //   19   42:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   20   45:aload_0         
    //   21   46:getfield        #125 <Field int mContainerId>
    //   22   49:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
    //   23   52:invokevirtual   #75  <Method String StringBuilder.toString()>
    //   24   55:invokespecial   #78  <Method void IllegalStateException(String)>
    //   25   58:athrow          
    //   26   59:return          
    }

    private void ensureHierarchy(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #148 <Int 0x1020013>
    //    2    3:invokevirtual   #139 <Method View findViewById(int)>
    //    3    6:ifnonnull       149
    //    4    9:new             #150 <Class LinearLayout>
    //    5   12:dup             
    //    6   13:aload_1         
    //    7   14:invokespecial   #152 <Method void LinearLayout(Context)>
    //    8   17:astore_2        
    //    9   18:aload_2         
    //   10   19:iconst_1        
    //   11   20:invokevirtual   #156 <Method void LinearLayout.setOrientation(int)>
    //   12   23:aload_0         
    //   13   24:aload_2         
    //   14   25:new             #158 <Class android.widget.FrameLayout$LayoutParams>
    //   15   28:dup             
    //   16   29:iconst_m1       
    //   17   30:iconst_m1       
    //   18   31:invokespecial   #161 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   19   34:invokevirtual   #165 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   20   37:new             #167 <Class TabWidget>
    //   21   40:dup             
    //   22   41:aload_1         
    //   23   42:invokespecial   #168 <Method void TabWidget(Context)>
    //   24   45:astore_3        
    //   25   46:aload_3         
    //   26   47:ldc1            #148 <Int 0x1020013>
    //   27   49:invokevirtual   #171 <Method void TabWidget.setId(int)>
    //   28   52:aload_3         
    //   29   53:iconst_0        
    //   30   54:invokevirtual   #172 <Method void TabWidget.setOrientation(int)>
    //   31   57:aload_2         
    //   32   58:aload_3         
    //   33   59:new             #174 <Class android.widget.LinearLayout$LayoutParams>
    //   34   62:dup             
    //   35   63:iconst_m1       
    //   36   64:bipush          -2
    //   37   66:fconst_0        
    //   38   67:invokespecial   #177 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   39   70:invokevirtual   #178 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   40   73:new             #141 <Class FrameLayout>
    //   41   76:dup             
    //   42   77:aload_1         
    //   43   78:invokespecial   #179 <Method void FrameLayout(Context)>
    //   44   81:astore          4
    //   45   83:aload           4
    //   46   85:ldc1            #180 <Int 0x1020011>
    //   47   87:invokevirtual   #181 <Method void FrameLayout.setId(int)>
    //   48   90:aload_2         
    //   49   91:aload           4
    //   50   93:new             #174 <Class android.widget.LinearLayout$LayoutParams>
    //   51   96:dup             
    //   52   97:iconst_0        
    //   53   98:iconst_0        
    //   54   99:fconst_0        
    //   55  100:invokespecial   #177 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   56  103:invokevirtual   #178 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   57  106:new             #141 <Class FrameLayout>
    //   58  109:dup             
    //   59  110:aload_1         
    //   60  111:invokespecial   #179 <Method void FrameLayout(Context)>
    //   61  114:astore          5
    //   62  116:aload_0         
    //   63  117:aload           5
    //   64  119:putfield        #135 <Field FrameLayout mRealTabContent>
    //   65  122:aload_0         
    //   66  123:getfield        #135 <Field FrameLayout mRealTabContent>
    //   67  126:aload_0         
    //   68  127:getfield        #125 <Field int mContainerId>
    //   69  130:invokevirtual   #181 <Method void FrameLayout.setId(int)>
    //   70  133:aload_2         
    //   71  134:aload           5
    //   72  136:new             #174 <Class android.widget.LinearLayout$LayoutParams>
    //   73  139:dup             
    //   74  140:iconst_m1       
    //   75  141:iconst_0        
    //   76  142:fconst_1        
    //   77  143:invokespecial   #177 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   78  146:invokevirtual   #178 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   79  149:return          
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:iconst_1        
    //    3    3:newarray        int[]
    //    4    5:dup             
    //    5    6:iconst_0        
    //    6    7:ldc1            #182 <Int 0x10100f3>
    //    7    9:iastore         
    //    8   10:iconst_0        
    //    9   11:iconst_0        
    //   10   12:invokevirtual   #188 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   11   15:astore_3        
    //   12   16:aload_0         
    //   13   17:aload_3         
    //   14   18:iconst_0        
    //   15   19:iconst_0        
    //   16   20:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
    //   17   23:putfield        #125 <Field int mContainerId>
    //   18   26:aload_3         
    //   19   27:invokevirtual   #197 <Method void TypedArray.recycle()>
    //   20   30:aload_0         
    //   21   31:aload_0         
    //   22   32:invokespecial   #201 <Method void TabHost.setOnTabChangedListener(android.widget.TabHost$OnTabChangeListener)>
    //   23   35:return          
    }

    public void addTab(android.widget.TabHost.TabSpec tabspec, Class class1, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:new             #205 <Class FragmentTabHost$DummyTabFactory>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:getfield        #100 <Field Context mContext>
    //    5    9:invokespecial   #206 <Method void FragmentTabHost$DummyTabFactory(Context)>
    //    6   12:invokevirtual   #212 <Method android.widget.TabHost$TabSpec android.widget.TabHost$TabSpec.setContent(android.widget.TabHost$TabContentFactory)>
    //    7   15:pop             
    //    8   16:aload_1         
    //    9   17:invokevirtual   #215 <Method String android.widget.TabHost$TabSpec.getTag()>
    //   10   20:astore          5
    //   11   22:new             #50  <Class FragmentTabHost$TabInfo>
    //   12   25:dup             
    //   13   26:aload           5
    //   14   28:aload_2         
    //   15   29:aload_3         
    //   16   30:invokespecial   #218 <Method void FragmentTabHost$TabInfo(String, Class, Bundle)>
    //   17   33:astore          6
    //   18   35:aload_0         
    //   19   36:getfield        #220 <Field boolean mAttached>
    //   20   39:ifeq            102
    //   21   42:aload           6
    //   22   44:aload_0         
    //   23   45:getfield        #82  <Field FragmentManager mFragmentManager>
    //   24   48:aload           5
    //   25   50:invokevirtual   #224 <Method Fragment FragmentManager.findFragmentByTag(String)>
    //   26   53:invokestatic    #123 <Method Fragment FragmentTabHost$TabInfo.access$102(FragmentTabHost$TabInfo, Fragment)>
    //   27   56:pop             
    //   28   57:aload           6
    //   29   59:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   30   62:ifnull          102
    //   31   65:aload           6
    //   32   67:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   33   70:invokevirtual   #228 <Method boolean Fragment.isDetached()>
    //   34   73:ifne            102
    //   35   76:aload_0         
    //   36   77:getfield        #82  <Field FragmentManager mFragmentManager>
    //   37   80:invokevirtual   #88  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   38   83:astore          9
    //   39   85:aload           9
    //   40   87:aload           6
    //   41   89:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   42   92:invokevirtual   #98  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
    //   43   95:pop             
    //   44   96:aload           9
    //   45   98:invokevirtual   #231 <Method int FragmentTransaction.commit()>
    //   46  101:pop             
    //   47  102:aload_0         
    //   48  103:getfield        #35  <Field ArrayList mTabs>
    //   49  106:aload           6
    //   50  108:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
    //   51  111:pop             
    //   52  112:aload_0         
    //   53  113:aload_1         
    //   54  114:invokevirtual   #236 <Method void addTab(android.widget.TabHost$TabSpec)>
    //   55  117:return          
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #239 <Method void TabHost.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #242 <Method String getCurrentTabTag()>
    //    4    8:astore_1        
    //    5    9:aconst_null     
    //    6   10:astore_2        
    //    7   11:iconst_0        
    //    8   12:istore_3        
    //    9   13:iload_3         
    //   10   14:aload_0         
    //   11   15:getfield        #35  <Field ArrayList mTabs>
    //   12   18:invokevirtual   #44  <Method int ArrayList.size()>
    //   13   21:icmpge          123
    //   14   24:aload_0         
    //   15   25:getfield        #35  <Field ArrayList mTabs>
    //   16   28:iload_3         
    //   17   29:invokevirtual   #48  <Method Object ArrayList.get(int)>
    //   18   32:checkcast       #50  <Class FragmentTabHost$TabInfo>
    //   19   35:astore          7
    //   20   37:aload           7
    //   21   39:aload_0         
    //   22   40:getfield        #82  <Field FragmentManager mFragmentManager>
    //   23   43:aload           7
    //   24   45:invokestatic    #54  <Method String FragmentTabHost$TabInfo.access$200(FragmentTabHost$TabInfo)>
    //   25   48:invokevirtual   #224 <Method Fragment FragmentManager.findFragmentByTag(String)>
    //   26   51:invokestatic    #123 <Method Fragment FragmentTabHost$TabInfo.access$102(FragmentTabHost$TabInfo, Fragment)>
    //   27   54:pop             
    //   28   55:aload           7
    //   29   57:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   30   60:ifnull          92
    //   31   63:aload           7
    //   32   65:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   33   68:invokevirtual   #228 <Method boolean Fragment.isDetached()>
    //   34   71:ifne            92
    //   35   74:aload           7
    //   36   76:invokestatic    #54  <Method String FragmentTabHost$TabInfo.access$200(FragmentTabHost$TabInfo)>
    //   37   79:aload_1         
    //   38   80:invokevirtual   #60  <Method boolean String.equals(Object)>
    //   39   83:ifeq            98
    //   40   86:aload_0         
    //   41   87:aload           7
    //   42   89:putfield        #80  <Field FragmentTabHost$TabInfo mLastTab>
    //   43   92:iinc            3  1
    //   44   95:goto            13
    //   45   98:aload_2         
    //   46   99:ifnonnull       110
    //   47  102:aload_0         
    //   48  103:getfield        #82  <Field FragmentManager mFragmentManager>
    //   49  106:invokevirtual   #88  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   50  109:astore_2        
    //   51  110:aload_2         
    //   52  111:aload           7
    //   53  113:invokestatic    #92  <Method Fragment FragmentTabHost$TabInfo.access$100(FragmentTabHost$TabInfo)>
    //   54  116:invokevirtual   #98  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
    //   55  119:pop             
    //   56  120:goto            92
    //   57  123:aload_0         
    //   58  124:iconst_1        
    //   59  125:putfield        #220 <Field boolean mAttached>
    //   60  128:aload_0         
    //   61  129:aload_1         
    //   62  130:aload_2         
    //   63  131:invokespecial   #244 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
    //   64  134:astore          4
    //   65  136:aload           4
    //   66  138:ifnull          155
    //   67  141:aload           4
    //   68  143:invokevirtual   #231 <Method int FragmentTransaction.commit()>
    //   69  146:pop             
    //   70  147:aload_0         
    //   71  148:getfield        #82  <Field FragmentManager mFragmentManager>
    //   72  151:invokevirtual   #247 <Method boolean FragmentManager.executePendingTransactions()>
    //   73  154:pop             
    //   74  155:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #250 <Method void TabHost.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #220 <Field boolean mAttached>
    //    5    9:return          
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #254 <Class FragmentTabHost$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #258 <Method Parcelable FragmentTabHost$SavedState.getSuperState()>
    //    6   10:invokespecial   #260 <Method void TabHost.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #264 <Field String FragmentTabHost$SavedState.curTab>
    //   10   18:invokevirtual   #267 <Method void setCurrentTabByTag(String)>
    //   11   21:return          
    }

    protected Parcelable onSaveInstanceState()
    {
    //    0    0:new             #254 <Class FragmentTabHost$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #270 <Method Parcelable TabHost.onSaveInstanceState()>
    //    4    8:invokespecial   #272 <Method void FragmentTabHost$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:invokevirtual   #242 <Method String getCurrentTabTag()>
    //    9   17:putfield        #264 <Field String FragmentTabHost$SavedState.curTab>
    //   10   20:aload_1         
    //   11   21:areturn         
    }

    public void onTabChanged(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field boolean mAttached>
    //    2    4:ifeq            23
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:aconst_null     
    //    6   10:invokespecial   #244 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
    //    7   13:astore_2        
    //    8   14:aload_2         
    //    9   15:ifnull          23
    //   10   18:aload_2         
    //   11   19:invokevirtual   #231 <Method int FragmentTransaction.commit()>
    //   12   22:pop             
    //   13   23:aload_0         
    //   14   24:getfield        #275 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
    //   15   27:ifnull          40
    //   16   30:aload_0         
    //   17   31:getfield        #275 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
    //   18   34:aload_1         
    //   19   35:invokeinterface #277 <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
    //   20   40:return          
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #275 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
    //    3    5:return          
    }

    public void setup()
    {
    //    0    0:new             #62  <Class IllegalStateException>
    //    1    3:dup             
    //    2    4:ldc2            #281 <String "Must call setup() that takes a Context and FragmentManager">
    //    3    7:invokespecial   #78  <Method void IllegalStateException(String)>
    //    4   10:athrow          
    }

    public void setup(Context context, FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #284 <Method void ensureHierarchy(Context)>
    //    3    5:aload_0         
    //    4    6:invokespecial   #286 <Method void TabHost.setup()>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #100 <Field Context mContext>
    //    8   14:aload_0         
    //    9   15:aload_2         
    //   10   16:putfield        #82  <Field FragmentManager mFragmentManager>
    //   11   19:aload_0         
    //   12   20:invokespecial   #288 <Method void ensureContent()>
    //   13   23:return          
    }

    public void setup(Context context, FragmentManager fragmentmanager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #284 <Method void ensureHierarchy(Context)>
    //    3    5:aload_0         
    //    4    6:invokespecial   #286 <Method void TabHost.setup()>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #100 <Field Context mContext>
    //    8   14:aload_0         
    //    9   15:aload_2         
    //   10   16:putfield        #82  <Field FragmentManager mFragmentManager>
    //   11   19:aload_0         
    //   12   20:iload_3         
    //   13   21:putfield        #125 <Field int mContainerId>
    //   14   24:aload_0         
    //   15   25:invokespecial   #288 <Method void ensureContent()>
    //   16   28:aload_0         
    //   17   29:getfield        #135 <Field FrameLayout mRealTabContent>
    //   18   32:iload_3         
    //   19   33:invokevirtual   #181 <Method void FrameLayout.setId(int)>
    //   20   36:aload_0         
    //   21   37:invokevirtual   #292 <Method int getId()>
    //   22   40:iconst_m1       
    //   23   41:icmpne          51
    //   24   44:aload_0         
    //   25   45:ldc2            #293 <Int 0x1020012>
    //   26   48:invokevirtual   #294 <Method void setId(int)>
    //   27   51:return          
    }

    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private TabInfo mLastTab;
    private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
    private FrameLayout mRealTabContent;
    private final ArrayList mTabs;

    // Unreferenced inner class android/support/v4/app/FragmentTabHost$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v4/app/FragmentTabHost$SavedState$1

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
        //    0    0:new             #9   <Class FragmentTabHost$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void FragmentTabHost$SavedState(Parcel, FragmentTabHost$1)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method FragmentTabHost$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method FragmentTabHost$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
