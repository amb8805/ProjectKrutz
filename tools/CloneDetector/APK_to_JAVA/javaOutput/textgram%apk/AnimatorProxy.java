// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view.animation;

import android.graphics.*;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class AnimatorProxy extends Animation
{

    static 
    {
    //    0    0:getstatic       #39  <Field String android.os.Build$VERSION.SDK>
    //    1    3:invokestatic    #45  <Method Integer Integer.valueOf(String)>
    //    2    6:invokevirtual   #49  <Method int Integer.intValue()>
    //    3    9:bipush          11
    //    4   11:icmpge          31
    //    5   14:iconst_1        
    //    6   15:istore_0        
    //    7   16:iload_0         
    //    8   17:putstatic       #51  <Field boolean NEEDS_PROXY>
    //    9   20:new             #53  <Class WeakHashMap>
    //   10   23:dup             
    //   11   24:invokespecial   #56  <Method void WeakHashMap()>
    //   12   27:putstatic       #58  <Field WeakHashMap PROXIES>
    //   13   30:return          
    //   14   31:iconst_0        
    //   15   32:istore_0        
    //   16   33:goto            16
    }

    private AnimatorProxy(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #60  <Method void Animation()>
    //    2    4:aload_0         
    //    3    5:new             #62  <Class Camera>
    //    4    8:dup             
    //    5    9:invokespecial   #63  <Method void Camera()>
    //    6   12:putfield        #65  <Field Camera mCamera>
    //    7   15:aload_0         
    //    8   16:fconst_1        
    //    9   17:putfield        #67  <Field float mAlpha>
    //   10   20:aload_0         
    //   11   21:fconst_1        
    //   12   22:putfield        #69  <Field float mScaleX>
    //   13   25:aload_0         
    //   14   26:fconst_1        
    //   15   27:putfield        #71  <Field float mScaleY>
    //   16   30:aload_0         
    //   17   31:new             #73  <Class RectF>
    //   18   34:dup             
    //   19   35:invokespecial   #74  <Method void RectF()>
    //   20   38:putfield        #76  <Field RectF mBefore>
    //   21   41:aload_0         
    //   22   42:new             #73  <Class RectF>
    //   23   45:dup             
    //   24   46:invokespecial   #74  <Method void RectF()>
    //   25   49:putfield        #78  <Field RectF mAfter>
    //   26   52:aload_0         
    //   27   53:new             #80  <Class Matrix>
    //   28   56:dup             
    //   29   57:invokespecial   #81  <Method void Matrix()>
    //   30   60:putfield        #83  <Field Matrix mTempMatrix>
    //   31   63:aload_0         
    //   32   64:lconst_0        
    //   33   65:invokevirtual   #87  <Method void setDuration(long)>
    //   34   68:aload_0         
    //   35   69:iconst_1        
    //   36   70:invokevirtual   #91  <Method void setFillAfter(boolean)>
    //   37   73:aload_1         
    //   38   74:aload_0         
    //   39   75:invokevirtual   #97  <Method void View.setAnimation(Animation)>
    //   40   78:aload_0         
    //   41   79:new             #99  <Class WeakReference>
    //   42   82:dup             
    //   43   83:aload_1         
    //   44   84:invokespecial   #102 <Method void WeakReference(Object)>
    //   45   87:putfield        #104 <Field WeakReference mView>
    //   46   90:return          
    }

    private void computeRect(RectF rectf, View view)
    {
    //    0    0:aload_1         
    //    1    1:fconst_0        
    //    2    2:fconst_0        
    //    3    3:aload_2         
    //    4    4:invokevirtual   #109 <Method int View.getWidth()>
    //    5    7:i2f             
    //    6    8:aload_2         
    //    7    9:invokevirtual   #112 <Method int View.getHeight()>
    //    8   12:i2f             
    //    9   13:invokevirtual   #116 <Method void RectF.set(float, float, float, float)>
    //   10   16:aload_0         
    //   11   17:getfield        #83  <Field Matrix mTempMatrix>
    //   12   20:astore_3        
    //   13   21:aload_3         
    //   14   22:invokevirtual   #119 <Method void Matrix.reset()>
    //   15   25:aload_0         
    //   16   26:aload_3         
    //   17   27:aload_2         
    //   18   28:invokespecial   #123 <Method void transformMatrix(Matrix, View)>
    //   19   31:aload_0         
    //   20   32:getfield        #83  <Field Matrix mTempMatrix>
    //   21   35:aload_1         
    //   22   36:invokevirtual   #127 <Method boolean Matrix.mapRect(RectF)>
    //   23   39:pop             
    //   24   40:aload_1         
    //   25   41:aload_2         
    //   26   42:invokevirtual   #130 <Method int View.getLeft()>
    //   27   45:i2f             
    //   28   46:aload_2         
    //   29   47:invokevirtual   #133 <Method int View.getTop()>
    //   30   50:i2f             
    //   31   51:invokevirtual   #137 <Method void RectF.offset(float, float)>
    //   32   54:aload_1         
    //   33   55:getfield        #140 <Field float RectF.right>
    //   34   58:aload_1         
    //   35   59:getfield        #143 <Field float RectF.left>
    //   36   62:fcmpg           
    //   37   63:ifge            86
    //   38   66:aload_1         
    //   39   67:getfield        #140 <Field float RectF.right>
    //   40   70:fstore          6
    //   41   72:aload_1         
    //   42   73:aload_1         
    //   43   74:getfield        #143 <Field float RectF.left>
    //   44   77:putfield        #140 <Field float RectF.right>
    //   45   80:aload_1         
    //   46   81:fload           6
    //   47   83:putfield        #143 <Field float RectF.left>
    //   48   86:aload_1         
    //   49   87:getfield        #146 <Field float RectF.bottom>
    //   50   90:aload_1         
    //   51   91:getfield        #149 <Field float RectF.top>
    //   52   94:fcmpg           
    //   53   95:ifge            118
    //   54   98:aload_1         
    //   55   99:getfield        #149 <Field float RectF.top>
    //   56  102:fstore          5
    //   57  104:aload_1         
    //   58  105:aload_1         
    //   59  106:getfield        #146 <Field float RectF.bottom>
    //   60  109:putfield        #149 <Field float RectF.top>
    //   61  112:aload_1         
    //   62  113:fload           5
    //   63  115:putfield        #146 <Field float RectF.bottom>
    //   64  118:return          
    }

    private void invalidateAfterUpdate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          22
    //    7   15:aload_1         
    //    8   16:invokevirtual   #158 <Method android.view.ViewParent View.getParent()>
    //    9   19:ifnonnull       23
    //   10   22:return          
    //   11   23:aload_0         
    //   12   24:getfield        #78  <Field RectF mAfter>
    //   13   27:astore_2        
    //   14   28:aload_0         
    //   15   29:aload_2         
    //   16   30:aload_1         
    //   17   31:invokespecial   #160 <Method void computeRect(RectF, View)>
    //   18   34:aload_2         
    //   19   35:aload_0         
    //   20   36:getfield        #76  <Field RectF mBefore>
    //   21   39:invokevirtual   #164 <Method void RectF.union(RectF)>
    //   22   42:aload_1         
    //   23   43:invokevirtual   #158 <Method android.view.ViewParent View.getParent()>
    //   24   46:checkcast       #93  <Class View>
    //   25   49:aload_2         
    //   26   50:getfield        #143 <Field float RectF.left>
    //   27   53:f2d             
    //   28   54:invokestatic    #170 <Method double Math.floor(double)>
    //   29   57:d2i             
    //   30   58:aload_2         
    //   31   59:getfield        #149 <Field float RectF.top>
    //   32   62:f2d             
    //   33   63:invokestatic    #170 <Method double Math.floor(double)>
    //   34   66:d2i             
    //   35   67:aload_2         
    //   36   68:getfield        #140 <Field float RectF.right>
    //   37   71:f2d             
    //   38   72:invokestatic    #173 <Method double Math.ceil(double)>
    //   39   75:d2i             
    //   40   76:aload_2         
    //   41   77:getfield        #146 <Field float RectF.bottom>
    //   42   80:f2d             
    //   43   81:invokestatic    #173 <Method double Math.ceil(double)>
    //   44   84:d2i             
    //   45   85:invokevirtual   #177 <Method void View.invalidate(int, int, int, int)>
    //   46   88:return          
    }

    private void prepareForUpdate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          24
    //    7   15:aload_0         
    //    8   16:aload_0         
    //    9   17:getfield        #76  <Field RectF mBefore>
    //   10   20:aload_1         
    //   11   21:invokespecial   #160 <Method void computeRect(RectF, View)>
    //   12   24:return          
    }

    private void transformMatrix(Matrix matrix, View view)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #109 <Method int View.getWidth()>
    //    2    4:i2f             
    //    3    5:fstore_3        
    //    4    6:aload_2         
    //    5    7:invokevirtual   #112 <Method int View.getHeight()>
    //    6   10:i2f             
    //    7   11:fstore          4
    //    8   13:aload_0         
    //    9   14:getfield        #180 <Field boolean mHasPivot>
    //   10   17:istore          5
    //   11   19:iload           5
    //   12   21:ifeq            225
    //   13   24:aload_0         
    //   14   25:getfield        #182 <Field float mPivotX>
    //   15   28:fstore          6
    //   16   30:iload           5
    //   17   32:ifeq            233
    //   18   35:aload_0         
    //   19   36:getfield        #184 <Field float mPivotY>
    //   20   39:fstore          7
    //   21   41:aload_0         
    //   22   42:getfield        #186 <Field float mRotationX>
    //   23   45:fstore          8
    //   24   47:aload_0         
    //   25   48:getfield        #188 <Field float mRotationY>
    //   26   51:fstore          9
    //   27   53:aload_0         
    //   28   54:getfield        #190 <Field float mRotationZ>
    //   29   57:fstore          10
    //   30   59:fload           8
    //   31   61:fconst_0        
    //   32   62:fcmpl           
    //   33   63:ifne            80
    //   34   66:fload           9
    //   35   68:fconst_0        
    //   36   69:fcmpl           
    //   37   70:ifne            80
    //   38   73:fload           10
    //   39   75:fconst_0        
    //   40   76:fcmpl           
    //   41   77:ifeq            144
    //   42   80:aload_0         
    //   43   81:getfield        #65  <Field Camera mCamera>
    //   44   84:astore          11
    //   45   86:aload           11
    //   46   88:invokevirtual   #193 <Method void Camera.save()>
    //   47   91:aload           11
    //   48   93:fload           8
    //   49   95:invokevirtual   #197 <Method void Camera.rotateX(float)>
    //   50   98:aload           11
    //   51  100:fload           9
    //   52  102:invokevirtual   #200 <Method void Camera.rotateY(float)>
    //   53  105:aload           11
    //   54  107:fload           10
    //   55  109:fneg            
    //   56  110:invokevirtual   #203 <Method void Camera.rotateZ(float)>
    //   57  113:aload           11
    //   58  115:aload_1         
    //   59  116:invokevirtual   #207 <Method void Camera.getMatrix(Matrix)>
    //   60  119:aload           11
    //   61  121:invokevirtual   #210 <Method void Camera.restore()>
    //   62  124:aload_1         
    //   63  125:fload           6
    //   64  127:fneg            
    //   65  128:fload           7
    //   66  130:fneg            
    //   67  131:invokevirtual   #214 <Method boolean Matrix.preTranslate(float, float)>
    //   68  134:pop             
    //   69  135:aload_1         
    //   70  136:fload           6
    //   71  138:fload           7
    //   72  140:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
    //   73  143:pop             
    //   74  144:aload_0         
    //   75  145:getfield        #69  <Field float mScaleX>
    //   76  148:fstore          14
    //   77  150:aload_0         
    //   78  151:getfield        #71  <Field float mScaleY>
    //   79  154:fstore          15
    //   80  156:fload           14
    //   81  158:fconst_1        
    //   82  159:fcmpl           
    //   83  160:ifne            170
    //   84  163:fload           15
    //   85  165:fconst_1        
    //   86  166:fcmpl           
    //   87  167:ifeq            211
    //   88  170:aload_1         
    //   89  171:fload           14
    //   90  173:fload           15
    //   91  175:invokevirtual   #220 <Method boolean Matrix.postScale(float, float)>
    //   92  178:pop             
    //   93  179:aload_1         
    //   94  180:fload           6
    //   95  182:fload_3         
    //   96  183:fdiv            
    //   97  184:fneg            
    //   98  185:fload           14
    //   99  187:fload_3         
    //  100  188:fmul            
    //  101  189:fload_3         
    //  102  190:fsub            
    //  103  191:fmul            
    //  104  192:fload           7
    //  105  194:fload           4
    //  106  196:fdiv            
    //  107  197:fneg            
    //  108  198:fload           15
    //  109  200:fload           4
    //  110  202:fmul            
    //  111  203:fload           4
    //  112  205:fsub            
    //  113  206:fmul            
    //  114  207:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
    //  115  210:pop             
    //  116  211:aload_1         
    //  117  212:aload_0         
    //  118  213:getfield        #222 <Field float mTranslationX>
    //  119  216:aload_0         
    //  120  217:getfield        #224 <Field float mTranslationY>
    //  121  220:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
    //  122  223:pop             
    //  123  224:return          
    //  124  225:fload_3         
    //  125  226:fconst_2        
    //  126  227:fdiv            
    //  127  228:fstore          6
    //  128  230:goto            30
    //  129  233:fload           4
    //  130  235:fconst_2        
    //  131  236:fdiv            
    //  132  237:fstore          7
    //  133  239:goto            41
    }

    public static AnimatorProxy wrap(View view)
    {
    //    0    0:getstatic       #58  <Field WeakHashMap PROXIES>
    //    1    3:aload_0         
    //    2    4:invokevirtual   #229 <Method Object WeakHashMap.get(Object)>
    //    3    7:checkcast       #2   <Class AnimatorProxy>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          23
    //    7   15:aload_1         
    //    8   16:aload_0         
    //    9   17:invokevirtual   #233 <Method Animation View.getAnimation()>
    //   10   20:if_acmpeq       41
    //   11   23:new             #2   <Class AnimatorProxy>
    //   12   26:dup             
    //   13   27:aload_0         
    //   14   28:invokespecial   #235 <Method void AnimatorProxy(View)>
    //   15   31:astore_1        
    //   16   32:getstatic       #58  <Field WeakHashMap PROXIES>
    //   17   35:aload_0         
    //   18   36:aload_1         
    //   19   37:invokevirtual   #239 <Method Object WeakHashMap.put(Object, Object)>
    //   20   40:pop             
    //   21   41:aload_1         
    //   22   42:areturn         
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_3        
    //    5   11:aload_3         
    //    6   12:ifnull          32
    //    7   15:aload_2         
    //    8   16:aload_0         
    //    9   17:getfield        #67  <Field float mAlpha>
    //   10   20:invokevirtual   #246 <Method void Transformation.setAlpha(float)>
    //   11   23:aload_0         
    //   12   24:aload_2         
    //   13   25:invokevirtual   #249 <Method Matrix Transformation.getMatrix()>
    //   14   28:aload_3         
    //   15   29:invokespecial   #123 <Method void transformMatrix(Matrix, View)>
    //   16   32:return          
    }

    public float getAlpha()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field float mAlpha>
    //    2    4:freturn         
    }

    public float getPivotX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #182 <Field float mPivotX>
    //    2    4:freturn         
    }

    public float getPivotY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #184 <Field float mPivotY>
    //    2    4:freturn         
    }

    public float getRotation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #190 <Field float mRotationZ>
    //    2    4:freturn         
    }

    public float getRotationX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #186 <Field float mRotationX>
    //    2    4:freturn         
    }

    public float getRotationY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #188 <Field float mRotationY>
    //    2    4:freturn         
    }

    public float getScaleX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field float mScaleX>
    //    2    4:freturn         
    }

    public float getScaleY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field float mScaleY>
    //    2    4:freturn         
    }

    public int getScrollX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       17
    //    7   15:iconst_0        
    //    8   16:ireturn         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #261 <Method int View.getScrollX()>
    //   11   21:ireturn         
    }

    public int getScrollY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       17
    //    7   15:iconst_0        
    //    8   16:ireturn         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #264 <Method int View.getScrollY()>
    //   11   21:ireturn         
    }

    public float getTranslationX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #222 <Field float mTranslationX>
    //    2    4:freturn         
    }

    public float getTranslationY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #224 <Field float mTranslationY>
    //    2    4:freturn         
    }

    public float getX()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       17
    //    7   15:fconst_0        
    //    8   16:freturn         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #130 <Method int View.getLeft()>
    //   11   21:i2f             
    //   12   22:aload_0         
    //   13   23:getfield        #222 <Field float mTranslationX>
    //   14   26:fadd            
    //   15   27:freturn         
    }

    public float getY()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       17
    //    7   15:fconst_0        
    //    8   16:freturn         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #133 <Method int View.getTop()>
    //   11   21:i2f             
    //   12   22:aload_0         
    //   13   23:getfield        #224 <Field float mTranslationY>
    //   14   26:fadd            
    //   15   27:freturn         
    }

    public void setAlpha(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field float mAlpha>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            33
    //    5    9:aload_0         
    //    6   10:fload_1         
    //    7   11:putfield        #67  <Field float mAlpha>
    //    8   14:aload_0         
    //    9   15:getfield        #104 <Field WeakReference mView>
    //   10   18:invokevirtual   #154 <Method Object WeakReference.get()>
    //   11   21:checkcast       #93  <Class View>
    //   12   24:astore_2        
    //   13   25:aload_2         
    //   14   26:ifnull          33
    //   15   29:aload_2         
    //   16   30:invokevirtual   #270 <Method void View.invalidate()>
    //   17   33:return          
    }

    public void setPivotX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #180 <Field boolean mHasPivot>
    //    2    4:ifeq            16
    //    3    7:aload_0         
    //    4    8:getfield        #182 <Field float mPivotX>
    //    5   11:fload_1         
    //    6   12:fcmpl           
    //    7   13:ifeq            34
    //    8   16:aload_0         
    //    9   17:invokespecial   #273 <Method void prepareForUpdate()>
    //   10   20:aload_0         
    //   11   21:iconst_1        
    //   12   22:putfield        #180 <Field boolean mHasPivot>
    //   13   25:aload_0         
    //   14   26:fload_1         
    //   15   27:putfield        #182 <Field float mPivotX>
    //   16   30:aload_0         
    //   17   31:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   18   34:return          
    }

    public void setPivotY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #180 <Field boolean mHasPivot>
    //    2    4:ifeq            16
    //    3    7:aload_0         
    //    4    8:getfield        #184 <Field float mPivotY>
    //    5   11:fload_1         
    //    6   12:fcmpl           
    //    7   13:ifeq            34
    //    8   16:aload_0         
    //    9   17:invokespecial   #273 <Method void prepareForUpdate()>
    //   10   20:aload_0         
    //   11   21:iconst_1        
    //   12   22:putfield        #180 <Field boolean mHasPivot>
    //   13   25:aload_0         
    //   14   26:fload_1         
    //   15   27:putfield        #184 <Field float mPivotY>
    //   16   30:aload_0         
    //   17   31:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   18   34:return          
    }

    public void setRotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #190 <Field float mRotationZ>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #190 <Field float mRotationZ>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setRotationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #186 <Field float mRotationX>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #186 <Field float mRotationX>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setRotationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #188 <Field float mRotationY>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #188 <Field float mRotationY>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setScaleX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field float mScaleX>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #69  <Field float mScaleX>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setScaleY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field float mScaleY>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #71  <Field float mScaleY>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setScrollX(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          24
    //    7   15:aload_2         
    //    8   16:iload_1         
    //    9   17:aload_2         
    //   10   18:invokevirtual   #264 <Method int View.getScrollY()>
    //   11   21:invokevirtual   #287 <Method void View.scrollTo(int, int)>
    //   12   24:return          
    }

    public void setScrollY(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          24
    //    7   15:aload_2         
    //    8   16:aload_2         
    //    9   17:invokevirtual   #261 <Method int View.getScrollX()>
    //   10   20:iload_1         
    //   11   21:invokevirtual   #287 <Method void View.scrollTo(int, int)>
    //   12   24:return          
    }

    public void setTranslationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #222 <Field float mTranslationX>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #222 <Field float mTranslationX>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setTranslationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #224 <Field float mTranslationY>
    //    2    4:fload_1         
    //    3    5:fcmpl           
    //    4    6:ifeq            22
    //    5    9:aload_0         
    //    6   10:invokespecial   #273 <Method void prepareForUpdate()>
    //    7   13:aload_0         
    //    8   14:fload_1         
    //    9   15:putfield        #224 <Field float mTranslationY>
    //   10   18:aload_0         
    //   11   19:invokespecial   #275 <Method void invalidateAfterUpdate()>
    //   12   22:return          
    }

    public void setX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          26
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:aload_2         
    //   10   18:invokevirtual   #130 <Method int View.getLeft()>
    //   11   21:i2f             
    //   12   22:fsub            
    //   13   23:invokevirtual   #293 <Method void setTranslationX(float)>
    //   14   26:return          
    }

    public void setY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #104 <Field WeakReference mView>
    //    2    4:invokevirtual   #154 <Method Object WeakReference.get()>
    //    3    7:checkcast       #93  <Class View>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          26
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:aload_2         
    //   10   18:invokevirtual   #133 <Method int View.getTop()>
    //   11   21:i2f             
    //   12   22:fsub            
    //   13   23:invokevirtual   #296 <Method void setTranslationY(float)>
    //   14   26:return          
    }

    public static final boolean NEEDS_PROXY;
    private static final WeakHashMap PROXIES;
    private final RectF mAfter;
    private float mAlpha;
    private final RectF mBefore;
    private final Camera mCamera;
    private boolean mHasPivot;
    private float mPivotX;
    private float mPivotY;
    private float mRotationX;
    private float mRotationY;
    private float mRotationZ;
    private float mScaleX;
    private float mScaleY;
    private final Matrix mTempMatrix;
    private float mTranslationX;
    private float mTranslationY;
    private final WeakReference mView;
}
