// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            TypeEvaluator

public class ArgbEvaluator
    implements TypeEvaluator
{

    public ArgbEvaluator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
    //    0    0:aload_2         
    //    1    1:checkcast       #14  <Class Integer>
    //    2    4:invokevirtual   #18  <Method int Integer.intValue()>
    //    3    7:istore          4
    //    4    9:iload           4
    //    5   11:bipush          24
    //    6   13:ishr            
    //    7   14:istore          5
    //    8   16:sipush          255
    //    9   19:iload           4
    //   10   21:bipush          16
    //   11   23:ishr            
    //   12   24:iand            
    //   13   25:istore          6
    //   14   27:sipush          255
    //   15   30:iload           4
    //   16   32:bipush          8
    //   17   34:ishr            
    //   18   35:iand            
    //   19   36:istore          7
    //   20   38:iload           4
    //   21   40:sipush          255
    //   22   43:iand            
    //   23   44:istore          8
    //   24   46:aload_3         
    //   25   47:checkcast       #14  <Class Integer>
    //   26   50:invokevirtual   #18  <Method int Integer.intValue()>
    //   27   53:istore          9
    //   28   55:iload           9
    //   29   57:bipush          24
    //   30   59:ishr            
    //   31   60:istore          10
    //   32   62:sipush          255
    //   33   65:iload           9
    //   34   67:bipush          16
    //   35   69:ishr            
    //   36   70:iand            
    //   37   71:istore          11
    //   38   73:sipush          255
    //   39   76:iload           9
    //   40   78:bipush          8
    //   41   80:ishr            
    //   42   81:iand            
    //   43   82:istore          12
    //   44   84:iload           9
    //   45   86:sipush          255
    //   46   89:iand            
    //   47   90:istore          13
    //   48   92:iload           5
    //   49   94:fload_1         
    //   50   95:iload           10
    //   51   97:iload           5
    //   52   99:isub            
    //   53  100:i2f             
    //   54  101:fmul            
    //   55  102:f2i             
    //   56  103:iadd            
    //   57  104:bipush          24
    //   58  106:ishl            
    //   59  107:iload           6
    //   60  109:fload_1         
    //   61  110:iload           11
    //   62  112:iload           6
    //   63  114:isub            
    //   64  115:i2f             
    //   65  116:fmul            
    //   66  117:f2i             
    //   67  118:iadd            
    //   68  119:bipush          16
    //   69  121:ishl            
    //   70  122:ior             
    //   71  123:iload           7
    //   72  125:fload_1         
    //   73  126:iload           12
    //   74  128:iload           7
    //   75  130:isub            
    //   76  131:i2f             
    //   77  132:fmul            
    //   78  133:f2i             
    //   79  134:iadd            
    //   80  135:bipush          8
    //   81  137:ishl            
    //   82  138:ior             
    //   83  139:iload           8
    //   84  141:fload_1         
    //   85  142:iload           13
    //   86  144:iload           8
    //   87  146:isub            
    //   88  147:i2f             
    //   89  148:fmul            
    //   90  149:f2i             
    //   91  150:iadd            
    //   92  151:ior             
    //   93  152:invokestatic    #22  <Method Integer Integer.valueOf(int)>
    //   94  155:areturn         
    }
}
