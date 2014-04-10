// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.util.Log;

public final class com.google.ads.util.b
{
    public static final class a extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class b$a>
        //    1    3:dup             
        //    2    4:ldc1            #19  <String "VERBOSE">
        //    3    6:iconst_0        
        //    4    7:iconst_2        
        //    5    8:invokespecial   #23  <Method void b$a(String, int, int)>
        //    6   11:putstatic       #25  <Field b$a a>
        //    7   14:new             #2   <Class b$a>
        //    8   17:dup             
        //    9   18:ldc1            #27  <String "DEBUG">
        //   10   20:iconst_1        
        //   11   21:iconst_3        
        //   12   22:invokespecial   #23  <Method void b$a(String, int, int)>
        //   13   25:putstatic       #29  <Field b$a b>
        //   14   28:new             #2   <Class b$a>
        //   15   31:dup             
        //   16   32:ldc1            #31  <String "INFO">
        //   17   34:iconst_2        
        //   18   35:iconst_4        
        //   19   36:invokespecial   #23  <Method void b$a(String, int, int)>
        //   20   39:putstatic       #33  <Field b$a c>
        //   21   42:new             #2   <Class b$a>
        //   22   45:dup             
        //   23   46:ldc1            #35  <String "WARN">
        //   24   48:iconst_3        
        //   25   49:iconst_5        
        //   26   50:invokespecial   #23  <Method void b$a(String, int, int)>
        //   27   53:putstatic       #37  <Field b$a d>
        //   28   56:new             #2   <Class b$a>
        //   29   59:dup             
        //   30   60:ldc1            #39  <String "ERROR">
        //   31   62:iconst_4        
        //   32   63:bipush          6
        //   33   65:invokespecial   #23  <Method void b$a(String, int, int)>
        //   34   68:putstatic       #41  <Field b$a e>
        //   35   71:iconst_5        
        //   36   72:anewarray       a[]
        //   37   75:astore_0        
        //   38   76:aload_0         
        //   39   77:iconst_0        
        //   40   78:getstatic       #25  <Field b$a a>
        //   41   81:aastore         
        //   42   82:aload_0         
        //   43   83:iconst_1        
        //   44   84:getstatic       #29  <Field b$a b>
        //   45   87:aastore         
        //   46   88:aload_0         
        //   47   89:iconst_2        
        //   48   90:getstatic       #33  <Field b$a c>
        //   49   93:aastore         
        //   50   94:aload_0         
        //   51   95:iconst_3        
        //   52   96:getstatic       #37  <Field b$a d>
        //   53   99:aastore         
        //   54  100:aload_0         
        //   55  101:iconst_4        
        //   56  102:getstatic       #41  <Field b$a e>
        //   57  105:aastore         
        //   58  106:aload_0         
        //   59  107:putstatic       #43  <Field b$a[] g>
        //   60  110:return          
        }

        private a(String s, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #46  <Method void Enum(String, int)>
        //    4    6:aload_0         
        //    5    7:iload_3         
        //    6    8:putfield        #48  <Field int f>
        //    7   11:return          
        }

        public static a valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class b$a>
        //    1    2:aload_0         
        //    2    3:invokestatic    #53  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class b$a>
        //    4    9:areturn         
        }

        public static a[] values()
        {
        //    0    0:getstatic       #43  <Field b$a[] g>
        //    1    3:invokevirtual   #60  <Method Object _5B_Lcom.google.ads.util.b$a_3B_.clone()>
        //    2    6:checkcast       #56  <Class b$a[]>
        //    3    9:areturn         
        }

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        public final int f;
    }

    public static interface b
    {

        public abstract void a(a a1, String s, Throwable throwable);
    }


    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #12  <Field b$b a>
    //    2    4:iconst_5        
    //    3    5:putstatic       #14  <Field int b>
    //    4    8:return          
    }

    private static void a(a a1, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokestatic    #18  <Method void a(b$a, String, Throwable)>
    //    4    6:return          
    }

    private static void a(a a1, String s, Throwable throwable)
    {
    //    0    0:getstatic       #12  <Field b$b a>
    //    1    3:ifnull          17
    //    2    6:getstatic       #12  <Field b$b a>
    //    3    9:aload_0         
    //    4   10:aload_1         
    //    5   11:aload_2         
    //    6   12:invokeinterface #21  <Method void b$b.a(b$a, String, Throwable)>
    //    7   17:return          
    }

    public static void a(String s)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_3        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            16
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:invokestatic    #33  <Method int Log.d(String, String)>
    //    7   15:pop             
    //    8   16:getstatic       #38  <Field b$a b$a.b>
    //    9   19:aload_0         
    //   10   20:invokestatic    #40  <Method void a(b$a, String)>
    //   11   23:return          
    }

    public static void a(String s, Throwable throwable)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_3        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            17
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:aload_1         
    //    7   13:invokestatic    #44  <Method int Log.d(String, String, Throwable)>
    //    8   16:pop             
    //    9   17:getstatic       #38  <Field b$a b$a.b>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokestatic    #18  <Method void a(b$a, String, Throwable)>
    //   13   25:return          
    }

    private static boolean a(int i)
    {
    //    0    0:iload_0         
    //    1    1:getstatic       #14  <Field int b>
    //    2    4:icmplt          9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public static boolean a(String s, int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #47  <Method boolean a(int)>
    //    2    4:ifne            15
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:invokestatic    #50  <Method boolean Log.isLoggable(String, int)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public static void b(String s)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:bipush          6
    //    2    4:invokestatic    #27  <Method boolean a(String, int)>
    //    3    7:ifeq            17
    //    4   10:ldc1            #24  <String "Ads">
    //    5   12:aload_0         
    //    6   13:invokestatic    #53  <Method int Log.e(String, String)>
    //    7   16:pop             
    //    8   17:getstatic       #55  <Field b$a b$a.e>
    //    9   20:aload_0         
    //   10   21:invokestatic    #40  <Method void a(b$a, String)>
    //   11   24:return          
    }

    public static void b(String s, Throwable throwable)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:bipush          6
    //    2    4:invokestatic    #27  <Method boolean a(String, int)>
    //    3    7:ifeq            26
    //    4   10:ldc1            #24  <String "Ads">
    //    5   12:aload_0         
    //    6   13:invokestatic    #53  <Method int Log.e(String, String)>
    //    7   16:pop             
    //    8   17:ldc1            #24  <String "Ads">
    //    9   19:ldc1            #57  <String "The following was caught and handled:">
    //   10   21:aload_1         
    //   11   22:invokestatic    #60  <Method int Log.i(String, String, Throwable)>
    //   12   25:pop             
    //   13   26:getstatic       #55  <Field b$a b$a.e>
    //   14   29:aload_0         
    //   15   30:aload_1         
    //   16   31:invokestatic    #18  <Method void a(b$a, String, Throwable)>
    //   17   34:return          
    }

    public static void c(String s)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_4        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            16
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:invokestatic    #63  <Method int Log.i(String, String)>
    //    7   15:pop             
    //    8   16:getstatic       #65  <Field b$a b$a.c>
    //    9   19:aload_0         
    //   10   20:invokestatic    #40  <Method void a(b$a, String)>
    //   11   23:return          
    }

    public static void c(String s, Throwable throwable)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_4        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            17
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:aload_1         
    //    7   13:invokestatic    #60  <Method int Log.i(String, String, Throwable)>
    //    8   16:pop             
    //    9   17:getstatic       #65  <Field b$a b$a.c>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokestatic    #18  <Method void a(b$a, String, Throwable)>
    //   13   25:return          
    }

    public static void d(String s)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_2        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            16
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:invokestatic    #68  <Method int Log.v(String, String)>
    //    7   15:pop             
    //    8   16:getstatic       #70  <Field b$a b$a.a>
    //    9   19:aload_0         
    //   10   20:invokestatic    #40  <Method void a(b$a, String)>
    //   11   23:return          
    }

    public static void d(String s, Throwable throwable)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_5        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            25
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:invokestatic    #73  <Method int Log.w(String, String)>
    //    7   15:pop             
    //    8   16:ldc1            #24  <String "Ads">
    //    9   18:ldc1            #57  <String "The following was caught and handled:">
    //   10   20:aload_1         
    //   11   21:invokestatic    #60  <Method int Log.i(String, String, Throwable)>
    //   12   24:pop             
    //   13   25:getstatic       #75  <Field b$a b$a.d>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokestatic    #18  <Method void a(b$a, String, Throwable)>
    //   17   33:return          
    }

    public static void e(String s)
    {
    //    0    0:ldc1            #24  <String "Ads">
    //    1    2:iconst_5        
    //    2    3:invokestatic    #27  <Method boolean a(String, int)>
    //    3    6:ifeq            16
    //    4    9:ldc1            #24  <String "Ads">
    //    5   11:aload_0         
    //    6   12:invokestatic    #73  <Method int Log.w(String, String)>
    //    7   15:pop             
    //    8   16:getstatic       #75  <Field b$a b$a.d>
    //    9   19:aload_0         
    //   10   20:invokestatic    #40  <Method void a(b$a, String)>
    //   11   23:return          
    }

    public static b a;
    private static int b;
}
