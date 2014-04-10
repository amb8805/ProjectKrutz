// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import com.viewpagerindicator.PageIndicator;

public class el7rTabPageIndicator extends HorizontalScrollView
    implements PageIndicator
{
    public static interface OnTabReselectedListener
    {

        public abstract void onTabReselected(int i);
    }

    private class TabView extends TextView
    {

        public TabView(Context context1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field el7rTabPageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:aconst_null     
        //    6    8:ldc1            #13  <Int 0x7f01006e>
        //    7   10:invokespecial   #16  <Method void TextView(Context, AttributeSet, int)>
        //    8   13:return          
        }

        static void access$0(TabView tabview, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #20  <Field int mIndex>
        //    3    5:return          
// Previous instruction length mismatch
        //    4    0:aload_0         
        //    5    1:iload_1         
        //    6    2:putfield        #20  <Field int mIndex>
        //    7    5:return          
        }

        public int getIndex()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field int mIndex>
        //    2    4:ireturn         
        }

        public void onMeasure(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #26  <Method void TextView.onMeasure(int, int)>
        //    4    6:aload_0         
        //    5    7:getfield        #12  <Field el7rTabPageIndicator this$0>
        //    6   10:invokestatic    #32  <Method int el7rTabPageIndicator.access$2(el7rTabPageIndicator)>
        //    7   13:ifle            47
        //    8   16:aload_0         
        //    9   17:invokevirtual   #35  <Method int getMeasuredWidth()>
        //   10   20:aload_0         
        //   11   21:getfield        #12  <Field el7rTabPageIndicator this$0>
        //   12   24:invokestatic    #32  <Method int el7rTabPageIndicator.access$2(el7rTabPageIndicator)>
        //   13   27:icmple          47
        //   14   30:aload_0         
        //   15   31:aload_0         
        //   16   32:getfield        #12  <Field el7rTabPageIndicator this$0>
        //   17   35:invokestatic    #32  <Method int el7rTabPageIndicator.access$2(el7rTabPageIndicator)>
        //   18   38:ldc1            #36  <Int 0x40000000>
        //   19   40:invokestatic    #42  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
        //   20   43:iload_2         
        //   21   44:invokespecial   #26  <Method void TextView.onMeasure(int, int)>
        //   22   47:return          
        }

        private int mIndex;
        final el7rTabPageIndicator this$0;

        static void access$0(TabView tabview, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #20  <Field int mIndex>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:ldc1            #29  <String "">
    //    1    2:putstatic       #31  <Field CharSequence EMPTY_TITLE>
    //    2    5:return          
    }

    public el7rTabPageIndicator(Context context1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #36  <Method void el7rTabPageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public el7rTabPageIndicator(Context context1, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #37  <Method void HorizontalScrollView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aconst_null     
    //    6    8:putfield        #39  <Field Context context>
    //    7   11:aload_0         
    //    8   12:new             #41  <Class el7rTabPageIndicator$1>
    //    9   15:dup             
    //   10   16:aload_0         
    //   11   17:invokespecial   #44  <Method void el7rTabPageIndicator$1(el7rTabPageIndicator)>
    //   12   20:putfield        #46  <Field android.view.View$OnClickListener mTabClickListener>
    //   13   23:aload_0         
    //   14   24:iconst_0        
    //   15   25:invokevirtual   #50  <Method void setHorizontalScrollBarEnabled(boolean)>
    //   16   28:aload_0         
    //   17   29:new             #52  <Class LinearLayout>
    //   18   32:dup             
    //   19   33:aload_1         
    //   20   34:invokespecial   #54  <Method void LinearLayout(Context)>
    //   21   37:putfield        #56  <Field LinearLayout mTabLayout>
    //   22   40:aload_0         
    //   23   41:aload_0         
    //   24   42:getfield        #56  <Field LinearLayout mTabLayout>
    //   25   45:new             #58  <Class android.view.ViewGroup$LayoutParams>
    //   26   48:dup             
    //   27   49:bipush          -2
    //   28   51:iconst_m1       
    //   29   52:invokespecial   #61  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   30   55:invokevirtual   #65  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   31   58:aload_0         
    //   32   59:aload_1         
    //   33   60:putfield        #39  <Field Context context>
    //   34   63:return          
    }

    static ViewPager access$0(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field ViewPager mViewPager>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #69  <Field ViewPager mViewPager>
    //    5    4:areturn         
    }

    static OnTabReselectedListener access$1(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field el7rTabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #73  <Field el7rTabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    5    4:areturn         
    }

    static int access$2(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field int mMaxTabWidth>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #77  <Field int mMaxTabWidth>
    //    5    4:ireturn         
    }

    static void access$3(el7rTabPageIndicator el7rtabpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #81  <Field Runnable mTabSelector>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #81  <Field Runnable mTabSelector>
    //    7    5:return          
    }

    private void addTab(CharSequence charsequence, int i)
    {
    //    0    0:new             #85  <Class el7rTabPageIndicator$TabView>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #89  <Method Context getContext()>
    //    5    9:invokespecial   #92  <Method void el7rTabPageIndicator$TabView(el7rTabPageIndicator, Context)>
    //    6   12:astore_3        
    //    7   13:aload_3         
    //    8   14:iload_2         
    //    9   15:invokestatic    #95  <Method void el7rTabPageIndicator$TabView.access$0(el7rTabPageIndicator$TabView, int)>
    //   10   18:aload_3         
    //   11   19:iconst_1        
    //   12   20:invokevirtual   #98  <Method void el7rTabPageIndicator$TabView.setFocusable(boolean)>
    //   13   23:aload_3         
    //   14   24:aload_0         
    //   15   25:getfield        #46  <Field android.view.View$OnClickListener mTabClickListener>
    //   16   28:invokevirtual   #102 <Method void el7rTabPageIndicator$TabView.setOnClickListener(android.view.View$OnClickListener)>
    //   17   31:aload_3         
    //   18   32:aload_1         
    //   19   33:invokevirtual   #106 <Method void el7rTabPageIndicator$TabView.setText(CharSequence)>
    //   20   36:aload_3         
    //   21   37:ldc1            #107 <Float 13F>
    //   22   39:invokevirtual   #111 <Method void el7rTabPageIndicator$TabView.setTextSize(float)>
    //   23   42:aload_3         
    //   24   43:aload_0         
    //   25   44:getfield        #39  <Field Context context>
    //   26   47:invokevirtual   #117 <Method android.content.res.AssetManager Context.getAssets()>
    //   27   50:ldc1            #119 <String "fonts/roboto/roboto_l.ttf">
    //   28   52:invokestatic    #125 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
    //   29   55:invokevirtual   #129 <Method void el7rTabPageIndicator$TabView.setTypeface(Typeface)>
    //   30   58:aload_3         
    //   31   59:ldc1            #130 <Float 15F>
    //   32   61:invokevirtual   #111 <Method void el7rTabPageIndicator$TabView.setTextSize(float)>
    //   33   64:aload_0         
    //   34   65:getfield        #56  <Field LinearLayout mTabLayout>
    //   35   68:aload_3         
    //   36   69:new             #132 <Class android.widget.LinearLayout$LayoutParams>
    //   37   72:dup             
    //   38   73:iconst_0        
    //   39   74:iconst_m1       
    //   40   75:fconst_1        
    //   41   76:invokespecial   #135 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
    //   42   79:invokevirtual   #136 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
    //   43   82:return          
    }

    private void animateToTab(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field LinearLayout mTabLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #142 <Method View LinearLayout.getChildAt(int)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #81  <Field Runnable mTabSelector>
    //    7   13:ifnull          25
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #81  <Field Runnable mTabSelector>
    //   11   21:invokevirtual   #146 <Method boolean removeCallbacks(Runnable)>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:new             #148 <Class el7rTabPageIndicator$2>
    //   15   29:dup             
    //   16   30:aload_0         
    //   17   31:aload_2         
    //   18   32:invokespecial   #151 <Method void el7rTabPageIndicator$2(el7rTabPageIndicator, View)>
    //   19   35:putfield        #81  <Field Runnable mTabSelector>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #81  <Field Runnable mTabSelector>
    //   23   43:invokevirtual   #154 <Method boolean post(Runnable)>
    //   24   46:pop             
    //   25   47:return          
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field LinearLayout mTabLayout>
    //    2    4:invokevirtual   #158 <Method void LinearLayout.removeAllViews()>
    //    3    7:aload_0         
    //    4    8:getfield        #69  <Field ViewPager mViewPager>
    //    5   11:invokevirtual   #164 <Method PagerAdapter ViewPager.getAdapter()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:invokevirtual   #170 <Method int PagerAdapter.getCount()>
    //    9   19:istore_2        
    //   10   20:iconst_0        
    //   11   21:istore_3        
    //   12   22:iload_3         
    //   13   23:iload_2         
    //   14   24:icmplt          55
    //   15   27:aload_0         
    //   16   28:getfield        #172 <Field int mSelectedTabIndex>
    //   17   31:iload_2         
    //   18   32:icmple          42
    //   19   35:aload_0         
    //   20   36:iload_2         
    //   21   37:iconst_1        
    //   22   38:isub            
    //   23   39:putfield        #172 <Field int mSelectedTabIndex>
    //   24   42:aload_0         
    //   25   43:aload_0         
    //   26   44:getfield        #172 <Field int mSelectedTabIndex>
    //   27   47:invokevirtual   #175 <Method void setCurrentItem(int)>
    //   28   50:aload_0         
    //   29   51:invokevirtual   #178 <Method void requestLayout()>
    //   30   54:return          
    //   31   55:aload_1         
    //   32   56:iload_3         
    //   33   57:invokevirtual   #182 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //   34   60:astore          4
    //   35   62:aload           4
    //   36   64:ifnonnull       72
    //   37   67:getstatic       #31  <Field CharSequence EMPTY_TITLE>
    //   38   70:astore          4
    //   39   72:aload_0         
    //   40   73:aload           4
    //   41   75:iload_3         
    //   42   76:invokespecial   #184 <Method void addTab(CharSequence, int)>
    //   43   79:iinc            3  1
    //   44   82:goto            22
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #187 <Method void HorizontalScrollView.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #81  <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #81  <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #154 <Method boolean post(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #190 <Method void HorizontalScrollView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #81  <Field Runnable mTabSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #81  <Field Runnable mTabSelector>
    //    8   16:invokevirtual   #146 <Method boolean removeCallbacks(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #197 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_3         
    //    4    6:ldc1            #198 <Int 0x40000000>
    //    5    8:icmpne          105
    //    6   11:iconst_1        
    //    7   12:istore          4
    //    8   14:aload_0         
    //    9   15:iload           4
    //   10   17:invokevirtual   #201 <Method void setFillViewport(boolean)>
    //   11   20:aload_0         
    //   12   21:getfield        #56  <Field LinearLayout mTabLayout>
    //   13   24:invokevirtual   #204 <Method int LinearLayout.getChildCount()>
    //   14   27:istore          5
    //   15   29:iload           5
    //   16   31:iconst_1        
    //   17   32:icmple          124
    //   18   35:iload_3         
    //   19   36:ldc1            #198 <Int 0x40000000>
    //   20   38:icmpeq          47
    //   21   41:iload_3         
    //   22   42:ldc1            #205 <Int 0x80000000>
    //   23   44:icmpne          124
    //   24   47:iload           5
    //   25   49:iconst_2        
    //   26   50:icmple          111
    //   27   53:aload_0         
    //   28   54:ldc1            #206 <Float 0.4F>
    //   29   56:iload_1         
    //   30   57:invokestatic    #209 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   31   60:i2f             
    //   32   61:fmul            
    //   33   62:f2i             
    //   34   63:putfield        #77  <Field int mMaxTabWidth>
    //   35   66:aload_0         
    //   36   67:invokevirtual   #212 <Method int getMeasuredWidth()>
    //   37   70:istore          6
    //   38   72:aload_0         
    //   39   73:iload_1         
    //   40   74:iload_2         
    //   41   75:invokespecial   #214 <Method void HorizontalScrollView.onMeasure(int, int)>
    //   42   78:aload_0         
    //   43   79:invokevirtual   #212 <Method int getMeasuredWidth()>
    //   44   82:istore          7
    //   45   84:iload           4
    //   46   86:ifeq            104
    //   47   89:iload           6
    //   48   91:iload           7
    //   49   93:icmpeq          104
    //   50   96:aload_0         
    //   51   97:aload_0         
    //   52   98:getfield        #172 <Field int mSelectedTabIndex>
    //   53  101:invokevirtual   #175 <Method void setCurrentItem(int)>
    //   54  104:return          
    //   55  105:iconst_0        
    //   56  106:istore          4
    //   57  108:goto            14
    //   58  111:aload_0         
    //   59  112:iload_1         
    //   60  113:invokestatic    #209 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   61  116:iconst_2        
    //   62  117:idiv            
    //   63  118:putfield        #77  <Field int mMaxTabWidth>
    //   64  121:goto            66
    //   65  124:aload_0         
    //   66  125:iconst_m1       
    //   67  126:putfield        #77  <Field int mMaxTabWidth>
    //   68  129:goto            66
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #221 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //    7   17:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:fload_2         
    //    7   13:iload_3         
    //    8   14:invokeinterface #225 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //    9   19:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #175 <Method void setCurrentItem(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #228 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   10   22:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field ViewPager mViewPager>
    //    2    4:ifnonnull       17
    //    3    7:new             #230 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #232 <String "ViewPager has not been bound.">
    //    6   13:invokespecial   #235 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:iload_1         
    //   10   19:putfield        #172 <Field int mSelectedTabIndex>
    //   11   22:aload_0         
    //   12   23:getfield        #69  <Field ViewPager mViewPager>
    //   13   26:iload_1         
    //   14   27:invokevirtual   #236 <Method void ViewPager.setCurrentItem(int)>
    //   15   30:aload_0         
    //   16   31:getfield        #56  <Field LinearLayout mTabLayout>
    //   17   34:invokevirtual   #204 <Method int LinearLayout.getChildCount()>
    //   18   37:istore_2        
    //   19   38:iconst_0        
    //   20   39:istore_3        
    //   21   40:iload_3         
    //   22   41:iload_2         
    //   23   42:icmplt          46
    //   24   45:return          
    //   25   46:aload_0         
    //   26   47:getfield        #56  <Field LinearLayout mTabLayout>
    //   27   50:iload_3         
    //   28   51:invokevirtual   #142 <Method View LinearLayout.getChildAt(int)>
    //   29   54:astore          4
    //   30   56:iload_3         
    //   31   57:iload_1         
    //   32   58:icmpne          87
    //   33   61:iconst_1        
    //   34   62:istore          5
    //   35   64:aload           4
    //   36   66:iload           5
    //   37   68:invokevirtual   #241 <Method void View.setSelected(boolean)>
    //   38   71:iload           5
    //   39   73:ifeq            81
    //   40   76:aload_0         
    //   41   77:iload_1         
    //   42   78:invokespecial   #243 <Method void animateToTab(int)>
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
    //    2    2:putfield        #217 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setOnTabReselectedListener(OnTabReselectedListener ontabreselectedlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #73  <Field el7rTabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    3    5:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #69  <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #69  <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #251 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #164 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       41
    //   15   31:new             #230 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc1            #253 <String "ViewPager does not have adapter instance.">
    //   18   37:invokespecial   #235 <Method void IllegalStateException(String)>
    //   19   40:athrow          
    //   20   41:aload_0         
    //   21   42:aload_1         
    //   22   43:putfield        #69  <Field ViewPager mViewPager>
    //   23   46:aload_1         
    //   24   47:aload_0         
    //   25   48:invokevirtual   #251 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   26   51:aload_0         
    //   27   52:invokevirtual   #255 <Method void notifyDataSetChanged()>
    //   28   55:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #258 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #175 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static final CharSequence EMPTY_TITLE;
    Context context;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final android.view.View.OnClickListener mTabClickListener;
    private final LinearLayout mTabLayout;
    private OnTabReselectedListener mTabReselectedListener;
    private Runnable mTabSelector;
    private ViewPager mViewPager;

    static ViewPager access$0(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field ViewPager mViewPager>
    //    2    4:areturn         
    }

    static OnTabReselectedListener access$1(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field el7rTabPageIndicator$OnTabReselectedListener mTabReselectedListener>
    //    2    4:areturn         
    }

    static int access$2(el7rTabPageIndicator el7rtabpageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field int mMaxTabWidth>
    //    2    4:ireturn         
    }

    static void access$3(el7rTabPageIndicator el7rtabpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #81  <Field Runnable mTabSelector>
    //    3    5:return          
    }

    // Unreferenced inner class codeadore/textgram/custom_widgets/el7rTabPageIndicator$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field el7rTabPageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:checkcast       #21  <Class el7rTabPageIndicator$TabView>
        //    2    4:astore_2        
        //    3    5:aload_0         
        //    4    6:getfield        #14  <Field el7rTabPageIndicator this$0>
        //    5    9:invokestatic    #25  <Method ViewPager el7rTabPageIndicator.access$0(el7rTabPageIndicator)>
        //    6   12:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
        //    7   15:istore_3        
        //    8   16:aload_2         
        //    9   17:invokevirtual   #34  <Method int el7rTabPageIndicator$TabView.getIndex()>
        //   10   20:istore          4
        //   11   22:aload_0         
        //   12   23:getfield        #14  <Field el7rTabPageIndicator this$0>
        //   13   26:invokestatic    #25  <Method ViewPager el7rTabPageIndicator.access$0(el7rTabPageIndicator)>
        //   14   29:iload           4
        //   15   31:invokevirtual   #38  <Method void ViewPager.setCurrentItem(int)>
        //   16   34:iload_3         
        //   17   35:iload           4
        //   18   37:icmpne          64
        //   19   40:aload_0         
        //   20   41:getfield        #14  <Field el7rTabPageIndicator this$0>
        //   21   44:invokestatic    #42  <Method el7rTabPageIndicator$OnTabReselectedListener el7rTabPageIndicator.access$1(el7rTabPageIndicator)>
        //   22   47:ifnull          64
        //   23   50:aload_0         
        //   24   51:getfield        #14  <Field el7rTabPageIndicator this$0>
        //   25   54:invokestatic    #42  <Method el7rTabPageIndicator$OnTabReselectedListener el7rTabPageIndicator.access$1(el7rTabPageIndicator)>
        //   26   57:iload           4
        //   27   59:invokeinterface #47  <Method void el7rTabPageIndicator$OnTabReselectedListener.onTabReselected(int)>
        //   28   64:return          
        }

        final el7rTabPageIndicator this$0;
    }


    // Unreferenced inner class codeadore/textgram/custom_widgets/el7rTabPageIndicator$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field el7rTabPageIndicator this$0>
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
        //    4    8:getfield        #19  <Field el7rTabPageIndicator this$0>
        //    5   11:invokevirtual   #34  <Method int el7rTabPageIndicator.getWidth()>
        //    6   14:aload_0         
        //    7   15:getfield        #21  <Field View val$tabView>
        //    8   18:invokevirtual   #35  <Method int View.getWidth()>
        //    9   21:isub            
        //   10   22:iconst_2        
        //   11   23:idiv            
        //   12   24:isub            
        //   13   25:istore_1        
        //   14   26:aload_0         
        //   15   27:getfield        #19  <Field el7rTabPageIndicator this$0>
        //   16   30:iload_1         
        //   17   31:iconst_0        
        //   18   32:invokevirtual   #39  <Method void el7rTabPageIndicator.smoothScrollTo(int, int)>
        //   19   35:aload_0         
        //   20   36:getfield        #19  <Field el7rTabPageIndicator this$0>
        //   21   39:aconst_null     
        //   22   40:invokestatic    #43  <Method void el7rTabPageIndicator.access$3(el7rTabPageIndicator, Runnable)>
        //   23   43:return          
        }

        final el7rTabPageIndicator this$0;
        private final View val$tabView;
    }

}
