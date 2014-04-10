// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.*;
import android.graphics.*;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import codeadore.textgram.custom_widgets.el7rTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package codeadore.textgram:
//            SuperSurfaceItem, Settings, Utilities, StylingActivity, 
//            EditTextActivity

public class SuperSurface extends SurfaceView
    implements Runnable
{
    class _cls1DoubleTapGestureDetector extends android.view.GestureDetector.SimpleOnGestureListener
    {

        _cls1DoubleTapGestureDetector()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field SuperSurface this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
        //    5    9:return          
        }

        public boolean onDoubleTap(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SuperSurface this$0>
        //    2    4:getfield        #21  <Field SuperSurfaceItem SuperSurface.lastSelectedItem>
        //    3    7:ifnull          45
        //    4   10:aload_0         
        //    5   11:getfield        #10  <Field SuperSurface this$0>
        //    6   14:getfield        #21  <Field SuperSurfaceItem SuperSurface.lastSelectedItem>
        //    7   17:getfield        #27  <Field String SuperSurfaceItem.type>
        //    8   20:ldc1            #29  <String "text">
        //    9   22:if_acmpne       45
        //   10   25:new             #31  <Class Intent>
        //   11   28:dup             
        //   12   29:getstatic       #37  <Field Context StylingActivity.c>
        //   13   32:ldc1            #39  <Class EditTextActivity>
        //   14   34:invokespecial   #42  <Method void Intent(Context, Class)>
        //   15   37:astore_2        
        //   16   38:getstatic       #37  <Field Context StylingActivity.c>
        //   17   41:aload_2         
        //   18   42:invokevirtual   #48  <Method void Context.startActivity(Intent)>
        //   19   45:iconst_1        
        //   20   46:ireturn         
        }

        public void onLongPress(MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #52  <Method void android.view.GestureDetector$SimpleOnGestureListener.onLongPress(MotionEvent)>
        //    3    5:return          
        }

        final SuperSurface this$0;
    }


    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #72  <Field Bitmap canvasBackground>
    //    2    4:aconst_null     
    //    3    5:putstatic       #74  <Field String canvasBackgroundPath>
    //    4    8:aconst_null     
    //    5    9:putstatic       #76  <Field Bitmap originalCanvasBackground>
    //    6   12:aconst_null     
    //    7   13:putstatic       #78  <Field Bitmap canvasFrame>
    //    8   16:aconst_null     
    //    9   17:putstatic       #80  <Field String canvasFramePath>
    //   10   20:aconst_null     
    //   11   21:putstatic       #82  <Field Bitmap canvasOriginalFrame>
    //   12   24:aconst_null     
    //   13   25:putstatic       #84  <Field Bitmap canvasFilter>
    //   14   28:aconst_null     
    //   15   29:putstatic       #86  <Field String canvasFilterPath>
    //   16   32:aconst_null     
    //   17   33:putstatic       #88  <Field Bitmap canvasOriginalFilter>
    //   18   36:bipush          100
    //   19   38:putstatic       #90  <Field int filterOpacity>
    //   20   41:sipush          612
    //   21   44:putstatic       #92  <Field int canvasWidth>
    //   22   47:sipush          612
    //   23   50:putstatic       #94  <Field int canvasHeight>
    //   24   53:sipush          480
    //   25   56:putstatic       #96  <Field int screenHeight>
    //   26   59:sipush          320
    //   27   62:putstatic       #98  <Field int screenWidth>
    //   28   65:sipush          480
    //   29   68:putstatic       #100 <Field int lastScreenHeight>
    //   30   71:sipush          320
    //   31   74:putstatic       #102 <Field int lastScreenWidth>
    //   32   77:iconst_0        
    //   33   78:putstatic       #104 <Field int startPosX>
    //   34   81:iconst_0        
    //   35   82:putstatic       #106 <Field int startPosY>
    //   36   85:iconst_1        
    //   37   86:putstatic       #108 <Field boolean update>
    //   38   89:aconst_null     
    //   39   90:putstatic       #110 <Field SuperSurfaceItem currentTextItemVar>
    //   40   93:return          
    }

    public SuperSurface(Context context1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #114 <Method void SurfaceView(Context)>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #116 <Field Thread t>
    //    6   10:aload_0         
    //    7   11:new             #118 <Class ArrayList>
    //    8   14:dup             
    //    9   15:invokespecial   #120 <Method void ArrayList()>
    //   10   18:putfield        #122 <Field ArrayList itemsList>
    //   11   21:aload_0         
    //   12   22:aconst_null     
    //   13   23:putfield        #124 <Field SuperSurfaceItem selectedItem>
    //   14   26:aload_0         
    //   15   27:aconst_null     
    //   16   28:putfield        #126 <Field SuperSurfaceItem lastSelectedItem>
    //   17   31:aload_0         
    //   18   32:iconst_0        
    //   19   33:putfield        #128 <Field boolean isTwoPointers>
    //   20   36:aload_0         
    //   21   37:fconst_0        
    //   22   38:putfield        #130 <Field float currentPointersSizeDiffe>
    //   23   41:aload_0         
    //   24   42:iconst_m1       
    //   25   43:putfield        #132 <Field int movePointerID>
    //   26   46:aload_0         
    //   27   47:fconst_0        
    //   28   48:putfield        #134 <Field float lastTouchX>
    //   29   51:aload_0         
    //   30   52:fconst_0        
    //   31   53:putfield        #136 <Field float lastTouchY>
    //   32   56:aload_0         
    //   33   57:fconst_0        
    //   34   58:putfield        #138 <Field float lastPointersYDiffe>
    //   35   61:aload_0         
    //   36   62:fconst_0        
    //   37   63:putfield        #140 <Field float lastPointersXDiffe>
    //   38   66:aload_0         
    //   39   67:iconst_0        
    //   40   68:putfield        #142 <Field boolean pinchZoomActive>
    //   41   71:aload_0         
    //   42   72:iconst_0        
    //   43   73:putfield        #144 <Field int pinchZoomRate>
    //   44   76:aload_0         
    //   45   77:fconst_0        
    //   46   78:putfield        #146 <Field float lastChangePercent>
    //   47   81:aload_0         
    //   48   82:ldc1            #148 <String "SuperSurface">
    //   49   84:putfield        #150 <Field String TAG>
    //   50   87:aload_0         
    //   51   88:iconst_0        
    //   52   89:putfield        #152 <Field int startUpOpacity>
    //   53   92:aload_0         
    //   54   93:iconst_1        
    //   55   94:putfield        #154 <Field boolean firstTime>
    //   56   97:aload_0         
    //   57   98:iconst_0        
    //   58   99:putfield        #156 <Field boolean threadIsWorking>
    //   59  102:aload_0         
    //   60  103:invokestatic    #162 <Method ExecutorService Executors.newSingleThreadExecutor()>
    //   61  106:putfield        #164 <Field ExecutorService tpe>
    //   62  109:aload_0         
    //   63  110:aload_0         
    //   64  111:invokevirtual   #168 <Method SurfaceHolder getHolder()>
    //   65  114:putfield        #170 <Field SurfaceHolder holder>
    //   66  117:aload_0         
    //   67  118:aload_1         
    //   68  119:putfield        #172 <Field Context context>
    //   69  122:return          
    }

    public SuperSurface(Context context1, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #175 <Method void SurfaceView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aconst_null     
    //    6    8:putfield        #116 <Field Thread t>
    //    7   11:aload_0         
    //    8   12:new             #118 <Class ArrayList>
    //    9   15:dup             
    //   10   16:invokespecial   #120 <Method void ArrayList()>
    //   11   19:putfield        #122 <Field ArrayList itemsList>
    //   12   22:aload_0         
    //   13   23:aconst_null     
    //   14   24:putfield        #124 <Field SuperSurfaceItem selectedItem>
    //   15   27:aload_0         
    //   16   28:aconst_null     
    //   17   29:putfield        #126 <Field SuperSurfaceItem lastSelectedItem>
    //   18   32:aload_0         
    //   19   33:iconst_0        
    //   20   34:putfield        #128 <Field boolean isTwoPointers>
    //   21   37:aload_0         
    //   22   38:fconst_0        
    //   23   39:putfield        #130 <Field float currentPointersSizeDiffe>
    //   24   42:aload_0         
    //   25   43:iconst_m1       
    //   26   44:putfield        #132 <Field int movePointerID>
    //   27   47:aload_0         
    //   28   48:fconst_0        
    //   29   49:putfield        #134 <Field float lastTouchX>
    //   30   52:aload_0         
    //   31   53:fconst_0        
    //   32   54:putfield        #136 <Field float lastTouchY>
    //   33   57:aload_0         
    //   34   58:fconst_0        
    //   35   59:putfield        #138 <Field float lastPointersYDiffe>
    //   36   62:aload_0         
    //   37   63:fconst_0        
    //   38   64:putfield        #140 <Field float lastPointersXDiffe>
    //   39   67:aload_0         
    //   40   68:iconst_0        
    //   41   69:putfield        #142 <Field boolean pinchZoomActive>
    //   42   72:aload_0         
    //   43   73:iconst_0        
    //   44   74:putfield        #144 <Field int pinchZoomRate>
    //   45   77:aload_0         
    //   46   78:fconst_0        
    //   47   79:putfield        #146 <Field float lastChangePercent>
    //   48   82:aload_0         
    //   49   83:ldc1            #148 <String "SuperSurface">
    //   50   85:putfield        #150 <Field String TAG>
    //   51   88:aload_0         
    //   52   89:iconst_0        
    //   53   90:putfield        #152 <Field int startUpOpacity>
    //   54   93:aload_0         
    //   55   94:iconst_1        
    //   56   95:putfield        #154 <Field boolean firstTime>
    //   57   98:aload_0         
    //   58   99:iconst_0        
    //   59  100:putfield        #156 <Field boolean threadIsWorking>
    //   60  103:aload_0         
    //   61  104:invokestatic    #162 <Method ExecutorService Executors.newSingleThreadExecutor()>
    //   62  107:putfield        #164 <Field ExecutorService tpe>
    //   63  110:aload_0         
    //   64  111:aload_0         
    //   65  112:invokevirtual   #168 <Method SurfaceHolder getHolder()>
    //   66  115:putfield        #170 <Field SurfaceHolder holder>
    //   67  118:aload_0         
    //   68  119:aload_0         
    //   69  120:putfield        #177 <Field View thisView>
    //   70  123:aload_0         
    //   71  124:aload_1         
    //   72  125:putfield        #172 <Field Context context>
    //   73  128:aload_0         
    //   74  129:invokevirtual   #181 <Method ViewTreeObserver getViewTreeObserver()>
    //   75  132:new             #183 <Class SuperSurface$1>
    //   76  135:dup             
    //   77  136:aload_0         
    //   78  137:invokespecial   #186 <Method void SuperSurface$1(SuperSurface)>
    //   79  140:invokevirtual   #192 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   80  143:aload_0         
    //   81  144:new             #194 <Class SuperSurface$2>
    //   82  147:dup             
    //   83  148:aload_0         
    //   84  149:new             #196 <Class GestureDetector>
    //   85  152:dup             
    //   86  153:new             #198 <Class SuperSurface$1DoubleTapGestureDetector>
    //   87  156:dup             
    //   88  157:aload_0         
    //   89  158:invokespecial   #199 <Method void SuperSurface$1DoubleTapGestureDetector(SuperSurface)>
    //   90  161:invokespecial   #202 <Method void GestureDetector(android.view.GestureDetector$OnGestureListener)>
    //   91  164:invokespecial   #205 <Method void SuperSurface$2(SuperSurface, GestureDetector)>
    //   92  167:invokevirtual   #209 <Method void setOnTouchListener(android.view.View$OnTouchListener)>
    //   93  170:return          
    }

    static int access$0(SuperSurface supersurface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #152 <Field int startUpOpacity>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #152 <Field int startUpOpacity>
    //    5    4:ireturn         
    }

    static void access$1(SuperSurface supersurface, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #152 <Field int startUpOpacity>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:putfield        #152 <Field int startUpOpacity>
    //    7    5:return          
    }

    public static int resetFixedSizeLast(float f)
    {
    //    0    0:ldc1            #216 <String "resetFixedSizeLast">
    //    1    2:new             #218 <Class StringBuilder>
    //    2    5:dup             
    //    3    6:ldc1            #220 <String "lastW: ">
    //    4    8:invokespecial   #223 <Method void StringBuilder(String)>
    //    5   11:getstatic       #102 <Field int lastScreenWidth>
    //    6   14:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
    //    7   17:ldc1            #229 <String " - lastH: ">
    //    8   19:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
    //    9   22:getstatic       #100 <Field int lastScreenHeight>
    //   10   25:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
    //   11   28:invokevirtual   #236 <Method String StringBuilder.toString()>
    //   12   31:invokestatic    #242 <Method int Log.e(String, String)>
    //   13   34:pop             
    //   14   35:getstatic       #92  <Field int canvasWidth>
    //   15   38:istore_2        
    //   16   39:getstatic       #102 <Field int lastScreenWidth>
    //   17   42:getstatic       #100 <Field int lastScreenHeight>
    //   18   45:icmpge          90
    //   19   48:getstatic       #102 <Field int lastScreenWidth>
    //   20   51:istore_3        
    //   21   52:ldc1            #243 <Float 100F>
    //   22   54:fload_0         
    //   23   55:iload_3         
    //   24   56:i2f             
    //   25   57:fdiv            
    //   26   58:fmul            
    //   27   59:ldc1            #243 <Float 100F>
    //   28   61:fdiv            
    //   29   62:iload_2         
    //   30   63:i2f             
    //   31   64:fmul            
    //   32   65:invokestatic    #249 <Method String String.valueOf(float)>
    //   33   68:astore          4
    //   34   70:aload           4
    //   35   72:iconst_0        
    //   36   73:aload           4
    //   37   75:ldc1            #251 <String ".">
    //   38   77:invokevirtual   #255 <Method int String.lastIndexOf(String)>
    //   39   80:invokevirtual   #259 <Method String String.substring(int, int)>
    //   40   83:invokestatic    #264 <Method Integer Integer.valueOf(String)>
    //   41   86:invokevirtual   #268 <Method int Integer.intValue()>
    //   42   89:ireturn         
    //   43   90:getstatic       #100 <Field int lastScreenHeight>
    //   44   93:istore_3        
    //   45   94:goto            52
    }

    public void addItem(SuperSurfaceItem supersurfaceitem)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field ArrayList itemsList>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #274 <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:aload_1         
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:getfield        #279 <Field float SuperSurfaceItem.height>
    //    9   15:invokevirtual   #283 <Method float fixToSize(float)>
    //   10   18:putfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //   11   21:aload_1         
    //   12   22:aload_0         
    //   13   23:aload_1         
    //   14   24:getfield        #289 <Field float SuperSurfaceItem.width>
    //   15   27:invokevirtual   #283 <Method float fixToSize(float)>
    //   16   30:putfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //   17   33:aload_1         
    //   18   34:aload_0         
    //   19   35:aload_1         
    //   20   36:getfield        #295 <Field float SuperSurfaceItem.posX>
    //   21   39:invokevirtual   #283 <Method float fixToSize(float)>
    //   22   42:putfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   23   45:aload_1         
    //   24   46:aload_0         
    //   25   47:aload_1         
    //   26   48:getfield        #301 <Field float SuperSurfaceItem.posY>
    //   27   51:invokevirtual   #283 <Method float fixToSize(float)>
    //   28   54:putfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   29   57:iconst_1        
    //   30   58:putstatic       #108 <Field boolean update>
    //   31   61:aload_1         
    //   32   62:getfield        #307 <Field String SuperSurfaceItem.type>
    //   33   65:ldc2            #309 <String "text">
    //   34   68:if_acmpne       81
    //   35   71:getstatic       #110 <Field SuperSurfaceItem currentTextItemVar>
    //   36   74:ifnonnull       81
    //   37   77:aload_1         
    //   38   78:putstatic       #110 <Field SuperSurfaceItem currentTextItemVar>
    //   39   81:return          
    }

    public void clearSelection()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #124 <Field SuperSurfaceItem selectedItem>
    //    3    5:aload_0         
    //    4    6:getfield        #122 <Field ArrayList itemsList>
    //    5    9:invokevirtual   #314 <Method Iterator ArrayList.iterator()>
    //    6   12:astore_1        
    //    7   13:aload_1         
    //    8   14:invokeinterface #320 <Method boolean Iterator.hasNext()>
    //    9   19:ifne            27
    //   10   22:aload_0         
    //   11   23:invokevirtual   #323 <Method void requestUpdate()>
    //   12   26:return          
    //   13   27:aload_1         
    //   14   28:invokeinterface #327 <Method Object Iterator.next()>
    //   15   33:checkcast       #276 <Class SuperSurfaceItem>
    //   16   36:astore_2        
    //   17   37:aload_2         
    //   18   38:iconst_0        
    //   19   39:putfield        #330 <Field boolean SuperSurfaceItem.selected>
    //   20   42:aload_2         
    //   21   43:iconst_0        
    //   22   44:putfield        #333 <Field boolean SuperSurfaceItem.highlight>
    //   23   47:goto            13
    }

    public Bitmap export()
    {
    //    0    0:getstatic       #92  <Field int canvasWidth>
    //    1    3:getstatic       #94  <Field int canvasHeight>
    //    2    6:getstatic       #341 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //    3    9:invokestatic    #347 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //    4   12:astore_1        
    //    5   13:new             #349 <Class Canvas>
    //    6   16:dup             
    //    7   17:aload_1         
    //    8   18:invokespecial   #352 <Method void Canvas(Bitmap)>
    //    9   21:astore_2        
    //   10   22:aload_2         
    //   11   23:new             #354 <Class PaintFlagsDrawFilter>
    //   12   26:dup             
    //   13   27:iconst_0        
    //   14   28:iconst_2        
    //   15   29:invokespecial   #357 <Method void PaintFlagsDrawFilter(int, int)>
    //   16   32:invokevirtual   #361 <Method void Canvas.setDrawFilter(android.graphics.DrawFilter)>
    //   17   35:aload_2         
    //   18   36:bipush          23
    //   19   38:bipush          24
    //   20   40:bipush          18
    //   21   42:invokevirtual   #365 <Method void Canvas.drawRGB(int, int, int)>
    //   22   45:new             #367 <Class Paint>
    //   23   48:dup             
    //   24   49:invokespecial   #368 <Method void Paint()>
    //   25   52:astore_3        
    //   26   53:aload_3         
    //   27   54:iconst_1        
    //   28   55:invokevirtual   #372 <Method void Paint.setFilterBitmap(boolean)>
    //   29   58:aload_3         
    //   30   59:iconst_1        
    //   31   60:invokevirtual   #375 <Method void Paint.setDither(boolean)>
    //   32   63:aload_3         
    //   33   64:iconst_1        
    //   34   65:invokevirtual   #378 <Method void Paint.setAntiAlias(boolean)>
    //   35   68:getstatic       #76  <Field Bitmap originalCanvasBackground>
    //   36   71:ifnull          84
    //   37   74:aload_2         
    //   38   75:getstatic       #76  <Field Bitmap originalCanvasBackground>
    //   39   78:fconst_0        
    //   40   79:fconst_0        
    //   41   80:aload_3         
    //   42   81:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //   43   84:getstatic       #84  <Field Bitmap canvasFilter>
    //   44   87:ifnull          135
    //   45   90:new             #367 <Class Paint>
    //   46   93:dup             
    //   47   94:invokespecial   #368 <Method void Paint()>
    //   48   97:astore          4
    //   49   99:aload_0         
    //   50  100:invokevirtual   #385 <Method int getFilterOpacity()>
    //   51  103:bipush          100
    //   52  105:icmpeq          124
    //   53  108:aload           4
    //   54  110:sipush          255
    //   55  113:aload_0         
    //   56  114:invokevirtual   #385 <Method int getFilterOpacity()>
    //   57  117:imul            
    //   58  118:bipush          100
    //   59  120:idiv            
    //   60  121:invokevirtual   #389 <Method void Paint.setAlpha(int)>
    //   61  124:aload_2         
    //   62  125:getstatic       #88  <Field Bitmap canvasOriginalFilter>
    //   63  128:fconst_0        
    //   64  129:fconst_0        
    //   65  130:aload           4
    //   66  132:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //   67  135:aload_0         
    //   68  136:getfield        #122 <Field ArrayList itemsList>
    //   69  139:invokevirtual   #314 <Method Iterator ArrayList.iterator()>
    //   70  142:astore          5
    //   71  144:aload           5
    //   72  146:invokeinterface #320 <Method boolean Iterator.hasNext()>
    //   73  151:ifne            203
    //   74  154:getstatic       #78  <Field Bitmap canvasFrame>
    //   75  157:ifnull          170
    //   76  160:aload_2         
    //   77  161:getstatic       #82  <Field Bitmap canvasOriginalFrame>
    //   78  164:fconst_0        
    //   79  165:fconst_0        
    //   80  166:aconst_null     
    //   81  167:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //   82  170:aload_0         
    //   83  171:getfield        #172 <Field Context context>
    //   84  174:ldc2            #391 <String "TextgramSettings">
    //   85  177:iconst_0        
    //   86  178:invokevirtual   #397 <Method SharedPreferences Context.getSharedPreferences(String, int)>
    //   87  181:astore          14
    //   88  183:getstatic       #402 <Field boolean Settings.isPro>
    //   89  186:ifne            201
    //   90  189:aload           14
    //   91  191:ldc2            #404 <String "removeWatermark">
    //   92  194:iconst_0        
    //   93  195:invokeinterface #410 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   94  200:pop             
    //   95  201:aload_1         
    //   96  202:areturn         
    //   97  203:aload           5
    //   98  205:invokeinterface #327 <Method Object Iterator.next()>
    //   99  210:checkcast       #276 <Class SuperSurfaceItem>
    //  100  213:astore          6
    //  101  215:aload           6
    //  102  217:getfield        #413 <Field int SuperSurfaceItem.rotation>
    //  103  220:ifeq            281
    //  104  223:aload_2         
    //  105  224:iconst_1        
    //  106  225:invokevirtual   #417 <Method int Canvas.save(int)>
    //  107  228:pop             
    //  108  229:aload_2         
    //  109  230:aload           6
    //  110  232:getfield        #413 <Field int SuperSurfaceItem.rotation>
    //  111  235:i2f             
    //  112  236:aload_0         
    //  113  237:aload           6
    //  114  239:getfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //  115  242:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  116  245:aload_0         
    //  117  246:aload           6
    //  118  248:getfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //  119  251:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  120  254:fconst_2        
    //  121  255:fdiv            
    //  122  256:fadd            
    //  123  257:aload_0         
    //  124  258:aload           6
    //  125  260:getfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //  126  263:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  127  266:aload_0         
    //  128  267:aload           6
    //  129  269:getfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //  130  272:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  131  275:fconst_2        
    //  132  276:fdiv            
    //  133  277:fadd            
    //  134  278:invokevirtual   #424 <Method void Canvas.rotate(float, float, float)>
    //  135  281:aload           6
    //  136  283:getfield        #307 <Field String SuperSurfaceItem.type>
    //  137  286:ldc2            #309 <String "text">
    //  138  289:invokevirtual   #427 <Method boolean String.equals(Object)>
    //  139  292:ifeq            494
    //  140  295:aload           6
    //  141  297:getfield        #430 <Field Bitmap SuperSurfaceItem.bitmap>
    //  142  300:aload_0         
    //  143  301:aload           6
    //  144  303:getfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //  145  306:f2i             
    //  146  307:invokevirtual   #432 <Method int resetFixedSize(int)>
    //  147  310:aload_0         
    //  148  311:aload           6
    //  149  313:getfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //  150  316:f2i             
    //  151  317:invokevirtual   #432 <Method int resetFixedSize(int)>
    //  152  320:iconst_1        
    //  153  321:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //  154  324:astore          7
    //  155  326:aload           6
    //  156  328:getfield        #413 <Field int SuperSurfaceItem.rotation>
    //  157  331:pop             
    //  158  332:new             #367 <Class Paint>
    //  159  335:dup             
    //  160  336:invokespecial   #368 <Method void Paint()>
    //  161  339:astore          9
    //  162  341:aload           6
    //  163  343:getfield        #439 <Field int SuperSurfaceItem.opacity>
    //  164  346:bipush          100
    //  165  348:icmpeq          368
    //  166  351:aload           9
    //  167  353:sipush          255
    //  168  356:aload           6
    //  169  358:getfield        #439 <Field int SuperSurfaceItem.opacity>
    //  170  361:imul            
    //  171  362:bipush          100
    //  172  364:idiv            
    //  173  365:invokevirtual   #389 <Method void Paint.setAlpha(int)>
    //  174  368:aload_2         
    //  175  369:aload           7
    //  176  371:aload_0         
    //  177  372:aload           6
    //  178  374:getfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //  179  377:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  180  380:aload_0         
    //  181  381:aload           6
    //  182  383:getfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //  183  386:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  184  389:aload           9
    //  185  391:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //  186  394:aload           6
    //  187  396:getfield        #442 <Field int SuperSurfaceItem.reflection>
    //  188  399:ifle            479
    //  189  402:aload           7
    //  190  404:aload           6
    //  191  406:getfield        #442 <Field int SuperSurfaceItem.reflection>
    //  192  409:invokestatic    #448 <Method Bitmap Utilities.createReflectedBitmap(Bitmap, int)>
    //  193  412:astore          10
    //  194  414:aload_0         
    //  195  415:aload_0         
    //  196  416:aload           6
    //  197  418:invokevirtual   #451 <Method int SuperSurfaceItem.getTextHeight()>
    //  198  421:i2f             
    //  199  422:invokevirtual   #283 <Method float fixToSize(float)>
    //  200  425:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  201  428:f2i             
    //  202  429:istore          11
    //  203  431:aload_0         
    //  204  432:aload           6
    //  205  434:getfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //  206  437:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  207  440:aload_0         
    //  208  441:aload           6
    //  209  443:getfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //  210  446:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  211  449:iload           11
    //  212  451:i2f             
    //  213  452:fsub            
    //  214  453:fsub            
    //  215  454:iload           11
    //  216  456:i2f             
    //  217  457:fadd            
    //  218  458:fstore          12
    //  219  460:aload_2         
    //  220  461:aload           10
    //  221  463:aload_0         
    //  222  464:aload           6
    //  223  466:getfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //  224  469:invokevirtual   #420 <Method float resetFixedSize(float)>
    //  225  472:fload           12
    //  226  474:aload           9
    //  227  476:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //  228  479:aload           6
    //  229  481:getfield        #413 <Field int SuperSurfaceItem.rotation>
    //  230  484:ifeq            144
    //  231  487:aload_2         
    //  232  488:invokevirtual   #454 <Method void Canvas.restore()>
    //  233  491:goto            144
    //  234  494:aload           6
    //  235  496:getfield        #430 <Field Bitmap SuperSurfaceItem.bitmap>
    //  236  499:aload_0         
    //  237  500:aload           6
    //  238  502:getfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //  239  505:f2i             
    //  240  506:invokevirtual   #432 <Method int resetFixedSize(int)>
    //  241  509:aload_0         
    //  242  510:aload           6
    //  243  512:getfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //  244  515:f2i             
    //  245  516:invokevirtual   #432 <Method int resetFixedSize(int)>
    //  246  519:iconst_1        
    //  247  520:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //  248  523:astore          7
    //  249  525:goto            326
    }

    public float fixToSize(float f)
    {
    //    0    0:getstatic       #92  <Field int canvasWidth>
    //    1    3:istore_2        
    //    2    4:getstatic       #98  <Field int screenWidth>
    //    3    7:getstatic       #96  <Field int screenHeight>
    //    4   10:icmpge          31
    //    5   13:getstatic       #98  <Field int screenWidth>
    //    6   16:istore_3        
    //    7   17:ldc1            #243 <Float 100F>
    //    8   19:fload_1         
    //    9   20:iload_2         
    //   10   21:i2f             
    //   11   22:fdiv            
    //   12   23:fmul            
    //   13   24:ldc1            #243 <Float 100F>
    //   14   26:fdiv            
    //   15   27:iload_3         
    //   16   28:i2f             
    //   17   29:fmul            
    //   18   30:freturn         
    //   19   31:getstatic       #96  <Field int screenHeight>
    //   20   34:istore_3        
    //   21   35:goto            17
    }

    public String getCanvasBackgroundPath()
    {
    //    0    0:getstatic       #74  <Field String canvasBackgroundPath>
    //    1    3:areturn         
    }

    public String getCanvasFilterPath()
    {
    //    0    0:getstatic       #86  <Field String canvasFilterPath>
    //    1    3:areturn         
    }

    public String getCanvasFramePath()
    {
    //    0    0:getstatic       #80  <Field String canvasFramePath>
    //    1    3:areturn         
    }

    public SuperSurfaceItem getCurrentTextItem()
    {
    //    0    0:getstatic       #110 <Field SuperSurfaceItem currentTextItemVar>
    //    1    3:areturn         
    }

    public int getFilterOpacity()
    {
    //    0    0:getstatic       #90  <Field int filterOpacity>
    //    1    3:ireturn         
    }

    public ArrayList getItemsList()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field ArrayList itemsList>
    //    2    4:areturn         
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_0         
    //    1    1:sipush          300
    //    2    4:putfield        #152 <Field int startUpOpacity>
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #465 <Method void SurfaceView.onRestoreInstanceState(Parcelable)>
    //    6   12:return          
    }

    protected Parcelable onSaveInstanceState()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #469 <Method Parcelable SurfaceView.onSaveInstanceState()>
    //    2    4:areturn         
    }

    public void pause()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #474 <Field boolean isItOK>
    //    3    5:aload_0         
    //    4    6:getfield        #116 <Field Thread t>
    //    5    9:ifnull          19
    // try 12 19 handler(s) 25
    //    6   12:aload_0         
    //    7   13:getfield        #116 <Field Thread t>
    //    8   16:invokevirtual   #479 <Method void Thread.join()>
    //    9   19:aload_0         
    //   10   20:aconst_null     
    //   11   21:putfield        #116 <Field Thread t>
    //   12   24:return          
    // catch Exception
    //   13   25:astore_1        
    //   14   26:aload_1         
    //   15   27:invokevirtual   #482 <Method void Exception.printStackTrace()>
    //   16   30:goto            19
    }

    public void requestUpdate()
    {
    //    0    0:iconst_1        
    //    1    1:putstatic       #108 <Field boolean update>
    //    2    4:return          
    }

    public void reset(String s)
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #78  <Field Bitmap canvasFrame>
    //    2    4:aconst_null     
    //    3    5:putstatic       #80  <Field String canvasFramePath>
    //    4    8:aconst_null     
    //    5    9:putstatic       #84  <Field Bitmap canvasFilter>
    //    6   12:aconst_null     
    //    7   13:putstatic       #86  <Field String canvasFilterPath>
    //    8   16:aconst_null     
    //    9   17:putstatic       #72  <Field Bitmap canvasBackground>
    //   10   20:aconst_null     
    //   11   21:putstatic       #74  <Field String canvasBackgroundPath>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #485 <Method void pause()>
    //   14   28:aload_1         
    //   15   29:ldc2            #487 <String "full">
    //   16   32:if_acmpne       47
    //   17   35:aload_0         
    //   18   36:getfield        #122 <Field ArrayList itemsList>
    //   19   39:invokevirtual   #490 <Method void ArrayList.clear()>
    //   20   42:aload_0         
    //   21   43:invokevirtual   #493 <Method void resume()>
    //   22   46:return          
    //   23   47:iconst_0        
    //   24   48:istore_2        
    //   25   49:iload_2         
    //   26   50:aload_0         
    //   27   51:getfield        #122 <Field ArrayList itemsList>
    //   28   54:invokevirtual   #496 <Method int ArrayList.size()>
    //   29   57:icmpge          42
    //   30   60:aload_0         
    //   31   61:getfield        #122 <Field ArrayList itemsList>
    //   32   64:iload_2         
    //   33   65:invokevirtual   #500 <Method Object ArrayList.get(int)>
    //   34   68:checkcast       #276 <Class SuperSurfaceItem>
    //   35   71:pop             
    //   36   72:aload_0         
    //   37   73:getfield        #122 <Field ArrayList itemsList>
    //   38   76:iconst_0        
    //   39   77:invokevirtual   #500 <Method Object ArrayList.get(int)>
    //   40   80:checkcast       #276 <Class SuperSurfaceItem>
    //   41   83:astore          4
    //   42   85:aload_0         
    //   43   86:new             #118 <Class ArrayList>
    //   44   89:dup             
    //   45   90:invokespecial   #120 <Method void ArrayList()>
    //   46   93:putfield        #122 <Field ArrayList itemsList>
    //   47   96:aload_0         
    //   48   97:getfield        #122 <Field ArrayList itemsList>
    //   49  100:aload           4
    //   50  102:invokevirtual   #274 <Method boolean ArrayList.add(Object)>
    //   51  105:pop             
    //   52  106:iinc            2  1
    //   53  109:goto            49
    }

    public float resetFixedSize(float f)
    {
    //    0    0:getstatic       #92  <Field int canvasWidth>
    //    1    3:istore_2        
    //    2    4:getstatic       #98  <Field int screenWidth>
    //    3    7:getstatic       #96  <Field int screenHeight>
    //    4   10:icmpge          55
    //    5   13:getstatic       #98  <Field int screenWidth>
    //    6   16:istore_3        
    //    7   17:ldc1            #243 <Float 100F>
    //    8   19:fload_1         
    //    9   20:iload_3         
    //   10   21:i2f             
    //   11   22:fdiv            
    //   12   23:fmul            
    //   13   24:ldc1            #243 <Float 100F>
    //   14   26:fdiv            
    //   15   27:iload_2         
    //   16   28:i2f             
    //   17   29:fmul            
    //   18   30:invokestatic    #249 <Method String String.valueOf(float)>
    //   19   33:astore          4
    //   20   35:aload           4
    //   21   37:iconst_0        
    //   22   38:aload           4
    //   23   40:ldc1            #251 <String ".">
    //   24   42:invokevirtual   #255 <Method int String.lastIndexOf(String)>
    //   25   45:invokevirtual   #259 <Method String String.substring(int, int)>
    //   26   48:invokestatic    #505 <Method Float Float.valueOf(String)>
    //   27   51:invokevirtual   #509 <Method float Float.floatValue()>
    //   28   54:freturn         
    //   29   55:getstatic       #96  <Field int screenHeight>
    //   30   58:istore_3        
    //   31   59:goto            17
    }

    public int resetFixedSize(int i)
    {
    //    0    0:getstatic       #92  <Field int canvasWidth>
    //    1    3:istore_2        
    //    2    4:getstatic       #98  <Field int screenWidth>
    //    3    7:getstatic       #96  <Field int screenHeight>
    //    4   10:icmpge          56
    //    5   13:getstatic       #98  <Field int screenWidth>
    //    6   16:istore_3        
    //    7   17:ldc1            #243 <Float 100F>
    //    8   19:iload_1         
    //    9   20:i2f             
    //   10   21:iload_3         
    //   11   22:i2f             
    //   12   23:fdiv            
    //   13   24:fmul            
    //   14   25:ldc1            #243 <Float 100F>
    //   15   27:fdiv            
    //   16   28:iload_2         
    //   17   29:i2f             
    //   18   30:fmul            
    //   19   31:invokestatic    #249 <Method String String.valueOf(float)>
    //   20   34:astore          4
    //   21   36:aload           4
    //   22   38:iconst_0        
    //   23   39:aload           4
    //   24   41:ldc1            #251 <String ".">
    //   25   43:invokevirtual   #255 <Method int String.lastIndexOf(String)>
    //   26   46:invokevirtual   #259 <Method String String.substring(int, int)>
    //   27   49:invokestatic    #264 <Method Integer Integer.valueOf(String)>
    //   28   52:invokevirtual   #268 <Method int Integer.intValue()>
    //   29   55:ireturn         
    //   30   56:getstatic       #96  <Field int screenHeight>
    //   31   59:istore_3        
    //   32   60:goto            17
    }

    public void resume()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #474 <Field boolean isItOK>
    //    3    5:aload_0         
    //    4    6:new             #476 <Class Thread>
    //    5    9:dup             
    //    6   10:aload_0         
    //    7   11:invokespecial   #512 <Method void Thread(Runnable)>
    //    8   14:putfield        #116 <Field Thread t>
    //    9   17:aload_0         
    //   10   18:getfield        #116 <Field Thread t>
    //   11   21:invokevirtual   #515 <Method void Thread.start()>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #323 <Method void requestUpdate()>
    //   14   28:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #474 <Field boolean isItOK>
    //    2    4:ifne            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #170 <Field SurfaceHolder holder>
    //    6   12:invokeinterface #524 <Method Surface SurfaceHolder.getSurface()>
    //    7   17:invokevirtual   #529 <Method boolean Surface.isValid()>
    //    8   20:ifeq            0
    //    9   23:getstatic       #108 <Field boolean update>
    //   10   26:ifeq            0
    //   11   29:aload_0         
    //   12   30:getfield        #152 <Field int startUpOpacity>
    //   13   33:sipush          255
    //   14   36:icmple          43
    //   15   39:iconst_0        
    //   16   40:putstatic       #108 <Field boolean update>
    //   17   43:aload_0         
    //   18   44:getfield        #156 <Field boolean threadIsWorking>
    //   19   47:ifne            68
    //   20   50:aload_0         
    //   21   51:getfield        #164 <Field ExecutorService tpe>
    //   22   54:new             #531 <Class SuperSurface$3>
    //   23   57:dup             
    //   24   58:aload_0         
    //   25   59:invokespecial   #532 <Method void SuperSurface$3(SuperSurface)>
    //   26   62:invokeinterface #538 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
    //   27   67:pop             
    // try 68 74 handler(s) 77
    //   28   68:ldc2w           #539 <Long 20L>
    //   29   71:invokestatic    #544 <Method void Thread.sleep(long)>
    //   30   74:goto            0
    // catch InterruptedException
    //   31   77:astore_1        
    //   32   78:aload_1         
    //   33   79:invokevirtual   #545 <Method void InterruptedException.printStackTrace()>
    //   34   82:goto            0
    }

    public void setBackground(Bitmap bitmap, String s)
    {
    // try 0 44 handler(s) 45
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getstatic       #92  <Field int canvasWidth>
    //    3    5:i2f             
    //    4    6:invokevirtual   #283 <Method float fixToSize(float)>
    //    5    9:f2i             
    //    6   10:aload_0         
    //    7   11:getstatic       #94  <Field int canvasHeight>
    //    8   14:i2f             
    //    9   15:invokevirtual   #283 <Method float fixToSize(float)>
    //   10   18:f2i             
    //   11   19:iconst_1        
    //   12   20:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   13   23:putstatic       #72  <Field Bitmap canvasBackground>
    //   14   26:aload_2         
    //   15   27:putstatic       #74  <Field String canvasBackgroundPath>
    //   16   30:aload_1         
    //   17   31:getstatic       #92  <Field int canvasWidth>
    //   18   34:getstatic       #94  <Field int canvasHeight>
    //   19   37:iconst_1        
    //   20   38:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   21   41:putstatic       #76  <Field Bitmap originalCanvasBackground>
    //   22   44:return          
    // catch Exception
    //   23   45:astore_3        
    //   24   46:aload_0         
    //   25   47:getfield        #150 <Field String TAG>
    //   26   50:new             #218 <Class StringBuilder>
    //   27   53:dup             
    //   28   54:ldc2            #549 <String "in superSurface.setBackground: ">
    //   29   57:invokespecial   #223 <Method void StringBuilder(String)>
    //   30   60:aload_3         
    //   31   61:invokevirtual   #550 <Method String Exception.toString()>
    //   32   64:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
    //   33   67:invokevirtual   #236 <Method String StringBuilder.toString()>
    //   34   70:invokestatic    #242 <Method int Log.e(String, String)>
    //   35   73:pop             
    //   36   74:aload_3         
    //   37   75:invokevirtual   #482 <Method void Exception.printStackTrace()>
    //   38   78:return          
    }

    public void setFilter(Bitmap bitmap, String s)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       17
    //    2    4:aconst_null     
    //    3    5:putstatic       #84  <Field Bitmap canvasFilter>
    //    4    8:aconst_null     
    //    5    9:putstatic       #88  <Field Bitmap canvasOriginalFilter>
    //    6   12:aconst_null     
    //    7   13:putstatic       #86  <Field String canvasFilterPath>
    //    8   16:return          
    //    9   17:aload_1         
    //   10   18:aload_0         
    //   11   19:getstatic       #92  <Field int canvasWidth>
    //   12   22:i2f             
    //   13   23:invokevirtual   #283 <Method float fixToSize(float)>
    //   14   26:f2i             
    //   15   27:aload_0         
    //   16   28:getstatic       #94  <Field int canvasHeight>
    //   17   31:i2f             
    //   18   32:invokevirtual   #283 <Method float fixToSize(float)>
    //   19   35:f2i             
    //   20   36:iconst_1        
    //   21   37:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   22   40:putstatic       #84  <Field Bitmap canvasFilter>
    //   23   43:aload_2         
    //   24   44:putstatic       #86  <Field String canvasFilterPath>
    //   25   47:aload_1         
    //   26   48:invokevirtual   #554 <Method int Bitmap.getWidth()>
    //   27   51:getstatic       #92  <Field int canvasWidth>
    //   28   54:icmpne          72
    //   29   57:aload_1         
    //   30   58:invokevirtual   #557 <Method int Bitmap.getHeight()>
    //   31   61:getstatic       #94  <Field int canvasHeight>
    //   32   64:icmpne          72
    //   33   67:aload_1         
    //   34   68:putstatic       #88  <Field Bitmap canvasOriginalFilter>
    //   35   71:return          
    //   36   72:aload_1         
    //   37   73:getstatic       #92  <Field int canvasWidth>
    //   38   76:getstatic       #94  <Field int canvasHeight>
    //   39   79:iconst_1        
    //   40   80:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   41   83:putstatic       #88  <Field Bitmap canvasOriginalFilter>
    //   42   86:return          
    }

    public void setFilterOpacity(int i)
    {
    //    0    0:iload_1         
    //    1    1:putstatic       #90  <Field int filterOpacity>
    //    2    4:return          
    }

    public void setFrame(Bitmap bitmap, String s)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       17
    //    2    4:aconst_null     
    //    3    5:putstatic       #78  <Field Bitmap canvasFrame>
    //    4    8:aconst_null     
    //    5    9:putstatic       #82  <Field Bitmap canvasOriginalFrame>
    //    6   12:aconst_null     
    //    7   13:putstatic       #80  <Field String canvasFramePath>
    //    8   16:return          
    //    9   17:aload_1         
    //   10   18:aload_0         
    //   11   19:getstatic       #92  <Field int canvasWidth>
    //   12   22:i2f             
    //   13   23:invokevirtual   #283 <Method float fixToSize(float)>
    //   14   26:f2i             
    //   15   27:aload_0         
    //   16   28:getstatic       #94  <Field int canvasHeight>
    //   17   31:i2f             
    //   18   32:invokevirtual   #283 <Method float fixToSize(float)>
    //   19   35:f2i             
    //   20   36:iconst_1        
    //   21   37:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   22   40:putstatic       #78  <Field Bitmap canvasFrame>
    //   23   43:aload_2         
    //   24   44:putstatic       #80  <Field String canvasFramePath>
    //   25   47:aload_1         
    //   26   48:putstatic       #82  <Field Bitmap canvasOriginalFrame>
    //   27   51:return          
    }

    public void updateScreenVariables(SuperSurface supersurface, int i, int j)
    {
    //    0    0:ldc2            #563 <String "LASTWIDTH">
    //    1    3:new             #218 <Class StringBuilder>
    //    2    6:dup             
    //    3    7:invokespecial   #564 <Method void StringBuilder()>
    //    4   10:getstatic       #102 <Field int lastScreenWidth>
    //    5   13:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
    //    6   16:invokevirtual   #236 <Method String StringBuilder.toString()>
    //    7   19:invokestatic    #242 <Method int Log.e(String, String)>
    //    8   22:pop             
    //    9   23:aload_0         
    //   10   24:aload_1         
    //   11   25:putfield        #177 <Field View thisView>
    //   12   28:iload_2         
    //   13   29:putstatic       #96  <Field int screenHeight>
    //   14   32:iload_3         
    //   15   33:putstatic       #98  <Field int screenWidth>
    //   16   36:iconst_0        
    //   17   37:putstatic       #104 <Field int startPosX>
    //   18   40:iconst_0        
    //   19   41:putstatic       #106 <Field int startPosY>
    //   20   44:getstatic       #98  <Field int screenWidth>
    //   21   47:getstatic       #96  <Field int screenHeight>
    //   22   50:icmple          67
    //   23   53:getstatic       #98  <Field int screenWidth>
    //   24   56:iconst_2        
    //   25   57:idiv            
    //   26   58:getstatic       #96  <Field int screenHeight>
    //   27   61:iconst_2        
    //   28   62:idiv            
    //   29   63:isub            
    //   30   64:putstatic       #104 <Field int startPosX>
    //   31   67:getstatic       #96  <Field int screenHeight>
    //   32   70:getstatic       #98  <Field int screenWidth>
    //   33   73:icmple          90
    //   34   76:getstatic       #96  <Field int screenHeight>
    //   35   79:iconst_2        
    //   36   80:idiv            
    //   37   81:getstatic       #98  <Field int screenWidth>
    //   38   84:iconst_2        
    //   39   85:idiv            
    //   40   86:isub            
    //   41   87:putstatic       #106 <Field int startPosY>
    //   42   90:aload_0         
    //   43   91:getfield        #172 <Field Context context>
    //   44   94:ldc2            #566 <String "[assets]/data/supersurface_del.png">
    //   45   97:invokestatic    #570 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //   46  100:astore          5
    //   47  102:aload_0         
    //   48  103:aload           5
    //   49  105:aload_0         
    //   50  106:aload           5
    //   51  108:invokevirtual   #554 <Method int Bitmap.getWidth()>
    //   52  111:i2f             
    //   53  112:invokevirtual   #283 <Method float fixToSize(float)>
    //   54  115:f2i             
    //   55  116:aload_0         
    //   56  117:aload           5
    //   57  119:invokevirtual   #557 <Method int Bitmap.getHeight()>
    //   58  122:i2f             
    //   59  123:invokevirtual   #283 <Method float fixToSize(float)>
    //   60  126:f2i             
    //   61  127:iconst_1        
    //   62  128:invokestatic    #436 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   63  131:putfield        #572 <Field Bitmap deleteCornerBitmap>
    //   64  134:aload_0         
    //   65  135:invokevirtual   #575 <Method void updateTempsChanged()>
    //   66  138:getstatic       #96  <Field int screenHeight>
    //   67  141:putstatic       #100 <Field int lastScreenHeight>
    //   68  144:getstatic       #98  <Field int screenWidth>
    //   69  147:putstatic       #102 <Field int lastScreenWidth>
    //   70  150:aload_0         
    //   71  151:getstatic       #76  <Field Bitmap originalCanvasBackground>
    //   72  154:getstatic       #74  <Field String canvasBackgroundPath>
    //   73  157:invokevirtual   #577 <Method void setBackground(Bitmap, String)>
    //   74  160:aload_0         
    //   75  161:getstatic       #88  <Field Bitmap canvasOriginalFilter>
    //   76  164:getstatic       #86  <Field String canvasFilterPath>
    //   77  167:invokevirtual   #579 <Method void setFilter(Bitmap, String)>
    //   78  170:aload_0         
    //   79  171:getstatic       #82  <Field Bitmap canvasOriginalFrame>
    //   80  174:getstatic       #80  <Field String canvasFramePath>
    //   81  177:invokevirtual   #581 <Method void setFrame(Bitmap, String)>
    //   82  180:aload_0         
    //   83  181:invokevirtual   #323 <Method void requestUpdate()>
    //   84  184:return          
    }

    public void updateTemps()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field ArrayList itemsList>
    //    2    4:invokevirtual   #314 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokeinterface #320 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_1         
    //    9   19:invokeinterface #327 <Method Object Iterator.next()>
    //   10   24:checkcast       #276 <Class SuperSurfaceItem>
    //   11   27:astore_2        
    //   12   28:aload_2         
    //   13   29:aload_0         
    //   14   30:aload_2         
    //   15   31:getfield        #289 <Field float SuperSurfaceItem.width>
    //   16   34:invokevirtual   #283 <Method float fixToSize(float)>
    //   17   37:putfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //   18   40:aload_2         
    //   19   41:aload_0         
    //   20   42:aload_2         
    //   21   43:getfield        #279 <Field float SuperSurfaceItem.height>
    //   22   46:invokevirtual   #283 <Method float fixToSize(float)>
    //   23   49:putfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //   24   52:aload_2         
    //   25   53:getfield        #295 <Field float SuperSurfaceItem.posX>
    //   26   56:fconst_0        
    //   27   57:fcmpl           
    //   28   58:ifne            105
    //   29   61:aload_2         
    //   30   62:getfield        #301 <Field float SuperSurfaceItem.posY>
    //   31   65:fconst_0        
    //   32   66:fcmpl           
    //   33   67:ifne            105
    //   34   70:aload_2         
    //   35   71:aload_0         
    //   36   72:aload_0         
    //   37   73:aload_2         
    //   38   74:getfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   39   77:invokevirtual   #420 <Method float resetFixedSize(float)>
    //   40   80:invokevirtual   #283 <Method float fixToSize(float)>
    //   41   83:putfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   42   86:aload_2         
    //   43   87:aload_0         
    //   44   88:aload_0         
    //   45   89:aload_2         
    //   46   90:getfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   47   93:invokevirtual   #420 <Method float resetFixedSize(float)>
    //   48   96:invokevirtual   #283 <Method float fixToSize(float)>
    //   49   99:putfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   50  102:goto            8
    //   51  105:aload_2         
    //   52  106:aload_0         
    //   53  107:aload_2         
    //   54  108:getfield        #295 <Field float SuperSurfaceItem.posX>
    //   55  111:invokevirtual   #283 <Method float fixToSize(float)>
    //   56  114:putfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   57  117:aload_2         
    //   58  118:aload_0         
    //   59  119:aload_2         
    //   60  120:getfield        #301 <Field float SuperSurfaceItem.posY>
    //   61  123:invokevirtual   #283 <Method float fixToSize(float)>
    //   62  126:putfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   63  129:goto            8
    }

    public void updateTempsChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field ArrayList itemsList>
    //    2    4:invokevirtual   #314 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokeinterface #320 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_1         
    //    9   19:invokeinterface #327 <Method Object Iterator.next()>
    //   10   24:checkcast       #276 <Class SuperSurfaceItem>
    //   11   27:astore_2        
    //   12   28:aload_2         
    //   13   29:aload_0         
    //   14   30:aload_2         
    //   15   31:getfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //   16   34:invokestatic    #584 <Method int resetFixedSizeLast(float)>
    //   17   37:i2f             
    //   18   38:invokevirtual   #283 <Method float fixToSize(float)>
    //   19   41:putfield        #292 <Field float SuperSurfaceItem.tempWidth>
    //   20   44:aload_2         
    //   21   45:aload_0         
    //   22   46:aload_2         
    //   23   47:getfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //   24   50:invokestatic    #584 <Method int resetFixedSizeLast(float)>
    //   25   53:i2f             
    //   26   54:invokevirtual   #283 <Method float fixToSize(float)>
    //   27   57:putfield        #286 <Field float SuperSurfaceItem.tempHeight>
    //   28   60:aload_2         
    //   29   61:aload_0         
    //   30   62:aload_2         
    //   31   63:getfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   32   66:invokestatic    #584 <Method int resetFixedSizeLast(float)>
    //   33   69:i2f             
    //   34   70:invokevirtual   #283 <Method float fixToSize(float)>
    //   35   73:putfield        #298 <Field float SuperSurfaceItem.tempPosX>
    //   36   76:aload_2         
    //   37   77:aload_0         
    //   38   78:aload_2         
    //   39   79:getfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   40   82:invokestatic    #584 <Method int resetFixedSizeLast(float)>
    //   41   85:i2f             
    //   42   86:invokevirtual   #283 <Method float fixToSize(float)>
    //   43   89:putfield        #304 <Field float SuperSurfaceItem.tempPosY>
    //   44   92:goto            8
    }

    static Bitmap canvasBackground;
    static String canvasBackgroundPath;
    static Bitmap canvasFilter;
    static String canvasFilterPath;
    static Bitmap canvasFrame;
    static String canvasFramePath;
    static int canvasHeight;
    static Bitmap canvasOriginalFilter;
    static Bitmap canvasOriginalFrame;
    static int canvasWidth;
    public static SuperSurfaceItem currentTextItemVar;
    private static int filterOpacity;
    static int lastScreenHeight;
    static int lastScreenWidth;
    static Bitmap originalCanvasBackground;
    static int screenHeight;
    static int screenWidth;
    static int startPosX;
    static int startPosY;
    public static boolean update;
    String TAG;
    Context context;
    float currentPointersSizeDiffe;
    Bitmap deleteCornerBitmap;
    boolean firstTime;
    SurfaceHolder holder;
    boolean isItOK;
    boolean isTwoPointers;
    ArrayList itemsList;
    float lastChangePercent;
    float lastPointersXDiffe;
    float lastPointersYDiffe;
    SuperSurfaceItem lastSelectedItem;
    float lastTouchX;
    float lastTouchY;
    int movePointerID;
    boolean pinchZoomActive;
    int pinchZoomRate;
    Bitmap resizePinActiveBitmap;
    Bitmap resizePinBitmap;
    Bitmap rotatePinActiveBitmap;
    Bitmap rotatePinBitmap;
    SuperSurfaceItem selectedItem;
    private int startUpOpacity;
    private int stateToSave;
    Thread t;
    View thisView;
    boolean threadIsWorking;
    ExecutorService tpe;

    static int access$0(SuperSurface supersurface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #152 <Field int startUpOpacity>
    //    2    4:ireturn         
    }

    static void access$1(SuperSurface supersurface, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #152 <Field int startUpOpacity>
    //    3    5:return          
    }

    // Unreferenced inner class codeadore/textgram/SuperSurface$1

/* anonymous class */
    class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field SuperSurface this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field SuperSurface this$0>
        //    2    4:getfield        #26  <Field View SuperSurface.thisView>
        //    3    7:invokevirtual   #32  <Method int View.getHeight()>
        //    4   10:putstatic       #36  <Field int SuperSurface.screenHeight>
        //    5   13:aload_0         
        //    6   14:getfield        #16  <Field SuperSurface this$0>
        //    7   17:getfield        #26  <Field View SuperSurface.thisView>
        //    8   20:invokevirtual   #39  <Method int View.getWidth()>
        //    9   23:putstatic       #42  <Field int SuperSurface.screenWidth>
        //   10   26:aload_0         
        //   11   27:getfield        #16  <Field SuperSurface this$0>
        //   12   30:getfield        #46  <Field boolean SuperSurface.firstTime>
        //   13   33:ifeq            70
        //   14   36:aload_0         
        //   15   37:getfield        #16  <Field SuperSurface this$0>
        //   16   40:getfield        #26  <Field View SuperSurface.thisView>
        //   17   43:invokevirtual   #32  <Method int View.getHeight()>
        //   18   46:putstatic       #49  <Field int SuperSurface.lastScreenHeight>
        //   19   49:aload_0         
        //   20   50:getfield        #16  <Field SuperSurface this$0>
        //   21   53:getfield        #26  <Field View SuperSurface.thisView>
        //   22   56:invokevirtual   #39  <Method int View.getWidth()>
        //   23   59:putstatic       #52  <Field int SuperSurface.lastScreenWidth>
        //   24   62:aload_0         
        //   25   63:getfield        #16  <Field SuperSurface this$0>
        //   26   66:iconst_0        
        //   27   67:putfield        #46  <Field boolean SuperSurface.firstTime>
        //   28   70:iconst_0        
        //   29   71:putstatic       #55  <Field int SuperSurface.startPosX>
        //   30   74:iconst_0        
        //   31   75:putstatic       #58  <Field int SuperSurface.startPosY>
        //   32   78:getstatic       #42  <Field int SuperSurface.screenWidth>
        //   33   81:getstatic       #36  <Field int SuperSurface.screenHeight>
        //   34   84:icmple          101
        //   35   87:getstatic       #42  <Field int SuperSurface.screenWidth>
        //   36   90:iconst_2        
        //   37   91:idiv            
        //   38   92:getstatic       #36  <Field int SuperSurface.screenHeight>
        //   39   95:iconst_2        
        //   40   96:idiv            
        //   41   97:isub            
        //   42   98:putstatic       #55  <Field int SuperSurface.startPosX>
        //   43  101:getstatic       #36  <Field int SuperSurface.screenHeight>
        //   44  104:getstatic       #42  <Field int SuperSurface.screenWidth>
        //   45  107:icmple          124
        //   46  110:getstatic       #36  <Field int SuperSurface.screenHeight>
        //   47  113:iconst_2        
        //   48  114:idiv            
        //   49  115:getstatic       #42  <Field int SuperSurface.screenWidth>
        //   50  118:iconst_2        
        //   51  119:idiv            
        //   52  120:isub            
        //   53  121:putstatic       #58  <Field int SuperSurface.startPosY>
        //   54  124:aload_0         
        //   55  125:getfield        #16  <Field SuperSurface this$0>
        //   56  128:getfield        #62  <Field Context SuperSurface.context>
        //   57  131:ldc1            #64  <String "[assets]/data/supersurface_del.png">
        //   58  133:invokestatic    #70  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   59  136:astore_1        
        //   60  137:aload_0         
        //   61  138:getfield        #16  <Field SuperSurface this$0>
        //   62  141:getfield        #62  <Field Context SuperSurface.context>
        //   63  144:ldc1            #72  <String "[assets]/data/resize_pin.png">
        //   64  146:invokestatic    #70  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   65  149:astore_2        
        //   66  150:aload_0         
        //   67  151:getfield        #16  <Field SuperSurface this$0>
        //   68  154:getfield        #62  <Field Context SuperSurface.context>
        //   69  157:ldc1            #74  <String "[assets]/data/resize_pin_active.png">
        //   70  159:invokestatic    #70  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   71  162:astore_3        
        //   72  163:aload_0         
        //   73  164:getfield        #16  <Field SuperSurface this$0>
        //   74  167:getfield        #62  <Field Context SuperSurface.context>
        //   75  170:ldc1            #76  <String "[assets]/data/rotate_pin.png">
        //   76  172:invokestatic    #70  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   77  175:astore          4
        //   78  177:aload_0         
        //   79  178:getfield        #16  <Field SuperSurface this$0>
        //   80  181:getfield        #62  <Field Context SuperSurface.context>
        //   81  184:ldc1            #78  <String "[assets]/data/rotate_pin_active.png">
        //   82  186:invokestatic    #70  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   83  189:astore          5
        // try 191 387 handler(s) 388
        //   84  191:aload_0         
        //   85  192:getfield        #16  <Field SuperSurface this$0>
        //   86  195:aload_1         
        //   87  196:aload_0         
        //   88  197:getfield        #16  <Field SuperSurface this$0>
        //   89  200:aload_1         
        //   90  201:invokevirtual   #81  <Method int Bitmap.getWidth()>
        //   91  204:i2f             
        //   92  205:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //   93  208:f2i             
        //   94  209:aload_0         
        //   95  210:getfield        #16  <Field SuperSurface this$0>
        //   96  213:aload_1         
        //   97  214:invokevirtual   #86  <Method int Bitmap.getHeight()>
        //   98  217:i2f             
        //   99  218:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  100  221:f2i             
        //  101  222:iconst_1        
        //  102  223:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  103  226:putfield        #94  <Field Bitmap SuperSurface.deleteCornerBitmap>
        //  104  229:aload_0         
        //  105  230:getfield        #16  <Field SuperSurface this$0>
        //  106  233:aload_2         
        //  107  234:aload_0         
        //  108  235:getfield        #16  <Field SuperSurface this$0>
        //  109  238:aload_2         
        //  110  239:invokevirtual   #81  <Method int Bitmap.getWidth()>
        //  111  242:i2f             
        //  112  243:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  113  246:f2i             
        //  114  247:aload_0         
        //  115  248:getfield        #16  <Field SuperSurface this$0>
        //  116  251:aload_2         
        //  117  252:invokevirtual   #86  <Method int Bitmap.getHeight()>
        //  118  255:i2f             
        //  119  256:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  120  259:f2i             
        //  121  260:iconst_1        
        //  122  261:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  123  264:putfield        #97  <Field Bitmap SuperSurface.resizePinBitmap>
        //  124  267:aload_0         
        //  125  268:getfield        #16  <Field SuperSurface this$0>
        //  126  271:aload_3         
        //  127  272:aload_0         
        //  128  273:getfield        #16  <Field SuperSurface this$0>
        //  129  276:aload_3         
        //  130  277:invokevirtual   #81  <Method int Bitmap.getWidth()>
        //  131  280:i2f             
        //  132  281:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  133  284:f2i             
        //  134  285:aload_0         
        //  135  286:getfield        #16  <Field SuperSurface this$0>
        //  136  289:aload_3         
        //  137  290:invokevirtual   #86  <Method int Bitmap.getHeight()>
        //  138  293:i2f             
        //  139  294:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  140  297:f2i             
        //  141  298:iconst_1        
        //  142  299:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  143  302:putfield        #100 <Field Bitmap SuperSurface.resizePinActiveBitmap>
        //  144  305:aload_0         
        //  145  306:getfield        #16  <Field SuperSurface this$0>
        //  146  309:aload           4
        //  147  311:aload_0         
        //  148  312:getfield        #16  <Field SuperSurface this$0>
        //  149  315:aload           4
        //  150  317:invokevirtual   #81  <Method int Bitmap.getWidth()>
        //  151  320:i2f             
        //  152  321:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  153  324:f2i             
        //  154  325:aload_0         
        //  155  326:getfield        #16  <Field SuperSurface this$0>
        //  156  329:aload           4
        //  157  331:invokevirtual   #86  <Method int Bitmap.getHeight()>
        //  158  334:i2f             
        //  159  335:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  160  338:f2i             
        //  161  339:iconst_1        
        //  162  340:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  163  343:putfield        #103 <Field Bitmap SuperSurface.rotatePinBitmap>
        //  164  346:aload_0         
        //  165  347:getfield        #16  <Field SuperSurface this$0>
        //  166  350:aload           5
        //  167  352:aload_0         
        //  168  353:getfield        #16  <Field SuperSurface this$0>
        //  169  356:aload           5
        //  170  358:invokevirtual   #81  <Method int Bitmap.getWidth()>
        //  171  361:i2f             
        //  172  362:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  173  365:f2i             
        //  174  366:aload_0         
        //  175  367:getfield        #16  <Field SuperSurface this$0>
        //  176  370:aload           5
        //  177  372:invokevirtual   #86  <Method int Bitmap.getHeight()>
        //  178  375:i2f             
        //  179  376:invokevirtual   #85  <Method float SuperSurface.fixToSize(float)>
        //  180  379:f2i             
        //  181  380:iconst_1        
        //  182  381:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  183  384:putfield        #106 <Field Bitmap SuperSurface.rotatePinActiveBitmap>
        //  184  387:return          
        // catch Exception
        //  185  388:astore          6
        //  186  390:aload           6
        //  187  392:invokevirtual   #109 <Method void Exception.printStackTrace()>
        //  188  395:return          
        }

        final SuperSurface this$0;
    }


    // Unreferenced inner class codeadore/textgram/SuperSurface$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnTouchListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field SuperSurface this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field GestureDetector val$mGesDetect>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field GestureDetector val$mGesDetect>
        //    2    4:aload_2         
        //    3    5:invokevirtual   #33  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
        //    4    8:pop             
        //    5    9:aload_2         
        //    6   10:invokevirtual   #39  <Method float MotionEvent.getX()>
        //    7   13:fstore          4
        //    8   15:aload_2         
        //    9   16:invokevirtual   #42  <Method float MotionEvent.getY()>
        //   10   19:fstore          5
        //   11   21:aload_2         
        //   12   22:invokevirtual   #46  <Method int MotionEvent.getAction()>
        //   13   25:tableswitch     0 2: default 52
        //                       0 54
        //                       1 2626
        //                       2 859
        //   14   52:iconst_1        
        //   15   53:ireturn         
        //   16   54:iconst_0        
        //   17   55:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
        //   18   58:astore          46
        //   19   60:aload_0         
        //   20   61:getfield        #18  <Field SuperSurface this$0>
        //   21   64:getfield        #56  <Field ArrayList SuperSurface.itemsList>
        //   22   67:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
        //   23   70:astore          47
        //   24   72:aload           47
        //   25   74:invokeinterface #68  <Method boolean Iterator.hasNext()>
        //   26   79:ifne            159
        //   27   82:aload_0         
        //   28   83:getfield        #18  <Field SuperSurface this$0>
        //   29   86:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //   30   89:ifnull          114
        //   31   92:aload_0         
        //   32   93:getfield        #18  <Field SuperSurface this$0>
        //   33   96:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //   34   99:iconst_1        
        //   35  100:putfield        #78  <Field boolean SuperSurfaceItem.selected>
        //   36  103:aload_0         
        //   37  104:getfield        #18  <Field SuperSurface this$0>
        //   38  107:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //   39  110:iconst_1        
        //   40  111:putfield        #81  <Field boolean SuperSurfaceItem.highlight>
        //   41  114:aload           46
        //   42  116:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
        //   43  119:ifne            152
        //   44  122:aload_0         
        //   45  123:getfield        #18  <Field SuperSurface this$0>
        //   46  126:aconst_null     
        //   47  127:putfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //   48  130:aload_0         
        //   49  131:getfield        #18  <Field SuperSurface this$0>
        //   50  134:getfield        #56  <Field ArrayList SuperSurface.itemsList>
        //   51  137:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
        //   52  140:astore          69
        //   53  142:aload           69
        //   54  144:invokeinterface #68  <Method boolean Iterator.hasNext()>
        //   55  149:ifne            832
        //   56  152:iconst_1        
        //   57  153:putstatic       #87  <Field boolean SuperSurface.update>
        //   58  156:goto            52
        //   59  159:aload           47
        //   60  161:invokeinterface #91  <Method Object Iterator.next()>
        //   61  166:checkcast       #74  <Class SuperSurfaceItem>
        //   62  169:astore          48
        //   63  171:fload           4
        //   64  173:aload           48
        //   65  175:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //   66  178:getstatic       #99  <Field int SuperSurface.startPosX>
        //   67  181:i2f             
        //   68  182:fadd            
        //   69  183:fcmpl           
        //   70  184:ifle            321
        //   71  187:fload           4
        //   72  189:aload           48
        //   73  191:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //   74  194:getstatic       #99  <Field int SuperSurface.startPosX>
        //   75  197:i2f             
        //   76  198:fadd            
        //   77  199:aload           48
        //   78  201:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //   79  204:fadd            
        //   80  205:fcmpg           
        //   81  206:ifge            321
        //   82  209:fload           5
        //   83  211:aload           48
        //   84  213:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //   85  216:getstatic       #108 <Field int SuperSurface.startPosY>
        //   86  219:i2f             
        //   87  220:fadd            
        //   88  221:fcmpl           
        //   89  222:ifle            321
        //   90  225:fload           5
        //   91  227:aload           48
        //   92  229:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //   93  232:aload           48
        //   94  234:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //   95  237:fadd            
        //   96  238:getstatic       #108 <Field int SuperSurface.startPosY>
        //   97  241:i2f             
        //   98  242:fadd            
        //   99  243:fcmpg           
        //  100  244:ifge            321
        //  101  247:aload_0         
        //  102  248:getfield        #18  <Field SuperSurface this$0>
        //  103  251:aload           48
        //  104  253:putfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  105  256:aload           48
        //  106  258:getfield        #115 <Field String SuperSurfaceItem.type>
        //  107  261:ldc1            #117 <String "text">
        //  108  263:if_acmpne       276
        //  109  266:aload_0         
        //  110  267:getfield        #18  <Field SuperSurface this$0>
        //  111  270:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  112  273:putstatic       #120 <Field SuperSurfaceItem SuperSurface.currentTextItemVar>
        //  113  276:aload_0         
        //  114  277:getfield        #18  <Field SuperSurface this$0>
        //  115  280:aload           48
        //  116  282:putfield        #123 <Field SuperSurfaceItem SuperSurface.lastSelectedItem>
        //  117  285:aload_0         
        //  118  286:getfield        #18  <Field SuperSurface this$0>
        //  119  289:aload_2         
        //  120  290:iconst_0        
        //  121  291:invokevirtual   #127 <Method int MotionEvent.getPointerId(int)>
        //  122  294:putfield        #130 <Field int SuperSurface.movePointerID>
        //  123  297:aload_0         
        //  124  298:getfield        #18  <Field SuperSurface this$0>
        //  125  301:fload           4
        //  126  303:putfield        #133 <Field float SuperSurface.lastTouchX>
        //  127  306:aload_0         
        //  128  307:getfield        #18  <Field SuperSurface this$0>
        //  129  310:fload           5
        //  130  312:putfield        #136 <Field float SuperSurface.lastTouchY>
        //  131  315:iconst_1        
        //  132  316:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
        //  133  319:astore          46
        //  134  321:aload_0         
        //  135  322:getfield        #18  <Field SuperSurface this$0>
        //  136  325:ldc1            #137 <Float 48F>
        //  137  327:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  138  330:fstore          49
        //  139  332:aload_0         
        //  140  333:getfield        #18  <Field SuperSurface this$0>
        //  141  336:ldc1            #142 <Float 12F>
        //  142  338:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  143  341:fstore          50
        //  144  343:getstatic       #99  <Field int SuperSurface.startPosX>
        //  145  346:i2f             
        //  146  347:aload           48
        //  147  349:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  148  352:fadd            
        //  149  353:aload           48
        //  150  355:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  151  358:fconst_2        
        //  152  359:fdiv            
        //  153  360:fadd            
        //  154  361:fstore          51
        //  155  363:getstatic       #108 <Field int SuperSurface.startPosY>
        //  156  366:i2f             
        //  157  367:aload           48
        //  158  369:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  159  372:fadd            
        //  160  373:aload           48
        //  161  375:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  162  378:fconst_2        
        //  163  379:fdiv            
        //  164  380:fadd            
        //  165  381:fstore          52
        //  166  383:getstatic       #99  <Field int SuperSurface.startPosX>
        //  167  386:i2f             
        //  168  387:aload           48
        //  169  389:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  170  392:fadd            
        //  171  393:aload           48
        //  172  395:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  173  398:fadd            
        //  174  399:fstore          53
        //  175  401:getstatic       #108 <Field int SuperSurface.startPosY>
        //  176  404:i2f             
        //  177  405:aload           48
        //  178  407:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  179  410:fadd            
        //  180  411:aload           48
        //  181  413:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  182  416:fadd            
        //  183  417:fstore          54
        //  184  419:aload           48
        //  185  421:getfield        #145 <Field int SuperSurfaceItem.rotation>
        //  186  424:i2d             
        //  187  425:invokestatic    #151 <Method double Math.toRadians(double)>
        //  188  428:invokestatic    #154 <Method double Math.cos(double)>
        //  189  431:dstore          55
        //  190  433:aload           48
        //  191  435:getfield        #145 <Field int SuperSurfaceItem.rotation>
        //  192  438:i2d             
        //  193  439:invokestatic    #151 <Method double Math.toRadians(double)>
        //  194  442:invokestatic    #157 <Method double Math.sin(double)>
        //  195  445:dstore          57
        //  196  447:dload           55
        //  197  449:fload           53
        //  198  451:fload           51
        //  199  453:fsub            
        //  200  454:f2d             
        //  201  455:dmul            
        //  202  456:dload           57
        //  203  458:fload           54
        //  204  460:fload           52
        //  205  462:fsub            
        //  206  463:f2d             
        //  207  464:dmul            
        //  208  465:dsub            
        //  209  466:fload           51
        //  210  468:f2d             
        //  211  469:dadd            
        //  212  470:dstore          59
        //  213  472:dload           57
        //  214  474:fload           53
        //  215  476:fload           51
        //  216  478:fsub            
        //  217  479:f2d             
        //  218  480:dmul            
        //  219  481:dload           55
        //  220  483:fload           54
        //  221  485:fload           52
        //  222  487:fsub            
        //  223  488:f2d             
        //  224  489:dmul            
        //  225  490:dadd            
        //  226  491:fload           52
        //  227  493:f2d             
        //  228  494:dadd            
        //  229  495:dstore          61
        //  230  497:fload           4
        //  231  499:f2d             
        //  232  500:dload           59
        //  233  502:fload           50
        //  234  504:f2d             
        //  235  505:dsub            
        //  236  506:dcmpl           
        //  237  507:ifle            617
        //  238  510:fload           4
        //  239  512:f2d             
        //  240  513:dload           59
        //  241  515:fload           49
        //  242  517:f2d             
        //  243  518:dadd            
        //  244  519:fload           50
        //  245  521:f2d             
        //  246  522:dadd            
        //  247  523:dcmpg           
        //  248  524:ifge            617
        //  249  527:fload           5
        //  250  529:f2d             
        //  251  530:dload           61
        //  252  532:fload           50
        //  253  534:f2d             
        //  254  535:dsub            
        //  255  536:dcmpl           
        //  256  537:ifle            617
        //  257  540:fload           5
        //  258  542:f2d             
        //  259  543:dload           61
        //  260  545:fload           49
        //  261  547:f2d             
        //  262  548:dadd            
        //  263  549:fload           50
        //  264  551:f2d             
        //  265  552:dadd            
        //  266  553:dcmpg           
        //  267  554:ifge            617
        //  268  557:aload_0         
        //  269  558:getfield        #18  <Field SuperSurface this$0>
        //  270  561:aload           48
        //  271  563:putfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  272  566:aload_0         
        //  273  567:getfield        #18  <Field SuperSurface this$0>
        //  274  570:aload           48
        //  275  572:putfield        #123 <Field SuperSurfaceItem SuperSurface.lastSelectedItem>
        //  276  575:aload           48
        //  277  577:iconst_1        
        //  278  578:putfield        #160 <Field boolean SuperSurfaceItem.resizePinActive>
        //  279  581:aload_0         
        //  280  582:getfield        #18  <Field SuperSurface this$0>
        //  281  585:aload_2         
        //  282  586:iconst_0        
        //  283  587:invokevirtual   #127 <Method int MotionEvent.getPointerId(int)>
        //  284  590:putfield        #130 <Field int SuperSurface.movePointerID>
        //  285  593:aload_0         
        //  286  594:getfield        #18  <Field SuperSurface this$0>
        //  287  597:fload           4
        //  288  599:putfield        #133 <Field float SuperSurface.lastTouchX>
        //  289  602:aload_0         
        //  290  603:getfield        #18  <Field SuperSurface this$0>
        //  291  606:fload           5
        //  292  608:putfield        #136 <Field float SuperSurface.lastTouchY>
        //  293  611:iconst_1        
        //  294  612:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
        //  295  615:astore          46
        //  296  617:getstatic       #99  <Field int SuperSurface.startPosX>
        //  297  620:i2f             
        //  298  621:aload           48
        //  299  623:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  300  626:fadd            
        //  301  627:fstore          63
        //  302  629:getstatic       #108 <Field int SuperSurface.startPosY>
        //  303  632:i2f             
        //  304  633:aload           48
        //  305  635:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  306  638:fadd            
        //  307  639:aload           48
        //  308  641:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  309  644:fadd            
        //  310  645:fstore          64
        //  311  647:dload           55
        //  312  649:fload           63
        //  313  651:fload           51
        //  314  653:fsub            
        //  315  654:f2d             
        //  316  655:dmul            
        //  317  656:dload           57
        //  318  658:fload           64
        //  319  660:fload           52
        //  320  662:fsub            
        //  321  663:f2d             
        //  322  664:dmul            
        //  323  665:dsub            
        //  324  666:fload           51
        //  325  668:f2d             
        //  326  669:dadd            
        //  327  670:dstore          65
        //  328  672:dload           57
        //  329  674:fload           63
        //  330  676:fload           51
        //  331  678:fsub            
        //  332  679:f2d             
        //  333  680:dmul            
        //  334  681:dload           55
        //  335  683:fload           64
        //  336  685:fload           52
        //  337  687:fsub            
        //  338  688:f2d             
        //  339  689:dmul            
        //  340  690:dadd            
        //  341  691:fload           52
        //  342  693:f2d             
        //  343  694:dadd            
        //  344  695:dstore          67
        //  345  697:fload           4
        //  346  699:f2d             
        //  347  700:dload           65
        //  348  702:fload           50
        //  349  704:f2d             
        //  350  705:dsub            
        //  351  706:dcmpl           
        //  352  707:ifle            817
        //  353  710:fload           4
        //  354  712:f2d             
        //  355  713:dload           65
        //  356  715:fload           49
        //  357  717:f2d             
        //  358  718:dadd            
        //  359  719:fload           50
        //  360  721:f2d             
        //  361  722:dadd            
        //  362  723:dcmpg           
        //  363  724:ifge            817
        //  364  727:fload           5
        //  365  729:f2d             
        //  366  730:dload           67
        //  367  732:fload           50
        //  368  734:f2d             
        //  369  735:dsub            
        //  370  736:dcmpl           
        //  371  737:ifle            817
        //  372  740:fload           5
        //  373  742:f2d             
        //  374  743:dload           67
        //  375  745:fload           49
        //  376  747:f2d             
        //  377  748:dadd            
        //  378  749:fload           50
        //  379  751:f2d             
        //  380  752:dadd            
        //  381  753:dcmpg           
        //  382  754:ifge            817
        //  383  757:aload_0         
        //  384  758:getfield        #18  <Field SuperSurface this$0>
        //  385  761:aload           48
        //  386  763:putfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  387  766:aload_0         
        //  388  767:getfield        #18  <Field SuperSurface this$0>
        //  389  770:aload           48
        //  390  772:putfield        #123 <Field SuperSurfaceItem SuperSurface.lastSelectedItem>
        //  391  775:aload           48
        //  392  777:iconst_1        
        //  393  778:putfield        #163 <Field boolean SuperSurfaceItem.rotatePinActive>
        //  394  781:aload_0         
        //  395  782:getfield        #18  <Field SuperSurface this$0>
        //  396  785:aload_2         
        //  397  786:iconst_0        
        //  398  787:invokevirtual   #127 <Method int MotionEvent.getPointerId(int)>
        //  399  790:putfield        #130 <Field int SuperSurface.movePointerID>
        //  400  793:aload_0         
        //  401  794:getfield        #18  <Field SuperSurface this$0>
        //  402  797:fload           4
        //  403  799:putfield        #133 <Field float SuperSurface.lastTouchX>
        //  404  802:aload_0         
        //  405  803:getfield        #18  <Field SuperSurface this$0>
        //  406  806:fload           5
        //  407  808:putfield        #136 <Field float SuperSurface.lastTouchY>
        //  408  811:iconst_1        
        //  409  812:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
        //  410  815:astore          46
        //  411  817:aload           48
        //  412  819:iconst_0        
        //  413  820:putfield        #78  <Field boolean SuperSurfaceItem.selected>
        //  414  823:aload           48
        //  415  825:iconst_0        
        //  416  826:putfield        #81  <Field boolean SuperSurfaceItem.highlight>
        //  417  829:goto            72
        //  418  832:aload           69
        //  419  834:invokeinterface #91  <Method Object Iterator.next()>
        //  420  839:checkcast       #74  <Class SuperSurfaceItem>
        //  421  842:astore          70
        //  422  844:aload           70
        //  423  846:iconst_0        
        //  424  847:putfield        #78  <Field boolean SuperSurfaceItem.selected>
        //  425  850:aload           70
        //  426  852:iconst_0        
        //  427  853:putfield        #81  <Field boolean SuperSurfaceItem.highlight>
        //  428  856:goto            142
        //  429  859:aload_2         
        //  430  860:aload_0         
        //  431  861:getfield        #18  <Field SuperSurface this$0>
        //  432  864:getfield        #130 <Field int SuperSurface.movePointerID>
        //  433  867:invokevirtual   #166 <Method int MotionEvent.findPointerIndex(int)>
        //  434  870:istore          8
        //  435  872:aload_0         
        //  436  873:getfield        #18  <Field SuperSurface this$0>
        //  437  876:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  438  879:ifnull          1820
        //  439  882:aload_2         
        //  440  883:invokevirtual   #169 <Method int MotionEvent.getPointerCount()>
        //  441  886:iconst_2        
        //  442  887:icmpne          2237
        //  443  890:aload_2         
        //  444  891:iconst_0        
        //  445  892:invokevirtual   #172 <Method float MotionEvent.getX(int)>
        //  446  895:getstatic       #99  <Field int SuperSurface.startPosX>
        //  447  898:i2f             
        //  448  899:fadd            
        //  449  900:fstore          24
        //  450  902:aload_2         
        //  451  903:iconst_0        
        //  452  904:invokevirtual   #174 <Method float MotionEvent.getY(int)>
        //  453  907:getstatic       #108 <Field int SuperSurface.startPosY>
        //  454  910:i2f             
        //  455  911:fadd            
        //  456  912:fstore          25
        //  457  914:aload_2         
        //  458  915:iconst_1        
        //  459  916:invokevirtual   #172 <Method float MotionEvent.getX(int)>
        //  460  919:getstatic       #99  <Field int SuperSurface.startPosX>
        //  461  922:i2f             
        //  462  923:fadd            
        //  463  924:fstore          26
        //  464  926:aload_2         
        //  465  927:iconst_1        
        //  466  928:invokevirtual   #174 <Method float MotionEvent.getY(int)>
        //  467  931:getstatic       #108 <Field int SuperSurface.startPosY>
        //  468  934:i2f             
        //  469  935:fadd            
        //  470  936:fstore          27
        //  471  938:fload           26
        //  472  940:aload_0         
        //  473  941:getfield        #18  <Field SuperSurface this$0>
        //  474  944:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  475  947:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  476  950:getstatic       #99  <Field int SuperSurface.startPosX>
        //  477  953:i2f             
        //  478  954:fadd            
        //  479  955:fcmpl           
        //  480  956:ifle            1052
        //  481  959:fload           26
        //  482  961:aload_0         
        //  483  962:getfield        #18  <Field SuperSurface this$0>
        //  484  965:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  485  968:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  486  971:getstatic       #99  <Field int SuperSurface.startPosX>
        //  487  974:i2f             
        //  488  975:fadd            
        //  489  976:aload_0         
        //  490  977:getfield        #18  <Field SuperSurface this$0>
        //  491  980:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  492  983:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  493  986:fadd            
        //  494  987:fcmpg           
        //  495  988:ifge            1052
        //  496  991:fload           27
        //  497  993:aload_0         
        //  498  994:getfield        #18  <Field SuperSurface this$0>
        //  499  997:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  500 1000:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  501 1003:getstatic       #108 <Field int SuperSurface.startPosY>
        //  502 1006:i2f             
        //  503 1007:fadd            
        //  504 1008:fcmpl           
        //  505 1009:ifle            1052
        //  506 1012:fload           27
        //  507 1014:aload_0         
        //  508 1015:getfield        #18  <Field SuperSurface this$0>
        //  509 1018:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  510 1021:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  511 1024:getstatic       #108 <Field int SuperSurface.startPosY>
        //  512 1027:i2f             
        //  513 1028:fadd            
        //  514 1029:aload_0         
        //  515 1030:getfield        #18  <Field SuperSurface this$0>
        //  516 1033:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  517 1036:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  518 1039:fadd            
        //  519 1040:fcmpg           
        //  520 1041:ifge            1052
        //  521 1044:aload_0         
        //  522 1045:getfield        #18  <Field SuperSurface this$0>
        //  523 1048:iconst_1        
        //  524 1049:putfield        #177 <Field boolean SuperSurface.isTwoPointers>
        //  525 1052:aload_0         
        //  526 1053:getfield        #18  <Field SuperSurface this$0>
        //  527 1056:getfield        #180 <Field boolean SuperSurface.pinchZoomActive>
        //  528 1059:ifne            1125
        //  529 1062:aload_0         
        //  530 1063:getfield        #18  <Field SuperSurface this$0>
        //  531 1066:iconst_1        
        //  532 1067:putfield        #180 <Field boolean SuperSurface.pinchZoomActive>
        //  533 1070:fload           24
        //  534 1072:fload           26
        //  535 1074:fcmpl           
        //  536 1075:ifle            1827
        //  537 1078:fload           24
        //  538 1080:fload           26
        //  539 1082:fsub            
        //  540 1083:fstore          41
        //  541 1085:fload           25
        //  542 1087:fload           27
        //  543 1089:fcmpl           
        //  544 1090:ifle            1852
        //  545 1093:fload           25
        //  546 1095:fload           27
        //  547 1097:fsub            
        //  548 1098:fstore          43
        //  549 1100:fconst_2        
        //  550 1101:fload           41
        //  551 1103:fmul            
        //  552 1104:fconst_2        
        //  553 1105:fload           43
        //  554 1107:fmul            
        //  555 1108:fadd            
        //  556 1109:f2d             
        //  557 1110:invokestatic    #183 <Method double Math.sqrt(double)>
        //  558 1113:dstore          44
        //  559 1115:aload_0         
        //  560 1116:getfield        #18  <Field SuperSurface this$0>
        //  561 1119:dload           44
        //  562 1121:d2i             
        //  563 1122:putfield        #186 <Field int SuperSurface.pinchZoomRate>
        //  564 1125:fload           24
        //  565 1127:fload           26
        //  566 1129:fcmpl           
        //  567 1130:ifle            1877
        //  568 1133:fload           24
        //  569 1135:fload           26
        //  570 1137:fsub            
        //  571 1138:fstore          29
        //  572 1140:fload           25
        //  573 1142:fload           27
        //  574 1144:fcmpl           
        //  575 1145:ifle            1902
        //  576 1148:fload           25
        //  577 1150:fload           27
        //  578 1152:fsub            
        //  579 1153:fstore          31
        //  580 1155:ldc1            #187 <Float 100F>
        //  581 1157:fconst_2        
        //  582 1158:fload           29
        //  583 1160:fmul            
        //  584 1161:fconst_2        
        //  585 1162:fload           31
        //  586 1164:fmul            
        //  587 1165:fadd            
        //  588 1166:f2d             
        //  589 1167:invokestatic    #183 <Method double Math.sqrt(double)>
        //  590 1170:d2i             
        //  591 1171:i2f             
        //  592 1172:aload_0         
        //  593 1173:getfield        #18  <Field SuperSurface this$0>
        //  594 1176:getfield        #186 <Field int SuperSurface.pinchZoomRate>
        //  595 1179:i2f             
        //  596 1180:fdiv            
        //  597 1181:fmul            
        //  598 1182:fstore          32
        //  599 1184:aload_0         
        //  600 1185:getfield        #18  <Field SuperSurface this$0>
        //  601 1188:getfield        #190 <Field float SuperSurface.lastChangePercent>
        //  602 1191:fconst_0        
        //  603 1192:fcmpl           
        //  604 1193:ifeq            1349
        //  605 1196:fconst_0        
        //  606 1197:fstore          33
        //  607 1199:fconst_0        
        //  608 1200:fstore          34
        //  609 1202:fload           32
        //  610 1204:aload_0         
        //  611 1205:getfield        #18  <Field SuperSurface this$0>
        //  612 1208:getfield        #190 <Field float SuperSurface.lastChangePercent>
        //  613 1211:fcmpl           
        //  614 1212:ifle            2032
        //  615 1215:fload           32
        //  616 1217:aload_0         
        //  617 1218:getfield        #18  <Field SuperSurface this$0>
        //  618 1221:getfield        #190 <Field float SuperSurface.lastChangePercent>
        //  619 1224:fsub            
        //  620 1225:fstore          38
        //  621 1227:fload           38
        //  622 1229:ldc1            #187 <Float 100F>
        //  623 1231:fcmpl           
        //  624 1232:ifle            1927
        //  625 1235:bipush          50
        //  626 1237:istore          39
        //  627 1239:aload_0         
        //  628 1240:getfield        #18  <Field SuperSurface this$0>
        //  629 1243:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  630 1246:getfield        #115 <Field String SuperSurfaceItem.type>
        //  631 1249:ldc1            #117 <String "text">
        //  632 1251:if_acmpne       1997
        //  633 1254:aload_0         
        //  634 1255:getfield        #18  <Field SuperSurface this$0>
        //  635 1258:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  636 1261:aload_0         
        //  637 1262:getfield        #18  <Field SuperSurface this$0>
        //  638 1265:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  639 1268:getfield        #194 <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //  640 1271:invokevirtual   #199 <Method float el7rTextView.getTextSize()>
        //  641 1274:iload           39
        //  642 1276:iconst_3        
        //  643 1277:isub            
        //  644 1278:i2f             
        //  645 1279:fadd            
        //  646 1280:putfield        #202 <Field float SuperSurfaceItem.textSize>
        //  647 1283:getstatic       #120 <Field SuperSurfaceItem SuperSurface.currentTextItemVar>
        //  648 1286:invokevirtual   #205 <Method void SuperSurfaceItem.updateTextBitmap()>
        //  649 1289:fload           33
        //  650 1291:ldc1            #206 <Float 1000F>
        //  651 1293:fcmpg           
        //  652 1294:ifge            1349
        //  653 1297:fload           33
        //  654 1299:ldc1            #187 <Float 100F>
        //  655 1301:fcmpl           
        //  656 1302:ifle            1349
        //  657 1305:fload           34
        //  658 1307:ldc1            #206 <Float 1000F>
        //  659 1309:fcmpg           
        //  660 1310:ifge            1349
        //  661 1313:fload           34
        //  662 1315:ldc1            #187 <Float 100F>
        //  663 1317:fcmpl           
        //  664 1318:ifle            1349
        //  665 1321:aload_0         
        //  666 1322:getfield        #18  <Field SuperSurface this$0>
        //  667 1325:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  668 1328:fload           33
        //  669 1330:f2i             
        //  670 1331:i2f             
        //  671 1332:putfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  672 1335:aload_0         
        //  673 1336:getfield        #18  <Field SuperSurface this$0>
        //  674 1339:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  675 1342:fload           34
        //  676 1344:f2i             
        //  677 1345:i2f             
        //  678 1346:putfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  679 1349:aload_0         
        //  680 1350:getfield        #18  <Field SuperSurface this$0>
        //  681 1353:fload           32
        //  682 1355:putfield        #190 <Field float SuperSurface.lastChangePercent>
        //  683 1358:aload_0         
        //  684 1359:getfield        #18  <Field SuperSurface this$0>
        //  685 1362:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  686 1365:getfield        #160 <Field boolean SuperSurfaceItem.resizePinActive>
        //  687 1368:ifeq            1642
        //  688 1371:aload_0         
        //  689 1372:getfield        #18  <Field SuperSurface this$0>
        //  690 1375:getfield        #133 <Field float SuperSurface.lastTouchX>
        //  691 1378:fload           4
        //  692 1380:fsub            
        //  693 1381:fstore          18
        //  694 1383:aload_0         
        //  695 1384:getfield        #18  <Field SuperSurface this$0>
        //  696 1387:getfield        #136 <Field float SuperSurface.lastTouchY>
        //  697 1390:fload           5
        //  698 1392:fsub            
        //  699 1393:fstore          19
        //  700 1395:aload_0         
        //  701 1396:getfield        #18  <Field SuperSurface this$0>
        //  702 1399:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  703 1402:getfield        #115 <Field String SuperSurfaceItem.type>
        //  704 1405:ldc1            #117 <String "text">
        //  705 1407:if_acmpne       2490
        //  706 1410:aload_0         
        //  707 1411:getfield        #18  <Field SuperSurface this$0>
        //  708 1414:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  709 1417:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  710 1420:fload           18
        //  711 1422:fsub            
        //  712 1423:aload_0         
        //  713 1424:getfield        #18  <Field SuperSurface this$0>
        //  714 1427:ldc1            #187 <Float 100F>
        //  715 1429:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  716 1432:fcmpl           
        //  717 1433:ifle            1458
        //  718 1436:aload_0         
        //  719 1437:getfield        #18  <Field SuperSurface this$0>
        //  720 1440:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  721 1443:astore          23
        //  722 1445:aload           23
        //  723 1447:aload           23
        //  724 1449:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  725 1452:fload           18
        //  726 1454:fsub            
        //  727 1455:putfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  728 1458:aload_0         
        //  729 1459:getfield        #18  <Field SuperSurface this$0>
        //  730 1462:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  731 1465:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  732 1468:fload           19
        //  733 1470:fsub            
        //  734 1471:aload_0         
        //  735 1472:getfield        #18  <Field SuperSurface this$0>
        //  736 1475:ldc1            #187 <Float 100F>
        //  737 1477:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  738 1480:fcmpl           
        //  739 1481:ifle            1506
        //  740 1484:aload_0         
        //  741 1485:getfield        #18  <Field SuperSurface this$0>
        //  742 1488:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  743 1491:astore          22
        //  744 1493:aload           22
        //  745 1495:aload           22
        //  746 1497:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  747 1500:fload           19
        //  748 1502:fsub            
        //  749 1503:putfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  750 1506:aload_0         
        //  751 1507:getfield        #18  <Field SuperSurface this$0>
        //  752 1510:fload           4
        //  753 1512:putfield        #133 <Field float SuperSurface.lastTouchX>
        //  754 1515:aload_0         
        //  755 1516:getfield        #18  <Field SuperSurface this$0>
        //  756 1519:fload           5
        //  757 1521:putfield        #136 <Field float SuperSurface.lastTouchY>
        //  758 1524:aload_0         
        //  759 1525:getfield        #18  <Field SuperSurface this$0>
        //  760 1528:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  761 1531:aload_0         
        //  762 1532:getfield        #18  <Field SuperSurface this$0>
        //  763 1535:aload_0         
        //  764 1536:getfield        #18  <Field SuperSurface this$0>
        //  765 1539:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  766 1542:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  767 1545:invokevirtual   #209 <Method float SuperSurface.resetFixedSize(float)>
        //  768 1548:putfield        #212 <Field float SuperSurfaceItem.height>
        //  769 1551:aload_0         
        //  770 1552:getfield        #18  <Field SuperSurface this$0>
        //  771 1555:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  772 1558:aload_0         
        //  773 1559:getfield        #18  <Field SuperSurface this$0>
        //  774 1562:aload_0         
        //  775 1563:getfield        #18  <Field SuperSurface this$0>
        //  776 1566:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  777 1569:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  778 1572:invokevirtual   #209 <Method float SuperSurface.resetFixedSize(float)>
        //  779 1575:putfield        #215 <Field float SuperSurfaceItem.width>
        //  780 1578:aload_0         
        //  781 1579:getfield        #18  <Field SuperSurface this$0>
        //  782 1582:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  783 1585:aload_0         
        //  784 1586:getfield        #18  <Field SuperSurface this$0>
        //  785 1589:aload_0         
        //  786 1590:getfield        #18  <Field SuperSurface this$0>
        //  787 1593:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  788 1596:getfield        #215 <Field float SuperSurfaceItem.width>
        //  789 1599:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  790 1602:putfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  791 1605:aload_0         
        //  792 1606:getfield        #18  <Field SuperSurface this$0>
        //  793 1609:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  794 1612:aload_0         
        //  795 1613:getfield        #18  <Field SuperSurface this$0>
        //  796 1616:aload_0         
        //  797 1617:getfield        #18  <Field SuperSurface this$0>
        //  798 1620:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  799 1623:getfield        #212 <Field float SuperSurfaceItem.height>
        //  800 1626:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        //  801 1629:putfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  802 1632:aload_0         
        //  803 1633:getfield        #18  <Field SuperSurface this$0>
        //  804 1636:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  805 1639:invokevirtual   #205 <Method void SuperSurfaceItem.updateTextBitmap()>
        //  806 1642:aload_0         
        //  807 1643:getfield        #18  <Field SuperSurface this$0>
        //  808 1646:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  809 1649:getfield        #163 <Field boolean SuperSurfaceItem.rotatePinActive>
        //  810 1652:ifeq            1820
        //  811 1655:aload_0         
        //  812 1656:getfield        #18  <Field SuperSurface this$0>
        //  813 1659:getfield        #133 <Field float SuperSurface.lastTouchX>
        //  814 1662:fload           4
        //  815 1664:fsub            
        //  816 1665:pop             
        //  817 1666:aload_0         
        //  818 1667:getfield        #18  <Field SuperSurface this$0>
        //  819 1670:getfield        #136 <Field float SuperSurface.lastTouchY>
        //  820 1673:fload           5
        //  821 1675:fsub            
        //  822 1676:pop             
        //  823 1677:getstatic       #108 <Field int SuperSurface.startPosY>
        //  824 1680:i2f             
        //  825 1681:aload_0         
        //  826 1682:getfield        #18  <Field SuperSurface this$0>
        //  827 1685:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  828 1688:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        //  829 1691:fadd            
        //  830 1692:aload_0         
        //  831 1693:getfield        #18  <Field SuperSurface this$0>
        //  832 1696:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  833 1699:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  834 1702:fconst_2        
        //  835 1703:fdiv            
        //  836 1704:fadd            
        //  837 1705:fstore          13
        //  838 1707:getstatic       #99  <Field int SuperSurface.startPosX>
        //  839 1710:i2f             
        //  840 1711:aload_0         
        //  841 1712:getfield        #18  <Field SuperSurface this$0>
        //  842 1715:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  843 1718:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        //  844 1721:fadd            
        //  845 1722:aload_0         
        //  846 1723:getfield        #18  <Field SuperSurface this$0>
        //  847 1726:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  848 1729:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  849 1732:fconst_2        
        //  850 1733:fdiv            
        //  851 1734:fadd            
        //  852 1735:fstore          14
        //  853 1737:fload           13
        //  854 1739:fload           5
        //  855 1741:fsub            
        //  856 1742:f2d             
        //  857 1743:fload           14
        //  858 1745:fload           4
        //  859 1747:fsub            
        //  860 1748:f2d             
        //  861 1749:invokestatic    #219 <Method double Math.atan2(double, double)>
        //  862 1752:invokestatic    #222 <Method double Math.toDegrees(double)>
        //  863 1755:d2i             
        //  864 1756:i2f             
        //  865 1757:fstore          15
        //  866 1759:aload_0         
        //  867 1760:getfield        #18  <Field SuperSurface this$0>
        //  868 1763:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  869 1766:getfield        #145 <Field int SuperSurfaceItem.rotation>
        //  870 1769:i2f             
        //  871 1770:ldc1            #223 <Float 45F>
        //  872 1772:fload           15
        //  873 1774:fadd            
        //  874 1775:fsub            
        //  875 1776:fstore          16
        //  876 1778:aload_0         
        //  877 1779:getfield        #18  <Field SuperSurface this$0>
        //  878 1782:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  879 1785:astore          17
        //  880 1787:aload           17
        //  881 1789:aload           17
        //  882 1791:getfield        #145 <Field int SuperSurfaceItem.rotation>
        //  883 1794:i2f             
        //  884 1795:fload           16
        //  885 1797:fsub            
        //  886 1798:f2i             
        //  887 1799:putfield        #145 <Field int SuperSurfaceItem.rotation>
        //  888 1802:aload_0         
        //  889 1803:getfield        #18  <Field SuperSurface this$0>
        //  890 1806:fload           4
        //  891 1808:putfield        #133 <Field float SuperSurface.lastTouchX>
        //  892 1811:aload_0         
        //  893 1812:getfield        #18  <Field SuperSurface this$0>
        //  894 1815:fload           5
        //  895 1817:putfield        #136 <Field float SuperSurface.lastTouchY>
        //  896 1820:iconst_1        
        //  897 1821:putstatic       #87  <Field boolean SuperSurface.update>
        //  898 1824:goto            52
        //  899 1827:fload           26
        //  900 1829:fload           24
        //  901 1831:fcmpl           
        //  902 1832:istore          40
        //  903 1834:fconst_0        
        //  904 1835:fstore          41
        //  905 1837:iload           40
        //  906 1839:ifle            1085
        //  907 1842:fload           26
        //  908 1844:fload           24
        //  909 1846:fsub            
        //  910 1847:fstore          41
        //  911 1849:goto            1085
        //  912 1852:fload           27
        //  913 1854:fload           25
        //  914 1856:fcmpl           
        //  915 1857:istore          42
        //  916 1859:fconst_0        
        //  917 1860:fstore          43
        //  918 1862:iload           42
        //  919 1864:ifle            1100
        //  920 1867:fload           27
        //  921 1869:fload           25
        //  922 1871:fsub            
        //  923 1872:fstore          43
        //  924 1874:goto            1100
        //  925 1877:fload           26
        //  926 1879:fload           24
        //  927 1881:fcmpl           
        //  928 1882:istore          28
        //  929 1884:fconst_0        
        //  930 1885:fstore          29
        //  931 1887:iload           28
        //  932 1889:ifle            1140
        //  933 1892:fload           26
        //  934 1894:fload           24
        //  935 1896:fsub            
        //  936 1897:fstore          29
        //  937 1899:goto            1140
        //  938 1902:fload           27
        //  939 1904:fload           25
        //  940 1906:fcmpl           
        //  941 1907:istore          30
        //  942 1909:fconst_0        
        //  943 1910:fstore          31
        //  944 1912:iload           30
        //  945 1914:ifle            1155
        //  946 1917:fload           27
        //  947 1919:fload           25
        //  948 1921:fsub            
        //  949 1922:fstore          31
        //  950 1924:goto            1155
        //  951 1927:fload           38
        //  952 1929:ldc1            #224 <Float 50F>
        //  953 1931:fcmpl           
        //  954 1932:ifle            1942
        //  955 1935:bipush          20
        //  956 1937:istore          39
        //  957 1939:goto            1239
        //  958 1942:fload           38
        //  959 1944:ldc1            #225 <Float 10F>
        //  960 1946:fcmpl           
        //  961 1947:ifle            1957
        //  962 1950:bipush          15
        //  963 1952:istore          39
        //  964 1954:goto            1239
        //  965 1957:fload           38
        //  966 1959:f2d             
        //  967 1960:ldc2w           #226 <Double 0.59999999999999998D>
        //  968 1963:dcmpl           
        //  969 1964:ifle            1974
        //  970 1967:bipush          10
        //  971 1969:istore          39
        //  972 1971:goto            1239
        //  973 1974:fload           38
        //  974 1976:f2d             
        //  975 1977:ldc2w           #228 <Double 0.40000000000000002D>
        //  976 1980:dcmpl           
        //  977 1981:ifle            1991
        //  978 1984:bipush          6
        //  979 1986:istore          39
        //  980 1988:goto            1239
        //  981 1991:iconst_0        
        //  982 1992:istore          39
        //  983 1994:goto            1239
        //  984 1997:aload_0         
        //  985 1998:getfield        #18  <Field SuperSurface this$0>
        //  986 2001:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  987 2004:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        //  988 2007:iload           39
        //  989 2009:i2f             
        //  990 2010:fadd            
        //  991 2011:fstore          33
        //  992 2013:aload_0         
        //  993 2014:getfield        #18  <Field SuperSurface this$0>
        //  994 2017:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  995 2020:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        //  996 2023:iload           39
        //  997 2025:i2f             
        //  998 2026:fadd            
        //  999 2027:fstore          34
        // 1000 2029:goto            1289
        // 1001 2032:aload_0         
        // 1002 2033:getfield        #18  <Field SuperSurface this$0>
        // 1003 2036:getfield        #190 <Field float SuperSurface.lastChangePercent>
        // 1004 2039:fload           32
        // 1005 2041:fcmpl           
        // 1006 2042:istore          35
        // 1007 2044:fconst_0        
        // 1008 2045:fstore          33
        // 1009 2047:fconst_0        
        // 1010 2048:fstore          34
        // 1011 2050:iload           35
        // 1012 2052:ifle            1289
        // 1013 2055:aload_0         
        // 1014 2056:getfield        #18  <Field SuperSurface this$0>
        // 1015 2059:getfield        #190 <Field float SuperSurface.lastChangePercent>
        // 1016 2062:fload           32
        // 1017 2064:fsub            
        // 1018 2065:fstore          36
        // 1019 2067:fload           36
        // 1020 2069:ldc1            #187 <Float 100F>
        // 1021 2071:fcmpl           
        // 1022 2072:ifle            2138
        // 1023 2075:bipush          50
        // 1024 2077:istore          37
        // 1025 2079:aload_0         
        // 1026 2080:getfield        #18  <Field SuperSurface this$0>
        // 1027 2083:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1028 2086:getfield        #115 <Field String SuperSurfaceItem.type>
        // 1029 2089:ldc1            #117 <String "text">
        // 1030 2091:if_acmpne       2202
        // 1031 2094:aload_0         
        // 1032 2095:getfield        #18  <Field SuperSurface this$0>
        // 1033 2098:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1034 2101:aload_0         
        // 1035 2102:getfield        #18  <Field SuperSurface this$0>
        // 1036 2105:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1037 2108:getfield        #194 <Field el7rTextView SuperSurfaceItem.textViewDraw>
        // 1038 2111:invokevirtual   #199 <Method float el7rTextView.getTextSize()>
        // 1039 2114:iload           37
        // 1040 2116:iconst_3        
        // 1041 2117:isub            
        // 1042 2118:i2f             
        // 1043 2119:fsub            
        // 1044 2120:putfield        #202 <Field float SuperSurfaceItem.textSize>
        // 1045 2123:getstatic       #120 <Field SuperSurfaceItem SuperSurface.currentTextItemVar>
        // 1046 2126:invokevirtual   #205 <Method void SuperSurfaceItem.updateTextBitmap()>
        // 1047 2129:fconst_0        
        // 1048 2130:fstore          33
        // 1049 2132:fconst_0        
        // 1050 2133:fstore          34
        // 1051 2135:goto            1289
        // 1052 2138:fload           36
        // 1053 2140:ldc1            #224 <Float 50F>
        // 1054 2142:fcmpl           
        // 1055 2143:ifle            2153
        // 1056 2146:bipush          20
        // 1057 2148:istore          37
        // 1058 2150:goto            2079
        // 1059 2153:fload           36
        // 1060 2155:ldc1            #225 <Float 10F>
        // 1061 2157:fcmpl           
        // 1062 2158:ifle            2168
        // 1063 2161:bipush          15
        // 1064 2163:istore          37
        // 1065 2165:goto            2079
        // 1066 2168:fload           36
        // 1067 2170:fconst_2        
        // 1068 2171:fcmpl           
        // 1069 2172:ifle            2182
        // 1070 2175:bipush          10
        // 1071 2177:istore          37
        // 1072 2179:goto            2079
        // 1073 2182:fload           36
        // 1074 2184:fconst_1        
        // 1075 2185:fcmpl           
        // 1076 2186:ifle            2196
        // 1077 2189:bipush          6
        // 1078 2191:istore          37
        // 1079 2193:goto            2079
        // 1080 2196:iconst_0        
        // 1081 2197:istore          37
        // 1082 2199:goto            2079
        // 1083 2202:aload_0         
        // 1084 2203:getfield        #18  <Field SuperSurface this$0>
        // 1085 2206:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1086 2209:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        // 1087 2212:iload           37
        // 1088 2214:i2f             
        // 1089 2215:fsub            
        // 1090 2216:fstore          33
        // 1091 2218:aload_0         
        // 1092 2219:getfield        #18  <Field SuperSurface this$0>
        // 1093 2222:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1094 2225:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        // 1095 2228:iload           37
        // 1096 2230:i2f             
        // 1097 2231:fsub            
        // 1098 2232:fstore          34
        // 1099 2234:goto            1289
        // 1100 2237:iload           8
        // 1101 2239:iconst_m1       
        // 1102 2240:icmple          1358
        // 1103 2243:aload_0         
        // 1104 2244:getfield        #18  <Field SuperSurface this$0>
        // 1105 2247:getfield        #180 <Field boolean SuperSurface.pinchZoomActive>
        // 1106 2250:ifne            1358
        // 1107 2253:aload_0         
        // 1108 2254:getfield        #18  <Field SuperSurface this$0>
        // 1109 2257:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1110 2260:getfield        #160 <Field boolean SuperSurfaceItem.resizePinActive>
        // 1111 2263:ifne            1358
        // 1112 2266:aload_0         
        // 1113 2267:getfield        #18  <Field SuperSurface this$0>
        // 1114 2270:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1115 2273:getfield        #163 <Field boolean SuperSurfaceItem.rotatePinActive>
        // 1116 2276:ifne            1358
        // 1117 2279:aload_0         
        // 1118 2280:getfield        #18  <Field SuperSurface this$0>
        // 1119 2283:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1120 2286:astore          9
        // 1121 2288:aload           9
        // 1122 2290:aload           9
        // 1123 2292:getfield        #95  <Field float SuperSurfaceItem.tempPosX>
        // 1124 2295:aload_0         
        // 1125 2296:getfield        #18  <Field SuperSurface this$0>
        // 1126 2299:getfield        #133 <Field float SuperSurface.lastTouchX>
        // 1127 2302:aload_2         
        // 1128 2303:iload           8
        // 1129 2305:invokevirtual   #172 <Method float MotionEvent.getX(int)>
        // 1130 2308:fsub            
        // 1131 2309:fsub            
        // 1132 2310:putfield        #95  <Field float SuperSurfaceItem.tempPosX>
        // 1133 2313:aload_0         
        // 1134 2314:getfield        #18  <Field SuperSurface this$0>
        // 1135 2317:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1136 2320:astore          10
        // 1137 2322:aload           10
        // 1138 2324:aload           10
        // 1139 2326:getfield        #105 <Field float SuperSurfaceItem.tempPosY>
        // 1140 2329:aload_0         
        // 1141 2330:getfield        #18  <Field SuperSurface this$0>
        // 1142 2333:getfield        #136 <Field float SuperSurface.lastTouchY>
        // 1143 2336:aload_2         
        // 1144 2337:iload           8
        // 1145 2339:invokevirtual   #174 <Method float MotionEvent.getY(int)>
        // 1146 2342:fsub            
        // 1147 2343:fsub            
        // 1148 2344:putfield        #105 <Field float SuperSurfaceItem.tempPosY>
        // 1149 2347:aload_0         
        // 1150 2348:getfield        #18  <Field SuperSurface this$0>
        // 1151 2351:aload_2         
        // 1152 2352:iload           8
        // 1153 2354:invokevirtual   #172 <Method float MotionEvent.getX(int)>
        // 1154 2357:putfield        #133 <Field float SuperSurface.lastTouchX>
        // 1155 2360:aload_0         
        // 1156 2361:getfield        #18  <Field SuperSurface this$0>
        // 1157 2364:aload_2         
        // 1158 2365:iload           8
        // 1159 2367:invokevirtual   #174 <Method float MotionEvent.getY(int)>
        // 1160 2370:putfield        #136 <Field float SuperSurface.lastTouchY>
        // 1161 2373:aload_2         
        // 1162 2374:iload           8
        // 1163 2376:invokevirtual   #172 <Method float MotionEvent.getX(int)>
        // 1164 2379:aload_0         
        // 1165 2380:getfield        #18  <Field SuperSurface this$0>
        // 1166 2383:getstatic       #232 <Field int SuperSurface.canvasWidth>
        // 1167 2386:i2f             
        // 1168 2387:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        // 1169 2390:aload_0         
        // 1170 2391:getfield        #18  <Field SuperSurface this$0>
        // 1171 2394:getfield        #236 <Field Bitmap SuperSurface.deleteCornerBitmap>
        // 1172 2397:invokevirtual   #241 <Method int Bitmap.getWidth()>
        // 1173 2400:i2f             
        // 1174 2401:fsub            
        // 1175 2402:getstatic       #99  <Field int SuperSurface.startPosX>
        // 1176 2405:i2f             
        // 1177 2406:fadd            
        // 1178 2407:fcmpl           
        // 1179 2408:ifle            2476
        // 1180 2411:aload_2         
        // 1181 2412:iload           8
        // 1182 2414:invokevirtual   #174 <Method float MotionEvent.getY(int)>
        // 1183 2417:aload_0         
        // 1184 2418:getfield        #18  <Field SuperSurface this$0>
        // 1185 2421:getstatic       #232 <Field int SuperSurface.canvasWidth>
        // 1186 2424:i2f             
        // 1187 2425:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        // 1188 2428:aload_0         
        // 1189 2429:getfield        #18  <Field SuperSurface this$0>
        // 1190 2432:getfield        #236 <Field Bitmap SuperSurface.deleteCornerBitmap>
        // 1191 2435:invokevirtual   #244 <Method int Bitmap.getHeight()>
        // 1192 2438:i2f             
        // 1193 2439:fsub            
        // 1194 2440:getstatic       #108 <Field int SuperSurface.startPosY>
        // 1195 2443:i2f             
        // 1196 2444:fadd            
        // 1197 2445:fcmpl           
        // 1198 2446:ifle            2476
        // 1199 2449:aload_0         
        // 1200 2450:getfield        #18  <Field SuperSurface this$0>
        // 1201 2453:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1202 2456:getfield        #247 <Field boolean SuperSurfaceItem.deletable>
        // 1203 2459:ifeq            2476
        // 1204 2462:aload_0         
        // 1205 2463:getfield        #18  <Field SuperSurface this$0>
        // 1206 2466:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1207 2469:iconst_1        
        // 1208 2470:putfield        #250 <Field boolean SuperSurfaceItem.matchesDelete>
        // 1209 2473:goto            1358
        // 1210 2476:aload_0         
        // 1211 2477:getfield        #18  <Field SuperSurface this$0>
        // 1212 2480:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1213 2483:iconst_0        
        // 1214 2484:putfield        #250 <Field boolean SuperSurfaceItem.matchesDelete>
        // 1215 2487:goto            1358
        // 1216 2490:fload           18
        // 1217 2492:fload           19
        // 1218 2494:fcmpl           
        // 1219 2495:ifle            2619
        // 1220 2498:fload           18
        // 1221 2500:fstore          19
        // 1222 2502:aload_0         
        // 1223 2503:getfield        #18  <Field SuperSurface this$0>
        // 1224 2506:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1225 2509:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        // 1226 2512:fload           18
        // 1227 2514:fsub            
        // 1228 2515:aload_0         
        // 1229 2516:getfield        #18  <Field SuperSurface this$0>
        // 1230 2519:ldc1            #187 <Float 100F>
        // 1231 2521:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        // 1232 2524:fcmpl           
        // 1233 2525:ifle            2550
        // 1234 2528:aload_0         
        // 1235 2529:getfield        #18  <Field SuperSurface this$0>
        // 1236 2532:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1237 2535:astore          21
        // 1238 2537:aload           21
        // 1239 2539:aload           21
        // 1240 2541:getfield        #102 <Field float SuperSurfaceItem.tempWidth>
        // 1241 2544:fload           18
        // 1242 2546:fsub            
        // 1243 2547:putfield        #102 <Field float SuperSurfaceItem.tempWidth>
        // 1244 2550:aload_0         
        // 1245 2551:getfield        #18  <Field SuperSurface this$0>
        // 1246 2554:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1247 2557:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        // 1248 2560:fload           19
        // 1249 2562:fsub            
        // 1250 2563:aload_0         
        // 1251 2564:getfield        #18  <Field SuperSurface this$0>
        // 1252 2567:ldc1            #187 <Float 100F>
        // 1253 2569:invokevirtual   #141 <Method float SuperSurface.fixToSize(float)>
        // 1254 2572:fcmpl           
        // 1255 2573:ifle            2598
        // 1256 2576:aload_0         
        // 1257 2577:getfield        #18  <Field SuperSurface this$0>
        // 1258 2580:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1259 2583:astore          20
        // 1260 2585:aload           20
        // 1261 2587:aload           20
        // 1262 2589:getfield        #111 <Field float SuperSurfaceItem.tempHeight>
        // 1263 2592:fload           19
        // 1264 2594:fsub            
        // 1265 2595:putfield        #111 <Field float SuperSurfaceItem.tempHeight>
        // 1266 2598:aload_0         
        // 1267 2599:getfield        #18  <Field SuperSurface this$0>
        // 1268 2602:fload           4
        // 1269 2604:putfield        #133 <Field float SuperSurface.lastTouchX>
        // 1270 2607:aload_0         
        // 1271 2608:getfield        #18  <Field SuperSurface this$0>
        // 1272 2611:fload           5
        // 1273 2613:putfield        #136 <Field float SuperSurface.lastTouchY>
        // 1274 2616:goto            1642
        // 1275 2619:fload           19
        // 1276 2621:fstore          18
        // 1277 2623:goto            2502
        // 1278 2626:aload_0         
        // 1279 2627:getfield        #18  <Field SuperSurface this$0>
        // 1280 2630:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1281 2633:ifnull          2714
        // try 2636 2647 handler(s) 2745
        // 1282 2636:aload_0         
        // 1283 2637:getfield        #18  <Field SuperSurface this$0>
        // 1284 2640:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1285 2643:iconst_0        
        // 1286 2644:putfield        #81  <Field boolean SuperSurfaceItem.highlight>
        // 1287 2647:aload_0         
        // 1288 2648:getfield        #18  <Field SuperSurface this$0>
        // 1289 2651:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1290 2654:iconst_0        
        // 1291 2655:putfield        #160 <Field boolean SuperSurfaceItem.resizePinActive>
        // 1292 2658:aload_0         
        // 1293 2659:getfield        #18  <Field SuperSurface this$0>
        // 1294 2662:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1295 2665:iconst_0        
        // 1296 2666:putfield        #163 <Field boolean SuperSurfaceItem.rotatePinActive>
        // 1297 2669:aload_0         
        // 1298 2670:getfield        #18  <Field SuperSurface this$0>
        // 1299 2673:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1300 2676:getfield        #250 <Field boolean SuperSurfaceItem.matchesDelete>
        // 1301 2679:ifeq            2714
        // 1302 2682:aload_0         
        // 1303 2683:getfield        #18  <Field SuperSurface this$0>
        // 1304 2686:invokevirtual   #253 <Method void SuperSurface.pause()>
        // 1305 2689:aload_0         
        // 1306 2690:getfield        #18  <Field SuperSurface this$0>
        // 1307 2693:getfield        #56  <Field ArrayList SuperSurface.itemsList>
        // 1308 2696:aload_0         
        // 1309 2697:getfield        #18  <Field SuperSurface this$0>
        // 1310 2700:getfield        #72  <Field SuperSurfaceItem SuperSurface.selectedItem>
        // 1311 2703:invokevirtual   #257 <Method boolean ArrayList.remove(Object)>
        // 1312 2706:pop             
        // 1313 2707:aload_0         
        // 1314 2708:getfield        #18  <Field SuperSurface this$0>
        // 1315 2711:invokevirtual   #260 <Method void SuperSurface.resume()>
        // 1316 2714:aload_0         
        // 1317 2715:getfield        #18  <Field SuperSurface this$0>
        // 1318 2718:iconst_0        
        // 1319 2719:putfield        #177 <Field boolean SuperSurface.isTwoPointers>
        // 1320 2722:aload_0         
        // 1321 2723:getfield        #18  <Field SuperSurface this$0>
        // 1322 2726:iconst_m1       
        // 1323 2727:putfield        #130 <Field int SuperSurface.movePointerID>
        // 1324 2730:aload_0         
        // 1325 2731:getfield        #18  <Field SuperSurface this$0>
        // 1326 2734:iconst_0        
        // 1327 2735:putfield        #180 <Field boolean SuperSurface.pinchZoomActive>
        // 1328 2738:iconst_1        
        // 1329 2739:putstatic       #87  <Field boolean SuperSurface.update>
        // 1330 2742:goto            52
        // catch Exception
        // 1331 2745:astore          6
        // 1332 2747:aload           6
        // 1333 2749:invokevirtual   #263 <Method void Exception.printStackTrace()>
        // 1334 2752:goto            2647
        }

        final SuperSurface this$0;
        private final GestureDetector val$mGesDetect;
    }


    // Unreferenced inner class codeadore/textgram/SuperSurface$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SuperSurface this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        static SuperSurface access$0(_cls3 _pcls3)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SuperSurface this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field SuperSurface this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:new             #23  <Class Thread>
        //    1    3:dup             
        //    2    4:new             #25  <Class SuperSurface$3$1>
        //    3    7:dup             
        //    4    8:aload_0         
        //    5    9:invokespecial   #28  <Method void SuperSurface$3$1(SuperSurface$3)>
        //    6   12:invokespecial   #31  <Method void Thread(Runnable)>
        //    7   15:invokevirtual   #34  <Method void Thread.start()>
        //    8   18:return          
        }

        final SuperSurface this$0;

            static SuperSurface access$0(_cls3 _pcls3)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field SuperSurface this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/SuperSurface$3$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SuperSurface$3 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SuperSurface$3 this$1>
        //    2    4:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //    3    7:getfield        #31  <Field SurfaceHolder SuperSurface.holder>
        //    4   10:invokeinterface #37  <Method Canvas SurfaceHolder.lockCanvas()>
        //    5   15:astore_1        
        // try 16 100 handler(s) 1309
        //    6   16:aload_1         
        //    7   17:sipush          229
        //    8   20:sipush          229
        //    9   23:sipush          229
        //   10   26:invokevirtual   #43  <Method void Canvas.drawRGB(int, int, int)>
        //   11   29:getstatic       #47  <Field Bitmap SuperSurface.canvasBackground>
        //   12   32:ifnull          116
        //   13   35:new             #49  <Class Paint>
        //   14   38:dup             
        //   15   39:invokespecial   #50  <Method void Paint()>
        //   16   42:astore_3        
        //   17   43:aload_3         
        //   18   44:iconst_0        
        //   19   45:invokevirtual   #54  <Method void Paint.setDither(boolean)>
        //   20   48:aload_0         
        //   21   49:getfield        #17  <Field SuperSurface$3 this$1>
        //   22   52:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   23   55:invokestatic    #57  <Method int SuperSurface.access$0(SuperSurface)>
        //   24   58:sipush          255
        //   25   61:icmpge          100
        //   26   64:aload_3         
        //   27   65:aload_0         
        //   28   66:getfield        #17  <Field SuperSurface$3 this$1>
        //   29   69:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   30   72:invokestatic    #57  <Method int SuperSurface.access$0(SuperSurface)>
        //   31   75:invokevirtual   #61  <Method void Paint.setAlpha(int)>
        //   32   78:aload_0         
        //   33   79:getfield        #17  <Field SuperSurface$3 this$1>
        //   34   82:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   35   85:astore          24
        //   36   87:aload           24
        //   37   89:bipush          30
        //   38   91:aload           24
        //   39   93:invokestatic    #57  <Method int SuperSurface.access$0(SuperSurface)>
        //   40   96:iadd            
        //   41   97:invokestatic    #65  <Method void SuperSurface.access$1(SuperSurface, int)>
        // try 100 116 handler(s) 1309
        //   42  100:aload_1         
        //   43  101:getstatic       #47  <Field Bitmap SuperSurface.canvasBackground>
        //   44  104:getstatic       #69  <Field int SuperSurface.startPosX>
        //   45  107:i2f             
        //   46  108:getstatic       #72  <Field int SuperSurface.startPosY>
        //   47  111:i2f             
        //   48  112:aload_3         
        //   49  113:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 116 168 handler(s) 1309
        //   50  116:getstatic       #79  <Field Bitmap SuperSurface.canvasFilter>
        //   51  119:ifnull          185
        //   52  122:new             #49  <Class Paint>
        //   53  125:dup             
        //   54  126:invokespecial   #50  <Method void Paint()>
        //   55  129:astore          4
        //   56  131:aload_0         
        //   57  132:getfield        #17  <Field SuperSurface$3 this$1>
        //   58  135:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   59  138:invokevirtual   #83  <Method int SuperSurface.getFilterOpacity()>
        //   60  141:bipush          100
        //   61  143:icmpeq          168
        //   62  146:aload           4
        //   63  148:sipush          255
        //   64  151:aload_0         
        //   65  152:getfield        #17  <Field SuperSurface$3 this$1>
        //   66  155:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   67  158:invokevirtual   #83  <Method int SuperSurface.getFilterOpacity()>
        //   68  161:imul            
        //   69  162:bipush          100
        //   70  164:idiv            
        //   71  165:invokevirtual   #61  <Method void Paint.setAlpha(int)>
        // try 168 185 handler(s) 1309
        //   72  168:aload_1         
        //   73  169:getstatic       #79  <Field Bitmap SuperSurface.canvasFilter>
        //   74  172:getstatic       #69  <Field int SuperSurface.startPosX>
        //   75  175:i2f             
        //   76  176:getstatic       #72  <Field int SuperSurface.startPosY>
        //   77  179:i2f             
        //   78  180:aload           4
        //   79  182:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 185 200 handler(s) 1299 1309
        //   80  185:aload_0         
        //   81  186:getfield        #17  <Field SuperSurface$3 this$1>
        //   82  189:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //   83  192:getfield        #87  <Field ArrayList SuperSurface.itemsList>
        //   84  195:invokevirtual   #93  <Method Iterator ArrayList.iterator()>
        //   85  198:astore          11
        // try 200 209 handler(s) 1299 1309
        //   86  200:aload           11
        //   87  202:invokeinterface #99  <Method boolean Iterator.hasNext()>
        //   88  207:istore          12
        //   89  209:iload           12
        //   90  211:ifne            580
        // try 214 236 handler(s) 1309
        //   91  214:getstatic       #102 <Field Bitmap SuperSurface.canvasFrame>
        //   92  217:ifnull          236
        //   93  220:aload_1         
        //   94  221:getstatic       #102 <Field Bitmap SuperSurface.canvasFrame>
        //   95  224:getstatic       #69  <Field int SuperSurface.startPosX>
        //   96  227:i2f             
        //   97  228:getstatic       #72  <Field int SuperSurface.startPosY>
        //   98  231:i2f             
        //   99  232:aconst_null     
        //  100  233:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 236 380 handler(s) 1309
        //  101  236:aload_0         
        //  102  237:getfield        #17  <Field SuperSurface$3 this$1>
        //  103  240:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  104  243:getfield        #106 <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  105  246:ifnull          380
        //  106  249:aload_0         
        //  107  250:getfield        #17  <Field SuperSurface$3 this$1>
        //  108  253:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  109  256:getfield        #106 <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  110  259:getfield        #112 <Field String SuperSurfaceItem.type>
        //  111  262:ifnull          380
        //  112  265:aload_0         
        //  113  266:getfield        #17  <Field SuperSurface$3 this$1>
        //  114  269:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  115  272:getfield        #106 <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  116  275:getfield        #116 <Field boolean SuperSurfaceItem.deletable>
        //  117  278:ifeq            380
        //  118  281:aload_0         
        //  119  282:getfield        #17  <Field SuperSurface$3 this$1>
        //  120  285:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  121  288:getfield        #106 <Field SuperSurfaceItem SuperSurface.selectedItem>
        //  122  291:getfield        #119 <Field boolean SuperSurfaceItem.highlight>
        //  123  294:ifeq            380
        //  124  297:aload_1         
        //  125  298:aload_0         
        //  126  299:getfield        #17  <Field SuperSurface$3 this$1>
        //  127  302:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  128  305:getfield        #122 <Field Bitmap SuperSurface.deleteCornerBitmap>
        //  129  308:aload_0         
        //  130  309:getfield        #17  <Field SuperSurface$3 this$1>
        //  131  312:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  132  315:getstatic       #125 <Field int SuperSurface.canvasWidth>
        //  133  318:i2f             
        //  134  319:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  135  322:aload_0         
        //  136  323:getfield        #17  <Field SuperSurface$3 this$1>
        //  137  326:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  138  329:getfield        #122 <Field Bitmap SuperSurface.deleteCornerBitmap>
        //  139  332:invokevirtual   #134 <Method int Bitmap.getWidth()>
        //  140  335:i2f             
        //  141  336:fsub            
        //  142  337:getstatic       #69  <Field int SuperSurface.startPosX>
        //  143  340:i2f             
        //  144  341:fadd            
        //  145  342:aload_0         
        //  146  343:getfield        #17  <Field SuperSurface$3 this$1>
        //  147  346:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  148  349:getstatic       #137 <Field int SuperSurface.canvasHeight>
        //  149  352:i2f             
        //  150  353:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  151  356:aload_0         
        //  152  357:getfield        #17  <Field SuperSurface$3 this$1>
        //  153  360:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  154  363:getfield        #122 <Field Bitmap SuperSurface.deleteCornerBitmap>
        //  155  366:invokevirtual   #140 <Method int Bitmap.getHeight()>
        //  156  369:i2f             
        //  157  370:fsub            
        //  158  371:getstatic       #72  <Field int SuperSurface.startPosY>
        //  159  374:i2f             
        //  160  375:fadd            
        //  161  376:aconst_null     
        //  162  377:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 380 452 handler(s) 1585 1309
        //  163  380:getstatic       #143 <Field int SuperSurface.screenHeight>
        //  164  383:aload_0         
        //  165  384:getfield        #17  <Field SuperSurface$3 this$1>
        //  166  387:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  167  390:getstatic       #137 <Field int SuperSurface.canvasHeight>
        //  168  393:i2f             
        //  169  394:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  170  397:f2i             
        //  171  398:isub            
        //  172  399:iconst_2        
        //  173  400:idiv            
        //  174  401:istore          8
        //  175  403:getstatic       #146 <Field int SuperSurface.screenWidth>
        //  176  406:aload_0         
        //  177  407:getfield        #17  <Field SuperSurface$3 this$1>
        //  178  410:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  179  413:getstatic       #125 <Field int SuperSurface.canvasWidth>
        //  180  416:i2f             
        //  181  417:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  182  420:f2i             
        //  183  421:isub            
        //  184  422:iconst_2        
        //  185  423:idiv            
        //  186  424:istore          9
        //  187  426:new             #49  <Class Paint>
        //  188  429:dup             
        //  189  430:invokespecial   #50  <Method void Paint()>
        //  190  433:astore          10
        //  191  435:aload           10
        //  192  437:sipush          229
        //  193  440:sipush          229
        //  194  443:sipush          229
        //  195  446:invokestatic    #152 <Method int Color.rgb(int, int, int)>
        //  196  449:invokevirtual   #155 <Method void Paint.setColor(int)>
        //  197  452:iload           8
        //  198  454:iconst_1        
        //  199  455:icmple          503
        // try 458 503 handler(s) 1585 1309
        //  200  458:aload_1         
        //  201  459:fconst_0        
        //  202  460:fconst_0        
        //  203  461:getstatic       #146 <Field int SuperSurface.screenWidth>
        //  204  464:i2f             
        //  205  465:iload           8
        //  206  467:i2f             
        //  207  468:aload           10
        //  208  470:invokevirtual   #159 <Method void Canvas.drawRect(float, float, float, float, Paint)>
        //  209  473:aload_1         
        //  210  474:fconst_0        
        //  211  475:getstatic       #72  <Field int SuperSurface.startPosY>
        //  212  478:getstatic       #146 <Field int SuperSurface.screenWidth>
        //  213  481:iadd            
        //  214  482:i2f             
        //  215  483:getstatic       #146 <Field int SuperSurface.screenWidth>
        //  216  486:i2f             
        //  217  487:iload           8
        //  218  489:getstatic       #72  <Field int SuperSurface.startPosY>
        //  219  492:getstatic       #146 <Field int SuperSurface.screenWidth>
        //  220  495:iadd            
        //  221  496:iadd            
        //  222  497:i2f             
        //  223  498:aload           10
        //  224  500:invokevirtual   #159 <Method void Canvas.drawRect(float, float, float, float, Paint)>
        //  225  503:iload           9
        //  226  505:iconst_1        
        //  227  506:icmple          552
        // try 509 552 handler(s) 1585 1309
        //  228  509:aload_1         
        //  229  510:fconst_0        
        //  230  511:fconst_0        
        //  231  512:iload           9
        //  232  514:i2f             
        //  233  515:getstatic       #143 <Field int SuperSurface.screenHeight>
        //  234  518:i2f             
        //  235  519:aload           10
        //  236  521:invokevirtual   #159 <Method void Canvas.drawRect(float, float, float, float, Paint)>
        //  237  524:aload_1         
        //  238  525:iload           9
        //  239  527:getstatic       #143 <Field int SuperSurface.screenHeight>
        //  240  530:iadd            
        //  241  531:i2f             
        //  242  532:fconst_0        
        //  243  533:iload           9
        //  244  535:iload           9
        //  245  537:getstatic       #143 <Field int SuperSurface.screenHeight>
        //  246  540:iadd            
        //  247  541:iadd            
        //  248  542:i2f             
        //  249  543:getstatic       #143 <Field int SuperSurface.screenHeight>
        //  250  546:i2f             
        //  251  547:aload           10
        //  252  549:invokevirtual   #159 <Method void Canvas.drawRect(float, float, float, float, Paint)>
        //  253  552:aload_0         
        //  254  553:getfield        #17  <Field SuperSurface$3 this$1>
        //  255  556:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  256  559:getfield        #31  <Field SurfaceHolder SuperSurface.holder>
        //  257  562:aload_1         
        //  258  563:invokeinterface #163 <Method void SurfaceHolder.unlockCanvasAndPost(Canvas)>
        //  259  568:aload_0         
        //  260  569:getfield        #17  <Field SuperSurface$3 this$1>
        //  261  572:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  262  575:iconst_0        
        //  263  576:putfield        #166 <Field boolean SuperSurface.threadIsWorking>
        //  264  579:return          
        // try 580 636 handler(s) 1299 1309
        //  265  580:aload           11
        //  266  582:invokeinterface #170 <Method Object Iterator.next()>
        //  267  587:checkcast       #108 <Class SuperSurfaceItem>
        //  268  590:astore          13
        //  269  592:aload           13
        //  270  594:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  271  597:ifnull          636
        //  272  600:aload           13
        //  273  602:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  274  605:invokevirtual   #134 <Method int Bitmap.getWidth()>
        //  275  608:i2f             
        //  276  609:aload           13
        //  277  611:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  278  614:fcmpl           
        //  279  615:ifne            636
        //  280  618:aload           13
        //  281  620:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  282  623:invokevirtual   #140 <Method int Bitmap.getHeight()>
        //  283  626:i2f             
        //  284  627:aload           13
        //  285  629:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  286  632:fcmpl           
        //  287  633:ifeq            1339
        // try 636 666 handler(s) 1299 1309
        //  288  636:aload           13
        //  289  638:getfield        #183 <Field Bitmap SuperSurfaceItem.bitmap>
        //  290  641:aload           13
        //  291  643:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  292  646:f2i             
        //  293  647:aload           13
        //  294  649:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  295  652:f2i             
        //  296  653:iconst_1        
        //  297  654:invokestatic    #187 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  298  657:astore          14
        //  299  659:aload           13
        //  300  661:aload           14
        //  301  663:putfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        // try 666 726 handler(s) 1299 1309
        //  302  666:aload           13
        //  303  668:getfield        #190 <Field int SuperSurfaceItem.rotation>
        //  304  671:ifeq            726
        //  305  674:aload_1         
        //  306  675:iconst_1        
        //  307  676:invokevirtual   #194 <Method int Canvas.save(int)>
        //  308  679:pop             
        //  309  680:aload_1         
        //  310  681:aload           13
        //  311  683:getfield        #190 <Field int SuperSurfaceItem.rotation>
        //  312  686:i2f             
        //  313  687:getstatic       #69  <Field int SuperSurface.startPosX>
        //  314  690:i2f             
        //  315  691:aload           13
        //  316  693:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  317  696:fadd            
        //  318  697:aload           13
        //  319  699:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  320  702:fconst_2        
        //  321  703:fdiv            
        //  322  704:fadd            
        //  323  705:getstatic       #72  <Field int SuperSurface.startPosY>
        //  324  708:i2f             
        //  325  709:aload           13
        //  326  711:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  327  714:fadd            
        //  328  715:aload           13
        //  329  717:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  330  720:fconst_2        
        //  331  721:fdiv            
        //  332  722:fadd            
        //  333  723:invokevirtual   #204 <Method void Canvas.rotate(float, float, float)>
        // try 726 766 handler(s) 1299 1309
        //  334  726:aload           13
        //  335  728:getfield        #119 <Field boolean SuperSurfaceItem.highlight>
        //  336  731:ifeq            839
        //  337  734:new             #49  <Class Paint>
        //  338  737:dup             
        //  339  738:invokespecial   #50  <Method void Paint()>
        //  340  741:astore          15
        //  341  743:aload           13
        //  342  745:getfield        #207 <Field boolean SuperSurfaceItem.matchesDelete>
        //  343  748:ifeq            1419
        //  344  751:aload           15
        //  345  753:bipush          60
        //  346  755:sipush          255
        //  347  758:iconst_0        
        //  348  759:iconst_0        
        //  349  760:invokestatic    #211 <Method int Color.argb(int, int, int, int)>
        //  350  763:invokevirtual   #155 <Method void Paint.setColor(int)>
        // try 766 839 handler(s) 1299 1309
        //  351  766:new             #213 <Class RectF>
        //  352  769:dup             
        //  353  770:aload           13
        //  354  772:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  355  775:getstatic       #69  <Field int SuperSurface.startPosX>
        //  356  778:i2f             
        //  357  779:fadd            
        //  358  780:aload           13
        //  359  782:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  360  785:getstatic       #72  <Field int SuperSurface.startPosY>
        //  361  788:i2f             
        //  362  789:fadd            
        //  363  790:aload           13
        //  364  792:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  365  795:getstatic       #69  <Field int SuperSurface.startPosX>
        //  366  798:i2f             
        //  367  799:fadd            
        //  368  800:aload           13
        //  369  802:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  370  805:fadd            
        //  371  806:aload           13
        //  372  808:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  373  811:getstatic       #72  <Field int SuperSurface.startPosY>
        //  374  814:i2f             
        //  375  815:fadd            
        //  376  816:aload           13
        //  377  818:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  378  821:fadd            
        //  379  822:invokespecial   #216 <Method void RectF(float, float, float, float)>
        //  380  825:astore          16
        //  381  827:aload_1         
        //  382  828:aload           16
        //  383  830:ldc1            #217 <Float 10F>
        //  384  832:ldc1            #217 <Float 10F>
        //  385  834:aload           15
        //  386  836:invokevirtual   #221 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
        // try 839 881 handler(s) 1299 1309
        //  387  839:new             #49  <Class Paint>
        //  388  842:dup             
        //  389  843:invokespecial   #50  <Method void Paint()>
        //  390  846:astore          17
        //  391  848:aload           13
        //  392  850:getfield        #224 <Field int SuperSurfaceItem.opacity>
        //  393  853:bipush          100
        //  394  855:icmpeq          881
        //  395  858:aload           17
        //  396  860:sipush          255
        //  397  863:aload           13
        //  398  865:getfield        #224 <Field int SuperSurfaceItem.opacity>
        //  399  868:imul            
        //  400  869:bipush          100
        //  401  871:idiv            
        //  402  872:invokevirtual   #61  <Method void Paint.setAlpha(int)>
        //  403  875:aload           17
        //  404  877:iconst_1        
        //  405  878:invokevirtual   #227 <Method void Paint.setAntiAlias(boolean)>
        // try 881 1004 handler(s) 1299 1309
        //  406  881:aload_1         
        //  407  882:aload           14
        //  408  884:aload           13
        //  409  886:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  410  889:getstatic       #69  <Field int SuperSurface.startPosX>
        //  411  892:i2f             
        //  412  893:fadd            
        //  413  894:aload           13
        //  414  896:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  415  899:getstatic       #72  <Field int SuperSurface.startPosY>
        //  416  902:i2f             
        //  417  903:fadd            
        //  418  904:aload           17
        //  419  906:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        //  420  909:aload           13
        //  421  911:getfield        #230 <Field int SuperSurfaceItem.reflection>
        //  422  914:ifle            1004
        //  423  917:aload           13
        //  424  919:getfield        #119 <Field boolean SuperSurfaceItem.highlight>
        //  425  922:ifne            1004
        //  426  925:aload           14
        //  427  927:aload           13
        //  428  929:getfield        #230 <Field int SuperSurfaceItem.reflection>
        //  429  932:invokestatic    #236 <Method Bitmap Utilities.createReflectedBitmap(Bitmap, int)>
        //  430  935:astore          20
        //  431  937:aload_0         
        //  432  938:getfield        #17  <Field SuperSurface$3 this$1>
        //  433  941:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  434  944:aload           13
        //  435  946:invokevirtual   #239 <Method int SuperSurfaceItem.getTextHeight()>
        //  436  949:i2f             
        //  437  950:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  438  953:f2i             
        //  439  954:istore          21
        //  440  956:iload           21
        //  441  958:aload           13
        //  442  960:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  443  963:f2i             
        //  444  964:i2f             
        //  445  965:aload           13
        //  446  967:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  447  970:iload           21
        //  448  972:i2f             
        //  449  973:fsub            
        //  450  974:fsub            
        //  451  975:f2i             
        //  452  976:iadd            
        //  453  977:istore          22
        //  454  979:aload_1         
        //  455  980:aload           20
        //  456  982:aload           13
        //  457  984:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  458  987:getstatic       #69  <Field int SuperSurface.startPosX>
        //  459  990:i2f             
        //  460  991:fadd            
        //  461  992:iload           22
        //  462  994:getstatic       #72  <Field int SuperSurface.startPosY>
        //  463  997:iadd            
        //  464  998:i2f             
        //  465  999:aload           17
        //  466 1001:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 1004 1207 handler(s) 1299 1309
        //  467 1004:aload           13
        //  468 1006:getfield        #242 <Field boolean SuperSurfaceItem.selected>
        //  469 1009:ifeq            1284
        //  470 1012:new             #49  <Class Paint>
        //  471 1015:dup             
        //  472 1016:invokespecial   #50  <Method void Paint()>
        //  473 1019:astore          18
        //  474 1021:aload           18
        //  475 1023:iconst_1        
        //  476 1024:invokevirtual   #227 <Method void Paint.setAntiAlias(boolean)>
        //  477 1027:aload           18
        //  478 1029:ldc1            #244 <String "#888888">
        //  479 1031:invokestatic    #248 <Method int Color.parseColor(String)>
        //  480 1034:invokevirtual   #155 <Method void Paint.setColor(int)>
        //  481 1037:aload           18
        //  482 1039:fconst_2        
        //  483 1040:invokevirtual   #252 <Method void Paint.setStrokeWidth(float)>
        //  484 1043:aload           18
        //  485 1045:getstatic       #258 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
        //  486 1048:invokevirtual   #262 <Method void Paint.setStyle(android.graphics.Paint$Style)>
        //  487 1051:new             #213 <Class RectF>
        //  488 1054:dup             
        //  489 1055:aload           13
        //  490 1057:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  491 1060:getstatic       #69  <Field int SuperSurface.startPosX>
        //  492 1063:i2f             
        //  493 1064:fadd            
        //  494 1065:aload           13
        //  495 1067:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  496 1070:getstatic       #72  <Field int SuperSurface.startPosY>
        //  497 1073:i2f             
        //  498 1074:fadd            
        //  499 1075:aload           13
        //  500 1077:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  501 1080:getstatic       #69  <Field int SuperSurface.startPosX>
        //  502 1083:i2f             
        //  503 1084:fadd            
        //  504 1085:aload           13
        //  505 1087:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  506 1090:fadd            
        //  507 1091:aload           13
        //  508 1093:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  509 1096:getstatic       #72  <Field int SuperSurface.startPosY>
        //  510 1099:i2f             
        //  511 1100:fadd            
        //  512 1101:aload           13
        //  513 1103:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  514 1106:fadd            
        //  515 1107:invokespecial   #216 <Method void RectF(float, float, float, float)>
        //  516 1110:astore          19
        //  517 1112:aload_1         
        //  518 1113:aload           19
        //  519 1115:ldc1            #217 <Float 10F>
        //  520 1117:ldc1            #217 <Float 10F>
        //  521 1119:aload           18
        //  522 1121:invokevirtual   #221 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
        //  523 1124:aload           13
        //  524 1126:getfield        #265 <Field boolean SuperSurfaceItem.resizePinActive>
        //  525 1129:ifeq            1435
        //  526 1132:aload_1         
        //  527 1133:aload_0         
        //  528 1134:getfield        #17  <Field SuperSurface$3 this$1>
        //  529 1137:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  530 1140:getfield        #268 <Field Bitmap SuperSurface.resizePinActiveBitmap>
        //  531 1143:aload           13
        //  532 1145:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  533 1148:getstatic       #69  <Field int SuperSurface.startPosX>
        //  534 1151:i2f             
        //  535 1152:fadd            
        //  536 1153:aload           13
        //  537 1155:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  538 1158:fadd            
        //  539 1159:aload_0         
        //  540 1160:getfield        #17  <Field SuperSurface$3 this$1>
        //  541 1163:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  542 1166:ldc2            #269 <Float 24F>
        //  543 1169:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  544 1172:fsub            
        //  545 1173:aload           13
        //  546 1175:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  547 1178:getstatic       #72  <Field int SuperSurface.startPosY>
        //  548 1181:i2f             
        //  549 1182:fadd            
        //  550 1183:aload           13
        //  551 1185:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  552 1188:fadd            
        //  553 1189:aload_0         
        //  554 1190:getfield        #17  <Field SuperSurface$3 this$1>
        //  555 1193:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  556 1196:ldc2            #269 <Float 24F>
        //  557 1199:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  558 1202:fsub            
        //  559 1203:aconst_null     
        //  560 1204:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 1207 1284 handler(s) 1299 1309
        //  561 1207:aload           13
        //  562 1209:getfield        #272 <Field boolean SuperSurfaceItem.rotatePinActive>
        //  563 1212:ifeq            1513
        //  564 1215:aload_1         
        //  565 1216:aload_0         
        //  566 1217:getfield        #17  <Field SuperSurface$3 this$1>
        //  567 1220:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  568 1223:getfield        #275 <Field Bitmap SuperSurface.rotatePinActiveBitmap>
        //  569 1226:aload           13
        //  570 1228:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  571 1231:getstatic       #69  <Field int SuperSurface.startPosX>
        //  572 1234:i2f             
        //  573 1235:fadd            
        //  574 1236:aload_0         
        //  575 1237:getfield        #17  <Field SuperSurface$3 this$1>
        //  576 1240:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  577 1243:ldc2            #269 <Float 24F>
        //  578 1246:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  579 1249:fsub            
        //  580 1250:aload           13
        //  581 1252:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  582 1255:getstatic       #72  <Field int SuperSurface.startPosY>
        //  583 1258:i2f             
        //  584 1259:fadd            
        //  585 1260:aload           13
        //  586 1262:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  587 1265:fadd            
        //  588 1266:aload_0         
        //  589 1267:getfield        #17  <Field SuperSurface$3 this$1>
        //  590 1270:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  591 1273:ldc2            #269 <Float 24F>
        //  592 1276:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  593 1279:fsub            
        //  594 1280:aconst_null     
        //  595 1281:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        // try 1284 1296 handler(s) 1299 1309
        //  596 1284:aload           13
        //  597 1286:getfield        #190 <Field int SuperSurfaceItem.rotation>
        //  598 1289:ifeq            200
        //  599 1292:aload_1         
        //  600 1293:invokevirtual   #278 <Method void Canvas.restore()>
        //  601 1296:goto            200
        // catch Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception
        //  602 1299:astore          5
        // try 1301 1306 handler(s) 1309
        //  603 1301:aload           5
        //  604 1303:invokevirtual   #281 <Method void Exception.printStackTrace()>
        //  605 1306:goto            214
        // finally
        //  606 1309:astore_2        
        //  607 1310:aload_0         
        //  608 1311:getfield        #17  <Field SuperSurface$3 this$1>
        //  609 1314:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  610 1317:getfield        #31  <Field SurfaceHolder SuperSurface.holder>
        //  611 1320:aload_1         
        //  612 1321:invokeinterface #163 <Method void SurfaceHolder.unlockCanvasAndPost(Canvas)>
        //  613 1326:aload_0         
        //  614 1327:getfield        #17  <Field SuperSurface$3 this$1>
        //  615 1330:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  616 1333:iconst_0        
        //  617 1334:putfield        #166 <Field boolean SuperSurface.threadIsWorking>
        //  618 1337:aload_2         
        //  619 1338:athrow          
        // try 1339 1396 handler(s) 1299 1309
        //  620 1339:aload           13
        //  621 1341:getfield        #112 <Field String SuperSurfaceItem.type>
        //  622 1344:ldc2            #283 <String "text">
        //  623 1347:invokevirtual   #289 <Method boolean String.equals(Object)>
        //  624 1350:ifeq            1409
        //  625 1353:aload           13
        //  626 1355:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  627 1358:aload           13
        //  628 1360:getfield        #183 <Field Bitmap SuperSurfaceItem.bitmap>
        //  629 1363:if_acmpeq       1399
        //  630 1366:aload           13
        //  631 1368:getfield        #183 <Field Bitmap SuperSurfaceItem.bitmap>
        //  632 1371:aload           13
        //  633 1373:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  634 1376:f2i             
        //  635 1377:aload           13
        //  636 1379:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  637 1382:f2i             
        //  638 1383:iconst_1        
        //  639 1384:invokestatic    #187 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //  640 1387:astore          14
        //  641 1389:aload           13
        //  642 1391:aload           14
        //  643 1393:putfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  644 1396:goto            666
        // try 1399 1406 handler(s) 1299 1309
        //  645 1399:aload           13
        //  646 1401:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  647 1404:astore          14
        //  648 1406:goto            666
        // try 1409 1416 handler(s) 1299 1309
        //  649 1409:aload           13
        //  650 1411:getfield        #173 <Field Bitmap SuperSurfaceItem.cachedBitmap>
        //  651 1414:astore          14
        //  652 1416:goto            666
        // try 1419 1432 handler(s) 1299 1309
        //  653 1419:aload           15
        //  654 1421:bipush          60
        //  655 1423:iconst_0        
        //  656 1424:iconst_0        
        //  657 1425:iconst_0        
        //  658 1426:invokestatic    #211 <Method int Color.argb(int, int, int, int)>
        //  659 1429:invokevirtual   #155 <Method void Paint.setColor(int)>
        //  660 1432:goto            766
        // try 1435 1510 handler(s) 1299 1309
        //  661 1435:aload_1         
        //  662 1436:aload_0         
        //  663 1437:getfield        #17  <Field SuperSurface$3 this$1>
        //  664 1440:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  665 1443:getfield        #292 <Field Bitmap SuperSurface.resizePinBitmap>
        //  666 1446:aload           13
        //  667 1448:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  668 1451:getstatic       #69  <Field int SuperSurface.startPosX>
        //  669 1454:i2f             
        //  670 1455:fadd            
        //  671 1456:aload           13
        //  672 1458:getfield        #177 <Field float SuperSurfaceItem.tempWidth>
        //  673 1461:fadd            
        //  674 1462:aload_0         
        //  675 1463:getfield        #17  <Field SuperSurface$3 this$1>
        //  676 1466:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  677 1469:ldc2            #269 <Float 24F>
        //  678 1472:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  679 1475:fsub            
        //  680 1476:aload           13
        //  681 1478:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  682 1481:getstatic       #72  <Field int SuperSurface.startPosY>
        //  683 1484:i2f             
        //  684 1485:fadd            
        //  685 1486:aload           13
        //  686 1488:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  687 1491:fadd            
        //  688 1492:aload_0         
        //  689 1493:getfield        #17  <Field SuperSurface$3 this$1>
        //  690 1496:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  691 1499:ldc2            #269 <Float 24F>
        //  692 1502:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  693 1505:fsub            
        //  694 1506:aconst_null     
        //  695 1507:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        //  696 1510:goto            1207
        // try 1513 1582 handler(s) 1299 1309
        //  697 1513:aload_1         
        //  698 1514:aload_0         
        //  699 1515:getfield        #17  <Field SuperSurface$3 this$1>
        //  700 1518:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  701 1521:getfield        #295 <Field Bitmap SuperSurface.rotatePinBitmap>
        //  702 1524:aload           13
        //  703 1526:getfield        #197 <Field float SuperSurfaceItem.tempPosX>
        //  704 1529:getstatic       #69  <Field int SuperSurface.startPosX>
        //  705 1532:i2f             
        //  706 1533:fadd            
        //  707 1534:aload_0         
        //  708 1535:getfield        #17  <Field SuperSurface$3 this$1>
        //  709 1538:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  710 1541:ldc2            #269 <Float 24F>
        //  711 1544:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  712 1547:fsub            
        //  713 1548:aload           13
        //  714 1550:getfield        #200 <Field float SuperSurfaceItem.tempPosY>
        //  715 1553:getstatic       #72  <Field int SuperSurface.startPosY>
        //  716 1556:i2f             
        //  717 1557:fadd            
        //  718 1558:aload           13
        //  719 1560:getfield        #180 <Field float SuperSurfaceItem.tempHeight>
        //  720 1563:fadd            
        //  721 1564:aload_0         
        //  722 1565:getfield        #17  <Field SuperSurface$3 this$1>
        //  723 1568:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  724 1571:ldc2            #269 <Float 24F>
        //  725 1574:invokevirtual   #129 <Method float SuperSurface.fixToSize(float)>
        //  726 1577:fsub            
        //  727 1578:aconst_null     
        //  728 1579:invokevirtual   #76  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        //  729 1582:goto            1284
        // catch Exception Exception Exception
        //  730 1585:astore          6
        // try 1587 1622 handler(s) 1309
        //  731 1587:aload_0         
        //  732 1588:getfield        #17  <Field SuperSurface$3 this$1>
        //  733 1591:invokestatic    #25  <Method SuperSurface SuperSurface$3.access$0(SuperSurface$3)>
        //  734 1594:getfield        #298 <Field String SuperSurface.TAG>
        //  735 1597:new             #300 <Class StringBuilder>
        //  736 1600:dup             
        //  737 1601:ldc2            #302 <String "in drawing SuperSurface' corners: ">
        //  738 1604:invokespecial   #305 <Method void StringBuilder(String)>
        //  739 1607:aload           6
        //  740 1609:invokevirtual   #309 <Method String Exception.toString()>
        //  741 1612:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
        //  742 1615:invokevirtual   #314 <Method String StringBuilder.toString()>
        //  743 1618:invokestatic    #320 <Method int Log.e(String, String)>
        //  744 1621:pop             
        //  745 1622:goto            552
        }

        final _cls3 this$1;
    }

}
