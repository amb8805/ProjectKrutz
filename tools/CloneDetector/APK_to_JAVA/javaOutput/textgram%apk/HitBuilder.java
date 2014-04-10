// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import java.util.Locale;

// Referenced classes of package com.google.android.apps.analytics:
//            AnalyticsParameterEncoder, Event, Item, Transaction, 
//            CustomVariable, CustomVariableBuffer, Referrer

class HitBuilder
{

    HitBuilder()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void Object()>
    //    2    4:return          
    }

    static void appendCurrencyValue(StringBuilder stringbuilder, String s, double d)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    3    5:ldc1            #32  <String "=">
    //    4    7:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    5   10:pop             
    //    6   11:ldc2w           #33  <Double 0.5D>
    //    7   14:dload_2         
    //    8   15:ldc2w           #35  <Double 1000000D>
    //    9   18:dmul            
    //   10   19:dadd            
    //   11   20:invokestatic    #42  <Method double Math.floor(double)>
    //   12   23:ldc2w           #35  <Double 1000000D>
    //   13   26:ddiv            
    //   14   27:dstore          5
    //   15   29:dload           5
    //   16   31:dconst_0        
    //   17   32:dcmpl           
    //   18   33:ifeq            46
    //   19   36:aload_0         
    //   20   37:dload           5
    //   21   39:invokestatic    #48  <Method String Double.toString(double)>
    //   22   42:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   23   45:pop             
    //   24   46:return          
    }

    private static void appendStringValue(StringBuilder stringbuilder, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    3    5:ldc1            #32  <String "=">
    //    4    7:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    5   10:pop             
    //    6   11:aload_2         
    //    7   12:ifnull          34
    //    8   15:aload_2         
    //    9   16:invokevirtual   #56  <Method String String.trim()>
    //   10   19:invokevirtual   #60  <Method int String.length()>
    //   11   22:ifle            34
    //   12   25:aload_0         
    //   13   26:aload_2         
    //   14   27:invokestatic    #66  <Method String AnalyticsParameterEncoder.encode(String)>
    //   15   30:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   16   33:pop             
    //   17   34:return          
    }

    private static String constructEventRequestPath(Event event, Referrer referrer)
    {
    //    0    0:invokestatic    #74  <Method Locale Locale.getDefault()>
    //    1    3:astore_2        
    //    2    4:new             #26  <Class StringBuilder>
    //    3    7:dup             
    //    4    8:invokespecial   #75  <Method void StringBuilder()>
    //    5   11:astore_3        
    //    6   12:new             #26  <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #75  <Method void StringBuilder()>
    //    9   19:astore          4
    //   10   21:iconst_2        
    //   11   22:anewarray       Object[]
    //   12   25:astore          5
    //   13   27:aload           5
    //   14   29:iconst_0        
    //   15   30:aload_0         
    //   16   31:getfield        #80  <Field String Event.category>
    //   17   34:invokestatic    #81  <Method String encode(String)>
    //   18   37:aastore         
    //   19   38:aload           5
    //   20   40:iconst_1        
    //   21   41:aload_0         
    //   22   42:getfield        #84  <Field String Event.action>
    //   23   45:invokestatic    #81  <Method String encode(String)>
    //   24   48:aastore         
    //   25   49:aload           4
    //   26   51:ldc1            #86  <String "5(%s*%s">
    //   27   53:aload           5
    //   28   55:invokestatic    #90  <Method String String.format(String, Object[])>
    //   29   58:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   30   61:pop             
    //   31   62:aload_0         
    //   32   63:getfield        #93  <Field String Event.label>
    //   33   66:ifnull          87
    //   34   69:aload           4
    //   35   71:ldc1            #95  <String "*">
    //   36   73:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   37   76:aload_0         
    //   38   77:getfield        #93  <Field String Event.label>
    //   39   80:invokestatic    #81  <Method String encode(String)>
    //   40   83:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   41   86:pop             
    //   42   87:aload           4
    //   43   89:ldc1            #97  <String ")">
    //   44   91:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   45   94:pop             
    //   46   95:aload_0         
    //   47   96:getfield        #100 <Field int Event.value>
    //   48   99:iconst_m1       
    //   49  100:icmple          133
    //   50  103:iconst_1        
    //   51  104:anewarray       Object[]
    //   52  107:astore          22
    //   53  109:aload           22
    //   54  111:iconst_0        
    //   55  112:aload_0         
    //   56  113:getfield        #100 <Field int Event.value>
    //   57  116:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //   58  119:aastore         
    //   59  120:aload           4
    //   60  122:ldc1            #108 <String "(%d)">
    //   61  124:aload           22
    //   62  126:invokestatic    #90  <Method String String.format(String, Object[])>
    //   63  129:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   64  132:pop             
    //   65  133:aload           4
    //   66  135:aload_0         
    //   67  136:invokestatic    #112 <Method String getCustomVariableParams(Event)>
    //   68  139:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   69  142:pop             
    //   70  143:aload_3         
    //   71  144:ldc1            #11  <String "/__utm.gif">
    //   72  146:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   73  149:pop             
    //   74  150:aload_3         
    //   75  151:ldc1            #114 <String "?utmwv=4.8.1ma">
    //   76  153:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   77  156:pop             
    //   78  157:aload_3         
    //   79  158:ldc1            #116 <String "&utmn=">
    //   80  160:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   81  163:aload_0         
    //   82  164:invokevirtual   #119 <Method int Event.getRandomVal()>
    //   83  167:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   84  170:pop             
    //   85  171:aload_3         
    //   86  172:ldc1            #124 <String "&utmt=event">
    //   87  174:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   88  177:pop             
    //   89  178:aload_3         
    //   90  179:ldc1            #126 <String "&utme=">
    //   91  181:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   92  184:aload           4
    //   93  186:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   94  189:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   95  192:pop             
    //   96  193:aload_3         
    //   97  194:ldc1            #130 <String "&utmcs=UTF-8">
    //   98  196:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   99  199:pop             
    //  100  200:iconst_2        
    //  101  201:anewarray       Object[]
    //  102  204:astore          15
    //  103  206:aload           15
    //  104  208:iconst_0        
    //  105  209:aload_0         
    //  106  210:getfield        #133 <Field int Event.screenWidth>
    //  107  213:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //  108  216:aastore         
    //  109  217:aload           15
    //  110  219:iconst_1        
    //  111  220:aload_0         
    //  112  221:getfield        #136 <Field int Event.screenHeight>
    //  113  224:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //  114  227:aastore         
    //  115  228:aload_3         
    //  116  229:ldc1            #138 <String "&utmsr=%dx%d">
    //  117  231:aload           15
    //  118  233:invokestatic    #90  <Method String String.format(String, Object[])>
    //  119  236:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  120  239:pop             
    //  121  240:iconst_2        
    //  122  241:anewarray       Object[]
    //  123  244:astore          17
    //  124  246:aload           17
    //  125  248:iconst_0        
    //  126  249:aload_2         
    //  127  250:invokevirtual   #141 <Method String Locale.getLanguage()>
    //  128  253:aastore         
    //  129  254:aload           17
    //  130  256:iconst_1        
    //  131  257:aload_2         
    //  132  258:invokevirtual   #144 <Method String Locale.getCountry()>
    //  133  261:aastore         
    //  134  262:aload_3         
    //  135  263:ldc1            #146 <String "&utmul=%s-%s">
    //  136  265:aload           17
    //  137  267:invokestatic    #90  <Method String String.format(String, Object[])>
    //  138  270:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  139  273:pop             
    //  140  274:aload_3         
    //  141  275:ldc1            #148 <String "&utmac=">
    //  142  277:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  143  280:aload_0         
    //  144  281:getfield        #151 <Field String Event.accountId>
    //  145  284:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  146  287:pop             
    //  147  288:aload_3         
    //  148  289:ldc1            #153 <String "&utmcc=">
    //  149  291:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  150  294:aload_0         
    //  151  295:aload_1         
    //  152  296:invokestatic    #156 <Method String getEscapedCookieString(Event, Referrer)>
    //  153  299:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  154  302:pop             
    //  155  303:aload_0         
    //  156  304:invokevirtual   #159 <Method int Event.getAdHitId()>
    //  157  307:ifeq            324
    //  158  310:aload_3         
    //  159  311:ldc1            #161 <String "&utmhid=">
    //  160  313:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  161  316:aload_0         
    //  162  317:invokevirtual   #159 <Method int Event.getAdHitId()>
    //  163  320:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //  164  323:pop             
    //  165  324:aload_3         
    //  166  325:invokevirtual   #128 <Method String StringBuilder.toString()>
    //  167  328:areturn         
    }

    public static String constructHitRequestPath(Event event, Referrer referrer)
    {
    //    0    0:new             #26  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void StringBuilder()>
    //    3    7:astore_2        
    //    4    8:ldc1            #164 <String "__##GOOGLEPAGEVIEW##__">
    //    5   10:aload_0         
    //    6   11:getfield        #80  <Field String Event.category>
    //    7   14:invokevirtual   #168 <Method boolean String.equals(Object)>
    //    8   17:ifeq            82
    //    9   20:aload_2         
    //   10   21:aload_0         
    //   11   22:aload_1         
    //   12   23:invokestatic    #171 <Method String constructPageviewRequestPath(Event, Referrer)>
    //   13   26:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   14   29:pop             
    //   15   30:aload_0         
    //   16   31:invokevirtual   #175 <Method boolean Event.getAnonymizeIp()>
    //   17   34:ifeq            44
    //   18   37:aload_2         
    //   19   38:ldc1            #177 <String "&aip=1">
    //   20   40:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   21   43:pop             
    //   22   44:aload_0         
    //   23   45:invokevirtual   #180 <Method boolean Event.getUseServerTime()>
    //   24   48:ifne            77
    //   25   51:aload_2         
    //   26   52:new             #26  <Class StringBuilder>
    //   27   55:dup             
    //   28   56:invokespecial   #75  <Method void StringBuilder()>
    //   29   59:ldc1            #182 <String "&utmht=">
    //   30   61:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   31   64:invokestatic    #188 <Method long System.currentTimeMillis()>
    //   32   67:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
    //   33   70:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   34   73:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   35   76:pop             
    //   36   77:aload_2         
    //   37   78:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   38   81:areturn         
    //   39   82:ldc1            #193 <String "__##GOOGLEITEM##__">
    //   40   84:aload_0         
    //   41   85:getfield        #80  <Field String Event.category>
    //   42   88:invokevirtual   #168 <Method boolean String.equals(Object)>
    //   43   91:ifeq            107
    //   44   94:aload_2         
    //   45   95:aload_0         
    //   46   96:aload_1         
    //   47   97:invokestatic    #196 <Method String constructItemRequestPath(Event, Referrer)>
    //   48  100:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   49  103:pop             
    //   50  104:goto            30
    //   51  107:ldc1            #198 <String "__##GOOGLETRANSACTION##__">
    //   52  109:aload_0         
    //   53  110:getfield        #80  <Field String Event.category>
    //   54  113:invokevirtual   #168 <Method boolean String.equals(Object)>
    //   55  116:ifeq            132
    //   56  119:aload_2         
    //   57  120:aload_0         
    //   58  121:aload_1         
    //   59  122:invokestatic    #201 <Method String constructTransactionRequestPath(Event, Referrer)>
    //   60  125:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   61  128:pop             
    //   62  129:goto            30
    //   63  132:aload_2         
    //   64  133:aload_0         
    //   65  134:aload_1         
    //   66  135:invokestatic    #203 <Method String constructEventRequestPath(Event, Referrer)>
    //   67  138:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   68  141:pop             
    //   69  142:goto            30
    }

    private static String constructItemRequestPath(Event event, Referrer referrer)
    {
    //    0    0:new             #26  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void StringBuilder()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc1            #11  <String "/__utm.gif">
    //    6   11:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    7   14:pop             
    //    8   15:aload_2         
    //    9   16:ldc1            #114 <String "?utmwv=4.8.1ma">
    //   10   18:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   11   21:pop             
    //   12   22:aload_2         
    //   13   23:ldc1            #116 <String "&utmn=">
    //   14   25:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   15   28:aload_0         
    //   16   29:invokevirtual   #119 <Method int Event.getRandomVal()>
    //   17   32:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   18   35:pop             
    //   19   36:aload_2         
    //   20   37:ldc1            #205 <String "&utmt=item">
    //   21   39:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   22   42:pop             
    //   23   43:aload_0         
    //   24   44:invokevirtual   #209 <Method Item Event.getItem()>
    //   25   47:astore          7
    //   26   49:aload           7
    //   27   51:ifnull          136
    //   28   54:aload_2         
    //   29   55:ldc1            #211 <String "&utmtid">
    //   30   57:aload           7
    //   31   59:invokevirtual   #216 <Method String Item.getOrderId()>
    //   32   62:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   33   65:aload_2         
    //   34   66:ldc1            #220 <String "&utmipc">
    //   35   68:aload           7
    //   36   70:invokevirtual   #223 <Method String Item.getItemSKU()>
    //   37   73:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   38   76:aload_2         
    //   39   77:ldc1            #225 <String "&utmipn">
    //   40   79:aload           7
    //   41   81:invokevirtual   #228 <Method String Item.getItemName()>
    //   42   84:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   43   87:aload_2         
    //   44   88:ldc1            #230 <String "&utmiva">
    //   45   90:aload           7
    //   46   92:invokevirtual   #233 <Method String Item.getItemCategory()>
    //   47   95:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   48   98:aload_2         
    //   49   99:ldc1            #235 <String "&utmipr">
    //   50  101:aload           7
    //   51  103:invokevirtual   #239 <Method double Item.getItemPrice()>
    //   52  106:invokestatic    #241 <Method void appendCurrencyValue(StringBuilder, String, double)>
    //   53  109:aload_2         
    //   54  110:ldc1            #243 <String "&utmiqt=">
    //   55  112:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   56  115:pop             
    //   57  116:aload           7
    //   58  118:invokevirtual   #246 <Method long Item.getItemCount()>
    //   59  121:lconst_0        
    //   60  122:lcmp            
    //   61  123:ifeq            136
    //   62  126:aload_2         
    //   63  127:aload           7
    //   64  129:invokevirtual   #246 <Method long Item.getItemCount()>
    //   65  132:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
    //   66  135:pop             
    //   67  136:aload_2         
    //   68  137:ldc1            #148 <String "&utmac=">
    //   69  139:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   70  142:aload_0         
    //   71  143:getfield        #151 <Field String Event.accountId>
    //   72  146:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   73  149:pop             
    //   74  150:aload_2         
    //   75  151:ldc1            #153 <String "&utmcc=">
    //   76  153:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   77  156:aload_0         
    //   78  157:aload_1         
    //   79  158:invokestatic    #156 <Method String getEscapedCookieString(Event, Referrer)>
    //   80  161:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   81  164:pop             
    //   82  165:aload_2         
    //   83  166:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   84  169:areturn         
    }

    private static String constructPageviewRequestPath(Event event, Referrer referrer)
    {
    //    0    0:ldc1            #248 <String "">
    //    1    2:astore_2        
    //    2    3:aload_0         
    //    3    4:getfield        #84  <Field String Event.action>
    //    4    7:ifnull          15
    //    5   10:aload_0         
    //    6   11:getfield        #84  <Field String Event.action>
    //    7   14:astore_2        
    //    8   15:aload_2         
    //    9   16:ldc1            #250 <String "/">
    //   10   18:invokevirtual   #254 <Method boolean String.startsWith(String)>
    //   11   21:ifne            44
    //   12   24:new             #26  <Class StringBuilder>
    //   13   27:dup             
    //   14   28:invokespecial   #75  <Method void StringBuilder()>
    //   15   31:ldc1            #250 <String "/">
    //   16   33:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   17   36:aload_2         
    //   18   37:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   19   40:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   20   43:astore_2        
    //   21   44:aload_2         
    //   22   45:invokestatic    #81  <Method String encode(String)>
    //   23   48:astore_3        
    //   24   49:aload_0         
    //   25   50:invokestatic    #112 <Method String getCustomVariableParams(Event)>
    //   26   53:astore          4
    //   27   55:invokestatic    #74  <Method Locale Locale.getDefault()>
    //   28   58:astore          5
    //   29   60:new             #26  <Class StringBuilder>
    //   30   63:dup             
    //   31   64:invokespecial   #75  <Method void StringBuilder()>
    //   32   67:astore          6
    //   33   69:aload           6
    //   34   71:ldc1            #11  <String "/__utm.gif">
    //   35   73:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   36   76:pop             
    //   37   77:aload           6
    //   38   79:ldc1            #114 <String "?utmwv=4.8.1ma">
    //   39   81:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   40   84:pop             
    //   41   85:aload           6
    //   42   87:ldc1            #116 <String "&utmn=">
    //   43   89:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   44   92:aload_0         
    //   45   93:invokevirtual   #119 <Method int Event.getRandomVal()>
    //   46   96:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   47   99:pop             
    //   48  100:aload           4
    //   49  102:invokevirtual   #60  <Method int String.length()>
    //   50  105:ifle            121
    //   51  108:aload           6
    //   52  110:ldc1            #126 <String "&utme=">
    //   53  112:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   54  115:aload           4
    //   55  117:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   56  120:pop             
    //   57  121:aload           6
    //   58  123:ldc1            #130 <String "&utmcs=UTF-8">
    //   59  125:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   60  128:pop             
    //   61  129:iconst_2        
    //   62  130:anewarray       Object[]
    //   63  133:astore          11
    //   64  135:aload           11
    //   65  137:iconst_0        
    //   66  138:aload_0         
    //   67  139:getfield        #133 <Field int Event.screenWidth>
    //   68  142:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //   69  145:aastore         
    //   70  146:aload           11
    //   71  148:iconst_1        
    //   72  149:aload_0         
    //   73  150:getfield        #136 <Field int Event.screenHeight>
    //   74  153:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //   75  156:aastore         
    //   76  157:aload           6
    //   77  159:ldc1            #138 <String "&utmsr=%dx%d">
    //   78  161:aload           11
    //   79  163:invokestatic    #90  <Method String String.format(String, Object[])>
    //   80  166:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   81  169:pop             
    //   82  170:iconst_2        
    //   83  171:anewarray       Object[]
    //   84  174:astore          13
    //   85  176:aload           13
    //   86  178:iconst_0        
    //   87  179:aload           5
    //   88  181:invokevirtual   #141 <Method String Locale.getLanguage()>
    //   89  184:aastore         
    //   90  185:aload           13
    //   91  187:iconst_1        
    //   92  188:aload           5
    //   93  190:invokevirtual   #144 <Method String Locale.getCountry()>
    //   94  193:aastore         
    //   95  194:aload           6
    //   96  196:ldc1            #146 <String "&utmul=%s-%s">
    //   97  198:aload           13
    //   98  200:invokestatic    #90  <Method String String.format(String, Object[])>
    //   99  203:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  100  206:pop             
    //  101  207:aload           6
    //  102  209:ldc2            #256 <String "&utmp=">
    //  103  212:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  104  215:aload_3         
    //  105  216:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  106  219:pop             
    //  107  220:aload           6
    //  108  222:ldc1            #148 <String "&utmac=">
    //  109  224:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  110  227:aload_0         
    //  111  228:getfield        #151 <Field String Event.accountId>
    //  112  231:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  113  234:pop             
    //  114  235:aload           6
    //  115  237:ldc1            #153 <String "&utmcc=">
    //  116  239:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  117  242:aload_0         
    //  118  243:aload_1         
    //  119  244:invokestatic    #156 <Method String getEscapedCookieString(Event, Referrer)>
    //  120  247:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  121  250:pop             
    //  122  251:aload_0         
    //  123  252:invokevirtual   #159 <Method int Event.getAdHitId()>
    //  124  255:ifeq            273
    //  125  258:aload           6
    //  126  260:ldc1            #161 <String "&utmhid=">
    //  127  262:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //  128  265:aload_0         
    //  129  266:invokevirtual   #159 <Method int Event.getAdHitId()>
    //  130  269:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //  131  272:pop             
    //  132  273:aload           6
    //  133  275:invokevirtual   #128 <Method String StringBuilder.toString()>
    //  134  278:areturn         
    }

    private static String constructTransactionRequestPath(Event event, Referrer referrer)
    {
    //    0    0:new             #26  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void StringBuilder()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc1            #11  <String "/__utm.gif">
    //    6   11:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    7   14:pop             
    //    8   15:aload_2         
    //    9   16:ldc1            #114 <String "?utmwv=4.8.1ma">
    //   10   18:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   11   21:pop             
    //   12   22:aload_2         
    //   13   23:ldc1            #116 <String "&utmn=">
    //   14   25:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   15   28:aload_0         
    //   16   29:invokevirtual   #119 <Method int Event.getRandomVal()>
    //   17   32:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   18   35:pop             
    //   19   36:aload_2         
    //   20   37:ldc2            #258 <String "&utmt=tran">
    //   21   40:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   22   43:pop             
    //   23   44:aload_0         
    //   24   45:invokevirtual   #262 <Method Transaction Event.getTransaction()>
    //   25   48:astore          7
    //   26   50:aload           7
    //   27   52:ifnull          141
    //   28   55:aload_2         
    //   29   56:ldc1            #211 <String "&utmtid">
    //   30   58:aload           7
    //   31   60:invokevirtual   #265 <Method String Transaction.getOrderId()>
    //   32   63:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   33   66:aload_2         
    //   34   67:ldc2            #267 <String "&utmtst">
    //   35   70:aload           7
    //   36   72:invokevirtual   #270 <Method String Transaction.getStoreName()>
    //   37   75:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   38   78:aload_2         
    //   39   79:ldc2            #272 <String "&utmtto">
    //   40   82:aload           7
    //   41   84:invokevirtual   #275 <Method double Transaction.getTotalCost()>
    //   42   87:invokestatic    #241 <Method void appendCurrencyValue(StringBuilder, String, double)>
    //   43   90:aload_2         
    //   44   91:ldc2            #277 <String "&utmttx">
    //   45   94:aload           7
    //   46   96:invokevirtual   #280 <Method double Transaction.getTotalTax()>
    //   47   99:invokestatic    #241 <Method void appendCurrencyValue(StringBuilder, String, double)>
    //   48  102:aload_2         
    //   49  103:ldc2            #282 <String "&utmtsp">
    //   50  106:aload           7
    //   51  108:invokevirtual   #285 <Method double Transaction.getShippingCost()>
    //   52  111:invokestatic    #241 <Method void appendCurrencyValue(StringBuilder, String, double)>
    //   53  114:aload_2         
    //   54  115:ldc2            #287 <String "&utmtci">
    //   55  118:ldc1            #248 <String "">
    //   56  120:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   57  123:aload_2         
    //   58  124:ldc2            #289 <String "&utmtrg">
    //   59  127:ldc1            #248 <String "">
    //   60  129:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   61  132:aload_2         
    //   62  133:ldc2            #291 <String "&utmtco">
    //   63  136:ldc1            #248 <String "">
    //   64  138:invokestatic    #218 <Method void appendStringValue(StringBuilder, String, String)>
    //   65  141:aload_2         
    //   66  142:ldc1            #148 <String "&utmac=">
    //   67  144:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   68  147:aload_0         
    //   69  148:getfield        #151 <Field String Event.accountId>
    //   70  151:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   71  154:pop             
    //   72  155:aload_2         
    //   73  156:ldc1            #153 <String "&utmcc=">
    //   74  158:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   75  161:aload_0         
    //   76  162:aload_1         
    //   77  163:invokestatic    #156 <Method String getEscapedCookieString(Event, Referrer)>
    //   78  166:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   79  169:pop             
    //   80  170:aload_2         
    //   81  171:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   82  174:areturn         
    }

    private static void createX10Project(CustomVariable acustomvariable[], StringBuilder stringbuilder, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //    3    5:ldc2            #295 <String "(">
    //    4    8:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    5   11:pop             
    //    6   12:iconst_1        
    //    7   13:istore          4
    //    8   15:iconst_0        
    //    9   16:istore          5
    //   10   18:iload           5
    //   11   20:aload_0         
    //   12   21:arraylength     
    //   13   22:icmpge          159
    //   14   25:aload_0         
    //   15   26:iload           5
    //   16   28:aaload          
    //   17   29:ifnull          96
    //   18   32:aload_0         
    //   19   33:iload           5
    //   20   35:aaload          
    //   21   36:astore          7
    //   22   38:iload           4
    //   23   40:ifne            102
    //   24   43:aload_1         
    //   25   44:ldc1            #95  <String "*">
    //   26   46:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   27   49:pop             
    //   28   50:aload_1         
    //   29   51:aload           7
    //   30   53:invokevirtual   #300 <Method int CustomVariable.getIndex()>
    //   31   56:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   32   59:ldc2            #302 <String "!">
    //   33   62:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   34   65:pop             
    //   35   66:iload_2         
    //   36   67:tableswitch     8 11: default 96
    //                   8 108
    //                   9 127
    //                   10 96
    //                   11 146
    //   37   96:iinc            5  1
    //   38   99:goto            18
    //   39  102:iconst_0        
    //   40  103:istore          4
    //   41  105:goto            50
    //   42  108:aload_1         
    //   43  109:aload           7
    //   44  111:invokevirtual   #305 <Method String CustomVariable.getName()>
    //   45  114:invokestatic    #81  <Method String encode(String)>
    //   46  117:invokestatic    #308 <Method String x10Escape(String)>
    //   47  120:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   48  123:pop             
    //   49  124:goto            96
    //   50  127:aload_1         
    //   51  128:aload           7
    //   52  130:invokevirtual   #311 <Method String CustomVariable.getValue()>
    //   53  133:invokestatic    #81  <Method String encode(String)>
    //   54  136:invokestatic    #308 <Method String x10Escape(String)>
    //   55  139:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   56  142:pop             
    //   57  143:goto            96
    //   58  146:aload_1         
    //   59  147:aload           7
    //   60  149:invokevirtual   #314 <Method int CustomVariable.getScope()>
    //   61  152:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   62  155:pop             
    //   63  156:goto            96
    //   64  159:aload_1         
    //   65  160:ldc1            #97  <String ")">
    //   66  162:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   67  165:pop             
    //   68  166:return          
    }

    private static String encode(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #66  <Method String AnalyticsParameterEncoder.encode(String)>
    //    2    4:areturn         
    }

    public static String getCustomVariableParams(Event event)
    {
    //    0    0:new             #26  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void StringBuilder()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:invokevirtual   #318 <Method CustomVariableBuffer Event.getCustomVariableBuffer()>
    //    6   12:astore_2        
    //    7   13:aload_2         
    //    8   14:ifnonnull       20
    //    9   17:ldc1            #248 <String "">
    //   10   19:areturn         
    //   11   20:aload_2         
    //   12   21:invokevirtual   #323 <Method boolean CustomVariableBuffer.hasCustomVariables()>
    //   13   24:ifne            30
    //   14   27:ldc1            #248 <String "">
    //   15   29:areturn         
    //   16   30:aload_2         
    //   17   31:invokevirtual   #327 <Method CustomVariable[] CustomVariableBuffer.getCustomVariableArray()>
    //   18   34:astore_3        
    //   19   35:aload_3         
    //   20   36:aload_1         
    //   21   37:bipush          8
    //   22   39:invokestatic    #329 <Method void createX10Project(CustomVariable[], StringBuilder, int)>
    //   23   42:aload_3         
    //   24   43:aload_1         
    //   25   44:bipush          9
    //   26   46:invokestatic    #329 <Method void createX10Project(CustomVariable[], StringBuilder, int)>
    //   27   49:aload_3         
    //   28   50:aload_1         
    //   29   51:bipush          11
    //   30   53:invokestatic    #329 <Method void createX10Project(CustomVariable[], StringBuilder, int)>
    //   31   56:aload_1         
    //   32   57:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   33   60:areturn         
    }

    public static String getEscapedCookieString(Event event, Referrer referrer)
    {
    //    0    0:new             #26  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #75  <Method void StringBuilder()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc2            #331 <String "__utma=">
    //    6   12:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //    7   15:pop             
    //    8   16:aload_2         
    //    9   17:ldc1            #8   <String "1">
    //   10   19:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   11   22:ldc2            #333 <String ".">
    //   12   25:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   13   28:pop             
    //   14   29:aload_2         
    //   15   30:aload_0         
    //   16   31:invokevirtual   #336 <Method int Event.getUserId()>
    //   17   34:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   18   37:ldc2            #333 <String ".">
    //   19   40:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   20   43:pop             
    //   21   44:aload_2         
    //   22   45:aload_0         
    //   23   46:invokevirtual   #339 <Method int Event.getTimestampFirst()>
    //   24   49:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   25   52:ldc2            #333 <String ".">
    //   26   55:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   27   58:pop             
    //   28   59:aload_2         
    //   29   60:aload_0         
    //   30   61:invokevirtual   #342 <Method int Event.getTimestampPrevious()>
    //   31   64:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   32   67:ldc2            #333 <String ".">
    //   33   70:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   34   73:pop             
    //   35   74:aload_2         
    //   36   75:aload_0         
    //   37   76:invokevirtual   #345 <Method int Event.getTimestampCurrent()>
    //   38   79:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   39   82:ldc2            #333 <String ".">
    //   40   85:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   41   88:pop             
    //   42   89:aload_2         
    //   43   90:aload_0         
    //   44   91:invokevirtual   #348 <Method int Event.getVisits()>
    //   45   94:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
    //   46   97:ldc2            #350 <String ";">
    //   47  100:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   48  103:pop             
    //   49  104:aload_1         
    //   50  105:ifnull          201
    //   51  108:aload_2         
    //   52  109:ldc2            #352 <String "+__utmz=">
    //   53  112:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   54  115:pop             
    //   55  116:aload_2         
    //   56  117:ldc1            #8   <String "1">
    //   57  119:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   58  122:ldc2            #333 <String ".">
    //   59  125:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   60  128:pop             
    //   61  129:aload_2         
    //   62  130:aload_1         
    //   63  131:invokevirtual   #357 <Method long Referrer.getTimeStamp()>
    //   64  134:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
    //   65  137:ldc2            #333 <String ".">
    //   66  140:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   67  143:pop             
    //   68  144:aload_2         
    //   69  145:aload_1         
    //   70  146:invokevirtual   #360 <Method int Referrer.getVisit()>
    //   71  149:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //   72  152:invokevirtual   #361 <Method String Integer.toString()>
    //   73  155:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   74  158:ldc2            #333 <String ".">
    //   75  161:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   76  164:pop             
    //   77  165:aload_2         
    //   78  166:aload_1         
    //   79  167:invokevirtual   #362 <Method int Referrer.getIndex()>
    //   80  170:invokestatic    #106 <Method Integer Integer.valueOf(int)>
    //   81  173:invokevirtual   #361 <Method String Integer.toString()>
    //   82  176:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   83  179:ldc2            #333 <String ".">
    //   84  182:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   85  185:pop             
    //   86  186:aload_2         
    //   87  187:aload_1         
    //   88  188:invokevirtual   #365 <Method String Referrer.getReferrerString()>
    //   89  191:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   90  194:ldc2            #350 <String ";">
    //   91  197:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
    //   92  200:pop             
    //   93  201:aload_2         
    //   94  202:invokevirtual   #128 <Method String StringBuilder.toString()>
    //   95  205:invokestatic    #81  <Method String encode(String)>
    //   96  208:areturn         
    }

    private static String x10Escape(String s)
    {
    //    0    0:aload_0         
    //    1    1:ldc2            #367 <String "'">
    //    2    4:ldc2            #369 <String "'0">
    //    3    7:invokevirtual   #373 <Method String String.replace(CharSequence, CharSequence)>
    //    4   10:ldc1            #97  <String ")">
    //    5   12:ldc2            #375 <String "'1">
    //    6   15:invokevirtual   #373 <Method String String.replace(CharSequence, CharSequence)>
    //    7   18:ldc1            #95  <String "*">
    //    8   20:ldc2            #377 <String "'2">
    //    9   23:invokevirtual   #373 <Method String String.replace(CharSequence, CharSequence)>
    //   10   26:ldc2            #302 <String "!">
    //   11   29:ldc2            #379 <String "'3">
    //   12   32:invokevirtual   #373 <Method String String.replace(CharSequence, CharSequence)>
    //   13   35:areturn         
    }

    static final String FAKE_DOMAIN_HASH = "1";
    private static final String GOOGLE_ANALYTICS_GIF_PATH = "/__utm.gif";
    private static final int X10_PROJECT_NAMES = 8;
    private static final int X10_PROJECT_SCOPES = 11;
    private static final int X10_PROJECT_VALUES = 9;
}
