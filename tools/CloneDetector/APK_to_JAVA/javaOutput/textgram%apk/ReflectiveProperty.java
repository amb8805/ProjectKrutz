// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.util;

import java.lang.reflect.*;

// Referenced classes of package com.nineoldandroids.util:
//            Property, NoSuchPropertyException

class ReflectiveProperty extends Property
{

    public ReflectiveProperty(Class class1, Class class2, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:aload_3         
    //    3    3:invokespecial   #29  <Method void Property(Class, String)>
    //    4    6:aload_3         
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #35  <Method char String.charAt(int)>
    //    7   11:invokestatic    #41  <Method char Character.toUpperCase(char)>
    //    8   14:istore          4
    //    9   16:aload_3         
    //   10   17:iconst_1        
    //   11   18:invokevirtual   #45  <Method String String.substring(int)>
    //   12   21:astore          5
    //   13   23:new             #47  <Class StringBuilder>
    //   14   26:dup             
    //   15   27:iload           4
    //   16   29:invokestatic    #51  <Method String String.valueOf(char)>
    //   17   32:invokespecial   #54  <Method void StringBuilder(String)>
    //   18   35:aload           5
    //   19   37:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   20   40:invokevirtual   #62  <Method String StringBuilder.toString()>
    //   21   43:astore          6
    //   22   45:new             #47  <Class StringBuilder>
    //   23   48:dup             
    //   24   49:ldc1            #9   <String "get">
    //   25   51:invokespecial   #54  <Method void StringBuilder(String)>
    //   26   54:aload           6
    //   27   56:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   28   59:invokevirtual   #62  <Method String StringBuilder.toString()>
    //   29   62:astore          7
    // try 64 75 handler(s) 138
    //   30   64:aload_0         
    //   31   65:aload_1         
    //   32   66:aload           7
    //   33   68:aconst_null     
    //   34   69:invokevirtual   #68  <Method Method Class.getMethod(String, Class[])>
    //   35   72:putfield        #70  <Field Method mGetter>
    //   36   75:aload_0         
    //   37   76:getfield        #70  <Field Method mGetter>
    //   38   79:invokevirtual   #76  <Method Class Method.getReturnType()>
    //   39   82:astore          15
    //   40   84:aload_0         
    //   41   85:aload_2         
    //   42   86:aload           15
    //   43   88:invokespecial   #80  <Method boolean typesMatch(Class, Class)>
    //   44   91:ifne            321
    //   45   94:new             #82  <Class NoSuchPropertyException>
    //   46   97:dup             
    //   47   98:new             #47  <Class StringBuilder>
    //   48  101:dup             
    //   49  102:ldc1            #84  <String "Underlying type (">
    //   50  104:invokespecial   #54  <Method void StringBuilder(String)>
    //   51  107:aload           15
    //   52  109:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
    //   53  112:ldc1            #89  <String ") ">
    //   54  114:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   55  117:ldc1            #91  <String "does not match Property type (">
    //   56  119:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   57  122:aload_2         
    //   58  123:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
    //   59  126:ldc1            #93  <String ")">
    //   60  128:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   61  131:invokevirtual   #62  <Method String StringBuilder.toString()>
    //   62  134:invokespecial   #94  <Method void NoSuchPropertyException(String)>
    //   63  137:athrow          
    // catch NoSuchMethodException
    //   64  138:astore          8
    // try 140 159 handler(s) 162
    //   65  140:aload_0         
    //   66  141:aload_1         
    //   67  142:aload           7
    //   68  144:aconst_null     
    //   69  145:invokevirtual   #97  <Method Method Class.getDeclaredMethod(String, Class[])>
    //   70  148:putfield        #70  <Field Method mGetter>
    //   71  151:aload_0         
    //   72  152:getfield        #70  <Field Method mGetter>
    //   73  155:iconst_1        
    //   74  156:invokevirtual   #101 <Method void Method.setAccessible(boolean)>
    //   75  159:goto            75
    // catch NoSuchMethodException
    //   76  162:astore          9
    //   77  164:new             #47  <Class StringBuilder>
    //   78  167:dup             
    //   79  168:ldc1            #12  <String "is">
    //   80  170:invokespecial   #54  <Method void StringBuilder(String)>
    //   81  173:aload           6
    //   82  175:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   83  178:invokevirtual   #62  <Method String StringBuilder.toString()>
    //   84  181:astore          10
    // try 183 194 handler(s) 197
    //   85  183:aload_0         
    //   86  184:aload_1         
    //   87  185:aload           10
    //   88  187:aconst_null     
    //   89  188:invokevirtual   #68  <Method Method Class.getMethod(String, Class[])>
    //   90  191:putfield        #70  <Field Method mGetter>
    //   91  194:goto            75
    // catch NoSuchMethodException
    //   92  197:astore          11
    // try 199 218 handler(s) 221
    //   93  199:aload_0         
    //   94  200:aload_1         
    //   95  201:aload           10
    //   96  203:aconst_null     
    //   97  204:invokevirtual   #97  <Method Method Class.getDeclaredMethod(String, Class[])>
    //   98  207:putfield        #70  <Field Method mGetter>
    //   99  210:aload_0         
    //  100  211:getfield        #70  <Field Method mGetter>
    //  101  214:iconst_1        
    //  102  215:invokevirtual   #101 <Method void Method.setAccessible(boolean)>
    //  103  218:goto            75
    // catch NoSuchMethodException
    //  104  221:astore          12
    // try 223 295 handler(s) 295
    //  105  223:aload_0         
    //  106  224:aload_1         
    //  107  225:aload_3         
    //  108  226:invokevirtual   #105 <Method Field Class.getField(String)>
    //  109  229:putfield        #107 <Field Field mField>
    //  110  232:aload_0         
    //  111  233:getfield        #107 <Field Field mField>
    //  112  236:invokevirtual   #112 <Method Class Field.getType()>
    //  113  239:astore          14
    //  114  241:aload_0         
    //  115  242:aload_2         
    //  116  243:aload           14
    //  117  245:invokespecial   #80  <Method boolean typesMatch(Class, Class)>
    //  118  248:ifne            367
    //  119  251:new             #82  <Class NoSuchPropertyException>
    //  120  254:dup             
    //  121  255:new             #47  <Class StringBuilder>
    //  122  258:dup             
    //  123  259:ldc1            #84  <String "Underlying type (">
    //  124  261:invokespecial   #54  <Method void StringBuilder(String)>
    //  125  264:aload           14
    //  126  266:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
    //  127  269:ldc1            #89  <String ") ">
    //  128  271:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  129  274:ldc1            #91  <String "does not match Property type (">
    //  130  276:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  131  279:aload_2         
    //  132  280:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
    //  133  283:ldc1            #93  <String ")">
    //  134  285:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  135  288:invokevirtual   #62  <Method String StringBuilder.toString()>
    //  136  291:invokespecial   #94  <Method void NoSuchPropertyException(String)>
    //  137  294:athrow          
    // catch NoSuchFieldException
    //  138  295:astore          13
    //  139  297:new             #82  <Class NoSuchPropertyException>
    //  140  300:dup             
    //  141  301:new             #47  <Class StringBuilder>
    //  142  304:dup             
    //  143  305:ldc1            #114 <String "No accessor method or field found for property with name ">
    //  144  307:invokespecial   #54  <Method void StringBuilder(String)>
    //  145  310:aload_3         
    //  146  311:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  147  314:invokevirtual   #62  <Method String StringBuilder.toString()>
    //  148  317:invokespecial   #94  <Method void NoSuchPropertyException(String)>
    //  149  320:athrow          
    //  150  321:new             #47  <Class StringBuilder>
    //  151  324:dup             
    //  152  325:ldc1            #15  <String "set">
    //  153  327:invokespecial   #54  <Method void StringBuilder(String)>
    //  154  330:aload           6
    //  155  332:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //  156  335:invokevirtual   #62  <Method String StringBuilder.toString()>
    //  157  338:astore          16
    // try 340 367 handler(s) 368
    //  158  340:aload_0         
    //  159  341:aload_1         
    //  160  342:aload           16
    //  161  344:iconst_1        
    //  162  345:anewarray       Class[]
    //  163  348:dup             
    //  164  349:iconst_0        
    //  165  350:aload           15
    //  166  352:aastore         
    //  167  353:invokevirtual   #97  <Method Method Class.getDeclaredMethod(String, Class[])>
    //  168  356:putfield        #116 <Field Method mSetter>
    //  169  359:aload_0         
    //  170  360:getfield        #116 <Field Method mSetter>
    //  171  363:iconst_1        
    //  172  364:invokevirtual   #101 <Method void Method.setAccessible(boolean)>
    //  173  367:return          
    // catch NoSuchMethodException
    //  174  368:astore          17
    //  175  370:return          
    }

    private boolean typesMatch(Class class1, Class class2)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:if_acmpeq       120
    //    3    5:aload_2         
    //    4    6:invokevirtual   #120 <Method boolean Class.isPrimitive()>
    //    5    9:ifeq            116
    //    6   12:aload_2         
    //    7   13:getstatic       #126 <Field Class Float.TYPE>
    //    8   16:if_acmpne       25
    //    9   19:aload_1         
    //   10   20:ldc1            #122 <Class Float>
    //   11   22:if_acmpeq       118
    //   12   25:aload_2         
    //   13   26:getstatic       #129 <Field Class Integer.TYPE>
    //   14   29:if_acmpne       38
    //   15   32:aload_1         
    //   16   33:ldc1            #128 <Class Integer>
    //   17   35:if_acmpeq       118
    //   18   38:aload_2         
    //   19   39:getstatic       #132 <Field Class Boolean.TYPE>
    //   20   42:if_acmpne       51
    //   21   45:aload_1         
    //   22   46:ldc1            #131 <Class Boolean>
    //   23   48:if_acmpeq       118
    //   24   51:aload_2         
    //   25   52:getstatic       #135 <Field Class Long.TYPE>
    //   26   55:if_acmpne       64
    //   27   58:aload_1         
    //   28   59:ldc1            #134 <Class Long>
    //   29   61:if_acmpeq       118
    //   30   64:aload_2         
    //   31   65:getstatic       #138 <Field Class Double.TYPE>
    //   32   68:if_acmpne       77
    //   33   71:aload_1         
    //   34   72:ldc1            #137 <Class Double>
    //   35   74:if_acmpeq       118
    //   36   77:aload_2         
    //   37   78:getstatic       #141 <Field Class Short.TYPE>
    //   38   81:if_acmpne       90
    //   39   84:aload_1         
    //   40   85:ldc1            #140 <Class Short>
    //   41   87:if_acmpeq       118
    //   42   90:aload_2         
    //   43   91:getstatic       #144 <Field Class Byte.TYPE>
    //   44   94:if_acmpne       103
    //   45   97:aload_1         
    //   46   98:ldc1            #143 <Class Byte>
    //   47  100:if_acmpeq       118
    //   48  103:aload_2         
    //   49  104:getstatic       #145 <Field Class Character.TYPE>
    //   50  107:if_acmpne       116
    //   51  110:aload_1         
    //   52  111:ldc1            #37  <Class Character>
    //   53  113:if_acmpeq       118
    //   54  116:iconst_0        
    //   55  117:ireturn         
    //   56  118:iconst_1        
    //   57  119:ireturn         
    //   58  120:iconst_1        
    //   59  121:ireturn         
    }

    public Object get(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field Method mGetter>
    //    2    4:ifnull          46
    // try 7 18 handler(s) 21 31
    //    3    7:aload_0         
    //    4    8:getfield        #70  <Field Method mGetter>
    //    5   11:aload_1         
    //    6   12:aconst_null     
    //    7   13:invokevirtual   #154 <Method Object Method.invoke(Object, Object[])>
    //    8   16:astore          6
    //    9   18:aload           6
    //   10   20:areturn         
    // catch IllegalAccessException
    //   11   21:astore          5
    //   12   23:new             #156 <Class AssertionError>
    //   13   26:dup             
    //   14   27:invokespecial   #159 <Method void AssertionError()>
    //   15   30:athrow          
    // catch InvocationTargetException
    //   16   31:astore          4
    //   17   33:new             #161 <Class RuntimeException>
    //   18   36:dup             
    //   19   37:aload           4
    //   20   39:invokevirtual   #165 <Method Throwable InvocationTargetException.getCause()>
    //   21   42:invokespecial   #168 <Method void RuntimeException(Throwable)>
    //   22   45:athrow          
    //   23   46:aload_0         
    //   24   47:getfield        #107 <Field Field mField>
    //   25   50:ifnull          73
    // try 53 62 handler(s) 64
    //   26   53:aload_0         
    //   27   54:getfield        #107 <Field Field mField>
    //   28   57:aload_1         
    //   29   58:invokevirtual   #170 <Method Object Field.get(Object)>
    //   30   61:astore_3        
    //   31   62:aload_3         
    //   32   63:areturn         
    // catch IllegalAccessException
    //   33   64:astore_2        
    //   34   65:new             #156 <Class AssertionError>
    //   35   68:dup             
    //   36   69:invokespecial   #159 <Method void AssertionError()>
    //   37   72:athrow          
    //   38   73:new             #156 <Class AssertionError>
    //   39   76:dup             
    //   40   77:invokespecial   #159 <Method void AssertionError()>
    //   41   80:athrow          
    }

    public boolean isReadOnly()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field Method mSetter>
    //    2    4:ifnonnull       16
    //    3    7:aload_0         
    //    4    8:getfield        #107 <Field Field mField>
    //    5   11:ifnonnull       16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    public void set(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field Method mSetter>
    //    2    4:ifnull          50
    // try 7 24 handler(s) 25 35
    //    3    7:aload_0         
    //    4    8:getfield        #116 <Field Method mSetter>
    //    5   11:aload_1         
    //    6   12:iconst_1        
    //    7   13:anewarray       Object[]
    //    8   16:dup             
    //    9   17:iconst_0        
    //   10   18:aload_2         
    //   11   19:aastore         
    //   12   20:invokevirtual   #154 <Method Object Method.invoke(Object, Object[])>
    //   13   23:pop             
    //   14   24:return          
    // catch IllegalAccessException
    //   15   25:astore          5
    //   16   27:new             #156 <Class AssertionError>
    //   17   30:dup             
    //   18   31:invokespecial   #159 <Method void AssertionError()>
    //   19   34:athrow          
    // catch InvocationTargetException
    //   20   35:astore          4
    //   21   37:new             #161 <Class RuntimeException>
    //   22   40:dup             
    //   23   41:aload           4
    //   24   43:invokevirtual   #165 <Method Throwable InvocationTargetException.getCause()>
    //   25   46:invokespecial   #168 <Method void RuntimeException(Throwable)>
    //   26   49:athrow          
    //   27   50:aload_0         
    //   28   51:getfield        #107 <Field Field mField>
    //   29   54:ifnull          76
    // try 57 66 handler(s) 67
    //   30   57:aload_0         
    //   31   58:getfield        #107 <Field Field mField>
    //   32   61:aload_1         
    //   33   62:aload_2         
    //   34   63:invokevirtual   #176 <Method void Field.set(Object, Object)>
    //   35   66:return          
    // catch IllegalAccessException
    //   36   67:astore_3        
    //   37   68:new             #156 <Class AssertionError>
    //   38   71:dup             
    //   39   72:invokespecial   #159 <Method void AssertionError()>
    //   40   75:athrow          
    //   41   76:new             #178 <Class UnsupportedOperationException>
    //   42   79:dup             
    //   43   80:new             #47  <Class StringBuilder>
    //   44   83:dup             
    //   45   84:ldc1            #180 <String "Property ">
    //   46   86:invokespecial   #54  <Method void StringBuilder(String)>
    //   47   89:aload_0         
    //   48   90:invokevirtual   #183 <Method String getName()>
    //   49   93:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   50   96:ldc1            #185 <String " is read-only">
    //   51   98:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
    //   52  101:invokevirtual   #62  <Method String StringBuilder.toString()>
    //   53  104:invokespecial   #186 <Method void UnsupportedOperationException(String)>
    //   54  107:athrow          
    }

    private static final String PREFIX_GET = "get";
    private static final String PREFIX_IS = "is";
    private static final String PREFIX_SET = "set";
    private Field mField;
    private Method mGetter;
    private Method mSetter;
}
