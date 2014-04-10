// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.*;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer

abstract class AbsActionBarView extends ViewGroup
{

    AbsActionBarView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #21  <Method void ViewGroup(Context)>
    //    3    5:return          
    }

    AbsActionBarView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #24  <Method void ViewGroup(Context, AttributeSet)>
    //    4    6:return          
    }

    AbsActionBarView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #27  <Method void ViewGroup(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public void animateToVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #33  <Method void clearAnimation()>
    //    2    4:iload_1         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #37  <Method int getVisibility()>
    //    5    9:icmpeq          74
    //    6   12:aload_0         
    //    7   13:invokevirtual   #41  <Method Context getContext()>
    //    8   16:astore_2        
    //    9   17:iload_1         
    //   10   18:ifne            75
    //   11   21:getstatic       #46  <Field int android.support.v7.appcompat.R$anim.abc_fade_in>
    //   12   24:istore_3        
    //   13   25:aload_2         
    //   14   26:iload_3         
    //   15   27:invokestatic    #52  <Method android.view.animation.Animation AnimationUtils.loadAnimation(Context, int)>
    //   16   30:astore          4
    //   17   32:aload_0         
    //   18   33:aload           4
    //   19   35:invokevirtual   #56  <Method void startAnimation(android.view.animation.Animation)>
    //   20   38:aload_0         
    //   21   39:iload_1         
    //   22   40:invokevirtual   #59  <Method void setVisibility(int)>
    //   23   43:aload_0         
    //   24   44:getfield        #61  <Field ActionBarContainer mSplitView>
    //   25   47:ifnull          74
    //   26   50:aload_0         
    //   27   51:getfield        #63  <Field ActionMenuView mMenuView>
    //   28   54:ifnull          74
    //   29   57:aload_0         
    //   30   58:getfield        #63  <Field ActionMenuView mMenuView>
    //   31   61:aload           4
    //   32   63:invokevirtual   #66  <Method void ActionMenuView.startAnimation(android.view.animation.Animation)>
    //   33   66:aload_0         
    //   34   67:getfield        #63  <Field ActionMenuView mMenuView>
    //   35   70:iload_1         
    //   36   71:invokevirtual   #67  <Method void ActionMenuView.setVisibility(int)>
    //   37   74:return          
    //   38   75:getstatic       #70  <Field int android.support.v7.appcompat.R$anim.abc_fade_out>
    //   39   78:istore_3        
    //   40   79:goto            25
    }

    public void dismissPopupMenus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #78  <Method boolean ActionMenuPresenter.dismissPopupMenus()>
    //    6   14:pop             
    //    7   15:return          
    }

    public int getAnimatedVisibility()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #37  <Method int getVisibility()>
    //    2    4:ireturn         
    }

    public int getContentHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #82  <Field int mContentHeight>
    //    2    4:ireturn         
    }

    public boolean hideOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #85  <Method boolean ActionMenuPresenter.hideOverflowMenu()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public boolean isOverflowMenuShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #88  <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public boolean isOverflowReserved()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #91  <Method boolean ActionMenuPresenter.isOverflowReserved()>
    //    6   14:ifeq            19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    protected int measureChildView(View view, int i, int j, int k)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:ldc1            #94  <Int 0x80000000>
    //    3    4:invokestatic    #100 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //    4    7:iload_3         
    //    5    8:invokevirtual   #106 <Method void View.measure(int, int)>
    //    6   11:iconst_0        
    //    7   12:iload_2         
    //    8   13:aload_1         
    //    9   14:invokevirtual   #109 <Method int View.getMeasuredWidth()>
    //   10   17:isub            
    //   11   18:iload           4
    //   12   20:isub            
    //   13   21:invokestatic    #114 <Method int Math.max(int, int)>
    //   14   24:ireturn         
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:getstatic       #121 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          8
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:aload_1         
    //    5   10:invokespecial   #123 <Method void ViewGroup.onConfigurationChanged(Configuration)>
    //    6   13:aload_0         
    //    7   14:invokevirtual   #41  <Method Context getContext()>
    //    8   17:aconst_null     
    //    9   18:getstatic       #129 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
    //   10   21:getstatic       #134 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
    //   11   24:iconst_0        
    //   12   25:invokevirtual   #140 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   13   28:astore_2        
    //   14   29:aload_0         
    //   15   30:aload_2         
    //   16   31:iconst_1        
    //   17   32:iconst_0        
    //   18   33:invokevirtual   #145 <Method int TypedArray.getLayoutDimension(int, int)>
    //   19   36:invokevirtual   #148 <Method void setContentHeight(int)>
    //   20   39:aload_2         
    //   21   40:invokevirtual   #151 <Method void TypedArray.recycle()>
    //   22   43:aload_0         
    //   23   44:getfield        #153 <Field boolean mSplitWhenNarrow>
    //   24   47:ifeq            67
    //   25   50:aload_0         
    //   26   51:aload_0         
    //   27   52:invokevirtual   #41  <Method Context getContext()>
    //   28   55:invokevirtual   #157 <Method Resources Context.getResources()>
    //   29   58:getstatic       #162 <Field int android.support.v7.appcompat.R$bool.abc_split_action_bar_is_narrow>
    //   30   61:invokevirtual   #168 <Method boolean Resources.getBoolean(int)>
    //   31   64:invokevirtual   #172 <Method void setSplitActionBar(boolean)>
    //   32   67:aload_0         
    //   33   68:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //   34   71:ifnull          82
    //   35   74:aload_0         
    //   36   75:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //   37   78:aload_1         
    //   38   79:invokevirtual   #173 <Method void ActionMenuPresenter.onConfigurationChanged(Configuration)>
    //   39   82:return          
    }

    protected int positionChild(View view, int i, int j, int k)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #109 <Method int View.getMeasuredWidth()>
    //    2    4:istore          5
    //    3    6:aload_1         
    //    4    7:invokevirtual   #177 <Method int View.getMeasuredHeight()>
    //    5   10:istore          6
    //    6   12:iload_3         
    //    7   13:iload           4
    //    8   15:iload           6
    //    9   17:isub            
    //   10   18:iconst_2        
    //   11   19:idiv            
    //   12   20:iadd            
    //   13   21:istore          7
    //   14   23:aload_1         
    //   15   24:iload_2         
    //   16   25:iload           7
    //   17   27:iload_2         
    //   18   28:iload           5
    //   19   30:iadd            
    //   20   31:iload           7
    //   21   33:iload           6
    //   22   35:iadd            
    //   23   36:invokevirtual   #181 <Method void View.layout(int, int, int, int)>
    //   24   39:iload           5
    //   25   41:ireturn         
    }

    protected int positionChildInverse(View view, int i, int j, int k)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #109 <Method int View.getMeasuredWidth()>
    //    2    4:istore          5
    //    3    6:aload_1         
    //    4    7:invokevirtual   #177 <Method int View.getMeasuredHeight()>
    //    5   10:istore          6
    //    6   12:iload_3         
    //    7   13:iload           4
    //    8   15:iload           6
    //    9   17:isub            
    //   10   18:iconst_2        
    //   11   19:idiv            
    //   12   20:iadd            
    //   13   21:istore          7
    //   14   23:aload_1         
    //   15   24:iload_2         
    //   16   25:iload           5
    //   17   27:isub            
    //   18   28:iload           7
    //   19   30:iload_2         
    //   20   31:iload           7
    //   21   33:iload           6
    //   22   35:iadd            
    //   23   36:invokevirtual   #181 <Method void View.layout(int, int, int, int)>
    //   24   39:iload           5
    //   25   41:ireturn         
    }

    public void postShowOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:new             #185 <Class AbsActionBarView$1>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:invokespecial   #188 <Method void AbsActionBarView$1(AbsActionBarView)>
    //    5    9:invokevirtual   #192 <Method boolean post(Runnable)>
    //    6   12:pop             
    //    7   13:return          
    }

    public void setContentHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #82  <Field int mContentHeight>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #195 <Method void requestLayout()>
    //    5    9:return          
    }

    public void setSplitActionBar(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #197 <Field boolean mSplitActionBar>
    //    3    5:return          
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #61  <Field ActionBarContainer mSplitView>
    //    3    5:return          
    }

    public void setSplitWhenNarrow(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #153 <Field boolean mSplitWhenNarrow>
    //    3    5:return          
    }

    public void setVisibility(int i)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #37  <Method int getVisibility()>
    //    3    5:icmpeq          13
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:invokespecial   #201 <Method void ViewGroup.setVisibility(int)>
    //    7   13:return          
    }

    public boolean showOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #204 <Method boolean ActionMenuPresenter.showOverflowMenu()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    private static final int FADE_DURATION = 200;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected boolean mSplitActionBar;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;

    // Unreferenced inner class android/support/v7/internal/widget/AbsActionBarView$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field AbsActionBarView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field AbsActionBarView this$0>
        //    2    4:invokevirtual   #24  <Method boolean AbsActionBarView.showOverflowMenu()>
        //    3    7:pop             
        //    4    8:return          
        }

        final AbsActionBarView this$0;
    }

}
