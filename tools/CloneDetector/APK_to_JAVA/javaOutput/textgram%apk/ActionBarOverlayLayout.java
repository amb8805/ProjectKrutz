// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer, ActionBarView

public class ActionBarOverlayLayout extends FrameLayout
{

    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:astore_0        
    //    3    4:aload_0         
    //    4    5:iconst_0        
    //    5    6:getstatic       #27  <Field int android.support.v7.appcompat.R$attr.actionBarSize>
    //    6    9:iastore         
    //    7   10:aload_0         
    //    8   11:putstatic       #29  <Field int[] mActionBarSizeAttr>
    //    9   14:return          
    }

    public ActionBarOverlayLayout(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #33  <Method void FrameLayout(Context)>
    //    3    5:aload_0         
    //    4    6:new             #35  <Class Rect>
    //    5    9:dup             
    //    6   10:iconst_0        
    //    7   11:iconst_0        
    //    8   12:iconst_0        
    //    9   13:iconst_0        
    //   10   14:invokespecial   #38  <Method void Rect(int, int, int, int)>
    //   11   17:putfield        #40  <Field Rect mZeroRect>
    //   12   20:aload_0         
    //   13   21:aload_1         
    //   14   22:invokespecial   #43  <Method void init(Context)>
    //   15   25:return          
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #46  <Method void FrameLayout(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #35  <Class Rect>
    //    6   10:dup             
    //    7   11:iconst_0        
    //    8   12:iconst_0        
    //    9   13:iconst_0        
    //   10   14:iconst_0        
    //   11   15:invokespecial   #38  <Method void Rect(int, int, int, int)>
    //   12   18:putfield        #40  <Field Rect mZeroRect>
    //   13   21:aload_0         
    //   14   22:aload_1         
    //   15   23:invokespecial   #43  <Method void init(Context)>
    //   16   26:return          
    }

    private boolean applyInsets(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #54  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #56  <Class android.widget.FrameLayout$LayoutParams>
    //    3    7:astore          7
    //    4    9:iconst_0        
    //    5   10:istore          8
    //    6   12:iload_3         
    //    7   13:ifeq            51
    //    8   16:aload           7
    //    9   18:getfield        #59  <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
    //   10   21:istore          9
    //   11   23:aload_2         
    //   12   24:getfield        #62  <Field int Rect.left>
    //   13   27:istore          10
    //   14   29:iconst_0        
    //   15   30:istore          8
    //   16   32:iload           9
    //   17   34:iload           10
    //   18   36:icmpeq          51
    //   19   39:iconst_1        
    //   20   40:istore          8
    //   21   42:aload           7
    //   22   44:aload_2         
    //   23   45:getfield        #62  <Field int Rect.left>
    //   24   48:putfield        #59  <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
    //   25   51:iload           4
    //   26   53:ifeq            80
    //   27   56:aload           7
    //   28   58:getfield        #65  <Field int android.widget.FrameLayout$LayoutParams.topMargin>
    //   29   61:aload_2         
    //   30   62:getfield        #68  <Field int Rect.top>
    //   31   65:icmpeq          80
    //   32   68:iconst_1        
    //   33   69:istore          8
    //   34   71:aload           7
    //   35   73:aload_2         
    //   36   74:getfield        #68  <Field int Rect.top>
    //   37   77:putfield        #65  <Field int android.widget.FrameLayout$LayoutParams.topMargin>
    //   38   80:iload           6
    //   39   82:ifeq            109
    //   40   85:aload           7
    //   41   87:getfield        #71  <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
    //   42   90:aload_2         
    //   43   91:getfield        #74  <Field int Rect.right>
    //   44   94:icmpeq          109
    //   45   97:iconst_1        
    //   46   98:istore          8
    //   47  100:aload           7
    //   48  102:aload_2         
    //   49  103:getfield        #74  <Field int Rect.right>
    //   50  106:putfield        #71  <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
    //   51  109:iload           5
    //   52  111:ifeq            138
    //   53  114:aload           7
    //   54  116:getfield        #77  <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
    //   55  119:aload_2         
    //   56  120:getfield        #80  <Field int Rect.bottom>
    //   57  123:icmpeq          138
    //   58  126:iconst_1        
    //   59  127:istore          8
    //   60  129:aload           7
    //   61  131:aload_2         
    //   62  132:getfield        #80  <Field int Rect.bottom>
    //   63  135:putfield        #77  <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
    //   64  138:iload           8
    //   65  140:ireturn         
    }

    private void init(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #84  <Method Context getContext()>
    //    2    4:invokevirtual   #90  <Method android.content.res.Resources$Theme Context.getTheme()>
    //    3    7:getstatic       #29  <Field int[] mActionBarSizeAttr>
    //    4   10:invokevirtual   #96  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
    //    5   13:astore_2        
    //    6   14:aload_0         
    //    7   15:aload_2         
    //    8   16:iconst_0        
    //    9   17:iconst_0        
    //   10   18:invokevirtual   #102 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   11   21:putfield        #104 <Field int mActionBarHeight>
    //   12   24:aload_2         
    //   13   25:invokevirtual   #107 <Method void TypedArray.recycle()>
    //   14   28:return          
    }

    void pullChildren()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #110 <Field View mContent>
    //    2    4:ifnonnull       68
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getstatic       #115 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
    //    6   12:invokevirtual   #119 <Method View findViewById(int)>
    //    7   15:putfield        #110 <Field View mContent>
    //    8   18:aload_0         
    //    9   19:aload_0         
    //   10   20:getstatic       #122 <Field int android.support.v7.appcompat.R$id.top_action_bar>
    //   11   23:invokevirtual   #119 <Method View findViewById(int)>
    //   12   26:putfield        #124 <Field View mActionBarTop>
    //   13   29:aload_0         
    //   14   30:aload_0         
    //   15   31:getstatic       #127 <Field int android.support.v7.appcompat.R$id.action_bar_container>
    //   16   34:invokevirtual   #119 <Method View findViewById(int)>
    //   17   37:checkcast       #129 <Class ActionBarContainer>
    //   18   40:putfield        #131 <Field ActionBarContainer mContainerView>
    //   19   43:aload_0         
    //   20   44:aload_0         
    //   21   45:getstatic       #134 <Field int android.support.v7.appcompat.R$id.action_bar>
    //   22   48:invokevirtual   #119 <Method View findViewById(int)>
    //   23   51:checkcast       #136 <Class ActionBarView>
    //   24   54:putfield        #138 <Field ActionBarView mActionView>
    //   25   57:aload_0         
    //   26   58:aload_0         
    //   27   59:getstatic       #141 <Field int android.support.v7.appcompat.R$id.split_action_bar>
    //   28   62:invokevirtual   #119 <Method View findViewById(int)>
    //   29   65:putfield        #143 <Field View mActionBarBottom>
    //   30   68:return          
    }

    public void setActionBar(ActionBar actionbar)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #147 <Field ActionBar mActionBar>
    //    3    5:return          
    }

    static final int mActionBarSizeAttr[];
    private ActionBar mActionBar;
    private View mActionBarBottom;
    private int mActionBarHeight;
    private View mActionBarTop;
    private ActionBarView mActionView;
    private ActionBarContainer mContainerView;
    private View mContent;
    private final Rect mZeroRect;
}
