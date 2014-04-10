// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class NewEditText extends EditText
{

    public NewEditText(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #10  <Method void EditText(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:invokevirtual   #14  <Method boolean isInEditMode()>
    //    6   10:ifeq            14
    //    7   13:return          
    // try 14 27 handler(s) 28
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #20  <Method android.content.res.AssetManager Context.getAssets()>
    //   11   19:ldc1            #22  <String "fonts/roboto/roboto_l.ttf">
    //   12   21:invokestatic    #28  <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
    //   13   24:invokevirtual   #32  <Method void setTypeface(Typeface)>
    //   14   27:return          
    // catch Exception
    //   15   28:astore_3        
    //   16   29:return          
    }
}
