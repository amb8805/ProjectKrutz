// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.g;
import com.google.ads.mediation.*;
import com.google.ads.util.a;
import com.google.ads.util.b;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventExtras, CustomEventServerParameters, 
//            CustomEventBannerListener, CustomEventInterstitialListener

public class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private class a
        implements CustomEventBannerListener
    {

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field CustomEventAdapter a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #21  <Field MediationBannerListener c>
        //    8   14:return          
        }

        private String b()
        {
        //    0    0:new             #24  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void StringBuilder()>
        //    3    7:ldc1            #27  <String "Banner custom event labeled '">
        //    4    9:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_0         
        //    6   13:getfield        #16  <Field CustomEventAdapter a>
        //    7   16:invokestatic    #36  <Method String com.google.ads.mediation.customevent.CustomEventAdapter.a(CustomEventAdapter)>
        //    8   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:ldc1            #38  <String "'">
        //   10   24:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:invokevirtual   #41  <Method String StringBuilder.toString()>
        //   12   30:areturn         
        }

        public View a()
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 7 handler(s) 11
        //    2    2:aload_0         
        //    3    3:getfield        #44  <Field View b>
        //    4    6:astore_2        
        //    5    7:aload_0         
        //    6    8:monitorexit     
        //    7    9:aload_2         
        //    8   10:areturn         
        // finally
        //    9   11:astore_1        
        //   10   12:aload_0         
        //   11   13:monitorexit     
        //   12   14:aload_1         
        //   13   15:athrow          
        }

        public void onClick()
        {
        //    0    0:new             #24  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #47  <Method String b()>
        //    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #49  <String " called onClick().">
        //    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #41  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #54  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #21  <Field MediationBannerListener c>
        //   12   29:aload_0         
        //   13   30:getfield        #16  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #59  <Method void MediationBannerListener.onClick(MediationBannerAdapter)>
        //   15   38:return          
        }

        public void onDismissScreen()
        {
        //    0    0:new             #24  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #47  <Method String b()>
        //    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #62  <String " called onDismissScreen().">
        //    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #41  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #54  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #21  <Field MediationBannerListener c>
        //   12   29:aload_0         
        //   13   30:getfield        #16  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #64  <Method void MediationBannerListener.onDismissScreen(MediationBannerAdapter)>
        //   15   38:return          
        }

        public void onFailedToReceiveAd()
        {
        //    0    0:new             #24  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #47  <Method String b()>
        //    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #67  <String " called onFailedToReceiveAd().">
        //    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #41  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #54  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #21  <Field MediationBannerListener c>
        //   12   29:aload_0         
        //   13   30:getfield        #16  <Field CustomEventAdapter a>
        //   14   33:getstatic       #73  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.NO_FILL>
        //   15   36:invokeinterface #76  <Method void MediationBannerListener.onFailedToReceiveAd(MediationBannerAdapter, com.google.ads.AdRequest$ErrorCode)>
        //   16   41:return          
        }

        public void onLeaveApplication()
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 40 handler(s) 43
        //    2    2:new             #24  <Class StringBuilder>
        //    3    5:dup             
        //    4    6:invokespecial   #25  <Method void StringBuilder()>
        //    5    9:aload_0         
        //    6   10:invokespecial   #47  <Method String b()>
        //    7   13:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   16:ldc1            #79  <String " called onLeaveApplication().">
        //    9   18:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //   10   21:invokevirtual   #41  <Method String StringBuilder.toString()>
        //   11   24:invokestatic    #54  <Method void b.a(String)>
        //   12   27:aload_0         
        //   13   28:getfield        #21  <Field MediationBannerListener c>
        //   14   31:aload_0         
        //   15   32:getfield        #16  <Field CustomEventAdapter a>
        //   16   35:invokeinterface #81  <Method void MediationBannerListener.onLeaveApplication(MediationBannerAdapter)>
        //   17   40:aload_0         
        //   18   41:monitorexit     
        //   19   42:return          
        // finally
        //   20   43:astore_1        
        //   21   44:aload_0         
        //   22   45:monitorexit     
        //   23   46:aload_1         
        //   24   47:athrow          
        }

        public void onPresentScreen()
        {
        //    0    0:new             #24  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #25  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #47  <Method String b()>
        //    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #84  <String " called onPresentScreen().">
        //    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #41  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #54  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #21  <Field MediationBannerListener c>
        //   12   29:aload_0         
        //   13   30:getfield        #16  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #86  <Method void MediationBannerListener.onPresentScreen(MediationBannerAdapter)>
        //   15   38:return          
        }

        public void onReceivedAd(View view)
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 45 handler(s) 48
        //    2    2:new             #24  <Class StringBuilder>
        //    3    5:dup             
        //    4    6:invokespecial   #25  <Method void StringBuilder()>
        //    5    9:aload_0         
        //    6   10:invokespecial   #47  <Method String b()>
        //    7   13:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //    8   16:ldc1            #90  <String " called onReceivedAd.">
        //    9   18:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
        //   10   21:invokevirtual   #41  <Method String StringBuilder.toString()>
        //   11   24:invokestatic    #54  <Method void b.a(String)>
        //   12   27:aload_0         
        //   13   28:aload_1         
        //   14   29:putfield        #44  <Field View b>
        //   15   32:aload_0         
        //   16   33:getfield        #21  <Field MediationBannerListener c>
        //   17   36:aload_0         
        //   18   37:getfield        #16  <Field CustomEventAdapter a>
        //   19   40:invokeinterface #92  <Method void MediationBannerListener.onReceivedAd(MediationBannerAdapter)>
        //   20   45:aload_0         
        //   21   46:monitorexit     
        //   22   47:return          
        // finally
        //   23   48:astore_2        
        //   24   49:aload_0         
        //   25   50:monitorexit     
        //   26   51:aload_2         
        //   27   52:athrow          
        }

        final CustomEventAdapter a;
        private View b;
        private final MediationBannerListener c;
    }

    private class b
        implements CustomEventInterstitialListener
    {

        public b(CustomEventAdapter customeventadapter, MediationInterstitialListener mediationinterstitiallistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field CustomEventAdapter a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field MediationInterstitialListener b>
        //    8   14:return          
        }

        private String a()
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #23  <Method void StringBuilder()>
        //    3    7:ldc1            #25  <String "Interstitial custom event labeled '">
        //    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_0         
        //    6   13:getfield        #14  <Field CustomEventAdapter a>
        //    7   16:invokestatic    #34  <Method String com.google.ads.mediation.customevent.CustomEventAdapter.a(CustomEventAdapter)>
        //    8   19:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:ldc1            #36  <String "'">
        //   10   24:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:invokevirtual   #39  <Method String StringBuilder.toString()>
        //   12   30:areturn         
        }

        public void onDismissScreen()
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #23  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #42  <Method String a()>
        //    5   11:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #44  <String " called onDismissScreen().">
        //    7   16:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #39  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #49  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #19  <Field MediationInterstitialListener b>
        //   12   29:aload_0         
        //   13   30:getfield        #14  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #54  <Method void MediationInterstitialListener.onDismissScreen(MediationInterstitialAdapter)>
        //   15   38:return          
        }

        public void onFailedToReceiveAd()
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #23  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #42  <Method String a()>
        //    5   11:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #57  <String " called onFailedToReceiveAd().">
        //    7   16:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #39  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #49  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #19  <Field MediationInterstitialListener b>
        //   12   29:aload_0         
        //   13   30:getfield        #14  <Field CustomEventAdapter a>
        //   14   33:getstatic       #63  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.NO_FILL>
        //   15   36:invokeinterface #66  <Method void MediationInterstitialListener.onFailedToReceiveAd(MediationInterstitialAdapter, com.google.ads.AdRequest$ErrorCode)>
        //   16   41:return          
        }

        public void onLeaveApplication()
        {
        //    0    0:aload_0         
        //    1    1:monitorenter    
        // try 2 40 handler(s) 43
        //    2    2:new             #22  <Class StringBuilder>
        //    3    5:dup             
        //    4    6:invokespecial   #23  <Method void StringBuilder()>
        //    5    9:aload_0         
        //    6   10:invokespecial   #42  <Method String a()>
        //    7   13:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    8   16:ldc1            #69  <String " called onLeaveApplication().">
        //    9   18:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //   10   21:invokevirtual   #39  <Method String StringBuilder.toString()>
        //   11   24:invokestatic    #49  <Method void b.a(String)>
        //   12   27:aload_0         
        //   13   28:getfield        #19  <Field MediationInterstitialListener b>
        //   14   31:aload_0         
        //   15   32:getfield        #14  <Field CustomEventAdapter a>
        //   16   35:invokeinterface #71  <Method void MediationInterstitialListener.onLeaveApplication(MediationInterstitialAdapter)>
        //   17   40:aload_0         
        //   18   41:monitorexit     
        //   19   42:return          
        // finally
        //   20   43:astore_1        
        //   21   44:aload_0         
        //   22   45:monitorexit     
        //   23   46:aload_1         
        //   24   47:athrow          
        }

        public void onPresentScreen()
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #23  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #42  <Method String a()>
        //    5   11:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #74  <String " called onPresentScreen().">
        //    7   16:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #39  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #49  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #19  <Field MediationInterstitialListener b>
        //   12   29:aload_0         
        //   13   30:getfield        #14  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #76  <Method void MediationInterstitialListener.onPresentScreen(MediationInterstitialAdapter)>
        //   15   38:return          
        }

        public void onReceivedAd()
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #23  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokespecial   #42  <Method String a()>
        //    5   11:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    6   14:ldc1            #79  <String " called onReceivedAd.">
        //    7   16:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:invokevirtual   #39  <Method String StringBuilder.toString()>
        //    9   22:invokestatic    #49  <Method void b.a(String)>
        //   10   25:aload_0         
        //   11   26:getfield        #19  <Field MediationInterstitialListener b>
        //   12   29:aload_0         
        //   13   30:getfield        #14  <Field CustomEventAdapter a>
        //   14   33:invokeinterface #81  <Method void MediationInterstitialListener.onReceivedAd(MediationInterstitialAdapter)>
        //   15   38:return          
        }

        final CustomEventAdapter a;
        private final MediationInterstitialListener b;
    }


    public CustomEventAdapter()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #23  <Field CustomEventBanner b>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #25  <Field CustomEventAdapter$a c>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #27  <Field CustomEventInterstitial d>
    //   11   19:return          
    }

    private Object a(String s, Class class1, String s1)
    {
    // try 0 7 handler(s) 10 44 82 117 152
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokestatic    #43  <Method Object g.a(String, Class)>
    //    3    5:astore          9
    //    4    7:aload           9
    //    5    9:areturn         
    // catch ClassNotFoundException
    //    6   10:astore          8
    //    7   12:aload_0         
    //    8   13:new             #45  <Class StringBuilder>
    //    9   16:dup             
    //   10   17:invokespecial   #46  <Method void StringBuilder()>
    //   11   20:ldc1            #48  <String "Make sure you created a visible class named: ">
    //   12   22:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   13   25:aload_1         
    //   14   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   15   29:ldc1            #54  <String ". ">
    //   16   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   17   34:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   18   37:aload           8
    //   19   39:invokespecial   #61  <Method void a(String, Throwable)>
    //   20   42:aconst_null     
    //   21   43:areturn         
    // catch ClassCastException
    //   22   44:astore          7
    //   23   46:aload_0         
    //   24   47:new             #45  <Class StringBuilder>
    //   25   50:dup             
    //   26   51:invokespecial   #46  <Method void StringBuilder()>
    //   27   54:ldc1            #63  <String "Make sure your custom event implements the ">
    //   28   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   29   59:aload_2         
    //   30   60:invokevirtual   #68  <Method String Class.getName()>
    //   31   63:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   32   66:ldc1            #70  <String " interface.">
    //   33   68:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   34   71:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   35   74:aload           7
    //   36   76:invokespecial   #61  <Method void a(String, Throwable)>
    //   37   79:goto            42
    // catch IllegalAccessException
    //   38   82:astore          6
    //   39   84:aload_0         
    //   40   85:new             #45  <Class StringBuilder>
    //   41   88:dup             
    //   42   89:invokespecial   #46  <Method void StringBuilder()>
    //   43   92:ldc1            #72  <String "Make sure the default constructor for class ">
    //   44   94:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   45   97:aload_1         
    //   46   98:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   47  101:ldc1            #74  <String " is visible. ">
    //   48  103:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   49  106:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   50  109:aload           6
    //   51  111:invokespecial   #61  <Method void a(String, Throwable)>
    //   52  114:goto            42
    // catch InstantiationException
    //   53  117:astore          5
    //   54  119:aload_0         
    //   55  120:new             #45  <Class StringBuilder>
    //   56  123:dup             
    //   57  124:invokespecial   #46  <Method void StringBuilder()>
    //   58  127:ldc1            #76  <String "Make sure the name ">
    //   59  129:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   60  132:aload_1         
    //   61  133:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   62  136:ldc1            #78  <String " does not denote an abstract class or an interface.">
    //   63  138:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   64  141:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   65  144:aload           5
    //   66  146:invokespecial   #61  <Method void a(String, Throwable)>
    //   67  149:goto            42
    // catch Throwable
    //   68  152:astore          4
    //   69  154:aload_0         
    //   70  155:ldc1            #80  <String "">
    //   71  157:aload           4
    //   72  159:invokespecial   #61  <Method void a(String, Throwable)>
    //   73  162:goto            42
    }

    static String a(CustomEventAdapter customeventadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field String a>
    //    2    4:areturn         
    }

    private void a(String s, Throwable throwable)
    {
    //    0    0:new             #45  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #46  <Method void StringBuilder()>
    //    3    7:ldc1            #85  <String "Error during processing of custom event with label: '">
    //    4    9:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //    5   12:aload_0         
    //    6   13:getfield        #83  <Field String a>
    //    7   16:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //    8   19:ldc1            #87  <String "'. Skipping custom event. ">
    //    9   21:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   10   24:aload_1         
    //   11   25:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   12   28:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   13   31:aload_2         
    //   14   32:invokestatic    #91  <Method void b.b(String, Throwable)>
    //   15   35:return          
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field CustomEventBanner b>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #23  <Field CustomEventBanner b>
    //    5   11:invokeinterface #96  <Method void CustomEventBanner.destroy()>
    //    6   16:aload_0         
    //    7   17:getfield        #27  <Field CustomEventInterstitial d>
    //    8   20:ifnull          32
    //    9   23:aload_0         
    //   10   24:getfield        #27  <Field CustomEventInterstitial d>
    //   11   27:invokeinterface #99  <Method void CustomEventInterstitial.destroy()>
    //   12   32:return          
    }

    public Class getAdditionalParametersType()
    {
    //    0    0:ldc1            #103 <Class CustomEventExtras>
    //    1    2:areturn         
    }

    public View getBannerView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field CustomEventAdapter$a c>
    //    2    4:invokestatic    #110 <Method void a.b(Object)>
    //    3    7:aload_0         
    //    4    8:getfield        #25  <Field CustomEventAdapter$a c>
    //    5   11:invokevirtual   #114 <Method View com.google.ads.mediation.customevent.CustomEventAdapter$a.a()>
    //    6   14:areturn         
    }

    public Class getServerParametersType()
    {
    //    0    0:ldc1            #117 <Class CustomEventServerParameters>
    //    1    2:areturn         
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:checkcast       #117 <Class CustomEventServerParameters>
    //    5    7:aload           4
    //    6    9:aload           5
    //    7   11:aload           6
    //    8   13:checkcast       #103 <Class CustomEventExtras>
    //    9   16:invokevirtual   #122 <Method void requestBannerAd(MediationBannerListener, Activity, CustomEventServerParameters, AdSize, MediationAdRequest, CustomEventExtras)>
    //   10   19:return          
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, CustomEventServerParameters customeventserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field String a>
    //    2    4:invokestatic    #124 <Method void a.a(Object)>
    //    3    7:aload_0         
    //    4    8:aload_3         
    //    5    9:getfield        #127 <Field String CustomEventServerParameters.label>
    //    6   12:putfield        #83  <Field String a>
    //    7   15:aload_3         
    //    8   16:getfield        #130 <Field String CustomEventServerParameters.className>
    //    9   19:astore          7
    //   10   21:aload_3         
    //   11   22:getfield        #133 <Field String CustomEventServerParameters.parameter>
    //   12   25:astore          8
    //   13   27:aload_0         
    //   14   28:aload_0         
    //   15   29:aload           7
    //   16   31:ldc1            #94  <Class CustomEventBanner>
    //   17   33:aload_0         
    //   18   34:getfield        #83  <Field String a>
    //   19   37:invokespecial   #135 <Method Object a(String, Class, String)>
    //   20   40:checkcast       #94  <Class CustomEventBanner>
    //   21   43:putfield        #23  <Field CustomEventBanner b>
    //   22   46:aload_0         
    //   23   47:getfield        #23  <Field CustomEventBanner b>
    //   24   50:ifnonnull       64
    //   25   53:aload_1         
    //   26   54:aload_0         
    //   27   55:getstatic       #141 <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR>
    //   28   58:invokeinterface #147 <Method void MediationBannerListener.onFailedToReceiveAd(MediationBannerAdapter, com.google.ads.AdRequest$ErrorCode)>
    //   29   63:return          
    //   30   64:aload_0         
    //   31   65:getfield        #25  <Field CustomEventAdapter$a c>
    //   32   68:invokestatic    #124 <Method void a.a(Object)>
    //   33   71:aload_0         
    //   34   72:new             #112 <Class CustomEventAdapter$a>
    //   35   75:dup             
    //   36   76:aload_0         
    //   37   77:aload_1         
    //   38   78:invokespecial   #150 <Method void CustomEventAdapter$a(CustomEventAdapter, MediationBannerListener)>
    //   39   81:putfield        #25  <Field CustomEventAdapter$a c>
    // try 84 102 handler(s) 131
    //   40   84:aload_0         
    //   41   85:getfield        #23  <Field CustomEventBanner b>
    //   42   88:astore          10
    //   43   90:aload_0         
    //   44   91:getfield        #25  <Field CustomEventAdapter$a c>
    //   45   94:astore          11
    //   46   96:aload_0         
    //   47   97:getfield        #83  <Field String a>
    //   48  100:astore          12
    //   49  102:aload           6
    //   50  104:ifnonnull       152
    //   51  107:aconst_null     
    //   52  108:astore          14
    // try 110 130 handler(s) 131
    //   53  110:aload           10
    //   54  112:aload           11
    //   55  114:aload_2         
    //   56  115:aload           12
    //   57  117:aload           8
    //   58  119:aload           4
    //   59  121:aload           5
    //   60  123:aload           14
    //   61  125:invokeinterface #153 <Method void CustomEventBanner.requestBannerAd(CustomEventBannerListener, Activity, String, String, AdSize, MediationAdRequest, Object)>
    //   62  130:return          
    // catch Throwable Throwable Throwable
    //   63  131:astore          9
    //   64  133:aload_0         
    //   65  134:ldc1            #80  <String "">
    //   66  136:aload           9
    //   67  138:invokespecial   #61  <Method void a(String, Throwable)>
    //   68  141:aload_1         
    //   69  142:aload_0         
    //   70  143:getstatic       #141 <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR>
    //   71  146:invokeinterface #147 <Method void MediationBannerListener.onFailedToReceiveAd(MediationBannerAdapter, com.google.ads.AdRequest$ErrorCode)>
    //   72  151:return          
    // try 152 163 handler(s) 131
    //   73  152:aload           6
    //   74  154:aload_0         
    //   75  155:getfield        #83  <Field String a>
    //   76  158:invokevirtual   #157 <Method Object CustomEventExtras.getExtra(String)>
    //   77  161:astore          13
    //   78  163:aload           13
    //   79  165:astore          14
    //   80  167:goto            110
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:checkcast       #117 <Class CustomEventServerParameters>
    //    5    7:aload           4
    //    6    9:aload           5
    //    7   11:checkcast       #103 <Class CustomEventExtras>
    //    8   14:invokevirtual   #162 <Method void requestInterstitialAd(MediationInterstitialListener, Activity, CustomEventServerParameters, MediationAdRequest, CustomEventExtras)>
    //    9   17:return          
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field String a>
    //    2    4:invokestatic    #124 <Method void a.a(Object)>
    //    3    7:aload_0         
    //    4    8:aload_3         
    //    5    9:getfield        #127 <Field String CustomEventServerParameters.label>
    //    6   12:putfield        #83  <Field String a>
    //    7   15:aload_3         
    //    8   16:getfield        #130 <Field String CustomEventServerParameters.className>
    //    9   19:astore          6
    //   10   21:aload_3         
    //   11   22:getfield        #133 <Field String CustomEventServerParameters.parameter>
    //   12   25:astore          7
    //   13   27:aload_0         
    //   14   28:aload_0         
    //   15   29:aload           6
    //   16   31:ldc1            #98  <Class CustomEventInterstitial>
    //   17   33:aload_0         
    //   18   34:getfield        #83  <Field String a>
    //   19   37:invokespecial   #135 <Method Object a(String, Class, String)>
    //   20   40:checkcast       #98  <Class CustomEventInterstitial>
    //   21   43:putfield        #27  <Field CustomEventInterstitial d>
    //   22   46:aload_0         
    //   23   47:getfield        #27  <Field CustomEventInterstitial d>
    //   24   50:ifnonnull       64
    //   25   53:aload_1         
    //   26   54:aload_0         
    //   27   55:getstatic       #141 <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR>
    //   28   58:invokeinterface #167 <Method void MediationInterstitialListener.onFailedToReceiveAd(MediationInterstitialAdapter, com.google.ads.AdRequest$ErrorCode)>
    //   29   63:return          
    // try 64 87 handler(s) 114
    //   30   64:aload_0         
    //   31   65:getfield        #27  <Field CustomEventInterstitial d>
    //   32   68:astore          9
    //   33   70:new             #169 <Class CustomEventAdapter$b>
    //   34   73:dup             
    //   35   74:aload_0         
    //   36   75:aload_1         
    //   37   76:invokespecial   #172 <Method void CustomEventAdapter$b(CustomEventAdapter, MediationInterstitialListener)>
    //   38   79:astore          10
    //   39   81:aload_0         
    //   40   82:getfield        #83  <Field String a>
    //   41   85:astore          11
    //   42   87:aload           5
    //   43   89:ifnonnull       135
    //   44   92:aconst_null     
    //   45   93:astore          13
    // try 95 113 handler(s) 114
    //   46   95:aload           9
    //   47   97:aload           10
    //   48   99:aload_2         
    //   49  100:aload           11
    //   50  102:aload           7
    //   51  104:aload           4
    //   52  106:aload           13
    //   53  108:invokeinterface #175 <Method void CustomEventInterstitial.requestInterstitialAd(CustomEventInterstitialListener, Activity, String, String, MediationAdRequest, Object)>
    //   54  113:return          
    // catch Throwable Throwable Throwable
    //   55  114:astore          8
    //   56  116:aload_0         
    //   57  117:ldc1            #80  <String "">
    //   58  119:aload           8
    //   59  121:invokespecial   #61  <Method void a(String, Throwable)>
    //   60  124:aload_1         
    //   61  125:aload_0         
    //   62  126:getstatic       #141 <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR>
    //   63  129:invokeinterface #167 <Method void MediationInterstitialListener.onFailedToReceiveAd(MediationInterstitialAdapter, com.google.ads.AdRequest$ErrorCode)>
    //   64  134:return          
    // try 135 146 handler(s) 114
    //   65  135:aload           5
    //   66  137:aload_0         
    //   67  138:getfield        #83  <Field String a>
    //   68  141:invokevirtual   #157 <Method Object CustomEventExtras.getExtra(String)>
    //   69  144:astore          12
    //   70  146:aload           12
    //   71  148:astore          13
    //   72  150:goto            95
    }

    public void showInterstitial()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field CustomEventInterstitial d>
    //    2    4:invokestatic    #110 <Method void a.b(Object)>
    // try 7 16 handler(s) 17
    //    3    7:aload_0         
    //    4    8:getfield        #27  <Field CustomEventInterstitial d>
    //    5   11:invokeinterface #178 <Method void CustomEventInterstitial.showInterstitial()>
    //    6   16:return          
    // catch Throwable
    //    7   17:astore_1        
    //    8   18:new             #45  <Class StringBuilder>
    //    9   21:dup             
    //   10   22:invokespecial   #46  <Method void StringBuilder()>
    //   11   25:ldc1            #180 <String "Exception when showing custom event labeled '">
    //   12   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   13   30:aload_0         
    //   14   31:getfield        #83  <Field String a>
    //   15   34:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   16   37:ldc1            #182 <String "'.">
    //   17   39:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
    //   18   42:invokevirtual   #58  <Method String StringBuilder.toString()>
    //   19   45:aload_1         
    //   20   46:invokestatic    #91  <Method void b.b(String, Throwable)>
    //   21   49:return          
    }

    private String a;
    private CustomEventBanner b;
    private a c;
    private CustomEventInterstitial d;
}
