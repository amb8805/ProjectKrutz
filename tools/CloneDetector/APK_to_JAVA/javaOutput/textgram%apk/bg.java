// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

// Referenced classes of package com.applovin.impl.sdk:
//            z, AppLovinSdkImpl, ac, ab

public class bg extends AppLovinSdkUtils
{

    static 
    {
    //    0    0:ldc1            #11  <String "0123456789abcdef">
    //    1    2:invokevirtual   #17  <Method char[] String.toCharArray()>
    //    2    5:putstatic       #19  <Field char[] a>
    //    3    8:ldc1            #21  <String "-'">
    //    4   10:invokevirtual   #17  <Method char[] String.toCharArray()>
    //    5   13:putstatic       #23  <Field char[] b>
    //    6   16:return          
    }

    public static File a(String s, Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #26  <String "icon">
    //    2    3:invokevirtual   #30  <Method boolean String.contains(CharSequence)>
    //    3    6:ifeq            25
    //    4    9:aload_0         
    //    5   10:ldc1            #32  <String "/">
    //    6   12:ldc1            #34  <String "_">
    //    7   14:invokevirtual   #38  <Method String String.replace(CharSequence, CharSequence)>
    //    8   17:ldc1            #40  <String ".">
    //    9   19:ldc1            #34  <String "_">
    //   10   21:invokevirtual   #38  <Method String String.replace(CharSequence, CharSequence)>
    //   11   24:astore_0        
    //   12   25:new             #42  <Class File>
    //   13   28:dup             
    //   14   29:aload_1         
    //   15   30:invokevirtual   #48  <Method File Context.getCacheDir()>
    //   16   33:ldc1            #50  <String "al">
    //   17   35:invokespecial   #54  <Method void File(File, String)>
    //   18   38:astore_2        
    //   19   39:new             #42  <Class File>
    //   20   42:dup             
    //   21   43:aload_2         
    //   22   44:aload_0         
    //   23   45:invokespecial   #54  <Method void File(File, String)>
    //   24   48:astore_3        
    //   25   49:aload_2         
    //   26   50:invokevirtual   #58  <Method boolean File.mkdirs()>
    //   27   53:pop             
    //   28   54:aload_3         
    //   29   55:areturn         
    }

    public static String a(String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          24
    //    2    4:aload_0         
    //    3    5:invokevirtual   #63  <Method int String.length()>
    //    4    8:iconst_4        
    //    5    9:icmple          24
    //    6   12:aload_0         
    //    7   13:bipush          -4
    //    8   15:aload_0         
    //    9   16:invokevirtual   #63  <Method int String.length()>
    //   10   19:iadd            
    //   11   20:invokevirtual   #67  <Method String String.substring(int)>
    //   12   23:areturn         
    //   13   24:ldc1            #69  <String "NOKEY">
    //   14   26:areturn         
    }

    public static String a(String s, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:iconst_m1       
    //    2    2:invokestatic    #76  <Method Integer Integer.valueOf(int)>
    //    3    5:aload_1         
    //    4    6:getstatic       #82  <Field ab z.t>
    //    5    9:invokevirtual   #87  <Method Object AppLovinSdkImpl.a(ab)>
    //    6   12:checkcast       #13  <Class String>
    //    7   15:invokestatic    #90  <Method String a(String, Integer, String)>
    //    8   18:areturn         
    }

    private static String a(String s, Integer integer, String s1)
    {
    //    0    0:aload_2         
    //    1    1:ifnonnull       14
    //    2    4:new             #96  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #98  <String "No algorithm specified">
    //    5   10:invokespecial   #101 <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:ifnull          26
    //    9   18:aload_0         
    //   10   19:invokevirtual   #63  <Method int String.length()>
    //   11   22:iconst_1        
    //   12   23:icmpge          31
    //   13   26:ldc1            #103 <String "">
    //   14   28:astore_0        
    //   15   29:aload_0         
    //   16   30:areturn         
    //   17   31:aload_2         
    //   18   32:invokevirtual   #63  <Method int String.length()>
    //   19   35:iconst_1        
    //   20   36:icmplt          29
    //   21   39:ldc1            #105 <String "none">
    //   22   41:aload_2         
    //   23   42:invokevirtual   #109 <Method boolean String.equals(Object)>
    //   24   45:ifne            29
    // try 48 74 handler(s) 106 142
    //   25   48:aload_2         
    //   26   49:invokestatic    #115 <Method MessageDigest MessageDigest.getInstance(String)>
    //   27   52:astore          5
    //   28   54:aload           5
    //   29   56:aload_0         
    //   30   57:ldc1            #117 <String "UTF-8">
    //   31   59:invokevirtual   #121 <Method byte[] String.getBytes(String)>
    //   32   62:invokevirtual   #125 <Method void MessageDigest.update(byte[])>
    //   33   65:aload           5
    //   34   67:invokevirtual   #129 <Method byte[] MessageDigest.digest()>
    //   35   70:invokestatic    #132 <Method String a(byte[])>
    //   36   73:astore_0        
    //   37   74:aload_0         
    //   38   75:ifnull          29
    // try 78 103 handler(s) 106 142
    //   39   78:aload_1         
    //   40   79:invokevirtual   #135 <Method int Integer.intValue()>
    //   41   82:ifle            29
    //   42   85:aload_0         
    //   43   86:iconst_0        
    //   44   87:aload_1         
    //   45   88:invokevirtual   #135 <Method int Integer.intValue()>
    //   46   91:aload_0         
    //   47   92:invokevirtual   #63  <Method int String.length()>
    //   48   95:invokestatic    #141 <Method int Math.min(int, int)>
    //   49   98:invokevirtual   #144 <Method String String.substring(int, int)>
    //   50  101:astore          6
    //   51  103:aload           6
    //   52  105:areturn         
    // catch NoSuchAlgorithmException NoSuchAlgorithmException
    //   53  106:astore          4
    //   54  108:new             #146 <Class RuntimeException>
    //   55  111:dup             
    //   56  112:new             #148 <Class StringBuilder>
    //   57  115:dup             
    //   58  116:invokespecial   #150 <Method void StringBuilder()>
    //   59  119:ldc1            #152 <String "Unknown algorithm \"">
    //   60  121:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
    //   61  124:aload_2         
    //   62  125:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
    //   63  128:ldc1            #158 <String "\"">
    //   64  130:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
    //   65  133:invokevirtual   #162 <Method String StringBuilder.toString()>
    //   66  136:aload           4
    //   67  138:invokespecial   #165 <Method void RuntimeException(String, Throwable)>
    //   68  141:athrow          
    // catch UnsupportedEncodingException UnsupportedEncodingException
    //   69  142:astore_3        
    //   70  143:new             #146 <Class RuntimeException>
    //   71  146:dup             
    //   72  147:ldc1            #167 <String "Programming error: UTF-8 is not know encoding">
    //   73  149:aload_3         
    //   74  150:invokespecial   #165 <Method void RuntimeException(String, Throwable)>
    //   75  153:athrow          
    }

    static String a(Collection collection, String s, int i)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #96  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #170 <String "No glue specified">
    //    5   10:invokespecial   #101 <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:ifnull          28
    //    9   18:aload_0         
    //   10   19:invokeinterface #175 <Method int Collection.size()>
    //   11   24:iconst_1        
    //   12   25:icmpge          31
    //   13   28:ldc1            #103 <String "">
    //   14   30:areturn         
    //   15   31:new             #177 <Class StringBuffer>
    //   16   34:dup             
    //   17   35:invokespecial   #178 <Method void StringBuffer()>
    //   18   38:astore_3        
    //   19   39:aload_0         
    //   20   40:invokeinterface #182 <Method Iterator Collection.iterator()>
    //   21   45:astore          4
    //   22   47:iconst_0        
    //   23   48:istore          5
    //   24   50:aload           4
    //   25   52:invokeinterface #187 <Method boolean Iterator.hasNext()>
    //   26   57:ifeq            78
    //   27   60:aload           4
    //   28   62:invokeinterface #191 <Method Object Iterator.next()>
    //   29   67:checkcast       #13  <Class String>
    //   30   70:astore          6
    //   31   72:iload           5
    //   32   74:iload_2         
    //   33   75:icmplt          107
    //   34   78:aload_3         
    //   35   79:invokevirtual   #192 <Method int StringBuffer.length()>
    //   36   82:aload_1         
    //   37   83:invokevirtual   #63  <Method int String.length()>
    //   38   86:icmple          102
    //   39   89:aload_3         
    //   40   90:aload_3         
    //   41   91:invokevirtual   #192 <Method int StringBuffer.length()>
    //   42   94:aload_1         
    //   43   95:invokevirtual   #63  <Method int String.length()>
    //   44   98:isub            
    //   45   99:invokevirtual   #196 <Method void StringBuffer.setLength(int)>
    //   46  102:aload_3         
    //   47  103:invokevirtual   #197 <Method String StringBuffer.toString()>
    //   48  106:areturn         
    //   49  107:iinc            5  1
    //   50  110:aload_3         
    //   51  111:aload           6
    //   52  113:invokevirtual   #200 <Method StringBuffer StringBuffer.append(String)>
    //   53  116:aload_1         
    //   54  117:invokevirtual   #200 <Method StringBuffer StringBuffer.append(String)>
    //   55  120:pop             
    //   56  121:goto            50
    }

    static String a(Map map)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          13
    //    2    4:aload_0         
    //    3    5:invokeinterface #206 <Method boolean Map.isEmpty()>
    //    4   10:ifeq            16
    //    5   13:ldc1            #103 <String "">
    //    6   15:areturn         
    //    7   16:new             #148 <Class StringBuilder>
    //    8   19:dup             
    //    9   20:invokespecial   #150 <Method void StringBuilder()>
    //   10   23:astore_1        
    //   11   24:aload_0         
    //   12   25:invokeinterface #210 <Method Set Map.entrySet()>
    //   13   30:invokeinterface #213 <Method Iterator Set.iterator()>
    //   14   35:astore_2        
    //   15   36:aload_2         
    //   16   37:invokeinterface #187 <Method boolean Iterator.hasNext()>
    //   17   42:ifeq            97
    //   18   45:aload_2         
    //   19   46:invokeinterface #191 <Method Object Iterator.next()>
    //   20   51:checkcast       #215 <Class java.util.Map$Entry>
    //   21   54:astore_3        
    //   22   55:aload_1         
    //   23   56:invokevirtual   #216 <Method int StringBuilder.length()>
    //   24   59:ifle            69
    //   25   62:aload_1         
    //   26   63:ldc1            #218 <String "&">
    //   27   65:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
    //   28   68:pop             
    //   29   69:aload_1         
    //   30   70:aload_3         
    //   31   71:invokeinterface #221 <Method Object java.util.Map$Entry.getKey()>
    //   32   76:invokevirtual   #224 <Method StringBuilder StringBuilder.append(Object)>
    //   33   79:bipush          61
    //   34   81:invokevirtual   #227 <Method StringBuilder StringBuilder.append(char)>
    //   35   84:aload_3         
    //   36   85:invokeinterface #230 <Method Object java.util.Map$Entry.getValue()>
    //   37   90:invokevirtual   #224 <Method StringBuilder StringBuilder.append(Object)>
    //   38   93:pop             
    //   39   94:goto            36
    //   40   97:aload_1         
    //   41   98:invokevirtual   #162 <Method String StringBuilder.toString()>
    //   42  101:areturn         
    }

    public static String a(byte abyte0[])
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #96  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #232 <String "No data specified">
    //    5   10:invokespecial   #101 <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:iconst_2        
    //    8   15:aload_0         
    //    9   16:arraylength     
    //   10   17:imul            
    //   11   18:newarray        char[]
    //   12   20:astore_1        
    //   13   21:iconst_0        
    //   14   22:istore_2        
    //   15   23:iload_2         
    //   16   24:aload_0         
    //   17   25:arraylength     
    //   18   26:icmpge          70
    //   19   29:aload_1         
    //   20   30:iload_2         
    //   21   31:iconst_2        
    //   22   32:imul            
    //   23   33:getstatic       #19  <Field char[] a>
    //   24   36:sipush          240
    //   25   39:aload_0         
    //   26   40:iload_2         
    //   27   41:baload          
    //   28   42:iand            
    //   29   43:iconst_4        
    //   30   44:iushr           
    //   31   45:caload          
    //   32   46:castore         
    //   33   47:aload_1         
    //   34   48:iconst_1        
    //   35   49:iload_2         
    //   36   50:iconst_2        
    //   37   51:imul            
    //   38   52:iadd            
    //   39   53:getstatic       #19  <Field char[] a>
    //   40   56:bipush          15
    //   41   58:aload_0         
    //   42   59:iload_2         
    //   43   60:baload          
    //   44   61:iand            
    //   45   62:caload          
    //   46   63:castore         
    //   47   64:iinc            2  1
    //   48   67:goto            23
    //   49   70:new             #13  <Class String>
    //   50   73:dup             
    //   51   74:aload_1         
    //   52   75:invokespecial   #235 <Method void String(char[])>
    //   53   78:areturn         
    }

    public static boolean a(ab ab, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #240 <Method ac AppLovinSdkImpl.getSettingsManager()>
    //    3    5:invokestatic    #243 <Method boolean a(ab, ac)>
    //    4    8:ireturn         
    }

    public static boolean a(ab ab, ac ac1)
    {
    //    0    0:invokestatic    #249 <Method long System.currentTimeMillis()>
    //    1    3:ldc2w           #250 <Long 1000L>
    //    2    6:aload_1         
    //    3    7:aload_0         
    //    4    8:invokevirtual   #254 <Method Object ac.a(ab)>
    //    5   11:checkcast       #256 <Class Long>
    //    6   14:invokevirtual   #259 <Method long Long.longValue()>
    //    7   17:lmul            
    //    8   18:lcmp            
    //    9   19:ifle            24
    //   10   22:iconst_1        
    //   11   23:ireturn         
    //   12   24:iconst_0        
    //   13   25:ireturn         
    }

    public static String b(String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          12
    //    2    4:aload_0         
    //    3    5:invokevirtual   #63  <Method int String.length()>
    //    4    8:iconst_1        
    //    5    9:icmpge          15
    //    6   12:ldc1            #103 <String "">
    //    7   14:areturn         
    //    8   15:aload_0         
    //    9   16:invokevirtual   #262 <Method String String.trim()>
    //   10   19:invokevirtual   #265 <Method String String.toLowerCase()>
    //   11   22:areturn         
    }

    public static String b(String s, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getstatic       #268 <Field ab z.u>
    //    3    5:invokevirtual   #87  <Method Object AppLovinSdkImpl.a(ab)>
    //    4    8:checkcast       #72  <Class Integer>
    //    5   11:aload_1         
    //    6   12:getstatic       #82  <Field ab z.t>
    //    7   15:invokevirtual   #87  <Method Object AppLovinSdkImpl.a(ab)>
    //    8   18:checkcast       #13  <Class String>
    //    9   21:invokestatic    #90  <Method String a(String, Integer, String)>
    //   10   24:areturn         
    }

    static String c(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #273 <Method boolean d(String)>
    //    2    4:ifeq            26
    // try 7 14 handler(s) 16
    //    3    7:aload_0         
    //    4    8:ldc1            #117 <String "UTF-8">
    //    5   10:invokestatic    #279 <Method String URLEncoder.encode(String, String)>
    //    6   13:astore_2        
    //    7   14:aload_2         
    //    8   15:areturn         
    // catch UnsupportedEncodingException
    //    9   16:astore_1        
    //   10   17:new             #281 <Class UnsupportedOperationException>
    //   11   20:dup             
    //   12   21:aload_1         
    //   13   22:invokespecial   #284 <Method void UnsupportedOperationException(Throwable)>
    //   14   25:athrow          
    //   15   26:ldc1            #103 <String "">
    //   16   28:areturn         
    }

    static boolean d(String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          14
    //    2    4:aload_0         
    //    3    5:invokevirtual   #63  <Method int String.length()>
    //    4    8:iconst_1        
    //    5    9:icmple          14
    //    6   12:iconst_1        
    //    7   13:ireturn         
    //    8   14:iconst_0        
    //    9   15:ireturn         
    }

    private static final char a[];
    private static final char b[];
}
