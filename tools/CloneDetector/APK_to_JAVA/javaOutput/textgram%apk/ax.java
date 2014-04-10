// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.applovin.impl.sdk:
//            l, aw, z, AppLovinSdkImpl, 
//            aq, ap

class ax
    implements l
{

    ax(aw aw1, AppLovinSdkImpl applovinsdkimpl, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #16  <Field aw c>
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:putfield        #18  <Field AppLovinSdkImpl a>
    //    6   10:aload_0         
    //    7   11:aload_3         
    //    8   12:putfield        #20  <Field String b>
    //    9   15:aload_0         
    //   10   16:invokespecial   #23  <Method void Object()>
    //   11   19:return          
    }

    public void a(int i)
    {
    //    0    0:iload_1         
    //    1    1:sipush          200
    //    2    4:icmplt          14
    //    3    7:iload_1         
    //    4    8:sipush          500
    //    5   11:icmplt          170
    //    6   14:iconst_1        
    //    7   15:istore_2        
    //    8   16:iconst_0        
    //    9   17:istore_3        
    //   10   18:iload_1         
    //   11   19:bipush          -103
    //   12   21:icmpeq          26
    //   13   24:iconst_1        
    //   14   25:istore_3        
    //   15   26:iload_2         
    //   16   27:ifeq            175
    //   17   30:iload_3         
    //   18   31:ifeq            175
    //   19   34:aload_0         
    //   20   35:getfield        #16  <Field aw c>
    //   21   38:invokestatic    #29  <Method int aw.a(aw)>
    //   22   41:ifle            175
    //   23   44:aload_0         
    //   24   45:getfield        #18  <Field AppLovinSdkImpl a>
    //   25   48:getstatic       #35  <Field ab z.p>
    //   26   51:invokevirtual   #40  <Method Object AppLovinSdkImpl.a(ab)>
    //   27   54:checkcast       #42  <Class Long>
    //   28   57:invokevirtual   #46  <Method long Long.longValue()>
    //   29   60:lstore          4
    //   30   62:aload_0         
    //   31   63:getfield        #20  <Field String b>
    //   32   66:new             #48  <Class StringBuilder>
    //   33   69:dup             
    //   34   70:invokespecial   #49  <Method void StringBuilder()>
    //   35   73:ldc1            #51  <String "Unable to send requset due to server failure (code ">
    //   36   75:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
    //   37   78:iload_1         
    //   38   79:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
    //   39   82:ldc1            #60  <String "). ">
    //   40   84:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
    //   41   87:aload_0         
    //   42   88:getfield        #16  <Field aw c>
    //   43   91:invokestatic    #29  <Method int aw.a(aw)>
    //   44   94:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
    //   45   97:ldc1            #62  <String " attempts left, retrying in ">
    //   46   99:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
    //   47  102:lload           4
    //   48  104:l2d             
    //   49  105:ldc2w           #63  <Double 1000D>
    //   50  108:ddiv            
    //   51  109:invokevirtual   #67  <Method StringBuilder StringBuilder.append(double)>
    //   52  112:ldc1            #69  <String " seconds...">
    //   53  114:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
    //   54  117:invokevirtual   #73  <Method String StringBuilder.toString()>
    //   55  120:invokestatic    #79  <Method int Log.w(String, String)>
    //   56  123:pop             
    //   57  124:aload_0         
    //   58  125:getfield        #16  <Field aw c>
    //   59  128:iconst_1        
    //   60  129:invokestatic    #82  <Method int aw.b(aw, int)>
    //   61  132:pop             
    //   62  133:aload_0         
    //   63  134:getfield        #16  <Field aw c>
    //   64  137:invokestatic    #29  <Method int aw.a(aw)>
    //   65  140:ifne            150
    //   66  143:aload_0         
    //   67  144:getfield        #16  <Field aw c>
    //   68  147:invokestatic    #85  <Method void aw.b(aw)>
    //   69  150:aload_0         
    //   70  151:getfield        #18  <Field AppLovinSdkImpl a>
    //   71  154:invokevirtual   #88  <Method ap AppLovinSdkImpl.a()>
    //   72  157:aload_0         
    //   73  158:getfield        #16  <Field aw c>
    //   74  161:getstatic       #93  <Field aq aq.b>
    //   75  164:lload           4
    //   76  166:invokevirtual   #98  <Method void ap.a(ar, aq, long)>
    //   77  169:return          
    //   78  170:iconst_0        
    //   79  171:istore_2        
    //   80  172:goto            16
    //   81  175:aload_0         
    //   82  176:getfield        #16  <Field aw c>
    //   83  179:iload_1         
    //   84  180:invokevirtual   #100 <Method void aw.a(int)>
    //   85  183:return          
    }

    public void a(JSONObject jsonobject, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field aw c>
    //    2    4:iconst_0        
    //    3    5:invokestatic    #103 <Method int aw.a(aw, int)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:getfield        #16  <Field aw c>
    //    7   13:aload_1         
    //    8   14:iload_2         
    //    9   15:invokevirtual   #105 <Method void aw.a(JSONObject, int)>
    //   10   18:return          
    }

    final AppLovinSdkImpl a;
    final String b;
    final aw c;
}
