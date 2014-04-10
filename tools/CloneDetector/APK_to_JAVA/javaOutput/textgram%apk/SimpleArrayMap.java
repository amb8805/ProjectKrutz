// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//            ContainerHelpers, ArrayMap

public class SimpleArrayMap
{

    public SimpleArrayMap()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #30  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
    //    4    8:putfield        #37  <Field int[] mHashes>
    //    5   11:aload_0         
    //    6   12:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //    7   15:putfield        #42  <Field Object[] mArray>
    //    8   18:aload_0         
    //    9   19:iconst_0        
    //   10   20:putfield        #44  <Field int mSize>
    //   11   23:return          
    }

    public SimpleArrayMap(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #30  <Method void Object()>
    //    2    4:iload_1         
    //    3    5:ifne            28
    //    4    8:aload_0         
    //    5    9:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
    //    6   12:putfield        #37  <Field int[] mHashes>
    //    7   15:aload_0         
    //    8   16:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //    9   19:putfield        #42  <Field Object[] mArray>
    //   10   22:aload_0         
    //   11   23:iconst_0        
    //   12   24:putfield        #44  <Field int mSize>
    //   13   27:return          
    //   14   28:aload_0         
    //   15   29:iload_1         
    //   16   30:invokespecial   #48  <Method void allocArrays(int)>
    //   17   33:goto            22
    }

    public SimpleArrayMap(SimpleArrayMap simplearraymap)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #50  <Method void SimpleArrayMap()>
    //    2    4:aload_1         
    //    3    5:ifnull          13
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokevirtual   #53  <Method void putAll(SimpleArrayMap)>
    //    7   13:return          
    }

    private void allocArrays(int i)
    {
    //    0    0:iload_1         
    //    1    1:bipush          8
    //    2    3:icmpne          104
    //    3    6:ldc1            #55  <Class ArrayMap>
    //    4    8:monitorenter    
    // try 9 74 handler(s) 96
    //    5    9:getstatic       #57  <Field Object[] mTwiceBaseCache>
    //    6   12:ifnull          75
    //    7   15:getstatic       #57  <Field Object[] mTwiceBaseCache>
    //    8   18:astore          5
    //    9   20:aload_0         
    //   10   21:aload           5
    //   11   23:putfield        #42  <Field Object[] mArray>
    //   12   26:aload           5
    //   13   28:iconst_0        
    //   14   29:aaload          
    //   15   30:checkcast       #58  <Class Object[]>
    //   16   33:checkcast       #58  <Class Object[]>
    //   17   36:putstatic       #57  <Field Object[] mTwiceBaseCache>
    //   18   39:aload_0         
    //   19   40:aload           5
    //   20   42:iconst_1        
    //   21   43:aaload          
    //   22   44:checkcast       #59  <Class int[]>
    //   23   47:checkcast       #59  <Class int[]>
    //   24   50:putfield        #37  <Field int[] mHashes>
    //   25   53:aload           5
    //   26   55:iconst_1        
    //   27   56:aconst_null     
    //   28   57:aastore         
    //   29   58:aload           5
    //   30   60:iconst_0        
    //   31   61:aconst_null     
    //   32   62:aastore         
    //   33   63:iconst_m1       
    //   34   64:getstatic       #61  <Field int mTwiceBaseCacheSize>
    //   35   67:iadd            
    //   36   68:putstatic       #61  <Field int mTwiceBaseCacheSize>
    //   37   71:ldc1            #55  <Class ArrayMap>
    //   38   73:monitorexit     
    //   39   74:return          
    // try 75 78 handler(s) 96
    //   40   75:ldc1            #55  <Class ArrayMap>
    //   41   77:monitorexit     
    //   42   78:aload_0         
    //   43   79:iload_1         
    //   44   80:newarray        int[]
    //   45   82:putfield        #37  <Field int[] mHashes>
    //   46   85:aload_0         
    //   47   86:iload_1         
    //   48   87:iconst_1        
    //   49   88:ishl            
    //   50   89:anewarray       Object[]
    //   51   92:putfield        #42  <Field Object[] mArray>
    //   52   95:return          
    // finally
    //   53   96:astore          4
    // try 98 101 handler(s) 96
    //   54   98:ldc1            #55  <Class ArrayMap>
    //   55  100:monitorexit     
    //   56  101:aload           4
    //   57  103:athrow          
    //   58  104:iload_1         
    //   59  105:iconst_4        
    //   60  106:icmpne          78
    //   61  109:ldc1            #55  <Class ArrayMap>
    //   62  111:monitorenter    
    // try 112 171 handler(s) 172
    //   63  112:getstatic       #63  <Field Object[] mBaseCache>
    //   64  115:ifnull          178
    //   65  118:getstatic       #63  <Field Object[] mBaseCache>
    //   66  121:astore_3        
    //   67  122:aload_0         
    //   68  123:aload_3         
    //   69  124:putfield        #42  <Field Object[] mArray>
    //   70  127:aload_3         
    //   71  128:iconst_0        
    //   72  129:aaload          
    //   73  130:checkcast       #58  <Class Object[]>
    //   74  133:checkcast       #58  <Class Object[]>
    //   75  136:putstatic       #63  <Field Object[] mBaseCache>
    //   76  139:aload_0         
    //   77  140:aload_3         
    //   78  141:iconst_1        
    //   79  142:aaload          
    //   80  143:checkcast       #59  <Class int[]>
    //   81  146:checkcast       #59  <Class int[]>
    //   82  149:putfield        #37  <Field int[] mHashes>
    //   83  152:aload_3         
    //   84  153:iconst_1        
    //   85  154:aconst_null     
    //   86  155:aastore         
    //   87  156:aload_3         
    //   88  157:iconst_0        
    //   89  158:aconst_null     
    //   90  159:aastore         
    //   91  160:iconst_m1       
    //   92  161:getstatic       #65  <Field int mBaseCacheSize>
    //   93  164:iadd            
    //   94  165:putstatic       #65  <Field int mBaseCacheSize>
    //   95  168:ldc1            #55  <Class ArrayMap>
    //   96  170:monitorexit     
    //   97  171:return          
    // finally
    //   98  172:astore_2        
    // try 173 176 handler(s) 172
    //   99  173:ldc1            #55  <Class ArrayMap>
    //  100  175:monitorexit     
    //  101  176:aload_2         
    //  102  177:athrow          
    // try 178 181 handler(s) 172
    //  103  178:ldc1            #55  <Class ArrayMap>
    //  104  180:monitorexit     
    //  105  181:goto            78
    }

    private static void freeArrays(int ai[], Object aobj[], int i)
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:bipush          8
    //    3    4:icmpne          76
    //    4    7:ldc1            #55  <Class ArrayMap>
    //    5    9:monitorenter    
    // try 10 28 handler(s) 68
    //    6   10:getstatic       #61  <Field int mTwiceBaseCacheSize>
    //    7   13:bipush          10
    //    8   15:icmpge          64
    //    9   18:aload_1         
    //   10   19:iconst_0        
    //   11   20:getstatic       #57  <Field Object[] mTwiceBaseCache>
    //   12   23:aastore         
    //   13   24:aload_1         
    //   14   25:iconst_1        
    //   15   26:aload_0         
    //   16   27:aastore         
    //   17   28:iconst_m1       
    //   18   29:iload_2         
    //   19   30:iconst_1        
    //   20   31:ishl            
    //   21   32:iadd            
    //   22   33:istore          6
    //   23   35:iload           6
    //   24   37:iconst_2        
    //   25   38:icmplt          52
    // try 41 46 handler(s) 68
    //   26   41:aload_1         
    //   27   42:iload           6
    //   28   44:aconst_null     
    //   29   45:aastore         
    //   30   46:iinc            6  -1
    //   31   49:goto            35
    // try 52 64 handler(s) 68
    //   32   52:aload_1         
    //   33   53:putstatic       #57  <Field Object[] mTwiceBaseCache>
    //   34   56:iconst_1        
    //   35   57:getstatic       #61  <Field int mTwiceBaseCacheSize>
    //   36   60:iadd            
    //   37   61:putstatic       #61  <Field int mTwiceBaseCacheSize>
    // try 64 67 handler(s) 68
    //   38   64:ldc1            #55  <Class ArrayMap>
    //   39   66:monitorexit     
    //   40   67:return          
    // finally
    //   41   68:astore          5
    // try 70 73 handler(s) 68
    //   42   70:ldc1            #55  <Class ArrayMap>
    //   43   72:monitorexit     
    //   44   73:aload           5
    //   45   75:athrow          
    //   46   76:aload_0         
    //   47   77:arraylength     
    //   48   78:iconst_4        
    //   49   79:icmpne          149
    //   50   82:ldc1            #55  <Class ArrayMap>
    //   51   84:monitorenter    
    // try 85 103 handler(s) 143
    //   52   85:getstatic       #65  <Field int mBaseCacheSize>
    //   53   88:bipush          10
    //   54   90:icmpge          139
    //   55   93:aload_1         
    //   56   94:iconst_0        
    //   57   95:getstatic       #63  <Field Object[] mBaseCache>
    //   58   98:aastore         
    //   59   99:aload_1         
    //   60  100:iconst_1        
    //   61  101:aload_0         
    //   62  102:aastore         
    //   63  103:iconst_m1       
    //   64  104:iload_2         
    //   65  105:iconst_1        
    //   66  106:ishl            
    //   67  107:iadd            
    //   68  108:istore          4
    //   69  110:iload           4
    //   70  112:iconst_2        
    //   71  113:icmplt          127
    // try 116 121 handler(s) 143
    //   72  116:aload_1         
    //   73  117:iload           4
    //   74  119:aconst_null     
    //   75  120:aastore         
    //   76  121:iinc            4  -1
    //   77  124:goto            110
    // try 127 139 handler(s) 143
    //   78  127:aload_1         
    //   79  128:putstatic       #63  <Field Object[] mBaseCache>
    //   80  131:iconst_1        
    //   81  132:getstatic       #65  <Field int mBaseCacheSize>
    //   82  135:iadd            
    //   83  136:putstatic       #65  <Field int mBaseCacheSize>
    // try 139 142 handler(s) 143
    //   84  139:ldc1            #55  <Class ArrayMap>
    //   85  141:monitorexit     
    //   86  142:return          
    // finally
    //   87  143:astore_3        
    // try 144 147 handler(s) 143
    //   88  144:ldc1            #55  <Class ArrayMap>
    //   89  146:monitorexit     
    //   90  147:aload_3         
    //   91  148:athrow          
    //   92  149:return          
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:ifeq            41
    //    3    7:aload_0         
    //    4    8:getfield        #37  <Field int[] mHashes>
    //    5   11:aload_0         
    //    6   12:getfield        #42  <Field Object[] mArray>
    //    7   15:aload_0         
    //    8   16:getfield        #44  <Field int mSize>
    //    9   19:invokestatic    #70  <Method void freeArrays(int[], Object[], int)>
    //   10   22:aload_0         
    //   11   23:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
    //   12   26:putfield        #37  <Field int[] mHashes>
    //   13   29:aload_0         
    //   14   30:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //   15   33:putfield        #42  <Field Object[] mArray>
    //   16   36:aload_0         
    //   17   37:iconst_0        
    //   18   38:putfield        #44  <Field int mSize>
    //   19   41:return          
    }

    public boolean containsKey(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       15
    //    2    4:aload_0         
    //    3    5:invokevirtual   #76  <Method int indexOfNull()>
    //    4    8:iflt            13
    //    5   11:iconst_1        
    //    6   12:ireturn         
    //    7   13:iconst_0        
    //    8   14:ireturn         
    //    9   15:aload_0         
    //   10   16:aload_1         
    //   11   17:aload_1         
    //   12   18:invokevirtual   #79  <Method int Object.hashCode()>
    //   13   21:invokevirtual   #83  <Method int indexOf(Object, int)>
    //   14   24:ifge            11
    //   15   27:iconst_0        
    //   16   28:ireturn         
    }

    public boolean containsValue(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #88  <Method int indexOfValue(Object)>
    //    3    5:iflt            10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:iconst_0        
    //    7   11:ireturn         
    }

    public void ensureCapacity(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field int[] mHashes>
    //    2    4:arraylength     
    //    3    5:iload_1         
    //    4    6:icmpge          70
    //    5    9:aload_0         
    //    6   10:getfield        #37  <Field int[] mHashes>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:getfield        #42  <Field Object[] mArray>
    //   10   18:astore_3        
    //   11   19:aload_0         
    //   12   20:iload_1         
    //   13   21:invokespecial   #48  <Method void allocArrays(int)>
    //   14   24:aload_0         
    //   15   25:getfield        #44  <Field int mSize>
    //   16   28:ifle            61
    //   17   31:aload_2         
    //   18   32:iconst_0        
    //   19   33:aload_0         
    //   20   34:getfield        #37  <Field int[] mHashes>
    //   21   37:iconst_0        
    //   22   38:aload_0         
    //   23   39:getfield        #44  <Field int mSize>
    //   24   42:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   25   45:aload_3         
    //   26   46:iconst_0        
    //   27   47:aload_0         
    //   28   48:getfield        #42  <Field Object[] mArray>
    //   29   51:iconst_0        
    //   30   52:aload_0         
    //   31   53:getfield        #44  <Field int mSize>
    //   32   56:iconst_1        
    //   33   57:ishl            
    //   34   58:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   35   61:aload_2         
    //   36   62:aload_3         
    //   37   63:aload_0         
    //   38   64:getfield        #44  <Field int mSize>
    //   39   67:invokestatic    #70  <Method void freeArrays(int[], Object[], int)>
    //   40   70:return          
    }

    public boolean equals(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:if_acmpne       7
    //    3    5:iconst_1        
    //    4    6:ireturn         
    //    5    7:aload_1         
    //    6    8:instanceof      #102 <Class Map>
    //    7   11:ifeq            122
    //    8   14:aload_1         
    //    9   15:checkcast       #102 <Class Map>
    //   10   18:astore_2        
    //   11   19:aload_0         
    //   12   20:invokevirtual   #105 <Method int size()>
    //   13   23:aload_2         
    //   14   24:invokeinterface #106 <Method int Map.size()>
    //   15   29:icmpeq          34
    //   16   32:iconst_0        
    //   17   33:ireturn         
    //   18   34:iconst_0        
    //   19   35:istore_3        
    // try 36 68 handler(s) 114 118
    //   20   36:iload_3         
    //   21   37:aload_0         
    //   22   38:getfield        #44  <Field int mSize>
    //   23   41:icmpge          5
    //   24   44:aload_0         
    //   25   45:iload_3         
    //   26   46:invokevirtual   #110 <Method Object keyAt(int)>
    //   27   49:astore          6
    //   28   51:aload_0         
    //   29   52:iload_3         
    //   30   53:invokevirtual   #113 <Method Object valueAt(int)>
    //   31   56:astore          7
    //   32   58:aload_2         
    //   33   59:aload           6
    //   34   61:invokeinterface #117 <Method Object Map.get(Object)>
    //   35   66:astore          8
    //   36   68:aload           7
    //   37   70:ifnonnull       92
    //   38   73:aload           8
    //   39   75:ifnonnull       124
    // try 78 89 handler(s) 114 118
    //   40   78:aload_2         
    //   41   79:aload           6
    //   42   81:invokeinterface #119 <Method boolean Map.containsKey(Object)>
    //   43   86:ifne            108
    //   44   89:goto            124
    // try 92 101 handler(s) 114 118
    //   45   92:aload           7
    //   46   94:aload           8
    //   47   96:invokevirtual   #121 <Method boolean Object.equals(Object)>
    //   48   99:istore          9
    //   49  101:iload           9
    //   50  103:ifne            108
    //   51  106:iconst_0        
    //   52  107:ireturn         
    //   53  108:iinc            3  1
    //   54  111:goto            36
    // catch NullPointerException NullPointerException NullPointerException
    //   55  114:astore          5
    //   56  116:iconst_0        
    //   57  117:ireturn         
    // catch ClassCastException ClassCastException ClassCastException
    //   58  118:astore          4
    //   59  120:iconst_0        
    //   60  121:ireturn         
    //   61  122:iconst_0        
    //   62  123:ireturn         
    //   63  124:iconst_0        
    //   64  125:ireturn         
    }

    public Object get(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       24
    //    2    4:aload_0         
    //    3    5:invokevirtual   #76  <Method int indexOfNull()>
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:iflt            37
    //    7   13:aload_0         
    //    8   14:getfield        #42  <Field Object[] mArray>
    //    9   17:iconst_1        
    //   10   18:iload_2         
    //   11   19:iconst_1        
    //   12   20:ishl            
    //   13   21:iadd            
    //   14   22:aaload          
    //   15   23:areturn         
    //   16   24:aload_0         
    //   17   25:aload_1         
    //   18   26:aload_1         
    //   19   27:invokevirtual   #79  <Method int Object.hashCode()>
    //   20   30:invokevirtual   #83  <Method int indexOf(Object, int)>
    //   21   33:istore_2        
    //   22   34:goto            9
    //   23   37:aconst_null     
    //   24   38:areturn         
    }

    public int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field int[] mHashes>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #42  <Field Object[] mArray>
    //    5    9:astore_2        
    //    6   10:iconst_0        
    //    7   11:istore_3        
    //    8   12:iconst_0        
    //    9   13:istore          4
    //   10   15:iconst_1        
    //   11   16:istore          5
    //   12   18:aload_0         
    //   13   19:getfield        #44  <Field int mSize>
    //   14   22:istore          6
    //   15   24:iload           4
    //   16   26:iload           6
    //   17   28:icmpge          78
    //   18   31:aload_2         
    //   19   32:iload           5
    //   20   34:aaload          
    //   21   35:astore          7
    //   22   37:aload_1         
    //   23   38:iload           4
    //   24   40:iaload          
    //   25   41:istore          8
    //   26   43:aload           7
    //   27   45:ifnonnull       68
    //   28   48:iconst_0        
    //   29   49:istore          9
    //   30   51:iload_3         
    //   31   52:iload           9
    //   32   54:iload           8
    //   33   56:ixor            
    //   34   57:iadd            
    //   35   58:istore_3        
    //   36   59:iinc            4  1
    //   37   62:iinc            5  2
    //   38   65:goto            24
    //   39   68:aload           7
    //   40   70:invokevirtual   #79  <Method int Object.hashCode()>
    //   41   73:istore          9
    //   42   75:goto            51
    //   43   78:iload_3         
    //   44   79:ireturn         
    }

    int indexOf(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:istore_3        
    //    3    5:iload_3         
    //    4    6:ifne            15
    //    5    9:iconst_m1       
    //    6   10:istore          4
    //    7   12:iload           4
    //    8   14:ireturn         
    //    9   15:aload_0         
    //   10   16:getfield        #37  <Field int[] mHashes>
    //   11   19:iload_3         
    //   12   20:iload_2         
    //   13   21:invokestatic    #125 <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //   14   24:istore          4
    //   15   26:iload           4
    //   16   28:iflt            12
    //   17   31:aload_1         
    //   18   32:aload_0         
    //   19   33:getfield        #42  <Field Object[] mArray>
    //   20   36:iload           4
    //   21   38:iconst_1        
    //   22   39:ishl            
    //   23   40:aaload          
    //   24   41:invokevirtual   #121 <Method boolean Object.equals(Object)>
    //   25   44:ifne            12
    //   26   47:iload           4
    //   27   49:iconst_1        
    //   28   50:iadd            
    //   29   51:istore          5
    //   30   53:iload           5
    //   31   55:iload_3         
    //   32   56:icmpge          95
    //   33   59:aload_0         
    //   34   60:getfield        #37  <Field int[] mHashes>
    //   35   63:iload           5
    //   36   65:iaload          
    //   37   66:iload_2         
    //   38   67:icmpne          95
    //   39   70:aload_1         
    //   40   71:aload_0         
    //   41   72:getfield        #42  <Field Object[] mArray>
    //   42   75:iload           5
    //   43   77:iconst_1        
    //   44   78:ishl            
    //   45   79:aaload          
    //   46   80:invokevirtual   #121 <Method boolean Object.equals(Object)>
    //   47   83:ifeq            89
    //   48   86:iload           5
    //   49   88:ireturn         
    //   50   89:iinc            5  1
    //   51   92:goto            53
    //   52   95:iload           4
    //   53   97:iconst_1        
    //   54   98:isub            
    //   55   99:istore          6
    //   56  101:iload           6
    //   57  103:iflt            142
    //   58  106:aload_0         
    //   59  107:getfield        #37  <Field int[] mHashes>
    //   60  110:iload           6
    //   61  112:iaload          
    //   62  113:iload_2         
    //   63  114:icmpne          142
    //   64  117:aload_1         
    //   65  118:aload_0         
    //   66  119:getfield        #42  <Field Object[] mArray>
    //   67  122:iload           6
    //   68  124:iconst_1        
    //   69  125:ishl            
    //   70  126:aaload          
    //   71  127:invokevirtual   #121 <Method boolean Object.equals(Object)>
    //   72  130:ifeq            136
    //   73  133:iload           6
    //   74  135:ireturn         
    //   75  136:iinc            6  -1
    //   76  139:goto            101
    //   77  142:iload           5
    //   78  144:iconst_m1       
    //   79  145:ixor            
    //   80  146:ireturn         
    }

    int indexOfNull()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:istore_1        
    //    3    5:iload_1         
    //    4    6:ifne            13
    //    5    9:iconst_m1       
    //    6   10:istore_2        
    //    7   11:iload_2         
    //    8   12:ireturn         
    //    9   13:aload_0         
    //   10   14:getfield        #37  <Field int[] mHashes>
    //   11   17:iload_1         
    //   12   18:iconst_0        
    //   13   19:invokestatic    #125 <Method int ContainerHelpers.binarySearch(int[], int, int)>
    //   14   22:istore_2        
    //   15   23:iload_2         
    //   16   24:iflt            11
    //   17   27:aload_0         
    //   18   28:getfield        #42  <Field Object[] mArray>
    //   19   31:iload_2         
    //   20   32:iconst_1        
    //   21   33:ishl            
    //   22   34:aaload          
    //   23   35:ifnull          11
    //   24   38:iload_2         
    //   25   39:iconst_1        
    //   26   40:iadd            
    //   27   41:istore_3        
    //   28   42:iload_3         
    //   29   43:iload_1         
    //   30   44:icmpge          75
    //   31   47:aload_0         
    //   32   48:getfield        #37  <Field int[] mHashes>
    //   33   51:iload_3         
    //   34   52:iaload          
    //   35   53:ifne            75
    //   36   56:aload_0         
    //   37   57:getfield        #42  <Field Object[] mArray>
    //   38   60:iload_3         
    //   39   61:iconst_1        
    //   40   62:ishl            
    //   41   63:aaload          
    //   42   64:ifnonnull       69
    //   43   67:iload_3         
    //   44   68:ireturn         
    //   45   69:iinc            3  1
    //   46   72:goto            42
    //   47   75:iload_2         
    //   48   76:iconst_1        
    //   49   77:isub            
    //   50   78:istore          4
    //   51   80:iload           4
    //   52   82:iflt            116
    //   53   85:aload_0         
    //   54   86:getfield        #37  <Field int[] mHashes>
    //   55   89:iload           4
    //   56   91:iaload          
    //   57   92:ifne            116
    //   58   95:aload_0         
    //   59   96:getfield        #42  <Field Object[] mArray>
    //   60   99:iload           4
    //   61  101:iconst_1        
    //   62  102:ishl            
    //   63  103:aaload          
    //   64  104:ifnonnull       110
    //   65  107:iload           4
    //   66  109:ireturn         
    //   67  110:iinc            4  -1
    //   68  113:goto            80
    //   69  116:iload_3         
    //   70  117:iconst_m1       
    //   71  118:ixor            
    //   72  119:ireturn         
    }

    int indexOfValue(Object obj)
    {
    //    0    0:iconst_2        
    //    1    1:aload_0         
    //    2    2:getfield        #44  <Field int mSize>
    //    3    5:imul            
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:getfield        #42  <Field Object[] mArray>
    //    7   11:astore_3        
    //    8   12:aload_1         
    //    9   13:ifnonnull       43
    //   10   16:iconst_1        
    //   11   17:istore          5
    //   12   19:iload           5
    //   13   21:iload_2         
    //   14   22:icmpge          74
    //   15   25:aload_3         
    //   16   26:iload           5
    //   17   28:aaload          
    //   18   29:ifnonnull       37
    //   19   32:iload           5
    //   20   34:iconst_1        
    //   21   35:ishr            
    //   22   36:ireturn         
    //   23   37:iinc            5  2
    //   24   40:goto            19
    //   25   43:iconst_1        
    //   26   44:istore          4
    //   27   46:iload           4
    //   28   48:iload_2         
    //   29   49:icmpge          74
    //   30   52:aload_1         
    //   31   53:aload_3         
    //   32   54:iload           4
    //   33   56:aaload          
    //   34   57:invokevirtual   #121 <Method boolean Object.equals(Object)>
    //   35   60:ifeq            68
    //   36   63:iload           4
    //   37   65:iconst_1        
    //   38   66:ishr            
    //   39   67:ireturn         
    //   40   68:iinc            4  2
    //   41   71:goto            46
    //   42   74:iconst_m1       
    //   43   75:ireturn         
    }

    public boolean isEmpty()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:ifgt            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    public Object keyAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Object[] mArray>
    //    2    4:iload_1         
    //    3    5:iconst_1        
    //    4    6:ishl            
    //    5    7:aaload          
    //    6    8:areturn         
    }

    public Object put(Object obj, Object obj1)
    {
    //    0    0:bipush          8
    //    1    2:istore_3        
    //    2    3:aload_1         
    //    3    4:ifnonnull       49
    //    4    7:iconst_0        
    //    5    8:istore          4
    //    6   10:aload_0         
    //    7   11:invokevirtual   #76  <Method int indexOfNull()>
    //    8   14:istore          5
    //    9   16:iload           5
    //   10   18:iflt            67
    //   11   21:iconst_1        
    //   12   22:iload           5
    //   13   24:iconst_1        
    //   14   25:ishl            
    //   15   26:iadd            
    //   16   27:istore          9
    //   17   29:aload_0         
    //   18   30:getfield        #42  <Field Object[] mArray>
    //   19   33:iload           9
    //   20   35:aaload          
    //   21   36:astore          10
    //   22   38:aload_0         
    //   23   39:getfield        #42  <Field Object[] mArray>
    //   24   42:iload           9
    //   25   44:aload_2         
    //   26   45:aastore         
    //   27   46:aload           10
    //   28   48:areturn         
    //   29   49:aload_1         
    //   30   50:invokevirtual   #79  <Method int Object.hashCode()>
    //   31   53:istore          4
    //   32   55:aload_0         
    //   33   56:aload_1         
    //   34   57:iload           4
    //   35   59:invokevirtual   #83  <Method int indexOf(Object, int)>
    //   36   62:istore          5
    //   37   64:goto            16
    //   38   67:iload           5
    //   39   69:iconst_m1       
    //   40   70:ixor            
    //   41   71:istore          6
    //   42   73:aload_0         
    //   43   74:getfield        #44  <Field int mSize>
    //   44   77:aload_0         
    //   45   78:getfield        #37  <Field int[] mHashes>
    //   46   81:arraylength     
    //   47   82:icmplt          169
    //   48   85:aload_0         
    //   49   86:getfield        #44  <Field int mSize>
    //   50   89:iload_3         
    //   51   90:icmplt          275
    //   52   93:aload_0         
    //   53   94:getfield        #44  <Field int mSize>
    //   54   97:aload_0         
    //   55   98:getfield        #44  <Field int mSize>
    //   56  101:iconst_1        
    //   57  102:ishr            
    //   58  103:iadd            
    //   59  104:istore_3        
    //   60  105:aload_0         
    //   61  106:getfield        #37  <Field int[] mHashes>
    //   62  109:astore          7
    //   63  111:aload_0         
    //   64  112:getfield        #42  <Field Object[] mArray>
    //   65  115:astore          8
    //   66  117:aload_0         
    //   67  118:iload_3         
    //   68  119:invokespecial   #48  <Method void allocArrays(int)>
    //   69  122:aload_0         
    //   70  123:getfield        #37  <Field int[] mHashes>
    //   71  126:arraylength     
    //   72  127:ifle            158
    //   73  130:aload           7
    //   74  132:iconst_0        
    //   75  133:aload_0         
    //   76  134:getfield        #37  <Field int[] mHashes>
    //   77  137:iconst_0        
    //   78  138:aload           7
    //   79  140:arraylength     
    //   80  141:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   81  144:aload           8
    //   82  146:iconst_0        
    //   83  147:aload_0         
    //   84  148:getfield        #42  <Field Object[] mArray>
    //   85  151:iconst_0        
    //   86  152:aload           8
    //   87  154:arraylength     
    //   88  155:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   89  158:aload           7
    //   90  160:aload           8
    //   91  162:aload_0         
    //   92  163:getfield        #44  <Field int mSize>
    //   93  166:invokestatic    #70  <Method void freeArrays(int[], Object[], int)>
    //   94  169:iload           6
    //   95  171:aload_0         
    //   96  172:getfield        #44  <Field int mSize>
    //   97  175:icmpge          232
    //   98  178:aload_0         
    //   99  179:getfield        #37  <Field int[] mHashes>
    //  100  182:iload           6
    //  101  184:aload_0         
    //  102  185:getfield        #37  <Field int[] mHashes>
    //  103  188:iload           6
    //  104  190:iconst_1        
    //  105  191:iadd            
    //  106  192:aload_0         
    //  107  193:getfield        #44  <Field int mSize>
    //  108  196:iload           6
    //  109  198:isub            
    //  110  199:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  111  202:aload_0         
    //  112  203:getfield        #42  <Field Object[] mArray>
    //  113  206:iload           6
    //  114  208:iconst_1        
    //  115  209:ishl            
    //  116  210:aload_0         
    //  117  211:getfield        #42  <Field Object[] mArray>
    //  118  214:iload           6
    //  119  216:iconst_1        
    //  120  217:iadd            
    //  121  218:iconst_1        
    //  122  219:ishl            
    //  123  220:aload_0         
    //  124  221:getfield        #44  <Field int mSize>
    //  125  224:iload           6
    //  126  226:isub            
    //  127  227:iconst_1        
    //  128  228:ishl            
    //  129  229:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  130  232:aload_0         
    //  131  233:getfield        #37  <Field int[] mHashes>
    //  132  236:iload           6
    //  133  238:iload           4
    //  134  240:iastore         
    //  135  241:aload_0         
    //  136  242:getfield        #42  <Field Object[] mArray>
    //  137  245:iload           6
    //  138  247:iconst_1        
    //  139  248:ishl            
    //  140  249:aload_1         
    //  141  250:aastore         
    //  142  251:aload_0         
    //  143  252:getfield        #42  <Field Object[] mArray>
    //  144  255:iconst_1        
    //  145  256:iload           6
    //  146  258:iconst_1        
    //  147  259:ishl            
    //  148  260:iadd            
    //  149  261:aload_2         
    //  150  262:aastore         
    //  151  263:aload_0         
    //  152  264:iconst_1        
    //  153  265:aload_0         
    //  154  266:getfield        #44  <Field int mSize>
    //  155  269:iadd            
    //  156  270:putfield        #44  <Field int mSize>
    //  157  273:aconst_null     
    //  158  274:areturn         
    //  159  275:aload_0         
    //  160  276:getfield        #44  <Field int mSize>
    //  161  279:iconst_4        
    //  162  280:icmpge          105
    //  163  283:iconst_4        
    //  164  284:istore_3        
    //  165  285:goto            105
    }

    public void putAll(SimpleArrayMap simplearraymap)
    {
    //    0    0:aload_1         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:aload_0         
    //    6    8:getfield        #44  <Field int mSize>
    //    7   11:iadd            
    //    8   12:invokevirtual   #131 <Method void ensureCapacity(int)>
    //    9   15:aload_0         
    //   10   16:getfield        #44  <Field int mSize>
    //   11   19:ifne            62
    //   12   22:iload_2         
    //   13   23:ifle            61
    //   14   26:aload_1         
    //   15   27:getfield        #37  <Field int[] mHashes>
    //   16   30:iconst_0        
    //   17   31:aload_0         
    //   18   32:getfield        #37  <Field int[] mHashes>
    //   19   35:iconst_0        
    //   20   36:iload_2         
    //   21   37:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   22   40:aload_1         
    //   23   41:getfield        #42  <Field Object[] mArray>
    //   24   44:iconst_0        
    //   25   45:aload_0         
    //   26   46:getfield        #42  <Field Object[] mArray>
    //   27   49:iconst_0        
    //   28   50:iload_2         
    //   29   51:iconst_1        
    //   30   52:ishl            
    //   31   53:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   32   56:aload_0         
    //   33   57:iload_2         
    //   34   58:putfield        #44  <Field int mSize>
    //   35   61:return          
    //   36   62:iconst_0        
    //   37   63:istore_3        
    //   38   64:iload_3         
    //   39   65:iload_2         
    //   40   66:icmpge          61
    //   41   69:aload_0         
    //   42   70:aload_1         
    //   43   71:iload_3         
    //   44   72:invokevirtual   #110 <Method Object keyAt(int)>
    //   45   75:aload_1         
    //   46   76:iload_3         
    //   47   77:invokevirtual   #113 <Method Object valueAt(int)>
    //   48   80:invokevirtual   #133 <Method Object put(Object, Object)>
    //   49   83:pop             
    //   50   84:iinc            3  1
    //   51   87:goto            64
    }

    public Object remove(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       19
    //    2    4:aload_0         
    //    3    5:invokevirtual   #76  <Method int indexOfNull()>
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:iflt            32
    //    7   13:aload_0         
    //    8   14:iload_2         
    //    9   15:invokevirtual   #137 <Method Object removeAt(int)>
    //   10   18:areturn         
    //   11   19:aload_0         
    //   12   20:aload_1         
    //   13   21:aload_1         
    //   14   22:invokevirtual   #79  <Method int Object.hashCode()>
    //   15   25:invokevirtual   #83  <Method int indexOf(Object, int)>
    //   16   28:istore_2        
    //   17   29:goto            9
    //   18   32:aconst_null     
    //   19   33:areturn         
    }

    public Object removeAt(int i)
    {
    //    0    0:bipush          8
    //    1    2:istore_2        
    //    2    3:aload_0         
    //    3    4:getfield        #42  <Field Object[] mArray>
    //    4    7:iconst_1        
    //    5    8:iload_1         
    //    6    9:iconst_1        
    //    7   10:ishl            
    //    8   11:iadd            
    //    9   12:aaload          
    //   10   13:astore_3        
    //   11   14:aload_0         
    //   12   15:getfield        #44  <Field int mSize>
    //   13   18:iconst_1        
    //   14   19:icmpgt          58
    //   15   22:aload_0         
    //   16   23:getfield        #37  <Field int[] mHashes>
    //   17   26:aload_0         
    //   18   27:getfield        #42  <Field Object[] mArray>
    //   19   30:aload_0         
    //   20   31:getfield        #44  <Field int mSize>
    //   21   34:invokestatic    #70  <Method void freeArrays(int[], Object[], int)>
    //   22   37:aload_0         
    //   23   38:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
    //   24   41:putfield        #37  <Field int[] mHashes>
    //   25   44:aload_0         
    //   26   45:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
    //   27   48:putfield        #42  <Field Object[] mArray>
    //   28   51:aload_0         
    //   29   52:iconst_0        
    //   30   53:putfield        #44  <Field int mSize>
    //   31   56:aload_3         
    //   32   57:areturn         
    //   33   58:aload_0         
    //   34   59:getfield        #37  <Field int[] mHashes>
    //   35   62:arraylength     
    //   36   63:iload_2         
    //   37   64:icmple          212
    //   38   67:aload_0         
    //   39   68:getfield        #44  <Field int mSize>
    //   40   71:aload_0         
    //   41   72:getfield        #37  <Field int[] mHashes>
    //   42   75:arraylength     
    //   43   76:iconst_3        
    //   44   77:idiv            
    //   45   78:icmpge          212
    //   46   81:aload_0         
    //   47   82:getfield        #44  <Field int mSize>
    //   48   85:iload_2         
    //   49   86:icmple          101
    //   50   89:aload_0         
    //   51   90:getfield        #44  <Field int mSize>
    //   52   93:aload_0         
    //   53   94:getfield        #44  <Field int mSize>
    //   54   97:iconst_1        
    //   55   98:ishr            
    //   56   99:iadd            
    //   57  100:istore_2        
    //   58  101:aload_0         
    //   59  102:getfield        #37  <Field int[] mHashes>
    //   60  105:astore          4
    //   61  107:aload_0         
    //   62  108:getfield        #42  <Field Object[] mArray>
    //   63  111:astore          5
    //   64  113:aload_0         
    //   65  114:iload_2         
    //   66  115:invokespecial   #48  <Method void allocArrays(int)>
    //   67  118:aload_0         
    //   68  119:iconst_m1       
    //   69  120:aload_0         
    //   70  121:getfield        #44  <Field int mSize>
    //   71  124:iadd            
    //   72  125:putfield        #44  <Field int mSize>
    //   73  128:iload_1         
    //   74  129:ifle            158
    //   75  132:aload           4
    //   76  134:iconst_0        
    //   77  135:aload_0         
    //   78  136:getfield        #37  <Field int[] mHashes>
    //   79  139:iconst_0        
    //   80  140:iload_1         
    //   81  141:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   82  144:aload           5
    //   83  146:iconst_0        
    //   84  147:aload_0         
    //   85  148:getfield        #42  <Field Object[] mArray>
    //   86  151:iconst_0        
    //   87  152:iload_1         
    //   88  153:iconst_1        
    //   89  154:ishl            
    //   90  155:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   91  158:iload_1         
    //   92  159:aload_0         
    //   93  160:getfield        #44  <Field int mSize>
    //   94  163:icmpge          56
    //   95  166:aload           4
    //   96  168:iload_1         
    //   97  169:iconst_1        
    //   98  170:iadd            
    //   99  171:aload_0         
    //  100  172:getfield        #37  <Field int[] mHashes>
    //  101  175:iload_1         
    //  102  176:aload_0         
    //  103  177:getfield        #44  <Field int mSize>
    //  104  180:iload_1         
    //  105  181:isub            
    //  106  182:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  107  185:aload           5
    //  108  187:iload_1         
    //  109  188:iconst_1        
    //  110  189:iadd            
    //  111  190:iconst_1        
    //  112  191:ishl            
    //  113  192:aload_0         
    //  114  193:getfield        #42  <Field Object[] mArray>
    //  115  196:iload_1         
    //  116  197:iconst_1        
    //  117  198:ishl            
    //  118  199:aload_0         
    //  119  200:getfield        #44  <Field int mSize>
    //  120  203:iload_1         
    //  121  204:isub            
    //  122  205:iconst_1        
    //  123  206:ishl            
    //  124  207:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  125  210:aload_3         
    //  126  211:areturn         
    //  127  212:aload_0         
    //  128  213:iconst_m1       
    //  129  214:aload_0         
    //  130  215:getfield        #44  <Field int mSize>
    //  131  218:iadd            
    //  132  219:putfield        #44  <Field int mSize>
    //  133  222:iload_1         
    //  134  223:aload_0         
    //  135  224:getfield        #44  <Field int mSize>
    //  136  227:icmpge          278
    //  137  230:aload_0         
    //  138  231:getfield        #37  <Field int[] mHashes>
    //  139  234:iload_1         
    //  140  235:iconst_1        
    //  141  236:iadd            
    //  142  237:aload_0         
    //  143  238:getfield        #37  <Field int[] mHashes>
    //  144  241:iload_1         
    //  145  242:aload_0         
    //  146  243:getfield        #44  <Field int mSize>
    //  147  246:iload_1         
    //  148  247:isub            
    //  149  248:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  150  251:aload_0         
    //  151  252:getfield        #42  <Field Object[] mArray>
    //  152  255:iload_1         
    //  153  256:iconst_1        
    //  154  257:iadd            
    //  155  258:iconst_1        
    //  156  259:ishl            
    //  157  260:aload_0         
    //  158  261:getfield        #42  <Field Object[] mArray>
    //  159  264:iload_1         
    //  160  265:iconst_1        
    //  161  266:ishl            
    //  162  267:aload_0         
    //  163  268:getfield        #44  <Field int mSize>
    //  164  271:iload_1         
    //  165  272:isub            
    //  166  273:iconst_1        
    //  167  274:ishl            
    //  168  275:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
    //  169  278:aload_0         
    //  170  279:getfield        #42  <Field Object[] mArray>
    //  171  282:aload_0         
    //  172  283:getfield        #44  <Field int mSize>
    //  173  286:iconst_1        
    //  174  287:ishl            
    //  175  288:aconst_null     
    //  176  289:aastore         
    //  177  290:aload_0         
    //  178  291:getfield        #42  <Field Object[] mArray>
    //  179  294:iconst_1        
    //  180  295:aload_0         
    //  181  296:getfield        #44  <Field int mSize>
    //  182  299:iconst_1        
    //  183  300:ishl            
    //  184  301:iadd            
    //  185  302:aconst_null     
    //  186  303:aastore         
    //  187  304:aload_3         
    //  188  305:areturn         
    }

    public Object setValueAt(int i, Object obj)
    {
    //    0    0:iconst_1        
    //    1    1:iload_1         
    //    2    2:iconst_1        
    //    3    3:ishl            
    //    4    4:iadd            
    //    5    5:istore_3        
    //    6    6:aload_0         
    //    7    7:getfield        #42  <Field Object[] mArray>
    //    8   10:iload_3         
    //    9   11:aaload          
    //   10   12:astore          4
    //   11   14:aload_0         
    //   12   15:getfield        #42  <Field Object[] mArray>
    //   13   18:iload_3         
    //   14   19:aload_2         
    //   15   20:aastore         
    //   16   21:aload           4
    //   17   23:areturn         
    }

    public int size()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field int mSize>
    //    2    4:ireturn         
    }

    public String toString()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #143 <Method boolean isEmpty()>
    //    2    4:ifeq            10
    //    3    7:ldc1            #145 <String "{}">
    //    4    9:areturn         
    //    5   10:new             #147 <Class StringBuilder>
    //    6   13:dup             
    //    7   14:bipush          28
    //    8   16:aload_0         
    //    9   17:getfield        #44  <Field int mSize>
    //   10   20:imul            
    //   11   21:invokespecial   #149 <Method void StringBuilder(int)>
    //   12   24:astore_1        
    //   13   25:aload_1         
    //   14   26:bipush          123
    //   15   28:invokevirtual   #153 <Method StringBuilder StringBuilder.append(char)>
    //   16   31:pop             
    //   17   32:iconst_0        
    //   18   33:istore_3        
    //   19   34:iload_3         
    //   20   35:aload_0         
    //   21   36:getfield        #44  <Field int mSize>
    //   22   39:icmpge          126
    //   23   42:iload_3         
    //   24   43:ifle            53
    //   25   46:aload_1         
    //   26   47:ldc1            #155 <String ", ">
    //   27   49:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
    //   28   52:pop             
    //   29   53:aload_0         
    //   30   54:iload_3         
    //   31   55:invokevirtual   #110 <Method Object keyAt(int)>
    //   32   58:astore          5
    //   33   60:aload           5
    //   34   62:aload_0         
    //   35   63:if_acmpeq       106
    //   36   66:aload_1         
    //   37   67:aload           5
    //   38   69:invokevirtual   #161 <Method StringBuilder StringBuilder.append(Object)>
    //   39   72:pop             
    //   40   73:aload_1         
    //   41   74:bipush          61
    //   42   76:invokevirtual   #153 <Method StringBuilder StringBuilder.append(char)>
    //   43   79:pop             
    //   44   80:aload_0         
    //   45   81:iload_3         
    //   46   82:invokevirtual   #113 <Method Object valueAt(int)>
    //   47   85:astore          8
    //   48   87:aload           8
    //   49   89:aload_0         
    //   50   90:if_acmpeq       116
    //   51   93:aload_1         
    //   52   94:aload           8
    //   53   96:invokevirtual   #161 <Method StringBuilder StringBuilder.append(Object)>
    //   54   99:pop             
    //   55  100:iinc            3  1
    //   56  103:goto            34
    //   57  106:aload_1         
    //   58  107:ldc1            #163 <String "(this Map)">
    //   59  109:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
    //   60  112:pop             
    //   61  113:goto            73
    //   62  116:aload_1         
    //   63  117:ldc1            #163 <String "(this Map)">
    //   64  119:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
    //   65  122:pop             
    //   66  123:goto            100
    //   67  126:aload_1         
    //   68  127:bipush          125
    //   69  129:invokevirtual   #153 <Method StringBuilder StringBuilder.append(char)>
    //   70  132:pop             
    //   71  133:aload_1         
    //   72  134:invokevirtual   #165 <Method String StringBuilder.toString()>
    //   73  137:areturn         
    }

    public Object valueAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field Object[] mArray>
    //    2    4:iconst_1        
    //    3    5:iload_1         
    //    4    6:iconst_1        
    //    5    7:ishl            
    //    6    8:iadd            
    //    7    9:aaload          
    //    8   10:areturn         
    }

    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object mBaseCache[];
    static int mBaseCacheSize;
    static Object mTwiceBaseCache[];
    static int mTwiceBaseCacheSize;
    Object mArray[];
    int mHashes[];
    int mSize;
}
