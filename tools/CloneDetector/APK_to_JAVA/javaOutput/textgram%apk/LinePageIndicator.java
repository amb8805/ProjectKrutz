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
import android.util.FloatMath;
import android.view.*;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator

public class LinePageIndicator extends View
    implements PageIndicator
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class LinePageIndicator$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void LinePageIndicator$SavedState$1()>
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
        //    2    2:invokespecial   #31  <Method void LinePageIndicator$SavedState(Parcel)>
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


    public LinePageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #31  <Method void LinePageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public LinePageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #36  <Field int R$attr.vpiLinePageIndicatorStyle>
    //    4    6:invokespecial   #39  <Method void LinePageIndicator(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public LinePageIndicator(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #40  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:new             #42  <Class Paint>
    //    7   11:dup             
    //    8   12:iconst_1        
    //    9   13:invokespecial   #45  <Method void Paint(int)>
    //   10   16:putfield        #47  <Field Paint mPaintUnselected>
    //   11   19:aload_0         
    //   12   20:new             #42  <Class Paint>
    //   13   23:dup             
    //   14   24:iconst_1        
    //   15   25:invokespecial   #45  <Method void Paint(int)>
    //   16   28:putfield        #49  <Field Paint mPaintSelected>
    //   17   31:aload_0         
    //   18   32:ldc1            #50  <Float -1F>
    //   19   34:putfield        #52  <Field float mLastMotionX>
    //   20   37:aload_0         
    //   21   38:iconst_m1       
    //   22   39:putfield        #54  <Field int mActivePointerId>
    //   23   42:aload_0         
    //   24   43:invokevirtual   #58  <Method boolean isInEditMode()>
    //   25   46:ifeq            50
    //   26   49:return          
    //   27   50:aload_0         
    //   28   51:invokevirtual   #62  <Method Resources getResources()>
    //   29   54:astore          4
    //   30   56:aload           4
    //   31   58:getstatic       #67  <Field int R$color.default_line_indicator_selected_color>
    //   32   61:invokevirtual   #73  <Method int Resources.getColor(int)>
    //   33   64:istore          5
    //   34   66:aload           4
    //   35   68:getstatic       #76  <Field int R$color.default_line_indicator_unselected_color>
    //   36   71:invokevirtual   #73  <Method int Resources.getColor(int)>
    //   37   74:istore          6
    //   38   76:aload           4
    //   39   78:getstatic       #81  <Field int R$dimen.default_line_indicator_line_width>
    //   40   81:invokevirtual   #85  <Method float Resources.getDimension(int)>
    //   41   84:fstore          7
    //   42   86:aload           4
    //   43   88:getstatic       #88  <Field int R$dimen.default_line_indicator_gap_width>
    //   44   91:invokevirtual   #85  <Method float Resources.getDimension(int)>
    //   45   94:fstore          8
    //   46   96:aload           4
    //   47   98:getstatic       #91  <Field int R$dimen.default_line_indicator_stroke_width>
    //   48  101:invokevirtual   #85  <Method float Resources.getDimension(int)>
    //   49  104:fstore          9
    //   50  106:aload           4
    //   51  108:getstatic       #96  <Field int R$bool.default_line_indicator_centered>
    //   52  111:invokevirtual   #100 <Method boolean Resources.getBoolean(int)>
    //   53  114:istore          10
    //   54  116:aload_1         
    //   55  117:aload_2         
    //   56  118:getstatic       #106 <Field int[] R$styleable.LinePageIndicator>
    //   57  121:iload_3         
    //   58  122:iconst_0        
    //   59  123:invokevirtual   #112 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   60  126:astore          11
    //   61  128:aload_0         
    //   62  129:aload           11
    //   63  131:iconst_1        
    //   64  132:iload           10
    //   65  134:invokevirtual   #117 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   66  137:putfield        #119 <Field boolean mCentered>
    //   67  140:aload_0         
    //   68  141:aload           11
    //   69  143:iconst_5        
    //   70  144:fload           7
    //   71  146:invokevirtual   #122 <Method float TypedArray.getDimension(int, float)>
    //   72  149:putfield        #124 <Field float mLineWidth>
    //   73  152:aload_0         
    //   74  153:aload           11
    //   75  155:bipush          6
    //   76  157:fload           8
    //   77  159:invokevirtual   #122 <Method float TypedArray.getDimension(int, float)>
    //   78  162:putfield        #126 <Field float mGapWidth>
    //   79  165:aload_0         
    //   80  166:aload           11
    //   81  168:iconst_3        
    //   82  169:fload           9
    //   83  171:invokevirtual   #122 <Method float TypedArray.getDimension(int, float)>
    //   84  174:invokevirtual   #130 <Method void setStrokeWidth(float)>
    //   85  177:aload_0         
    //   86  178:getfield        #47  <Field Paint mPaintUnselected>
    //   87  181:aload           11
    //   88  183:iconst_4        
    //   89  184:iload           6
    //   90  186:invokevirtual   #133 <Method int TypedArray.getColor(int, int)>
    //   91  189:invokevirtual   #136 <Method void Paint.setColor(int)>
    //   92  192:aload_0         
    //   93  193:getfield        #49  <Field Paint mPaintSelected>
    //   94  196:aload           11
    //   95  198:iconst_2        
    //   96  199:iload           5
    //   97  201:invokevirtual   #133 <Method int TypedArray.getColor(int, int)>
    //   98  204:invokevirtual   #136 <Method void Paint.setColor(int)>
    //   99  207:aload           11
    //  100  209:iconst_0        
    //  101  210:invokevirtual   #140 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
    //  102  213:astore          12
    //  103  215:aload           12
    //  104  217:ifnull          226
    //  105  220:aload_0         
    //  106  221:aload           12
    //  107  223:invokevirtual   #144 <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
    //  108  226:aload           11
    //  109  228:invokevirtual   #148 <Method void TypedArray.recycle()>
    //  110  231:aload_0         
    //  111  232:aload_1         
    //  112  233:invokestatic    #154 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //  113  236:invokestatic    #160 <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //  114  239:putfield        #162 <Field int mTouchSlop>
    //  115  242:return          
    }

    private int measureHeight(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #168 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_2        
    //    3    5:iload_1         
    //    4    6:invokestatic    #171 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ldc1            #172 <Int 0x40000000>
    //    8   13:icmpne          27
    //    9   16:iload_3         
    //   10   17:i2f             
    //   11   18:fstore          4
    //   12   20:fload           4
    //   13   22:invokestatic    #178 <Method float FloatMath.ceil(float)>
    //   14   25:f2i             
    //   15   26:ireturn         
    //   16   27:aload_0         
    //   17   28:getfield        #49  <Field Paint mPaintSelected>
    //   18   31:invokevirtual   #182 <Method float Paint.getStrokeWidth()>
    //   19   34:aload_0         
    //   20   35:invokevirtual   #186 <Method int getPaddingTop()>
    //   21   38:i2f             
    //   22   39:fadd            
    //   23   40:aload_0         
    //   24   41:invokevirtual   #189 <Method int getPaddingBottom()>
    //   25   44:i2f             
    //   26   45:fadd            
    //   27   46:fstore          4
    //   28   48:iload_2         
    //   29   49:ldc1            #190 <Int 0x80000000>
    //   30   51:icmpne          20
    //   31   54:fload           4
    //   32   56:iload_3         
    //   33   57:i2f             
    //   34   58:invokestatic    #196 <Method float Math.min(float, float)>
    //   35   61:fstore          4
    //   36   63:goto            20
    }

    private int measureWidth(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #168 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_2        
    //    3    5:iload_1         
    //    4    6:invokestatic    #171 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ldc1            #172 <Int 0x40000000>
    //    8   13:icmpeq          23
    //    9   16:aload_0         
    //   10   17:getfield        #199 <Field ViewPager mViewPager>
    //   11   20:ifnonnull       34
    //   12   23:iload_3         
    //   13   24:i2f             
    //   14   25:fstore          4
    //   15   27:fload           4
    //   16   29:invokestatic    #178 <Method float FloatMath.ceil(float)>
    //   17   32:f2i             
    //   18   33:ireturn         
    //   19   34:aload_0         
    //   20   35:getfield        #199 <Field ViewPager mViewPager>
    //   21   38:invokevirtual   #205 <Method PagerAdapter ViewPager.getAdapter()>
    //   22   41:invokevirtual   #210 <Method int PagerAdapter.getCount()>
    //   23   44:istore          5
    //   24   46:aload_0         
    //   25   47:invokevirtual   #213 <Method int getPaddingLeft()>
    //   26   50:aload_0         
    //   27   51:invokevirtual   #216 <Method int getPaddingRight()>
    //   28   54:iadd            
    //   29   55:i2f             
    //   30   56:iload           5
    //   31   58:i2f             
    //   32   59:aload_0         
    //   33   60:getfield        #124 <Field float mLineWidth>
    //   34   63:fmul            
    //   35   64:fadd            
    //   36   65:iload           5
    //   37   67:iconst_1        
    //   38   68:isub            
    //   39   69:i2f             
    //   40   70:aload_0         
    //   41   71:getfield        #126 <Field float mGapWidth>
    //   42   74:fmul            
    //   43   75:fadd            
    //   44   76:fstore          4
    //   45   78:iload_2         
    //   46   79:ldc1            #190 <Int 0x80000000>
    //   47   81:icmpne          27
    //   48   84:fload           4
    //   49   86:iload_3         
    //   50   87:i2f             
    //   51   88:invokestatic    #196 <Method float Math.min(float, float)>
    //   52   91:fstore          4
    //   53   93:goto            27
    }

    public float getGapWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field float mGapWidth>
    //    2    4:freturn         
    }

    public float getLineWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field float mLineWidth>
    //    2    4:freturn         
    }

    public int getSelectedColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Paint mPaintSelected>
    //    2    4:invokevirtual   #221 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public float getStrokeWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Paint mPaintSelected>
    //    2    4:invokevirtual   #182 <Method float Paint.getStrokeWidth()>
    //    3    7:freturn         
    }

    public int getUnselectedColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field Paint mPaintUnselected>
    //    2    4:invokevirtual   #221 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public boolean isCentered()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field boolean mCentered>
    //    2    4:ireturn         
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #227 <Method void invalidate()>
    //    2    4:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #231 <Method void View.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #199 <Field ViewPager mViewPager>
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #199 <Field ViewPager mViewPager>
    //    9   17:invokevirtual   #205 <Method PagerAdapter ViewPager.getAdapter()>
    //   10   20:invokevirtual   #210 <Method int PagerAdapter.getCount()>
    //   11   23:istore_2        
    //   12   24:iload_2         
    //   13   25:ifeq            12
    //   14   28:aload_0         
    //   15   29:getfield        #233 <Field int mCurrentPage>
    //   16   32:iload_2         
    //   17   33:icmplt          44
    //   18   36:aload_0         
    //   19   37:iload_2         
    //   20   38:iconst_1        
    //   21   39:isub            
    //   22   40:invokevirtual   #236 <Method void setCurrentItem(int)>
    //   23   43:return          
    //   24   44:aload_0         
    //   25   45:getfield        #124 <Field float mLineWidth>
    //   26   48:aload_0         
    //   27   49:getfield        #126 <Field float mGapWidth>
    //   28   52:fadd            
    //   29   53:fstore_3        
    //   30   54:fload_3         
    //   31   55:iload_2         
    //   32   56:i2f             
    //   33   57:fmul            
    //   34   58:aload_0         
    //   35   59:getfield        #126 <Field float mGapWidth>
    //   36   62:fsub            
    //   37   63:fstore          4
    //   38   65:aload_0         
    //   39   66:invokevirtual   #186 <Method int getPaddingTop()>
    //   40   69:i2f             
    //   41   70:fstore          5
    //   42   72:aload_0         
    //   43   73:invokevirtual   #213 <Method int getPaddingLeft()>
    //   44   76:i2f             
    //   45   77:fstore          6
    //   46   79:aload_0         
    //   47   80:invokevirtual   #216 <Method int getPaddingRight()>
    //   48   83:i2f             
    //   49   84:fstore          7
    //   50   86:fload           5
    //   51   88:aload_0         
    //   52   89:invokevirtual   #239 <Method int getHeight()>
    //   53   92:i2f             
    //   54   93:fload           5
    //   55   95:fsub            
    //   56   96:aload_0         
    //   57   97:invokevirtual   #189 <Method int getPaddingBottom()>
    //   58  100:i2f             
    //   59  101:fsub            
    //   60  102:fconst_2        
    //   61  103:fdiv            
    //   62  104:fadd            
    //   63  105:fstore          8
    //   64  107:fload           6
    //   65  109:fstore          9
    //   66  111:aload_0         
    //   67  112:getfield        #119 <Field boolean mCentered>
    //   68  115:ifeq            141
    //   69  118:fload           9
    //   70  120:aload_0         
    //   71  121:invokevirtual   #242 <Method int getWidth()>
    //   72  124:i2f             
    //   73  125:fload           6
    //   74  127:fsub            
    //   75  128:fload           7
    //   76  130:fsub            
    //   77  131:fconst_2        
    //   78  132:fdiv            
    //   79  133:fload           4
    //   80  135:fconst_2        
    //   81  136:fdiv            
    //   82  137:fsub            
    //   83  138:fadd            
    //   84  139:fstore          9
    //   85  141:iconst_0        
    //   86  142:istore          10
    //   87  144:iload           10
    //   88  146:iload_2         
    //   89  147:icmpge          12
    //   90  150:fload           9
    //   91  152:fload_3         
    //   92  153:iload           10
    //   93  155:i2f             
    //   94  156:fmul            
    //   95  157:fadd            
    //   96  158:fstore          11
    //   97  160:fload           11
    //   98  162:aload_0         
    //   99  163:getfield        #124 <Field float mLineWidth>
    //  100  166:fadd            
    //  101  167:fstore          12
    //  102  169:iload           10
    //  103  171:aload_0         
    //  104  172:getfield        #233 <Field int mCurrentPage>
    //  105  175:icmpne          204
    //  106  178:aload_0         
    //  107  179:getfield        #49  <Field Paint mPaintSelected>
    //  108  182:astore          13
    //  109  184:aload_1         
    //  110  185:fload           11
    //  111  187:fload           8
    //  112  189:fload           12
    //  113  191:fload           8
    //  114  193:aload           13
    //  115  195:invokevirtual   #248 <Method void Canvas.drawLine(float, float, float, float, Paint)>
    //  116  198:iinc            10  1
    //  117  201:goto            144
    //  118  204:aload_0         
    //  119  205:getfield        #47  <Field Paint mPaintUnselected>
    //  120  208:astore          13
    //  121  210:goto            184
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:iload_1         
    //    3    3:invokespecial   #252 <Method int measureWidth(int)>
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:invokespecial   #254 <Method int measureHeight(int)>
    //    7   11:invokevirtual   #257 <Method void setMeasuredDimension(int, int)>
    //    8   14:return          
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #264 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //    7   17:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5   11:iload_1         
    //    6   12:fload_2         
    //    7   13:iload_3         
    //    8   14:invokeinterface #268 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //    9   19:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #233 <Field int mCurrentPage>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #227 <Method void invalidate()>
    //    5    9:aload_0         
    //    6   10:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    7   13:ifnull          26
    //    8   16:aload_0         
    //    9   17:getfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   10   20:iload_1         
    //   11   21:invokeinterface #271 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   12   26:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #275 <Class LinePageIndicator$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #279 <Method Parcelable LinePageIndicator$SavedState.getSuperState()>
    //    6   10:invokespecial   #281 <Method void View.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #284 <Field int LinePageIndicator$SavedState.currentPage>
    //   10   18:putfield        #233 <Field int mCurrentPage>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #287 <Method void requestLayout()>
    //   13   25:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #275 <Class LinePageIndicator$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #290 <Method Parcelable View.onSaveInstanceState()>
    //    4    8:invokespecial   #292 <Method void LinePageIndicator$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #233 <Field int mCurrentPage>
    //    9   17:putfield        #284 <Field int LinePageIndicator$SavedState.currentPage>
    //   10   20:aload_1         
    //   11   21:areturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #296 <Method boolean View.onTouchEvent(MotionEvent)>
    //    3    5:ifeq            10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:aload_0         
    //    7   11:getfield        #199 <Field ViewPager mViewPager>
    //    8   14:ifnull          30
    //    9   17:aload_0         
    //   10   18:getfield        #199 <Field ViewPager mViewPager>
    //   11   21:invokevirtual   #205 <Method PagerAdapter ViewPager.getAdapter()>
    //   12   24:invokevirtual   #210 <Method int PagerAdapter.getCount()>
    //   13   27:ifne            32
    //   14   30:iconst_0        
    //   15   31:ireturn         
    //   16   32:sipush          255
    //   17   35:aload_1         
    //   18   36:invokevirtual   #301 <Method int MotionEvent.getAction()>
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
    //   28   89:invokestatic    #307 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   29   92:putfield        #54  <Field int mActivePointerId>
    //   30   95:aload_0         
    //   31   96:aload_1         
    //   32   97:invokevirtual   #310 <Method float MotionEvent.getX()>
    //   33  100:putfield        #52  <Field float mLastMotionX>
    //   34  103:goto            84
    //   35  106:aload_1         
    //   36  107:aload_1         
    //   37  108:aload_0         
    //   38  109:getfield        #54  <Field int mActivePointerId>
    //   39  112:invokestatic    #313 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   40  115:invokestatic    #316 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   41  118:fstore          10
    //   42  120:fload           10
    //   43  122:aload_0         
    //   44  123:getfield        #52  <Field float mLastMotionX>
    //   45  126:fsub            
    //   46  127:fstore          11
    //   47  129:aload_0         
    //   48  130:getfield        #318 <Field boolean mIsDragging>
    //   49  133:ifne            155
    //   50  136:fload           11
    //   51  138:invokestatic    #321 <Method float Math.abs(float)>
    //   52  141:aload_0         
    //   53  142:getfield        #162 <Field int mTouchSlop>
    //   54  145:i2f             
    //   55  146:fcmpl           
    //   56  147:ifle            155
    //   57  150:aload_0         
    //   58  151:iconst_1        
    //   59  152:putfield        #318 <Field boolean mIsDragging>
    //   60  155:aload_0         
    //   61  156:getfield        #318 <Field boolean mIsDragging>
    //   62  159:ifeq            84
    //   63  162:aload_0         
    //   64  163:fload           10
    //   65  165:putfield        #52  <Field float mLastMotionX>
    //   66  168:aload_0         
    //   67  169:getfield        #199 <Field ViewPager mViewPager>
    //   68  172:invokevirtual   #324 <Method boolean ViewPager.isFakeDragging()>
    //   69  175:ifne            188
    //   70  178:aload_0         
    //   71  179:getfield        #199 <Field ViewPager mViewPager>
    //   72  182:invokevirtual   #327 <Method boolean ViewPager.beginFakeDrag()>
    //   73  185:ifeq            84
    //   74  188:aload_0         
    //   75  189:getfield        #199 <Field ViewPager mViewPager>
    //   76  192:fload           11
    //   77  194:invokevirtual   #330 <Method void ViewPager.fakeDragBy(float)>
    //   78  197:goto            84
    //   79  200:aload_0         
    //   80  201:getfield        #318 <Field boolean mIsDragging>
    //   81  204:ifne            325
    //   82  207:aload_0         
    //   83  208:getfield        #199 <Field ViewPager mViewPager>
    //   84  211:invokevirtual   #205 <Method PagerAdapter ViewPager.getAdapter()>
    //   85  214:invokevirtual   #210 <Method int PagerAdapter.getCount()>
    //   86  217:istore          6
    //   87  219:aload_0         
    //   88  220:invokevirtual   #242 <Method int getWidth()>
    //   89  223:istore          7
    //   90  225:iload           7
    //   91  227:i2f             
    //   92  228:fconst_2        
    //   93  229:fdiv            
    //   94  230:fstore          8
    //   95  232:iload           7
    //   96  234:i2f             
    //   97  235:ldc2            #331 <Float 6F>
    //   98  238:fdiv            
    //   99  239:fstore          9
    //  100  241:aload_0         
    //  101  242:getfield        #233 <Field int mCurrentPage>
    //  102  245:ifle            281
    //  103  248:aload_1         
    //  104  249:invokevirtual   #310 <Method float MotionEvent.getX()>
    //  105  252:fload           8
    //  106  254:fload           9
    //  107  256:fsub            
    //  108  257:fcmpg           
    //  109  258:ifge            281
    //  110  261:iload_2         
    //  111  262:iconst_3        
    //  112  263:icmpeq          279
    //  113  266:aload_0         
    //  114  267:getfield        #199 <Field ViewPager mViewPager>
    //  115  270:iconst_m1       
    //  116  271:aload_0         
    //  117  272:getfield        #233 <Field int mCurrentPage>
    //  118  275:iadd            
    //  119  276:invokevirtual   #332 <Method void ViewPager.setCurrentItem(int)>
    //  120  279:iconst_1        
    //  121  280:ireturn         
    //  122  281:aload_0         
    //  123  282:getfield        #233 <Field int mCurrentPage>
    //  124  285:iload           6
    //  125  287:iconst_1        
    //  126  288:isub            
    //  127  289:icmpge          325
    //  128  292:aload_1         
    //  129  293:invokevirtual   #310 <Method float MotionEvent.getX()>
    //  130  296:fload           8
    //  131  298:fload           9
    //  132  300:fadd            
    //  133  301:fcmpl           
    //  134  302:ifle            325
    //  135  305:iload_2         
    //  136  306:iconst_3        
    //  137  307:icmpeq          323
    //  138  310:aload_0         
    //  139  311:getfield        #199 <Field ViewPager mViewPager>
    //  140  314:iconst_1        
    //  141  315:aload_0         
    //  142  316:getfield        #233 <Field int mCurrentPage>
    //  143  319:iadd            
    //  144  320:invokevirtual   #332 <Method void ViewPager.setCurrentItem(int)>
    //  145  323:iconst_1        
    //  146  324:ireturn         
    //  147  325:aload_0         
    //  148  326:iconst_0        
    //  149  327:putfield        #318 <Field boolean mIsDragging>
    //  150  330:aload_0         
    //  151  331:iconst_m1       
    //  152  332:putfield        #54  <Field int mActivePointerId>
    //  153  335:aload_0         
    //  154  336:getfield        #199 <Field ViewPager mViewPager>
    //  155  339:invokevirtual   #324 <Method boolean ViewPager.isFakeDragging()>
    //  156  342:ifeq            84
    //  157  345:aload_0         
    //  158  346:getfield        #199 <Field ViewPager mViewPager>
    //  159  349:invokevirtual   #335 <Method void ViewPager.endFakeDrag()>
    //  160  352:goto            84
    //  161  355:aload_1         
    //  162  356:invokestatic    #339 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  163  359:istore          5
    //  164  361:aload_0         
    //  165  362:aload_1         
    //  166  363:iload           5
    //  167  365:invokestatic    #316 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  168  368:putfield        #52  <Field float mLastMotionX>
    //  169  371:aload_0         
    //  170  372:aload_1         
    //  171  373:iload           5
    //  172  375:invokestatic    #307 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  173  378:putfield        #54  <Field int mActivePointerId>
    //  174  381:goto            84
    //  175  384:aload_1         
    //  176  385:invokestatic    #339 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  177  388:istore_3        
    //  178  389:aload_1         
    //  179  390:iload_3         
    //  180  391:invokestatic    #307 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  181  394:aload_0         
    //  182  395:getfield        #54  <Field int mActivePointerId>
    //  183  398:icmpne          418
    //  184  401:iload_3         
    //  185  402:ifne            437
    //  186  405:iconst_1        
    //  187  406:istore          4
    //  188  408:aload_0         
    //  189  409:aload_1         
    //  190  410:iload           4
    //  191  412:invokestatic    #307 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  192  415:putfield        #54  <Field int mActivePointerId>
    //  193  418:aload_0         
    //  194  419:aload_1         
    //  195  420:aload_1         
    //  196  421:aload_0         
    //  197  422:getfield        #54  <Field int mActivePointerId>
    //  198  425:invokestatic    #313 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  199  428:invokestatic    #316 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  200  431:putfield        #52  <Field float mLastMotionX>
    //  201  434:goto            84
    //  202  437:iconst_0        
    //  203  438:istore          4
    //  204  440:goto            408
    }

    public void setCentered(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #119 <Field boolean mCentered>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #227 <Method void invalidate()>
    //    5    9:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #199 <Field ViewPager mViewPager>
    //    2    4:ifnonnull       18
    //    3    7:new             #343 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #345 <String "ViewPager has not been bound.">
    //    6   14:invokespecial   #348 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #199 <Field ViewPager mViewPager>
    //   10   22:iload_1         
    //   11   23:invokevirtual   #332 <Method void ViewPager.setCurrentItem(int)>
    //   12   26:aload_0         
    //   13   27:iload_1         
    //   14   28:putfield        #233 <Field int mCurrentPage>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #227 <Method void invalidate()>
    //   17   35:return          
    }

    public void setGapWidth(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #126 <Field float mGapWidth>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #227 <Method void invalidate()>
    //    5    9:return          
    }

    public void setLineWidth(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #124 <Field float mLineWidth>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #227 <Method void invalidate()>
    //    5    9:return          
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #260 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setSelectedColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Paint mPaintSelected>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #136 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #227 <Method void invalidate()>
    //    6   12:return          
    }

    public void setStrokeWidth(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Paint mPaintSelected>
    //    2    4:fload_1         
    //    3    5:invokevirtual   #354 <Method void Paint.setStrokeWidth(float)>
    //    4    8:aload_0         
    //    5    9:getfield        #47  <Field Paint mPaintUnselected>
    //    6   12:fload_1         
    //    7   13:invokevirtual   #354 <Method void Paint.setStrokeWidth(float)>
    //    8   16:aload_0         
    //    9   17:invokevirtual   #227 <Method void invalidate()>
    //   10   20:return          
    }

    public void setUnselectedColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field Paint mPaintUnselected>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #136 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #227 <Method void invalidate()>
    //    6   12:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #199 <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #199 <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #199 <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #359 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #205 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       42
    //   15   31:new             #343 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc2            #361 <String "ViewPager does not have adapter instance.">
    //   18   38:invokespecial   #348 <Method void IllegalStateException(String)>
    //   19   41:athrow          
    //   20   42:aload_0         
    //   21   43:aload_1         
    //   22   44:putfield        #199 <Field ViewPager mViewPager>
    //   23   47:aload_0         
    //   24   48:getfield        #199 <Field ViewPager mViewPager>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #359 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   27   55:aload_0         
    //   28   56:invokevirtual   #227 <Method void invalidate()>
    //   29   59:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #364 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #236 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mGapWidth;
    private boolean mIsDragging;
    private float mLastMotionX;
    private float mLineWidth;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private final Paint mPaintSelected;
    private final Paint mPaintUnselected;
    private int mTouchSlop;
    private ViewPager mViewPager;

    // Unreferenced inner class com/viewpagerindicator/LinePageIndicator$SavedState$1

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
        //    0    0:new             #9   <Class LinePageIndicator$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void LinePageIndicator$SavedState(Parcel, LinePageIndicator$SavedState)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method LinePageIndicator$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method LinePageIndicator$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
