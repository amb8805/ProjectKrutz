// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.CompatTextView;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import java.util.Locale;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl

public class ActionMenuItemView extends CompatTextView
    implements MenuView.ItemView, android.view.View.OnClickListener, android.view.View.OnLongClickListener, ActionMenuView.ActionMenuChildView
{
    private class AllCapsTransformationMethod
        implements TransformationMethod
    {

        public AllCapsTransformationMethod()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ActionMenuItemView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_1         
        //    7   11:invokevirtual   #23  <Method Context ActionMenuItemView.getContext()>
        //    8   14:invokevirtual   #29  <Method Resources Context.getResources()>
        //    9   17:invokevirtual   #35  <Method Configuration Resources.getConfiguration()>
        //   10   20:getfield        #40  <Field Locale Configuration.locale>
        //   11   23:putfield        #42  <Field Locale mLocale>
        //   12   26:return          
        }

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
        //    0    0:aload_1         
        //    1    1:ifnull          16
        //    2    4:aload_1         
        //    3    5:invokevirtual   #48  <Method String Object.toString()>
        //    4    8:aload_0         
        //    5    9:getfield        #42  <Field Locale mLocale>
        //    6   12:invokevirtual   #54  <Method String String.toUpperCase(Locale)>
        //    7   15:areturn         
        //    8   16:aconst_null     
        //    9   17:areturn         
        }

        public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
        {
        //    0    0:return          
        }

        private Locale mLocale;
        final ActionMenuItemView this$0;
    }


    public ActionMenuItemView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #35  <Method void ActionMenuItemView(Context, AttributeSet)>
    //    4    6:return          
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #38  <Method void ActionMenuItemView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #39  <Method void CompatTextView(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:aload_1         
    //    7    9:invokevirtual   #45  <Method Resources Context.getResources()>
    //    8   12:getstatic       #50  <Field int android.support.v7.appcompat.R$bool.abc_config_allowActionMenuItemTextWithIcon>
    //    9   15:invokevirtual   #56  <Method boolean Resources.getBoolean(int)>
    //   10   18:putfield        #58  <Field boolean mAllowTextWithIcon>
    //   11   21:aload_1         
    //   12   22:aload_2         
    //   13   23:getstatic       #63  <Field int[] android.support.v7.appcompat.R$styleable.ActionMenuItemView>
    //   14   26:iconst_0        
    //   15   27:iconst_0        
    //   16   28:invokevirtual   #67  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   17   31:astore          4
    //   18   33:aload_0         
    //   19   34:aload           4
    //   20   36:iconst_0        
    //   21   37:iconst_0        
    //   22   38:invokevirtual   #73  <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   23   41:putfield        #75  <Field int mMinWidth>
    //   24   44:aload           4
    //   25   46:invokevirtual   #79  <Method void TypedArray.recycle()>
    //   26   49:aload_0         
    //   27   50:aload_0         
    //   28   51:invokevirtual   #83  <Method void setOnClickListener(android.view.View$OnClickListener)>
    //   29   54:aload_0         
    //   30   55:aload_0         
    //   31   56:invokevirtual   #87  <Method void setOnLongClickListener(android.view.View$OnLongClickListener)>
    //   32   59:aload_0         
    //   33   60:new             #89  <Class ActionMenuItemView$AllCapsTransformationMethod>
    //   34   63:dup             
    //   35   64:aload_0         
    //   36   65:invokespecial   #92  <Method void ActionMenuItemView$AllCapsTransformationMethod(ActionMenuItemView)>
    //   37   68:invokevirtual   #96  <Method void setTransformationMethod(TransformationMethod)>
    //   38   71:aload_0         
    //   39   72:iconst_m1       
    //   40   73:putfield        #98  <Field int mSavedPaddingLeft>
    //   41   76:return          
    }

    private void updateTextButtonVisibility()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field CharSequence mTitle>
    //    2    4:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    3    7:ifne            74
    //    4   10:iconst_1        
    //    5   11:istore_1        
    //    6   12:aload_0         
    //    7   13:getfield        #109 <Field Drawable mIcon>
    //    8   16:ifnull          55
    //    9   19:aload_0         
    //   10   20:getfield        #111 <Field MenuItemImpl mItemData>
    //   11   23:invokevirtual   #117 <Method boolean MenuItemImpl.showsTextAsAction()>
    //   12   26:istore          4
    //   13   28:iconst_0        
    //   14   29:istore_2        
    //   15   30:iload           4
    //   16   32:ifeq            57
    //   17   35:aload_0         
    //   18   36:getfield        #58  <Field boolean mAllowTextWithIcon>
    //   19   39:ifne            55
    //   20   42:aload_0         
    //   21   43:getfield        #119 <Field boolean mExpandedFormat>
    //   22   46:istore          5
    //   23   48:iconst_0        
    //   24   49:istore_2        
    //   25   50:iload           5
    //   26   52:ifeq            57
    //   27   55:iconst_1        
    //   28   56:istore_2        
    //   29   57:iload_1         
    //   30   58:iload_2         
    //   31   59:iand            
    //   32   60:ifeq            79
    //   33   63:aload_0         
    //   34   64:getfield        #101 <Field CharSequence mTitle>
    //   35   67:astore_3        
    //   36   68:aload_0         
    //   37   69:aload_3         
    //   38   70:invokevirtual   #123 <Method void setText(CharSequence)>
    //   39   73:return          
    //   40   74:iconst_0        
    //   41   75:istore_1        
    //   42   76:goto            12
    //   43   79:aconst_null     
    //   44   80:astore_3        
    //   45   81:goto            68
    }

    public MenuItemImpl getItemData()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #111 <Field MenuItemImpl mItemData>
    //    2    4:areturn         
    }

    public boolean hasText()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #130 <Method CharSequence getText()>
    //    2    4:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    3    7:ifne            12
    //    4   10:iconst_1        
    //    5   11:ireturn         
    //    6   12:iconst_0        
    //    7   13:ireturn         
    }

    public void initialize(MenuItemImpl menuitemimpl, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #111 <Field MenuItemImpl mItemData>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
    //    6   10:invokevirtual   #140 <Method void setIcon(Drawable)>
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:aload_0         
    //   10   16:invokevirtual   #144 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
    //   11   19:invokevirtual   #147 <Method void setTitle(CharSequence)>
    //   12   22:aload_0         
    //   13   23:aload_1         
    //   14   24:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
    //   15   27:invokevirtual   #155 <Method void setId(int)>
    //   16   30:aload_1         
    //   17   31:invokevirtual   #158 <Method boolean MenuItemImpl.isVisible()>
    //   18   34:ifeq            53
    //   19   37:iconst_0        
    //   20   38:istore_3        
    //   21   39:aload_0         
    //   22   40:iload_3         
    //   23   41:invokevirtual   #161 <Method void setVisibility(int)>
    //   24   44:aload_0         
    //   25   45:aload_1         
    //   26   46:invokevirtual   #164 <Method boolean MenuItemImpl.isEnabled()>
    //   27   49:invokevirtual   #168 <Method void setEnabled(boolean)>
    //   28   52:return          
    //   29   53:bipush          8
    //   30   55:istore_3        
    //   31   56:goto            39
    }

    public boolean needsDividerAfter()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #171 <Method boolean hasText()>
    //    2    4:ireturn         
    }

    public boolean needsDividerBefore()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #171 <Method boolean hasText()>
    //    2    4:ifeq            19
    //    3    7:aload_0         
    //    4    8:getfield        #111 <Field MenuItemImpl mItemData>
    //    5   11:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
    //    6   14:ifnonnull       19
    //    7   17:iconst_1        
    //    8   18:ireturn         
    //    9   19:iconst_0        
    //   10   20:ireturn         
    }

    public void onClick(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #176 <Field MenuBuilder$ItemInvoker mItemInvoker>
    //    2    4:ifnull          21
    //    3    7:aload_0         
    //    4    8:getfield        #176 <Field MenuBuilder$ItemInvoker mItemInvoker>
    //    5   11:aload_0         
    //    6   12:getfield        #111 <Field MenuItemImpl mItemData>
    //    7   15:invokeinterface #182 <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
    //    8   20:pop             
    //    9   21:return          
    }

    public boolean onLongClick(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #171 <Method boolean hasText()>
    //    2    4:ifeq            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:iconst_2        
    //    6   10:newarray        int[]
    //    7   12:astore_2        
    //    8   13:new             #186 <Class Rect>
    //    9   16:dup             
    //   10   17:invokespecial   #188 <Method void Rect()>
    //   11   20:astore_3        
    //   12   21:aload_0         
    //   13   22:aload_2         
    //   14   23:invokevirtual   #192 <Method void getLocationOnScreen(int[])>
    //   15   26:aload_0         
    //   16   27:aload_3         
    //   17   28:invokevirtual   #196 <Method void getWindowVisibleDisplayFrame(Rect)>
    //   18   31:aload_0         
    //   19   32:invokevirtual   #200 <Method Context getContext()>
    //   20   35:astore          4
    //   21   37:aload_0         
    //   22   38:invokevirtual   #203 <Method int getWidth()>
    //   23   41:istore          5
    //   24   43:aload_0         
    //   25   44:invokevirtual   #206 <Method int getHeight()>
    //   26   47:istore          6
    //   27   49:aload_2         
    //   28   50:iconst_1        
    //   29   51:iaload          
    //   30   52:iload           6
    //   31   54:iconst_2        
    //   32   55:idiv            
    //   33   56:iadd            
    //   34   57:istore          7
    //   35   59:aload           4
    //   36   61:invokevirtual   #45  <Method Resources Context.getResources()>
    //   37   64:invokevirtual   #210 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   38   67:getfield        #215 <Field int DisplayMetrics.widthPixels>
    //   39   70:istore          8
    //   40   72:aload           4
    //   41   74:aload_0         
    //   42   75:getfield        #111 <Field MenuItemImpl mItemData>
    //   43   78:invokevirtual   #218 <Method CharSequence MenuItemImpl.getTitle()>
    //   44   81:iconst_0        
    //   45   82:invokestatic    #224 <Method Toast Toast.makeText(Context, CharSequence, int)>
    //   46   85:astore          9
    //   47   87:iload           7
    //   48   89:aload_3         
    //   49   90:invokevirtual   #227 <Method int Rect.height()>
    //   50   93:icmpge          123
    //   51   96:aload           9
    //   52   98:bipush          53
    //   53  100:iload           8
    //   54  102:aload_2         
    //   55  103:iconst_0        
    //   56  104:iaload          
    //   57  105:isub            
    //   58  106:iload           5
    //   59  108:iconst_2        
    //   60  109:idiv            
    //   61  110:isub            
    //   62  111:iload           6
    //   63  113:invokevirtual   #231 <Method void Toast.setGravity(int, int, int)>
    //   64  116:aload           9
    //   65  118:invokevirtual   #234 <Method void Toast.show()>
    //   66  121:iconst_1        
    //   67  122:ireturn         
    //   68  123:aload           9
    //   69  125:bipush          81
    //   70  127:iconst_0        
    //   71  128:iload           6
    //   72  130:invokevirtual   #231 <Method void Toast.setGravity(int, int, int)>
    //   73  133:goto            116
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #171 <Method boolean hasText()>
    //    2    4:istore_3        
    //    3    5:iload_3         
    //    4    6:ifeq            36
    //    5    9:aload_0         
    //    6   10:getfield        #98  <Field int mSavedPaddingLeft>
    //    7   13:iflt            36
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #98  <Field int mSavedPaddingLeft>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #239 <Method int getPaddingTop()>
    //   13   25:aload_0         
    //   14   26:invokevirtual   #242 <Method int getPaddingRight()>
    //   15   29:aload_0         
    //   16   30:invokevirtual   #245 <Method int getPaddingBottom()>
    //   17   33:invokespecial   #249 <Method void CompatTextView.setPadding(int, int, int, int)>
    //   18   36:aload_0         
    //   19   37:iload_1         
    //   20   38:iload_2         
    //   21   39:invokespecial   #251 <Method void CompatTextView.onMeasure(int, int)>
    //   22   42:iload_1         
    //   23   43:invokestatic    #257 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   24   46:istore          4
    //   25   48:iload_1         
    //   26   49:invokestatic    #260 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   27   52:istore          5
    //   28   54:aload_0         
    //   29   55:invokevirtual   #263 <Method int getMeasuredWidth()>
    //   30   58:istore          6
    //   31   60:iload           4
    //   32   62:ldc2            #264 <Int 0x80000000>
    //   33   65:icmpne          156
    //   34   68:iload           5
    //   35   70:aload_0         
    //   36   71:getfield        #75  <Field int mMinWidth>
    //   37   74:invokestatic    #269 <Method int Math.min(int, int)>
    //   38   77:istore          7
    //   39   79:iload           4
    //   40   81:ldc2            #270 <Int 0x40000000>
    //   41   84:icmpeq          114
    //   42   87:aload_0         
    //   43   88:getfield        #75  <Field int mMinWidth>
    //   44   91:ifle            114
    //   45   94:iload           6
    //   46   96:iload           7
    //   47   98:icmpge          114
    //   48  101:aload_0         
    //   49  102:iload           7
    //   50  104:ldc2            #270 <Int 0x40000000>
    //   51  107:invokestatic    #273 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   52  110:iload_2         
    //   53  111:invokespecial   #251 <Method void CompatTextView.onMeasure(int, int)>
    //   54  114:iload_3         
    //   55  115:ifne            155
    //   56  118:aload_0         
    //   57  119:getfield        #109 <Field Drawable mIcon>
    //   58  122:ifnull          155
    //   59  125:aload_0         
    //   60  126:aload_0         
    //   61  127:invokevirtual   #263 <Method int getMeasuredWidth()>
    //   62  130:aload_0         
    //   63  131:getfield        #109 <Field Drawable mIcon>
    //   64  134:invokevirtual   #278 <Method int Drawable.getIntrinsicWidth()>
    //   65  137:isub            
    //   66  138:iconst_2        
    //   67  139:idiv            
    //   68  140:aload_0         
    //   69  141:invokevirtual   #239 <Method int getPaddingTop()>
    //   70  144:aload_0         
    //   71  145:invokevirtual   #242 <Method int getPaddingRight()>
    //   72  148:aload_0         
    //   73  149:invokevirtual   #245 <Method int getPaddingBottom()>
    //   74  152:invokespecial   #249 <Method void CompatTextView.setPadding(int, int, int, int)>
    //   75  155:return          
    //   76  156:aload_0         
    //   77  157:getfield        #75  <Field int mMinWidth>
    //   78  160:istore          7
    //   79  162:goto            79
    }

    public boolean prefersCondensedTitle()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public void setCheckable(boolean flag)
    {
    //    0    0:return          
    }

    public void setChecked(boolean flag)
    {
    //    0    0:return          
    }

    public void setExpandedFormat(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field boolean mExpandedFormat>
    //    2    4:iload_1         
    //    3    5:icmpeq          27
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #119 <Field boolean mExpandedFormat>
    //    7   13:aload_0         
    //    8   14:getfield        #111 <Field MenuItemImpl mItemData>
    //    9   17:ifnull          27
    //   10   20:aload_0         
    //   11   21:getfield        #111 <Field MenuItemImpl mItemData>
    //   12   24:invokevirtual   #285 <Method void MenuItemImpl.actionFormatChanged()>
    //   13   27:return          
    }

    public void setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #109 <Field Drawable mIcon>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:aconst_null     
    //    6    8:aconst_null     
    //    7    9:aconst_null     
    //    8   10:invokevirtual   #289 <Method void setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
    //    9   13:aload_0         
    //   10   14:invokespecial   #291 <Method void updateTextButtonVisibility()>
    //   11   17:return          
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker iteminvoker)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #176 <Field MenuBuilder$ItemInvoker mItemInvoker>
    //    3    5:return          
    }

    public void setPadding(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #98  <Field int mSavedPaddingLeft>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:iload_2         
    //    6    8:iload_3         
    //    7    9:iload           4
    //    8   11:invokespecial   #249 <Method void CompatTextView.setPadding(int, int, int, int)>
    //    9   14:return          
    }

    public void setShortcut(boolean flag, char c)
    {
    //    0    0:return          
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #101 <Field CharSequence mTitle>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:getfield        #101 <Field CharSequence mTitle>
    //    6   10:invokevirtual   #298 <Method void setContentDescription(CharSequence)>
    //    7   13:aload_0         
    //    8   14:invokespecial   #291 <Method void updateTextButtonVisibility()>
    //    9   17:return          
    }

    public boolean showsIcon()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    private static final String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private Drawable mIcon;
    private MenuItemImpl mItemData;
    private MenuBuilder.ItemInvoker mItemInvoker;
    private int mMinWidth;
    private int mSavedPaddingLeft;
    private CharSequence mTitle;
}
