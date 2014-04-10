// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

    public PagerTabStrip(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #47  <Method void PagerTabStrip(Context, AttributeSet)>
    //    4    6:return          
    }

    public PagerTabStrip(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #48  <Method void PagerTitleStrip(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #50  <Class Paint>
    //    6   10:dup             
    //    7   11:invokespecial   #53  <Method void Paint()>
    //    8   14:putfield        #55  <Field Paint mTabPaint>
    //    9   17:aload_0         
    //   10   18:new             #57  <Class Rect>
    //   11   21:dup             
    //   12   22:invokespecial   #58  <Method void Rect()>
    //   13   25:putfield        #60  <Field Rect mTempRect>
    //   14   28:aload_0         
    //   15   29:sipush          255
    //   16   32:putfield        #62  <Field int mTabAlpha>
    //   17   35:aload_0         
    //   18   36:iconst_0        
    //   19   37:putfield        #64  <Field boolean mDrawFullUnderline>
    //   20   40:aload_0         
    //   21   41:iconst_0        
    //   22   42:putfield        #66  <Field boolean mDrawFullUnderlineSet>
    //   23   45:aload_0         
    //   24   46:aload_0         
    //   25   47:getfield        #69  <Field int mTextColor>
    //   26   50:putfield        #71  <Field int mIndicatorColor>
    //   27   53:aload_0         
    //   28   54:getfield        #55  <Field Paint mTabPaint>
    //   29   57:aload_0         
    //   30   58:getfield        #71  <Field int mIndicatorColor>
    //   31   61:invokevirtual   #75  <Method void Paint.setColor(int)>
    //   32   64:aload_1         
    //   33   65:invokevirtual   #81  <Method Resources Context.getResources()>
    //   34   68:invokevirtual   #87  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   35   71:getfield        #92  <Field float DisplayMetrics.density>
    //   36   74:fstore_3        
    //   37   75:aload_0         
    //   38   76:ldc1            #93  <Float 0.5F>
    //   39   78:ldc1            #94  <Float 3F>
    //   40   80:fload_3         
    //   41   81:fmul            
    //   42   82:fadd            
    //   43   83:f2i             
    //   44   84:putfield        #96  <Field int mIndicatorHeight>
    //   45   87:aload_0         
    //   46   88:ldc1            #93  <Float 0.5F>
    //   47   90:ldc1            #97  <Float 6F>
    //   48   92:fload_3         
    //   49   93:fmul            
    //   50   94:fadd            
    //   51   95:f2i             
    //   52   96:putfield        #99  <Field int mMinPaddingBottom>
    //   53   99:aload_0         
    //   54  100:ldc1            #100 <Float 64F>
    //   55  102:fload_3         
    //   56  103:fmul            
    //   57  104:f2i             
    //   58  105:putfield        #102 <Field int mMinTextSpacing>
    //   59  108:aload_0         
    //   60  109:ldc1            #93  <Float 0.5F>
    //   61  111:ldc1            #103 <Float 16F>
    //   62  113:fload_3         
    //   63  114:fmul            
    //   64  115:fadd            
    //   65  116:f2i             
    //   66  117:putfield        #105 <Field int mTabPadding>
    //   67  120:aload_0         
    //   68  121:ldc1            #93  <Float 0.5F>
    //   69  123:fconst_1        
    //   70  124:fload_3         
    //   71  125:fmul            
    //   72  126:fadd            
    //   73  127:f2i             
    //   74  128:putfield        #107 <Field int mFullUnderlineHeight>
    //   75  131:aload_0         
    //   76  132:ldc1            #93  <Float 0.5F>
    //   77  134:ldc1            #108 <Float 32F>
    //   78  136:fload_3         
    //   79  137:fmul            
    //   80  138:fadd            
    //   81  139:f2i             
    //   82  140:putfield        #110 <Field int mMinStripHeight>
    //   83  143:aload_0         
    //   84  144:aload_1         
    //   85  145:invokestatic    #116 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   86  148:invokevirtual   #120 <Method int ViewConfiguration.getScaledTouchSlop()>
    //   87  151:putfield        #122 <Field int mTouchSlop>
    //   88  154:aload_0         
    //   89  155:aload_0         
    //   90  156:invokevirtual   #125 <Method int getPaddingLeft()>
    //   91  159:aload_0         
    //   92  160:invokevirtual   #128 <Method int getPaddingTop()>
    //   93  163:aload_0         
    //   94  164:invokevirtual   #131 <Method int getPaddingRight()>
    //   95  167:aload_0         
    //   96  168:invokevirtual   #134 <Method int getPaddingBottom()>
    //   97  171:invokevirtual   #138 <Method void setPadding(int, int, int, int)>
    //   98  174:aload_0         
    //   99  175:aload_0         
    //  100  176:invokevirtual   #141 <Method int getTextSpacing()>
    //  101  179:invokevirtual   #144 <Method void setTextSpacing(int)>
    //  102  182:aload_0         
    //  103  183:iconst_0        
    //  104  184:invokevirtual   #148 <Method void setWillNotDraw(boolean)>
    //  105  187:aload_0         
    //  106  188:getfield        #152 <Field TextView mPrevText>
    //  107  191:iconst_1        
    //  108  192:invokevirtual   #157 <Method void TextView.setFocusable(boolean)>
    //  109  195:aload_0         
    //  110  196:getfield        #152 <Field TextView mPrevText>
    //  111  199:new             #159 <Class PagerTabStrip$1>
    //  112  202:dup             
    //  113  203:aload_0         
    //  114  204:invokespecial   #162 <Method void PagerTabStrip$1(PagerTabStrip)>
    //  115  207:invokevirtual   #166 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
    //  116  210:aload_0         
    //  117  211:getfield        #169 <Field TextView mNextText>
    //  118  214:iconst_1        
    //  119  215:invokevirtual   #157 <Method void TextView.setFocusable(boolean)>
    //  120  218:aload_0         
    //  121  219:getfield        #169 <Field TextView mNextText>
    //  122  222:new             #171 <Class PagerTabStrip$2>
    //  123  225:dup             
    //  124  226:aload_0         
    //  125  227:invokespecial   #172 <Method void PagerTabStrip$2(PagerTabStrip)>
    //  126  230:invokevirtual   #166 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
    //  127  233:aload_0         
    //  128  234:invokevirtual   #176 <Method Drawable getBackground()>
    //  129  237:ifnonnull       245
    //  130  240:aload_0         
    //  131  241:iconst_1        
    //  132  242:putfield        #64  <Field boolean mDrawFullUnderline>
    //  133  245:return          
    }

    public boolean getDrawFullUnderline()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field boolean mDrawFullUnderline>
    //    2    4:ireturn         
    }

    int getMinHeight()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #181 <Method int PagerTitleStrip.getMinHeight()>
    //    2    4:aload_0         
    //    3    5:getfield        #110 <Field int mMinStripHeight>
    //    4    8:invokestatic    #187 <Method int Math.max(int, int)>
    //    5   11:ireturn         
    }

    public int getTabIndicatorColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field int mIndicatorColor>
    //    2    4:ireturn         
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #192 <Method void PagerTitleStrip.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #195 <Method int getHeight()>
    //    5    9:istore_2        
    //    6   10:aload_0         
    //    7   11:getfield        #198 <Field TextView mCurrText>
    //    8   14:invokevirtual   #201 <Method int TextView.getLeft()>
    //    9   17:aload_0         
    //   10   18:getfield        #105 <Field int mTabPadding>
    //   11   21:isub            
    //   12   22:istore_3        
    //   13   23:aload_0         
    //   14   24:getfield        #198 <Field TextView mCurrText>
    //   15   27:invokevirtual   #204 <Method int TextView.getRight()>
    //   16   30:aload_0         
    //   17   31:getfield        #105 <Field int mTabPadding>
    //   18   34:iadd            
    //   19   35:istore          4
    //   20   37:iload_2         
    //   21   38:aload_0         
    //   22   39:getfield        #96  <Field int mIndicatorHeight>
    //   23   42:isub            
    //   24   43:istore          5
    //   25   45:aload_0         
    //   26   46:getfield        #55  <Field Paint mTabPaint>
    //   27   49:aload_0         
    //   28   50:getfield        #62  <Field int mTabAlpha>
    //   29   53:bipush          24
    //   30   55:ishl            
    //   31   56:ldc1            #205 <Int 0xffffff>
    //   32   58:aload_0         
    //   33   59:getfield        #71  <Field int mIndicatorColor>
    //   34   62:iand            
    //   35   63:ior             
    //   36   64:invokevirtual   #75  <Method void Paint.setColor(int)>
    //   37   67:aload_1         
    //   38   68:iload_3         
    //   39   69:i2f             
    //   40   70:iload           5
    //   41   72:i2f             
    //   42   73:iload           4
    //   43   75:i2f             
    //   44   76:iload_2         
    //   45   77:i2f             
    //   46   78:aload_0         
    //   47   79:getfield        #55  <Field Paint mTabPaint>
    //   48   82:invokevirtual   #211 <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //   49   85:aload_0         
    //   50   86:getfield        #64  <Field boolean mDrawFullUnderline>
    //   51   89:ifeq            141
    //   52   92:aload_0         
    //   53   93:getfield        #55  <Field Paint mTabPaint>
    //   54   96:ldc1            #212 <Int 0xff000000>
    //   55   98:ldc1            #205 <Int 0xffffff>
    //   56  100:aload_0         
    //   57  101:getfield        #71  <Field int mIndicatorColor>
    //   58  104:iand            
    //   59  105:ior             
    //   60  106:invokevirtual   #75  <Method void Paint.setColor(int)>
    //   61  109:aload_1         
    //   62  110:aload_0         
    //   63  111:invokevirtual   #125 <Method int getPaddingLeft()>
    //   64  114:i2f             
    //   65  115:iload_2         
    //   66  116:aload_0         
    //   67  117:getfield        #107 <Field int mFullUnderlineHeight>
    //   68  120:isub            
    //   69  121:i2f             
    //   70  122:aload_0         
    //   71  123:invokevirtual   #215 <Method int getWidth()>
    //   72  126:aload_0         
    //   73  127:invokevirtual   #131 <Method int getPaddingRight()>
    //   74  130:isub            
    //   75  131:i2f             
    //   76  132:iload_2         
    //   77  133:i2f             
    //   78  134:aload_0         
    //   79  135:getfield        #55  <Field Paint mTabPaint>
    //   80  138:invokevirtual   #211 <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //   81  141:return          
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #222 <Method int MotionEvent.getAction()>
    //    2    4:istore_2        
    //    3    5:iload_2         
    //    4    6:ifeq            18
    //    5    9:aload_0         
    //    6   10:getfield        #224 <Field boolean mIgnoreTap>
    //    7   13:ifeq            18
    //    8   16:iconst_0        
    //    9   17:ireturn         
    //   10   18:aload_1         
    //   11   19:invokevirtual   #228 <Method float MotionEvent.getX()>
    //   12   22:fstore_3        
    //   13   23:aload_1         
    //   14   24:invokevirtual   #231 <Method float MotionEvent.getY()>
    //   15   27:fstore          4
    //   16   29:iload_2         
    //   17   30:tableswitch     0 2: default 56
    //                   0 58
    //                   1 122
    //                   2 77
    //   18   56:iconst_1        
    //   19   57:ireturn         
    //   20   58:aload_0         
    //   21   59:fload_3         
    //   22   60:putfield        #233 <Field float mInitialMotionX>
    //   23   63:aload_0         
    //   24   64:fload           4
    //   25   66:putfield        #235 <Field float mInitialMotionY>
    //   26   69:aload_0         
    //   27   70:iconst_0        
    //   28   71:putfield        #224 <Field boolean mIgnoreTap>
    //   29   74:goto            56
    //   30   77:fload_3         
    //   31   78:aload_0         
    //   32   79:getfield        #233 <Field float mInitialMotionX>
    //   33   82:fsub            
    //   34   83:invokestatic    #239 <Method float Math.abs(float)>
    //   35   86:aload_0         
    //   36   87:getfield        #122 <Field int mTouchSlop>
    //   37   90:i2f             
    //   38   91:fcmpl           
    //   39   92:ifgt            114
    //   40   95:fload           4
    //   41   97:aload_0         
    //   42   98:getfield        #235 <Field float mInitialMotionY>
    //   43  101:fsub            
    //   44  102:invokestatic    #239 <Method float Math.abs(float)>
    //   45  105:aload_0         
    //   46  106:getfield        #122 <Field int mTouchSlop>
    //   47  109:i2f             
    //   48  110:fcmpl           
    //   49  111:ifle            56
    //   50  114:aload_0         
    //   51  115:iconst_1        
    //   52  116:putfield        #224 <Field boolean mIgnoreTap>
    //   53  119:goto            56
    //   54  122:fload_3         
    //   55  123:aload_0         
    //   56  124:getfield        #198 <Field TextView mCurrText>
    //   57  127:invokevirtual   #201 <Method int TextView.getLeft()>
    //   58  130:aload_0         
    //   59  131:getfield        #105 <Field int mTabPadding>
    //   60  134:isub            
    //   61  135:i2f             
    //   62  136:fcmpg           
    //   63  137:ifge            159
    //   64  140:aload_0         
    //   65  141:getfield        #243 <Field ViewPager mPager>
    //   66  144:iconst_m1       
    //   67  145:aload_0         
    //   68  146:getfield        #243 <Field ViewPager mPager>
    //   69  149:invokevirtual   #248 <Method int ViewPager.getCurrentItem()>
    //   70  152:iadd            
    //   71  153:invokevirtual   #251 <Method void ViewPager.setCurrentItem(int)>
    //   72  156:goto            56
    //   73  159:fload_3         
    //   74  160:aload_0         
    //   75  161:getfield        #198 <Field TextView mCurrText>
    //   76  164:invokevirtual   #204 <Method int TextView.getRight()>
    //   77  167:aload_0         
    //   78  168:getfield        #105 <Field int mTabPadding>
    //   79  171:iadd            
    //   80  172:i2f             
    //   81  173:fcmpl           
    //   82  174:ifle            56
    //   83  177:aload_0         
    //   84  178:getfield        #243 <Field ViewPager mPager>
    //   85  181:iconst_1        
    //   86  182:aload_0         
    //   87  183:getfield        #243 <Field ViewPager mPager>
    //   88  186:invokevirtual   #248 <Method int ViewPager.getCurrentItem()>
    //   89  189:iadd            
    //   90  190:invokevirtual   #251 <Method void ViewPager.setCurrentItem(int)>
    //   91  193:goto            56
    }

    public void setBackgroundColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #254 <Method void PagerTitleStrip.setBackgroundColor(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #66  <Field boolean mDrawFullUnderlineSet>
    //    5    9:ifne            26
    //    6   12:ldc1            #212 <Int 0xff000000>
    //    7   14:iload_1         
    //    8   15:iand            
    //    9   16:ifne            27
    //   10   19:iconst_1        
    //   11   20:istore_2        
    //   12   21:aload_0         
    //   13   22:iload_2         
    //   14   23:putfield        #64  <Field boolean mDrawFullUnderline>
    //   15   26:return          
    //   16   27:iconst_0        
    //   17   28:istore_2        
    //   18   29:goto            21
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #258 <Method void PagerTitleStrip.setBackgroundDrawable(Drawable)>
    //    3    5:aload_0         
    //    4    6:getfield        #66  <Field boolean mDrawFullUnderlineSet>
    //    5    9:ifne            23
    //    6   12:aload_1         
    //    7   13:ifnonnull       24
    //    8   16:iconst_1        
    //    9   17:istore_2        
    //   10   18:aload_0         
    //   11   19:iload_2         
    //   12   20:putfield        #64  <Field boolean mDrawFullUnderline>
    //   13   23:return          
    //   14   24:iconst_0        
    //   15   25:istore_2        
    //   16   26:goto            18
    }

    public void setBackgroundResource(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #261 <Method void PagerTitleStrip.setBackgroundResource(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #66  <Field boolean mDrawFullUnderlineSet>
    //    5    9:ifne            23
    //    6   12:iload_1         
    //    7   13:ifne            24
    //    8   16:iconst_1        
    //    9   17:istore_2        
    //   10   18:aload_0         
    //   11   19:iload_2         
    //   12   20:putfield        #64  <Field boolean mDrawFullUnderline>
    //   13   23:return          
    //   14   24:iconst_0        
    //   15   25:istore_2        
    //   16   26:goto            18
    }

    public void setDrawFullUnderline(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #64  <Field boolean mDrawFullUnderline>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #66  <Field boolean mDrawFullUnderlineSet>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #265 <Method void invalidate()>
    //    8   14:return          
    }

    public void setPadding(int i, int j, int k, int l)
    {
    //    0    0:iload           4
    //    1    2:aload_0         
    //    2    3:getfield        #99  <Field int mMinPaddingBottom>
    //    3    6:icmpge          15
    //    4    9:aload_0         
    //    5   10:getfield        #99  <Field int mMinPaddingBottom>
    //    6   13:istore          4
    //    7   15:aload_0         
    //    8   16:iload_1         
    //    9   17:iload_2         
    //   10   18:iload_3         
    //   11   19:iload           4
    //   12   21:invokespecial   #266 <Method void PagerTitleStrip.setPadding(int, int, int, int)>
    //   13   24:return          
    }

    public void setTabIndicatorColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #71  <Field int mIndicatorColor>
    //    3    5:aload_0         
    //    4    6:getfield        #55  <Field Paint mTabPaint>
    //    5    9:aload_0         
    //    6   10:getfield        #71  <Field int mIndicatorColor>
    //    7   13:invokevirtual   #75  <Method void Paint.setColor(int)>
    //    8   16:aload_0         
    //    9   17:invokevirtual   #265 <Method void invalidate()>
    //   10   20:return          
    }

    public void setTabIndicatorColorResource(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #272 <Method Context getContext()>
    //    3    5:invokevirtual   #81  <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #276 <Method int Resources.getColor(int)>
    //    6   12:invokevirtual   #278 <Method void setTabIndicatorColor(int)>
    //    7   15:return          
    }

    public void setTextSpacing(int i)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #102 <Field int mMinTextSpacing>
    //    3    5:icmpge          13
    //    4    8:aload_0         
    //    5    9:getfield        #102 <Field int mMinTextSpacing>
    //    6   12:istore_1        
    //    7   13:aload_0         
    //    8   14:iload_1         
    //    9   15:invokespecial   #279 <Method void PagerTitleStrip.setTextSpacing(int)>
    //   10   18:return          
    }

    void updateTextPositions(int i, float f, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field Rect mTempRect>
    //    2    4:astore          4
    //    3    6:aload_0         
    //    4    7:invokevirtual   #195 <Method int getHeight()>
    //    5   10:istore          5
    //    6   12:aload_0         
    //    7   13:getfield        #198 <Field TextView mCurrText>
    //    8   16:invokevirtual   #201 <Method int TextView.getLeft()>
    //    9   19:aload_0         
    //   10   20:getfield        #105 <Field int mTabPadding>
    //   11   23:isub            
    //   12   24:istore          6
    //   13   26:aload_0         
    //   14   27:getfield        #198 <Field TextView mCurrText>
    //   15   30:invokevirtual   #204 <Method int TextView.getRight()>
    //   16   33:aload_0         
    //   17   34:getfield        #105 <Field int mTabPadding>
    //   18   37:iadd            
    //   19   38:istore          7
    //   20   40:iload           5
    //   21   42:aload_0         
    //   22   43:getfield        #96  <Field int mIndicatorHeight>
    //   23   46:isub            
    //   24   47:istore          8
    //   25   49:aload           4
    //   26   51:iload           6
    //   27   53:iload           8
    //   28   55:iload           7
    //   29   57:iload           5
    //   30   59:invokevirtual   #284 <Method void Rect.set(int, int, int, int)>
    //   31   62:aload_0         
    //   32   63:iload_1         
    //   33   64:fload_2         
    //   34   65:iload_3         
    //   35   66:invokespecial   #286 <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
    //   36   69:aload_0         
    //   37   70:ldc2            #287 <Float 255F>
    //   38   73:fconst_2        
    //   39   74:fload_2         
    //   40   75:ldc1            #93  <Float 0.5F>
    //   41   77:fsub            
    //   42   78:invokestatic    #239 <Method float Math.abs(float)>
    //   43   81:fmul            
    //   44   82:fmul            
    //   45   83:f2i             
    //   46   84:putfield        #62  <Field int mTabAlpha>
    //   47   87:aload           4
    //   48   89:aload_0         
    //   49   90:getfield        #198 <Field TextView mCurrText>
    //   50   93:invokevirtual   #201 <Method int TextView.getLeft()>
    //   51   96:aload_0         
    //   52   97:getfield        #105 <Field int mTabPadding>
    //   53  100:isub            
    //   54  101:iload           8
    //   55  103:aload_0         
    //   56  104:getfield        #198 <Field TextView mCurrText>
    //   57  107:invokevirtual   #204 <Method int TextView.getRight()>
    //   58  110:aload_0         
    //   59  111:getfield        #105 <Field int mTabPadding>
    //   60  114:iadd            
    //   61  115:iload           5
    //   62  117:invokevirtual   #290 <Method void Rect.union(int, int, int, int)>
    //   63  120:aload_0         
    //   64  121:aload           4
    //   65  123:invokevirtual   #293 <Method void invalidate(Rect)>
    //   66  126:return          
    }

    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 32;
    private static final int MIN_TEXT_SPACING = 64;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 32;
    private static final String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    // Unreferenced inner class android/support/v4/view/PagerTabStrip$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field PagerTabStrip this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field PagerTabStrip this$0>
        //    2    4:getfield        #25  <Field ViewPager PagerTabStrip.mPager>
        //    3    7:iconst_m1       
        //    4    8:aload_0         
        //    5    9:getfield        #16  <Field PagerTabStrip this$0>
        //    6   12:getfield        #25  <Field ViewPager PagerTabStrip.mPager>
        //    7   15:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
        //    8   18:iadd            
        //    9   19:invokevirtual   #35  <Method void ViewPager.setCurrentItem(int)>
        //   10   22:return          
        }

        final PagerTabStrip this$0;
    }


    // Unreferenced inner class android/support/v4/view/PagerTabStrip$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field PagerTabStrip this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field PagerTabStrip this$0>
        //    2    4:getfield        #25  <Field ViewPager PagerTabStrip.mPager>
        //    3    7:iconst_1        
        //    4    8:aload_0         
        //    5    9:getfield        #16  <Field PagerTabStrip this$0>
        //    6   12:getfield        #25  <Field ViewPager PagerTabStrip.mPager>
        //    7   15:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
        //    8   18:iadd            
        //    9   19:invokevirtual   #35  <Method void ViewPager.setCurrentItem(int)>
        //   10   22:return          
        }

        final PagerTabStrip this$0;
    }

}
