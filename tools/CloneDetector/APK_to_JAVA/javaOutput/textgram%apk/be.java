// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.applovin.impl.sdk:
//            bf

class be
{

    public be(CharSequence charsequence, AppLovinLogger applovinlogger)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #19  <Class HashMap>
    //    4    8:dup             
    //    5    9:iconst_1        
    //    6   10:invokespecial   #22  <Method void HashMap(int)>
    //    7   13:putfield        #24  <Field Map c>
    //    8   16:aload_1         
    //    9   17:ifnonnull       30
    //   10   20:new             #26  <Class IllegalArgumentException>
    //   11   23:dup             
    //   12   24:ldc1            #28  <String "No template specified">
    //   13   26:invokespecial   #31  <Method void IllegalArgumentException(String)>
    //   14   29:athrow          
    //   15   30:aload_2         
    //   16   31:ifnonnull       44
    //   17   34:new             #26  <Class IllegalArgumentException>
    //   18   37:dup             
    //   19   38:ldc1            #33  <String "No logger specified">
    //   20   40:invokespecial   #31  <Method void IllegalArgumentException(String)>
    //   21   43:athrow          
    //   22   44:aload_0         
    //   23   45:aload_1         
    //   24   46:putfield        #35  <Field CharSequence a>
    //   25   49:aload_0         
    //   26   50:aload_2         
    //   27   51:putfield        #37  <Field AppLovinLogger b>
    //   28   54:return          
    }

    private String a(String s)
    {
    //    0    0:aload_1         
    //    1    1:bipush          58
    //    2    3:invokevirtual   #44  <Method int String.indexOf(int)>
    //    3    6:istore_2        
    //    4    7:iload_2         
    //    5    8:ifle            152
    //    6   11:aload_1         
    //    7   12:iconst_0        
    //    8   13:iload_2         
    //    9   14:invokevirtual   #48  <Method String String.substring(int, int)>
    //   10   17:invokevirtual   #52  <Method String String.trim()>
    //   11   20:astore          8
    //   12   22:iload_2         
    //   13   23:iconst_1        
    //   14   24:iadd            
    //   15   25:aload_1         
    //   16   26:invokevirtual   #56  <Method int String.length()>
    //   17   29:icmpge          145
    //   18   32:aload_1         
    //   19   33:iload_2         
    //   20   34:iconst_1        
    //   21   35:iadd            
    //   22   36:invokevirtual   #59  <Method String String.substring(int)>
    //   23   39:invokevirtual   #52  <Method String String.trim()>
    //   24   42:astore          9
    //   25   44:aload           8
    //   26   46:astore_3        
    //   27   47:aload           9
    //   28   49:astore          4
    //   29   51:aload_0         
    //   30   52:getfield        #61  <Field bf d>
    //   31   55:ifnull          173
    //   32   58:aload_0         
    //   33   59:getfield        #61  <Field bf d>
    //   34   62:aload_3         
    //   35   63:invokeinterface #65  <Method String bf.a(String)>
    //   36   68:astore          6
    //   37   70:aload           6
    //   38   72:ifnull          166
    //   39   75:aload           6
    //   40   77:iconst_0        
    //   41   78:aload           6
    //   42   80:invokevirtual   #56  <Method int String.length()>
    //   43   83:bipush          30
    //   44   85:invokestatic    #71  <Method int Math.min(int, int)>
    //   45   88:invokevirtual   #48  <Method String String.substring(int, int)>
    //   46   91:astore          7
    //   47   93:aload_0         
    //   48   94:getfield        #37  <Field AppLovinLogger b>
    //   49   97:ldc1            #73  <String "TemplateProcessor">
    //   50   99:new             #75  <Class StringBuilder>
    //   51  102:dup             
    //   52  103:invokespecial   #76  <Method void StringBuilder()>
    //   53  106:aload_3         
    //   54  107:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   55  110:ldc1            #82  <String " was resolved to \"">
    //   56  112:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   57  115:aload           7
    //   58  117:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   59  120:ldc1            #84  <String "\"">
    //   60  122:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //   61  125:invokevirtual   #87  <Method String StringBuilder.toString()>
    //   62  128:invokeinterface #92  <Method void AppLovinLogger.d(String, String)>
    //   63  133:aload           6
    //   64  135:ifnull          173
    //   65  138:aload           6
    //   66  140:astore          5
    //   67  142:aload           5
    //   68  144:areturn         
    //   69  145:ldc1            #94  <String "">
    //   70  147:astore          9
    //   71  149:goto            44
    //   72  152:aload_1         
    //   73  153:invokevirtual   #52  <Method String String.trim()>
    //   74  156:invokevirtual   #97  <Method String String.toLowerCase()>
    //   75  159:astore_3        
    //   76  160:aconst_null     
    //   77  161:astore          4
    //   78  163:goto            51
    //   79  166:ldc1            #94  <String "">
    //   80  168:astore          7
    //   81  170:goto            93
    //   82  173:aload_0         
    //   83  174:getfield        #24  <Field Map c>
    //   84  177:aload_3         
    //   85  178:invokeinterface #103 <Method Object Map.get(Object)>
    //   86  183:checkcast       #40  <Class String>
    //   87  186:astore          5
    //   88  188:aload           5
    //   89  190:ifnonnull       142
    //   90  193:aload_0         
    //   91  194:getfield        #24  <Field Map c>
    //   92  197:aload_3         
    //   93  198:invokevirtual   #97  <Method String String.toLowerCase()>
    //   94  201:invokeinterface #103 <Method Object Map.get(Object)>
    //   95  206:checkcast       #40  <Class String>
    //   96  209:astore          5
    //   97  211:aload           5
    //   98  213:ifnonnull       142
    //   99  216:aload           4
    //  100  218:areturn         
    }

    public String a()
    {
    //    0    0:new             #105 <Class StringBuffer>
    //    1    3:dup             
    //    2    4:invokespecial   #106 <Method void StringBuffer()>
    //    3    7:astore_1        
    //    4    8:new             #105 <Class StringBuffer>
    //    5   11:dup             
    //    6   12:invokespecial   #106 <Method void StringBuffer()>
    //    7   15:astore_2        
    //    8   16:iconst_0        
    //    9   17:istore_3        
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:iconst_0        
    //   13   22:istore          5
    //   14   24:iconst_0        
    //   15   25:istore          6
    //   16   27:iload_3         
    //   17   28:aload_0         
    //   18   29:getfield        #35  <Field CharSequence a>
    //   19   32:invokeinterface #109 <Method int CharSequence.length()>
    //   20   37:icmpge          296
    //   21   40:aload_0         
    //   22   41:getfield        #35  <Field CharSequence a>
    //   23   44:iload_3         
    //   24   45:invokeinterface #113 <Method char CharSequence.charAt(int)>
    //   25   50:istore          10
    //   26   52:iload           6
    //   27   54:ifne            147
    //   28   57:iload           10
    //   29   59:bipush          60
    //   30   61:icmpne          91
    //   31   64:iload           5
    //   32   66:ifne            78
    //   33   69:iconst_1        
    //   34   70:istore          5
    //   35   72:iinc            3  1
    //   36   75:goto            27
    //   37   78:aload_1         
    //   38   79:ldc1            #115 <String "<">
    //   39   81:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //   40   84:pop             
    //   41   85:iconst_0        
    //   42   86:istore          5
    //   43   88:goto            72
    //   44   91:iload           10
    //   45   93:bipush          37
    //   46   95:icmpne          122
    //   47   98:iload           5
    //   48  100:ifeq            112
    //   49  103:iconst_1        
    //   50  104:istore          6
    //   51  106:iconst_0        
    //   52  107:istore          5
    //   53  109:goto            72
    //   54  112:aload_1         
    //   55  113:iload           10
    //   56  115:invokevirtual   #121 <Method StringBuffer StringBuffer.append(char)>
    //   57  118:pop             
    //   58  119:goto            72
    //   59  122:iload           5
    //   60  124:ifeq            137
    //   61  127:aload_1         
    //   62  128:ldc1            #115 <String "<">
    //   63  130:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //   64  133:pop             
    //   65  134:iconst_0        
    //   66  135:istore          5
    //   67  137:aload_1         
    //   68  138:iload           10
    //   69  140:invokevirtual   #121 <Method StringBuffer StringBuffer.append(char)>
    //   70  143:pop             
    //   71  144:goto            72
    //   72  147:iload           10
    //   73  149:bipush          37
    //   74  151:icmpne          178
    //   75  154:iload           4
    //   76  156:ifne            165
    //   77  159:iconst_1        
    //   78  160:istore          4
    //   79  162:goto            72
    //   80  165:aload_2         
    //   81  166:ldc1            #123 <String "%">
    //   82  168:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //   83  171:pop             
    //   84  172:iconst_0        
    //   85  173:istore          4
    //   86  175:goto            72
    //   87  178:iload           10
    //   88  180:bipush          62
    //   89  182:icmpne          286
    //   90  185:iload           4
    //   91  187:ifeq            276
    //   92  190:aload_2         
    //   93  191:invokevirtual   #124 <Method String StringBuffer.toString()>
    //   94  194:astore          13
    //   95  196:aload_2         
    //   96  197:iconst_0        
    //   97  198:invokevirtual   #127 <Method void StringBuffer.setLength(int)>
    //   98  201:aload_0         
    //   99  202:aload           13
    //  100  204:invokespecial   #128 <Method String a(String)>
    //  101  207:astore          14
    //  102  209:aload           14
    //  103  211:ifnull          230
    //  104  214:aload_1         
    //  105  215:aload           14
    //  106  217:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  107  220:pop             
    //  108  221:iconst_0        
    //  109  222:istore          4
    //  110  224:iconst_0        
    //  111  225:istore          6
    //  112  227:goto            72
    //  113  230:aload_1         
    //  114  231:ldc1            #94  <String "">
    //  115  233:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  116  236:pop             
    //  117  237:aload_0         
    //  118  238:getfield        #37  <Field AppLovinLogger b>
    //  119  241:ldc1            #73  <String "TemplateProcessor">
    //  120  243:new             #75  <Class StringBuilder>
    //  121  246:dup             
    //  122  247:invokespecial   #76  <Method void StringBuilder()>
    //  123  250:ldc1            #130 <String "Unable to resolve \"">
    //  124  252:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //  125  255:aload           13
    //  126  257:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //  127  260:ldc1            #132 <String "\", using empty string">
    //  128  262:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
    //  129  265:invokevirtual   #87  <Method String StringBuilder.toString()>
    //  130  268:invokeinterface #135 <Method void AppLovinLogger.w(String, String)>
    //  131  273:goto            221
    //  132  276:aload_2         
    //  133  277:ldc1            #137 <String ">">
    //  134  279:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  135  282:pop             
    //  136  283:goto            72
    //  137  286:aload_2         
    //  138  287:iload           10
    //  139  289:invokevirtual   #121 <Method StringBuffer StringBuffer.append(char)>
    //  140  292:pop             
    //  141  293:goto            72
    //  142  296:iload           5
    //  143  298:ifeq            308
    //  144  301:aload_1         
    //  145  302:ldc1            #115 <String "<">
    //  146  304:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  147  307:pop             
    //  148  308:iload           6
    //  149  310:ifeq            336
    //  150  313:aload_1         
    //  151  314:ldc1            #139 <String "<%">
    //  152  316:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  153  319:aload_2         
    //  154  320:invokevirtual   #142 <Method StringBuffer StringBuffer.append(StringBuffer)>
    //  155  323:pop             
    //  156  324:iload           4
    //  157  326:ifeq            336
    //  158  329:aload_1         
    //  159  330:ldc1            #123 <String "%">
    //  160  332:invokevirtual   #118 <Method StringBuffer StringBuffer.append(String)>
    //  161  335:pop             
    //  162  336:aload_1         
    //  163  337:invokevirtual   #124 <Method String StringBuffer.toString()>
    //  164  340:areturn         
    }

    public void a(String s, String s1)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #26  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #144 <String "No name specified">
    //    5   10:invokespecial   #31  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:getfield        #24  <Field Map c>
    //    9   18:aload_1         
    //   10   19:aload_2         
    //   11   20:invokeinterface #148 <Method Object Map.put(Object, Object)>
    //   12   25:pop             
    //   13   26:return          
    }

    void a(Map map)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #26  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #151 <String "No variables specified">
    //    5   10:invokespecial   #31  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:getfield        #24  <Field Map c>
    //    9   18:aload_1         
    //   10   19:invokeinterface #154 <Method void Map.putAll(Map)>
    //   11   24:return          
    }

    private final CharSequence a;
    private final AppLovinLogger b;
    private final Map c;
    private bf d;
}
