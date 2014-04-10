// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

class IcsLinearLayout extends LinearLayout
{

    static 
    {
    //    0    0:iconst_3        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #22  <Int 0x1010129>
    //    5    7:iastore         
    //    6    8:dup             
    //    7    9:iconst_1        
    //    8   10:ldc1            #23  <Int 0x1010329>
    //    9   12:iastore         
    //   10   13:dup             
    //   11   14:iconst_2        
    //   12   15:ldc1            #24  <Int 0x101032a>
    //   13   17:iastore         
    //   14   18:putstatic       #26  <Field int[] LL>
    //   15   21:return          
    }

    public IcsLinearLayout(Context context, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #31  <Method void LinearLayout(Context)>
    //    3    5:aload_1         
    //    4    6:aconst_null     
    //    5    7:getstatic       #26  <Field int[] LL>
    //    6   10:iload_2         
    //    7   11:iconst_0        
    //    8   12:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
    //    9   15:astore_3        
    //   10   16:aload_0         
    //   11   17:aload_3         
    //   12   18:iconst_0        
    //   13   19:invokevirtual   #43  <Method Drawable TypedArray.getDrawable(int)>
    //   14   22:invokevirtual   #47  <Method void setDividerDrawable(Drawable)>
    //   15   25:aload_0         
    //   16   26:aload_3         
    //   17   27:iconst_2        
    //   18   28:iconst_0        
    //   19   29:invokevirtual   #51  <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   20   32:putfield        #53  <Field int mDividerPadding>
    //   21   35:aload_0         
    //   22   36:aload_3         
    //   23   37:iconst_1        
    //   24   38:iconst_0        
    //   25   39:invokevirtual   #56  <Method int TypedArray.getInteger(int, int)>
    //   26   42:putfield        #58  <Field int mShowDividers>
    //   27   45:aload_3         
    //   28   46:invokevirtual   #61  <Method void TypedArray.recycle()>
    //   29   49:return          
    }

    private void drawDividersHorizontal(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #67  <Method int getChildCount()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmplt          58
    //    8   12:aload_0         
    //    9   13:iload_2         
    //   10   14:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   11   17:ifeq            57
    //   12   20:aload_0         
    //   13   21:iload_2         
    //   14   22:iconst_1        
    //   15   23:isub            
    //   16   24:invokevirtual   #75  <Method View getChildAt(int)>
    //   17   27:astore          6
    //   18   29:aload           6
    //   19   31:ifnonnull       120
    //   20   34:aload_0         
    //   21   35:invokevirtual   #78  <Method int getWidth()>
    //   22   38:aload_0         
    //   23   39:invokevirtual   #81  <Method int getPaddingRight()>
    //   24   42:isub            
    //   25   43:aload_0         
    //   26   44:getfield        #83  <Field int mDividerWidth>
    //   27   47:isub            
    //   28   48:istore          7
    //   29   50:aload_0         
    //   30   51:aload_1         
    //   31   52:iload           7
    //   32   54:invokespecial   #87  <Method void drawVerticalDivider(Canvas, int)>
    //   33   57:return          
    //   34   58:aload_0         
    //   35   59:iload_3         
    //   36   60:invokevirtual   #75  <Method View getChildAt(int)>
    //   37   63:astore          4
    //   38   65:aload           4
    //   39   67:ifnull          114
    //   40   70:aload           4
    //   41   72:invokevirtual   #92  <Method int View.getVisibility()>
    //   42   75:bipush          8
    //   43   77:icmpeq          114
    //   44   80:aload_0         
    //   45   81:iload_3         
    //   46   82:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   47   85:ifeq            114
    //   48   88:aload           4
    //   49   90:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   50   93:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   51   96:astore          5
    //   52   98:aload_0         
    //   53   99:aload_1         
    //   54  100:aload           4
    //   55  102:invokevirtual   #101 <Method int View.getLeft()>
    //   56  105:aload           5
    //   57  107:getfield        #104 <Field int android.widget.LinearLayout$LayoutParams.leftMargin>
    //   58  110:isub            
    //   59  111:invokespecial   #87  <Method void drawVerticalDivider(Canvas, int)>
    //   60  114:iinc            3  1
    //   61  117:goto            7
    //   62  120:aload           6
    //   63  122:invokevirtual   #107 <Method int View.getRight()>
    //   64  125:istore          7
    //   65  127:goto            50
    }

    private void drawDividersVertical(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #67  <Method int getChildCount()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmplt          58
    //    8   12:aload_0         
    //    9   13:iload_2         
    //   10   14:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   11   17:ifeq            57
    //   12   20:aload_0         
    //   13   21:iload_2         
    //   14   22:iconst_1        
    //   15   23:isub            
    //   16   24:invokevirtual   #75  <Method View getChildAt(int)>
    //   17   27:astore          6
    //   18   29:aload           6
    //   19   31:ifnonnull       120
    //   20   34:aload_0         
    //   21   35:invokevirtual   #111 <Method int getHeight()>
    //   22   38:aload_0         
    //   23   39:invokevirtual   #114 <Method int getPaddingBottom()>
    //   24   42:isub            
    //   25   43:aload_0         
    //   26   44:getfield        #116 <Field int mDividerHeight>
    //   27   47:isub            
    //   28   48:istore          7
    //   29   50:aload_0         
    //   30   51:aload_1         
    //   31   52:iload           7
    //   32   54:invokespecial   #119 <Method void drawHorizontalDivider(Canvas, int)>
    //   33   57:return          
    //   34   58:aload_0         
    //   35   59:iload_3         
    //   36   60:invokevirtual   #75  <Method View getChildAt(int)>
    //   37   63:astore          4
    //   38   65:aload           4
    //   39   67:ifnull          114
    //   40   70:aload           4
    //   41   72:invokevirtual   #92  <Method int View.getVisibility()>
    //   42   75:bipush          8
    //   43   77:icmpeq          114
    //   44   80:aload_0         
    //   45   81:iload_3         
    //   46   82:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   47   85:ifeq            114
    //   48   88:aload           4
    //   49   90:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   50   93:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   51   96:astore          5
    //   52   98:aload_0         
    //   53   99:aload_1         
    //   54  100:aload           4
    //   55  102:invokevirtual   #122 <Method int View.getTop()>
    //   56  105:aload           5
    //   57  107:getfield        #125 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //   58  110:isub            
    //   59  111:invokespecial   #119 <Method void drawHorizontalDivider(Canvas, int)>
    //   60  114:iinc            3  1
    //   61  117:goto            7
    //   62  120:aload           6
    //   63  122:invokevirtual   #128 <Method int View.getBottom()>
    //   64  125:istore          7
    //   65  127:goto            50
    }

    private void drawHorizontalDivider(Canvas canvas, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #130 <Field Drawable mDivider>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #133 <Method int getPaddingLeft()>
    //    4    8:aload_0         
    //    5    9:getfield        #53  <Field int mDividerPadding>
    //    6   12:iadd            
    //    7   13:iload_2         
    //    8   14:aload_0         
    //    9   15:invokevirtual   #78  <Method int getWidth()>
    //   10   18:aload_0         
    //   11   19:invokevirtual   #81  <Method int getPaddingRight()>
    //   12   22:isub            
    //   13   23:aload_0         
    //   14   24:getfield        #53  <Field int mDividerPadding>
    //   15   27:isub            
    //   16   28:iload_2         
    //   17   29:aload_0         
    //   18   30:getfield        #116 <Field int mDividerHeight>
    //   19   33:iadd            
    //   20   34:invokevirtual   #139 <Method void Drawable.setBounds(int, int, int, int)>
    //   21   37:aload_0         
    //   22   38:getfield        #130 <Field Drawable mDivider>
    //   23   41:aload_1         
    //   24   42:invokevirtual   #142 <Method void Drawable.draw(Canvas)>
    //   25   45:return          
    }

    private void drawVerticalDivider(Canvas canvas, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #130 <Field Drawable mDivider>
    //    2    4:iload_2         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #145 <Method int getPaddingTop()>
    //    5    9:aload_0         
    //    6   10:getfield        #53  <Field int mDividerPadding>
    //    7   13:iadd            
    //    8   14:iload_2         
    //    9   15:aload_0         
    //   10   16:getfield        #83  <Field int mDividerWidth>
    //   11   19:iadd            
    //   12   20:aload_0         
    //   13   21:invokevirtual   #111 <Method int getHeight()>
    //   14   24:aload_0         
    //   15   25:invokevirtual   #114 <Method int getPaddingBottom()>
    //   16   28:isub            
    //   17   29:aload_0         
    //   18   30:getfield        #53  <Field int mDividerPadding>
    //   19   33:isub            
    //   20   34:invokevirtual   #139 <Method void Drawable.setBounds(int, int, int, int)>
    //   21   37:aload_0         
    //   22   38:getfield        #130 <Field Drawable mDivider>
    //   23   41:aload_1         
    //   24   42:invokevirtual   #142 <Method void Drawable.draw(Canvas)>
    //   25   45:return          
    }

    private boolean hasDividerBeforeChildAt(int i)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            12
    //    2    4:iload_1         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #67  <Method int getChildCount()>
    //    5    9:icmpne          14
    //    6   12:iconst_0        
    //    7   13:ireturn         
    //    8   14:iconst_2        
    //    9   15:aload_0         
    //   10   16:getfield        #58  <Field int mShowDividers>
    //   11   19:iand            
    //   12   20:ifeq            12
    //   13   23:iload_1         
    //   14   24:iconst_1        
    //   15   25:isub            
    //   16   26:istore_2        
    //   17   27:iload_2         
    //   18   28:iflt            12
    //   19   31:aload_0         
    //   20   32:iload_2         
    //   21   33:invokevirtual   #75  <Method View getChildAt(int)>
    //   22   36:invokevirtual   #92  <Method int View.getVisibility()>
    //   23   39:bipush          8
    //   24   41:icmpeq          46
    //   25   44:iconst_1        
    //   26   45:ireturn         
    //   27   46:iinc            2  -1
    //   28   49:goto            27
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #151 <Method int indexOfChild(View)>
    //    3    5:istore          6
    //    4    7:aload_0         
    //    5    8:invokevirtual   #154 <Method int getOrientation()>
    //    6   11:istore          7
    //    7   13:aload_1         
    //    8   14:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    9   17:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   10   20:astore          8
    //   11   22:aload_0         
    //   12   23:iload           6
    //   13   25:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   14   28:ifeq            46
    //   15   31:iload           7
    //   16   33:iconst_1        
    //   17   34:icmpne          97
    //   18   37:aload           8
    //   19   39:aload_0         
    //   20   40:getfield        #116 <Field int mDividerHeight>
    //   21   43:putfield        #125 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //   22   46:aload_0         
    //   23   47:invokevirtual   #67  <Method int getChildCount()>
    //   24   50:istore          9
    //   25   52:iload           6
    //   26   54:iload           9
    //   27   56:iconst_1        
    //   28   57:isub            
    //   29   58:icmpne          85
    //   30   61:aload_0         
    //   31   62:iload           9
    //   32   64:invokespecial   #71  <Method boolean hasDividerBeforeChildAt(int)>
    //   33   67:ifeq            85
    //   34   70:iload           7
    //   35   72:iconst_1        
    //   36   73:icmpne          109
    //   37   76:aload           8
    //   38   78:aload_0         
    //   39   79:getfield        #116 <Field int mDividerHeight>
    //   40   82:putfield        #157 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
    //   41   85:aload_0         
    //   42   86:aload_1         
    //   43   87:iload_2         
    //   44   88:iload_3         
    //   45   89:iload           4
    //   46   91:iload           5
    //   47   93:invokespecial   #159 <Method void LinearLayout.measureChildWithMargins(View, int, int, int, int)>
    //   48   96:return          
    //   49   97:aload           8
    //   50   99:aload_0         
    //   51  100:getfield        #83  <Field int mDividerWidth>
    //   52  103:putfield        #104 <Field int android.widget.LinearLayout$LayoutParams.leftMargin>
    //   53  106:goto            46
    //   54  109:aload           8
    //   55  111:aload_0         
    //   56  112:getfield        #83  <Field int mDividerWidth>
    //   57  115:putfield        #162 <Field int android.widget.LinearLayout$LayoutParams.rightMargin>
    //   58  118:goto            85
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #130 <Field Drawable mDivider>
    //    2    4:ifnull          20
    //    3    7:aload_0         
    //    4    8:invokevirtual   #154 <Method int getOrientation()>
    //    5   11:iconst_1        
    //    6   12:icmpne          26
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:invokespecial   #165 <Method void drawDividersVertical(Canvas)>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokespecial   #167 <Method void LinearLayout.onDraw(Canvas)>
    //   13   25:return          
    //   14   26:aload_0         
    //   15   27:aload_1         
    //   16   28:invokespecial   #169 <Method void drawDividersHorizontal(Canvas)>
    //   17   31:goto            20
    }

    public void setDividerDrawable(Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #130 <Field Drawable mDivider>
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #130 <Field Drawable mDivider>
    //    8   14:aload_1         
    //    9   15:ifnull          52
    //   10   18:aload_0         
    //   11   19:aload_1         
    //   12   20:invokevirtual   #172 <Method int Drawable.getIntrinsicWidth()>
    //   13   23:putfield        #83  <Field int mDividerWidth>
    //   14   26:aload_0         
    //   15   27:aload_1         
    //   16   28:invokevirtual   #175 <Method int Drawable.getIntrinsicHeight()>
    //   17   31:putfield        #116 <Field int mDividerHeight>
    //   18   34:iconst_0        
    //   19   35:istore_2        
    //   20   36:aload_1         
    //   21   37:ifnonnull       42
    //   22   40:iconst_1        
    //   23   41:istore_2        
    //   24   42:aload_0         
    //   25   43:iload_2         
    //   26   44:invokevirtual   #179 <Method void setWillNotDraw(boolean)>
    //   27   47:aload_0         
    //   28   48:invokevirtual   #182 <Method void requestLayout()>
    //   29   51:return          
    //   30   52:aload_0         
    //   31   53:iconst_0        
    //   32   54:putfield        #83  <Field int mDividerWidth>
    //   33   57:aload_0         
    //   34   58:iconst_0        
    //   35   59:putfield        #116 <Field int mDividerHeight>
    //   36   62:goto            34
    }

    private static final int LL[];
    private static final int LL_DIVIDER = 0;
    private static final int LL_DIVIDER_PADDING = 2;
    private static final int LL_SHOW_DIVIDER = 1;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mShowDividers;
}
