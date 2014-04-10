// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

public class LongSparseArray
    implements Cloneable
{

    static 
    {
    //    0    0:new             #5   <Class Object>
    //    1    3:dup             
    //    2    4:invokespecial   #22  <Method void Object()>
    //    3    7:putstatic       #24  <Field Object DELETED>
    //    4   10:return          
    }

    public LongSparseArray()
    {
    //    0    0:aload_0         
    //    1    1:bipush          10
    //    2    3:invokespecial   #27  <Method void LongSparseArray(int)>
    //    3    6:return          
    }

    public LongSparseArray(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #29  <Field boolean mGarbage>
    //    5    9:iload_1         
    //    6   10:ifne            33
    //    7   13:aload_0         
    //    8   14:getstatic       #34  <Field long[] ContainerHelpers.EMPTY_LONGS>
    //    9   17:putfield        #36  <Field long[] mKeys>
    //   10   20:aload_0         
    //   11   21:getstatic       #39  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //   12   24:putfield        #41  <Field Object[] mValues>
    //   13   27:aload_0         
    //   14   28:iconst_0        
    //   15   29:putfield        #43  <Field int mSize>
    //   16   32:return          
    //   17   33:iload_1         
    //   18   34:invokestatic    #47  <Method int ContainerHelpers.idealLongArraySize(int)>
    //   19   37:istore_2        
    //   20   38:aload_0         
    //   21   39:iload_2         
    //   22   40:newarray        long[]
    //   23   42:putfield        #36  <Field long[] mKeys>
    //   24   45:aload_0         
    //   25   46:iload_2         
    //   26   47:anewarray       Object[]
    //   27   50:putfield        #41  <Field Object[] mValues>
    //   28   53:goto            27
    }

    private void gc()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field int mSize>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:getfield        #36  <Field long[] mKeys>
    //    7   11:astore_3        
    //    8   12:aload_0         
    //    9   13:getfield        #41  <Field Object[] mValues>
    //   10   16:astore          4
    //   11   18:iconst_0        
    //   12   19:istore          5
    //   13   21:iload           5
    //   14   23:iload_1         
    //   15   24:icmpge          76
    //   16   27:aload           4
    //   17   29:iload           5
    //   18   31:aaload          
    //   19   32:astore          6
    //   20   34:aload           6
    //   21   36:getstatic       #24  <Field Object DELETED>
    //   22   39:if_acmpeq       70
    //   23   42:iload           5
    //   24   44:iload_2         
    //   25   45:icmpeq          67
    //   26   48:aload_3         
    //   27   49:iload_2         
    //   28   50:aload_3         
    //   29   51:iload           5
    //   30   53:laload          
    //   31   54:lastore         
    //   32   55:aload           4
    //   33   57:iload_2         
    //   34   58:aload           6
    //   35   60:aastore         
    //   36   61:aload           4
    //   37   63:iload           5
    //   38   65:aconst_null     
    //   39   66:aastore         
    //   40   67:iinc            2  1
    //   41   70:iinc            5  1
    //   42   73:goto            21
    //   43   76:aload_0         
    //   44   77:iconst_0        
    //   45   78:putfield        #29  <Field boolean mGarbage>
    //   46   81:aload_0         
    //   47   82:iload_2         
    //   48   83:putfield        #43  <Field int mSize>
    //   49   86:return          
    }

    public void append(long l, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field int mSize>
    //    2    4:ifeq            30
    //    3    7:lload_1         
    //    4    8:aload_0         
    //    5    9:getfield        #36  <Field long[] mKeys>
    //    6   12:iconst_m1       
    //    7   13:aload_0         
    //    8   14:getfield        #43  <Field int mSize>
    //    9   17:iadd            
    //   10   18:laload          
    //   11   19:lcmp            
    //   12   20:ifgt            30
    //   13   23:aload_0         
    //   14   24:lload_1         
    //   15   25:aload_3         
    //   16   26:invokevirtual   #53  <Method void put(long, Object)>
    //   17   29:return          
    //   18   30:aload_0         
    //   19   31:getfield        #29  <Field boolean mGarbage>
    //   20   34:ifeq            53
    //   21   37:aload_0         
    //   22   38:getfield        #43  <Field int mSize>
    //   23   41:aload_0         
    //   24   42:getfield        #36  <Field long[] mKeys>
    //   25   45:arraylength     
    //   26   46:icmplt          53
    //   27   49:aload_0         
    //   28   50:invokespecial   #55  <Method void gc()>
    //   29   53:aload_0         
    //   30   54:getfield        #43  <Field int mSize>
    //   31   57:istore          4
    //   32   59:iload           4
    //   33   61:aload_0         
    //   34   62:getfield        #36  <Field long[] mKeys>
    //   35   65:arraylength     
    //   36   66:icmplt          135
    //   37   69:iload           4
    //   38   71:iconst_1        
    //   39   72:iadd            
    //   40   73:invokestatic    #47  <Method int ContainerHelpers.idealLongArraySize(int)>
    //   41   76:istore          5
    //   42   78:iload           5
    //   43   80:newarray        long[]
    //   44   82:astore          6
    //   45   84:iload           5
    //   46   86:anewarray       Object[]
    //   47   89:astore          7
    //   48   91:aload_0         
    //   49   92:getfield        #36  <Field long[] mKeys>
    //   50   95:iconst_0        
    //   51   96:aload           6
    //   52   98:iconst_0        
    //   53   99:aload_0         
    //   54  100:getfield        #36  <Field long[] mKeys>
    //   55  103:arraylength     
    //   56  104:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   57  107:aload_0         
    //   58  108:getfield        #41  <Field Object[] mValues>
    //   59  111:iconst_0        
    //   60  112:aload           7
    //   61  114:iconst_0        
    //   62  115:aload_0         
    //   63  116:getfield        #41  <Field Object[] mValues>
    //   64  119:arraylength     
    //   65  120:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   66  123:aload_0         
    //   67  124:aload           6
    //   68  126:putfield        #36  <Field long[] mKeys>
    //   69  129:aload_0         
    //   70  130:aload           7
    //   71  132:putfield        #41  <Field Object[] mValues>
    //   72  135:aload_0         
    //   73  136:getfield        #36  <Field long[] mKeys>
    //   74  139:iload           4
    //   75  141:lload_1         
    //   76  142:lastore         
    //   77  143:aload_0         
    //   78  144:getfield        #41  <Field Object[] mValues>
    //   79  147:iload           4
    //   80  149:aload_3         
    //   81  150:aastore         
    //   82  151:aload_0         
    //   83  152:iload           4
    //   84  154:iconst_1        
    //   85  155:iadd            
    //   86  156:putfield        #43  <Field int mSize>
    //   87  159:return          
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field int mSize>
    //    2    4:istore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #41  <Field Object[] mValues>
    //    5    9:astore_2        
    //    6   10:iconst_0        
    //    7   11:istore_3        
    //    8   12:iload_3         
    //    9   13:iload_1         
    //   10   14:icmpge          27
    //   11   17:aload_2         
    //   12   18:iload_3         
    //   13   19:aconst_null     
    //   14   20:aastore         
    //   15   21:iinc            3  1
    //   16   24:goto            12
    //   17   27:aload_0         
    //   18   28:iconst_0        
    //   19   29:putfield        #43  <Field int mSize>
    //   20   32:aload_0         
    //   21   33:iconst_0        
    //   22   34:putfield        #29  <Field boolean mGarbage>
    //   23   37:return          
    }

    public LongSparseArray clone()
    {
    //    0    0:aconst_null     
    //    1    1:astore_1        
    // try 2 38 handler(s) 40
    //    2    2:aload_0         
    //    3    3:invokespecial   #69  <Method Object Object.clone()>
    //    4    6:checkcast       #2   <Class LongSparseArray>
    //    5    9:astore_1        
    //    6   10:aload_1         
    //    7   11:aload_0         
    //    8   12:getfield        #36  <Field long[] mKeys>
    //    9   15:invokevirtual   #71  <Method Object _5B_J.clone()>
    //   10   18:checkcast       #70  <Class long[]>
    //   11   21:putfield        #36  <Field long[] mKeys>
    //   12   24:aload_1         
    //   13   25:aload_0         
    //   14   26:getfield        #41  <Field Object[] mValues>
    //   15   29:invokevirtual   #73  <Method Object _5B_Ljava.lang.Object_3B_.clone()>
    //   16   32:checkcast       #72  <Class Object[]>
    //   17   35:putfield        #41  <Field Object[] mValues>
    //   18   38:aload_1         
    //   19   39:areturn         
    // catch CloneNotSupportedException
    //   20   40:astore_2        
    //   21   41:aload_1         
    //   22   42:areturn         
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #75  <Method LongSparseArray clone()>
    //    2    4:areturn         
    }

    public void delete(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field long[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:lload_1         
    //    5    9:invokestatic    #81  <Method int ContainerHelpers.binarySearch(long[], int, long)>
    //    6   12:istore_3        
    //    7   13:iload_3         
    //    8   14:iflt            43
    //    9   17:aload_0         
    //   10   18:getfield        #41  <Field Object[] mValues>
    //   11   21:iload_3         
    //   12   22:aaload          
    //   13   23:getstatic       #24  <Field Object DELETED>
    //   14   26:if_acmpeq       43
    //   15   29:aload_0         
    //   16   30:getfield        #41  <Field Object[] mValues>
    //   17   33:iload_3         
    //   18   34:getstatic       #24  <Field Object DELETED>
    //   19   37:aastore         
    //   20   38:aload_0         
    //   21   39:iconst_1        
    //   22   40:putfield        #29  <Field boolean mGarbage>
    //   23   43:return          
    }

    public Object get(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:aconst_null     
    //    3    3:invokevirtual   #86  <Method Object get(long, Object)>
    //    4    6:areturn         
    }

    public Object get(long l, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field long[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:lload_1         
    //    5    9:invokestatic    #81  <Method int ContainerHelpers.binarySearch(long[], int, long)>
    //    6   12:istore          4
    //    7   14:iload           4
    //    8   16:iflt            32
    //    9   19:aload_0         
    //   10   20:getfield        #41  <Field Object[] mValues>
    //   11   23:iload           4
    //   12   25:aaload          
    //   13   26:getstatic       #24  <Field Object DELETED>
    //   14   29:if_acmpne       34
    //   15   32:aload_3         
    //   16   33:areturn         
    //   17   34:aload_0         
    //   18   35:getfield        #41  <Field Object[] mValues>
    //   19   38:iload           4
    //   20   40:aaload          
    //   21   41:areturn         
    }

    public int indexOfKey(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #36  <Field long[] mKeys>
    //    7   15:aload_0         
    //    8   16:getfield        #43  <Field int mSize>
    //    9   19:lload_1         
    //   10   20:invokestatic    #81  <Method int ContainerHelpers.binarySearch(long[], int, long)>
    //   11   23:ireturn         
    }

    public int indexOfValue(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:iconst_0        
    //    6   12:istore_2        
    //    7   13:iload_2         
    //    8   14:aload_0         
    //    9   15:getfield        #43  <Field int mSize>
    //   10   18:icmpge          39
    //   11   21:aload_0         
    //   12   22:getfield        #41  <Field Object[] mValues>
    //   13   25:iload_2         
    //   14   26:aaload          
    //   15   27:aload_1         
    //   16   28:if_acmpne       33
    //   17   31:iload_2         
    //   18   32:ireturn         
    //   19   33:iinc            2  1
    //   20   36:goto            13
    //   21   39:iconst_m1       
    //   22   40:ireturn         
    }

    public long keyAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #36  <Field long[] mKeys>
    //    7   15:iload_1         
    //    8   16:laload          
    //    9   17:lreturn         
    }

    public void put(long l, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field long[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:lload_1         
    //    5    9:invokestatic    #81  <Method int ContainerHelpers.binarySearch(long[], int, long)>
    //    6   12:istore          4
    //    7   14:iload           4
    //    8   16:iflt            28
    //    9   19:aload_0         
    //   10   20:getfield        #41  <Field Object[] mValues>
    //   11   23:iload           4
    //   12   25:aload_3         
    //   13   26:aastore         
    //   14   27:return          
    //   15   28:iload           4
    //   16   30:iconst_m1       
    //   17   31:ixor            
    //   18   32:istore          5
    //   19   34:iload           5
    //   20   36:aload_0         
    //   21   37:getfield        #43  <Field int mSize>
    //   22   40:icmpge          73
    //   23   43:aload_0         
    //   24   44:getfield        #41  <Field Object[] mValues>
    //   25   47:iload           5
    //   26   49:aaload          
    //   27   50:getstatic       #24  <Field Object DELETED>
    //   28   53:if_acmpne       73
    //   29   56:aload_0         
    //   30   57:getfield        #36  <Field long[] mKeys>
    //   31   60:iload           5
    //   32   62:lload_1         
    //   33   63:lastore         
    //   34   64:aload_0         
    //   35   65:getfield        #41  <Field Object[] mValues>
    //   36   68:iload           5
    //   37   70:aload_3         
    //   38   71:aastore         
    //   39   72:return          
    //   40   73:aload_0         
    //   41   74:getfield        #29  <Field boolean mGarbage>
    //   42   77:ifeq            112
    //   43   80:aload_0         
    //   44   81:getfield        #43  <Field int mSize>
    //   45   84:aload_0         
    //   46   85:getfield        #36  <Field long[] mKeys>
    //   47   88:arraylength     
    //   48   89:icmplt          112
    //   49   92:aload_0         
    //   50   93:invokespecial   #55  <Method void gc()>
    //   51   96:iconst_m1       
    //   52   97:aload_0         
    //   53   98:getfield        #36  <Field long[] mKeys>
    //   54  101:aload_0         
    //   55  102:getfield        #43  <Field int mSize>
    //   56  105:lload_1         
    //   57  106:invokestatic    #81  <Method int ContainerHelpers.binarySearch(long[], int, long)>
    //   58  109:ixor            
    //   59  110:istore          5
    //   60  112:aload_0         
    //   61  113:getfield        #43  <Field int mSize>
    //   62  116:aload_0         
    //   63  117:getfield        #36  <Field long[] mKeys>
    //   64  120:arraylength     
    //   65  121:icmplt          192
    //   66  124:iconst_1        
    //   67  125:aload_0         
    //   68  126:getfield        #43  <Field int mSize>
    //   69  129:iadd            
    //   70  130:invokestatic    #47  <Method int ContainerHelpers.idealLongArraySize(int)>
    //   71  133:istore          6
    //   72  135:iload           6
    //   73  137:newarray        long[]
    //   74  139:astore          7
    //   75  141:iload           6
    //   76  143:anewarray       Object[]
    //   77  146:astore          8
    //   78  148:aload_0         
    //   79  149:getfield        #36  <Field long[] mKeys>
    //   80  152:iconst_0        
    //   81  153:aload           7
    //   82  155:iconst_0        
    //   83  156:aload_0         
    //   84  157:getfield        #36  <Field long[] mKeys>
    //   85  160:arraylength     
    //   86  161:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   87  164:aload_0         
    //   88  165:getfield        #41  <Field Object[] mValues>
    //   89  168:iconst_0        
    //   90  169:aload           8
    //   91  171:iconst_0        
    //   92  172:aload_0         
    //   93  173:getfield        #41  <Field Object[] mValues>
    //   94  176:arraylength     
    //   95  177:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   96  180:aload_0         
    //   97  181:aload           7
    //   98  183:putfield        #36  <Field long[] mKeys>
    //   99  186:aload_0         
    //  100  187:aload           8
    //  101  189:putfield        #41  <Field Object[] mValues>
    //  102  192:aload_0         
    //  103  193:getfield        #43  <Field int mSize>
    //  104  196:iload           5
    //  105  198:isub            
    //  106  199:ifeq            250
    //  107  202:aload_0         
    //  108  203:getfield        #36  <Field long[] mKeys>
    //  109  206:iload           5
    //  110  208:aload_0         
    //  111  209:getfield        #36  <Field long[] mKeys>
    //  112  212:iload           5
    //  113  214:iconst_1        
    //  114  215:iadd            
    //  115  216:aload_0         
    //  116  217:getfield        #43  <Field int mSize>
    //  117  220:iload           5
    //  118  222:isub            
    //  119  223:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  120  226:aload_0         
    //  121  227:getfield        #41  <Field Object[] mValues>
    //  122  230:iload           5
    //  123  232:aload_0         
    //  124  233:getfield        #41  <Field Object[] mValues>
    //  125  236:iload           5
    //  126  238:iconst_1        
    //  127  239:iadd            
    //  128  240:aload_0         
    //  129  241:getfield        #43  <Field int mSize>
    //  130  244:iload           5
    //  131  246:isub            
    //  132  247:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  133  250:aload_0         
    //  134  251:getfield        #36  <Field long[] mKeys>
    //  135  254:iload           5
    //  136  256:lload_1         
    //  137  257:lastore         
    //  138  258:aload_0         
    //  139  259:getfield        #41  <Field Object[] mValues>
    //  140  262:iload           5
    //  141  264:aload_3         
    //  142  265:aastore         
    //  143  266:aload_0         
    //  144  267:iconst_1        
    //  145  268:aload_0         
    //  146  269:getfield        #43  <Field int mSize>
    //  147  272:iadd            
    //  148  273:putfield        #43  <Field int mSize>
    //  149  276:return          
    }

    public void remove(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokevirtual   #95  <Method void delete(long)>
    //    3    5:return          
    }

    public void removeAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #41  <Field Object[] mValues>
    //    2    4:iload_1         
    //    3    5:aaload          
    //    4    6:getstatic       #24  <Field Object DELETED>
    //    5    9:if_acmpeq       26
    //    6   12:aload_0         
    //    7   13:getfield        #41  <Field Object[] mValues>
    //    8   16:iload_1         
    //    9   17:getstatic       #24  <Field Object DELETED>
    //   10   20:aastore         
    //   11   21:aload_0         
    //   12   22:iconst_1        
    //   13   23:putfield        #29  <Field boolean mGarbage>
    //   14   26:return          
    }

    public void setValueAt(int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #41  <Field Object[] mValues>
    //    7   15:iload_1         
    //    8   16:aload_2         
    //    9   17:aastore         
    //   10   18:return          
    }

    public int size()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #43  <Field int mSize>
    //    7   15:ireturn         
    }

    public String toString()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #104 <Method int size()>
    //    2    4:ifgt            10
    //    3    7:ldc1            #106 <String "{}">
    //    4    9:areturn         
    //    5   10:new             #108 <Class StringBuilder>
    //    6   13:dup             
    //    7   14:bipush          28
    //    8   16:aload_0         
    //    9   17:getfield        #43  <Field int mSize>
    //   10   20:imul            
    //   11   21:invokespecial   #109 <Method void StringBuilder(int)>
    //   12   24:astore_1        
    //   13   25:aload_1         
    //   14   26:bipush          123
    //   15   28:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
    //   16   31:pop             
    //   17   32:iconst_0        
    //   18   33:istore_3        
    //   19   34:iload_3         
    //   20   35:aload_0         
    //   21   36:getfield        #43  <Field int mSize>
    //   22   39:icmpge          106
    //   23   42:iload_3         
    //   24   43:ifle            53
    //   25   46:aload_1         
    //   26   47:ldc1            #114 <String ", ">
    //   27   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
    //   28   52:pop             
    //   29   53:aload_1         
    //   30   54:aload_0         
    //   31   55:iload_3         
    //   32   56:invokevirtual   #119 <Method long keyAt(int)>
    //   33   59:invokevirtual   #122 <Method StringBuilder StringBuilder.append(long)>
    //   34   62:pop             
    //   35   63:aload_1         
    //   36   64:bipush          61
    //   37   66:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
    //   38   69:pop             
    //   39   70:aload_0         
    //   40   71:iload_3         
    //   41   72:invokevirtual   #126 <Method Object valueAt(int)>
    //   42   75:astore          7
    //   43   77:aload           7
    //   44   79:aload_0         
    //   45   80:if_acmpeq       96
    //   46   83:aload_1         
    //   47   84:aload           7
    //   48   86:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
    //   49   89:pop             
    //   50   90:iinc            3  1
    //   51   93:goto            34
    //   52   96:aload_1         
    //   53   97:ldc1            #131 <String "(this Map)">
    //   54   99:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
    //   55  102:pop             
    //   56  103:goto            90
    //   57  106:aload_1         
    //   58  107:bipush          125
    //   59  109:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
    //   60  112:pop             
    //   61  113:aload_1         
    //   62  114:invokevirtual   #133 <Method String StringBuilder.toString()>
    //   63  117:areturn         
    }

    public Object valueAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #41  <Field Object[] mValues>
    //    7   15:iload_1         
    //    8   16:aaload          
    //    9   17:areturn         
    }

    private static final Object DELETED;
    private boolean mGarbage;
    private long mKeys[];
    private int mSize;
    private Object mValues[];
}
