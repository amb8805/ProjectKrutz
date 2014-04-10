// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public class CompatTextView extends TextView
{
    private static class AllCapsTransformationMethod
        implements TransformationMethod
    {

        public AllCapsTransformationMethod(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #19  <Method Resources Context.getResources()>
        //    5    9:invokevirtual   #25  <Method Configuration Resources.getConfiguration()>
        //    6   12:getfield        #30  <Field Locale Configuration.locale>
        //    7   15:putfield        #32  <Field Locale mLocale>
        //    8   18:return          
        }

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
        //    0    0:aload_1         
        //    1    1:ifnull          16
        //    2    4:aload_1         
        //    3    5:invokevirtual   #38  <Method String Object.toString()>
        //    4    8:aload_0         
        //    5    9:getfield        #32  <Field Locale mLocale>
        //    6   12:invokevirtual   #44  <Method String String.toUpperCase(Locale)>
        //    7   15:areturn         
        //    8   16:aconst_null     
        //    9   17:areturn         
        }

        public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
        {
        //    0    0:return          
        }

        private final Locale mLocale;
    }


    public CompatTextView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #9   <Method void CompatTextView(Context, AttributeSet)>
    //    4    6:return          
    }

    public CompatTextView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #12  <Method void CompatTextView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public CompatTextView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #13  <Method void TextView(Context, AttributeSet, int)>
    //    5    7:aload_1         
    //    6    8:aload_2         
    //    7    9:getstatic       #19  <Field int[] android.support.v7.appcompat.R$styleable.CompatTextView>
    //    8   12:iload_3         
    //    9   13:iconst_0        
    //   10   14:invokevirtual   #25  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   11   17:astore          4
    //   12   19:aload           4
    //   13   21:iconst_0        
    //   14   22:iconst_0        
    //   15   23:invokevirtual   #31  <Method boolean TypedArray.getBoolean(int, boolean)>
    //   16   26:istore          5
    //   17   28:aload           4
    //   18   30:invokevirtual   #35  <Method void TypedArray.recycle()>
    //   19   33:iload           5
    //   20   35:ifeq            50
    //   21   38:aload_0         
    //   22   39:new             #37  <Class CompatTextView$AllCapsTransformationMethod>
    //   23   42:dup             
    //   24   43:aload_1         
    //   25   44:invokespecial   #39  <Method void CompatTextView$AllCapsTransformationMethod(Context)>
    //   26   47:invokevirtual   #43  <Method void setTransformationMethod(TransformationMethod)>
    //   27   50:return          
    }
}
