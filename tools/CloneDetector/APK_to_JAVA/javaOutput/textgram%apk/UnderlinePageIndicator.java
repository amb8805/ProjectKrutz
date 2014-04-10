// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator

public class UnderlinePageIndicator extends View
    implements PageIndicator
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class UnderlinePageIndicator$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void UnderlinePageIndicator$SavedState$1()>
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
        //    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
        //    6   10:putfield        #29  <Field int currentPage>
        //    7   13:return          
        }

        SavedState(Parcel parcel, SavedState savedstate)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #31  <Method void UnderlinePageIndicator$SavedState(Parcel)>
        //    3    5:return          
        }

        public SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #34  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #38  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #29  <Field int currentPage>
        //    7   11:invokevirtual   #42  <Method void Parcel.writeInt(int)>
        //    8   14:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int currentPage;
    }


    public UnderlinePageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #37  <Method void UnderlinePageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #42  <Field int R$attr.vpiUnderlinePageIndicatorStyle>
    //    4    6:invokespecial   #45  <Method void UnderlinePageIndicator(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #46  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:new             #48  <Class Paint>
    //    7   11:dup             
    //    8   12:iconst_1        
    //    9   13:invokespecial   #51  <Method void Paint(int)>
    //   10   16:putfield        #53  <Field Paint mPaint>
    //   11   19:aload_0         
    //   12   20:ldc1            #54  <Float -1F>
    //   13   22:putfield        #56  <Field float mLastMotionX>
    //   14   25:aload_0         
    //   15   26:iconst_m1       
    //   16   27:putfield        #58  <Field int mActivePointerId>
    //   17   30:aload_0         
    //   18   31:new             #60  <Class UnderlinePageIndicator$1>
    //   19   34:dup             
    //   20   35:aload_0         
    //   21   36:invokespecial   #63  <Method void UnderlinePageIndicator$1(UnderlinePageIndicator)>
    //   22   39:putfield        #65  <Field Runnable mFadeRunnable>
    //   23   42:aload_0         
    //   24   43:invokevirtual   #69  <Method boolean isInEditMode()>
    //   25   46:ifeq            50
    //   26   49:return          
    //   27   50:aload_0         
    //   28   51:invokevirtual   #73  <Method Resources getResources()>
    //   29   54:astore          4
    //   30   56:aload           4
    //   31   58:getstatic       #78  <Field int R$bool.default_underline_indicator_fades>
    //   32   61:invokevirtual   #84  <Method boolean Resources.getBoolean(int)>
    //   33   64:istore          5
    //   34   66:aload           4
    //   35   68:getstatic       #89  <Field int R$integer.default_underline_indicator_fade_delay>
    //   36   71:invokevirtual   #93  <Method int Resources.getInteger(int)>
    //   37   74:istore          6
    //   38   76:aload           4
    //   39   78:getstatic       #96  <Field int R$integer.default_underline_indicator_fade_length>
    //   40   81:invokevirtual   #93  <Method int Resources.getInteger(int)>
    //   41   84:istore          7
    //   42   86:aload           4
    //   43   88:getstatic       #101 <Field int R$color.default_underline_indicator_selected_color>
    //   44   91:invokevirtual   #104 <Method int Resources.getColor(int)>
    //   45   94:istore          8
    //   46   96:aload_1         
    //   47   97:aload_2         
    //   48   98:getstatic       #110 <Field int[] R$styleable.UnderlinePageIndicator>
    //   49  101:iload_3         
    //   50  102:iconst_0        
    //   51  103:invokevirtual   #116 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   52  106:astore          9
    //   53  108:aload_0         
    //   54  109:aload           9
    //   55  111:iconst_2        
    //   56  112:iload           5
    //   57  114:invokevirtual   #121 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   58  117:invokevirtual   #125 <Method void setFades(boolean)>
    //   59  120:aload_0         
    //   60  121:aload           9
    //   61  123:iconst_1        
    //   62  124:iload           8
    //   63  126:invokevirtual   #128 <Method int TypedArray.getColor(int, int)>
    //   64  129:invokevirtual   #131 <Method void setSelectedColor(int)>
    //   65  132:aload_0         
    //   66  133:aload           9
    //   67  135:iconst_3        
    //   68  136:iload           6
    //   69  138:invokevirtual   #133 <Method int TypedArray.getInteger(int, int)>
    //   70  141:invokevirtual   #136 <Method void setFadeDelay(int)>
    //   71  144:aload_0         
    //   72  145:aload           9
    //   73  147:iconst_4        
    //   74  148:iload           7
    //   75  150:invokevirtual   #133 <Method int TypedArray.getInteger(int, int)>
    //   76  153:invokevirtual   #139 <Method void setFadeLength(int)>
    //   77  156:aload           9
    //   78  158:iconst_0        
    //   79  159:invokevirtual   #143 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
    //   80  162:astore          10
    //   81  164:aload           10
    //   82  166:ifnull          175
    //   83  169:aload_0         
    //   84  170:aload           10
    //   85  172:invokevirtual   #147 <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
    //   86  175:aload           9
    //   87  177:invokevirtual   #151 <Method void TypedArray.recycle()>
    //   88  180:aload_0         
    //   89  181:aload_1         
    //   90  182:invokestatic    #157 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   91  185:invokestatic    #163 <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //   92  188:putfield        #165 <Field int mTouchSlop>
    //   93  191:return          
    }

    static boolean access$0(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #169 <Field boolean mFades>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #169 <Field boolean mFades>
    //    5    4:ireturn         
    }

    static Paint access$1(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Paint mPaint>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #53  <Field Paint mPaint>
    //    5    4:areturn         
    }

    static int access$2(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field int mFadeBy>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #175 <Field int mFadeBy>
    //    5    4:ireturn         
    }

    static Runnable access$3(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field Runnable mFadeRunnable>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #65  <Field Runnable mFadeRunnable>
    //    5    4:areturn         
    }

    public int getFadeDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #181 <Field int mFadeDelay>
    //    2    4:ireturn         
    }

    public int getFadeLength()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #184 <Field int mFadeLength>
    //    2    4:ireturn         
    }

    public boolean getFades()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #169 <Field boolean mFades>
    //    2    4:ireturn         
    }

    public int getSelectedColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Paint mPaint>
    //    2    4:invokevirtual   #188 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #192 <Method void invalidate()>
    //    2    4:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #196 <Method void View.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #198 <Field ViewPager mViewPager>
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #198 <Field ViewPager mViewPager>
    //    9   17:invokevirtual   #204 <Method PagerAdapter ViewPager.getAdapter()>
    //   10   20:invokevirtual   #209 <Method int PagerAdapter.getCount()>
    //   11   23:istore_2        
    //   12   24:iload_2         
    //   13   25:ifeq            12
    //   14   28:aload_0         
    //   15   29:getfield        #211 <Field int mCurrentPage>
    //   16   32:iload_2         
    //   17   33:icmplt          44
    //   18   36:aload_0         
    //   19   37:iload_2         
    //   20   38:iconst_1        
    //   21   39:isub            
    //   22   40:invokevirtual   #214 <Method void setCurrentItem(int)>
    //   23   43:return          
    //   24   44:aload_0         
    //   25   45:invokevirtual   #217 <Method int getPaddingLeft()>
    //   26   48:istore_3        
    //   27   49:aload_0         
    //   28   50:invokevirtual   #220 <Method int getWidth()>
    //   29   53:iload_3         
    //   30   54:isub            
    //   31   55:aload_0         
    //   32   56:invokevirtual   #223 <Method int getPaddingRight()>
    //   33   59:isub            
    //   34   60:i2f             
    //   35   61:fconst_1        
    //   36   62:iload_2         
    //   37   63:i2f             
    //   38   64:fmul            
    //   39   65:fdiv            
    //   40   66:fstore          4
    //   41   68:iload_3         
    //   42   69:i2f             
    //   43   70:fload           4
    //   44   72:aload_0         
    //   45   73:getfield        #211 <Field int mCurrentPage>
    //   46   76:i2f             
    //   47   77:aload_0         
    //   48   78:getfield        #225 <Field float mPositionOffset>
    //   49   81:fadd            
    //   50   82:fmul            
    //   51   83:fadd            
    //   52   84:fstore          5
    //   53   86:fload           5
    //   54   88:fload           4
    //   55   90:fadd            
    //   56   91:fstore          6
    //   57   93:aload_1         
    //   58   94:fload           5
    //   59   96:aload_0         
    //   60   97:invokevirtual   #228 <Method int getPaddingTop()>
    //   61  100:i2f             
    //   62  101:fload           6
    //   63  103:aload_0         
    //   64  104:invokevirtual   #231 <Method int getHeight()>
    //   65  107:aload_0         
    //   66  108:invokevirtual   #234 <Method int getPaddingBottom()>
    //   67  111:isub            
    //   68  112:i2f             
    //   69  113:aload_0         
    //   70  114:getfield        #53  <Field Paint mPaint>
    //   71  117:invokevirtual   #240 <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //   72  120:return          
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #243 <Field int mScrollState>
    //    3    5:aload_0         
    //    4    6:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #249 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //   10   22:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #211 <Field int mCurrentPage>
    //    3    5:aload_0         
    //    4    6:fload_2         
    //    5    7:putfield        #225 <Field float mPositionOffset>
    //    6   10:aload_0         
    //    7   11:getfield        #169 <Field boolean mFades>
    //    8   14:ifeq            40
    //    9   17:iload_3         
    //   10   18:ifle            64
    //   11   21:aload_0         
    //   12   22:aload_0         
    //   13   23:getfield        #65  <Field Runnable mFadeRunnable>
    //   14   26:invokevirtual   #255 <Method boolean removeCallbacks(Runnable)>
    //   15   29:pop             
    //   16   30:aload_0         
    //   17   31:getfield        #53  <Field Paint mPaint>
    //   18   34:sipush          255
    //   19   37:invokevirtual   #258 <Method void Paint.setAlpha(int)>
    //   20   40:aload_0         
    //   21   41:invokevirtual   #192 <Method void invalidate()>
    //   22   44:aload_0         
    //   23   45:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   24   48:ifnull          63
    //   25   51:aload_0         
    //   26   52:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   27   55:iload_1         
    //   28   56:fload_2         
    //   29   57:iload_3         
    //   30   58:invokeinterface #260 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //   31   63:return          
    //   32   64:aload_0         
    //   33   65:getfield        #243 <Field int mScrollState>
    //   34   68:iconst_1        
    //   35   69:icmpeq          40
    //   36   72:aload_0         
    //   37   73:aload_0         
    //   38   74:getfield        #65  <Field Runnable mFadeRunnable>
    //   39   77:aload_0         
    //   40   78:getfield        #181 <Field int mFadeDelay>
    //   41   81:i2l             
    //   42   82:invokevirtual   #264 <Method boolean postDelayed(Runnable, long)>
    //   43   85:pop             
    //   44   86:goto            40
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #243 <Field int mScrollState>
    //    2    4:ifne            30
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:putfield        #211 <Field int mCurrentPage>
    //    6   12:aload_0         
    //    7   13:fconst_0        
    //    8   14:putfield        #225 <Field float mPositionOffset>
    //    9   17:aload_0         
    //   10   18:invokevirtual   #192 <Method void invalidate()>
    //   11   21:aload_0         
    //   12   22:getfield        #65  <Field Runnable mFadeRunnable>
    //   13   25:invokeinterface #270 <Method void Runnable.run()>
    //   14   30:aload_0         
    //   15   31:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   16   34:ifnull          47
    //   17   37:aload_0         
    //   18   38:getfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   19   41:iload_1         
    //   20   42:invokeinterface #272 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   21   47:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #276 <Class UnderlinePageIndicator$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #280 <Method Parcelable UnderlinePageIndicator$SavedState.getSuperState()>
    //    6   10:invokespecial   #282 <Method void View.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #285 <Field int UnderlinePageIndicator$SavedState.currentPage>
    //   10   18:putfield        #211 <Field int mCurrentPage>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #288 <Method void requestLayout()>
    //   13   25:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #276 <Class UnderlinePageIndicator$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #291 <Method Parcelable View.onSaveInstanceState()>
    //    4    8:invokespecial   #293 <Method void UnderlinePageIndicator$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #211 <Field int mCurrentPage>
    //    9   17:putfield        #285 <Field int UnderlinePageIndicator$SavedState.currentPage>
    //   10   20:aload_1         
    //   11   21:areturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #297 <Method boolean View.onTouchEvent(MotionEvent)>
    //    3    5:ifeq            10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:aload_0         
    //    7   11:getfield        #198 <Field ViewPager mViewPager>
    //    8   14:ifnull          30
    //    9   17:aload_0         
    //   10   18:getfield        #198 <Field ViewPager mViewPager>
    //   11   21:invokevirtual   #204 <Method PagerAdapter ViewPager.getAdapter()>
    //   12   24:invokevirtual   #209 <Method int PagerAdapter.getCount()>
    //   13   27:ifne            32
    //   14   30:iconst_0        
    //   15   31:ireturn         
    //   16   32:sipush          255
    //   17   35:aload_1         
    //   18   36:invokevirtual   #302 <Method int MotionEvent.getAction()>
    //   19   39:iand            
    //   20   40:istore_2        
    //   21   41:iload_2         
    //   22   42:tableswitch     0 6: default 84
    //                   0 86
    //                   1 200
    //                   2 106
    //                   3 200
    //                   4 84
    //                   5 355
    //                   6 384
    //   23   84:iconst_1        
    //   24   85:ireturn         
    //   25   86:aload_0         
    //   26   87:aload_1         
    //   27   88:iconst_0        
    //   28   89:invokestatic    #308 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   29   92:putfield        #58  <Field int mActivePointerId>
    //   30   95:aload_0         
    //   31   96:aload_1         
    //   32   97:invokevirtual   #312 <Method float MotionEvent.getX()>
    //   33  100:putfield        #56  <Field float mLastMotionX>
    //   34  103:goto            84
    //   35  106:aload_1         
    //   36  107:aload_1         
    //   37  108:aload_0         
    //   38  109:getfield        #58  <Field int mActivePointerId>
    //   39  112:invokestatic    #315 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   40  115:invokestatic    #318 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   41  118:fstore          10
    //   42  120:fload           10
    //   43  122:aload_0         
    //   44  123:getfield        #56  <Field float mLastMotionX>
    //   45  126:fsub            
    //   46  127:fstore          11
    //   47  129:aload_0         
    //   48  130:getfield        #320 <Field boolean mIsDragging>
    //   49  133:ifne            155
    //   50  136:fload           11
    //   51  138:invokestatic    #326 <Method float Math.abs(float)>
    //   52  141:aload_0         
    //   53  142:getfield        #165 <Field int mTouchSlop>
    //   54  145:i2f             
    //   55  146:fcmpl           
    //   56  147:ifle            155
    //   57  150:aload_0         
    //   58  151:iconst_1        
    //   59  152:putfield        #320 <Field boolean mIsDragging>
    //   60  155:aload_0         
    //   61  156:getfield        #320 <Field boolean mIsDragging>
    //   62  159:ifeq            84
    //   63  162:aload_0         
    //   64  163:fload           10
    //   65  165:putfield        #56  <Field float mLastMotionX>
    //   66  168:aload_0         
    //   67  169:getfield        #198 <Field ViewPager mViewPager>
    //   68  172:invokevirtual   #329 <Method boolean ViewPager.isFakeDragging()>
    //   69  175:ifne            188
    //   70  178:aload_0         
    //   71  179:getfield        #198 <Field ViewPager mViewPager>
    //   72  182:invokevirtual   #332 <Method boolean ViewPager.beginFakeDrag()>
    //   73  185:ifeq            84
    //   74  188:aload_0         
    //   75  189:getfield        #198 <Field ViewPager mViewPager>
    //   76  192:fload           11
    //   77  194:invokevirtual   #336 <Method void ViewPager.fakeDragBy(float)>
    //   78  197:goto            84
    //   79  200:aload_0         
    //   80  201:getfield        #320 <Field boolean mIsDragging>
    //   81  204:ifne            325
    //   82  207:aload_0         
    //   83  208:getfield        #198 <Field ViewPager mViewPager>
    //   84  211:invokevirtual   #204 <Method PagerAdapter ViewPager.getAdapter()>
    //   85  214:invokevirtual   #209 <Method int PagerAdapter.getCount()>
    //   86  217:istore          6
    //   87  219:aload_0         
    //   88  220:invokevirtual   #220 <Method int getWidth()>
    //   89  223:istore          7
    //   90  225:iload           7
    //   91  227:i2f             
    //   92  228:fconst_2        
    //   93  229:fdiv            
    //   94  230:fstore          8
    //   95  232:iload           7
    //   96  234:i2f             
    //   97  235:ldc2            #337 <Float 6F>
    //   98  238:fdiv            
    //   99  239:fstore          9
    //  100  241:aload_0         
    //  101  242:getfield        #211 <Field int mCurrentPage>
    //  102  245:ifle            281
    //  103  248:aload_1         
    //  104  249:invokevirtual   #312 <Method float MotionEvent.getX()>
    //  105  252:fload           8
    //  106  254:fload           9
    //  107  256:fsub            
    //  108  257:fcmpg           
    //  109  258:ifge            281
    //  110  261:iload_2         
    //  111  262:iconst_3        
    //  112  263:icmpeq          279
    //  113  266:aload_0         
    //  114  267:getfield        #198 <Field ViewPager mViewPager>
    //  115  270:iconst_m1       
    //  116  271:aload_0         
    //  117  272:getfield        #211 <Field int mCurrentPage>
    //  118  275:iadd            
    //  119  276:invokevirtual   #338 <Method void ViewPager.setCurrentItem(int)>
    //  120  279:iconst_1        
    //  121  280:ireturn         
    //  122  281:aload_0         
    //  123  282:getfield        #211 <Field int mCurrentPage>
    //  124  285:iload           6
    //  125  287:iconst_1        
    //  126  288:isub            
    //  127  289:icmpge          325
    //  128  292:aload_1         
    //  129  293:invokevirtual   #312 <Method float MotionEvent.getX()>
    //  130  296:fload           8
    //  131  298:fload           9
    //  132  300:fadd            
    //  133  301:fcmpl           
    //  134  302:ifle            325
    //  135  305:iload_2         
    //  136  306:iconst_3        
    //  137  307:icmpeq          323
    //  138  310:aload_0         
    //  139  311:getfield        #198 <Field ViewPager mViewPager>
    //  140  314:iconst_1        
    //  141  315:aload_0         
    //  142  316:getfield        #211 <Field int mCurrentPage>
    //  143  319:iadd            
    //  144  320:invokevirtual   #338 <Method void ViewPager.setCurrentItem(int)>
    //  145  323:iconst_1        
    //  146  324:ireturn         
    //  147  325:aload_0         
    //  148  326:iconst_0        
    //  149  327:putfield        #320 <Field boolean mIsDragging>
    //  150  330:aload_0         
    //  151  331:iconst_m1       
    //  152  332:putfield        #58  <Field int mActivePointerId>
    //  153  335:aload_0         
    //  154  336:getfield        #198 <Field ViewPager mViewPager>
    //  155  339:invokevirtual   #329 <Method boolean ViewPager.isFakeDragging()>
    //  156  342:ifeq            84
    //  157  345:aload_0         
    //  158  346:getfield        #198 <Field ViewPager mViewPager>
    //  159  349:invokevirtual   #341 <Method void ViewPager.endFakeDrag()>
    //  160  352:goto            84
    //  161  355:aload_1         
    //  162  356:invokestatic    #345 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  163  359:istore          5
    //  164  361:aload_0         
    //  165  362:aload_1         
    //  166  363:iload           5
    //  167  365:invokestatic    #318 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  168  368:putfield        #56  <Field float mLastMotionX>
    //  169  371:aload_0         
    //  170  372:aload_1         
    //  171  373:iload           5
    //  172  375:invokestatic    #308 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  173  378:putfield        #58  <Field int mActivePointerId>
    //  174  381:goto            84
    //  175  384:aload_1         
    //  176  385:invokestatic    #345 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  177  388:istore_3        
    //  178  389:aload_1         
    //  179  390:iload_3         
    //  180  391:invokestatic    #308 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  181  394:aload_0         
    //  182  395:getfield        #58  <Field int mActivePointerId>
    //  183  398:icmpne          418
    //  184  401:iload_3         
    //  185  402:ifne            437
    //  186  405:iconst_1        
    //  187  406:istore          4
    //  188  408:aload_0         
    //  189  409:aload_1         
    //  190  410:iload           4
    //  191  412:invokestatic    #308 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  192  415:putfield        #58  <Field int mActivePointerId>
    //  193  418:aload_0         
    //  194  419:aload_1         
    //  195  420:aload_1         
    //  196  421:aload_0         
    //  197  422:getfield        #58  <Field int mActivePointerId>
    //  198  425:invokestatic    #315 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  199  428:invokestatic    #318 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  200  431:putfield        #56  <Field float mLastMotionX>
    //  201  434:goto            84
    //  202  437:iconst_0        
    //  203  438:istore          4
    //  204  440:goto            408
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #198 <Field ViewPager mViewPager>
    //    2    4:ifnonnull       18
    //    3    7:new             #347 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #349 <String "ViewPager has not been bound.">
    //    6   14:invokespecial   #352 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #198 <Field ViewPager mViewPager>
    //   10   22:iload_1         
    //   11   23:invokevirtual   #338 <Method void ViewPager.setCurrentItem(int)>
    //   12   26:aload_0         
    //   13   27:iload_1         
    //   14   28:putfield        #211 <Field int mCurrentPage>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #192 <Method void invalidate()>
    //   17   35:return          
    }

    public void setFadeDelay(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #181 <Field int mFadeDelay>
    //    3    5:return          
    }

    public void setFadeLength(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #184 <Field int mFadeLength>
    //    3    5:aload_0         
    //    4    6:sipush          255
    //    5    9:aload_0         
    //    6   10:getfield        #184 <Field int mFadeLength>
    //    7   13:bipush          30
    //    8   15:idiv            
    //    9   16:idiv            
    //   10   17:putfield        #175 <Field int mFadeBy>
    //   11   20:return          
    }

    public void setFades(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #169 <Field boolean mFades>
    //    3    5:icmpeq          26
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #169 <Field boolean mFades>
    //    7   13:iload_1         
    //    8   14:ifeq            27
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #65  <Field Runnable mFadeRunnable>
    //   12   22:invokevirtual   #355 <Method boolean post(Runnable)>
    //   13   25:pop             
    //   14   26:return          
    //   15   27:aload_0         
    //   16   28:aload_0         
    //   17   29:getfield        #65  <Field Runnable mFadeRunnable>
    //   18   32:invokevirtual   #255 <Method boolean removeCallbacks(Runnable)>
    //   19   35:pop             
    //   20   36:aload_0         
    //   21   37:getfield        #53  <Field Paint mPaint>
    //   22   40:sipush          255
    //   23   43:invokevirtual   #258 <Method void Paint.setAlpha(int)>
    //   24   46:aload_0         
    //   25   47:invokevirtual   #192 <Method void invalidate()>
    //   26   50:return          
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #245 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setSelectedColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Paint mPaint>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #360 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #192 <Method void invalidate()>
    //    6   12:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #198 <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #198 <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #198 <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #364 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #204 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       42
    //   15   31:new             #347 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc2            #366 <String "ViewPager does not have adapter instance.">
    //   18   38:invokespecial   #352 <Method void IllegalStateException(String)>
    //   19   41:athrow          
    //   20   42:aload_0         
    //   21   43:aload_1         
    //   22   44:putfield        #198 <Field ViewPager mViewPager>
    //   23   47:aload_0         
    //   24   48:getfield        #198 <Field ViewPager mViewPager>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #364 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   27   55:aload_0         
    //   28   56:invokevirtual   #192 <Method void invalidate()>
    //   29   59:aload_0         
    //   30   60:new             #368 <Class UnderlinePageIndicator$2>
    //   31   63:dup             
    //   32   64:aload_0         
    //   33   65:invokespecial   #369 <Method void UnderlinePageIndicator$2(UnderlinePageIndicator)>
    //   34   68:invokevirtual   #355 <Method boolean post(Runnable)>
    //   35   71:pop             
    //   36   72:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #372 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #214 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static final int FADE_FRAME_MS = 30;
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private int mCurrentPage;
    private int mFadeBy;
    private int mFadeDelay;
    private int mFadeLength;
    private final Runnable mFadeRunnable;
    private boolean mFades;
    private boolean mIsDragging;
    private float mLastMotionX;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private final Paint mPaint;
    private float mPositionOffset;
    private int mScrollState;
    private int mTouchSlop;
    private ViewPager mViewPager;

    static boolean access$0(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #169 <Field boolean mFades>
    //    2    4:ireturn         
    }

    static Paint access$1(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Paint mPaint>
    //    2    4:areturn         
    }

    static int access$2(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field int mFadeBy>
    //    2    4:ireturn         
    }

    static Runnable access$3(UnderlinePageIndicator underlinepageindicator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field Runnable mFadeRunnable>
    //    2    4:areturn         
    }

    // Unreferenced inner class com/viewpagerindicator/UnderlinePageIndicator$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field UnderlinePageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field UnderlinePageIndicator this$0>
        //    2    4:invokestatic    #22  <Method boolean UnderlinePageIndicator.access$0(UnderlinePageIndicator)>
        //    3    7:ifne            11
        //    4   10:return          
        //    5   11:aload_0         
        //    6   12:getfield        #14  <Field UnderlinePageIndicator this$0>
        //    7   15:invokestatic    #26  <Method Paint UnderlinePageIndicator.access$1(UnderlinePageIndicator)>
        //    8   18:invokevirtual   #32  <Method int Paint.getAlpha()>
        //    9   21:aload_0         
        //   10   22:getfield        #14  <Field UnderlinePageIndicator this$0>
        //   11   25:invokestatic    #36  <Method int UnderlinePageIndicator.access$2(UnderlinePageIndicator)>
        //   12   28:isub            
        //   13   29:iconst_0        
        //   14   30:invokestatic    #42  <Method int Math.max(int, int)>
        //   15   33:istore_1        
        //   16   34:aload_0         
        //   17   35:getfield        #14  <Field UnderlinePageIndicator this$0>
        //   18   38:invokestatic    #26  <Method Paint UnderlinePageIndicator.access$1(UnderlinePageIndicator)>
        //   19   41:iload_1         
        //   20   42:invokevirtual   #46  <Method void Paint.setAlpha(int)>
        //   21   45:aload_0         
        //   22   46:getfield        #14  <Field UnderlinePageIndicator this$0>
        //   23   49:invokevirtual   #49  <Method void UnderlinePageIndicator.invalidate()>
        //   24   52:iload_1         
        //   25   53:ifle            10
        //   26   56:aload_0         
        //   27   57:getfield        #14  <Field UnderlinePageIndicator this$0>
        //   28   60:aload_0         
        //   29   61:ldc2w           #50  <Long 30L>
        //   30   64:invokevirtual   #55  <Method boolean UnderlinePageIndicator.postDelayed(Runnable, long)>
        //   31   67:pop             
        //   32   68:return          
        }

        final UnderlinePageIndicator this$0;
    }


    // Unreferenced inner class com/viewpagerindicator/UnderlinePageIndicator$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field UnderlinePageIndicator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field UnderlinePageIndicator this$0>
        //    2    4:invokestatic    #25  <Method boolean UnderlinePageIndicator.access$0(UnderlinePageIndicator)>
        //    3    7:ifeq            25
        //    4   10:aload_0         
        //    5   11:getfield        #17  <Field UnderlinePageIndicator this$0>
        //    6   14:aload_0         
        //    7   15:getfield        #17  <Field UnderlinePageIndicator this$0>
        //    8   18:invokestatic    #29  <Method Runnable UnderlinePageIndicator.access$3(UnderlinePageIndicator)>
        //    9   21:invokevirtual   #33  <Method boolean UnderlinePageIndicator.post(Runnable)>
        //   10   24:pop             
        //   11   25:return          
        }

        final UnderlinePageIndicator this$0;
    }


    // Unreferenced inner class com/viewpagerindicator/UnderlinePageIndicator$SavedState$1

/* anonymous class */
    class SavedState._cls1
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
        //    0    0:new             #9   <Class UnderlinePageIndicator$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void UnderlinePageIndicator$SavedState(Parcel, UnderlinePageIndicator$SavedState)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method UnderlinePageIndicator$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method UnderlinePageIndicator$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
