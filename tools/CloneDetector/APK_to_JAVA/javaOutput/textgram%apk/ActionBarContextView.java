// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.*;
import android.support.v7.view.ActionMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, ActionBarContainer

public class ActionBarContextView extends AbsActionBarView
{

    public ActionBarContextView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #31  <Method void ActionBarContextView(Context, AttributeSet)>
    //    4    6:return          
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #36  <Field int android.support.v7.appcompat.R$attr.actionModeStyle>
    //    4    6:invokespecial   #39  <Method void ActionBarContextView(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #40  <Method void AbsActionBarView(Context, AttributeSet, int)>
    //    5    7:aload_1         
    //    6    8:aload_2         
    //    7    9:getstatic       #46  <Field int[] android.support.v7.appcompat.R$styleable.ActionMode>
    //    8   12:iload_3         
    //    9   13:iconst_0        
    //   10   14:invokevirtual   #52  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   11   17:astore          4
    //   12   19:aload_0         
    //   13   20:aload           4
    //   14   22:iconst_3        
    //   15   23:invokevirtual   #58  <Method Drawable TypedArray.getDrawable(int)>
    //   16   26:invokevirtual   #62  <Method void setBackgroundDrawable(Drawable)>
    //   17   29:aload_0         
    //   18   30:aload           4
    //   19   32:iconst_1        
    //   20   33:iconst_0        
    //   21   34:invokevirtual   #66  <Method int TypedArray.getResourceId(int, int)>
    //   22   37:putfield        #68  <Field int mTitleStyleRes>
    //   23   40:aload_0         
    //   24   41:aload           4
    //   25   43:iconst_2        
    //   26   44:iconst_0        
    //   27   45:invokevirtual   #66  <Method int TypedArray.getResourceId(int, int)>
    //   28   48:putfield        #70  <Field int mSubtitleStyleRes>
    //   29   51:aload_0         
    //   30   52:aload           4
    //   31   54:iconst_0        
    //   32   55:iconst_0        
    //   33   56:invokevirtual   #73  <Method int TypedArray.getLayoutDimension(int, int)>
    //   34   59:putfield        #76  <Field int mContentHeight>
    //   35   62:aload_0         
    //   36   63:aload           4
    //   37   65:iconst_4        
    //   38   66:invokevirtual   #58  <Method Drawable TypedArray.getDrawable(int)>
    //   39   69:putfield        #78  <Field Drawable mSplitBackground>
    //   40   72:aload           4
    //   41   74:invokevirtual   #82  <Method void TypedArray.recycle()>
    //   42   77:return          
    }

    private void initTitle()
    {
    //    0    0:bipush          8
    //    1    2:istore_1        
    //    2    3:aload_0         
    //    3    4:getfield        #85  <Field LinearLayout mTitleLayout>
    //    4    7:ifnonnull       120
    //    5   10:aload_0         
    //    6   11:invokevirtual   #89  <Method Context getContext()>
    //    7   14:invokestatic    #95  <Method LayoutInflater LayoutInflater.from(Context)>
    //    8   17:getstatic       #100 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
    //    9   20:aload_0         
    //   10   21:invokevirtual   #104 <Method View LayoutInflater.inflate(int, ViewGroup)>
    //   11   24:pop             
    //   12   25:aload_0         
    //   13   26:aload_0         
    //   14   27:iconst_m1       
    //   15   28:aload_0         
    //   16   29:invokevirtual   #108 <Method int getChildCount()>
    //   17   32:iadd            
    //   18   33:invokevirtual   #112 <Method View getChildAt(int)>
    //   19   36:checkcast       #114 <Class LinearLayout>
    //   20   39:putfield        #85  <Field LinearLayout mTitleLayout>
    //   21   42:aload_0         
    //   22   43:aload_0         
    //   23   44:getfield        #85  <Field LinearLayout mTitleLayout>
    //   24   47:getstatic       #119 <Field int android.support.v7.appcompat.R$id.action_bar_title>
    //   25   50:invokevirtual   #122 <Method View LinearLayout.findViewById(int)>
    //   26   53:checkcast       #124 <Class TextView>
    //   27   56:putfield        #126 <Field TextView mTitleView>
    //   28   59:aload_0         
    //   29   60:aload_0         
    //   30   61:getfield        #85  <Field LinearLayout mTitleLayout>
    //   31   64:getstatic       #129 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
    //   32   67:invokevirtual   #122 <Method View LinearLayout.findViewById(int)>
    //   33   70:checkcast       #124 <Class TextView>
    //   34   73:putfield        #131 <Field TextView mSubtitleView>
    //   35   76:aload_0         
    //   36   77:getfield        #68  <Field int mTitleStyleRes>
    //   37   80:ifeq            98
    //   38   83:aload_0         
    //   39   84:getfield        #126 <Field TextView mTitleView>
    //   40   87:aload_0         
    //   41   88:invokevirtual   #89  <Method Context getContext()>
    //   42   91:aload_0         
    //   43   92:getfield        #68  <Field int mTitleStyleRes>
    //   44   95:invokevirtual   #135 <Method void TextView.setTextAppearance(Context, int)>
    //   45   98:aload_0         
    //   46   99:getfield        #70  <Field int mSubtitleStyleRes>
    //   47  102:ifeq            120
    //   48  105:aload_0         
    //   49  106:getfield        #131 <Field TextView mSubtitleView>
    //   50  109:aload_0         
    //   51  110:invokevirtual   #89  <Method Context getContext()>
    //   52  113:aload_0         
    //   53  114:getfield        #70  <Field int mSubtitleStyleRes>
    //   54  117:invokevirtual   #135 <Method void TextView.setTextAppearance(Context, int)>
    //   55  120:aload_0         
    //   56  121:getfield        #126 <Field TextView mTitleView>
    //   57  124:aload_0         
    //   58  125:getfield        #137 <Field CharSequence mTitle>
    //   59  128:invokevirtual   #141 <Method void TextView.setText(CharSequence)>
    //   60  131:aload_0         
    //   61  132:getfield        #131 <Field TextView mSubtitleView>
    //   62  135:aload_0         
    //   63  136:getfield        #143 <Field CharSequence mSubtitle>
    //   64  139:invokevirtual   #141 <Method void TextView.setText(CharSequence)>
    //   65  142:aload_0         
    //   66  143:getfield        #137 <Field CharSequence mTitle>
    //   67  146:invokestatic    #149 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   68  149:ifne            227
    //   69  152:iconst_1        
    //   70  153:istore_2        
    //   71  154:aload_0         
    //   72  155:getfield        #143 <Field CharSequence mSubtitle>
    //   73  158:invokestatic    #149 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   74  161:ifne            232
    //   75  164:iconst_1        
    //   76  165:istore_3        
    //   77  166:aload_0         
    //   78  167:getfield        #131 <Field TextView mSubtitleView>
    //   79  170:astore          4
    //   80  172:iload_3         
    //   81  173:ifeq            237
    //   82  176:iconst_0        
    //   83  177:istore          5
    //   84  179:aload           4
    //   85  181:iload           5
    //   86  183:invokevirtual   #153 <Method void TextView.setVisibility(int)>
    //   87  186:aload_0         
    //   88  187:getfield        #85  <Field LinearLayout mTitleLayout>
    //   89  190:astore          6
    //   90  192:iload_2         
    //   91  193:ifne            200
    //   92  196:iload_3         
    //   93  197:ifeq            202
    //   94  200:iconst_0        
    //   95  201:istore_1        
    //   96  202:aload           6
    //   97  204:iload_1         
    //   98  205:invokevirtual   #154 <Method void LinearLayout.setVisibility(int)>
    //   99  208:aload_0         
    //  100  209:getfield        #85  <Field LinearLayout mTitleLayout>
    //  101  212:invokevirtual   #158 <Method android.view.ViewParent LinearLayout.getParent()>
    //  102  215:ifnonnull       226
    //  103  218:aload_0         
    //  104  219:aload_0         
    //  105  220:getfield        #85  <Field LinearLayout mTitleLayout>
    //  106  223:invokevirtual   #162 <Method void addView(View)>
    //  107  226:return          
    //  108  227:iconst_0        
    //  109  228:istore_2        
    //  110  229:goto            154
    //  111  232:iconst_0        
    //  112  233:istore_3        
    //  113  234:goto            166
    //  114  237:iload_1         
    //  115  238:istore          5
    //  116  240:goto            179
    }

    public volatile void animateToVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #165 <Method void AbsActionBarView.animateToVisibility(int)>
    //    3    5:return          
    }

    public void closeMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #168 <Field View mClose>
    //    2    4:ifnonnull       11
    //    3    7:aload_0         
    //    4    8:invokevirtual   #171 <Method void killMode()>
    //    5   11:return          
    }

    public volatile void dismissPopupMenus()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #174 <Method void AbsActionBarView.dismissPopupMenus()>
    //    2    4:return          
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #178 <Class android.view.ViewGroup$MarginLayoutParams>
    //    1    3:dup             
    //    2    4:iconst_m1       
    //    3    5:bipush          -2
    //    4    7:invokespecial   #181 <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
    //    5   10:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #178 <Class android.view.ViewGroup$MarginLayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #89  <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #184 <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    public volatile int getAnimatedVisibility()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #187 <Method int AbsActionBarView.getAnimatedVisibility()>
    //    2    4:ireturn         
    }

    public volatile int getContentHeight()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #190 <Method int AbsActionBarView.getContentHeight()>
    //    2    4:ireturn         
    }

    public CharSequence getSubtitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #143 <Field CharSequence mSubtitle>
    //    2    4:areturn         
    }

    public CharSequence getTitle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #137 <Field CharSequence mTitle>
    //    2    4:areturn         
    }

    public boolean hideOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #203 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public void initForMode(ActionMode actionmode)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #168 <Field View mClose>
    //    2    4:ifnonnull       161
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:invokevirtual   #89  <Method Context getContext()>
    //    6   12:invokestatic    #95  <Method LayoutInflater LayoutInflater.from(Context)>
    //    7   15:getstatic       #208 <Field int android.support.v7.appcompat.R$layout.abc_action_mode_close_item>
    //    8   18:aload_0         
    //    9   19:iconst_0        
    //   10   20:invokevirtual   #211 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   11   23:putfield        #168 <Field View mClose>
    //   12   26:aload_0         
    //   13   27:aload_0         
    //   14   28:getfield        #168 <Field View mClose>
    //   15   31:invokevirtual   #162 <Method void addView(View)>
    //   16   34:aload_0         
    //   17   35:getfield        #168 <Field View mClose>
    //   18   38:getstatic       #214 <Field int android.support.v7.appcompat.R$id.action_mode_close_button>
    //   19   41:invokevirtual   #217 <Method View View.findViewById(int)>
    //   20   44:new             #219 <Class ActionBarContextView$1>
    //   21   47:dup             
    //   22   48:aload_0         
    //   23   49:aload_1         
    //   24   50:invokespecial   #222 <Method void ActionBarContextView$1(ActionBarContextView, ActionMode)>
    //   25   53:invokevirtual   #226 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //   26   56:aload_1         
    //   27   57:invokevirtual   #232 <Method android.view.Menu ActionMode.getMenu()>
    //   28   60:checkcast       #234 <Class MenuBuilder>
    //   29   63:astore_2        
    //   30   64:aload_0         
    //   31   65:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   32   68:ifnull          79
    //   33   71:aload_0         
    //   34   72:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   35   75:invokevirtual   #236 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
    //   36   78:pop             
    //   37   79:aload_0         
    //   38   80:new             #201 <Class ActionMenuPresenter>
    //   39   83:dup             
    //   40   84:aload_0         
    //   41   85:invokevirtual   #89  <Method Context getContext()>
    //   42   88:invokespecial   #238 <Method void ActionMenuPresenter(Context)>
    //   43   91:putfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   44   94:aload_0         
    //   45   95:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   46   98:iconst_1        
    //   47   99:invokevirtual   #242 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
    //   48  102:new             #244 <Class android.view.ViewGroup$LayoutParams>
    //   49  105:dup             
    //   50  106:bipush          -2
    //   51  108:iconst_m1       
    //   52  109:invokespecial   #245 <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   53  112:astore_3        
    //   54  113:aload_0         
    //   55  114:getfield        #248 <Field boolean mSplitActionBar>
    //   56  117:ifne            182
    //   57  120:aload_2         
    //   58  121:aload_0         
    //   59  122:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   60  125:invokevirtual   #252 <Method void MenuBuilder.addMenuPresenter(android.support.v7.internal.view.menu.MenuPresenter)>
    //   61  128:aload_0         
    //   62  129:aload_0         
    //   63  130:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   64  133:aload_0         
    //   65  134:invokevirtual   #256 <Method android.support.v7.internal.view.menu.MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //   66  137:checkcast       #258 <Class ActionMenuView>
    //   67  140:putfield        #262 <Field ActionMenuView mMenuView>
    //   68  143:aload_0         
    //   69  144:getfield        #262 <Field ActionMenuView mMenuView>
    //   70  147:aconst_null     
    //   71  148:invokevirtual   #263 <Method void ActionMenuView.setBackgroundDrawable(Drawable)>
    //   72  151:aload_0         
    //   73  152:aload_0         
    //   74  153:getfield        #262 <Field ActionMenuView mMenuView>
    //   75  156:aload_3         
    //   76  157:invokevirtual   #266 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   77  160:return          
    //   78  161:aload_0         
    //   79  162:getfield        #168 <Field View mClose>
    //   80  165:invokevirtual   #267 <Method android.view.ViewParent View.getParent()>
    //   81  168:ifnonnull       34
    //   82  171:aload_0         
    //   83  172:aload_0         
    //   84  173:getfield        #168 <Field View mClose>
    //   85  176:invokevirtual   #162 <Method void addView(View)>
    //   86  179:goto            34
    //   87  182:aload_0         
    //   88  183:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   89  186:aload_0         
    //   90  187:invokevirtual   #89  <Method Context getContext()>
    //   91  190:invokevirtual   #271 <Method Resources Context.getResources()>
    //   92  193:invokevirtual   #277 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   93  196:getfield        #282 <Field int DisplayMetrics.widthPixels>
    //   94  199:iconst_1        
    //   95  200:invokevirtual   #286 <Method void ActionMenuPresenter.setWidthLimit(int, boolean)>
    //   96  203:aload_0         
    //   97  204:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   98  207:ldc2            #287 <Int 0x7fffffff>
    //   99  210:invokevirtual   #290 <Method void ActionMenuPresenter.setItemLimit(int)>
    //  100  213:aload_3         
    //  101  214:iconst_m1       
    //  102  215:putfield        #293 <Field int android.view.ViewGroup$LayoutParams.width>
    //  103  218:aload_3         
    //  104  219:aload_0         
    //  105  220:getfield        #76  <Field int mContentHeight>
    //  106  223:putfield        #296 <Field int android.view.ViewGroup$LayoutParams.height>
    //  107  226:aload_2         
    //  108  227:aload_0         
    //  109  228:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //  110  231:invokevirtual   #252 <Method void MenuBuilder.addMenuPresenter(android.support.v7.internal.view.menu.MenuPresenter)>
    //  111  234:aload_0         
    //  112  235:aload_0         
    //  113  236:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //  114  239:aload_0         
    //  115  240:invokevirtual   #256 <Method android.support.v7.internal.view.menu.MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //  116  243:checkcast       #258 <Class ActionMenuView>
    //  117  246:putfield        #262 <Field ActionMenuView mMenuView>
    //  118  249:aload_0         
    //  119  250:getfield        #262 <Field ActionMenuView mMenuView>
    //  120  253:aload_0         
    //  121  254:getfield        #78  <Field Drawable mSplitBackground>
    //  122  257:invokevirtual   #263 <Method void ActionMenuView.setBackgroundDrawable(Drawable)>
    //  123  260:aload_0         
    //  124  261:getfield        #300 <Field ActionBarContainer mSplitView>
    //  125  264:aload_0         
    //  126  265:getfield        #262 <Field ActionMenuView mMenuView>
    //  127  268:aload_3         
    //  128  269:invokevirtual   #303 <Method void ActionBarContainer.addView(View, android.view.ViewGroup$LayoutParams)>
    //  129  272:return          
    }

    public boolean isOverflowMenuShowing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #306 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public volatile boolean isOverflowReserved()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #309 <Method boolean AbsActionBarView.isOverflowReserved()>
    //    2    4:ireturn         
    }

    public boolean isTitleOptional()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #312 <Field boolean mTitleOptional>
    //    2    4:ireturn         
    }

    public void killMode()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #315 <Method void removeAllViews()>
    //    2    4:aload_0         
    //    3    5:getfield        #300 <Field ActionBarContainer mSplitView>
    //    4    8:ifnull          22
    //    5   11:aload_0         
    //    6   12:getfield        #300 <Field ActionBarContainer mSplitView>
    //    7   15:aload_0         
    //    8   16:getfield        #262 <Field ActionMenuView mMenuView>
    //    9   19:invokevirtual   #318 <Method void ActionBarContainer.removeView(View)>
    //   10   22:aload_0         
    //   11   23:aconst_null     
    //   12   24:putfield        #320 <Field View mCustomView>
    //   13   27:aload_0         
    //   14   28:aconst_null     
    //   15   29:putfield        #262 <Field ActionMenuView mMenuView>
    //   16   32:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #323 <Method void AbsActionBarView.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    4    8:ifnull          27
    //    5   11:aload_0         
    //    6   12:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    7   15:invokevirtual   #203 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
    //    8   18:pop             
    //    9   19:aload_0         
    //   10   20:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   11   23:invokevirtual   #326 <Method boolean ActionMenuPresenter.hideSubMenus()>
    //   12   26:pop             
    //   13   27:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #331 <Method int getPaddingLeft()>
    //    2    4:istore          6
    //    3    6:aload_0         
    //    4    7:invokevirtual   #334 <Method int getPaddingTop()>
    //    5   10:istore          7
    //    6   12:iload           5
    //    7   14:iload_3         
    //    8   15:isub            
    //    9   16:aload_0         
    //   10   17:invokevirtual   #334 <Method int getPaddingTop()>
    //   11   20:isub            
    //   12   21:aload_0         
    //   13   22:invokevirtual   #337 <Method int getPaddingBottom()>
    //   14   25:isub            
    //   15   26:istore          8
    //   16   28:aload_0         
    //   17   29:getfield        #168 <Field View mClose>
    //   18   32:ifnull          94
    //   19   35:aload_0         
    //   20   36:getfield        #168 <Field View mClose>
    //   21   39:invokevirtual   #340 <Method int View.getVisibility()>
    //   22   42:bipush          8
    //   23   44:icmpeq          94
    //   24   47:aload_0         
    //   25   48:getfield        #168 <Field View mClose>
    //   26   51:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   27   54:checkcast       #178 <Class android.view.ViewGroup$MarginLayoutParams>
    //   28   57:astore          12
    //   29   59:iload           6
    //   30   61:aload           12
    //   31   63:getfield        #346 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
    //   32   66:iadd            
    //   33   67:istore          13
    //   34   69:iload           13
    //   35   71:aload_0         
    //   36   72:aload_0         
    //   37   73:getfield        #168 <Field View mClose>
    //   38   76:iload           13
    //   39   78:iload           7
    //   40   80:iload           8
    //   41   82:invokevirtual   #350 <Method int positionChild(View, int, int, int)>
    //   42   85:iadd            
    //   43   86:aload           12
    //   44   88:getfield        #353 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
    //   45   91:iadd            
    //   46   92:istore          6
    //   47   94:aload_0         
    //   48   95:getfield        #85  <Field LinearLayout mTitleLayout>
    //   49   98:ifnull          139
    //   50  101:aload_0         
    //   51  102:getfield        #320 <Field View mCustomView>
    //   52  105:ifnonnull       139
    //   53  108:aload_0         
    //   54  109:getfield        #85  <Field LinearLayout mTitleLayout>
    //   55  112:invokevirtual   #354 <Method int LinearLayout.getVisibility()>
    //   56  115:bipush          8
    //   57  117:icmpeq          139
    //   58  120:iload           6
    //   59  122:aload_0         
    //   60  123:aload_0         
    //   61  124:getfield        #85  <Field LinearLayout mTitleLayout>
    //   62  127:iload           6
    //   63  129:iload           7
    //   64  131:iload           8
    //   65  133:invokevirtual   #350 <Method int positionChild(View, int, int, int)>
    //   66  136:iadd            
    //   67  137:istore          6
    //   68  139:aload_0         
    //   69  140:getfield        #320 <Field View mCustomView>
    //   70  143:ifnull          164
    //   71  146:iload           6
    //   72  148:aload_0         
    //   73  149:aload_0         
    //   74  150:getfield        #320 <Field View mCustomView>
    //   75  153:iload           6
    //   76  155:iload           7
    //   77  157:iload           8
    //   78  159:invokevirtual   #350 <Method int positionChild(View, int, int, int)>
    //   79  162:iadd            
    //   80  163:pop             
    //   81  164:iload           4
    //   82  166:iload_2         
    //   83  167:isub            
    //   84  168:aload_0         
    //   85  169:invokevirtual   #357 <Method int getPaddingRight()>
    //   86  172:isub            
    //   87  173:istore          9
    //   88  175:aload_0         
    //   89  176:getfield        #262 <Field ActionMenuView mMenuView>
    //   90  179:ifnull          200
    //   91  182:iload           9
    //   92  184:aload_0         
    //   93  185:aload_0         
    //   94  186:getfield        #262 <Field ActionMenuView mMenuView>
    //   95  189:iload           9
    //   96  191:iload           7
    //   97  193:iload           8
    //   98  195:invokevirtual   #360 <Method int positionChildInverse(View, int, int, int)>
    //   99  198:isub            
    //  100  199:pop             
    //  101  200:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #367 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:ldc2            #368 <Int 0x40000000>
    //    3    7:icmpeq          50
    //    4   10:new             #370 <Class IllegalStateException>
    //    5   13:dup             
    //    6   14:new             #372 <Class StringBuilder>
    //    7   17:dup             
    //    8   18:invokespecial   #374 <Method void StringBuilder()>
    //    9   21:aload_0         
    //   10   22:invokevirtual   #380 <Method Class Object.getClass()>
    //   11   25:invokevirtual   #386 <Method String Class.getSimpleName()>
    //   12   28:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   13   31:ldc2            #392 <String " can only be used ">
    //   14   34:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   15   37:ldc2            #394 <String "with android:layout_width=\"FILL_PARENT\" (or fill_parent)">
    //   16   40:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   17   43:invokevirtual   #397 <Method String StringBuilder.toString()>
    //   18   46:invokespecial   #400 <Method void IllegalStateException(String)>
    //   19   49:athrow          
    //   20   50:iload_2         
    //   21   51:invokestatic    #367 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   22   54:ifne            97
    //   23   57:new             #370 <Class IllegalStateException>
    //   24   60:dup             
    //   25   61:new             #372 <Class StringBuilder>
    //   26   64:dup             
    //   27   65:invokespecial   #374 <Method void StringBuilder()>
    //   28   68:aload_0         
    //   29   69:invokevirtual   #380 <Method Class Object.getClass()>
    //   30   72:invokevirtual   #386 <Method String Class.getSimpleName()>
    //   31   75:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   32   78:ldc2            #392 <String " can only be used ">
    //   33   81:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   34   84:ldc2            #402 <String "with android:layout_height=\"wrap_content\"">
    //   35   87:invokevirtual   #390 <Method StringBuilder StringBuilder.append(String)>
    //   36   90:invokevirtual   #397 <Method String StringBuilder.toString()>
    //   37   93:invokespecial   #400 <Method void IllegalStateException(String)>
    //   38   96:athrow          
    //   39   97:iload_1         
    //   40   98:invokestatic    #405 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   41  101:istore_3        
    //   42  102:aload_0         
    //   43  103:getfield        #76  <Field int mContentHeight>
    //   44  106:ifle            494
    //   45  109:aload_0         
    //   46  110:getfield        #76  <Field int mContentHeight>
    //   47  113:istore          4
    //   48  115:aload_0         
    //   49  116:invokevirtual   #334 <Method int getPaddingTop()>
    //   50  119:aload_0         
    //   51  120:invokevirtual   #337 <Method int getPaddingBottom()>
    //   52  123:iadd            
    //   53  124:istore          5
    //   54  126:iload_3         
    //   55  127:aload_0         
    //   56  128:invokevirtual   #331 <Method int getPaddingLeft()>
    //   57  131:isub            
    //   58  132:aload_0         
    //   59  133:invokevirtual   #357 <Method int getPaddingRight()>
    //   60  136:isub            
    //   61  137:istore          6
    //   62  139:iload           4
    //   63  141:iload           5
    //   64  143:isub            
    //   65  144:istore          7
    //   66  146:iload           7
    //   67  148:ldc2            #406 <Int 0x80000000>
    //   68  151:invokestatic    #409 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   69  154:istore          8
    //   70  156:aload_0         
    //   71  157:getfield        #168 <Field View mClose>
    //   72  160:ifnull          206
    //   73  163:aload_0         
    //   74  164:aload_0         
    //   75  165:getfield        #168 <Field View mClose>
    //   76  168:iload           6
    //   77  170:iload           8
    //   78  172:iconst_0        
    //   79  173:invokevirtual   #412 <Method int measureChildView(View, int, int, int)>
    //   80  176:istore          23
    //   81  178:aload_0         
    //   82  179:getfield        #168 <Field View mClose>
    //   83  182:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   84  185:checkcast       #178 <Class android.view.ViewGroup$MarginLayoutParams>
    //   85  188:astore          24
    //   86  190:iload           23
    //   87  192:aload           24
    //   88  194:getfield        #346 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
    //   89  197:aload           24
    //   90  199:getfield        #353 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
    //   91  202:iadd            
    //   92  203:isub            
    //   93  204:istore          6
    //   94  206:aload_0         
    //   95  207:getfield        #262 <Field ActionMenuView mMenuView>
    //   96  210:ifnull          239
    //   97  213:aload_0         
    //   98  214:getfield        #262 <Field ActionMenuView mMenuView>
    //   99  217:invokevirtual   #413 <Method android.view.ViewParent ActionMenuView.getParent()>
    //  100  220:aload_0         
    //  101  221:if_acmpne       239
    //  102  224:aload_0         
    //  103  225:aload_0         
    //  104  226:getfield        #262 <Field ActionMenuView mMenuView>
    //  105  229:iload           6
    //  106  231:iload           8
    //  107  233:iconst_0        
    //  108  234:invokevirtual   #412 <Method int measureChildView(View, int, int, int)>
    //  109  237:istore          6
    //  110  239:aload_0         
    //  111  240:getfield        #85  <Field LinearLayout mTitleLayout>
    //  112  243:ifnull          330
    //  113  246:aload_0         
    //  114  247:getfield        #320 <Field View mCustomView>
    //  115  250:ifnonnull       330
    //  116  253:aload_0         
    //  117  254:getfield        #312 <Field boolean mTitleOptional>
    //  118  257:ifeq            516
    //  119  260:iconst_0        
    //  120  261:iconst_0        
    //  121  262:invokestatic    #409 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  122  265:istore          18
    //  123  267:aload_0         
    //  124  268:getfield        #85  <Field LinearLayout mTitleLayout>
    //  125  271:iload           18
    //  126  273:iload           8
    //  127  275:invokevirtual   #416 <Method void LinearLayout.measure(int, int)>
    //  128  278:aload_0         
    //  129  279:getfield        #85  <Field LinearLayout mTitleLayout>
    //  130  282:invokevirtual   #419 <Method int LinearLayout.getMeasuredWidth()>
    //  131  285:istore          19
    //  132  287:iload           19
    //  133  289:iload           6
    //  134  291:icmpgt          503
    //  135  294:iconst_1        
    //  136  295:istore          20
    //  137  297:iload           20
    //  138  299:ifeq            309
    //  139  302:iload           6
    //  140  304:iload           19
    //  141  306:isub            
    //  142  307:istore          6
    //  143  309:aload_0         
    //  144  310:getfield        #85  <Field LinearLayout mTitleLayout>
    //  145  313:astore          21
    //  146  315:iload           20
    //  147  317:ifeq            509
    //  148  320:iconst_0        
    //  149  321:istore          22
    //  150  323:aload           21
    //  151  325:iload           22
    //  152  327:invokevirtual   #154 <Method void LinearLayout.setVisibility(int)>
    //  153  330:aload_0         
    //  154  331:getfield        #320 <Field View mCustomView>
    //  155  334:ifnull          437
    //  156  337:aload_0         
    //  157  338:getfield        #320 <Field View mCustomView>
    //  158  341:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  159  344:astore          13
    //  160  346:aload           13
    //  161  348:getfield        #293 <Field int android.view.ViewGroup$LayoutParams.width>
    //  162  351:bipush          -2
    //  163  353:icmpeq          534
    //  164  356:ldc2            #368 <Int 0x40000000>
    //  165  359:istore          14
    //  166  361:aload           13
    //  167  363:getfield        #293 <Field int android.view.ViewGroup$LayoutParams.width>
    //  168  366:iflt            542
    //  169  369:aload           13
    //  170  371:getfield        #293 <Field int android.view.ViewGroup$LayoutParams.width>
    //  171  374:iload           6
    //  172  376:invokestatic    #424 <Method int Math.min(int, int)>
    //  173  379:istore          15
    //  174  381:aload           13
    //  175  383:getfield        #296 <Field int android.view.ViewGroup$LayoutParams.height>
    //  176  386:bipush          -2
    //  177  388:icmpeq          549
    //  178  391:ldc2            #368 <Int 0x40000000>
    //  179  394:istore          16
    //  180  396:aload           13
    //  181  398:getfield        #296 <Field int android.view.ViewGroup$LayoutParams.height>
    //  182  401:iflt            557
    //  183  404:aload           13
    //  184  406:getfield        #296 <Field int android.view.ViewGroup$LayoutParams.height>
    //  185  409:iload           7
    //  186  411:invokestatic    #424 <Method int Math.min(int, int)>
    //  187  414:istore          17
    //  188  416:aload_0         
    //  189  417:getfield        #320 <Field View mCustomView>
    //  190  420:iload           15
    //  191  422:iload           14
    //  192  424:invokestatic    #409 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  193  427:iload           17
    //  194  429:iload           16
    //  195  431:invokestatic    #409 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  196  434:invokevirtual   #425 <Method void View.measure(int, int)>
    //  197  437:aload_0         
    //  198  438:getfield        #76  <Field int mContentHeight>
    //  199  441:ifgt            572
    //  200  444:iconst_0        
    //  201  445:istore          9
    //  202  447:aload_0         
    //  203  448:invokevirtual   #108 <Method int getChildCount()>
    //  204  451:istore          10
    //  205  453:iconst_0        
    //  206  454:istore          11
    //  207  456:iload           11
    //  208  458:iload           10
    //  209  460:icmpge          564
    //  210  463:iload           5
    //  211  465:aload_0         
    //  212  466:iload           11
    //  213  468:invokevirtual   #112 <Method View getChildAt(int)>
    //  214  471:invokevirtual   #428 <Method int View.getMeasuredHeight()>
    //  215  474:iadd            
    //  216  475:istore          12
    //  217  477:iload           12
    //  218  479:iload           9
    //  219  481:icmple          488
    //  220  484:iload           12
    //  221  486:istore          9
    //  222  488:iinc            11  1
    //  223  491:goto            456
    //  224  494:iload_2         
    //  225  495:invokestatic    #405 <Method int android.view.View$MeasureSpec.getSize(int)>
    //  226  498:istore          4
    //  227  500:goto            115
    //  228  503:iconst_0        
    //  229  504:istore          20
    //  230  506:goto            297
    //  231  509:bipush          8
    //  232  511:istore          22
    //  233  513:goto            323
    //  234  516:aload_0         
    //  235  517:aload_0         
    //  236  518:getfield        #85  <Field LinearLayout mTitleLayout>
    //  237  521:iload           6
    //  238  523:iload           8
    //  239  525:iconst_0        
    //  240  526:invokevirtual   #412 <Method int measureChildView(View, int, int, int)>
    //  241  529:istore          6
    //  242  531:goto            330
    //  243  534:ldc2            #406 <Int 0x80000000>
    //  244  537:istore          14
    //  245  539:goto            361
    //  246  542:iload           6
    //  247  544:istore          15
    //  248  546:goto            381
    //  249  549:ldc2            #406 <Int 0x80000000>
    //  250  552:istore          16
    //  251  554:goto            396
    //  252  557:iload           7
    //  253  559:istore          17
    //  254  561:goto            416
    //  255  564:aload_0         
    //  256  565:iload_3         
    //  257  566:iload           9
    //  258  568:invokevirtual   #431 <Method void setMeasuredDimension(int, int)>
    //  259  571:return          
    //  260  572:aload_0         
    //  261  573:iload_3         
    //  262  574:iload           4
    //  263  576:invokevirtual   #431 <Method void setMeasuredDimension(int, int)>
    //  264  579:return          
    }

    public volatile void postShowOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #434 <Method void AbsActionBarView.postShowOverflowMenu()>
    //    2    4:return          
    }

    public void setContentHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #76  <Field int mContentHeight>
    //    3    5:return          
    }

    public void setCustomView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #320 <Field View mCustomView>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #320 <Field View mCustomView>
    //    6   12:invokevirtual   #437 <Method void removeView(View)>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #320 <Field View mCustomView>
    //   10   20:aload_0         
    //   11   21:getfield        #85  <Field LinearLayout mTitleLayout>
    //   12   24:ifnull          40
    //   13   27:aload_0         
    //   14   28:aload_0         
    //   15   29:getfield        #85  <Field LinearLayout mTitleLayout>
    //   16   32:invokevirtual   #437 <Method void removeView(View)>
    //   17   35:aload_0         
    //   18   36:aconst_null     
    //   19   37:putfield        #85  <Field LinearLayout mTitleLayout>
    //   20   40:aload_1         
    //   21   41:ifnull          49
    //   22   44:aload_0         
    //   23   45:aload_1         
    //   24   46:invokevirtual   #162 <Method void addView(View)>
    //   25   49:aload_0         
    //   26   50:invokevirtual   #440 <Method void requestLayout()>
    //   27   53:return          
    }

    public void setSplitActionBar(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #248 <Field boolean mSplitActionBar>
    //    2    4:iload_1         
    //    3    5:icmpeq          93
    //    4    8:aload_0         
    //    5    9:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    6   12:ifnull          88
    //    7   15:new             #244 <Class android.view.ViewGroup$LayoutParams>
    //    8   18:dup             
    //    9   19:bipush          -2
    //   10   21:iconst_m1       
    //   11   22:invokespecial   #245 <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   12   25:astore_2        
    //   13   26:iload_1         
    //   14   27:ifne            94
    //   15   30:aload_0         
    //   16   31:aload_0         
    //   17   32:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   18   35:aload_0         
    //   19   36:invokevirtual   #256 <Method android.support.v7.internal.view.menu.MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //   20   39:checkcast       #258 <Class ActionMenuView>
    //   21   42:putfield        #262 <Field ActionMenuView mMenuView>
    //   22   45:aload_0         
    //   23   46:getfield        #262 <Field ActionMenuView mMenuView>
    //   24   49:aconst_null     
    //   25   50:invokevirtual   #263 <Method void ActionMenuView.setBackgroundDrawable(Drawable)>
    //   26   53:aload_0         
    //   27   54:getfield        #262 <Field ActionMenuView mMenuView>
    //   28   57:invokevirtual   #413 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   29   60:checkcast       #443 <Class ViewGroup>
    //   30   63:astore          4
    //   31   65:aload           4
    //   32   67:ifnull          79
    //   33   70:aload           4
    //   34   72:aload_0         
    //   35   73:getfield        #262 <Field ActionMenuView mMenuView>
    //   36   76:invokevirtual   #444 <Method void ViewGroup.removeView(View)>
    //   37   79:aload_0         
    //   38   80:aload_0         
    //   39   81:getfield        #262 <Field ActionMenuView mMenuView>
    //   40   84:aload_2         
    //   41   85:invokevirtual   #266 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
    //   42   88:aload_0         
    //   43   89:iload_1         
    //   44   90:invokespecial   #446 <Method void AbsActionBarView.setSplitActionBar(boolean)>
    //   45   93:return          
    //   46   94:aload_0         
    //   47   95:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   48   98:aload_0         
    //   49   99:invokevirtual   #89  <Method Context getContext()>
    //   50  102:invokevirtual   #271 <Method Resources Context.getResources()>
    //   51  105:invokevirtual   #277 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   52  108:getfield        #282 <Field int DisplayMetrics.widthPixels>
    //   53  111:iconst_1        
    //   54  112:invokevirtual   #286 <Method void ActionMenuPresenter.setWidthLimit(int, boolean)>
    //   55  115:aload_0         
    //   56  116:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   57  119:ldc2            #287 <Int 0x7fffffff>
    //   58  122:invokevirtual   #290 <Method void ActionMenuPresenter.setItemLimit(int)>
    //   59  125:aload_2         
    //   60  126:iconst_m1       
    //   61  127:putfield        #293 <Field int android.view.ViewGroup$LayoutParams.width>
    //   62  130:aload_2         
    //   63  131:aload_0         
    //   64  132:getfield        #76  <Field int mContentHeight>
    //   65  135:putfield        #296 <Field int android.view.ViewGroup$LayoutParams.height>
    //   66  138:aload_0         
    //   67  139:aload_0         
    //   68  140:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //   69  143:aload_0         
    //   70  144:invokevirtual   #256 <Method android.support.v7.internal.view.menu.MenuView ActionMenuPresenter.getMenuView(ViewGroup)>
    //   71  147:checkcast       #258 <Class ActionMenuView>
    //   72  150:putfield        #262 <Field ActionMenuView mMenuView>
    //   73  153:aload_0         
    //   74  154:getfield        #262 <Field ActionMenuView mMenuView>
    //   75  157:aload_0         
    //   76  158:getfield        #78  <Field Drawable mSplitBackground>
    //   77  161:invokevirtual   #263 <Method void ActionMenuView.setBackgroundDrawable(Drawable)>
    //   78  164:aload_0         
    //   79  165:getfield        #262 <Field ActionMenuView mMenuView>
    //   80  168:invokevirtual   #413 <Method android.view.ViewParent ActionMenuView.getParent()>
    //   81  171:checkcast       #443 <Class ViewGroup>
    //   82  174:astore_3        
    //   83  175:aload_3         
    //   84  176:ifnull          187
    //   85  179:aload_3         
    //   86  180:aload_0         
    //   87  181:getfield        #262 <Field ActionMenuView mMenuView>
    //   88  184:invokevirtual   #444 <Method void ViewGroup.removeView(View)>
    //   89  187:aload_0         
    //   90  188:getfield        #300 <Field ActionBarContainer mSplitView>
    //   91  191:aload_0         
    //   92  192:getfield        #262 <Field ActionMenuView mMenuView>
    //   93  195:aload_2         
    //   94  196:invokevirtual   #303 <Method void ActionBarContainer.addView(View, android.view.ViewGroup$LayoutParams)>
    //   95  199:goto            88
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #450 <Method void AbsActionBarView.setSplitView(ActionBarContainer)>
    //    3    5:return          
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #453 <Method void AbsActionBarView.setSplitWhenNarrow(boolean)>
    //    3    5:return          
    }

    public void setSubtitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #143 <Field CharSequence mSubtitle>
    //    3    5:aload_0         
    //    4    6:invokespecial   #456 <Method void initTitle()>
    //    5    9:return          
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #137 <Field CharSequence mTitle>
    //    3    5:aload_0         
    //    4    6:invokespecial   #456 <Method void initTitle()>
    //    5    9:return          
    }

    public void setTitleOptional(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #312 <Field boolean mTitleOptional>
    //    3    5:icmpeq          12
    //    4    8:aload_0         
    //    5    9:invokevirtual   #440 <Method void requestLayout()>
    //    6   12:aload_0         
    //    7   13:iload_1         
    //    8   14:putfield        #312 <Field boolean mTitleOptional>
    //    9   17:return          
    }

    public volatile void setVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #459 <Method void AbsActionBarView.setVisibility(int)>
    //    3    5:return          
    }

    public boolean showOverflowMenu()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #199 <Field ActionMenuPresenter mActionMenuPresenter>
    //    5   11:invokevirtual   #462 <Method boolean ActionMenuPresenter.showOverflowMenu()>
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    private static final String TAG = "ActionBarContextView";
    private View mClose;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    // Unreferenced inner class android/support/v7/internal/widget/ActionBarContextView$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field ActionBarContextView this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ActionMode val$mode>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field ActionMode val$mode>
        //    2    4:invokevirtual   #31  <Method void ActionMode.finish()>
        //    3    7:return          
        }

        final ActionBarContextView this$0;
        final ActionMode val$mode;
    }

}
