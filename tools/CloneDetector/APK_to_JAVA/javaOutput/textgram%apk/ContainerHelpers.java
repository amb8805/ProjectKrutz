// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;


class ContainerHelpers
{

    static 
    {
    //    0    0:iconst_0        
    //    1    1:newarray        int[]
    //    2    3:putstatic       #14  <Field int[] EMPTY_INTS>
    //    3    6:iconst_0        
    //    4    7:newarray        long[]
    //    5    9:putstatic       #16  <Field long[] EMPTY_LONGS>
    //    6   12:iconst_0        
    //    7   13:anewarray       Object[]
    //    8   16:putstatic       #18  <Field Object[] EMPTY_OBJECTS>
    //    9   19:return          
    }

    ContainerHelpers()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:return          
    }

    static int binarySearch(int ai[], int i, int j)
    {
    //    0    0:iconst_0        
    //    1    1:istore_3        
    //    2    2:iload_1         
    //    3    3:iconst_1        
    //    4    4:isub            
    //    5    5:istore          4
    //    6    7:iload_3         
    //    7    8:iload           4
    //    8   10:icmpgt          56
    //    9   13:iload_3         
    //   10   14:iload           4
    //   11   16:iadd            
    //   12   17:iconst_1        
    //   13   18:iushr           
    //   14   19:istore          5
    //   15   21:aload_0         
    //   16   22:iload           5
    //   17   24:iaload          
    //   18   25:istore          6
    //   19   27:iload           6
    //   20   29:iload_2         
    //   21   30:icmpge          41
    //   22   33:iload           5
    //   23   35:iconst_1        
    //   24   36:iadd            
    //   25   37:istore_3        
    //   26   38:goto            7
    //   27   41:iload           6
    //   28   43:iload_2         
    //   29   44:icmple          61
    //   30   47:iload           5
    //   31   49:iconst_1        
    //   32   50:isub            
    //   33   51:istore          4
    //   34   53:goto            7
    //   35   56:iload_3         
    //   36   57:iconst_m1       
    //   37   58:ixor            
    //   38   59:istore          5
    //   39   61:iload           5
    //   40   63:ireturn         
    }

    static int binarySearch(long al[], int i, long l)
    {
    //    0    0:iconst_0        
    //    1    1:istore          4
    //    2    3:iload_1         
    //    3    4:iconst_1        
    //    4    5:isub            
    //    5    6:istore          5
    //    6    8:iload           4
    //    7   10:iload           5
    //    8   12:icmpgt          62
    //    9   15:iload           4
    //   10   17:iload           5
    //   11   19:iadd            
    //   12   20:iconst_1        
    //   13   21:iushr           
    //   14   22:istore          6
    //   15   24:aload_0         
    //   16   25:iload           6
    //   17   27:laload          
    //   18   28:lstore          7
    //   19   30:lload           7
    //   20   32:lload_2         
    //   21   33:lcmp            
    //   22   34:ifge            46
    //   23   37:iload           6
    //   24   39:iconst_1        
    //   25   40:iadd            
    //   26   41:istore          4
    //   27   43:goto            8
    //   28   46:lload           7
    //   29   48:lload_2         
    //   30   49:lcmp            
    //   31   50:ifle            68
    //   32   53:iload           6
    //   33   55:iconst_1        
    //   34   56:isub            
    //   35   57:istore          5
    //   36   59:goto            8
    //   37   62:iload           4
    //   38   64:iconst_m1       
    //   39   65:ixor            
    //   40   66:istore          6
    //   41   68:iload           6
    //   42   70:ireturn         
    }

    public static boolean equal(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:if_acmpeq       17
    //    3    5:aload_0         
    //    4    6:ifnull          19
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:invokevirtual   #30  <Method boolean Object.equals(Object)>
    //    8   14:ifeq            19
    //    9   17:iconst_1        
    //   10   18:ireturn         
    //   11   19:iconst_0        
    //   12   20:ireturn         
    }

    public static int idealByteArraySize(int i)
    {
    //    0    0:iconst_4        
    //    1    1:istore_1        
    //    2    2:iload_1         
    //    3    3:bipush          32
    //    4    5:icmpge          25
    //    5    8:iload_0         
    //    6    9:bipush          -12
    //    7   11:iconst_1        
    //    8   12:iload_1         
    //    9   13:ishl            
    //   10   14:iadd            
    //   11   15:icmpgt          27
    //   12   18:bipush          -12
    //   13   20:iconst_1        
    //   14   21:iload_1         
    //   15   22:ishl            
    //   16   23:iadd            
    //   17   24:istore_0        
    //   18   25:iload_0         
    //   19   26:ireturn         
    //   20   27:iinc            1  1
    //   21   30:goto            2
    }

    public static int idealIntArraySize(int i)
    {
    //    0    0:iload_0         
    //    1    1:iconst_4        
    //    2    2:imul            
    //    3    3:invokestatic    #35  <Method int idealByteArraySize(int)>
    //    4    6:iconst_4        
    //    5    7:idiv            
    //    6    8:ireturn         
    }

    public static int idealLongArraySize(int i)
    {
    //    0    0:iload_0         
    //    1    1:bipush          8
    //    2    3:imul            
    //    3    4:invokestatic    #35  <Method int idealByteArraySize(int)>
    //    4    7:bipush          8
    //    5    9:idiv            
    //    6   10:ireturn         
    }

    static final int EMPTY_INTS[];
    static final long EMPTY_LONGS[];
    static final Object EMPTY_OBJECTS[];
}
