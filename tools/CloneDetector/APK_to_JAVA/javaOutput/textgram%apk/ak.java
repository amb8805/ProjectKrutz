// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.ads:
//            aj, ap, an, aq, 
//            ao

public class ak extends aj
{
    static class a extends Exception
    {

        public a()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Exception()>
        //    2    4:return          
        }

        public a(Throwable throwable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void Exception(Throwable)>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #20  <Field Method d>
    //    2    4:aconst_null     
    //    3    5:putstatic       #22  <Field Method e>
    //    4    8:aconst_null     
    //    5    9:putstatic       #24  <Field Method f>
    //    6   12:aconst_null     
    //    7   13:putstatic       #26  <Field Method g>
    //    8   16:aconst_null     
    //    9   17:putstatic       #28  <Field Method h>
    //   10   20:aconst_null     
    //   11   21:putstatic       #30  <Field String i>
    //   12   24:lconst_0        
    //   13   25:putstatic       #32  <Field long j>
    //   14   28:iconst_0        
    //   15   29:putstatic       #34  <Field boolean c>
    //   16   32:return          
    }

    protected ak(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #38  <Method void aj(Context)>
    //    3    5:return          
    }

    public static ak a(String s, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #44  <Method void b(String, Context)>
    //    3    5:new             #2   <Class ak>
    //    4    8:dup             
    //    5    9:aload_1         
    //    6   10:invokespecial   #45  <Method void ak(Context)>
    //    7   13:areturn         
    }

    static String a()
        throws a
    {
    //    0    0:getstatic       #30  <Field String i>
    //    1    3:ifnonnull       14
    //    2    6:new             #48  <Class ak$a>
    //    3    9:dup             
    //    4   10:invokespecial   #50  <Method void ak$a()>
    //    5   13:athrow          
    //    6   14:getstatic       #30  <Field String i>
    //    7   17:areturn         
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws a
    {
    //    0    0:getstatic       #26  <Field Method g>
    //    1    3:ifnull          10
    //    2    6:aload_0         
    //    3    7:ifnonnull       18
    //    4   10:new             #48  <Class ak$a>
    //    5   13:dup             
    //    6   14:invokespecial   #50  <Method void ak$a()>
    //    7   17:athrow          
    // try 18 42 handler(s) 45 55
    //    8   18:getstatic       #26  <Field Method g>
    //    9   21:aconst_null     
    //   10   22:iconst_2        
    //   11   23:anewarray       Object[]
    //   12   26:dup             
    //   13   27:iconst_0        
    //   14   28:aload_0         
    //   15   29:aastore         
    //   16   30:dup             
    //   17   31:iconst_1        
    //   18   32:aload_1         
    //   19   33:aastore         
    //   20   34:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
    //   21   37:checkcast       #65  <Class ArrayList>
    //   22   40:astore          4
    //   23   42:aload           4
    //   24   44:areturn         
    // catch IllegalAccessException
    //   25   45:astore_3        
    //   26   46:new             #48  <Class ak$a>
    //   27   49:dup             
    //   28   50:aload_3         
    //   29   51:invokespecial   #68  <Method void ak$a(Throwable)>
    //   30   54:athrow          
    // catch InvocationTargetException
    //   31   55:astore_2        
    //   32   56:new             #48  <Class ak$a>
    //   33   59:dup             
    //   34   60:aload_2         
    //   35   61:invokespecial   #68  <Method void ak$a(Throwable)>
    //   36   64:athrow          
    }

    static Long b()
        throws a
    {
    //    0    0:getstatic       #20  <Field Method d>
    //    1    3:ifnonnull       14
    //    2    6:new             #48  <Class ak$a>
    //    3    9:dup             
    //    4   10:invokespecial   #50  <Method void ak$a()>
    //    5   13:athrow          
    // try 14 29 handler(s) 31 41
    //    6   14:getstatic       #20  <Field Method d>
    //    7   17:aconst_null     
    //    8   18:iconst_0        
    //    9   19:anewarray       Object[]
    //   10   22:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
    //   11   25:checkcast       #71  <Class Long>
    //   12   28:astore_2        
    //   13   29:aload_2         
    //   14   30:areturn         
    // catch IllegalAccessException
    //   15   31:astore_1        
    //   16   32:new             #48  <Class ak$a>
    //   17   35:dup             
    //   18   36:aload_1         
    //   19   37:invokespecial   #68  <Method void ak$a(Throwable)>
    //   20   40:athrow          
    // catch InvocationTargetException
    //   21   41:astore_0        
    //   22   42:new             #48  <Class ak$a>
    //   23   45:dup             
    //   24   46:aload_0         
    //   25   47:invokespecial   #68  <Method void ak$a(Throwable)>
    //   26   50:athrow          
    }

    private static String b(byte abyte0[], String s)
        throws a
    {
    // try 0 15 handler(s) 17 29 41
    //    0    0:new             #80  <Class String>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokestatic    #85  <Method byte[] an.a(byte[], String)>
    //    5    9:ldc1            #87  <String "UTF-8">
    //    6   11:invokespecial   #90  <Method void String(byte[], String)>
    //    7   14:astore_2        
    //    8   15:aload_2         
    //    9   16:areturn         
    // catch an.a
    //   10   17:astore          5
    //   11   19:new             #48  <Class ak$a>
    //   12   22:dup             
    //   13   23:aload           5
    //   14   25:invokespecial   #68  <Method void ak$a(Throwable)>
    //   15   28:athrow          
    // catch ap
    //   16   29:astore          4
    //   17   31:new             #48  <Class ak$a>
    //   18   34:dup             
    //   19   35:aload           4
    //   20   37:invokespecial   #68  <Method void ak$a(Throwable)>
    //   21   40:athrow          
    // catch UnsupportedEncodingException
    //   22   41:astore_3        
    //   23   42:new             #48  <Class ak$a>
    //   24   45:dup             
    //   25   46:aload_3         
    //   26   47:invokespecial   #68  <Method void ak$a(Throwable)>
    //   27   50:athrow          
    }

    protected static void b(String s, Context context)
    {
    //    0    0:ldc1            #2   <Class ak>
    //    1    2:monitorenter    
    // try 3 7 handler(s) 36
    //    2    3:getstatic       #34  <Field boolean c>
    //    3    6:istore_3        
    //    4    7:iload_3         
    //    5    8:ifne            32
    // try 11 32 handler(s) 47 42 36
    //    6   11:aload_0         
    //    7   12:putstatic       #30  <Field String i>
    //    8   15:aload_1         
    //    9   16:invokestatic    #94  <Method void f(Context)>
    //   10   19:invokestatic    #96  <Method Long b()>
    //   11   22:invokevirtual   #100 <Method long Long.longValue()>
    //   12   25:putstatic       #32  <Field long j>
    //   13   28:iconst_1        
    //   14   29:putstatic       #34  <Field boolean c>
    //   15   32:ldc1            #2   <Class ak>
    //   16   34:monitorexit     
    //   17   35:return          
    // finally
    //   18   36:astore_2        
    //   19   37:ldc1            #2   <Class ak>
    //   20   39:monitorexit     
    //   21   40:aload_2         
    //   22   41:athrow          
    // catch UnsupportedOperationException
    //   23   42:astore          5
    //   24   44:goto            32
    // catch a
    //   25   47:astore          4
    //   26   49:goto            32
    }

    static String c()
        throws a
    {
    //    0    0:getstatic       #22  <Field Method e>
    //    1    3:ifnonnull       14
    //    2    6:new             #48  <Class ak$a>
    //    3    9:dup             
    //    4   10:invokespecial   #50  <Method void ak$a()>
    //    5   13:athrow          
    // try 14 29 handler(s) 31 41
    //    6   14:getstatic       #22  <Field Method e>
    //    7   17:aconst_null     
    //    8   18:iconst_0        
    //    9   19:anewarray       Object[]
    //   10   22:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
    //   11   25:checkcast       #80  <Class String>
    //   12   28:astore_2        
    //   13   29:aload_2         
    //   14   30:areturn         
    // catch IllegalAccessException
    //   15   31:astore_1        
    //   16   32:new             #48  <Class ak$a>
    //   17   35:dup             
    //   18   36:aload_1         
    //   19   37:invokespecial   #68  <Method void ak$a(Throwable)>
    //   20   40:athrow          
    // catch InvocationTargetException
    //   21   41:astore_0        
    //   22   42:new             #48  <Class ak$a>
    //   23   45:dup             
    //   24   46:aload_0         
    //   25   47:invokespecial   #68  <Method void ak$a(Throwable)>
    //   26   50:athrow          
    }

    static String d(Context context)
        throws a
    {
    //    0    0:getstatic       #28  <Field Method h>
    //    1    3:ifnonnull       14
    //    2    6:new             #48  <Class ak$a>
    //    3    9:dup             
    //    4   10:invokespecial   #50  <Method void ak$a()>
    //    5   13:athrow          
    // try 14 33 handler(s) 45 55
    //    6   14:getstatic       #28  <Field Method h>
    //    7   17:aconst_null     
    //    8   18:iconst_1        
    //    9   19:anewarray       Object[]
    //   10   22:dup             
    //   11   23:iconst_0        
    //   12   24:aload_0         
    //   13   25:aastore         
    //   14   26:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
    //   15   29:checkcast       #80  <Class String>
    //   16   32:astore_3        
    //   17   33:aload_3         
    //   18   34:ifnonnull       65
    // try 37 45 handler(s) 45 55
    //   19   37:new             #48  <Class ak$a>
    //   20   40:dup             
    //   21   41:invokespecial   #50  <Method void ak$a()>
    //   22   44:athrow          
    // catch IllegalAccessException IllegalAccessException
    //   23   45:astore_2        
    //   24   46:new             #48  <Class ak$a>
    //   25   49:dup             
    //   26   50:aload_2         
    //   27   51:invokespecial   #68  <Method void ak$a(Throwable)>
    //   28   54:athrow          
    // catch InvocationTargetException InvocationTargetException
    //   29   55:astore_1        
    //   30   56:new             #48  <Class ak$a>
    //   31   59:dup             
    //   32   60:aload_1         
    //   33   61:invokespecial   #68  <Method void ak$a(Throwable)>
    //   34   64:athrow          
    //   35   65:aload_3         
    //   36   66:areturn         
    }

    static String e(Context context)
        throws a
    {
    //    0    0:getstatic       #24  <Field Method f>
    //    1    3:ifnonnull       14
    //    2    6:new             #48  <Class ak$a>
    //    3    9:dup             
    //    4   10:invokespecial   #50  <Method void ak$a()>
    //    5   13:athrow          
    // try 14 33 handler(s) 45 68
    //    6   14:getstatic       #24  <Field Method f>
    //    7   17:aconst_null     
    //    8   18:iconst_1        
    //    9   19:anewarray       Object[]
    //   10   22:dup             
    //   11   23:iconst_0        
    //   12   24:aload_0         
    //   13   25:aastore         
    //   14   26:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
    //   15   29:checkcast       #103 <Class ByteBuffer>
    //   16   32:astore_3        
    //   17   33:aload_3         
    //   18   34:ifnonnull       55
    // try 37 45 handler(s) 45 68
    //   19   37:new             #48  <Class ak$a>
    //   20   40:dup             
    //   21   41:invokespecial   #50  <Method void ak$a()>
    //   22   44:athrow          
    // catch IllegalAccessException IllegalAccessException IllegalAccessException
    //   23   45:astore_2        
    //   24   46:new             #48  <Class ak$a>
    //   25   49:dup             
    //   26   50:aload_2         
    //   27   51:invokespecial   #68  <Method void ak$a(Throwable)>
    //   28   54:athrow          
    // try 55 65 handler(s) 45 68
    //   29   55:aload_3         
    //   30   56:invokevirtual   #107 <Method byte[] ByteBuffer.array()>
    //   31   59:iconst_0        
    //   32   60:invokestatic    #112 <Method String aq.a(byte[], boolean)>
    //   33   63:astore          4
    //   34   65:aload           4
    //   35   67:areturn         
    // catch InvocationTargetException InvocationTargetException InvocationTargetException
    //   36   68:astore_1        
    //   37   69:new             #48  <Class ak$a>
    //   38   72:dup             
    //   39   73:aload_1         
    //   40   74:invokespecial   #68  <Method void ak$a(Throwable)>
    //   41   77:athrow          
    }

    private static void f(Context context)
        throws a
    {
    // try 0 24 handler(s) 51 356 368 380 392 402 412
    //    0    0:invokestatic    #126 <Method String ao.a()>
    //    1    3:invokestatic    #129 <Method byte[] an.a(String)>
    //    2    6:astore          8
    //    3    8:aload           8
    //    4   10:invokestatic    #131 <Method String ao.b()>
    //    5   13:invokestatic    #85  <Method byte[] an.a(byte[], String)>
    //    6   16:astore          9
    //    7   18:aload_0         
    //    8   19:invokevirtual   #137 <Method File Context.getCacheDir()>
    //    9   22:astore          10
    //   10   24:aload           10
    //   11   26:ifnonnull       63
    // try 29 38 handler(s) 51 356 368 380 392 402 412
    //   12   29:aload_0         
    //   13   30:ldc1            #139 <String "dex">
    //   14   32:iconst_0        
    //   15   33:invokevirtual   #143 <Method File Context.getDir(String, int)>
    //   16   36:astore          10
    //   17   38:aload           10
    //   18   40:ifnonnull       63
    // try 43 51 handler(s) 51 356 368 380 392 402 412
    //   19   43:new             #48  <Class ak$a>
    //   20   46:dup             
    //   21   47:invokespecial   #50  <Method void ak$a()>
    //   22   50:athrow          
    // catch ap ap ap ap
    //   23   51:astore          7
    //   24   53:new             #48  <Class ak$a>
    //   25   56:dup             
    //   26   57:aload           7
    //   27   59:invokespecial   #68  <Method void ak$a(Throwable)>
    //   28   62:athrow          
    // try 63 355 handler(s) 51 356 368 380 392 402 412
    //   29   63:ldc1            #145 <String "ads">
    //   30   65:ldc1            #147 <String ".jar">
    //   31   67:aload           10
    //   32   69:invokestatic    #153 <Method File File.createTempFile(String, String, File)>
    //   33   72:astore          11
    //   34   74:new             #155 <Class FileOutputStream>
    //   35   77:dup             
    //   36   78:aload           11
    //   37   80:invokespecial   #158 <Method void FileOutputStream(File)>
    //   38   83:astore          12
    //   39   85:aload           12
    //   40   87:aload           9
    //   41   89:iconst_0        
    //   42   90:aload           9
    //   43   92:arraylength     
    //   44   93:invokevirtual   #162 <Method void FileOutputStream.write(byte[], int, int)>
    //   45   96:aload           12
    //   46   98:invokevirtual   #165 <Method void FileOutputStream.close()>
    //   47  101:new             #167 <Class DexClassLoader>
    //   48  104:dup             
    //   49  105:aload           11
    //   50  107:invokevirtual   #170 <Method String File.getAbsolutePath()>
    //   51  110:aload           10
    //   52  112:invokevirtual   #170 <Method String File.getAbsolutePath()>
    //   53  115:aconst_null     
    //   54  116:aload_0         
    //   55  117:invokevirtual   #174 <Method ClassLoader Context.getClassLoader()>
    //   56  120:invokespecial   #177 <Method void DexClassLoader(String, String, String, ClassLoader)>
    //   57  123:astore          13
    //   58  125:aload           13
    //   59  127:aload           8
    //   60  129:invokestatic    #179 <Method String ao.c()>
    //   61  132:invokestatic    #181 <Method String b(byte[], String)>
    //   62  135:invokevirtual   #185 <Method Class DexClassLoader.loadClass(String)>
    //   63  138:astore          14
    //   64  140:aload           13
    //   65  142:aload           8
    //   66  144:invokestatic    #187 <Method String ao.i()>
    //   67  147:invokestatic    #181 <Method String b(byte[], String)>
    //   68  150:invokevirtual   #185 <Method Class DexClassLoader.loadClass(String)>
    //   69  153:astore          15
    //   70  155:aload           13
    //   71  157:aload           8
    //   72  159:invokestatic    #189 <Method String ao.g()>
    //   73  162:invokestatic    #181 <Method String b(byte[], String)>
    //   74  165:invokevirtual   #185 <Method Class DexClassLoader.loadClass(String)>
    //   75  168:astore          16
    //   76  170:aload           13
    //   77  172:aload           8
    //   78  174:invokestatic    #192 <Method String ao.k()>
    //   79  177:invokestatic    #181 <Method String b(byte[], String)>
    //   80  180:invokevirtual   #185 <Method Class DexClassLoader.loadClass(String)>
    //   81  183:astore          17
    //   82  185:aload           13
    //   83  187:aload           8
    //   84  189:invokestatic    #194 <Method String ao.e()>
    //   85  192:invokestatic    #181 <Method String b(byte[], String)>
    //   86  195:invokevirtual   #185 <Method Class DexClassLoader.loadClass(String)>
    //   87  198:astore          18
    //   88  200:aload           14
    //   89  202:aload           8
    //   90  204:invokestatic    #196 <Method String ao.d()>
    //   91  207:invokestatic    #181 <Method String b(byte[], String)>
    //   92  210:iconst_0        
    //   93  211:anewarray       Class[]
    //   94  214:invokevirtual   #202 <Method Method Class.getMethod(String, Class[])>
    //   95  217:putstatic       #20  <Field Method d>
    //   96  220:aload           15
    //   97  222:aload           8
    //   98  224:invokestatic    #204 <Method String ao.j()>
    //   99  227:invokestatic    #181 <Method String b(byte[], String)>
    //  100  230:iconst_0        
    //  101  231:anewarray       Class[]
    //  102  234:invokevirtual   #202 <Method Method Class.getMethod(String, Class[])>
    //  103  237:putstatic       #22  <Field Method e>
    //  104  240:aload           16
    //  105  242:aload           8
    //  106  244:invokestatic    #206 <Method String ao.h()>
    //  107  247:invokestatic    #181 <Method String b(byte[], String)>
    //  108  250:iconst_1        
    //  109  251:anewarray       Class[]
    //  110  254:dup             
    //  111  255:iconst_0        
    //  112  256:ldc1            #133 <Class Context>
    //  113  258:aastore         
    //  114  259:invokevirtual   #202 <Method Method Class.getMethod(String, Class[])>
    //  115  262:putstatic       #24  <Field Method f>
    //  116  265:aload           17
    //  117  267:aload           8
    //  118  269:invokestatic    #209 <Method String ao.l()>
    //  119  272:invokestatic    #181 <Method String b(byte[], String)>
    //  120  275:iconst_2        
    //  121  276:anewarray       Class[]
    //  122  279:dup             
    //  123  280:iconst_0        
    //  124  281:ldc1            #211 <Class MotionEvent>
    //  125  283:aastore         
    //  126  284:dup             
    //  127  285:iconst_1        
    //  128  286:ldc1            #213 <Class DisplayMetrics>
    //  129  288:aastore         
    //  130  289:invokevirtual   #202 <Method Method Class.getMethod(String, Class[])>
    //  131  292:putstatic       #26  <Field Method g>
    //  132  295:aload           18
    //  133  297:aload           8
    //  134  299:invokestatic    #215 <Method String ao.f()>
    //  135  302:invokestatic    #181 <Method String b(byte[], String)>
    //  136  305:iconst_1        
    //  137  306:anewarray       Class[]
    //  138  309:dup             
    //  139  310:iconst_0        
    //  140  311:ldc1            #133 <Class Context>
    //  141  313:aastore         
    //  142  314:invokevirtual   #202 <Method Method Class.getMethod(String, Class[])>
    //  143  317:putstatic       #28  <Field Method h>
    //  144  320:aload           11
    //  145  322:invokevirtual   #218 <Method String File.getName()>
    //  146  325:astore          19
    //  147  327:aload           11
    //  148  329:invokevirtual   #222 <Method boolean File.delete()>
    //  149  332:pop             
    //  150  333:new             #149 <Class File>
    //  151  336:dup             
    //  152  337:aload           10
    //  153  339:aload           19
    //  154  341:ldc1            #147 <String ".jar">
    //  155  343:ldc1            #224 <String ".dex">
    //  156  345:invokevirtual   #228 <Method String String.replace(CharSequence, CharSequence)>
    //  157  348:invokespecial   #231 <Method void File(File, String)>
    //  158  351:invokevirtual   #222 <Method boolean File.delete()>
    //  159  354:pop             
    //  160  355:return          
    // catch FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException
    //  161  356:astore          6
    //  162  358:new             #48  <Class ak$a>
    //  163  361:dup             
    //  164  362:aload           6
    //  165  364:invokespecial   #68  <Method void ak$a(Throwable)>
    //  166  367:athrow          
    // catch IOException IOException IOException IOException
    //  167  368:astore          5
    //  168  370:new             #48  <Class ak$a>
    //  169  373:dup             
    //  170  374:aload           5
    //  171  376:invokespecial   #68  <Method void ak$a(Throwable)>
    //  172  379:athrow          
    // catch ClassNotFoundException ClassNotFoundException ClassNotFoundException ClassNotFoundException
    //  173  380:astore          4
    //  174  382:new             #48  <Class ak$a>
    //  175  385:dup             
    //  176  386:aload           4
    //  177  388:invokespecial   #68  <Method void ak$a(Throwable)>
    //  178  391:athrow          
    // catch an.a an.a an.a an.a
    //  179  392:astore_3        
    //  180  393:new             #48  <Class ak$a>
    //  181  396:dup             
    //  182  397:aload_3         
    //  183  398:invokespecial   #68  <Method void ak$a(Throwable)>
    //  184  401:athrow          
    // catch NoSuchMethodException NoSuchMethodException NoSuchMethodException NoSuchMethodException
    //  185  402:astore_2        
    //  186  403:new             #48  <Class ak$a>
    //  187  406:dup             
    //  188  407:aload_2         
    //  189  408:invokespecial   #68  <Method void ak$a(Throwable)>
    //  190  411:athrow          
    // catch NullPointerException NullPointerException NullPointerException NullPointerException
    //  191  412:astore_1        
    //  192  413:new             #48  <Class ak$a>
    //  193  416:dup             
    //  194  417:aload_1         
    //  195  418:invokespecial   #68  <Method void ak$a(Throwable)>
    //  196  421:athrow          
    }

    protected void b(Context context)
    {
    // try 0 8 handler(s) 54 39
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokestatic    #232 <Method String c()>
    //    3    5:invokevirtual   #235 <Method void a(int, String)>
    // try 8 16 handler(s) 50 39
    //    4    8:aload_0         
    //    5    9:iconst_2        
    //    6   10:invokestatic    #236 <Method String a()>
    //    7   13:invokevirtual   #235 <Method void a(int, String)>
    // try 16 28 handler(s) 45 39
    //    8   16:aload_0         
    //    9   17:bipush          25
    //   10   19:invokestatic    #96  <Method Long b()>
    //   11   22:invokevirtual   #100 <Method long Long.longValue()>
    //   12   25:invokevirtual   #239 <Method void a(int, long)>
    // try 28 38 handler(s) 42 39
    //   13   28:aload_0         
    //   14   29:bipush          24
    //   15   31:aload_1         
    //   16   32:invokestatic    #241 <Method String d(Context)>
    //   17   35:invokevirtual   #235 <Method void a(int, String)>
    //   18   38:return          
    // catch IOException IOException IOException IOException
    //   19   39:astore          6
    //   20   41:return          
    // catch a
    //   21   42:astore          5
    //   22   44:return          
    // catch a
    //   23   45:astore          4
    //   24   47:goto            28
    // catch a
    //   25   50:astore_3        
    //   26   51:goto            16
    // catch a
    //   27   54:astore_2        
    //   28   55:goto            8
    }

    protected void c(Context context)
    {
    // try 0 8 handler(s) 168 148
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:invokestatic    #236 <Method String a()>
    //    3    5:invokevirtual   #235 <Method void a(int, String)>
    // try 8 16 handler(s) 164 148
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:invokestatic    #232 <Method String c()>
    //    7   13:invokevirtual   #235 <Method void a(int, String)>
    // try 16 61 handler(s) 159 148
    //    8   16:invokestatic    #96  <Method Long b()>
    //    9   19:invokevirtual   #100 <Method long Long.longValue()>
    //   10   22:lstore          9
    //   11   24:aload_0         
    //   12   25:bipush          25
    //   13   27:lload           9
    //   14   29:invokevirtual   #239 <Method void a(int, long)>
    //   15   32:getstatic       #32  <Field long j>
    //   16   35:lconst_0        
    //   17   36:lcmp            
    //   18   37:ifeq            61
    //   19   40:aload_0         
    //   20   41:bipush          17
    //   21   43:lload           9
    //   22   45:getstatic       #32  <Field long j>
    //   23   48:lsub            
    //   24   49:invokevirtual   #239 <Method void a(int, long)>
    //   25   52:aload_0         
    //   26   53:bipush          23
    //   27   55:getstatic       #32  <Field long j>
    //   28   58:invokevirtual   #239 <Method void a(int, long)>
    // try 61 137 handler(s) 154 148
    //   29   61:aload_0         
    //   30   62:getfield        #244 <Field MotionEvent a>
    //   31   65:aload_0         
    //   32   66:getfield        #247 <Field DisplayMetrics b>
    //   33   69:invokestatic    #249 <Method ArrayList a(MotionEvent, DisplayMetrics)>
    //   34   72:astore          8
    //   35   74:aload_0         
    //   36   75:bipush          14
    //   37   77:aload           8
    //   38   79:iconst_0        
    //   39   80:invokevirtual   #253 <Method Object ArrayList.get(int)>
    //   40   83:checkcast       #71  <Class Long>
    //   41   86:invokevirtual   #100 <Method long Long.longValue()>
    //   42   89:invokevirtual   #239 <Method void a(int, long)>
    //   43   92:aload_0         
    //   44   93:bipush          15
    //   45   95:aload           8
    //   46   97:iconst_1        
    //   47   98:invokevirtual   #253 <Method Object ArrayList.get(int)>
    //   48  101:checkcast       #71  <Class Long>
    //   49  104:invokevirtual   #100 <Method long Long.longValue()>
    //   50  107:invokevirtual   #239 <Method void a(int, long)>
    //   51  110:aload           8
    //   52  112:invokevirtual   #257 <Method int ArrayList.size()>
    //   53  115:iconst_3        
    //   54  116:icmplt          137
    //   55  119:aload_0         
    //   56  120:bipush          16
    //   57  122:aload           8
    //   58  124:iconst_2        
    //   59  125:invokevirtual   #253 <Method Object ArrayList.get(int)>
    //   60  128:checkcast       #71  <Class Long>
    //   61  131:invokevirtual   #100 <Method long Long.longValue()>
    //   62  134:invokevirtual   #239 <Method void a(int, long)>
    // try 137 147 handler(s) 151 148
    //   63  137:aload_0         
    //   64  138:bipush          27
    //   65  140:aload_1         
    //   66  141:invokestatic    #259 <Method String e(Context)>
    //   67  144:invokevirtual   #235 <Method void a(int, String)>
    //   68  147:return          
    // catch IOException IOException IOException IOException IOException
    //   69  148:astore          7
    //   70  150:return          
    // catch a
    //   71  151:astore          6
    //   72  153:return          
    // catch a
    //   73  154:astore          5
    //   74  156:goto            137
    // catch a
    //   75  159:astore          4
    //   76  161:goto            61
    // catch a
    //   77  164:astore_3        
    //   78  165:goto            16
    // catch a
    //   79  168:astore_2        
    //   80  169:goto            8
    }

    static boolean c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static String i;
    private static long j;
}
