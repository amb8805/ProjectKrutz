// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.widget.*;

// Referenced classes of package android.support.v4.app:
//            Fragment

public class ListFragment extends Fragment
{

    public ListFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:new             #37  <Class Handler>
    //    4    8:dup             
    //    5    9:invokespecial   #38  <Method void Handler()>
    //    6   12:putfield        #40  <Field Handler mHandler>
    //    7   15:aload_0         
    //    8   16:new             #42  <Class ListFragment$1>
    //    9   19:dup             
    //   10   20:aload_0         
    //   11   21:invokespecial   #45  <Method void ListFragment$1(ListFragment)>
    //   12   24:putfield        #47  <Field Runnable mRequestFocus>
    //   13   27:aload_0         
    //   14   28:new             #49  <Class ListFragment$2>
    //   15   31:dup             
    //   16   32:aload_0         
    //   17   33:invokespecial   #50  <Method void ListFragment$2(ListFragment)>
    //   18   36:putfield        #52  <Field android.widget.AdapterView$OnItemClickListener mOnClickListener>
    //   19   39:return          
    }

    private void ensureList()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #55  <Field ListView mList>
    //    2    4:ifnull          8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:invokevirtual   #59  <Method View getView()>
    //    6   12:astore_1        
    //    7   13:aload_1         
    //    8   14:ifnonnull       27
    //    9   17:new             #61  <Class IllegalStateException>
    //   10   20:dup             
    //   11   21:ldc1            #63  <String "Content view not yet created">
    //   12   23:invokespecial   #66  <Method void IllegalStateException(String)>
    //   13   26:athrow          
    //   14   27:aload_1         
    //   15   28:instanceof      #68  <Class ListView>
    //   16   31:ifeq            95
    //   17   34:aload_0         
    //   18   35:aload_1         
    //   19   36:checkcast       #68  <Class ListView>
    //   20   39:putfield        #55  <Field ListView mList>
    //   21   42:aload_0         
    //   22   43:iconst_1        
    //   23   44:putfield        #70  <Field boolean mListShown>
    //   24   47:aload_0         
    //   25   48:getfield        #55  <Field ListView mList>
    //   26   51:aload_0         
    //   27   52:getfield        #52  <Field android.widget.AdapterView$OnItemClickListener mOnClickListener>
    //   28   55:invokevirtual   #74  <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //   29   58:aload_0         
    //   30   59:getfield        #76  <Field ListAdapter mAdapter>
    //   31   62:ifnull          256
    //   32   65:aload_0         
    //   33   66:getfield        #76  <Field ListAdapter mAdapter>
    //   34   69:astore          4
    //   35   71:aload_0         
    //   36   72:aconst_null     
    //   37   73:putfield        #76  <Field ListAdapter mAdapter>
    //   38   76:aload_0         
    //   39   77:aload           4
    //   40   79:invokevirtual   #80  <Method void setListAdapter(ListAdapter)>
    //   41   82:aload_0         
    //   42   83:getfield        #40  <Field Handler mHandler>
    //   43   86:aload_0         
    //   44   87:getfield        #47  <Field Runnable mRequestFocus>
    //   45   90:invokevirtual   #84  <Method boolean Handler.post(Runnable)>
    //   46   93:pop             
    //   47   94:return          
    //   48   95:aload_0         
    //   49   96:aload_1         
    //   50   97:ldc1            #7   <Int 0xff0001>
    //   51   99:invokevirtual   #90  <Method View View.findViewById(int)>
    //   52  102:checkcast       #92  <Class TextView>
    //   53  105:putfield        #94  <Field TextView mStandardEmptyView>
    //   54  108:aload_0         
    //   55  109:getfield        #94  <Field TextView mStandardEmptyView>
    //   56  112:ifnonnull       173
    //   57  115:aload_0         
    //   58  116:aload_1         
    //   59  117:ldc1            #95  <Int 0x1020004>
    //   60  119:invokevirtual   #90  <Method View View.findViewById(int)>
    //   61  122:putfield        #97  <Field View mEmptyView>
    //   62  125:aload_0         
    //   63  126:aload_1         
    //   64  127:ldc1            #11  <Int 0xff0002>
    //   65  129:invokevirtual   #90  <Method View View.findViewById(int)>
    //   66  132:putfield        #99  <Field View mProgressContainer>
    //   67  135:aload_0         
    //   68  136:aload_1         
    //   69  137:ldc1            #9   <Int 0xff0003>
    //   70  139:invokevirtual   #90  <Method View View.findViewById(int)>
    //   71  142:putfield        #101 <Field View mListContainer>
    //   72  145:aload_1         
    //   73  146:ldc1            #102 <Int 0x102000a>
    //   74  148:invokevirtual   #90  <Method View View.findViewById(int)>
    //   75  151:astore_2        
    //   76  152:aload_2         
    //   77  153:instanceof      #68  <Class ListView>
    //   78  156:ifne            195
    //   79  159:aload_2         
    //   80  160:ifnonnull       185
    //   81  163:new             #104 <Class RuntimeException>
    //   82  166:dup             
    //   83  167:ldc1            #106 <String "Your content must have a ListView whose id attribute is 'android.R.id.list'">
    //   84  169:invokespecial   #107 <Method void RuntimeException(String)>
    //   85  172:athrow          
    //   86  173:aload_0         
    //   87  174:getfield        #94  <Field TextView mStandardEmptyView>
    //   88  177:bipush          8
    //   89  179:invokevirtual   #111 <Method void TextView.setVisibility(int)>
    //   90  182:goto            125
    //   91  185:new             #104 <Class RuntimeException>
    //   92  188:dup             
    //   93  189:ldc1            #113 <String "Content has view with id attribute 'android.R.id.list' that is not a ListView class">
    //   94  191:invokespecial   #107 <Method void RuntimeException(String)>
    //   95  194:athrow          
    //   96  195:aload_0         
    //   97  196:aload_2         
    //   98  197:checkcast       #68  <Class ListView>
    //   99  200:putfield        #55  <Field ListView mList>
    //  100  203:aload_0         
    //  101  204:getfield        #97  <Field View mEmptyView>
    //  102  207:ifnull          224
    //  103  210:aload_0         
    //  104  211:getfield        #55  <Field ListView mList>
    //  105  214:aload_0         
    //  106  215:getfield        #97  <Field View mEmptyView>
    //  107  218:invokevirtual   #117 <Method void ListView.setEmptyView(View)>
    //  108  221:goto            42
    //  109  224:aload_0         
    //  110  225:getfield        #119 <Field CharSequence mEmptyText>
    //  111  228:ifnull          42
    //  112  231:aload_0         
    //  113  232:getfield        #94  <Field TextView mStandardEmptyView>
    //  114  235:aload_0         
    //  115  236:getfield        #119 <Field CharSequence mEmptyText>
    //  116  239:invokevirtual   #123 <Method void TextView.setText(CharSequence)>
    //  117  242:aload_0         
    //  118  243:getfield        #55  <Field ListView mList>
    //  119  246:aload_0         
    //  120  247:getfield        #94  <Field TextView mStandardEmptyView>
    //  121  250:invokevirtual   #117 <Method void ListView.setEmptyView(View)>
    //  122  253:goto            42
    //  123  256:aload_0         
    //  124  257:getfield        #99  <Field View mProgressContainer>
    //  125  260:ifnull          82
    //  126  263:aload_0         
    //  127  264:iconst_0        
    //  128  265:iconst_0        
    //  129  266:invokespecial   #127 <Method void setListShown(boolean, boolean)>
    //  130  269:goto            82
    }

    private void setListShown(boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #99  <Field View mProgressContainer>
    //    4    8:ifnonnull       21
    //    5   11:new             #61  <Class IllegalStateException>
    //    6   14:dup             
    //    7   15:ldc1            #131 <String "Can't be used with a custom content view">
    //    8   17:invokespecial   #66  <Method void IllegalStateException(String)>
    //    9   20:athrow          
    //   10   21:aload_0         
    //   11   22:getfield        #70  <Field boolean mListShown>
    //   12   25:iload_1         
    //   13   26:icmpne          30
    //   14   29:return          
    //   15   30:aload_0         
    //   16   31:iload_1         
    //   17   32:putfield        #70  <Field boolean mListShown>
    //   18   35:iload_1         
    //   19   36:ifeq            110
    //   20   39:iload_2         
    //   21   40:ifeq            93
    //   22   43:aload_0         
    //   23   44:getfield        #99  <Field View mProgressContainer>
    //   24   47:aload_0         
    //   25   48:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   26   51:ldc1            #136 <Int 0x10a0001>
    //   27   53:invokestatic    #142 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   28   56:invokevirtual   #146 <Method void View.startAnimation(android.view.animation.Animation)>
    //   29   59:aload_0         
    //   30   60:getfield        #101 <Field View mListContainer>
    //   31   63:aload_0         
    //   32   64:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   33   67:ldc1            #147 <Int 0x10a0000>
    //   34   69:invokestatic    #142 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   35   72:invokevirtual   #146 <Method void View.startAnimation(android.view.animation.Animation)>
    //   36   75:aload_0         
    //   37   76:getfield        #99  <Field View mProgressContainer>
    //   38   79:bipush          8
    //   39   81:invokevirtual   #148 <Method void View.setVisibility(int)>
    //   40   84:aload_0         
    //   41   85:getfield        #101 <Field View mListContainer>
    //   42   88:iconst_0        
    //   43   89:invokevirtual   #148 <Method void View.setVisibility(int)>
    //   44   92:return          
    //   45   93:aload_0         
    //   46   94:getfield        #99  <Field View mProgressContainer>
    //   47   97:invokevirtual   #151 <Method void View.clearAnimation()>
    //   48  100:aload_0         
    //   49  101:getfield        #101 <Field View mListContainer>
    //   50  104:invokevirtual   #151 <Method void View.clearAnimation()>
    //   51  107:goto            75
    //   52  110:iload_2         
    //   53  111:ifeq            164
    //   54  114:aload_0         
    //   55  115:getfield        #99  <Field View mProgressContainer>
    //   56  118:aload_0         
    //   57  119:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   58  122:ldc1            #147 <Int 0x10a0000>
    //   59  124:invokestatic    #142 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   60  127:invokevirtual   #146 <Method void View.startAnimation(android.view.animation.Animation)>
    //   61  130:aload_0         
    //   62  131:getfield        #101 <Field View mListContainer>
    //   63  134:aload_0         
    //   64  135:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   65  138:ldc1            #136 <Int 0x10a0001>
    //   66  140:invokestatic    #142 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   67  143:invokevirtual   #146 <Method void View.startAnimation(android.view.animation.Animation)>
    //   68  146:aload_0         
    //   69  147:getfield        #99  <Field View mProgressContainer>
    //   70  150:iconst_0        
    //   71  151:invokevirtual   #148 <Method void View.setVisibility(int)>
    //   72  154:aload_0         
    //   73  155:getfield        #101 <Field View mListContainer>
    //   74  158:bipush          8
    //   75  160:invokevirtual   #148 <Method void View.setVisibility(int)>
    //   76  163:return          
    //   77  164:aload_0         
    //   78  165:getfield        #99  <Field View mProgressContainer>
    //   79  168:invokevirtual   #151 <Method void View.clearAnimation()>
    //   80  171:aload_0         
    //   81  172:getfield        #101 <Field View mListContainer>
    //   82  175:invokevirtual   #151 <Method void View.clearAnimation()>
    //   83  178:goto            146
    }

    public ListAdapter getListAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ListAdapter mAdapter>
    //    2    4:areturn         
    }

    public ListView getListView()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #55  <Field ListView mList>
    //    4    8:areturn         
    }

    public long getSelectedItemId()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #55  <Field ListView mList>
    //    4    8:invokevirtual   #159 <Method long ListView.getSelectedItemId()>
    //    5   11:lreturn         
    }

    public int getSelectedItemPosition()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #55  <Field ListView mList>
    //    4    8:invokevirtual   #163 <Method int ListView.getSelectedItemPosition()>
    //    5   11:ireturn         
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //    2    4:astore          4
    //    3    6:new             #167 <Class FrameLayout>
    //    4    9:dup             
    //    5   10:aload           4
    //    6   12:invokespecial   #170 <Method void FrameLayout(android.content.Context)>
    //    7   15:astore          5
    //    8   17:new             #172 <Class LinearLayout>
    //    9   20:dup             
    //   10   21:aload           4
    //   11   23:invokespecial   #173 <Method void LinearLayout(android.content.Context)>
    //   12   26:astore          6
    //   13   28:aload           6
    //   14   30:ldc1            #11  <Int 0xff0002>
    //   15   32:invokevirtual   #176 <Method void LinearLayout.setId(int)>
    //   16   35:aload           6
    //   17   37:iconst_1        
    //   18   38:invokevirtual   #179 <Method void LinearLayout.setOrientation(int)>
    //   19   41:aload           6
    //   20   43:bipush          8
    //   21   45:invokevirtual   #180 <Method void LinearLayout.setVisibility(int)>
    //   22   48:aload           6
    //   23   50:bipush          17
    //   24   52:invokevirtual   #183 <Method void LinearLayout.setGravity(int)>
    //   25   55:aload           6
    //   26   57:new             #185 <Class ProgressBar>
    //   27   60:dup             
    //   28   61:aload           4
    //   29   63:aconst_null     
    //   30   64:ldc1            #186 <Int 0x101007a>
    //   31   66:invokespecial   #189 <Method void ProgressBar(android.content.Context, android.util.AttributeSet, int)>
    //   32   69:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //   33   72:dup             
    //   34   73:bipush          -2
    //   35   75:bipush          -2
    //   36   77:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   37   80:invokevirtual   #198 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   38   83:aload           5
    //   39   85:aload           6
    //   40   87:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //   41   90:dup             
    //   42   91:iconst_m1       
    //   43   92:iconst_m1       
    //   44   93:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   45   96:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   46   99:new             #167 <Class FrameLayout>
    //   47  102:dup             
    //   48  103:aload           4
    //   49  105:invokespecial   #170 <Method void FrameLayout(android.content.Context)>
    //   50  108:astore          7
    //   51  110:aload           7
    //   52  112:ldc1            #9   <Int 0xff0003>
    //   53  114:invokevirtual   #200 <Method void FrameLayout.setId(int)>
    //   54  117:new             #92  <Class TextView>
    //   55  120:dup             
    //   56  121:aload_0         
    //   57  122:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   58  125:invokespecial   #201 <Method void TextView(android.content.Context)>
    //   59  128:astore          8
    //   60  130:aload           8
    //   61  132:ldc1            #7   <Int 0xff0001>
    //   62  134:invokevirtual   #202 <Method void TextView.setId(int)>
    //   63  137:aload           8
    //   64  139:bipush          17
    //   65  141:invokevirtual   #203 <Method void TextView.setGravity(int)>
    //   66  144:aload           7
    //   67  146:aload           8
    //   68  148:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //   69  151:dup             
    //   70  152:iconst_m1       
    //   71  153:iconst_m1       
    //   72  154:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   73  157:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   74  160:new             #68  <Class ListView>
    //   75  163:dup             
    //   76  164:aload_0         
    //   77  165:invokevirtual   #135 <Method FragmentActivity getActivity()>
    //   78  168:invokespecial   #204 <Method void ListView(android.content.Context)>
    //   79  171:astore          9
    //   80  173:aload           9
    //   81  175:ldc1            #102 <Int 0x102000a>
    //   82  177:invokevirtual   #205 <Method void ListView.setId(int)>
    //   83  180:aload           9
    //   84  182:iconst_0        
    //   85  183:invokevirtual   #209 <Method void ListView.setDrawSelectorOnTop(boolean)>
    //   86  186:aload           7
    //   87  188:aload           9
    //   88  190:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //   89  193:dup             
    //   90  194:iconst_m1       
    //   91  195:iconst_m1       
    //   92  196:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   93  199:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   94  202:aload           5
    //   95  204:aload           7
    //   96  206:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //   97  209:dup             
    //   98  210:iconst_m1       
    //   99  211:iconst_m1       
    //  100  212:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //  101  215:invokevirtual   #199 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //  102  218:aload           5
    //  103  220:new             #191 <Class android.widget.FrameLayout$LayoutParams>
    //  104  223:dup             
    //  105  224:iconst_m1       
    //  106  225:iconst_m1       
    //  107  226:invokespecial   #194 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //  108  229:invokevirtual   #213 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //  109  232:aload           5
    //  110  234:areturn         
    }

    public void onDestroyView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field Handler mHandler>
    //    2    4:aload_0         
    //    3    5:getfield        #47  <Field Runnable mRequestFocus>
    //    4    8:invokevirtual   #218 <Method void Handler.removeCallbacks(Runnable)>
    //    5   11:aload_0         
    //    6   12:aconst_null     
    //    7   13:putfield        #55  <Field ListView mList>
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #70  <Field boolean mListShown>
    //   11   21:aload_0         
    //   12   22:aconst_null     
    //   13   23:putfield        #101 <Field View mListContainer>
    //   14   26:aload_0         
    //   15   27:aconst_null     
    //   16   28:putfield        #99  <Field View mProgressContainer>
    //   17   31:aload_0         
    //   18   32:aconst_null     
    //   19   33:putfield        #97  <Field View mEmptyView>
    //   20   36:aload_0         
    //   21   37:aconst_null     
    //   22   38:putfield        #94  <Field TextView mStandardEmptyView>
    //   23   41:aload_0         
    //   24   42:invokespecial   #220 <Method void Fragment.onDestroyView()>
    //   25   45:return          
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
    //    0    0:return          
    }

    public void onViewCreated(View view, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #226 <Method void Fragment.onViewCreated(View, Bundle)>
    //    4    6:aload_0         
    //    5    7:invokespecial   #129 <Method void ensureList()>
    //    6   10:return          
    }

    public void setEmptyText(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #94  <Field TextView mStandardEmptyView>
    //    4    8:ifnonnull       21
    //    5   11:new             #61  <Class IllegalStateException>
    //    6   14:dup             
    //    7   15:ldc1            #131 <String "Can't be used with a custom content view">
    //    8   17:invokespecial   #66  <Method void IllegalStateException(String)>
    //    9   20:athrow          
    //   10   21:aload_0         
    //   11   22:getfield        #94  <Field TextView mStandardEmptyView>
    //   12   25:aload_1         
    //   13   26:invokevirtual   #123 <Method void TextView.setText(CharSequence)>
    //   14   29:aload_0         
    //   15   30:getfield        #119 <Field CharSequence mEmptyText>
    //   16   33:ifnonnull       47
    //   17   36:aload_0         
    //   18   37:getfield        #55  <Field ListView mList>
    //   19   40:aload_0         
    //   20   41:getfield        #94  <Field TextView mStandardEmptyView>
    //   21   44:invokevirtual   #117 <Method void ListView.setEmptyView(View)>
    //   22   47:aload_0         
    //   23   48:aload_1         
    //   24   49:putfield        #119 <Field CharSequence mEmptyText>
    //   25   52:return          
    }

    public void setListAdapter(ListAdapter listadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ListAdapter mAdapter>
    //    2    4:ifnull          66
    //    3    7:iconst_1        
    //    4    8:istore_2        
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #76  <Field ListAdapter mAdapter>
    //    8   14:aload_0         
    //    9   15:getfield        #55  <Field ListView mList>
    //   10   18:ifnull          65
    //   11   21:aload_0         
    //   12   22:getfield        #55  <Field ListView mList>
    //   13   25:aload_1         
    //   14   26:invokevirtual   #230 <Method void ListView.setAdapter(ListAdapter)>
    //   15   29:aload_0         
    //   16   30:getfield        #70  <Field boolean mListShown>
    //   17   33:ifne            65
    //   18   36:iload_2         
    //   19   37:ifne            65
    //   20   40:aload_0         
    //   21   41:invokevirtual   #59  <Method View getView()>
    //   22   44:invokevirtual   #234 <Method android.os.IBinder View.getWindowToken()>
    //   23   47:astore_3        
    //   24   48:iconst_0        
    //   25   49:istore          4
    //   26   51:aload_3         
    //   27   52:ifnull          58
    //   28   55:iconst_1        
    //   29   56:istore          4
    //   30   58:aload_0         
    //   31   59:iconst_1        
    //   32   60:iload           4
    //   33   62:invokespecial   #127 <Method void setListShown(boolean, boolean)>
    //   34   65:return          
    //   35   66:iconst_0        
    //   36   67:istore_2        
    //   37   68:goto            9
    }

    public void setListShown(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_1        
    //    3    3:invokespecial   #127 <Method void setListShown(boolean, boolean)>
    //    4    6:return          
    }

    public void setListShownNoAnimation(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #127 <Method void setListShown(boolean, boolean)>
    //    4    6:return          
    }

    public void setSelection(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #129 <Method void ensureList()>
    //    2    4:aload_0         
    //    3    5:getfield        #55  <Field ListView mList>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #238 <Method void ListView.setSelection(int)>
    //    6   12:return          
    }

    static final int INTERNAL_EMPTY_ID = 0xff0001;
    static final int INTERNAL_LIST_CONTAINER_ID = 0xff0003;
    static final int INTERNAL_PROGRESS_CONTAINER_ID = 0xff0002;
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    private final Handler mHandler;
    ListView mList;
    View mListContainer;
    boolean mListShown;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener;
    View mProgressContainer;
    private final Runnable mRequestFocus;
    TextView mStandardEmptyView;

    // Unreferenced inner class android/support/v4/app/ListFragment$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ListFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ListFragment this$0>
        //    2    4:getfield        #22  <Field ListView ListFragment.mList>
        //    3    7:aload_0         
        //    4    8:getfield        #14  <Field ListFragment this$0>
        //    5   11:getfield        #22  <Field ListView ListFragment.mList>
        //    6   14:invokevirtual   #28  <Method void ListView.focusableViewAvailable(View)>
        //    7   17:return          
        }

        final ListFragment this$0;
    }


    // Unreferenced inner class android/support/v4/app/ListFragment$2

/* anonymous class */
    class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ListFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ListFragment this$0>
        //    2    4:aload_1         
        //    3    5:checkcast       #21  <Class ListView>
        //    4    8:aload_2         
        //    5    9:iload_3         
        //    6   10:lload           4
        //    7   12:invokevirtual   #25  <Method void ListFragment.onListItemClick(ListView, View, int, long)>
        //    8   15:return          
        }

        final ListFragment this$0;
    }

}
