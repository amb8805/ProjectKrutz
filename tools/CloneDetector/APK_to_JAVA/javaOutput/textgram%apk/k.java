// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

// Referenced classes of package com.google.ads:
//            h, e

class k
    implements MediationInterstitialListener
{

    k(h h1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #15  <Field h a>
    //    5    9:return          
    }

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #15  <Field h a>
    //    7   11:invokevirtual   #23  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #15  <Field h a>
    //   10   18:invokevirtual   #28  <Method void com.google.ads.e.b(h)>
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

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, AdRequest.ErrorCode errorcode)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field h a>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:monitorenter    
    // try 7 70 handler(s) 102
    //    5    7:aload_1         
    //    6    8:aload_0         
    //    7    9:getfield        #15  <Field h a>
    //    8   12:invokevirtual   #34  <Method com.google.ads.mediation.MediationAdapter h.i()>
    //    9   15:invokestatic    #39  <Method void a.a(Object, Object)>
    //   10   18:new             #41  <Class StringBuilder>
    //   11   21:dup             
    //   12   22:invokespecial   #42  <Method void StringBuilder()>
    //   13   25:ldc1            #44  <String "Mediation adapter ">
    //   14   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   15   30:aload_1         
    //   16   31:invokevirtual   #52  <Method Class Object.getClass()>
    //   17   34:invokevirtual   #58  <Method String Class.getName()>
    //   18   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   19   40:ldc1            #60  <String " failed to receive ad with error code: ">
    //   20   42:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
    //   21   45:aload_2         
    //   22   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
    //   23   49:invokevirtual   #66  <Method String StringBuilder.toString()>
    //   24   52:invokestatic    #71  <Method void b.a(String)>
    //   25   55:aload_0         
    //   26   56:getfield        #15  <Field h a>
    //   27   59:invokevirtual   #75  <Method boolean h.c()>
    //   28   62:ifeq            73
    //   29   65:ldc1            #77  <String "Got an onFailedToReceiveAd() callback after loadAdTask is done from an interstitial adapter.  Ignoring callback.">
    //   30   67:invokestatic    #79  <Method void b.b(String)>
    // try 70 72 handler(s) 102
    //   31   70:aload_3         
    //   32   71:monitorexit     
    //   33   72:return          
    // try 73 91 handler(s) 102
    //   34   73:aload_0         
    //   35   74:getfield        #15  <Field h a>
    //   36   77:astore          5
    //   37   79:aload_2         
    //   38   80:getstatic       #85  <Field AdRequest$ErrorCode AdRequest$ErrorCode.NO_FILL>
    //   39   83:if_acmpne       109
    //   40   86:getstatic       #90  <Field g$a com.google.ads.g$a.b>
    //   41   89:astore          6
    // try 91 99 handler(s) 102
    //   42   91:aload           5
    //   43   93:iconst_0        
    //   44   94:aload           6
    //   45   96:invokevirtual   #93  <Method void com.google.ads.h.a(boolean, g$a)>
    //   46   99:goto            70
    // finally
    //   47  102:astore          4
    // try 104 106 handler(s) 102
    //   48  104:aload_3         
    //   49  105:monitorexit     
    //   50  106:aload           4
    //   51  108:athrow          
    // try 109 114 handler(s) 102
    //   52  109:getstatic       #95  <Field g$a g$a.c>
    //   53  112:astore          6
    //   54  114:goto            91
    }

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #15  <Field h a>
    //    7   11:invokevirtual   #23  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #15  <Field h a>
    //   10   18:invokevirtual   #98  <Method void e.c(h)>
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

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 24
    //    5    7:aload_0         
    //    6    8:getfield        #15  <Field h a>
    //    7   11:invokevirtual   #23  <Method e h.j()>
    //    8   14:aload_0         
    //    9   15:getfield        #15  <Field h a>
    //   10   18:invokevirtual   #101 <Method void com.google.ads.e.a(h)>
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

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field h a>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 33 handler(s) 50
    //    5    7:aload_1         
    //    6    8:aload_0         
    //    7    9:getfield        #15  <Field h a>
    //    8   12:invokevirtual   #34  <Method com.google.ads.mediation.MediationAdapter h.i()>
    //    9   15:invokestatic    #39  <Method void a.a(Object, Object)>
    //   10   18:aload_0         
    //   11   19:getfield        #15  <Field h a>
    //   12   22:invokevirtual   #75  <Method boolean h.c()>
    //   13   25:ifeq            36
    //   14   28:ldc1            #104 <String "Got an onReceivedAd() callback after loadAdTask is done from an interstitial adapter. Ignoring callback.">
    //   15   30:invokestatic    #107 <Method void b.e(String)>
    // try 33 35 handler(s) 50
    //   16   33:aload_2         
    //   17   34:monitorexit     
    //   18   35:return          
    // try 36 47 handler(s) 50
    //   19   36:aload_0         
    //   20   37:getfield        #15  <Field h a>
    //   21   40:iconst_1        
    //   22   41:getstatic       #109 <Field g$a com.google.ads.g$a.a>
    //   23   44:invokevirtual   #93  <Method void com.google.ads.h.a(boolean, g$a)>
    //   24   47:goto            33
    // finally
    //   25   50:astore_3        
    // try 51 53 handler(s) 50
    //   26   51:aload_2         
    //   27   52:monitorexit     
    //   28   53:aload_3         
    //   29   54:athrow          
    }

    private final h a;
}
