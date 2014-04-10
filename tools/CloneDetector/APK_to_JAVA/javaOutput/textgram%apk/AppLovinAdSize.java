// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import java.util.HashSet;
import java.util.Set;

public class AppLovinAdSize
{

    static 
    {
    //    0    0:new             #2   <Class AppLovinAdSize>
    //    1    3:dup             
    //    2    4:iconst_m1       
    //    3    5:bipush          50
    //    4    7:ldc1            #19  <String "BANNER">
    //    5    9:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //    6   12:putstatic       #25  <Field AppLovinAdSize BANNER>
    //    7   15:new             #2   <Class AppLovinAdSize>
    //    8   18:dup             
    //    9   19:iconst_m1       
    //   10   20:bipush          75
    //   11   22:ldc1            #26  <String "LEADER">
    //   12   24:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //   13   27:putstatic       #28  <Field AppLovinAdSize LEADER>
    //   14   30:new             #2   <Class AppLovinAdSize>
    //   15   33:dup             
    //   16   34:iconst_m1       
    //   17   35:iconst_m1       
    //   18   36:ldc1            #30  <String "INTER">
    //   19   38:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //   20   41:putstatic       #32  <Field AppLovinAdSize INTERSTITIAL>
    //   21   44:new             #2   <Class AppLovinAdSize>
    //   22   47:dup             
    //   23   48:iconst_m1       
    //   24   49:iconst_m1       
    //   25   50:ldc1            #33  <String "MREC">
    //   26   52:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //   27   55:putstatic       #35  <Field AppLovinAdSize MREC>
    //   28   58:return          
    }

    AppLovinAdSize(int i, int j, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #37  <Method void Object()>
    //    2    4:iload_1         
    //    3    5:ifge            40
    //    4    8:iload_1         
    //    5    9:iconst_m1       
    //    6   10:icmpeq          40
    //    7   13:new             #39  <Class IllegalArgumentException>
    //    8   16:dup             
    //    9   17:new             #41  <Class StringBuilder>
    //   10   20:dup             
    //   11   21:invokespecial   #42  <Method void StringBuilder()>
    //   12   24:ldc1            #44  <String "Ad width must be a positive number. Number provided: ">
    //   13   26:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   14   29:iload_1         
    //   15   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
    //   16   33:invokevirtual   #55  <Method String StringBuilder.toString()>
    //   17   36:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   18   39:athrow          
    //   19   40:iload_1         
    //   20   41:sipush          9999
    //   21   44:icmple          74
    //   22   47:new             #39  <Class IllegalArgumentException>
    //   23   50:dup             
    //   24   51:new             #41  <Class StringBuilder>
    //   25   54:dup             
    //   26   55:invokespecial   #42  <Method void StringBuilder()>
    //   27   58:ldc1            #60  <String "Ad width must be less then 9999. Number provided: ">
    //   28   60:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   29   63:iload_1         
    //   30   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
    //   31   67:invokevirtual   #55  <Method String StringBuilder.toString()>
    //   32   70:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   33   73:athrow          
    //   34   74:iload_2         
    //   35   75:ifge            110
    //   36   78:iload_2         
    //   37   79:iconst_m1       
    //   38   80:icmpeq          110
    //   39   83:new             #39  <Class IllegalArgumentException>
    //   40   86:dup             
    //   41   87:new             #41  <Class StringBuilder>
    //   42   90:dup             
    //   43   91:invokespecial   #42  <Method void StringBuilder()>
    //   44   94:ldc1            #62  <String "Ad height must be a positive number. Number provided: ">
    //   45   96:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   46   99:iload_2         
    //   47  100:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
    //   48  103:invokevirtual   #55  <Method String StringBuilder.toString()>
    //   49  106:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   50  109:athrow          
    //   51  110:iload_2         
    //   52  111:sipush          9999
    //   53  114:icmple          144
    //   54  117:new             #39  <Class IllegalArgumentException>
    //   55  120:dup             
    //   56  121:new             #41  <Class StringBuilder>
    //   57  124:dup             
    //   58  125:invokespecial   #42  <Method void StringBuilder()>
    //   59  128:ldc1            #64  <String "Ad height must be less then 9999. Number provided: ">
    //   60  130:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   61  133:iload_2         
    //   62  134:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
    //   63  137:invokevirtual   #55  <Method String StringBuilder.toString()>
    //   64  140:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   65  143:athrow          
    //   66  144:aload_3         
    //   67  145:ifnonnull       158
    //   68  148:new             #39  <Class IllegalArgumentException>
    //   69  151:dup             
    //   70  152:ldc1            #66  <String "No label specified">
    //   71  154:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   72  157:athrow          
    //   73  158:aload_3         
    //   74  159:invokevirtual   #72  <Method int String.length()>
    //   75  162:bipush          9
    //   76  164:icmple          194
    //   77  167:new             #39  <Class IllegalArgumentException>
    //   78  170:dup             
    //   79  171:new             #41  <Class StringBuilder>
    //   80  174:dup             
    //   81  175:invokespecial   #42  <Method void StringBuilder()>
    //   82  178:ldc1            #74  <String "Provided label is too long. Label provided: ">
    //   83  180:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   84  183:aload_3         
    //   85  184:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   86  187:invokevirtual   #55  <Method String StringBuilder.toString()>
    //   87  190:invokespecial   #58  <Method void IllegalArgumentException(String)>
    //   88  193:athrow          
    //   89  194:aload_0         
    //   90  195:iload_1         
    //   91  196:putfield        #76  <Field int a>
    //   92  199:aload_0         
    //   93  200:iload_2         
    //   94  201:putfield        #78  <Field int b>
    //   95  204:aload_0         
    //   96  205:aload_3         
    //   97  206:putfield        #80  <Field String c>
    //   98  209:return          
    }

    private static int a(String s)
    {
    //    0    0:ldc1            #85  <String "span">
    //    1    2:aload_0         
    //    2    3:invokevirtual   #89  <Method boolean String.equalsIgnoreCase(String)>
    //    3    6:ifeq            11
    //    4    9:iconst_m1       
    //    5   10:ireturn         
    // try 11 16 handler(s) 18
    //    6   11:aload_0         
    //    7   12:invokestatic    #94  <Method int Integer.parseInt(String)>
    //    8   15:istore_2        
    //    9   16:iload_2         
    //   10   17:ireturn         
    // catch NumberFormatException
    //   11   18:astore_1        
    //   12   19:iconst_0        
    //   13   20:ireturn         
    }

    public static Set allSizes()
    {
    //    0    0:new             #98  <Class HashSet>
    //    1    3:dup             
    //    2    4:iconst_4        
    //    3    5:invokespecial   #101 <Method void HashSet(int)>
    //    4    8:astore_0        
    //    5    9:aload_0         
    //    6   10:getstatic       #25  <Field AppLovinAdSize BANNER>
    //    7   13:invokeinterface #107 <Method boolean Set.add(Object)>
    //    8   18:pop             
    //    9   19:aload_0         
    //   10   20:getstatic       #35  <Field AppLovinAdSize MREC>
    //   11   23:invokeinterface #107 <Method boolean Set.add(Object)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:getstatic       #32  <Field AppLovinAdSize INTERSTITIAL>
    //   15   33:invokeinterface #107 <Method boolean Set.add(Object)>
    //   16   38:pop             
    //   17   39:aload_0         
    //   18   40:getstatic       #28  <Field AppLovinAdSize LEADER>
    //   19   43:invokeinterface #107 <Method boolean Set.add(Object)>
    //   20   48:pop             
    //   21   49:aload_0         
    //   22   50:areturn         
    }

    public static AppLovinAdSize fromString(String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          12
    //    2    4:aload_0         
    //    3    5:invokevirtual   #72  <Method int String.length()>
    //    4    8:iconst_1        
    //    5    9:icmpge          14
    //    6   12:aconst_null     
    //    7   13:areturn         
    //    8   14:aload_0         
    //    9   15:invokevirtual   #112 <Method String String.toLowerCase()>
    //   10   18:astore_1        
    //   11   19:aload_1         
    //   12   20:ldc1            #114 <String "banner">
    //   13   22:invokevirtual   #117 <Method boolean String.equals(Object)>
    //   14   25:ifeq            32
    //   15   28:getstatic       #25  <Field AppLovinAdSize BANNER>
    //   16   31:areturn         
    //   17   32:aload_1         
    //   18   33:ldc1            #119 <String "interstitial">
    //   19   35:invokevirtual   #117 <Method boolean String.equals(Object)>
    //   20   38:ifne            50
    //   21   41:aload_1         
    //   22   42:ldc1            #121 <String "inter">
    //   23   44:invokevirtual   #117 <Method boolean String.equals(Object)>
    //   24   47:ifeq            54
    //   25   50:getstatic       #32  <Field AppLovinAdSize INTERSTITIAL>
    //   26   53:areturn         
    //   27   54:aload_1         
    //   28   55:ldc1            #123 <String "mrec">
    //   29   57:invokevirtual   #117 <Method boolean String.equals(Object)>
    //   30   60:ifeq            67
    //   31   63:getstatic       #35  <Field AppLovinAdSize MREC>
    //   32   66:areturn         
    //   33   67:aload_1         
    //   34   68:ldc1            #125 <String "leader">
    //   35   70:invokevirtual   #117 <Method boolean String.equals(Object)>
    //   36   73:ifeq            80
    //   37   76:getstatic       #28  <Field AppLovinAdSize LEADER>
    //   38   79:areturn         
    //   39   80:aload_0         
    //   40   81:ldc1            #127 <String "x">
    //   41   83:invokevirtual   #131 <Method String[] String.split(String)>
    //   42   86:astore_2        
    //   43   87:aload_2         
    //   44   88:arraylength     
    //   45   89:iconst_2        
    //   46   90:icmpne          114
    //   47   93:new             #2   <Class AppLovinAdSize>
    //   48   96:dup             
    //   49   97:aload_2         
    //   50   98:iconst_0        
    //   51   99:aaload          
    //   52  100:invokestatic    #133 <Method int a(String)>
    //   53  103:aload_2         
    //   54  104:iconst_1        
    //   55  105:aaload          
    //   56  106:invokestatic    #133 <Method int a(String)>
    //   57  109:aload_0         
    //   58  110:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //   59  113:areturn         
    //   60  114:new             #2   <Class AppLovinAdSize>
    //   61  117:dup             
    //   62  118:iconst_0        
    //   63  119:iconst_0        
    //   64  120:aload_0         
    //   65  121:invokespecial   #23  <Method void AppLovinAdSize(int, int, String)>
    //   66  124:areturn         
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field int b>
    //    2    4:ireturn         
    }

    public String getLabel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field String c>
    //    2    4:invokevirtual   #138 <Method String String.toUpperCase()>
    //    3    7:areturn         
    }

    public int getWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field int a>
    //    2    4:ireturn         
    }

    public String toString()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #141 <Method String getLabel()>
    //    2    4:areturn         
    }

    public static final AppLovinAdSize BANNER;
    public static final AppLovinAdSize INTERSTITIAL;
    public static final AppLovinAdSize LEADER;
    public static final AppLovinAdSize MREC;
    public static final int SPAN = -1;
    private final int a;
    private final int b;
    private final String c;
}
