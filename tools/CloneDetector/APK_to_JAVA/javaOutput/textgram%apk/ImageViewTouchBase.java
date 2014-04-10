// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            RotateBitmap

abstract class ImageViewTouchBase extends ImageView
{
    public static interface Recycler
    {

        public abstract void recycle(Bitmap bitmap);
    }


    public ImageViewTouchBase(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #37  <Method void ImageView(Context)>
    //    3    5:aload_0         
    //    4    6:new             #39  <Class Matrix>
    //    5    9:dup             
    //    6   10:invokespecial   #42  <Method void Matrix()>
    //    7   13:putfield        #44  <Field Matrix mBaseMatrix>
    //    8   16:aload_0         
    //    9   17:new             #39  <Class Matrix>
    //   10   20:dup             
    //   11   21:invokespecial   #42  <Method void Matrix()>
    //   12   24:putfield        #46  <Field Matrix mSuppMatrix>
    //   13   27:aload_0         
    //   14   28:new             #39  <Class Matrix>
    //   15   31:dup             
    //   16   32:invokespecial   #42  <Method void Matrix()>
    //   17   35:putfield        #48  <Field Matrix mDisplayMatrix>
    //   18   38:aload_0         
    //   19   39:bipush          9
    //   20   41:newarray        float[]
    //   21   43:putfield        #50  <Field float[] mMatrixValues>
    //   22   46:aload_0         
    //   23   47:new             #52  <Class RotateBitmap>
    //   24   50:dup             
    //   25   51:aconst_null     
    //   26   52:invokespecial   #55  <Method void RotateBitmap(Bitmap)>
    //   27   55:putfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   28   58:aload_0         
    //   29   59:iconst_m1       
    //   30   60:putfield        #59  <Field int mThisWidth>
    //   31   63:aload_0         
    //   32   64:iconst_m1       
    //   33   65:putfield        #61  <Field int mThisHeight>
    //   34   68:aload_0         
    //   35   69:new             #63  <Class Handler>
    //   36   72:dup             
    //   37   73:invokespecial   #64  <Method void Handler()>
    //   38   76:putfield        #66  <Field Handler mHandler>
    //   39   79:aload_0         
    //   40   80:aconst_null     
    //   41   81:putfield        #68  <Field Runnable mOnLayoutRunnable>
    //   42   84:aload_0         
    //   43   85:invokespecial   #71  <Method void init()>
    //   44   88:return          
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #74  <Method void ImageView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #39  <Class Matrix>
    //    6   10:dup             
    //    7   11:invokespecial   #42  <Method void Matrix()>
    //    8   14:putfield        #44  <Field Matrix mBaseMatrix>
    //    9   17:aload_0         
    //   10   18:new             #39  <Class Matrix>
    //   11   21:dup             
    //   12   22:invokespecial   #42  <Method void Matrix()>
    //   13   25:putfield        #46  <Field Matrix mSuppMatrix>
    //   14   28:aload_0         
    //   15   29:new             #39  <Class Matrix>
    //   16   32:dup             
    //   17   33:invokespecial   #42  <Method void Matrix()>
    //   18   36:putfield        #48  <Field Matrix mDisplayMatrix>
    //   19   39:aload_0         
    //   20   40:bipush          9
    //   21   42:newarray        float[]
    //   22   44:putfield        #50  <Field float[] mMatrixValues>
    //   23   47:aload_0         
    //   24   48:new             #52  <Class RotateBitmap>
    //   25   51:dup             
    //   26   52:aconst_null     
    //   27   53:invokespecial   #55  <Method void RotateBitmap(Bitmap)>
    //   28   56:putfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   29   59:aload_0         
    //   30   60:iconst_m1       
    //   31   61:putfield        #59  <Field int mThisWidth>
    //   32   64:aload_0         
    //   33   65:iconst_m1       
    //   34   66:putfield        #61  <Field int mThisHeight>
    //   35   69:aload_0         
    //   36   70:new             #63  <Class Handler>
    //   37   73:dup             
    //   38   74:invokespecial   #64  <Method void Handler()>
    //   39   77:putfield        #66  <Field Handler mHandler>
    //   40   80:aload_0         
    //   41   81:aconst_null     
    //   42   82:putfield        #68  <Field Runnable mOnLayoutRunnable>
    //   43   85:aload_0         
    //   44   86:invokespecial   #71  <Method void init()>
    //   45   89:return          
    }

    private void getProperBaseMatrix(RotateBitmap rotatebitmap, Matrix matrix)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #80  <Method int getWidth()>
    //    2    4:i2f             
    //    3    5:fstore_3        
    //    4    6:aload_0         
    //    5    7:invokevirtual   #83  <Method int getHeight()>
    //    6   10:i2f             
    //    7   11:fstore          4
    //    8   13:aload_1         
    //    9   14:invokevirtual   #84  <Method int RotateBitmap.getWidth()>
    //   10   17:i2f             
    //   11   18:fstore          5
    //   12   20:aload_1         
    //   13   21:invokevirtual   #85  <Method int RotateBitmap.getHeight()>
    //   14   24:i2f             
    //   15   25:fstore          6
    //   16   27:aload_1         
    //   17   28:invokevirtual   #88  <Method int RotateBitmap.getRotation()>
    //   18   31:pop             
    //   19   32:aload_2         
    //   20   33:invokevirtual   #91  <Method void Matrix.reset()>
    //   21   36:fload_3         
    //   22   37:fload           5
    //   23   39:fdiv            
    //   24   40:fconst_2        
    //   25   41:invokestatic    #97  <Method float Math.min(float, float)>
    //   26   44:fload           4
    //   27   46:fload           6
    //   28   48:fdiv            
    //   29   49:fconst_2        
    //   30   50:invokestatic    #97  <Method float Math.min(float, float)>
    //   31   53:invokestatic    #97  <Method float Math.min(float, float)>
    //   32   56:fstore          8
    //   33   58:aload_2         
    //   34   59:aload_1         
    //   35   60:invokevirtual   #101 <Method Matrix RotateBitmap.getRotateMatrix()>
    //   36   63:invokevirtual   #105 <Method boolean Matrix.postConcat(Matrix)>
    //   37   66:pop             
    //   38   67:aload_2         
    //   39   68:fload           8
    //   40   70:fload           8
    //   41   72:invokevirtual   #109 <Method boolean Matrix.postScale(float, float)>
    //   42   75:pop             
    //   43   76:aload_2         
    //   44   77:fload_3         
    //   45   78:fload           5
    //   46   80:fload           8
    //   47   82:fmul            
    //   48   83:fsub            
    //   49   84:fconst_2        
    //   50   85:fdiv            
    //   51   86:fload           4
    //   52   88:fload           6
    //   53   90:fload           8
    //   54   92:fmul            
    //   55   93:fsub            
    //   56   94:fconst_2        
    //   57   95:fdiv            
    //   58   96:invokevirtual   #112 <Method boolean Matrix.postTranslate(float, float)>
    //   59   99:pop             
    //   60  100:return          
    }

    private void init()
    {
    //    0    0:aload_0         
    //    1    1:getstatic       #118 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
    //    2    4:invokevirtual   #122 <Method void setScaleType(android.widget.ImageView$ScaleType)>
    //    3    7:return          
    }

    private void setImageBitmap(Bitmap bitmap, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #126 <Method void ImageView.setImageBitmap(Bitmap)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #130 <Method Drawable getDrawable()>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:ifnull          19
    //    8   14:aload_3         
    //    9   15:iconst_1        
    //   10   16:invokevirtual   #136 <Method void Drawable.setDither(boolean)>
    //   11   19:aload_0         
    //   12   20:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   13   23:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   14   26:astore          4
    //   15   28:aload_0         
    //   16   29:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   17   32:aload_1         
    //   18   33:invokevirtual   #143 <Method void RotateBitmap.setBitmap(Bitmap)>
    //   19   36:aload_0         
    //   20   37:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   21   40:iload_2         
    //   22   41:invokevirtual   #147 <Method void RotateBitmap.setRotation(int)>
    //   23   44:aload           4
    //   24   46:ifnull          73
    //   25   49:aload           4
    //   26   51:aload_1         
    //   27   52:if_acmpeq       73
    //   28   55:aload_0         
    //   29   56:getfield        #149 <Field ImageViewTouchBase$Recycler mRecycler>
    //   30   59:ifnull          73
    //   31   62:aload_0         
    //   32   63:getfield        #149 <Field ImageViewTouchBase$Recycler mRecycler>
    //   33   66:aload           4
    //   34   68:invokeinterface #154 <Method void ImageViewTouchBase$Recycler.recycle(Bitmap)>
    //   35   73:return          
    }

    protected void center(boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //    2    4:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //    3    7:ifnonnull       11
    //    4   10:return          
    //    5   11:aload_0         
    //    6   12:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //    7   15:astore_3        
    //    8   16:new             #161 <Class RectF>
    //    9   19:dup             
    //   10   20:fconst_0        
    //   11   21:fconst_0        
    //   12   22:aload_0         
    //   13   23:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   14   26:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   15   29:invokevirtual   #164 <Method int Bitmap.getWidth()>
    //   16   32:i2f             
    //   17   33:aload_0         
    //   18   34:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   19   37:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   20   40:invokevirtual   #165 <Method int Bitmap.getHeight()>
    //   21   43:i2f             
    //   22   44:invokespecial   #168 <Method void RectF(float, float, float, float)>
    //   23   47:astore          4
    //   24   49:aload_3         
    //   25   50:aload           4
    //   26   52:invokevirtual   #172 <Method boolean Matrix.mapRect(RectF)>
    //   27   55:pop             
    //   28   56:aload           4
    //   29   58:invokevirtual   #176 <Method float RectF.height()>
    //   30   61:fstore          6
    //   31   63:aload           4
    //   32   65:invokevirtual   #179 <Method float RectF.width()>
    //   33   68:fstore          7
    //   34   70:fconst_0        
    //   35   71:fstore          8
    //   36   73:iload_2         
    //   37   74:ifeq            108
    //   38   77:aload_0         
    //   39   78:invokevirtual   #83  <Method int getHeight()>
    //   40   81:istore          12
    //   41   83:fload           6
    //   42   85:iload           12
    //   43   87:i2f             
    //   44   88:fcmpg           
    //   45   89:ifge            163
    //   46   92:iload           12
    //   47   94:i2f             
    //   48   95:fload           6
    //   49   97:fsub            
    //   50   98:fconst_2        
    //   51   99:fdiv            
    //   52  100:aload           4
    //   53  102:getfield        #182 <Field float RectF.top>
    //   54  105:fsub            
    //   55  106:fstore          8
    //   56  108:fconst_0        
    //   57  109:fstore          9
    //   58  111:iload_1         
    //   59  112:ifeq            146
    //   60  115:aload_0         
    //   61  116:invokevirtual   #80  <Method int getWidth()>
    //   62  119:istore          10
    //   63  121:fload           7
    //   64  123:iload           10
    //   65  125:i2f             
    //   66  126:fcmpg           
    //   67  127:ifge            219
    //   68  130:iload           10
    //   69  132:i2f             
    //   70  133:fload           7
    //   71  135:fsub            
    //   72  136:fconst_2        
    //   73  137:fdiv            
    //   74  138:aload           4
    //   75  140:getfield        #185 <Field float RectF.left>
    //   76  143:fsub            
    //   77  144:fstore          9
    //   78  146:aload_0         
    //   79  147:fload           9
    //   80  149:fload           8
    //   81  151:invokevirtual   #188 <Method void postTranslate(float, float)>
    //   82  154:aload_0         
    //   83  155:aload_0         
    //   84  156:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   85  159:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   86  162:return          
    //   87  163:aload           4
    //   88  165:getfield        #182 <Field float RectF.top>
    //   89  168:fconst_0        
    //   90  169:fcmpl           
    //   91  170:ifle            184
    //   92  173:aload           4
    //   93  175:getfield        #182 <Field float RectF.top>
    //   94  178:fneg            
    //   95  179:fstore          8
    //   96  181:goto            108
    //   97  184:aload           4
    //   98  186:getfield        #195 <Field float RectF.bottom>
    //   99  189:iload           12
    //  100  191:i2f             
    //  101  192:fcmpg           
    //  102  193:istore          13
    //  103  195:fconst_0        
    //  104  196:fstore          8
    //  105  198:iload           13
    //  106  200:ifge            108
    //  107  203:aload_0         
    //  108  204:invokevirtual   #83  <Method int getHeight()>
    //  109  207:i2f             
    //  110  208:aload           4
    //  111  210:getfield        #195 <Field float RectF.bottom>
    //  112  213:fsub            
    //  113  214:fstore          8
    //  114  216:goto            108
    //  115  219:aload           4
    //  116  221:getfield        #185 <Field float RectF.left>
    //  117  224:fconst_0        
    //  118  225:fcmpl           
    //  119  226:ifle            240
    //  120  229:aload           4
    //  121  231:getfield        #185 <Field float RectF.left>
    //  122  234:fneg            
    //  123  235:fstore          9
    //  124  237:goto            146
    //  125  240:aload           4
    //  126  242:getfield        #198 <Field float RectF.right>
    //  127  245:iload           10
    //  128  247:i2f             
    //  129  248:fcmpg           
    //  130  249:istore          11
    //  131  251:fconst_0        
    //  132  252:fstore          9
    //  133  254:iload           11
    //  134  256:ifge            146
    //  135  259:iload           10
    //  136  261:i2f             
    //  137  262:aload           4
    //  138  264:getfield        #198 <Field float RectF.right>
    //  139  267:fsub            
    //  140  268:fstore          9
    //  141  270:goto            146
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:iconst_1        
    //    3    3:invokevirtual   #203 <Method void setImageBitmapResetBase(Bitmap, boolean)>
    //    4    6:return          
    }

    protected Matrix getImageViewMatrix()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #48  <Field Matrix mDisplayMatrix>
    //    2    4:aload_0         
    //    3    5:getfield        #44  <Field Matrix mBaseMatrix>
    //    4    8:invokevirtual   #206 <Method void Matrix.set(Matrix)>
    //    5   11:aload_0         
    //    6   12:getfield        #48  <Field Matrix mDisplayMatrix>
    //    7   15:aload_0         
    //    8   16:getfield        #46  <Field Matrix mSuppMatrix>
    //    9   19:invokevirtual   #105 <Method boolean Matrix.postConcat(Matrix)>
    //   10   22:pop             
    //   11   23:aload_0         
    //   12   24:getfield        #48  <Field Matrix mDisplayMatrix>
    //   13   27:areturn         
    }

    protected float getScale()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #46  <Field Matrix mSuppMatrix>
    //    3    5:invokevirtual   #210 <Method float getScale(Matrix)>
    //    4    8:freturn         
    }

    protected float getScale(Matrix matrix)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #214 <Method float getValue(Matrix, int)>
    //    4    6:freturn         
    }

    protected float getValue(Matrix matrix, int i)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #50  <Field float[] mMatrixValues>
    //    3    5:invokevirtual   #218 <Method void Matrix.getValues(float[])>
    //    4    8:aload_0         
    //    5    9:getfield        #50  <Field float[] mMatrixValues>
    //    6   12:iload_2         
    //    7   13:faload          
    //    8   14:freturn         
    }

    protected float maxZoom()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //    2    4:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //    3    7:ifnonnull       12
    //    4   10:fconst_1        
    //    5   11:freturn         
    //    6   12:ldc1            #220 <Float 4F>
    //    7   14:aload_0         
    //    8   15:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //    9   18:invokevirtual   #84  <Method int RotateBitmap.getWidth()>
    //   10   21:i2f             
    //   11   22:aload_0         
    //   12   23:getfield        #59  <Field int mThisWidth>
    //   13   26:i2f             
    //   14   27:fdiv            
    //   15   28:aload_0         
    //   16   29:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   17   32:invokevirtual   #85  <Method int RotateBitmap.getHeight()>
    //   18   35:i2f             
    //   19   36:aload_0         
    //   20   37:getfield        #61  <Field int mThisHeight>
    //   21   40:i2f             
    //   22   41:fdiv            
    //   23   42:invokestatic    #223 <Method float Math.max(float, float)>
    //   24   45:fmul            
    //   25   46:freturn         
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:iconst_4        
    //    2    2:icmpne          21
    //    3    5:aload_0         
    //    4    6:invokevirtual   #227 <Method float getScale()>
    //    5    9:fconst_1        
    //    6   10:fcmpl           
    //    7   11:ifle            21
    //    8   14:aload_0         
    //    9   15:fconst_1        
    //   10   16:invokevirtual   #231 <Method void zoomTo(float)>
    //   11   19:iconst_1        
    //   12   20:ireturn         
    //   13   21:aload_0         
    //   14   22:iload_1         
    //   15   23:aload_2         
    //   16   24:invokespecial   #233 <Method boolean ImageView.onKeyDown(int, KeyEvent)>
    //   17   27:ireturn         
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:iload           5
    //    6    8:invokespecial   #237 <Method void ImageView.onLayout(boolean, int, int, int, int)>
    //    7   11:aload_0         
    //    8   12:iload_2         
    //    9   13:putfield        #239 <Field int mLeft>
    //   10   16:aload_0         
    //   11   17:iload           4
    //   12   19:putfield        #241 <Field int mRight>
    //   13   22:aload_0         
    //   14   23:iload_3         
    //   15   24:putfield        #243 <Field int mTop>
    //   16   27:aload_0         
    //   17   28:iload           5
    //   18   30:putfield        #245 <Field int mBottom>
    //   19   33:aload_0         
    //   20   34:iload           4
    //   21   36:iload_2         
    //   22   37:isub            
    //   23   38:putfield        #59  <Field int mThisWidth>
    //   24   41:aload_0         
    //   25   42:iload           5
    //   26   44:iload_3         
    //   27   45:isub            
    //   28   46:putfield        #61  <Field int mThisHeight>
    //   29   49:aload_0         
    //   30   50:getfield        #68  <Field Runnable mOnLayoutRunnable>
    //   31   53:astore          6
    //   32   55:aload           6
    //   33   57:ifnull          72
    //   34   60:aload_0         
    //   35   61:aconst_null     
    //   36   62:putfield        #68  <Field Runnable mOnLayoutRunnable>
    //   37   65:aload           6
    //   38   67:invokeinterface #250 <Method void Runnable.run()>
    //   39   72:aload_0         
    //   40   73:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   41   76:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   42   79:ifnull          102
    //   43   82:aload_0         
    //   44   83:aload_0         
    //   45   84:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //   46   87:aload_0         
    //   47   88:getfield        #44  <Field Matrix mBaseMatrix>
    //   48   91:invokespecial   #252 <Method void getProperBaseMatrix(RotateBitmap, Matrix)>
    //   49   94:aload_0         
    //   50   95:aload_0         
    //   51   96:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   52   99:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   53  102:return          
    }

    protected void panBy(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:invokevirtual   #188 <Method void postTranslate(float, float)>
    //    4    6:aload_0         
    //    5    7:aload_0         
    //    6    8:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //    7   11:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //    8   14:return          
    }

    protected void postTranslate(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field Matrix mSuppMatrix>
    //    2    4:fload_1         
    //    3    5:fload_2         
    //    4    6:invokevirtual   #112 <Method boolean Matrix.postTranslate(float, float)>
    //    5    9:pop             
    //    6   10:return          
    }

    public void setImageBitmap(Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:invokespecial   #255 <Method void setImageBitmap(Bitmap, int)>
    //    4    6:return          
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:new             #52  <Class RotateBitmap>
    //    2    4:dup             
    //    3    5:aload_1         
    //    4    6:invokespecial   #55  <Method void RotateBitmap(Bitmap)>
    //    5    9:iload_2         
    //    6   10:invokevirtual   #259 <Method void setImageRotateBitmapResetBase(RotateBitmap, boolean)>
    //    7   13:return          
    }

    public void setImageRotateBitmapResetBase(RotateBitmap rotatebitmap, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #80  <Method int getWidth()>
    //    2    4:ifgt            22
    //    3    7:aload_0         
    //    4    8:new             #261 <Class ImageViewTouchBase$1>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:iload_2         
    //    9   15:invokespecial   #264 <Method void ImageViewTouchBase$1(ImageViewTouchBase, RotateBitmap, boolean)>
    //   10   18:putfield        #68  <Field Runnable mOnLayoutRunnable>
    //   11   21:return          
    //   12   22:aload_1         
    //   13   23:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   14   26:ifnull          78
    //   15   29:aload_0         
    //   16   30:aload_1         
    //   17   31:aload_0         
    //   18   32:getfield        #44  <Field Matrix mBaseMatrix>
    //   19   35:invokespecial   #252 <Method void getProperBaseMatrix(RotateBitmap, Matrix)>
    //   20   38:aload_0         
    //   21   39:aload_1         
    //   22   40:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   23   43:aload_1         
    //   24   44:invokevirtual   #88  <Method int RotateBitmap.getRotation()>
    //   25   47:invokespecial   #255 <Method void setImageBitmap(Bitmap, int)>
    //   26   50:iload_2         
    //   27   51:ifeq            61
    //   28   54:aload_0         
    //   29   55:getfield        #46  <Field Matrix mSuppMatrix>
    //   30   58:invokevirtual   #91  <Method void Matrix.reset()>
    //   31   61:aload_0         
    //   32   62:aload_0         
    //   33   63:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   34   66:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   35   69:aload_0         
    //   36   70:aload_0         
    //   37   71:invokevirtual   #266 <Method float maxZoom()>
    //   38   74:putfield        #268 <Field float mMaxZoom>
    //   39   77:return          
    //   40   78:aload_0         
    //   41   79:getfield        #44  <Field Matrix mBaseMatrix>
    //   42   82:invokevirtual   #91  <Method void Matrix.reset()>
    //   43   85:aload_0         
    //   44   86:aconst_null     
    //   45   87:invokevirtual   #269 <Method void setImageBitmap(Bitmap)>
    //   46   90:goto            50
    }

    public void setRecycler(Recycler recycler)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #149 <Field ImageViewTouchBase$Recycler mRecycler>
    //    3    5:return          
    }

    protected void zoomIn()
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #7   <Float 1.25F>
    //    2    3:invokevirtual   #274 <Method void zoomIn(float)>
    //    3    6:return          
    }

    protected void zoomIn(float f)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #227 <Method float getScale()>
    //    2    4:aload_0         
    //    3    5:getfield        #268 <Field float mMaxZoom>
    //    4    8:fcmpl           
    //    5    9:iflt            13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //    9   17:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //   10   20:ifnull          12
    //   11   23:aload_0         
    //   12   24:invokevirtual   #80  <Method int getWidth()>
    //   13   27:i2f             
    //   14   28:fconst_2        
    //   15   29:fdiv            
    //   16   30:fstore_2        
    //   17   31:aload_0         
    //   18   32:invokevirtual   #83  <Method int getHeight()>
    //   19   35:i2f             
    //   20   36:fconst_2        
    //   21   37:fdiv            
    //   22   38:fstore_3        
    //   23   39:aload_0         
    //   24   40:getfield        #46  <Field Matrix mSuppMatrix>
    //   25   43:fload_1         
    //   26   44:fload_1         
    //   27   45:fload_2         
    //   28   46:fload_3         
    //   29   47:invokevirtual   #277 <Method boolean Matrix.postScale(float, float, float, float)>
    //   30   50:pop             
    //   31   51:aload_0         
    //   32   52:aload_0         
    //   33   53:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   34   56:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   35   59:return          
    }

    protected void zoomOut()
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #7   <Float 1.25F>
    //    2    3:invokevirtual   #280 <Method void zoomOut(float)>
    //    3    6:return          
    }

    protected void zoomOut(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field RotateBitmap mBitmapDisplayed>
    //    2    4:invokevirtual   #140 <Method Bitmap RotateBitmap.getBitmap()>
    //    3    7:ifnonnull       11
    //    4   10:return          
    //    5   11:aload_0         
    //    6   12:invokevirtual   #80  <Method int getWidth()>
    //    7   15:i2f             
    //    8   16:fconst_2        
    //    9   17:fdiv            
    //   10   18:fstore_2        
    //   11   19:aload_0         
    //   12   20:invokevirtual   #83  <Method int getHeight()>
    //   13   23:i2f             
    //   14   24:fconst_2        
    //   15   25:fdiv            
    //   16   26:fstore_3        
    //   17   27:new             #39  <Class Matrix>
    //   18   30:dup             
    //   19   31:aload_0         
    //   20   32:getfield        #46  <Field Matrix mSuppMatrix>
    //   21   35:invokespecial   #282 <Method void Matrix(Matrix)>
    //   22   38:astore          4
    //   23   40:aload           4
    //   24   42:fconst_1        
    //   25   43:fload_1         
    //   26   44:fdiv            
    //   27   45:fconst_1        
    //   28   46:fload_1         
    //   29   47:fdiv            
    //   30   48:fload_2         
    //   31   49:fload_3         
    //   32   50:invokevirtual   #277 <Method boolean Matrix.postScale(float, float, float, float)>
    //   33   53:pop             
    //   34   54:aload_0         
    //   35   55:aload           4
    //   36   57:invokevirtual   #210 <Method float getScale(Matrix)>
    //   37   60:fconst_1        
    //   38   61:fcmpg           
    //   39   62:ifge            91
    //   40   65:aload_0         
    //   41   66:getfield        #46  <Field Matrix mSuppMatrix>
    //   42   69:fconst_1        
    //   43   70:fconst_1        
    //   44   71:fload_2         
    //   45   72:fload_3         
    //   46   73:invokevirtual   #285 <Method void Matrix.setScale(float, float, float, float)>
    //   47   76:aload_0         
    //   48   77:aload_0         
    //   49   78:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   50   81:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   51   84:aload_0         
    //   52   85:iconst_1        
    //   53   86:iconst_1        
    //   54   87:invokevirtual   #287 <Method void center(boolean, boolean)>
    //   55   90:return          
    //   56   91:aload_0         
    //   57   92:getfield        #46  <Field Matrix mSuppMatrix>
    //   58   95:fconst_1        
    //   59   96:fload_1         
    //   60   97:fdiv            
    //   61   98:fconst_1        
    //   62   99:fload_1         
    //   63  100:fdiv            
    //   64  101:fload_2         
    //   65  102:fload_3         
    //   66  103:invokevirtual   #277 <Method boolean Matrix.postScale(float, float, float, float)>
    //   67  106:pop             
    //   68  107:goto            76
    }

    protected void zoomTo(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:aload_0         
    //    3    3:invokevirtual   #80  <Method int getWidth()>
    //    4    6:i2f             
    //    5    7:fconst_2        
    //    6    8:fdiv            
    //    7    9:aload_0         
    //    8   10:invokevirtual   #83  <Method int getHeight()>
    //    9   13:i2f             
    //   10   14:fconst_2        
    //   11   15:fdiv            
    //   12   16:invokevirtual   #290 <Method void zoomTo(float, float, float)>
    //   13   19:return          
    }

    protected void zoomTo(float f, float f1, float f2)
    {
    //    0    0:fload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #268 <Field float mMaxZoom>
    //    3    5:fcmpl           
    //    4    6:ifle            14
    //    5    9:aload_0         
    //    6   10:getfield        #268 <Field float mMaxZoom>
    //    7   13:fstore_1        
    //    8   14:fload_1         
    //    9   15:aload_0         
    //   10   16:invokevirtual   #227 <Method float getScale()>
    //   11   19:fdiv            
    //   12   20:fstore          4
    //   13   22:aload_0         
    //   14   23:getfield        #46  <Field Matrix mSuppMatrix>
    //   15   26:fload           4
    //   16   28:fload           4
    //   17   30:fload_2         
    //   18   31:fload_3         
    //   19   32:invokevirtual   #277 <Method boolean Matrix.postScale(float, float, float, float)>
    //   20   35:pop             
    //   21   36:aload_0         
    //   22   37:aload_0         
    //   23   38:invokevirtual   #159 <Method Matrix getImageViewMatrix()>
    //   24   41:invokevirtual   #192 <Method void setImageMatrix(Matrix)>
    //   25   44:aload_0         
    //   26   45:iconst_1        
    //   27   46:iconst_1        
    //   28   47:invokevirtual   #287 <Method void center(boolean, boolean)>
    //   29   50:return          
    }

    protected void zoomTo(float f, float f1, float f2, float f3)
    {
    //    0    0:fload_1         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #227 <Method float getScale()>
    //    3    5:fsub            
    //    4    6:fload           4
    //    5    8:fdiv            
    //    6    9:fstore          5
    //    7   11:aload_0         
    //    8   12:invokevirtual   #227 <Method float getScale()>
    //    9   15:fstore          6
    //   10   17:invokestatic    #296 <Method long System.currentTimeMillis()>
    //   11   20:lstore          7
    //   12   22:aload_0         
    //   13   23:getfield        #66  <Field Handler mHandler>
    //   14   26:new             #298 <Class ImageViewTouchBase$2>
    //   15   29:dup             
    //   16   30:aload_0         
    //   17   31:fload           4
    //   18   33:lload           7
    //   19   35:fload           6
    //   20   37:fload           5
    //   21   39:fload_2         
    //   22   40:fload_3         
    //   23   41:invokespecial   #301 <Method void ImageViewTouchBase$2(ImageViewTouchBase, float, long, float, float, float, float)>
    //   24   44:invokevirtual   #305 <Method boolean Handler.post(Runnable)>
    //   25   47:pop             
    //   26   48:return          
    }

    static final float SCALE_RATE = 1.25F;
    private static final String TAG = "ImageViewTouchBase";
    protected Matrix mBaseMatrix;
    protected final RotateBitmap mBitmapDisplayed;
    int mBottom;
    private final Matrix mDisplayMatrix;
    protected Handler mHandler;
    int mLeft;
    private final float mMatrixValues[];
    float mMaxZoom;
    private Runnable mOnLayoutRunnable;
    private Recycler mRecycler;
    int mRight;
    protected Matrix mSuppMatrix;
    int mThisHeight;
    int mThisWidth;
    int mTop;

    // Unreferenced inner class eu/janmuller/android/simplecropimage/ImageViewTouchBase$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field ImageViewTouchBase this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field RotateBitmap val$bitmap>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #25  <Field boolean val$resetSupp>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field ImageViewTouchBase this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #23  <Field RotateBitmap val$bitmap>
        //    4    8:aload_0         
        //    5    9:getfield        #25  <Field boolean val$resetSupp>
        //    6   12:invokevirtual   #30  <Method void ImageViewTouchBase.setImageRotateBitmapResetBase(RotateBitmap, boolean)>
        //    7   15:return          
        }

        final ImageViewTouchBase this$0;
        private final RotateBitmap val$bitmap;
        private final boolean val$resetSupp;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/ImageViewTouchBase$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #25  <Field ImageViewTouchBase this$0>
        //    3    5:aload_0         
        //    4    6:fload_2         
        //    5    7:putfield        #27  <Field float val$durationMs>
        //    6   10:aload_0         
        //    7   11:lload_3         
        //    8   12:putfield        #29  <Field long val$startTime>
        //    9   15:aload_0         
        //   10   16:fload           5
        //   11   18:putfield        #31  <Field float val$oldScale>
        //   12   21:aload_0         
        //   13   22:fload           6
        //   14   24:putfield        #33  <Field float val$incrementPerMs>
        //   15   27:aload_0         
        //   16   28:fload           7
        //   17   30:putfield        #35  <Field float val$centerX>
        //   18   33:aload_0         
        //   19   34:fload           8
        //   20   36:putfield        #37  <Field float val$centerY>
        //   21   39:aload_0         
        //   22   40:invokespecial   #40  <Method void Object()>
        //   23   43:return          
        }

        public void run()
        {
        //    0    0:invokestatic    #47  <Method long System.currentTimeMillis()>
        //    1    3:lstore_1        
        //    2    4:aload_0         
        //    3    5:getfield        #27  <Field float val$durationMs>
        //    4    8:lload_1         
        //    5    9:aload_0         
        //    6   10:getfield        #29  <Field long val$startTime>
        //    7   13:lsub            
        //    8   14:l2f             
        //    9   15:invokestatic    #53  <Method float Math.min(float, float)>
        //   10   18:fstore_3        
        //   11   19:aload_0         
        //   12   20:getfield        #31  <Field float val$oldScale>
        //   13   23:fload_3         
        //   14   24:aload_0         
        //   15   25:getfield        #33  <Field float val$incrementPerMs>
        //   16   28:fmul            
        //   17   29:fadd            
        //   18   30:fstore          4
        //   19   32:aload_0         
        //   20   33:getfield        #25  <Field ImageViewTouchBase this$0>
        //   21   36:fload           4
        //   22   38:aload_0         
        //   23   39:getfield        #35  <Field float val$centerX>
        //   24   42:aload_0         
        //   25   43:getfield        #37  <Field float val$centerY>
        //   26   46:invokevirtual   #56  <Method void ImageViewTouchBase.zoomTo(float, float, float)>
        //   27   49:fload_3         
        //   28   50:aload_0         
        //   29   51:getfield        #27  <Field float val$durationMs>
        //   30   54:fcmpg           
        //   31   55:ifge            70
        //   32   58:aload_0         
        //   33   59:getfield        #25  <Field ImageViewTouchBase this$0>
        //   34   62:getfield        #60  <Field Handler ImageViewTouchBase.mHandler>
        //   35   65:aload_0         
        //   36   66:invokevirtual   #66  <Method boolean Handler.post(Runnable)>
        //   37   69:pop             
        //   38   70:return          
        }

        final ImageViewTouchBase this$0;
        private final float val$centerX;
        private final float val$centerY;
        private final float val$durationMs;
        private final float val$incrementPerMs;
        private final float val$oldScale;
        private final long val$startTime;
    }

}
