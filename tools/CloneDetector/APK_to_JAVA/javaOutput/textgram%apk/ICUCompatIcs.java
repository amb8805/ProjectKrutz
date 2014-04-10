// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ICUCompatIcs
{

    static 
    {
    // try 0 6 handler(s) 47
    //    0    0:ldc1            #17  <String "libcore.icu.ICU">
    //    1    2:invokestatic    #23  <Method Class Class.forName(String)>
    //    2    5:astore_2        
    //    3    6:aload_2         
    //    4    7:ifnull          46
    // try 10 46 handler(s) 47
    //    5   10:aload_2         
    //    6   11:ldc1            #25  <String "getScript">
    //    7   13:iconst_1        
    //    8   14:anewarray       Class[]
    //    9   17:dup             
    //   10   18:iconst_0        
    //   11   19:ldc1            #27  <Class String>
    //   12   21:aastore         
    //   13   22:invokevirtual   #31  <Method Method Class.getMethod(String, Class[])>
    //   14   25:putstatic       #33  <Field Method sGetScriptMethod>
    //   15   28:aload_2         
    //   16   29:ldc1            #35  <String "addLikelySubtags">
    //   17   31:iconst_1        
    //   18   32:anewarray       Class[]
    //   19   35:dup             
    //   20   36:iconst_0        
    //   21   37:ldc1            #27  <Class String>
    //   22   39:aastore         
    //   23   40:invokevirtual   #31  <Method Method Class.getMethod(String, Class[])>
    //   24   43:putstatic       #37  <Field Method sAddLikelySubtagsMethod>
    //   25   46:return          
    // catch Exception Exception
    //   26   47:astore_0        
    //   27   48:ldc1            #8   <String "ICUCompatIcs">
    //   28   50:aload_0         
    //   29   51:invokestatic    #43  <Method int Log.w(String, Throwable)>
    //   30   54:pop             
    //   31   55:return          
    }

    ICUCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #46  <Method void Object()>
    //    2    4:return          
    }

    public static String addLikelySubtags(String s)
    {
    // try 0 30 handler(s) 33 43
    //    0    0:getstatic       #37  <Field Method sAddLikelySubtagsMethod>
    //    1    3:ifnull          41
    //    2    6:iconst_1        
    //    3    7:anewarray       Object[]
    //    4   10:dup             
    //    5   11:iconst_0        
    //    6   12:aload_0         
    //    7   13:aastore         
    //    8   14:astore          5
    //    9   16:getstatic       #37  <Field Method sAddLikelySubtagsMethod>
    //   10   19:aconst_null     
    //   11   20:aload           5
    //   12   22:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
    //   13   25:checkcast       #27  <Class String>
    //   14   28:astore          6
    //   15   30:aload           6
    //   16   32:areturn         
    // catch IllegalAccessException
    //   17   33:astore_3        
    //   18   34:ldc1            #8   <String "ICUCompatIcs">
    //   19   36:aload_3         
    //   20   37:invokestatic    #43  <Method int Log.w(String, Throwable)>
    //   21   40:pop             
    //   22   41:aload_0         
    //   23   42:areturn         
    // catch InvocationTargetException
    //   24   43:astore_1        
    //   25   44:ldc1            #8   <String "ICUCompatIcs">
    //   26   46:aload_1         
    //   27   47:invokestatic    #43  <Method int Log.w(String, Throwable)>
    //   28   50:pop             
    //   29   51:goto            41
    }

    public static String getScript(String s)
    {
    // try 0 30 handler(s) 33 43
    //    0    0:getstatic       #33  <Field Method sGetScriptMethod>
    //    1    3:ifnull          41
    //    2    6:iconst_1        
    //    3    7:anewarray       Object[]
    //    4   10:dup             
    //    5   11:iconst_0        
    //    6   12:aload_0         
    //    7   13:aastore         
    //    8   14:astore          5
    //    9   16:getstatic       #33  <Field Method sGetScriptMethod>
    //   10   19:aconst_null     
    //   11   20:aload           5
    //   12   22:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
    //   13   25:checkcast       #27  <Class String>
    //   14   28:astore          6
    //   15   30:aload           6
    //   16   32:areturn         
    // catch IllegalAccessException
    //   17   33:astore_3        
    //   18   34:ldc1            #8   <String "ICUCompatIcs">
    //   19   36:aload_3         
    //   20   37:invokestatic    #43  <Method int Log.w(String, Throwable)>
    //   21   40:pop             
    //   22   41:aconst_null     
    //   23   42:areturn         
    // catch InvocationTargetException
    //   24   43:astore_1        
    //   25   44:ldc1            #8   <String "ICUCompatIcs">
    //   26   46:aload_1         
    //   27   47:invokestatic    #43  <Method int Log.w(String, Throwable)>
    //   28   50:pop             
    //   29   51:goto            41
    }

    private static final String TAG = "ICUCompatIcs";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;
}
