// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation;

import com.google.ads.util.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public abstract class MediationServerParameters
{
    public static class MappingException extends Exception
    {

        public MappingException(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #8   <Method void Exception(String)>
        //    3    5:return          
        }
    }

    protected static interface Parameter
        extends Annotation
    {

        public abstract String name();

        public abstract boolean required();
    }


    public MediationServerParameters()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    protected void a()
    {
    //    0    0:return          
    }

    public void load(Map map)
        throws MappingException
    {
    //    0    0:new             #19  <Class HashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #20  <Method void HashMap()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:invokevirtual   #24  <Method Class Object.getClass()>
    //    6   12:invokevirtual   #30  <Method Field[] Class.getFields()>
    //    7   15:astore_3        
    //    8   16:aload_3         
    //    9   17:arraylength     
    //   10   18:istore          4
    //   11   20:iconst_0        
    //   12   21:istore          5
    //   13   23:iload           5
    //   14   25:iload           4
    //   15   27:icmpge          75
    //   16   30:aload_3         
    //   17   31:iload           5
    //   18   33:aaload          
    //   19   34:astore          17
    //   20   36:aload           17
    //   21   38:ldc1            #32  <Class MediationServerParameters$Parameter>
    //   22   40:invokevirtual   #38  <Method Annotation Field.getAnnotation(Class)>
    //   23   43:checkcast       #32  <Class MediationServerParameters$Parameter>
    //   24   46:astore          18
    //   25   48:aload           18
    //   26   50:ifnull          69
    //   27   53:aload_2         
    //   28   54:aload           18
    //   29   56:invokeinterface #42  <Method String MediationServerParameters$Parameter.name()>
    //   30   61:aload           17
    //   31   63:invokeinterface #48  <Method Object Map.put(Object, Object)>
    //   32   68:pop             
    //   33   69:iinc            5  1
    //   34   72:goto            23
    //   35   75:aload_2         
    //   36   76:invokeinterface #52  <Method boolean Map.isEmpty()>
    //   37   81:ifeq            89
    //   38   84:ldc1            #54  <String "No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method">
    //   39   86:invokestatic    #60  <Method void b.e(String)>
    //   40   89:aload_1         
    //   41   90:invokeinterface #64  <Method Set Map.entrySet()>
    //   42   95:invokeinterface #70  <Method Iterator Set.iterator()>
    //   43  100:astore          6
    //   44  102:aload           6
    //   45  104:invokeinterface #75  <Method boolean Iterator.hasNext()>
    //   46  109:ifeq            302
    //   47  112:aload           6
    //   48  114:invokeinterface #79  <Method Object Iterator.next()>
    //   49  119:checkcast       #81  <Class java.util.Map$Entry>
    //   50  122:astore          13
    //   51  124:aload_2         
    //   52  125:aload           13
    //   53  127:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
    //   54  132:invokeinterface #88  <Method Object Map.remove(Object)>
    //   55  137:checkcast       #34  <Class Field>
    //   56  140:astore          14
    //   57  142:aload           14
    //   58  144:ifnull          245
    // try 147 160 handler(s) 163 204
    //   59  147:aload           14
    //   60  149:aload_0         
    //   61  150:aload           13
    //   62  152:invokeinterface #91  <Method Object java.util.Map$Entry.getValue()>
    //   63  157:invokevirtual   #95  <Method void Field.set(Object, Object)>
    //   64  160:goto            102
    // catch IllegalAccessException
    //   65  163:astore          16
    //   66  165:new             #97  <Class StringBuilder>
    //   67  168:dup             
    //   68  169:invokespecial   #98  <Method void StringBuilder()>
    //   69  172:ldc1            #100 <String "Server Option '">
    //   70  174:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   71  177:aload           13
    //   72  179:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
    //   73  184:checkcast       #106 <Class String>
    //   74  187:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   75  190:ldc1            #108 <String "' could not be set: Illegal Access">
    //   76  192:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   77  195:invokevirtual   #111 <Method String StringBuilder.toString()>
    //   78  198:invokestatic    #114 <Method void b.b(String)>
    //   79  201:goto            102
    // catch IllegalArgumentException
    //   80  204:astore          15
    //   81  206:new             #97  <Class StringBuilder>
    //   82  209:dup             
    //   83  210:invokespecial   #98  <Method void StringBuilder()>
    //   84  213:ldc1            #100 <String "Server Option '">
    //   85  215:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   86  218:aload           13
    //   87  220:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
    //   88  225:checkcast       #106 <Class String>
    //   89  228:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   90  231:ldc1            #116 <String "' could not be set: Bad Type">
    //   91  233:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   92  236:invokevirtual   #111 <Method String StringBuilder.toString()>
    //   93  239:invokestatic    #114 <Method void b.b(String)>
    //   94  242:goto            102
    //   95  245:new             #97  <Class StringBuilder>
    //   96  248:dup             
    //   97  249:invokespecial   #98  <Method void StringBuilder()>
    //   98  252:ldc1            #118 <String "Unexpected Server Option: ">
    //   99  254:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  100  257:aload           13
    //  101  259:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
    //  102  264:checkcast       #106 <Class String>
    //  103  267:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  104  270:ldc1            #120 <String " = '">
    //  105  272:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  106  275:aload           13
    //  107  277:invokeinterface #91  <Method Object java.util.Map$Entry.getValue()>
    //  108  282:checkcast       #106 <Class String>
    //  109  285:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  110  288:ldc1            #122 <String "'">
    //  111  290:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  112  293:invokevirtual   #111 <Method String StringBuilder.toString()>
    //  113  296:invokestatic    #60  <Method void b.e(String)>
    //  114  299:goto            102
    //  115  302:aconst_null     
    //  116  303:astore          7
    //  117  305:aload_2         
    //  118  306:invokeinterface #126 <Method Collection Map.values()>
    //  119  311:invokeinterface #129 <Method Iterator Collection.iterator()>
    //  120  316:astore          8
    //  121  318:aload           8
    //  122  320:invokeinterface #75  <Method boolean Iterator.hasNext()>
    //  123  325:ifeq            474
    //  124  328:aload           8
    //  125  330:invokeinterface #79  <Method Object Iterator.next()>
    //  126  335:checkcast       #34  <Class Field>
    //  127  338:astore          9
    //  128  340:aload           9
    //  129  342:ldc1            #32  <Class MediationServerParameters$Parameter>
    //  130  344:invokevirtual   #38  <Method Annotation Field.getAnnotation(Class)>
    //  131  347:checkcast       #32  <Class MediationServerParameters$Parameter>
    //  132  350:invokeinterface #132 <Method boolean MediationServerParameters$Parameter.required()>
    //  133  355:ifeq            512
    //  134  358:new             #97  <Class StringBuilder>
    //  135  361:dup             
    //  136  362:invokespecial   #98  <Method void StringBuilder()>
    //  137  365:ldc1            #134 <String "Required Server Option missing: ">
    //  138  367:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  139  370:aload           9
    //  140  372:ldc1            #32  <Class MediationServerParameters$Parameter>
    //  141  374:invokevirtual   #38  <Method Annotation Field.getAnnotation(Class)>
    //  142  377:checkcast       #32  <Class MediationServerParameters$Parameter>
    //  143  380:invokeinterface #42  <Method String MediationServerParameters$Parameter.name()>
    //  144  385:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  145  388:invokevirtual   #111 <Method String StringBuilder.toString()>
    //  146  391:invokestatic    #114 <Method void b.b(String)>
    //  147  394:new             #97  <Class StringBuilder>
    //  148  397:dup             
    //  149  398:invokespecial   #98  <Method void StringBuilder()>
    //  150  401:astore          11
    //  151  403:aload           7
    //  152  405:ifnonnull       449
    //  153  408:ldc1            #136 <String "">
    //  154  410:astore          12
    //  155  412:aload           11
    //  156  414:aload           12
    //  157  416:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  158  419:aload           9
    //  159  421:ldc1            #32  <Class MediationServerParameters$Parameter>
    //  160  423:invokevirtual   #38  <Method Annotation Field.getAnnotation(Class)>
    //  161  426:checkcast       #32  <Class MediationServerParameters$Parameter>
    //  162  429:invokeinterface #42  <Method String MediationServerParameters$Parameter.name()>
    //  163  434:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  164  437:invokevirtual   #111 <Method String StringBuilder.toString()>
    //  165  440:astore          10
    //  166  442:aload           10
    //  167  444:astore          7
    //  168  446:goto            318
    //  169  449:new             #97  <Class StringBuilder>
    //  170  452:dup             
    //  171  453:invokespecial   #98  <Method void StringBuilder()>
    //  172  456:aload           7
    //  173  458:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  174  461:ldc1            #138 <String ", ">
    //  175  463:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  176  466:invokevirtual   #111 <Method String StringBuilder.toString()>
    //  177  469:astore          12
    //  178  471:goto            412
    //  179  474:aload           7
    //  180  476:ifnull          507
    //  181  479:new             #13  <Class MediationServerParameters$MappingException>
    //  182  482:dup             
    //  183  483:new             #97  <Class StringBuilder>
    //  184  486:dup             
    //  185  487:invokespecial   #98  <Method void StringBuilder()>
    //  186  490:ldc1            #140 <String "Required Server Option(s) missing: ">
    //  187  492:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  188  495:aload           7
    //  189  497:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //  190  500:invokevirtual   #111 <Method String StringBuilder.toString()>
    //  191  503:invokespecial   #142 <Method void MediationServerParameters$MappingException(String)>
    //  192  506:athrow          
    //  193  507:aload_0         
    //  194  508:invokevirtual   #144 <Method void a()>
    //  195  511:return          
    //  196  512:aload           7
    //  197  514:astore          10
    //  198  516:goto            442
    }
}
