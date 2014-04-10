// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;

public class ActionBarPolicy
{

    private ActionBarPolicy(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #13  <Field Context mContext>
    //    5    9:return          
    }

    public static ActionBarPolicy get(Context context)
    {
    //    0    0:new             #2   <Class ActionBarPolicy>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #17  <Method void ActionBarPolicy(Context)>
    //    4    8:areturn         
    }

    public boolean enableHomeButtonByDefault()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:invokevirtual   #25  <Method ApplicationInfo Context.getApplicationInfo()>
    //    3    7:getfield        #31  <Field int ApplicationInfo.targetSdkVersion>
    //    4   10:bipush          14
    //    5   12:icmpge          17
    //    6   15:iconst_1        
    //    7   16:ireturn         
    //    8   17:iconst_0        
    //    9   18:ireturn         
    }

    public int getEmbeddedMenuWidthLimit()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:invokevirtual   #37  <Method Resources Context.getResources()>
    //    3    7:invokevirtual   #43  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    4   10:getfield        #48  <Field int DisplayMetrics.widthPixels>
    //    5   13:iconst_2        
    //    6   14:idiv            
    //    7   15:ireturn         
    }

    public int getMaxActionButtons()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:invokevirtual   #37  <Method Resources Context.getResources()>
    //    3    7:getstatic       #54  <Field int android.support.v7.appcompat.R$integer.abc_max_action_buttons>
    //    4   10:invokevirtual   #58  <Method int Resources.getInteger(int)>
    //    5   13:ireturn         
    }

    public int getStackedTabMaxWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:invokevirtual   #37  <Method Resources Context.getResources()>
    //    3    7:getstatic       #64  <Field int android.support.v7.appcompat.R$dimen.abc_action_bar_stacked_tab_max_width>
    //    4   10:invokevirtual   #67  <Method int Resources.getDimensionPixelSize(int)>
    //    5   13:ireturn         
    }

    public int getTabContainerHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:aconst_null     
    //    3    5:getstatic       #74  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
    //    4    8:getstatic       #79  <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
    //    5   11:iconst_0        
    //    6   12:invokevirtual   #83  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
    //    7   15:astore_1        
    //    8   16:aload_1         
    //    9   17:iconst_1        
    //   10   18:iconst_0        
    //   11   19:invokevirtual   #89  <Method int TypedArray.getLayoutDimension(int, int)>
    //   12   22:istore_2        
    //   13   23:aload_0         
    //   14   24:getfield        #13  <Field Context mContext>
    //   15   27:invokevirtual   #37  <Method Resources Context.getResources()>
    //   16   30:astore_3        
    //   17   31:aload_0         
    //   18   32:invokevirtual   #92  <Method boolean hasEmbeddedTabs()>
    //   19   35:ifne            50
    //   20   38:iload_2         
    //   21   39:aload_3         
    //   22   40:getstatic       #95  <Field int android.support.v7.appcompat.R$dimen.abc_action_bar_stacked_max_height>
    //   23   43:invokevirtual   #67  <Method int Resources.getDimensionPixelSize(int)>
    //   24   46:invokestatic    #100 <Method int Math.min(int, int)>
    //   25   49:istore_2        
    //   26   50:aload_1         
    //   27   51:invokevirtual   #103 <Method void TypedArray.recycle()>
    //   28   54:iload_2         
    //   29   55:ireturn         
    }

    public boolean hasEmbeddedTabs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field Context mContext>
    //    2    4:invokevirtual   #37  <Method Resources Context.getResources()>
    //    3    7:getstatic       #108 <Field int android.support.v7.appcompat.R$bool.abc_action_bar_embed_tabs_pre_jb>
    //    4   10:invokevirtual   #112 <Method boolean Resources.getBoolean(int)>
    //    5   13:ireturn         
    }

    public boolean showsOverflowMenuButton()
    {
    //    0    0:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          10
    //    3    8:iconst_1        
    //    4    9:ireturn         
    //    5   10:iconst_0        
    //    6   11:ireturn         
    }

    private Context mContext;
}
