// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.google.ads:
//            ah, am, ai

public class al
{

    public al(ai ai1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:ldc1            #20  <String "googleads.g.doubleclick.net">
    //    4    7:putfield        #22  <Field String a>
    //    5   10:aload_0         
    //    6   11:ldc1            #24  <String "/pagead/ads">
    //    7   13:putfield        #26  <Field String b>
    //    8   16:aload_0         
    //    9   17:iconst_3        
    //   10   18:anewarray       String[]
    //   11   21:dup             
    //   12   22:iconst_0        
    //   13   23:ldc1            #30  <String ".doubleclick.net">
    //   14   25:aastore         
    //   15   26:dup             
    //   16   27:iconst_1        
    //   17   28:ldc1            #32  <String ".googleadservices.com">
    //   18   30:aastore         
    //   19   31:dup             
    //   20   32:iconst_2        
    //   21   33:ldc1            #34  <String ".googlesyndication.com">
    //   22   35:aastore         
    //   23   36:putfield        #36  <Field String[] c>
    //   24   39:aload_0         
    //   25   40:new             #38  <Class ah>
    //   26   43:dup             
    //   27   44:invokespecial   #39  <Method void ah()>
    //   28   47:putfield        #41  <Field ah e>
    //   29   50:aload_0         
    //   30   51:aload_1         
    //   31   52:putfield        #43  <Field ai d>
    //   32   55:return          
    }

    private Uri a(Uri uri, Context context, String s, boolean flag)
        throws am
    {
    // try 0 19 handler(s) 19
    //    0    0:aload_1         
    //    1    1:ldc1            #50  <String "ms">
    //    2    3:invokevirtual   #56  <Method String Uri.getQueryParameter(String)>
    //    3    6:ifnull          31
    //    4    9:new             #46  <Class am>
    //    5   12:dup             
    //    6   13:ldc1            #58  <String "Query parameter already exists: ms">
    //    7   15:invokespecial   #61  <Method void am(String)>
    //    8   18:athrow          
    // catch UnsupportedOperationException UnsupportedOperationException UnsupportedOperationException UnsupportedOperationException
    //    9   19:astore          5
    //   10   21:new             #46  <Class am>
    //   11   24:dup             
    //   12   25:ldc1            #63  <String "Provided Uri is not in a valid state">
    //   13   27:invokespecial   #61  <Method void am(String)>
    //   14   30:athrow          
    //   15   31:iload           4
    //   16   33:ifeq            59
    // try 36 49 handler(s) 19
    //   17   36:aload_0         
    //   18   37:getfield        #43  <Field ai d>
    //   19   40:aload_2         
    //   20   41:aload_3         
    //   21   42:invokeinterface #68  <Method String ai.a(Context, String)>
    //   22   47:astore          7
    // try 49 59 handler(s) 19
    //   23   49:aload_0         
    //   24   50:aload_1         
    //   25   51:ldc1            #50  <String "ms">
    //   26   53:aload           7
    //   27   55:invokespecial   #71  <Method Uri a(Uri, String, String)>
    //   28   58:areturn         
    // try 59 71 handler(s) 19
    //   29   59:aload_0         
    //   30   60:getfield        #43  <Field ai d>
    //   31   63:aload_2         
    //   32   64:invokeinterface #74  <Method String ai.a(Context)>
    //   33   69:astore          6
    //   34   71:aload           6
    //   35   73:astore          7
    //   36   75:goto            49
    }

    private Uri a(Uri uri, String s, String s1)
        throws UnsupportedOperationException
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #78  <Method String Uri.toString()>
    //    2    4:astore          4
    //    3    6:aload           4
    //    4    8:ldc1            #80  <String "&adurl">
    //    5   10:invokevirtual   #84  <Method int String.indexOf(String)>
    //    6   13:istore          5
    //    7   15:iload           5
    //    8   17:iconst_m1       
    //    9   18:icmpne          30
    //   10   21:aload           4
    //   11   23:ldc1            #86  <String "?adurl">
    //   12   25:invokevirtual   #84  <Method int String.indexOf(String)>
    //   13   28:istore          5
    //   14   30:iload           5
    //   15   32:iconst_m1       
    //   16   33:icmpeq          90
    //   17   36:new             #88  <Class StringBuilder>
    //   18   39:dup             
    //   19   40:aload           4
    //   20   42:iconst_0        
    //   21   43:iload           5
    //   22   45:iconst_1        
    //   23   46:iadd            
    //   24   47:invokevirtual   #92  <Method String String.substring(int, int)>
    //   25   50:invokespecial   #93  <Method void StringBuilder(String)>
    //   26   53:aload_2         
    //   27   54:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
    //   28   57:ldc1            #99  <String "=">
    //   29   59:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
    //   30   62:aload_3         
    //   31   63:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
    //   32   66:ldc1            #101 <String "&">
    //   33   68:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
    //   34   71:aload           4
    //   35   73:iload           5
    //   36   75:iconst_1        
    //   37   76:iadd            
    //   38   77:invokevirtual   #104 <Method String String.substring(int)>
    //   39   80:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
    //   40   83:invokevirtual   #105 <Method String StringBuilder.toString()>
    //   41   86:invokestatic    #109 <Method Uri Uri.parse(String)>
    //   42   89:areturn         
    //   43   90:aload_1         
    //   44   91:invokevirtual   #113 <Method android.net.Uri$Builder Uri.buildUpon()>
    //   45   94:aload_2         
    //   46   95:aload_3         
    //   47   96:invokevirtual   #119 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
    //   48   99:invokevirtual   #123 <Method Uri android.net.Uri$Builder.build()>
    //   49  102:areturn         
    }

    public Uri a(Uri uri, Context context)
        throws am
    {
    // try 0 15 handler(s) 18
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_1         
    //    4    4:ldc1            #126 <String "ai">
    //    5    6:invokevirtual   #56  <Method String Uri.getQueryParameter(String)>
    //    6    9:iconst_1        
    //    7   10:invokespecial   #128 <Method Uri a(Uri, Context, String, boolean)>
    //    8   13:astore          4
    //    9   15:aload           4
    //   10   17:areturn         
    // catch UnsupportedOperationException
    //   11   18:astore_3        
    //   12   19:new             #46  <Class am>
    //   13   22:dup             
    //   14   23:ldc1            #63  <String "Provided Uri is not in a valid state">
    //   15   25:invokespecial   #61  <Method void am(String)>
    //   16   28:athrow          
    }

    public void a(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #130 <String ",">
    //    3    4:invokevirtual   #134 <Method String[] String.split(String)>
    //    4    7:putfield        #36  <Field String[] c>
    //    5   10:return          
    }

    public boolean a(Uri uri)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       12
    //    2    4:new             #137 <Class NullPointerException>
    //    3    7:dup             
    //    4    8:invokespecial   #138 <Method void NullPointerException()>
    //    5   11:athrow          
    // try 12 28 handler(s) 69
    //    6   12:aload_1         
    //    7   13:invokevirtual   #141 <Method String Uri.getHost()>
    //    8   16:astore_3        
    //    9   17:aload_0         
    //   10   18:getfield        #36  <Field String[] c>
    //   11   21:astore          4
    //   12   23:aload           4
    //   13   25:arraylength     
    //   14   26:istore          5
    //   15   28:iconst_0        
    //   16   29:istore          6
    //   17   31:iconst_0        
    //   18   32:istore          7
    //   19   34:iload           6
    //   20   36:iload           5
    //   21   38:icmpge          60
    // try 41 52 handler(s) 69
    //   22   41:aload_3         
    //   23   42:aload           4
    //   24   44:iload           6
    //   25   46:aaload          
    //   26   47:invokevirtual   #145 <Method boolean String.endsWith(String)>
    //   27   50:istore          8
    //   28   52:iload           8
    //   29   54:ifeq            63
    //   30   57:iconst_1        
    //   31   58:istore          7
    //   32   60:iload           7
    //   33   62:ireturn         
    //   34   63:iinc            6  1
    //   35   66:goto            31
    // catch NullPointerException NullPointerException
    //   36   69:astore_2        
    //   37   70:iconst_0        
    //   38   71:ireturn         
    }

    private String a;
    private String b;
    private String c[];
    private ai d;
    private ah e;
}
