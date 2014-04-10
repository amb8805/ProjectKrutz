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

public class CirclePageIndicator extends View
    implements PageIndicator
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class CirclePageIndicator$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void CirclePageIndicator$SavedState$1()>
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
        //    2    2:invokespecial   #31  <Method void CirclePageIndicator$SavedState(Parcel)>
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


    public CirclePageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #36  <Method void CirclePageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public CirclePageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #41  <Field int R$attr.vpiCirclePageIndicatorStyle>
    //    4    6:invokespecial   #44  <Method void CirclePageIndicator(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public CirclePageIndicator(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #45  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:new             #47  <Class Paint>
    //    7   11:dup             
    //    8   12:iconst_1        
    //    9   13:invokespecial   #50  <Method void Paint(int)>
    //   10   16:putfield        #52  <Field Paint mPaintPageFill>
    //   11   19:aload_0         
    //   12   20:new             #47  <Class Paint>
    //   13   23:dup             
    //   14   24:iconst_1        
    //   15   25:invokespecial   #50  <Method void Paint(int)>
    //   16   28:putfield        #54  <Field Paint mPaintStroke>
    //   17   31:aload_0         
    //   18   32:new             #47  <Class Paint>
    //   19   35:dup             
    //   20   36:iconst_1        
    //   21   37:invokespecial   #50  <Method void Paint(int)>
    //   22   40:putfield        #56  <Field Paint mPaintFill>
    //   23   43:aload_0         
    //   24   44:ldc1            #57  <Float -1F>
    //   25   46:putfield        #59  <Field float mLastMotionX>
    //   26   49:aload_0         
    //   27   50:iconst_m1       
    //   28   51:putfield        #61  <Field int mActivePointerId>
    //   29   54:aload_0         
    //   30   55:invokevirtual   #65  <Method boolean isInEditMode()>
    //   31   58:ifeq            62
    //   32   61:return          
    //   33   62:aload_0         
    //   34   63:invokevirtual   #69  <Method Resources getResources()>
    //   35   66:astore          4
    //   36   68:aload           4
    //   37   70:getstatic       #74  <Field int R$color.default_circle_indicator_page_color>
    //   38   73:invokevirtual   #80  <Method int Resources.getColor(int)>
    //   39   76:istore          5
    //   40   78:aload           4
    //   41   80:getstatic       #83  <Field int R$color.default_circle_indicator_fill_color>
    //   42   83:invokevirtual   #80  <Method int Resources.getColor(int)>
    //   43   86:istore          6
    //   44   88:aload           4
    //   45   90:getstatic       #88  <Field int R$integer.default_circle_indicator_orientation>
    //   46   93:invokevirtual   #91  <Method int Resources.getInteger(int)>
    //   47   96:istore          7
    //   48   98:aload           4
    //   49  100:getstatic       #94  <Field int R$color.default_circle_indicator_stroke_color>
    //   50  103:invokevirtual   #80  <Method int Resources.getColor(int)>
    //   51  106:istore          8
    //   52  108:aload           4
    //   53  110:getstatic       #99  <Field int R$dimen.default_circle_indicator_stroke_width>
    //   54  113:invokevirtual   #103 <Method float Resources.getDimension(int)>
    //   55  116:fstore          9
    //   56  118:aload           4
    //   57  120:getstatic       #106 <Field int R$dimen.default_circle_indicator_radius>
    //   58  123:invokevirtual   #103 <Method float Resources.getDimension(int)>
    //   59  126:fstore          10
    //   60  128:aload           4
    //   61  130:getstatic       #111 <Field int R$bool.default_circle_indicator_centered>
    //   62  133:invokevirtual   #115 <Method boolean Resources.getBoolean(int)>
    //   63  136:istore          11
    //   64  138:aload           4
    //   65  140:getstatic       #118 <Field int R$bool.default_circle_indicator_snap>
    //   66  143:invokevirtual   #115 <Method boolean Resources.getBoolean(int)>
    //   67  146:istore          12
    //   68  148:aload_1         
    //   69  149:aload_2         
    //   70  150:getstatic       #124 <Field int[] R$styleable.CirclePageIndicator>
    //   71  153:iload_3         
    //   72  154:iconst_0        
    //   73  155:invokevirtual   #130 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   74  158:astore          13
    //   75  160:aload_0         
    //   76  161:aload           13
    //   77  163:iconst_2        
    //   78  164:iload           11
    //   79  166:invokevirtual   #135 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   80  169:putfield        #137 <Field boolean mCentered>
    //   81  172:aload_0         
    //   82  173:aload           13
    //   83  175:iconst_0        
    //   84  176:iload           7
    //   85  178:invokevirtual   #141 <Method int TypedArray.getInt(int, int)>
    //   86  181:putfield        #143 <Field int mOrientation>
    //   87  184:aload_0         
    //   88  185:getfield        #52  <Field Paint mPaintPageFill>
    //   89  188:getstatic       #149 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
    //   90  191:invokevirtual   #153 <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //   91  194:aload_0         
    //   92  195:getfield        #52  <Field Paint mPaintPageFill>
    //   93  198:aload           13
    //   94  200:iconst_5        
    //   95  201:iload           5
    //   96  203:invokevirtual   #155 <Method int TypedArray.getColor(int, int)>
    //   97  206:invokevirtual   #158 <Method void Paint.setColor(int)>
    //   98  209:aload_0         
    //   99  210:getfield        #54  <Field Paint mPaintStroke>
    //  100  213:getstatic       #161 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
    //  101  216:invokevirtual   #153 <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //  102  219:aload_0         
    //  103  220:getfield        #54  <Field Paint mPaintStroke>
    //  104  223:aload           13
    //  105  225:bipush          8
    //  106  227:iload           8
    //  107  229:invokevirtual   #155 <Method int TypedArray.getColor(int, int)>
    //  108  232:invokevirtual   #158 <Method void Paint.setColor(int)>
    //  109  235:aload_0         
    //  110  236:getfield        #54  <Field Paint mPaintStroke>
    //  111  239:aload           13
    //  112  241:iconst_3        
    //  113  242:fload           9
    //  114  244:invokevirtual   #164 <Method float TypedArray.getDimension(int, float)>
    //  115  247:invokevirtual   #168 <Method void Paint.setStrokeWidth(float)>
    //  116  250:aload_0         
    //  117  251:getfield        #56  <Field Paint mPaintFill>
    //  118  254:getstatic       #149 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
    //  119  257:invokevirtual   #153 <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //  120  260:aload_0         
    //  121  261:getfield        #56  <Field Paint mPaintFill>
    //  122  264:aload           13
    //  123  266:iconst_4        
    //  124  267:iload           6
    //  125  269:invokevirtual   #155 <Method int TypedArray.getColor(int, int)>
    //  126  272:invokevirtual   #158 <Method void Paint.setColor(int)>
    //  127  275:aload_0         
    //  128  276:aload           13
    //  129  278:bipush          6
    //  130  280:fload           10
    //  131  282:invokevirtual   #164 <Method float TypedArray.getDimension(int, float)>
    //  132  285:putfield        #170 <Field float mRadius>
    //  133  288:aload_0         
    //  134  289:aload           13
    //  135  291:bipush          7
    //  136  293:iload           12
    //  137  295:invokevirtual   #135 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  138  298:putfield        #172 <Field boolean mSnap>
    //  139  301:aload           13
    //  140  303:iconst_1        
    //  141  304:invokevirtual   #176 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
    //  142  307:astore          14
    //  143  309:aload           14
    //  144  311:ifnull          320
    //  145  314:aload_0         
    //  146  315:aload           14
    //  147  317:invokevirtual   #180 <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
    //  148  320:aload           13
    //  149  322:invokevirtual   #184 <Method void TypedArray.recycle()>
    //  150  325:aload_0         
    //  151  326:aload_1         
    //  152  327:invokestatic    #190 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //  153  330:invokestatic    #196 <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //  154  333:putfield        #198 <Field int mTouchSlop>
    //  155  336:return          
    }

    private int measureLong(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #204 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_2        
    //    3    5:iload_1         
    //    4    6:invokestatic    #207 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ldc1            #208 <Int 0x40000000>
    //    8   13:icmpeq          23
    //    9   16:aload_0         
    //   10   17:getfield        #210 <Field ViewPager mViewPager>
    //   11   20:ifnonnull       29
    //   12   23:iload_3         
    //   13   24:istore          4
    //   14   26:iload           4
    //   15   28:ireturn         
    //   16   29:aload_0         
    //   17   30:getfield        #210 <Field ViewPager mViewPager>
    //   18   33:invokevirtual   #216 <Method PagerAdapter ViewPager.getAdapter()>
    //   19   36:invokevirtual   #222 <Method int PagerAdapter.getCount()>
    //   20   39:istore          5
    //   21   41:fconst_1        
    //   22   42:aload_0         
    //   23   43:invokevirtual   #225 <Method int getPaddingLeft()>
    //   24   46:aload_0         
    //   25   47:invokevirtual   #228 <Method int getPaddingRight()>
    //   26   50:iadd            
    //   27   51:i2f             
    //   28   52:iload           5
    //   29   54:iconst_2        
    //   30   55:imul            
    //   31   56:i2f             
    //   32   57:aload_0         
    //   33   58:getfield        #170 <Field float mRadius>
    //   34   61:fmul            
    //   35   62:fadd            
    //   36   63:iload           5
    //   37   65:iconst_1        
    //   38   66:isub            
    //   39   67:i2f             
    //   40   68:aload_0         
    //   41   69:getfield        #170 <Field float mRadius>
    //   42   72:fmul            
    //   43   73:fadd            
    //   44   74:fadd            
    //   45   75:f2i             
    //   46   76:istore          4
    //   47   78:iload_2         
    //   48   79:ldc1            #229 <Int 0x80000000>
    //   49   81:icmpne          26
    //   50   84:iload           4
    //   51   86:iload_3         
    //   52   87:invokestatic    #234 <Method int Math.min(int, int)>
    //   53   90:ireturn         
    }

    private int measureShort(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #204 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_2        
    //    3    5:iload_1         
    //    4    6:invokestatic    #207 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ldc1            #208 <Int 0x40000000>
    //    8   13:icmpne          22
    //    9   16:iload_3         
    //   10   17:istore          4
    //   11   19:iload           4
    //   12   21:ireturn         
    //   13   22:fconst_1        
    //   14   23:fconst_2        
    //   15   24:aload_0         
    //   16   25:getfield        #170 <Field float mRadius>
    //   17   28:fmul            
    //   18   29:aload_0         
    //   19   30:invokevirtual   #238 <Method int getPaddingTop()>
    //   20   33:i2f             
    //   21   34:fadd            
    //   22   35:aload_0         
    //   23   36:invokevirtual   #241 <Method int getPaddingBottom()>
    //   24   39:i2f             
    //   25   40:fadd            
    //   26   41:fadd            
    //   27   42:f2i             
    //   28   43:istore          4
    //   29   45:iload_2         
    //   30   46:ldc1            #229 <Int 0x80000000>
    //   31   48:icmpne          19
    //   32   51:iload           4
    //   33   53:iload_3         
    //   34   54:invokestatic    #234 <Method int Math.min(int, int)>
    //   35   57:ireturn         
    }

    public int getFillColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field Paint mPaintFill>
    //    2    4:invokevirtual   #244 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public int getOrientation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #143 <Field int mOrientation>
    //    2    4:ireturn         
    }

    public int getPageColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field Paint mPaintPageFill>
    //    2    4:invokevirtual   #244 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public float getRadius()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field float mRadius>
    //    2    4:freturn         
    }

    public int getStrokeColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Paint mPaintStroke>
    //    2    4:invokevirtual   #244 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public float getStrokeWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Paint mPaintStroke>
    //    2    4:invokevirtual   #252 <Method float Paint.getStrokeWidth()>
    //    3    7:freturn         
    }

    public boolean isCentered()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field boolean mCentered>
    //    2    4:ireturn         
    }

    public boolean isSnap()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field boolean mSnap>
    //    2    4:ireturn         
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #258 <Method void invalidate()>
    //    2    4:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #262 <Method void View.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #210 <Field ViewPager mViewPager>
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #210 <Field ViewPager mViewPager>
    //    9   17:invokevirtual   #216 <Method PagerAdapter ViewPager.getAdapter()>
    //   10   20:invokevirtual   #222 <Method int PagerAdapter.getCount()>
    //   11   23:istore_2        
    //   12   24:iload_2         
    //   13   25:ifeq            12
    //   14   28:aload_0         
    //   15   29:getfield        #264 <Field int mCurrentPage>
    //   16   32:iload_2         
    //   17   33:icmplt          44
    //   18   36:aload_0         
    //   19   37:iload_2         
    //   20   38:iconst_1        
    //   21   39:isub            
    //   22   40:invokevirtual   #267 <Method void setCurrentItem(int)>
    //   23   43:return          
    //   24   44:aload_0         
    //   25   45:getfield        #143 <Field int mOrientation>
    //   26   48:ifne            250
    //   27   51:aload_0         
    //   28   52:invokevirtual   #270 <Method int getWidth()>
    //   29   55:istore_3        
    //   30   56:aload_0         
    //   31   57:invokevirtual   #225 <Method int getPaddingLeft()>
    //   32   60:istore          4
    //   33   62:aload_0         
    //   34   63:invokevirtual   #228 <Method int getPaddingRight()>
    //   35   66:istore          5
    //   36   68:aload_0         
    //   37   69:invokevirtual   #238 <Method int getPaddingTop()>
    //   38   72:istore          6
    //   39   74:ldc2            #271 <Float 3F>
    //   40   77:aload_0         
    //   41   78:getfield        #170 <Field float mRadius>
    //   42   81:fmul            
    //   43   82:fstore          7
    //   44   84:iload           6
    //   45   86:i2f             
    //   46   87:aload_0         
    //   47   88:getfield        #170 <Field float mRadius>
    //   48   91:fadd            
    //   49   92:fstore          8
    //   50   94:iload           4
    //   51   96:i2f             
    //   52   97:aload_0         
    //   53   98:getfield        #170 <Field float mRadius>
    //   54  101:fadd            
    //   55  102:fstore          9
    //   56  104:aload_0         
    //   57  105:getfield        #137 <Field boolean mCentered>
    //   58  108:ifeq            134
    //   59  111:fload           9
    //   60  113:iload_3         
    //   61  114:iload           4
    //   62  116:isub            
    //   63  117:iload           5
    //   64  119:isub            
    //   65  120:i2f             
    //   66  121:fconst_2        
    //   67  122:fdiv            
    //   68  123:fload           7
    //   69  125:iload_2         
    //   70  126:i2f             
    //   71  127:fmul            
    //   72  128:fconst_2        
    //   73  129:fdiv            
    //   74  130:fsub            
    //   75  131:fadd            
    //   76  132:fstore          9
    //   77  134:aload_0         
    //   78  135:getfield        #170 <Field float mRadius>
    //   79  138:fstore          10
    //   80  140:aload_0         
    //   81  141:getfield        #54  <Field Paint mPaintStroke>
    //   82  144:invokevirtual   #252 <Method float Paint.getStrokeWidth()>
    //   83  147:fconst_0        
    //   84  148:fcmpl           
    //   85  149:ifle            166
    //   86  152:fload           10
    //   87  154:aload_0         
    //   88  155:getfield        #54  <Field Paint mPaintStroke>
    //   89  158:invokevirtual   #252 <Method float Paint.getStrokeWidth()>
    //   90  161:fconst_2        
    //   91  162:fdiv            
    //   92  163:fsub            
    //   93  164:fstore          10
    //   94  166:iconst_0        
    //   95  167:istore          11
    //   96  169:iload           11
    //   97  171:iload_2         
    //   98  172:icmplt          276
    //   99  175:aload_0         
    //  100  176:getfield        #172 <Field boolean mSnap>
    //  101  179:ifeq            369
    //  102  182:aload_0         
    //  103  183:getfield        #273 <Field int mSnapPage>
    //  104  186:istore          15
    //  105  188:fload           7
    //  106  190:iload           15
    //  107  192:i2f             
    //  108  193:fmul            
    //  109  194:fstore          16
    //  110  196:aload_0         
    //  111  197:getfield        #172 <Field boolean mSnap>
    //  112  200:ifne            215
    //  113  203:fload           16
    //  114  205:fload           7
    //  115  207:aload_0         
    //  116  208:getfield        #275 <Field float mPageOffset>
    //  117  211:fmul            
    //  118  212:fadd            
    //  119  213:fstore          16
    //  120  215:aload_0         
    //  121  216:getfield        #143 <Field int mOrientation>
    //  122  219:ifne            378
    //  123  222:fload           9
    //  124  224:fload           16
    //  125  226:fadd            
    //  126  227:fstore          17
    //  127  229:fload           8
    //  128  231:fstore          18
    //  129  233:aload_1         
    //  130  234:fload           17
    //  131  236:fload           18
    //  132  238:aload_0         
    //  133  239:getfield        #170 <Field float mRadius>
    //  134  242:aload_0         
    //  135  243:getfield        #56  <Field Paint mPaintFill>
    //  136  246:invokevirtual   #281 <Method void Canvas.drawCircle(float, float, float, Paint)>
    //  137  249:return          
    //  138  250:aload_0         
    //  139  251:invokevirtual   #284 <Method int getHeight()>
    //  140  254:istore_3        
    //  141  255:aload_0         
    //  142  256:invokevirtual   #238 <Method int getPaddingTop()>
    //  143  259:istore          4
    //  144  261:aload_0         
    //  145  262:invokevirtual   #241 <Method int getPaddingBottom()>
    //  146  265:istore          5
    //  147  267:aload_0         
    //  148  268:invokevirtual   #225 <Method int getPaddingLeft()>
    //  149  271:istore          6
    //  150  273:goto            74
    //  151  276:fload           9
    //  152  278:fload           7
    //  153  280:iload           11
    //  154  282:i2f             
    //  155  283:fmul            
    //  156  284:fadd            
    //  157  285:fstore          12
    //  158  287:aload_0         
    //  159  288:getfield        #143 <Field int mOrientation>
    //  160  291:ifne            358
    //  161  294:fload           12
    //  162  296:fstore          13
    //  163  298:fload           8
    //  164  300:fstore          14
    //  165  302:aload_0         
    //  166  303:getfield        #52  <Field Paint mPaintPageFill>
    //  167  306:invokevirtual   #287 <Method int Paint.getAlpha()>
    //  168  309:ifle            326
    //  169  312:aload_1         
    //  170  313:fload           13
    //  171  315:fload           14
    //  172  317:fload           10
    //  173  319:aload_0         
    //  174  320:getfield        #52  <Field Paint mPaintPageFill>
    //  175  323:invokevirtual   #281 <Method void Canvas.drawCircle(float, float, float, Paint)>
    //  176  326:fload           10
    //  177  328:aload_0         
    //  178  329:getfield        #170 <Field float mRadius>
    //  179  332:fcmpl           
    //  180  333:ifeq            352
    //  181  336:aload_1         
    //  182  337:fload           13
    //  183  339:fload           14
    //  184  341:aload_0         
    //  185  342:getfield        #170 <Field float mRadius>
    //  186  345:aload_0         
    //  187  346:getfield        #54  <Field Paint mPaintStroke>
    //  188  349:invokevirtual   #281 <Method void Canvas.drawCircle(float, float, float, Paint)>
    //  189  352:iinc            11  1
    //  190  355:goto            169
    //  191  358:fload           8
    //  192  360:fstore          13
    //  193  362:fload           12
    //  194  364:fstore          14
    //  195  366:goto            302
    //  196  369:aload_0         
    //  197  370:getfield        #264 <Field int mCurrentPage>
    //  198  373:istore          15
    //  199  375:goto            188
    //  200  378:fload           8
    //  201  380:fstore          17
    //  202  382:fload           9
    //  203  384:fload           16
    //  204  386:fadd            
    //  205  387:fstore          18
    //  206  389:goto            233
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #143 <Field int mOrientation>
    //    2    4:ifne            22
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:invokespecial   #291 <Method int measureLong(int)>
    //    7   13:aload_0         
    //    8   14:iload_2         
    //    9   15:invokespecial   #293 <Method int measureShort(int)>
    //   10   18:invokevirtual   #296 <Method void setMeasuredDimension(int, int)>
    //   11   21:return          
    //   12   22:aload_0         
    //   13   23:aload_0         
    //   14   24:iload_1         
    //   15   25:invokespecial   #293 <Method int measureShort(int)>
    //   16   28:aload_0         
    //   17   29:iload_2         
    //   18   30:invokespecial   #291 <Method int measureLong(int)>
    //   19   33:invokevirtual   #296 <Method void setMeasuredDimension(int, int)>
    //   20   36:return          
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #299 <Field int mScrollState>
    //    3    5:aload_0         
    //    4    6:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #305 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //   10   22:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #264 <Field int mCurrentPage>
    //    3    5:aload_0         
    //    4    6:fload_2         
    //    5    7:putfield        #275 <Field float mPageOffset>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #258 <Method void invalidate()>
    //    8   14:aload_0         
    //    9   15:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   10   18:ifnull          33
    //   11   21:aload_0         
    //   12   22:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   13   25:iload_1         
    //   14   26:fload_2         
    //   15   27:iload_3         
    //   16   28:invokeinterface #309 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //   17   33:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field boolean mSnap>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:getfield        #299 <Field int mScrollState>
    //    5   11:ifne            28
    //    6   14:aload_0         
    //    7   15:iload_1         
    //    8   16:putfield        #264 <Field int mCurrentPage>
    //    9   19:aload_0         
    //   10   20:iload_1         
    //   11   21:putfield        #273 <Field int mSnapPage>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #258 <Method void invalidate()>
    //   14   28:aload_0         
    //   15   29:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   16   32:ifnull          45
    //   17   35:aload_0         
    //   18   36:getfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   19   39:iload_1         
    //   20   40:invokeinterface #312 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   21   45:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #316 <Class CirclePageIndicator$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #320 <Method Parcelable CirclePageIndicator$SavedState.getSuperState()>
    //    6   10:invokespecial   #322 <Method void View.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #325 <Field int CirclePageIndicator$SavedState.currentPage>
    //   10   18:putfield        #264 <Field int mCurrentPage>
    //   11   21:aload_0         
    //   12   22:aload_2         
    //   13   23:getfield        #325 <Field int CirclePageIndicator$SavedState.currentPage>
    //   14   26:putfield        #273 <Field int mSnapPage>
    //   15   29:aload_0         
    //   16   30:invokevirtual   #328 <Method void requestLayout()>
    //   17   33:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #316 <Class CirclePageIndicator$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #331 <Method Parcelable View.onSaveInstanceState()>
    //    4    8:invokespecial   #333 <Method void CirclePageIndicator$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #264 <Field int mCurrentPage>
    //    9   17:putfield        #325 <Field int CirclePageIndicator$SavedState.currentPage>
    //   10   20:aload_1         
    //   11   21:areturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #337 <Method boolean View.onTouchEvent(MotionEvent)>
    //    3    5:ifeq            10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:aload_0         
    //    7   11:getfield        #210 <Field ViewPager mViewPager>
    //    8   14:ifnull          30
    //    9   17:aload_0         
    //   10   18:getfield        #210 <Field ViewPager mViewPager>
    //   11   21:invokevirtual   #216 <Method PagerAdapter ViewPager.getAdapter()>
    //   12   24:invokevirtual   #222 <Method int PagerAdapter.getCount()>
    //   13   27:ifne            32
    //   14   30:iconst_0        
    //   15   31:ireturn         
    //   16   32:sipush          255
    //   17   35:aload_1         
    //   18   36:invokevirtual   #342 <Method int MotionEvent.getAction()>
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
    //   28   89:invokestatic    #348 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   29   92:putfield        #61  <Field int mActivePointerId>
    //   30   95:aload_0         
    //   31   96:aload_1         
    //   32   97:invokevirtual   #351 <Method float MotionEvent.getX()>
    //   33  100:putfield        #59  <Field float mLastMotionX>
    //   34  103:goto            84
    //   35  106:aload_1         
    //   36  107:aload_1         
    //   37  108:aload_0         
    //   38  109:getfield        #61  <Field int mActivePointerId>
    //   39  112:invokestatic    #354 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   40  115:invokestatic    #357 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   41  118:fstore          10
    //   42  120:fload           10
    //   43  122:aload_0         
    //   44  123:getfield        #59  <Field float mLastMotionX>
    //   45  126:fsub            
    //   46  127:fstore          11
    //   47  129:aload_0         
    //   48  130:getfield        #359 <Field boolean mIsDragging>
    //   49  133:ifne            155
    //   50  136:fload           11
    //   51  138:invokestatic    #363 <Method float Math.abs(float)>
    //   52  141:aload_0         
    //   53  142:getfield        #198 <Field int mTouchSlop>
    //   54  145:i2f             
    //   55  146:fcmpl           
    //   56  147:ifle            155
    //   57  150:aload_0         
    //   58  151:iconst_1        
    //   59  152:putfield        #359 <Field boolean mIsDragging>
    //   60  155:aload_0         
    //   61  156:getfield        #359 <Field boolean mIsDragging>
    //   62  159:ifeq            84
    //   63  162:aload_0         
    //   64  163:fload           10
    //   65  165:putfield        #59  <Field float mLastMotionX>
    //   66  168:aload_0         
    //   67  169:getfield        #210 <Field ViewPager mViewPager>
    //   68  172:invokevirtual   #366 <Method boolean ViewPager.isFakeDragging()>
    //   69  175:ifne            188
    //   70  178:aload_0         
    //   71  179:getfield        #210 <Field ViewPager mViewPager>
    //   72  182:invokevirtual   #369 <Method boolean ViewPager.beginFakeDrag()>
    //   73  185:ifeq            84
    //   74  188:aload_0         
    //   75  189:getfield        #210 <Field ViewPager mViewPager>
    //   76  192:fload           11
    //   77  194:invokevirtual   #372 <Method void ViewPager.fakeDragBy(float)>
    //   78  197:goto            84
    //   79  200:aload_0         
    //   80  201:getfield        #359 <Field boolean mIsDragging>
    //   81  204:ifne            325
    //   82  207:aload_0         
    //   83  208:getfield        #210 <Field ViewPager mViewPager>
    //   84  211:invokevirtual   #216 <Method PagerAdapter ViewPager.getAdapter()>
    //   85  214:invokevirtual   #222 <Method int PagerAdapter.getCount()>
    //   86  217:istore          6
    //   87  219:aload_0         
    //   88  220:invokevirtual   #270 <Method int getWidth()>
    //   89  223:istore          7
    //   90  225:iload           7
    //   91  227:i2f             
    //   92  228:fconst_2        
    //   93  229:fdiv            
    //   94  230:fstore          8
    //   95  232:iload           7
    //   96  234:i2f             
    //   97  235:ldc2            #373 <Float 6F>
    //   98  238:fdiv            
    //   99  239:fstore          9
    //  100  241:aload_0         
    //  101  242:getfield        #264 <Field int mCurrentPage>
    //  102  245:ifle            281
    //  103  248:aload_1         
    //  104  249:invokevirtual   #351 <Method float MotionEvent.getX()>
    //  105  252:fload           8
    //  106  254:fload           9
    //  107  256:fsub            
    //  108  257:fcmpg           
    //  109  258:ifge            281
    //  110  261:iload_2         
    //  111  262:iconst_3        
    //  112  263:icmpeq          279
    //  113  266:aload_0         
    //  114  267:getfield        #210 <Field ViewPager mViewPager>
    //  115  270:iconst_m1       
    //  116  271:aload_0         
    //  117  272:getfield        #264 <Field int mCurrentPage>
    //  118  275:iadd            
    //  119  276:invokevirtual   #374 <Method void ViewPager.setCurrentItem(int)>
    //  120  279:iconst_1        
    //  121  280:ireturn         
    //  122  281:aload_0         
    //  123  282:getfield        #264 <Field int mCurrentPage>
    //  124  285:iload           6
    //  125  287:iconst_1        
    //  126  288:isub            
    //  127  289:icmpge          325
    //  128  292:aload_1         
    //  129  293:invokevirtual   #351 <Method float MotionEvent.getX()>
    //  130  296:fload           8
    //  131  298:fload           9
    //  132  300:fadd            
    //  133  301:fcmpl           
    //  134  302:ifle            325
    //  135  305:iload_2         
    //  136  306:iconst_3        
    //  137  307:icmpeq          323
    //  138  310:aload_0         
    //  139  311:getfield        #210 <Field ViewPager mViewPager>
    //  140  314:iconst_1        
    //  141  315:aload_0         
    //  142  316:getfield        #264 <Field int mCurrentPage>
    //  143  319:iadd            
    //  144  320:invokevirtual   #374 <Method void ViewPager.setCurrentItem(int)>
    //  145  323:iconst_1        
    //  146  324:ireturn         
    //  147  325:aload_0         
    //  148  326:iconst_0        
    //  149  327:putfield        #359 <Field boolean mIsDragging>
    //  150  330:aload_0         
    //  151  331:iconst_m1       
    //  152  332:putfield        #61  <Field int mActivePointerId>
    //  153  335:aload_0         
    //  154  336:getfield        #210 <Field ViewPager mViewPager>
    //  155  339:invokevirtual   #366 <Method boolean ViewPager.isFakeDragging()>
    //  156  342:ifeq            84
    //  157  345:aload_0         
    //  158  346:getfield        #210 <Field ViewPager mViewPager>
    //  159  349:invokevirtual   #377 <Method void ViewPager.endFakeDrag()>
    //  160  352:goto            84
    //  161  355:aload_1         
    //  162  356:invokestatic    #381 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  163  359:istore          5
    //  164  361:aload_0         
    //  165  362:aload_1         
    //  166  363:iload           5
    //  167  365:invokestatic    #357 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  168  368:putfield        #59  <Field float mLastMotionX>
    //  169  371:aload_0         
    //  170  372:aload_1         
    //  171  373:iload           5
    //  172  375:invokestatic    #348 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  173  378:putfield        #61  <Field int mActivePointerId>
    //  174  381:goto            84
    //  175  384:aload_1         
    //  176  385:invokestatic    #381 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  177  388:istore_3        
    //  178  389:aload_1         
    //  179  390:iload_3         
    //  180  391:invokestatic    #348 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  181  394:aload_0         
    //  182  395:getfield        #61  <Field int mActivePointerId>
    //  183  398:icmpne          418
    //  184  401:iload_3         
    //  185  402:ifne            437
    //  186  405:iconst_1        
    //  187  406:istore          4
    //  188  408:aload_0         
    //  189  409:aload_1         
    //  190  410:iload           4
    //  191  412:invokestatic    #348 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  192  415:putfield        #61  <Field int mActivePointerId>
    //  193  418:aload_0         
    //  194  419:aload_1         
    //  195  420:aload_1         
    //  196  421:aload_0         
    //  197  422:getfield        #61  <Field int mActivePointerId>
    //  198  425:invokestatic    #354 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  199  428:invokestatic    #357 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  200  431:putfield        #59  <Field float mLastMotionX>
    //  201  434:goto            84
    //  202  437:iconst_0        
    //  203  438:istore          4
    //  204  440:goto            408
    }

    public void setCentered(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #137 <Field boolean mCentered>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #258 <Method void invalidate()>
    //    5    9:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #210 <Field ViewPager mViewPager>
    //    2    4:ifnonnull       18
    //    3    7:new             #385 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #387 <String "ViewPager has not been bound.">
    //    6   14:invokespecial   #390 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #210 <Field ViewPager mViewPager>
    //   10   22:iload_1         
    //   11   23:invokevirtual   #374 <Method void ViewPager.setCurrentItem(int)>
    //   12   26:aload_0         
    //   13   27:iload_1         
    //   14   28:putfield        #264 <Field int mCurrentPage>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #258 <Method void invalidate()>
    //   17   35:return          
    }

    public void setFillColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field Paint mPaintFill>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #158 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #258 <Method void invalidate()>
    //    6   12:return          
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #301 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setOrientation(int i)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     0 1: default 24
    //                   0 35
    //                   1 35
    //    2   24:new             #396 <Class IllegalArgumentException>
    //    3   27:dup             
    //    4   28:ldc2            #398 <String "Orientation must be either HORIZONTAL or VERTICAL.">
    //    5   31:invokespecial   #399 <Method void IllegalArgumentException(String)>
    //    6   34:athrow          
    //    7   35:aload_0         
    //    8   36:iload_1         
    //    9   37:putfield        #143 <Field int mOrientation>
    //   10   40:aload_0         
    //   11   41:invokevirtual   #328 <Method void requestLayout()>
    //   12   44:return          
    }

    public void setPageColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field Paint mPaintPageFill>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #158 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #258 <Method void invalidate()>
    //    6   12:return          
    }

    public void setRadius(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #170 <Field float mRadius>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #258 <Method void invalidate()>
    //    5    9:return          
    }

    public void setSnap(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #172 <Field boolean mSnap>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #258 <Method void invalidate()>
    //    5    9:return          
    }

    public void setStrokeColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Paint mPaintStroke>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #158 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #258 <Method void invalidate()>
    //    6   12:return          
    }

    public void setStrokeWidth(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Paint mPaintStroke>
    //    2    4:fload_1         
    //    3    5:invokevirtual   #168 <Method void Paint.setStrokeWidth(float)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #258 <Method void invalidate()>
    //    6   12:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #210 <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #210 <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #210 <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #407 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #216 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       42
    //   15   31:new             #385 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc2            #409 <String "ViewPager does not have adapter instance.">
    //   18   38:invokespecial   #390 <Method void IllegalStateException(String)>
    //   19   41:athrow          
    //   20   42:aload_0         
    //   21   43:aload_1         
    //   22   44:putfield        #210 <Field ViewPager mViewPager>
    //   23   47:aload_0         
    //   24   48:getfield        #210 <Field ViewPager mViewPager>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #407 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   27   55:aload_0         
    //   28   56:invokevirtual   #258 <Method void invalidate()>
    //   29   59:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #412 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #267 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private boolean mIsDragging;
    private float mLastMotionX;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private int mOrientation;
    private float mPageOffset;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;

    // Unreferenced inner class com/viewpagerindicator/CirclePageIndicator$SavedState$1

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
        //    0    0:new             #9   <Class CirclePageIndicator$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void CirclePageIndicator$SavedState(Parcel, CirclePageIndicator$SavedState)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method CirclePageIndicator$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method CirclePageIndicator$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
