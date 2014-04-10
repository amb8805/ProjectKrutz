// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

// Referenced classes of package com.google.ads:
//            h, e

class j
    implements MediationBannerListener
{

    public j(h h1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #17  <Field h a>
    //    5    9:return          
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 37 handler(s) 38
    //    5    7:aload_0         
    //    6    8:getfield        #17  <Field h a>
    //    7   11:invokevirtual   #25  <Method boolean h.c()>
    //    8   14:invokestatic    #30  <Method void a.a(boolean)>
    //    9   17:aload_0         
    //   10   18:getfield        #17  <Field h a>
    //   11   21:invokevirtual   #34  <Method e h.j()>
    //   12   24:aload_0         
    //   13   25:getfield        #17  <Field h a>
    //   14   28:aload_0         
    //   15   29:getfield        #36  <Field boolean b>
    //   16   32:invokevirtual   #41  <Method void com.google.ads.e.a(h, boolean)>
    //   17   35:aload_2         
    //   18   36:monitorexit     
    //   19   37:return          
    // finally
    //   20   38:astore_3        
    // try 39 41 handler(s) 38
    //   21   39:aload_2         
    //   22   40:monitorexit     
    //   23   41:aload_3         
    //   24   42:athrow          
    }

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #17  <Field h a>
    //    7   11:invokevirtual   #34  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #17  <Field h a>
    //   10   18:invokevirtual   #44  <Method void com.google.ads.e.b(h)>
    //   11   21:aload_2         
    //   12   22:monitorexit     
    //   13   23:return          
    // finally
    //   14   24:astore_3        
    // try 25 27 handler(s) 24
    //   15   25:aload_2         
    //   16   26:monitorexit     
    //   17   27:aload_3         
    //   18   28:athrow          
    }

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, AdRequest.ErrorCode errorcode)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:monitorenter    
    // try 7 83 handler(s) 102
    //    5    7:aload_1         
    //    6    8:aload_0         
    //    7    9:getfield        #17  <Field h a>
    //    8   12:invokevirtual   #50  <Method com.google.ads.mediation.MediationAdapter h.i()>
    //    9   15:invokestatic    #53  <Method void a.a(Object, Object)>
    //   10   18:new             #55  <Class StringBuilder>
    //   11   21:dup             
    //   12   22:invokespecial   #56  <Method void StringBuilder()>
    //   13   25:ldc1            #58  <String "Mediation adapter ">
    //   14   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   15   30:aload_1         
    //   16   31:invokevirtual   #66  <Method Class Object.getClass()>
    //   17   34:invokevirtual   #72  <Method String Class.getName()>
    //   18   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   19   40:ldc1            #74  <String " failed to receive ad with error code: ">
    //   20   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   21   45:aload_2         
    //   22   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
    //   23   49:invokevirtual   #80  <Method String StringBuilder.toString()>
    //   24   52:invokestatic    #85  <Method void b.a(String)>
    //   25   55:aload_0         
    //   26   56:getfield        #17  <Field h a>
    //   27   59:invokevirtual   #25  <Method boolean h.c()>
    //   28   62:ifne            91
    //   29   65:aload_0         
    //   30   66:getfield        #17  <Field h a>
    //   31   69:astore          5
    //   32   71:aload_2         
    //   33   72:getstatic       #91  <Field AdRequest$ErrorCode AdRequest$ErrorCode.NO_FILL>
    //   34   75:if_acmpne       94
    //   35   78:getstatic       #96  <Field g$a com.google.ads.g$a.b>
    //   36   81:astore          6
    // try 83 91 handler(s) 102
    //   37   83:aload           5
    //   38   85:iconst_0        
    //   39   86:aload           6
    //   40   88:invokevirtual   #99  <Method void com.google.ads.h.a(boolean, g$a)>
    // try 91 93 handler(s) 102
    //   41   91:aload_3         
    //   42   92:monitorexit     
    //   43   93:return          
    // try 94 99 handler(s) 102
    //   44   94:getstatic       #101 <Field g$a g$a.c>
    //   45   97:astore          6
    //   46   99:goto            83
    // finally
    //   47  102:astore          4
    // try 104 106 handler(s) 102
    //   48  104:aload_3         
    //   49  105:monitorexit     
    //   50  106:aload           4
    //   51  108:athrow          
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #17  <Field h a>
    //    7   11:invokevirtual   #34  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #17  <Field h a>
    //   10   18:invokevirtual   #104 <Method void e.c(h)>
    //   11   21:aload_2         
    //   12   22:monitorexit     
    //   13   23:return          
    // finally
    //   14   24:astore_3        
    // try 25 27 handler(s) 24
    //   15   25:aload_2         
    //   16   26:monitorexit     
    //   17   27:aload_3         
    //   18   28:athrow          
    }

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #17  <Field h a>
    //    7   11:invokevirtual   #34  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #17  <Field h a>
    //   10   18:invokevirtual   #107 <Method void com.google.ads.e.a(h)>
    //   11   21:aload_2         
    //   12   22:monitorexit     
    //   13   23:return          
    // finally
    //   14   24:astore_3        
    // try 25 27 handler(s) 24
    //   15   25:aload_2         
    //   16   26:monitorexit     
    //   17   27:aload_3         
    //   18   28:athrow          
    }

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 18 handler(s) 121
    //    5    7:aload_1         
    //    6    8:aload_0         
    //    7    9:getfield        #17  <Field h a>
    //    8   12:invokevirtual   #50  <Method com.google.ads.mediation.MediationAdapter h.i()>
    //    9   15:invokestatic    #53  <Method void a.a(Object, Object)>
    // try 18 31 handler(s) 60 121
    //   10   18:aload_0         
    //   11   19:getfield        #17  <Field h a>
    //   12   22:aload_1         
    //   13   23:invokeinterface #116 <Method android.view.View MediationBannerAdapter.getBannerView()>
    //   14   28:invokevirtual   #119 <Method void com.google.ads.h.a(android.view.View)>
    // try 31 59 handler(s) 121
    //   15   31:aload_0         
    //   16   32:getfield        #17  <Field h a>
    //   17   35:invokevirtual   #25  <Method boolean h.c()>
    //   18   38:ifne            126
    //   19   41:aload_0         
    //   20   42:iconst_0        
    //   21   43:putfield        #36  <Field boolean b>
    //   22   46:aload_0         
    //   23   47:getfield        #17  <Field h a>
    //   24   50:iconst_1        
    //   25   51:getstatic       #121 <Field g$a com.google.ads.g$a.a>
    //   26   54:invokevirtual   #99  <Method void com.google.ads.h.a(boolean, g$a)>
    //   27   57:aload_2         
    //   28   58:monitorexit     
    //   29   59:return          
    // catch Throwable
    //   30   60:astore          4
    // try 62 118 handler(s) 121
    //   31   62:new             #55  <Class StringBuilder>
    //   32   65:dup             
    //   33   66:invokespecial   #56  <Method void StringBuilder()>
    //   34   69:ldc1            #123 <String "Error while getting banner View from adapter (">
    //   35   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   36   74:aload_0         
    //   37   75:getfield        #17  <Field h a>
    //   38   78:invokevirtual   #126 <Method String h.h()>
    //   39   81:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   40   84:ldc1            #128 <String "): ">
    //   41   86:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
    //   42   89:invokevirtual   #80  <Method String StringBuilder.toString()>
    //   43   92:aload           4
    //   44   94:invokestatic    #131 <Method void b.b(String, Throwable)>
    //   45   97:aload_0         
    //   46   98:getfield        #17  <Field h a>
    //   47  101:invokevirtual   #25  <Method boolean h.c()>
    //   48  104:ifne            118
    //   49  107:aload_0         
    //   50  108:getfield        #17  <Field h a>
    //   51  111:iconst_0        
    //   52  112:getstatic       #134 <Field g$a g$a.f>
    //   53  115:invokevirtual   #99  <Method void com.google.ads.h.a(boolean, g$a)>
    // try 118 120 handler(s) 121
    //   54  118:aload_2         
    //   55  119:monitorexit     
    //   56  120:return          
    // finally
    //   57  121:astore_3        
    // try 122 124 handler(s) 121
    //   58  122:aload_2         
    //   59  123:monitorexit     
    //   60  124:aload_3         
    //   61  125:athrow          
    // try 126 154 handler(s) 121
    //   62  126:aload_0         
    //   63  127:iconst_1        
    //   64  128:putfield        #36  <Field boolean b>
    //   65  131:aload_0         
    //   66  132:getfield        #17  <Field h a>
    //   67  135:invokevirtual   #34  <Method e h.j()>
    //   68  138:aload_0         
    //   69  139:getfield        #17  <Field h a>
    //   70  142:aload_0         
    //   71  143:getfield        #17  <Field h a>
    //   72  146:invokevirtual   #136 <Method android.view.View h.f()>
    //   73  149:invokevirtual   #139 <Method void com.google.ads.e.a(h, android.view.View)>
    //   74  152:aload_2         
    //   75  153:monitorexit     
    //   76  154:return          
    }

    private final h a;
    private boolean b;
}
