// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.ads:
//            av

public final class au
{
    public static class a extends IOException
    {

        a()
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #8   <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
        //    2    3:invokespecial   #11  <Method void IOException(String)>
        //    3    6:return          
        }
    }


    private au(OutputStream outputstream, byte abyte0[])
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #19  <Field int d>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #21  <Field OutputStream e>
    //    8   14:aload_0         
    //    9   15:aload_2         
    //   10   16:putfield        #23  <Field byte[] a>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #25  <Field int c>
    //   14   24:aload_0         
    //   15   25:aload_2         
    //   16   26:arraylength     
    //   17   27:putfield        #27  <Field int b>
    //   18   30:return          
    }

    public static au a(OutputStream outputstream)
    {
    //    0    0:aload_0         
    //    1    1:sipush          4096
    //    2    4:invokestatic    #31  <Method au a(OutputStream, int)>
    //    3    7:areturn         
    }

    public static au a(OutputStream outputstream, int i)
    {
    //    0    0:new             #2   <Class au>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:newarray        byte[]
    //    5    8:invokespecial   #33  <Method void au(OutputStream, byte[])>
    //    6   11:areturn         
    }

    private void b()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field OutputStream e>
    //    2    4:ifnonnull       15
    //    3    7:new             #37  <Class au$a>
    //    4   10:dup             
    //    5   11:invokespecial   #38  <Method void au$a()>
    //    6   14:athrow          
    //    7   15:aload_0         
    //    8   16:getfield        #21  <Field OutputStream e>
    //    9   19:aload_0         
    //   10   20:getfield        #23  <Field byte[] a>
    //   11   23:iconst_0        
    //   12   24:aload_0         
    //   13   25:getfield        #25  <Field int c>
    //   14   28:invokevirtual   #44  <Method void OutputStream.write(byte[], int, int)>
    //   15   31:aload_0         
    //   16   32:iconst_0        
    //   17   33:putfield        #25  <Field int c>
    //   18   36:return          
    }

    public void a()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field OutputStream e>
    //    2    4:ifnull          11
    //    3    7:aload_0         
    //    4    8:invokespecial   #46  <Method void b()>
    //    5   11:return          
    }

    public void a(byte byte0)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field int c>
    //    2    4:aload_0         
    //    3    5:getfield        #27  <Field int b>
    //    4    8:icmpne          15
    //    5   11:aload_0         
    //    6   12:invokespecial   #46  <Method void b()>
    //    7   15:aload_0         
    //    8   16:getfield        #23  <Field byte[] a>
    //    9   19:astore_2        
    //   10   20:aload_0         
    //   11   21:getfield        #25  <Field int c>
    //   12   24:istore_3        
    //   13   25:aload_0         
    //   14   26:iload_3         
    //   15   27:iconst_1        
    //   16   28:iadd            
    //   17   29:putfield        #25  <Field int c>
    //   18   32:aload_2         
    //   19   33:iload_3         
    //   20   34:iload_1         
    //   21   35:bastore         
    //   22   36:aload_0         
    //   23   37:iconst_1        
    //   24   38:aload_0         
    //   25   39:getfield        #19  <Field int d>
    //   26   42:iadd            
    //   27   43:putfield        #19  <Field int d>
    //   28   46:return          
    }

    public void a(int i)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:int2byte        
    //    3    3:invokevirtual   #50  <Method void a(byte)>
    //    4    6:return          
    }

    public void a(int i, int j)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #56  <Method int av.a(int, int)>
    //    4    6:invokevirtual   #58  <Method void b(int)>
    //    5    9:return          
    }

    public void a(int i, long l)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #61  <Method void a(int, int)>
    //    4    6:aload_0         
    //    5    7:lload_2         
    //    6    8:invokevirtual   #64  <Method void a(long)>
    //    7   11:return          
    }

    public void a(int i, String s)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_2        
    //    3    3:invokevirtual   #61  <Method void a(int, int)>
    //    4    6:aload_0         
    //    5    7:aload_2         
    //    6    8:invokevirtual   #68  <Method void a(String)>
    //    7   11:return          
    }

    public void a(long l)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokevirtual   #70  <Method void b(long)>
    //    3    5:return          
    }

    public void a(String s)
        throws IOException
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #72  <String "UTF-8">
    //    2    3:invokevirtual   #78  <Method byte[] String.getBytes(String)>
    //    3    6:astore_2        
    //    4    7:aload_0         
    //    5    8:aload_2         
    //    6    9:arraylength     
    //    7   10:invokevirtual   #58  <Method void b(int)>
    //    8   13:aload_0         
    //    9   14:aload_2         
    //   10   15:invokevirtual   #81  <Method void a(byte[])>
    //   11   18:return          
    }

    public void a(byte abyte0[])
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:aload_1         
    //    4    4:arraylength     
    //    5    5:invokevirtual   #83  <Method void a(byte[], int, int)>
    //    6    8:return          
    }

    public void a(byte abyte0[], int i, int j)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field int b>
    //    2    4:aload_0         
    //    3    5:getfield        #25  <Field int c>
    //    4    8:isub            
    //    5    9:iload_3         
    //    6   10:icmplt          48
    //    7   13:aload_1         
    //    8   14:iload_2         
    //    9   15:aload_0         
    //   10   16:getfield        #23  <Field byte[] a>
    //   11   19:aload_0         
    //   12   20:getfield        #25  <Field int c>
    //   13   23:iload_3         
    //   14   24:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   15   27:aload_0         
    //   16   28:iload_3         
    //   17   29:aload_0         
    //   18   30:getfield        #25  <Field int c>
    //   19   33:iadd            
    //   20   34:putfield        #25  <Field int c>
    //   21   37:aload_0         
    //   22   38:iload_3         
    //   23   39:aload_0         
    //   24   40:getfield        #19  <Field int d>
    //   25   43:iadd            
    //   26   44:putfield        #19  <Field int d>
    //   27   47:return          
    //   28   48:aload_0         
    //   29   49:getfield        #27  <Field int b>
    //   30   52:aload_0         
    //   31   53:getfield        #25  <Field int c>
    //   32   56:isub            
    //   33   57:istore          4
    //   34   59:aload_1         
    //   35   60:iload_2         
    //   36   61:aload_0         
    //   37   62:getfield        #23  <Field byte[] a>
    //   38   65:aload_0         
    //   39   66:getfield        #25  <Field int c>
    //   40   69:iload           4
    //   41   71:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   42   74:iload_2         
    //   43   75:iload           4
    //   44   77:iadd            
    //   45   78:istore          5
    //   46   80:iload_3         
    //   47   81:iload           4
    //   48   83:isub            
    //   49   84:istore          6
    //   50   86:aload_0         
    //   51   87:aload_0         
    //   52   88:getfield        #27  <Field int b>
    //   53   91:putfield        #25  <Field int c>
    //   54   94:aload_0         
    //   55   95:iload           4
    //   56   97:aload_0         
    //   57   98:getfield        #19  <Field int d>
    //   58  101:iadd            
    //   59  102:putfield        #19  <Field int d>
    //   60  105:aload_0         
    //   61  106:invokespecial   #46  <Method void b()>
    //   62  109:iload           6
    //   63  111:aload_0         
    //   64  112:getfield        #27  <Field int b>
    //   65  115:icmpgt          149
    //   66  118:aload_1         
    //   67  119:iload           5
    //   68  121:aload_0         
    //   69  122:getfield        #23  <Field byte[] a>
    //   70  125:iconst_0        
    //   71  126:iload           6
    //   72  128:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
    //   73  131:aload_0         
    //   74  132:iload           6
    //   75  134:putfield        #25  <Field int c>
    //   76  137:aload_0         
    //   77  138:iload           6
    //   78  140:aload_0         
    //   79  141:getfield        #19  <Field int d>
    //   80  144:iadd            
    //   81  145:putfield        #19  <Field int d>
    //   82  148:return          
    //   83  149:aload_0         
    //   84  150:getfield        #21  <Field OutputStream e>
    //   85  153:aload_1         
    //   86  154:iload           5
    //   87  156:iload           6
    //   88  158:invokevirtual   #44  <Method void OutputStream.write(byte[], int, int)>
    //   89  161:goto            137
    }

    public void b(int i)
        throws IOException
    {
    //    0    0:iload_1         
    //    1    1:bipush          -128
    //    2    3:iand            
    //    3    4:ifne            13
    //    4    7:aload_0         
    //    5    8:iload_1         
    //    6    9:invokevirtual   #91  <Method void a(int)>
    //    7   12:return          
    //    8   13:aload_0         
    //    9   14:sipush          128
    //   10   17:iload_1         
    //   11   18:bipush          127
    //   12   20:iand            
    //   13   21:ior             
    //   14   22:invokevirtual   #91  <Method void a(int)>
    //   15   25:iload_1         
    //   16   26:bipush          7
    //   17   28:iushr           
    //   18   29:istore_1        
    //   19   30:goto            0
    }

    public void b(long l)
        throws IOException
    {
    //    0    0:ldc2w           #92  <Long -128L>
    //    1    3:lload_1         
    //    2    4:land            
    //    3    5:lconst_0        
    //    4    6:lcmp            
    //    5    7:ifne            17
    //    6   10:aload_0         
    //    7   11:lload_1         
    //    8   12:l2i             
    //    9   13:invokevirtual   #91  <Method void a(int)>
    //   10   16:return          
    //   11   17:aload_0         
    //   12   18:sipush          128
    //   13   21:bipush          127
    //   14   23:lload_1         
    //   15   24:l2i             
    //   16   25:iand            
    //   17   26:ior             
    //   18   27:invokevirtual   #91  <Method void a(int)>
    //   19   30:lload_1         
    //   20   31:bipush          7
    //   21   33:lushr           
    //   22   34:lstore_1        
    //   23   35:goto            0
    }

    private final byte a[];
    private final int b;
    private int c;
    private int d;
    private final OutputStream e;
}
