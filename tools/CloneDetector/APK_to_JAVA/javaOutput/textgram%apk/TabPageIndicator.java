// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator, IcsLinearLayout, IconPagerAdapter

public class TabPageIndicator extends HorizontalScrollView
    implements PageIndicator
{
    public static interface OnTabReselectedListener
    {

        public abstract void onTabReselected(int i);
    }

    private class TabView extends TextView
    {

        public TabView(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field TabPageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:aconst_null     
        //    6    8:getstatic       #17  <Field int R$attr.vpiTabPageIndicatorStyle>
        //    7   11:invokespecial   #20  <Method void TextView(Context, AttributeSet, int)>
        //    8   14:return          
        }

        static void access$0(TabView tabview, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #24  <Field int mIndex>
        //    3    5:return          
// Previous instruction length mismatch
        //    4    0:aload_0         
        //    5    1:iload_1         
        //    6    2:putfield        #24  <Field int mIndex>
        //    7    5:return          
        }

        public int getIndex()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field int mIndex>
        //    2    4:ireturn         
        }

        public void onMeasure(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #30  <Method void TextView.onMeasure(int, int)>
        //    4    6:aload_0         
        //    5    7:getfield        #12  <Field TabPageIndicator this$0>
        //    6   10:invokestatic    #36  <Method int TabPageIndicator.access$2(TabPageIndicator)>
        //    7   13:ifle            47
        //    8   16:aload_0         
        //    9   17:invokevirtual   #39  <Method int getMeasuredWidth()>
        //   10   20:aload_0         
        //   11   21:getfield        #12  <Field TabPageIndicator this$0>
        //   12   24:invokestatic    #36  <Method int TabPageIndicator.access$2(TabPageIndicator)>
        //   13   27:icmple          47
        //   14   30:aload_0         
        //   15   31:aload_0         
        //   16   32:getfield        #12  <Field TabPageIndicator this$0>
        //   17   35:invokestatic    #36  <Method int TabPageIndicator.access$2(TabPageIndicator)>
        //   18   38:ldc1            #40  <Int 0x40000000>
        //   19   40:invokestatic    #46  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   20   43:iload_2         
        //   21   44:invokespecial   #30  <Method void TextView.onMeasure(int, int)>
        //   22   47:return          
        }

        private int mIndex;
        final TabPageIndicator this$0;

        static void access$0(TabView tabview, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #24  <Field int mIndex>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:ldc1            #27  <String "">
    //    1    2:putstatic       #29  <Field CharSequence EMPTY_TITLE>
    //    2    5:return          
    }

    public TabPageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #34  <Method void TabPageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public TabPageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #35  <Method void HorizontalScrollView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #37  <Class TabPageIndicator$1>
    //    6   10:dup             
    //    7   11:aload_0         
    //    8   12:invokespecial   #40  <Method void TabPageIndicator$1(TabPageIndicator)>
    //    9   15:putfield        #42  <Field android.view.View$OnClickListener mTabClickListener>
    //   10   18:aload_0         
    //   11   19:iconst_0        
    //   12   20:invokevirtual   #46  <Method void setHorizontalScrollBarEnabled(boolean)>
    //   13   23:aload_0         
    //   14   24:new             #48  <Class IcsLinearLayout>
    //   15   27:dup             
    //   16   28:aload_1         
    //   17   29:getstatic       #53  <Field int R$attr.vpiTabPageIndicatorStyle>
    //   18   32:invokespecial   #56  <Method void IcsLinearLayout(Context, int)>
    //   19   35:putfield        #58  <Field IcsLinearLayout mTabLayout>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //   23   43:new             #60  <Class android.view.ViewGroup$LayoutParams>
    //   24   46:dup             
    //   25   47:bipush          -2
    //   26   49:iconst_m1       
    //   27   50:invokespecial   #63  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   28   53:invokevirtual   #67  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   29   56:return          
    }

    static ViewPager access$0(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field ViewPager mViewPager>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #71  <Field ViewPager mViewPager>
    //    5    4:areturn         
    }

    static OnTabReselectedListener access$1(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #75  <Field TabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    5    4:areturn         
    }

    static int access$2(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field int mMaxTabWidth>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #79  <Field int mMaxTabWidth>
    //    5    4:ireturn         
    }

    static void access$3(TabPageIndicator tabpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #83  <Field Runnable mTabSelector>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #83  <Field Runnable mTabSelector>
    //    7    5:return          
    }

    private void addTab(int i, CharSequence charsequence, int j)
    {
    //    0    0:new             #87  <Class TabPageIndicator$TabView>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #91  <Method Context getContext()>
    //    5    9:invokespecial   #94  <Method void TabPageIndicator$TabView(TabPageIndicator, Context)>
    //    6   12:astore          4
    //    7   14:aload           4
    //    8   16:iload_1         
    //    9   17:invokestatic    #97  <Method void TabPageIndicator$TabView.access$0(TabPageIndicator$TabView, int)>
    //   10   20:aload           4
    //   11   22:iconst_1        
    //   12   23:invokevirtual   #100 <Method void TabPageIndicator$TabView.setFocusable(boolean)>
    //   13   26:aload           4
    //   14   28:aload_0         
    //   15   29:getfield        #42  <Field android.view.View$OnClickListener mTabClickListener>
    //   16   32:invokevirtual   #104 <Method void TabPageIndicator$TabView.setOnClickListener(android.view.View$OnClickListener)>
    //   17   35:aload           4
    //   18   37:aload_2         
    //   19   38:invokevirtual   #108 <Method void TabPageIndicator$TabView.setText(CharSequence)>
    //   20   41:iload_3         
    //   21   42:ifeq            54
    //   22   45:aload           4
    //   23   47:iload_3         
    //   24   48:iconst_0        
    //   25   49:iconst_0        
    //   26   50:iconst_0        
    //   27   51:invokevirtual   #112 <Method void TabPageIndicator$TabView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
    //   28   54:aload_0         
    //   29   55:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //   30   58:aload           4
    //   31   60:new             #114 <Class android.widget.LinearLayout$LayoutParams>
    //   32   63:dup             
    //   33   64:iconst_0        
    //   34   65:iconst_m1       
    //   35   66:fconst_1        
    //   36   67:invokespecial   #117 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   37   70:invokevirtual   #118 <Method void IcsLinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   38   73:return          
    }

    private void animateToTab(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #124 <Method View IcsLinearLayout.getChildAt(int)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #83  <Field Runnable mTabSelector>
    //    7   13:ifnull          25
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #83  <Field Runnable mTabSelector>
    //   11   21:invokevirtual   #128 <Method boolean removeCallbacks(Runnable)>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:new             #130 <Class TabPageIndicator$2>
    //   15   29:dup             
    //   16   30:aload_0         
    //   17   31:aload_2         
    //   18   32:invokespecial   #133 <Method void TabPageIndicator$2(TabPageIndicator, View)>
    //   19   35:putfield        #83  <Field Runnable mTabSelector>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #83  <Field Runnable mTabSelector>
    //   23   43:invokevirtual   #136 <Method boolean post(Runnable)>
    //   24   46:pop             
    //   25   47:return          
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //    2    4:invokevirtual   #140 <Method void IcsLinearLayout.removeAllViews()>
    //    3    7:aload_0         
    //    4    8:getfield        #71  <Field ViewPager mViewPager>
    //    5   11:invokevirtual   #146 <Method PagerAdapter ViewPager.getAdapter()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:instanceof      #148 <Class IconPagerAdapter>
    //    9   19:istore_2        
    //   10   20:aconst_null     
    //   11   21:astore_3        
    //   12   22:iload_2         
    //   13   23:ifeq            31
    //   14   26:aload_1         
    //   15   27:checkcast       #148 <Class IconPagerAdapter>
    //   16   30:astore_3        
    //   17   31:aload_1         
    //   18   32:invokevirtual   #154 <Method int PagerAdapter.getCount()>
    //   19   35:istore          4
    //   20   37:iconst_0        
    //   21   38:istore          5
    //   22   40:iload           5
    //   23   42:iload           4
    //   24   44:icmplt          77
    //   25   47:aload_0         
    //   26   48:getfield        #156 <Field int mSelectedTabIndex>
    //   27   51:iload           4
    //   28   53:icmple          64
    //   29   56:aload_0         
    //   30   57:iload           4
    //   31   59:iconst_1        
    //   32   60:isub            
    //   33   61:putfield        #156 <Field int mSelectedTabIndex>
    //   34   64:aload_0         
    //   35   65:aload_0         
    //   36   66:getfield        #156 <Field int mSelectedTabIndex>
    //   37   69:invokevirtual   #159 <Method void setCurrentItem(int)>
    //   38   72:aload_0         
    //   39   73:invokevirtual   #162 <Method void requestLayout()>
    //   40   76:return          
    //   41   77:aload_1         
    //   42   78:iload           5
    //   43   80:invokevirtual   #166 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //   44   83:astore          6
    //   45   85:aload           6
    //   46   87:ifnonnull       95
    //   47   90:getstatic       #29  <Field CharSequence EMPTY_TITLE>
    //   48   93:astore          6
    //   49   95:iconst_0        
    //   50   96:istore          7
    //   51   98:aload_3         
    //   52   99:ifnull          112
    //   53  102:aload_3         
    //   54  103:iload           5
    //   55  105:invokeinterface #170 <Method int IconPagerAdapter.getIconResId(int)>
    //   56  110:istore          7
    //   57  112:aload_0         
    //   58  113:iload           5
    //   59  115:aload           6
    //   60  117:iload           7
    //   61  119:invokespecial   #172 <Method void addTab(int, CharSequence, int)>
    //   62  122:iinc            5  1
    //   63  125:goto            40
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #175 <Method void HorizontalScrollView.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #83  <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #83  <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #136 <Method boolean post(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #178 <Method void HorizontalScrollView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #83  <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #83  <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #128 <Method boolean removeCallbacks(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #184 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_3         
    //    4    6:ldc1            #185 <Int 0x40000000>
    //    5    8:icmpne          105
    //    6   11:iconst_1        
    //    7   12:istore          4
    //    8   14:aload_0         
    //    9   15:iload           4
    //   10   17:invokevirtual   #188 <Method void setFillViewport(boolean)>
    //   11   20:aload_0         
    //   12   21:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //   13   24:invokevirtual   #191 <Method int IcsLinearLayout.getChildCount()>
    //   14   27:istore          5
    //   15   29:iload           5
    //   16   31:iconst_1        
    //   17   32:icmple          124
    //   18   35:iload_3         
    //   19   36:ldc1            #185 <Int 0x40000000>
    //   20   38:icmpeq          47
    //   21   41:iload_3         
    //   22   42:ldc1            #192 <Int 0x80000000>
    //   23   44:icmpne          124
    //   24   47:iload           5
    //   25   49:iconst_2        
    //   26   50:icmple          111
    //   27   53:aload_0         
    //   28   54:ldc1            #193 <Float 0.4F>
    //   29   56:iload_1         
    //   30   57:invokestatic    #196 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   31   60:i2f             
    //   32   61:fmul            
    //   33   62:f2i             
    //   34   63:putfield        #79  <Field int mMaxTabWidth>
    //   35   66:aload_0         
    //   36   67:invokevirtual   #199 <Method int getMeasuredWidth()>
    //   37   70:istore          6
    //   38   72:aload_0         
    //   39   73:iload_1         
    //   40   74:iload_2         
    //   41   75:invokespecial   #201 <Method void HorizontalScrollView.onMeasure(int, int)>
    //   42   78:aload_0         
    //   43   79:invokevirtual   #199 <Method int getMeasuredWidth()>
    //   44   82:istore          7
    //   45   84:iload           4
    //   46   86:ifeq            104
    //   47   89:iload           6
    //   48   91:iload           7
    //   49   93:icmpeq          104
    //   50   96:aload_0         
    //   51   97:aload_0         
    //   52   98:getfield        #156 <Field int mSelectedTabIndex>
    //   53  101:invokevirtual   #159 <Method void setCurrentItem(int)>
    //   54  104:return          
    //   55  105:iconst_0        
    //   56  106:istore          4
    //   57  108:goto            14
    //   58  111:aload_0         
    //   59  112:iload_1         
    //   60  113:invokestatic    #196 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   61  116:iconst_2        
    //   62  117:idiv            
    //   63  118:putfield        #79  <Field int mMaxTabWidth>
    //   64  121:goto            66
    //   65  124:aload_0         
    //   66  125:iconst_m1       
    //   67  126:putfield        #79  <Field int mMaxTabWidth>
    //   68  129:goto            66
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #208 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //    7   17:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:fload_2         
    //    7   13:iload_3         
    //    8   14:invokeinterface #212 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //    9   19:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #159 <Method void setCurrentItem(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #215 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   10   22:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field ViewPager mViewPager>
    //    2    4:ifnonnull       17
    //    3    7:new             #217 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #219 <String "ViewPager has not been bound.">
    //    6   13:invokespecial   #222 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:iload_1         
    //   10   19:putfield        #156 <Field int mSelectedTabIndex>
    //   11   22:aload_0         
    //   12   23:getfield        #71  <Field ViewPager mViewPager>
    //   13   26:iload_1         
    //   14   27:invokevirtual   #223 <Method void ViewPager.setCurrentItem(int)>
    //   15   30:aload_0         
    //   16   31:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //   17   34:invokevirtual   #191 <Method int IcsLinearLayout.getChildCount()>
    //   18   37:istore_2        
    //   19   38:iconst_0        
    //   20   39:istore_3        
    //   21   40:iload_3         
    //   22   41:iload_2         
    //   23   42:icmplt          46
    //   24   45:return          
    //   25   46:aload_0         
    //   26   47:getfield        #58  <Field IcsLinearLayout mTabLayout>
    //   27   50:iload_3         
    //   28   51:invokevirtual   #124 <Method View IcsLinearLayout.getChildAt(int)>
    //   29   54:astore          4
    //   30   56:iload_3         
    //   31   57:iload_1         
    //   32   58:icmpne          87
    //   33   61:iconst_1        
    //   34   62:istore          5
    //   35   64:aload           4
    //   36   66:iload           5
    //   37   68:invokevirtual   #228 <Method void View.setSelected(boolean)>
    //   38   71:iload           5
    //   39   73:ifeq            81
    //   40   76:aload_0         
    //   41   77:iload_1         
    //   42   78:invokespecial   #230 <Method void animateToTab(int)>
    //   43   81:iinc            3  1
    //   44   84:goto            40
    //   45   87:iconst_0        
    //   46   88:istore          5
    //   47   90:goto            64
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #204 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setOnTabReselectedListener(OnTabReselectedListener ontabreselectedlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #75  <Field TabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    3    5:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #71  <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #71  <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #238 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #146 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       41
    //   15   31:new             #217 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc1            #240 <String "ViewPager does not have adapter instance.">
    //   18   37:invokespecial   #222 <Method void IllegalStateException(String)>
    //   19   40:athrow          
    //   20   41:aload_0         
    //   21   42:aload_1         
    //   22   43:putfield        #71  <Field ViewPager mViewPager>
    //   23   46:aload_1         
    //   24   47:aload_0         
    //   25   48:invokevirtual   #238 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   26   51:aload_0         
    //   27   52:invokevirtual   #242 <Method void notifyDataSetChanged()>
    //   28   55:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #245 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #159 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static final CharSequence EMPTY_TITLE;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final android.view.View.OnClickListener mTabClickListener;
    private final IcsLinearLayout mTabLayout;
    private OnTabReselectedListener mTabReselectedListener;
    private Runnable mTabSelector;
    private ViewPager mViewPager;

    static ViewPager access$0(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field ViewPager mViewPager>
    //    2    4:areturn         
    }

    static OnTabReselectedListener access$1(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    2    4:areturn         
    }

    static int access$2(TabPageIndicator tabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field int mMaxTabWidth>
    //    2    4:ireturn         
    }

    static void access$3(TabPageIndicator tabpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #83  <Field Runnable mTabSelector>
    //    3    5:return          
    }

    // Unreferenced inner class com/viewpagerindicator/TabPageIndicator$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TabPageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #21  <Class TabPageIndicator$TabView>
        //    2    4:astore_2        
        //    3    5:aload_0         
        //    4    6:getfield        #14  <Field TabPageIndicator this$0>
        //    5    9:invokestatic    #25  <Method ViewPager TabPageIndicator.access$0(TabPageIndicator)>
        //    6   12:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
        //    7   15:istore_3        
        //    8   16:aload_2         
        //    9   17:invokevirtual   #34  <Method int TabPageIndicator$TabView.getIndex()>
        //   10   20:istore          4
        //   11   22:aload_0         
        //   12   23:getfield        #14  <Field TabPageIndicator this$0>
        //   13   26:invokestatic    #25  <Method ViewPager TabPageIndicator.access$0(TabPageIndicator)>
        //   14   29:iload           4
        //   15   31:invokevirtual   #38  <Method void ViewPager.setCurrentItem(int)>
        //   16   34:iload_3         
        //   17   35:iload           4
        //   18   37:icmpne          64
        //   19   40:aload_0         
        //   20   41:getfield        #14  <Field TabPageIndicator this$0>
        //   21   44:invokestatic    #42  <Method TabPageIndicator$OnTabReselectedListener TabPageIndicator.access$1(TabPageIndicator)>
        //   22   47:ifnull          64
        //   23   50:aload_0         
        //   24   51:getfield        #14  <Field TabPageIndicator this$0>
        //   25   54:invokestatic    #42  <Method TabPageIndicator$OnTabReselectedListener TabPageIndicator.access$1(TabPageIndicator)>
        //   26   57:iload           4
        //   27   59:invokeinterface #47  <Method void TabPageIndicator$OnTabReselectedListener.onTabReselected(int)>
        //   28   64:return          
        }

        final TabPageIndicator this$0;
    }


    // Unreferenced inner class com/viewpagerindicator/TabPageIndicator$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field TabPageIndicator this$0>
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
        //    4    8:getfield        #19  <Field TabPageIndicator this$0>
        //    5   11:invokevirtual   #34  <Method int TabPageIndicator.getWidth()>
        //    6   14:aload_0         
        //    7   15:getfield        #21  <Field View val$tabView>
        //    8   18:invokevirtual   #35  <Method int View.getWidth()>
        //    9   21:isub            
        //   10   22:iconst_2        
        //   11   23:idiv            
        //   12   24:isub            
        //   13   25:istore_1        
        //   14   26:aload_0         
        //   15   27:getfield        #19  <Field TabPageIndicator this$0>
        //   16   30:iload_1         
        //   17   31:iconst_0        
        //   18   32:invokevirtual   #39  <Method void TabPageIndicator.smoothScrollTo(int, int)>
        //   19   35:aload_0         
        //   20   36:getfield        #19  <Field TabPageIndicator this$0>
        //   21   39:aconst_null     
        //   22   40:invokestatic    #43  <Method void TabPageIndicator.access$3(TabPageIndicator, Runnable)>
        //   23   43:return          
        }

        final TabPageIndicator this$0;
        private final View val$tabView;
    }

}
