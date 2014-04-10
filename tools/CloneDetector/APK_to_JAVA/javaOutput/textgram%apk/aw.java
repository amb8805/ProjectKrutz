// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import org.json.JSONObject;

// Referenced classes of package com.applovin.impl.sdk:
//            ar, l, ax, AppLovinSdkImpl, 
//            ab, ac, k

abstract class aw extends ar
    implements l
{

    private aw(String s, int i, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_3         
    //    3    3:invokespecial   #17  <Method void ar(String, AppLovinSdkImpl)>
    //    4    6:aload_0         
    //    5    7:aconst_null     
    //    6    8:putfield        #19  <Field ab c>
    //    7   11:aload_0         
    //    8   12:iload_2         
    //    9   13:putfield        #21  <Field int a>
    //   10   16:aload_0         
    //   11   17:new             #23  <Class ax>
    //   12   20:dup             
    //   13   21:aload_0         
    //   14   22:aload_3         
    //   15   23:aload_1         
    //   16   24:invokespecial   #26  <Method void ax(aw, AppLovinSdkImpl, String)>
    //   17   27:putfield        #28  <Field l b>
    //   18   30:return          
    }

    aw(String s, ab ab1, AppLovinSdkImpl applovinsdkimpl)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_3         
    //    3    3:aload_2         
    //    4    4:invokevirtual   #34  <Method Object AppLovinSdkImpl.a(ab)>
    //    5    7:checkcast       #36  <Class Integer>
    //    6   10:invokevirtual   #40  <Method int Integer.intValue()>
    //    7   13:aload_3         
    //    8   14:invokespecial   #42  <Method void aw(String, int, AppLovinSdkImpl)>
    //    9   17:return          
    }

    static int a(aw aw1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field int a>
    //    2    4:ireturn         
    }

    static int a(aw aw1, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #21  <Field int a>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static int b(aw aw1, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field int a>
    //    2    4:iload_1         
    //    3    5:isub            
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:iload_2         
    //    7    9:putfield        #21  <Field int a>
    //    8   12:iload_2         
    //    9   13:ireturn         
    }

    private void b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field ab c>
    //    2    4:ifnull          34
    //    3    7:aload_0         
    //    4    8:getfield        #49  <Field AppLovinSdkImpl e>
    //    5   11:invokevirtual   #53  <Method ac AppLovinSdkImpl.getSettingsManager()>
    //    6   14:astore_1        
    //    7   15:aload_1         
    //    8   16:aload_0         
    //    9   17:getfield        #19  <Field ab c>
    //   10   20:aload_0         
    //   11   21:getfield        #19  <Field ab c>
    //   12   24:invokevirtual   #58  <Method Object ab.c()>
    //   13   27:invokevirtual   #63  <Method void ac.a(ab, Object)>
    //   14   30:aload_1         
    //   15   31:invokevirtual   #65  <Method void ac.b()>
    //   16   34:return          
    }

    static void b(aw aw1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #67  <Method void b()>
    //    2    4:return          
    }

    public void a(int i)
    {
    //    0    0:return          
    }

    public void a(ab ab1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #19  <Field ab c>
    //    3    5:return          
    }

    protected abstract void a(k k, l l1);

    public void a(JSONObject jsonobject, int i)
    {
    //    0    0:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #49  <Field AppLovinSdkImpl e>
    //    3    5:invokevirtual   #76  <Method k AppLovinSdkImpl.getConnectionManager()>
    //    4    8:aload_0         
    //    5    9:getfield        #28  <Field l b>
    //    6   12:invokevirtual   #78  <Method void a(k, l)>
    //    7   15:return          
    }

    private int a;
    private final l b;
    private ab c;
}
