// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class RotateBitmap
{

    public RotateBitmap(Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #19  <Field Bitmap mBitmap>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #21  <Field int mRotation>
    //    8   14:return          
    }

    public RotateBitmap(Bitmap bitmap, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #19  <Field Bitmap mBitmap>
    //    5    9:aload_0         
    //    6   10:iload_2         
    //    7   11:sipush          360
    //    8   14:irem            
    //    9   15:putfield        #21  <Field int mRotation>
    //   10   18:return          
    }

    public Bitmap getBitmap()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field Bitmap mBitmap>
    //    2    4:areturn         
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #30  <Method boolean isOrientationChanged()>
    //    2    4:ifeq            15
    //    3    7:aload_0         
    //    4    8:getfield        #19  <Field Bitmap mBitmap>
    //    5   11:invokevirtual   #35  <Method int Bitmap.getWidth()>
    //    6   14:ireturn         
    //    7   15:aload_0         
    //    8   16:getfield        #19  <Field Bitmap mBitmap>
    //    9   19:invokevirtual   #37  <Method int Bitmap.getHeight()>
    //   10   22:ireturn         
    }

    public Matrix getRotateMatrix()
    {
    //    0    0:new             #41  <Class Matrix>
    //    1    3:dup             
    //    2    4:invokespecial   #42  <Method void Matrix()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:getfield        #21  <Field int mRotation>
    //    6   12:ifeq            75
    //    7   15:aload_0         
    //    8   16:getfield        #19  <Field Bitmap mBitmap>
    //    9   19:invokevirtual   #35  <Method int Bitmap.getWidth()>
    //   10   22:iconst_2        
    //   11   23:idiv            
    //   12   24:istore_2        
    //   13   25:aload_0         
    //   14   26:getfield        #19  <Field Bitmap mBitmap>
    //   15   29:invokevirtual   #37  <Method int Bitmap.getHeight()>
    //   16   32:iconst_2        
    //   17   33:idiv            
    //   18   34:istore_3        
    //   19   35:aload_1         
    //   20   36:iload_2         
    //   21   37:ineg            
    //   22   38:i2f             
    //   23   39:iload_3         
    //   24   40:ineg            
    //   25   41:i2f             
    //   26   42:invokevirtual   #46  <Method boolean Matrix.preTranslate(float, float)>
    //   27   45:pop             
    //   28   46:aload_1         
    //   29   47:aload_0         
    //   30   48:getfield        #21  <Field int mRotation>
    //   31   51:i2f             
    //   32   52:invokevirtual   #50  <Method boolean Matrix.postRotate(float)>
    //   33   55:pop             
    //   34   56:aload_1         
    //   35   57:aload_0         
    //   36   58:invokevirtual   #51  <Method int getWidth()>
    //   37   61:iconst_2        
    //   38   62:idiv            
    //   39   63:i2f             
    //   40   64:aload_0         
    //   41   65:invokevirtual   #52  <Method int getHeight()>
    //   42   68:iconst_2        
    //   43   69:idiv            
    //   44   70:i2f             
    //   45   71:invokevirtual   #55  <Method boolean Matrix.postTranslate(float, float)>
    //   46   74:pop             
    //   47   75:aload_1         
    //   48   76:areturn         
    }

    public int getRotation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field int mRotation>
    //    2    4:ireturn         
    }

    public int getWidth()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #30  <Method boolean isOrientationChanged()>
    //    2    4:ifeq            15
    //    3    7:aload_0         
    //    4    8:getfield        #19  <Field Bitmap mBitmap>
    //    5   11:invokevirtual   #37  <Method int Bitmap.getHeight()>
    //    6   14:ireturn         
    //    7   15:aload_0         
    //    8   16:getfield        #19  <Field Bitmap mBitmap>
    //    9   19:invokevirtual   #35  <Method int Bitmap.getWidth()>
    //   10   22:ireturn         
    }

    public boolean isOrientationChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field int mRotation>
    //    2    4:bipush          90
    //    3    6:idiv            
    //    4    7:iconst_2        
    //    5    8:irem            
    //    6    9:ifeq            14
    //    7   12:iconst_1        
    //    8   13:ireturn         
    //    9   14:iconst_0        
    //   10   15:ireturn         
    }

    public void recycle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field Bitmap mBitmap>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #19  <Field Bitmap mBitmap>
    //    5   11:invokevirtual   #59  <Method void Bitmap.recycle()>
    //    6   14:aload_0         
    //    7   15:aconst_null     
    //    8   16:putfield        #19  <Field Bitmap mBitmap>
    //    9   19:return          
    }

    public void setBitmap(Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #19  <Field Bitmap mBitmap>
    //    3    5:return          
    }

    public void setRotation(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #21  <Field int mRotation>
    //    3    5:return          
    }

    public static final String TAG = "RotateBitmap";
    private Bitmap mBitmap;
    private int mRotation;
}
