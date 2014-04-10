// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.*;
import android.content.*;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.*;
import android.net.*;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import java.io.*;
import java.util.*;

// Referenced classes of package codeadore.textgram:
//            el7rUtilities, Settings, MainActivity, ResultActivity, 
//            AboutActivity, RAppsActivity, StoreActivity, GoProActivity, 
//            SettingsActivity, StylingActivity, el7rActivity

public class Utilities
{

    static 
    {
    //    0    0:ldc1            #10  <String "Utilitites">
    //    1    2:putstatic       #12  <Field String TAG>
    //    2    5:return          
    }

    public Utilities()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:return          
    }

    public static int IntegerValueOf(String s, int i)
    {
    // try 0 8 handler(s) 10
    //    0    0:aload_0         
    //    1    1:invokestatic    #25  <Method Integer Integer.valueOf(String)>
    //    2    4:invokevirtual   #29  <Method int Integer.intValue()>
    //    3    7:istore_3        
    //    4    8:iload_3         
    //    5    9:ireturn         
    // catch Exception
    //    6   10:astore_2        
    //    7   11:iload_1         
    //    8   12:ireturn         
    }

    public static void checkPrefsCounters(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #33  <String "TextgramSettings">
    //    2    3:iconst_0        
    //    3    4:invokevirtual   #39  <Method SharedPreferences Context.getSharedPreferences(String, int)>
    //    4    7:astore_1        
    //    5    8:new             #41  <Class Date>
    //    6   11:dup             
    //    7   12:invokespecial   #42  <Method void Date()>
    //    8   15:astore_2        
    //    9   16:new             #44  <Class StringBuilder>
    //   10   19:dup             
    //   11   20:aload_2         
    //   12   21:invokevirtual   #47  <Method int Date.getDay()>
    //   13   24:invokestatic    #52  <Method String String.valueOf(int)>
    //   14   27:invokespecial   #55  <Method void StringBuilder(String)>
    //   15   30:ldc1            #57  <String "/">
    //   16   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   17   35:aload_2         
    //   18   36:invokevirtual   #64  <Method int Date.getMonth()>
    //   19   39:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
    //   20   42:ldc1            #57  <String "/">
    //   21   44:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   22   47:aload_2         
    //   23   48:invokevirtual   #70  <Method int Date.getYear()>
    //   24   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
    //   25   54:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   26   57:astore_3        
    //   27   58:aload_1         
    //   28   59:ldc1            #76  <String "lastRecordedDate">
    //   29   61:ldc1            #78  <String "">
    //   30   63:invokeinterface #84  <Method String SharedPreferences.getString(String, String)>
    //   31   68:aload_3         
    //   32   69:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   33   72:ifne            135
    //   34   75:aload_1         
    //   35   76:invokeinterface #92  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //   36   81:astore          4
    //   37   83:aload           4
    //   38   85:ldc1            #94  <String "even_store_item">
    //   39   87:iconst_0        
    //   40   88:invokeinterface #100 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
    //   41   93:pop             
    //   42   94:aload           4
    //   43   96:ldc1            #102 <String "event_save_textgram">
    //   44   98:iconst_0        
    //   45   99:invokeinterface #100 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
    //   46  104:pop             
    //   47  105:aload           4
    //   48  107:ldc1            #104 <String "event_share_textgram">
    //   49  109:iconst_0        
    //   50  110:invokeinterface #100 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
    //   51  115:pop             
    //   52  116:aload           4
    //   53  118:ldc1            #76  <String "lastRecordedDate">
    //   54  120:aload_3         
    //   55  121:invokeinterface #108 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
    //   56  126:pop             
    //   57  127:aload           4
    //   58  129:invokeinterface #112 <Method boolean android.content.SharedPreferences$Editor.commit()>
    //   59  134:pop             
    //   60  135:return          
    }

    public static Bitmap createReflectedBitmap(Bitmap bitmap, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #119 <Method int Bitmap.getWidth()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #122 <Method int Bitmap.getHeight()>
    //    4    8:getstatic       #128 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //    5   11:invokestatic    #132 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //    6   14:astore_2        
    //    7   15:new             #134 <Class Canvas>
    //    8   18:dup             
    //    9   19:aload_2         
    //   10   20:invokespecial   #137 <Method void Canvas(Bitmap)>
    //   11   23:astore_3        
    //   12   24:new             #139 <Class Matrix>
    //   13   27:dup             
    //   14   28:invokespecial   #140 <Method void Matrix()>
    //   15   31:astore          4
    //   16   33:aload           4
    //   17   35:ldc1            #141 <Float 180F>
    //   18   37:aload_0         
    //   19   38:invokevirtual   #119 <Method int Bitmap.getWidth()>
    //   20   41:iconst_2        
    //   21   42:idiv            
    //   22   43:i2f             
    //   23   44:aload_0         
    //   24   45:invokevirtual   #122 <Method int Bitmap.getHeight()>
    //   25   48:iconst_2        
    //   26   49:idiv            
    //   27   50:i2f             
    //   28   51:invokevirtual   #145 <Method void Matrix.setRotate(float, float, float)>
    //   29   54:aload           4
    //   30   56:fconst_1        
    //   31   57:ldc1            #146 <Float -1F>
    //   32   59:invokevirtual   #150 <Method void Matrix.setScale(float, float)>
    //   33   62:aload           4
    //   34   64:fconst_0        
    //   35   65:aload_2         
    //   36   66:invokevirtual   #122 <Method int Bitmap.getHeight()>
    //   37   69:i2f             
    //   38   70:invokevirtual   #154 <Method boolean Matrix.postTranslate(float, float)>
    //   39   73:pop             
    //   40   74:new             #156 <Class Paint>
    //   41   77:dup             
    //   42   78:invokespecial   #157 <Method void Paint()>
    //   43   81:astore          6
    //   44   83:aload           6
    //   45   85:iload_1         
    //   46   86:sipush          255
    //   47   89:imul            
    //   48   90:bipush          100
    //   49   92:idiv            
    //   50   93:invokevirtual   #161 <Method void Paint.setAlpha(int)>
    //   51   96:aload_3         
    //   52   97:aload_0         
    //   53   98:aload           4
    //   54  100:aload           6
    //   55  102:invokevirtual   #165 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
    //   56  105:aload_2         
    //   57  106:areturn         
    }

    public static String createURIFromBitmap(Context context, Bitmap bitmap)
    {
    // try 0 70 handler(s) 73 80
    //    0    0:new             #44  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:ldc1            #173 <String "tg">
    //    3    6:invokespecial   #55  <Method void StringBuilder(String)>
    //    4    9:invokestatic    #179 <Method long System.currentTimeMillis()>
    //    5   12:invokevirtual   #182 <Method StringBuilder StringBuilder.append(long)>
    //    6   15:invokevirtual   #74  <Method String StringBuilder.toString()>
    //    7   18:ldc1            #184 <String ".jpg">
    //    8   20:invokestatic    #190 <Method File File.createTempFile(String, String)>
    //    9   23:astore          4
    //   10   25:new             #192 <Class FileOutputStream>
    //   11   28:dup             
    //   12   29:aload           4
    //   13   31:invokespecial   #195 <Method void FileOutputStream(File)>
    //   14   34:astore          5
    //   15   36:aload_1         
    //   16   37:getstatic       #201 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
    //   17   40:bipush          90
    //   18   42:aload           5
    //   19   44:invokevirtual   #205 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
    //   20   47:pop             
    //   21   48:new             #44  <Class StringBuilder>
    //   22   51:dup             
    //   23   52:ldc1            #207 <String "file://">
    //   24   54:invokespecial   #55  <Method void StringBuilder(String)>
    //   25   57:aload           4
    //   26   59:invokevirtual   #210 <Method String File.getPath()>
    //   27   62:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   28   65:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   29   68:astore          7
    //   30   70:aload           7
    //   31   72:areturn         
    // catch FileNotFoundException
    //   32   73:astore_3        
    //   33   74:aload_3         
    //   34   75:invokevirtual   #213 <Method void FileNotFoundException.printStackTrace()>
    //   35   78:aconst_null     
    //   36   79:areturn         
    // catch IOException
    //   37   80:astore_2        
    //   38   81:aload_2         
    //   39   82:invokevirtual   #214 <Method void IOException.printStackTrace()>
    //   40   85:aconst_null     
    //   41   86:areturn         
    }

    public static Bitmap decorateBitmap(Context context, Bitmap bitmap)
    {
    //    0    0:aload_1         
    //    1    1:areturn         
    }

    public static Bitmap getBitmapFromPath(Context context, String s)
    {
    // try 0 8 handler(s) 65
    //    0    0:aload_1         
    //    1    1:ldc1            #220 <String "[assets]">
    //    2    3:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //    3    6:istore          4
    //    4    8:iload           4
    //    5   10:ifeq            94
    // try 13 27 handler(s) 34
    //    6   13:aload_0         
    //    7   14:aload_1         
    //    8   15:ldc1            #222 <String "[assets]/">
    //    9   17:ldc1            #78  <String "">
    //   10   19:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   11   22:invokestatic    #231 <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
    //   12   25:astore          16
    //   13   27:aload           16
    //   14   29:astore          7
    //   15   31:aload           7
    //   16   33:areturn         
    // catch Exception
    //   17   34:astore          14
    // try 36 63 handler(s) 65
    //   18   36:getstatic       #12  <Field String TAG>
    //   19   39:new             #44  <Class StringBuilder>
    //   20   42:dup             
    //   21   43:ldc1            #233 <String "in getBitmapFromPath() -> from assets: ">
    //   22   45:invokespecial   #55  <Method void StringBuilder(String)>
    //   23   48:aload           14
    //   24   50:invokevirtual   #234 <Method String Exception.toString()>
    //   25   53:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   26   56:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   27   59:invokestatic    #240 <Method int Log.e(String, String)>
    //   28   62:pop             
    //   29   63:aconst_null     
    //   30   64:areturn         
    // catch Exception Exception Exception Exception Exception Exception Exception
    //   31   65:astore_2        
    //   32   66:getstatic       #12  <Field String TAG>
    //   33   69:new             #44  <Class StringBuilder>
    //   34   72:dup             
    //   35   73:ldc1            #242 <String " in getBitmapFromPath(): ">
    //   36   75:invokespecial   #55  <Method void StringBuilder(String)>
    //   37   78:aload_2         
    //   38   79:invokevirtual   #234 <Method String Exception.toString()>
    //   39   82:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   40   85:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   41   88:invokestatic    #240 <Method int Log.e(String, String)>
    //   42   91:pop             
    //   43   92:aconst_null     
    //   44   93:areturn         
    // try 94 102 handler(s) 65
    //   45   94:aload_1         
    //   46   95:ldc1            #244 <String "[sdcard]">
    //   47   97:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   48  100:istore          5
    //   49  102:iload           5
    //   50  104:ifeq            184
    // try 107 149 handler(s) 152
    //   51  107:aload_1         
    //   52  108:ldc1            #246 <String "[sdcard]/">
    //   53  110:ldc1            #78  <String "">
    //   54  112:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   55  115:astore          12
    //   56  117:new             #44  <Class StringBuilder>
    //   57  120:dup             
    //   58  121:getstatic       #251 <Field String Settings.sdCardPath>
    //   59  124:invokestatic    #254 <Method String String.valueOf(Object)>
    //   60  127:invokespecial   #55  <Method void StringBuilder(String)>
    //   61  130:getstatic       #257 <Field String File.separator>
    //   62  133:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   63  136:aload           12
    //   64  138:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   65  141:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   66  144:invokestatic    #263 <Method Bitmap BitmapFactory.decodeFile(String)>
    //   67  147:astore          13
    //   68  149:aload           13
    //   69  151:areturn         
    // catch Exception
    //   70  152:astore          10
    // try 154 182 handler(s) 65
    //   71  154:getstatic       #12  <Field String TAG>
    //   72  157:new             #44  <Class StringBuilder>
    //   73  160:dup             
    //   74  161:ldc2            #265 <String "in getBitmapFromPath() -> from sdCard: ">
    //   75  164:invokespecial   #55  <Method void StringBuilder(String)>
    //   76  167:aload           10
    //   77  169:invokevirtual   #234 <Method String Exception.toString()>
    //   78  172:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   79  175:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   80  178:invokestatic    #240 <Method int Log.e(String, String)>
    //   81  181:pop             
    //   82  182:aconst_null     
    //   83  183:areturn         
    // try 184 211 handler(s) 65
    //   84  184:aload_1         
    //   85  185:ldc2            #267 <String "[URI]">
    //   86  188:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   87  191:ifeq            211
    //   88  194:aload_1         
    //   89  195:ldc2            #269 <String "[URI]/">
    //   90  198:ldc1            #78  <String "">
    //   91  200:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   92  203:invokestatic    #275 <Method Uri Uri.parse(String)>
    //   93  206:aload_0         
    //   94  207:invokestatic    #279 <Method Bitmap getBitmapFromURI(Uri, Context)>
    //   95  210:areturn         
    // try 211 220 handler(s) 65
    //   96  211:aload_1         
    //   97  212:ldc2            #281 <String "[color]">
    //   98  215:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   99  218:istore          6
    //  100  220:aconst_null     
    //  101  221:astore          7
    //  102  223:iload           6
    //  103  225:ifeq            31
    // try 228 271 handler(s) 65
    //  104  228:aload_1         
    //  105  229:ldc2            #283 <String "[color]/">
    //  106  232:ldc1            #78  <String "">
    //  107  234:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //  108  237:invokestatic    #25  <Method Integer Integer.valueOf(String)>
    //  109  240:invokevirtual   #29  <Method int Integer.intValue()>
    //  110  243:istore          8
    //  111  245:bipush          100
    //  112  247:bipush          100
    //  113  249:getstatic       #286 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
    //  114  252:invokestatic    #132 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //  115  255:astore          9
    //  116  257:new             #134 <Class Canvas>
    //  117  260:dup             
    //  118  261:aload           9
    //  119  263:invokespecial   #137 <Method void Canvas(Bitmap)>
    //  120  266:iload           8
    //  121  268:invokevirtual   #289 <Method void Canvas.drawColor(int)>
    //  122  271:aload           9
    //  123  273:areturn         
    }

    public static Bitmap getBitmapFromURI(Uri uri, Context context)
    {
    // try 0 49 handler(s) 150
    //    0    0:aload_1         
    //    1    1:invokevirtual   #293 <Method ContentResolver Context.getContentResolver()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #299 <Method InputStream ContentResolver.openInputStream(Uri)>
    //    4    8:astore          4
    //    5   10:aload_1         
    //    6   11:invokevirtual   #293 <Method ContentResolver Context.getContentResolver()>
    //    7   14:aload_0         
    //    8   15:invokevirtual   #299 <Method InputStream ContentResolver.openInputStream(Uri)>
    //    9   18:astore          5
    //   10   20:new             #301 <Class android.graphics.BitmapFactory$Options>
    //   11   23:dup             
    //   12   24:invokespecial   #302 <Method void android.graphics.BitmapFactory$Options()>
    //   13   27:astore          6
    //   14   29:aload           6
    //   15   31:iconst_1        
    //   16   32:putfield        #306 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
    //   17   35:aload           4
    //   18   37:aconst_null     
    //   19   38:aload           6
    //   20   40:invokestatic    #310 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   21   43:pop             
    //   22   44:aload           4
    //   23   46:invokevirtual   #315 <Method void InputStream.close()>
    //   24   49:iconst_1        
    //   25   50:istore          8
    // try 52 74 handler(s) 150
    //   26   52:aload           6
    //   27   54:getfield        #319 <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   28   57:sipush          612
    //   29   60:icmpgt          74
    //   30   63:aload           6
    //   31   65:getfield        #322 <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   32   68:sipush          612
    //   33   71:icmple          116
    // try 74 116 handler(s) 150
    //   34   74:ldc2w           #323 <Double 2D>
    //   35   77:ldc2w           #325 <Double 612D>
    //   36   80:aload           6
    //   37   82:getfield        #319 <Field int android.graphics.BitmapFactory$Options.outHeight>
    //   38   85:aload           6
    //   39   87:getfield        #322 <Field int android.graphics.BitmapFactory$Options.outWidth>
    //   40   90:invokestatic    #332 <Method int Math.max(int, int)>
    //   41   93:i2d             
    //   42   94:ddiv            
    //   43   95:invokestatic    #336 <Method double Math.log(double)>
    //   44   98:ldc2w           #337 <Double 0.5D>
    //   45  101:invokestatic    #336 <Method double Math.log(double)>
    //   46  104:ddiv            
    //   47  105:invokestatic    #342 <Method long Math.round(double)>
    //   48  108:l2i             
    //   49  109:i2d             
    //   50  110:invokestatic    #346 <Method double Math.pow(double, double)>
    //   51  113:d2i             
    //   52  114:istore          8
    // try 116 147 handler(s) 150
    //   53  116:new             #301 <Class android.graphics.BitmapFactory$Options>
    //   54  119:dup             
    //   55  120:invokespecial   #302 <Method void android.graphics.BitmapFactory$Options()>
    //   56  123:astore          9
    //   57  125:aload           9
    //   58  127:iload           8
    //   59  129:putfield        #349 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
    //   60  132:aload           5
    //   61  134:aconst_null     
    //   62  135:aload           9
    //   63  137:invokestatic    #310 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   64  140:astore          10
    //   65  142:aload           5
    //   66  144:invokevirtual   #315 <Method void InputStream.close()>
    //   67  147:aload           10
    //   68  149:areturn         
    // catch Exception Exception Exception Exception
    //   69  150:astore_2        
    //   70  151:getstatic       #12  <Field String TAG>
    //   71  154:new             #44  <Class StringBuilder>
    //   72  157:dup             
    //   73  158:ldc2            #351 <String "in getBitmapFromURI(): ">
    //   74  161:invokespecial   #55  <Method void StringBuilder(String)>
    //   75  164:aload_2         
    //   76  165:invokevirtual   #234 <Method String Exception.toString()>
    //   77  168:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   78  171:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   79  174:invokestatic    #240 <Method int Log.e(String, String)>
    //   80  177:pop             
    //   81  178:aload_1         
    //   82  179:aload_1         
    //   83  180:ldc2            #352 <Int 0x7f0b0023>
    //   84  183:invokevirtual   #354 <Method String Context.getString(int)>
    //   85  186:iconst_1        
    //   86  187:invokestatic    #360 <Method Toast Toast.makeText(Context, CharSequence, int)>
    //   87  190:invokevirtual   #363 <Method void Toast.show()>
    //   88  193:aconst_null     
    //   89  194:areturn         
    }

    public static String getRealPathFromURI(Context context, Uri uri)
    {
    //    0    0:iconst_1        
    //    1    1:anewarray       String[]
    //    2    4:dup             
    //    3    5:iconst_0        
    //    4    6:ldc2            #367 <String "_data">
    //    5    9:aastore         
    //    6   10:astore_2        
    //    7   11:aload_0         
    //    8   12:invokevirtual   #293 <Method ContentResolver Context.getContentResolver()>
    //    9   15:aload_1         
    //   10   16:aload_2         
    //   11   17:aconst_null     
    //   12   18:aconst_null     
    //   13   19:aconst_null     
    //   14   20:invokevirtual   #371 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
    //   15   23:astore_3        
    //   16   24:aload_3         
    //   17   25:ldc2            #367 <String "_data">
    //   18   28:invokeinterface #377 <Method int Cursor.getColumnIndexOrThrow(String)>
    //   19   33:istore          4
    //   20   35:aload_3         
    //   21   36:invokeinterface #380 <Method boolean Cursor.moveToFirst()>
    //   22   41:pop             
    //   23   42:aload_3         
    //   24   43:iload           4
    //   25   45:invokeinterface #381 <Method String Cursor.getString(int)>
    //   26   50:areturn         
    }

    public static String getTemplateField(Context context, String s, String s1)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //    2    4:astore_3        
    //    3    5:aload_1         
    //    4    6:ldc2            #389 <String "[custom]">
    //    5    9:if_acmpne       15
    //    6   12:ldc1            #78  <String "">
    //    7   14:areturn         
    //    8   15:aload_1         
    //    9   16:ldc2            #391 <String "[custom_color]">
    //   10   19:if_acmpne       25
    //   11   22:ldc1            #78  <String "">
    //   12   24:areturn         
    //   13   25:aload_1         
    //   14   26:ldc1            #220 <String "[assets]">
    //   15   28:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   16   31:ifeq            115
    //   17   34:new             #393 <Class BufferedReader>
    //   18   37:dup             
    //   19   38:new             #395 <Class InputStreamReader>
    //   20   41:dup             
    //   21   42:aload_3         
    //   22   43:new             #44  <Class StringBuilder>
    //   23   46:dup             
    //   24   47:aload_1         
    //   25   48:ldc1            #222 <String "[assets]/">
    //   26   50:ldc1            #78  <String "">
    //   27   52:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   28   55:invokestatic    #254 <Method String String.valueOf(Object)>
    //   29   58:invokespecial   #55  <Method void StringBuilder(String)>
    //   30   61:getstatic       #257 <Field String File.separator>
    //   31   64:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   32   67:ldc2            #397 <String "config.xml">
    //   33   70:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   34   73:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   35   76:invokevirtual   #403 <Method InputStream AssetManager.open(String)>
    //   36   79:invokespecial   #406 <Method void InputStreamReader(InputStream)>
    //   37   82:invokespecial   #409 <Method void BufferedReader(java.io.Reader)>
    //   38   85:astore          4
    //   39   87:aconst_null     
    //   40   88:astore          5
    //   41   90:aload           4
    //   42   92:ifnull          107
    //   43   95:aload           4
    //   44   97:invokevirtual   #412 <Method String BufferedReader.readLine()>
    //   45  100:astore          6
    //   46  102:aload           6
    //   47  104:ifnonnull       206
    //   48  107:aload           4
    //   49  109:invokevirtual   #413 <Method void BufferedReader.close()>
    //   50  112:aload           5
    //   51  114:areturn         
    //   52  115:aload_1         
    //   53  116:ldc1            #244 <String "[sdcard]">
    //   54  118:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   55  121:istore          7
    //   56  123:aconst_null     
    //   57  124:astore          4
    //   58  126:iload           7
    //   59  128:ifeq            87
    //   60  131:aload_1         
    //   61  132:ldc1            #246 <String "[sdcard]/">
    //   62  134:ldc1            #78  <String "">
    //   63  136:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   64  139:astore          8
    //   65  141:new             #393 <Class BufferedReader>
    //   66  144:dup             
    //   67  145:new             #415 <Class FileReader>
    //   68  148:dup             
    //   69  149:new             #186 <Class File>
    //   70  152:dup             
    //   71  153:new             #44  <Class StringBuilder>
    //   72  156:dup             
    //   73  157:getstatic       #251 <Field String Settings.sdCardPath>
    //   74  160:invokestatic    #254 <Method String String.valueOf(Object)>
    //   75  163:invokespecial   #55  <Method void StringBuilder(String)>
    //   76  166:getstatic       #257 <Field String File.separator>
    //   77  169:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   78  172:aload           8
    //   79  174:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   80  177:getstatic       #257 <Field String File.separator>
    //   81  180:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   82  183:ldc2            #397 <String "config.xml">
    //   83  186:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   84  189:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   85  192:invokespecial   #416 <Method void File(String)>
    //   86  195:invokespecial   #417 <Method void FileReader(File)>
    //   87  198:invokespecial   #409 <Method void BufferedReader(java.io.Reader)>
    //   88  201:astore          4
    //   89  203:goto            87
    //   90  206:aload           6
    //   91  208:new             #44  <Class StringBuilder>
    //   92  211:dup             
    //   93  212:ldc2            #419 <String "<">
    //   94  215:invokespecial   #55  <Method void StringBuilder(String)>
    //   95  218:aload_2         
    //   96  219:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   97  222:ldc2            #421 <String ">.*</">
    //   98  225:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   99  228:aload_2         
    //  100  229:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  101  232:ldc2            #423 <String ">">
    //  102  235:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  103  238:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  104  241:invokevirtual   #427 <Method boolean String.matches(String)>
    //  105  244:ifeq            95
    //  106  247:aload           6
    //  107  249:new             #44  <Class StringBuilder>
    //  108  252:dup             
    //  109  253:ldc2            #419 <String "<">
    //  110  256:invokespecial   #55  <Method void StringBuilder(String)>
    //  111  259:aload_2         
    //  112  260:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  113  263:ldc2            #423 <String ">">
    //  114  266:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  115  269:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  116  272:ldc1            #78  <String "">
    //  117  274:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //  118  277:new             #44  <Class StringBuilder>
    //  119  280:dup             
    //  120  281:ldc2            #429 <String "</">
    //  121  284:invokespecial   #55  <Method void StringBuilder(String)>
    //  122  287:aload_2         
    //  123  288:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  124  291:ldc2            #423 <String ">">
    //  125  294:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  126  297:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  127  300:ldc1            #78  <String "">
    //  128  302:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //  129  305:astore          5
    //  130  307:goto            95
    }

    public static Typeface getTypefaceFromPath(Context context, String s)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #220 <String "[assets]">
    //    2    3:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //    3    6:ifeq            67
    // try 9 30 handler(s) 35
    //    4    9:aload_1         
    //    5   10:ldc1            #222 <String "[assets]/">
    //    6   12:ldc1            #78  <String "">
    //    7   14:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //    8   17:astore          9
    //    9   19:aload_0         
    //   10   20:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //   11   23:aload           9
    //   12   25:invokestatic    #437 <Method Typeface Typeface.createFromAsset(AssetManager, String)>
    //   13   28:astore          10
    //   14   30:aload           10
    //   15   32:astore_3        
    //   16   33:aload_3         
    //   17   34:areturn         
    // catch Exception
    //   18   35:astore          7
    //   19   37:getstatic       #12  <Field String TAG>
    //   20   40:new             #44  <Class StringBuilder>
    //   21   43:dup             
    //   22   44:ldc2            #439 <String "in getTypeFaceFromPath() -> fetch form assets: ">
    //   23   47:invokespecial   #55  <Method void StringBuilder(String)>
    //   24   50:aload           7
    //   25   52:invokevirtual   #234 <Method String Exception.toString()>
    //   26   55:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   27   58:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   28   61:invokestatic    #240 <Method int Log.e(String, String)>
    //   29   64:pop             
    //   30   65:aconst_null     
    //   31   66:areturn         
    //   32   67:aload_1         
    //   33   68:ldc1            #244 <String "[sdcard]">
    //   34   70:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //   35   73:istore_2        
    //   36   74:aconst_null     
    //   37   75:astore_3        
    //   38   76:iload_2         
    //   39   77:ifeq            33
    // try 80 118 handler(s) 121
    //   40   80:new             #44  <Class StringBuilder>
    //   41   83:dup             
    //   42   84:getstatic       #251 <Field String Settings.sdCardPath>
    //   43   87:invokestatic    #254 <Method String String.valueOf(Object)>
    //   44   90:invokespecial   #55  <Method void StringBuilder(String)>
    //   45   93:getstatic       #257 <Field String File.separator>
    //   46   96:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   47   99:aload_1         
    //   48  100:ldc1            #246 <String "[sdcard]/">
    //   49  102:ldc1            #78  <String "">
    //   50  104:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //   51  107:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   52  110:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   53  113:invokestatic    #443 <Method Typeface Typeface.createFromFile(String)>
    //   54  116:astore          6
    //   55  118:aload           6
    //   56  120:areturn         
    // catch Exception
    //   57  121:astore          4
    //   58  123:getstatic       #12  <Field String TAG>
    //   59  126:new             #44  <Class StringBuilder>
    //   60  129:dup             
    //   61  130:ldc2            #445 <String "in getTypeFaceFromPath() -> fetch form sdCard: ">
    //   62  133:invokespecial   #55  <Method void StringBuilder(String)>
    //   63  136:aload           4
    //   64  138:invokevirtual   #234 <Method String Exception.toString()>
    //   65  141:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //   66  144:invokevirtual   #74  <Method String StringBuilder.toString()>
    //   67  147:invokestatic    #240 <Method int Log.e(String, String)>
    //   68  150:pop             
    //   69  151:aconst_null     
    //   70  152:areturn         
    }

    public static boolean isOnline(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc2            #449 <String "connectivity">
    //    2    4:invokevirtual   #453 <Method Object Context.getSystemService(String)>
    //    3    7:checkcast       #455 <Class ConnectivityManager>
    //    4   10:invokevirtual   #459 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
    //    5   13:astore_1        
    //    6   14:aload_1         
    //    7   15:ifnull          27
    //    8   18:aload_1         
    //    9   19:invokevirtual   #464 <Method boolean NetworkInfo.isConnected()>
    //   10   22:ifeq            27
    //   11   25:iconst_1        
    //   12   26:ireturn         
    //   13   27:iconst_0        
    //   14   28:ireturn         
    }

    public static boolean isTablet(Context context)
    {
    // try 0 56 handler(s) 78
    //    0    0:aload_0         
    //    1    1:invokevirtual   #471 <Method Resources Context.getResources()>
    //    2    4:invokevirtual   #477 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    3    7:astore_3        
    //    4    8:aload_3         
    //    5    9:getfield        #482 <Field int DisplayMetrics.widthPixels>
    //    6   12:i2f             
    //    7   13:aload_3         
    //    8   14:getfield        #486 <Field float DisplayMetrics.xdpi>
    //    9   17:fdiv            
    //   10   18:fstore          4
    //   11   20:aload_3         
    //   12   21:getfield        #489 <Field int DisplayMetrics.heightPixels>
    //   13   24:i2f             
    //   14   25:aload_3         
    //   15   26:getfield        #492 <Field float DisplayMetrics.ydpi>
    //   16   29:fdiv            
    //   17   30:fstore          5
    //   18   32:fload           4
    //   19   34:f2d             
    //   20   35:ldc2w           #323 <Double 2D>
    //   21   38:invokestatic    #346 <Method double Math.pow(double, double)>
    //   22   41:fload           5
    //   23   43:f2d             
    //   24   44:ldc2w           #323 <Double 2D>
    //   25   47:invokestatic    #346 <Method double Math.pow(double, double)>
    //   26   50:dadd            
    //   27   51:invokestatic    #495 <Method double Math.sqrt(double)>
    //   28   54:dstore          6
    //   29   56:dload           6
    //   30   58:ldc2w           #496 <Double 6D>
    //   31   61:dcmpl           
    //   32   62:istore          8
    //   33   64:iconst_0        
    //   34   65:istore          9
    //   35   67:iload           8
    //   36   69:iflt            75
    //   37   72:iconst_1        
    //   38   73:istore          9
    //   39   75:iload           9
    //   40   77:ireturn         
    // catch Throwable
    //   41   78:astore_1        
    //   42   79:getstatic       #12  <Field String TAG>
    //   43   82:ldc2            #499 <String "Failed to compute screen size">
    //   44   85:aload_1         
    //   45   86:invokestatic    #502 <Method int Log.e(String, String, Throwable)>
    //   46   89:pop             
    //   47   90:iconst_0        
    //   48   91:ireturn         
    }

    public static void openGalleryForSelect(Activity activity, int i)
    {
    //    0    0:new             #506 <Class Intent>
    //    1    3:dup             
    //    2    4:ldc2            #508 <String "android.intent.action.PICK">
    //    3    7:invokespecial   #509 <Method void Intent(String)>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ldc2            #511 <String "image/*">
    //    7   15:invokevirtual   #515 <Method Intent Intent.setType(String)>
    //    8   18:pop             
    //    9   19:aload_0         
    //   10   20:aload_2         
    //   11   21:iload_1         
    //   12   22:invokevirtual   #521 <Method void Activity.startActivityForResult(Intent, int)>
    //   13   25:return          
    }

    public static void optionsMenuAction(MenuItem menuitem, Activity activity, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #528 <Method int MenuItem.getItemId()>
    //    2    6:lookupswitch    7: default 72
    //                   16908332: 73
    //                   2131099872: 78
    //                   2131099874: 144
    //                   2131099875: 128
    //                   2131099876: 160
    //                   2131099877: 112
    //                   2131099878: 176
    //    3   72:return          
    //    4   73:aload_1         
    //    5   74:invokevirtual   #531 <Method void Activity.onBackPressed()>
    //    6   77:return          
    //    7   78:aload_2         
    //    8   79:ldc2            #533 <String "MainActivity">
    //    9   82:if_acmpne       89
    //   10   85:invokestatic    #538 <Method void MainActivity.goNext()>
    //   11   88:return          
    //   12   89:aload_2         
    //   13   90:ldc2            #540 <String "StylingActivity">
    //   14   93:if_acmpne       72
    //   15   96:aload_1         
    //   16   97:new             #506 <Class Intent>
    //   17  100:dup             
    //   18  101:aload_1         
    //   19  102:ldc2            #542 <Class ResultActivity>
    //   20  105:invokespecial   #545 <Method void Intent(Context, Class)>
    //   21  108:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   22  111:return          
    //   23  112:aload_1         
    //   24  113:new             #506 <Class Intent>
    //   25  116:dup             
    //   26  117:aload_1         
    //   27  118:ldc2            #551 <Class AboutActivity>
    //   28  121:invokespecial   #545 <Method void Intent(Context, Class)>
    //   29  124:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   30  127:return          
    //   31  128:aload_1         
    //   32  129:new             #506 <Class Intent>
    //   33  132:dup             
    //   34  133:aload_1         
    //   35  134:ldc2            #553 <Class RAppsActivity>
    //   36  137:invokespecial   #545 <Method void Intent(Context, Class)>
    //   37  140:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   38  143:return          
    //   39  144:aload_1         
    //   40  145:new             #506 <Class Intent>
    //   41  148:dup             
    //   42  149:aload_1         
    //   43  150:ldc2            #555 <Class StoreActivity>
    //   44  153:invokespecial   #545 <Method void Intent(Context, Class)>
    //   45  156:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   46  159:return          
    //   47  160:aload_1         
    //   48  161:new             #506 <Class Intent>
    //   49  164:dup             
    //   50  165:aload_1         
    //   51  166:ldc2            #557 <Class GoProActivity>
    //   52  169:invokespecial   #545 <Method void Intent(Context, Class)>
    //   53  172:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   54  175:return          
    //   55  176:aload_1         
    //   56  177:new             #506 <Class Intent>
    //   57  180:dup             
    //   58  181:aload_1         
    //   59  182:ldc2            #559 <Class SettingsActivity>
    //   60  185:invokespecial   #545 <Method void Intent(Context, Class)>
    //   61  188:invokevirtual   #549 <Method void Activity.startActivity(Intent)>
    //   62  191:return          
    }

    public static void saveBitmap(Context context, Bitmap bitmap, ProgressDialog progressdialog)
        throws IOException
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #564 <Method void ProgressDialog.show()>
    //    2    4:new             #566 <Class Thread>
    //    3    7:dup             
    //    4    8:new             #568 <Class Utilities$1>
    //    5   11:dup             
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:invokespecial   #571 <Method void Utilities$1(Bitmap, Context, ProgressDialog)>
    //   10   18:invokespecial   #574 <Method void Thread(Runnable)>
    //   11   21:invokevirtual   #577 <Method void Thread.start()>
    //   12   24:return          
    }

    public static void shareBitmap(Context context, Bitmap bitmap, ProgressDialog progressdialog)
        throws IOException
    {
    // try 0 15 handler(s) 36
    //    0    0:getstatic       #582 <Field Handler ResultActivity.UIHandler>
    //    1    3:new             #584 <Class Utilities$2>
    //    2    6:dup             
    //    3    7:aload_2         
    //    4    8:invokespecial   #587 <Method void Utilities$2(ProgressDialog)>
    //    5   11:invokevirtual   #593 <Method boolean Handler.post(Runnable)>
    //    6   14:pop             
    //    7   15:new             #566 <Class Thread>
    //    8   18:dup             
    //    9   19:new             #595 <Class Utilities$3>
    //   10   22:dup             
    //   11   23:aload_0         
    //   12   24:aload_1         
    //   13   25:aload_2         
    //   14   26:invokespecial   #597 <Method void Utilities$3(Context, Bitmap, ProgressDialog)>
    //   15   29:invokespecial   #574 <Method void Thread(Runnable)>
    //   16   32:invokevirtual   #577 <Method void Thread.start()>
    //   17   35:return          
    // catch Exception
    //   18   36:astore_3        
    //   19   37:aload_3         
    //   20   38:invokevirtual   #598 <Method void Exception.printStackTrace()>
    //   21   41:goto            15
    }

    public static void updateLists(Context context)
        throws IOException
    {
    //    0    0:iconst_0        
    //    1    1:putstatic       #602 <Field boolean Settings.dataUpToDate>
    //    2    4:new             #604 <Class ArrayList>
    //    3    7:dup             
    //    4    8:invokespecial   #605 <Method void ArrayList()>
    //    5   11:putstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //    6   14:new             #604 <Class ArrayList>
    //    7   17:dup             
    //    8   18:invokespecial   #605 <Method void ArrayList()>
    //    9   21:putstatic       #614 <Field ArrayList StylingActivity.backgroundsList>
    //   10   24:new             #604 <Class ArrayList>
    //   11   27:dup             
    //   12   28:invokespecial   #605 <Method void ArrayList()>
    //   13   31:putstatic       #617 <Field ArrayList StylingActivity.stickersList>
    //   14   34:new             #604 <Class ArrayList>
    //   15   37:dup             
    //   16   38:invokespecial   #605 <Method void ArrayList()>
    //   17   41:putstatic       #620 <Field ArrayList StylingActivity.framesList>
    //   18   44:new             #604 <Class ArrayList>
    //   19   47:dup             
    //   20   48:invokespecial   #605 <Method void ArrayList()>
    //   21   51:putstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //   22   54:new             #604 <Class ArrayList>
    //   23   57:dup             
    //   24   58:invokespecial   #605 <Method void ArrayList()>
    //   25   61:putstatic       #626 <Field ArrayList StylingActivity.fontsList>
    //   26   64:new             #604 <Class ArrayList>
    //   27   67:dup             
    //   28   68:invokespecial   #605 <Method void ArrayList()>
    //   29   71:putstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //   30   74:new             #604 <Class ArrayList>
    //   31   77:dup             
    //   32   78:invokespecial   #605 <Method void ArrayList()>
    //   33   81:putstatic       #632 <Field ArrayList StylingActivity.shadowColorsList>
    // try 84 127 handler(s) 1112
    //   34   84:aload_0         
    //   35   85:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //   36   88:ldc2            #634 <String "templates">
    //   37   91:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //   38   94:astore          92
    //   39   96:getstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //   40   99:ldc2            #389 <String "[custom]">
    //   41  102:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //   42  105:pop             
    //   43  106:getstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //   44  109:ldc2            #391 <String "[custom_color]">
    //   45  112:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //   46  115:pop             
    //   47  116:aload           92
    //   48  118:arraylength     
    //   49  119:ifle            133
    //   50  122:aload           92
    //   51  124:arraylength     
    //   52  125:istore          125
    //   53  127:iconst_0        
    //   54  128:istore          126
    //   55  130:goto            2415
    // try 133 160 handler(s) 1112
    //   56  133:aload_0         
    //   57  134:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //   58  137:ldc2            #644 <String "backgrounds">
    //   59  140:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //   60  143:astore          95
    //   61  145:getstatic       #614 <Field ArrayList StylingActivity.backgroundsList>
    //   62  148:ldc2            #389 <String "[custom]">
    //   63  151:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //   64  154:pop             
    //   65  155:aload           95
    //   66  157:arraylength     
    //   67  158:istore          97
    //   68  160:iconst_0        
    //   69  161:istore          98
    //   70  163:iload           98
    //   71  165:iload           97
    //   72  167:icmplt          826
    // try 170 197 handler(s) 1112
    //   73  170:aload_0         
    //   74  171:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //   75  174:ldc2            #646 <String "stickers">
    //   76  177:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //   77  180:astore          99
    //   78  182:getstatic       #617 <Field ArrayList StylingActivity.stickersList>
    //   79  185:ldc2            #389 <String "[custom]">
    //   80  188:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //   81  191:pop             
    //   82  192:aload           99
    //   83  194:arraylength     
    //   84  195:istore          101
    //   85  197:iconst_0        
    //   86  198:istore          102
    //   87  200:iload           102
    //   88  202:iload           101
    //   89  204:icmplt          878
    // try 207 234 handler(s) 1112
    //   90  207:aload_0         
    //   91  208:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //   92  211:ldc2            #648 <String "frames">
    //   93  214:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //   94  217:astore          103
    //   95  219:getstatic       #620 <Field ArrayList StylingActivity.framesList>
    //   96  222:ldc2            #650 <String "[none]">
    //   97  225:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //   98  228:pop             
    //   99  229:aload           103
    //  100  231:arraylength     
    //  101  232:istore          105
    //  102  234:iconst_0        
    //  103  235:istore          106
    //  104  237:iload           106
    //  105  239:iload           105
    //  106  241:icmplt          930
    // try 244 281 handler(s) 1112
    //  107  244:aload_0         
    //  108  245:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //  109  248:ldc2            #652 <String "filters">
    //  110  251:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //  111  254:astore          107
    //  112  256:getstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //  113  259:ldc2            #650 <String "[none]">
    //  114  262:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  115  265:pop             
    //  116  266:getstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //  117  269:ldc2            #389 <String "[custom]">
    //  118  272:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  119  275:pop             
    //  120  276:aload           107
    //  121  278:arraylength     
    //  122  279:istore          110
    //  123  281:iconst_0        
    //  124  282:istore          111
    //  125  284:iload           111
    //  126  286:iload           110
    //  127  288:icmplt          982
    // try 291 308 handler(s) 1112
    //  128  291:aload_0         
    //  129  292:invokevirtual   #387 <Method AssetManager Context.getAssets()>
    //  130  295:ldc2            #654 <String "fonts">
    //  131  298:invokevirtual   #638 <Method String[] AssetManager.list(String)>
    //  132  301:astore          112
    //  133  303:aload           112
    //  134  305:arraylength     
    //  135  306:istore          113
    //  136  308:iconst_0        
    //  137  309:istore          114
    //  138  311:iload           114
    //  139  313:iload           113
    //  140  315:icmplt          1034
    // try 318 349 handler(s) 2182
    //  141  318:getstatic       #658 <Field File Settings.sdCardFolder>
    //  142  321:astore          40
    //  143  323:aload           40
    //  144  325:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  145  328:ifeq            359
    //  146  331:aload           40
    //  147  333:invokevirtual   #664 <Method String[] File.list()>
    //  148  336:astore          41
    //  149  338:aload           41
    //  150  340:arraylength     
    //  151  341:ifle            359
    //  152  344:aload           41
    //  153  346:arraylength     
    //  154  347:istore          42
    //  155  349:iconst_0        
    //  156  350:istore          43
    //  157  352:iload           43
    //  158  354:iload           42
    //  159  356:icmplt          1143
    //  160  359:getstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //  161  362:ldc2            #666 <String "[get_more]">
    //  162  365:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  163  368:pop             
    //  164  369:getstatic       #617 <Field ArrayList StylingActivity.stickersList>
    //  165  372:ldc2            #666 <String "[get_more]">
    //  166  375:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  167  378:pop             
    //  168  379:getstatic       #626 <Field ArrayList StylingActivity.fontsList>
    //  169  382:ldc2            #666 <String "[get_more]">
    //  170  385:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  171  388:pop             
    //  172  389:getstatic       #614 <Field ArrayList StylingActivity.backgroundsList>
    //  173  392:ldc2            #666 <String "[get_more]">
    //  174  395:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  175  398:pop             
    //  176  399:getstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //  177  402:ldc2            #666 <String "[get_more]">
    //  178  405:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  179  408:pop             
    //  180  409:getstatic       #620 <Field ArrayList StylingActivity.framesList>
    //  181  412:ldc2            #666 <String "[get_more]">
    //  182  415:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  183  418:pop             
    //  184  419:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //  185  422:invokevirtual   #669 <Method void ArrayList.clear()>
    //  186  425:bipush          16
    //  187  427:anewarray       String[]
    //  188  430:dup             
    //  189  431:iconst_0        
    //  190  432:ldc2            #671 <String "#000000">
    //  191  435:aastore         
    //  192  436:dup             
    //  193  437:iconst_1        
    //  194  438:ldc2            #673 <String "#808080">
    //  195  441:aastore         
    //  196  442:dup             
    //  197  443:iconst_2        
    //  198  444:ldc2            #675 <String "#C0C0C0">
    //  199  447:aastore         
    //  200  448:dup             
    //  201  449:iconst_3        
    //  202  450:ldc2            #677 <String "#FFFFFF">
    //  203  453:aastore         
    //  204  454:dup             
    //  205  455:iconst_4        
    //  206  456:ldc2            #679 <String "#800000">
    //  207  459:aastore         
    //  208  460:dup             
    //  209  461:iconst_5        
    //  210  462:ldc2            #681 <String "#FF0000">
    //  211  465:aastore         
    //  212  466:dup             
    //  213  467:bipush          6
    //  214  469:ldc2            #683 <String "#800080">
    //  215  472:aastore         
    //  216  473:dup             
    //  217  474:bipush          7
    //  218  476:ldc2            #685 <String "#FF00FF">
    //  219  479:aastore         
    //  220  480:dup             
    //  221  481:bipush          8
    //  222  483:ldc2            #687 <String "#008000">
    //  223  486:aastore         
    //  224  487:dup             
    //  225  488:bipush          9
    //  226  490:ldc2            #689 <String "#00FF00">
    //  227  493:aastore         
    //  228  494:dup             
    //  229  495:bipush          10
    //  230  497:ldc2            #691 <String "#808000">
    //  231  500:aastore         
    //  232  501:dup             
    //  233  502:bipush          11
    //  234  504:ldc2            #693 <String "#FFFF00">
    //  235  507:aastore         
    //  236  508:dup             
    //  237  509:bipush          12
    //  238  511:ldc2            #695 <String "#000080">
    //  239  514:aastore         
    //  240  515:dup             
    //  241  516:bipush          13
    //  242  518:ldc2            #697 <String "#0000FF">
    //  243  521:aastore         
    //  244  522:dup             
    //  245  523:bipush          14
    //  246  525:ldc2            #699 <String "#008080">
    //  247  528:aastore         
    //  248  529:dup             
    //  249  530:bipush          15
    //  250  532:ldc2            #701 <String "#00FFFF">
    //  251  535:aastore         
    //  252  536:astore          11
    //  253  538:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //  254  541:ldc2            #391 <String "[custom_color]">
    //  255  544:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  256  547:pop             
    //  257  548:aload           11
    //  258  550:arraylength     
    //  259  551:istore          13
    //  260  553:iconst_0        
    //  261  554:istore          14
    //  262  556:iload           14
    //  263  558:iload           13
    //  264  560:icmplt          2213
    //  265  563:aload           11
    //  266  565:arraylength     
    //  267  566:istore          17
    //  268  568:iconst_0        
    //  269  569:istore          18
    //  270  571:iload           18
    //  271  573:iload           17
    //  272  575:icmplt          2235
    //  273  578:aload           11
    //  274  580:arraylength     
    //  275  581:istore          21
    //  276  583:iconst_0        
    //  277  584:istore          22
    //  278  586:iload           22
    //  279  588:iload           21
    //  280  590:icmplt          2276
    //  281  593:aload           11
    //  282  595:arraylength     
    //  283  596:istore          25
    //  284  598:iconst_0        
    //  285  599:istore          26
    //  286  601:iload           26
    //  287  603:iload           25
    //  288  605:icmplt          2317
    //  289  608:aload           11
    //  290  610:arraylength     
    //  291  611:istore          29
    //  292  613:iconst_0        
    //  293  614:istore          30
    //  294  616:iload           30
    //  295  618:iload           29
    //  296  620:icmplt          2355
    //  297  623:getstatic       #632 <Field ArrayList StylingActivity.shadowColorsList>
    //  298  626:invokevirtual   #669 <Method void ArrayList.clear()>
    //  299  629:getstatic       #632 <Field ArrayList StylingActivity.shadowColorsList>
    //  300  632:ldc2            #650 <String "[none]">
    //  301  635:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  302  638:pop             
    //  303  639:getstatic       #632 <Field ArrayList StylingActivity.shadowColorsList>
    //  304  642:ldc2            #391 <String "[custom_color]">
    //  305  645:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  306  648:pop             
    //  307  649:bipush          16
    //  308  651:anewarray       String[]
    //  309  654:dup             
    //  310  655:iconst_0        
    //  311  656:ldc2            #671 <String "#000000">
    //  312  659:aastore         
    //  313  660:dup             
    //  314  661:iconst_1        
    //  315  662:ldc2            #673 <String "#808080">
    //  316  665:aastore         
    //  317  666:dup             
    //  318  667:iconst_2        
    //  319  668:ldc2            #675 <String "#C0C0C0">
    //  320  671:aastore         
    //  321  672:dup             
    //  322  673:iconst_3        
    //  323  674:ldc2            #677 <String "#FFFFFF">
    //  324  677:aastore         
    //  325  678:dup             
    //  326  679:iconst_4        
    //  327  680:ldc2            #679 <String "#800000">
    //  328  683:aastore         
    //  329  684:dup             
    //  330  685:iconst_5        
    //  331  686:ldc2            #681 <String "#FF0000">
    //  332  689:aastore         
    //  333  690:dup             
    //  334  691:bipush          6
    //  335  693:ldc2            #683 <String "#800080">
    //  336  696:aastore         
    //  337  697:dup             
    //  338  698:bipush          7
    //  339  700:ldc2            #685 <String "#FF00FF">
    //  340  703:aastore         
    //  341  704:dup             
    //  342  705:bipush          8
    //  343  707:ldc2            #687 <String "#008000">
    //  344  710:aastore         
    //  345  711:dup             
    //  346  712:bipush          9
    //  347  714:ldc2            #689 <String "#00FF00">
    //  348  717:aastore         
    //  349  718:dup             
    //  350  719:bipush          10
    //  351  721:ldc2            #691 <String "#808000">
    //  352  724:aastore         
    //  353  725:dup             
    //  354  726:bipush          11
    //  355  728:ldc2            #693 <String "#FFFF00">
    //  356  731:aastore         
    //  357  732:dup             
    //  358  733:bipush          12
    //  359  735:ldc2            #695 <String "#000080">
    //  360  738:aastore         
    //  361  739:dup             
    //  362  740:bipush          13
    //  363  742:ldc2            #697 <String "#0000FF">
    //  364  745:aastore         
    //  365  746:dup             
    //  366  747:bipush          14
    //  367  749:ldc2            #699 <String "#008080">
    //  368  752:aastore         
    //  369  753:dup             
    //  370  754:bipush          15
    //  371  756:ldc2            #701 <String "#00FFFF">
    //  372  759:aastore         
    //  373  760:astore          35
    //  374  762:aload           35
    //  375  764:arraylength     
    //  376  765:istore          36
    //  377  767:iconst_0        
    //  378  768:istore          37
    //  379  770:iload           37
    //  380  772:iload           36
    //  381  774:icmplt          2393
    //  382  777:iconst_1        
    //  383  778:putstatic       #602 <Field boolean Settings.dataUpToDate>
    //  384  781:return          
    // try 782 820 handler(s) 1112
    //  385  782:aload           92
    //  386  784:iload           126
    //  387  786:aaload          
    //  388  787:astore          127
    //  389  789:getstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //  390  792:new             #44  <Class StringBuilder>
    //  391  795:dup             
    //  392  796:ldc2            #703 <String "[assets]/templates">
    //  393  799:invokespecial   #55  <Method void StringBuilder(String)>
    //  394  802:getstatic       #257 <Field String File.separator>
    //  395  805:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  396  808:aload           127
    //  397  810:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  398  813:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  399  816:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  400  819:pop             
    //  401  820:iinc            126  1
    //  402  823:goto            2415
    // try 826 875 handler(s) 1112
    //  403  826:aload           95
    //  404  828:iload           98
    //  405  830:aaload          
    //  406  831:astore          123
    //  407  833:aload           123
    //  408  835:ldc2            #705 <String ".thumb">
    //  409  838:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  410  841:ifne            2425
    //  411  844:getstatic       #614 <Field ArrayList StylingActivity.backgroundsList>
    //  412  847:new             #44  <Class StringBuilder>
    //  413  850:dup             
    //  414  851:ldc2            #707 <String "[assets]/backgrounds">
    //  415  854:invokespecial   #55  <Method void StringBuilder(String)>
    //  416  857:getstatic       #257 <Field String File.separator>
    //  417  860:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  418  863:aload           123
    //  419  865:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  420  868:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  421  871:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  422  874:pop             
    //  423  875:goto            2425
    // try 878 927 handler(s) 1112
    //  424  878:aload           99
    //  425  880:iload           102
    //  426  882:aaload          
    //  427  883:astore          121
    //  428  885:aload           121
    //  429  887:ldc2            #705 <String ".thumb">
    //  430  890:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  431  893:ifne            2431
    //  432  896:getstatic       #617 <Field ArrayList StylingActivity.stickersList>
    //  433  899:new             #44  <Class StringBuilder>
    //  434  902:dup             
    //  435  903:ldc2            #709 <String "[assets]/stickers">
    //  436  906:invokespecial   #55  <Method void StringBuilder(String)>
    //  437  909:getstatic       #257 <Field String File.separator>
    //  438  912:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  439  915:aload           121
    //  440  917:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  441  920:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  442  923:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  443  926:pop             
    //  444  927:goto            2431
    // try 930 979 handler(s) 1112
    //  445  930:aload           103
    //  446  932:iload           106
    //  447  934:aaload          
    //  448  935:astore          119
    //  449  937:aload           119
    //  450  939:ldc2            #705 <String ".thumb">
    //  451  942:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  452  945:ifne            2437
    //  453  948:getstatic       #620 <Field ArrayList StylingActivity.framesList>
    //  454  951:new             #44  <Class StringBuilder>
    //  455  954:dup             
    //  456  955:ldc2            #711 <String "[assets]/frames">
    //  457  958:invokespecial   #55  <Method void StringBuilder(String)>
    //  458  961:getstatic       #257 <Field String File.separator>
    //  459  964:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  460  967:aload           119
    //  461  969:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  462  972:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  463  975:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  464  978:pop             
    //  465  979:goto            2437
    // try 982 1031 handler(s) 1112
    //  466  982:aload           107
    //  467  984:iload           111
    //  468  986:aaload          
    //  469  987:astore          117
    //  470  989:aload           117
    //  471  991:ldc2            #705 <String ".thumb">
    //  472  994:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  473  997:ifne            2443
    //  474 1000:getstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //  475 1003:new             #44  <Class StringBuilder>
    //  476 1006:dup             
    //  477 1007:ldc2            #713 <String "[assets]/filters">
    //  478 1010:invokespecial   #55  <Method void StringBuilder(String)>
    //  479 1013:getstatic       #257 <Field String File.separator>
    //  480 1016:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  481 1019:aload           117
    //  482 1021:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  483 1024:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  484 1027:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  485 1030:pop             
    //  486 1031:goto            2443
    // try 1034 1106 handler(s) 1112
    //  487 1034:aload           112
    //  488 1036:iload           114
    //  489 1038:aaload          
    //  490 1039:astore          115
    //  491 1041:aload           115
    //  492 1043:ldc2            #715 <String ".ttf">
    //  493 1046:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  494 1049:ifeq            1106
    //  495 1052:aload           112
    //  496 1054:invokestatic    #721 <Method List Arrays.asList(Object[])>
    //  497 1057:aload           115
    //  498 1059:ldc2            #715 <String ".ttf">
    //  499 1062:ldc1            #184 <String ".jpg">
    //  500 1064:invokevirtual   #226 <Method String String.replace(CharSequence, CharSequence)>
    //  501 1067:invokeinterface #725 <Method boolean List.contains(Object)>
    //  502 1072:ifeq            1106
    //  503 1075:getstatic       #626 <Field ArrayList StylingActivity.fontsList>
    //  504 1078:new             #44  <Class StringBuilder>
    //  505 1081:dup             
    //  506 1082:ldc2            #727 <String "[assets]/fonts">
    //  507 1085:invokespecial   #55  <Method void StringBuilder(String)>
    //  508 1088:getstatic       #257 <Field String File.separator>
    //  509 1091:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  510 1094:aload           115
    //  511 1096:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  512 1099:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  513 1102:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  514 1105:pop             
    //  515 1106:iinc            114  1
    //  516 1109:goto            311
    // catch Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception
    //  517 1112:astore_1        
    //  518 1113:getstatic       #12  <Field String TAG>
    //  519 1116:new             #44  <Class StringBuilder>
    //  520 1119:dup             
    //  521 1120:ldc2            #729 <String "in updateLists() - > From assets: ">
    //  522 1123:invokespecial   #55  <Method void StringBuilder(String)>
    //  523 1126:aload_1         
    //  524 1127:invokevirtual   #234 <Method String Exception.toString()>
    //  525 1130:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  526 1133:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  527 1136:invokestatic    #240 <Method int Log.e(String, String)>
    //  528 1139:pop             
    //  529 1140:goto            318
    // try 1143 1214 handler(s) 2182
    //  530 1143:aload           41
    //  531 1145:iload           43
    //  532 1147:aaload          
    //  533 1148:astore          44
    //  534 1150:new             #186 <Class File>
    //  535 1153:dup             
    //  536 1154:new             #44  <Class StringBuilder>
    //  537 1157:dup             
    //  538 1158:getstatic       #251 <Field String Settings.sdCardPath>
    //  539 1161:invokestatic    #254 <Method String String.valueOf(Object)>
    //  540 1164:invokespecial   #55  <Method void StringBuilder(String)>
    //  541 1167:getstatic       #257 <Field String File.separator>
    //  542 1170:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  543 1173:aload           44
    //  544 1175:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  545 1178:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  546 1181:invokespecial   #416 <Method void File(String)>
    //  547 1184:astore          45
    //  548 1186:aload           40
    //  549 1188:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  550 1191:ifeq            2456
    //  551 1194:aload           45
    //  552 1196:invokevirtual   #664 <Method String[] File.list()>
    //  553 1199:ifnull          2456
    //  554 1202:aload           45
    //  555 1204:invokevirtual   #664 <Method String[] File.list()>
    //  556 1207:astore          46
    //  557 1209:aload           46
    //  558 1211:arraylength     
    //  559 1212:istore          47
    //  560 1214:iconst_0        
    //  561 1215:istore          48
    //  562 1217:goto            2449
    // try 1220 1309 handler(s) 2182
    //  563 1220:aload           46
    //  564 1222:iload           48
    //  565 1224:aaload          
    //  566 1225:astore          49
    //  567 1227:aload           49
    //  568 1229:ldc2            #634 <String "templates">
    //  569 1232:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  570 1235:ifeq            1374
    //  571 1238:new             #44  <Class StringBuilder>
    //  572 1241:dup             
    //  573 1242:getstatic       #251 <Field String Settings.sdCardPath>
    //  574 1245:invokestatic    #254 <Method String String.valueOf(Object)>
    //  575 1248:invokespecial   #55  <Method void StringBuilder(String)>
    //  576 1251:astore          50
    //  577 1253:new             #186 <Class File>
    //  578 1256:dup             
    //  579 1257:aload           50
    //  580 1259:getstatic       #257 <Field String File.separator>
    //  581 1262:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  582 1265:aload           44
    //  583 1267:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  584 1270:getstatic       #257 <Field String File.separator>
    //  585 1273:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  586 1276:aload           49
    //  587 1278:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  588 1281:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  589 1284:invokespecial   #416 <Method void File(String)>
    //  590 1287:astore          51
    //  591 1289:aload           51
    //  592 1291:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  593 1294:ifeq            2469
    //  594 1297:aload           51
    //  595 1299:invokevirtual   #664 <Method String[] File.list()>
    //  596 1302:astore          52
    //  597 1304:aload           52
    //  598 1306:arraylength     
    //  599 1307:istore          53
    //  600 1309:iconst_0        
    //  601 1310:istore          54
    //  602 1312:goto            2462
    // try 1315 1368 handler(s) 2182
    //  603 1315:aload           52
    //  604 1317:iload           54
    //  605 1319:aaload          
    //  606 1320:astore          55
    //  607 1322:getstatic       #611 <Field ArrayList StylingActivity.templatesList>
    //  608 1325:new             #44  <Class StringBuilder>
    //  609 1328:dup             
    //  610 1329:ldc1            #246 <String "[sdcard]/">
    //  611 1331:invokespecial   #55  <Method void StringBuilder(String)>
    //  612 1334:aload           44
    //  613 1336:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  614 1339:getstatic       #257 <Field String File.separator>
    //  615 1342:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  616 1345:aload           49
    //  617 1347:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  618 1350:getstatic       #257 <Field String File.separator>
    //  619 1353:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  620 1356:aload           55
    //  621 1358:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  622 1361:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  623 1364:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  624 1367:pop             
    //  625 1368:iinc            54  1
    //  626 1371:goto            2462
    // try 1374 1457 handler(s) 2182
    //  627 1374:aload           49
    //  628 1376:ldc2            #644 <String "backgrounds">
    //  629 1379:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  630 1382:ifeq            1535
    //  631 1385:new             #44  <Class StringBuilder>
    //  632 1388:dup             
    //  633 1389:getstatic       #251 <Field String Settings.sdCardPath>
    //  634 1392:invokestatic    #254 <Method String String.valueOf(Object)>
    //  635 1395:invokespecial   #55  <Method void StringBuilder(String)>
    //  636 1398:astore          57
    //  637 1400:new             #186 <Class File>
    //  638 1403:dup             
    //  639 1404:aload           57
    //  640 1406:getstatic       #257 <Field String File.separator>
    //  641 1409:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  642 1412:aload           44
    //  643 1414:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  644 1417:getstatic       #257 <Field String File.separator>
    //  645 1420:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  646 1423:ldc2            #644 <String "backgrounds">
    //  647 1426:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  648 1429:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  649 1432:invokespecial   #416 <Method void File(String)>
    //  650 1435:astore          58
    //  651 1437:aload           58
    //  652 1439:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  653 1442:ifeq            2469
    //  654 1445:aload           58
    //  655 1447:invokevirtual   #664 <Method String[] File.list()>
    //  656 1450:astore          59
    //  657 1452:aload           59
    //  658 1454:arraylength     
    //  659 1455:istore          60
    //  660 1457:iconst_0        
    //  661 1458:istore          61
    //  662 1460:iload           61
    //  663 1462:iload           60
    //  664 1464:icmpge          2469
    // try 1467 1532 handler(s) 2182
    //  665 1467:aload           59
    //  666 1469:iload           61
    //  667 1471:aaload          
    //  668 1472:astore          62
    //  669 1474:aload           62
    //  670 1476:ldc2            #705 <String ".thumb">
    //  671 1479:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  672 1482:ifne            2475
    //  673 1485:getstatic       #614 <Field ArrayList StylingActivity.backgroundsList>
    //  674 1488:new             #44  <Class StringBuilder>
    //  675 1491:dup             
    //  676 1492:ldc1            #246 <String "[sdcard]/">
    //  677 1494:invokespecial   #55  <Method void StringBuilder(String)>
    //  678 1497:aload           44
    //  679 1499:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  680 1502:getstatic       #257 <Field String File.separator>
    //  681 1505:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  682 1508:ldc2            #644 <String "backgrounds">
    //  683 1511:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  684 1514:getstatic       #257 <Field String File.separator>
    //  685 1517:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  686 1520:aload           62
    //  687 1522:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  688 1525:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  689 1528:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  690 1531:pop             
    //  691 1532:goto            2475
    // try 1535 1618 handler(s) 2182
    //  692 1535:aload           49
    //  693 1537:ldc2            #646 <String "stickers">
    //  694 1540:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  695 1543:ifeq            1696
    //  696 1546:new             #44  <Class StringBuilder>
    //  697 1549:dup             
    //  698 1550:getstatic       #251 <Field String Settings.sdCardPath>
    //  699 1553:invokestatic    #254 <Method String String.valueOf(Object)>
    //  700 1556:invokespecial   #55  <Method void StringBuilder(String)>
    //  701 1559:astore          64
    //  702 1561:new             #186 <Class File>
    //  703 1564:dup             
    //  704 1565:aload           64
    //  705 1567:getstatic       #257 <Field String File.separator>
    //  706 1570:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  707 1573:aload           44
    //  708 1575:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  709 1578:getstatic       #257 <Field String File.separator>
    //  710 1581:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  711 1584:ldc2            #646 <String "stickers">
    //  712 1587:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  713 1590:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  714 1593:invokespecial   #416 <Method void File(String)>
    //  715 1596:astore          65
    //  716 1598:aload           65
    //  717 1600:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  718 1603:ifeq            2469
    //  719 1606:aload           65
    //  720 1608:invokevirtual   #664 <Method String[] File.list()>
    //  721 1611:astore          66
    //  722 1613:aload           66
    //  723 1615:arraylength     
    //  724 1616:istore          67
    //  725 1618:iconst_0        
    //  726 1619:istore          68
    //  727 1621:iload           68
    //  728 1623:iload           67
    //  729 1625:icmpge          2469
    // try 1628 1693 handler(s) 2182
    //  730 1628:aload           66
    //  731 1630:iload           68
    //  732 1632:aaload          
    //  733 1633:astore          69
    //  734 1635:aload           69
    //  735 1637:ldc2            #705 <String ".thumb">
    //  736 1640:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  737 1643:ifne            2481
    //  738 1646:getstatic       #617 <Field ArrayList StylingActivity.stickersList>
    //  739 1649:new             #44  <Class StringBuilder>
    //  740 1652:dup             
    //  741 1653:ldc1            #246 <String "[sdcard]/">
    //  742 1655:invokespecial   #55  <Method void StringBuilder(String)>
    //  743 1658:aload           44
    //  744 1660:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  745 1663:getstatic       #257 <Field String File.separator>
    //  746 1666:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  747 1669:ldc2            #646 <String "stickers">
    //  748 1672:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  749 1675:getstatic       #257 <Field String File.separator>
    //  750 1678:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  751 1681:aload           69
    //  752 1683:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  753 1686:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  754 1689:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  755 1692:pop             
    //  756 1693:goto            2481
    // try 1696 1779 handler(s) 2182
    //  757 1696:aload           49
    //  758 1698:ldc2            #648 <String "frames">
    //  759 1701:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  760 1704:ifeq            1857
    //  761 1707:new             #44  <Class StringBuilder>
    //  762 1710:dup             
    //  763 1711:getstatic       #251 <Field String Settings.sdCardPath>
    //  764 1714:invokestatic    #254 <Method String String.valueOf(Object)>
    //  765 1717:invokespecial   #55  <Method void StringBuilder(String)>
    //  766 1720:astore          71
    //  767 1722:new             #186 <Class File>
    //  768 1725:dup             
    //  769 1726:aload           71
    //  770 1728:getstatic       #257 <Field String File.separator>
    //  771 1731:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  772 1734:aload           44
    //  773 1736:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  774 1739:getstatic       #257 <Field String File.separator>
    //  775 1742:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  776 1745:ldc2            #648 <String "frames">
    //  777 1748:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  778 1751:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  779 1754:invokespecial   #416 <Method void File(String)>
    //  780 1757:astore          72
    //  781 1759:aload           72
    //  782 1761:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  783 1764:ifeq            2469
    //  784 1767:aload           72
    //  785 1769:invokevirtual   #664 <Method String[] File.list()>
    //  786 1772:astore          73
    //  787 1774:aload           73
    //  788 1776:arraylength     
    //  789 1777:istore          74
    //  790 1779:iconst_0        
    //  791 1780:istore          75
    //  792 1782:iload           75
    //  793 1784:iload           74
    //  794 1786:icmpge          2469
    // try 1789 1854 handler(s) 2182
    //  795 1789:aload           73
    //  796 1791:iload           75
    //  797 1793:aaload          
    //  798 1794:astore          76
    //  799 1796:aload           76
    //  800 1798:ldc2            #705 <String ".thumb">
    //  801 1801:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  802 1804:ifne            2487
    //  803 1807:getstatic       #620 <Field ArrayList StylingActivity.framesList>
    //  804 1810:new             #44  <Class StringBuilder>
    //  805 1813:dup             
    //  806 1814:ldc1            #246 <String "[sdcard]/">
    //  807 1816:invokespecial   #55  <Method void StringBuilder(String)>
    //  808 1819:aload           44
    //  809 1821:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  810 1824:getstatic       #257 <Field String File.separator>
    //  811 1827:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  812 1830:ldc2            #648 <String "frames">
    //  813 1833:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  814 1836:getstatic       #257 <Field String File.separator>
    //  815 1839:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  816 1842:aload           76
    //  817 1844:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  818 1847:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  819 1850:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  820 1853:pop             
    //  821 1854:goto            2487
    // try 1857 1940 handler(s) 2182
    //  822 1857:aload           49
    //  823 1859:ldc2            #652 <String "filters">
    //  824 1862:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  825 1865:ifeq            2018
    //  826 1868:new             #44  <Class StringBuilder>
    //  827 1871:dup             
    //  828 1872:getstatic       #251 <Field String Settings.sdCardPath>
    //  829 1875:invokestatic    #254 <Method String String.valueOf(Object)>
    //  830 1878:invokespecial   #55  <Method void StringBuilder(String)>
    //  831 1881:astore          78
    //  832 1883:new             #186 <Class File>
    //  833 1886:dup             
    //  834 1887:aload           78
    //  835 1889:getstatic       #257 <Field String File.separator>
    //  836 1892:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  837 1895:aload           44
    //  838 1897:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  839 1900:getstatic       #257 <Field String File.separator>
    //  840 1903:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  841 1906:ldc2            #652 <String "filters">
    //  842 1909:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  843 1912:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  844 1915:invokespecial   #416 <Method void File(String)>
    //  845 1918:astore          79
    //  846 1920:aload           79
    //  847 1922:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  848 1925:ifeq            2469
    //  849 1928:aload           79
    //  850 1930:invokevirtual   #664 <Method String[] File.list()>
    //  851 1933:astore          80
    //  852 1935:aload           80
    //  853 1937:arraylength     
    //  854 1938:istore          81
    //  855 1940:iconst_0        
    //  856 1941:istore          82
    //  857 1943:iload           82
    //  858 1945:iload           81
    //  859 1947:icmpge          2469
    // try 1950 2015 handler(s) 2182
    //  860 1950:aload           80
    //  861 1952:iload           82
    //  862 1954:aaload          
    //  863 1955:astore          83
    //  864 1957:aload           83
    //  865 1959:ldc2            #705 <String ".thumb">
    //  866 1962:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  867 1965:ifne            2493
    //  868 1968:getstatic       #623 <Field ArrayList StylingActivity.filtersList>
    //  869 1971:new             #44  <Class StringBuilder>
    //  870 1974:dup             
    //  871 1975:ldc1            #246 <String "[sdcard]/">
    //  872 1977:invokespecial   #55  <Method void StringBuilder(String)>
    //  873 1980:aload           44
    //  874 1982:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  875 1985:getstatic       #257 <Field String File.separator>
    //  876 1988:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  877 1991:ldc2            #652 <String "filters">
    //  878 1994:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  879 1997:getstatic       #257 <Field String File.separator>
    //  880 2000:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  881 2003:aload           83
    //  882 2005:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  883 2008:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  884 2011:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  885 2014:pop             
    //  886 2015:goto            2493
    // try 2018 2101 handler(s) 2182
    //  887 2018:aload           49
    //  888 2020:ldc2            #654 <String "fonts">
    //  889 2023:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  890 2026:ifeq            2469
    //  891 2029:new             #44  <Class StringBuilder>
    //  892 2032:dup             
    //  893 2033:getstatic       #251 <Field String Settings.sdCardPath>
    //  894 2036:invokestatic    #254 <Method String String.valueOf(Object)>
    //  895 2039:invokespecial   #55  <Method void StringBuilder(String)>
    //  896 2042:astore          85
    //  897 2044:new             #186 <Class File>
    //  898 2047:dup             
    //  899 2048:aload           85
    //  900 2050:getstatic       #257 <Field String File.separator>
    //  901 2053:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  902 2056:aload           44
    //  903 2058:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  904 2061:getstatic       #257 <Field String File.separator>
    //  905 2064:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  906 2067:ldc2            #654 <String "fonts">
    //  907 2070:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  908 2073:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  909 2076:invokespecial   #416 <Method void File(String)>
    //  910 2079:astore          86
    //  911 2081:aload           86
    //  912 2083:invokevirtual   #661 <Method boolean File.isDirectory()>
    //  913 2086:ifeq            2469
    //  914 2089:aload           86
    //  915 2091:invokevirtual   #664 <Method String[] File.list()>
    //  916 2094:astore          87
    //  917 2096:aload           87
    //  918 2098:arraylength     
    //  919 2099:istore          88
    //  920 2101:iconst_0        
    //  921 2102:istore          89
    //  922 2104:iload           89
    //  923 2106:iload           88
    //  924 2108:icmpge          2469
    // try 2111 2176 handler(s) 2182
    //  925 2111:aload           87
    //  926 2113:iload           89
    //  927 2115:aaload          
    //  928 2116:astore          90
    //  929 2118:aload           90
    //  930 2120:ldc2            #715 <String ".ttf">
    //  931 2123:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
    //  932 2126:ifeq            2176
    //  933 2129:getstatic       #626 <Field ArrayList StylingActivity.fontsList>
    //  934 2132:new             #44  <Class StringBuilder>
    //  935 2135:dup             
    //  936 2136:ldc1            #246 <String "[sdcard]/">
    //  937 2138:invokespecial   #55  <Method void StringBuilder(String)>
    //  938 2141:aload           44
    //  939 2143:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  940 2146:getstatic       #257 <Field String File.separator>
    //  941 2149:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  942 2152:ldc2            #654 <String "fonts">
    //  943 2155:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  944 2158:getstatic       #257 <Field String File.separator>
    //  945 2161:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  946 2164:aload           90
    //  947 2166:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  948 2169:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  949 2172:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  950 2175:pop             
    //  951 2176:iinc            89  1
    //  952 2179:goto            2104
    // catch Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception Exception
    //  953 2182:astore_3        
    //  954 2183:getstatic       #12  <Field String TAG>
    //  955 2186:new             #44  <Class StringBuilder>
    //  956 2189:dup             
    //  957 2190:ldc2            #731 <String "in updateLists() -> From sdCard: ">
    //  958 2193:invokespecial   #55  <Method void StringBuilder(String)>
    //  959 2196:aload_3         
    //  960 2197:invokevirtual   #234 <Method String Exception.toString()>
    //  961 2200:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  962 2203:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  963 2206:invokestatic    #240 <Method int Log.e(String, String)>
    //  964 2209:pop             
    //  965 2210:goto            359
    //  966 2213:aload           11
    //  967 2215:iload           14
    //  968 2217:aaload          
    //  969 2218:astore          15
    //  970 2220:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //  971 2223:aload           15
    //  972 2225:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  973 2228:pop             
    //  974 2229:iinc            14  1
    //  975 2232:goto            556
    //  976 2235:aload           11
    //  977 2237:iload           18
    //  978 2239:aaload          
    //  979 2240:astore          19
    //  980 2242:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //  981 2245:new             #44  <Class StringBuilder>
    //  982 2248:dup             
    //  983 2249:aload           19
    //  984 2251:invokestatic    #254 <Method String String.valueOf(Object)>
    //  985 2254:invokespecial   #55  <Method void StringBuilder(String)>
    //  986 2257:ldc2            #733 <String ":#FFFFFF">
    //  987 2260:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    //  988 2263:invokevirtual   #74  <Method String StringBuilder.toString()>
    //  989 2266:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    //  990 2269:pop             
    //  991 2270:iinc            18  1
    //  992 2273:goto            571
    //  993 2276:aload           11
    //  994 2278:iload           22
    //  995 2280:aaload          
    //  996 2281:astore          23
    //  997 2283:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    //  998 2286:new             #44  <Class StringBuilder>
    //  999 2289:dup             
    // 1000 2290:aload           23
    // 1001 2292:invokestatic    #254 <Method String String.valueOf(Object)>
    // 1002 2295:invokespecial   #55  <Method void StringBuilder(String)>
    // 1003 2298:ldc2            #735 <String ":#000000">
    // 1004 2301:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    // 1005 2304:invokevirtual   #74  <Method String StringBuilder.toString()>
    // 1006 2307:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    // 1007 2310:pop             
    // 1008 2311:iinc            22  1
    // 1009 2314:goto            586
    // 1010 2317:aload           11
    // 1011 2319:iload           26
    // 1012 2321:aaload          
    // 1013 2322:astore          27
    // 1014 2324:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    // 1015 2327:new             #44  <Class StringBuilder>
    // 1016 2330:dup             
    // 1017 2331:ldc2            #737 <String "#FFFFFF:">
    // 1018 2334:invokespecial   #55  <Method void StringBuilder(String)>
    // 1019 2337:aload           27
    // 1020 2339:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    // 1021 2342:invokevirtual   #74  <Method String StringBuilder.toString()>
    // 1022 2345:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    // 1023 2348:pop             
    // 1024 2349:iinc            26  1
    // 1025 2352:goto            601
    // 1026 2355:aload           11
    // 1027 2357:iload           30
    // 1028 2359:aaload          
    // 1029 2360:astore          31
    // 1030 2362:getstatic       #629 <Field ArrayList StylingActivity.colorsList>
    // 1031 2365:new             #44  <Class StringBuilder>
    // 1032 2368:dup             
    // 1033 2369:ldc2            #739 <String "#000000:">
    // 1034 2372:invokespecial   #55  <Method void StringBuilder(String)>
    // 1035 2375:aload           31
    // 1036 2377:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
    // 1037 2380:invokevirtual   #74  <Method String StringBuilder.toString()>
    // 1038 2383:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    // 1039 2386:pop             
    // 1040 2387:iinc            30  1
    // 1041 2390:goto            616
    // 1042 2393:aload           35
    // 1043 2395:iload           37
    // 1044 2397:aaload          
    // 1045 2398:astore          38
    // 1046 2400:getstatic       #632 <Field ArrayList StylingActivity.shadowColorsList>
    // 1047 2403:aload           38
    // 1048 2405:invokevirtual   #642 <Method boolean ArrayList.add(Object)>
    // 1049 2408:pop             
    // 1050 2409:iinc            37  1
    // 1051 2412:goto            770
    // 1052 2415:iload           126
    // 1053 2417:iload           125
    // 1054 2419:icmplt          782
    // 1055 2422:goto            133
    // 1056 2425:iinc            98  1
    // 1057 2428:goto            163
    // 1058 2431:iinc            102  1
    // 1059 2434:goto            200
    // 1060 2437:iinc            106  1
    // 1061 2440:goto            237
    // 1062 2443:iinc            111  1
    // 1063 2446:goto            284
    // 1064 2449:iload           48
    // 1065 2451:iload           47
    // 1066 2453:icmplt          1220
    // 1067 2456:iinc            43  1
    // 1068 2459:goto            352
    // 1069 2462:iload           54
    // 1070 2464:iload           53
    // 1071 2466:icmplt          1315
    // 1072 2469:iinc            48  1
    // 1073 2472:goto            2449
    // 1074 2475:iinc            61  1
    // 1075 2478:goto            1460
    // 1076 2481:iinc            68  1
    // 1077 2484:goto            1621
    // 1078 2487:iinc            75  1
    // 1079 2490:goto            1782
    // 1080 2493:iinc            82  1
    // 1081 2496:goto            1943
    }

    public static String TAG;

    // Unreferenced inner class codeadore/textgram/Utilities$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field Bitmap val$bitMap>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field Context val$c>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field ProgressDialog val$loadingDialog>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:invokestatic    #37  <Method String Environment.getExternalStorageState()>
        //    1    3:ldc1            #39  <String "mounted">
        //    2    5:invokevirtual   #45  <Method boolean String.equals(Object)>
        //    3    8:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
        //    4   11:invokevirtual   #55  <Method boolean Boolean.booleanValue()>
        //    5   14:ifeq            244
        //    6   17:new             #57  <Class File>
        //    7   20:dup             
        //    8   21:new             #59  <Class StringBuilder>
        //    9   24:dup             
        //   10   25:invokespecial   #60  <Method void StringBuilder()>
        //   11   28:invokestatic    #64  <Method File Environment.getExternalStorageDirectory()>
        //   12   31:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
        //   13   34:getstatic       #72  <Field String File.separator>
        //   14   37:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   15   40:ldc1            #77  <String "textgram/">
        //   16   42:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   17   45:invokevirtual   #80  <Method String StringBuilder.toString()>
        //   18   48:invokespecial   #83  <Method void File(String)>
        //   19   51:astore_1        
        //   20   52:aload_1         
        //   21   53:invokevirtual   #86  <Method boolean File.mkdirs()>
        //   22   56:pop             
        //   23   57:new             #59  <Class StringBuilder>
        //   24   60:dup             
        //   25   61:ldc1            #88  <String "textgram_">
        //   26   63:invokespecial   #89  <Method void StringBuilder(String)>
        //   27   66:invokestatic    #95  <Method long System.currentTimeMillis()>
        //   28   69:ldc2w           #96  <Long 1000L>
        //   29   72:ldiv            
        //   30   73:invokevirtual   #100 <Method StringBuilder StringBuilder.append(long)>
        //   31   76:ldc1            #102 <String ".png">
        //   32   78:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   33   81:invokevirtual   #80  <Method String StringBuilder.toString()>
        //   34   84:astore_3        
        //   35   85:new             #57  <Class File>
        //   36   88:dup             
        //   37   89:aload_1         
        //   38   90:aload_3         
        //   39   91:invokespecial   #105 <Method void File(File, String)>
        //   40   94:astore          4
        // try 96 144 handler(s) 212
        //   41   96:new             #107 <Class FileOutputStream>
        //   42   99:dup             
        //   43  100:new             #59  <Class StringBuilder>
        //   44  103:dup             
        //   45  104:invokespecial   #60  <Method void StringBuilder()>
        //   46  107:aload_1         
        //   47  108:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
        //   48  111:getstatic       #72  <Field String File.separator>
        //   49  114:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   50  117:aload_3         
        //   51  118:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   52  121:invokevirtual   #80  <Method String StringBuilder.toString()>
        //   53  124:invokespecial   #108 <Method void FileOutputStream(String)>
        //   54  127:astore          5
        //   55  129:aload_0         
        //   56  130:getfield        #21  <Field Bitmap val$bitMap>
        //   57  133:getstatic       #114 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
        //   58  136:bipush          100
        //   59  138:aload           5
        //   60  140:invokevirtual   #120 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
        //   61  143:pop             
        //   62  144:new             #122 <Class ContentValues>
        //   63  147:dup             
        //   64  148:invokespecial   #123 <Method void ContentValues()>
        //   65  151:astore          8
        //   66  153:aload           8
        //   67  155:ldc1            #125 <String "_data">
        //   68  157:aload           4
        //   69  159:invokevirtual   #128 <Method String File.getAbsolutePath()>
        //   70  162:invokevirtual   #132 <Method void ContentValues.put(String, String)>
        //   71  165:aload           8
        //   72  167:ldc1            #134 <String "mime_type">
        //   73  169:ldc1            #136 <String "image/png">
        //   74  171:invokevirtual   #132 <Method void ContentValues.put(String, String)>
        //   75  174:aload_0         
        //   76  175:getfield        #23  <Field Context val$c>
        //   77  178:invokevirtual   #142 <Method ContentResolver Context.getContentResolver()>
        //   78  181:getstatic       #148 <Field Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
        //   79  184:aload           8
        //   80  186:invokevirtual   #154 <Method Uri ContentResolver.insert(Uri, ContentValues)>
        //   81  189:pop             
        //   82  190:getstatic       #160 <Field Handler ResultActivity.UIHandler>
        //   83  193:new             #162 <Class Utilities$1$1>
        //   84  196:dup             
        //   85  197:aload_0         
        //   86  198:aload_0         
        //   87  199:getfield        #25  <Field ProgressDialog val$loadingDialog>
        //   88  202:aload           4
        //   89  204:invokespecial   #165 <Method void Utilities$1$1(Utilities$1, ProgressDialog, File)>
        //   90  207:invokevirtual   #171 <Method boolean Handler.post(Runnable)>
        //   91  210:pop             
        //   92  211:return          
        // catch Exception
        //   93  212:astore          6
        //   94  214:getstatic       #174 <Field String Utilities.TAG>
        //   95  217:new             #59  <Class StringBuilder>
        //   96  220:dup             
        //   97  221:ldc1            #176 <String " in saveBitmap()-> bitMAp.compress: ">
        //   98  223:invokespecial   #89  <Method void StringBuilder(String)>
        //   99  226:aload           6
        //  100  228:invokevirtual   #177 <Method String Exception.toString()>
        //  101  231:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //  102  234:invokevirtual   #80  <Method String StringBuilder.toString()>
        //  103  237:invokestatic    #183 <Method int Log.e(String, String)>
        //  104  240:pop             
        //  105  241:goto            144
        //  106  244:getstatic       #174 <Field String Utilities.TAG>
        //  107  247:ldc1            #185 <String "No sd card found">
        //  108  249:invokestatic    #183 <Method int Log.e(String, String)>
        //  109  252:pop             
        //  110  253:getstatic       #160 <Field Handler ResultActivity.UIHandler>
        //  111  256:new             #187 <Class Utilities$1$2>
        //  112  259:dup             
        //  113  260:aload_0         
        //  114  261:aload_0         
        //  115  262:getfield        #25  <Field ProgressDialog val$loadingDialog>
        //  116  265:aload_0         
        //  117  266:getfield        #23  <Field Context val$c>
        //  118  269:invokespecial   #190 <Method void Utilities$1$2(Utilities$1, ProgressDialog, Context)>
        //  119  272:invokevirtual   #171 <Method boolean Handler.post(Runnable)>
        //  120  275:pop             
        //  121  276:return          
        }

        private final Bitmap val$bitMap;
        private final Context val$c;
        private final ProgressDialog val$loadingDialog;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field Utilities$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ProgressDialog val$loadingDialog>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field File val$final_file>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:new             #29  <Class android.app.AlertDialog$Builder>
        //    1    3:dup             
        //    2    4:getstatic       #35  <Field el7rActivity ResultActivity.c>
        //    3    7:invokespecial   #38  <Method void android.app.AlertDialog$Builder(Context)>
        //    4   10:invokevirtual   #42  <Method AlertDialog android.app.AlertDialog$Builder.create()>
        //    5   13:astore_1        
        //    6   14:aload_1         
        //    7   15:getstatic       #35  <Field el7rActivity ResultActivity.c>
        //    8   18:ldc1            #43  <Int 0x7f0b0034>
        //    9   20:invokevirtual   #49  <Method String el7rActivity.getString(int)>
        //   10   23:invokevirtual   #55  <Method void AlertDialog.setTitle(CharSequence)>
        //   11   26:aload_1         
        //   12   27:getstatic       #35  <Field el7rActivity ResultActivity.c>
        //   13   30:ldc1            #56  <Int 0x7f0b0035>
        //   14   32:invokevirtual   #49  <Method String el7rActivity.getString(int)>
        //   15   35:invokevirtual   #59  <Method void AlertDialog.setMessage(CharSequence)>
        //   16   38:aload_1         
        //   17   39:ldc1            #60  <Int 0x7f020082>
        //   18   41:invokevirtual   #64  <Method void AlertDialog.setIcon(int)>
        //   19   44:aload_1         
        //   20   45:getstatic       #35  <Field el7rActivity ResultActivity.c>
        //   21   48:ldc1            #65  <Int 0x7f0b0037>
        //   22   50:invokevirtual   #49  <Method String el7rActivity.getString(int)>
        //   23   53:new             #67  <Class Utilities$1$1$1>
        //   24   56:dup             
        //   25   57:aload_0         
        //   26   58:aload_0         
        //   27   59:getfield        #25  <Field File val$final_file>
        //   28   62:invokespecial   #70  <Method void Utilities$1$1$1(Utilities$1$1, File)>
        //   29   65:invokevirtual   #74  <Method void AlertDialog.setButton(CharSequence, android.content.DialogInterface$OnClickListener)>
        //   30   68:aload_1         
        //   31   69:getstatic       #35  <Field el7rActivity ResultActivity.c>
        //   32   72:ldc1            #75  <Int 0x7f0b0036>
        //   33   74:invokevirtual   #49  <Method String el7rActivity.getString(int)>
        //   34   77:new             #77  <Class Utilities$1$1$2>
        //   35   80:dup             
        //   36   81:aload_0         
        //   37   82:invokespecial   #80  <Method void Utilities$1$1$2(Utilities$1$1)>
        //   38   85:invokevirtual   #83  <Method void AlertDialog.setButton2(CharSequence, android.content.DialogInterface$OnClickListener)>
        //   39   88:aload_1         
        //   40   89:invokevirtual   #86  <Method void AlertDialog.show()>
        //   41   92:aload_0         
        //   42   93:getfield        #23  <Field ProgressDialog val$loadingDialog>
        //   43   96:invokevirtual   #91  <Method void ProgressDialog.hide()>
        //   44   99:return          
        }

        final _cls1 this$1;
        private final File val$final_file;
        private final ProgressDialog val$loadingDialog;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$1$1$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field Utilities$1$1 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field File val$final_file>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:new             #27  <Class Intent>
        //    1    3:dup             
        //    2    4:invokespecial   #28  <Method void Intent()>
        //    3    7:astore_3        
        //    4    8:aload_3         
        //    5    9:ldc1            #30  <String "android.intent.action.VIEW">
        //    6   11:invokevirtual   #34  <Method Intent Intent.setAction(String)>
        //    7   14:pop             
        //    8   15:aload_3         
        //    9   16:aload_0         
        //   10   17:getfield        #21  <Field File val$final_file>
        //   11   20:invokestatic    #40  <Method Uri Uri.fromFile(File)>
        //   12   23:ldc1            #42  <String "image/*">
        //   13   25:invokevirtual   #46  <Method Intent Intent.setDataAndType(Uri, String)>
        //   14   28:pop             
        //   15   29:getstatic       #52  <Field el7rActivity ResultActivity.c>
        //   16   32:aload_3         
        //   17   33:invokevirtual   #58  <Method void el7rActivity.startActivity(Intent)>
        //   18   36:return          
        }

        final _cls1 this$2;
        private final File val$final_file;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$1$1$2

/* anonymous class */
    class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field Utilities$1$1 this$2>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:return          
        }

        final _cls1 this$2;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$1$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field Utilities$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ProgressDialog val$loadingDialog>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field Context val$c>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field ProgressDialog val$loadingDialog>
        //    2    4:invokevirtual   #32  <Method void ProgressDialog.dismiss()>
        //    3    7:aload_0         
        //    4    8:getfield        #25  <Field Context val$c>
        //    5   11:aload_0         
        //    6   12:getfield        #25  <Field Context val$c>
        //    7   15:ldc1            #33  <Int 0x7f0b0038>
        //    8   17:invokevirtual   #39  <Method String Context.getString(int)>
        //    9   20:iconst_1        
        //   10   21:invokestatic    #45  <Method Toast Toast.makeText(Context, CharSequence, int)>
        //   11   24:invokevirtual   #48  <Method void Toast.show()>
        //   12   27:return          
        }

        final _cls1 this$1;
        private final Context val$c;
        private final ProgressDialog val$loadingDialog;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ProgressDialog val$loadingDialog>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ProgressDialog val$loadingDialog>
        //    2    4:invokevirtual   #26  <Method void ProgressDialog.show()>
        //    3    7:return          
        }

        private final ProgressDialog val$loadingDialog;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field Context val$c>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #22  <Field Bitmap val$bitMap>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #24  <Field ProgressDialog val$loadingDialog>
        //    9   15:aload_0         
        //   10   16:invokespecial   #27  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        // try 0 37 handler(s) 234
        //    0    0:getstatic       #38  <Field String Utilities.TAG>
        //    1    3:ldc1            #40  <String "in shareBitmap() -> no sd card fround, falling back to the old method">
        //    2    5:invokestatic    #46  <Method int Log.e(String, String)>
        //    3    8:pop             
        //    4    9:aload_0         
        //    5   10:getfield        #20  <Field Context val$c>
        //    6   13:invokevirtual   #52  <Method File Context.getCacheDir()>
        //    7   16:astore          12
        //    8   18:aload           12
        //    9   20:invokevirtual   #58  <Method boolean File.mkdirs()>
        //   10   23:pop             
        //   11   24:new             #54  <Class File>
        //   12   27:dup             
        //   13   28:aload           12
        //   14   30:ldc1            #60  <String "textgram.png">
        //   15   32:invokespecial   #63  <Method void File(File, String)>
        //   16   35:astore          14
        // try 37 64 handler(s) 224 234
        //   17   37:invokestatic    #69  <Method Runtime Runtime.getRuntime()>
        //   18   40:new             #71  <Class StringBuilder>
        //   19   43:dup             
        //   20   44:ldc1            #73  <String "chmod 777 ">
        //   21   46:invokespecial   #76  <Method void StringBuilder(String)>
        //   22   49:aload           14
        //   23   51:invokevirtual   #80  <Method String File.getAbsolutePath()>
        //   24   54:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
        //   25   57:invokevirtual   #87  <Method String StringBuilder.toString()>
        //   26   60:invokevirtual   #91  <Method Process Runtime.exec(String)>
        //   27   63:pop             
        // try 64 99 handler(s) 261 234
        //   28   64:new             #93  <Class FileOutputStream>
        //   29   67:dup             
        //   30   68:new             #71  <Class StringBuilder>
        //   31   71:dup             
        //   32   72:invokespecial   #94  <Method void StringBuilder()>
        //   33   75:aload           12
        //   34   77:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
        //   35   80:getstatic       #100 <Field String File.separator>
        //   36   83:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
        //   37   86:ldc1            #60  <String "textgram.png">
        //   38   88:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
        //   39   91:invokevirtual   #87  <Method String StringBuilder.toString()>
        //   40   94:invokespecial   #101 <Method void FileOutputStream(String)>
        //   41   97:astore          16
        //   42   99:aload           16
        //   43  101:astore          17
        // try 103 148 handler(s) 234
        //   44  103:aload_0         
        //   45  104:getfield        #22  <Field Bitmap val$bitMap>
        //   46  107:getstatic       #107 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
        //   47  110:bipush          100
        //   48  112:aload           17
        //   49  114:invokevirtual   #113 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
        //   50  117:pop             
        //   51  118:new             #71  <Class StringBuilder>
        //   52  121:dup             
        //   53  122:ldc1            #115 <String "file://">
        //   54  124:invokespecial   #76  <Method void StringBuilder(String)>
        //   55  127:aload           12
        //   56  129:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
        //   57  132:getstatic       #100 <Field String File.separator>
        //   58  135:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
        //   59  138:ldc1            #60  <String "textgram.png">
        //   60  140:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
        //   61  143:invokevirtual   #87  <Method String StringBuilder.toString()>
        //   62  146:astore          19
        //   63  148:aload           19
        //   64  150:astore_3        
        //   65  151:new             #117 <Class Intent>
        //   66  154:dup             
        //   67  155:ldc1            #119 <String "android.intent.action.SEND">
        //   68  157:invokespecial   #120 <Method void Intent(String)>
        //   69  160:astore          4
        //   70  162:aload           4
        //   71  164:ldc1            #122 <String "image/*">
        //   72  166:invokevirtual   #126 <Method Intent Intent.setType(String)>
        //   73  169:pop             
        //   74  170:aload           4
        //   75  172:ldc1            #127 <Int 0x80000>
        //   76  174:invokevirtual   #131 <Method Intent Intent.addFlags(int)>
        //   77  177:pop             
        //   78  178:aload           4
        //   79  180:ldc1            #133 <String "android.intent.extra.STREAM">
        //   80  182:aload_3         
        //   81  183:invokestatic    #139 <Method Uri Uri.parse(String)>
        //   82  186:invokevirtual   #143 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
        //   83  189:pop             
        //   84  190:aload_0         
        //   85  191:getfield        #20  <Field Context val$c>
        //   86  194:aload           4
        //   87  196:ldc1            #145 <String "Share Image">
        //   88  198:invokestatic    #149 <Method Intent Intent.createChooser(Intent, CharSequence)>
        //   89  201:invokevirtual   #153 <Method void Context.startActivity(Intent)>
        // try 204 223 handler(s) 284
        //   90  204:getstatic       #159 <Field Handler ResultActivity.UIHandler>
        //   91  207:new             #161 <Class Utilities$3$1>
        //   92  210:dup             
        //   93  211:aload_0         
        //   94  212:aload_0         
        //   95  213:getfield        #24  <Field ProgressDialog val$loadingDialog>
        //   96  216:invokespecial   #164 <Method void Utilities$3$1(Utilities$3, ProgressDialog)>
        //   97  219:invokevirtual   #170 <Method boolean Handler.post(Runnable)>
        //   98  222:pop             
        //   99  223:return          
        // catch IOException
        //  100  224:astore          15
        // try 226 231 handler(s) 234
        //  101  226:aload           15
        //  102  228:invokevirtual   #173 <Method void IOException.printStackTrace()>
        //  103  231:goto            64
        // catch Exception Exception Exception Exception Exception Exception
        //  104  234:astore_1        
        // try 235 255 handler(s) 274
        //  105  235:aload_0         
        //  106  236:getfield        #20  <Field Context val$c>
        //  107  239:invokevirtual   #177 <Method ContentResolver Context.getContentResolver()>
        //  108  242:aload_0         
        //  109  243:getfield        #22  <Field Bitmap val$bitMap>
        //  110  246:ldc1            #179 <String "Textgram">
        //  111  248:ldc1            #181 <String "Textgram photo">
        //  112  250:invokestatic    #187 <Method String android.provider.MediaStore$Images$Media.insertImage(ContentResolver, Bitmap, String, String)>
        //  113  253:astore          10
        //  114  255:aload           10
        //  115  257:astore_3        
        //  116  258:goto            151
        // catch FileNotFoundException
        //  117  261:astore          20
        // try 263 268 handler(s) 234
        //  118  263:aload           20
        //  119  265:invokevirtual   #188 <Method void FileNotFoundException.printStackTrace()>
        //  120  268:aconst_null     
        //  121  269:astore          17
        //  122  271:goto            103
        // catch Exception
        //  123  274:astore_2        
        //  124  275:aload_2         
        //  125  276:invokevirtual   #189 <Method void Exception.printStackTrace()>
        //  126  279:aconst_null     
        //  127  280:astore_3        
        //  128  281:goto            151
        // catch Exception
        //  129  284:astore          8
        //  130  286:aload           8
        //  131  288:invokevirtual   #189 <Method void Exception.printStackTrace()>
        //  132  291:return          
        }

        private final Bitmap val$bitMap;
        private final Context val$c;
        private final ProgressDialog val$loadingDialog;
    }


    // Unreferenced inner class codeadore/textgram/Utilities$3$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field Utilities$3 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ProgressDialog val$loadingDialog>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field ProgressDialog val$loadingDialog>
        //    2    4:invokevirtual   #28  <Method void ProgressDialog.hide()>
        //    3    7:return          
        }

        final _cls3 this$1;
        private final ProgressDialog val$loadingDialog;
    }

}
