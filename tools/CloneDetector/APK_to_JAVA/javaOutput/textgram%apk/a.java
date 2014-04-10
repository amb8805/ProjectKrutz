// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.text.TextUtils;
import android.util.Log;

public class com.google.ads.util.a
{
    public static class a extends Error
    {

        public a(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #8   <Method void Error(String)>
        //    3    5:return          
        }
    }


    static 
    {
    //    0    0:ldc1            #10  <String "GoogleAdsAssertion">
    //    1    2:iconst_3        
    //    2    3:invokestatic    #16  <Method boolean Log.isLoggable(String, int)>
    //    3    6:putstatic       #18  <Field boolean a>
    //    4    9:return          
    }

    public static void a(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       13
    //    2    4:iconst_1        
    //    3    5:istore_1        
    //    4    6:iload_1         
    //    5    7:ldc1            #21  <String "Assertion that an object is null failed.">
    //    6    9:invokestatic    #25  <Method void c(boolean, String)>
    //    7   12:return          
    //    8   13:iconst_0        
    //    9   14:istore_1        
    //   10   15:goto            6
    }

    public static void a(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:if_acmpne       40
    //    3    5:iconst_1        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:new             #28  <Class StringBuilder>
    //    7   11:dup             
    //    8   12:invokespecial   #31  <Method void StringBuilder()>
    //    9   15:ldc1            #33  <String "Assertion that 'a' and 'b' refer to the same object failed.a: ">
    //   10   17:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
    //   11   20:aload_0         
    //   12   21:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
    //   13   24:ldc1            #42  <String ", b: ">
    //   14   26:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
    //   15   29:aload_1         
    //   16   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
    //   17   33:invokevirtual   #46  <Method String StringBuilder.toString()>
    //   18   36:invokestatic    #25  <Method void c(boolean, String)>
    //   19   39:return          
    //   20   40:iconst_0        
    //   21   41:istore_2        
    //   22   42:goto            7
    }

    public static void a(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #53  <Method boolean TextUtils.isEmpty(CharSequence)>
    //    2    4:ifne            33
    //    3    7:iconst_1        
    //    4    8:istore_1        
    //    5    9:iload_1         
    //    6   10:new             #28  <Class StringBuilder>
    //    7   13:dup             
    //    8   14:invokespecial   #31  <Method void StringBuilder()>
    //    9   17:ldc1            #55  <String "Expected a non empty string, got: ">
    //   10   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
    //   11   22:aload_0         
    //   12   23:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
    //   13   26:invokevirtual   #46  <Method String StringBuilder.toString()>
    //   14   29:invokestatic    #25  <Method void c(boolean, String)>
    //   15   32:return          
    //   16   33:iconst_0        
    //   17   34:istore_1        
    //   18   35:goto            9
    }

    public static void a(boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:ldc1            #58  <String "Assertion failed.">
    //    2    3:invokestatic    #25  <Method void c(boolean, String)>
    //    3    6:return          
    }

    public static void a(boolean flag, String s)
    {
    //    0    0:iload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #25  <Method void c(boolean, String)>
    //    3    5:return          
    }

    public static void b(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          13
    //    2    4:iconst_1        
    //    3    5:istore_1        
    //    4    6:iload_1         
    //    5    7:ldc1            #61  <String "Assertion that an object is not null failed.">
    //    6    9:invokestatic    #25  <Method void c(boolean, String)>
    //    7   12:return          
    //    8   13:iconst_0        
    //    9   14:istore_1        
    //   10   15:goto            6
    }

    public static void b(boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:ifne            13
    //    2    4:iconst_1        
    //    3    5:istore_1        
    //    4    6:iload_1         
    //    5    7:ldc1            #58  <String "Assertion failed.">
    //    6    9:invokestatic    #25  <Method void c(boolean, String)>
    //    7   12:return          
    //    8   13:iconst_0        
    //    9   14:istore_1        
    //   10   15:goto            6
    }

    public static void b(boolean flag, String s)
    {
    //    0    0:iload_0         
    //    1    1:ifne            12
    //    2    4:iconst_1        
    //    3    5:istore_2        
    //    4    6:iload_2         
    //    5    7:aload_1         
    //    6    8:invokestatic    #25  <Method void c(boolean, String)>
    //    7   11:return          
    //    8   12:iconst_0        
    //    9   13:istore_2        
    //   10   14:goto            6
    }

    private static void c(boolean flag, String s)
    {
    //    0    0:ldc1            #10  <String "GoogleAdsAssertion">
    //    1    2:iconst_3        
    //    2    3:invokestatic    #16  <Method boolean Log.isLoggable(String, int)>
    //    3    6:ifne            16
    //    4    9:getstatic       #18  <Field boolean a>
    //    5   12:ifne            16
    //    6   15:return          
    //    7   16:iload_0         
    //    8   17:ifne            15
    //    9   20:new             #63  <Class a$a>
    //   10   23:dup             
    //   11   24:aload_1         
    //   12   25:invokespecial   #65  <Method void a$a(String)>
    //   13   28:astore_2        
    //   14   29:ldc1            #10  <String "GoogleAdsAssertion">
    //   15   31:aload_1         
    //   16   32:aload_2         
    //   17   33:invokestatic    #69  <Method int Log.d(String, String, Throwable)>
    //   18   36:pop             
    //   19   37:aload_2         
    //   20   38:athrow          
    }

    private static boolean a;
}
