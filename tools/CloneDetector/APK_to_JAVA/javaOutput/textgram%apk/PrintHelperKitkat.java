// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.*;
import android.net.Uri;
import android.os.*;
import android.print.*;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.*;

public class PrintHelperKitkat
{

    PrintHelperKitkat(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_2        
    //    4    6:putfield        #28  <Field int mScaleMode>
    //    5    9:aload_0         
    //    6   10:iconst_2        
    //    7   11:putfield        #30  <Field int mColorMode>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:putfield        #32  <Field Context mContext>
    //   11   19:return          
    }

    private Bitmap loadBitmap(Uri uri, android.graphics.BitmapFactory.Options options)
        throws FileNotFoundException
    {
    //    0    0:aload_1         
    //    1    1:ifnull          11
    //    2    4:aload_0         
    //    3    5:getfield        #32  <Field Context mContext>
    //    4    8:ifnonnull       21
    //    5   11:new             #40  <Class IllegalArgumentException>
    //    6   14:dup             
    //    7   15:ldc1            #42  <String "bad argument to loadBitmap">
    //    8   17:invokespecial   #45  <Method void IllegalArgumentException(String)>
    //    9   20:athrow          
    //   10   21:aconst_null     
    //   11   22:astore_3        
    // try 23 43 handler(s) 69
    //   12   23:aload_0         
    //   13   24:getfield        #32  <Field Context mContext>
    //   14   27:invokevirtual   #51  <Method ContentResolver Context.getContentResolver()>
    //   15   30:aload_1         
    //   16   31:invokevirtual   #57  <Method InputStream ContentResolver.openInputStream(Uri)>
    //   17   34:astore_3        
    //   18   35:aload_3         
    //   19   36:aconst_null     
    //   20   37:aload_2         
    //   21   38:invokestatic    #63  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   22   41:astore          7
    //   23   43:aload_3         
    //   24   44:ifnull          51
    // try 47 51 handler(s) 54
    //   25   47:aload_3         
    //   26   48:invokevirtual   #68  <Method void InputStream.close()>
    //   27   51:aload           7
    //   28   53:areturn         
    // catch IOException
    //   29   54:astore          8
    //   30   56:ldc1            #13  <String "PrintHelperKitkat">
    //   31   58:ldc1            #70  <String "close fail ">
    //   32   60:aload           8
    //   33   62:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
    //   34   65:pop             
    //   35   66:aload           7
    //   36   68:areturn         
    // finally
    //   37   69:astore          4
    //   38   71:aload_3         
    //   39   72:ifnull          79
    // try 75 79 handler(s) 82
    //   40   75:aload_3         
    //   41   76:invokevirtual   #68  <Method void InputStream.close()>
    //   42   79:aload           4
    //   43   81:athrow          
    // catch IOException
    //   44   82:astore          5
    //   45   84:ldc1            #13  <String "PrintHelperKitkat">
    //   46   86:ldc1            #70  <String "close fail ">
    //   47   88:aload           5
    //   48   90:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
    //   49   93:pop             
    //   50   94:goto            79
    }

    private Bitmap loadConstrainedBitmap(Uri uri, int i)
        throws FileNotFoundException
    {
    //    0    0:iload_2         
    //    1    1:ifle            15
    //    2    4:aload_1         
    //    3    5:ifnull          15
    //    4    8:aload_0         
    //    5    9:getfield        #32  <Field Context mContext>
    //    6   12:ifnonnull       25
    //    7   15:new             #40  <Class IllegalArgumentException>
    //    8   18:dup             
    //    9   19:ldc1            #80  <String "bad argument to getScaledBitmap">
    //   10   21:invokespecial   #45  <Method void IllegalArgumentException(String)>
    //   11   24:athrow          
    //   12   25:new             #82  <Class android.graphics.BitmapFactory$Options>
    //   13   28:dup             
    //   14   29:invokespecial   #83  <Method void android.graphics.BitmapFactory$Options()>
    //   15   32:astore_3        
    //   16   33:aload_3         
    //   17   34:iconst_1        
    //   18   35:putfield        #87  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
    //   19   38:aload_0         
    //   20   39:aload_1         
    //   21   40:aload_3         
    //   22   41:invokespecial   #89  <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
    //   23   44:pop             
    //   24   45:aload_3         
    //   25   46:getfield        #92  <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   26   49:istore          5
    //   27   51:aload_3         
    //   28   52:getfield        #95  <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   29   55:istore          6
    //   30   57:iload           5
    //   31   59:ifle            67
    //   32   62:iload           6
    //   33   64:ifgt            69
    //   34   67:aconst_null     
    //   35   68:areturn         
    //   36   69:iload           5
    //   37   71:iload           6
    //   38   73:invokestatic    #101 <Method int Math.max(int, int)>
    //   39   76:istore          7
    //   40   78:iconst_1        
    //   41   79:istore          8
    //   42   81:iload           7
    //   43   83:iload_2         
    //   44   84:icmple          102
    //   45   87:iload           7
    //   46   89:iconst_1        
    //   47   90:iushr           
    //   48   91:istore          7
    //   49   93:iload           8
    //   50   95:iconst_1        
    //   51   96:ishl            
    //   52   97:istore          8
    //   53   99:goto            81
    //   54  102:iload           8
    //   55  104:ifle            67
    //   56  107:iload           5
    //   57  109:iload           6
    //   58  111:invokestatic    #104 <Method int Math.min(int, int)>
    //   59  114:iload           8
    //   60  116:idiv            
    //   61  117:ifle            67
    //   62  120:new             #82  <Class android.graphics.BitmapFactory$Options>
    //   63  123:dup             
    //   64  124:invokespecial   #83  <Method void android.graphics.BitmapFactory$Options()>
    //   65  127:astore          9
    //   66  129:aload           9
    //   67  131:iconst_1        
    //   68  132:putfield        #107 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
    //   69  135:aload           9
    //   70  137:iload           8
    //   71  139:putfield        #110 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
    //   72  142:aload_0         
    //   73  143:aload_1         
    //   74  144:aload           9
    //   75  146:invokespecial   #89  <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
    //   76  149:areturn         
    }

    public int getColorMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field int mColorMode>
    //    2    4:ireturn         
    }

    public int getScaleMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field int mScaleMode>
    //    2    4:ireturn         
    }

    public void printBitmap(String s, Bitmap bitmap)
    {
    //    0    0:aload_2         
    //    1    1:ifnonnull       5
    //    2    4:return          
    //    3    5:aload_0         
    //    4    6:getfield        #28  <Field int mScaleMode>
    //    5    9:istore_3        
    //    6   10:aload_0         
    //    7   11:getfield        #32  <Field Context mContext>
    //    8   14:ldc1            #117 <String "print">
    //    9   16:invokevirtual   #121 <Method Object Context.getSystemService(String)>
    //   10   19:checkcast       #123 <Class PrintManager>
    //   11   22:astore          4
    //   12   24:getstatic       #129 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
    //   13   27:astore          5
    //   14   29:aload_2         
    //   15   30:invokevirtual   #134 <Method int Bitmap.getWidth()>
    //   16   33:aload_2         
    //   17   34:invokevirtual   #137 <Method int Bitmap.getHeight()>
    //   18   37:icmple          45
    //   19   40:getstatic       #140 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
    //   20   43:astore          5
    //   21   45:new             #142 <Class android.print.PrintAttributes$Builder>
    //   22   48:dup             
    //   23   49:invokespecial   #143 <Method void android.print.PrintAttributes$Builder()>
    //   24   52:aload           5
    //   25   54:invokevirtual   #147 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
    //   26   57:aload_0         
    //   27   58:getfield        #30  <Field int mColorMode>
    //   28   61:invokevirtual   #151 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
    //   29   64:invokevirtual   #155 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
    //   30   67:astore          6
    //   31   69:aload           4
    //   32   71:aload_1         
    //   33   72:new             #157 <Class PrintHelperKitkat$1>
    //   34   75:dup             
    //   35   76:aload_0         
    //   36   77:aload_1         
    //   37   78:aload_2         
    //   38   79:iload_3         
    //   39   80:invokespecial   #160 <Method void PrintHelperKitkat$1(PrintHelperKitkat, String, Bitmap, int)>
    //   40   83:aload           6
    //   41   85:invokevirtual   #163 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
    //   42   88:pop             
    //   43   89:return          
    }

    public void printBitmap(String s, Uri uri)
        throws FileNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:aload_2         
    //    4    4:sipush          3500
    //    5    7:invokespecial   #166 <Method Bitmap loadConstrainedBitmap(Uri, int)>
    //    6   10:invokevirtual   #168 <Method void printBitmap(String, Bitmap)>
    //    7   13:return          
    }

    public void setColorMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #30  <Field int mColorMode>
    //    3    5:return          
    }

    public void setScaleMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #28  <Field int mScaleMode>
    //    3    5:return          
    }

    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final String LOG_TAG = "PrintHelperKitkat";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode;
    final Context mContext;
    int mScaleMode;

    // Unreferenced inner class android/support/v4/print/PrintHelperKitkat$1

/* anonymous class */
    class _cls1 extends PrintDocumentAdapter
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #23  <Field PrintHelperKitkat this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #25  <Field String val$jobName>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #27  <Field Bitmap val$bitmap>
        //    9   15:aload_0         
        //   10   16:iload           4
        //   11   18:putfield        #29  <Field int val$fittingMode>
        //   12   21:aload_0         
        //   13   22:invokespecial   #32  <Method void PrintDocumentAdapter()>
        //   14   25:return          
        }

        public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
        {
        //    0    0:iconst_1        
        //    1    1:istore          6
        //    2    3:aload_0         
        //    3    4:aload_2         
        //    4    5:putfield        #36  <Field PrintAttributes mAttributes>
        //    5    8:new             #38  <Class android.print.PrintDocumentInfo$Builder>
        //    6   11:dup             
        //    7   12:aload_0         
        //    8   13:getfield        #25  <Field String val$jobName>
        //    9   16:invokespecial   #41  <Method void android.print.PrintDocumentInfo$Builder(String)>
        //   10   19:iload           6
        //   11   21:invokevirtual   #45  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
        //   12   24:iload           6
        //   13   26:invokevirtual   #48  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
        //   14   29:invokevirtual   #52  <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
        //   15   32:astore          7
        //   16   34:aload_2         
        //   17   35:aload_1         
        //   18   36:invokevirtual   #58  <Method boolean PrintAttributes.equals(Object)>
        //   19   39:ifne            52
        //   20   42:aload           4
        //   21   44:aload           7
        //   22   46:iload           6
        //   23   48:invokevirtual   #64  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
        //   24   51:return          
        //   25   52:iconst_0        
        //   26   53:istore          6
        //   27   55:goto            42
        }

        public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
        {
        //    0    0:new             #70  <Class PrintedPdfDocument>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #23  <Field PrintHelperKitkat this$0>
        //    4    8:getfield        #74  <Field Context PrintHelperKitkat.mContext>
        //    5   11:aload_0         
        //    6   12:getfield        #36  <Field PrintAttributes mAttributes>
        //    7   15:invokespecial   #77  <Method void PrintedPdfDocument(Context, PrintAttributes)>
        //    8   18:astore          5
        // try 20 99 handler(s) 275
        //    9   20:aload           5
        //   10   22:iconst_1        
        //   11   23:invokevirtual   #81  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
        //   12   26:astore          8
        //   13   28:new             #83  <Class RectF>
        //   14   31:dup             
        //   15   32:aload           8
        //   16   34:invokevirtual   #89  <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
        //   17   37:invokevirtual   #95  <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
        //   18   40:invokespecial   #98  <Method void RectF(android.graphics.Rect)>
        //   19   43:astore          9
        //   20   45:new             #100 <Class Matrix>
        //   21   48:dup             
        //   22   49:invokespecial   #101 <Method void Matrix()>
        //   23   52:astore          10
        //   24   54:aload           9
        //   25   56:invokevirtual   #105 <Method float RectF.width()>
        //   26   59:aload_0         
        //   27   60:getfield        #27  <Field Bitmap val$bitmap>
        //   28   63:invokevirtual   #111 <Method int Bitmap.getWidth()>
        //   29   66:i2f             
        //   30   67:fdiv            
        //   31   68:fstore          11
        //   32   70:aload_0         
        //   33   71:getfield        #29  <Field int val$fittingMode>
        //   34   74:iconst_2        
        //   35   75:icmpne          230
        //   36   78:fload           11
        //   37   80:aload           9
        //   38   82:invokevirtual   #114 <Method float RectF.height()>
        //   39   85:aload_0         
        //   40   86:getfield        #27  <Field Bitmap val$bitmap>
        //   41   89:invokevirtual   #117 <Method int Bitmap.getHeight()>
        //   42   92:i2f             
        //   43   93:fdiv            
        //   44   94:invokestatic    #123 <Method float Math.max(float, float)>
        //   45   97:fstore          12
        // try 99 175 handler(s) 275
        //   46   99:aload           10
        //   47  101:fload           12
        //   48  103:fload           12
        //   49  105:invokevirtual   #127 <Method boolean Matrix.postScale(float, float)>
        //   50  108:pop             
        //   51  109:aload           10
        //   52  111:aload           9
        //   53  113:invokevirtual   #105 <Method float RectF.width()>
        //   54  116:fload           12
        //   55  118:aload_0         
        //   56  119:getfield        #27  <Field Bitmap val$bitmap>
        //   57  122:invokevirtual   #111 <Method int Bitmap.getWidth()>
        //   58  125:i2f             
        //   59  126:fmul            
        //   60  127:fsub            
        //   61  128:fconst_2        
        //   62  129:fdiv            
        //   63  130:aload           9
        //   64  132:invokevirtual   #114 <Method float RectF.height()>
        //   65  135:fload           12
        //   66  137:aload_0         
        //   67  138:getfield        #27  <Field Bitmap val$bitmap>
        //   68  141:invokevirtual   #117 <Method int Bitmap.getHeight()>
        //   69  144:i2f             
        //   70  145:fmul            
        //   71  146:fsub            
        //   72  147:fconst_2        
        //   73  148:fdiv            
        //   74  149:invokevirtual   #130 <Method boolean Matrix.postTranslate(float, float)>
        //   75  152:pop             
        //   76  153:aload           8
        //   77  155:invokevirtual   #134 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
        //   78  158:aload_0         
        //   79  159:getfield        #27  <Field Bitmap val$bitmap>
        //   80  162:aload           10
        //   81  164:aconst_null     
        //   82  165:invokevirtual   #140 <Method void Canvas.drawBitmap(Bitmap, Matrix, android.graphics.Paint)>
        //   83  168:aload           5
        //   84  170:aload           8
        //   85  172:invokevirtual   #144 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
        // try 175 211 handler(s) 254 275
        //   86  175:aload           5
        //   87  177:new             #146 <Class FileOutputStream>
        //   88  180:dup             
        //   89  181:aload_2         
        //   90  182:invokevirtual   #152 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
        //   91  185:invokespecial   #155 <Method void FileOutputStream(java.io.FileDescriptor)>
        //   92  188:invokevirtual   #159 <Method void PrintedPdfDocument.writeTo(java.io.OutputStream)>
        //   93  191:iconst_1        
        //   94  192:anewarray       PageRange[]
        //   95  195:astore          18
        //   96  197:aload           18
        //   97  199:iconst_0        
        //   98  200:getstatic       #165 <Field PageRange PageRange.ALL_PAGES>
        //   99  203:aastore         
        //  100  204:aload           4
        //  101  206:aload           18
        //  102  208:invokevirtual   #171 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFinished(PageRange[])>
        //  103  211:aload           5
        //  104  213:ifnull          221
        //  105  216:aload           5
        //  106  218:invokevirtual   #174 <Method void PrintedPdfDocument.close()>
        //  107  221:aload_2         
        //  108  222:ifnull          229
        // try 225 229 handler(s) 298
        //  109  225:aload_2         
        //  110  226:invokevirtual   #175 <Method void ParcelFileDescriptor.close()>
        //  111  229:return          
        // try 230 251 handler(s) 275
        //  112  230:fload           11
        //  113  232:aload           9
        //  114  234:invokevirtual   #114 <Method float RectF.height()>
        //  115  237:aload_0         
        //  116  238:getfield        #27  <Field Bitmap val$bitmap>
        //  117  241:invokevirtual   #117 <Method int Bitmap.getHeight()>
        //  118  244:i2f             
        //  119  245:fdiv            
        //  120  246:invokestatic    #178 <Method float Math.min(float, float)>
        //  121  249:fstore          12
        //  122  251:goto            99
        // catch IOException
        //  123  254:astore          15
        // try 256 272 handler(s) 275
        //  124  256:ldc1            #180 <String "PrintHelperKitkat">
        //  125  258:ldc1            #182 <String "Error writing printed content">
        //  126  260:aload           15
        //  127  262:invokestatic    #188 <Method int Log.e(String, String, Throwable)>
        //  128  265:pop             
        //  129  266:aload           4
        //  130  268:aconst_null     
        //  131  269:invokevirtual   #192 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFailed(CharSequence)>
        //  132  272:goto            211
        // finally
        //  133  275:astore          6
        //  134  277:aload           5
        //  135  279:ifnull          287
        //  136  282:aload           5
        //  137  284:invokevirtual   #174 <Method void PrintedPdfDocument.close()>
        //  138  287:aload_2         
        //  139  288:ifnull          295
        // try 291 295 handler(s) 301
        //  140  291:aload_2         
        //  141  292:invokevirtual   #175 <Method void ParcelFileDescriptor.close()>
        //  142  295:aload           6
        //  143  297:athrow          
        // catch IOException
        //  144  298:astore          17
        //  145  300:return          
        // catch IOException
        //  146  301:astore          7
        //  147  303:goto            295
        }

        private PrintAttributes mAttributes;
        final PrintHelperKitkat this$0;
        final Bitmap val$bitmap;
        final int val$fittingMode;
        final String val$jobName;
    }

}
