// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.*;
import android.media.FaceDetector;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            MonitoredActivity, HighlightView, Util, CropImageView, 
//            BitmapManager, RotateBitmap

public class CropImage extends MonitoredActivity
{

    public CropImage()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #87  <Method void MonitoredActivity()>
    //    2    4:aload_0         
    //    3    5:sipush          1024
    //    4    8:putfield        #89  <Field int IMAGE_MAX_SIZE>
    //    5   11:aload_0         
    //    6   12:getstatic       #94  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
    //    7   15:putfield        #96  <Field android.graphics.Bitmap$CompressFormat mOutputFormat>
    //    8   18:aload_0         
    //    9   19:aconst_null     
    //   10   20:putfield        #98  <Field Uri mSaveUri>
    //   11   23:aload_0         
    //   12   24:iconst_1        
    //   13   25:putfield        #100 <Field boolean mDoFaceDetection>
    //   14   28:aload_0         
    //   15   29:iconst_0        
    //   16   30:putfield        #102 <Field boolean mCircleCrop>
    //   17   33:aload_0         
    //   18   34:new             #104 <Class Handler>
    //   19   37:dup             
    //   20   38:invokespecial   #105 <Method void Handler()>
    //   21   41:putfield        #107 <Field Handler mHandler>
    //   22   44:aload_0         
    //   23   45:iconst_1        
    //   24   46:putfield        #109 <Field boolean mScaleUp>
    //   25   49:aload_0         
    //   26   50:new             #111 <Class BitmapManager$ThreadSet>
    //   27   53:dup             
    //   28   54:invokespecial   #112 <Method void BitmapManager$ThreadSet()>
    //   29   57:putfield        #114 <Field BitmapManager$ThreadSet mDecodingThreads>
    //   30   60:aload_0         
    //   31   61:new             #116 <Class CropImage$1>
    //   32   64:dup             
    //   33   65:aload_0         
    //   34   66:invokespecial   #119 <Method void CropImage$1(CropImage)>
    //   35   69:putfield        #121 <Field Runnable mRunFaceDetection>
    //   36   72:return          
    }

    static CropImageView access$0(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #125 <Field CropImageView mImageView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #125 <Field CropImageView mImageView>
    //    5    4:areturn         
    }

    static Bitmap access$1(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #129 <Field Bitmap mBitmap>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #129 <Field Bitmap mBitmap>
    //    5    4:areturn         
    }

    static boolean access$2(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #102 <Field boolean mCircleCrop>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #102 <Field boolean mCircleCrop>
    //    5    4:ireturn         
    }

    static int access$3(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field int mAspectX>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #135 <Field int mAspectX>
    //    5    4:ireturn         
    }

    static int access$4(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field int mAspectY>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #138 <Field int mAspectY>
    //    5    4:ireturn         
    }

    static boolean access$5(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field boolean mDoFaceDetection>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #100 <Field boolean mDoFaceDetection>
    //    5    4:ireturn         
    }

    static Handler access$6(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field Handler mHandler>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #107 <Field Handler mHandler>
    //    5    4:areturn         
    }

    static void access$7(CropImage cropimage)
        throws Exception
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #147 <Method void onSaveClicked()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #147 <Method void onSaveClicked()>
    //    5    4:return          
    }

    static void access$8(CropImage cropimage, Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #129 <Field Bitmap mBitmap>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #129 <Field Bitmap mBitmap>
    //    7    5:return          
    }

    static void access$9(CropImage cropimage, Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #154 <Method void saveOutput(Bitmap)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #154 <Method void saveOutput(Bitmap)>
    //    7    5:return          
    }

    public static int calculatePicturesRemaining(Activity activity)
    {
    // try 0 18 handler(s) 59
    //    0    0:ldc1            #158 <String "mounted">
    //    1    2:invokestatic    #164 <Method String Environment.getExternalStorageState()>
    //    2    5:invokevirtual   #170 <Method boolean String.equals(Object)>
    //    3    8:ifeq            46
    //    4   11:invokestatic    #174 <Method File Environment.getExternalStorageDirectory()>
    //    5   14:invokevirtual   #179 <Method String File.toString()>
    //    6   17:astore_3        
    // try 18 46 handler(s) 59
    //    7   18:new             #181 <Class StatFs>
    //    8   21:dup             
    //    9   22:aload_3         
    //   10   23:invokespecial   #184 <Method void StatFs(String)>
    //   11   26:astore          4
    //   12   28:aload           4
    //   13   30:invokevirtual   #188 <Method int StatFs.getAvailableBlocks()>
    //   14   33:i2f             
    //   15   34:aload           4
    //   16   36:invokevirtual   #191 <Method int StatFs.getBlockSize()>
    //   17   39:i2f             
    //   18   40:fmul            
    //   19   41:ldc1            #192 <Float 400000F>
    //   20   43:fdiv            
    //   21   44:f2i             
    //   22   45:ireturn         
    // try 46 54 handler(s) 59
    //   23   46:aload_0         
    //   24   47:invokevirtual   #197 <Method File Activity.getFilesDir()>
    //   25   50:invokevirtual   #179 <Method String File.toString()>
    //   26   53:astore_2        
    //   27   54:aload_2         
    //   28   55:astore_3        
    //   29   56:goto            18
    // catch Exception Exception Exception
    //   30   59:astore_1        
    //   31   60:bipush          -2
    //   32   62:ireturn         
    }

    private Bitmap getBitmap(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #207 <Method Uri getImageUri(String)>
    //    3    5:astore_2        
    // try 6 45 handler(s) 156 189
    //    4    6:aload_0         
    //    5    7:getfield        #209 <Field ContentResolver mContentResolver>
    //    6   10:aload_2         
    //    7   11:invokevirtual   #215 <Method InputStream ContentResolver.openInputStream(Uri)>
    //    8   14:astore          7
    //    9   16:new             #217 <Class android.graphics.BitmapFactory$Options>
    //   10   19:dup             
    //   11   20:invokespecial   #218 <Method void android.graphics.BitmapFactory$Options()>
    //   12   23:astore          8
    //   13   25:aload           8
    //   14   27:iconst_1        
    //   15   28:putfield        #221 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
    //   16   31:aload           7
    //   17   33:aconst_null     
    //   18   34:aload           8
    //   19   36:invokestatic    #227 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
    //   20   39:pop             
    //   21   40:aload           7
    //   22   42:invokevirtual   #232 <Method void InputStream.close()>
    //   23   45:iconst_1        
    //   24   46:istore          10
    // try 48 70 handler(s) 156 189
    //   25   48:aload           8
    //   26   50:getfield        #235 <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   27   53:sipush          1024
    //   28   56:icmpgt          70
    //   29   59:aload           8
    //   30   61:getfield        #238 <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   31   64:sipush          1024
    //   32   67:icmple          112
    // try 70 112 handler(s) 156 189
    //   33   70:ldc2w           #239 <Double 2D>
    //   34   73:ldc2w           #241 <Double 1024D>
    //   35   76:aload           8
    //   36   78:getfield        #235 <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   37   81:aload           8
    //   38   83:getfield        #238 <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   39   86:invokestatic    #248 <Method int Math.max(int, int)>
    //   40   89:i2d             
    //   41   90:ddiv            
    //   42   91:invokestatic    #252 <Method double Math.log(double)>
    //   43   94:ldc2w           #253 <Double 0.5D>
    //   44   97:invokestatic    #252 <Method double Math.log(double)>
    //   45  100:ddiv            
    //   46  101:invokestatic    #258 <Method long Math.round(double)>
    //   47  104:l2i             
    //   48  105:i2d             
    //   49  106:invokestatic    #262 <Method double Math.pow(double, double)>
    //   50  109:d2i             
    //   51  110:istore          10
    // try 112 153 handler(s) 156 189
    //   52  112:new             #217 <Class android.graphics.BitmapFactory$Options>
    //   53  115:dup             
    //   54  116:invokespecial   #218 <Method void android.graphics.BitmapFactory$Options()>
    //   55  119:astore          11
    //   56  121:aload           11
    //   57  123:iload           10
    //   58  125:putfield        #265 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
    //   59  128:aload_0         
    //   60  129:getfield        #209 <Field ContentResolver mContentResolver>
    //   61  132:aload_2         
    //   62  133:invokevirtual   #215 <Method InputStream ContentResolver.openInputStream(Uri)>
    //   63  136:astore          12
    //   64  138:aload           12
    //   65  140:aconst_null     
    //   66  141:aload           11
    //   67  143:invokestatic    #227 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
    //   68  146:astore          13
    //   69  148:aload           12
    //   70  150:invokevirtual   #232 <Method void InputStream.close()>
    //   71  153:aload           13
    //   72  155:areturn         
    // catch FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException
    //   73  156:astore          5
    //   74  158:ldc1            #52  <String "CropImage">
    //   75  160:new             #267 <Class StringBuilder>
    //   76  163:dup             
    //   77  164:ldc2            #269 <String "file ">
    //   78  167:invokespecial   #270 <Method void StringBuilder(String)>
    //   79  170:aload_1         
    //   80  171:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
    //   81  174:ldc2            #276 <String " not found">
    //   82  177:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
    //   83  180:invokevirtual   #277 <Method String StringBuilder.toString()>
    //   84  183:invokestatic    #283 <Method int Log.e(String, String)>
    //   85  186:pop             
    //   86  187:aconst_null     
    //   87  188:areturn         
    // catch IOException IOException IOException IOException
    //   88  189:astore_3        
    //   89  190:ldc1            #52  <String "CropImage">
    //   90  192:new             #267 <Class StringBuilder>
    //   91  195:dup             
    //   92  196:ldc2            #269 <String "file ">
    //   93  199:invokespecial   #270 <Method void StringBuilder(String)>
    //   94  202:aload_1         
    //   95  203:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
    //   96  206:ldc2            #276 <String " not found">
    //   97  209:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
    //   98  212:invokevirtual   #277 <Method String StringBuilder.toString()>
    //   99  215:invokestatic    #283 <Method int Log.e(String, String)>
    //  100  218:pop             
    //  101  219:goto            187
    }

    private Uri getImageUri(String s)
    {
    //    0    0:new             #176 <Class File>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #284 <Method void File(String)>
    //    4    8:invokestatic    #290 <Method Uri Uri.fromFile(File)>
    //    5   11:areturn         
    }

    private void onSaveClicked()
        throws Exception
    {
    //    0    0:aload_0         
    //    1    1:getfield        #292 <Field boolean mSaving>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #294 <Field HighlightView mCrop>
    //    6   12:ifnull          7
    //    7   15:aload_0         
    //    8   16:iconst_1        
    //    9   17:putfield        #292 <Field boolean mSaving>
    //   10   20:aload_0         
    //   11   21:getfield        #294 <Field HighlightView mCrop>
    //   12   24:invokevirtual   #300 <Method Rect HighlightView.getCropRect()>
    //   13   27:astore_1        
    //   14   28:aload_1         
    //   15   29:invokevirtual   #305 <Method int Rect.width()>
    //   16   32:istore_2        
    //   17   33:aload_1         
    //   18   34:invokevirtual   #308 <Method int Rect.height()>
    //   19   37:istore_3        
    // try 38 50 handler(s) 322
    //   20   38:aload_0         
    //   21   39:getfield        #102 <Field boolean mCircleCrop>
    //   22   42:ifeq            314
    //   23   45:getstatic       #314 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //   24   48:astore          5
    // try 50 59 handler(s) 322
    //   25   50:iload_2         
    //   26   51:iload_3         
    //   27   52:aload           5
    //   28   54:invokestatic    #320 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //   29   57:astore          6
    //   30   59:aload           6
    //   31   61:astore          7
    //   32   63:aload           7
    //   33   65:ifnull          7
    //   34   68:new             #322 <Class Canvas>
    //   35   71:dup             
    //   36   72:aload           7
    //   37   74:invokespecial   #324 <Method void Canvas(Bitmap)>
    //   38   77:astore          8
    //   39   79:new             #302 <Class Rect>
    //   40   82:dup             
    //   41   83:iconst_0        
    //   42   84:iconst_0        
    //   43   85:iload_2         
    //   44   86:iload_3         
    //   45   87:invokespecial   #327 <Method void Rect(int, int, int, int)>
    //   46   90:astore          9
    //   47   92:aload           8
    //   48   94:aload_0         
    //   49   95:getfield        #129 <Field Bitmap mBitmap>
    //   50   98:aload_1         
    //   51   99:aload           9
    //   52  101:aconst_null     
    //   53  102:invokevirtual   #331 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, android.graphics.Paint)>
    //   54  105:aload_0         
    //   55  106:getfield        #102 <Field boolean mCircleCrop>
    //   56  109:ifeq            172
    //   57  112:new             #322 <Class Canvas>
    //   58  115:dup             
    //   59  116:aload           7
    //   60  118:invokespecial   #324 <Method void Canvas(Bitmap)>
    //   61  121:astore          10
    //   62  123:new             #333 <Class Path>
    //   63  126:dup             
    //   64  127:invokespecial   #334 <Method void Path()>
    //   65  130:astore          11
    //   66  132:aload           11
    //   67  134:iload_2         
    //   68  135:i2f             
    //   69  136:fconst_2        
    //   70  137:fdiv            
    //   71  138:iload_3         
    //   72  139:i2f             
    //   73  140:fconst_2        
    //   74  141:fdiv            
    //   75  142:iload_2         
    //   76  143:i2f             
    //   77  144:fconst_2        
    //   78  145:fdiv            
    //   79  146:getstatic       #340 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
    //   80  149:invokevirtual   #344 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
    //   81  152:aload           10
    //   82  154:aload           11
    //   83  156:getstatic       #350 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
    //   84  159:invokevirtual   #354 <Method boolean Canvas.clipPath(Path, android.graphics.Region$Op)>
    //   85  162:pop             
    //   86  163:aload           10
    //   87  165:iconst_0        
    //   88  166:getstatic       #360 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.CLEAR>
    //   89  169:invokevirtual   #364 <Method void Canvas.drawColor(int, android.graphics.PorterDuff$Mode)>
    //   90  172:aload_0         
    //   91  173:getfield        #366 <Field int mOutputX>
    //   92  176:ifeq            235
    //   93  179:aload_0         
    //   94  180:getfield        #368 <Field int mOutputY>
    //   95  183:ifeq            235
    //   96  186:aload_0         
    //   97  187:getfield        #370 <Field boolean mScale>
    //   98  190:ifeq            327
    //   99  193:aload           7
    //  100  195:astore          24
    //  101  197:new             #372 <Class Matrix>
    //  102  200:dup             
    //  103  201:invokespecial   #373 <Method void Matrix()>
    //  104  204:aload           7
    //  105  206:aload_0         
    //  106  207:getfield        #366 <Field int mOutputX>
    //  107  210:aload_0         
    //  108  211:getfield        #368 <Field int mOutputY>
    //  109  214:aload_0         
    //  110  215:getfield        #109 <Field boolean mScaleUp>
    //  111  218:invokestatic    #379 <Method Bitmap Util.transform(Matrix, Bitmap, int, int, boolean)>
    //  112  221:astore          7
    //  113  223:aload           24
    //  114  225:aload           7
    //  115  227:if_acmpeq       235
    //  116  230:aload           24
    //  117  232:invokevirtual   #382 <Method void Bitmap.recycle()>
    //  118  235:aload_0         
    //  119  236:invokevirtual   #386 <Method Intent getIntent()>
    //  120  239:invokevirtual   #392 <Method Bundle Intent.getExtras()>
    //  121  242:astore          13
    //  122  244:aload           13
    //  123  246:ifnull          474
    //  124  249:aload           13
    //  125  251:ldc1            #43  <String "data">
    //  126  253:invokevirtual   #398 <Method android.os.Parcelable Bundle.getParcelable(String)>
    //  127  256:ifnonnull       269
    //  128  259:aload           13
    //  129  261:ldc1            #40  <String "return-data">
    //  130  263:invokevirtual   #402 <Method boolean Bundle.getBoolean(String)>
    //  131  266:ifeq            474
    //  132  269:new             #394 <Class Bundle>
    //  133  272:dup             
    //  134  273:invokespecial   #403 <Method void Bundle()>
    //  135  276:astore          17
    //  136  278:aload           17
    //  137  280:ldc1            #43  <String "data">
    //  138  282:aload           7
    //  139  284:invokevirtual   #407 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
    //  140  287:aload_0         
    //  141  288:iconst_m1       
    //  142  289:new             #388 <Class Intent>
    //  143  292:dup             
    //  144  293:invokespecial   #408 <Method void Intent()>
    //  145  296:ldc1            #11  <String "inline-data">
    //  146  298:invokevirtual   #412 <Method Intent Intent.setAction(String)>
    //  147  301:aload           17
    //  148  303:invokevirtual   #416 <Method Intent Intent.putExtras(Bundle)>
    //  149  306:invokevirtual   #420 <Method void setResult(int, Intent)>
    //  150  309:aload_0         
    //  151  310:invokevirtual   #423 <Method void finish()>
    //  152  313:return          
    // try 314 319 handler(s) 322
    //  153  314:getstatic       #426 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
    //  154  317:astore          5
    //  155  319:goto            50
    // catch Exception Exception Exception
    //  156  322:astore          4
    //  157  324:aload           4
    //  158  326:athrow          
    //  159  327:aload_0         
    //  160  328:getfield        #366 <Field int mOutputX>
    //  161  331:aload_0         
    //  162  332:getfield        #368 <Field int mOutputY>
    //  163  335:getstatic       #426 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
    //  164  338:invokestatic    #320 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //  165  341:astore          18
    //  166  343:new             #322 <Class Canvas>
    //  167  346:dup             
    //  168  347:aload           18
    //  169  349:invokespecial   #324 <Method void Canvas(Bitmap)>
    //  170  352:astore          19
    //  171  354:aload_0         
    //  172  355:getfield        #294 <Field HighlightView mCrop>
    //  173  358:invokevirtual   #300 <Method Rect HighlightView.getCropRect()>
    //  174  361:astore          20
    //  175  363:new             #302 <Class Rect>
    //  176  366:dup             
    //  177  367:iconst_0        
    //  178  368:iconst_0        
    //  179  369:aload_0         
    //  180  370:getfield        #366 <Field int mOutputX>
    //  181  373:aload_0         
    //  182  374:getfield        #368 <Field int mOutputY>
    //  183  377:invokespecial   #327 <Method void Rect(int, int, int, int)>
    //  184  380:astore          21
    //  185  382:aload           20
    //  186  384:invokevirtual   #305 <Method int Rect.width()>
    //  187  387:aload           21
    //  188  389:invokevirtual   #305 <Method int Rect.width()>
    //  189  392:isub            
    //  190  393:iconst_2        
    //  191  394:idiv            
    //  192  395:istore          22
    //  193  397:aload           20
    //  194  399:invokevirtual   #308 <Method int Rect.height()>
    //  195  402:aload           21
    //  196  404:invokevirtual   #308 <Method int Rect.height()>
    //  197  407:isub            
    //  198  408:iconst_2        
    //  199  409:idiv            
    //  200  410:istore          23
    //  201  412:aload           20
    //  202  414:iconst_0        
    //  203  415:iload           22
    //  204  417:invokestatic    #248 <Method int Math.max(int, int)>
    //  205  420:iconst_0        
    //  206  421:iload           23
    //  207  423:invokestatic    #248 <Method int Math.max(int, int)>
    //  208  426:invokevirtual   #430 <Method void Rect.inset(int, int)>
    //  209  429:aload           21
    //  210  431:iconst_0        
    //  211  432:iload           22
    //  212  434:ineg            
    //  213  435:invokestatic    #248 <Method int Math.max(int, int)>
    //  214  438:iconst_0        
    //  215  439:iload           23
    //  216  441:ineg            
    //  217  442:invokestatic    #248 <Method int Math.max(int, int)>
    //  218  445:invokevirtual   #430 <Method void Rect.inset(int, int)>
    //  219  448:aload           19
    //  220  450:aload_0         
    //  221  451:getfield        #129 <Field Bitmap mBitmap>
    //  222  454:aload           20
    //  223  456:aload           21
    //  224  458:aconst_null     
    //  225  459:invokevirtual   #331 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, android.graphics.Paint)>
    //  226  462:aload           7
    //  227  464:invokevirtual   #382 <Method void Bitmap.recycle()>
    //  228  467:aload           18
    //  229  469:astore          7
    //  230  471:goto            235
    //  231  474:aload           7
    //  232  476:astore          14
    //  233  478:aload_0         
    //  234  479:ldc2            #431 <Int 0x7f0b006e>
    //  235  482:invokevirtual   #435 <Method String getString(int)>
    //  236  485:astore          15
    //  237  487:new             #437 <Class CropImage$7>
    //  238  490:dup             
    //  239  491:aload_0         
    //  240  492:aload           14
    //  241  494:invokespecial   #439 <Method void CropImage$7(CropImage, Bitmap)>
    //  242  497:astore          16
    //  243  499:aload_0         
    //  244  500:aconst_null     
    //  245  501:aload           15
    //  246  503:aload           16
    //  247  505:aload_0         
    //  248  506:getfield        #107 <Field Handler mHandler>
    //  249  509:invokestatic    #443 <Method void Util.startBackgroundJob(MonitoredActivity, String, String, Runnable, Handler)>
    //  250  512:return          
    }

    private void saveOutput(Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field Uri mSaveUri>
    //    2    4:ifnull          167
    //    3    7:aconst_null     
    //    4    8:astore_3        
    // try 9 21 handler(s) 114 158
    //    5    9:aload_0         
    //    6   10:getfield        #209 <Field ContentResolver mContentResolver>
    //    7   13:aload_0         
    //    8   14:getfield        #98  <Field Uri mSaveUri>
    //    9   17:invokevirtual   #447 <Method java.io.OutputStream ContentResolver.openOutputStream(Uri)>
    //   10   20:astore_3        
    //   11   21:aload_3         
    //   12   22:ifnull          37
    // try 25 37 handler(s) 114 158
    //   13   25:aload_1         
    //   14   26:aload_0         
    //   15   27:getfield        #96  <Field android.graphics.Bitmap$CompressFormat mOutputFormat>
    //   16   30:bipush          90
    //   17   32:aload_3         
    //   18   33:invokevirtual   #451 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
    //   19   36:pop             
    //   20   37:aload_3         
    //   21   38:invokestatic    #455 <Method void Util.closeSilently(java.io.Closeable)>
    //   22   41:new             #394 <Class Bundle>
    //   23   44:dup             
    //   24   45:invokespecial   #403 <Method void Bundle()>
    //   25   48:astore          8
    //   26   50:new             #388 <Class Intent>
    //   27   53:dup             
    //   28   54:aload_0         
    //   29   55:getfield        #98  <Field Uri mSaveUri>
    //   30   58:invokevirtual   #456 <Method String Uri.toString()>
    //   31   61:invokespecial   #457 <Method void Intent(String)>
    //   32   64:astore          9
    //   33   66:aload           9
    //   34   68:aload           8
    //   35   70:invokevirtual   #416 <Method Intent Intent.putExtras(Bundle)>
    //   36   73:pop             
    //   37   74:aload           9
    //   38   76:ldc1            #26  <String "image-path">
    //   39   78:aload_0         
    //   40   79:getfield        #459 <Field String mImagePath>
    //   41   82:invokevirtual   #463 <Method Intent Intent.putExtra(String, String)>
    //   42   85:pop             
    //   43   86:aload           9
    //   44   88:ldc1            #31  <String "orientation_in_degrees">
    //   45   90:aload_0         
    //   46   91:invokestatic    #466 <Method int Util.getOrientationInDegree(Activity)>
    //   47   94:invokevirtual   #469 <Method Intent Intent.putExtra(String, int)>
    //   48   97:pop             
    //   49   98:aload_0         
    //   50   99:iconst_m1       
    //   51  100:aload           9
    //   52  102:invokevirtual   #420 <Method void setResult(int, Intent)>
    //   53  105:aload_1         
    //   54  106:invokevirtual   #382 <Method void Bitmap.recycle()>
    //   55  109:aload_0         
    //   56  110:invokevirtual   #423 <Method void finish()>
    //   57  113:return          
    // catch IOException IOException
    //   58  114:astore          5
    // try 116 153 handler(s) 158
    //   59  116:ldc1            #52  <String "CropImage">
    //   60  118:new             #267 <Class StringBuilder>
    //   61  121:dup             
    //   62  122:ldc2            #471 <String "Cannot open file: ">
    //   63  125:invokespecial   #270 <Method void StringBuilder(String)>
    //   64  128:aload_0         
    //   65  129:getfield        #98  <Field Uri mSaveUri>
    //   66  132:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
    //   67  135:invokevirtual   #277 <Method String StringBuilder.toString()>
    //   68  138:aload           5
    //   69  140:invokestatic    #477 <Method int Log.e(String, String, Throwable)>
    //   70  143:pop             
    //   71  144:aload_0         
    //   72  145:iconst_0        
    //   73  146:invokevirtual   #480 <Method void setResult(int)>
    //   74  149:aload_0         
    //   75  150:invokevirtual   #423 <Method void finish()>
    //   76  153:aload_3         
    //   77  154:invokestatic    #455 <Method void Util.closeSilently(java.io.Closeable)>
    //   78  157:return          
    // finally
    //   79  158:astore          4
    //   80  160:aload_3         
    //   81  161:invokestatic    #455 <Method void Util.closeSilently(java.io.Closeable)>
    //   82  164:aload           4
    //   83  166:athrow          
    //   84  167:ldc1            #52  <String "CropImage">
    //   85  169:ldc2            #482 <String "not defined image url">
    //   86  172:invokestatic    #283 <Method int Log.e(String, String)>
    //   87  175:pop             
    //   88  176:goto            105
    }

    public static void showStorageToast(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokestatic    #486 <Method int calculatePicturesRemaining(Activity)>
    //    3    5:invokestatic    #489 <Method void showStorageToast(Activity, int)>
    //    4    8:return          
    }

    public static void showStorageToast(Activity activity, int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_m1       
    //    2    2:icmpne          52
    //    3    5:invokestatic    #164 <Method String Environment.getExternalStorageState()>
    //    4    8:ldc2            #491 <String "checking">
    //    5   11:invokevirtual   #170 <Method boolean String.equals(Object)>
    //    6   14:ifeq            41
    //    7   17:aload_0         
    //    8   18:ldc2            #492 <Int 0x7f0b006f>
    //    9   21:invokevirtual   #493 <Method String Activity.getString(int)>
    //   10   24:astore_2        
    //   11   25:aload_2         
    //   12   26:ifnull          40
    //   13   29:aload_0         
    //   14   30:aload_2         
    //   15   31:sipush          5000
    //   16   34:invokestatic    #499 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
    //   17   37:invokevirtual   #502 <Method void Toast.show()>
    //   18   40:return          
    //   19   41:aload_0         
    //   20   42:ldc2            #503 <Int 0x7f0b0070>
    //   21   45:invokevirtual   #493 <Method String Activity.getString(int)>
    //   22   48:astore_2        
    //   23   49:goto            25
    //   24   52:aconst_null     
    //   25   53:astore_2        
    //   26   54:iload_1         
    //   27   55:iconst_1        
    //   28   56:icmpge          25
    //   29   59:aload_0         
    //   30   60:ldc2            #504 <Int 0x7f0b0071>
    //   31   63:invokevirtual   #493 <Method String Activity.getString(int)>
    //   32   66:astore_2        
    //   33   67:goto            25
    }

    private void startFaceDetection()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #509 <Method boolean isFinishing()>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #125 <Field CropImageView mImageView>
    //    6   12:aload_0         
    //    7   13:getfield        #129 <Field Bitmap mBitmap>
    //    8   16:iconst_1        
    //    9   17:invokevirtual   #515 <Method void CropImageView.setImageBitmapResetBase(Bitmap, boolean)>
    //   10   20:aload_0         
    //   11   21:aconst_null     
    //   12   22:ldc2            #517 <String "Please wait\u2026">
    //   13   25:new             #519 <Class CropImage$6>
    //   14   28:dup             
    //   15   29:aload_0         
    //   16   30:invokespecial   #520 <Method void CropImage$6(CropImage)>
    //   17   33:aload_0         
    //   18   34:getfield        #107 <Field Handler mHandler>
    //   19   37:invokestatic    #443 <Method void Util.startBackgroundJob(MonitoredActivity, String, String, Runnable, Handler)>
    //   20   40:return          
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #524 <Method void MonitoredActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #528 <Method ContentResolver getContentResolver()>
    //    6   10:putfield        #209 <Field ContentResolver mContentResolver>
    //    7   13:aload_0         
    //    8   14:iconst_1        
    //    9   15:invokevirtual   #532 <Method boolean requestWindowFeature(int)>
    //   10   18:pop             
    //   11   19:aload_0         
    //   12   20:ldc2            #533 <Int 0x7f030025>
    //   13   23:invokevirtual   #536 <Method void setContentView(int)>
    //   14   26:aload_0         
    //   15   27:aload_0         
    //   16   28:ldc2            #537 <Int 0x7f06002b>
    //   17   31:invokevirtual   #541 <Method View findViewById(int)>
    //   18   34:checkcast       #511 <Class CropImageView>
    //   19   37:putfield        #125 <Field CropImageView mImageView>
    //   20   40:aload_0         
    //   21   41:invokestatic    #543 <Method void showStorageToast(Activity)>
    //   22   44:aload_0         
    //   23   45:invokevirtual   #386 <Method Intent getIntent()>
    //   24   48:invokevirtual   #392 <Method Bundle Intent.getExtras()>
    //   25   51:astore_3        
    //   26   52:aload_3         
    //   27   53:ifnull          235
    //   28   56:aload_3         
    //   29   57:ldc1            #23  <String "circleCrop">
    //   30   59:invokevirtual   #546 <Method String Bundle.getString(String)>
    //   31   62:ifnull          97
    //   32   65:getstatic       #551 <Field int android.os.Build$VERSION.SDK_INT>
    //   33   68:bipush          11
    //   34   70:icmple          82
    //   35   73:aload_0         
    //   36   74:getfield        #125 <Field CropImageView mImageView>
    //   37   77:iconst_1        
    //   38   78:aconst_null     
    //   39   79:invokevirtual   #555 <Method void CropImageView.setLayerType(int, android.graphics.Paint)>
    //   40   82:aload_0         
    //   41   83:iconst_1        
    //   42   84:putfield        #102 <Field boolean mCircleCrop>
    //   43   87:aload_0         
    //   44   88:iconst_1        
    //   45   89:putfield        #135 <Field int mAspectX>
    //   46   92:aload_0         
    //   47   93:iconst_1        
    //   48   94:putfield        #138 <Field int mAspectY>
    //   49   97:aload_0         
    //   50   98:aload_3         
    //   51   99:ldc1            #26  <String "image-path">
    //   52  101:invokevirtual   #546 <Method String Bundle.getString(String)>
    //   53  104:putfield        #459 <Field String mImagePath>
    //   54  107:aload_0         
    //   55  108:aload_0         
    //   56  109:aload_0         
    //   57  110:getfield        #459 <Field String mImagePath>
    //   58  113:invokespecial   #207 <Method Uri getImageUri(String)>
    //   59  116:putfield        #98  <Field Uri mSaveUri>
    //   60  119:aload_0         
    //   61  120:aload_0         
    //   62  121:aload_0         
    //   63  122:getfield        #459 <Field String mImagePath>
    //   64  125:invokespecial   #557 <Method Bitmap getBitmap(String)>
    //   65  128:putfield        #129 <Field Bitmap mBitmap>
    //   66  131:aload_3         
    //   67  132:ldc1            #14  <String "aspectX">
    //   68  134:invokevirtual   #560 <Method boolean Bundle.containsKey(String)>
    //   69  137:ifeq            256
    //   70  140:aload_3         
    //   71  141:ldc1            #14  <String "aspectX">
    //   72  143:invokevirtual   #564 <Method Object Bundle.get(String)>
    //   73  146:instanceof      #566 <Class Integer>
    //   74  149:ifeq            256
    //   75  152:aload_0         
    //   76  153:aload_3         
    //   77  154:ldc1            #14  <String "aspectX">
    //   78  156:invokevirtual   #570 <Method int Bundle.getInt(String)>
    //   79  159:putfield        #135 <Field int mAspectX>
    //   80  162:aload_3         
    //   81  163:ldc1            #17  <String "aspectY">
    //   82  165:invokevirtual   #560 <Method boolean Bundle.containsKey(String)>
    //   83  168:ifeq            267
    //   84  171:aload_3         
    //   85  172:ldc1            #17  <String "aspectY">
    //   86  174:invokevirtual   #564 <Method Object Bundle.get(String)>
    //   87  177:instanceof      #566 <Class Integer>
    //   88  180:ifeq            267
    //   89  183:aload_0         
    //   90  184:aload_3         
    //   91  185:ldc1            #17  <String "aspectY">
    //   92  187:invokevirtual   #570 <Method int Bundle.getInt(String)>
    //   93  190:putfield        #138 <Field int mAspectY>
    //   94  193:aload_0         
    //   95  194:aload_3         
    //   96  195:ldc1            #34  <String "outputX">
    //   97  197:invokevirtual   #570 <Method int Bundle.getInt(String)>
    //   98  200:putfield        #366 <Field int mOutputX>
    //   99  203:aload_0         
    //  100  204:aload_3         
    //  101  205:ldc1            #37  <String "outputY">
    //  102  207:invokevirtual   #570 <Method int Bundle.getInt(String)>
    //  103  210:putfield        #368 <Field int mOutputY>
    //  104  213:aload_0         
    //  105  214:aload_3         
    //  106  215:ldc1            #46  <String "scale">
    //  107  217:iconst_1        
    //  108  218:invokevirtual   #573 <Method boolean Bundle.getBoolean(String, boolean)>
    //  109  221:putfield        #370 <Field boolean mScale>
    //  110  224:aload_0         
    //  111  225:aload_3         
    //  112  226:ldc1            #49  <String "scaleUpIfNeeded">
    //  113  228:iconst_1        
    //  114  229:invokevirtual   #573 <Method boolean Bundle.getBoolean(String, boolean)>
    //  115  232:putfield        #109 <Field boolean mScaleUp>
    //  116  235:aload_0         
    //  117  236:getfield        #129 <Field Bitmap mBitmap>
    //  118  239:ifnonnull       278
    //  119  242:ldc1            #52  <String "CropImage">
    //  120  244:ldc2            #575 <String "finish!!!">
    //  121  247:invokestatic    #578 <Method int Log.d(String, String)>
    //  122  250:pop             
    //  123  251:aload_0         
    //  124  252:invokevirtual   #423 <Method void finish()>
    //  125  255:return          
    //  126  256:new             #580 <Class IllegalArgumentException>
    //  127  259:dup             
    //  128  260:ldc2            #582 <String "aspect_x must be integer">
    //  129  263:invokespecial   #583 <Method void IllegalArgumentException(String)>
    //  130  266:athrow          
    //  131  267:new             #580 <Class IllegalArgumentException>
    //  132  270:dup             
    //  133  271:ldc2            #585 <String "aspect_y must be integer">
    //  134  274:invokespecial   #583 <Method void IllegalArgumentException(String)>
    //  135  277:athrow          
    //  136  278:aload_0         
    //  137  279:invokevirtual   #589 <Method Window getWindow()>
    //  138  282:sipush          1024
    //  139  285:invokevirtual   #594 <Method void Window.addFlags(int)>
    //  140  288:aload_0         
    //  141  289:ldc2            #595 <Int 0x7f06007c>
    //  142  292:invokevirtual   #541 <Method View findViewById(int)>
    //  143  295:new             #597 <Class CropImage$2>
    //  144  298:dup             
    //  145  299:aload_0         
    //  146  300:invokespecial   #598 <Method void CropImage$2(CropImage)>
    //  147  303:invokevirtual   #604 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  148  306:aload_0         
    //  149  307:ldc2            #605 <Int 0x7f06007f>
    //  150  310:invokevirtual   #541 <Method View findViewById(int)>
    //  151  313:new             #607 <Class CropImage$3>
    //  152  316:dup             
    //  153  317:aload_0         
    //  154  318:invokespecial   #608 <Method void CropImage$3(CropImage)>
    //  155  321:invokevirtual   #604 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  156  324:aload_0         
    //  157  325:ldc2            #609 <Int 0x7f06007d>
    //  158  328:invokevirtual   #541 <Method View findViewById(int)>
    //  159  331:new             #611 <Class CropImage$4>
    //  160  334:dup             
    //  161  335:aload_0         
    //  162  336:invokespecial   #612 <Method void CropImage$4(CropImage)>
    //  163  339:invokevirtual   #604 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  164  342:aload_0         
    //  165  343:ldc2            #613 <Int 0x7f06007e>
    //  166  346:invokevirtual   #541 <Method View findViewById(int)>
    //  167  349:new             #615 <Class CropImage$5>
    //  168  352:dup             
    //  169  353:aload_0         
    //  170  354:invokespecial   #616 <Method void CropImage$5(CropImage)>
    //  171  357:invokevirtual   #604 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  172  360:aload_0         
    //  173  361:invokespecial   #618 <Method void startFaceDetection()>
    //  174  364:return          
    }

    protected void onDestroy()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #621 <Method void MonitoredActivity.onDestroy()>
    //    2    4:aload_0         
    //    3    5:getfield        #129 <Field Bitmap mBitmap>
    //    4    8:ifnull          18
    //    5   11:aload_0         
    //    6   12:getfield        #129 <Field Bitmap mBitmap>
    //    7   15:invokevirtual   #382 <Method void Bitmap.recycle()>
    //    8   18:return          
    }

    protected void onPause()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #624 <Method void MonitoredActivity.onPause()>
    //    2    4:invokestatic    #630 <Method BitmapManager BitmapManager.instance()>
    //    3    7:aload_0         
    //    4    8:getfield        #114 <Field BitmapManager$ThreadSet mDecodingThreads>
    //    5   11:invokevirtual   #634 <Method void BitmapManager.cancelThreadDecoding(BitmapManager$ThreadSet)>
    //    6   14:return          
    }

    public static final String ACTION_INLINE_DATA = "inline-data";
    public static final String ASPECT_X = "aspectX";
    public static final String ASPECT_Y = "aspectY";
    public static final int CANNOT_STAT_ERROR = -2;
    public static final String CIRCLE_CROP = "circleCrop";
    public static final String IMAGE_PATH = "image-path";
    public static final int NO_STORAGE_ERROR = -1;
    public static final String ORIENTATION_IN_DEGREES = "orientation_in_degrees";
    public static final String OUTPUT_X = "outputX";
    public static final String OUTPUT_Y = "outputY";
    public static final String RETURN_DATA = "return-data";
    public static final String RETURN_DATA_AS_BITMAP = "data";
    public static final String SCALE = "scale";
    public static final String SCALE_UP_IF_NEEDED = "scaleUpIfNeeded";
    private static final String TAG = "CropImage";
    final int IMAGE_MAX_SIZE;
    private int mAspectX;
    private int mAspectY;
    private Bitmap mBitmap;
    private boolean mCircleCrop;
    private ContentResolver mContentResolver;
    HighlightView mCrop;
    private final BitmapManager.ThreadSet mDecodingThreads;
    private boolean mDoFaceDetection;
    private final Handler mHandler;
    private String mImagePath;
    private CropImageView mImageView;
    private android.graphics.Bitmap.CompressFormat mOutputFormat;
    private int mOutputX;
    private int mOutputY;
    Runnable mRunFaceDetection;
    private Uri mSaveUri;
    boolean mSaving;
    private boolean mScale;
    private boolean mScaleUp;
    boolean mWaitingToPick;

    static CropImageView access$0(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #125 <Field CropImageView mImageView>
    //    2    4:areturn         
    }

    static Bitmap access$1(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #129 <Field Bitmap mBitmap>
    //    2    4:areturn         
    }

    static boolean access$2(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #102 <Field boolean mCircleCrop>
    //    2    4:ireturn         
    }

    static int access$3(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field int mAspectX>
    //    2    4:ireturn         
    }

    static int access$4(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field int mAspectY>
    //    2    4:ireturn         
    }

    static boolean access$5(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field boolean mDoFaceDetection>
    //    2    4:ireturn         
    }

    static Handler access$6(CropImage cropimage)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #107 <Field Handler mHandler>
    //    2    4:areturn         
    }

    static void access$7(CropImage cropimage)
        throws Exception
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #147 <Method void onSaveClicked()>
    //    2    4:return          
    }

    static void access$8(CropImage cropimage, Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #129 <Field Bitmap mBitmap>
    //    3    5:return          
    }

    static void access$9(CropImage cropimage, Bitmap bitmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #154 <Method void saveOutput(Bitmap)>
    //    3    5:return          
    }

    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #25  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:fconst_1        
        //    7   11:putfield        #27  <Field float mScale>
        //    8   14:aload_0         
        //    9   15:iconst_3        
        //   10   16:anewarray       android.media.FaceDetector.Face[]
        //   11   19:putfield        #31  <Field android.media.FaceDetector$Face[] mFaces>
        //   12   22:return          
        }

        static void access$0(_cls1 _pcls1, android.media.FaceDetector.Face face)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #37  <Method void handleFace(android.media.FaceDetector$Face)>
        //    3    5:return          
// Previous instruction length mismatch
        //    4    0:aload_0         
        //    5    1:aload_1         
        //    6    2:invokespecial   #37  <Method void handleFace(android.media.FaceDetector$Face)>
        //    7    5:return          
        }

        static void access$1(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #42  <Method void makeDefault()>
        //    2    4:return          
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #42  <Method void makeDefault()>
        //    5    4:return          
        }

        static CropImage access$2(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field CropImage this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #22  <Field CropImage this$0>
        //    5    4:areturn         
        }

        private void handleFace(android.media.FaceDetector.Face face)
        {
        //    0    0:new             #46  <Class PointF>
        //    1    3:dup             
        //    2    4:invokespecial   #47  <Method void PointF()>
        //    3    7:astore_2        
        //    4    8:iconst_2        
        //    5    9:aload_1         
        //    6   10:invokevirtual   #51  <Method float android.media.FaceDetector$Face.eyesDistance()>
        //    7   13:aload_0         
        //    8   14:getfield        #27  <Field float mScale>
        //    9   17:fmul            
        //   10   18:f2i             
        //   11   19:imul            
        //   12   20:istore_3        
        //   13   21:aload_1         
        //   14   22:aload_2         
        //   15   23:invokevirtual   #55  <Method void android.media.FaceDetector$Face.getMidPoint(PointF)>
        //   16   26:aload_2         
        //   17   27:aload_2         
        //   18   28:getfield        #58  <Field float PointF.x>
        //   19   31:aload_0         
        //   20   32:getfield        #27  <Field float mScale>
        //   21   35:fmul            
        //   22   36:putfield        #58  <Field float PointF.x>
        //   23   39:aload_2         
        //   24   40:aload_2         
        //   25   41:getfield        #61  <Field float PointF.y>
        //   26   44:aload_0         
        //   27   45:getfield        #27  <Field float mScale>
        //   28   48:fmul            
        //   29   49:putfield        #61  <Field float PointF.y>
        //   30   52:aload_2         
        //   31   53:getfield        #58  <Field float PointF.x>
        //   32   56:f2i             
        //   33   57:istore          4
        //   34   59:aload_2         
        //   35   60:getfield        #61  <Field float PointF.y>
        //   36   63:f2i             
        //   37   64:istore          5
        //   38   66:new             #63  <Class HighlightView>
        //   39   69:dup             
        //   40   70:aload_0         
        //   41   71:getfield        #22  <Field CropImage this$0>
        //   42   74:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //   43   77:invokespecial   #69  <Method void HighlightView(View)>
        //   44   80:astore          6
        //   45   82:new             #71  <Class Rect>
        //   46   85:dup             
        //   47   86:iconst_0        
        //   48   87:iconst_0        
        //   49   88:aload_0         
        //   50   89:getfield        #22  <Field CropImage this$0>
        //   51   92:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   52   95:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   53   98:aload_0         
        //   54   99:getfield        #22  <Field CropImage this$0>
        //   55  102:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   56  105:invokevirtual   #83  <Method int Bitmap.getHeight()>
        //   57  108:invokespecial   #86  <Method void Rect(int, int, int, int)>
        //   58  111:astore          7
        //   59  113:new             #88  <Class RectF>
        //   60  116:dup             
        //   61  117:iload           4
        //   62  119:i2f             
        //   63  120:iload           5
        //   64  122:i2f             
        //   65  123:iload           4
        //   66  125:i2f             
        //   67  126:iload           5
        //   68  128:i2f             
        //   69  129:invokespecial   #91  <Method void RectF(float, float, float, float)>
        //   70  132:astore          8
        //   71  134:aload           8
        //   72  136:iload_3         
        //   73  137:ineg            
        //   74  138:i2f             
        //   75  139:iload_3         
        //   76  140:ineg            
        //   77  141:i2f             
        //   78  142:invokevirtual   #95  <Method void RectF.inset(float, float)>
        //   79  145:aload           8
        //   80  147:getfield        #98  <Field float RectF.left>
        //   81  150:fconst_0        
        //   82  151:fcmpg           
        //   83  152:ifge            172
        //   84  155:aload           8
        //   85  157:aload           8
        //   86  159:getfield        #98  <Field float RectF.left>
        //   87  162:fneg            
        //   88  163:aload           8
        //   89  165:getfield        #98  <Field float RectF.left>
        //   90  168:fneg            
        //   91  169:invokevirtual   #95  <Method void RectF.inset(float, float)>
        //   92  172:aload           8
        //   93  174:getfield        #101 <Field float RectF.top>
        //   94  177:fconst_0        
        //   95  178:fcmpg           
        //   96  179:ifge            199
        //   97  182:aload           8
        //   98  184:aload           8
        //   99  186:getfield        #101 <Field float RectF.top>
        //  100  189:fneg            
        //  101  190:aload           8
        //  102  192:getfield        #101 <Field float RectF.top>
        //  103  195:fneg            
        //  104  196:invokevirtual   #95  <Method void RectF.inset(float, float)>
        //  105  199:aload           8
        //  106  201:getfield        #104 <Field float RectF.right>
        //  107  204:aload           7
        //  108  206:getfield        #106 <Field int Rect.right>
        //  109  209:i2f             
        //  110  210:fcmpl           
        //  111  211:ifle            243
        //  112  214:aload           8
        //  113  216:aload           8
        //  114  218:getfield        #104 <Field float RectF.right>
        //  115  221:aload           7
        //  116  223:getfield        #106 <Field int Rect.right>
        //  117  226:i2f             
        //  118  227:fsub            
        //  119  228:aload           8
        //  120  230:getfield        #104 <Field float RectF.right>
        //  121  233:aload           7
        //  122  235:getfield        #106 <Field int Rect.right>
        //  123  238:i2f             
        //  124  239:fsub            
        //  125  240:invokevirtual   #95  <Method void RectF.inset(float, float)>
        //  126  243:aload           8
        //  127  245:getfield        #109 <Field float RectF.bottom>
        //  128  248:aload           7
        //  129  250:getfield        #111 <Field int Rect.bottom>
        //  130  253:i2f             
        //  131  254:fcmpl           
        //  132  255:ifle            287
        //  133  258:aload           8
        //  134  260:aload           8
        //  135  262:getfield        #109 <Field float RectF.bottom>
        //  136  265:aload           7
        //  137  267:getfield        #111 <Field int Rect.bottom>
        //  138  270:i2f             
        //  139  271:fsub            
        //  140  272:aload           8
        //  141  274:getfield        #109 <Field float RectF.bottom>
        //  142  277:aload           7
        //  143  279:getfield        #111 <Field int Rect.bottom>
        //  144  282:i2f             
        //  145  283:fsub            
        //  146  284:invokevirtual   #95  <Method void RectF.inset(float, float)>
        //  147  287:aload_0         
        //  148  288:getfield        #113 <Field Matrix mImageMatrix>
        //  149  291:astore          9
        //  150  293:aload_0         
        //  151  294:getfield        #22  <Field CropImage this$0>
        //  152  297:invokestatic    #116 <Method boolean CropImage.access$2(CropImage)>
        //  153  300:istore          10
        //  154  302:aload_0         
        //  155  303:getfield        #22  <Field CropImage this$0>
        //  156  306:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //  157  309:ifeq            353
        //  158  312:aload_0         
        //  159  313:getfield        #22  <Field CropImage this$0>
        //  160  316:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //  161  319:ifeq            353
        //  162  322:iconst_1        
        //  163  323:istore          11
        //  164  325:aload           6
        //  165  327:aload           9
        //  166  329:aload           7
        //  167  331:aload           8
        //  168  333:iload           10
        //  169  335:iload           11
        //  170  337:invokevirtual   #127 <Method void HighlightView.setup(Matrix, Rect, RectF, boolean, boolean)>
        //  171  340:aload_0         
        //  172  341:getfield        #22  <Field CropImage this$0>
        //  173  344:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //  174  347:aload           6
        //  175  349:invokevirtual   #133 <Method void CropImageView.add(HighlightView)>
        //  176  352:return          
        //  177  353:iconst_0        
        //  178  354:istore          11
        //  179  356:goto            325
        }

        private void makeDefault()
        {
        //    0    0:new             #63  <Class HighlightView>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #22  <Field CropImage this$0>
        //    4    8:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //    5   11:invokespecial   #69  <Method void HighlightView(View)>
        //    6   14:astore_1        
        //    7   15:aload_0         
        //    8   16:getfield        #22  <Field CropImage this$0>
        //    9   19:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   10   22:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   11   25:istore_2        
        //   12   26:aload_0         
        //   13   27:getfield        #22  <Field CropImage this$0>
        //   14   30:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   15   33:invokevirtual   #83  <Method int Bitmap.getHeight()>
        //   16   36:istore_3        
        //   17   37:new             #71  <Class Rect>
        //   18   40:dup             
        //   19   41:iconst_0        
        //   20   42:iconst_0        
        //   21   43:iload_2         
        //   22   44:iload_3         
        //   23   45:invokespecial   #86  <Method void Rect(int, int, int, int)>
        //   24   48:astore          4
        //   25   50:iconst_4        
        //   26   51:iload_2         
        //   27   52:iload_3         
        //   28   53:invokestatic    #139 <Method int Math.min(int, int)>
        //   29   56:imul            
        //   30   57:iconst_5        
        //   31   58:idiv            
        //   32   59:istore          5
        //   33   61:iload           5
        //   34   63:istore          6
        //   35   65:aload_0         
        //   36   66:getfield        #22  <Field CropImage this$0>
        //   37   69:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //   38   72:ifeq            122
        //   39   75:aload_0         
        //   40   76:getfield        #22  <Field CropImage this$0>
        //   41   79:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //   42   82:ifeq            122
        //   43   85:aload_0         
        //   44   86:getfield        #22  <Field CropImage this$0>
        //   45   89:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //   46   92:aload_0         
        //   47   93:getfield        #22  <Field CropImage this$0>
        //   48   96:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //   49   99:icmple          256
        //   50  102:iload           5
        //   51  104:aload_0         
        //   52  105:getfield        #22  <Field CropImage this$0>
        //   53  108:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //   54  111:imul            
        //   55  112:aload_0         
        //   56  113:getfield        #22  <Field CropImage this$0>
        //   57  116:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //   58  119:idiv            
        //   59  120:istore          6
        //   60  122:iload_2         
        //   61  123:iload           5
        //   62  125:isub            
        //   63  126:iconst_2        
        //   64  127:idiv            
        //   65  128:istore          7
        //   66  130:iload_3         
        //   67  131:iload           6
        //   68  133:isub            
        //   69  134:iconst_2        
        //   70  135:idiv            
        //   71  136:istore          8
        //   72  138:new             #88  <Class RectF>
        //   73  141:dup             
        //   74  142:iload           7
        //   75  144:i2f             
        //   76  145:iload           8
        //   77  147:i2f             
        //   78  148:iload           7
        //   79  150:iload           5
        //   80  152:iadd            
        //   81  153:i2f             
        //   82  154:iload           8
        //   83  156:iload           6
        //   84  158:iadd            
        //   85  159:i2f             
        //   86  160:invokespecial   #91  <Method void RectF(float, float, float, float)>
        //   87  163:astore          9
        //   88  165:aload_0         
        //   89  166:getfield        #113 <Field Matrix mImageMatrix>
        //   90  169:astore          10
        //   91  171:aload_0         
        //   92  172:getfield        #22  <Field CropImage this$0>
        //   93  175:invokestatic    #116 <Method boolean CropImage.access$2(CropImage)>
        //   94  178:istore          11
        //   95  180:aload_0         
        //   96  181:getfield        #22  <Field CropImage this$0>
        //   97  184:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //   98  187:istore          12
        //   99  189:iconst_0        
        //  100  190:istore          13
        //  101  192:iload           12
        //  102  194:ifeq            217
        //  103  197:aload_0         
        //  104  198:getfield        #22  <Field CropImage this$0>
        //  105  201:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //  106  204:istore          14
        //  107  206:iconst_0        
        //  108  207:istore          13
        //  109  209:iload           14
        //  110  211:ifeq            217
        //  111  214:iconst_1        
        //  112  215:istore          13
        //  113  217:aload_1         
        //  114  218:aload           10
        //  115  220:aload           4
        //  116  222:aload           9
        //  117  224:iload           11
        //  118  226:iload           13
        //  119  228:invokevirtual   #127 <Method void HighlightView.setup(Matrix, Rect, RectF, boolean, boolean)>
        //  120  231:aload_0         
        //  121  232:getfield        #22  <Field CropImage this$0>
        //  122  235:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //  123  238:getfield        #143 <Field ArrayList CropImageView.mHighlightViews>
        //  124  241:invokevirtual   #148 <Method void ArrayList.clear()>
        //  125  244:aload_0         
        //  126  245:getfield        #22  <Field CropImage this$0>
        //  127  248:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //  128  251:aload_1         
        //  129  252:invokevirtual   #133 <Method void CropImageView.add(HighlightView)>
        //  130  255:return          
        //  131  256:iload           6
        //  132  258:aload_0         
        //  133  259:getfield        #22  <Field CropImage this$0>
        //  134  262:invokestatic    #120 <Method int CropImage.access$3(CropImage)>
        //  135  265:imul            
        //  136  266:aload_0         
        //  137  267:getfield        #22  <Field CropImage this$0>
        //  138  270:invokestatic    #123 <Method int CropImage.access$4(CropImage)>
        //  139  273:idiv            
        //  140  274:istore          5
        //  141  276:goto            122
        }

        private Bitmap prepareBitmap()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field CropImage this$0>
        //    2    4:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //    3    7:ifnonnull       12
        //    4   10:aconst_null     
        //    5   11:areturn         
        //    6   12:aload_0         
        //    7   13:getfield        #22  <Field CropImage this$0>
        //    8   16:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //    9   19:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   10   22:sipush          256
        //   11   25:icmple          46
        //   12   28:aload_0         
        //   13   29:ldc1            #151 <Float 256F>
        //   14   31:aload_0         
        //   15   32:getfield        #22  <Field CropImage this$0>
        //   16   35:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   17   38:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   18   41:i2f             
        //   19   42:fdiv            
        //   20   43:putfield        #27  <Field float mScale>
        //   21   46:new             #153 <Class Matrix>
        //   22   49:dup             
        //   23   50:invokespecial   #154 <Method void Matrix()>
        //   24   53:astore_1        
        //   25   54:aload_1         
        //   26   55:aload_0         
        //   27   56:getfield        #27  <Field float mScale>
        //   28   59:aload_0         
        //   29   60:getfield        #27  <Field float mScale>
        //   30   63:invokevirtual   #157 <Method void Matrix.setScale(float, float)>
        //   31   66:aload_0         
        //   32   67:getfield        #22  <Field CropImage this$0>
        //   33   70:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   34   73:iconst_0        
        //   35   74:iconst_0        
        //   36   75:aload_0         
        //   37   76:getfield        #22  <Field CropImage this$0>
        //   38   79:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   39   82:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   40   85:aload_0         
        //   41   86:getfield        #22  <Field CropImage this$0>
        //   42   89:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   43   92:invokevirtual   #83  <Method int Bitmap.getHeight()>
        //   44   95:aload_1         
        //   45   96:iconst_1        
        //   46   97:invokestatic    #161 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
        //   47  100:areturn         
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #22  <Field CropImage this$0>
        //    3    5:invokestatic    #66  <Method CropImageView CropImage.access$0(CropImage)>
        //    4    8:invokevirtual   #166 <Method Matrix CropImageView.getImageMatrix()>
        //    5   11:putfield        #113 <Field Matrix mImageMatrix>
        //    6   14:aload_0         
        //    7   15:invokespecial   #168 <Method Bitmap prepareBitmap()>
        //    8   18:astore_1        
        //    9   19:aload_0         
        //   10   20:fconst_1        
        //   11   21:aload_0         
        //   12   22:getfield        #27  <Field float mScale>
        //   13   25:fdiv            
        //   14   26:putfield        #27  <Field float mScale>
        //   15   29:aload_1         
        //   16   30:ifnull          75
        //   17   33:aload_0         
        //   18   34:getfield        #22  <Field CropImage this$0>
        //   19   37:invokestatic    #171 <Method boolean CropImage.access$5(CropImage)>
        //   20   40:ifeq            75
        //   21   43:aload_0         
        //   22   44:new             #173 <Class FaceDetector>
        //   23   47:dup             
        //   24   48:aload_1         
        //   25   49:invokevirtual   #80  <Method int Bitmap.getWidth()>
        //   26   52:aload_1         
        //   27   53:invokevirtual   #83  <Method int Bitmap.getHeight()>
        //   28   56:aload_0         
        //   29   57:getfield        #31  <Field android.media.FaceDetector$Face[] mFaces>
        //   30   60:arraylength     
        //   31   61:invokespecial   #176 <Method void FaceDetector(int, int, int)>
        //   32   64:aload_1         
        //   33   65:aload_0         
        //   34   66:getfield        #31  <Field android.media.FaceDetector$Face[] mFaces>
        //   35   69:invokevirtual   #180 <Method int FaceDetector.findFaces(Bitmap, android.media.FaceDetector$Face[])>
        //   36   72:putfield        #182 <Field int mNumFaces>
        //   37   75:aload_1         
        //   38   76:ifnull          94
        //   39   79:aload_1         
        //   40   80:aload_0         
        //   41   81:getfield        #22  <Field CropImage this$0>
        //   42   84:invokestatic    #74  <Method Bitmap CropImage.access$1(CropImage)>
        //   43   87:if_acmpeq       94
        //   44   90:aload_1         
        //   45   91:invokevirtual   #185 <Method void Bitmap.recycle()>
        //   46   94:aload_0         
        //   47   95:getfield        #22  <Field CropImage this$0>
        //   48   98:invokestatic    #189 <Method Handler CropImage.access$6(CropImage)>
        //   49  101:new             #191 <Class CropImage$1$1>
        //   50  104:dup             
        //   51  105:aload_0         
        //   52  106:invokespecial   #193 <Method void CropImage$1$1(CropImage$1)>
        //   53  109:invokevirtual   #199 <Method boolean Handler.post(Runnable)>
        //   54  112:pop             
        //   55  113:return          
        }

        android.media.FaceDetector.Face mFaces[];
        Matrix mImageMatrix;
        int mNumFaces;
        float mScale;
        final CropImage this$0;

            static void access$0(_cls1 _pcls1, android.media.FaceDetector.Face face)
            {
            //    0    0:aload_0         
            //    1    1:aload_1         
            //    2    2:invokespecial   #37  <Method void handleFace(android.media.FaceDetector$Face)>
            //    3    5:return          
            }

            static void access$1(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:invokespecial   #42  <Method void makeDefault()>
            //    2    4:return          
            }

            static CropImage access$2(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #22  <Field CropImage this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage$1 this$1>
        //    2    4:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //    3    7:astore_1        
        //    4    8:aload_0         
        //    5    9:getfield        #17  <Field CropImage$1 this$1>
        //    6   12:getfield        #27  <Field int CropImage$1.mNumFaces>
        //    7   15:iconst_1        
        //    8   16:icmple          154
        //    9   19:iconst_1        
        //   10   20:istore_2        
        //   11   21:aload_1         
        //   12   22:iload_2         
        //   13   23:putfield        #33  <Field boolean CropImage.mWaitingToPick>
        //   14   26:aload_0         
        //   15   27:getfield        #17  <Field CropImage$1 this$1>
        //   16   30:getfield        #27  <Field int CropImage$1.mNumFaces>
        //   17   33:ifle            181
        //   18   36:iconst_0        
        //   19   37:istore_3        
        //   20   38:iload_3         
        //   21   39:aload_0         
        //   22   40:getfield        #17  <Field CropImage$1 this$1>
        //   23   43:getfield        #27  <Field int CropImage$1.mNumFaces>
        //   24   46:icmplt          159
        //   25   49:aload_0         
        //   26   50:getfield        #17  <Field CropImage$1 this$1>
        //   27   53:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   28   56:invokestatic    #37  <Method CropImageView CropImage.access$0(CropImage)>
        //   29   59:invokevirtual   #42  <Method void CropImageView.invalidate()>
        //   30   62:aload_0         
        //   31   63:getfield        #17  <Field CropImage$1 this$1>
        //   32   66:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   33   69:invokestatic    #37  <Method CropImageView CropImage.access$0(CropImage)>
        //   34   72:getfield        #46  <Field ArrayList CropImageView.mHighlightViews>
        //   35   75:invokevirtual   #52  <Method int ArrayList.size()>
        //   36   78:iconst_1        
        //   37   79:icmpne          126
        //   38   82:aload_0         
        //   39   83:getfield        #17  <Field CropImage$1 this$1>
        //   40   86:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   41   89:aload_0         
        //   42   90:getfield        #17  <Field CropImage$1 this$1>
        //   43   93:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   44   96:invokestatic    #37  <Method CropImageView CropImage.access$0(CropImage)>
        //   45   99:getfield        #46  <Field ArrayList CropImageView.mHighlightViews>
        //   46  102:iconst_0        
        //   47  103:invokevirtual   #56  <Method Object ArrayList.get(int)>
        //   48  106:checkcast       #58  <Class HighlightView>
        //   49  109:putfield        #62  <Field HighlightView CropImage.mCrop>
        //   50  112:aload_0         
        //   51  113:getfield        #17  <Field CropImage$1 this$1>
        //   52  116:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   53  119:getfield        #62  <Field HighlightView CropImage.mCrop>
        //   54  122:iconst_1        
        //   55  123:invokevirtual   #66  <Method void HighlightView.setFocus(boolean)>
        //   56  126:aload_0         
        //   57  127:getfield        #17  <Field CropImage$1 this$1>
        //   58  130:getfield        #27  <Field int CropImage$1.mNumFaces>
        //   59  133:iconst_1        
        //   60  134:icmple          153
        //   61  137:aload_0         
        //   62  138:getfield        #17  <Field CropImage$1 this$1>
        //   63  141:invokestatic    #23  <Method CropImage CropImage$1.access$2(CropImage$1)>
        //   64  144:ldc1            #68  <String "Multi face crop help">
        //   65  146:iconst_0        
        //   66  147:invokestatic    #74  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
        //   67  150:invokevirtual   #77  <Method void Toast.show()>
        //   68  153:return          
        //   69  154:iconst_0        
        //   70  155:istore_2        
        //   71  156:goto            21
        //   72  159:aload_0         
        //   73  160:getfield        #17  <Field CropImage$1 this$1>
        //   74  163:aload_0         
        //   75  164:getfield        #17  <Field CropImage$1 this$1>
        //   76  167:getfield        #81  <Field android.media.FaceDetector$Face[] CropImage$1.mFaces>
        //   77  170:iload_3         
        //   78  171:aaload          
        //   79  172:invokestatic    #84  <Method void CropImage$1.access$0(CropImage$1, android.media.FaceDetector$Face)>
        //   80  175:iinc            3  1
        //   81  178:goto            38
        //   82  181:aload_0         
        //   83  182:getfield        #17  <Field CropImage$1 this$1>
        //   84  185:invokestatic    #87  <Method void CropImage$1.access$1(CropImage$1)>
        //   85  188:goto            49
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage this$0>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #26  <Method void CropImage.setResult(int)>
        //    4    8:aload_0         
        //    5    9:getfield        #17  <Field CropImage this$0>
        //    6   12:invokevirtual   #29  <Method void CropImage.finish()>
        //    7   15:return          
        }

        final CropImage this$0;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        // try 0 7 handler(s) 8
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage this$0>
        //    2    4:invokestatic    #27  <Method void CropImage.access$7(CropImage)>
        //    3    7:return          
        // catch Exception
        //    4    8:astore_2        
        //    5    9:aload_0         
        //    6   10:getfield        #17  <Field CropImage this$0>
        //    7   13:invokevirtual   #30  <Method void CropImage.finish()>
        //    8   16:return          
        }

        final CropImage this$0;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field CropImage this$0>
        //    4    8:invokestatic    #26  <Method Bitmap CropImage.access$1(CropImage)>
        //    5   11:ldc1            #27  <Float -90F>
        //    6   13:invokestatic    #33  <Method Bitmap Util.rotateImage(Bitmap, float)>
        //    7   16:invokestatic    #37  <Method void CropImage.access$8(CropImage, Bitmap)>
        //    8   19:new             #39  <Class RotateBitmap>
        //    9   22:dup             
        //   10   23:aload_0         
        //   11   24:getfield        #17  <Field CropImage this$0>
        //   12   27:invokestatic    #26  <Method Bitmap CropImage.access$1(CropImage)>
        //   13   30:invokespecial   #42  <Method void RotateBitmap(Bitmap)>
        //   14   33:astore_2        
        //   15   34:aload_0         
        //   16   35:getfield        #17  <Field CropImage this$0>
        //   17   38:invokestatic    #46  <Method CropImageView CropImage.access$0(CropImage)>
        //   18   41:aload_2         
        //   19   42:iconst_1        
        //   20   43:invokevirtual   #52  <Method void CropImageView.setImageRotateBitmapResetBase(RotateBitmap, boolean)>
        //   21   46:aload_0         
        //   22   47:getfield        #17  <Field CropImage this$0>
        //   23   50:getfield        #56  <Field Runnable CropImage.mRunFaceDetection>
        //   24   53:invokeinterface #61  <Method void Runnable.run()>
        //   25   58:return          
        }

        final CropImage this$0;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$5

/* anonymous class */
    class _cls5
        implements android.view.View.OnClickListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field CropImage this$0>
        //    4    8:invokestatic    #26  <Method Bitmap CropImage.access$1(CropImage)>
        //    5   11:ldc1            #27  <Float 90F>
        //    6   13:invokestatic    #33  <Method Bitmap Util.rotateImage(Bitmap, float)>
        //    7   16:invokestatic    #37  <Method void CropImage.access$8(CropImage, Bitmap)>
        //    8   19:new             #39  <Class RotateBitmap>
        //    9   22:dup             
        //   10   23:aload_0         
        //   11   24:getfield        #17  <Field CropImage this$0>
        //   12   27:invokestatic    #26  <Method Bitmap CropImage.access$1(CropImage)>
        //   13   30:invokespecial   #42  <Method void RotateBitmap(Bitmap)>
        //   14   33:astore_2        
        //   15   34:aload_0         
        //   16   35:getfield        #17  <Field CropImage this$0>
        //   17   38:invokestatic    #46  <Method CropImageView CropImage.access$0(CropImage)>
        //   18   41:aload_2         
        //   19   42:iconst_1        
        //   20   43:invokevirtual   #52  <Method void CropImageView.setImageRotateBitmapResetBase(RotateBitmap, boolean)>
        //   21   46:aload_0         
        //   22   47:getfield        #17  <Field CropImage this$0>
        //   23   50:getfield        #56  <Field Runnable CropImage.mRunFaceDetection>
        //   24   53:invokeinterface #61  <Method void Runnable.run()>
        //   25   58:return          
        }

        final CropImage this$0;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$6

/* anonymous class */
    class _cls6
        implements Runnable
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        static CropImage access$0(_cls6 _pcls6)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field CropImage this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field CropImage this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        //    0    0:new             #26  <Class CountDownLatch>
        //    1    3:dup             
        //    2    4:iconst_1        
        //    3    5:invokespecial   #29  <Method void CountDownLatch(int)>
        //    4    8:astore_1        
        //    5    9:aload_0         
        //    6   10:getfield        #17  <Field CropImage this$0>
        //    7   13:invokestatic    #33  <Method Bitmap CropImage.access$1(CropImage)>
        //    8   16:astore_2        
        //    9   17:aload_0         
        //   10   18:getfield        #17  <Field CropImage this$0>
        //   11   21:invokestatic    #37  <Method Handler CropImage.access$6(CropImage)>
        //   12   24:new             #39  <Class CropImage$6$1>
        //   13   27:dup             
        //   14   28:aload_0         
        //   15   29:aload_2         
        //   16   30:aload_1         
        //   17   31:invokespecial   #42  <Method void CropImage$6$1(CropImage$6, Bitmap, CountDownLatch)>
        //   18   34:invokevirtual   #48  <Method boolean Handler.post(Runnable)>
        //   19   37:pop             
        // try 38 42 handler(s) 55
        //   20   38:aload_1         
        //   21   39:invokevirtual   #51  <Method void CountDownLatch.await()>
        //   22   42:aload_0         
        //   23   43:getfield        #17  <Field CropImage this$0>
        //   24   46:getfield        #55  <Field Runnable CropImage.mRunFaceDetection>
        //   25   49:invokeinterface #57  <Method void Runnable.run()>
        //   26   54:return          
        // catch InterruptedException
        //   27   55:astore          4
        //   28   57:new             #59  <Class RuntimeException>
        //   29   60:dup             
        //   30   61:aload           4
        //   31   63:invokespecial   #62  <Method void RuntimeException(Throwable)>
        //   32   66:athrow          
        }

        final CropImage this$0;

            static CropImage access$0(_cls6 _pcls6)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field CropImage this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$6$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field CropImage$6 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field Bitmap val$b>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field CountDownLatch val$latch>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field Bitmap val$b>
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field CropImage$6 this$1>
        //    4    8:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //    5   11:invokestatic    #37  <Method Bitmap CropImage.access$1(CropImage)>
        //    6   14:if_acmpeq       69
        //    7   17:aload_0         
        //    8   18:getfield        #23  <Field Bitmap val$b>
        //    9   21:ifnull          69
        //   10   24:aload_0         
        //   11   25:getfield        #21  <Field CropImage$6 this$1>
        //   12   28:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //   13   31:invokestatic    #40  <Method CropImageView CropImage.access$0(CropImage)>
        //   14   34:aload_0         
        //   15   35:getfield        #23  <Field Bitmap val$b>
        //   16   38:iconst_1        
        //   17   39:invokevirtual   #46  <Method void CropImageView.setImageBitmapResetBase(Bitmap, boolean)>
        //   18   42:aload_0         
        //   19   43:getfield        #21  <Field CropImage$6 this$1>
        //   20   46:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //   21   49:invokestatic    #37  <Method Bitmap CropImage.access$1(CropImage)>
        //   22   52:invokevirtual   #51  <Method void Bitmap.recycle()>
        //   23   55:aload_0         
        //   24   56:getfield        #21  <Field CropImage$6 this$1>
        //   25   59:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //   26   62:aload_0         
        //   27   63:getfield        #23  <Field Bitmap val$b>
        //   28   66:invokestatic    #55  <Method void CropImage.access$8(CropImage, Bitmap)>
        //   29   69:aload_0         
        //   30   70:getfield        #21  <Field CropImage$6 this$1>
        //   31   73:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //   32   76:invokestatic    #40  <Method CropImageView CropImage.access$0(CropImage)>
        //   33   79:invokevirtual   #59  <Method float CropImageView.getScale()>
        //   34   82:fconst_1        
        //   35   83:fcmpl           
        //   36   84:ifne            102
        //   37   87:aload_0         
        //   38   88:getfield        #21  <Field CropImage$6 this$1>
        //   39   91:invokestatic    #31  <Method CropImage CropImage$6.access$0(CropImage$6)>
        //   40   94:invokestatic    #40  <Method CropImageView CropImage.access$0(CropImage)>
        //   41   97:iconst_1        
        //   42   98:iconst_1        
        //   43   99:invokevirtual   #63  <Method void CropImageView.center(boolean, boolean)>
        //   44  102:aload_0         
        //   45  103:getfield        #25  <Field CountDownLatch val$latch>
        //   46  106:invokevirtual   #68  <Method void CountDownLatch.countDown()>
        //   47  109:return          
        }

        final _cls6 this$1;
        private final Bitmap val$b;
        private final CountDownLatch val$latch;
    }


    // Unreferenced inner class eu/janmuller/android/simplecropimage/CropImage$7

/* anonymous class */
    class _cls7
        implements Runnable
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field CropImage this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Bitmap val$b>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field CropImage this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field Bitmap val$b>
        //    4    8:invokestatic    #27  <Method void CropImage.access$9(CropImage, Bitmap)>
        //    5   11:return          
        }

        final CropImage this$0;
        private final Bitmap val$b;
    }

}
