// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.app.Activity;
import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.location.Location;
import android.media.AudioManager;
import android.net.*;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.ads.util:
//            e, b, d

public final class AdUtil
{
    public static class UserActivityReceiver extends BroadcastReceiver
    {

        public UserActivityReceiver()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
        //    2    4:return          
        }

        public void onReceive(Context context, Intent intent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #16  <Method String Intent.getAction()>
        //    2    4:ldc1            #18  <String "android.intent.action.USER_PRESENT">
        //    3    6:invokevirtual   #24  <Method boolean String.equals(Object)>
        //    4    9:ifeq            17
        //    5   12:iconst_1        
        //    6   13:invokestatic    #30  <Method void AdUtil.a(boolean)>
        //    7   16:return          
        //    8   17:aload_2         
        //    9   18:invokevirtual   #16  <Method String Intent.getAction()>
        //   10   21:ldc1            #32  <String "android.intent.action.SCREEN_OFF">
        //   11   23:invokevirtual   #24  <Method boolean String.equals(Object)>
        //   12   26:ifeq            16
        //   13   29:iconst_0        
        //   14   30:invokestatic    #30  <Method void AdUtil.a(boolean)>
        //   15   33:return          
        }
    }

    public static final class a extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class AdUtil$a>
        //    1    3:dup             
        //    2    4:ldc1            #18  <String "INVALID">
        //    3    6:iconst_0        
        //    4    7:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //    5   10:putstatic       #24  <Field AdUtil$a a>
        //    6   13:new             #2   <Class AdUtil$a>
        //    7   16:dup             
        //    8   17:ldc1            #26  <String "SPEAKER">
        //    9   19:iconst_1        
        //   10   20:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //   11   23:putstatic       #28  <Field AdUtil$a b>
        //   12   26:new             #2   <Class AdUtil$a>
        //   13   29:dup             
        //   14   30:ldc1            #30  <String "HEADPHONES">
        //   15   32:iconst_2        
        //   16   33:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //   17   36:putstatic       #32  <Field AdUtil$a c>
        //   18   39:new             #2   <Class AdUtil$a>
        //   19   42:dup             
        //   20   43:ldc1            #34  <String "VIBRATE">
        //   21   45:iconst_3        
        //   22   46:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //   23   49:putstatic       #36  <Field AdUtil$a d>
        //   24   52:new             #2   <Class AdUtil$a>
        //   25   55:dup             
        //   26   56:ldc1            #38  <String "EMULATOR">
        //   27   58:iconst_4        
        //   28   59:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //   29   62:putstatic       #40  <Field AdUtil$a e>
        //   30   65:new             #2   <Class AdUtil$a>
        //   31   68:dup             
        //   32   69:ldc1            #42  <String "OTHER">
        //   33   71:iconst_5        
        //   34   72:invokespecial   #22  <Method void AdUtil$a(String, int)>
        //   35   75:putstatic       #44  <Field AdUtil$a f>
        //   36   78:bipush          6
        //   37   80:anewarray       a[]
        //   38   83:astore_0        
        //   39   84:aload_0         
        //   40   85:iconst_0        
        //   41   86:getstatic       #24  <Field AdUtil$a a>
        //   42   89:aastore         
        //   43   90:aload_0         
        //   44   91:iconst_1        
        //   45   92:getstatic       #28  <Field AdUtil$a b>
        //   46   95:aastore         
        //   47   96:aload_0         
        //   48   97:iconst_2        
        //   49   98:getstatic       #32  <Field AdUtil$a c>
        //   50  101:aastore         
        //   51  102:aload_0         
        //   52  103:iconst_3        
        //   53  104:getstatic       #36  <Field AdUtil$a d>
        //   54  107:aastore         
        //   55  108:aload_0         
        //   56  109:iconst_4        
        //   57  110:getstatic       #40  <Field AdUtil$a e>
        //   58  113:aastore         
        //   59  114:aload_0         
        //   60  115:iconst_5        
        //   61  116:getstatic       #44  <Field AdUtil$a f>
        //   62  119:aastore         
        //   63  120:aload_0         
        //   64  121:putstatic       #46  <Field AdUtil$a[] g>
        //   65  124:return          
        }

        private a(String s, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #47  <Method void Enum(String, int)>
        //    4    6:return          
        }

        public static a valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class AdUtil$a>
        //    1    2:aload_0         
        //    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class AdUtil$a>
        //    4    9:areturn         
        }

        public static a[] values()
        {
        //    0    0:getstatic       #46  <Field AdUtil$a[] g>
        //    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.ads.util.AdUtil$a_3B_.clone()>
        //    2    6:checkcast       #55  <Class AdUtil$a[]>
        //    3    9:areturn         
        }

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];
    }


    static 
    {
    //    0    0:getstatic       #25  <Field String android.os.Build$VERSION.SDK>
    //    1    3:invokestatic    #28  <Method int a(String)>
    //    2    6:putstatic       #30  <Field int a>
    //    3    9:aconst_null     
    //    4   10:putstatic       #32  <Field Boolean b>
    //    5   13:aconst_null     
    //    6   14:putstatic       #34  <Field String c>
    //    7   17:aconst_null     
    //    8   18:putstatic       #36  <Field String e>
    //    9   21:iconst_1        
    //   10   22:putstatic       #38  <Field boolean g>
    //   11   25:iconst_0        
    //   12   26:putstatic       #40  <Field boolean h>
    //   13   29:aconst_null     
    //   14   30:putstatic       #42  <Field String i>
    //   15   33:return          
    }

    public static int a()
    {
    //    0    0:getstatic       #30  <Field int a>
    //    1    3:bipush          9
    //    2    5:icmplt          11
    //    3    8:bipush          6
    //    4   10:ireturn         
    //    5   11:iconst_0        
    //    6   12:ireturn         
    }

    public static int a(Context context, int j)
    {
    //    0    0:iconst_1        
    //    1    1:iload_1         
    //    2    2:i2f             
    //    3    3:aload_0         
    //    4    4:invokevirtual   #50  <Method Resources Context.getResources()>
    //    5    7:invokevirtual   #56  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    6   10:invokestatic    #62  <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //    7   13:f2i             
    //    8   14:ireturn         
    }

    public static int a(Context context, DisplayMetrics displaymetrics)
    {
    //    0    0:getstatic       #30  <Field int a>
    //    1    3:iconst_4        
    //    2    4:icmplt          13
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokestatic    #67  <Method int e.a(Context, DisplayMetrics)>
    //    6   12:ireturn         
    //    7   13:aload_1         
    //    8   14:getfield        #72  <Field int DisplayMetrics.heightPixels>
    //    9   17:ireturn         
    }

    public static int a(String s)
    {
    // try 0 5 handler(s) 7
    //    0    0:aload_0         
    //    1    1:invokestatic    #79  <Method int Integer.parseInt(String)>
    //    2    4:istore_2        
    //    3    5:iload_2         
    //    4    6:ireturn         
    // catch NumberFormatException
    //    5    7:astore_1        
    //    6    8:new             #81  <Class StringBuilder>
    //    7   11:dup             
    //    8   12:invokespecial   #84  <Method void StringBuilder()>
    //    9   15:ldc1            #86  <String "The Android SDK version couldn't be parsed to an int: ">
    //   10   17:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   11   20:getstatic       #25  <Field String android.os.Build$VERSION.SDK>
    //   12   23:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   13   26:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   14   29:invokestatic    #99  <Method void b.e(String)>
    //   15   32:ldc1            #101 <String "Defaulting to Android SDK version 3.">
    //   16   34:invokestatic    #99  <Method void b.e(String)>
    //   17   37:iconst_3        
    //   18   38:ireturn         
    }

    public static DisplayMetrics a(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #108 <Method WindowManager Activity.getWindowManager()>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:new             #69  <Class DisplayMetrics>
    //    6   12:dup             
    //    7   13:invokespecial   #109 <Method void DisplayMetrics()>
    //    8   16:astore_1        
    //    9   17:aload_0         
    //   10   18:invokevirtual   #108 <Method WindowManager Activity.getWindowManager()>
    //   11   21:invokeinterface #115 <Method Display WindowManager.getDefaultDisplay()>
    //   12   26:aload_1         
    //   13   27:invokevirtual   #121 <Method void Display.getMetrics(DisplayMetrics)>
    //   14   30:aload_1         
    //   15   31:areturn         
    }

    public static String a(Context context)
    {
    //    0    0:getstatic       #34  <Field String c>
    //    1    3:ifnonnull       56
    //    2    6:aload_0         
    //    3    7:invokevirtual   #126 <Method android.content.ContentResolver Context.getContentResolver()>
    //    4   10:ldc1            #128 <String "android_id">
    //    5   12:invokestatic    #134 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
    //    6   15:astore_1        
    //    7   16:aload_1         
    //    8   17:ifnull          26
    //    9   20:invokestatic    #137 <Method boolean c()>
    //   10   23:ifeq            38
    //   11   26:ldc1            #139 <String "emulator">
    //   12   28:invokestatic    #142 <Method String b(String)>
    //   13   31:astore_2        
    //   14   32:aload_2         
    //   15   33:ifnonnull       46
    //   16   36:aconst_null     
    //   17   37:areturn         
    //   18   38:aload_1         
    //   19   39:invokestatic    #142 <Method String b(String)>
    //   20   42:astore_2        
    //   21   43:goto            32
    //   22   46:aload_2         
    //   23   47:getstatic       #148 <Field Locale Locale.US>
    //   24   50:invokevirtual   #154 <Method String String.toUpperCase(Locale)>
    //   25   53:putstatic       #34  <Field String c>
    //   26   56:getstatic       #34  <Field String c>
    //   27   59:areturn         
    }

    public static String a(Readable readable)
        throws IOException
    {
    //    0    0:new             #81  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #84  <Method void StringBuilder()>
    //    3    7:astore_1        
    //    4    8:sipush          2048
    //    5   11:invokestatic    #163 <Method CharBuffer CharBuffer.allocate(int)>
    //    6   14:astore_2        
    //    7   15:aload_0         
    //    8   16:aload_2         
    //    9   17:invokeinterface #169 <Method int Readable.read(CharBuffer)>
    //   10   22:istore_3        
    //   11   23:iload_3         
    //   12   24:iconst_m1       
    //   13   25:icmpeq          44
    //   14   28:aload_2         
    //   15   29:invokevirtual   #173 <Method java.nio.Buffer CharBuffer.flip()>
    //   16   32:pop             
    //   17   33:aload_1         
    //   18   34:aload_2         
    //   19   35:iconst_0        
    //   20   36:iload_3         
    //   21   37:invokevirtual   #176 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
    //   22   40:pop             
    //   23   41:goto            15
    //   24   44:aload_1         
    //   25   45:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   26   48:areturn         
    }

    public static String a(Map map)
    {
    // try 0 8 handler(s) 10
    //    0    0:aload_0         
    //    1    1:invokestatic    #182 <Method JSONObject b(Map)>
    //    2    4:invokevirtual   #185 <Method String JSONObject.toString()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:areturn         
    // catch JSONException
    //    6   10:astore_1        
    //    7   11:ldc1            #187 <String "JsonException in serialization: ">
    //    8   13:aload_1         
    //    9   14:invokestatic    #190 <Method void b.d(String, Throwable)>
    //   10   17:aconst_null     
    //   11   18:areturn         
    }

    public static HashMap a(Location location)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       6
    //    2    4:aconst_null     
    //    3    5:areturn         
    //    4    6:new             #193 <Class HashMap>
    //    5    9:dup             
    //    6   10:invokespecial   #194 <Method void HashMap()>
    //    7   13:astore_1        
    //    8   14:aload_1         
    //    9   15:ldc1            #196 <String "time">
    //   10   17:ldc2w           #197 <Long 1000L>
    //   11   20:aload_0         
    //   12   21:invokevirtual   #204 <Method long Location.getTime()>
    //   13   24:lmul            
    //   14   25:invokestatic    #210 <Method Long Long.valueOf(long)>
    //   15   28:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   16   31:pop             
    //   17   32:aload_1         
    //   18   33:ldc1            #216 <String "lat">
    //   19   35:ldc2w           #217 <Double 10000000D>
    //   20   38:aload_0         
    //   21   39:invokevirtual   #222 <Method double Location.getLatitude()>
    //   22   42:dmul            
    //   23   43:d2l             
    //   24   44:invokestatic    #210 <Method Long Long.valueOf(long)>
    //   25   47:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   26   50:pop             
    //   27   51:aload_1         
    //   28   52:ldc1            #224 <String "long">
    //   29   54:ldc2w           #217 <Double 10000000D>
    //   30   57:aload_0         
    //   31   58:invokevirtual   #227 <Method double Location.getLongitude()>
    //   32   61:dmul            
    //   33   62:d2l             
    //   34   63:invokestatic    #210 <Method Long Long.valueOf(long)>
    //   35   66:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   36   69:pop             
    //   37   70:aload_1         
    //   38   71:ldc1            #229 <String "radius">
    //   39   73:ldc1            #230 <Float 1000F>
    //   40   75:aload_0         
    //   41   76:invokevirtual   #234 <Method float Location.getAccuracy()>
    //   42   79:fmul            
    //   43   80:f2l             
    //   44   81:invokestatic    #210 <Method Long Long.valueOf(long)>
    //   45   84:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   46   87:pop             
    //   47   88:aload_1         
    //   48   89:areturn         
    }

    public static JSONArray a(Set set)
        throws JSONException
    {
    //    0    0:new             #239 <Class JSONArray>
    //    1    3:dup             
    //    2    4:invokespecial   #240 <Method void JSONArray()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:ifnull          21
    //    6   12:aload_0         
    //    7   13:invokeinterface #245 <Method boolean Set.isEmpty()>
    //    8   18:ifeq            23
    //    9   21:aload_1         
    //   10   22:areturn         
    //   11   23:aload_0         
    //   12   24:invokeinterface #249 <Method Iterator Set.iterator()>
    //   13   29:astore_2        
    //   14   30:aload_2         
    //   15   31:invokeinterface #254 <Method boolean Iterator.hasNext()>
    //   16   36:ifeq            186
    //   17   39:aload_2         
    //   18   40:invokeinterface #258 <Method Object Iterator.next()>
    //   19   45:astore_3        
    //   20   46:aload_3         
    //   21   47:instanceof      #150 <Class String>
    //   22   50:ifne            81
    //   23   53:aload_3         
    //   24   54:instanceof      #76  <Class Integer>
    //   25   57:ifne            81
    //   26   60:aload_3         
    //   27   61:instanceof      #260 <Class Double>
    //   28   64:ifne            81
    //   29   67:aload_3         
    //   30   68:instanceof      #206 <Class Long>
    //   31   71:ifne            81
    //   32   74:aload_3         
    //   33   75:instanceof      #262 <Class Float>
    //   34   78:ifeq            90
    //   35   81:aload_1         
    //   36   82:aload_3         
    //   37   83:invokevirtual   #265 <Method JSONArray JSONArray.put(Object)>
    //   38   86:pop             
    //   39   87:goto            30
    //   40   90:aload_3         
    //   41   91:instanceof      #267 <Class Map>
    //   42   94:ifeq            125
    // try 97 109 handler(s) 112
    //   43   97:aload_1         
    //   44   98:aload_3         
    //   45   99:checkcast       #267 <Class Map>
    //   46  102:invokestatic    #182 <Method JSONObject b(Map)>
    //   47  105:invokevirtual   #265 <Method JSONArray JSONArray.put(Object)>
    //   48  108:pop             
    //   49  109:goto            30
    // catch ClassCastException
    //   50  112:astore          7
    //   51  114:ldc2            #269 <String "Unknown map type in json serialization: ">
    //   52  117:aload           7
    //   53  119:invokestatic    #190 <Method void b.d(String, Throwable)>
    //   54  122:goto            30
    //   55  125:aload_3         
    //   56  126:instanceof      #242 <Class Set>
    //   57  129:ifeq            160
    // try 132 144 handler(s) 147
    //   58  132:aload_1         
    //   59  133:aload_3         
    //   60  134:checkcast       #242 <Class Set>
    //   61  137:invokestatic    #271 <Method JSONArray a(Set)>
    //   62  140:invokevirtual   #265 <Method JSONArray JSONArray.put(Object)>
    //   63  143:pop             
    //   64  144:goto            30
    // catch ClassCastException
    //   65  147:astore          5
    //   66  149:ldc2            #269 <String "Unknown map type in json serialization: ">
    //   67  152:aload           5
    //   68  154:invokestatic    #190 <Method void b.d(String, Throwable)>
    //   69  157:goto            30
    //   70  160:new             #81  <Class StringBuilder>
    //   71  163:dup             
    //   72  164:invokespecial   #84  <Method void StringBuilder()>
    //   73  167:ldc2            #273 <String "Unknown value in json serialization: ">
    //   74  170:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   75  173:aload_3         
    //   76  174:invokevirtual   #276 <Method StringBuilder StringBuilder.append(Object)>
    //   77  177:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   78  180:invokestatic    #99  <Method void b.e(String)>
    //   79  183:goto            30
    //   80  186:aload_1         
    //   81  187:areturn         
    }

    public static void a(WebView webview)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #283 <Method Context WebView.getContext()>
    //    2    4:invokevirtual   #286 <Method Context Context.getApplicationContext()>
    //    3    7:invokestatic    #288 <Method String i(Context)>
    //    4   10:astore_1        
    //    5   11:aload_0         
    //    6   12:invokevirtual   #292 <Method WebSettings WebView.getSettings()>
    //    7   15:aload_1         
    //    8   16:invokevirtual   #297 <Method void WebSettings.setUserAgentString(String)>
    //    9   19:return          
    }

    public static void a(HttpURLConnection httpurlconnection, Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc2            #300 <String "User-Agent">
    //    2    4:aload_1         
    //    3    5:invokestatic    #288 <Method String i(Context)>
    //    4    8:invokevirtual   #306 <Method void HttpURLConnection.setRequestProperty(String, String)>
    //    5   11:return          
    }

    public static void a(boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:putstatic       #38  <Field boolean g>
    //    2    4:return          
    }

    public static boolean a(int j, int k, String s)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iand            
    //    3    3:ifne            37
    //    4    6:new             #81  <Class StringBuilder>
    //    5    9:dup             
    //    6   10:invokespecial   #84  <Method void StringBuilder()>
    //    7   13:ldc2            #310 <String "The android:configChanges value of the com.google.ads.AdActivity must include ">
    //    8   16:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //    9   19:aload_2         
    //   10   20:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   11   23:ldc2            #312 <String ".">
    //   12   26:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   13   29:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   14   32:invokestatic    #314 <Method void b.b(String)>
    //   15   35:iconst_0        
    //   16   36:ireturn         
    //   17   37:iconst_1        
    //   18   38:ireturn         
    }

    public static boolean a(Context context, String s)
    {
    // try 0 10 handler(s) 12
    //    0    0:aload_0         
    //    1    1:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    2    4:aload_1         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #327 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
    //    5    9:pop             
    //    6   10:iconst_1        
    //    7   11:ireturn         
    // catch android.content.pm.PackageManager.NameNotFoundException
    //    8   12:astore_2        
    //    9   13:iconst_0        
    //   10   14:ireturn         
    }

    public static boolean a(Intent intent, Context context)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    2    4:aload_0         
    //    3    5:ldc2            #329 <Int 0x10000>
    //    4    8:invokevirtual   #333 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
    //    5   11:ifnull          16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    public static boolean a(Uri uri)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       6
    //    2    4:iconst_0        
    //    3    5:ireturn         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #339 <Method String Uri.getScheme()>
    //    6   10:astore_1        
    //    7   11:ldc2            #341 <String "http">
    //    8   14:aload_1         
    //    9   15:invokevirtual   #345 <Method boolean String.equalsIgnoreCase(String)>
    //   10   18:ifne            31
    //   11   21:ldc2            #347 <String "https">
    //   12   24:aload_1         
    //   13   25:invokevirtual   #345 <Method boolean String.equalsIgnoreCase(String)>
    //   14   28:ifeq            4
    //   15   31:iconst_1        
    //   16   32:ireturn         
    }

    static boolean a(d d1)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       8
    //    2    4:getstatic       #353 <Field d d.d>
    //    3    7:astore_0        
    //    4    8:aload_0         
    //    5    9:getstatic       #355 <Field d d.e>
    //    6   12:invokevirtual   #359 <Method boolean d.equals(Object)>
    //    7   15:ifne            28
    //    8   18:aload_0         
    //    9   19:getstatic       #361 <Field d d.f>
    //   10   22:invokevirtual   #359 <Method boolean d.equals(Object)>
    //   11   25:ifeq            30
    //   12   28:iconst_1        
    //   13   29:ireturn         
    //   14   30:iconst_0        
    //   15   31:ireturn         
    }

    public static int b()
    {
    //    0    0:getstatic       #30  <Field int a>
    //    1    3:bipush          9
    //    2    5:icmplt          11
    //    3    8:bipush          7
    //    4   10:ireturn         
    //    5   11:iconst_1        
    //    6   12:ireturn         
    }

    public static int b(Context context, DisplayMetrics displaymetrics)
    {
    //    0    0:getstatic       #30  <Field int a>
    //    1    3:iconst_4        
    //    2    4:icmplt          13
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokestatic    #363 <Method int e.b(Context, DisplayMetrics)>
    //    6   12:ireturn         
    //    7   13:aload_1         
    //    8   14:getfield        #366 <Field int DisplayMetrics.widthPixels>
    //    9   17:ireturn         
    }

    public static String b(String s)
    {
    //    0    0:aconst_null     
    //    1    1:astore_1        
    //    2    2:aload_0         
    //    3    3:ifnull          82
    //    4    6:aload_0         
    //    5    7:invokevirtual   #371 <Method int String.length()>
    //    6   10:istore_2        
    //    7   11:aconst_null     
    //    8   12:astore_1        
    //    9   13:iload_2         
    //   10   14:ifle            82
    // try 17 79 handler(s) 84
    //   11   17:ldc2            #373 <String "MD5">
    //   12   20:invokestatic    #379 <Method MessageDigest MessageDigest.getInstance(String)>
    //   13   23:astore          4
    //   14   25:aload           4
    //   15   27:aload_0         
    //   16   28:invokevirtual   #383 <Method byte[] String.getBytes()>
    //   17   31:iconst_0        
    //   18   32:aload_0         
    //   19   33:invokevirtual   #371 <Method int String.length()>
    //   20   36:invokevirtual   #387 <Method void MessageDigest.update(byte[], int, int)>
    //   21   39:getstatic       #148 <Field Locale Locale.US>
    //   22   42:astore          5
    //   23   44:iconst_1        
    //   24   45:anewarray       Object[]
    //   25   48:astore          6
    //   26   50:aload           6
    //   27   52:iconst_0        
    //   28   53:new             #389 <Class BigInteger>
    //   29   56:dup             
    //   30   57:iconst_1        
    //   31   58:aload           4
    //   32   60:invokevirtual   #392 <Method byte[] MessageDigest.digest()>
    //   33   63:invokespecial   #395 <Method void BigInteger(int, byte[])>
    //   34   66:aastore         
    //   35   67:aload           5
    //   36   69:ldc2            #397 <String "%032X">
    //   37   72:aload           6
    //   38   74:invokestatic    #401 <Method String String.format(Locale, String, Object[])>
    //   39   77:astore          7
    //   40   79:aload           7
    //   41   81:astore_1        
    //   42   82:aload_1         
    //   43   83:areturn         
    // catch NoSuchAlgorithmException
    //   44   84:astore_3        
    //   45   85:aload_0         
    //   46   86:iconst_0        
    //   47   87:bipush          32
    //   48   89:invokevirtual   #405 <Method String String.substring(int, int)>
    //   49   92:areturn         
    }

    public static HashMap b(Uri uri)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       6
    //    2    4:aconst_null     
    //    3    5:areturn         
    //    4    6:new             #193 <Class HashMap>
    //    5    9:dup             
    //    6   10:invokespecial   #194 <Method void HashMap()>
    //    7   13:astore_1        
    //    8   14:aload_0         
    //    9   15:invokevirtual   #409 <Method String Uri.getEncodedQuery()>
    //   10   18:astore_2        
    //   11   19:aload_2         
    //   12   20:ifnull          119
    //   13   23:aload_2         
    //   14   24:ldc2            #411 <String "&">
    //   15   27:invokevirtual   #415 <Method String[] String.split(String)>
    //   16   30:astore_3        
    //   17   31:aload_3         
    //   18   32:arraylength     
    //   19   33:istore          4
    //   20   35:iconst_0        
    //   21   36:istore          5
    //   22   38:iload           5
    //   23   40:iload           4
    //   24   42:icmpge          119
    //   25   45:aload_3         
    //   26   46:iload           5
    //   27   48:aaload          
    //   28   49:astore          6
    //   29   51:aload           6
    //   30   53:ldc2            #417 <String "=">
    //   31   56:invokevirtual   #420 <Method int String.indexOf(String)>
    //   32   59:istore          7
    //   33   61:iload           7
    //   34   63:ifge            83
    //   35   66:aload_1         
    //   36   67:aload           6
    //   37   69:invokestatic    #423 <Method String Uri.decode(String)>
    //   38   72:aconst_null     
    //   39   73:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   40   76:pop             
    //   41   77:iinc            5  1
    //   42   80:goto            38
    //   43   83:aload_1         
    //   44   84:aload           6
    //   45   86:iconst_0        
    //   46   87:iload           7
    //   47   89:invokevirtual   #405 <Method String String.substring(int, int)>
    //   48   92:invokestatic    #423 <Method String Uri.decode(String)>
    //   49   95:aload           6
    //   50   97:iload           7
    //   51   99:iconst_1        
    //   52  100:iadd            
    //   53  101:aload           6
    //   54  103:invokevirtual   #371 <Method int String.length()>
    //   55  106:invokevirtual   #405 <Method String String.substring(int, int)>
    //   56  109:invokestatic    #423 <Method String Uri.decode(String)>
    //   57  112:invokevirtual   #214 <Method Object HashMap.put(Object, Object)>
    //   58  115:pop             
    //   59  116:goto            77
    //   60  119:aload_1         
    //   61  120:areturn         
    }

    public static JSONObject b(Map map)
        throws JSONException
    {
    //    0    0:new             #184 <Class JSONObject>
    //    1    3:dup             
    //    2    4:invokespecial   #424 <Method void JSONObject()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:ifnull          21
    //    6   12:aload_0         
    //    7   13:invokeinterface #425 <Method boolean Map.isEmpty()>
    //    8   18:ifeq            23
    //    9   21:aload_1         
    //   10   22:areturn         
    //   11   23:aload_0         
    //   12   24:invokeinterface #429 <Method Set Map.keySet()>
    //   13   29:invokeinterface #249 <Method Iterator Set.iterator()>
    //   14   34:astore_2        
    //   15   35:aload_2         
    //   16   36:invokeinterface #254 <Method boolean Iterator.hasNext()>
    //   17   41:ifeq            217
    //   18   44:aload_2         
    //   19   45:invokeinterface #258 <Method Object Iterator.next()>
    //   20   50:checkcast       #150 <Class String>
    //   21   53:astore_3        
    //   22   54:aload_0         
    //   23   55:aload_3         
    //   24   56:invokeinterface #433 <Method Object Map.get(Object)>
    //   25   61:astore          4
    //   26   63:aload           4
    //   27   65:instanceof      #150 <Class String>
    //   28   68:ifne            103
    //   29   71:aload           4
    //   30   73:instanceof      #76  <Class Integer>
    //   31   76:ifne            103
    //   32   79:aload           4
    //   33   81:instanceof      #260 <Class Double>
    //   34   84:ifne            103
    //   35   87:aload           4
    //   36   89:instanceof      #206 <Class Long>
    //   37   92:ifne            103
    //   38   95:aload           4
    //   39   97:instanceof      #262 <Class Float>
    //   40  100:ifeq            114
    //   41  103:aload_1         
    //   42  104:aload_3         
    //   43  105:aload           4
    //   44  107:invokevirtual   #436 <Method JSONObject JSONObject.put(String, Object)>
    //   45  110:pop             
    //   46  111:goto            35
    //   47  114:aload           4
    //   48  116:instanceof      #267 <Class Map>
    //   49  119:ifeq            152
    // try 122 136 handler(s) 139
    //   50  122:aload_1         
    //   51  123:aload_3         
    //   52  124:aload           4
    //   53  126:checkcast       #267 <Class Map>
    //   54  129:invokestatic    #182 <Method JSONObject b(Map)>
    //   55  132:invokevirtual   #436 <Method JSONObject JSONObject.put(String, Object)>
    //   56  135:pop             
    //   57  136:goto            35
    // catch ClassCastException
    //   58  139:astore          8
    //   59  141:ldc2            #269 <String "Unknown map type in json serialization: ">
    //   60  144:aload           8
    //   61  146:invokestatic    #190 <Method void b.d(String, Throwable)>
    //   62  149:goto            35
    //   63  152:aload           4
    //   64  154:instanceof      #242 <Class Set>
    //   65  157:ifeq            190
    // try 160 174 handler(s) 177
    //   66  160:aload_1         
    //   67  161:aload_3         
    //   68  162:aload           4
    //   69  164:checkcast       #242 <Class Set>
    //   70  167:invokestatic    #271 <Method JSONArray a(Set)>
    //   71  170:invokevirtual   #436 <Method JSONObject JSONObject.put(String, Object)>
    //   72  173:pop             
    //   73  174:goto            35
    // catch ClassCastException
    //   74  177:astore          6
    //   75  179:ldc2            #269 <String "Unknown map type in json serialization: ">
    //   76  182:aload           6
    //   77  184:invokestatic    #190 <Method void b.d(String, Throwable)>
    //   78  187:goto            35
    //   79  190:new             #81  <Class StringBuilder>
    //   80  193:dup             
    //   81  194:invokespecial   #84  <Method void StringBuilder()>
    //   82  197:ldc2            #273 <String "Unknown value in json serialization: ">
    //   83  200:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   84  203:aload           4
    //   85  205:invokevirtual   #276 <Method StringBuilder StringBuilder.append(Object)>
    //   86  208:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   87  211:invokestatic    #99  <Method void b.e(String)>
    //   88  214:goto            35
    //   89  217:aload_1         
    //   90  218:areturn         
    }

    public static boolean b(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #440 <Method String Context.getPackageName()>
    //    5    9:astore_2        
    //    6   10:aload_1         
    //    7   11:ldc2            #442 <String "android.permission.INTERNET">
    //    8   14:aload_2         
    //    9   15:invokevirtual   #446 <Method int PackageManager.checkPermission(String, String)>
    //   10   18:iconst_m1       
    //   11   19:icmpne          30
    //   12   22:ldc2            #448 <String "INTERNET permissions must be enabled in AndroidManifest.xml.">
    //   13   25:invokestatic    #314 <Method void b.b(String)>
    //   14   28:iconst_0        
    //   15   29:ireturn         
    //   16   30:aload_1         
    //   17   31:ldc2            #450 <String "android.permission.ACCESS_NETWORK_STATE">
    //   18   34:aload_2         
    //   19   35:invokevirtual   #446 <Method int PackageManager.checkPermission(String, String)>
    //   20   38:iconst_m1       
    //   21   39:icmpne          50
    //   22   42:ldc2            #452 <String "ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.">
    //   23   45:invokestatic    #314 <Method void b.b(String)>
    //   24   48:iconst_0        
    //   25   49:ireturn         
    //   26   50:iconst_1        
    //   27   51:ireturn         
    }

    public static boolean c()
    {
    //    0    0:aconst_null     
    //    1    1:invokestatic    #454 <Method boolean a(d)>
    //    2    4:ireturn         
    }

    public static boolean c(Context context)
    {
    //    0    0:getstatic       #32  <Field Boolean b>
    //    1    3:ifnull          13
    //    2    6:getstatic       #32  <Field Boolean b>
    //    3    9:invokevirtual   #459 <Method boolean Boolean.booleanValue()>
    //    4   12:ireturn         
    //    5   13:aload_0         
    //    6   14:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    7   17:new             #461 <Class Intent>
    //    8   20:dup             
    //    9   21:aload_0         
    //   10   22:ldc2            #463 <Class AdActivity>
    //   11   25:invokespecial   #466 <Method void Intent(Context, Class)>
    //   12   28:ldc2            #329 <Int 0x10000>
    //   13   31:invokevirtual   #333 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
    //   14   34:astore_1        
    //   15   35:iconst_1        
    //   16   36:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   17   39:putstatic       #32  <Field Boolean b>
    //   18   42:aload_1         
    //   19   43:ifnull          53
    //   20   46:aload_1         
    //   21   47:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   22   50:ifnonnull       73
    //   23   53:ldc2            #477 <String "Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.">
    //   24   56:invokestatic    #314 <Method void b.b(String)>
    //   25   59:iconst_0        
    //   26   60:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   27   63:putstatic       #32  <Field Boolean b>
    //   28   66:getstatic       #32  <Field Boolean b>
    //   29   69:invokevirtual   #459 <Method boolean Boolean.booleanValue()>
    //   30   72:ireturn         
    //   31   73:aload_1         
    //   32   74:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   33   77:getfield        #482 <Field int ActivityInfo.configChanges>
    //   34   80:bipush          16
    //   35   82:ldc2            #484 <String "keyboard">
    //   36   85:invokestatic    #486 <Method boolean a(int, int, String)>
    //   37   88:ifne            98
    //   38   91:iconst_0        
    //   39   92:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   40   95:putstatic       #32  <Field Boolean b>
    //   41   98:aload_1         
    //   42   99:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   43  102:getfield        #482 <Field int ActivityInfo.configChanges>
    //   44  105:bipush          32
    //   45  107:ldc2            #488 <String "keyboardHidden">
    //   46  110:invokestatic    #486 <Method boolean a(int, int, String)>
    //   47  113:ifne            123
    //   48  116:iconst_0        
    //   49  117:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   50  120:putstatic       #32  <Field Boolean b>
    //   51  123:aload_1         
    //   52  124:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   53  127:getfield        #482 <Field int ActivityInfo.configChanges>
    //   54  130:sipush          128
    //   55  133:ldc2            #490 <String "orientation">
    //   56  136:invokestatic    #486 <Method boolean a(int, int, String)>
    //   57  139:ifne            149
    //   58  142:iconst_0        
    //   59  143:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   60  146:putstatic       #32  <Field Boolean b>
    //   61  149:aload_1         
    //   62  150:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   63  153:getfield        #482 <Field int ActivityInfo.configChanges>
    //   64  156:sipush          256
    //   65  159:ldc2            #492 <String "screenLayout">
    //   66  162:invokestatic    #486 <Method boolean a(int, int, String)>
    //   67  165:ifne            175
    //   68  168:iconst_0        
    //   69  169:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   70  172:putstatic       #32  <Field Boolean b>
    //   71  175:aload_1         
    //   72  176:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   73  179:getfield        #482 <Field int ActivityInfo.configChanges>
    //   74  182:sipush          512
    //   75  185:ldc2            #494 <String "uiMode">
    //   76  188:invokestatic    #486 <Method boolean a(int, int, String)>
    //   77  191:ifne            201
    //   78  194:iconst_0        
    //   79  195:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   80  198:putstatic       #32  <Field Boolean b>
    //   81  201:aload_1         
    //   82  202:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   83  205:getfield        #482 <Field int ActivityInfo.configChanges>
    //   84  208:sipush          1024
    //   85  211:ldc2            #496 <String "screenSize">
    //   86  214:invokestatic    #486 <Method boolean a(int, int, String)>
    //   87  217:ifne            227
    //   88  220:iconst_0        
    //   89  221:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //   90  224:putstatic       #32  <Field Boolean b>
    //   91  227:aload_1         
    //   92  228:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   93  231:getfield        #482 <Field int ActivityInfo.configChanges>
    //   94  234:sipush          2048
    //   95  237:ldc2            #498 <String "smallestScreenSize">
    //   96  240:invokestatic    #486 <Method boolean a(int, int, String)>
    //   97  243:ifne            66
    //   98  246:iconst_0        
    //   99  247:invokestatic    #469 <Method Boolean Boolean.valueOf(boolean)>
    //  100  250:putstatic       #32  <Field Boolean b>
    //  101  253:goto            66
    }

    public static String d(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc2            #500 <String "connectivity">
    //    2    4:invokevirtual   #504 <Method Object Context.getSystemService(String)>
    //    3    7:checkcast       #506 <Class ConnectivityManager>
    //    4   10:invokevirtual   #510 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
    //    5   13:astore_1        
    //    6   14:aload_1         
    //    7   15:ifnonnull       20
    //    8   18:aconst_null     
    //    9   19:areturn         
    //   10   20:aload_1         
    //   11   21:invokevirtual   #515 <Method int NetworkInfo.getType()>
    //   12   24:tableswitch     0 1: default 48
    //                   0 52
    //                   1 56
    //   13   48:ldc2            #517 <String "unknown">
    //   14   51:areturn         
    //   15   52:ldc2            #519 <String "ed">
    //   16   55:areturn         
    //   17   56:ldc2            #521 <String "wi">
    //   18   59:areturn         
    }

    public static boolean d()
    {
    //    0    0:getstatic       #38  <Field boolean g>
    //    1    3:ireturn         
    }

    public static String e(Context context)
    {
    //    0    0:getstatic       #523 <Field String d>
    //    1    3:ifnonnull       134
    //    2    6:new             #81  <Class StringBuilder>
    //    3    9:dup             
    //    4   10:invokespecial   #84  <Method void StringBuilder()>
    //    5   13:astore_1        
    //    6   14:aload_0         
    //    7   15:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    8   18:astore_2        
    //    9   19:aload_2         
    //   10   20:new             #461 <Class Intent>
    //   11   23:dup             
    //   12   24:ldc2            #525 <String "android.intent.action.VIEW">
    //   13   27:ldc2            #527 <String "geo:0,0?q=donuts">
    //   14   30:invokestatic    #531 <Method Uri Uri.parse(String)>
    //   15   33:invokespecial   #534 <Method void Intent(String, Uri)>
    //   16   36:ldc2            #329 <Int 0x10000>
    //   17   39:invokevirtual   #538 <Method List PackageManager.queryIntentActivities(Intent, int)>
    //   18   42:astore_3        
    //   19   43:aload_3         
    //   20   44:ifnull          56
    //   21   47:aload_3         
    //   22   48:invokeinterface #541 <Method boolean List.isEmpty()>
    //   23   53:ifeq            64
    //   24   56:aload_1         
    //   25   57:ldc2            #543 <String "m">
    //   26   60:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   27   63:pop             
    //   28   64:aload_2         
    //   29   65:new             #461 <Class Intent>
    //   30   68:dup             
    //   31   69:ldc2            #525 <String "android.intent.action.VIEW">
    //   32   72:ldc2            #545 <String "market://search?q=pname:com.google">
    //   33   75:invokestatic    #531 <Method Uri Uri.parse(String)>
    //   34   78:invokespecial   #534 <Method void Intent(String, Uri)>
    //   35   81:ldc2            #329 <Int 0x10000>
    //   36   84:invokevirtual   #538 <Method List PackageManager.queryIntentActivities(Intent, int)>
    //   37   87:astore          5
    //   38   89:aload           5
    //   39   91:ifnull          104
    //   40   94:aload           5
    //   41   96:invokeinterface #541 <Method boolean List.isEmpty()>
    //   42  101:ifeq            127
    //   43  104:aload_1         
    //   44  105:invokevirtual   #546 <Method int StringBuilder.length()>
    //   45  108:ifle            119
    //   46  111:aload_1         
    //   47  112:ldc2            #548 <String ",">
    //   48  115:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   49  118:pop             
    //   50  119:aload_1         
    //   51  120:ldc2            #549 <String "a">
    //   52  123:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   53  126:pop             
    //   54  127:aload_1         
    //   55  128:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   56  131:putstatic       #523 <Field String d>
    //   57  134:getstatic       #523 <Field String d>
    //   58  137:areturn         
    }

    public static String f(Context context)
    {
    //    0    0:getstatic       #36  <Field String e>
    //    1    3:ifnull          14
    //    2    6:getstatic       #36  <Field String e>
    //    3    9:astore          4
    //    4   11:aload           4
    //    5   13:areturn         
    // try 14 43 handler(s) 127
    //    6   14:aload_0         
    //    7   15:invokevirtual   #321 <Method PackageManager Context.getPackageManager()>
    //    8   18:astore_2        
    //    9   19:aload_2         
    //   10   20:new             #461 <Class Intent>
    //   11   23:dup             
    //   12   24:ldc2            #525 <String "android.intent.action.VIEW">
    //   13   27:ldc2            #551 <String "market://details?id=com.google.ads">
    //   14   30:invokestatic    #531 <Method Uri Uri.parse(String)>
    //   15   33:invokespecial   #534 <Method void Intent(String, Uri)>
    //   16   36:ldc2            #329 <Int 0x10000>
    //   17   39:invokevirtual   #333 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
    //   18   42:astore_3        
    //   19   43:aconst_null     
    //   20   44:astore          4
    //   21   46:aload_3         
    //   22   47:ifnull          11
    // try 50 56 handler(s) 127
    //   23   50:aload_3         
    //   24   51:getfield        #475 <Field ActivityInfo ResolveInfo.activityInfo>
    //   25   54:astore          5
    //   26   56:aconst_null     
    //   27   57:astore          4
    //   28   59:aload           5
    //   29   61:ifnull          11
    // try 64 76 handler(s) 127
    //   30   64:aload_2         
    //   31   65:aload           5
    //   32   67:getfield        #554 <Field String ActivityInfo.packageName>
    //   33   70:iconst_0        
    //   34   71:invokevirtual   #327 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
    //   35   74:astore          6
    //   36   76:aconst_null     
    //   37   77:astore          4
    //   38   79:aload           6
    //   39   81:ifnull          11
    // try 84 124 handler(s) 127
    //   40   84:new             #81  <Class StringBuilder>
    //   41   87:dup             
    //   42   88:invokespecial   #84  <Method void StringBuilder()>
    //   43   91:aload           6
    //   44   93:getfield        #559 <Field int PackageInfo.versionCode>
    //   45   96:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
    //   46   99:ldc2            #312 <String ".">
    //   47  102:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   48  105:aload           5
    //   49  107:getfield        #554 <Field String ActivityInfo.packageName>
    //   50  110:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   51  113:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   52  116:putstatic       #36  <Field String e>
    //   53  119:getstatic       #36  <Field String e>
    //   54  122:astore          7
    //   55  124:aload           7
    //   56  126:areturn         
    // catch android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException
    //   57  127:astore_1        
    //   58  128:aconst_null     
    //   59  129:areturn         
    }

    public static a g(Context context)
    {
    //    0    0:getstatic       #565 <Field AudioManager f>
    //    1    3:ifnonnull       19
    //    2    6:aload_0         
    //    3    7:ldc2            #567 <String "audio">
    //    4   10:invokevirtual   #504 <Method Object Context.getSystemService(String)>
    //    5   13:checkcast       #569 <Class AudioManager>
    //    6   16:putstatic       #565 <Field AudioManager f>
    //    7   19:getstatic       #574 <Field AdUtil$a AdUtil$a.f>
    //    8   22:pop             
    //    9   23:getstatic       #565 <Field AudioManager f>
    //   10   26:invokevirtual   #577 <Method int AudioManager.getMode()>
    //   11   29:istore_2        
    //   12   30:invokestatic    #137 <Method boolean c()>
    //   13   33:ifeq            40
    //   14   36:getstatic       #579 <Field AdUtil$a AdUtil$a.e>
    //   15   39:areturn         
    //   16   40:getstatic       #565 <Field AudioManager f>
    //   17   43:invokevirtual   #582 <Method boolean AudioManager.isMusicActive()>
    //   18   46:ifne            68
    //   19   49:getstatic       #565 <Field AudioManager f>
    //   20   52:invokevirtual   #585 <Method boolean AudioManager.isSpeakerphoneOn()>
    //   21   55:ifne            68
    //   22   58:iload_2         
    //   23   59:iconst_2        
    //   24   60:icmpeq          68
    //   25   63:iload_2         
    //   26   64:iconst_1        
    //   27   65:icmpne          72
    //   28   68:getstatic       #587 <Field AdUtil$a AdUtil$a.d>
    //   29   71:areturn         
    //   30   72:getstatic       #565 <Field AudioManager f>
    //   31   75:invokevirtual   #590 <Method int AudioManager.getRingerMode()>
    //   32   78:istore_3        
    //   33   79:iload_3         
    //   34   80:ifeq            88
    //   35   83:iload_3         
    //   36   84:iconst_1        
    //   37   85:icmpne          92
    //   38   88:getstatic       #587 <Field AdUtil$a AdUtil$a.d>
    //   39   91:areturn         
    //   40   92:getstatic       #592 <Field AdUtil$a AdUtil$a.b>
    //   41   95:areturn         
    }

    public static void h(Context context)
    {
    //    0    0:getstatic       #40  <Field boolean h>
    //    1    3:ifeq            7
    //    2    6:return          
    //    3    7:new             #595 <Class IntentFilter>
    //    4   10:dup             
    //    5   11:invokespecial   #596 <Method void IntentFilter()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:ldc2            #598 <String "android.intent.action.USER_PRESENT">
    //    9   19:invokevirtual   #601 <Method void IntentFilter.addAction(String)>
    //   10   22:aload_1         
    //   11   23:ldc2            #603 <String "android.intent.action.SCREEN_OFF">
    //   12   26:invokevirtual   #601 <Method void IntentFilter.addAction(String)>
    //   13   29:aload_0         
    //   14   30:new             #605 <Class AdUtil$UserActivityReceiver>
    //   15   33:dup             
    //   16   34:invokespecial   #606 <Method void AdUtil$UserActivityReceiver()>
    //   17   37:aload_1         
    //   18   38:invokevirtual   #610 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
    //   19   41:pop             
    //   20   42:iconst_1        
    //   21   43:putstatic       #40  <Field boolean h>
    //   22   46:return          
    }

    public static String i(Context context)
    {
    //    0    0:getstatic       #42  <Field String i>
    //    1    3:ifnonnull       291
    //    2    6:new             #279 <Class WebView>
    //    3    9:dup             
    //    4   10:aload_0         
    //    5   11:invokespecial   #612 <Method void WebView(Context)>
    //    6   14:invokevirtual   #292 <Method WebSettings WebView.getSettings()>
    //    7   17:invokevirtual   #615 <Method String WebSettings.getUserAgentString()>
    //    8   20:astore_1        
    //    9   21:aload_1         
    //   10   22:ifnull          42
    //   11   25:aload_1         
    //   12   26:invokevirtual   #371 <Method int String.length()>
    //   13   29:ifeq            42
    //   14   32:aload_1         
    //   15   33:ldc2            #617 <String "Java0">
    //   16   36:invokevirtual   #618 <Method boolean String.equals(Object)>
    //   17   39:ifeq            250
    //   18   42:ldc2            #620 <String "os.name">
    //   19   45:ldc2            #622 <String "Linux">
    //   20   48:invokestatic    #628 <Method String System.getProperty(String, String)>
    //   21   51:astore_2        
    //   22   52:new             #81  <Class StringBuilder>
    //   23   55:dup             
    //   24   56:invokespecial   #84  <Method void StringBuilder()>
    //   25   59:ldc2            #630 <String "Android ">
    //   26   62:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   27   65:getstatic       #633 <Field String android.os.Build$VERSION.RELEASE>
    //   28   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   29   71:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   30   74:astore_3        
    //   31   75:invokestatic    #637 <Method Locale Locale.getDefault()>
    //   32   78:astore          4
    //   33   80:aload           4
    //   34   82:invokevirtual   #640 <Method String Locale.getLanguage()>
    //   35   85:getstatic       #148 <Field Locale Locale.US>
    //   36   88:invokevirtual   #643 <Method String String.toLowerCase(Locale)>
    //   37   91:astore          5
    //   38   93:aload           5
    //   39   95:invokevirtual   #371 <Method int String.length()>
    //   40   98:ifne            106
    //   41  101:ldc2            #645 <String "en">
    //   42  104:astore          5
    //   43  106:aload           4
    //   44  108:invokevirtual   #648 <Method String Locale.getCountry()>
    //   45  111:getstatic       #148 <Field Locale Locale.US>
    //   46  114:invokevirtual   #643 <Method String String.toLowerCase(Locale)>
    //   47  117:astore          6
    //   48  119:aload           6
    //   49  121:invokevirtual   #371 <Method int String.length()>
    //   50  124:ifle            155
    //   51  127:new             #81  <Class StringBuilder>
    //   52  130:dup             
    //   53  131:invokespecial   #84  <Method void StringBuilder()>
    //   54  134:aload           5
    //   55  136:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   56  139:ldc2            #650 <String "-">
    //   57  142:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   58  145:aload           6
    //   59  147:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   60  150:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   61  153:astore          5
    //   62  155:new             #81  <Class StringBuilder>
    //   63  158:dup             
    //   64  159:invokespecial   #84  <Method void StringBuilder()>
    //   65  162:getstatic       #655 <Field String Build.MODEL>
    //   66  165:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   67  168:ldc2            #657 <String " Build/">
    //   68  171:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   69  174:getstatic       #660 <Field String Build.ID>
    //   70  177:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   71  180:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   72  183:astore          7
    //   73  185:new             #81  <Class StringBuilder>
    //   74  188:dup             
    //   75  189:invokespecial   #84  <Method void StringBuilder()>
    //   76  192:ldc2            #662 <String "Mozilla/5.0 (">
    //   77  195:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   78  198:aload_2         
    //   79  199:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   80  202:ldc2            #664 <String "; U; ">
    //   81  205:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   82  208:aload_3         
    //   83  209:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   84  212:ldc2            #666 <String "; ">
    //   85  215:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   86  218:aload           5
    //   87  220:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   88  223:ldc2            #666 <String "; ">
    //   89  226:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   90  229:aload           7
    //   91  231:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   92  234:ldc2            #668 <String ") AppleWebKit/0.0 (KHTML, like ">
    //   93  237:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   94  240:ldc2            #670 <String "Gecko) Version/0.0 Mobile Safari/0.0">
    //   95  243:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   96  246:invokevirtual   #94  <Method String StringBuilder.toString()>
    //   97  249:astore_1        
    //   98  250:new             #81  <Class StringBuilder>
    //   99  253:dup             
    //  100  254:invokespecial   #84  <Method void StringBuilder()>
    //  101  257:aload_1         
    //  102  258:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  103  261:ldc2            #672 <String " (Mobile; ">
    //  104  264:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  105  267:ldc2            #674 <String "afma-sdk-a-v">
    //  106  270:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  107  273:ldc2            #676 <String "6.4.1">
    //  108  276:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  109  279:ldc2            #678 <String ")">
    //  110  282:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //  111  285:invokevirtual   #94  <Method String StringBuilder.toString()>
    //  112  288:putstatic       #42  <Field String i>
    //  113  291:getstatic       #42  <Field String i>
    //  114  294:areturn         
    }

    public static final int a;
    private static Boolean b;
    private static String c;
    private static String d;
    private static String e;
    private static AudioManager f;
    private static boolean g;
    private static boolean h;
    private static String i;
}
