// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.*;
import java.nio.ByteBuffer;
import java.security.*;

// Referenced classes of package com.google.ads:
//            ai, au, ag, aq, 
//            ar

public abstract class aj
    implements ai
{

    protected aj(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #23  <Field au c>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #25  <Field ByteArrayOutputStream d>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #27  <Field MotionEvent a>
    //   11   19:aload_0         
    //   12   20:aconst_null     
    //   13   21:putfield        #29  <Field DisplayMetrics b>
    // try 24 35 handler(s) 36
    //   14   24:aload_0         
    //   15   25:aload_1         
    //   16   26:invokevirtual   #35  <Method Resources Context.getResources()>
    //   17   29:invokevirtual   #41  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   18   32:putfield        #29  <Field DisplayMetrics b>
    //   19   35:return          
    // catch UnsupportedOperationException
    //   20   36:astore_2        
    //   21   37:aload_0         
    //   22   38:new             #43  <Class DisplayMetrics>
    //   23   41:dup             
    //   24   42:invokespecial   #44  <Method void DisplayMetrics()>
    //   25   45:putfield        #29  <Field DisplayMetrics b>
    //   26   48:aload_0         
    //   27   49:getfield        #29  <Field DisplayMetrics b>
    //   28   52:fconst_1        
    //   29   53:putfield        #48  <Field float DisplayMetrics.density>
    //   30   56:return          
    }

    private String a(Context context, String s, boolean flag)
    {
    // try 0 4 handler(s) 38 58 66
    //    0    0:aload_0         
    //    1    1:invokespecial   #57  <Method void a()>
    //    2    4:iload_3         
    //    3    5:ifeq            30
    // try 8 13 handler(s) 38 58 66
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokevirtual   #59  <Method void c(Context)>
    // try 13 30 handler(s) 38 58 66
    //    7   13:aload_0         
    //    8   14:invokespecial   #62  <Method byte[] b()>
    //    9   17:astore          7
    //   10   19:aload           7
    //   11   21:arraylength     
    //   12   22:ifne            46
    //   13   25:iconst_5        
    //   14   26:invokestatic    #68  <Method String Integer.toString(int)>
    //   15   29:areturn         
    // try 30 35 handler(s) 38 58 66
    //   16   30:aload_0         
    //   17   31:aload_1         
    //   18   32:invokevirtual   #70  <Method void b(Context)>
    //   19   35:goto            13
    // catch NoSuchAlgorithmException NoSuchAlgorithmException NoSuchAlgorithmException NoSuchAlgorithmException NoSuchAlgorithmException
    //   20   38:astore          6
    //   21   40:bipush          7
    //   22   42:invokestatic    #68  <Method String Integer.toString(int)>
    //   23   45:areturn         
    // try 46 55 handler(s) 38 58 66
    //   24   46:aload_0         
    //   25   47:aload           7
    //   26   49:aload_2         
    //   27   50:invokevirtual   #73  <Method String a(byte[], String)>
    //   28   53:astore          8
    //   29   55:aload           8
    //   30   57:areturn         
    // catch UnsupportedEncodingException UnsupportedEncodingException UnsupportedEncodingException UnsupportedEncodingException UnsupportedEncodingException
    //   31   58:astore          5
    //   32   60:bipush          7
    //   33   62:invokestatic    #68  <Method String Integer.toString(int)>
    //   34   65:areturn         
    // catch IOException IOException IOException IOException IOException
    //   35   66:astore          4
    //   36   68:iconst_3        
    //   37   69:invokestatic    #68  <Method String Integer.toString(int)>
    //   38   72:areturn         
    }

    private void a()
    {
    //    0    0:aload_0         
    //    1    1:new             #75  <Class ByteArrayOutputStream>
    //    2    4:dup             
    //    3    5:invokespecial   #76  <Method void ByteArrayOutputStream()>
    //    4    8:putfield        #25  <Field ByteArrayOutputStream d>
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #25  <Field ByteArrayOutputStream d>
    //    8   16:invokestatic    #81  <Method au au.a(java.io.OutputStream)>
    //    9   19:putfield        #23  <Field au c>
    //   10   22:return          
    }

    private byte[] b()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field au c>
    //    2    4:invokevirtual   #82  <Method void au.a()>
    //    3    7:aload_0         
    //    4    8:getfield        #25  <Field ByteArrayOutputStream d>
    //    5   11:invokevirtual   #85  <Method byte[] ByteArrayOutputStream.toByteArray()>
    //    6   14:areturn         
    }

    public String a(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:iconst_0        
    //    4    4:invokespecial   #88  <Method String a(Context, String, boolean)>
    //    5    7:areturn         
    }

    public String a(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_1        
    //    4    4:invokespecial   #88  <Method String a(Context, String, boolean)>
    //    5    7:areturn         
    }

    String a(byte abyte0[], String s)
        throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
    {
    //    0    0:aload_1         
    //    1    1:arraylength     
    //    2    2:sipush          239
    //    3    5:icmple          24
    //    4    8:aload_0         
    //    5    9:invokespecial   #57  <Method void a()>
    //    6   12:aload_0         
    //    7   13:bipush          20
    //    8   15:lconst_1        
    //    9   16:invokevirtual   #92  <Method void a(int, long)>
    //   10   19:aload_0         
    //   11   20:invokespecial   #62  <Method byte[] b()>
    //   12   23:astore_1        
    //   13   24:aload_1         
    //   14   25:arraylength     
    //   15   26:sipush          239
    //   16   29:icmpge          165
    //   17   32:sipush          239
    //   18   35:aload_1         
    //   19   36:arraylength     
    //   20   37:isub            
    //   21   38:newarray        byte[]
    //   22   40:astore          8
    //   23   42:new             #94  <Class SecureRandom>
    //   24   45:dup             
    //   25   46:invokespecial   #95  <Method void SecureRandom()>
    //   26   49:aload           8
    //   27   51:invokevirtual   #99  <Method void SecureRandom.nextBytes(byte[])>
    //   28   54:sipush          240
    //   29   57:invokestatic    #105 <Method ByteBuffer ByteBuffer.allocate(int)>
    //   30   60:aload_1         
    //   31   61:arraylength     
    //   32   62:int2byte        
    //   33   63:invokevirtual   #109 <Method ByteBuffer ByteBuffer.put(byte)>
    //   34   66:aload_1         
    //   35   67:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
    //   36   70:aload           8
    //   37   72:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
    //   38   75:invokevirtual   #115 <Method byte[] ByteBuffer.array()>
    //   39   78:astore_3        
    //   40   79:ldc1            #117 <String "MD5">
    //   41   81:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
    //   42   84:astore          4
    //   43   86:aload           4
    //   44   88:aload_3         
    //   45   89:invokevirtual   #126 <Method void MessageDigest.update(byte[])>
    //   46   92:aload           4
    //   47   94:invokevirtual   #129 <Method byte[] MessageDigest.digest()>
    //   48   97:astore          5
    //   49   99:sipush          256
    //   50  102:invokestatic    #105 <Method ByteBuffer ByteBuffer.allocate(int)>
    //   51  105:aload           5
    //   52  107:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
    //   53  110:aload_3         
    //   54  111:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
    //   55  114:invokevirtual   #115 <Method byte[] ByteBuffer.array()>
    //   56  117:astore          6
    //   57  119:sipush          256
    //   58  122:newarray        byte[]
    //   59  124:astore          7
    //   60  126:new             #131 <Class ag>
    //   61  129:dup             
    //   62  130:invokespecial   #132 <Method void ag()>
    //   63  133:aload           6
    //   64  135:aload           7
    //   65  137:invokevirtual   #135 <Method void ag.a(byte[], byte[])>
    //   66  140:aload_2         
    //   67  141:ifnull          158
    //   68  144:aload_2         
    //   69  145:invokevirtual   #141 <Method int String.length()>
    //   70  148:ifle            158
    //   71  151:aload_0         
    //   72  152:aload_2         
    //   73  153:aload           7
    //   74  155:invokevirtual   #144 <Method void a(String, byte[])>
    //   75  158:aload           7
    //   76  160:iconst_0        
    //   77  161:invokestatic    #149 <Method String aq.a(byte[], boolean)>
    //   78  164:areturn         
    //   79  165:sipush          240
    //   80  168:invokestatic    #105 <Method ByteBuffer ByteBuffer.allocate(int)>
    //   81  171:aload_1         
    //   82  172:arraylength     
    //   83  173:int2byte        
    //   84  174:invokevirtual   #109 <Method ByteBuffer ByteBuffer.put(byte)>
    //   85  177:aload_1         
    //   86  178:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[])>
    //   87  181:invokevirtual   #115 <Method byte[] ByteBuffer.array()>
    //   88  184:astore_3        
    //   89  185:goto            79
    }

    public void a(int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field MotionEvent a>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #27  <Field MotionEvent a>
    //    5   11:invokevirtual   #155 <Method void MotionEvent.recycle()>
    //    6   14:aload_0         
    //    7   15:lconst_0        
    //    8   16:iload_3         
    //    9   17:i2l             
    //   10   18:iconst_1        
    //   11   19:iload_1         
    //   12   20:i2f             
    //   13   21:aload_0         
    //   14   22:getfield        #29  <Field DisplayMetrics b>
    //   15   25:getfield        #48  <Field float DisplayMetrics.density>
    //   16   28:fmul            
    //   17   29:iload_2         
    //   18   30:i2f             
    //   19   31:aload_0         
    //   20   32:getfield        #29  <Field DisplayMetrics b>
    //   21   35:getfield        #48  <Field float DisplayMetrics.density>
    //   22   38:fmul            
    //   23   39:fconst_0        
    //   24   40:fconst_0        
    //   25   41:iconst_0        
    //   26   42:fconst_0        
    //   27   43:fconst_0        
    //   28   44:iconst_0        
    //   29   45:iconst_0        
    //   30   46:invokestatic    #159 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, float, float, int, float, float, int, int)>
    //   31   49:putfield        #27  <Field MotionEvent a>
    //   32   52:return          
    }

    protected void a(int i, long l)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field au c>
    //    2    4:iload_1         
    //    3    5:lload_2         
    //    4    6:invokevirtual   #160 <Method void au.a(int, long)>
    //    5    9:return          
    }

    protected void a(int i, String s)
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field au c>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #163 <Method void au.a(int, String)>
    //    5    9:return          
    }

    public void a(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #167 <Method int MotionEvent.getAction()>
    //    2    4:iconst_1        
    //    3    5:icmpne          30
    //    4    8:aload_0         
    //    5    9:getfield        #27  <Field MotionEvent a>
    //    6   12:ifnull          22
    //    7   15:aload_0         
    //    8   16:getfield        #27  <Field MotionEvent a>
    //    9   19:invokevirtual   #155 <Method void MotionEvent.recycle()>
    //   10   22:aload_0         
    //   11   23:aload_1         
    //   12   24:invokestatic    #170 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
    //   13   27:putfield        #27  <Field MotionEvent a>
    //   14   30:return          
    }

    void a(String s, byte abyte0[])
        throws UnsupportedEncodingException
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #141 <Method int String.length()>
    //    2    4:bipush          32
    //    3    6:icmple          17
    //    4    9:aload_1         
    //    5   10:iconst_0        
    //    6   11:bipush          32
    //    7   13:invokevirtual   #174 <Method String String.substring(int, int)>
    //    8   16:astore_1        
    //    9   17:new             #176 <Class ar>
    //   10   20:dup             
    //   11   21:aload_1         
    //   12   22:ldc1            #178 <String "UTF-8">
    //   13   24:invokevirtual   #182 <Method byte[] String.getBytes(String)>
    //   14   27:invokespecial   #184 <Method void ar(byte[])>
    //   15   30:aload_2         
    //   16   31:invokevirtual   #186 <Method void ar.a(byte[])>
    //   17   34:return          
    }

    protected abstract void b(Context context);

    protected abstract void c(Context context);

    protected MotionEvent a;
    protected DisplayMetrics b;
    private au c;
    private ByteArrayOutputStream d;
}
