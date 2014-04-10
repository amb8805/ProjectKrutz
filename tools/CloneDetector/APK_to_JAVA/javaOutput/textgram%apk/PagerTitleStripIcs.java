// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

class PagerTitleStripIcs
{
    private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod
    {

        public SingleLineAllCapsTransform(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void SingleLineTransformationMethod()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #21  <Method Resources Context.getResources()>
        //    5    9:invokevirtual   #27  <Method Configuration Resources.getConfiguration()>
        //    6   12:getfield        #32  <Field Locale Configuration.locale>
        //    7   15:putfield        #34  <Field Locale mLocale>
        //    8   18:return          
        }

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #38  <Method CharSequence SingleLineTransformationMethod.getTransformation(CharSequence, View)>
        //    4    6:astore_3        
        //    5    7:aload_3         
        //    6    8:ifnull          23
        //    7   11:aload_3         
        //    8   12:invokevirtual   #44  <Method String Object.toString()>
        //    9   15:aload_0         
        //   10   16:getfield        #34  <Field Locale mLocale>
        //   11   19:invokevirtual   #50  <Method String String.toUpperCase(Locale)>
        //   12   22:areturn         
        //   13   23:aconst_null     
        //   14   24:areturn         
        }

        private static final String TAG = "SingleLineAllCapsTransform";
        private Locale mLocale;
    }


    PagerTitleStripIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void setSingleLineAllCaps(TextView textview)
    {
    //    0    0:aload_0         
    //    1    1:new             #12  <Class PagerTitleStripIcs$SingleLineAllCapsTransform>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:invokevirtual   #18  <Method Context TextView.getContext()>
    //    5    9:invokespecial   #21  <Method void PagerTitleStripIcs$SingleLineAllCapsTransform(Context)>
    //    6   12:invokevirtual   #25  <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
    //    7   15:return          
    }
}
