// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.ads.util:
//            b

public abstract class i
{
    public abstract class a
    {

        private a(i j, String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aconst_null     
        //    4    4:invokespecial   #17  <Method void i$a(i, String, Object)>
        //    5    7:return          
        }

        a(i j, String s, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #20  <Method void i$a(i, String)>
        //    4    6:return          
        }

        private a(i j, String s, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field i c>
        //    3    5:aload_0         
        //    4    6:invokespecial   #25  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #27  <Field String b>
        //    8   14:aload_1         
        //    9   15:aload_0         
        //   10   16:invokestatic    #32  <Method void i.a(i, i$a)>
        //   11   19:aload_0         
        //   12   20:aload_3         
        //   13   21:putfield        #34  <Field Object a>
        //   14   24:return          
        }

        a(i j, String s, Object obj, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aload_3         
        //    4    4:invokespecial   #17  <Method void i$a(i, String, Object)>
        //    5    7:return          
        }

        public String toString()
        {
        //    0    0:new             #39  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #40  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:getfield        #22  <Field i c>
        //    5   11:invokevirtual   #42  <Method String i.toString()>
        //    6   14:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
        //    7   17:ldc1            #48  <String ".">
        //    8   19:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:aload_0         
        //   10   23:getfield        #27  <Field String b>
        //   11   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
        //   12   29:ldc1            #50  <String " = ">
        //   13   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
        //   14   34:aload_0         
        //   15   35:getfield        #34  <Field Object a>
        //   16   38:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
        //   17   41:invokevirtual   #54  <Method String StringBuilder.toString()>
        //   18   44:areturn         
        }

        protected Object a;
        protected final String b;
        final i c;
    }

    public final class b extends a
    {

        public b(i j, String s, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #11  <Field i d>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_2         
        //    6    8:aload_3         
        //    7    9:aconst_null     
        //    8   10:invokespecial   #14  <Method void i$a(i, String, Object, i$1)>
        //    9   13:return          
        }

        public Object a()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field Object a>
        //    2    4:areturn         
        }

        public String toString()
        {
        //    0    0:new             #23  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #28  <Method String i$a.toString()>
        //    5   11:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #34  <String " (!)">
        //    7   16:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #35  <Method String StringBuilder.toString()>
        //    9   22:areturn         
        }

        final i d;
    }

    public final class c extends a
    {

        public c(i j, String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field i d>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_2         
        //    6    8:aconst_null     
        //    7    9:invokespecial   #16  <Method void i$a(i, String, i$1)>
        //    8   12:aload_0         
        //    9   13:iconst_0        
        //   10   14:putfield        #18  <Field boolean e>
        //   11   17:aload_0         
        //   12   18:iconst_0        
        //   13   19:putfield        #18  <Field boolean e>
        //   14   22:return          
        }

        public c(i j, String s, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field i d>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_2         
        //    6    8:aload_3         
        //    7    9:aconst_null     
        //    8   10:invokespecial   #22  <Method void i$a(i, String, Object, i$1)>
        //    9   13:aload_0         
        //   10   14:iconst_0        
        //   11   15:putfield        #18  <Field boolean e>
        //   12   18:aload_0         
        //   13   19:iconst_0        
        //   14   20:putfield        #18  <Field boolean e>
        //   15   23:return          
        }

        public Object a()
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 7 handler(s) 11
        //    2    2:aload_0         
        //    3    3:getfield        #27  <Field Object a>
        //    4    6:astore_2        
        //    5    7:aload_0         
        //    6    8:monitorexit     
        //    7    9:aload_2         
        //    8   10:areturn         
        // finally
        //    9   11:astore_1        
        //   10   12:aload_0         
        //   11   13:monitorexit     
        //   12   14:aload_1         
        //   13   15:athrow          
        }

        public void a(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 78 handler(s) 81
        //    2    2:new             #30  <Class StringBuilder>
        //    3    5:dup             
        //    4    6:invokespecial   #33  <Method void StringBuilder()>
        //    5    9:ldc1            #35  <String "State changed - ">
        //    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //    7   14:aload_0         
        //    8   15:getfield        #13  <Field i d>
        //    9   18:invokevirtual   #45  <Method String i.toString()>
        //   10   21:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   11   24:ldc1            #47  <String ".">
        //   12   26:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   13   29:aload_0         
        //   14   30:getfield        #51  <Field String b>
        //   15   33:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   16   36:ldc1            #53  <String ": '">
        //   17   38:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   18   41:aload_1         
        //   19   42:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
        //   20   45:ldc1            #58  <String "' <-- '">
        //   21   47:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   22   50:aload_0         
        //   23   51:getfield        #27  <Field Object a>
        //   24   54:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
        //   25   57:ldc1            #60  <String "'.">
        //   26   59:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   27   62:invokevirtual   #61  <Method String StringBuilder.toString()>
        //   28   65:invokestatic    #66  <Method void b.d(String)>
        //   29   68:aload_0         
        //   30   69:aload_1         
        //   31   70:putfield        #27  <Field Object a>
        //   32   73:aload_0         
        //   33   74:iconst_1        
        //   34   75:putfield        #18  <Field boolean e>
        //   35   78:aload_0         
        //   36   79:monitorexit     
        //   37   80:return          
        // finally
        //   38   81:astore_2        
        //   39   82:aload_0         
        //   40   83:monitorexit     
        //   41   84:aload_2         
        //   42   85:athrow          
        }

        public String toString()
        {
        //    0    0:new             #30  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #33  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #67  <Method String i$a.toString()>
        //    5   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:astore_1        
        //    7   15:aload_0         
        //    8   16:getfield        #18  <Field boolean e>
        //    9   19:ifeq            34
        //   10   22:ldc1            #69  <String " (*)">
        //   11   24:astore_2        
        //   12   25:aload_1         
        //   13   26:aload_2         
        //   14   27:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   15   30:invokevirtual   #61  <Method String StringBuilder.toString()>
        //   16   33:areturn         
        //   17   34:ldc1            #71  <String "">
        //   18   36:astore_2        
        //   19   37:goto            25
        }

        final i d;
        private boolean e;
    }

    public final class d extends a
    {

        public d(i j, String s, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #11  <Field i d>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_2         
        //    6    8:new             #13  <Class WeakReference>
        //    7   11:dup             
        //    8   12:aload_3         
        //    9   13:invokespecial   #16  <Method void WeakReference(Object)>
        //   10   16:aconst_null     
        //   11   17:invokespecial   #19  <Method void i$a(i, String, Object, i$1)>
        //   12   20:return          
        }

        public Object a()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field Object a>
        //    2    4:checkcast       #13  <Class WeakReference>
        //    3    7:invokevirtual   #27  <Method Object WeakReference.get()>
        //    4   10:areturn         
        }

        public String toString()
        {
        //    0    0:new             #31  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #34  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:getfield        #11  <Field i d>
        //    5   11:invokevirtual   #38  <Method String i.toString()>
        //    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //    7   17:ldc1            #44  <String ".">
        //    8   19:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:aload_0         
        //   10   23:getfield        #48  <Field String b>
        //   11   26:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //   12   29:ldc1            #50  <String " = ">
        //   13   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //   14   34:aload_0         
        //   15   35:invokevirtual   #52  <Method Object a()>
        //   16   38:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
        //   17   41:ldc1            #57  <String " (?)">
        //   18   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //   19   46:invokevirtual   #58  <Method String StringBuilder.toString()>
        //   20   49:areturn         
        }

        final i d;
    }


    static 
    {
    //    0    0:new             #4   <Class Object>
    //    1    3:dup             
    //    2    4:invokespecial   #20  <Method void Object()>
    //    3    7:putstatic       #22  <Field Object a>
    //    4   10:iconst_0        
    //    5   11:putstatic       #24  <Field int b>
    //    6   14:new             #26  <Class HashMap>
    //    7   17:dup             
    //    8   18:invokespecial   #27  <Method void HashMap()>
    //    9   21:putstatic       #29  <Field HashMap c>
    //   10   24:return          
    }

    public i()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #31  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #32  <Method void ArrayList()>
    //    6   12:putfield        #34  <Field ArrayList d>
    //    7   15:getstatic       #22  <Field Object a>
    //    8   18:astore_1        
    //    9   19:aload_1         
    //   10   20:monitorenter    
    // try 21 51 handler(s) 123
    //   11   21:getstatic       #24  <Field int b>
    //   12   24:istore_3        
    //   13   25:iload_3         
    //   14   26:iconst_1        
    //   15   27:iadd            
    //   16   28:putstatic       #24  <Field int b>
    //   17   31:aload_0         
    //   18   32:iload_3         
    //   19   33:putfield        #36  <Field int u>
    //   20   36:getstatic       #29  <Field HashMap c>
    //   21   39:aload_0         
    //   22   40:invokevirtual   #40  <Method Class Object.getClass()>
    //   23   43:invokevirtual   #44  <Method Object HashMap.get(Object)>
    //   24   46:checkcast       #46  <Class Integer>
    //   25   49:astore          4
    //   26   51:aload           4
    //   27   53:ifnonnull       99
    // try 56 71 handler(s) 123
    //   28   56:getstatic       #29  <Field HashMap c>
    //   29   59:aload_0         
    //   30   60:invokevirtual   #40  <Method Class Object.getClass()>
    //   31   63:iconst_1        
    //   32   64:invokestatic    #50  <Method Integer Integer.valueOf(int)>
    //   33   67:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
    //   34   70:pop             
    // try 71 73 handler(s) 123
    //   35   71:aload_1         
    //   36   72:monitorexit     
    //   37   73:new             #56  <Class StringBuilder>
    //   38   76:dup             
    //   39   77:invokespecial   #57  <Method void StringBuilder()>
    //   40   80:ldc1            #59  <String "State created: ">
    //   41   82:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   42   85:aload_0         
    //   43   86:invokevirtual   #67  <Method String toString()>
    //   44   89:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   45   92:invokevirtual   #68  <Method String StringBuilder.toString()>
    //   46   95:invokestatic    #73  <Method void b.d(String)>
    //   47   98:return          
    // try 99 120 handler(s) 123
    //   48   99:getstatic       #29  <Field HashMap c>
    //   49  102:aload_0         
    //   50  103:invokevirtual   #40  <Method Class Object.getClass()>
    //   51  106:iconst_1        
    //   52  107:aload           4
    //   53  109:invokevirtual   #77  <Method int Integer.intValue()>
    //   54  112:iadd            
    //   55  113:invokestatic    #50  <Method Integer Integer.valueOf(int)>
    //   56  116:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
    //   57  119:pop             
    //   58  120:goto            71
    // finally
    //   59  123:astore_2        
    // try 124 126 handler(s) 123
    //   60  124:aload_1         
    //   61  125:monitorexit     
    //   62  126:aload_2         
    //   63  127:athrow          
    }

    private void a(a a1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field ArrayList d>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #82  <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    static void a(i j, a a1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #85  <Method void a(i$a)>
    //    3    5:return          
    }

    protected void finalize()
        throws Throwable
    {
    //    0    0:getstatic       #22  <Field Object a>
    //    1    3:astore_1        
    //    2    4:aload_1         
    //    3    5:monitorenter    
    // try 6 40 handler(s) 45
    //    4    6:getstatic       #29  <Field HashMap c>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #40  <Method Class Object.getClass()>
    //    7   13:iconst_m1       
    //    8   14:getstatic       #29  <Field HashMap c>
    //    9   17:aload_0         
    //   10   18:invokevirtual   #40  <Method Class Object.getClass()>
    //   11   21:invokevirtual   #44  <Method Object HashMap.get(Object)>
    //   12   24:checkcast       #46  <Class Integer>
    //   13   27:invokevirtual   #77  <Method int Integer.intValue()>
    //   14   30:iadd            
    //   15   31:invokestatic    #50  <Method Integer Integer.valueOf(int)>
    //   16   34:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
    //   17   37:pop             
    //   18   38:aload_1         
    //   19   39:monitorexit     
    //   20   40:aload_0         
    //   21   41:invokespecial   #90  <Method void Object.finalize()>
    //   22   44:return          
    // finally
    //   23   45:astore_2        
    // try 46 48 handler(s) 45
    //   24   46:aload_1         
    //   25   47:monitorexit     
    //   26   48:aload_2         
    //   27   49:athrow          
    }

    public String toString()
    {
    //    0    0:new             #56  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #57  <Method void StringBuilder()>
    //    3    7:aload_0         
    //    4    8:invokevirtual   #40  <Method Class Object.getClass()>
    //    5   11:invokevirtual   #95  <Method String Class.getSimpleName()>
    //    6   14:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //    7   17:ldc1            #97  <String "[">
    //    8   19:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //    9   22:aload_0         
    //   10   23:getfield        #36  <Field int u>
    //   11   26:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
    //   12   29:ldc1            #102 <String "]">
    //   13   31:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
    //   14   34:invokevirtual   #68  <Method String StringBuilder.toString()>
    //   15   37:areturn         
    }

    private static final Object a;
    private static int b;
    private static HashMap c;
    private final ArrayList d;
    public final int u;

    // Unreferenced inner class com/google/ads/util/i$1

/* anonymous class */
    static class _cls1
    {
    }

}
