// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutICS extends LinearLayout
{

    public LinearLayoutICS(Context context, AttributeSet attributeset)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:aload_2         
    //    5    5:invokespecial   #22  <Method void LinearLayout(Context, AttributeSet)>
    //    6    8:aload_1         
    //    7    9:aload_2         
    //    8   10:getstatic       #28  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutICS>
    //    9   13:invokevirtual   #34  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   10   16:astore          4
    //   11   18:aload_0         
    //   12   19:aload           4
    //   13   21:iconst_0        
    //   14   22:invokevirtual   #40  <Method Drawable TypedArray.getDrawable(int)>
    //   15   25:putfield        #42  <Field Drawable mDivider>
    //   16   28:aload_0         
    //   17   29:getfield        #42  <Field Drawable mDivider>
    //   18   32:ifnull          97
    //   19   35:aload_0         
    //   20   36:aload_0         
    //   21   37:getfield        #42  <Field Drawable mDivider>
    //   22   40:invokevirtual   #48  <Method int Drawable.getIntrinsicWidth()>
    //   23   43:putfield        #50  <Field int mDividerWidth>
    //   24   46:aload_0         
    //   25   47:aload_0         
    //   26   48:getfield        #42  <Field Drawable mDivider>
    //   27   51:invokevirtual   #53  <Method int Drawable.getIntrinsicHeight()>
    //   28   54:putfield        #55  <Field int mDividerHeight>
    //   29   57:aload_0         
    //   30   58:aload           4
    //   31   60:iload_3         
    //   32   61:iconst_0        
    //   33   62:invokevirtual   #59  <Method int TypedArray.getInt(int, int)>
    //   34   65:putfield        #61  <Field int mShowDividers>
    //   35   68:aload_0         
    //   36   69:aload           4
    //   37   71:iconst_2        
    //   38   72:iconst_0        
    //   39   73:invokevirtual   #64  <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   40   76:putfield        #66  <Field int mDividerPadding>
    //   41   79:aload           4
    //   42   81:invokevirtual   #70  <Method void TypedArray.recycle()>
    //   43   84:aload_0         
    //   44   85:getfield        #42  <Field Drawable mDivider>
    //   45   88:ifnonnull       110
    //   46   91:aload_0         
    //   47   92:iload_3         
    //   48   93:invokevirtual   #74  <Method void setWillNotDraw(boolean)>
    //   49   96:return          
    //   50   97:aload_0         
    //   51   98:iconst_0        
    //   52   99:putfield        #50  <Field int mDividerWidth>
    //   53  102:aload_0         
    //   54  103:iconst_0        
    //   55  104:putfield        #55  <Field int mDividerHeight>
    //   56  107:goto            57
    //   57  110:iconst_0        
    //   58  111:istore_3        
    //   59  112:goto            91
    }

    void drawSupportDividersHorizontal(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #79  <Method int getChildCount()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          74
    //    8   12:aload_0         
    //    9   13:iload_3         
    //   10   14:invokevirtual   #83  <Method View getChildAt(int)>
    //   11   17:astore          6
    //   12   19:aload           6
    //   13   21:ifnull          68
    //   14   24:aload           6
    //   15   26:invokevirtual   #88  <Method int View.getVisibility()>
    //   16   29:bipush          8
    //   17   31:icmpeq          68
    //   18   34:aload_0         
    //   19   35:iload_3         
    //   20   36:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   21   39:ifeq            68
    //   22   42:aload           6
    //   23   44:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   24   47:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   25   50:astore          7
    //   26   52:aload_0         
    //   27   53:aload_1         
    //   28   54:aload           6
    //   29   56:invokevirtual   #101 <Method int View.getLeft()>
    //   30   59:aload           7
    //   31   61:getfield        #104 <Field int android.widget.LinearLayout$LayoutParams.leftMargin>
    //   32   64:isub            
    //   33   65:invokevirtual   #108 <Method void drawSupportVerticalDivider(Canvas, int)>
    //   34   68:iinc            3  1
    //   35   71:goto            7
    //   36   74:aload_0         
    //   37   75:iload_2         
    //   38   76:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   39   79:ifeq            119
    //   40   82:aload_0         
    //   41   83:iload_2         
    //   42   84:iconst_1        
    //   43   85:isub            
    //   44   86:invokevirtual   #83  <Method View getChildAt(int)>
    //   45   89:astore          4
    //   46   91:aload           4
    //   47   93:ifnonnull       120
    //   48   96:aload_0         
    //   49   97:invokevirtual   #111 <Method int getWidth()>
    //   50  100:aload_0         
    //   51  101:invokevirtual   #114 <Method int getPaddingRight()>
    //   52  104:isub            
    //   53  105:aload_0         
    //   54  106:getfield        #50  <Field int mDividerWidth>
    //   55  109:isub            
    //   56  110:istore          5
    //   57  112:aload_0         
    //   58  113:aload_1         
    //   59  114:iload           5
    //   60  116:invokevirtual   #108 <Method void drawSupportVerticalDivider(Canvas, int)>
    //   61  119:return          
    //   62  120:aload           4
    //   63  122:invokevirtual   #117 <Method int View.getRight()>
    //   64  125:istore          5
    //   65  127:goto            112
    }

    void drawSupportDividersVertical(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #79  <Method int getChildCount()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          74
    //    8   12:aload_0         
    //    9   13:iload_3         
    //   10   14:invokevirtual   #83  <Method View getChildAt(int)>
    //   11   17:astore          6
    //   12   19:aload           6
    //   13   21:ifnull          68
    //   14   24:aload           6
    //   15   26:invokevirtual   #88  <Method int View.getVisibility()>
    //   16   29:bipush          8
    //   17   31:icmpeq          68
    //   18   34:aload_0         
    //   19   35:iload_3         
    //   20   36:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   21   39:ifeq            68
    //   22   42:aload           6
    //   23   44:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   24   47:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   25   50:astore          7
    //   26   52:aload_0         
    //   27   53:aload_1         
    //   28   54:aload           6
    //   29   56:invokevirtual   #121 <Method int View.getTop()>
    //   30   59:aload           7
    //   31   61:getfield        #124 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //   32   64:isub            
    //   33   65:invokevirtual   #127 <Method void drawSupportHorizontalDivider(Canvas, int)>
    //   34   68:iinc            3  1
    //   35   71:goto            7
    //   36   74:aload_0         
    //   37   75:iload_2         
    //   38   76:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   39   79:ifeq            119
    //   40   82:aload_0         
    //   41   83:iload_2         
    //   42   84:iconst_1        
    //   43   85:isub            
    //   44   86:invokevirtual   #83  <Method View getChildAt(int)>
    //   45   89:astore          4
    //   46   91:aload           4
    //   47   93:ifnonnull       120
    //   48   96:aload_0         
    //   49   97:invokevirtual   #130 <Method int getHeight()>
    //   50  100:aload_0         
    //   51  101:invokevirtual   #133 <Method int getPaddingBottom()>
    //   52  104:isub            
    //   53  105:aload_0         
    //   54  106:getfield        #55  <Field int mDividerHeight>
    //   55  109:isub            
    //   56  110:istore          5
    //   57  112:aload_0         
    //   58  113:aload_1         
    //   59  114:iload           5
    //   60  116:invokevirtual   #127 <Method void drawSupportHorizontalDivider(Canvas, int)>
    //   61  119:return          
    //   62  120:aload           4
    //   63  122:invokevirtual   #136 <Method int View.getBottom()>
    //   64  125:istore          5
    //   65  127:goto            112
    }

    void drawSupportHorizontalDivider(Canvas canvas, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Drawable mDivider>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #139 <Method int getPaddingLeft()>
    //    4    8:aload_0         
    //    5    9:getfield        #66  <Field int mDividerPadding>
    //    6   12:iadd            
    //    7   13:iload_2         
    //    8   14:aload_0         
    //    9   15:invokevirtual   #111 <Method int getWidth()>
    //   10   18:aload_0         
    //   11   19:invokevirtual   #114 <Method int getPaddingRight()>
    //   12   22:isub            
    //   13   23:aload_0         
    //   14   24:getfield        #66  <Field int mDividerPadding>
    //   15   27:isub            
    //   16   28:iload_2         
    //   17   29:aload_0         
    //   18   30:getfield        #55  <Field int mDividerHeight>
    //   19   33:iadd            
    //   20   34:invokevirtual   #143 <Method void Drawable.setBounds(int, int, int, int)>
    //   21   37:aload_0         
    //   22   38:getfield        #42  <Field Drawable mDivider>
    //   23   41:aload_1         
    //   24   42:invokevirtual   #146 <Method void Drawable.draw(Canvas)>
    //   25   45:return          
    }

    void drawSupportVerticalDivider(Canvas canvas, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Drawable mDivider>
    //    2    4:iload_2         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #149 <Method int getPaddingTop()>
    //    5    9:aload_0         
    //    6   10:getfield        #66  <Field int mDividerPadding>
    //    7   13:iadd            
    //    8   14:iload_2         
    //    9   15:aload_0         
    //   10   16:getfield        #50  <Field int mDividerWidth>
    //   11   19:iadd            
    //   12   20:aload_0         
    //   13   21:invokevirtual   #130 <Method int getHeight()>
    //   14   24:aload_0         
    //   15   25:invokevirtual   #133 <Method int getPaddingBottom()>
    //   16   28:isub            
    //   17   29:aload_0         
    //   18   30:getfield        #66  <Field int mDividerPadding>
    //   19   33:isub            
    //   20   34:invokevirtual   #143 <Method void Drawable.setBounds(int, int, int, int)>
    //   21   37:aload_0         
    //   22   38:getfield        #42  <Field Drawable mDivider>
    //   23   41:aload_1         
    //   24   42:invokevirtual   #146 <Method void Drawable.draw(Canvas)>
    //   25   45:return          
    }

    public int getSupportDividerWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #50  <Field int mDividerWidth>
    //    2    4:ireturn         
    }

    protected boolean hasSupportDividerBeforeChildAt(int i)
    {
    //    0    0:iload_1         
    //    1    1:ifne            17
    //    2    4:iconst_1        
    //    3    5:aload_0         
    //    4    6:getfield        #61  <Field int mShowDividers>
    //    5    9:iand            
    //    6   10:ifeq            15
    //    7   13:iconst_1        
    //    8   14:ireturn         
    //    9   15:iconst_0        
    //   10   16:ireturn         
    //   11   17:iload_1         
    //   12   18:aload_0         
    //   13   19:invokevirtual   #79  <Method int getChildCount()>
    //   14   22:icmpne          36
    //   15   25:iconst_4        
    //   16   26:aload_0         
    //   17   27:getfield        #61  <Field int mShowDividers>
    //   18   30:iand            
    //   19   31:ifne            13
    //   20   34:iconst_0        
    //   21   35:ireturn         
    //   22   36:iconst_2        
    //   23   37:aload_0         
    //   24   38:getfield        #61  <Field int mShowDividers>
    //   25   41:iand            
    //   26   42:ifeq            78
    //   27   45:iload_1         
    //   28   46:iconst_1        
    //   29   47:isub            
    //   30   48:istore_2        
    //   31   49:iconst_0        
    //   32   50:istore_3        
    //   33   51:iload_2         
    //   34   52:iflt            70
    //   35   55:aload_0         
    //   36   56:iload_2         
    //   37   57:invokevirtual   #83  <Method View getChildAt(int)>
    //   38   60:invokevirtual   #88  <Method int View.getVisibility()>
    //   39   63:bipush          8
    //   40   65:icmpeq          72
    //   41   68:iconst_1        
    //   42   69:istore_3        
    //   43   70:iload_3         
    //   44   71:ireturn         
    //   45   72:iinc            2  -1
    //   46   75:goto            49
    //   47   78:iconst_0        
    //   48   79:ireturn         
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Drawable mDivider>
    //    2    4:ifnull          55
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokevirtual   #156 <Method int indexOfChild(View)>
    //    6   12:istore          6
    //    7   14:aload_0         
    //    8   15:invokevirtual   #79  <Method int getChildCount()>
    //    9   18:istore          7
    //   10   20:aload_1         
    //   11   21:invokevirtual   #96  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   12   24:checkcast       #98  <Class android.widget.LinearLayout$LayoutParams>
    //   13   27:astore          8
    //   14   29:aload_0         
    //   15   30:invokevirtual   #159 <Method int getOrientation()>
    //   16   33:iconst_1        
    //   17   34:icmpne          97
    //   18   37:aload_0         
    //   19   38:iload           6
    //   20   40:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   21   43:ifeq            67
    //   22   46:aload           8
    //   23   48:aload_0         
    //   24   49:getfield        #55  <Field int mDividerHeight>
    //   25   52:putfield        #124 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
    //   26   55:aload_0         
    //   27   56:aload_1         
    //   28   57:iload_2         
    //   29   58:iload_3         
    //   30   59:iload           4
    //   31   61:iload           5
    //   32   63:invokespecial   #161 <Method void LinearLayout.measureChildWithMargins(View, int, int, int, int)>
    //   33   66:return          
    //   34   67:iload           6
    //   35   69:iload           7
    //   36   71:iconst_1        
    //   37   72:isub            
    //   38   73:icmpne          55
    //   39   76:aload_0         
    //   40   77:iload           7
    //   41   79:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   42   82:ifeq            55
    //   43   85:aload           8
    //   44   87:aload_0         
    //   45   88:getfield        #55  <Field int mDividerHeight>
    //   46   91:putfield        #164 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
    //   47   94:goto            55
    //   48   97:aload_0         
    //   49   98:iload           6
    //   50  100:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   51  103:ifeq            118
    //   52  106:aload           8
    //   53  108:aload_0         
    //   54  109:getfield        #50  <Field int mDividerWidth>
    //   55  112:putfield        #104 <Field int android.widget.LinearLayout$LayoutParams.leftMargin>
    //   56  115:goto            55
    //   57  118:iload           6
    //   58  120:iload           7
    //   59  122:iconst_1        
    //   60  123:isub            
    //   61  124:icmpne          55
    //   62  127:aload_0         
    //   63  128:iload           7
    //   64  130:invokevirtual   #92  <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   65  133:ifeq            55
    //   66  136:aload           8
    //   67  138:aload_0         
    //   68  139:getfield        #50  <Field int mDividerWidth>
    //   69  142:putfield        #167 <Field int android.widget.LinearLayout$LayoutParams.rightMargin>
    //   70  145:goto            55
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Drawable mDivider>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:invokevirtual   #159 <Method int getOrientation()>
    //    6   12:iconst_1        
    //    7   13:icmpne          22
    //    8   16:aload_0         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #170 <Method void drawSupportDividersVertical(Canvas)>
    //   11   21:return          
    //   12   22:aload_0         
    //   13   23:aload_1         
    //   14   24:invokevirtual   #172 <Method void drawSupportDividersHorizontal(Canvas)>
    //   15   27:return          
    }

    private static final int SHOW_DIVIDER_BEGINNING = 1;
    private static final int SHOW_DIVIDER_END = 4;
    private static final int SHOW_DIVIDER_MIDDLE = 2;
    private static final int SHOW_DIVIDER_NONE;
    private final Drawable mDivider;
    private final int mDividerHeight;
    private final int mDividerPadding;
    private final int mDividerWidth;
    private final int mShowDividers;
}
