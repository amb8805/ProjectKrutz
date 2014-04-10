// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.view.ActionMode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    public ActionBarContainer(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #21  <Method void ActionBarContainer(Context, AttributeSet)>
    //    4    6:return          
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:aload_2         
    //    5    5:invokespecial   #22  <Method void FrameLayout(Context, AttributeSet)>
    //    6    8:aload_0         
    //    7    9:aconst_null     
    //    8   10:invokevirtual   #26  <Method void setBackgroundDrawable(Drawable)>
    //    9   13:aload_1         
    //   10   14:aload_2         
    //   11   15:getstatic       #32  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
    //   12   18:invokevirtual   #38  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   13   21:astore          4
    //   14   23:aload_0         
    //   15   24:aload           4
    //   16   26:bipush          10
    //   17   28:invokevirtual   #44  <Method Drawable TypedArray.getDrawable(int)>
    //   18   31:putfield        #46  <Field Drawable mBackground>
    //   19   34:aload_0         
    //   20   35:aload           4
    //   21   37:bipush          11
    //   22   39:invokevirtual   #44  <Method Drawable TypedArray.getDrawable(int)>
    //   23   42:putfield        #48  <Field Drawable mStackedBackground>
    //   24   45:aload_0         
    //   25   46:invokevirtual   #52  <Method int getId()>
    //   26   49:getstatic       #58  <Field int android.support.v7.appcompat.R$id.split_action_bar>
    //   27   52:icmpne          71
    //   28   55:aload_0         
    //   29   56:iload_3         
    //   30   57:putfield        #60  <Field boolean mIsSplit>
    //   31   60:aload_0         
    //   32   61:aload           4
    //   33   63:bipush          12
    //   34   65:invokevirtual   #44  <Method Drawable TypedArray.getDrawable(int)>
    //   35   68:putfield        #62  <Field Drawable mSplitBackground>
    //   36   71:aload           4
    //   37   73:invokevirtual   #66  <Method void TypedArray.recycle()>
    //   38   76:aload_0         
    //   39   77:getfield        #60  <Field boolean mIsSplit>
    //   40   80:ifeq            101
    //   41   83:aload_0         
    //   42   84:getfield        #62  <Field Drawable mSplitBackground>
    //   43   87:ifnonnull       96
    //   44   90:aload_0         
    //   45   91:iload_3         
    //   46   92:invokevirtual   #70  <Method void setWillNotDraw(boolean)>
    //   47   95:return          
    //   48   96:iconst_0        
    //   49   97:istore_3        
    //   50   98:goto            90
    //   51  101:aload_0         
    //   52  102:getfield        #46  <Field Drawable mBackground>
    //   53  105:ifnonnull       115
    //   54  108:aload_0         
    //   55  109:getfield        #48  <Field Drawable mStackedBackground>
    //   56  112:ifnull          90
    //   57  115:iconst_0        
    //   58  116:istore_3        
    //   59  117:goto            90
    }

    protected void drawableStateChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #73  <Method void FrameLayout.drawableStateChanged()>
    //    2    4:aload_0         
    //    3    5:getfield        #46  <Field Drawable mBackground>
    //    4    8:ifnull          33
    //    5   11:aload_0         
    //    6   12:getfield        #46  <Field Drawable mBackground>
    //    7   15:invokevirtual   #79  <Method boolean Drawable.isStateful()>
    //    8   18:ifeq            33
    //    9   21:aload_0         
    //   10   22:getfield        #46  <Field Drawable mBackground>
    //   11   25:aload_0         
    //   12   26:invokevirtual   #83  <Method int[] getDrawableState()>
    //   13   29:invokevirtual   #87  <Method boolean Drawable.setState(int[])>
    //   14   32:pop             
    //   15   33:aload_0         
    //   16   34:getfield        #48  <Field Drawable mStackedBackground>
    //   17   37:ifnull          62
    //   18   40:aload_0         
    //   19   41:getfield        #48  <Field Drawable mStackedBackground>
    //   20   44:invokevirtual   #79  <Method boolean Drawable.isStateful()>
    //   21   47:ifeq            62
    //   22   50:aload_0         
    //   23   51:getfield        #48  <Field Drawable mStackedBackground>
    //   24   54:aload_0         
    //   25   55:invokevirtual   #83  <Method int[] getDrawableState()>
    //   26   58:invokevirtual   #87  <Method boolean Drawable.setState(int[])>
    //   27   61:pop             
    //   28   62:aload_0         
    //   29   63:getfield        #62  <Field Drawable mSplitBackground>
    //   30   66:ifnull          91
    //   31   69:aload_0         
    //   32   70:getfield        #62  <Field Drawable mSplitBackground>
    //   33   73:invokevirtual   #79  <Method boolean Drawable.isStateful()>
    //   34   76:ifeq            91
    //   35   79:aload_0         
    //   36   80:getfield        #62  <Field Drawable mSplitBackground>
    //   37   83:aload_0         
    //   38   84:invokevirtual   #83  <Method int[] getDrawableState()>
    //   39   87:invokevirtual   #87  <Method boolean Drawable.setState(int[])>
    //   40   90:pop             
    //   41   91:return          
    }

    public View getTabContainer()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field View mTabContainer>
    //    2    4:areturn         
    }

    public void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #96  <Method int getWidth()>
    //    2    4:ifeq            14
    //    3    7:aload_0         
    //    4    8:invokevirtual   #99  <Method int getHeight()>
    //    5   11:ifne            15
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:getfield        #60  <Field boolean mIsSplit>
    //    9   19:ifeq            38
    //   10   22:aload_0         
    //   11   23:getfield        #62  <Field Drawable mSplitBackground>
    //   12   26:ifnull          14
    //   13   29:aload_0         
    //   14   30:getfield        #62  <Field Drawable mSplitBackground>
    //   15   33:aload_1         
    //   16   34:invokevirtual   #102 <Method void Drawable.draw(Canvas)>
    //   17   37:return          
    //   18   38:aload_0         
    //   19   39:getfield        #46  <Field Drawable mBackground>
    //   20   42:ifnull          53
    //   21   45:aload_0         
    //   22   46:getfield        #46  <Field Drawable mBackground>
    //   23   49:aload_1         
    //   24   50:invokevirtual   #102 <Method void Drawable.draw(Canvas)>
    //   25   53:aload_0         
    //   26   54:getfield        #48  <Field Drawable mStackedBackground>
    //   27   57:ifnull          14
    //   28   60:aload_0         
    //   29   61:getfield        #104 <Field boolean mIsStacked>
    //   30   64:ifeq            14
    //   31   67:aload_0         
    //   32   68:getfield        #48  <Field Drawable mStackedBackground>
    //   33   71:aload_1         
    //   34   72:invokevirtual   #102 <Method void Drawable.draw(Canvas)>
    //   35   75:return          
    }

    public void onFinishInflate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #107 <Method void FrameLayout.onFinishInflate()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getstatic       #110 <Field int android.support.v7.appcompat.R$id.action_bar>
    //    5    9:invokevirtual   #114 <Method View findViewById(int)>
    //    6   12:checkcast       #116 <Class ActionBarView>
    //    7   15:putfield        #118 <Field ActionBarView mActionBarView>
    //    8   18:return          
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field boolean mIsTransitioning>
    //    2    4:ifne            15
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #125 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:iload           5
    //    6    8:invokespecial   #129 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
    //    7   11:aload_0         
    //    8   12:getfield        #91  <Field View mTabContainer>
    //    9   15:ifnull          118
    //   10   18:aload_0         
    //   11   19:getfield        #91  <Field View mTabContainer>
    //   12   22:invokevirtual   #134 <Method int View.getVisibility()>
    //   13   25:bipush          8
    //   14   27:icmpeq          118
    //   15   30:iconst_1        
    //   16   31:istore          6
    //   17   33:aload_0         
    //   18   34:getfield        #91  <Field View mTabContainer>
    //   19   37:ifnull          157
    //   20   40:aload_0         
    //   21   41:getfield        #91  <Field View mTabContainer>
    //   22   44:invokevirtual   #134 <Method int View.getVisibility()>
    //   23   47:bipush          8
    //   24   49:icmpeq          157
    //   25   52:aload_0         
    //   26   53:invokevirtual   #137 <Method int getMeasuredHeight()>
    //   27   56:istore          11
    //   28   58:aload_0         
    //   29   59:getfield        #91  <Field View mTabContainer>
    //   30   62:invokevirtual   #138 <Method int View.getMeasuredHeight()>
    //   31   65:istore          12
    //   32   67:iconst_2        
    //   33   68:aload_0         
    //   34   69:getfield        #118 <Field ActionBarView mActionBarView>
    //   35   72:invokevirtual   #141 <Method int ActionBarView.getDisplayOptions()>
    //   36   75:iand            
    //   37   76:ifne            208
    //   38   79:aload_0         
    //   39   80:invokevirtual   #144 <Method int getChildCount()>
    //   40   83:istore          13
    //   41   85:iconst_0        
    //   42   86:istore          14
    //   43   88:iload           14
    //   44   90:iload           13
    //   45   92:icmpge          144
    //   46   95:aload_0         
    //   47   96:iload           14
    //   48   98:invokevirtual   #147 <Method View getChildAt(int)>
    //   49  101:astore          15
    //   50  103:aload           15
    //   51  105:aload_0         
    //   52  106:getfield        #91  <Field View mTabContainer>
    //   53  109:if_acmpne       124
    //   54  112:iinc            14  1
    //   55  115:goto            88
    //   56  118:iconst_0        
    //   57  119:istore          6
    //   58  121:goto            33
    //   59  124:aload_0         
    //   60  125:getfield        #118 <Field ActionBarView mActionBarView>
    //   61  128:invokevirtual   #150 <Method boolean ActionBarView.isCollapsed()>
    //   62  131:ifne            112
    //   63  134:aload           15
    //   64  136:iload           12
    //   65  138:invokevirtual   #154 <Method void View.offsetTopAndBottom(int)>
    //   66  141:goto            112
    //   67  144:aload_0         
    //   68  145:getfield        #91  <Field View mTabContainer>
    //   69  148:iload_2         
    //   70  149:iconst_0        
    //   71  150:iload           4
    //   72  152:iload           12
    //   73  154:invokevirtual   #158 <Method void View.layout(int, int, int, int)>
    //   74  157:aload_0         
    //   75  158:getfield        #60  <Field boolean mIsSplit>
    //   76  161:ifeq            228
    //   77  164:aload_0         
    //   78  165:getfield        #62  <Field Drawable mSplitBackground>
    //   79  168:astore          10
    //   80  170:iconst_0        
    //   81  171:istore          8
    //   82  173:aload           10
    //   83  175:ifnull          198
    //   84  178:aload_0         
    //   85  179:getfield        #62  <Field Drawable mSplitBackground>
    //   86  182:iconst_0        
    //   87  183:iconst_0        
    //   88  184:aload_0         
    //   89  185:invokevirtual   #161 <Method int getMeasuredWidth()>
    //   90  188:aload_0         
    //   91  189:invokevirtual   #137 <Method int getMeasuredHeight()>
    //   92  192:invokevirtual   #164 <Method void Drawable.setBounds(int, int, int, int)>
    //   93  195:iconst_1        
    //   94  196:istore          8
    //   95  198:iload           8
    //   96  200:ifeq            207
    //   97  203:aload_0         
    //   98  204:invokevirtual   #167 <Method void invalidate()>
    //   99  207:return          
    //  100  208:aload_0         
    //  101  209:getfield        #91  <Field View mTabContainer>
    //  102  212:iload_2         
    //  103  213:iload           11
    //  104  215:iload           12
    //  105  217:isub            
    //  106  218:iload           4
    //  107  220:iload           11
    //  108  222:invokevirtual   #158 <Method void View.layout(int, int, int, int)>
    //  109  225:goto            157
    //  110  228:aload_0         
    //  111  229:getfield        #46  <Field Drawable mBackground>
    //  112  232:astore          7
    //  113  234:iconst_0        
    //  114  235:istore          8
    //  115  237:aload           7
    //  116  239:ifnull          280
    //  117  242:aload_0         
    //  118  243:getfield        #46  <Field Drawable mBackground>
    //  119  246:aload_0         
    //  120  247:getfield        #118 <Field ActionBarView mActionBarView>
    //  121  250:invokevirtual   #170 <Method int ActionBarView.getLeft()>
    //  122  253:aload_0         
    //  123  254:getfield        #118 <Field ActionBarView mActionBarView>
    //  124  257:invokevirtual   #173 <Method int ActionBarView.getTop()>
    //  125  260:aload_0         
    //  126  261:getfield        #118 <Field ActionBarView mActionBarView>
    //  127  264:invokevirtual   #176 <Method int ActionBarView.getRight()>
    //  128  267:aload_0         
    //  129  268:getfield        #118 <Field ActionBarView mActionBarView>
    //  130  271:invokevirtual   #179 <Method int ActionBarView.getBottom()>
    //  131  274:invokevirtual   #164 <Method void Drawable.setBounds(int, int, int, int)>
    //  132  277:iconst_1        
    //  133  278:istore          8
    //  134  280:iload           6
    //  135  282:ifeq            347
    //  136  285:aload_0         
    //  137  286:getfield        #48  <Field Drawable mStackedBackground>
    //  138  289:ifnull          347
    //  139  292:iconst_1        
    //  140  293:istore          9
    //  141  295:aload_0         
    //  142  296:iload           9
    //  143  298:putfield        #104 <Field boolean mIsStacked>
    //  144  301:iload           9
    //  145  303:ifeq            198
    //  146  306:aload_0         
    //  147  307:getfield        #48  <Field Drawable mStackedBackground>
    //  148  310:aload_0         
    //  149  311:getfield        #91  <Field View mTabContainer>
    //  150  314:invokevirtual   #180 <Method int View.getLeft()>
    //  151  317:aload_0         
    //  152  318:getfield        #91  <Field View mTabContainer>
    //  153  321:invokevirtual   #181 <Method int View.getTop()>
    //  154  324:aload_0         
    //  155  325:getfield        #91  <Field View mTabContainer>
    //  156  328:invokevirtual   #182 <Method int View.getRight()>
    //  157  331:aload_0         
    //  158  332:getfield        #91  <Field View mTabContainer>
    //  159  335:invokevirtual   #183 <Method int View.getBottom()>
    //  160  338:invokevirtual   #164 <Method void Drawable.setBounds(int, int, int, int)>
    //  161  341:iconst_1        
    //  162  342:istore          8
    //  163  344:goto            198
    //  164  347:iconst_0        
    //  165  348:istore          9
    //  166  350:goto            295
    }

    public void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #187 <Method void FrameLayout.onMeasure(int, int)>
    //    4    6:aload_0         
    //    5    7:getfield        #118 <Field ActionBarView mActionBarView>
    //    6   10:ifnonnull       14
    //    7   13:return          
    //    8   14:aload_0         
    //    9   15:getfield        #118 <Field ActionBarView mActionBarView>
    //   10   18:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams ActionBarView.getLayoutParams()>
    //   11   21:checkcast       #193 <Class android.widget.FrameLayout$LayoutParams>
    //   12   24:astore_3        
    //   13   25:aload_0         
    //   14   26:getfield        #118 <Field ActionBarView mActionBarView>
    //   15   29:invokevirtual   #150 <Method boolean ActionBarView.isCollapsed()>
    //   16   32:ifeq            96
    //   17   35:iconst_0        
    //   18   36:istore          4
    //   19   38:aload_0         
    //   20   39:getfield        #91  <Field View mTabContainer>
    //   21   42:ifnull          13
    //   22   45:aload_0         
    //   23   46:getfield        #91  <Field View mTabContainer>
    //   24   49:invokevirtual   #134 <Method int View.getVisibility()>
    //   25   52:bipush          8
    //   26   54:icmpeq          13
    //   27   57:iload_2         
    //   28   58:invokestatic    #199 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   29   61:ldc1            #200 <Int 0x80000000>
    //   30   63:icmpne          13
    //   31   66:iload_2         
    //   32   67:invokestatic    #203 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   33   70:istore          5
    //   34   72:aload_0         
    //   35   73:aload_0         
    //   36   74:invokevirtual   #161 <Method int getMeasuredWidth()>
    //   37   77:iload           4
    //   38   79:aload_0         
    //   39   80:getfield        #91  <Field View mTabContainer>
    //   40   83:invokevirtual   #138 <Method int View.getMeasuredHeight()>
    //   41   86:iadd            
    //   42   87:iload           5
    //   43   89:invokestatic    #209 <Method int Math.min(int, int)>
    //   44   92:invokevirtual   #212 <Method void setMeasuredDimension(int, int)>
    //   45   95:return          
    //   46   96:aload_0         
    //   47   97:getfield        #118 <Field ActionBarView mActionBarView>
    //   48  100:invokevirtual   #213 <Method int ActionBarView.getMeasuredHeight()>
    //   49  103:aload_3         
    //   50  104:getfield        #216 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
    //   51  107:iadd            
    //   52  108:aload_3         
    //   53  109:getfield        #219 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
    //   54  112:iadd            
    //   55  113:istore          4
    //   56  115:goto            38
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #222 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
    //    3    5:pop             
    //    4    6:iconst_1        
    //    5    7:ireturn         
    }

    public void setPrimaryBackground(Drawable drawable)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #46  <Field Drawable mBackground>
    //    4    6:ifnull          25
    //    5    9:aload_0         
    //    6   10:getfield        #46  <Field Drawable mBackground>
    //    7   13:aconst_null     
    //    8   14:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #46  <Field Drawable mBackground>
    //   12   22:invokevirtual   #230 <Method void unscheduleDrawable(Drawable)>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:putfield        #46  <Field Drawable mBackground>
    //   16   30:aload_1         
    //   17   31:ifnull          39
    //   18   34:aload_1         
    //   19   35:aload_0         
    //   20   36:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //   21   39:aload_0         
    //   22   40:getfield        #60  <Field boolean mIsSplit>
    //   23   43:ifeq            68
    //   24   46:aload_0         
    //   25   47:getfield        #62  <Field Drawable mSplitBackground>
    //   26   50:ifnonnull       63
    //   27   53:aload_0         
    //   28   54:iload_2         
    //   29   55:invokevirtual   #70  <Method void setWillNotDraw(boolean)>
    //   30   58:aload_0         
    //   31   59:invokevirtual   #167 <Method void invalidate()>
    //   32   62:return          
    //   33   63:iconst_0        
    //   34   64:istore_2        
    //   35   65:goto            53
    //   36   68:aload_0         
    //   37   69:getfield        #46  <Field Drawable mBackground>
    //   38   72:ifnonnull       82
    //   39   75:aload_0         
    //   40   76:getfield        #48  <Field Drawable mStackedBackground>
    //   41   79:ifnull          53
    //   42   82:iconst_0        
    //   43   83:istore_2        
    //   44   84:goto            53
    }

    public void setSplitBackground(Drawable drawable)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #62  <Field Drawable mSplitBackground>
    //    4    6:ifnull          25
    //    5    9:aload_0         
    //    6   10:getfield        #62  <Field Drawable mSplitBackground>
    //    7   13:aconst_null     
    //    8   14:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #62  <Field Drawable mSplitBackground>
    //   12   22:invokevirtual   #230 <Method void unscheduleDrawable(Drawable)>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:putfield        #62  <Field Drawable mSplitBackground>
    //   16   30:aload_1         
    //   17   31:ifnull          39
    //   18   34:aload_1         
    //   19   35:aload_0         
    //   20   36:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //   21   39:aload_0         
    //   22   40:getfield        #60  <Field boolean mIsSplit>
    //   23   43:ifeq            68
    //   24   46:aload_0         
    //   25   47:getfield        #62  <Field Drawable mSplitBackground>
    //   26   50:ifnonnull       63
    //   27   53:aload_0         
    //   28   54:iload_2         
    //   29   55:invokevirtual   #70  <Method void setWillNotDraw(boolean)>
    //   30   58:aload_0         
    //   31   59:invokevirtual   #167 <Method void invalidate()>
    //   32   62:return          
    //   33   63:iconst_0        
    //   34   64:istore_2        
    //   35   65:goto            53
    //   36   68:aload_0         
    //   37   69:getfield        #46  <Field Drawable mBackground>
    //   38   72:ifnonnull       82
    //   39   75:aload_0         
    //   40   76:getfield        #48  <Field Drawable mStackedBackground>
    //   41   79:ifnull          53
    //   42   82:iconst_0        
    //   43   83:istore_2        
    //   44   84:goto            53
    }

    public void setStackedBackground(Drawable drawable)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #48  <Field Drawable mStackedBackground>
    //    4    6:ifnull          25
    //    5    9:aload_0         
    //    6   10:getfield        #48  <Field Drawable mStackedBackground>
    //    7   13:aconst_null     
    //    8   14:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //    9   17:aload_0         
    //   10   18:aload_0         
    //   11   19:getfield        #48  <Field Drawable mStackedBackground>
    //   12   22:invokevirtual   #230 <Method void unscheduleDrawable(Drawable)>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:putfield        #48  <Field Drawable mStackedBackground>
    //   16   30:aload_1         
    //   17   31:ifnull          39
    //   18   34:aload_1         
    //   19   35:aload_0         
    //   20   36:invokevirtual   #227 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //   21   39:aload_0         
    //   22   40:getfield        #60  <Field boolean mIsSplit>
    //   23   43:ifeq            68
    //   24   46:aload_0         
    //   25   47:getfield        #62  <Field Drawable mSplitBackground>
    //   26   50:ifnonnull       63
    //   27   53:aload_0         
    //   28   54:iload_2         
    //   29   55:invokevirtual   #70  <Method void setWillNotDraw(boolean)>
    //   30   58:aload_0         
    //   31   59:invokevirtual   #167 <Method void invalidate()>
    //   32   62:return          
    //   33   63:iconst_0        
    //   34   64:istore_2        
    //   35   65:goto            53
    //   36   68:aload_0         
    //   37   69:getfield        #46  <Field Drawable mBackground>
    //   38   72:ifnonnull       82
    //   39   75:aload_0         
    //   40   76:getfield        #48  <Field Drawable mStackedBackground>
    //   41   79:ifnull          53
    //   42   82:iconst_0        
    //   43   83:istore_2        
    //   44   84:goto            53
    }

    public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field View mTabContainer>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #91  <Field View mTabContainer>
    //    6   12:invokevirtual   #238 <Method void removeView(View)>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #91  <Field View mTabContainer>
    //   10   20:aload_1         
    //   11   21:ifnull          50
    //   12   24:aload_0         
    //   13   25:aload_1         
    //   14   26:invokevirtual   #241 <Method void addView(View)>
    //   15   29:aload_1         
    //   16   30:invokevirtual   #244 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
    //   17   33:astore_2        
    //   18   34:aload_2         
    //   19   35:iconst_m1       
    //   20   36:putfield        #249 <Field int android.view.ViewGroup$LayoutParams.width>
    //   21   39:aload_2         
    //   22   40:bipush          -2
    //   23   42:putfield        #252 <Field int android.view.ViewGroup$LayoutParams.height>
    //   24   45:aload_1         
    //   25   46:iconst_0        
    //   26   47:invokevirtual   #255 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
    //   27   50:return          
    }

    public void setTransitioning(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #123 <Field boolean mIsTransitioning>
    //    3    5:iload_1         
    //    4    6:ifeq            19
    //    5    9:ldc2            #257 <Int 0x60000>
    //    6   12:istore_2        
    //    7   13:aload_0         
    //    8   14:iload_2         
    //    9   15:invokevirtual   #260 <Method void setDescendantFocusability(int)>
    //   10   18:return          
    //   11   19:ldc2            #261 <Int 0x40000>
    //   12   22:istore_2        
    //   13   23:goto            13
    }

    public void setVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #264 <Method void FrameLayout.setVisibility(int)>
    //    3    5:iload_1         
    //    4    6:ifne            63
    //    5    9:iconst_1        
    //    6   10:istore_2        
    //    7   11:aload_0         
    //    8   12:getfield        #46  <Field Drawable mBackground>
    //    9   15:ifnull          28
    //   10   18:aload_0         
    //   11   19:getfield        #46  <Field Drawable mBackground>
    //   12   22:iload_2         
    //   13   23:iconst_0        
    //   14   24:invokevirtual   #268 <Method boolean Drawable.setVisible(boolean, boolean)>
    //   15   27:pop             
    //   16   28:aload_0         
    //   17   29:getfield        #48  <Field Drawable mStackedBackground>
    //   18   32:ifnull          45
    //   19   35:aload_0         
    //   20   36:getfield        #48  <Field Drawable mStackedBackground>
    //   21   39:iload_2         
    //   22   40:iconst_0        
    //   23   41:invokevirtual   #268 <Method boolean Drawable.setVisible(boolean, boolean)>
    //   24   44:pop             
    //   25   45:aload_0         
    //   26   46:getfield        #62  <Field Drawable mSplitBackground>
    //   27   49:ifnull          62
    //   28   52:aload_0         
    //   29   53:getfield        #62  <Field Drawable mSplitBackground>
    //   30   56:iload_2         
    //   31   57:iconst_0        
    //   32   58:invokevirtual   #268 <Method boolean Drawable.setVisible(boolean, boolean)>
    //   33   61:pop             
    //   34   62:return          
    //   35   63:iconst_0        
    //   36   64:istore_2        
    //   37   65:goto            11
    }

    public ActionMode startActionModeForChild(View view, android.support.v7.view.ActionMode.Callback callback)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #46  <Field Drawable mBackground>
    //    3    5:if_acmpne       15
    //    4    8:aload_0         
    //    5    9:getfield        #60  <Field boolean mIsSplit>
    //    6   12:ifeq            53
    //    7   15:aload_1         
    //    8   16:aload_0         
    //    9   17:getfield        #48  <Field Drawable mStackedBackground>
    //   10   20:if_acmpne       30
    //   11   23:aload_0         
    //   12   24:getfield        #104 <Field boolean mIsStacked>
    //   13   27:ifne            53
    //   14   30:aload_1         
    //   15   31:aload_0         
    //   16   32:getfield        #62  <Field Drawable mSplitBackground>
    //   17   35:if_acmpne       45
    //   18   38:aload_0         
    //   19   39:getfield        #60  <Field boolean mIsSplit>
    //   20   42:ifne            53
    //   21   45:aload_0         
    //   22   46:aload_1         
    //   23   47:invokespecial   #274 <Method boolean FrameLayout.verifyDrawable(Drawable)>
    //   24   50:ifeq            55
    //   25   53:iconst_1        
    //   26   54:ireturn         
    //   27   55:iconst_0        
    //   28   56:ireturn         
    }

    private ActionBarView mActionBarView;
    private Drawable mBackground;
    private boolean mIsSplit;
    private boolean mIsStacked;
    private boolean mIsTransitioning;
    private Drawable mSplitBackground;
    private Drawable mStackedBackground;
    private View mTabContainer;
}
