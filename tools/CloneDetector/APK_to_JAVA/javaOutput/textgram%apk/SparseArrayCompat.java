// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

public class SparseArrayCompat
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

    public SparseArrayCompat()
    {
    //    0    0:aload_0         
    //    1    1:bipush          10
    //    2    3:invokespecial   #27  <Method void SparseArrayCompat(int)>
    //    3    6:return          
    }

    public SparseArrayCompat(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #29  <Field boolean mGarbage>
    //    5    9:iload_1         
    //    6   10:ifne            33
    //    7   13:aload_0         
    //    8   14:getstatic       #34  <Field int[] ContainerHelpers.EMPTY_INTS>
    //    9   17:putfield        #36  <Field int[] mKeys>
    //   10   20:aload_0         
    //   11   21:getstatic       #39  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //   12   24:putfield        #41  <Field Object[] mValues>
    //   13   27:aload_0         
    //   14   28:iconst_0        
    //   15   29:putfield        #43  <Field int mSize>
    //   16   32:return          
    //   17   33:iload_1         
    //   18   34:invokestatic    #47  <Method int ContainerHelpers.idealIntArraySize(int)>
    //   19   37:istore_2        
    //   20   38:aload_0         
    //   21   39:iload_2         
    //   22   40:newarray        int[]
    //   23   42:putfield        #36  <Field int[] mKeys>
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
    //    6    8:getfield        #36  <Field int[] mKeys>
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
    //   30   53:iaload          
    //   31   54:iastore         
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

    public void append(int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field int mSize>
    //    2    4:ifeq            29
    //    3    7:iload_1         
    //    4    8:aload_0         
    //    5    9:getfield        #36  <Field int[] mKeys>
    //    6   12:iconst_m1       
    //    7   13:aload_0         
    //    8   14:getfield        #43  <Field int mSize>
    //    9   17:iadd            
    //   10   18:iaload          
    //   11   19:icmpgt          29
    //   12   22:aload_0         
    //   13   23:iload_1         
    //   14   24:aload_2         
    //   15   25:invokevirtual   #53  <Method void put(int, Object)>
    //   16   28:return          
    //   17   29:aload_0         
    //   18   30:getfield        #29  <Field boolean mGarbage>
    //   19   33:ifeq            52
    //   20   36:aload_0         
    //   21   37:getfield        #43  <Field int mSize>
    //   22   40:aload_0         
    //   23   41:getfield        #36  <Field int[] mKeys>
    //   24   44:arraylength     
    //   25   45:icmplt          52
    //   26   48:aload_0         
    //   27   49:invokespecial   #55  <Method void gc()>
    //   28   52:aload_0         
    //   29   53:getfield        #43  <Field int mSize>
    //   30   56:istore_3        
    //   31   57:iload_3         
    //   32   58:aload_0         
    //   33   59:getfield        #36  <Field int[] mKeys>
    //   34   62:arraylength     
    //   35   63:icmplt          131
    //   36   66:iload_3         
    //   37   67:iconst_1        
    //   38   68:iadd            
    //   39   69:invokestatic    #47  <Method int ContainerHelpers.idealIntArraySize(int)>
    //   40   72:istore          4
    //   41   74:iload           4
    //   42   76:newarray        int[]
    //   43   78:astore          5
    //   44   80:iload           4
    //   45   82:anewarray       Object[]
    //   46   85:astore          6
    //   47   87:aload_0         
    //   48   88:getfield        #36  <Field int[] mKeys>
    //   49   91:iconst_0        
    //   50   92:aload           5
    //   51   94:iconst_0        
    //   52   95:aload_0         
    //   53   96:getfield        #36  <Field int[] mKeys>
    //   54   99:arraylength     
    //   55  100:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   56  103:aload_0         
    //   57  104:getfield        #41  <Field Object[] mValues>
    //   58  107:iconst_0        
    //   59  108:aload           6
    //   60  110:iconst_0        
    //   61  111:aload_0         
    //   62  112:getfield        #41  <Field Object[] mValues>
    //   63  115:arraylength     
    //   64  116:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   65  119:aload_0         
    //   66  120:aload           5
    //   67  122:putfield        #36  <Field int[] mKeys>
    //   68  125:aload_0         
    //   69  126:aload           6
    //   70  128:putfield        #41  <Field Object[] mValues>
    //   71  131:aload_0         
    //   72  132:getfield        #36  <Field int[] mKeys>
    //   73  135:iload_3         
    //   74  136:iload_1         
    //   75  137:iastore         
    //   76  138:aload_0         
    //   77  139:getfield        #41  <Field Object[] mValues>
    //   78  142:iload_3         
    //   79  143:aload_2         
    //   80  144:aastore         
    //   81  145:aload_0         
    //   82  146:iload_3         
    //   83  147:iconst_1        
    //   84  148:iadd            
    //   85  149:putfield        #43  <Field int mSize>
    //   86  152:return          
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

    public SparseArrayCompat clone()
    {
    //    0    0:aconst_null     
    //    1    1:astore_1        
    // try 2 38 handler(s) 40
    //    2    2:aload_0         
    //    3    3:invokespecial   #69  <Method Object Object.clone()>
    //    4    6:checkcast       #2   <Class SparseArrayCompat>
    //    5    9:astore_1        
    //    6   10:aload_1         
    //    7   11:aload_0         
    //    8   12:getfield        #36  <Field int[] mKeys>
    //    9   15:invokevirtual   #71  <Method Object _5B_I.clone()>
    //   10   18:checkcast       #70  <Class int[]>
    //   11   21:putfield        #36  <Field int[] mKeys>
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
    //    1    1:invokevirtual   #75  <Method SparseArrayCompat clone()>
    //    2    4:areturn         
    }

    public void delete(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field int[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:iload_1         
    //    5    9:invokestatic    #80  <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //    6   12:istore_2        
    //    7   13:iload_2         
    //    8   14:iflt            43
    //    9   17:aload_0         
    //   10   18:getfield        #41  <Field Object[] mValues>
    //   11   21:iload_2         
    //   12   22:aaload          
    //   13   23:getstatic       #24  <Field Object DELETED>
    //   14   26:if_acmpeq       43
    //   15   29:aload_0         
    //   16   30:getfield        #41  <Field Object[] mValues>
    //   17   33:iload_2         
    //   18   34:getstatic       #24  <Field Object DELETED>
    //   19   37:aastore         
    //   20   38:aload_0         
    //   21   39:iconst_1        
    //   22   40:putfield        #29  <Field boolean mGarbage>
    //   23   43:return          
    }

    public Object get(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aconst_null     
    //    3    3:invokevirtual   #85  <Method Object get(int, Object)>
    //    4    6:areturn         
    }

    public Object get(int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field int[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:iload_1         
    //    5    9:invokestatic    #80  <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //    6   12:istore_3        
    //    7   13:iload_3         
    //    8   14:iflt            29
    //    9   17:aload_0         
    //   10   18:getfield        #41  <Field Object[] mValues>
    //   11   21:iload_3         
    //   12   22:aaload          
    //   13   23:getstatic       #24  <Field Object DELETED>
    //   14   26:if_acmpne       31
    //   15   29:aload_2         
    //   16   30:areturn         
    //   17   31:aload_0         
    //   18   32:getfield        #41  <Field Object[] mValues>
    //   19   35:iload_3         
    //   20   36:aaload          
    //   21   37:areturn         
    }

    public int indexOfKey(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #36  <Field int[] mKeys>
    //    7   15:aload_0         
    //    8   16:getfield        #43  <Field int mSize>
    //    9   19:iload_1         
    //   10   20:invokestatic    #80  <Method int ContainerHelpers.binarySearch(int[], int, int)>
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

    public int keyAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mGarbage>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #55  <Method void gc()>
    //    5   11:aload_0         
    //    6   12:getfield        #36  <Field int[] mKeys>
    //    7   15:iload_1         
    //    8   16:iaload          
    //    9   17:ireturn         
    }

    public void put(int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field int[] mKeys>
    //    2    4:aload_0         
    //    3    5:getfield        #43  <Field int mSize>
    //    4    8:iload_1         
    //    5    9:invokestatic    #80  <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //    6   12:istore_3        
    //    7   13:iload_3         
    //    8   14:iflt            25
    //    9   17:aload_0         
    //   10   18:getfield        #41  <Field Object[] mValues>
    //   11   21:iload_3         
    //   12   22:aload_2         
    //   13   23:aastore         
    //   14   24:return          
    //   15   25:iload_3         
    //   16   26:iconst_m1       
    //   17   27:ixor            
    //   18   28:istore          4
    //   19   30:iload           4
    //   20   32:aload_0         
    //   21   33:getfield        #43  <Field int mSize>
    //   22   36:icmpge          69
    //   23   39:aload_0         
    //   24   40:getfield        #41  <Field Object[] mValues>
    //   25   43:iload           4
    //   26   45:aaload          
    //   27   46:getstatic       #24  <Field Object DELETED>
    //   28   49:if_acmpne       69
    //   29   52:aload_0         
    //   30   53:getfield        #36  <Field int[] mKeys>
    //   31   56:iload           4
    //   32   58:iload_1         
    //   33   59:iastore         
    //   34   60:aload_0         
    //   35   61:getfield        #41  <Field Object[] mValues>
    //   36   64:iload           4
    //   37   66:aload_2         
    //   38   67:aastore         
    //   39   68:return          
    //   40   69:aload_0         
    //   41   70:getfield        #29  <Field boolean mGarbage>
    //   42   73:ifeq            108
    //   43   76:aload_0         
    //   44   77:getfield        #43  <Field int mSize>
    //   45   80:aload_0         
    //   46   81:getfield        #36  <Field int[] mKeys>
    //   47   84:arraylength     
    //   48   85:icmplt          108
    //   49   88:aload_0         
    //   50   89:invokespecial   #55  <Method void gc()>
    //   51   92:iconst_m1       
    //   52   93:aload_0         
    //   53   94:getfield        #36  <Field int[] mKeys>
    //   54   97:aload_0         
    //   55   98:getfield        #43  <Field int mSize>
    //   56  101:iload_1         
    //   57  102:invokestatic    #80  <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //   58  105:ixor            
    //   59  106:istore          4
    //   60  108:aload_0         
    //   61  109:getfield        #43  <Field int mSize>
    //   62  112:aload_0         
    //   63  113:getfield        #36  <Field int[] mKeys>
    //   64  116:arraylength     
    //   65  117:icmplt          188
    //   66  120:iconst_1        
    //   67  121:aload_0         
    //   68  122:getfield        #43  <Field int mSize>
    //   69  125:iadd            
    //   70  126:invokestatic    #47  <Method int ContainerHelpers.idealIntArraySize(int)>
    //   71  129:istore          5
    //   72  131:iload           5
    //   73  133:newarray        int[]
    //   74  135:astore          6
    //   75  137:iload           5
    //   76  139:anewarray       Object[]
    //   77  142:astore          7
    //   78  144:aload_0         
    //   79  145:getfield        #36  <Field int[] mKeys>
    //   80  148:iconst_0        
    //   81  149:aload           6
    //   82  151:iconst_0        
    //   83  152:aload_0         
    //   84  153:getfield        #36  <Field int[] mKeys>
    //   85  156:arraylength     
    //   86  157:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   87  160:aload_0         
    //   88  161:getfield        #41  <Field Object[] mValues>
    //   89  164:iconst_0        
    //   90  165:aload           7
    //   91  167:iconst_0        
    //   92  168:aload_0         
    //   93  169:getfield        #41  <Field Object[] mValues>
    //   94  172:arraylength     
    //   95  173:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   96  176:aload_0         
    //   97  177:aload           6
    //   98  179:putfield        #36  <Field int[] mKeys>
    //   99  182:aload_0         
    //  100  183:aload           7
    //  101  185:putfield        #41  <Field Object[] mValues>
    //  102  188:aload_0         
    //  103  189:getfield        #43  <Field int mSize>
    //  104  192:iload           4
    //  105  194:isub            
    //  106  195:ifeq            246
    //  107  198:aload_0         
    //  108  199:getfield        #36  <Field int[] mKeys>
    //  109  202:iload           4
    //  110  204:aload_0         
    //  111  205:getfield        #36  <Field int[] mKeys>
    //  112  208:iload           4
    //  113  210:iconst_1        
    //  114  211:iadd            
    //  115  212:aload_0         
    //  116  213:getfield        #43  <Field int mSize>
    //  117  216:iload           4
    //  118  218:isub            
    //  119  219:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  120  222:aload_0         
    //  121  223:getfield        #41  <Field Object[] mValues>
    //  122  226:iload           4
    //  123  228:aload_0         
    //  124  229:getfield        #41  <Field Object[] mValues>
    //  125  232:iload           4
    //  126  234:iconst_1        
    //  127  235:iadd            
    //  128  236:aload_0         
    //  129  237:getfield        #43  <Field int mSize>
    //  130  240:iload           4
    //  131  242:isub            
    //  132  243:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  133  246:aload_0         
    //  134  247:getfield        #36  <Field int[] mKeys>
    //  135  250:iload           4
    //  136  252:iload_1         
    //  137  253:iastore         
    //  138  254:aload_0         
    //  139  255:getfield        #41  <Field Object[] mValues>
    //  140  258:iload           4
    //  141  260:aload_2         
    //  142  261:aastore         
    //  143  262:aload_0         
    //  144  263:iconst_1        
    //  145  264:aload_0         
    //  146  265:getfield        #43  <Field int mSize>
    //  147  268:iadd            
    //  148  269:putfield        #43  <Field int mSize>
    //  149  272:return          
    }

    public void remove(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #92  <Method void delete(int)>
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

    public void removeAtRange(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field int mSize>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iadd            
    //    5    7:invokestatic    #101 <Method int Math.min(int, int)>
    //    6   10:istore_3        
    //    7   11:iload_1         
    //    8   12:istore          4
    //    9   14:iload           4
    //   10   16:iload_3         
    //   11   17:icmpge          32
    //   12   20:aload_0         
    //   13   21:iload           4
    //   14   23:invokevirtual   #103 <Method void removeAt(int)>
    //   15   26:iinc            4  1
    //   16   29:goto            14
    //   17   32:return          
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
    //    1    1:invokevirtual   #110 <Method int size()>
    //    2    4:ifgt            10
    //    3    7:ldc1            #112 <String "{}">
    //    4    9:areturn         
    //    5   10:new             #114 <Class StringBuilder>
    //    6   13:dup             
    //    7   14:bipush          28
    //    8   16:aload_0         
    //    9   17:getfield        #43  <Field int mSize>
    //   10   20:imul            
    //   11   21:invokespecial   #115 <Method void StringBuilder(int)>
    //   12   24:astore_1        
    //   13   25:aload_1         
    //   14   26:bipush          123
    //   15   28:invokevirtual   #118 <Method StringBuilder StringBuilder.append(char)>
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
    //   26   47:ldc1            #120 <String ", ">
    //   27   49:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
    //   28   52:pop             
    //   29   53:aload_1         
    //   30   54:aload_0         
    //   31   55:iload_3         
    //   32   56:invokevirtual   #125 <Method int keyAt(int)>
    //   33   59:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
    //   34   62:pop             
    //   35   63:aload_1         
    //   36   64:bipush          61
    //   37   66:invokevirtual   #118 <Method StringBuilder StringBuilder.append(char)>
    //   38   69:pop             
    //   39   70:aload_0         
    //   40   71:iload_3         
    //   41   72:invokevirtual   #131 <Method Object valueAt(int)>
    //   42   75:astore          7
    //   43   77:aload           7
    //   44   79:aload_0         
    //   45   80:if_acmpeq       96
    //   46   83:aload_1         
    //   47   84:aload           7
    //   48   86:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
    //   49   89:pop             
    //   50   90:iinc            3  1
    //   51   93:goto            34
    //   52   96:aload_1         
    //   53   97:ldc1            #136 <String "(this Map)">
    //   54   99:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
    //   55  102:pop             
    //   56  103:goto            90
    //   57  106:aload_1         
    //   58  107:bipush          125
    //   59  109:invokevirtual   #118 <Method StringBuilder StringBuilder.append(char)>
    //   60  112:pop             
    //   61  113:aload_1         
    //   62  114:invokevirtual   #138 <Method String StringBuilder.toString()>
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
    private int mKeys[];
    private int mSize;
    private Object mValues[];
}
