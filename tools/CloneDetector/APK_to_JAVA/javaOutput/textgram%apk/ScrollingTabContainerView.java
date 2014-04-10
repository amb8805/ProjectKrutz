// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.internal.view.ActionBarPolicy;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerICS, AdapterViewICS, CompatTextView

public class ScrollingTabContainerView extends HorizontalScrollView
    implements AdapterViewICS.OnItemClickListener
{
    private class TabAdapter extends BaseAdapter
    {

        private TabAdapter()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ScrollingTabContainerView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void BaseAdapter()>
        //    5    9:return          
        }

        TabAdapter(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView)>
        //    3    5:return          
        }

        public int getCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ScrollingTabContainerView this$0>
        //    2    4:invokestatic    #24  <Method LinearLayout ScrollingTabContainerView.access$200(ScrollingTabContainerView)>
        //    3    7:invokevirtual   #29  <Method int LinearLayout.getChildCount()>
        //    4   10:ireturn         
        }

        public Object getItem(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ScrollingTabContainerView this$0>
        //    2    4:invokestatic    #24  <Method LinearLayout ScrollingTabContainerView.access$200(ScrollingTabContainerView)>
        //    3    7:iload_1         
        //    4    8:invokevirtual   #35  <Method View LinearLayout.getChildAt(int)>
        //    5   11:checkcast       #37  <Class ScrollingTabContainerView$TabView>
        //    6   14:invokevirtual   #41  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
        //    7   17:areturn         
        }

        public long getItemId(int i)
        {
        //    0    0:iload_1         
        //    1    1:i2l             
        //    2    2:lreturn         
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
        //    0    0:aload_2         
        //    1    1:ifnonnull       21
        //    2    4:aload_0         
        //    3    5:getfield        #10  <Field ScrollingTabContainerView this$0>
        //    4    8:aload_0         
        //    5    9:iload_1         
        //    6   10:invokevirtual   #47  <Method Object getItem(int)>
        //    7   13:checkcast       #49  <Class android.support.v7.app.ActionBar$Tab>
        //    8   16:iconst_1        
        //    9   17:invokestatic    #53  <Method ScrollingTabContainerView$TabView ScrollingTabContainerView.access$300(ScrollingTabContainerView, android.support.v7.app.ActionBar$Tab, boolean)>
        //   10   20:areturn         
        //   11   21:aload_2         
        //   12   22:checkcast       #37  <Class ScrollingTabContainerView$TabView>
        //   13   25:aload_0         
        //   14   26:iload_1         
        //   15   27:invokevirtual   #47  <Method Object getItem(int)>
        //   16   30:checkcast       #49  <Class android.support.v7.app.ActionBar$Tab>
        //   17   33:invokevirtual   #57  <Method void ScrollingTabContainerView$TabView.bindTab(android.support.v7.app.ActionBar$Tab)>
        //   18   36:aload_2         
        //   19   37:areturn         
        }

        final ScrollingTabContainerView this$0;
    }

    private class TabClickListener
        implements android.view.View.OnClickListener
    {

        private TabClickListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ScrollingTabContainerView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        TabClickListener(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView)>
        //    3    5:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #22  <Class ScrollingTabContainerView$TabView>
        //    2    4:invokevirtual   #26  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
        //    3    7:invokevirtual   #31  <Method void android.support.v7.app.ActionBar$Tab.select()>
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ScrollingTabContainerView this$0>
        //    6   14:invokestatic    #37  <Method LinearLayout ScrollingTabContainerView.access$200(ScrollingTabContainerView)>
        //    7   17:invokevirtual   #43  <Method int LinearLayout.getChildCount()>
        //    8   20:istore_2        
        //    9   21:iconst_0        
        //   10   22:istore_3        
        //   11   23:iload_3         
        //   12   24:iload_2         
        //   13   25:icmpge          69
        //   14   28:aload_0         
        //   15   29:getfield        #12  <Field ScrollingTabContainerView this$0>
        //   16   32:invokestatic    #37  <Method LinearLayout ScrollingTabContainerView.access$200(ScrollingTabContainerView)>
        //   17   35:iload_3         
        //   18   36:invokevirtual   #47  <Method View LinearLayout.getChildAt(int)>
        //   19   39:astore          4
        //   20   41:aload           4
        //   21   43:aload_1         
        //   22   44:if_acmpne       63
        //   23   47:iconst_1        
        //   24   48:istore          5
        //   25   50:aload           4
        //   26   52:iload           5
        //   27   54:invokevirtual   #53  <Method void View.setSelected(boolean)>
        //   28   57:iinc            3  1
        //   29   60:goto            23
        //   30   63:iconst_0        
        //   31   64:istore          5
        //   32   66:goto            50
        //   33   69:return          
        }

        final ScrollingTabContainerView this$0;
    }

    public static class TabView extends LinearLayout
    {

        public TabView(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #18  <Method void LinearLayout(Context, AttributeSet)>
        //    4    6:return          
        }

        void attach(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.Tab tab, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field ScrollingTabContainerView mParent>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #24  <Field android.support.v7.app.ActionBar$Tab mTab>
        //    6   10:iload_3         
        //    7   11:ifeq            20
        //    8   14:aload_0         
        //    9   15:bipush          19
        //   10   17:invokevirtual   #28  <Method void setGravity(int)>
        //   11   20:aload_0         
        //   12   21:invokevirtual   #32  <Method void update()>
        //   13   24:return          
        }

        public void bindTab(android.support.v7.app.ActionBar.Tab tab)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #24  <Field android.support.v7.app.ActionBar$Tab mTab>
        //    3    5:aload_0         
        //    4    6:invokevirtual   #32  <Method void update()>
        //    5    9:return          
        }

        public android.support.v7.app.ActionBar.Tab getTab()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field android.support.v7.app.ActionBar$Tab mTab>
        //    2    4:areturn         
        }

        public void onMeasure(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #40  <Method void LinearLayout.onMeasure(int, int)>
        //    4    6:aload_0         
        //    5    7:getfield        #22  <Field ScrollingTabContainerView mParent>
        //    6   10:ifnull          45
        //    7   13:aload_0         
        //    8   14:getfield        #22  <Field ScrollingTabContainerView mParent>
        //    9   17:getfield        #46  <Field int ScrollingTabContainerView.mMaxTabWidth>
        //   10   20:istore_3        
        //   11   21:iload_3         
        //   12   22:ifle            44
        //   13   25:aload_0         
        //   14   26:invokevirtual   #50  <Method int getMeasuredWidth()>
        //   15   29:iload_3         
        //   16   30:icmple          44
        //   17   33:aload_0         
        //   18   34:iload_3         
        //   19   35:ldc1            #51  <Int 0x40000000>
        //   20   37:invokestatic    #57  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   21   40:iload_2         
        //   22   41:invokespecial   #40  <Method void LinearLayout.onMeasure(int, int)>
        //   23   44:return          
        //   24   45:iconst_0        
        //   25   46:istore_3        
        //   26   47:goto            21
        }

        public void update()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field android.support.v7.app.ActionBar$Tab mTab>
        //    2    4:astore_1        
        //    3    5:aload_1         
        //    4    6:invokevirtual   #63  <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
        //    5    9:astore_2        
        //    6   10:aload_2         
        //    7   11:ifnull          91
        //    8   14:aload_2         
        //    9   15:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
        //   10   18:astore          9
        //   11   20:aload           9
        //   12   22:aload_0         
        //   13   23:if_acmpeq       45
        //   14   26:aload           9
        //   15   28:ifnull          40
        //   16   31:aload           9
        //   17   33:checkcast       #71  <Class ViewGroup>
        //   18   36:aload_2         
        //   19   37:invokevirtual   #75  <Method void ViewGroup.removeView(View)>
        //   20   40:aload_0         
        //   21   41:aload_2         
        //   22   42:invokevirtual   #78  <Method void addView(View)>
        //   23   45:aload_0         
        //   24   46:aload_2         
        //   25   47:putfield        #80  <Field View mCustomView>
        //   26   50:aload_0         
        //   27   51:getfield        #82  <Field TextView mTextView>
        //   28   54:ifnull          66
        //   29   57:aload_0         
        //   30   58:getfield        #82  <Field TextView mTextView>
        //   31   61:bipush          8
        //   32   63:invokevirtual   #87  <Method void TextView.setVisibility(int)>
        //   33   66:aload_0         
        //   34   67:getfield        #89  <Field ImageView mIconView>
        //   35   70:ifnull          90
        //   36   73:aload_0         
        //   37   74:getfield        #89  <Field ImageView mIconView>
        //   38   77:bipush          8
        //   39   79:invokevirtual   #92  <Method void ImageView.setVisibility(int)>
        //   40   82:aload_0         
        //   41   83:getfield        #89  <Field ImageView mIconView>
        //   42   86:aconst_null     
        //   43   87:invokevirtual   #96  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
        //   44   90:return          
        //   45   91:aload_0         
        //   46   92:getfield        #80  <Field View mCustomView>
        //   47   95:ifnull          111
        //   48   98:aload_0         
        //   49   99:aload_0         
        //   50  100:getfield        #80  <Field View mCustomView>
        //   51  103:invokevirtual   #97  <Method void removeView(View)>
        //   52  106:aload_0         
        //   53  107:aconst_null     
        //   54  108:putfield        #80  <Field View mCustomView>
        //   55  111:aload_1         
        //   56  112:invokevirtual   #101 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
        //   57  115:astore_3        
        //   58  116:aload_1         
        //   59  117:invokevirtual   #105 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
        //   60  120:astore          4
        //   61  122:aload_3         
        //   62  123:ifnull          314
        //   63  126:aload_0         
        //   64  127:getfield        #89  <Field ImageView mIconView>
        //   65  130:ifnonnull       186
        //   66  133:new             #91  <Class ImageView>
        //   67  136:dup             
        //   68  137:aload_0         
        //   69  138:invokevirtual   #109 <Method Context getContext()>
        //   70  141:invokespecial   #112 <Method void ImageView(Context)>
        //   71  144:astore          7
        //   72  146:new             #114 <Class android.widget.LinearLayout$LayoutParams>
        //   73  149:dup             
        //   74  150:bipush          -2
        //   75  152:bipush          -2
        //   76  154:invokespecial   #116 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
        //   77  157:astore          8
        //   78  159:aload           8
        //   79  161:bipush          16
        //   80  163:putfield        #119 <Field int android.widget.LinearLayout$LayoutParams.gravity>
        //   81  166:aload           7
        //   82  168:aload           8
        //   83  170:invokevirtual   #123 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
        //   84  173:aload_0         
        //   85  174:aload           7
        //   86  176:iconst_0        
        //   87  177:invokevirtual   #126 <Method void addView(View, int)>
        //   88  180:aload_0         
        //   89  181:aload           7
        //   90  183:putfield        #89  <Field ImageView mIconView>
        //   91  186:aload_0         
        //   92  187:getfield        #89  <Field ImageView mIconView>
        //   93  190:aload_3         
        //   94  191:invokevirtual   #96  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
        //   95  194:aload_0         
        //   96  195:getfield        #89  <Field ImageView mIconView>
        //   97  198:iconst_0        
        //   98  199:invokevirtual   #92  <Method void ImageView.setVisibility(int)>
        //   99  202:aload           4
        //  100  204:ifnull          341
        //  101  207:aload_0         
        //  102  208:getfield        #82  <Field TextView mTextView>
        //  103  211:ifnonnull       278
        //  104  214:new             #128 <Class CompatTextView>
        //  105  217:dup             
        //  106  218:aload_0         
        //  107  219:invokevirtual   #109 <Method Context getContext()>
        //  108  222:aconst_null     
        //  109  223:getstatic       #133 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
        //  110  226:invokespecial   #136 <Method void CompatTextView(Context, AttributeSet, int)>
        //  111  229:astore          5
        //  112  231:aload           5
        //  113  233:getstatic       #142 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
        //  114  236:invokevirtual   #146 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
        //  115  239:new             #114 <Class android.widget.LinearLayout$LayoutParams>
        //  116  242:dup             
        //  117  243:bipush          -2
        //  118  245:bipush          -2
        //  119  247:invokespecial   #116 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
        //  120  250:astore          6
        //  121  252:aload           6
        //  122  254:bipush          16
        //  123  256:putfield        #119 <Field int android.widget.LinearLayout$LayoutParams.gravity>
        //  124  259:aload           5
        //  125  261:aload           6
        //  126  263:invokevirtual   #147 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
        //  127  266:aload_0         
        //  128  267:aload           5
        //  129  269:invokevirtual   #78  <Method void addView(View)>
        //  130  272:aload_0         
        //  131  273:aload           5
        //  132  275:putfield        #82  <Field TextView mTextView>
        //  133  278:aload_0         
        //  134  279:getfield        #82  <Field TextView mTextView>
        //  135  282:aload           4
        //  136  284:invokevirtual   #151 <Method void TextView.setText(CharSequence)>
        //  137  287:aload_0         
        //  138  288:getfield        #82  <Field TextView mTextView>
        //  139  291:iconst_0        
        //  140  292:invokevirtual   #87  <Method void TextView.setVisibility(int)>
        //  141  295:aload_0         
        //  142  296:getfield        #89  <Field ImageView mIconView>
        //  143  299:ifnull          90
        //  144  302:aload_0         
        //  145  303:getfield        #89  <Field ImageView mIconView>
        //  146  306:aload_1         
        //  147  307:invokevirtual   #154 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
        //  148  310:invokevirtual   #157 <Method void ImageView.setContentDescription(CharSequence)>
        //  149  313:return          
        //  150  314:aload_0         
        //  151  315:getfield        #89  <Field ImageView mIconView>
        //  152  318:ifnull          202
        //  153  321:aload_0         
        //  154  322:getfield        #89  <Field ImageView mIconView>
        //  155  325:bipush          8
        //  156  327:invokevirtual   #92  <Method void ImageView.setVisibility(int)>
        //  157  330:aload_0         
        //  158  331:getfield        #89  <Field ImageView mIconView>
        //  159  334:aconst_null     
        //  160  335:invokevirtual   #96  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
        //  161  338:goto            202
        //  162  341:aload_0         
        //  163  342:getfield        #82  <Field TextView mTextView>
        //  164  345:ifnull          295
        //  165  348:aload_0         
        //  166  349:getfield        #82  <Field TextView mTextView>
        //  167  352:bipush          8
        //  168  354:invokevirtual   #87  <Method void TextView.setVisibility(int)>
        //  169  357:aload_0         
        //  170  358:getfield        #82  <Field TextView mTextView>
        //  171  361:aconst_null     
        //  172  362:invokevirtual   #151 <Method void TextView.setText(CharSequence)>
        //  173  365:goto            295
        }

        private View mCustomView;
        private ImageView mIconView;
        private ScrollingTabContainerView mParent;
        private android.support.v7.app.ActionBar.Tab mTab;
        private TextView mTextView;
    }


    public ScrollingTabContainerView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #31  <Method void HorizontalScrollView(Context)>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:invokestatic    #37  <Method LayoutInflater LayoutInflater.from(Context)>
    //    6   10:putfield        #39  <Field LayoutInflater mInflater>
    //    7   13:aload_0         
    //    8   14:iconst_0        
    //    9   15:invokevirtual   #43  <Method void setHorizontalScrollBarEnabled(boolean)>
    //   10   18:aload_1         
    //   11   19:invokestatic    #49  <Method ActionBarPolicy ActionBarPolicy.get(Context)>
    //   12   22:astore_2        
    //   13   23:aload_0         
    //   14   24:aload_2         
    //   15   25:invokevirtual   #53  <Method int ActionBarPolicy.getTabContainerHeight()>
    //   16   28:invokevirtual   #57  <Method void setContentHeight(int)>
    //   17   31:aload_0         
    //   18   32:aload_2         
    //   19   33:invokevirtual   #60  <Method int ActionBarPolicy.getStackedTabMaxWidth()>
    //   20   36:putfield        #62  <Field int mStackedTabMaxWidth>
    //   21   39:aload_0         
    //   22   40:aload_0         
    //   23   41:getfield        #39  <Field LayoutInflater mInflater>
    //   24   44:getstatic       #67  <Field int android.support.v7.appcompat.R$layout.abc_action_bar_tabbar>
    //   25   47:aload_0         
    //   26   48:iconst_0        
    //   27   49:invokevirtual   #71  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   28   52:checkcast       #73  <Class LinearLayout>
    //   29   55:putfield        #75  <Field LinearLayout mTabLayout>
    //   30   58:aload_0         
    //   31   59:aload_0         
    //   32   60:getfield        #75  <Field LinearLayout mTabLayout>
    //   33   63:new             #77  <Class android.view.ViewGroup$LayoutParams>
    //   34   66:dup             
    //   35   67:bipush          -2
    //   36   69:iconst_m1       
    //   37   70:invokespecial   #80  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   38   73:invokevirtual   #84  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   39   76:return          
    }

    static LinearLayout access$200(ScrollingTabContainerView scrollingtabcontainerview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    5    4:areturn         
    }

    static TabView access$300(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #92  <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:iload_2         
    //    8    3:invokespecial   #92  <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
    //    9    6:areturn         
    }

    private SpinnerICS createSpinner()
    {
    //    0    0:new             #96  <Class SpinnerICS>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #100 <Method Context getContext()>
    //    4    8:aconst_null     
    //    5    9:getstatic       #105 <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
    //    6   12:invokespecial   #108 <Method void SpinnerICS(Context, AttributeSet, int)>
    //    7   15:astore_1        
    //    8   16:aload_1         
    //    9   17:new             #110 <Class android.widget.LinearLayout$LayoutParams>
    //   10   20:dup             
    //   11   21:bipush          -2
    //   12   23:iconst_m1       
    //   13   24:invokespecial   #111 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
    //   14   27:invokevirtual   #115 <Method void SpinnerICS.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   15   30:aload_1         
    //   16   31:aload_0         
    //   17   32:invokevirtual   #119 <Method void SpinnerICS.setOnItemClickListenerInt(AdapterViewICS$OnItemClickListener)>
    //   18   35:aload_1         
    //   19   36:areturn         
    }

    private TabView createTabView(android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #39  <Field LayoutInflater mInflater>
    //    2    4:getstatic       #122 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_tab>
    //    3    7:aload_0         
    //    4    8:getfield        #75  <Field LinearLayout mTabLayout>
    //    5   11:iconst_0        
    //    6   12:invokevirtual   #71  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    7   15:checkcast       #124 <Class ScrollingTabContainerView$TabView>
    //    8   18:astore_3        
    //    9   19:aload_3         
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:iload_2         
    //   13   23:invokevirtual   #128 <Method void ScrollingTabContainerView$TabView.attach(ScrollingTabContainerView, android.support.v7.app.ActionBar$Tab, boolean)>
    //   14   26:iload_2         
    //   15   27:ifeq            53
    //   16   30:aload_3         
    //   17   31:aconst_null     
    //   18   32:invokevirtual   #132 <Method void ScrollingTabContainerView$TabView.setBackgroundDrawable(android.graphics.drawable.Drawable)>
    //   19   35:aload_3         
    //   20   36:new             #134 <Class android.widget.AbsListView$LayoutParams>
    //   21   39:dup             
    //   22   40:iconst_m1       
    //   23   41:aload_0         
    //   24   42:getfield        #136 <Field int mContentHeight>
    //   25   45:invokespecial   #137 <Method void android.widget.AbsListView$LayoutParams(int, int)>
    //   26   48:invokevirtual   #138 <Method void ScrollingTabContainerView$TabView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   27   51:aload_3         
    //   28   52:areturn         
    //   29   53:aload_3         
    //   30   54:iconst_1        
    //   31   55:invokevirtual   #141 <Method void ScrollingTabContainerView$TabView.setFocusable(boolean)>
    //   32   58:aload_0         
    //   33   59:getfield        #143 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
    //   34   62:ifnonnull       78
    //   35   65:aload_0         
    //   36   66:new             #145 <Class ScrollingTabContainerView$TabClickListener>
    //   37   69:dup             
    //   38   70:aload_0         
    //   39   71:aconst_null     
    //   40   72:invokespecial   #148 <Method void ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView, ScrollingTabContainerView$1)>
    //   41   75:putfield        #143 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
    //   42   78:aload_3         
    //   43   79:aload_0         
    //   44   80:getfield        #143 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
    //   45   83:invokevirtual   #152 <Method void ScrollingTabContainerView$TabView.setOnClickListener(android.view.View$OnClickListener)>
    //   46   86:aload_3         
    //   47   87:areturn         
    }

    private boolean isCollapsed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    2    4:ifnull          20
    //    3    7:aload_0         
    //    4    8:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    5   11:invokevirtual   #160 <Method android.view.ViewParent SpinnerICS.getParent()>
    //    6   14:aload_0         
    //    7   15:if_acmpne       20
    //    8   18:iconst_1        
    //    9   19:ireturn         
    //   10   20:iconst_0        
    //   11   21:ireturn         
    }

    private void performCollapse()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #164 <Method boolean isCollapsed()>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    6   12:ifnonnull       23
    //    7   15:aload_0         
    //    8   16:aload_0         
    //    9   17:invokespecial   #166 <Method SpinnerICS createSpinner()>
    //   10   20:putfield        #156 <Field SpinnerICS mTabSpinner>
    //   11   23:aload_0         
    //   12   24:aload_0         
    //   13   25:getfield        #75  <Field LinearLayout mTabLayout>
    //   14   28:invokevirtual   #170 <Method void removeView(View)>
    //   15   31:aload_0         
    //   16   32:aload_0         
    //   17   33:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   18   36:new             #77  <Class android.view.ViewGroup$LayoutParams>
    //   19   39:dup             
    //   20   40:bipush          -2
    //   21   42:iconst_m1       
    //   22   43:invokespecial   #80  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   23   46:invokevirtual   #84  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   24   49:aload_0         
    //   25   50:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   26   53:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //   27   56:ifnonnull       75
    //   28   59:aload_0         
    //   29   60:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   30   63:new             #176 <Class ScrollingTabContainerView$TabAdapter>
    //   31   66:dup             
    //   32   67:aload_0         
    //   33   68:aconst_null     
    //   34   69:invokespecial   #177 <Method void ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView, ScrollingTabContainerView$1)>
    //   35   72:invokevirtual   #181 <Method void SpinnerICS.setAdapter(android.widget.SpinnerAdapter)>
    //   36   75:aload_0         
    //   37   76:getfield        #183 <Field Runnable mTabSelector>
    //   38   79:ifnull          96
    //   39   82:aload_0         
    //   40   83:aload_0         
    //   41   84:getfield        #183 <Field Runnable mTabSelector>
    //   42   87:invokevirtual   #187 <Method boolean removeCallbacks(Runnable)>
    //   43   90:pop             
    //   44   91:aload_0         
    //   45   92:aconst_null     
    //   46   93:putfield        #183 <Field Runnable mTabSelector>
    //   47   96:aload_0         
    //   48   97:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   49  100:aload_0         
    //   50  101:getfield        #189 <Field int mSelectedTabIndex>
    //   51  104:invokevirtual   #192 <Method void SpinnerICS.setSelection(int)>
    //   52  107:return          
    }

    private boolean performExpand()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #164 <Method boolean isCollapsed()>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    8   14:invokevirtual   #170 <Method void removeView(View)>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #75  <Field LinearLayout mTabLayout>
    //   12   22:new             #77  <Class android.view.ViewGroup$LayoutParams>
    //   13   25:dup             
    //   14   26:bipush          -2
    //   15   28:iconst_m1       
    //   16   29:invokespecial   #80  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   17   32:invokevirtual   #84  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   18   35:aload_0         
    //   19   36:aload_0         
    //   20   37:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   21   40:invokevirtual   #196 <Method int SpinnerICS.getSelectedItemPosition()>
    //   22   43:invokevirtual   #199 <Method void setTabSelected(int)>
    //   23   46:iconst_0        
    //   24   47:ireturn         
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #92  <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
    //    4    6:astore          4
    //    5    8:aload_0         
    //    6    9:getfield        #75  <Field LinearLayout mTabLayout>
    //    7   12:aload           4
    //    8   14:iload_2         
    //    9   15:new             #110 <Class android.widget.LinearLayout$LayoutParams>
    //   10   18:dup             
    //   11   19:iconst_0        
    //   12   20:iconst_m1       
    //   13   21:fconst_1        
    //   14   22:invokespecial   #204 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   15   25:invokevirtual   #207 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
    //   16   28:aload_0         
    //   17   29:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   18   32:ifnull          48
    //   19   35:aload_0         
    //   20   36:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   21   39:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //   22   42:checkcast       #176 <Class ScrollingTabContainerView$TabAdapter>
    //   23   45:invokevirtual   #210 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
    //   24   48:iload_3         
    //   25   49:ifeq            58
    //   26   52:aload           4
    //   27   54:iconst_1        
    //   28   55:invokevirtual   #213 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
    //   29   58:aload_0         
    //   30   59:getfield        #215 <Field boolean mAllowCollapse>
    //   31   62:ifeq            69
    //   32   65:aload_0         
    //   33   66:invokevirtual   #218 <Method void requestLayout()>
    //   34   69:return          
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #92  <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
    //    4    6:astore_3        
    //    5    7:aload_0         
    //    6    8:getfield        #75  <Field LinearLayout mTabLayout>
    //    7   11:aload_3         
    //    8   12:new             #110 <Class android.widget.LinearLayout$LayoutParams>
    //    9   15:dup             
    //   10   16:iconst_0        
    //   11   17:iconst_m1       
    //   12   18:fconst_1        
    //   13   19:invokespecial   #204 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   14   22:invokevirtual   #220 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   15   25:aload_0         
    //   16   26:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   17   29:ifnull          45
    //   18   32:aload_0         
    //   19   33:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   20   36:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //   21   39:checkcast       #176 <Class ScrollingTabContainerView$TabAdapter>
    //   22   42:invokevirtual   #210 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
    //   23   45:iload_2         
    //   24   46:ifeq            54
    //   25   49:aload_3         
    //   26   50:iconst_1        
    //   27   51:invokevirtual   #213 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
    //   28   54:aload_0         
    //   29   55:getfield        #215 <Field boolean mAllowCollapse>
    //   30   58:ifeq            65
    //   31   61:aload_0         
    //   32   62:invokevirtual   #218 <Method void requestLayout()>
    //   33   65:return          
    }

    public void animateToTab(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #225 <Method View LinearLayout.getChildAt(int)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #183 <Field Runnable mTabSelector>
    //    7   13:ifnull          25
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #183 <Field Runnable mTabSelector>
    //   11   21:invokevirtual   #187 <Method boolean removeCallbacks(Runnable)>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:new             #227 <Class ScrollingTabContainerView$1>
    //   15   29:dup             
    //   16   30:aload_0         
    //   17   31:aload_2         
    //   18   32:invokespecial   #230 <Method void ScrollingTabContainerView$1(ScrollingTabContainerView, View)>
    //   19   35:putfield        #183 <Field Runnable mTabSelector>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #183 <Field Runnable mTabSelector>
    //   23   43:invokevirtual   #233 <Method boolean post(Runnable)>
    //   24   46:pop             
    //   25   47:return          
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #236 <Method void HorizontalScrollView.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #183 <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #183 <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #233 <Method boolean post(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #100 <Method Context getContext()>
    //    2    4:invokestatic    #49  <Method ActionBarPolicy ActionBarPolicy.get(Context)>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:aload_2         
    //    6   10:invokevirtual   #53  <Method int ActionBarPolicy.getTabContainerHeight()>
    //    7   13:invokevirtual   #57  <Method void setContentHeight(int)>
    //    8   16:aload_0         
    //    9   17:aload_2         
    //   10   18:invokevirtual   #60  <Method int ActionBarPolicy.getStackedTabMaxWidth()>
    //   11   21:putfield        #62  <Field int mStackedTabMaxWidth>
    //   12   24:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #241 <Method void HorizontalScrollView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #183 <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #183 <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #187 <Method boolean removeCallbacks(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onItemClick(AdapterViewICS adapterviewics, View view, int i, long l)
    {
    //    0    0:aload_2         
    //    1    1:checkcast       #124 <Class ScrollingTabContainerView$TabView>
    //    2    4:invokevirtual   #247 <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
    //    3    7:invokevirtual   #252 <Method void android.support.v7.app.ActionBar$Tab.select()>
    //    4   10:return          
    }

    public void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #259 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_3         
    //    4    6:ldc2            #260 <Int 0x40000000>
    //    5    9:icmpne          185
    //    6   12:iconst_1        
    //    7   13:istore          4
    //    8   15:aload_0         
    //    9   16:iload           4
    //   10   18:invokevirtual   #263 <Method void setFillViewport(boolean)>
    //   11   21:aload_0         
    //   12   22:getfield        #75  <Field LinearLayout mTabLayout>
    //   13   25:invokevirtual   #266 <Method int LinearLayout.getChildCount()>
    //   14   28:istore          5
    //   15   30:iload           5
    //   16   32:iconst_1        
    //   17   33:icmple          204
    //   18   36:iload_3         
    //   19   37:ldc2            #260 <Int 0x40000000>
    //   20   40:icmpeq          50
    //   21   43:iload_3         
    //   22   44:ldc2            #267 <Int 0x80000000>
    //   23   47:icmpne          204
    //   24   50:iload           5
    //   25   52:iconst_2        
    //   26   53:icmple          191
    //   27   56:aload_0         
    //   28   57:ldc2            #268 <Float 0.4F>
    //   29   60:iload_1         
    //   30   61:invokestatic    #271 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   31   64:i2f             
    //   32   65:fmul            
    //   33   66:f2i             
    //   34   67:putfield        #273 <Field int mMaxTabWidth>
    //   35   70:aload_0         
    //   36   71:aload_0         
    //   37   72:getfield        #273 <Field int mMaxTabWidth>
    //   38   75:aload_0         
    //   39   76:getfield        #62  <Field int mStackedTabMaxWidth>
    //   40   79:invokestatic    #279 <Method int Math.min(int, int)>
    //   41   82:putfield        #273 <Field int mMaxTabWidth>
    //   42   85:aload_0         
    //   43   86:getfield        #136 <Field int mContentHeight>
    //   44   89:ldc2            #260 <Int 0x40000000>
    //   45   92:invokestatic    #282 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   46   95:istore          6
    //   47   97:iload           4
    //   48   99:ifne            212
    //   49  102:aload_0         
    //   50  103:getfield        #215 <Field boolean mAllowCollapse>
    //   51  106:ifeq            212
    //   52  109:iconst_1        
    //   53  110:istore          7
    //   54  112:iload           7
    //   55  114:ifeq            226
    //   56  117:aload_0         
    //   57  118:getfield        #75  <Field LinearLayout mTabLayout>
    //   58  121:iconst_0        
    //   59  122:iload           6
    //   60  124:invokevirtual   #285 <Method void LinearLayout.measure(int, int)>
    //   61  127:aload_0         
    //   62  128:getfield        #75  <Field LinearLayout mTabLayout>
    //   63  131:invokevirtual   #288 <Method int LinearLayout.getMeasuredWidth()>
    //   64  134:iload_1         
    //   65  135:invokestatic    #271 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   66  138:icmple          218
    //   67  141:aload_0         
    //   68  142:invokespecial   #290 <Method void performCollapse()>
    //   69  145:aload_0         
    //   70  146:invokevirtual   #291 <Method int getMeasuredWidth()>
    //   71  149:istore          9
    //   72  151:aload_0         
    //   73  152:iload_1         
    //   74  153:iload           6
    //   75  155:invokespecial   #293 <Method void HorizontalScrollView.onMeasure(int, int)>
    //   76  158:aload_0         
    //   77  159:invokevirtual   #291 <Method int getMeasuredWidth()>
    //   78  162:istore          10
    //   79  164:iload           4
    //   80  166:ifeq            184
    //   81  169:iload           9
    //   82  171:iload           10
    //   83  173:icmpeq          184
    //   84  176:aload_0         
    //   85  177:aload_0         
    //   86  178:getfield        #189 <Field int mSelectedTabIndex>
    //   87  181:invokevirtual   #199 <Method void setTabSelected(int)>
    //   88  184:return          
    //   89  185:iconst_0        
    //   90  186:istore          4
    //   91  188:goto            15
    //   92  191:aload_0         
    //   93  192:iload_1         
    //   94  193:invokestatic    #271 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   95  196:iconst_2        
    //   96  197:idiv            
    //   97  198:putfield        #273 <Field int mMaxTabWidth>
    //   98  201:goto            70
    //   99  204:aload_0         
    //  100  205:iconst_m1       
    //  101  206:putfield        #273 <Field int mMaxTabWidth>
    //  102  209:goto            85
    //  103  212:iconst_0        
    //  104  213:istore          7
    //  105  215:goto            112
    //  106  218:aload_0         
    //  107  219:invokespecial   #295 <Method boolean performExpand()>
    //  108  222:pop             
    //  109  223:goto            145
    //  110  226:aload_0         
    //  111  227:invokespecial   #295 <Method boolean performExpand()>
    //  112  230:pop             
    //  113  231:goto            145
    }

    public void removeAllTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:invokevirtual   #299 <Method void LinearLayout.removeAllViews()>
    //    3    7:aload_0         
    //    4    8:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    5   11:ifnull          27
    //    6   14:aload_0         
    //    7   15:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    8   18:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //    9   21:checkcast       #176 <Class ScrollingTabContainerView$TabAdapter>
    //   10   24:invokevirtual   #210 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
    //   11   27:aload_0         
    //   12   28:getfield        #215 <Field boolean mAllowCollapse>
    //   13   31:ifeq            38
    //   14   34:aload_0         
    //   15   35:invokevirtual   #218 <Method void requestLayout()>
    //   16   38:return          
    }

    public void removeTabAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #303 <Method void LinearLayout.removeViewAt(int)>
    //    4    8:aload_0         
    //    5    9:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    6   12:ifnull          28
    //    7   15:aload_0         
    //    8   16:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    9   19:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //   10   22:checkcast       #176 <Class ScrollingTabContainerView$TabAdapter>
    //   11   25:invokevirtual   #210 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
    //   12   28:aload_0         
    //   13   29:getfield        #215 <Field boolean mAllowCollapse>
    //   14   32:ifeq            39
    //   15   35:aload_0         
    //   16   36:invokevirtual   #218 <Method void requestLayout()>
    //   17   39:return          
    }

    public void setAllowCollapse(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #215 <Field boolean mAllowCollapse>
    //    3    5:return          
    }

    public void setContentHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #136 <Field int mContentHeight>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #218 <Method void requestLayout()>
    //    5    9:return          
    }

    public void setTabSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #189 <Field int mSelectedTabIndex>
    //    3    5:aload_0         
    //    4    6:getfield        #75  <Field LinearLayout mTabLayout>
    //    5    9:invokevirtual   #266 <Method int LinearLayout.getChildCount()>
    //    6   12:istore_2        
    //    7   13:iconst_0        
    //    8   14:istore_3        
    //    9   15:iload_3         
    //   10   16:iload_2         
    //   11   17:icmpge          67
    //   12   20:aload_0         
    //   13   21:getfield        #75  <Field LinearLayout mTabLayout>
    //   14   24:iload_3         
    //   15   25:invokevirtual   #225 <Method View LinearLayout.getChildAt(int)>
    //   16   28:astore          4
    //   17   30:iload_3         
    //   18   31:iload_1         
    //   19   32:icmpne          61
    //   20   35:iconst_1        
    //   21   36:istore          5
    //   22   38:aload           4
    //   23   40:iload           5
    //   24   42:invokevirtual   #307 <Method void View.setSelected(boolean)>
    //   25   45:iload           5
    //   26   47:ifeq            55
    //   27   50:aload_0         
    //   28   51:iload_1         
    //   29   52:invokevirtual   #309 <Method void animateToTab(int)>
    //   30   55:iinc            3  1
    //   31   58:goto            15
    //   32   61:iconst_0        
    //   33   62:istore          5
    //   34   64:goto            38
    //   35   67:return          
    }

    public void updateTab(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #225 <Method View LinearLayout.getChildAt(int)>
    //    4    8:checkcast       #124 <Class ScrollingTabContainerView$TabView>
    //    5   11:invokevirtual   #313 <Method void ScrollingTabContainerView$TabView.update()>
    //    6   14:aload_0         
    //    7   15:getfield        #156 <Field SpinnerICS mTabSpinner>
    //    8   18:ifnull          34
    //    9   21:aload_0         
    //   10   22:getfield        #156 <Field SpinnerICS mTabSpinner>
    //   11   25:invokevirtual   #174 <Method android.widget.SpinnerAdapter SpinnerICS.getAdapter()>
    //   12   28:checkcast       #176 <Class ScrollingTabContainerView$TabAdapter>
    //   13   31:invokevirtual   #210 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
    //   14   34:aload_0         
    //   15   35:getfield        #215 <Field boolean mAllowCollapse>
    //   16   38:ifeq            45
    //   17   41:aload_0         
    //   18   42:invokevirtual   #218 <Method void requestLayout()>
    //   19   45:return          
    }

    private static final String TAG = "ScrollingTabContainerView";
    private boolean mAllowCollapse;
    private int mContentHeight;
    private final LayoutInflater mInflater;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    private LinearLayout mTabLayout;
    Runnable mTabSelector;
    private SpinnerICS mTabSpinner;

    static LinearLayout access$200(ScrollingTabContainerView scrollingtabcontainerview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field LinearLayout mTabLayout>
    //    2    4:areturn         
    }

    static TabView access$300(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #92  <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
    //    4    6:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ScrollingTabContainerView$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field ScrollingTabContainerView this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$tabView>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field View val$tabView>
        //    2    4:invokevirtual   #31  <Method int View.getLeft()>
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field ScrollingTabContainerView this$0>
        //    5   11:invokevirtual   #34  <Method int ScrollingTabContainerView.getWidth()>
        //    6   14:aload_0         
        //    7   15:getfield        #21  <Field View val$tabView>
        //    8   18:invokevirtual   #35  <Method int View.getWidth()>
        //    9   21:isub            
        //   10   22:iconst_2        
        //   11   23:idiv            
        //   12   24:isub            
        //   13   25:istore_1        
        //   14   26:aload_0         
        //   15   27:getfield        #19  <Field ScrollingTabContainerView this$0>
        //   16   30:iload_1         
        //   17   31:iconst_0        
        //   18   32:invokevirtual   #39  <Method void ScrollingTabContainerView.smoothScrollTo(int, int)>
        //   19   35:aload_0         
        //   20   36:getfield        #19  <Field ScrollingTabContainerView this$0>
        //   21   39:aconst_null     
        //   22   40:putfield        #43  <Field Runnable ScrollingTabContainerView.mTabSelector>
        //   23   43:return          
        }

        final ScrollingTabContainerView this$0;
        final View val$tabView;
    }

}
