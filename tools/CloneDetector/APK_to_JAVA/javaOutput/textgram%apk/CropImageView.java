// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            ImageViewTouchBase, HighlightView, RotateBitmap, CropImage

class CropImageView extends ImageViewTouchBase
{

    public CropImageView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #20  <Method void ImageViewTouchBase(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #22  <Class ArrayList>
    //    6   10:dup             
    //    7   11:invokespecial   #25  <Method void ArrayList()>
    //    8   14:putfield        #27  <Field ArrayList mHighlightViews>
    //    9   17:aload_0         
    //   10   18:aconst_null     
    //   11   19:putfield        #29  <Field HighlightView mMotionHighlightView>
    //   12   22:aload_0         
    //   13   23:aload_1         
    //   14   24:putfield        #31  <Field Context mContext>
    //   15   27:return          
    }

    private void centerBasedOnHighlightView(HighlightView highlightview)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #39  <Field Rect HighlightView.mDrawRect>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:invokevirtual   #45  <Method int Rect.width()>
    //    5    9:i2f             
    //    6   10:fstore_3        
    //    7   11:aload_2         
    //    8   12:invokevirtual   #48  <Method int Rect.height()>
    //    9   15:i2f             
    //   10   16:fstore          4
    //   11   18:aload_0         
    //   12   19:invokevirtual   #51  <Method int getWidth()>
    //   13   22:i2f             
    //   14   23:fstore          5
    //   15   25:aload_0         
    //   16   26:invokevirtual   #54  <Method int getHeight()>
    //   17   29:i2f             
    //   18   30:fstore          6
    //   19   32:fconst_1        
    //   20   33:ldc1            #55  <Float 0.6F>
    //   21   35:fload           5
    //   22   37:fload_3         
    //   23   38:fdiv            
    //   24   39:fmul            
    //   25   40:ldc1            #55  <Float 0.6F>
    //   26   42:fload           6
    //   27   44:fload           4
    //   28   46:fdiv            
    //   29   47:fmul            
    //   30   48:invokestatic    #61  <Method float Math.min(float, float)>
    //   31   51:aload_0         
    //   32   52:invokevirtual   #65  <Method float getScale()>
    //   33   55:fmul            
    //   34   56:invokestatic    #68  <Method float Math.max(float, float)>
    //   35   59:fstore          7
    //   36   61:fload           7
    //   37   63:aload_0         
    //   38   64:invokevirtual   #65  <Method float getScale()>
    //   39   67:fsub            
    //   40   68:invokestatic    #72  <Method float Math.abs(float)>
    //   41   71:fload           7
    //   42   73:fdiv            
    //   43   74:f2d             
    //   44   75:ldc2w           #73  <Double 0.10000000000000001D>
    //   45   78:dcmpl           
    //   46   79:ifle            134
    //   47   82:iconst_2        
    //   48   83:newarray        float[]
    //   49   85:astore          8
    //   50   87:aload           8
    //   51   89:iconst_0        
    //   52   90:aload_1         
    //   53   91:getfield        #78  <Field RectF HighlightView.mCropRect>
    //   54   94:invokevirtual   #83  <Method float RectF.centerX()>
    //   55   97:fastore         
    //   56   98:aload           8
    //   57  100:iconst_1        
    //   58  101:aload_1         
    //   59  102:getfield        #78  <Field RectF HighlightView.mCropRect>
    //   60  105:invokevirtual   #86  <Method float RectF.centerY()>
    //   61  108:fastore         
    //   62  109:aload_0         
    //   63  110:invokevirtual   #90  <Method Matrix getImageMatrix()>
    //   64  113:aload           8
    //   65  115:invokevirtual   #96  <Method void Matrix.mapPoints(float[])>
    //   66  118:aload_0         
    //   67  119:fload           7
    //   68  121:aload           8
    //   69  123:iconst_0        
    //   70  124:faload          
    //   71  125:aload           8
    //   72  127:iconst_1        
    //   73  128:faload          
    //   74  129:ldc1            #97  <Float 300F>
    //   75  131:invokevirtual   #101 <Method void zoomTo(float, float, float, float)>
    //   76  134:aload_0         
    //   77  135:aload_1         
    //   78  136:invokespecial   #104 <Method void ensureVisible(HighlightView)>
    //   79  139:return          
    }

    private void ensureVisible(HighlightView highlightview)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #39  <Field Rect HighlightView.mDrawRect>
    //    2    4:astore_2        
    //    3    5:iconst_0        
    //    4    6:aload_0         
    //    5    7:getfield        #107 <Field int mLeft>
    //    6   10:aload_2         
    //    7   11:getfield        #110 <Field int Rect.left>
    //    8   14:isub            
    //    9   15:invokestatic    #113 <Method int Math.max(int, int)>
    //   10   18:istore_3        
    //   11   19:iconst_0        
    //   12   20:aload_0         
    //   13   21:getfield        #116 <Field int mRight>
    //   14   24:aload_2         
    //   15   25:getfield        #119 <Field int Rect.right>
    //   16   28:isub            
    //   17   29:invokestatic    #121 <Method int Math.min(int, int)>
    //   18   32:istore          4
    //   19   34:iconst_0        
    //   20   35:aload_0         
    //   21   36:getfield        #124 <Field int mTop>
    //   22   39:aload_2         
    //   23   40:getfield        #127 <Field int Rect.top>
    //   24   43:isub            
    //   25   44:invokestatic    #113 <Method int Math.max(int, int)>
    //   26   47:istore          5
    //   27   49:iconst_0        
    //   28   50:aload_0         
    //   29   51:getfield        #130 <Field int mBottom>
    //   30   54:aload_2         
    //   31   55:getfield        #133 <Field int Rect.bottom>
    //   32   58:isub            
    //   33   59:invokestatic    #121 <Method int Math.min(int, int)>
    //   34   62:istore          6
    //   35   64:iload_3         
    //   36   65:ifeq            101
    //   37   68:iload_3         
    //   38   69:istore          7
    //   39   71:iload           5
    //   40   73:ifeq            108
    //   41   76:iload           5
    //   42   78:istore          8
    //   43   80:iload           7
    //   44   82:ifne            90
    //   45   85:iload           8
    //   46   87:ifeq            100
    //   47   90:aload_0         
    //   48   91:iload           7
    //   49   93:i2f             
    //   50   94:iload           8
    //   51   96:i2f             
    //   52   97:invokevirtual   #137 <Method void panBy(float, float)>
    //   53  100:return          
    //   54  101:iload           4
    //   55  103:istore          7
    //   56  105:goto            71
    //   57  108:iload           6
    //   58  110:istore          8
    //   59  112:goto            80
    }

    private void recomputeFocus(MotionEvent motionevent)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:getfield        #27  <Field ArrayList mHighlightViews>
    //    5    7:invokevirtual   #142 <Method int ArrayList.size()>
    //    6   10:icmplt          33
    //    7   13:iconst_0        
    //    8   14:istore          4
    //    9   16:iload           4
    //   10   18:aload_0         
    //   11   19:getfield        #27  <Field ArrayList mHighlightViews>
    //   12   22:invokevirtual   #142 <Method int ArrayList.size()>
    //   13   25:icmplt          60
    //   14   28:aload_0         
    //   15   29:invokevirtual   #145 <Method void invalidate()>
    //   16   32:return          
    //   17   33:aload_0         
    //   18   34:getfield        #27  <Field ArrayList mHighlightViews>
    //   19   37:iload_2         
    //   20   38:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   21   41:checkcast       #35  <Class HighlightView>
    //   22   44:astore_3        
    //   23   45:aload_3         
    //   24   46:iconst_0        
    //   25   47:invokevirtual   #153 <Method void HighlightView.setFocus(boolean)>
    //   26   50:aload_3         
    //   27   51:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   28   54:iinc            2  1
    //   29   57:goto            2
    //   30   60:aload_0         
    //   31   61:getfield        #27  <Field ArrayList mHighlightViews>
    //   32   64:iload           4
    //   33   66:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   34   69:checkcast       #35  <Class HighlightView>
    //   35   72:astore          5
    //   36   74:aload           5
    //   37   76:aload_1         
    //   38   77:invokevirtual   #159 <Method float MotionEvent.getX()>
    //   39   80:aload_1         
    //   40   81:invokevirtual   #162 <Method float MotionEvent.getY()>
    //   41   84:invokevirtual   #166 <Method int HighlightView.getHit(float, float)>
    //   42   87:iconst_1        
    //   43   88:icmpeq          113
    //   44   91:aload           5
    //   45   93:invokevirtual   #170 <Method boolean HighlightView.hasFocus()>
    //   46   96:ifne            28
    //   47   99:aload           5
    //   48  101:iconst_1        
    //   49  102:invokevirtual   #153 <Method void HighlightView.setFocus(boolean)>
    //   50  105:aload           5
    //   51  107:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   52  110:goto            28
    //   53  113:iinc            4  1
    //   54  116:goto            16
    }

    public void add(HighlightView highlightview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field ArrayList mHighlightViews>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #174 <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:invokevirtual   #145 <Method void invalidate()>
    //    7   13:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #178 <Method void ImageViewTouchBase.onDraw(Canvas)>
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:aload_0         
    //    7    9:getfield        #27  <Field ArrayList mHighlightViews>
    //    8   12:invokevirtual   #142 <Method int ArrayList.size()>
    //    9   15:icmplt          19
    //   10   18:return          
    //   11   19:aload_0         
    //   12   20:getfield        #27  <Field ArrayList mHighlightViews>
    //   13   23:iload_2         
    //   14   24:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   15   27:checkcast       #35  <Class HighlightView>
    //   16   30:aload_1         
    //   17   31:invokevirtual   #181 <Method void HighlightView.draw(Canvas)>
    //   18   34:iinc            2  1
    //   19   37:goto            7
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:iload           5
    //    6    8:invokespecial   #185 <Method void ImageViewTouchBase.onLayout(boolean, int, int, int, int)>
    //    7   11:aload_0         
    //    8   12:getfield        #189 <Field RotateBitmap mBitmapDisplayed>
    //    9   15:invokevirtual   #195 <Method android.graphics.Bitmap RotateBitmap.getBitmap()>
    //   10   18:ifnull          40
    //   11   21:aload_0         
    //   12   22:getfield        #27  <Field ArrayList mHighlightViews>
    //   13   25:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
    //   14   28:astore          6
    //   15   30:aload           6
    //   16   32:invokeinterface #204 <Method boolean Iterator.hasNext()>
    //   17   37:ifne            41
    //   18   40:return          
    //   19   41:aload           6
    //   20   43:invokeinterface #208 <Method Object Iterator.next()>
    //   21   48:checkcast       #35  <Class HighlightView>
    //   22   51:astore          7
    //   23   53:aload           7
    //   24   55:getfield        #212 <Field Matrix HighlightView.mMatrix>
    //   25   58:aload_0         
    //   26   59:invokevirtual   #90  <Method Matrix getImageMatrix()>
    //   27   62:invokevirtual   #216 <Method void Matrix.set(Matrix)>
    //   28   65:aload           7
    //   29   67:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   30   70:aload           7
    //   31   72:getfield        #220 <Field boolean HighlightView.mIsFocused>
    //   32   75:ifeq            30
    //   33   78:aload_0         
    //   34   79:aload           7
    //   35   81:invokespecial   #222 <Method void centerBasedOnHighlightView(HighlightView)>
    //   36   84:goto            30
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field Context mContext>
    //    2    4:checkcast       #226 <Class CropImage>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:getfield        #229 <Field boolean CropImage.mSaving>
    //    6   12:ifeq            17
    //    7   15:iconst_0        
    //    8   16:ireturn         
    //    9   17:aload_1         
    //   10   18:invokevirtual   #232 <Method int MotionEvent.getAction()>
    //   11   21:tableswitch     0 2: default 48
    //                   0 78
    //                   1 213
    //                   2 367
    //   12   48:aload_1         
    //   13   49:invokevirtual   #232 <Method int MotionEvent.getAction()>
    //   14   52:tableswitch     1 2: default 76
    //                   1 445
    //                   2 454
    //   15   76:iconst_1        
    //   16   77:ireturn         
    //   17   78:aload_2         
    //   18   79:getfield        #235 <Field boolean CropImage.mWaitingToPick>
    //   19   82:ifeq            93
    //   20   85:aload_0         
    //   21   86:aload_1         
    //   22   87:invokespecial   #237 <Method void recomputeFocus(MotionEvent)>
    //   23   90:goto            48
    //   24   93:iconst_0        
    //   25   94:istore          6
    //   26   96:iload           6
    //   27   98:aload_0         
    //   28   99:getfield        #27  <Field ArrayList mHighlightViews>
    //   29  102:invokevirtual   #142 <Method int ArrayList.size()>
    //   30  105:icmpge          48
    //   31  108:aload_0         
    //   32  109:getfield        #27  <Field ArrayList mHighlightViews>
    //   33  112:iload           6
    //   34  114:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   35  117:checkcast       #35  <Class HighlightView>
    //   36  120:astore          7
    //   37  122:aload           7
    //   38  124:aload_1         
    //   39  125:invokevirtual   #159 <Method float MotionEvent.getX()>
    //   40  128:aload_1         
    //   41  129:invokevirtual   #162 <Method float MotionEvent.getY()>
    //   42  132:invokevirtual   #166 <Method int HighlightView.getHit(float, float)>
    //   43  135:istore          8
    //   44  137:iload           8
    //   45  139:iconst_1        
    //   46  140:icmpeq          207
    //   47  143:aload_0         
    //   48  144:iload           8
    //   49  146:putfield        #239 <Field int mMotionEdge>
    //   50  149:aload_0         
    //   51  150:aload           7
    //   52  152:putfield        #29  <Field HighlightView mMotionHighlightView>
    //   53  155:aload_0         
    //   54  156:aload_1         
    //   55  157:invokevirtual   #159 <Method float MotionEvent.getX()>
    //   56  160:putfield        #241 <Field float mLastX>
    //   57  163:aload_0         
    //   58  164:aload_1         
    //   59  165:invokevirtual   #162 <Method float MotionEvent.getY()>
    //   60  168:putfield        #243 <Field float mLastY>
    //   61  171:aload_0         
    //   62  172:getfield        #29  <Field HighlightView mMotionHighlightView>
    //   63  175:astore          9
    //   64  177:iload           8
    //   65  179:bipush          32
    //   66  181:icmpne          199
    //   67  184:getstatic       #249 <Field HighlightView$ModifyMode HighlightView$ModifyMode.Move>
    //   68  187:astore          10
    //   69  189:aload           9
    //   70  191:aload           10
    //   71  193:invokevirtual   #253 <Method void HighlightView.setMode(HighlightView$ModifyMode)>
    //   72  196:goto            48
    //   73  199:getstatic       #256 <Field HighlightView$ModifyMode HighlightView$ModifyMode.Grow>
    //   74  202:astore          10
    //   75  204:goto            189
    //   76  207:iinc            6  1
    //   77  210:goto            96
    //   78  213:aload_2         
    //   79  214:getfield        #235 <Field boolean CropImage.mWaitingToPick>
    //   80  217:ifeq            339
    //   81  220:iconst_0        
    //   82  221:istore_3        
    //   83  222:iload_3         
    //   84  223:aload_0         
    //   85  224:getfield        #27  <Field ArrayList mHighlightViews>
    //   86  227:invokevirtual   #142 <Method int ArrayList.size()>
    //   87  230:icmplt          241
    //   88  233:aload_0         
    //   89  234:aconst_null     
    //   90  235:putfield        #29  <Field HighlightView mMotionHighlightView>
    //   91  238:goto            48
    //   92  241:aload_0         
    //   93  242:getfield        #27  <Field ArrayList mHighlightViews>
    //   94  245:iload_3         
    //   95  246:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   96  249:checkcast       #35  <Class HighlightView>
    //   97  252:astore          4
    //   98  254:aload           4
    //   99  256:invokevirtual   #170 <Method boolean HighlightView.hasFocus()>
    //  100  259:ifeq            333
    //  101  262:aload_2         
    //  102  263:aload           4
    //  103  265:putfield        #259 <Field HighlightView CropImage.mCrop>
    //  104  268:iconst_0        
    //  105  269:istore          5
    //  106  271:iload           5
    //  107  273:aload_0         
    //  108  274:getfield        #27  <Field ArrayList mHighlightViews>
    //  109  277:invokevirtual   #142 <Method int ArrayList.size()>
    //  110  280:icmplt          302
    //  111  283:aload_0         
    //  112  284:aload           4
    //  113  286:invokespecial   #222 <Method void centerBasedOnHighlightView(HighlightView)>
    //  114  289:aload_0         
    //  115  290:getfield        #31  <Field Context mContext>
    //  116  293:checkcast       #226 <Class CropImage>
    //  117  296:iconst_0        
    //  118  297:putfield        #235 <Field boolean CropImage.mWaitingToPick>
    //  119  300:iconst_1        
    //  120  301:ireturn         
    //  121  302:iload           5
    //  122  304:iload_3         
    //  123  305:icmpne          314
    //  124  308:iinc            5  1
    //  125  311:goto            271
    //  126  314:aload_0         
    //  127  315:getfield        #27  <Field ArrayList mHighlightViews>
    //  128  318:iload           5
    //  129  320:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //  130  323:checkcast       #35  <Class HighlightView>
    //  131  326:iconst_1        
    //  132  327:invokevirtual   #262 <Method void HighlightView.setHidden(boolean)>
    //  133  330:goto            308
    //  134  333:iinc            3  1
    //  135  336:goto            222
    //  136  339:aload_0         
    //  137  340:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  138  343:ifnull          233
    //  139  346:aload_0         
    //  140  347:aload_0         
    //  141  348:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  142  351:invokespecial   #222 <Method void centerBasedOnHighlightView(HighlightView)>
    //  143  354:aload_0         
    //  144  355:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  145  358:getstatic       #265 <Field HighlightView$ModifyMode HighlightView$ModifyMode.None>
    //  146  361:invokevirtual   #253 <Method void HighlightView.setMode(HighlightView$ModifyMode)>
    //  147  364:goto            233
    //  148  367:aload_2         
    //  149  368:getfield        #235 <Field boolean CropImage.mWaitingToPick>
    //  150  371:ifeq            382
    //  151  374:aload_0         
    //  152  375:aload_1         
    //  153  376:invokespecial   #237 <Method void recomputeFocus(MotionEvent)>
    //  154  379:goto            48
    //  155  382:aload_0         
    //  156  383:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  157  386:ifnull          48
    //  158  389:aload_0         
    //  159  390:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  160  393:aload_0         
    //  161  394:getfield        #239 <Field int mMotionEdge>
    //  162  397:aload_1         
    //  163  398:invokevirtual   #159 <Method float MotionEvent.getX()>
    //  164  401:aload_0         
    //  165  402:getfield        #241 <Field float mLastX>
    //  166  405:fsub            
    //  167  406:aload_1         
    //  168  407:invokevirtual   #162 <Method float MotionEvent.getY()>
    //  169  410:aload_0         
    //  170  411:getfield        #243 <Field float mLastY>
    //  171  414:fsub            
    //  172  415:invokevirtual   #269 <Method void HighlightView.handleMotion(int, float, float)>
    //  173  418:aload_0         
    //  174  419:aload_1         
    //  175  420:invokevirtual   #159 <Method float MotionEvent.getX()>
    //  176  423:putfield        #241 <Field float mLastX>
    //  177  426:aload_0         
    //  178  427:aload_1         
    //  179  428:invokevirtual   #162 <Method float MotionEvent.getY()>
    //  180  431:putfield        #243 <Field float mLastY>
    //  181  434:aload_0         
    //  182  435:aload_0         
    //  183  436:getfield        #29  <Field HighlightView mMotionHighlightView>
    //  184  439:invokespecial   #104 <Method void ensureVisible(HighlightView)>
    //  185  442:goto            48
    //  186  445:aload_0         
    //  187  446:iconst_1        
    //  188  447:iconst_1        
    //  189  448:invokevirtual   #273 <Method void center(boolean, boolean)>
    //  190  451:goto            76
    //  191  454:aload_0         
    //  192  455:invokevirtual   #65  <Method float getScale()>
    //  193  458:fconst_1        
    //  194  459:fcmpl           
    //  195  460:ifne            76
    //  196  463:aload_0         
    //  197  464:iconst_1        
    //  198  465:iconst_1        
    //  199  466:invokevirtual   #273 <Method void center(boolean, boolean)>
    //  200  469:goto            76
    }

    protected void postTranslate(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:invokespecial   #276 <Method void ImageViewTouchBase.postTranslate(float, float)>
    //    4    6:iconst_0        
    //    5    7:istore_3        
    //    6    8:iload_3         
    //    7    9:aload_0         
    //    8   10:getfield        #27  <Field ArrayList mHighlightViews>
    //    9   13:invokevirtual   #142 <Method int ArrayList.size()>
    //   10   16:icmplt          20
    //   11   19:return          
    //   12   20:aload_0         
    //   13   21:getfield        #27  <Field ArrayList mHighlightViews>
    //   14   24:iload_3         
    //   15   25:invokevirtual   #149 <Method Object ArrayList.get(int)>
    //   16   28:checkcast       #35  <Class HighlightView>
    //   17   31:astore          4
    //   18   33:aload           4
    //   19   35:getfield        #212 <Field Matrix HighlightView.mMatrix>
    //   20   38:fload_1         
    //   21   39:fload_2         
    //   22   40:invokevirtual   #279 <Method boolean Matrix.postTranslate(float, float)>
    //   23   43:pop             
    //   24   44:aload           4
    //   25   46:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   26   49:iinc            3  1
    //   27   52:goto            8
    }

    protected void zoomIn()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #282 <Method void ImageViewTouchBase.zoomIn()>
    //    2    4:aload_0         
    //    3    5:getfield        #27  <Field ArrayList mHighlightViews>
    //    4    8:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokeinterface #204 <Method boolean Iterator.hasNext()>
    //    8   18:ifne            22
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:invokeinterface #208 <Method Object Iterator.next()>
    //   12   28:checkcast       #35  <Class HighlightView>
    //   13   31:astore_2        
    //   14   32:aload_2         
    //   15   33:getfield        #212 <Field Matrix HighlightView.mMatrix>
    //   16   36:aload_0         
    //   17   37:invokevirtual   #90  <Method Matrix getImageMatrix()>
    //   18   40:invokevirtual   #216 <Method void Matrix.set(Matrix)>
    //   19   43:aload_2         
    //   20   44:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   21   47:goto            12
    }

    protected void zoomOut()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #285 <Method void ImageViewTouchBase.zoomOut()>
    //    2    4:aload_0         
    //    3    5:getfield        #27  <Field ArrayList mHighlightViews>
    //    4    8:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokeinterface #204 <Method boolean Iterator.hasNext()>
    //    8   18:ifne            22
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:invokeinterface #208 <Method Object Iterator.next()>
    //   12   28:checkcast       #35  <Class HighlightView>
    //   13   31:astore_2        
    //   14   32:aload_2         
    //   15   33:getfield        #212 <Field Matrix HighlightView.mMatrix>
    //   16   36:aload_0         
    //   17   37:invokevirtual   #90  <Method Matrix getImageMatrix()>
    //   18   40:invokevirtual   #216 <Method void Matrix.set(Matrix)>
    //   19   43:aload_2         
    //   20   44:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   21   47:goto            12
    }

    protected void zoomTo(float f, float f1, float f2)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:fload_3         
    //    4    4:invokespecial   #288 <Method void ImageViewTouchBase.zoomTo(float, float, float)>
    //    5    7:aload_0         
    //    6    8:getfield        #27  <Field ArrayList mHighlightViews>
    //    7   11:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
    //    8   14:astore          4
    //    9   16:aload           4
    //   10   18:invokeinterface #204 <Method boolean Iterator.hasNext()>
    //   11   23:ifne            27
    //   12   26:return          
    //   13   27:aload           4
    //   14   29:invokeinterface #208 <Method Object Iterator.next()>
    //   15   34:checkcast       #35  <Class HighlightView>
    //   16   37:astore          5
    //   17   39:aload           5
    //   18   41:getfield        #212 <Field Matrix HighlightView.mMatrix>
    //   19   44:aload_0         
    //   20   45:invokevirtual   #90  <Method Matrix getImageMatrix()>
    //   21   48:invokevirtual   #216 <Method void Matrix.set(Matrix)>
    //   22   51:aload           5
    //   23   53:invokevirtual   #154 <Method void HighlightView.invalidate()>
    //   24   56:goto            16
    }

    private Context mContext;
    ArrayList mHighlightViews;
    float mLastX;
    float mLastY;
    int mMotionEdge;
    HighlightView mMotionHighlightView;
}
