// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator, IcsLinearLayout, IconPagerAdapter

public class IconPageIndicator extends HorizontalScrollView
    implements PageIndicator
{

    public IconPageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #21  <Method void IconPageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public IconPageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #22  <Method void HorizontalScrollView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #26  <Method void setHorizontalScrollBarEnabled(boolean)>
    //    7   11:aload_0         
    //    8   12:new             #28  <Class IcsLinearLayout>
    //    9   15:dup             
    //   10   16:aload_1         
    //   11   17:getstatic       #33  <Field int R$attr.vpiIconPageIndicatorStyle>
    //   12   20:invokespecial   #36  <Method void IcsLinearLayout(Context, int)>
    //   13   23:putfield        #38  <Field IcsLinearLayout mIconsLayout>
    //   14   26:aload_0         
    //   15   27:aload_0         
    //   16   28:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //   17   31:new             #40  <Class android.widget.FrameLayout$LayoutParams>
    //   18   34:dup             
    //   19   35:bipush          -2
    //   20   37:iconst_m1       
    //   21   38:bipush          17
    //   22   40:invokespecial   #43  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
    //   23   43:invokevirtual   #47  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   24   46:return          
    }

    static void access$0(IconPageIndicator iconpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #51  <Field Runnable mIconSelector>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #51  <Field Runnable mIconSelector>
    //    7    5:return          
    }

    private void animateToIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #57  <Method View IcsLinearLayout.getChildAt(int)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #51  <Field Runnable mIconSelector>
    //    7   13:ifnull          25
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #51  <Field Runnable mIconSelector>
    //   11   21:invokevirtual   #61  <Method boolean removeCallbacks(Runnable)>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:new             #63  <Class IconPageIndicator$1>
    //   15   29:dup             
    //   16   30:aload_0         
    //   17   31:aload_2         
    //   18   32:invokespecial   #66  <Method void IconPageIndicator$1(IconPageIndicator, View)>
    //   19   35:putfield        #51  <Field Runnable mIconSelector>
    //   20   38:aload_0         
    //   21   39:aload_0         
    //   22   40:getfield        #51  <Field Runnable mIconSelector>
    //   23   43:invokevirtual   #69  <Method boolean post(Runnable)>
    //   24   46:pop             
    //   25   47:return          
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //    2    4:invokevirtual   #74  <Method void IcsLinearLayout.removeAllViews()>
    //    3    7:aload_0         
    //    4    8:getfield        #76  <Field ViewPager mViewPager>
    //    5   11:invokevirtual   #82  <Method android.support.v4.view.PagerAdapter ViewPager.getAdapter()>
    //    6   14:checkcast       #84  <Class IconPagerAdapter>
    //    7   17:astore_1        
    //    8   18:aload_1         
    //    9   19:invokeinterface #88  <Method int IconPagerAdapter.getCount()>
    //   10   24:istore_2        
    //   11   25:iconst_0        
    //   12   26:istore_3        
    //   13   27:iload_3         
    //   14   28:iload_2         
    //   15   29:icmplt          60
    //   16   32:aload_0         
    //   17   33:getfield        #90  <Field int mSelectedIndex>
    //   18   36:iload_2         
    //   19   37:icmple          47
    //   20   40:aload_0         
    //   21   41:iload_2         
    //   22   42:iconst_1        
    //   23   43:isub            
    //   24   44:putfield        #90  <Field int mSelectedIndex>
    //   25   47:aload_0         
    //   26   48:aload_0         
    //   27   49:getfield        #90  <Field int mSelectedIndex>
    //   28   52:invokevirtual   #93  <Method void setCurrentItem(int)>
    //   29   55:aload_0         
    //   30   56:invokevirtual   #96  <Method void requestLayout()>
    //   31   59:return          
    //   32   60:new             #98  <Class ImageView>
    //   33   63:dup             
    //   34   64:aload_0         
    //   35   65:invokevirtual   #102 <Method Context getContext()>
    //   36   68:aconst_null     
    //   37   69:getstatic       #33  <Field int R$attr.vpiIconPageIndicatorStyle>
    //   38   72:invokespecial   #105 <Method void ImageView(Context, AttributeSet, int)>
    //   39   75:astore          4
    //   40   77:aload           4
    //   41   79:aload_1         
    //   42   80:iload_3         
    //   43   81:invokeinterface #109 <Method int IconPagerAdapter.getIconResId(int)>
    //   44   86:invokevirtual   #112 <Method void ImageView.setImageResource(int)>
    //   45   89:aload_0         
    //   46   90:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //   47   93:aload           4
    //   48   95:invokevirtual   #115 <Method void IcsLinearLayout.addView(View)>
    //   49   98:iinc            3  1
    //   50  101:goto            27
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #118 <Method void HorizontalScrollView.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #51  <Field Runnable mIconSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #51  <Field Runnable mIconSelector>
    //    8   16:invokevirtual   #69  <Method boolean post(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #121 <Method void HorizontalScrollView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #51  <Field Runnable mIconSelector>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #51  <Field Runnable mIconSelector>
    //    8   16:invokevirtual   #61  <Method boolean removeCallbacks(Runnable)>
    //    9   19:pop             
    //   10   20:return          
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #128 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //    7   17:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:fload_2         
    //    7   13:iload_3         
    //    8   14:invokeinterface #132 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //    9   19:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #93  <Method void setCurrentItem(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #135 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   10   22:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ViewPager mViewPager>
    //    2    4:ifnonnull       17
    //    3    7:new             #137 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #139 <String "ViewPager has not been bound.">
    //    6   13:invokespecial   #142 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:iload_1         
    //   10   19:putfield        #90  <Field int mSelectedIndex>
    //   11   22:aload_0         
    //   12   23:getfield        #76  <Field ViewPager mViewPager>
    //   13   26:iload_1         
    //   14   27:invokevirtual   #143 <Method void ViewPager.setCurrentItem(int)>
    //   15   30:aload_0         
    //   16   31:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //   17   34:invokevirtual   #146 <Method int IcsLinearLayout.getChildCount()>
    //   18   37:istore_2        
    //   19   38:iconst_0        
    //   20   39:istore_3        
    //   21   40:iload_3         
    //   22   41:iload_2         
    //   23   42:icmplt          46
    //   24   45:return          
    //   25   46:aload_0         
    //   26   47:getfield        #38  <Field IcsLinearLayout mIconsLayout>
    //   27   50:iload_3         
    //   28   51:invokevirtual   #57  <Method View IcsLinearLayout.getChildAt(int)>
    //   29   54:astore          4
    //   30   56:iload_3         
    //   31   57:iload_1         
    //   32   58:icmpne          87
    //   33   61:iconst_1        
    //   34   62:istore          5
    //   35   64:aload           4
    //   36   66:iload           5
    //   37   68:invokevirtual   #151 <Method void View.setSelected(boolean)>
    //   38   71:iload           5
    //   39   73:ifeq            81
    //   40   76:aload_0         
    //   41   77:iload_1         
    //   42   78:invokespecial   #153 <Method void animateToIcon(int)>
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
    //    2    2:putfield        #124 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #76  <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #76  <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #159 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #82  <Method android.support.v4.view.PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       41
    //   15   31:new             #137 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc1            #161 <String "ViewPager does not have adapter instance.">
    //   18   37:invokespecial   #142 <Method void IllegalStateException(String)>
    //   19   40:athrow          
    //   20   41:aload_0         
    //   21   42:aload_1         
    //   22   43:putfield        #76  <Field ViewPager mViewPager>
    //   23   46:aload_1         
    //   24   47:aload_0         
    //   25   48:invokevirtual   #159 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   26   51:aload_0         
    //   27   52:invokevirtual   #163 <Method void notifyDataSetChanged()>
    //   28   55:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #166 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #93  <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private Runnable mIconSelector;
    private final IcsLinearLayout mIconsLayout;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private int mSelectedIndex;
    private ViewPager mViewPager;

    static void access$0(IconPageIndicator iconpageindicator, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #51  <Field Runnable mIconSelector>
    //    3    5:return          
    }

    // Unreferenced inner class com/viewpagerindicator/IconPageIndicator$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field IconPageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$iconView>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field View val$iconView>
        //    2    4:invokevirtual   #31  <Method int View.getLeft()>
        //    3    7:aload_0         
        //    4    8:getfield        #19  <Field IconPageIndicator this$0>
        //    5   11:invokevirtual   #34  <Method int IconPageIndicator.getWidth()>
        //    6   14:aload_0         
        //    7   15:getfield        #21  <Field View val$iconView>
        //    8   18:invokevirtual   #35  <Method int View.getWidth()>
        //    9   21:isub            
        //   10   22:iconst_2        
        //   11   23:idiv            
        //   12   24:isub            
        //   13   25:istore_1        
        //   14   26:aload_0         
        //   15   27:getfield        #19  <Field IconPageIndicator this$0>
        //   16   30:iload_1         
        //   17   31:iconst_0        
        //   18   32:invokevirtual   #39  <Method void IconPageIndicator.smoothScrollTo(int, int)>
        //   19   35:aload_0         
        //   20   36:getfield        #19  <Field IconPageIndicator this$0>
        //   21   39:aconst_null     
        //   22   40:invokestatic    #43  <Method void IconPageIndicator.access$0(IconPageIndicator, Runnable)>
        //   23   43:return          
        }

        final IconPageIndicator this$0;
        private final View val$iconView;
    }

}
