// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;


public class ar
{

    public ar(byte abyte0[])
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:sipush          256
    //    4    8:newarray        byte[]
    //    5   10:putfield        #16  <Field byte[] a>
    //    6   13:iconst_0        
    //    7   14:istore_2        
    //    8   15:iload_2         
    //    9   16:sipush          256
    //   10   19:icmpge          36
    //   11   22:aload_0         
    //   12   23:getfield        #16  <Field byte[] a>
    //   13   26:iload_2         
    //   14   27:iload_2         
    //   15   28:int2byte        
    //   16   29:bastore         
    //   17   30:iinc            2  1
    //   18   33:goto            15
    //   19   36:iconst_0        
    //   20   37:istore_3        
    //   21   38:iconst_0        
    //   22   39:istore          4
    //   23   41:iload           4
    //   24   43:sipush          256
    //   25   46:icmpge          107
    //   26   49:sipush          255
    //   27   52:iload_3         
    //   28   53:aload_0         
    //   29   54:getfield        #16  <Field byte[] a>
    //   30   57:iload           4
    //   31   59:baload          
    //   32   60:iadd            
    //   33   61:aload_1         
    //   34   62:iload           4
    //   35   64:aload_1         
    //   36   65:arraylength     
    //   37   66:irem            
    //   38   67:baload          
    //   39   68:iadd            
    //   40   69:iand            
    //   41   70:istore_3        
    //   42   71:aload_0         
    //   43   72:getfield        #16  <Field byte[] a>
    //   44   75:iload           4
    //   45   77:baload          
    //   46   78:istore          5
    //   47   80:aload_0         
    //   48   81:getfield        #16  <Field byte[] a>
    //   49   84:iload           4
    //   50   86:aload_0         
    //   51   87:getfield        #16  <Field byte[] a>
    //   52   90:iload_3         
    //   53   91:baload          
    //   54   92:bastore         
    //   55   93:aload_0         
    //   56   94:getfield        #16  <Field byte[] a>
    //   57   97:iload_3         
    //   58   98:iload           5
    //   59  100:bastore         
    //   60  101:iinc            4  1
    //   61  104:goto            41
    //   62  107:aload_0         
    //   63  108:iconst_0        
    //   64  109:putfield        #18  <Field int b>
    //   65  112:aload_0         
    //   66  113:iconst_0        
    //   67  114:putfield        #20  <Field int c>
    //   68  117:return          
    }

    public void a(byte abyte0[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field int b>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #20  <Field int c>
    //    5    9:istore_3        
    //    6   10:iconst_0        
    //    7   11:istore          4
    //    8   13:iload           4
    //    9   15:aload_1         
    //   10   16:arraylength     
    //   11   17:icmpge          107
    //   12   20:sipush          255
    //   13   23:iload_2         
    //   14   24:iconst_1        
    //   15   25:iadd            
    //   16   26:iand            
    //   17   27:istore_2        
    //   18   28:sipush          255
    //   19   31:iload_3         
    //   20   32:aload_0         
    //   21   33:getfield        #16  <Field byte[] a>
    //   22   36:iload_2         
    //   23   37:baload          
    //   24   38:iadd            
    //   25   39:iand            
    //   26   40:istore_3        
    //   27   41:aload_0         
    //   28   42:getfield        #16  <Field byte[] a>
    //   29   45:iload_2         
    //   30   46:baload          
    //   31   47:istore          5
    //   32   49:aload_0         
    //   33   50:getfield        #16  <Field byte[] a>
    //   34   53:iload_2         
    //   35   54:aload_0         
    //   36   55:getfield        #16  <Field byte[] a>
    //   37   58:iload_3         
    //   38   59:baload          
    //   39   60:bastore         
    //   40   61:aload_0         
    //   41   62:getfield        #16  <Field byte[] a>
    //   42   65:iload_3         
    //   43   66:iload           5
    //   44   68:bastore         
    //   45   69:aload_1         
    //   46   70:iload           4
    //   47   72:aload_1         
    //   48   73:iload           4
    //   49   75:baload          
    //   50   76:aload_0         
    //   51   77:getfield        #16  <Field byte[] a>
    //   52   80:sipush          255
    //   53   83:aload_0         
    //   54   84:getfield        #16  <Field byte[] a>
    //   55   87:iload_2         
    //   56   88:baload          
    //   57   89:aload_0         
    //   58   90:getfield        #16  <Field byte[] a>
    //   59   93:iload_3         
    //   60   94:baload          
    //   61   95:iadd            
    //   62   96:iand            
    //   63   97:baload          
    //   64   98:ixor            
    //   65   99:int2byte        
    //   66  100:bastore         
    //   67  101:iinc            4  1
    //   68  104:goto            13
    //   69  107:aload_0         
    //   70  108:iload_2         
    //   71  109:putfield        #18  <Field int b>
    //   72  112:aload_0         
    //   73  113:iload_3         
    //   74  114:putfield        #20  <Field int c>
    //   75  117:return          
    }

    private final byte a[];
    private int b;
    private int c;
}
