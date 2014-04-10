// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package yuku.ambilwarna;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaKotak extends View
{

    public AmbilWarnaKotak(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #14  <Method void View(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_3        
    //    6    8:newarray        float[]
    //    7   10:dup             
    //    8   11:iconst_0        
    //    9   12:fconst_1        
    //   10   13:fastore         
    //   11   14:dup             
    //   12   15:iconst_1        
    //   13   16:fconst_1        
    //   14   17:fastore         
    //   15   18:dup             
    //   16   19:iconst_2        
    //   17   20:fconst_1        
    //   18   21:fastore         
    //   19   22:putfield        #16  <Field float[] color>
    //   20   25:return          
    }

    public AmbilWarnaKotak(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #19  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:iconst_3        
    //    7    9:newarray        float[]
    //    8   11:dup             
    //    9   12:iconst_0        
    //   10   13:fconst_1        
    //   11   14:fastore         
    //   12   15:dup             
    //   13   16:iconst_1        
    //   14   17:fconst_1        
    //   15   18:fastore         
    //   16   19:dup             
    //   17   20:iconst_2        
    //   18   21:fconst_1        
    //   19   22:fastore         
    //   20   23:putfield        #16  <Field float[] color>
    //   21   26:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #26  <Method void View.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #28  <Field Paint paint>
    //    5    9:ifnonnull       48
    //    6   12:aload_0         
    //    7   13:new             #30  <Class Paint>
    //    8   16:dup             
    //    9   17:invokespecial   #33  <Method void Paint()>
    //   10   20:putfield        #28  <Field Paint paint>
    //   11   23:aload_0         
    //   12   24:new             #35  <Class LinearGradient>
    //   13   27:dup             
    //   14   28:fconst_0        
    //   15   29:fconst_0        
    //   16   30:fconst_0        
    //   17   31:aload_0         
    //   18   32:invokevirtual   #39  <Method int getMeasuredHeight()>
    //   19   35:i2f             
    //   20   36:iconst_m1       
    //   21   37:ldc1            #40  <Int 0xff000000>
    //   22   39:getstatic       #46  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
    //   23   42:invokespecial   #49  <Method void LinearGradient(float, float, float, float, int, int, android.graphics.Shader$TileMode)>
    //   24   45:putfield        #51  <Field Shader luar>
    //   25   48:aload_0         
    //   26   49:getfield        #16  <Field float[] color>
    //   27   52:invokestatic    #57  <Method int Color.HSVToColor(float[])>
    //   28   55:istore_2        
    //   29   56:new             #35  <Class LinearGradient>
    //   30   59:dup             
    //   31   60:fconst_0        
    //   32   61:fconst_0        
    //   33   62:aload_0         
    //   34   63:invokevirtual   #60  <Method int getMeasuredWidth()>
    //   35   66:i2f             
    //   36   67:fconst_0        
    //   37   68:iconst_m1       
    //   38   69:iload_2         
    //   39   70:getstatic       #46  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
    //   40   73:invokespecial   #49  <Method void LinearGradient(float, float, float, float, int, int, android.graphics.Shader$TileMode)>
    //   41   76:astore_3        
    //   42   77:new             #62  <Class ComposeShader>
    //   43   80:dup             
    //   44   81:aload_0         
    //   45   82:getfield        #51  <Field Shader luar>
    //   46   85:aload_3         
    //   47   86:getstatic       #68  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
    //   48   89:invokespecial   #71  <Method void ComposeShader(Shader, Shader, android.graphics.PorterDuff$Mode)>
    //   49   92:astore          4
    //   50   94:aload_0         
    //   51   95:getfield        #28  <Field Paint paint>
    //   52   98:aload           4
    //   53  100:invokevirtual   #75  <Method Shader Paint.setShader(Shader)>
    //   54  103:pop             
    //   55  104:aload_1         
    //   56  105:fconst_0        
    //   57  106:fconst_0        
    //   58  107:aload_0         
    //   59  108:invokevirtual   #60  <Method int getMeasuredWidth()>
    //   60  111:i2f             
    //   61  112:aload_0         
    //   62  113:invokevirtual   #39  <Method int getMeasuredHeight()>
    //   63  116:i2f             
    //   64  117:aload_0         
    //   65  118:getfield        #28  <Field Paint paint>
    //   66  121:invokevirtual   #81  <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //   67  124:return          
    }

    void setHue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field float[] color>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:aload_0         
    //    6    8:invokevirtual   #86  <Method void invalidate()>
    //    7   11:return          
    }

    final float color[];
    Shader luar;
    Paint paint;
}
