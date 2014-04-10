// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar

class ActionBarImplICS extends android.support.v7.app.ActionBar
{
    static class OnMenuVisibilityListenerWrapper
        implements android.app.ActionBar.OnMenuVisibilityListener
    {

        public OnMenuVisibilityListenerWrapper(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #15  <Field ActionBar$OnMenuVisibilityListener mWrappedListener>
        //    5    9:return          
        }

        public void onMenuVisibilityChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field ActionBar$OnMenuVisibilityListener mWrappedListener>
        //    2    4:iload_1         
        //    3    5:invokeinterface #21  <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>
        //    4   10:return          
        }

        final ActionBar.OnMenuVisibilityListener mWrappedListener;
    }

    static class OnNavigationListenerWrapper
        implements android.app.ActionBar.OnNavigationListener
    {

        public OnNavigationListenerWrapper(ActionBar.OnNavigationListener onnavigationlistener)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #15  <Field ActionBar$OnNavigationListener mWrappedListener>
        //    5    9:return          
        }

        public boolean onNavigationItemSelected(int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field ActionBar$OnNavigationListener mWrappedListener>
        //    2    4:iload_1         
        //    3    5:lload_2         
        //    4    6:invokeinterface #21  <Method boolean ActionBar$OnNavigationListener.onNavigationItemSelected(int, long)>
        //    5   11:ireturn         
        }

        private final ActionBar.OnNavigationListener mWrappedListener;
    }

    class TabWrapper extends ActionBar.Tab
        implements android.app.ActionBar.TabListener
    {

        public TabWrapper(android.app.ActionBar.Tab tab)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field ActionBarImplICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #25  <Method void ActionBar$Tab()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    8   14:return          
        }

        private void commitActiveTransaction()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field FragmentTransaction mActiveTransaction>
        //    2    4:ifnull          25
        //    3    7:aload_0         
        //    4    8:getfield        #30  <Field FragmentTransaction mActiveTransaction>
        //    5   11:invokevirtual   #36  <Method boolean FragmentTransaction.isEmpty()>
        //    6   14:ifne            25
        //    7   17:aload_0         
        //    8   18:getfield        #30  <Field FragmentTransaction mActiveTransaction>
        //    9   21:invokevirtual   #40  <Method int FragmentTransaction.commit()>
        //   10   24:pop             
        //   11   25:aload_0         
        //   12   26:aconst_null     
        //   13   27:putfield        #30  <Field FragmentTransaction mActiveTransaction>
        //   14   30:return          
        }

        private FragmentTransaction getActiveTransaction()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field FragmentTransaction mActiveTransaction>
        //    2    4:ifnonnull       29
        //    3    7:aload_0         
        //    4    8:aload_0         
        //    5    9:getfield        #22  <Field ActionBarImplICS this$0>
        //    6   12:getfield        #48  <Field ActionBar$Callback ActionBarImplICS.mCallback>
        //    7   15:invokeinterface #54  <Method FragmentManager ActionBar$Callback.getSupportFragmentManager()>
        //    8   20:invokevirtual   #59  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    9   23:invokevirtual   #62  <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
        //   10   26:putfield        #30  <Field FragmentTransaction mActiveTransaction>
        //   11   29:aload_0         
        //   12   30:getfield        #30  <Field FragmentTransaction mActiveTransaction>
        //   13   33:areturn         
        }

        public CharSequence getContentDescription()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #66  <Field CharSequence mContentDescription>
        //    2    4:areturn         
        }

        public View getCustomView()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:invokevirtual   #72  <Method View android.app.ActionBar$Tab.getCustomView()>
        //    3    7:areturn         
        }

        public Drawable getIcon()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:invokevirtual   #76  <Method Drawable android.app.ActionBar$Tab.getIcon()>
        //    3    7:areturn         
        }

        public int getPosition()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:invokevirtual   #79  <Method int android.app.ActionBar$Tab.getPosition()>
        //    3    7:ireturn         
        }

        public Object getTag()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #83  <Field Object mTag>
        //    2    4:areturn         
        }

        public CharSequence getText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:invokevirtual   #86  <Method CharSequence android.app.ActionBar$Tab.getText()>
        //    3    7:areturn         
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #90  <Field ActionBar$TabListener mTabListener>
        //    2    4:astore_3        
        //    3    5:aload_2         
        //    4    6:ifnull          29
        //    5    9:aload_0         
        //    6   10:invokespecial   #92  <Method FragmentTransaction getActiveTransaction()>
        //    7   13:astore          4
        //    8   15:aload_3         
        //    9   16:aload_0         
        //   10   17:aload           4
        //   11   19:invokeinterface #97  <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
        //   12   24:aload_0         
        //   13   25:invokespecial   #99  <Method void commitActiveTransaction()>
        //   14   28:return          
        //   15   29:aconst_null     
        //   16   30:astore          4
        //   17   32:goto            15
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #90  <Field ActionBar$TabListener mTabListener>
        //    2    4:astore_3        
        //    3    5:aload_2         
        //    4    6:ifnull          29
        //    5    9:aload_0         
        //    6   10:invokespecial   #92  <Method FragmentTransaction getActiveTransaction()>
        //    7   13:astore          4
        //    8   15:aload_3         
        //    9   16:aload_0         
        //   10   17:aload           4
        //   11   19:invokeinterface #102 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
        //   12   24:aload_0         
        //   13   25:invokespecial   #99  <Method void commitActiveTransaction()>
        //   14   28:return          
        //   15   29:aconst_null     
        //   16   30:astore          4
        //   17   32:goto            15
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmenttransaction)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #90  <Field ActionBar$TabListener mTabListener>
        //    2    4:astore_3        
        //    3    5:aload_2         
        //    4    6:ifnull          25
        //    5    9:aload_0         
        //    6   10:invokespecial   #92  <Method FragmentTransaction getActiveTransaction()>
        //    7   13:astore          4
        //    8   15:aload_3         
        //    9   16:aload_0         
        //   10   17:aload           4
        //   11   19:invokeinterface #105 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
        //   12   24:return          
        //   13   25:aconst_null     
        //   14   26:astore          4
        //   15   28:goto            15
        }

        public void select()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:invokevirtual   #108 <Method void android.app.ActionBar$Tab.select()>
        //    3    7:return          
        }

        public ActionBar.Tab setContentDescription(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #22  <Field ActionBarImplICS this$0>
        //    3    5:getfield        #114 <Field Activity ActionBarImplICS.mActivity>
        //    4    8:iload_1         
        //    5    9:invokevirtual   #119 <Method CharSequence Activity.getText(int)>
        //    6   12:putfield        #66  <Field CharSequence mContentDescription>
        //    7   15:aload_0         
        //    8   16:areturn         
        }

        public ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #66  <Field CharSequence mContentDescription>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public ActionBar.Tab setCustomView(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #124 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setCustomView(int)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public ActionBar.Tab setCustomView(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #128 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setCustomView(View)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public ActionBar.Tab setIcon(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #131 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setIcon(int)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public ActionBar.Tab setIcon(Drawable drawable)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #135 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setIcon(Drawable)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #90  <Field ActionBar$TabListener mTabListener>
        //    3    5:aload_0         
        //    4    6:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    5    9:astore_2        
        //    6   10:aload_1         
        //    7   11:ifnull          24
        //    8   14:aload_0         
        //    9   15:astore_3        
        //   10   16:aload_2         
        //   11   17:aload_3         
        //   12   18:invokevirtual   #140 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setTabListener(android.app.ActionBar$TabListener)>
        //   13   21:pop             
        //   14   22:aload_0         
        //   15   23:areturn         
        //   16   24:aconst_null     
        //   17   25:astore_3        
        //   18   26:goto            16
        }

        public ActionBar.Tab setTag(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #83  <Field Object mTag>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public ActionBar.Tab setText(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #145 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setText(int)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public ActionBar.Tab setText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field android.app.ActionBar$Tab mWrappedTab>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #148 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setText(CharSequence)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        private FragmentTransaction mActiveTransaction;
        private CharSequence mContentDescription;
        private ActionBar.TabListener mTabListener;
        private Object mTag;
        final android.app.ActionBar.Tab mWrappedTab;
        final ActionBarImplICS this$0;
    }


    public ActionBarImplICS(Activity activity, ActionBar.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void android.support.v7.app.ActionBar()>
    //    2    4:aload_0         
    //    3    5:new             #20  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #21  <Method void ArrayList()>
    //    6   12:putfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #25  <Field Activity mActivity>
    //   10   20:aload_0         
    //   11   21:aload_2         
    //   12   22:putfield        #27  <Field ActionBar$Callback mCallback>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:invokevirtual   #33  <Method ActionBar Activity.getActionBar()>
    //   16   30:putfield        #35  <Field ActionBar mActionBar>
    //   17   33:return          
    }

    private OnMenuVisibilityListenerWrapper findAndRemoveMenuVisWrapper(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:getfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //    5    7:invokevirtual   #41  <Method int ArrayList.size()>
    //    6   10:icmpge          81
    //    7   13:aload_0         
    //    8   14:getfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //    9   17:iload_2         
    //   10   18:invokevirtual   #45  <Method Object ArrayList.get(int)>
    //   11   21:checkcast       #47  <Class WeakReference>
    //   12   24:invokevirtual   #50  <Method Object WeakReference.get()>
    //   13   27:checkcast       #52  <Class ActionBarImplICS$OnMenuVisibilityListenerWrapper>
    //   14   30:astore_3        
    //   15   31:aload_3         
    //   16   32:ifnonnull       62
    //   17   35:aload_0         
    //   18   36:getfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //   19   39:astore          5
    //   20   41:iload_2         
    //   21   42:iconst_1        
    //   22   43:isub            
    //   23   44:istore          6
    //   24   46:aload           5
    //   25   48:iload_2         
    //   26   49:invokevirtual   #55  <Method Object ArrayList.remove(int)>
    //   27   52:pop             
    //   28   53:iload           6
    //   29   55:istore_2        
    //   30   56:iinc            2  1
    //   31   59:goto            2
    //   32   62:aload_3         
    //   33   63:getfield        #59  <Field ActionBar$OnMenuVisibilityListener ActionBarImplICS$OnMenuVisibilityListenerWrapper.mWrappedListener>
    //   34   66:aload_1         
    //   35   67:if_acmpne       56
    //   36   70:aload_0         
    //   37   71:getfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //   38   74:iload_2         
    //   39   75:invokevirtual   #55  <Method Object ArrayList.remove(int)>
    //   40   78:pop             
    //   41   79:aload_3         
    //   42   80:areturn         
    //   43   81:aconst_null     
    //   44   82:areturn         
    }

    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          37
    //    2    4:new             #52  <Class ActionBarImplICS$OnMenuVisibilityListenerWrapper>
    //    3    7:dup             
    //    4    8:aload_1         
    //    5    9:invokespecial   #63  <Method void ActionBarImplICS$OnMenuVisibilityListenerWrapper(ActionBar$OnMenuVisibilityListener)>
    //    6   12:astore_2        
    //    7   13:aload_0         
    //    8   14:getfield        #23  <Field ArrayList mAddedMenuVisWrappers>
    //    9   17:new             #47  <Class WeakReference>
    //   10   20:dup             
    //   11   21:aload_2         
    //   12   22:invokespecial   #66  <Method void WeakReference(Object)>
    //   13   25:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
    //   14   28:pop             
    //   15   29:aload_0         
    //   16   30:getfield        #35  <Field ActionBar mActionBar>
    //   17   33:aload_2         
    //   18   34:invokevirtual   #75  <Method void ActionBar.addOnMenuVisibilityListener(android.app.ActionBar$OnMenuVisibilityListener)>
    //   19   37:return          
    }

    public void addTab(ActionBar.Tab tab)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:invokevirtual   #86  <Method void ActionBar.addTab(android.app.ActionBar$Tab)>
    //    6   14:return          
    }

    public void addTab(ActionBar.Tab tab, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:iload_2         
    //    6   12:invokevirtual   #90  <Method void ActionBar.addTab(android.app.ActionBar$Tab, int)>
    //    7   15:return          
    }

    public void addTab(ActionBar.Tab tab, int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:iload_2         
    //    6   12:iload_3         
    //    7   13:invokevirtual   #94  <Method void ActionBar.addTab(android.app.ActionBar$Tab, int, boolean)>
    //    8   16:return          
    }

    public void addTab(ActionBar.Tab tab, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:iload_2         
    //    6   12:invokevirtual   #98  <Method void ActionBar.addTab(android.app.ActionBar$Tab, boolean)>
    //    7   15:return          
    }

    public View getCustomView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #102 <Method View ActionBar.getCustomView()>
    //    3    7:areturn         
    }

    public int getDisplayOptions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #105 <Method int ActionBar.getDisplayOptions()>
    //    3    7:ireturn         
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #108 <Method int ActionBar.getHeight()>
    //    3    7:ireturn         
    }

    public int getNavigationItemCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #111 <Method int ActionBar.getNavigationItemCount()>
    //    3    7:ireturn         
    }

    public int getNavigationMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #114 <Method int ActionBar.getNavigationMode()>
    //    3    7:ireturn         
    }

    public int getSelectedNavigationIndex()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #117 <Method int ActionBar.getSelectedNavigationIndex()>
    //    3    7:ireturn         
    }

    public ActionBar.Tab getSelectedTab()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #122 <Method android.app.ActionBar$Tab ActionBar.getSelectedTab()>
    //    3    7:invokevirtual   #127 <Method Object android.app.ActionBar$Tab.getTag()>
    //    4   10:checkcast       #129 <Class ActionBar$Tab>
    //    5   13:areturn         
    }

    public CharSequence getSubtitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #133 <Method CharSequence ActionBar.getSubtitle()>
    //    3    7:areturn         
    }

    public ActionBar.Tab getTabAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #138 <Method android.app.ActionBar$Tab ActionBar.getTabAt(int)>
    //    4    8:invokevirtual   #127 <Method Object android.app.ActionBar$Tab.getTag()>
    //    5   11:checkcast       #129 <Class ActionBar$Tab>
    //    6   14:areturn         
    }

    public int getTabCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #141 <Method int ActionBar.getTabCount()>
    //    3    7:ireturn         
    }

    public Context getThemedContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #145 <Method Context ActionBar.getThemedContext()>
    //    3    7:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #148 <Method CharSequence ActionBar.getTitle()>
    //    3    7:areturn         
    }

    public void hide()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #151 <Method void ActionBar.hide()>
    //    3    7:return          
    }

    public boolean isShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #155 <Method boolean ActionBar.isShowing()>
    //    3    7:ireturn         
    }

    public ActionBar.Tab newTab()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #158 <Method android.app.ActionBar$Tab ActionBar.newTab()>
    //    3    7:astore_1        
    //    4    8:new             #79  <Class ActionBarImplICS$TabWrapper>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:invokespecial   #161 <Method void ActionBarImplICS$TabWrapper(ActionBarImplICS, android.app.ActionBar$Tab)>
    //    9   17:astore_2        
    //   10   18:aload_1         
    //   11   19:aload_2         
    //   12   20:invokevirtual   #165 <Method android.app.ActionBar$Tab android.app.ActionBar$Tab.setTag(Object)>
    //   13   23:pop             
    //   14   24:aload_2         
    //   15   25:areturn         
    }

    public void removeAllTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #168 <Method void ActionBar.removeAllTabs()>
    //    3    7:return          
    }

    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #171 <Method ActionBarImplICS$OnMenuVisibilityListenerWrapper findAndRemoveMenuVisWrapper(ActionBar$OnMenuVisibilityListener)>
    //    3    5:astore_2        
    //    4    6:aload_0         
    //    5    7:getfield        #35  <Field ActionBar mActionBar>
    //    6   10:aload_2         
    //    7   11:invokevirtual   #173 <Method void ActionBar.removeOnMenuVisibilityListener(android.app.ActionBar$OnMenuVisibilityListener)>
    //    8   14:return          
    }

    public void removeTab(ActionBar.Tab tab)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:invokevirtual   #176 <Method void ActionBar.removeTab(android.app.ActionBar$Tab)>
    //    6   14:return          
    }

    public void removeTabAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #180 <Method void ActionBar.removeTabAt(int)>
    //    4    8:return          
    }

    public void selectTab(ActionBar.Tab tab)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:checkcast       #79  <Class ActionBarImplICS$TabWrapper>
    //    4    8:getfield        #83  <Field android.app.ActionBar$Tab ActionBarImplICS$TabWrapper.mWrappedTab>
    //    5   11:invokevirtual   #183 <Method void ActionBar.selectTab(android.app.ActionBar$Tab)>
    //    6   14:return          
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #187 <Method void ActionBar.setBackgroundDrawable(Drawable)>
    //    4    8:return          
    }

    public void setCustomView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #190 <Method void ActionBar.setCustomView(int)>
    //    4    8:return          
    }

    public void setCustomView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #193 <Method void ActionBar.setCustomView(View)>
    //    4    8:return          
    }

    public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
    //    0    0:new             #196 <Class android.app.ActionBar$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_2         
    //    3    5:invokespecial   #199 <Method void android.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:aload_2         
    //    7   11:getfield        #205 <Field int ActionBar$LayoutParams.gravity>
    //    8   14:putfield        #206 <Field int android.app.ActionBar$LayoutParams.gravity>
    //    9   17:aload_0         
    //   10   18:getfield        #35  <Field ActionBar mActionBar>
    //   11   21:aload_1         
    //   12   22:aload_3         
    //   13   23:invokevirtual   #209 <Method void ActionBar.setCustomView(View, android.app.ActionBar$LayoutParams)>
    //   14   26:return          
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #213 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //    4    8:return          
    }

    public void setDisplayOptions(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #216 <Method void ActionBar.setDisplayOptions(int)>
    //    4    8:return          
    }

    public void setDisplayOptions(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #219 <Method void ActionBar.setDisplayOptions(int, int)>
    //    5    9:return          
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #222 <Method void ActionBar.setDisplayShowCustomEnabled(boolean)>
    //    4    8:return          
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #225 <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
    //    4    8:return          
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #228 <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
    //    4    8:return          
    }

    public void setDisplayUseLogoEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #231 <Method void ActionBar.setDisplayUseLogoEnabled(boolean)>
    //    4    8:return          
    }

    public void setIcon(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #234 <Method void ActionBar.setIcon(int)>
    //    4    8:return          
    }

    public void setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #236 <Method void ActionBar.setIcon(Drawable)>
    //    4    8:return          
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:astore_3        
    //    3    5:aload_2         
    //    4    6:ifnull          27
    //    5    9:new             #240 <Class ActionBarImplICS$OnNavigationListenerWrapper>
    //    6   12:dup             
    //    7   13:aload_2         
    //    8   14:invokespecial   #243 <Method void ActionBarImplICS$OnNavigationListenerWrapper(ActionBar$OnNavigationListener)>
    //    9   17:astore          4
    //   10   19:aload_3         
    //   11   20:aload_1         
    //   12   21:aload           4
    //   13   23:invokevirtual   #246 <Method void ActionBar.setListNavigationCallbacks(SpinnerAdapter, android.app.ActionBar$OnNavigationListener)>
    //   14   26:return          
    //   15   27:aconst_null     
    //   16   28:astore          4
    //   17   30:goto            19
    }

    public void setLogo(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #249 <Method void ActionBar.setLogo(int)>
    //    4    8:return          
    }

    public void setLogo(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #251 <Method void ActionBar.setLogo(Drawable)>
    //    4    8:return          
    }

    public void setNavigationMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #254 <Method void ActionBar.setNavigationMode(int)>
    //    4    8:return          
    }

    public void setSelectedNavigationItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #257 <Method void ActionBar.setSelectedNavigationItem(int)>
    //    4    8:return          
    }

    public void setSubtitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #260 <Method void ActionBar.setSubtitle(int)>
    //    4    8:return          
    }

    public void setSubtitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #263 <Method void ActionBar.setSubtitle(CharSequence)>
    //    4    8:return          
    }

    public void setTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #266 <Method void ActionBar.setTitle(int)>
    //    4    8:return          
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #268 <Method void ActionBar.setTitle(CharSequence)>
    //    4    8:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field ActionBar mActionBar>
    //    2    4:invokevirtual   #271 <Method void ActionBar.show()>
    //    3    7:return          
    }

    final ActionBar mActionBar;
    final Activity mActivity;
    private ArrayList mAddedMenuVisWrappers;
    final ActionBar.Callback mCallback;
}
