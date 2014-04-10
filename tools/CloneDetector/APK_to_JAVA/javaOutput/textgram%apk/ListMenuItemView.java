// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl

public class ListMenuItemView extends LinearLayout
    implements MenuView.ItemView
{

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #39  <Method void ListMenuItemView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #41  <Method void LinearLayout(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:putfield        #43  <Field Context mContext>
    //    7   11:aload_1         
    //    8   12:aload_2         
    //    9   13:getstatic       #49  <Field int[] android.support.v7.appcompat.R$styleable.MenuView>
    //   10   16:iload_3         
    //   11   17:iconst_0        
    //   12   18:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   13   21:astore          4
    //   14   23:aload_0         
    //   15   24:aload           4
    //   16   26:iconst_5        
    //   17   27:invokevirtual   #61  <Method Drawable TypedArray.getDrawable(int)>
    //   18   30:putfield        #63  <Field Drawable mBackground>
    //   19   33:aload_0         
    //   20   34:aload           4
    //   21   36:iconst_1        
    //   22   37:iconst_m1       
    //   23   38:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
    //   24   41:putfield        #69  <Field int mTextAppearance>
    //   25   44:aload_0         
    //   26   45:aload           4
    //   27   47:bipush          7
    //   28   49:iconst_0        
    //   29   50:invokevirtual   #73  <Method boolean TypedArray.getBoolean(int, boolean)>
    //   30   53:putfield        #75  <Field boolean mPreserveIconSpacing>
    //   31   56:aload_0         
    //   32   57:aload_1         
    //   33   58:putfield        #77  <Field Context mTextAppearanceContext>
    //   34   61:aload           4
    //   35   63:invokevirtual   #81  <Method void TypedArray.recycle()>
    //   36   66:return          
    }

    private LayoutInflater getInflater()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field LayoutInflater mInflater>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #43  <Field Context mContext>
    //    6   12:invokestatic    #91  <Method LayoutInflater LayoutInflater.from(Context)>
    //    7   15:putfield        #85  <Field LayoutInflater mInflater>
    //    8   18:aload_0         
    //    9   19:getfield        #85  <Field LayoutInflater mInflater>
    //   10   22:areturn         
    }

    private void insertCheckBox()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokespecial   #94  <Method LayoutInflater getInflater()>
    //    3    5:getstatic       #99  <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_checkbox>
    //    4    8:aload_0         
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #103 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
    //    7   13:checkcast       #105 <Class CheckBox>
    //    8   16:putfield        #107 <Field CheckBox mCheckBox>
    //    9   19:aload_0         
    //   10   20:aload_0         
    //   11   21:getfield        #107 <Field CheckBox mCheckBox>
    //   12   24:invokevirtual   #111 <Method void addView(android.view.View)>
    //   13   27:return          
    }

    private void insertIconView()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokespecial   #94  <Method LayoutInflater getInflater()>
    //    3    5:getstatic       #115 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_icon>
    //    4    8:aload_0         
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #103 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
    //    7   13:checkcast       #117 <Class ImageView>
    //    8   16:putfield        #119 <Field ImageView mIconView>
    //    9   19:aload_0         
    //   10   20:aload_0         
    //   11   21:getfield        #119 <Field ImageView mIconView>
    //   12   24:iconst_0        
    //   13   25:invokevirtual   #122 <Method void addView(android.view.View, int)>
    //   14   28:return          
    }

    private void insertRadioButton()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokespecial   #94  <Method LayoutInflater getInflater()>
    //    3    5:getstatic       #126 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_radio>
    //    4    8:aload_0         
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #103 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
    //    7   13:checkcast       #128 <Class RadioButton>
    //    8   16:putfield        #130 <Field RadioButton mRadioButton>
    //    9   19:aload_0         
    //   10   20:aload_0         
    //   11   21:getfield        #130 <Field RadioButton mRadioButton>
    //   12   24:invokevirtual   #111 <Method void addView(android.view.View)>
    //   13   27:return          
    }

    public MenuItemImpl getItemData()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field MenuItemImpl mItemData>
    //    2    4:areturn         
    }

    public void initialize(MenuItemImpl menuitemimpl, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #134 <Field MenuItemImpl mItemData>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #138 <Field int mMenuType>
    //    6   10:aload_1         
    //    7   11:invokevirtual   #144 <Method boolean MenuItemImpl.isVisible()>
    //    8   14:ifeq            70
    //    9   17:iconst_0        
    //   10   18:istore_3        
    //   11   19:aload_0         
    //   12   20:iload_3         
    //   13   21:invokevirtual   #148 <Method void setVisibility(int)>
    //   14   24:aload_0         
    //   15   25:aload_1         
    //   16   26:aload_0         
    //   17   27:invokevirtual   #152 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
    //   18   30:invokevirtual   #156 <Method void setTitle(CharSequence)>
    //   19   33:aload_0         
    //   20   34:aload_1         
    //   21   35:invokevirtual   #159 <Method boolean MenuItemImpl.isCheckable()>
    //   22   38:invokevirtual   #163 <Method void setCheckable(boolean)>
    //   23   41:aload_0         
    //   24   42:aload_1         
    //   25   43:invokevirtual   #166 <Method boolean MenuItemImpl.shouldShowShortcut()>
    //   26   46:aload_1         
    //   27   47:invokevirtual   #170 <Method char MenuItemImpl.getShortcut()>
    //   28   50:invokevirtual   #174 <Method void setShortcut(boolean, char)>
    //   29   53:aload_0         
    //   30   54:aload_1         
    //   31   55:invokevirtual   #178 <Method Drawable MenuItemImpl.getIcon()>
    //   32   58:invokevirtual   #182 <Method void setIcon(Drawable)>
    //   33   61:aload_0         
    //   34   62:aload_1         
    //   35   63:invokevirtual   #185 <Method boolean MenuItemImpl.isEnabled()>
    //   36   66:invokevirtual   #188 <Method void setEnabled(boolean)>
    //   37   69:return          
    //   38   70:bipush          8
    //   39   72:istore_3        
    //   40   73:goto            19
    }

    protected void onFinishInflate()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #191 <Method void LinearLayout.onFinishInflate()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #63  <Field Drawable mBackground>
    //    5    9:invokevirtual   #194 <Method void setBackgroundDrawable(Drawable)>
    //    6   12:aload_0         
    //    7   13:aload_0         
    //    8   14:getstatic       #199 <Field int android.support.v7.appcompat.R$id.title>
    //    9   17:invokevirtual   #203 <Method android.view.View findViewById(int)>
    //   10   20:checkcast       #205 <Class TextView>
    //   11   23:putfield        #207 <Field TextView mTitleView>
    //   12   26:aload_0         
    //   13   27:getfield        #69  <Field int mTextAppearance>
    //   14   30:iconst_m1       
    //   15   31:icmpeq          49
    //   16   34:aload_0         
    //   17   35:getfield        #207 <Field TextView mTitleView>
    //   18   38:aload_0         
    //   19   39:getfield        #77  <Field Context mTextAppearanceContext>
    //   20   42:aload_0         
    //   21   43:getfield        #69  <Field int mTextAppearance>
    //   22   46:invokevirtual   #211 <Method void TextView.setTextAppearance(Context, int)>
    //   23   49:aload_0         
    //   24   50:aload_0         
    //   25   51:getstatic       #214 <Field int android.support.v7.appcompat.R$id.shortcut>
    //   26   54:invokevirtual   #203 <Method android.view.View findViewById(int)>
    //   27   57:checkcast       #205 <Class TextView>
    //   28   60:putfield        #216 <Field TextView mShortcutView>
    //   29   63:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field ImageView mIconView>
    //    2    4:ifnull          55
    //    3    7:aload_0         
    //    4    8:getfield        #75  <Field boolean mPreserveIconSpacing>
    //    5   11:ifeq            55
    //    6   14:aload_0         
    //    7   15:invokevirtual   #222 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
    //    8   18:astore_3        
    //    9   19:aload_0         
    //   10   20:getfield        #119 <Field ImageView mIconView>
    //   11   23:invokevirtual   #223 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
    //   12   26:checkcast       #225 <Class android.widget.LinearLayout$LayoutParams>
    //   13   29:astore          4
    //   14   31:aload_3         
    //   15   32:getfield        #230 <Field int android.view.ViewGroup$LayoutParams.height>
    //   16   35:ifle            55
    //   17   38:aload           4
    //   18   40:getfield        #233 <Field int android.widget.LinearLayout$LayoutParams.width>
    //   19   43:ifgt            55
    //   20   46:aload           4
    //   21   48:aload_3         
    //   22   49:getfield        #230 <Field int android.view.ViewGroup$LayoutParams.height>
    //   23   52:putfield        #233 <Field int android.widget.LinearLayout$LayoutParams.width>
    //   24   55:aload_0         
    //   25   56:iload_1         
    //   26   57:iload_2         
    //   27   58:invokespecial   #235 <Method void LinearLayout.onMeasure(int, int)>
    //   28   61:return          
    }

    public boolean prefersCondensedTitle()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void setCheckable(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifne            19
    //    2    4:aload_0         
    //    3    5:getfield        #130 <Field RadioButton mRadioButton>
    //    4    8:ifnonnull       19
    //    5   11:aload_0         
    //    6   12:getfield        #107 <Field CheckBox mCheckBox>
    //    7   15:ifnonnull       19
    //    8   18:return          
    //    9   19:aload_0         
    //   10   20:getfield        #134 <Field MenuItemImpl mItemData>
    //   11   23:invokevirtual   #239 <Method boolean MenuItemImpl.isExclusiveCheckable()>
    //   12   26:ifeq            107
    //   13   29:aload_0         
    //   14   30:getfield        #130 <Field RadioButton mRadioButton>
    //   15   33:ifnonnull       40
    //   16   36:aload_0         
    //   17   37:invokespecial   #241 <Method void insertRadioButton()>
    //   18   40:aload_0         
    //   19   41:getfield        #130 <Field RadioButton mRadioButton>
    //   20   44:astore_2        
    //   21   45:aload_0         
    //   22   46:getfield        #107 <Field CheckBox mCheckBox>
    //   23   49:astore_3        
    //   24   50:iload_1         
    //   25   51:ifeq            138
    //   26   54:aload_2         
    //   27   55:aload_0         
    //   28   56:getfield        #134 <Field MenuItemImpl mItemData>
    //   29   59:invokevirtual   #244 <Method boolean MenuItemImpl.isChecked()>
    //   30   62:invokevirtual   #249 <Method void CompoundButton.setChecked(boolean)>
    //   31   65:iload_1         
    //   32   66:ifeq            131
    //   33   69:iconst_0        
    //   34   70:istore          4
    //   35   72:aload_2         
    //   36   73:invokevirtual   #253 <Method int CompoundButton.getVisibility()>
    //   37   76:iload           4
    //   38   78:icmpeq          87
    //   39   81:aload_2         
    //   40   82:iload           4
    //   41   84:invokevirtual   #254 <Method void CompoundButton.setVisibility(int)>
    //   42   87:aload_3         
    //   43   88:ifnull          18
    //   44   91:aload_3         
    //   45   92:invokevirtual   #253 <Method int CompoundButton.getVisibility()>
    //   46   95:bipush          8
    //   47   97:icmpeq          18
    //   48  100:aload_3         
    //   49  101:bipush          8
    //   50  103:invokevirtual   #254 <Method void CompoundButton.setVisibility(int)>
    //   51  106:return          
    //   52  107:aload_0         
    //   53  108:getfield        #107 <Field CheckBox mCheckBox>
    //   54  111:ifnonnull       118
    //   55  114:aload_0         
    //   56  115:invokespecial   #256 <Method void insertCheckBox()>
    //   57  118:aload_0         
    //   58  119:getfield        #107 <Field CheckBox mCheckBox>
    //   59  122:astore_2        
    //   60  123:aload_0         
    //   61  124:getfield        #130 <Field RadioButton mRadioButton>
    //   62  127:astore_3        
    //   63  128:goto            50
    //   64  131:bipush          8
    //   65  133:istore          4
    //   66  135:goto            72
    //   67  138:aload_0         
    //   68  139:getfield        #107 <Field CheckBox mCheckBox>
    //   69  142:ifnull          154
    //   70  145:aload_0         
    //   71  146:getfield        #107 <Field CheckBox mCheckBox>
    //   72  149:bipush          8
    //   73  151:invokevirtual   #257 <Method void CheckBox.setVisibility(int)>
    //   74  154:aload_0         
    //   75  155:getfield        #130 <Field RadioButton mRadioButton>
    //   76  158:ifnull          18
    //   77  161:aload_0         
    //   78  162:getfield        #130 <Field RadioButton mRadioButton>
    //   79  165:bipush          8
    //   80  167:invokevirtual   #258 <Method void RadioButton.setVisibility(int)>
    //   81  170:return          
    }

    public void setChecked(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field MenuItemImpl mItemData>
    //    2    4:invokevirtual   #239 <Method boolean MenuItemImpl.isExclusiveCheckable()>
    //    3    7:ifeq            32
    //    4   10:aload_0         
    //    5   11:getfield        #130 <Field RadioButton mRadioButton>
    //    6   14:ifnonnull       21
    //    7   17:aload_0         
    //    8   18:invokespecial   #241 <Method void insertRadioButton()>
    //    9   21:aload_0         
    //   10   22:getfield        #130 <Field RadioButton mRadioButton>
    //   11   25:astore_2        
    //   12   26:aload_2         
    //   13   27:iload_1         
    //   14   28:invokevirtual   #249 <Method void CompoundButton.setChecked(boolean)>
    //   15   31:return          
    //   16   32:aload_0         
    //   17   33:getfield        #107 <Field CheckBox mCheckBox>
    //   18   36:ifnonnull       43
    //   19   39:aload_0         
    //   20   40:invokespecial   #256 <Method void insertCheckBox()>
    //   21   43:aload_0         
    //   22   44:getfield        #107 <Field CheckBox mCheckBox>
    //   23   47:astore_2        
    //   24   48:goto            26
    }

    public void setForceShowIcon(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #261 <Field boolean mForceShowIcon>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #75  <Field boolean mPreserveIconSpacing>
    //    6   10:return          
    }

    public void setIcon(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field MenuItemImpl mItemData>
    //    2    4:invokevirtual   #264 <Method boolean MenuItemImpl.shouldShowIcon()>
    //    3    7:ifne            17
    //    4   10:aload_0         
    //    5   11:getfield        #261 <Field boolean mForceShowIcon>
    //    6   14:ifeq            31
    //    7   17:iconst_1        
    //    8   18:istore_2        
    //    9   19:iload_2         
    //   10   20:ifne            36
    //   11   23:aload_0         
    //   12   24:getfield        #75  <Field boolean mPreserveIconSpacing>
    //   13   27:ifne            36
    //   14   30:return          
    //   15   31:iconst_0        
    //   16   32:istore_2        
    //   17   33:goto            19
    //   18   36:aload_0         
    //   19   37:getfield        #119 <Field ImageView mIconView>
    //   20   40:ifnonnull       54
    //   21   43:aload_1         
    //   22   44:ifnonnull       54
    //   23   47:aload_0         
    //   24   48:getfield        #75  <Field boolean mPreserveIconSpacing>
    //   25   51:ifeq            30
    //   26   54:aload_0         
    //   27   55:getfield        #119 <Field ImageView mIconView>
    //   28   58:ifnonnull       65
    //   29   61:aload_0         
    //   30   62:invokespecial   #266 <Method void insertIconView()>
    //   31   65:aload_1         
    //   32   66:ifnonnull       76
    //   33   69:aload_0         
    //   34   70:getfield        #75  <Field boolean mPreserveIconSpacing>
    //   35   73:ifeq            114
    //   36   76:aload_0         
    //   37   77:getfield        #119 <Field ImageView mIconView>
    //   38   80:astore_3        
    //   39   81:iload_2         
    //   40   82:ifeq            109
    //   41   85:aload_3         
    //   42   86:aload_1         
    //   43   87:invokevirtual   #269 <Method void ImageView.setImageDrawable(Drawable)>
    //   44   90:aload_0         
    //   45   91:getfield        #119 <Field ImageView mIconView>
    //   46   94:invokevirtual   #270 <Method int ImageView.getVisibility()>
    //   47   97:ifeq            30
    //   48  100:aload_0         
    //   49  101:getfield        #119 <Field ImageView mIconView>
    //   50  104:iconst_0        
    //   51  105:invokevirtual   #271 <Method void ImageView.setVisibility(int)>
    //   52  108:return          
    //   53  109:aconst_null     
    //   54  110:astore_1        
    //   55  111:goto            85
    //   56  114:aload_0         
    //   57  115:getfield        #119 <Field ImageView mIconView>
    //   58  118:bipush          8
    //   59  120:invokevirtual   #271 <Method void ImageView.setVisibility(int)>
    //   60  123:return          
    }

    public void setShortcut(boolean flag, char c)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            54
    //    2    4:aload_0         
    //    3    5:getfield        #134 <Field MenuItemImpl mItemData>
    //    4    8:invokevirtual   #166 <Method boolean MenuItemImpl.shouldShowShortcut()>
    //    5   11:ifeq            54
    //    6   14:iconst_0        
    //    7   15:istore_3        
    //    8   16:iload_3         
    //    9   17:ifne            34
    //   10   20:aload_0         
    //   11   21:getfield        #216 <Field TextView mShortcutView>
    //   12   24:aload_0         
    //   13   25:getfield        #134 <Field MenuItemImpl mItemData>
    //   14   28:invokevirtual   #275 <Method String MenuItemImpl.getShortcutLabel()>
    //   15   31:invokevirtual   #278 <Method void TextView.setText(CharSequence)>
    //   16   34:aload_0         
    //   17   35:getfield        #216 <Field TextView mShortcutView>
    //   18   38:invokevirtual   #279 <Method int TextView.getVisibility()>
    //   19   41:iload_3         
    //   20   42:icmpeq          53
    //   21   45:aload_0         
    //   22   46:getfield        #216 <Field TextView mShortcutView>
    //   23   49:iload_3         
    //   24   50:invokevirtual   #280 <Method void TextView.setVisibility(int)>
    //   25   53:return          
    //   26   54:bipush          8
    //   27   56:istore_3        
    //   28   57:goto            16
    }

    public void setTitle(CharSequence charsequence)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          31
    //    2    4:aload_0         
    //    3    5:getfield        #207 <Field TextView mTitleView>
    //    4    8:aload_1         
    //    5    9:invokevirtual   #278 <Method void TextView.setText(CharSequence)>
    //    6   12:aload_0         
    //    7   13:getfield        #207 <Field TextView mTitleView>
    //    8   16:invokevirtual   #279 <Method int TextView.getVisibility()>
    //    9   19:ifeq            30
    //   10   22:aload_0         
    //   11   23:getfield        #207 <Field TextView mTitleView>
    //   12   26:iconst_0        
    //   13   27:invokevirtual   #280 <Method void TextView.setVisibility(int)>
    //   14   30:return          
    //   15   31:aload_0         
    //   16   32:getfield        #207 <Field TextView mTitleView>
    //   17   35:invokevirtual   #279 <Method int TextView.getVisibility()>
    //   18   38:bipush          8
    //   19   40:icmpeq          30
    //   20   43:aload_0         
    //   21   44:getfield        #207 <Field TextView mTitleView>
    //   22   47:bipush          8
    //   23   49:invokevirtual   #280 <Method void TextView.setVisibility(int)>
    //   24   52:return          
    }

    public boolean showsIcon()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field boolean mForceShowIcon>
    //    2    4:ireturn         
    }

    private static final String TAG = "ListMenuItemView";
    private Drawable mBackground;
    private CheckBox mCheckBox;
    private Context mContext;
    private boolean mForceShowIcon;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private int mMenuType;
    private boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;
}
