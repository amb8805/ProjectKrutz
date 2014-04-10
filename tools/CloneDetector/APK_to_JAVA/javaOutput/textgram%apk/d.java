// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.os.Build;

class d
{

    static 
    {
    //    0    0:new             #2   <Class d>
    //    1    3:dup             
    //    2    4:invokespecial   #17  <Method void d()>
    //    3    7:putstatic       #19  <Field d d>
    //    4   10:new             #2   <Class d>
    //    5   13:dup             
    //    6   14:ldc1            #21  <String "unknown">
    //    7   16:ldc1            #23  <String "generic">
    //    8   18:ldc1            #23  <String "generic">
    //    9   20:invokespecial   #26  <Method void d(String, String, String)>
    //   10   23:putstatic       #28  <Field d e>
    //   11   26:new             #2   <Class d>
    //   12   29:dup             
    //   13   30:ldc1            #21  <String "unknown">
    //   14   32:ldc1            #30  <String "generic_x86">
    //   15   34:ldc1            #32  <String "Android">
    //   16   36:invokespecial   #26  <Method void d(String, String, String)>
    //   17   39:putstatic       #34  <Field d f>
    //   18   42:return          
    }

    d()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #40  <Field String Build.BOARD>
    //    4    8:putfield        #42  <Field String a>
    //    5   11:aload_0         
    //    6   12:getstatic       #45  <Field String Build.DEVICE>
    //    7   15:putfield        #47  <Field String b>
    //    8   18:aload_0         
    //    9   19:getstatic       #50  <Field String Build.BRAND>
    //   10   22:putfield        #52  <Field String c>
    //   11   25:return          
    }

    d(String s, String s1, String s2)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #42  <Field String a>
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:putfield        #47  <Field String b>
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:putfield        #52  <Field String c>
    //   11   19:return          
    }

    private static boolean a(String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          10
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokevirtual   #59  <Method boolean String.equals(Object)>
    //    5    9:ireturn         
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:if_acmpne       17
    //    9   15:iconst_1        
    //   10   16:ireturn         
    //   11   17:iconst_0        
    //   12   18:ireturn         
    }

    public boolean equals(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #2   <Class d>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_1         
    //    6   10:checkcast       #2   <Class d>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:getfield        #42  <Field String a>
    //   10   18:aload_2         
    //   11   19:getfield        #42  <Field String a>
    //   12   22:invokestatic    #61  <Method boolean a(String, String)>
    //   13   25:ifeq            7
    //   14   28:aload_0         
    //   15   29:getfield        #47  <Field String b>
    //   16   32:aload_2         
    //   17   33:getfield        #47  <Field String b>
    //   18   36:invokestatic    #61  <Method boolean a(String, String)>
    //   19   39:ifeq            7
    //   20   42:aload_0         
    //   21   43:getfield        #52  <Field String c>
    //   22   46:aload_2         
    //   23   47:getfield        #52  <Field String c>
    //   24   50:invokestatic    #61  <Method boolean a(String, String)>
    //   25   53:ifeq            7
    //   26   56:iconst_1        
    //   27   57:ireturn         
    }

    public int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field String a>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          21
    //    7   11:iconst_0        
    //    8   12:aload_0         
    //    9   13:getfield        #42  <Field String a>
    //   10   16:invokevirtual   #65  <Method int String.hashCode()>
    //   11   19:iadd            
    //   12   20:istore_2        
    //   13   21:aload_0         
    //   14   22:getfield        #47  <Field String b>
    //   15   25:ifnull          38
    //   16   28:iload_2         
    //   17   29:aload_0         
    //   18   30:getfield        #47  <Field String b>
    //   19   33:invokevirtual   #65  <Method int String.hashCode()>
    //   20   36:iadd            
    //   21   37:istore_2        
    //   22   38:aload_0         
    //   23   39:getfield        #52  <Field String c>
    //   24   42:ifnull          55
    //   25   45:iload_2         
    //   26   46:aload_0         
    //   27   47:getfield        #52  <Field String c>
    //   28   50:invokevirtual   #65  <Method int String.hashCode()>
    //   29   53:iadd            
    //   30   54:istore_2        
    //   31   55:iload_2         
    //   32   56:ireturn         
    }

    static final d d;
    static final d e;
    static final d f;
    public final String a;
    public final String b;
    public final String c;
}
