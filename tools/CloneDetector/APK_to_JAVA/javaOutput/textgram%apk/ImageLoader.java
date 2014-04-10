// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.lazylist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.widget.ImageView;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package codeadore.textgram.lazylist:
//            MemoryCache, FileCache, Utils

public class ImageLoader
{
    class BitmapDisplayer
        implements Runnable
    {

        public BitmapDisplayer(Bitmap bitmap1, PhotoToLoad phototoload)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field ImageLoader this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #21  <Field Bitmap bitmap>
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:putfield        #23  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ImageLoader this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #23  <Field ImageLoader$PhotoToLoad photoToLoad>
        //    4    8:invokevirtual   #30  <Method boolean ImageLoader.imageViewReused(ImageLoader$PhotoToLoad)>
        //    5   11:ifeq            15
        //    6   14:return          
        //    7   15:aload_0         
        //    8   16:getfield        #21  <Field Bitmap bitmap>
        //    9   19:ifnull          37
        //   10   22:aload_0         
        //   11   23:getfield        #23  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   12   26:getfield        #36  <Field ImageView ImageLoader$PhotoToLoad.imageView>
        //   13   29:aload_0         
        //   14   30:getfield        #21  <Field Bitmap bitmap>
        //   15   33:invokevirtual   #42  <Method void ImageView.setImageBitmap(Bitmap)>
        //   16   36:return          
        //   17   37:aload_0         
        //   18   38:getfield        #23  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   19   41:getfield        #36  <Field ImageView ImageLoader$PhotoToLoad.imageView>
        //   20   44:ldc1            #43  <Int 0x7f020099>
        //   21   46:invokevirtual   #47  <Method void ImageView.setImageResource(int)>
        //   22   49:return          
        }

        Bitmap bitmap;
        PhotoToLoad photoToLoad;
        final ImageLoader this$0;
    }

    private class PhotoToLoad
    {

        public PhotoToLoad(String s, ImageView imageview)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ImageLoader this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field String url>
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:putfield        #21  <Field ImageView imageView>
        //   11   19:return          
        }

        public ImageView imageView;
        final ImageLoader this$0;
        public String url;
    }

    class PhotosLoader
        implements Runnable
    {

        PhotosLoader(PhotoToLoad phototoload)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ImageLoader this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //    8   14:return          
        }

        public void run()
        {
        // try 0 14 handler(s) 92
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ImageLoader this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //    4    8:invokevirtual   #28  <Method boolean ImageLoader.imageViewReused(ImageLoader$PhotoToLoad)>
        //    5   11:ifeq            15
        //    6   14:return          
        // try 15 91 handler(s) 92
        //    7   15:aload_0         
        //    8   16:getfield        #14  <Field ImageLoader this$0>
        //    9   19:aload_0         
        //   10   20:getfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   11   23:getfield        #34  <Field String ImageLoader$PhotoToLoad.url>
        //   12   26:invokestatic    #38  <Method Bitmap ImageLoader.access$0(ImageLoader, String)>
        //   13   29:astore_2        
        //   14   30:aload_0         
        //   15   31:getfield        #14  <Field ImageLoader this$0>
        //   16   34:getfield        #42  <Field MemoryCache ImageLoader.memoryCache>
        //   17   37:aload_0         
        //   18   38:getfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   19   41:getfield        #34  <Field String ImageLoader$PhotoToLoad.url>
        //   20   44:aload_2         
        //   21   45:invokevirtual   #48  <Method void MemoryCache.put(String, Bitmap)>
        //   22   48:aload_0         
        //   23   49:getfield        #14  <Field ImageLoader this$0>
        //   24   52:aload_0         
        //   25   53:getfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   26   56:invokevirtual   #28  <Method boolean ImageLoader.imageViewReused(ImageLoader$PhotoToLoad)>
        //   27   59:ifne            97
        //   28   62:new             #50  <Class ImageLoader$BitmapDisplayer>
        //   29   65:dup             
        //   30   66:aload_0         
        //   31   67:getfield        #14  <Field ImageLoader this$0>
        //   32   70:aload_2         
        //   33   71:aload_0         
        //   34   72:getfield        #19  <Field ImageLoader$PhotoToLoad photoToLoad>
        //   35   75:invokespecial   #53  <Method void ImageLoader$BitmapDisplayer(ImageLoader, Bitmap, ImageLoader$PhotoToLoad)>
        //   36   78:astore_3        
        //   37   79:aload_0         
        //   38   80:getfield        #14  <Field ImageLoader this$0>
        //   39   83:getfield        #57  <Field Handler ImageLoader.handler>
        //   40   86:aload_3         
        //   41   87:invokevirtual   #63  <Method boolean Handler.post(Runnable)>
        //   42   90:pop             
        //   43   91:return          
        // catch Throwable Throwable
        //   44   92:astore_1        
        //   45   93:aload_1         
        //   46   94:invokevirtual   #66  <Method void Throwable.printStackTrace()>
        //   47   97:return          
        }

        PhotoToLoad photoToLoad;
        final ImageLoader this$0;
    }


    public ImageLoader(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #24  <Class MemoryCache>
    //    4    8:dup             
    //    5    9:invokespecial   #25  <Method void MemoryCache()>
    //    6   12:putfield        #27  <Field MemoryCache memoryCache>
    //    7   15:aload_0         
    //    8   16:new             #29  <Class WeakHashMap>
    //    9   19:dup             
    //   10   20:invokespecial   #30  <Method void WeakHashMap()>
    //   11   23:invokestatic    #36  <Method Map Collections.synchronizedMap(Map)>
    //   12   26:putfield        #38  <Field Map imageViews>
    //   13   29:aload_0         
    //   14   30:new             #40  <Class Handler>
    //   15   33:dup             
    //   16   34:invokespecial   #41  <Method void Handler()>
    //   17   37:putfield        #43  <Field Handler handler>
    //   18   40:aload_0         
    //   19   41:ldc1            #44  <Int 0x7f020099>
    //   20   43:putfield        #46  <Field int stub_id>
    //   21   46:aload_0         
    //   22   47:new             #48  <Class FileCache>
    //   23   50:dup             
    //   24   51:aload_1         
    //   25   52:invokespecial   #50  <Method void FileCache(Context)>
    //   26   55:putfield        #52  <Field FileCache fileCache>
    //   27   58:aload_0         
    //   28   59:iconst_5        
    //   29   60:invokestatic    #58  <Method ExecutorService Executors.newFixedThreadPool(int)>
    //   30   63:putfield        #60  <Field ExecutorService executorService>
    //   31   66:return          
    }

    static Bitmap access$0(ImageLoader imageloader, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #66  <Method Bitmap getBitmap(String)>
    //    3    5:areturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #66  <Method Bitmap getBitmap(String)>
    //    7    5:areturn         
    }

    private Bitmap decodeFile(File file)
    {
    // try 0 48 handler(s) 143 134
    //    0    0:new             #74  <Class android.graphics.BitmapFactory$Options>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void android.graphics.BitmapFactory$Options()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:iconst_1        
    //    6   10:putfield        #79  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
    //    7   13:new             #81  <Class FileInputStream>
    //    8   16:dup             
    //    9   17:aload_1         
    //   10   18:invokespecial   #84  <Method void FileInputStream(File)>
    //   11   21:astore          5
    //   12   23:aload           5
    //   13   25:aconst_null     
    //   14   26:aload_2         
    //   15   27:invokestatic    #90  <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   16   30:pop             
    //   17   31:aload           5
    //   18   33:invokevirtual   #93  <Method void FileInputStream.close()>
    //   19   36:aload_2         
    //   20   37:getfield        #96  <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   21   40:istore          7
    //   22   42:aload_2         
    //   23   43:getfield        #99  <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   24   46:istore          8
    //   25   48:iconst_1        
    //   26   49:istore          9
    // try 51 69 handler(s) 143 134
    //   27   51:iload           7
    //   28   53:iconst_2        
    //   29   54:idiv            
    //   30   55:bipush          100
    //   31   57:icmplt          69
    //   32   60:iload           8
    //   33   62:iconst_2        
    //   34   63:idiv            
    //   35   64:bipush          100
    //   36   66:icmpge          113
    // try 69 110 handler(s) 143 134
    //   37   69:new             #74  <Class android.graphics.BitmapFactory$Options>
    //   38   72:dup             
    //   39   73:invokespecial   #75  <Method void android.graphics.BitmapFactory$Options()>
    //   40   76:astore          10
    //   41   78:aload           10
    //   42   80:iload           9
    //   43   82:putfield        #102 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
    //   44   85:new             #81  <Class FileInputStream>
    //   45   88:dup             
    //   46   89:aload_1         
    //   47   90:invokespecial   #84  <Method void FileInputStream(File)>
    //   48   93:astore          11
    //   49   95:aload           11
    //   50   97:aconst_null     
    //   51   98:aload           10
    //   52  100:invokestatic    #90  <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   53  103:astore          12
    //   54  105:aload           11
    //   55  107:invokevirtual   #93  <Method void FileInputStream.close()>
    //   56  110:aload           12
    //   57  112:areturn         
    // try 113 125 handler(s) 143 134
    //   58  113:iload           7
    //   59  115:iconst_2        
    //   60  116:idiv            
    //   61  117:istore          7
    //   62  119:iload           8
    //   63  121:iconst_2        
    //   64  122:idiv            
    //   65  123:istore          8
    //   66  125:iload           9
    //   67  127:iconst_2        
    //   68  128:imul            
    //   69  129:istore          9
    //   70  131:goto            51
    // catch IOException IOException IOException IOException
    //   71  134:astore          4
    //   72  136:aload           4
    //   73  138:invokevirtual   #105 <Method void IOException.printStackTrace()>
    //   74  141:aconst_null     
    //   75  142:areturn         
    // catch FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException
    //   76  143:astore_3        
    //   77  144:goto            141
    }

    private Bitmap getBitmap(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field FileCache fileCache>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #111 <Method File FileCache.getFile(String)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:invokespecial   #113 <Method Bitmap decodeFile(File)>
    //    8   14:astore_3        
    //    9   15:aload_3         
    //   10   16:ifnull          21
    //   11   19:aload_3         
    //   12   20:areturn         
    // try 21 100 handler(s) 103
    //   13   21:new             #115 <Class URL>
    //   14   24:dup             
    //   15   25:aload_1         
    //   16   26:invokespecial   #118 <Method void URL(String)>
    //   17   29:invokevirtual   #122 <Method java.net.URLConnection URL.openConnection()>
    //   18   32:checkcast       #124 <Class HttpURLConnection>
    //   19   35:astore          5
    //   20   37:aload           5
    //   21   39:sipush          30000
    //   22   42:invokevirtual   #128 <Method void HttpURLConnection.setConnectTimeout(int)>
    //   23   45:aload           5
    //   24   47:sipush          30000
    //   25   50:invokevirtual   #131 <Method void HttpURLConnection.setReadTimeout(int)>
    //   26   53:aload           5
    //   27   55:iconst_1        
    //   28   56:invokevirtual   #135 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
    //   29   59:aload           5
    //   30   61:invokevirtual   #139 <Method java.io.InputStream HttpURLConnection.getInputStream()>
    //   31   64:astore          6
    //   32   66:new             #141 <Class FileOutputStream>
    //   33   69:dup             
    //   34   70:aload_2         
    //   35   71:invokespecial   #142 <Method void FileOutputStream(File)>
    //   36   74:astore          7
    //   37   76:aload           6
    //   38   78:aload           7
    //   39   80:invokestatic    #148 <Method void Utils.CopyStream(java.io.InputStream, OutputStream)>
    //   40   83:aload           7
    //   41   85:invokevirtual   #151 <Method void OutputStream.close()>
    //   42   88:aload           5
    //   43   90:invokevirtual   #154 <Method void HttpURLConnection.disconnect()>
    //   44   93:aload_0         
    //   45   94:aload_2         
    //   46   95:invokespecial   #113 <Method Bitmap decodeFile(File)>
    //   47   98:astore          8
    //   48  100:aload           8
    //   49  102:areturn         
    // catch Throwable
    //   50  103:astore          4
    //   51  105:aload           4
    //   52  107:invokevirtual   #155 <Method void Throwable.printStackTrace()>
    //   53  110:aload           4
    //   54  112:instanceof      #157 <Class OutOfMemoryError>
    //   55  115:ifeq            125
    //   56  118:aload_0         
    //   57  119:getfield        #27  <Field MemoryCache memoryCache>
    //   58  122:invokevirtual   #160 <Method void MemoryCache.clear()>
    //   59  125:aconst_null     
    //   60  126:areturn         
    }

    private void queuePhoto(String s, ImageView imageview)
    {
    //    0    0:new             #164 <Class ImageLoader$PhotoToLoad>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:aload_2         
    //    5    7:invokespecial   #167 <Method void ImageLoader$PhotoToLoad(ImageLoader, String, ImageView)>
    //    6   10:astore_3        
    //    7   11:aload_0         
    //    8   12:getfield        #60  <Field ExecutorService executorService>
    //    9   15:new             #169 <Class ImageLoader$PhotosLoader>
    //   10   18:dup             
    //   11   19:aload_0         
    //   12   20:aload_3         
    //   13   21:invokespecial   #172 <Method void ImageLoader$PhotosLoader(ImageLoader, ImageLoader$PhotoToLoad)>
    //   14   24:invokeinterface #178 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
    //   15   29:pop             
    //   16   30:return          
    }

    public void DisplayImage(String s, ImageView imageview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Map imageViews>
    //    2    4:aload_2         
    //    3    5:aload_1         
    //    4    6:invokeinterface #185 <Method Object Map.put(Object, Object)>
    //    5   11:pop             
    //    6   12:aload_0         
    //    7   13:getfield        #27  <Field MemoryCache memoryCache>
    //    8   16:aload_1         
    //    9   17:invokevirtual   #188 <Method Bitmap MemoryCache.get(String)>
    //   10   20:astore          4
    //   11   22:aload           4
    //   12   24:ifnull          34
    //   13   27:aload_2         
    //   14   28:aload           4
    //   15   30:invokevirtual   #194 <Method void ImageView.setImageBitmap(Bitmap)>
    //   16   33:return          
    //   17   34:aload_0         
    //   18   35:aload_1         
    //   19   36:aload_2         
    //   20   37:invokespecial   #196 <Method void queuePhoto(String, ImageView)>
    //   21   40:aload_2         
    //   22   41:ldc1            #44  <Int 0x7f020099>
    //   23   43:invokevirtual   #199 <Method void ImageView.setImageResource(int)>
    //   24   46:return          
    }

    public void clearCache()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field MemoryCache memoryCache>
    //    2    4:invokevirtual   #160 <Method void MemoryCache.clear()>
    //    3    7:aload_0         
    //    4    8:getfield        #52  <Field FileCache fileCache>
    //    5   11:invokevirtual   #201 <Method void FileCache.clear()>
    //    6   14:return          
    }

    boolean imageViewReused(PhotoToLoad phototoload)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Map imageViews>
    //    2    4:aload_1         
    //    3    5:getfield        #207 <Field ImageView ImageLoader$PhotoToLoad.imageView>
    //    4    8:invokeinterface #210 <Method Object Map.get(Object)>
    //    5   13:checkcast       #212 <Class String>
    //    6   16:astore_2        
    //    7   17:aload_2         
    //    8   18:ifnull          32
    //    9   21:aload_2         
    //   10   22:aload_1         
    //   11   23:getfield        #216 <Field String ImageLoader$PhotoToLoad.url>
    //   12   26:invokevirtual   #220 <Method boolean String.equals(Object)>
    //   13   29:ifne            34
    //   14   32:iconst_1        
    //   15   33:ireturn         
    //   16   34:iconst_0        
    //   17   35:ireturn         
    }

    ExecutorService executorService;
    FileCache fileCache;
    Handler handler;
    private Map imageViews;
    MemoryCache memoryCache;
    final int stub_id;

    static Bitmap access$0(ImageLoader imageloader, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #66  <Method Bitmap getBitmap(String)>
    //    3    5:areturn         
    }
}
