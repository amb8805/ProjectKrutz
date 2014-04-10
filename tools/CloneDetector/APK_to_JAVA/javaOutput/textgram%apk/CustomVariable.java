// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            AnalyticsParameterEncoder

class CustomVariable
{

    public CustomVariable(int i, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:iconst_3        
    //    5    5:invokespecial   #28  <Method void CustomVariable(int, String, String, int)>
    //    6    8:return          
    }

    public CustomVariable(int i, String s, String s1, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void Object()>
    //    2    4:iload           4
    //    3    6:iconst_1        
    //    4    7:icmpeq          50
    //    5   10:iload           4
    //    6   12:iconst_2        
    //    7   13:icmpeq          50
    //    8   16:iload           4
    //    9   18:iconst_3        
    //   10   19:icmpeq          50
    //   11   22:new             #33  <Class IllegalArgumentException>
    //   12   25:dup             
    //   13   26:new             #35  <Class StringBuilder>
    //   14   29:dup             
    //   15   30:invokespecial   #36  <Method void StringBuilder()>
    //   16   33:ldc1            #38  <String "Invalid Scope:">
    //   17   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   18   38:iload           4
    //   19   40:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
    //   20   43:invokevirtual   #49  <Method String StringBuilder.toString()>
    //   21   46:invokespecial   #52  <Method void IllegalArgumentException(String)>
    //   22   49:athrow          
    //   23   50:iload_1         
    //   24   51:iconst_1        
    //   25   52:icmplt          60
    //   26   55:iload_1         
    //   27   56:iconst_5        
    //   28   57:icmple          70
    //   29   60:new             #33  <Class IllegalArgumentException>
    //   30   63:dup             
    //   31   64:ldc1            #8   <String "Index must be between 1 and 5 inclusive.">
    //   32   66:invokespecial   #52  <Method void IllegalArgumentException(String)>
    //   33   69:athrow          
    //   34   70:aload_2         
    //   35   71:ifnull          81
    //   36   74:aload_2         
    //   37   75:invokevirtual   #58  <Method int String.length()>
    //   38   78:ifne            91
    //   39   81:new             #33  <Class IllegalArgumentException>
    //   40   84:dup             
    //   41   85:ldc1            #60  <String "Invalid argument for name:  Cannot be empty">
    //   42   87:invokespecial   #52  <Method void IllegalArgumentException(String)>
    //   43   90:athrow          
    //   44   91:aload_3         
    //   45   92:ifnull          102
    //   46   95:aload_3         
    //   47   96:invokevirtual   #58  <Method int String.length()>
    //   48   99:ifne            112
    //   49  102:new             #33  <Class IllegalArgumentException>
    //   50  105:dup             
    //   51  106:ldc1            #62  <String "Invalid argument for value:  Cannot be empty">
    //   52  108:invokespecial   #52  <Method void IllegalArgumentException(String)>
    //   53  111:athrow          
    //   54  112:new             #35  <Class StringBuilder>
    //   55  115:dup             
    //   56  116:invokespecial   #36  <Method void StringBuilder()>
    //   57  119:aload_2         
    //   58  120:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   59  123:aload_3         
    //   60  124:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   61  127:invokevirtual   #49  <Method String StringBuilder.toString()>
    //   62  130:invokestatic    #68  <Method String AnalyticsParameterEncoder.encode(String)>
    //   63  133:invokevirtual   #58  <Method int String.length()>
    //   64  136:istore          5
    //   65  138:iload           5
    //   66  140:bipush          64
    //   67  142:icmple          173
    //   68  145:new             #33  <Class IllegalArgumentException>
    //   69  148:dup             
    //   70  149:new             #35  <Class StringBuilder>
    //   71  152:dup             
    //   72  153:invokespecial   #36  <Method void StringBuilder()>
    //   73  156:ldc1            #70  <String "Encoded form of name and value must not exceed 64 characters combined.  Character length: ">
    //   74  158:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
    //   75  161:iload           5
    //   76  163:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
    //   77  166:invokevirtual   #49  <Method String StringBuilder.toString()>
    //   78  169:invokespecial   #52  <Method void IllegalArgumentException(String)>
    //   79  172:athrow          
    //   80  173:aload_0         
    //   81  174:iload_1         
    //   82  175:putfield        #72  <Field int index>
    //   83  178:aload_0         
    //   84  179:iload           4
    //   85  181:putfield        #74  <Field int scope>
    //   86  184:aload_0         
    //   87  185:aload_2         
    //   88  186:putfield        #76  <Field String name>
    //   89  189:aload_0         
    //   90  190:aload_3         
    //   91  191:putfield        #78  <Field String value>
    //   92  194:return          
    }

    public int getIndex()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #72  <Field int index>
    //    2    4:ireturn         
    }

    public String getName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field String name>
    //    2    4:areturn         
    }

    public int getScope()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field int scope>
    //    2    4:ireturn         
    }

    public String getValue()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field String value>
    //    2    4:areturn         
    }

    public static final String INDEX_ERROR_MSG = "Index must be between 1 and 5 inclusive.";
    public static final int MAX_CUSTOM_VARIABLES = 5;
    public static final int MAX_CUSTOM_VARIABLE_LENGTH = 64;
    public static final int PAGE_SCOPE = 3;
    public static final int SESSION_SCOPE = 2;
    public static final int VISITOR_SCOPE = 1;
    private final int index;
    private final String name;
    private final int scope;
    private final String value;
}
