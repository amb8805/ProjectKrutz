// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.content.Context;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.*;
import android.support.v7.internal.widget.*;
import android.support.v7.view.ActionMode;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBarActivity, ActionBarImplBase, ActionBar

class ActionBarActivityDelegateBase extends ActionBarActivityDelegate
    implements android.support.v7.internal.view.menu.MenuPresenter.Callback, android.support.v7.internal.view.menu.MenuBuilder.Callback
{
    private class ActionBarDrawableToggleImpl
        implements android.support.v4.app.ActionBarDrawerToggle.Delegate
    {

        private ActionBarDrawableToggleImpl()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ActionBarActivityDelegateBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ActionBarDrawableToggleImpl(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ActionBarActivityDelegateBase$ActionBarDrawableToggleImpl(ActionBarActivityDelegateBase)>
        //    3    5:return          
        }

        public Drawable getThemeUpIndicator()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ActionBarActivityDelegateBase this$0>
        //    2    4:getfield        #26  <Field ActionBarActivity ActionBarActivityDelegateBase.mActivity>
        //    3    7:invokestatic    #30  <Method int[] ActionBarActivityDelegateBase.access$500()>
        //    4   10:invokevirtual   #36  <Method TypedArray ActionBarActivity.obtainStyledAttributes(int[])>
        //    5   13:astore_1        
        //    6   14:aload_1         
        //    7   15:iconst_0        
        //    8   16:invokevirtual   #42  <Method Drawable TypedArray.getDrawable(int)>
        //    9   19:astore_2        
        //   10   20:aload_1         
        //   11   21:invokevirtual   #45  <Method void TypedArray.recycle()>
        //   12   24:aload_2         
        //   13   25:areturn         
        }

        public void setActionBarDescription(int i)
        {
        //    0    0:return          
        }

        public void setActionBarUpIndicator(Drawable drawable, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ActionBarActivityDelegateBase this$0>
        //    2    4:invokestatic    #53  <Method ActionBarView ActionBarActivityDelegateBase.access$600(ActionBarActivityDelegateBase)>
        //    3    7:ifnull          21
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ActionBarActivityDelegateBase this$0>
        //    6   14:invokestatic    #53  <Method ActionBarView ActionBarActivityDelegateBase.access$600(ActionBarActivityDelegateBase)>
        //    7   17:aload_1         
        //    8   18:invokevirtual   #59  <Method void ActionBarView.setHomeAsUpIndicator(Drawable)>
        //    9   21:return          
        }

        final ActionBarActivityDelegateBase this$0;
    }

    private class ActionModeCallbackWrapper
        implements android.support.v7.view.ActionMode.Callback
    {

        public ActionModeCallbackWrapper(android.support.v7.view.ActionMode.Callback callback)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field android.support.v7.view.ActionMode$Callback mWrapped>
        //    8   14:return          
        }

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.support.v7.view.ActionMode$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #23  <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
        //    5   11:ireturn         
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.support.v7.view.ActionMode$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #27  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
        //    5   11:ireturn         
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.support.v7.view.ActionMode$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:invokeinterface #31  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //    6   14:getfield        #37  <Field ActionBarActivity ActionBarActivityDelegateBase.mActivity>
        //    7   17:aload_1         
        //    8   18:invokevirtual   #42  <Method void ActionBarActivity.onSupportActionModeFinished(ActionMode)>
        //    9   21:aload_0         
        //   10   22:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //   11   25:aconst_null     
        //   12   26:invokestatic    #46  <Method ActionMode ActionBarActivityDelegateBase.access$402(ActionBarActivityDelegateBase, ActionMode)>
        //   13   29:pop             
        //   14   30:return          
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field android.support.v7.view.ActionMode$Callback mWrapped>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #49  <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
        //    5   11:ireturn         
        }

        private android.support.v7.view.ActionMode.Callback mWrapped;
        final ActionBarActivityDelegateBase this$0;
    }


    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:astore_0        
    //    3    4:aload_0         
    //    4    5:iconst_0        
    //    5    6:getstatic       #37  <Field int android.support.v7.appcompat.R$attr.homeAsUpIndicator>
    //    6    9:iastore         
    //    7   10:aload_0         
    //    8   11:putstatic       #39  <Field int[] ACTION_BAR_DRAWABLE_TOGGLE_ATTRS>
    //    9   14:return          
    }

    ActionBarActivityDelegateBase(ActionBarActivity actionbaractivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #43  <Method void ActionBarActivityDelegate(ActionBarActivity)>
    //    3    5:aload_0         
    //    4    6:new             #45  <Class ActionBarActivityDelegateBase$1>
    //    5    9:dup             
    //    6   10:aload_0         
    //    7   11:invokespecial   #48  <Method void ActionBarActivityDelegateBase$1(ActionBarActivityDelegateBase)>
    //    8   14:putfield        #50  <Field Runnable mInvalidateMenuRunnable>
    //    9   17:return          
    }

    static MenuBuilder access$000(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #56  <Method MenuBuilder createMenu()>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #56  <Method MenuBuilder createMenu()>
    //    5    4:areturn         
    }

    static void access$100(ActionBarActivityDelegateBase actionbaractivitydelegatebase, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #62  <Method void setMenu(MenuBuilder)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #62  <Method void setMenu(MenuBuilder)>
    //    7    5:return          
    }

    static boolean access$202(ActionBarActivityDelegateBase actionbaractivitydelegatebase, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #66  <Field boolean mInvalidateMenuPosted>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #66  <Field boolean mInvalidateMenuPosted>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static ActionMode access$402(ActionBarActivityDelegateBase actionbaractivitydelegatebase, ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field ActionMode mActionMode>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #70  <Field ActionMode mActionMode>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    static int[] access$500()
    {
    //    0    0:getstatic       #39  <Field int[] ACTION_BAR_DRAWABLE_TOGGLE_ATTRS>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #39  <Field int[] ACTION_BAR_DRAWABLE_TOGGLE_ATTRS>
    //    3    3:areturn         
    }

    static ActionBarView access$600(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    5    4:areturn         
    }

    private MenuBuilder createMenu()
    {
    //    0    0:new             #78  <Class MenuBuilder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #82  <Method Context getActionBarThemedContext()>
    //    4    8:invokespecial   #85  <Method void MenuBuilder(Context)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:invokevirtual   #89  <Method void MenuBuilder.setCallback(android.support.v7.internal.view.menu.MenuBuilder$Callback)>
    //    9   17:aload_1         
    //   10   18:areturn         
    }

    private ProgressBarICS getCircularProgressBar()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:getstatic       #96  <Field int android.support.v7.appcompat.R$id.progress_circular>
    //    3    7:invokevirtual   #102 <Method View ActionBarView.findViewById(int)>
    //    4   10:checkcast       #104 <Class ProgressBarICS>
    //    5   13:astore_1        
    //    6   14:aload_1         
    //    7   15:ifnull          23
    //    8   18:aload_1         
    //    9   19:iconst_4        
    //   10   20:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   11   23:aload_1         
    //   12   24:areturn         
    }

    private ProgressBarICS getHorizontalProgressBar()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:getstatic       #112 <Field int android.support.v7.appcompat.R$id.progress_horizontal>
    //    3    7:invokevirtual   #102 <Method View ActionBarView.findViewById(int)>
    //    4   10:checkcast       #104 <Class ProgressBarICS>
    //    5   13:astore_1        
    //    6   14:aload_1         
    //    7   15:ifnull          23
    //    8   18:aload_1         
    //    9   19:iconst_4        
    //   10   20:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   11   23:aload_1         
    //   12   24:areturn         
    }

    private MenuView getListMenuView(Context context, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field MenuBuilder mMenu>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //    7   13:ifnonnull       89
    //    8   16:aload_1         
    //    9   17:getstatic       #123 <Field int[] android.support.v7.appcompat.R$styleable.Theme>
    //   10   20:invokevirtual   #129 <Method TypedArray Context.obtainStyledAttributes(int[])>
    //   11   23:astore_3        
    //   12   24:aload_3         
    //   13   25:iconst_4        
    //   14   26:getstatic       #134 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
    //   15   29:invokevirtual   #140 <Method int TypedArray.getResourceId(int, int)>
    //   16   32:istore          4
    //   17   34:aload_3         
    //   18   35:invokevirtual   #143 <Method void TypedArray.recycle()>
    //   19   38:aload_0         
    //   20   39:new             #145 <Class ListMenuPresenter>
    //   21   42:dup             
    //   22   43:getstatic       #150 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
    //   23   46:iload           4
    //   24   48:invokespecial   #153 <Method void ListMenuPresenter(int, int)>
    //   25   51:putfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   26   54:aload_0         
    //   27   55:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   28   58:aload_2         
    //   29   59:invokevirtual   #156 <Method void ListMenuPresenter.setCallback(android.support.v7.internal.view.menu.MenuPresenter$Callback)>
    //   30   62:aload_0         
    //   31   63:getfield        #116 <Field MenuBuilder mMenu>
    //   32   66:aload_0         
    //   33   67:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   34   70:invokevirtual   #160 <Method void MenuBuilder.addMenuPresenter(android.support.v7.internal.view.menu.MenuPresenter)>
    //   35   73:aload_0         
    //   36   74:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   37   77:new             #162 <Class FrameLayout>
    //   38   80:dup             
    //   39   81:aload_1         
    //   40   82:invokespecial   #163 <Method void FrameLayout(Context)>
    //   41   85:invokevirtual   #167 <Method MenuView ListMenuPresenter.getMenuView(ViewGroup)>
    //   42   88:areturn         
    //   43   89:aload_0         
    //   44   90:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   45   93:iconst_0        
    //   46   94:invokevirtual   #171 <Method void ListMenuPresenter.updateMenuView(boolean)>
    //   47   97:goto            73
    }

    private void hideProgressBars(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //    2    4:ifeq            19
    //    3    7:aload_2         
    //    4    8:invokevirtual   #179 <Method int ProgressBarICS.getVisibility()>
    //    5   11:ifne            19
    //    6   14:aload_2         
    //    7   15:iconst_4        
    //    8   16:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //    9   19:aload_0         
    //   10   20:getfield        #181 <Field boolean mFeatureProgress>
    //   11   23:ifeq            38
    //   12   26:aload_1         
    //   13   27:invokevirtual   #179 <Method int ProgressBarICS.getVisibility()>
    //   14   30:ifne            38
    //   15   33:aload_1         
    //   16   34:iconst_4        
    //   17   35:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   18   38:return          
    }

    private void reopenMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:ifnull          59
    //    3    7:aload_0         
    //    4    8:getfield        #76  <Field ActionBarView mActionBarView>
    //    5   11:invokevirtual   #187 <Method boolean ActionBarView.isOverflowReserved()>
    //    6   14:ifeq            59
    //    7   17:aload_0         
    //    8   18:getfield        #76  <Field ActionBarView mActionBarView>
    //    9   21:invokevirtual   #190 <Method boolean ActionBarView.isOverflowMenuShowing()>
    //   10   24:ifeq            31
    //   11   27:iload_2         
    //   12   28:ifne            50
    //   13   31:aload_0         
    //   14   32:getfield        #76  <Field ActionBarView mActionBarView>
    //   15   35:invokevirtual   #191 <Method int ActionBarView.getVisibility()>
    //   16   38:ifne            49
    //   17   41:aload_0         
    //   18   42:getfield        #76  <Field ActionBarView mActionBarView>
    //   19   45:invokevirtual   #194 <Method boolean ActionBarView.showOverflowMenu()>
    //   20   48:pop             
    //   21   49:return          
    //   22   50:aload_0         
    //   23   51:getfield        #76  <Field ActionBarView mActionBarView>
    //   24   54:invokevirtual   #197 <Method boolean ActionBarView.hideOverflowMenu()>
    //   25   57:pop             
    //   26   58:return          
    //   27   59:aload_1         
    //   28   60:invokevirtual   #200 <Method void MenuBuilder.close()>
    //   29   63:return          
    }

    private void setMenu(MenuBuilder menubuilder)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #116 <Field MenuBuilder mMenu>
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #116 <Field MenuBuilder mMenu>
    //    7   13:ifnull          27
    //    8   16:aload_0         
    //    9   17:getfield        #116 <Field MenuBuilder mMenu>
    //   10   20:aload_0         
    //   11   21:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   12   24:invokevirtual   #203 <Method void MenuBuilder.removeMenuPresenter(android.support.v7.internal.view.menu.MenuPresenter)>
    //   13   27:aload_0         
    //   14   28:aload_1         
    //   15   29:putfield        #116 <Field MenuBuilder mMenu>
    //   16   32:aload_1         
    //   17   33:ifnull          51
    //   18   36:aload_0         
    //   19   37:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   20   40:ifnull          51
    //   21   43:aload_1         
    //   22   44:aload_0         
    //   23   45:getfield        #118 <Field ListMenuPresenter mListMenuPresenter>
    //   24   48:invokevirtual   #160 <Method void MenuBuilder.addMenuPresenter(android.support.v7.internal.view.menu.MenuPresenter)>
    //   25   51:aload_0         
    //   26   52:getfield        #76  <Field ActionBarView mActionBarView>
    //   27   55:ifnull          8
    //   28   58:aload_0         
    //   29   59:getfield        #76  <Field ActionBarView mActionBarView>
    //   30   62:aload_1         
    //   31   63:aload_0         
    //   32   64:invokevirtual   #206 <Method void ActionBarView.setMenu(android.support.v4.internal.view.SupportMenu, android.support.v7.internal.view.menu.MenuPresenter$Callback)>
    //   33   67:return          
    }

    private void showProgressBars(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //    2    4:ifeq            20
    //    3    7:aload_2         
    //    4    8:invokevirtual   #179 <Method int ProgressBarICS.getVisibility()>
    //    5   11:iconst_4        
    //    6   12:icmpne          20
    //    7   15:aload_2         
    //    8   16:iconst_0        
    //    9   17:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   10   20:aload_0         
    //   11   21:getfield        #181 <Field boolean mFeatureProgress>
    //   12   24:ifeq            42
    //   13   27:aload_1         
    //   14   28:invokevirtual   #210 <Method int ProgressBarICS.getProgress()>
    //   15   31:sipush          10000
    //   16   34:icmpge          42
    //   17   37:aload_1         
    //   18   38:iconst_0        
    //   19   39:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   20   42:return          
    }

    private void updateProgressBars(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #213 <Method ProgressBarICS getCircularProgressBar()>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:invokespecial   #215 <Method ProgressBarICS getHorizontalProgressBar()>
    //    5    9:astore_3        
    //    6   10:iload_1         
    //    7   11:iconst_m1       
    //    8   12:icmpne          71
    //    9   15:aload_0         
    //   10   16:getfield        #181 <Field boolean mFeatureProgress>
    //   11   19:ifeq            52
    //   12   22:aload_3         
    //   13   23:invokevirtual   #210 <Method int ProgressBarICS.getProgress()>
    //   14   26:istore          4
    //   15   28:aload_3         
    //   16   29:invokevirtual   #218 <Method boolean ProgressBarICS.isIndeterminate()>
    //   17   32:ifne            43
    //   18   35:iload           4
    //   19   37:sipush          10000
    //   20   40:icmpge          65
    //   21   43:iconst_0        
    //   22   44:istore          5
    //   23   46:aload_3         
    //   24   47:iload           5
    //   25   49:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   26   52:aload_0         
    //   27   53:getfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //   28   56:ifeq            64
    //   29   59:aload_2         
    //   30   60:iconst_0        
    //   31   61:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   32   64:return          
    //   33   65:iconst_4        
    //   34   66:istore          5
    //   35   68:goto            46
    //   36   71:iload_1         
    //   37   72:bipush          -2
    //   38   74:icmpne          104
    //   39   77:aload_0         
    //   40   78:getfield        #181 <Field boolean mFeatureProgress>
    //   41   81:ifeq            90
    //   42   84:aload_3         
    //   43   85:bipush          8
    //   44   87:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   45   90:aload_0         
    //   46   91:getfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //   47   94:ifeq            64
    //   48   97:aload_2         
    //   49   98:bipush          8
    //   50  100:invokevirtual   #108 <Method void ProgressBarICS.setVisibility(int)>
    //   51  103:return          
    //   52  104:iload_1         
    //   53  105:bipush          -3
    //   54  107:icmpne          116
    //   55  110:aload_3         
    //   56  111:iconst_1        
    //   57  112:invokevirtual   #221 <Method void ProgressBarICS.setIndeterminate(boolean)>
    //   58  115:return          
    //   59  116:iload_1         
    //   60  117:bipush          -4
    //   61  119:icmpne          128
    //   62  122:aload_3         
    //   63  123:iconst_0        
    //   64  124:invokevirtual   #221 <Method void ProgressBarICS.setIndeterminate(boolean)>
    //   65  127:return          
    //   66  128:iload_1         
    //   67  129:iflt            64
    //   68  132:iload_1         
    //   69  133:sipush          10000
    //   70  136:icmpgt          64
    //   71  139:aload_3         
    //   72  140:iload_1         
    //   73  141:iconst_0        
    //   74  142:iadd            
    //   75  143:invokevirtual   #224 <Method void ProgressBarICS.setProgress(int)>
    //   76  146:iload_1         
    //   77  147:sipush          10000
    //   78  150:icmpge          160
    //   79  153:aload_0         
    //   80  154:aload_3         
    //   81  155:aload_2         
    //   82  156:invokespecial   #226 <Method void showProgressBars(ProgressBarICS, ProgressBarICS)>
    //   83  159:return          
    //   84  160:aload_0         
    //   85  161:aload_3         
    //   86  162:aload_2         
    //   87  163:invokespecial   #228 <Method void hideProgressBars(ProgressBarICS, ProgressBarICS)>
    //   88  166:return          
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #233 <Method void ensureSubDecor()>
    //    2    4:aload_0         
    //    3    5:getfield        #236 <Field boolean mHasActionBar>
    //    4    8:ifeq            30
    //    5   11:aload_0         
    //    6   12:getfield        #240 <Field ActionBarActivity mActivity>
    //    7   15:getstatic       #243 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
    //    8   18:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //    9   21:checkcast       #248 <Class ViewGroup>
    //   10   24:aload_1         
    //   11   25:aload_2         
    //   12   26:invokevirtual   #251 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
    //   13   29:return          
    //   14   30:aload_0         
    //   15   31:getfield        #240 <Field ActionBarActivity mActivity>
    //   16   34:aload_1         
    //   17   35:aload_2         
    //   18   36:invokevirtual   #254 <Method void ActionBarActivity.superSetContentView(View, android.view.ViewGroup$LayoutParams)>
    //   19   39:return          
    }

    public ActionBar createSupportActionBar()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #233 <Method void ensureSubDecor()>
    //    2    4:new             #258 <Class ActionBarImplBase>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:getfield        #240 <Field ActionBarActivity mActivity>
    //    6   12:aload_0         
    //    7   13:getfield        #240 <Field ActionBarActivity mActivity>
    //    8   16:invokespecial   #261 <Method void ActionBarImplBase(ActionBarActivity, ActionBar$Callback)>
    //    9   19:areturn         
    }

    final void ensureSubDecor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #236 <Field boolean mHasActionBar>
    //    2    4:ifeq            204
    //    3    7:aload_0         
    //    4    8:getfield        #263 <Field boolean mSubDecorInstalled>
    //    5   11:ifne            204
    //    6   14:aload_0         
    //    7   15:getfield        #266 <Field boolean mOverlayActionBar>
    //    8   18:ifeq            205
    //    9   21:aload_0         
    //   10   22:getfield        #240 <Field ActionBarActivity mActivity>
    //   11   25:getstatic       #269 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_decor_overlay>
    //   12   28:invokevirtual   #271 <Method void ActionBarActivity.superSetContentView(int)>
    //   13   31:aload_0         
    //   14   32:aload_0         
    //   15   33:getfield        #240 <Field ActionBarActivity mActivity>
    //   16   36:getstatic       #274 <Field int android.support.v7.appcompat.R$id.action_bar>
    //   17   39:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //   18   42:checkcast       #98  <Class ActionBarView>
    //   19   45:putfield        #76  <Field ActionBarView mActionBarView>
    //   20   48:aload_0         
    //   21   49:getfield        #76  <Field ActionBarView mActionBarView>
    //   22   52:aload_0         
    //   23   53:getfield        #240 <Field ActionBarActivity mActivity>
    //   24   56:invokevirtual   #278 <Method void ActionBarView.setWindowCallback(android.view.Window$Callback)>
    //   25   59:aload_0         
    //   26   60:getfield        #181 <Field boolean mFeatureProgress>
    //   27   63:ifeq            73
    //   28   66:aload_0         
    //   29   67:getfield        #76  <Field ActionBarView mActionBarView>
    //   30   70:invokevirtual   #281 <Method void ActionBarView.initProgress()>
    //   31   73:aload_0         
    //   32   74:getfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //   33   77:ifeq            87
    //   34   80:aload_0         
    //   35   81:getfield        #76  <Field ActionBarView mActionBarView>
    //   36   84:invokevirtual   #284 <Method void ActionBarView.initIndeterminateProgress()>
    //   37   87:ldc2            #286 <String "splitActionBarWhenNarrow">
    //   38   90:aload_0         
    //   39   91:invokevirtual   #290 <Method String getUiOptionsFromMetadata()>
    //   40   94:invokevirtual   #296 <Method boolean String.equals(Object)>
    //   41   97:istore_1        
    //   42   98:iload_1         
    //   43   99:ifeq            218
    //   44  102:aload_0         
    //   45  103:getfield        #240 <Field ActionBarActivity mActivity>
    //   46  106:invokevirtual   #300 <Method Resources ActionBarActivity.getResources()>
    //   47  109:getstatic       #305 <Field int android.support.v7.appcompat.R$bool.abc_split_action_bar_is_narrow>
    //   48  112:invokevirtual   #311 <Method boolean Resources.getBoolean(int)>
    //   49  115:istore_3        
    //   50  116:aload_0         
    //   51  117:getfield        #240 <Field ActionBarActivity mActivity>
    //   52  120:getstatic       #314 <Field int android.support.v7.appcompat.R$id.split_action_bar>
    //   53  123:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //   54  126:checkcast       #316 <Class ActionBarContainer>
    //   55  129:astore          4
    //   56  131:aload           4
    //   57  133:ifnull          195
    //   58  136:aload_0         
    //   59  137:getfield        #76  <Field ActionBarView mActionBarView>
    //   60  140:aload           4
    //   61  142:invokevirtual   #320 <Method void ActionBarView.setSplitView(ActionBarContainer)>
    //   62  145:aload_0         
    //   63  146:getfield        #76  <Field ActionBarView mActionBarView>
    //   64  149:iload_3         
    //   65  150:invokevirtual   #323 <Method void ActionBarView.setSplitActionBar(boolean)>
    //   66  153:aload_0         
    //   67  154:getfield        #76  <Field ActionBarView mActionBarView>
    //   68  157:iload_1         
    //   69  158:invokevirtual   #326 <Method void ActionBarView.setSplitWhenNarrow(boolean)>
    //   70  161:aload_0         
    //   71  162:getfield        #240 <Field ActionBarActivity mActivity>
    //   72  165:getstatic       #329 <Field int android.support.v7.appcompat.R$id.action_context_bar>
    //   73  168:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //   74  171:checkcast       #331 <Class ActionBarContextView>
    //   75  174:astore          5
    //   76  176:aload           5
    //   77  178:aload           4
    //   78  180:invokevirtual   #332 <Method void ActionBarContextView.setSplitView(ActionBarContainer)>
    //   79  183:aload           5
    //   80  185:iload_3         
    //   81  186:invokevirtual   #333 <Method void ActionBarContextView.setSplitActionBar(boolean)>
    //   82  189:aload           5
    //   83  191:iload_1         
    //   84  192:invokevirtual   #334 <Method void ActionBarContextView.setSplitWhenNarrow(boolean)>
    //   85  195:aload_0         
    //   86  196:iconst_1        
    //   87  197:putfield        #263 <Field boolean mSubDecorInstalled>
    //   88  200:aload_0         
    //   89  201:invokevirtual   #337 <Method void supportInvalidateOptionsMenu()>
    //   90  204:return          
    //   91  205:aload_0         
    //   92  206:getfield        #240 <Field ActionBarActivity mActivity>
    //   93  209:getstatic       #340 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_decor>
    //   94  212:invokevirtual   #271 <Method void ActionBarActivity.superSetContentView(int)>
    //   95  215:goto            31
    //   96  218:aload_0         
    //   97  219:getfield        #240 <Field ActionBarActivity mActivity>
    //   98  222:getstatic       #343 <Field int[] android.support.v7.appcompat.R$styleable.ActionBarWindow>
    //   99  225:invokevirtual   #344 <Method TypedArray ActionBarActivity.obtainStyledAttributes(int[])>
    //  100  228:astore_2        
    //  101  229:aload_2         
    //  102  230:iconst_2        
    //  103  231:iconst_0        
    //  104  232:invokevirtual   #347 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  105  235:istore_3        
    //  106  236:aload_2         
    //  107  237:invokevirtual   #143 <Method void TypedArray.recycle()>
    //  108  240:goto            116
    }

    android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
    //    0    0:new             #351 <Class ActionBarActivityDelegateBase$ActionBarDrawableToggleImpl>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:invokespecial   #354 <Method void ActionBarActivityDelegateBase$ActionBarDrawableToggleImpl(ActionBarActivityDelegateBase, ActionBarActivityDelegateBase$1)>
    //    5    9:areturn         
    }

    public boolean onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field ActionMode mActionMode>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #70  <Field ActionMode mActionMode>
    //    5   11:invokevirtual   #360 <Method void ActionMode.finish()>
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:aload_0         
    //    9   17:getfield        #76  <Field ActionBarView mActionBarView>
    //   10   20:ifnull          42
    //   11   23:aload_0         
    //   12   24:getfield        #76  <Field ActionBarView mActionBarView>
    //   13   27:invokevirtual   #363 <Method boolean ActionBarView.hasExpandedActionView()>
    //   14   30:ifeq            42
    //   15   33:aload_0         
    //   16   34:getfield        #76  <Field ActionBarView mActionBarView>
    //   17   37:invokevirtual   #366 <Method void ActionBarView.collapseActionView()>
    //   18   40:iconst_1        
    //   19   41:ireturn         
    //   20   42:iconst_0        
    //   21   43:ireturn         
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #240 <Field ActionBarActivity mActivity>
    //    2    4:invokevirtual   #370 <Method void ActionBarActivity.closeOptionsMenu()>
    //    3    7:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #236 <Field boolean mHasActionBar>
    //    2    4:ifeq            25
    //    3    7:aload_0         
    //    4    8:getfield        #263 <Field boolean mSubDecorInstalled>
    //    5   11:ifeq            25
    //    6   14:aload_0         
    //    7   15:invokevirtual   #375 <Method ActionBar getSupportActionBar()>
    //    8   18:checkcast       #258 <Class ActionBarImplBase>
    //    9   21:aload_1         
    //   10   22:invokevirtual   #377 <Method void ActionBarImplBase.onConfigurationChanged(Configuration)>
    //   11   25:return          
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            14
    //    2    4:aload_0         
    //    3    5:getfield        #240 <Field ActionBarActivity mActivity>
    //    4    8:iload_1         
    //    5    9:aload_2         
    //    6   10:invokevirtual   #382 <Method boolean ActionBarActivity.superOnCreatePanelMenu(int, Menu)>
    //    7   13:ireturn         
    //    8   14:iconst_0        
    //    9   15:ireturn         
    }

    public View onCreatePanelView(int i)
    {
    //    0    0:aconst_null     
    //    1    1:astore_2        
    //    2    2:iload_1         
    //    3    3:ifne            97
    //    4    6:iconst_1        
    //    5    7:istore_3        
    //    6    8:aload_0         
    //    7    9:getfield        #116 <Field MenuBuilder mMenu>
    //    8   12:astore          4
    //    9   14:aload_0         
    //   10   15:getfield        #70  <Field ActionMode mActionMode>
    //   11   18:ifnonnull       75
    //   12   21:aload           4
    //   13   23:ifnonnull       54
    //   14   26:aload_0         
    //   15   27:invokespecial   #56  <Method MenuBuilder createMenu()>
    //   16   30:astore          4
    //   17   32:aload_0         
    //   18   33:aload           4
    //   19   35:invokespecial   #62  <Method void setMenu(MenuBuilder)>
    //   20   38:aload           4
    //   21   40:invokevirtual   #386 <Method void MenuBuilder.stopDispatchingItemsChanged()>
    //   22   43:aload_0         
    //   23   44:getfield        #240 <Field ActionBarActivity mActivity>
    //   24   47:iconst_0        
    //   25   48:aload           4
    //   26   50:invokevirtual   #382 <Method boolean ActionBarActivity.superOnCreatePanelMenu(int, Menu)>
    //   27   53:istore_3        
    //   28   54:iload_3         
    //   29   55:ifeq            75
    //   30   58:aload           4
    //   31   60:invokevirtual   #386 <Method void MenuBuilder.stopDispatchingItemsChanged()>
    //   32   63:aload_0         
    //   33   64:getfield        #240 <Field ActionBarActivity mActivity>
    //   34   67:iconst_0        
    //   35   68:aconst_null     
    //   36   69:aload           4
    //   37   71:invokevirtual   #390 <Method boolean ActionBarActivity.superOnPreparePanel(int, View, Menu)>
    //   38   74:istore_3        
    //   39   75:iload_3         
    //   40   76:ifeq            99
    //   41   79:aload_0         
    //   42   80:aload_0         
    //   43   81:getfield        #240 <Field ActionBarActivity mActivity>
    //   44   84:aload_0         
    //   45   85:invokespecial   #392 <Method MenuView getListMenuView(Context, android.support.v7.internal.view.menu.MenuPresenter$Callback)>
    //   46   88:checkcast       #394 <Class View>
    //   47   91:astore_2        
    //   48   92:aload           4
    //   49   94:invokevirtual   #397 <Method void MenuBuilder.startDispatchingItemsChanged()>
    //   50   97:aload_2         
    //   51   98:areturn         
    //   52   99:aload_0         
    //   53  100:aconst_null     
    //   54  101:invokespecial   #62  <Method void setMenu(MenuBuilder)>
    //   55  104:aconst_null     
    //   56  105:areturn         
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
    //    0    0:iload_1         
    //    1    1:ifne            9
    //    2    4:aload_2         
    //    3    5:invokestatic    #405 <Method MenuItem MenuWrapperFactory.createMenuItemWrapper(MenuItem)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:getfield        #240 <Field ActionBarActivity mActivity>
    //    7   13:iload_1         
    //    8   14:aload_2         
    //    9   15:invokevirtual   #408 <Method boolean ActionBarActivity.superOnMenuItemSelected(int, MenuItem)>
    //   10   18:ireturn         
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #240 <Field ActionBarActivity mActivity>
    //    2    4:iconst_0        
    //    3    5:aload_2         
    //    4    6:invokevirtual   #411 <Method boolean ActionBarActivity.onMenuItemSelected(int, MenuItem)>
    //    5    9:ireturn         
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_1        
    //    3    3:invokespecial   #414 <Method void reopenMenu(MenuBuilder, boolean)>
    //    4    6:return          
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void onPostResume()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #375 <Method ActionBar getSupportActionBar()>
    //    2    4:checkcast       #258 <Class ActionBarImplBase>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnull          17
    //    6   12:aload_1         
    //    7   13:iconst_1        
    //    8   14:invokevirtual   #420 <Method void ActionBarImplBase.setShowHideAnimationEnabled(boolean)>
    //    9   17:return          
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            15
    //    2    4:aload_0         
    //    3    5:getfield        #240 <Field ActionBarActivity mActivity>
    //    4    8:iload_1         
    //    5    9:aload_2         
    //    6   10:aload_3         
    //    7   11:invokevirtual   #390 <Method boolean ActionBarActivity.superOnPreparePanel(int, View, Menu)>
    //    8   14:ireturn         
    //    9   15:iconst_0        
    //   10   16:ireturn         
    }

    public void onStop()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #375 <Method ActionBar getSupportActionBar()>
    //    2    4:checkcast       #258 <Class ActionBarImplBase>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnull          17
    //    6   12:aload_1         
    //    7   13:iconst_0        
    //    8   14:invokevirtual   #420 <Method void ActionBarImplBase.setShowHideAnimationEnabled(boolean)>
    //    9   17:return          
    }

    public void onTitleChanged(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #76  <Field ActionBarView mActionBarView>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #427 <Method void ActionBarView.setWindowTitle(CharSequence)>
    //    7   15:return          
    }

    public void setContentView(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #233 <Method void ensureSubDecor()>
    //    2    4:aload_0         
    //    3    5:getfield        #236 <Field boolean mHasActionBar>
    //    4    8:ifeq            43
    //    5   11:aload_0         
    //    6   12:getfield        #240 <Field ActionBarActivity mActivity>
    //    7   15:getstatic       #243 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
    //    8   18:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //    9   21:checkcast       #248 <Class ViewGroup>
    //   10   24:astore_2        
    //   11   25:aload_2         
    //   12   26:invokevirtual   #431 <Method void ViewGroup.removeAllViews()>
    //   13   29:aload_0         
    //   14   30:getfield        #240 <Field ActionBarActivity mActivity>
    //   15   33:invokevirtual   #435 <Method LayoutInflater ActionBarActivity.getLayoutInflater()>
    //   16   36:iload_1         
    //   17   37:aload_2         
    //   18   38:invokevirtual   #441 <Method View LayoutInflater.inflate(int, ViewGroup)>
    //   19   41:pop             
    //   20   42:return          
    //   21   43:aload_0         
    //   22   44:getfield        #240 <Field ActionBarActivity mActivity>
    //   23   47:iload_1         
    //   24   48:invokevirtual   #271 <Method void ActionBarActivity.superSetContentView(int)>
    //   25   51:return          
    }

    public void setContentView(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #233 <Method void ensureSubDecor()>
    //    2    4:aload_0         
    //    3    5:getfield        #236 <Field boolean mHasActionBar>
    //    4    8:ifeq            35
    //    5   11:aload_0         
    //    6   12:getfield        #240 <Field ActionBarActivity mActivity>
    //    7   15:getstatic       #243 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
    //    8   18:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //    9   21:checkcast       #248 <Class ViewGroup>
    //   10   24:astore_2        
    //   11   25:aload_2         
    //   12   26:invokevirtual   #431 <Method void ViewGroup.removeAllViews()>
    //   13   29:aload_2         
    //   14   30:aload_1         
    //   15   31:invokevirtual   #444 <Method void ViewGroup.addView(View)>
    //   16   34:return          
    //   17   35:aload_0         
    //   18   36:getfield        #240 <Field ActionBarActivity mActivity>
    //   19   39:aload_1         
    //   20   40:invokevirtual   #446 <Method void ActionBarActivity.superSetContentView(View)>
    //   21   43:return          
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #233 <Method void ensureSubDecor()>
    //    2    4:aload_0         
    //    3    5:getfield        #236 <Field boolean mHasActionBar>
    //    4    8:ifeq            36
    //    5   11:aload_0         
    //    6   12:getfield        #240 <Field ActionBarActivity mActivity>
    //    7   15:getstatic       #243 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
    //    8   18:invokevirtual   #246 <Method View ActionBarActivity.findViewById(int)>
    //    9   21:checkcast       #248 <Class ViewGroup>
    //   10   24:astore_3        
    //   11   25:aload_3         
    //   12   26:invokevirtual   #431 <Method void ViewGroup.removeAllViews()>
    //   13   29:aload_3         
    //   14   30:aload_1         
    //   15   31:aload_2         
    //   16   32:invokevirtual   #251 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
    //   17   35:return          
    //   18   36:aload_0         
    //   19   37:getfield        #240 <Field ActionBarActivity mActivity>
    //   20   40:aload_1         
    //   21   41:aload_2         
    //   22   42:invokevirtual   #254 <Method void ActionBarActivity.superSetContentView(View, android.view.ViewGroup$LayoutParams)>
    //   23   45:return          
    }

    void setSupportProgress(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_0        
    //    3    3:iadd            
    //    4    4:invokespecial   #449 <Method void updateProgressBars(int)>
    //    5    7:return          
    }

    void setSupportProgressBarIndeterminate(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            13
    //    2    4:bipush          -3
    //    3    6:istore_2        
    //    4    7:aload_0         
    //    5    8:iload_2         
    //    6    9:invokespecial   #449 <Method void updateProgressBars(int)>
    //    7   12:return          
    //    8   13:bipush          -4
    //    9   15:istore_2        
    //   10   16:goto            7
    }

    void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            12
    //    2    4:iconst_m1       
    //    3    5:istore_2        
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:invokespecial   #449 <Method void updateProgressBars(int)>
    //    7   11:return          
    //    8   12:bipush          -2
    //    9   14:istore_2        
    //   10   15:goto            6
    }

    void setSupportProgressBarVisibility(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            12
    //    2    4:iconst_m1       
    //    3    5:istore_2        
    //    4    6:aload_0         
    //    5    7:iload_2         
    //    6    8:invokespecial   #449 <Method void updateProgressBars(int)>
    //    7   11:return          
    //    8   12:bipush          -2
    //    9   14:istore_2        
    //   10   15:goto            6
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       15
    //    2    4:new             #456 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc2            #458 <String "ActionMode callback can not be null.">
    //    5   11:invokespecial   #461 <Method void IllegalArgumentException(String)>
    //    6   14:athrow          
    //    7   15:aload_0         
    //    8   16:getfield        #70  <Field ActionMode mActionMode>
    //    9   19:ifnull          29
    //   10   22:aload_0         
    //   11   23:getfield        #70  <Field ActionMode mActionMode>
    //   12   26:invokevirtual   #360 <Method void ActionMode.finish()>
    //   13   29:new             #463 <Class ActionBarActivityDelegateBase$ActionModeCallbackWrapper>
    //   14   32:dup             
    //   15   33:aload_0         
    //   16   34:aload_1         
    //   17   35:invokespecial   #466 <Method void ActionBarActivityDelegateBase$ActionModeCallbackWrapper(ActionBarActivityDelegateBase, android.support.v7.view.ActionMode$Callback)>
    //   18   38:astore_2        
    //   19   39:aload_0         
    //   20   40:invokevirtual   #375 <Method ActionBar getSupportActionBar()>
    //   21   43:checkcast       #258 <Class ActionBarImplBase>
    //   22   46:astore_3        
    //   23   47:aload_3         
    //   24   48:ifnull          60
    //   25   51:aload_0         
    //   26   52:aload_3         
    //   27   53:aload_2         
    //   28   54:invokevirtual   #469 <Method ActionMode ActionBarImplBase.startActionMode(android.support.v7.view.ActionMode$Callback)>
    //   29   57:putfield        #70  <Field ActionMode mActionMode>
    //   30   60:aload_0         
    //   31   61:getfield        #70  <Field ActionMode mActionMode>
    //   32   64:ifnull          78
    //   33   67:aload_0         
    //   34   68:getfield        #240 <Field ActionBarActivity mActivity>
    //   35   71:aload_0         
    //   36   72:getfield        #70  <Field ActionMode mActionMode>
    //   37   75:invokevirtual   #473 <Method void ActionBarActivity.onSupportActionModeStarted(ActionMode)>
    //   38   78:aload_0         
    //   39   79:getfield        #70  <Field ActionMode mActionMode>
    //   40   82:areturn         
    }

    public void supportInvalidateOptionsMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field boolean mInvalidateMenuPosted>
    //    2    4:ifne            30
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #66  <Field boolean mInvalidateMenuPosted>
    //    6   12:aload_0         
    //    7   13:getfield        #240 <Field ActionBarActivity mActivity>
    //    8   16:invokevirtual   #477 <Method Window ActionBarActivity.getWindow()>
    //    9   19:invokevirtual   #483 <Method View Window.getDecorView()>
    //   10   22:aload_0         
    //   11   23:getfield        #50  <Field Runnable mInvalidateMenuRunnable>
    //   12   26:invokevirtual   #487 <Method boolean View.post(Runnable)>
    //   13   29:pop             
    //   14   30:return          
    }

    public boolean supportRequestWindowFeature(int i)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     2 9: default 48
    //                   2 71
    //                   3 48
    //                   4 48
    //                   5 78
    //                   6 48
    //                   7 48
    //                   8 57
    //                   9 64
    //    2   48:aload_0         
    //    3   49:getfield        #240 <Field ActionBarActivity mActivity>
    //    4   52:iload_1         
    //    5   53:invokevirtual   #491 <Method boolean ActionBarActivity.requestWindowFeature(int)>
    //    6   56:ireturn         
    //    7   57:aload_0         
    //    8   58:iconst_1        
    //    9   59:putfield        #236 <Field boolean mHasActionBar>
    //   10   62:iconst_1        
    //   11   63:ireturn         
    //   12   64:aload_0         
    //   13   65:iconst_1        
    //   14   66:putfield        #266 <Field boolean mOverlayActionBar>
    //   15   69:iconst_1        
    //   16   70:ireturn         
    //   17   71:aload_0         
    //   18   72:iconst_1        
    //   19   73:putfield        #181 <Field boolean mFeatureProgress>
    //   20   76:iconst_1        
    //   21   77:ireturn         
    //   22   78:aload_0         
    //   23   79:iconst_1        
    //   24   80:putfield        #175 <Field boolean mFeatureIndeterminateProgress>
    //   25   83:iconst_1        
    //   26   84:ireturn         
    }

    private static final int ACTION_BAR_DRAWABLE_TOGGLE_ATTRS[];
    private static final String TAG = "ActionBarActivityDelegateBase";
    private ActionBarView mActionBarView;
    private ActionMode mActionMode;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mInvalidateMenuPosted;
    private final Runnable mInvalidateMenuRunnable;
    private ListMenuPresenter mListMenuPresenter;
    private MenuBuilder mMenu;
    private boolean mSubDecorInstalled;

    static MenuBuilder access$000(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #56  <Method MenuBuilder createMenu()>
    //    2    4:areturn         
    }

    static void access$100(ActionBarActivityDelegateBase actionbaractivitydelegatebase, MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #62  <Method void setMenu(MenuBuilder)>
    //    3    5:return          
    }

    static boolean access$202(ActionBarActivityDelegateBase actionbaractivitydelegatebase, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #66  <Field boolean mInvalidateMenuPosted>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static ActionMode access$402(ActionBarActivityDelegateBase actionbaractivitydelegatebase, ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field ActionMode mActionMode>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    static int[] access$500()
    {
    //    0    0:getstatic       #39  <Field int[] ACTION_BAR_DRAWABLE_TOGGLE_ATTRS>
    //    1    3:areturn         
    }

    static ActionBarView access$600(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field ActionBarView mActionBarView>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/app/ActionBarActivityDelegateBase$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //    2    4:invokestatic    #22  <Method MenuBuilder ActionBarActivityDelegateBase.access$000(ActionBarActivityDelegateBase)>
        //    3    7:astore_1        
        //    4    8:aload_0         
        //    5    9:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //    6   12:getfield        #26  <Field ActionBarActivity ActionBarActivityDelegateBase.mActivity>
        //    7   15:iconst_0        
        //    8   16:aload_1         
        //    9   17:invokevirtual   #32  <Method boolean ActionBarActivity.superOnCreatePanelMenu(int, Menu)>
        //   10   20:ifeq            57
        //   11   23:aload_0         
        //   12   24:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //   13   27:getfield        #26  <Field ActionBarActivity ActionBarActivityDelegateBase.mActivity>
        //   14   30:iconst_0        
        //   15   31:aconst_null     
        //   16   32:aload_1         
        //   17   33:invokevirtual   #36  <Method boolean ActionBarActivity.superOnPreparePanel(int, View, Menu)>
        //   18   36:ifeq            57
        //   19   39:aload_0         
        //   20   40:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //   21   43:aload_1         
        //   22   44:invokestatic    #40  <Method void ActionBarActivityDelegateBase.access$100(ActionBarActivityDelegateBase, MenuBuilder)>
        //   23   47:aload_0         
        //   24   48:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //   25   51:iconst_0        
        //   26   52:invokestatic    #44  <Method boolean ActionBarActivityDelegateBase.access$202(ActionBarActivityDelegateBase, boolean)>
        //   27   55:pop             
        //   28   56:return          
        //   29   57:aload_0         
        //   30   58:getfield        #14  <Field ActionBarActivityDelegateBase this$0>
        //   31   61:aconst_null     
        //   32   62:invokestatic    #40  <Method void ActionBarActivityDelegateBase.access$100(ActionBarActivityDelegateBase, MenuBuilder)>
        //   33   65:goto            47
        }

        final ActionBarActivityDelegateBase this$0;
    }

}
