// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import java.nio.ByteBuffer;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.ads:
//            ap, aq

public class an
{
    public static class a extends Exception
    {

        public a()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Exception()>
        //    2    4:return          
        }

        public a(Throwable throwable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void Exception(Throwable)>
        //    3    5:return          
        }
    }


    static void a(byte abyte0[])
    {
    //    0    0:iconst_0        
    //    1    1:istore_1        
    //    2    2:iload_1         
    //    3    3:aload_0         
    //    4    4:arraylength     
    //    5    5:icmpge          24
    //    6    8:aload_0         
    //    7    9:iload_1         
    //    8   10:bipush          68
    //    9   12:aload_0         
    //   10   13:iload_1         
    //   11   14:baload          
    //   12   15:ixor            
    //   13   16:int2byte        
    //   14   17:bastore         
    //   15   18:iinc            1  1
    //   16   21:goto            2
    //   17   24:return          
    }

    public static byte[] a(String s)
        throws ap, a
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #15  <Method byte[] aq.a(String)>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:arraylength     
    //    5    7:bipush          32
    //    6    9:icmpeq          20
    //    7   12:new             #11  <Class an$a>
    //    8   15:dup             
    //    9   16:invokespecial   #19  <Method void an$a()>
    //   10   19:athrow          
    //   11   20:aload_1         
    //   12   21:iconst_4        
    //   13   22:bipush          16
    //   14   24:invokestatic    #25  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
    //   15   27:astore_2        
    //   16   28:bipush          16
    //   17   30:newarray        byte[]
    //   18   32:astore_3        
    //   19   33:aload_2         
    //   20   34:aload_3         
    //   21   35:invokevirtual   #29  <Method ByteBuffer ByteBuffer.get(byte[])>
    //   22   38:pop             
    //   23   39:aload_3         
    //   24   40:invokestatic    #31  <Method void a(byte[])>
    //   25   43:aload_3         
    //   26   44:areturn         
    }

    public static byte[] a(byte abyte0[], String s)
        throws a, ap
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:bipush          16
    //    3    4:icmpeq          15
    //    4    7:new             #11  <Class an$a>
    //    5   10:dup             
    //    6   11:invokespecial   #19  <Method void an$a()>
    //    7   14:athrow          
    // try 15 37 handler(s) 37 151 163 175 187 197
    //    8   15:aload_1         
    //    9   16:invokestatic    #15  <Method byte[] aq.a(String)>
    //   10   19:astore          8
    //   11   21:aload           8
    //   12   23:arraylength     
    //   13   24:bipush          16
    //   14   26:icmpgt          49
    //   15   29:new             #11  <Class an$a>
    //   16   32:dup             
    //   17   33:invokespecial   #19  <Method void an$a()>
    //   18   36:athrow          
    // catch NoSuchAlgorithmException NoSuchAlgorithmException
    //   19   37:astore          7
    //   20   39:new             #11  <Class an$a>
    //   21   42:dup             
    //   22   43:aload           7
    //   23   45:invokespecial   #47  <Method void an$a(Throwable)>
    //   24   48:athrow          
    // try 49 148 handler(s) 37 151 163 175 187 197
    //   25   49:aload           8
    //   26   51:arraylength     
    //   27   52:invokestatic    #51  <Method ByteBuffer ByteBuffer.allocate(int)>
    //   28   55:astore          9
    //   29   57:aload           9
    //   30   59:aload           8
    //   31   61:invokevirtual   #54  <Method ByteBuffer ByteBuffer.put(byte[])>
    //   32   64:pop             
    //   33   65:aload           9
    //   34   67:invokevirtual   #58  <Method java.nio.Buffer ByteBuffer.flip()>
    //   35   70:pop             
    //   36   71:bipush          16
    //   37   73:newarray        byte[]
    //   38   75:astore          12
    //   39   77:bipush          -16
    //   40   79:aload           8
    //   41   81:arraylength     
    //   42   82:iadd            
    //   43   83:newarray        byte[]
    //   44   85:astore          13
    //   45   87:aload           9
    //   46   89:aload           12
    //   47   91:invokevirtual   #29  <Method ByteBuffer ByteBuffer.get(byte[])>
    //   48   94:pop             
    //   49   95:aload           9
    //   50   97:aload           13
    //   51   99:invokevirtual   #29  <Method ByteBuffer ByteBuffer.get(byte[])>
    //   52  102:pop             
    //   53  103:new             #60  <Class SecretKeySpec>
    //   54  106:dup             
    //   55  107:aload_0         
    //   56  108:ldc1            #62  <String "AES">
    //   57  110:invokespecial   #65  <Method void SecretKeySpec(byte[], String)>
    //   58  113:astore          16
    //   59  115:ldc1            #67  <String "AES/CBC/PKCS5Padding">
    //   60  117:invokestatic    #73  <Method Cipher Cipher.getInstance(String)>
    //   61  120:astore          17
    //   62  122:aload           17
    //   63  124:iconst_2        
    //   64  125:aload           16
    //   65  127:new             #75  <Class IvParameterSpec>
    //   66  130:dup             
    //   67  131:aload           12
    //   68  133:invokespecial   #77  <Method void IvParameterSpec(byte[])>
    //   69  136:invokevirtual   #81  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
    //   70  139:aload           17
    //   71  141:aload           13
    //   72  143:invokevirtual   #85  <Method byte[] Cipher.doFinal(byte[])>
    //   73  146:astore          18
    //   74  148:aload           18
    //   75  150:areturn         
    // catch InvalidKeyException InvalidKeyException
    //   76  151:astore          6
    //   77  153:new             #11  <Class an$a>
    //   78  156:dup             
    //   79  157:aload           6
    //   80  159:invokespecial   #47  <Method void an$a(Throwable)>
    //   81  162:athrow          
    // catch IllegalBlockSizeException IllegalBlockSizeException
    //   82  163:astore          5
    //   83  165:new             #11  <Class an$a>
    //   84  168:dup             
    //   85  169:aload           5
    //   86  171:invokespecial   #47  <Method void an$a(Throwable)>
    //   87  174:athrow          
    // catch NoSuchPaddingException NoSuchPaddingException
    //   88  175:astore          4
    //   89  177:new             #11  <Class an$a>
    //   90  180:dup             
    //   91  181:aload           4
    //   92  183:invokespecial   #47  <Method void an$a(Throwable)>
    //   93  186:athrow          
    // catch BadPaddingException BadPaddingException
    //   94  187:astore_3        
    //   95  188:new             #11  <Class an$a>
    //   96  191:dup             
    //   97  192:aload_3         
    //   98  193:invokespecial   #47  <Method void an$a(Throwable)>
    //   99  196:athrow          
    // catch InvalidAlgorithmParameterException InvalidAlgorithmParameterException
    //  100  197:astore_2        
    //  101  198:new             #11  <Class an$a>
    //  102  201:dup             
    //  103  202:aload_2         
    //  104  203:invokespecial   #47  <Method void an$a(Throwable)>
    //  105  206:athrow          
    }
}
